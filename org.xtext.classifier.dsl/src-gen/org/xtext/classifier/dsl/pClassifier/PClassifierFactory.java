/**
 * generated by Xtext 2.26.0
 */
package org.xtext.classifier.dsl.pClassifier;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.classifier.dsl.pClassifier.PClassifierPackage
 * @generated
 */
public interface PClassifierFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PClassifierFactory eINSTANCE = org.xtext.classifier.dsl.pClassifier.impl.PClassifierFactoryImpl.init();

  /**
   * Returns a new object of class '<em>PClassfier</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>PClassfier</em>'.
   * @generated
   */
  PClassfier createPClassfier();

  /**
   * Returns a new object of class '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statement</em>'.
   * @generated
   */
  Statement createStatement();

  /**
   * Returns a new object of class '<em>Classifier</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Classifier</em>'.
   * @generated
   */
  Classifier createClassifier();

  /**
   * Returns a new object of class '<em>Train</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Train</em>'.
   * @generated
   */
  Train createTrain();

  /**
   * Returns a new object of class '<em>Execute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Execute</em>'.
   * @generated
   */
  Execute createExecute();

  /**
   * Returns a new object of class '<em>Load</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Load</em>'.
   * @generated
   */
  Load createLoad();

  /**
   * Returns a new object of class '<em>Save</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Save</em>'.
   * @generated
   */
  Save createSave();

  /**
   * Returns a new object of class '<em>Feature List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature List</em>'.
   * @generated
   */
  FeatureList createFeatureList();

  /**
   * Returns a new object of class '<em>Evaluation List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Evaluation List</em>'.
   * @generated
   */
  EvaluationList createEvaluationList();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  PClassifierPackage getPClassifierPackage();

} //PClassifierFactory
