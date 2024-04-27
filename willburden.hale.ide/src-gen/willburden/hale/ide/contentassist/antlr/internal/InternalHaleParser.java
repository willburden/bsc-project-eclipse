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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'and'", "'or'", "'=='", "'!='", "'<='", "'<'", "'>='", "'>'", "'+'", "'-'", "'*'", "'/'", "'%'", "'**'", "'not'", "'('", "')'", "'let'", "'='", "'print'", "'if'", "'elseif'", "'else'", "'{'", "'}'", "'mut'"
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


    // $ANTLR start "entryRuleExpression"
    // InternalHale.g:128:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalHale.g:129:1: ( ruleExpression EOF )
            // InternalHale.g:130:1: ruleExpression EOF
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
    // InternalHale.g:137:1: ruleExpression : ( ruleExpression7 ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:141:2: ( ( ruleExpression7 ) )
            // InternalHale.g:142:2: ( ruleExpression7 )
            {
            // InternalHale.g:142:2: ( ruleExpression7 )
            // InternalHale.g:143:3: ruleExpression7
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
    // InternalHale.g:153:1: entryRuleExpression7 : ruleExpression7 EOF ;
    public final void entryRuleExpression7() throws RecognitionException {
        try {
            // InternalHale.g:154:1: ( ruleExpression7 EOF )
            // InternalHale.g:155:1: ruleExpression7 EOF
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
    // InternalHale.g:162:1: ruleExpression7 : ( ( rule__Expression7__Group__0 ) ) ;
    public final void ruleExpression7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:166:2: ( ( ( rule__Expression7__Group__0 ) ) )
            // InternalHale.g:167:2: ( ( rule__Expression7__Group__0 ) )
            {
            // InternalHale.g:167:2: ( ( rule__Expression7__Group__0 ) )
            // InternalHale.g:168:3: ( rule__Expression7__Group__0 )
            {
             before(grammarAccess.getExpression7Access().getGroup()); 
            // InternalHale.g:169:3: ( rule__Expression7__Group__0 )
            // InternalHale.g:169:4: rule__Expression7__Group__0
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
    // InternalHale.g:178:1: entryRuleExpression6 : ruleExpression6 EOF ;
    public final void entryRuleExpression6() throws RecognitionException {
        try {
            // InternalHale.g:179:1: ( ruleExpression6 EOF )
            // InternalHale.g:180:1: ruleExpression6 EOF
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
    // InternalHale.g:187:1: ruleExpression6 : ( ( rule__Expression6__Group__0 ) ) ;
    public final void ruleExpression6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:191:2: ( ( ( rule__Expression6__Group__0 ) ) )
            // InternalHale.g:192:2: ( ( rule__Expression6__Group__0 ) )
            {
            // InternalHale.g:192:2: ( ( rule__Expression6__Group__0 ) )
            // InternalHale.g:193:3: ( rule__Expression6__Group__0 )
            {
             before(grammarAccess.getExpression6Access().getGroup()); 
            // InternalHale.g:194:3: ( rule__Expression6__Group__0 )
            // InternalHale.g:194:4: rule__Expression6__Group__0
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
    // InternalHale.g:203:1: entryRuleExpression5 : ruleExpression5 EOF ;
    public final void entryRuleExpression5() throws RecognitionException {
        try {
            // InternalHale.g:204:1: ( ruleExpression5 EOF )
            // InternalHale.g:205:1: ruleExpression5 EOF
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
    // InternalHale.g:212:1: ruleExpression5 : ( ( rule__Expression5__Group__0 ) ) ;
    public final void ruleExpression5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:216:2: ( ( ( rule__Expression5__Group__0 ) ) )
            // InternalHale.g:217:2: ( ( rule__Expression5__Group__0 ) )
            {
            // InternalHale.g:217:2: ( ( rule__Expression5__Group__0 ) )
            // InternalHale.g:218:3: ( rule__Expression5__Group__0 )
            {
             before(grammarAccess.getExpression5Access().getGroup()); 
            // InternalHale.g:219:3: ( rule__Expression5__Group__0 )
            // InternalHale.g:219:4: rule__Expression5__Group__0
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
    // InternalHale.g:228:1: entryRuleExpression4 : ruleExpression4 EOF ;
    public final void entryRuleExpression4() throws RecognitionException {
        try {
            // InternalHale.g:229:1: ( ruleExpression4 EOF )
            // InternalHale.g:230:1: ruleExpression4 EOF
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
    // InternalHale.g:237:1: ruleExpression4 : ( ( rule__Expression4__Group__0 ) ) ;
    public final void ruleExpression4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:241:2: ( ( ( rule__Expression4__Group__0 ) ) )
            // InternalHale.g:242:2: ( ( rule__Expression4__Group__0 ) )
            {
            // InternalHale.g:242:2: ( ( rule__Expression4__Group__0 ) )
            // InternalHale.g:243:3: ( rule__Expression4__Group__0 )
            {
             before(grammarAccess.getExpression4Access().getGroup()); 
            // InternalHale.g:244:3: ( rule__Expression4__Group__0 )
            // InternalHale.g:244:4: rule__Expression4__Group__0
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
    // InternalHale.g:253:1: entryRuleExpression3 : ruleExpression3 EOF ;
    public final void entryRuleExpression3() throws RecognitionException {
        try {
            // InternalHale.g:254:1: ( ruleExpression3 EOF )
            // InternalHale.g:255:1: ruleExpression3 EOF
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
    // InternalHale.g:262:1: ruleExpression3 : ( ( rule__Expression3__Group__0 ) ) ;
    public final void ruleExpression3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:266:2: ( ( ( rule__Expression3__Group__0 ) ) )
            // InternalHale.g:267:2: ( ( rule__Expression3__Group__0 ) )
            {
            // InternalHale.g:267:2: ( ( rule__Expression3__Group__0 ) )
            // InternalHale.g:268:3: ( rule__Expression3__Group__0 )
            {
             before(grammarAccess.getExpression3Access().getGroup()); 
            // InternalHale.g:269:3: ( rule__Expression3__Group__0 )
            // InternalHale.g:269:4: rule__Expression3__Group__0
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
    // InternalHale.g:278:1: entryRuleExpression2 : ruleExpression2 EOF ;
    public final void entryRuleExpression2() throws RecognitionException {
        try {
            // InternalHale.g:279:1: ( ruleExpression2 EOF )
            // InternalHale.g:280:1: ruleExpression2 EOF
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
    // InternalHale.g:287:1: ruleExpression2 : ( ( rule__Expression2__Group__0 ) ) ;
    public final void ruleExpression2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:291:2: ( ( ( rule__Expression2__Group__0 ) ) )
            // InternalHale.g:292:2: ( ( rule__Expression2__Group__0 ) )
            {
            // InternalHale.g:292:2: ( ( rule__Expression2__Group__0 ) )
            // InternalHale.g:293:3: ( rule__Expression2__Group__0 )
            {
             before(grammarAccess.getExpression2Access().getGroup()); 
            // InternalHale.g:294:3: ( rule__Expression2__Group__0 )
            // InternalHale.g:294:4: rule__Expression2__Group__0
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
    // InternalHale.g:303:1: entryRuleExpression1 : ruleExpression1 EOF ;
    public final void entryRuleExpression1() throws RecognitionException {
        try {
            // InternalHale.g:304:1: ( ruleExpression1 EOF )
            // InternalHale.g:305:1: ruleExpression1 EOF
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
    // InternalHale.g:312:1: ruleExpression1 : ( ( rule__Expression1__Alternatives ) ) ;
    public final void ruleExpression1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:316:2: ( ( ( rule__Expression1__Alternatives ) ) )
            // InternalHale.g:317:2: ( ( rule__Expression1__Alternatives ) )
            {
            // InternalHale.g:317:2: ( ( rule__Expression1__Alternatives ) )
            // InternalHale.g:318:3: ( rule__Expression1__Alternatives )
            {
             before(grammarAccess.getExpression1Access().getAlternatives()); 
            // InternalHale.g:319:3: ( rule__Expression1__Alternatives )
            // InternalHale.g:319:4: rule__Expression1__Alternatives
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
    // InternalHale.g:328:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalHale.g:329:1: ( rulePrimary EOF )
            // InternalHale.g:330:1: rulePrimary EOF
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
    // InternalHale.g:337:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:341:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalHale.g:342:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalHale.g:342:2: ( ( rule__Primary__Alternatives ) )
            // InternalHale.g:343:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalHale.g:344:3: ( rule__Primary__Alternatives )
            // InternalHale.g:344:4: rule__Primary__Alternatives
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
    // InternalHale.g:353:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // InternalHale.g:354:1: ( ruleLiteral EOF )
            // InternalHale.g:355:1: ruleLiteral EOF
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
    // InternalHale.g:362:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:366:2: ( ( ( rule__Literal__Alternatives ) ) )
            // InternalHale.g:367:2: ( ( rule__Literal__Alternatives ) )
            {
            // InternalHale.g:367:2: ( ( rule__Literal__Alternatives ) )
            // InternalHale.g:368:3: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // InternalHale.g:369:3: ( rule__Literal__Alternatives )
            // InternalHale.g:369:4: rule__Literal__Alternatives
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
    // InternalHale.g:378:1: entryRuleNumberLiteral : ruleNumberLiteral EOF ;
    public final void entryRuleNumberLiteral() throws RecognitionException {
        try {
            // InternalHale.g:379:1: ( ruleNumberLiteral EOF )
            // InternalHale.g:380:1: ruleNumberLiteral EOF
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
    // InternalHale.g:387:1: ruleNumberLiteral : ( ( rule__NumberLiteral__ValueAssignment ) ) ;
    public final void ruleNumberLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:391:2: ( ( ( rule__NumberLiteral__ValueAssignment ) ) )
            // InternalHale.g:392:2: ( ( rule__NumberLiteral__ValueAssignment ) )
            {
            // InternalHale.g:392:2: ( ( rule__NumberLiteral__ValueAssignment ) )
            // InternalHale.g:393:3: ( rule__NumberLiteral__ValueAssignment )
            {
             before(grammarAccess.getNumberLiteralAccess().getValueAssignment()); 
            // InternalHale.g:394:3: ( rule__NumberLiteral__ValueAssignment )
            // InternalHale.g:394:4: rule__NumberLiteral__ValueAssignment
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
    // InternalHale.g:403:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // InternalHale.g:404:1: ( ruleStringLiteral EOF )
            // InternalHale.g:405:1: ruleStringLiteral EOF
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
    // InternalHale.g:412:1: ruleStringLiteral : ( ( rule__StringLiteral__ValueAssignment ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:416:2: ( ( ( rule__StringLiteral__ValueAssignment ) ) )
            // InternalHale.g:417:2: ( ( rule__StringLiteral__ValueAssignment ) )
            {
            // InternalHale.g:417:2: ( ( rule__StringLiteral__ValueAssignment ) )
            // InternalHale.g:418:3: ( rule__StringLiteral__ValueAssignment )
            {
             before(grammarAccess.getStringLiteralAccess().getValueAssignment()); 
            // InternalHale.g:419:3: ( rule__StringLiteral__ValueAssignment )
            // InternalHale.g:419:4: rule__StringLiteral__ValueAssignment
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
    // InternalHale.g:428:1: entryRuleBinding : ruleBinding EOF ;
    public final void entryRuleBinding() throws RecognitionException {
        try {
            // InternalHale.g:429:1: ( ruleBinding EOF )
            // InternalHale.g:430:1: ruleBinding EOF
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
    // InternalHale.g:437:1: ruleBinding : ( ( rule__Binding__Group__0 ) ) ;
    public final void ruleBinding() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:441:2: ( ( ( rule__Binding__Group__0 ) ) )
            // InternalHale.g:442:2: ( ( rule__Binding__Group__0 ) )
            {
            // InternalHale.g:442:2: ( ( rule__Binding__Group__0 ) )
            // InternalHale.g:443:3: ( rule__Binding__Group__0 )
            {
             before(grammarAccess.getBindingAccess().getGroup()); 
            // InternalHale.g:444:3: ( rule__Binding__Group__0 )
            // InternalHale.g:444:4: rule__Binding__Group__0
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
    // InternalHale.g:453:1: entryRuleBindingReference : ruleBindingReference EOF ;
    public final void entryRuleBindingReference() throws RecognitionException {
        try {
            // InternalHale.g:454:1: ( ruleBindingReference EOF )
            // InternalHale.g:455:1: ruleBindingReference EOF
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
    // InternalHale.g:462:1: ruleBindingReference : ( ( rule__BindingReference__BindingAssignment ) ) ;
    public final void ruleBindingReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:466:2: ( ( ( rule__BindingReference__BindingAssignment ) ) )
            // InternalHale.g:467:2: ( ( rule__BindingReference__BindingAssignment ) )
            {
            // InternalHale.g:467:2: ( ( rule__BindingReference__BindingAssignment ) )
            // InternalHale.g:468:3: ( rule__BindingReference__BindingAssignment )
            {
             before(grammarAccess.getBindingReferenceAccess().getBindingAssignment()); 
            // InternalHale.g:469:3: ( rule__BindingReference__BindingAssignment )
            // InternalHale.g:469:4: rule__BindingReference__BindingAssignment
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
    // InternalHale.g:478:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // InternalHale.g:479:1: ( ruleAssignment EOF )
            // InternalHale.g:480:1: ruleAssignment EOF
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
    // InternalHale.g:487:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:491:2: ( ( ( rule__Assignment__Group__0 ) ) )
            // InternalHale.g:492:2: ( ( rule__Assignment__Group__0 ) )
            {
            // InternalHale.g:492:2: ( ( rule__Assignment__Group__0 ) )
            // InternalHale.g:493:3: ( rule__Assignment__Group__0 )
            {
             before(grammarAccess.getAssignmentAccess().getGroup()); 
            // InternalHale.g:494:3: ( rule__Assignment__Group__0 )
            // InternalHale.g:494:4: rule__Assignment__Group__0
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
    // InternalHale.g:503:1: entryRulePrint : rulePrint EOF ;
    public final void entryRulePrint() throws RecognitionException {
        try {
            // InternalHale.g:504:1: ( rulePrint EOF )
            // InternalHale.g:505:1: rulePrint EOF
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
    // InternalHale.g:512:1: rulePrint : ( ( rule__Print__Group__0 ) ) ;
    public final void rulePrint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:516:2: ( ( ( rule__Print__Group__0 ) ) )
            // InternalHale.g:517:2: ( ( rule__Print__Group__0 ) )
            {
            // InternalHale.g:517:2: ( ( rule__Print__Group__0 ) )
            // InternalHale.g:518:3: ( rule__Print__Group__0 )
            {
             before(grammarAccess.getPrintAccess().getGroup()); 
            // InternalHale.g:519:3: ( rule__Print__Group__0 )
            // InternalHale.g:519:4: rule__Print__Group__0
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
    // InternalHale.g:528:1: entryRuleIf : ruleIf EOF ;
    public final void entryRuleIf() throws RecognitionException {
        try {
            // InternalHale.g:529:1: ( ruleIf EOF )
            // InternalHale.g:530:1: ruleIf EOF
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
    // InternalHale.g:537:1: ruleIf : ( ( rule__If__Group__0 ) ) ;
    public final void ruleIf() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:541:2: ( ( ( rule__If__Group__0 ) ) )
            // InternalHale.g:542:2: ( ( rule__If__Group__0 ) )
            {
            // InternalHale.g:542:2: ( ( rule__If__Group__0 ) )
            // InternalHale.g:543:3: ( rule__If__Group__0 )
            {
             before(grammarAccess.getIfAccess().getGroup()); 
            // InternalHale.g:544:3: ( rule__If__Group__0 )
            // InternalHale.g:544:4: rule__If__Group__0
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


    // $ANTLR start "entryRuleBracedBlock"
    // InternalHale.g:553:1: entryRuleBracedBlock : ruleBracedBlock EOF ;
    public final void entryRuleBracedBlock() throws RecognitionException {
        try {
            // InternalHale.g:554:1: ( ruleBracedBlock EOF )
            // InternalHale.g:555:1: ruleBracedBlock EOF
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
    // InternalHale.g:562:1: ruleBracedBlock : ( ( rule__BracedBlock__Group__0 ) ) ;
    public final void ruleBracedBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:566:2: ( ( ( rule__BracedBlock__Group__0 ) ) )
            // InternalHale.g:567:2: ( ( rule__BracedBlock__Group__0 ) )
            {
            // InternalHale.g:567:2: ( ( rule__BracedBlock__Group__0 ) )
            // InternalHale.g:568:3: ( rule__BracedBlock__Group__0 )
            {
             before(grammarAccess.getBracedBlockAccess().getGroup()); 
            // InternalHale.g:569:3: ( rule__BracedBlock__Group__0 )
            // InternalHale.g:569:4: rule__BracedBlock__Group__0
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


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalHale.g:577:1: rule__Statement__Alternatives : ( ( ( rule__Statement__Group_0__0 ) ) | ( ( rule__Statement__Group_1__0 ) ) | ( ruleIf ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:581:1: ( ( ( rule__Statement__Group_0__0 ) ) | ( ( rule__Statement__Group_1__0 ) ) | ( ruleIf ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case RULE_INT:
            case RULE_STRING:
            case RULE_ID:
            case 21:
            case 26:
            case 27:
            case 29:
            case 31:
                {
                alt1=2;
                }
                break;
            case 32:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalHale.g:582:2: ( ( rule__Statement__Group_0__0 ) )
                    {
                    // InternalHale.g:582:2: ( ( rule__Statement__Group_0__0 ) )
                    // InternalHale.g:583:3: ( rule__Statement__Group_0__0 )
                    {
                     before(grammarAccess.getStatementAccess().getGroup_0()); 
                    // InternalHale.g:584:3: ( rule__Statement__Group_0__0 )
                    // InternalHale.g:584:4: rule__Statement__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHale.g:588:2: ( ( rule__Statement__Group_1__0 ) )
                    {
                    // InternalHale.g:588:2: ( ( rule__Statement__Group_1__0 ) )
                    // InternalHale.g:589:3: ( rule__Statement__Group_1__0 )
                    {
                     before(grammarAccess.getStatementAccess().getGroup_1()); 
                    // InternalHale.g:590:3: ( rule__Statement__Group_1__0 )
                    // InternalHale.g:590:4: rule__Statement__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHale.g:594:2: ( ruleIf )
                    {
                    // InternalHale.g:594:2: ( ruleIf )
                    // InternalHale.g:595:3: ruleIf
                    {
                     before(grammarAccess.getStatementAccess().getIfParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleIf();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getIfParserRuleCall_2()); 

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


    // $ANTLR start "rule__Statement__Alternatives_1_0"
    // InternalHale.g:604:1: rule__Statement__Alternatives_1_0 : ( ( ruleExpression ) | ( ruleBinding ) | ( ruleAssignment ) | ( rulePrint ) );
    public final void rule__Statement__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:608:1: ( ( ruleExpression ) | ( ruleBinding ) | ( ruleAssignment ) | ( rulePrint ) )
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

                if ( ((LA2_2>=11 && LA2_2<=25)) ) {
                    alt2=1;
                }
                else if ( (LA2_2==30) ) {
                    alt2=3;
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
                    // InternalHale.g:609:2: ( ruleExpression )
                    {
                    // InternalHale.g:609:2: ( ruleExpression )
                    // InternalHale.g:610:3: ruleExpression
                    {
                     before(grammarAccess.getStatementAccess().getExpressionParserRuleCall_1_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleExpression();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getExpressionParserRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHale.g:615:2: ( ruleBinding )
                    {
                    // InternalHale.g:615:2: ( ruleBinding )
                    // InternalHale.g:616:3: ruleBinding
                    {
                     before(grammarAccess.getStatementAccess().getBindingParserRuleCall_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleBinding();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getBindingParserRuleCall_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHale.g:621:2: ( ruleAssignment )
                    {
                    // InternalHale.g:621:2: ( ruleAssignment )
                    // InternalHale.g:622:3: ruleAssignment
                    {
                     before(grammarAccess.getStatementAccess().getAssignmentParserRuleCall_1_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleAssignment();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getAssignmentParserRuleCall_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalHale.g:627:2: ( rulePrint )
                    {
                    // InternalHale.g:627:2: ( rulePrint )
                    // InternalHale.g:628:3: rulePrint
                    {
                     before(grammarAccess.getStatementAccess().getPrintParserRuleCall_1_0_3()); 
                    pushFollow(FOLLOW_2);
                    rulePrint();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getPrintParserRuleCall_1_0_3()); 

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
    // $ANTLR end "rule__Statement__Alternatives_1_0"


    // $ANTLR start "rule__Expression7__Alternatives_1"
    // InternalHale.g:637:1: rule__Expression7__Alternatives_1 : ( ( ( rule__Expression7__Group_1_0__0 ) ) | ( ( rule__Expression7__Group_1_1__0 ) ) );
    public final void rule__Expression7__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:641:1: ( ( ( rule__Expression7__Group_1_0__0 ) ) | ( ( rule__Expression7__Group_1_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            else if ( (LA3_0==13) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalHale.g:642:2: ( ( rule__Expression7__Group_1_0__0 ) )
                    {
                    // InternalHale.g:642:2: ( ( rule__Expression7__Group_1_0__0 ) )
                    // InternalHale.g:643:3: ( rule__Expression7__Group_1_0__0 )
                    {
                     before(grammarAccess.getExpression7Access().getGroup_1_0()); 
                    // InternalHale.g:644:3: ( rule__Expression7__Group_1_0__0 )
                    // InternalHale.g:644:4: rule__Expression7__Group_1_0__0
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
                    // InternalHale.g:648:2: ( ( rule__Expression7__Group_1_1__0 ) )
                    {
                    // InternalHale.g:648:2: ( ( rule__Expression7__Group_1_1__0 ) )
                    // InternalHale.g:649:3: ( rule__Expression7__Group_1_1__0 )
                    {
                     before(grammarAccess.getExpression7Access().getGroup_1_1()); 
                    // InternalHale.g:650:3: ( rule__Expression7__Group_1_1__0 )
                    // InternalHale.g:650:4: rule__Expression7__Group_1_1__0
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
    // InternalHale.g:658:1: rule__Expression6__Alternatives_1 : ( ( ( rule__Expression6__Group_1_0__0 ) ) | ( ( rule__Expression6__Group_1_1__0 ) ) );
    public final void rule__Expression6__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:662:1: ( ( ( rule__Expression6__Group_1_0__0 ) ) | ( ( rule__Expression6__Group_1_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            else if ( (LA4_0==15) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalHale.g:663:2: ( ( rule__Expression6__Group_1_0__0 ) )
                    {
                    // InternalHale.g:663:2: ( ( rule__Expression6__Group_1_0__0 ) )
                    // InternalHale.g:664:3: ( rule__Expression6__Group_1_0__0 )
                    {
                     before(grammarAccess.getExpression6Access().getGroup_1_0()); 
                    // InternalHale.g:665:3: ( rule__Expression6__Group_1_0__0 )
                    // InternalHale.g:665:4: rule__Expression6__Group_1_0__0
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
                    // InternalHale.g:669:2: ( ( rule__Expression6__Group_1_1__0 ) )
                    {
                    // InternalHale.g:669:2: ( ( rule__Expression6__Group_1_1__0 ) )
                    // InternalHale.g:670:3: ( rule__Expression6__Group_1_1__0 )
                    {
                     before(grammarAccess.getExpression6Access().getGroup_1_1()); 
                    // InternalHale.g:671:3: ( rule__Expression6__Group_1_1__0 )
                    // InternalHale.g:671:4: rule__Expression6__Group_1_1__0
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
    // InternalHale.g:679:1: rule__Expression5__Alternatives_1 : ( ( ( rule__Expression5__Group_1_0__0 ) ) | ( ( rule__Expression5__Group_1_1__0 ) ) | ( ( rule__Expression5__Group_1_2__0 ) ) | ( ( rule__Expression5__Group_1_3__0 ) ) );
    public final void rule__Expression5__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:683:1: ( ( ( rule__Expression5__Group_1_0__0 ) ) | ( ( rule__Expression5__Group_1_1__0 ) ) | ( ( rule__Expression5__Group_1_2__0 ) ) | ( ( rule__Expression5__Group_1_3__0 ) ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt5=1;
                }
                break;
            case 17:
                {
                alt5=2;
                }
                break;
            case 18:
                {
                alt5=3;
                }
                break;
            case 19:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalHale.g:684:2: ( ( rule__Expression5__Group_1_0__0 ) )
                    {
                    // InternalHale.g:684:2: ( ( rule__Expression5__Group_1_0__0 ) )
                    // InternalHale.g:685:3: ( rule__Expression5__Group_1_0__0 )
                    {
                     before(grammarAccess.getExpression5Access().getGroup_1_0()); 
                    // InternalHale.g:686:3: ( rule__Expression5__Group_1_0__0 )
                    // InternalHale.g:686:4: rule__Expression5__Group_1_0__0
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
                    // InternalHale.g:690:2: ( ( rule__Expression5__Group_1_1__0 ) )
                    {
                    // InternalHale.g:690:2: ( ( rule__Expression5__Group_1_1__0 ) )
                    // InternalHale.g:691:3: ( rule__Expression5__Group_1_1__0 )
                    {
                     before(grammarAccess.getExpression5Access().getGroup_1_1()); 
                    // InternalHale.g:692:3: ( rule__Expression5__Group_1_1__0 )
                    // InternalHale.g:692:4: rule__Expression5__Group_1_1__0
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
                    // InternalHale.g:696:2: ( ( rule__Expression5__Group_1_2__0 ) )
                    {
                    // InternalHale.g:696:2: ( ( rule__Expression5__Group_1_2__0 ) )
                    // InternalHale.g:697:3: ( rule__Expression5__Group_1_2__0 )
                    {
                     before(grammarAccess.getExpression5Access().getGroup_1_2()); 
                    // InternalHale.g:698:3: ( rule__Expression5__Group_1_2__0 )
                    // InternalHale.g:698:4: rule__Expression5__Group_1_2__0
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
                    // InternalHale.g:702:2: ( ( rule__Expression5__Group_1_3__0 ) )
                    {
                    // InternalHale.g:702:2: ( ( rule__Expression5__Group_1_3__0 ) )
                    // InternalHale.g:703:3: ( rule__Expression5__Group_1_3__0 )
                    {
                     before(grammarAccess.getExpression5Access().getGroup_1_3()); 
                    // InternalHale.g:704:3: ( rule__Expression5__Group_1_3__0 )
                    // InternalHale.g:704:4: rule__Expression5__Group_1_3__0
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
    // InternalHale.g:712:1: rule__Expression4__Alternatives_1 : ( ( ( rule__Expression4__Group_1_0__0 ) ) | ( ( rule__Expression4__Group_1_1__0 ) ) );
    public final void rule__Expression4__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:716:1: ( ( ( rule__Expression4__Group_1_0__0 ) ) | ( ( rule__Expression4__Group_1_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            else if ( (LA6_0==21) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalHale.g:717:2: ( ( rule__Expression4__Group_1_0__0 ) )
                    {
                    // InternalHale.g:717:2: ( ( rule__Expression4__Group_1_0__0 ) )
                    // InternalHale.g:718:3: ( rule__Expression4__Group_1_0__0 )
                    {
                     before(grammarAccess.getExpression4Access().getGroup_1_0()); 
                    // InternalHale.g:719:3: ( rule__Expression4__Group_1_0__0 )
                    // InternalHale.g:719:4: rule__Expression4__Group_1_0__0
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
                    // InternalHale.g:723:2: ( ( rule__Expression4__Group_1_1__0 ) )
                    {
                    // InternalHale.g:723:2: ( ( rule__Expression4__Group_1_1__0 ) )
                    // InternalHale.g:724:3: ( rule__Expression4__Group_1_1__0 )
                    {
                     before(grammarAccess.getExpression4Access().getGroup_1_1()); 
                    // InternalHale.g:725:3: ( rule__Expression4__Group_1_1__0 )
                    // InternalHale.g:725:4: rule__Expression4__Group_1_1__0
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
    // InternalHale.g:733:1: rule__Expression3__Alternatives_1 : ( ( ( rule__Expression3__Group_1_0__0 ) ) | ( ( rule__Expression3__Group_1_1__0 ) ) | ( ( rule__Expression3__Group_1_2__0 ) ) );
    public final void rule__Expression3__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:737:1: ( ( ( rule__Expression3__Group_1_0__0 ) ) | ( ( rule__Expression3__Group_1_1__0 ) ) | ( ( rule__Expression3__Group_1_2__0 ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt7=1;
                }
                break;
            case 23:
                {
                alt7=2;
                }
                break;
            case 24:
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
                    // InternalHale.g:738:2: ( ( rule__Expression3__Group_1_0__0 ) )
                    {
                    // InternalHale.g:738:2: ( ( rule__Expression3__Group_1_0__0 ) )
                    // InternalHale.g:739:3: ( rule__Expression3__Group_1_0__0 )
                    {
                     before(grammarAccess.getExpression3Access().getGroup_1_0()); 
                    // InternalHale.g:740:3: ( rule__Expression3__Group_1_0__0 )
                    // InternalHale.g:740:4: rule__Expression3__Group_1_0__0
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
                    // InternalHale.g:744:2: ( ( rule__Expression3__Group_1_1__0 ) )
                    {
                    // InternalHale.g:744:2: ( ( rule__Expression3__Group_1_1__0 ) )
                    // InternalHale.g:745:3: ( rule__Expression3__Group_1_1__0 )
                    {
                     before(grammarAccess.getExpression3Access().getGroup_1_1()); 
                    // InternalHale.g:746:3: ( rule__Expression3__Group_1_1__0 )
                    // InternalHale.g:746:4: rule__Expression3__Group_1_1__0
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
                    // InternalHale.g:750:2: ( ( rule__Expression3__Group_1_2__0 ) )
                    {
                    // InternalHale.g:750:2: ( ( rule__Expression3__Group_1_2__0 ) )
                    // InternalHale.g:751:3: ( rule__Expression3__Group_1_2__0 )
                    {
                     before(grammarAccess.getExpression3Access().getGroup_1_2()); 
                    // InternalHale.g:752:3: ( rule__Expression3__Group_1_2__0 )
                    // InternalHale.g:752:4: rule__Expression3__Group_1_2__0
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
    // InternalHale.g:760:1: rule__Expression1__Alternatives : ( ( ( rule__Expression1__Group_0__0 ) ) | ( ( rule__Expression1__Group_1__0 ) ) | ( rulePrimary ) );
    public final void rule__Expression1__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:764:1: ( ( ( rule__Expression1__Group_0__0 ) ) | ( ( rule__Expression1__Group_1__0 ) ) | ( rulePrimary ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt8=1;
                }
                break;
            case 26:
                {
                alt8=2;
                }
                break;
            case RULE_INT:
            case RULE_STRING:
            case RULE_ID:
            case 27:
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
                    // InternalHale.g:765:2: ( ( rule__Expression1__Group_0__0 ) )
                    {
                    // InternalHale.g:765:2: ( ( rule__Expression1__Group_0__0 ) )
                    // InternalHale.g:766:3: ( rule__Expression1__Group_0__0 )
                    {
                     before(grammarAccess.getExpression1Access().getGroup_0()); 
                    // InternalHale.g:767:3: ( rule__Expression1__Group_0__0 )
                    // InternalHale.g:767:4: rule__Expression1__Group_0__0
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
                    // InternalHale.g:771:2: ( ( rule__Expression1__Group_1__0 ) )
                    {
                    // InternalHale.g:771:2: ( ( rule__Expression1__Group_1__0 ) )
                    // InternalHale.g:772:3: ( rule__Expression1__Group_1__0 )
                    {
                     before(grammarAccess.getExpression1Access().getGroup_1()); 
                    // InternalHale.g:773:3: ( rule__Expression1__Group_1__0 )
                    // InternalHale.g:773:4: rule__Expression1__Group_1__0
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
                    // InternalHale.g:777:2: ( rulePrimary )
                    {
                    // InternalHale.g:777:2: ( rulePrimary )
                    // InternalHale.g:778:3: rulePrimary
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
    // InternalHale.g:787:1: rule__Primary__Alternatives : ( ( ruleLiteral ) | ( ruleBindingReference ) | ( ( rule__Primary__Group_2__0 ) ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:791:1: ( ( ruleLiteral ) | ( ruleBindingReference ) | ( ( rule__Primary__Group_2__0 ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_STRING:
                {
                alt9=1;
                }
                break;
            case RULE_ID:
                {
                alt9=2;
                }
                break;
            case 27:
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
                    // InternalHale.g:792:2: ( ruleLiteral )
                    {
                    // InternalHale.g:792:2: ( ruleLiteral )
                    // InternalHale.g:793:3: ruleLiteral
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
                    // InternalHale.g:798:2: ( ruleBindingReference )
                    {
                    // InternalHale.g:798:2: ( ruleBindingReference )
                    // InternalHale.g:799:3: ruleBindingReference
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
                    // InternalHale.g:804:2: ( ( rule__Primary__Group_2__0 ) )
                    {
                    // InternalHale.g:804:2: ( ( rule__Primary__Group_2__0 ) )
                    // InternalHale.g:805:3: ( rule__Primary__Group_2__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_2()); 
                    // InternalHale.g:806:3: ( rule__Primary__Group_2__0 )
                    // InternalHale.g:806:4: rule__Primary__Group_2__0
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
    // InternalHale.g:814:1: rule__Literal__Alternatives : ( ( ruleNumberLiteral ) | ( ruleStringLiteral ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:818:1: ( ( ruleNumberLiteral ) | ( ruleStringLiteral ) )
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
                    // InternalHale.g:819:2: ( ruleNumberLiteral )
                    {
                    // InternalHale.g:819:2: ( ruleNumberLiteral )
                    // InternalHale.g:820:3: ruleNumberLiteral
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
                    // InternalHale.g:825:2: ( ruleStringLiteral )
                    {
                    // InternalHale.g:825:2: ( ruleStringLiteral )
                    // InternalHale.g:826:3: ruleStringLiteral
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
    // InternalHale.g:835:1: rule__Hale__Group__0 : rule__Hale__Group__0__Impl rule__Hale__Group__1 ;
    public final void rule__Hale__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:839:1: ( rule__Hale__Group__0__Impl rule__Hale__Group__1 )
            // InternalHale.g:840:2: rule__Hale__Group__0__Impl rule__Hale__Group__1
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
    // InternalHale.g:847:1: rule__Hale__Group__0__Impl : ( () ) ;
    public final void rule__Hale__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:851:1: ( ( () ) )
            // InternalHale.g:852:1: ( () )
            {
            // InternalHale.g:852:1: ( () )
            // InternalHale.g:853:2: ()
            {
             before(grammarAccess.getHaleAccess().getHaleAction_0()); 
            // InternalHale.g:854:2: ()
            // InternalHale.g:854:3: 
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
    // InternalHale.g:862:1: rule__Hale__Group__1 : rule__Hale__Group__1__Impl ;
    public final void rule__Hale__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:866:1: ( rule__Hale__Group__1__Impl )
            // InternalHale.g:867:2: rule__Hale__Group__1__Impl
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
    // InternalHale.g:873:1: rule__Hale__Group__1__Impl : ( ( rule__Hale__BlockAssignment_1 ) ) ;
    public final void rule__Hale__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:877:1: ( ( ( rule__Hale__BlockAssignment_1 ) ) )
            // InternalHale.g:878:1: ( ( rule__Hale__BlockAssignment_1 ) )
            {
            // InternalHale.g:878:1: ( ( rule__Hale__BlockAssignment_1 ) )
            // InternalHale.g:879:2: ( rule__Hale__BlockAssignment_1 )
            {
             before(grammarAccess.getHaleAccess().getBlockAssignment_1()); 
            // InternalHale.g:880:2: ( rule__Hale__BlockAssignment_1 )
            // InternalHale.g:880:3: rule__Hale__BlockAssignment_1
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
    // InternalHale.g:889:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:893:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // InternalHale.g:894:2: rule__Block__Group__0__Impl rule__Block__Group__1
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
    // InternalHale.g:901:1: rule__Block__Group__0__Impl : ( () ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:905:1: ( ( () ) )
            // InternalHale.g:906:1: ( () )
            {
            // InternalHale.g:906:1: ( () )
            // InternalHale.g:907:2: ()
            {
             before(grammarAccess.getBlockAccess().getBlockAction_0()); 
            // InternalHale.g:908:2: ()
            // InternalHale.g:908:3: 
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
    // InternalHale.g:916:1: rule__Block__Group__1 : rule__Block__Group__1__Impl ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:920:1: ( rule__Block__Group__1__Impl )
            // InternalHale.g:921:2: rule__Block__Group__1__Impl
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
    // InternalHale.g:927:1: rule__Block__Group__1__Impl : ( ( rule__Block__StatementsAssignment_1 )* ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:931:1: ( ( ( rule__Block__StatementsAssignment_1 )* ) )
            // InternalHale.g:932:1: ( ( rule__Block__StatementsAssignment_1 )* )
            {
            // InternalHale.g:932:1: ( ( rule__Block__StatementsAssignment_1 )* )
            // InternalHale.g:933:2: ( rule__Block__StatementsAssignment_1 )*
            {
             before(grammarAccess.getBlockAccess().getStatementsAssignment_1()); 
            // InternalHale.g:934:2: ( rule__Block__StatementsAssignment_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_INT && LA11_0<=RULE_ID)||LA11_0==11||LA11_0==21||(LA11_0>=26 && LA11_0<=27)||LA11_0==29||(LA11_0>=31 && LA11_0<=32)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalHale.g:934:3: rule__Block__StatementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Block__StatementsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getBlockAccess().getStatementsAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Statement__Group_0__0"
    // InternalHale.g:943:1: rule__Statement__Group_0__0 : rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 ;
    public final void rule__Statement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:947:1: ( rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 )
            // InternalHale.g:948:2: rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1
            {
            pushFollow(FOLLOW_5);
            rule__Statement__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_0__1();

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
    // $ANTLR end "rule__Statement__Group_0__0"


    // $ANTLR start "rule__Statement__Group_0__0__Impl"
    // InternalHale.g:955:1: rule__Statement__Group_0__0__Impl : ( () ) ;
    public final void rule__Statement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:959:1: ( ( () ) )
            // InternalHale.g:960:1: ( () )
            {
            // InternalHale.g:960:1: ( () )
            // InternalHale.g:961:2: ()
            {
             before(grammarAccess.getStatementAccess().getEmptyStatementAction_0_0()); 
            // InternalHale.g:962:2: ()
            // InternalHale.g:962:3: 
            {
            }

             after(grammarAccess.getStatementAccess().getEmptyStatementAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_0__0__Impl"


    // $ANTLR start "rule__Statement__Group_0__1"
    // InternalHale.g:970:1: rule__Statement__Group_0__1 : rule__Statement__Group_0__1__Impl ;
    public final void rule__Statement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:974:1: ( rule__Statement__Group_0__1__Impl )
            // InternalHale.g:975:2: rule__Statement__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group_0__1__Impl();

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
    // $ANTLR end "rule__Statement__Group_0__1"


    // $ANTLR start "rule__Statement__Group_0__1__Impl"
    // InternalHale.g:981:1: rule__Statement__Group_0__1__Impl : ( ';' ) ;
    public final void rule__Statement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:985:1: ( ( ';' ) )
            // InternalHale.g:986:1: ( ';' )
            {
            // InternalHale.g:986:1: ( ';' )
            // InternalHale.g:987:2: ';'
            {
             before(grammarAccess.getStatementAccess().getSemicolonKeyword_0_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getSemicolonKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_0__1__Impl"


    // $ANTLR start "rule__Statement__Group_1__0"
    // InternalHale.g:997:1: rule__Statement__Group_1__0 : rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1 ;
    public final void rule__Statement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1001:1: ( rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1 )
            // InternalHale.g:1002:2: rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Statement__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_1__1();

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
    // $ANTLR end "rule__Statement__Group_1__0"


    // $ANTLR start "rule__Statement__Group_1__0__Impl"
    // InternalHale.g:1009:1: rule__Statement__Group_1__0__Impl : ( ( rule__Statement__Alternatives_1_0 ) ) ;
    public final void rule__Statement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1013:1: ( ( ( rule__Statement__Alternatives_1_0 ) ) )
            // InternalHale.g:1014:1: ( ( rule__Statement__Alternatives_1_0 ) )
            {
            // InternalHale.g:1014:1: ( ( rule__Statement__Alternatives_1_0 ) )
            // InternalHale.g:1015:2: ( rule__Statement__Alternatives_1_0 )
            {
             before(grammarAccess.getStatementAccess().getAlternatives_1_0()); 
            // InternalHale.g:1016:2: ( rule__Statement__Alternatives_1_0 )
            // InternalHale.g:1016:3: rule__Statement__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_1__0__Impl"


    // $ANTLR start "rule__Statement__Group_1__1"
    // InternalHale.g:1024:1: rule__Statement__Group_1__1 : rule__Statement__Group_1__1__Impl ;
    public final void rule__Statement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1028:1: ( rule__Statement__Group_1__1__Impl )
            // InternalHale.g:1029:2: rule__Statement__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group_1__1__Impl();

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
    // $ANTLR end "rule__Statement__Group_1__1"


    // $ANTLR start "rule__Statement__Group_1__1__Impl"
    // InternalHale.g:1035:1: rule__Statement__Group_1__1__Impl : ( ';' ) ;
    public final void rule__Statement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1039:1: ( ( ';' ) )
            // InternalHale.g:1040:1: ( ';' )
            {
            // InternalHale.g:1040:1: ( ';' )
            // InternalHale.g:1041:2: ';'
            {
             before(grammarAccess.getStatementAccess().getSemicolonKeyword_1_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getSemicolonKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_1__1__Impl"


    // $ANTLR start "rule__Expression7__Group__0"
    // InternalHale.g:1051:1: rule__Expression7__Group__0 : rule__Expression7__Group__0__Impl rule__Expression7__Group__1 ;
    public final void rule__Expression7__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1055:1: ( rule__Expression7__Group__0__Impl rule__Expression7__Group__1 )
            // InternalHale.g:1056:2: rule__Expression7__Group__0__Impl rule__Expression7__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalHale.g:1063:1: rule__Expression7__Group__0__Impl : ( ruleExpression6 ) ;
    public final void rule__Expression7__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1067:1: ( ( ruleExpression6 ) )
            // InternalHale.g:1068:1: ( ruleExpression6 )
            {
            // InternalHale.g:1068:1: ( ruleExpression6 )
            // InternalHale.g:1069:2: ruleExpression6
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
    // InternalHale.g:1078:1: rule__Expression7__Group__1 : rule__Expression7__Group__1__Impl ;
    public final void rule__Expression7__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1082:1: ( rule__Expression7__Group__1__Impl )
            // InternalHale.g:1083:2: rule__Expression7__Group__1__Impl
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
    // InternalHale.g:1089:1: rule__Expression7__Group__1__Impl : ( ( rule__Expression7__Alternatives_1 )* ) ;
    public final void rule__Expression7__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1093:1: ( ( ( rule__Expression7__Alternatives_1 )* ) )
            // InternalHale.g:1094:1: ( ( rule__Expression7__Alternatives_1 )* )
            {
            // InternalHale.g:1094:1: ( ( rule__Expression7__Alternatives_1 )* )
            // InternalHale.g:1095:2: ( rule__Expression7__Alternatives_1 )*
            {
             before(grammarAccess.getExpression7Access().getAlternatives_1()); 
            // InternalHale.g:1096:2: ( rule__Expression7__Alternatives_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=12 && LA12_0<=13)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalHale.g:1096:3: rule__Expression7__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_7);
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
    // InternalHale.g:1105:1: rule__Expression7__Group_1_0__0 : rule__Expression7__Group_1_0__0__Impl rule__Expression7__Group_1_0__1 ;
    public final void rule__Expression7__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1109:1: ( rule__Expression7__Group_1_0__0__Impl rule__Expression7__Group_1_0__1 )
            // InternalHale.g:1110:2: rule__Expression7__Group_1_0__0__Impl rule__Expression7__Group_1_0__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalHale.g:1117:1: rule__Expression7__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Expression7__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1121:1: ( ( () ) )
            // InternalHale.g:1122:1: ( () )
            {
            // InternalHale.g:1122:1: ( () )
            // InternalHale.g:1123:2: ()
            {
             before(grammarAccess.getExpression7Access().getLogicalAndLeftAction_1_0_0()); 
            // InternalHale.g:1124:2: ()
            // InternalHale.g:1124:3: 
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
    // InternalHale.g:1132:1: rule__Expression7__Group_1_0__1 : rule__Expression7__Group_1_0__1__Impl rule__Expression7__Group_1_0__2 ;
    public final void rule__Expression7__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1136:1: ( rule__Expression7__Group_1_0__1__Impl rule__Expression7__Group_1_0__2 )
            // InternalHale.g:1137:2: rule__Expression7__Group_1_0__1__Impl rule__Expression7__Group_1_0__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalHale.g:1144:1: rule__Expression7__Group_1_0__1__Impl : ( 'and' ) ;
    public final void rule__Expression7__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1148:1: ( ( 'and' ) )
            // InternalHale.g:1149:1: ( 'and' )
            {
            // InternalHale.g:1149:1: ( 'and' )
            // InternalHale.g:1150:2: 'and'
            {
             before(grammarAccess.getExpression7Access().getAndKeyword_1_0_1()); 
            match(input,12,FOLLOW_2); 
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
    // InternalHale.g:1159:1: rule__Expression7__Group_1_0__2 : rule__Expression7__Group_1_0__2__Impl ;
    public final void rule__Expression7__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1163:1: ( rule__Expression7__Group_1_0__2__Impl )
            // InternalHale.g:1164:2: rule__Expression7__Group_1_0__2__Impl
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
    // InternalHale.g:1170:1: rule__Expression7__Group_1_0__2__Impl : ( ( rule__Expression7__RightAssignment_1_0_2 ) ) ;
    public final void rule__Expression7__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1174:1: ( ( ( rule__Expression7__RightAssignment_1_0_2 ) ) )
            // InternalHale.g:1175:1: ( ( rule__Expression7__RightAssignment_1_0_2 ) )
            {
            // InternalHale.g:1175:1: ( ( rule__Expression7__RightAssignment_1_0_2 ) )
            // InternalHale.g:1176:2: ( rule__Expression7__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getExpression7Access().getRightAssignment_1_0_2()); 
            // InternalHale.g:1177:2: ( rule__Expression7__RightAssignment_1_0_2 )
            // InternalHale.g:1177:3: rule__Expression7__RightAssignment_1_0_2
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
    // InternalHale.g:1186:1: rule__Expression7__Group_1_1__0 : rule__Expression7__Group_1_1__0__Impl rule__Expression7__Group_1_1__1 ;
    public final void rule__Expression7__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1190:1: ( rule__Expression7__Group_1_1__0__Impl rule__Expression7__Group_1_1__1 )
            // InternalHale.g:1191:2: rule__Expression7__Group_1_1__0__Impl rule__Expression7__Group_1_1__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalHale.g:1198:1: rule__Expression7__Group_1_1__0__Impl : ( () ) ;
    public final void rule__Expression7__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1202:1: ( ( () ) )
            // InternalHale.g:1203:1: ( () )
            {
            // InternalHale.g:1203:1: ( () )
            // InternalHale.g:1204:2: ()
            {
             before(grammarAccess.getExpression7Access().getLogicalOrLeftAction_1_1_0()); 
            // InternalHale.g:1205:2: ()
            // InternalHale.g:1205:3: 
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
    // InternalHale.g:1213:1: rule__Expression7__Group_1_1__1 : rule__Expression7__Group_1_1__1__Impl rule__Expression7__Group_1_1__2 ;
    public final void rule__Expression7__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1217:1: ( rule__Expression7__Group_1_1__1__Impl rule__Expression7__Group_1_1__2 )
            // InternalHale.g:1218:2: rule__Expression7__Group_1_1__1__Impl rule__Expression7__Group_1_1__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalHale.g:1225:1: rule__Expression7__Group_1_1__1__Impl : ( 'or' ) ;
    public final void rule__Expression7__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1229:1: ( ( 'or' ) )
            // InternalHale.g:1230:1: ( 'or' )
            {
            // InternalHale.g:1230:1: ( 'or' )
            // InternalHale.g:1231:2: 'or'
            {
             before(grammarAccess.getExpression7Access().getOrKeyword_1_1_1()); 
            match(input,13,FOLLOW_2); 
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
    // InternalHale.g:1240:1: rule__Expression7__Group_1_1__2 : rule__Expression7__Group_1_1__2__Impl ;
    public final void rule__Expression7__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1244:1: ( rule__Expression7__Group_1_1__2__Impl )
            // InternalHale.g:1245:2: rule__Expression7__Group_1_1__2__Impl
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
    // InternalHale.g:1251:1: rule__Expression7__Group_1_1__2__Impl : ( ( rule__Expression7__RightAssignment_1_1_2 ) ) ;
    public final void rule__Expression7__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1255:1: ( ( ( rule__Expression7__RightAssignment_1_1_2 ) ) )
            // InternalHale.g:1256:1: ( ( rule__Expression7__RightAssignment_1_1_2 ) )
            {
            // InternalHale.g:1256:1: ( ( rule__Expression7__RightAssignment_1_1_2 ) )
            // InternalHale.g:1257:2: ( rule__Expression7__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getExpression7Access().getRightAssignment_1_1_2()); 
            // InternalHale.g:1258:2: ( rule__Expression7__RightAssignment_1_1_2 )
            // InternalHale.g:1258:3: rule__Expression7__RightAssignment_1_1_2
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
    // InternalHale.g:1267:1: rule__Expression6__Group__0 : rule__Expression6__Group__0__Impl rule__Expression6__Group__1 ;
    public final void rule__Expression6__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1271:1: ( rule__Expression6__Group__0__Impl rule__Expression6__Group__1 )
            // InternalHale.g:1272:2: rule__Expression6__Group__0__Impl rule__Expression6__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalHale.g:1279:1: rule__Expression6__Group__0__Impl : ( ruleExpression5 ) ;
    public final void rule__Expression6__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1283:1: ( ( ruleExpression5 ) )
            // InternalHale.g:1284:1: ( ruleExpression5 )
            {
            // InternalHale.g:1284:1: ( ruleExpression5 )
            // InternalHale.g:1285:2: ruleExpression5
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
    // InternalHale.g:1294:1: rule__Expression6__Group__1 : rule__Expression6__Group__1__Impl ;
    public final void rule__Expression6__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1298:1: ( rule__Expression6__Group__1__Impl )
            // InternalHale.g:1299:2: rule__Expression6__Group__1__Impl
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
    // InternalHale.g:1305:1: rule__Expression6__Group__1__Impl : ( ( rule__Expression6__Alternatives_1 )* ) ;
    public final void rule__Expression6__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1309:1: ( ( ( rule__Expression6__Alternatives_1 )* ) )
            // InternalHale.g:1310:1: ( ( rule__Expression6__Alternatives_1 )* )
            {
            // InternalHale.g:1310:1: ( ( rule__Expression6__Alternatives_1 )* )
            // InternalHale.g:1311:2: ( rule__Expression6__Alternatives_1 )*
            {
             before(grammarAccess.getExpression6Access().getAlternatives_1()); 
            // InternalHale.g:1312:2: ( rule__Expression6__Alternatives_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=14 && LA13_0<=15)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalHale.g:1312:3: rule__Expression6__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_11);
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
    // InternalHale.g:1321:1: rule__Expression6__Group_1_0__0 : rule__Expression6__Group_1_0__0__Impl rule__Expression6__Group_1_0__1 ;
    public final void rule__Expression6__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1325:1: ( rule__Expression6__Group_1_0__0__Impl rule__Expression6__Group_1_0__1 )
            // InternalHale.g:1326:2: rule__Expression6__Group_1_0__0__Impl rule__Expression6__Group_1_0__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalHale.g:1333:1: rule__Expression6__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Expression6__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1337:1: ( ( () ) )
            // InternalHale.g:1338:1: ( () )
            {
            // InternalHale.g:1338:1: ( () )
            // InternalHale.g:1339:2: ()
            {
             before(grammarAccess.getExpression6Access().getEqualityLeftAction_1_0_0()); 
            // InternalHale.g:1340:2: ()
            // InternalHale.g:1340:3: 
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
    // InternalHale.g:1348:1: rule__Expression6__Group_1_0__1 : rule__Expression6__Group_1_0__1__Impl rule__Expression6__Group_1_0__2 ;
    public final void rule__Expression6__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1352:1: ( rule__Expression6__Group_1_0__1__Impl rule__Expression6__Group_1_0__2 )
            // InternalHale.g:1353:2: rule__Expression6__Group_1_0__1__Impl rule__Expression6__Group_1_0__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalHale.g:1360:1: rule__Expression6__Group_1_0__1__Impl : ( '==' ) ;
    public final void rule__Expression6__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1364:1: ( ( '==' ) )
            // InternalHale.g:1365:1: ( '==' )
            {
            // InternalHale.g:1365:1: ( '==' )
            // InternalHale.g:1366:2: '=='
            {
             before(grammarAccess.getExpression6Access().getEqualsSignEqualsSignKeyword_1_0_1()); 
            match(input,14,FOLLOW_2); 
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
    // InternalHale.g:1375:1: rule__Expression6__Group_1_0__2 : rule__Expression6__Group_1_0__2__Impl ;
    public final void rule__Expression6__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1379:1: ( rule__Expression6__Group_1_0__2__Impl )
            // InternalHale.g:1380:2: rule__Expression6__Group_1_0__2__Impl
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
    // InternalHale.g:1386:1: rule__Expression6__Group_1_0__2__Impl : ( ( rule__Expression6__RightAssignment_1_0_2 ) ) ;
    public final void rule__Expression6__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1390:1: ( ( ( rule__Expression6__RightAssignment_1_0_2 ) ) )
            // InternalHale.g:1391:1: ( ( rule__Expression6__RightAssignment_1_0_2 ) )
            {
            // InternalHale.g:1391:1: ( ( rule__Expression6__RightAssignment_1_0_2 ) )
            // InternalHale.g:1392:2: ( rule__Expression6__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getExpression6Access().getRightAssignment_1_0_2()); 
            // InternalHale.g:1393:2: ( rule__Expression6__RightAssignment_1_0_2 )
            // InternalHale.g:1393:3: rule__Expression6__RightAssignment_1_0_2
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
    // InternalHale.g:1402:1: rule__Expression6__Group_1_1__0 : rule__Expression6__Group_1_1__0__Impl rule__Expression6__Group_1_1__1 ;
    public final void rule__Expression6__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1406:1: ( rule__Expression6__Group_1_1__0__Impl rule__Expression6__Group_1_1__1 )
            // InternalHale.g:1407:2: rule__Expression6__Group_1_1__0__Impl rule__Expression6__Group_1_1__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalHale.g:1414:1: rule__Expression6__Group_1_1__0__Impl : ( () ) ;
    public final void rule__Expression6__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1418:1: ( ( () ) )
            // InternalHale.g:1419:1: ( () )
            {
            // InternalHale.g:1419:1: ( () )
            // InternalHale.g:1420:2: ()
            {
             before(grammarAccess.getExpression6Access().getInequalityLeftAction_1_1_0()); 
            // InternalHale.g:1421:2: ()
            // InternalHale.g:1421:3: 
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
    // InternalHale.g:1429:1: rule__Expression6__Group_1_1__1 : rule__Expression6__Group_1_1__1__Impl rule__Expression6__Group_1_1__2 ;
    public final void rule__Expression6__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1433:1: ( rule__Expression6__Group_1_1__1__Impl rule__Expression6__Group_1_1__2 )
            // InternalHale.g:1434:2: rule__Expression6__Group_1_1__1__Impl rule__Expression6__Group_1_1__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalHale.g:1441:1: rule__Expression6__Group_1_1__1__Impl : ( '!=' ) ;
    public final void rule__Expression6__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1445:1: ( ( '!=' ) )
            // InternalHale.g:1446:1: ( '!=' )
            {
            // InternalHale.g:1446:1: ( '!=' )
            // InternalHale.g:1447:2: '!='
            {
             before(grammarAccess.getExpression6Access().getExclamationMarkEqualsSignKeyword_1_1_1()); 
            match(input,15,FOLLOW_2); 
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
    // InternalHale.g:1456:1: rule__Expression6__Group_1_1__2 : rule__Expression6__Group_1_1__2__Impl ;
    public final void rule__Expression6__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1460:1: ( rule__Expression6__Group_1_1__2__Impl )
            // InternalHale.g:1461:2: rule__Expression6__Group_1_1__2__Impl
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
    // InternalHale.g:1467:1: rule__Expression6__Group_1_1__2__Impl : ( ( rule__Expression6__RightAssignment_1_1_2 ) ) ;
    public final void rule__Expression6__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1471:1: ( ( ( rule__Expression6__RightAssignment_1_1_2 ) ) )
            // InternalHale.g:1472:1: ( ( rule__Expression6__RightAssignment_1_1_2 ) )
            {
            // InternalHale.g:1472:1: ( ( rule__Expression6__RightAssignment_1_1_2 ) )
            // InternalHale.g:1473:2: ( rule__Expression6__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getExpression6Access().getRightAssignment_1_1_2()); 
            // InternalHale.g:1474:2: ( rule__Expression6__RightAssignment_1_1_2 )
            // InternalHale.g:1474:3: rule__Expression6__RightAssignment_1_1_2
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
    // InternalHale.g:1483:1: rule__Expression5__Group__0 : rule__Expression5__Group__0__Impl rule__Expression5__Group__1 ;
    public final void rule__Expression5__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1487:1: ( rule__Expression5__Group__0__Impl rule__Expression5__Group__1 )
            // InternalHale.g:1488:2: rule__Expression5__Group__0__Impl rule__Expression5__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalHale.g:1495:1: rule__Expression5__Group__0__Impl : ( ruleExpression4 ) ;
    public final void rule__Expression5__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1499:1: ( ( ruleExpression4 ) )
            // InternalHale.g:1500:1: ( ruleExpression4 )
            {
            // InternalHale.g:1500:1: ( ruleExpression4 )
            // InternalHale.g:1501:2: ruleExpression4
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
    // InternalHale.g:1510:1: rule__Expression5__Group__1 : rule__Expression5__Group__1__Impl ;
    public final void rule__Expression5__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1514:1: ( rule__Expression5__Group__1__Impl )
            // InternalHale.g:1515:2: rule__Expression5__Group__1__Impl
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
    // InternalHale.g:1521:1: rule__Expression5__Group__1__Impl : ( ( rule__Expression5__Alternatives_1 )* ) ;
    public final void rule__Expression5__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1525:1: ( ( ( rule__Expression5__Alternatives_1 )* ) )
            // InternalHale.g:1526:1: ( ( rule__Expression5__Alternatives_1 )* )
            {
            // InternalHale.g:1526:1: ( ( rule__Expression5__Alternatives_1 )* )
            // InternalHale.g:1527:2: ( rule__Expression5__Alternatives_1 )*
            {
             before(grammarAccess.getExpression5Access().getAlternatives_1()); 
            // InternalHale.g:1528:2: ( rule__Expression5__Alternatives_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=16 && LA14_0<=19)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalHale.g:1528:3: rule__Expression5__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_14);
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
    // InternalHale.g:1537:1: rule__Expression5__Group_1_0__0 : rule__Expression5__Group_1_0__0__Impl rule__Expression5__Group_1_0__1 ;
    public final void rule__Expression5__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1541:1: ( rule__Expression5__Group_1_0__0__Impl rule__Expression5__Group_1_0__1 )
            // InternalHale.g:1542:2: rule__Expression5__Group_1_0__0__Impl rule__Expression5__Group_1_0__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalHale.g:1549:1: rule__Expression5__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Expression5__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1553:1: ( ( () ) )
            // InternalHale.g:1554:1: ( () )
            {
            // InternalHale.g:1554:1: ( () )
            // InternalHale.g:1555:2: ()
            {
             before(grammarAccess.getExpression5Access().getLessThanOrEqualLeftAction_1_0_0()); 
            // InternalHale.g:1556:2: ()
            // InternalHale.g:1556:3: 
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
    // InternalHale.g:1564:1: rule__Expression5__Group_1_0__1 : rule__Expression5__Group_1_0__1__Impl rule__Expression5__Group_1_0__2 ;
    public final void rule__Expression5__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1568:1: ( rule__Expression5__Group_1_0__1__Impl rule__Expression5__Group_1_0__2 )
            // InternalHale.g:1569:2: rule__Expression5__Group_1_0__1__Impl rule__Expression5__Group_1_0__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalHale.g:1576:1: rule__Expression5__Group_1_0__1__Impl : ( '<=' ) ;
    public final void rule__Expression5__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1580:1: ( ( '<=' ) )
            // InternalHale.g:1581:1: ( '<=' )
            {
            // InternalHale.g:1581:1: ( '<=' )
            // InternalHale.g:1582:2: '<='
            {
             before(grammarAccess.getExpression5Access().getLessThanSignEqualsSignKeyword_1_0_1()); 
            match(input,16,FOLLOW_2); 
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
    // InternalHale.g:1591:1: rule__Expression5__Group_1_0__2 : rule__Expression5__Group_1_0__2__Impl ;
    public final void rule__Expression5__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1595:1: ( rule__Expression5__Group_1_0__2__Impl )
            // InternalHale.g:1596:2: rule__Expression5__Group_1_0__2__Impl
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
    // InternalHale.g:1602:1: rule__Expression5__Group_1_0__2__Impl : ( ( rule__Expression5__RightAssignment_1_0_2 ) ) ;
    public final void rule__Expression5__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1606:1: ( ( ( rule__Expression5__RightAssignment_1_0_2 ) ) )
            // InternalHale.g:1607:1: ( ( rule__Expression5__RightAssignment_1_0_2 ) )
            {
            // InternalHale.g:1607:1: ( ( rule__Expression5__RightAssignment_1_0_2 ) )
            // InternalHale.g:1608:2: ( rule__Expression5__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getExpression5Access().getRightAssignment_1_0_2()); 
            // InternalHale.g:1609:2: ( rule__Expression5__RightAssignment_1_0_2 )
            // InternalHale.g:1609:3: rule__Expression5__RightAssignment_1_0_2
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
    // InternalHale.g:1618:1: rule__Expression5__Group_1_1__0 : rule__Expression5__Group_1_1__0__Impl rule__Expression5__Group_1_1__1 ;
    public final void rule__Expression5__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1622:1: ( rule__Expression5__Group_1_1__0__Impl rule__Expression5__Group_1_1__1 )
            // InternalHale.g:1623:2: rule__Expression5__Group_1_1__0__Impl rule__Expression5__Group_1_1__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalHale.g:1630:1: rule__Expression5__Group_1_1__0__Impl : ( () ) ;
    public final void rule__Expression5__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1634:1: ( ( () ) )
            // InternalHale.g:1635:1: ( () )
            {
            // InternalHale.g:1635:1: ( () )
            // InternalHale.g:1636:2: ()
            {
             before(grammarAccess.getExpression5Access().getLessThanLeftAction_1_1_0()); 
            // InternalHale.g:1637:2: ()
            // InternalHale.g:1637:3: 
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
    // InternalHale.g:1645:1: rule__Expression5__Group_1_1__1 : rule__Expression5__Group_1_1__1__Impl rule__Expression5__Group_1_1__2 ;
    public final void rule__Expression5__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1649:1: ( rule__Expression5__Group_1_1__1__Impl rule__Expression5__Group_1_1__2 )
            // InternalHale.g:1650:2: rule__Expression5__Group_1_1__1__Impl rule__Expression5__Group_1_1__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalHale.g:1657:1: rule__Expression5__Group_1_1__1__Impl : ( '<' ) ;
    public final void rule__Expression5__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1661:1: ( ( '<' ) )
            // InternalHale.g:1662:1: ( '<' )
            {
            // InternalHale.g:1662:1: ( '<' )
            // InternalHale.g:1663:2: '<'
            {
             before(grammarAccess.getExpression5Access().getLessThanSignKeyword_1_1_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalHale.g:1672:1: rule__Expression5__Group_1_1__2 : rule__Expression5__Group_1_1__2__Impl ;
    public final void rule__Expression5__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1676:1: ( rule__Expression5__Group_1_1__2__Impl )
            // InternalHale.g:1677:2: rule__Expression5__Group_1_1__2__Impl
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
    // InternalHale.g:1683:1: rule__Expression5__Group_1_1__2__Impl : ( ( rule__Expression5__RightAssignment_1_1_2 ) ) ;
    public final void rule__Expression5__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1687:1: ( ( ( rule__Expression5__RightAssignment_1_1_2 ) ) )
            // InternalHale.g:1688:1: ( ( rule__Expression5__RightAssignment_1_1_2 ) )
            {
            // InternalHale.g:1688:1: ( ( rule__Expression5__RightAssignment_1_1_2 ) )
            // InternalHale.g:1689:2: ( rule__Expression5__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getExpression5Access().getRightAssignment_1_1_2()); 
            // InternalHale.g:1690:2: ( rule__Expression5__RightAssignment_1_1_2 )
            // InternalHale.g:1690:3: rule__Expression5__RightAssignment_1_1_2
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
    // InternalHale.g:1699:1: rule__Expression5__Group_1_2__0 : rule__Expression5__Group_1_2__0__Impl rule__Expression5__Group_1_2__1 ;
    public final void rule__Expression5__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1703:1: ( rule__Expression5__Group_1_2__0__Impl rule__Expression5__Group_1_2__1 )
            // InternalHale.g:1704:2: rule__Expression5__Group_1_2__0__Impl rule__Expression5__Group_1_2__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalHale.g:1711:1: rule__Expression5__Group_1_2__0__Impl : ( () ) ;
    public final void rule__Expression5__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1715:1: ( ( () ) )
            // InternalHale.g:1716:1: ( () )
            {
            // InternalHale.g:1716:1: ( () )
            // InternalHale.g:1717:2: ()
            {
             before(grammarAccess.getExpression5Access().getGreaterThanOrEqualLeftAction_1_2_0()); 
            // InternalHale.g:1718:2: ()
            // InternalHale.g:1718:3: 
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
    // InternalHale.g:1726:1: rule__Expression5__Group_1_2__1 : rule__Expression5__Group_1_2__1__Impl rule__Expression5__Group_1_2__2 ;
    public final void rule__Expression5__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1730:1: ( rule__Expression5__Group_1_2__1__Impl rule__Expression5__Group_1_2__2 )
            // InternalHale.g:1731:2: rule__Expression5__Group_1_2__1__Impl rule__Expression5__Group_1_2__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalHale.g:1738:1: rule__Expression5__Group_1_2__1__Impl : ( '>=' ) ;
    public final void rule__Expression5__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1742:1: ( ( '>=' ) )
            // InternalHale.g:1743:1: ( '>=' )
            {
            // InternalHale.g:1743:1: ( '>=' )
            // InternalHale.g:1744:2: '>='
            {
             before(grammarAccess.getExpression5Access().getGreaterThanSignEqualsSignKeyword_1_2_1()); 
            match(input,18,FOLLOW_2); 
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
    // InternalHale.g:1753:1: rule__Expression5__Group_1_2__2 : rule__Expression5__Group_1_2__2__Impl ;
    public final void rule__Expression5__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1757:1: ( rule__Expression5__Group_1_2__2__Impl )
            // InternalHale.g:1758:2: rule__Expression5__Group_1_2__2__Impl
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
    // InternalHale.g:1764:1: rule__Expression5__Group_1_2__2__Impl : ( ( rule__Expression5__RightAssignment_1_2_2 ) ) ;
    public final void rule__Expression5__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1768:1: ( ( ( rule__Expression5__RightAssignment_1_2_2 ) ) )
            // InternalHale.g:1769:1: ( ( rule__Expression5__RightAssignment_1_2_2 ) )
            {
            // InternalHale.g:1769:1: ( ( rule__Expression5__RightAssignment_1_2_2 ) )
            // InternalHale.g:1770:2: ( rule__Expression5__RightAssignment_1_2_2 )
            {
             before(grammarAccess.getExpression5Access().getRightAssignment_1_2_2()); 
            // InternalHale.g:1771:2: ( rule__Expression5__RightAssignment_1_2_2 )
            // InternalHale.g:1771:3: rule__Expression5__RightAssignment_1_2_2
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
    // InternalHale.g:1780:1: rule__Expression5__Group_1_3__0 : rule__Expression5__Group_1_3__0__Impl rule__Expression5__Group_1_3__1 ;
    public final void rule__Expression5__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1784:1: ( rule__Expression5__Group_1_3__0__Impl rule__Expression5__Group_1_3__1 )
            // InternalHale.g:1785:2: rule__Expression5__Group_1_3__0__Impl rule__Expression5__Group_1_3__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalHale.g:1792:1: rule__Expression5__Group_1_3__0__Impl : ( () ) ;
    public final void rule__Expression5__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1796:1: ( ( () ) )
            // InternalHale.g:1797:1: ( () )
            {
            // InternalHale.g:1797:1: ( () )
            // InternalHale.g:1798:2: ()
            {
             before(grammarAccess.getExpression5Access().getGreaterThanLeftAction_1_3_0()); 
            // InternalHale.g:1799:2: ()
            // InternalHale.g:1799:3: 
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
    // InternalHale.g:1807:1: rule__Expression5__Group_1_3__1 : rule__Expression5__Group_1_3__1__Impl rule__Expression5__Group_1_3__2 ;
    public final void rule__Expression5__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1811:1: ( rule__Expression5__Group_1_3__1__Impl rule__Expression5__Group_1_3__2 )
            // InternalHale.g:1812:2: rule__Expression5__Group_1_3__1__Impl rule__Expression5__Group_1_3__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalHale.g:1819:1: rule__Expression5__Group_1_3__1__Impl : ( '>' ) ;
    public final void rule__Expression5__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1823:1: ( ( '>' ) )
            // InternalHale.g:1824:1: ( '>' )
            {
            // InternalHale.g:1824:1: ( '>' )
            // InternalHale.g:1825:2: '>'
            {
             before(grammarAccess.getExpression5Access().getGreaterThanSignKeyword_1_3_1()); 
            match(input,19,FOLLOW_2); 
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
    // InternalHale.g:1834:1: rule__Expression5__Group_1_3__2 : rule__Expression5__Group_1_3__2__Impl ;
    public final void rule__Expression5__Group_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1838:1: ( rule__Expression5__Group_1_3__2__Impl )
            // InternalHale.g:1839:2: rule__Expression5__Group_1_3__2__Impl
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
    // InternalHale.g:1845:1: rule__Expression5__Group_1_3__2__Impl : ( ( rule__Expression5__RightAssignment_1_3_2 ) ) ;
    public final void rule__Expression5__Group_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1849:1: ( ( ( rule__Expression5__RightAssignment_1_3_2 ) ) )
            // InternalHale.g:1850:1: ( ( rule__Expression5__RightAssignment_1_3_2 ) )
            {
            // InternalHale.g:1850:1: ( ( rule__Expression5__RightAssignment_1_3_2 ) )
            // InternalHale.g:1851:2: ( rule__Expression5__RightAssignment_1_3_2 )
            {
             before(grammarAccess.getExpression5Access().getRightAssignment_1_3_2()); 
            // InternalHale.g:1852:2: ( rule__Expression5__RightAssignment_1_3_2 )
            // InternalHale.g:1852:3: rule__Expression5__RightAssignment_1_3_2
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
    // InternalHale.g:1861:1: rule__Expression4__Group__0 : rule__Expression4__Group__0__Impl rule__Expression4__Group__1 ;
    public final void rule__Expression4__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1865:1: ( rule__Expression4__Group__0__Impl rule__Expression4__Group__1 )
            // InternalHale.g:1866:2: rule__Expression4__Group__0__Impl rule__Expression4__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalHale.g:1873:1: rule__Expression4__Group__0__Impl : ( ruleExpression3 ) ;
    public final void rule__Expression4__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1877:1: ( ( ruleExpression3 ) )
            // InternalHale.g:1878:1: ( ruleExpression3 )
            {
            // InternalHale.g:1878:1: ( ruleExpression3 )
            // InternalHale.g:1879:2: ruleExpression3
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
    // InternalHale.g:1888:1: rule__Expression4__Group__1 : rule__Expression4__Group__1__Impl ;
    public final void rule__Expression4__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1892:1: ( rule__Expression4__Group__1__Impl )
            // InternalHale.g:1893:2: rule__Expression4__Group__1__Impl
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
    // InternalHale.g:1899:1: rule__Expression4__Group__1__Impl : ( ( rule__Expression4__Alternatives_1 )* ) ;
    public final void rule__Expression4__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1903:1: ( ( ( rule__Expression4__Alternatives_1 )* ) )
            // InternalHale.g:1904:1: ( ( rule__Expression4__Alternatives_1 )* )
            {
            // InternalHale.g:1904:1: ( ( rule__Expression4__Alternatives_1 )* )
            // InternalHale.g:1905:2: ( rule__Expression4__Alternatives_1 )*
            {
             before(grammarAccess.getExpression4Access().getAlternatives_1()); 
            // InternalHale.g:1906:2: ( rule__Expression4__Alternatives_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=20 && LA15_0<=21)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalHale.g:1906:3: rule__Expression4__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_19);
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
    // InternalHale.g:1915:1: rule__Expression4__Group_1_0__0 : rule__Expression4__Group_1_0__0__Impl rule__Expression4__Group_1_0__1 ;
    public final void rule__Expression4__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1919:1: ( rule__Expression4__Group_1_0__0__Impl rule__Expression4__Group_1_0__1 )
            // InternalHale.g:1920:2: rule__Expression4__Group_1_0__0__Impl rule__Expression4__Group_1_0__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalHale.g:1927:1: rule__Expression4__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Expression4__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1931:1: ( ( () ) )
            // InternalHale.g:1932:1: ( () )
            {
            // InternalHale.g:1932:1: ( () )
            // InternalHale.g:1933:2: ()
            {
             before(grammarAccess.getExpression4Access().getAdditionLeftAction_1_0_0()); 
            // InternalHale.g:1934:2: ()
            // InternalHale.g:1934:3: 
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
    // InternalHale.g:1942:1: rule__Expression4__Group_1_0__1 : rule__Expression4__Group_1_0__1__Impl rule__Expression4__Group_1_0__2 ;
    public final void rule__Expression4__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1946:1: ( rule__Expression4__Group_1_0__1__Impl rule__Expression4__Group_1_0__2 )
            // InternalHale.g:1947:2: rule__Expression4__Group_1_0__1__Impl rule__Expression4__Group_1_0__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalHale.g:1954:1: rule__Expression4__Group_1_0__1__Impl : ( '+' ) ;
    public final void rule__Expression4__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1958:1: ( ( '+' ) )
            // InternalHale.g:1959:1: ( '+' )
            {
            // InternalHale.g:1959:1: ( '+' )
            // InternalHale.g:1960:2: '+'
            {
             before(grammarAccess.getExpression4Access().getPlusSignKeyword_1_0_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalHale.g:1969:1: rule__Expression4__Group_1_0__2 : rule__Expression4__Group_1_0__2__Impl ;
    public final void rule__Expression4__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1973:1: ( rule__Expression4__Group_1_0__2__Impl )
            // InternalHale.g:1974:2: rule__Expression4__Group_1_0__2__Impl
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
    // InternalHale.g:1980:1: rule__Expression4__Group_1_0__2__Impl : ( ( rule__Expression4__RightAssignment_1_0_2 ) ) ;
    public final void rule__Expression4__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1984:1: ( ( ( rule__Expression4__RightAssignment_1_0_2 ) ) )
            // InternalHale.g:1985:1: ( ( rule__Expression4__RightAssignment_1_0_2 ) )
            {
            // InternalHale.g:1985:1: ( ( rule__Expression4__RightAssignment_1_0_2 ) )
            // InternalHale.g:1986:2: ( rule__Expression4__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getExpression4Access().getRightAssignment_1_0_2()); 
            // InternalHale.g:1987:2: ( rule__Expression4__RightAssignment_1_0_2 )
            // InternalHale.g:1987:3: rule__Expression4__RightAssignment_1_0_2
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
    // InternalHale.g:1996:1: rule__Expression4__Group_1_1__0 : rule__Expression4__Group_1_1__0__Impl rule__Expression4__Group_1_1__1 ;
    public final void rule__Expression4__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2000:1: ( rule__Expression4__Group_1_1__0__Impl rule__Expression4__Group_1_1__1 )
            // InternalHale.g:2001:2: rule__Expression4__Group_1_1__0__Impl rule__Expression4__Group_1_1__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalHale.g:2008:1: rule__Expression4__Group_1_1__0__Impl : ( () ) ;
    public final void rule__Expression4__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2012:1: ( ( () ) )
            // InternalHale.g:2013:1: ( () )
            {
            // InternalHale.g:2013:1: ( () )
            // InternalHale.g:2014:2: ()
            {
             before(grammarAccess.getExpression4Access().getSubtractionLeftAction_1_1_0()); 
            // InternalHale.g:2015:2: ()
            // InternalHale.g:2015:3: 
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
    // InternalHale.g:2023:1: rule__Expression4__Group_1_1__1 : rule__Expression4__Group_1_1__1__Impl rule__Expression4__Group_1_1__2 ;
    public final void rule__Expression4__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2027:1: ( rule__Expression4__Group_1_1__1__Impl rule__Expression4__Group_1_1__2 )
            // InternalHale.g:2028:2: rule__Expression4__Group_1_1__1__Impl rule__Expression4__Group_1_1__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalHale.g:2035:1: rule__Expression4__Group_1_1__1__Impl : ( '-' ) ;
    public final void rule__Expression4__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2039:1: ( ( '-' ) )
            // InternalHale.g:2040:1: ( '-' )
            {
            // InternalHale.g:2040:1: ( '-' )
            // InternalHale.g:2041:2: '-'
            {
             before(grammarAccess.getExpression4Access().getHyphenMinusKeyword_1_1_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalHale.g:2050:1: rule__Expression4__Group_1_1__2 : rule__Expression4__Group_1_1__2__Impl ;
    public final void rule__Expression4__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2054:1: ( rule__Expression4__Group_1_1__2__Impl )
            // InternalHale.g:2055:2: rule__Expression4__Group_1_1__2__Impl
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
    // InternalHale.g:2061:1: rule__Expression4__Group_1_1__2__Impl : ( ( rule__Expression4__RightAssignment_1_1_2 ) ) ;
    public final void rule__Expression4__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2065:1: ( ( ( rule__Expression4__RightAssignment_1_1_2 ) ) )
            // InternalHale.g:2066:1: ( ( rule__Expression4__RightAssignment_1_1_2 ) )
            {
            // InternalHale.g:2066:1: ( ( rule__Expression4__RightAssignment_1_1_2 ) )
            // InternalHale.g:2067:2: ( rule__Expression4__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getExpression4Access().getRightAssignment_1_1_2()); 
            // InternalHale.g:2068:2: ( rule__Expression4__RightAssignment_1_1_2 )
            // InternalHale.g:2068:3: rule__Expression4__RightAssignment_1_1_2
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
    // InternalHale.g:2077:1: rule__Expression3__Group__0 : rule__Expression3__Group__0__Impl rule__Expression3__Group__1 ;
    public final void rule__Expression3__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2081:1: ( rule__Expression3__Group__0__Impl rule__Expression3__Group__1 )
            // InternalHale.g:2082:2: rule__Expression3__Group__0__Impl rule__Expression3__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalHale.g:2089:1: rule__Expression3__Group__0__Impl : ( ruleExpression2 ) ;
    public final void rule__Expression3__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2093:1: ( ( ruleExpression2 ) )
            // InternalHale.g:2094:1: ( ruleExpression2 )
            {
            // InternalHale.g:2094:1: ( ruleExpression2 )
            // InternalHale.g:2095:2: ruleExpression2
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
    // InternalHale.g:2104:1: rule__Expression3__Group__1 : rule__Expression3__Group__1__Impl ;
    public final void rule__Expression3__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2108:1: ( rule__Expression3__Group__1__Impl )
            // InternalHale.g:2109:2: rule__Expression3__Group__1__Impl
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
    // InternalHale.g:2115:1: rule__Expression3__Group__1__Impl : ( ( rule__Expression3__Alternatives_1 )* ) ;
    public final void rule__Expression3__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2119:1: ( ( ( rule__Expression3__Alternatives_1 )* ) )
            // InternalHale.g:2120:1: ( ( rule__Expression3__Alternatives_1 )* )
            {
            // InternalHale.g:2120:1: ( ( rule__Expression3__Alternatives_1 )* )
            // InternalHale.g:2121:2: ( rule__Expression3__Alternatives_1 )*
            {
             before(grammarAccess.getExpression3Access().getAlternatives_1()); 
            // InternalHale.g:2122:2: ( rule__Expression3__Alternatives_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=22 && LA16_0<=24)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalHale.g:2122:3: rule__Expression3__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_22);
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
    // InternalHale.g:2131:1: rule__Expression3__Group_1_0__0 : rule__Expression3__Group_1_0__0__Impl rule__Expression3__Group_1_0__1 ;
    public final void rule__Expression3__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2135:1: ( rule__Expression3__Group_1_0__0__Impl rule__Expression3__Group_1_0__1 )
            // InternalHale.g:2136:2: rule__Expression3__Group_1_0__0__Impl rule__Expression3__Group_1_0__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalHale.g:2143:1: rule__Expression3__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Expression3__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2147:1: ( ( () ) )
            // InternalHale.g:2148:1: ( () )
            {
            // InternalHale.g:2148:1: ( () )
            // InternalHale.g:2149:2: ()
            {
             before(grammarAccess.getExpression3Access().getMultiplicationLeftAction_1_0_0()); 
            // InternalHale.g:2150:2: ()
            // InternalHale.g:2150:3: 
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
    // InternalHale.g:2158:1: rule__Expression3__Group_1_0__1 : rule__Expression3__Group_1_0__1__Impl rule__Expression3__Group_1_0__2 ;
    public final void rule__Expression3__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2162:1: ( rule__Expression3__Group_1_0__1__Impl rule__Expression3__Group_1_0__2 )
            // InternalHale.g:2163:2: rule__Expression3__Group_1_0__1__Impl rule__Expression3__Group_1_0__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalHale.g:2170:1: rule__Expression3__Group_1_0__1__Impl : ( '*' ) ;
    public final void rule__Expression3__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2174:1: ( ( '*' ) )
            // InternalHale.g:2175:1: ( '*' )
            {
            // InternalHale.g:2175:1: ( '*' )
            // InternalHale.g:2176:2: '*'
            {
             before(grammarAccess.getExpression3Access().getAsteriskKeyword_1_0_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalHale.g:2185:1: rule__Expression3__Group_1_0__2 : rule__Expression3__Group_1_0__2__Impl ;
    public final void rule__Expression3__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2189:1: ( rule__Expression3__Group_1_0__2__Impl )
            // InternalHale.g:2190:2: rule__Expression3__Group_1_0__2__Impl
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
    // InternalHale.g:2196:1: rule__Expression3__Group_1_0__2__Impl : ( ( rule__Expression3__RightAssignment_1_0_2 ) ) ;
    public final void rule__Expression3__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2200:1: ( ( ( rule__Expression3__RightAssignment_1_0_2 ) ) )
            // InternalHale.g:2201:1: ( ( rule__Expression3__RightAssignment_1_0_2 ) )
            {
            // InternalHale.g:2201:1: ( ( rule__Expression3__RightAssignment_1_0_2 ) )
            // InternalHale.g:2202:2: ( rule__Expression3__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getExpression3Access().getRightAssignment_1_0_2()); 
            // InternalHale.g:2203:2: ( rule__Expression3__RightAssignment_1_0_2 )
            // InternalHale.g:2203:3: rule__Expression3__RightAssignment_1_0_2
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
    // InternalHale.g:2212:1: rule__Expression3__Group_1_1__0 : rule__Expression3__Group_1_1__0__Impl rule__Expression3__Group_1_1__1 ;
    public final void rule__Expression3__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2216:1: ( rule__Expression3__Group_1_1__0__Impl rule__Expression3__Group_1_1__1 )
            // InternalHale.g:2217:2: rule__Expression3__Group_1_1__0__Impl rule__Expression3__Group_1_1__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalHale.g:2224:1: rule__Expression3__Group_1_1__0__Impl : ( () ) ;
    public final void rule__Expression3__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2228:1: ( ( () ) )
            // InternalHale.g:2229:1: ( () )
            {
            // InternalHale.g:2229:1: ( () )
            // InternalHale.g:2230:2: ()
            {
             before(grammarAccess.getExpression3Access().getDivisionLeftAction_1_1_0()); 
            // InternalHale.g:2231:2: ()
            // InternalHale.g:2231:3: 
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
    // InternalHale.g:2239:1: rule__Expression3__Group_1_1__1 : rule__Expression3__Group_1_1__1__Impl rule__Expression3__Group_1_1__2 ;
    public final void rule__Expression3__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2243:1: ( rule__Expression3__Group_1_1__1__Impl rule__Expression3__Group_1_1__2 )
            // InternalHale.g:2244:2: rule__Expression3__Group_1_1__1__Impl rule__Expression3__Group_1_1__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalHale.g:2251:1: rule__Expression3__Group_1_1__1__Impl : ( '/' ) ;
    public final void rule__Expression3__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2255:1: ( ( '/' ) )
            // InternalHale.g:2256:1: ( '/' )
            {
            // InternalHale.g:2256:1: ( '/' )
            // InternalHale.g:2257:2: '/'
            {
             before(grammarAccess.getExpression3Access().getSolidusKeyword_1_1_1()); 
            match(input,23,FOLLOW_2); 
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
    // InternalHale.g:2266:1: rule__Expression3__Group_1_1__2 : rule__Expression3__Group_1_1__2__Impl ;
    public final void rule__Expression3__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2270:1: ( rule__Expression3__Group_1_1__2__Impl )
            // InternalHale.g:2271:2: rule__Expression3__Group_1_1__2__Impl
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
    // InternalHale.g:2277:1: rule__Expression3__Group_1_1__2__Impl : ( ( rule__Expression3__RightAssignment_1_1_2 ) ) ;
    public final void rule__Expression3__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2281:1: ( ( ( rule__Expression3__RightAssignment_1_1_2 ) ) )
            // InternalHale.g:2282:1: ( ( rule__Expression3__RightAssignment_1_1_2 ) )
            {
            // InternalHale.g:2282:1: ( ( rule__Expression3__RightAssignment_1_1_2 ) )
            // InternalHale.g:2283:2: ( rule__Expression3__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getExpression3Access().getRightAssignment_1_1_2()); 
            // InternalHale.g:2284:2: ( rule__Expression3__RightAssignment_1_1_2 )
            // InternalHale.g:2284:3: rule__Expression3__RightAssignment_1_1_2
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
    // InternalHale.g:2293:1: rule__Expression3__Group_1_2__0 : rule__Expression3__Group_1_2__0__Impl rule__Expression3__Group_1_2__1 ;
    public final void rule__Expression3__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2297:1: ( rule__Expression3__Group_1_2__0__Impl rule__Expression3__Group_1_2__1 )
            // InternalHale.g:2298:2: rule__Expression3__Group_1_2__0__Impl rule__Expression3__Group_1_2__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalHale.g:2305:1: rule__Expression3__Group_1_2__0__Impl : ( () ) ;
    public final void rule__Expression3__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2309:1: ( ( () ) )
            // InternalHale.g:2310:1: ( () )
            {
            // InternalHale.g:2310:1: ( () )
            // InternalHale.g:2311:2: ()
            {
             before(grammarAccess.getExpression3Access().getRemainderLeftAction_1_2_0()); 
            // InternalHale.g:2312:2: ()
            // InternalHale.g:2312:3: 
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
    // InternalHale.g:2320:1: rule__Expression3__Group_1_2__1 : rule__Expression3__Group_1_2__1__Impl rule__Expression3__Group_1_2__2 ;
    public final void rule__Expression3__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2324:1: ( rule__Expression3__Group_1_2__1__Impl rule__Expression3__Group_1_2__2 )
            // InternalHale.g:2325:2: rule__Expression3__Group_1_2__1__Impl rule__Expression3__Group_1_2__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalHale.g:2332:1: rule__Expression3__Group_1_2__1__Impl : ( '%' ) ;
    public final void rule__Expression3__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2336:1: ( ( '%' ) )
            // InternalHale.g:2337:1: ( '%' )
            {
            // InternalHale.g:2337:1: ( '%' )
            // InternalHale.g:2338:2: '%'
            {
             before(grammarAccess.getExpression3Access().getPercentSignKeyword_1_2_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalHale.g:2347:1: rule__Expression3__Group_1_2__2 : rule__Expression3__Group_1_2__2__Impl ;
    public final void rule__Expression3__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2351:1: ( rule__Expression3__Group_1_2__2__Impl )
            // InternalHale.g:2352:2: rule__Expression3__Group_1_2__2__Impl
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
    // InternalHale.g:2358:1: rule__Expression3__Group_1_2__2__Impl : ( ( rule__Expression3__RightAssignment_1_2_2 ) ) ;
    public final void rule__Expression3__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2362:1: ( ( ( rule__Expression3__RightAssignment_1_2_2 ) ) )
            // InternalHale.g:2363:1: ( ( rule__Expression3__RightAssignment_1_2_2 ) )
            {
            // InternalHale.g:2363:1: ( ( rule__Expression3__RightAssignment_1_2_2 ) )
            // InternalHale.g:2364:2: ( rule__Expression3__RightAssignment_1_2_2 )
            {
             before(grammarAccess.getExpression3Access().getRightAssignment_1_2_2()); 
            // InternalHale.g:2365:2: ( rule__Expression3__RightAssignment_1_2_2 )
            // InternalHale.g:2365:3: rule__Expression3__RightAssignment_1_2_2
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
    // InternalHale.g:2374:1: rule__Expression2__Group__0 : rule__Expression2__Group__0__Impl rule__Expression2__Group__1 ;
    public final void rule__Expression2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2378:1: ( rule__Expression2__Group__0__Impl rule__Expression2__Group__1 )
            // InternalHale.g:2379:2: rule__Expression2__Group__0__Impl rule__Expression2__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalHale.g:2386:1: rule__Expression2__Group__0__Impl : ( ruleExpression1 ) ;
    public final void rule__Expression2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2390:1: ( ( ruleExpression1 ) )
            // InternalHale.g:2391:1: ( ruleExpression1 )
            {
            // InternalHale.g:2391:1: ( ruleExpression1 )
            // InternalHale.g:2392:2: ruleExpression1
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
    // InternalHale.g:2401:1: rule__Expression2__Group__1 : rule__Expression2__Group__1__Impl ;
    public final void rule__Expression2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2405:1: ( rule__Expression2__Group__1__Impl )
            // InternalHale.g:2406:2: rule__Expression2__Group__1__Impl
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
    // InternalHale.g:2412:1: rule__Expression2__Group__1__Impl : ( ( rule__Expression2__Group_1__0 )* ) ;
    public final void rule__Expression2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2416:1: ( ( ( rule__Expression2__Group_1__0 )* ) )
            // InternalHale.g:2417:1: ( ( rule__Expression2__Group_1__0 )* )
            {
            // InternalHale.g:2417:1: ( ( rule__Expression2__Group_1__0 )* )
            // InternalHale.g:2418:2: ( rule__Expression2__Group_1__0 )*
            {
             before(grammarAccess.getExpression2Access().getGroup_1()); 
            // InternalHale.g:2419:2: ( rule__Expression2__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==25) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalHale.g:2419:3: rule__Expression2__Group_1__0
            	    {
            	    pushFollow(FOLLOW_26);
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
    // InternalHale.g:2428:1: rule__Expression2__Group_1__0 : rule__Expression2__Group_1__0__Impl rule__Expression2__Group_1__1 ;
    public final void rule__Expression2__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2432:1: ( rule__Expression2__Group_1__0__Impl rule__Expression2__Group_1__1 )
            // InternalHale.g:2433:2: rule__Expression2__Group_1__0__Impl rule__Expression2__Group_1__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalHale.g:2440:1: rule__Expression2__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression2__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2444:1: ( ( () ) )
            // InternalHale.g:2445:1: ( () )
            {
            // InternalHale.g:2445:1: ( () )
            // InternalHale.g:2446:2: ()
            {
             before(grammarAccess.getExpression2Access().getExponentiationLeftAction_1_0()); 
            // InternalHale.g:2447:2: ()
            // InternalHale.g:2447:3: 
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
    // InternalHale.g:2455:1: rule__Expression2__Group_1__1 : rule__Expression2__Group_1__1__Impl rule__Expression2__Group_1__2 ;
    public final void rule__Expression2__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2459:1: ( rule__Expression2__Group_1__1__Impl rule__Expression2__Group_1__2 )
            // InternalHale.g:2460:2: rule__Expression2__Group_1__1__Impl rule__Expression2__Group_1__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalHale.g:2467:1: rule__Expression2__Group_1__1__Impl : ( '**' ) ;
    public final void rule__Expression2__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2471:1: ( ( '**' ) )
            // InternalHale.g:2472:1: ( '**' )
            {
            // InternalHale.g:2472:1: ( '**' )
            // InternalHale.g:2473:2: '**'
            {
             before(grammarAccess.getExpression2Access().getAsteriskAsteriskKeyword_1_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalHale.g:2482:1: rule__Expression2__Group_1__2 : rule__Expression2__Group_1__2__Impl ;
    public final void rule__Expression2__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2486:1: ( rule__Expression2__Group_1__2__Impl )
            // InternalHale.g:2487:2: rule__Expression2__Group_1__2__Impl
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
    // InternalHale.g:2493:1: rule__Expression2__Group_1__2__Impl : ( ( rule__Expression2__RightAssignment_1_2 ) ) ;
    public final void rule__Expression2__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2497:1: ( ( ( rule__Expression2__RightAssignment_1_2 ) ) )
            // InternalHale.g:2498:1: ( ( rule__Expression2__RightAssignment_1_2 ) )
            {
            // InternalHale.g:2498:1: ( ( rule__Expression2__RightAssignment_1_2 ) )
            // InternalHale.g:2499:2: ( rule__Expression2__RightAssignment_1_2 )
            {
             before(grammarAccess.getExpression2Access().getRightAssignment_1_2()); 
            // InternalHale.g:2500:2: ( rule__Expression2__RightAssignment_1_2 )
            // InternalHale.g:2500:3: rule__Expression2__RightAssignment_1_2
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
    // InternalHale.g:2509:1: rule__Expression1__Group_0__0 : rule__Expression1__Group_0__0__Impl rule__Expression1__Group_0__1 ;
    public final void rule__Expression1__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2513:1: ( rule__Expression1__Group_0__0__Impl rule__Expression1__Group_0__1 )
            // InternalHale.g:2514:2: rule__Expression1__Group_0__0__Impl rule__Expression1__Group_0__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalHale.g:2521:1: rule__Expression1__Group_0__0__Impl : ( () ) ;
    public final void rule__Expression1__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2525:1: ( ( () ) )
            // InternalHale.g:2526:1: ( () )
            {
            // InternalHale.g:2526:1: ( () )
            // InternalHale.g:2527:2: ()
            {
             before(grammarAccess.getExpression1Access().getUnaryNegationAction_0_0()); 
            // InternalHale.g:2528:2: ()
            // InternalHale.g:2528:3: 
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
    // InternalHale.g:2536:1: rule__Expression1__Group_0__1 : rule__Expression1__Group_0__1__Impl rule__Expression1__Group_0__2 ;
    public final void rule__Expression1__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2540:1: ( rule__Expression1__Group_0__1__Impl rule__Expression1__Group_0__2 )
            // InternalHale.g:2541:2: rule__Expression1__Group_0__1__Impl rule__Expression1__Group_0__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalHale.g:2548:1: rule__Expression1__Group_0__1__Impl : ( '-' ) ;
    public final void rule__Expression1__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2552:1: ( ( '-' ) )
            // InternalHale.g:2553:1: ( '-' )
            {
            // InternalHale.g:2553:1: ( '-' )
            // InternalHale.g:2554:2: '-'
            {
             before(grammarAccess.getExpression1Access().getHyphenMinusKeyword_0_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalHale.g:2563:1: rule__Expression1__Group_0__2 : rule__Expression1__Group_0__2__Impl ;
    public final void rule__Expression1__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2567:1: ( rule__Expression1__Group_0__2__Impl )
            // InternalHale.g:2568:2: rule__Expression1__Group_0__2__Impl
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
    // InternalHale.g:2574:1: rule__Expression1__Group_0__2__Impl : ( ( rule__Expression1__InnerAssignment_0_2 ) ) ;
    public final void rule__Expression1__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2578:1: ( ( ( rule__Expression1__InnerAssignment_0_2 ) ) )
            // InternalHale.g:2579:1: ( ( rule__Expression1__InnerAssignment_0_2 ) )
            {
            // InternalHale.g:2579:1: ( ( rule__Expression1__InnerAssignment_0_2 ) )
            // InternalHale.g:2580:2: ( rule__Expression1__InnerAssignment_0_2 )
            {
             before(grammarAccess.getExpression1Access().getInnerAssignment_0_2()); 
            // InternalHale.g:2581:2: ( rule__Expression1__InnerAssignment_0_2 )
            // InternalHale.g:2581:3: rule__Expression1__InnerAssignment_0_2
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
    // InternalHale.g:2590:1: rule__Expression1__Group_1__0 : rule__Expression1__Group_1__0__Impl rule__Expression1__Group_1__1 ;
    public final void rule__Expression1__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2594:1: ( rule__Expression1__Group_1__0__Impl rule__Expression1__Group_1__1 )
            // InternalHale.g:2595:2: rule__Expression1__Group_1__0__Impl rule__Expression1__Group_1__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalHale.g:2602:1: rule__Expression1__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression1__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2606:1: ( ( () ) )
            // InternalHale.g:2607:1: ( () )
            {
            // InternalHale.g:2607:1: ( () )
            // InternalHale.g:2608:2: ()
            {
             before(grammarAccess.getExpression1Access().getLogicalNotAction_1_0()); 
            // InternalHale.g:2609:2: ()
            // InternalHale.g:2609:3: 
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
    // InternalHale.g:2617:1: rule__Expression1__Group_1__1 : rule__Expression1__Group_1__1__Impl rule__Expression1__Group_1__2 ;
    public final void rule__Expression1__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2621:1: ( rule__Expression1__Group_1__1__Impl rule__Expression1__Group_1__2 )
            // InternalHale.g:2622:2: rule__Expression1__Group_1__1__Impl rule__Expression1__Group_1__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalHale.g:2629:1: rule__Expression1__Group_1__1__Impl : ( 'not' ) ;
    public final void rule__Expression1__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2633:1: ( ( 'not' ) )
            // InternalHale.g:2634:1: ( 'not' )
            {
            // InternalHale.g:2634:1: ( 'not' )
            // InternalHale.g:2635:2: 'not'
            {
             before(grammarAccess.getExpression1Access().getNotKeyword_1_1()); 
            match(input,26,FOLLOW_2); 
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
    // InternalHale.g:2644:1: rule__Expression1__Group_1__2 : rule__Expression1__Group_1__2__Impl ;
    public final void rule__Expression1__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2648:1: ( rule__Expression1__Group_1__2__Impl )
            // InternalHale.g:2649:2: rule__Expression1__Group_1__2__Impl
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
    // InternalHale.g:2655:1: rule__Expression1__Group_1__2__Impl : ( ( rule__Expression1__InnerAssignment_1_2 ) ) ;
    public final void rule__Expression1__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2659:1: ( ( ( rule__Expression1__InnerAssignment_1_2 ) ) )
            // InternalHale.g:2660:1: ( ( rule__Expression1__InnerAssignment_1_2 ) )
            {
            // InternalHale.g:2660:1: ( ( rule__Expression1__InnerAssignment_1_2 ) )
            // InternalHale.g:2661:2: ( rule__Expression1__InnerAssignment_1_2 )
            {
             before(grammarAccess.getExpression1Access().getInnerAssignment_1_2()); 
            // InternalHale.g:2662:2: ( rule__Expression1__InnerAssignment_1_2 )
            // InternalHale.g:2662:3: rule__Expression1__InnerAssignment_1_2
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
    // InternalHale.g:2671:1: rule__Primary__Group_2__0 : rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 ;
    public final void rule__Primary__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2675:1: ( rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 )
            // InternalHale.g:2676:2: rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalHale.g:2683:1: rule__Primary__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2687:1: ( ( '(' ) )
            // InternalHale.g:2688:1: ( '(' )
            {
            // InternalHale.g:2688:1: ( '(' )
            // InternalHale.g:2689:2: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalHale.g:2698:1: rule__Primary__Group_2__1 : rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 ;
    public final void rule__Primary__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2702:1: ( rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 )
            // InternalHale.g:2703:2: rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalHale.g:2710:1: rule__Primary__Group_2__1__Impl : ( ruleExpression ) ;
    public final void rule__Primary__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2714:1: ( ( ruleExpression ) )
            // InternalHale.g:2715:1: ( ruleExpression )
            {
            // InternalHale.g:2715:1: ( ruleExpression )
            // InternalHale.g:2716:2: ruleExpression
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
    // InternalHale.g:2725:1: rule__Primary__Group_2__2 : rule__Primary__Group_2__2__Impl ;
    public final void rule__Primary__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2729:1: ( rule__Primary__Group_2__2__Impl )
            // InternalHale.g:2730:2: rule__Primary__Group_2__2__Impl
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
    // InternalHale.g:2736:1: rule__Primary__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2740:1: ( ( ')' ) )
            // InternalHale.g:2741:1: ( ')' )
            {
            // InternalHale.g:2741:1: ( ')' )
            // InternalHale.g:2742:2: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_2_2()); 
            match(input,28,FOLLOW_2); 
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
    // InternalHale.g:2752:1: rule__Binding__Group__0 : rule__Binding__Group__0__Impl rule__Binding__Group__1 ;
    public final void rule__Binding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2756:1: ( rule__Binding__Group__0__Impl rule__Binding__Group__1 )
            // InternalHale.g:2757:2: rule__Binding__Group__0__Impl rule__Binding__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalHale.g:2764:1: rule__Binding__Group__0__Impl : ( 'let' ) ;
    public final void rule__Binding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2768:1: ( ( 'let' ) )
            // InternalHale.g:2769:1: ( 'let' )
            {
            // InternalHale.g:2769:1: ( 'let' )
            // InternalHale.g:2770:2: 'let'
            {
             before(grammarAccess.getBindingAccess().getLetKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalHale.g:2779:1: rule__Binding__Group__1 : rule__Binding__Group__1__Impl rule__Binding__Group__2 ;
    public final void rule__Binding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2783:1: ( rule__Binding__Group__1__Impl rule__Binding__Group__2 )
            // InternalHale.g:2784:2: rule__Binding__Group__1__Impl rule__Binding__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalHale.g:2791:1: rule__Binding__Group__1__Impl : ( ( rule__Binding__MutableAssignment_1 )? ) ;
    public final void rule__Binding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2795:1: ( ( ( rule__Binding__MutableAssignment_1 )? ) )
            // InternalHale.g:2796:1: ( ( rule__Binding__MutableAssignment_1 )? )
            {
            // InternalHale.g:2796:1: ( ( rule__Binding__MutableAssignment_1 )? )
            // InternalHale.g:2797:2: ( rule__Binding__MutableAssignment_1 )?
            {
             before(grammarAccess.getBindingAccess().getMutableAssignment_1()); 
            // InternalHale.g:2798:2: ( rule__Binding__MutableAssignment_1 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==37) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalHale.g:2798:3: rule__Binding__MutableAssignment_1
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
    // InternalHale.g:2806:1: rule__Binding__Group__2 : rule__Binding__Group__2__Impl rule__Binding__Group__3 ;
    public final void rule__Binding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2810:1: ( rule__Binding__Group__2__Impl rule__Binding__Group__3 )
            // InternalHale.g:2811:2: rule__Binding__Group__2__Impl rule__Binding__Group__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalHale.g:2818:1: rule__Binding__Group__2__Impl : ( ( rule__Binding__NameAssignment_2 ) ) ;
    public final void rule__Binding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2822:1: ( ( ( rule__Binding__NameAssignment_2 ) ) )
            // InternalHale.g:2823:1: ( ( rule__Binding__NameAssignment_2 ) )
            {
            // InternalHale.g:2823:1: ( ( rule__Binding__NameAssignment_2 ) )
            // InternalHale.g:2824:2: ( rule__Binding__NameAssignment_2 )
            {
             before(grammarAccess.getBindingAccess().getNameAssignment_2()); 
            // InternalHale.g:2825:2: ( rule__Binding__NameAssignment_2 )
            // InternalHale.g:2825:3: rule__Binding__NameAssignment_2
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
    // InternalHale.g:2833:1: rule__Binding__Group__3 : rule__Binding__Group__3__Impl rule__Binding__Group__4 ;
    public final void rule__Binding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2837:1: ( rule__Binding__Group__3__Impl rule__Binding__Group__4 )
            // InternalHale.g:2838:2: rule__Binding__Group__3__Impl rule__Binding__Group__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalHale.g:2845:1: rule__Binding__Group__3__Impl : ( '=' ) ;
    public final void rule__Binding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2849:1: ( ( '=' ) )
            // InternalHale.g:2850:1: ( '=' )
            {
            // InternalHale.g:2850:1: ( '=' )
            // InternalHale.g:2851:2: '='
            {
             before(grammarAccess.getBindingAccess().getEqualsSignKeyword_3()); 
            match(input,30,FOLLOW_2); 
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
    // InternalHale.g:2860:1: rule__Binding__Group__4 : rule__Binding__Group__4__Impl ;
    public final void rule__Binding__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2864:1: ( rule__Binding__Group__4__Impl )
            // InternalHale.g:2865:2: rule__Binding__Group__4__Impl
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
    // InternalHale.g:2871:1: rule__Binding__Group__4__Impl : ( ( rule__Binding__ValueAssignment_4 ) ) ;
    public final void rule__Binding__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2875:1: ( ( ( rule__Binding__ValueAssignment_4 ) ) )
            // InternalHale.g:2876:1: ( ( rule__Binding__ValueAssignment_4 ) )
            {
            // InternalHale.g:2876:1: ( ( rule__Binding__ValueAssignment_4 ) )
            // InternalHale.g:2877:2: ( rule__Binding__ValueAssignment_4 )
            {
             before(grammarAccess.getBindingAccess().getValueAssignment_4()); 
            // InternalHale.g:2878:2: ( rule__Binding__ValueAssignment_4 )
            // InternalHale.g:2878:3: rule__Binding__ValueAssignment_4
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
    // InternalHale.g:2887:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2891:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // InternalHale.g:2892:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalHale.g:2899:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__BindingAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2903:1: ( ( ( rule__Assignment__BindingAssignment_0 ) ) )
            // InternalHale.g:2904:1: ( ( rule__Assignment__BindingAssignment_0 ) )
            {
            // InternalHale.g:2904:1: ( ( rule__Assignment__BindingAssignment_0 ) )
            // InternalHale.g:2905:2: ( rule__Assignment__BindingAssignment_0 )
            {
             before(grammarAccess.getAssignmentAccess().getBindingAssignment_0()); 
            // InternalHale.g:2906:2: ( rule__Assignment__BindingAssignment_0 )
            // InternalHale.g:2906:3: rule__Assignment__BindingAssignment_0
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
    // InternalHale.g:2914:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2918:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // InternalHale.g:2919:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalHale.g:2926:1: rule__Assignment__Group__1__Impl : ( '=' ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2930:1: ( ( '=' ) )
            // InternalHale.g:2931:1: ( '=' )
            {
            // InternalHale.g:2931:1: ( '=' )
            // InternalHale.g:2932:2: '='
            {
             before(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalHale.g:2941:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2945:1: ( rule__Assignment__Group__2__Impl )
            // InternalHale.g:2946:2: rule__Assignment__Group__2__Impl
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
    // InternalHale.g:2952:1: rule__Assignment__Group__2__Impl : ( ( rule__Assignment__ValueAssignment_2 ) ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2956:1: ( ( ( rule__Assignment__ValueAssignment_2 ) ) )
            // InternalHale.g:2957:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            {
            // InternalHale.g:2957:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            // InternalHale.g:2958:2: ( rule__Assignment__ValueAssignment_2 )
            {
             before(grammarAccess.getAssignmentAccess().getValueAssignment_2()); 
            // InternalHale.g:2959:2: ( rule__Assignment__ValueAssignment_2 )
            // InternalHale.g:2959:3: rule__Assignment__ValueAssignment_2
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


    // $ANTLR start "rule__Print__Group__0"
    // InternalHale.g:2968:1: rule__Print__Group__0 : rule__Print__Group__0__Impl rule__Print__Group__1 ;
    public final void rule__Print__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2972:1: ( rule__Print__Group__0__Impl rule__Print__Group__1 )
            // InternalHale.g:2973:2: rule__Print__Group__0__Impl rule__Print__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalHale.g:2980:1: rule__Print__Group__0__Impl : ( 'print' ) ;
    public final void rule__Print__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2984:1: ( ( 'print' ) )
            // InternalHale.g:2985:1: ( 'print' )
            {
            // InternalHale.g:2985:1: ( 'print' )
            // InternalHale.g:2986:2: 'print'
            {
             before(grammarAccess.getPrintAccess().getPrintKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalHale.g:2995:1: rule__Print__Group__1 : rule__Print__Group__1__Impl ;
    public final void rule__Print__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2999:1: ( rule__Print__Group__1__Impl )
            // InternalHale.g:3000:2: rule__Print__Group__1__Impl
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
    // InternalHale.g:3006:1: rule__Print__Group__1__Impl : ( ( rule__Print__ValueAssignment_1 ) ) ;
    public final void rule__Print__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3010:1: ( ( ( rule__Print__ValueAssignment_1 ) ) )
            // InternalHale.g:3011:1: ( ( rule__Print__ValueAssignment_1 ) )
            {
            // InternalHale.g:3011:1: ( ( rule__Print__ValueAssignment_1 ) )
            // InternalHale.g:3012:2: ( rule__Print__ValueAssignment_1 )
            {
             before(grammarAccess.getPrintAccess().getValueAssignment_1()); 
            // InternalHale.g:3013:2: ( rule__Print__ValueAssignment_1 )
            // InternalHale.g:3013:3: rule__Print__ValueAssignment_1
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


    // $ANTLR start "rule__If__Group__0"
    // InternalHale.g:3022:1: rule__If__Group__0 : rule__If__Group__0__Impl rule__If__Group__1 ;
    public final void rule__If__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3026:1: ( rule__If__Group__0__Impl rule__If__Group__1 )
            // InternalHale.g:3027:2: rule__If__Group__0__Impl rule__If__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalHale.g:3034:1: rule__If__Group__0__Impl : ( 'if' ) ;
    public final void rule__If__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3038:1: ( ( 'if' ) )
            // InternalHale.g:3039:1: ( 'if' )
            {
            // InternalHale.g:3039:1: ( 'if' )
            // InternalHale.g:3040:2: 'if'
            {
             before(grammarAccess.getIfAccess().getIfKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalHale.g:3049:1: rule__If__Group__1 : rule__If__Group__1__Impl rule__If__Group__2 ;
    public final void rule__If__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3053:1: ( rule__If__Group__1__Impl rule__If__Group__2 )
            // InternalHale.g:3054:2: rule__If__Group__1__Impl rule__If__Group__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalHale.g:3061:1: rule__If__Group__1__Impl : ( ( rule__If__ConditionsAssignment_1 ) ) ;
    public final void rule__If__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3065:1: ( ( ( rule__If__ConditionsAssignment_1 ) ) )
            // InternalHale.g:3066:1: ( ( rule__If__ConditionsAssignment_1 ) )
            {
            // InternalHale.g:3066:1: ( ( rule__If__ConditionsAssignment_1 ) )
            // InternalHale.g:3067:2: ( rule__If__ConditionsAssignment_1 )
            {
             before(grammarAccess.getIfAccess().getConditionsAssignment_1()); 
            // InternalHale.g:3068:2: ( rule__If__ConditionsAssignment_1 )
            // InternalHale.g:3068:3: rule__If__ConditionsAssignment_1
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
    // InternalHale.g:3076:1: rule__If__Group__2 : rule__If__Group__2__Impl rule__If__Group__3 ;
    public final void rule__If__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3080:1: ( rule__If__Group__2__Impl rule__If__Group__3 )
            // InternalHale.g:3081:2: rule__If__Group__2__Impl rule__If__Group__3
            {
            pushFollow(FOLLOW_33);
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
    // InternalHale.g:3088:1: rule__If__Group__2__Impl : ( ( rule__If__IfBlocksAssignment_2 ) ) ;
    public final void rule__If__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3092:1: ( ( ( rule__If__IfBlocksAssignment_2 ) ) )
            // InternalHale.g:3093:1: ( ( rule__If__IfBlocksAssignment_2 ) )
            {
            // InternalHale.g:3093:1: ( ( rule__If__IfBlocksAssignment_2 ) )
            // InternalHale.g:3094:2: ( rule__If__IfBlocksAssignment_2 )
            {
             before(grammarAccess.getIfAccess().getIfBlocksAssignment_2()); 
            // InternalHale.g:3095:2: ( rule__If__IfBlocksAssignment_2 )
            // InternalHale.g:3095:3: rule__If__IfBlocksAssignment_2
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
    // InternalHale.g:3103:1: rule__If__Group__3 : rule__If__Group__3__Impl rule__If__Group__4 ;
    public final void rule__If__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3107:1: ( rule__If__Group__3__Impl rule__If__Group__4 )
            // InternalHale.g:3108:2: rule__If__Group__3__Impl rule__If__Group__4
            {
            pushFollow(FOLLOW_33);
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
    // InternalHale.g:3115:1: rule__If__Group__3__Impl : ( ( rule__If__Group_3__0 )* ) ;
    public final void rule__If__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3119:1: ( ( ( rule__If__Group_3__0 )* ) )
            // InternalHale.g:3120:1: ( ( rule__If__Group_3__0 )* )
            {
            // InternalHale.g:3120:1: ( ( rule__If__Group_3__0 )* )
            // InternalHale.g:3121:2: ( rule__If__Group_3__0 )*
            {
             before(grammarAccess.getIfAccess().getGroup_3()); 
            // InternalHale.g:3122:2: ( rule__If__Group_3__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==33) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalHale.g:3122:3: rule__If__Group_3__0
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__If__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalHale.g:3130:1: rule__If__Group__4 : rule__If__Group__4__Impl ;
    public final void rule__If__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3134:1: ( rule__If__Group__4__Impl )
            // InternalHale.g:3135:2: rule__If__Group__4__Impl
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
    // InternalHale.g:3141:1: rule__If__Group__4__Impl : ( ( rule__If__Group_4__0 )? ) ;
    public final void rule__If__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3145:1: ( ( ( rule__If__Group_4__0 )? ) )
            // InternalHale.g:3146:1: ( ( rule__If__Group_4__0 )? )
            {
            // InternalHale.g:3146:1: ( ( rule__If__Group_4__0 )? )
            // InternalHale.g:3147:2: ( rule__If__Group_4__0 )?
            {
             before(grammarAccess.getIfAccess().getGroup_4()); 
            // InternalHale.g:3148:2: ( rule__If__Group_4__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==34) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalHale.g:3148:3: rule__If__Group_4__0
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
    // InternalHale.g:3157:1: rule__If__Group_3__0 : rule__If__Group_3__0__Impl rule__If__Group_3__1 ;
    public final void rule__If__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3161:1: ( rule__If__Group_3__0__Impl rule__If__Group_3__1 )
            // InternalHale.g:3162:2: rule__If__Group_3__0__Impl rule__If__Group_3__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalHale.g:3169:1: rule__If__Group_3__0__Impl : ( 'elseif' ) ;
    public final void rule__If__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3173:1: ( ( 'elseif' ) )
            // InternalHale.g:3174:1: ( 'elseif' )
            {
            // InternalHale.g:3174:1: ( 'elseif' )
            // InternalHale.g:3175:2: 'elseif'
            {
             before(grammarAccess.getIfAccess().getElseifKeyword_3_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalHale.g:3184:1: rule__If__Group_3__1 : rule__If__Group_3__1__Impl rule__If__Group_3__2 ;
    public final void rule__If__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3188:1: ( rule__If__Group_3__1__Impl rule__If__Group_3__2 )
            // InternalHale.g:3189:2: rule__If__Group_3__1__Impl rule__If__Group_3__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalHale.g:3196:1: rule__If__Group_3__1__Impl : ( ( rule__If__ConditionsAssignment_3_1 ) ) ;
    public final void rule__If__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3200:1: ( ( ( rule__If__ConditionsAssignment_3_1 ) ) )
            // InternalHale.g:3201:1: ( ( rule__If__ConditionsAssignment_3_1 ) )
            {
            // InternalHale.g:3201:1: ( ( rule__If__ConditionsAssignment_3_1 ) )
            // InternalHale.g:3202:2: ( rule__If__ConditionsAssignment_3_1 )
            {
             before(grammarAccess.getIfAccess().getConditionsAssignment_3_1()); 
            // InternalHale.g:3203:2: ( rule__If__ConditionsAssignment_3_1 )
            // InternalHale.g:3203:3: rule__If__ConditionsAssignment_3_1
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
    // InternalHale.g:3211:1: rule__If__Group_3__2 : rule__If__Group_3__2__Impl ;
    public final void rule__If__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3215:1: ( rule__If__Group_3__2__Impl )
            // InternalHale.g:3216:2: rule__If__Group_3__2__Impl
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
    // InternalHale.g:3222:1: rule__If__Group_3__2__Impl : ( ( rule__If__IfBlocksAssignment_3_2 ) ) ;
    public final void rule__If__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3226:1: ( ( ( rule__If__IfBlocksAssignment_3_2 ) ) )
            // InternalHale.g:3227:1: ( ( rule__If__IfBlocksAssignment_3_2 ) )
            {
            // InternalHale.g:3227:1: ( ( rule__If__IfBlocksAssignment_3_2 ) )
            // InternalHale.g:3228:2: ( rule__If__IfBlocksAssignment_3_2 )
            {
             before(grammarAccess.getIfAccess().getIfBlocksAssignment_3_2()); 
            // InternalHale.g:3229:2: ( rule__If__IfBlocksAssignment_3_2 )
            // InternalHale.g:3229:3: rule__If__IfBlocksAssignment_3_2
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
    // InternalHale.g:3238:1: rule__If__Group_4__0 : rule__If__Group_4__0__Impl rule__If__Group_4__1 ;
    public final void rule__If__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3242:1: ( rule__If__Group_4__0__Impl rule__If__Group_4__1 )
            // InternalHale.g:3243:2: rule__If__Group_4__0__Impl rule__If__Group_4__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalHale.g:3250:1: rule__If__Group_4__0__Impl : ( 'else' ) ;
    public final void rule__If__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3254:1: ( ( 'else' ) )
            // InternalHale.g:3255:1: ( 'else' )
            {
            // InternalHale.g:3255:1: ( 'else' )
            // InternalHale.g:3256:2: 'else'
            {
             before(grammarAccess.getIfAccess().getElseKeyword_4_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalHale.g:3265:1: rule__If__Group_4__1 : rule__If__Group_4__1__Impl ;
    public final void rule__If__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3269:1: ( rule__If__Group_4__1__Impl )
            // InternalHale.g:3270:2: rule__If__Group_4__1__Impl
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
    // InternalHale.g:3276:1: rule__If__Group_4__1__Impl : ( ( rule__If__ElseBlockAssignment_4_1 ) ) ;
    public final void rule__If__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3280:1: ( ( ( rule__If__ElseBlockAssignment_4_1 ) ) )
            // InternalHale.g:3281:1: ( ( rule__If__ElseBlockAssignment_4_1 ) )
            {
            // InternalHale.g:3281:1: ( ( rule__If__ElseBlockAssignment_4_1 ) )
            // InternalHale.g:3282:2: ( rule__If__ElseBlockAssignment_4_1 )
            {
             before(grammarAccess.getIfAccess().getElseBlockAssignment_4_1()); 
            // InternalHale.g:3283:2: ( rule__If__ElseBlockAssignment_4_1 )
            // InternalHale.g:3283:3: rule__If__ElseBlockAssignment_4_1
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


    // $ANTLR start "rule__BracedBlock__Group__0"
    // InternalHale.g:3292:1: rule__BracedBlock__Group__0 : rule__BracedBlock__Group__0__Impl rule__BracedBlock__Group__1 ;
    public final void rule__BracedBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3296:1: ( rule__BracedBlock__Group__0__Impl rule__BracedBlock__Group__1 )
            // InternalHale.g:3297:2: rule__BracedBlock__Group__0__Impl rule__BracedBlock__Group__1
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
    // InternalHale.g:3304:1: rule__BracedBlock__Group__0__Impl : ( '{' ) ;
    public final void rule__BracedBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3308:1: ( ( '{' ) )
            // InternalHale.g:3309:1: ( '{' )
            {
            // InternalHale.g:3309:1: ( '{' )
            // InternalHale.g:3310:2: '{'
            {
             before(grammarAccess.getBracedBlockAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalHale.g:3319:1: rule__BracedBlock__Group__1 : rule__BracedBlock__Group__1__Impl rule__BracedBlock__Group__2 ;
    public final void rule__BracedBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3323:1: ( rule__BracedBlock__Group__1__Impl rule__BracedBlock__Group__2 )
            // InternalHale.g:3324:2: rule__BracedBlock__Group__1__Impl rule__BracedBlock__Group__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalHale.g:3331:1: rule__BracedBlock__Group__1__Impl : ( ruleBlock ) ;
    public final void rule__BracedBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3335:1: ( ( ruleBlock ) )
            // InternalHale.g:3336:1: ( ruleBlock )
            {
            // InternalHale.g:3336:1: ( ruleBlock )
            // InternalHale.g:3337:2: ruleBlock
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
    // InternalHale.g:3346:1: rule__BracedBlock__Group__2 : rule__BracedBlock__Group__2__Impl ;
    public final void rule__BracedBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3350:1: ( rule__BracedBlock__Group__2__Impl )
            // InternalHale.g:3351:2: rule__BracedBlock__Group__2__Impl
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
    // InternalHale.g:3357:1: rule__BracedBlock__Group__2__Impl : ( '}' ) ;
    public final void rule__BracedBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3361:1: ( ( '}' ) )
            // InternalHale.g:3362:1: ( '}' )
            {
            // InternalHale.g:3362:1: ( '}' )
            // InternalHale.g:3363:2: '}'
            {
             before(grammarAccess.getBracedBlockAccess().getRightCurlyBracketKeyword_2()); 
            match(input,36,FOLLOW_2); 
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


    // $ANTLR start "rule__Hale__BlockAssignment_1"
    // InternalHale.g:3373:1: rule__Hale__BlockAssignment_1 : ( ruleBlock ) ;
    public final void rule__Hale__BlockAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3377:1: ( ( ruleBlock ) )
            // InternalHale.g:3378:2: ( ruleBlock )
            {
            // InternalHale.g:3378:2: ( ruleBlock )
            // InternalHale.g:3379:3: ruleBlock
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


    // $ANTLR start "rule__Block__StatementsAssignment_1"
    // InternalHale.g:3388:1: rule__Block__StatementsAssignment_1 : ( ruleStatement ) ;
    public final void rule__Block__StatementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3392:1: ( ( ruleStatement ) )
            // InternalHale.g:3393:2: ( ruleStatement )
            {
            // InternalHale.g:3393:2: ( ruleStatement )
            // InternalHale.g:3394:3: ruleStatement
            {
             before(grammarAccess.getBlockAccess().getStatementsStatementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getBlockAccess().getStatementsStatementParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__StatementsAssignment_1"


    // $ANTLR start "rule__Expression7__RightAssignment_1_0_2"
    // InternalHale.g:3403:1: rule__Expression7__RightAssignment_1_0_2 : ( ruleExpression6 ) ;
    public final void rule__Expression7__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3407:1: ( ( ruleExpression6 ) )
            // InternalHale.g:3408:2: ( ruleExpression6 )
            {
            // InternalHale.g:3408:2: ( ruleExpression6 )
            // InternalHale.g:3409:3: ruleExpression6
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
    // InternalHale.g:3418:1: rule__Expression7__RightAssignment_1_1_2 : ( ruleExpression6 ) ;
    public final void rule__Expression7__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3422:1: ( ( ruleExpression6 ) )
            // InternalHale.g:3423:2: ( ruleExpression6 )
            {
            // InternalHale.g:3423:2: ( ruleExpression6 )
            // InternalHale.g:3424:3: ruleExpression6
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
    // InternalHale.g:3433:1: rule__Expression6__RightAssignment_1_0_2 : ( ruleExpression5 ) ;
    public final void rule__Expression6__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3437:1: ( ( ruleExpression5 ) )
            // InternalHale.g:3438:2: ( ruleExpression5 )
            {
            // InternalHale.g:3438:2: ( ruleExpression5 )
            // InternalHale.g:3439:3: ruleExpression5
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
    // InternalHale.g:3448:1: rule__Expression6__RightAssignment_1_1_2 : ( ruleExpression5 ) ;
    public final void rule__Expression6__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3452:1: ( ( ruleExpression5 ) )
            // InternalHale.g:3453:2: ( ruleExpression5 )
            {
            // InternalHale.g:3453:2: ( ruleExpression5 )
            // InternalHale.g:3454:3: ruleExpression5
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
    // InternalHale.g:3463:1: rule__Expression5__RightAssignment_1_0_2 : ( ruleExpression4 ) ;
    public final void rule__Expression5__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3467:1: ( ( ruleExpression4 ) )
            // InternalHale.g:3468:2: ( ruleExpression4 )
            {
            // InternalHale.g:3468:2: ( ruleExpression4 )
            // InternalHale.g:3469:3: ruleExpression4
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
    // InternalHale.g:3478:1: rule__Expression5__RightAssignment_1_1_2 : ( ruleExpression4 ) ;
    public final void rule__Expression5__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3482:1: ( ( ruleExpression4 ) )
            // InternalHale.g:3483:2: ( ruleExpression4 )
            {
            // InternalHale.g:3483:2: ( ruleExpression4 )
            // InternalHale.g:3484:3: ruleExpression4
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
    // InternalHale.g:3493:1: rule__Expression5__RightAssignment_1_2_2 : ( ruleExpression4 ) ;
    public final void rule__Expression5__RightAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3497:1: ( ( ruleExpression4 ) )
            // InternalHale.g:3498:2: ( ruleExpression4 )
            {
            // InternalHale.g:3498:2: ( ruleExpression4 )
            // InternalHale.g:3499:3: ruleExpression4
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
    // InternalHale.g:3508:1: rule__Expression5__RightAssignment_1_3_2 : ( ruleExpression4 ) ;
    public final void rule__Expression5__RightAssignment_1_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3512:1: ( ( ruleExpression4 ) )
            // InternalHale.g:3513:2: ( ruleExpression4 )
            {
            // InternalHale.g:3513:2: ( ruleExpression4 )
            // InternalHale.g:3514:3: ruleExpression4
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
    // InternalHale.g:3523:1: rule__Expression4__RightAssignment_1_0_2 : ( ruleExpression3 ) ;
    public final void rule__Expression4__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3527:1: ( ( ruleExpression3 ) )
            // InternalHale.g:3528:2: ( ruleExpression3 )
            {
            // InternalHale.g:3528:2: ( ruleExpression3 )
            // InternalHale.g:3529:3: ruleExpression3
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
    // InternalHale.g:3538:1: rule__Expression4__RightAssignment_1_1_2 : ( ruleExpression3 ) ;
    public final void rule__Expression4__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3542:1: ( ( ruleExpression3 ) )
            // InternalHale.g:3543:2: ( ruleExpression3 )
            {
            // InternalHale.g:3543:2: ( ruleExpression3 )
            // InternalHale.g:3544:3: ruleExpression3
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
    // InternalHale.g:3553:1: rule__Expression3__RightAssignment_1_0_2 : ( ruleExpression2 ) ;
    public final void rule__Expression3__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3557:1: ( ( ruleExpression2 ) )
            // InternalHale.g:3558:2: ( ruleExpression2 )
            {
            // InternalHale.g:3558:2: ( ruleExpression2 )
            // InternalHale.g:3559:3: ruleExpression2
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
    // InternalHale.g:3568:1: rule__Expression3__RightAssignment_1_1_2 : ( ruleExpression2 ) ;
    public final void rule__Expression3__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3572:1: ( ( ruleExpression2 ) )
            // InternalHale.g:3573:2: ( ruleExpression2 )
            {
            // InternalHale.g:3573:2: ( ruleExpression2 )
            // InternalHale.g:3574:3: ruleExpression2
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
    // InternalHale.g:3583:1: rule__Expression3__RightAssignment_1_2_2 : ( ruleExpression2 ) ;
    public final void rule__Expression3__RightAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3587:1: ( ( ruleExpression2 ) )
            // InternalHale.g:3588:2: ( ruleExpression2 )
            {
            // InternalHale.g:3588:2: ( ruleExpression2 )
            // InternalHale.g:3589:3: ruleExpression2
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
    // InternalHale.g:3598:1: rule__Expression2__RightAssignment_1_2 : ( ruleExpression1 ) ;
    public final void rule__Expression2__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3602:1: ( ( ruleExpression1 ) )
            // InternalHale.g:3603:2: ( ruleExpression1 )
            {
            // InternalHale.g:3603:2: ( ruleExpression1 )
            // InternalHale.g:3604:3: ruleExpression1
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
    // InternalHale.g:3613:1: rule__Expression1__InnerAssignment_0_2 : ( ruleExpression1 ) ;
    public final void rule__Expression1__InnerAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3617:1: ( ( ruleExpression1 ) )
            // InternalHale.g:3618:2: ( ruleExpression1 )
            {
            // InternalHale.g:3618:2: ( ruleExpression1 )
            // InternalHale.g:3619:3: ruleExpression1
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
    // InternalHale.g:3628:1: rule__Expression1__InnerAssignment_1_2 : ( ruleExpression1 ) ;
    public final void rule__Expression1__InnerAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3632:1: ( ( ruleExpression1 ) )
            // InternalHale.g:3633:2: ( ruleExpression1 )
            {
            // InternalHale.g:3633:2: ( ruleExpression1 )
            // InternalHale.g:3634:3: ruleExpression1
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
    // InternalHale.g:3643:1: rule__NumberLiteral__ValueAssignment : ( RULE_INT ) ;
    public final void rule__NumberLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3647:1: ( ( RULE_INT ) )
            // InternalHale.g:3648:2: ( RULE_INT )
            {
            // InternalHale.g:3648:2: ( RULE_INT )
            // InternalHale.g:3649:3: RULE_INT
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
    // InternalHale.g:3658:1: rule__StringLiteral__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3662:1: ( ( RULE_STRING ) )
            // InternalHale.g:3663:2: ( RULE_STRING )
            {
            // InternalHale.g:3663:2: ( RULE_STRING )
            // InternalHale.g:3664:3: RULE_STRING
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
    // InternalHale.g:3673:1: rule__Binding__MutableAssignment_1 : ( ( 'mut' ) ) ;
    public final void rule__Binding__MutableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3677:1: ( ( ( 'mut' ) ) )
            // InternalHale.g:3678:2: ( ( 'mut' ) )
            {
            // InternalHale.g:3678:2: ( ( 'mut' ) )
            // InternalHale.g:3679:3: ( 'mut' )
            {
             before(grammarAccess.getBindingAccess().getMutableMutKeyword_1_0()); 
            // InternalHale.g:3680:3: ( 'mut' )
            // InternalHale.g:3681:4: 'mut'
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
    // InternalHale.g:3692:1: rule__Binding__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Binding__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3696:1: ( ( RULE_ID ) )
            // InternalHale.g:3697:2: ( RULE_ID )
            {
            // InternalHale.g:3697:2: ( RULE_ID )
            // InternalHale.g:3698:3: RULE_ID
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
    // InternalHale.g:3707:1: rule__Binding__ValueAssignment_4 : ( ruleExpression ) ;
    public final void rule__Binding__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3711:1: ( ( ruleExpression ) )
            // InternalHale.g:3712:2: ( ruleExpression )
            {
            // InternalHale.g:3712:2: ( ruleExpression )
            // InternalHale.g:3713:3: ruleExpression
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
    // InternalHale.g:3722:1: rule__BindingReference__BindingAssignment : ( ( RULE_ID ) ) ;
    public final void rule__BindingReference__BindingAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3726:1: ( ( ( RULE_ID ) ) )
            // InternalHale.g:3727:2: ( ( RULE_ID ) )
            {
            // InternalHale.g:3727:2: ( ( RULE_ID ) )
            // InternalHale.g:3728:3: ( RULE_ID )
            {
             before(grammarAccess.getBindingReferenceAccess().getBindingBindingCrossReference_0()); 
            // InternalHale.g:3729:3: ( RULE_ID )
            // InternalHale.g:3730:4: RULE_ID
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
    // InternalHale.g:3741:1: rule__Assignment__BindingAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Assignment__BindingAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3745:1: ( ( ( RULE_ID ) ) )
            // InternalHale.g:3746:2: ( ( RULE_ID ) )
            {
            // InternalHale.g:3746:2: ( ( RULE_ID ) )
            // InternalHale.g:3747:3: ( RULE_ID )
            {
             before(grammarAccess.getAssignmentAccess().getBindingBindingCrossReference_0_0()); 
            // InternalHale.g:3748:3: ( RULE_ID )
            // InternalHale.g:3749:4: RULE_ID
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
    // InternalHale.g:3760:1: rule__Assignment__ValueAssignment_2 : ( ruleExpression ) ;
    public final void rule__Assignment__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3764:1: ( ( ruleExpression ) )
            // InternalHale.g:3765:2: ( ruleExpression )
            {
            // InternalHale.g:3765:2: ( ruleExpression )
            // InternalHale.g:3766:3: ruleExpression
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


    // $ANTLR start "rule__Print__ValueAssignment_1"
    // InternalHale.g:3775:1: rule__Print__ValueAssignment_1 : ( ruleExpression ) ;
    public final void rule__Print__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3779:1: ( ( ruleExpression ) )
            // InternalHale.g:3780:2: ( ruleExpression )
            {
            // InternalHale.g:3780:2: ( ruleExpression )
            // InternalHale.g:3781:3: ruleExpression
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


    // $ANTLR start "rule__If__ConditionsAssignment_1"
    // InternalHale.g:3790:1: rule__If__ConditionsAssignment_1 : ( ruleExpression ) ;
    public final void rule__If__ConditionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3794:1: ( ( ruleExpression ) )
            // InternalHale.g:3795:2: ( ruleExpression )
            {
            // InternalHale.g:3795:2: ( ruleExpression )
            // InternalHale.g:3796:3: ruleExpression
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
    // InternalHale.g:3805:1: rule__If__IfBlocksAssignment_2 : ( ruleBracedBlock ) ;
    public final void rule__If__IfBlocksAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3809:1: ( ( ruleBracedBlock ) )
            // InternalHale.g:3810:2: ( ruleBracedBlock )
            {
            // InternalHale.g:3810:2: ( ruleBracedBlock )
            // InternalHale.g:3811:3: ruleBracedBlock
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
    // InternalHale.g:3820:1: rule__If__ConditionsAssignment_3_1 : ( ruleExpression ) ;
    public final void rule__If__ConditionsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3824:1: ( ( ruleExpression ) )
            // InternalHale.g:3825:2: ( ruleExpression )
            {
            // InternalHale.g:3825:2: ( ruleExpression )
            // InternalHale.g:3826:3: ruleExpression
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
    // InternalHale.g:3835:1: rule__If__IfBlocksAssignment_3_2 : ( ruleBracedBlock ) ;
    public final void rule__If__IfBlocksAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3839:1: ( ( ruleBracedBlock ) )
            // InternalHale.g:3840:2: ( ruleBracedBlock )
            {
            // InternalHale.g:3840:2: ( ruleBracedBlock )
            // InternalHale.g:3841:3: ruleBracedBlock
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
    // InternalHale.g:3850:1: rule__If__ElseBlockAssignment_4_1 : ( ruleBracedBlock ) ;
    public final void rule__If__ElseBlockAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3854:1: ( ( ruleBracedBlock ) )
            // InternalHale.g:3855:2: ( ruleBracedBlock )
            {
            // InternalHale.g:3855:2: ( ruleBracedBlock )
            // InternalHale.g:3856:3: ruleBracedBlock
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000001AC200870L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000001AC200872L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000C200070L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000000F0000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000000F0002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001C00000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001C00002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000002000000040L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000001000000000L});

}