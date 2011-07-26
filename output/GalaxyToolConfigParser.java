// $ANTLR 3.3 Nov 30, 2010 12:45:30 /home/samuel/projects/galaxytoolconfig-bnf/GalaxyToolConfig.g 2011-07-26 12:16:49

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
public class GalaxyToolConfigParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IF", "ELSE", "ENDIF", "CHAR", "WS"
    };
    public static final int EOF=-1;
    public static final int IF=4;
    public static final int ELSE=5;
    public static final int ENDIF=6;
    public static final int CHAR=7;
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
                new DebugEventSocketProxy(this, port, null);
            setDebugListener(proxy);
            try {
                proxy.handshake();
            }
            catch (IOException ioe) {
                reportError(ioe);
            }
        }
    public GalaxyToolConfigParser(TokenStream input, DebugEventListener dbg) {
        super(input, dbg, new RecognizerSharedState());

    }
    protected boolean evalPredicate(boolean result, String predicate) {
        dbg.semanticPredicate(result, predicate);
        return result;
    }


    public String[] getTokenNames() { return GalaxyToolConfigParser.tokenNames; }
    public String getGrammarFileName() { return "/home/samuel/projects/galaxytoolconfig-bnf/GalaxyToolConfig.g"; }



    // $ANTLR start "command"
    // /home/samuel/projects/galaxytoolconfig-bnf/GalaxyToolConfig.g:4:1: command : ( text )? IF ( text )? ELSE ( text )? ENDIF ( text )? ;
    public final void command() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "command");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(4, 1);

        try {
            // /home/samuel/projects/galaxytoolconfig-bnf/GalaxyToolConfig.g:4:9: ( ( text )? IF ( text )? ELSE ( text )? ENDIF ( text )? )
            dbg.enterAlt(1);

            // /home/samuel/projects/galaxytoolconfig-bnf/GalaxyToolConfig.g:4:11: ( text )? IF ( text )? ELSE ( text )? ENDIF ( text )?
            {
            dbg.location(4,11);
            // /home/samuel/projects/galaxytoolconfig-bnf/GalaxyToolConfig.g:4:11: ( text )?
            int alt1=2;
            try { dbg.enterSubRule(1);
            try { dbg.enterDecision(1, decisionCanBacktrack[1]);

            int LA1_0 = input.LA(1);

            if ( (LA1_0==CHAR) ) {
                alt1=1;
            }
            } finally {dbg.exitDecision(1);}

            switch (alt1) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/samuel/projects/galaxytoolconfig-bnf/GalaxyToolConfig.g:4:11: text
                    {
                    dbg.location(4,11);
                    pushFollow(FOLLOW_text_in_command11);
                    text();

                    state._fsp--;


                    }
                    break;

            }
            } finally {dbg.exitSubRule(1);}

            dbg.location(4,17);
            match(input,IF,FOLLOW_IF_in_command14); 
            dbg.location(4,20);
            // /home/samuel/projects/galaxytoolconfig-bnf/GalaxyToolConfig.g:4:20: ( text )?
            int alt2=2;
            try { dbg.enterSubRule(2);
            try { dbg.enterDecision(2, decisionCanBacktrack[2]);

            int LA2_0 = input.LA(1);

            if ( (LA2_0==CHAR) ) {
                alt2=1;
            }
            } finally {dbg.exitDecision(2);}

            switch (alt2) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/samuel/projects/galaxytoolconfig-bnf/GalaxyToolConfig.g:4:20: text
                    {
                    dbg.location(4,20);
                    pushFollow(FOLLOW_text_in_command16);
                    text();

                    state._fsp--;


                    }
                    break;

            }
            } finally {dbg.exitSubRule(2);}

            dbg.location(4,26);
            match(input,ELSE,FOLLOW_ELSE_in_command19); 
            dbg.location(4,31);
            // /home/samuel/projects/galaxytoolconfig-bnf/GalaxyToolConfig.g:4:31: ( text )?
            int alt3=2;
            try { dbg.enterSubRule(3);
            try { dbg.enterDecision(3, decisionCanBacktrack[3]);

            int LA3_0 = input.LA(1);

            if ( (LA3_0==CHAR) ) {
                alt3=1;
            }
            } finally {dbg.exitDecision(3);}

            switch (alt3) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/samuel/projects/galaxytoolconfig-bnf/GalaxyToolConfig.g:4:31: text
                    {
                    dbg.location(4,31);
                    pushFollow(FOLLOW_text_in_command21);
                    text();

                    state._fsp--;


                    }
                    break;

            }
            } finally {dbg.exitSubRule(3);}

            dbg.location(4,37);
            match(input,ENDIF,FOLLOW_ENDIF_in_command24); 
            dbg.location(4,43);
            // /home/samuel/projects/galaxytoolconfig-bnf/GalaxyToolConfig.g:4:43: ( text )?
            int alt4=2;
            try { dbg.enterSubRule(4);
            try { dbg.enterDecision(4, decisionCanBacktrack[4]);

            int LA4_0 = input.LA(1);

            if ( (LA4_0==CHAR) ) {
                alt4=1;
            }
            } finally {dbg.exitDecision(4);}

            switch (alt4) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/samuel/projects/galaxytoolconfig-bnf/GalaxyToolConfig.g:4:43: text
                    {
                    dbg.location(4,43);
                    pushFollow(FOLLOW_text_in_command26);
                    text();

                    state._fsp--;


                    }
                    break;

            }
            } finally {dbg.exitSubRule(4);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
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

        return ;
    }
    // $ANTLR end "command"


    // $ANTLR start "text"
    // /home/samuel/projects/galaxytoolconfig-bnf/GalaxyToolConfig.g:7:1: text : ( CHAR )+ ;
    public final void text() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "text");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(7, 1);

        try {
            // /home/samuel/projects/galaxytoolconfig-bnf/GalaxyToolConfig.g:7:6: ( ( CHAR )+ )
            dbg.enterAlt(1);

            // /home/samuel/projects/galaxytoolconfig-bnf/GalaxyToolConfig.g:7:8: ( CHAR )+
            {
            dbg.location(7,8);
            // /home/samuel/projects/galaxytoolconfig-bnf/GalaxyToolConfig.g:7:8: ( CHAR )+
            int cnt5=0;
            try { dbg.enterSubRule(5);

            loop5:
            do {
                int alt5=2;
                try { dbg.enterDecision(5, decisionCanBacktrack[5]);

                int LA5_0 = input.LA(1);

                if ( (LA5_0==CHAR) ) {
                    alt5=1;
                }


                } finally {dbg.exitDecision(5);}

                switch (alt5) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/samuel/projects/galaxytoolconfig-bnf/GalaxyToolConfig.g:7:8: CHAR
            	    {
            	    dbg.location(7,8);
            	    match(input,CHAR,FOLLOW_CHAR_in_text38); 

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

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
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

        return ;
    }
    // $ANTLR end "text"

    // Delegated rules


 

    public static final BitSet FOLLOW_text_in_command11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IF_in_command14 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_text_in_command16 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ELSE_in_command19 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_text_in_command21 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ENDIF_in_command24 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_text_in_command26 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_text38 = new BitSet(new long[]{0x0000000000000082L});

}