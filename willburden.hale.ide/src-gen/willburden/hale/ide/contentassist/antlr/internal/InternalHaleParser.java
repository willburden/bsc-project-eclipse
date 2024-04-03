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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'print'", "'let'", "'='", "'*'", "'/'", "'-'", "'+'", "'('", "')'", "'mut'"
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
    // InternalHale.g:212:1: ruleExpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:216:2: ( ( ( rule__Expression__Group__0 ) ) )
            // InternalHale.g:217:2: ( ( rule__Expression__Group__0 ) )
            {
            // InternalHale.g:217:2: ( ( rule__Expression__Group__0 ) )
            // InternalHale.g:218:3: ( rule__Expression__Group__0 )
            {
             before(grammarAccess.getExpressionAccess().getGroup()); 
            // InternalHale.g:219:3: ( rule__Expression__Group__0 )
            // InternalHale.g:219:4: rule__Expression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getGroup()); 

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


    // $ANTLR start "entryRuleTerminalExpression"
    // InternalHale.g:228:1: entryRuleTerminalExpression : ruleTerminalExpression EOF ;
    public final void entryRuleTerminalExpression() throws RecognitionException {
        try {
            // InternalHale.g:229:1: ( ruleTerminalExpression EOF )
            // InternalHale.g:230:1: ruleTerminalExpression EOF
            {
             before(grammarAccess.getTerminalExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleTerminalExpression();

            state._fsp--;

             after(grammarAccess.getTerminalExpressionRule()); 
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
    // $ANTLR end "entryRuleTerminalExpression"


    // $ANTLR start "ruleTerminalExpression"
    // InternalHale.g:237:1: ruleTerminalExpression : ( ( rule__TerminalExpression__Alternatives ) ) ;
    public final void ruleTerminalExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:241:2: ( ( ( rule__TerminalExpression__Alternatives ) ) )
            // InternalHale.g:242:2: ( ( rule__TerminalExpression__Alternatives ) )
            {
            // InternalHale.g:242:2: ( ( rule__TerminalExpression__Alternatives ) )
            // InternalHale.g:243:3: ( rule__TerminalExpression__Alternatives )
            {
             before(grammarAccess.getTerminalExpressionAccess().getAlternatives()); 
            // InternalHale.g:244:3: ( rule__TerminalExpression__Alternatives )
            // InternalHale.g:244:4: rule__TerminalExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTerminalExpressionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTerminalExpression"


    // $ANTLR start "entryRuleLiteral"
    // InternalHale.g:253:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // InternalHale.g:254:1: ( ruleLiteral EOF )
            // InternalHale.g:255:1: ruleLiteral EOF
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
    // InternalHale.g:262:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:266:2: ( ( ( rule__Literal__Alternatives ) ) )
            // InternalHale.g:267:2: ( ( rule__Literal__Alternatives ) )
            {
            // InternalHale.g:267:2: ( ( rule__Literal__Alternatives ) )
            // InternalHale.g:268:3: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // InternalHale.g:269:3: ( rule__Literal__Alternatives )
            // InternalHale.g:269:4: rule__Literal__Alternatives
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


    // $ANTLR start "entryRuleIntLiteral"
    // InternalHale.g:278:1: entryRuleIntLiteral : ruleIntLiteral EOF ;
    public final void entryRuleIntLiteral() throws RecognitionException {
        try {
            // InternalHale.g:279:1: ( ruleIntLiteral EOF )
            // InternalHale.g:280:1: ruleIntLiteral EOF
            {
             before(grammarAccess.getIntLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleIntLiteral();

            state._fsp--;

             after(grammarAccess.getIntLiteralRule()); 
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
    // $ANTLR end "entryRuleIntLiteral"


    // $ANTLR start "ruleIntLiteral"
    // InternalHale.g:287:1: ruleIntLiteral : ( ( rule__IntLiteral__ValueAssignment ) ) ;
    public final void ruleIntLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:291:2: ( ( ( rule__IntLiteral__ValueAssignment ) ) )
            // InternalHale.g:292:2: ( ( rule__IntLiteral__ValueAssignment ) )
            {
            // InternalHale.g:292:2: ( ( rule__IntLiteral__ValueAssignment ) )
            // InternalHale.g:293:3: ( rule__IntLiteral__ValueAssignment )
            {
             before(grammarAccess.getIntLiteralAccess().getValueAssignment()); 
            // InternalHale.g:294:3: ( rule__IntLiteral__ValueAssignment )
            // InternalHale.g:294:4: rule__IntLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__IntLiteral__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIntLiteralAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleIntLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalHale.g:303:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // InternalHale.g:304:1: ( ruleStringLiteral EOF )
            // InternalHale.g:305:1: ruleStringLiteral EOF
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
    // InternalHale.g:312:1: ruleStringLiteral : ( ( rule__StringLiteral__ValueAssignment ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:316:2: ( ( ( rule__StringLiteral__ValueAssignment ) ) )
            // InternalHale.g:317:2: ( ( rule__StringLiteral__ValueAssignment ) )
            {
            // InternalHale.g:317:2: ( ( rule__StringLiteral__ValueAssignment ) )
            // InternalHale.g:318:3: ( rule__StringLiteral__ValueAssignment )
            {
             before(grammarAccess.getStringLiteralAccess().getValueAssignment()); 
            // InternalHale.g:319:3: ( rule__StringLiteral__ValueAssignment )
            // InternalHale.g:319:4: rule__StringLiteral__ValueAssignment
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
    // InternalHale.g:327:1: rule__Statement__Alternatives_0 : ( ( rulePrint ) | ( ruleBinding ) | ( ruleAssignment ) | ( ruleExpression ) );
    public final void rule__Statement__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:331:1: ( ( rulePrint ) | ( ruleBinding ) | ( ruleAssignment ) | ( ruleExpression ) )
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

                if ( (LA1_3==11||(LA1_3>=15 && LA1_3<=18)) ) {
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
            case 19:
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
                    // InternalHale.g:332:2: ( rulePrint )
                    {
                    // InternalHale.g:332:2: ( rulePrint )
                    // InternalHale.g:333:3: rulePrint
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
                    // InternalHale.g:338:2: ( ruleBinding )
                    {
                    // InternalHale.g:338:2: ( ruleBinding )
                    // InternalHale.g:339:3: ruleBinding
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
                    // InternalHale.g:344:2: ( ruleAssignment )
                    {
                    // InternalHale.g:344:2: ( ruleAssignment )
                    // InternalHale.g:345:3: ruleAssignment
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
                    // InternalHale.g:350:2: ( ruleExpression )
                    {
                    // InternalHale.g:350:2: ( ruleExpression )
                    // InternalHale.g:351:3: ruleExpression
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


    // $ANTLR start "rule__Expression__Alternatives_1"
    // InternalHale.g:360:1: rule__Expression__Alternatives_1 : ( ( ( ( rule__Expression__Group_1_0__0 ) ) ( ( rule__Expression__Group_1_0__0 )* ) ) | ( ( ( rule__Expression__Group_1_1__0 ) ) ( ( rule__Expression__Group_1_1__0 )* ) ) | ( ( ( rule__Expression__Group_1_2__0 ) ) ( ( rule__Expression__Group_1_2__0 )* ) ) | ( ( ( rule__Expression__Group_1_3__0 ) ) ( ( rule__Expression__Group_1_3__0 )* ) ) );
    public final void rule__Expression__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:364:1: ( ( ( ( rule__Expression__Group_1_0__0 ) ) ( ( rule__Expression__Group_1_0__0 )* ) ) | ( ( ( rule__Expression__Group_1_1__0 ) ) ( ( rule__Expression__Group_1_1__0 )* ) ) | ( ( ( rule__Expression__Group_1_2__0 ) ) ( ( rule__Expression__Group_1_2__0 )* ) ) | ( ( ( rule__Expression__Group_1_3__0 ) ) ( ( rule__Expression__Group_1_3__0 )* ) ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt6=1;
                }
                break;
            case 16:
                {
                alt6=2;
                }
                break;
            case 17:
                {
                alt6=3;
                }
                break;
            case 18:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalHale.g:365:2: ( ( ( rule__Expression__Group_1_0__0 ) ) ( ( rule__Expression__Group_1_0__0 )* ) )
                    {
                    // InternalHale.g:365:2: ( ( ( rule__Expression__Group_1_0__0 ) ) ( ( rule__Expression__Group_1_0__0 )* ) )
                    // InternalHale.g:366:3: ( ( rule__Expression__Group_1_0__0 ) ) ( ( rule__Expression__Group_1_0__0 )* )
                    {
                    // InternalHale.g:366:3: ( ( rule__Expression__Group_1_0__0 ) )
                    // InternalHale.g:367:4: ( rule__Expression__Group_1_0__0 )
                    {
                     before(grammarAccess.getExpressionAccess().getGroup_1_0()); 
                    // InternalHale.g:368:4: ( rule__Expression__Group_1_0__0 )
                    // InternalHale.g:368:5: rule__Expression__Group_1_0__0
                    {
                    pushFollow(FOLLOW_3);
                    rule__Expression__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getGroup_1_0()); 

                    }

                    // InternalHale.g:371:3: ( ( rule__Expression__Group_1_0__0 )* )
                    // InternalHale.g:372:4: ( rule__Expression__Group_1_0__0 )*
                    {
                     before(grammarAccess.getExpressionAccess().getGroup_1_0()); 
                    // InternalHale.g:373:4: ( rule__Expression__Group_1_0__0 )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==15) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalHale.g:373:5: rule__Expression__Group_1_0__0
                    	    {
                    	    pushFollow(FOLLOW_3);
                    	    rule__Expression__Group_1_0__0();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                     after(grammarAccess.getExpressionAccess().getGroup_1_0()); 

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalHale.g:378:2: ( ( ( rule__Expression__Group_1_1__0 ) ) ( ( rule__Expression__Group_1_1__0 )* ) )
                    {
                    // InternalHale.g:378:2: ( ( ( rule__Expression__Group_1_1__0 ) ) ( ( rule__Expression__Group_1_1__0 )* ) )
                    // InternalHale.g:379:3: ( ( rule__Expression__Group_1_1__0 ) ) ( ( rule__Expression__Group_1_1__0 )* )
                    {
                    // InternalHale.g:379:3: ( ( rule__Expression__Group_1_1__0 ) )
                    // InternalHale.g:380:4: ( rule__Expression__Group_1_1__0 )
                    {
                     before(grammarAccess.getExpressionAccess().getGroup_1_1()); 
                    // InternalHale.g:381:4: ( rule__Expression__Group_1_1__0 )
                    // InternalHale.g:381:5: rule__Expression__Group_1_1__0
                    {
                    pushFollow(FOLLOW_4);
                    rule__Expression__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getGroup_1_1()); 

                    }

                    // InternalHale.g:384:3: ( ( rule__Expression__Group_1_1__0 )* )
                    // InternalHale.g:385:4: ( rule__Expression__Group_1_1__0 )*
                    {
                     before(grammarAccess.getExpressionAccess().getGroup_1_1()); 
                    // InternalHale.g:386:4: ( rule__Expression__Group_1_1__0 )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==16) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalHale.g:386:5: rule__Expression__Group_1_1__0
                    	    {
                    	    pushFollow(FOLLOW_4);
                    	    rule__Expression__Group_1_1__0();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                     after(grammarAccess.getExpressionAccess().getGroup_1_1()); 

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalHale.g:391:2: ( ( ( rule__Expression__Group_1_2__0 ) ) ( ( rule__Expression__Group_1_2__0 )* ) )
                    {
                    // InternalHale.g:391:2: ( ( ( rule__Expression__Group_1_2__0 ) ) ( ( rule__Expression__Group_1_2__0 )* ) )
                    // InternalHale.g:392:3: ( ( rule__Expression__Group_1_2__0 ) ) ( ( rule__Expression__Group_1_2__0 )* )
                    {
                    // InternalHale.g:392:3: ( ( rule__Expression__Group_1_2__0 ) )
                    // InternalHale.g:393:4: ( rule__Expression__Group_1_2__0 )
                    {
                     before(grammarAccess.getExpressionAccess().getGroup_1_2()); 
                    // InternalHale.g:394:4: ( rule__Expression__Group_1_2__0 )
                    // InternalHale.g:394:5: rule__Expression__Group_1_2__0
                    {
                    pushFollow(FOLLOW_5);
                    rule__Expression__Group_1_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getGroup_1_2()); 

                    }

                    // InternalHale.g:397:3: ( ( rule__Expression__Group_1_2__0 )* )
                    // InternalHale.g:398:4: ( rule__Expression__Group_1_2__0 )*
                    {
                     before(grammarAccess.getExpressionAccess().getGroup_1_2()); 
                    // InternalHale.g:399:4: ( rule__Expression__Group_1_2__0 )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==17) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalHale.g:399:5: rule__Expression__Group_1_2__0
                    	    {
                    	    pushFollow(FOLLOW_5);
                    	    rule__Expression__Group_1_2__0();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                     after(grammarAccess.getExpressionAccess().getGroup_1_2()); 

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalHale.g:404:2: ( ( ( rule__Expression__Group_1_3__0 ) ) ( ( rule__Expression__Group_1_3__0 )* ) )
                    {
                    // InternalHale.g:404:2: ( ( ( rule__Expression__Group_1_3__0 ) ) ( ( rule__Expression__Group_1_3__0 )* ) )
                    // InternalHale.g:405:3: ( ( rule__Expression__Group_1_3__0 ) ) ( ( rule__Expression__Group_1_3__0 )* )
                    {
                    // InternalHale.g:405:3: ( ( rule__Expression__Group_1_3__0 ) )
                    // InternalHale.g:406:4: ( rule__Expression__Group_1_3__0 )
                    {
                     before(grammarAccess.getExpressionAccess().getGroup_1_3()); 
                    // InternalHale.g:407:4: ( rule__Expression__Group_1_3__0 )
                    // InternalHale.g:407:5: rule__Expression__Group_1_3__0
                    {
                    pushFollow(FOLLOW_6);
                    rule__Expression__Group_1_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getGroup_1_3()); 

                    }

                    // InternalHale.g:410:3: ( ( rule__Expression__Group_1_3__0 )* )
                    // InternalHale.g:411:4: ( rule__Expression__Group_1_3__0 )*
                    {
                     before(grammarAccess.getExpressionAccess().getGroup_1_3()); 
                    // InternalHale.g:412:4: ( rule__Expression__Group_1_3__0 )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==18) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalHale.g:412:5: rule__Expression__Group_1_3__0
                    	    {
                    	    pushFollow(FOLLOW_6);
                    	    rule__Expression__Group_1_3__0();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                     after(grammarAccess.getExpressionAccess().getGroup_1_3()); 

                    }


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
    // $ANTLR end "rule__Expression__Alternatives_1"


    // $ANTLR start "rule__TerminalExpression__Alternatives"
    // InternalHale.g:421:1: rule__TerminalExpression__Alternatives : ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ruleBindingReference ) | ( ruleLiteral ) );
    public final void rule__TerminalExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:425:1: ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ruleBindingReference ) | ( ruleLiteral ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt7=1;
                }
                break;
            case RULE_ID:
                {
                alt7=2;
                }
                break;
            case RULE_INT:
            case RULE_STRING:
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
                    // InternalHale.g:426:2: ( ( rule__TerminalExpression__Group_0__0 ) )
                    {
                    // InternalHale.g:426:2: ( ( rule__TerminalExpression__Group_0__0 ) )
                    // InternalHale.g:427:3: ( rule__TerminalExpression__Group_0__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_0()); 
                    // InternalHale.g:428:3: ( rule__TerminalExpression__Group_0__0 )
                    // InternalHale.g:428:4: rule__TerminalExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalExpression__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTerminalExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHale.g:432:2: ( ruleBindingReference )
                    {
                    // InternalHale.g:432:2: ( ruleBindingReference )
                    // InternalHale.g:433:3: ruleBindingReference
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getBindingReferenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleBindingReference();

                    state._fsp--;

                     after(grammarAccess.getTerminalExpressionAccess().getBindingReferenceParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHale.g:438:2: ( ruleLiteral )
                    {
                    // InternalHale.g:438:2: ( ruleLiteral )
                    // InternalHale.g:439:3: ruleLiteral
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getLiteralParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleLiteral();

                    state._fsp--;

                     after(grammarAccess.getTerminalExpressionAccess().getLiteralParserRuleCall_2()); 

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
    // $ANTLR end "rule__TerminalExpression__Alternatives"


    // $ANTLR start "rule__Literal__Alternatives"
    // InternalHale.g:448:1: rule__Literal__Alternatives : ( ( ruleIntLiteral ) | ( ruleStringLiteral ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:452:1: ( ( ruleIntLiteral ) | ( ruleStringLiteral ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_STRING) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalHale.g:453:2: ( ruleIntLiteral )
                    {
                    // InternalHale.g:453:2: ( ruleIntLiteral )
                    // InternalHale.g:454:3: ruleIntLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getIntLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleIntLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getIntLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHale.g:459:2: ( ruleStringLiteral )
                    {
                    // InternalHale.g:459:2: ( ruleStringLiteral )
                    // InternalHale.g:460:3: ruleStringLiteral
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
    // InternalHale.g:469:1: rule__Hale__Group__0 : rule__Hale__Group__0__Impl rule__Hale__Group__1 ;
    public final void rule__Hale__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:473:1: ( rule__Hale__Group__0__Impl rule__Hale__Group__1 )
            // InternalHale.g:474:2: rule__Hale__Group__0__Impl rule__Hale__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalHale.g:481:1: rule__Hale__Group__0__Impl : ( () ) ;
    public final void rule__Hale__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:485:1: ( ( () ) )
            // InternalHale.g:486:1: ( () )
            {
            // InternalHale.g:486:1: ( () )
            // InternalHale.g:487:2: ()
            {
             before(grammarAccess.getHaleAccess().getHaleAction_0()); 
            // InternalHale.g:488:2: ()
            // InternalHale.g:488:3: 
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
    // InternalHale.g:496:1: rule__Hale__Group__1 : rule__Hale__Group__1__Impl ;
    public final void rule__Hale__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:500:1: ( rule__Hale__Group__1__Impl )
            // InternalHale.g:501:2: rule__Hale__Group__1__Impl
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
    // InternalHale.g:507:1: rule__Hale__Group__1__Impl : ( ( rule__Hale__StatementsAssignment_1 )* ) ;
    public final void rule__Hale__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:511:1: ( ( ( rule__Hale__StatementsAssignment_1 )* ) )
            // InternalHale.g:512:1: ( ( rule__Hale__StatementsAssignment_1 )* )
            {
            // InternalHale.g:512:1: ( ( rule__Hale__StatementsAssignment_1 )* )
            // InternalHale.g:513:2: ( rule__Hale__StatementsAssignment_1 )*
            {
             before(grammarAccess.getHaleAccess().getStatementsAssignment_1()); 
            // InternalHale.g:514:2: ( rule__Hale__StatementsAssignment_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_ID && LA9_0<=RULE_STRING)||(LA9_0>=12 && LA9_0<=13)||LA9_0==19) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalHale.g:514:3: rule__Hale__StatementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Hale__StatementsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalHale.g:523:1: rule__Statement__Group__0 : rule__Statement__Group__0__Impl rule__Statement__Group__1 ;
    public final void rule__Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:527:1: ( rule__Statement__Group__0__Impl rule__Statement__Group__1 )
            // InternalHale.g:528:2: rule__Statement__Group__0__Impl rule__Statement__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalHale.g:535:1: rule__Statement__Group__0__Impl : ( ( rule__Statement__Alternatives_0 ) ) ;
    public final void rule__Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:539:1: ( ( ( rule__Statement__Alternatives_0 ) ) )
            // InternalHale.g:540:1: ( ( rule__Statement__Alternatives_0 ) )
            {
            // InternalHale.g:540:1: ( ( rule__Statement__Alternatives_0 ) )
            // InternalHale.g:541:2: ( rule__Statement__Alternatives_0 )
            {
             before(grammarAccess.getStatementAccess().getAlternatives_0()); 
            // InternalHale.g:542:2: ( rule__Statement__Alternatives_0 )
            // InternalHale.g:542:3: rule__Statement__Alternatives_0
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
    // InternalHale.g:550:1: rule__Statement__Group__1 : rule__Statement__Group__1__Impl ;
    public final void rule__Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:554:1: ( rule__Statement__Group__1__Impl )
            // InternalHale.g:555:2: rule__Statement__Group__1__Impl
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
    // InternalHale.g:561:1: rule__Statement__Group__1__Impl : ( ';' ) ;
    public final void rule__Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:565:1: ( ( ';' ) )
            // InternalHale.g:566:1: ( ';' )
            {
            // InternalHale.g:566:1: ( ';' )
            // InternalHale.g:567:2: ';'
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
    // InternalHale.g:577:1: rule__Print__Group__0 : rule__Print__Group__0__Impl rule__Print__Group__1 ;
    public final void rule__Print__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:581:1: ( rule__Print__Group__0__Impl rule__Print__Group__1 )
            // InternalHale.g:582:2: rule__Print__Group__0__Impl rule__Print__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalHale.g:589:1: rule__Print__Group__0__Impl : ( 'print' ) ;
    public final void rule__Print__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:593:1: ( ( 'print' ) )
            // InternalHale.g:594:1: ( 'print' )
            {
            // InternalHale.g:594:1: ( 'print' )
            // InternalHale.g:595:2: 'print'
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
    // InternalHale.g:604:1: rule__Print__Group__1 : rule__Print__Group__1__Impl ;
    public final void rule__Print__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:608:1: ( rule__Print__Group__1__Impl )
            // InternalHale.g:609:2: rule__Print__Group__1__Impl
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
    // InternalHale.g:615:1: rule__Print__Group__1__Impl : ( ( rule__Print__ValueAssignment_1 ) ) ;
    public final void rule__Print__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:619:1: ( ( ( rule__Print__ValueAssignment_1 ) ) )
            // InternalHale.g:620:1: ( ( rule__Print__ValueAssignment_1 ) )
            {
            // InternalHale.g:620:1: ( ( rule__Print__ValueAssignment_1 ) )
            // InternalHale.g:621:2: ( rule__Print__ValueAssignment_1 )
            {
             before(grammarAccess.getPrintAccess().getValueAssignment_1()); 
            // InternalHale.g:622:2: ( rule__Print__ValueAssignment_1 )
            // InternalHale.g:622:3: rule__Print__ValueAssignment_1
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
    // InternalHale.g:631:1: rule__Binding__Group__0 : rule__Binding__Group__0__Impl rule__Binding__Group__1 ;
    public final void rule__Binding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:635:1: ( rule__Binding__Group__0__Impl rule__Binding__Group__1 )
            // InternalHale.g:636:2: rule__Binding__Group__0__Impl rule__Binding__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalHale.g:643:1: rule__Binding__Group__0__Impl : ( 'let' ) ;
    public final void rule__Binding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:647:1: ( ( 'let' ) )
            // InternalHale.g:648:1: ( 'let' )
            {
            // InternalHale.g:648:1: ( 'let' )
            // InternalHale.g:649:2: 'let'
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
    // InternalHale.g:658:1: rule__Binding__Group__1 : rule__Binding__Group__1__Impl rule__Binding__Group__2 ;
    public final void rule__Binding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:662:1: ( rule__Binding__Group__1__Impl rule__Binding__Group__2 )
            // InternalHale.g:663:2: rule__Binding__Group__1__Impl rule__Binding__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalHale.g:670:1: rule__Binding__Group__1__Impl : ( ( rule__Binding__MutableAssignment_1 )? ) ;
    public final void rule__Binding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:674:1: ( ( ( rule__Binding__MutableAssignment_1 )? ) )
            // InternalHale.g:675:1: ( ( rule__Binding__MutableAssignment_1 )? )
            {
            // InternalHale.g:675:1: ( ( rule__Binding__MutableAssignment_1 )? )
            // InternalHale.g:676:2: ( rule__Binding__MutableAssignment_1 )?
            {
             before(grammarAccess.getBindingAccess().getMutableAssignment_1()); 
            // InternalHale.g:677:2: ( rule__Binding__MutableAssignment_1 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalHale.g:677:3: rule__Binding__MutableAssignment_1
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
    // InternalHale.g:685:1: rule__Binding__Group__2 : rule__Binding__Group__2__Impl rule__Binding__Group__3 ;
    public final void rule__Binding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:689:1: ( rule__Binding__Group__2__Impl rule__Binding__Group__3 )
            // InternalHale.g:690:2: rule__Binding__Group__2__Impl rule__Binding__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalHale.g:697:1: rule__Binding__Group__2__Impl : ( ( rule__Binding__NameAssignment_2 ) ) ;
    public final void rule__Binding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:701:1: ( ( ( rule__Binding__NameAssignment_2 ) ) )
            // InternalHale.g:702:1: ( ( rule__Binding__NameAssignment_2 ) )
            {
            // InternalHale.g:702:1: ( ( rule__Binding__NameAssignment_2 ) )
            // InternalHale.g:703:2: ( rule__Binding__NameAssignment_2 )
            {
             before(grammarAccess.getBindingAccess().getNameAssignment_2()); 
            // InternalHale.g:704:2: ( rule__Binding__NameAssignment_2 )
            // InternalHale.g:704:3: rule__Binding__NameAssignment_2
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
    // InternalHale.g:712:1: rule__Binding__Group__3 : rule__Binding__Group__3__Impl rule__Binding__Group__4 ;
    public final void rule__Binding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:716:1: ( rule__Binding__Group__3__Impl rule__Binding__Group__4 )
            // InternalHale.g:717:2: rule__Binding__Group__3__Impl rule__Binding__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalHale.g:724:1: rule__Binding__Group__3__Impl : ( '=' ) ;
    public final void rule__Binding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:728:1: ( ( '=' ) )
            // InternalHale.g:729:1: ( '=' )
            {
            // InternalHale.g:729:1: ( '=' )
            // InternalHale.g:730:2: '='
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
    // InternalHale.g:739:1: rule__Binding__Group__4 : rule__Binding__Group__4__Impl ;
    public final void rule__Binding__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:743:1: ( rule__Binding__Group__4__Impl )
            // InternalHale.g:744:2: rule__Binding__Group__4__Impl
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
    // InternalHale.g:750:1: rule__Binding__Group__4__Impl : ( ( rule__Binding__ValueAssignment_4 ) ) ;
    public final void rule__Binding__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:754:1: ( ( ( rule__Binding__ValueAssignment_4 ) ) )
            // InternalHale.g:755:1: ( ( rule__Binding__ValueAssignment_4 ) )
            {
            // InternalHale.g:755:1: ( ( rule__Binding__ValueAssignment_4 ) )
            // InternalHale.g:756:2: ( rule__Binding__ValueAssignment_4 )
            {
             before(grammarAccess.getBindingAccess().getValueAssignment_4()); 
            // InternalHale.g:757:2: ( rule__Binding__ValueAssignment_4 )
            // InternalHale.g:757:3: rule__Binding__ValueAssignment_4
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
    // InternalHale.g:766:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:770:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // InternalHale.g:771:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalHale.g:778:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__BindingAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:782:1: ( ( ( rule__Assignment__BindingAssignment_0 ) ) )
            // InternalHale.g:783:1: ( ( rule__Assignment__BindingAssignment_0 ) )
            {
            // InternalHale.g:783:1: ( ( rule__Assignment__BindingAssignment_0 ) )
            // InternalHale.g:784:2: ( rule__Assignment__BindingAssignment_0 )
            {
             before(grammarAccess.getAssignmentAccess().getBindingAssignment_0()); 
            // InternalHale.g:785:2: ( rule__Assignment__BindingAssignment_0 )
            // InternalHale.g:785:3: rule__Assignment__BindingAssignment_0
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
    // InternalHale.g:793:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:797:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // InternalHale.g:798:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalHale.g:805:1: rule__Assignment__Group__1__Impl : ( '=' ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:809:1: ( ( '=' ) )
            // InternalHale.g:810:1: ( '=' )
            {
            // InternalHale.g:810:1: ( '=' )
            // InternalHale.g:811:2: '='
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
    // InternalHale.g:820:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:824:1: ( rule__Assignment__Group__2__Impl )
            // InternalHale.g:825:2: rule__Assignment__Group__2__Impl
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
    // InternalHale.g:831:1: rule__Assignment__Group__2__Impl : ( ( rule__Assignment__ValueAssignment_2 ) ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:835:1: ( ( ( rule__Assignment__ValueAssignment_2 ) ) )
            // InternalHale.g:836:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            {
            // InternalHale.g:836:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            // InternalHale.g:837:2: ( rule__Assignment__ValueAssignment_2 )
            {
             before(grammarAccess.getAssignmentAccess().getValueAssignment_2()); 
            // InternalHale.g:838:2: ( rule__Assignment__ValueAssignment_2 )
            // InternalHale.g:838:3: rule__Assignment__ValueAssignment_2
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


    // $ANTLR start "rule__Expression__Group__0"
    // InternalHale.g:847:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:851:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // InternalHale.g:852:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Expression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group__1();

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
    // $ANTLR end "rule__Expression__Group__0"


    // $ANTLR start "rule__Expression__Group__0__Impl"
    // InternalHale.g:859:1: rule__Expression__Group__0__Impl : ( ruleTerminalExpression ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:863:1: ( ( ruleTerminalExpression ) )
            // InternalHale.g:864:1: ( ruleTerminalExpression )
            {
            // InternalHale.g:864:1: ( ruleTerminalExpression )
            // InternalHale.g:865:2: ruleTerminalExpression
            {
             before(grammarAccess.getExpressionAccess().getTerminalExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleTerminalExpression();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getTerminalExpressionParserRuleCall_0()); 

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
    // $ANTLR end "rule__Expression__Group__0__Impl"


    // $ANTLR start "rule__Expression__Group__1"
    // InternalHale.g:874:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:878:1: ( rule__Expression__Group__1__Impl )
            // InternalHale.g:879:2: rule__Expression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__1__Impl();

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
    // $ANTLR end "rule__Expression__Group__1"


    // $ANTLR start "rule__Expression__Group__1__Impl"
    // InternalHale.g:885:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__Alternatives_1 )? ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:889:1: ( ( ( rule__Expression__Alternatives_1 )? ) )
            // InternalHale.g:890:1: ( ( rule__Expression__Alternatives_1 )? )
            {
            // InternalHale.g:890:1: ( ( rule__Expression__Alternatives_1 )? )
            // InternalHale.g:891:2: ( rule__Expression__Alternatives_1 )?
            {
             before(grammarAccess.getExpressionAccess().getAlternatives_1()); 
            // InternalHale.g:892:2: ( rule__Expression__Alternatives_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=15 && LA11_0<=18)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalHale.g:892:3: rule__Expression__Alternatives_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__Alternatives_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpressionAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__Expression__Group__1__Impl"


    // $ANTLR start "rule__Expression__Group_1_0__0"
    // InternalHale.g:901:1: rule__Expression__Group_1_0__0 : rule__Expression__Group_1_0__0__Impl rule__Expression__Group_1_0__1 ;
    public final void rule__Expression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:905:1: ( rule__Expression__Group_1_0__0__Impl rule__Expression__Group_1_0__1 )
            // InternalHale.g:906:2: rule__Expression__Group_1_0__0__Impl rule__Expression__Group_1_0__1
            {
            pushFollow(FOLLOW_13);
            rule__Expression__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_1_0__1();

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
    // $ANTLR end "rule__Expression__Group_1_0__0"


    // $ANTLR start "rule__Expression__Group_1_0__0__Impl"
    // InternalHale.g:913:1: rule__Expression__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Expression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:917:1: ( ( () ) )
            // InternalHale.g:918:1: ( () )
            {
            // InternalHale.g:918:1: ( () )
            // InternalHale.g:919:2: ()
            {
             before(grammarAccess.getExpressionAccess().getMultiplicationLeftAction_1_0_0()); 
            // InternalHale.g:920:2: ()
            // InternalHale.g:920:3: 
            {
            }

             after(grammarAccess.getExpressionAccess().getMultiplicationLeftAction_1_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1_0__0__Impl"


    // $ANTLR start "rule__Expression__Group_1_0__1"
    // InternalHale.g:928:1: rule__Expression__Group_1_0__1 : rule__Expression__Group_1_0__1__Impl rule__Expression__Group_1_0__2 ;
    public final void rule__Expression__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:932:1: ( rule__Expression__Group_1_0__1__Impl rule__Expression__Group_1_0__2 )
            // InternalHale.g:933:2: rule__Expression__Group_1_0__1__Impl rule__Expression__Group_1_0__2
            {
            pushFollow(FOLLOW_7);
            rule__Expression__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_1_0__2();

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
    // $ANTLR end "rule__Expression__Group_1_0__1"


    // $ANTLR start "rule__Expression__Group_1_0__1__Impl"
    // InternalHale.g:940:1: rule__Expression__Group_1_0__1__Impl : ( '*' ) ;
    public final void rule__Expression__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:944:1: ( ( '*' ) )
            // InternalHale.g:945:1: ( '*' )
            {
            // InternalHale.g:945:1: ( '*' )
            // InternalHale.g:946:2: '*'
            {
             before(grammarAccess.getExpressionAccess().getAsteriskKeyword_1_0_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getAsteriskKeyword_1_0_1()); 

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
    // $ANTLR end "rule__Expression__Group_1_0__1__Impl"


    // $ANTLR start "rule__Expression__Group_1_0__2"
    // InternalHale.g:955:1: rule__Expression__Group_1_0__2 : rule__Expression__Group_1_0__2__Impl ;
    public final void rule__Expression__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:959:1: ( rule__Expression__Group_1_0__2__Impl )
            // InternalHale.g:960:2: rule__Expression__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_1_0__2__Impl();

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
    // $ANTLR end "rule__Expression__Group_1_0__2"


    // $ANTLR start "rule__Expression__Group_1_0__2__Impl"
    // InternalHale.g:966:1: rule__Expression__Group_1_0__2__Impl : ( ( rule__Expression__RightAssignment_1_0_2 ) ) ;
    public final void rule__Expression__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:970:1: ( ( ( rule__Expression__RightAssignment_1_0_2 ) ) )
            // InternalHale.g:971:1: ( ( rule__Expression__RightAssignment_1_0_2 ) )
            {
            // InternalHale.g:971:1: ( ( rule__Expression__RightAssignment_1_0_2 ) )
            // InternalHale.g:972:2: ( rule__Expression__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getExpressionAccess().getRightAssignment_1_0_2()); 
            // InternalHale.g:973:2: ( rule__Expression__RightAssignment_1_0_2 )
            // InternalHale.g:973:3: rule__Expression__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Expression__RightAssignment_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getRightAssignment_1_0_2()); 

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
    // $ANTLR end "rule__Expression__Group_1_0__2__Impl"


    // $ANTLR start "rule__Expression__Group_1_1__0"
    // InternalHale.g:982:1: rule__Expression__Group_1_1__0 : rule__Expression__Group_1_1__0__Impl rule__Expression__Group_1_1__1 ;
    public final void rule__Expression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:986:1: ( rule__Expression__Group_1_1__0__Impl rule__Expression__Group_1_1__1 )
            // InternalHale.g:987:2: rule__Expression__Group_1_1__0__Impl rule__Expression__Group_1_1__1
            {
            pushFollow(FOLLOW_14);
            rule__Expression__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_1_1__1();

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
    // $ANTLR end "rule__Expression__Group_1_1__0"


    // $ANTLR start "rule__Expression__Group_1_1__0__Impl"
    // InternalHale.g:994:1: rule__Expression__Group_1_1__0__Impl : ( () ) ;
    public final void rule__Expression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:998:1: ( ( () ) )
            // InternalHale.g:999:1: ( () )
            {
            // InternalHale.g:999:1: ( () )
            // InternalHale.g:1000:2: ()
            {
             before(grammarAccess.getExpressionAccess().getDivisionLeftAction_1_1_0()); 
            // InternalHale.g:1001:2: ()
            // InternalHale.g:1001:3: 
            {
            }

             after(grammarAccess.getExpressionAccess().getDivisionLeftAction_1_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1_1__0__Impl"


    // $ANTLR start "rule__Expression__Group_1_1__1"
    // InternalHale.g:1009:1: rule__Expression__Group_1_1__1 : rule__Expression__Group_1_1__1__Impl rule__Expression__Group_1_1__2 ;
    public final void rule__Expression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1013:1: ( rule__Expression__Group_1_1__1__Impl rule__Expression__Group_1_1__2 )
            // InternalHale.g:1014:2: rule__Expression__Group_1_1__1__Impl rule__Expression__Group_1_1__2
            {
            pushFollow(FOLLOW_7);
            rule__Expression__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_1_1__2();

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
    // $ANTLR end "rule__Expression__Group_1_1__1"


    // $ANTLR start "rule__Expression__Group_1_1__1__Impl"
    // InternalHale.g:1021:1: rule__Expression__Group_1_1__1__Impl : ( '/' ) ;
    public final void rule__Expression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1025:1: ( ( '/' ) )
            // InternalHale.g:1026:1: ( '/' )
            {
            // InternalHale.g:1026:1: ( '/' )
            // InternalHale.g:1027:2: '/'
            {
             before(grammarAccess.getExpressionAccess().getSolidusKeyword_1_1_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getSolidusKeyword_1_1_1()); 

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
    // $ANTLR end "rule__Expression__Group_1_1__1__Impl"


    // $ANTLR start "rule__Expression__Group_1_1__2"
    // InternalHale.g:1036:1: rule__Expression__Group_1_1__2 : rule__Expression__Group_1_1__2__Impl ;
    public final void rule__Expression__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1040:1: ( rule__Expression__Group_1_1__2__Impl )
            // InternalHale.g:1041:2: rule__Expression__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_1_1__2__Impl();

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
    // $ANTLR end "rule__Expression__Group_1_1__2"


    // $ANTLR start "rule__Expression__Group_1_1__2__Impl"
    // InternalHale.g:1047:1: rule__Expression__Group_1_1__2__Impl : ( ( rule__Expression__RightAssignment_1_1_2 ) ) ;
    public final void rule__Expression__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1051:1: ( ( ( rule__Expression__RightAssignment_1_1_2 ) ) )
            // InternalHale.g:1052:1: ( ( rule__Expression__RightAssignment_1_1_2 ) )
            {
            // InternalHale.g:1052:1: ( ( rule__Expression__RightAssignment_1_1_2 ) )
            // InternalHale.g:1053:2: ( rule__Expression__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getExpressionAccess().getRightAssignment_1_1_2()); 
            // InternalHale.g:1054:2: ( rule__Expression__RightAssignment_1_1_2 )
            // InternalHale.g:1054:3: rule__Expression__RightAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Expression__RightAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getRightAssignment_1_1_2()); 

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
    // $ANTLR end "rule__Expression__Group_1_1__2__Impl"


    // $ANTLR start "rule__Expression__Group_1_2__0"
    // InternalHale.g:1063:1: rule__Expression__Group_1_2__0 : rule__Expression__Group_1_2__0__Impl rule__Expression__Group_1_2__1 ;
    public final void rule__Expression__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1067:1: ( rule__Expression__Group_1_2__0__Impl rule__Expression__Group_1_2__1 )
            // InternalHale.g:1068:2: rule__Expression__Group_1_2__0__Impl rule__Expression__Group_1_2__1
            {
            pushFollow(FOLLOW_15);
            rule__Expression__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_1_2__1();

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
    // $ANTLR end "rule__Expression__Group_1_2__0"


    // $ANTLR start "rule__Expression__Group_1_2__0__Impl"
    // InternalHale.g:1075:1: rule__Expression__Group_1_2__0__Impl : ( () ) ;
    public final void rule__Expression__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1079:1: ( ( () ) )
            // InternalHale.g:1080:1: ( () )
            {
            // InternalHale.g:1080:1: ( () )
            // InternalHale.g:1081:2: ()
            {
             before(grammarAccess.getExpressionAccess().getSubtractionLeftAction_1_2_0()); 
            // InternalHale.g:1082:2: ()
            // InternalHale.g:1082:3: 
            {
            }

             after(grammarAccess.getExpressionAccess().getSubtractionLeftAction_1_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1_2__0__Impl"


    // $ANTLR start "rule__Expression__Group_1_2__1"
    // InternalHale.g:1090:1: rule__Expression__Group_1_2__1 : rule__Expression__Group_1_2__1__Impl rule__Expression__Group_1_2__2 ;
    public final void rule__Expression__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1094:1: ( rule__Expression__Group_1_2__1__Impl rule__Expression__Group_1_2__2 )
            // InternalHale.g:1095:2: rule__Expression__Group_1_2__1__Impl rule__Expression__Group_1_2__2
            {
            pushFollow(FOLLOW_7);
            rule__Expression__Group_1_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_1_2__2();

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
    // $ANTLR end "rule__Expression__Group_1_2__1"


    // $ANTLR start "rule__Expression__Group_1_2__1__Impl"
    // InternalHale.g:1102:1: rule__Expression__Group_1_2__1__Impl : ( '-' ) ;
    public final void rule__Expression__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1106:1: ( ( '-' ) )
            // InternalHale.g:1107:1: ( '-' )
            {
            // InternalHale.g:1107:1: ( '-' )
            // InternalHale.g:1108:2: '-'
            {
             before(grammarAccess.getExpressionAccess().getHyphenMinusKeyword_1_2_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getHyphenMinusKeyword_1_2_1()); 

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
    // $ANTLR end "rule__Expression__Group_1_2__1__Impl"


    // $ANTLR start "rule__Expression__Group_1_2__2"
    // InternalHale.g:1117:1: rule__Expression__Group_1_2__2 : rule__Expression__Group_1_2__2__Impl ;
    public final void rule__Expression__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1121:1: ( rule__Expression__Group_1_2__2__Impl )
            // InternalHale.g:1122:2: rule__Expression__Group_1_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_1_2__2__Impl();

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
    // $ANTLR end "rule__Expression__Group_1_2__2"


    // $ANTLR start "rule__Expression__Group_1_2__2__Impl"
    // InternalHale.g:1128:1: rule__Expression__Group_1_2__2__Impl : ( ( rule__Expression__RightAssignment_1_2_2 ) ) ;
    public final void rule__Expression__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1132:1: ( ( ( rule__Expression__RightAssignment_1_2_2 ) ) )
            // InternalHale.g:1133:1: ( ( rule__Expression__RightAssignment_1_2_2 ) )
            {
            // InternalHale.g:1133:1: ( ( rule__Expression__RightAssignment_1_2_2 ) )
            // InternalHale.g:1134:2: ( rule__Expression__RightAssignment_1_2_2 )
            {
             before(grammarAccess.getExpressionAccess().getRightAssignment_1_2_2()); 
            // InternalHale.g:1135:2: ( rule__Expression__RightAssignment_1_2_2 )
            // InternalHale.g:1135:3: rule__Expression__RightAssignment_1_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Expression__RightAssignment_1_2_2();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getRightAssignment_1_2_2()); 

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
    // $ANTLR end "rule__Expression__Group_1_2__2__Impl"


    // $ANTLR start "rule__Expression__Group_1_3__0"
    // InternalHale.g:1144:1: rule__Expression__Group_1_3__0 : rule__Expression__Group_1_3__0__Impl rule__Expression__Group_1_3__1 ;
    public final void rule__Expression__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1148:1: ( rule__Expression__Group_1_3__0__Impl rule__Expression__Group_1_3__1 )
            // InternalHale.g:1149:2: rule__Expression__Group_1_3__0__Impl rule__Expression__Group_1_3__1
            {
            pushFollow(FOLLOW_16);
            rule__Expression__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_1_3__1();

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
    // $ANTLR end "rule__Expression__Group_1_3__0"


    // $ANTLR start "rule__Expression__Group_1_3__0__Impl"
    // InternalHale.g:1156:1: rule__Expression__Group_1_3__0__Impl : ( () ) ;
    public final void rule__Expression__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1160:1: ( ( () ) )
            // InternalHale.g:1161:1: ( () )
            {
            // InternalHale.g:1161:1: ( () )
            // InternalHale.g:1162:2: ()
            {
             before(grammarAccess.getExpressionAccess().getAdditionLeftAction_1_3_0()); 
            // InternalHale.g:1163:2: ()
            // InternalHale.g:1163:3: 
            {
            }

             after(grammarAccess.getExpressionAccess().getAdditionLeftAction_1_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1_3__0__Impl"


    // $ANTLR start "rule__Expression__Group_1_3__1"
    // InternalHale.g:1171:1: rule__Expression__Group_1_3__1 : rule__Expression__Group_1_3__1__Impl rule__Expression__Group_1_3__2 ;
    public final void rule__Expression__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1175:1: ( rule__Expression__Group_1_3__1__Impl rule__Expression__Group_1_3__2 )
            // InternalHale.g:1176:2: rule__Expression__Group_1_3__1__Impl rule__Expression__Group_1_3__2
            {
            pushFollow(FOLLOW_7);
            rule__Expression__Group_1_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_1_3__2();

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
    // $ANTLR end "rule__Expression__Group_1_3__1"


    // $ANTLR start "rule__Expression__Group_1_3__1__Impl"
    // InternalHale.g:1183:1: rule__Expression__Group_1_3__1__Impl : ( '+' ) ;
    public final void rule__Expression__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1187:1: ( ( '+' ) )
            // InternalHale.g:1188:1: ( '+' )
            {
            // InternalHale.g:1188:1: ( '+' )
            // InternalHale.g:1189:2: '+'
            {
             before(grammarAccess.getExpressionAccess().getPlusSignKeyword_1_3_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getPlusSignKeyword_1_3_1()); 

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
    // $ANTLR end "rule__Expression__Group_1_3__1__Impl"


    // $ANTLR start "rule__Expression__Group_1_3__2"
    // InternalHale.g:1198:1: rule__Expression__Group_1_3__2 : rule__Expression__Group_1_3__2__Impl ;
    public final void rule__Expression__Group_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1202:1: ( rule__Expression__Group_1_3__2__Impl )
            // InternalHale.g:1203:2: rule__Expression__Group_1_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_1_3__2__Impl();

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
    // $ANTLR end "rule__Expression__Group_1_3__2"


    // $ANTLR start "rule__Expression__Group_1_3__2__Impl"
    // InternalHale.g:1209:1: rule__Expression__Group_1_3__2__Impl : ( ( rule__Expression__RightAssignment_1_3_2 ) ) ;
    public final void rule__Expression__Group_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1213:1: ( ( ( rule__Expression__RightAssignment_1_3_2 ) ) )
            // InternalHale.g:1214:1: ( ( rule__Expression__RightAssignment_1_3_2 ) )
            {
            // InternalHale.g:1214:1: ( ( rule__Expression__RightAssignment_1_3_2 ) )
            // InternalHale.g:1215:2: ( rule__Expression__RightAssignment_1_3_2 )
            {
             before(grammarAccess.getExpressionAccess().getRightAssignment_1_3_2()); 
            // InternalHale.g:1216:2: ( rule__Expression__RightAssignment_1_3_2 )
            // InternalHale.g:1216:3: rule__Expression__RightAssignment_1_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Expression__RightAssignment_1_3_2();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getRightAssignment_1_3_2()); 

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
    // $ANTLR end "rule__Expression__Group_1_3__2__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_0__0"
    // InternalHale.g:1225:1: rule__TerminalExpression__Group_0__0 : rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1 ;
    public final void rule__TerminalExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1229:1: ( rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1 )
            // InternalHale.g:1230:2: rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1
            {
            pushFollow(FOLLOW_7);
            rule__TerminalExpression__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_0__1();

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
    // $ANTLR end "rule__TerminalExpression__Group_0__0"


    // $ANTLR start "rule__TerminalExpression__Group_0__0__Impl"
    // InternalHale.g:1237:1: rule__TerminalExpression__Group_0__0__Impl : ( '(' ) ;
    public final void rule__TerminalExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1241:1: ( ( '(' ) )
            // InternalHale.g:1242:1: ( '(' )
            {
            // InternalHale.g:1242:1: ( '(' )
            // InternalHale.g:1243:2: '('
            {
             before(grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTerminalExpressionAccess().getLeftParenthesisKeyword_0_0()); 

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
    // $ANTLR end "rule__TerminalExpression__Group_0__0__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_0__1"
    // InternalHale.g:1252:1: rule__TerminalExpression__Group_0__1 : rule__TerminalExpression__Group_0__1__Impl rule__TerminalExpression__Group_0__2 ;
    public final void rule__TerminalExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1256:1: ( rule__TerminalExpression__Group_0__1__Impl rule__TerminalExpression__Group_0__2 )
            // InternalHale.g:1257:2: rule__TerminalExpression__Group_0__1__Impl rule__TerminalExpression__Group_0__2
            {
            pushFollow(FOLLOW_17);
            rule__TerminalExpression__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_0__2();

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
    // $ANTLR end "rule__TerminalExpression__Group_0__1"


    // $ANTLR start "rule__TerminalExpression__Group_0__1__Impl"
    // InternalHale.g:1264:1: rule__TerminalExpression__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__TerminalExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1268:1: ( ( ruleExpression ) )
            // InternalHale.g:1269:1: ( ruleExpression )
            {
            // InternalHale.g:1269:1: ( ruleExpression )
            // InternalHale.g:1270:2: ruleExpression
            {
             before(grammarAccess.getTerminalExpressionAccess().getExpressionParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getTerminalExpressionAccess().getExpressionParserRuleCall_0_1()); 

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
    // $ANTLR end "rule__TerminalExpression__Group_0__1__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_0__2"
    // InternalHale.g:1279:1: rule__TerminalExpression__Group_0__2 : rule__TerminalExpression__Group_0__2__Impl ;
    public final void rule__TerminalExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1283:1: ( rule__TerminalExpression__Group_0__2__Impl )
            // InternalHale.g:1284:2: rule__TerminalExpression__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_0__2__Impl();

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
    // $ANTLR end "rule__TerminalExpression__Group_0__2"


    // $ANTLR start "rule__TerminalExpression__Group_0__2__Impl"
    // InternalHale.g:1290:1: rule__TerminalExpression__Group_0__2__Impl : ( ')' ) ;
    public final void rule__TerminalExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1294:1: ( ( ')' ) )
            // InternalHale.g:1295:1: ( ')' )
            {
            // InternalHale.g:1295:1: ( ')' )
            // InternalHale.g:1296:2: ')'
            {
             before(grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_0_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTerminalExpressionAccess().getRightParenthesisKeyword_0_2()); 

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
    // $ANTLR end "rule__TerminalExpression__Group_0__2__Impl"


    // $ANTLR start "rule__Hale__StatementsAssignment_1"
    // InternalHale.g:1306:1: rule__Hale__StatementsAssignment_1 : ( ruleStatement ) ;
    public final void rule__Hale__StatementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1310:1: ( ( ruleStatement ) )
            // InternalHale.g:1311:2: ( ruleStatement )
            {
            // InternalHale.g:1311:2: ( ruleStatement )
            // InternalHale.g:1312:3: ruleStatement
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
    // InternalHale.g:1321:1: rule__Print__ValueAssignment_1 : ( ruleExpression ) ;
    public final void rule__Print__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1325:1: ( ( ruleExpression ) )
            // InternalHale.g:1326:2: ( ruleExpression )
            {
            // InternalHale.g:1326:2: ( ruleExpression )
            // InternalHale.g:1327:3: ruleExpression
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
    // InternalHale.g:1336:1: rule__Binding__MutableAssignment_1 : ( ( 'mut' ) ) ;
    public final void rule__Binding__MutableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1340:1: ( ( ( 'mut' ) ) )
            // InternalHale.g:1341:2: ( ( 'mut' ) )
            {
            // InternalHale.g:1341:2: ( ( 'mut' ) )
            // InternalHale.g:1342:3: ( 'mut' )
            {
             before(grammarAccess.getBindingAccess().getMutableMutKeyword_1_0()); 
            // InternalHale.g:1343:3: ( 'mut' )
            // InternalHale.g:1344:4: 'mut'
            {
             before(grammarAccess.getBindingAccess().getMutableMutKeyword_1_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalHale.g:1355:1: rule__Binding__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Binding__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1359:1: ( ( RULE_ID ) )
            // InternalHale.g:1360:2: ( RULE_ID )
            {
            // InternalHale.g:1360:2: ( RULE_ID )
            // InternalHale.g:1361:3: RULE_ID
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
    // InternalHale.g:1370:1: rule__Binding__ValueAssignment_4 : ( ruleExpression ) ;
    public final void rule__Binding__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1374:1: ( ( ruleExpression ) )
            // InternalHale.g:1375:2: ( ruleExpression )
            {
            // InternalHale.g:1375:2: ( ruleExpression )
            // InternalHale.g:1376:3: ruleExpression
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
    // InternalHale.g:1385:1: rule__BindingReference__BindingAssignment : ( ( RULE_ID ) ) ;
    public final void rule__BindingReference__BindingAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1389:1: ( ( ( RULE_ID ) ) )
            // InternalHale.g:1390:2: ( ( RULE_ID ) )
            {
            // InternalHale.g:1390:2: ( ( RULE_ID ) )
            // InternalHale.g:1391:3: ( RULE_ID )
            {
             before(grammarAccess.getBindingReferenceAccess().getBindingBindingCrossReference_0()); 
            // InternalHale.g:1392:3: ( RULE_ID )
            // InternalHale.g:1393:4: RULE_ID
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
    // InternalHale.g:1404:1: rule__Assignment__BindingAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Assignment__BindingAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1408:1: ( ( ( RULE_ID ) ) )
            // InternalHale.g:1409:2: ( ( RULE_ID ) )
            {
            // InternalHale.g:1409:2: ( ( RULE_ID ) )
            // InternalHale.g:1410:3: ( RULE_ID )
            {
             before(grammarAccess.getAssignmentAccess().getBindingBindingCrossReference_0_0()); 
            // InternalHale.g:1411:3: ( RULE_ID )
            // InternalHale.g:1412:4: RULE_ID
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
    // InternalHale.g:1423:1: rule__Assignment__ValueAssignment_2 : ( ruleExpression ) ;
    public final void rule__Assignment__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1427:1: ( ( ruleExpression ) )
            // InternalHale.g:1428:2: ( ruleExpression )
            {
            // InternalHale.g:1428:2: ( ruleExpression )
            // InternalHale.g:1429:3: ruleExpression
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


    // $ANTLR start "rule__Expression__RightAssignment_1_0_2"
    // InternalHale.g:1438:1: rule__Expression__RightAssignment_1_0_2 : ( ruleTerminalExpression ) ;
    public final void rule__Expression__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1442:1: ( ( ruleTerminalExpression ) )
            // InternalHale.g:1443:2: ( ruleTerminalExpression )
            {
            // InternalHale.g:1443:2: ( ruleTerminalExpression )
            // InternalHale.g:1444:3: ruleTerminalExpression
            {
             before(grammarAccess.getExpressionAccess().getRightTerminalExpressionParserRuleCall_1_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTerminalExpression();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getRightTerminalExpressionParserRuleCall_1_0_2_0()); 

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
    // $ANTLR end "rule__Expression__RightAssignment_1_0_2"


    // $ANTLR start "rule__Expression__RightAssignment_1_1_2"
    // InternalHale.g:1453:1: rule__Expression__RightAssignment_1_1_2 : ( ruleTerminalExpression ) ;
    public final void rule__Expression__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1457:1: ( ( ruleTerminalExpression ) )
            // InternalHale.g:1458:2: ( ruleTerminalExpression )
            {
            // InternalHale.g:1458:2: ( ruleTerminalExpression )
            // InternalHale.g:1459:3: ruleTerminalExpression
            {
             before(grammarAccess.getExpressionAccess().getRightTerminalExpressionParserRuleCall_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTerminalExpression();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getRightTerminalExpressionParserRuleCall_1_1_2_0()); 

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
    // $ANTLR end "rule__Expression__RightAssignment_1_1_2"


    // $ANTLR start "rule__Expression__RightAssignment_1_2_2"
    // InternalHale.g:1468:1: rule__Expression__RightAssignment_1_2_2 : ( ruleTerminalExpression ) ;
    public final void rule__Expression__RightAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1472:1: ( ( ruleTerminalExpression ) )
            // InternalHale.g:1473:2: ( ruleTerminalExpression )
            {
            // InternalHale.g:1473:2: ( ruleTerminalExpression )
            // InternalHale.g:1474:3: ruleTerminalExpression
            {
             before(grammarAccess.getExpressionAccess().getRightTerminalExpressionParserRuleCall_1_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTerminalExpression();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getRightTerminalExpressionParserRuleCall_1_2_2_0()); 

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
    // $ANTLR end "rule__Expression__RightAssignment_1_2_2"


    // $ANTLR start "rule__Expression__RightAssignment_1_3_2"
    // InternalHale.g:1483:1: rule__Expression__RightAssignment_1_3_2 : ( ruleTerminalExpression ) ;
    public final void rule__Expression__RightAssignment_1_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1487:1: ( ( ruleTerminalExpression ) )
            // InternalHale.g:1488:2: ( ruleTerminalExpression )
            {
            // InternalHale.g:1488:2: ( ruleTerminalExpression )
            // InternalHale.g:1489:3: ruleTerminalExpression
            {
             before(grammarAccess.getExpressionAccess().getRightTerminalExpressionParserRuleCall_1_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTerminalExpression();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getRightTerminalExpressionParserRuleCall_1_3_2_0()); 

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
    // $ANTLR end "rule__Expression__RightAssignment_1_3_2"


    // $ANTLR start "rule__IntLiteral__ValueAssignment"
    // InternalHale.g:1498:1: rule__IntLiteral__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1502:1: ( ( RULE_INT ) )
            // InternalHale.g:1503:2: ( RULE_INT )
            {
            // InternalHale.g:1503:2: ( RULE_INT )
            // InternalHale.g:1504:3: RULE_INT
            {
             before(grammarAccess.getIntLiteralAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIntLiteralAccess().getValueINTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__IntLiteral__ValueAssignment"


    // $ANTLR start "rule__StringLiteral__ValueAssignment"
    // InternalHale.g:1513:1: rule__StringLiteral__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1517:1: ( ( RULE_STRING ) )
            // InternalHale.g:1518:2: ( RULE_STRING )
            {
            // InternalHale.g:1518:2: ( RULE_STRING )
            // InternalHale.g:1519:3: RULE_STRING
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000083070L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000083072L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000078000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100000L});

}