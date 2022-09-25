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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_FLOAT", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Classifier('", "'){'", "'features'", "':'", "'target'", "'model'", "'}'", "'Run('", "'dataset'", "'split'", "'evaluations'", "'Load('", "'file'", "'Save('", "','", "'DecisionTree'", "'SVM'", "'accuracy'", "'f1'", "'recall'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
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

                if ( (LA1_0==12||LA1_0==19||LA1_0==23||LA1_0==25) ) {
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
    // InternalPClassifier.g:108:1: ruleStatement returns [EObject current=null] : (this_Classifier_0= ruleClassifier | this_Run_1= ruleRun | this_Load_2= ruleLoad | this_Save_3= ruleSave ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_Classifier_0 = null;

        EObject this_Run_1 = null;

        EObject this_Load_2 = null;

        EObject this_Save_3 = null;



        	enterRule();

        try {
            // InternalPClassifier.g:114:2: ( (this_Classifier_0= ruleClassifier | this_Run_1= ruleRun | this_Load_2= ruleLoad | this_Save_3= ruleSave ) )
            // InternalPClassifier.g:115:2: (this_Classifier_0= ruleClassifier | this_Run_1= ruleRun | this_Load_2= ruleLoad | this_Save_3= ruleSave )
            {
            // InternalPClassifier.g:115:2: (this_Classifier_0= ruleClassifier | this_Run_1= ruleRun | this_Load_2= ruleLoad | this_Save_3= ruleSave )
            int alt2=4;
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
            case 25:
                {
                alt2=4;
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
                    // InternalPClassifier.g:125:3: this_Run_1= ruleRun
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getRunParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Run_1=ruleRun();

                    state._fsp--;


                    			current = this_Run_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPClassifier.g:134:3: this_Load_2= ruleLoad
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getLoadParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Load_2=ruleLoad();

                    state._fsp--;


                    			current = this_Load_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalPClassifier.g:143:3: this_Save_3= ruleSave
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getSaveParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Save_3=ruleSave();

                    state._fsp--;


                    			current = this_Save_3;
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
    // InternalPClassifier.g:155:1: entryRuleClassifier returns [EObject current=null] : iv_ruleClassifier= ruleClassifier EOF ;
    public final EObject entryRuleClassifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassifier = null;


        try {
            // InternalPClassifier.g:155:51: (iv_ruleClassifier= ruleClassifier EOF )
            // InternalPClassifier.g:156:2: iv_ruleClassifier= ruleClassifier EOF
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
    // InternalPClassifier.g:162:1: ruleClassifier returns [EObject current=null] : (otherlv_0= 'Classifier(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '){' otherlv_3= 'features' otherlv_4= ':' ( (lv_features_5_0= ruleFeatureList ) ) otherlv_6= 'target' otherlv_7= ':' ( (lv_target_8_0= RULE_STRING ) ) otherlv_9= 'model' otherlv_10= ':' ( (lv_model_11_0= ruleMLModel ) ) otherlv_12= '}' ) ;
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
            // InternalPClassifier.g:168:2: ( (otherlv_0= 'Classifier(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '){' otherlv_3= 'features' otherlv_4= ':' ( (lv_features_5_0= ruleFeatureList ) ) otherlv_6= 'target' otherlv_7= ':' ( (lv_target_8_0= RULE_STRING ) ) otherlv_9= 'model' otherlv_10= ':' ( (lv_model_11_0= ruleMLModel ) ) otherlv_12= '}' ) )
            // InternalPClassifier.g:169:2: (otherlv_0= 'Classifier(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '){' otherlv_3= 'features' otherlv_4= ':' ( (lv_features_5_0= ruleFeatureList ) ) otherlv_6= 'target' otherlv_7= ':' ( (lv_target_8_0= RULE_STRING ) ) otherlv_9= 'model' otherlv_10= ':' ( (lv_model_11_0= ruleMLModel ) ) otherlv_12= '}' )
            {
            // InternalPClassifier.g:169:2: (otherlv_0= 'Classifier(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '){' otherlv_3= 'features' otherlv_4= ':' ( (lv_features_5_0= ruleFeatureList ) ) otherlv_6= 'target' otherlv_7= ':' ( (lv_target_8_0= RULE_STRING ) ) otherlv_9= 'model' otherlv_10= ':' ( (lv_model_11_0= ruleMLModel ) ) otherlv_12= '}' )
            // InternalPClassifier.g:170:3: otherlv_0= 'Classifier(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '){' otherlv_3= 'features' otherlv_4= ':' ( (lv_features_5_0= ruleFeatureList ) ) otherlv_6= 'target' otherlv_7= ':' ( (lv_target_8_0= RULE_STRING ) ) otherlv_9= 'model' otherlv_10= ':' ( (lv_model_11_0= ruleMLModel ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getClassifierAccess().getClassifierKeyword_0());
            		
            // InternalPClassifier.g:174:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPClassifier.g:175:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPClassifier.g:175:4: (lv_name_1_0= RULE_ID )
            // InternalPClassifier.g:176:5: lv_name_1_0= RULE_ID
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
            		
            // InternalPClassifier.g:204:3: ( (lv_features_5_0= ruleFeatureList ) )
            // InternalPClassifier.g:205:4: (lv_features_5_0= ruleFeatureList )
            {
            // InternalPClassifier.g:205:4: (lv_features_5_0= ruleFeatureList )
            // InternalPClassifier.g:206:5: lv_features_5_0= ruleFeatureList
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
            		
            // InternalPClassifier.g:231:3: ( (lv_target_8_0= RULE_STRING ) )
            // InternalPClassifier.g:232:4: (lv_target_8_0= RULE_STRING )
            {
            // InternalPClassifier.g:232:4: (lv_target_8_0= RULE_STRING )
            // InternalPClassifier.g:233:5: lv_target_8_0= RULE_STRING
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
            		
            // InternalPClassifier.g:257:3: ( (lv_model_11_0= ruleMLModel ) )
            // InternalPClassifier.g:258:4: (lv_model_11_0= ruleMLModel )
            {
            // InternalPClassifier.g:258:4: (lv_model_11_0= ruleMLModel )
            // InternalPClassifier.g:259:5: lv_model_11_0= ruleMLModel
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


    // $ANTLR start "entryRuleRun"
    // InternalPClassifier.g:284:1: entryRuleRun returns [EObject current=null] : iv_ruleRun= ruleRun EOF ;
    public final EObject entryRuleRun() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRun = null;


        try {
            // InternalPClassifier.g:284:44: (iv_ruleRun= ruleRun EOF )
            // InternalPClassifier.g:285:2: iv_ruleRun= ruleRun EOF
            {
             newCompositeNode(grammarAccess.getRunRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRun=ruleRun();

            state._fsp--;

             current =iv_ruleRun; 
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
    // $ANTLR end "entryRuleRun"


    // $ANTLR start "ruleRun"
    // InternalPClassifier.g:291:1: ruleRun returns [EObject current=null] : (otherlv_0= 'Run(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '){' otherlv_3= 'dataset' otherlv_4= ':' ( (lv_dataset_5_0= RULE_STRING ) ) otherlv_6= 'split' otherlv_7= ':' ( (lv_split_8_0= RULE_FLOAT ) ) otherlv_9= 'evaluations' otherlv_10= ':' ( (lv_evaluations_11_0= ruleEvaluationList ) ) otherlv_12= '}' ) ;
    public final EObject ruleRun() throws RecognitionException {
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
            // InternalPClassifier.g:297:2: ( (otherlv_0= 'Run(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '){' otherlv_3= 'dataset' otherlv_4= ':' ( (lv_dataset_5_0= RULE_STRING ) ) otherlv_6= 'split' otherlv_7= ':' ( (lv_split_8_0= RULE_FLOAT ) ) otherlv_9= 'evaluations' otherlv_10= ':' ( (lv_evaluations_11_0= ruleEvaluationList ) ) otherlv_12= '}' ) )
            // InternalPClassifier.g:298:2: (otherlv_0= 'Run(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '){' otherlv_3= 'dataset' otherlv_4= ':' ( (lv_dataset_5_0= RULE_STRING ) ) otherlv_6= 'split' otherlv_7= ':' ( (lv_split_8_0= RULE_FLOAT ) ) otherlv_9= 'evaluations' otherlv_10= ':' ( (lv_evaluations_11_0= ruleEvaluationList ) ) otherlv_12= '}' )
            {
            // InternalPClassifier.g:298:2: (otherlv_0= 'Run(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '){' otherlv_3= 'dataset' otherlv_4= ':' ( (lv_dataset_5_0= RULE_STRING ) ) otherlv_6= 'split' otherlv_7= ':' ( (lv_split_8_0= RULE_FLOAT ) ) otherlv_9= 'evaluations' otherlv_10= ':' ( (lv_evaluations_11_0= ruleEvaluationList ) ) otherlv_12= '}' )
            // InternalPClassifier.g:299:3: otherlv_0= 'Run(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '){' otherlv_3= 'dataset' otherlv_4= ':' ( (lv_dataset_5_0= RULE_STRING ) ) otherlv_6= 'split' otherlv_7= ':' ( (lv_split_8_0= RULE_FLOAT ) ) otherlv_9= 'evaluations' otherlv_10= ':' ( (lv_evaluations_11_0= ruleEvaluationList ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRunAccess().getRunKeyword_0());
            		
            // InternalPClassifier.g:303:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPClassifier.g:304:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPClassifier.g:304:4: (lv_name_1_0= RULE_ID )
            // InternalPClassifier.g:305:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRunAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRunRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getRunAccess().getRightParenthesisLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getRunAccess().getDatasetKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getRunAccess().getColonKeyword_4());
            		
            // InternalPClassifier.g:333:3: ( (lv_dataset_5_0= RULE_STRING ) )
            // InternalPClassifier.g:334:4: (lv_dataset_5_0= RULE_STRING )
            {
            // InternalPClassifier.g:334:4: (lv_dataset_5_0= RULE_STRING )
            // InternalPClassifier.g:335:5: lv_dataset_5_0= RULE_STRING
            {
            lv_dataset_5_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_dataset_5_0, grammarAccess.getRunAccess().getDatasetSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRunRule());
            					}
            					setWithLastConsumed(
            						current,
            						"dataset",
            						lv_dataset_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,21,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getRunAccess().getSplitKeyword_6());
            		
            otherlv_7=(Token)match(input,15,FOLLOW_16); 

            			newLeafNode(otherlv_7, grammarAccess.getRunAccess().getColonKeyword_7());
            		
            // InternalPClassifier.g:359:3: ( (lv_split_8_0= RULE_FLOAT ) )
            // InternalPClassifier.g:360:4: (lv_split_8_0= RULE_FLOAT )
            {
            // InternalPClassifier.g:360:4: (lv_split_8_0= RULE_FLOAT )
            // InternalPClassifier.g:361:5: lv_split_8_0= RULE_FLOAT
            {
            lv_split_8_0=(Token)match(input,RULE_FLOAT,FOLLOW_17); 

            					newLeafNode(lv_split_8_0, grammarAccess.getRunAccess().getSplitFLOATTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRunRule());
            					}
            					setWithLastConsumed(
            						current,
            						"split",
            						lv_split_8_0,
            						"org.xtext.classifier.dsl.PClassifier.FLOAT");
            				

            }


            }

            otherlv_9=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_9, grammarAccess.getRunAccess().getEvaluationsKeyword_9());
            		
            otherlv_10=(Token)match(input,15,FOLLOW_18); 

            			newLeafNode(otherlv_10, grammarAccess.getRunAccess().getColonKeyword_10());
            		
            // InternalPClassifier.g:385:3: ( (lv_evaluations_11_0= ruleEvaluationList ) )
            // InternalPClassifier.g:386:4: (lv_evaluations_11_0= ruleEvaluationList )
            {
            // InternalPClassifier.g:386:4: (lv_evaluations_11_0= ruleEvaluationList )
            // InternalPClassifier.g:387:5: lv_evaluations_11_0= ruleEvaluationList
            {

            					newCompositeNode(grammarAccess.getRunAccess().getEvaluationsEvaluationListParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_13);
            lv_evaluations_11_0=ruleEvaluationList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRunRule());
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

            			newLeafNode(otherlv_12, grammarAccess.getRunAccess().getRightCurlyBracketKeyword_12());
            		

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
    // $ANTLR end "ruleRun"


    // $ANTLR start "entryRuleLoad"
    // InternalPClassifier.g:412:1: entryRuleLoad returns [EObject current=null] : iv_ruleLoad= ruleLoad EOF ;
    public final EObject entryRuleLoad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoad = null;


        try {
            // InternalPClassifier.g:412:45: (iv_ruleLoad= ruleLoad EOF )
            // InternalPClassifier.g:413:2: iv_ruleLoad= ruleLoad EOF
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
    // InternalPClassifier.g:419:1: ruleLoad returns [EObject current=null] : (otherlv_0= 'Load(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '){' otherlv_3= 'file' otherlv_4= ':' ( (lv_file_5_0= RULE_STRING ) ) otherlv_6= '}' ) ;
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
            // InternalPClassifier.g:425:2: ( (otherlv_0= 'Load(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '){' otherlv_3= 'file' otherlv_4= ':' ( (lv_file_5_0= RULE_STRING ) ) otherlv_6= '}' ) )
            // InternalPClassifier.g:426:2: (otherlv_0= 'Load(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '){' otherlv_3= 'file' otherlv_4= ':' ( (lv_file_5_0= RULE_STRING ) ) otherlv_6= '}' )
            {
            // InternalPClassifier.g:426:2: (otherlv_0= 'Load(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '){' otherlv_3= 'file' otherlv_4= ':' ( (lv_file_5_0= RULE_STRING ) ) otherlv_6= '}' )
            // InternalPClassifier.g:427:3: otherlv_0= 'Load(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '){' otherlv_3= 'file' otherlv_4= ':' ( (lv_file_5_0= RULE_STRING ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLoadAccess().getLoadKeyword_0());
            		
            // InternalPClassifier.g:431:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPClassifier.g:432:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPClassifier.g:432:4: (lv_name_1_0= RULE_ID )
            // InternalPClassifier.g:433:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,13,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getLoadAccess().getRightParenthesisLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,24,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getLoadAccess().getFileKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getLoadAccess().getColonKeyword_4());
            		
            // InternalPClassifier.g:461:3: ( (lv_file_5_0= RULE_STRING ) )
            // InternalPClassifier.g:462:4: (lv_file_5_0= RULE_STRING )
            {
            // InternalPClassifier.g:462:4: (lv_file_5_0= RULE_STRING )
            // InternalPClassifier.g:463:5: lv_file_5_0= RULE_STRING
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
    // InternalPClassifier.g:487:1: entryRuleSave returns [EObject current=null] : iv_ruleSave= ruleSave EOF ;
    public final EObject entryRuleSave() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSave = null;


        try {
            // InternalPClassifier.g:487:45: (iv_ruleSave= ruleSave EOF )
            // InternalPClassifier.g:488:2: iv_ruleSave= ruleSave EOF
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
    // InternalPClassifier.g:494:1: ruleSave returns [EObject current=null] : (otherlv_0= 'Save(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '){' otherlv_3= 'file' otherlv_4= ':' ( (lv_file_5_0= RULE_STRING ) ) otherlv_6= '}' ) ;
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
            // InternalPClassifier.g:500:2: ( (otherlv_0= 'Save(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '){' otherlv_3= 'file' otherlv_4= ':' ( (lv_file_5_0= RULE_STRING ) ) otherlv_6= '}' ) )
            // InternalPClassifier.g:501:2: (otherlv_0= 'Save(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '){' otherlv_3= 'file' otherlv_4= ':' ( (lv_file_5_0= RULE_STRING ) ) otherlv_6= '}' )
            {
            // InternalPClassifier.g:501:2: (otherlv_0= 'Save(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '){' otherlv_3= 'file' otherlv_4= ':' ( (lv_file_5_0= RULE_STRING ) ) otherlv_6= '}' )
            // InternalPClassifier.g:502:3: otherlv_0= 'Save(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '){' otherlv_3= 'file' otherlv_4= ':' ( (lv_file_5_0= RULE_STRING ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSaveAccess().getSaveKeyword_0());
            		
            // InternalPClassifier.g:506:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPClassifier.g:507:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPClassifier.g:507:4: (lv_name_1_0= RULE_ID )
            // InternalPClassifier.g:508:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,13,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getSaveAccess().getRightParenthesisLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,24,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getSaveAccess().getFileKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getSaveAccess().getColonKeyword_4());
            		
            // InternalPClassifier.g:536:3: ( (lv_file_5_0= RULE_STRING ) )
            // InternalPClassifier.g:537:4: (lv_file_5_0= RULE_STRING )
            {
            // InternalPClassifier.g:537:4: (lv_file_5_0= RULE_STRING )
            // InternalPClassifier.g:538:5: lv_file_5_0= RULE_STRING
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
    // InternalPClassifier.g:562:1: entryRuleFeatureList returns [EObject current=null] : iv_ruleFeatureList= ruleFeatureList EOF ;
    public final EObject entryRuleFeatureList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureList = null;


        try {
            // InternalPClassifier.g:562:52: (iv_ruleFeatureList= ruleFeatureList EOF )
            // InternalPClassifier.g:563:2: iv_ruleFeatureList= ruleFeatureList EOF
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
    // InternalPClassifier.g:569:1: ruleFeatureList returns [EObject current=null] : ( (otherlv_0= ',' )* ( (lv_vals_1_0= RULE_STRING ) ) ( (otherlv_2= ',' )+ ( (lv_vals_3_0= RULE_STRING ) ) )* (otherlv_4= ',' )* ) ;
    public final EObject ruleFeatureList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_vals_1_0=null;
        Token otherlv_2=null;
        Token lv_vals_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalPClassifier.g:575:2: ( ( (otherlv_0= ',' )* ( (lv_vals_1_0= RULE_STRING ) ) ( (otherlv_2= ',' )+ ( (lv_vals_3_0= RULE_STRING ) ) )* (otherlv_4= ',' )* ) )
            // InternalPClassifier.g:576:2: ( (otherlv_0= ',' )* ( (lv_vals_1_0= RULE_STRING ) ) ( (otherlv_2= ',' )+ ( (lv_vals_3_0= RULE_STRING ) ) )* (otherlv_4= ',' )* )
            {
            // InternalPClassifier.g:576:2: ( (otherlv_0= ',' )* ( (lv_vals_1_0= RULE_STRING ) ) ( (otherlv_2= ',' )+ ( (lv_vals_3_0= RULE_STRING ) ) )* (otherlv_4= ',' )* )
            // InternalPClassifier.g:577:3: (otherlv_0= ',' )* ( (lv_vals_1_0= RULE_STRING ) ) ( (otherlv_2= ',' )+ ( (lv_vals_3_0= RULE_STRING ) ) )* (otherlv_4= ',' )*
            {
            // InternalPClassifier.g:577:3: (otherlv_0= ',' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==26) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPClassifier.g:578:4: otherlv_0= ','
            	    {
            	    otherlv_0=(Token)match(input,26,FOLLOW_8); 

            	    				newLeafNode(otherlv_0, grammarAccess.getFeatureListAccess().getCommaKeyword_0());
            	    			

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalPClassifier.g:583:3: ( (lv_vals_1_0= RULE_STRING ) )
            // InternalPClassifier.g:584:4: (lv_vals_1_0= RULE_STRING )
            {
            // InternalPClassifier.g:584:4: (lv_vals_1_0= RULE_STRING )
            // InternalPClassifier.g:585:5: lv_vals_1_0= RULE_STRING
            {
            lv_vals_1_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

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

            // InternalPClassifier.g:601:3: ( (otherlv_2= ',' )+ ( (lv_vals_3_0= RULE_STRING ) ) )*
            loop5:
            do {
                int alt5=2;
                alt5 = dfa5.predict(input);
                switch (alt5) {
            	case 1 :
            	    // InternalPClassifier.g:602:4: (otherlv_2= ',' )+ ( (lv_vals_3_0= RULE_STRING ) )
            	    {
            	    // InternalPClassifier.g:602:4: (otherlv_2= ',' )+
            	    int cnt4=0;
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( (LA4_0==26) ) {
            	            alt4=1;
            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // InternalPClassifier.g:603:5: otherlv_2= ','
            	    	    {
            	    	    otherlv_2=(Token)match(input,26,FOLLOW_8); 

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

            	    // InternalPClassifier.g:608:4: ( (lv_vals_3_0= RULE_STRING ) )
            	    // InternalPClassifier.g:609:5: (lv_vals_3_0= RULE_STRING )
            	    {
            	    // InternalPClassifier.g:609:5: (lv_vals_3_0= RULE_STRING )
            	    // InternalPClassifier.g:610:6: lv_vals_3_0= RULE_STRING
            	    {
            	    lv_vals_3_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

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

            // InternalPClassifier.g:627:3: (otherlv_4= ',' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==26) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalPClassifier.g:628:4: otherlv_4= ','
            	    {
            	    otherlv_4=(Token)match(input,26,FOLLOW_20); 

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
    // InternalPClassifier.g:637:1: entryRuleEvaluationList returns [EObject current=null] : iv_ruleEvaluationList= ruleEvaluationList EOF ;
    public final EObject entryRuleEvaluationList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvaluationList = null;


        try {
            // InternalPClassifier.g:637:55: (iv_ruleEvaluationList= ruleEvaluationList EOF )
            // InternalPClassifier.g:638:2: iv_ruleEvaluationList= ruleEvaluationList EOF
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
    // InternalPClassifier.g:644:1: ruleEvaluationList returns [EObject current=null] : ( (otherlv_0= ',' )* ( (lv_vals_1_0= ruleEvaluation ) ) ( (otherlv_2= ',' )+ ( (lv_vals_3_0= ruleEvaluation ) ) )* (otherlv_4= ',' )* ) ;
    public final EObject ruleEvaluationList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_vals_1_0 = null;

        Enumerator lv_vals_3_0 = null;



        	enterRule();

        try {
            // InternalPClassifier.g:650:2: ( ( (otherlv_0= ',' )* ( (lv_vals_1_0= ruleEvaluation ) ) ( (otherlv_2= ',' )+ ( (lv_vals_3_0= ruleEvaluation ) ) )* (otherlv_4= ',' )* ) )
            // InternalPClassifier.g:651:2: ( (otherlv_0= ',' )* ( (lv_vals_1_0= ruleEvaluation ) ) ( (otherlv_2= ',' )+ ( (lv_vals_3_0= ruleEvaluation ) ) )* (otherlv_4= ',' )* )
            {
            // InternalPClassifier.g:651:2: ( (otherlv_0= ',' )* ( (lv_vals_1_0= ruleEvaluation ) ) ( (otherlv_2= ',' )+ ( (lv_vals_3_0= ruleEvaluation ) ) )* (otherlv_4= ',' )* )
            // InternalPClassifier.g:652:3: (otherlv_0= ',' )* ( (lv_vals_1_0= ruleEvaluation ) ) ( (otherlv_2= ',' )+ ( (lv_vals_3_0= ruleEvaluation ) ) )* (otherlv_4= ',' )*
            {
            // InternalPClassifier.g:652:3: (otherlv_0= ',' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==26) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalPClassifier.g:653:4: otherlv_0= ','
            	    {
            	    otherlv_0=(Token)match(input,26,FOLLOW_18); 

            	    				newLeafNode(otherlv_0, grammarAccess.getEvaluationListAccess().getCommaKeyword_0());
            	    			

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // InternalPClassifier.g:658:3: ( (lv_vals_1_0= ruleEvaluation ) )
            // InternalPClassifier.g:659:4: (lv_vals_1_0= ruleEvaluation )
            {
            // InternalPClassifier.g:659:4: (lv_vals_1_0= ruleEvaluation )
            // InternalPClassifier.g:660:5: lv_vals_1_0= ruleEvaluation
            {

            					newCompositeNode(grammarAccess.getEvaluationListAccess().getValsEvaluationEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
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

            // InternalPClassifier.g:677:3: ( (otherlv_2= ',' )+ ( (lv_vals_3_0= ruleEvaluation ) ) )*
            loop9:
            do {
                int alt9=2;
                alt9 = dfa9.predict(input);
                switch (alt9) {
            	case 1 :
            	    // InternalPClassifier.g:678:4: (otherlv_2= ',' )+ ( (lv_vals_3_0= ruleEvaluation ) )
            	    {
            	    // InternalPClassifier.g:678:4: (otherlv_2= ',' )+
            	    int cnt8=0;
            	    loop8:
            	    do {
            	        int alt8=2;
            	        int LA8_0 = input.LA(1);

            	        if ( (LA8_0==26) ) {
            	            alt8=1;
            	        }


            	        switch (alt8) {
            	    	case 1 :
            	    	    // InternalPClassifier.g:679:5: otherlv_2= ','
            	    	    {
            	    	    otherlv_2=(Token)match(input,26,FOLLOW_18); 

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

            	    // InternalPClassifier.g:684:4: ( (lv_vals_3_0= ruleEvaluation ) )
            	    // InternalPClassifier.g:685:5: (lv_vals_3_0= ruleEvaluation )
            	    {
            	    // InternalPClassifier.g:685:5: (lv_vals_3_0= ruleEvaluation )
            	    // InternalPClassifier.g:686:6: lv_vals_3_0= ruleEvaluation
            	    {

            	    						newCompositeNode(grammarAccess.getEvaluationListAccess().getValsEvaluationEnumRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
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

            // InternalPClassifier.g:704:3: (otherlv_4= ',' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==26) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalPClassifier.g:705:4: otherlv_4= ','
            	    {
            	    otherlv_4=(Token)match(input,26,FOLLOW_20); 

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
    // InternalPClassifier.g:714:1: ruleMLModel returns [Enumerator current=null] : ( (enumLiteral_0= 'DecisionTree' ) | (enumLiteral_1= 'SVM' ) ) ;
    public final Enumerator ruleMLModel() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalPClassifier.g:720:2: ( ( (enumLiteral_0= 'DecisionTree' ) | (enumLiteral_1= 'SVM' ) ) )
            // InternalPClassifier.g:721:2: ( (enumLiteral_0= 'DecisionTree' ) | (enumLiteral_1= 'SVM' ) )
            {
            // InternalPClassifier.g:721:2: ( (enumLiteral_0= 'DecisionTree' ) | (enumLiteral_1= 'SVM' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27) ) {
                alt11=1;
            }
            else if ( (LA11_0==28) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalPClassifier.g:722:3: (enumLiteral_0= 'DecisionTree' )
                    {
                    // InternalPClassifier.g:722:3: (enumLiteral_0= 'DecisionTree' )
                    // InternalPClassifier.g:723:4: enumLiteral_0= 'DecisionTree'
                    {
                    enumLiteral_0=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getMLModelAccess().getDecisonTreeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMLModelAccess().getDecisonTreeEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPClassifier.g:730:3: (enumLiteral_1= 'SVM' )
                    {
                    // InternalPClassifier.g:730:3: (enumLiteral_1= 'SVM' )
                    // InternalPClassifier.g:731:4: enumLiteral_1= 'SVM'
                    {
                    enumLiteral_1=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getMLModelAccess().getSVMEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMLModelAccess().getSVMEnumLiteralDeclaration_1());
                    			

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
    // InternalPClassifier.g:741:1: ruleEvaluation returns [Enumerator current=null] : ( (enumLiteral_0= 'accuracy' ) | (enumLiteral_1= 'f1' ) | (enumLiteral_2= 'recall' ) ) ;
    public final Enumerator ruleEvaluation() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalPClassifier.g:747:2: ( ( (enumLiteral_0= 'accuracy' ) | (enumLiteral_1= 'f1' ) | (enumLiteral_2= 'recall' ) ) )
            // InternalPClassifier.g:748:2: ( (enumLiteral_0= 'accuracy' ) | (enumLiteral_1= 'f1' ) | (enumLiteral_2= 'recall' ) )
            {
            // InternalPClassifier.g:748:2: ( (enumLiteral_0= 'accuracy' ) | (enumLiteral_1= 'f1' ) | (enumLiteral_2= 'recall' ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt12=1;
                }
                break;
            case 30:
                {
                alt12=2;
                }
                break;
            case 31:
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
                    // InternalPClassifier.g:749:3: (enumLiteral_0= 'accuracy' )
                    {
                    // InternalPClassifier.g:749:3: (enumLiteral_0= 'accuracy' )
                    // InternalPClassifier.g:750:4: enumLiteral_0= 'accuracy'
                    {
                    enumLiteral_0=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getEvaluationAccess().getAccuracyEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEvaluationAccess().getAccuracyEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPClassifier.g:757:3: (enumLiteral_1= 'f1' )
                    {
                    // InternalPClassifier.g:757:3: (enumLiteral_1= 'f1' )
                    // InternalPClassifier.g:758:4: enumLiteral_1= 'f1'
                    {
                    enumLiteral_1=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getEvaluationAccess().getF1SCOREEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEvaluationAccess().getF1SCOREEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalPClassifier.g:765:3: (enumLiteral_2= 'recall' )
                    {
                    // InternalPClassifier.g:765:3: (enumLiteral_2= 'recall' )
                    // InternalPClassifier.g:766:4: enumLiteral_2= 'recall'
                    {
                    enumLiteral_2=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getEvaluationAccess().getRECALLEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getEvaluationAccess().getRECALLEnumLiteralDeclaration_2());
                    			

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
    static final String dfa_4s = "\2\32\2\uffff";
    static final String dfa_5s = "\2\uffff\1\2\1\1";
    static final String dfa_6s = "\4\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\11\uffff\1\1",
            "\1\3\12\uffff\1\2\11\uffff\1\1",
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
            return "()* loopback of 601:3: ( (otherlv_2= ',' )+ ( (lv_vals_3_0= RULE_STRING ) ) )*";
        }
    }
    static final String dfa_8s = "\2\22\2\uffff";
    static final String dfa_9s = "\1\32\1\37\2\uffff";
    static final String[] dfa_10s = {
            "\1\2\7\uffff\1\1",
            "\1\2\7\uffff\1\1\2\uffff\3\3",
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
            return "()* loopback of 677:3: ( (otherlv_2= ',' )+ ( (lv_vals_3_0= ruleEvaluation ) ) )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000002881002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000E4000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000002L});

}