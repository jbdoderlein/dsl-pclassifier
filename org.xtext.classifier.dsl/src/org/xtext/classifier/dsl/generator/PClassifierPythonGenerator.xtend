package org.xtext.classifier.dsl.generator

import org.eclipse.emf.ecore.resource.Resource

import org.xtext.classifier.dsl.pClassifier.Classifier
import org.xtext.classifier.dsl.pClassifier.Train
import org.xtext.classifier.dsl.pClassifier.Execute
import org.xtext.classifier.dsl.pClassifier.Load
import org.xtext.classifier.dsl.pClassifier.Save
import org.xtext.classifier.dsl.pClassifier.FeatureList
import org.xtext.classifier.dsl.pClassifier.MLModel
import org.xtext.classifier.dsl.pClassifier.EvaluationList
import java.io.File
import java.io.FileWriter
import java.io.BufferedReader
import java.io.InputStreamReader

class PClassifierPythonGenerator{
	def doGenerate(Resource resource) {
		var result = '''
		import json
		import numpy as np
		import pandas as pd
		from sklearn.model_selection import train_test_split
		from sklearn.tree import DecisionTreeClassifier
		from sklearn.metrics import accuracy_score, confusion_matrix, f1_score, recall_score
		from sklearn.ensemble import RandomForestClassifier
		from sklearn.svm import SVC
		from sklearn.neural_network import MLPClassifier
		import pickle
		
		models = {}
		
		'''
		for(e : resource.allContents.toIterable()) {
			switch (e) {
				case (e instanceof Classifier): {
					result += generateClassifier(e as Classifier)
					result += "\n"
				}
				case (e instanceof Train): {
					result += generateTrain(e as Train)
					result += "\n"
				}
				case (e instanceof Execute): {
					result += generateExecute(e as Execute)
					result += "\n"
				}
				case (e instanceof Load): {
					result += generateLoad(e as Load)
					result += "\n"
				}
				case (e instanceof Save): {
					result += generateSave(e as Save)
					result += "\n"
				}
			}
		}
		return result
	}
	
	private def generateClassifier(Classifier classifier) '''
		class «classifier.name»:
			features = [«handleFeatures(classifier.features)»]
			target = "«classifier.target»"
			
			def __init__(self):
				«handleMLModel(classifier.model)»
			
			def train(self, data, split, evaluations):
				train, test = train_test_split(data, test_size=split)
				self.model.fit(train[self.features], train[self.target])
				self.evaluate(test, evaluations)
				
			def evaluate(self, test, evaluations):
				results_eval = {}
				for evaluation in evaluations:
					if evaluation == 'accuracy':
						results_eval[evaluation] = accuracy_score(test[self.target], self.model.predict(test[self.features]))
					elif evaluation == 'f1':
						results_eval[evaluation] = f1_score(test[self.target], self.model.predict(test[self.features]), average='micro',labels=np.unique(self.model.predict(test[self.features])))
					elif evaluation == 'recall':
						results_eval[evaluation] = recall_score(test[self.target], self.model.predict(test[self.features]), average='micro')
				print(json.dumps(results_eval))
			
			def execute(self, data, output):
				with open(output, 'w') as f:
					f.write(self.model.predict(data[self.features]).to_string(index=False))
		
		models["«classifier.name»"] = «classifier.name»()
	'''
	
	private def generateTrain(Train train) '''
		df = pd.read_csv("«train.dataset»")
		models["«train.name»"].train(data=df, split=«train.split», evaluations=[«handleEvaluationList(train.evaluations)»])
	'''
	
	private def generateExecute(Execute exec) '''
		df = pd.read_csv("«exec.input»")
		models["«exec.name»"].execute(df, "«exec.output»")
	'''
	
	private def generateLoad(Load load) '''
		print("Not implemented")
		#with open("«load.file»", "r") as f:
		#	models["«load.name»"] = pickle.load(f)
	'''
	
	private def generateSave(Save save) '''
		print("Not implemented")
		#with open("«save.file»", "wb") as f:
		#	pickle.dump(models["«save.name»"], f)
		exit(0)
	'''
	
	private def handleFeatures(FeatureList features){
		return "\"" + features.vals.join("\",\"") + "\""
	}
	
	private def handleEvaluationList(EvaluationList eval_list){
		return "\"" + eval_list.vals.join("\",\"") + "\""
	}
	
	private def handleMLModel(MLModel mlmodel){
		var result = "self.model = "
		switch (mlmodel.literal){
			case "DecisionTree":{
				result += "DecisionTreeClassifier()"
			}
			case "RandomForest":{
				result += "RandomForestClassifier()"
			}
			case "SVC":{
				result += "SVC()"
			}
			case "MLPClassifier":{
				result += "MLPClassifier()"
			}
		}
		return result
	}
	
	def doExecute(Resource ressource){
		var result = doGenerate(ressource)
    	var file = File.createTempFile("temp", "py");
		file.deleteOnExit();
		var myWriter = new FileWriter("temp.py");
     	myWriter.write(result);
     	myWriter.close();
		
		var builder = new ProcessBuilder("python",  "-c", "import os;print(os.getcwd())")
		//builder.directory(new File(""))
		var process = builder.start()
	    var output = new BufferedReader(new InputStreamReader(process.getInputStream()))
	    var sbuilder = new StringBuilder()
		var line = ""
		while ( (line = output.readLine()) != null) {
		   sbuilder.append(line);
		   sbuilder.append(System.getProperty("line.separator"));
		}
		return sbuilder.toString();
	}
	
	def doExecute(Resource ressource, String path){
		var result = doGenerate(ressource)
    	var file = File.createTempFile("temp", "py");
		file.deleteOnExit();
		var myWriter = new FileWriter("temp.py");
     	myWriter.write(result);
     	myWriter.close();
		
		var builder = new ProcessBuilder("python",  "-c", "import os;print(os.getcwd())")
		builder.directory(new File(path))
		var process = builder.start()
	    var output = new BufferedReader(new InputStreamReader(process.getInputStream()))
	    var sbuilder = new StringBuilder()
		var line = ""
		while ( (line = output.readLine()) != null) {
		   sbuilder.append(line);
		   sbuilder.append(System.getProperty("line.separator"));
		}
		return sbuilder.toString();
	}
}
