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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DOUBLE", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "';'", "'{'", "'}'", "'and'", "'or'", "'=='", "'!='", "'<='", "'<'", "'>='", "'>'", "'+'", "'-'", "'*'", "'/'", "'%'", "'**'", "'not'", "'('", "')'", "'let'", "'='", "'print'", "'if'", "'elseif'", "'else'", "'while'", "'mut'"
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


    // $ANTLR start "entryRuleBlock"
    // InternalHale.g:78:1: entryRuleBlock : ruleBlock EOF ;
    public final void entryRuleBlock() throws RecognitionException {
        try {
            // InternalHale.g:79:1: ( ruleBlock EOF )
            // InternalHale.g:80:1: ruleBlock EOF
            {
             before(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_1);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getBlockRule()); 
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
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // InternalHale.g:87:1: ruleBlock : ( ( rule__Block__Group__0 ) ) ;
    public final void ruleBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:91:2: ( ( ( rule__Block__Group__0 ) ) )
            // InternalHale.g:92:2: ( ( rule__Block__Group__0 ) )
            {
            // InternalHale.g:92:2: ( ( rule__Block__Group__0 ) )
            // InternalHale.g:93:3: ( rule__Block__Group__0 )
            {
             before(grammarAccess.getBlockAccess().getGroup()); 
            // InternalHale.g:94:3: ( rule__Block__Group__0 )
            // InternalHale.g:94:4: rule__Block__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Block__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBlockAccess().getGroup()); 

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
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleStatement"
    // InternalHale.g:103:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalHale.g:104:1: ( ruleStatement EOF )
            // InternalHale.g:105:1: ruleStatement EOF
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
    // InternalHale.g:112:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:116:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalHale.g:117:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalHale.g:117:2: ( ( rule__Statement__Alternatives ) )
            // InternalHale.g:118:3: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // InternalHale.g:119:3: ( rule__Statement__Alternatives )
            // InternalHale.g:119:4: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives()); 

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


    // $ANTLR start "entryRuleBracedBlock"
    // InternalHale.g:128:1: entryRuleBracedBlock : ruleBracedBlock EOF ;
    public final void entryRuleBracedBlock() throws RecognitionException {
        try {
            // InternalHale.g:129:1: ( ruleBracedBlock EOF )
            // InternalHale.g:130:1: ruleBracedBlock EOF
            {
             before(grammarAccess.getBracedBlockRule()); 
            pushFollow(FOLLOW_1);
            ruleBracedBlock();

            state._fsp--;

             after(grammarAccess.getBracedBlockRule()); 
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
    // $ANTLR end "entryRuleBracedBlock"


    // $ANTLR start "ruleBracedBlock"
    // InternalHale.g:137:1: ruleBracedBlock : ( ( rule__BracedBlock__Group__0 ) ) ;
    public final void ruleBracedBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:141:2: ( ( ( rule__BracedBlock__Group__0 ) ) )
            // InternalHale.g:142:2: ( ( rule__BracedBlock__Group__0 ) )
            {
            // InternalHale.g:142:2: ( ( rule__BracedBlock__Group__0 ) )
            // InternalHale.g:143:3: ( rule__BracedBlock__Group__0 )
            {
             before(grammarAccess.getBracedBlockAccess().getGroup()); 
            // InternalHale.g:144:3: ( rule__BracedBlock__Group__0 )
            // InternalHale.g:144:4: rule__BracedBlock__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BracedBlock__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBracedBlockAccess().getGroup()); 

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
    // $ANTLR end "ruleBracedBlock"


    // $ANTLR start "entryRuleExpression"
    // InternalHale.g:153:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalHale.g:154:1: ( ruleExpression EOF )
            // InternalHale.g:155:1: ruleExpression EOF
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
    // InternalHale.g:162:1: ruleExpression : ( ruleExpression7 ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:166:2: ( ( ruleExpression7 ) )
            // InternalHale.g:167:2: ( ruleExpression7 )
            {
            // InternalHale.g:167:2: ( ruleExpression7 )
            // InternalHale.g:168:3: ruleExpression7
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
    // InternalHale.g:178:1: entryRuleExpression7 : ruleExpression7 EOF ;
    public final void entryRuleExpression7() throws RecognitionException {
        try {
            // InternalHale.g:179:1: ( ruleExpression7 EOF )
            // InternalHale.g:180:1: ruleExpression7 EOF
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
    // InternalHale.g:187:1: ruleExpression7 : ( ( rule__Expression7__Group__0 ) ) ;
    public final void ruleExpression7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:191:2: ( ( ( rule__Expression7__Group__0 ) ) )
            // InternalHale.g:192:2: ( ( rule__Expression7__Group__0 ) )
            {
            // InternalHale.g:192:2: ( ( rule__Expression7__Group__0 ) )
            // InternalHale.g:193:3: ( rule__Expression7__Group__0 )
            {
             before(grammarAccess.getExpression7Access().getGroup()); 
            // InternalHale.g:194:3: ( rule__Expression7__Group__0 )
            // InternalHale.g:194:4: rule__Expression7__Group__0
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
    // InternalHale.g:203:1: entryRuleExpression6 : ruleExpression6 EOF ;
    public final void entryRuleExpression6() throws RecognitionException {
        try {
            // InternalHale.g:204:1: ( ruleExpression6 EOF )
            // InternalHale.g:205:1: ruleExpression6 EOF
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
    // InternalHale.g:212:1: ruleExpression6 : ( ( rule__Expression6__Group__0 ) ) ;
    public final void ruleExpression6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:216:2: ( ( ( rule__Expression6__Group__0 ) ) )
            // InternalHale.g:217:2: ( ( rule__Expression6__Group__0 ) )
            {
            // InternalHale.g:217:2: ( ( rule__Expression6__Group__0 ) )
            // InternalHale.g:218:3: ( rule__Expression6__Group__0 )
            {
             before(grammarAccess.getExpression6Access().getGroup()); 
            // InternalHale.g:219:3: ( rule__Expression6__Group__0 )
            // InternalHale.g:219:4: rule__Expression6__Group__0
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
    // InternalHale.g:228:1: entryRuleExpression5 : ruleExpression5 EOF ;
    public final void entryRuleExpression5() throws RecognitionException {
        try {
            // InternalHale.g:229:1: ( ruleExpression5 EOF )
            // InternalHale.g:230:1: ruleExpression5 EOF
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
    // InternalHale.g:237:1: ruleExpression5 : ( ( rule__Expression5__Group__0 ) ) ;
    public final void ruleExpression5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:241:2: ( ( ( rule__Expression5__Group__0 ) ) )
            // InternalHale.g:242:2: ( ( rule__Expression5__Group__0 ) )
            {
            // InternalHale.g:242:2: ( ( rule__Expression5__Group__0 ) )
            // InternalHale.g:243:3: ( rule__Expression5__Group__0 )
            {
             before(grammarAccess.getExpression5Access().getGroup()); 
            // InternalHale.g:244:3: ( rule__Expression5__Group__0 )
            // InternalHale.g:244:4: rule__Expression5__Group__0
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
    // InternalHale.g:253:1: entryRuleExpression4 : ruleExpression4 EOF ;
    public final void entryRuleExpression4() throws RecognitionException {
        try {
            // InternalHale.g:254:1: ( ruleExpression4 EOF )
            // InternalHale.g:255:1: ruleExpression4 EOF
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
    // InternalHale.g:262:1: ruleExpression4 : ( ( rule__Expression4__Group__0 ) ) ;
    public final void ruleExpression4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:266:2: ( ( ( rule__Expression4__Group__0 ) ) )
            // InternalHale.g:267:2: ( ( rule__Expression4__Group__0 ) )
            {
            // InternalHale.g:267:2: ( ( rule__Expression4__Group__0 ) )
            // InternalHale.g:268:3: ( rule__Expression4__Group__0 )
            {
             before(grammarAccess.getExpression4Access().getGroup()); 
            // InternalHale.g:269:3: ( rule__Expression4__Group__0 )
            // InternalHale.g:269:4: rule__Expression4__Group__0
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
    // InternalHale.g:278:1: entryRuleExpression3 : ruleExpression3 EOF ;
    public final void entryRuleExpression3() throws RecognitionException {
        try {
            // InternalHale.g:279:1: ( ruleExpression3 EOF )
            // InternalHale.g:280:1: ruleExpression3 EOF
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
    // InternalHale.g:287:1: ruleExpression3 : ( ( rule__Expression3__Group__0 ) ) ;
    public final void ruleExpression3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:291:2: ( ( ( rule__Expression3__Group__0 ) ) )
            // InternalHale.g:292:2: ( ( rule__Expression3__Group__0 ) )
            {
            // InternalHale.g:292:2: ( ( rule__Expression3__Group__0 ) )
            // InternalHale.g:293:3: ( rule__Expression3__Group__0 )
            {
             before(grammarAccess.getExpression3Access().getGroup()); 
            // InternalHale.g:294:3: ( rule__Expression3__Group__0 )
            // InternalHale.g:294:4: rule__Expression3__Group__0
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
    // InternalHale.g:303:1: entryRuleExpression2 : ruleExpression2 EOF ;
    public final void entryRuleExpression2() throws RecognitionException {
        try {
            // InternalHale.g:304:1: ( ruleExpression2 EOF )
            // InternalHale.g:305:1: ruleExpression2 EOF
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
    // InternalHale.g:312:1: ruleExpression2 : ( ( rule__Expression2__Group__0 ) ) ;
    public final void ruleExpression2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:316:2: ( ( ( rule__Expression2__Group__0 ) ) )
            // InternalHale.g:317:2: ( ( rule__Expression2__Group__0 ) )
            {
            // InternalHale.g:317:2: ( ( rule__Expression2__Group__0 ) )
            // InternalHale.g:318:3: ( rule__Expression2__Group__0 )
            {
             before(grammarAccess.getExpression2Access().getGroup()); 
            // InternalHale.g:319:3: ( rule__Expression2__Group__0 )
            // InternalHale.g:319:4: rule__Expression2__Group__0
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
    // InternalHale.g:328:1: entryRuleExpression1 : ruleExpression1 EOF ;
    public final void entryRuleExpression1() throws RecognitionException {
        try {
            // InternalHale.g:329:1: ( ruleExpression1 EOF )
            // InternalHale.g:330:1: ruleExpression1 EOF
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
    // InternalHale.g:337:1: ruleExpression1 : ( ( rule__Expression1__Alternatives ) ) ;
    public final void ruleExpression1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:341:2: ( ( ( rule__Expression1__Alternatives ) ) )
            // InternalHale.g:342:2: ( ( rule__Expression1__Alternatives ) )
            {
            // InternalHale.g:342:2: ( ( rule__Expression1__Alternatives ) )
            // InternalHale.g:343:3: ( rule__Expression1__Alternatives )
            {
             before(grammarAccess.getExpression1Access().getAlternatives()); 
            // InternalHale.g:344:3: ( rule__Expression1__Alternatives )
            // InternalHale.g:344:4: rule__Expression1__Alternatives
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
    // InternalHale.g:353:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalHale.g:354:1: ( rulePrimary EOF )
            // InternalHale.g:355:1: rulePrimary EOF
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
    // InternalHale.g:362:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:366:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalHale.g:367:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalHale.g:367:2: ( ( rule__Primary__Alternatives ) )
            // InternalHale.g:368:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalHale.g:369:3: ( rule__Primary__Alternatives )
            // InternalHale.g:369:4: rule__Primary__Alternatives
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
    // InternalHale.g:378:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // InternalHale.g:379:1: ( ruleLiteral EOF )
            // InternalHale.g:380:1: ruleLiteral EOF
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
    // InternalHale.g:387:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:391:2: ( ( ( rule__Literal__Alternatives ) ) )
            // InternalHale.g:392:2: ( ( rule__Literal__Alternatives ) )
            {
            // InternalHale.g:392:2: ( ( rule__Literal__Alternatives ) )
            // InternalHale.g:393:3: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // InternalHale.g:394:3: ( rule__Literal__Alternatives )
            // InternalHale.g:394:4: rule__Literal__Alternatives
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
    // InternalHale.g:403:1: entryRuleNumberLiteral : ruleNumberLiteral EOF ;
    public final void entryRuleNumberLiteral() throws RecognitionException {
        try {
            // InternalHale.g:404:1: ( ruleNumberLiteral EOF )
            // InternalHale.g:405:1: ruleNumberLiteral EOF
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
    // InternalHale.g:412:1: ruleNumberLiteral : ( ( rule__NumberLiteral__ValueAssignment ) ) ;
    public final void ruleNumberLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:416:2: ( ( ( rule__NumberLiteral__ValueAssignment ) ) )
            // InternalHale.g:417:2: ( ( rule__NumberLiteral__ValueAssignment ) )
            {
            // InternalHale.g:417:2: ( ( rule__NumberLiteral__ValueAssignment ) )
            // InternalHale.g:418:3: ( rule__NumberLiteral__ValueAssignment )
            {
             before(grammarAccess.getNumberLiteralAccess().getValueAssignment()); 
            // InternalHale.g:419:3: ( rule__NumberLiteral__ValueAssignment )
            // InternalHale.g:419:4: rule__NumberLiteral__ValueAssignment
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
    // InternalHale.g:428:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // InternalHale.g:429:1: ( ruleStringLiteral EOF )
            // InternalHale.g:430:1: ruleStringLiteral EOF
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
    // InternalHale.g:437:1: ruleStringLiteral : ( ( rule__StringLiteral__ValueAssignment ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:441:2: ( ( ( rule__StringLiteral__ValueAssignment ) ) )
            // InternalHale.g:442:2: ( ( rule__StringLiteral__ValueAssignment ) )
            {
            // InternalHale.g:442:2: ( ( rule__StringLiteral__ValueAssignment ) )
            // InternalHale.g:443:3: ( rule__StringLiteral__ValueAssignment )
            {
             before(grammarAccess.getStringLiteralAccess().getValueAssignment()); 
            // InternalHale.g:444:3: ( rule__StringLiteral__ValueAssignment )
            // InternalHale.g:444:4: rule__StringLiteral__ValueAssignment
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


    // $ANTLR start "entryRuleBinding"
    // InternalHale.g:453:1: entryRuleBinding : ruleBinding EOF ;
    public final void entryRuleBinding() throws RecognitionException {
        try {
            // InternalHale.g:454:1: ( ruleBinding EOF )
            // InternalHale.g:455:1: ruleBinding EOF
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
    // InternalHale.g:462:1: ruleBinding : ( ( rule__Binding__Group__0 ) ) ;
    public final void ruleBinding() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:466:2: ( ( ( rule__Binding__Group__0 ) ) )
            // InternalHale.g:467:2: ( ( rule__Binding__Group__0 ) )
            {
            // InternalHale.g:467:2: ( ( rule__Binding__Group__0 ) )
            // InternalHale.g:468:3: ( rule__Binding__Group__0 )
            {
             before(grammarAccess.getBindingAccess().getGroup()); 
            // InternalHale.g:469:3: ( rule__Binding__Group__0 )
            // InternalHale.g:469:4: rule__Binding__Group__0
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
    // InternalHale.g:478:1: entryRuleBindingReference : ruleBindingReference EOF ;
    public final void entryRuleBindingReference() throws RecognitionException {
        try {
            // InternalHale.g:479:1: ( ruleBindingReference EOF )
            // InternalHale.g:480:1: ruleBindingReference EOF
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
    // InternalHale.g:487:1: ruleBindingReference : ( ( rule__BindingReference__BindingAssignment ) ) ;
    public final void ruleBindingReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:491:2: ( ( ( rule__BindingReference__BindingAssignment ) ) )
            // InternalHale.g:492:2: ( ( rule__BindingReference__BindingAssignment ) )
            {
            // InternalHale.g:492:2: ( ( rule__BindingReference__BindingAssignment ) )
            // InternalHale.g:493:3: ( rule__BindingReference__BindingAssignment )
            {
             before(grammarAccess.getBindingReferenceAccess().getBindingAssignment()); 
            // InternalHale.g:494:3: ( rule__BindingReference__BindingAssignment )
            // InternalHale.g:494:4: rule__BindingReference__BindingAssignment
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
    // InternalHale.g:503:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // InternalHale.g:504:1: ( ruleAssignment EOF )
            // InternalHale.g:505:1: ruleAssignment EOF
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
    // InternalHale.g:512:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:516:2: ( ( ( rule__Assignment__Group__0 ) ) )
            // InternalHale.g:517:2: ( ( rule__Assignment__Group__0 ) )
            {
            // InternalHale.g:517:2: ( ( rule__Assignment__Group__0 ) )
            // InternalHale.g:518:3: ( rule__Assignment__Group__0 )
            {
             before(grammarAccess.getAssignmentAccess().getGroup()); 
            // InternalHale.g:519:3: ( rule__Assignment__Group__0 )
            // InternalHale.g:519:4: rule__Assignment__Group__0
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


    // $ANTLR start "entryRulePrint"
    // InternalHale.g:528:1: entryRulePrint : rulePrint EOF ;
    public final void entryRulePrint() throws RecognitionException {
        try {
            // InternalHale.g:529:1: ( rulePrint EOF )
            // InternalHale.g:530:1: rulePrint EOF
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
    // InternalHale.g:537:1: rulePrint : ( ( rule__Print__Group__0 ) ) ;
    public final void rulePrint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:541:2: ( ( ( rule__Print__Group__0 ) ) )
            // InternalHale.g:542:2: ( ( rule__Print__Group__0 ) )
            {
            // InternalHale.g:542:2: ( ( rule__Print__Group__0 ) )
            // InternalHale.g:543:3: ( rule__Print__Group__0 )
            {
             before(grammarAccess.getPrintAccess().getGroup()); 
            // InternalHale.g:544:3: ( rule__Print__Group__0 )
            // InternalHale.g:544:4: rule__Print__Group__0
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


    // $ANTLR start "entryRuleIf"
    // InternalHale.g:553:1: entryRuleIf : ruleIf EOF ;
    public final void entryRuleIf() throws RecognitionException {
        try {
            // InternalHale.g:554:1: ( ruleIf EOF )
            // InternalHale.g:555:1: ruleIf EOF
            {
             before(grammarAccess.getIfRule()); 
            pushFollow(FOLLOW_1);
            ruleIf();

            state._fsp--;

             after(grammarAccess.getIfRule()); 
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
    // $ANTLR end "entryRuleIf"


    // $ANTLR start "ruleIf"
    // InternalHale.g:562:1: ruleIf : ( ( rule__If__Group__0 ) ) ;
    public final void ruleIf() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:566:2: ( ( ( rule__If__Group__0 ) ) )
            // InternalHale.g:567:2: ( ( rule__If__Group__0 ) )
            {
            // InternalHale.g:567:2: ( ( rule__If__Group__0 ) )
            // InternalHale.g:568:3: ( rule__If__Group__0 )
            {
             before(grammarAccess.getIfAccess().getGroup()); 
            // InternalHale.g:569:3: ( rule__If__Group__0 )
            // InternalHale.g:569:4: rule__If__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__If__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIfAccess().getGroup()); 

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
    // $ANTLR end "ruleIf"


    // $ANTLR start "entryRuleWhile"
    // InternalHale.g:578:1: entryRuleWhile : ruleWhile EOF ;
    public final void entryRuleWhile() throws RecognitionException {
        try {
            // InternalHale.g:579:1: ( ruleWhile EOF )
            // InternalHale.g:580:1: ruleWhile EOF
            {
             before(grammarAccess.getWhileRule()); 
            pushFollow(FOLLOW_1);
            ruleWhile();

            state._fsp--;

             after(grammarAccess.getWhileRule()); 
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
    // $ANTLR end "entryRuleWhile"


    // $ANTLR start "ruleWhile"
    // InternalHale.g:587:1: ruleWhile : ( ( rule__While__Group__0 ) ) ;
    public final void ruleWhile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:591:2: ( ( ( rule__While__Group__0 ) ) )
            // InternalHale.g:592:2: ( ( rule__While__Group__0 ) )
            {
            // InternalHale.g:592:2: ( ( rule__While__Group__0 ) )
            // InternalHale.g:593:3: ( rule__While__Group__0 )
            {
             before(grammarAccess.getWhileAccess().getGroup()); 
            // InternalHale.g:594:3: ( rule__While__Group__0 )
            // InternalHale.g:594:4: rule__While__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__While__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWhileAccess().getGroup()); 

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
    // $ANTLR end "ruleWhile"


    // $ANTLR start "rule__Block__Alternatives_1"
    // InternalHale.g:602:1: rule__Block__Alternatives_1 : ( ( ( rule__Block__StatementsAssignment_1_0 ) ) | ( ';' ) );
    public final void rule__Block__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:606:1: ( ( ( rule__Block__StatementsAssignment_1_0 ) ) | ( ';' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=RULE_DOUBLE && LA1_0<=RULE_ID)||LA1_0==11||LA1_0==22||(LA1_0>=27 && LA1_0<=28)||LA1_0==30||(LA1_0>=32 && LA1_0<=33)||LA1_0==36) ) {
                alt1=1;
            }
            else if ( (LA1_0==10) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalHale.g:607:2: ( ( rule__Block__StatementsAssignment_1_0 ) )
                    {
                    // InternalHale.g:607:2: ( ( rule__Block__StatementsAssignment_1_0 ) )
                    // InternalHale.g:608:3: ( rule__Block__StatementsAssignment_1_0 )
                    {
                     before(grammarAccess.getBlockAccess().getStatementsAssignment_1_0()); 
                    // InternalHale.g:609:3: ( rule__Block__StatementsAssignment_1_0 )
                    // InternalHale.g:609:4: rule__Block__StatementsAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Block__StatementsAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBlockAccess().getStatementsAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHale.g:613:2: ( ';' )
                    {
                    // InternalHale.g:613:2: ( ';' )
                    // InternalHale.g:614:3: ';'
                    {
                     before(grammarAccess.getBlockAccess().getSemicolonKeyword_1_1()); 
                    match(input,10,FOLLOW_2); 
                     after(grammarAccess.getBlockAccess().getSemicolonKeyword_1_1()); 

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
    // $ANTLR end "rule__Block__Alternatives_1"


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalHale.g:623:1: rule__Statement__Alternatives : ( ( ruleBracedBlock ) | ( ruleIf ) | ( ruleWhile ) | ( ( rule__Statement__Group_3__0 ) ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:627:1: ( ( ruleBracedBlock ) | ( ruleIf ) | ( ruleWhile ) | ( ( rule__Statement__Group_3__0 ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 33:
                {
                alt2=2;
                }
                break;
            case 36:
                {
                alt2=3;
                }
                break;
            case RULE_DOUBLE:
            case RULE_STRING:
            case RULE_ID:
            case 22:
            case 27:
            case 28:
            case 30:
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
                    // InternalHale.g:628:2: ( ruleBracedBlock )
                    {
                    // InternalHale.g:628:2: ( ruleBracedBlock )
                    // InternalHale.g:629:3: ruleBracedBlock
                    {
                     before(grammarAccess.getStatementAccess().getBracedBlockParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBracedBlock();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getBracedBlockParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHale.g:634:2: ( ruleIf )
                    {
                    // InternalHale.g:634:2: ( ruleIf )
                    // InternalHale.g:635:3: ruleIf
                    {
                     before(grammarAccess.getStatementAccess().getIfParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIf();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getIfParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHale.g:640:2: ( ruleWhile )
                    {
                    // InternalHale.g:640:2: ( ruleWhile )
                    // InternalHale.g:641:3: ruleWhile
                    {
                     before(grammarAccess.getStatementAccess().getWhileParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleWhile();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getWhileParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalHale.g:646:2: ( ( rule__Statement__Group_3__0 ) )
                    {
                    // InternalHale.g:646:2: ( ( rule__Statement__Group_3__0 ) )
                    // InternalHale.g:647:3: ( rule__Statement__Group_3__0 )
                    {
                     before(grammarAccess.getStatementAccess().getGroup_3()); 
                    // InternalHale.g:648:3: ( rule__Statement__Group_3__0 )
                    // InternalHale.g:648:4: rule__Statement__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__Statement__Alternatives_3_0"
    // InternalHale.g:656:1: rule__Statement__Alternatives_3_0 : ( ( rulePrint ) | ( ruleBinding ) | ( ruleAssignment ) | ( ruleExpression ) );
    public final void rule__Statement__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:660:1: ( ( rulePrint ) | ( ruleBinding ) | ( ruleAssignment ) | ( ruleExpression ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt3=1;
                }
                break;
            case 30:
                {
                alt3=2;
                }
                break;
            case RULE_ID:
                {
                int LA3_3 = input.LA(2);

                if ( (LA3_3==31) ) {
                    alt3=3;
                }
                else if ( (LA3_3==10||(LA3_3>=13 && LA3_3<=26)) ) {
                    alt3=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 3, input);

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
                    // InternalHale.g:661:2: ( rulePrint )
                    {
                    // InternalHale.g:661:2: ( rulePrint )
                    // InternalHale.g:662:3: rulePrint
                    {
                     before(grammarAccess.getStatementAccess().getPrintParserRuleCall_3_0_0()); 
                    pushFollow(FOLLOW_2);
                    rulePrint();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getPrintParserRuleCall_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHale.g:667:2: ( ruleBinding )
                    {
                    // InternalHale.g:667:2: ( ruleBinding )
                    // InternalHale.g:668:3: ruleBinding
                    {
                     before(grammarAccess.getStatementAccess().getBindingParserRuleCall_3_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleBinding();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getBindingParserRuleCall_3_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHale.g:673:2: ( ruleAssignment )
                    {
                    // InternalHale.g:673:2: ( ruleAssignment )
                    // InternalHale.g:674:3: ruleAssignment
                    {
                     before(grammarAccess.getStatementAccess().getAssignmentParserRuleCall_3_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleAssignment();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getAssignmentParserRuleCall_3_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalHale.g:679:2: ( ruleExpression )
                    {
                    // InternalHale.g:679:2: ( ruleExpression )
                    // InternalHale.g:680:3: ruleExpression
                    {
                     before(grammarAccess.getStatementAccess().getExpressionParserRuleCall_3_0_3()); 
                    pushFollow(FOLLOW_2);
                    ruleExpression();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getExpressionParserRuleCall_3_0_3()); 

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
    // $ANTLR end "rule__Statement__Alternatives_3_0"


    // $ANTLR start "rule__Expression7__Alternatives_1"
    // InternalHale.g:689:1: rule__Expression7__Alternatives_1 : ( ( ( rule__Expression7__Group_1_0__0 ) ) | ( ( rule__Expression7__Group_1_1__0 ) ) );
    public final void rule__Expression7__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:693:1: ( ( ( rule__Expression7__Group_1_0__0 ) ) | ( ( rule__Expression7__Group_1_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            else if ( (LA4_0==14) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalHale.g:694:2: ( ( rule__Expression7__Group_1_0__0 ) )
                    {
                    // InternalHale.g:694:2: ( ( rule__Expression7__Group_1_0__0 ) )
                    // InternalHale.g:695:3: ( rule__Expression7__Group_1_0__0 )
                    {
                     before(grammarAccess.getExpression7Access().getGroup_1_0()); 
                    // InternalHale.g:696:3: ( rule__Expression7__Group_1_0__0 )
                    // InternalHale.g:696:4: rule__Expression7__Group_1_0__0
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
                    // InternalHale.g:700:2: ( ( rule__Expression7__Group_1_1__0 ) )
                    {
                    // InternalHale.g:700:2: ( ( rule__Expression7__Group_1_1__0 ) )
                    // InternalHale.g:701:3: ( rule__Expression7__Group_1_1__0 )
                    {
                     before(grammarAccess.getExpression7Access().getGroup_1_1()); 
                    // InternalHale.g:702:3: ( rule__Expression7__Group_1_1__0 )
                    // InternalHale.g:702:4: rule__Expression7__Group_1_1__0
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
    // InternalHale.g:710:1: rule__Expression6__Alternatives_1 : ( ( ( rule__Expression6__Group_1_0__0 ) ) | ( ( rule__Expression6__Group_1_1__0 ) ) );
    public final void rule__Expression6__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:714:1: ( ( ( rule__Expression6__Group_1_0__0 ) ) | ( ( rule__Expression6__Group_1_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            else if ( (LA5_0==16) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalHale.g:715:2: ( ( rule__Expression6__Group_1_0__0 ) )
                    {
                    // InternalHale.g:715:2: ( ( rule__Expression6__Group_1_0__0 ) )
                    // InternalHale.g:716:3: ( rule__Expression6__Group_1_0__0 )
                    {
                     before(grammarAccess.getExpression6Access().getGroup_1_0()); 
                    // InternalHale.g:717:3: ( rule__Expression6__Group_1_0__0 )
                    // InternalHale.g:717:4: rule__Expression6__Group_1_0__0
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
                    // InternalHale.g:721:2: ( ( rule__Expression6__Group_1_1__0 ) )
                    {
                    // InternalHale.g:721:2: ( ( rule__Expression6__Group_1_1__0 ) )
                    // InternalHale.g:722:3: ( rule__Expression6__Group_1_1__0 )
                    {
                     before(grammarAccess.getExpression6Access().getGroup_1_1()); 
                    // InternalHale.g:723:3: ( rule__Expression6__Group_1_1__0 )
                    // InternalHale.g:723:4: rule__Expression6__Group_1_1__0
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
    // InternalHale.g:731:1: rule__Expression5__Alternatives_1 : ( ( ( rule__Expression5__Group_1_0__0 ) ) | ( ( rule__Expression5__Group_1_1__0 ) ) | ( ( rule__Expression5__Group_1_2__0 ) ) | ( ( rule__Expression5__Group_1_3__0 ) ) );
    public final void rule__Expression5__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:735:1: ( ( ( rule__Expression5__Group_1_0__0 ) ) | ( ( rule__Expression5__Group_1_1__0 ) ) | ( ( rule__Expression5__Group_1_2__0 ) ) | ( ( rule__Expression5__Group_1_3__0 ) ) )
            int alt6=4;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalHale.g:736:2: ( ( rule__Expression5__Group_1_0__0 ) )
                    {
                    // InternalHale.g:736:2: ( ( rule__Expression5__Group_1_0__0 ) )
                    // InternalHale.g:737:3: ( rule__Expression5__Group_1_0__0 )
                    {
                     before(grammarAccess.getExpression5Access().getGroup_1_0()); 
                    // InternalHale.g:738:3: ( rule__Expression5__Group_1_0__0 )
                    // InternalHale.g:738:4: rule__Expression5__Group_1_0__0
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
                    // InternalHale.g:742:2: ( ( rule__Expression5__Group_1_1__0 ) )
                    {
                    // InternalHale.g:742:2: ( ( rule__Expression5__Group_1_1__0 ) )
                    // InternalHale.g:743:3: ( rule__Expression5__Group_1_1__0 )
                    {
                     before(grammarAccess.getExpression5Access().getGroup_1_1()); 
                    // InternalHale.g:744:3: ( rule__Expression5__Group_1_1__0 )
                    // InternalHale.g:744:4: rule__Expression5__Group_1_1__0
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
                    // InternalHale.g:748:2: ( ( rule__Expression5__Group_1_2__0 ) )
                    {
                    // InternalHale.g:748:2: ( ( rule__Expression5__Group_1_2__0 ) )
                    // InternalHale.g:749:3: ( rule__Expression5__Group_1_2__0 )
                    {
                     before(grammarAccess.getExpression5Access().getGroup_1_2()); 
                    // InternalHale.g:750:3: ( rule__Expression5__Group_1_2__0 )
                    // InternalHale.g:750:4: rule__Expression5__Group_1_2__0
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
                    // InternalHale.g:754:2: ( ( rule__Expression5__Group_1_3__0 ) )
                    {
                    // InternalHale.g:754:2: ( ( rule__Expression5__Group_1_3__0 ) )
                    // InternalHale.g:755:3: ( rule__Expression5__Group_1_3__0 )
                    {
                     before(grammarAccess.getExpression5Access().getGroup_1_3()); 
                    // InternalHale.g:756:3: ( rule__Expression5__Group_1_3__0 )
                    // InternalHale.g:756:4: rule__Expression5__Group_1_3__0
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
    // InternalHale.g:764:1: rule__Expression4__Alternatives_1 : ( ( ( rule__Expression4__Group_1_0__0 ) ) | ( ( rule__Expression4__Group_1_1__0 ) ) );
    public final void rule__Expression4__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:768:1: ( ( ( rule__Expression4__Group_1_0__0 ) ) | ( ( rule__Expression4__Group_1_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            else if ( (LA7_0==22) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalHale.g:769:2: ( ( rule__Expression4__Group_1_0__0 ) )
                    {
                    // InternalHale.g:769:2: ( ( rule__Expression4__Group_1_0__0 ) )
                    // InternalHale.g:770:3: ( rule__Expression4__Group_1_0__0 )
                    {
                     before(grammarAccess.getExpression4Access().getGroup_1_0()); 
                    // InternalHale.g:771:3: ( rule__Expression4__Group_1_0__0 )
                    // InternalHale.g:771:4: rule__Expression4__Group_1_0__0
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
                    // InternalHale.g:775:2: ( ( rule__Expression4__Group_1_1__0 ) )
                    {
                    // InternalHale.g:775:2: ( ( rule__Expression4__Group_1_1__0 ) )
                    // InternalHale.g:776:3: ( rule__Expression4__Group_1_1__0 )
                    {
                     before(grammarAccess.getExpression4Access().getGroup_1_1()); 
                    // InternalHale.g:777:3: ( rule__Expression4__Group_1_1__0 )
                    // InternalHale.g:777:4: rule__Expression4__Group_1_1__0
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
    // InternalHale.g:785:1: rule__Expression3__Alternatives_1 : ( ( ( rule__Expression3__Group_1_0__0 ) ) | ( ( rule__Expression3__Group_1_1__0 ) ) | ( ( rule__Expression3__Group_1_2__0 ) ) );
    public final void rule__Expression3__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:789:1: ( ( ( rule__Expression3__Group_1_0__0 ) ) | ( ( rule__Expression3__Group_1_1__0 ) ) | ( ( rule__Expression3__Group_1_2__0 ) ) )
            int alt8=3;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalHale.g:790:2: ( ( rule__Expression3__Group_1_0__0 ) )
                    {
                    // InternalHale.g:790:2: ( ( rule__Expression3__Group_1_0__0 ) )
                    // InternalHale.g:791:3: ( rule__Expression3__Group_1_0__0 )
                    {
                     before(grammarAccess.getExpression3Access().getGroup_1_0()); 
                    // InternalHale.g:792:3: ( rule__Expression3__Group_1_0__0 )
                    // InternalHale.g:792:4: rule__Expression3__Group_1_0__0
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
                    // InternalHale.g:796:2: ( ( rule__Expression3__Group_1_1__0 ) )
                    {
                    // InternalHale.g:796:2: ( ( rule__Expression3__Group_1_1__0 ) )
                    // InternalHale.g:797:3: ( rule__Expression3__Group_1_1__0 )
                    {
                     before(grammarAccess.getExpression3Access().getGroup_1_1()); 
                    // InternalHale.g:798:3: ( rule__Expression3__Group_1_1__0 )
                    // InternalHale.g:798:4: rule__Expression3__Group_1_1__0
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
                    // InternalHale.g:802:2: ( ( rule__Expression3__Group_1_2__0 ) )
                    {
                    // InternalHale.g:802:2: ( ( rule__Expression3__Group_1_2__0 ) )
                    // InternalHale.g:803:3: ( rule__Expression3__Group_1_2__0 )
                    {
                     before(grammarAccess.getExpression3Access().getGroup_1_2()); 
                    // InternalHale.g:804:3: ( rule__Expression3__Group_1_2__0 )
                    // InternalHale.g:804:4: rule__Expression3__Group_1_2__0
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
    // InternalHale.g:812:1: rule__Expression1__Alternatives : ( ( ( rule__Expression1__Group_0__0 ) ) | ( ( rule__Expression1__Group_1__0 ) ) | ( rulePrimary ) );
    public final void rule__Expression1__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:816:1: ( ( ( rule__Expression1__Group_0__0 ) ) | ( ( rule__Expression1__Group_1__0 ) ) | ( rulePrimary ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt9=1;
                }
                break;
            case 27:
                {
                alt9=2;
                }
                break;
            case RULE_DOUBLE:
            case RULE_STRING:
            case RULE_ID:
            case 28:
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
                    // InternalHale.g:817:2: ( ( rule__Expression1__Group_0__0 ) )
                    {
                    // InternalHale.g:817:2: ( ( rule__Expression1__Group_0__0 ) )
                    // InternalHale.g:818:3: ( rule__Expression1__Group_0__0 )
                    {
                     before(grammarAccess.getExpression1Access().getGroup_0()); 
                    // InternalHale.g:819:3: ( rule__Expression1__Group_0__0 )
                    // InternalHale.g:819:4: rule__Expression1__Group_0__0
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
                    // InternalHale.g:823:2: ( ( rule__Expression1__Group_1__0 ) )
                    {
                    // InternalHale.g:823:2: ( ( rule__Expression1__Group_1__0 ) )
                    // InternalHale.g:824:3: ( rule__Expression1__Group_1__0 )
                    {
                     before(grammarAccess.getExpression1Access().getGroup_1()); 
                    // InternalHale.g:825:3: ( rule__Expression1__Group_1__0 )
                    // InternalHale.g:825:4: rule__Expression1__Group_1__0
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
                    // InternalHale.g:829:2: ( rulePrimary )
                    {
                    // InternalHale.g:829:2: ( rulePrimary )
                    // InternalHale.g:830:3: rulePrimary
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
    // InternalHale.g:839:1: rule__Primary__Alternatives : ( ( ruleLiteral ) | ( ruleBindingReference ) | ( ( rule__Primary__Group_2__0 ) ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:843:1: ( ( ruleLiteral ) | ( ruleBindingReference ) | ( ( rule__Primary__Group_2__0 ) ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case RULE_DOUBLE:
            case RULE_STRING:
                {
                alt10=1;
                }
                break;
            case RULE_ID:
                {
                alt10=2;
                }
                break;
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
                    // InternalHale.g:844:2: ( ruleLiteral )
                    {
                    // InternalHale.g:844:2: ( ruleLiteral )
                    // InternalHale.g:845:3: ruleLiteral
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
                    // InternalHale.g:850:2: ( ruleBindingReference )
                    {
                    // InternalHale.g:850:2: ( ruleBindingReference )
                    // InternalHale.g:851:3: ruleBindingReference
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
                    // InternalHale.g:856:2: ( ( rule__Primary__Group_2__0 ) )
                    {
                    // InternalHale.g:856:2: ( ( rule__Primary__Group_2__0 ) )
                    // InternalHale.g:857:3: ( rule__Primary__Group_2__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_2()); 
                    // InternalHale.g:858:3: ( rule__Primary__Group_2__0 )
                    // InternalHale.g:858:4: rule__Primary__Group_2__0
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
    // InternalHale.g:866:1: rule__Literal__Alternatives : ( ( ruleNumberLiteral ) | ( ruleStringLiteral ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:870:1: ( ( ruleNumberLiteral ) | ( ruleStringLiteral ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_DOUBLE) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_STRING) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalHale.g:871:2: ( ruleNumberLiteral )
                    {
                    // InternalHale.g:871:2: ( ruleNumberLiteral )
                    // InternalHale.g:872:3: ruleNumberLiteral
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
                    // InternalHale.g:877:2: ( ruleStringLiteral )
                    {
                    // InternalHale.g:877:2: ( ruleStringLiteral )
                    // InternalHale.g:878:3: ruleStringLiteral
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
    // InternalHale.g:887:1: rule__Hale__Group__0 : rule__Hale__Group__0__Impl rule__Hale__Group__1 ;
    public final void rule__Hale__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:891:1: ( rule__Hale__Group__0__Impl rule__Hale__Group__1 )
            // InternalHale.g:892:2: rule__Hale__Group__0__Impl rule__Hale__Group__1
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
    // InternalHale.g:899:1: rule__Hale__Group__0__Impl : ( () ) ;
    public final void rule__Hale__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:903:1: ( ( () ) )
            // InternalHale.g:904:1: ( () )
            {
            // InternalHale.g:904:1: ( () )
            // InternalHale.g:905:2: ()
            {
             before(grammarAccess.getHaleAccess().getHaleAction_0()); 
            // InternalHale.g:906:2: ()
            // InternalHale.g:906:3: 
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
    // InternalHale.g:914:1: rule__Hale__Group__1 : rule__Hale__Group__1__Impl ;
    public final void rule__Hale__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:918:1: ( rule__Hale__Group__1__Impl )
            // InternalHale.g:919:2: rule__Hale__Group__1__Impl
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
    // InternalHale.g:925:1: rule__Hale__Group__1__Impl : ( ( rule__Hale__BlockAssignment_1 ) ) ;
    public final void rule__Hale__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:929:1: ( ( ( rule__Hale__BlockAssignment_1 ) ) )
            // InternalHale.g:930:1: ( ( rule__Hale__BlockAssignment_1 ) )
            {
            // InternalHale.g:930:1: ( ( rule__Hale__BlockAssignment_1 ) )
            // InternalHale.g:931:2: ( rule__Hale__BlockAssignment_1 )
            {
             before(grammarAccess.getHaleAccess().getBlockAssignment_1()); 
            // InternalHale.g:932:2: ( rule__Hale__BlockAssignment_1 )
            // InternalHale.g:932:3: rule__Hale__BlockAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Hale__BlockAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHaleAccess().getBlockAssignment_1()); 

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


    // $ANTLR start "rule__Block__Group__0"
    // InternalHale.g:941:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:945:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // InternalHale.g:946:2: rule__Block__Group__0__Impl rule__Block__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Block__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Block__Group__1();

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
    // $ANTLR end "rule__Block__Group__0"


    // $ANTLR start "rule__Block__Group__0__Impl"
    // InternalHale.g:953:1: rule__Block__Group__0__Impl : ( () ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:957:1: ( ( () ) )
            // InternalHale.g:958:1: ( () )
            {
            // InternalHale.g:958:1: ( () )
            // InternalHale.g:959:2: ()
            {
             before(grammarAccess.getBlockAccess().getBlockAction_0()); 
            // InternalHale.g:960:2: ()
            // InternalHale.g:960:3: 
            {
            }

             after(grammarAccess.getBlockAccess().getBlockAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__0__Impl"


    // $ANTLR start "rule__Block__Group__1"
    // InternalHale.g:968:1: rule__Block__Group__1 : rule__Block__Group__1__Impl ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:972:1: ( rule__Block__Group__1__Impl )
            // InternalHale.g:973:2: rule__Block__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Block__Group__1__Impl();

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
    // $ANTLR end "rule__Block__Group__1"


    // $ANTLR start "rule__Block__Group__1__Impl"
    // InternalHale.g:979:1: rule__Block__Group__1__Impl : ( ( rule__Block__Alternatives_1 )* ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:983:1: ( ( ( rule__Block__Alternatives_1 )* ) )
            // InternalHale.g:984:1: ( ( rule__Block__Alternatives_1 )* )
            {
            // InternalHale.g:984:1: ( ( rule__Block__Alternatives_1 )* )
            // InternalHale.g:985:2: ( rule__Block__Alternatives_1 )*
            {
             before(grammarAccess.getBlockAccess().getAlternatives_1()); 
            // InternalHale.g:986:2: ( rule__Block__Alternatives_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_DOUBLE && LA12_0<=RULE_ID)||(LA12_0>=10 && LA12_0<=11)||LA12_0==22||(LA12_0>=27 && LA12_0<=28)||LA12_0==30||(LA12_0>=32 && LA12_0<=33)||LA12_0==36) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalHale.g:986:3: rule__Block__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Block__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getBlockAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__Block__Group__1__Impl"


    // $ANTLR start "rule__Statement__Group_3__0"
    // InternalHale.g:995:1: rule__Statement__Group_3__0 : rule__Statement__Group_3__0__Impl rule__Statement__Group_3__1 ;
    public final void rule__Statement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:999:1: ( rule__Statement__Group_3__0__Impl rule__Statement__Group_3__1 )
            // InternalHale.g:1000:2: rule__Statement__Group_3__0__Impl rule__Statement__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__Statement__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_3__1();

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
    // $ANTLR end "rule__Statement__Group_3__0"


    // $ANTLR start "rule__Statement__Group_3__0__Impl"
    // InternalHale.g:1007:1: rule__Statement__Group_3__0__Impl : ( ( rule__Statement__Alternatives_3_0 ) ) ;
    public final void rule__Statement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1011:1: ( ( ( rule__Statement__Alternatives_3_0 ) ) )
            // InternalHale.g:1012:1: ( ( rule__Statement__Alternatives_3_0 ) )
            {
            // InternalHale.g:1012:1: ( ( rule__Statement__Alternatives_3_0 ) )
            // InternalHale.g:1013:2: ( rule__Statement__Alternatives_3_0 )
            {
             before(grammarAccess.getStatementAccess().getAlternatives_3_0()); 
            // InternalHale.g:1014:2: ( rule__Statement__Alternatives_3_0 )
            // InternalHale.g:1014:3: rule__Statement__Alternatives_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives_3_0()); 

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
    // $ANTLR end "rule__Statement__Group_3__0__Impl"


    // $ANTLR start "rule__Statement__Group_3__1"
    // InternalHale.g:1022:1: rule__Statement__Group_3__1 : rule__Statement__Group_3__1__Impl ;
    public final void rule__Statement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1026:1: ( rule__Statement__Group_3__1__Impl )
            // InternalHale.g:1027:2: rule__Statement__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group_3__1__Impl();

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
    // $ANTLR end "rule__Statement__Group_3__1"


    // $ANTLR start "rule__Statement__Group_3__1__Impl"
    // InternalHale.g:1033:1: rule__Statement__Group_3__1__Impl : ( ';' ) ;
    public final void rule__Statement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1037:1: ( ( ';' ) )
            // InternalHale.g:1038:1: ( ';' )
            {
            // InternalHale.g:1038:1: ( ';' )
            // InternalHale.g:1039:2: ';'
            {
             before(grammarAccess.getStatementAccess().getSemicolonKeyword_3_1()); 
            match(input,10,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getSemicolonKeyword_3_1()); 

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
    // $ANTLR end "rule__Statement__Group_3__1__Impl"


    // $ANTLR start "rule__BracedBlock__Group__0"
    // InternalHale.g:1049:1: rule__BracedBlock__Group__0 : rule__BracedBlock__Group__0__Impl rule__BracedBlock__Group__1 ;
    public final void rule__BracedBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1053:1: ( rule__BracedBlock__Group__0__Impl rule__BracedBlock__Group__1 )
            // InternalHale.g:1054:2: rule__BracedBlock__Group__0__Impl rule__BracedBlock__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__BracedBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BracedBlock__Group__1();

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
    // $ANTLR end "rule__BracedBlock__Group__0"


    // $ANTLR start "rule__BracedBlock__Group__0__Impl"
    // InternalHale.g:1061:1: rule__BracedBlock__Group__0__Impl : ( '{' ) ;
    public final void rule__BracedBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1065:1: ( ( '{' ) )
            // InternalHale.g:1066:1: ( '{' )
            {
            // InternalHale.g:1066:1: ( '{' )
            // InternalHale.g:1067:2: '{'
            {
             before(grammarAccess.getBracedBlockAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getBracedBlockAccess().getLeftCurlyBracketKeyword_0()); 

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
    // $ANTLR end "rule__BracedBlock__Group__0__Impl"


    // $ANTLR start "rule__BracedBlock__Group__1"
    // InternalHale.g:1076:1: rule__BracedBlock__Group__1 : rule__BracedBlock__Group__1__Impl rule__BracedBlock__Group__2 ;
    public final void rule__BracedBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1080:1: ( rule__BracedBlock__Group__1__Impl rule__BracedBlock__Group__2 )
            // InternalHale.g:1081:2: rule__BracedBlock__Group__1__Impl rule__BracedBlock__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__BracedBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BracedBlock__Group__2();

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
    // $ANTLR end "rule__BracedBlock__Group__1"


    // $ANTLR start "rule__BracedBlock__Group__1__Impl"
    // InternalHale.g:1088:1: rule__BracedBlock__Group__1__Impl : ( ruleBlock ) ;
    public final void rule__BracedBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1092:1: ( ( ruleBlock ) )
            // InternalHale.g:1093:1: ( ruleBlock )
            {
            // InternalHale.g:1093:1: ( ruleBlock )
            // InternalHale.g:1094:2: ruleBlock
            {
             before(grammarAccess.getBracedBlockAccess().getBlockParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getBracedBlockAccess().getBlockParserRuleCall_1()); 

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
    // $ANTLR end "rule__BracedBlock__Group__1__Impl"


    // $ANTLR start "rule__BracedBlock__Group__2"
    // InternalHale.g:1103:1: rule__BracedBlock__Group__2 : rule__BracedBlock__Group__2__Impl ;
    public final void rule__BracedBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1107:1: ( rule__BracedBlock__Group__2__Impl )
            // InternalHale.g:1108:2: rule__BracedBlock__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BracedBlock__Group__2__Impl();

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
    // $ANTLR end "rule__BracedBlock__Group__2"


    // $ANTLR start "rule__BracedBlock__Group__2__Impl"
    // InternalHale.g:1114:1: rule__BracedBlock__Group__2__Impl : ( '}' ) ;
    public final void rule__BracedBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1118:1: ( ( '}' ) )
            // InternalHale.g:1119:1: ( '}' )
            {
            // InternalHale.g:1119:1: ( '}' )
            // InternalHale.g:1120:2: '}'
            {
             before(grammarAccess.getBracedBlockAccess().getRightCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getBracedBlockAccess().getRightCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__BracedBlock__Group__2__Impl"


    // $ANTLR start "rule__Expression7__Group__0"
    // InternalHale.g:1130:1: rule__Expression7__Group__0 : rule__Expression7__Group__0__Impl rule__Expression7__Group__1 ;
    public final void rule__Expression7__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1134:1: ( rule__Expression7__Group__0__Impl rule__Expression7__Group__1 )
            // InternalHale.g:1135:2: rule__Expression7__Group__0__Impl rule__Expression7__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalHale.g:1142:1: rule__Expression7__Group__0__Impl : ( ruleExpression6 ) ;
    public final void rule__Expression7__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1146:1: ( ( ruleExpression6 ) )
            // InternalHale.g:1147:1: ( ruleExpression6 )
            {
            // InternalHale.g:1147:1: ( ruleExpression6 )
            // InternalHale.g:1148:2: ruleExpression6
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
    // InternalHale.g:1157:1: rule__Expression7__Group__1 : rule__Expression7__Group__1__Impl ;
    public final void rule__Expression7__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1161:1: ( rule__Expression7__Group__1__Impl )
            // InternalHale.g:1162:2: rule__Expression7__Group__1__Impl
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
    // InternalHale.g:1168:1: rule__Expression7__Group__1__Impl : ( ( rule__Expression7__Alternatives_1 )* ) ;
    public final void rule__Expression7__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1172:1: ( ( ( rule__Expression7__Alternatives_1 )* ) )
            // InternalHale.g:1173:1: ( ( rule__Expression7__Alternatives_1 )* )
            {
            // InternalHale.g:1173:1: ( ( rule__Expression7__Alternatives_1 )* )
            // InternalHale.g:1174:2: ( rule__Expression7__Alternatives_1 )*
            {
             before(grammarAccess.getExpression7Access().getAlternatives_1()); 
            // InternalHale.g:1175:2: ( rule__Expression7__Alternatives_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=13 && LA13_0<=14)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalHale.g:1175:3: rule__Expression7__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Expression7__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalHale.g:1184:1: rule__Expression7__Group_1_0__0 : rule__Expression7__Group_1_0__0__Impl rule__Expression7__Group_1_0__1 ;
    public final void rule__Expression7__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1188:1: ( rule__Expression7__Group_1_0__0__Impl rule__Expression7__Group_1_0__1 )
            // InternalHale.g:1189:2: rule__Expression7__Group_1_0__0__Impl rule__Expression7__Group_1_0__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalHale.g:1196:1: rule__Expression7__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Expression7__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1200:1: ( ( () ) )
            // InternalHale.g:1201:1: ( () )
            {
            // InternalHale.g:1201:1: ( () )
            // InternalHale.g:1202:2: ()
            {
             before(grammarAccess.getExpression7Access().getLogicalAndLeftAction_1_0_0()); 
            // InternalHale.g:1203:2: ()
            // InternalHale.g:1203:3: 
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
    // InternalHale.g:1211:1: rule__Expression7__Group_1_0__1 : rule__Expression7__Group_1_0__1__Impl rule__Expression7__Group_1_0__2 ;
    public final void rule__Expression7__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1215:1: ( rule__Expression7__Group_1_0__1__Impl rule__Expression7__Group_1_0__2 )
            // InternalHale.g:1216:2: rule__Expression7__Group_1_0__1__Impl rule__Expression7__Group_1_0__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalHale.g:1223:1: rule__Expression7__Group_1_0__1__Impl : ( 'and' ) ;
    public final void rule__Expression7__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1227:1: ( ( 'and' ) )
            // InternalHale.g:1228:1: ( 'and' )
            {
            // InternalHale.g:1228:1: ( 'and' )
            // InternalHale.g:1229:2: 'and'
            {
             before(grammarAccess.getExpression7Access().getAndKeyword_1_0_1()); 
            match(input,13,FOLLOW_2); 
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
    // InternalHale.g:1238:1: rule__Expression7__Group_1_0__2 : rule__Expression7__Group_1_0__2__Impl ;
    public final void rule__Expression7__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1242:1: ( rule__Expression7__Group_1_0__2__Impl )
            // InternalHale.g:1243:2: rule__Expression7__Group_1_0__2__Impl
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
    // InternalHale.g:1249:1: rule__Expression7__Group_1_0__2__Impl : ( ( rule__Expression7__RightAssignment_1_0_2 ) ) ;
    public final void rule__Expression7__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1253:1: ( ( ( rule__Expression7__RightAssignment_1_0_2 ) ) )
            // InternalHale.g:1254:1: ( ( rule__Expression7__RightAssignment_1_0_2 ) )
            {
            // InternalHale.g:1254:1: ( ( rule__Expression7__RightAssignment_1_0_2 ) )
            // InternalHale.g:1255:2: ( rule__Expression7__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getExpression7Access().getRightAssignment_1_0_2()); 
            // InternalHale.g:1256:2: ( rule__Expression7__RightAssignment_1_0_2 )
            // InternalHale.g:1256:3: rule__Expression7__RightAssignment_1_0_2
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
    // InternalHale.g:1265:1: rule__Expression7__Group_1_1__0 : rule__Expression7__Group_1_1__0__Impl rule__Expression7__Group_1_1__1 ;
    public final void rule__Expression7__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1269:1: ( rule__Expression7__Group_1_1__0__Impl rule__Expression7__Group_1_1__1 )
            // InternalHale.g:1270:2: rule__Expression7__Group_1_1__0__Impl rule__Expression7__Group_1_1__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalHale.g:1277:1: rule__Expression7__Group_1_1__0__Impl : ( () ) ;
    public final void rule__Expression7__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1281:1: ( ( () ) )
            // InternalHale.g:1282:1: ( () )
            {
            // InternalHale.g:1282:1: ( () )
            // InternalHale.g:1283:2: ()
            {
             before(grammarAccess.getExpression7Access().getLogicalOrLeftAction_1_1_0()); 
            // InternalHale.g:1284:2: ()
            // InternalHale.g:1284:3: 
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
    // InternalHale.g:1292:1: rule__Expression7__Group_1_1__1 : rule__Expression7__Group_1_1__1__Impl rule__Expression7__Group_1_1__2 ;
    public final void rule__Expression7__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1296:1: ( rule__Expression7__Group_1_1__1__Impl rule__Expression7__Group_1_1__2 )
            // InternalHale.g:1297:2: rule__Expression7__Group_1_1__1__Impl rule__Expression7__Group_1_1__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalHale.g:1304:1: rule__Expression7__Group_1_1__1__Impl : ( 'or' ) ;
    public final void rule__Expression7__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1308:1: ( ( 'or' ) )
            // InternalHale.g:1309:1: ( 'or' )
            {
            // InternalHale.g:1309:1: ( 'or' )
            // InternalHale.g:1310:2: 'or'
            {
             before(grammarAccess.getExpression7Access().getOrKeyword_1_1_1()); 
            match(input,14,FOLLOW_2); 
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
    // InternalHale.g:1319:1: rule__Expression7__Group_1_1__2 : rule__Expression7__Group_1_1__2__Impl ;
    public final void rule__Expression7__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1323:1: ( rule__Expression7__Group_1_1__2__Impl )
            // InternalHale.g:1324:2: rule__Expression7__Group_1_1__2__Impl
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
    // InternalHale.g:1330:1: rule__Expression7__Group_1_1__2__Impl : ( ( rule__Expression7__RightAssignment_1_1_2 ) ) ;
    public final void rule__Expression7__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1334:1: ( ( ( rule__Expression7__RightAssignment_1_1_2 ) ) )
            // InternalHale.g:1335:1: ( ( rule__Expression7__RightAssignment_1_1_2 ) )
            {
            // InternalHale.g:1335:1: ( ( rule__Expression7__RightAssignment_1_1_2 ) )
            // InternalHale.g:1336:2: ( rule__Expression7__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getExpression7Access().getRightAssignment_1_1_2()); 
            // InternalHale.g:1337:2: ( rule__Expression7__RightAssignment_1_1_2 )
            // InternalHale.g:1337:3: rule__Expression7__RightAssignment_1_1_2
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
    // InternalHale.g:1346:1: rule__Expression6__Group__0 : rule__Expression6__Group__0__Impl rule__Expression6__Group__1 ;
    public final void rule__Expression6__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1350:1: ( rule__Expression6__Group__0__Impl rule__Expression6__Group__1 )
            // InternalHale.g:1351:2: rule__Expression6__Group__0__Impl rule__Expression6__Group__1
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
    // InternalHale.g:1358:1: rule__Expression6__Group__0__Impl : ( ruleExpression5 ) ;
    public final void rule__Expression6__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1362:1: ( ( ruleExpression5 ) )
            // InternalHale.g:1363:1: ( ruleExpression5 )
            {
            // InternalHale.g:1363:1: ( ruleExpression5 )
            // InternalHale.g:1364:2: ruleExpression5
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
    // InternalHale.g:1373:1: rule__Expression6__Group__1 : rule__Expression6__Group__1__Impl ;
    public final void rule__Expression6__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1377:1: ( rule__Expression6__Group__1__Impl )
            // InternalHale.g:1378:2: rule__Expression6__Group__1__Impl
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
    // InternalHale.g:1384:1: rule__Expression6__Group__1__Impl : ( ( rule__Expression6__Alternatives_1 )* ) ;
    public final void rule__Expression6__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1388:1: ( ( ( rule__Expression6__Alternatives_1 )* ) )
            // InternalHale.g:1389:1: ( ( rule__Expression6__Alternatives_1 )* )
            {
            // InternalHale.g:1389:1: ( ( rule__Expression6__Alternatives_1 )* )
            // InternalHale.g:1390:2: ( rule__Expression6__Alternatives_1 )*
            {
             before(grammarAccess.getExpression6Access().getAlternatives_1()); 
            // InternalHale.g:1391:2: ( rule__Expression6__Alternatives_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=15 && LA14_0<=16)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalHale.g:1391:3: rule__Expression6__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Expression6__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalHale.g:1400:1: rule__Expression6__Group_1_0__0 : rule__Expression6__Group_1_0__0__Impl rule__Expression6__Group_1_0__1 ;
    public final void rule__Expression6__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1404:1: ( rule__Expression6__Group_1_0__0__Impl rule__Expression6__Group_1_0__1 )
            // InternalHale.g:1405:2: rule__Expression6__Group_1_0__0__Impl rule__Expression6__Group_1_0__1
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
    // InternalHale.g:1412:1: rule__Expression6__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Expression6__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1416:1: ( ( () ) )
            // InternalHale.g:1417:1: ( () )
            {
            // InternalHale.g:1417:1: ( () )
            // InternalHale.g:1418:2: ()
            {
             before(grammarAccess.getExpression6Access().getEqualityLeftAction_1_0_0()); 
            // InternalHale.g:1419:2: ()
            // InternalHale.g:1419:3: 
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
    // InternalHale.g:1427:1: rule__Expression6__Group_1_0__1 : rule__Expression6__Group_1_0__1__Impl rule__Expression6__Group_1_0__2 ;
    public final void rule__Expression6__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1431:1: ( rule__Expression6__Group_1_0__1__Impl rule__Expression6__Group_1_0__2 )
            // InternalHale.g:1432:2: rule__Expression6__Group_1_0__1__Impl rule__Expression6__Group_1_0__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalHale.g:1439:1: rule__Expression6__Group_1_0__1__Impl : ( '==' ) ;
    public final void rule__Expression6__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1443:1: ( ( '==' ) )
            // InternalHale.g:1444:1: ( '==' )
            {
            // InternalHale.g:1444:1: ( '==' )
            // InternalHale.g:1445:2: '=='
            {
             before(grammarAccess.getExpression6Access().getEqualsSignEqualsSignKeyword_1_0_1()); 
            match(input,15,FOLLOW_2); 
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
    // InternalHale.g:1454:1: rule__Expression6__Group_1_0__2 : rule__Expression6__Group_1_0__2__Impl ;
    public final void rule__Expression6__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1458:1: ( rule__Expression6__Group_1_0__2__Impl )
            // InternalHale.g:1459:2: rule__Expression6__Group_1_0__2__Impl
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
    // InternalHale.g:1465:1: rule__Expression6__Group_1_0__2__Impl : ( ( rule__Expression6__RightAssignment_1_0_2 ) ) ;
    public final void rule__Expression6__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1469:1: ( ( ( rule__Expression6__RightAssignment_1_0_2 ) ) )
            // InternalHale.g:1470:1: ( ( rule__Expression6__RightAssignment_1_0_2 ) )
            {
            // InternalHale.g:1470:1: ( ( rule__Expression6__RightAssignment_1_0_2 ) )
            // InternalHale.g:1471:2: ( rule__Expression6__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getExpression6Access().getRightAssignment_1_0_2()); 
            // InternalHale.g:1472:2: ( rule__Expression6__RightAssignment_1_0_2 )
            // InternalHale.g:1472:3: rule__Expression6__RightAssignment_1_0_2
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
    // InternalHale.g:1481:1: rule__Expression6__Group_1_1__0 : rule__Expression6__Group_1_1__0__Impl rule__Expression6__Group_1_1__1 ;
    public final void rule__Expression6__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1485:1: ( rule__Expression6__Group_1_1__0__Impl rule__Expression6__Group_1_1__1 )
            // InternalHale.g:1486:2: rule__Expression6__Group_1_1__0__Impl rule__Expression6__Group_1_1__1
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
    // InternalHale.g:1493:1: rule__Expression6__Group_1_1__0__Impl : ( () ) ;
    public final void rule__Expression6__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1497:1: ( ( () ) )
            // InternalHale.g:1498:1: ( () )
            {
            // InternalHale.g:1498:1: ( () )
            // InternalHale.g:1499:2: ()
            {
             before(grammarAccess.getExpression6Access().getInequalityLeftAction_1_1_0()); 
            // InternalHale.g:1500:2: ()
            // InternalHale.g:1500:3: 
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
    // InternalHale.g:1508:1: rule__Expression6__Group_1_1__1 : rule__Expression6__Group_1_1__1__Impl rule__Expression6__Group_1_1__2 ;
    public final void rule__Expression6__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1512:1: ( rule__Expression6__Group_1_1__1__Impl rule__Expression6__Group_1_1__2 )
            // InternalHale.g:1513:2: rule__Expression6__Group_1_1__1__Impl rule__Expression6__Group_1_1__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalHale.g:1520:1: rule__Expression6__Group_1_1__1__Impl : ( '!=' ) ;
    public final void rule__Expression6__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1524:1: ( ( '!=' ) )
            // InternalHale.g:1525:1: ( '!=' )
            {
            // InternalHale.g:1525:1: ( '!=' )
            // InternalHale.g:1526:2: '!='
            {
             before(grammarAccess.getExpression6Access().getExclamationMarkEqualsSignKeyword_1_1_1()); 
            match(input,16,FOLLOW_2); 
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
    // InternalHale.g:1535:1: rule__Expression6__Group_1_1__2 : rule__Expression6__Group_1_1__2__Impl ;
    public final void rule__Expression6__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1539:1: ( rule__Expression6__Group_1_1__2__Impl )
            // InternalHale.g:1540:2: rule__Expression6__Group_1_1__2__Impl
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
    // InternalHale.g:1546:1: rule__Expression6__Group_1_1__2__Impl : ( ( rule__Expression6__RightAssignment_1_1_2 ) ) ;
    public final void rule__Expression6__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1550:1: ( ( ( rule__Expression6__RightAssignment_1_1_2 ) ) )
            // InternalHale.g:1551:1: ( ( rule__Expression6__RightAssignment_1_1_2 ) )
            {
            // InternalHale.g:1551:1: ( ( rule__Expression6__RightAssignment_1_1_2 ) )
            // InternalHale.g:1552:2: ( rule__Expression6__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getExpression6Access().getRightAssignment_1_1_2()); 
            // InternalHale.g:1553:2: ( rule__Expression6__RightAssignment_1_1_2 )
            // InternalHale.g:1553:3: rule__Expression6__RightAssignment_1_1_2
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
    // InternalHale.g:1562:1: rule__Expression5__Group__0 : rule__Expression5__Group__0__Impl rule__Expression5__Group__1 ;
    public final void rule__Expression5__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1566:1: ( rule__Expression5__Group__0__Impl rule__Expression5__Group__1 )
            // InternalHale.g:1567:2: rule__Expression5__Group__0__Impl rule__Expression5__Group__1
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
    // InternalHale.g:1574:1: rule__Expression5__Group__0__Impl : ( ruleExpression4 ) ;
    public final void rule__Expression5__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1578:1: ( ( ruleExpression4 ) )
            // InternalHale.g:1579:1: ( ruleExpression4 )
            {
            // InternalHale.g:1579:1: ( ruleExpression4 )
            // InternalHale.g:1580:2: ruleExpression4
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
    // InternalHale.g:1589:1: rule__Expression5__Group__1 : rule__Expression5__Group__1__Impl ;
    public final void rule__Expression5__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1593:1: ( rule__Expression5__Group__1__Impl )
            // InternalHale.g:1594:2: rule__Expression5__Group__1__Impl
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
    // InternalHale.g:1600:1: rule__Expression5__Group__1__Impl : ( ( rule__Expression5__Alternatives_1 )* ) ;
    public final void rule__Expression5__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1604:1: ( ( ( rule__Expression5__Alternatives_1 )* ) )
            // InternalHale.g:1605:1: ( ( rule__Expression5__Alternatives_1 )* )
            {
            // InternalHale.g:1605:1: ( ( rule__Expression5__Alternatives_1 )* )
            // InternalHale.g:1606:2: ( rule__Expression5__Alternatives_1 )*
            {
             before(grammarAccess.getExpression5Access().getAlternatives_1()); 
            // InternalHale.g:1607:2: ( rule__Expression5__Alternatives_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=17 && LA15_0<=20)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalHale.g:1607:3: rule__Expression5__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Expression5__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalHale.g:1616:1: rule__Expression5__Group_1_0__0 : rule__Expression5__Group_1_0__0__Impl rule__Expression5__Group_1_0__1 ;
    public final void rule__Expression5__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1620:1: ( rule__Expression5__Group_1_0__0__Impl rule__Expression5__Group_1_0__1 )
            // InternalHale.g:1621:2: rule__Expression5__Group_1_0__0__Impl rule__Expression5__Group_1_0__1
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
    // InternalHale.g:1628:1: rule__Expression5__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Expression5__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1632:1: ( ( () ) )
            // InternalHale.g:1633:1: ( () )
            {
            // InternalHale.g:1633:1: ( () )
            // InternalHale.g:1634:2: ()
            {
             before(grammarAccess.getExpression5Access().getLessThanOrEqualLeftAction_1_0_0()); 
            // InternalHale.g:1635:2: ()
            // InternalHale.g:1635:3: 
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
    // InternalHale.g:1643:1: rule__Expression5__Group_1_0__1 : rule__Expression5__Group_1_0__1__Impl rule__Expression5__Group_1_0__2 ;
    public final void rule__Expression5__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1647:1: ( rule__Expression5__Group_1_0__1__Impl rule__Expression5__Group_1_0__2 )
            // InternalHale.g:1648:2: rule__Expression5__Group_1_0__1__Impl rule__Expression5__Group_1_0__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalHale.g:1655:1: rule__Expression5__Group_1_0__1__Impl : ( '<=' ) ;
    public final void rule__Expression5__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1659:1: ( ( '<=' ) )
            // InternalHale.g:1660:1: ( '<=' )
            {
            // InternalHale.g:1660:1: ( '<=' )
            // InternalHale.g:1661:2: '<='
            {
             before(grammarAccess.getExpression5Access().getLessThanSignEqualsSignKeyword_1_0_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalHale.g:1670:1: rule__Expression5__Group_1_0__2 : rule__Expression5__Group_1_0__2__Impl ;
    public final void rule__Expression5__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1674:1: ( rule__Expression5__Group_1_0__2__Impl )
            // InternalHale.g:1675:2: rule__Expression5__Group_1_0__2__Impl
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
    // InternalHale.g:1681:1: rule__Expression5__Group_1_0__2__Impl : ( ( rule__Expression5__RightAssignment_1_0_2 ) ) ;
    public final void rule__Expression5__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1685:1: ( ( ( rule__Expression5__RightAssignment_1_0_2 ) ) )
            // InternalHale.g:1686:1: ( ( rule__Expression5__RightAssignment_1_0_2 ) )
            {
            // InternalHale.g:1686:1: ( ( rule__Expression5__RightAssignment_1_0_2 ) )
            // InternalHale.g:1687:2: ( rule__Expression5__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getExpression5Access().getRightAssignment_1_0_2()); 
            // InternalHale.g:1688:2: ( rule__Expression5__RightAssignment_1_0_2 )
            // InternalHale.g:1688:3: rule__Expression5__RightAssignment_1_0_2
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
    // InternalHale.g:1697:1: rule__Expression5__Group_1_1__0 : rule__Expression5__Group_1_1__0__Impl rule__Expression5__Group_1_1__1 ;
    public final void rule__Expression5__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1701:1: ( rule__Expression5__Group_1_1__0__Impl rule__Expression5__Group_1_1__1 )
            // InternalHale.g:1702:2: rule__Expression5__Group_1_1__0__Impl rule__Expression5__Group_1_1__1
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
    // InternalHale.g:1709:1: rule__Expression5__Group_1_1__0__Impl : ( () ) ;
    public final void rule__Expression5__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1713:1: ( ( () ) )
            // InternalHale.g:1714:1: ( () )
            {
            // InternalHale.g:1714:1: ( () )
            // InternalHale.g:1715:2: ()
            {
             before(grammarAccess.getExpression5Access().getLessThanLeftAction_1_1_0()); 
            // InternalHale.g:1716:2: ()
            // InternalHale.g:1716:3: 
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
    // InternalHale.g:1724:1: rule__Expression5__Group_1_1__1 : rule__Expression5__Group_1_1__1__Impl rule__Expression5__Group_1_1__2 ;
    public final void rule__Expression5__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1728:1: ( rule__Expression5__Group_1_1__1__Impl rule__Expression5__Group_1_1__2 )
            // InternalHale.g:1729:2: rule__Expression5__Group_1_1__1__Impl rule__Expression5__Group_1_1__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalHale.g:1736:1: rule__Expression5__Group_1_1__1__Impl : ( '<' ) ;
    public final void rule__Expression5__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1740:1: ( ( '<' ) )
            // InternalHale.g:1741:1: ( '<' )
            {
            // InternalHale.g:1741:1: ( '<' )
            // InternalHale.g:1742:2: '<'
            {
             before(grammarAccess.getExpression5Access().getLessThanSignKeyword_1_1_1()); 
            match(input,18,FOLLOW_2); 
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
    // InternalHale.g:1751:1: rule__Expression5__Group_1_1__2 : rule__Expression5__Group_1_1__2__Impl ;
    public final void rule__Expression5__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1755:1: ( rule__Expression5__Group_1_1__2__Impl )
            // InternalHale.g:1756:2: rule__Expression5__Group_1_1__2__Impl
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
    // InternalHale.g:1762:1: rule__Expression5__Group_1_1__2__Impl : ( ( rule__Expression5__RightAssignment_1_1_2 ) ) ;
    public final void rule__Expression5__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1766:1: ( ( ( rule__Expression5__RightAssignment_1_1_2 ) ) )
            // InternalHale.g:1767:1: ( ( rule__Expression5__RightAssignment_1_1_2 ) )
            {
            // InternalHale.g:1767:1: ( ( rule__Expression5__RightAssignment_1_1_2 ) )
            // InternalHale.g:1768:2: ( rule__Expression5__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getExpression5Access().getRightAssignment_1_1_2()); 
            // InternalHale.g:1769:2: ( rule__Expression5__RightAssignment_1_1_2 )
            // InternalHale.g:1769:3: rule__Expression5__RightAssignment_1_1_2
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
    // InternalHale.g:1778:1: rule__Expression5__Group_1_2__0 : rule__Expression5__Group_1_2__0__Impl rule__Expression5__Group_1_2__1 ;
    public final void rule__Expression5__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1782:1: ( rule__Expression5__Group_1_2__0__Impl rule__Expression5__Group_1_2__1 )
            // InternalHale.g:1783:2: rule__Expression5__Group_1_2__0__Impl rule__Expression5__Group_1_2__1
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
    // InternalHale.g:1790:1: rule__Expression5__Group_1_2__0__Impl : ( () ) ;
    public final void rule__Expression5__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1794:1: ( ( () ) )
            // InternalHale.g:1795:1: ( () )
            {
            // InternalHale.g:1795:1: ( () )
            // InternalHale.g:1796:2: ()
            {
             before(grammarAccess.getExpression5Access().getGreaterThanOrEqualLeftAction_1_2_0()); 
            // InternalHale.g:1797:2: ()
            // InternalHale.g:1797:3: 
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
    // InternalHale.g:1805:1: rule__Expression5__Group_1_2__1 : rule__Expression5__Group_1_2__1__Impl rule__Expression5__Group_1_2__2 ;
    public final void rule__Expression5__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1809:1: ( rule__Expression5__Group_1_2__1__Impl rule__Expression5__Group_1_2__2 )
            // InternalHale.g:1810:2: rule__Expression5__Group_1_2__1__Impl rule__Expression5__Group_1_2__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalHale.g:1817:1: rule__Expression5__Group_1_2__1__Impl : ( '>=' ) ;
    public final void rule__Expression5__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1821:1: ( ( '>=' ) )
            // InternalHale.g:1822:1: ( '>=' )
            {
            // InternalHale.g:1822:1: ( '>=' )
            // InternalHale.g:1823:2: '>='
            {
             before(grammarAccess.getExpression5Access().getGreaterThanSignEqualsSignKeyword_1_2_1()); 
            match(input,19,FOLLOW_2); 
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
    // InternalHale.g:1832:1: rule__Expression5__Group_1_2__2 : rule__Expression5__Group_1_2__2__Impl ;
    public final void rule__Expression5__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1836:1: ( rule__Expression5__Group_1_2__2__Impl )
            // InternalHale.g:1837:2: rule__Expression5__Group_1_2__2__Impl
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
    // InternalHale.g:1843:1: rule__Expression5__Group_1_2__2__Impl : ( ( rule__Expression5__RightAssignment_1_2_2 ) ) ;
    public final void rule__Expression5__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1847:1: ( ( ( rule__Expression5__RightAssignment_1_2_2 ) ) )
            // InternalHale.g:1848:1: ( ( rule__Expression5__RightAssignment_1_2_2 ) )
            {
            // InternalHale.g:1848:1: ( ( rule__Expression5__RightAssignment_1_2_2 ) )
            // InternalHale.g:1849:2: ( rule__Expression5__RightAssignment_1_2_2 )
            {
             before(grammarAccess.getExpression5Access().getRightAssignment_1_2_2()); 
            // InternalHale.g:1850:2: ( rule__Expression5__RightAssignment_1_2_2 )
            // InternalHale.g:1850:3: rule__Expression5__RightAssignment_1_2_2
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
    // InternalHale.g:1859:1: rule__Expression5__Group_1_3__0 : rule__Expression5__Group_1_3__0__Impl rule__Expression5__Group_1_3__1 ;
    public final void rule__Expression5__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1863:1: ( rule__Expression5__Group_1_3__0__Impl rule__Expression5__Group_1_3__1 )
            // InternalHale.g:1864:2: rule__Expression5__Group_1_3__0__Impl rule__Expression5__Group_1_3__1
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
    // InternalHale.g:1871:1: rule__Expression5__Group_1_3__0__Impl : ( () ) ;
    public final void rule__Expression5__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1875:1: ( ( () ) )
            // InternalHale.g:1876:1: ( () )
            {
            // InternalHale.g:1876:1: ( () )
            // InternalHale.g:1877:2: ()
            {
             before(grammarAccess.getExpression5Access().getGreaterThanLeftAction_1_3_0()); 
            // InternalHale.g:1878:2: ()
            // InternalHale.g:1878:3: 
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
    // InternalHale.g:1886:1: rule__Expression5__Group_1_3__1 : rule__Expression5__Group_1_3__1__Impl rule__Expression5__Group_1_3__2 ;
    public final void rule__Expression5__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1890:1: ( rule__Expression5__Group_1_3__1__Impl rule__Expression5__Group_1_3__2 )
            // InternalHale.g:1891:2: rule__Expression5__Group_1_3__1__Impl rule__Expression5__Group_1_3__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalHale.g:1898:1: rule__Expression5__Group_1_3__1__Impl : ( '>' ) ;
    public final void rule__Expression5__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1902:1: ( ( '>' ) )
            // InternalHale.g:1903:1: ( '>' )
            {
            // InternalHale.g:1903:1: ( '>' )
            // InternalHale.g:1904:2: '>'
            {
             before(grammarAccess.getExpression5Access().getGreaterThanSignKeyword_1_3_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalHale.g:1913:1: rule__Expression5__Group_1_3__2 : rule__Expression5__Group_1_3__2__Impl ;
    public final void rule__Expression5__Group_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1917:1: ( rule__Expression5__Group_1_3__2__Impl )
            // InternalHale.g:1918:2: rule__Expression5__Group_1_3__2__Impl
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
    // InternalHale.g:1924:1: rule__Expression5__Group_1_3__2__Impl : ( ( rule__Expression5__RightAssignment_1_3_2 ) ) ;
    public final void rule__Expression5__Group_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1928:1: ( ( ( rule__Expression5__RightAssignment_1_3_2 ) ) )
            // InternalHale.g:1929:1: ( ( rule__Expression5__RightAssignment_1_3_2 ) )
            {
            // InternalHale.g:1929:1: ( ( rule__Expression5__RightAssignment_1_3_2 ) )
            // InternalHale.g:1930:2: ( rule__Expression5__RightAssignment_1_3_2 )
            {
             before(grammarAccess.getExpression5Access().getRightAssignment_1_3_2()); 
            // InternalHale.g:1931:2: ( rule__Expression5__RightAssignment_1_3_2 )
            // InternalHale.g:1931:3: rule__Expression5__RightAssignment_1_3_2
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
    // InternalHale.g:1940:1: rule__Expression4__Group__0 : rule__Expression4__Group__0__Impl rule__Expression4__Group__1 ;
    public final void rule__Expression4__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1944:1: ( rule__Expression4__Group__0__Impl rule__Expression4__Group__1 )
            // InternalHale.g:1945:2: rule__Expression4__Group__0__Impl rule__Expression4__Group__1
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
    // InternalHale.g:1952:1: rule__Expression4__Group__0__Impl : ( ruleExpression3 ) ;
    public final void rule__Expression4__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1956:1: ( ( ruleExpression3 ) )
            // InternalHale.g:1957:1: ( ruleExpression3 )
            {
            // InternalHale.g:1957:1: ( ruleExpression3 )
            // InternalHale.g:1958:2: ruleExpression3
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
    // InternalHale.g:1967:1: rule__Expression4__Group__1 : rule__Expression4__Group__1__Impl ;
    public final void rule__Expression4__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1971:1: ( rule__Expression4__Group__1__Impl )
            // InternalHale.g:1972:2: rule__Expression4__Group__1__Impl
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
    // InternalHale.g:1978:1: rule__Expression4__Group__1__Impl : ( ( rule__Expression4__Alternatives_1 )* ) ;
    public final void rule__Expression4__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1982:1: ( ( ( rule__Expression4__Alternatives_1 )* ) )
            // InternalHale.g:1983:1: ( ( rule__Expression4__Alternatives_1 )* )
            {
            // InternalHale.g:1983:1: ( ( rule__Expression4__Alternatives_1 )* )
            // InternalHale.g:1984:2: ( rule__Expression4__Alternatives_1 )*
            {
             before(grammarAccess.getExpression4Access().getAlternatives_1()); 
            // InternalHale.g:1985:2: ( rule__Expression4__Alternatives_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=21 && LA16_0<=22)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalHale.g:1985:3: rule__Expression4__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Expression4__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalHale.g:1994:1: rule__Expression4__Group_1_0__0 : rule__Expression4__Group_1_0__0__Impl rule__Expression4__Group_1_0__1 ;
    public final void rule__Expression4__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1998:1: ( rule__Expression4__Group_1_0__0__Impl rule__Expression4__Group_1_0__1 )
            // InternalHale.g:1999:2: rule__Expression4__Group_1_0__0__Impl rule__Expression4__Group_1_0__1
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
    // InternalHale.g:2006:1: rule__Expression4__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Expression4__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2010:1: ( ( () ) )
            // InternalHale.g:2011:1: ( () )
            {
            // InternalHale.g:2011:1: ( () )
            // InternalHale.g:2012:2: ()
            {
             before(grammarAccess.getExpression4Access().getAdditionLeftAction_1_0_0()); 
            // InternalHale.g:2013:2: ()
            // InternalHale.g:2013:3: 
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
    // InternalHale.g:2021:1: rule__Expression4__Group_1_0__1 : rule__Expression4__Group_1_0__1__Impl rule__Expression4__Group_1_0__2 ;
    public final void rule__Expression4__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2025:1: ( rule__Expression4__Group_1_0__1__Impl rule__Expression4__Group_1_0__2 )
            // InternalHale.g:2026:2: rule__Expression4__Group_1_0__1__Impl rule__Expression4__Group_1_0__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalHale.g:2033:1: rule__Expression4__Group_1_0__1__Impl : ( '+' ) ;
    public final void rule__Expression4__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2037:1: ( ( '+' ) )
            // InternalHale.g:2038:1: ( '+' )
            {
            // InternalHale.g:2038:1: ( '+' )
            // InternalHale.g:2039:2: '+'
            {
             before(grammarAccess.getExpression4Access().getPlusSignKeyword_1_0_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalHale.g:2048:1: rule__Expression4__Group_1_0__2 : rule__Expression4__Group_1_0__2__Impl ;
    public final void rule__Expression4__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2052:1: ( rule__Expression4__Group_1_0__2__Impl )
            // InternalHale.g:2053:2: rule__Expression4__Group_1_0__2__Impl
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
    // InternalHale.g:2059:1: rule__Expression4__Group_1_0__2__Impl : ( ( rule__Expression4__RightAssignment_1_0_2 ) ) ;
    public final void rule__Expression4__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2063:1: ( ( ( rule__Expression4__RightAssignment_1_0_2 ) ) )
            // InternalHale.g:2064:1: ( ( rule__Expression4__RightAssignment_1_0_2 ) )
            {
            // InternalHale.g:2064:1: ( ( rule__Expression4__RightAssignment_1_0_2 ) )
            // InternalHale.g:2065:2: ( rule__Expression4__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getExpression4Access().getRightAssignment_1_0_2()); 
            // InternalHale.g:2066:2: ( rule__Expression4__RightAssignment_1_0_2 )
            // InternalHale.g:2066:3: rule__Expression4__RightAssignment_1_0_2
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
    // InternalHale.g:2075:1: rule__Expression4__Group_1_1__0 : rule__Expression4__Group_1_1__0__Impl rule__Expression4__Group_1_1__1 ;
    public final void rule__Expression4__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2079:1: ( rule__Expression4__Group_1_1__0__Impl rule__Expression4__Group_1_1__1 )
            // InternalHale.g:2080:2: rule__Expression4__Group_1_1__0__Impl rule__Expression4__Group_1_1__1
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
    // InternalHale.g:2087:1: rule__Expression4__Group_1_1__0__Impl : ( () ) ;
    public final void rule__Expression4__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2091:1: ( ( () ) )
            // InternalHale.g:2092:1: ( () )
            {
            // InternalHale.g:2092:1: ( () )
            // InternalHale.g:2093:2: ()
            {
             before(grammarAccess.getExpression4Access().getSubtractionLeftAction_1_1_0()); 
            // InternalHale.g:2094:2: ()
            // InternalHale.g:2094:3: 
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
    // InternalHale.g:2102:1: rule__Expression4__Group_1_1__1 : rule__Expression4__Group_1_1__1__Impl rule__Expression4__Group_1_1__2 ;
    public final void rule__Expression4__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2106:1: ( rule__Expression4__Group_1_1__1__Impl rule__Expression4__Group_1_1__2 )
            // InternalHale.g:2107:2: rule__Expression4__Group_1_1__1__Impl rule__Expression4__Group_1_1__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalHale.g:2114:1: rule__Expression4__Group_1_1__1__Impl : ( '-' ) ;
    public final void rule__Expression4__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2118:1: ( ( '-' ) )
            // InternalHale.g:2119:1: ( '-' )
            {
            // InternalHale.g:2119:1: ( '-' )
            // InternalHale.g:2120:2: '-'
            {
             before(grammarAccess.getExpression4Access().getHyphenMinusKeyword_1_1_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalHale.g:2129:1: rule__Expression4__Group_1_1__2 : rule__Expression4__Group_1_1__2__Impl ;
    public final void rule__Expression4__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2133:1: ( rule__Expression4__Group_1_1__2__Impl )
            // InternalHale.g:2134:2: rule__Expression4__Group_1_1__2__Impl
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
    // InternalHale.g:2140:1: rule__Expression4__Group_1_1__2__Impl : ( ( rule__Expression4__RightAssignment_1_1_2 ) ) ;
    public final void rule__Expression4__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2144:1: ( ( ( rule__Expression4__RightAssignment_1_1_2 ) ) )
            // InternalHale.g:2145:1: ( ( rule__Expression4__RightAssignment_1_1_2 ) )
            {
            // InternalHale.g:2145:1: ( ( rule__Expression4__RightAssignment_1_1_2 ) )
            // InternalHale.g:2146:2: ( rule__Expression4__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getExpression4Access().getRightAssignment_1_1_2()); 
            // InternalHale.g:2147:2: ( rule__Expression4__RightAssignment_1_1_2 )
            // InternalHale.g:2147:3: rule__Expression4__RightAssignment_1_1_2
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
    // InternalHale.g:2156:1: rule__Expression3__Group__0 : rule__Expression3__Group__0__Impl rule__Expression3__Group__1 ;
    public final void rule__Expression3__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2160:1: ( rule__Expression3__Group__0__Impl rule__Expression3__Group__1 )
            // InternalHale.g:2161:2: rule__Expression3__Group__0__Impl rule__Expression3__Group__1
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
    // InternalHale.g:2168:1: rule__Expression3__Group__0__Impl : ( ruleExpression2 ) ;
    public final void rule__Expression3__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2172:1: ( ( ruleExpression2 ) )
            // InternalHale.g:2173:1: ( ruleExpression2 )
            {
            // InternalHale.g:2173:1: ( ruleExpression2 )
            // InternalHale.g:2174:2: ruleExpression2
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
    // InternalHale.g:2183:1: rule__Expression3__Group__1 : rule__Expression3__Group__1__Impl ;
    public final void rule__Expression3__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2187:1: ( rule__Expression3__Group__1__Impl )
            // InternalHale.g:2188:2: rule__Expression3__Group__1__Impl
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
    // InternalHale.g:2194:1: rule__Expression3__Group__1__Impl : ( ( rule__Expression3__Alternatives_1 )* ) ;
    public final void rule__Expression3__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2198:1: ( ( ( rule__Expression3__Alternatives_1 )* ) )
            // InternalHale.g:2199:1: ( ( rule__Expression3__Alternatives_1 )* )
            {
            // InternalHale.g:2199:1: ( ( rule__Expression3__Alternatives_1 )* )
            // InternalHale.g:2200:2: ( rule__Expression3__Alternatives_1 )*
            {
             before(grammarAccess.getExpression3Access().getAlternatives_1()); 
            // InternalHale.g:2201:2: ( rule__Expression3__Alternatives_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=23 && LA17_0<=25)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalHale.g:2201:3: rule__Expression3__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Expression3__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalHale.g:2210:1: rule__Expression3__Group_1_0__0 : rule__Expression3__Group_1_0__0__Impl rule__Expression3__Group_1_0__1 ;
    public final void rule__Expression3__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2214:1: ( rule__Expression3__Group_1_0__0__Impl rule__Expression3__Group_1_0__1 )
            // InternalHale.g:2215:2: rule__Expression3__Group_1_0__0__Impl rule__Expression3__Group_1_0__1
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
    // InternalHale.g:2222:1: rule__Expression3__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Expression3__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2226:1: ( ( () ) )
            // InternalHale.g:2227:1: ( () )
            {
            // InternalHale.g:2227:1: ( () )
            // InternalHale.g:2228:2: ()
            {
             before(grammarAccess.getExpression3Access().getMultiplicationLeftAction_1_0_0()); 
            // InternalHale.g:2229:2: ()
            // InternalHale.g:2229:3: 
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
    // InternalHale.g:2237:1: rule__Expression3__Group_1_0__1 : rule__Expression3__Group_1_0__1__Impl rule__Expression3__Group_1_0__2 ;
    public final void rule__Expression3__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2241:1: ( rule__Expression3__Group_1_0__1__Impl rule__Expression3__Group_1_0__2 )
            // InternalHale.g:2242:2: rule__Expression3__Group_1_0__1__Impl rule__Expression3__Group_1_0__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalHale.g:2249:1: rule__Expression3__Group_1_0__1__Impl : ( '*' ) ;
    public final void rule__Expression3__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2253:1: ( ( '*' ) )
            // InternalHale.g:2254:1: ( '*' )
            {
            // InternalHale.g:2254:1: ( '*' )
            // InternalHale.g:2255:2: '*'
            {
             before(grammarAccess.getExpression3Access().getAsteriskKeyword_1_0_1()); 
            match(input,23,FOLLOW_2); 
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
    // InternalHale.g:2264:1: rule__Expression3__Group_1_0__2 : rule__Expression3__Group_1_0__2__Impl ;
    public final void rule__Expression3__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2268:1: ( rule__Expression3__Group_1_0__2__Impl )
            // InternalHale.g:2269:2: rule__Expression3__Group_1_0__2__Impl
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
    // InternalHale.g:2275:1: rule__Expression3__Group_1_0__2__Impl : ( ( rule__Expression3__RightAssignment_1_0_2 ) ) ;
    public final void rule__Expression3__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2279:1: ( ( ( rule__Expression3__RightAssignment_1_0_2 ) ) )
            // InternalHale.g:2280:1: ( ( rule__Expression3__RightAssignment_1_0_2 ) )
            {
            // InternalHale.g:2280:1: ( ( rule__Expression3__RightAssignment_1_0_2 ) )
            // InternalHale.g:2281:2: ( rule__Expression3__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getExpression3Access().getRightAssignment_1_0_2()); 
            // InternalHale.g:2282:2: ( rule__Expression3__RightAssignment_1_0_2 )
            // InternalHale.g:2282:3: rule__Expression3__RightAssignment_1_0_2
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
    // InternalHale.g:2291:1: rule__Expression3__Group_1_1__0 : rule__Expression3__Group_1_1__0__Impl rule__Expression3__Group_1_1__1 ;
    public final void rule__Expression3__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2295:1: ( rule__Expression3__Group_1_1__0__Impl rule__Expression3__Group_1_1__1 )
            // InternalHale.g:2296:2: rule__Expression3__Group_1_1__0__Impl rule__Expression3__Group_1_1__1
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
    // InternalHale.g:2303:1: rule__Expression3__Group_1_1__0__Impl : ( () ) ;
    public final void rule__Expression3__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2307:1: ( ( () ) )
            // InternalHale.g:2308:1: ( () )
            {
            // InternalHale.g:2308:1: ( () )
            // InternalHale.g:2309:2: ()
            {
             before(grammarAccess.getExpression3Access().getDivisionLeftAction_1_1_0()); 
            // InternalHale.g:2310:2: ()
            // InternalHale.g:2310:3: 
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
    // InternalHale.g:2318:1: rule__Expression3__Group_1_1__1 : rule__Expression3__Group_1_1__1__Impl rule__Expression3__Group_1_1__2 ;
    public final void rule__Expression3__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2322:1: ( rule__Expression3__Group_1_1__1__Impl rule__Expression3__Group_1_1__2 )
            // InternalHale.g:2323:2: rule__Expression3__Group_1_1__1__Impl rule__Expression3__Group_1_1__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalHale.g:2330:1: rule__Expression3__Group_1_1__1__Impl : ( '/' ) ;
    public final void rule__Expression3__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2334:1: ( ( '/' ) )
            // InternalHale.g:2335:1: ( '/' )
            {
            // InternalHale.g:2335:1: ( '/' )
            // InternalHale.g:2336:2: '/'
            {
             before(grammarAccess.getExpression3Access().getSolidusKeyword_1_1_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalHale.g:2345:1: rule__Expression3__Group_1_1__2 : rule__Expression3__Group_1_1__2__Impl ;
    public final void rule__Expression3__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2349:1: ( rule__Expression3__Group_1_1__2__Impl )
            // InternalHale.g:2350:2: rule__Expression3__Group_1_1__2__Impl
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
    // InternalHale.g:2356:1: rule__Expression3__Group_1_1__2__Impl : ( ( rule__Expression3__RightAssignment_1_1_2 ) ) ;
    public final void rule__Expression3__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2360:1: ( ( ( rule__Expression3__RightAssignment_1_1_2 ) ) )
            // InternalHale.g:2361:1: ( ( rule__Expression3__RightAssignment_1_1_2 ) )
            {
            // InternalHale.g:2361:1: ( ( rule__Expression3__RightAssignment_1_1_2 ) )
            // InternalHale.g:2362:2: ( rule__Expression3__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getExpression3Access().getRightAssignment_1_1_2()); 
            // InternalHale.g:2363:2: ( rule__Expression3__RightAssignment_1_1_2 )
            // InternalHale.g:2363:3: rule__Expression3__RightAssignment_1_1_2
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
    // InternalHale.g:2372:1: rule__Expression3__Group_1_2__0 : rule__Expression3__Group_1_2__0__Impl rule__Expression3__Group_1_2__1 ;
    public final void rule__Expression3__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2376:1: ( rule__Expression3__Group_1_2__0__Impl rule__Expression3__Group_1_2__1 )
            // InternalHale.g:2377:2: rule__Expression3__Group_1_2__0__Impl rule__Expression3__Group_1_2__1
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
    // InternalHale.g:2384:1: rule__Expression3__Group_1_2__0__Impl : ( () ) ;
    public final void rule__Expression3__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2388:1: ( ( () ) )
            // InternalHale.g:2389:1: ( () )
            {
            // InternalHale.g:2389:1: ( () )
            // InternalHale.g:2390:2: ()
            {
             before(grammarAccess.getExpression3Access().getRemainderLeftAction_1_2_0()); 
            // InternalHale.g:2391:2: ()
            // InternalHale.g:2391:3: 
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
    // InternalHale.g:2399:1: rule__Expression3__Group_1_2__1 : rule__Expression3__Group_1_2__1__Impl rule__Expression3__Group_1_2__2 ;
    public final void rule__Expression3__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2403:1: ( rule__Expression3__Group_1_2__1__Impl rule__Expression3__Group_1_2__2 )
            // InternalHale.g:2404:2: rule__Expression3__Group_1_2__1__Impl rule__Expression3__Group_1_2__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalHale.g:2411:1: rule__Expression3__Group_1_2__1__Impl : ( '%' ) ;
    public final void rule__Expression3__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2415:1: ( ( '%' ) )
            // InternalHale.g:2416:1: ( '%' )
            {
            // InternalHale.g:2416:1: ( '%' )
            // InternalHale.g:2417:2: '%'
            {
             before(grammarAccess.getExpression3Access().getPercentSignKeyword_1_2_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalHale.g:2426:1: rule__Expression3__Group_1_2__2 : rule__Expression3__Group_1_2__2__Impl ;
    public final void rule__Expression3__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2430:1: ( rule__Expression3__Group_1_2__2__Impl )
            // InternalHale.g:2431:2: rule__Expression3__Group_1_2__2__Impl
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
    // InternalHale.g:2437:1: rule__Expression3__Group_1_2__2__Impl : ( ( rule__Expression3__RightAssignment_1_2_2 ) ) ;
    public final void rule__Expression3__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2441:1: ( ( ( rule__Expression3__RightAssignment_1_2_2 ) ) )
            // InternalHale.g:2442:1: ( ( rule__Expression3__RightAssignment_1_2_2 ) )
            {
            // InternalHale.g:2442:1: ( ( rule__Expression3__RightAssignment_1_2_2 ) )
            // InternalHale.g:2443:2: ( rule__Expression3__RightAssignment_1_2_2 )
            {
             before(grammarAccess.getExpression3Access().getRightAssignment_1_2_2()); 
            // InternalHale.g:2444:2: ( rule__Expression3__RightAssignment_1_2_2 )
            // InternalHale.g:2444:3: rule__Expression3__RightAssignment_1_2_2
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
    // InternalHale.g:2453:1: rule__Expression2__Group__0 : rule__Expression2__Group__0__Impl rule__Expression2__Group__1 ;
    public final void rule__Expression2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2457:1: ( rule__Expression2__Group__0__Impl rule__Expression2__Group__1 )
            // InternalHale.g:2458:2: rule__Expression2__Group__0__Impl rule__Expression2__Group__1
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
    // InternalHale.g:2465:1: rule__Expression2__Group__0__Impl : ( ruleExpression1 ) ;
    public final void rule__Expression2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2469:1: ( ( ruleExpression1 ) )
            // InternalHale.g:2470:1: ( ruleExpression1 )
            {
            // InternalHale.g:2470:1: ( ruleExpression1 )
            // InternalHale.g:2471:2: ruleExpression1
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
    // InternalHale.g:2480:1: rule__Expression2__Group__1 : rule__Expression2__Group__1__Impl ;
    public final void rule__Expression2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2484:1: ( rule__Expression2__Group__1__Impl )
            // InternalHale.g:2485:2: rule__Expression2__Group__1__Impl
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
    // InternalHale.g:2491:1: rule__Expression2__Group__1__Impl : ( ( rule__Expression2__Group_1__0 )* ) ;
    public final void rule__Expression2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2495:1: ( ( ( rule__Expression2__Group_1__0 )* ) )
            // InternalHale.g:2496:1: ( ( rule__Expression2__Group_1__0 )* )
            {
            // InternalHale.g:2496:1: ( ( rule__Expression2__Group_1__0 )* )
            // InternalHale.g:2497:2: ( rule__Expression2__Group_1__0 )*
            {
             before(grammarAccess.getExpression2Access().getGroup_1()); 
            // InternalHale.g:2498:2: ( rule__Expression2__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==26) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalHale.g:2498:3: rule__Expression2__Group_1__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__Expression2__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalHale.g:2507:1: rule__Expression2__Group_1__0 : rule__Expression2__Group_1__0__Impl rule__Expression2__Group_1__1 ;
    public final void rule__Expression2__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2511:1: ( rule__Expression2__Group_1__0__Impl rule__Expression2__Group_1__1 )
            // InternalHale.g:2512:2: rule__Expression2__Group_1__0__Impl rule__Expression2__Group_1__1
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
    // InternalHale.g:2519:1: rule__Expression2__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression2__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2523:1: ( ( () ) )
            // InternalHale.g:2524:1: ( () )
            {
            // InternalHale.g:2524:1: ( () )
            // InternalHale.g:2525:2: ()
            {
             before(grammarAccess.getExpression2Access().getExponentiationLeftAction_1_0()); 
            // InternalHale.g:2526:2: ()
            // InternalHale.g:2526:3: 
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
    // InternalHale.g:2534:1: rule__Expression2__Group_1__1 : rule__Expression2__Group_1__1__Impl rule__Expression2__Group_1__2 ;
    public final void rule__Expression2__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2538:1: ( rule__Expression2__Group_1__1__Impl rule__Expression2__Group_1__2 )
            // InternalHale.g:2539:2: rule__Expression2__Group_1__1__Impl rule__Expression2__Group_1__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalHale.g:2546:1: rule__Expression2__Group_1__1__Impl : ( '**' ) ;
    public final void rule__Expression2__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2550:1: ( ( '**' ) )
            // InternalHale.g:2551:1: ( '**' )
            {
            // InternalHale.g:2551:1: ( '**' )
            // InternalHale.g:2552:2: '**'
            {
             before(grammarAccess.getExpression2Access().getAsteriskAsteriskKeyword_1_1()); 
            match(input,26,FOLLOW_2); 
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
    // InternalHale.g:2561:1: rule__Expression2__Group_1__2 : rule__Expression2__Group_1__2__Impl ;
    public final void rule__Expression2__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2565:1: ( rule__Expression2__Group_1__2__Impl )
            // InternalHale.g:2566:2: rule__Expression2__Group_1__2__Impl
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
    // InternalHale.g:2572:1: rule__Expression2__Group_1__2__Impl : ( ( rule__Expression2__RightAssignment_1_2 ) ) ;
    public final void rule__Expression2__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2576:1: ( ( ( rule__Expression2__RightAssignment_1_2 ) ) )
            // InternalHale.g:2577:1: ( ( rule__Expression2__RightAssignment_1_2 ) )
            {
            // InternalHale.g:2577:1: ( ( rule__Expression2__RightAssignment_1_2 ) )
            // InternalHale.g:2578:2: ( rule__Expression2__RightAssignment_1_2 )
            {
             before(grammarAccess.getExpression2Access().getRightAssignment_1_2()); 
            // InternalHale.g:2579:2: ( rule__Expression2__RightAssignment_1_2 )
            // InternalHale.g:2579:3: rule__Expression2__RightAssignment_1_2
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
    // InternalHale.g:2588:1: rule__Expression1__Group_0__0 : rule__Expression1__Group_0__0__Impl rule__Expression1__Group_0__1 ;
    public final void rule__Expression1__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2592:1: ( rule__Expression1__Group_0__0__Impl rule__Expression1__Group_0__1 )
            // InternalHale.g:2593:2: rule__Expression1__Group_0__0__Impl rule__Expression1__Group_0__1
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
    // InternalHale.g:2600:1: rule__Expression1__Group_0__0__Impl : ( () ) ;
    public final void rule__Expression1__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2604:1: ( ( () ) )
            // InternalHale.g:2605:1: ( () )
            {
            // InternalHale.g:2605:1: ( () )
            // InternalHale.g:2606:2: ()
            {
             before(grammarAccess.getExpression1Access().getUnaryNegationAction_0_0()); 
            // InternalHale.g:2607:2: ()
            // InternalHale.g:2607:3: 
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
    // InternalHale.g:2615:1: rule__Expression1__Group_0__1 : rule__Expression1__Group_0__1__Impl rule__Expression1__Group_0__2 ;
    public final void rule__Expression1__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2619:1: ( rule__Expression1__Group_0__1__Impl rule__Expression1__Group_0__2 )
            // InternalHale.g:2620:2: rule__Expression1__Group_0__1__Impl rule__Expression1__Group_0__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalHale.g:2627:1: rule__Expression1__Group_0__1__Impl : ( '-' ) ;
    public final void rule__Expression1__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2631:1: ( ( '-' ) )
            // InternalHale.g:2632:1: ( '-' )
            {
            // InternalHale.g:2632:1: ( '-' )
            // InternalHale.g:2633:2: '-'
            {
             before(grammarAccess.getExpression1Access().getHyphenMinusKeyword_0_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalHale.g:2642:1: rule__Expression1__Group_0__2 : rule__Expression1__Group_0__2__Impl ;
    public final void rule__Expression1__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2646:1: ( rule__Expression1__Group_0__2__Impl )
            // InternalHale.g:2647:2: rule__Expression1__Group_0__2__Impl
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
    // InternalHale.g:2653:1: rule__Expression1__Group_0__2__Impl : ( ( rule__Expression1__InnerAssignment_0_2 ) ) ;
    public final void rule__Expression1__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2657:1: ( ( ( rule__Expression1__InnerAssignment_0_2 ) ) )
            // InternalHale.g:2658:1: ( ( rule__Expression1__InnerAssignment_0_2 ) )
            {
            // InternalHale.g:2658:1: ( ( rule__Expression1__InnerAssignment_0_2 ) )
            // InternalHale.g:2659:2: ( rule__Expression1__InnerAssignment_0_2 )
            {
             before(grammarAccess.getExpression1Access().getInnerAssignment_0_2()); 
            // InternalHale.g:2660:2: ( rule__Expression1__InnerAssignment_0_2 )
            // InternalHale.g:2660:3: rule__Expression1__InnerAssignment_0_2
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
    // InternalHale.g:2669:1: rule__Expression1__Group_1__0 : rule__Expression1__Group_1__0__Impl rule__Expression1__Group_1__1 ;
    public final void rule__Expression1__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2673:1: ( rule__Expression1__Group_1__0__Impl rule__Expression1__Group_1__1 )
            // InternalHale.g:2674:2: rule__Expression1__Group_1__0__Impl rule__Expression1__Group_1__1
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
    // InternalHale.g:2681:1: rule__Expression1__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression1__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2685:1: ( ( () ) )
            // InternalHale.g:2686:1: ( () )
            {
            // InternalHale.g:2686:1: ( () )
            // InternalHale.g:2687:2: ()
            {
             before(grammarAccess.getExpression1Access().getLogicalNotAction_1_0()); 
            // InternalHale.g:2688:2: ()
            // InternalHale.g:2688:3: 
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
    // InternalHale.g:2696:1: rule__Expression1__Group_1__1 : rule__Expression1__Group_1__1__Impl rule__Expression1__Group_1__2 ;
    public final void rule__Expression1__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2700:1: ( rule__Expression1__Group_1__1__Impl rule__Expression1__Group_1__2 )
            // InternalHale.g:2701:2: rule__Expression1__Group_1__1__Impl rule__Expression1__Group_1__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalHale.g:2708:1: rule__Expression1__Group_1__1__Impl : ( 'not' ) ;
    public final void rule__Expression1__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2712:1: ( ( 'not' ) )
            // InternalHale.g:2713:1: ( 'not' )
            {
            // InternalHale.g:2713:1: ( 'not' )
            // InternalHale.g:2714:2: 'not'
            {
             before(grammarAccess.getExpression1Access().getNotKeyword_1_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalHale.g:2723:1: rule__Expression1__Group_1__2 : rule__Expression1__Group_1__2__Impl ;
    public final void rule__Expression1__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2727:1: ( rule__Expression1__Group_1__2__Impl )
            // InternalHale.g:2728:2: rule__Expression1__Group_1__2__Impl
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
    // InternalHale.g:2734:1: rule__Expression1__Group_1__2__Impl : ( ( rule__Expression1__InnerAssignment_1_2 ) ) ;
    public final void rule__Expression1__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2738:1: ( ( ( rule__Expression1__InnerAssignment_1_2 ) ) )
            // InternalHale.g:2739:1: ( ( rule__Expression1__InnerAssignment_1_2 ) )
            {
            // InternalHale.g:2739:1: ( ( rule__Expression1__InnerAssignment_1_2 ) )
            // InternalHale.g:2740:2: ( rule__Expression1__InnerAssignment_1_2 )
            {
             before(grammarAccess.getExpression1Access().getInnerAssignment_1_2()); 
            // InternalHale.g:2741:2: ( rule__Expression1__InnerAssignment_1_2 )
            // InternalHale.g:2741:3: rule__Expression1__InnerAssignment_1_2
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
    // InternalHale.g:2750:1: rule__Primary__Group_2__0 : rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 ;
    public final void rule__Primary__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2754:1: ( rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 )
            // InternalHale.g:2755:2: rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalHale.g:2762:1: rule__Primary__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2766:1: ( ( '(' ) )
            // InternalHale.g:2767:1: ( '(' )
            {
            // InternalHale.g:2767:1: ( '(' )
            // InternalHale.g:2768:2: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalHale.g:2777:1: rule__Primary__Group_2__1 : rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 ;
    public final void rule__Primary__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2781:1: ( rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 )
            // InternalHale.g:2782:2: rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2
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
    // InternalHale.g:2789:1: rule__Primary__Group_2__1__Impl : ( ruleExpression ) ;
    public final void rule__Primary__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2793:1: ( ( ruleExpression ) )
            // InternalHale.g:2794:1: ( ruleExpression )
            {
            // InternalHale.g:2794:1: ( ruleExpression )
            // InternalHale.g:2795:2: ruleExpression
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
    // InternalHale.g:2804:1: rule__Primary__Group_2__2 : rule__Primary__Group_2__2__Impl ;
    public final void rule__Primary__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2808:1: ( rule__Primary__Group_2__2__Impl )
            // InternalHale.g:2809:2: rule__Primary__Group_2__2__Impl
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
    // InternalHale.g:2815:1: rule__Primary__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2819:1: ( ( ')' ) )
            // InternalHale.g:2820:1: ( ')' )
            {
            // InternalHale.g:2820:1: ( ')' )
            // InternalHale.g:2821:2: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_2_2()); 
            match(input,29,FOLLOW_2); 
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


    // $ANTLR start "rule__Binding__Group__0"
    // InternalHale.g:2831:1: rule__Binding__Group__0 : rule__Binding__Group__0__Impl rule__Binding__Group__1 ;
    public final void rule__Binding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2835:1: ( rule__Binding__Group__0__Impl rule__Binding__Group__1 )
            // InternalHale.g:2836:2: rule__Binding__Group__0__Impl rule__Binding__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalHale.g:2843:1: rule__Binding__Group__0__Impl : ( 'let' ) ;
    public final void rule__Binding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2847:1: ( ( 'let' ) )
            // InternalHale.g:2848:1: ( 'let' )
            {
            // InternalHale.g:2848:1: ( 'let' )
            // InternalHale.g:2849:2: 'let'
            {
             before(grammarAccess.getBindingAccess().getLetKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalHale.g:2858:1: rule__Binding__Group__1 : rule__Binding__Group__1__Impl rule__Binding__Group__2 ;
    public final void rule__Binding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2862:1: ( rule__Binding__Group__1__Impl rule__Binding__Group__2 )
            // InternalHale.g:2863:2: rule__Binding__Group__1__Impl rule__Binding__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalHale.g:2870:1: rule__Binding__Group__1__Impl : ( ( rule__Binding__MutableAssignment_1 )? ) ;
    public final void rule__Binding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2874:1: ( ( ( rule__Binding__MutableAssignment_1 )? ) )
            // InternalHale.g:2875:1: ( ( rule__Binding__MutableAssignment_1 )? )
            {
            // InternalHale.g:2875:1: ( ( rule__Binding__MutableAssignment_1 )? )
            // InternalHale.g:2876:2: ( rule__Binding__MutableAssignment_1 )?
            {
             before(grammarAccess.getBindingAccess().getMutableAssignment_1()); 
            // InternalHale.g:2877:2: ( rule__Binding__MutableAssignment_1 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==37) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalHale.g:2877:3: rule__Binding__MutableAssignment_1
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
    // InternalHale.g:2885:1: rule__Binding__Group__2 : rule__Binding__Group__2__Impl rule__Binding__Group__3 ;
    public final void rule__Binding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2889:1: ( rule__Binding__Group__2__Impl rule__Binding__Group__3 )
            // InternalHale.g:2890:2: rule__Binding__Group__2__Impl rule__Binding__Group__3
            {
            pushFollow(FOLLOW_32);
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
    // InternalHale.g:2897:1: rule__Binding__Group__2__Impl : ( ( rule__Binding__NameAssignment_2 ) ) ;
    public final void rule__Binding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2901:1: ( ( ( rule__Binding__NameAssignment_2 ) ) )
            // InternalHale.g:2902:1: ( ( rule__Binding__NameAssignment_2 ) )
            {
            // InternalHale.g:2902:1: ( ( rule__Binding__NameAssignment_2 ) )
            // InternalHale.g:2903:2: ( rule__Binding__NameAssignment_2 )
            {
             before(grammarAccess.getBindingAccess().getNameAssignment_2()); 
            // InternalHale.g:2904:2: ( rule__Binding__NameAssignment_2 )
            // InternalHale.g:2904:3: rule__Binding__NameAssignment_2
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
    // InternalHale.g:2912:1: rule__Binding__Group__3 : rule__Binding__Group__3__Impl rule__Binding__Group__4 ;
    public final void rule__Binding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2916:1: ( rule__Binding__Group__3__Impl rule__Binding__Group__4 )
            // InternalHale.g:2917:2: rule__Binding__Group__3__Impl rule__Binding__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalHale.g:2924:1: rule__Binding__Group__3__Impl : ( '=' ) ;
    public final void rule__Binding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2928:1: ( ( '=' ) )
            // InternalHale.g:2929:1: ( '=' )
            {
            // InternalHale.g:2929:1: ( '=' )
            // InternalHale.g:2930:2: '='
            {
             before(grammarAccess.getBindingAccess().getEqualsSignKeyword_3()); 
            match(input,31,FOLLOW_2); 
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
    // InternalHale.g:2939:1: rule__Binding__Group__4 : rule__Binding__Group__4__Impl ;
    public final void rule__Binding__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2943:1: ( rule__Binding__Group__4__Impl )
            // InternalHale.g:2944:2: rule__Binding__Group__4__Impl
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
    // InternalHale.g:2950:1: rule__Binding__Group__4__Impl : ( ( rule__Binding__ExpressionAssignment_4 ) ) ;
    public final void rule__Binding__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2954:1: ( ( ( rule__Binding__ExpressionAssignment_4 ) ) )
            // InternalHale.g:2955:1: ( ( rule__Binding__ExpressionAssignment_4 ) )
            {
            // InternalHale.g:2955:1: ( ( rule__Binding__ExpressionAssignment_4 ) )
            // InternalHale.g:2956:2: ( rule__Binding__ExpressionAssignment_4 )
            {
             before(grammarAccess.getBindingAccess().getExpressionAssignment_4()); 
            // InternalHale.g:2957:2: ( rule__Binding__ExpressionAssignment_4 )
            // InternalHale.g:2957:3: rule__Binding__ExpressionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Binding__ExpressionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getBindingAccess().getExpressionAssignment_4()); 

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
    // InternalHale.g:2966:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2970:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // InternalHale.g:2971:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalHale.g:2978:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__BindingAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2982:1: ( ( ( rule__Assignment__BindingAssignment_0 ) ) )
            // InternalHale.g:2983:1: ( ( rule__Assignment__BindingAssignment_0 ) )
            {
            // InternalHale.g:2983:1: ( ( rule__Assignment__BindingAssignment_0 ) )
            // InternalHale.g:2984:2: ( rule__Assignment__BindingAssignment_0 )
            {
             before(grammarAccess.getAssignmentAccess().getBindingAssignment_0()); 
            // InternalHale.g:2985:2: ( rule__Assignment__BindingAssignment_0 )
            // InternalHale.g:2985:3: rule__Assignment__BindingAssignment_0
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
    // InternalHale.g:2993:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2997:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // InternalHale.g:2998:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalHale.g:3005:1: rule__Assignment__Group__1__Impl : ( '=' ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3009:1: ( ( '=' ) )
            // InternalHale.g:3010:1: ( '=' )
            {
            // InternalHale.g:3010:1: ( '=' )
            // InternalHale.g:3011:2: '='
            {
             before(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalHale.g:3020:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3024:1: ( rule__Assignment__Group__2__Impl )
            // InternalHale.g:3025:2: rule__Assignment__Group__2__Impl
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
    // InternalHale.g:3031:1: rule__Assignment__Group__2__Impl : ( ( rule__Assignment__ExpressionAssignment_2 ) ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3035:1: ( ( ( rule__Assignment__ExpressionAssignment_2 ) ) )
            // InternalHale.g:3036:1: ( ( rule__Assignment__ExpressionAssignment_2 ) )
            {
            // InternalHale.g:3036:1: ( ( rule__Assignment__ExpressionAssignment_2 ) )
            // InternalHale.g:3037:2: ( rule__Assignment__ExpressionAssignment_2 )
            {
             before(grammarAccess.getAssignmentAccess().getExpressionAssignment_2()); 
            // InternalHale.g:3038:2: ( rule__Assignment__ExpressionAssignment_2 )
            // InternalHale.g:3038:3: rule__Assignment__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__ExpressionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getExpressionAssignment_2()); 

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


    // $ANTLR start "rule__Print__Group__0"
    // InternalHale.g:3047:1: rule__Print__Group__0 : rule__Print__Group__0__Impl rule__Print__Group__1 ;
    public final void rule__Print__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3051:1: ( rule__Print__Group__0__Impl rule__Print__Group__1 )
            // InternalHale.g:3052:2: rule__Print__Group__0__Impl rule__Print__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalHale.g:3059:1: rule__Print__Group__0__Impl : ( 'print' ) ;
    public final void rule__Print__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3063:1: ( ( 'print' ) )
            // InternalHale.g:3064:1: ( 'print' )
            {
            // InternalHale.g:3064:1: ( 'print' )
            // InternalHale.g:3065:2: 'print'
            {
             before(grammarAccess.getPrintAccess().getPrintKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalHale.g:3074:1: rule__Print__Group__1 : rule__Print__Group__1__Impl ;
    public final void rule__Print__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3078:1: ( rule__Print__Group__1__Impl )
            // InternalHale.g:3079:2: rule__Print__Group__1__Impl
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
    // InternalHale.g:3085:1: rule__Print__Group__1__Impl : ( ( rule__Print__ExpressionAssignment_1 ) ) ;
    public final void rule__Print__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3089:1: ( ( ( rule__Print__ExpressionAssignment_1 ) ) )
            // InternalHale.g:3090:1: ( ( rule__Print__ExpressionAssignment_1 ) )
            {
            // InternalHale.g:3090:1: ( ( rule__Print__ExpressionAssignment_1 ) )
            // InternalHale.g:3091:2: ( rule__Print__ExpressionAssignment_1 )
            {
             before(grammarAccess.getPrintAccess().getExpressionAssignment_1()); 
            // InternalHale.g:3092:2: ( rule__Print__ExpressionAssignment_1 )
            // InternalHale.g:3092:3: rule__Print__ExpressionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Print__ExpressionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPrintAccess().getExpressionAssignment_1()); 

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


    // $ANTLR start "rule__If__Group__0"
    // InternalHale.g:3101:1: rule__If__Group__0 : rule__If__Group__0__Impl rule__If__Group__1 ;
    public final void rule__If__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3105:1: ( rule__If__Group__0__Impl rule__If__Group__1 )
            // InternalHale.g:3106:2: rule__If__Group__0__Impl rule__If__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__If__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group__1();

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
    // $ANTLR end "rule__If__Group__0"


    // $ANTLR start "rule__If__Group__0__Impl"
    // InternalHale.g:3113:1: rule__If__Group__0__Impl : ( 'if' ) ;
    public final void rule__If__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3117:1: ( ( 'if' ) )
            // InternalHale.g:3118:1: ( 'if' )
            {
            // InternalHale.g:3118:1: ( 'if' )
            // InternalHale.g:3119:2: 'if'
            {
             before(grammarAccess.getIfAccess().getIfKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getIfAccess().getIfKeyword_0()); 

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
    // $ANTLR end "rule__If__Group__0__Impl"


    // $ANTLR start "rule__If__Group__1"
    // InternalHale.g:3128:1: rule__If__Group__1 : rule__If__Group__1__Impl rule__If__Group__2 ;
    public final void rule__If__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3132:1: ( rule__If__Group__1__Impl rule__If__Group__2 )
            // InternalHale.g:3133:2: rule__If__Group__1__Impl rule__If__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__If__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group__2();

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
    // $ANTLR end "rule__If__Group__1"


    // $ANTLR start "rule__If__Group__1__Impl"
    // InternalHale.g:3140:1: rule__If__Group__1__Impl : ( ( rule__If__ConditionsAssignment_1 ) ) ;
    public final void rule__If__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3144:1: ( ( ( rule__If__ConditionsAssignment_1 ) ) )
            // InternalHale.g:3145:1: ( ( rule__If__ConditionsAssignment_1 ) )
            {
            // InternalHale.g:3145:1: ( ( rule__If__ConditionsAssignment_1 ) )
            // InternalHale.g:3146:2: ( rule__If__ConditionsAssignment_1 )
            {
             before(grammarAccess.getIfAccess().getConditionsAssignment_1()); 
            // InternalHale.g:3147:2: ( rule__If__ConditionsAssignment_1 )
            // InternalHale.g:3147:3: rule__If__ConditionsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__If__ConditionsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIfAccess().getConditionsAssignment_1()); 

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
    // $ANTLR end "rule__If__Group__1__Impl"


    // $ANTLR start "rule__If__Group__2"
    // InternalHale.g:3155:1: rule__If__Group__2 : rule__If__Group__2__Impl rule__If__Group__3 ;
    public final void rule__If__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3159:1: ( rule__If__Group__2__Impl rule__If__Group__3 )
            // InternalHale.g:3160:2: rule__If__Group__2__Impl rule__If__Group__3
            {
            pushFollow(FOLLOW_34);
            rule__If__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group__3();

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
    // $ANTLR end "rule__If__Group__2"


    // $ANTLR start "rule__If__Group__2__Impl"
    // InternalHale.g:3167:1: rule__If__Group__2__Impl : ( ( rule__If__IfBlocksAssignment_2 ) ) ;
    public final void rule__If__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3171:1: ( ( ( rule__If__IfBlocksAssignment_2 ) ) )
            // InternalHale.g:3172:1: ( ( rule__If__IfBlocksAssignment_2 ) )
            {
            // InternalHale.g:3172:1: ( ( rule__If__IfBlocksAssignment_2 ) )
            // InternalHale.g:3173:2: ( rule__If__IfBlocksAssignment_2 )
            {
             before(grammarAccess.getIfAccess().getIfBlocksAssignment_2()); 
            // InternalHale.g:3174:2: ( rule__If__IfBlocksAssignment_2 )
            // InternalHale.g:3174:3: rule__If__IfBlocksAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__If__IfBlocksAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIfAccess().getIfBlocksAssignment_2()); 

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
    // $ANTLR end "rule__If__Group__2__Impl"


    // $ANTLR start "rule__If__Group__3"
    // InternalHale.g:3182:1: rule__If__Group__3 : rule__If__Group__3__Impl rule__If__Group__4 ;
    public final void rule__If__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3186:1: ( rule__If__Group__3__Impl rule__If__Group__4 )
            // InternalHale.g:3187:2: rule__If__Group__3__Impl rule__If__Group__4
            {
            pushFollow(FOLLOW_34);
            rule__If__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group__4();

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
    // $ANTLR end "rule__If__Group__3"


    // $ANTLR start "rule__If__Group__3__Impl"
    // InternalHale.g:3194:1: rule__If__Group__3__Impl : ( ( rule__If__Group_3__0 )* ) ;
    public final void rule__If__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3198:1: ( ( ( rule__If__Group_3__0 )* ) )
            // InternalHale.g:3199:1: ( ( rule__If__Group_3__0 )* )
            {
            // InternalHale.g:3199:1: ( ( rule__If__Group_3__0 )* )
            // InternalHale.g:3200:2: ( rule__If__Group_3__0 )*
            {
             before(grammarAccess.getIfAccess().getGroup_3()); 
            // InternalHale.g:3201:2: ( rule__If__Group_3__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==34) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalHale.g:3201:3: rule__If__Group_3__0
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__If__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getIfAccess().getGroup_3()); 

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
    // $ANTLR end "rule__If__Group__3__Impl"


    // $ANTLR start "rule__If__Group__4"
    // InternalHale.g:3209:1: rule__If__Group__4 : rule__If__Group__4__Impl ;
    public final void rule__If__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3213:1: ( rule__If__Group__4__Impl )
            // InternalHale.g:3214:2: rule__If__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__If__Group__4__Impl();

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
    // $ANTLR end "rule__If__Group__4"


    // $ANTLR start "rule__If__Group__4__Impl"
    // InternalHale.g:3220:1: rule__If__Group__4__Impl : ( ( rule__If__Group_4__0 )? ) ;
    public final void rule__If__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3224:1: ( ( ( rule__If__Group_4__0 )? ) )
            // InternalHale.g:3225:1: ( ( rule__If__Group_4__0 )? )
            {
            // InternalHale.g:3225:1: ( ( rule__If__Group_4__0 )? )
            // InternalHale.g:3226:2: ( rule__If__Group_4__0 )?
            {
             before(grammarAccess.getIfAccess().getGroup_4()); 
            // InternalHale.g:3227:2: ( rule__If__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==35) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalHale.g:3227:3: rule__If__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__If__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIfAccess().getGroup_4()); 

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
    // $ANTLR end "rule__If__Group__4__Impl"


    // $ANTLR start "rule__If__Group_3__0"
    // InternalHale.g:3236:1: rule__If__Group_3__0 : rule__If__Group_3__0__Impl rule__If__Group_3__1 ;
    public final void rule__If__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3240:1: ( rule__If__Group_3__0__Impl rule__If__Group_3__1 )
            // InternalHale.g:3241:2: rule__If__Group_3__0__Impl rule__If__Group_3__1
            {
            pushFollow(FOLLOW_10);
            rule__If__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group_3__1();

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
    // $ANTLR end "rule__If__Group_3__0"


    // $ANTLR start "rule__If__Group_3__0__Impl"
    // InternalHale.g:3248:1: rule__If__Group_3__0__Impl : ( 'elseif' ) ;
    public final void rule__If__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3252:1: ( ( 'elseif' ) )
            // InternalHale.g:3253:1: ( 'elseif' )
            {
            // InternalHale.g:3253:1: ( 'elseif' )
            // InternalHale.g:3254:2: 'elseif'
            {
             before(grammarAccess.getIfAccess().getElseifKeyword_3_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getIfAccess().getElseifKeyword_3_0()); 

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
    // $ANTLR end "rule__If__Group_3__0__Impl"


    // $ANTLR start "rule__If__Group_3__1"
    // InternalHale.g:3263:1: rule__If__Group_3__1 : rule__If__Group_3__1__Impl rule__If__Group_3__2 ;
    public final void rule__If__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3267:1: ( rule__If__Group_3__1__Impl rule__If__Group_3__2 )
            // InternalHale.g:3268:2: rule__If__Group_3__1__Impl rule__If__Group_3__2
            {
            pushFollow(FOLLOW_33);
            rule__If__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group_3__2();

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
    // $ANTLR end "rule__If__Group_3__1"


    // $ANTLR start "rule__If__Group_3__1__Impl"
    // InternalHale.g:3275:1: rule__If__Group_3__1__Impl : ( ( rule__If__ConditionsAssignment_3_1 ) ) ;
    public final void rule__If__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3279:1: ( ( ( rule__If__ConditionsAssignment_3_1 ) ) )
            // InternalHale.g:3280:1: ( ( rule__If__ConditionsAssignment_3_1 ) )
            {
            // InternalHale.g:3280:1: ( ( rule__If__ConditionsAssignment_3_1 ) )
            // InternalHale.g:3281:2: ( rule__If__ConditionsAssignment_3_1 )
            {
             before(grammarAccess.getIfAccess().getConditionsAssignment_3_1()); 
            // InternalHale.g:3282:2: ( rule__If__ConditionsAssignment_3_1 )
            // InternalHale.g:3282:3: rule__If__ConditionsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__If__ConditionsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getIfAccess().getConditionsAssignment_3_1()); 

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
    // $ANTLR end "rule__If__Group_3__1__Impl"


    // $ANTLR start "rule__If__Group_3__2"
    // InternalHale.g:3290:1: rule__If__Group_3__2 : rule__If__Group_3__2__Impl ;
    public final void rule__If__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3294:1: ( rule__If__Group_3__2__Impl )
            // InternalHale.g:3295:2: rule__If__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__If__Group_3__2__Impl();

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
    // $ANTLR end "rule__If__Group_3__2"


    // $ANTLR start "rule__If__Group_3__2__Impl"
    // InternalHale.g:3301:1: rule__If__Group_3__2__Impl : ( ( rule__If__IfBlocksAssignment_3_2 ) ) ;
    public final void rule__If__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3305:1: ( ( ( rule__If__IfBlocksAssignment_3_2 ) ) )
            // InternalHale.g:3306:1: ( ( rule__If__IfBlocksAssignment_3_2 ) )
            {
            // InternalHale.g:3306:1: ( ( rule__If__IfBlocksAssignment_3_2 ) )
            // InternalHale.g:3307:2: ( rule__If__IfBlocksAssignment_3_2 )
            {
             before(grammarAccess.getIfAccess().getIfBlocksAssignment_3_2()); 
            // InternalHale.g:3308:2: ( rule__If__IfBlocksAssignment_3_2 )
            // InternalHale.g:3308:3: rule__If__IfBlocksAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__If__IfBlocksAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getIfAccess().getIfBlocksAssignment_3_2()); 

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
    // $ANTLR end "rule__If__Group_3__2__Impl"


    // $ANTLR start "rule__If__Group_4__0"
    // InternalHale.g:3317:1: rule__If__Group_4__0 : rule__If__Group_4__0__Impl rule__If__Group_4__1 ;
    public final void rule__If__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3321:1: ( rule__If__Group_4__0__Impl rule__If__Group_4__1 )
            // InternalHale.g:3322:2: rule__If__Group_4__0__Impl rule__If__Group_4__1
            {
            pushFollow(FOLLOW_33);
            rule__If__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group_4__1();

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
    // $ANTLR end "rule__If__Group_4__0"


    // $ANTLR start "rule__If__Group_4__0__Impl"
    // InternalHale.g:3329:1: rule__If__Group_4__0__Impl : ( 'else' ) ;
    public final void rule__If__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3333:1: ( ( 'else' ) )
            // InternalHale.g:3334:1: ( 'else' )
            {
            // InternalHale.g:3334:1: ( 'else' )
            // InternalHale.g:3335:2: 'else'
            {
             before(grammarAccess.getIfAccess().getElseKeyword_4_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getIfAccess().getElseKeyword_4_0()); 

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
    // $ANTLR end "rule__If__Group_4__0__Impl"


    // $ANTLR start "rule__If__Group_4__1"
    // InternalHale.g:3344:1: rule__If__Group_4__1 : rule__If__Group_4__1__Impl ;
    public final void rule__If__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3348:1: ( rule__If__Group_4__1__Impl )
            // InternalHale.g:3349:2: rule__If__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__If__Group_4__1__Impl();

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
    // $ANTLR end "rule__If__Group_4__1"


    // $ANTLR start "rule__If__Group_4__1__Impl"
    // InternalHale.g:3355:1: rule__If__Group_4__1__Impl : ( ( rule__If__ElseBlockAssignment_4_1 ) ) ;
    public final void rule__If__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3359:1: ( ( ( rule__If__ElseBlockAssignment_4_1 ) ) )
            // InternalHale.g:3360:1: ( ( rule__If__ElseBlockAssignment_4_1 ) )
            {
            // InternalHale.g:3360:1: ( ( rule__If__ElseBlockAssignment_4_1 ) )
            // InternalHale.g:3361:2: ( rule__If__ElseBlockAssignment_4_1 )
            {
             before(grammarAccess.getIfAccess().getElseBlockAssignment_4_1()); 
            // InternalHale.g:3362:2: ( rule__If__ElseBlockAssignment_4_1 )
            // InternalHale.g:3362:3: rule__If__ElseBlockAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__If__ElseBlockAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getIfAccess().getElseBlockAssignment_4_1()); 

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
    // $ANTLR end "rule__If__Group_4__1__Impl"


    // $ANTLR start "rule__While__Group__0"
    // InternalHale.g:3371:1: rule__While__Group__0 : rule__While__Group__0__Impl rule__While__Group__1 ;
    public final void rule__While__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3375:1: ( rule__While__Group__0__Impl rule__While__Group__1 )
            // InternalHale.g:3376:2: rule__While__Group__0__Impl rule__While__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__While__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__While__Group__1();

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
    // $ANTLR end "rule__While__Group__0"


    // $ANTLR start "rule__While__Group__0__Impl"
    // InternalHale.g:3383:1: rule__While__Group__0__Impl : ( 'while' ) ;
    public final void rule__While__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3387:1: ( ( 'while' ) )
            // InternalHale.g:3388:1: ( 'while' )
            {
            // InternalHale.g:3388:1: ( 'while' )
            // InternalHale.g:3389:2: 'while'
            {
             before(grammarAccess.getWhileAccess().getWhileKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getWhileAccess().getWhileKeyword_0()); 

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
    // $ANTLR end "rule__While__Group__0__Impl"


    // $ANTLR start "rule__While__Group__1"
    // InternalHale.g:3398:1: rule__While__Group__1 : rule__While__Group__1__Impl rule__While__Group__2 ;
    public final void rule__While__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3402:1: ( rule__While__Group__1__Impl rule__While__Group__2 )
            // InternalHale.g:3403:2: rule__While__Group__1__Impl rule__While__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__While__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__While__Group__2();

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
    // $ANTLR end "rule__While__Group__1"


    // $ANTLR start "rule__While__Group__1__Impl"
    // InternalHale.g:3410:1: rule__While__Group__1__Impl : ( ( rule__While__ConditionAssignment_1 ) ) ;
    public final void rule__While__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3414:1: ( ( ( rule__While__ConditionAssignment_1 ) ) )
            // InternalHale.g:3415:1: ( ( rule__While__ConditionAssignment_1 ) )
            {
            // InternalHale.g:3415:1: ( ( rule__While__ConditionAssignment_1 ) )
            // InternalHale.g:3416:2: ( rule__While__ConditionAssignment_1 )
            {
             before(grammarAccess.getWhileAccess().getConditionAssignment_1()); 
            // InternalHale.g:3417:2: ( rule__While__ConditionAssignment_1 )
            // InternalHale.g:3417:3: rule__While__ConditionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__While__ConditionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWhileAccess().getConditionAssignment_1()); 

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
    // $ANTLR end "rule__While__Group__1__Impl"


    // $ANTLR start "rule__While__Group__2"
    // InternalHale.g:3425:1: rule__While__Group__2 : rule__While__Group__2__Impl ;
    public final void rule__While__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3429:1: ( rule__While__Group__2__Impl )
            // InternalHale.g:3430:2: rule__While__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__While__Group__2__Impl();

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
    // $ANTLR end "rule__While__Group__2"


    // $ANTLR start "rule__While__Group__2__Impl"
    // InternalHale.g:3436:1: rule__While__Group__2__Impl : ( ( rule__While__BlockAssignment_2 ) ) ;
    public final void rule__While__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3440:1: ( ( ( rule__While__BlockAssignment_2 ) ) )
            // InternalHale.g:3441:1: ( ( rule__While__BlockAssignment_2 ) )
            {
            // InternalHale.g:3441:1: ( ( rule__While__BlockAssignment_2 ) )
            // InternalHale.g:3442:2: ( rule__While__BlockAssignment_2 )
            {
             before(grammarAccess.getWhileAccess().getBlockAssignment_2()); 
            // InternalHale.g:3443:2: ( rule__While__BlockAssignment_2 )
            // InternalHale.g:3443:3: rule__While__BlockAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__While__BlockAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWhileAccess().getBlockAssignment_2()); 

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
    // $ANTLR end "rule__While__Group__2__Impl"


    // $ANTLR start "rule__Hale__BlockAssignment_1"
    // InternalHale.g:3452:1: rule__Hale__BlockAssignment_1 : ( ruleBlock ) ;
    public final void rule__Hale__BlockAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3456:1: ( ( ruleBlock ) )
            // InternalHale.g:3457:2: ( ruleBlock )
            {
            // InternalHale.g:3457:2: ( ruleBlock )
            // InternalHale.g:3458:3: ruleBlock
            {
             before(grammarAccess.getHaleAccess().getBlockBlockParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getHaleAccess().getBlockBlockParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Hale__BlockAssignment_1"


    // $ANTLR start "rule__Block__StatementsAssignment_1_0"
    // InternalHale.g:3467:1: rule__Block__StatementsAssignment_1_0 : ( ruleStatement ) ;
    public final void rule__Block__StatementsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3471:1: ( ( ruleStatement ) )
            // InternalHale.g:3472:2: ( ruleStatement )
            {
            // InternalHale.g:3472:2: ( ruleStatement )
            // InternalHale.g:3473:3: ruleStatement
            {
             before(grammarAccess.getBlockAccess().getStatementsStatementParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getBlockAccess().getStatementsStatementParserRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__Block__StatementsAssignment_1_0"


    // $ANTLR start "rule__Expression7__RightAssignment_1_0_2"
    // InternalHale.g:3482:1: rule__Expression7__RightAssignment_1_0_2 : ( ruleExpression6 ) ;
    public final void rule__Expression7__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3486:1: ( ( ruleExpression6 ) )
            // InternalHale.g:3487:2: ( ruleExpression6 )
            {
            // InternalHale.g:3487:2: ( ruleExpression6 )
            // InternalHale.g:3488:3: ruleExpression6
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
    // InternalHale.g:3497:1: rule__Expression7__RightAssignment_1_1_2 : ( ruleExpression6 ) ;
    public final void rule__Expression7__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3501:1: ( ( ruleExpression6 ) )
            // InternalHale.g:3502:2: ( ruleExpression6 )
            {
            // InternalHale.g:3502:2: ( ruleExpression6 )
            // InternalHale.g:3503:3: ruleExpression6
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
    // InternalHale.g:3512:1: rule__Expression6__RightAssignment_1_0_2 : ( ruleExpression5 ) ;
    public final void rule__Expression6__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3516:1: ( ( ruleExpression5 ) )
            // InternalHale.g:3517:2: ( ruleExpression5 )
            {
            // InternalHale.g:3517:2: ( ruleExpression5 )
            // InternalHale.g:3518:3: ruleExpression5
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
    // InternalHale.g:3527:1: rule__Expression6__RightAssignment_1_1_2 : ( ruleExpression5 ) ;
    public final void rule__Expression6__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3531:1: ( ( ruleExpression5 ) )
            // InternalHale.g:3532:2: ( ruleExpression5 )
            {
            // InternalHale.g:3532:2: ( ruleExpression5 )
            // InternalHale.g:3533:3: ruleExpression5
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
    // InternalHale.g:3542:1: rule__Expression5__RightAssignment_1_0_2 : ( ruleExpression4 ) ;
    public final void rule__Expression5__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3546:1: ( ( ruleExpression4 ) )
            // InternalHale.g:3547:2: ( ruleExpression4 )
            {
            // InternalHale.g:3547:2: ( ruleExpression4 )
            // InternalHale.g:3548:3: ruleExpression4
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
    // InternalHale.g:3557:1: rule__Expression5__RightAssignment_1_1_2 : ( ruleExpression4 ) ;
    public final void rule__Expression5__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3561:1: ( ( ruleExpression4 ) )
            // InternalHale.g:3562:2: ( ruleExpression4 )
            {
            // InternalHale.g:3562:2: ( ruleExpression4 )
            // InternalHale.g:3563:3: ruleExpression4
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
    // InternalHale.g:3572:1: rule__Expression5__RightAssignment_1_2_2 : ( ruleExpression4 ) ;
    public final void rule__Expression5__RightAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3576:1: ( ( ruleExpression4 ) )
            // InternalHale.g:3577:2: ( ruleExpression4 )
            {
            // InternalHale.g:3577:2: ( ruleExpression4 )
            // InternalHale.g:3578:3: ruleExpression4
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
    // InternalHale.g:3587:1: rule__Expression5__RightAssignment_1_3_2 : ( ruleExpression4 ) ;
    public final void rule__Expression5__RightAssignment_1_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3591:1: ( ( ruleExpression4 ) )
            // InternalHale.g:3592:2: ( ruleExpression4 )
            {
            // InternalHale.g:3592:2: ( ruleExpression4 )
            // InternalHale.g:3593:3: ruleExpression4
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
    // InternalHale.g:3602:1: rule__Expression4__RightAssignment_1_0_2 : ( ruleExpression3 ) ;
    public final void rule__Expression4__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3606:1: ( ( ruleExpression3 ) )
            // InternalHale.g:3607:2: ( ruleExpression3 )
            {
            // InternalHale.g:3607:2: ( ruleExpression3 )
            // InternalHale.g:3608:3: ruleExpression3
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
    // InternalHale.g:3617:1: rule__Expression4__RightAssignment_1_1_2 : ( ruleExpression3 ) ;
    public final void rule__Expression4__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3621:1: ( ( ruleExpression3 ) )
            // InternalHale.g:3622:2: ( ruleExpression3 )
            {
            // InternalHale.g:3622:2: ( ruleExpression3 )
            // InternalHale.g:3623:3: ruleExpression3
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
    // InternalHale.g:3632:1: rule__Expression3__RightAssignment_1_0_2 : ( ruleExpression2 ) ;
    public final void rule__Expression3__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3636:1: ( ( ruleExpression2 ) )
            // InternalHale.g:3637:2: ( ruleExpression2 )
            {
            // InternalHale.g:3637:2: ( ruleExpression2 )
            // InternalHale.g:3638:3: ruleExpression2
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
    // InternalHale.g:3647:1: rule__Expression3__RightAssignment_1_1_2 : ( ruleExpression2 ) ;
    public final void rule__Expression3__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3651:1: ( ( ruleExpression2 ) )
            // InternalHale.g:3652:2: ( ruleExpression2 )
            {
            // InternalHale.g:3652:2: ( ruleExpression2 )
            // InternalHale.g:3653:3: ruleExpression2
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
    // InternalHale.g:3662:1: rule__Expression3__RightAssignment_1_2_2 : ( ruleExpression2 ) ;
    public final void rule__Expression3__RightAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3666:1: ( ( ruleExpression2 ) )
            // InternalHale.g:3667:2: ( ruleExpression2 )
            {
            // InternalHale.g:3667:2: ( ruleExpression2 )
            // InternalHale.g:3668:3: ruleExpression2
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
    // InternalHale.g:3677:1: rule__Expression2__RightAssignment_1_2 : ( ruleExpression1 ) ;
    public final void rule__Expression2__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3681:1: ( ( ruleExpression1 ) )
            // InternalHale.g:3682:2: ( ruleExpression1 )
            {
            // InternalHale.g:3682:2: ( ruleExpression1 )
            // InternalHale.g:3683:3: ruleExpression1
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
    // InternalHale.g:3692:1: rule__Expression1__InnerAssignment_0_2 : ( ruleExpression1 ) ;
    public final void rule__Expression1__InnerAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3696:1: ( ( ruleExpression1 ) )
            // InternalHale.g:3697:2: ( ruleExpression1 )
            {
            // InternalHale.g:3697:2: ( ruleExpression1 )
            // InternalHale.g:3698:3: ruleExpression1
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
    // InternalHale.g:3707:1: rule__Expression1__InnerAssignment_1_2 : ( ruleExpression1 ) ;
    public final void rule__Expression1__InnerAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3711:1: ( ( ruleExpression1 ) )
            // InternalHale.g:3712:2: ( ruleExpression1 )
            {
            // InternalHale.g:3712:2: ( ruleExpression1 )
            // InternalHale.g:3713:3: ruleExpression1
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
    // InternalHale.g:3722:1: rule__NumberLiteral__ValueAssignment : ( RULE_DOUBLE ) ;
    public final void rule__NumberLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3726:1: ( ( RULE_DOUBLE ) )
            // InternalHale.g:3727:2: ( RULE_DOUBLE )
            {
            // InternalHale.g:3727:2: ( RULE_DOUBLE )
            // InternalHale.g:3728:3: RULE_DOUBLE
            {
             before(grammarAccess.getNumberLiteralAccess().getValueDOUBLETerminalRuleCall_0()); 
            match(input,RULE_DOUBLE,FOLLOW_2); 
             after(grammarAccess.getNumberLiteralAccess().getValueDOUBLETerminalRuleCall_0()); 

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
    // InternalHale.g:3737:1: rule__StringLiteral__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3741:1: ( ( RULE_STRING ) )
            // InternalHale.g:3742:2: ( RULE_STRING )
            {
            // InternalHale.g:3742:2: ( RULE_STRING )
            // InternalHale.g:3743:3: RULE_STRING
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


    // $ANTLR start "rule__Binding__MutableAssignment_1"
    // InternalHale.g:3752:1: rule__Binding__MutableAssignment_1 : ( ( 'mut' ) ) ;
    public final void rule__Binding__MutableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3756:1: ( ( ( 'mut' ) ) )
            // InternalHale.g:3757:2: ( ( 'mut' ) )
            {
            // InternalHale.g:3757:2: ( ( 'mut' ) )
            // InternalHale.g:3758:3: ( 'mut' )
            {
             before(grammarAccess.getBindingAccess().getMutableMutKeyword_1_0()); 
            // InternalHale.g:3759:3: ( 'mut' )
            // InternalHale.g:3760:4: 'mut'
            {
             before(grammarAccess.getBindingAccess().getMutableMutKeyword_1_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalHale.g:3771:1: rule__Binding__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Binding__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3775:1: ( ( RULE_ID ) )
            // InternalHale.g:3776:2: ( RULE_ID )
            {
            // InternalHale.g:3776:2: ( RULE_ID )
            // InternalHale.g:3777:3: RULE_ID
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


    // $ANTLR start "rule__Binding__ExpressionAssignment_4"
    // InternalHale.g:3786:1: rule__Binding__ExpressionAssignment_4 : ( ruleExpression ) ;
    public final void rule__Binding__ExpressionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3790:1: ( ( ruleExpression ) )
            // InternalHale.g:3791:2: ( ruleExpression )
            {
            // InternalHale.g:3791:2: ( ruleExpression )
            // InternalHale.g:3792:3: ruleExpression
            {
             before(grammarAccess.getBindingAccess().getExpressionExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getBindingAccess().getExpressionExpressionParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Binding__ExpressionAssignment_4"


    // $ANTLR start "rule__BindingReference__BindingAssignment"
    // InternalHale.g:3801:1: rule__BindingReference__BindingAssignment : ( ( RULE_ID ) ) ;
    public final void rule__BindingReference__BindingAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3805:1: ( ( ( RULE_ID ) ) )
            // InternalHale.g:3806:2: ( ( RULE_ID ) )
            {
            // InternalHale.g:3806:2: ( ( RULE_ID ) )
            // InternalHale.g:3807:3: ( RULE_ID )
            {
             before(grammarAccess.getBindingReferenceAccess().getBindingBindingCrossReference_0()); 
            // InternalHale.g:3808:3: ( RULE_ID )
            // InternalHale.g:3809:4: RULE_ID
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
    // InternalHale.g:3820:1: rule__Assignment__BindingAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Assignment__BindingAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3824:1: ( ( ( RULE_ID ) ) )
            // InternalHale.g:3825:2: ( ( RULE_ID ) )
            {
            // InternalHale.g:3825:2: ( ( RULE_ID ) )
            // InternalHale.g:3826:3: ( RULE_ID )
            {
             before(grammarAccess.getAssignmentAccess().getBindingBindingCrossReference_0_0()); 
            // InternalHale.g:3827:3: ( RULE_ID )
            // InternalHale.g:3828:4: RULE_ID
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


    // $ANTLR start "rule__Assignment__ExpressionAssignment_2"
    // InternalHale.g:3839:1: rule__Assignment__ExpressionAssignment_2 : ( ruleExpression ) ;
    public final void rule__Assignment__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3843:1: ( ( ruleExpression ) )
            // InternalHale.g:3844:2: ( ruleExpression )
            {
            // InternalHale.g:3844:2: ( ruleExpression )
            // InternalHale.g:3845:3: ruleExpression
            {
             before(grammarAccess.getAssignmentAccess().getExpressionExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getAssignmentAccess().getExpressionExpressionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Assignment__ExpressionAssignment_2"


    // $ANTLR start "rule__Print__ExpressionAssignment_1"
    // InternalHale.g:3854:1: rule__Print__ExpressionAssignment_1 : ( ruleExpression ) ;
    public final void rule__Print__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3858:1: ( ( ruleExpression ) )
            // InternalHale.g:3859:2: ( ruleExpression )
            {
            // InternalHale.g:3859:2: ( ruleExpression )
            // InternalHale.g:3860:3: ruleExpression
            {
             before(grammarAccess.getPrintAccess().getExpressionExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getPrintAccess().getExpressionExpressionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Print__ExpressionAssignment_1"


    // $ANTLR start "rule__If__ConditionsAssignment_1"
    // InternalHale.g:3869:1: rule__If__ConditionsAssignment_1 : ( ruleExpression ) ;
    public final void rule__If__ConditionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3873:1: ( ( ruleExpression ) )
            // InternalHale.g:3874:2: ( ruleExpression )
            {
            // InternalHale.g:3874:2: ( ruleExpression )
            // InternalHale.g:3875:3: ruleExpression
            {
             before(grammarAccess.getIfAccess().getConditionsExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getIfAccess().getConditionsExpressionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__If__ConditionsAssignment_1"


    // $ANTLR start "rule__If__IfBlocksAssignment_2"
    // InternalHale.g:3884:1: rule__If__IfBlocksAssignment_2 : ( ruleBracedBlock ) ;
    public final void rule__If__IfBlocksAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3888:1: ( ( ruleBracedBlock ) )
            // InternalHale.g:3889:2: ( ruleBracedBlock )
            {
            // InternalHale.g:3889:2: ( ruleBracedBlock )
            // InternalHale.g:3890:3: ruleBracedBlock
            {
             before(grammarAccess.getIfAccess().getIfBlocksBracedBlockParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBracedBlock();

            state._fsp--;

             after(grammarAccess.getIfAccess().getIfBlocksBracedBlockParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__If__IfBlocksAssignment_2"


    // $ANTLR start "rule__If__ConditionsAssignment_3_1"
    // InternalHale.g:3899:1: rule__If__ConditionsAssignment_3_1 : ( ruleExpression ) ;
    public final void rule__If__ConditionsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3903:1: ( ( ruleExpression ) )
            // InternalHale.g:3904:2: ( ruleExpression )
            {
            // InternalHale.g:3904:2: ( ruleExpression )
            // InternalHale.g:3905:3: ruleExpression
            {
             before(grammarAccess.getIfAccess().getConditionsExpressionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getIfAccess().getConditionsExpressionParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__If__ConditionsAssignment_3_1"


    // $ANTLR start "rule__If__IfBlocksAssignment_3_2"
    // InternalHale.g:3914:1: rule__If__IfBlocksAssignment_3_2 : ( ruleBracedBlock ) ;
    public final void rule__If__IfBlocksAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3918:1: ( ( ruleBracedBlock ) )
            // InternalHale.g:3919:2: ( ruleBracedBlock )
            {
            // InternalHale.g:3919:2: ( ruleBracedBlock )
            // InternalHale.g:3920:3: ruleBracedBlock
            {
             before(grammarAccess.getIfAccess().getIfBlocksBracedBlockParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBracedBlock();

            state._fsp--;

             after(grammarAccess.getIfAccess().getIfBlocksBracedBlockParserRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__If__IfBlocksAssignment_3_2"


    // $ANTLR start "rule__If__ElseBlockAssignment_4_1"
    // InternalHale.g:3929:1: rule__If__ElseBlockAssignment_4_1 : ( ruleBracedBlock ) ;
    public final void rule__If__ElseBlockAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3933:1: ( ( ruleBracedBlock ) )
            // InternalHale.g:3934:2: ( ruleBracedBlock )
            {
            // InternalHale.g:3934:2: ( ruleBracedBlock )
            // InternalHale.g:3935:3: ruleBracedBlock
            {
             before(grammarAccess.getIfAccess().getElseBlockBracedBlockParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBracedBlock();

            state._fsp--;

             after(grammarAccess.getIfAccess().getElseBlockBracedBlockParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__If__ElseBlockAssignment_4_1"


    // $ANTLR start "rule__While__ConditionAssignment_1"
    // InternalHale.g:3944:1: rule__While__ConditionAssignment_1 : ( ruleExpression ) ;
    public final void rule__While__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3948:1: ( ( ruleExpression ) )
            // InternalHale.g:3949:2: ( ruleExpression )
            {
            // InternalHale.g:3949:2: ( ruleExpression )
            // InternalHale.g:3950:3: ruleExpression
            {
             before(grammarAccess.getWhileAccess().getConditionExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getWhileAccess().getConditionExpressionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__While__ConditionAssignment_1"


    // $ANTLR start "rule__While__BlockAssignment_2"
    // InternalHale.g:3959:1: rule__While__BlockAssignment_2 : ( ruleBracedBlock ) ;
    public final void rule__While__BlockAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3963:1: ( ( ruleBracedBlock ) )
            // InternalHale.g:3964:2: ( ruleBracedBlock )
            {
            // InternalHale.g:3964:2: ( ruleBracedBlock )
            // InternalHale.g:3965:3: ruleBracedBlock
            {
             before(grammarAccess.getWhileAccess().getBlockBracedBlockParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBracedBlock();

            state._fsp--;

             after(grammarAccess.getWhileAccess().getBlockBracedBlockParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__While__BlockAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000001358400C70L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000001358400C72L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000001358400870L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000001E0000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000001E0002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000003800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000003800002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002000000040L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000400000002L});

}