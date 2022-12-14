/*
 * generated by Xtext 2.26.0
 */
package org.xtext.classifier.dsl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class PClassifierGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class PClassfierElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.classifier.dsl.PClassifier.PClassfier");
		private final Assignment cElementsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cElementsStatementParserRuleCall_0 = (RuleCall)cElementsAssignment.eContents().get(0);
		
		//PClassfier:
		//    (elements+=Statement)*;
		@Override public ParserRule getRule() { return rule; }
		
		//(elements+=Statement)*
		public Assignment getElementsAssignment() { return cElementsAssignment; }
		
		//Statement
		public RuleCall getElementsStatementParserRuleCall_0() { return cElementsStatementParserRuleCall_0; }
	}
	public class StatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.classifier.dsl.PClassifier.Statement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cClassifierParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cTrainParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cExecuteParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cLoadParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cSaveParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		
		//Statement:
		//    Classifier | Train | Execute | Load | Save;
		@Override public ParserRule getRule() { return rule; }
		
		//Classifier | Train | Execute | Load | Save
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Classifier
		public RuleCall getClassifierParserRuleCall_0() { return cClassifierParserRuleCall_0; }
		
		//Train
		public RuleCall getTrainParserRuleCall_1() { return cTrainParserRuleCall_1; }
		
		//Execute
		public RuleCall getExecuteParserRuleCall_2() { return cExecuteParserRuleCall_2; }
		
		//Load
		public RuleCall getLoadParserRuleCall_3() { return cLoadParserRuleCall_3; }
		
		//Save
		public RuleCall getSaveParserRuleCall_4() { return cSaveParserRuleCall_4; }
	}
	public class ClassifierElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.classifier.dsl.PClassifier.Classifier");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cClassifierKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cRightParenthesisLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cFeaturesKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cColonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cFeaturesAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cFeaturesFeatureListParserRuleCall_5_0 = (RuleCall)cFeaturesAssignment_5.eContents().get(0);
		private final Keyword cTargetKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cTargetAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cTargetSTRINGTerminalRuleCall_8_0 = (RuleCall)cTargetAssignment_8.eContents().get(0);
		private final Keyword cModelKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cColonKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Assignment cModelAssignment_11 = (Assignment)cGroup.eContents().get(11);
		private final RuleCall cModelMLModelEnumRuleCall_11_0 = (RuleCall)cModelAssignment_11.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_12 = (Keyword)cGroup.eContents().get(12);
		
		//Classifier:
		//    'Classifier(' name=ID '){'
		//        'features' ':' features=FeatureList
		//        'target' ':' target=STRING
		//        'model' ':' model=MLModel
		//    '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'Classifier(' name=ID '){'
		//    'features' ':' features=FeatureList
		//    'target' ':' target=STRING
		//    'model' ':' model=MLModel
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'Classifier('
		public Keyword getClassifierKeyword_0() { return cClassifierKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'){'
		public Keyword getRightParenthesisLeftCurlyBracketKeyword_2() { return cRightParenthesisLeftCurlyBracketKeyword_2; }
		
		//'features'
		public Keyword getFeaturesKeyword_3() { return cFeaturesKeyword_3; }
		
		//':'
		public Keyword getColonKeyword_4() { return cColonKeyword_4; }
		
		//features=FeatureList
		public Assignment getFeaturesAssignment_5() { return cFeaturesAssignment_5; }
		
		//FeatureList
		public RuleCall getFeaturesFeatureListParserRuleCall_5_0() { return cFeaturesFeatureListParserRuleCall_5_0; }
		
		//'target'
		public Keyword getTargetKeyword_6() { return cTargetKeyword_6; }
		
		//':'
		public Keyword getColonKeyword_7() { return cColonKeyword_7; }
		
		//target=STRING
		public Assignment getTargetAssignment_8() { return cTargetAssignment_8; }
		
		//STRING
		public RuleCall getTargetSTRINGTerminalRuleCall_8_0() { return cTargetSTRINGTerminalRuleCall_8_0; }
		
		//'model'
		public Keyword getModelKeyword_9() { return cModelKeyword_9; }
		
		//':'
		public Keyword getColonKeyword_10() { return cColonKeyword_10; }
		
		//model=MLModel
		public Assignment getModelAssignment_11() { return cModelAssignment_11; }
		
		//MLModel
		public RuleCall getModelMLModelEnumRuleCall_11_0() { return cModelMLModelEnumRuleCall_11_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_12() { return cRightCurlyBracketKeyword_12; }
	}
	public class TrainElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.classifier.dsl.PClassifier.Train");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTrainKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cRightParenthesisLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cDatasetKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cColonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cDatasetAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cDatasetSTRINGTerminalRuleCall_5_0 = (RuleCall)cDatasetAssignment_5.eContents().get(0);
		private final Keyword cSplitKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cSplitAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cSplitFLOATTerminalRuleCall_8_0 = (RuleCall)cSplitAssignment_8.eContents().get(0);
		private final Keyword cEvaluationsKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cColonKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Assignment cEvaluationsAssignment_11 = (Assignment)cGroup.eContents().get(11);
		private final RuleCall cEvaluationsEvaluationListParserRuleCall_11_0 = (RuleCall)cEvaluationsAssignment_11.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_12 = (Keyword)cGroup.eContents().get(12);
		
		//Train:
		//    'Train(' name=ID '){'
		//        'dataset' ':' dataset=STRING
		//        'split' ':' split=FLOAT
		//        'evaluations' ':' evaluations=EvaluationList
		//    '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'Train(' name=ID '){'
		//    'dataset' ':' dataset=STRING
		//    'split' ':' split=FLOAT
		//    'evaluations' ':' evaluations=EvaluationList
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'Train('
		public Keyword getTrainKeyword_0() { return cTrainKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'){'
		public Keyword getRightParenthesisLeftCurlyBracketKeyword_2() { return cRightParenthesisLeftCurlyBracketKeyword_2; }
		
		//'dataset'
		public Keyword getDatasetKeyword_3() { return cDatasetKeyword_3; }
		
		//':'
		public Keyword getColonKeyword_4() { return cColonKeyword_4; }
		
		//dataset=STRING
		public Assignment getDatasetAssignment_5() { return cDatasetAssignment_5; }
		
		//STRING
		public RuleCall getDatasetSTRINGTerminalRuleCall_5_0() { return cDatasetSTRINGTerminalRuleCall_5_0; }
		
		//'split'
		public Keyword getSplitKeyword_6() { return cSplitKeyword_6; }
		
		//':'
		public Keyword getColonKeyword_7() { return cColonKeyword_7; }
		
		//split=FLOAT
		public Assignment getSplitAssignment_8() { return cSplitAssignment_8; }
		
		//FLOAT
		public RuleCall getSplitFLOATTerminalRuleCall_8_0() { return cSplitFLOATTerminalRuleCall_8_0; }
		
		//'evaluations'
		public Keyword getEvaluationsKeyword_9() { return cEvaluationsKeyword_9; }
		
		//':'
		public Keyword getColonKeyword_10() { return cColonKeyword_10; }
		
		//evaluations=EvaluationList
		public Assignment getEvaluationsAssignment_11() { return cEvaluationsAssignment_11; }
		
		//EvaluationList
		public RuleCall getEvaluationsEvaluationListParserRuleCall_11_0() { return cEvaluationsEvaluationListParserRuleCall_11_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_12() { return cRightCurlyBracketKeyword_12; }
	}
	public class ExecuteElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.classifier.dsl.PClassifier.Execute");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cExecuteKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cRightParenthesisLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cInputKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cColonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cInputAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cInputSTRINGTerminalRuleCall_5_0 = (RuleCall)cInputAssignment_5.eContents().get(0);
		private final Keyword cOutputKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cColonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cOutputAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cOutputSTRINGTerminalRuleCall_8_0 = (RuleCall)cOutputAssignment_8.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_9 = (Keyword)cGroup.eContents().get(9);
		
		//Execute:
		//    'Execute(' name=ID '){'
		//        'input' ':' input=STRING
		//        'output' ':' output=STRING
		//    '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'Execute(' name=ID '){'
		//    'input' ':' input=STRING
		//    'output' ':' output=STRING
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'Execute('
		public Keyword getExecuteKeyword_0() { return cExecuteKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'){'
		public Keyword getRightParenthesisLeftCurlyBracketKeyword_2() { return cRightParenthesisLeftCurlyBracketKeyword_2; }
		
		//'input'
		public Keyword getInputKeyword_3() { return cInputKeyword_3; }
		
		//':'
		public Keyword getColonKeyword_4() { return cColonKeyword_4; }
		
		//input=STRING
		public Assignment getInputAssignment_5() { return cInputAssignment_5; }
		
		//STRING
		public RuleCall getInputSTRINGTerminalRuleCall_5_0() { return cInputSTRINGTerminalRuleCall_5_0; }
		
		//'output'
		public Keyword getOutputKeyword_6() { return cOutputKeyword_6; }
		
		//':'
		public Keyword getColonKeyword_7() { return cColonKeyword_7; }
		
		//output=STRING
		public Assignment getOutputAssignment_8() { return cOutputAssignment_8; }
		
		//STRING
		public RuleCall getOutputSTRINGTerminalRuleCall_8_0() { return cOutputSTRINGTerminalRuleCall_8_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_9() { return cRightCurlyBracketKeyword_9; }
	}
	public class LoadElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.classifier.dsl.PClassifier.Load");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLoadKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cRightParenthesisLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cFileKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cColonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cFileAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cFileSTRINGTerminalRuleCall_5_0 = (RuleCall)cFileAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//Load:
		//    'Load(' name=ID '){'
		//        'file' ':' file=STRING
		//    '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'Load(' name=ID '){'
		//    'file' ':' file=STRING
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'Load('
		public Keyword getLoadKeyword_0() { return cLoadKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'){'
		public Keyword getRightParenthesisLeftCurlyBracketKeyword_2() { return cRightParenthesisLeftCurlyBracketKeyword_2; }
		
		//'file'
		public Keyword getFileKeyword_3() { return cFileKeyword_3; }
		
		//':'
		public Keyword getColonKeyword_4() { return cColonKeyword_4; }
		
		//file=STRING
		public Assignment getFileAssignment_5() { return cFileAssignment_5; }
		
		//STRING
		public RuleCall getFileSTRINGTerminalRuleCall_5_0() { return cFileSTRINGTerminalRuleCall_5_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class SaveElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.classifier.dsl.PClassifier.Save");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSaveKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cRightParenthesisLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cFileKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cColonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cFileAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cFileSTRINGTerminalRuleCall_5_0 = (RuleCall)cFileAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//Save:
		//    'Save(' name=ID '){'
		//        'file' ':' file=STRING
		//    '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'Save(' name=ID '){'
		//    'file' ':' file=STRING
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'Save('
		public Keyword getSaveKeyword_0() { return cSaveKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'){'
		public Keyword getRightParenthesisLeftCurlyBracketKeyword_2() { return cRightParenthesisLeftCurlyBracketKeyword_2; }
		
		//'file'
		public Keyword getFileKeyword_3() { return cFileKeyword_3; }
		
		//':'
		public Keyword getColonKeyword_4() { return cColonKeyword_4; }
		
		//file=STRING
		public Assignment getFileAssignment_5() { return cFileAssignment_5; }
		
		//STRING
		public RuleCall getFileSTRINGTerminalRuleCall_5_0() { return cFileSTRINGTerminalRuleCall_5_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class FeatureListElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.classifier.dsl.PClassifier.FeatureList");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCommaKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cValsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValsSTRINGTerminalRuleCall_1_0 = (RuleCall)cValsAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cCommaKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cValsAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cValsSTRINGTerminalRuleCall_2_1_0 = (RuleCall)cValsAssignment_2_1.eContents().get(0);
		private final Keyword cCommaKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//FeatureList: ','* vals+=STRING (','+ vals+=STRING)* ','* ;
		@Override public ParserRule getRule() { return rule; }
		
		//','* vals+=STRING (','+ vals+=STRING)* ','*
		public Group getGroup() { return cGroup; }
		
		//','*
		public Keyword getCommaKeyword_0() { return cCommaKeyword_0; }
		
		//vals+=STRING
		public Assignment getValsAssignment_1() { return cValsAssignment_1; }
		
		//STRING
		public RuleCall getValsSTRINGTerminalRuleCall_1_0() { return cValsSTRINGTerminalRuleCall_1_0; }
		
		//(','+ vals+=STRING)*
		public Group getGroup_2() { return cGroup_2; }
		
		//','+
		public Keyword getCommaKeyword_2_0() { return cCommaKeyword_2_0; }
		
		//vals+=STRING
		public Assignment getValsAssignment_2_1() { return cValsAssignment_2_1; }
		
		//STRING
		public RuleCall getValsSTRINGTerminalRuleCall_2_1_0() { return cValsSTRINGTerminalRuleCall_2_1_0; }
		
		//','*
		public Keyword getCommaKeyword_3() { return cCommaKeyword_3; }
	}
	public class EvaluationListElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.classifier.dsl.PClassifier.EvaluationList");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCommaKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cValsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValsEvaluationEnumRuleCall_1_0 = (RuleCall)cValsAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cCommaKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cValsAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cValsEvaluationEnumRuleCall_2_1_0 = (RuleCall)cValsAssignment_2_1.eContents().get(0);
		private final Keyword cCommaKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//EvaluationList: ','* vals+=Evaluation (','+ vals+=Evaluation)* ','* ;
		@Override public ParserRule getRule() { return rule; }
		
		//','* vals+=Evaluation (','+ vals+=Evaluation)* ','*
		public Group getGroup() { return cGroup; }
		
		//','*
		public Keyword getCommaKeyword_0() { return cCommaKeyword_0; }
		
		//vals+=Evaluation
		public Assignment getValsAssignment_1() { return cValsAssignment_1; }
		
		//Evaluation
		public RuleCall getValsEvaluationEnumRuleCall_1_0() { return cValsEvaluationEnumRuleCall_1_0; }
		
		//(','+ vals+=Evaluation)*
		public Group getGroup_2() { return cGroup_2; }
		
		//','+
		public Keyword getCommaKeyword_2_0() { return cCommaKeyword_2_0; }
		
		//vals+=Evaluation
		public Assignment getValsAssignment_2_1() { return cValsAssignment_2_1; }
		
		//Evaluation
		public RuleCall getValsEvaluationEnumRuleCall_2_1_0() { return cValsEvaluationEnumRuleCall_2_1_0; }
		
		//','*
		public Keyword getCommaKeyword_3() { return cCommaKeyword_3; }
	}
	
	public class MLModelElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.classifier.dsl.PClassifier.MLModel");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cDecisonTreeEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cDecisonTreeDecisionTreeKeyword_0_0 = (Keyword)cDecisonTreeEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cSVCEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cSVCSVCKeyword_1_0 = (Keyword)cSVCEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cRandomForestEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cRandomForestRandomForestKeyword_2_0 = (Keyword)cRandomForestEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cMLPClassifierEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cMLPClassifierMLPClassifierKeyword_3_0 = (Keyword)cMLPClassifierEnumLiteralDeclaration_3.eContents().get(0);
		
		//enum MLModel:
		//    DecisonTree = 'DecisionTree' | SVC = 'SVC' | RandomForest = 'RandomForest' | MLPClassifier = 'MLPClassifier';
		public EnumRule getRule() { return rule; }
		
		//DecisonTree = 'DecisionTree' | SVC = 'SVC' | RandomForest = 'RandomForest' | MLPClassifier = 'MLPClassifier'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//DecisonTree = 'DecisionTree'
		public EnumLiteralDeclaration getDecisonTreeEnumLiteralDeclaration_0() { return cDecisonTreeEnumLiteralDeclaration_0; }
		
		//'DecisionTree'
		public Keyword getDecisonTreeDecisionTreeKeyword_0_0() { return cDecisonTreeDecisionTreeKeyword_0_0; }
		
		//SVC = 'SVC'
		public EnumLiteralDeclaration getSVCEnumLiteralDeclaration_1() { return cSVCEnumLiteralDeclaration_1; }
		
		//'SVC'
		public Keyword getSVCSVCKeyword_1_0() { return cSVCSVCKeyword_1_0; }
		
		//RandomForest = 'RandomForest'
		public EnumLiteralDeclaration getRandomForestEnumLiteralDeclaration_2() { return cRandomForestEnumLiteralDeclaration_2; }
		
		//'RandomForest'
		public Keyword getRandomForestRandomForestKeyword_2_0() { return cRandomForestRandomForestKeyword_2_0; }
		
		//MLPClassifier = 'MLPClassifier'
		public EnumLiteralDeclaration getMLPClassifierEnumLiteralDeclaration_3() { return cMLPClassifierEnumLiteralDeclaration_3; }
		
		//'MLPClassifier'
		public Keyword getMLPClassifierMLPClassifierKeyword_3_0() { return cMLPClassifierMLPClassifierKeyword_3_0; }
	}
	public class EvaluationElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.classifier.dsl.PClassifier.Evaluation");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cAccuracyEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cAccuracyAccuracyKeyword_0_0 = (Keyword)cAccuracyEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cF1ScoreEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cF1ScoreF1Keyword_1_0 = (Keyword)cF1ScoreEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cRecallEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cRecallRecallKeyword_2_0 = (Keyword)cRecallEnumLiteralDeclaration_2.eContents().get(0);
		
		//enum Evaluation:
		//    Accuracy = 'accuracy' | F1Score = 'f1' | Recall = 'recall';
		public EnumRule getRule() { return rule; }
		
		//Accuracy = 'accuracy' | F1Score = 'f1' | Recall = 'recall'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Accuracy = 'accuracy'
		public EnumLiteralDeclaration getAccuracyEnumLiteralDeclaration_0() { return cAccuracyEnumLiteralDeclaration_0; }
		
		//'accuracy'
		public Keyword getAccuracyAccuracyKeyword_0_0() { return cAccuracyAccuracyKeyword_0_0; }
		
		//F1Score = 'f1'
		public EnumLiteralDeclaration getF1ScoreEnumLiteralDeclaration_1() { return cF1ScoreEnumLiteralDeclaration_1; }
		
		//'f1'
		public Keyword getF1ScoreF1Keyword_1_0() { return cF1ScoreF1Keyword_1_0; }
		
		//Recall = 'recall'
		public EnumLiteralDeclaration getRecallEnumLiteralDeclaration_2() { return cRecallEnumLiteralDeclaration_2; }
		
		//'recall'
		public Keyword getRecallRecallKeyword_2_0() { return cRecallRecallKeyword_2_0; }
	}
	
	private final PClassfierElements pPClassfier;
	private final StatementElements pStatement;
	private final MLModelElements eMLModel;
	private final EvaluationElements eEvaluation;
	private final ClassifierElements pClassifier;
	private final TrainElements pTrain;
	private final ExecuteElements pExecute;
	private final LoadElements pLoad;
	private final SaveElements pSave;
	private final FeatureListElements pFeatureList;
	private final EvaluationListElements pEvaluationList;
	private final TerminalRule tFLOAT;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public PClassifierGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pPClassfier = new PClassfierElements();
		this.pStatement = new StatementElements();
		this.eMLModel = new MLModelElements();
		this.eEvaluation = new EvaluationElements();
		this.pClassifier = new ClassifierElements();
		this.pTrain = new TrainElements();
		this.pExecute = new ExecuteElements();
		this.pLoad = new LoadElements();
		this.pSave = new SaveElements();
		this.pFeatureList = new FeatureListElements();
		this.pEvaluationList = new EvaluationListElements();
		this.tFLOAT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.classifier.dsl.PClassifier.FLOAT");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.classifier.dsl.PClassifier".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//PClassfier:
	//    (elements+=Statement)*;
	public PClassfierElements getPClassfierAccess() {
		return pPClassfier;
	}
	
	public ParserRule getPClassfierRule() {
		return getPClassfierAccess().getRule();
	}
	
	//Statement:
	//    Classifier | Train | Execute | Load | Save;
	public StatementElements getStatementAccess() {
		return pStatement;
	}
	
	public ParserRule getStatementRule() {
		return getStatementAccess().getRule();
	}
	
	//enum MLModel:
	//    DecisonTree = 'DecisionTree' | SVC = 'SVC' | RandomForest = 'RandomForest' | MLPClassifier = 'MLPClassifier';
	public MLModelElements getMLModelAccess() {
		return eMLModel;
	}
	
	public EnumRule getMLModelRule() {
		return getMLModelAccess().getRule();
	}
	
	//enum Evaluation:
	//    Accuracy = 'accuracy' | F1Score = 'f1' | Recall = 'recall';
	public EvaluationElements getEvaluationAccess() {
		return eEvaluation;
	}
	
	public EnumRule getEvaluationRule() {
		return getEvaluationAccess().getRule();
	}
	
	//Classifier:
	//    'Classifier(' name=ID '){'
	//        'features' ':' features=FeatureList
	//        'target' ':' target=STRING
	//        'model' ':' model=MLModel
	//    '}';
	public ClassifierElements getClassifierAccess() {
		return pClassifier;
	}
	
	public ParserRule getClassifierRule() {
		return getClassifierAccess().getRule();
	}
	
	//Train:
	//    'Train(' name=ID '){'
	//        'dataset' ':' dataset=STRING
	//        'split' ':' split=FLOAT
	//        'evaluations' ':' evaluations=EvaluationList
	//    '}';
	public TrainElements getTrainAccess() {
		return pTrain;
	}
	
	public ParserRule getTrainRule() {
		return getTrainAccess().getRule();
	}
	
	//Execute:
	//    'Execute(' name=ID '){'
	//        'input' ':' input=STRING
	//        'output' ':' output=STRING
	//    '}';
	public ExecuteElements getExecuteAccess() {
		return pExecute;
	}
	
	public ParserRule getExecuteRule() {
		return getExecuteAccess().getRule();
	}
	
	//Load:
	//    'Load(' name=ID '){'
	//        'file' ':' file=STRING
	//    '}';
	public LoadElements getLoadAccess() {
		return pLoad;
	}
	
	public ParserRule getLoadRule() {
		return getLoadAccess().getRule();
	}
	
	//Save:
	//    'Save(' name=ID '){'
	//        'file' ':' file=STRING
	//    '}';
	public SaveElements getSaveAccess() {
		return pSave;
	}
	
	public ParserRule getSaveRule() {
		return getSaveAccess().getRule();
	}
	
	//FeatureList: ','* vals+=STRING (','+ vals+=STRING)* ','* ;
	public FeatureListElements getFeatureListAccess() {
		return pFeatureList;
	}
	
	public ParserRule getFeatureListRule() {
		return getFeatureListAccess().getRule();
	}
	
	//EvaluationList: ','* vals+=Evaluation (','+ vals+=Evaluation)* ','* ;
	public EvaluationListElements getEvaluationListAccess() {
		return pEvaluationList;
	}
	
	public ParserRule getEvaluationListRule() {
		return getEvaluationListAccess().getRule();
	}
	
	//// Terminals
	//terminal FLOAT returns ecore::EDouble :
	//('0'..'9')+ '.' ('0'..'9')* (('e'|'E') ('+' | '-')? ('0'..'9')+)?
	//| '.' ('0'..'9')+ (('e'|'E') ('+' | '-')? ('0'..'9')+)?
	//| ('0'..'9')+ ('e'|'E') ('+' | '-')? ('0'..'9')+;
	public TerminalRule getFLOATRule() {
		return tFLOAT;
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
