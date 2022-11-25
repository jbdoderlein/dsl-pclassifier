import json
import numpy as np
import pandas as pd
from sklearn.model_selection import train_test_split
from sklearn.tree import DecisionTreeClassifier
from sklearn.metrics import accuracy_score, confusion_matrix, f1_score, recall_score
from sklearn.ensemble import RandomForestClassifier
from sklearn.svm import SVC
from sklearn.neural_network import MLPClassifier

# Create a classifier named Alligator using RandomForest
# The features are "gender","size" and the target is lake
# Train the classifier named Alligator using the csv file alligator.csv
# The train-test split must be "accuracy","f1","recall"

# Create a classifier named Alligator using RandomForest
Alligator = RandomForestClassifier()

# The features are "gender","size" and the target is lake
features = ["gender","size"]
target = ["lake"]

# Train the classifier named Alligator using the csv file alligator.csv
Alligator.fit(alligator[features], alligator[target])

# The train-test split must be "accuracy","f1","recall"
accuracy = accuracy_score(alligator[target], Alligator.predict(alligator[features]))
f1 = f1_score(alligator[target], Alligator.predict(alligator[features]))
recall = recall_score(alligator[target], Alligator.predict(alligator[features]))

# Print the accuracy, f1 and recall
print("Accuracy:", accuracy)
print("F1:", f1)
print("Recall:", recall)