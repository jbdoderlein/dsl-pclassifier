/**
 * generated by Xtext 2.26.0
 */
package org.xtext.classifier.dsl.pClassifier.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.classifier.dsl.pClassifier.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PClassifierFactoryImpl extends EFactoryImpl implements PClassifierFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PClassifierFactory init()
  {
    try
    {
      PClassifierFactory thePClassifierFactory = (PClassifierFactory)EPackage.Registry.INSTANCE.getEFactory(PClassifierPackage.eNS_URI);
      if (thePClassifierFactory != null)
      {
        return thePClassifierFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new PClassifierFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PClassifierFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case PClassifierPackage.PCLASSFIER: return createPClassfier();
      case PClassifierPackage.STATEMENT: return createStatement();
      case PClassifierPackage.CLASSIFIER: return createClassifier();
      case PClassifierPackage.TRAIN: return createTrain();
      case PClassifierPackage.EXECUTE: return createExecute();
      case PClassifierPackage.LOAD: return createLoad();
      case PClassifierPackage.SAVE: return createSave();
      case PClassifierPackage.FEATURE_LIST: return createFeatureList();
      case PClassifierPackage.EVALUATION_LIST: return createEvaluationList();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case PClassifierPackage.ML_MODEL:
        return createMLModelFromString(eDataType, initialValue);
      case PClassifierPackage.EVALUATION:
        return createEvaluationFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case PClassifierPackage.ML_MODEL:
        return convertMLModelToString(eDataType, instanceValue);
      case PClassifierPackage.EVALUATION:
        return convertEvaluationToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PClassfier createPClassfier()
  {
    PClassfierImpl pClassfier = new PClassfierImpl();
    return pClassfier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Classifier createClassifier()
  {
    ClassifierImpl classifier = new ClassifierImpl();
    return classifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Train createTrain()
  {
    TrainImpl train = new TrainImpl();
    return train;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Execute createExecute()
  {
    ExecuteImpl execute = new ExecuteImpl();
    return execute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Load createLoad()
  {
    LoadImpl load = new LoadImpl();
    return load;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Save createSave()
  {
    SaveImpl save = new SaveImpl();
    return save;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FeatureList createFeatureList()
  {
    FeatureListImpl featureList = new FeatureListImpl();
    return featureList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EvaluationList createEvaluationList()
  {
    EvaluationListImpl evaluationList = new EvaluationListImpl();
    return evaluationList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MLModel createMLModelFromString(EDataType eDataType, String initialValue)
  {
    MLModel result = MLModel.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertMLModelToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Evaluation createEvaluationFromString(EDataType eDataType, String initialValue)
  {
    Evaluation result = Evaluation.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertEvaluationToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PClassifierPackage getPClassifierPackage()
  {
    return (PClassifierPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static PClassifierPackage getPackage()
  {
    return PClassifierPackage.eINSTANCE;
  }

} //PClassifierFactoryImpl
