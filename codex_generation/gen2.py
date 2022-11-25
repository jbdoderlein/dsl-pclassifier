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

class Alligator:
    def __init__(self):
        self.classifier = RandomForestClassifier()

    def train(self, X, y):
        self.classifier.fit(X, y)

    def predict(self, X):
        return self.classifier.predict(X)

    def score(self, X, y):
        return self.classifier.score(X, y)

    def confusion_matrix(self, X, y):
        return confusion_matrix(y, self.predict(X))

    def f1_score(self, X, y):
        return f1_score(y, self.predict(X), average='weighted')

    def recall_score(self, X, y):
        return recall_score(y, self.predict(X), average='weighted')

    def accuracy_score(self, X, y):
        return accuracy_score(y, self.predict(X))


def train_test_split(X, y, test_size=0.2):
    return train_test_split(X, y, test_size=test_size)


def load_data(path):
    data = pd.read_csv(path)
    X = data[['gender', 'size']]
    y = data['lake']
    return X, y


def main():
    # Load the training data from the alligator.csv file using the load_data function
    X, y = load_data('alligator.csv')

    # Split the training data into a training set and a testing set using the train_test_split function with test size of 0.2 and random state of 1
    X_train, X_test, y_train, y_test = train_test_split(X, y)

    # Create an instance of the Alligator classifier named alligator using RandomForestClassifier with random state of 1 and max depth of 2
    alligator = Alligator()

    # Train the classifier using the training data
    alligator.train(X_train, y_train)

    # Print the accuracy score of the classifier on the test data
    print('Accuracy Score:', alligator.accuracy_score(X_test, y_test))

    # Print the confusion matrix of the classifier on the test data
    print('Confusion Matrix:', alligator.confusion_matrix(X_test, y_test))

    # Print the f1 score of the classifier on the test data
    print('F1 Score:', alligator.f1_score(X_test, y_test))

    # Print the recall score of the classifier on the test data
    print('Recall Score:', alligator.recall_score(X_test, y_test))


if __name__ == '__main__':
    main()