package willburden.hale.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalHaleLexer extends Lexer {
    public static final int T__50=50;
    public static final int RULE_BOOLEAN=4;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int RULE_ID=8;
    public static final int RULE_PRIMITIVE_TYPE=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=5;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=11;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalHaleLexer() {;} 
    public InternalHaleLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalHaleLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalHale.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalHale.g:11:7: ( ';' )
            // InternalHale.g:11:9: ';'
            {
            match(';'); 

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
            // InternalHale.g:12:7: ( '{' )
            // InternalHale.g:12:9: '{'
            {
            match('{'); 

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
            // InternalHale.g:13:7: ( '}' )
            // InternalHale.g:13:9: '}'
            {
            match('}'); 

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
            // InternalHale.g:14:7: ( '.' )
            // InternalHale.g:14:9: '.'
            {
            match('.'); 

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
            // InternalHale.g:15:7: ( 'and' )
            // InternalHale.g:15:9: 'and'
            {
            match("and"); 


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
            // InternalHale.g:16:7: ( 'or' )
            // InternalHale.g:16:9: 'or'
            {
            match("or"); 


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
            // InternalHale.g:17:7: ( '==' )
            // InternalHale.g:17:9: '=='
            {
            match("=="); 


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
            // InternalHale.g:18:7: ( '!=' )
            // InternalHale.g:18:9: '!='
            {
            match("!="); 


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
            // InternalHale.g:19:7: ( '<=' )
            // InternalHale.g:19:9: '<='
            {
            match("<="); 


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
            // InternalHale.g:20:7: ( '<' )
            // InternalHale.g:20:9: '<'
            {
            match('<'); 

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
            // InternalHale.g:21:7: ( '>=' )
            // InternalHale.g:21:9: '>='
            {
            match(">="); 


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
            // InternalHale.g:22:7: ( '>' )
            // InternalHale.g:22:9: '>'
            {
            match('>'); 

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
            // InternalHale.g:23:7: ( '+' )
            // InternalHale.g:23:9: '+'
            {
            match('+'); 

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
            // InternalHale.g:24:7: ( '-' )
            // InternalHale.g:24:9: '-'
            {
            match('-'); 

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
            // InternalHale.g:25:7: ( '*' )
            // InternalHale.g:25:9: '*'
            {
            match('*'); 

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
            // InternalHale.g:26:7: ( '/' )
            // InternalHale.g:26:9: '/'
            {
            match('/'); 

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
            // InternalHale.g:27:7: ( '%' )
            // InternalHale.g:27:9: '%'
            {
            match('%'); 

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
            // InternalHale.g:28:7: ( '**' )
            // InternalHale.g:28:9: '**'
            {
            match("**"); 


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
            // InternalHale.g:29:7: ( 'as' )
            // InternalHale.g:29:9: 'as'
            {
            match("as"); 


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
            // InternalHale.g:30:7: ( 'not' )
            // InternalHale.g:30:9: 'not'
            {
            match("not"); 


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
            // InternalHale.g:31:7: ( '(' )
            // InternalHale.g:31:9: '('
            {
            match('('); 

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
            // InternalHale.g:32:7: ( ',' )
            // InternalHale.g:32:9: ','
            {
            match(','); 

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
            // InternalHale.g:33:7: ( ')' )
            // InternalHale.g:33:9: ')'
            {
            match(')'); 

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
            // InternalHale.g:34:7: ( 'void' )
            // InternalHale.g:34:9: 'void'
            {
            match("void"); 


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
            // InternalHale.g:35:7: ( ':' )
            // InternalHale.g:35:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalHale.g:36:7: ( 'Function' )
            // InternalHale.g:36:9: 'Function'
            {
            match("Function"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalHale.g:37:7: ( '?' )
            // InternalHale.g:37:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalHale.g:38:7: ( 'let' )
            // InternalHale.g:38:9: 'let'
            {
            match("let"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalHale.g:39:7: ( 'mut' )
            // InternalHale.g:39:9: 'mut'
            {
            match("mut"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalHale.g:40:7: ( '=' )
            // InternalHale.g:40:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalHale.g:41:7: ( 'input' )
            // InternalHale.g:41:9: 'input'
            {
            match("input"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalHale.g:42:7: ( 'print' )
            // InternalHale.g:42:9: 'print'
            {
            match("print"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalHale.g:43:7: ( 'if' )
            // InternalHale.g:43:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalHale.g:44:7: ( 'else' )
            // InternalHale.g:44:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalHale.g:45:7: ( 'elseif' )
            // InternalHale.g:45:9: 'elseif'
            {
            match("elseif"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalHale.g:46:7: ( 'while' )
            // InternalHale.g:46:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalHale.g:47:7: ( 'break' )
            // InternalHale.g:47:9: 'break'
            {
            match("break"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalHale.g:48:7: ( 'function' )
            // InternalHale.g:48:9: 'function'
            {
            match("function"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalHale.g:49:7: ( 'return' )
            // InternalHale.g:49:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalHale.g:50:7: ( 'throw' )
            // InternalHale.g:50:9: 'throw'
            {
            match("throw"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "RULE_PRIMITIVE_TYPE"
    public final void mRULE_PRIMITIVE_TYPE() throws RecognitionException {
        try {
            int _type = RULE_PRIMITIVE_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalHale.g:2961:21: ( ( 'Void' | 'Boolean' | 'Number' | 'String' ) )
            // InternalHale.g:2961:23: ( 'Void' | 'Boolean' | 'Number' | 'String' )
            {
            // InternalHale.g:2961:23: ( 'Void' | 'Boolean' | 'Number' | 'String' )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 'V':
                {
                alt1=1;
                }
                break;
            case 'B':
                {
                alt1=2;
                }
                break;
            case 'N':
                {
                alt1=3;
                }
                break;
            case 'S':
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalHale.g:2961:24: 'Void'
                    {
                    match("Void"); 


                    }
                    break;
                case 2 :
                    // InternalHale.g:2961:31: 'Boolean'
                    {
                    match("Boolean"); 


                    }
                    break;
                case 3 :
                    // InternalHale.g:2961:41: 'Number'
                    {
                    match("Number"); 


                    }
                    break;
                case 4 :
                    // InternalHale.g:2961:50: 'String'
                    {
                    match("String"); 


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
    // $ANTLR end "RULE_PRIMITIVE_TYPE"

    // $ANTLR start "RULE_BOOLEAN"
    public final void mRULE_BOOLEAN() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalHale.g:2963:14: ( ( 'true' | 'false' ) )
            // InternalHale.g:2963:16: ( 'true' | 'false' )
            {
            // InternalHale.g:2963:16: ( 'true' | 'false' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='t') ) {
                alt2=1;
            }
            else if ( (LA2_0=='f') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalHale.g:2963:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalHale.g:2963:24: 'false'
                    {
                    match("false"); 


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
    // $ANTLR end "RULE_BOOLEAN"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalHale.g:2965:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalHale.g:2965:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalHale.g:2965:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalHale.g:2965:11: '^'
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

            // InternalHale.g:2965:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalHale.g:
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
            	    break loop4;
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

    // $ANTLR start "RULE_DOUBLE"
    public final void mRULE_DOUBLE() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalHale.g:2967:13: ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )? )
            // InternalHale.g:2967:15: ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )?
            {
            // InternalHale.g:2967:15: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalHale.g:2967:16: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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

            // InternalHale.g:2967:27: ( '.' ( '0' .. '9' )+ )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='.') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalHale.g:2967:28: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // InternalHale.g:2967:32: ( '0' .. '9' )+
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
                    	    // InternalHale.g:2967:33: '0' .. '9'
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
    // $ANTLR end "RULE_DOUBLE"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalHale.g:2969:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalHale.g:2969:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalHale.g:2969:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\"') ) {
                alt10=1;
            }
            else if ( (LA10_0=='\'') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalHale.g:2969:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalHale.g:2969:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalHale.g:2969:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalHale.g:2969:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop8;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalHale.g:2969:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalHale.g:2969:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='&')||(LA9_0>='(' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalHale.g:2969:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalHale.g:2969:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop9;
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
            // InternalHale.g:2971:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalHale.g:2971:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalHale.g:2971:24: ( options {greedy=false; } : . )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='*') ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1=='/') ) {
                        alt11=2;
                    }
                    else if ( ((LA11_1>='\u0000' && LA11_1<='.')||(LA11_1>='0' && LA11_1<='\uFFFF')) ) {
                        alt11=1;
                    }


                }
                else if ( ((LA11_0>='\u0000' && LA11_0<=')')||(LA11_0>='+' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalHale.g:2971:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop11;
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
            // InternalHale.g:2973:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalHale.g:2973:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalHale.g:2973:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalHale.g:2973:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop12;
                }
            } while (true);

            // InternalHale.g:2973:40: ( ( '\\r' )? '\\n' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\n'||LA14_0=='\r') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalHale.g:2973:41: ( '\\r' )? '\\n'
                    {
                    // InternalHale.g:2973:41: ( '\\r' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='\r') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalHale.g:2973:41: '\\r'
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
            // InternalHale.g:2975:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalHale.g:2975:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalHale.g:2975:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalHale.g:
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
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    public void mTokens() throws RecognitionException {
        // InternalHale.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | RULE_PRIMITIVE_TYPE | RULE_BOOLEAN | RULE_ID | RULE_DOUBLE | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS )
        int alt16=48;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // InternalHale.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalHale.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalHale.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalHale.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalHale.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalHale.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalHale.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalHale.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalHale.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalHale.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalHale.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalHale.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalHale.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // InternalHale.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // InternalHale.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // InternalHale.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // InternalHale.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // InternalHale.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // InternalHale.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // InternalHale.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // InternalHale.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // InternalHale.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // InternalHale.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // InternalHale.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // InternalHale.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // InternalHale.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // InternalHale.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // InternalHale.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // InternalHale.g:1:178: T__40
                {
                mT__40(); 

                }
                break;
            case 30 :
                // InternalHale.g:1:184: T__41
                {
                mT__41(); 

                }
                break;
            case 31 :
                // InternalHale.g:1:190: T__42
                {
                mT__42(); 

                }
                break;
            case 32 :
                // InternalHale.g:1:196: T__43
                {
                mT__43(); 

                }
                break;
            case 33 :
                // InternalHale.g:1:202: T__44
                {
                mT__44(); 

                }
                break;
            case 34 :
                // InternalHale.g:1:208: T__45
                {
                mT__45(); 

                }
                break;
            case 35 :
                // InternalHale.g:1:214: T__46
                {
                mT__46(); 

                }
                break;
            case 36 :
                // InternalHale.g:1:220: T__47
                {
                mT__47(); 

                }
                break;
            case 37 :
                // InternalHale.g:1:226: T__48
                {
                mT__48(); 

                }
                break;
            case 38 :
                // InternalHale.g:1:232: T__49
                {
                mT__49(); 

                }
                break;
            case 39 :
                // InternalHale.g:1:238: T__50
                {
                mT__50(); 

                }
                break;
            case 40 :
                // InternalHale.g:1:244: T__51
                {
                mT__51(); 

                }
                break;
            case 41 :
                // InternalHale.g:1:250: RULE_PRIMITIVE_TYPE
                {
                mRULE_PRIMITIVE_TYPE(); 

                }
                break;
            case 42 :
                // InternalHale.g:1:270: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 43 :
                // InternalHale.g:1:283: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 44 :
                // InternalHale.g:1:291: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 45 :
                // InternalHale.g:1:303: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 46 :
                // InternalHale.g:1:315: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 47 :
                // InternalHale.g:1:331: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 48 :
                // InternalHale.g:1:347: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\5\uffff\2\46\1\56\1\uffff\1\60\1\62\2\uffff\1\64\1\67\1\uffff\1\46\3\uffff\1\46\1\uffff\1\46\1\uffff\16\46\4\uffff\1\46\1\115\1\116\13\uffff\6\46\1\125\15\46\1\143\2\uffff\1\144\2\46\1\147\1\150\1\46\1\uffff\15\46\2\uffff\1\167\1\46\2\uffff\2\46\1\174\6\46\1\u0083\1\u0084\3\46\1\uffff\1\46\1\u0089\1\u008a\1\46\1\uffff\1\u008c\1\u008d\1\46\1\u0083\1\46\1\u0090\2\uffff\4\46\2\uffff\1\u0095\2\uffff\1\46\1\u0097\1\uffff\1\46\2\u0084\1\46\1\uffff\1\46\1\uffff\1\u0084\1\u009b\1\u009c\2\uffff";
    static final String DFA16_eofS =
        "\u009d\uffff";
    static final String DFA16_minS =
        "\1\11\4\uffff\1\156\1\162\1\75\1\uffff\2\75\2\uffff\2\52\1\uffff\1\157\3\uffff\1\157\1\uffff\1\165\1\uffff\1\145\1\165\1\146\1\162\1\154\1\150\1\162\1\141\1\145\1\150\2\157\1\165\1\164\4\uffff\1\144\2\60\13\uffff\1\164\1\151\1\156\2\164\1\160\1\60\1\151\1\163\1\151\1\145\1\156\1\154\1\164\1\162\1\165\1\151\1\157\1\155\1\162\1\60\2\uffff\1\60\1\144\1\143\2\60\1\165\1\uffff\1\156\1\145\1\154\1\141\1\143\1\163\1\165\1\157\1\145\1\144\1\154\1\142\1\151\2\uffff\1\60\1\164\2\uffff\2\164\1\60\1\145\1\153\1\164\1\145\1\162\1\167\2\60\2\145\1\156\1\uffff\1\151\2\60\1\146\1\uffff\2\60\1\151\1\60\1\156\1\60\2\uffff\1\141\1\162\1\147\1\157\2\uffff\1\60\2\uffff\1\157\1\60\1\uffff\1\156\2\60\1\156\1\uffff\1\156\1\uffff\3\60\2\uffff";
    static final String DFA16_maxS =
        "\1\175\4\uffff\1\163\1\162\1\75\1\uffff\2\75\2\uffff\1\52\1\57\1\uffff\1\157\3\uffff\1\157\1\uffff\1\165\1\uffff\1\145\1\165\1\156\1\162\1\154\1\150\1\162\1\165\1\145\1\162\2\157\1\165\1\164\4\uffff\1\144\2\172\13\uffff\1\164\1\151\1\156\2\164\1\160\1\172\1\151\1\163\1\151\1\145\1\156\1\154\1\164\1\162\1\165\1\151\1\157\1\155\1\162\1\172\2\uffff\1\172\1\144\1\143\2\172\1\165\1\uffff\1\156\1\145\1\154\1\141\1\143\1\163\1\165\1\157\1\145\1\144\1\154\1\142\1\151\2\uffff\1\172\1\164\2\uffff\2\164\1\172\1\145\1\153\1\164\1\145\1\162\1\167\2\172\2\145\1\156\1\uffff\1\151\2\172\1\146\1\uffff\2\172\1\151\1\172\1\156\1\172\2\uffff\1\141\1\162\1\147\1\157\2\uffff\1\172\2\uffff\1\157\1\172\1\uffff\1\156\2\172\1\156\1\uffff\1\156\1\uffff\3\172\2\uffff";
    static final String DFA16_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\3\uffff\1\10\2\uffff\1\15\1\16\2\uffff\1\21\1\uffff\1\25\1\26\1\27\1\uffff\1\31\1\uffff\1\33\16\uffff\1\53\1\54\1\55\1\60\3\uffff\1\7\1\36\1\11\1\12\1\13\1\14\1\22\1\17\1\56\1\57\1\20\25\uffff\1\23\1\6\6\uffff\1\41\15\uffff\1\5\1\24\2\uffff\1\34\1\35\16\uffff\1\30\4\uffff\1\42\6\uffff\1\52\1\51\4\uffff\1\37\1\40\1\uffff\1\44\1\45\2\uffff\1\50\4\uffff\1\43\1\uffff\1\47\3\uffff\1\32\1\46";
    static final String DFA16_specialS =
        "\u009d\uffff}>";
    static final String[] DFA16_transitionS = {
            "\2\51\2\uffff\1\51\22\uffff\1\51\1\10\1\50\2\uffff\1\17\1\uffff\1\50\1\21\1\23\1\15\1\13\1\22\1\14\1\4\1\16\12\47\1\25\1\1\1\11\1\7\1\12\1\27\1\uffff\1\46\1\43\3\46\1\26\7\46\1\44\4\46\1\45\2\46\1\42\4\46\3\uffff\2\46\1\uffff\1\5\1\36\2\46\1\34\1\37\2\46\1\32\2\46\1\30\1\31\1\20\1\6\1\33\1\46\1\40\1\46\1\41\1\46\1\24\1\35\3\46\1\2\1\uffff\1\3",
            "",
            "",
            "",
            "",
            "\1\52\4\uffff\1\53",
            "\1\54",
            "\1\55",
            "",
            "\1\57",
            "\1\61",
            "",
            "",
            "\1\63",
            "\1\65\4\uffff\1\66",
            "",
            "\1\70",
            "",
            "",
            "",
            "\1\71",
            "",
            "\1\72",
            "",
            "\1\73",
            "\1\74",
            "\1\76\7\uffff\1\75",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\104\23\uffff\1\103",
            "\1\105",
            "\1\106\11\uffff\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "",
            "",
            "",
            "",
            "\1\114",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
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
            "",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\145",
            "\1\146",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\151",
            "",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\170",
            "",
            "",
            "\1\171",
            "\1\172",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\10\46\1\173\21\46",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "",
            "\1\u0088",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u008b",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u008e",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u008f",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "\1\u0096",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\u0098",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0099",
            "",
            "\1\u009a",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | RULE_PRIMITIVE_TYPE | RULE_BOOLEAN | RULE_ID | RULE_DOUBLE | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS );";
        }
    }
 

}