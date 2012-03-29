// $ANTLR 3.4 ScriptGrammar.g 2012-03-29 01:56:09

package com.google.imageplayground.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class ScriptGrammarLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int BLOCK=4;
    public static final int CALL=5;
    public static final int ID=6;
    public static final int INT=7;
    public static final int NEG=8;
    public static final int NEWLINE=9;
    public static final int TYPE=10;
    public static final int WS=11;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public ScriptGrammarLexer() {} 
    public ScriptGrammarLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public ScriptGrammarLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "ScriptGrammar.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ScriptGrammar.g:6:7: ( '!=' )
            // ScriptGrammar.g:6:9: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ScriptGrammar.g:7:7: ( '%' )
            // ScriptGrammar.g:7:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ScriptGrammar.g:8:7: ( '&' )
            // ScriptGrammar.g:8:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ScriptGrammar.g:9:7: ( '(' )
            // ScriptGrammar.g:9:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ScriptGrammar.g:10:7: ( ')' )
            // ScriptGrammar.g:10:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ScriptGrammar.g:11:7: ( '*' )
            // ScriptGrammar.g:11:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ScriptGrammar.g:12:7: ( '+' )
            // ScriptGrammar.g:12:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ScriptGrammar.g:13:7: ( ',' )
            // ScriptGrammar.g:13:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ScriptGrammar.g:14:7: ( '-' )
            // ScriptGrammar.g:14:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ScriptGrammar.g:15:7: ( '/' )
            // ScriptGrammar.g:15:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ScriptGrammar.g:16:7: ( '<' )
            // ScriptGrammar.g:16:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ScriptGrammar.g:17:7: ( '<<' )
            // ScriptGrammar.g:17:9: '<<'
            {
            match("<<"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ScriptGrammar.g:18:7: ( '<<<' )
            // ScriptGrammar.g:18:9: '<<<'
            {
            match("<<<"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ScriptGrammar.g:19:7: ( '<=' )
            // ScriptGrammar.g:19:9: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ScriptGrammar.g:20:7: ( '=' )
            // ScriptGrammar.g:20:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ScriptGrammar.g:21:7: ( '==' )
            // ScriptGrammar.g:21:9: '=='
            {
            match("=="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ScriptGrammar.g:22:7: ( '>' )
            // ScriptGrammar.g:22:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ScriptGrammar.g:23:7: ( '>=' )
            // ScriptGrammar.g:23:9: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ScriptGrammar.g:24:7: ( '>>' )
            // ScriptGrammar.g:24:9: '>>'
            {
            match(">>"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ScriptGrammar.g:25:7: ( 'if' )
            // ScriptGrammar.g:25:9: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ScriptGrammar.g:26:7: ( 'return' )
            // ScriptGrammar.g:26:9: 'return'
            {
            match("return"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ScriptGrammar.g:27:7: ( '{' )
            // ScriptGrammar.g:27:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ScriptGrammar.g:28:7: ( '|' )
            // ScriptGrammar.g:28:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ScriptGrammar.g:29:7: ( '}' )
            // ScriptGrammar.g:29:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ScriptGrammar.g:30:7: ( '~' )
            // ScriptGrammar.g:30:9: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "TYPE"
    public final void mTYPE() throws RecognitionException {
        try {
            int _type = TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ScriptGrammar.g:75:5: ( ( 'int' | 'long' | 'float' | 'double' | 'boolean' ) )
            // ScriptGrammar.g:75:7: ( 'int' | 'long' | 'float' | 'double' | 'boolean' )
            {
            // ScriptGrammar.g:75:7: ( 'int' | 'long' | 'float' | 'double' | 'boolean' )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 'i':
                {
                alt1=1;
                }
                break;
            case 'l':
                {
                alt1=2;
                }
                break;
            case 'f':
                {
                alt1=3;
                }
                break;
            case 'd':
                {
                alt1=4;
                }
                break;
            case 'b':
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // ScriptGrammar.g:75:8: 'int'
                    {
                    match("int"); 



                    }
                    break;
                case 2 :
                    // ScriptGrammar.g:75:14: 'long'
                    {
                    match("long"); 



                    }
                    break;
                case 3 :
                    // ScriptGrammar.g:75:21: 'float'
                    {
                    match("float"); 



                    }
                    break;
                case 4 :
                    // ScriptGrammar.g:75:29: 'double'
                    {
                    match("double"); 



                    }
                    break;
                case 5 :
                    // ScriptGrammar.g:75:38: 'boolean'
                    {
                    match("boolean"); 



                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TYPE"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ScriptGrammar.g:76:5: ( ( 'a' .. 'z' | 'A' .. 'Z' )+ )
            // ScriptGrammar.g:76:9: ( 'a' .. 'z' | 'A' .. 'Z' )+
            {
            // ScriptGrammar.g:76:9: ( 'a' .. 'z' | 'A' .. 'Z' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= 'A' && LA2_0 <= 'Z')||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ScriptGrammar.g:
            	    {
            	    if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ScriptGrammar.g:77:5: ( ( '0' .. '9' )+ )
            // ScriptGrammar.g:77:9: ( '0' .. '9' )+
            {
            // ScriptGrammar.g:77:9: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ScriptGrammar.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ScriptGrammar.g:78:8: ( ( '\\r' )? '\\n' )
            // ScriptGrammar.g:78:9: ( '\\r' )? '\\n'
            {
            // ScriptGrammar.g:78:9: ( '\\r' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\r') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ScriptGrammar.g:78:9: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }


            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ScriptGrammar.g:79:5: ( ( ' ' | '\\t' )+ )
            // ScriptGrammar.g:79:9: ( ' ' | '\\t' )+
            {
            // ScriptGrammar.g:79:9: ( ' ' | '\\t' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='\t'||LA5_0==' ') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ScriptGrammar.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // ScriptGrammar.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | TYPE | ID | INT | NEWLINE | WS )
        int alt6=30;
        alt6 = dfa6.predict(input);
        switch (alt6) {
            case 1 :
                // ScriptGrammar.g:1:10: T__12
                {
                mT__12(); 


                }
                break;
            case 2 :
                // ScriptGrammar.g:1:16: T__13
                {
                mT__13(); 


                }
                break;
            case 3 :
                // ScriptGrammar.g:1:22: T__14
                {
                mT__14(); 


                }
                break;
            case 4 :
                // ScriptGrammar.g:1:28: T__15
                {
                mT__15(); 


                }
                break;
            case 5 :
                // ScriptGrammar.g:1:34: T__16
                {
                mT__16(); 


                }
                break;
            case 6 :
                // ScriptGrammar.g:1:40: T__17
                {
                mT__17(); 


                }
                break;
            case 7 :
                // ScriptGrammar.g:1:46: T__18
                {
                mT__18(); 


                }
                break;
            case 8 :
                // ScriptGrammar.g:1:52: T__19
                {
                mT__19(); 


                }
                break;
            case 9 :
                // ScriptGrammar.g:1:58: T__20
                {
                mT__20(); 


                }
                break;
            case 10 :
                // ScriptGrammar.g:1:64: T__21
                {
                mT__21(); 


                }
                break;
            case 11 :
                // ScriptGrammar.g:1:70: T__22
                {
                mT__22(); 


                }
                break;
            case 12 :
                // ScriptGrammar.g:1:76: T__23
                {
                mT__23(); 


                }
                break;
            case 13 :
                // ScriptGrammar.g:1:82: T__24
                {
                mT__24(); 


                }
                break;
            case 14 :
                // ScriptGrammar.g:1:88: T__25
                {
                mT__25(); 


                }
                break;
            case 15 :
                // ScriptGrammar.g:1:94: T__26
                {
                mT__26(); 


                }
                break;
            case 16 :
                // ScriptGrammar.g:1:100: T__27
                {
                mT__27(); 


                }
                break;
            case 17 :
                // ScriptGrammar.g:1:106: T__28
                {
                mT__28(); 


                }
                break;
            case 18 :
                // ScriptGrammar.g:1:112: T__29
                {
                mT__29(); 


                }
                break;
            case 19 :
                // ScriptGrammar.g:1:118: T__30
                {
                mT__30(); 


                }
                break;
            case 20 :
                // ScriptGrammar.g:1:124: T__31
                {
                mT__31(); 


                }
                break;
            case 21 :
                // ScriptGrammar.g:1:130: T__32
                {
                mT__32(); 


                }
                break;
            case 22 :
                // ScriptGrammar.g:1:136: T__33
                {
                mT__33(); 


                }
                break;
            case 23 :
                // ScriptGrammar.g:1:142: T__34
                {
                mT__34(); 


                }
                break;
            case 24 :
                // ScriptGrammar.g:1:148: T__35
                {
                mT__35(); 


                }
                break;
            case 25 :
                // ScriptGrammar.g:1:154: T__36
                {
                mT__36(); 


                }
                break;
            case 26 :
                // ScriptGrammar.g:1:160: TYPE
                {
                mTYPE(); 


                }
                break;
            case 27 :
                // ScriptGrammar.g:1:165: ID
                {
                mID(); 


                }
                break;
            case 28 :
                // ScriptGrammar.g:1:168: INT
                {
                mINT(); 


                }
                break;
            case 29 :
                // ScriptGrammar.g:1:172: NEWLINE
                {
                mNEWLINE(); 


                }
                break;
            case 30 :
                // ScriptGrammar.g:1:180: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\13\uffff\1\36\1\40\1\43\2\30\4\uffff\4\30\4\uffff\1\54\7\uffff"+
        "\1\55\6\30\3\uffff\1\64\5\30\1\uffff\1\30\1\64\4\30\1\64\2\30\1"+
        "\101\1\64\1\30\1\uffff\1\64";
    static final String DFA6_eofS =
        "\103\uffff";
    static final String DFA6_minS =
        "\1\11\12\uffff\1\74\2\75\1\146\1\145\4\uffff\1\157\1\154\2\157\4"+
        "\uffff\1\74\7\uffff\1\101\2\164\1\156\1\157\1\165\1\157\3\uffff"+
        "\1\101\1\165\1\147\1\141\1\142\1\154\1\uffff\1\162\1\101\1\164\1"+
        "\154\1\145\1\156\1\101\1\145\1\141\2\101\1\156\1\uffff\1\101";
    static final String DFA6_maxS =
        "\1\176\12\uffff\2\75\1\76\1\156\1\145\4\uffff\1\157\1\154\2\157"+
        "\4\uffff\1\74\7\uffff\1\172\2\164\1\156\1\157\1\165\1\157\3\uffff"+
        "\1\172\1\165\1\147\1\141\1\142\1\154\1\uffff\1\162\1\172\1\164\1"+
        "\154\1\145\1\156\1\172\1\145\1\141\2\172\1\156\1\uffff\1\172";
    static final String DFA6_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\5\uffff\1\26"+
        "\1\27\1\30\1\31\4\uffff\1\33\1\34\1\35\1\36\1\uffff\1\16\1\13\1"+
        "\20\1\17\1\22\1\23\1\21\7\uffff\1\15\1\14\1\24\6\uffff\1\32\14\uffff"+
        "\1\25\1\uffff";
    static final String DFA6_specialS =
        "\103\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\33\1\32\2\uffff\1\32\22\uffff\1\33\1\1\3\uffff\1\2\1\3\1"+
            "\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\uffff\1\12\12\31\2\uffff"+
            "\1\13\1\14\1\15\2\uffff\32\30\6\uffff\1\30\1\27\1\30\1\26\1"+
            "\30\1\25\2\30\1\16\2\30\1\24\5\30\1\17\10\30\1\20\1\21\1\22"+
            "\1\23",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\34\1\35",
            "\1\37",
            "\1\41\1\42",
            "\1\44\7\uffff\1\45",
            "\1\46",
            "",
            "",
            "",
            "",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "",
            "",
            "",
            "",
            "\1\53",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\32\30\6\uffff\32\30",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "",
            "",
            "",
            "\32\30\6\uffff\32\30",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "",
            "\1\72",
            "\32\30\6\uffff\32\30",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\32\30\6\uffff\32\30",
            "\1\77",
            "\1\100",
            "\32\30\6\uffff\32\30",
            "\32\30\6\uffff\32\30",
            "\1\102",
            "",
            "\32\30\6\uffff\32\30"
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | TYPE | ID | INT | NEWLINE | WS );";
        }
    }
 

}