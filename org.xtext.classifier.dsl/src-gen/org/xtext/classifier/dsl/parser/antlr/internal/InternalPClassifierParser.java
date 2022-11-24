package org.xtext.classifier.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.classifier.dsl.services.PClassifierGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPClassifierParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_FLOAT", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Classifier('", "'){'", "'features'", "':'", "'target'", "'model'", "'}'", "'Train('", "'dataset'", "'split'", "'evaluations'", "'Execute('", "'input'", "'output'", "'Load('", "'file'", "'Save('", "','", "'DecisionTree'", "'SVC'", "'RandomForest'", "'MLPClassifier'", "'accuracy'", "'f1'", "'recall'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int RULE_FLOAT=6;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalPClassifierParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPClassifierParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPClassifierParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPClassifier.g"; }



     	private PClassifierGrammarAccess grammarAccess;

        public InternalPClassifierParser(TokenStream input, PClassifierGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "PClassfier";
       	}

       	@Override
       	protected PClassifierGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePClassfier"
    // InternalPClassifier.g:65:1: entryRulePClassfier returns [EObject current=null] : iv_rulePClassfier= rulePClassfier EOF ;
    public final EObject entryRulePClassfier() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePClassfier = null;


        try {
            // InternalPClassifier.g:65:51: (iv_rulePClassfier= rulePClassfier EOF )
            // InternalPClassifier.g:66:2: iv_rulePClassfier= rulePClassfier EOF
            {
             newCompositeNode(grammarAccess.getPClassfierRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePClassfier=rulePClassfier();

            state._fsp--;

             current =iv_rulePClassfier; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePClassfier"


    // $ANTLR start "rulePClassfier"
    // InternalPClassifier.g:72:1: rulePClassfier returns [EObject current=null] : ( (lv_elements_0_0= ruleStatement ) )* ;
    public final EObject rulePClassfier() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalPClassifier.g:78:2: ( ( (lv_elements_0_0= ruleStatement ) )* )
            // InternalPClassifier.g:79:2: ( (lv_elements_0_0= ruleStatement ) )*
            {
            // InternalPClassifier.g:79:2: ( (lv_elements_0_0= ruleStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12||LA1_0==19||LA1_0==23||LA1_0==26||LA1_0==28) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPClassifier.g:80:3: (lv_elements_0_0= ruleStatement )
            	    {
            	    // InternalPClassifier.g:80:3: (lv_elements_0_0= ruleStatement )
            	    // InternalPClassifier.g:81:4: lv_elements_0_0= ruleStatement
            	    {

            	    				newCompositeNode(grammarAccess.getPClassfierAccess().getElementsStatementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleStatement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getPClassfierRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"org.xtext.classifier.dsl.PClassifier.Statement");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePClassfier"


    // $ANTLR start "entryRuleStatement"
    // InternalPClassifier.g:101:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalPClassifier.g:101:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalPClassifier.g:102:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalPClassifier.g:108:1: ruleStatement returns [EObject current=null] : (this_Classifier_0= ruleClassifier | this_Train_1= ruleTrain | this_Execute_2= ruleExecute | this_Load_3= ruleLoad | this_Save_4= ruleSave ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_Classifier_0 = null;

        EObject this_Train_1 = null;

        EObject this_Execute_2 = null;

        EObject this_Load_3 = null;

        EObject this_Save_4 = null;



        	enterRule();

        try {
            // InternalPClassifier.g:114:2: ( (this_Classifier_0= ruleClassifier | this_Train_1= ruleTrain | this_Execute_2= ruleExecute | this_Load_3= ruleLoad | this_Save_4= ruleSave ) )
            // InternalPClassifier.g:115:2: (this_Classifier_0= ruleClassifier | this_Train_1= ruleTrain | this_Execute_2= ruleExecute | this_Load_3= ruleLoad | this_Save_4= ruleSave )
            {
            // InternalPClassifier.g:115:2: (this_Classifier_0= ruleClassifier | this_Train_1= ruleTrain | this_Execute_2= ruleExecute | this_Load_3= ruleLoad | this_Save_4= ruleSave )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt2=1;
                }
                break;
            case 19:
                {
                alt2=2;
                }
                break;
            case 23:
                {
                alt2=3;
                }
                break;
            case 26:
                {
                alt2=4;
                }
                break;
            case 28:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalPClassifier.g:116:3: this_Classifier_0= ruleClassifier
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getClassifierParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Classifier_0=ruleClassifier();

                    state._fsp--;


                    			current = this_Classifier_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPClassifier.g:125:3: this_Train_1= ruleTrain
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getTrainParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Train_1=ruleTrain();

                    state._fsp--;


                    			current = this_Train_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPClassifier.g:134:3: this_Execute_2= ruleExecute
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getExecuteParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Execute_2=ruleExecute();

                    state._fsp--;


                    			current = this_Execute_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalPClassifier.g:143:3: this_Load_3= ruleLoad
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getLoadParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Load_3=ruleLoad();

                    state._fsp--;


                    			current = this_Load_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalPClassifier.g:152:3: this_Save_4= ruleSave
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getSaveParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Save_4=ruleSave();

                    state._fsp--;


                    			current = this_Save_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleClassifier"
    // InternalPClassifier.g:164:1: entryRuleClassifier returns [EObject current=null] : iv_ruleClassifier= ruleClassifier EOF ;
    public final EObject entryRuleClassifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassifier = null;


        try {
            // InternalPClassifier.g:164:51: (iv_ruleClassifier= ruleClassifier EOF )
            // InternalPClassifier.g:165:2: iv_ruleClassifier= ruleClassifier EOF
            {
             newCompositeNode(grammarAccess.getClassifierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassifier=ruleClassifier();

            state._fsp--;

             current =iv_ruleClassifier; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassifier"


    // $ANTLR start "ruleClassifier"
    // InternalPClassifier.g:171:1: ruleClassifier returns [EObject current=null] : (otherlv_0= 'Classifier(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '){' otherlv_3= 'features' otherlv_4= ':' ( (lv_features_5_0= ruleFeatureList ) ) otherlv_6= 'target' otherlv_7= ':' ( (lv_target_8_0= RULE_STRING ) ) otherlv_9= 'model' otherlv_10= ':' ( (lv_model_11_0= ruleMLModel ) ) otherlv_12= '}' ) ;
    public final EObject ruleClassifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_target_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_features_5_0 = null;

        Enumerator lv_model_11_0 = null;



        	enterRule();

        try {
            // InternalPClassifier.g:177:2: ( (otherlv_0= 'Classifier(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '){' otherlv_3= 'features' otherlv_4= ':' ( (lv_features_5_0= ruleFeatureList ) ) otherlv_6= 'target' otherlv_7= ':' ( (lv_target_8_0= RULE_STRING ) ) otherlv_9= 'model' otherlv_10= ':' ( (lv_model_11_0= ruleMLModel ) ) otherlv_12= '}' ) )
            // InternalPClassifier.g:178:2: (otherlv_0= 'Classifier(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '){' otherlv_3= 'features' otherlv_4= ':' ( (lv_features_5_0= ruleFeatureList ) ) otherlv_6= 'target' otherlv_7= ':' ( (lv_target_8_0= RULE_STRING ) ) otherlv_9= 'model' otherlv_10= ':' ( (lv_model_11_0= ruleMLModel ) ) otherlv_12= '}' )
            {
            // InternalPClassifier.g:178:2: (otherlv_0= 'Classifier(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '){' otherlv_3= 'features' otherlv_4= ':' ( (lv_features_5_0= ruleFeatureList ) ) otherlv_6= 'target' otherlv_7= ':' ( (lv_target_8_0= RULE_STRING ) ) otherlv_9= 'model' otherlv_10= ':' ( (lv_model_11_0= ruleMLModel ) ) otherlv_12= '}' )
            // InternalPClassifier.g:179:3: otherlv_0= 'Classifier(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '){' otherlv_3= 'features' otherlv_4= ':' ( (lv_features_5_0= ruleFeatureList ) ) otherlv_6= 'target' otherlv_7= ':' ( (lv_target_8_0= RULE_STRING ) ) otherlv_9= 'model' otherlv_10= ':' ( (lv_model_11_0= ruleMLModel ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getClassifierAccess().getClassifierKeyword_0());
            		
            // InternalPClassifier.g:183:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPClassifier.g:184:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPClassifier.g:184:4: (lv_name_1_0= RULE_ID )
            // InternalPClassifier.g:185:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getClassifierAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClassifierRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getClassifierAccess().getRightParenthesisLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getClassifierAccess().getFeaturesKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getClassifierAccess().getColonKeyword_4());
            		
            // InternalPClassifier.g:213:3: ( (lv_features_5_0= ruleFeatureList ) )
            // InternalPClassifier.g:214:4: (lv_features_5_0= ruleFeatureList )
            {
            // InternalPClassifier.g:214:4: (lv_features_5_0= ruleFeatureList )
            // InternalPClassifier.g:215:5: lv_features_5_0= ruleFeatureList
            {

            					newCompositeNode(grammarAccess.getClassifierAccess().getFeaturesFeatureListParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_9);
            lv_features_5_0=ruleFeatureList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClassifierRule());
            					}
            					set(
            						current,
            						"features",
            						lv_features_5_0,
            						"org.xtext.classifier.dsl.PClassifier.FeatureList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getClassifierAccess().getTargetKeyword_6());
            		
            otherlv_7=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_7, grammarAccess.getClassifierAccess().getColonKeyword_7());
            		
            // InternalPClassifier.g:240:3: ( (lv_target_8_0= RULE_STRING ) )
            // InternalPClassifier.g:241:4: (lv_target_8_0= RULE_STRING )
            {
            // InternalPClassifier.g:241:4: (lv_target_8_0= RULE_STRING )
            // InternalPClassifier.g:242:5: lv_target_8_0= RULE_STRING
            {
            lv_target_8_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_target_8_0, grammarAccess.getClassifierAccess().getTargetSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClassifierRule());
            					}
            					setWithLastConsumed(
            						current,
            						"target",
            						lv_target_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_9=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_9, grammarAccess.getClassifierAccess().getModelKeyword_9());
            		
            otherlv_10=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_10, grammarAccess.getClassifierAccess().getColonKeyword_10());
            		
            // InternalPClassifier.g:266:3: ( (lv_model_11_0= ruleMLModel ) )
            // InternalPClassifier.g:267:4: (lv_model_11_0= ruleMLModel )
            {
            // InternalPClassifier.g:267:4: (lv_model_11_0= ruleMLModel )
            // InternalPClassifier.g:268:5: lv_model_11_0= ruleMLModel
            {

            					newCompositeNode(grammarAccess.getClassifierAccess().getModelMLModelEnumRuleCall_11_0());
            				
            pushFollow(FOLLOW_13);
            lv_model_11_0=ruleMLModel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClassifierRule());
            					}
            					set(
            						current,
            						"model",
            						lv_model_11_0,
            						"org.xtext.classifier.dsl.PClassifier.MLModel");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getClassifierAccess().getRightCurlyBracketKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassifier"


    // $ANTLR start "entryRuleTrain"
    // InternalPClassifier.g:293:1: entryRuleTrain returns [EObject current=null] : iv_ruleTrain= ruleTrain EOF ;
    public final EObject entryRuleTrain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrain = null;


        try {
            // InternalPClassifier.g:293:46: (iv_ruleTrain= ruleTrain EOF )
            // InternalPClassifier.g:294:2: iv_ruleTrain= ruleTrain EOF
            {
             newCompositeNode(grammarAccess.getTrainRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTrain=ruleTrain();

            state._fsp--;

             current =iv_ruleTrain; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTrain"


    // $ANTLR start "ruleTrain"
    // InternalPClassifier.g:300:1: ruleTrain returns [EObject current=null] : (otherlv_0= 'Train(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '){' otherlv_3= 'dataset' otherlv_4= ':' ( (lv_dataset_5_0= RULE_STRING ) ) otherlv_6= 'split' otherlv_7= ':' ( (lv_split_8_0= RULE_FLOAT ) ) otherlv_9= 'evaluations' otherlv_10= ':' ( (lv_evaluations_11_0= ruleEvaluationList ) ) otherlv_12= '}' ) ;
    public final EObject ruleTrain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_dataset_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_split_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_evaluations_11_0 = null;



        	enterRule();

        try {
            // InternalPClassifier.g:306:2: ( (otherlv_0= 'Train(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '){' otherlv_3= 'dataset' otherlv_4= ':' ( (lv_dataset_5_0= RULE_STRING ) ) otherlv_6= 'split' otherlv_7= ':' ( (lv_split_8_0= RULE_FLOAT ) ) otherlv_9= 'evaluations' otherlv_10= ':' ( (lv_evaluations_11_0= ruleEvaluationList ) ) otherlv_12= '}' ) )
            // InternalPClassifier.g:307:2: (otherlv_0= 'Train(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '){' otherlv_3= 'dataset' otherlv_4= ':' ( (lv_dataset_5_0= RULE_STRING ) ) otherlv_6= 'split' otherlv_7= ':' ( (lv_split_8_0= RULE_FLOAT ) ) otherlv_9= 'evaluations' otherlv_10= ':' ( (lv_evaluations_11_0= ruleEvaluationList ) ) otherlv_12= '}' )
            {
            // InternalPClassifier.g:307:2: (otherlv_0= 'Train(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '){' otherlv_3= 'dataset' otherlv_4= ':' ( (lv_dataset_5_0= RULE_STRING ) ) otherlv_6= 'split' otherlv_7= ':' ( (lv_split_8_0= RULE_FLOAT ) ) otherlv_9= 'evaluations' otherlv_10= ':' ( (lv_evaluations_11_0= ruleEvaluationList ) ) otherlv_12= '}' )
            // InternalPClassifier.g:308:3: otherlv_0= 'Train(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '){' otherlv_3= 'dataset' otherlv_4= ':' ( (lv_dataset_5_0= RULE_STRING ) ) otherlv_6= 'split' otherlv_7= ':' ( (lv_split_8_0= RULE_FLOAT ) ) otherlv_9= 'evaluations' otherlv_10= ':' ( (lv_evaluations_11_0= ruleEvaluationList ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTrainAccess().getTrainKeyword_0());
            		
            // InternalPClassifier.g:312:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPClassifier.g:313:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPClassifier.g:313:4: (lv_name_1_0= RULE_ID )
            // InternalPClassifier.g:314:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTrainAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTrainRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getTrainAccess().getRightParenthesisLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getTrainAccess().getDatasetKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getTrainAccess().getColonKeyword_4());
            		
            // InternalPClassifier.g:342:3: ( (lv_dataset_5_0= RULE_STRING ) )
            // InternalPClassifier.g:343:4: (lv_dataset_5_0= RULE_STRING )
            {
            // InternalPClassifier.g:343:4: (lv_dataset_5_0= RULE_STRING )
            // InternalPClassifier.g:344:5: lv_dataset_5_0= RULE_STRING
            {
            lv_dataset_5_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_dataset_5_0, grammarAccess.getTrainAccess().getDatasetSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTrainRule());
            					}
            					setWithLastConsumed(
            						current,
            						"dataset",
            						lv_dataset_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,21,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getTrainAccess().getSplitKeyword_6());
            		
            otherlv_7=(Token)match(input,15,FOLLOW_16); 

            			newLeafNode(otherlv_7, grammarAccess.getTrainAccess().getColonKeyword_7());
            		
            // InternalPClassifier.g:368:3: ( (lv_split_8_0= RULE_FLOAT ) )
            // InternalPClassifier.g:369:4: (lv_split_8_0= RULE_FLOAT )
            {
            // InternalPClassifier.g:369:4: (lv_split_8_0= RULE_FLOAT )
            // InternalPClassifier.g:370:5: lv_split_8_0= RULE_FLOAT
            {
            lv_split_8_0=(Token)match(input,RULE_FLOAT,FOLLOW_17); 

            					newLeafNode(lv_split_8_0, grammarAccess.getTrainAccess().getSplitFLOATTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTrainRule());
            					}
            					setWithLastConsumed(
            						current,
            						"split",
            						lv_split_8_0,
            						"org.xtext.classifier.dsl.PClassifier.FLOAT");
            				

            }


            }

            otherlv_9=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_9, grammarAccess.getTrainAccess().getEvaluationsKeyword_9());
            		
            otherlv_10=(Token)match(input,15,FOLLOW_18); 

            			newLeafNode(otherlv_10, grammarAccess.getTrainAccess().getColonKeyword_10());
            		
            // InternalPClassifier.g:394:3: ( (lv_evaluations_11_0= ruleEvaluationList ) )
            // InternalPClassifier.g:395:4: (lv_evaluations_11_0= ruleEvaluationList )
            {
            // InternalPClassifier.g:395:4: (lv_evaluations_11_0= ruleEvaluationList )
            // InternalPClassifier.g:396:5: lv_evaluations_11_0= ruleEvaluationList
            {

            					newCompositeNode(grammarAccess.getTrainAccess().getEvaluationsEvaluationListParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_13);
            lv_evaluations_11_0=ruleEvaluationList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTrainRule());
            					}
            					set(
            						current,
            						"evaluations",
            						lv_evaluations_11_0,
            						"org.xtext.classifier.dsl.PClassifier.EvaluationList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getTrainAccess().getRightCurlyBracketKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTrain"


    // $ANTLR start "entryRuleExecute"
    // InternalPClassifier.g:421:1: entryRuleExecute returns [EObject current=null] : iv_ruleExecute= ruleExecute EOF ;
    public final EObject entryRuleExecute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExecute = null;


        try {
            // InternalPClassifier.g:421:48: (iv_ruleExecute= ruleExecute EOF )
            // InternalPClassifier.g:422:2: iv_ruleExecute= ruleExecute EOF
            {
             newCompositeNode(grammarAccess.getExecuteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExecute=ruleExecute();

            state._fsp--;

             current =iv_ruleExecute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExecute"


    // $ANTLR start "ruleExecute"
    // InternalPClassifier.g:428:1: ruleExecute returns [EObject current=null] : (otherlv_0= 'Execute(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '){' otherlv_3= 'input' otherlv_4= ':' ( (lv_input_5_0= RULE_STRING ) ) otherlv_6= 'output' otherlv_7= ':' ( (lv_output_8_0= RULE_STRING ) ) otherlv_9= '}' ) ;
    public final EObject ruleExecute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_input_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_output_8_0=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalPClassifier.g:434:2: ( (otherlv_0= 'Execute(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '){' otherlv_3= 'input' otherlv_4= ':' ( (lv_input_5_0= RULE_STRING ) ) otherlv_6= 'output' otherlv_7= ':' ( (lv_output_8_0= RULE_STRING ) ) otherlv_9= '}' ) )
            // InternalPClassifier.g:435:2: (otherlv_0= 'Execute(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '){' otherlv_3= 'input' otherlv_4= ':' ( (lv_input_5_0= RULE_STRING ) ) otherlv_6= 'output' otherlv_7= ':' ( (lv_output_8_0= RULE_STRING ) ) otherlv_9= '}' )
            {
            // InternalPClassifier.g:435:2: (otherlv_0= 'Execute(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '){' otherlv_3= 'input' otherlv_4= ':' ( (lv_input_5_0= RULE_STRING ) ) otherlv_6= 'output' otherlv_7= ':' ( (lv_output_8_0= RULE_STRING ) ) otherlv_9= '}' )
            // InternalPClassifier.g:436:3: otherlv_0= 'Execute(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '){' otherlv_3= 'input' otherlv_4= ':' ( (lv_input_5_0= RULE_STRING ) ) otherlv_6= 'output' otherlv_7= ':' ( (lv_output_8_0= RULE_STRING ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getExecuteAccess().getExecuteKeyword_0());
            		
            // InternalPClassifier.g:440:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPClassifier.g:441:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPClassifier.g:441:4: (lv_name_1_0= RULE_ID )
            // InternalPClassifier.g:442:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getExecuteAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExecuteRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getExecuteAccess().getRightParenthesisLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,24,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getExecuteAccess().getInputKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getExecuteAccess().getColonKeyword_4());
            		
            // InternalPClassifier.g:470:3: ( (lv_input_5_0= RULE_STRING ) )
            // InternalPClassifier.g:471:4: (lv_input_5_0= RULE_STRING )
            {
            // InternalPClassifier.g:471:4: (lv_input_5_0= RULE_STRING )
            // InternalPClassifier.g:472:5: lv_input_5_0= RULE_STRING
            {
            lv_input_5_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

            					newLeafNode(lv_input_5_0, grammarAccess.getExecuteAccess().getInputSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExecuteRule());
            					}
            					setWithLastConsumed(
            						current,
            						"input",
            						lv_input_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,25,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getExecuteAccess().getOutputKeyword_6());
            		
            otherlv_7=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_7, grammarAccess.getExecuteAccess().getColonKeyword_7());
            		
            // InternalPClassifier.g:496:3: ( (lv_output_8_0= RULE_STRING ) )
            // InternalPClassifier.g:497:4: (lv_output_8_0= RULE_STRING )
            {
            // InternalPClassifier.g:497:4: (lv_output_8_0= RULE_STRING )
            // InternalPClassifier.g:498:5: lv_output_8_0= RULE_STRING
            {
            lv_output_8_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            					newLeafNode(lv_output_8_0, grammarAccess.getExecuteAccess().getOutputSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExecuteRule());
            					}
            					setWithLastConsumed(
            						current,
            						"output",
            						lv_output_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_9=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getExecuteAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExecute"


    // $ANTLR start "entryRuleLoad"
    // InternalPClassifier.g:522:1: entryRuleLoad returns [EObject current=null] : iv_ruleLoad= ruleLoad EOF ;
    public final EObject entryRuleLoad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoad = null;


        try {
            // InternalPClassifier.g:522:45: (iv_ruleLoad= ruleLoad EOF )
            // InternalPClassifier.g:523:2: iv_ruleLoad= ruleLoad EOF
            {
             newCompositeNode(grammarAccess.getLoadRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoad=ruleLoad();

            state._fsp--;

             current =iv_ruleLoad; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLoad"


    // $ANTLR start "ruleLoad"
    // InternalPClassifier.g:529:1: ruleLoad returns [EObject current=null] : (otherlv_0= 'Load(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '){' otherlv_3= 'file' otherlv_4= ':' ( (lv_file_5_0= RULE_STRING ) ) otherlv_6= '}' ) ;
    public final EObject ruleLoad() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_file_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalPClassifier.g:535:2: ( (otherlv_0= 'Load(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '){' otherlv_3= 'file' otherlv_4= ':' ( (lv_file_5_0= RULE_STRING ) ) otherlv_6= '}' ) )
            // InternalPClassifier.g:536:2: (otherlv_0= 'Load(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '){' otherlv_3= 'file' otherlv_4= ':' ( (lv_file_5_0= RULE_STRING ) ) otherlv_6= '}' )
            {
            // InternalPClassifier.g:536:2: (otherlv_0= 'Load(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '){' otherlv_3= 'file' otherlv_4= ':' ( (lv_file_5_0= RULE_STRING ) ) otherlv_6= '}' )
            // InternalPClassifier.g:537:3: otherlv_0= 'Load(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '){' otherlv_3= 'file' otherlv_4= ':' ( (lv_file_5_0= RULE_STRING ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLoadAccess().getLoadKeyword_0());
            		
            // InternalPClassifier.g:541:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPClassifier.g:542:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPClassifier.g:542:4: (lv_name_1_0= RULE_ID )
            // InternalPClassifier.g:543:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLoadAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLoadRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getLoadAccess().getRightParenthesisLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,27,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getLoadAccess().getFileKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getLoadAccess().getColonKeyword_4());
            		
            // InternalPClassifier.g:571:3: ( (lv_file_5_0= RULE_STRING ) )
            // InternalPClassifier.g:572:4: (lv_file_5_0= RULE_STRING )
            {
            // InternalPClassifier.g:572:4: (lv_file_5_0= RULE_STRING )
            // InternalPClassifier.g:573:5: lv_file_5_0= RULE_STRING
            {
            lv_file_5_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            					newLeafNode(lv_file_5_0, grammarAccess.getLoadAccess().getFileSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLoadRule());
            					}
            					setWithLastConsumed(
            						current,
            						"file",
            						lv_file_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getLoadAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLoad"


    // $ANTLR start "entryRuleSave"
    // InternalPClassifier.g:597:1: entryRuleSave returns [EObject current=null] : iv_ruleSave= ruleSave EOF ;
    public final EObject entryRuleSave() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSave = null;


        try {
            // InternalPClassifier.g:597:45: (iv_ruleSave= ruleSave EOF )
            // InternalPClassifier.g:598:2: iv_ruleSave= ruleSave EOF
            {
             newCompositeNode(grammarAccess.getSaveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSave=ruleSave();

            state._fsp--;

             current =iv_ruleSave; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSave"


    // $ANTLR start "ruleSave"
    // InternalPClassifier.g:604:1: ruleSave returns [EObject current=null] : (otherlv_0= 'Save(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '){' otherlv_3= 'file' otherlv_4= ':' ( (lv_file_5_0= RULE_STRING ) ) otherlv_6= '}' ) ;
    public final EObject ruleSave() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_file_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalPClassifier.g:610:2: ( (otherlv_0= 'Save(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '){' otherlv_3= 'file' otherlv_4= ':' ( (lv_file_5_0= RULE_STRING ) ) otherlv_6= '}' ) )
            // InternalPClassifier.g:611:2: (otherlv_0= 'Save(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '){' otherlv_3= 'file' otherlv_4= ':' ( (lv_file_5_0= RULE_STRING ) ) otherlv_6= '}' )
            {
            // InternalPClassifier.g:611:2: (otherlv_0= 'Save(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '){' otherlv_3= 'file' otherlv_4= ':' ( (lv_file_5_0= RULE_STRING ) ) otherlv_6= '}' )
            // InternalPClassifier.g:612:3: otherlv_0= 'Save(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '){' otherlv_3= 'file' otherlv_4= ':' ( (lv_file_5_0= RULE_STRING ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSaveAccess().getSaveKeyword_0());
            		
            // InternalPClassifier.g:616:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPClassifier.g:617:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPClassifier.g:617:4: (lv_name_1_0= RULE_ID )
            // InternalPClassifier.g:618:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSaveAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSaveRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getSaveAccess().getRightParenthesisLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,27,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getSaveAccess().getFileKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getSaveAccess().getColonKeyword_4());
            		
            // InternalPClassifier.g:646:3: ( (lv_file_5_0= RULE_STRING ) )
            // InternalPClassifier.g:647:4: (lv_file_5_0= RULE_STRING )
            {
            // InternalPClassifier.g:647:4: (lv_file_5_0= RULE_STRING )
            // InternalPClassifier.g:648:5: lv_file_5_0= RULE_STRING
            {
            lv_file_5_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            					newLeafNode(lv_file_5_0, grammarAccess.getSaveAccess().getFileSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSaveRule());
            					}
            					setWithLastConsumed(
            						current,
            						"file",
            						lv_file_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getSaveAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSave"


    // $ANTLR start "entryRuleFeatureList"
    // InternalPClassifier.g:672:1: entryRuleFeatureList returns [EObject current=null] : iv_ruleFeatureList= ruleFeatureList EOF ;
    public final EObject entryRuleFeatureList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureList = null;


        try {
            // InternalPClassifier.g:672:52: (iv_ruleFeatureList= ruleFeatureList EOF )
            // InternalPClassifier.g:673:2: iv_ruleFeatureList= ruleFeatureList EOF
            {
             newCompositeNode(grammarAccess.getFeatureListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeatureList=ruleFeatureList();

            state._fsp--;

             current =iv_ruleFeatureList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeatureList"


    // $ANTLR start "ruleFeatureList"
    // InternalPClassifier.g:679:1: ruleFeatureList returns [EObject current=null] : ( (otherlv_0= ',' )* ( (lv_vals_1_0= RULE_STRING ) ) ( (otherlv_2= ',' )+ ( (lv_vals_3_0= RULE_STRING ) ) )* (otherlv_4= ',' )* ) ;
    public final EObject ruleFeatureList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_vals_1_0=null;
        Token otherlv_2=null;
        Token lv_vals_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalPClassifier.g:685:2: ( ( (otherlv_0= ',' )* ( (lv_vals_1_0= RULE_STRING ) ) ( (otherlv_2= ',' )+ ( (lv_vals_3_0= RULE_STRING ) ) )* (otherlv_4= ',' )* ) )
            // InternalPClassifier.g:686:2: ( (otherlv_0= ',' )* ( (lv_vals_1_0= RULE_STRING ) ) ( (otherlv_2= ',' )+ ( (lv_vals_3_0= RULE_STRING ) ) )* (otherlv_4= ',' )* )
            {
            // InternalPClassifier.g:686:2: ( (otherlv_0= ',' )* ( (lv_vals_1_0= RULE_STRING ) ) ( (otherlv_2= ',' )+ ( (lv_vals_3_0= RULE_STRING ) ) )* (otherlv_4= ',' )* )
            // InternalPClassifier.g:687:3: (otherlv_0= ',' )* ( (lv_vals_1_0= RULE_STRING ) ) ( (otherlv_2= ',' )+ ( (lv_vals_3_0= RULE_STRING ) ) )* (otherlv_4= ',' )*
            {
            // InternalPClassifier.g:687:3: (otherlv_0= ',' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==29) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPClassifier.g:688:4: otherlv_0= ','
            	    {
            	    otherlv_0=(Token)match(input,29,FOLLOW_8); 

            	    				newLeafNode(otherlv_0, grammarAccess.getFeatureListAccess().getCommaKeyword_0());
            	    			

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalPClassifier.g:693:3: ( (lv_vals_1_0= RULE_STRING ) )
            // InternalPClassifier.g:694:4: (lv_vals_1_0= RULE_STRING )
            {
            // InternalPClassifier.g:694:4: (lv_vals_1_0= RULE_STRING )
            // InternalPClassifier.g:695:5: lv_vals_1_0= RULE_STRING
            {
            lv_vals_1_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

            					newLeafNode(lv_vals_1_0, grammarAccess.getFeatureListAccess().getValsSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFeatureListRule());
            					}
            					addWithLastConsumed(
            						current,
            						"vals",
            						lv_vals_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalPClassifier.g:711:3: ( (otherlv_2= ',' )+ ( (lv_vals_3_0= RULE_STRING ) ) )*
            loop5:
            do {
                int alt5=2;
                alt5 = dfa5.predict(input);
                switch (alt5) {
            	case 1 :
            	    // InternalPClassifier.g:712:4: (otherlv_2= ',' )+ ( (lv_vals_3_0= RULE_STRING ) )
            	    {
            	    // InternalPClassifier.g:712:4: (otherlv_2= ',' )+
            	    int cnt4=0;
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( (LA4_0==29) ) {
            	            alt4=1;
            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // InternalPClassifier.g:713:5: otherlv_2= ','
            	    	    {
            	    	    otherlv_2=(Token)match(input,29,FOLLOW_8); 

            	    	    					newLeafNode(otherlv_2, grammarAccess.getFeatureListAccess().getCommaKeyword_2_0());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt4 >= 1 ) break loop4;
            	                EarlyExitException eee =
            	                    new EarlyExitException(4, input);
            	                throw eee;
            	        }
            	        cnt4++;
            	    } while (true);

            	    // InternalPClassifier.g:718:4: ( (lv_vals_3_0= RULE_STRING ) )
            	    // InternalPClassifier.g:719:5: (lv_vals_3_0= RULE_STRING )
            	    {
            	    // InternalPClassifier.g:719:5: (lv_vals_3_0= RULE_STRING )
            	    // InternalPClassifier.g:720:6: lv_vals_3_0= RULE_STRING
            	    {
            	    lv_vals_3_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

            	    						newLeafNode(lv_vals_3_0, grammarAccess.getFeatureListAccess().getValsSTRINGTerminalRuleCall_2_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getFeatureListRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"vals",
            	    							lv_vals_3_0,
            	    							"org.eclipse.xtext.common.Terminals.STRING");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalPClassifier.g:737:3: (otherlv_4= ',' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==29) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalPClassifier.g:738:4: otherlv_4= ','
            	    {
            	    otherlv_4=(Token)match(input,29,FOLLOW_22); 

            	    				newLeafNode(otherlv_4, grammarAccess.getFeatureListAccess().getCommaKeyword_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeatureList"


    // $ANTLR start "entryRuleEvaluationList"
    // InternalPClassifier.g:747:1: entryRuleEvaluationList returns [EObject current=null] : iv_ruleEvaluationList= ruleEvaluationList EOF ;
    public final EObject entryRuleEvaluationList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvaluationList = null;


        try {
            // InternalPClassifier.g:747:55: (iv_ruleEvaluationList= ruleEvaluationList EOF )
            // InternalPClassifier.g:748:2: iv_ruleEvaluationList= ruleEvaluationList EOF
            {
             newCompositeNode(grammarAccess.getEvaluationListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvaluationList=ruleEvaluationList();

            state._fsp--;

             current =iv_ruleEvaluationList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvaluationList"


    // $ANTLR start "ruleEvaluationList"
    // InternalPClassifier.g:754:1: ruleEvaluationList returns [EObject current=null] : ( (otherlv_0= ',' )* ( (lv_vals_1_0= ruleEvaluation ) ) ( (otherlv_2= ',' )+ ( (lv_vals_3_0= ruleEvaluation ) ) )* (otherlv_4= ',' )* ) ;
    public final EObject ruleEvaluationList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_vals_1_0 = null;

        Enumerator lv_vals_3_0 = null;



        	enterRule();

        try {
            // InternalPClassifier.g:760:2: ( ( (otherlv_0= ',' )* ( (lv_vals_1_0= ruleEvaluation ) ) ( (otherlv_2= ',' )+ ( (lv_vals_3_0= ruleEvaluation ) ) )* (otherlv_4= ',' )* ) )
            // InternalPClassifier.g:761:2: ( (otherlv_0= ',' )* ( (lv_vals_1_0= ruleEvaluation ) ) ( (otherlv_2= ',' )+ ( (lv_vals_3_0= ruleEvaluation ) ) )* (otherlv_4= ',' )* )
            {
            // InternalPClassifier.g:761:2: ( (otherlv_0= ',' )* ( (lv_vals_1_0= ruleEvaluation ) ) ( (otherlv_2= ',' )+ ( (lv_vals_3_0= ruleEvaluation ) ) )* (otherlv_4= ',' )* )
            // InternalPClassifier.g:762:3: (otherlv_0= ',' )* ( (lv_vals_1_0= ruleEvaluation ) ) ( (otherlv_2= ',' )+ ( (lv_vals_3_0= ruleEvaluation ) ) )* (otherlv_4= ',' )*
            {
            // InternalPClassifier.g:762:3: (otherlv_0= ',' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==29) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalPClassifier.g:763:4: otherlv_0= ','
            	    {
            	    otherlv_0=(Token)match(input,29,FOLLOW_18); 

            	    				newLeafNode(otherlv_0, grammarAccess.getEvaluationListAccess().getCommaKeyword_0());
            	    			

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // InternalPClassifier.g:768:3: ( (lv_vals_1_0= ruleEvaluation ) )
            // InternalPClassifier.g:769:4: (lv_vals_1_0= ruleEvaluation )
            {
            // InternalPClassifier.g:769:4: (lv_vals_1_0= ruleEvaluation )
            // InternalPClassifier.g:770:5: lv_vals_1_0= ruleEvaluation
            {

            					newCompositeNode(grammarAccess.getEvaluationListAccess().getValsEvaluationEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_22);
            lv_vals_1_0=ruleEvaluation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEvaluationListRule());
            					}
            					add(
            						current,
            						"vals",
            						lv_vals_1_0,
            						"org.xtext.classifier.dsl.PClassifier.Evaluation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPClassifier.g:787:3: ( (otherlv_2= ',' )+ ( (lv_vals_3_0= ruleEvaluation ) ) )*
            loop9:
            do {
                int alt9=2;
                alt9 = dfa9.predict(input);
                switch (alt9) {
            	case 1 :
            	    // InternalPClassifier.g:788:4: (otherlv_2= ',' )+ ( (lv_vals_3_0= ruleEvaluation ) )
            	    {
            	    // InternalPClassifier.g:788:4: (otherlv_2= ',' )+
            	    int cnt8=0;
            	    loop8:
            	    do {
            	        int alt8=2;
            	        int LA8_0 = input.LA(1);

            	        if ( (LA8_0==29) ) {
            	            alt8=1;
            	        }


            	        switch (alt8) {
            	    	case 1 :
            	    	    // InternalPClassifier.g:789:5: otherlv_2= ','
            	    	    {
            	    	    otherlv_2=(Token)match(input,29,FOLLOW_18); 

            	    	    					newLeafNode(otherlv_2, grammarAccess.getEvaluationListAccess().getCommaKeyword_2_0());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt8 >= 1 ) break loop8;
            	                EarlyExitException eee =
            	                    new EarlyExitException(8, input);
            	                throw eee;
            	        }
            	        cnt8++;
            	    } while (true);

            	    // InternalPClassifier.g:794:4: ( (lv_vals_3_0= ruleEvaluation ) )
            	    // InternalPClassifier.g:795:5: (lv_vals_3_0= ruleEvaluation )
            	    {
            	    // InternalPClassifier.g:795:5: (lv_vals_3_0= ruleEvaluation )
            	    // InternalPClassifier.g:796:6: lv_vals_3_0= ruleEvaluation
            	    {

            	    						newCompositeNode(grammarAccess.getEvaluationListAccess().getValsEvaluationEnumRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    lv_vals_3_0=ruleEvaluation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEvaluationListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"vals",
            	    							lv_vals_3_0,
            	    							"org.xtext.classifier.dsl.PClassifier.Evaluation");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalPClassifier.g:814:3: (otherlv_4= ',' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==29) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalPClassifier.g:815:4: otherlv_4= ','
            	    {
            	    otherlv_4=(Token)match(input,29,FOLLOW_22); 

            	    				newLeafNode(otherlv_4, grammarAccess.getEvaluationListAccess().getCommaKeyword_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvaluationList"


    // $ANTLR start "ruleMLModel"
    // InternalPClassifier.g:824:1: ruleMLModel returns [Enumerator current=null] : ( (enumLiteral_0= 'DecisionTree' ) | (enumLiteral_1= 'SVC' ) | (enumLiteral_2= 'RandomForest' ) | (enumLiteral_3= 'MLPClassifier' ) ) ;
    public final Enumerator ruleMLModel() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalPClassifier.g:830:2: ( ( (enumLiteral_0= 'DecisionTree' ) | (enumLiteral_1= 'SVC' ) | (enumLiteral_2= 'RandomForest' ) | (enumLiteral_3= 'MLPClassifier' ) ) )
            // InternalPClassifier.g:831:2: ( (enumLiteral_0= 'DecisionTree' ) | (enumLiteral_1= 'SVC' ) | (enumLiteral_2= 'RandomForest' ) | (enumLiteral_3= 'MLPClassifier' ) )
            {
            // InternalPClassifier.g:831:2: ( (enumLiteral_0= 'DecisionTree' ) | (enumLiteral_1= 'SVC' ) | (enumLiteral_2= 'RandomForest' ) | (enumLiteral_3= 'MLPClassifier' ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt11=1;
                }
                break;
            case 31:
                {
                alt11=2;
                }
                break;
            case 32:
                {
                alt11=3;
                }
                break;
            case 33:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalPClassifier.g:832:3: (enumLiteral_0= 'DecisionTree' )
                    {
                    // InternalPClassifier.g:832:3: (enumLiteral_0= 'DecisionTree' )
                    // InternalPClassifier.g:833:4: enumLiteral_0= 'DecisionTree'
                    {
                    enumLiteral_0=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getMLModelAccess().getDecisonTreeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMLModelAccess().getDecisonTreeEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPClassifier.g:840:3: (enumLiteral_1= 'SVC' )
                    {
                    // InternalPClassifier.g:840:3: (enumLiteral_1= 'SVC' )
                    // InternalPClassifier.g:841:4: enumLiteral_1= 'SVC'
                    {
                    enumLiteral_1=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getMLModelAccess().getSVCEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMLModelAccess().getSVCEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalPClassifier.g:848:3: (enumLiteral_2= 'RandomForest' )
                    {
                    // InternalPClassifier.g:848:3: (enumLiteral_2= 'RandomForest' )
                    // InternalPClassifier.g:849:4: enumLiteral_2= 'RandomForest'
                    {
                    enumLiteral_2=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getMLModelAccess().getRandomForestEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMLModelAccess().getRandomForestEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalPClassifier.g:856:3: (enumLiteral_3= 'MLPClassifier' )
                    {
                    // InternalPClassifier.g:856:3: (enumLiteral_3= 'MLPClassifier' )
                    // InternalPClassifier.g:857:4: enumLiteral_3= 'MLPClassifier'
                    {
                    enumLiteral_3=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getMLModelAccess().getMLPClassifierEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getMLModelAccess().getMLPClassifierEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMLModel"


    // $ANTLR start "ruleEvaluation"
    // InternalPClassifier.g:867:1: ruleEvaluation returns [Enumerator current=null] : ( (enumLiteral_0= 'accuracy' ) | (enumLiteral_1= 'f1' ) | (enumLiteral_2= 'recall' ) ) ;
    public final Enumerator ruleEvaluation() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalPClassifier.g:873:2: ( ( (enumLiteral_0= 'accuracy' ) | (enumLiteral_1= 'f1' ) | (enumLiteral_2= 'recall' ) ) )
            // InternalPClassifier.g:874:2: ( (enumLiteral_0= 'accuracy' ) | (enumLiteral_1= 'f1' ) | (enumLiteral_2= 'recall' ) )
            {
            // InternalPClassifier.g:874:2: ( (enumLiteral_0= 'accuracy' ) | (enumLiteral_1= 'f1' ) | (enumLiteral_2= 'recall' ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt12=1;
                }
                break;
            case 35:
                {
                alt12=2;
                }
                break;
            case 36:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalPClassifier.g:875:3: (enumLiteral_0= 'accuracy' )
                    {
                    // InternalPClassifier.g:875:3: (enumLiteral_0= 'accuracy' )
                    // InternalPClassifier.g:876:4: enumLiteral_0= 'accuracy'
                    {
                    enumLiteral_0=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getEvaluationAccess().getAccuracyEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEvaluationAccess().getAccuracyEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPClassifier.g:883:3: (enumLiteral_1= 'f1' )
                    {
                    // InternalPClassifier.g:883:3: (enumLiteral_1= 'f1' )
                    // InternalPClassifier.g:884:4: enumLiteral_1= 'f1'
                    {
                    enumLiteral_1=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getEvaluationAccess().getF1ScoreEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEvaluationAccess().getF1ScoreEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalPClassifier.g:891:3: (enumLiteral_2= 'recall' )
                    {
                    // InternalPClassifier.g:891:3: (enumLiteral_2= 'recall' )
                    // InternalPClassifier.g:892:4: enumLiteral_2= 'recall'
                    {
                    enumLiteral_2=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getEvaluationAccess().getRecallEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getEvaluationAccess().getRecallEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvaluation"

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA9 dfa9 = new DFA9(this);
    static final String dfa_1s = "\4\uffff";
    static final String dfa_2s = "\2\2\2\uffff";
    static final String dfa_3s = "\1\20\1\5\2\uffff";
    static final String dfa_4s = "\2\35\2\uffff";
    static final String dfa_5s = "\2\uffff\1\2\1\1";
    static final String dfa_6s = "\4\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\14\uffff\1\1",
            "\1\3\12\uffff\1\2\14\uffff\1\1",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 711:3: ( (otherlv_2= ',' )+ ( (lv_vals_3_0= RULE_STRING ) ) )*";
        }
    }
    static final String dfa_8s = "\2\22\2\uffff";
    static final String dfa_9s = "\1\35\1\44\2\uffff";
    static final String[] dfa_10s = {
            "\1\2\12\uffff\1\1",
            "\1\2\12\uffff\1\1\4\uffff\3\3",
            "",
            ""
    };
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[][] dfa_10 = unpackEncodedStringArray(dfa_10s);

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_10;
        }
        public String getDescription() {
            return "()* loopback of 787:3: ( (otherlv_2= ',' )+ ( (lv_vals_3_0= ruleEvaluation ) ) )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000014881002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000020000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000003C0000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000001C20000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000002L});

}