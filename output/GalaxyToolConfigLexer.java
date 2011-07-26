// $ANTLR 3.3 Nov 30, 2010 12:45:30 /home/samuel/projects/galaxy-toolconfig-parser/GalaxyToolConfig.g 2011-07-26 17:13:20

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class GalaxyToolConfigLexer extends Lexer {
    public static final int EOF=-1;
    public static final int IF=4;
    public static final int ELSE=5;
    public static final int ENDIF=6;
    public static final int WORD=7;
    public static final int WS=8;

    // delegates
    // delegators

    public GalaxyToolConfigLexer() {;} 
    public GalaxyToolConfigLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public GalaxyToolConfigLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/home/samuel/projects/galaxy-toolconfig-parser/GalaxyToolConfig.g"; }

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/samuel/projects/galaxy-toolconfig-parser/GalaxyToolConfig.g:10:4: ( '#if' )
            // /home/samuel/projects/galaxy-toolconfig-parser/GalaxyToolConfig.g:10:6: '#if'
            {
            match("#if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/samuel/projects/galaxy-toolconfig-parser/GalaxyToolConfig.g:13:6: ( '#else' )
            // /home/samuel/projects/galaxy-toolconfig-parser/GalaxyToolConfig.g:13:8: '#else'
            {
            match("#else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "ENDIF"
    public final void mENDIF() throws RecognitionException {
        try {
            int _type = ENDIF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/samuel/projects/galaxy-toolconfig-parser/GalaxyToolConfig.g:16:8: ( '#end if' )
            // /home/samuel/projects/galaxy-toolconfig-parser/GalaxyToolConfig.g:16:10: '#end if'
            {
            match("#end if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ENDIF"

    // $ANTLR start "WORD"
    public final void mWORD() throws RecognitionException {
        try {
            int _type = WORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/samuel/projects/galaxy-toolconfig-parser/GalaxyToolConfig.g:23:6: ( (~ ( ' ' | '\\t' | '\\r' | '\\n' ) )+ )
            // /home/samuel/projects/galaxy-toolconfig-parser/GalaxyToolConfig.g:23:8: (~ ( ' ' | '\\t' | '\\r' | '\\n' ) )+
            {
            // /home/samuel/projects/galaxy-toolconfig-parser/GalaxyToolConfig.g:23:8: (~ ( ' ' | '\\t' | '\\r' | '\\n' ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\b')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\u001F')||(LA1_0>='!' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/samuel/projects/galaxy-toolconfig-parser/GalaxyToolConfig.g:23:9: ~ ( ' ' | '\\t' | '\\r' | '\\n' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\b')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\u001F')||(input.LA(1)>='!' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WORD"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/samuel/projects/galaxy-toolconfig-parser/GalaxyToolConfig.g:26:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /home/samuel/projects/galaxy-toolconfig-parser/GalaxyToolConfig.g:26:9: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // /home/samuel/projects/galaxy-toolconfig-parser/GalaxyToolConfig.g:1:8: ( IF | ELSE | ENDIF | WORD | WS )
        int alt2=5;
        alt2 = dfa2.predict(input);
        switch (alt2) {
            case 1 :
                // /home/samuel/projects/galaxy-toolconfig-parser/GalaxyToolConfig.g:1:10: IF
                {
                mIF(); 

                }
                break;
            case 2 :
                // /home/samuel/projects/galaxy-toolconfig-parser/GalaxyToolConfig.g:1:13: ELSE
                {
                mELSE(); 

                }
                break;
            case 3 :
                // /home/samuel/projects/galaxy-toolconfig-parser/GalaxyToolConfig.g:1:18: ENDIF
                {
                mENDIF(); 

                }
                break;
            case 4 :
                // /home/samuel/projects/galaxy-toolconfig-parser/GalaxyToolConfig.g:1:24: WORD
                {
                mWORD(); 

                }
                break;
            case 5 :
                // /home/samuel/projects/galaxy-toolconfig-parser/GalaxyToolConfig.g:1:29: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA2 dfa2 = new DFA2(this);
    static final String DFA2_eotS =
        "\1\uffff\1\2\2\uffff\2\2\1\11\2\2\1\uffff\2\2\1\16\2\uffff";
    static final String DFA2_eofS =
        "\17\uffff";
    static final String DFA2_minS =
        "\1\0\1\145\2\uffff\1\146\1\154\1\0\1\163\1\144\1\uffff\1\145\1\40"+
        "\1\0\2\uffff";
    static final String DFA2_maxS =
        "\1\uffff\1\151\2\uffff\1\146\1\156\1\uffff\1\163\1\144\1\uffff\1"+
        "\145\1\40\1\uffff\2\uffff";
    static final String DFA2_acceptS =
        "\2\uffff\1\4\1\5\5\uffff\1\1\3\uffff\1\3\1\2";
    static final String DFA2_specialS =
        "\1\1\5\uffff\1\0\5\uffff\1\2\2\uffff}>";
    static final String[] DFA2_transitionS = {
            "\11\2\2\3\2\2\1\3\22\2\1\3\2\2\1\1\uffdc\2",
            "\1\5\3\uffff\1\4",
            "",
            "",
            "\1\6",
            "\1\7\1\uffff\1\10",
            "\11\2\2\uffff\2\2\1\uffff\22\2\1\uffff\uffdf\2",
            "\1\12",
            "\1\13",
            "",
            "\1\14",
            "\1\15",
            "\11\2\2\uffff\2\2\1\uffff\22\2\1\uffff\uffdf\2",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( IF | ELSE | ENDIF | WORD | WS );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA2_6 = input.LA(1);

                        s = -1;
                        if ( ((LA2_6>='\u0000' && LA2_6<='\b')||(LA2_6>='\u000B' && LA2_6<='\f')||(LA2_6>='\u000E' && LA2_6<='\u001F')||(LA2_6>='!' && LA2_6<='\uFFFF')) ) {s = 2;}

                        else s = 9;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA2_0 = input.LA(1);

                        s = -1;
                        if ( (LA2_0=='#') ) {s = 1;}

                        else if ( ((LA2_0>='\u0000' && LA2_0<='\b')||(LA2_0>='\u000B' && LA2_0<='\f')||(LA2_0>='\u000E' && LA2_0<='\u001F')||(LA2_0>='!' && LA2_0<='\"')||(LA2_0>='$' && LA2_0<='\uFFFF')) ) {s = 2;}

                        else if ( ((LA2_0>='\t' && LA2_0<='\n')||LA2_0=='\r'||LA2_0==' ') ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA2_12 = input.LA(1);

                        s = -1;
                        if ( ((LA2_12>='\u0000' && LA2_12<='\b')||(LA2_12>='\u000B' && LA2_12<='\f')||(LA2_12>='\u000E' && LA2_12<='\u001F')||(LA2_12>='!' && LA2_12<='\uFFFF')) ) {s = 2;}

                        else s = 14;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 2, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}