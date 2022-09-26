/**
 * generated by Xtext 2.26.0
 */
package org.xtext.classifier.dsl.pClassifier;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.classifier.dsl.pClassifier.Eval#getEvaluations <em>Evaluations</em>}</li>
 * </ul>
 *
 * @see org.xtext.classifier.dsl.pClassifier.PClassifierPackage#getEval()
 * @model
 * @generated
 */
public interface Eval extends Statement
{
  /**
   * Returns the value of the '<em><b>Evaluations</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Evaluations</em>' containment reference.
   * @see #setEvaluations(EvaluationList)
   * @see org.xtext.classifier.dsl.pClassifier.PClassifierPackage#getEval_Evaluations()
   * @model containment="true"
   * @generated
   */
  EvaluationList getEvaluations();

  /**
   * Sets the value of the '{@link org.xtext.classifier.dsl.pClassifier.Eval#getEvaluations <em>Evaluations</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Evaluations</em>' containment reference.
   * @see #getEvaluations()
   * @generated
   */
  void setEvaluations(EvaluationList value);

} // Eval