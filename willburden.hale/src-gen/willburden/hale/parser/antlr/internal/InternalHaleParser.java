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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'print'", "'let'", "'mut'", "'='", "'and'", "'or'", "'=='", "'!='", "'<='", "'<'", "'>='", "'>'", "'+'", "'-'", "'*'", "'/'", "'%'", "'**'", "'not'", "'('", "')'"
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
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
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

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_STRING)||(LA1_0>=12 && LA1_0<=13)||LA1_0==25||(LA1_0>=30 && LA1_0<=31)) ) {
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

                if ( (LA2_3==15) ) {
                    alt2=3;
                }
                else if ( (LA2_3==11||(LA2_3>=16 && LA2_3<=29)) ) {
                    alt2=4;
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
            case 25:
            case 30:
            case 31:
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
    // InternalHale.g:381:1: ruleExpression returns [EObject current=null] : this_Expression7_0= ruleExpression7 ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Expression7_0 = null;



        	enterRule();

        try {
            // InternalHale.g:387:2: (this_Expression7_0= ruleExpression7 )
            // InternalHale.g:388:2: this_Expression7_0= ruleExpression7
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
    // InternalHale.g:399:1: entryRuleExpression7 returns [EObject current=null] : iv_ruleExpression7= ruleExpression7 EOF ;
    public final EObject entryRuleExpression7() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression7 = null;


        try {
            // InternalHale.g:399:52: (iv_ruleExpression7= ruleExpression7 EOF )
            // InternalHale.g:400:2: iv_ruleExpression7= ruleExpression7 EOF
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
    // InternalHale.g:406:1: ruleExpression7 returns [EObject current=null] : (this_Expression6_0= ruleExpression6 ( ( () otherlv_2= 'and' ( (lv_right_3_0= ruleExpression6 ) ) ) | ( () otherlv_5= 'or' ( (lv_right_6_0= ruleExpression6 ) ) ) )* ) ;
    public final EObject ruleExpression7() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_Expression6_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalHale.g:412:2: ( (this_Expression6_0= ruleExpression6 ( ( () otherlv_2= 'and' ( (lv_right_3_0= ruleExpression6 ) ) ) | ( () otherlv_5= 'or' ( (lv_right_6_0= ruleExpression6 ) ) ) )* ) )
            // InternalHale.g:413:2: (this_Expression6_0= ruleExpression6 ( ( () otherlv_2= 'and' ( (lv_right_3_0= ruleExpression6 ) ) ) | ( () otherlv_5= 'or' ( (lv_right_6_0= ruleExpression6 ) ) ) )* )
            {
            // InternalHale.g:413:2: (this_Expression6_0= ruleExpression6 ( ( () otherlv_2= 'and' ( (lv_right_3_0= ruleExpression6 ) ) ) | ( () otherlv_5= 'or' ( (lv_right_6_0= ruleExpression6 ) ) ) )* )
            // InternalHale.g:414:3: this_Expression6_0= ruleExpression6 ( ( () otherlv_2= 'and' ( (lv_right_3_0= ruleExpression6 ) ) ) | ( () otherlv_5= 'or' ( (lv_right_6_0= ruleExpression6 ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpression7Access().getExpression6ParserRuleCall_0());
            		
            pushFollow(FOLLOW_9);
            this_Expression6_0=ruleExpression6();

            state._fsp--;


            			current = this_Expression6_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHale.g:422:3: ( ( () otherlv_2= 'and' ( (lv_right_3_0= ruleExpression6 ) ) ) | ( () otherlv_5= 'or' ( (lv_right_6_0= ruleExpression6 ) ) ) )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }
                else if ( (LA4_0==17) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalHale.g:423:4: ( () otherlv_2= 'and' ( (lv_right_3_0= ruleExpression6 ) ) )
            	    {
            	    // InternalHale.g:423:4: ( () otherlv_2= 'and' ( (lv_right_3_0= ruleExpression6 ) ) )
            	    // InternalHale.g:424:5: () otherlv_2= 'and' ( (lv_right_3_0= ruleExpression6 ) )
            	    {
            	    // InternalHale.g:424:5: ()
            	    // InternalHale.g:425:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpression7Access().getLogicalAndLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,16,FOLLOW_10); 

            	    					newLeafNode(otherlv_2, grammarAccess.getExpression7Access().getAndKeyword_1_0_1());
            	    				
            	    // InternalHale.g:435:5: ( (lv_right_3_0= ruleExpression6 ) )
            	    // InternalHale.g:436:6: (lv_right_3_0= ruleExpression6 )
            	    {
            	    // InternalHale.g:436:6: (lv_right_3_0= ruleExpression6 )
            	    // InternalHale.g:437:7: lv_right_3_0= ruleExpression6
            	    {

            	    							newCompositeNode(grammarAccess.getExpression7Access().getRightExpression6ParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_9);
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
            	    // InternalHale.g:456:4: ( () otherlv_5= 'or' ( (lv_right_6_0= ruleExpression6 ) ) )
            	    {
            	    // InternalHale.g:456:4: ( () otherlv_5= 'or' ( (lv_right_6_0= ruleExpression6 ) ) )
            	    // InternalHale.g:457:5: () otherlv_5= 'or' ( (lv_right_6_0= ruleExpression6 ) )
            	    {
            	    // InternalHale.g:457:5: ()
            	    // InternalHale.g:458:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpression7Access().getLogicalOrLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,17,FOLLOW_10); 

            	    					newLeafNode(otherlv_5, grammarAccess.getExpression7Access().getOrKeyword_1_1_1());
            	    				
            	    // InternalHale.g:468:5: ( (lv_right_6_0= ruleExpression6 ) )
            	    // InternalHale.g:469:6: (lv_right_6_0= ruleExpression6 )
            	    {
            	    // InternalHale.g:469:6: (lv_right_6_0= ruleExpression6 )
            	    // InternalHale.g:470:7: lv_right_6_0= ruleExpression6
            	    {

            	    							newCompositeNode(grammarAccess.getExpression7Access().getRightExpression6ParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_9);
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
    // InternalHale.g:493:1: entryRuleExpression6 returns [EObject current=null] : iv_ruleExpression6= ruleExpression6 EOF ;
    public final EObject entryRuleExpression6() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression6 = null;


        try {
            // InternalHale.g:493:52: (iv_ruleExpression6= ruleExpression6 EOF )
            // InternalHale.g:494:2: iv_ruleExpression6= ruleExpression6 EOF
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
    // InternalHale.g:500:1: ruleExpression6 returns [EObject current=null] : (this_Expression5_0= ruleExpression5 ( ( () otherlv_2= '==' ( (lv_right_3_0= ruleExpression5 ) ) ) | ( () otherlv_5= '!=' ( (lv_right_6_0= ruleExpression5 ) ) ) )* ) ;
    public final EObject ruleExpression6() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_Expression5_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalHale.g:506:2: ( (this_Expression5_0= ruleExpression5 ( ( () otherlv_2= '==' ( (lv_right_3_0= ruleExpression5 ) ) ) | ( () otherlv_5= '!=' ( (lv_right_6_0= ruleExpression5 ) ) ) )* ) )
            // InternalHale.g:507:2: (this_Expression5_0= ruleExpression5 ( ( () otherlv_2= '==' ( (lv_right_3_0= ruleExpression5 ) ) ) | ( () otherlv_5= '!=' ( (lv_right_6_0= ruleExpression5 ) ) ) )* )
            {
            // InternalHale.g:507:2: (this_Expression5_0= ruleExpression5 ( ( () otherlv_2= '==' ( (lv_right_3_0= ruleExpression5 ) ) ) | ( () otherlv_5= '!=' ( (lv_right_6_0= ruleExpression5 ) ) ) )* )
            // InternalHale.g:508:3: this_Expression5_0= ruleExpression5 ( ( () otherlv_2= '==' ( (lv_right_3_0= ruleExpression5 ) ) ) | ( () otherlv_5= '!=' ( (lv_right_6_0= ruleExpression5 ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpression6Access().getExpression5ParserRuleCall_0());
            		
            pushFollow(FOLLOW_11);
            this_Expression5_0=ruleExpression5();

            state._fsp--;


            			current = this_Expression5_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHale.g:516:3: ( ( () otherlv_2= '==' ( (lv_right_3_0= ruleExpression5 ) ) ) | ( () otherlv_5= '!=' ( (lv_right_6_0= ruleExpression5 ) ) ) )*
            loop5:
            do {
                int alt5=3;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    alt5=1;
                }
                else if ( (LA5_0==19) ) {
                    alt5=2;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalHale.g:517:4: ( () otherlv_2= '==' ( (lv_right_3_0= ruleExpression5 ) ) )
            	    {
            	    // InternalHale.g:517:4: ( () otherlv_2= '==' ( (lv_right_3_0= ruleExpression5 ) ) )
            	    // InternalHale.g:518:5: () otherlv_2= '==' ( (lv_right_3_0= ruleExpression5 ) )
            	    {
            	    // InternalHale.g:518:5: ()
            	    // InternalHale.g:519:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpression6Access().getEqualityLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,18,FOLLOW_12); 

            	    					newLeafNode(otherlv_2, grammarAccess.getExpression6Access().getEqualsSignEqualsSignKeyword_1_0_1());
            	    				
            	    // InternalHale.g:529:5: ( (lv_right_3_0= ruleExpression5 ) )
            	    // InternalHale.g:530:6: (lv_right_3_0= ruleExpression5 )
            	    {
            	    // InternalHale.g:530:6: (lv_right_3_0= ruleExpression5 )
            	    // InternalHale.g:531:7: lv_right_3_0= ruleExpression5
            	    {

            	    							newCompositeNode(grammarAccess.getExpression6Access().getRightExpression5ParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_11);
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
            	    // InternalHale.g:550:4: ( () otherlv_5= '!=' ( (lv_right_6_0= ruleExpression5 ) ) )
            	    {
            	    // InternalHale.g:550:4: ( () otherlv_5= '!=' ( (lv_right_6_0= ruleExpression5 ) ) )
            	    // InternalHale.g:551:5: () otherlv_5= '!=' ( (lv_right_6_0= ruleExpression5 ) )
            	    {
            	    // InternalHale.g:551:5: ()
            	    // InternalHale.g:552:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpression6Access().getInequalityLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,19,FOLLOW_12); 

            	    					newLeafNode(otherlv_5, grammarAccess.getExpression6Access().getExclamationMarkEqualsSignKeyword_1_1_1());
            	    				
            	    // InternalHale.g:562:5: ( (lv_right_6_0= ruleExpression5 ) )
            	    // InternalHale.g:563:6: (lv_right_6_0= ruleExpression5 )
            	    {
            	    // InternalHale.g:563:6: (lv_right_6_0= ruleExpression5 )
            	    // InternalHale.g:564:7: lv_right_6_0= ruleExpression5
            	    {

            	    							newCompositeNode(grammarAccess.getExpression6Access().getRightExpression5ParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_11);
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
    // InternalHale.g:587:1: entryRuleExpression5 returns [EObject current=null] : iv_ruleExpression5= ruleExpression5 EOF ;
    public final EObject entryRuleExpression5() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression5 = null;


        try {
            // InternalHale.g:587:52: (iv_ruleExpression5= ruleExpression5 EOF )
            // InternalHale.g:588:2: iv_ruleExpression5= ruleExpression5 EOF
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
    // InternalHale.g:594:1: ruleExpression5 returns [EObject current=null] : (this_Expression4_0= ruleExpression4 ( ( () otherlv_2= '<=' ( (lv_right_3_0= ruleExpression4 ) ) ) | ( () otherlv_5= '<' ( (lv_right_6_0= ruleExpression4 ) ) ) | ( () otherlv_8= '>=' ( (lv_right_9_0= ruleExpression4 ) ) ) | ( () otherlv_11= '>' ( (lv_right_12_0= ruleExpression4 ) ) ) )* ) ;
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
            // InternalHale.g:600:2: ( (this_Expression4_0= ruleExpression4 ( ( () otherlv_2= '<=' ( (lv_right_3_0= ruleExpression4 ) ) ) | ( () otherlv_5= '<' ( (lv_right_6_0= ruleExpression4 ) ) ) | ( () otherlv_8= '>=' ( (lv_right_9_0= ruleExpression4 ) ) ) | ( () otherlv_11= '>' ( (lv_right_12_0= ruleExpression4 ) ) ) )* ) )
            // InternalHale.g:601:2: (this_Expression4_0= ruleExpression4 ( ( () otherlv_2= '<=' ( (lv_right_3_0= ruleExpression4 ) ) ) | ( () otherlv_5= '<' ( (lv_right_6_0= ruleExpression4 ) ) ) | ( () otherlv_8= '>=' ( (lv_right_9_0= ruleExpression4 ) ) ) | ( () otherlv_11= '>' ( (lv_right_12_0= ruleExpression4 ) ) ) )* )
            {
            // InternalHale.g:601:2: (this_Expression4_0= ruleExpression4 ( ( () otherlv_2= '<=' ( (lv_right_3_0= ruleExpression4 ) ) ) | ( () otherlv_5= '<' ( (lv_right_6_0= ruleExpression4 ) ) ) | ( () otherlv_8= '>=' ( (lv_right_9_0= ruleExpression4 ) ) ) | ( () otherlv_11= '>' ( (lv_right_12_0= ruleExpression4 ) ) ) )* )
            // InternalHale.g:602:3: this_Expression4_0= ruleExpression4 ( ( () otherlv_2= '<=' ( (lv_right_3_0= ruleExpression4 ) ) ) | ( () otherlv_5= '<' ( (lv_right_6_0= ruleExpression4 ) ) ) | ( () otherlv_8= '>=' ( (lv_right_9_0= ruleExpression4 ) ) ) | ( () otherlv_11= '>' ( (lv_right_12_0= ruleExpression4 ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpression5Access().getExpression4ParserRuleCall_0());
            		
            pushFollow(FOLLOW_13);
            this_Expression4_0=ruleExpression4();

            state._fsp--;


            			current = this_Expression4_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHale.g:610:3: ( ( () otherlv_2= '<=' ( (lv_right_3_0= ruleExpression4 ) ) ) | ( () otherlv_5= '<' ( (lv_right_6_0= ruleExpression4 ) ) ) | ( () otherlv_8= '>=' ( (lv_right_9_0= ruleExpression4 ) ) ) | ( () otherlv_11= '>' ( (lv_right_12_0= ruleExpression4 ) ) ) )*
            loop6:
            do {
                int alt6=5;
                switch ( input.LA(1) ) {
                case 20:
                    {
                    alt6=1;
                    }
                    break;
                case 21:
                    {
                    alt6=2;
                    }
                    break;
                case 22:
                    {
                    alt6=3;
                    }
                    break;
                case 23:
                    {
                    alt6=4;
                    }
                    break;

                }

                switch (alt6) {
            	case 1 :
            	    // InternalHale.g:611:4: ( () otherlv_2= '<=' ( (lv_right_3_0= ruleExpression4 ) ) )
            	    {
            	    // InternalHale.g:611:4: ( () otherlv_2= '<=' ( (lv_right_3_0= ruleExpression4 ) ) )
            	    // InternalHale.g:612:5: () otherlv_2= '<=' ( (lv_right_3_0= ruleExpression4 ) )
            	    {
            	    // InternalHale.g:612:5: ()
            	    // InternalHale.g:613:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpression5Access().getLessThanOrEqualLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,20,FOLLOW_14); 

            	    					newLeafNode(otherlv_2, grammarAccess.getExpression5Access().getLessThanSignEqualsSignKeyword_1_0_1());
            	    				
            	    // InternalHale.g:623:5: ( (lv_right_3_0= ruleExpression4 ) )
            	    // InternalHale.g:624:6: (lv_right_3_0= ruleExpression4 )
            	    {
            	    // InternalHale.g:624:6: (lv_right_3_0= ruleExpression4 )
            	    // InternalHale.g:625:7: lv_right_3_0= ruleExpression4
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
            	    // InternalHale.g:644:4: ( () otherlv_5= '<' ( (lv_right_6_0= ruleExpression4 ) ) )
            	    {
            	    // InternalHale.g:644:4: ( () otherlv_5= '<' ( (lv_right_6_0= ruleExpression4 ) ) )
            	    // InternalHale.g:645:5: () otherlv_5= '<' ( (lv_right_6_0= ruleExpression4 ) )
            	    {
            	    // InternalHale.g:645:5: ()
            	    // InternalHale.g:646:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpression5Access().getLessThanLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,21,FOLLOW_14); 

            	    					newLeafNode(otherlv_5, grammarAccess.getExpression5Access().getLessThanSignKeyword_1_1_1());
            	    				
            	    // InternalHale.g:656:5: ( (lv_right_6_0= ruleExpression4 ) )
            	    // InternalHale.g:657:6: (lv_right_6_0= ruleExpression4 )
            	    {
            	    // InternalHale.g:657:6: (lv_right_6_0= ruleExpression4 )
            	    // InternalHale.g:658:7: lv_right_6_0= ruleExpression4
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
            	    // InternalHale.g:677:4: ( () otherlv_8= '>=' ( (lv_right_9_0= ruleExpression4 ) ) )
            	    {
            	    // InternalHale.g:677:4: ( () otherlv_8= '>=' ( (lv_right_9_0= ruleExpression4 ) ) )
            	    // InternalHale.g:678:5: () otherlv_8= '>=' ( (lv_right_9_0= ruleExpression4 ) )
            	    {
            	    // InternalHale.g:678:5: ()
            	    // InternalHale.g:679:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpression5Access().getGreaterThanOrEqualLeftAction_1_2_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_8=(Token)match(input,22,FOLLOW_14); 

            	    					newLeafNode(otherlv_8, grammarAccess.getExpression5Access().getGreaterThanSignEqualsSignKeyword_1_2_1());
            	    				
            	    // InternalHale.g:689:5: ( (lv_right_9_0= ruleExpression4 ) )
            	    // InternalHale.g:690:6: (lv_right_9_0= ruleExpression4 )
            	    {
            	    // InternalHale.g:690:6: (lv_right_9_0= ruleExpression4 )
            	    // InternalHale.g:691:7: lv_right_9_0= ruleExpression4
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
            	case 4 :
            	    // InternalHale.g:710:4: ( () otherlv_11= '>' ( (lv_right_12_0= ruleExpression4 ) ) )
            	    {
            	    // InternalHale.g:710:4: ( () otherlv_11= '>' ( (lv_right_12_0= ruleExpression4 ) ) )
            	    // InternalHale.g:711:5: () otherlv_11= '>' ( (lv_right_12_0= ruleExpression4 ) )
            	    {
            	    // InternalHale.g:711:5: ()
            	    // InternalHale.g:712:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpression5Access().getGreaterThanLeftAction_1_3_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_11=(Token)match(input,23,FOLLOW_14); 

            	    					newLeafNode(otherlv_11, grammarAccess.getExpression5Access().getGreaterThanSignKeyword_1_3_1());
            	    				
            	    // InternalHale.g:722:5: ( (lv_right_12_0= ruleExpression4 ) )
            	    // InternalHale.g:723:6: (lv_right_12_0= ruleExpression4 )
            	    {
            	    // InternalHale.g:723:6: (lv_right_12_0= ruleExpression4 )
            	    // InternalHale.g:724:7: lv_right_12_0= ruleExpression4
            	    {

            	    							newCompositeNode(grammarAccess.getExpression5Access().getRightExpression4ParserRuleCall_1_3_2_0());
            	    						
            	    pushFollow(FOLLOW_13);
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
    // InternalHale.g:747:1: entryRuleExpression4 returns [EObject current=null] : iv_ruleExpression4= ruleExpression4 EOF ;
    public final EObject entryRuleExpression4() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression4 = null;


        try {
            // InternalHale.g:747:52: (iv_ruleExpression4= ruleExpression4 EOF )
            // InternalHale.g:748:2: iv_ruleExpression4= ruleExpression4 EOF
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
    // InternalHale.g:754:1: ruleExpression4 returns [EObject current=null] : (this_Expression3_0= ruleExpression3 ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpression3 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpression3 ) ) ) )* ) ;
    public final EObject ruleExpression4() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_Expression3_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalHale.g:760:2: ( (this_Expression3_0= ruleExpression3 ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpression3 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpression3 ) ) ) )* ) )
            // InternalHale.g:761:2: (this_Expression3_0= ruleExpression3 ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpression3 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpression3 ) ) ) )* )
            {
            // InternalHale.g:761:2: (this_Expression3_0= ruleExpression3 ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpression3 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpression3 ) ) ) )* )
            // InternalHale.g:762:3: this_Expression3_0= ruleExpression3 ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpression3 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpression3 ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpression4Access().getExpression3ParserRuleCall_0());
            		
            pushFollow(FOLLOW_15);
            this_Expression3_0=ruleExpression3();

            state._fsp--;


            			current = this_Expression3_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHale.g:770:3: ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpression3 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpression3 ) ) ) )*
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==24) ) {
                    alt7=1;
                }
                else if ( (LA7_0==25) ) {
                    alt7=2;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalHale.g:771:4: ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpression3 ) ) )
            	    {
            	    // InternalHale.g:771:4: ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpression3 ) ) )
            	    // InternalHale.g:772:5: () otherlv_2= '+' ( (lv_right_3_0= ruleExpression3 ) )
            	    {
            	    // InternalHale.g:772:5: ()
            	    // InternalHale.g:773:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpression4Access().getAdditionLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,24,FOLLOW_16); 

            	    					newLeafNode(otherlv_2, grammarAccess.getExpression4Access().getPlusSignKeyword_1_0_1());
            	    				
            	    // InternalHale.g:783:5: ( (lv_right_3_0= ruleExpression3 ) )
            	    // InternalHale.g:784:6: (lv_right_3_0= ruleExpression3 )
            	    {
            	    // InternalHale.g:784:6: (lv_right_3_0= ruleExpression3 )
            	    // InternalHale.g:785:7: lv_right_3_0= ruleExpression3
            	    {

            	    							newCompositeNode(grammarAccess.getExpression4Access().getRightExpression3ParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_15);
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
            	    // InternalHale.g:804:4: ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpression3 ) ) )
            	    {
            	    // InternalHale.g:804:4: ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpression3 ) ) )
            	    // InternalHale.g:805:5: () otherlv_5= '-' ( (lv_right_6_0= ruleExpression3 ) )
            	    {
            	    // InternalHale.g:805:5: ()
            	    // InternalHale.g:806:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpression4Access().getSubtractionLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,25,FOLLOW_16); 

            	    					newLeafNode(otherlv_5, grammarAccess.getExpression4Access().getHyphenMinusKeyword_1_1_1());
            	    				
            	    // InternalHale.g:816:5: ( (lv_right_6_0= ruleExpression3 ) )
            	    // InternalHale.g:817:6: (lv_right_6_0= ruleExpression3 )
            	    {
            	    // InternalHale.g:817:6: (lv_right_6_0= ruleExpression3 )
            	    // InternalHale.g:818:7: lv_right_6_0= ruleExpression3
            	    {

            	    							newCompositeNode(grammarAccess.getExpression4Access().getRightExpression3ParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_15);
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
    // InternalHale.g:841:1: entryRuleExpression3 returns [EObject current=null] : iv_ruleExpression3= ruleExpression3 EOF ;
    public final EObject entryRuleExpression3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression3 = null;


        try {
            // InternalHale.g:841:52: (iv_ruleExpression3= ruleExpression3 EOF )
            // InternalHale.g:842:2: iv_ruleExpression3= ruleExpression3 EOF
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
    // InternalHale.g:848:1: ruleExpression3 returns [EObject current=null] : (this_Expression2_0= ruleExpression2 ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpression2 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpression2 ) ) ) | ( () otherlv_8= '%' ( (lv_right_9_0= ruleExpression2 ) ) ) )* ) ;
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
            // InternalHale.g:854:2: ( (this_Expression2_0= ruleExpression2 ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpression2 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpression2 ) ) ) | ( () otherlv_8= '%' ( (lv_right_9_0= ruleExpression2 ) ) ) )* ) )
            // InternalHale.g:855:2: (this_Expression2_0= ruleExpression2 ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpression2 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpression2 ) ) ) | ( () otherlv_8= '%' ( (lv_right_9_0= ruleExpression2 ) ) ) )* )
            {
            // InternalHale.g:855:2: (this_Expression2_0= ruleExpression2 ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpression2 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpression2 ) ) ) | ( () otherlv_8= '%' ( (lv_right_9_0= ruleExpression2 ) ) ) )* )
            // InternalHale.g:856:3: this_Expression2_0= ruleExpression2 ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpression2 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpression2 ) ) ) | ( () otherlv_8= '%' ( (lv_right_9_0= ruleExpression2 ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpression3Access().getExpression2ParserRuleCall_0());
            		
            pushFollow(FOLLOW_17);
            this_Expression2_0=ruleExpression2();

            state._fsp--;


            			current = this_Expression2_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHale.g:864:3: ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpression2 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpression2 ) ) ) | ( () otherlv_8= '%' ( (lv_right_9_0= ruleExpression2 ) ) ) )*
            loop8:
            do {
                int alt8=4;
                switch ( input.LA(1) ) {
                case 26:
                    {
                    alt8=1;
                    }
                    break;
                case 27:
                    {
                    alt8=2;
                    }
                    break;
                case 28:
                    {
                    alt8=3;
                    }
                    break;

                }

                switch (alt8) {
            	case 1 :
            	    // InternalHale.g:865:4: ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpression2 ) ) )
            	    {
            	    // InternalHale.g:865:4: ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpression2 ) ) )
            	    // InternalHale.g:866:5: () otherlv_2= '*' ( (lv_right_3_0= ruleExpression2 ) )
            	    {
            	    // InternalHale.g:866:5: ()
            	    // InternalHale.g:867:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpression3Access().getMultiplicationLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,26,FOLLOW_18); 

            	    					newLeafNode(otherlv_2, grammarAccess.getExpression3Access().getAsteriskKeyword_1_0_1());
            	    				
            	    // InternalHale.g:877:5: ( (lv_right_3_0= ruleExpression2 ) )
            	    // InternalHale.g:878:6: (lv_right_3_0= ruleExpression2 )
            	    {
            	    // InternalHale.g:878:6: (lv_right_3_0= ruleExpression2 )
            	    // InternalHale.g:879:7: lv_right_3_0= ruleExpression2
            	    {

            	    							newCompositeNode(grammarAccess.getExpression3Access().getRightExpression2ParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_17);
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
            	    // InternalHale.g:898:4: ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpression2 ) ) )
            	    {
            	    // InternalHale.g:898:4: ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpression2 ) ) )
            	    // InternalHale.g:899:5: () otherlv_5= '/' ( (lv_right_6_0= ruleExpression2 ) )
            	    {
            	    // InternalHale.g:899:5: ()
            	    // InternalHale.g:900:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpression3Access().getDivisionLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,27,FOLLOW_18); 

            	    					newLeafNode(otherlv_5, grammarAccess.getExpression3Access().getSolidusKeyword_1_1_1());
            	    				
            	    // InternalHale.g:910:5: ( (lv_right_6_0= ruleExpression2 ) )
            	    // InternalHale.g:911:6: (lv_right_6_0= ruleExpression2 )
            	    {
            	    // InternalHale.g:911:6: (lv_right_6_0= ruleExpression2 )
            	    // InternalHale.g:912:7: lv_right_6_0= ruleExpression2
            	    {

            	    							newCompositeNode(grammarAccess.getExpression3Access().getRightExpression2ParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_17);
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
            	    // InternalHale.g:931:4: ( () otherlv_8= '%' ( (lv_right_9_0= ruleExpression2 ) ) )
            	    {
            	    // InternalHale.g:931:4: ( () otherlv_8= '%' ( (lv_right_9_0= ruleExpression2 ) ) )
            	    // InternalHale.g:932:5: () otherlv_8= '%' ( (lv_right_9_0= ruleExpression2 ) )
            	    {
            	    // InternalHale.g:932:5: ()
            	    // InternalHale.g:933:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpression3Access().getRemainderLeftAction_1_2_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_8=(Token)match(input,28,FOLLOW_18); 

            	    					newLeafNode(otherlv_8, grammarAccess.getExpression3Access().getPercentSignKeyword_1_2_1());
            	    				
            	    // InternalHale.g:943:5: ( (lv_right_9_0= ruleExpression2 ) )
            	    // InternalHale.g:944:6: (lv_right_9_0= ruleExpression2 )
            	    {
            	    // InternalHale.g:944:6: (lv_right_9_0= ruleExpression2 )
            	    // InternalHale.g:945:7: lv_right_9_0= ruleExpression2
            	    {

            	    							newCompositeNode(grammarAccess.getExpression3Access().getRightExpression2ParserRuleCall_1_2_2_0());
            	    						
            	    pushFollow(FOLLOW_17);
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
    // InternalHale.g:968:1: entryRuleExpression2 returns [EObject current=null] : iv_ruleExpression2= ruleExpression2 EOF ;
    public final EObject entryRuleExpression2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression2 = null;


        try {
            // InternalHale.g:968:52: (iv_ruleExpression2= ruleExpression2 EOF )
            // InternalHale.g:969:2: iv_ruleExpression2= ruleExpression2 EOF
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
    // InternalHale.g:975:1: ruleExpression2 returns [EObject current=null] : (this_Expression1_0= ruleExpression1 ( () otherlv_2= '**' ( (lv_right_3_0= ruleExpression1 ) ) )* ) ;
    public final EObject ruleExpression2() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Expression1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalHale.g:981:2: ( (this_Expression1_0= ruleExpression1 ( () otherlv_2= '**' ( (lv_right_3_0= ruleExpression1 ) ) )* ) )
            // InternalHale.g:982:2: (this_Expression1_0= ruleExpression1 ( () otherlv_2= '**' ( (lv_right_3_0= ruleExpression1 ) ) )* )
            {
            // InternalHale.g:982:2: (this_Expression1_0= ruleExpression1 ( () otherlv_2= '**' ( (lv_right_3_0= ruleExpression1 ) ) )* )
            // InternalHale.g:983:3: this_Expression1_0= ruleExpression1 ( () otherlv_2= '**' ( (lv_right_3_0= ruleExpression1 ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpression2Access().getExpression1ParserRuleCall_0());
            		
            pushFollow(FOLLOW_19);
            this_Expression1_0=ruleExpression1();

            state._fsp--;


            			current = this_Expression1_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHale.g:991:3: ( () otherlv_2= '**' ( (lv_right_3_0= ruleExpression1 ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==29) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalHale.g:992:4: () otherlv_2= '**' ( (lv_right_3_0= ruleExpression1 ) )
            	    {
            	    // InternalHale.g:992:4: ()
            	    // InternalHale.g:993:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getExpression2Access().getExponentiationLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,29,FOLLOW_20); 

            	    				newLeafNode(otherlv_2, grammarAccess.getExpression2Access().getAsteriskAsteriskKeyword_1_1());
            	    			
            	    // InternalHale.g:1003:4: ( (lv_right_3_0= ruleExpression1 ) )
            	    // InternalHale.g:1004:5: (lv_right_3_0= ruleExpression1 )
            	    {
            	    // InternalHale.g:1004:5: (lv_right_3_0= ruleExpression1 )
            	    // InternalHale.g:1005:6: lv_right_3_0= ruleExpression1
            	    {

            	    						newCompositeNode(grammarAccess.getExpression2Access().getRightExpression1ParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_19);
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
    // InternalHale.g:1027:1: entryRuleExpression1 returns [EObject current=null] : iv_ruleExpression1= ruleExpression1 EOF ;
    public final EObject entryRuleExpression1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression1 = null;


        try {
            // InternalHale.g:1027:52: (iv_ruleExpression1= ruleExpression1 EOF )
            // InternalHale.g:1028:2: iv_ruleExpression1= ruleExpression1 EOF
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
    // InternalHale.g:1034:1: ruleExpression1 returns [EObject current=null] : ( ( () otherlv_1= '-' ( (lv_inner_2_0= ruleExpression1 ) ) ) | ( () otherlv_4= 'not' ( (lv_inner_5_0= ruleExpression1 ) ) ) | this_Primary_6= rulePrimary ) ;
    public final EObject ruleExpression1() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_inner_2_0 = null;

        EObject lv_inner_5_0 = null;

        EObject this_Primary_6 = null;



        	enterRule();

        try {
            // InternalHale.g:1040:2: ( ( ( () otherlv_1= '-' ( (lv_inner_2_0= ruleExpression1 ) ) ) | ( () otherlv_4= 'not' ( (lv_inner_5_0= ruleExpression1 ) ) ) | this_Primary_6= rulePrimary ) )
            // InternalHale.g:1041:2: ( ( () otherlv_1= '-' ( (lv_inner_2_0= ruleExpression1 ) ) ) | ( () otherlv_4= 'not' ( (lv_inner_5_0= ruleExpression1 ) ) ) | this_Primary_6= rulePrimary )
            {
            // InternalHale.g:1041:2: ( ( () otherlv_1= '-' ( (lv_inner_2_0= ruleExpression1 ) ) ) | ( () otherlv_4= 'not' ( (lv_inner_5_0= ruleExpression1 ) ) ) | this_Primary_6= rulePrimary )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt10=1;
                }
                break;
            case 30:
                {
                alt10=2;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case RULE_STRING:
            case 31:
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
                    // InternalHale.g:1042:3: ( () otherlv_1= '-' ( (lv_inner_2_0= ruleExpression1 ) ) )
                    {
                    // InternalHale.g:1042:3: ( () otherlv_1= '-' ( (lv_inner_2_0= ruleExpression1 ) ) )
                    // InternalHale.g:1043:4: () otherlv_1= '-' ( (lv_inner_2_0= ruleExpression1 ) )
                    {
                    // InternalHale.g:1043:4: ()
                    // InternalHale.g:1044:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExpression1Access().getUnaryNegationAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,25,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getExpression1Access().getHyphenMinusKeyword_0_1());
                    			
                    // InternalHale.g:1054:4: ( (lv_inner_2_0= ruleExpression1 ) )
                    // InternalHale.g:1055:5: (lv_inner_2_0= ruleExpression1 )
                    {
                    // InternalHale.g:1055:5: (lv_inner_2_0= ruleExpression1 )
                    // InternalHale.g:1056:6: lv_inner_2_0= ruleExpression1
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
                    // InternalHale.g:1075:3: ( () otherlv_4= 'not' ( (lv_inner_5_0= ruleExpression1 ) ) )
                    {
                    // InternalHale.g:1075:3: ( () otherlv_4= 'not' ( (lv_inner_5_0= ruleExpression1 ) ) )
                    // InternalHale.g:1076:4: () otherlv_4= 'not' ( (lv_inner_5_0= ruleExpression1 ) )
                    {
                    // InternalHale.g:1076:4: ()
                    // InternalHale.g:1077:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExpression1Access().getLogicalNotAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,30,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getExpression1Access().getNotKeyword_1_1());
                    			
                    // InternalHale.g:1087:4: ( (lv_inner_5_0= ruleExpression1 ) )
                    // InternalHale.g:1088:5: (lv_inner_5_0= ruleExpression1 )
                    {
                    // InternalHale.g:1088:5: (lv_inner_5_0= ruleExpression1 )
                    // InternalHale.g:1089:6: lv_inner_5_0= ruleExpression1
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
                    // InternalHale.g:1108:3: this_Primary_6= rulePrimary
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
    // InternalHale.g:1120:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalHale.g:1120:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalHale.g:1121:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalHale.g:1127:1: rulePrimary returns [EObject current=null] : (this_Literal_0= ruleLiteral | this_BindingReference_1= ruleBindingReference | (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Literal_0 = null;

        EObject this_BindingReference_1 = null;

        EObject this_Expression_3 = null;



        	enterRule();

        try {
            // InternalHale.g:1133:2: ( (this_Literal_0= ruleLiteral | this_BindingReference_1= ruleBindingReference | (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' ) ) )
            // InternalHale.g:1134:2: (this_Literal_0= ruleLiteral | this_BindingReference_1= ruleBindingReference | (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' ) )
            {
            // InternalHale.g:1134:2: (this_Literal_0= ruleLiteral | this_BindingReference_1= ruleBindingReference | (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
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
            case 31:
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
                    // InternalHale.g:1135:3: this_Literal_0= ruleLiteral
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
                    // InternalHale.g:1144:3: this_BindingReference_1= ruleBindingReference
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
                    // InternalHale.g:1153:3: (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' )
                    {
                    // InternalHale.g:1153:3: (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' )
                    // InternalHale.g:1154:4: otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_21); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_2_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_22);
                    this_Expression_3=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_3;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_4=(Token)match(input,32,FOLLOW_2); 

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
    // InternalHale.g:1175:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalHale.g:1175:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalHale.g:1176:2: iv_ruleLiteral= ruleLiteral EOF
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
    // InternalHale.g:1182:1: ruleLiteral returns [EObject current=null] : (this_NumberLiteral_0= ruleNumberLiteral | this_StringLiteral_1= ruleStringLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_NumberLiteral_0 = null;

        EObject this_StringLiteral_1 = null;



        	enterRule();

        try {
            // InternalHale.g:1188:2: ( (this_NumberLiteral_0= ruleNumberLiteral | this_StringLiteral_1= ruleStringLiteral ) )
            // InternalHale.g:1189:2: (this_NumberLiteral_0= ruleNumberLiteral | this_StringLiteral_1= ruleStringLiteral )
            {
            // InternalHale.g:1189:2: (this_NumberLiteral_0= ruleNumberLiteral | this_StringLiteral_1= ruleStringLiteral )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INT) ) {
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
                    // InternalHale.g:1190:3: this_NumberLiteral_0= ruleNumberLiteral
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
                    // InternalHale.g:1199:3: this_StringLiteral_1= ruleStringLiteral
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
    // InternalHale.g:1211:1: entryRuleNumberLiteral returns [EObject current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final EObject entryRuleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteral = null;


        try {
            // InternalHale.g:1211:54: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // InternalHale.g:1212:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
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
    // InternalHale.g:1218:1: ruleNumberLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleNumberLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalHale.g:1224:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalHale.g:1225:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalHale.g:1225:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalHale.g:1226:3: (lv_value_0_0= RULE_INT )
            {
            // InternalHale.g:1226:3: (lv_value_0_0= RULE_INT )
            // InternalHale.g:1227:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getNumberLiteralAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getNumberLiteralRule());
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
    // $ANTLR end "ruleNumberLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalHale.g:1246:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalHale.g:1246:54: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalHale.g:1247:2: iv_ruleStringLiteral= ruleStringLiteral EOF
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
    // InternalHale.g:1253:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalHale.g:1259:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalHale.g:1260:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalHale.g:1260:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalHale.g:1261:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalHale.g:1261:3: (lv_value_0_0= RULE_STRING )
            // InternalHale.g:1262:4: lv_value_0_0= RULE_STRING
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000C2003072L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000C2003070L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000C2033070L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000C20C3070L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000F00002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000C2F03070L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000C3003070L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000001C000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000DE003070L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000000E2003070L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000001C2003070L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000000L});

}