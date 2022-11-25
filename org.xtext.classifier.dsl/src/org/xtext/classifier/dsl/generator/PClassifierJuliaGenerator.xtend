package org.xtext.classifier.dsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.xtext.classifier.dsl.pClassifier.Classifier
import org.xtext.classifier.dsl.pClassifier.Train
import org.xtext.classifier.dsl.pClassifier.Execute
import org.xtext.classifier.dsl.pClassifier.Load
import org.xtext.classifier.dsl.pClassifier.Save
import org.xtext.classifier.dsl.pClassifier.FeatureList
import org.xtext.classifier.dsl.pClassifier.EvaluationList
import org.xtext.classifier.dsl.pClassifier.MLModel
import org.xtext.classifier.dsl.pClassifier.Evaluation

import java.io.File
import java.io.FileWriter
import java.io.BufferedReader
import java.io.InputStreamReader

class PClassifierJuliaGenerator {
	def doGenerate(Resource resource) {
		var result = '''
		using DataFrames
		using CSV
		using JSON
		using ScikitLearn
		using ScikitLearn.CrossValidation: train_test_split
		@sk_import tree: DecisionTreeClassifier
		@sk_import ensemble: RandomForestClassifier
		@sk_import svm: SVC
		@sk_import neural_network: MLPClassifier
		@sk_import metrics:accuracy_score
		@sk_import metrics:f1_score
		@sk_import metrics:recall_score
		
		Models = Dict()
		Classifiers = Dict()
		
		struct Classifier
			features::Array{String}
			target::String
			model::String
		end
		
		function train!(classifier::Classifier, df::DataFrame, model::Any, scores::Any)
			X = Array(df[:, classifier.features])
			y = Array(df[:, classifier.target])
			X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=.2)
			fit!(model, X_train, y_train)
			results = Dict()
			if "accuracy" in scores
				results["accuracy"] = accuracy_score(y_test, predict(model, X_test))
			end
			if "f1" in scores
				results["f1"] = f1_score(y_test, predict(model, X_test), average="micro")
			end
			if "recall" in scores
				results["recall"] = recall_score(y_test, predict(model, X_test), average="micro")
			end
			return JSON.json(results)
		end
		
		function predict!(classifier::Classifier, model::Any, df::DataFrame)
			X = Array(df[:, features])
			y = predict(model, X)
			return y
		end
		
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
		Classifiers["«classifier.name»"] = Classifier([«handleFeatures(classifier.features)»], "«classifier.target»", "«handleMLModel(classifier.model)»")
		Models["«classifier.name»"] = «handleMLModel(classifier.model)»
	'''
	
	private def generateTrain(Train train) '''
		df = DataFrame(CSV.File("«train.dataset»"))
		println(train!(Classifiers["«train.name»"], df, Models["«train.name»"], [«handleEvaluationList(train.evaluations)»]))
	'''
	
	private def generateExecute(Execute exec) '''
		df = DataFrame(CSV.File("«exec.input»"))
		predict!(Classifiers["«exec.name»"], df)
	'''
	
	private def generateLoad(Load load) '''
		println("Not implemented")
		# with open("«load.file»", "r") as f:
		# 	models["«load.name»"] = pickle.load(f)
	'''
	
	private def generateSave(Save save) '''
		println("Not implemented")
		# with open("«save.file»", "wb") as f:
		# 	pickle.dump(models["«save.name»"], f)
	'''
	
	private def handleFeatures(FeatureList features){
		return "\"" + features.vals.join("\",\"") + "\""
	}
	
	private def handleEvaluationList(EvaluationList eval_list){
		return "\"" + eval_list.vals.join("\",\"") + "\""
	}
	
	private def handleMLModel(MLModel mlmodel){
		var result = ""
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
    	var file = File.createTempFile("temp", "jl");
		file.deleteOnExit();
		var myWriter = new FileWriter("temp.jl");
     	myWriter.write(result);
     	myWriter.close();
		
		var builder = new ProcessBuilder("julia",  "temp.jl")
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