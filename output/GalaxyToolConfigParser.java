// $ANTLR 3.3 Nov 30, 2010 12:45:30 /home/samuel/projects/galaxy-toolconfig-parser/GalaxyToolConfig.g 2011-07-26 17:13:19

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;

import org.antlr.runtime.tree.*;

public class GalaxyToolConfigParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IF", "ELSE", "ENDIF", "WORD", "WS"
    };
    public static final int EOF=-1;
    public static final int IF=4;
    public static final int ELSE=5;
    public static final int ENDIF=6;
    public static final int WORD=7;
    public static final int WS=8;

    // delegates
    // delegators

    public static final String[] ruleNames = new String[] {
        "invalidRule", "text", "command"
    };
    public static final boolean[] decisionCanBacktrack = new boolean[] {
        false, // invalid decision
        false, false, false, false, false
    };

     
        public int ruleLevel = 0;
        public int getRuleLevel() { return ruleLevel; }
        public void incRuleLevel() { ruleLevel++; }
        public void decRuleLevel() { ruleLevel--; }
        public GalaxyToolConfigParser(TokenStream input) {
            this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
        }
        public GalaxyToolConfigParser(TokenStream input, int port, RecognizerSharedState state) {
            super(input, state);
            DebugEventSocketProxy proxy =
                new DebugEventSocketProxy(this,port,adaptor);
            setDebugListener(proxy);
            setTokenStream(new DebugTokenStream(input,proxy));
            try {
                proxy.handshake();
            }
            catch (IOException ioe) {
                reportError(ioe);
            }
            TreeAdaptor adap = new CommonTreeAdaptor();
            setTreeAdaptor(adap);
            proxy.setTreeAdaptor(adap);
        }
    public GalaxyToolConfigParser(TokenStream input, DebugEventListener dbg) {
        super(input, dbg);

         
        TreeAdaptor adap = new CommonTreeAdaptor();
        setTreeAdaptor(adap);

    }
    protected boolean evalPredicate(boolean result, String predicate) {
        dbg.semanticPredicate(result, predicate);
        return result;
    }

    protected DebugTreeAdaptor adaptor;
    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = new DebugTreeAdaptor(dbg,adaptor);

    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }


    public String[] getTokenNames() { return GalaxyToolConfigParser.tokenNames; }
    public String getGrammarFileName() { return "/home/samuel/projects/galaxy-toolconfig-parser/GalaxyToolConfig.g"; }


    public static class command_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "command"
    // /home/samuel/projects/galaxy-toolconfig-parser/GalaxyToolConfig.g:4:1: command : ( text )? IF ( text )? ( ELSE ( text )? ( ENDIF ( text )? ) ) ;
    public final GalaxyToolConfigParser.command_return command() throws RecognitionException {
        GalaxyToolConfigParser.command_return retval = new GalaxyToolConfigParser.command_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IF2=null;
        Token ELSE4=null;
        Token ENDIF6=null;
        GalaxyToolConfigParser.text_return text1 = null;

        GalaxyToolConfigParser.text_return text3 = null;

        GalaxyToolConfigParser.text_return text5 = null;

        GalaxyToolConfigParser.text_return text7 = null;


        Object IF2_tree=null;
        Object ELSE4_tree=null;
        Object ENDIF6_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "command");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(4, 1);

        try {
            // /home/samuel/projects/galaxy-toolconfig-parser/GalaxyToolConfig.g:4:9: ( ( text )? IF ( text )? ( ELSE ( text )? ( ENDIF ( text )? ) ) )
            dbg.enterAlt(1);

            // /home/samuel/projects/galaxy-toolconfig-parser/GalaxyToolConfig.g:4:11: ( text )? IF ( text )? ( ELSE ( text )? ( ENDIF ( text )? ) )
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(4,11);
            // /home/samuel/projects/galaxy-toolconfig-parser/GalaxyToolConfig.g:4:11: ( text )?
            int alt1=2;
            try { dbg.enterSubRule(1);
            try { dbg.enterDecision(1, decisionCanBacktrack[1]);

            int LA1_0 = input.LA(1);

            if ( (LA1_0==WORD) ) {
                alt1=1;
            }
            } finally {dbg.exitDecision(1);}

            switch (alt1) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/samuel/projects/galaxy-toolconfig-parser/GalaxyToolConfig.g:4:11: text
                    {
                    dbg.location(4,11);
                    pushFollow(FOLLOW_text_in_command17);
                    text1=text();

                    state._fsp--;

                    adaptor.addChild(root_0, text1.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(1);}

            dbg.location(4,19);
            IF2=(Token)match(input,IF,FOLLOW_IF_in_command20); 
            IF2_tree = (Object)adaptor.create(IF2);
            root_0 = (Object)adaptor.becomeRoot(IF2_tree, root_0);

            dbg.location(4,21);
            // /home/samuel/projects/galaxy-toolconfig-parser/GalaxyToolConfig.g:4:21: ( text )?
            int alt2=2;
            try { dbg.enterSubRule(2);
            try { dbg.enterDecision(2, decisionCanBacktrack[2]);

            int LA2_0 = input.LA(1);

            if ( (LA2_0==WORD) ) {
                alt2=1;
            }
            } finally {dbg.exitDecision(2);}

            switch (alt2) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/samuel/projects/galaxy-toolconfig-parser/GalaxyToolConfig.g:4:21: text
                    {
                    dbg.location(4,21);
                    pushFollow(FOLLOW_text_in_command23);
                    text3=text();

                    state._fsp--;

                    adaptor.addChild(root_0, text3.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(2);}

            dbg.location(4,27);
            // /home/samuel/projects/galaxy-toolconfig-parser/GalaxyToolConfig.g:4:27: ( ELSE ( text )? ( ENDIF ( text )? ) )
            dbg.enterAlt(1);

            // /home/samuel/projects/galaxy-toolconfig-parser/GalaxyToolConfig.g:4:28: ELSE ( text )? ( ENDIF ( text )? )
            {
            dbg.location(4,32);
            ELSE4=(Token)match(input,ELSE,FOLLOW_ELSE_in_command27); 
            ELSE4_tree = (Object)adaptor.create(ELSE4);
            root_0 = (Object)adaptor.becomeRoot(ELSE4_tree, root_0);

            dbg.location(4,34);
            // /home/samuel/projects/galaxy-toolconfig-parser/GalaxyToolConfig.g:4:34: ( text )?
            int alt3=2;
            try { dbg.enterSubRule(3);
            try { dbg.enterDecision(3, decisionCanBacktrack[3]);

            int LA3_0 = input.LA(1);

            if ( (LA3_0==WORD) ) {
                alt3=1;
            }
            } finally {dbg.exitDecision(3);}

            switch (alt3) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/samuel/projects/galaxy-toolconfig-parser/GalaxyToolConfig.g:4:34: text
                    {
                    dbg.location(4,34);
                    pushFollow(FOLLOW_text_in_command30);
                    text5=text();

                    state._fsp--;

                    adaptor.addChild(root_0, text5.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(3);}

            dbg.location(4,40);
            // /home/samuel/projects/galaxy-toolconfig-parser/GalaxyToolConfig.g:4:40: ( ENDIF ( text )? )
            dbg.enterAlt(1);

            // /home/samuel/projects/galaxy-toolconfig-parser/GalaxyToolConfig.g:4:41: ENDIF ( text )?
            {
            dbg.location(4,46);
            ENDIF6=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_command34); 
            ENDIF6_tree = (Object)adaptor.create(ENDIF6);
            root_0 = (Object)adaptor.becomeRoot(ENDIF6_tree, root_0);

            dbg.location(4,48);
            // /home/samuel/projects/galaxy-toolconfig-parser/GalaxyToolConfig.g:4:48: ( text )?
            int alt4=2;
            try { dbg.enterSubRule(4);
            try { dbg.enterDecision(4, decisionCanBacktrack[4]);

            int LA4_0 = input.LA(1);

            if ( (LA4_0==WORD) ) {
                alt4=1;
            }
            } finally {dbg.exitDecision(4);}

            switch (alt4) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/samuel/projects/galaxy-toolconfig-parser/GalaxyToolConfig.g:4:48: text
                    {
                    dbg.location(4,48);
                    pushFollow(FOLLOW_text_in_command37);
                    text7=text();

                    state._fsp--;

                    adaptor.addChild(root_0, text7.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(4);}


            }


            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(5, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "command");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "command"

    public static class text_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "text"
    // /home/samuel/projects/galaxy-toolconfig-parser/GalaxyToolConfig.g:7:1: text : ( WORD )+ ;
    public final GalaxyToolConfigParser.text_return text() throws RecognitionException {
        GalaxyToolConfigParser.text_return retval = new GalaxyToolConfigParser.text_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WORD8=null;

        Object WORD8_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "text");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(7, 1);

        try {
            // /home/samuel/projects/galaxy-toolconfig-parser/GalaxyToolConfig.g:7:7: ( ( WORD )+ )
            dbg.enterAlt(1);

            // /home/samuel/projects/galaxy-toolconfig-parser/GalaxyToolConfig.g:7:9: ( WORD )+
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(7,9);
            // /home/samuel/projects/galaxy-toolconfig-parser/GalaxyToolConfig.g:7:9: ( WORD )+
            int cnt5=0;
            try { dbg.enterSubRule(5);

            loop5:
            do {
                int alt5=2;
                try { dbg.enterDecision(5, decisionCanBacktrack[5]);

                int LA5_0 = input.LA(1);

                if ( (LA5_0==WORD) ) {
                    alt5=1;
                }


                } finally {dbg.exitDecision(5);}

                switch (alt5) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/samuel/projects/galaxy-toolconfig-parser/GalaxyToolConfig.g:7:9: WORD
            	    {
            	    dbg.location(7,9);
            	    WORD8=(Token)match(input,WORD,FOLLOW_WORD_in_text52); 
            	    WORD8_tree = (Object)adaptor.create(WORD8);
            	    adaptor.addChild(root_0, WORD8_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt5++;
            } while (true);
            } finally {dbg.exitSubRule(5);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(8, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "text");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "text"

    // Delegated rules


 

    public static final BitSet FOLLOW_text_in_command17 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IF_in_command20 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_text_in_command23 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ELSE_in_command27 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_text_in_command30 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ENDIF_in_command34 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_text_in_command37 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_text52 = new BitSet(new long[]{0x0000000000000082L});

}