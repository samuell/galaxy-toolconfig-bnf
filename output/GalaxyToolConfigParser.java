// $ANTLR 3.3 Nov 30, 2010 12:45:30 /home/samuel/projects/galaxy-toolconfig-bnf/GalaxyToolConfig.g 2011-07-26 18:09:07

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class GalaxyToolConfigParser extends Parser {
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


        public GalaxyToolConfigParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public GalaxyToolConfigParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return GalaxyToolConfigParser.tokenNames; }
    public String getGrammarFileName() { return "/home/samuel/projects/galaxy-toolconfig-bnf/GalaxyToolConfig.g"; }


    public static class command_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "command"
    // /home/samuel/projects/galaxy-toolconfig-bnf/GalaxyToolConfig.g:4:1: command : ( text )? IF ( text )? ( ELSE ( text )? ( ENDIF ( text )? ) ) ;
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

        try {
            // /home/samuel/projects/galaxy-toolconfig-bnf/GalaxyToolConfig.g:4:9: ( ( text )? IF ( text )? ( ELSE ( text )? ( ENDIF ( text )? ) ) )
            // /home/samuel/projects/galaxy-toolconfig-bnf/GalaxyToolConfig.g:4:11: ( text )? IF ( text )? ( ELSE ( text )? ( ENDIF ( text )? ) )
            {
            root_0 = (Object)adaptor.nil();

            // /home/samuel/projects/galaxy-toolconfig-bnf/GalaxyToolConfig.g:4:11: ( text )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==WORD) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /home/samuel/projects/galaxy-toolconfig-bnf/GalaxyToolConfig.g:4:11: text
                    {
                    pushFollow(FOLLOW_text_in_command17);
                    text1=text();

                    state._fsp--;

                    adaptor.addChild(root_0, text1.getTree());

                    }
                    break;

            }

            IF2=(Token)match(input,IF,FOLLOW_IF_in_command20); 
            IF2_tree = (Object)adaptor.create(IF2);
            root_0 = (Object)adaptor.becomeRoot(IF2_tree, root_0);

            // /home/samuel/projects/galaxy-toolconfig-bnf/GalaxyToolConfig.g:4:21: ( text )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==WORD) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /home/samuel/projects/galaxy-toolconfig-bnf/GalaxyToolConfig.g:4:21: text
                    {
                    pushFollow(FOLLOW_text_in_command23);
                    text3=text();

                    state._fsp--;

                    adaptor.addChild(root_0, text3.getTree());

                    }
                    break;

            }

            // /home/samuel/projects/galaxy-toolconfig-bnf/GalaxyToolConfig.g:4:27: ( ELSE ( text )? ( ENDIF ( text )? ) )
            // /home/samuel/projects/galaxy-toolconfig-bnf/GalaxyToolConfig.g:4:28: ELSE ( text )? ( ENDIF ( text )? )
            {
            ELSE4=(Token)match(input,ELSE,FOLLOW_ELSE_in_command27); 
            ELSE4_tree = (Object)adaptor.create(ELSE4);
            root_0 = (Object)adaptor.becomeRoot(ELSE4_tree, root_0);

            // /home/samuel/projects/galaxy-toolconfig-bnf/GalaxyToolConfig.g:4:34: ( text )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==WORD) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /home/samuel/projects/galaxy-toolconfig-bnf/GalaxyToolConfig.g:4:34: text
                    {
                    pushFollow(FOLLOW_text_in_command30);
                    text5=text();

                    state._fsp--;

                    adaptor.addChild(root_0, text5.getTree());

                    }
                    break;

            }

            // /home/samuel/projects/galaxy-toolconfig-bnf/GalaxyToolConfig.g:4:40: ( ENDIF ( text )? )
            // /home/samuel/projects/galaxy-toolconfig-bnf/GalaxyToolConfig.g:4:41: ENDIF ( text )?
            {
            ENDIF6=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_command34); 
            ENDIF6_tree = (Object)adaptor.create(ENDIF6);
            root_0 = (Object)adaptor.becomeRoot(ENDIF6_tree, root_0);

            // /home/samuel/projects/galaxy-toolconfig-bnf/GalaxyToolConfig.g:4:48: ( text )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==WORD) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /home/samuel/projects/galaxy-toolconfig-bnf/GalaxyToolConfig.g:4:48: text
                    {
                    pushFollow(FOLLOW_text_in_command37);
                    text7=text();

                    state._fsp--;

                    adaptor.addChild(root_0, text7.getTree());

                    }
                    break;

            }


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
        return retval;
    }
    // $ANTLR end "command"

    public static class elsepart_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elsepart"
    // /home/samuel/projects/galaxy-toolconfig-bnf/GalaxyToolConfig.g:8:1: elsepart : ELSE ( text )? ;
    public final GalaxyToolConfigParser.elsepart_return elsepart() throws RecognitionException {
        GalaxyToolConfigParser.elsepart_return retval = new GalaxyToolConfigParser.elsepart_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ELSE8=null;
        GalaxyToolConfigParser.text_return text9 = null;


        Object ELSE8_tree=null;

        try {
            // /home/samuel/projects/galaxy-toolconfig-bnf/GalaxyToolConfig.g:9:2: ( ELSE ( text )? )
            // /home/samuel/projects/galaxy-toolconfig-bnf/GalaxyToolConfig.g:9:4: ELSE ( text )?
            {
            root_0 = (Object)adaptor.nil();

            ELSE8=(Token)match(input,ELSE,FOLLOW_ELSE_in_elsepart53); 
            ELSE8_tree = (Object)adaptor.create(ELSE8);
            root_0 = (Object)adaptor.becomeRoot(ELSE8_tree, root_0);

            // /home/samuel/projects/galaxy-toolconfig-bnf/GalaxyToolConfig.g:9:10: ( text )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==WORD) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /home/samuel/projects/galaxy-toolconfig-bnf/GalaxyToolConfig.g:9:10: text
                    {
                    pushFollow(FOLLOW_text_in_elsepart56);
                    text9=text();

                    state._fsp--;

                    adaptor.addChild(root_0, text9.getTree());

                    }
                    break;

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
        return retval;
    }
    // $ANTLR end "elsepart"

    public static class endifpart_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "endifpart"
    // /home/samuel/projects/galaxy-toolconfig-bnf/GalaxyToolConfig.g:12:1: endifpart : ENDIF ( text )? ;
    public final GalaxyToolConfigParser.endifpart_return endifpart() throws RecognitionException {
        GalaxyToolConfigParser.endifpart_return retval = new GalaxyToolConfigParser.endifpart_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ENDIF10=null;
        GalaxyToolConfigParser.text_return text11 = null;


        Object ENDIF10_tree=null;

        try {
            // /home/samuel/projects/galaxy-toolconfig-bnf/GalaxyToolConfig.g:13:2: ( ENDIF ( text )? )
            // /home/samuel/projects/galaxy-toolconfig-bnf/GalaxyToolConfig.g:13:4: ENDIF ( text )?
            {
            root_0 = (Object)adaptor.nil();

            ENDIF10=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_endifpart69); 
            ENDIF10_tree = (Object)adaptor.create(ENDIF10);
            root_0 = (Object)adaptor.becomeRoot(ENDIF10_tree, root_0);

            // /home/samuel/projects/galaxy-toolconfig-bnf/GalaxyToolConfig.g:13:11: ( text )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==WORD) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /home/samuel/projects/galaxy-toolconfig-bnf/GalaxyToolConfig.g:13:11: text
                    {
                    pushFollow(FOLLOW_text_in_endifpart72);
                    text11=text();

                    state._fsp--;

                    adaptor.addChild(root_0, text11.getTree());

                    }
                    break;

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
        return retval;
    }
    // $ANTLR end "endifpart"

    public static class text_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "text"
    // /home/samuel/projects/galaxy-toolconfig-bnf/GalaxyToolConfig.g:16:1: text : ( WORD )+ ;
    public final GalaxyToolConfigParser.text_return text() throws RecognitionException {
        GalaxyToolConfigParser.text_return retval = new GalaxyToolConfigParser.text_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WORD12=null;

        Object WORD12_tree=null;

        try {
            // /home/samuel/projects/galaxy-toolconfig-bnf/GalaxyToolConfig.g:16:7: ( ( WORD )+ )
            // /home/samuel/projects/galaxy-toolconfig-bnf/GalaxyToolConfig.g:16:9: ( WORD )+
            {
            root_0 = (Object)adaptor.nil();

            // /home/samuel/projects/galaxy-toolconfig-bnf/GalaxyToolConfig.g:16:9: ( WORD )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==WORD) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /home/samuel/projects/galaxy-toolconfig-bnf/GalaxyToolConfig.g:16:9: WORD
            	    {
            	    WORD12=(Token)match(input,WORD,FOLLOW_WORD_in_text84); 
            	    WORD12_tree = (Object)adaptor.create(WORD12);
            	    adaptor.addChild(root_0, WORD12_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


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
    public static final BitSet FOLLOW_ELSE_in_elsepart53 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_text_in_elsepart56 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENDIF_in_endifpart69 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_text_in_endifpart72 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_text84 = new BitSet(new long[]{0x0000000000000082L});

}