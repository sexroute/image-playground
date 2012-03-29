// $ANTLR 3.4 ScriptGrammar.g 2012-03-29 01:56:09

package com.google.imageplayground.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class ScriptGrammarParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "BLOCK", "CALL", "ID", "INT", "NEG", "NEWLINE", "TYPE", "WS", "'!='", "'%'", "'&'", "'('", "')'", "'*'", "'+'", "','", "'-'", "'/'", "'<'", "'<<'", "'<<<'", "'<='", "'='", "'=='", "'>'", "'>='", "'>>'", "'if'", "'return'", "'{'", "'|'", "'}'", "'~'"
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

                if ( ((LA1_0 >= ID && LA1_0 <= INT)||(LA1_0 >= NEWLINE && LA1_0 <= TYPE)||LA1_0==15||LA1_0==20||(LA1_0 >= 31 && LA1_0 <= 33)||LA1_0==36) ) {
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
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // ScriptGrammar.g:26:6: ( '{' NEWLINE ( block )* '}' -> ^( BLOCK ( block )* ) | stat )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==33) ) {
                alt3=1;
            }
            else if ( ((LA3_0 >= ID && LA3_0 <= INT)||(LA3_0 >= NEWLINE && LA3_0 <= TYPE)||LA3_0==15||LA3_0==20||(LA3_0 >= 31 && LA3_0 <= 32)||LA3_0==36) ) {
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
                    char_literal2=(Token)match(input,33,FOLLOW_33_in_block101);  
                    stream_33.add(char_literal2);


                    NEWLINE3=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_block103);  
                    stream_NEWLINE.add(NEWLINE3);


                    // ScriptGrammar.g:26:20: ( block )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0 >= ID && LA2_0 <= INT)||(LA2_0 >= NEWLINE && LA2_0 <= TYPE)||LA2_0==15||LA2_0==20||(LA2_0 >= 31 && LA2_0 <= 33)||LA2_0==36) ) {
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


                    char_literal5=(Token)match(input,35,FOLLOW_35_in_block108);  
                    stream_35.add(char_literal5);


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
    // ScriptGrammar.g:30:1: stat : ( expr NEWLINE -> expr | TYPE assign -> ^( TYPE assign ) | assign | retexp | ifexp | NEWLINE ->);
    public final ScriptGrammarParser.stat_return stat() throws RecognitionException {
        ScriptGrammarParser.stat_return retval = new ScriptGrammarParser.stat_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token NEWLINE8=null;
        Token TYPE9=null;
        Token NEWLINE14=null;
        ScriptGrammarParser.expr_return expr7 =null;

        ScriptGrammarParser.assign_return assign10 =null;

        ScriptGrammarParser.assign_return assign11 =null;

        ScriptGrammarParser.retexp_return retexp12 =null;

        ScriptGrammarParser.ifexp_return ifexp13 =null;


        CommonTree NEWLINE8_tree=null;
        CommonTree TYPE9_tree=null;
        CommonTree NEWLINE14_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_TYPE=new RewriteRuleTokenStream(adaptor,"token TYPE");
        RewriteRuleSubtreeStream stream_assign=new RewriteRuleSubtreeStream(adaptor,"rule assign");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // ScriptGrammar.g:30:5: ( expr NEWLINE -> expr | TYPE assign -> ^( TYPE assign ) | assign | retexp | ifexp | NEWLINE ->)
            int alt4=6;
            switch ( input.LA(1) ) {
            case INT:
            case 15:
            case 20:
            case 36:
                {
                alt4=1;
                }
                break;
            case ID:
                {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==NEWLINE||(LA4_2 >= 13 && LA4_2 <= 15)||(LA4_2 >= 17 && LA4_2 <= 18)||(LA4_2 >= 20 && LA4_2 <= 21)||(LA4_2 >= 23 && LA4_2 <= 24)||LA4_2==30||LA4_2==34) ) {
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
            case 32:
                {
                alt4=4;
                }
                break;
            case 31:
                {
                alt4=5;
                }
                break;
            case NEWLINE:
                {
                alt4=6;
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
                    // elements: TYPE, assign
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
                    // ScriptGrammar.g:35:9: NEWLINE
                    {
                    NEWLINE14=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_stat213);  
                    stream_NEWLINE.add(NEWLINE14);


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
                    // 35:29: ->
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
    // ScriptGrammar.g:38:1: assign : ID '=' expr NEWLINE -> ^( '=' ID expr ) ;
    public final ScriptGrammarParser.assign_return assign() throws RecognitionException {
        ScriptGrammarParser.assign_return retval = new ScriptGrammarParser.assign_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID15=null;
        Token char_literal16=null;
        Token NEWLINE18=null;
        ScriptGrammarParser.expr_return expr17 =null;


        CommonTree ID15_tree=null;
        CommonTree char_literal16_tree=null;
        CommonTree NEWLINE18_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // ScriptGrammar.g:38:7: ( ID '=' expr NEWLINE -> ^( '=' ID expr ) )
            // ScriptGrammar.g:38:9: ID '=' expr NEWLINE
            {
            ID15=(Token)match(input,ID,FOLLOW_ID_in_assign243);  
            stream_ID.add(ID15);


            char_literal16=(Token)match(input,26,FOLLOW_26_in_assign245);  
            stream_26.add(char_literal16);


            pushFollow(FOLLOW_expr_in_assign247);
            expr17=expr();

            state._fsp--;

            stream_expr.add(expr17.getTree());

            NEWLINE18=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_assign249);  
            stream_NEWLINE.add(NEWLINE18);


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
            // 38:29: -> ^( '=' ID expr )
            {
                // ScriptGrammar.g:38:32: ^( '=' ID expr )
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
    // ScriptGrammar.g:41:1: retexp : 'return' expr NEWLINE -> ^( 'return' expr ) ;
    public final ScriptGrammarParser.retexp_return retexp() throws RecognitionException {
        ScriptGrammarParser.retexp_return retval = new ScriptGrammarParser.retexp_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal19=null;
        Token NEWLINE21=null;
        ScriptGrammarParser.expr_return expr20 =null;


        CommonTree string_literal19_tree=null;
        CommonTree NEWLINE21_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // ScriptGrammar.g:41:7: ( 'return' expr NEWLINE -> ^( 'return' expr ) )
            // ScriptGrammar.g:41:9: 'return' expr NEWLINE
            {
            string_literal19=(Token)match(input,32,FOLLOW_32_in_retexp275);  
            stream_32.add(string_literal19);


            pushFollow(FOLLOW_expr_in_retexp277);
            expr20=expr();

            state._fsp--;

            stream_expr.add(expr20.getTree());

            NEWLINE21=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_retexp279);  
            stream_NEWLINE.add(NEWLINE21);


            // AST REWRITE
            // elements: expr, 32
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 41:31: -> ^( 'return' expr )
            {
                // ScriptGrammar.g:41:34: ^( 'return' expr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_32.nextNode()
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
    // ScriptGrammar.g:44:1: expr : multExpr ( ( '+' ^| '-' ^| '&' ^| '|' ^| '>>' ^| '<<' ^| '<<<' ^) multExpr )* ;
    public final ScriptGrammarParser.expr_return expr() throws RecognitionException {
        ScriptGrammarParser.expr_return retval = new ScriptGrammarParser.expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal23=null;
        Token char_literal24=null;
        Token char_literal25=null;
        Token char_literal26=null;
        Token string_literal27=null;
        Token string_literal28=null;
        Token string_literal29=null;
        ScriptGrammarParser.multExpr_return multExpr22 =null;

        ScriptGrammarParser.multExpr_return multExpr30 =null;


        CommonTree char_literal23_tree=null;
        CommonTree char_literal24_tree=null;
        CommonTree char_literal25_tree=null;
        CommonTree char_literal26_tree=null;
        CommonTree string_literal27_tree=null;
        CommonTree string_literal28_tree=null;
        CommonTree string_literal29_tree=null;

        try {
            // ScriptGrammar.g:44:5: ( multExpr ( ( '+' ^| '-' ^| '&' ^| '|' ^| '>>' ^| '<<' ^| '<<<' ^) multExpr )* )
            // ScriptGrammar.g:44:9: multExpr ( ( '+' ^| '-' ^| '&' ^| '|' ^| '>>' ^| '<<' ^| '<<<' ^) multExpr )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_multExpr_in_expr305);
            multExpr22=multExpr();

            state._fsp--;

            adaptor.addChild(root_0, multExpr22.getTree());

            // ScriptGrammar.g:44:18: ( ( '+' ^| '-' ^| '&' ^| '|' ^| '>>' ^| '<<' ^| '<<<' ^) multExpr )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==14||LA6_0==18||LA6_0==20||(LA6_0 >= 23 && LA6_0 <= 24)||LA6_0==30||LA6_0==34) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ScriptGrammar.g:44:19: ( '+' ^| '-' ^| '&' ^| '|' ^| '>>' ^| '<<' ^| '<<<' ^) multExpr
            	    {
            	    // ScriptGrammar.g:44:19: ( '+' ^| '-' ^| '&' ^| '|' ^| '>>' ^| '<<' ^| '<<<' ^)
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
            	    case 34:
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
            	            // ScriptGrammar.g:44:20: '+' ^
            	            {
            	            char_literal23=(Token)match(input,18,FOLLOW_18_in_expr309); 
            	            char_literal23_tree = 
            	            (CommonTree)adaptor.create(char_literal23)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal23_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // ScriptGrammar.g:44:25: '-' ^
            	            {
            	            char_literal24=(Token)match(input,20,FOLLOW_20_in_expr312); 
            	            char_literal24_tree = 
            	            (CommonTree)adaptor.create(char_literal24)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal24_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // ScriptGrammar.g:44:30: '&' ^
            	            {
            	            char_literal25=(Token)match(input,14,FOLLOW_14_in_expr315); 
            	            char_literal25_tree = 
            	            (CommonTree)adaptor.create(char_literal25)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal25_tree, root_0);


            	            }
            	            break;
            	        case 4 :
            	            // ScriptGrammar.g:44:35: '|' ^
            	            {
            	            char_literal26=(Token)match(input,34,FOLLOW_34_in_expr318); 
            	            char_literal26_tree = 
            	            (CommonTree)adaptor.create(char_literal26)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal26_tree, root_0);


            	            }
            	            break;
            	        case 5 :
            	            // ScriptGrammar.g:44:40: '>>' ^
            	            {
            	            string_literal27=(Token)match(input,30,FOLLOW_30_in_expr321); 
            	            string_literal27_tree = 
            	            (CommonTree)adaptor.create(string_literal27)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(string_literal27_tree, root_0);


            	            }
            	            break;
            	        case 6 :
            	            // ScriptGrammar.g:44:46: '<<' ^
            	            {
            	            string_literal28=(Token)match(input,23,FOLLOW_23_in_expr324); 
            	            string_literal28_tree = 
            	            (CommonTree)adaptor.create(string_literal28)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(string_literal28_tree, root_0);


            	            }
            	            break;
            	        case 7 :
            	            // ScriptGrammar.g:44:52: '<<<' ^
            	            {
            	            string_literal29=(Token)match(input,24,FOLLOW_24_in_expr327); 
            	            string_literal29_tree = 
            	            (CommonTree)adaptor.create(string_literal29)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(string_literal29_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_multExpr_in_expr331);
            	    multExpr30=multExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, multExpr30.getTree());

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
    // ScriptGrammar.g:47:1: multExpr : unaryExp ( ( '*' ^| '/' ^| '%' ^) unaryExp )* ;
    public final ScriptGrammarParser.multExpr_return multExpr() throws RecognitionException {
        ScriptGrammarParser.multExpr_return retval = new ScriptGrammarParser.multExpr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal32=null;
        Token char_literal33=null;
        Token char_literal34=null;
        ScriptGrammarParser.unaryExp_return unaryExp31 =null;

        ScriptGrammarParser.unaryExp_return unaryExp35 =null;


        CommonTree char_literal32_tree=null;
        CommonTree char_literal33_tree=null;
        CommonTree char_literal34_tree=null;

        try {
            // ScriptGrammar.g:48:5: ( unaryExp ( ( '*' ^| '/' ^| '%' ^) unaryExp )* )
            // ScriptGrammar.g:48:9: unaryExp ( ( '*' ^| '/' ^| '%' ^) unaryExp )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_unaryExp_in_multExpr353);
            unaryExp31=unaryExp();

            state._fsp--;

            adaptor.addChild(root_0, unaryExp31.getTree());

            // ScriptGrammar.g:48:18: ( ( '*' ^| '/' ^| '%' ^) unaryExp )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==13||LA8_0==17||LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ScriptGrammar.g:48:19: ( '*' ^| '/' ^| '%' ^) unaryExp
            	    {
            	    // ScriptGrammar.g:48:19: ( '*' ^| '/' ^| '%' ^)
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
            	            // ScriptGrammar.g:48:20: '*' ^
            	            {
            	            char_literal32=(Token)match(input,17,FOLLOW_17_in_multExpr357); 
            	            char_literal32_tree = 
            	            (CommonTree)adaptor.create(char_literal32)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal32_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // ScriptGrammar.g:48:25: '/' ^
            	            {
            	            char_literal33=(Token)match(input,21,FOLLOW_21_in_multExpr360); 
            	            char_literal33_tree = 
            	            (CommonTree)adaptor.create(char_literal33)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal33_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // ScriptGrammar.g:48:30: '%' ^
            	            {
            	            char_literal34=(Token)match(input,13,FOLLOW_13_in_multExpr363); 
            	            char_literal34_tree = 
            	            (CommonTree)adaptor.create(char_literal34)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal34_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_unaryExp_in_multExpr367);
            	    unaryExp35=unaryExp();

            	    state._fsp--;

            	    adaptor.addChild(root_0, unaryExp35.getTree());

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
    // ScriptGrammar.g:51:1: unaryExp : ( '-' atom -> ^( NEG atom ) | '~' atom -> ^( '~' atom ) | atom );
    public final ScriptGrammarParser.unaryExp_return unaryExp() throws RecognitionException {
        ScriptGrammarParser.unaryExp_return retval = new ScriptGrammarParser.unaryExp_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal36=null;
        Token char_literal38=null;
        ScriptGrammarParser.atom_return atom37 =null;

        ScriptGrammarParser.atom_return atom39 =null;

        ScriptGrammarParser.atom_return atom40 =null;


        CommonTree char_literal36_tree=null;
        CommonTree char_literal38_tree=null;
        RewriteRuleTokenStream stream_20=new RewriteRuleTokenStream(adaptor,"token 20");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");
        try {
            // ScriptGrammar.g:52:5: ( '-' atom -> ^( NEG atom ) | '~' atom -> ^( '~' atom ) | atom )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt9=1;
                }
                break;
            case 36:
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
                    // ScriptGrammar.g:52:9: '-' atom
                    {
                    char_literal36=(Token)match(input,20,FOLLOW_20_in_unaryExp393);  
                    stream_20.add(char_literal36);


                    pushFollow(FOLLOW_atom_in_unaryExp395);
                    atom37=atom();

                    state._fsp--;

                    stream_atom.add(atom37.getTree());

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
                    // 52:18: -> ^( NEG atom )
                    {
                        // ScriptGrammar.g:52:21: ^( NEG atom )
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
                    // ScriptGrammar.g:53:9: '~' atom
                    {
                    char_literal38=(Token)match(input,36,FOLLOW_36_in_unaryExp413);  
                    stream_36.add(char_literal38);


                    pushFollow(FOLLOW_atom_in_unaryExp415);
                    atom39=atom();

                    state._fsp--;

                    stream_atom.add(atom39.getTree());

                    // AST REWRITE
                    // elements: atom, 36
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 53:18: -> ^( '~' atom )
                    {
                        // ScriptGrammar.g:53:21: ^( '~' atom )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_36.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_atom.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // ScriptGrammar.g:54:9: atom
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_atom_in_unaryExp433);
                    atom40=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom40.getTree());

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
    // ScriptGrammar.g:57:1: atom : ( INT | ID | '(' ! expr ')' !| funcall );
    public final ScriptGrammarParser.atom_return atom() throws RecognitionException {
        ScriptGrammarParser.atom_return retval = new ScriptGrammarParser.atom_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token INT41=null;
        Token ID42=null;
        Token char_literal43=null;
        Token char_literal45=null;
        ScriptGrammarParser.expr_return expr44 =null;

        ScriptGrammarParser.funcall_return funcall46 =null;


        CommonTree INT41_tree=null;
        CommonTree ID42_tree=null;
        CommonTree char_literal43_tree=null;
        CommonTree char_literal45_tree=null;

        try {
            // ScriptGrammar.g:57:5: ( INT | ID | '(' ! expr ')' !| funcall )
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
                else if ( (LA10_2==NEWLINE||(LA10_2 >= 13 && LA10_2 <= 14)||(LA10_2 >= 16 && LA10_2 <= 21)||(LA10_2 >= 23 && LA10_2 <= 24)||LA10_2==30||LA10_2==34) ) {
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
                    // ScriptGrammar.g:57:9: INT
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    INT41=(Token)match(input,INT,FOLLOW_INT_in_atom451); 
                    INT41_tree = 
                    (CommonTree)adaptor.create(INT41)
                    ;
                    adaptor.addChild(root_0, INT41_tree);


                    }
                    break;
                case 2 :
                    // ScriptGrammar.g:58:9: ID
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    ID42=(Token)match(input,ID,FOLLOW_ID_in_atom462); 
                    ID42_tree = 
                    (CommonTree)adaptor.create(ID42)
                    ;
                    adaptor.addChild(root_0, ID42_tree);


                    }
                    break;
                case 3 :
                    // ScriptGrammar.g:59:9: '(' ! expr ')' !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal43=(Token)match(input,15,FOLLOW_15_in_atom472); 

                    pushFollow(FOLLOW_expr_in_atom475);
                    expr44=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr44.getTree());

                    char_literal45=(Token)match(input,16,FOLLOW_16_in_atom477); 

                    }
                    break;
                case 4 :
                    // ScriptGrammar.g:60:9: funcall
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_atom488);
                    funcall46=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall46.getTree());

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
    // ScriptGrammar.g:63:1: funcall : ID '(' expr ( ',' expr )* ')' -> ^( CALL ID ( expr )* ) ;
    public final ScriptGrammarParser.funcall_return funcall() throws RecognitionException {
        ScriptGrammarParser.funcall_return retval = new ScriptGrammarParser.funcall_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID47=null;
        Token char_literal48=null;
        Token char_literal50=null;
        Token char_literal52=null;
        ScriptGrammarParser.expr_return expr49 =null;

        ScriptGrammarParser.expr_return expr51 =null;


        CommonTree ID47_tree=null;
        CommonTree char_literal48_tree=null;
        CommonTree char_literal50_tree=null;
        CommonTree char_literal52_tree=null;
        RewriteRuleTokenStream stream_19=new RewriteRuleTokenStream(adaptor,"token 19");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_15=new RewriteRuleTokenStream(adaptor,"token 15");
        RewriteRuleTokenStream stream_16=new RewriteRuleTokenStream(adaptor,"token 16");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // ScriptGrammar.g:63:8: ( ID '(' expr ( ',' expr )* ')' -> ^( CALL ID ( expr )* ) )
            // ScriptGrammar.g:63:10: ID '(' expr ( ',' expr )* ')'
            {
            ID47=(Token)match(input,ID,FOLLOW_ID_in_funcall500);  
            stream_ID.add(ID47);


            char_literal48=(Token)match(input,15,FOLLOW_15_in_funcall502);  
            stream_15.add(char_literal48);


            pushFollow(FOLLOW_expr_in_funcall504);
            expr49=expr();

            state._fsp--;

            stream_expr.add(expr49.getTree());

            // ScriptGrammar.g:63:22: ( ',' expr )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==19) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ScriptGrammar.g:63:23: ',' expr
            	    {
            	    char_literal50=(Token)match(input,19,FOLLOW_19_in_funcall507);  
            	    stream_19.add(char_literal50);


            	    pushFollow(FOLLOW_expr_in_funcall509);
            	    expr51=expr();

            	    state._fsp--;

            	    stream_expr.add(expr51.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            char_literal52=(Token)match(input,16,FOLLOW_16_in_funcall513);  
            stream_16.add(char_literal52);


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
            // 63:37: -> ^( CALL ID ( expr )* )
            {
                // ScriptGrammar.g:63:40: ^( CALL ID ( expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(CALL, "CALL")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // ScriptGrammar.g:63:50: ( expr )*
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
    // ScriptGrammar.g:66:1: ifexp : 'if' boolexp block -> ^( 'if' boolexp block ) ;
    public final ScriptGrammarParser.ifexp_return ifexp() throws RecognitionException {
        ScriptGrammarParser.ifexp_return retval = new ScriptGrammarParser.ifexp_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal53=null;
        ScriptGrammarParser.boolexp_return boolexp54 =null;

        ScriptGrammarParser.block_return block55 =null;


        CommonTree string_literal53_tree=null;
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleSubtreeStream stream_boolexp=new RewriteRuleSubtreeStream(adaptor,"rule boolexp");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // ScriptGrammar.g:66:6: ( 'if' boolexp block -> ^( 'if' boolexp block ) )
            // ScriptGrammar.g:66:9: 'if' boolexp block
            {
            string_literal53=(Token)match(input,31,FOLLOW_31_in_ifexp536);  
            stream_31.add(string_literal53);


            pushFollow(FOLLOW_boolexp_in_ifexp538);
            boolexp54=boolexp();

            state._fsp--;

            stream_boolexp.add(boolexp54.getTree());

            pushFollow(FOLLOW_block_in_ifexp540);
            block55=block();

            state._fsp--;

            stream_block.add(block55.getTree());

            // AST REWRITE
            // elements: 31, block, boolexp
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 66:28: -> ^( 'if' boolexp block )
            {
                // ScriptGrammar.g:66:31: ^( 'if' boolexp block )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_31.nextNode()
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


    public static class boolexp_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolexp"
    // ScriptGrammar.g:69:1: boolexp : boolterm ( '==' ^| '!=' ^| '>' ^| '>=' ^| '<' ^| '<=' ) boolterm ;
    public final ScriptGrammarParser.boolexp_return boolexp() throws RecognitionException {
        ScriptGrammarParser.boolexp_return retval = new ScriptGrammarParser.boolexp_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal57=null;
        Token string_literal58=null;
        Token char_literal59=null;
        Token string_literal60=null;
        Token char_literal61=null;
        Token string_literal62=null;
        ScriptGrammarParser.boolterm_return boolterm56 =null;

        ScriptGrammarParser.boolterm_return boolterm63 =null;


        CommonTree string_literal57_tree=null;
        CommonTree string_literal58_tree=null;
        CommonTree char_literal59_tree=null;
        CommonTree string_literal60_tree=null;
        CommonTree char_literal61_tree=null;
        CommonTree string_literal62_tree=null;

        try {
            // ScriptGrammar.g:69:8: ( boolterm ( '==' ^| '!=' ^| '>' ^| '>=' ^| '<' ^| '<=' ) boolterm )
            // ScriptGrammar.g:69:11: boolterm ( '==' ^| '!=' ^| '>' ^| '>=' ^| '<' ^| '<=' ) boolterm
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_boolexp567);
            boolterm56=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm56.getTree());

            // ScriptGrammar.g:69:20: ( '==' ^| '!=' ^| '>' ^| '>=' ^| '<' ^| '<=' )
            int alt12=6;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt12=1;
                }
                break;
            case 12:
                {
                alt12=2;
                }
                break;
            case 28:
                {
                alt12=3;
                }
                break;
            case 29:
                {
                alt12=4;
                }
                break;
            case 22:
                {
                alt12=5;
                }
                break;
            case 25:
                {
                alt12=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }

            switch (alt12) {
                case 1 :
                    // ScriptGrammar.g:69:21: '==' ^
                    {
                    string_literal57=(Token)match(input,27,FOLLOW_27_in_boolexp570); 
                    string_literal57_tree = 
                    (CommonTree)adaptor.create(string_literal57)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(string_literal57_tree, root_0);


                    }
                    break;
                case 2 :
                    // ScriptGrammar.g:69:27: '!=' ^
                    {
                    string_literal58=(Token)match(input,12,FOLLOW_12_in_boolexp573); 
                    string_literal58_tree = 
                    (CommonTree)adaptor.create(string_literal58)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(string_literal58_tree, root_0);


                    }
                    break;
                case 3 :
                    // ScriptGrammar.g:69:33: '>' ^
                    {
                    char_literal59=(Token)match(input,28,FOLLOW_28_in_boolexp576); 
                    char_literal59_tree = 
                    (CommonTree)adaptor.create(char_literal59)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(char_literal59_tree, root_0);


                    }
                    break;
                case 4 :
                    // ScriptGrammar.g:69:38: '>=' ^
                    {
                    string_literal60=(Token)match(input,29,FOLLOW_29_in_boolexp579); 
                    string_literal60_tree = 
                    (CommonTree)adaptor.create(string_literal60)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(string_literal60_tree, root_0);


                    }
                    break;
                case 5 :
                    // ScriptGrammar.g:69:44: '<' ^
                    {
                    char_literal61=(Token)match(input,22,FOLLOW_22_in_boolexp582); 
                    char_literal61_tree = 
                    (CommonTree)adaptor.create(char_literal61)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(char_literal61_tree, root_0);


                    }
                    break;
                case 6 :
                    // ScriptGrammar.g:69:49: '<='
                    {
                    string_literal62=(Token)match(input,25,FOLLOW_25_in_boolexp585); 
                    string_literal62_tree = 
                    (CommonTree)adaptor.create(string_literal62)
                    ;
                    adaptor.addChild(root_0, string_literal62_tree);


                    }
                    break;

            }


            pushFollow(FOLLOW_boolterm_in_boolexp588);
            boolterm63=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm63.getTree());

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
    // ScriptGrammar.g:72:1: boolterm : ( ID | INT ) ;
    public final ScriptGrammarParser.boolterm_return boolterm() throws RecognitionException {
        ScriptGrammarParser.boolterm_return retval = new ScriptGrammarParser.boolterm_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set64=null;

        CommonTree set64_tree=null;

        try {
            // ScriptGrammar.g:72:9: ( ( ID | INT ) )
            // ScriptGrammar.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set64=(Token)input.LT(1);

            if ( (input.LA(1) >= ID && input.LA(1) <= INT) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set64)
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

    // Delegated rules


 

    public static final BitSet FOLLOW_block_in_prog91 = new BitSet(new long[]{0x00000013801086C2L});
    public static final BitSet FOLLOW_33_in_block101 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_NEWLINE_in_block103 = new BitSet(new long[]{0x0000001B801086C0L});
    public static final BitSet FOLLOW_block_in_block105 = new BitSet(new long[]{0x0000001B801086C0L});
    public static final BitSet FOLLOW_35_in_block108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stat_in_block126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_stat140 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_NEWLINE_in_stat142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_stat163 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_assign_in_stat165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_in_stat183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_retexp_in_stat193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifexp_in_stat203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_stat213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assign243 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_assign245 = new BitSet(new long[]{0x00000010001080C0L});
    public static final BitSet FOLLOW_expr_in_assign247 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_NEWLINE_in_assign249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_retexp275 = new BitSet(new long[]{0x00000010001080C0L});
    public static final BitSet FOLLOW_expr_in_retexp277 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_NEWLINE_in_retexp279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multExpr_in_expr305 = new BitSet(new long[]{0x0000000441944002L});
    public static final BitSet FOLLOW_18_in_expr309 = new BitSet(new long[]{0x00000010001080C0L});
    public static final BitSet FOLLOW_20_in_expr312 = new BitSet(new long[]{0x00000010001080C0L});
    public static final BitSet FOLLOW_14_in_expr315 = new BitSet(new long[]{0x00000010001080C0L});
    public static final BitSet FOLLOW_34_in_expr318 = new BitSet(new long[]{0x00000010001080C0L});
    public static final BitSet FOLLOW_30_in_expr321 = new BitSet(new long[]{0x00000010001080C0L});
    public static final BitSet FOLLOW_23_in_expr324 = new BitSet(new long[]{0x00000010001080C0L});
    public static final BitSet FOLLOW_24_in_expr327 = new BitSet(new long[]{0x00000010001080C0L});
    public static final BitSet FOLLOW_multExpr_in_expr331 = new BitSet(new long[]{0x0000000441944002L});
    public static final BitSet FOLLOW_unaryExp_in_multExpr353 = new BitSet(new long[]{0x0000000000222002L});
    public static final BitSet FOLLOW_17_in_multExpr357 = new BitSet(new long[]{0x00000010001080C0L});
    public static final BitSet FOLLOW_21_in_multExpr360 = new BitSet(new long[]{0x00000010001080C0L});
    public static final BitSet FOLLOW_13_in_multExpr363 = new BitSet(new long[]{0x00000010001080C0L});
    public static final BitSet FOLLOW_unaryExp_in_multExpr367 = new BitSet(new long[]{0x0000000000222002L});
    public static final BitSet FOLLOW_20_in_unaryExp393 = new BitSet(new long[]{0x00000000000080C0L});
    public static final BitSet FOLLOW_atom_in_unaryExp395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_unaryExp413 = new BitSet(new long[]{0x00000000000080C0L});
    public static final BitSet FOLLOW_atom_in_unaryExp415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_unaryExp433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_atom472 = new BitSet(new long[]{0x00000010001080C0L});
    public static final BitSet FOLLOW_expr_in_atom475 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_atom477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_atom488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funcall500 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_funcall502 = new BitSet(new long[]{0x00000010001080C0L});
    public static final BitSet FOLLOW_expr_in_funcall504 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_19_in_funcall507 = new BitSet(new long[]{0x00000010001080C0L});
    public static final BitSet FOLLOW_expr_in_funcall509 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_16_in_funcall513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ifexp536 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_boolexp_in_ifexp538 = new BitSet(new long[]{0x00000013801086C0L});
    public static final BitSet FOLLOW_block_in_ifexp540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_boolexp567 = new BitSet(new long[]{0x000000003A401000L});
    public static final BitSet FOLLOW_27_in_boolexp570 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_12_in_boolexp573 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_28_in_boolexp576 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_29_in_boolexp579 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_22_in_boolexp582 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_25_in_boolexp585 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_boolterm_in_boolexp588 = new BitSet(new long[]{0x0000000000000002L});

}