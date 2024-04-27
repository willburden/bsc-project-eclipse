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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DOUBLE", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "';'", "'{'", "'}'", "'and'", "'or'", "'=='", "'!='", "'<='", "'<'", "'>='", "'>'", "'+'", "'-'", "'*'", "'/'", "'%'", "'**'", "'not'", "'('", "')'", "'let'", "'mut'", "'='", "'print'", "'if'", "'elseif'", "'else'", "'while'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=4;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__10=10;
    public static final int T__32=32;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

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
    // InternalHale.g:71:1: ruleHale returns [EObject current=null] : ( () ( (lv_block_1_0= ruleBlock ) ) ) ;
    public final EObject ruleHale() throws RecognitionException {
        EObject current = null;

        EObject lv_block_1_0 = null;



        	enterRule();

        try {
            // InternalHale.g:77:2: ( ( () ( (lv_block_1_0= ruleBlock ) ) ) )
            // InternalHale.g:78:2: ( () ( (lv_block_1_0= ruleBlock ) ) )
            {
            // InternalHale.g:78:2: ( () ( (lv_block_1_0= ruleBlock ) ) )
            // InternalHale.g:79:3: () ( (lv_block_1_0= ruleBlock ) )
            {
            // InternalHale.g:79:3: ()
            // InternalHale.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHaleAccess().getHaleAction_0(),
            					current);
            			

            }

            // InternalHale.g:86:3: ( (lv_block_1_0= ruleBlock ) )
            // InternalHale.g:87:4: (lv_block_1_0= ruleBlock )
            {
            // InternalHale.g:87:4: (lv_block_1_0= ruleBlock )
            // InternalHale.g:88:5: lv_block_1_0= ruleBlock
            {

            					newCompositeNode(grammarAccess.getHaleAccess().getBlockBlockParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_block_1_0=ruleBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHaleRule());
            					}
            					set(
            						current,
            						"block",
            						lv_block_1_0,
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

                if ( ((LA1_0>=RULE_DOUBLE && LA1_0<=RULE_ID)||LA1_0==11||LA1_0==22||(LA1_0>=27 && LA1_0<=28)||LA1_0==30||(LA1_0>=33 && LA1_0<=34)||LA1_0==37) ) {
                    alt1=1;
                }
                else if ( (LA1_0==10) ) {
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
            	    otherlv_2=(Token)match(input,10,FOLLOW_3); 

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
    // InternalHale.g:168:1: ruleStatement returns [EObject current=null] : (this_BracedBlock_0= ruleBracedBlock | this_If_1= ruleIf | this_While_2= ruleWhile | ( (this_Print_3= rulePrint | this_Binding_4= ruleBinding | this_Assignment_5= ruleAssignment | this_Expression_6= ruleExpression ) otherlv_7= ';' ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_7=null;
        EObject this_BracedBlock_0 = null;

        EObject this_If_1 = null;

        EObject this_While_2 = null;

        EObject this_Print_3 = null;

        EObject this_Binding_4 = null;

        EObject this_Assignment_5 = null;

        EObject this_Expression_6 = null;



        	enterRule();

        try {
            // InternalHale.g:174:2: ( (this_BracedBlock_0= ruleBracedBlock | this_If_1= ruleIf | this_While_2= ruleWhile | ( (this_Print_3= rulePrint | this_Binding_4= ruleBinding | this_Assignment_5= ruleAssignment | this_Expression_6= ruleExpression ) otherlv_7= ';' ) ) )
            // InternalHale.g:175:2: (this_BracedBlock_0= ruleBracedBlock | this_If_1= ruleIf | this_While_2= ruleWhile | ( (this_Print_3= rulePrint | this_Binding_4= ruleBinding | this_Assignment_5= ruleAssignment | this_Expression_6= ruleExpression ) otherlv_7= ';' ) )
            {
            // InternalHale.g:175:2: (this_BracedBlock_0= ruleBracedBlock | this_If_1= ruleIf | this_While_2= ruleWhile | ( (this_Print_3= rulePrint | this_Binding_4= ruleBinding | this_Assignment_5= ruleAssignment | this_Expression_6= ruleExpression ) otherlv_7= ';' ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 34:
                {
                alt3=2;
                }
                break;
            case 37:
                {
                alt3=3;
                }
                break;
            case RULE_DOUBLE:
            case RULE_STRING:
            case RULE_ID:
            case 22:
            case 27:
            case 28:
            case 30:
            case 33:
                {
                alt3=4;
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
                    // InternalHale.g:185:3: this_If_1= ruleIf
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getIfParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_If_1=ruleIf();

                    state._fsp--;


                    			current = this_If_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalHale.g:194:3: this_While_2= ruleWhile
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getWhileParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_While_2=ruleWhile();

                    state._fsp--;


                    			current = this_While_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalHale.g:203:3: ( (this_Print_3= rulePrint | this_Binding_4= ruleBinding | this_Assignment_5= ruleAssignment | this_Expression_6= ruleExpression ) otherlv_7= ';' )
                    {
                    // InternalHale.g:203:3: ( (this_Print_3= rulePrint | this_Binding_4= ruleBinding | this_Assignment_5= ruleAssignment | this_Expression_6= ruleExpression ) otherlv_7= ';' )
                    // InternalHale.g:204:4: (this_Print_3= rulePrint | this_Binding_4= ruleBinding | this_Assignment_5= ruleAssignment | this_Expression_6= ruleExpression ) otherlv_7= ';'
                    {
                    // InternalHale.g:204:4: (this_Print_3= rulePrint | this_Binding_4= ruleBinding | this_Assignment_5= ruleAssignment | this_Expression_6= ruleExpression )
                    int alt2=4;
                    switch ( input.LA(1) ) {
                    case 33:
                        {
                        alt2=1;
                        }
                        break;
                    case 30:
                        {
                        alt2=2;
                        }
                        break;
                    case RULE_ID:
                        {
                        int LA2_3 = input.LA(2);

                        if ( (LA2_3==10||(LA2_3>=13 && LA2_3<=26)) ) {
                            alt2=4;
                        }
                        else if ( (LA2_3==32) ) {
                            alt2=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 3, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_DOUBLE:
                    case RULE_STRING:
                    case 22:
                    case 27:
                    case 28:
                        {
                        alt2=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 0, input);

                        throw nvae;
                    }

                    switch (alt2) {
                        case 1 :
                            // InternalHale.g:205:5: this_Print_3= rulePrint
                            {

                            					newCompositeNode(grammarAccess.getStatementAccess().getPrintParserRuleCall_3_0_0());
                            				
                            pushFollow(FOLLOW_4);
                            this_Print_3=rulePrint();

                            state._fsp--;


                            					current = this_Print_3;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;
                        case 2 :
                            // InternalHale.g:214:5: this_Binding_4= ruleBinding
                            {

                            					newCompositeNode(grammarAccess.getStatementAccess().getBindingParserRuleCall_3_0_1());
                            				
                            pushFollow(FOLLOW_4);
                            this_Binding_4=ruleBinding();

                            state._fsp--;


                            					current = this_Binding_4;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;
                        case 3 :
                            // InternalHale.g:223:5: this_Assignment_5= ruleAssignment
                            {

                            					newCompositeNode(grammarAccess.getStatementAccess().getAssignmentParserRuleCall_3_0_2());
                            				
                            pushFollow(FOLLOW_4);
                            this_Assignment_5=ruleAssignment();

                            state._fsp--;


                            					current = this_Assignment_5;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;
                        case 4 :
                            // InternalHale.g:232:5: this_Expression_6= ruleExpression
                            {

                            					newCompositeNode(grammarAccess.getStatementAccess().getExpressionParserRuleCall_3_0_3());
                            				
                            pushFollow(FOLLOW_4);
                            this_Expression_6=ruleExpression();

                            state._fsp--;


                            					current = this_Expression_6;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,10,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getStatementAccess().getSemicolonKeyword_3_1());
                    			

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
    // InternalHale.g:250:1: entryRuleBracedBlock returns [EObject current=null] : iv_ruleBracedBlock= ruleBracedBlock EOF ;
    public final EObject entryRuleBracedBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBracedBlock = null;


        try {
            // InternalHale.g:250:52: (iv_ruleBracedBlock= ruleBracedBlock EOF )
            // InternalHale.g:251:2: iv_ruleBracedBlock= ruleBracedBlock EOF
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
    // InternalHale.g:257:1: ruleBracedBlock returns [EObject current=null] : (otherlv_0= '{' this_Block_1= ruleBlock otherlv_2= '}' ) ;
    public final EObject ruleBracedBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Block_1 = null;



        	enterRule();

        try {
            // InternalHale.g:263:2: ( (otherlv_0= '{' this_Block_1= ruleBlock otherlv_2= '}' ) )
            // InternalHale.g:264:2: (otherlv_0= '{' this_Block_1= ruleBlock otherlv_2= '}' )
            {
            // InternalHale.g:264:2: (otherlv_0= '{' this_Block_1= ruleBlock otherlv_2= '}' )
            // InternalHale.g:265:3: otherlv_0= '{' this_Block_1= ruleBlock otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getBracedBlockAccess().getLeftCurlyBracketKeyword_0());
            		

            			newCompositeNode(grammarAccess.getBracedBlockAccess().getBlockParserRuleCall_1());
            		
            pushFollow(FOLLOW_6);
            this_Block_1=ruleBlock();

            state._fsp--;


            			current = this_Block_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,12,FOLLOW_2); 

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
    // InternalHale.g:285:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalHale.g:285:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalHale.g:286:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalHale.g:292:1: ruleExpression returns [EObject current=null] : this_Expression7_0= ruleExpression7 ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Expression7_0 = null;



        	enterRule();

        try {
            // InternalHale.g:298:2: (this_Expression7_0= ruleExpression7 )
            // InternalHale.g:299:2: this_Expression7_0= ruleExpression7
            {

            		newCompositeNode(grammarAccess.getExpressionAccess().getExpression7ParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Expression7_0=ruleExpression7();

            state._fsp--;


            		current = this_Expression7_0;
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


    // $ANTLR start "entryRuleExpression7"
    // InternalHale.g:310:1: entryRuleExpression7 returns [EObject current=null] : iv_ruleExpression7= ruleExpression7 EOF ;
    public final EObject entryRuleExpression7() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression7 = null;


        try {
            // InternalHale.g:310:52: (iv_ruleExpression7= ruleExpression7 EOF )
            // InternalHale.g:311:2: iv_ruleExpression7= ruleExpression7 EOF
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
    // InternalHale.g:317:1: ruleExpression7 returns [EObject current=null] : (this_Expression6_0= ruleExpression6 ( ( () otherlv_2= 'and' ( (lv_right_3_0= ruleExpression6 ) ) ) | ( () otherlv_5= 'or' ( (lv_right_6_0= ruleExpression6 ) ) ) )* ) ;
    public final EObject ruleExpression7() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_Expression6_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalHale.g:323:2: ( (this_Expression6_0= ruleExpression6 ( ( () otherlv_2= 'and' ( (lv_right_3_0= ruleExpression6 ) ) ) | ( () otherlv_5= 'or' ( (lv_right_6_0= ruleExpression6 ) ) ) )* ) )
            // InternalHale.g:324:2: (this_Expression6_0= ruleExpression6 ( ( () otherlv_2= 'and' ( (lv_right_3_0= ruleExpression6 ) ) ) | ( () otherlv_5= 'or' ( (lv_right_6_0= ruleExpression6 ) ) ) )* )
            {
            // InternalHale.g:324:2: (this_Expression6_0= ruleExpression6 ( ( () otherlv_2= 'and' ( (lv_right_3_0= ruleExpression6 ) ) ) | ( () otherlv_5= 'or' ( (lv_right_6_0= ruleExpression6 ) ) ) )* )
            // InternalHale.g:325:3: this_Expression6_0= ruleExpression6 ( ( () otherlv_2= 'and' ( (lv_right_3_0= ruleExpression6 ) ) ) | ( () otherlv_5= 'or' ( (lv_right_6_0= ruleExpression6 ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpression7Access().getExpression6ParserRuleCall_0());
            		
            pushFollow(FOLLOW_7);
            this_Expression6_0=ruleExpression6();

            state._fsp--;


            			current = this_Expression6_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHale.g:333:3: ( ( () otherlv_2= 'and' ( (lv_right_3_0= ruleExpression6 ) ) ) | ( () otherlv_5= 'or' ( (lv_right_6_0= ruleExpression6 ) ) ) )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13) ) {
                    alt4=1;
                }
                else if ( (LA4_0==14) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalHale.g:334:4: ( () otherlv_2= 'and' ( (lv_right_3_0= ruleExpression6 ) ) )
            	    {
            	    // InternalHale.g:334:4: ( () otherlv_2= 'and' ( (lv_right_3_0= ruleExpression6 ) ) )
            	    // InternalHale.g:335:5: () otherlv_2= 'and' ( (lv_right_3_0= ruleExpression6 ) )
            	    {
            	    // InternalHale.g:335:5: ()
            	    // InternalHale.g:336:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpression7Access().getLogicalAndLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,13,FOLLOW_8); 

            	    					newLeafNode(otherlv_2, grammarAccess.getExpression7Access().getAndKeyword_1_0_1());
            	    				
            	    // InternalHale.g:346:5: ( (lv_right_3_0= ruleExpression6 ) )
            	    // InternalHale.g:347:6: (lv_right_3_0= ruleExpression6 )
            	    {
            	    // InternalHale.g:347:6: (lv_right_3_0= ruleExpression6 )
            	    // InternalHale.g:348:7: lv_right_3_0= ruleExpression6
            	    {

            	    							newCompositeNode(grammarAccess.getExpression7Access().getRightExpression6ParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_7);
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
            	    // InternalHale.g:367:4: ( () otherlv_5= 'or' ( (lv_right_6_0= ruleExpression6 ) ) )
            	    {
            	    // InternalHale.g:367:4: ( () otherlv_5= 'or' ( (lv_right_6_0= ruleExpression6 ) ) )
            	    // InternalHale.g:368:5: () otherlv_5= 'or' ( (lv_right_6_0= ruleExpression6 ) )
            	    {
            	    // InternalHale.g:368:5: ()
            	    // InternalHale.g:369:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpression7Access().getLogicalOrLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,14,FOLLOW_8); 

            	    					newLeafNode(otherlv_5, grammarAccess.getExpression7Access().getOrKeyword_1_1_1());
            	    				
            	    // InternalHale.g:379:5: ( (lv_right_6_0= ruleExpression6 ) )
            	    // InternalHale.g:380:6: (lv_right_6_0= ruleExpression6 )
            	    {
            	    // InternalHale.g:380:6: (lv_right_6_0= ruleExpression6 )
            	    // InternalHale.g:381:7: lv_right_6_0= ruleExpression6
            	    {

            	    							newCompositeNode(grammarAccess.getExpression7Access().getRightExpression6ParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_7);
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
    // $ANTLR end "ruleExpression7"


    // $ANTLR start "entryRuleExpression6"
    // InternalHale.g:404:1: entryRuleExpression6 returns [EObject current=null] : iv_ruleExpression6= ruleExpression6 EOF ;
    public final EObject entryRuleExpression6() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression6 = null;


        try {
            // InternalHale.g:404:52: (iv_ruleExpression6= ruleExpression6 EOF )
            // InternalHale.g:405:2: iv_ruleExpression6= ruleExpression6 EOF
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
    // InternalHale.g:411:1: ruleExpression6 returns [EObject current=null] : (this_Expression5_0= ruleExpression5 ( ( () otherlv_2= '==' ( (lv_right_3_0= ruleExpression5 ) ) ) | ( () otherlv_5= '!=' ( (lv_right_6_0= ruleExpression5 ) ) ) )* ) ;
    public final EObject ruleExpression6() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_Expression5_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalHale.g:417:2: ( (this_Expression5_0= ruleExpression5 ( ( () otherlv_2= '==' ( (lv_right_3_0= ruleExpression5 ) ) ) | ( () otherlv_5= '!=' ( (lv_right_6_0= ruleExpression5 ) ) ) )* ) )
            // InternalHale.g:418:2: (this_Expression5_0= ruleExpression5 ( ( () otherlv_2= '==' ( (lv_right_3_0= ruleExpression5 ) ) ) | ( () otherlv_5= '!=' ( (lv_right_6_0= ruleExpression5 ) ) ) )* )
            {
            // InternalHale.g:418:2: (this_Expression5_0= ruleExpression5 ( ( () otherlv_2= '==' ( (lv_right_3_0= ruleExpression5 ) ) ) | ( () otherlv_5= '!=' ( (lv_right_6_0= ruleExpression5 ) ) ) )* )
            // InternalHale.g:419:3: this_Expression5_0= ruleExpression5 ( ( () otherlv_2= '==' ( (lv_right_3_0= ruleExpression5 ) ) ) | ( () otherlv_5= '!=' ( (lv_right_6_0= ruleExpression5 ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpression6Access().getExpression5ParserRuleCall_0());
            		
            pushFollow(FOLLOW_9);
            this_Expression5_0=ruleExpression5();

            state._fsp--;


            			current = this_Expression5_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHale.g:427:3: ( ( () otherlv_2= '==' ( (lv_right_3_0= ruleExpression5 ) ) ) | ( () otherlv_5= '!=' ( (lv_right_6_0= ruleExpression5 ) ) ) )*
            loop5:
            do {
                int alt5=3;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }
                else if ( (LA5_0==16) ) {
                    alt5=2;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalHale.g:428:4: ( () otherlv_2= '==' ( (lv_right_3_0= ruleExpression5 ) ) )
            	    {
            	    // InternalHale.g:428:4: ( () otherlv_2= '==' ( (lv_right_3_0= ruleExpression5 ) ) )
            	    // InternalHale.g:429:5: () otherlv_2= '==' ( (lv_right_3_0= ruleExpression5 ) )
            	    {
            	    // InternalHale.g:429:5: ()
            	    // InternalHale.g:430:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpression6Access().getEqualityLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,15,FOLLOW_8); 

            	    					newLeafNode(otherlv_2, grammarAccess.getExpression6Access().getEqualsSignEqualsSignKeyword_1_0_1());
            	    				
            	    // InternalHale.g:440:5: ( (lv_right_3_0= ruleExpression5 ) )
            	    // InternalHale.g:441:6: (lv_right_3_0= ruleExpression5 )
            	    {
            	    // InternalHale.g:441:6: (lv_right_3_0= ruleExpression5 )
            	    // InternalHale.g:442:7: lv_right_3_0= ruleExpression5
            	    {

            	    							newCompositeNode(grammarAccess.getExpression6Access().getRightExpression5ParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_9);
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
            	    // InternalHale.g:461:4: ( () otherlv_5= '!=' ( (lv_right_6_0= ruleExpression5 ) ) )
            	    {
            	    // InternalHale.g:461:4: ( () otherlv_5= '!=' ( (lv_right_6_0= ruleExpression5 ) ) )
            	    // InternalHale.g:462:5: () otherlv_5= '!=' ( (lv_right_6_0= ruleExpression5 ) )
            	    {
            	    // InternalHale.g:462:5: ()
            	    // InternalHale.g:463:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpression6Access().getInequalityLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,16,FOLLOW_8); 

            	    					newLeafNode(otherlv_5, grammarAccess.getExpression6Access().getExclamationMarkEqualsSignKeyword_1_1_1());
            	    				
            	    // InternalHale.g:473:5: ( (lv_right_6_0= ruleExpression5 ) )
            	    // InternalHale.g:474:6: (lv_right_6_0= ruleExpression5 )
            	    {
            	    // InternalHale.g:474:6: (lv_right_6_0= ruleExpression5 )
            	    // InternalHale.g:475:7: lv_right_6_0= ruleExpression5
            	    {

            	    							newCompositeNode(grammarAccess.getExpression6Access().getRightExpression5ParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_9);
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
    // $ANTLR end "ruleExpression6"


    // $ANTLR start "entryRuleExpression5"
    // InternalHale.g:498:1: entryRuleExpression5 returns [EObject current=null] : iv_ruleExpression5= ruleExpression5 EOF ;
    public final EObject entryRuleExpression5() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression5 = null;


        try {
            // InternalHale.g:498:52: (iv_ruleExpression5= ruleExpression5 EOF )
            // InternalHale.g:499:2: iv_ruleExpression5= ruleExpression5 EOF
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
    // InternalHale.g:505:1: ruleExpression5 returns [EObject current=null] : (this_Expression4_0= ruleExpression4 ( ( () otherlv_2= '<=' ( (lv_right_3_0= ruleExpression4 ) ) ) | ( () otherlv_5= '<' ( (lv_right_6_0= ruleExpression4 ) ) ) | ( () otherlv_8= '>=' ( (lv_right_9_0= ruleExpression4 ) ) ) | ( () otherlv_11= '>' ( (lv_right_12_0= ruleExpression4 ) ) ) )* ) ;
    public final EObject ruleExpression5() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        EObject this_Expression4_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;

        EObject lv_right_9_0 = null;

        EObject lv_right_12_0 = null;



        	enterRule();

        try {
            // InternalHale.g:511:2: ( (this_Expression4_0= ruleExpression4 ( ( () otherlv_2= '<=' ( (lv_right_3_0= ruleExpression4 ) ) ) | ( () otherlv_5= '<' ( (lv_right_6_0= ruleExpression4 ) ) ) | ( () otherlv_8= '>=' ( (lv_right_9_0= ruleExpression4 ) ) ) | ( () otherlv_11= '>' ( (lv_right_12_0= ruleExpression4 ) ) ) )* ) )
            // InternalHale.g:512:2: (this_Expression4_0= ruleExpression4 ( ( () otherlv_2= '<=' ( (lv_right_3_0= ruleExpression4 ) ) ) | ( () otherlv_5= '<' ( (lv_right_6_0= ruleExpression4 ) ) ) | ( () otherlv_8= '>=' ( (lv_right_9_0= ruleExpression4 ) ) ) | ( () otherlv_11= '>' ( (lv_right_12_0= ruleExpression4 ) ) ) )* )
            {
            // InternalHale.g:512:2: (this_Expression4_0= ruleExpression4 ( ( () otherlv_2= '<=' ( (lv_right_3_0= ruleExpression4 ) ) ) | ( () otherlv_5= '<' ( (lv_right_6_0= ruleExpression4 ) ) ) | ( () otherlv_8= '>=' ( (lv_right_9_0= ruleExpression4 ) ) ) | ( () otherlv_11= '>' ( (lv_right_12_0= ruleExpression4 ) ) ) )* )
            // InternalHale.g:513:3: this_Expression4_0= ruleExpression4 ( ( () otherlv_2= '<=' ( (lv_right_3_0= ruleExpression4 ) ) ) | ( () otherlv_5= '<' ( (lv_right_6_0= ruleExpression4 ) ) ) | ( () otherlv_8= '>=' ( (lv_right_9_0= ruleExpression4 ) ) ) | ( () otherlv_11= '>' ( (lv_right_12_0= ruleExpression4 ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpression5Access().getExpression4ParserRuleCall_0());
            		
            pushFollow(FOLLOW_10);
            this_Expression4_0=ruleExpression4();

            state._fsp--;


            			current = this_Expression4_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHale.g:521:3: ( ( () otherlv_2= '<=' ( (lv_right_3_0= ruleExpression4 ) ) ) | ( () otherlv_5= '<' ( (lv_right_6_0= ruleExpression4 ) ) ) | ( () otherlv_8= '>=' ( (lv_right_9_0= ruleExpression4 ) ) ) | ( () otherlv_11= '>' ( (lv_right_12_0= ruleExpression4 ) ) ) )*
            loop6:
            do {
                int alt6=5;
                switch ( input.LA(1) ) {
                case 17:
                    {
                    alt6=1;
                    }
                    break;
                case 18:
                    {
                    alt6=2;
                    }
                    break;
                case 19:
                    {
                    alt6=3;
                    }
                    break;
                case 20:
                    {
                    alt6=4;
                    }
                    break;

                }

                switch (alt6) {
            	case 1 :
            	    // InternalHale.g:522:4: ( () otherlv_2= '<=' ( (lv_right_3_0= ruleExpression4 ) ) )
            	    {
            	    // InternalHale.g:522:4: ( () otherlv_2= '<=' ( (lv_right_3_0= ruleExpression4 ) ) )
            	    // InternalHale.g:523:5: () otherlv_2= '<=' ( (lv_right_3_0= ruleExpression4 ) )
            	    {
            	    // InternalHale.g:523:5: ()
            	    // InternalHale.g:524:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpression5Access().getLessThanOrEqualLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,17,FOLLOW_8); 

            	    					newLeafNode(otherlv_2, grammarAccess.getExpression5Access().getLessThanSignEqualsSignKeyword_1_0_1());
            	    				
            	    // InternalHale.g:534:5: ( (lv_right_3_0= ruleExpression4 ) )
            	    // InternalHale.g:535:6: (lv_right_3_0= ruleExpression4 )
            	    {
            	    // InternalHale.g:535:6: (lv_right_3_0= ruleExpression4 )
            	    // InternalHale.g:536:7: lv_right_3_0= ruleExpression4
            	    {

            	    							newCompositeNode(grammarAccess.getExpression5Access().getRightExpression4ParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_10);
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
            	    // InternalHale.g:555:4: ( () otherlv_5= '<' ( (lv_right_6_0= ruleExpression4 ) ) )
            	    {
            	    // InternalHale.g:555:4: ( () otherlv_5= '<' ( (lv_right_6_0= ruleExpression4 ) ) )
            	    // InternalHale.g:556:5: () otherlv_5= '<' ( (lv_right_6_0= ruleExpression4 ) )
            	    {
            	    // InternalHale.g:556:5: ()
            	    // InternalHale.g:557:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpression5Access().getLessThanLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,18,FOLLOW_8); 

            	    					newLeafNode(otherlv_5, grammarAccess.getExpression5Access().getLessThanSignKeyword_1_1_1());
            	    				
            	    // InternalHale.g:567:5: ( (lv_right_6_0= ruleExpression4 ) )
            	    // InternalHale.g:568:6: (lv_right_6_0= ruleExpression4 )
            	    {
            	    // InternalHale.g:568:6: (lv_right_6_0= ruleExpression4 )
            	    // InternalHale.g:569:7: lv_right_6_0= ruleExpression4
            	    {

            	    							newCompositeNode(grammarAccess.getExpression5Access().getRightExpression4ParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_10);
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
            	    // InternalHale.g:588:4: ( () otherlv_8= '>=' ( (lv_right_9_0= ruleExpression4 ) ) )
            	    {
            	    // InternalHale.g:588:4: ( () otherlv_8= '>=' ( (lv_right_9_0= ruleExpression4 ) ) )
            	    // InternalHale.g:589:5: () otherlv_8= '>=' ( (lv_right_9_0= ruleExpression4 ) )
            	    {
            	    // InternalHale.g:589:5: ()
            	    // InternalHale.g:590:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpression5Access().getGreaterThanOrEqualLeftAction_1_2_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_8=(Token)match(input,19,FOLLOW_8); 

            	    					newLeafNode(otherlv_8, grammarAccess.getExpression5Access().getGreaterThanSignEqualsSignKeyword_1_2_1());
            	    				
            	    // InternalHale.g:600:5: ( (lv_right_9_0= ruleExpression4 ) )
            	    // InternalHale.g:601:6: (lv_right_9_0= ruleExpression4 )
            	    {
            	    // InternalHale.g:601:6: (lv_right_9_0= ruleExpression4 )
            	    // InternalHale.g:602:7: lv_right_9_0= ruleExpression4
            	    {

            	    							newCompositeNode(grammarAccess.getExpression5Access().getRightExpression4ParserRuleCall_1_2_2_0());
            	    						
            	    pushFollow(FOLLOW_10);
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
            	case 4 :
            	    // InternalHale.g:621:4: ( () otherlv_11= '>' ( (lv_right_12_0= ruleExpression4 ) ) )
            	    {
            	    // InternalHale.g:621:4: ( () otherlv_11= '>' ( (lv_right_12_0= ruleExpression4 ) ) )
            	    // InternalHale.g:622:5: () otherlv_11= '>' ( (lv_right_12_0= ruleExpression4 ) )
            	    {
            	    // InternalHale.g:622:5: ()
            	    // InternalHale.g:623:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpression5Access().getGreaterThanLeftAction_1_3_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_11=(Token)match(input,20,FOLLOW_8); 

            	    					newLeafNode(otherlv_11, grammarAccess.getExpression5Access().getGreaterThanSignKeyword_1_3_1());
            	    				
            	    // InternalHale.g:633:5: ( (lv_right_12_0= ruleExpression4 ) )
            	    // InternalHale.g:634:6: (lv_right_12_0= ruleExpression4 )
            	    {
            	    // InternalHale.g:634:6: (lv_right_12_0= ruleExpression4 )
            	    // InternalHale.g:635:7: lv_right_12_0= ruleExpression4
            	    {

            	    							newCompositeNode(grammarAccess.getExpression5Access().getRightExpression4ParserRuleCall_1_3_2_0());
            	    						
            	    pushFollow(FOLLOW_10);
            	    lv_right_12_0=ruleExpression4();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getExpression5Rule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_12_0,
            	    								"willburden.hale.Hale.Expression4");
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
    // $ANTLR end "ruleExpression5"


    // $ANTLR start "entryRuleExpression4"
    // InternalHale.g:658:1: entryRuleExpression4 returns [EObject current=null] : iv_ruleExpression4= ruleExpression4 EOF ;
    public final EObject entryRuleExpression4() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression4 = null;


        try {
            // InternalHale.g:658:52: (iv_ruleExpression4= ruleExpression4 EOF )
            // InternalHale.g:659:2: iv_ruleExpression4= ruleExpression4 EOF
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
    // InternalHale.g:665:1: ruleExpression4 returns [EObject current=null] : (this_Expression3_0= ruleExpression3 ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpression3 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpression3 ) ) ) )* ) ;
    public final EObject ruleExpression4() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_Expression3_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalHale.g:671:2: ( (this_Expression3_0= ruleExpression3 ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpression3 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpression3 ) ) ) )* ) )
            // InternalHale.g:672:2: (this_Expression3_0= ruleExpression3 ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpression3 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpression3 ) ) ) )* )
            {
            // InternalHale.g:672:2: (this_Expression3_0= ruleExpression3 ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpression3 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpression3 ) ) ) )* )
            // InternalHale.g:673:3: this_Expression3_0= ruleExpression3 ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpression3 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpression3 ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpression4Access().getExpression3ParserRuleCall_0());
            		
            pushFollow(FOLLOW_11);
            this_Expression3_0=ruleExpression3();

            state._fsp--;


            			current = this_Expression3_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHale.g:681:3: ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpression3 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpression3 ) ) ) )*
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==21) ) {
                    alt7=1;
                }
                else if ( (LA7_0==22) ) {
                    alt7=2;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalHale.g:682:4: ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpression3 ) ) )
            	    {
            	    // InternalHale.g:682:4: ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpression3 ) ) )
            	    // InternalHale.g:683:5: () otherlv_2= '+' ( (lv_right_3_0= ruleExpression3 ) )
            	    {
            	    // InternalHale.g:683:5: ()
            	    // InternalHale.g:684:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpression4Access().getAdditionLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,21,FOLLOW_8); 

            	    					newLeafNode(otherlv_2, grammarAccess.getExpression4Access().getPlusSignKeyword_1_0_1());
            	    				
            	    // InternalHale.g:694:5: ( (lv_right_3_0= ruleExpression3 ) )
            	    // InternalHale.g:695:6: (lv_right_3_0= ruleExpression3 )
            	    {
            	    // InternalHale.g:695:6: (lv_right_3_0= ruleExpression3 )
            	    // InternalHale.g:696:7: lv_right_3_0= ruleExpression3
            	    {

            	    							newCompositeNode(grammarAccess.getExpression4Access().getRightExpression3ParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_11);
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


            	    }
            	    break;
            	case 2 :
            	    // InternalHale.g:715:4: ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpression3 ) ) )
            	    {
            	    // InternalHale.g:715:4: ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpression3 ) ) )
            	    // InternalHale.g:716:5: () otherlv_5= '-' ( (lv_right_6_0= ruleExpression3 ) )
            	    {
            	    // InternalHale.g:716:5: ()
            	    // InternalHale.g:717:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpression4Access().getSubtractionLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,22,FOLLOW_8); 

            	    					newLeafNode(otherlv_5, grammarAccess.getExpression4Access().getHyphenMinusKeyword_1_1_1());
            	    				
            	    // InternalHale.g:727:5: ( (lv_right_6_0= ruleExpression3 ) )
            	    // InternalHale.g:728:6: (lv_right_6_0= ruleExpression3 )
            	    {
            	    // InternalHale.g:728:6: (lv_right_6_0= ruleExpression3 )
            	    // InternalHale.g:729:7: lv_right_6_0= ruleExpression3
            	    {

            	    							newCompositeNode(grammarAccess.getExpression4Access().getRightExpression3ParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_11);
            	    lv_right_6_0=ruleExpression3();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getExpression4Rule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_6_0,
            	    								"willburden.hale.Hale.Expression3");
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
    // $ANTLR end "ruleExpression4"


    // $ANTLR start "entryRuleExpression3"
    // InternalHale.g:752:1: entryRuleExpression3 returns [EObject current=null] : iv_ruleExpression3= ruleExpression3 EOF ;
    public final EObject entryRuleExpression3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression3 = null;


        try {
            // InternalHale.g:752:52: (iv_ruleExpression3= ruleExpression3 EOF )
            // InternalHale.g:753:2: iv_ruleExpression3= ruleExpression3 EOF
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
    // InternalHale.g:759:1: ruleExpression3 returns [EObject current=null] : (this_Expression2_0= ruleExpression2 ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpression2 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpression2 ) ) ) | ( () otherlv_8= '%' ( (lv_right_9_0= ruleExpression2 ) ) ) )* ) ;
    public final EObject ruleExpression3() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject this_Expression2_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;

        EObject lv_right_9_0 = null;



        	enterRule();

        try {
            // InternalHale.g:765:2: ( (this_Expression2_0= ruleExpression2 ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpression2 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpression2 ) ) ) | ( () otherlv_8= '%' ( (lv_right_9_0= ruleExpression2 ) ) ) )* ) )
            // InternalHale.g:766:2: (this_Expression2_0= ruleExpression2 ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpression2 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpression2 ) ) ) | ( () otherlv_8= '%' ( (lv_right_9_0= ruleExpression2 ) ) ) )* )
            {
            // InternalHale.g:766:2: (this_Expression2_0= ruleExpression2 ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpression2 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpression2 ) ) ) | ( () otherlv_8= '%' ( (lv_right_9_0= ruleExpression2 ) ) ) )* )
            // InternalHale.g:767:3: this_Expression2_0= ruleExpression2 ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpression2 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpression2 ) ) ) | ( () otherlv_8= '%' ( (lv_right_9_0= ruleExpression2 ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpression3Access().getExpression2ParserRuleCall_0());
            		
            pushFollow(FOLLOW_12);
            this_Expression2_0=ruleExpression2();

            state._fsp--;


            			current = this_Expression2_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHale.g:775:3: ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpression2 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpression2 ) ) ) | ( () otherlv_8= '%' ( (lv_right_9_0= ruleExpression2 ) ) ) )*
            loop8:
            do {
                int alt8=4;
                switch ( input.LA(1) ) {
                case 23:
                    {
                    alt8=1;
                    }
                    break;
                case 24:
                    {
                    alt8=2;
                    }
                    break;
                case 25:
                    {
                    alt8=3;
                    }
                    break;

                }

                switch (alt8) {
            	case 1 :
            	    // InternalHale.g:776:4: ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpression2 ) ) )
            	    {
            	    // InternalHale.g:776:4: ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpression2 ) ) )
            	    // InternalHale.g:777:5: () otherlv_2= '*' ( (lv_right_3_0= ruleExpression2 ) )
            	    {
            	    // InternalHale.g:777:5: ()
            	    // InternalHale.g:778:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpression3Access().getMultiplicationLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,23,FOLLOW_8); 

            	    					newLeafNode(otherlv_2, grammarAccess.getExpression3Access().getAsteriskKeyword_1_0_1());
            	    				
            	    // InternalHale.g:788:5: ( (lv_right_3_0= ruleExpression2 ) )
            	    // InternalHale.g:789:6: (lv_right_3_0= ruleExpression2 )
            	    {
            	    // InternalHale.g:789:6: (lv_right_3_0= ruleExpression2 )
            	    // InternalHale.g:790:7: lv_right_3_0= ruleExpression2
            	    {

            	    							newCompositeNode(grammarAccess.getExpression3Access().getRightExpression2ParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_12);
            	    lv_right_3_0=ruleExpression2();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getExpression3Rule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_3_0,
            	    								"willburden.hale.Hale.Expression2");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalHale.g:809:4: ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpression2 ) ) )
            	    {
            	    // InternalHale.g:809:4: ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpression2 ) ) )
            	    // InternalHale.g:810:5: () otherlv_5= '/' ( (lv_right_6_0= ruleExpression2 ) )
            	    {
            	    // InternalHale.g:810:5: ()
            	    // InternalHale.g:811:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpression3Access().getDivisionLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,24,FOLLOW_8); 

            	    					newLeafNode(otherlv_5, grammarAccess.getExpression3Access().getSolidusKeyword_1_1_1());
            	    				
            	    // InternalHale.g:821:5: ( (lv_right_6_0= ruleExpression2 ) )
            	    // InternalHale.g:822:6: (lv_right_6_0= ruleExpression2 )
            	    {
            	    // InternalHale.g:822:6: (lv_right_6_0= ruleExpression2 )
            	    // InternalHale.g:823:7: lv_right_6_0= ruleExpression2
            	    {

            	    							newCompositeNode(grammarAccess.getExpression3Access().getRightExpression2ParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_12);
            	    lv_right_6_0=ruleExpression2();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getExpression3Rule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_6_0,
            	    								"willburden.hale.Hale.Expression2");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalHale.g:842:4: ( () otherlv_8= '%' ( (lv_right_9_0= ruleExpression2 ) ) )
            	    {
            	    // InternalHale.g:842:4: ( () otherlv_8= '%' ( (lv_right_9_0= ruleExpression2 ) ) )
            	    // InternalHale.g:843:5: () otherlv_8= '%' ( (lv_right_9_0= ruleExpression2 ) )
            	    {
            	    // InternalHale.g:843:5: ()
            	    // InternalHale.g:844:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpression3Access().getRemainderLeftAction_1_2_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_8=(Token)match(input,25,FOLLOW_8); 

            	    					newLeafNode(otherlv_8, grammarAccess.getExpression3Access().getPercentSignKeyword_1_2_1());
            	    				
            	    // InternalHale.g:854:5: ( (lv_right_9_0= ruleExpression2 ) )
            	    // InternalHale.g:855:6: (lv_right_9_0= ruleExpression2 )
            	    {
            	    // InternalHale.g:855:6: (lv_right_9_0= ruleExpression2 )
            	    // InternalHale.g:856:7: lv_right_9_0= ruleExpression2
            	    {

            	    							newCompositeNode(grammarAccess.getExpression3Access().getRightExpression2ParserRuleCall_1_2_2_0());
            	    						
            	    pushFollow(FOLLOW_12);
            	    lv_right_9_0=ruleExpression2();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getExpression3Rule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_9_0,
            	    								"willburden.hale.Hale.Expression2");
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
    // $ANTLR end "ruleExpression3"


    // $ANTLR start "entryRuleExpression2"
    // InternalHale.g:879:1: entryRuleExpression2 returns [EObject current=null] : iv_ruleExpression2= ruleExpression2 EOF ;
    public final EObject entryRuleExpression2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression2 = null;


        try {
            // InternalHale.g:879:52: (iv_ruleExpression2= ruleExpression2 EOF )
            // InternalHale.g:880:2: iv_ruleExpression2= ruleExpression2 EOF
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
    // InternalHale.g:886:1: ruleExpression2 returns [EObject current=null] : (this_Expression1_0= ruleExpression1 ( () otherlv_2= '**' ( (lv_right_3_0= ruleExpression1 ) ) )* ) ;
    public final EObject ruleExpression2() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Expression1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalHale.g:892:2: ( (this_Expression1_0= ruleExpression1 ( () otherlv_2= '**' ( (lv_right_3_0= ruleExpression1 ) ) )* ) )
            // InternalHale.g:893:2: (this_Expression1_0= ruleExpression1 ( () otherlv_2= '**' ( (lv_right_3_0= ruleExpression1 ) ) )* )
            {
            // InternalHale.g:893:2: (this_Expression1_0= ruleExpression1 ( () otherlv_2= '**' ( (lv_right_3_0= ruleExpression1 ) ) )* )
            // InternalHale.g:894:3: this_Expression1_0= ruleExpression1 ( () otherlv_2= '**' ( (lv_right_3_0= ruleExpression1 ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpression2Access().getExpression1ParserRuleCall_0());
            		
            pushFollow(FOLLOW_13);
            this_Expression1_0=ruleExpression1();

            state._fsp--;


            			current = this_Expression1_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHale.g:902:3: ( () otherlv_2= '**' ( (lv_right_3_0= ruleExpression1 ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==26) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalHale.g:903:4: () otherlv_2= '**' ( (lv_right_3_0= ruleExpression1 ) )
            	    {
            	    // InternalHale.g:903:4: ()
            	    // InternalHale.g:904:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getExpression2Access().getExponentiationLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,26,FOLLOW_8); 

            	    				newLeafNode(otherlv_2, grammarAccess.getExpression2Access().getAsteriskAsteriskKeyword_1_1());
            	    			
            	    // InternalHale.g:914:4: ( (lv_right_3_0= ruleExpression1 ) )
            	    // InternalHale.g:915:5: (lv_right_3_0= ruleExpression1 )
            	    {
            	    // InternalHale.g:915:5: (lv_right_3_0= ruleExpression1 )
            	    // InternalHale.g:916:6: lv_right_3_0= ruleExpression1
            	    {

            	    						newCompositeNode(grammarAccess.getExpression2Access().getRightExpression1ParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_right_3_0=ruleExpression1();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpression2Rule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"willburden.hale.Hale.Expression1");
            	    						afterParserOrEnumRuleCall();
            	    					

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
    // $ANTLR end "ruleExpression2"


    // $ANTLR start "entryRuleExpression1"
    // InternalHale.g:938:1: entryRuleExpression1 returns [EObject current=null] : iv_ruleExpression1= ruleExpression1 EOF ;
    public final EObject entryRuleExpression1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression1 = null;


        try {
            // InternalHale.g:938:52: (iv_ruleExpression1= ruleExpression1 EOF )
            // InternalHale.g:939:2: iv_ruleExpression1= ruleExpression1 EOF
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
    // InternalHale.g:945:1: ruleExpression1 returns [EObject current=null] : ( ( () otherlv_1= '-' ( (lv_inner_2_0= ruleExpression1 ) ) ) | ( () otherlv_4= 'not' ( (lv_inner_5_0= ruleExpression1 ) ) ) | this_Primary_6= rulePrimary ) ;
    public final EObject ruleExpression1() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_inner_2_0 = null;

        EObject lv_inner_5_0 = null;

        EObject this_Primary_6 = null;



        	enterRule();

        try {
            // InternalHale.g:951:2: ( ( ( () otherlv_1= '-' ( (lv_inner_2_0= ruleExpression1 ) ) ) | ( () otherlv_4= 'not' ( (lv_inner_5_0= ruleExpression1 ) ) ) | this_Primary_6= rulePrimary ) )
            // InternalHale.g:952:2: ( ( () otherlv_1= '-' ( (lv_inner_2_0= ruleExpression1 ) ) ) | ( () otherlv_4= 'not' ( (lv_inner_5_0= ruleExpression1 ) ) ) | this_Primary_6= rulePrimary )
            {
            // InternalHale.g:952:2: ( ( () otherlv_1= '-' ( (lv_inner_2_0= ruleExpression1 ) ) ) | ( () otherlv_4= 'not' ( (lv_inner_5_0= ruleExpression1 ) ) ) | this_Primary_6= rulePrimary )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt10=1;
                }
                break;
            case 27:
                {
                alt10=2;
                }
                break;
            case RULE_DOUBLE:
            case RULE_STRING:
            case RULE_ID:
            case 28:
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
                    // InternalHale.g:953:3: ( () otherlv_1= '-' ( (lv_inner_2_0= ruleExpression1 ) ) )
                    {
                    // InternalHale.g:953:3: ( () otherlv_1= '-' ( (lv_inner_2_0= ruleExpression1 ) ) )
                    // InternalHale.g:954:4: () otherlv_1= '-' ( (lv_inner_2_0= ruleExpression1 ) )
                    {
                    // InternalHale.g:954:4: ()
                    // InternalHale.g:955:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExpression1Access().getUnaryNegationAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,22,FOLLOW_8); 

                    				newLeafNode(otherlv_1, grammarAccess.getExpression1Access().getHyphenMinusKeyword_0_1());
                    			
                    // InternalHale.g:965:4: ( (lv_inner_2_0= ruleExpression1 ) )
                    // InternalHale.g:966:5: (lv_inner_2_0= ruleExpression1 )
                    {
                    // InternalHale.g:966:5: (lv_inner_2_0= ruleExpression1 )
                    // InternalHale.g:967:6: lv_inner_2_0= ruleExpression1
                    {

                    						newCompositeNode(grammarAccess.getExpression1Access().getInnerExpression1ParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_inner_2_0=ruleExpression1();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpression1Rule());
                    						}
                    						set(
                    							current,
                    							"inner",
                    							lv_inner_2_0,
                    							"willburden.hale.Hale.Expression1");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalHale.g:986:3: ( () otherlv_4= 'not' ( (lv_inner_5_0= ruleExpression1 ) ) )
                    {
                    // InternalHale.g:986:3: ( () otherlv_4= 'not' ( (lv_inner_5_0= ruleExpression1 ) ) )
                    // InternalHale.g:987:4: () otherlv_4= 'not' ( (lv_inner_5_0= ruleExpression1 ) )
                    {
                    // InternalHale.g:987:4: ()
                    // InternalHale.g:988:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExpression1Access().getLogicalNotAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,27,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getExpression1Access().getNotKeyword_1_1());
                    			
                    // InternalHale.g:998:4: ( (lv_inner_5_0= ruleExpression1 ) )
                    // InternalHale.g:999:5: (lv_inner_5_0= ruleExpression1 )
                    {
                    // InternalHale.g:999:5: (lv_inner_5_0= ruleExpression1 )
                    // InternalHale.g:1000:6: lv_inner_5_0= ruleExpression1
                    {

                    						newCompositeNode(grammarAccess.getExpression1Access().getInnerExpression1ParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_inner_5_0=ruleExpression1();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpression1Rule());
                    						}
                    						set(
                    							current,
                    							"inner",
                    							lv_inner_5_0,
                    							"willburden.hale.Hale.Expression1");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalHale.g:1019:3: this_Primary_6= rulePrimary
                    {

                    			newCompositeNode(grammarAccess.getExpression1Access().getPrimaryParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Primary_6=rulePrimary();

                    state._fsp--;


                    			current = this_Primary_6;
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
    // $ANTLR end "ruleExpression1"


    // $ANTLR start "entryRulePrimary"
    // InternalHale.g:1031:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalHale.g:1031:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalHale.g:1032:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalHale.g:1038:1: rulePrimary returns [EObject current=null] : (this_Literal_0= ruleLiteral | this_BindingReference_1= ruleBindingReference | (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Literal_0 = null;

        EObject this_BindingReference_1 = null;

        EObject this_Expression_3 = null;



        	enterRule();

        try {
            // InternalHale.g:1044:2: ( (this_Literal_0= ruleLiteral | this_BindingReference_1= ruleBindingReference | (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' ) ) )
            // InternalHale.g:1045:2: (this_Literal_0= ruleLiteral | this_BindingReference_1= ruleBindingReference | (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' ) )
            {
            // InternalHale.g:1045:2: (this_Literal_0= ruleLiteral | this_BindingReference_1= ruleBindingReference | (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case RULE_DOUBLE:
            case RULE_STRING:
                {
                alt11=1;
                }
                break;
            case RULE_ID:
                {
                alt11=2;
                }
                break;
            case 28:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalHale.g:1046:3: this_Literal_0= ruleLiteral
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getLiteralParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Literal_0=ruleLiteral();

                    state._fsp--;


                    			current = this_Literal_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalHale.g:1055:3: this_BindingReference_1= ruleBindingReference
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getBindingReferenceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_BindingReference_1=ruleBindingReference();

                    state._fsp--;


                    			current = this_BindingReference_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalHale.g:1064:3: (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' )
                    {
                    // InternalHale.g:1064:3: (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' )
                    // InternalHale.g:1065:4: otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_2_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_14);
                    this_Expression_3=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_3;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_4=(Token)match(input,29,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_2_2());
                    			

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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleLiteral"
    // InternalHale.g:1086:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalHale.g:1086:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalHale.g:1087:2: iv_ruleLiteral= ruleLiteral EOF
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
    // InternalHale.g:1093:1: ruleLiteral returns [EObject current=null] : (this_NumberLiteral_0= ruleNumberLiteral | this_StringLiteral_1= ruleStringLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_NumberLiteral_0 = null;

        EObject this_StringLiteral_1 = null;



        	enterRule();

        try {
            // InternalHale.g:1099:2: ( (this_NumberLiteral_0= ruleNumberLiteral | this_StringLiteral_1= ruleStringLiteral ) )
            // InternalHale.g:1100:2: (this_NumberLiteral_0= ruleNumberLiteral | this_StringLiteral_1= ruleStringLiteral )
            {
            // InternalHale.g:1100:2: (this_NumberLiteral_0= ruleNumberLiteral | this_StringLiteral_1= ruleStringLiteral )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_DOUBLE) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_STRING) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalHale.g:1101:3: this_NumberLiteral_0= ruleNumberLiteral
                    {

                    			newCompositeNode(grammarAccess.getLiteralAccess().getNumberLiteralParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NumberLiteral_0=ruleNumberLiteral();

                    state._fsp--;


                    			current = this_NumberLiteral_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalHale.g:1110:3: this_StringLiteral_1= ruleStringLiteral
                    {

                    			newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringLiteral_1=ruleStringLiteral();

                    state._fsp--;


                    			current = this_StringLiteral_1;
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


    // $ANTLR start "entryRuleNumberLiteral"
    // InternalHale.g:1122:1: entryRuleNumberLiteral returns [EObject current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final EObject entryRuleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteral = null;


        try {
            // InternalHale.g:1122:54: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // InternalHale.g:1123:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
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
    // InternalHale.g:1129:1: ruleNumberLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_DOUBLE ) ) ;
    public final EObject ruleNumberLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalHale.g:1135:2: ( ( (lv_value_0_0= RULE_DOUBLE ) ) )
            // InternalHale.g:1136:2: ( (lv_value_0_0= RULE_DOUBLE ) )
            {
            // InternalHale.g:1136:2: ( (lv_value_0_0= RULE_DOUBLE ) )
            // InternalHale.g:1137:3: (lv_value_0_0= RULE_DOUBLE )
            {
            // InternalHale.g:1137:3: (lv_value_0_0= RULE_DOUBLE )
            // InternalHale.g:1138:4: lv_value_0_0= RULE_DOUBLE
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
    // InternalHale.g:1157:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalHale.g:1157:54: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalHale.g:1158:2: iv_ruleStringLiteral= ruleStringLiteral EOF
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
    // InternalHale.g:1164:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalHale.g:1170:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalHale.g:1171:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalHale.g:1171:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalHale.g:1172:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalHale.g:1172:3: (lv_value_0_0= RULE_STRING )
            // InternalHale.g:1173:4: lv_value_0_0= RULE_STRING
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


    // $ANTLR start "entryRuleBinding"
    // InternalHale.g:1192:1: entryRuleBinding returns [EObject current=null] : iv_ruleBinding= ruleBinding EOF ;
    public final EObject entryRuleBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinding = null;


        try {
            // InternalHale.g:1192:48: (iv_ruleBinding= ruleBinding EOF )
            // InternalHale.g:1193:2: iv_ruleBinding= ruleBinding EOF
            {
             newCompositeNode(grammarAccess.getBindingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBinding=ruleBinding();

            state._fsp--;

             current =iv_ruleBinding; 
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
    // $ANTLR end "entryRuleBinding"


    // $ANTLR start "ruleBinding"
    // InternalHale.g:1199:1: ruleBinding returns [EObject current=null] : (otherlv_0= 'let' ( (lv_mutable_1_0= 'mut' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) ) ;
    public final EObject ruleBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_mutable_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_expression_4_0 = null;



        	enterRule();

        try {
            // InternalHale.g:1205:2: ( (otherlv_0= 'let' ( (lv_mutable_1_0= 'mut' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) ) )
            // InternalHale.g:1206:2: (otherlv_0= 'let' ( (lv_mutable_1_0= 'mut' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) )
            {
            // InternalHale.g:1206:2: (otherlv_0= 'let' ( (lv_mutable_1_0= 'mut' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) )
            // InternalHale.g:1207:3: otherlv_0= 'let' ( (lv_mutable_1_0= 'mut' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getBindingAccess().getLetKeyword_0());
            		
            // InternalHale.g:1211:3: ( (lv_mutable_1_0= 'mut' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==31) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalHale.g:1212:4: (lv_mutable_1_0= 'mut' )
                    {
                    // InternalHale.g:1212:4: (lv_mutable_1_0= 'mut' )
                    // InternalHale.g:1213:5: lv_mutable_1_0= 'mut'
                    {
                    lv_mutable_1_0=(Token)match(input,31,FOLLOW_16); 

                    					newLeafNode(lv_mutable_1_0, grammarAccess.getBindingAccess().getMutableMutKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBindingRule());
                    					}
                    					setWithLastConsumed(current, "mutable", lv_mutable_1_0 != null, "mut");
                    				

                    }


                    }
                    break;

            }

            // InternalHale.g:1225:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalHale.g:1226:4: (lv_name_2_0= RULE_ID )
            {
            // InternalHale.g:1226:4: (lv_name_2_0= RULE_ID )
            // InternalHale.g:1227:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_name_2_0, grammarAccess.getBindingAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBindingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"willburden.hale.Hale.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,32,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getBindingAccess().getEqualsSignKeyword_3());
            		
            // InternalHale.g:1247:3: ( (lv_expression_4_0= ruleExpression ) )
            // InternalHale.g:1248:4: (lv_expression_4_0= ruleExpression )
            {
            // InternalHale.g:1248:4: (lv_expression_4_0= ruleExpression )
            // InternalHale.g:1249:5: lv_expression_4_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getBindingAccess().getExpressionExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_4_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBindingRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_4_0,
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
    // $ANTLR end "ruleBinding"


    // $ANTLR start "entryRuleBindingReference"
    // InternalHale.g:1270:1: entryRuleBindingReference returns [EObject current=null] : iv_ruleBindingReference= ruleBindingReference EOF ;
    public final EObject entryRuleBindingReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBindingReference = null;


        try {
            // InternalHale.g:1270:57: (iv_ruleBindingReference= ruleBindingReference EOF )
            // InternalHale.g:1271:2: iv_ruleBindingReference= ruleBindingReference EOF
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
    // InternalHale.g:1277:1: ruleBindingReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleBindingReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalHale.g:1283:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalHale.g:1284:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalHale.g:1284:2: ( (otherlv_0= RULE_ID ) )
            // InternalHale.g:1285:3: (otherlv_0= RULE_ID )
            {
            // InternalHale.g:1285:3: (otherlv_0= RULE_ID )
            // InternalHale.g:1286:4: otherlv_0= RULE_ID
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
    // InternalHale.g:1300:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalHale.g:1300:51: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalHale.g:1301:2: iv_ruleAssignment= ruleAssignment EOF
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
    // InternalHale.g:1307:1: ruleAssignment returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalHale.g:1313:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) ) )
            // InternalHale.g:1314:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // InternalHale.g:1314:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) )
            // InternalHale.g:1315:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) )
            {
            // InternalHale.g:1315:3: ( (otherlv_0= RULE_ID ) )
            // InternalHale.g:1316:4: (otherlv_0= RULE_ID )
            {
            // InternalHale.g:1316:4: (otherlv_0= RULE_ID )
            // InternalHale.g:1317:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssignmentRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(otherlv_0, grammarAccess.getAssignmentAccess().getBindingBindingCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1());
            		
            // InternalHale.g:1332:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalHale.g:1333:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalHale.g:1333:4: (lv_expression_2_0= ruleExpression )
            // InternalHale.g:1334:5: lv_expression_2_0= ruleExpression
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


    // $ANTLR start "entryRulePrint"
    // InternalHale.g:1355:1: entryRulePrint returns [EObject current=null] : iv_rulePrint= rulePrint EOF ;
    public final EObject entryRulePrint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrint = null;


        try {
            // InternalHale.g:1355:46: (iv_rulePrint= rulePrint EOF )
            // InternalHale.g:1356:2: iv_rulePrint= rulePrint EOF
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
    // InternalHale.g:1362:1: rulePrint returns [EObject current=null] : (otherlv_0= 'print' ( (lv_expression_1_0= ruleExpression ) ) ) ;
    public final EObject rulePrint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalHale.g:1368:2: ( (otherlv_0= 'print' ( (lv_expression_1_0= ruleExpression ) ) ) )
            // InternalHale.g:1369:2: (otherlv_0= 'print' ( (lv_expression_1_0= ruleExpression ) ) )
            {
            // InternalHale.g:1369:2: (otherlv_0= 'print' ( (lv_expression_1_0= ruleExpression ) ) )
            // InternalHale.g:1370:3: otherlv_0= 'print' ( (lv_expression_1_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getPrintAccess().getPrintKeyword_0());
            		
            // InternalHale.g:1374:3: ( (lv_expression_1_0= ruleExpression ) )
            // InternalHale.g:1375:4: (lv_expression_1_0= ruleExpression )
            {
            // InternalHale.g:1375:4: (lv_expression_1_0= ruleExpression )
            // InternalHale.g:1376:5: lv_expression_1_0= ruleExpression
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
    // InternalHale.g:1397:1: entryRuleIf returns [EObject current=null] : iv_ruleIf= ruleIf EOF ;
    public final EObject entryRuleIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIf = null;


        try {
            // InternalHale.g:1397:43: (iv_ruleIf= ruleIf EOF )
            // InternalHale.g:1398:2: iv_ruleIf= ruleIf EOF
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
    // InternalHale.g:1404:1: ruleIf returns [EObject current=null] : (otherlv_0= 'if' ( (lv_conditions_1_0= ruleExpression ) ) ( (lv_ifBlocks_2_0= ruleBracedBlock ) ) (otherlv_3= 'elseif' ( (lv_conditions_4_0= ruleExpression ) ) ( (lv_ifBlocks_5_0= ruleBracedBlock ) ) )* (otherlv_6= 'else' ( (lv_elseBlock_7_0= ruleBracedBlock ) ) )? ) ;
    public final EObject ruleIf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_conditions_1_0 = null;

        EObject lv_ifBlocks_2_0 = null;

        EObject lv_conditions_4_0 = null;

        EObject lv_ifBlocks_5_0 = null;

        EObject lv_elseBlock_7_0 = null;



        	enterRule();

        try {
            // InternalHale.g:1410:2: ( (otherlv_0= 'if' ( (lv_conditions_1_0= ruleExpression ) ) ( (lv_ifBlocks_2_0= ruleBracedBlock ) ) (otherlv_3= 'elseif' ( (lv_conditions_4_0= ruleExpression ) ) ( (lv_ifBlocks_5_0= ruleBracedBlock ) ) )* (otherlv_6= 'else' ( (lv_elseBlock_7_0= ruleBracedBlock ) ) )? ) )
            // InternalHale.g:1411:2: (otherlv_0= 'if' ( (lv_conditions_1_0= ruleExpression ) ) ( (lv_ifBlocks_2_0= ruleBracedBlock ) ) (otherlv_3= 'elseif' ( (lv_conditions_4_0= ruleExpression ) ) ( (lv_ifBlocks_5_0= ruleBracedBlock ) ) )* (otherlv_6= 'else' ( (lv_elseBlock_7_0= ruleBracedBlock ) ) )? )
            {
            // InternalHale.g:1411:2: (otherlv_0= 'if' ( (lv_conditions_1_0= ruleExpression ) ) ( (lv_ifBlocks_2_0= ruleBracedBlock ) ) (otherlv_3= 'elseif' ( (lv_conditions_4_0= ruleExpression ) ) ( (lv_ifBlocks_5_0= ruleBracedBlock ) ) )* (otherlv_6= 'else' ( (lv_elseBlock_7_0= ruleBracedBlock ) ) )? )
            // InternalHale.g:1412:3: otherlv_0= 'if' ( (lv_conditions_1_0= ruleExpression ) ) ( (lv_ifBlocks_2_0= ruleBracedBlock ) ) (otherlv_3= 'elseif' ( (lv_conditions_4_0= ruleExpression ) ) ( (lv_ifBlocks_5_0= ruleBracedBlock ) ) )* (otherlv_6= 'else' ( (lv_elseBlock_7_0= ruleBracedBlock ) ) )?
            {
            otherlv_0=(Token)match(input,34,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getIfAccess().getIfKeyword_0());
            		
            // InternalHale.g:1416:3: ( (lv_conditions_1_0= ruleExpression ) )
            // InternalHale.g:1417:4: (lv_conditions_1_0= ruleExpression )
            {
            // InternalHale.g:1417:4: (lv_conditions_1_0= ruleExpression )
            // InternalHale.g:1418:5: lv_conditions_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getIfAccess().getConditionsExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_18);
            lv_conditions_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfRule());
            					}
            					add(
            						current,
            						"conditions",
            						lv_conditions_1_0,
            						"willburden.hale.Hale.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalHale.g:1435:3: ( (lv_ifBlocks_2_0= ruleBracedBlock ) )
            // InternalHale.g:1436:4: (lv_ifBlocks_2_0= ruleBracedBlock )
            {
            // InternalHale.g:1436:4: (lv_ifBlocks_2_0= ruleBracedBlock )
            // InternalHale.g:1437:5: lv_ifBlocks_2_0= ruleBracedBlock
            {

            					newCompositeNode(grammarAccess.getIfAccess().getIfBlocksBracedBlockParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_19);
            lv_ifBlocks_2_0=ruleBracedBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfRule());
            					}
            					add(
            						current,
            						"ifBlocks",
            						lv_ifBlocks_2_0,
            						"willburden.hale.Hale.BracedBlock");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalHale.g:1454:3: (otherlv_3= 'elseif' ( (lv_conditions_4_0= ruleExpression ) ) ( (lv_ifBlocks_5_0= ruleBracedBlock ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==35) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalHale.g:1455:4: otherlv_3= 'elseif' ( (lv_conditions_4_0= ruleExpression ) ) ( (lv_ifBlocks_5_0= ruleBracedBlock ) )
            	    {
            	    otherlv_3=(Token)match(input,35,FOLLOW_8); 

            	    				newLeafNode(otherlv_3, grammarAccess.getIfAccess().getElseifKeyword_3_0());
            	    			
            	    // InternalHale.g:1459:4: ( (lv_conditions_4_0= ruleExpression ) )
            	    // InternalHale.g:1460:5: (lv_conditions_4_0= ruleExpression )
            	    {
            	    // InternalHale.g:1460:5: (lv_conditions_4_0= ruleExpression )
            	    // InternalHale.g:1461:6: lv_conditions_4_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getIfAccess().getConditionsExpressionParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_conditions_4_0=ruleExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getIfRule());
            	    						}
            	    						add(
            	    							current,
            	    							"conditions",
            	    							lv_conditions_4_0,
            	    							"willburden.hale.Hale.Expression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalHale.g:1478:4: ( (lv_ifBlocks_5_0= ruleBracedBlock ) )
            	    // InternalHale.g:1479:5: (lv_ifBlocks_5_0= ruleBracedBlock )
            	    {
            	    // InternalHale.g:1479:5: (lv_ifBlocks_5_0= ruleBracedBlock )
            	    // InternalHale.g:1480:6: lv_ifBlocks_5_0= ruleBracedBlock
            	    {

            	    						newCompositeNode(grammarAccess.getIfAccess().getIfBlocksBracedBlockParserRuleCall_3_2_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_ifBlocks_5_0=ruleBracedBlock();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getIfRule());
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
            	    break loop14;
                }
            } while (true);

            // InternalHale.g:1498:3: (otherlv_6= 'else' ( (lv_elseBlock_7_0= ruleBracedBlock ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==36) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalHale.g:1499:4: otherlv_6= 'else' ( (lv_elseBlock_7_0= ruleBracedBlock ) )
                    {
                    otherlv_6=(Token)match(input,36,FOLLOW_18); 

                    				newLeafNode(otherlv_6, grammarAccess.getIfAccess().getElseKeyword_4_0());
                    			
                    // InternalHale.g:1503:4: ( (lv_elseBlock_7_0= ruleBracedBlock ) )
                    // InternalHale.g:1504:5: (lv_elseBlock_7_0= ruleBracedBlock )
                    {
                    // InternalHale.g:1504:5: (lv_elseBlock_7_0= ruleBracedBlock )
                    // InternalHale.g:1505:6: lv_elseBlock_7_0= ruleBracedBlock
                    {

                    						newCompositeNode(grammarAccess.getIfAccess().getElseBlockBracedBlockParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_elseBlock_7_0=ruleBracedBlock();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIfRule());
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
    // $ANTLR end "ruleIf"


    // $ANTLR start "entryRuleWhile"
    // InternalHale.g:1527:1: entryRuleWhile returns [EObject current=null] : iv_ruleWhile= ruleWhile EOF ;
    public final EObject entryRuleWhile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhile = null;


        try {
            // InternalHale.g:1527:46: (iv_ruleWhile= ruleWhile EOF )
            // InternalHale.g:1528:2: iv_ruleWhile= ruleWhile EOF
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
    // InternalHale.g:1534:1: ruleWhile returns [EObject current=null] : (otherlv_0= 'while' ( (lv_condition_1_0= ruleExpression ) ) ( (lv_block_2_0= ruleBracedBlock ) ) ) ;
    public final EObject ruleWhile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_condition_1_0 = null;

        EObject lv_block_2_0 = null;



        	enterRule();

        try {
            // InternalHale.g:1540:2: ( (otherlv_0= 'while' ( (lv_condition_1_0= ruleExpression ) ) ( (lv_block_2_0= ruleBracedBlock ) ) ) )
            // InternalHale.g:1541:2: (otherlv_0= 'while' ( (lv_condition_1_0= ruleExpression ) ) ( (lv_block_2_0= ruleBracedBlock ) ) )
            {
            // InternalHale.g:1541:2: (otherlv_0= 'while' ( (lv_condition_1_0= ruleExpression ) ) ( (lv_block_2_0= ruleBracedBlock ) ) )
            // InternalHale.g:1542:3: otherlv_0= 'while' ( (lv_condition_1_0= ruleExpression ) ) ( (lv_block_2_0= ruleBracedBlock ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getWhileAccess().getWhileKeyword_0());
            		
            // InternalHale.g:1546:3: ( (lv_condition_1_0= ruleExpression ) )
            // InternalHale.g:1547:4: (lv_condition_1_0= ruleExpression )
            {
            // InternalHale.g:1547:4: (lv_condition_1_0= ruleExpression )
            // InternalHale.g:1548:5: lv_condition_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getWhileAccess().getConditionExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_18);
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

            // InternalHale.g:1565:3: ( (lv_block_2_0= ruleBracedBlock ) )
            // InternalHale.g:1566:4: (lv_block_2_0= ruleBracedBlock )
            {
            // InternalHale.g:1566:4: (lv_block_2_0= ruleBracedBlock )
            // InternalHale.g:1567:5: lv_block_2_0= ruleBracedBlock
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000002658400C72L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000002658401C70L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000002658400870L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000001E0002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000003800002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000080000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000001800000002L});

}