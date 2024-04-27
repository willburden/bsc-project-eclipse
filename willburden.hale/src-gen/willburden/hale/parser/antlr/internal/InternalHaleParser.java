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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'and'", "'or'", "'=='", "'!='", "'<='", "'<'", "'>='", "'>'", "'+'", "'-'", "'*'", "'/'", "'%'", "'**'", "'not'", "'('", "')'", "'let'", "'mut'", "'='", "'print'", "'if'", "'elseif'", "'else'", "'{'", "'}'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
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
    public static final int T__32=32;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
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
    // InternalHale.g:116:1: ruleBlock returns [EObject current=null] : ( () ( (lv_statements_1_0= ruleStatement ) )* ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_1_0 = null;



        	enterRule();

        try {
            // InternalHale.g:122:2: ( ( () ( (lv_statements_1_0= ruleStatement ) )* ) )
            // InternalHale.g:123:2: ( () ( (lv_statements_1_0= ruleStatement ) )* )
            {
            // InternalHale.g:123:2: ( () ( (lv_statements_1_0= ruleStatement ) )* )
            // InternalHale.g:124:3: () ( (lv_statements_1_0= ruleStatement ) )*
            {
            // InternalHale.g:124:3: ()
            // InternalHale.g:125:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBlockAccess().getBlockAction_0(),
            					current);
            			

            }

            // InternalHale.g:131:3: ( (lv_statements_1_0= ruleStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_INT && LA1_0<=RULE_ID)||LA1_0==11||LA1_0==21||(LA1_0>=26 && LA1_0<=27)||LA1_0==29||(LA1_0>=32 && LA1_0<=33)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalHale.g:132:4: (lv_statements_1_0= ruleStatement )
            	    {
            	    // InternalHale.g:132:4: (lv_statements_1_0= ruleStatement )
            	    // InternalHale.g:133:5: lv_statements_1_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getBlockAccess().getStatementsStatementParserRuleCall_1_0());
            	    				
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
    // InternalHale.g:154:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalHale.g:154:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalHale.g:155:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalHale.g:161:1: ruleStatement returns [EObject current=null] : ( ( () otherlv_1= ';' ) | ( (this_Expression_2= ruleExpression | this_Binding_3= ruleBinding | this_Assignment_4= ruleAssignment | this_Print_5= rulePrint ) otherlv_6= ';' ) | this_If_7= ruleIf ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_6=null;
        EObject this_Expression_2 = null;

        EObject this_Binding_3 = null;

        EObject this_Assignment_4 = null;

        EObject this_Print_5 = null;

        EObject this_If_7 = null;



        	enterRule();

        try {
            // InternalHale.g:167:2: ( ( ( () otherlv_1= ';' ) | ( (this_Expression_2= ruleExpression | this_Binding_3= ruleBinding | this_Assignment_4= ruleAssignment | this_Print_5= rulePrint ) otherlv_6= ';' ) | this_If_7= ruleIf ) )
            // InternalHale.g:168:2: ( ( () otherlv_1= ';' ) | ( (this_Expression_2= ruleExpression | this_Binding_3= ruleBinding | this_Assignment_4= ruleAssignment | this_Print_5= rulePrint ) otherlv_6= ';' ) | this_If_7= ruleIf )
            {
            // InternalHale.g:168:2: ( ( () otherlv_1= ';' ) | ( (this_Expression_2= ruleExpression | this_Binding_3= ruleBinding | this_Assignment_4= ruleAssignment | this_Print_5= rulePrint ) otherlv_6= ';' ) | this_If_7= ruleIf )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case RULE_INT:
            case RULE_STRING:
            case RULE_ID:
            case 21:
            case 26:
            case 27:
            case 29:
            case 32:
                {
                alt3=2;
                }
                break;
            case 33:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalHale.g:169:3: ( () otherlv_1= ';' )
                    {
                    // InternalHale.g:169:3: ( () otherlv_1= ';' )
                    // InternalHale.g:170:4: () otherlv_1= ';'
                    {
                    // InternalHale.g:170:4: ()
                    // InternalHale.g:171:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getStatementAccess().getEmptyStatementAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,11,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getStatementAccess().getSemicolonKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalHale.g:183:3: ( (this_Expression_2= ruleExpression | this_Binding_3= ruleBinding | this_Assignment_4= ruleAssignment | this_Print_5= rulePrint ) otherlv_6= ';' )
                    {
                    // InternalHale.g:183:3: ( (this_Expression_2= ruleExpression | this_Binding_3= ruleBinding | this_Assignment_4= ruleAssignment | this_Print_5= rulePrint ) otherlv_6= ';' )
                    // InternalHale.g:184:4: (this_Expression_2= ruleExpression | this_Binding_3= ruleBinding | this_Assignment_4= ruleAssignment | this_Print_5= rulePrint ) otherlv_6= ';'
                    {
                    // InternalHale.g:184:4: (this_Expression_2= ruleExpression | this_Binding_3= ruleBinding | this_Assignment_4= ruleAssignment | this_Print_5= rulePrint )
                    int alt2=4;
                    switch ( input.LA(1) ) {
                    case RULE_INT:
                    case RULE_STRING:
                    case 21:
                    case 26:
                    case 27:
                        {
                        alt2=1;
                        }
                        break;
                    case RULE_ID:
                        {
                        int LA2_2 = input.LA(2);

                        if ( (LA2_2==31) ) {
                            alt2=3;
                        }
                        else if ( ((LA2_2>=11 && LA2_2<=25)) ) {
                            alt2=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 2, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 29:
                        {
                        alt2=2;
                        }
                        break;
                    case 32:
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
                            // InternalHale.g:185:5: this_Expression_2= ruleExpression
                            {

                            					newCompositeNode(grammarAccess.getStatementAccess().getExpressionParserRuleCall_1_0_0());
                            				
                            pushFollow(FOLLOW_4);
                            this_Expression_2=ruleExpression();

                            state._fsp--;


                            					current = this_Expression_2;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;
                        case 2 :
                            // InternalHale.g:194:5: this_Binding_3= ruleBinding
                            {

                            					newCompositeNode(grammarAccess.getStatementAccess().getBindingParserRuleCall_1_0_1());
                            				
                            pushFollow(FOLLOW_4);
                            this_Binding_3=ruleBinding();

                            state._fsp--;


                            					current = this_Binding_3;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;
                        case 3 :
                            // InternalHale.g:203:5: this_Assignment_4= ruleAssignment
                            {

                            					newCompositeNode(grammarAccess.getStatementAccess().getAssignmentParserRuleCall_1_0_2());
                            				
                            pushFollow(FOLLOW_4);
                            this_Assignment_4=ruleAssignment();

                            state._fsp--;


                            					current = this_Assignment_4;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;
                        case 4 :
                            // InternalHale.g:212:5: this_Print_5= rulePrint
                            {

                            					newCompositeNode(grammarAccess.getStatementAccess().getPrintParserRuleCall_1_0_3());
                            				
                            pushFollow(FOLLOW_4);
                            this_Print_5=rulePrint();

                            state._fsp--;


                            					current = this_Print_5;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,11,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getStatementAccess().getSemicolonKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalHale.g:227:3: this_If_7= ruleIf
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getIfParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_If_7=ruleIf();

                    state._fsp--;


                    			current = this_If_7;
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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleExpression"
    // InternalHale.g:239:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalHale.g:239:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalHale.g:240:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalHale.g:246:1: ruleExpression returns [EObject current=null] : this_Expression7_0= ruleExpression7 ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Expression7_0 = null;



        	enterRule();

        try {
            // InternalHale.g:252:2: (this_Expression7_0= ruleExpression7 )
            // InternalHale.g:253:2: this_Expression7_0= ruleExpression7
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
    // InternalHale.g:264:1: entryRuleExpression7 returns [EObject current=null] : iv_ruleExpression7= ruleExpression7 EOF ;
    public final EObject entryRuleExpression7() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression7 = null;


        try {
            // InternalHale.g:264:52: (iv_ruleExpression7= ruleExpression7 EOF )
            // InternalHale.g:265:2: iv_ruleExpression7= ruleExpression7 EOF
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
    // InternalHale.g:271:1: ruleExpression7 returns [EObject current=null] : (this_Expression6_0= ruleExpression6 ( ( () otherlv_2= 'and' ( (lv_right_3_0= ruleExpression6 ) ) ) | ( () otherlv_5= 'or' ( (lv_right_6_0= ruleExpression6 ) ) ) )* ) ;
    public final EObject ruleExpression7() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_Expression6_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalHale.g:277:2: ( (this_Expression6_0= ruleExpression6 ( ( () otherlv_2= 'and' ( (lv_right_3_0= ruleExpression6 ) ) ) | ( () otherlv_5= 'or' ( (lv_right_6_0= ruleExpression6 ) ) ) )* ) )
            // InternalHale.g:278:2: (this_Expression6_0= ruleExpression6 ( ( () otherlv_2= 'and' ( (lv_right_3_0= ruleExpression6 ) ) ) | ( () otherlv_5= 'or' ( (lv_right_6_0= ruleExpression6 ) ) ) )* )
            {
            // InternalHale.g:278:2: (this_Expression6_0= ruleExpression6 ( ( () otherlv_2= 'and' ( (lv_right_3_0= ruleExpression6 ) ) ) | ( () otherlv_5= 'or' ( (lv_right_6_0= ruleExpression6 ) ) ) )* )
            // InternalHale.g:279:3: this_Expression6_0= ruleExpression6 ( ( () otherlv_2= 'and' ( (lv_right_3_0= ruleExpression6 ) ) ) | ( () otherlv_5= 'or' ( (lv_right_6_0= ruleExpression6 ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpression7Access().getExpression6ParserRuleCall_0());
            		
            pushFollow(FOLLOW_5);
            this_Expression6_0=ruleExpression6();

            state._fsp--;


            			current = this_Expression6_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHale.g:287:3: ( ( () otherlv_2= 'and' ( (lv_right_3_0= ruleExpression6 ) ) ) | ( () otherlv_5= 'or' ( (lv_right_6_0= ruleExpression6 ) ) ) )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==12) ) {
                    alt4=1;
                }
                else if ( (LA4_0==13) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalHale.g:288:4: ( () otherlv_2= 'and' ( (lv_right_3_0= ruleExpression6 ) ) )
            	    {
            	    // InternalHale.g:288:4: ( () otherlv_2= 'and' ( (lv_right_3_0= ruleExpression6 ) ) )
            	    // InternalHale.g:289:5: () otherlv_2= 'and' ( (lv_right_3_0= ruleExpression6 ) )
            	    {
            	    // InternalHale.g:289:5: ()
            	    // InternalHale.g:290:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpression7Access().getLogicalAndLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,12,FOLLOW_6); 

            	    					newLeafNode(otherlv_2, grammarAccess.getExpression7Access().getAndKeyword_1_0_1());
            	    				
            	    // InternalHale.g:300:5: ( (lv_right_3_0= ruleExpression6 ) )
            	    // InternalHale.g:301:6: (lv_right_3_0= ruleExpression6 )
            	    {
            	    // InternalHale.g:301:6: (lv_right_3_0= ruleExpression6 )
            	    // InternalHale.g:302:7: lv_right_3_0= ruleExpression6
            	    {

            	    							newCompositeNode(grammarAccess.getExpression7Access().getRightExpression6ParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_5);
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
            	    // InternalHale.g:321:4: ( () otherlv_5= 'or' ( (lv_right_6_0= ruleExpression6 ) ) )
            	    {
            	    // InternalHale.g:321:4: ( () otherlv_5= 'or' ( (lv_right_6_0= ruleExpression6 ) ) )
            	    // InternalHale.g:322:5: () otherlv_5= 'or' ( (lv_right_6_0= ruleExpression6 ) )
            	    {
            	    // InternalHale.g:322:5: ()
            	    // InternalHale.g:323:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpression7Access().getLogicalOrLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,13,FOLLOW_6); 

            	    					newLeafNode(otherlv_5, grammarAccess.getExpression7Access().getOrKeyword_1_1_1());
            	    				
            	    // InternalHale.g:333:5: ( (lv_right_6_0= ruleExpression6 ) )
            	    // InternalHale.g:334:6: (lv_right_6_0= ruleExpression6 )
            	    {
            	    // InternalHale.g:334:6: (lv_right_6_0= ruleExpression6 )
            	    // InternalHale.g:335:7: lv_right_6_0= ruleExpression6
            	    {

            	    							newCompositeNode(grammarAccess.getExpression7Access().getRightExpression6ParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_5);
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
    // InternalHale.g:358:1: entryRuleExpression6 returns [EObject current=null] : iv_ruleExpression6= ruleExpression6 EOF ;
    public final EObject entryRuleExpression6() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression6 = null;


        try {
            // InternalHale.g:358:52: (iv_ruleExpression6= ruleExpression6 EOF )
            // InternalHale.g:359:2: iv_ruleExpression6= ruleExpression6 EOF
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
    // InternalHale.g:365:1: ruleExpression6 returns [EObject current=null] : (this_Expression5_0= ruleExpression5 ( ( () otherlv_2= '==' ( (lv_right_3_0= ruleExpression5 ) ) ) | ( () otherlv_5= '!=' ( (lv_right_6_0= ruleExpression5 ) ) ) )* ) ;
    public final EObject ruleExpression6() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_Expression5_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalHale.g:371:2: ( (this_Expression5_0= ruleExpression5 ( ( () otherlv_2= '==' ( (lv_right_3_0= ruleExpression5 ) ) ) | ( () otherlv_5= '!=' ( (lv_right_6_0= ruleExpression5 ) ) ) )* ) )
            // InternalHale.g:372:2: (this_Expression5_0= ruleExpression5 ( ( () otherlv_2= '==' ( (lv_right_3_0= ruleExpression5 ) ) ) | ( () otherlv_5= '!=' ( (lv_right_6_0= ruleExpression5 ) ) ) )* )
            {
            // InternalHale.g:372:2: (this_Expression5_0= ruleExpression5 ( ( () otherlv_2= '==' ( (lv_right_3_0= ruleExpression5 ) ) ) | ( () otherlv_5= '!=' ( (lv_right_6_0= ruleExpression5 ) ) ) )* )
            // InternalHale.g:373:3: this_Expression5_0= ruleExpression5 ( ( () otherlv_2= '==' ( (lv_right_3_0= ruleExpression5 ) ) ) | ( () otherlv_5= '!=' ( (lv_right_6_0= ruleExpression5 ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpression6Access().getExpression5ParserRuleCall_0());
            		
            pushFollow(FOLLOW_7);
            this_Expression5_0=ruleExpression5();

            state._fsp--;


            			current = this_Expression5_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHale.g:381:3: ( ( () otherlv_2= '==' ( (lv_right_3_0= ruleExpression5 ) ) ) | ( () otherlv_5= '!=' ( (lv_right_6_0= ruleExpression5 ) ) ) )*
            loop5:
            do {
                int alt5=3;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14) ) {
                    alt5=1;
                }
                else if ( (LA5_0==15) ) {
                    alt5=2;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalHale.g:382:4: ( () otherlv_2= '==' ( (lv_right_3_0= ruleExpression5 ) ) )
            	    {
            	    // InternalHale.g:382:4: ( () otherlv_2= '==' ( (lv_right_3_0= ruleExpression5 ) ) )
            	    // InternalHale.g:383:5: () otherlv_2= '==' ( (lv_right_3_0= ruleExpression5 ) )
            	    {
            	    // InternalHale.g:383:5: ()
            	    // InternalHale.g:384:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpression6Access().getEqualityLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,14,FOLLOW_6); 

            	    					newLeafNode(otherlv_2, grammarAccess.getExpression6Access().getEqualsSignEqualsSignKeyword_1_0_1());
            	    				
            	    // InternalHale.g:394:5: ( (lv_right_3_0= ruleExpression5 ) )
            	    // InternalHale.g:395:6: (lv_right_3_0= ruleExpression5 )
            	    {
            	    // InternalHale.g:395:6: (lv_right_3_0= ruleExpression5 )
            	    // InternalHale.g:396:7: lv_right_3_0= ruleExpression5
            	    {

            	    							newCompositeNode(grammarAccess.getExpression6Access().getRightExpression5ParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_7);
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
            	    // InternalHale.g:415:4: ( () otherlv_5= '!=' ( (lv_right_6_0= ruleExpression5 ) ) )
            	    {
            	    // InternalHale.g:415:4: ( () otherlv_5= '!=' ( (lv_right_6_0= ruleExpression5 ) ) )
            	    // InternalHale.g:416:5: () otherlv_5= '!=' ( (lv_right_6_0= ruleExpression5 ) )
            	    {
            	    // InternalHale.g:416:5: ()
            	    // InternalHale.g:417:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpression6Access().getInequalityLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,15,FOLLOW_6); 

            	    					newLeafNode(otherlv_5, grammarAccess.getExpression6Access().getExclamationMarkEqualsSignKeyword_1_1_1());
            	    				
            	    // InternalHale.g:427:5: ( (lv_right_6_0= ruleExpression5 ) )
            	    // InternalHale.g:428:6: (lv_right_6_0= ruleExpression5 )
            	    {
            	    // InternalHale.g:428:6: (lv_right_6_0= ruleExpression5 )
            	    // InternalHale.g:429:7: lv_right_6_0= ruleExpression5
            	    {

            	    							newCompositeNode(grammarAccess.getExpression6Access().getRightExpression5ParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_7);
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
    // InternalHale.g:452:1: entryRuleExpression5 returns [EObject current=null] : iv_ruleExpression5= ruleExpression5 EOF ;
    public final EObject entryRuleExpression5() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression5 = null;


        try {
            // InternalHale.g:452:52: (iv_ruleExpression5= ruleExpression5 EOF )
            // InternalHale.g:453:2: iv_ruleExpression5= ruleExpression5 EOF
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
    // InternalHale.g:459:1: ruleExpression5 returns [EObject current=null] : (this_Expression4_0= ruleExpression4 ( ( () otherlv_2= '<=' ( (lv_right_3_0= ruleExpression4 ) ) ) | ( () otherlv_5= '<' ( (lv_right_6_0= ruleExpression4 ) ) ) | ( () otherlv_8= '>=' ( (lv_right_9_0= ruleExpression4 ) ) ) | ( () otherlv_11= '>' ( (lv_right_12_0= ruleExpression4 ) ) ) )* ) ;
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
            // InternalHale.g:465:2: ( (this_Expression4_0= ruleExpression4 ( ( () otherlv_2= '<=' ( (lv_right_3_0= ruleExpression4 ) ) ) | ( () otherlv_5= '<' ( (lv_right_6_0= ruleExpression4 ) ) ) | ( () otherlv_8= '>=' ( (lv_right_9_0= ruleExpression4 ) ) ) | ( () otherlv_11= '>' ( (lv_right_12_0= ruleExpression4 ) ) ) )* ) )
            // InternalHale.g:466:2: (this_Expression4_0= ruleExpression4 ( ( () otherlv_2= '<=' ( (lv_right_3_0= ruleExpression4 ) ) ) | ( () otherlv_5= '<' ( (lv_right_6_0= ruleExpression4 ) ) ) | ( () otherlv_8= '>=' ( (lv_right_9_0= ruleExpression4 ) ) ) | ( () otherlv_11= '>' ( (lv_right_12_0= ruleExpression4 ) ) ) )* )
            {
            // InternalHale.g:466:2: (this_Expression4_0= ruleExpression4 ( ( () otherlv_2= '<=' ( (lv_right_3_0= ruleExpression4 ) ) ) | ( () otherlv_5= '<' ( (lv_right_6_0= ruleExpression4 ) ) ) | ( () otherlv_8= '>=' ( (lv_right_9_0= ruleExpression4 ) ) ) | ( () otherlv_11= '>' ( (lv_right_12_0= ruleExpression4 ) ) ) )* )
            // InternalHale.g:467:3: this_Expression4_0= ruleExpression4 ( ( () otherlv_2= '<=' ( (lv_right_3_0= ruleExpression4 ) ) ) | ( () otherlv_5= '<' ( (lv_right_6_0= ruleExpression4 ) ) ) | ( () otherlv_8= '>=' ( (lv_right_9_0= ruleExpression4 ) ) ) | ( () otherlv_11= '>' ( (lv_right_12_0= ruleExpression4 ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpression5Access().getExpression4ParserRuleCall_0());
            		
            pushFollow(FOLLOW_8);
            this_Expression4_0=ruleExpression4();

            state._fsp--;


            			current = this_Expression4_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHale.g:475:3: ( ( () otherlv_2= '<=' ( (lv_right_3_0= ruleExpression4 ) ) ) | ( () otherlv_5= '<' ( (lv_right_6_0= ruleExpression4 ) ) ) | ( () otherlv_8= '>=' ( (lv_right_9_0= ruleExpression4 ) ) ) | ( () otherlv_11= '>' ( (lv_right_12_0= ruleExpression4 ) ) ) )*
            loop6:
            do {
                int alt6=5;
                switch ( input.LA(1) ) {
                case 16:
                    {
                    alt6=1;
                    }
                    break;
                case 17:
                    {
                    alt6=2;
                    }
                    break;
                case 18:
                    {
                    alt6=3;
                    }
                    break;
                case 19:
                    {
                    alt6=4;
                    }
                    break;

                }

                switch (alt6) {
            	case 1 :
            	    // InternalHale.g:476:4: ( () otherlv_2= '<=' ( (lv_right_3_0= ruleExpression4 ) ) )
            	    {
            	    // InternalHale.g:476:4: ( () otherlv_2= '<=' ( (lv_right_3_0= ruleExpression4 ) ) )
            	    // InternalHale.g:477:5: () otherlv_2= '<=' ( (lv_right_3_0= ruleExpression4 ) )
            	    {
            	    // InternalHale.g:477:5: ()
            	    // InternalHale.g:478:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpression5Access().getLessThanOrEqualLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,16,FOLLOW_6); 

            	    					newLeafNode(otherlv_2, grammarAccess.getExpression5Access().getLessThanSignEqualsSignKeyword_1_0_1());
            	    				
            	    // InternalHale.g:488:5: ( (lv_right_3_0= ruleExpression4 ) )
            	    // InternalHale.g:489:6: (lv_right_3_0= ruleExpression4 )
            	    {
            	    // InternalHale.g:489:6: (lv_right_3_0= ruleExpression4 )
            	    // InternalHale.g:490:7: lv_right_3_0= ruleExpression4
            	    {

            	    							newCompositeNode(grammarAccess.getExpression5Access().getRightExpression4ParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_8);
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
            	    // InternalHale.g:509:4: ( () otherlv_5= '<' ( (lv_right_6_0= ruleExpression4 ) ) )
            	    {
            	    // InternalHale.g:509:4: ( () otherlv_5= '<' ( (lv_right_6_0= ruleExpression4 ) ) )
            	    // InternalHale.g:510:5: () otherlv_5= '<' ( (lv_right_6_0= ruleExpression4 ) )
            	    {
            	    // InternalHale.g:510:5: ()
            	    // InternalHale.g:511:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpression5Access().getLessThanLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,17,FOLLOW_6); 

            	    					newLeafNode(otherlv_5, grammarAccess.getExpression5Access().getLessThanSignKeyword_1_1_1());
            	    				
            	    // InternalHale.g:521:5: ( (lv_right_6_0= ruleExpression4 ) )
            	    // InternalHale.g:522:6: (lv_right_6_0= ruleExpression4 )
            	    {
            	    // InternalHale.g:522:6: (lv_right_6_0= ruleExpression4 )
            	    // InternalHale.g:523:7: lv_right_6_0= ruleExpression4
            	    {

            	    							newCompositeNode(grammarAccess.getExpression5Access().getRightExpression4ParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_8);
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
            	    // InternalHale.g:542:4: ( () otherlv_8= '>=' ( (lv_right_9_0= ruleExpression4 ) ) )
            	    {
            	    // InternalHale.g:542:4: ( () otherlv_8= '>=' ( (lv_right_9_0= ruleExpression4 ) ) )
            	    // InternalHale.g:543:5: () otherlv_8= '>=' ( (lv_right_9_0= ruleExpression4 ) )
            	    {
            	    // InternalHale.g:543:5: ()
            	    // InternalHale.g:544:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpression5Access().getGreaterThanOrEqualLeftAction_1_2_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_8=(Token)match(input,18,FOLLOW_6); 

            	    					newLeafNode(otherlv_8, grammarAccess.getExpression5Access().getGreaterThanSignEqualsSignKeyword_1_2_1());
            	    				
            	    // InternalHale.g:554:5: ( (lv_right_9_0= ruleExpression4 ) )
            	    // InternalHale.g:555:6: (lv_right_9_0= ruleExpression4 )
            	    {
            	    // InternalHale.g:555:6: (lv_right_9_0= ruleExpression4 )
            	    // InternalHale.g:556:7: lv_right_9_0= ruleExpression4
            	    {

            	    							newCompositeNode(grammarAccess.getExpression5Access().getRightExpression4ParserRuleCall_1_2_2_0());
            	    						
            	    pushFollow(FOLLOW_8);
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
            	    // InternalHale.g:575:4: ( () otherlv_11= '>' ( (lv_right_12_0= ruleExpression4 ) ) )
            	    {
            	    // InternalHale.g:575:4: ( () otherlv_11= '>' ( (lv_right_12_0= ruleExpression4 ) ) )
            	    // InternalHale.g:576:5: () otherlv_11= '>' ( (lv_right_12_0= ruleExpression4 ) )
            	    {
            	    // InternalHale.g:576:5: ()
            	    // InternalHale.g:577:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpression5Access().getGreaterThanLeftAction_1_3_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_11=(Token)match(input,19,FOLLOW_6); 

            	    					newLeafNode(otherlv_11, grammarAccess.getExpression5Access().getGreaterThanSignKeyword_1_3_1());
            	    				
            	    // InternalHale.g:587:5: ( (lv_right_12_0= ruleExpression4 ) )
            	    // InternalHale.g:588:6: (lv_right_12_0= ruleExpression4 )
            	    {
            	    // InternalHale.g:588:6: (lv_right_12_0= ruleExpression4 )
            	    // InternalHale.g:589:7: lv_right_12_0= ruleExpression4
            	    {

            	    							newCompositeNode(grammarAccess.getExpression5Access().getRightExpression4ParserRuleCall_1_3_2_0());
            	    						
            	    pushFollow(FOLLOW_8);
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
    // InternalHale.g:612:1: entryRuleExpression4 returns [EObject current=null] : iv_ruleExpression4= ruleExpression4 EOF ;
    public final EObject entryRuleExpression4() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression4 = null;


        try {
            // InternalHale.g:612:52: (iv_ruleExpression4= ruleExpression4 EOF )
            // InternalHale.g:613:2: iv_ruleExpression4= ruleExpression4 EOF
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
    // InternalHale.g:619:1: ruleExpression4 returns [EObject current=null] : (this_Expression3_0= ruleExpression3 ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpression3 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpression3 ) ) ) )* ) ;
    public final EObject ruleExpression4() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_Expression3_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalHale.g:625:2: ( (this_Expression3_0= ruleExpression3 ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpression3 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpression3 ) ) ) )* ) )
            // InternalHale.g:626:2: (this_Expression3_0= ruleExpression3 ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpression3 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpression3 ) ) ) )* )
            {
            // InternalHale.g:626:2: (this_Expression3_0= ruleExpression3 ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpression3 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpression3 ) ) ) )* )
            // InternalHale.g:627:3: this_Expression3_0= ruleExpression3 ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpression3 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpression3 ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpression4Access().getExpression3ParserRuleCall_0());
            		
            pushFollow(FOLLOW_9);
            this_Expression3_0=ruleExpression3();

            state._fsp--;


            			current = this_Expression3_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHale.g:635:3: ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpression3 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpression3 ) ) ) )*
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20) ) {
                    alt7=1;
                }
                else if ( (LA7_0==21) ) {
                    alt7=2;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalHale.g:636:4: ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpression3 ) ) )
            	    {
            	    // InternalHale.g:636:4: ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpression3 ) ) )
            	    // InternalHale.g:637:5: () otherlv_2= '+' ( (lv_right_3_0= ruleExpression3 ) )
            	    {
            	    // InternalHale.g:637:5: ()
            	    // InternalHale.g:638:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpression4Access().getAdditionLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,20,FOLLOW_6); 

            	    					newLeafNode(otherlv_2, grammarAccess.getExpression4Access().getPlusSignKeyword_1_0_1());
            	    				
            	    // InternalHale.g:648:5: ( (lv_right_3_0= ruleExpression3 ) )
            	    // InternalHale.g:649:6: (lv_right_3_0= ruleExpression3 )
            	    {
            	    // InternalHale.g:649:6: (lv_right_3_0= ruleExpression3 )
            	    // InternalHale.g:650:7: lv_right_3_0= ruleExpression3
            	    {

            	    							newCompositeNode(grammarAccess.getExpression4Access().getRightExpression3ParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_9);
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
            	    // InternalHale.g:669:4: ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpression3 ) ) )
            	    {
            	    // InternalHale.g:669:4: ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpression3 ) ) )
            	    // InternalHale.g:670:5: () otherlv_5= '-' ( (lv_right_6_0= ruleExpression3 ) )
            	    {
            	    // InternalHale.g:670:5: ()
            	    // InternalHale.g:671:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpression4Access().getSubtractionLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,21,FOLLOW_6); 

            	    					newLeafNode(otherlv_5, grammarAccess.getExpression4Access().getHyphenMinusKeyword_1_1_1());
            	    				
            	    // InternalHale.g:681:5: ( (lv_right_6_0= ruleExpression3 ) )
            	    // InternalHale.g:682:6: (lv_right_6_0= ruleExpression3 )
            	    {
            	    // InternalHale.g:682:6: (lv_right_6_0= ruleExpression3 )
            	    // InternalHale.g:683:7: lv_right_6_0= ruleExpression3
            	    {

            	    							newCompositeNode(grammarAccess.getExpression4Access().getRightExpression3ParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_9);
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
    // InternalHale.g:706:1: entryRuleExpression3 returns [EObject current=null] : iv_ruleExpression3= ruleExpression3 EOF ;
    public final EObject entryRuleExpression3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression3 = null;


        try {
            // InternalHale.g:706:52: (iv_ruleExpression3= ruleExpression3 EOF )
            // InternalHale.g:707:2: iv_ruleExpression3= ruleExpression3 EOF
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
    // InternalHale.g:713:1: ruleExpression3 returns [EObject current=null] : (this_Expression2_0= ruleExpression2 ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpression2 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpression2 ) ) ) | ( () otherlv_8= '%' ( (lv_right_9_0= ruleExpression2 ) ) ) )* ) ;
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
            // InternalHale.g:719:2: ( (this_Expression2_0= ruleExpression2 ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpression2 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpression2 ) ) ) | ( () otherlv_8= '%' ( (lv_right_9_0= ruleExpression2 ) ) ) )* ) )
            // InternalHale.g:720:2: (this_Expression2_0= ruleExpression2 ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpression2 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpression2 ) ) ) | ( () otherlv_8= '%' ( (lv_right_9_0= ruleExpression2 ) ) ) )* )
            {
            // InternalHale.g:720:2: (this_Expression2_0= ruleExpression2 ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpression2 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpression2 ) ) ) | ( () otherlv_8= '%' ( (lv_right_9_0= ruleExpression2 ) ) ) )* )
            // InternalHale.g:721:3: this_Expression2_0= ruleExpression2 ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpression2 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpression2 ) ) ) | ( () otherlv_8= '%' ( (lv_right_9_0= ruleExpression2 ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpression3Access().getExpression2ParserRuleCall_0());
            		
            pushFollow(FOLLOW_10);
            this_Expression2_0=ruleExpression2();

            state._fsp--;


            			current = this_Expression2_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHale.g:729:3: ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpression2 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpression2 ) ) ) | ( () otherlv_8= '%' ( (lv_right_9_0= ruleExpression2 ) ) ) )*
            loop8:
            do {
                int alt8=4;
                switch ( input.LA(1) ) {
                case 22:
                    {
                    alt8=1;
                    }
                    break;
                case 23:
                    {
                    alt8=2;
                    }
                    break;
                case 24:
                    {
                    alt8=3;
                    }
                    break;

                }

                switch (alt8) {
            	case 1 :
            	    // InternalHale.g:730:4: ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpression2 ) ) )
            	    {
            	    // InternalHale.g:730:4: ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpression2 ) ) )
            	    // InternalHale.g:731:5: () otherlv_2= '*' ( (lv_right_3_0= ruleExpression2 ) )
            	    {
            	    // InternalHale.g:731:5: ()
            	    // InternalHale.g:732:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpression3Access().getMultiplicationLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,22,FOLLOW_6); 

            	    					newLeafNode(otherlv_2, grammarAccess.getExpression3Access().getAsteriskKeyword_1_0_1());
            	    				
            	    // InternalHale.g:742:5: ( (lv_right_3_0= ruleExpression2 ) )
            	    // InternalHale.g:743:6: (lv_right_3_0= ruleExpression2 )
            	    {
            	    // InternalHale.g:743:6: (lv_right_3_0= ruleExpression2 )
            	    // InternalHale.g:744:7: lv_right_3_0= ruleExpression2
            	    {

            	    							newCompositeNode(grammarAccess.getExpression3Access().getRightExpression2ParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_10);
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
            	    // InternalHale.g:763:4: ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpression2 ) ) )
            	    {
            	    // InternalHale.g:763:4: ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpression2 ) ) )
            	    // InternalHale.g:764:5: () otherlv_5= '/' ( (lv_right_6_0= ruleExpression2 ) )
            	    {
            	    // InternalHale.g:764:5: ()
            	    // InternalHale.g:765:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpression3Access().getDivisionLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,23,FOLLOW_6); 

            	    					newLeafNode(otherlv_5, grammarAccess.getExpression3Access().getSolidusKeyword_1_1_1());
            	    				
            	    // InternalHale.g:775:5: ( (lv_right_6_0= ruleExpression2 ) )
            	    // InternalHale.g:776:6: (lv_right_6_0= ruleExpression2 )
            	    {
            	    // InternalHale.g:776:6: (lv_right_6_0= ruleExpression2 )
            	    // InternalHale.g:777:7: lv_right_6_0= ruleExpression2
            	    {

            	    							newCompositeNode(grammarAccess.getExpression3Access().getRightExpression2ParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_10);
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
            	    // InternalHale.g:796:4: ( () otherlv_8= '%' ( (lv_right_9_0= ruleExpression2 ) ) )
            	    {
            	    // InternalHale.g:796:4: ( () otherlv_8= '%' ( (lv_right_9_0= ruleExpression2 ) ) )
            	    // InternalHale.g:797:5: () otherlv_8= '%' ( (lv_right_9_0= ruleExpression2 ) )
            	    {
            	    // InternalHale.g:797:5: ()
            	    // InternalHale.g:798:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpression3Access().getRemainderLeftAction_1_2_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_8=(Token)match(input,24,FOLLOW_6); 

            	    					newLeafNode(otherlv_8, grammarAccess.getExpression3Access().getPercentSignKeyword_1_2_1());
            	    				
            	    // InternalHale.g:808:5: ( (lv_right_9_0= ruleExpression2 ) )
            	    // InternalHale.g:809:6: (lv_right_9_0= ruleExpression2 )
            	    {
            	    // InternalHale.g:809:6: (lv_right_9_0= ruleExpression2 )
            	    // InternalHale.g:810:7: lv_right_9_0= ruleExpression2
            	    {

            	    							newCompositeNode(grammarAccess.getExpression3Access().getRightExpression2ParserRuleCall_1_2_2_0());
            	    						
            	    pushFollow(FOLLOW_10);
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
    // InternalHale.g:833:1: entryRuleExpression2 returns [EObject current=null] : iv_ruleExpression2= ruleExpression2 EOF ;
    public final EObject entryRuleExpression2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression2 = null;


        try {
            // InternalHale.g:833:52: (iv_ruleExpression2= ruleExpression2 EOF )
            // InternalHale.g:834:2: iv_ruleExpression2= ruleExpression2 EOF
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
    // InternalHale.g:840:1: ruleExpression2 returns [EObject current=null] : (this_Expression1_0= ruleExpression1 ( () otherlv_2= '**' ( (lv_right_3_0= ruleExpression1 ) ) )* ) ;
    public final EObject ruleExpression2() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Expression1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalHale.g:846:2: ( (this_Expression1_0= ruleExpression1 ( () otherlv_2= '**' ( (lv_right_3_0= ruleExpression1 ) ) )* ) )
            // InternalHale.g:847:2: (this_Expression1_0= ruleExpression1 ( () otherlv_2= '**' ( (lv_right_3_0= ruleExpression1 ) ) )* )
            {
            // InternalHale.g:847:2: (this_Expression1_0= ruleExpression1 ( () otherlv_2= '**' ( (lv_right_3_0= ruleExpression1 ) ) )* )
            // InternalHale.g:848:3: this_Expression1_0= ruleExpression1 ( () otherlv_2= '**' ( (lv_right_3_0= ruleExpression1 ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpression2Access().getExpression1ParserRuleCall_0());
            		
            pushFollow(FOLLOW_11);
            this_Expression1_0=ruleExpression1();

            state._fsp--;


            			current = this_Expression1_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalHale.g:856:3: ( () otherlv_2= '**' ( (lv_right_3_0= ruleExpression1 ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==25) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalHale.g:857:4: () otherlv_2= '**' ( (lv_right_3_0= ruleExpression1 ) )
            	    {
            	    // InternalHale.g:857:4: ()
            	    // InternalHale.g:858:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getExpression2Access().getExponentiationLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,25,FOLLOW_6); 

            	    				newLeafNode(otherlv_2, grammarAccess.getExpression2Access().getAsteriskAsteriskKeyword_1_1());
            	    			
            	    // InternalHale.g:868:4: ( (lv_right_3_0= ruleExpression1 ) )
            	    // InternalHale.g:869:5: (lv_right_3_0= ruleExpression1 )
            	    {
            	    // InternalHale.g:869:5: (lv_right_3_0= ruleExpression1 )
            	    // InternalHale.g:870:6: lv_right_3_0= ruleExpression1
            	    {

            	    						newCompositeNode(grammarAccess.getExpression2Access().getRightExpression1ParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_11);
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
    // InternalHale.g:892:1: entryRuleExpression1 returns [EObject current=null] : iv_ruleExpression1= ruleExpression1 EOF ;
    public final EObject entryRuleExpression1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression1 = null;


        try {
            // InternalHale.g:892:52: (iv_ruleExpression1= ruleExpression1 EOF )
            // InternalHale.g:893:2: iv_ruleExpression1= ruleExpression1 EOF
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
    // InternalHale.g:899:1: ruleExpression1 returns [EObject current=null] : ( ( () otherlv_1= '-' ( (lv_inner_2_0= ruleExpression1 ) ) ) | ( () otherlv_4= 'not' ( (lv_inner_5_0= ruleExpression1 ) ) ) | this_Primary_6= rulePrimary ) ;
    public final EObject ruleExpression1() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_inner_2_0 = null;

        EObject lv_inner_5_0 = null;

        EObject this_Primary_6 = null;



        	enterRule();

        try {
            // InternalHale.g:905:2: ( ( ( () otherlv_1= '-' ( (lv_inner_2_0= ruleExpression1 ) ) ) | ( () otherlv_4= 'not' ( (lv_inner_5_0= ruleExpression1 ) ) ) | this_Primary_6= rulePrimary ) )
            // InternalHale.g:906:2: ( ( () otherlv_1= '-' ( (lv_inner_2_0= ruleExpression1 ) ) ) | ( () otherlv_4= 'not' ( (lv_inner_5_0= ruleExpression1 ) ) ) | this_Primary_6= rulePrimary )
            {
            // InternalHale.g:906:2: ( ( () otherlv_1= '-' ( (lv_inner_2_0= ruleExpression1 ) ) ) | ( () otherlv_4= 'not' ( (lv_inner_5_0= ruleExpression1 ) ) ) | this_Primary_6= rulePrimary )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt10=1;
                }
                break;
            case 26:
                {
                alt10=2;
                }
                break;
            case RULE_INT:
            case RULE_STRING:
            case RULE_ID:
            case 27:
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
                    // InternalHale.g:907:3: ( () otherlv_1= '-' ( (lv_inner_2_0= ruleExpression1 ) ) )
                    {
                    // InternalHale.g:907:3: ( () otherlv_1= '-' ( (lv_inner_2_0= ruleExpression1 ) ) )
                    // InternalHale.g:908:4: () otherlv_1= '-' ( (lv_inner_2_0= ruleExpression1 ) )
                    {
                    // InternalHale.g:908:4: ()
                    // InternalHale.g:909:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExpression1Access().getUnaryNegationAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,21,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getExpression1Access().getHyphenMinusKeyword_0_1());
                    			
                    // InternalHale.g:919:4: ( (lv_inner_2_0= ruleExpression1 ) )
                    // InternalHale.g:920:5: (lv_inner_2_0= ruleExpression1 )
                    {
                    // InternalHale.g:920:5: (lv_inner_2_0= ruleExpression1 )
                    // InternalHale.g:921:6: lv_inner_2_0= ruleExpression1
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
                    // InternalHale.g:940:3: ( () otherlv_4= 'not' ( (lv_inner_5_0= ruleExpression1 ) ) )
                    {
                    // InternalHale.g:940:3: ( () otherlv_4= 'not' ( (lv_inner_5_0= ruleExpression1 ) ) )
                    // InternalHale.g:941:4: () otherlv_4= 'not' ( (lv_inner_5_0= ruleExpression1 ) )
                    {
                    // InternalHale.g:941:4: ()
                    // InternalHale.g:942:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExpression1Access().getLogicalNotAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,26,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getExpression1Access().getNotKeyword_1_1());
                    			
                    // InternalHale.g:952:4: ( (lv_inner_5_0= ruleExpression1 ) )
                    // InternalHale.g:953:5: (lv_inner_5_0= ruleExpression1 )
                    {
                    // InternalHale.g:953:5: (lv_inner_5_0= ruleExpression1 )
                    // InternalHale.g:954:6: lv_inner_5_0= ruleExpression1
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
                    // InternalHale.g:973:3: this_Primary_6= rulePrimary
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
    // InternalHale.g:985:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalHale.g:985:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalHale.g:986:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalHale.g:992:1: rulePrimary returns [EObject current=null] : (this_Literal_0= ruleLiteral | this_BindingReference_1= ruleBindingReference | (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Literal_0 = null;

        EObject this_BindingReference_1 = null;

        EObject this_Expression_3 = null;



        	enterRule();

        try {
            // InternalHale.g:998:2: ( (this_Literal_0= ruleLiteral | this_BindingReference_1= ruleBindingReference | (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' ) ) )
            // InternalHale.g:999:2: (this_Literal_0= ruleLiteral | this_BindingReference_1= ruleBindingReference | (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' ) )
            {
            // InternalHale.g:999:2: (this_Literal_0= ruleLiteral | this_BindingReference_1= ruleBindingReference | (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' ) )
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
            case 27:
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
                    // InternalHale.g:1000:3: this_Literal_0= ruleLiteral
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
                    // InternalHale.g:1009:3: this_BindingReference_1= ruleBindingReference
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
                    // InternalHale.g:1018:3: (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' )
                    {
                    // InternalHale.g:1018:3: (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' )
                    // InternalHale.g:1019:4: otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_2_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_12);
                    this_Expression_3=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_3;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_4=(Token)match(input,28,FOLLOW_2); 

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
    // InternalHale.g:1040:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalHale.g:1040:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalHale.g:1041:2: iv_ruleLiteral= ruleLiteral EOF
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
    // InternalHale.g:1047:1: ruleLiteral returns [EObject current=null] : (this_NumberLiteral_0= ruleNumberLiteral | this_StringLiteral_1= ruleStringLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_NumberLiteral_0 = null;

        EObject this_StringLiteral_1 = null;



        	enterRule();

        try {
            // InternalHale.g:1053:2: ( (this_NumberLiteral_0= ruleNumberLiteral | this_StringLiteral_1= ruleStringLiteral ) )
            // InternalHale.g:1054:2: (this_NumberLiteral_0= ruleNumberLiteral | this_StringLiteral_1= ruleStringLiteral )
            {
            // InternalHale.g:1054:2: (this_NumberLiteral_0= ruleNumberLiteral | this_StringLiteral_1= ruleStringLiteral )
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
                    // InternalHale.g:1055:3: this_NumberLiteral_0= ruleNumberLiteral
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
                    // InternalHale.g:1064:3: this_StringLiteral_1= ruleStringLiteral
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
    // InternalHale.g:1076:1: entryRuleNumberLiteral returns [EObject current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final EObject entryRuleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteral = null;


        try {
            // InternalHale.g:1076:54: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // InternalHale.g:1077:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
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
    // InternalHale.g:1083:1: ruleNumberLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleNumberLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalHale.g:1089:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalHale.g:1090:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalHale.g:1090:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalHale.g:1091:3: (lv_value_0_0= RULE_INT )
            {
            // InternalHale.g:1091:3: (lv_value_0_0= RULE_INT )
            // InternalHale.g:1092:4: lv_value_0_0= RULE_INT
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
    // InternalHale.g:1111:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalHale.g:1111:54: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalHale.g:1112:2: iv_ruleStringLiteral= ruleStringLiteral EOF
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
    // InternalHale.g:1118:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalHale.g:1124:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalHale.g:1125:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalHale.g:1125:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalHale.g:1126:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalHale.g:1126:3: (lv_value_0_0= RULE_STRING )
            // InternalHale.g:1127:4: lv_value_0_0= RULE_STRING
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


    // $ANTLR start "entryRuleBinding"
    // InternalHale.g:1146:1: entryRuleBinding returns [EObject current=null] : iv_ruleBinding= ruleBinding EOF ;
    public final EObject entryRuleBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinding = null;


        try {
            // InternalHale.g:1146:48: (iv_ruleBinding= ruleBinding EOF )
            // InternalHale.g:1147:2: iv_ruleBinding= ruleBinding EOF
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
    // InternalHale.g:1153:1: ruleBinding returns [EObject current=null] : (otherlv_0= 'let' ( (lv_mutable_1_0= 'mut' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) ) ) ;
    public final EObject ruleBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_mutable_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalHale.g:1159:2: ( (otherlv_0= 'let' ( (lv_mutable_1_0= 'mut' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) ) ) )
            // InternalHale.g:1160:2: (otherlv_0= 'let' ( (lv_mutable_1_0= 'mut' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) ) )
            {
            // InternalHale.g:1160:2: (otherlv_0= 'let' ( (lv_mutable_1_0= 'mut' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) ) )
            // InternalHale.g:1161:3: otherlv_0= 'let' ( (lv_mutable_1_0= 'mut' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getBindingAccess().getLetKeyword_0());
            		
            // InternalHale.g:1165:3: ( (lv_mutable_1_0= 'mut' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==30) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalHale.g:1166:4: (lv_mutable_1_0= 'mut' )
                    {
                    // InternalHale.g:1166:4: (lv_mutable_1_0= 'mut' )
                    // InternalHale.g:1167:5: lv_mutable_1_0= 'mut'
                    {
                    lv_mutable_1_0=(Token)match(input,30,FOLLOW_14); 

                    					newLeafNode(lv_mutable_1_0, grammarAccess.getBindingAccess().getMutableMutKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBindingRule());
                    					}
                    					setWithLastConsumed(current, "mutable", lv_mutable_1_0 != null, "mut");
                    				

                    }


                    }
                    break;

            }

            // InternalHale.g:1179:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalHale.g:1180:4: (lv_name_2_0= RULE_ID )
            {
            // InternalHale.g:1180:4: (lv_name_2_0= RULE_ID )
            // InternalHale.g:1181:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_15); 

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

            otherlv_3=(Token)match(input,31,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getBindingAccess().getEqualsSignKeyword_3());
            		
            // InternalHale.g:1201:3: ( (lv_value_4_0= ruleExpression ) )
            // InternalHale.g:1202:4: (lv_value_4_0= ruleExpression )
            {
            // InternalHale.g:1202:4: (lv_value_4_0= ruleExpression )
            // InternalHale.g:1203:5: lv_value_4_0= ruleExpression
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
    // InternalHale.g:1224:1: entryRuleBindingReference returns [EObject current=null] : iv_ruleBindingReference= ruleBindingReference EOF ;
    public final EObject entryRuleBindingReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBindingReference = null;


        try {
            // InternalHale.g:1224:57: (iv_ruleBindingReference= ruleBindingReference EOF )
            // InternalHale.g:1225:2: iv_ruleBindingReference= ruleBindingReference EOF
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
    // InternalHale.g:1231:1: ruleBindingReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleBindingReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalHale.g:1237:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalHale.g:1238:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalHale.g:1238:2: ( (otherlv_0= RULE_ID ) )
            // InternalHale.g:1239:3: (otherlv_0= RULE_ID )
            {
            // InternalHale.g:1239:3: (otherlv_0= RULE_ID )
            // InternalHale.g:1240:4: otherlv_0= RULE_ID
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
    // InternalHale.g:1254:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalHale.g:1254:51: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalHale.g:1255:2: iv_ruleAssignment= ruleAssignment EOF
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
    // InternalHale.g:1261:1: ruleAssignment returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalHale.g:1267:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) ) )
            // InternalHale.g:1268:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )
            {
            // InternalHale.g:1268:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )
            // InternalHale.g:1269:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) )
            {
            // InternalHale.g:1269:3: ( (otherlv_0= RULE_ID ) )
            // InternalHale.g:1270:4: (otherlv_0= RULE_ID )
            {
            // InternalHale.g:1270:4: (otherlv_0= RULE_ID )
            // InternalHale.g:1271:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssignmentRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_0, grammarAccess.getAssignmentAccess().getBindingBindingCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,31,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1());
            		
            // InternalHale.g:1286:3: ( (lv_value_2_0= ruleExpression ) )
            // InternalHale.g:1287:4: (lv_value_2_0= ruleExpression )
            {
            // InternalHale.g:1287:4: (lv_value_2_0= ruleExpression )
            // InternalHale.g:1288:5: lv_value_2_0= ruleExpression
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


    // $ANTLR start "entryRulePrint"
    // InternalHale.g:1309:1: entryRulePrint returns [EObject current=null] : iv_rulePrint= rulePrint EOF ;
    public final EObject entryRulePrint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrint = null;


        try {
            // InternalHale.g:1309:46: (iv_rulePrint= rulePrint EOF )
            // InternalHale.g:1310:2: iv_rulePrint= rulePrint EOF
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
    // InternalHale.g:1316:1: rulePrint returns [EObject current=null] : (otherlv_0= 'print' ( (lv_value_1_0= ruleExpression ) ) ) ;
    public final EObject rulePrint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalHale.g:1322:2: ( (otherlv_0= 'print' ( (lv_value_1_0= ruleExpression ) ) ) )
            // InternalHale.g:1323:2: (otherlv_0= 'print' ( (lv_value_1_0= ruleExpression ) ) )
            {
            // InternalHale.g:1323:2: (otherlv_0= 'print' ( (lv_value_1_0= ruleExpression ) ) )
            // InternalHale.g:1324:3: otherlv_0= 'print' ( (lv_value_1_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getPrintAccess().getPrintKeyword_0());
            		
            // InternalHale.g:1328:3: ( (lv_value_1_0= ruleExpression ) )
            // InternalHale.g:1329:4: (lv_value_1_0= ruleExpression )
            {
            // InternalHale.g:1329:4: (lv_value_1_0= ruleExpression )
            // InternalHale.g:1330:5: lv_value_1_0= ruleExpression
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


    // $ANTLR start "entryRuleIf"
    // InternalHale.g:1351:1: entryRuleIf returns [EObject current=null] : iv_ruleIf= ruleIf EOF ;
    public final EObject entryRuleIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIf = null;


        try {
            // InternalHale.g:1351:43: (iv_ruleIf= ruleIf EOF )
            // InternalHale.g:1352:2: iv_ruleIf= ruleIf EOF
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
    // InternalHale.g:1358:1: ruleIf returns [EObject current=null] : (otherlv_0= 'if' ( (lv_conditions_1_0= ruleExpression ) ) ( (lv_ifBlocks_2_0= ruleBracedBlock ) ) (otherlv_3= 'elseif' ( (lv_conditions_4_0= ruleExpression ) ) ( (lv_ifBlocks_5_0= ruleBracedBlock ) ) )* (otherlv_6= 'else' ( (lv_elseBlock_7_0= ruleBracedBlock ) ) )? ) ;
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
            // InternalHale.g:1364:2: ( (otherlv_0= 'if' ( (lv_conditions_1_0= ruleExpression ) ) ( (lv_ifBlocks_2_0= ruleBracedBlock ) ) (otherlv_3= 'elseif' ( (lv_conditions_4_0= ruleExpression ) ) ( (lv_ifBlocks_5_0= ruleBracedBlock ) ) )* (otherlv_6= 'else' ( (lv_elseBlock_7_0= ruleBracedBlock ) ) )? ) )
            // InternalHale.g:1365:2: (otherlv_0= 'if' ( (lv_conditions_1_0= ruleExpression ) ) ( (lv_ifBlocks_2_0= ruleBracedBlock ) ) (otherlv_3= 'elseif' ( (lv_conditions_4_0= ruleExpression ) ) ( (lv_ifBlocks_5_0= ruleBracedBlock ) ) )* (otherlv_6= 'else' ( (lv_elseBlock_7_0= ruleBracedBlock ) ) )? )
            {
            // InternalHale.g:1365:2: (otherlv_0= 'if' ( (lv_conditions_1_0= ruleExpression ) ) ( (lv_ifBlocks_2_0= ruleBracedBlock ) ) (otherlv_3= 'elseif' ( (lv_conditions_4_0= ruleExpression ) ) ( (lv_ifBlocks_5_0= ruleBracedBlock ) ) )* (otherlv_6= 'else' ( (lv_elseBlock_7_0= ruleBracedBlock ) ) )? )
            // InternalHale.g:1366:3: otherlv_0= 'if' ( (lv_conditions_1_0= ruleExpression ) ) ( (lv_ifBlocks_2_0= ruleBracedBlock ) ) (otherlv_3= 'elseif' ( (lv_conditions_4_0= ruleExpression ) ) ( (lv_ifBlocks_5_0= ruleBracedBlock ) ) )* (otherlv_6= 'else' ( (lv_elseBlock_7_0= ruleBracedBlock ) ) )?
            {
            otherlv_0=(Token)match(input,33,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getIfAccess().getIfKeyword_0());
            		
            // InternalHale.g:1370:3: ( (lv_conditions_1_0= ruleExpression ) )
            // InternalHale.g:1371:4: (lv_conditions_1_0= ruleExpression )
            {
            // InternalHale.g:1371:4: (lv_conditions_1_0= ruleExpression )
            // InternalHale.g:1372:5: lv_conditions_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getIfAccess().getConditionsExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
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

            // InternalHale.g:1389:3: ( (lv_ifBlocks_2_0= ruleBracedBlock ) )
            // InternalHale.g:1390:4: (lv_ifBlocks_2_0= ruleBracedBlock )
            {
            // InternalHale.g:1390:4: (lv_ifBlocks_2_0= ruleBracedBlock )
            // InternalHale.g:1391:5: lv_ifBlocks_2_0= ruleBracedBlock
            {

            					newCompositeNode(grammarAccess.getIfAccess().getIfBlocksBracedBlockParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
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

            // InternalHale.g:1408:3: (otherlv_3= 'elseif' ( (lv_conditions_4_0= ruleExpression ) ) ( (lv_ifBlocks_5_0= ruleBracedBlock ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==34) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalHale.g:1409:4: otherlv_3= 'elseif' ( (lv_conditions_4_0= ruleExpression ) ) ( (lv_ifBlocks_5_0= ruleBracedBlock ) )
            	    {
            	    otherlv_3=(Token)match(input,34,FOLLOW_6); 

            	    				newLeafNode(otherlv_3, grammarAccess.getIfAccess().getElseifKeyword_3_0());
            	    			
            	    // InternalHale.g:1413:4: ( (lv_conditions_4_0= ruleExpression ) )
            	    // InternalHale.g:1414:5: (lv_conditions_4_0= ruleExpression )
            	    {
            	    // InternalHale.g:1414:5: (lv_conditions_4_0= ruleExpression )
            	    // InternalHale.g:1415:6: lv_conditions_4_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getIfAccess().getConditionsExpressionParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_16);
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

            	    // InternalHale.g:1432:4: ( (lv_ifBlocks_5_0= ruleBracedBlock ) )
            	    // InternalHale.g:1433:5: (lv_ifBlocks_5_0= ruleBracedBlock )
            	    {
            	    // InternalHale.g:1433:5: (lv_ifBlocks_5_0= ruleBracedBlock )
            	    // InternalHale.g:1434:6: lv_ifBlocks_5_0= ruleBracedBlock
            	    {

            	    						newCompositeNode(grammarAccess.getIfAccess().getIfBlocksBracedBlockParserRuleCall_3_2_0());
            	    					
            	    pushFollow(FOLLOW_17);
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

            // InternalHale.g:1452:3: (otherlv_6= 'else' ( (lv_elseBlock_7_0= ruleBracedBlock ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==35) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalHale.g:1453:4: otherlv_6= 'else' ( (lv_elseBlock_7_0= ruleBracedBlock ) )
                    {
                    otherlv_6=(Token)match(input,35,FOLLOW_16); 

                    				newLeafNode(otherlv_6, grammarAccess.getIfAccess().getElseKeyword_4_0());
                    			
                    // InternalHale.g:1457:4: ( (lv_elseBlock_7_0= ruleBracedBlock ) )
                    // InternalHale.g:1458:5: (lv_elseBlock_7_0= ruleBracedBlock )
                    {
                    // InternalHale.g:1458:5: (lv_elseBlock_7_0= ruleBracedBlock )
                    // InternalHale.g:1459:6: lv_elseBlock_7_0= ruleBracedBlock
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


    // $ANTLR start "entryRuleBracedBlock"
    // InternalHale.g:1481:1: entryRuleBracedBlock returns [EObject current=null] : iv_ruleBracedBlock= ruleBracedBlock EOF ;
    public final EObject entryRuleBracedBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBracedBlock = null;


        try {
            // InternalHale.g:1481:52: (iv_ruleBracedBlock= ruleBracedBlock EOF )
            // InternalHale.g:1482:2: iv_ruleBracedBlock= ruleBracedBlock EOF
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
    // InternalHale.g:1488:1: ruleBracedBlock returns [EObject current=null] : (otherlv_0= '{' this_Block_1= ruleBlock otherlv_2= '}' ) ;
    public final EObject ruleBracedBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Block_1 = null;



        	enterRule();

        try {
            // InternalHale.g:1494:2: ( (otherlv_0= '{' this_Block_1= ruleBlock otherlv_2= '}' ) )
            // InternalHale.g:1495:2: (otherlv_0= '{' this_Block_1= ruleBlock otherlv_2= '}' )
            {
            // InternalHale.g:1495:2: (otherlv_0= '{' this_Block_1= ruleBlock otherlv_2= '}' )
            // InternalHale.g:1496:3: otherlv_0= '{' this_Block_1= ruleBlock otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getBracedBlockAccess().getLeftCurlyBracketKeyword_0());
            		

            			newCompositeNode(grammarAccess.getBracedBlockAccess().getBlockParserRuleCall_1());
            		
            pushFollow(FOLLOW_19);
            this_Block_1=ruleBlock();

            state._fsp--;


            			current = this_Block_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,37,FOLLOW_2); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000032C200872L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000C200070L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000F0002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001C00002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000040000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000032C200870L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000002000000000L});

}