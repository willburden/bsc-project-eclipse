package willburden.hale.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import willburden.hale.services.HaleGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalHaleParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'print'", "'let'", "'='", "'and'", "'or'", "'=='", "'!='", "'<='", "'<'", "'>='", "'>'", "'+'", "'-'", "'*'", "'/'", "'%'", "'**'", "'not'", "'('", "')'", "'mut'"
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

    	public void setGrammarAccess(HaleGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleHale"
    // InternalHale.g:53:1: entryRuleHale : ruleHale EOF ;
    public final void entryRuleHale() throws RecognitionException {
        try {
            // InternalHale.g:54:1: ( ruleHale EOF )
            // InternalHale.g:55:1: ruleHale EOF
            {
             before(grammarAccess.getHaleRule()); 
            pushFollow(FOLLOW_1);
            ruleHale();

            state._fsp--;

             after(grammarAccess.getHaleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHale"


    // $ANTLR start "ruleHale"
    // InternalHale.g:62:1: ruleHale : ( ( rule__Hale__Group__0 ) ) ;
    public final void ruleHale() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:66:2: ( ( ( rule__Hale__Group__0 ) ) )
            // InternalHale.g:67:2: ( ( rule__Hale__Group__0 ) )
            {
            // InternalHale.g:67:2: ( ( rule__Hale__Group__0 ) )
            // InternalHale.g:68:3: ( rule__Hale__Group__0 )
            {
             before(grammarAccess.getHaleAccess().getGroup()); 
            // InternalHale.g:69:3: ( rule__Hale__Group__0 )
            // InternalHale.g:69:4: rule__Hale__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Hale__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHaleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHale"


    // $ANTLR start "entryRuleStatement"
    // InternalHale.g:78:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalHale.g:79:1: ( ruleStatement EOF )
            // InternalHale.g:80:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalHale.g:87:1: ruleStatement : ( ( rule__Statement__Group__0 ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:91:2: ( ( ( rule__Statement__Group__0 ) ) )
            // InternalHale.g:92:2: ( ( rule__Statement__Group__0 ) )
            {
            // InternalHale.g:92:2: ( ( rule__Statement__Group__0 ) )
            // InternalHale.g:93:3: ( rule__Statement__Group__0 )
            {
             before(grammarAccess.getStatementAccess().getGroup()); 
            // InternalHale.g:94:3: ( rule__Statement__Group__0 )
            // InternalHale.g:94:4: rule__Statement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRulePrint"
    // InternalHale.g:103:1: entryRulePrint : rulePrint EOF ;
    public final void entryRulePrint() throws RecognitionException {
        try {
            // InternalHale.g:104:1: ( rulePrint EOF )
            // InternalHale.g:105:1: rulePrint EOF
            {
             before(grammarAccess.getPrintRule()); 
            pushFollow(FOLLOW_1);
            rulePrint();

            state._fsp--;

             after(grammarAccess.getPrintRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrint"


    // $ANTLR start "rulePrint"
    // InternalHale.g:112:1: rulePrint : ( ( rule__Print__Group__0 ) ) ;
    public final void rulePrint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:116:2: ( ( ( rule__Print__Group__0 ) ) )
            // InternalHale.g:117:2: ( ( rule__Print__Group__0 ) )
            {
            // InternalHale.g:117:2: ( ( rule__Print__Group__0 ) )
            // InternalHale.g:118:3: ( rule__Print__Group__0 )
            {
             before(grammarAccess.getPrintAccess().getGroup()); 
            // InternalHale.g:119:3: ( rule__Print__Group__0 )
            // InternalHale.g:119:4: rule__Print__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Print__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrintAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrint"


    // $ANTLR start "entryRuleBinding"
    // InternalHale.g:128:1: entryRuleBinding : ruleBinding EOF ;
    public final void entryRuleBinding() throws RecognitionException {
        try {
            // InternalHale.g:129:1: ( ruleBinding EOF )
            // InternalHale.g:130:1: ruleBinding EOF
            {
             before(grammarAccess.getBindingRule()); 
            pushFollow(FOLLOW_1);
            ruleBinding();

            state._fsp--;

             after(grammarAccess.getBindingRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBinding"


    // $ANTLR start "ruleBinding"
    // InternalHale.g:137:1: ruleBinding : ( ( rule__Binding__Group__0 ) ) ;
    public final void ruleBinding() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:141:2: ( ( ( rule__Binding__Group__0 ) ) )
            // InternalHale.g:142:2: ( ( rule__Binding__Group__0 ) )
            {
            // InternalHale.g:142:2: ( ( rule__Binding__Group__0 ) )
            // InternalHale.g:143:3: ( rule__Binding__Group__0 )
            {
             before(grammarAccess.getBindingAccess().getGroup()); 
            // InternalHale.g:144:3: ( rule__Binding__Group__0 )
            // InternalHale.g:144:4: rule__Binding__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Binding__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBindingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBinding"


    // $ANTLR start "entryRuleBindingReference"
    // InternalHale.g:153:1: entryRuleBindingReference : ruleBindingReference EOF ;
    public final void entryRuleBindingReference() throws RecognitionException {
        try {
            // InternalHale.g:154:1: ( ruleBindingReference EOF )
            // InternalHale.g:155:1: ruleBindingReference EOF
            {
             before(grammarAccess.getBindingReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleBindingReference();

            state._fsp--;

             after(grammarAccess.getBindingReferenceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBindingReference"


    // $ANTLR start "ruleBindingReference"
    // InternalHale.g:162:1: ruleBindingReference : ( ( rule__BindingReference__BindingAssignment ) ) ;
    public final void ruleBindingReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:166:2: ( ( ( rule__BindingReference__BindingAssignment ) ) )
            // InternalHale.g:167:2: ( ( rule__BindingReference__BindingAssignment ) )
            {
            // InternalHale.g:167:2: ( ( rule__BindingReference__BindingAssignment ) )
            // InternalHale.g:168:3: ( rule__BindingReference__BindingAssignment )
            {
             before(grammarAccess.getBindingReferenceAccess().getBindingAssignment()); 
            // InternalHale.g:169:3: ( rule__BindingReference__BindingAssignment )
            // InternalHale.g:169:4: rule__BindingReference__BindingAssignment
            {
            pushFollow(FOLLOW_2);
            rule__BindingReference__BindingAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBindingReferenceAccess().getBindingAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBindingReference"


    // $ANTLR start "entryRuleAssignment"
    // InternalHale.g:178:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // InternalHale.g:179:1: ( ruleAssignment EOF )
            // InternalHale.g:180:1: ruleAssignment EOF
            {
             before(grammarAccess.getAssignmentRule()); 
            pushFollow(FOLLOW_1);
            ruleAssignment();

            state._fsp--;

             after(grammarAccess.getAssignmentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalHale.g:187:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:191:2: ( ( ( rule__Assignment__Group__0 ) ) )
            // InternalHale.g:192:2: ( ( rule__Assignment__Group__0 ) )
            {
            // InternalHale.g:192:2: ( ( rule__Assignment__Group__0 ) )
            // InternalHale.g:193:3: ( rule__Assignment__Group__0 )
            {
             before(grammarAccess.getAssignmentAccess().getGroup()); 
            // InternalHale.g:194:3: ( rule__Assignment__Group__0 )
            // InternalHale.g:194:4: rule__Assignment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleExpression"
    // InternalHale.g:203:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalHale.g:204:1: ( ruleExpression EOF )
            // InternalHale.g:205:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalHale.g:212:1: ruleExpression : ( ruleExpression7 ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:216:2: ( ( ruleExpression7 ) )
            // InternalHale.g:217:2: ( ruleExpression7 )
            {
            // InternalHale.g:217:2: ( ruleExpression7 )
            // InternalHale.g:218:3: ruleExpression7
            {
             before(grammarAccess.getExpressionAccess().getExpression7ParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleExpression7();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getExpression7ParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleExpression7"
    // InternalHale.g:228:1: entryRuleExpression7 : ruleExpression7 EOF ;
    public final void entryRuleExpression7() throws RecognitionException {
        try {
            // InternalHale.g:229:1: ( ruleExpression7 EOF )
            // InternalHale.g:230:1: ruleExpression7 EOF
            {
             before(grammarAccess.getExpression7Rule()); 
            pushFollow(FOLLOW_1);
            ruleExpression7();

            state._fsp--;

             after(grammarAccess.getExpression7Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression7"


    // $ANTLR start "ruleExpression7"
    // InternalHale.g:237:1: ruleExpression7 : ( ( rule__Expression7__Group__0 ) ) ;
    public final void ruleExpression7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:241:2: ( ( ( rule__Expression7__Group__0 ) ) )
            // InternalHale.g:242:2: ( ( rule__Expression7__Group__0 ) )
            {
            // InternalHale.g:242:2: ( ( rule__Expression7__Group__0 ) )
            // InternalHale.g:243:3: ( rule__Expression7__Group__0 )
            {
             before(grammarAccess.getExpression7Access().getGroup()); 
            // InternalHale.g:244:3: ( rule__Expression7__Group__0 )
            // InternalHale.g:244:4: rule__Expression7__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression7__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpression7Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression7"


    // $ANTLR start "entryRuleExpression6"
    // InternalHale.g:253:1: entryRuleExpression6 : ruleExpression6 EOF ;
    public final void entryRuleExpression6() throws RecognitionException {
        try {
            // InternalHale.g:254:1: ( ruleExpression6 EOF )
            // InternalHale.g:255:1: ruleExpression6 EOF
            {
             before(grammarAccess.getExpression6Rule()); 
            pushFollow(FOLLOW_1);
            ruleExpression6();

            state._fsp--;

             after(grammarAccess.getExpression6Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression6"


    // $ANTLR start "ruleExpression6"
    // InternalHale.g:262:1: ruleExpression6 : ( ( rule__Expression6__Group__0 ) ) ;
    public final void ruleExpression6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:266:2: ( ( ( rule__Expression6__Group__0 ) ) )
            // InternalHale.g:267:2: ( ( rule__Expression6__Group__0 ) )
            {
            // InternalHale.g:267:2: ( ( rule__Expression6__Group__0 ) )
            // InternalHale.g:268:3: ( rule__Expression6__Group__0 )
            {
             before(grammarAccess.getExpression6Access().getGroup()); 
            // InternalHale.g:269:3: ( rule__Expression6__Group__0 )
            // InternalHale.g:269:4: rule__Expression6__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression6__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpression6Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression6"


    // $ANTLR start "entryRuleExpression5"
    // InternalHale.g:278:1: entryRuleExpression5 : ruleExpression5 EOF ;
    public final void entryRuleExpression5() throws RecognitionException {
        try {
            // InternalHale.g:279:1: ( ruleExpression5 EOF )
            // InternalHale.g:280:1: ruleExpression5 EOF
            {
             before(grammarAccess.getExpression5Rule()); 
            pushFollow(FOLLOW_1);
            ruleExpression5();

            state._fsp--;

             after(grammarAccess.getExpression5Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression5"


    // $ANTLR start "ruleExpression5"
    // InternalHale.g:287:1: ruleExpression5 : ( ( rule__Expression5__Group__0 ) ) ;
    public final void ruleExpression5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:291:2: ( ( ( rule__Expression5__Group__0 ) ) )
            // InternalHale.g:292:2: ( ( rule__Expression5__Group__0 ) )
            {
            // InternalHale.g:292:2: ( ( rule__Expression5__Group__0 ) )
            // InternalHale.g:293:3: ( rule__Expression5__Group__0 )
            {
             before(grammarAccess.getExpression5Access().getGroup()); 
            // InternalHale.g:294:3: ( rule__Expression5__Group__0 )
            // InternalHale.g:294:4: rule__Expression5__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression5__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpression5Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression5"


    // $ANTLR start "entryRuleExpression4"
    // InternalHale.g:303:1: entryRuleExpression4 : ruleExpression4 EOF ;
    public final void entryRuleExpression4() throws RecognitionException {
        try {
            // InternalHale.g:304:1: ( ruleExpression4 EOF )
            // InternalHale.g:305:1: ruleExpression4 EOF
            {
             before(grammarAccess.getExpression4Rule()); 
            pushFollow(FOLLOW_1);
            ruleExpression4();

            state._fsp--;

             after(grammarAccess.getExpression4Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression4"


    // $ANTLR start "ruleExpression4"
    // InternalHale.g:312:1: ruleExpression4 : ( ( rule__Expression4__Group__0 ) ) ;
    public final void ruleExpression4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:316:2: ( ( ( rule__Expression4__Group__0 ) ) )
            // InternalHale.g:317:2: ( ( rule__Expression4__Group__0 ) )
            {
            // InternalHale.g:317:2: ( ( rule__Expression4__Group__0 ) )
            // InternalHale.g:318:3: ( rule__Expression4__Group__0 )
            {
             before(grammarAccess.getExpression4Access().getGroup()); 
            // InternalHale.g:319:3: ( rule__Expression4__Group__0 )
            // InternalHale.g:319:4: rule__Expression4__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression4__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpression4Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression4"


    // $ANTLR start "entryRuleExpression3"
    // InternalHale.g:328:1: entryRuleExpression3 : ruleExpression3 EOF ;
    public final void entryRuleExpression3() throws RecognitionException {
        try {
            // InternalHale.g:329:1: ( ruleExpression3 EOF )
            // InternalHale.g:330:1: ruleExpression3 EOF
            {
             before(grammarAccess.getExpression3Rule()); 
            pushFollow(FOLLOW_1);
            ruleExpression3();

            state._fsp--;

             after(grammarAccess.getExpression3Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression3"


    // $ANTLR start "ruleExpression3"
    // InternalHale.g:337:1: ruleExpression3 : ( ( rule__Expression3__Group__0 ) ) ;
    public final void ruleExpression3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:341:2: ( ( ( rule__Expression3__Group__0 ) ) )
            // InternalHale.g:342:2: ( ( rule__Expression3__Group__0 ) )
            {
            // InternalHale.g:342:2: ( ( rule__Expression3__Group__0 ) )
            // InternalHale.g:343:3: ( rule__Expression3__Group__0 )
            {
             before(grammarAccess.getExpression3Access().getGroup()); 
            // InternalHale.g:344:3: ( rule__Expression3__Group__0 )
            // InternalHale.g:344:4: rule__Expression3__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression3__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpression3Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression3"


    // $ANTLR start "entryRuleExpression2"
    // InternalHale.g:353:1: entryRuleExpression2 : ruleExpression2 EOF ;
    public final void entryRuleExpression2() throws RecognitionException {
        try {
            // InternalHale.g:354:1: ( ruleExpression2 EOF )
            // InternalHale.g:355:1: ruleExpression2 EOF
            {
             before(grammarAccess.getExpression2Rule()); 
            pushFollow(FOLLOW_1);
            ruleExpression2();

            state._fsp--;

             after(grammarAccess.getExpression2Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression2"


    // $ANTLR start "ruleExpression2"
    // InternalHale.g:362:1: ruleExpression2 : ( ( rule__Expression2__Group__0 ) ) ;
    public final void ruleExpression2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:366:2: ( ( ( rule__Expression2__Group__0 ) ) )
            // InternalHale.g:367:2: ( ( rule__Expression2__Group__0 ) )
            {
            // InternalHale.g:367:2: ( ( rule__Expression2__Group__0 ) )
            // InternalHale.g:368:3: ( rule__Expression2__Group__0 )
            {
             before(grammarAccess.getExpression2Access().getGroup()); 
            // InternalHale.g:369:3: ( rule__Expression2__Group__0 )
            // InternalHale.g:369:4: rule__Expression2__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression2__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpression2Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression2"


    // $ANTLR start "entryRuleExpression1"
    // InternalHale.g:378:1: entryRuleExpression1 : ruleExpression1 EOF ;
    public final void entryRuleExpression1() throws RecognitionException {
        try {
            // InternalHale.g:379:1: ( ruleExpression1 EOF )
            // InternalHale.g:380:1: ruleExpression1 EOF
            {
             before(grammarAccess.getExpression1Rule()); 
            pushFollow(FOLLOW_1);
            ruleExpression1();

            state._fsp--;

             after(grammarAccess.getExpression1Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression1"


    // $ANTLR start "ruleExpression1"
    // InternalHale.g:387:1: ruleExpression1 : ( ( rule__Expression1__Alternatives ) ) ;
    public final void ruleExpression1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:391:2: ( ( ( rule__Expression1__Alternatives ) ) )
            // InternalHale.g:392:2: ( ( rule__Expression1__Alternatives ) )
            {
            // InternalHale.g:392:2: ( ( rule__Expression1__Alternatives ) )
            // InternalHale.g:393:3: ( rule__Expression1__Alternatives )
            {
             before(grammarAccess.getExpression1Access().getAlternatives()); 
            // InternalHale.g:394:3: ( rule__Expression1__Alternatives )
            // InternalHale.g:394:4: rule__Expression1__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Expression1__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpression1Access().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression1"


    // $ANTLR start "entryRulePrimary"
    // InternalHale.g:403:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalHale.g:404:1: ( rulePrimary EOF )
            // InternalHale.g:405:1: rulePrimary EOF
            {
             before(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalHale.g:412:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:416:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalHale.g:417:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalHale.g:417:2: ( ( rule__Primary__Alternatives ) )
            // InternalHale.g:418:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalHale.g:419:3: ( rule__Primary__Alternatives )
            // InternalHale.g:419:4: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleLiteral"
    // InternalHale.g:428:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // InternalHale.g:429:1: ( ruleLiteral EOF )
            // InternalHale.g:430:1: ruleLiteral EOF
            {
             before(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalHale.g:437:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:441:2: ( ( ( rule__Literal__Alternatives ) ) )
            // InternalHale.g:442:2: ( ( rule__Literal__Alternatives ) )
            {
            // InternalHale.g:442:2: ( ( rule__Literal__Alternatives ) )
            // InternalHale.g:443:3: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // InternalHale.g:444:3: ( rule__Literal__Alternatives )
            // InternalHale.g:444:4: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Literal__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleNumberLiteral"
    // InternalHale.g:453:1: entryRuleNumberLiteral : ruleNumberLiteral EOF ;
    public final void entryRuleNumberLiteral() throws RecognitionException {
        try {
            // InternalHale.g:454:1: ( ruleNumberLiteral EOF )
            // InternalHale.g:455:1: ruleNumberLiteral EOF
            {
             before(grammarAccess.getNumberLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleNumberLiteral();

            state._fsp--;

             after(grammarAccess.getNumberLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumberLiteral"


    // $ANTLR start "ruleNumberLiteral"
    // InternalHale.g:462:1: ruleNumberLiteral : ( ( rule__NumberLiteral__ValueAssignment ) ) ;
    public final void ruleNumberLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:466:2: ( ( ( rule__NumberLiteral__ValueAssignment ) ) )
            // InternalHale.g:467:2: ( ( rule__NumberLiteral__ValueAssignment ) )
            {
            // InternalHale.g:467:2: ( ( rule__NumberLiteral__ValueAssignment ) )
            // InternalHale.g:468:3: ( rule__NumberLiteral__ValueAssignment )
            {
             before(grammarAccess.getNumberLiteralAccess().getValueAssignment()); 
            // InternalHale.g:469:3: ( rule__NumberLiteral__ValueAssignment )
            // InternalHale.g:469:4: rule__NumberLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__NumberLiteral__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNumberLiteralAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumberLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalHale.g:478:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // InternalHale.g:479:1: ( ruleStringLiteral EOF )
            // InternalHale.g:480:1: ruleStringLiteral EOF
            {
             before(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleStringLiteral();

            state._fsp--;

             after(grammarAccess.getStringLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // InternalHale.g:487:1: ruleStringLiteral : ( ( rule__StringLiteral__ValueAssignment ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:491:2: ( ( ( rule__StringLiteral__ValueAssignment ) ) )
            // InternalHale.g:492:2: ( ( rule__StringLiteral__ValueAssignment ) )
            {
            // InternalHale.g:492:2: ( ( rule__StringLiteral__ValueAssignment ) )
            // InternalHale.g:493:3: ( rule__StringLiteral__ValueAssignment )
            {
             before(grammarAccess.getStringLiteralAccess().getValueAssignment()); 
            // InternalHale.g:494:3: ( rule__StringLiteral__ValueAssignment )
            // InternalHale.g:494:4: rule__StringLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__StringLiteral__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringLiteralAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "rule__Statement__Alternatives_0"
    // InternalHale.g:502:1: rule__Statement__Alternatives_0 : ( ( rulePrint ) | ( ruleBinding ) | ( ruleAssignment ) | ( ruleExpression ) );
    public final void rule__Statement__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:506:1: ( ( rulePrint ) | ( ruleBinding ) | ( ruleAssignment ) | ( ruleExpression ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt1=1;
                }
                break;
            case 13:
                {
                alt1=2;
                }
                break;
            case RULE_ID:
                {
                int LA1_3 = input.LA(2);

                if ( (LA1_3==11||(LA1_3>=15 && LA1_3<=28)) ) {
                    alt1=4;
                }
                else if ( (LA1_3==14) ) {
                    alt1=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
            case RULE_STRING:
            case 24:
            case 29:
            case 30:
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
                    // InternalHale.g:507:2: ( rulePrint )
                    {
                    // InternalHale.g:507:2: ( rulePrint )
                    // InternalHale.g:508:3: rulePrint
                    {
                     before(grammarAccess.getStatementAccess().getPrintParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    rulePrint();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getPrintParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHale.g:513:2: ( ruleBinding )
                    {
                    // InternalHale.g:513:2: ( ruleBinding )
                    // InternalHale.g:514:3: ruleBinding
                    {
                     before(grammarAccess.getStatementAccess().getBindingParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleBinding();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getBindingParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHale.g:519:2: ( ruleAssignment )
                    {
                    // InternalHale.g:519:2: ( ruleAssignment )
                    // InternalHale.g:520:3: ruleAssignment
                    {
                     before(grammarAccess.getStatementAccess().getAssignmentParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleAssignment();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getAssignmentParserRuleCall_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalHale.g:525:2: ( ruleExpression )
                    {
                    // InternalHale.g:525:2: ( ruleExpression )
                    // InternalHale.g:526:3: ruleExpression
                    {
                     before(grammarAccess.getStatementAccess().getExpressionParserRuleCall_0_3()); 
                    pushFollow(FOLLOW_2);
                    ruleExpression();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getExpressionParserRuleCall_0_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Alternatives_0"


    // $ANTLR start "rule__Expression7__Alternatives_1"
    // InternalHale.g:535:1: rule__Expression7__Alternatives_1 : ( ( ( rule__Expression7__Group_1_0__0 ) ) | ( ( rule__Expression7__Group_1_1__0 ) ) );
    public final void rule__Expression7__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:539:1: ( ( ( rule__Expression7__Group_1_0__0 ) ) | ( ( rule__Expression7__Group_1_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            else if ( (LA2_0==16) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalHale.g:540:2: ( ( rule__Expression7__Group_1_0__0 ) )
                    {
                    // InternalHale.g:540:2: ( ( rule__Expression7__Group_1_0__0 ) )
                    // InternalHale.g:541:3: ( rule__Expression7__Group_1_0__0 )
                    {
                     before(grammarAccess.getExpression7Access().getGroup_1_0()); 
                    // InternalHale.g:542:3: ( rule__Expression7__Group_1_0__0 )
                    // InternalHale.g:542:4: rule__Expression7__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression7__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpression7Access().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHale.g:546:2: ( ( rule__Expression7__Group_1_1__0 ) )
                    {
                    // InternalHale.g:546:2: ( ( rule__Expression7__Group_1_1__0 ) )
                    // InternalHale.g:547:3: ( rule__Expression7__Group_1_1__0 )
                    {
                     before(grammarAccess.getExpression7Access().getGroup_1_1()); 
                    // InternalHale.g:548:3: ( rule__Expression7__Group_1_1__0 )
                    // InternalHale.g:548:4: rule__Expression7__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression7__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpression7Access().getGroup_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression7__Alternatives_1"


    // $ANTLR start "rule__Expression6__Alternatives_1"
    // InternalHale.g:556:1: rule__Expression6__Alternatives_1 : ( ( ( rule__Expression6__Group_1_0__0 ) ) | ( ( rule__Expression6__Group_1_1__0 ) ) );
    public final void rule__Expression6__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:560:1: ( ( ( rule__Expression6__Group_1_0__0 ) ) | ( ( rule__Expression6__Group_1_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            else if ( (LA3_0==18) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalHale.g:561:2: ( ( rule__Expression6__Group_1_0__0 ) )
                    {
                    // InternalHale.g:561:2: ( ( rule__Expression6__Group_1_0__0 ) )
                    // InternalHale.g:562:3: ( rule__Expression6__Group_1_0__0 )
                    {
                     before(grammarAccess.getExpression6Access().getGroup_1_0()); 
                    // InternalHale.g:563:3: ( rule__Expression6__Group_1_0__0 )
                    // InternalHale.g:563:4: rule__Expression6__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression6__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpression6Access().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHale.g:567:2: ( ( rule__Expression6__Group_1_1__0 ) )
                    {
                    // InternalHale.g:567:2: ( ( rule__Expression6__Group_1_1__0 ) )
                    // InternalHale.g:568:3: ( rule__Expression6__Group_1_1__0 )
                    {
                     before(grammarAccess.getExpression6Access().getGroup_1_1()); 
                    // InternalHale.g:569:3: ( rule__Expression6__Group_1_1__0 )
                    // InternalHale.g:569:4: rule__Expression6__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression6__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpression6Access().getGroup_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression6__Alternatives_1"


    // $ANTLR start "rule__Expression5__Alternatives_1"
    // InternalHale.g:577:1: rule__Expression5__Alternatives_1 : ( ( ( rule__Expression5__Group_1_0__0 ) ) | ( ( rule__Expression5__Group_1_1__0 ) ) | ( ( rule__Expression5__Group_1_2__0 ) ) | ( ( rule__Expression5__Group_1_3__0 ) ) );
    public final void rule__Expression5__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:581:1: ( ( ( rule__Expression5__Group_1_0__0 ) ) | ( ( rule__Expression5__Group_1_1__0 ) ) | ( ( rule__Expression5__Group_1_2__0 ) ) | ( ( rule__Expression5__Group_1_3__0 ) ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt4=1;
                }
                break;
            case 20:
                {
                alt4=2;
                }
                break;
            case 21:
                {
                alt4=3;
                }
                break;
            case 22:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalHale.g:582:2: ( ( rule__Expression5__Group_1_0__0 ) )
                    {
                    // InternalHale.g:582:2: ( ( rule__Expression5__Group_1_0__0 ) )
                    // InternalHale.g:583:3: ( rule__Expression5__Group_1_0__0 )
                    {
                     before(grammarAccess.getExpression5Access().getGroup_1_0()); 
                    // InternalHale.g:584:3: ( rule__Expression5__Group_1_0__0 )
                    // InternalHale.g:584:4: rule__Expression5__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression5__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpression5Access().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHale.g:588:2: ( ( rule__Expression5__Group_1_1__0 ) )
                    {
                    // InternalHale.g:588:2: ( ( rule__Expression5__Group_1_1__0 ) )
                    // InternalHale.g:589:3: ( rule__Expression5__Group_1_1__0 )
                    {
                     before(grammarAccess.getExpression5Access().getGroup_1_1()); 
                    // InternalHale.g:590:3: ( rule__Expression5__Group_1_1__0 )
                    // InternalHale.g:590:4: rule__Expression5__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression5__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpression5Access().getGroup_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHale.g:594:2: ( ( rule__Expression5__Group_1_2__0 ) )
                    {
                    // InternalHale.g:594:2: ( ( rule__Expression5__Group_1_2__0 ) )
                    // InternalHale.g:595:3: ( rule__Expression5__Group_1_2__0 )
                    {
                     before(grammarAccess.getExpression5Access().getGroup_1_2()); 
                    // InternalHale.g:596:3: ( rule__Expression5__Group_1_2__0 )
                    // InternalHale.g:596:4: rule__Expression5__Group_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression5__Group_1_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpression5Access().getGroup_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalHale.g:600:2: ( ( rule__Expression5__Group_1_3__0 ) )
                    {
                    // InternalHale.g:600:2: ( ( rule__Expression5__Group_1_3__0 ) )
                    // InternalHale.g:601:3: ( rule__Expression5__Group_1_3__0 )
                    {
                     before(grammarAccess.getExpression5Access().getGroup_1_3()); 
                    // InternalHale.g:602:3: ( rule__Expression5__Group_1_3__0 )
                    // InternalHale.g:602:4: rule__Expression5__Group_1_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression5__Group_1_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpression5Access().getGroup_1_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression5__Alternatives_1"


    // $ANTLR start "rule__Expression4__Alternatives_1"
    // InternalHale.g:610:1: rule__Expression4__Alternatives_1 : ( ( ( rule__Expression4__Group_1_0__0 ) ) | ( ( rule__Expression4__Group_1_1__0 ) ) );
    public final void rule__Expression4__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:614:1: ( ( ( rule__Expression4__Group_1_0__0 ) ) | ( ( rule__Expression4__Group_1_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            else if ( (LA5_0==24) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalHale.g:615:2: ( ( rule__Expression4__Group_1_0__0 ) )
                    {
                    // InternalHale.g:615:2: ( ( rule__Expression4__Group_1_0__0 ) )
                    // InternalHale.g:616:3: ( rule__Expression4__Group_1_0__0 )
                    {
                     before(grammarAccess.getExpression4Access().getGroup_1_0()); 
                    // InternalHale.g:617:3: ( rule__Expression4__Group_1_0__0 )
                    // InternalHale.g:617:4: rule__Expression4__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression4__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpression4Access().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHale.g:621:2: ( ( rule__Expression4__Group_1_1__0 ) )
                    {
                    // InternalHale.g:621:2: ( ( rule__Expression4__Group_1_1__0 ) )
                    // InternalHale.g:622:3: ( rule__Expression4__Group_1_1__0 )
                    {
                     before(grammarAccess.getExpression4Access().getGroup_1_1()); 
                    // InternalHale.g:623:3: ( rule__Expression4__Group_1_1__0 )
                    // InternalHale.g:623:4: rule__Expression4__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression4__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpression4Access().getGroup_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression4__Alternatives_1"


    // $ANTLR start "rule__Expression3__Alternatives_1"
    // InternalHale.g:631:1: rule__Expression3__Alternatives_1 : ( ( ( rule__Expression3__Group_1_0__0 ) ) | ( ( rule__Expression3__Group_1_1__0 ) ) | ( ( rule__Expression3__Group_1_2__0 ) ) );
    public final void rule__Expression3__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:635:1: ( ( ( rule__Expression3__Group_1_0__0 ) ) | ( ( rule__Expression3__Group_1_1__0 ) ) | ( ( rule__Expression3__Group_1_2__0 ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt6=1;
                }
                break;
            case 26:
                {
                alt6=2;
                }
                break;
            case 27:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalHale.g:636:2: ( ( rule__Expression3__Group_1_0__0 ) )
                    {
                    // InternalHale.g:636:2: ( ( rule__Expression3__Group_1_0__0 ) )
                    // InternalHale.g:637:3: ( rule__Expression3__Group_1_0__0 )
                    {
                     before(grammarAccess.getExpression3Access().getGroup_1_0()); 
                    // InternalHale.g:638:3: ( rule__Expression3__Group_1_0__0 )
                    // InternalHale.g:638:4: rule__Expression3__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression3__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpression3Access().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHale.g:642:2: ( ( rule__Expression3__Group_1_1__0 ) )
                    {
                    // InternalHale.g:642:2: ( ( rule__Expression3__Group_1_1__0 ) )
                    // InternalHale.g:643:3: ( rule__Expression3__Group_1_1__0 )
                    {
                     before(grammarAccess.getExpression3Access().getGroup_1_1()); 
                    // InternalHale.g:644:3: ( rule__Expression3__Group_1_1__0 )
                    // InternalHale.g:644:4: rule__Expression3__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression3__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpression3Access().getGroup_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHale.g:648:2: ( ( rule__Expression3__Group_1_2__0 ) )
                    {
                    // InternalHale.g:648:2: ( ( rule__Expression3__Group_1_2__0 ) )
                    // InternalHale.g:649:3: ( rule__Expression3__Group_1_2__0 )
                    {
                     before(grammarAccess.getExpression3Access().getGroup_1_2()); 
                    // InternalHale.g:650:3: ( rule__Expression3__Group_1_2__0 )
                    // InternalHale.g:650:4: rule__Expression3__Group_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression3__Group_1_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpression3Access().getGroup_1_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression3__Alternatives_1"


    // $ANTLR start "rule__Expression1__Alternatives"
    // InternalHale.g:658:1: rule__Expression1__Alternatives : ( ( ( rule__Expression1__Group_0__0 ) ) | ( ( rule__Expression1__Group_1__0 ) ) | ( rulePrimary ) );
    public final void rule__Expression1__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:662:1: ( ( ( rule__Expression1__Group_0__0 ) ) | ( ( rule__Expression1__Group_1__0 ) ) | ( rulePrimary ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt7=1;
                }
                break;
            case 29:
                {
                alt7=2;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case RULE_STRING:
            case 30:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalHale.g:663:2: ( ( rule__Expression1__Group_0__0 ) )
                    {
                    // InternalHale.g:663:2: ( ( rule__Expression1__Group_0__0 ) )
                    // InternalHale.g:664:3: ( rule__Expression1__Group_0__0 )
                    {
                     before(grammarAccess.getExpression1Access().getGroup_0()); 
                    // InternalHale.g:665:3: ( rule__Expression1__Group_0__0 )
                    // InternalHale.g:665:4: rule__Expression1__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression1__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpression1Access().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHale.g:669:2: ( ( rule__Expression1__Group_1__0 ) )
                    {
                    // InternalHale.g:669:2: ( ( rule__Expression1__Group_1__0 ) )
                    // InternalHale.g:670:3: ( rule__Expression1__Group_1__0 )
                    {
                     before(grammarAccess.getExpression1Access().getGroup_1()); 
                    // InternalHale.g:671:3: ( rule__Expression1__Group_1__0 )
                    // InternalHale.g:671:4: rule__Expression1__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression1__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpression1Access().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHale.g:675:2: ( rulePrimary )
                    {
                    // InternalHale.g:675:2: ( rulePrimary )
                    // InternalHale.g:676:3: rulePrimary
                    {
                     before(grammarAccess.getExpression1Access().getPrimaryParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    rulePrimary();

                    state._fsp--;

                     after(grammarAccess.getExpression1Access().getPrimaryParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression1__Alternatives"


    // $ANTLR start "rule__Primary__Alternatives"
    // InternalHale.g:685:1: rule__Primary__Alternatives : ( ( ruleLiteral ) | ( ruleBindingReference ) | ( ( rule__Primary__Group_2__0 ) ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:689:1: ( ( ruleLiteral ) | ( ruleBindingReference ) | ( ( rule__Primary__Group_2__0 ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_STRING:
                {
                alt8=1;
                }
                break;
            case RULE_ID:
                {
                alt8=2;
                }
                break;
            case 30:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalHale.g:690:2: ( ruleLiteral )
                    {
                    // InternalHale.g:690:2: ( ruleLiteral )
                    // InternalHale.g:691:3: ruleLiteral
                    {
                     before(grammarAccess.getPrimaryAccess().getLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLiteral();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHale.g:696:2: ( ruleBindingReference )
                    {
                    // InternalHale.g:696:2: ( ruleBindingReference )
                    // InternalHale.g:697:3: ruleBindingReference
                    {
                     before(grammarAccess.getPrimaryAccess().getBindingReferenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleBindingReference();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getBindingReferenceParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHale.g:702:2: ( ( rule__Primary__Group_2__0 ) )
                    {
                    // InternalHale.g:702:2: ( ( rule__Primary__Group_2__0 ) )
                    // InternalHale.g:703:3: ( rule__Primary__Group_2__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_2()); 
                    // InternalHale.g:704:3: ( rule__Primary__Group_2__0 )
                    // InternalHale.g:704:4: rule__Primary__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Alternatives"


    // $ANTLR start "rule__Literal__Alternatives"
    // InternalHale.g:712:1: rule__Literal__Alternatives : ( ( ruleNumberLiteral ) | ( ruleStringLiteral ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:716:1: ( ( ruleNumberLiteral ) | ( ruleStringLiteral ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_STRING) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalHale.g:717:2: ( ruleNumberLiteral )
                    {
                    // InternalHale.g:717:2: ( ruleNumberLiteral )
                    // InternalHale.g:718:3: ruleNumberLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getNumberLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNumberLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getNumberLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHale.g:723:2: ( ruleStringLiteral )
                    {
                    // InternalHale.g:723:2: ( ruleStringLiteral )
                    // InternalHale.g:724:3: ruleStringLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleStringLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Alternatives"


    // $ANTLR start "rule__Hale__Group__0"
    // InternalHale.g:733:1: rule__Hale__Group__0 : rule__Hale__Group__0__Impl rule__Hale__Group__1 ;
    public final void rule__Hale__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:737:1: ( rule__Hale__Group__0__Impl rule__Hale__Group__1 )
            // InternalHale.g:738:2: rule__Hale__Group__0__Impl rule__Hale__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Hale__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hale__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hale__Group__0"


    // $ANTLR start "rule__Hale__Group__0__Impl"
    // InternalHale.g:745:1: rule__Hale__Group__0__Impl : ( () ) ;
    public final void rule__Hale__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:749:1: ( ( () ) )
            // InternalHale.g:750:1: ( () )
            {
            // InternalHale.g:750:1: ( () )
            // InternalHale.g:751:2: ()
            {
             before(grammarAccess.getHaleAccess().getHaleAction_0()); 
            // InternalHale.g:752:2: ()
            // InternalHale.g:752:3: 
            {
            }

             after(grammarAccess.getHaleAccess().getHaleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hale__Group__0__Impl"


    // $ANTLR start "rule__Hale__Group__1"
    // InternalHale.g:760:1: rule__Hale__Group__1 : rule__Hale__Group__1__Impl ;
    public final void rule__Hale__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:764:1: ( rule__Hale__Group__1__Impl )
            // InternalHale.g:765:2: rule__Hale__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Hale__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hale__Group__1"


    // $ANTLR start "rule__Hale__Group__1__Impl"
    // InternalHale.g:771:1: rule__Hale__Group__1__Impl : ( ( rule__Hale__StatementsAssignment_1 )* ) ;
    public final void rule__Hale__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:775:1: ( ( ( rule__Hale__StatementsAssignment_1 )* ) )
            // InternalHale.g:776:1: ( ( rule__Hale__StatementsAssignment_1 )* )
            {
            // InternalHale.g:776:1: ( ( rule__Hale__StatementsAssignment_1 )* )
            // InternalHale.g:777:2: ( rule__Hale__StatementsAssignment_1 )*
            {
             before(grammarAccess.getHaleAccess().getStatementsAssignment_1()); 
            // InternalHale.g:778:2: ( rule__Hale__StatementsAssignment_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_STRING)||(LA10_0>=12 && LA10_0<=13)||LA10_0==24||(LA10_0>=29 && LA10_0<=30)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalHale.g:778:3: rule__Hale__StatementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Hale__StatementsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getHaleAccess().getStatementsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hale__Group__1__Impl"


    // $ANTLR start "rule__Statement__Group__0"
    // InternalHale.g:787:1: rule__Statement__Group__0 : rule__Statement__Group__0__Impl rule__Statement__Group__1 ;
    public final void rule__Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:791:1: ( rule__Statement__Group__0__Impl rule__Statement__Group__1 )
            // InternalHale.g:792:2: rule__Statement__Group__0__Impl rule__Statement__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Statement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__0"


    // $ANTLR start "rule__Statement__Group__0__Impl"
    // InternalHale.g:799:1: rule__Statement__Group__0__Impl : ( ( rule__Statement__Alternatives_0 ) ) ;
    public final void rule__Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:803:1: ( ( ( rule__Statement__Alternatives_0 ) ) )
            // InternalHale.g:804:1: ( ( rule__Statement__Alternatives_0 ) )
            {
            // InternalHale.g:804:1: ( ( rule__Statement__Alternatives_0 ) )
            // InternalHale.g:805:2: ( rule__Statement__Alternatives_0 )
            {
             before(grammarAccess.getStatementAccess().getAlternatives_0()); 
            // InternalHale.g:806:2: ( rule__Statement__Alternatives_0 )
            // InternalHale.g:806:3: rule__Statement__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__0__Impl"


    // $ANTLR start "rule__Statement__Group__1"
    // InternalHale.g:814:1: rule__Statement__Group__1 : rule__Statement__Group__1__Impl ;
    public final void rule__Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:818:1: ( rule__Statement__Group__1__Impl )
            // InternalHale.g:819:2: rule__Statement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__1"


    // $ANTLR start "rule__Statement__Group__1__Impl"
    // InternalHale.g:825:1: rule__Statement__Group__1__Impl : ( ';' ) ;
    public final void rule__Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:829:1: ( ( ';' ) )
            // InternalHale.g:830:1: ( ';' )
            {
            // InternalHale.g:830:1: ( ';' )
            // InternalHale.g:831:2: ';'
            {
             before(grammarAccess.getStatementAccess().getSemicolonKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getSemicolonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__1__Impl"


    // $ANTLR start "rule__Print__Group__0"
    // InternalHale.g:841:1: rule__Print__Group__0 : rule__Print__Group__0__Impl rule__Print__Group__1 ;
    public final void rule__Print__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:845:1: ( rule__Print__Group__0__Impl rule__Print__Group__1 )
            // InternalHale.g:846:2: rule__Print__Group__0__Impl rule__Print__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Print__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Print__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Print__Group__0"


    // $ANTLR start "rule__Print__Group__0__Impl"
    // InternalHale.g:853:1: rule__Print__Group__0__Impl : ( 'print' ) ;
    public final void rule__Print__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:857:1: ( ( 'print' ) )
            // InternalHale.g:858:1: ( 'print' )
            {
            // InternalHale.g:858:1: ( 'print' )
            // InternalHale.g:859:2: 'print'
            {
             before(grammarAccess.getPrintAccess().getPrintKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getPrintAccess().getPrintKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Print__Group__0__Impl"


    // $ANTLR start "rule__Print__Group__1"
    // InternalHale.g:868:1: rule__Print__Group__1 : rule__Print__Group__1__Impl ;
    public final void rule__Print__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:872:1: ( rule__Print__Group__1__Impl )
            // InternalHale.g:873:2: rule__Print__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Print__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Print__Group__1"


    // $ANTLR start "rule__Print__Group__1__Impl"
    // InternalHale.g:879:1: rule__Print__Group__1__Impl : ( ( rule__Print__ValueAssignment_1 ) ) ;
    public final void rule__Print__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:883:1: ( ( ( rule__Print__ValueAssignment_1 ) ) )
            // InternalHale.g:884:1: ( ( rule__Print__ValueAssignment_1 ) )
            {
            // InternalHale.g:884:1: ( ( rule__Print__ValueAssignment_1 ) )
            // InternalHale.g:885:2: ( rule__Print__ValueAssignment_1 )
            {
             before(grammarAccess.getPrintAccess().getValueAssignment_1()); 
            // InternalHale.g:886:2: ( rule__Print__ValueAssignment_1 )
            // InternalHale.g:886:3: rule__Print__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Print__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPrintAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Print__Group__1__Impl"


    // $ANTLR start "rule__Binding__Group__0"
    // InternalHale.g:895:1: rule__Binding__Group__0 : rule__Binding__Group__0__Impl rule__Binding__Group__1 ;
    public final void rule__Binding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:899:1: ( rule__Binding__Group__0__Impl rule__Binding__Group__1 )
            // InternalHale.g:900:2: rule__Binding__Group__0__Impl rule__Binding__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Binding__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binding__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__0"


    // $ANTLR start "rule__Binding__Group__0__Impl"
    // InternalHale.g:907:1: rule__Binding__Group__0__Impl : ( 'let' ) ;
    public final void rule__Binding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:911:1: ( ( 'let' ) )
            // InternalHale.g:912:1: ( 'let' )
            {
            // InternalHale.g:912:1: ( 'let' )
            // InternalHale.g:913:2: 'let'
            {
             before(grammarAccess.getBindingAccess().getLetKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getBindingAccess().getLetKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__0__Impl"


    // $ANTLR start "rule__Binding__Group__1"
    // InternalHale.g:922:1: rule__Binding__Group__1 : rule__Binding__Group__1__Impl rule__Binding__Group__2 ;
    public final void rule__Binding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:926:1: ( rule__Binding__Group__1__Impl rule__Binding__Group__2 )
            // InternalHale.g:927:2: rule__Binding__Group__1__Impl rule__Binding__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Binding__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binding__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__1"


    // $ANTLR start "rule__Binding__Group__1__Impl"
    // InternalHale.g:934:1: rule__Binding__Group__1__Impl : ( ( rule__Binding__MutableAssignment_1 )? ) ;
    public final void rule__Binding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:938:1: ( ( ( rule__Binding__MutableAssignment_1 )? ) )
            // InternalHale.g:939:1: ( ( rule__Binding__MutableAssignment_1 )? )
            {
            // InternalHale.g:939:1: ( ( rule__Binding__MutableAssignment_1 )? )
            // InternalHale.g:940:2: ( rule__Binding__MutableAssignment_1 )?
            {
             before(grammarAccess.getBindingAccess().getMutableAssignment_1()); 
            // InternalHale.g:941:2: ( rule__Binding__MutableAssignment_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==32) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalHale.g:941:3: rule__Binding__MutableAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Binding__MutableAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBindingAccess().getMutableAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__1__Impl"


    // $ANTLR start "rule__Binding__Group__2"
    // InternalHale.g:949:1: rule__Binding__Group__2 : rule__Binding__Group__2__Impl rule__Binding__Group__3 ;
    public final void rule__Binding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:953:1: ( rule__Binding__Group__2__Impl rule__Binding__Group__3 )
            // InternalHale.g:954:2: rule__Binding__Group__2__Impl rule__Binding__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Binding__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binding__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__2"


    // $ANTLR start "rule__Binding__Group__2__Impl"
    // InternalHale.g:961:1: rule__Binding__Group__2__Impl : ( ( rule__Binding__NameAssignment_2 ) ) ;
    public final void rule__Binding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:965:1: ( ( ( rule__Binding__NameAssignment_2 ) ) )
            // InternalHale.g:966:1: ( ( rule__Binding__NameAssignment_2 ) )
            {
            // InternalHale.g:966:1: ( ( rule__Binding__NameAssignment_2 ) )
            // InternalHale.g:967:2: ( rule__Binding__NameAssignment_2 )
            {
             before(grammarAccess.getBindingAccess().getNameAssignment_2()); 
            // InternalHale.g:968:2: ( rule__Binding__NameAssignment_2 )
            // InternalHale.g:968:3: rule__Binding__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Binding__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBindingAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__2__Impl"


    // $ANTLR start "rule__Binding__Group__3"
    // InternalHale.g:976:1: rule__Binding__Group__3 : rule__Binding__Group__3__Impl rule__Binding__Group__4 ;
    public final void rule__Binding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:980:1: ( rule__Binding__Group__3__Impl rule__Binding__Group__4 )
            // InternalHale.g:981:2: rule__Binding__Group__3__Impl rule__Binding__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Binding__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binding__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__3"


    // $ANTLR start "rule__Binding__Group__3__Impl"
    // InternalHale.g:988:1: rule__Binding__Group__3__Impl : ( '=' ) ;
    public final void rule__Binding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:992:1: ( ( '=' ) )
            // InternalHale.g:993:1: ( '=' )
            {
            // InternalHale.g:993:1: ( '=' )
            // InternalHale.g:994:2: '='
            {
             before(grammarAccess.getBindingAccess().getEqualsSignKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getBindingAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__3__Impl"


    // $ANTLR start "rule__Binding__Group__4"
    // InternalHale.g:1003:1: rule__Binding__Group__4 : rule__Binding__Group__4__Impl ;
    public final void rule__Binding__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1007:1: ( rule__Binding__Group__4__Impl )
            // InternalHale.g:1008:2: rule__Binding__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Binding__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__4"


    // $ANTLR start "rule__Binding__Group__4__Impl"
    // InternalHale.g:1014:1: rule__Binding__Group__4__Impl : ( ( rule__Binding__ValueAssignment_4 ) ) ;
    public final void rule__Binding__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1018:1: ( ( ( rule__Binding__ValueAssignment_4 ) ) )
            // InternalHale.g:1019:1: ( ( rule__Binding__ValueAssignment_4 ) )
            {
            // InternalHale.g:1019:1: ( ( rule__Binding__ValueAssignment_4 ) )
            // InternalHale.g:1020:2: ( rule__Binding__ValueAssignment_4 )
            {
             before(grammarAccess.getBindingAccess().getValueAssignment_4()); 
            // InternalHale.g:1021:2: ( rule__Binding__ValueAssignment_4 )
            // InternalHale.g:1021:3: rule__Binding__ValueAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Binding__ValueAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getBindingAccess().getValueAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__4__Impl"


    // $ANTLR start "rule__Assignment__Group__0"
    // InternalHale.g:1030:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1034:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // InternalHale.g:1035:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Assignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assignment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__0"


    // $ANTLR start "rule__Assignment__Group__0__Impl"
    // InternalHale.g:1042:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__BindingAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1046:1: ( ( ( rule__Assignment__BindingAssignment_0 ) ) )
            // InternalHale.g:1047:1: ( ( rule__Assignment__BindingAssignment_0 ) )
            {
            // InternalHale.g:1047:1: ( ( rule__Assignment__BindingAssignment_0 ) )
            // InternalHale.g:1048:2: ( rule__Assignment__BindingAssignment_0 )
            {
             before(grammarAccess.getAssignmentAccess().getBindingAssignment_0()); 
            // InternalHale.g:1049:2: ( rule__Assignment__BindingAssignment_0 )
            // InternalHale.g:1049:3: rule__Assignment__BindingAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__BindingAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getBindingAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__0__Impl"


    // $ANTLR start "rule__Assignment__Group__1"
    // InternalHale.g:1057:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1061:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // InternalHale.g:1062:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Assignment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assignment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__1"


    // $ANTLR start "rule__Assignment__Group__1__Impl"
    // InternalHale.g:1069:1: rule__Assignment__Group__1__Impl : ( '=' ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1073:1: ( ( '=' ) )
            // InternalHale.g:1074:1: ( '=' )
            {
            // InternalHale.g:1074:1: ( '=' )
            // InternalHale.g:1075:2: '='
            {
             before(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__1__Impl"


    // $ANTLR start "rule__Assignment__Group__2"
    // InternalHale.g:1084:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1088:1: ( rule__Assignment__Group__2__Impl )
            // InternalHale.g:1089:2: rule__Assignment__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__2"


    // $ANTLR start "rule__Assignment__Group__2__Impl"
    // InternalHale.g:1095:1: rule__Assignment__Group__2__Impl : ( ( rule__Assignment__ValueAssignment_2 ) ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1099:1: ( ( ( rule__Assignment__ValueAssignment_2 ) ) )
            // InternalHale.g:1100:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            {
            // InternalHale.g:1100:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            // InternalHale.g:1101:2: ( rule__Assignment__ValueAssignment_2 )
            {
             before(grammarAccess.getAssignmentAccess().getValueAssignment_2()); 
            // InternalHale.g:1102:2: ( rule__Assignment__ValueAssignment_2 )
            // InternalHale.g:1102:3: rule__Assignment__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__2__Impl"


    // $ANTLR start "rule__Expression7__Group__0"
    // InternalHale.g:1111:1: rule__Expression7__Group__0 : rule__Expression7__Group__0__Impl rule__Expression7__Group__1 ;
    public final void rule__Expression7__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1115:1: ( rule__Expression7__Group__0__Impl rule__Expression7__Group__1 )
            // InternalHale.g:1116:2: rule__Expression7__Group__0__Impl rule__Expression7__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Expression7__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression7__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression7__Group__0"


    // $ANTLR start "rule__Expression7__Group__0__Impl"
    // InternalHale.g:1123:1: rule__Expression7__Group__0__Impl : ( ruleExpression6 ) ;
    public final void rule__Expression7__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1127:1: ( ( ruleExpression6 ) )
            // InternalHale.g:1128:1: ( ruleExpression6 )
            {
            // InternalHale.g:1128:1: ( ruleExpression6 )
            // InternalHale.g:1129:2: ruleExpression6
            {
             before(grammarAccess.getExpression7Access().getExpression6ParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression6();

            state._fsp--;

             after(grammarAccess.getExpression7Access().getExpression6ParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression7__Group__0__Impl"


    // $ANTLR start "rule__Expression7__Group__1"
    // InternalHale.g:1138:1: rule__Expression7__Group__1 : rule__Expression7__Group__1__Impl ;
    public final void rule__Expression7__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1142:1: ( rule__Expression7__Group__1__Impl )
            // InternalHale.g:1143:2: rule__Expression7__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression7__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression7__Group__1"


    // $ANTLR start "rule__Expression7__Group__1__Impl"
    // InternalHale.g:1149:1: rule__Expression7__Group__1__Impl : ( ( rule__Expression7__Alternatives_1 )* ) ;
    public final void rule__Expression7__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1153:1: ( ( ( rule__Expression7__Alternatives_1 )* ) )
            // InternalHale.g:1154:1: ( ( rule__Expression7__Alternatives_1 )* )
            {
            // InternalHale.g:1154:1: ( ( rule__Expression7__Alternatives_1 )* )
            // InternalHale.g:1155:2: ( rule__Expression7__Alternatives_1 )*
            {
             before(grammarAccess.getExpression7Access().getAlternatives_1()); 
            // InternalHale.g:1156:2: ( rule__Expression7__Alternatives_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=15 && LA12_0<=16)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalHale.g:1156:3: rule__Expression7__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Expression7__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getExpression7Access().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression7__Group__1__Impl"


    // $ANTLR start "rule__Expression7__Group_1_0__0"
    // InternalHale.g:1165:1: rule__Expression7__Group_1_0__0 : rule__Expression7__Group_1_0__0__Impl rule__Expression7__Group_1_0__1 ;
    public final void rule__Expression7__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1169:1: ( rule__Expression7__Group_1_0__0__Impl rule__Expression7__Group_1_0__1 )
            // InternalHale.g:1170:2: rule__Expression7__Group_1_0__0__Impl rule__Expression7__Group_1_0__1
            {
            pushFollow(FOLLOW_10);
            rule__Expression7__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression7__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression7__Group_1_0__0"


    // $ANTLR start "rule__Expression7__Group_1_0__0__Impl"
    // InternalHale.g:1177:1: rule__Expression7__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Expression7__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1181:1: ( ( () ) )
            // InternalHale.g:1182:1: ( () )
            {
            // InternalHale.g:1182:1: ( () )
            // InternalHale.g:1183:2: ()
            {
             before(grammarAccess.getExpression7Access().getLogicalAndLeftAction_1_0_0()); 
            // InternalHale.g:1184:2: ()
            // InternalHale.g:1184:3: 
            {
            }

             after(grammarAccess.getExpression7Access().getLogicalAndLeftAction_1_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression7__Group_1_0__0__Impl"


    // $ANTLR start "rule__Expression7__Group_1_0__1"
    // InternalHale.g:1192:1: rule__Expression7__Group_1_0__1 : rule__Expression7__Group_1_0__1__Impl rule__Expression7__Group_1_0__2 ;
    public final void rule__Expression7__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1196:1: ( rule__Expression7__Group_1_0__1__Impl rule__Expression7__Group_1_0__2 )
            // InternalHale.g:1197:2: rule__Expression7__Group_1_0__1__Impl rule__Expression7__Group_1_0__2
            {
            pushFollow(FOLLOW_3);
            rule__Expression7__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression7__Group_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression7__Group_1_0__1"


    // $ANTLR start "rule__Expression7__Group_1_0__1__Impl"
    // InternalHale.g:1204:1: rule__Expression7__Group_1_0__1__Impl : ( 'and' ) ;
    public final void rule__Expression7__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1208:1: ( ( 'and' ) )
            // InternalHale.g:1209:1: ( 'and' )
            {
            // InternalHale.g:1209:1: ( 'and' )
            // InternalHale.g:1210:2: 'and'
            {
             before(grammarAccess.getExpression7Access().getAndKeyword_1_0_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getExpression7Access().getAndKeyword_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression7__Group_1_0__1__Impl"


    // $ANTLR start "rule__Expression7__Group_1_0__2"
    // InternalHale.g:1219:1: rule__Expression7__Group_1_0__2 : rule__Expression7__Group_1_0__2__Impl ;
    public final void rule__Expression7__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1223:1: ( rule__Expression7__Group_1_0__2__Impl )
            // InternalHale.g:1224:2: rule__Expression7__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression7__Group_1_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression7__Group_1_0__2"


    // $ANTLR start "rule__Expression7__Group_1_0__2__Impl"
    // InternalHale.g:1230:1: rule__Expression7__Group_1_0__2__Impl : ( ( rule__Expression7__RightAssignment_1_0_2 ) ) ;
    public final void rule__Expression7__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1234:1: ( ( ( rule__Expression7__RightAssignment_1_0_2 ) ) )
            // InternalHale.g:1235:1: ( ( rule__Expression7__RightAssignment_1_0_2 ) )
            {
            // InternalHale.g:1235:1: ( ( rule__Expression7__RightAssignment_1_0_2 ) )
            // InternalHale.g:1236:2: ( rule__Expression7__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getExpression7Access().getRightAssignment_1_0_2()); 
            // InternalHale.g:1237:2: ( rule__Expression7__RightAssignment_1_0_2 )
            // InternalHale.g:1237:3: rule__Expression7__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Expression7__RightAssignment_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getExpression7Access().getRightAssignment_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression7__Group_1_0__2__Impl"


    // $ANTLR start "rule__Expression7__Group_1_1__0"
    // InternalHale.g:1246:1: rule__Expression7__Group_1_1__0 : rule__Expression7__Group_1_1__0__Impl rule__Expression7__Group_1_1__1 ;
    public final void rule__Expression7__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1250:1: ( rule__Expression7__Group_1_1__0__Impl rule__Expression7__Group_1_1__1 )
            // InternalHale.g:1251:2: rule__Expression7__Group_1_1__0__Impl rule__Expression7__Group_1_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Expression7__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression7__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression7__Group_1_1__0"


    // $ANTLR start "rule__Expression7__Group_1_1__0__Impl"
    // InternalHale.g:1258:1: rule__Expression7__Group_1_1__0__Impl : ( () ) ;
    public final void rule__Expression7__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1262:1: ( ( () ) )
            // InternalHale.g:1263:1: ( () )
            {
            // InternalHale.g:1263:1: ( () )
            // InternalHale.g:1264:2: ()
            {
             before(grammarAccess.getExpression7Access().getLogicalOrLeftAction_1_1_0()); 
            // InternalHale.g:1265:2: ()
            // InternalHale.g:1265:3: 
            {
            }

             after(grammarAccess.getExpression7Access().getLogicalOrLeftAction_1_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression7__Group_1_1__0__Impl"


    // $ANTLR start "rule__Expression7__Group_1_1__1"
    // InternalHale.g:1273:1: rule__Expression7__Group_1_1__1 : rule__Expression7__Group_1_1__1__Impl rule__Expression7__Group_1_1__2 ;
    public final void rule__Expression7__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1277:1: ( rule__Expression7__Group_1_1__1__Impl rule__Expression7__Group_1_1__2 )
            // InternalHale.g:1278:2: rule__Expression7__Group_1_1__1__Impl rule__Expression7__Group_1_1__2
            {
            pushFollow(FOLLOW_3);
            rule__Expression7__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression7__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression7__Group_1_1__1"


    // $ANTLR start "rule__Expression7__Group_1_1__1__Impl"
    // InternalHale.g:1285:1: rule__Expression7__Group_1_1__1__Impl : ( 'or' ) ;
    public final void rule__Expression7__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1289:1: ( ( 'or' ) )
            // InternalHale.g:1290:1: ( 'or' )
            {
            // InternalHale.g:1290:1: ( 'or' )
            // InternalHale.g:1291:2: 'or'
            {
             before(grammarAccess.getExpression7Access().getOrKeyword_1_1_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getExpression7Access().getOrKeyword_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression7__Group_1_1__1__Impl"


    // $ANTLR start "rule__Expression7__Group_1_1__2"
    // InternalHale.g:1300:1: rule__Expression7__Group_1_1__2 : rule__Expression7__Group_1_1__2__Impl ;
    public final void rule__Expression7__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1304:1: ( rule__Expression7__Group_1_1__2__Impl )
            // InternalHale.g:1305:2: rule__Expression7__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression7__Group_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression7__Group_1_1__2"


    // $ANTLR start "rule__Expression7__Group_1_1__2__Impl"
    // InternalHale.g:1311:1: rule__Expression7__Group_1_1__2__Impl : ( ( rule__Expression7__RightAssignment_1_1_2 ) ) ;
    public final void rule__Expression7__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1315:1: ( ( ( rule__Expression7__RightAssignment_1_1_2 ) ) )
            // InternalHale.g:1316:1: ( ( rule__Expression7__RightAssignment_1_1_2 ) )
            {
            // InternalHale.g:1316:1: ( ( rule__Expression7__RightAssignment_1_1_2 ) )
            // InternalHale.g:1317:2: ( rule__Expression7__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getExpression7Access().getRightAssignment_1_1_2()); 
            // InternalHale.g:1318:2: ( rule__Expression7__RightAssignment_1_1_2 )
            // InternalHale.g:1318:3: rule__Expression7__RightAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Expression7__RightAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getExpression7Access().getRightAssignment_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression7__Group_1_1__2__Impl"


    // $ANTLR start "rule__Expression6__Group__0"
    // InternalHale.g:1327:1: rule__Expression6__Group__0 : rule__Expression6__Group__0__Impl rule__Expression6__Group__1 ;
    public final void rule__Expression6__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1331:1: ( rule__Expression6__Group__0__Impl rule__Expression6__Group__1 )
            // InternalHale.g:1332:2: rule__Expression6__Group__0__Impl rule__Expression6__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Expression6__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression6__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression6__Group__0"


    // $ANTLR start "rule__Expression6__Group__0__Impl"
    // InternalHale.g:1339:1: rule__Expression6__Group__0__Impl : ( ruleExpression5 ) ;
    public final void rule__Expression6__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1343:1: ( ( ruleExpression5 ) )
            // InternalHale.g:1344:1: ( ruleExpression5 )
            {
            // InternalHale.g:1344:1: ( ruleExpression5 )
            // InternalHale.g:1345:2: ruleExpression5
            {
             before(grammarAccess.getExpression6Access().getExpression5ParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression5();

            state._fsp--;

             after(grammarAccess.getExpression6Access().getExpression5ParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression6__Group__0__Impl"


    // $ANTLR start "rule__Expression6__Group__1"
    // InternalHale.g:1354:1: rule__Expression6__Group__1 : rule__Expression6__Group__1__Impl ;
    public final void rule__Expression6__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1358:1: ( rule__Expression6__Group__1__Impl )
            // InternalHale.g:1359:2: rule__Expression6__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression6__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression6__Group__1"


    // $ANTLR start "rule__Expression6__Group__1__Impl"
    // InternalHale.g:1365:1: rule__Expression6__Group__1__Impl : ( ( rule__Expression6__Alternatives_1 )* ) ;
    public final void rule__Expression6__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1369:1: ( ( ( rule__Expression6__Alternatives_1 )* ) )
            // InternalHale.g:1370:1: ( ( rule__Expression6__Alternatives_1 )* )
            {
            // InternalHale.g:1370:1: ( ( rule__Expression6__Alternatives_1 )* )
            // InternalHale.g:1371:2: ( rule__Expression6__Alternatives_1 )*
            {
             before(grammarAccess.getExpression6Access().getAlternatives_1()); 
            // InternalHale.g:1372:2: ( rule__Expression6__Alternatives_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=17 && LA13_0<=18)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalHale.g:1372:3: rule__Expression6__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Expression6__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getExpression6Access().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression6__Group__1__Impl"


    // $ANTLR start "rule__Expression6__Group_1_0__0"
    // InternalHale.g:1381:1: rule__Expression6__Group_1_0__0 : rule__Expression6__Group_1_0__0__Impl rule__Expression6__Group_1_0__1 ;
    public final void rule__Expression6__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1385:1: ( rule__Expression6__Group_1_0__0__Impl rule__Expression6__Group_1_0__1 )
            // InternalHale.g:1386:2: rule__Expression6__Group_1_0__0__Impl rule__Expression6__Group_1_0__1
            {
            pushFollow(FOLLOW_13);
            rule__Expression6__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression6__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression6__Group_1_0__0"


    // $ANTLR start "rule__Expression6__Group_1_0__0__Impl"
    // InternalHale.g:1393:1: rule__Expression6__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Expression6__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1397:1: ( ( () ) )
            // InternalHale.g:1398:1: ( () )
            {
            // InternalHale.g:1398:1: ( () )
            // InternalHale.g:1399:2: ()
            {
             before(grammarAccess.getExpression6Access().getEqualityLeftAction_1_0_0()); 
            // InternalHale.g:1400:2: ()
            // InternalHale.g:1400:3: 
            {
            }

             after(grammarAccess.getExpression6Access().getEqualityLeftAction_1_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression6__Group_1_0__0__Impl"


    // $ANTLR start "rule__Expression6__Group_1_0__1"
    // InternalHale.g:1408:1: rule__Expression6__Group_1_0__1 : rule__Expression6__Group_1_0__1__Impl rule__Expression6__Group_1_0__2 ;
    public final void rule__Expression6__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1412:1: ( rule__Expression6__Group_1_0__1__Impl rule__Expression6__Group_1_0__2 )
            // InternalHale.g:1413:2: rule__Expression6__Group_1_0__1__Impl rule__Expression6__Group_1_0__2
            {
            pushFollow(FOLLOW_3);
            rule__Expression6__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression6__Group_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression6__Group_1_0__1"


    // $ANTLR start "rule__Expression6__Group_1_0__1__Impl"
    // InternalHale.g:1420:1: rule__Expression6__Group_1_0__1__Impl : ( '==' ) ;
    public final void rule__Expression6__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1424:1: ( ( '==' ) )
            // InternalHale.g:1425:1: ( '==' )
            {
            // InternalHale.g:1425:1: ( '==' )
            // InternalHale.g:1426:2: '=='
            {
             before(grammarAccess.getExpression6Access().getEqualsSignEqualsSignKeyword_1_0_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getExpression6Access().getEqualsSignEqualsSignKeyword_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression6__Group_1_0__1__Impl"


    // $ANTLR start "rule__Expression6__Group_1_0__2"
    // InternalHale.g:1435:1: rule__Expression6__Group_1_0__2 : rule__Expression6__Group_1_0__2__Impl ;
    public final void rule__Expression6__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1439:1: ( rule__Expression6__Group_1_0__2__Impl )
            // InternalHale.g:1440:2: rule__Expression6__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression6__Group_1_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression6__Group_1_0__2"


    // $ANTLR start "rule__Expression6__Group_1_0__2__Impl"
    // InternalHale.g:1446:1: rule__Expression6__Group_1_0__2__Impl : ( ( rule__Expression6__RightAssignment_1_0_2 ) ) ;
    public final void rule__Expression6__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1450:1: ( ( ( rule__Expression6__RightAssignment_1_0_2 ) ) )
            // InternalHale.g:1451:1: ( ( rule__Expression6__RightAssignment_1_0_2 ) )
            {
            // InternalHale.g:1451:1: ( ( rule__Expression6__RightAssignment_1_0_2 ) )
            // InternalHale.g:1452:2: ( rule__Expression6__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getExpression6Access().getRightAssignment_1_0_2()); 
            // InternalHale.g:1453:2: ( rule__Expression6__RightAssignment_1_0_2 )
            // InternalHale.g:1453:3: rule__Expression6__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Expression6__RightAssignment_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getExpression6Access().getRightAssignment_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression6__Group_1_0__2__Impl"


    // $ANTLR start "rule__Expression6__Group_1_1__0"
    // InternalHale.g:1462:1: rule__Expression6__Group_1_1__0 : rule__Expression6__Group_1_1__0__Impl rule__Expression6__Group_1_1__1 ;
    public final void rule__Expression6__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1466:1: ( rule__Expression6__Group_1_1__0__Impl rule__Expression6__Group_1_1__1 )
            // InternalHale.g:1467:2: rule__Expression6__Group_1_1__0__Impl rule__Expression6__Group_1_1__1
            {
            pushFollow(FOLLOW_11);
            rule__Expression6__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression6__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression6__Group_1_1__0"


    // $ANTLR start "rule__Expression6__Group_1_1__0__Impl"
    // InternalHale.g:1474:1: rule__Expression6__Group_1_1__0__Impl : ( () ) ;
    public final void rule__Expression6__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1478:1: ( ( () ) )
            // InternalHale.g:1479:1: ( () )
            {
            // InternalHale.g:1479:1: ( () )
            // InternalHale.g:1480:2: ()
            {
             before(grammarAccess.getExpression6Access().getInequalityLeftAction_1_1_0()); 
            // InternalHale.g:1481:2: ()
            // InternalHale.g:1481:3: 
            {
            }

             after(grammarAccess.getExpression6Access().getInequalityLeftAction_1_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression6__Group_1_1__0__Impl"


    // $ANTLR start "rule__Expression6__Group_1_1__1"
    // InternalHale.g:1489:1: rule__Expression6__Group_1_1__1 : rule__Expression6__Group_1_1__1__Impl rule__Expression6__Group_1_1__2 ;
    public final void rule__Expression6__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1493:1: ( rule__Expression6__Group_1_1__1__Impl rule__Expression6__Group_1_1__2 )
            // InternalHale.g:1494:2: rule__Expression6__Group_1_1__1__Impl rule__Expression6__Group_1_1__2
            {
            pushFollow(FOLLOW_3);
            rule__Expression6__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression6__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression6__Group_1_1__1"


    // $ANTLR start "rule__Expression6__Group_1_1__1__Impl"
    // InternalHale.g:1501:1: rule__Expression6__Group_1_1__1__Impl : ( '!=' ) ;
    public final void rule__Expression6__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1505:1: ( ( '!=' ) )
            // InternalHale.g:1506:1: ( '!=' )
            {
            // InternalHale.g:1506:1: ( '!=' )
            // InternalHale.g:1507:2: '!='
            {
             before(grammarAccess.getExpression6Access().getExclamationMarkEqualsSignKeyword_1_1_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getExpression6Access().getExclamationMarkEqualsSignKeyword_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression6__Group_1_1__1__Impl"


    // $ANTLR start "rule__Expression6__Group_1_1__2"
    // InternalHale.g:1516:1: rule__Expression6__Group_1_1__2 : rule__Expression6__Group_1_1__2__Impl ;
    public final void rule__Expression6__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1520:1: ( rule__Expression6__Group_1_1__2__Impl )
            // InternalHale.g:1521:2: rule__Expression6__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression6__Group_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression6__Group_1_1__2"


    // $ANTLR start "rule__Expression6__Group_1_1__2__Impl"
    // InternalHale.g:1527:1: rule__Expression6__Group_1_1__2__Impl : ( ( rule__Expression6__RightAssignment_1_1_2 ) ) ;
    public final void rule__Expression6__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1531:1: ( ( ( rule__Expression6__RightAssignment_1_1_2 ) ) )
            // InternalHale.g:1532:1: ( ( rule__Expression6__RightAssignment_1_1_2 ) )
            {
            // InternalHale.g:1532:1: ( ( rule__Expression6__RightAssignment_1_1_2 ) )
            // InternalHale.g:1533:2: ( rule__Expression6__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getExpression6Access().getRightAssignment_1_1_2()); 
            // InternalHale.g:1534:2: ( rule__Expression6__RightAssignment_1_1_2 )
            // InternalHale.g:1534:3: rule__Expression6__RightAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Expression6__RightAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getExpression6Access().getRightAssignment_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression6__Group_1_1__2__Impl"


    // $ANTLR start "rule__Expression5__Group__0"
    // InternalHale.g:1543:1: rule__Expression5__Group__0 : rule__Expression5__Group__0__Impl rule__Expression5__Group__1 ;
    public final void rule__Expression5__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1547:1: ( rule__Expression5__Group__0__Impl rule__Expression5__Group__1 )
            // InternalHale.g:1548:2: rule__Expression5__Group__0__Impl rule__Expression5__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Expression5__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression5__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression5__Group__0"


    // $ANTLR start "rule__Expression5__Group__0__Impl"
    // InternalHale.g:1555:1: rule__Expression5__Group__0__Impl : ( ruleExpression4 ) ;
    public final void rule__Expression5__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1559:1: ( ( ruleExpression4 ) )
            // InternalHale.g:1560:1: ( ruleExpression4 )
            {
            // InternalHale.g:1560:1: ( ruleExpression4 )
            // InternalHale.g:1561:2: ruleExpression4
            {
             before(grammarAccess.getExpression5Access().getExpression4ParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression4();

            state._fsp--;

             after(grammarAccess.getExpression5Access().getExpression4ParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression5__Group__0__Impl"


    // $ANTLR start "rule__Expression5__Group__1"
    // InternalHale.g:1570:1: rule__Expression5__Group__1 : rule__Expression5__Group__1__Impl ;
    public final void rule__Expression5__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1574:1: ( rule__Expression5__Group__1__Impl )
            // InternalHale.g:1575:2: rule__Expression5__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression5__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression5__Group__1"


    // $ANTLR start "rule__Expression5__Group__1__Impl"
    // InternalHale.g:1581:1: rule__Expression5__Group__1__Impl : ( ( rule__Expression5__Alternatives_1 )* ) ;
    public final void rule__Expression5__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1585:1: ( ( ( rule__Expression5__Alternatives_1 )* ) )
            // InternalHale.g:1586:1: ( ( rule__Expression5__Alternatives_1 )* )
            {
            // InternalHale.g:1586:1: ( ( rule__Expression5__Alternatives_1 )* )
            // InternalHale.g:1587:2: ( rule__Expression5__Alternatives_1 )*
            {
             before(grammarAccess.getExpression5Access().getAlternatives_1()); 
            // InternalHale.g:1588:2: ( rule__Expression5__Alternatives_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=19 && LA14_0<=22)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalHale.g:1588:3: rule__Expression5__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Expression5__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getExpression5Access().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression5__Group__1__Impl"


    // $ANTLR start "rule__Expression5__Group_1_0__0"
    // InternalHale.g:1597:1: rule__Expression5__Group_1_0__0 : rule__Expression5__Group_1_0__0__Impl rule__Expression5__Group_1_0__1 ;
    public final void rule__Expression5__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1601:1: ( rule__Expression5__Group_1_0__0__Impl rule__Expression5__Group_1_0__1 )
            // InternalHale.g:1602:2: rule__Expression5__Group_1_0__0__Impl rule__Expression5__Group_1_0__1
            {
            pushFollow(FOLLOW_16);
            rule__Expression5__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression5__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression5__Group_1_0__0"


    // $ANTLR start "rule__Expression5__Group_1_0__0__Impl"
    // InternalHale.g:1609:1: rule__Expression5__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Expression5__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1613:1: ( ( () ) )
            // InternalHale.g:1614:1: ( () )
            {
            // InternalHale.g:1614:1: ( () )
            // InternalHale.g:1615:2: ()
            {
             before(grammarAccess.getExpression5Access().getLessThanOrEqualLeftAction_1_0_0()); 
            // InternalHale.g:1616:2: ()
            // InternalHale.g:1616:3: 
            {
            }

             after(grammarAccess.getExpression5Access().getLessThanOrEqualLeftAction_1_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression5__Group_1_0__0__Impl"


    // $ANTLR start "rule__Expression5__Group_1_0__1"
    // InternalHale.g:1624:1: rule__Expression5__Group_1_0__1 : rule__Expression5__Group_1_0__1__Impl rule__Expression5__Group_1_0__2 ;
    public final void rule__Expression5__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1628:1: ( rule__Expression5__Group_1_0__1__Impl rule__Expression5__Group_1_0__2 )
            // InternalHale.g:1629:2: rule__Expression5__Group_1_0__1__Impl rule__Expression5__Group_1_0__2
            {
            pushFollow(FOLLOW_3);
            rule__Expression5__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression5__Group_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression5__Group_1_0__1"


    // $ANTLR start "rule__Expression5__Group_1_0__1__Impl"
    // InternalHale.g:1636:1: rule__Expression5__Group_1_0__1__Impl : ( '<=' ) ;
    public final void rule__Expression5__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1640:1: ( ( '<=' ) )
            // InternalHale.g:1641:1: ( '<=' )
            {
            // InternalHale.g:1641:1: ( '<=' )
            // InternalHale.g:1642:2: '<='
            {
             before(grammarAccess.getExpression5Access().getLessThanSignEqualsSignKeyword_1_0_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getExpression5Access().getLessThanSignEqualsSignKeyword_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression5__Group_1_0__1__Impl"


    // $ANTLR start "rule__Expression5__Group_1_0__2"
    // InternalHale.g:1651:1: rule__Expression5__Group_1_0__2 : rule__Expression5__Group_1_0__2__Impl ;
    public final void rule__Expression5__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1655:1: ( rule__Expression5__Group_1_0__2__Impl )
            // InternalHale.g:1656:2: rule__Expression5__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression5__Group_1_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression5__Group_1_0__2"


    // $ANTLR start "rule__Expression5__Group_1_0__2__Impl"
    // InternalHale.g:1662:1: rule__Expression5__Group_1_0__2__Impl : ( ( rule__Expression5__RightAssignment_1_0_2 ) ) ;
    public final void rule__Expression5__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1666:1: ( ( ( rule__Expression5__RightAssignment_1_0_2 ) ) )
            // InternalHale.g:1667:1: ( ( rule__Expression5__RightAssignment_1_0_2 ) )
            {
            // InternalHale.g:1667:1: ( ( rule__Expression5__RightAssignment_1_0_2 ) )
            // InternalHale.g:1668:2: ( rule__Expression5__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getExpression5Access().getRightAssignment_1_0_2()); 
            // InternalHale.g:1669:2: ( rule__Expression5__RightAssignment_1_0_2 )
            // InternalHale.g:1669:3: rule__Expression5__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Expression5__RightAssignment_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getExpression5Access().getRightAssignment_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression5__Group_1_0__2__Impl"


    // $ANTLR start "rule__Expression5__Group_1_1__0"
    // InternalHale.g:1678:1: rule__Expression5__Group_1_1__0 : rule__Expression5__Group_1_1__0__Impl rule__Expression5__Group_1_1__1 ;
    public final void rule__Expression5__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1682:1: ( rule__Expression5__Group_1_1__0__Impl rule__Expression5__Group_1_1__1 )
            // InternalHale.g:1683:2: rule__Expression5__Group_1_1__0__Impl rule__Expression5__Group_1_1__1
            {
            pushFollow(FOLLOW_17);
            rule__Expression5__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression5__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression5__Group_1_1__0"


    // $ANTLR start "rule__Expression5__Group_1_1__0__Impl"
    // InternalHale.g:1690:1: rule__Expression5__Group_1_1__0__Impl : ( () ) ;
    public final void rule__Expression5__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1694:1: ( ( () ) )
            // InternalHale.g:1695:1: ( () )
            {
            // InternalHale.g:1695:1: ( () )
            // InternalHale.g:1696:2: ()
            {
             before(grammarAccess.getExpression5Access().getLessThanLeftAction_1_1_0()); 
            // InternalHale.g:1697:2: ()
            // InternalHale.g:1697:3: 
            {
            }

             after(grammarAccess.getExpression5Access().getLessThanLeftAction_1_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression5__Group_1_1__0__Impl"


    // $ANTLR start "rule__Expression5__Group_1_1__1"
    // InternalHale.g:1705:1: rule__Expression5__Group_1_1__1 : rule__Expression5__Group_1_1__1__Impl rule__Expression5__Group_1_1__2 ;
    public final void rule__Expression5__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1709:1: ( rule__Expression5__Group_1_1__1__Impl rule__Expression5__Group_1_1__2 )
            // InternalHale.g:1710:2: rule__Expression5__Group_1_1__1__Impl rule__Expression5__Group_1_1__2
            {
            pushFollow(FOLLOW_3);
            rule__Expression5__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression5__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression5__Group_1_1__1"


    // $ANTLR start "rule__Expression5__Group_1_1__1__Impl"
    // InternalHale.g:1717:1: rule__Expression5__Group_1_1__1__Impl : ( '<' ) ;
    public final void rule__Expression5__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1721:1: ( ( '<' ) )
            // InternalHale.g:1722:1: ( '<' )
            {
            // InternalHale.g:1722:1: ( '<' )
            // InternalHale.g:1723:2: '<'
            {
             before(grammarAccess.getExpression5Access().getLessThanSignKeyword_1_1_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getExpression5Access().getLessThanSignKeyword_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression5__Group_1_1__1__Impl"


    // $ANTLR start "rule__Expression5__Group_1_1__2"
    // InternalHale.g:1732:1: rule__Expression5__Group_1_1__2 : rule__Expression5__Group_1_1__2__Impl ;
    public final void rule__Expression5__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1736:1: ( rule__Expression5__Group_1_1__2__Impl )
            // InternalHale.g:1737:2: rule__Expression5__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression5__Group_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression5__Group_1_1__2"


    // $ANTLR start "rule__Expression5__Group_1_1__2__Impl"
    // InternalHale.g:1743:1: rule__Expression5__Group_1_1__2__Impl : ( ( rule__Expression5__RightAssignment_1_1_2 ) ) ;
    public final void rule__Expression5__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1747:1: ( ( ( rule__Expression5__RightAssignment_1_1_2 ) ) )
            // InternalHale.g:1748:1: ( ( rule__Expression5__RightAssignment_1_1_2 ) )
            {
            // InternalHale.g:1748:1: ( ( rule__Expression5__RightAssignment_1_1_2 ) )
            // InternalHale.g:1749:2: ( rule__Expression5__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getExpression5Access().getRightAssignment_1_1_2()); 
            // InternalHale.g:1750:2: ( rule__Expression5__RightAssignment_1_1_2 )
            // InternalHale.g:1750:3: rule__Expression5__RightAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Expression5__RightAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getExpression5Access().getRightAssignment_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression5__Group_1_1__2__Impl"


    // $ANTLR start "rule__Expression5__Group_1_2__0"
    // InternalHale.g:1759:1: rule__Expression5__Group_1_2__0 : rule__Expression5__Group_1_2__0__Impl rule__Expression5__Group_1_2__1 ;
    public final void rule__Expression5__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1763:1: ( rule__Expression5__Group_1_2__0__Impl rule__Expression5__Group_1_2__1 )
            // InternalHale.g:1764:2: rule__Expression5__Group_1_2__0__Impl rule__Expression5__Group_1_2__1
            {
            pushFollow(FOLLOW_18);
            rule__Expression5__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression5__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression5__Group_1_2__0"


    // $ANTLR start "rule__Expression5__Group_1_2__0__Impl"
    // InternalHale.g:1771:1: rule__Expression5__Group_1_2__0__Impl : ( () ) ;
    public final void rule__Expression5__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1775:1: ( ( () ) )
            // InternalHale.g:1776:1: ( () )
            {
            // InternalHale.g:1776:1: ( () )
            // InternalHale.g:1777:2: ()
            {
             before(grammarAccess.getExpression5Access().getGreaterThanOrEqualLeftAction_1_2_0()); 
            // InternalHale.g:1778:2: ()
            // InternalHale.g:1778:3: 
            {
            }

             after(grammarAccess.getExpression5Access().getGreaterThanOrEqualLeftAction_1_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression5__Group_1_2__0__Impl"


    // $ANTLR start "rule__Expression5__Group_1_2__1"
    // InternalHale.g:1786:1: rule__Expression5__Group_1_2__1 : rule__Expression5__Group_1_2__1__Impl rule__Expression5__Group_1_2__2 ;
    public final void rule__Expression5__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1790:1: ( rule__Expression5__Group_1_2__1__Impl rule__Expression5__Group_1_2__2 )
            // InternalHale.g:1791:2: rule__Expression5__Group_1_2__1__Impl rule__Expression5__Group_1_2__2
            {
            pushFollow(FOLLOW_3);
            rule__Expression5__Group_1_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression5__Group_1_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression5__Group_1_2__1"


    // $ANTLR start "rule__Expression5__Group_1_2__1__Impl"
    // InternalHale.g:1798:1: rule__Expression5__Group_1_2__1__Impl : ( '>=' ) ;
    public final void rule__Expression5__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1802:1: ( ( '>=' ) )
            // InternalHale.g:1803:1: ( '>=' )
            {
            // InternalHale.g:1803:1: ( '>=' )
            // InternalHale.g:1804:2: '>='
            {
             before(grammarAccess.getExpression5Access().getGreaterThanSignEqualsSignKeyword_1_2_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getExpression5Access().getGreaterThanSignEqualsSignKeyword_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression5__Group_1_2__1__Impl"


    // $ANTLR start "rule__Expression5__Group_1_2__2"
    // InternalHale.g:1813:1: rule__Expression5__Group_1_2__2 : rule__Expression5__Group_1_2__2__Impl ;
    public final void rule__Expression5__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1817:1: ( rule__Expression5__Group_1_2__2__Impl )
            // InternalHale.g:1818:2: rule__Expression5__Group_1_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression5__Group_1_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression5__Group_1_2__2"


    // $ANTLR start "rule__Expression5__Group_1_2__2__Impl"
    // InternalHale.g:1824:1: rule__Expression5__Group_1_2__2__Impl : ( ( rule__Expression5__RightAssignment_1_2_2 ) ) ;
    public final void rule__Expression5__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1828:1: ( ( ( rule__Expression5__RightAssignment_1_2_2 ) ) )
            // InternalHale.g:1829:1: ( ( rule__Expression5__RightAssignment_1_2_2 ) )
            {
            // InternalHale.g:1829:1: ( ( rule__Expression5__RightAssignment_1_2_2 ) )
            // InternalHale.g:1830:2: ( rule__Expression5__RightAssignment_1_2_2 )
            {
             before(grammarAccess.getExpression5Access().getRightAssignment_1_2_2()); 
            // InternalHale.g:1831:2: ( rule__Expression5__RightAssignment_1_2_2 )
            // InternalHale.g:1831:3: rule__Expression5__RightAssignment_1_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Expression5__RightAssignment_1_2_2();

            state._fsp--;


            }

             after(grammarAccess.getExpression5Access().getRightAssignment_1_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression5__Group_1_2__2__Impl"


    // $ANTLR start "rule__Expression5__Group_1_3__0"
    // InternalHale.g:1840:1: rule__Expression5__Group_1_3__0 : rule__Expression5__Group_1_3__0__Impl rule__Expression5__Group_1_3__1 ;
    public final void rule__Expression5__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1844:1: ( rule__Expression5__Group_1_3__0__Impl rule__Expression5__Group_1_3__1 )
            // InternalHale.g:1845:2: rule__Expression5__Group_1_3__0__Impl rule__Expression5__Group_1_3__1
            {
            pushFollow(FOLLOW_14);
            rule__Expression5__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression5__Group_1_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression5__Group_1_3__0"


    // $ANTLR start "rule__Expression5__Group_1_3__0__Impl"
    // InternalHale.g:1852:1: rule__Expression5__Group_1_3__0__Impl : ( () ) ;
    public final void rule__Expression5__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1856:1: ( ( () ) )
            // InternalHale.g:1857:1: ( () )
            {
            // InternalHale.g:1857:1: ( () )
            // InternalHale.g:1858:2: ()
            {
             before(grammarAccess.getExpression5Access().getGreaterThanLeftAction_1_3_0()); 
            // InternalHale.g:1859:2: ()
            // InternalHale.g:1859:3: 
            {
            }

             after(grammarAccess.getExpression5Access().getGreaterThanLeftAction_1_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression5__Group_1_3__0__Impl"


    // $ANTLR start "rule__Expression5__Group_1_3__1"
    // InternalHale.g:1867:1: rule__Expression5__Group_1_3__1 : rule__Expression5__Group_1_3__1__Impl rule__Expression5__Group_1_3__2 ;
    public final void rule__Expression5__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1871:1: ( rule__Expression5__Group_1_3__1__Impl rule__Expression5__Group_1_3__2 )
            // InternalHale.g:1872:2: rule__Expression5__Group_1_3__1__Impl rule__Expression5__Group_1_3__2
            {
            pushFollow(FOLLOW_3);
            rule__Expression5__Group_1_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression5__Group_1_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression5__Group_1_3__1"


    // $ANTLR start "rule__Expression5__Group_1_3__1__Impl"
    // InternalHale.g:1879:1: rule__Expression5__Group_1_3__1__Impl : ( '>' ) ;
    public final void rule__Expression5__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1883:1: ( ( '>' ) )
            // InternalHale.g:1884:1: ( '>' )
            {
            // InternalHale.g:1884:1: ( '>' )
            // InternalHale.g:1885:2: '>'
            {
             before(grammarAccess.getExpression5Access().getGreaterThanSignKeyword_1_3_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getExpression5Access().getGreaterThanSignKeyword_1_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression5__Group_1_3__1__Impl"


    // $ANTLR start "rule__Expression5__Group_1_3__2"
    // InternalHale.g:1894:1: rule__Expression5__Group_1_3__2 : rule__Expression5__Group_1_3__2__Impl ;
    public final void rule__Expression5__Group_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1898:1: ( rule__Expression5__Group_1_3__2__Impl )
            // InternalHale.g:1899:2: rule__Expression5__Group_1_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression5__Group_1_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression5__Group_1_3__2"


    // $ANTLR start "rule__Expression5__Group_1_3__2__Impl"
    // InternalHale.g:1905:1: rule__Expression5__Group_1_3__2__Impl : ( ( rule__Expression5__RightAssignment_1_3_2 ) ) ;
    public final void rule__Expression5__Group_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1909:1: ( ( ( rule__Expression5__RightAssignment_1_3_2 ) ) )
            // InternalHale.g:1910:1: ( ( rule__Expression5__RightAssignment_1_3_2 ) )
            {
            // InternalHale.g:1910:1: ( ( rule__Expression5__RightAssignment_1_3_2 ) )
            // InternalHale.g:1911:2: ( rule__Expression5__RightAssignment_1_3_2 )
            {
             before(grammarAccess.getExpression5Access().getRightAssignment_1_3_2()); 
            // InternalHale.g:1912:2: ( rule__Expression5__RightAssignment_1_3_2 )
            // InternalHale.g:1912:3: rule__Expression5__RightAssignment_1_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Expression5__RightAssignment_1_3_2();

            state._fsp--;


            }

             after(grammarAccess.getExpression5Access().getRightAssignment_1_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression5__Group_1_3__2__Impl"


    // $ANTLR start "rule__Expression4__Group__0"
    // InternalHale.g:1921:1: rule__Expression4__Group__0 : rule__Expression4__Group__0__Impl rule__Expression4__Group__1 ;
    public final void rule__Expression4__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1925:1: ( rule__Expression4__Group__0__Impl rule__Expression4__Group__1 )
            // InternalHale.g:1926:2: rule__Expression4__Group__0__Impl rule__Expression4__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Expression4__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression4__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression4__Group__0"


    // $ANTLR start "rule__Expression4__Group__0__Impl"
    // InternalHale.g:1933:1: rule__Expression4__Group__0__Impl : ( ruleExpression3 ) ;
    public final void rule__Expression4__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1937:1: ( ( ruleExpression3 ) )
            // InternalHale.g:1938:1: ( ruleExpression3 )
            {
            // InternalHale.g:1938:1: ( ruleExpression3 )
            // InternalHale.g:1939:2: ruleExpression3
            {
             before(grammarAccess.getExpression4Access().getExpression3ParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression3();

            state._fsp--;

             after(grammarAccess.getExpression4Access().getExpression3ParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression4__Group__0__Impl"


    // $ANTLR start "rule__Expression4__Group__1"
    // InternalHale.g:1948:1: rule__Expression4__Group__1 : rule__Expression4__Group__1__Impl ;
    public final void rule__Expression4__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1952:1: ( rule__Expression4__Group__1__Impl )
            // InternalHale.g:1953:2: rule__Expression4__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression4__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression4__Group__1"


    // $ANTLR start "rule__Expression4__Group__1__Impl"
    // InternalHale.g:1959:1: rule__Expression4__Group__1__Impl : ( ( rule__Expression4__Alternatives_1 )* ) ;
    public final void rule__Expression4__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1963:1: ( ( ( rule__Expression4__Alternatives_1 )* ) )
            // InternalHale.g:1964:1: ( ( rule__Expression4__Alternatives_1 )* )
            {
            // InternalHale.g:1964:1: ( ( rule__Expression4__Alternatives_1 )* )
            // InternalHale.g:1965:2: ( rule__Expression4__Alternatives_1 )*
            {
             before(grammarAccess.getExpression4Access().getAlternatives_1()); 
            // InternalHale.g:1966:2: ( rule__Expression4__Alternatives_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=23 && LA15_0<=24)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalHale.g:1966:3: rule__Expression4__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Expression4__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getExpression4Access().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression4__Group__1__Impl"


    // $ANTLR start "rule__Expression4__Group_1_0__0"
    // InternalHale.g:1975:1: rule__Expression4__Group_1_0__0 : rule__Expression4__Group_1_0__0__Impl rule__Expression4__Group_1_0__1 ;
    public final void rule__Expression4__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1979:1: ( rule__Expression4__Group_1_0__0__Impl rule__Expression4__Group_1_0__1 )
            // InternalHale.g:1980:2: rule__Expression4__Group_1_0__0__Impl rule__Expression4__Group_1_0__1
            {
            pushFollow(FOLLOW_21);
            rule__Expression4__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression4__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression4__Group_1_0__0"


    // $ANTLR start "rule__Expression4__Group_1_0__0__Impl"
    // InternalHale.g:1987:1: rule__Expression4__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Expression4__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1991:1: ( ( () ) )
            // InternalHale.g:1992:1: ( () )
            {
            // InternalHale.g:1992:1: ( () )
            // InternalHale.g:1993:2: ()
            {
             before(grammarAccess.getExpression4Access().getAdditionLeftAction_1_0_0()); 
            // InternalHale.g:1994:2: ()
            // InternalHale.g:1994:3: 
            {
            }

             after(grammarAccess.getExpression4Access().getAdditionLeftAction_1_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression4__Group_1_0__0__Impl"


    // $ANTLR start "rule__Expression4__Group_1_0__1"
    // InternalHale.g:2002:1: rule__Expression4__Group_1_0__1 : rule__Expression4__Group_1_0__1__Impl rule__Expression4__Group_1_0__2 ;
    public final void rule__Expression4__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2006:1: ( rule__Expression4__Group_1_0__1__Impl rule__Expression4__Group_1_0__2 )
            // InternalHale.g:2007:2: rule__Expression4__Group_1_0__1__Impl rule__Expression4__Group_1_0__2
            {
            pushFollow(FOLLOW_3);
            rule__Expression4__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression4__Group_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression4__Group_1_0__1"


    // $ANTLR start "rule__Expression4__Group_1_0__1__Impl"
    // InternalHale.g:2014:1: rule__Expression4__Group_1_0__1__Impl : ( '+' ) ;
    public final void rule__Expression4__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2018:1: ( ( '+' ) )
            // InternalHale.g:2019:1: ( '+' )
            {
            // InternalHale.g:2019:1: ( '+' )
            // InternalHale.g:2020:2: '+'
            {
             before(grammarAccess.getExpression4Access().getPlusSignKeyword_1_0_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getExpression4Access().getPlusSignKeyword_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression4__Group_1_0__1__Impl"


    // $ANTLR start "rule__Expression4__Group_1_0__2"
    // InternalHale.g:2029:1: rule__Expression4__Group_1_0__2 : rule__Expression4__Group_1_0__2__Impl ;
    public final void rule__Expression4__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2033:1: ( rule__Expression4__Group_1_0__2__Impl )
            // InternalHale.g:2034:2: rule__Expression4__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression4__Group_1_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression4__Group_1_0__2"


    // $ANTLR start "rule__Expression4__Group_1_0__2__Impl"
    // InternalHale.g:2040:1: rule__Expression4__Group_1_0__2__Impl : ( ( rule__Expression4__RightAssignment_1_0_2 ) ) ;
    public final void rule__Expression4__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2044:1: ( ( ( rule__Expression4__RightAssignment_1_0_2 ) ) )
            // InternalHale.g:2045:1: ( ( rule__Expression4__RightAssignment_1_0_2 ) )
            {
            // InternalHale.g:2045:1: ( ( rule__Expression4__RightAssignment_1_0_2 ) )
            // InternalHale.g:2046:2: ( rule__Expression4__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getExpression4Access().getRightAssignment_1_0_2()); 
            // InternalHale.g:2047:2: ( rule__Expression4__RightAssignment_1_0_2 )
            // InternalHale.g:2047:3: rule__Expression4__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Expression4__RightAssignment_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getExpression4Access().getRightAssignment_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression4__Group_1_0__2__Impl"


    // $ANTLR start "rule__Expression4__Group_1_1__0"
    // InternalHale.g:2056:1: rule__Expression4__Group_1_1__0 : rule__Expression4__Group_1_1__0__Impl rule__Expression4__Group_1_1__1 ;
    public final void rule__Expression4__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2060:1: ( rule__Expression4__Group_1_1__0__Impl rule__Expression4__Group_1_1__1 )
            // InternalHale.g:2061:2: rule__Expression4__Group_1_1__0__Impl rule__Expression4__Group_1_1__1
            {
            pushFollow(FOLLOW_19);
            rule__Expression4__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression4__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression4__Group_1_1__0"


    // $ANTLR start "rule__Expression4__Group_1_1__0__Impl"
    // InternalHale.g:2068:1: rule__Expression4__Group_1_1__0__Impl : ( () ) ;
    public final void rule__Expression4__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2072:1: ( ( () ) )
            // InternalHale.g:2073:1: ( () )
            {
            // InternalHale.g:2073:1: ( () )
            // InternalHale.g:2074:2: ()
            {
             before(grammarAccess.getExpression4Access().getSubtractionLeftAction_1_1_0()); 
            // InternalHale.g:2075:2: ()
            // InternalHale.g:2075:3: 
            {
            }

             after(grammarAccess.getExpression4Access().getSubtractionLeftAction_1_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression4__Group_1_1__0__Impl"


    // $ANTLR start "rule__Expression4__Group_1_1__1"
    // InternalHale.g:2083:1: rule__Expression4__Group_1_1__1 : rule__Expression4__Group_1_1__1__Impl rule__Expression4__Group_1_1__2 ;
    public final void rule__Expression4__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2087:1: ( rule__Expression4__Group_1_1__1__Impl rule__Expression4__Group_1_1__2 )
            // InternalHale.g:2088:2: rule__Expression4__Group_1_1__1__Impl rule__Expression4__Group_1_1__2
            {
            pushFollow(FOLLOW_3);
            rule__Expression4__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression4__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression4__Group_1_1__1"


    // $ANTLR start "rule__Expression4__Group_1_1__1__Impl"
    // InternalHale.g:2095:1: rule__Expression4__Group_1_1__1__Impl : ( '-' ) ;
    public final void rule__Expression4__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2099:1: ( ( '-' ) )
            // InternalHale.g:2100:1: ( '-' )
            {
            // InternalHale.g:2100:1: ( '-' )
            // InternalHale.g:2101:2: '-'
            {
             before(grammarAccess.getExpression4Access().getHyphenMinusKeyword_1_1_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getExpression4Access().getHyphenMinusKeyword_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression4__Group_1_1__1__Impl"


    // $ANTLR start "rule__Expression4__Group_1_1__2"
    // InternalHale.g:2110:1: rule__Expression4__Group_1_1__2 : rule__Expression4__Group_1_1__2__Impl ;
    public final void rule__Expression4__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2114:1: ( rule__Expression4__Group_1_1__2__Impl )
            // InternalHale.g:2115:2: rule__Expression4__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression4__Group_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression4__Group_1_1__2"


    // $ANTLR start "rule__Expression4__Group_1_1__2__Impl"
    // InternalHale.g:2121:1: rule__Expression4__Group_1_1__2__Impl : ( ( rule__Expression4__RightAssignment_1_1_2 ) ) ;
    public final void rule__Expression4__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2125:1: ( ( ( rule__Expression4__RightAssignment_1_1_2 ) ) )
            // InternalHale.g:2126:1: ( ( rule__Expression4__RightAssignment_1_1_2 ) )
            {
            // InternalHale.g:2126:1: ( ( rule__Expression4__RightAssignment_1_1_2 ) )
            // InternalHale.g:2127:2: ( rule__Expression4__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getExpression4Access().getRightAssignment_1_1_2()); 
            // InternalHale.g:2128:2: ( rule__Expression4__RightAssignment_1_1_2 )
            // InternalHale.g:2128:3: rule__Expression4__RightAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Expression4__RightAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getExpression4Access().getRightAssignment_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression4__Group_1_1__2__Impl"


    // $ANTLR start "rule__Expression3__Group__0"
    // InternalHale.g:2137:1: rule__Expression3__Group__0 : rule__Expression3__Group__0__Impl rule__Expression3__Group__1 ;
    public final void rule__Expression3__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2141:1: ( rule__Expression3__Group__0__Impl rule__Expression3__Group__1 )
            // InternalHale.g:2142:2: rule__Expression3__Group__0__Impl rule__Expression3__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__Expression3__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression3__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression3__Group__0"


    // $ANTLR start "rule__Expression3__Group__0__Impl"
    // InternalHale.g:2149:1: rule__Expression3__Group__0__Impl : ( ruleExpression2 ) ;
    public final void rule__Expression3__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2153:1: ( ( ruleExpression2 ) )
            // InternalHale.g:2154:1: ( ruleExpression2 )
            {
            // InternalHale.g:2154:1: ( ruleExpression2 )
            // InternalHale.g:2155:2: ruleExpression2
            {
             before(grammarAccess.getExpression3Access().getExpression2ParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression2();

            state._fsp--;

             after(grammarAccess.getExpression3Access().getExpression2ParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression3__Group__0__Impl"


    // $ANTLR start "rule__Expression3__Group__1"
    // InternalHale.g:2164:1: rule__Expression3__Group__1 : rule__Expression3__Group__1__Impl ;
    public final void rule__Expression3__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2168:1: ( rule__Expression3__Group__1__Impl )
            // InternalHale.g:2169:2: rule__Expression3__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression3__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression3__Group__1"


    // $ANTLR start "rule__Expression3__Group__1__Impl"
    // InternalHale.g:2175:1: rule__Expression3__Group__1__Impl : ( ( rule__Expression3__Alternatives_1 )* ) ;
    public final void rule__Expression3__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2179:1: ( ( ( rule__Expression3__Alternatives_1 )* ) )
            // InternalHale.g:2180:1: ( ( rule__Expression3__Alternatives_1 )* )
            {
            // InternalHale.g:2180:1: ( ( rule__Expression3__Alternatives_1 )* )
            // InternalHale.g:2181:2: ( rule__Expression3__Alternatives_1 )*
            {
             before(grammarAccess.getExpression3Access().getAlternatives_1()); 
            // InternalHale.g:2182:2: ( rule__Expression3__Alternatives_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=25 && LA16_0<=27)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalHale.g:2182:3: rule__Expression3__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Expression3__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getExpression3Access().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression3__Group__1__Impl"


    // $ANTLR start "rule__Expression3__Group_1_0__0"
    // InternalHale.g:2191:1: rule__Expression3__Group_1_0__0 : rule__Expression3__Group_1_0__0__Impl rule__Expression3__Group_1_0__1 ;
    public final void rule__Expression3__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2195:1: ( rule__Expression3__Group_1_0__0__Impl rule__Expression3__Group_1_0__1 )
            // InternalHale.g:2196:2: rule__Expression3__Group_1_0__0__Impl rule__Expression3__Group_1_0__1
            {
            pushFollow(FOLLOW_24);
            rule__Expression3__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression3__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression3__Group_1_0__0"


    // $ANTLR start "rule__Expression3__Group_1_0__0__Impl"
    // InternalHale.g:2203:1: rule__Expression3__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Expression3__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2207:1: ( ( () ) )
            // InternalHale.g:2208:1: ( () )
            {
            // InternalHale.g:2208:1: ( () )
            // InternalHale.g:2209:2: ()
            {
             before(grammarAccess.getExpression3Access().getMultiplicationLeftAction_1_0_0()); 
            // InternalHale.g:2210:2: ()
            // InternalHale.g:2210:3: 
            {
            }

             after(grammarAccess.getExpression3Access().getMultiplicationLeftAction_1_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression3__Group_1_0__0__Impl"


    // $ANTLR start "rule__Expression3__Group_1_0__1"
    // InternalHale.g:2218:1: rule__Expression3__Group_1_0__1 : rule__Expression3__Group_1_0__1__Impl rule__Expression3__Group_1_0__2 ;
    public final void rule__Expression3__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2222:1: ( rule__Expression3__Group_1_0__1__Impl rule__Expression3__Group_1_0__2 )
            // InternalHale.g:2223:2: rule__Expression3__Group_1_0__1__Impl rule__Expression3__Group_1_0__2
            {
            pushFollow(FOLLOW_3);
            rule__Expression3__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression3__Group_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression3__Group_1_0__1"


    // $ANTLR start "rule__Expression3__Group_1_0__1__Impl"
    // InternalHale.g:2230:1: rule__Expression3__Group_1_0__1__Impl : ( '*' ) ;
    public final void rule__Expression3__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2234:1: ( ( '*' ) )
            // InternalHale.g:2235:1: ( '*' )
            {
            // InternalHale.g:2235:1: ( '*' )
            // InternalHale.g:2236:2: '*'
            {
             before(grammarAccess.getExpression3Access().getAsteriskKeyword_1_0_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getExpression3Access().getAsteriskKeyword_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression3__Group_1_0__1__Impl"


    // $ANTLR start "rule__Expression3__Group_1_0__2"
    // InternalHale.g:2245:1: rule__Expression3__Group_1_0__2 : rule__Expression3__Group_1_0__2__Impl ;
    public final void rule__Expression3__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2249:1: ( rule__Expression3__Group_1_0__2__Impl )
            // InternalHale.g:2250:2: rule__Expression3__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression3__Group_1_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression3__Group_1_0__2"


    // $ANTLR start "rule__Expression3__Group_1_0__2__Impl"
    // InternalHale.g:2256:1: rule__Expression3__Group_1_0__2__Impl : ( ( rule__Expression3__RightAssignment_1_0_2 ) ) ;
    public final void rule__Expression3__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2260:1: ( ( ( rule__Expression3__RightAssignment_1_0_2 ) ) )
            // InternalHale.g:2261:1: ( ( rule__Expression3__RightAssignment_1_0_2 ) )
            {
            // InternalHale.g:2261:1: ( ( rule__Expression3__RightAssignment_1_0_2 ) )
            // InternalHale.g:2262:2: ( rule__Expression3__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getExpression3Access().getRightAssignment_1_0_2()); 
            // InternalHale.g:2263:2: ( rule__Expression3__RightAssignment_1_0_2 )
            // InternalHale.g:2263:3: rule__Expression3__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Expression3__RightAssignment_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getExpression3Access().getRightAssignment_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression3__Group_1_0__2__Impl"


    // $ANTLR start "rule__Expression3__Group_1_1__0"
    // InternalHale.g:2272:1: rule__Expression3__Group_1_1__0 : rule__Expression3__Group_1_1__0__Impl rule__Expression3__Group_1_1__1 ;
    public final void rule__Expression3__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2276:1: ( rule__Expression3__Group_1_1__0__Impl rule__Expression3__Group_1_1__1 )
            // InternalHale.g:2277:2: rule__Expression3__Group_1_1__0__Impl rule__Expression3__Group_1_1__1
            {
            pushFollow(FOLLOW_25);
            rule__Expression3__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression3__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression3__Group_1_1__0"


    // $ANTLR start "rule__Expression3__Group_1_1__0__Impl"
    // InternalHale.g:2284:1: rule__Expression3__Group_1_1__0__Impl : ( () ) ;
    public final void rule__Expression3__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2288:1: ( ( () ) )
            // InternalHale.g:2289:1: ( () )
            {
            // InternalHale.g:2289:1: ( () )
            // InternalHale.g:2290:2: ()
            {
             before(grammarAccess.getExpression3Access().getDivisionLeftAction_1_1_0()); 
            // InternalHale.g:2291:2: ()
            // InternalHale.g:2291:3: 
            {
            }

             after(grammarAccess.getExpression3Access().getDivisionLeftAction_1_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression3__Group_1_1__0__Impl"


    // $ANTLR start "rule__Expression3__Group_1_1__1"
    // InternalHale.g:2299:1: rule__Expression3__Group_1_1__1 : rule__Expression3__Group_1_1__1__Impl rule__Expression3__Group_1_1__2 ;
    public final void rule__Expression3__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2303:1: ( rule__Expression3__Group_1_1__1__Impl rule__Expression3__Group_1_1__2 )
            // InternalHale.g:2304:2: rule__Expression3__Group_1_1__1__Impl rule__Expression3__Group_1_1__2
            {
            pushFollow(FOLLOW_3);
            rule__Expression3__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression3__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression3__Group_1_1__1"


    // $ANTLR start "rule__Expression3__Group_1_1__1__Impl"
    // InternalHale.g:2311:1: rule__Expression3__Group_1_1__1__Impl : ( '/' ) ;
    public final void rule__Expression3__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2315:1: ( ( '/' ) )
            // InternalHale.g:2316:1: ( '/' )
            {
            // InternalHale.g:2316:1: ( '/' )
            // InternalHale.g:2317:2: '/'
            {
             before(grammarAccess.getExpression3Access().getSolidusKeyword_1_1_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getExpression3Access().getSolidusKeyword_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression3__Group_1_1__1__Impl"


    // $ANTLR start "rule__Expression3__Group_1_1__2"
    // InternalHale.g:2326:1: rule__Expression3__Group_1_1__2 : rule__Expression3__Group_1_1__2__Impl ;
    public final void rule__Expression3__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2330:1: ( rule__Expression3__Group_1_1__2__Impl )
            // InternalHale.g:2331:2: rule__Expression3__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression3__Group_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression3__Group_1_1__2"


    // $ANTLR start "rule__Expression3__Group_1_1__2__Impl"
    // InternalHale.g:2337:1: rule__Expression3__Group_1_1__2__Impl : ( ( rule__Expression3__RightAssignment_1_1_2 ) ) ;
    public final void rule__Expression3__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2341:1: ( ( ( rule__Expression3__RightAssignment_1_1_2 ) ) )
            // InternalHale.g:2342:1: ( ( rule__Expression3__RightAssignment_1_1_2 ) )
            {
            // InternalHale.g:2342:1: ( ( rule__Expression3__RightAssignment_1_1_2 ) )
            // InternalHale.g:2343:2: ( rule__Expression3__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getExpression3Access().getRightAssignment_1_1_2()); 
            // InternalHale.g:2344:2: ( rule__Expression3__RightAssignment_1_1_2 )
            // InternalHale.g:2344:3: rule__Expression3__RightAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Expression3__RightAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getExpression3Access().getRightAssignment_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression3__Group_1_1__2__Impl"


    // $ANTLR start "rule__Expression3__Group_1_2__0"
    // InternalHale.g:2353:1: rule__Expression3__Group_1_2__0 : rule__Expression3__Group_1_2__0__Impl rule__Expression3__Group_1_2__1 ;
    public final void rule__Expression3__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2357:1: ( rule__Expression3__Group_1_2__0__Impl rule__Expression3__Group_1_2__1 )
            // InternalHale.g:2358:2: rule__Expression3__Group_1_2__0__Impl rule__Expression3__Group_1_2__1
            {
            pushFollow(FOLLOW_22);
            rule__Expression3__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression3__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression3__Group_1_2__0"


    // $ANTLR start "rule__Expression3__Group_1_2__0__Impl"
    // InternalHale.g:2365:1: rule__Expression3__Group_1_2__0__Impl : ( () ) ;
    public final void rule__Expression3__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2369:1: ( ( () ) )
            // InternalHale.g:2370:1: ( () )
            {
            // InternalHale.g:2370:1: ( () )
            // InternalHale.g:2371:2: ()
            {
             before(grammarAccess.getExpression3Access().getRemainderLeftAction_1_2_0()); 
            // InternalHale.g:2372:2: ()
            // InternalHale.g:2372:3: 
            {
            }

             after(grammarAccess.getExpression3Access().getRemainderLeftAction_1_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression3__Group_1_2__0__Impl"


    // $ANTLR start "rule__Expression3__Group_1_2__1"
    // InternalHale.g:2380:1: rule__Expression3__Group_1_2__1 : rule__Expression3__Group_1_2__1__Impl rule__Expression3__Group_1_2__2 ;
    public final void rule__Expression3__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2384:1: ( rule__Expression3__Group_1_2__1__Impl rule__Expression3__Group_1_2__2 )
            // InternalHale.g:2385:2: rule__Expression3__Group_1_2__1__Impl rule__Expression3__Group_1_2__2
            {
            pushFollow(FOLLOW_3);
            rule__Expression3__Group_1_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression3__Group_1_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression3__Group_1_2__1"


    // $ANTLR start "rule__Expression3__Group_1_2__1__Impl"
    // InternalHale.g:2392:1: rule__Expression3__Group_1_2__1__Impl : ( '%' ) ;
    public final void rule__Expression3__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2396:1: ( ( '%' ) )
            // InternalHale.g:2397:1: ( '%' )
            {
            // InternalHale.g:2397:1: ( '%' )
            // InternalHale.g:2398:2: '%'
            {
             before(grammarAccess.getExpression3Access().getPercentSignKeyword_1_2_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getExpression3Access().getPercentSignKeyword_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression3__Group_1_2__1__Impl"


    // $ANTLR start "rule__Expression3__Group_1_2__2"
    // InternalHale.g:2407:1: rule__Expression3__Group_1_2__2 : rule__Expression3__Group_1_2__2__Impl ;
    public final void rule__Expression3__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2411:1: ( rule__Expression3__Group_1_2__2__Impl )
            // InternalHale.g:2412:2: rule__Expression3__Group_1_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression3__Group_1_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression3__Group_1_2__2"


    // $ANTLR start "rule__Expression3__Group_1_2__2__Impl"
    // InternalHale.g:2418:1: rule__Expression3__Group_1_2__2__Impl : ( ( rule__Expression3__RightAssignment_1_2_2 ) ) ;
    public final void rule__Expression3__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2422:1: ( ( ( rule__Expression3__RightAssignment_1_2_2 ) ) )
            // InternalHale.g:2423:1: ( ( rule__Expression3__RightAssignment_1_2_2 ) )
            {
            // InternalHale.g:2423:1: ( ( rule__Expression3__RightAssignment_1_2_2 ) )
            // InternalHale.g:2424:2: ( rule__Expression3__RightAssignment_1_2_2 )
            {
             before(grammarAccess.getExpression3Access().getRightAssignment_1_2_2()); 
            // InternalHale.g:2425:2: ( rule__Expression3__RightAssignment_1_2_2 )
            // InternalHale.g:2425:3: rule__Expression3__RightAssignment_1_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Expression3__RightAssignment_1_2_2();

            state._fsp--;


            }

             after(grammarAccess.getExpression3Access().getRightAssignment_1_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression3__Group_1_2__2__Impl"


    // $ANTLR start "rule__Expression2__Group__0"
    // InternalHale.g:2434:1: rule__Expression2__Group__0 : rule__Expression2__Group__0__Impl rule__Expression2__Group__1 ;
    public final void rule__Expression2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2438:1: ( rule__Expression2__Group__0__Impl rule__Expression2__Group__1 )
            // InternalHale.g:2439:2: rule__Expression2__Group__0__Impl rule__Expression2__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__Expression2__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression2__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression2__Group__0"


    // $ANTLR start "rule__Expression2__Group__0__Impl"
    // InternalHale.g:2446:1: rule__Expression2__Group__0__Impl : ( ruleExpression1 ) ;
    public final void rule__Expression2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2450:1: ( ( ruleExpression1 ) )
            // InternalHale.g:2451:1: ( ruleExpression1 )
            {
            // InternalHale.g:2451:1: ( ruleExpression1 )
            // InternalHale.g:2452:2: ruleExpression1
            {
             before(grammarAccess.getExpression2Access().getExpression1ParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression1();

            state._fsp--;

             after(grammarAccess.getExpression2Access().getExpression1ParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression2__Group__0__Impl"


    // $ANTLR start "rule__Expression2__Group__1"
    // InternalHale.g:2461:1: rule__Expression2__Group__1 : rule__Expression2__Group__1__Impl ;
    public final void rule__Expression2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2465:1: ( rule__Expression2__Group__1__Impl )
            // InternalHale.g:2466:2: rule__Expression2__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression2__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression2__Group__1"


    // $ANTLR start "rule__Expression2__Group__1__Impl"
    // InternalHale.g:2472:1: rule__Expression2__Group__1__Impl : ( ( rule__Expression2__Group_1__0 )* ) ;
    public final void rule__Expression2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2476:1: ( ( ( rule__Expression2__Group_1__0 )* ) )
            // InternalHale.g:2477:1: ( ( rule__Expression2__Group_1__0 )* )
            {
            // InternalHale.g:2477:1: ( ( rule__Expression2__Group_1__0 )* )
            // InternalHale.g:2478:2: ( rule__Expression2__Group_1__0 )*
            {
             before(grammarAccess.getExpression2Access().getGroup_1()); 
            // InternalHale.g:2479:2: ( rule__Expression2__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==28) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalHale.g:2479:3: rule__Expression2__Group_1__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__Expression2__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getExpression2Access().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression2__Group__1__Impl"


    // $ANTLR start "rule__Expression2__Group_1__0"
    // InternalHale.g:2488:1: rule__Expression2__Group_1__0 : rule__Expression2__Group_1__0__Impl rule__Expression2__Group_1__1 ;
    public final void rule__Expression2__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2492:1: ( rule__Expression2__Group_1__0__Impl rule__Expression2__Group_1__1 )
            // InternalHale.g:2493:2: rule__Expression2__Group_1__0__Impl rule__Expression2__Group_1__1
            {
            pushFollow(FOLLOW_26);
            rule__Expression2__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression2__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression2__Group_1__0"


    // $ANTLR start "rule__Expression2__Group_1__0__Impl"
    // InternalHale.g:2500:1: rule__Expression2__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression2__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2504:1: ( ( () ) )
            // InternalHale.g:2505:1: ( () )
            {
            // InternalHale.g:2505:1: ( () )
            // InternalHale.g:2506:2: ()
            {
             before(grammarAccess.getExpression2Access().getExponentiationLeftAction_1_0()); 
            // InternalHale.g:2507:2: ()
            // InternalHale.g:2507:3: 
            {
            }

             after(grammarAccess.getExpression2Access().getExponentiationLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression2__Group_1__0__Impl"


    // $ANTLR start "rule__Expression2__Group_1__1"
    // InternalHale.g:2515:1: rule__Expression2__Group_1__1 : rule__Expression2__Group_1__1__Impl rule__Expression2__Group_1__2 ;
    public final void rule__Expression2__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2519:1: ( rule__Expression2__Group_1__1__Impl rule__Expression2__Group_1__2 )
            // InternalHale.g:2520:2: rule__Expression2__Group_1__1__Impl rule__Expression2__Group_1__2
            {
            pushFollow(FOLLOW_3);
            rule__Expression2__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression2__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression2__Group_1__1"


    // $ANTLR start "rule__Expression2__Group_1__1__Impl"
    // InternalHale.g:2527:1: rule__Expression2__Group_1__1__Impl : ( '**' ) ;
    public final void rule__Expression2__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2531:1: ( ( '**' ) )
            // InternalHale.g:2532:1: ( '**' )
            {
            // InternalHale.g:2532:1: ( '**' )
            // InternalHale.g:2533:2: '**'
            {
             before(grammarAccess.getExpression2Access().getAsteriskAsteriskKeyword_1_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getExpression2Access().getAsteriskAsteriskKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression2__Group_1__1__Impl"


    // $ANTLR start "rule__Expression2__Group_1__2"
    // InternalHale.g:2542:1: rule__Expression2__Group_1__2 : rule__Expression2__Group_1__2__Impl ;
    public final void rule__Expression2__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2546:1: ( rule__Expression2__Group_1__2__Impl )
            // InternalHale.g:2547:2: rule__Expression2__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression2__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression2__Group_1__2"


    // $ANTLR start "rule__Expression2__Group_1__2__Impl"
    // InternalHale.g:2553:1: rule__Expression2__Group_1__2__Impl : ( ( rule__Expression2__RightAssignment_1_2 ) ) ;
    public final void rule__Expression2__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2557:1: ( ( ( rule__Expression2__RightAssignment_1_2 ) ) )
            // InternalHale.g:2558:1: ( ( rule__Expression2__RightAssignment_1_2 ) )
            {
            // InternalHale.g:2558:1: ( ( rule__Expression2__RightAssignment_1_2 ) )
            // InternalHale.g:2559:2: ( rule__Expression2__RightAssignment_1_2 )
            {
             before(grammarAccess.getExpression2Access().getRightAssignment_1_2()); 
            // InternalHale.g:2560:2: ( rule__Expression2__RightAssignment_1_2 )
            // InternalHale.g:2560:3: rule__Expression2__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Expression2__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getExpression2Access().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression2__Group_1__2__Impl"


    // $ANTLR start "rule__Expression1__Group_0__0"
    // InternalHale.g:2569:1: rule__Expression1__Group_0__0 : rule__Expression1__Group_0__0__Impl rule__Expression1__Group_0__1 ;
    public final void rule__Expression1__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2573:1: ( rule__Expression1__Group_0__0__Impl rule__Expression1__Group_0__1 )
            // InternalHale.g:2574:2: rule__Expression1__Group_0__0__Impl rule__Expression1__Group_0__1
            {
            pushFollow(FOLLOW_28);
            rule__Expression1__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression1__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression1__Group_0__0"


    // $ANTLR start "rule__Expression1__Group_0__0__Impl"
    // InternalHale.g:2581:1: rule__Expression1__Group_0__0__Impl : ( () ) ;
    public final void rule__Expression1__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2585:1: ( ( () ) )
            // InternalHale.g:2586:1: ( () )
            {
            // InternalHale.g:2586:1: ( () )
            // InternalHale.g:2587:2: ()
            {
             before(grammarAccess.getExpression1Access().getUnaryNegationAction_0_0()); 
            // InternalHale.g:2588:2: ()
            // InternalHale.g:2588:3: 
            {
            }

             after(grammarAccess.getExpression1Access().getUnaryNegationAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression1__Group_0__0__Impl"


    // $ANTLR start "rule__Expression1__Group_0__1"
    // InternalHale.g:2596:1: rule__Expression1__Group_0__1 : rule__Expression1__Group_0__1__Impl rule__Expression1__Group_0__2 ;
    public final void rule__Expression1__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2600:1: ( rule__Expression1__Group_0__1__Impl rule__Expression1__Group_0__2 )
            // InternalHale.g:2601:2: rule__Expression1__Group_0__1__Impl rule__Expression1__Group_0__2
            {
            pushFollow(FOLLOW_3);
            rule__Expression1__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression1__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression1__Group_0__1"


    // $ANTLR start "rule__Expression1__Group_0__1__Impl"
    // InternalHale.g:2608:1: rule__Expression1__Group_0__1__Impl : ( '-' ) ;
    public final void rule__Expression1__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2612:1: ( ( '-' ) )
            // InternalHale.g:2613:1: ( '-' )
            {
            // InternalHale.g:2613:1: ( '-' )
            // InternalHale.g:2614:2: '-'
            {
             before(grammarAccess.getExpression1Access().getHyphenMinusKeyword_0_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getExpression1Access().getHyphenMinusKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression1__Group_0__1__Impl"


    // $ANTLR start "rule__Expression1__Group_0__2"
    // InternalHale.g:2623:1: rule__Expression1__Group_0__2 : rule__Expression1__Group_0__2__Impl ;
    public final void rule__Expression1__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2627:1: ( rule__Expression1__Group_0__2__Impl )
            // InternalHale.g:2628:2: rule__Expression1__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression1__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression1__Group_0__2"


    // $ANTLR start "rule__Expression1__Group_0__2__Impl"
    // InternalHale.g:2634:1: rule__Expression1__Group_0__2__Impl : ( ( rule__Expression1__InnerAssignment_0_2 ) ) ;
    public final void rule__Expression1__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2638:1: ( ( ( rule__Expression1__InnerAssignment_0_2 ) ) )
            // InternalHale.g:2639:1: ( ( rule__Expression1__InnerAssignment_0_2 ) )
            {
            // InternalHale.g:2639:1: ( ( rule__Expression1__InnerAssignment_0_2 ) )
            // InternalHale.g:2640:2: ( rule__Expression1__InnerAssignment_0_2 )
            {
             before(grammarAccess.getExpression1Access().getInnerAssignment_0_2()); 
            // InternalHale.g:2641:2: ( rule__Expression1__InnerAssignment_0_2 )
            // InternalHale.g:2641:3: rule__Expression1__InnerAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Expression1__InnerAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getExpression1Access().getInnerAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression1__Group_0__2__Impl"


    // $ANTLR start "rule__Expression1__Group_1__0"
    // InternalHale.g:2650:1: rule__Expression1__Group_1__0 : rule__Expression1__Group_1__0__Impl rule__Expression1__Group_1__1 ;
    public final void rule__Expression1__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2654:1: ( rule__Expression1__Group_1__0__Impl rule__Expression1__Group_1__1 )
            // InternalHale.g:2655:2: rule__Expression1__Group_1__0__Impl rule__Expression1__Group_1__1
            {
            pushFollow(FOLLOW_29);
            rule__Expression1__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression1__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression1__Group_1__0"


    // $ANTLR start "rule__Expression1__Group_1__0__Impl"
    // InternalHale.g:2662:1: rule__Expression1__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression1__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2666:1: ( ( () ) )
            // InternalHale.g:2667:1: ( () )
            {
            // InternalHale.g:2667:1: ( () )
            // InternalHale.g:2668:2: ()
            {
             before(grammarAccess.getExpression1Access().getLogicalNotAction_1_0()); 
            // InternalHale.g:2669:2: ()
            // InternalHale.g:2669:3: 
            {
            }

             after(grammarAccess.getExpression1Access().getLogicalNotAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression1__Group_1__0__Impl"


    // $ANTLR start "rule__Expression1__Group_1__1"
    // InternalHale.g:2677:1: rule__Expression1__Group_1__1 : rule__Expression1__Group_1__1__Impl rule__Expression1__Group_1__2 ;
    public final void rule__Expression1__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2681:1: ( rule__Expression1__Group_1__1__Impl rule__Expression1__Group_1__2 )
            // InternalHale.g:2682:2: rule__Expression1__Group_1__1__Impl rule__Expression1__Group_1__2
            {
            pushFollow(FOLLOW_3);
            rule__Expression1__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression1__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression1__Group_1__1"


    // $ANTLR start "rule__Expression1__Group_1__1__Impl"
    // InternalHale.g:2689:1: rule__Expression1__Group_1__1__Impl : ( 'not' ) ;
    public final void rule__Expression1__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2693:1: ( ( 'not' ) )
            // InternalHale.g:2694:1: ( 'not' )
            {
            // InternalHale.g:2694:1: ( 'not' )
            // InternalHale.g:2695:2: 'not'
            {
             before(grammarAccess.getExpression1Access().getNotKeyword_1_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getExpression1Access().getNotKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression1__Group_1__1__Impl"


    // $ANTLR start "rule__Expression1__Group_1__2"
    // InternalHale.g:2704:1: rule__Expression1__Group_1__2 : rule__Expression1__Group_1__2__Impl ;
    public final void rule__Expression1__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2708:1: ( rule__Expression1__Group_1__2__Impl )
            // InternalHale.g:2709:2: rule__Expression1__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression1__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression1__Group_1__2"


    // $ANTLR start "rule__Expression1__Group_1__2__Impl"
    // InternalHale.g:2715:1: rule__Expression1__Group_1__2__Impl : ( ( rule__Expression1__InnerAssignment_1_2 ) ) ;
    public final void rule__Expression1__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2719:1: ( ( ( rule__Expression1__InnerAssignment_1_2 ) ) )
            // InternalHale.g:2720:1: ( ( rule__Expression1__InnerAssignment_1_2 ) )
            {
            // InternalHale.g:2720:1: ( ( rule__Expression1__InnerAssignment_1_2 ) )
            // InternalHale.g:2721:2: ( rule__Expression1__InnerAssignment_1_2 )
            {
             before(grammarAccess.getExpression1Access().getInnerAssignment_1_2()); 
            // InternalHale.g:2722:2: ( rule__Expression1__InnerAssignment_1_2 )
            // InternalHale.g:2722:3: rule__Expression1__InnerAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Expression1__InnerAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getExpression1Access().getInnerAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression1__Group_1__2__Impl"


    // $ANTLR start "rule__Primary__Group_2__0"
    // InternalHale.g:2731:1: rule__Primary__Group_2__0 : rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 ;
    public final void rule__Primary__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2735:1: ( rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 )
            // InternalHale.g:2736:2: rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Primary__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__0"


    // $ANTLR start "rule__Primary__Group_2__0__Impl"
    // InternalHale.g:2743:1: rule__Primary__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2747:1: ( ( '(' ) )
            // InternalHale.g:2748:1: ( '(' )
            {
            // InternalHale.g:2748:1: ( '(' )
            // InternalHale.g:2749:2: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__0__Impl"


    // $ANTLR start "rule__Primary__Group_2__1"
    // InternalHale.g:2758:1: rule__Primary__Group_2__1 : rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 ;
    public final void rule__Primary__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2762:1: ( rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 )
            // InternalHale.g:2763:2: rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2
            {
            pushFollow(FOLLOW_30);
            rule__Primary__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__1"


    // $ANTLR start "rule__Primary__Group_2__1__Impl"
    // InternalHale.g:2770:1: rule__Primary__Group_2__1__Impl : ( ruleExpression ) ;
    public final void rule__Primary__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2774:1: ( ( ruleExpression ) )
            // InternalHale.g:2775:1: ( ruleExpression )
            {
            // InternalHale.g:2775:1: ( ruleExpression )
            // InternalHale.g:2776:2: ruleExpression
            {
             before(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_2_1()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__1__Impl"


    // $ANTLR start "rule__Primary__Group_2__2"
    // InternalHale.g:2785:1: rule__Primary__Group_2__2 : rule__Primary__Group_2__2__Impl ;
    public final void rule__Primary__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2789:1: ( rule__Primary__Group_2__2__Impl )
            // InternalHale.g:2790:2: rule__Primary__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__2"


    // $ANTLR start "rule__Primary__Group_2__2__Impl"
    // InternalHale.g:2796:1: rule__Primary__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2800:1: ( ( ')' ) )
            // InternalHale.g:2801:1: ( ')' )
            {
            // InternalHale.g:2801:1: ( ')' )
            // InternalHale.g:2802:2: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_2_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__2__Impl"


    // $ANTLR start "rule__Hale__StatementsAssignment_1"
    // InternalHale.g:2812:1: rule__Hale__StatementsAssignment_1 : ( ruleStatement ) ;
    public final void rule__Hale__StatementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2816:1: ( ( ruleStatement ) )
            // InternalHale.g:2817:2: ( ruleStatement )
            {
            // InternalHale.g:2817:2: ( ruleStatement )
            // InternalHale.g:2818:3: ruleStatement
            {
             before(grammarAccess.getHaleAccess().getStatementsStatementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getHaleAccess().getStatementsStatementParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hale__StatementsAssignment_1"


    // $ANTLR start "rule__Print__ValueAssignment_1"
    // InternalHale.g:2827:1: rule__Print__ValueAssignment_1 : ( ruleExpression ) ;
    public final void rule__Print__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2831:1: ( ( ruleExpression ) )
            // InternalHale.g:2832:2: ( ruleExpression )
            {
            // InternalHale.g:2832:2: ( ruleExpression )
            // InternalHale.g:2833:3: ruleExpression
            {
             before(grammarAccess.getPrintAccess().getValueExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getPrintAccess().getValueExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Print__ValueAssignment_1"


    // $ANTLR start "rule__Binding__MutableAssignment_1"
    // InternalHale.g:2842:1: rule__Binding__MutableAssignment_1 : ( ( 'mut' ) ) ;
    public final void rule__Binding__MutableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2846:1: ( ( ( 'mut' ) ) )
            // InternalHale.g:2847:2: ( ( 'mut' ) )
            {
            // InternalHale.g:2847:2: ( ( 'mut' ) )
            // InternalHale.g:2848:3: ( 'mut' )
            {
             before(grammarAccess.getBindingAccess().getMutableMutKeyword_1_0()); 
            // InternalHale.g:2849:3: ( 'mut' )
            // InternalHale.g:2850:4: 'mut'
            {
             before(grammarAccess.getBindingAccess().getMutableMutKeyword_1_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getBindingAccess().getMutableMutKeyword_1_0()); 

            }

             after(grammarAccess.getBindingAccess().getMutableMutKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__MutableAssignment_1"


    // $ANTLR start "rule__Binding__NameAssignment_2"
    // InternalHale.g:2861:1: rule__Binding__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Binding__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2865:1: ( ( RULE_ID ) )
            // InternalHale.g:2866:2: ( RULE_ID )
            {
            // InternalHale.g:2866:2: ( RULE_ID )
            // InternalHale.g:2867:3: RULE_ID
            {
             before(grammarAccess.getBindingAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBindingAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__NameAssignment_2"


    // $ANTLR start "rule__Binding__ValueAssignment_4"
    // InternalHale.g:2876:1: rule__Binding__ValueAssignment_4 : ( ruleExpression ) ;
    public final void rule__Binding__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2880:1: ( ( ruleExpression ) )
            // InternalHale.g:2881:2: ( ruleExpression )
            {
            // InternalHale.g:2881:2: ( ruleExpression )
            // InternalHale.g:2882:3: ruleExpression
            {
             before(grammarAccess.getBindingAccess().getValueExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getBindingAccess().getValueExpressionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__ValueAssignment_4"


    // $ANTLR start "rule__BindingReference__BindingAssignment"
    // InternalHale.g:2891:1: rule__BindingReference__BindingAssignment : ( ( RULE_ID ) ) ;
    public final void rule__BindingReference__BindingAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2895:1: ( ( ( RULE_ID ) ) )
            // InternalHale.g:2896:2: ( ( RULE_ID ) )
            {
            // InternalHale.g:2896:2: ( ( RULE_ID ) )
            // InternalHale.g:2897:3: ( RULE_ID )
            {
             before(grammarAccess.getBindingReferenceAccess().getBindingBindingCrossReference_0()); 
            // InternalHale.g:2898:3: ( RULE_ID )
            // InternalHale.g:2899:4: RULE_ID
            {
             before(grammarAccess.getBindingReferenceAccess().getBindingBindingIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBindingReferenceAccess().getBindingBindingIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getBindingReferenceAccess().getBindingBindingCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BindingReference__BindingAssignment"


    // $ANTLR start "rule__Assignment__BindingAssignment_0"
    // InternalHale.g:2910:1: rule__Assignment__BindingAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Assignment__BindingAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2914:1: ( ( ( RULE_ID ) ) )
            // InternalHale.g:2915:2: ( ( RULE_ID ) )
            {
            // InternalHale.g:2915:2: ( ( RULE_ID ) )
            // InternalHale.g:2916:3: ( RULE_ID )
            {
             before(grammarAccess.getAssignmentAccess().getBindingBindingCrossReference_0_0()); 
            // InternalHale.g:2917:3: ( RULE_ID )
            // InternalHale.g:2918:4: RULE_ID
            {
             before(grammarAccess.getAssignmentAccess().getBindingBindingIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAssignmentAccess().getBindingBindingIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getAssignmentAccess().getBindingBindingCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__BindingAssignment_0"


    // $ANTLR start "rule__Assignment__ValueAssignment_2"
    // InternalHale.g:2929:1: rule__Assignment__ValueAssignment_2 : ( ruleExpression ) ;
    public final void rule__Assignment__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2933:1: ( ( ruleExpression ) )
            // InternalHale.g:2934:2: ( ruleExpression )
            {
            // InternalHale.g:2934:2: ( ruleExpression )
            // InternalHale.g:2935:3: ruleExpression
            {
             before(grammarAccess.getAssignmentAccess().getValueExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getAssignmentAccess().getValueExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__ValueAssignment_2"


    // $ANTLR start "rule__Expression7__RightAssignment_1_0_2"
    // InternalHale.g:2944:1: rule__Expression7__RightAssignment_1_0_2 : ( ruleExpression6 ) ;
    public final void rule__Expression7__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2948:1: ( ( ruleExpression6 ) )
            // InternalHale.g:2949:2: ( ruleExpression6 )
            {
            // InternalHale.g:2949:2: ( ruleExpression6 )
            // InternalHale.g:2950:3: ruleExpression6
            {
             before(grammarAccess.getExpression7Access().getRightExpression6ParserRuleCall_1_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression6();

            state._fsp--;

             after(grammarAccess.getExpression7Access().getRightExpression6ParserRuleCall_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression7__RightAssignment_1_0_2"


    // $ANTLR start "rule__Expression7__RightAssignment_1_1_2"
    // InternalHale.g:2959:1: rule__Expression7__RightAssignment_1_1_2 : ( ruleExpression6 ) ;
    public final void rule__Expression7__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2963:1: ( ( ruleExpression6 ) )
            // InternalHale.g:2964:2: ( ruleExpression6 )
            {
            // InternalHale.g:2964:2: ( ruleExpression6 )
            // InternalHale.g:2965:3: ruleExpression6
            {
             before(grammarAccess.getExpression7Access().getRightExpression6ParserRuleCall_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression6();

            state._fsp--;

             after(grammarAccess.getExpression7Access().getRightExpression6ParserRuleCall_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression7__RightAssignment_1_1_2"


    // $ANTLR start "rule__Expression6__RightAssignment_1_0_2"
    // InternalHale.g:2974:1: rule__Expression6__RightAssignment_1_0_2 : ( ruleExpression5 ) ;
    public final void rule__Expression6__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2978:1: ( ( ruleExpression5 ) )
            // InternalHale.g:2979:2: ( ruleExpression5 )
            {
            // InternalHale.g:2979:2: ( ruleExpression5 )
            // InternalHale.g:2980:3: ruleExpression5
            {
             before(grammarAccess.getExpression6Access().getRightExpression5ParserRuleCall_1_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression5();

            state._fsp--;

             after(grammarAccess.getExpression6Access().getRightExpression5ParserRuleCall_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression6__RightAssignment_1_0_2"


    // $ANTLR start "rule__Expression6__RightAssignment_1_1_2"
    // InternalHale.g:2989:1: rule__Expression6__RightAssignment_1_1_2 : ( ruleExpression5 ) ;
    public final void rule__Expression6__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2993:1: ( ( ruleExpression5 ) )
            // InternalHale.g:2994:2: ( ruleExpression5 )
            {
            // InternalHale.g:2994:2: ( ruleExpression5 )
            // InternalHale.g:2995:3: ruleExpression5
            {
             before(grammarAccess.getExpression6Access().getRightExpression5ParserRuleCall_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression5();

            state._fsp--;

             after(grammarAccess.getExpression6Access().getRightExpression5ParserRuleCall_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression6__RightAssignment_1_1_2"


    // $ANTLR start "rule__Expression5__RightAssignment_1_0_2"
    // InternalHale.g:3004:1: rule__Expression5__RightAssignment_1_0_2 : ( ruleExpression4 ) ;
    public final void rule__Expression5__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3008:1: ( ( ruleExpression4 ) )
            // InternalHale.g:3009:2: ( ruleExpression4 )
            {
            // InternalHale.g:3009:2: ( ruleExpression4 )
            // InternalHale.g:3010:3: ruleExpression4
            {
             before(grammarAccess.getExpression5Access().getRightExpression4ParserRuleCall_1_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression4();

            state._fsp--;

             after(grammarAccess.getExpression5Access().getRightExpression4ParserRuleCall_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression5__RightAssignment_1_0_2"


    // $ANTLR start "rule__Expression5__RightAssignment_1_1_2"
    // InternalHale.g:3019:1: rule__Expression5__RightAssignment_1_1_2 : ( ruleExpression4 ) ;
    public final void rule__Expression5__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3023:1: ( ( ruleExpression4 ) )
            // InternalHale.g:3024:2: ( ruleExpression4 )
            {
            // InternalHale.g:3024:2: ( ruleExpression4 )
            // InternalHale.g:3025:3: ruleExpression4
            {
             before(grammarAccess.getExpression5Access().getRightExpression4ParserRuleCall_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression4();

            state._fsp--;

             after(grammarAccess.getExpression5Access().getRightExpression4ParserRuleCall_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression5__RightAssignment_1_1_2"


    // $ANTLR start "rule__Expression5__RightAssignment_1_2_2"
    // InternalHale.g:3034:1: rule__Expression5__RightAssignment_1_2_2 : ( ruleExpression4 ) ;
    public final void rule__Expression5__RightAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3038:1: ( ( ruleExpression4 ) )
            // InternalHale.g:3039:2: ( ruleExpression4 )
            {
            // InternalHale.g:3039:2: ( ruleExpression4 )
            // InternalHale.g:3040:3: ruleExpression4
            {
             before(grammarAccess.getExpression5Access().getRightExpression4ParserRuleCall_1_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression4();

            state._fsp--;

             after(grammarAccess.getExpression5Access().getRightExpression4ParserRuleCall_1_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression5__RightAssignment_1_2_2"


    // $ANTLR start "rule__Expression5__RightAssignment_1_3_2"
    // InternalHale.g:3049:1: rule__Expression5__RightAssignment_1_3_2 : ( ruleExpression4 ) ;
    public final void rule__Expression5__RightAssignment_1_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3053:1: ( ( ruleExpression4 ) )
            // InternalHale.g:3054:2: ( ruleExpression4 )
            {
            // InternalHale.g:3054:2: ( ruleExpression4 )
            // InternalHale.g:3055:3: ruleExpression4
            {
             before(grammarAccess.getExpression5Access().getRightExpression4ParserRuleCall_1_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression4();

            state._fsp--;

             after(grammarAccess.getExpression5Access().getRightExpression4ParserRuleCall_1_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression5__RightAssignment_1_3_2"


    // $ANTLR start "rule__Expression4__RightAssignment_1_0_2"
    // InternalHale.g:3064:1: rule__Expression4__RightAssignment_1_0_2 : ( ruleExpression3 ) ;
    public final void rule__Expression4__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3068:1: ( ( ruleExpression3 ) )
            // InternalHale.g:3069:2: ( ruleExpression3 )
            {
            // InternalHale.g:3069:2: ( ruleExpression3 )
            // InternalHale.g:3070:3: ruleExpression3
            {
             before(grammarAccess.getExpression4Access().getRightExpression3ParserRuleCall_1_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression3();

            state._fsp--;

             after(grammarAccess.getExpression4Access().getRightExpression3ParserRuleCall_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression4__RightAssignment_1_0_2"


    // $ANTLR start "rule__Expression4__RightAssignment_1_1_2"
    // InternalHale.g:3079:1: rule__Expression4__RightAssignment_1_1_2 : ( ruleExpression3 ) ;
    public final void rule__Expression4__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3083:1: ( ( ruleExpression3 ) )
            // InternalHale.g:3084:2: ( ruleExpression3 )
            {
            // InternalHale.g:3084:2: ( ruleExpression3 )
            // InternalHale.g:3085:3: ruleExpression3
            {
             before(grammarAccess.getExpression4Access().getRightExpression3ParserRuleCall_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression3();

            state._fsp--;

             after(grammarAccess.getExpression4Access().getRightExpression3ParserRuleCall_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression4__RightAssignment_1_1_2"


    // $ANTLR start "rule__Expression3__RightAssignment_1_0_2"
    // InternalHale.g:3094:1: rule__Expression3__RightAssignment_1_0_2 : ( ruleExpression2 ) ;
    public final void rule__Expression3__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3098:1: ( ( ruleExpression2 ) )
            // InternalHale.g:3099:2: ( ruleExpression2 )
            {
            // InternalHale.g:3099:2: ( ruleExpression2 )
            // InternalHale.g:3100:3: ruleExpression2
            {
             before(grammarAccess.getExpression3Access().getRightExpression2ParserRuleCall_1_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression2();

            state._fsp--;

             after(grammarAccess.getExpression3Access().getRightExpression2ParserRuleCall_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression3__RightAssignment_1_0_2"


    // $ANTLR start "rule__Expression3__RightAssignment_1_1_2"
    // InternalHale.g:3109:1: rule__Expression3__RightAssignment_1_1_2 : ( ruleExpression2 ) ;
    public final void rule__Expression3__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3113:1: ( ( ruleExpression2 ) )
            // InternalHale.g:3114:2: ( ruleExpression2 )
            {
            // InternalHale.g:3114:2: ( ruleExpression2 )
            // InternalHale.g:3115:3: ruleExpression2
            {
             before(grammarAccess.getExpression3Access().getRightExpression2ParserRuleCall_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression2();

            state._fsp--;

             after(grammarAccess.getExpression3Access().getRightExpression2ParserRuleCall_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression3__RightAssignment_1_1_2"


    // $ANTLR start "rule__Expression3__RightAssignment_1_2_2"
    // InternalHale.g:3124:1: rule__Expression3__RightAssignment_1_2_2 : ( ruleExpression2 ) ;
    public final void rule__Expression3__RightAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3128:1: ( ( ruleExpression2 ) )
            // InternalHale.g:3129:2: ( ruleExpression2 )
            {
            // InternalHale.g:3129:2: ( ruleExpression2 )
            // InternalHale.g:3130:3: ruleExpression2
            {
             before(grammarAccess.getExpression3Access().getRightExpression2ParserRuleCall_1_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression2();

            state._fsp--;

             after(grammarAccess.getExpression3Access().getRightExpression2ParserRuleCall_1_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression3__RightAssignment_1_2_2"


    // $ANTLR start "rule__Expression2__RightAssignment_1_2"
    // InternalHale.g:3139:1: rule__Expression2__RightAssignment_1_2 : ( ruleExpression1 ) ;
    public final void rule__Expression2__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3143:1: ( ( ruleExpression1 ) )
            // InternalHale.g:3144:2: ( ruleExpression1 )
            {
            // InternalHale.g:3144:2: ( ruleExpression1 )
            // InternalHale.g:3145:3: ruleExpression1
            {
             before(grammarAccess.getExpression2Access().getRightExpression1ParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression1();

            state._fsp--;

             after(grammarAccess.getExpression2Access().getRightExpression1ParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression2__RightAssignment_1_2"


    // $ANTLR start "rule__Expression1__InnerAssignment_0_2"
    // InternalHale.g:3154:1: rule__Expression1__InnerAssignment_0_2 : ( ruleExpression1 ) ;
    public final void rule__Expression1__InnerAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3158:1: ( ( ruleExpression1 ) )
            // InternalHale.g:3159:2: ( ruleExpression1 )
            {
            // InternalHale.g:3159:2: ( ruleExpression1 )
            // InternalHale.g:3160:3: ruleExpression1
            {
             before(grammarAccess.getExpression1Access().getInnerExpression1ParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression1();

            state._fsp--;

             after(grammarAccess.getExpression1Access().getInnerExpression1ParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression1__InnerAssignment_0_2"


    // $ANTLR start "rule__Expression1__InnerAssignment_1_2"
    // InternalHale.g:3169:1: rule__Expression1__InnerAssignment_1_2 : ( ruleExpression1 ) ;
    public final void rule__Expression1__InnerAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3173:1: ( ( ruleExpression1 ) )
            // InternalHale.g:3174:2: ( ruleExpression1 )
            {
            // InternalHale.g:3174:2: ( ruleExpression1 )
            // InternalHale.g:3175:3: ruleExpression1
            {
             before(grammarAccess.getExpression1Access().getInnerExpression1ParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression1();

            state._fsp--;

             after(grammarAccess.getExpression1Access().getInnerExpression1ParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression1__InnerAssignment_1_2"


    // $ANTLR start "rule__NumberLiteral__ValueAssignment"
    // InternalHale.g:3184:1: rule__NumberLiteral__ValueAssignment : ( RULE_INT ) ;
    public final void rule__NumberLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3188:1: ( ( RULE_INT ) )
            // InternalHale.g:3189:2: ( RULE_INT )
            {
            // InternalHale.g:3189:2: ( RULE_INT )
            // InternalHale.g:3190:3: RULE_INT
            {
             before(grammarAccess.getNumberLiteralAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNumberLiteralAccess().getValueINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberLiteral__ValueAssignment"


    // $ANTLR start "rule__StringLiteral__ValueAssignment"
    // InternalHale.g:3199:1: rule__StringLiteral__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3203:1: ( ( RULE_STRING ) )
            // InternalHale.g:3204:2: ( RULE_STRING )
            {
            // InternalHale.g:3204:2: ( RULE_STRING )
            // InternalHale.g:3205:3: RULE_STRING
            {
             before(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__ValueAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000061003070L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000061003072L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000780000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000780002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000000E000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000080000000L});

}