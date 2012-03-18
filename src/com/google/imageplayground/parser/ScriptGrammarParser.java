// $ANTLR 3.4 ScriptGrammar.g 2012-03-11 13:42:08

package com.google.imageplayground.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class ScriptGrammarParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CALL", "ID", "INT", "NEG", "NEWLINE", "TYPE", "WS", "'%'", "'&'", "'('", "')'", "'*'", "'+'", "','", "'-'", "'/'", "'<<'", "'<<<'", "'='", "'>>'", "'return'", "'|'", "'~'"
    };

    public static final int EOF=-1;
    public static final int T__11=11;
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
    public static final int CALL=4;
    public static final int ID=5;
    public static final int INT=6;
    public static final int NEG=7;
    public static final int NEWLINE=8;
    public static final int TYPE=9;
    public static final int WS=10;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public ScriptGrammarParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public ScriptGrammarParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return ScriptGrammarParser.tokenNames; }
    public String getGrammarFileName() { return "ScriptGrammar.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // ScriptGrammar.g:22:1: prog : ( stat )+ ;
    public final ScriptGrammarParser.prog_return prog() throws RecognitionException {
        ScriptGrammarParser.prog_return retval = new ScriptGrammarParser.prog_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        ScriptGrammarParser.stat_return stat1 =null;



        try {
            // ScriptGrammar.g:22:5: ( ( stat )+ )
            // ScriptGrammar.g:22:9: ( stat )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // ScriptGrammar.g:22:9: ( stat )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= ID && LA1_0 <= INT)||(LA1_0 >= NEWLINE && LA1_0 <= TYPE)||LA1_0==13||LA1_0==18||LA1_0==24||LA1_0==26) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ScriptGrammar.g:22:10: stat
            	    {
            	    pushFollow(FOLLOW_stat_in_prog73);
            	    stat1=stat();

            	    state._fsp--;

            	    adaptor.addChild(root_0, stat1.getTree());

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


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "prog"


    public static class stat_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stat"
    // ScriptGrammar.g:24:1: stat : ( expr NEWLINE -> expr | TYPE assign -> ^( TYPE assign ) | assign | retexp | NEWLINE ->);
    public final ScriptGrammarParser.stat_return stat() throws RecognitionException {
        ScriptGrammarParser.stat_return retval = new ScriptGrammarParser.stat_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token NEWLINE3=null;
        Token TYPE4=null;
        Token NEWLINE8=null;
        ScriptGrammarParser.expr_return expr2 =null;

        ScriptGrammarParser.assign_return assign5 =null;

        ScriptGrammarParser.assign_return assign6 =null;

        ScriptGrammarParser.retexp_return retexp7 =null;


        CommonTree NEWLINE3_tree=null;
        CommonTree TYPE4_tree=null;
        CommonTree NEWLINE8_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_TYPE=new RewriteRuleTokenStream(adaptor,"token TYPE");
        RewriteRuleSubtreeStream stream_assign=new RewriteRuleSubtreeStream(adaptor,"rule assign");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // ScriptGrammar.g:24:5: ( expr NEWLINE -> expr | TYPE assign -> ^( TYPE assign ) | assign | retexp | NEWLINE ->)
            int alt2=5;
            switch ( input.LA(1) ) {
            case INT:
            case 13:
            case 18:
            case 26:
                {
                alt2=1;
                }
                break;
            case ID:
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==NEWLINE||(LA2_2 >= 11 && LA2_2 <= 13)||(LA2_2 >= 15 && LA2_2 <= 16)||(LA2_2 >= 18 && LA2_2 <= 21)||LA2_2==23||LA2_2==25) ) {
                    alt2=1;
                }
                else if ( (LA2_2==22) ) {
                    alt2=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;

                }
                }
                break;
            case TYPE:
                {
                alt2=2;
                }
                break;
            case 24:
                {
                alt2=4;
                }
                break;
            case NEWLINE:
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
                    // ScriptGrammar.g:24:9: expr NEWLINE
                    {
                    pushFollow(FOLLOW_expr_in_stat85);
                    expr2=expr();

                    state._fsp--;

                    stream_expr.add(expr2.getTree());

                    NEWLINE3=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_stat87);  
                    stream_NEWLINE.add(NEWLINE3);


                    // AST REWRITE
                    // elements: expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 24:29: -> expr
                    {
                        adaptor.addChild(root_0, stream_expr.nextTree());

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // ScriptGrammar.g:25:9: TYPE assign
                    {
                    TYPE4=(Token)match(input,TYPE,FOLLOW_TYPE_in_stat108);  
                    stream_TYPE.add(TYPE4);


                    pushFollow(FOLLOW_assign_in_stat110);
                    assign5=assign();

                    state._fsp--;

                    stream_assign.add(assign5.getTree());

                    // AST REWRITE
                    // elements: assign, TYPE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 25:21: -> ^( TYPE assign )
                    {
                        // ScriptGrammar.g:25:24: ^( TYPE assign )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_TYPE.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_assign.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // ScriptGrammar.g:26:9: assign
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_assign_in_stat128);
                    assign6=assign();

                    state._fsp--;

                    adaptor.addChild(root_0, assign6.getTree());

                    }
                    break;
                case 4 :
                    // ScriptGrammar.g:27:9: retexp
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_retexp_in_stat138);
                    retexp7=retexp();

                    state._fsp--;

                    adaptor.addChild(root_0, retexp7.getTree());

                    }
                    break;
                case 5 :
                    // ScriptGrammar.g:28:9: NEWLINE
                    {
                    NEWLINE8=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_stat148);  
                    stream_NEWLINE.add(NEWLINE8);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 28:29: ->
                    {
                        root_0 = null;
                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "stat"


    public static class assign_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assign"
    // ScriptGrammar.g:31:1: assign : ID '=' expr NEWLINE -> ^( '=' ID expr ) ;
    public final ScriptGrammarParser.assign_return assign() throws RecognitionException {
        ScriptGrammarParser.assign_return retval = new ScriptGrammarParser.assign_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID9=null;
        Token char_literal10=null;
        Token NEWLINE12=null;
        ScriptGrammarParser.expr_return expr11 =null;


        CommonTree ID9_tree=null;
        CommonTree char_literal10_tree=null;
        CommonTree NEWLINE12_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_22=new RewriteRuleTokenStream(adaptor,"token 22");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // ScriptGrammar.g:31:7: ( ID '=' expr NEWLINE -> ^( '=' ID expr ) )
            // ScriptGrammar.g:31:9: ID '=' expr NEWLINE
            {
            ID9=(Token)match(input,ID,FOLLOW_ID_in_assign178);  
            stream_ID.add(ID9);


            char_literal10=(Token)match(input,22,FOLLOW_22_in_assign180);  
            stream_22.add(char_literal10);


            pushFollow(FOLLOW_expr_in_assign182);
            expr11=expr();

            state._fsp--;

            stream_expr.add(expr11.getTree());

            NEWLINE12=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_assign184);  
            stream_NEWLINE.add(NEWLINE12);


            // AST REWRITE
            // elements: expr, ID, 22
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 31:29: -> ^( '=' ID expr )
            {
                // ScriptGrammar.g:31:32: ^( '=' ID expr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_22.nextNode()
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assign"


    public static class retexp_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "retexp"
    // ScriptGrammar.g:34:1: retexp : 'return' expr NEWLINE -> ^( 'return' expr ) ;
    public final ScriptGrammarParser.retexp_return retexp() throws RecognitionException {
        ScriptGrammarParser.retexp_return retval = new ScriptGrammarParser.retexp_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal13=null;
        Token NEWLINE15=null;
        ScriptGrammarParser.expr_return expr14 =null;


        CommonTree string_literal13_tree=null;
        CommonTree NEWLINE15_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // ScriptGrammar.g:34:7: ( 'return' expr NEWLINE -> ^( 'return' expr ) )
            // ScriptGrammar.g:34:9: 'return' expr NEWLINE
            {
            string_literal13=(Token)match(input,24,FOLLOW_24_in_retexp210);  
            stream_24.add(string_literal13);


            pushFollow(FOLLOW_expr_in_retexp212);
            expr14=expr();

            state._fsp--;

            stream_expr.add(expr14.getTree());

            NEWLINE15=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_retexp214);  
            stream_NEWLINE.add(NEWLINE15);


            // AST REWRITE
            // elements: 24, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 34:31: -> ^( 'return' expr )
            {
                // ScriptGrammar.g:34:34: ^( 'return' expr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_24.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "retexp"


    public static class expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // ScriptGrammar.g:37:1: expr : multExpr ( ( '+' ^| '-' ^| '&' ^| '|' ^| '>>' ^| '<<' ^| '<<<' ^) multExpr )* ;
    public final ScriptGrammarParser.expr_return expr() throws RecognitionException {
        ScriptGrammarParser.expr_return retval = new ScriptGrammarParser.expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal17=null;
        Token char_literal18=null;
        Token char_literal19=null;
        Token char_literal20=null;
        Token string_literal21=null;
        Token string_literal22=null;
        Token string_literal23=null;
        ScriptGrammarParser.multExpr_return multExpr16 =null;

        ScriptGrammarParser.multExpr_return multExpr24 =null;


        CommonTree char_literal17_tree=null;
        CommonTree char_literal18_tree=null;
        CommonTree char_literal19_tree=null;
        CommonTree char_literal20_tree=null;
        CommonTree string_literal21_tree=null;
        CommonTree string_literal22_tree=null;
        CommonTree string_literal23_tree=null;

        try {
            // ScriptGrammar.g:37:5: ( multExpr ( ( '+' ^| '-' ^| '&' ^| '|' ^| '>>' ^| '<<' ^| '<<<' ^) multExpr )* )
            // ScriptGrammar.g:37:9: multExpr ( ( '+' ^| '-' ^| '&' ^| '|' ^| '>>' ^| '<<' ^| '<<<' ^) multExpr )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_multExpr_in_expr240);
            multExpr16=multExpr();

            state._fsp--;

            adaptor.addChild(root_0, multExpr16.getTree());

            // ScriptGrammar.g:37:18: ( ( '+' ^| '-' ^| '&' ^| '|' ^| '>>' ^| '<<' ^| '<<<' ^) multExpr )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==12||LA4_0==16||LA4_0==18||(LA4_0 >= 20 && LA4_0 <= 21)||LA4_0==23||LA4_0==25) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ScriptGrammar.g:37:19: ( '+' ^| '-' ^| '&' ^| '|' ^| '>>' ^| '<<' ^| '<<<' ^) multExpr
            	    {
            	    // ScriptGrammar.g:37:19: ( '+' ^| '-' ^| '&' ^| '|' ^| '>>' ^| '<<' ^| '<<<' ^)
            	    int alt3=7;
            	    switch ( input.LA(1) ) {
            	    case 16:
            	        {
            	        alt3=1;
            	        }
            	        break;
            	    case 18:
            	        {
            	        alt3=2;
            	        }
            	        break;
            	    case 12:
            	        {
            	        alt3=3;
            	        }
            	        break;
            	    case 25:
            	        {
            	        alt3=4;
            	        }
            	        break;
            	    case 23:
            	        {
            	        alt3=5;
            	        }
            	        break;
            	    case 20:
            	        {
            	        alt3=6;
            	        }
            	        break;
            	    case 21:
            	        {
            	        alt3=7;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 3, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt3) {
            	        case 1 :
            	            // ScriptGrammar.g:37:20: '+' ^
            	            {
            	            char_literal17=(Token)match(input,16,FOLLOW_16_in_expr244); 
            	            char_literal17_tree = 
            	            (CommonTree)adaptor.create(char_literal17)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal17_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // ScriptGrammar.g:37:25: '-' ^
            	            {
            	            char_literal18=(Token)match(input,18,FOLLOW_18_in_expr247); 
            	            char_literal18_tree = 
            	            (CommonTree)adaptor.create(char_literal18)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal18_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // ScriptGrammar.g:37:30: '&' ^
            	            {
            	            char_literal19=(Token)match(input,12,FOLLOW_12_in_expr250); 
            	            char_literal19_tree = 
            	            (CommonTree)adaptor.create(char_literal19)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal19_tree, root_0);


            	            }
            	            break;
            	        case 4 :
            	            // ScriptGrammar.g:37:35: '|' ^
            	            {
            	            char_literal20=(Token)match(input,25,FOLLOW_25_in_expr253); 
            	            char_literal20_tree = 
            	            (CommonTree)adaptor.create(char_literal20)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal20_tree, root_0);


            	            }
            	            break;
            	        case 5 :
            	            // ScriptGrammar.g:37:40: '>>' ^
            	            {
            	            string_literal21=(Token)match(input,23,FOLLOW_23_in_expr256); 
            	            string_literal21_tree = 
            	            (CommonTree)adaptor.create(string_literal21)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(string_literal21_tree, root_0);


            	            }
            	            break;
            	        case 6 :
            	            // ScriptGrammar.g:37:46: '<<' ^
            	            {
            	            string_literal22=(Token)match(input,20,FOLLOW_20_in_expr259); 
            	            string_literal22_tree = 
            	            (CommonTree)adaptor.create(string_literal22)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(string_literal22_tree, root_0);


            	            }
            	            break;
            	        case 7 :
            	            // ScriptGrammar.g:37:52: '<<<' ^
            	            {
            	            string_literal23=(Token)match(input,21,FOLLOW_21_in_expr262); 
            	            string_literal23_tree = 
            	            (CommonTree)adaptor.create(string_literal23)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(string_literal23_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_multExpr_in_expr266);
            	    multExpr24=multExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, multExpr24.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr"


    public static class multExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "multExpr"
    // ScriptGrammar.g:40:1: multExpr : unaryExp ( ( '*' ^| '/' ^| '%' ^) unaryExp )* ;
    public final ScriptGrammarParser.multExpr_return multExpr() throws RecognitionException {
        ScriptGrammarParser.multExpr_return retval = new ScriptGrammarParser.multExpr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal26=null;
        Token char_literal27=null;
        Token char_literal28=null;
        ScriptGrammarParser.unaryExp_return unaryExp25 =null;

        ScriptGrammarParser.unaryExp_return unaryExp29 =null;


        CommonTree char_literal26_tree=null;
        CommonTree char_literal27_tree=null;
        CommonTree char_literal28_tree=null;

        try {
            // ScriptGrammar.g:41:5: ( unaryExp ( ( '*' ^| '/' ^| '%' ^) unaryExp )* )
            // ScriptGrammar.g:41:9: unaryExp ( ( '*' ^| '/' ^| '%' ^) unaryExp )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_unaryExp_in_multExpr288);
            unaryExp25=unaryExp();

            state._fsp--;

            adaptor.addChild(root_0, unaryExp25.getTree());

            // ScriptGrammar.g:41:18: ( ( '*' ^| '/' ^| '%' ^) unaryExp )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==11||LA6_0==15||LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ScriptGrammar.g:41:19: ( '*' ^| '/' ^| '%' ^) unaryExp
            	    {
            	    // ScriptGrammar.g:41:19: ( '*' ^| '/' ^| '%' ^)
            	    int alt5=3;
            	    switch ( input.LA(1) ) {
            	    case 15:
            	        {
            	        alt5=1;
            	        }
            	        break;
            	    case 19:
            	        {
            	        alt5=2;
            	        }
            	        break;
            	    case 11:
            	        {
            	        alt5=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 5, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt5) {
            	        case 1 :
            	            // ScriptGrammar.g:41:20: '*' ^
            	            {
            	            char_literal26=(Token)match(input,15,FOLLOW_15_in_multExpr292); 
            	            char_literal26_tree = 
            	            (CommonTree)adaptor.create(char_literal26)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal26_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // ScriptGrammar.g:41:25: '/' ^
            	            {
            	            char_literal27=(Token)match(input,19,FOLLOW_19_in_multExpr295); 
            	            char_literal27_tree = 
            	            (CommonTree)adaptor.create(char_literal27)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal27_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // ScriptGrammar.g:41:30: '%' ^
            	            {
            	            char_literal28=(Token)match(input,11,FOLLOW_11_in_multExpr298); 
            	            char_literal28_tree = 
            	            (CommonTree)adaptor.create(char_literal28)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal28_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_unaryExp_in_multExpr302);
            	    unaryExp29=unaryExp();

            	    state._fsp--;

            	    adaptor.addChild(root_0, unaryExp29.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "multExpr"


    public static class unaryExp_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unaryExp"
    // ScriptGrammar.g:44:1: unaryExp : ( '-' atom -> ^( NEG atom ) | '~' atom -> ^( '~' atom ) | atom );
    public final ScriptGrammarParser.unaryExp_return unaryExp() throws RecognitionException {
        ScriptGrammarParser.unaryExp_return retval = new ScriptGrammarParser.unaryExp_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal30=null;
        Token char_literal32=null;
        ScriptGrammarParser.atom_return atom31 =null;

        ScriptGrammarParser.atom_return atom33 =null;

        ScriptGrammarParser.atom_return atom34 =null;


        CommonTree char_literal30_tree=null;
        CommonTree char_literal32_tree=null;
        RewriteRuleTokenStream stream_18=new RewriteRuleTokenStream(adaptor,"token 18");
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");
        try {
            // ScriptGrammar.g:45:5: ( '-' atom -> ^( NEG atom ) | '~' atom -> ^( '~' atom ) | atom )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt7=1;
                }
                break;
            case 26:
                {
                alt7=2;
                }
                break;
            case ID:
            case INT:
            case 13:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }

            switch (alt7) {
                case 1 :
                    // ScriptGrammar.g:45:9: '-' atom
                    {
                    char_literal30=(Token)match(input,18,FOLLOW_18_in_unaryExp328);  
                    stream_18.add(char_literal30);


                    pushFollow(FOLLOW_atom_in_unaryExp330);
                    atom31=atom();

                    state._fsp--;

                    stream_atom.add(atom31.getTree());

                    // AST REWRITE
                    // elements: atom
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 45:18: -> ^( NEG atom )
                    {
                        // ScriptGrammar.g:45:21: ^( NEG atom )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(NEG, "NEG")
                        , root_1);

                        adaptor.addChild(root_1, stream_atom.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // ScriptGrammar.g:46:9: '~' atom
                    {
                    char_literal32=(Token)match(input,26,FOLLOW_26_in_unaryExp348);  
                    stream_26.add(char_literal32);


                    pushFollow(FOLLOW_atom_in_unaryExp350);
                    atom33=atom();

                    state._fsp--;

                    stream_atom.add(atom33.getTree());

                    // AST REWRITE
                    // elements: 26, atom
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 46:18: -> ^( '~' atom )
                    {
                        // ScriptGrammar.g:46:21: ^( '~' atom )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_26.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_atom.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // ScriptGrammar.g:47:9: atom
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_atom_in_unaryExp368);
                    atom34=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom34.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "unaryExp"


    public static class atom_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atom"
    // ScriptGrammar.g:50:1: atom : ( INT | ID | '(' ! expr ')' !| funcall );
    public final ScriptGrammarParser.atom_return atom() throws RecognitionException {
        ScriptGrammarParser.atom_return retval = new ScriptGrammarParser.atom_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token INT35=null;
        Token ID36=null;
        Token char_literal37=null;
        Token char_literal39=null;
        ScriptGrammarParser.expr_return expr38 =null;

        ScriptGrammarParser.funcall_return funcall40 =null;


        CommonTree INT35_tree=null;
        CommonTree ID36_tree=null;
        CommonTree char_literal37_tree=null;
        CommonTree char_literal39_tree=null;

        try {
            // ScriptGrammar.g:50:5: ( INT | ID | '(' ! expr ')' !| funcall )
            int alt8=4;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt8=1;
                }
                break;
            case ID:
                {
                int LA8_2 = input.LA(2);

                if ( (LA8_2==13) ) {
                    alt8=4;
                }
                else if ( (LA8_2==NEWLINE||(LA8_2 >= 11 && LA8_2 <= 12)||(LA8_2 >= 14 && LA8_2 <= 21)||LA8_2==23||LA8_2==25) ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

                    throw nvae;

                }
                }
                break;
            case 13:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }

            switch (alt8) {
                case 1 :
                    // ScriptGrammar.g:50:9: INT
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    INT35=(Token)match(input,INT,FOLLOW_INT_in_atom386); 
                    INT35_tree = 
                    (CommonTree)adaptor.create(INT35)
                    ;
                    adaptor.addChild(root_0, INT35_tree);


                    }
                    break;
                case 2 :
                    // ScriptGrammar.g:51:9: ID
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    ID36=(Token)match(input,ID,FOLLOW_ID_in_atom397); 
                    ID36_tree = 
                    (CommonTree)adaptor.create(ID36)
                    ;
                    adaptor.addChild(root_0, ID36_tree);


                    }
                    break;
                case 3 :
                    // ScriptGrammar.g:52:9: '(' ! expr ')' !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal37=(Token)match(input,13,FOLLOW_13_in_atom407); 

                    pushFollow(FOLLOW_expr_in_atom410);
                    expr38=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr38.getTree());

                    char_literal39=(Token)match(input,14,FOLLOW_14_in_atom412); 

                    }
                    break;
                case 4 :
                    // ScriptGrammar.g:53:9: funcall
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_atom423);
                    funcall40=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall40.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "atom"


    public static class funcall_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "funcall"
    // ScriptGrammar.g:56:1: funcall : ID '(' expr ( ',' expr )* ')' -> ^( CALL ID ( expr )* ) ;
    public final ScriptGrammarParser.funcall_return funcall() throws RecognitionException {
        ScriptGrammarParser.funcall_return retval = new ScriptGrammarParser.funcall_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID41=null;
        Token char_literal42=null;
        Token char_literal44=null;
        Token char_literal46=null;
        ScriptGrammarParser.expr_return expr43 =null;

        ScriptGrammarParser.expr_return expr45 =null;


        CommonTree ID41_tree=null;
        CommonTree char_literal42_tree=null;
        CommonTree char_literal44_tree=null;
        CommonTree char_literal46_tree=null;
        RewriteRuleTokenStream stream_17=new RewriteRuleTokenStream(adaptor,"token 17");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_13=new RewriteRuleTokenStream(adaptor,"token 13");
        RewriteRuleTokenStream stream_14=new RewriteRuleTokenStream(adaptor,"token 14");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // ScriptGrammar.g:56:8: ( ID '(' expr ( ',' expr )* ')' -> ^( CALL ID ( expr )* ) )
            // ScriptGrammar.g:56:10: ID '(' expr ( ',' expr )* ')'
            {
            ID41=(Token)match(input,ID,FOLLOW_ID_in_funcall435);  
            stream_ID.add(ID41);


            char_literal42=(Token)match(input,13,FOLLOW_13_in_funcall437);  
            stream_13.add(char_literal42);


            pushFollow(FOLLOW_expr_in_funcall439);
            expr43=expr();

            state._fsp--;

            stream_expr.add(expr43.getTree());

            // ScriptGrammar.g:56:22: ( ',' expr )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==17) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ScriptGrammar.g:56:23: ',' expr
            	    {
            	    char_literal44=(Token)match(input,17,FOLLOW_17_in_funcall442);  
            	    stream_17.add(char_literal44);


            	    pushFollow(FOLLOW_expr_in_funcall444);
            	    expr45=expr();

            	    state._fsp--;

            	    stream_expr.add(expr45.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            char_literal46=(Token)match(input,14,FOLLOW_14_in_funcall448);  
            stream_14.add(char_literal46);


            // AST REWRITE
            // elements: expr, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 56:37: -> ^( CALL ID ( expr )* )
            {
                // ScriptGrammar.g:56:40: ^( CALL ID ( expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(CALL, "CALL")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // ScriptGrammar.g:56:50: ( expr )*
                while ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "funcall"

    // Delegated rules


 

    public static final BitSet FOLLOW_stat_in_prog73 = new BitSet(new long[]{0x0000000005042362L});
    public static final BitSet FOLLOW_expr_in_stat85 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_stat87 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_stat108 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_assign_in_stat110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_in_stat128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_retexp_in_stat138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_stat148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assign178 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_assign180 = new BitSet(new long[]{0x0000000004042060L});
    public static final BitSet FOLLOW_expr_in_assign182 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_assign184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_retexp210 = new BitSet(new long[]{0x0000000004042060L});
    public static final BitSet FOLLOW_expr_in_retexp212 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_retexp214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multExpr_in_expr240 = new BitSet(new long[]{0x0000000002B51002L});
    public static final BitSet FOLLOW_16_in_expr244 = new BitSet(new long[]{0x0000000004042060L});
    public static final BitSet FOLLOW_18_in_expr247 = new BitSet(new long[]{0x0000000004042060L});
    public static final BitSet FOLLOW_12_in_expr250 = new BitSet(new long[]{0x0000000004042060L});
    public static final BitSet FOLLOW_25_in_expr253 = new BitSet(new long[]{0x0000000004042060L});
    public static final BitSet FOLLOW_23_in_expr256 = new BitSet(new long[]{0x0000000004042060L});
    public static final BitSet FOLLOW_20_in_expr259 = new BitSet(new long[]{0x0000000004042060L});
    public static final BitSet FOLLOW_21_in_expr262 = new BitSet(new long[]{0x0000000004042060L});
    public static final BitSet FOLLOW_multExpr_in_expr266 = new BitSet(new long[]{0x0000000002B51002L});
    public static final BitSet FOLLOW_unaryExp_in_multExpr288 = new BitSet(new long[]{0x0000000000088802L});
    public static final BitSet FOLLOW_15_in_multExpr292 = new BitSet(new long[]{0x0000000004042060L});
    public static final BitSet FOLLOW_19_in_multExpr295 = new BitSet(new long[]{0x0000000004042060L});
    public static final BitSet FOLLOW_11_in_multExpr298 = new BitSet(new long[]{0x0000000004042060L});
    public static final BitSet FOLLOW_unaryExp_in_multExpr302 = new BitSet(new long[]{0x0000000000088802L});
    public static final BitSet FOLLOW_18_in_unaryExp328 = new BitSet(new long[]{0x0000000000002060L});
    public static final BitSet FOLLOW_atom_in_unaryExp330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_unaryExp348 = new BitSet(new long[]{0x0000000000002060L});
    public static final BitSet FOLLOW_atom_in_unaryExp350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_unaryExp368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_atom407 = new BitSet(new long[]{0x0000000004042060L});
    public static final BitSet FOLLOW_expr_in_atom410 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_atom412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_atom423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funcall435 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_funcall437 = new BitSet(new long[]{0x0000000004042060L});
    public static final BitSet FOLLOW_expr_in_funcall439 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_17_in_funcall442 = new BitSet(new long[]{0x0000000004042060L});
    public static final BitSet FOLLOW_expr_in_funcall444 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_14_in_funcall448 = new BitSet(new long[]{0x0000000000000002L});

}