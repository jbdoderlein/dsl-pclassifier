/**
 * generated by Xtext 2.26.0
 */
package org.xtext.classifier.dsl.pClassifier;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Train</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.classifier.dsl.pClassifier.Train#getDataset <em>Dataset</em>}</li>
 *   <li>{@link org.xtext.classifier.dsl.pClassifier.Train#getSplit <em>Split</em>}</li>
 *   <li>{@link org.xtext.classifier.dsl.pClassifier.Train#getEvaluations <em>Evaluations</em>}</li>
 * </ul>
 *
 * @see org.xtext.classifier.dsl.pClassifier.PClassifierPackage#getTrain()
 * @model
 * @generated
 */
public interface Train extends Statement
{
  /**
   * Returns the value of the '<em><b>Dataset</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dataset</em>' attribute.
   * @see #setDataset(String)
   * @see org.xtext.classifier.dsl.pClassifier.PClassifierPackage#getTrain_Dataset()
   * @model
   * @generated
   */
  String getDataset();

  /**
   * Sets the value of the '{@link org.xtext.classifier.dsl.pClassifier.Train#getDataset <em>Dataset</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dataset</em>' attribute.
   * @see #getDataset()
   * @generated
   */
  void setDataset(String value);

  /**
   * Returns the value of the '<em><b>Split</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Split</em>' attribute.
   * @see #setSplit(double)
   * @see org.xtext.classifier.dsl.pClassifier.PClassifierPackage#getTrain_Split()
   * @model
   * @generated
   */
  double getSplit();

  /**
   * Sets the value of the '{@link org.xtext.classifier.dsl.pClassifier.Train#getSplit <em>Split</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Split</em>' attribute.
   * @see #getSplit()
   * @generated
   */
  void setSplit(double value);

  /**
   * Returns the value of the '<em><b>Evaluations</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Evaluations</em>' containment reference.
   * @see #setEvaluations(EvaluationList)
   * @see org.xtext.classifier.dsl.pClassifier.PClassifierPackage#getTrain_Evaluations()
   * @model containment="true"
   * @generated
   */
  EvaluationList getEvaluations();

  /**
   * Sets the value of the '{@link org.xtext.classifier.dsl.pClassifier.Train#getEvaluations <em>Evaluations</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Evaluations</em>' containment reference.
   * @see #getEvaluations()
   * @generated
   */
  void setEvaluations(EvaluationList value);

} // Train
