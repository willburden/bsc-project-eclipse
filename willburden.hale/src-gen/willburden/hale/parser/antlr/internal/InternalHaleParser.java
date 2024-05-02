package willburden.hale.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import willburden.hale.services.HaleGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalHaleParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BOOLEAN", "RULE_DOUBLE", "RULE_STRING", "RULE_PRIMITIVE_TYPE", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "';'", "'{'", "'}'", "'.'", "'and'", "'or'", "'=='", "'!='", "'<='", "'<'", "'>='", "'>'", "'+'", "'-'", "'*'", "'/'", "'%'", "'**'", "'as'", "'not'", "'('", "','", "')'", "'void'", "':'", "'Function'", "'?'", "'let'", "'mut'", "'='", "'input'", "'print'", "'if'", "'else'", "'elseif'", "'while'", "'break'", "'function'", "'return'", "'throw'"
    };
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


        public InternalHaleParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalHaleParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalHaleParser.tokenNames; }
    public String getGrammarFileName() { return "InternalHale.g"; }



     	private HaleGrammarAccess grammarAccess;

        public InternalHaleParser(TokenStream input, HaleGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Hale";
       	}

       	@Override
       	protected HaleGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleHale"
    // InternalHale.g:64:1: entryRuleHale returns [EObject current=null] : iv_ruleHale= ruleHale EOF ;
    public final EObject entryRuleHale() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHale = null;


        try {
            // InternalHale.g:64:45: (iv_ruleHale= ruleHale EOF )
            // InternalHale.g:65:2: iv_ruleHale= ruleHale EOF
            {
             newCompositeNode(grammarAccess.getHaleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHale=ruleHale();

            state._fsp--;

             current =iv_ruleHale; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHale"


    // $ANTLR start "ruleHale"
    // InternalHale.g:71:1: ruleHale returns [EObject current=null] : ( () ( (lv_mainBlock_1_0= ruleBlock ) ) ) ;
    public final EObject ruleHale() throws RecognitionException {
        EObject current = null;

        EObject lv_mainBlock_1_0 = null;



        	enterRule();

        try {
            // InternalHale.g:77:2: ( ( () ( (lv_mainBlock_1_0= ruleBlock ) ) ) )
            // InternalHale.g:78:2: ( () ( (lv_mainBlock_1_0= ruleBlock ) ) )
            {
            // InternalHale.g:78:2: ( () ( (lv_mainBlock_1_0= ruleBlock ) ) )
            // InternalHale.g:79:3: () ( (lv_mainBlock_1_0= ruleBlock ) )
            {
            // InternalHale.g:79:3: ()
            // InternalHale.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHaleAccess().getHaleAction_0(),
            					current);
            			

            }

            // InternalHale.g:86:3: ( (lv_mainBlock_1_0= ruleBlock ) )
            // InternalHale.g:87:4: (lv_mainBlock_1_0= ruleBlock )
            {
            // InternalHale.g:87:4: (lv_mainBlock_1_0= ruleBlock )
            // InternalHale.g:88:5: lv_mainBlock_1_0= ruleBlock
            {

            					newCompositeNode(grammarAccess.getHaleAccess().getMainBlockBlockParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_mainBlock_1_0=ruleBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHaleRule());
            					}
            					set(
            						current,
            						"mainBlock",
            						lv_mainBlock_1_0,
            						"willburden.hale.Hale.Block");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHale"


    // $ANTLR start "entryRuleBlock"
    // InternalHale.g:109:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // InternalHale.g:109:46: (iv_ruleBlock= ruleBlock EOF )
            // InternalHale.g:110:2: iv_ruleBlock= ruleBlock EOF
            {
             newCompositeNode(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBlock=ruleBlock();

            state._fsp--;

             current =iv_ruleBlock; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // InternalHale.g:116:1: ruleBlock returns [EObject current=null] : ( () ( ( (lv_statements_1_0= ruleStatement ) ) | otherlv_2= ';' )* ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_statements_1_0 = null;



        	enterRule();

        try {
            // InternalHale.g:122:2: ( ( () ( ( (lv_statements_1_0= ruleStatement ) ) | otherlv_2= ';' )* ) )
            // InternalHale.g:123:2: ( () ( ( (lv_statements_1_0= ruleStatement ) ) | otherlv_2= ';' )* )
            {
            // InternalHale.g:123:2: ( () ( ( (lv_statements_1_0= ruleStatement ) ) | otherlv_2= ';' )* )
            // InternalHale.g:124:3: () ( ( (lv_statements_1_0= ruleStatement ) ) | otherlv_2= ';' )*
            {
            // InternalHale.g:124:3: ()
            // InternalHale.g:125:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBlockAccess().getBlockAction_0(),
            					current);
            			

            }

            // InternalHale.g:131:3: ( ( (lv_statements_1_0= ruleStatement ) ) | otherlv_2= ';' )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_BOOLEAN && LA1_0<=RULE_STRING)||LA1_0==RULE_ID||LA1_0==13||LA1_0==25||(LA1_0>=31 && LA1_0<=32)||LA1_0==35||LA1_0==39||(LA1_0>=42 && LA1_0<=44)||(LA1_0>=47 && LA1_0<=51)) ) {
                    alt1=1;
                }
                else if ( (LA1_0==12) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalHale.g:132:4: ( (lv_statements_1_0= ruleStatement ) )
            	    {
            	    // InternalHale.g:132:4: ( (lv_statements_1_0= ruleStatement ) )
            	    // InternalHale.g:133:5: (lv_statements_1_0= ruleStatement )
            	    {
            	    // InternalHale.g:133:5: (lv_statements_1_0= ruleStatement )
            	    // InternalHale.g:134:6: lv_statements_1_0= ruleStatement
            	    {

            	    						newCompositeNode(grammarAccess.getBlockAccess().getStatementsStatementParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_statements_1_0=ruleStatement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBlockRule());
            	    						}
            	    						add(
            	    							current,
            	    							"statements",
            	    							lv_statements_1_0,
            	    							"willburden.hale.Hale.Statement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalHale.g:152:4: otherlv_2= ';'
            	    {
            	    otherlv_2=(Token)match(input,12,FOLLOW_3); 

            	    				newLeafNode(otherlv_2, grammarAccess.getBlockAccess().getSemicolonKeyword_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleStatement"
    // InternalHale.g:161:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalHale.g:161:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalHale.g:162:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalHale.g:168:1: ruleStatement returns [EObject current=null] : (this_BracedBlock_0= ruleBracedBlock | this_Function_1= ruleFunction | this_If_2= ruleIf | this_While_3= ruleWhile | ( (this_Print_4= rulePrint | this_LetBinding_5= ruleLetBinding | this_Assignment_6= ruleAssignment | this_Break_7= ruleBreak | this_Return_8= ruleReturn | this_Throw_9= ruleThrow | this_Expression_10= ruleExpression ) otherlv_11= ';' ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_11=null;
        EObject this_BracedBlock_0 = null;

        EObject this_Function_1 = null;

        EObject this_If_2 = null;

        EObject this_While_3 = null;

        EObject this_Print_4 = null;

        EObject this_LetBinding_5 = null;

        EObject this_Assignment_6 = null;

        EObject this_Break_7 = null;

        EObject this_Return_8 = null;

        EObject this_Throw_9 = null;

        EObject this_Expression_10 = null;



        	enterRule();

        try {
            // InternalHale.g:174:2: ( (this_BracedBlock_0= ruleBracedBlock | this_Function_1= ruleFunction | this_If_2= ruleIf | this_While_3= ruleWhile | ( (this_Print_4= rulePrint | this_LetBinding_5= ruleLetBinding | this_Assignment_6= ruleAssignment | this_Break_7= ruleBreak | this_Return_8= ruleReturn | this_Throw_9= ruleThrow | this_Expression_10= ruleExpression ) otherlv_11= ';' ) ) )
            // InternalHale.g:175:2: (this_BracedBlock_0= ruleBracedBlock | this_Function_1= ruleFunction | this_If_2= ruleIf | this_While_3= ruleWhile | ( (this_Print_4= rulePrint | this_LetBinding_5= ruleLetBinding | this_Assignment_6= ruleAssignment | this_Break_7= ruleBreak | this_Return_8= ruleReturn | this_Throw_9= ruleThrow | this_Expression_10= ruleExpression ) otherlv_11= ';' ) )
            {
            // InternalHale.g:175:2: (this_BracedBlock_0= ruleBracedBlock | this_Function_1= ruleFunction | this_If_2= ruleIf | this_While_3= ruleWhile | ( (this_Print_4= rulePrint | this_LetBinding_5= ruleLetBinding | this_Assignment_6= ruleAssignment | this_Break_7= ruleBreak | this_Return_8= ruleReturn | this_Throw_9= ruleThrow | this_Expression_10= ruleExpression ) otherlv_11= ';' ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt3=1;
                }
                break;
            case 49:
                {
                alt3=2;
                }
                break;
            case 44:
                {
                alt3=3;
                }
                break;
            case 47:
                {
                alt3=4;
                }
                break;
            case RULE_BOOLEAN:
            case RULE_DOUBLE:
            case RULE_STRING:
            case RULE_ID:
            case 25:
            case 31:
            case 32:
            case 35:
            case 39:
            case 42:
            case 43:
            case 48:
            case 50:
            case 51:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalHale.g:176:3: this_BracedBlock_0= ruleBracedBlock
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getBracedBlockParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BracedBlock_0=ruleBracedBlock();

                    state._fsp--;


                    			current = this_BracedBlock_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalHale.g:185:3: this_Function_1= ruleFunction
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getFunctionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Function_1=ruleFunction();

                    state._fsp--;


                    			current = this_Function_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalHale.g:194:3: this_If_2= ruleIf
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getIfParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_If_2=ruleIf();

                    state._fsp--;


                    			current = this_If_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalHale.g:203:3: this_While_3= ruleWhile
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getWhileParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_While_3=ruleWhile();

                    state._fsp--;


                    			current = this_While_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalHale.g:212:3: ( (this_Print_4= rulePrint | this_LetBinding_5= ruleLetBinding | this_Assignment_6= ruleAssignment | this_Break_7= ruleBreak | this_Return_8= ruleReturn | this_Throw_9= ruleThrow | this_Expression_10= ruleExpression ) otherlv_11= ';' )
                    {
                    // InternalHale.g:212:3: ( (this_Print_4= rulePrint | this_LetBinding_5= ruleLetBinding | this_Assignment_6= ruleAssignment | this_Break_7= ruleBreak | this_Return_8= ruleReturn | this_Throw_9= ruleThrow | this_Expression_10= ruleExpression ) otherlv_11= ';' )
                    // InternalHale.g:213:4: (this_Print_4= rulePrint | this_LetBinding_5= ruleLetBinding | this_Assignment_6= ruleAssignment | this_Break_7= ruleBreak | this_Return_8= ruleReturn | this_Throw_9= ruleThrow | this_Expression_10= ruleExpression ) otherlv_11= ';'
                    {
                    // InternalHale.g:213:4: (this_Print_4= rulePrint | this_LetBinding_5= ruleLetBinding | this_Assignment_6= ruleAssignment | this_Break_7= ruleBreak | this_Return_8= ruleReturn | this_Throw_9= ruleThrow | this_Expression_10= ruleExpression )
                    int alt2=7;
                    switch ( input.LA(1) ) {
                    case 43:
                        {
                        alt2=1;
                        }
                        break;
                    case 39:
                        {
                        alt2=2;
                        }
                        break;
                    case RULE_ID:
                        {
                        int LA2_3 = input.LA(2);

                        if ( (LA2_3==12||(LA2_3>=15 && LA2_3<=30)||LA2_3==32) ) {
                            alt2=7;
                        }
                        else if ( (LA2_3==41) ) {
                            alt2=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 3, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 48:
                        {
                        alt2=4;
                        }
                        break;
                    case 50:
                        {
                        alt2=5;
                        }
                        break;
                    case 51:
                        {
                        alt2=6;
                        }
                        break;
                    case RULE_BOOLEAN:
                    case RULE_DOUBLE:
                    case RULE_STRING:
                    case 25:
                    case 31:
                    case 32:
                    case 35:
                    case 42:
                        {
                        alt2=7;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 0, input);

                        throw nvae;
                    }

                    switch (alt2) {
                        case 1 :
                            // InternalHale.g:214:5: this_Print_4= rulePrint
                            {

                            					newCompositeNode(grammarAccess.getStatementAccess().getPrintParserRuleCall_4_0_0());
                            				
                            pushFollow(FOLLOW_4);
                            this_Print_4=rulePrint();

                            state._fsp--;


                            					current = this_Print_4;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;
                        case 2 :
                            // InternalHale.g:223:5: this_LetBinding_5= ruleLetBinding
                            {

                            					newCompositeNode(grammarAccess.getStatementAccess().getLetBindingParserRuleCall_4_0_1());
                            				
                            pushFollow(FOLLOW_4);
                            this_LetBinding_5=ruleLetBinding();

                            state._fsp--;


                            					current = this_LetBinding_5;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;
                        case 3 :
                            // InternalHale.g:232:5: this_Assignment_6= ruleAssignment
                            {

                            					newCompositeNode(grammarAccess.getStatementAccess().getAssignmentParserRuleCall_4_0_2());
                            				
                            pushFollow(FOLLOW_4);
                            this_Assignment_6=ruleAssignment();

                            state._fsp--;


                            					current = this_Assignment_6;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;
                        case 4 :
                            // InternalHale.g:241:5: this_Break_7= ruleBreak
                            {

                            					newCompositeNode(grammarAccess.getStatementAccess().getBreakParserRuleCall_4_0_3());
                            				
                            pushFollow(FOLLOW_4);
                            this_Break_7=ruleBreak();

                            state._fsp--;


                            					current = this_Break_7;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;
                        case 5 :
                            // InternalHale.g:250:5: this_Return_8= ruleReturn
                            {

                            					newCompositeNode(grammarAccess.getStatementAccess().getReturnParserRuleCall_4_0_4());
                            				
                            pushFollow(FOLLOW_4);
                            this_Return_8=ruleReturn();

                            state._fsp--;


                            					current = this_Return_8;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;
                        case 6 :
                            // InternalHale.g:259:5: this_Throw_9= ruleThrow
                            {

                            					newCompositeNode(grammarAccess.getStatementAccess().getThrowParserRuleCall_4_0_5());
                            				
                            pushFollow(FOLLOW_4);
                            this_Throw_9=ruleThrow();

                            state._fsp--;


                            					current = this_Throw_9;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;
                        case 7 :
                            // InternalHale.g:268:5: this_Expression_10= ruleExpression
                            {

                            					newCompositeNode(grammarAccess.getStatementAccess().getExpressionParserRuleCall_4_0_6());
                            				
                            pushFollow(FOLLOW_4);
                            this_Expression_10=ruleExpression();

                            state._fsp--;


                            					current = this_Expression_10;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;

                    }

                    otherlv_11=(Token)match(input,12,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getStatementAccess().getSemicolonKeyword_4_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleBracedBlock"
    // InternalHale.g:286:1: entryRuleBracedBlock returns [EObject current=null] : iv_ruleBracedBlock= ruleBracedBlock EOF ;
    public final EObject entryRuleBracedBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBracedBlock = null;


        try {
            // InternalHale.g:286:52: (iv_ruleBracedBlock= ruleBracedBlock EOF )
            // InternalHale.g:287:2: iv_ruleBracedBlock= ruleBracedBlock EOF
            {
             newCompositeNode(grammarAccess.getBracedBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBracedBlock=ruleBracedBlock();

            state._fsp--;

             current =iv_ruleBracedBlock; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBracedBlock"


    // $ANTLR start "ruleBracedBlock"
    // InternalHale.g:293:1: ruleBracedBlock returns [EObject current=null] : (otherlv_0= '{' this_Block_1= ruleBlock otherlv_2= '}' ) ;
    public final EObject ruleBracedBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Block_1 = null;



        	enterRule();

        try {
            // InternalHale.g:299:2: ( (otherlv_0= '{' this_Block_1= ruleBlock otherlv_2= '}' ) )
            // InternalHale.g:300:2: (otherlv_0= '{' this_Block_1= ruleBlock otherlv_2= '}' )
            {
            // InternalHale.g:300:2: (otherlv_0= '{' this_Block_1= ruleBlock otherlv_2= '}' )
            // InternalHale.g:301:3: otherlv_0= '{' this_Block_1= ruleBlock otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getBracedBlockAccess().getLeftCurlyBracketKeyword_0());
            		

            			newCompositeNode(grammarAccess.getBracedBlockAccess().getBlockParserRuleCall_1());
            		
            pushFollow(FOLLOW_6);
            this_Block_1=ruleBlock();

            state._fsp--;


            			current = this_Block_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getBracedBlockAccess().getRightCurlyBracketKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBracedBlock"


    // $ANTLR start "entryRuleExpression"
    // InternalHale.g:321:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalHale.g:321:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalHale.g:322:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalHale.g:328:1: ruleExpression returns [EObject current=null] : this_Expression10_0= ruleExpression10 ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Expression10_0 = null;



        	enterRule();

        try {
            // InternalHale.g:334:2: (this_Expression10_0= ruleExpression10 )
            // InternalHale.g:335:2: this_Expression10_0= ruleExpression10
            {

            		newCompositeNode(grammarAccess.getExpressionAccess().getExpression10ParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Expression10_0=ruleExpression10();

            state._fsp--;


            		current = this_Expression10_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleExpression10"
    // InternalHale.g:346:1: entryRuleExpression10 returns [EObject current=null] : iv_ruleExpression10= ruleExpression10 EOF ;
    public final EObject entryRuleExpression10() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression10 = null;


        try {
            // InternalHale.g:346:53: (iv_ruleExpression10= ruleExpression10 EOF )
            // InternalHale.g:347:2: iv_ruleExpression10= ruleExpression10 EOF
            {
             newCompositeNode(grammarAccess.getExpression10Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression10=ruleExpression10();

            state._fsp--;

             current =iv_ruleExpression10; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression10"


    // $ANTLR start "ruleExpression10"
    // InternalHale.g:353:1: ruleExpression10 returns [EObject current=null] : (this_Expression9_0= ruleExpression9 ( () otherlv_2= '.' ( (lv_right_3_0= ruleExpression9 ) ) )* ) ;
    public final EObject ruleExpression10() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Expression9_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalHale.g:359:2: ( (this_Expression9_0= ruleExpression9 ( () otherlv_2= '.' ( (lv_right_3_0= ruleExpression9 ) ) )* ) )
            // InternalHale.g:360:2: (this_Expression9_0= ruleExpression9 ( () otherlv_2= '.' ( (lv_right_3_0= ruleExpression9 ) ) )* )
            {
            // InternalHale.g:360:2: (this_Expression9_0= ruleExpression9 ( () otherlv_2= '.' ( (lv_right_3_0= ruleExpression9 ) ) )* )
            // InternalHale.g:361:3: this_Expression9_0= ruleExpression9 ( () otherlv_2= '.' ( (lv_right_3_0= ruleExpression9 ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpression10Access().getExpression9ParserRuleCall_0());
            		
            pushFollow(FOLLOW_7);
            this_Expression9_0=ruleExpression9();

            state._fsp--;


            			current = this_Expression9_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHale.g:369:3: ( () otherlv_2= '.' ( (lv_right_3_0= ruleExpression9 ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalHale.g:370:4: () otherlv_2= '.' ( (lv_right_3_0= ruleExpression9 ) )
            	    {
            	    // InternalHale.g:370:4: ()
            	    // InternalHale.g:371:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getExpression10Access().getConcatenationLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,15,FOLLOW_8); 

            	    				newLeafNode(otherlv_2, grammarAccess.getExpression10Access().getFullStopKeyword_1_1());
            	    			
            	    // InternalHale.g:381:4: ( (lv_right_3_0= ruleExpression9 ) )
            	    // InternalHale.g:382:5: (lv_right_3_0= ruleExpression9 )
            	    {
            	    // InternalHale.g:382:5: (lv_right_3_0= ruleExpression9 )
            	    // InternalHale.g:383:6: lv_right_3_0= ruleExpression9
            	    {

            	    						newCompositeNode(grammarAccess.getExpression10Access().getRightExpression9ParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_right_3_0=ruleExpression9();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpression10Rule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"willburden.hale.Hale.Expression9");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression10"


    // $ANTLR start "entryRuleExpression9"
    // InternalHale.g:405:1: entryRuleExpression9 returns [EObject current=null] : iv_ruleExpression9= ruleExpression9 EOF ;
    public final EObject entryRuleExpression9() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression9 = null;


        try {
            // InternalHale.g:405:52: (iv_ruleExpression9= ruleExpression9 EOF )
            // InternalHale.g:406:2: iv_ruleExpression9= ruleExpression9 EOF
            {
             newCompositeNode(grammarAccess.getExpression9Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression9=ruleExpression9();

            state._fsp--;

             current =iv_ruleExpression9; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression9"


    // $ANTLR start "ruleExpression9"
    // InternalHale.g:412:1: ruleExpression9 returns [EObject current=null] : (this_Expression8_0= ruleExpression8 ( ( () otherlv_2= 'and' ( (lv_right_3_0= ruleExpression8 ) ) ) | ( () otherlv_5= 'or' ( (lv_right_6_0= ruleExpression8 ) ) ) )* ) ;
    public final EObject ruleExpression9() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_Expression8_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalHale.g:418:2: ( (this_Expression8_0= ruleExpression8 ( ( () otherlv_2= 'and' ( (lv_right_3_0= ruleExpression8 ) ) ) | ( () otherlv_5= 'or' ( (lv_right_6_0= ruleExpression8 ) ) ) )* ) )
            // InternalHale.g:419:2: (this_Expression8_0= ruleExpression8 ( ( () otherlv_2= 'and' ( (lv_right_3_0= ruleExpression8 ) ) ) | ( () otherlv_5= 'or' ( (lv_right_6_0= ruleExpression8 ) ) ) )* )
            {
            // InternalHale.g:419:2: (this_Expression8_0= ruleExpression8 ( ( () otherlv_2= 'and' ( (lv_right_3_0= ruleExpression8 ) ) ) | ( () otherlv_5= 'or' ( (lv_right_6_0= ruleExpression8 ) ) ) )* )
            // InternalHale.g:420:3: this_Expression8_0= ruleExpression8 ( ( () otherlv_2= 'and' ( (lv_right_3_0= ruleExpression8 ) ) ) | ( () otherlv_5= 'or' ( (lv_right_6_0= ruleExpression8 ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpression9Access().getExpression8ParserRuleCall_0());
            		
            pushFollow(FOLLOW_9);
            this_Expression8_0=ruleExpression8();

            state._fsp--;


            			current = this_Expression8_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHale.g:428:3: ( ( () otherlv_2= 'and' ( (lv_right_3_0= ruleExpression8 ) ) ) | ( () otherlv_5= 'or' ( (lv_right_6_0= ruleExpression8 ) ) ) )*
            loop5:
            do {
                int alt5=3;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }
                else if ( (LA5_0==17) ) {
                    alt5=2;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalHale.g:429:4: ( () otherlv_2= 'and' ( (lv_right_3_0= ruleExpression8 ) ) )
            	    {
            	    // InternalHale.g:429:4: ( () otherlv_2= 'and' ( (lv_right_3_0= ruleExpression8 ) ) )
            	    // InternalHale.g:430:5: () otherlv_2= 'and' ( (lv_right_3_0= ruleExpression8 ) )
            	    {
            	    // InternalHale.g:430:5: ()
            	    // InternalHale.g:431:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpression9Access().getLogicalAndLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,16,FOLLOW_8); 

            	    					newLeafNode(otherlv_2, grammarAccess.getExpression9Access().getAndKeyword_1_0_1());
            	    				
            	    // InternalHale.g:441:5: ( (lv_right_3_0= ruleExpression8 ) )
            	    // InternalHale.g:442:6: (lv_right_3_0= ruleExpression8 )
            	    {
            	    // InternalHale.g:442:6: (lv_right_3_0= ruleExpression8 )
            	    // InternalHale.g:443:7: lv_right_3_0= ruleExpression8
            	    {

            	    							newCompositeNode(grammarAccess.getExpression9Access().getRightExpression8ParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_9);
            	    lv_right_3_0=ruleExpression8();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getExpression9Rule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_3_0,
            	    								"willburden.hale.Hale.Expression8");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalHale.g:462:4: ( () otherlv_5= 'or' ( (lv_right_6_0= ruleExpression8 ) ) )
            	    {
            	    // InternalHale.g:462:4: ( () otherlv_5= 'or' ( (lv_right_6_0= ruleExpression8 ) ) )
            	    // InternalHale.g:463:5: () otherlv_5= 'or' ( (lv_right_6_0= ruleExpression8 ) )
            	    {
            	    // InternalHale.g:463:5: ()
            	    // InternalHale.g:464:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpression9Access().getLogicalOrLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,17,FOLLOW_8); 

            	    					newLeafNode(otherlv_5, grammarAccess.getExpression9Access().getOrKeyword_1_1_1());
            	    				
            	    // InternalHale.g:474:5: ( (lv_right_6_0= ruleExpression8 ) )
            	    // InternalHale.g:475:6: (lv_right_6_0= ruleExpression8 )
            	    {
            	    // InternalHale.g:475:6: (lv_right_6_0= ruleExpression8 )
            	    // InternalHale.g:476:7: lv_right_6_0= ruleExpression8
            	    {

            	    							newCompositeNode(grammarAccess.getExpression9Access().getRightExpression8ParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_9);
            	    lv_right_6_0=ruleExpression8();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getExpression9Rule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_6_0,
            	    								"willburden.hale.Hale.Expression8");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression9"


    // $ANTLR start "entryRuleExpression8"
    // InternalHale.g:499:1: entryRuleExpression8 returns [EObject current=null] : iv_ruleExpression8= ruleExpression8 EOF ;
    public final EObject entryRuleExpression8() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression8 = null;


        try {
            // InternalHale.g:499:52: (iv_ruleExpression8= ruleExpression8 EOF )
            // InternalHale.g:500:2: iv_ruleExpression8= ruleExpression8 EOF
            {
             newCompositeNode(grammarAccess.getExpression8Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression8=ruleExpression8();

            state._fsp--;

             current =iv_ruleExpression8; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression8"


    // $ANTLR start "ruleExpression8"
    // InternalHale.g:506:1: ruleExpression8 returns [EObject current=null] : (this_Expression7_0= ruleExpression7 ( ( () otherlv_2= '==' ( (lv_right_3_0= ruleExpression7 ) ) ) | ( () otherlv_5= '!=' ( (lv_right_6_0= ruleExpression7 ) ) ) )* ) ;
    public final EObject ruleExpression8() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_Expression7_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalHale.g:512:2: ( (this_Expression7_0= ruleExpression7 ( ( () otherlv_2= '==' ( (lv_right_3_0= ruleExpression7 ) ) ) | ( () otherlv_5= '!=' ( (lv_right_6_0= ruleExpression7 ) ) ) )* ) )
            // InternalHale.g:513:2: (this_Expression7_0= ruleExpression7 ( ( () otherlv_2= '==' ( (lv_right_3_0= ruleExpression7 ) ) ) | ( () otherlv_5= '!=' ( (lv_right_6_0= ruleExpression7 ) ) ) )* )
            {
            // InternalHale.g:513:2: (this_Expression7_0= ruleExpression7 ( ( () otherlv_2= '==' ( (lv_right_3_0= ruleExpression7 ) ) ) | ( () otherlv_5= '!=' ( (lv_right_6_0= ruleExpression7 ) ) ) )* )
            // InternalHale.g:514:3: this_Expression7_0= ruleExpression7 ( ( () otherlv_2= '==' ( (lv_right_3_0= ruleExpression7 ) ) ) | ( () otherlv_5= '!=' ( (lv_right_6_0= ruleExpression7 ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpression8Access().getExpression7ParserRuleCall_0());
            		
            pushFollow(FOLLOW_10);
            this_Expression7_0=ruleExpression7();

            state._fsp--;


            			current = this_Expression7_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHale.g:522:3: ( ( () otherlv_2= '==' ( (lv_right_3_0= ruleExpression7 ) ) ) | ( () otherlv_5= '!=' ( (lv_right_6_0= ruleExpression7 ) ) ) )*
            loop6:
            do {
                int alt6=3;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }
                else if ( (LA6_0==19) ) {
                    alt6=2;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalHale.g:523:4: ( () otherlv_2= '==' ( (lv_right_3_0= ruleExpression7 ) ) )
            	    {
            	    // InternalHale.g:523:4: ( () otherlv_2= '==' ( (lv_right_3_0= ruleExpression7 ) ) )
            	    // InternalHale.g:524:5: () otherlv_2= '==' ( (lv_right_3_0= ruleExpression7 ) )
            	    {
            	    // InternalHale.g:524:5: ()
            	    // InternalHale.g:525:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpression8Access().getEqualityLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,18,FOLLOW_8); 

            	    					newLeafNode(otherlv_2, grammarAccess.getExpression8Access().getEqualsSignEqualsSignKeyword_1_0_1());
            	    				
            	    // InternalHale.g:535:5: ( (lv_right_3_0= ruleExpression7 ) )
            	    // InternalHale.g:536:6: (lv_right_3_0= ruleExpression7 )
            	    {
            	    // InternalHale.g:536:6: (lv_right_3_0= ruleExpression7 )
            	    // InternalHale.g:537:7: lv_right_3_0= ruleExpression7
            	    {

            	    							newCompositeNode(grammarAccess.getExpression8Access().getRightExpression7ParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_10);
            	    lv_right_3_0=ruleExpression7();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getExpression8Rule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_3_0,
            	    								"willburden.hale.Hale.Expression7");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalHale.g:556:4: ( () otherlv_5= '!=' ( (lv_right_6_0= ruleExpression7 ) ) )
            	    {
            	    // InternalHale.g:556:4: ( () otherlv_5= '!=' ( (lv_right_6_0= ruleExpression7 ) ) )
            	    // InternalHale.g:557:5: () otherlv_5= '!=' ( (lv_right_6_0= ruleExpression7 ) )
            	    {
            	    // InternalHale.g:557:5: ()
            	    // InternalHale.g:558:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpression8Access().getInequalityLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,19,FOLLOW_8); 

            	    					newLeafNode(otherlv_5, grammarAccess.getExpression8Access().getExclamationMarkEqualsSignKeyword_1_1_1());
            	    				
            	    // InternalHale.g:568:5: ( (lv_right_6_0= ruleExpression7 ) )
            	    // InternalHale.g:569:6: (lv_right_6_0= ruleExpression7 )
            	    {
            	    // InternalHale.g:569:6: (lv_right_6_0= ruleExpression7 )
            	    // InternalHale.g:570:7: lv_right_6_0= ruleExpression7
            	    {

            	    							newCompositeNode(grammarAccess.getExpression8Access().getRightExpression7ParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_10);
            	    lv_right_6_0=ruleExpression7();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getExpression8Rule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_6_0,
            	    								"willburden.hale.Hale.Expression7");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression8"


    // $ANTLR start "entryRuleExpression7"
    // InternalHale.g:593:1: entryRuleExpression7 returns [EObject current=null] : iv_ruleExpression7= ruleExpression7 EOF ;
    public final EObject entryRuleExpression7() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression7 = null;


        try {
            // InternalHale.g:593:52: (iv_ruleExpression7= ruleExpression7 EOF )
            // InternalHale.g:594:2: iv_ruleExpression7= ruleExpression7 EOF
            {
             newCompositeNode(grammarAccess.getExpression7Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression7=ruleExpression7();

            state._fsp--;

             current =iv_ruleExpression7; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression7"


    // $ANTLR start "ruleExpression7"
    // InternalHale.g:600:1: ruleExpression7 returns [EObject current=null] : (this_Expression6_0= ruleExpression6 ( ( () otherlv_2= '<=' ( (lv_right_3_0= ruleExpression6 ) ) ) | ( () otherlv_5= '<' ( (lv_right_6_0= ruleExpression6 ) ) ) | ( () otherlv_8= '>=' ( (lv_right_9_0= ruleExpression6 ) ) ) | ( () otherlv_11= '>' ( (lv_right_12_0= ruleExpression6 ) ) ) )* ) ;
    public final EObject ruleExpression7() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        EObject this_Expression6_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;

        EObject lv_right_9_0 = null;

        EObject lv_right_12_0 = null;



        	enterRule();

        try {
            // InternalHale.g:606:2: ( (this_Expression6_0= ruleExpression6 ( ( () otherlv_2= '<=' ( (lv_right_3_0= ruleExpression6 ) ) ) | ( () otherlv_5= '<' ( (lv_right_6_0= ruleExpression6 ) ) ) | ( () otherlv_8= '>=' ( (lv_right_9_0= ruleExpression6 ) ) ) | ( () otherlv_11= '>' ( (lv_right_12_0= ruleExpression6 ) ) ) )* ) )
            // InternalHale.g:607:2: (this_Expression6_0= ruleExpression6 ( ( () otherlv_2= '<=' ( (lv_right_3_0= ruleExpression6 ) ) ) | ( () otherlv_5= '<' ( (lv_right_6_0= ruleExpression6 ) ) ) | ( () otherlv_8= '>=' ( (lv_right_9_0= ruleExpression6 ) ) ) | ( () otherlv_11= '>' ( (lv_right_12_0= ruleExpression6 ) ) ) )* )
            {
            // InternalHale.g:607:2: (this_Expression6_0= ruleExpression6 ( ( () otherlv_2= '<=' ( (lv_right_3_0= ruleExpression6 ) ) ) | ( () otherlv_5= '<' ( (lv_right_6_0= ruleExpression6 ) ) ) | ( () otherlv_8= '>=' ( (lv_right_9_0= ruleExpression6 ) ) ) | ( () otherlv_11= '>' ( (lv_right_12_0= ruleExpression6 ) ) ) )* )
            // InternalHale.g:608:3: this_Expression6_0= ruleExpression6 ( ( () otherlv_2= '<=' ( (lv_right_3_0= ruleExpression6 ) ) ) | ( () otherlv_5= '<' ( (lv_right_6_0= ruleExpression6 ) ) ) | ( () otherlv_8= '>=' ( (lv_right_9_0= ruleExpression6 ) ) ) | ( () otherlv_11= '>' ( (lv_right_12_0= ruleExpression6 ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpression7Access().getExpression6ParserRuleCall_0());
            		
            pushFollow(FOLLOW_11);
            this_Expression6_0=ruleExpression6();

            state._fsp--;


            			current = this_Expression6_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHale.g:616:3: ( ( () otherlv_2= '<=' ( (lv_right_3_0= ruleExpression6 ) ) ) | ( () otherlv_5= '<' ( (lv_right_6_0= ruleExpression6 ) ) ) | ( () otherlv_8= '>=' ( (lv_right_9_0= ruleExpression6 ) ) ) | ( () otherlv_11= '>' ( (lv_right_12_0= ruleExpression6 ) ) ) )*
            loop7:
            do {
                int alt7=5;
                switch ( input.LA(1) ) {
                case 20:
                    {
                    alt7=1;
                    }
                    break;
                case 21:
                    {
                    alt7=2;
                    }
                    break;
                case 22:
                    {
                    alt7=3;
                    }
                    break;
                case 23:
                    {
                    alt7=4;
                    }
                    break;

                }

                switch (alt7) {
            	case 1 :
            	    // InternalHale.g:617:4: ( () otherlv_2= '<=' ( (lv_right_3_0= ruleExpression6 ) ) )
            	    {
            	    // InternalHale.g:617:4: ( () otherlv_2= '<=' ( (lv_right_3_0= ruleExpression6 ) ) )
            	    // InternalHale.g:618:5: () otherlv_2= '<=' ( (lv_right_3_0= ruleExpression6 ) )
            	    {
            	    // InternalHale.g:618:5: ()
            	    // InternalHale.g:619:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpression7Access().getLessThanOrEqualLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,20,FOLLOW_8); 

            	    					newLeafNode(otherlv_2, grammarAccess.getExpression7Access().getLessThanSignEqualsSignKeyword_1_0_1());
            	    				
            	    // InternalHale.g:629:5: ( (lv_right_3_0= ruleExpression6 ) )
            	    // InternalHale.g:630:6: (lv_right_3_0= ruleExpression6 )
            	    {
            	    // InternalHale.g:630:6: (lv_right_3_0= ruleExpression6 )
            	    // InternalHale.g:631:7: lv_right_3_0= ruleExpression6
            	    {

            	    							newCompositeNode(grammarAccess.getExpression7Access().getRightExpression6ParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_11);
            	    lv_right_3_0=ruleExpression6();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getExpression7Rule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_3_0,
            	    								"willburden.hale.Hale.Expression6");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalHale.g:650:4: ( () otherlv_5= '<' ( (lv_right_6_0= ruleExpression6 ) ) )
            	    {
            	    // InternalHale.g:650:4: ( () otherlv_5= '<' ( (lv_right_6_0= ruleExpression6 ) ) )
            	    // InternalHale.g:651:5: () otherlv_5= '<' ( (lv_right_6_0= ruleExpression6 ) )
            	    {
            	    // InternalHale.g:651:5: ()
            	    // InternalHale.g:652:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpression7Access().getLessThanLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,21,FOLLOW_8); 

            	    					newLeafNode(otherlv_5, grammarAccess.getExpression7Access().getLessThanSignKeyword_1_1_1());
            	    				
            	    // InternalHale.g:662:5: ( (lv_right_6_0= ruleExpression6 ) )
            	    // InternalHale.g:663:6: (lv_right_6_0= ruleExpression6 )
            	    {
            	    // InternalHale.g:663:6: (lv_right_6_0= ruleExpression6 )
            	    // InternalHale.g:664:7: lv_right_6_0= ruleExpression6
            	    {

            	    							newCompositeNode(grammarAccess.getExpression7Access().getRightExpression6ParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_11);
            	    lv_right_6_0=ruleExpression6();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getExpression7Rule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_6_0,
            	    								"willburden.hale.Hale.Expression6");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalHale.g:683:4: ( () otherlv_8= '>=' ( (lv_right_9_0= ruleExpression6 ) ) )
            	    {
            	    // InternalHale.g:683:4: ( () otherlv_8= '>=' ( (lv_right_9_0= ruleExpression6 ) ) )
            	    // InternalHale.g:684:5: () otherlv_8= '>=' ( (lv_right_9_0= ruleExpression6 ) )
            	    {
            	    // InternalHale.g:684:5: ()
            	    // InternalHale.g:685:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpression7Access().getGreaterThanOrEqualLeftAction_1_2_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_8=(Token)match(input,22,FOLLOW_8); 

            	    					newLeafNode(otherlv_8, grammarAccess.getExpression7Access().getGreaterThanSignEqualsSignKeyword_1_2_1());
            	    				
            	    // InternalHale.g:695:5: ( (lv_right_9_0= ruleExpression6 ) )
            	    // InternalHale.g:696:6: (lv_right_9_0= ruleExpression6 )
            	    {
            	    // InternalHale.g:696:6: (lv_right_9_0= ruleExpression6 )
            	    // InternalHale.g:697:7: lv_right_9_0= ruleExpression6
            	    {

            	    							newCompositeNode(grammarAccess.getExpression7Access().getRightExpression6ParserRuleCall_1_2_2_0());
            	    						
            	    pushFollow(FOLLOW_11);
            	    lv_right_9_0=ruleExpression6();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getExpression7Rule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_9_0,
            	    								"willburden.hale.Hale.Expression6");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalHale.g:716:4: ( () otherlv_11= '>' ( (lv_right_12_0= ruleExpression6 ) ) )
            	    {
            	    // InternalHale.g:716:4: ( () otherlv_11= '>' ( (lv_right_12_0= ruleExpression6 ) ) )
            	    // InternalHale.g:717:5: () otherlv_11= '>' ( (lv_right_12_0= ruleExpression6 ) )
            	    {
            	    // InternalHale.g:717:5: ()
            	    // InternalHale.g:718:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpression7Access().getGreaterThanLeftAction_1_3_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_11=(Token)match(input,23,FOLLOW_8); 

            	    					newLeafNode(otherlv_11, grammarAccess.getExpression7Access().getGreaterThanSignKeyword_1_3_1());
            	    				
            	    // InternalHale.g:728:5: ( (lv_right_12_0= ruleExpression6 ) )
            	    // InternalHale.g:729:6: (lv_right_12_0= ruleExpression6 )
            	    {
            	    // InternalHale.g:729:6: (lv_right_12_0= ruleExpression6 )
            	    // InternalHale.g:730:7: lv_right_12_0= ruleExpression6
            	    {

            	    							newCompositeNode(grammarAccess.getExpression7Access().getRightExpression6ParserRuleCall_1_3_2_0());
            	    						
            	    pushFollow(FOLLOW_11);
            	    lv_right_12_0=ruleExpression6();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getExpression7Rule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_12_0,
            	    								"willburden.hale.Hale.Expression6");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression7"


    // $ANTLR start "entryRuleExpression6"
    // InternalHale.g:753:1: entryRuleExpression6 returns [EObject current=null] : iv_ruleExpression6= ruleExpression6 EOF ;
    public final EObject entryRuleExpression6() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression6 = null;


        try {
            // InternalHale.g:753:52: (iv_ruleExpression6= ruleExpression6 EOF )
            // InternalHale.g:754:2: iv_ruleExpression6= ruleExpression6 EOF
            {
             newCompositeNode(grammarAccess.getExpression6Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression6=ruleExpression6();

            state._fsp--;

             current =iv_ruleExpression6; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression6"


    // $ANTLR start "ruleExpression6"
    // InternalHale.g:760:1: ruleExpression6 returns [EObject current=null] : (this_Expression5_0= ruleExpression5 ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpression5 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpression5 ) ) ) )* ) ;
    public final EObject ruleExpression6() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_Expression5_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalHale.g:766:2: ( (this_Expression5_0= ruleExpression5 ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpression5 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpression5 ) ) ) )* ) )
            // InternalHale.g:767:2: (this_Expression5_0= ruleExpression5 ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpression5 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpression5 ) ) ) )* )
            {
            // InternalHale.g:767:2: (this_Expression5_0= ruleExpression5 ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpression5 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpression5 ) ) ) )* )
            // InternalHale.g:768:3: this_Expression5_0= ruleExpression5 ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpression5 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpression5 ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpression6Access().getExpression5ParserRuleCall_0());
            		
            pushFollow(FOLLOW_12);
            this_Expression5_0=ruleExpression5();

            state._fsp--;


            			current = this_Expression5_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHale.g:776:3: ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpression5 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpression5 ) ) ) )*
            loop8:
            do {
                int alt8=3;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==24) ) {
                    alt8=1;
                }
                else if ( (LA8_0==25) ) {
                    alt8=2;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalHale.g:777:4: ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpression5 ) ) )
            	    {
            	    // InternalHale.g:777:4: ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpression5 ) ) )
            	    // InternalHale.g:778:5: () otherlv_2= '+' ( (lv_right_3_0= ruleExpression5 ) )
            	    {
            	    // InternalHale.g:778:5: ()
            	    // InternalHale.g:779:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpression6Access().getAdditionLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,24,FOLLOW_8); 

            	    					newLeafNode(otherlv_2, grammarAccess.getExpression6Access().getPlusSignKeyword_1_0_1());
            	    				
            	    // InternalHale.g:789:5: ( (lv_right_3_0= ruleExpression5 ) )
            	    // InternalHale.g:790:6: (lv_right_3_0= ruleExpression5 )
            	    {
            	    // InternalHale.g:790:6: (lv_right_3_0= ruleExpression5 )
            	    // InternalHale.g:791:7: lv_right_3_0= ruleExpression5
            	    {

            	    							newCompositeNode(grammarAccess.getExpression6Access().getRightExpression5ParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_12);
            	    lv_right_3_0=ruleExpression5();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getExpression6Rule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_3_0,
            	    								"willburden.hale.Hale.Expression5");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalHale.g:810:4: ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpression5 ) ) )
            	    {
            	    // InternalHale.g:810:4: ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpression5 ) ) )
            	    // InternalHale.g:811:5: () otherlv_5= '-' ( (lv_right_6_0= ruleExpression5 ) )
            	    {
            	    // InternalHale.g:811:5: ()
            	    // InternalHale.g:812:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpression6Access().getSubtractionLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,25,FOLLOW_8); 

            	    					newLeafNode(otherlv_5, grammarAccess.getExpression6Access().getHyphenMinusKeyword_1_1_1());
            	    				
            	    // InternalHale.g:822:5: ( (lv_right_6_0= ruleExpression5 ) )
            	    // InternalHale.g:823:6: (lv_right_6_0= ruleExpression5 )
            	    {
            	    // InternalHale.g:823:6: (lv_right_6_0= ruleExpression5 )
            	    // InternalHale.g:824:7: lv_right_6_0= ruleExpression5
            	    {

            	    							newCompositeNode(grammarAccess.getExpression6Access().getRightExpression5ParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_12);
            	    lv_right_6_0=ruleExpression5();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getExpression6Rule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_6_0,
            	    								"willburden.hale.Hale.Expression5");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression6"


    // $ANTLR start "entryRuleExpression5"
    // InternalHale.g:847:1: entryRuleExpression5 returns [EObject current=null] : iv_ruleExpression5= ruleExpression5 EOF ;
    public final EObject entryRuleExpression5() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression5 = null;


        try {
            // InternalHale.g:847:52: (iv_ruleExpression5= ruleExpression5 EOF )
            // InternalHale.g:848:2: iv_ruleExpression5= ruleExpression5 EOF
            {
             newCompositeNode(grammarAccess.getExpression5Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression5=ruleExpression5();

            state._fsp--;

             current =iv_ruleExpression5; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression5"


    // $ANTLR start "ruleExpression5"
    // InternalHale.g:854:1: ruleExpression5 returns [EObject current=null] : (this_Expression4_0= ruleExpression4 ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpression4 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpression4 ) ) ) | ( () otherlv_8= '%' ( (lv_right_9_0= ruleExpression4 ) ) ) )* ) ;
    public final EObject ruleExpression5() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject this_Expression4_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;

        EObject lv_right_9_0 = null;



        	enterRule();

        try {
            // InternalHale.g:860:2: ( (this_Expression4_0= ruleExpression4 ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpression4 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpression4 ) ) ) | ( () otherlv_8= '%' ( (lv_right_9_0= ruleExpression4 ) ) ) )* ) )
            // InternalHale.g:861:2: (this_Expression4_0= ruleExpression4 ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpression4 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpression4 ) ) ) | ( () otherlv_8= '%' ( (lv_right_9_0= ruleExpression4 ) ) ) )* )
            {
            // InternalHale.g:861:2: (this_Expression4_0= ruleExpression4 ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpression4 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpression4 ) ) ) | ( () otherlv_8= '%' ( (lv_right_9_0= ruleExpression4 ) ) ) )* )
            // InternalHale.g:862:3: this_Expression4_0= ruleExpression4 ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpression4 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpression4 ) ) ) | ( () otherlv_8= '%' ( (lv_right_9_0= ruleExpression4 ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpression5Access().getExpression4ParserRuleCall_0());
            		
            pushFollow(FOLLOW_13);
            this_Expression4_0=ruleExpression4();

            state._fsp--;


            			current = this_Expression4_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHale.g:870:3: ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpression4 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpression4 ) ) ) | ( () otherlv_8= '%' ( (lv_right_9_0= ruleExpression4 ) ) ) )*
            loop9:
            do {
                int alt9=4;
                switch ( input.LA(1) ) {
                case 26:
                    {
                    alt9=1;
                    }
                    break;
                case 27:
                    {
                    alt9=2;
                    }
                    break;
                case 28:
                    {
                    alt9=3;
                    }
                    break;

                }

                switch (alt9) {
            	case 1 :
            	    // InternalHale.g:871:4: ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpression4 ) ) )
            	    {
            	    // InternalHale.g:871:4: ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpression4 ) ) )
            	    // InternalHale.g:872:5: () otherlv_2= '*' ( (lv_right_3_0= ruleExpression4 ) )
            	    {
            	    // InternalHale.g:872:5: ()
            	    // InternalHale.g:873:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpression5Access().getMultiplicationLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,26,FOLLOW_8); 

            	    					newLeafNode(otherlv_2, grammarAccess.getExpression5Access().getAsteriskKeyword_1_0_1());
            	    				
            	    // InternalHale.g:883:5: ( (lv_right_3_0= ruleExpression4 ) )
            	    // InternalHale.g:884:6: (lv_right_3_0= ruleExpression4 )
            	    {
            	    // InternalHale.g:884:6: (lv_right_3_0= ruleExpression4 )
            	    // InternalHale.g:885:7: lv_right_3_0= ruleExpression4
            	    {

            	    							newCompositeNode(grammarAccess.getExpression5Access().getRightExpression4ParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_13);
            	    lv_right_3_0=ruleExpression4();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getExpression5Rule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_3_0,
            	    								"willburden.hale.Hale.Expression4");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalHale.g:904:4: ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpression4 ) ) )
            	    {
            	    // InternalHale.g:904:4: ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpression4 ) ) )
            	    // InternalHale.g:905:5: () otherlv_5= '/' ( (lv_right_6_0= ruleExpression4 ) )
            	    {
            	    // InternalHale.g:905:5: ()
            	    // InternalHale.g:906:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpression5Access().getDivisionLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,27,FOLLOW_8); 

            	    					newLeafNode(otherlv_5, grammarAccess.getExpression5Access().getSolidusKeyword_1_1_1());
            	    				
            	    // InternalHale.g:916:5: ( (lv_right_6_0= ruleExpression4 ) )
            	    // InternalHale.g:917:6: (lv_right_6_0= ruleExpression4 )
            	    {
            	    // InternalHale.g:917:6: (lv_right_6_0= ruleExpression4 )
            	    // InternalHale.g:918:7: lv_right_6_0= ruleExpression4
            	    {

            	    							newCompositeNode(grammarAccess.getExpression5Access().getRightExpression4ParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_13);
            	    lv_right_6_0=ruleExpression4();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getExpression5Rule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_6_0,
            	    								"willburden.hale.Hale.Expression4");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalHale.g:937:4: ( () otherlv_8= '%' ( (lv_right_9_0= ruleExpression4 ) ) )
            	    {
            	    // InternalHale.g:937:4: ( () otherlv_8= '%' ( (lv_right_9_0= ruleExpression4 ) ) )
            	    // InternalHale.g:938:5: () otherlv_8= '%' ( (lv_right_9_0= ruleExpression4 ) )
            	    {
            	    // InternalHale.g:938:5: ()
            	    // InternalHale.g:939:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpression5Access().getRemainderLeftAction_1_2_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_8=(Token)match(input,28,FOLLOW_8); 

            	    					newLeafNode(otherlv_8, grammarAccess.getExpression5Access().getPercentSignKeyword_1_2_1());
            	    				
            	    // InternalHale.g:949:5: ( (lv_right_9_0= ruleExpression4 ) )
            	    // InternalHale.g:950:6: (lv_right_9_0= ruleExpression4 )
            	    {
            	    // InternalHale.g:950:6: (lv_right_9_0= ruleExpression4 )
            	    // InternalHale.g:951:7: lv_right_9_0= ruleExpression4
            	    {

            	    							newCompositeNode(grammarAccess.getExpression5Access().getRightExpression4ParserRuleCall_1_2_2_0());
            	    						
            	    pushFollow(FOLLOW_13);
            	    lv_right_9_0=ruleExpression4();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getExpression5Rule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_9_0,
            	    								"willburden.hale.Hale.Expression4");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression5"


    // $ANTLR start "entryRuleExpression4"
    // InternalHale.g:974:1: entryRuleExpression4 returns [EObject current=null] : iv_ruleExpression4= ruleExpression4 EOF ;
    public final EObject entryRuleExpression4() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression4 = null;


        try {
            // InternalHale.g:974:52: (iv_ruleExpression4= ruleExpression4 EOF )
            // InternalHale.g:975:2: iv_ruleExpression4= ruleExpression4 EOF
            {
             newCompositeNode(grammarAccess.getExpression4Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression4=ruleExpression4();

            state._fsp--;

             current =iv_ruleExpression4; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression4"


    // $ANTLR start "ruleExpression4"
    // InternalHale.g:981:1: ruleExpression4 returns [EObject current=null] : (this_Expression3_0= ruleExpression3 ( () otherlv_2= '**' ( (lv_right_3_0= ruleExpression3 ) ) )* ) ;
    public final EObject ruleExpression4() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Expression3_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalHale.g:987:2: ( (this_Expression3_0= ruleExpression3 ( () otherlv_2= '**' ( (lv_right_3_0= ruleExpression3 ) ) )* ) )
            // InternalHale.g:988:2: (this_Expression3_0= ruleExpression3 ( () otherlv_2= '**' ( (lv_right_3_0= ruleExpression3 ) ) )* )
            {
            // InternalHale.g:988:2: (this_Expression3_0= ruleExpression3 ( () otherlv_2= '**' ( (lv_right_3_0= ruleExpression3 ) ) )* )
            // InternalHale.g:989:3: this_Expression3_0= ruleExpression3 ( () otherlv_2= '**' ( (lv_right_3_0= ruleExpression3 ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpression4Access().getExpression3ParserRuleCall_0());
            		
            pushFollow(FOLLOW_14);
            this_Expression3_0=ruleExpression3();

            state._fsp--;


            			current = this_Expression3_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHale.g:997:3: ( () otherlv_2= '**' ( (lv_right_3_0= ruleExpression3 ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==29) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalHale.g:998:4: () otherlv_2= '**' ( (lv_right_3_0= ruleExpression3 ) )
            	    {
            	    // InternalHale.g:998:4: ()
            	    // InternalHale.g:999:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getExpression4Access().getExponentiationLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,29,FOLLOW_8); 

            	    				newLeafNode(otherlv_2, grammarAccess.getExpression4Access().getAsteriskAsteriskKeyword_1_1());
            	    			
            	    // InternalHale.g:1009:4: ( (lv_right_3_0= ruleExpression3 ) )
            	    // InternalHale.g:1010:5: (lv_right_3_0= ruleExpression3 )
            	    {
            	    // InternalHale.g:1010:5: (lv_right_3_0= ruleExpression3 )
            	    // InternalHale.g:1011:6: lv_right_3_0= ruleExpression3
            	    {

            	    						newCompositeNode(grammarAccess.getExpression4Access().getRightExpression3ParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_right_3_0=ruleExpression3();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpression4Rule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"willburden.hale.Hale.Expression3");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression4"


    // $ANTLR start "entryRuleExpression3"
    // InternalHale.g:1033:1: entryRuleExpression3 returns [EObject current=null] : iv_ruleExpression3= ruleExpression3 EOF ;
    public final EObject entryRuleExpression3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression3 = null;


        try {
            // InternalHale.g:1033:52: (iv_ruleExpression3= ruleExpression3 EOF )
            // InternalHale.g:1034:2: iv_ruleExpression3= ruleExpression3 EOF
            {
             newCompositeNode(grammarAccess.getExpression3Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression3=ruleExpression3();

            state._fsp--;

             current =iv_ruleExpression3; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression3"


    // $ANTLR start "ruleExpression3"
    // InternalHale.g:1040:1: ruleExpression3 returns [EObject current=null] : (this_Expression2_0= ruleExpression2 ( () otherlv_2= 'as' ( (lv_right_3_0= ruleType ) ) )* ) ;
    public final EObject ruleExpression3() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Expression2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalHale.g:1046:2: ( (this_Expression2_0= ruleExpression2 ( () otherlv_2= 'as' ( (lv_right_3_0= ruleType ) ) )* ) )
            // InternalHale.g:1047:2: (this_Expression2_0= ruleExpression2 ( () otherlv_2= 'as' ( (lv_right_3_0= ruleType ) ) )* )
            {
            // InternalHale.g:1047:2: (this_Expression2_0= ruleExpression2 ( () otherlv_2= 'as' ( (lv_right_3_0= ruleType ) ) )* )
            // InternalHale.g:1048:3: this_Expression2_0= ruleExpression2 ( () otherlv_2= 'as' ( (lv_right_3_0= ruleType ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpression3Access().getExpression2ParserRuleCall_0());
            		
            pushFollow(FOLLOW_15);
            this_Expression2_0=ruleExpression2();

            state._fsp--;


            			current = this_Expression2_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHale.g:1056:3: ( () otherlv_2= 'as' ( (lv_right_3_0= ruleType ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==30) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalHale.g:1057:4: () otherlv_2= 'as' ( (lv_right_3_0= ruleType ) )
            	    {
            	    // InternalHale.g:1057:4: ()
            	    // InternalHale.g:1058:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getExpression3Access().getConversionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,30,FOLLOW_16); 

            	    				newLeafNode(otherlv_2, grammarAccess.getExpression3Access().getAsKeyword_1_1());
            	    			
            	    // InternalHale.g:1068:4: ( (lv_right_3_0= ruleType ) )
            	    // InternalHale.g:1069:5: (lv_right_3_0= ruleType )
            	    {
            	    // InternalHale.g:1069:5: (lv_right_3_0= ruleType )
            	    // InternalHale.g:1070:6: lv_right_3_0= ruleType
            	    {

            	    						newCompositeNode(grammarAccess.getExpression3Access().getRightTypeParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_right_3_0=ruleType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpression3Rule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"willburden.hale.Hale.Type");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression3"


    // $ANTLR start "entryRuleExpression2"
    // InternalHale.g:1092:1: entryRuleExpression2 returns [EObject current=null] : iv_ruleExpression2= ruleExpression2 EOF ;
    public final EObject entryRuleExpression2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression2 = null;


        try {
            // InternalHale.g:1092:52: (iv_ruleExpression2= ruleExpression2 EOF )
            // InternalHale.g:1093:2: iv_ruleExpression2= ruleExpression2 EOF
            {
             newCompositeNode(grammarAccess.getExpression2Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression2=ruleExpression2();

            state._fsp--;

             current =iv_ruleExpression2; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression2"


    // $ANTLR start "ruleExpression2"
    // InternalHale.g:1099:1: ruleExpression2 returns [EObject current=null] : ( ( () otherlv_1= '-' ( (lv_inner_2_0= ruleExpression2 ) ) ) | ( () otherlv_4= 'not' ( (lv_inner_5_0= ruleExpression2 ) ) ) | this_Expression1_6= ruleExpression1 ) ;
    public final EObject ruleExpression2() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_inner_2_0 = null;

        EObject lv_inner_5_0 = null;

        EObject this_Expression1_6 = null;



        	enterRule();

        try {
            // InternalHale.g:1105:2: ( ( ( () otherlv_1= '-' ( (lv_inner_2_0= ruleExpression2 ) ) ) | ( () otherlv_4= 'not' ( (lv_inner_5_0= ruleExpression2 ) ) ) | this_Expression1_6= ruleExpression1 ) )
            // InternalHale.g:1106:2: ( ( () otherlv_1= '-' ( (lv_inner_2_0= ruleExpression2 ) ) ) | ( () otherlv_4= 'not' ( (lv_inner_5_0= ruleExpression2 ) ) ) | this_Expression1_6= ruleExpression1 )
            {
            // InternalHale.g:1106:2: ( ( () otherlv_1= '-' ( (lv_inner_2_0= ruleExpression2 ) ) ) | ( () otherlv_4= 'not' ( (lv_inner_5_0= ruleExpression2 ) ) ) | this_Expression1_6= ruleExpression1 )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt12=1;
                }
                break;
            case 31:
                {
                alt12=2;
                }
                break;
            case RULE_BOOLEAN:
            case RULE_DOUBLE:
            case RULE_STRING:
            case RULE_ID:
            case 32:
            case 35:
            case 42:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalHale.g:1107:3: ( () otherlv_1= '-' ( (lv_inner_2_0= ruleExpression2 ) ) )
                    {
                    // InternalHale.g:1107:3: ( () otherlv_1= '-' ( (lv_inner_2_0= ruleExpression2 ) ) )
                    // InternalHale.g:1108:4: () otherlv_1= '-' ( (lv_inner_2_0= ruleExpression2 ) )
                    {
                    // InternalHale.g:1108:4: ()
                    // InternalHale.g:1109:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExpression2Access().getUnaryNegationAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,25,FOLLOW_8); 

                    				newLeafNode(otherlv_1, grammarAccess.getExpression2Access().getHyphenMinusKeyword_0_1());
                    			
                    // InternalHale.g:1119:4: ( (lv_inner_2_0= ruleExpression2 ) )
                    // InternalHale.g:1120:5: (lv_inner_2_0= ruleExpression2 )
                    {
                    // InternalHale.g:1120:5: (lv_inner_2_0= ruleExpression2 )
                    // InternalHale.g:1121:6: lv_inner_2_0= ruleExpression2
                    {

                    						newCompositeNode(grammarAccess.getExpression2Access().getInnerExpression2ParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_inner_2_0=ruleExpression2();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpression2Rule());
                    						}
                    						set(
                    							current,
                    							"inner",
                    							lv_inner_2_0,
                    							"willburden.hale.Hale.Expression2");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalHale.g:1140:3: ( () otherlv_4= 'not' ( (lv_inner_5_0= ruleExpression2 ) ) )
                    {
                    // InternalHale.g:1140:3: ( () otherlv_4= 'not' ( (lv_inner_5_0= ruleExpression2 ) ) )
                    // InternalHale.g:1141:4: () otherlv_4= 'not' ( (lv_inner_5_0= ruleExpression2 ) )
                    {
                    // InternalHale.g:1141:4: ()
                    // InternalHale.g:1142:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExpression2Access().getLogicalNotAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,31,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getExpression2Access().getNotKeyword_1_1());
                    			
                    // InternalHale.g:1152:4: ( (lv_inner_5_0= ruleExpression2 ) )
                    // InternalHale.g:1153:5: (lv_inner_5_0= ruleExpression2 )
                    {
                    // InternalHale.g:1153:5: (lv_inner_5_0= ruleExpression2 )
                    // InternalHale.g:1154:6: lv_inner_5_0= ruleExpression2
                    {

                    						newCompositeNode(grammarAccess.getExpression2Access().getInnerExpression2ParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_inner_5_0=ruleExpression2();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpression2Rule());
                    						}
                    						set(
                    							current,
                    							"inner",
                    							lv_inner_5_0,
                    							"willburden.hale.Hale.Expression2");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalHale.g:1173:3: this_Expression1_6= ruleExpression1
                    {

                    			newCompositeNode(grammarAccess.getExpression2Access().getExpression1ParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Expression1_6=ruleExpression1();

                    state._fsp--;


                    			current = this_Expression1_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression2"


    // $ANTLR start "entryRuleExpression1"
    // InternalHale.g:1185:1: entryRuleExpression1 returns [EObject current=null] : iv_ruleExpression1= ruleExpression1 EOF ;
    public final EObject entryRuleExpression1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression1 = null;


        try {
            // InternalHale.g:1185:52: (iv_ruleExpression1= ruleExpression1 EOF )
            // InternalHale.g:1186:2: iv_ruleExpression1= ruleExpression1 EOF
            {
             newCompositeNode(grammarAccess.getExpression1Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression1=ruleExpression1();

            state._fsp--;

             current =iv_ruleExpression1; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression1"


    // $ANTLR start "ruleExpression1"
    // InternalHale.g:1192:1: ruleExpression1 returns [EObject current=null] : (this_Expression0_0= ruleExpression0 ( () otherlv_2= '(' ( ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* (otherlv_6= ',' )? )? otherlv_7= ')' )* ) ;
    public final EObject ruleExpression1() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject this_Expression0_0 = null;

        EObject lv_arguments_3_0 = null;

        EObject lv_arguments_5_0 = null;



        	enterRule();

        try {
            // InternalHale.g:1198:2: ( (this_Expression0_0= ruleExpression0 ( () otherlv_2= '(' ( ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* (otherlv_6= ',' )? )? otherlv_7= ')' )* ) )
            // InternalHale.g:1199:2: (this_Expression0_0= ruleExpression0 ( () otherlv_2= '(' ( ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* (otherlv_6= ',' )? )? otherlv_7= ')' )* )
            {
            // InternalHale.g:1199:2: (this_Expression0_0= ruleExpression0 ( () otherlv_2= '(' ( ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* (otherlv_6= ',' )? )? otherlv_7= ')' )* )
            // InternalHale.g:1200:3: this_Expression0_0= ruleExpression0 ( () otherlv_2= '(' ( ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* (otherlv_6= ',' )? )? otherlv_7= ')' )*
            {

            			newCompositeNode(grammarAccess.getExpression1Access().getExpression0ParserRuleCall_0());
            		
            pushFollow(FOLLOW_17);
            this_Expression0_0=ruleExpression0();

            state._fsp--;


            			current = this_Expression0_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHale.g:1208:3: ( () otherlv_2= '(' ( ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* (otherlv_6= ',' )? )? otherlv_7= ')' )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==32) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalHale.g:1209:4: () otherlv_2= '(' ( ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* (otherlv_6= ',' )? )? otherlv_7= ')'
            	    {
            	    // InternalHale.g:1209:4: ()
            	    // InternalHale.g:1210:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getExpression1Access().getApplicationExpressionAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,32,FOLLOW_18); 

            	    				newLeafNode(otherlv_2, grammarAccess.getExpression1Access().getLeftParenthesisKeyword_1_1());
            	    			
            	    // InternalHale.g:1220:4: ( ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* (otherlv_6= ',' )? )?
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( ((LA15_0>=RULE_BOOLEAN && LA15_0<=RULE_STRING)||LA15_0==RULE_ID||LA15_0==25||(LA15_0>=31 && LA15_0<=32)||LA15_0==35||LA15_0==42) ) {
            	        alt15=1;
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // InternalHale.g:1221:5: ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* (otherlv_6= ',' )?
            	            {
            	            // InternalHale.g:1221:5: ( (lv_arguments_3_0= ruleExpression ) )
            	            // InternalHale.g:1222:6: (lv_arguments_3_0= ruleExpression )
            	            {
            	            // InternalHale.g:1222:6: (lv_arguments_3_0= ruleExpression )
            	            // InternalHale.g:1223:7: lv_arguments_3_0= ruleExpression
            	            {

            	            							newCompositeNode(grammarAccess.getExpression1Access().getArgumentsExpressionParserRuleCall_1_2_0_0());
            	            						
            	            pushFollow(FOLLOW_19);
            	            lv_arguments_3_0=ruleExpression();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getExpression1Rule());
            	            							}
            	            							add(
            	            								current,
            	            								"arguments",
            	            								lv_arguments_3_0,
            	            								"willburden.hale.Hale.Expression");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }


            	            }

            	            // InternalHale.g:1240:5: (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )*
            	            loop13:
            	            do {
            	                int alt13=2;
            	                int LA13_0 = input.LA(1);

            	                if ( (LA13_0==33) ) {
            	                    int LA13_1 = input.LA(2);

            	                    if ( ((LA13_1>=RULE_BOOLEAN && LA13_1<=RULE_STRING)||LA13_1==RULE_ID||LA13_1==25||(LA13_1>=31 && LA13_1<=32)||LA13_1==35||LA13_1==42) ) {
            	                        alt13=1;
            	                    }


            	                }


            	                switch (alt13) {
            	            	case 1 :
            	            	    // InternalHale.g:1241:6: otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) )
            	            	    {
            	            	    otherlv_4=(Token)match(input,33,FOLLOW_8); 

            	            	    						newLeafNode(otherlv_4, grammarAccess.getExpression1Access().getCommaKeyword_1_2_1_0());
            	            	    					
            	            	    // InternalHale.g:1245:6: ( (lv_arguments_5_0= ruleExpression ) )
            	            	    // InternalHale.g:1246:7: (lv_arguments_5_0= ruleExpression )
            	            	    {
            	            	    // InternalHale.g:1246:7: (lv_arguments_5_0= ruleExpression )
            	            	    // InternalHale.g:1247:8: lv_arguments_5_0= ruleExpression
            	            	    {

            	            	    								newCompositeNode(grammarAccess.getExpression1Access().getArgumentsExpressionParserRuleCall_1_2_1_1_0());
            	            	    							
            	            	    pushFollow(FOLLOW_19);
            	            	    lv_arguments_5_0=ruleExpression();

            	            	    state._fsp--;


            	            	    								if (current==null) {
            	            	    									current = createModelElementForParent(grammarAccess.getExpression1Rule());
            	            	    								}
            	            	    								add(
            	            	    									current,
            	            	    									"arguments",
            	            	    									lv_arguments_5_0,
            	            	    									"willburden.hale.Hale.Expression");
            	            	    								afterParserOrEnumRuleCall();
            	            	    							

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop13;
            	                }
            	            } while (true);

            	            // InternalHale.g:1265:5: (otherlv_6= ',' )?
            	            int alt14=2;
            	            int LA14_0 = input.LA(1);

            	            if ( (LA14_0==33) ) {
            	                alt14=1;
            	            }
            	            switch (alt14) {
            	                case 1 :
            	                    // InternalHale.g:1266:6: otherlv_6= ','
            	                    {
            	                    otherlv_6=(Token)match(input,33,FOLLOW_20); 

            	                    						newLeafNode(otherlv_6, grammarAccess.getExpression1Access().getCommaKeyword_1_2_2());
            	                    					

            	                    }
            	                    break;

            	            }


            	            }
            	            break;

            	    }

            	    otherlv_7=(Token)match(input,34,FOLLOW_17); 

            	    				newLeafNode(otherlv_7, grammarAccess.getExpression1Access().getRightParenthesisKeyword_1_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression1"


    // $ANTLR start "entryRuleExpression0"
    // InternalHale.g:1281:1: entryRuleExpression0 returns [EObject current=null] : iv_ruleExpression0= ruleExpression0 EOF ;
    public final EObject entryRuleExpression0() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression0 = null;


        try {
            // InternalHale.g:1281:52: (iv_ruleExpression0= ruleExpression0 EOF )
            // InternalHale.g:1282:2: iv_ruleExpression0= ruleExpression0 EOF
            {
             newCompositeNode(grammarAccess.getExpression0Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression0=ruleExpression0();

            state._fsp--;

             current =iv_ruleExpression0; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression0"


    // $ANTLR start "ruleExpression0"
    // InternalHale.g:1288:1: ruleExpression0 returns [EObject current=null] : (this_Literal_0= ruleLiteral | this_Input_1= ruleInput | this_BindingReference_2= ruleBindingReference | (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' ) ) ;
    public final EObject ruleExpression0() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_Literal_0 = null;

        EObject this_Input_1 = null;

        EObject this_BindingReference_2 = null;

        EObject this_Expression_4 = null;



        	enterRule();

        try {
            // InternalHale.g:1294:2: ( (this_Literal_0= ruleLiteral | this_Input_1= ruleInput | this_BindingReference_2= ruleBindingReference | (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' ) ) )
            // InternalHale.g:1295:2: (this_Literal_0= ruleLiteral | this_Input_1= ruleInput | this_BindingReference_2= ruleBindingReference | (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' ) )
            {
            // InternalHale.g:1295:2: (this_Literal_0= ruleLiteral | this_Input_1= ruleInput | this_BindingReference_2= ruleBindingReference | (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' ) )
            int alt17=4;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN:
            case RULE_DOUBLE:
            case RULE_STRING:
            case 35:
                {
                alt17=1;
                }
                break;
            case 42:
                {
                alt17=2;
                }
                break;
            case RULE_ID:
                {
                alt17=3;
                }
                break;
            case 32:
                {
                alt17=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalHale.g:1296:3: this_Literal_0= ruleLiteral
                    {

                    			newCompositeNode(grammarAccess.getExpression0Access().getLiteralParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Literal_0=ruleLiteral();

                    state._fsp--;


                    			current = this_Literal_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalHale.g:1305:3: this_Input_1= ruleInput
                    {

                    			newCompositeNode(grammarAccess.getExpression0Access().getInputParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Input_1=ruleInput();

                    state._fsp--;


                    			current = this_Input_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalHale.g:1314:3: this_BindingReference_2= ruleBindingReference
                    {

                    			newCompositeNode(grammarAccess.getExpression0Access().getBindingReferenceParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_BindingReference_2=ruleBindingReference();

                    state._fsp--;


                    			current = this_BindingReference_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalHale.g:1323:3: (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' )
                    {
                    // InternalHale.g:1323:3: (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' )
                    // InternalHale.g:1324:4: otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getExpression0Access().getLeftParenthesisKeyword_3_0());
                    			

                    				newCompositeNode(grammarAccess.getExpression0Access().getExpressionParserRuleCall_3_1());
                    			
                    pushFollow(FOLLOW_20);
                    this_Expression_4=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_4;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_5=(Token)match(input,34,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getExpression0Access().getRightParenthesisKeyword_3_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression0"


    // $ANTLR start "entryRuleLiteral"
    // InternalHale.g:1345:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalHale.g:1345:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalHale.g:1346:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalHale.g:1352:1: ruleLiteral returns [EObject current=null] : (this_VoidLiteral_0= ruleVoidLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NumberLiteral_2= ruleNumberLiteral | this_StringLiteral_3= ruleStringLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_VoidLiteral_0 = null;

        EObject this_BooleanLiteral_1 = null;

        EObject this_NumberLiteral_2 = null;

        EObject this_StringLiteral_3 = null;



        	enterRule();

        try {
            // InternalHale.g:1358:2: ( (this_VoidLiteral_0= ruleVoidLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NumberLiteral_2= ruleNumberLiteral | this_StringLiteral_3= ruleStringLiteral ) )
            // InternalHale.g:1359:2: (this_VoidLiteral_0= ruleVoidLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NumberLiteral_2= ruleNumberLiteral | this_StringLiteral_3= ruleStringLiteral )
            {
            // InternalHale.g:1359:2: (this_VoidLiteral_0= ruleVoidLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NumberLiteral_2= ruleNumberLiteral | this_StringLiteral_3= ruleStringLiteral )
            int alt18=4;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt18=1;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt18=2;
                }
                break;
            case RULE_DOUBLE:
                {
                alt18=3;
                }
                break;
            case RULE_STRING:
                {
                alt18=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalHale.g:1360:3: this_VoidLiteral_0= ruleVoidLiteral
                    {

                    			newCompositeNode(grammarAccess.getLiteralAccess().getVoidLiteralParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_VoidLiteral_0=ruleVoidLiteral();

                    state._fsp--;


                    			current = this_VoidLiteral_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalHale.g:1369:3: this_BooleanLiteral_1= ruleBooleanLiteral
                    {

                    			newCompositeNode(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanLiteral_1=ruleBooleanLiteral();

                    state._fsp--;


                    			current = this_BooleanLiteral_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalHale.g:1378:3: this_NumberLiteral_2= ruleNumberLiteral
                    {

                    			newCompositeNode(grammarAccess.getLiteralAccess().getNumberLiteralParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_NumberLiteral_2=ruleNumberLiteral();

                    state._fsp--;


                    			current = this_NumberLiteral_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalHale.g:1387:3: this_StringLiteral_3= ruleStringLiteral
                    {

                    			newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringLiteral_3=ruleStringLiteral();

                    state._fsp--;


                    			current = this_StringLiteral_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleVoidLiteral"
    // InternalHale.g:1399:1: entryRuleVoidLiteral returns [EObject current=null] : iv_ruleVoidLiteral= ruleVoidLiteral EOF ;
    public final EObject entryRuleVoidLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVoidLiteral = null;


        try {
            // InternalHale.g:1399:52: (iv_ruleVoidLiteral= ruleVoidLiteral EOF )
            // InternalHale.g:1400:2: iv_ruleVoidLiteral= ruleVoidLiteral EOF
            {
             newCompositeNode(grammarAccess.getVoidLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVoidLiteral=ruleVoidLiteral();

            state._fsp--;

             current =iv_ruleVoidLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVoidLiteral"


    // $ANTLR start "ruleVoidLiteral"
    // InternalHale.g:1406:1: ruleVoidLiteral returns [EObject current=null] : ( () otherlv_1= 'void' ) ;
    public final EObject ruleVoidLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalHale.g:1412:2: ( ( () otherlv_1= 'void' ) )
            // InternalHale.g:1413:2: ( () otherlv_1= 'void' )
            {
            // InternalHale.g:1413:2: ( () otherlv_1= 'void' )
            // InternalHale.g:1414:3: () otherlv_1= 'void'
            {
            // InternalHale.g:1414:3: ()
            // InternalHale.g:1415:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVoidLiteralAccess().getVoidLiteralAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getVoidLiteralAccess().getVoidKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVoidLiteral"


    // $ANTLR start "entryRuleBooleanLiteral"
    // InternalHale.g:1429:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // InternalHale.g:1429:55: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // InternalHale.g:1430:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
             newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;

             current =iv_ruleBooleanLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // InternalHale.g:1436:1: ruleBooleanLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalHale.g:1442:2: ( ( (lv_value_0_0= RULE_BOOLEAN ) ) )
            // InternalHale.g:1443:2: ( (lv_value_0_0= RULE_BOOLEAN ) )
            {
            // InternalHale.g:1443:2: ( (lv_value_0_0= RULE_BOOLEAN ) )
            // InternalHale.g:1444:3: (lv_value_0_0= RULE_BOOLEAN )
            {
            // InternalHale.g:1444:3: (lv_value_0_0= RULE_BOOLEAN )
            // InternalHale.g:1445:4: lv_value_0_0= RULE_BOOLEAN
            {
            lv_value_0_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getBooleanLiteralAccess().getValueBOOLEANTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getBooleanLiteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"willburden.hale.Hale.BOOLEAN");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "entryRuleNumberLiteral"
    // InternalHale.g:1464:1: entryRuleNumberLiteral returns [EObject current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final EObject entryRuleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteral = null;


        try {
            // InternalHale.g:1464:54: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // InternalHale.g:1465:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
            {
             newCompositeNode(grammarAccess.getNumberLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumberLiteral=ruleNumberLiteral();

            state._fsp--;

             current =iv_ruleNumberLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumberLiteral"


    // $ANTLR start "ruleNumberLiteral"
    // InternalHale.g:1471:1: ruleNumberLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_DOUBLE ) ) ;
    public final EObject ruleNumberLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalHale.g:1477:2: ( ( (lv_value_0_0= RULE_DOUBLE ) ) )
            // InternalHale.g:1478:2: ( (lv_value_0_0= RULE_DOUBLE ) )
            {
            // InternalHale.g:1478:2: ( (lv_value_0_0= RULE_DOUBLE ) )
            // InternalHale.g:1479:3: (lv_value_0_0= RULE_DOUBLE )
            {
            // InternalHale.g:1479:3: (lv_value_0_0= RULE_DOUBLE )
            // InternalHale.g:1480:4: lv_value_0_0= RULE_DOUBLE
            {
            lv_value_0_0=(Token)match(input,RULE_DOUBLE,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getNumberLiteralAccess().getValueDOUBLETerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getNumberLiteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"willburden.hale.Hale.DOUBLE");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalHale.g:1499:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalHale.g:1499:54: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalHale.g:1500:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             newCompositeNode(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;

             current =iv_ruleStringLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // InternalHale.g:1506:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalHale.g:1512:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalHale.g:1513:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalHale.g:1513:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalHale.g:1514:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalHale.g:1514:3: (lv_value_0_0= RULE_STRING )
            // InternalHale.g:1515:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStringLiteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"willburden.hale.Hale.STRING");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleTypeAnnotation"
    // InternalHale.g:1534:1: entryRuleTypeAnnotation returns [EObject current=null] : iv_ruleTypeAnnotation= ruleTypeAnnotation EOF ;
    public final EObject entryRuleTypeAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeAnnotation = null;


        try {
            // InternalHale.g:1534:55: (iv_ruleTypeAnnotation= ruleTypeAnnotation EOF )
            // InternalHale.g:1535:2: iv_ruleTypeAnnotation= ruleTypeAnnotation EOF
            {
             newCompositeNode(grammarAccess.getTypeAnnotationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeAnnotation=ruleTypeAnnotation();

            state._fsp--;

             current =iv_ruleTypeAnnotation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeAnnotation"


    // $ANTLR start "ruleTypeAnnotation"
    // InternalHale.g:1541:1: ruleTypeAnnotation returns [EObject current=null] : (otherlv_0= ':' this_Type_1= ruleType ) ;
    public final EObject ruleTypeAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Type_1 = null;



        	enterRule();

        try {
            // InternalHale.g:1547:2: ( (otherlv_0= ':' this_Type_1= ruleType ) )
            // InternalHale.g:1548:2: (otherlv_0= ':' this_Type_1= ruleType )
            {
            // InternalHale.g:1548:2: (otherlv_0= ':' this_Type_1= ruleType )
            // InternalHale.g:1549:3: otherlv_0= ':' this_Type_1= ruleType
            {
            otherlv_0=(Token)match(input,36,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeAnnotationAccess().getColonKeyword_0());
            		

            			newCompositeNode(grammarAccess.getTypeAnnotationAccess().getTypeParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_Type_1=ruleType();

            state._fsp--;


            			current = this_Type_1;
            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeAnnotation"


    // $ANTLR start "entryRuleType"
    // InternalHale.g:1565:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalHale.g:1565:45: (iv_ruleType= ruleType EOF )
            // InternalHale.g:1566:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalHale.g:1572:1: ruleType returns [EObject current=null] : this_FunctionType_0= ruleFunctionType ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_FunctionType_0 = null;



        	enterRule();

        try {
            // InternalHale.g:1578:2: (this_FunctionType_0= ruleFunctionType )
            // InternalHale.g:1579:2: this_FunctionType_0= ruleFunctionType
            {

            		newCompositeNode(grammarAccess.getTypeAccess().getFunctionTypeParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_FunctionType_0=ruleFunctionType();

            state._fsp--;


            		current = this_FunctionType_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleFunctionType"
    // InternalHale.g:1590:1: entryRuleFunctionType returns [EObject current=null] : iv_ruleFunctionType= ruleFunctionType EOF ;
    public final EObject entryRuleFunctionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionType = null;


        try {
            // InternalHale.g:1590:53: (iv_ruleFunctionType= ruleFunctionType EOF )
            // InternalHale.g:1591:2: iv_ruleFunctionType= ruleFunctionType EOF
            {
             newCompositeNode(grammarAccess.getFunctionTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionType=ruleFunctionType();

            state._fsp--;

             current =iv_ruleFunctionType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionType"


    // $ANTLR start "ruleFunctionType"
    // InternalHale.g:1597:1: ruleFunctionType returns [EObject current=null] : ( ( () otherlv_1= 'Function' otherlv_2= '(' ( ( (lv_paramTypes_3_0= ruleType ) ) (otherlv_4= ',' ( (lv_paramTypes_5_0= ruleType ) ) )* (otherlv_6= ',' )? )? otherlv_7= ')' ( (lv_returnType_8_0= ruleTypeAnnotation ) )? ) | this_EitherType_9= ruleEitherType ) ;
    public final EObject ruleFunctionType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_paramTypes_3_0 = null;

        EObject lv_paramTypes_5_0 = null;

        EObject lv_returnType_8_0 = null;

        EObject this_EitherType_9 = null;



        	enterRule();

        try {
            // InternalHale.g:1603:2: ( ( ( () otherlv_1= 'Function' otherlv_2= '(' ( ( (lv_paramTypes_3_0= ruleType ) ) (otherlv_4= ',' ( (lv_paramTypes_5_0= ruleType ) ) )* (otherlv_6= ',' )? )? otherlv_7= ')' ( (lv_returnType_8_0= ruleTypeAnnotation ) )? ) | this_EitherType_9= ruleEitherType ) )
            // InternalHale.g:1604:2: ( ( () otherlv_1= 'Function' otherlv_2= '(' ( ( (lv_paramTypes_3_0= ruleType ) ) (otherlv_4= ',' ( (lv_paramTypes_5_0= ruleType ) ) )* (otherlv_6= ',' )? )? otherlv_7= ')' ( (lv_returnType_8_0= ruleTypeAnnotation ) )? ) | this_EitherType_9= ruleEitherType )
            {
            // InternalHale.g:1604:2: ( ( () otherlv_1= 'Function' otherlv_2= '(' ( ( (lv_paramTypes_3_0= ruleType ) ) (otherlv_4= ',' ( (lv_paramTypes_5_0= ruleType ) ) )* (otherlv_6= ',' )? )? otherlv_7= ')' ( (lv_returnType_8_0= ruleTypeAnnotation ) )? ) | this_EitherType_9= ruleEitherType )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==37) ) {
                alt23=1;
            }
            else if ( (LA23_0==RULE_PRIMITIVE_TYPE||LA23_0==32) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalHale.g:1605:3: ( () otherlv_1= 'Function' otherlv_2= '(' ( ( (lv_paramTypes_3_0= ruleType ) ) (otherlv_4= ',' ( (lv_paramTypes_5_0= ruleType ) ) )* (otherlv_6= ',' )? )? otherlv_7= ')' ( (lv_returnType_8_0= ruleTypeAnnotation ) )? )
                    {
                    // InternalHale.g:1605:3: ( () otherlv_1= 'Function' otherlv_2= '(' ( ( (lv_paramTypes_3_0= ruleType ) ) (otherlv_4= ',' ( (lv_paramTypes_5_0= ruleType ) ) )* (otherlv_6= ',' )? )? otherlv_7= ')' ( (lv_returnType_8_0= ruleTypeAnnotation ) )? )
                    // InternalHale.g:1606:4: () otherlv_1= 'Function' otherlv_2= '(' ( ( (lv_paramTypes_3_0= ruleType ) ) (otherlv_4= ',' ( (lv_paramTypes_5_0= ruleType ) ) )* (otherlv_6= ',' )? )? otherlv_7= ')' ( (lv_returnType_8_0= ruleTypeAnnotation ) )?
                    {
                    // InternalHale.g:1606:4: ()
                    // InternalHale.g:1607:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getFunctionTypeAccess().getFunctionTypeAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,37,FOLLOW_21); 

                    				newLeafNode(otherlv_1, grammarAccess.getFunctionTypeAccess().getFunctionKeyword_0_1());
                    			
                    otherlv_2=(Token)match(input,32,FOLLOW_22); 

                    				newLeafNode(otherlv_2, grammarAccess.getFunctionTypeAccess().getLeftParenthesisKeyword_0_2());
                    			
                    // InternalHale.g:1621:4: ( ( (lv_paramTypes_3_0= ruleType ) ) (otherlv_4= ',' ( (lv_paramTypes_5_0= ruleType ) ) )* (otherlv_6= ',' )? )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==RULE_PRIMITIVE_TYPE||LA21_0==32||LA21_0==37) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalHale.g:1622:5: ( (lv_paramTypes_3_0= ruleType ) ) (otherlv_4= ',' ( (lv_paramTypes_5_0= ruleType ) ) )* (otherlv_6= ',' )?
                            {
                            // InternalHale.g:1622:5: ( (lv_paramTypes_3_0= ruleType ) )
                            // InternalHale.g:1623:6: (lv_paramTypes_3_0= ruleType )
                            {
                            // InternalHale.g:1623:6: (lv_paramTypes_3_0= ruleType )
                            // InternalHale.g:1624:7: lv_paramTypes_3_0= ruleType
                            {

                            							newCompositeNode(grammarAccess.getFunctionTypeAccess().getParamTypesTypeParserRuleCall_0_3_0_0());
                            						
                            pushFollow(FOLLOW_19);
                            lv_paramTypes_3_0=ruleType();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getFunctionTypeRule());
                            							}
                            							add(
                            								current,
                            								"paramTypes",
                            								lv_paramTypes_3_0,
                            								"willburden.hale.Hale.Type");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalHale.g:1641:5: (otherlv_4= ',' ( (lv_paramTypes_5_0= ruleType ) ) )*
                            loop19:
                            do {
                                int alt19=2;
                                int LA19_0 = input.LA(1);

                                if ( (LA19_0==33) ) {
                                    int LA19_1 = input.LA(2);

                                    if ( (LA19_1==RULE_PRIMITIVE_TYPE||LA19_1==32||LA19_1==37) ) {
                                        alt19=1;
                                    }


                                }


                                switch (alt19) {
                            	case 1 :
                            	    // InternalHale.g:1642:6: otherlv_4= ',' ( (lv_paramTypes_5_0= ruleType ) )
                            	    {
                            	    otherlv_4=(Token)match(input,33,FOLLOW_16); 

                            	    						newLeafNode(otherlv_4, grammarAccess.getFunctionTypeAccess().getCommaKeyword_0_3_1_0());
                            	    					
                            	    // InternalHale.g:1646:6: ( (lv_paramTypes_5_0= ruleType ) )
                            	    // InternalHale.g:1647:7: (lv_paramTypes_5_0= ruleType )
                            	    {
                            	    // InternalHale.g:1647:7: (lv_paramTypes_5_0= ruleType )
                            	    // InternalHale.g:1648:8: lv_paramTypes_5_0= ruleType
                            	    {

                            	    								newCompositeNode(grammarAccess.getFunctionTypeAccess().getParamTypesTypeParserRuleCall_0_3_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_19);
                            	    lv_paramTypes_5_0=ruleType();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getFunctionTypeRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"paramTypes",
                            	    									lv_paramTypes_5_0,
                            	    									"willburden.hale.Hale.Type");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop19;
                                }
                            } while (true);

                            // InternalHale.g:1666:5: (otherlv_6= ',' )?
                            int alt20=2;
                            int LA20_0 = input.LA(1);

                            if ( (LA20_0==33) ) {
                                alt20=1;
                            }
                            switch (alt20) {
                                case 1 :
                                    // InternalHale.g:1667:6: otherlv_6= ','
                                    {
                                    otherlv_6=(Token)match(input,33,FOLLOW_20); 

                                    						newLeafNode(otherlv_6, grammarAccess.getFunctionTypeAccess().getCommaKeyword_0_3_2());
                                    					

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,34,FOLLOW_23); 

                    				newLeafNode(otherlv_7, grammarAccess.getFunctionTypeAccess().getRightParenthesisKeyword_0_4());
                    			
                    // InternalHale.g:1677:4: ( (lv_returnType_8_0= ruleTypeAnnotation ) )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==36) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalHale.g:1678:5: (lv_returnType_8_0= ruleTypeAnnotation )
                            {
                            // InternalHale.g:1678:5: (lv_returnType_8_0= ruleTypeAnnotation )
                            // InternalHale.g:1679:6: lv_returnType_8_0= ruleTypeAnnotation
                            {

                            						newCompositeNode(grammarAccess.getFunctionTypeAccess().getReturnTypeTypeAnnotationParserRuleCall_0_5_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_returnType_8_0=ruleTypeAnnotation();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getFunctionTypeRule());
                            						}
                            						set(
                            							current,
                            							"returnType",
                            							lv_returnType_8_0,
                            							"willburden.hale.Hale.TypeAnnotation");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalHale.g:1698:3: this_EitherType_9= ruleEitherType
                    {

                    			newCompositeNode(grammarAccess.getFunctionTypeAccess().getEitherTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EitherType_9=ruleEitherType();

                    state._fsp--;


                    			current = this_EitherType_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionType"


    // $ANTLR start "entryRuleEitherType"
    // InternalHale.g:1710:1: entryRuleEitherType returns [EObject current=null] : iv_ruleEitherType= ruleEitherType EOF ;
    public final EObject entryRuleEitherType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEitherType = null;


        try {
            // InternalHale.g:1710:51: (iv_ruleEitherType= ruleEitherType EOF )
            // InternalHale.g:1711:2: iv_ruleEitherType= ruleEitherType EOF
            {
             newCompositeNode(grammarAccess.getEitherTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEitherType=ruleEitherType();

            state._fsp--;

             current =iv_ruleEitherType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEitherType"


    // $ANTLR start "ruleEitherType"
    // InternalHale.g:1717:1: ruleEitherType returns [EObject current=null] : (this_PrimaryType_0= rulePrimaryType ( () otherlv_2= '?' ( (lv_right_3_0= rulePrimaryType ) ) )* ) ;
    public final EObject ruleEitherType() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_PrimaryType_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalHale.g:1723:2: ( (this_PrimaryType_0= rulePrimaryType ( () otherlv_2= '?' ( (lv_right_3_0= rulePrimaryType ) ) )* ) )
            // InternalHale.g:1724:2: (this_PrimaryType_0= rulePrimaryType ( () otherlv_2= '?' ( (lv_right_3_0= rulePrimaryType ) ) )* )
            {
            // InternalHale.g:1724:2: (this_PrimaryType_0= rulePrimaryType ( () otherlv_2= '?' ( (lv_right_3_0= rulePrimaryType ) ) )* )
            // InternalHale.g:1725:3: this_PrimaryType_0= rulePrimaryType ( () otherlv_2= '?' ( (lv_right_3_0= rulePrimaryType ) ) )*
            {

            			newCompositeNode(grammarAccess.getEitherTypeAccess().getPrimaryTypeParserRuleCall_0());
            		
            pushFollow(FOLLOW_24);
            this_PrimaryType_0=rulePrimaryType();

            state._fsp--;


            			current = this_PrimaryType_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHale.g:1733:3: ( () otherlv_2= '?' ( (lv_right_3_0= rulePrimaryType ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==38) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalHale.g:1734:4: () otherlv_2= '?' ( (lv_right_3_0= rulePrimaryType ) )
            	    {
            	    // InternalHale.g:1734:4: ()
            	    // InternalHale.g:1735:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEitherTypeAccess().getEitherTypeLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,38,FOLLOW_16); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEitherTypeAccess().getQuestionMarkKeyword_1_1());
            	    			
            	    // InternalHale.g:1745:4: ( (lv_right_3_0= rulePrimaryType ) )
            	    // InternalHale.g:1746:5: (lv_right_3_0= rulePrimaryType )
            	    {
            	    // InternalHale.g:1746:5: (lv_right_3_0= rulePrimaryType )
            	    // InternalHale.g:1747:6: lv_right_3_0= rulePrimaryType
            	    {

            	    						newCompositeNode(grammarAccess.getEitherTypeAccess().getRightPrimaryTypeParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_24);
            	    lv_right_3_0=rulePrimaryType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEitherTypeRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"willburden.hale.Hale.PrimaryType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEitherType"


    // $ANTLR start "entryRulePrimaryType"
    // InternalHale.g:1769:1: entryRulePrimaryType returns [EObject current=null] : iv_rulePrimaryType= rulePrimaryType EOF ;
    public final EObject entryRulePrimaryType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryType = null;


        try {
            // InternalHale.g:1769:52: (iv_rulePrimaryType= rulePrimaryType EOF )
            // InternalHale.g:1770:2: iv_rulePrimaryType= rulePrimaryType EOF
            {
             newCompositeNode(grammarAccess.getPrimaryTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimaryType=rulePrimaryType();

            state._fsp--;

             current =iv_rulePrimaryType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryType"


    // $ANTLR start "rulePrimaryType"
    // InternalHale.g:1776:1: rulePrimaryType returns [EObject current=null] : (this_PrimitiveType_0= rulePrimitiveType | (otherlv_1= '(' this_Type_2= ruleType otherlv_3= ')' ) ) ;
    public final EObject rulePrimaryType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_PrimitiveType_0 = null;

        EObject this_Type_2 = null;



        	enterRule();

        try {
            // InternalHale.g:1782:2: ( (this_PrimitiveType_0= rulePrimitiveType | (otherlv_1= '(' this_Type_2= ruleType otherlv_3= ')' ) ) )
            // InternalHale.g:1783:2: (this_PrimitiveType_0= rulePrimitiveType | (otherlv_1= '(' this_Type_2= ruleType otherlv_3= ')' ) )
            {
            // InternalHale.g:1783:2: (this_PrimitiveType_0= rulePrimitiveType | (otherlv_1= '(' this_Type_2= ruleType otherlv_3= ')' ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_PRIMITIVE_TYPE) ) {
                alt25=1;
            }
            else if ( (LA25_0==32) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalHale.g:1784:3: this_PrimitiveType_0= rulePrimitiveType
                    {

                    			newCompositeNode(grammarAccess.getPrimaryTypeAccess().getPrimitiveTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrimitiveType_0=rulePrimitiveType();

                    state._fsp--;


                    			current = this_PrimitiveType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalHale.g:1793:3: (otherlv_1= '(' this_Type_2= ruleType otherlv_3= ')' )
                    {
                    // InternalHale.g:1793:3: (otherlv_1= '(' this_Type_2= ruleType otherlv_3= ')' )
                    // InternalHale.g:1794:4: otherlv_1= '(' this_Type_2= ruleType otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,32,FOLLOW_16); 

                    				newLeafNode(otherlv_1, grammarAccess.getPrimaryTypeAccess().getLeftParenthesisKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryTypeAccess().getTypeParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_20);
                    this_Type_2=ruleType();

                    state._fsp--;


                    				current = this_Type_2;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_3=(Token)match(input,34,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getPrimaryTypeAccess().getRightParenthesisKeyword_1_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryType"


    // $ANTLR start "entryRulePrimitiveType"
    // InternalHale.g:1815:1: entryRulePrimitiveType returns [EObject current=null] : iv_rulePrimitiveType= rulePrimitiveType EOF ;
    public final EObject entryRulePrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveType = null;


        try {
            // InternalHale.g:1815:54: (iv_rulePrimitiveType= rulePrimitiveType EOF )
            // InternalHale.g:1816:2: iv_rulePrimitiveType= rulePrimitiveType EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimitiveType=rulePrimitiveType();

            state._fsp--;

             current =iv_rulePrimitiveType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitiveType"


    // $ANTLR start "rulePrimitiveType"
    // InternalHale.g:1822:1: rulePrimitiveType returns [EObject current=null] : ( () ( (lv_type_1_0= RULE_PRIMITIVE_TYPE ) ) ) ;
    public final EObject rulePrimitiveType() throws RecognitionException {
        EObject current = null;

        Token lv_type_1_0=null;


        	enterRule();

        try {
            // InternalHale.g:1828:2: ( ( () ( (lv_type_1_0= RULE_PRIMITIVE_TYPE ) ) ) )
            // InternalHale.g:1829:2: ( () ( (lv_type_1_0= RULE_PRIMITIVE_TYPE ) ) )
            {
            // InternalHale.g:1829:2: ( () ( (lv_type_1_0= RULE_PRIMITIVE_TYPE ) ) )
            // InternalHale.g:1830:3: () ( (lv_type_1_0= RULE_PRIMITIVE_TYPE ) )
            {
            // InternalHale.g:1830:3: ()
            // InternalHale.g:1831:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPrimitiveTypeAccess().getPrimitiveTypeAction_0(),
            					current);
            			

            }

            // InternalHale.g:1837:3: ( (lv_type_1_0= RULE_PRIMITIVE_TYPE ) )
            // InternalHale.g:1838:4: (lv_type_1_0= RULE_PRIMITIVE_TYPE )
            {
            // InternalHale.g:1838:4: (lv_type_1_0= RULE_PRIMITIVE_TYPE )
            // InternalHale.g:1839:5: lv_type_1_0= RULE_PRIMITIVE_TYPE
            {
            lv_type_1_0=(Token)match(input,RULE_PRIMITIVE_TYPE,FOLLOW_2); 

            					newLeafNode(lv_type_1_0, grammarAccess.getPrimitiveTypeAccess().getTypePRIMITIVE_TYPETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPrimitiveTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_1_0,
            						"willburden.hale.Hale.PRIMITIVE_TYPE");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitiveType"


    // $ANTLR start "entryRuleLetBinding"
    // InternalHale.g:1859:1: entryRuleLetBinding returns [EObject current=null] : iv_ruleLetBinding= ruleLetBinding EOF ;
    public final EObject entryRuleLetBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetBinding = null;


        try {
            // InternalHale.g:1859:51: (iv_ruleLetBinding= ruleLetBinding EOF )
            // InternalHale.g:1860:2: iv_ruleLetBinding= ruleLetBinding EOF
            {
             newCompositeNode(grammarAccess.getLetBindingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLetBinding=ruleLetBinding();

            state._fsp--;

             current =iv_ruleLetBinding; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLetBinding"


    // $ANTLR start "ruleLetBinding"
    // InternalHale.g:1866:1: ruleLetBinding returns [EObject current=null] : ( () otherlv_1= 'let' ( (lv_mutable_2_0= 'mut' ) )? ( (lv_name_3_0= RULE_ID ) ) ( (lv_type_4_0= ruleTypeAnnotation ) )? otherlv_5= '=' ( (lv_expression_6_0= ruleExpression ) ) ) ;
    public final EObject ruleLetBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_mutable_2_0=null;
        Token lv_name_3_0=null;
        Token otherlv_5=null;
        EObject lv_type_4_0 = null;

        EObject lv_expression_6_0 = null;



        	enterRule();

        try {
            // InternalHale.g:1872:2: ( ( () otherlv_1= 'let' ( (lv_mutable_2_0= 'mut' ) )? ( (lv_name_3_0= RULE_ID ) ) ( (lv_type_4_0= ruleTypeAnnotation ) )? otherlv_5= '=' ( (lv_expression_6_0= ruleExpression ) ) ) )
            // InternalHale.g:1873:2: ( () otherlv_1= 'let' ( (lv_mutable_2_0= 'mut' ) )? ( (lv_name_3_0= RULE_ID ) ) ( (lv_type_4_0= ruleTypeAnnotation ) )? otherlv_5= '=' ( (lv_expression_6_0= ruleExpression ) ) )
            {
            // InternalHale.g:1873:2: ( () otherlv_1= 'let' ( (lv_mutable_2_0= 'mut' ) )? ( (lv_name_3_0= RULE_ID ) ) ( (lv_type_4_0= ruleTypeAnnotation ) )? otherlv_5= '=' ( (lv_expression_6_0= ruleExpression ) ) )
            // InternalHale.g:1874:3: () otherlv_1= 'let' ( (lv_mutable_2_0= 'mut' ) )? ( (lv_name_3_0= RULE_ID ) ) ( (lv_type_4_0= ruleTypeAnnotation ) )? otherlv_5= '=' ( (lv_expression_6_0= ruleExpression ) )
            {
            // InternalHale.g:1874:3: ()
            // InternalHale.g:1875:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLetBindingAccess().getLetBindingAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getLetBindingAccess().getLetKeyword_1());
            		
            // InternalHale.g:1885:3: ( (lv_mutable_2_0= 'mut' ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==40) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalHale.g:1886:4: (lv_mutable_2_0= 'mut' )
                    {
                    // InternalHale.g:1886:4: (lv_mutable_2_0= 'mut' )
                    // InternalHale.g:1887:5: lv_mutable_2_0= 'mut'
                    {
                    lv_mutable_2_0=(Token)match(input,40,FOLLOW_26); 

                    					newLeafNode(lv_mutable_2_0, grammarAccess.getLetBindingAccess().getMutableMutKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLetBindingRule());
                    					}
                    					setWithLastConsumed(current, "mutable", lv_mutable_2_0 != null, "mut");
                    				

                    }


                    }
                    break;

            }

            // InternalHale.g:1899:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalHale.g:1900:4: (lv_name_3_0= RULE_ID )
            {
            // InternalHale.g:1900:4: (lv_name_3_0= RULE_ID )
            // InternalHale.g:1901:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(lv_name_3_0, grammarAccess.getLetBindingAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLetBindingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"willburden.hale.Hale.ID");
            				

            }


            }

            // InternalHale.g:1917:3: ( (lv_type_4_0= ruleTypeAnnotation ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==36) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalHale.g:1918:4: (lv_type_4_0= ruleTypeAnnotation )
                    {
                    // InternalHale.g:1918:4: (lv_type_4_0= ruleTypeAnnotation )
                    // InternalHale.g:1919:5: lv_type_4_0= ruleTypeAnnotation
                    {

                    					newCompositeNode(grammarAccess.getLetBindingAccess().getTypeTypeAnnotationParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_28);
                    lv_type_4_0=ruleTypeAnnotation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLetBindingRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_4_0,
                    						"willburden.hale.Hale.TypeAnnotation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,41,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getLetBindingAccess().getEqualsSignKeyword_5());
            		
            // InternalHale.g:1940:3: ( (lv_expression_6_0= ruleExpression ) )
            // InternalHale.g:1941:4: (lv_expression_6_0= ruleExpression )
            {
            // InternalHale.g:1941:4: (lv_expression_6_0= ruleExpression )
            // InternalHale.g:1942:5: lv_expression_6_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getLetBindingAccess().getExpressionExpressionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_6_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLetBindingRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_6_0,
            						"willburden.hale.Hale.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLetBinding"


    // $ANTLR start "entryRuleBindingReference"
    // InternalHale.g:1963:1: entryRuleBindingReference returns [EObject current=null] : iv_ruleBindingReference= ruleBindingReference EOF ;
    public final EObject entryRuleBindingReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBindingReference = null;


        try {
            // InternalHale.g:1963:57: (iv_ruleBindingReference= ruleBindingReference EOF )
            // InternalHale.g:1964:2: iv_ruleBindingReference= ruleBindingReference EOF
            {
             newCompositeNode(grammarAccess.getBindingReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBindingReference=ruleBindingReference();

            state._fsp--;

             current =iv_ruleBindingReference; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBindingReference"


    // $ANTLR start "ruleBindingReference"
    // InternalHale.g:1970:1: ruleBindingReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleBindingReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalHale.g:1976:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalHale.g:1977:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalHale.g:1977:2: ( (otherlv_0= RULE_ID ) )
            // InternalHale.g:1978:3: (otherlv_0= RULE_ID )
            {
            // InternalHale.g:1978:3: (otherlv_0= RULE_ID )
            // InternalHale.g:1979:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getBindingReferenceRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getBindingReferenceAccess().getBindingBindingCrossReference_0());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBindingReference"


    // $ANTLR start "entryRuleAssignment"
    // InternalHale.g:1993:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalHale.g:1993:51: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalHale.g:1994:2: iv_ruleAssignment= ruleAssignment EOF
            {
             newCompositeNode(grammarAccess.getAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;

             current =iv_ruleAssignment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalHale.g:2000:1: ruleAssignment returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalHale.g:2006:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) ) )
            // InternalHale.g:2007:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // InternalHale.g:2007:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) )
            // InternalHale.g:2008:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) )
            {
            // InternalHale.g:2008:3: ( (otherlv_0= RULE_ID ) )
            // InternalHale.g:2009:4: (otherlv_0= RULE_ID )
            {
            // InternalHale.g:2009:4: (otherlv_0= RULE_ID )
            // InternalHale.g:2010:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssignmentRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(otherlv_0, grammarAccess.getAssignmentAccess().getBindingBindingCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,41,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1());
            		
            // InternalHale.g:2025:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalHale.g:2026:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalHale.g:2026:4: (lv_expression_2_0= ruleExpression )
            // InternalHale.g:2027:5: lv_expression_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getAssignmentAccess().getExpressionExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssignmentRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_2_0,
            						"willburden.hale.Hale.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleInput"
    // InternalHale.g:2048:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // InternalHale.g:2048:46: (iv_ruleInput= ruleInput EOF )
            // InternalHale.g:2049:2: iv_ruleInput= ruleInput EOF
            {
             newCompositeNode(grammarAccess.getInputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInput=ruleInput();

            state._fsp--;

             current =iv_ruleInput; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // InternalHale.g:2055:1: ruleInput returns [EObject current=null] : ( () otherlv_1= 'input' ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalHale.g:2061:2: ( ( () otherlv_1= 'input' ) )
            // InternalHale.g:2062:2: ( () otherlv_1= 'input' )
            {
            // InternalHale.g:2062:2: ( () otherlv_1= 'input' )
            // InternalHale.g:2063:3: () otherlv_1= 'input'
            {
            // InternalHale.g:2063:3: ()
            // InternalHale.g:2064:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInputAccess().getInputAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,42,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getInputAccess().getInputKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRulePrint"
    // InternalHale.g:2078:1: entryRulePrint returns [EObject current=null] : iv_rulePrint= rulePrint EOF ;
    public final EObject entryRulePrint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrint = null;


        try {
            // InternalHale.g:2078:46: (iv_rulePrint= rulePrint EOF )
            // InternalHale.g:2079:2: iv_rulePrint= rulePrint EOF
            {
             newCompositeNode(grammarAccess.getPrintRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrint=rulePrint();

            state._fsp--;

             current =iv_rulePrint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrint"


    // $ANTLR start "rulePrint"
    // InternalHale.g:2085:1: rulePrint returns [EObject current=null] : (otherlv_0= 'print' ( (lv_expression_1_0= ruleExpression ) ) ) ;
    public final EObject rulePrint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalHale.g:2091:2: ( (otherlv_0= 'print' ( (lv_expression_1_0= ruleExpression ) ) ) )
            // InternalHale.g:2092:2: (otherlv_0= 'print' ( (lv_expression_1_0= ruleExpression ) ) )
            {
            // InternalHale.g:2092:2: (otherlv_0= 'print' ( (lv_expression_1_0= ruleExpression ) ) )
            // InternalHale.g:2093:3: otherlv_0= 'print' ( (lv_expression_1_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getPrintAccess().getPrintKeyword_0());
            		
            // InternalHale.g:2097:3: ( (lv_expression_1_0= ruleExpression ) )
            // InternalHale.g:2098:4: (lv_expression_1_0= ruleExpression )
            {
            // InternalHale.g:2098:4: (lv_expression_1_0= ruleExpression )
            // InternalHale.g:2099:5: lv_expression_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getPrintAccess().getExpressionExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPrintRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_1_0,
            						"willburden.hale.Hale.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrint"


    // $ANTLR start "entryRuleIf"
    // InternalHale.g:2120:1: entryRuleIf returns [EObject current=null] : iv_ruleIf= ruleIf EOF ;
    public final EObject entryRuleIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIf = null;


        try {
            // InternalHale.g:2120:43: (iv_ruleIf= ruleIf EOF )
            // InternalHale.g:2121:2: iv_ruleIf= ruleIf EOF
            {
             newCompositeNode(grammarAccess.getIfRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIf=ruleIf();

            state._fsp--;

             current =iv_ruleIf; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIf"


    // $ANTLR start "ruleIf"
    // InternalHale.g:2127:1: ruleIf returns [EObject current=null] : (otherlv_0= 'if' (this_IfLet_1= ruleIfLet | this_IfConditions_2= ruleIfConditions ) ) ;
    public final EObject ruleIf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_IfLet_1 = null;

        EObject this_IfConditions_2 = null;



        	enterRule();

        try {
            // InternalHale.g:2133:2: ( (otherlv_0= 'if' (this_IfLet_1= ruleIfLet | this_IfConditions_2= ruleIfConditions ) ) )
            // InternalHale.g:2134:2: (otherlv_0= 'if' (this_IfLet_1= ruleIfLet | this_IfConditions_2= ruleIfConditions ) )
            {
            // InternalHale.g:2134:2: (otherlv_0= 'if' (this_IfLet_1= ruleIfLet | this_IfConditions_2= ruleIfConditions ) )
            // InternalHale.g:2135:3: otherlv_0= 'if' (this_IfLet_1= ruleIfLet | this_IfConditions_2= ruleIfConditions )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getIfAccess().getIfKeyword_0());
            		
            // InternalHale.g:2139:3: (this_IfLet_1= ruleIfLet | this_IfConditions_2= ruleIfConditions )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==39) ) {
                alt28=1;
            }
            else if ( ((LA28_0>=RULE_BOOLEAN && LA28_0<=RULE_STRING)||LA28_0==RULE_ID||LA28_0==25||(LA28_0>=31 && LA28_0<=32)||LA28_0==35||LA28_0==42) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalHale.g:2140:4: this_IfLet_1= ruleIfLet
                    {

                    				newCompositeNode(grammarAccess.getIfAccess().getIfLetParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_2);
                    this_IfLet_1=ruleIfLet();

                    state._fsp--;


                    				current = this_IfLet_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalHale.g:2149:4: this_IfConditions_2= ruleIfConditions
                    {

                    				newCompositeNode(grammarAccess.getIfAccess().getIfConditionsParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_IfConditions_2=ruleIfConditions();

                    state._fsp--;


                    				current = this_IfConditions_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIf"


    // $ANTLR start "entryRuleIfLet"
    // InternalHale.g:2162:1: entryRuleIfLet returns [EObject current=null] : iv_ruleIfLet= ruleIfLet EOF ;
    public final EObject entryRuleIfLet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfLet = null;


        try {
            // InternalHale.g:2162:46: (iv_ruleIfLet= ruleIfLet EOF )
            // InternalHale.g:2163:2: iv_ruleIfLet= ruleIfLet EOF
            {
             newCompositeNode(grammarAccess.getIfLetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIfLet=ruleIfLet();

            state._fsp--;

             current =iv_ruleIfLet; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfLet"


    // $ANTLR start "ruleIfLet"
    // InternalHale.g:2169:1: ruleIfLet returns [EObject current=null] : ( () otherlv_1= 'let' ( (lv_name_2_0= RULE_ID ) ) ( (lv_type_3_0= ruleTypeAnnotation ) )? otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) ( (lv_ifBlock_6_0= ruleBracedBlock ) ) (otherlv_7= 'else' ( (lv_elseLet_8_0= ruleElseLet ) ) )? ) ;
    public final EObject ruleIfLet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_type_3_0 = null;

        EObject lv_expression_5_0 = null;

        EObject lv_ifBlock_6_0 = null;

        EObject lv_elseLet_8_0 = null;



        	enterRule();

        try {
            // InternalHale.g:2175:2: ( ( () otherlv_1= 'let' ( (lv_name_2_0= RULE_ID ) ) ( (lv_type_3_0= ruleTypeAnnotation ) )? otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) ( (lv_ifBlock_6_0= ruleBracedBlock ) ) (otherlv_7= 'else' ( (lv_elseLet_8_0= ruleElseLet ) ) )? ) )
            // InternalHale.g:2176:2: ( () otherlv_1= 'let' ( (lv_name_2_0= RULE_ID ) ) ( (lv_type_3_0= ruleTypeAnnotation ) )? otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) ( (lv_ifBlock_6_0= ruleBracedBlock ) ) (otherlv_7= 'else' ( (lv_elseLet_8_0= ruleElseLet ) ) )? )
            {
            // InternalHale.g:2176:2: ( () otherlv_1= 'let' ( (lv_name_2_0= RULE_ID ) ) ( (lv_type_3_0= ruleTypeAnnotation ) )? otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) ( (lv_ifBlock_6_0= ruleBracedBlock ) ) (otherlv_7= 'else' ( (lv_elseLet_8_0= ruleElseLet ) ) )? )
            // InternalHale.g:2177:3: () otherlv_1= 'let' ( (lv_name_2_0= RULE_ID ) ) ( (lv_type_3_0= ruleTypeAnnotation ) )? otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) ( (lv_ifBlock_6_0= ruleBracedBlock ) ) (otherlv_7= 'else' ( (lv_elseLet_8_0= ruleElseLet ) ) )?
            {
            // InternalHale.g:2177:3: ()
            // InternalHale.g:2178:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIfLetAccess().getIfLetAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getIfLetAccess().getLetKeyword_1());
            		
            // InternalHale.g:2188:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalHale.g:2189:4: (lv_name_2_0= RULE_ID )
            {
            // InternalHale.g:2189:4: (lv_name_2_0= RULE_ID )
            // InternalHale.g:2190:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(lv_name_2_0, grammarAccess.getIfLetAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIfLetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"willburden.hale.Hale.ID");
            				

            }


            }

            // InternalHale.g:2206:3: ( (lv_type_3_0= ruleTypeAnnotation ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==36) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalHale.g:2207:4: (lv_type_3_0= ruleTypeAnnotation )
                    {
                    // InternalHale.g:2207:4: (lv_type_3_0= ruleTypeAnnotation )
                    // InternalHale.g:2208:5: lv_type_3_0= ruleTypeAnnotation
                    {

                    					newCompositeNode(grammarAccess.getIfLetAccess().getTypeTypeAnnotationParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_28);
                    lv_type_3_0=ruleTypeAnnotation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getIfLetRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_3_0,
                    						"willburden.hale.Hale.TypeAnnotation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,41,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getIfLetAccess().getEqualsSignKeyword_4());
            		
            // InternalHale.g:2229:3: ( (lv_expression_5_0= ruleExpression ) )
            // InternalHale.g:2230:4: (lv_expression_5_0= ruleExpression )
            {
            // InternalHale.g:2230:4: (lv_expression_5_0= ruleExpression )
            // InternalHale.g:2231:5: lv_expression_5_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getIfLetAccess().getExpressionExpressionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_29);
            lv_expression_5_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfLetRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_5_0,
            						"willburden.hale.Hale.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalHale.g:2248:3: ( (lv_ifBlock_6_0= ruleBracedBlock ) )
            // InternalHale.g:2249:4: (lv_ifBlock_6_0= ruleBracedBlock )
            {
            // InternalHale.g:2249:4: (lv_ifBlock_6_0= ruleBracedBlock )
            // InternalHale.g:2250:5: lv_ifBlock_6_0= ruleBracedBlock
            {

            					newCompositeNode(grammarAccess.getIfLetAccess().getIfBlockBracedBlockParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_30);
            lv_ifBlock_6_0=ruleBracedBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfLetRule());
            					}
            					set(
            						current,
            						"ifBlock",
            						lv_ifBlock_6_0,
            						"willburden.hale.Hale.BracedBlock");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalHale.g:2267:3: (otherlv_7= 'else' ( (lv_elseLet_8_0= ruleElseLet ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==45) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalHale.g:2268:4: otherlv_7= 'else' ( (lv_elseLet_8_0= ruleElseLet ) )
                    {
                    otherlv_7=(Token)match(input,45,FOLLOW_31); 

                    				newLeafNode(otherlv_7, grammarAccess.getIfLetAccess().getElseKeyword_7_0());
                    			
                    // InternalHale.g:2272:4: ( (lv_elseLet_8_0= ruleElseLet ) )
                    // InternalHale.g:2273:5: (lv_elseLet_8_0= ruleElseLet )
                    {
                    // InternalHale.g:2273:5: (lv_elseLet_8_0= ruleElseLet )
                    // InternalHale.g:2274:6: lv_elseLet_8_0= ruleElseLet
                    {

                    						newCompositeNode(grammarAccess.getIfLetAccess().getElseLetElseLetParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_elseLet_8_0=ruleElseLet();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIfLetRule());
                    						}
                    						set(
                    							current,
                    							"elseLet",
                    							lv_elseLet_8_0,
                    							"willburden.hale.Hale.ElseLet");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIfLet"


    // $ANTLR start "entryRuleElseLet"
    // InternalHale.g:2296:1: entryRuleElseLet returns [EObject current=null] : iv_ruleElseLet= ruleElseLet EOF ;
    public final EObject entryRuleElseLet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElseLet = null;


        try {
            // InternalHale.g:2296:48: (iv_ruleElseLet= ruleElseLet EOF )
            // InternalHale.g:2297:2: iv_ruleElseLet= ruleElseLet EOF
            {
             newCompositeNode(grammarAccess.getElseLetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElseLet=ruleElseLet();

            state._fsp--;

             current =iv_ruleElseLet; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElseLet"


    // $ANTLR start "ruleElseLet"
    // InternalHale.g:2303:1: ruleElseLet returns [EObject current=null] : ( () (otherlv_1= 'let' ( (lv_name_2_0= RULE_ID ) ) ( (lv_type_3_0= ruleTypeAnnotation ) )? )? ( (lv_elseBlock_4_0= ruleBracedBlock ) ) ) ;
    public final EObject ruleElseLet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        EObject lv_type_3_0 = null;

        EObject lv_elseBlock_4_0 = null;



        	enterRule();

        try {
            // InternalHale.g:2309:2: ( ( () (otherlv_1= 'let' ( (lv_name_2_0= RULE_ID ) ) ( (lv_type_3_0= ruleTypeAnnotation ) )? )? ( (lv_elseBlock_4_0= ruleBracedBlock ) ) ) )
            // InternalHale.g:2310:2: ( () (otherlv_1= 'let' ( (lv_name_2_0= RULE_ID ) ) ( (lv_type_3_0= ruleTypeAnnotation ) )? )? ( (lv_elseBlock_4_0= ruleBracedBlock ) ) )
            {
            // InternalHale.g:2310:2: ( () (otherlv_1= 'let' ( (lv_name_2_0= RULE_ID ) ) ( (lv_type_3_0= ruleTypeAnnotation ) )? )? ( (lv_elseBlock_4_0= ruleBracedBlock ) ) )
            // InternalHale.g:2311:3: () (otherlv_1= 'let' ( (lv_name_2_0= RULE_ID ) ) ( (lv_type_3_0= ruleTypeAnnotation ) )? )? ( (lv_elseBlock_4_0= ruleBracedBlock ) )
            {
            // InternalHale.g:2311:3: ()
            // InternalHale.g:2312:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getElseLetAccess().getElseLetAction_0(),
            					current);
            			

            }

            // InternalHale.g:2318:3: (otherlv_1= 'let' ( (lv_name_2_0= RULE_ID ) ) ( (lv_type_3_0= ruleTypeAnnotation ) )? )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==39) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalHale.g:2319:4: otherlv_1= 'let' ( (lv_name_2_0= RULE_ID ) ) ( (lv_type_3_0= ruleTypeAnnotation ) )?
                    {
                    otherlv_1=(Token)match(input,39,FOLLOW_26); 

                    				newLeafNode(otherlv_1, grammarAccess.getElseLetAccess().getLetKeyword_1_0());
                    			
                    // InternalHale.g:2323:4: ( (lv_name_2_0= RULE_ID ) )
                    // InternalHale.g:2324:5: (lv_name_2_0= RULE_ID )
                    {
                    // InternalHale.g:2324:5: (lv_name_2_0= RULE_ID )
                    // InternalHale.g:2325:6: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_32); 

                    						newLeafNode(lv_name_2_0, grammarAccess.getElseLetAccess().getNameIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getElseLetRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_0,
                    							"willburden.hale.Hale.ID");
                    					

                    }


                    }

                    // InternalHale.g:2341:4: ( (lv_type_3_0= ruleTypeAnnotation ) )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==36) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalHale.g:2342:5: (lv_type_3_0= ruleTypeAnnotation )
                            {
                            // InternalHale.g:2342:5: (lv_type_3_0= ruleTypeAnnotation )
                            // InternalHale.g:2343:6: lv_type_3_0= ruleTypeAnnotation
                            {

                            						newCompositeNode(grammarAccess.getElseLetAccess().getTypeTypeAnnotationParserRuleCall_1_2_0());
                            					
                            pushFollow(FOLLOW_29);
                            lv_type_3_0=ruleTypeAnnotation();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getElseLetRule());
                            						}
                            						set(
                            							current,
                            							"type",
                            							lv_type_3_0,
                            							"willburden.hale.Hale.TypeAnnotation");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalHale.g:2361:3: ( (lv_elseBlock_4_0= ruleBracedBlock ) )
            // InternalHale.g:2362:4: (lv_elseBlock_4_0= ruleBracedBlock )
            {
            // InternalHale.g:2362:4: (lv_elseBlock_4_0= ruleBracedBlock )
            // InternalHale.g:2363:5: lv_elseBlock_4_0= ruleBracedBlock
            {

            					newCompositeNode(grammarAccess.getElseLetAccess().getElseBlockBracedBlockParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_elseBlock_4_0=ruleBracedBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getElseLetRule());
            					}
            					set(
            						current,
            						"elseBlock",
            						lv_elseBlock_4_0,
            						"willburden.hale.Hale.BracedBlock");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElseLet"


    // $ANTLR start "entryRuleIfConditions"
    // InternalHale.g:2384:1: entryRuleIfConditions returns [EObject current=null] : iv_ruleIfConditions= ruleIfConditions EOF ;
    public final EObject entryRuleIfConditions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfConditions = null;


        try {
            // InternalHale.g:2384:53: (iv_ruleIfConditions= ruleIfConditions EOF )
            // InternalHale.g:2385:2: iv_ruleIfConditions= ruleIfConditions EOF
            {
             newCompositeNode(grammarAccess.getIfConditionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIfConditions=ruleIfConditions();

            state._fsp--;

             current =iv_ruleIfConditions; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfConditions"


    // $ANTLR start "ruleIfConditions"
    // InternalHale.g:2391:1: ruleIfConditions returns [EObject current=null] : ( () ( (lv_conditions_1_0= ruleExpression ) ) ( (lv_ifBlocks_2_0= ruleBracedBlock ) ) (otherlv_3= 'elseif' ( (lv_conditions_4_0= ruleExpression ) ) ( (lv_ifBlocks_5_0= ruleBracedBlock ) ) )* (otherlv_6= 'else' ( (lv_elseBlock_7_0= ruleBracedBlock ) ) )? ) ;
    public final EObject ruleIfConditions() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_conditions_1_0 = null;

        EObject lv_ifBlocks_2_0 = null;

        EObject lv_conditions_4_0 = null;

        EObject lv_ifBlocks_5_0 = null;

        EObject lv_elseBlock_7_0 = null;



        	enterRule();

        try {
            // InternalHale.g:2397:2: ( ( () ( (lv_conditions_1_0= ruleExpression ) ) ( (lv_ifBlocks_2_0= ruleBracedBlock ) ) (otherlv_3= 'elseif' ( (lv_conditions_4_0= ruleExpression ) ) ( (lv_ifBlocks_5_0= ruleBracedBlock ) ) )* (otherlv_6= 'else' ( (lv_elseBlock_7_0= ruleBracedBlock ) ) )? ) )
            // InternalHale.g:2398:2: ( () ( (lv_conditions_1_0= ruleExpression ) ) ( (lv_ifBlocks_2_0= ruleBracedBlock ) ) (otherlv_3= 'elseif' ( (lv_conditions_4_0= ruleExpression ) ) ( (lv_ifBlocks_5_0= ruleBracedBlock ) ) )* (otherlv_6= 'else' ( (lv_elseBlock_7_0= ruleBracedBlock ) ) )? )
            {
            // InternalHale.g:2398:2: ( () ( (lv_conditions_1_0= ruleExpression ) ) ( (lv_ifBlocks_2_0= ruleBracedBlock ) ) (otherlv_3= 'elseif' ( (lv_conditions_4_0= ruleExpression ) ) ( (lv_ifBlocks_5_0= ruleBracedBlock ) ) )* (otherlv_6= 'else' ( (lv_elseBlock_7_0= ruleBracedBlock ) ) )? )
            // InternalHale.g:2399:3: () ( (lv_conditions_1_0= ruleExpression ) ) ( (lv_ifBlocks_2_0= ruleBracedBlock ) ) (otherlv_3= 'elseif' ( (lv_conditions_4_0= ruleExpression ) ) ( (lv_ifBlocks_5_0= ruleBracedBlock ) ) )* (otherlv_6= 'else' ( (lv_elseBlock_7_0= ruleBracedBlock ) ) )?
            {
            // InternalHale.g:2399:3: ()
            // InternalHale.g:2400:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIfConditionsAccess().getIfConditionsAction_0(),
            					current);
            			

            }

            // InternalHale.g:2406:3: ( (lv_conditions_1_0= ruleExpression ) )
            // InternalHale.g:2407:4: (lv_conditions_1_0= ruleExpression )
            {
            // InternalHale.g:2407:4: (lv_conditions_1_0= ruleExpression )
            // InternalHale.g:2408:5: lv_conditions_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getIfConditionsAccess().getConditionsExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_29);
            lv_conditions_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfConditionsRule());
            					}
            					add(
            						current,
            						"conditions",
            						lv_conditions_1_0,
            						"willburden.hale.Hale.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalHale.g:2425:3: ( (lv_ifBlocks_2_0= ruleBracedBlock ) )
            // InternalHale.g:2426:4: (lv_ifBlocks_2_0= ruleBracedBlock )
            {
            // InternalHale.g:2426:4: (lv_ifBlocks_2_0= ruleBracedBlock )
            // InternalHale.g:2427:5: lv_ifBlocks_2_0= ruleBracedBlock
            {

            					newCompositeNode(grammarAccess.getIfConditionsAccess().getIfBlocksBracedBlockParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_33);
            lv_ifBlocks_2_0=ruleBracedBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfConditionsRule());
            					}
            					add(
            						current,
            						"ifBlocks",
            						lv_ifBlocks_2_0,
            						"willburden.hale.Hale.BracedBlock");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalHale.g:2444:3: (otherlv_3= 'elseif' ( (lv_conditions_4_0= ruleExpression ) ) ( (lv_ifBlocks_5_0= ruleBracedBlock ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==46) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalHale.g:2445:4: otherlv_3= 'elseif' ( (lv_conditions_4_0= ruleExpression ) ) ( (lv_ifBlocks_5_0= ruleBracedBlock ) )
            	    {
            	    otherlv_3=(Token)match(input,46,FOLLOW_8); 

            	    				newLeafNode(otherlv_3, grammarAccess.getIfConditionsAccess().getElseifKeyword_3_0());
            	    			
            	    // InternalHale.g:2449:4: ( (lv_conditions_4_0= ruleExpression ) )
            	    // InternalHale.g:2450:5: (lv_conditions_4_0= ruleExpression )
            	    {
            	    // InternalHale.g:2450:5: (lv_conditions_4_0= ruleExpression )
            	    // InternalHale.g:2451:6: lv_conditions_4_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getIfConditionsAccess().getConditionsExpressionParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_29);
            	    lv_conditions_4_0=ruleExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getIfConditionsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"conditions",
            	    							lv_conditions_4_0,
            	    							"willburden.hale.Hale.Expression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalHale.g:2468:4: ( (lv_ifBlocks_5_0= ruleBracedBlock ) )
            	    // InternalHale.g:2469:5: (lv_ifBlocks_5_0= ruleBracedBlock )
            	    {
            	    // InternalHale.g:2469:5: (lv_ifBlocks_5_0= ruleBracedBlock )
            	    // InternalHale.g:2470:6: lv_ifBlocks_5_0= ruleBracedBlock
            	    {

            	    						newCompositeNode(grammarAccess.getIfConditionsAccess().getIfBlocksBracedBlockParserRuleCall_3_2_0());
            	    					
            	    pushFollow(FOLLOW_33);
            	    lv_ifBlocks_5_0=ruleBracedBlock();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getIfConditionsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ifBlocks",
            	    							lv_ifBlocks_5_0,
            	    							"willburden.hale.Hale.BracedBlock");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            // InternalHale.g:2488:3: (otherlv_6= 'else' ( (lv_elseBlock_7_0= ruleBracedBlock ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==45) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalHale.g:2489:4: otherlv_6= 'else' ( (lv_elseBlock_7_0= ruleBracedBlock ) )
                    {
                    otherlv_6=(Token)match(input,45,FOLLOW_29); 

                    				newLeafNode(otherlv_6, grammarAccess.getIfConditionsAccess().getElseKeyword_4_0());
                    			
                    // InternalHale.g:2493:4: ( (lv_elseBlock_7_0= ruleBracedBlock ) )
                    // InternalHale.g:2494:5: (lv_elseBlock_7_0= ruleBracedBlock )
                    {
                    // InternalHale.g:2494:5: (lv_elseBlock_7_0= ruleBracedBlock )
                    // InternalHale.g:2495:6: lv_elseBlock_7_0= ruleBracedBlock
                    {

                    						newCompositeNode(grammarAccess.getIfConditionsAccess().getElseBlockBracedBlockParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_elseBlock_7_0=ruleBracedBlock();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIfConditionsRule());
                    						}
                    						set(
                    							current,
                    							"elseBlock",
                    							lv_elseBlock_7_0,
                    							"willburden.hale.Hale.BracedBlock");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIfConditions"


    // $ANTLR start "entryRuleWhile"
    // InternalHale.g:2517:1: entryRuleWhile returns [EObject current=null] : iv_ruleWhile= ruleWhile EOF ;
    public final EObject entryRuleWhile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhile = null;


        try {
            // InternalHale.g:2517:46: (iv_ruleWhile= ruleWhile EOF )
            // InternalHale.g:2518:2: iv_ruleWhile= ruleWhile EOF
            {
             newCompositeNode(grammarAccess.getWhileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWhile=ruleWhile();

            state._fsp--;

             current =iv_ruleWhile; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhile"


    // $ANTLR start "ruleWhile"
    // InternalHale.g:2524:1: ruleWhile returns [EObject current=null] : (otherlv_0= 'while' ( (lv_condition_1_0= ruleExpression ) ) ( (lv_block_2_0= ruleBracedBlock ) ) ) ;
    public final EObject ruleWhile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_condition_1_0 = null;

        EObject lv_block_2_0 = null;



        	enterRule();

        try {
            // InternalHale.g:2530:2: ( (otherlv_0= 'while' ( (lv_condition_1_0= ruleExpression ) ) ( (lv_block_2_0= ruleBracedBlock ) ) ) )
            // InternalHale.g:2531:2: (otherlv_0= 'while' ( (lv_condition_1_0= ruleExpression ) ) ( (lv_block_2_0= ruleBracedBlock ) ) )
            {
            // InternalHale.g:2531:2: (otherlv_0= 'while' ( (lv_condition_1_0= ruleExpression ) ) ( (lv_block_2_0= ruleBracedBlock ) ) )
            // InternalHale.g:2532:3: otherlv_0= 'while' ( (lv_condition_1_0= ruleExpression ) ) ( (lv_block_2_0= ruleBracedBlock ) )
            {
            otherlv_0=(Token)match(input,47,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getWhileAccess().getWhileKeyword_0());
            		
            // InternalHale.g:2536:3: ( (lv_condition_1_0= ruleExpression ) )
            // InternalHale.g:2537:4: (lv_condition_1_0= ruleExpression )
            {
            // InternalHale.g:2537:4: (lv_condition_1_0= ruleExpression )
            // InternalHale.g:2538:5: lv_condition_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getWhileAccess().getConditionExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_29);
            lv_condition_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhileRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_1_0,
            						"willburden.hale.Hale.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalHale.g:2555:3: ( (lv_block_2_0= ruleBracedBlock ) )
            // InternalHale.g:2556:4: (lv_block_2_0= ruleBracedBlock )
            {
            // InternalHale.g:2556:4: (lv_block_2_0= ruleBracedBlock )
            // InternalHale.g:2557:5: lv_block_2_0= ruleBracedBlock
            {

            					newCompositeNode(grammarAccess.getWhileAccess().getBlockBracedBlockParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_block_2_0=ruleBracedBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhileRule());
            					}
            					set(
            						current,
            						"block",
            						lv_block_2_0,
            						"willburden.hale.Hale.BracedBlock");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhile"


    // $ANTLR start "entryRuleBreak"
    // InternalHale.g:2578:1: entryRuleBreak returns [EObject current=null] : iv_ruleBreak= ruleBreak EOF ;
    public final EObject entryRuleBreak() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBreak = null;


        try {
            // InternalHale.g:2578:46: (iv_ruleBreak= ruleBreak EOF )
            // InternalHale.g:2579:2: iv_ruleBreak= ruleBreak EOF
            {
             newCompositeNode(grammarAccess.getBreakRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBreak=ruleBreak();

            state._fsp--;

             current =iv_ruleBreak; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBreak"


    // $ANTLR start "ruleBreak"
    // InternalHale.g:2585:1: ruleBreak returns [EObject current=null] : ( () otherlv_1= 'break' ) ;
    public final EObject ruleBreak() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalHale.g:2591:2: ( ( () otherlv_1= 'break' ) )
            // InternalHale.g:2592:2: ( () otherlv_1= 'break' )
            {
            // InternalHale.g:2592:2: ( () otherlv_1= 'break' )
            // InternalHale.g:2593:3: () otherlv_1= 'break'
            {
            // InternalHale.g:2593:3: ()
            // InternalHale.g:2594:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBreakAccess().getBreakAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,48,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getBreakAccess().getBreakKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBreak"


    // $ANTLR start "entryRuleFunction"
    // InternalHale.g:2608:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalHale.g:2608:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalHale.g:2609:2: iv_ruleFunction= ruleFunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunction=ruleFunction();

            state._fsp--;

             current =iv_ruleFunction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalHale.g:2615:1: ruleFunction returns [EObject current=null] : ( () otherlv_1= 'function' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* (otherlv_7= ',' )? )? otherlv_8= ')' ( (lv_returnType_9_0= ruleTypeAnnotation ) )? ( (lv_body_10_0= ruleBracedBlock ) ) ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_parameters_4_0 = null;

        EObject lv_parameters_6_0 = null;

        EObject lv_returnType_9_0 = null;

        EObject lv_body_10_0 = null;



        	enterRule();

        try {
            // InternalHale.g:2621:2: ( ( () otherlv_1= 'function' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* (otherlv_7= ',' )? )? otherlv_8= ')' ( (lv_returnType_9_0= ruleTypeAnnotation ) )? ( (lv_body_10_0= ruleBracedBlock ) ) ) )
            // InternalHale.g:2622:2: ( () otherlv_1= 'function' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* (otherlv_7= ',' )? )? otherlv_8= ')' ( (lv_returnType_9_0= ruleTypeAnnotation ) )? ( (lv_body_10_0= ruleBracedBlock ) ) )
            {
            // InternalHale.g:2622:2: ( () otherlv_1= 'function' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* (otherlv_7= ',' )? )? otherlv_8= ')' ( (lv_returnType_9_0= ruleTypeAnnotation ) )? ( (lv_body_10_0= ruleBracedBlock ) ) )
            // InternalHale.g:2623:3: () otherlv_1= 'function' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* (otherlv_7= ',' )? )? otherlv_8= ')' ( (lv_returnType_9_0= ruleTypeAnnotation ) )? ( (lv_body_10_0= ruleBracedBlock ) )
            {
            // InternalHale.g:2623:3: ()
            // InternalHale.g:2624:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFunctionAccess().getFunctionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,49,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getFunctionAccess().getFunctionKeyword_1());
            		
            // InternalHale.g:2634:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalHale.g:2635:4: (lv_name_2_0= RULE_ID )
            {
            // InternalHale.g:2635:4: (lv_name_2_0= RULE_ID )
            // InternalHale.g:2636:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(lv_name_2_0, grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"willburden.hale.Hale.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,32,FOLLOW_34); 

            			newLeafNode(otherlv_3, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_3());
            		
            // InternalHale.g:2656:3: ( ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* (otherlv_7= ',' )? )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID||LA37_0==40) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalHale.g:2657:4: ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* (otherlv_7= ',' )?
                    {
                    // InternalHale.g:2657:4: ( (lv_parameters_4_0= ruleParameter ) )
                    // InternalHale.g:2658:5: (lv_parameters_4_0= ruleParameter )
                    {
                    // InternalHale.g:2658:5: (lv_parameters_4_0= ruleParameter )
                    // InternalHale.g:2659:6: lv_parameters_4_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getFunctionAccess().getParametersParameterParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_parameters_4_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFunctionRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_4_0,
                    							"willburden.hale.Hale.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalHale.g:2676:4: (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==33) ) {
                            int LA35_1 = input.LA(2);

                            if ( (LA35_1==RULE_ID||LA35_1==40) ) {
                                alt35=1;
                            }


                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalHale.g:2677:5: otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) )
                    	    {
                    	    otherlv_5=(Token)match(input,33,FOLLOW_25); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getFunctionAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalHale.g:2681:5: ( (lv_parameters_6_0= ruleParameter ) )
                    	    // InternalHale.g:2682:6: (lv_parameters_6_0= ruleParameter )
                    	    {
                    	    // InternalHale.g:2682:6: (lv_parameters_6_0= ruleParameter )
                    	    // InternalHale.g:2683:7: lv_parameters_6_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getFunctionAccess().getParametersParameterParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
                    	    lv_parameters_6_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFunctionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_6_0,
                    	    								"willburden.hale.Hale.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    // InternalHale.g:2701:4: (otherlv_7= ',' )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==33) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // InternalHale.g:2702:5: otherlv_7= ','
                            {
                            otherlv_7=(Token)match(input,33,FOLLOW_20); 

                            					newLeafNode(otherlv_7, grammarAccess.getFunctionAccess().getCommaKeyword_4_2());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,34,FOLLOW_32); 

            			newLeafNode(otherlv_8, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_5());
            		
            // InternalHale.g:2712:3: ( (lv_returnType_9_0= ruleTypeAnnotation ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==36) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalHale.g:2713:4: (lv_returnType_9_0= ruleTypeAnnotation )
                    {
                    // InternalHale.g:2713:4: (lv_returnType_9_0= ruleTypeAnnotation )
                    // InternalHale.g:2714:5: lv_returnType_9_0= ruleTypeAnnotation
                    {

                    					newCompositeNode(grammarAccess.getFunctionAccess().getReturnTypeTypeAnnotationParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_29);
                    lv_returnType_9_0=ruleTypeAnnotation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFunctionRule());
                    					}
                    					set(
                    						current,
                    						"returnType",
                    						lv_returnType_9_0,
                    						"willburden.hale.Hale.TypeAnnotation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalHale.g:2731:3: ( (lv_body_10_0= ruleBracedBlock ) )
            // InternalHale.g:2732:4: (lv_body_10_0= ruleBracedBlock )
            {
            // InternalHale.g:2732:4: (lv_body_10_0= ruleBracedBlock )
            // InternalHale.g:2733:5: lv_body_10_0= ruleBracedBlock
            {

            					newCompositeNode(grammarAccess.getFunctionAccess().getBodyBracedBlockParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_2);
            lv_body_10_0=ruleBracedBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_10_0,
            						"willburden.hale.Hale.BracedBlock");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleParameter"
    // InternalHale.g:2754:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalHale.g:2754:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalHale.g:2755:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalHale.g:2761:1: ruleParameter returns [EObject current=null] : ( () ( (lv_mutable_1_0= 'mut' ) )? ( (lv_name_2_0= RULE_ID ) ) ( (lv_type_3_0= ruleTypeAnnotation ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_mutable_1_0=null;
        Token lv_name_2_0=null;
        EObject lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalHale.g:2767:2: ( ( () ( (lv_mutable_1_0= 'mut' ) )? ( (lv_name_2_0= RULE_ID ) ) ( (lv_type_3_0= ruleTypeAnnotation ) ) ) )
            // InternalHale.g:2768:2: ( () ( (lv_mutable_1_0= 'mut' ) )? ( (lv_name_2_0= RULE_ID ) ) ( (lv_type_3_0= ruleTypeAnnotation ) ) )
            {
            // InternalHale.g:2768:2: ( () ( (lv_mutable_1_0= 'mut' ) )? ( (lv_name_2_0= RULE_ID ) ) ( (lv_type_3_0= ruleTypeAnnotation ) ) )
            // InternalHale.g:2769:3: () ( (lv_mutable_1_0= 'mut' ) )? ( (lv_name_2_0= RULE_ID ) ) ( (lv_type_3_0= ruleTypeAnnotation ) )
            {
            // InternalHale.g:2769:3: ()
            // InternalHale.g:2770:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterAccess().getParameterAction_0(),
            					current);
            			

            }

            // InternalHale.g:2776:3: ( (lv_mutable_1_0= 'mut' ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==40) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalHale.g:2777:4: (lv_mutable_1_0= 'mut' )
                    {
                    // InternalHale.g:2777:4: (lv_mutable_1_0= 'mut' )
                    // InternalHale.g:2778:5: lv_mutable_1_0= 'mut'
                    {
                    lv_mutable_1_0=(Token)match(input,40,FOLLOW_26); 

                    					newLeafNode(lv_mutable_1_0, grammarAccess.getParameterAccess().getMutableMutKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getParameterRule());
                    					}
                    					setWithLastConsumed(current, "mutable", lv_mutable_1_0 != null, "mut");
                    				

                    }


                    }
                    break;

            }

            // InternalHale.g:2790:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalHale.g:2791:4: (lv_name_2_0= RULE_ID )
            {
            // InternalHale.g:2791:4: (lv_name_2_0= RULE_ID )
            // InternalHale.g:2792:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_35); 

            					newLeafNode(lv_name_2_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"willburden.hale.Hale.ID");
            				

            }


            }

            // InternalHale.g:2808:3: ( (lv_type_3_0= ruleTypeAnnotation ) )
            // InternalHale.g:2809:4: (lv_type_3_0= ruleTypeAnnotation )
            {
            // InternalHale.g:2809:4: (lv_type_3_0= ruleTypeAnnotation )
            // InternalHale.g:2810:5: lv_type_3_0= ruleTypeAnnotation
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getTypeTypeAnnotationParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_3_0=ruleTypeAnnotation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"willburden.hale.Hale.TypeAnnotation");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleReturn"
    // InternalHale.g:2831:1: entryRuleReturn returns [EObject current=null] : iv_ruleReturn= ruleReturn EOF ;
    public final EObject entryRuleReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturn = null;


        try {
            // InternalHale.g:2831:47: (iv_ruleReturn= ruleReturn EOF )
            // InternalHale.g:2832:2: iv_ruleReturn= ruleReturn EOF
            {
             newCompositeNode(grammarAccess.getReturnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReturn=ruleReturn();

            state._fsp--;

             current =iv_ruleReturn; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReturn"


    // $ANTLR start "ruleReturn"
    // InternalHale.g:2838:1: ruleReturn returns [EObject current=null] : ( () otherlv_1= 'return' ( (lv_expression_2_0= ruleExpression ) )? ) ;
    public final EObject ruleReturn() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalHale.g:2844:2: ( ( () otherlv_1= 'return' ( (lv_expression_2_0= ruleExpression ) )? ) )
            // InternalHale.g:2845:2: ( () otherlv_1= 'return' ( (lv_expression_2_0= ruleExpression ) )? )
            {
            // InternalHale.g:2845:2: ( () otherlv_1= 'return' ( (lv_expression_2_0= ruleExpression ) )? )
            // InternalHale.g:2846:3: () otherlv_1= 'return' ( (lv_expression_2_0= ruleExpression ) )?
            {
            // InternalHale.g:2846:3: ()
            // InternalHale.g:2847:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getReturnAccess().getReturnAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,50,FOLLOW_36); 

            			newLeafNode(otherlv_1, grammarAccess.getReturnAccess().getReturnKeyword_1());
            		
            // InternalHale.g:2857:3: ( (lv_expression_2_0= ruleExpression ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=RULE_BOOLEAN && LA40_0<=RULE_STRING)||LA40_0==RULE_ID||LA40_0==25||(LA40_0>=31 && LA40_0<=32)||LA40_0==35||LA40_0==42) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalHale.g:2858:4: (lv_expression_2_0= ruleExpression )
                    {
                    // InternalHale.g:2858:4: (lv_expression_2_0= ruleExpression )
                    // InternalHale.g:2859:5: lv_expression_2_0= ruleExpression
                    {

                    					newCompositeNode(grammarAccess.getReturnAccess().getExpressionExpressionParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_expression_2_0=ruleExpression();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getReturnRule());
                    					}
                    					set(
                    						current,
                    						"expression",
                    						lv_expression_2_0,
                    						"willburden.hale.Hale.Expression");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReturn"


    // $ANTLR start "entryRuleThrow"
    // InternalHale.g:2880:1: entryRuleThrow returns [EObject current=null] : iv_ruleThrow= ruleThrow EOF ;
    public final EObject entryRuleThrow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThrow = null;


        try {
            // InternalHale.g:2880:46: (iv_ruleThrow= ruleThrow EOF )
            // InternalHale.g:2881:2: iv_ruleThrow= ruleThrow EOF
            {
             newCompositeNode(grammarAccess.getThrowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleThrow=ruleThrow();

            state._fsp--;

             current =iv_ruleThrow; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleThrow"


    // $ANTLR start "ruleThrow"
    // InternalHale.g:2887:1: ruleThrow returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleExpression ) )? ) ;
    public final EObject ruleThrow() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalHale.g:2893:2: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleExpression ) )? ) )
            // InternalHale.g:2894:2: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleExpression ) )? )
            {
            // InternalHale.g:2894:2: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleExpression ) )? )
            // InternalHale.g:2895:3: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleExpression ) )?
            {
            // InternalHale.g:2895:3: ()
            // InternalHale.g:2896:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getThrowAccess().getThrowAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,51,FOLLOW_36); 

            			newLeafNode(otherlv_1, grammarAccess.getThrowAccess().getThrowKeyword_1());
            		
            // InternalHale.g:2906:3: ( (lv_expression_2_0= ruleExpression ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=RULE_BOOLEAN && LA41_0<=RULE_STRING)||LA41_0==RULE_ID||LA41_0==25||(LA41_0>=31 && LA41_0<=32)||LA41_0==35||LA41_0==42) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalHale.g:2907:4: (lv_expression_2_0= ruleExpression )
                    {
                    // InternalHale.g:2907:4: (lv_expression_2_0= ruleExpression )
                    // InternalHale.g:2908:5: lv_expression_2_0= ruleExpression
                    {

                    					newCompositeNode(grammarAccess.getThrowAccess().getExpressionExpressionParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_expression_2_0=ruleExpression();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getThrowRule());
                    					}
                    					set(
                    						current,
                    						"expression",
                    						lv_expression_2_0,
                    						"willburden.hale.Hale.Expression");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleThrow"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000F9C8982003172L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000F9C8982007170L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000F9C8982002170L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000F00002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000001C000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000002100000080L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000F9C8D82002170L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000002500000080L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000010000000100L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000021000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000008000002000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001000002000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000010400000100L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x000F9C8982002172L});

}