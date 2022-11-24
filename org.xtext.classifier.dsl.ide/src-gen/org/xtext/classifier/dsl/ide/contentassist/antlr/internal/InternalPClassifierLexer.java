package org.xtext.classifier.dsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPClassifierLexer extends Lexer {
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

    public InternalPClassifierLexer() {;} 
    public InternalPClassifierLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalPClassifierLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalPClassifier.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPClassifier.g:11:7: ( 'DecisionTree' )
            // InternalPClassifier.g:11:9: 'DecisionTree'
            {
            match("DecisionTree"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPClassifier.g:12:7: ( 'SVC' )
            // InternalPClassifier.g:12:9: 'SVC'
            {
            match("SVC"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPClassifier.g:13:7: ( 'RandomForest' )
            // InternalPClassifier.g:13:9: 'RandomForest'
            {
            match("RandomForest"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPClassifier.g:14:7: ( 'MLPClassifier' )
            // InternalPClassifier.g:14:9: 'MLPClassifier'
            {
            match("MLPClassifier"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPClassifier.g:15:7: ( 'accuracy' )
            // InternalPClassifier.g:15:9: 'accuracy'
            {
            match("accuracy"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPClassifier.g:16:7: ( 'f1' )
            // InternalPClassifier.g:16:9: 'f1'
            {
            match("f1"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPClassifier.g:17:7: ( 'recall' )
            // InternalPClassifier.g:17:9: 'recall'
            {
            match("recall"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPClassifier.g:18:7: ( 'Classifier(' )
            // InternalPClassifier.g:18:9: 'Classifier('
            {
            match("Classifier("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPClassifier.g:19:7: ( '){' )
            // InternalPClassifier.g:19:9: '){'
            {
            match("){"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPClassifier.g:20:7: ( 'features' )
            // InternalPClassifier.g:20:9: 'features'
            {
            match("features"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPClassifier.g:21:7: ( ':' )
            // InternalPClassifier.g:21:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPClassifier.g:22:7: ( 'target' )
            // InternalPClassifier.g:22:9: 'target'
            {
            match("target"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPClassifier.g:23:7: ( 'model' )
            // InternalPClassifier.g:23:9: 'model'
            {
            match("model"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPClassifier.g:24:7: ( '}' )
            // InternalPClassifier.g:24:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPClassifier.g:25:7: ( 'Train(' )
            // InternalPClassifier.g:25:9: 'Train('
            {
            match("Train("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPClassifier.g:26:7: ( 'dataset' )
            // InternalPClassifier.g:26:9: 'dataset'
            {
            match("dataset"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPClassifier.g:27:7: ( 'split' )
            // InternalPClassifier.g:27:9: 'split'
            {
            match("split"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPClassifier.g:28:7: ( 'evaluations' )
            // InternalPClassifier.g:28:9: 'evaluations'
            {
            match("evaluations"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPClassifier.g:29:7: ( 'Execute(' )
            // InternalPClassifier.g:29:9: 'Execute('
            {
            match("Execute("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPClassifier.g:30:7: ( 'input' )
            // InternalPClassifier.g:30:9: 'input'
            {
            match("input"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPClassifier.g:31:7: ( 'output' )
            // InternalPClassifier.g:31:9: 'output'
            {
            match("output"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPClassifier.g:32:7: ( 'Load(' )
            // InternalPClassifier.g:32:9: 'Load('
            {
            match("Load("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPClassifier.g:33:7: ( 'file' )
            // InternalPClassifier.g:33:9: 'file'
            {
            match("file"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPClassifier.g:34:7: ( 'Save(' )
            // InternalPClassifier.g:34:9: 'Save('
            {
            match("Save("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPClassifier.g:35:7: ( ',' )
            // InternalPClassifier.g:35:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "RULE_FLOAT"
    public final void mRULE_FLOAT() throws RecognitionException {
        try {
            int _type = RULE_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPClassifier.g:2396:12: ( ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? | '.' ( '0' .. '9' )+ ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? | ( '0' .. '9' )+ ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ ) )
            // InternalPClassifier.g:2396:14: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? | '.' ( '0' .. '9' )+ ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? | ( '0' .. '9' )+ ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            {
            // InternalPClassifier.g:2396:14: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? | '.' ( '0' .. '9' )+ ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? | ( '0' .. '9' )+ ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            int alt13=3;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // InternalPClassifier.g:2396:15: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )?
                    {
                    // InternalPClassifier.g:2396:15: ( '0' .. '9' )+
                    int cnt1=0;
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalPClassifier.g:2396:16: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt1 >= 1 ) break loop1;
                                EarlyExitException eee =
                                    new EarlyExitException(1, input);
                                throw eee;
                        }
                        cnt1++;
                    } while (true);

                    match('.'); 
                    // InternalPClassifier.g:2396:31: ( '0' .. '9' )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalPClassifier.g:2396:32: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    // InternalPClassifier.g:2396:43: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='E'||LA5_0=='e') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalPClassifier.g:2396:44: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
                            {
                            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            // InternalPClassifier.g:2396:54: ( '+' | '-' )?
                            int alt3=2;
                            int LA3_0 = input.LA(1);

                            if ( (LA3_0=='+'||LA3_0=='-') ) {
                                alt3=1;
                            }
                            switch (alt3) {
                                case 1 :
                                    // InternalPClassifier.g:
                                    {
                                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                        input.consume();

                                    }
                                    else {
                                        MismatchedSetException mse = new MismatchedSetException(null,input);
                                        recover(mse);
                                        throw mse;}


                                    }
                                    break;

                            }

                            // InternalPClassifier.g:2396:65: ( '0' .. '9' )+
                            int cnt4=0;
                            loop4:
                            do {
                                int alt4=2;
                                int LA4_0 = input.LA(1);

                                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                                    alt4=1;
                                }


                                switch (alt4) {
                            	case 1 :
                            	    // InternalPClassifier.g:2396:66: '0' .. '9'
                            	    {
                            	    matchRange('0','9'); 

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


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalPClassifier.g:2396:79: '.' ( '0' .. '9' )+ ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )?
                    {
                    match('.'); 
                    // InternalPClassifier.g:2396:83: ( '0' .. '9' )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalPClassifier.g:2396:84: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);

                    // InternalPClassifier.g:2396:95: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='E'||LA9_0=='e') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalPClassifier.g:2396:96: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
                            {
                            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            // InternalPClassifier.g:2396:106: ( '+' | '-' )?
                            int alt7=2;
                            int LA7_0 = input.LA(1);

                            if ( (LA7_0=='+'||LA7_0=='-') ) {
                                alt7=1;
                            }
                            switch (alt7) {
                                case 1 :
                                    // InternalPClassifier.g:
                                    {
                                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                        input.consume();

                                    }
                                    else {
                                        MismatchedSetException mse = new MismatchedSetException(null,input);
                                        recover(mse);
                                        throw mse;}


                                    }
                                    break;

                            }

                            // InternalPClassifier.g:2396:117: ( '0' .. '9' )+
                            int cnt8=0;
                            loop8:
                            do {
                                int alt8=2;
                                int LA8_0 = input.LA(1);

                                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                                    alt8=1;
                                }


                                switch (alt8) {
                            	case 1 :
                            	    // InternalPClassifier.g:2396:118: '0' .. '9'
                            	    {
                            	    matchRange('0','9'); 

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


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // InternalPClassifier.g:2396:131: ( '0' .. '9' )+ ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
                    {
                    // InternalPClassifier.g:2396:131: ( '0' .. '9' )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalPClassifier.g:2396:132: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt10 >= 1 ) break loop10;
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
                    } while (true);

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalPClassifier.g:2396:153: ( '+' | '-' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='+'||LA11_0=='-') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalPClassifier.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    // InternalPClassifier.g:2396:164: ( '0' .. '9' )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalPClassifier.g:2396:165: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt12 >= 1 ) break loop12;
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                throw eee;
                        }
                        cnt12++;
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FLOAT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPClassifier.g:2398:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalPClassifier.g:2398:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalPClassifier.g:2398:11: ( '^' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='^') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalPClassifier.g:2398:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalPClassifier.g:2398:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='0' && LA15_0<='9')||(LA15_0>='A' && LA15_0<='Z')||LA15_0=='_'||(LA15_0>='a' && LA15_0<='z')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalPClassifier.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPClassifier.g:2400:10: ( ( '0' .. '9' )+ )
            // InternalPClassifier.g:2400:12: ( '0' .. '9' )+
            {
            // InternalPClassifier.g:2400:12: ( '0' .. '9' )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='0' && LA16_0<='9')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalPClassifier.g:2400:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPClassifier.g:2402:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalPClassifier.g:2402:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalPClassifier.g:2402:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='\"') ) {
                alt19=1;
            }
            else if ( (LA19_0=='\'') ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalPClassifier.g:2402:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalPClassifier.g:2402:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop17:
                    do {
                        int alt17=3;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0=='\\') ) {
                            alt17=1;
                        }
                        else if ( ((LA17_0>='\u0000' && LA17_0<='!')||(LA17_0>='#' && LA17_0<='[')||(LA17_0>=']' && LA17_0<='\uFFFF')) ) {
                            alt17=2;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalPClassifier.g:2402:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPClassifier.g:2402:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalPClassifier.g:2402:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalPClassifier.g:2402:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop18:
                    do {
                        int alt18=3;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0=='\\') ) {
                            alt18=1;
                        }
                        else if ( ((LA18_0>='\u0000' && LA18_0<='&')||(LA18_0>='(' && LA18_0<='[')||(LA18_0>=']' && LA18_0<='\uFFFF')) ) {
                            alt18=2;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalPClassifier.g:2402:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPClassifier.g:2402:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPClassifier.g:2404:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalPClassifier.g:2404:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalPClassifier.g:2404:24: ( options {greedy=false; } : . )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0=='*') ) {
                    int LA20_1 = input.LA(2);

                    if ( (LA20_1=='/') ) {
                        alt20=2;
                    }
                    else if ( ((LA20_1>='\u0000' && LA20_1<='.')||(LA20_1>='0' && LA20_1<='\uFFFF')) ) {
                        alt20=1;
                    }


                }
                else if ( ((LA20_0>='\u0000' && LA20_0<=')')||(LA20_0>='+' && LA20_0<='\uFFFF')) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalPClassifier.g:2404:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPClassifier.g:2406:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalPClassifier.g:2406:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalPClassifier.g:2406:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>='\u0000' && LA21_0<='\t')||(LA21_0>='\u000B' && LA21_0<='\f')||(LA21_0>='\u000E' && LA21_0<='\uFFFF')) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalPClassifier.g:2406:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            // InternalPClassifier.g:2406:40: ( ( '\\r' )? '\\n' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0=='\n'||LA23_0=='\r') ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalPClassifier.g:2406:41: ( '\\r' )? '\\n'
                    {
                    // InternalPClassifier.g:2406:41: ( '\\r' )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0=='\r') ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalPClassifier.g:2406:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPClassifier.g:2408:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalPClassifier.g:2408:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalPClassifier.g:2408:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>='\t' && LA24_0<='\n')||LA24_0=='\r'||LA24_0==' ') ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalPClassifier.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPClassifier.g:2410:16: ( . )
            // InternalPClassifier.g:2410:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalPClassifier.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | RULE_FLOAT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt25=33;
        alt25 = dfa25.predict(input);
        switch (alt25) {
            case 1 :
                // InternalPClassifier.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalPClassifier.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalPClassifier.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalPClassifier.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalPClassifier.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalPClassifier.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalPClassifier.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalPClassifier.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalPClassifier.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalPClassifier.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalPClassifier.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalPClassifier.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalPClassifier.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // InternalPClassifier.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // InternalPClassifier.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // InternalPClassifier.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // InternalPClassifier.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // InternalPClassifier.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // InternalPClassifier.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // InternalPClassifier.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // InternalPClassifier.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // InternalPClassifier.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // InternalPClassifier.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // InternalPClassifier.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // InternalPClassifier.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // InternalPClassifier.g:1:160: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 27 :
                // InternalPClassifier.g:1:171: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 28 :
                // InternalPClassifier.g:1:179: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 29 :
                // InternalPClassifier.g:1:188: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 30 :
                // InternalPClassifier.g:1:200: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 31 :
                // InternalPClassifier.g:1:216: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 32 :
                // InternalPClassifier.g:1:232: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 33 :
                // InternalPClassifier.g:1:240: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    protected DFA25 dfa25 = new DFA25(this);
    static final String DFA13_eotS =
        "\5\uffff";
    static final String DFA13_eofS =
        "\5\uffff";
    static final String DFA13_minS =
        "\2\56\3\uffff";
    static final String DFA13_maxS =
        "\1\71\1\145\3\uffff";
    static final String DFA13_acceptS =
        "\2\uffff\1\2\1\1\1\3";
    static final String DFA13_specialS =
        "\5\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
            "",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "2396:14: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? | '.' ( '0' .. '9' )+ ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? | ( '0' .. '9' )+ ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )";
        }
    }
    static final String DFA25_eotS =
        "\1\uffff\10\41\1\37\1\uffff\2\41\1\uffff\10\41\1\uffff\1\74\2\37\1\uffff\3\37\2\uffff\1\41\1\uffff\5\41\1\107\4\41\2\uffff\2\41\1\uffff\10\41\2\uffff\1\74\5\uffff\1\41\1\127\4\41\1\uffff\17\41\1\uffff\5\41\1\160\15\41\1\uffff\4\41\1\uffff\3\41\1\u0085\2\41\1\u0088\2\41\1\u008b\1\41\1\uffff\5\41\1\u0092\1\41\1\u0094\2\uffff\1\41\1\uffff\2\41\1\uffff\1\u0098\5\41\1\uffff\1\41\1\uffff\1\u009f\2\41\1\uffff\3\41\1\u00a5\1\u00a6\1\41\1\uffff\1\41\1\uffff\3\41\2\uffff\12\41\1\uffff\1\u00b6\1\u00b7\1\u00b8\1\41\3\uffff\1\u00ba\1\uffff";
    static final String DFA25_eofS =
        "\u00bb\uffff";
    static final String DFA25_minS =
        "\1\0\1\145\1\126\1\141\1\114\1\143\1\61\1\145\1\154\1\173\1\uffff\1\141\1\157\1\uffff\1\162\1\141\1\160\1\166\1\170\1\156\1\165\1\157\1\uffff\1\56\1\60\1\101\1\uffff\2\0\1\52\2\uffff\1\143\1\uffff\1\103\1\166\1\156\1\120\1\143\1\60\1\141\1\154\1\143\1\141\2\uffff\1\162\1\144\1\uffff\1\141\1\164\1\154\1\141\1\145\1\160\1\164\1\141\2\uffff\1\56\5\uffff\1\151\1\60\1\145\1\144\1\103\1\165\1\uffff\1\164\1\145\1\141\1\163\1\147\1\145\1\151\1\141\1\151\1\154\1\143\1\165\1\160\1\144\1\163\1\uffff\1\50\1\157\1\154\1\162\1\165\1\60\1\154\1\163\1\145\1\154\1\156\1\163\1\164\2\165\1\164\1\165\1\50\1\151\1\uffff\1\155\2\141\1\162\1\uffff\1\154\1\151\1\164\1\60\1\50\1\145\1\60\1\141\1\164\1\60\1\164\1\uffff\1\157\1\106\1\163\1\143\1\145\1\60\1\146\1\60\2\uffff\1\164\1\uffff\1\164\1\145\1\uffff\1\60\1\156\1\157\1\163\1\171\1\163\1\uffff\1\151\1\uffff\1\60\1\151\1\50\1\uffff\1\124\1\162\1\151\2\60\1\145\1\uffff\1\157\1\uffff\1\162\1\145\1\146\2\uffff\1\162\1\156\1\145\1\163\1\151\1\50\1\163\1\145\1\164\1\145\1\uffff\3\60\1\162\3\uffff\1\60\1\uffff";
    static final String DFA25_maxS =
        "\1\uffff\1\145\2\141\1\114\1\143\1\151\1\145\1\154\1\173\1\uffff\1\141\1\157\1\uffff\1\162\1\141\1\160\1\166\1\170\1\156\1\165\1\157\1\uffff\1\145\1\71\1\172\1\uffff\2\uffff\1\57\2\uffff\1\143\1\uffff\1\103\1\166\1\156\1\120\1\143\1\172\1\141\1\154\1\143\1\141\2\uffff\1\162\1\144\1\uffff\1\141\1\164\1\154\1\141\1\145\1\160\1\164\1\141\2\uffff\1\145\5\uffff\1\151\1\172\1\145\1\144\1\103\1\165\1\uffff\1\164\1\145\1\141\1\163\1\147\1\145\1\151\1\141\1\151\1\154\1\143\1\165\1\160\1\144\1\163\1\uffff\1\50\1\157\1\154\1\162\1\165\1\172\1\154\1\163\1\145\1\154\1\156\1\163\1\164\2\165\1\164\1\165\1\50\1\151\1\uffff\1\155\2\141\1\162\1\uffff\1\154\1\151\1\164\1\172\1\50\1\145\1\172\1\141\1\164\1\172\1\164\1\uffff\1\157\1\106\1\163\1\143\1\145\1\172\1\146\1\172\2\uffff\1\164\1\uffff\1\164\1\145\1\uffff\1\172\1\156\1\157\1\163\1\171\1\163\1\uffff\1\151\1\uffff\1\172\1\151\1\50\1\uffff\1\124\1\162\1\151\2\172\1\145\1\uffff\1\157\1\uffff\1\162\1\145\1\146\2\uffff\1\162\1\156\1\145\1\163\1\151\1\50\1\163\1\145\1\164\1\145\1\uffff\3\172\1\162\3\uffff\1\172\1\uffff";
    static final String DFA25_acceptS =
        "\12\uffff\1\13\2\uffff\1\16\10\uffff\1\31\3\uffff\1\33\3\uffff\1\40\1\41\1\uffff\1\33\12\uffff\1\11\1\13\2\uffff\1\16\10\uffff\1\31\1\32\1\uffff\1\34\1\35\1\36\1\37\1\40\6\uffff\1\6\17\uffff\1\2\23\uffff\1\30\4\uffff\1\27\13\uffff\1\26\10\uffff\1\15\1\17\1\uffff\1\21\2\uffff\1\24\6\uffff\1\7\1\uffff\1\14\3\uffff\1\25\6\uffff\1\20\1\uffff\1\23\3\uffff\1\5\1\12\12\uffff\1\10\4\uffff\1\22\1\1\1\3\1\uffff\1\4";
    static final String DFA25_specialS =
        "\1\2\32\uffff\1\1\1\0\u009e\uffff}>";
    static final String[] DFA25_transitionS = {
            "\11\37\2\36\2\37\1\36\22\37\1\36\1\37\1\33\4\37\1\34\1\37\1\11\2\37\1\26\1\37\1\30\1\35\12\27\1\12\6\37\2\32\1\10\1\1\1\22\6\32\1\25\1\4\4\32\1\3\1\2\1\16\6\32\3\37\1\31\1\32\1\37\1\5\2\32\1\17\1\21\1\6\2\32\1\23\3\32\1\14\1\32\1\24\2\32\1\7\1\20\1\13\6\32\2\37\1\15\uff82\37",
            "\1\40",
            "\1\42\12\uffff\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47\63\uffff\1\50\3\uffff\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "",
            "\1\56",
            "\1\57",
            "",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "",
            "\1\72\1\uffff\12\73\13\uffff\1\72\37\uffff\1\72",
            "\12\72",
            "\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\0\75",
            "\0\75",
            "\1\76\4\uffff\1\77",
            "",
            "",
            "\1\101",
            "",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "",
            "",
            "\1\114",
            "\1\115",
            "",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "",
            "",
            "\1\72\1\uffff\12\73\13\uffff\1\72\37\uffff\1\72",
            "",
            "",
            "",
            "",
            "",
            "\1\126",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0086",
            "\1\u0087",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0089",
            "\1\u008a",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u008c",
            "",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0093",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "\1\u0095",
            "",
            "\1\u0096",
            "\1\u0097",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "",
            "\1\u009e",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00a0",
            "\1\u00a1",
            "",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00a7",
            "",
            "\1\u00a8",
            "",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "",
            "",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00b9",
            "",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            ""
    };

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | RULE_FLOAT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA25_28 = input.LA(1);

                        s = -1;
                        if ( ((LA25_28>='\u0000' && LA25_28<='\uFFFF')) ) {s = 61;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA25_27 = input.LA(1);

                        s = -1;
                        if ( ((LA25_27>='\u0000' && LA25_27<='\uFFFF')) ) {s = 61;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA25_0 = input.LA(1);

                        s = -1;
                        if ( (LA25_0=='D') ) {s = 1;}

                        else if ( (LA25_0=='S') ) {s = 2;}

                        else if ( (LA25_0=='R') ) {s = 3;}

                        else if ( (LA25_0=='M') ) {s = 4;}

                        else if ( (LA25_0=='a') ) {s = 5;}

                        else if ( (LA25_0=='f') ) {s = 6;}

                        else if ( (LA25_0=='r') ) {s = 7;}

                        else if ( (LA25_0=='C') ) {s = 8;}

                        else if ( (LA25_0==')') ) {s = 9;}

                        else if ( (LA25_0==':') ) {s = 10;}

                        else if ( (LA25_0=='t') ) {s = 11;}

                        else if ( (LA25_0=='m') ) {s = 12;}

                        else if ( (LA25_0=='}') ) {s = 13;}

                        else if ( (LA25_0=='T') ) {s = 14;}

                        else if ( (LA25_0=='d') ) {s = 15;}

                        else if ( (LA25_0=='s') ) {s = 16;}

                        else if ( (LA25_0=='e') ) {s = 17;}

                        else if ( (LA25_0=='E') ) {s = 18;}

                        else if ( (LA25_0=='i') ) {s = 19;}

                        else if ( (LA25_0=='o') ) {s = 20;}

                        else if ( (LA25_0=='L') ) {s = 21;}

                        else if ( (LA25_0==',') ) {s = 22;}

                        else if ( ((LA25_0>='0' && LA25_0<='9')) ) {s = 23;}

                        else if ( (LA25_0=='.') ) {s = 24;}

                        else if ( (LA25_0=='^') ) {s = 25;}

                        else if ( ((LA25_0>='A' && LA25_0<='B')||(LA25_0>='F' && LA25_0<='K')||(LA25_0>='N' && LA25_0<='Q')||(LA25_0>='U' && LA25_0<='Z')||LA25_0=='_'||(LA25_0>='b' && LA25_0<='c')||(LA25_0>='g' && LA25_0<='h')||(LA25_0>='j' && LA25_0<='l')||LA25_0=='n'||(LA25_0>='p' && LA25_0<='q')||(LA25_0>='u' && LA25_0<='z')) ) {s = 26;}

                        else if ( (LA25_0=='\"') ) {s = 27;}

                        else if ( (LA25_0=='\'') ) {s = 28;}

                        else if ( (LA25_0=='/') ) {s = 29;}

                        else if ( ((LA25_0>='\t' && LA25_0<='\n')||LA25_0=='\r'||LA25_0==' ') ) {s = 30;}

                        else if ( ((LA25_0>='\u0000' && LA25_0<='\b')||(LA25_0>='\u000B' && LA25_0<='\f')||(LA25_0>='\u000E' && LA25_0<='\u001F')||LA25_0=='!'||(LA25_0>='#' && LA25_0<='&')||LA25_0=='('||(LA25_0>='*' && LA25_0<='+')||LA25_0=='-'||(LA25_0>=';' && LA25_0<='@')||(LA25_0>='[' && LA25_0<=']')||LA25_0=='`'||(LA25_0>='{' && LA25_0<='|')||(LA25_0>='~' && LA25_0<='\uFFFF')) ) {s = 31;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 25, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}