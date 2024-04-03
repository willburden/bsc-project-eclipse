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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'print'", "'let'", "'mut'", "'='", "'*'", "'/'", "'-'", "'+'", "'('", "')'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;
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
    // InternalHale.g:71:1: ruleHale returns [EObject current=null] : ( () ( (lv_statements_1_0= ruleStatement ) )* ) ;
    public final EObject ruleHale() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_1_0 = null;



        	enterRule();

        try {
            // InternalHale.g:77:2: ( ( () ( (lv_statements_1_0= ruleStatement ) )* ) )
            // InternalHale.g:78:2: ( () ( (lv_statements_1_0= ruleStatement ) )* )
            {
            // InternalHale.g:78:2: ( () ( (lv_statements_1_0= ruleStatement ) )* )
            // InternalHale.g:79:3: () ( (lv_statements_1_0= ruleStatement ) )*
            {
            // InternalHale.g:79:3: ()
            // InternalHale.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHaleAccess().getHaleAction_0(),
            					current);
            			

            }

            // InternalHale.g:86:3: ( (lv_statements_1_0= ruleStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_STRING)||(LA1_0>=12 && LA1_0<=13)||LA1_0==20) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalHale.g:87:4: (lv_statements_1_0= ruleStatement )
            	    {
            	    // InternalHale.g:87:4: (lv_statements_1_0= ruleStatement )
            	    // InternalHale.g:88:5: lv_statements_1_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getHaleAccess().getStatementsStatementParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_statements_1_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getHaleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_1_0,
            	    						"willburden.hale.Hale.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


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
    // $ANTLR end "ruleHale"


    // $ANTLR start "entryRuleStatement"
    // InternalHale.g:109:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalHale.g:109:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalHale.g:110:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalHale.g:116:1: ruleStatement returns [EObject current=null] : ( (this_Print_0= rulePrint | this_Binding_1= ruleBinding | this_Assignment_2= ruleAssignment | this_Expression_3= ruleExpression ) otherlv_4= ';' ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_Print_0 = null;

        EObject this_Binding_1 = null;

        EObject this_Assignment_2 = null;

        EObject this_Expression_3 = null;



        	enterRule();

        try {
            // InternalHale.g:122:2: ( ( (this_Print_0= rulePrint | this_Binding_1= ruleBinding | this_Assignment_2= ruleAssignment | this_Expression_3= ruleExpression ) otherlv_4= ';' ) )
            // InternalHale.g:123:2: ( (this_Print_0= rulePrint | this_Binding_1= ruleBinding | this_Assignment_2= ruleAssignment | this_Expression_3= ruleExpression ) otherlv_4= ';' )
            {
            // InternalHale.g:123:2: ( (this_Print_0= rulePrint | this_Binding_1= ruleBinding | this_Assignment_2= ruleAssignment | this_Expression_3= ruleExpression ) otherlv_4= ';' )
            // InternalHale.g:124:3: (this_Print_0= rulePrint | this_Binding_1= ruleBinding | this_Assignment_2= ruleAssignment | this_Expression_3= ruleExpression ) otherlv_4= ';'
            {
            // InternalHale.g:124:3: (this_Print_0= rulePrint | this_Binding_1= ruleBinding | this_Assignment_2= ruleAssignment | this_Expression_3= ruleExpression )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt2=1;
                }
                break;
            case 13:
                {
                alt2=2;
                }
                break;
            case RULE_ID:
                {
                int LA2_3 = input.LA(2);

                if ( (LA2_3==11||(LA2_3>=16 && LA2_3<=19)) ) {
                    alt2=4;
                }
                else if ( (LA2_3==15) ) {
                    alt2=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
            case RULE_STRING:
            case 20:
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
                    // InternalHale.g:125:4: this_Print_0= rulePrint
                    {

                    				newCompositeNode(grammarAccess.getStatementAccess().getPrintParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_4);
                    this_Print_0=rulePrint();

                    state._fsp--;


                    				current = this_Print_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalHale.g:134:4: this_Binding_1= ruleBinding
                    {

                    				newCompositeNode(grammarAccess.getStatementAccess().getBindingParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_4);
                    this_Binding_1=ruleBinding();

                    state._fsp--;


                    				current = this_Binding_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalHale.g:143:4: this_Assignment_2= ruleAssignment
                    {

                    				newCompositeNode(grammarAccess.getStatementAccess().getAssignmentParserRuleCall_0_2());
                    			
                    pushFollow(FOLLOW_4);
                    this_Assignment_2=ruleAssignment();

                    state._fsp--;


                    				current = this_Assignment_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 4 :
                    // InternalHale.g:152:4: this_Expression_3= ruleExpression
                    {

                    				newCompositeNode(grammarAccess.getStatementAccess().getExpressionParserRuleCall_0_3());
                    			
                    pushFollow(FOLLOW_4);
                    this_Expression_3=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_3;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_4=(Token)match(input,11,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getStatementAccess().getSemicolonKeyword_1());
            		

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


    // $ANTLR start "entryRulePrint"
    // InternalHale.g:169:1: entryRulePrint returns [EObject current=null] : iv_rulePrint= rulePrint EOF ;
    public final EObject entryRulePrint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrint = null;


        try {
            // InternalHale.g:169:46: (iv_rulePrint= rulePrint EOF )
            // InternalHale.g:170:2: iv_rulePrint= rulePrint EOF
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
    // InternalHale.g:176:1: rulePrint returns [EObject current=null] : (otherlv_0= 'print' ( (lv_value_1_0= ruleExpression ) ) ) ;
    public final EObject rulePrint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalHale.g:182:2: ( (otherlv_0= 'print' ( (lv_value_1_0= ruleExpression ) ) ) )
            // InternalHale.g:183:2: (otherlv_0= 'print' ( (lv_value_1_0= ruleExpression ) ) )
            {
            // InternalHale.g:183:2: (otherlv_0= 'print' ( (lv_value_1_0= ruleExpression ) ) )
            // InternalHale.g:184:3: otherlv_0= 'print' ( (lv_value_1_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getPrintAccess().getPrintKeyword_0());
            		
            // InternalHale.g:188:3: ( (lv_value_1_0= ruleExpression ) )
            // InternalHale.g:189:4: (lv_value_1_0= ruleExpression )
            {
            // InternalHale.g:189:4: (lv_value_1_0= ruleExpression )
            // InternalHale.g:190:5: lv_value_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getPrintAccess().getValueExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPrintRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
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


    // $ANTLR start "entryRuleBinding"
    // InternalHale.g:211:1: entryRuleBinding returns [EObject current=null] : iv_ruleBinding= ruleBinding EOF ;
    public final EObject entryRuleBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinding = null;


        try {
            // InternalHale.g:211:48: (iv_ruleBinding= ruleBinding EOF )
            // InternalHale.g:212:2: iv_ruleBinding= ruleBinding EOF
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
    // InternalHale.g:218:1: ruleBinding returns [EObject current=null] : (otherlv_0= 'let' ( (lv_mutable_1_0= 'mut' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) ) ) ;
    public final EObject ruleBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_mutable_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalHale.g:224:2: ( (otherlv_0= 'let' ( (lv_mutable_1_0= 'mut' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) ) ) )
            // InternalHale.g:225:2: (otherlv_0= 'let' ( (lv_mutable_1_0= 'mut' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) ) )
            {
            // InternalHale.g:225:2: (otherlv_0= 'let' ( (lv_mutable_1_0= 'mut' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) ) )
            // InternalHale.g:226:3: otherlv_0= 'let' ( (lv_mutable_1_0= 'mut' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getBindingAccess().getLetKeyword_0());
            		
            // InternalHale.g:230:3: ( (lv_mutable_1_0= 'mut' ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalHale.g:231:4: (lv_mutable_1_0= 'mut' )
                    {
                    // InternalHale.g:231:4: (lv_mutable_1_0= 'mut' )
                    // InternalHale.g:232:5: lv_mutable_1_0= 'mut'
                    {
                    lv_mutable_1_0=(Token)match(input,14,FOLLOW_7); 

                    					newLeafNode(lv_mutable_1_0, grammarAccess.getBindingAccess().getMutableMutKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBindingRule());
                    					}
                    					setWithLastConsumed(current, "mutable", lv_mutable_1_0 != null, "mut");
                    				

                    }


                    }
                    break;

            }

            // InternalHale.g:244:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalHale.g:245:4: (lv_name_2_0= RULE_ID )
            {
            // InternalHale.g:245:4: (lv_name_2_0= RULE_ID )
            // InternalHale.g:246:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_2_0, grammarAccess.getBindingAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBindingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getBindingAccess().getEqualsSignKeyword_3());
            		
            // InternalHale.g:266:3: ( (lv_value_4_0= ruleExpression ) )
            // InternalHale.g:267:4: (lv_value_4_0= ruleExpression )
            {
            // InternalHale.g:267:4: (lv_value_4_0= ruleExpression )
            // InternalHale.g:268:5: lv_value_4_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getBindingAccess().getValueExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_4_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBindingRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_4_0,
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
    // InternalHale.g:289:1: entryRuleBindingReference returns [EObject current=null] : iv_ruleBindingReference= ruleBindingReference EOF ;
    public final EObject entryRuleBindingReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBindingReference = null;


        try {
            // InternalHale.g:289:57: (iv_ruleBindingReference= ruleBindingReference EOF )
            // InternalHale.g:290:2: iv_ruleBindingReference= ruleBindingReference EOF
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
    // InternalHale.g:296:1: ruleBindingReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleBindingReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalHale.g:302:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalHale.g:303:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalHale.g:303:2: ( (otherlv_0= RULE_ID ) )
            // InternalHale.g:304:3: (otherlv_0= RULE_ID )
            {
            // InternalHale.g:304:3: (otherlv_0= RULE_ID )
            // InternalHale.g:305:4: otherlv_0= RULE_ID
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
    // InternalHale.g:319:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalHale.g:319:51: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalHale.g:320:2: iv_ruleAssignment= ruleAssignment EOF
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
    // InternalHale.g:326:1: ruleAssignment returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalHale.g:332:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) ) )
            // InternalHale.g:333:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )
            {
            // InternalHale.g:333:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )
            // InternalHale.g:334:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) )
            {
            // InternalHale.g:334:3: ( (otherlv_0= RULE_ID ) )
            // InternalHale.g:335:4: (otherlv_0= RULE_ID )
            {
            // InternalHale.g:335:4: (otherlv_0= RULE_ID )
            // InternalHale.g:336:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssignmentRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_0, grammarAccess.getAssignmentAccess().getBindingBindingCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1());
            		
            // InternalHale.g:351:3: ( (lv_value_2_0= ruleExpression ) )
            // InternalHale.g:352:4: (lv_value_2_0= ruleExpression )
            {
            // InternalHale.g:352:4: (lv_value_2_0= ruleExpression )
            // InternalHale.g:353:5: lv_value_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getAssignmentAccess().getValueExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssignmentRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
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


    // $ANTLR start "entryRuleExpression"
    // InternalHale.g:374:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalHale.g:374:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalHale.g:375:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalHale.g:381:1: ruleExpression returns [EObject current=null] : (this_TerminalExpression_0= ruleTerminalExpression ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleTerminalExpression ) ) )+ | ( () otherlv_5= '/' ( (lv_right_6_0= ruleTerminalExpression ) ) )+ | ( () otherlv_8= '-' ( (lv_right_9_0= ruleTerminalExpression ) ) )+ | ( () otherlv_11= '+' ( (lv_right_12_0= ruleTerminalExpression ) ) )+ )? ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        EObject this_TerminalExpression_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;

        EObject lv_right_9_0 = null;

        EObject lv_right_12_0 = null;



        	enterRule();

        try {
            // InternalHale.g:387:2: ( (this_TerminalExpression_0= ruleTerminalExpression ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleTerminalExpression ) ) )+ | ( () otherlv_5= '/' ( (lv_right_6_0= ruleTerminalExpression ) ) )+ | ( () otherlv_8= '-' ( (lv_right_9_0= ruleTerminalExpression ) ) )+ | ( () otherlv_11= '+' ( (lv_right_12_0= ruleTerminalExpression ) ) )+ )? ) )
            // InternalHale.g:388:2: (this_TerminalExpression_0= ruleTerminalExpression ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleTerminalExpression ) ) )+ | ( () otherlv_5= '/' ( (lv_right_6_0= ruleTerminalExpression ) ) )+ | ( () otherlv_8= '-' ( (lv_right_9_0= ruleTerminalExpression ) ) )+ | ( () otherlv_11= '+' ( (lv_right_12_0= ruleTerminalExpression ) ) )+ )? )
            {
            // InternalHale.g:388:2: (this_TerminalExpression_0= ruleTerminalExpression ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleTerminalExpression ) ) )+ | ( () otherlv_5= '/' ( (lv_right_6_0= ruleTerminalExpression ) ) )+ | ( () otherlv_8= '-' ( (lv_right_9_0= ruleTerminalExpression ) ) )+ | ( () otherlv_11= '+' ( (lv_right_12_0= ruleTerminalExpression ) ) )+ )? )
            // InternalHale.g:389:3: this_TerminalExpression_0= ruleTerminalExpression ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleTerminalExpression ) ) )+ | ( () otherlv_5= '/' ( (lv_right_6_0= ruleTerminalExpression ) ) )+ | ( () otherlv_8= '-' ( (lv_right_9_0= ruleTerminalExpression ) ) )+ | ( () otherlv_11= '+' ( (lv_right_12_0= ruleTerminalExpression ) ) )+ )?
            {

            			newCompositeNode(grammarAccess.getExpressionAccess().getTerminalExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_9);
            this_TerminalExpression_0=ruleTerminalExpression();

            state._fsp--;


            			current = this_TerminalExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHale.g:397:3: ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleTerminalExpression ) ) )+ | ( () otherlv_5= '/' ( (lv_right_6_0= ruleTerminalExpression ) ) )+ | ( () otherlv_8= '-' ( (lv_right_9_0= ruleTerminalExpression ) ) )+ | ( () otherlv_11= '+' ( (lv_right_12_0= ruleTerminalExpression ) ) )+ )?
            int alt8=5;
            switch ( input.LA(1) ) {
                case 16:
                    {
                    alt8=1;
                    }
                    break;
                case 17:
                    {
                    alt8=2;
                    }
                    break;
                case 18:
                    {
                    alt8=3;
                    }
                    break;
                case 19:
                    {
                    alt8=4;
                    }
                    break;
            }

            switch (alt8) {
                case 1 :
                    // InternalHale.g:398:4: ( () otherlv_2= '*' ( (lv_right_3_0= ruleTerminalExpression ) ) )+
                    {
                    // InternalHale.g:398:4: ( () otherlv_2= '*' ( (lv_right_3_0= ruleTerminalExpression ) ) )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==16) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalHale.g:399:5: () otherlv_2= '*' ( (lv_right_3_0= ruleTerminalExpression ) )
                    	    {
                    	    // InternalHale.g:399:5: ()
                    	    // InternalHale.g:400:6: 
                    	    {

                    	    						current = forceCreateModelElementAndSet(
                    	    							grammarAccess.getExpressionAccess().getMultiplicationLeftAction_1_0_0(),
                    	    							current);
                    	    					

                    	    }

                    	    otherlv_2=(Token)match(input,16,FOLLOW_10); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getExpressionAccess().getAsteriskKeyword_1_0_1());
                    	    				
                    	    // InternalHale.g:410:5: ( (lv_right_3_0= ruleTerminalExpression ) )
                    	    // InternalHale.g:411:6: (lv_right_3_0= ruleTerminalExpression )
                    	    {
                    	    // InternalHale.g:411:6: (lv_right_3_0= ruleTerminalExpression )
                    	    // InternalHale.g:412:7: lv_right_3_0= ruleTerminalExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getExpressionAccess().getRightTerminalExpressionParserRuleCall_1_0_2_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_right_3_0=ruleTerminalExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getExpressionRule());
                    	    							}
                    	    							set(
                    	    								current,
                    	    								"right",
                    	    								lv_right_3_0,
                    	    								"willburden.hale.Hale.TerminalExpression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalHale.g:431:4: ( () otherlv_5= '/' ( (lv_right_6_0= ruleTerminalExpression ) ) )+
                    {
                    // InternalHale.g:431:4: ( () otherlv_5= '/' ( (lv_right_6_0= ruleTerminalExpression ) ) )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==17) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalHale.g:432:5: () otherlv_5= '/' ( (lv_right_6_0= ruleTerminalExpression ) )
                    	    {
                    	    // InternalHale.g:432:5: ()
                    	    // InternalHale.g:433:6: 
                    	    {

                    	    						current = forceCreateModelElementAndSet(
                    	    							grammarAccess.getExpressionAccess().getDivisionLeftAction_1_1_0(),
                    	    							current);
                    	    					

                    	    }

                    	    otherlv_5=(Token)match(input,17,FOLLOW_12); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getExpressionAccess().getSolidusKeyword_1_1_1());
                    	    				
                    	    // InternalHale.g:443:5: ( (lv_right_6_0= ruleTerminalExpression ) )
                    	    // InternalHale.g:444:6: (lv_right_6_0= ruleTerminalExpression )
                    	    {
                    	    // InternalHale.g:444:6: (lv_right_6_0= ruleTerminalExpression )
                    	    // InternalHale.g:445:7: lv_right_6_0= ruleTerminalExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getExpressionAccess().getRightTerminalExpressionParserRuleCall_1_1_2_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_right_6_0=ruleTerminalExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getExpressionRule());
                    	    							}
                    	    							set(
                    	    								current,
                    	    								"right",
                    	    								lv_right_6_0,
                    	    								"willburden.hale.Hale.TerminalExpression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


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


                    }
                    break;
                case 3 :
                    // InternalHale.g:464:4: ( () otherlv_8= '-' ( (lv_right_9_0= ruleTerminalExpression ) ) )+
                    {
                    // InternalHale.g:464:4: ( () otherlv_8= '-' ( (lv_right_9_0= ruleTerminalExpression ) ) )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==18) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalHale.g:465:5: () otherlv_8= '-' ( (lv_right_9_0= ruleTerminalExpression ) )
                    	    {
                    	    // InternalHale.g:465:5: ()
                    	    // InternalHale.g:466:6: 
                    	    {

                    	    						current = forceCreateModelElementAndSet(
                    	    							grammarAccess.getExpressionAccess().getSubtractionLeftAction_1_2_0(),
                    	    							current);
                    	    					

                    	    }

                    	    otherlv_8=(Token)match(input,18,FOLLOW_14); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getExpressionAccess().getHyphenMinusKeyword_1_2_1());
                    	    				
                    	    // InternalHale.g:476:5: ( (lv_right_9_0= ruleTerminalExpression ) )
                    	    // InternalHale.g:477:6: (lv_right_9_0= ruleTerminalExpression )
                    	    {
                    	    // InternalHale.g:477:6: (lv_right_9_0= ruleTerminalExpression )
                    	    // InternalHale.g:478:7: lv_right_9_0= ruleTerminalExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getExpressionAccess().getRightTerminalExpressionParserRuleCall_1_2_2_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_right_9_0=ruleTerminalExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getExpressionRule());
                    	    							}
                    	    							set(
                    	    								current,
                    	    								"right",
                    	    								lv_right_9_0,
                    	    								"willburden.hale.Hale.TerminalExpression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


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
                case 4 :
                    // InternalHale.g:497:4: ( () otherlv_11= '+' ( (lv_right_12_0= ruleTerminalExpression ) ) )+
                    {
                    // InternalHale.g:497:4: ( () otherlv_11= '+' ( (lv_right_12_0= ruleTerminalExpression ) ) )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==19) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalHale.g:498:5: () otherlv_11= '+' ( (lv_right_12_0= ruleTerminalExpression ) )
                    	    {
                    	    // InternalHale.g:498:5: ()
                    	    // InternalHale.g:499:6: 
                    	    {

                    	    						current = forceCreateModelElementAndSet(
                    	    							grammarAccess.getExpressionAccess().getAdditionLeftAction_1_3_0(),
                    	    							current);
                    	    					

                    	    }

                    	    otherlv_11=(Token)match(input,19,FOLLOW_16); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getExpressionAccess().getPlusSignKeyword_1_3_1());
                    	    				
                    	    // InternalHale.g:509:5: ( (lv_right_12_0= ruleTerminalExpression ) )
                    	    // InternalHale.g:510:6: (lv_right_12_0= ruleTerminalExpression )
                    	    {
                    	    // InternalHale.g:510:6: (lv_right_12_0= ruleTerminalExpression )
                    	    // InternalHale.g:511:7: lv_right_12_0= ruleTerminalExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getExpressionAccess().getRightTerminalExpressionParserRuleCall_1_3_2_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_right_12_0=ruleTerminalExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getExpressionRule());
                    	    							}
                    	    							set(
                    	    								current,
                    	    								"right",
                    	    								lv_right_12_0,
                    	    								"willburden.hale.Hale.TerminalExpression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleTerminalExpression"
    // InternalHale.g:534:1: entryRuleTerminalExpression returns [EObject current=null] : iv_ruleTerminalExpression= ruleTerminalExpression EOF ;
    public final EObject entryRuleTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalExpression = null;


        try {
            // InternalHale.g:534:59: (iv_ruleTerminalExpression= ruleTerminalExpression EOF )
            // InternalHale.g:535:2: iv_ruleTerminalExpression= ruleTerminalExpression EOF
            {
             newCompositeNode(grammarAccess.getTerminalExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerminalExpression=ruleTerminalExpression();

            state._fsp--;

             current =iv_ruleTerminalExpression; 
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
    // $ANTLR end "entryRuleTerminalExpression"


    // $ANTLR start "ruleTerminalExpression"
    // InternalHale.g:541:1: ruleTerminalExpression returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_BindingReference_3= ruleBindingReference | this_Literal_4= ruleLiteral ) ;
    public final EObject ruleTerminalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Expression_1 = null;

        EObject this_BindingReference_3 = null;

        EObject this_Literal_4 = null;



        	enterRule();

        try {
            // InternalHale.g:547:2: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_BindingReference_3= ruleBindingReference | this_Literal_4= ruleLiteral ) )
            // InternalHale.g:548:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_BindingReference_3= ruleBindingReference | this_Literal_4= ruleLiteral )
            {
            // InternalHale.g:548:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_BindingReference_3= ruleBindingReference | this_Literal_4= ruleLiteral )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt9=1;
                }
                break;
            case RULE_ID:
                {
                alt9=2;
                }
                break;
            case RULE_INT:
            case RULE_STRING:
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
                    // InternalHale.g:549:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // InternalHale.g:549:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // InternalHale.g:550:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,20,FOLLOW_18); 

                    				newLeafNode(otherlv_0, grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getTerminalExpressionAccess().getExpressionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_19);
                    this_Expression_1=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,21,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalHale.g:568:3: this_BindingReference_3= ruleBindingReference
                    {

                    			newCompositeNode(grammarAccess.getTerminalExpressionAccess().getBindingReferenceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_BindingReference_3=ruleBindingReference();

                    state._fsp--;


                    			current = this_BindingReference_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalHale.g:577:3: this_Literal_4= ruleLiteral
                    {

                    			newCompositeNode(grammarAccess.getTerminalExpressionAccess().getLiteralParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Literal_4=ruleLiteral();

                    state._fsp--;


                    			current = this_Literal_4;
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
    // $ANTLR end "ruleTerminalExpression"


    // $ANTLR start "entryRuleLiteral"
    // InternalHale.g:589:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalHale.g:589:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalHale.g:590:2: iv_ruleLiteral= ruleLiteral EOF
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
    // InternalHale.g:596:1: ruleLiteral returns [EObject current=null] : (this_IntLiteral_0= ruleIntLiteral | this_StringLiteral_1= ruleStringLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_IntLiteral_0 = null;

        EObject this_StringLiteral_1 = null;



        	enterRule();

        try {
            // InternalHale.g:602:2: ( (this_IntLiteral_0= ruleIntLiteral | this_StringLiteral_1= ruleStringLiteral ) )
            // InternalHale.g:603:2: (this_IntLiteral_0= ruleIntLiteral | this_StringLiteral_1= ruleStringLiteral )
            {
            // InternalHale.g:603:2: (this_IntLiteral_0= ruleIntLiteral | this_StringLiteral_1= ruleStringLiteral )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_STRING) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalHale.g:604:3: this_IntLiteral_0= ruleIntLiteral
                    {

                    			newCompositeNode(grammarAccess.getLiteralAccess().getIntLiteralParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntLiteral_0=ruleIntLiteral();

                    state._fsp--;


                    			current = this_IntLiteral_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalHale.g:613:3: this_StringLiteral_1= ruleStringLiteral
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


    // $ANTLR start "entryRuleIntLiteral"
    // InternalHale.g:625:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // InternalHale.g:625:51: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // InternalHale.g:626:2: iv_ruleIntLiteral= ruleIntLiteral EOF
            {
             newCompositeNode(grammarAccess.getIntLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntLiteral=ruleIntLiteral();

            state._fsp--;

             current =iv_ruleIntLiteral; 
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
    // $ANTLR end "entryRuleIntLiteral"


    // $ANTLR start "ruleIntLiteral"
    // InternalHale.g:632:1: ruleIntLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalHale.g:638:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalHale.g:639:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalHale.g:639:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalHale.g:640:3: (lv_value_0_0= RULE_INT )
            {
            // InternalHale.g:640:3: (lv_value_0_0= RULE_INT )
            // InternalHale.g:641:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getIntLiteralAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIntLiteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

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
    // $ANTLR end "ruleIntLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalHale.g:660:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalHale.g:660:54: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalHale.g:661:2: iv_ruleStringLiteral= ruleStringLiteral EOF
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
    // InternalHale.g:667:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalHale.g:673:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalHale.g:674:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalHale.g:674:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalHale.g:675:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalHale.g:675:3: (lv_value_0_0= RULE_STRING )
            // InternalHale.g:676:4: lv_value_0_0= RULE_STRING
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
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000103072L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000103070L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000F0002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000113070L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000123070L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000143070L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000183070L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000303070L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000200000L});

}