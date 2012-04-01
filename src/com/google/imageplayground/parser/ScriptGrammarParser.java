// $ANTLR 3.4 ScriptGrammar.g 2012-04-01 02:12:23

package com.google.imageplayground.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class ScriptGrammarParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "BLOCK", "CALL", "ID", "INT", "NEG", "NEWLINE", "TYPE", "WS", "'!='", "'%'", "'&'", "'('", "')'", "'*'", "'+'", "','", "'-'", "'/'", "'<'", "'<<'", "'<<<'", "'<='", "'='", "'=='", "'>'", "'>='", "'>>'", "'for'", "'if'", "'return'", "'while'", "'{'", "'|'", "'}'", "'~'"
    };

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
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int BLOCK=4;
    public static final int CALL=5;
    public static final int ID=6;
    public static final int INT=7;
    public static final int NEG=8;
    public static final int NEWLINE=9;
    public static final int TYPE=10;
    public static final int WS=11;

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
    // ScriptGrammar.g:24:1: prog : ( block )+ ;
    public final ScriptGrammarParser.prog_return prog() throws RecognitionException {
        ScriptGrammarParser.prog_return retval = new ScriptGrammarParser.prog_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        ScriptGrammarParser.block_return block1 =null;



        try {
            // ScriptGrammar.g:24:5: ( ( block )+ )
            // ScriptGrammar.g:24:9: ( block )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // ScriptGrammar.g:24:9: ( block )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= ID && LA1_0 <= INT)||(LA1_0 >= NEWLINE && LA1_0 <= TYPE)||LA1_0==15||LA1_0==20||(LA1_0 >= 31 && LA1_0 <= 35)||LA1_0==38) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ScriptGrammar.g:24:10: block
            	    {
            	    pushFollow(FOLLOW_block_in_prog91);
            	    block1=block();

            	    state._fsp--;

            	    adaptor.addChild(root_0, block1.getTree());

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


    public static class block_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "block"
    // ScriptGrammar.g:26:1: block : ( '{' NEWLINE ( block )* '}' -> ^( BLOCK ( block )* ) | stat );
    public final ScriptGrammarParser.block_return block() throws RecognitionException {
        ScriptGrammarParser.block_return retval = new ScriptGrammarParser.block_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal2=null;
        Token NEWLINE3=null;
        Token char_literal5=null;
        ScriptGrammarParser.block_return block4 =null;

        ScriptGrammarParser.stat_return stat6 =null;


        CommonTree char_literal2_tree=null;
        CommonTree NEWLINE3_tree=null;
        CommonTree char_literal5_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // ScriptGrammar.g:26:6: ( '{' NEWLINE ( block )* '}' -> ^( BLOCK ( block )* ) | stat )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==35) ) {
                alt3=1;
            }
            else if ( ((LA3_0 >= ID && LA3_0 <= INT)||(LA3_0 >= NEWLINE && LA3_0 <= TYPE)||LA3_0==15||LA3_0==20||(LA3_0 >= 31 && LA3_0 <= 34)||LA3_0==38) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // ScriptGrammar.g:26:8: '{' NEWLINE ( block )* '}'
                    {
                    char_literal2=(Token)match(input,35,FOLLOW_35_in_block101);  
                    stream_35.add(char_literal2);


                    NEWLINE3=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_block103);  
                    stream_NEWLINE.add(NEWLINE3);


                    // ScriptGrammar.g:26:20: ( block )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0 >= ID && LA2_0 <= INT)||(LA2_0 >= NEWLINE && LA2_0 <= TYPE)||LA2_0==15||LA2_0==20||(LA2_0 >= 31 && LA2_0 <= 35)||LA2_0==38) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ScriptGrammar.g:26:20: block
                    	    {
                    	    pushFollow(FOLLOW_block_in_block105);
                    	    block4=block();

                    	    state._fsp--;

                    	    stream_block.add(block4.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    char_literal5=(Token)match(input,37,FOLLOW_37_in_block108);  
                    stream_37.add(char_literal5);


                    // AST REWRITE
                    // elements: block
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 26:31: -> ^( BLOCK ( block )* )
                    {
                        // ScriptGrammar.g:26:34: ^( BLOCK ( block )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(BLOCK, "BLOCK")
                        , root_1);

                        // ScriptGrammar.g:26:42: ( block )*
                        while ( stream_block.hasNext() ) {
                            adaptor.addChild(root_1, stream_block.nextTree());

                        }
                        stream_block.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // ScriptGrammar.g:27:8: stat
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_stat_in_block126);
                    stat6=stat();

                    state._fsp--;

                    adaptor.addChild(root_0, stat6.getTree());

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
    // $ANTLR end "block"


    public static class stat_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stat"
    // ScriptGrammar.g:30:1: stat : ( expr NEWLINE -> expr | TYPE assign -> ^( TYPE assign ) | assign | retexp | ifexp | whileexp | forexp | NEWLINE ->);
    public final ScriptGrammarParser.stat_return stat() throws RecognitionException {
        ScriptGrammarParser.stat_return retval = new ScriptGrammarParser.stat_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token NEWLINE8=null;
        Token TYPE9=null;
        Token NEWLINE16=null;
        ScriptGrammarParser.expr_return expr7 =null;

        ScriptGrammarParser.assign_return assign10 =null;

        ScriptGrammarParser.assign_return assign11 =null;

        ScriptGrammarParser.retexp_return retexp12 =null;

        ScriptGrammarParser.ifexp_return ifexp13 =null;

        ScriptGrammarParser.whileexp_return whileexp14 =null;

        ScriptGrammarParser.forexp_return forexp15 =null;


        CommonTree NEWLINE8_tree=null;
        CommonTree TYPE9_tree=null;
        CommonTree NEWLINE16_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_TYPE=new RewriteRuleTokenStream(adaptor,"token TYPE");
        RewriteRuleSubtreeStream stream_assign=new RewriteRuleSubtreeStream(adaptor,"rule assign");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // ScriptGrammar.g:30:5: ( expr NEWLINE -> expr | TYPE assign -> ^( TYPE assign ) | assign | retexp | ifexp | whileexp | forexp | NEWLINE ->)
            int alt4=8;
            switch ( input.LA(1) ) {
            case INT:
            case 15:
            case 20:
            case 38:
                {
                alt4=1;
                }
                break;
            case ID:
                {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==NEWLINE||(LA4_2 >= 13 && LA4_2 <= 15)||(LA4_2 >= 17 && LA4_2 <= 18)||(LA4_2 >= 20 && LA4_2 <= 21)||(LA4_2 >= 23 && LA4_2 <= 24)||LA4_2==30||LA4_2==36) ) {
                    alt4=1;
                }
                else if ( (LA4_2==26) ) {
                    alt4=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;

                }
                }
                break;
            case TYPE:
                {
                alt4=2;
                }
                break;
            case 33:
                {
                alt4=4;
                }
                break;
            case 32:
                {
                alt4=5;
                }
                break;
            case 34:
                {
                alt4=6;
                }
                break;
            case 31:
                {
                alt4=7;
                }
                break;
            case NEWLINE:
                {
                alt4=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }

            switch (alt4) {
                case 1 :
                    // ScriptGrammar.g:30:9: expr NEWLINE
                    {
                    pushFollow(FOLLOW_expr_in_stat140);
                    expr7=expr();

                    state._fsp--;

                    stream_expr.add(expr7.getTree());

                    NEWLINE8=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_stat142);  
                    stream_NEWLINE.add(NEWLINE8);


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
                    // 30:29: -> expr
                    {
                        adaptor.addChild(root_0, stream_expr.nextTree());

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // ScriptGrammar.g:31:9: TYPE assign
                    {
                    TYPE9=(Token)match(input,TYPE,FOLLOW_TYPE_in_stat163);  
                    stream_TYPE.add(TYPE9);


                    pushFollow(FOLLOW_assign_in_stat165);
                    assign10=assign();

                    state._fsp--;

                    stream_assign.add(assign10.getTree());

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
                    // 31:21: -> ^( TYPE assign )
                    {
                        // ScriptGrammar.g:31:24: ^( TYPE assign )
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
                    // ScriptGrammar.g:32:9: assign
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_assign_in_stat183);
                    assign11=assign();

                    state._fsp--;

                    adaptor.addChild(root_0, assign11.getTree());

                    }
                    break;
                case 4 :
                    // ScriptGrammar.g:33:9: retexp
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_retexp_in_stat193);
                    retexp12=retexp();

                    state._fsp--;

                    adaptor.addChild(root_0, retexp12.getTree());

                    }
                    break;
                case 5 :
                    // ScriptGrammar.g:34:9: ifexp
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_ifexp_in_stat203);
                    ifexp13=ifexp();

                    state._fsp--;

                    adaptor.addChild(root_0, ifexp13.getTree());

                    }
                    break;
                case 6 :
                    // ScriptGrammar.g:35:9: whileexp
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_whileexp_in_stat213);
                    whileexp14=whileexp();

                    state._fsp--;

                    adaptor.addChild(root_0, whileexp14.getTree());

                    }
                    break;
                case 7 :
                    // ScriptGrammar.g:36:9: forexp
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_forexp_in_stat223);
                    forexp15=forexp();

                    state._fsp--;

                    adaptor.addChild(root_0, forexp15.getTree());

                    }
                    break;
                case 8 :
                    // ScriptGrammar.g:37:9: NEWLINE
                    {
                    NEWLINE16=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_stat233);  
                    stream_NEWLINE.add(NEWLINE16);


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
                    // 37:29: ->
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
    // ScriptGrammar.g:40:1: assign : ID '=' expr NEWLINE -> ^( '=' ID expr ) ;
    public final ScriptGrammarParser.assign_return assign() throws RecognitionException {
        ScriptGrammarParser.assign_return retval = new ScriptGrammarParser.assign_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID17=null;
        Token char_literal18=null;
        Token NEWLINE20=null;
        ScriptGrammarParser.expr_return expr19 =null;


        CommonTree ID17_tree=null;
        CommonTree char_literal18_tree=null;
        CommonTree NEWLINE20_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // ScriptGrammar.g:40:7: ( ID '=' expr NEWLINE -> ^( '=' ID expr ) )
            // ScriptGrammar.g:40:9: ID '=' expr NEWLINE
            {
            ID17=(Token)match(input,ID,FOLLOW_ID_in_assign263);  
            stream_ID.add(ID17);


            char_literal18=(Token)match(input,26,FOLLOW_26_in_assign265);  
            stream_26.add(char_literal18);


            pushFollow(FOLLOW_expr_in_assign267);
            expr19=expr();

            state._fsp--;

            stream_expr.add(expr19.getTree());

            NEWLINE20=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_assign269);  
            stream_NEWLINE.add(NEWLINE20);


            // AST REWRITE
            // elements: ID, 26, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 40:29: -> ^( '=' ID expr )
            {
                // ScriptGrammar.g:40:32: ^( '=' ID expr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_26.nextNode()
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
    // ScriptGrammar.g:43:1: retexp : 'return' expr NEWLINE -> ^( 'return' expr ) ;
    public final ScriptGrammarParser.retexp_return retexp() throws RecognitionException {
        ScriptGrammarParser.retexp_return retval = new ScriptGrammarParser.retexp_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal21=null;
        Token NEWLINE23=null;
        ScriptGrammarParser.expr_return expr22 =null;


        CommonTree string_literal21_tree=null;
        CommonTree NEWLINE23_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // ScriptGrammar.g:43:7: ( 'return' expr NEWLINE -> ^( 'return' expr ) )
            // ScriptGrammar.g:43:9: 'return' expr NEWLINE
            {
            string_literal21=(Token)match(input,33,FOLLOW_33_in_retexp295);  
            stream_33.add(string_literal21);


            pushFollow(FOLLOW_expr_in_retexp297);
            expr22=expr();

            state._fsp--;

            stream_expr.add(expr22.getTree());

            NEWLINE23=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_retexp299);  
            stream_NEWLINE.add(NEWLINE23);


            // AST REWRITE
            // elements: expr, 33
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 43:31: -> ^( 'return' expr )
            {
                // ScriptGrammar.g:43:34: ^( 'return' expr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_33.nextNode()
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
    // ScriptGrammar.g:46:1: expr : multExpr ( ( '+' ^| '-' ^| '&' ^| '|' ^| '>>' ^| '<<' ^| '<<<' ^) multExpr )* ;
    public final ScriptGrammarParser.expr_return expr() throws RecognitionException {
        ScriptGrammarParser.expr_return retval = new ScriptGrammarParser.expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal25=null;
        Token char_literal26=null;
        Token char_literal27=null;
        Token char_literal28=null;
        Token string_literal29=null;
        Token string_literal30=null;
        Token string_literal31=null;
        ScriptGrammarParser.multExpr_return multExpr24 =null;

        ScriptGrammarParser.multExpr_return multExpr32 =null;


        CommonTree char_literal25_tree=null;
        CommonTree char_literal26_tree=null;
        CommonTree char_literal27_tree=null;
        CommonTree char_literal28_tree=null;
        CommonTree string_literal29_tree=null;
        CommonTree string_literal30_tree=null;
        CommonTree string_literal31_tree=null;

        try {
            // ScriptGrammar.g:46:5: ( multExpr ( ( '+' ^| '-' ^| '&' ^| '|' ^| '>>' ^| '<<' ^| '<<<' ^) multExpr )* )
            // ScriptGrammar.g:46:9: multExpr ( ( '+' ^| '-' ^| '&' ^| '|' ^| '>>' ^| '<<' ^| '<<<' ^) multExpr )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_multExpr_in_expr325);
            multExpr24=multExpr();

            state._fsp--;

            adaptor.addChild(root_0, multExpr24.getTree());

            // ScriptGrammar.g:46:18: ( ( '+' ^| '-' ^| '&' ^| '|' ^| '>>' ^| '<<' ^| '<<<' ^) multExpr )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==14||LA6_0==18||LA6_0==20||(LA6_0 >= 23 && LA6_0 <= 24)||LA6_0==30||LA6_0==36) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ScriptGrammar.g:46:19: ( '+' ^| '-' ^| '&' ^| '|' ^| '>>' ^| '<<' ^| '<<<' ^) multExpr
            	    {
            	    // ScriptGrammar.g:46:19: ( '+' ^| '-' ^| '&' ^| '|' ^| '>>' ^| '<<' ^| '<<<' ^)
            	    int alt5=7;
            	    switch ( input.LA(1) ) {
            	    case 18:
            	        {
            	        alt5=1;
            	        }
            	        break;
            	    case 20:
            	        {
            	        alt5=2;
            	        }
            	        break;
            	    case 14:
            	        {
            	        alt5=3;
            	        }
            	        break;
            	    case 36:
            	        {
            	        alt5=4;
            	        }
            	        break;
            	    case 30:
            	        {
            	        alt5=5;
            	        }
            	        break;
            	    case 23:
            	        {
            	        alt5=6;
            	        }
            	        break;
            	    case 24:
            	        {
            	        alt5=7;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 5, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt5) {
            	        case 1 :
            	            // ScriptGrammar.g:46:20: '+' ^
            	            {
            	            char_literal25=(Token)match(input,18,FOLLOW_18_in_expr329); 
            	            char_literal25_tree = 
            	            (CommonTree)adaptor.create(char_literal25)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal25_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // ScriptGrammar.g:46:25: '-' ^
            	            {
            	            char_literal26=(Token)match(input,20,FOLLOW_20_in_expr332); 
            	            char_literal26_tree = 
            	            (CommonTree)adaptor.create(char_literal26)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal26_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // ScriptGrammar.g:46:30: '&' ^
            	            {
            	            char_literal27=(Token)match(input,14,FOLLOW_14_in_expr335); 
            	            char_literal27_tree = 
            	            (CommonTree)adaptor.create(char_literal27)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal27_tree, root_0);


            	            }
            	            break;
            	        case 4 :
            	            // ScriptGrammar.g:46:35: '|' ^
            	            {
            	            char_literal28=(Token)match(input,36,FOLLOW_36_in_expr338); 
            	            char_literal28_tree = 
            	            (CommonTree)adaptor.create(char_literal28)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal28_tree, root_0);


            	            }
            	            break;
            	        case 5 :
            	            // ScriptGrammar.g:46:40: '>>' ^
            	            {
            	            string_literal29=(Token)match(input,30,FOLLOW_30_in_expr341); 
            	            string_literal29_tree = 
            	            (CommonTree)adaptor.create(string_literal29)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(string_literal29_tree, root_0);


            	            }
            	            break;
            	        case 6 :
            	            // ScriptGrammar.g:46:46: '<<' ^
            	            {
            	            string_literal30=(Token)match(input,23,FOLLOW_23_in_expr344); 
            	            string_literal30_tree = 
            	            (CommonTree)adaptor.create(string_literal30)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(string_literal30_tree, root_0);


            	            }
            	            break;
            	        case 7 :
            	            // ScriptGrammar.g:46:52: '<<<' ^
            	            {
            	            string_literal31=(Token)match(input,24,FOLLOW_24_in_expr347); 
            	            string_literal31_tree = 
            	            (CommonTree)adaptor.create(string_literal31)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(string_literal31_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_multExpr_in_expr351);
            	    multExpr32=multExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, multExpr32.getTree());

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
    // $ANTLR end "expr"


    public static class multExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "multExpr"
    // ScriptGrammar.g:49:1: multExpr : unaryExp ( ( '*' ^| '/' ^| '%' ^) unaryExp )* ;
    public final ScriptGrammarParser.multExpr_return multExpr() throws RecognitionException {
        ScriptGrammarParser.multExpr_return retval = new ScriptGrammarParser.multExpr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal34=null;
        Token char_literal35=null;
        Token char_literal36=null;
        ScriptGrammarParser.unaryExp_return unaryExp33 =null;

        ScriptGrammarParser.unaryExp_return unaryExp37 =null;


        CommonTree char_literal34_tree=null;
        CommonTree char_literal35_tree=null;
        CommonTree char_literal36_tree=null;

        try {
            // ScriptGrammar.g:50:5: ( unaryExp ( ( '*' ^| '/' ^| '%' ^) unaryExp )* )
            // ScriptGrammar.g:50:9: unaryExp ( ( '*' ^| '/' ^| '%' ^) unaryExp )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_unaryExp_in_multExpr373);
            unaryExp33=unaryExp();

            state._fsp--;

            adaptor.addChild(root_0, unaryExp33.getTree());

            // ScriptGrammar.g:50:18: ( ( '*' ^| '/' ^| '%' ^) unaryExp )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==13||LA8_0==17||LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ScriptGrammar.g:50:19: ( '*' ^| '/' ^| '%' ^) unaryExp
            	    {
            	    // ScriptGrammar.g:50:19: ( '*' ^| '/' ^| '%' ^)
            	    int alt7=3;
            	    switch ( input.LA(1) ) {
            	    case 17:
            	        {
            	        alt7=1;
            	        }
            	        break;
            	    case 21:
            	        {
            	        alt7=2;
            	        }
            	        break;
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
            	            // ScriptGrammar.g:50:20: '*' ^
            	            {
            	            char_literal34=(Token)match(input,17,FOLLOW_17_in_multExpr377); 
            	            char_literal34_tree = 
            	            (CommonTree)adaptor.create(char_literal34)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal34_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // ScriptGrammar.g:50:25: '/' ^
            	            {
            	            char_literal35=(Token)match(input,21,FOLLOW_21_in_multExpr380); 
            	            char_literal35_tree = 
            	            (CommonTree)adaptor.create(char_literal35)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal35_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // ScriptGrammar.g:50:30: '%' ^
            	            {
            	            char_literal36=(Token)match(input,13,FOLLOW_13_in_multExpr383); 
            	            char_literal36_tree = 
            	            (CommonTree)adaptor.create(char_literal36)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal36_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_unaryExp_in_multExpr387);
            	    unaryExp37=unaryExp();

            	    state._fsp--;

            	    adaptor.addChild(root_0, unaryExp37.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ScriptGrammar.g:53:1: unaryExp : ( '-' atom -> ^( NEG atom ) | '~' atom -> ^( '~' atom ) | atom );
    public final ScriptGrammarParser.unaryExp_return unaryExp() throws RecognitionException {
        ScriptGrammarParser.unaryExp_return retval = new ScriptGrammarParser.unaryExp_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal38=null;
        Token char_literal40=null;
        ScriptGrammarParser.atom_return atom39 =null;

        ScriptGrammarParser.atom_return atom41 =null;

        ScriptGrammarParser.atom_return atom42 =null;


        CommonTree char_literal38_tree=null;
        CommonTree char_literal40_tree=null;
        RewriteRuleTokenStream stream_20=new RewriteRuleTokenStream(adaptor,"token 20");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");
        try {
            // ScriptGrammar.g:54:5: ( '-' atom -> ^( NEG atom ) | '~' atom -> ^( '~' atom ) | atom )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt9=1;
                }
                break;
            case 38:
                {
                alt9=2;
                }
                break;
            case ID:
            case INT:
            case 15:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }

            switch (alt9) {
                case 1 :
                    // ScriptGrammar.g:54:9: '-' atom
                    {
                    char_literal38=(Token)match(input,20,FOLLOW_20_in_unaryExp413);  
                    stream_20.add(char_literal38);


                    pushFollow(FOLLOW_atom_in_unaryExp415);
                    atom39=atom();

                    state._fsp--;

                    stream_atom.add(atom39.getTree());

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
                    // 54:18: -> ^( NEG atom )
                    {
                        // ScriptGrammar.g:54:21: ^( NEG atom )
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
                    // ScriptGrammar.g:55:9: '~' atom
                    {
                    char_literal40=(Token)match(input,38,FOLLOW_38_in_unaryExp433);  
                    stream_38.add(char_literal40);


                    pushFollow(FOLLOW_atom_in_unaryExp435);
                    atom41=atom();

                    state._fsp--;

                    stream_atom.add(atom41.getTree());

                    // AST REWRITE
                    // elements: atom, 38
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 55:18: -> ^( '~' atom )
                    {
                        // ScriptGrammar.g:55:21: ^( '~' atom )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_38.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_atom.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // ScriptGrammar.g:56:9: atom
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_atom_in_unaryExp453);
                    atom42=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom42.getTree());

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
    // ScriptGrammar.g:59:1: atom : ( INT | ID | '(' ! expr ')' !| funcall );
    public final ScriptGrammarParser.atom_return atom() throws RecognitionException {
        ScriptGrammarParser.atom_return retval = new ScriptGrammarParser.atom_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token INT43=null;
        Token ID44=null;
        Token char_literal45=null;
        Token char_literal47=null;
        ScriptGrammarParser.expr_return expr46 =null;

        ScriptGrammarParser.funcall_return funcall48 =null;


        CommonTree INT43_tree=null;
        CommonTree ID44_tree=null;
        CommonTree char_literal45_tree=null;
        CommonTree char_literal47_tree=null;

        try {
            // ScriptGrammar.g:59:5: ( INT | ID | '(' ! expr ')' !| funcall )
            int alt10=4;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt10=1;
                }
                break;
            case ID:
                {
                int LA10_2 = input.LA(2);

                if ( (LA10_2==15) ) {
                    alt10=4;
                }
                else if ( (LA10_2==NEWLINE||(LA10_2 >= 13 && LA10_2 <= 14)||(LA10_2 >= 16 && LA10_2 <= 21)||(LA10_2 >= 23 && LA10_2 <= 24)||LA10_2==30||LA10_2==36) ) {
                    alt10=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 2, input);

                    throw nvae;

                }
                }
                break;
            case 15:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }

            switch (alt10) {
                case 1 :
                    // ScriptGrammar.g:59:9: INT
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    INT43=(Token)match(input,INT,FOLLOW_INT_in_atom471); 
                    INT43_tree = 
                    (CommonTree)adaptor.create(INT43)
                    ;
                    adaptor.addChild(root_0, INT43_tree);


                    }
                    break;
                case 2 :
                    // ScriptGrammar.g:60:9: ID
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    ID44=(Token)match(input,ID,FOLLOW_ID_in_atom482); 
                    ID44_tree = 
                    (CommonTree)adaptor.create(ID44)
                    ;
                    adaptor.addChild(root_0, ID44_tree);


                    }
                    break;
                case 3 :
                    // ScriptGrammar.g:61:9: '(' ! expr ')' !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal45=(Token)match(input,15,FOLLOW_15_in_atom492); 

                    pushFollow(FOLLOW_expr_in_atom495);
                    expr46=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr46.getTree());

                    char_literal47=(Token)match(input,16,FOLLOW_16_in_atom497); 

                    }
                    break;
                case 4 :
                    // ScriptGrammar.g:62:9: funcall
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_atom508);
                    funcall48=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall48.getTree());

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
    // ScriptGrammar.g:65:1: funcall : ID '(' expr ( ',' expr )* ')' -> ^( CALL ID ( expr )* ) ;
    public final ScriptGrammarParser.funcall_return funcall() throws RecognitionException {
        ScriptGrammarParser.funcall_return retval = new ScriptGrammarParser.funcall_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID49=null;
        Token char_literal50=null;
        Token char_literal52=null;
        Token char_literal54=null;
        ScriptGrammarParser.expr_return expr51 =null;

        ScriptGrammarParser.expr_return expr53 =null;


        CommonTree ID49_tree=null;
        CommonTree char_literal50_tree=null;
        CommonTree char_literal52_tree=null;
        CommonTree char_literal54_tree=null;
        RewriteRuleTokenStream stream_19=new RewriteRuleTokenStream(adaptor,"token 19");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_15=new RewriteRuleTokenStream(adaptor,"token 15");
        RewriteRuleTokenStream stream_16=new RewriteRuleTokenStream(adaptor,"token 16");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // ScriptGrammar.g:65:8: ( ID '(' expr ( ',' expr )* ')' -> ^( CALL ID ( expr )* ) )
            // ScriptGrammar.g:65:10: ID '(' expr ( ',' expr )* ')'
            {
            ID49=(Token)match(input,ID,FOLLOW_ID_in_funcall520);  
            stream_ID.add(ID49);


            char_literal50=(Token)match(input,15,FOLLOW_15_in_funcall522);  
            stream_15.add(char_literal50);


            pushFollow(FOLLOW_expr_in_funcall524);
            expr51=expr();

            state._fsp--;

            stream_expr.add(expr51.getTree());

            // ScriptGrammar.g:65:22: ( ',' expr )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==19) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ScriptGrammar.g:65:23: ',' expr
            	    {
            	    char_literal52=(Token)match(input,19,FOLLOW_19_in_funcall527);  
            	    stream_19.add(char_literal52);


            	    pushFollow(FOLLOW_expr_in_funcall529);
            	    expr53=expr();

            	    state._fsp--;

            	    stream_expr.add(expr53.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            char_literal54=(Token)match(input,16,FOLLOW_16_in_funcall533);  
            stream_16.add(char_literal54);


            // AST REWRITE
            // elements: ID, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 65:38: -> ^( CALL ID ( expr )* )
            {
                // ScriptGrammar.g:65:41: ^( CALL ID ( expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(CALL, "CALL")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // ScriptGrammar.g:65:51: ( expr )*
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


    public static class ifexp_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ifexp"
    // ScriptGrammar.g:68:1: ifexp : 'if' ( '(' )? boolexp ( ')' )? block -> ^( 'if' boolexp block ) ;
    public final ScriptGrammarParser.ifexp_return ifexp() throws RecognitionException {
        ScriptGrammarParser.ifexp_return retval = new ScriptGrammarParser.ifexp_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal55=null;
        Token char_literal56=null;
        Token char_literal58=null;
        ScriptGrammarParser.boolexp_return boolexp57 =null;

        ScriptGrammarParser.block_return block59 =null;


        CommonTree string_literal55_tree=null;
        CommonTree char_literal56_tree=null;
        CommonTree char_literal58_tree=null;
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleTokenStream stream_15=new RewriteRuleTokenStream(adaptor,"token 15");
        RewriteRuleTokenStream stream_16=new RewriteRuleTokenStream(adaptor,"token 16");
        RewriteRuleSubtreeStream stream_boolexp=new RewriteRuleSubtreeStream(adaptor,"rule boolexp");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // ScriptGrammar.g:68:6: ( 'if' ( '(' )? boolexp ( ')' )? block -> ^( 'if' boolexp block ) )
            // ScriptGrammar.g:68:9: 'if' ( '(' )? boolexp ( ')' )? block
            {
            string_literal55=(Token)match(input,32,FOLLOW_32_in_ifexp557);  
            stream_32.add(string_literal55);


            // ScriptGrammar.g:68:14: ( '(' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==15) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ScriptGrammar.g:68:14: '('
                    {
                    char_literal56=(Token)match(input,15,FOLLOW_15_in_ifexp559);  
                    stream_15.add(char_literal56);


                    }
                    break;

            }


            pushFollow(FOLLOW_boolexp_in_ifexp562);
            boolexp57=boolexp();

            state._fsp--;

            stream_boolexp.add(boolexp57.getTree());

            // ScriptGrammar.g:68:27: ( ')' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==16) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ScriptGrammar.g:68:27: ')'
                    {
                    char_literal58=(Token)match(input,16,FOLLOW_16_in_ifexp564);  
                    stream_16.add(char_literal58);


                    }
                    break;

            }


            pushFollow(FOLLOW_block_in_ifexp567);
            block59=block();

            state._fsp--;

            stream_block.add(block59.getTree());

            // AST REWRITE
            // elements: 32, block, boolexp
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 68:38: -> ^( 'if' boolexp block )
            {
                // ScriptGrammar.g:68:41: ^( 'if' boolexp block )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_32.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_boolexp.nextTree());

                adaptor.addChild(root_1, stream_block.nextTree());

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
    // $ANTLR end "ifexp"


    public static class whileexp_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "whileexp"
    // ScriptGrammar.g:71:1: whileexp : 'while' ( '(' )? boolexp ( ')' )? block -> ^( 'while' boolexp block ) ;
    public final ScriptGrammarParser.whileexp_return whileexp() throws RecognitionException {
        ScriptGrammarParser.whileexp_return retval = new ScriptGrammarParser.whileexp_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal60=null;
        Token char_literal61=null;
        Token char_literal63=null;
        ScriptGrammarParser.boolexp_return boolexp62 =null;

        ScriptGrammarParser.block_return block64 =null;


        CommonTree string_literal60_tree=null;
        CommonTree char_literal61_tree=null;
        CommonTree char_literal63_tree=null;
        RewriteRuleTokenStream stream_15=new RewriteRuleTokenStream(adaptor,"token 15");
        RewriteRuleTokenStream stream_16=new RewriteRuleTokenStream(adaptor,"token 16");
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleSubtreeStream stream_boolexp=new RewriteRuleSubtreeStream(adaptor,"rule boolexp");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // ScriptGrammar.g:71:9: ( 'while' ( '(' )? boolexp ( ')' )? block -> ^( 'while' boolexp block ) )
            // ScriptGrammar.g:71:12: 'while' ( '(' )? boolexp ( ')' )? block
            {
            string_literal60=(Token)match(input,34,FOLLOW_34_in_whileexp594);  
            stream_34.add(string_literal60);


            // ScriptGrammar.g:71:20: ( '(' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==15) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ScriptGrammar.g:71:20: '('
                    {
                    char_literal61=(Token)match(input,15,FOLLOW_15_in_whileexp596);  
                    stream_15.add(char_literal61);


                    }
                    break;

            }


            pushFollow(FOLLOW_boolexp_in_whileexp599);
            boolexp62=boolexp();

            state._fsp--;

            stream_boolexp.add(boolexp62.getTree());

            // ScriptGrammar.g:71:33: ( ')' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==16) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ScriptGrammar.g:71:33: ')'
                    {
                    char_literal63=(Token)match(input,16,FOLLOW_16_in_whileexp601);  
                    stream_16.add(char_literal63);


                    }
                    break;

            }


            pushFollow(FOLLOW_block_in_whileexp604);
            block64=block();

            state._fsp--;

            stream_block.add(block64.getTree());

            // AST REWRITE
            // elements: 34, block, boolexp
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 71:44: -> ^( 'while' boolexp block )
            {
                // ScriptGrammar.g:71:47: ^( 'while' boolexp block )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_34.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_boolexp.nextTree());

                adaptor.addChild(root_1, stream_block.nextTree());

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
    // $ANTLR end "whileexp"


    public static class boolexp_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolexp"
    // ScriptGrammar.g:74:1: boolexp : boolterm ( '==' ^| '!=' ^| '>' ^| '>=' ^| '<' ^| '<=' ^) boolterm ;
    public final ScriptGrammarParser.boolexp_return boolexp() throws RecognitionException {
        ScriptGrammarParser.boolexp_return retval = new ScriptGrammarParser.boolexp_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal66=null;
        Token string_literal67=null;
        Token char_literal68=null;
        Token string_literal69=null;
        Token char_literal70=null;
        Token string_literal71=null;
        ScriptGrammarParser.boolterm_return boolterm65 =null;

        ScriptGrammarParser.boolterm_return boolterm72 =null;


        CommonTree string_literal66_tree=null;
        CommonTree string_literal67_tree=null;
        CommonTree char_literal68_tree=null;
        CommonTree string_literal69_tree=null;
        CommonTree char_literal70_tree=null;
        CommonTree string_literal71_tree=null;

        try {
            // ScriptGrammar.g:74:8: ( boolterm ( '==' ^| '!=' ^| '>' ^| '>=' ^| '<' ^| '<=' ^) boolterm )
            // ScriptGrammar.g:74:11: boolterm ( '==' ^| '!=' ^| '>' ^| '>=' ^| '<' ^| '<=' ^) boolterm
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_boolexp631);
            boolterm65=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm65.getTree());

            // ScriptGrammar.g:74:20: ( '==' ^| '!=' ^| '>' ^| '>=' ^| '<' ^| '<=' ^)
            int alt16=6;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt16=1;
                }
                break;
            case 12:
                {
                alt16=2;
                }
                break;
            case 28:
                {
                alt16=3;
                }
                break;
            case 29:
                {
                alt16=4;
                }
                break;
            case 22:
                {
                alt16=5;
                }
                break;
            case 25:
                {
                alt16=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }

            switch (alt16) {
                case 1 :
                    // ScriptGrammar.g:74:21: '==' ^
                    {
                    string_literal66=(Token)match(input,27,FOLLOW_27_in_boolexp634); 
                    string_literal66_tree = 
                    (CommonTree)adaptor.create(string_literal66)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(string_literal66_tree, root_0);


                    }
                    break;
                case 2 :
                    // ScriptGrammar.g:74:27: '!=' ^
                    {
                    string_literal67=(Token)match(input,12,FOLLOW_12_in_boolexp637); 
                    string_literal67_tree = 
                    (CommonTree)adaptor.create(string_literal67)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(string_literal67_tree, root_0);


                    }
                    break;
                case 3 :
                    // ScriptGrammar.g:74:33: '>' ^
                    {
                    char_literal68=(Token)match(input,28,FOLLOW_28_in_boolexp640); 
                    char_literal68_tree = 
                    (CommonTree)adaptor.create(char_literal68)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(char_literal68_tree, root_0);


                    }
                    break;
                case 4 :
                    // ScriptGrammar.g:74:38: '>=' ^
                    {
                    string_literal69=(Token)match(input,29,FOLLOW_29_in_boolexp643); 
                    string_literal69_tree = 
                    (CommonTree)adaptor.create(string_literal69)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(string_literal69_tree, root_0);


                    }
                    break;
                case 5 :
                    // ScriptGrammar.g:74:44: '<' ^
                    {
                    char_literal70=(Token)match(input,22,FOLLOW_22_in_boolexp646); 
                    char_literal70_tree = 
                    (CommonTree)adaptor.create(char_literal70)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(char_literal70_tree, root_0);


                    }
                    break;
                case 6 :
                    // ScriptGrammar.g:74:49: '<=' ^
                    {
                    string_literal71=(Token)match(input,25,FOLLOW_25_in_boolexp649); 
                    string_literal71_tree = 
                    (CommonTree)adaptor.create(string_literal71)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(string_literal71_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_boolterm_in_boolexp653);
            boolterm72=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm72.getTree());

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
    // $ANTLR end "boolexp"


    public static class boolterm_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolterm"
    // ScriptGrammar.g:77:1: boolterm : ( ID | INT ) ;
    public final ScriptGrammarParser.boolterm_return boolterm() throws RecognitionException {
        ScriptGrammarParser.boolterm_return retval = new ScriptGrammarParser.boolterm_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set73=null;

        CommonTree set73_tree=null;

        try {
            // ScriptGrammar.g:77:9: ( ( ID | INT ) )
            // ScriptGrammar.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set73=(Token)input.LT(1);

            if ( (input.LA(1) >= ID && input.LA(1) <= INT) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set73)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


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
    // $ANTLR end "boolterm"


    public static class forexp_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "forexp"
    // ScriptGrammar.g:80:1: forexp : 'for' ( '(' )? ID ',' forterm ( ')' )? block -> ^( 'for' ID forterm block ) ;
    public final ScriptGrammarParser.forexp_return forexp() throws RecognitionException {
        ScriptGrammarParser.forexp_return retval = new ScriptGrammarParser.forexp_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal74=null;
        Token char_literal75=null;
        Token ID76=null;
        Token char_literal77=null;
        Token char_literal79=null;
        ScriptGrammarParser.forterm_return forterm78 =null;

        ScriptGrammarParser.block_return block80 =null;


        CommonTree string_literal74_tree=null;
        CommonTree char_literal75_tree=null;
        CommonTree ID76_tree=null;
        CommonTree char_literal77_tree=null;
        CommonTree char_literal79_tree=null;
        RewriteRuleTokenStream stream_19=new RewriteRuleTokenStream(adaptor,"token 19");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_15=new RewriteRuleTokenStream(adaptor,"token 15");
        RewriteRuleTokenStream stream_16=new RewriteRuleTokenStream(adaptor,"token 16");
        RewriteRuleSubtreeStream stream_forterm=new RewriteRuleSubtreeStream(adaptor,"rule forterm");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // ScriptGrammar.g:80:7: ( 'for' ( '(' )? ID ',' forterm ( ')' )? block -> ^( 'for' ID forterm block ) )
            // ScriptGrammar.g:80:9: 'for' ( '(' )? ID ',' forterm ( ')' )? block
            {
            string_literal74=(Token)match(input,31,FOLLOW_31_in_forexp685);  
            stream_31.add(string_literal74);


            // ScriptGrammar.g:80:15: ( '(' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==15) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ScriptGrammar.g:80:15: '('
                    {
                    char_literal75=(Token)match(input,15,FOLLOW_15_in_forexp687);  
                    stream_15.add(char_literal75);


                    }
                    break;

            }


            ID76=(Token)match(input,ID,FOLLOW_ID_in_forexp690);  
            stream_ID.add(ID76);


            char_literal77=(Token)match(input,19,FOLLOW_19_in_forexp692);  
            stream_19.add(char_literal77);


            pushFollow(FOLLOW_forterm_in_forexp694);
            forterm78=forterm();

            state._fsp--;

            stream_forterm.add(forterm78.getTree());

            // ScriptGrammar.g:80:35: ( ')' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==16) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ScriptGrammar.g:80:35: ')'
                    {
                    char_literal79=(Token)match(input,16,FOLLOW_16_in_forexp696);  
                    stream_16.add(char_literal79);


                    }
                    break;

            }


            pushFollow(FOLLOW_block_in_forexp699);
            block80=block();

            state._fsp--;

            stream_block.add(block80.getTree());

            // AST REWRITE
            // elements: block, ID, 31, forterm
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 80:46: -> ^( 'for' ID forterm block )
            {
                // ScriptGrammar.g:80:49: ^( 'for' ID forterm block )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_31.nextNode()
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_1, stream_forterm.nextTree());

                adaptor.addChild(root_1, stream_block.nextTree());

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
    // $ANTLR end "forexp"


    public static class forterm_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "forterm"
    // ScriptGrammar.g:83:1: forterm : ( ID | INT ) ;
    public final ScriptGrammarParser.forterm_return forterm() throws RecognitionException {
        ScriptGrammarParser.forterm_return retval = new ScriptGrammarParser.forterm_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set81=null;

        CommonTree set81_tree=null;

        try {
            // ScriptGrammar.g:83:8: ( ( ID | INT ) )
            // ScriptGrammar.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set81=(Token)input.LT(1);

            if ( (input.LA(1) >= ID && input.LA(1) <= INT) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set81)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


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
    // $ANTLR end "forterm"

    // Delegated rules


 

    public static final BitSet FOLLOW_block_in_prog91 = new BitSet(new long[]{0x0000004F801086C2L});
    public static final BitSet FOLLOW_35_in_block101 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_NEWLINE_in_block103 = new BitSet(new long[]{0x0000006F801086C0L});
    public static final BitSet FOLLOW_block_in_block105 = new BitSet(new long[]{0x0000006F801086C0L});
    public static final BitSet FOLLOW_37_in_block108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stat_in_block126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_stat140 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_NEWLINE_in_stat142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_stat163 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_assign_in_stat165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_in_stat183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_retexp_in_stat193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifexp_in_stat203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileexp_in_stat213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forexp_in_stat223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_stat233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assign263 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_assign265 = new BitSet(new long[]{0x00000040001080C0L});
    public static final BitSet FOLLOW_expr_in_assign267 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_NEWLINE_in_assign269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_retexp295 = new BitSet(new long[]{0x00000040001080C0L});
    public static final BitSet FOLLOW_expr_in_retexp297 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_NEWLINE_in_retexp299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multExpr_in_expr325 = new BitSet(new long[]{0x0000001041944002L});
    public static final BitSet FOLLOW_18_in_expr329 = new BitSet(new long[]{0x00000040001080C0L});
    public static final BitSet FOLLOW_20_in_expr332 = new BitSet(new long[]{0x00000040001080C0L});
    public static final BitSet FOLLOW_14_in_expr335 = new BitSet(new long[]{0x00000040001080C0L});
    public static final BitSet FOLLOW_36_in_expr338 = new BitSet(new long[]{0x00000040001080C0L});
    public static final BitSet FOLLOW_30_in_expr341 = new BitSet(new long[]{0x00000040001080C0L});
    public static final BitSet FOLLOW_23_in_expr344 = new BitSet(new long[]{0x00000040001080C0L});
    public static final BitSet FOLLOW_24_in_expr347 = new BitSet(new long[]{0x00000040001080C0L});
    public static final BitSet FOLLOW_multExpr_in_expr351 = new BitSet(new long[]{0x0000001041944002L});
    public static final BitSet FOLLOW_unaryExp_in_multExpr373 = new BitSet(new long[]{0x0000000000222002L});
    public static final BitSet FOLLOW_17_in_multExpr377 = new BitSet(new long[]{0x00000040001080C0L});
    public static final BitSet FOLLOW_21_in_multExpr380 = new BitSet(new long[]{0x00000040001080C0L});
    public static final BitSet FOLLOW_13_in_multExpr383 = new BitSet(new long[]{0x00000040001080C0L});
    public static final BitSet FOLLOW_unaryExp_in_multExpr387 = new BitSet(new long[]{0x0000000000222002L});
    public static final BitSet FOLLOW_20_in_unaryExp413 = new BitSet(new long[]{0x00000000000080C0L});
    public static final BitSet FOLLOW_atom_in_unaryExp415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_unaryExp433 = new BitSet(new long[]{0x00000000000080C0L});
    public static final BitSet FOLLOW_atom_in_unaryExp435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_unaryExp453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_atom492 = new BitSet(new long[]{0x00000040001080C0L});
    public static final BitSet FOLLOW_expr_in_atom495 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_atom497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_atom508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funcall520 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_funcall522 = new BitSet(new long[]{0x00000040001080C0L});
    public static final BitSet FOLLOW_expr_in_funcall524 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_19_in_funcall527 = new BitSet(new long[]{0x00000040001080C0L});
    public static final BitSet FOLLOW_expr_in_funcall529 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_16_in_funcall533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ifexp557 = new BitSet(new long[]{0x00000000000080C0L});
    public static final BitSet FOLLOW_15_in_ifexp559 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_boolexp_in_ifexp562 = new BitSet(new long[]{0x0000004F801186C0L});
    public static final BitSet FOLLOW_16_in_ifexp564 = new BitSet(new long[]{0x0000004F801086C0L});
    public static final BitSet FOLLOW_block_in_ifexp567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_whileexp594 = new BitSet(new long[]{0x00000000000080C0L});
    public static final BitSet FOLLOW_15_in_whileexp596 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_boolexp_in_whileexp599 = new BitSet(new long[]{0x0000004F801186C0L});
    public static final BitSet FOLLOW_16_in_whileexp601 = new BitSet(new long[]{0x0000004F801086C0L});
    public static final BitSet FOLLOW_block_in_whileexp604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_boolexp631 = new BitSet(new long[]{0x000000003A401000L});
    public static final BitSet FOLLOW_27_in_boolexp634 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_12_in_boolexp637 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_28_in_boolexp640 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_29_in_boolexp643 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_22_in_boolexp646 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_25_in_boolexp649 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_boolterm_in_boolexp653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_forexp685 = new BitSet(new long[]{0x0000000000008040L});
    public static final BitSet FOLLOW_15_in_forexp687 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_forexp690 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_forexp692 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_forterm_in_forexp694 = new BitSet(new long[]{0x0000004F801186C0L});
    public static final BitSet FOLLOW_16_in_forexp696 = new BitSet(new long[]{0x0000004F801086C0L});
    public static final BitSet FOLLOW_block_in_forexp699 = new BitSet(new long[]{0x0000000000000002L});

}