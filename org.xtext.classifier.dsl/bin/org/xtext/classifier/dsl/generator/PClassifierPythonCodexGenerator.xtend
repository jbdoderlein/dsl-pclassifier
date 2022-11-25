package org.xtext.classifier.dsl.generator

import org.eclipse.emf.ecore.resource.Resource

import org.xtext.classifier.dsl.pClassifier.Classifier
import org.xtext.classifier.dsl.pClassifier.Train
import org.xtext.classifier.dsl.pClassifier.Execute
import org.xtext.classifier.dsl.pClassifier.Load
import org.xtext.classifier.dsl.pClassifier.Save
import org.xtext.classifier.dsl.generator.CodexResponse
import org.xtext.classifier.dsl.pClassifier.FeatureList
import org.xtext.classifier.dsl.pClassifier.EvaluationList

class PClassifierPythonCodexGenerator {
	def doGenerate(Resource resource) {
		var codexResponse = new CodexResponse()
		var base = '''
		import json
		import numpy as np
		import pandas as pd
		from sklearn.model_selection import train_test_split
		from sklearn.tree import DecisionTreeClassifier
		from sklearn.metrics import accuracy_score, confusion_matrix, f1_score, recall_score
		from sklearn.ensemble import RandomForestClassifier
		from sklearn.svm import SVC
		from sklearn.neural_network import MLPClassifier
		
		'''
		
		for(e : resource.allContents.toIterable()) {
			switch (e) {
				case (e instanceof Classifier): {
					base += compileClassifier(e as Classifier)
				}
				case (e instanceof Train): {
					base += compileTrain(e as Train)
				}
				case (e instanceof Execute): {
					base += compileExecute(e as Execute)
				}
				case (e instanceof Load): {
					base += compileLoad(e as Load)
				}
				case (e instanceof Save): {
					base += compileSave(e as Save)
				}
			}
		}
		var result = codexResponse.generate(base)
		return result.toString()
	}
	
	private def compileClassifier(Classifier classifier)'''
		# Create a classifier named «classifier.name» using «classifier.model.literal»
		# The features are «handleFeatures(classifier.features)» and the target is «classifier.target»
	'''
	
	private def handleFeatures(FeatureList features){
		return "\"" + features.vals.join("\",\"") + "\""
	}
	
	private def compileTrain(Train train)'''
		# Train the classifier named «train.name» using the csv file «train.dataset»
		# The train-test split must be «handleEvaluationList(train.evaluations)»
	'''
	
	private def handleEvaluationList(EvaluationList eval_list){
		return "\"" + eval_list.vals.join("\",\"") + "\""
	}
	
	private def compileExecute(Execute execute)'''
		# Using th classifier named «execute.name», open «execute.input», execute the classifier on the csv
		# Save the results in «execute.output»
	'''
	
	private def compileSave(Save save)'''
		# Save the classifier named «save.name» in «save.file»
	'''
	
	private def compileLoad(Load load)'''
		# Load a classifier from «load.file» and name it «load.name»
	'''
}