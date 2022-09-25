/**
 * generated by Xtext 2.26.0
 */
package org.xtext.classifier.dsl.pClassifier;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.classifier.dsl.pClassifier.PClassifierFactory
 * @model kind="package"
 * @generated
 */
public interface PClassifierPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "pClassifier";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/classifier/dsl/PClassifier";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "pClassifier";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PClassifierPackage eINSTANCE = org.xtext.classifier.dsl.pClassifier.impl.PClassifierPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.classifier.dsl.pClassifier.impl.PClassfierImpl <em>PClassfier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.classifier.dsl.pClassifier.impl.PClassfierImpl
   * @see org.xtext.classifier.dsl.pClassifier.impl.PClassifierPackageImpl#getPClassfier()
   * @generated
   */
  int PCLASSFIER = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PCLASSFIER__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>PClassfier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PCLASSFIER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.classifier.dsl.pClassifier.impl.StatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.classifier.dsl.pClassifier.impl.StatementImpl
   * @see org.xtext.classifier.dsl.pClassifier.impl.PClassifierPackageImpl#getStatement()
   * @generated
   */
  int STATEMENT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.classifier.dsl.pClassifier.impl.ClassifierImpl <em>Classifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.classifier.dsl.pClassifier.impl.ClassifierImpl
   * @see org.xtext.classifier.dsl.pClassifier.impl.PClassifierPackageImpl#getClassifier()
   * @generated
   */
  int CLASSIFIER = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER__NAME = STATEMENT__NAME;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER__FEATURES = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Target</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER__TARGET = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Model</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER__MODEL = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Classifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.classifier.dsl.pClassifier.impl.RunImpl <em>Run</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.classifier.dsl.pClassifier.impl.RunImpl
   * @see org.xtext.classifier.dsl.pClassifier.impl.PClassifierPackageImpl#getRun()
   * @generated
   */
  int RUN = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUN__NAME = STATEMENT__NAME;

  /**
   * The feature id for the '<em><b>Dataset</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUN__DATASET = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Split</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUN__SPLIT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Evaluations</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUN__EVALUATIONS = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Run</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUN_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.classifier.dsl.pClassifier.impl.LoadImpl <em>Load</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.classifier.dsl.pClassifier.impl.LoadImpl
   * @see org.xtext.classifier.dsl.pClassifier.impl.PClassifierPackageImpl#getLoad()
   * @generated
   */
  int LOAD = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD__NAME = STATEMENT__NAME;

  /**
   * The feature id for the '<em><b>File</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD__FILE = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Load</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.classifier.dsl.pClassifier.impl.SaveImpl <em>Save</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.classifier.dsl.pClassifier.impl.SaveImpl
   * @see org.xtext.classifier.dsl.pClassifier.impl.PClassifierPackageImpl#getSave()
   * @generated
   */
  int SAVE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SAVE__NAME = STATEMENT__NAME;

  /**
   * The feature id for the '<em><b>File</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SAVE__FILE = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Save</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SAVE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.classifier.dsl.pClassifier.impl.FeatureListImpl <em>Feature List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.classifier.dsl.pClassifier.impl.FeatureListImpl
   * @see org.xtext.classifier.dsl.pClassifier.impl.PClassifierPackageImpl#getFeatureList()
   * @generated
   */
  int FEATURE_LIST = 6;

  /**
   * The feature id for the '<em><b>Vals</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_LIST__VALS = 0;

  /**
   * The number of structural features of the '<em>Feature List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.classifier.dsl.pClassifier.impl.EvaluationListImpl <em>Evaluation List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.classifier.dsl.pClassifier.impl.EvaluationListImpl
   * @see org.xtext.classifier.dsl.pClassifier.impl.PClassifierPackageImpl#getEvaluationList()
   * @generated
   */
  int EVALUATION_LIST = 7;

  /**
   * The feature id for the '<em><b>Vals</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUATION_LIST__VALS = 0;

  /**
   * The number of structural features of the '<em>Evaluation List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUATION_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.classifier.dsl.pClassifier.MLModel <em>ML Model</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.classifier.dsl.pClassifier.MLModel
   * @see org.xtext.classifier.dsl.pClassifier.impl.PClassifierPackageImpl#getMLModel()
   * @generated
   */
  int ML_MODEL = 8;

  /**
   * The meta object id for the '{@link org.xtext.classifier.dsl.pClassifier.Evaluation <em>Evaluation</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.classifier.dsl.pClassifier.Evaluation
   * @see org.xtext.classifier.dsl.pClassifier.impl.PClassifierPackageImpl#getEvaluation()
   * @generated
   */
  int EVALUATION = 9;


  /**
   * Returns the meta object for class '{@link org.xtext.classifier.dsl.pClassifier.PClassfier <em>PClassfier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>PClassfier</em>'.
   * @see org.xtext.classifier.dsl.pClassifier.PClassfier
   * @generated
   */
  EClass getPClassfier();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.classifier.dsl.pClassifier.PClassfier#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.xtext.classifier.dsl.pClassifier.PClassfier#getElements()
   * @see #getPClassfier()
   * @generated
   */
  EReference getPClassfier_Elements();

  /**
   * Returns the meta object for class '{@link org.xtext.classifier.dsl.pClassifier.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement</em>'.
   * @see org.xtext.classifier.dsl.pClassifier.Statement
   * @generated
   */
  EClass getStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.classifier.dsl.pClassifier.Statement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.classifier.dsl.pClassifier.Statement#getName()
   * @see #getStatement()
   * @generated
   */
  EAttribute getStatement_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.classifier.dsl.pClassifier.Classifier <em>Classifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Classifier</em>'.
   * @see org.xtext.classifier.dsl.pClassifier.Classifier
   * @generated
   */
  EClass getClassifier();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.classifier.dsl.pClassifier.Classifier#getFeatures <em>Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Features</em>'.
   * @see org.xtext.classifier.dsl.pClassifier.Classifier#getFeatures()
   * @see #getClassifier()
   * @generated
   */
  EReference getClassifier_Features();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.classifier.dsl.pClassifier.Classifier#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Target</em>'.
   * @see org.xtext.classifier.dsl.pClassifier.Classifier#getTarget()
   * @see #getClassifier()
   * @generated
   */
  EAttribute getClassifier_Target();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.classifier.dsl.pClassifier.Classifier#getModel <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Model</em>'.
   * @see org.xtext.classifier.dsl.pClassifier.Classifier#getModel()
   * @see #getClassifier()
   * @generated
   */
  EAttribute getClassifier_Model();

  /**
   * Returns the meta object for class '{@link org.xtext.classifier.dsl.pClassifier.Run <em>Run</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Run</em>'.
   * @see org.xtext.classifier.dsl.pClassifier.Run
   * @generated
   */
  EClass getRun();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.classifier.dsl.pClassifier.Run#getDataset <em>Dataset</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dataset</em>'.
   * @see org.xtext.classifier.dsl.pClassifier.Run#getDataset()
   * @see #getRun()
   * @generated
   */
  EAttribute getRun_Dataset();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.classifier.dsl.pClassifier.Run#getSplit <em>Split</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Split</em>'.
   * @see org.xtext.classifier.dsl.pClassifier.Run#getSplit()
   * @see #getRun()
   * @generated
   */
  EAttribute getRun_Split();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.classifier.dsl.pClassifier.Run#getEvaluations <em>Evaluations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Evaluations</em>'.
   * @see org.xtext.classifier.dsl.pClassifier.Run#getEvaluations()
   * @see #getRun()
   * @generated
   */
  EReference getRun_Evaluations();

  /**
   * Returns the meta object for class '{@link org.xtext.classifier.dsl.pClassifier.Load <em>Load</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Load</em>'.
   * @see org.xtext.classifier.dsl.pClassifier.Load
   * @generated
   */
  EClass getLoad();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.classifier.dsl.pClassifier.Load#getFile <em>File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>File</em>'.
   * @see org.xtext.classifier.dsl.pClassifier.Load#getFile()
   * @see #getLoad()
   * @generated
   */
  EAttribute getLoad_File();

  /**
   * Returns the meta object for class '{@link org.xtext.classifier.dsl.pClassifier.Save <em>Save</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Save</em>'.
   * @see org.xtext.classifier.dsl.pClassifier.Save
   * @generated
   */
  EClass getSave();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.classifier.dsl.pClassifier.Save#getFile <em>File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>File</em>'.
   * @see org.xtext.classifier.dsl.pClassifier.Save#getFile()
   * @see #getSave()
   * @generated
   */
  EAttribute getSave_File();

  /**
   * Returns the meta object for class '{@link org.xtext.classifier.dsl.pClassifier.FeatureList <em>Feature List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature List</em>'.
   * @see org.xtext.classifier.dsl.pClassifier.FeatureList
   * @generated
   */
  EClass getFeatureList();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.classifier.dsl.pClassifier.FeatureList#getVals <em>Vals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Vals</em>'.
   * @see org.xtext.classifier.dsl.pClassifier.FeatureList#getVals()
   * @see #getFeatureList()
   * @generated
   */
  EAttribute getFeatureList_Vals();

  /**
   * Returns the meta object for class '{@link org.xtext.classifier.dsl.pClassifier.EvaluationList <em>Evaluation List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Evaluation List</em>'.
   * @see org.xtext.classifier.dsl.pClassifier.EvaluationList
   * @generated
   */
  EClass getEvaluationList();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.classifier.dsl.pClassifier.EvaluationList#getVals <em>Vals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Vals</em>'.
   * @see org.xtext.classifier.dsl.pClassifier.EvaluationList#getVals()
   * @see #getEvaluationList()
   * @generated
   */
  EAttribute getEvaluationList_Vals();

  /**
   * Returns the meta object for enum '{@link org.xtext.classifier.dsl.pClassifier.MLModel <em>ML Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>ML Model</em>'.
   * @see org.xtext.classifier.dsl.pClassifier.MLModel
   * @generated
   */
  EEnum getMLModel();

  /**
   * Returns the meta object for enum '{@link org.xtext.classifier.dsl.pClassifier.Evaluation <em>Evaluation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Evaluation</em>'.
   * @see org.xtext.classifier.dsl.pClassifier.Evaluation
   * @generated
   */
  EEnum getEvaluation();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  PClassifierFactory getPClassifierFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.classifier.dsl.pClassifier.impl.PClassfierImpl <em>PClassfier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.classifier.dsl.pClassifier.impl.PClassfierImpl
     * @see org.xtext.classifier.dsl.pClassifier.impl.PClassifierPackageImpl#getPClassfier()
     * @generated
     */
    EClass PCLASSFIER = eINSTANCE.getPClassfier();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PCLASSFIER__ELEMENTS = eINSTANCE.getPClassfier_Elements();

    /**
     * The meta object literal for the '{@link org.xtext.classifier.dsl.pClassifier.impl.StatementImpl <em>Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.classifier.dsl.pClassifier.impl.StatementImpl
     * @see org.xtext.classifier.dsl.pClassifier.impl.PClassifierPackageImpl#getStatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getStatement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATEMENT__NAME = eINSTANCE.getStatement_Name();

    /**
     * The meta object literal for the '{@link org.xtext.classifier.dsl.pClassifier.impl.ClassifierImpl <em>Classifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.classifier.dsl.pClassifier.impl.ClassifierImpl
     * @see org.xtext.classifier.dsl.pClassifier.impl.PClassifierPackageImpl#getClassifier()
     * @generated
     */
    EClass CLASSIFIER = eINSTANCE.getClassifier();

    /**
     * The meta object literal for the '<em><b>Features</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASSIFIER__FEATURES = eINSTANCE.getClassifier_Features();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASSIFIER__TARGET = eINSTANCE.getClassifier_Target();

    /**
     * The meta object literal for the '<em><b>Model</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASSIFIER__MODEL = eINSTANCE.getClassifier_Model();

    /**
     * The meta object literal for the '{@link org.xtext.classifier.dsl.pClassifier.impl.RunImpl <em>Run</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.classifier.dsl.pClassifier.impl.RunImpl
     * @see org.xtext.classifier.dsl.pClassifier.impl.PClassifierPackageImpl#getRun()
     * @generated
     */
    EClass RUN = eINSTANCE.getRun();

    /**
     * The meta object literal for the '<em><b>Dataset</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RUN__DATASET = eINSTANCE.getRun_Dataset();

    /**
     * The meta object literal for the '<em><b>Split</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RUN__SPLIT = eINSTANCE.getRun_Split();

    /**
     * The meta object literal for the '<em><b>Evaluations</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RUN__EVALUATIONS = eINSTANCE.getRun_Evaluations();

    /**
     * The meta object literal for the '{@link org.xtext.classifier.dsl.pClassifier.impl.LoadImpl <em>Load</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.classifier.dsl.pClassifier.impl.LoadImpl
     * @see org.xtext.classifier.dsl.pClassifier.impl.PClassifierPackageImpl#getLoad()
     * @generated
     */
    EClass LOAD = eINSTANCE.getLoad();

    /**
     * The meta object literal for the '<em><b>File</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOAD__FILE = eINSTANCE.getLoad_File();

    /**
     * The meta object literal for the '{@link org.xtext.classifier.dsl.pClassifier.impl.SaveImpl <em>Save</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.classifier.dsl.pClassifier.impl.SaveImpl
     * @see org.xtext.classifier.dsl.pClassifier.impl.PClassifierPackageImpl#getSave()
     * @generated
     */
    EClass SAVE = eINSTANCE.getSave();

    /**
     * The meta object literal for the '<em><b>File</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SAVE__FILE = eINSTANCE.getSave_File();

    /**
     * The meta object literal for the '{@link org.xtext.classifier.dsl.pClassifier.impl.FeatureListImpl <em>Feature List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.classifier.dsl.pClassifier.impl.FeatureListImpl
     * @see org.xtext.classifier.dsl.pClassifier.impl.PClassifierPackageImpl#getFeatureList()
     * @generated
     */
    EClass FEATURE_LIST = eINSTANCE.getFeatureList();

    /**
     * The meta object literal for the '<em><b>Vals</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE_LIST__VALS = eINSTANCE.getFeatureList_Vals();

    /**
     * The meta object literal for the '{@link org.xtext.classifier.dsl.pClassifier.impl.EvaluationListImpl <em>Evaluation List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.classifier.dsl.pClassifier.impl.EvaluationListImpl
     * @see org.xtext.classifier.dsl.pClassifier.impl.PClassifierPackageImpl#getEvaluationList()
     * @generated
     */
    EClass EVALUATION_LIST = eINSTANCE.getEvaluationList();

    /**
     * The meta object literal for the '<em><b>Vals</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVALUATION_LIST__VALS = eINSTANCE.getEvaluationList_Vals();

    /**
     * The meta object literal for the '{@link org.xtext.classifier.dsl.pClassifier.MLModel <em>ML Model</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.classifier.dsl.pClassifier.MLModel
     * @see org.xtext.classifier.dsl.pClassifier.impl.PClassifierPackageImpl#getMLModel()
     * @generated
     */
    EEnum ML_MODEL = eINSTANCE.getMLModel();

    /**
     * The meta object literal for the '{@link org.xtext.classifier.dsl.pClassifier.Evaluation <em>Evaluation</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.classifier.dsl.pClassifier.Evaluation
     * @see org.xtext.classifier.dsl.pClassifier.impl.PClassifierPackageImpl#getEvaluation()
     * @generated
     */
    EEnum EVALUATION = eINSTANCE.getEvaluation();

  }

} //PClassifierPackage