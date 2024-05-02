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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BOOLEAN", "RULE_DOUBLE", "RULE_STRING", "RULE_PRIMITIVE_TYPE", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "';'", "'{'", "'}'", "'.'", "'and'", "'or'", "'=='", "'!='", "'<='", "'<'", "'>='", "'>'", "'+'", "'-'", "'*'", "'/'", "'%'", "'**'", "'as'", "'not'", "'('", "')'", "','", "'void'", "':'", "'Function'", "'?'", "'let'", "'='", "'input'", "'print'", "'if'", "'else'", "'elseif'", "'while'", "'break'", "'function'", "'return'", "'throw'", "'mut'"
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
    // InternalHale.g:162:1: ruleExpression : ( ruleExpression10 ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:166:2: ( ( ruleExpression10 ) )
            // InternalHale.g:167:2: ( ruleExpression10 )
            {
            // InternalHale.g:167:2: ( ruleExpression10 )
            // InternalHale.g:168:3: ruleExpression10
            {
             before(grammarAccess.getExpressionAccess().getExpression10ParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleExpression10();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getExpression10ParserRuleCall()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleExpression10"
    // InternalHale.g:178:1: entryRuleExpression10 : ruleExpression10 EOF ;
    public final void entryRuleExpression10() throws RecognitionException {
        try {
            // InternalHale.g:179:1: ( ruleExpression10 EOF )
            // InternalHale.g:180:1: ruleExpression10 EOF
            {
             before(grammarAccess.getExpression10Rule()); 
            pushFollow(FOLLOW_1);
            ruleExpression10();

            state._fsp--;

             after(grammarAccess.getExpression10Rule()); 
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
    // $ANTLR end "entryRuleExpression10"


    // $ANTLR start "ruleExpression10"
    // InternalHale.g:187:1: ruleExpression10 : ( ( rule__Expression10__Group__0 ) ) ;
    public final void ruleExpression10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:191:2: ( ( ( rule__Expression10__Group__0 ) ) )
            // InternalHale.g:192:2: ( ( rule__Expression10__Group__0 ) )
            {
            // InternalHale.g:192:2: ( ( rule__Expression10__Group__0 ) )
            // InternalHale.g:193:3: ( rule__Expression10__Group__0 )
            {
             before(grammarAccess.getExpression10Access().getGroup()); 
            // InternalHale.g:194:3: ( rule__Expression10__Group__0 )
            // InternalHale.g:194:4: rule__Expression10__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression10__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpression10Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression10"


    // $ANTLR start "entryRuleExpression9"
    // InternalHale.g:203:1: entryRuleExpression9 : ruleExpression9 EOF ;
    public final void entryRuleExpression9() throws RecognitionException {
        try {
            // InternalHale.g:204:1: ( ruleExpression9 EOF )
            // InternalHale.g:205:1: ruleExpression9 EOF
            {
             before(grammarAccess.getExpression9Rule()); 
            pushFollow(FOLLOW_1);
            ruleExpression9();

            state._fsp--;

             after(grammarAccess.getExpression9Rule()); 
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
    // $ANTLR end "entryRuleExpression9"


    // $ANTLR start "ruleExpression9"
    // InternalHale.g:212:1: ruleExpression9 : ( ( rule__Expression9__Group__0 ) ) ;
    public final void ruleExpression9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:216:2: ( ( ( rule__Expression9__Group__0 ) ) )
            // InternalHale.g:217:2: ( ( rule__Expression9__Group__0 ) )
            {
            // InternalHale.g:217:2: ( ( rule__Expression9__Group__0 ) )
            // InternalHale.g:218:3: ( rule__Expression9__Group__0 )
            {
             before(grammarAccess.getExpression9Access().getGroup()); 
            // InternalHale.g:219:3: ( rule__Expression9__Group__0 )
            // InternalHale.g:219:4: rule__Expression9__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression9__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpression9Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression9"


    // $ANTLR start "entryRuleExpression8"
    // InternalHale.g:228:1: entryRuleExpression8 : ruleExpression8 EOF ;
    public final void entryRuleExpression8() throws RecognitionException {
        try {
            // InternalHale.g:229:1: ( ruleExpression8 EOF )
            // InternalHale.g:230:1: ruleExpression8 EOF
            {
             before(grammarAccess.getExpression8Rule()); 
            pushFollow(FOLLOW_1);
            ruleExpression8();

            state._fsp--;

             after(grammarAccess.getExpression8Rule()); 
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
    // $ANTLR end "entryRuleExpression8"


    // $ANTLR start "ruleExpression8"
    // InternalHale.g:237:1: ruleExpression8 : ( ( rule__Expression8__Group__0 ) ) ;
    public final void ruleExpression8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:241:2: ( ( ( rule__Expression8__Group__0 ) ) )
            // InternalHale.g:242:2: ( ( rule__Expression8__Group__0 ) )
            {
            // InternalHale.g:242:2: ( ( rule__Expression8__Group__0 ) )
            // InternalHale.g:243:3: ( rule__Expression8__Group__0 )
            {
             before(grammarAccess.getExpression8Access().getGroup()); 
            // InternalHale.g:244:3: ( rule__Expression8__Group__0 )
            // InternalHale.g:244:4: rule__Expression8__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression8__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpression8Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression8"


    // $ANTLR start "entryRuleExpression7"
    // InternalHale.g:253:1: entryRuleExpression7 : ruleExpression7 EOF ;
    public final void entryRuleExpression7() throws RecognitionException {
        try {
            // InternalHale.g:254:1: ( ruleExpression7 EOF )
            // InternalHale.g:255:1: ruleExpression7 EOF
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
    // InternalHale.g:262:1: ruleExpression7 : ( ( rule__Expression7__Group__0 ) ) ;
    public final void ruleExpression7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:266:2: ( ( ( rule__Expression7__Group__0 ) ) )
            // InternalHale.g:267:2: ( ( rule__Expression7__Group__0 ) )
            {
            // InternalHale.g:267:2: ( ( rule__Expression7__Group__0 ) )
            // InternalHale.g:268:3: ( rule__Expression7__Group__0 )
            {
             before(grammarAccess.getExpression7Access().getGroup()); 
            // InternalHale.g:269:3: ( rule__Expression7__Group__0 )
            // InternalHale.g:269:4: rule__Expression7__Group__0
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
    // InternalHale.g:278:1: entryRuleExpression6 : ruleExpression6 EOF ;
    public final void entryRuleExpression6() throws RecognitionException {
        try {
            // InternalHale.g:279:1: ( ruleExpression6 EOF )
            // InternalHale.g:280:1: ruleExpression6 EOF
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
    // InternalHale.g:287:1: ruleExpression6 : ( ( rule__Expression6__Group__0 ) ) ;
    public final void ruleExpression6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:291:2: ( ( ( rule__Expression6__Group__0 ) ) )
            // InternalHale.g:292:2: ( ( rule__Expression6__Group__0 ) )
            {
            // InternalHale.g:292:2: ( ( rule__Expression6__Group__0 ) )
            // InternalHale.g:293:3: ( rule__Expression6__Group__0 )
            {
             before(grammarAccess.getExpression6Access().getGroup()); 
            // InternalHale.g:294:3: ( rule__Expression6__Group__0 )
            // InternalHale.g:294:4: rule__Expression6__Group__0
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
    // InternalHale.g:303:1: entryRuleExpression5 : ruleExpression5 EOF ;
    public final void entryRuleExpression5() throws RecognitionException {
        try {
            // InternalHale.g:304:1: ( ruleExpression5 EOF )
            // InternalHale.g:305:1: ruleExpression5 EOF
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
    // InternalHale.g:312:1: ruleExpression5 : ( ( rule__Expression5__Group__0 ) ) ;
    public final void ruleExpression5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:316:2: ( ( ( rule__Expression5__Group__0 ) ) )
            // InternalHale.g:317:2: ( ( rule__Expression5__Group__0 ) )
            {
            // InternalHale.g:317:2: ( ( rule__Expression5__Group__0 ) )
            // InternalHale.g:318:3: ( rule__Expression5__Group__0 )
            {
             before(grammarAccess.getExpression5Access().getGroup()); 
            // InternalHale.g:319:3: ( rule__Expression5__Group__0 )
            // InternalHale.g:319:4: rule__Expression5__Group__0
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
    // InternalHale.g:328:1: entryRuleExpression4 : ruleExpression4 EOF ;
    public final void entryRuleExpression4() throws RecognitionException {
        try {
            // InternalHale.g:329:1: ( ruleExpression4 EOF )
            // InternalHale.g:330:1: ruleExpression4 EOF
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
    // InternalHale.g:337:1: ruleExpression4 : ( ( rule__Expression4__Group__0 ) ) ;
    public final void ruleExpression4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:341:2: ( ( ( rule__Expression4__Group__0 ) ) )
            // InternalHale.g:342:2: ( ( rule__Expression4__Group__0 ) )
            {
            // InternalHale.g:342:2: ( ( rule__Expression4__Group__0 ) )
            // InternalHale.g:343:3: ( rule__Expression4__Group__0 )
            {
             before(grammarAccess.getExpression4Access().getGroup()); 
            // InternalHale.g:344:3: ( rule__Expression4__Group__0 )
            // InternalHale.g:344:4: rule__Expression4__Group__0
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
    // InternalHale.g:353:1: entryRuleExpression3 : ruleExpression3 EOF ;
    public final void entryRuleExpression3() throws RecognitionException {
        try {
            // InternalHale.g:354:1: ( ruleExpression3 EOF )
            // InternalHale.g:355:1: ruleExpression3 EOF
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
    // InternalHale.g:362:1: ruleExpression3 : ( ( rule__Expression3__Group__0 ) ) ;
    public final void ruleExpression3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:366:2: ( ( ( rule__Expression3__Group__0 ) ) )
            // InternalHale.g:367:2: ( ( rule__Expression3__Group__0 ) )
            {
            // InternalHale.g:367:2: ( ( rule__Expression3__Group__0 ) )
            // InternalHale.g:368:3: ( rule__Expression3__Group__0 )
            {
             before(grammarAccess.getExpression3Access().getGroup()); 
            // InternalHale.g:369:3: ( rule__Expression3__Group__0 )
            // InternalHale.g:369:4: rule__Expression3__Group__0
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
    // InternalHale.g:378:1: entryRuleExpression2 : ruleExpression2 EOF ;
    public final void entryRuleExpression2() throws RecognitionException {
        try {
            // InternalHale.g:379:1: ( ruleExpression2 EOF )
            // InternalHale.g:380:1: ruleExpression2 EOF
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
    // InternalHale.g:387:1: ruleExpression2 : ( ( rule__Expression2__Alternatives ) ) ;
    public final void ruleExpression2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:391:2: ( ( ( rule__Expression2__Alternatives ) ) )
            // InternalHale.g:392:2: ( ( rule__Expression2__Alternatives ) )
            {
            // InternalHale.g:392:2: ( ( rule__Expression2__Alternatives ) )
            // InternalHale.g:393:3: ( rule__Expression2__Alternatives )
            {
             before(grammarAccess.getExpression2Access().getAlternatives()); 
            // InternalHale.g:394:3: ( rule__Expression2__Alternatives )
            // InternalHale.g:394:4: rule__Expression2__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Expression2__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpression2Access().getAlternatives()); 

            }


            }

        }
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
    // InternalHale.g:403:1: entryRuleExpression1 : ruleExpression1 EOF ;
    public final void entryRuleExpression1() throws RecognitionException {
        try {
            // InternalHale.g:404:1: ( ruleExpression1 EOF )
            // InternalHale.g:405:1: ruleExpression1 EOF
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
    // InternalHale.g:412:1: ruleExpression1 : ( ( rule__Expression1__Group__0 ) ) ;
    public final void ruleExpression1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:416:2: ( ( ( rule__Expression1__Group__0 ) ) )
            // InternalHale.g:417:2: ( ( rule__Expression1__Group__0 ) )
            {
            // InternalHale.g:417:2: ( ( rule__Expression1__Group__0 ) )
            // InternalHale.g:418:3: ( rule__Expression1__Group__0 )
            {
             before(grammarAccess.getExpression1Access().getGroup()); 
            // InternalHale.g:419:3: ( rule__Expression1__Group__0 )
            // InternalHale.g:419:4: rule__Expression1__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression1__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpression1Access().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleExpression0"
    // InternalHale.g:428:1: entryRuleExpression0 : ruleExpression0 EOF ;
    public final void entryRuleExpression0() throws RecognitionException {
        try {
            // InternalHale.g:429:1: ( ruleExpression0 EOF )
            // InternalHale.g:430:1: ruleExpression0 EOF
            {
             before(grammarAccess.getExpression0Rule()); 
            pushFollow(FOLLOW_1);
            ruleExpression0();

            state._fsp--;

             after(grammarAccess.getExpression0Rule()); 
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
    // $ANTLR end "entryRuleExpression0"


    // $ANTLR start "ruleExpression0"
    // InternalHale.g:437:1: ruleExpression0 : ( ( rule__Expression0__Alternatives ) ) ;
    public final void ruleExpression0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:441:2: ( ( ( rule__Expression0__Alternatives ) ) )
            // InternalHale.g:442:2: ( ( rule__Expression0__Alternatives ) )
            {
            // InternalHale.g:442:2: ( ( rule__Expression0__Alternatives ) )
            // InternalHale.g:443:3: ( rule__Expression0__Alternatives )
            {
             before(grammarAccess.getExpression0Access().getAlternatives()); 
            // InternalHale.g:444:3: ( rule__Expression0__Alternatives )
            // InternalHale.g:444:4: rule__Expression0__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Expression0__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpression0Access().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression0"


    // $ANTLR start "entryRuleLiteral"
    // InternalHale.g:453:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // InternalHale.g:454:1: ( ruleLiteral EOF )
            // InternalHale.g:455:1: ruleLiteral EOF
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
    // InternalHale.g:462:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:466:2: ( ( ( rule__Literal__Alternatives ) ) )
            // InternalHale.g:467:2: ( ( rule__Literal__Alternatives ) )
            {
            // InternalHale.g:467:2: ( ( rule__Literal__Alternatives ) )
            // InternalHale.g:468:3: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // InternalHale.g:469:3: ( rule__Literal__Alternatives )
            // InternalHale.g:469:4: rule__Literal__Alternatives
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


    // $ANTLR start "entryRuleVoidLiteral"
    // InternalHale.g:478:1: entryRuleVoidLiteral : ruleVoidLiteral EOF ;
    public final void entryRuleVoidLiteral() throws RecognitionException {
        try {
            // InternalHale.g:479:1: ( ruleVoidLiteral EOF )
            // InternalHale.g:480:1: ruleVoidLiteral EOF
            {
             before(grammarAccess.getVoidLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleVoidLiteral();

            state._fsp--;

             after(grammarAccess.getVoidLiteralRule()); 
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
    // $ANTLR end "entryRuleVoidLiteral"


    // $ANTLR start "ruleVoidLiteral"
    // InternalHale.g:487:1: ruleVoidLiteral : ( ( rule__VoidLiteral__Group__0 ) ) ;
    public final void ruleVoidLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:491:2: ( ( ( rule__VoidLiteral__Group__0 ) ) )
            // InternalHale.g:492:2: ( ( rule__VoidLiteral__Group__0 ) )
            {
            // InternalHale.g:492:2: ( ( rule__VoidLiteral__Group__0 ) )
            // InternalHale.g:493:3: ( rule__VoidLiteral__Group__0 )
            {
             before(grammarAccess.getVoidLiteralAccess().getGroup()); 
            // InternalHale.g:494:3: ( rule__VoidLiteral__Group__0 )
            // InternalHale.g:494:4: rule__VoidLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VoidLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVoidLiteralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVoidLiteral"


    // $ANTLR start "entryRuleBooleanLiteral"
    // InternalHale.g:503:1: entryRuleBooleanLiteral : ruleBooleanLiteral EOF ;
    public final void entryRuleBooleanLiteral() throws RecognitionException {
        try {
            // InternalHale.g:504:1: ( ruleBooleanLiteral EOF )
            // InternalHale.g:505:1: ruleBooleanLiteral EOF
            {
             before(grammarAccess.getBooleanLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleBooleanLiteral();

            state._fsp--;

             after(grammarAccess.getBooleanLiteralRule()); 
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
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // InternalHale.g:512:1: ruleBooleanLiteral : ( ( rule__BooleanLiteral__ValueAssignment ) ) ;
    public final void ruleBooleanLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:516:2: ( ( ( rule__BooleanLiteral__ValueAssignment ) ) )
            // InternalHale.g:517:2: ( ( rule__BooleanLiteral__ValueAssignment ) )
            {
            // InternalHale.g:517:2: ( ( rule__BooleanLiteral__ValueAssignment ) )
            // InternalHale.g:518:3: ( rule__BooleanLiteral__ValueAssignment )
            {
             before(grammarAccess.getBooleanLiteralAccess().getValueAssignment()); 
            // InternalHale.g:519:3: ( rule__BooleanLiteral__ValueAssignment )
            // InternalHale.g:519:4: rule__BooleanLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__BooleanLiteral__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBooleanLiteralAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "entryRuleNumberLiteral"
    // InternalHale.g:528:1: entryRuleNumberLiteral : ruleNumberLiteral EOF ;
    public final void entryRuleNumberLiteral() throws RecognitionException {
        try {
            // InternalHale.g:529:1: ( ruleNumberLiteral EOF )
            // InternalHale.g:530:1: ruleNumberLiteral EOF
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
    // InternalHale.g:537:1: ruleNumberLiteral : ( ( rule__NumberLiteral__ValueAssignment ) ) ;
    public final void ruleNumberLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:541:2: ( ( ( rule__NumberLiteral__ValueAssignment ) ) )
            // InternalHale.g:542:2: ( ( rule__NumberLiteral__ValueAssignment ) )
            {
            // InternalHale.g:542:2: ( ( rule__NumberLiteral__ValueAssignment ) )
            // InternalHale.g:543:3: ( rule__NumberLiteral__ValueAssignment )
            {
             before(grammarAccess.getNumberLiteralAccess().getValueAssignment()); 
            // InternalHale.g:544:3: ( rule__NumberLiteral__ValueAssignment )
            // InternalHale.g:544:4: rule__NumberLiteral__ValueAssignment
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
    // InternalHale.g:553:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // InternalHale.g:554:1: ( ruleStringLiteral EOF )
            // InternalHale.g:555:1: ruleStringLiteral EOF
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
    // InternalHale.g:562:1: ruleStringLiteral : ( ( rule__StringLiteral__ValueAssignment ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:566:2: ( ( ( rule__StringLiteral__ValueAssignment ) ) )
            // InternalHale.g:567:2: ( ( rule__StringLiteral__ValueAssignment ) )
            {
            // InternalHale.g:567:2: ( ( rule__StringLiteral__ValueAssignment ) )
            // InternalHale.g:568:3: ( rule__StringLiteral__ValueAssignment )
            {
             before(grammarAccess.getStringLiteralAccess().getValueAssignment()); 
            // InternalHale.g:569:3: ( rule__StringLiteral__ValueAssignment )
            // InternalHale.g:569:4: rule__StringLiteral__ValueAssignment
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


    // $ANTLR start "entryRuleTypeAnnotation"
    // InternalHale.g:578:1: entryRuleTypeAnnotation : ruleTypeAnnotation EOF ;
    public final void entryRuleTypeAnnotation() throws RecognitionException {
        try {
            // InternalHale.g:579:1: ( ruleTypeAnnotation EOF )
            // InternalHale.g:580:1: ruleTypeAnnotation EOF
            {
             before(grammarAccess.getTypeAnnotationRule()); 
            pushFollow(FOLLOW_1);
            ruleTypeAnnotation();

            state._fsp--;

             after(grammarAccess.getTypeAnnotationRule()); 
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
    // $ANTLR end "entryRuleTypeAnnotation"


    // $ANTLR start "ruleTypeAnnotation"
    // InternalHale.g:587:1: ruleTypeAnnotation : ( ( rule__TypeAnnotation__Group__0 ) ) ;
    public final void ruleTypeAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:591:2: ( ( ( rule__TypeAnnotation__Group__0 ) ) )
            // InternalHale.g:592:2: ( ( rule__TypeAnnotation__Group__0 ) )
            {
            // InternalHale.g:592:2: ( ( rule__TypeAnnotation__Group__0 ) )
            // InternalHale.g:593:3: ( rule__TypeAnnotation__Group__0 )
            {
             before(grammarAccess.getTypeAnnotationAccess().getGroup()); 
            // InternalHale.g:594:3: ( rule__TypeAnnotation__Group__0 )
            // InternalHale.g:594:4: rule__TypeAnnotation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TypeAnnotation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeAnnotationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeAnnotation"


    // $ANTLR start "entryRuleType"
    // InternalHale.g:603:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalHale.g:604:1: ( ruleType EOF )
            // InternalHale.g:605:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalHale.g:612:1: ruleType : ( ruleFunctionType ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:616:2: ( ( ruleFunctionType ) )
            // InternalHale.g:617:2: ( ruleFunctionType )
            {
            // InternalHale.g:617:2: ( ruleFunctionType )
            // InternalHale.g:618:3: ruleFunctionType
            {
             before(grammarAccess.getTypeAccess().getFunctionTypeParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleFunctionType();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getFunctionTypeParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleFunctionType"
    // InternalHale.g:628:1: entryRuleFunctionType : ruleFunctionType EOF ;
    public final void entryRuleFunctionType() throws RecognitionException {
        try {
            // InternalHale.g:629:1: ( ruleFunctionType EOF )
            // InternalHale.g:630:1: ruleFunctionType EOF
            {
             before(grammarAccess.getFunctionTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleFunctionType();

            state._fsp--;

             after(grammarAccess.getFunctionTypeRule()); 
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
    // $ANTLR end "entryRuleFunctionType"


    // $ANTLR start "ruleFunctionType"
    // InternalHale.g:637:1: ruleFunctionType : ( ( rule__FunctionType__Alternatives ) ) ;
    public final void ruleFunctionType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:641:2: ( ( ( rule__FunctionType__Alternatives ) ) )
            // InternalHale.g:642:2: ( ( rule__FunctionType__Alternatives ) )
            {
            // InternalHale.g:642:2: ( ( rule__FunctionType__Alternatives ) )
            // InternalHale.g:643:3: ( rule__FunctionType__Alternatives )
            {
             before(grammarAccess.getFunctionTypeAccess().getAlternatives()); 
            // InternalHale.g:644:3: ( rule__FunctionType__Alternatives )
            // InternalHale.g:644:4: rule__FunctionType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FunctionType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFunctionTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunctionType"


    // $ANTLR start "entryRuleEitherType"
    // InternalHale.g:653:1: entryRuleEitherType : ruleEitherType EOF ;
    public final void entryRuleEitherType() throws RecognitionException {
        try {
            // InternalHale.g:654:1: ( ruleEitherType EOF )
            // InternalHale.g:655:1: ruleEitherType EOF
            {
             before(grammarAccess.getEitherTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleEitherType();

            state._fsp--;

             after(grammarAccess.getEitherTypeRule()); 
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
    // $ANTLR end "entryRuleEitherType"


    // $ANTLR start "ruleEitherType"
    // InternalHale.g:662:1: ruleEitherType : ( ( rule__EitherType__Group__0 ) ) ;
    public final void ruleEitherType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:666:2: ( ( ( rule__EitherType__Group__0 ) ) )
            // InternalHale.g:667:2: ( ( rule__EitherType__Group__0 ) )
            {
            // InternalHale.g:667:2: ( ( rule__EitherType__Group__0 ) )
            // InternalHale.g:668:3: ( rule__EitherType__Group__0 )
            {
             before(grammarAccess.getEitherTypeAccess().getGroup()); 
            // InternalHale.g:669:3: ( rule__EitherType__Group__0 )
            // InternalHale.g:669:4: rule__EitherType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EitherType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEitherTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEitherType"


    // $ANTLR start "entryRulePrimaryType"
    // InternalHale.g:678:1: entryRulePrimaryType : rulePrimaryType EOF ;
    public final void entryRulePrimaryType() throws RecognitionException {
        try {
            // InternalHale.g:679:1: ( rulePrimaryType EOF )
            // InternalHale.g:680:1: rulePrimaryType EOF
            {
             before(grammarAccess.getPrimaryTypeRule()); 
            pushFollow(FOLLOW_1);
            rulePrimaryType();

            state._fsp--;

             after(grammarAccess.getPrimaryTypeRule()); 
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
    // $ANTLR end "entryRulePrimaryType"


    // $ANTLR start "rulePrimaryType"
    // InternalHale.g:687:1: rulePrimaryType : ( ( rule__PrimaryType__Alternatives ) ) ;
    public final void rulePrimaryType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:691:2: ( ( ( rule__PrimaryType__Alternatives ) ) )
            // InternalHale.g:692:2: ( ( rule__PrimaryType__Alternatives ) )
            {
            // InternalHale.g:692:2: ( ( rule__PrimaryType__Alternatives ) )
            // InternalHale.g:693:3: ( rule__PrimaryType__Alternatives )
            {
             before(grammarAccess.getPrimaryTypeAccess().getAlternatives()); 
            // InternalHale.g:694:3: ( rule__PrimaryType__Alternatives )
            // InternalHale.g:694:4: rule__PrimaryType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimaryType"


    // $ANTLR start "entryRulePrimitiveType"
    // InternalHale.g:703:1: entryRulePrimitiveType : rulePrimitiveType EOF ;
    public final void entryRulePrimitiveType() throws RecognitionException {
        try {
            // InternalHale.g:704:1: ( rulePrimitiveType EOF )
            // InternalHale.g:705:1: rulePrimitiveType EOF
            {
             before(grammarAccess.getPrimitiveTypeRule()); 
            pushFollow(FOLLOW_1);
            rulePrimitiveType();

            state._fsp--;

             after(grammarAccess.getPrimitiveTypeRule()); 
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
    // $ANTLR end "entryRulePrimitiveType"


    // $ANTLR start "rulePrimitiveType"
    // InternalHale.g:712:1: rulePrimitiveType : ( ( rule__PrimitiveType__Group__0 ) ) ;
    public final void rulePrimitiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:716:2: ( ( ( rule__PrimitiveType__Group__0 ) ) )
            // InternalHale.g:717:2: ( ( rule__PrimitiveType__Group__0 ) )
            {
            // InternalHale.g:717:2: ( ( rule__PrimitiveType__Group__0 ) )
            // InternalHale.g:718:3: ( rule__PrimitiveType__Group__0 )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getGroup()); 
            // InternalHale.g:719:3: ( rule__PrimitiveType__Group__0 )
            // InternalHale.g:719:4: rule__PrimitiveType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimitiveType"


    // $ANTLR start "entryRuleLetBinding"
    // InternalHale.g:728:1: entryRuleLetBinding : ruleLetBinding EOF ;
    public final void entryRuleLetBinding() throws RecognitionException {
        try {
            // InternalHale.g:729:1: ( ruleLetBinding EOF )
            // InternalHale.g:730:1: ruleLetBinding EOF
            {
             before(grammarAccess.getLetBindingRule()); 
            pushFollow(FOLLOW_1);
            ruleLetBinding();

            state._fsp--;

             after(grammarAccess.getLetBindingRule()); 
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
    // $ANTLR end "entryRuleLetBinding"


    // $ANTLR start "ruleLetBinding"
    // InternalHale.g:737:1: ruleLetBinding : ( ( rule__LetBinding__Group__0 ) ) ;
    public final void ruleLetBinding() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:741:2: ( ( ( rule__LetBinding__Group__0 ) ) )
            // InternalHale.g:742:2: ( ( rule__LetBinding__Group__0 ) )
            {
            // InternalHale.g:742:2: ( ( rule__LetBinding__Group__0 ) )
            // InternalHale.g:743:3: ( rule__LetBinding__Group__0 )
            {
             before(grammarAccess.getLetBindingAccess().getGroup()); 
            // InternalHale.g:744:3: ( rule__LetBinding__Group__0 )
            // InternalHale.g:744:4: rule__LetBinding__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LetBinding__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLetBindingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLetBinding"


    // $ANTLR start "entryRuleBindingReference"
    // InternalHale.g:753:1: entryRuleBindingReference : ruleBindingReference EOF ;
    public final void entryRuleBindingReference() throws RecognitionException {
        try {
            // InternalHale.g:754:1: ( ruleBindingReference EOF )
            // InternalHale.g:755:1: ruleBindingReference EOF
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
    // InternalHale.g:762:1: ruleBindingReference : ( ( rule__BindingReference__BindingAssignment ) ) ;
    public final void ruleBindingReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:766:2: ( ( ( rule__BindingReference__BindingAssignment ) ) )
            // InternalHale.g:767:2: ( ( rule__BindingReference__BindingAssignment ) )
            {
            // InternalHale.g:767:2: ( ( rule__BindingReference__BindingAssignment ) )
            // InternalHale.g:768:3: ( rule__BindingReference__BindingAssignment )
            {
             before(grammarAccess.getBindingReferenceAccess().getBindingAssignment()); 
            // InternalHale.g:769:3: ( rule__BindingReference__BindingAssignment )
            // InternalHale.g:769:4: rule__BindingReference__BindingAssignment
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
    // InternalHale.g:778:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // InternalHale.g:779:1: ( ruleAssignment EOF )
            // InternalHale.g:780:1: ruleAssignment EOF
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
    // InternalHale.g:787:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:791:2: ( ( ( rule__Assignment__Group__0 ) ) )
            // InternalHale.g:792:2: ( ( rule__Assignment__Group__0 ) )
            {
            // InternalHale.g:792:2: ( ( rule__Assignment__Group__0 ) )
            // InternalHale.g:793:3: ( rule__Assignment__Group__0 )
            {
             before(grammarAccess.getAssignmentAccess().getGroup()); 
            // InternalHale.g:794:3: ( rule__Assignment__Group__0 )
            // InternalHale.g:794:4: rule__Assignment__Group__0
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


    // $ANTLR start "entryRuleInput"
    // InternalHale.g:803:1: entryRuleInput : ruleInput EOF ;
    public final void entryRuleInput() throws RecognitionException {
        try {
            // InternalHale.g:804:1: ( ruleInput EOF )
            // InternalHale.g:805:1: ruleInput EOF
            {
             before(grammarAccess.getInputRule()); 
            pushFollow(FOLLOW_1);
            ruleInput();

            state._fsp--;

             after(grammarAccess.getInputRule()); 
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
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // InternalHale.g:812:1: ruleInput : ( ( rule__Input__Group__0 ) ) ;
    public final void ruleInput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:816:2: ( ( ( rule__Input__Group__0 ) ) )
            // InternalHale.g:817:2: ( ( rule__Input__Group__0 ) )
            {
            // InternalHale.g:817:2: ( ( rule__Input__Group__0 ) )
            // InternalHale.g:818:3: ( rule__Input__Group__0 )
            {
             before(grammarAccess.getInputAccess().getGroup()); 
            // InternalHale.g:819:3: ( rule__Input__Group__0 )
            // InternalHale.g:819:4: rule__Input__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Input__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRulePrint"
    // InternalHale.g:828:1: entryRulePrint : rulePrint EOF ;
    public final void entryRulePrint() throws RecognitionException {
        try {
            // InternalHale.g:829:1: ( rulePrint EOF )
            // InternalHale.g:830:1: rulePrint EOF
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
    // InternalHale.g:837:1: rulePrint : ( ( rule__Print__Group__0 ) ) ;
    public final void rulePrint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:841:2: ( ( ( rule__Print__Group__0 ) ) )
            // InternalHale.g:842:2: ( ( rule__Print__Group__0 ) )
            {
            // InternalHale.g:842:2: ( ( rule__Print__Group__0 ) )
            // InternalHale.g:843:3: ( rule__Print__Group__0 )
            {
             before(grammarAccess.getPrintAccess().getGroup()); 
            // InternalHale.g:844:3: ( rule__Print__Group__0 )
            // InternalHale.g:844:4: rule__Print__Group__0
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
    // InternalHale.g:853:1: entryRuleIf : ruleIf EOF ;
    public final void entryRuleIf() throws RecognitionException {
        try {
            // InternalHale.g:854:1: ( ruleIf EOF )
            // InternalHale.g:855:1: ruleIf EOF
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
    // InternalHale.g:862:1: ruleIf : ( ( rule__If__Group__0 ) ) ;
    public final void ruleIf() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:866:2: ( ( ( rule__If__Group__0 ) ) )
            // InternalHale.g:867:2: ( ( rule__If__Group__0 ) )
            {
            // InternalHale.g:867:2: ( ( rule__If__Group__0 ) )
            // InternalHale.g:868:3: ( rule__If__Group__0 )
            {
             before(grammarAccess.getIfAccess().getGroup()); 
            // InternalHale.g:869:3: ( rule__If__Group__0 )
            // InternalHale.g:869:4: rule__If__Group__0
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


    // $ANTLR start "entryRuleIfLet"
    // InternalHale.g:878:1: entryRuleIfLet : ruleIfLet EOF ;
    public final void entryRuleIfLet() throws RecognitionException {
        try {
            // InternalHale.g:879:1: ( ruleIfLet EOF )
            // InternalHale.g:880:1: ruleIfLet EOF
            {
             before(grammarAccess.getIfLetRule()); 
            pushFollow(FOLLOW_1);
            ruleIfLet();

            state._fsp--;

             after(grammarAccess.getIfLetRule()); 
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
    // $ANTLR end "entryRuleIfLet"


    // $ANTLR start "ruleIfLet"
    // InternalHale.g:887:1: ruleIfLet : ( ( rule__IfLet__Group__0 ) ) ;
    public final void ruleIfLet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:891:2: ( ( ( rule__IfLet__Group__0 ) ) )
            // InternalHale.g:892:2: ( ( rule__IfLet__Group__0 ) )
            {
            // InternalHale.g:892:2: ( ( rule__IfLet__Group__0 ) )
            // InternalHale.g:893:3: ( rule__IfLet__Group__0 )
            {
             before(grammarAccess.getIfLetAccess().getGroup()); 
            // InternalHale.g:894:3: ( rule__IfLet__Group__0 )
            // InternalHale.g:894:4: rule__IfLet__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IfLet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIfLetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIfLet"


    // $ANTLR start "entryRuleElseLet"
    // InternalHale.g:903:1: entryRuleElseLet : ruleElseLet EOF ;
    public final void entryRuleElseLet() throws RecognitionException {
        try {
            // InternalHale.g:904:1: ( ruleElseLet EOF )
            // InternalHale.g:905:1: ruleElseLet EOF
            {
             before(grammarAccess.getElseLetRule()); 
            pushFollow(FOLLOW_1);
            ruleElseLet();

            state._fsp--;

             after(grammarAccess.getElseLetRule()); 
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
    // $ANTLR end "entryRuleElseLet"


    // $ANTLR start "ruleElseLet"
    // InternalHale.g:912:1: ruleElseLet : ( ( rule__ElseLet__Group__0 ) ) ;
    public final void ruleElseLet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:916:2: ( ( ( rule__ElseLet__Group__0 ) ) )
            // InternalHale.g:917:2: ( ( rule__ElseLet__Group__0 ) )
            {
            // InternalHale.g:917:2: ( ( rule__ElseLet__Group__0 ) )
            // InternalHale.g:918:3: ( rule__ElseLet__Group__0 )
            {
             before(grammarAccess.getElseLetAccess().getGroup()); 
            // InternalHale.g:919:3: ( rule__ElseLet__Group__0 )
            // InternalHale.g:919:4: rule__ElseLet__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ElseLet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getElseLetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElseLet"


    // $ANTLR start "entryRuleIfConditions"
    // InternalHale.g:928:1: entryRuleIfConditions : ruleIfConditions EOF ;
    public final void entryRuleIfConditions() throws RecognitionException {
        try {
            // InternalHale.g:929:1: ( ruleIfConditions EOF )
            // InternalHale.g:930:1: ruleIfConditions EOF
            {
             before(grammarAccess.getIfConditionsRule()); 
            pushFollow(FOLLOW_1);
            ruleIfConditions();

            state._fsp--;

             after(grammarAccess.getIfConditionsRule()); 
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
    // $ANTLR end "entryRuleIfConditions"


    // $ANTLR start "ruleIfConditions"
    // InternalHale.g:937:1: ruleIfConditions : ( ( rule__IfConditions__Group__0 ) ) ;
    public final void ruleIfConditions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:941:2: ( ( ( rule__IfConditions__Group__0 ) ) )
            // InternalHale.g:942:2: ( ( rule__IfConditions__Group__0 ) )
            {
            // InternalHale.g:942:2: ( ( rule__IfConditions__Group__0 ) )
            // InternalHale.g:943:3: ( rule__IfConditions__Group__0 )
            {
             before(grammarAccess.getIfConditionsAccess().getGroup()); 
            // InternalHale.g:944:3: ( rule__IfConditions__Group__0 )
            // InternalHale.g:944:4: rule__IfConditions__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IfConditions__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIfConditionsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIfConditions"


    // $ANTLR start "entryRuleWhile"
    // InternalHale.g:953:1: entryRuleWhile : ruleWhile EOF ;
    public final void entryRuleWhile() throws RecognitionException {
        try {
            // InternalHale.g:954:1: ( ruleWhile EOF )
            // InternalHale.g:955:1: ruleWhile EOF
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
    // InternalHale.g:962:1: ruleWhile : ( ( rule__While__Group__0 ) ) ;
    public final void ruleWhile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:966:2: ( ( ( rule__While__Group__0 ) ) )
            // InternalHale.g:967:2: ( ( rule__While__Group__0 ) )
            {
            // InternalHale.g:967:2: ( ( rule__While__Group__0 ) )
            // InternalHale.g:968:3: ( rule__While__Group__0 )
            {
             before(grammarAccess.getWhileAccess().getGroup()); 
            // InternalHale.g:969:3: ( rule__While__Group__0 )
            // InternalHale.g:969:4: rule__While__Group__0
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


    // $ANTLR start "entryRuleBreak"
    // InternalHale.g:978:1: entryRuleBreak : ruleBreak EOF ;
    public final void entryRuleBreak() throws RecognitionException {
        try {
            // InternalHale.g:979:1: ( ruleBreak EOF )
            // InternalHale.g:980:1: ruleBreak EOF
            {
             before(grammarAccess.getBreakRule()); 
            pushFollow(FOLLOW_1);
            ruleBreak();

            state._fsp--;

             after(grammarAccess.getBreakRule()); 
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
    // $ANTLR end "entryRuleBreak"


    // $ANTLR start "ruleBreak"
    // InternalHale.g:987:1: ruleBreak : ( ( rule__Break__Group__0 ) ) ;
    public final void ruleBreak() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:991:2: ( ( ( rule__Break__Group__0 ) ) )
            // InternalHale.g:992:2: ( ( rule__Break__Group__0 ) )
            {
            // InternalHale.g:992:2: ( ( rule__Break__Group__0 ) )
            // InternalHale.g:993:3: ( rule__Break__Group__0 )
            {
             before(grammarAccess.getBreakAccess().getGroup()); 
            // InternalHale.g:994:3: ( rule__Break__Group__0 )
            // InternalHale.g:994:4: rule__Break__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Break__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBreakAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBreak"


    // $ANTLR start "entryRuleFunction"
    // InternalHale.g:1003:1: entryRuleFunction : ruleFunction EOF ;
    public final void entryRuleFunction() throws RecognitionException {
        try {
            // InternalHale.g:1004:1: ( ruleFunction EOF )
            // InternalHale.g:1005:1: ruleFunction EOF
            {
             before(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            ruleFunction();

            state._fsp--;

             after(grammarAccess.getFunctionRule()); 
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
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalHale.g:1012:1: ruleFunction : ( ( rule__Function__Group__0 ) ) ;
    public final void ruleFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1016:2: ( ( ( rule__Function__Group__0 ) ) )
            // InternalHale.g:1017:2: ( ( rule__Function__Group__0 ) )
            {
            // InternalHale.g:1017:2: ( ( rule__Function__Group__0 ) )
            // InternalHale.g:1018:3: ( rule__Function__Group__0 )
            {
             before(grammarAccess.getFunctionAccess().getGroup()); 
            // InternalHale.g:1019:3: ( rule__Function__Group__0 )
            // InternalHale.g:1019:4: rule__Function__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleParameter"
    // InternalHale.g:1028:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalHale.g:1029:1: ( ruleParameter EOF )
            // InternalHale.g:1030:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalHale.g:1037:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1041:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalHale.g:1042:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalHale.g:1042:2: ( ( rule__Parameter__Group__0 ) )
            // InternalHale.g:1043:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalHale.g:1044:3: ( rule__Parameter__Group__0 )
            // InternalHale.g:1044:4: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleReturn"
    // InternalHale.g:1053:1: entryRuleReturn : ruleReturn EOF ;
    public final void entryRuleReturn() throws RecognitionException {
        try {
            // InternalHale.g:1054:1: ( ruleReturn EOF )
            // InternalHale.g:1055:1: ruleReturn EOF
            {
             before(grammarAccess.getReturnRule()); 
            pushFollow(FOLLOW_1);
            ruleReturn();

            state._fsp--;

             after(grammarAccess.getReturnRule()); 
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
    // $ANTLR end "entryRuleReturn"


    // $ANTLR start "ruleReturn"
    // InternalHale.g:1062:1: ruleReturn : ( ( rule__Return__Group__0 ) ) ;
    public final void ruleReturn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1066:2: ( ( ( rule__Return__Group__0 ) ) )
            // InternalHale.g:1067:2: ( ( rule__Return__Group__0 ) )
            {
            // InternalHale.g:1067:2: ( ( rule__Return__Group__0 ) )
            // InternalHale.g:1068:3: ( rule__Return__Group__0 )
            {
             before(grammarAccess.getReturnAccess().getGroup()); 
            // InternalHale.g:1069:3: ( rule__Return__Group__0 )
            // InternalHale.g:1069:4: rule__Return__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Return__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReturnAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReturn"


    // $ANTLR start "entryRuleThrow"
    // InternalHale.g:1078:1: entryRuleThrow : ruleThrow EOF ;
    public final void entryRuleThrow() throws RecognitionException {
        try {
            // InternalHale.g:1079:1: ( ruleThrow EOF )
            // InternalHale.g:1080:1: ruleThrow EOF
            {
             before(grammarAccess.getThrowRule()); 
            pushFollow(FOLLOW_1);
            ruleThrow();

            state._fsp--;

             after(grammarAccess.getThrowRule()); 
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
    // $ANTLR end "entryRuleThrow"


    // $ANTLR start "ruleThrow"
    // InternalHale.g:1087:1: ruleThrow : ( ( rule__Throw__Group__0 ) ) ;
    public final void ruleThrow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1091:2: ( ( ( rule__Throw__Group__0 ) ) )
            // InternalHale.g:1092:2: ( ( rule__Throw__Group__0 ) )
            {
            // InternalHale.g:1092:2: ( ( rule__Throw__Group__0 ) )
            // InternalHale.g:1093:3: ( rule__Throw__Group__0 )
            {
             before(grammarAccess.getThrowAccess().getGroup()); 
            // InternalHale.g:1094:3: ( rule__Throw__Group__0 )
            // InternalHale.g:1094:4: rule__Throw__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Throw__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getThrowAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleThrow"


    // $ANTLR start "rule__Block__Alternatives_1"
    // InternalHale.g:1102:1: rule__Block__Alternatives_1 : ( ( ( rule__Block__StatementsAssignment_1_0 ) ) | ( ';' ) );
    public final void rule__Block__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1106:1: ( ( ( rule__Block__StatementsAssignment_1_0 ) ) | ( ';' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=RULE_BOOLEAN && LA1_0<=RULE_STRING)||LA1_0==RULE_ID||LA1_0==13||LA1_0==25||(LA1_0>=31 && LA1_0<=32)||LA1_0==35||LA1_0==39||(LA1_0>=41 && LA1_0<=43)||(LA1_0>=46 && LA1_0<=50)) ) {
                alt1=1;
            }
            else if ( (LA1_0==12) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalHale.g:1107:2: ( ( rule__Block__StatementsAssignment_1_0 ) )
                    {
                    // InternalHale.g:1107:2: ( ( rule__Block__StatementsAssignment_1_0 ) )
                    // InternalHale.g:1108:3: ( rule__Block__StatementsAssignment_1_0 )
                    {
                     before(grammarAccess.getBlockAccess().getStatementsAssignment_1_0()); 
                    // InternalHale.g:1109:3: ( rule__Block__StatementsAssignment_1_0 )
                    // InternalHale.g:1109:4: rule__Block__StatementsAssignment_1_0
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
                    // InternalHale.g:1113:2: ( ';' )
                    {
                    // InternalHale.g:1113:2: ( ';' )
                    // InternalHale.g:1114:3: ';'
                    {
                     before(grammarAccess.getBlockAccess().getSemicolonKeyword_1_1()); 
                    match(input,12,FOLLOW_2); 
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
    // InternalHale.g:1123:1: rule__Statement__Alternatives : ( ( ruleBracedBlock ) | ( ruleFunction ) | ( ruleIf ) | ( ruleWhile ) | ( ( rule__Statement__Group_4__0 ) ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1127:1: ( ( ruleBracedBlock ) | ( ruleFunction ) | ( ruleIf ) | ( ruleWhile ) | ( ( rule__Statement__Group_4__0 ) ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case 48:
                {
                alt2=2;
                }
                break;
            case 43:
                {
                alt2=3;
                }
                break;
            case 46:
                {
                alt2=4;
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
            case 41:
            case 42:
            case 47:
            case 49:
            case 50:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalHale.g:1128:2: ( ruleBracedBlock )
                    {
                    // InternalHale.g:1128:2: ( ruleBracedBlock )
                    // InternalHale.g:1129:3: ruleBracedBlock
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
                    // InternalHale.g:1134:2: ( ruleFunction )
                    {
                    // InternalHale.g:1134:2: ( ruleFunction )
                    // InternalHale.g:1135:3: ruleFunction
                    {
                     before(grammarAccess.getStatementAccess().getFunctionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFunction();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getFunctionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHale.g:1140:2: ( ruleIf )
                    {
                    // InternalHale.g:1140:2: ( ruleIf )
                    // InternalHale.g:1141:3: ruleIf
                    {
                     before(grammarAccess.getStatementAccess().getIfParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleIf();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getIfParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalHale.g:1146:2: ( ruleWhile )
                    {
                    // InternalHale.g:1146:2: ( ruleWhile )
                    // InternalHale.g:1147:3: ruleWhile
                    {
                     before(grammarAccess.getStatementAccess().getWhileParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleWhile();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getWhileParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalHale.g:1152:2: ( ( rule__Statement__Group_4__0 ) )
                    {
                    // InternalHale.g:1152:2: ( ( rule__Statement__Group_4__0 ) )
                    // InternalHale.g:1153:3: ( rule__Statement__Group_4__0 )
                    {
                     before(grammarAccess.getStatementAccess().getGroup_4()); 
                    // InternalHale.g:1154:3: ( rule__Statement__Group_4__0 )
                    // InternalHale.g:1154:4: rule__Statement__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getGroup_4()); 

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


    // $ANTLR start "rule__Statement__Alternatives_4_0"
    // InternalHale.g:1162:1: rule__Statement__Alternatives_4_0 : ( ( rulePrint ) | ( ruleLetBinding ) | ( ruleAssignment ) | ( ruleBreak ) | ( ruleReturn ) | ( ruleThrow ) | ( ruleExpression ) );
    public final void rule__Statement__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1166:1: ( ( rulePrint ) | ( ruleLetBinding ) | ( ruleAssignment ) | ( ruleBreak ) | ( ruleReturn ) | ( ruleThrow ) | ( ruleExpression ) )
            int alt3=7;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt3=1;
                }
                break;
            case 39:
                {
                alt3=2;
                }
                break;
            case RULE_ID:
                {
                int LA3_3 = input.LA(2);

                if ( (LA3_3==40) ) {
                    alt3=3;
                }
                else if ( (LA3_3==12||(LA3_3>=15 && LA3_3<=30)||LA3_3==32) ) {
                    alt3=7;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 3, input);

                    throw nvae;
                }
                }
                break;
            case 47:
                {
                alt3=4;
                }
                break;
            case 49:
                {
                alt3=5;
                }
                break;
            case 50:
                {
                alt3=6;
                }
                break;
            case RULE_BOOLEAN:
            case RULE_DOUBLE:
            case RULE_STRING:
            case 25:
            case 31:
            case 32:
            case 35:
            case 41:
                {
                alt3=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalHale.g:1167:2: ( rulePrint )
                    {
                    // InternalHale.g:1167:2: ( rulePrint )
                    // InternalHale.g:1168:3: rulePrint
                    {
                     before(grammarAccess.getStatementAccess().getPrintParserRuleCall_4_0_0()); 
                    pushFollow(FOLLOW_2);
                    rulePrint();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getPrintParserRuleCall_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHale.g:1173:2: ( ruleLetBinding )
                    {
                    // InternalHale.g:1173:2: ( ruleLetBinding )
                    // InternalHale.g:1174:3: ruleLetBinding
                    {
                     before(grammarAccess.getStatementAccess().getLetBindingParserRuleCall_4_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLetBinding();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getLetBindingParserRuleCall_4_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHale.g:1179:2: ( ruleAssignment )
                    {
                    // InternalHale.g:1179:2: ( ruleAssignment )
                    // InternalHale.g:1180:3: ruleAssignment
                    {
                     before(grammarAccess.getStatementAccess().getAssignmentParserRuleCall_4_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleAssignment();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getAssignmentParserRuleCall_4_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalHale.g:1185:2: ( ruleBreak )
                    {
                    // InternalHale.g:1185:2: ( ruleBreak )
                    // InternalHale.g:1186:3: ruleBreak
                    {
                     before(grammarAccess.getStatementAccess().getBreakParserRuleCall_4_0_3()); 
                    pushFollow(FOLLOW_2);
                    ruleBreak();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getBreakParserRuleCall_4_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalHale.g:1191:2: ( ruleReturn )
                    {
                    // InternalHale.g:1191:2: ( ruleReturn )
                    // InternalHale.g:1192:3: ruleReturn
                    {
                     before(grammarAccess.getStatementAccess().getReturnParserRuleCall_4_0_4()); 
                    pushFollow(FOLLOW_2);
                    ruleReturn();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getReturnParserRuleCall_4_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalHale.g:1197:2: ( ruleThrow )
                    {
                    // InternalHale.g:1197:2: ( ruleThrow )
                    // InternalHale.g:1198:3: ruleThrow
                    {
                     before(grammarAccess.getStatementAccess().getThrowParserRuleCall_4_0_5()); 
                    pushFollow(FOLLOW_2);
                    ruleThrow();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getThrowParserRuleCall_4_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalHale.g:1203:2: ( ruleExpression )
                    {
                    // InternalHale.g:1203:2: ( ruleExpression )
                    // InternalHale.g:1204:3: ruleExpression
                    {
                     before(grammarAccess.getStatementAccess().getExpressionParserRuleCall_4_0_6()); 
                    pushFollow(FOLLOW_2);
                    ruleExpression();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getExpressionParserRuleCall_4_0_6()); 

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
    // $ANTLR end "rule__Statement__Alternatives_4_0"


    // $ANTLR start "rule__Expression9__Alternatives_1"
    // InternalHale.g:1213:1: rule__Expression9__Alternatives_1 : ( ( ( rule__Expression9__Group_1_0__0 ) ) | ( ( rule__Expression9__Group_1_1__0 ) ) );
    public final void rule__Expression9__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1217:1: ( ( ( rule__Expression9__Group_1_0__0 ) ) | ( ( rule__Expression9__Group_1_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            else if ( (LA4_0==17) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalHale.g:1218:2: ( ( rule__Expression9__Group_1_0__0 ) )
                    {
                    // InternalHale.g:1218:2: ( ( rule__Expression9__Group_1_0__0 ) )
                    // InternalHale.g:1219:3: ( rule__Expression9__Group_1_0__0 )
                    {
                     before(grammarAccess.getExpression9Access().getGroup_1_0()); 
                    // InternalHale.g:1220:3: ( rule__Expression9__Group_1_0__0 )
                    // InternalHale.g:1220:4: rule__Expression9__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression9__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpression9Access().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHale.g:1224:2: ( ( rule__Expression9__Group_1_1__0 ) )
                    {
                    // InternalHale.g:1224:2: ( ( rule__Expression9__Group_1_1__0 ) )
                    // InternalHale.g:1225:3: ( rule__Expression9__Group_1_1__0 )
                    {
                     before(grammarAccess.getExpression9Access().getGroup_1_1()); 
                    // InternalHale.g:1226:3: ( rule__Expression9__Group_1_1__0 )
                    // InternalHale.g:1226:4: rule__Expression9__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression9__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpression9Access().getGroup_1_1()); 

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
    // $ANTLR end "rule__Expression9__Alternatives_1"


    // $ANTLR start "rule__Expression8__Alternatives_1"
    // InternalHale.g:1234:1: rule__Expression8__Alternatives_1 : ( ( ( rule__Expression8__Group_1_0__0 ) ) | ( ( rule__Expression8__Group_1_1__0 ) ) );
    public final void rule__Expression8__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1238:1: ( ( ( rule__Expression8__Group_1_0__0 ) ) | ( ( rule__Expression8__Group_1_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            else if ( (LA5_0==19) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalHale.g:1239:2: ( ( rule__Expression8__Group_1_0__0 ) )
                    {
                    // InternalHale.g:1239:2: ( ( rule__Expression8__Group_1_0__0 ) )
                    // InternalHale.g:1240:3: ( rule__Expression8__Group_1_0__0 )
                    {
                     before(grammarAccess.getExpression8Access().getGroup_1_0()); 
                    // InternalHale.g:1241:3: ( rule__Expression8__Group_1_0__0 )
                    // InternalHale.g:1241:4: rule__Expression8__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression8__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpression8Access().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHale.g:1245:2: ( ( rule__Expression8__Group_1_1__0 ) )
                    {
                    // InternalHale.g:1245:2: ( ( rule__Expression8__Group_1_1__0 ) )
                    // InternalHale.g:1246:3: ( rule__Expression8__Group_1_1__0 )
                    {
                     before(grammarAccess.getExpression8Access().getGroup_1_1()); 
                    // InternalHale.g:1247:3: ( rule__Expression8__Group_1_1__0 )
                    // InternalHale.g:1247:4: rule__Expression8__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression8__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpression8Access().getGroup_1_1()); 

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
    // $ANTLR end "rule__Expression8__Alternatives_1"


    // $ANTLR start "rule__Expression7__Alternatives_1"
    // InternalHale.g:1255:1: rule__Expression7__Alternatives_1 : ( ( ( rule__Expression7__Group_1_0__0 ) ) | ( ( rule__Expression7__Group_1_1__0 ) ) | ( ( rule__Expression7__Group_1_2__0 ) ) | ( ( rule__Expression7__Group_1_3__0 ) ) );
    public final void rule__Expression7__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1259:1: ( ( ( rule__Expression7__Group_1_0__0 ) ) | ( ( rule__Expression7__Group_1_1__0 ) ) | ( ( rule__Expression7__Group_1_2__0 ) ) | ( ( rule__Expression7__Group_1_3__0 ) ) )
            int alt6=4;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalHale.g:1260:2: ( ( rule__Expression7__Group_1_0__0 ) )
                    {
                    // InternalHale.g:1260:2: ( ( rule__Expression7__Group_1_0__0 ) )
                    // InternalHale.g:1261:3: ( rule__Expression7__Group_1_0__0 )
                    {
                     before(grammarAccess.getExpression7Access().getGroup_1_0()); 
                    // InternalHale.g:1262:3: ( rule__Expression7__Group_1_0__0 )
                    // InternalHale.g:1262:4: rule__Expression7__Group_1_0__0
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
                    // InternalHale.g:1266:2: ( ( rule__Expression7__Group_1_1__0 ) )
                    {
                    // InternalHale.g:1266:2: ( ( rule__Expression7__Group_1_1__0 ) )
                    // InternalHale.g:1267:3: ( rule__Expression7__Group_1_1__0 )
                    {
                     before(grammarAccess.getExpression7Access().getGroup_1_1()); 
                    // InternalHale.g:1268:3: ( rule__Expression7__Group_1_1__0 )
                    // InternalHale.g:1268:4: rule__Expression7__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression7__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpression7Access().getGroup_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHale.g:1272:2: ( ( rule__Expression7__Group_1_2__0 ) )
                    {
                    // InternalHale.g:1272:2: ( ( rule__Expression7__Group_1_2__0 ) )
                    // InternalHale.g:1273:3: ( rule__Expression7__Group_1_2__0 )
                    {
                     before(grammarAccess.getExpression7Access().getGroup_1_2()); 
                    // InternalHale.g:1274:3: ( rule__Expression7__Group_1_2__0 )
                    // InternalHale.g:1274:4: rule__Expression7__Group_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression7__Group_1_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpression7Access().getGroup_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalHale.g:1278:2: ( ( rule__Expression7__Group_1_3__0 ) )
                    {
                    // InternalHale.g:1278:2: ( ( rule__Expression7__Group_1_3__0 ) )
                    // InternalHale.g:1279:3: ( rule__Expression7__Group_1_3__0 )
                    {
                     before(grammarAccess.getExpression7Access().getGroup_1_3()); 
                    // InternalHale.g:1280:3: ( rule__Expression7__Group_1_3__0 )
                    // InternalHale.g:1280:4: rule__Expression7__Group_1_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression7__Group_1_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpression7Access().getGroup_1_3()); 

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
    // InternalHale.g:1288:1: rule__Expression6__Alternatives_1 : ( ( ( rule__Expression6__Group_1_0__0 ) ) | ( ( rule__Expression6__Group_1_1__0 ) ) );
    public final void rule__Expression6__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1292:1: ( ( ( rule__Expression6__Group_1_0__0 ) ) | ( ( rule__Expression6__Group_1_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            else if ( (LA7_0==25) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalHale.g:1293:2: ( ( rule__Expression6__Group_1_0__0 ) )
                    {
                    // InternalHale.g:1293:2: ( ( rule__Expression6__Group_1_0__0 ) )
                    // InternalHale.g:1294:3: ( rule__Expression6__Group_1_0__0 )
                    {
                     before(grammarAccess.getExpression6Access().getGroup_1_0()); 
                    // InternalHale.g:1295:3: ( rule__Expression6__Group_1_0__0 )
                    // InternalHale.g:1295:4: rule__Expression6__Group_1_0__0
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
                    // InternalHale.g:1299:2: ( ( rule__Expression6__Group_1_1__0 ) )
                    {
                    // InternalHale.g:1299:2: ( ( rule__Expression6__Group_1_1__0 ) )
                    // InternalHale.g:1300:3: ( rule__Expression6__Group_1_1__0 )
                    {
                     before(grammarAccess.getExpression6Access().getGroup_1_1()); 
                    // InternalHale.g:1301:3: ( rule__Expression6__Group_1_1__0 )
                    // InternalHale.g:1301:4: rule__Expression6__Group_1_1__0
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
    // InternalHale.g:1309:1: rule__Expression5__Alternatives_1 : ( ( ( rule__Expression5__Group_1_0__0 ) ) | ( ( rule__Expression5__Group_1_1__0 ) ) | ( ( rule__Expression5__Group_1_2__0 ) ) );
    public final void rule__Expression5__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1313:1: ( ( ( rule__Expression5__Group_1_0__0 ) ) | ( ( rule__Expression5__Group_1_1__0 ) ) | ( ( rule__Expression5__Group_1_2__0 ) ) )
            int alt8=3;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalHale.g:1314:2: ( ( rule__Expression5__Group_1_0__0 ) )
                    {
                    // InternalHale.g:1314:2: ( ( rule__Expression5__Group_1_0__0 ) )
                    // InternalHale.g:1315:3: ( rule__Expression5__Group_1_0__0 )
                    {
                     before(grammarAccess.getExpression5Access().getGroup_1_0()); 
                    // InternalHale.g:1316:3: ( rule__Expression5__Group_1_0__0 )
                    // InternalHale.g:1316:4: rule__Expression5__Group_1_0__0
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
                    // InternalHale.g:1320:2: ( ( rule__Expression5__Group_1_1__0 ) )
                    {
                    // InternalHale.g:1320:2: ( ( rule__Expression5__Group_1_1__0 ) )
                    // InternalHale.g:1321:3: ( rule__Expression5__Group_1_1__0 )
                    {
                     before(grammarAccess.getExpression5Access().getGroup_1_1()); 
                    // InternalHale.g:1322:3: ( rule__Expression5__Group_1_1__0 )
                    // InternalHale.g:1322:4: rule__Expression5__Group_1_1__0
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
                    // InternalHale.g:1326:2: ( ( rule__Expression5__Group_1_2__0 ) )
                    {
                    // InternalHale.g:1326:2: ( ( rule__Expression5__Group_1_2__0 ) )
                    // InternalHale.g:1327:3: ( rule__Expression5__Group_1_2__0 )
                    {
                     before(grammarAccess.getExpression5Access().getGroup_1_2()); 
                    // InternalHale.g:1328:3: ( rule__Expression5__Group_1_2__0 )
                    // InternalHale.g:1328:4: rule__Expression5__Group_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression5__Group_1_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpression5Access().getGroup_1_2()); 

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


    // $ANTLR start "rule__Expression2__Alternatives"
    // InternalHale.g:1336:1: rule__Expression2__Alternatives : ( ( ( rule__Expression2__Group_0__0 ) ) | ( ( rule__Expression2__Group_1__0 ) ) | ( ruleExpression1 ) );
    public final void rule__Expression2__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1340:1: ( ( ( rule__Expression2__Group_0__0 ) ) | ( ( rule__Expression2__Group_1__0 ) ) | ( ruleExpression1 ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt9=1;
                }
                break;
            case 31:
                {
                alt9=2;
                }
                break;
            case RULE_BOOLEAN:
            case RULE_DOUBLE:
            case RULE_STRING:
            case RULE_ID:
            case 32:
            case 35:
            case 41:
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
                    // InternalHale.g:1341:2: ( ( rule__Expression2__Group_0__0 ) )
                    {
                    // InternalHale.g:1341:2: ( ( rule__Expression2__Group_0__0 ) )
                    // InternalHale.g:1342:3: ( rule__Expression2__Group_0__0 )
                    {
                     before(grammarAccess.getExpression2Access().getGroup_0()); 
                    // InternalHale.g:1343:3: ( rule__Expression2__Group_0__0 )
                    // InternalHale.g:1343:4: rule__Expression2__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression2__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpression2Access().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHale.g:1347:2: ( ( rule__Expression2__Group_1__0 ) )
                    {
                    // InternalHale.g:1347:2: ( ( rule__Expression2__Group_1__0 ) )
                    // InternalHale.g:1348:3: ( rule__Expression2__Group_1__0 )
                    {
                     before(grammarAccess.getExpression2Access().getGroup_1()); 
                    // InternalHale.g:1349:3: ( rule__Expression2__Group_1__0 )
                    // InternalHale.g:1349:4: rule__Expression2__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression2__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpression2Access().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHale.g:1353:2: ( ruleExpression1 )
                    {
                    // InternalHale.g:1353:2: ( ruleExpression1 )
                    // InternalHale.g:1354:3: ruleExpression1
                    {
                     before(grammarAccess.getExpression2Access().getExpression1ParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleExpression1();

                    state._fsp--;

                     after(grammarAccess.getExpression2Access().getExpression1ParserRuleCall_2()); 

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
    // $ANTLR end "rule__Expression2__Alternatives"


    // $ANTLR start "rule__Expression0__Alternatives"
    // InternalHale.g:1363:1: rule__Expression0__Alternatives : ( ( ruleLiteral ) | ( ruleInput ) | ( ruleBindingReference ) | ( ( rule__Expression0__Group_3__0 ) ) );
    public final void rule__Expression0__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1367:1: ( ( ruleLiteral ) | ( ruleInput ) | ( ruleBindingReference ) | ( ( rule__Expression0__Group_3__0 ) ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN:
            case RULE_DOUBLE:
            case RULE_STRING:
            case 35:
                {
                alt10=1;
                }
                break;
            case 41:
                {
                alt10=2;
                }
                break;
            case RULE_ID:
                {
                alt10=3;
                }
                break;
            case 32:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalHale.g:1368:2: ( ruleLiteral )
                    {
                    // InternalHale.g:1368:2: ( ruleLiteral )
                    // InternalHale.g:1369:3: ruleLiteral
                    {
                     before(grammarAccess.getExpression0Access().getLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLiteral();

                    state._fsp--;

                     after(grammarAccess.getExpression0Access().getLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHale.g:1374:2: ( ruleInput )
                    {
                    // InternalHale.g:1374:2: ( ruleInput )
                    // InternalHale.g:1375:3: ruleInput
                    {
                     before(grammarAccess.getExpression0Access().getInputParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleInput();

                    state._fsp--;

                     after(grammarAccess.getExpression0Access().getInputParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHale.g:1380:2: ( ruleBindingReference )
                    {
                    // InternalHale.g:1380:2: ( ruleBindingReference )
                    // InternalHale.g:1381:3: ruleBindingReference
                    {
                     before(grammarAccess.getExpression0Access().getBindingReferenceParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleBindingReference();

                    state._fsp--;

                     after(grammarAccess.getExpression0Access().getBindingReferenceParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalHale.g:1386:2: ( ( rule__Expression0__Group_3__0 ) )
                    {
                    // InternalHale.g:1386:2: ( ( rule__Expression0__Group_3__0 ) )
                    // InternalHale.g:1387:3: ( rule__Expression0__Group_3__0 )
                    {
                     before(grammarAccess.getExpression0Access().getGroup_3()); 
                    // InternalHale.g:1388:3: ( rule__Expression0__Group_3__0 )
                    // InternalHale.g:1388:4: rule__Expression0__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression0__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpression0Access().getGroup_3()); 

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
    // $ANTLR end "rule__Expression0__Alternatives"


    // $ANTLR start "rule__Literal__Alternatives"
    // InternalHale.g:1396:1: rule__Literal__Alternatives : ( ( ruleVoidLiteral ) | ( ruleBooleanLiteral ) | ( ruleNumberLiteral ) | ( ruleStringLiteral ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1400:1: ( ( ruleVoidLiteral ) | ( ruleBooleanLiteral ) | ( ruleNumberLiteral ) | ( ruleStringLiteral ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt11=1;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt11=2;
                }
                break;
            case RULE_DOUBLE:
                {
                alt11=3;
                }
                break;
            case RULE_STRING:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalHale.g:1401:2: ( ruleVoidLiteral )
                    {
                    // InternalHale.g:1401:2: ( ruleVoidLiteral )
                    // InternalHale.g:1402:3: ruleVoidLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getVoidLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleVoidLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getVoidLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHale.g:1407:2: ( ruleBooleanLiteral )
                    {
                    // InternalHale.g:1407:2: ( ruleBooleanLiteral )
                    // InternalHale.g:1408:3: ruleBooleanLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleBooleanLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHale.g:1413:2: ( ruleNumberLiteral )
                    {
                    // InternalHale.g:1413:2: ( ruleNumberLiteral )
                    // InternalHale.g:1414:3: ruleNumberLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getNumberLiteralParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleNumberLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getNumberLiteralParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalHale.g:1419:2: ( ruleStringLiteral )
                    {
                    // InternalHale.g:1419:2: ( ruleStringLiteral )
                    // InternalHale.g:1420:3: ruleStringLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleStringLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_3()); 

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


    // $ANTLR start "rule__FunctionType__Alternatives"
    // InternalHale.g:1429:1: rule__FunctionType__Alternatives : ( ( ( rule__FunctionType__Group_0__0 ) ) | ( ruleEitherType ) );
    public final void rule__FunctionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1433:1: ( ( ( rule__FunctionType__Group_0__0 ) ) | ( ruleEitherType ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==37) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_PRIMITIVE_TYPE||LA12_0==32) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalHale.g:1434:2: ( ( rule__FunctionType__Group_0__0 ) )
                    {
                    // InternalHale.g:1434:2: ( ( rule__FunctionType__Group_0__0 ) )
                    // InternalHale.g:1435:3: ( rule__FunctionType__Group_0__0 )
                    {
                     before(grammarAccess.getFunctionTypeAccess().getGroup_0()); 
                    // InternalHale.g:1436:3: ( rule__FunctionType__Group_0__0 )
                    // InternalHale.g:1436:4: rule__FunctionType__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FunctionType__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFunctionTypeAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHale.g:1440:2: ( ruleEitherType )
                    {
                    // InternalHale.g:1440:2: ( ruleEitherType )
                    // InternalHale.g:1441:3: ruleEitherType
                    {
                     before(grammarAccess.getFunctionTypeAccess().getEitherTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEitherType();

                    state._fsp--;

                     after(grammarAccess.getFunctionTypeAccess().getEitherTypeParserRuleCall_1()); 

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
    // $ANTLR end "rule__FunctionType__Alternatives"


    // $ANTLR start "rule__PrimaryType__Alternatives"
    // InternalHale.g:1450:1: rule__PrimaryType__Alternatives : ( ( rulePrimitiveType ) | ( ( rule__PrimaryType__Group_1__0 ) ) );
    public final void rule__PrimaryType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1454:1: ( ( rulePrimitiveType ) | ( ( rule__PrimaryType__Group_1__0 ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_PRIMITIVE_TYPE) ) {
                alt13=1;
            }
            else if ( (LA13_0==32) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalHale.g:1455:2: ( rulePrimitiveType )
                    {
                    // InternalHale.g:1455:2: ( rulePrimitiveType )
                    // InternalHale.g:1456:3: rulePrimitiveType
                    {
                     before(grammarAccess.getPrimaryTypeAccess().getPrimitiveTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePrimitiveType();

                    state._fsp--;

                     after(grammarAccess.getPrimaryTypeAccess().getPrimitiveTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHale.g:1461:2: ( ( rule__PrimaryType__Group_1__0 ) )
                    {
                    // InternalHale.g:1461:2: ( ( rule__PrimaryType__Group_1__0 ) )
                    // InternalHale.g:1462:3: ( rule__PrimaryType__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryTypeAccess().getGroup_1()); 
                    // InternalHale.g:1463:3: ( rule__PrimaryType__Group_1__0 )
                    // InternalHale.g:1463:4: rule__PrimaryType__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryType__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryTypeAccess().getGroup_1()); 

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
    // $ANTLR end "rule__PrimaryType__Alternatives"


    // $ANTLR start "rule__If__Alternatives_1"
    // InternalHale.g:1471:1: rule__If__Alternatives_1 : ( ( ruleIfLet ) | ( ruleIfConditions ) );
    public final void rule__If__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1475:1: ( ( ruleIfLet ) | ( ruleIfConditions ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==39) ) {
                alt14=1;
            }
            else if ( ((LA14_0>=RULE_BOOLEAN && LA14_0<=RULE_STRING)||LA14_0==RULE_ID||LA14_0==25||(LA14_0>=31 && LA14_0<=32)||LA14_0==35||LA14_0==41) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalHale.g:1476:2: ( ruleIfLet )
                    {
                    // InternalHale.g:1476:2: ( ruleIfLet )
                    // InternalHale.g:1477:3: ruleIfLet
                    {
                     before(grammarAccess.getIfAccess().getIfLetParserRuleCall_1_0()); 
                    pushFollow(FOLLOW_2);
                    ruleIfLet();

                    state._fsp--;

                     after(grammarAccess.getIfAccess().getIfLetParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHale.g:1482:2: ( ruleIfConditions )
                    {
                    // InternalHale.g:1482:2: ( ruleIfConditions )
                    // InternalHale.g:1483:3: ruleIfConditions
                    {
                     before(grammarAccess.getIfAccess().getIfConditionsParserRuleCall_1_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIfConditions();

                    state._fsp--;

                     after(grammarAccess.getIfAccess().getIfConditionsParserRuleCall_1_1()); 

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
    // $ANTLR end "rule__If__Alternatives_1"


    // $ANTLR start "rule__Hale__Group__0"
    // InternalHale.g:1492:1: rule__Hale__Group__0 : rule__Hale__Group__0__Impl rule__Hale__Group__1 ;
    public final void rule__Hale__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1496:1: ( rule__Hale__Group__0__Impl rule__Hale__Group__1 )
            // InternalHale.g:1497:2: rule__Hale__Group__0__Impl rule__Hale__Group__1
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
    // InternalHale.g:1504:1: rule__Hale__Group__0__Impl : ( () ) ;
    public final void rule__Hale__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1508:1: ( ( () ) )
            // InternalHale.g:1509:1: ( () )
            {
            // InternalHale.g:1509:1: ( () )
            // InternalHale.g:1510:2: ()
            {
             before(grammarAccess.getHaleAccess().getHaleAction_0()); 
            // InternalHale.g:1511:2: ()
            // InternalHale.g:1511:3: 
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
    // InternalHale.g:1519:1: rule__Hale__Group__1 : rule__Hale__Group__1__Impl ;
    public final void rule__Hale__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1523:1: ( rule__Hale__Group__1__Impl )
            // InternalHale.g:1524:2: rule__Hale__Group__1__Impl
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
    // InternalHale.g:1530:1: rule__Hale__Group__1__Impl : ( ( rule__Hale__MainBlockAssignment_1 ) ) ;
    public final void rule__Hale__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1534:1: ( ( ( rule__Hale__MainBlockAssignment_1 ) ) )
            // InternalHale.g:1535:1: ( ( rule__Hale__MainBlockAssignment_1 ) )
            {
            // InternalHale.g:1535:1: ( ( rule__Hale__MainBlockAssignment_1 ) )
            // InternalHale.g:1536:2: ( rule__Hale__MainBlockAssignment_1 )
            {
             before(grammarAccess.getHaleAccess().getMainBlockAssignment_1()); 
            // InternalHale.g:1537:2: ( rule__Hale__MainBlockAssignment_1 )
            // InternalHale.g:1537:3: rule__Hale__MainBlockAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Hale__MainBlockAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHaleAccess().getMainBlockAssignment_1()); 

            }


            }

        }
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
    // InternalHale.g:1546:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1550:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // InternalHale.g:1551:2: rule__Block__Group__0__Impl rule__Block__Group__1
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
    // InternalHale.g:1558:1: rule__Block__Group__0__Impl : ( () ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1562:1: ( ( () ) )
            // InternalHale.g:1563:1: ( () )
            {
            // InternalHale.g:1563:1: ( () )
            // InternalHale.g:1564:2: ()
            {
             before(grammarAccess.getBlockAccess().getBlockAction_0()); 
            // InternalHale.g:1565:2: ()
            // InternalHale.g:1565:3: 
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
    // InternalHale.g:1573:1: rule__Block__Group__1 : rule__Block__Group__1__Impl ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1577:1: ( rule__Block__Group__1__Impl )
            // InternalHale.g:1578:2: rule__Block__Group__1__Impl
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
    // InternalHale.g:1584:1: rule__Block__Group__1__Impl : ( ( rule__Block__Alternatives_1 )* ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1588:1: ( ( ( rule__Block__Alternatives_1 )* ) )
            // InternalHale.g:1589:1: ( ( rule__Block__Alternatives_1 )* )
            {
            // InternalHale.g:1589:1: ( ( rule__Block__Alternatives_1 )* )
            // InternalHale.g:1590:2: ( rule__Block__Alternatives_1 )*
            {
             before(grammarAccess.getBlockAccess().getAlternatives_1()); 
            // InternalHale.g:1591:2: ( rule__Block__Alternatives_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=RULE_BOOLEAN && LA15_0<=RULE_STRING)||LA15_0==RULE_ID||(LA15_0>=12 && LA15_0<=13)||LA15_0==25||(LA15_0>=31 && LA15_0<=32)||LA15_0==35||LA15_0==39||(LA15_0>=41 && LA15_0<=43)||(LA15_0>=46 && LA15_0<=50)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalHale.g:1591:3: rule__Block__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Block__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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


    // $ANTLR start "rule__Statement__Group_4__0"
    // InternalHale.g:1600:1: rule__Statement__Group_4__0 : rule__Statement__Group_4__0__Impl rule__Statement__Group_4__1 ;
    public final void rule__Statement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1604:1: ( rule__Statement__Group_4__0__Impl rule__Statement__Group_4__1 )
            // InternalHale.g:1605:2: rule__Statement__Group_4__0__Impl rule__Statement__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__Statement__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_4__0"


    // $ANTLR start "rule__Statement__Group_4__0__Impl"
    // InternalHale.g:1612:1: rule__Statement__Group_4__0__Impl : ( ( rule__Statement__Alternatives_4_0 ) ) ;
    public final void rule__Statement__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1616:1: ( ( ( rule__Statement__Alternatives_4_0 ) ) )
            // InternalHale.g:1617:1: ( ( rule__Statement__Alternatives_4_0 ) )
            {
            // InternalHale.g:1617:1: ( ( rule__Statement__Alternatives_4_0 ) )
            // InternalHale.g:1618:2: ( rule__Statement__Alternatives_4_0 )
            {
             before(grammarAccess.getStatementAccess().getAlternatives_4_0()); 
            // InternalHale.g:1619:2: ( rule__Statement__Alternatives_4_0 )
            // InternalHale.g:1619:3: rule__Statement__Alternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_4__0__Impl"


    // $ANTLR start "rule__Statement__Group_4__1"
    // InternalHale.g:1627:1: rule__Statement__Group_4__1 : rule__Statement__Group_4__1__Impl ;
    public final void rule__Statement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1631:1: ( rule__Statement__Group_4__1__Impl )
            // InternalHale.g:1632:2: rule__Statement__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_4__1"


    // $ANTLR start "rule__Statement__Group_4__1__Impl"
    // InternalHale.g:1638:1: rule__Statement__Group_4__1__Impl : ( ';' ) ;
    public final void rule__Statement__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1642:1: ( ( ';' ) )
            // InternalHale.g:1643:1: ( ';' )
            {
            // InternalHale.g:1643:1: ( ';' )
            // InternalHale.g:1644:2: ';'
            {
             before(grammarAccess.getStatementAccess().getSemicolonKeyword_4_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getSemicolonKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_4__1__Impl"


    // $ANTLR start "rule__BracedBlock__Group__0"
    // InternalHale.g:1654:1: rule__BracedBlock__Group__0 : rule__BracedBlock__Group__0__Impl rule__BracedBlock__Group__1 ;
    public final void rule__BracedBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1658:1: ( rule__BracedBlock__Group__0__Impl rule__BracedBlock__Group__1 )
            // InternalHale.g:1659:2: rule__BracedBlock__Group__0__Impl rule__BracedBlock__Group__1
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
    // InternalHale.g:1666:1: rule__BracedBlock__Group__0__Impl : ( '{' ) ;
    public final void rule__BracedBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1670:1: ( ( '{' ) )
            // InternalHale.g:1671:1: ( '{' )
            {
            // InternalHale.g:1671:1: ( '{' )
            // InternalHale.g:1672:2: '{'
            {
             before(grammarAccess.getBracedBlockAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,13,FOLLOW_2); 
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
    // InternalHale.g:1681:1: rule__BracedBlock__Group__1 : rule__BracedBlock__Group__1__Impl rule__BracedBlock__Group__2 ;
    public final void rule__BracedBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1685:1: ( rule__BracedBlock__Group__1__Impl rule__BracedBlock__Group__2 )
            // InternalHale.g:1686:2: rule__BracedBlock__Group__1__Impl rule__BracedBlock__Group__2
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
    // InternalHale.g:1693:1: rule__BracedBlock__Group__1__Impl : ( ruleBlock ) ;
    public final void rule__BracedBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1697:1: ( ( ruleBlock ) )
            // InternalHale.g:1698:1: ( ruleBlock )
            {
            // InternalHale.g:1698:1: ( ruleBlock )
            // InternalHale.g:1699:2: ruleBlock
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
    // InternalHale.g:1708:1: rule__BracedBlock__Group__2 : rule__BracedBlock__Group__2__Impl ;
    public final void rule__BracedBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1712:1: ( rule__BracedBlock__Group__2__Impl )
            // InternalHale.g:1713:2: rule__BracedBlock__Group__2__Impl
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
    // InternalHale.g:1719:1: rule__BracedBlock__Group__2__Impl : ( '}' ) ;
    public final void rule__BracedBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1723:1: ( ( '}' ) )
            // InternalHale.g:1724:1: ( '}' )
            {
            // InternalHale.g:1724:1: ( '}' )
            // InternalHale.g:1725:2: '}'
            {
             before(grammarAccess.getBracedBlockAccess().getRightCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
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


    // $ANTLR start "rule__Expression10__Group__0"
    // InternalHale.g:1735:1: rule__Expression10__Group__0 : rule__Expression10__Group__0__Impl rule__Expression10__Group__1 ;
    public final void rule__Expression10__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1739:1: ( rule__Expression10__Group__0__Impl rule__Expression10__Group__1 )
            // InternalHale.g:1740:2: rule__Expression10__Group__0__Impl rule__Expression10__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Expression10__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression10__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression10__Group__0"


    // $ANTLR start "rule__Expression10__Group__0__Impl"
    // InternalHale.g:1747:1: rule__Expression10__Group__0__Impl : ( ruleExpression9 ) ;
    public final void rule__Expression10__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1751:1: ( ( ruleExpression9 ) )
            // InternalHale.g:1752:1: ( ruleExpression9 )
            {
            // InternalHale.g:1752:1: ( ruleExpression9 )
            // InternalHale.g:1753:2: ruleExpression9
            {
             before(grammarAccess.getExpression10Access().getExpression9ParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression9();

            state._fsp--;

             after(grammarAccess.getExpression10Access().getExpression9ParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression10__Group__0__Impl"


    // $ANTLR start "rule__Expression10__Group__1"
    // InternalHale.g:1762:1: rule__Expression10__Group__1 : rule__Expression10__Group__1__Impl ;
    public final void rule__Expression10__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1766:1: ( rule__Expression10__Group__1__Impl )
            // InternalHale.g:1767:2: rule__Expression10__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression10__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression10__Group__1"


    // $ANTLR start "rule__Expression10__Group__1__Impl"
    // InternalHale.g:1773:1: rule__Expression10__Group__1__Impl : ( ( rule__Expression10__Group_1__0 )* ) ;
    public final void rule__Expression10__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1777:1: ( ( ( rule__Expression10__Group_1__0 )* ) )
            // InternalHale.g:1778:1: ( ( rule__Expression10__Group_1__0 )* )
            {
            // InternalHale.g:1778:1: ( ( rule__Expression10__Group_1__0 )* )
            // InternalHale.g:1779:2: ( rule__Expression10__Group_1__0 )*
            {
             before(grammarAccess.getExpression10Access().getGroup_1()); 
            // InternalHale.g:1780:2: ( rule__Expression10__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==15) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalHale.g:1780:3: rule__Expression10__Group_1__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Expression10__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getExpression10Access().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression10__Group__1__Impl"


    // $ANTLR start "rule__Expression10__Group_1__0"
    // InternalHale.g:1789:1: rule__Expression10__Group_1__0 : rule__Expression10__Group_1__0__Impl rule__Expression10__Group_1__1 ;
    public final void rule__Expression10__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1793:1: ( rule__Expression10__Group_1__0__Impl rule__Expression10__Group_1__1 )
            // InternalHale.g:1794:2: rule__Expression10__Group_1__0__Impl rule__Expression10__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__Expression10__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression10__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression10__Group_1__0"


    // $ANTLR start "rule__Expression10__Group_1__0__Impl"
    // InternalHale.g:1801:1: rule__Expression10__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression10__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1805:1: ( ( () ) )
            // InternalHale.g:1806:1: ( () )
            {
            // InternalHale.g:1806:1: ( () )
            // InternalHale.g:1807:2: ()
            {
             before(grammarAccess.getExpression10Access().getConcatenationLeftAction_1_0()); 
            // InternalHale.g:1808:2: ()
            // InternalHale.g:1808:3: 
            {
            }

             after(grammarAccess.getExpression10Access().getConcatenationLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression10__Group_1__0__Impl"


    // $ANTLR start "rule__Expression10__Group_1__1"
    // InternalHale.g:1816:1: rule__Expression10__Group_1__1 : rule__Expression10__Group_1__1__Impl rule__Expression10__Group_1__2 ;
    public final void rule__Expression10__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1820:1: ( rule__Expression10__Group_1__1__Impl rule__Expression10__Group_1__2 )
            // InternalHale.g:1821:2: rule__Expression10__Group_1__1__Impl rule__Expression10__Group_1__2
            {
            pushFollow(FOLLOW_9);
            rule__Expression10__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression10__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression10__Group_1__1"


    // $ANTLR start "rule__Expression10__Group_1__1__Impl"
    // InternalHale.g:1828:1: rule__Expression10__Group_1__1__Impl : ( '.' ) ;
    public final void rule__Expression10__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1832:1: ( ( '.' ) )
            // InternalHale.g:1833:1: ( '.' )
            {
            // InternalHale.g:1833:1: ( '.' )
            // InternalHale.g:1834:2: '.'
            {
             before(grammarAccess.getExpression10Access().getFullStopKeyword_1_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getExpression10Access().getFullStopKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression10__Group_1__1__Impl"


    // $ANTLR start "rule__Expression10__Group_1__2"
    // InternalHale.g:1843:1: rule__Expression10__Group_1__2 : rule__Expression10__Group_1__2__Impl ;
    public final void rule__Expression10__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1847:1: ( rule__Expression10__Group_1__2__Impl )
            // InternalHale.g:1848:2: rule__Expression10__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression10__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression10__Group_1__2"


    // $ANTLR start "rule__Expression10__Group_1__2__Impl"
    // InternalHale.g:1854:1: rule__Expression10__Group_1__2__Impl : ( ( rule__Expression10__RightAssignment_1_2 ) ) ;
    public final void rule__Expression10__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1858:1: ( ( ( rule__Expression10__RightAssignment_1_2 ) ) )
            // InternalHale.g:1859:1: ( ( rule__Expression10__RightAssignment_1_2 ) )
            {
            // InternalHale.g:1859:1: ( ( rule__Expression10__RightAssignment_1_2 ) )
            // InternalHale.g:1860:2: ( rule__Expression10__RightAssignment_1_2 )
            {
             before(grammarAccess.getExpression10Access().getRightAssignment_1_2()); 
            // InternalHale.g:1861:2: ( rule__Expression10__RightAssignment_1_2 )
            // InternalHale.g:1861:3: rule__Expression10__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Expression10__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getExpression10Access().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression10__Group_1__2__Impl"


    // $ANTLR start "rule__Expression9__Group__0"
    // InternalHale.g:1870:1: rule__Expression9__Group__0 : rule__Expression9__Group__0__Impl rule__Expression9__Group__1 ;
    public final void rule__Expression9__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1874:1: ( rule__Expression9__Group__0__Impl rule__Expression9__Group__1 )
            // InternalHale.g:1875:2: rule__Expression9__Group__0__Impl rule__Expression9__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Expression9__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression9__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression9__Group__0"


    // $ANTLR start "rule__Expression9__Group__0__Impl"
    // InternalHale.g:1882:1: rule__Expression9__Group__0__Impl : ( ruleExpression8 ) ;
    public final void rule__Expression9__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1886:1: ( ( ruleExpression8 ) )
            // InternalHale.g:1887:1: ( ruleExpression8 )
            {
            // InternalHale.g:1887:1: ( ruleExpression8 )
            // InternalHale.g:1888:2: ruleExpression8
            {
             before(grammarAccess.getExpression9Access().getExpression8ParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression8();

            state._fsp--;

             after(grammarAccess.getExpression9Access().getExpression8ParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression9__Group__0__Impl"


    // $ANTLR start "rule__Expression9__Group__1"
    // InternalHale.g:1897:1: rule__Expression9__Group__1 : rule__Expression9__Group__1__Impl ;
    public final void rule__Expression9__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1901:1: ( rule__Expression9__Group__1__Impl )
            // InternalHale.g:1902:2: rule__Expression9__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression9__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression9__Group__1"


    // $ANTLR start "rule__Expression9__Group__1__Impl"
    // InternalHale.g:1908:1: rule__Expression9__Group__1__Impl : ( ( rule__Expression9__Alternatives_1 )* ) ;
    public final void rule__Expression9__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1912:1: ( ( ( rule__Expression9__Alternatives_1 )* ) )
            // InternalHale.g:1913:1: ( ( rule__Expression9__Alternatives_1 )* )
            {
            // InternalHale.g:1913:1: ( ( rule__Expression9__Alternatives_1 )* )
            // InternalHale.g:1914:2: ( rule__Expression9__Alternatives_1 )*
            {
             before(grammarAccess.getExpression9Access().getAlternatives_1()); 
            // InternalHale.g:1915:2: ( rule__Expression9__Alternatives_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=16 && LA17_0<=17)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalHale.g:1915:3: rule__Expression9__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Expression9__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getExpression9Access().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression9__Group__1__Impl"


    // $ANTLR start "rule__Expression9__Group_1_0__0"
    // InternalHale.g:1924:1: rule__Expression9__Group_1_0__0 : rule__Expression9__Group_1_0__0__Impl rule__Expression9__Group_1_0__1 ;
    public final void rule__Expression9__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1928:1: ( rule__Expression9__Group_1_0__0__Impl rule__Expression9__Group_1_0__1 )
            // InternalHale.g:1929:2: rule__Expression9__Group_1_0__0__Impl rule__Expression9__Group_1_0__1
            {
            pushFollow(FOLLOW_12);
            rule__Expression9__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression9__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression9__Group_1_0__0"


    // $ANTLR start "rule__Expression9__Group_1_0__0__Impl"
    // InternalHale.g:1936:1: rule__Expression9__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Expression9__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1940:1: ( ( () ) )
            // InternalHale.g:1941:1: ( () )
            {
            // InternalHale.g:1941:1: ( () )
            // InternalHale.g:1942:2: ()
            {
             before(grammarAccess.getExpression9Access().getLogicalAndLeftAction_1_0_0()); 
            // InternalHale.g:1943:2: ()
            // InternalHale.g:1943:3: 
            {
            }

             after(grammarAccess.getExpression9Access().getLogicalAndLeftAction_1_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression9__Group_1_0__0__Impl"


    // $ANTLR start "rule__Expression9__Group_1_0__1"
    // InternalHale.g:1951:1: rule__Expression9__Group_1_0__1 : rule__Expression9__Group_1_0__1__Impl rule__Expression9__Group_1_0__2 ;
    public final void rule__Expression9__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1955:1: ( rule__Expression9__Group_1_0__1__Impl rule__Expression9__Group_1_0__2 )
            // InternalHale.g:1956:2: rule__Expression9__Group_1_0__1__Impl rule__Expression9__Group_1_0__2
            {
            pushFollow(FOLLOW_9);
            rule__Expression9__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression9__Group_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression9__Group_1_0__1"


    // $ANTLR start "rule__Expression9__Group_1_0__1__Impl"
    // InternalHale.g:1963:1: rule__Expression9__Group_1_0__1__Impl : ( 'and' ) ;
    public final void rule__Expression9__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1967:1: ( ( 'and' ) )
            // InternalHale.g:1968:1: ( 'and' )
            {
            // InternalHale.g:1968:1: ( 'and' )
            // InternalHale.g:1969:2: 'and'
            {
             before(grammarAccess.getExpression9Access().getAndKeyword_1_0_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getExpression9Access().getAndKeyword_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression9__Group_1_0__1__Impl"


    // $ANTLR start "rule__Expression9__Group_1_0__2"
    // InternalHale.g:1978:1: rule__Expression9__Group_1_0__2 : rule__Expression9__Group_1_0__2__Impl ;
    public final void rule__Expression9__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1982:1: ( rule__Expression9__Group_1_0__2__Impl )
            // InternalHale.g:1983:2: rule__Expression9__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression9__Group_1_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression9__Group_1_0__2"


    // $ANTLR start "rule__Expression9__Group_1_0__2__Impl"
    // InternalHale.g:1989:1: rule__Expression9__Group_1_0__2__Impl : ( ( rule__Expression9__RightAssignment_1_0_2 ) ) ;
    public final void rule__Expression9__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1993:1: ( ( ( rule__Expression9__RightAssignment_1_0_2 ) ) )
            // InternalHale.g:1994:1: ( ( rule__Expression9__RightAssignment_1_0_2 ) )
            {
            // InternalHale.g:1994:1: ( ( rule__Expression9__RightAssignment_1_0_2 ) )
            // InternalHale.g:1995:2: ( rule__Expression9__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getExpression9Access().getRightAssignment_1_0_2()); 
            // InternalHale.g:1996:2: ( rule__Expression9__RightAssignment_1_0_2 )
            // InternalHale.g:1996:3: rule__Expression9__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Expression9__RightAssignment_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getExpression9Access().getRightAssignment_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression9__Group_1_0__2__Impl"


    // $ANTLR start "rule__Expression9__Group_1_1__0"
    // InternalHale.g:2005:1: rule__Expression9__Group_1_1__0 : rule__Expression9__Group_1_1__0__Impl rule__Expression9__Group_1_1__1 ;
    public final void rule__Expression9__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2009:1: ( rule__Expression9__Group_1_1__0__Impl rule__Expression9__Group_1_1__1 )
            // InternalHale.g:2010:2: rule__Expression9__Group_1_1__0__Impl rule__Expression9__Group_1_1__1
            {
            pushFollow(FOLLOW_10);
            rule__Expression9__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression9__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression9__Group_1_1__0"


    // $ANTLR start "rule__Expression9__Group_1_1__0__Impl"
    // InternalHale.g:2017:1: rule__Expression9__Group_1_1__0__Impl : ( () ) ;
    public final void rule__Expression9__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2021:1: ( ( () ) )
            // InternalHale.g:2022:1: ( () )
            {
            // InternalHale.g:2022:1: ( () )
            // InternalHale.g:2023:2: ()
            {
             before(grammarAccess.getExpression9Access().getLogicalOrLeftAction_1_1_0()); 
            // InternalHale.g:2024:2: ()
            // InternalHale.g:2024:3: 
            {
            }

             after(grammarAccess.getExpression9Access().getLogicalOrLeftAction_1_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression9__Group_1_1__0__Impl"


    // $ANTLR start "rule__Expression9__Group_1_1__1"
    // InternalHale.g:2032:1: rule__Expression9__Group_1_1__1 : rule__Expression9__Group_1_1__1__Impl rule__Expression9__Group_1_1__2 ;
    public final void rule__Expression9__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2036:1: ( rule__Expression9__Group_1_1__1__Impl rule__Expression9__Group_1_1__2 )
            // InternalHale.g:2037:2: rule__Expression9__Group_1_1__1__Impl rule__Expression9__Group_1_1__2
            {
            pushFollow(FOLLOW_9);
            rule__Expression9__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression9__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression9__Group_1_1__1"


    // $ANTLR start "rule__Expression9__Group_1_1__1__Impl"
    // InternalHale.g:2044:1: rule__Expression9__Group_1_1__1__Impl : ( 'or' ) ;
    public final void rule__Expression9__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2048:1: ( ( 'or' ) )
            // InternalHale.g:2049:1: ( 'or' )
            {
            // InternalHale.g:2049:1: ( 'or' )
            // InternalHale.g:2050:2: 'or'
            {
             before(grammarAccess.getExpression9Access().getOrKeyword_1_1_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getExpression9Access().getOrKeyword_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression9__Group_1_1__1__Impl"


    // $ANTLR start "rule__Expression9__Group_1_1__2"
    // InternalHale.g:2059:1: rule__Expression9__Group_1_1__2 : rule__Expression9__Group_1_1__2__Impl ;
    public final void rule__Expression9__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2063:1: ( rule__Expression9__Group_1_1__2__Impl )
            // InternalHale.g:2064:2: rule__Expression9__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression9__Group_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression9__Group_1_1__2"


    // $ANTLR start "rule__Expression9__Group_1_1__2__Impl"
    // InternalHale.g:2070:1: rule__Expression9__Group_1_1__2__Impl : ( ( rule__Expression9__RightAssignment_1_1_2 ) ) ;
    public final void rule__Expression9__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2074:1: ( ( ( rule__Expression9__RightAssignment_1_1_2 ) ) )
            // InternalHale.g:2075:1: ( ( rule__Expression9__RightAssignment_1_1_2 ) )
            {
            // InternalHale.g:2075:1: ( ( rule__Expression9__RightAssignment_1_1_2 ) )
            // InternalHale.g:2076:2: ( rule__Expression9__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getExpression9Access().getRightAssignment_1_1_2()); 
            // InternalHale.g:2077:2: ( rule__Expression9__RightAssignment_1_1_2 )
            // InternalHale.g:2077:3: rule__Expression9__RightAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Expression9__RightAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getExpression9Access().getRightAssignment_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression9__Group_1_1__2__Impl"


    // $ANTLR start "rule__Expression8__Group__0"
    // InternalHale.g:2086:1: rule__Expression8__Group__0 : rule__Expression8__Group__0__Impl rule__Expression8__Group__1 ;
    public final void rule__Expression8__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2090:1: ( rule__Expression8__Group__0__Impl rule__Expression8__Group__1 )
            // InternalHale.g:2091:2: rule__Expression8__Group__0__Impl rule__Expression8__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Expression8__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression8__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression8__Group__0"


    // $ANTLR start "rule__Expression8__Group__0__Impl"
    // InternalHale.g:2098:1: rule__Expression8__Group__0__Impl : ( ruleExpression7 ) ;
    public final void rule__Expression8__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2102:1: ( ( ruleExpression7 ) )
            // InternalHale.g:2103:1: ( ruleExpression7 )
            {
            // InternalHale.g:2103:1: ( ruleExpression7 )
            // InternalHale.g:2104:2: ruleExpression7
            {
             before(grammarAccess.getExpression8Access().getExpression7ParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression7();

            state._fsp--;

             after(grammarAccess.getExpression8Access().getExpression7ParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression8__Group__0__Impl"


    // $ANTLR start "rule__Expression8__Group__1"
    // InternalHale.g:2113:1: rule__Expression8__Group__1 : rule__Expression8__Group__1__Impl ;
    public final void rule__Expression8__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2117:1: ( rule__Expression8__Group__1__Impl )
            // InternalHale.g:2118:2: rule__Expression8__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression8__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression8__Group__1"


    // $ANTLR start "rule__Expression8__Group__1__Impl"
    // InternalHale.g:2124:1: rule__Expression8__Group__1__Impl : ( ( rule__Expression8__Alternatives_1 )* ) ;
    public final void rule__Expression8__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2128:1: ( ( ( rule__Expression8__Alternatives_1 )* ) )
            // InternalHale.g:2129:1: ( ( rule__Expression8__Alternatives_1 )* )
            {
            // InternalHale.g:2129:1: ( ( rule__Expression8__Alternatives_1 )* )
            // InternalHale.g:2130:2: ( rule__Expression8__Alternatives_1 )*
            {
             before(grammarAccess.getExpression8Access().getAlternatives_1()); 
            // InternalHale.g:2131:2: ( rule__Expression8__Alternatives_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=18 && LA18_0<=19)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalHale.g:2131:3: rule__Expression8__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Expression8__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getExpression8Access().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression8__Group__1__Impl"


    // $ANTLR start "rule__Expression8__Group_1_0__0"
    // InternalHale.g:2140:1: rule__Expression8__Group_1_0__0 : rule__Expression8__Group_1_0__0__Impl rule__Expression8__Group_1_0__1 ;
    public final void rule__Expression8__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2144:1: ( rule__Expression8__Group_1_0__0__Impl rule__Expression8__Group_1_0__1 )
            // InternalHale.g:2145:2: rule__Expression8__Group_1_0__0__Impl rule__Expression8__Group_1_0__1
            {
            pushFollow(FOLLOW_15);
            rule__Expression8__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression8__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression8__Group_1_0__0"


    // $ANTLR start "rule__Expression8__Group_1_0__0__Impl"
    // InternalHale.g:2152:1: rule__Expression8__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Expression8__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2156:1: ( ( () ) )
            // InternalHale.g:2157:1: ( () )
            {
            // InternalHale.g:2157:1: ( () )
            // InternalHale.g:2158:2: ()
            {
             before(grammarAccess.getExpression8Access().getEqualityLeftAction_1_0_0()); 
            // InternalHale.g:2159:2: ()
            // InternalHale.g:2159:3: 
            {
            }

             after(grammarAccess.getExpression8Access().getEqualityLeftAction_1_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression8__Group_1_0__0__Impl"


    // $ANTLR start "rule__Expression8__Group_1_0__1"
    // InternalHale.g:2167:1: rule__Expression8__Group_1_0__1 : rule__Expression8__Group_1_0__1__Impl rule__Expression8__Group_1_0__2 ;
    public final void rule__Expression8__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2171:1: ( rule__Expression8__Group_1_0__1__Impl rule__Expression8__Group_1_0__2 )
            // InternalHale.g:2172:2: rule__Expression8__Group_1_0__1__Impl rule__Expression8__Group_1_0__2
            {
            pushFollow(FOLLOW_9);
            rule__Expression8__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression8__Group_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression8__Group_1_0__1"


    // $ANTLR start "rule__Expression8__Group_1_0__1__Impl"
    // InternalHale.g:2179:1: rule__Expression8__Group_1_0__1__Impl : ( '==' ) ;
    public final void rule__Expression8__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2183:1: ( ( '==' ) )
            // InternalHale.g:2184:1: ( '==' )
            {
            // InternalHale.g:2184:1: ( '==' )
            // InternalHale.g:2185:2: '=='
            {
             before(grammarAccess.getExpression8Access().getEqualsSignEqualsSignKeyword_1_0_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getExpression8Access().getEqualsSignEqualsSignKeyword_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression8__Group_1_0__1__Impl"


    // $ANTLR start "rule__Expression8__Group_1_0__2"
    // InternalHale.g:2194:1: rule__Expression8__Group_1_0__2 : rule__Expression8__Group_1_0__2__Impl ;
    public final void rule__Expression8__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2198:1: ( rule__Expression8__Group_1_0__2__Impl )
            // InternalHale.g:2199:2: rule__Expression8__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression8__Group_1_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression8__Group_1_0__2"


    // $ANTLR start "rule__Expression8__Group_1_0__2__Impl"
    // InternalHale.g:2205:1: rule__Expression8__Group_1_0__2__Impl : ( ( rule__Expression8__RightAssignment_1_0_2 ) ) ;
    public final void rule__Expression8__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2209:1: ( ( ( rule__Expression8__RightAssignment_1_0_2 ) ) )
            // InternalHale.g:2210:1: ( ( rule__Expression8__RightAssignment_1_0_2 ) )
            {
            // InternalHale.g:2210:1: ( ( rule__Expression8__RightAssignment_1_0_2 ) )
            // InternalHale.g:2211:2: ( rule__Expression8__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getExpression8Access().getRightAssignment_1_0_2()); 
            // InternalHale.g:2212:2: ( rule__Expression8__RightAssignment_1_0_2 )
            // InternalHale.g:2212:3: rule__Expression8__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Expression8__RightAssignment_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getExpression8Access().getRightAssignment_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression8__Group_1_0__2__Impl"


    // $ANTLR start "rule__Expression8__Group_1_1__0"
    // InternalHale.g:2221:1: rule__Expression8__Group_1_1__0 : rule__Expression8__Group_1_1__0__Impl rule__Expression8__Group_1_1__1 ;
    public final void rule__Expression8__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2225:1: ( rule__Expression8__Group_1_1__0__Impl rule__Expression8__Group_1_1__1 )
            // InternalHale.g:2226:2: rule__Expression8__Group_1_1__0__Impl rule__Expression8__Group_1_1__1
            {
            pushFollow(FOLLOW_13);
            rule__Expression8__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression8__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression8__Group_1_1__0"


    // $ANTLR start "rule__Expression8__Group_1_1__0__Impl"
    // InternalHale.g:2233:1: rule__Expression8__Group_1_1__0__Impl : ( () ) ;
    public final void rule__Expression8__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2237:1: ( ( () ) )
            // InternalHale.g:2238:1: ( () )
            {
            // InternalHale.g:2238:1: ( () )
            // InternalHale.g:2239:2: ()
            {
             before(grammarAccess.getExpression8Access().getInequalityLeftAction_1_1_0()); 
            // InternalHale.g:2240:2: ()
            // InternalHale.g:2240:3: 
            {
            }

             after(grammarAccess.getExpression8Access().getInequalityLeftAction_1_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression8__Group_1_1__0__Impl"


    // $ANTLR start "rule__Expression8__Group_1_1__1"
    // InternalHale.g:2248:1: rule__Expression8__Group_1_1__1 : rule__Expression8__Group_1_1__1__Impl rule__Expression8__Group_1_1__2 ;
    public final void rule__Expression8__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2252:1: ( rule__Expression8__Group_1_1__1__Impl rule__Expression8__Group_1_1__2 )
            // InternalHale.g:2253:2: rule__Expression8__Group_1_1__1__Impl rule__Expression8__Group_1_1__2
            {
            pushFollow(FOLLOW_9);
            rule__Expression8__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression8__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression8__Group_1_1__1"


    // $ANTLR start "rule__Expression8__Group_1_1__1__Impl"
    // InternalHale.g:2260:1: rule__Expression8__Group_1_1__1__Impl : ( '!=' ) ;
    public final void rule__Expression8__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2264:1: ( ( '!=' ) )
            // InternalHale.g:2265:1: ( '!=' )
            {
            // InternalHale.g:2265:1: ( '!=' )
            // InternalHale.g:2266:2: '!='
            {
             before(grammarAccess.getExpression8Access().getExclamationMarkEqualsSignKeyword_1_1_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getExpression8Access().getExclamationMarkEqualsSignKeyword_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression8__Group_1_1__1__Impl"


    // $ANTLR start "rule__Expression8__Group_1_1__2"
    // InternalHale.g:2275:1: rule__Expression8__Group_1_1__2 : rule__Expression8__Group_1_1__2__Impl ;
    public final void rule__Expression8__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2279:1: ( rule__Expression8__Group_1_1__2__Impl )
            // InternalHale.g:2280:2: rule__Expression8__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression8__Group_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression8__Group_1_1__2"


    // $ANTLR start "rule__Expression8__Group_1_1__2__Impl"
    // InternalHale.g:2286:1: rule__Expression8__Group_1_1__2__Impl : ( ( rule__Expression8__RightAssignment_1_1_2 ) ) ;
    public final void rule__Expression8__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2290:1: ( ( ( rule__Expression8__RightAssignment_1_1_2 ) ) )
            // InternalHale.g:2291:1: ( ( rule__Expression8__RightAssignment_1_1_2 ) )
            {
            // InternalHale.g:2291:1: ( ( rule__Expression8__RightAssignment_1_1_2 ) )
            // InternalHale.g:2292:2: ( rule__Expression8__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getExpression8Access().getRightAssignment_1_1_2()); 
            // InternalHale.g:2293:2: ( rule__Expression8__RightAssignment_1_1_2 )
            // InternalHale.g:2293:3: rule__Expression8__RightAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Expression8__RightAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getExpression8Access().getRightAssignment_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression8__Group_1_1__2__Impl"


    // $ANTLR start "rule__Expression7__Group__0"
    // InternalHale.g:2302:1: rule__Expression7__Group__0 : rule__Expression7__Group__0__Impl rule__Expression7__Group__1 ;
    public final void rule__Expression7__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2306:1: ( rule__Expression7__Group__0__Impl rule__Expression7__Group__1 )
            // InternalHale.g:2307:2: rule__Expression7__Group__0__Impl rule__Expression7__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalHale.g:2314:1: rule__Expression7__Group__0__Impl : ( ruleExpression6 ) ;
    public final void rule__Expression7__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2318:1: ( ( ruleExpression6 ) )
            // InternalHale.g:2319:1: ( ruleExpression6 )
            {
            // InternalHale.g:2319:1: ( ruleExpression6 )
            // InternalHale.g:2320:2: ruleExpression6
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
    // InternalHale.g:2329:1: rule__Expression7__Group__1 : rule__Expression7__Group__1__Impl ;
    public final void rule__Expression7__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2333:1: ( rule__Expression7__Group__1__Impl )
            // InternalHale.g:2334:2: rule__Expression7__Group__1__Impl
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
    // InternalHale.g:2340:1: rule__Expression7__Group__1__Impl : ( ( rule__Expression7__Alternatives_1 )* ) ;
    public final void rule__Expression7__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2344:1: ( ( ( rule__Expression7__Alternatives_1 )* ) )
            // InternalHale.g:2345:1: ( ( rule__Expression7__Alternatives_1 )* )
            {
            // InternalHale.g:2345:1: ( ( rule__Expression7__Alternatives_1 )* )
            // InternalHale.g:2346:2: ( rule__Expression7__Alternatives_1 )*
            {
             before(grammarAccess.getExpression7Access().getAlternatives_1()); 
            // InternalHale.g:2347:2: ( rule__Expression7__Alternatives_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=20 && LA19_0<=23)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalHale.g:2347:3: rule__Expression7__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Expression7__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalHale.g:2356:1: rule__Expression7__Group_1_0__0 : rule__Expression7__Group_1_0__0__Impl rule__Expression7__Group_1_0__1 ;
    public final void rule__Expression7__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2360:1: ( rule__Expression7__Group_1_0__0__Impl rule__Expression7__Group_1_0__1 )
            // InternalHale.g:2361:2: rule__Expression7__Group_1_0__0__Impl rule__Expression7__Group_1_0__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalHale.g:2368:1: rule__Expression7__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Expression7__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2372:1: ( ( () ) )
            // InternalHale.g:2373:1: ( () )
            {
            // InternalHale.g:2373:1: ( () )
            // InternalHale.g:2374:2: ()
            {
             before(grammarAccess.getExpression7Access().getLessThanOrEqualLeftAction_1_0_0()); 
            // InternalHale.g:2375:2: ()
            // InternalHale.g:2375:3: 
            {
            }

             after(grammarAccess.getExpression7Access().getLessThanOrEqualLeftAction_1_0_0()); 

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
    // InternalHale.g:2383:1: rule__Expression7__Group_1_0__1 : rule__Expression7__Group_1_0__1__Impl rule__Expression7__Group_1_0__2 ;
    public final void rule__Expression7__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2387:1: ( rule__Expression7__Group_1_0__1__Impl rule__Expression7__Group_1_0__2 )
            // InternalHale.g:2388:2: rule__Expression7__Group_1_0__1__Impl rule__Expression7__Group_1_0__2
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
    // InternalHale.g:2395:1: rule__Expression7__Group_1_0__1__Impl : ( '<=' ) ;
    public final void rule__Expression7__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2399:1: ( ( '<=' ) )
            // InternalHale.g:2400:1: ( '<=' )
            {
            // InternalHale.g:2400:1: ( '<=' )
            // InternalHale.g:2401:2: '<='
            {
             before(grammarAccess.getExpression7Access().getLessThanSignEqualsSignKeyword_1_0_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getExpression7Access().getLessThanSignEqualsSignKeyword_1_0_1()); 

            }


            }

        }
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
    // InternalHale.g:2410:1: rule__Expression7__Group_1_0__2 : rule__Expression7__Group_1_0__2__Impl ;
    public final void rule__Expression7__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2414:1: ( rule__Expression7__Group_1_0__2__Impl )
            // InternalHale.g:2415:2: rule__Expression7__Group_1_0__2__Impl
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
    // InternalHale.g:2421:1: rule__Expression7__Group_1_0__2__Impl : ( ( rule__Expression7__RightAssignment_1_0_2 ) ) ;
    public final void rule__Expression7__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2425:1: ( ( ( rule__Expression7__RightAssignment_1_0_2 ) ) )
            // InternalHale.g:2426:1: ( ( rule__Expression7__RightAssignment_1_0_2 ) )
            {
            // InternalHale.g:2426:1: ( ( rule__Expression7__RightAssignment_1_0_2 ) )
            // InternalHale.g:2427:2: ( rule__Expression7__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getExpression7Access().getRightAssignment_1_0_2()); 
            // InternalHale.g:2428:2: ( rule__Expression7__RightAssignment_1_0_2 )
            // InternalHale.g:2428:3: rule__Expression7__RightAssignment_1_0_2
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
    // InternalHale.g:2437:1: rule__Expression7__Group_1_1__0 : rule__Expression7__Group_1_1__0__Impl rule__Expression7__Group_1_1__1 ;
    public final void rule__Expression7__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2441:1: ( rule__Expression7__Group_1_1__0__Impl rule__Expression7__Group_1_1__1 )
            // InternalHale.g:2442:2: rule__Expression7__Group_1_1__0__Impl rule__Expression7__Group_1_1__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalHale.g:2449:1: rule__Expression7__Group_1_1__0__Impl : ( () ) ;
    public final void rule__Expression7__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2453:1: ( ( () ) )
            // InternalHale.g:2454:1: ( () )
            {
            // InternalHale.g:2454:1: ( () )
            // InternalHale.g:2455:2: ()
            {
             before(grammarAccess.getExpression7Access().getLessThanLeftAction_1_1_0()); 
            // InternalHale.g:2456:2: ()
            // InternalHale.g:2456:3: 
            {
            }

             after(grammarAccess.getExpression7Access().getLessThanLeftAction_1_1_0()); 

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
    // InternalHale.g:2464:1: rule__Expression7__Group_1_1__1 : rule__Expression7__Group_1_1__1__Impl rule__Expression7__Group_1_1__2 ;
    public final void rule__Expression7__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2468:1: ( rule__Expression7__Group_1_1__1__Impl rule__Expression7__Group_1_1__2 )
            // InternalHale.g:2469:2: rule__Expression7__Group_1_1__1__Impl rule__Expression7__Group_1_1__2
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
    // InternalHale.g:2476:1: rule__Expression7__Group_1_1__1__Impl : ( '<' ) ;
    public final void rule__Expression7__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2480:1: ( ( '<' ) )
            // InternalHale.g:2481:1: ( '<' )
            {
            // InternalHale.g:2481:1: ( '<' )
            // InternalHale.g:2482:2: '<'
            {
             before(grammarAccess.getExpression7Access().getLessThanSignKeyword_1_1_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getExpression7Access().getLessThanSignKeyword_1_1_1()); 

            }


            }

        }
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
    // InternalHale.g:2491:1: rule__Expression7__Group_1_1__2 : rule__Expression7__Group_1_1__2__Impl ;
    public final void rule__Expression7__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2495:1: ( rule__Expression7__Group_1_1__2__Impl )
            // InternalHale.g:2496:2: rule__Expression7__Group_1_1__2__Impl
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
    // InternalHale.g:2502:1: rule__Expression7__Group_1_1__2__Impl : ( ( rule__Expression7__RightAssignment_1_1_2 ) ) ;
    public final void rule__Expression7__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2506:1: ( ( ( rule__Expression7__RightAssignment_1_1_2 ) ) )
            // InternalHale.g:2507:1: ( ( rule__Expression7__RightAssignment_1_1_2 ) )
            {
            // InternalHale.g:2507:1: ( ( rule__Expression7__RightAssignment_1_1_2 ) )
            // InternalHale.g:2508:2: ( rule__Expression7__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getExpression7Access().getRightAssignment_1_1_2()); 
            // InternalHale.g:2509:2: ( rule__Expression7__RightAssignment_1_1_2 )
            // InternalHale.g:2509:3: rule__Expression7__RightAssignment_1_1_2
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


    // $ANTLR start "rule__Expression7__Group_1_2__0"
    // InternalHale.g:2518:1: rule__Expression7__Group_1_2__0 : rule__Expression7__Group_1_2__0__Impl rule__Expression7__Group_1_2__1 ;
    public final void rule__Expression7__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2522:1: ( rule__Expression7__Group_1_2__0__Impl rule__Expression7__Group_1_2__1 )
            // InternalHale.g:2523:2: rule__Expression7__Group_1_2__0__Impl rule__Expression7__Group_1_2__1
            {
            pushFollow(FOLLOW_20);
            rule__Expression7__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression7__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression7__Group_1_2__0"


    // $ANTLR start "rule__Expression7__Group_1_2__0__Impl"
    // InternalHale.g:2530:1: rule__Expression7__Group_1_2__0__Impl : ( () ) ;
    public final void rule__Expression7__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2534:1: ( ( () ) )
            // InternalHale.g:2535:1: ( () )
            {
            // InternalHale.g:2535:1: ( () )
            // InternalHale.g:2536:2: ()
            {
             before(grammarAccess.getExpression7Access().getGreaterThanOrEqualLeftAction_1_2_0()); 
            // InternalHale.g:2537:2: ()
            // InternalHale.g:2537:3: 
            {
            }

             after(grammarAccess.getExpression7Access().getGreaterThanOrEqualLeftAction_1_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression7__Group_1_2__0__Impl"


    // $ANTLR start "rule__Expression7__Group_1_2__1"
    // InternalHale.g:2545:1: rule__Expression7__Group_1_2__1 : rule__Expression7__Group_1_2__1__Impl rule__Expression7__Group_1_2__2 ;
    public final void rule__Expression7__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2549:1: ( rule__Expression7__Group_1_2__1__Impl rule__Expression7__Group_1_2__2 )
            // InternalHale.g:2550:2: rule__Expression7__Group_1_2__1__Impl rule__Expression7__Group_1_2__2
            {
            pushFollow(FOLLOW_9);
            rule__Expression7__Group_1_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression7__Group_1_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression7__Group_1_2__1"


    // $ANTLR start "rule__Expression7__Group_1_2__1__Impl"
    // InternalHale.g:2557:1: rule__Expression7__Group_1_2__1__Impl : ( '>=' ) ;
    public final void rule__Expression7__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2561:1: ( ( '>=' ) )
            // InternalHale.g:2562:1: ( '>=' )
            {
            // InternalHale.g:2562:1: ( '>=' )
            // InternalHale.g:2563:2: '>='
            {
             before(grammarAccess.getExpression7Access().getGreaterThanSignEqualsSignKeyword_1_2_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getExpression7Access().getGreaterThanSignEqualsSignKeyword_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression7__Group_1_2__1__Impl"


    // $ANTLR start "rule__Expression7__Group_1_2__2"
    // InternalHale.g:2572:1: rule__Expression7__Group_1_2__2 : rule__Expression7__Group_1_2__2__Impl ;
    public final void rule__Expression7__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2576:1: ( rule__Expression7__Group_1_2__2__Impl )
            // InternalHale.g:2577:2: rule__Expression7__Group_1_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression7__Group_1_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression7__Group_1_2__2"


    // $ANTLR start "rule__Expression7__Group_1_2__2__Impl"
    // InternalHale.g:2583:1: rule__Expression7__Group_1_2__2__Impl : ( ( rule__Expression7__RightAssignment_1_2_2 ) ) ;
    public final void rule__Expression7__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2587:1: ( ( ( rule__Expression7__RightAssignment_1_2_2 ) ) )
            // InternalHale.g:2588:1: ( ( rule__Expression7__RightAssignment_1_2_2 ) )
            {
            // InternalHale.g:2588:1: ( ( rule__Expression7__RightAssignment_1_2_2 ) )
            // InternalHale.g:2589:2: ( rule__Expression7__RightAssignment_1_2_2 )
            {
             before(grammarAccess.getExpression7Access().getRightAssignment_1_2_2()); 
            // InternalHale.g:2590:2: ( rule__Expression7__RightAssignment_1_2_2 )
            // InternalHale.g:2590:3: rule__Expression7__RightAssignment_1_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Expression7__RightAssignment_1_2_2();

            state._fsp--;


            }

             after(grammarAccess.getExpression7Access().getRightAssignment_1_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression7__Group_1_2__2__Impl"


    // $ANTLR start "rule__Expression7__Group_1_3__0"
    // InternalHale.g:2599:1: rule__Expression7__Group_1_3__0 : rule__Expression7__Group_1_3__0__Impl rule__Expression7__Group_1_3__1 ;
    public final void rule__Expression7__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2603:1: ( rule__Expression7__Group_1_3__0__Impl rule__Expression7__Group_1_3__1 )
            // InternalHale.g:2604:2: rule__Expression7__Group_1_3__0__Impl rule__Expression7__Group_1_3__1
            {
            pushFollow(FOLLOW_16);
            rule__Expression7__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression7__Group_1_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression7__Group_1_3__0"


    // $ANTLR start "rule__Expression7__Group_1_3__0__Impl"
    // InternalHale.g:2611:1: rule__Expression7__Group_1_3__0__Impl : ( () ) ;
    public final void rule__Expression7__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2615:1: ( ( () ) )
            // InternalHale.g:2616:1: ( () )
            {
            // InternalHale.g:2616:1: ( () )
            // InternalHale.g:2617:2: ()
            {
             before(grammarAccess.getExpression7Access().getGreaterThanLeftAction_1_3_0()); 
            // InternalHale.g:2618:2: ()
            // InternalHale.g:2618:3: 
            {
            }

             after(grammarAccess.getExpression7Access().getGreaterThanLeftAction_1_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression7__Group_1_3__0__Impl"


    // $ANTLR start "rule__Expression7__Group_1_3__1"
    // InternalHale.g:2626:1: rule__Expression7__Group_1_3__1 : rule__Expression7__Group_1_3__1__Impl rule__Expression7__Group_1_3__2 ;
    public final void rule__Expression7__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2630:1: ( rule__Expression7__Group_1_3__1__Impl rule__Expression7__Group_1_3__2 )
            // InternalHale.g:2631:2: rule__Expression7__Group_1_3__1__Impl rule__Expression7__Group_1_3__2
            {
            pushFollow(FOLLOW_9);
            rule__Expression7__Group_1_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression7__Group_1_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression7__Group_1_3__1"


    // $ANTLR start "rule__Expression7__Group_1_3__1__Impl"
    // InternalHale.g:2638:1: rule__Expression7__Group_1_3__1__Impl : ( '>' ) ;
    public final void rule__Expression7__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2642:1: ( ( '>' ) )
            // InternalHale.g:2643:1: ( '>' )
            {
            // InternalHale.g:2643:1: ( '>' )
            // InternalHale.g:2644:2: '>'
            {
             before(grammarAccess.getExpression7Access().getGreaterThanSignKeyword_1_3_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getExpression7Access().getGreaterThanSignKeyword_1_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression7__Group_1_3__1__Impl"


    // $ANTLR start "rule__Expression7__Group_1_3__2"
    // InternalHale.g:2653:1: rule__Expression7__Group_1_3__2 : rule__Expression7__Group_1_3__2__Impl ;
    public final void rule__Expression7__Group_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2657:1: ( rule__Expression7__Group_1_3__2__Impl )
            // InternalHale.g:2658:2: rule__Expression7__Group_1_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression7__Group_1_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression7__Group_1_3__2"


    // $ANTLR start "rule__Expression7__Group_1_3__2__Impl"
    // InternalHale.g:2664:1: rule__Expression7__Group_1_3__2__Impl : ( ( rule__Expression7__RightAssignment_1_3_2 ) ) ;
    public final void rule__Expression7__Group_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2668:1: ( ( ( rule__Expression7__RightAssignment_1_3_2 ) ) )
            // InternalHale.g:2669:1: ( ( rule__Expression7__RightAssignment_1_3_2 ) )
            {
            // InternalHale.g:2669:1: ( ( rule__Expression7__RightAssignment_1_3_2 ) )
            // InternalHale.g:2670:2: ( rule__Expression7__RightAssignment_1_3_2 )
            {
             before(grammarAccess.getExpression7Access().getRightAssignment_1_3_2()); 
            // InternalHale.g:2671:2: ( rule__Expression7__RightAssignment_1_3_2 )
            // InternalHale.g:2671:3: rule__Expression7__RightAssignment_1_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Expression7__RightAssignment_1_3_2();

            state._fsp--;


            }

             after(grammarAccess.getExpression7Access().getRightAssignment_1_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression7__Group_1_3__2__Impl"


    // $ANTLR start "rule__Expression6__Group__0"
    // InternalHale.g:2680:1: rule__Expression6__Group__0 : rule__Expression6__Group__0__Impl rule__Expression6__Group__1 ;
    public final void rule__Expression6__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2684:1: ( rule__Expression6__Group__0__Impl rule__Expression6__Group__1 )
            // InternalHale.g:2685:2: rule__Expression6__Group__0__Impl rule__Expression6__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalHale.g:2692:1: rule__Expression6__Group__0__Impl : ( ruleExpression5 ) ;
    public final void rule__Expression6__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2696:1: ( ( ruleExpression5 ) )
            // InternalHale.g:2697:1: ( ruleExpression5 )
            {
            // InternalHale.g:2697:1: ( ruleExpression5 )
            // InternalHale.g:2698:2: ruleExpression5
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
    // InternalHale.g:2707:1: rule__Expression6__Group__1 : rule__Expression6__Group__1__Impl ;
    public final void rule__Expression6__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2711:1: ( rule__Expression6__Group__1__Impl )
            // InternalHale.g:2712:2: rule__Expression6__Group__1__Impl
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
    // InternalHale.g:2718:1: rule__Expression6__Group__1__Impl : ( ( rule__Expression6__Alternatives_1 )* ) ;
    public final void rule__Expression6__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2722:1: ( ( ( rule__Expression6__Alternatives_1 )* ) )
            // InternalHale.g:2723:1: ( ( rule__Expression6__Alternatives_1 )* )
            {
            // InternalHale.g:2723:1: ( ( rule__Expression6__Alternatives_1 )* )
            // InternalHale.g:2724:2: ( rule__Expression6__Alternatives_1 )*
            {
             before(grammarAccess.getExpression6Access().getAlternatives_1()); 
            // InternalHale.g:2725:2: ( rule__Expression6__Alternatives_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=24 && LA20_0<=25)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalHale.g:2725:3: rule__Expression6__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Expression6__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalHale.g:2734:1: rule__Expression6__Group_1_0__0 : rule__Expression6__Group_1_0__0__Impl rule__Expression6__Group_1_0__1 ;
    public final void rule__Expression6__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2738:1: ( rule__Expression6__Group_1_0__0__Impl rule__Expression6__Group_1_0__1 )
            // InternalHale.g:2739:2: rule__Expression6__Group_1_0__0__Impl rule__Expression6__Group_1_0__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalHale.g:2746:1: rule__Expression6__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Expression6__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2750:1: ( ( () ) )
            // InternalHale.g:2751:1: ( () )
            {
            // InternalHale.g:2751:1: ( () )
            // InternalHale.g:2752:2: ()
            {
             before(grammarAccess.getExpression6Access().getAdditionLeftAction_1_0_0()); 
            // InternalHale.g:2753:2: ()
            // InternalHale.g:2753:3: 
            {
            }

             after(grammarAccess.getExpression6Access().getAdditionLeftAction_1_0_0()); 

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
    // InternalHale.g:2761:1: rule__Expression6__Group_1_0__1 : rule__Expression6__Group_1_0__1__Impl rule__Expression6__Group_1_0__2 ;
    public final void rule__Expression6__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2765:1: ( rule__Expression6__Group_1_0__1__Impl rule__Expression6__Group_1_0__2 )
            // InternalHale.g:2766:2: rule__Expression6__Group_1_0__1__Impl rule__Expression6__Group_1_0__2
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
    // InternalHale.g:2773:1: rule__Expression6__Group_1_0__1__Impl : ( '+' ) ;
    public final void rule__Expression6__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2777:1: ( ( '+' ) )
            // InternalHale.g:2778:1: ( '+' )
            {
            // InternalHale.g:2778:1: ( '+' )
            // InternalHale.g:2779:2: '+'
            {
             before(grammarAccess.getExpression6Access().getPlusSignKeyword_1_0_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getExpression6Access().getPlusSignKeyword_1_0_1()); 

            }


            }

        }
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
    // InternalHale.g:2788:1: rule__Expression6__Group_1_0__2 : rule__Expression6__Group_1_0__2__Impl ;
    public final void rule__Expression6__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2792:1: ( rule__Expression6__Group_1_0__2__Impl )
            // InternalHale.g:2793:2: rule__Expression6__Group_1_0__2__Impl
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
    // InternalHale.g:2799:1: rule__Expression6__Group_1_0__2__Impl : ( ( rule__Expression6__RightAssignment_1_0_2 ) ) ;
    public final void rule__Expression6__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2803:1: ( ( ( rule__Expression6__RightAssignment_1_0_2 ) ) )
            // InternalHale.g:2804:1: ( ( rule__Expression6__RightAssignment_1_0_2 ) )
            {
            // InternalHale.g:2804:1: ( ( rule__Expression6__RightAssignment_1_0_2 ) )
            // InternalHale.g:2805:2: ( rule__Expression6__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getExpression6Access().getRightAssignment_1_0_2()); 
            // InternalHale.g:2806:2: ( rule__Expression6__RightAssignment_1_0_2 )
            // InternalHale.g:2806:3: rule__Expression6__RightAssignment_1_0_2
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
    // InternalHale.g:2815:1: rule__Expression6__Group_1_1__0 : rule__Expression6__Group_1_1__0__Impl rule__Expression6__Group_1_1__1 ;
    public final void rule__Expression6__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2819:1: ( rule__Expression6__Group_1_1__0__Impl rule__Expression6__Group_1_1__1 )
            // InternalHale.g:2820:2: rule__Expression6__Group_1_1__0__Impl rule__Expression6__Group_1_1__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalHale.g:2827:1: rule__Expression6__Group_1_1__0__Impl : ( () ) ;
    public final void rule__Expression6__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2831:1: ( ( () ) )
            // InternalHale.g:2832:1: ( () )
            {
            // InternalHale.g:2832:1: ( () )
            // InternalHale.g:2833:2: ()
            {
             before(grammarAccess.getExpression6Access().getSubtractionLeftAction_1_1_0()); 
            // InternalHale.g:2834:2: ()
            // InternalHale.g:2834:3: 
            {
            }

             after(grammarAccess.getExpression6Access().getSubtractionLeftAction_1_1_0()); 

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
    // InternalHale.g:2842:1: rule__Expression6__Group_1_1__1 : rule__Expression6__Group_1_1__1__Impl rule__Expression6__Group_1_1__2 ;
    public final void rule__Expression6__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2846:1: ( rule__Expression6__Group_1_1__1__Impl rule__Expression6__Group_1_1__2 )
            // InternalHale.g:2847:2: rule__Expression6__Group_1_1__1__Impl rule__Expression6__Group_1_1__2
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
    // InternalHale.g:2854:1: rule__Expression6__Group_1_1__1__Impl : ( '-' ) ;
    public final void rule__Expression6__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2858:1: ( ( '-' ) )
            // InternalHale.g:2859:1: ( '-' )
            {
            // InternalHale.g:2859:1: ( '-' )
            // InternalHale.g:2860:2: '-'
            {
             before(grammarAccess.getExpression6Access().getHyphenMinusKeyword_1_1_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getExpression6Access().getHyphenMinusKeyword_1_1_1()); 

            }


            }

        }
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
    // InternalHale.g:2869:1: rule__Expression6__Group_1_1__2 : rule__Expression6__Group_1_1__2__Impl ;
    public final void rule__Expression6__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2873:1: ( rule__Expression6__Group_1_1__2__Impl )
            // InternalHale.g:2874:2: rule__Expression6__Group_1_1__2__Impl
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
    // InternalHale.g:2880:1: rule__Expression6__Group_1_1__2__Impl : ( ( rule__Expression6__RightAssignment_1_1_2 ) ) ;
    public final void rule__Expression6__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2884:1: ( ( ( rule__Expression6__RightAssignment_1_1_2 ) ) )
            // InternalHale.g:2885:1: ( ( rule__Expression6__RightAssignment_1_1_2 ) )
            {
            // InternalHale.g:2885:1: ( ( rule__Expression6__RightAssignment_1_1_2 ) )
            // InternalHale.g:2886:2: ( rule__Expression6__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getExpression6Access().getRightAssignment_1_1_2()); 
            // InternalHale.g:2887:2: ( rule__Expression6__RightAssignment_1_1_2 )
            // InternalHale.g:2887:3: rule__Expression6__RightAssignment_1_1_2
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
    // InternalHale.g:2896:1: rule__Expression5__Group__0 : rule__Expression5__Group__0__Impl rule__Expression5__Group__1 ;
    public final void rule__Expression5__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2900:1: ( rule__Expression5__Group__0__Impl rule__Expression5__Group__1 )
            // InternalHale.g:2901:2: rule__Expression5__Group__0__Impl rule__Expression5__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalHale.g:2908:1: rule__Expression5__Group__0__Impl : ( ruleExpression4 ) ;
    public final void rule__Expression5__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2912:1: ( ( ruleExpression4 ) )
            // InternalHale.g:2913:1: ( ruleExpression4 )
            {
            // InternalHale.g:2913:1: ( ruleExpression4 )
            // InternalHale.g:2914:2: ruleExpression4
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
    // InternalHale.g:2923:1: rule__Expression5__Group__1 : rule__Expression5__Group__1__Impl ;
    public final void rule__Expression5__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2927:1: ( rule__Expression5__Group__1__Impl )
            // InternalHale.g:2928:2: rule__Expression5__Group__1__Impl
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
    // InternalHale.g:2934:1: rule__Expression5__Group__1__Impl : ( ( rule__Expression5__Alternatives_1 )* ) ;
    public final void rule__Expression5__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2938:1: ( ( ( rule__Expression5__Alternatives_1 )* ) )
            // InternalHale.g:2939:1: ( ( rule__Expression5__Alternatives_1 )* )
            {
            // InternalHale.g:2939:1: ( ( rule__Expression5__Alternatives_1 )* )
            // InternalHale.g:2940:2: ( rule__Expression5__Alternatives_1 )*
            {
             before(grammarAccess.getExpression5Access().getAlternatives_1()); 
            // InternalHale.g:2941:2: ( rule__Expression5__Alternatives_1 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=26 && LA21_0<=28)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalHale.g:2941:3: rule__Expression5__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Expression5__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalHale.g:2950:1: rule__Expression5__Group_1_0__0 : rule__Expression5__Group_1_0__0__Impl rule__Expression5__Group_1_0__1 ;
    public final void rule__Expression5__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2954:1: ( rule__Expression5__Group_1_0__0__Impl rule__Expression5__Group_1_0__1 )
            // InternalHale.g:2955:2: rule__Expression5__Group_1_0__0__Impl rule__Expression5__Group_1_0__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalHale.g:2962:1: rule__Expression5__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Expression5__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2966:1: ( ( () ) )
            // InternalHale.g:2967:1: ( () )
            {
            // InternalHale.g:2967:1: ( () )
            // InternalHale.g:2968:2: ()
            {
             before(grammarAccess.getExpression5Access().getMultiplicationLeftAction_1_0_0()); 
            // InternalHale.g:2969:2: ()
            // InternalHale.g:2969:3: 
            {
            }

             after(grammarAccess.getExpression5Access().getMultiplicationLeftAction_1_0_0()); 

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
    // InternalHale.g:2977:1: rule__Expression5__Group_1_0__1 : rule__Expression5__Group_1_0__1__Impl rule__Expression5__Group_1_0__2 ;
    public final void rule__Expression5__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2981:1: ( rule__Expression5__Group_1_0__1__Impl rule__Expression5__Group_1_0__2 )
            // InternalHale.g:2982:2: rule__Expression5__Group_1_0__1__Impl rule__Expression5__Group_1_0__2
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
    // InternalHale.g:2989:1: rule__Expression5__Group_1_0__1__Impl : ( '*' ) ;
    public final void rule__Expression5__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2993:1: ( ( '*' ) )
            // InternalHale.g:2994:1: ( '*' )
            {
            // InternalHale.g:2994:1: ( '*' )
            // InternalHale.g:2995:2: '*'
            {
             before(grammarAccess.getExpression5Access().getAsteriskKeyword_1_0_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getExpression5Access().getAsteriskKeyword_1_0_1()); 

            }


            }

        }
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
    // InternalHale.g:3004:1: rule__Expression5__Group_1_0__2 : rule__Expression5__Group_1_0__2__Impl ;
    public final void rule__Expression5__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3008:1: ( rule__Expression5__Group_1_0__2__Impl )
            // InternalHale.g:3009:2: rule__Expression5__Group_1_0__2__Impl
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
    // InternalHale.g:3015:1: rule__Expression5__Group_1_0__2__Impl : ( ( rule__Expression5__RightAssignment_1_0_2 ) ) ;
    public final void rule__Expression5__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3019:1: ( ( ( rule__Expression5__RightAssignment_1_0_2 ) ) )
            // InternalHale.g:3020:1: ( ( rule__Expression5__RightAssignment_1_0_2 ) )
            {
            // InternalHale.g:3020:1: ( ( rule__Expression5__RightAssignment_1_0_2 ) )
            // InternalHale.g:3021:2: ( rule__Expression5__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getExpression5Access().getRightAssignment_1_0_2()); 
            // InternalHale.g:3022:2: ( rule__Expression5__RightAssignment_1_0_2 )
            // InternalHale.g:3022:3: rule__Expression5__RightAssignment_1_0_2
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
    // InternalHale.g:3031:1: rule__Expression5__Group_1_1__0 : rule__Expression5__Group_1_1__0__Impl rule__Expression5__Group_1_1__1 ;
    public final void rule__Expression5__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3035:1: ( rule__Expression5__Group_1_1__0__Impl rule__Expression5__Group_1_1__1 )
            // InternalHale.g:3036:2: rule__Expression5__Group_1_1__0__Impl rule__Expression5__Group_1_1__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalHale.g:3043:1: rule__Expression5__Group_1_1__0__Impl : ( () ) ;
    public final void rule__Expression5__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3047:1: ( ( () ) )
            // InternalHale.g:3048:1: ( () )
            {
            // InternalHale.g:3048:1: ( () )
            // InternalHale.g:3049:2: ()
            {
             before(grammarAccess.getExpression5Access().getDivisionLeftAction_1_1_0()); 
            // InternalHale.g:3050:2: ()
            // InternalHale.g:3050:3: 
            {
            }

             after(grammarAccess.getExpression5Access().getDivisionLeftAction_1_1_0()); 

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
    // InternalHale.g:3058:1: rule__Expression5__Group_1_1__1 : rule__Expression5__Group_1_1__1__Impl rule__Expression5__Group_1_1__2 ;
    public final void rule__Expression5__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3062:1: ( rule__Expression5__Group_1_1__1__Impl rule__Expression5__Group_1_1__2 )
            // InternalHale.g:3063:2: rule__Expression5__Group_1_1__1__Impl rule__Expression5__Group_1_1__2
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
    // InternalHale.g:3070:1: rule__Expression5__Group_1_1__1__Impl : ( '/' ) ;
    public final void rule__Expression5__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3074:1: ( ( '/' ) )
            // InternalHale.g:3075:1: ( '/' )
            {
            // InternalHale.g:3075:1: ( '/' )
            // InternalHale.g:3076:2: '/'
            {
             before(grammarAccess.getExpression5Access().getSolidusKeyword_1_1_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getExpression5Access().getSolidusKeyword_1_1_1()); 

            }


            }

        }
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
    // InternalHale.g:3085:1: rule__Expression5__Group_1_1__2 : rule__Expression5__Group_1_1__2__Impl ;
    public final void rule__Expression5__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3089:1: ( rule__Expression5__Group_1_1__2__Impl )
            // InternalHale.g:3090:2: rule__Expression5__Group_1_1__2__Impl
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
    // InternalHale.g:3096:1: rule__Expression5__Group_1_1__2__Impl : ( ( rule__Expression5__RightAssignment_1_1_2 ) ) ;
    public final void rule__Expression5__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3100:1: ( ( ( rule__Expression5__RightAssignment_1_1_2 ) ) )
            // InternalHale.g:3101:1: ( ( rule__Expression5__RightAssignment_1_1_2 ) )
            {
            // InternalHale.g:3101:1: ( ( rule__Expression5__RightAssignment_1_1_2 ) )
            // InternalHale.g:3102:2: ( rule__Expression5__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getExpression5Access().getRightAssignment_1_1_2()); 
            // InternalHale.g:3103:2: ( rule__Expression5__RightAssignment_1_1_2 )
            // InternalHale.g:3103:3: rule__Expression5__RightAssignment_1_1_2
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
    // InternalHale.g:3112:1: rule__Expression5__Group_1_2__0 : rule__Expression5__Group_1_2__0__Impl rule__Expression5__Group_1_2__1 ;
    public final void rule__Expression5__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3116:1: ( rule__Expression5__Group_1_2__0__Impl rule__Expression5__Group_1_2__1 )
            // InternalHale.g:3117:2: rule__Expression5__Group_1_2__0__Impl rule__Expression5__Group_1_2__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalHale.g:3124:1: rule__Expression5__Group_1_2__0__Impl : ( () ) ;
    public final void rule__Expression5__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3128:1: ( ( () ) )
            // InternalHale.g:3129:1: ( () )
            {
            // InternalHale.g:3129:1: ( () )
            // InternalHale.g:3130:2: ()
            {
             before(grammarAccess.getExpression5Access().getRemainderLeftAction_1_2_0()); 
            // InternalHale.g:3131:2: ()
            // InternalHale.g:3131:3: 
            {
            }

             after(grammarAccess.getExpression5Access().getRemainderLeftAction_1_2_0()); 

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
    // InternalHale.g:3139:1: rule__Expression5__Group_1_2__1 : rule__Expression5__Group_1_2__1__Impl rule__Expression5__Group_1_2__2 ;
    public final void rule__Expression5__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3143:1: ( rule__Expression5__Group_1_2__1__Impl rule__Expression5__Group_1_2__2 )
            // InternalHale.g:3144:2: rule__Expression5__Group_1_2__1__Impl rule__Expression5__Group_1_2__2
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
    // InternalHale.g:3151:1: rule__Expression5__Group_1_2__1__Impl : ( '%' ) ;
    public final void rule__Expression5__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3155:1: ( ( '%' ) )
            // InternalHale.g:3156:1: ( '%' )
            {
            // InternalHale.g:3156:1: ( '%' )
            // InternalHale.g:3157:2: '%'
            {
             before(grammarAccess.getExpression5Access().getPercentSignKeyword_1_2_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getExpression5Access().getPercentSignKeyword_1_2_1()); 

            }


            }

        }
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
    // InternalHale.g:3166:1: rule__Expression5__Group_1_2__2 : rule__Expression5__Group_1_2__2__Impl ;
    public final void rule__Expression5__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3170:1: ( rule__Expression5__Group_1_2__2__Impl )
            // InternalHale.g:3171:2: rule__Expression5__Group_1_2__2__Impl
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
    // InternalHale.g:3177:1: rule__Expression5__Group_1_2__2__Impl : ( ( rule__Expression5__RightAssignment_1_2_2 ) ) ;
    public final void rule__Expression5__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3181:1: ( ( ( rule__Expression5__RightAssignment_1_2_2 ) ) )
            // InternalHale.g:3182:1: ( ( rule__Expression5__RightAssignment_1_2_2 ) )
            {
            // InternalHale.g:3182:1: ( ( rule__Expression5__RightAssignment_1_2_2 ) )
            // InternalHale.g:3183:2: ( rule__Expression5__RightAssignment_1_2_2 )
            {
             before(grammarAccess.getExpression5Access().getRightAssignment_1_2_2()); 
            // InternalHale.g:3184:2: ( rule__Expression5__RightAssignment_1_2_2 )
            // InternalHale.g:3184:3: rule__Expression5__RightAssignment_1_2_2
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


    // $ANTLR start "rule__Expression4__Group__0"
    // InternalHale.g:3193:1: rule__Expression4__Group__0 : rule__Expression4__Group__0__Impl rule__Expression4__Group__1 ;
    public final void rule__Expression4__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3197:1: ( rule__Expression4__Group__0__Impl rule__Expression4__Group__1 )
            // InternalHale.g:3198:2: rule__Expression4__Group__0__Impl rule__Expression4__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalHale.g:3205:1: rule__Expression4__Group__0__Impl : ( ruleExpression3 ) ;
    public final void rule__Expression4__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3209:1: ( ( ruleExpression3 ) )
            // InternalHale.g:3210:1: ( ruleExpression3 )
            {
            // InternalHale.g:3210:1: ( ruleExpression3 )
            // InternalHale.g:3211:2: ruleExpression3
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
    // InternalHale.g:3220:1: rule__Expression4__Group__1 : rule__Expression4__Group__1__Impl ;
    public final void rule__Expression4__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3224:1: ( rule__Expression4__Group__1__Impl )
            // InternalHale.g:3225:2: rule__Expression4__Group__1__Impl
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
    // InternalHale.g:3231:1: rule__Expression4__Group__1__Impl : ( ( rule__Expression4__Group_1__0 )* ) ;
    public final void rule__Expression4__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3235:1: ( ( ( rule__Expression4__Group_1__0 )* ) )
            // InternalHale.g:3236:1: ( ( rule__Expression4__Group_1__0 )* )
            {
            // InternalHale.g:3236:1: ( ( rule__Expression4__Group_1__0 )* )
            // InternalHale.g:3237:2: ( rule__Expression4__Group_1__0 )*
            {
             before(grammarAccess.getExpression4Access().getGroup_1()); 
            // InternalHale.g:3238:2: ( rule__Expression4__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==29) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalHale.g:3238:3: rule__Expression4__Group_1__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__Expression4__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getExpression4Access().getGroup_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Expression4__Group_1__0"
    // InternalHale.g:3247:1: rule__Expression4__Group_1__0 : rule__Expression4__Group_1__0__Impl rule__Expression4__Group_1__1 ;
    public final void rule__Expression4__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3251:1: ( rule__Expression4__Group_1__0__Impl rule__Expression4__Group_1__1 )
            // InternalHale.g:3252:2: rule__Expression4__Group_1__0__Impl rule__Expression4__Group_1__1
            {
            pushFollow(FOLLOW_28);
            rule__Expression4__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression4__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression4__Group_1__0"


    // $ANTLR start "rule__Expression4__Group_1__0__Impl"
    // InternalHale.g:3259:1: rule__Expression4__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression4__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3263:1: ( ( () ) )
            // InternalHale.g:3264:1: ( () )
            {
            // InternalHale.g:3264:1: ( () )
            // InternalHale.g:3265:2: ()
            {
             before(grammarAccess.getExpression4Access().getExponentiationLeftAction_1_0()); 
            // InternalHale.g:3266:2: ()
            // InternalHale.g:3266:3: 
            {
            }

             after(grammarAccess.getExpression4Access().getExponentiationLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression4__Group_1__0__Impl"


    // $ANTLR start "rule__Expression4__Group_1__1"
    // InternalHale.g:3274:1: rule__Expression4__Group_1__1 : rule__Expression4__Group_1__1__Impl rule__Expression4__Group_1__2 ;
    public final void rule__Expression4__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3278:1: ( rule__Expression4__Group_1__1__Impl rule__Expression4__Group_1__2 )
            // InternalHale.g:3279:2: rule__Expression4__Group_1__1__Impl rule__Expression4__Group_1__2
            {
            pushFollow(FOLLOW_9);
            rule__Expression4__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression4__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression4__Group_1__1"


    // $ANTLR start "rule__Expression4__Group_1__1__Impl"
    // InternalHale.g:3286:1: rule__Expression4__Group_1__1__Impl : ( '**' ) ;
    public final void rule__Expression4__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3290:1: ( ( '**' ) )
            // InternalHale.g:3291:1: ( '**' )
            {
            // InternalHale.g:3291:1: ( '**' )
            // InternalHale.g:3292:2: '**'
            {
             before(grammarAccess.getExpression4Access().getAsteriskAsteriskKeyword_1_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getExpression4Access().getAsteriskAsteriskKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression4__Group_1__1__Impl"


    // $ANTLR start "rule__Expression4__Group_1__2"
    // InternalHale.g:3301:1: rule__Expression4__Group_1__2 : rule__Expression4__Group_1__2__Impl ;
    public final void rule__Expression4__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3305:1: ( rule__Expression4__Group_1__2__Impl )
            // InternalHale.g:3306:2: rule__Expression4__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression4__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression4__Group_1__2"


    // $ANTLR start "rule__Expression4__Group_1__2__Impl"
    // InternalHale.g:3312:1: rule__Expression4__Group_1__2__Impl : ( ( rule__Expression4__RightAssignment_1_2 ) ) ;
    public final void rule__Expression4__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3316:1: ( ( ( rule__Expression4__RightAssignment_1_2 ) ) )
            // InternalHale.g:3317:1: ( ( rule__Expression4__RightAssignment_1_2 ) )
            {
            // InternalHale.g:3317:1: ( ( rule__Expression4__RightAssignment_1_2 ) )
            // InternalHale.g:3318:2: ( rule__Expression4__RightAssignment_1_2 )
            {
             before(grammarAccess.getExpression4Access().getRightAssignment_1_2()); 
            // InternalHale.g:3319:2: ( rule__Expression4__RightAssignment_1_2 )
            // InternalHale.g:3319:3: rule__Expression4__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Expression4__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getExpression4Access().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression4__Group_1__2__Impl"


    // $ANTLR start "rule__Expression3__Group__0"
    // InternalHale.g:3328:1: rule__Expression3__Group__0 : rule__Expression3__Group__0__Impl rule__Expression3__Group__1 ;
    public final void rule__Expression3__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3332:1: ( rule__Expression3__Group__0__Impl rule__Expression3__Group__1 )
            // InternalHale.g:3333:2: rule__Expression3__Group__0__Impl rule__Expression3__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalHale.g:3340:1: rule__Expression3__Group__0__Impl : ( ruleExpression2 ) ;
    public final void rule__Expression3__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3344:1: ( ( ruleExpression2 ) )
            // InternalHale.g:3345:1: ( ruleExpression2 )
            {
            // InternalHale.g:3345:1: ( ruleExpression2 )
            // InternalHale.g:3346:2: ruleExpression2
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
    // InternalHale.g:3355:1: rule__Expression3__Group__1 : rule__Expression3__Group__1__Impl ;
    public final void rule__Expression3__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3359:1: ( rule__Expression3__Group__1__Impl )
            // InternalHale.g:3360:2: rule__Expression3__Group__1__Impl
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
    // InternalHale.g:3366:1: rule__Expression3__Group__1__Impl : ( ( rule__Expression3__Group_1__0 )* ) ;
    public final void rule__Expression3__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3370:1: ( ( ( rule__Expression3__Group_1__0 )* ) )
            // InternalHale.g:3371:1: ( ( rule__Expression3__Group_1__0 )* )
            {
            // InternalHale.g:3371:1: ( ( rule__Expression3__Group_1__0 )* )
            // InternalHale.g:3372:2: ( rule__Expression3__Group_1__0 )*
            {
             before(grammarAccess.getExpression3Access().getGroup_1()); 
            // InternalHale.g:3373:2: ( rule__Expression3__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==30) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalHale.g:3373:3: rule__Expression3__Group_1__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__Expression3__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getExpression3Access().getGroup_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Expression3__Group_1__0"
    // InternalHale.g:3382:1: rule__Expression3__Group_1__0 : rule__Expression3__Group_1__0__Impl rule__Expression3__Group_1__1 ;
    public final void rule__Expression3__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3386:1: ( rule__Expression3__Group_1__0__Impl rule__Expression3__Group_1__1 )
            // InternalHale.g:3387:2: rule__Expression3__Group_1__0__Impl rule__Expression3__Group_1__1
            {
            pushFollow(FOLLOW_30);
            rule__Expression3__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression3__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression3__Group_1__0"


    // $ANTLR start "rule__Expression3__Group_1__0__Impl"
    // InternalHale.g:3394:1: rule__Expression3__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression3__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3398:1: ( ( () ) )
            // InternalHale.g:3399:1: ( () )
            {
            // InternalHale.g:3399:1: ( () )
            // InternalHale.g:3400:2: ()
            {
             before(grammarAccess.getExpression3Access().getConversionLeftAction_1_0()); 
            // InternalHale.g:3401:2: ()
            // InternalHale.g:3401:3: 
            {
            }

             after(grammarAccess.getExpression3Access().getConversionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression3__Group_1__0__Impl"


    // $ANTLR start "rule__Expression3__Group_1__1"
    // InternalHale.g:3409:1: rule__Expression3__Group_1__1 : rule__Expression3__Group_1__1__Impl rule__Expression3__Group_1__2 ;
    public final void rule__Expression3__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3413:1: ( rule__Expression3__Group_1__1__Impl rule__Expression3__Group_1__2 )
            // InternalHale.g:3414:2: rule__Expression3__Group_1__1__Impl rule__Expression3__Group_1__2
            {
            pushFollow(FOLLOW_32);
            rule__Expression3__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression3__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression3__Group_1__1"


    // $ANTLR start "rule__Expression3__Group_1__1__Impl"
    // InternalHale.g:3421:1: rule__Expression3__Group_1__1__Impl : ( 'as' ) ;
    public final void rule__Expression3__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3425:1: ( ( 'as' ) )
            // InternalHale.g:3426:1: ( 'as' )
            {
            // InternalHale.g:3426:1: ( 'as' )
            // InternalHale.g:3427:2: 'as'
            {
             before(grammarAccess.getExpression3Access().getAsKeyword_1_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getExpression3Access().getAsKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression3__Group_1__1__Impl"


    // $ANTLR start "rule__Expression3__Group_1__2"
    // InternalHale.g:3436:1: rule__Expression3__Group_1__2 : rule__Expression3__Group_1__2__Impl ;
    public final void rule__Expression3__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3440:1: ( rule__Expression3__Group_1__2__Impl )
            // InternalHale.g:3441:2: rule__Expression3__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression3__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression3__Group_1__2"


    // $ANTLR start "rule__Expression3__Group_1__2__Impl"
    // InternalHale.g:3447:1: rule__Expression3__Group_1__2__Impl : ( ( rule__Expression3__RightAssignment_1_2 ) ) ;
    public final void rule__Expression3__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3451:1: ( ( ( rule__Expression3__RightAssignment_1_2 ) ) )
            // InternalHale.g:3452:1: ( ( rule__Expression3__RightAssignment_1_2 ) )
            {
            // InternalHale.g:3452:1: ( ( rule__Expression3__RightAssignment_1_2 ) )
            // InternalHale.g:3453:2: ( rule__Expression3__RightAssignment_1_2 )
            {
             before(grammarAccess.getExpression3Access().getRightAssignment_1_2()); 
            // InternalHale.g:3454:2: ( rule__Expression3__RightAssignment_1_2 )
            // InternalHale.g:3454:3: rule__Expression3__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Expression3__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getExpression3Access().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression3__Group_1__2__Impl"


    // $ANTLR start "rule__Expression2__Group_0__0"
    // InternalHale.g:3463:1: rule__Expression2__Group_0__0 : rule__Expression2__Group_0__0__Impl rule__Expression2__Group_0__1 ;
    public final void rule__Expression2__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3467:1: ( rule__Expression2__Group_0__0__Impl rule__Expression2__Group_0__1 )
            // InternalHale.g:3468:2: rule__Expression2__Group_0__0__Impl rule__Expression2__Group_0__1
            {
            pushFollow(FOLLOW_33);
            rule__Expression2__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression2__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression2__Group_0__0"


    // $ANTLR start "rule__Expression2__Group_0__0__Impl"
    // InternalHale.g:3475:1: rule__Expression2__Group_0__0__Impl : ( () ) ;
    public final void rule__Expression2__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3479:1: ( ( () ) )
            // InternalHale.g:3480:1: ( () )
            {
            // InternalHale.g:3480:1: ( () )
            // InternalHale.g:3481:2: ()
            {
             before(grammarAccess.getExpression2Access().getUnaryNegationAction_0_0()); 
            // InternalHale.g:3482:2: ()
            // InternalHale.g:3482:3: 
            {
            }

             after(grammarAccess.getExpression2Access().getUnaryNegationAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression2__Group_0__0__Impl"


    // $ANTLR start "rule__Expression2__Group_0__1"
    // InternalHale.g:3490:1: rule__Expression2__Group_0__1 : rule__Expression2__Group_0__1__Impl rule__Expression2__Group_0__2 ;
    public final void rule__Expression2__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3494:1: ( rule__Expression2__Group_0__1__Impl rule__Expression2__Group_0__2 )
            // InternalHale.g:3495:2: rule__Expression2__Group_0__1__Impl rule__Expression2__Group_0__2
            {
            pushFollow(FOLLOW_9);
            rule__Expression2__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression2__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression2__Group_0__1"


    // $ANTLR start "rule__Expression2__Group_0__1__Impl"
    // InternalHale.g:3502:1: rule__Expression2__Group_0__1__Impl : ( '-' ) ;
    public final void rule__Expression2__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3506:1: ( ( '-' ) )
            // InternalHale.g:3507:1: ( '-' )
            {
            // InternalHale.g:3507:1: ( '-' )
            // InternalHale.g:3508:2: '-'
            {
             before(grammarAccess.getExpression2Access().getHyphenMinusKeyword_0_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getExpression2Access().getHyphenMinusKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression2__Group_0__1__Impl"


    // $ANTLR start "rule__Expression2__Group_0__2"
    // InternalHale.g:3517:1: rule__Expression2__Group_0__2 : rule__Expression2__Group_0__2__Impl ;
    public final void rule__Expression2__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3521:1: ( rule__Expression2__Group_0__2__Impl )
            // InternalHale.g:3522:2: rule__Expression2__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression2__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression2__Group_0__2"


    // $ANTLR start "rule__Expression2__Group_0__2__Impl"
    // InternalHale.g:3528:1: rule__Expression2__Group_0__2__Impl : ( ( rule__Expression2__InnerAssignment_0_2 ) ) ;
    public final void rule__Expression2__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3532:1: ( ( ( rule__Expression2__InnerAssignment_0_2 ) ) )
            // InternalHale.g:3533:1: ( ( rule__Expression2__InnerAssignment_0_2 ) )
            {
            // InternalHale.g:3533:1: ( ( rule__Expression2__InnerAssignment_0_2 ) )
            // InternalHale.g:3534:2: ( rule__Expression2__InnerAssignment_0_2 )
            {
             before(grammarAccess.getExpression2Access().getInnerAssignment_0_2()); 
            // InternalHale.g:3535:2: ( rule__Expression2__InnerAssignment_0_2 )
            // InternalHale.g:3535:3: rule__Expression2__InnerAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Expression2__InnerAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getExpression2Access().getInnerAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression2__Group_0__2__Impl"


    // $ANTLR start "rule__Expression2__Group_1__0"
    // InternalHale.g:3544:1: rule__Expression2__Group_1__0 : rule__Expression2__Group_1__0__Impl rule__Expression2__Group_1__1 ;
    public final void rule__Expression2__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3548:1: ( rule__Expression2__Group_1__0__Impl rule__Expression2__Group_1__1 )
            // InternalHale.g:3549:2: rule__Expression2__Group_1__0__Impl rule__Expression2__Group_1__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalHale.g:3556:1: rule__Expression2__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression2__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3560:1: ( ( () ) )
            // InternalHale.g:3561:1: ( () )
            {
            // InternalHale.g:3561:1: ( () )
            // InternalHale.g:3562:2: ()
            {
             before(grammarAccess.getExpression2Access().getLogicalNotAction_1_0()); 
            // InternalHale.g:3563:2: ()
            // InternalHale.g:3563:3: 
            {
            }

             after(grammarAccess.getExpression2Access().getLogicalNotAction_1_0()); 

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
    // InternalHale.g:3571:1: rule__Expression2__Group_1__1 : rule__Expression2__Group_1__1__Impl rule__Expression2__Group_1__2 ;
    public final void rule__Expression2__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3575:1: ( rule__Expression2__Group_1__1__Impl rule__Expression2__Group_1__2 )
            // InternalHale.g:3576:2: rule__Expression2__Group_1__1__Impl rule__Expression2__Group_1__2
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
    // InternalHale.g:3583:1: rule__Expression2__Group_1__1__Impl : ( 'not' ) ;
    public final void rule__Expression2__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3587:1: ( ( 'not' ) )
            // InternalHale.g:3588:1: ( 'not' )
            {
            // InternalHale.g:3588:1: ( 'not' )
            // InternalHale.g:3589:2: 'not'
            {
             before(grammarAccess.getExpression2Access().getNotKeyword_1_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getExpression2Access().getNotKeyword_1_1()); 

            }


            }

        }
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
    // InternalHale.g:3598:1: rule__Expression2__Group_1__2 : rule__Expression2__Group_1__2__Impl ;
    public final void rule__Expression2__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3602:1: ( rule__Expression2__Group_1__2__Impl )
            // InternalHale.g:3603:2: rule__Expression2__Group_1__2__Impl
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
    // InternalHale.g:3609:1: rule__Expression2__Group_1__2__Impl : ( ( rule__Expression2__InnerAssignment_1_2 ) ) ;
    public final void rule__Expression2__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3613:1: ( ( ( rule__Expression2__InnerAssignment_1_2 ) ) )
            // InternalHale.g:3614:1: ( ( rule__Expression2__InnerAssignment_1_2 ) )
            {
            // InternalHale.g:3614:1: ( ( rule__Expression2__InnerAssignment_1_2 ) )
            // InternalHale.g:3615:2: ( rule__Expression2__InnerAssignment_1_2 )
            {
             before(grammarAccess.getExpression2Access().getInnerAssignment_1_2()); 
            // InternalHale.g:3616:2: ( rule__Expression2__InnerAssignment_1_2 )
            // InternalHale.g:3616:3: rule__Expression2__InnerAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Expression2__InnerAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getExpression2Access().getInnerAssignment_1_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Expression1__Group__0"
    // InternalHale.g:3625:1: rule__Expression1__Group__0 : rule__Expression1__Group__0__Impl rule__Expression1__Group__1 ;
    public final void rule__Expression1__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3629:1: ( rule__Expression1__Group__0__Impl rule__Expression1__Group__1 )
            // InternalHale.g:3630:2: rule__Expression1__Group__0__Impl rule__Expression1__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__Expression1__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression1__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression1__Group__0"


    // $ANTLR start "rule__Expression1__Group__0__Impl"
    // InternalHale.g:3637:1: rule__Expression1__Group__0__Impl : ( ruleExpression0 ) ;
    public final void rule__Expression1__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3641:1: ( ( ruleExpression0 ) )
            // InternalHale.g:3642:1: ( ruleExpression0 )
            {
            // InternalHale.g:3642:1: ( ruleExpression0 )
            // InternalHale.g:3643:2: ruleExpression0
            {
             before(grammarAccess.getExpression1Access().getExpression0ParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression0();

            state._fsp--;

             after(grammarAccess.getExpression1Access().getExpression0ParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression1__Group__0__Impl"


    // $ANTLR start "rule__Expression1__Group__1"
    // InternalHale.g:3652:1: rule__Expression1__Group__1 : rule__Expression1__Group__1__Impl ;
    public final void rule__Expression1__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3656:1: ( rule__Expression1__Group__1__Impl )
            // InternalHale.g:3657:2: rule__Expression1__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression1__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression1__Group__1"


    // $ANTLR start "rule__Expression1__Group__1__Impl"
    // InternalHale.g:3663:1: rule__Expression1__Group__1__Impl : ( ( rule__Expression1__Group_1__0 )* ) ;
    public final void rule__Expression1__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3667:1: ( ( ( rule__Expression1__Group_1__0 )* ) )
            // InternalHale.g:3668:1: ( ( rule__Expression1__Group_1__0 )* )
            {
            // InternalHale.g:3668:1: ( ( rule__Expression1__Group_1__0 )* )
            // InternalHale.g:3669:2: ( rule__Expression1__Group_1__0 )*
            {
             before(grammarAccess.getExpression1Access().getGroup_1()); 
            // InternalHale.g:3670:2: ( rule__Expression1__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==32) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalHale.g:3670:3: rule__Expression1__Group_1__0
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__Expression1__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getExpression1Access().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression1__Group__1__Impl"


    // $ANTLR start "rule__Expression1__Group_1__0"
    // InternalHale.g:3679:1: rule__Expression1__Group_1__0 : rule__Expression1__Group_1__0__Impl rule__Expression1__Group_1__1 ;
    public final void rule__Expression1__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3683:1: ( rule__Expression1__Group_1__0__Impl rule__Expression1__Group_1__1 )
            // InternalHale.g:3684:2: rule__Expression1__Group_1__0__Impl rule__Expression1__Group_1__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalHale.g:3691:1: rule__Expression1__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression1__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3695:1: ( ( () ) )
            // InternalHale.g:3696:1: ( () )
            {
            // InternalHale.g:3696:1: ( () )
            // InternalHale.g:3697:2: ()
            {
             before(grammarAccess.getExpression1Access().getApplicationExpressionAction_1_0()); 
            // InternalHale.g:3698:2: ()
            // InternalHale.g:3698:3: 
            {
            }

             after(grammarAccess.getExpression1Access().getApplicationExpressionAction_1_0()); 

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
    // InternalHale.g:3706:1: rule__Expression1__Group_1__1 : rule__Expression1__Group_1__1__Impl rule__Expression1__Group_1__2 ;
    public final void rule__Expression1__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3710:1: ( rule__Expression1__Group_1__1__Impl rule__Expression1__Group_1__2 )
            // InternalHale.g:3711:2: rule__Expression1__Group_1__1__Impl rule__Expression1__Group_1__2
            {
            pushFollow(FOLLOW_37);
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
    // InternalHale.g:3718:1: rule__Expression1__Group_1__1__Impl : ( '(' ) ;
    public final void rule__Expression1__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3722:1: ( ( '(' ) )
            // InternalHale.g:3723:1: ( '(' )
            {
            // InternalHale.g:3723:1: ( '(' )
            // InternalHale.g:3724:2: '('
            {
             before(grammarAccess.getExpression1Access().getLeftParenthesisKeyword_1_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getExpression1Access().getLeftParenthesisKeyword_1_1()); 

            }


            }

        }
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
    // InternalHale.g:3733:1: rule__Expression1__Group_1__2 : rule__Expression1__Group_1__2__Impl rule__Expression1__Group_1__3 ;
    public final void rule__Expression1__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3737:1: ( rule__Expression1__Group_1__2__Impl rule__Expression1__Group_1__3 )
            // InternalHale.g:3738:2: rule__Expression1__Group_1__2__Impl rule__Expression1__Group_1__3
            {
            pushFollow(FOLLOW_37);
            rule__Expression1__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression1__Group_1__3();

            state._fsp--;


            }

        }
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
    // InternalHale.g:3745:1: rule__Expression1__Group_1__2__Impl : ( ( rule__Expression1__Group_1_2__0 )? ) ;
    public final void rule__Expression1__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3749:1: ( ( ( rule__Expression1__Group_1_2__0 )? ) )
            // InternalHale.g:3750:1: ( ( rule__Expression1__Group_1_2__0 )? )
            {
            // InternalHale.g:3750:1: ( ( rule__Expression1__Group_1_2__0 )? )
            // InternalHale.g:3751:2: ( rule__Expression1__Group_1_2__0 )?
            {
             before(grammarAccess.getExpression1Access().getGroup_1_2()); 
            // InternalHale.g:3752:2: ( rule__Expression1__Group_1_2__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=RULE_BOOLEAN && LA25_0<=RULE_STRING)||LA25_0==RULE_ID||LA25_0==25||(LA25_0>=31 && LA25_0<=32)||LA25_0==35||LA25_0==41) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalHale.g:3752:3: rule__Expression1__Group_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression1__Group_1_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpression1Access().getGroup_1_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Expression1__Group_1__3"
    // InternalHale.g:3760:1: rule__Expression1__Group_1__3 : rule__Expression1__Group_1__3__Impl ;
    public final void rule__Expression1__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3764:1: ( rule__Expression1__Group_1__3__Impl )
            // InternalHale.g:3765:2: rule__Expression1__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression1__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression1__Group_1__3"


    // $ANTLR start "rule__Expression1__Group_1__3__Impl"
    // InternalHale.g:3771:1: rule__Expression1__Group_1__3__Impl : ( ')' ) ;
    public final void rule__Expression1__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3775:1: ( ( ')' ) )
            // InternalHale.g:3776:1: ( ')' )
            {
            // InternalHale.g:3776:1: ( ')' )
            // InternalHale.g:3777:2: ')'
            {
             before(grammarAccess.getExpression1Access().getRightParenthesisKeyword_1_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getExpression1Access().getRightParenthesisKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression1__Group_1__3__Impl"


    // $ANTLR start "rule__Expression1__Group_1_2__0"
    // InternalHale.g:3787:1: rule__Expression1__Group_1_2__0 : rule__Expression1__Group_1_2__0__Impl rule__Expression1__Group_1_2__1 ;
    public final void rule__Expression1__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3791:1: ( rule__Expression1__Group_1_2__0__Impl rule__Expression1__Group_1_2__1 )
            // InternalHale.g:3792:2: rule__Expression1__Group_1_2__0__Impl rule__Expression1__Group_1_2__1
            {
            pushFollow(FOLLOW_38);
            rule__Expression1__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression1__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression1__Group_1_2__0"


    // $ANTLR start "rule__Expression1__Group_1_2__0__Impl"
    // InternalHale.g:3799:1: rule__Expression1__Group_1_2__0__Impl : ( ( rule__Expression1__ArgumentsAssignment_1_2_0 ) ) ;
    public final void rule__Expression1__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3803:1: ( ( ( rule__Expression1__ArgumentsAssignment_1_2_0 ) ) )
            // InternalHale.g:3804:1: ( ( rule__Expression1__ArgumentsAssignment_1_2_0 ) )
            {
            // InternalHale.g:3804:1: ( ( rule__Expression1__ArgumentsAssignment_1_2_0 ) )
            // InternalHale.g:3805:2: ( rule__Expression1__ArgumentsAssignment_1_2_0 )
            {
             before(grammarAccess.getExpression1Access().getArgumentsAssignment_1_2_0()); 
            // InternalHale.g:3806:2: ( rule__Expression1__ArgumentsAssignment_1_2_0 )
            // InternalHale.g:3806:3: rule__Expression1__ArgumentsAssignment_1_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Expression1__ArgumentsAssignment_1_2_0();

            state._fsp--;


            }

             after(grammarAccess.getExpression1Access().getArgumentsAssignment_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression1__Group_1_2__0__Impl"


    // $ANTLR start "rule__Expression1__Group_1_2__1"
    // InternalHale.g:3814:1: rule__Expression1__Group_1_2__1 : rule__Expression1__Group_1_2__1__Impl rule__Expression1__Group_1_2__2 ;
    public final void rule__Expression1__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3818:1: ( rule__Expression1__Group_1_2__1__Impl rule__Expression1__Group_1_2__2 )
            // InternalHale.g:3819:2: rule__Expression1__Group_1_2__1__Impl rule__Expression1__Group_1_2__2
            {
            pushFollow(FOLLOW_38);
            rule__Expression1__Group_1_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression1__Group_1_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression1__Group_1_2__1"


    // $ANTLR start "rule__Expression1__Group_1_2__1__Impl"
    // InternalHale.g:3826:1: rule__Expression1__Group_1_2__1__Impl : ( ( rule__Expression1__Group_1_2_1__0 )* ) ;
    public final void rule__Expression1__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3830:1: ( ( ( rule__Expression1__Group_1_2_1__0 )* ) )
            // InternalHale.g:3831:1: ( ( rule__Expression1__Group_1_2_1__0 )* )
            {
            // InternalHale.g:3831:1: ( ( rule__Expression1__Group_1_2_1__0 )* )
            // InternalHale.g:3832:2: ( rule__Expression1__Group_1_2_1__0 )*
            {
             before(grammarAccess.getExpression1Access().getGroup_1_2_1()); 
            // InternalHale.g:3833:2: ( rule__Expression1__Group_1_2_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==34) ) {
                    int LA26_1 = input.LA(2);

                    if ( ((LA26_1>=RULE_BOOLEAN && LA26_1<=RULE_STRING)||LA26_1==RULE_ID||LA26_1==25||(LA26_1>=31 && LA26_1<=32)||LA26_1==35||LA26_1==41) ) {
                        alt26=1;
                    }


                }


                switch (alt26) {
            	case 1 :
            	    // InternalHale.g:3833:3: rule__Expression1__Group_1_2_1__0
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__Expression1__Group_1_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getExpression1Access().getGroup_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression1__Group_1_2__1__Impl"


    // $ANTLR start "rule__Expression1__Group_1_2__2"
    // InternalHale.g:3841:1: rule__Expression1__Group_1_2__2 : rule__Expression1__Group_1_2__2__Impl ;
    public final void rule__Expression1__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3845:1: ( rule__Expression1__Group_1_2__2__Impl )
            // InternalHale.g:3846:2: rule__Expression1__Group_1_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression1__Group_1_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression1__Group_1_2__2"


    // $ANTLR start "rule__Expression1__Group_1_2__2__Impl"
    // InternalHale.g:3852:1: rule__Expression1__Group_1_2__2__Impl : ( ( ',' )? ) ;
    public final void rule__Expression1__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3856:1: ( ( ( ',' )? ) )
            // InternalHale.g:3857:1: ( ( ',' )? )
            {
            // InternalHale.g:3857:1: ( ( ',' )? )
            // InternalHale.g:3858:2: ( ',' )?
            {
             before(grammarAccess.getExpression1Access().getCommaKeyword_1_2_2()); 
            // InternalHale.g:3859:2: ( ',' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==34) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalHale.g:3859:3: ','
                    {
                    match(input,34,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getExpression1Access().getCommaKeyword_1_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression1__Group_1_2__2__Impl"


    // $ANTLR start "rule__Expression1__Group_1_2_1__0"
    // InternalHale.g:3868:1: rule__Expression1__Group_1_2_1__0 : rule__Expression1__Group_1_2_1__0__Impl rule__Expression1__Group_1_2_1__1 ;
    public final void rule__Expression1__Group_1_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3872:1: ( rule__Expression1__Group_1_2_1__0__Impl rule__Expression1__Group_1_2_1__1 )
            // InternalHale.g:3873:2: rule__Expression1__Group_1_2_1__0__Impl rule__Expression1__Group_1_2_1__1
            {
            pushFollow(FOLLOW_9);
            rule__Expression1__Group_1_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression1__Group_1_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression1__Group_1_2_1__0"


    // $ANTLR start "rule__Expression1__Group_1_2_1__0__Impl"
    // InternalHale.g:3880:1: rule__Expression1__Group_1_2_1__0__Impl : ( ',' ) ;
    public final void rule__Expression1__Group_1_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3884:1: ( ( ',' ) )
            // InternalHale.g:3885:1: ( ',' )
            {
            // InternalHale.g:3885:1: ( ',' )
            // InternalHale.g:3886:2: ','
            {
             before(grammarAccess.getExpression1Access().getCommaKeyword_1_2_1_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getExpression1Access().getCommaKeyword_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression1__Group_1_2_1__0__Impl"


    // $ANTLR start "rule__Expression1__Group_1_2_1__1"
    // InternalHale.g:3895:1: rule__Expression1__Group_1_2_1__1 : rule__Expression1__Group_1_2_1__1__Impl ;
    public final void rule__Expression1__Group_1_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3899:1: ( rule__Expression1__Group_1_2_1__1__Impl )
            // InternalHale.g:3900:2: rule__Expression1__Group_1_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression1__Group_1_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression1__Group_1_2_1__1"


    // $ANTLR start "rule__Expression1__Group_1_2_1__1__Impl"
    // InternalHale.g:3906:1: rule__Expression1__Group_1_2_1__1__Impl : ( ( rule__Expression1__ArgumentsAssignment_1_2_1_1 ) ) ;
    public final void rule__Expression1__Group_1_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3910:1: ( ( ( rule__Expression1__ArgumentsAssignment_1_2_1_1 ) ) )
            // InternalHale.g:3911:1: ( ( rule__Expression1__ArgumentsAssignment_1_2_1_1 ) )
            {
            // InternalHale.g:3911:1: ( ( rule__Expression1__ArgumentsAssignment_1_2_1_1 ) )
            // InternalHale.g:3912:2: ( rule__Expression1__ArgumentsAssignment_1_2_1_1 )
            {
             before(grammarAccess.getExpression1Access().getArgumentsAssignment_1_2_1_1()); 
            // InternalHale.g:3913:2: ( rule__Expression1__ArgumentsAssignment_1_2_1_1 )
            // InternalHale.g:3913:3: rule__Expression1__ArgumentsAssignment_1_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Expression1__ArgumentsAssignment_1_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExpression1Access().getArgumentsAssignment_1_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression1__Group_1_2_1__1__Impl"


    // $ANTLR start "rule__Expression0__Group_3__0"
    // InternalHale.g:3922:1: rule__Expression0__Group_3__0 : rule__Expression0__Group_3__0__Impl rule__Expression0__Group_3__1 ;
    public final void rule__Expression0__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3926:1: ( rule__Expression0__Group_3__0__Impl rule__Expression0__Group_3__1 )
            // InternalHale.g:3927:2: rule__Expression0__Group_3__0__Impl rule__Expression0__Group_3__1
            {
            pushFollow(FOLLOW_9);
            rule__Expression0__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression0__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression0__Group_3__0"


    // $ANTLR start "rule__Expression0__Group_3__0__Impl"
    // InternalHale.g:3934:1: rule__Expression0__Group_3__0__Impl : ( '(' ) ;
    public final void rule__Expression0__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3938:1: ( ( '(' ) )
            // InternalHale.g:3939:1: ( '(' )
            {
            // InternalHale.g:3939:1: ( '(' )
            // InternalHale.g:3940:2: '('
            {
             before(grammarAccess.getExpression0Access().getLeftParenthesisKeyword_3_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getExpression0Access().getLeftParenthesisKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression0__Group_3__0__Impl"


    // $ANTLR start "rule__Expression0__Group_3__1"
    // InternalHale.g:3949:1: rule__Expression0__Group_3__1 : rule__Expression0__Group_3__1__Impl rule__Expression0__Group_3__2 ;
    public final void rule__Expression0__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3953:1: ( rule__Expression0__Group_3__1__Impl rule__Expression0__Group_3__2 )
            // InternalHale.g:3954:2: rule__Expression0__Group_3__1__Impl rule__Expression0__Group_3__2
            {
            pushFollow(FOLLOW_40);
            rule__Expression0__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression0__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression0__Group_3__1"


    // $ANTLR start "rule__Expression0__Group_3__1__Impl"
    // InternalHale.g:3961:1: rule__Expression0__Group_3__1__Impl : ( ruleExpression ) ;
    public final void rule__Expression0__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3965:1: ( ( ruleExpression ) )
            // InternalHale.g:3966:1: ( ruleExpression )
            {
            // InternalHale.g:3966:1: ( ruleExpression )
            // InternalHale.g:3967:2: ruleExpression
            {
             before(grammarAccess.getExpression0Access().getExpressionParserRuleCall_3_1()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpression0Access().getExpressionParserRuleCall_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression0__Group_3__1__Impl"


    // $ANTLR start "rule__Expression0__Group_3__2"
    // InternalHale.g:3976:1: rule__Expression0__Group_3__2 : rule__Expression0__Group_3__2__Impl ;
    public final void rule__Expression0__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3980:1: ( rule__Expression0__Group_3__2__Impl )
            // InternalHale.g:3981:2: rule__Expression0__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression0__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression0__Group_3__2"


    // $ANTLR start "rule__Expression0__Group_3__2__Impl"
    // InternalHale.g:3987:1: rule__Expression0__Group_3__2__Impl : ( ')' ) ;
    public final void rule__Expression0__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3991:1: ( ( ')' ) )
            // InternalHale.g:3992:1: ( ')' )
            {
            // InternalHale.g:3992:1: ( ')' )
            // InternalHale.g:3993:2: ')'
            {
             before(grammarAccess.getExpression0Access().getRightParenthesisKeyword_3_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getExpression0Access().getRightParenthesisKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression0__Group_3__2__Impl"


    // $ANTLR start "rule__VoidLiteral__Group__0"
    // InternalHale.g:4003:1: rule__VoidLiteral__Group__0 : rule__VoidLiteral__Group__0__Impl rule__VoidLiteral__Group__1 ;
    public final void rule__VoidLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4007:1: ( rule__VoidLiteral__Group__0__Impl rule__VoidLiteral__Group__1 )
            // InternalHale.g:4008:2: rule__VoidLiteral__Group__0__Impl rule__VoidLiteral__Group__1
            {
            pushFollow(FOLLOW_41);
            rule__VoidLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VoidLiteral__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VoidLiteral__Group__0"


    // $ANTLR start "rule__VoidLiteral__Group__0__Impl"
    // InternalHale.g:4015:1: rule__VoidLiteral__Group__0__Impl : ( () ) ;
    public final void rule__VoidLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4019:1: ( ( () ) )
            // InternalHale.g:4020:1: ( () )
            {
            // InternalHale.g:4020:1: ( () )
            // InternalHale.g:4021:2: ()
            {
             before(grammarAccess.getVoidLiteralAccess().getVoidLiteralAction_0()); 
            // InternalHale.g:4022:2: ()
            // InternalHale.g:4022:3: 
            {
            }

             after(grammarAccess.getVoidLiteralAccess().getVoidLiteralAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VoidLiteral__Group__0__Impl"


    // $ANTLR start "rule__VoidLiteral__Group__1"
    // InternalHale.g:4030:1: rule__VoidLiteral__Group__1 : rule__VoidLiteral__Group__1__Impl ;
    public final void rule__VoidLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4034:1: ( rule__VoidLiteral__Group__1__Impl )
            // InternalHale.g:4035:2: rule__VoidLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VoidLiteral__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VoidLiteral__Group__1"


    // $ANTLR start "rule__VoidLiteral__Group__1__Impl"
    // InternalHale.g:4041:1: rule__VoidLiteral__Group__1__Impl : ( 'void' ) ;
    public final void rule__VoidLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4045:1: ( ( 'void' ) )
            // InternalHale.g:4046:1: ( 'void' )
            {
            // InternalHale.g:4046:1: ( 'void' )
            // InternalHale.g:4047:2: 'void'
            {
             before(grammarAccess.getVoidLiteralAccess().getVoidKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getVoidLiteralAccess().getVoidKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VoidLiteral__Group__1__Impl"


    // $ANTLR start "rule__TypeAnnotation__Group__0"
    // InternalHale.g:4057:1: rule__TypeAnnotation__Group__0 : rule__TypeAnnotation__Group__0__Impl rule__TypeAnnotation__Group__1 ;
    public final void rule__TypeAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4061:1: ( rule__TypeAnnotation__Group__0__Impl rule__TypeAnnotation__Group__1 )
            // InternalHale.g:4062:2: rule__TypeAnnotation__Group__0__Impl rule__TypeAnnotation__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__TypeAnnotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeAnnotation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeAnnotation__Group__0"


    // $ANTLR start "rule__TypeAnnotation__Group__0__Impl"
    // InternalHale.g:4069:1: rule__TypeAnnotation__Group__0__Impl : ( ':' ) ;
    public final void rule__TypeAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4073:1: ( ( ':' ) )
            // InternalHale.g:4074:1: ( ':' )
            {
            // InternalHale.g:4074:1: ( ':' )
            // InternalHale.g:4075:2: ':'
            {
             before(grammarAccess.getTypeAnnotationAccess().getColonKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getTypeAnnotationAccess().getColonKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeAnnotation__Group__0__Impl"


    // $ANTLR start "rule__TypeAnnotation__Group__1"
    // InternalHale.g:4084:1: rule__TypeAnnotation__Group__1 : rule__TypeAnnotation__Group__1__Impl ;
    public final void rule__TypeAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4088:1: ( rule__TypeAnnotation__Group__1__Impl )
            // InternalHale.g:4089:2: rule__TypeAnnotation__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeAnnotation__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeAnnotation__Group__1"


    // $ANTLR start "rule__TypeAnnotation__Group__1__Impl"
    // InternalHale.g:4095:1: rule__TypeAnnotation__Group__1__Impl : ( ruleType ) ;
    public final void rule__TypeAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4099:1: ( ( ruleType ) )
            // InternalHale.g:4100:1: ( ruleType )
            {
            // InternalHale.g:4100:1: ( ruleType )
            // InternalHale.g:4101:2: ruleType
            {
             before(grammarAccess.getTypeAnnotationAccess().getTypeParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeAnnotationAccess().getTypeParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeAnnotation__Group__1__Impl"


    // $ANTLR start "rule__FunctionType__Group_0__0"
    // InternalHale.g:4111:1: rule__FunctionType__Group_0__0 : rule__FunctionType__Group_0__0__Impl rule__FunctionType__Group_0__1 ;
    public final void rule__FunctionType__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4115:1: ( rule__FunctionType__Group_0__0__Impl rule__FunctionType__Group_0__1 )
            // InternalHale.g:4116:2: rule__FunctionType__Group_0__0__Impl rule__FunctionType__Group_0__1
            {
            pushFollow(FOLLOW_42);
            rule__FunctionType__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionType__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionType__Group_0__0"


    // $ANTLR start "rule__FunctionType__Group_0__0__Impl"
    // InternalHale.g:4123:1: rule__FunctionType__Group_0__0__Impl : ( () ) ;
    public final void rule__FunctionType__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4127:1: ( ( () ) )
            // InternalHale.g:4128:1: ( () )
            {
            // InternalHale.g:4128:1: ( () )
            // InternalHale.g:4129:2: ()
            {
             before(grammarAccess.getFunctionTypeAccess().getFunctionTypeAction_0_0()); 
            // InternalHale.g:4130:2: ()
            // InternalHale.g:4130:3: 
            {
            }

             after(grammarAccess.getFunctionTypeAccess().getFunctionTypeAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionType__Group_0__0__Impl"


    // $ANTLR start "rule__FunctionType__Group_0__1"
    // InternalHale.g:4138:1: rule__FunctionType__Group_0__1 : rule__FunctionType__Group_0__1__Impl rule__FunctionType__Group_0__2 ;
    public final void rule__FunctionType__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4142:1: ( rule__FunctionType__Group_0__1__Impl rule__FunctionType__Group_0__2 )
            // InternalHale.g:4143:2: rule__FunctionType__Group_0__1__Impl rule__FunctionType__Group_0__2
            {
            pushFollow(FOLLOW_35);
            rule__FunctionType__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionType__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionType__Group_0__1"


    // $ANTLR start "rule__FunctionType__Group_0__1__Impl"
    // InternalHale.g:4150:1: rule__FunctionType__Group_0__1__Impl : ( 'Function' ) ;
    public final void rule__FunctionType__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4154:1: ( ( 'Function' ) )
            // InternalHale.g:4155:1: ( 'Function' )
            {
            // InternalHale.g:4155:1: ( 'Function' )
            // InternalHale.g:4156:2: 'Function'
            {
             before(grammarAccess.getFunctionTypeAccess().getFunctionKeyword_0_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getFunctionTypeAccess().getFunctionKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionType__Group_0__1__Impl"


    // $ANTLR start "rule__FunctionType__Group_0__2"
    // InternalHale.g:4165:1: rule__FunctionType__Group_0__2 : rule__FunctionType__Group_0__2__Impl rule__FunctionType__Group_0__3 ;
    public final void rule__FunctionType__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4169:1: ( rule__FunctionType__Group_0__2__Impl rule__FunctionType__Group_0__3 )
            // InternalHale.g:4170:2: rule__FunctionType__Group_0__2__Impl rule__FunctionType__Group_0__3
            {
            pushFollow(FOLLOW_43);
            rule__FunctionType__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionType__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionType__Group_0__2"


    // $ANTLR start "rule__FunctionType__Group_0__2__Impl"
    // InternalHale.g:4177:1: rule__FunctionType__Group_0__2__Impl : ( '(' ) ;
    public final void rule__FunctionType__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4181:1: ( ( '(' ) )
            // InternalHale.g:4182:1: ( '(' )
            {
            // InternalHale.g:4182:1: ( '(' )
            // InternalHale.g:4183:2: '('
            {
             before(grammarAccess.getFunctionTypeAccess().getLeftParenthesisKeyword_0_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getFunctionTypeAccess().getLeftParenthesisKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionType__Group_0__2__Impl"


    // $ANTLR start "rule__FunctionType__Group_0__3"
    // InternalHale.g:4192:1: rule__FunctionType__Group_0__3 : rule__FunctionType__Group_0__3__Impl rule__FunctionType__Group_0__4 ;
    public final void rule__FunctionType__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4196:1: ( rule__FunctionType__Group_0__3__Impl rule__FunctionType__Group_0__4 )
            // InternalHale.g:4197:2: rule__FunctionType__Group_0__3__Impl rule__FunctionType__Group_0__4
            {
            pushFollow(FOLLOW_43);
            rule__FunctionType__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionType__Group_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionType__Group_0__3"


    // $ANTLR start "rule__FunctionType__Group_0__3__Impl"
    // InternalHale.g:4204:1: rule__FunctionType__Group_0__3__Impl : ( ( rule__FunctionType__Group_0_3__0 )? ) ;
    public final void rule__FunctionType__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4208:1: ( ( ( rule__FunctionType__Group_0_3__0 )? ) )
            // InternalHale.g:4209:1: ( ( rule__FunctionType__Group_0_3__0 )? )
            {
            // InternalHale.g:4209:1: ( ( rule__FunctionType__Group_0_3__0 )? )
            // InternalHale.g:4210:2: ( rule__FunctionType__Group_0_3__0 )?
            {
             before(grammarAccess.getFunctionTypeAccess().getGroup_0_3()); 
            // InternalHale.g:4211:2: ( rule__FunctionType__Group_0_3__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_PRIMITIVE_TYPE||LA28_0==32||LA28_0==37) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalHale.g:4211:3: rule__FunctionType__Group_0_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FunctionType__Group_0_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionTypeAccess().getGroup_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionType__Group_0__3__Impl"


    // $ANTLR start "rule__FunctionType__Group_0__4"
    // InternalHale.g:4219:1: rule__FunctionType__Group_0__4 : rule__FunctionType__Group_0__4__Impl rule__FunctionType__Group_0__5 ;
    public final void rule__FunctionType__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4223:1: ( rule__FunctionType__Group_0__4__Impl rule__FunctionType__Group_0__5 )
            // InternalHale.g:4224:2: rule__FunctionType__Group_0__4__Impl rule__FunctionType__Group_0__5
            {
            pushFollow(FOLLOW_44);
            rule__FunctionType__Group_0__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionType__Group_0__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionType__Group_0__4"


    // $ANTLR start "rule__FunctionType__Group_0__4__Impl"
    // InternalHale.g:4231:1: rule__FunctionType__Group_0__4__Impl : ( ')' ) ;
    public final void rule__FunctionType__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4235:1: ( ( ')' ) )
            // InternalHale.g:4236:1: ( ')' )
            {
            // InternalHale.g:4236:1: ( ')' )
            // InternalHale.g:4237:2: ')'
            {
             before(grammarAccess.getFunctionTypeAccess().getRightParenthesisKeyword_0_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getFunctionTypeAccess().getRightParenthesisKeyword_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionType__Group_0__4__Impl"


    // $ANTLR start "rule__FunctionType__Group_0__5"
    // InternalHale.g:4246:1: rule__FunctionType__Group_0__5 : rule__FunctionType__Group_0__5__Impl ;
    public final void rule__FunctionType__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4250:1: ( rule__FunctionType__Group_0__5__Impl )
            // InternalHale.g:4251:2: rule__FunctionType__Group_0__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionType__Group_0__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionType__Group_0__5"


    // $ANTLR start "rule__FunctionType__Group_0__5__Impl"
    // InternalHale.g:4257:1: rule__FunctionType__Group_0__5__Impl : ( ( rule__FunctionType__ReturnTypeAssignment_0_5 )? ) ;
    public final void rule__FunctionType__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4261:1: ( ( ( rule__FunctionType__ReturnTypeAssignment_0_5 )? ) )
            // InternalHale.g:4262:1: ( ( rule__FunctionType__ReturnTypeAssignment_0_5 )? )
            {
            // InternalHale.g:4262:1: ( ( rule__FunctionType__ReturnTypeAssignment_0_5 )? )
            // InternalHale.g:4263:2: ( rule__FunctionType__ReturnTypeAssignment_0_5 )?
            {
             before(grammarAccess.getFunctionTypeAccess().getReturnTypeAssignment_0_5()); 
            // InternalHale.g:4264:2: ( rule__FunctionType__ReturnTypeAssignment_0_5 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==36) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalHale.g:4264:3: rule__FunctionType__ReturnTypeAssignment_0_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__FunctionType__ReturnTypeAssignment_0_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionTypeAccess().getReturnTypeAssignment_0_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionType__Group_0__5__Impl"


    // $ANTLR start "rule__FunctionType__Group_0_3__0"
    // InternalHale.g:4273:1: rule__FunctionType__Group_0_3__0 : rule__FunctionType__Group_0_3__0__Impl rule__FunctionType__Group_0_3__1 ;
    public final void rule__FunctionType__Group_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4277:1: ( rule__FunctionType__Group_0_3__0__Impl rule__FunctionType__Group_0_3__1 )
            // InternalHale.g:4278:2: rule__FunctionType__Group_0_3__0__Impl rule__FunctionType__Group_0_3__1
            {
            pushFollow(FOLLOW_38);
            rule__FunctionType__Group_0_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionType__Group_0_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionType__Group_0_3__0"


    // $ANTLR start "rule__FunctionType__Group_0_3__0__Impl"
    // InternalHale.g:4285:1: rule__FunctionType__Group_0_3__0__Impl : ( ( rule__FunctionType__ParamTypesAssignment_0_3_0 ) ) ;
    public final void rule__FunctionType__Group_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4289:1: ( ( ( rule__FunctionType__ParamTypesAssignment_0_3_0 ) ) )
            // InternalHale.g:4290:1: ( ( rule__FunctionType__ParamTypesAssignment_0_3_0 ) )
            {
            // InternalHale.g:4290:1: ( ( rule__FunctionType__ParamTypesAssignment_0_3_0 ) )
            // InternalHale.g:4291:2: ( rule__FunctionType__ParamTypesAssignment_0_3_0 )
            {
             before(grammarAccess.getFunctionTypeAccess().getParamTypesAssignment_0_3_0()); 
            // InternalHale.g:4292:2: ( rule__FunctionType__ParamTypesAssignment_0_3_0 )
            // InternalHale.g:4292:3: rule__FunctionType__ParamTypesAssignment_0_3_0
            {
            pushFollow(FOLLOW_2);
            rule__FunctionType__ParamTypesAssignment_0_3_0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionTypeAccess().getParamTypesAssignment_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionType__Group_0_3__0__Impl"


    // $ANTLR start "rule__FunctionType__Group_0_3__1"
    // InternalHale.g:4300:1: rule__FunctionType__Group_0_3__1 : rule__FunctionType__Group_0_3__1__Impl rule__FunctionType__Group_0_3__2 ;
    public final void rule__FunctionType__Group_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4304:1: ( rule__FunctionType__Group_0_3__1__Impl rule__FunctionType__Group_0_3__2 )
            // InternalHale.g:4305:2: rule__FunctionType__Group_0_3__1__Impl rule__FunctionType__Group_0_3__2
            {
            pushFollow(FOLLOW_38);
            rule__FunctionType__Group_0_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionType__Group_0_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionType__Group_0_3__1"


    // $ANTLR start "rule__FunctionType__Group_0_3__1__Impl"
    // InternalHale.g:4312:1: rule__FunctionType__Group_0_3__1__Impl : ( ( rule__FunctionType__Group_0_3_1__0 )* ) ;
    public final void rule__FunctionType__Group_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4316:1: ( ( ( rule__FunctionType__Group_0_3_1__0 )* ) )
            // InternalHale.g:4317:1: ( ( rule__FunctionType__Group_0_3_1__0 )* )
            {
            // InternalHale.g:4317:1: ( ( rule__FunctionType__Group_0_3_1__0 )* )
            // InternalHale.g:4318:2: ( rule__FunctionType__Group_0_3_1__0 )*
            {
             before(grammarAccess.getFunctionTypeAccess().getGroup_0_3_1()); 
            // InternalHale.g:4319:2: ( rule__FunctionType__Group_0_3_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==34) ) {
                    int LA30_1 = input.LA(2);

                    if ( (LA30_1==RULE_PRIMITIVE_TYPE||LA30_1==32||LA30_1==37) ) {
                        alt30=1;
                    }


                }


                switch (alt30) {
            	case 1 :
            	    // InternalHale.g:4319:3: rule__FunctionType__Group_0_3_1__0
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__FunctionType__Group_0_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getFunctionTypeAccess().getGroup_0_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionType__Group_0_3__1__Impl"


    // $ANTLR start "rule__FunctionType__Group_0_3__2"
    // InternalHale.g:4327:1: rule__FunctionType__Group_0_3__2 : rule__FunctionType__Group_0_3__2__Impl ;
    public final void rule__FunctionType__Group_0_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4331:1: ( rule__FunctionType__Group_0_3__2__Impl )
            // InternalHale.g:4332:2: rule__FunctionType__Group_0_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionType__Group_0_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionType__Group_0_3__2"


    // $ANTLR start "rule__FunctionType__Group_0_3__2__Impl"
    // InternalHale.g:4338:1: rule__FunctionType__Group_0_3__2__Impl : ( ( ',' )? ) ;
    public final void rule__FunctionType__Group_0_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4342:1: ( ( ( ',' )? ) )
            // InternalHale.g:4343:1: ( ( ',' )? )
            {
            // InternalHale.g:4343:1: ( ( ',' )? )
            // InternalHale.g:4344:2: ( ',' )?
            {
             before(grammarAccess.getFunctionTypeAccess().getCommaKeyword_0_3_2()); 
            // InternalHale.g:4345:2: ( ',' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==34) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalHale.g:4345:3: ','
                    {
                    match(input,34,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getFunctionTypeAccess().getCommaKeyword_0_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionType__Group_0_3__2__Impl"


    // $ANTLR start "rule__FunctionType__Group_0_3_1__0"
    // InternalHale.g:4354:1: rule__FunctionType__Group_0_3_1__0 : rule__FunctionType__Group_0_3_1__0__Impl rule__FunctionType__Group_0_3_1__1 ;
    public final void rule__FunctionType__Group_0_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4358:1: ( rule__FunctionType__Group_0_3_1__0__Impl rule__FunctionType__Group_0_3_1__1 )
            // InternalHale.g:4359:2: rule__FunctionType__Group_0_3_1__0__Impl rule__FunctionType__Group_0_3_1__1
            {
            pushFollow(FOLLOW_32);
            rule__FunctionType__Group_0_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionType__Group_0_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionType__Group_0_3_1__0"


    // $ANTLR start "rule__FunctionType__Group_0_3_1__0__Impl"
    // InternalHale.g:4366:1: rule__FunctionType__Group_0_3_1__0__Impl : ( ',' ) ;
    public final void rule__FunctionType__Group_0_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4370:1: ( ( ',' ) )
            // InternalHale.g:4371:1: ( ',' )
            {
            // InternalHale.g:4371:1: ( ',' )
            // InternalHale.g:4372:2: ','
            {
             before(grammarAccess.getFunctionTypeAccess().getCommaKeyword_0_3_1_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getFunctionTypeAccess().getCommaKeyword_0_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionType__Group_0_3_1__0__Impl"


    // $ANTLR start "rule__FunctionType__Group_0_3_1__1"
    // InternalHale.g:4381:1: rule__FunctionType__Group_0_3_1__1 : rule__FunctionType__Group_0_3_1__1__Impl ;
    public final void rule__FunctionType__Group_0_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4385:1: ( rule__FunctionType__Group_0_3_1__1__Impl )
            // InternalHale.g:4386:2: rule__FunctionType__Group_0_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionType__Group_0_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionType__Group_0_3_1__1"


    // $ANTLR start "rule__FunctionType__Group_0_3_1__1__Impl"
    // InternalHale.g:4392:1: rule__FunctionType__Group_0_3_1__1__Impl : ( ( rule__FunctionType__ParamTypesAssignment_0_3_1_1 ) ) ;
    public final void rule__FunctionType__Group_0_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4396:1: ( ( ( rule__FunctionType__ParamTypesAssignment_0_3_1_1 ) ) )
            // InternalHale.g:4397:1: ( ( rule__FunctionType__ParamTypesAssignment_0_3_1_1 ) )
            {
            // InternalHale.g:4397:1: ( ( rule__FunctionType__ParamTypesAssignment_0_3_1_1 ) )
            // InternalHale.g:4398:2: ( rule__FunctionType__ParamTypesAssignment_0_3_1_1 )
            {
             before(grammarAccess.getFunctionTypeAccess().getParamTypesAssignment_0_3_1_1()); 
            // InternalHale.g:4399:2: ( rule__FunctionType__ParamTypesAssignment_0_3_1_1 )
            // InternalHale.g:4399:3: rule__FunctionType__ParamTypesAssignment_0_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__FunctionType__ParamTypesAssignment_0_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionTypeAccess().getParamTypesAssignment_0_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionType__Group_0_3_1__1__Impl"


    // $ANTLR start "rule__EitherType__Group__0"
    // InternalHale.g:4408:1: rule__EitherType__Group__0 : rule__EitherType__Group__0__Impl rule__EitherType__Group__1 ;
    public final void rule__EitherType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4412:1: ( rule__EitherType__Group__0__Impl rule__EitherType__Group__1 )
            // InternalHale.g:4413:2: rule__EitherType__Group__0__Impl rule__EitherType__Group__1
            {
            pushFollow(FOLLOW_45);
            rule__EitherType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EitherType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EitherType__Group__0"


    // $ANTLR start "rule__EitherType__Group__0__Impl"
    // InternalHale.g:4420:1: rule__EitherType__Group__0__Impl : ( rulePrimaryType ) ;
    public final void rule__EitherType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4424:1: ( ( rulePrimaryType ) )
            // InternalHale.g:4425:1: ( rulePrimaryType )
            {
            // InternalHale.g:4425:1: ( rulePrimaryType )
            // InternalHale.g:4426:2: rulePrimaryType
            {
             before(grammarAccess.getEitherTypeAccess().getPrimaryTypeParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryType();

            state._fsp--;

             after(grammarAccess.getEitherTypeAccess().getPrimaryTypeParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EitherType__Group__0__Impl"


    // $ANTLR start "rule__EitherType__Group__1"
    // InternalHale.g:4435:1: rule__EitherType__Group__1 : rule__EitherType__Group__1__Impl ;
    public final void rule__EitherType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4439:1: ( rule__EitherType__Group__1__Impl )
            // InternalHale.g:4440:2: rule__EitherType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EitherType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EitherType__Group__1"


    // $ANTLR start "rule__EitherType__Group__1__Impl"
    // InternalHale.g:4446:1: rule__EitherType__Group__1__Impl : ( ( rule__EitherType__Group_1__0 )* ) ;
    public final void rule__EitherType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4450:1: ( ( ( rule__EitherType__Group_1__0 )* ) )
            // InternalHale.g:4451:1: ( ( rule__EitherType__Group_1__0 )* )
            {
            // InternalHale.g:4451:1: ( ( rule__EitherType__Group_1__0 )* )
            // InternalHale.g:4452:2: ( rule__EitherType__Group_1__0 )*
            {
             before(grammarAccess.getEitherTypeAccess().getGroup_1()); 
            // InternalHale.g:4453:2: ( rule__EitherType__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==38) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalHale.g:4453:3: rule__EitherType__Group_1__0
            	    {
            	    pushFollow(FOLLOW_46);
            	    rule__EitherType__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getEitherTypeAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EitherType__Group__1__Impl"


    // $ANTLR start "rule__EitherType__Group_1__0"
    // InternalHale.g:4462:1: rule__EitherType__Group_1__0 : rule__EitherType__Group_1__0__Impl rule__EitherType__Group_1__1 ;
    public final void rule__EitherType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4466:1: ( rule__EitherType__Group_1__0__Impl rule__EitherType__Group_1__1 )
            // InternalHale.g:4467:2: rule__EitherType__Group_1__0__Impl rule__EitherType__Group_1__1
            {
            pushFollow(FOLLOW_45);
            rule__EitherType__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EitherType__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EitherType__Group_1__0"


    // $ANTLR start "rule__EitherType__Group_1__0__Impl"
    // InternalHale.g:4474:1: rule__EitherType__Group_1__0__Impl : ( () ) ;
    public final void rule__EitherType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4478:1: ( ( () ) )
            // InternalHale.g:4479:1: ( () )
            {
            // InternalHale.g:4479:1: ( () )
            // InternalHale.g:4480:2: ()
            {
             before(grammarAccess.getEitherTypeAccess().getEitherTypeLeftAction_1_0()); 
            // InternalHale.g:4481:2: ()
            // InternalHale.g:4481:3: 
            {
            }

             after(grammarAccess.getEitherTypeAccess().getEitherTypeLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EitherType__Group_1__0__Impl"


    // $ANTLR start "rule__EitherType__Group_1__1"
    // InternalHale.g:4489:1: rule__EitherType__Group_1__1 : rule__EitherType__Group_1__1__Impl rule__EitherType__Group_1__2 ;
    public final void rule__EitherType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4493:1: ( rule__EitherType__Group_1__1__Impl rule__EitherType__Group_1__2 )
            // InternalHale.g:4494:2: rule__EitherType__Group_1__1__Impl rule__EitherType__Group_1__2
            {
            pushFollow(FOLLOW_32);
            rule__EitherType__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EitherType__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EitherType__Group_1__1"


    // $ANTLR start "rule__EitherType__Group_1__1__Impl"
    // InternalHale.g:4501:1: rule__EitherType__Group_1__1__Impl : ( '?' ) ;
    public final void rule__EitherType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4505:1: ( ( '?' ) )
            // InternalHale.g:4506:1: ( '?' )
            {
            // InternalHale.g:4506:1: ( '?' )
            // InternalHale.g:4507:2: '?'
            {
             before(grammarAccess.getEitherTypeAccess().getQuestionMarkKeyword_1_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getEitherTypeAccess().getQuestionMarkKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EitherType__Group_1__1__Impl"


    // $ANTLR start "rule__EitherType__Group_1__2"
    // InternalHale.g:4516:1: rule__EitherType__Group_1__2 : rule__EitherType__Group_1__2__Impl ;
    public final void rule__EitherType__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4520:1: ( rule__EitherType__Group_1__2__Impl )
            // InternalHale.g:4521:2: rule__EitherType__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EitherType__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EitherType__Group_1__2"


    // $ANTLR start "rule__EitherType__Group_1__2__Impl"
    // InternalHale.g:4527:1: rule__EitherType__Group_1__2__Impl : ( ( rule__EitherType__RightAssignment_1_2 ) ) ;
    public final void rule__EitherType__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4531:1: ( ( ( rule__EitherType__RightAssignment_1_2 ) ) )
            // InternalHale.g:4532:1: ( ( rule__EitherType__RightAssignment_1_2 ) )
            {
            // InternalHale.g:4532:1: ( ( rule__EitherType__RightAssignment_1_2 ) )
            // InternalHale.g:4533:2: ( rule__EitherType__RightAssignment_1_2 )
            {
             before(grammarAccess.getEitherTypeAccess().getRightAssignment_1_2()); 
            // InternalHale.g:4534:2: ( rule__EitherType__RightAssignment_1_2 )
            // InternalHale.g:4534:3: rule__EitherType__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__EitherType__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getEitherTypeAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EitherType__Group_1__2__Impl"


    // $ANTLR start "rule__PrimaryType__Group_1__0"
    // InternalHale.g:4543:1: rule__PrimaryType__Group_1__0 : rule__PrimaryType__Group_1__0__Impl rule__PrimaryType__Group_1__1 ;
    public final void rule__PrimaryType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4547:1: ( rule__PrimaryType__Group_1__0__Impl rule__PrimaryType__Group_1__1 )
            // InternalHale.g:4548:2: rule__PrimaryType__Group_1__0__Impl rule__PrimaryType__Group_1__1
            {
            pushFollow(FOLLOW_32);
            rule__PrimaryType__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryType__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryType__Group_1__0"


    // $ANTLR start "rule__PrimaryType__Group_1__0__Impl"
    // InternalHale.g:4555:1: rule__PrimaryType__Group_1__0__Impl : ( '(' ) ;
    public final void rule__PrimaryType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4559:1: ( ( '(' ) )
            // InternalHale.g:4560:1: ( '(' )
            {
            // InternalHale.g:4560:1: ( '(' )
            // InternalHale.g:4561:2: '('
            {
             before(grammarAccess.getPrimaryTypeAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getPrimaryTypeAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryType__Group_1__0__Impl"


    // $ANTLR start "rule__PrimaryType__Group_1__1"
    // InternalHale.g:4570:1: rule__PrimaryType__Group_1__1 : rule__PrimaryType__Group_1__1__Impl rule__PrimaryType__Group_1__2 ;
    public final void rule__PrimaryType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4574:1: ( rule__PrimaryType__Group_1__1__Impl rule__PrimaryType__Group_1__2 )
            // InternalHale.g:4575:2: rule__PrimaryType__Group_1__1__Impl rule__PrimaryType__Group_1__2
            {
            pushFollow(FOLLOW_40);
            rule__PrimaryType__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryType__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryType__Group_1__1"


    // $ANTLR start "rule__PrimaryType__Group_1__1__Impl"
    // InternalHale.g:4582:1: rule__PrimaryType__Group_1__1__Impl : ( ruleType ) ;
    public final void rule__PrimaryType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4586:1: ( ( ruleType ) )
            // InternalHale.g:4587:1: ( ruleType )
            {
            // InternalHale.g:4587:1: ( ruleType )
            // InternalHale.g:4588:2: ruleType
            {
             before(grammarAccess.getPrimaryTypeAccess().getTypeParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getPrimaryTypeAccess().getTypeParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryType__Group_1__1__Impl"


    // $ANTLR start "rule__PrimaryType__Group_1__2"
    // InternalHale.g:4597:1: rule__PrimaryType__Group_1__2 : rule__PrimaryType__Group_1__2__Impl ;
    public final void rule__PrimaryType__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4601:1: ( rule__PrimaryType__Group_1__2__Impl )
            // InternalHale.g:4602:2: rule__PrimaryType__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryType__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryType__Group_1__2"


    // $ANTLR start "rule__PrimaryType__Group_1__2__Impl"
    // InternalHale.g:4608:1: rule__PrimaryType__Group_1__2__Impl : ( ')' ) ;
    public final void rule__PrimaryType__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4612:1: ( ( ')' ) )
            // InternalHale.g:4613:1: ( ')' )
            {
            // InternalHale.g:4613:1: ( ')' )
            // InternalHale.g:4614:2: ')'
            {
             before(grammarAccess.getPrimaryTypeAccess().getRightParenthesisKeyword_1_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getPrimaryTypeAccess().getRightParenthesisKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryType__Group_1__2__Impl"


    // $ANTLR start "rule__PrimitiveType__Group__0"
    // InternalHale.g:4624:1: rule__PrimitiveType__Group__0 : rule__PrimitiveType__Group__0__Impl rule__PrimitiveType__Group__1 ;
    public final void rule__PrimitiveType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4628:1: ( rule__PrimitiveType__Group__0__Impl rule__PrimitiveType__Group__1 )
            // InternalHale.g:4629:2: rule__PrimitiveType__Group__0__Impl rule__PrimitiveType__Group__1
            {
            pushFollow(FOLLOW_47);
            rule__PrimitiveType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Group__0"


    // $ANTLR start "rule__PrimitiveType__Group__0__Impl"
    // InternalHale.g:4636:1: rule__PrimitiveType__Group__0__Impl : ( () ) ;
    public final void rule__PrimitiveType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4640:1: ( ( () ) )
            // InternalHale.g:4641:1: ( () )
            {
            // InternalHale.g:4641:1: ( () )
            // InternalHale.g:4642:2: ()
            {
             before(grammarAccess.getPrimitiveTypeAccess().getPrimitiveTypeAction_0()); 
            // InternalHale.g:4643:2: ()
            // InternalHale.g:4643:3: 
            {
            }

             after(grammarAccess.getPrimitiveTypeAccess().getPrimitiveTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Group__0__Impl"


    // $ANTLR start "rule__PrimitiveType__Group__1"
    // InternalHale.g:4651:1: rule__PrimitiveType__Group__1 : rule__PrimitiveType__Group__1__Impl ;
    public final void rule__PrimitiveType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4655:1: ( rule__PrimitiveType__Group__1__Impl )
            // InternalHale.g:4656:2: rule__PrimitiveType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Group__1"


    // $ANTLR start "rule__PrimitiveType__Group__1__Impl"
    // InternalHale.g:4662:1: rule__PrimitiveType__Group__1__Impl : ( ( rule__PrimitiveType__TypeAssignment_1 ) ) ;
    public final void rule__PrimitiveType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4666:1: ( ( ( rule__PrimitiveType__TypeAssignment_1 ) ) )
            // InternalHale.g:4667:1: ( ( rule__PrimitiveType__TypeAssignment_1 ) )
            {
            // InternalHale.g:4667:1: ( ( rule__PrimitiveType__TypeAssignment_1 ) )
            // InternalHale.g:4668:2: ( rule__PrimitiveType__TypeAssignment_1 )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getTypeAssignment_1()); 
            // InternalHale.g:4669:2: ( rule__PrimitiveType__TypeAssignment_1 )
            // InternalHale.g:4669:3: rule__PrimitiveType__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveType__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveTypeAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Group__1__Impl"


    // $ANTLR start "rule__LetBinding__Group__0"
    // InternalHale.g:4678:1: rule__LetBinding__Group__0 : rule__LetBinding__Group__0__Impl rule__LetBinding__Group__1 ;
    public final void rule__LetBinding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4682:1: ( rule__LetBinding__Group__0__Impl rule__LetBinding__Group__1 )
            // InternalHale.g:4683:2: rule__LetBinding__Group__0__Impl rule__LetBinding__Group__1
            {
            pushFollow(FOLLOW_48);
            rule__LetBinding__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LetBinding__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetBinding__Group__0"


    // $ANTLR start "rule__LetBinding__Group__0__Impl"
    // InternalHale.g:4690:1: rule__LetBinding__Group__0__Impl : ( () ) ;
    public final void rule__LetBinding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4694:1: ( ( () ) )
            // InternalHale.g:4695:1: ( () )
            {
            // InternalHale.g:4695:1: ( () )
            // InternalHale.g:4696:2: ()
            {
             before(grammarAccess.getLetBindingAccess().getLetBindingAction_0()); 
            // InternalHale.g:4697:2: ()
            // InternalHale.g:4697:3: 
            {
            }

             after(grammarAccess.getLetBindingAccess().getLetBindingAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetBinding__Group__0__Impl"


    // $ANTLR start "rule__LetBinding__Group__1"
    // InternalHale.g:4705:1: rule__LetBinding__Group__1 : rule__LetBinding__Group__1__Impl rule__LetBinding__Group__2 ;
    public final void rule__LetBinding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4709:1: ( rule__LetBinding__Group__1__Impl rule__LetBinding__Group__2 )
            // InternalHale.g:4710:2: rule__LetBinding__Group__1__Impl rule__LetBinding__Group__2
            {
            pushFollow(FOLLOW_49);
            rule__LetBinding__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LetBinding__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetBinding__Group__1"


    // $ANTLR start "rule__LetBinding__Group__1__Impl"
    // InternalHale.g:4717:1: rule__LetBinding__Group__1__Impl : ( 'let' ) ;
    public final void rule__LetBinding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4721:1: ( ( 'let' ) )
            // InternalHale.g:4722:1: ( 'let' )
            {
            // InternalHale.g:4722:1: ( 'let' )
            // InternalHale.g:4723:2: 'let'
            {
             before(grammarAccess.getLetBindingAccess().getLetKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getLetBindingAccess().getLetKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetBinding__Group__1__Impl"


    // $ANTLR start "rule__LetBinding__Group__2"
    // InternalHale.g:4732:1: rule__LetBinding__Group__2 : rule__LetBinding__Group__2__Impl rule__LetBinding__Group__3 ;
    public final void rule__LetBinding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4736:1: ( rule__LetBinding__Group__2__Impl rule__LetBinding__Group__3 )
            // InternalHale.g:4737:2: rule__LetBinding__Group__2__Impl rule__LetBinding__Group__3
            {
            pushFollow(FOLLOW_49);
            rule__LetBinding__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LetBinding__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetBinding__Group__2"


    // $ANTLR start "rule__LetBinding__Group__2__Impl"
    // InternalHale.g:4744:1: rule__LetBinding__Group__2__Impl : ( ( rule__LetBinding__MutableAssignment_2 )? ) ;
    public final void rule__LetBinding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4748:1: ( ( ( rule__LetBinding__MutableAssignment_2 )? ) )
            // InternalHale.g:4749:1: ( ( rule__LetBinding__MutableAssignment_2 )? )
            {
            // InternalHale.g:4749:1: ( ( rule__LetBinding__MutableAssignment_2 )? )
            // InternalHale.g:4750:2: ( rule__LetBinding__MutableAssignment_2 )?
            {
             before(grammarAccess.getLetBindingAccess().getMutableAssignment_2()); 
            // InternalHale.g:4751:2: ( rule__LetBinding__MutableAssignment_2 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==51) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalHale.g:4751:3: rule__LetBinding__MutableAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__LetBinding__MutableAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLetBindingAccess().getMutableAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetBinding__Group__2__Impl"


    // $ANTLR start "rule__LetBinding__Group__3"
    // InternalHale.g:4759:1: rule__LetBinding__Group__3 : rule__LetBinding__Group__3__Impl rule__LetBinding__Group__4 ;
    public final void rule__LetBinding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4763:1: ( rule__LetBinding__Group__3__Impl rule__LetBinding__Group__4 )
            // InternalHale.g:4764:2: rule__LetBinding__Group__3__Impl rule__LetBinding__Group__4
            {
            pushFollow(FOLLOW_50);
            rule__LetBinding__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LetBinding__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetBinding__Group__3"


    // $ANTLR start "rule__LetBinding__Group__3__Impl"
    // InternalHale.g:4771:1: rule__LetBinding__Group__3__Impl : ( ( rule__LetBinding__NameAssignment_3 ) ) ;
    public final void rule__LetBinding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4775:1: ( ( ( rule__LetBinding__NameAssignment_3 ) ) )
            // InternalHale.g:4776:1: ( ( rule__LetBinding__NameAssignment_3 ) )
            {
            // InternalHale.g:4776:1: ( ( rule__LetBinding__NameAssignment_3 ) )
            // InternalHale.g:4777:2: ( rule__LetBinding__NameAssignment_3 )
            {
             before(grammarAccess.getLetBindingAccess().getNameAssignment_3()); 
            // InternalHale.g:4778:2: ( rule__LetBinding__NameAssignment_3 )
            // InternalHale.g:4778:3: rule__LetBinding__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__LetBinding__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLetBindingAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetBinding__Group__3__Impl"


    // $ANTLR start "rule__LetBinding__Group__4"
    // InternalHale.g:4786:1: rule__LetBinding__Group__4 : rule__LetBinding__Group__4__Impl rule__LetBinding__Group__5 ;
    public final void rule__LetBinding__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4790:1: ( rule__LetBinding__Group__4__Impl rule__LetBinding__Group__5 )
            // InternalHale.g:4791:2: rule__LetBinding__Group__4__Impl rule__LetBinding__Group__5
            {
            pushFollow(FOLLOW_50);
            rule__LetBinding__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LetBinding__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetBinding__Group__4"


    // $ANTLR start "rule__LetBinding__Group__4__Impl"
    // InternalHale.g:4798:1: rule__LetBinding__Group__4__Impl : ( ( rule__LetBinding__TypeAssignment_4 )? ) ;
    public final void rule__LetBinding__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4802:1: ( ( ( rule__LetBinding__TypeAssignment_4 )? ) )
            // InternalHale.g:4803:1: ( ( rule__LetBinding__TypeAssignment_4 )? )
            {
            // InternalHale.g:4803:1: ( ( rule__LetBinding__TypeAssignment_4 )? )
            // InternalHale.g:4804:2: ( rule__LetBinding__TypeAssignment_4 )?
            {
             before(grammarAccess.getLetBindingAccess().getTypeAssignment_4()); 
            // InternalHale.g:4805:2: ( rule__LetBinding__TypeAssignment_4 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==36) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalHale.g:4805:3: rule__LetBinding__TypeAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__LetBinding__TypeAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLetBindingAccess().getTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetBinding__Group__4__Impl"


    // $ANTLR start "rule__LetBinding__Group__5"
    // InternalHale.g:4813:1: rule__LetBinding__Group__5 : rule__LetBinding__Group__5__Impl rule__LetBinding__Group__6 ;
    public final void rule__LetBinding__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4817:1: ( rule__LetBinding__Group__5__Impl rule__LetBinding__Group__6 )
            // InternalHale.g:4818:2: rule__LetBinding__Group__5__Impl rule__LetBinding__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__LetBinding__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LetBinding__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetBinding__Group__5"


    // $ANTLR start "rule__LetBinding__Group__5__Impl"
    // InternalHale.g:4825:1: rule__LetBinding__Group__5__Impl : ( '=' ) ;
    public final void rule__LetBinding__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4829:1: ( ( '=' ) )
            // InternalHale.g:4830:1: ( '=' )
            {
            // InternalHale.g:4830:1: ( '=' )
            // InternalHale.g:4831:2: '='
            {
             before(grammarAccess.getLetBindingAccess().getEqualsSignKeyword_5()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getLetBindingAccess().getEqualsSignKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetBinding__Group__5__Impl"


    // $ANTLR start "rule__LetBinding__Group__6"
    // InternalHale.g:4840:1: rule__LetBinding__Group__6 : rule__LetBinding__Group__6__Impl ;
    public final void rule__LetBinding__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4844:1: ( rule__LetBinding__Group__6__Impl )
            // InternalHale.g:4845:2: rule__LetBinding__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LetBinding__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetBinding__Group__6"


    // $ANTLR start "rule__LetBinding__Group__6__Impl"
    // InternalHale.g:4851:1: rule__LetBinding__Group__6__Impl : ( ( rule__LetBinding__ExpressionAssignment_6 ) ) ;
    public final void rule__LetBinding__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4855:1: ( ( ( rule__LetBinding__ExpressionAssignment_6 ) ) )
            // InternalHale.g:4856:1: ( ( rule__LetBinding__ExpressionAssignment_6 ) )
            {
            // InternalHale.g:4856:1: ( ( rule__LetBinding__ExpressionAssignment_6 ) )
            // InternalHale.g:4857:2: ( rule__LetBinding__ExpressionAssignment_6 )
            {
             before(grammarAccess.getLetBindingAccess().getExpressionAssignment_6()); 
            // InternalHale.g:4858:2: ( rule__LetBinding__ExpressionAssignment_6 )
            // InternalHale.g:4858:3: rule__LetBinding__ExpressionAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__LetBinding__ExpressionAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getLetBindingAccess().getExpressionAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetBinding__Group__6__Impl"


    // $ANTLR start "rule__Assignment__Group__0"
    // InternalHale.g:4867:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4871:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // InternalHale.g:4872:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_51);
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
    // InternalHale.g:4879:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__BindingAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4883:1: ( ( ( rule__Assignment__BindingAssignment_0 ) ) )
            // InternalHale.g:4884:1: ( ( rule__Assignment__BindingAssignment_0 ) )
            {
            // InternalHale.g:4884:1: ( ( rule__Assignment__BindingAssignment_0 ) )
            // InternalHale.g:4885:2: ( rule__Assignment__BindingAssignment_0 )
            {
             before(grammarAccess.getAssignmentAccess().getBindingAssignment_0()); 
            // InternalHale.g:4886:2: ( rule__Assignment__BindingAssignment_0 )
            // InternalHale.g:4886:3: rule__Assignment__BindingAssignment_0
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
    // InternalHale.g:4894:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4898:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // InternalHale.g:4899:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
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
    // InternalHale.g:4906:1: rule__Assignment__Group__1__Impl : ( '=' ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4910:1: ( ( '=' ) )
            // InternalHale.g:4911:1: ( '=' )
            {
            // InternalHale.g:4911:1: ( '=' )
            // InternalHale.g:4912:2: '='
            {
             before(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalHale.g:4921:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4925:1: ( rule__Assignment__Group__2__Impl )
            // InternalHale.g:4926:2: rule__Assignment__Group__2__Impl
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
    // InternalHale.g:4932:1: rule__Assignment__Group__2__Impl : ( ( rule__Assignment__ExpressionAssignment_2 ) ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4936:1: ( ( ( rule__Assignment__ExpressionAssignment_2 ) ) )
            // InternalHale.g:4937:1: ( ( rule__Assignment__ExpressionAssignment_2 ) )
            {
            // InternalHale.g:4937:1: ( ( rule__Assignment__ExpressionAssignment_2 ) )
            // InternalHale.g:4938:2: ( rule__Assignment__ExpressionAssignment_2 )
            {
             before(grammarAccess.getAssignmentAccess().getExpressionAssignment_2()); 
            // InternalHale.g:4939:2: ( rule__Assignment__ExpressionAssignment_2 )
            // InternalHale.g:4939:3: rule__Assignment__ExpressionAssignment_2
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


    // $ANTLR start "rule__Input__Group__0"
    // InternalHale.g:4948:1: rule__Input__Group__0 : rule__Input__Group__0__Impl rule__Input__Group__1 ;
    public final void rule__Input__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4952:1: ( rule__Input__Group__0__Impl rule__Input__Group__1 )
            // InternalHale.g:4953:2: rule__Input__Group__0__Impl rule__Input__Group__1
            {
            pushFollow(FOLLOW_52);
            rule__Input__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__0"


    // $ANTLR start "rule__Input__Group__0__Impl"
    // InternalHale.g:4960:1: rule__Input__Group__0__Impl : ( () ) ;
    public final void rule__Input__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4964:1: ( ( () ) )
            // InternalHale.g:4965:1: ( () )
            {
            // InternalHale.g:4965:1: ( () )
            // InternalHale.g:4966:2: ()
            {
             before(grammarAccess.getInputAccess().getInputAction_0()); 
            // InternalHale.g:4967:2: ()
            // InternalHale.g:4967:3: 
            {
            }

             after(grammarAccess.getInputAccess().getInputAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__0__Impl"


    // $ANTLR start "rule__Input__Group__1"
    // InternalHale.g:4975:1: rule__Input__Group__1 : rule__Input__Group__1__Impl ;
    public final void rule__Input__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4979:1: ( rule__Input__Group__1__Impl )
            // InternalHale.g:4980:2: rule__Input__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Input__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__1"


    // $ANTLR start "rule__Input__Group__1__Impl"
    // InternalHale.g:4986:1: rule__Input__Group__1__Impl : ( 'input' ) ;
    public final void rule__Input__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4990:1: ( ( 'input' ) )
            // InternalHale.g:4991:1: ( 'input' )
            {
            // InternalHale.g:4991:1: ( 'input' )
            // InternalHale.g:4992:2: 'input'
            {
             before(grammarAccess.getInputAccess().getInputKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getInputKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__1__Impl"


    // $ANTLR start "rule__Print__Group__0"
    // InternalHale.g:5002:1: rule__Print__Group__0 : rule__Print__Group__0__Impl rule__Print__Group__1 ;
    public final void rule__Print__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5006:1: ( rule__Print__Group__0__Impl rule__Print__Group__1 )
            // InternalHale.g:5007:2: rule__Print__Group__0__Impl rule__Print__Group__1
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
    // InternalHale.g:5014:1: rule__Print__Group__0__Impl : ( 'print' ) ;
    public final void rule__Print__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5018:1: ( ( 'print' ) )
            // InternalHale.g:5019:1: ( 'print' )
            {
            // InternalHale.g:5019:1: ( 'print' )
            // InternalHale.g:5020:2: 'print'
            {
             before(grammarAccess.getPrintAccess().getPrintKeyword_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalHale.g:5029:1: rule__Print__Group__1 : rule__Print__Group__1__Impl ;
    public final void rule__Print__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5033:1: ( rule__Print__Group__1__Impl )
            // InternalHale.g:5034:2: rule__Print__Group__1__Impl
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
    // InternalHale.g:5040:1: rule__Print__Group__1__Impl : ( ( rule__Print__ExpressionAssignment_1 ) ) ;
    public final void rule__Print__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5044:1: ( ( ( rule__Print__ExpressionAssignment_1 ) ) )
            // InternalHale.g:5045:1: ( ( rule__Print__ExpressionAssignment_1 ) )
            {
            // InternalHale.g:5045:1: ( ( rule__Print__ExpressionAssignment_1 ) )
            // InternalHale.g:5046:2: ( rule__Print__ExpressionAssignment_1 )
            {
             before(grammarAccess.getPrintAccess().getExpressionAssignment_1()); 
            // InternalHale.g:5047:2: ( rule__Print__ExpressionAssignment_1 )
            // InternalHale.g:5047:3: rule__Print__ExpressionAssignment_1
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
    // InternalHale.g:5056:1: rule__If__Group__0 : rule__If__Group__0__Impl rule__If__Group__1 ;
    public final void rule__If__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5060:1: ( rule__If__Group__0__Impl rule__If__Group__1 )
            // InternalHale.g:5061:2: rule__If__Group__0__Impl rule__If__Group__1
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
    // InternalHale.g:5068:1: rule__If__Group__0__Impl : ( 'if' ) ;
    public final void rule__If__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5072:1: ( ( 'if' ) )
            // InternalHale.g:5073:1: ( 'if' )
            {
            // InternalHale.g:5073:1: ( 'if' )
            // InternalHale.g:5074:2: 'if'
            {
             before(grammarAccess.getIfAccess().getIfKeyword_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalHale.g:5083:1: rule__If__Group__1 : rule__If__Group__1__Impl ;
    public final void rule__If__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5087:1: ( rule__If__Group__1__Impl )
            // InternalHale.g:5088:2: rule__If__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__If__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalHale.g:5094:1: rule__If__Group__1__Impl : ( ( rule__If__Alternatives_1 ) ) ;
    public final void rule__If__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5098:1: ( ( ( rule__If__Alternatives_1 ) ) )
            // InternalHale.g:5099:1: ( ( rule__If__Alternatives_1 ) )
            {
            // InternalHale.g:5099:1: ( ( rule__If__Alternatives_1 ) )
            // InternalHale.g:5100:2: ( rule__If__Alternatives_1 )
            {
             before(grammarAccess.getIfAccess().getAlternatives_1()); 
            // InternalHale.g:5101:2: ( rule__If__Alternatives_1 )
            // InternalHale.g:5101:3: rule__If__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__If__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getIfAccess().getAlternatives_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__IfLet__Group__0"
    // InternalHale.g:5110:1: rule__IfLet__Group__0 : rule__IfLet__Group__0__Impl rule__IfLet__Group__1 ;
    public final void rule__IfLet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5114:1: ( rule__IfLet__Group__0__Impl rule__IfLet__Group__1 )
            // InternalHale.g:5115:2: rule__IfLet__Group__0__Impl rule__IfLet__Group__1
            {
            pushFollow(FOLLOW_48);
            rule__IfLet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfLet__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfLet__Group__0"


    // $ANTLR start "rule__IfLet__Group__0__Impl"
    // InternalHale.g:5122:1: rule__IfLet__Group__0__Impl : ( () ) ;
    public final void rule__IfLet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5126:1: ( ( () ) )
            // InternalHale.g:5127:1: ( () )
            {
            // InternalHale.g:5127:1: ( () )
            // InternalHale.g:5128:2: ()
            {
             before(grammarAccess.getIfLetAccess().getIfLetAction_0()); 
            // InternalHale.g:5129:2: ()
            // InternalHale.g:5129:3: 
            {
            }

             after(grammarAccess.getIfLetAccess().getIfLetAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfLet__Group__0__Impl"


    // $ANTLR start "rule__IfLet__Group__1"
    // InternalHale.g:5137:1: rule__IfLet__Group__1 : rule__IfLet__Group__1__Impl rule__IfLet__Group__2 ;
    public final void rule__IfLet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5141:1: ( rule__IfLet__Group__1__Impl rule__IfLet__Group__2 )
            // InternalHale.g:5142:2: rule__IfLet__Group__1__Impl rule__IfLet__Group__2
            {
            pushFollow(FOLLOW_53);
            rule__IfLet__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfLet__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfLet__Group__1"


    // $ANTLR start "rule__IfLet__Group__1__Impl"
    // InternalHale.g:5149:1: rule__IfLet__Group__1__Impl : ( 'let' ) ;
    public final void rule__IfLet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5153:1: ( ( 'let' ) )
            // InternalHale.g:5154:1: ( 'let' )
            {
            // InternalHale.g:5154:1: ( 'let' )
            // InternalHale.g:5155:2: 'let'
            {
             before(grammarAccess.getIfLetAccess().getLetKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getIfLetAccess().getLetKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfLet__Group__1__Impl"


    // $ANTLR start "rule__IfLet__Group__2"
    // InternalHale.g:5164:1: rule__IfLet__Group__2 : rule__IfLet__Group__2__Impl rule__IfLet__Group__3 ;
    public final void rule__IfLet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5168:1: ( rule__IfLet__Group__2__Impl rule__IfLet__Group__3 )
            // InternalHale.g:5169:2: rule__IfLet__Group__2__Impl rule__IfLet__Group__3
            {
            pushFollow(FOLLOW_50);
            rule__IfLet__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfLet__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfLet__Group__2"


    // $ANTLR start "rule__IfLet__Group__2__Impl"
    // InternalHale.g:5176:1: rule__IfLet__Group__2__Impl : ( ( rule__IfLet__NameAssignment_2 ) ) ;
    public final void rule__IfLet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5180:1: ( ( ( rule__IfLet__NameAssignment_2 ) ) )
            // InternalHale.g:5181:1: ( ( rule__IfLet__NameAssignment_2 ) )
            {
            // InternalHale.g:5181:1: ( ( rule__IfLet__NameAssignment_2 ) )
            // InternalHale.g:5182:2: ( rule__IfLet__NameAssignment_2 )
            {
             before(grammarAccess.getIfLetAccess().getNameAssignment_2()); 
            // InternalHale.g:5183:2: ( rule__IfLet__NameAssignment_2 )
            // InternalHale.g:5183:3: rule__IfLet__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__IfLet__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIfLetAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfLet__Group__2__Impl"


    // $ANTLR start "rule__IfLet__Group__3"
    // InternalHale.g:5191:1: rule__IfLet__Group__3 : rule__IfLet__Group__3__Impl rule__IfLet__Group__4 ;
    public final void rule__IfLet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5195:1: ( rule__IfLet__Group__3__Impl rule__IfLet__Group__4 )
            // InternalHale.g:5196:2: rule__IfLet__Group__3__Impl rule__IfLet__Group__4
            {
            pushFollow(FOLLOW_50);
            rule__IfLet__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfLet__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfLet__Group__3"


    // $ANTLR start "rule__IfLet__Group__3__Impl"
    // InternalHale.g:5203:1: rule__IfLet__Group__3__Impl : ( ( rule__IfLet__TypeAssignment_3 )? ) ;
    public final void rule__IfLet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5207:1: ( ( ( rule__IfLet__TypeAssignment_3 )? ) )
            // InternalHale.g:5208:1: ( ( rule__IfLet__TypeAssignment_3 )? )
            {
            // InternalHale.g:5208:1: ( ( rule__IfLet__TypeAssignment_3 )? )
            // InternalHale.g:5209:2: ( rule__IfLet__TypeAssignment_3 )?
            {
             before(grammarAccess.getIfLetAccess().getTypeAssignment_3()); 
            // InternalHale.g:5210:2: ( rule__IfLet__TypeAssignment_3 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==36) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalHale.g:5210:3: rule__IfLet__TypeAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__IfLet__TypeAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIfLetAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfLet__Group__3__Impl"


    // $ANTLR start "rule__IfLet__Group__4"
    // InternalHale.g:5218:1: rule__IfLet__Group__4 : rule__IfLet__Group__4__Impl rule__IfLet__Group__5 ;
    public final void rule__IfLet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5222:1: ( rule__IfLet__Group__4__Impl rule__IfLet__Group__5 )
            // InternalHale.g:5223:2: rule__IfLet__Group__4__Impl rule__IfLet__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__IfLet__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfLet__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfLet__Group__4"


    // $ANTLR start "rule__IfLet__Group__4__Impl"
    // InternalHale.g:5230:1: rule__IfLet__Group__4__Impl : ( '=' ) ;
    public final void rule__IfLet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5234:1: ( ( '=' ) )
            // InternalHale.g:5235:1: ( '=' )
            {
            // InternalHale.g:5235:1: ( '=' )
            // InternalHale.g:5236:2: '='
            {
             before(grammarAccess.getIfLetAccess().getEqualsSignKeyword_4()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getIfLetAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfLet__Group__4__Impl"


    // $ANTLR start "rule__IfLet__Group__5"
    // InternalHale.g:5245:1: rule__IfLet__Group__5 : rule__IfLet__Group__5__Impl rule__IfLet__Group__6 ;
    public final void rule__IfLet__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5249:1: ( rule__IfLet__Group__5__Impl rule__IfLet__Group__6 )
            // InternalHale.g:5250:2: rule__IfLet__Group__5__Impl rule__IfLet__Group__6
            {
            pushFollow(FOLLOW_54);
            rule__IfLet__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfLet__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfLet__Group__5"


    // $ANTLR start "rule__IfLet__Group__5__Impl"
    // InternalHale.g:5257:1: rule__IfLet__Group__5__Impl : ( ( rule__IfLet__ExpressionAssignment_5 ) ) ;
    public final void rule__IfLet__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5261:1: ( ( ( rule__IfLet__ExpressionAssignment_5 ) ) )
            // InternalHale.g:5262:1: ( ( rule__IfLet__ExpressionAssignment_5 ) )
            {
            // InternalHale.g:5262:1: ( ( rule__IfLet__ExpressionAssignment_5 ) )
            // InternalHale.g:5263:2: ( rule__IfLet__ExpressionAssignment_5 )
            {
             before(grammarAccess.getIfLetAccess().getExpressionAssignment_5()); 
            // InternalHale.g:5264:2: ( rule__IfLet__ExpressionAssignment_5 )
            // InternalHale.g:5264:3: rule__IfLet__ExpressionAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__IfLet__ExpressionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getIfLetAccess().getExpressionAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfLet__Group__5__Impl"


    // $ANTLR start "rule__IfLet__Group__6"
    // InternalHale.g:5272:1: rule__IfLet__Group__6 : rule__IfLet__Group__6__Impl rule__IfLet__Group__7 ;
    public final void rule__IfLet__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5276:1: ( rule__IfLet__Group__6__Impl rule__IfLet__Group__7 )
            // InternalHale.g:5277:2: rule__IfLet__Group__6__Impl rule__IfLet__Group__7
            {
            pushFollow(FOLLOW_55);
            rule__IfLet__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfLet__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfLet__Group__6"


    // $ANTLR start "rule__IfLet__Group__6__Impl"
    // InternalHale.g:5284:1: rule__IfLet__Group__6__Impl : ( ( rule__IfLet__IfBlockAssignment_6 ) ) ;
    public final void rule__IfLet__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5288:1: ( ( ( rule__IfLet__IfBlockAssignment_6 ) ) )
            // InternalHale.g:5289:1: ( ( rule__IfLet__IfBlockAssignment_6 ) )
            {
            // InternalHale.g:5289:1: ( ( rule__IfLet__IfBlockAssignment_6 ) )
            // InternalHale.g:5290:2: ( rule__IfLet__IfBlockAssignment_6 )
            {
             before(grammarAccess.getIfLetAccess().getIfBlockAssignment_6()); 
            // InternalHale.g:5291:2: ( rule__IfLet__IfBlockAssignment_6 )
            // InternalHale.g:5291:3: rule__IfLet__IfBlockAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__IfLet__IfBlockAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getIfLetAccess().getIfBlockAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfLet__Group__6__Impl"


    // $ANTLR start "rule__IfLet__Group__7"
    // InternalHale.g:5299:1: rule__IfLet__Group__7 : rule__IfLet__Group__7__Impl ;
    public final void rule__IfLet__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5303:1: ( rule__IfLet__Group__7__Impl )
            // InternalHale.g:5304:2: rule__IfLet__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IfLet__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfLet__Group__7"


    // $ANTLR start "rule__IfLet__Group__7__Impl"
    // InternalHale.g:5310:1: rule__IfLet__Group__7__Impl : ( ( rule__IfLet__Group_7__0 )? ) ;
    public final void rule__IfLet__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5314:1: ( ( ( rule__IfLet__Group_7__0 )? ) )
            // InternalHale.g:5315:1: ( ( rule__IfLet__Group_7__0 )? )
            {
            // InternalHale.g:5315:1: ( ( rule__IfLet__Group_7__0 )? )
            // InternalHale.g:5316:2: ( rule__IfLet__Group_7__0 )?
            {
             before(grammarAccess.getIfLetAccess().getGroup_7()); 
            // InternalHale.g:5317:2: ( rule__IfLet__Group_7__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==44) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalHale.g:5317:3: rule__IfLet__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IfLet__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIfLetAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfLet__Group__7__Impl"


    // $ANTLR start "rule__IfLet__Group_7__0"
    // InternalHale.g:5326:1: rule__IfLet__Group_7__0 : rule__IfLet__Group_7__0__Impl rule__IfLet__Group_7__1 ;
    public final void rule__IfLet__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5330:1: ( rule__IfLet__Group_7__0__Impl rule__IfLet__Group_7__1 )
            // InternalHale.g:5331:2: rule__IfLet__Group_7__0__Impl rule__IfLet__Group_7__1
            {
            pushFollow(FOLLOW_56);
            rule__IfLet__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfLet__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfLet__Group_7__0"


    // $ANTLR start "rule__IfLet__Group_7__0__Impl"
    // InternalHale.g:5338:1: rule__IfLet__Group_7__0__Impl : ( 'else' ) ;
    public final void rule__IfLet__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5342:1: ( ( 'else' ) )
            // InternalHale.g:5343:1: ( 'else' )
            {
            // InternalHale.g:5343:1: ( 'else' )
            // InternalHale.g:5344:2: 'else'
            {
             before(grammarAccess.getIfLetAccess().getElseKeyword_7_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getIfLetAccess().getElseKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfLet__Group_7__0__Impl"


    // $ANTLR start "rule__IfLet__Group_7__1"
    // InternalHale.g:5353:1: rule__IfLet__Group_7__1 : rule__IfLet__Group_7__1__Impl ;
    public final void rule__IfLet__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5357:1: ( rule__IfLet__Group_7__1__Impl )
            // InternalHale.g:5358:2: rule__IfLet__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IfLet__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfLet__Group_7__1"


    // $ANTLR start "rule__IfLet__Group_7__1__Impl"
    // InternalHale.g:5364:1: rule__IfLet__Group_7__1__Impl : ( ( rule__IfLet__ElseLetAssignment_7_1 ) ) ;
    public final void rule__IfLet__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5368:1: ( ( ( rule__IfLet__ElseLetAssignment_7_1 ) ) )
            // InternalHale.g:5369:1: ( ( rule__IfLet__ElseLetAssignment_7_1 ) )
            {
            // InternalHale.g:5369:1: ( ( rule__IfLet__ElseLetAssignment_7_1 ) )
            // InternalHale.g:5370:2: ( rule__IfLet__ElseLetAssignment_7_1 )
            {
             before(grammarAccess.getIfLetAccess().getElseLetAssignment_7_1()); 
            // InternalHale.g:5371:2: ( rule__IfLet__ElseLetAssignment_7_1 )
            // InternalHale.g:5371:3: rule__IfLet__ElseLetAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__IfLet__ElseLetAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getIfLetAccess().getElseLetAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfLet__Group_7__1__Impl"


    // $ANTLR start "rule__ElseLet__Group__0"
    // InternalHale.g:5380:1: rule__ElseLet__Group__0 : rule__ElseLet__Group__0__Impl rule__ElseLet__Group__1 ;
    public final void rule__ElseLet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5384:1: ( rule__ElseLet__Group__0__Impl rule__ElseLet__Group__1 )
            // InternalHale.g:5385:2: rule__ElseLet__Group__0__Impl rule__ElseLet__Group__1
            {
            pushFollow(FOLLOW_56);
            rule__ElseLet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElseLet__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseLet__Group__0"


    // $ANTLR start "rule__ElseLet__Group__0__Impl"
    // InternalHale.g:5392:1: rule__ElseLet__Group__0__Impl : ( () ) ;
    public final void rule__ElseLet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5396:1: ( ( () ) )
            // InternalHale.g:5397:1: ( () )
            {
            // InternalHale.g:5397:1: ( () )
            // InternalHale.g:5398:2: ()
            {
             before(grammarAccess.getElseLetAccess().getElseLetAction_0()); 
            // InternalHale.g:5399:2: ()
            // InternalHale.g:5399:3: 
            {
            }

             after(grammarAccess.getElseLetAccess().getElseLetAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseLet__Group__0__Impl"


    // $ANTLR start "rule__ElseLet__Group__1"
    // InternalHale.g:5407:1: rule__ElseLet__Group__1 : rule__ElseLet__Group__1__Impl rule__ElseLet__Group__2 ;
    public final void rule__ElseLet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5411:1: ( rule__ElseLet__Group__1__Impl rule__ElseLet__Group__2 )
            // InternalHale.g:5412:2: rule__ElseLet__Group__1__Impl rule__ElseLet__Group__2
            {
            pushFollow(FOLLOW_56);
            rule__ElseLet__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElseLet__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseLet__Group__1"


    // $ANTLR start "rule__ElseLet__Group__1__Impl"
    // InternalHale.g:5419:1: rule__ElseLet__Group__1__Impl : ( ( rule__ElseLet__Group_1__0 )? ) ;
    public final void rule__ElseLet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5423:1: ( ( ( rule__ElseLet__Group_1__0 )? ) )
            // InternalHale.g:5424:1: ( ( rule__ElseLet__Group_1__0 )? )
            {
            // InternalHale.g:5424:1: ( ( rule__ElseLet__Group_1__0 )? )
            // InternalHale.g:5425:2: ( rule__ElseLet__Group_1__0 )?
            {
             before(grammarAccess.getElseLetAccess().getGroup_1()); 
            // InternalHale.g:5426:2: ( rule__ElseLet__Group_1__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==39) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalHale.g:5426:3: rule__ElseLet__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ElseLet__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getElseLetAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseLet__Group__1__Impl"


    // $ANTLR start "rule__ElseLet__Group__2"
    // InternalHale.g:5434:1: rule__ElseLet__Group__2 : rule__ElseLet__Group__2__Impl ;
    public final void rule__ElseLet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5438:1: ( rule__ElseLet__Group__2__Impl )
            // InternalHale.g:5439:2: rule__ElseLet__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ElseLet__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseLet__Group__2"


    // $ANTLR start "rule__ElseLet__Group__2__Impl"
    // InternalHale.g:5445:1: rule__ElseLet__Group__2__Impl : ( ( rule__ElseLet__ElseBlockAssignment_2 ) ) ;
    public final void rule__ElseLet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5449:1: ( ( ( rule__ElseLet__ElseBlockAssignment_2 ) ) )
            // InternalHale.g:5450:1: ( ( rule__ElseLet__ElseBlockAssignment_2 ) )
            {
            // InternalHale.g:5450:1: ( ( rule__ElseLet__ElseBlockAssignment_2 ) )
            // InternalHale.g:5451:2: ( rule__ElseLet__ElseBlockAssignment_2 )
            {
             before(grammarAccess.getElseLetAccess().getElseBlockAssignment_2()); 
            // InternalHale.g:5452:2: ( rule__ElseLet__ElseBlockAssignment_2 )
            // InternalHale.g:5452:3: rule__ElseLet__ElseBlockAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ElseLet__ElseBlockAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getElseLetAccess().getElseBlockAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseLet__Group__2__Impl"


    // $ANTLR start "rule__ElseLet__Group_1__0"
    // InternalHale.g:5461:1: rule__ElseLet__Group_1__0 : rule__ElseLet__Group_1__0__Impl rule__ElseLet__Group_1__1 ;
    public final void rule__ElseLet__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5465:1: ( rule__ElseLet__Group_1__0__Impl rule__ElseLet__Group_1__1 )
            // InternalHale.g:5466:2: rule__ElseLet__Group_1__0__Impl rule__ElseLet__Group_1__1
            {
            pushFollow(FOLLOW_53);
            rule__ElseLet__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElseLet__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseLet__Group_1__0"


    // $ANTLR start "rule__ElseLet__Group_1__0__Impl"
    // InternalHale.g:5473:1: rule__ElseLet__Group_1__0__Impl : ( 'let' ) ;
    public final void rule__ElseLet__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5477:1: ( ( 'let' ) )
            // InternalHale.g:5478:1: ( 'let' )
            {
            // InternalHale.g:5478:1: ( 'let' )
            // InternalHale.g:5479:2: 'let'
            {
             before(grammarAccess.getElseLetAccess().getLetKeyword_1_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getElseLetAccess().getLetKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseLet__Group_1__0__Impl"


    // $ANTLR start "rule__ElseLet__Group_1__1"
    // InternalHale.g:5488:1: rule__ElseLet__Group_1__1 : rule__ElseLet__Group_1__1__Impl rule__ElseLet__Group_1__2 ;
    public final void rule__ElseLet__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5492:1: ( rule__ElseLet__Group_1__1__Impl rule__ElseLet__Group_1__2 )
            // InternalHale.g:5493:2: rule__ElseLet__Group_1__1__Impl rule__ElseLet__Group_1__2
            {
            pushFollow(FOLLOW_44);
            rule__ElseLet__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElseLet__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseLet__Group_1__1"


    // $ANTLR start "rule__ElseLet__Group_1__1__Impl"
    // InternalHale.g:5500:1: rule__ElseLet__Group_1__1__Impl : ( ( rule__ElseLet__NameAssignment_1_1 ) ) ;
    public final void rule__ElseLet__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5504:1: ( ( ( rule__ElseLet__NameAssignment_1_1 ) ) )
            // InternalHale.g:5505:1: ( ( rule__ElseLet__NameAssignment_1_1 ) )
            {
            // InternalHale.g:5505:1: ( ( rule__ElseLet__NameAssignment_1_1 ) )
            // InternalHale.g:5506:2: ( rule__ElseLet__NameAssignment_1_1 )
            {
             before(grammarAccess.getElseLetAccess().getNameAssignment_1_1()); 
            // InternalHale.g:5507:2: ( rule__ElseLet__NameAssignment_1_1 )
            // InternalHale.g:5507:3: rule__ElseLet__NameAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ElseLet__NameAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getElseLetAccess().getNameAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseLet__Group_1__1__Impl"


    // $ANTLR start "rule__ElseLet__Group_1__2"
    // InternalHale.g:5515:1: rule__ElseLet__Group_1__2 : rule__ElseLet__Group_1__2__Impl ;
    public final void rule__ElseLet__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5519:1: ( rule__ElseLet__Group_1__2__Impl )
            // InternalHale.g:5520:2: rule__ElseLet__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ElseLet__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseLet__Group_1__2"


    // $ANTLR start "rule__ElseLet__Group_1__2__Impl"
    // InternalHale.g:5526:1: rule__ElseLet__Group_1__2__Impl : ( ( rule__ElseLet__TypeAssignment_1_2 )? ) ;
    public final void rule__ElseLet__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5530:1: ( ( ( rule__ElseLet__TypeAssignment_1_2 )? ) )
            // InternalHale.g:5531:1: ( ( rule__ElseLet__TypeAssignment_1_2 )? )
            {
            // InternalHale.g:5531:1: ( ( rule__ElseLet__TypeAssignment_1_2 )? )
            // InternalHale.g:5532:2: ( rule__ElseLet__TypeAssignment_1_2 )?
            {
             before(grammarAccess.getElseLetAccess().getTypeAssignment_1_2()); 
            // InternalHale.g:5533:2: ( rule__ElseLet__TypeAssignment_1_2 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==36) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalHale.g:5533:3: rule__ElseLet__TypeAssignment_1_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ElseLet__TypeAssignment_1_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getElseLetAccess().getTypeAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseLet__Group_1__2__Impl"


    // $ANTLR start "rule__IfConditions__Group__0"
    // InternalHale.g:5542:1: rule__IfConditions__Group__0 : rule__IfConditions__Group__0__Impl rule__IfConditions__Group__1 ;
    public final void rule__IfConditions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5546:1: ( rule__IfConditions__Group__0__Impl rule__IfConditions__Group__1 )
            // InternalHale.g:5547:2: rule__IfConditions__Group__0__Impl rule__IfConditions__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__IfConditions__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfConditions__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfConditions__Group__0"


    // $ANTLR start "rule__IfConditions__Group__0__Impl"
    // InternalHale.g:5554:1: rule__IfConditions__Group__0__Impl : ( () ) ;
    public final void rule__IfConditions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5558:1: ( ( () ) )
            // InternalHale.g:5559:1: ( () )
            {
            // InternalHale.g:5559:1: ( () )
            // InternalHale.g:5560:2: ()
            {
             before(grammarAccess.getIfConditionsAccess().getIfConditionsAction_0()); 
            // InternalHale.g:5561:2: ()
            // InternalHale.g:5561:3: 
            {
            }

             after(grammarAccess.getIfConditionsAccess().getIfConditionsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfConditions__Group__0__Impl"


    // $ANTLR start "rule__IfConditions__Group__1"
    // InternalHale.g:5569:1: rule__IfConditions__Group__1 : rule__IfConditions__Group__1__Impl rule__IfConditions__Group__2 ;
    public final void rule__IfConditions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5573:1: ( rule__IfConditions__Group__1__Impl rule__IfConditions__Group__2 )
            // InternalHale.g:5574:2: rule__IfConditions__Group__1__Impl rule__IfConditions__Group__2
            {
            pushFollow(FOLLOW_54);
            rule__IfConditions__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfConditions__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfConditions__Group__1"


    // $ANTLR start "rule__IfConditions__Group__1__Impl"
    // InternalHale.g:5581:1: rule__IfConditions__Group__1__Impl : ( ( rule__IfConditions__ConditionsAssignment_1 ) ) ;
    public final void rule__IfConditions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5585:1: ( ( ( rule__IfConditions__ConditionsAssignment_1 ) ) )
            // InternalHale.g:5586:1: ( ( rule__IfConditions__ConditionsAssignment_1 ) )
            {
            // InternalHale.g:5586:1: ( ( rule__IfConditions__ConditionsAssignment_1 ) )
            // InternalHale.g:5587:2: ( rule__IfConditions__ConditionsAssignment_1 )
            {
             before(grammarAccess.getIfConditionsAccess().getConditionsAssignment_1()); 
            // InternalHale.g:5588:2: ( rule__IfConditions__ConditionsAssignment_1 )
            // InternalHale.g:5588:3: rule__IfConditions__ConditionsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__IfConditions__ConditionsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIfConditionsAccess().getConditionsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfConditions__Group__1__Impl"


    // $ANTLR start "rule__IfConditions__Group__2"
    // InternalHale.g:5596:1: rule__IfConditions__Group__2 : rule__IfConditions__Group__2__Impl rule__IfConditions__Group__3 ;
    public final void rule__IfConditions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5600:1: ( rule__IfConditions__Group__2__Impl rule__IfConditions__Group__3 )
            // InternalHale.g:5601:2: rule__IfConditions__Group__2__Impl rule__IfConditions__Group__3
            {
            pushFollow(FOLLOW_57);
            rule__IfConditions__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfConditions__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfConditions__Group__2"


    // $ANTLR start "rule__IfConditions__Group__2__Impl"
    // InternalHale.g:5608:1: rule__IfConditions__Group__2__Impl : ( ( rule__IfConditions__IfBlocksAssignment_2 ) ) ;
    public final void rule__IfConditions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5612:1: ( ( ( rule__IfConditions__IfBlocksAssignment_2 ) ) )
            // InternalHale.g:5613:1: ( ( rule__IfConditions__IfBlocksAssignment_2 ) )
            {
            // InternalHale.g:5613:1: ( ( rule__IfConditions__IfBlocksAssignment_2 ) )
            // InternalHale.g:5614:2: ( rule__IfConditions__IfBlocksAssignment_2 )
            {
             before(grammarAccess.getIfConditionsAccess().getIfBlocksAssignment_2()); 
            // InternalHale.g:5615:2: ( rule__IfConditions__IfBlocksAssignment_2 )
            // InternalHale.g:5615:3: rule__IfConditions__IfBlocksAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__IfConditions__IfBlocksAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIfConditionsAccess().getIfBlocksAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfConditions__Group__2__Impl"


    // $ANTLR start "rule__IfConditions__Group__3"
    // InternalHale.g:5623:1: rule__IfConditions__Group__3 : rule__IfConditions__Group__3__Impl rule__IfConditions__Group__4 ;
    public final void rule__IfConditions__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5627:1: ( rule__IfConditions__Group__3__Impl rule__IfConditions__Group__4 )
            // InternalHale.g:5628:2: rule__IfConditions__Group__3__Impl rule__IfConditions__Group__4
            {
            pushFollow(FOLLOW_57);
            rule__IfConditions__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfConditions__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfConditions__Group__3"


    // $ANTLR start "rule__IfConditions__Group__3__Impl"
    // InternalHale.g:5635:1: rule__IfConditions__Group__3__Impl : ( ( rule__IfConditions__Group_3__0 )* ) ;
    public final void rule__IfConditions__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5639:1: ( ( ( rule__IfConditions__Group_3__0 )* ) )
            // InternalHale.g:5640:1: ( ( rule__IfConditions__Group_3__0 )* )
            {
            // InternalHale.g:5640:1: ( ( rule__IfConditions__Group_3__0 )* )
            // InternalHale.g:5641:2: ( rule__IfConditions__Group_3__0 )*
            {
             before(grammarAccess.getIfConditionsAccess().getGroup_3()); 
            // InternalHale.g:5642:2: ( rule__IfConditions__Group_3__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==45) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalHale.g:5642:3: rule__IfConditions__Group_3__0
            	    {
            	    pushFollow(FOLLOW_58);
            	    rule__IfConditions__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getIfConditionsAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfConditions__Group__3__Impl"


    // $ANTLR start "rule__IfConditions__Group__4"
    // InternalHale.g:5650:1: rule__IfConditions__Group__4 : rule__IfConditions__Group__4__Impl ;
    public final void rule__IfConditions__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5654:1: ( rule__IfConditions__Group__4__Impl )
            // InternalHale.g:5655:2: rule__IfConditions__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IfConditions__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfConditions__Group__4"


    // $ANTLR start "rule__IfConditions__Group__4__Impl"
    // InternalHale.g:5661:1: rule__IfConditions__Group__4__Impl : ( ( rule__IfConditions__Group_4__0 )? ) ;
    public final void rule__IfConditions__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5665:1: ( ( ( rule__IfConditions__Group_4__0 )? ) )
            // InternalHale.g:5666:1: ( ( rule__IfConditions__Group_4__0 )? )
            {
            // InternalHale.g:5666:1: ( ( rule__IfConditions__Group_4__0 )? )
            // InternalHale.g:5667:2: ( rule__IfConditions__Group_4__0 )?
            {
             before(grammarAccess.getIfConditionsAccess().getGroup_4()); 
            // InternalHale.g:5668:2: ( rule__IfConditions__Group_4__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==44) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalHale.g:5668:3: rule__IfConditions__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IfConditions__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIfConditionsAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfConditions__Group__4__Impl"


    // $ANTLR start "rule__IfConditions__Group_3__0"
    // InternalHale.g:5677:1: rule__IfConditions__Group_3__0 : rule__IfConditions__Group_3__0__Impl rule__IfConditions__Group_3__1 ;
    public final void rule__IfConditions__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5681:1: ( rule__IfConditions__Group_3__0__Impl rule__IfConditions__Group_3__1 )
            // InternalHale.g:5682:2: rule__IfConditions__Group_3__0__Impl rule__IfConditions__Group_3__1
            {
            pushFollow(FOLLOW_9);
            rule__IfConditions__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfConditions__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfConditions__Group_3__0"


    // $ANTLR start "rule__IfConditions__Group_3__0__Impl"
    // InternalHale.g:5689:1: rule__IfConditions__Group_3__0__Impl : ( 'elseif' ) ;
    public final void rule__IfConditions__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5693:1: ( ( 'elseif' ) )
            // InternalHale.g:5694:1: ( 'elseif' )
            {
            // InternalHale.g:5694:1: ( 'elseif' )
            // InternalHale.g:5695:2: 'elseif'
            {
             before(grammarAccess.getIfConditionsAccess().getElseifKeyword_3_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getIfConditionsAccess().getElseifKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfConditions__Group_3__0__Impl"


    // $ANTLR start "rule__IfConditions__Group_3__1"
    // InternalHale.g:5704:1: rule__IfConditions__Group_3__1 : rule__IfConditions__Group_3__1__Impl rule__IfConditions__Group_3__2 ;
    public final void rule__IfConditions__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5708:1: ( rule__IfConditions__Group_3__1__Impl rule__IfConditions__Group_3__2 )
            // InternalHale.g:5709:2: rule__IfConditions__Group_3__1__Impl rule__IfConditions__Group_3__2
            {
            pushFollow(FOLLOW_54);
            rule__IfConditions__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfConditions__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfConditions__Group_3__1"


    // $ANTLR start "rule__IfConditions__Group_3__1__Impl"
    // InternalHale.g:5716:1: rule__IfConditions__Group_3__1__Impl : ( ( rule__IfConditions__ConditionsAssignment_3_1 ) ) ;
    public final void rule__IfConditions__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5720:1: ( ( ( rule__IfConditions__ConditionsAssignment_3_1 ) ) )
            // InternalHale.g:5721:1: ( ( rule__IfConditions__ConditionsAssignment_3_1 ) )
            {
            // InternalHale.g:5721:1: ( ( rule__IfConditions__ConditionsAssignment_3_1 ) )
            // InternalHale.g:5722:2: ( rule__IfConditions__ConditionsAssignment_3_1 )
            {
             before(grammarAccess.getIfConditionsAccess().getConditionsAssignment_3_1()); 
            // InternalHale.g:5723:2: ( rule__IfConditions__ConditionsAssignment_3_1 )
            // InternalHale.g:5723:3: rule__IfConditions__ConditionsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__IfConditions__ConditionsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getIfConditionsAccess().getConditionsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfConditions__Group_3__1__Impl"


    // $ANTLR start "rule__IfConditions__Group_3__2"
    // InternalHale.g:5731:1: rule__IfConditions__Group_3__2 : rule__IfConditions__Group_3__2__Impl ;
    public final void rule__IfConditions__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5735:1: ( rule__IfConditions__Group_3__2__Impl )
            // InternalHale.g:5736:2: rule__IfConditions__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IfConditions__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfConditions__Group_3__2"


    // $ANTLR start "rule__IfConditions__Group_3__2__Impl"
    // InternalHale.g:5742:1: rule__IfConditions__Group_3__2__Impl : ( ( rule__IfConditions__IfBlocksAssignment_3_2 ) ) ;
    public final void rule__IfConditions__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5746:1: ( ( ( rule__IfConditions__IfBlocksAssignment_3_2 ) ) )
            // InternalHale.g:5747:1: ( ( rule__IfConditions__IfBlocksAssignment_3_2 ) )
            {
            // InternalHale.g:5747:1: ( ( rule__IfConditions__IfBlocksAssignment_3_2 ) )
            // InternalHale.g:5748:2: ( rule__IfConditions__IfBlocksAssignment_3_2 )
            {
             before(grammarAccess.getIfConditionsAccess().getIfBlocksAssignment_3_2()); 
            // InternalHale.g:5749:2: ( rule__IfConditions__IfBlocksAssignment_3_2 )
            // InternalHale.g:5749:3: rule__IfConditions__IfBlocksAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__IfConditions__IfBlocksAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getIfConditionsAccess().getIfBlocksAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfConditions__Group_3__2__Impl"


    // $ANTLR start "rule__IfConditions__Group_4__0"
    // InternalHale.g:5758:1: rule__IfConditions__Group_4__0 : rule__IfConditions__Group_4__0__Impl rule__IfConditions__Group_4__1 ;
    public final void rule__IfConditions__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5762:1: ( rule__IfConditions__Group_4__0__Impl rule__IfConditions__Group_4__1 )
            // InternalHale.g:5763:2: rule__IfConditions__Group_4__0__Impl rule__IfConditions__Group_4__1
            {
            pushFollow(FOLLOW_54);
            rule__IfConditions__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfConditions__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfConditions__Group_4__0"


    // $ANTLR start "rule__IfConditions__Group_4__0__Impl"
    // InternalHale.g:5770:1: rule__IfConditions__Group_4__0__Impl : ( 'else' ) ;
    public final void rule__IfConditions__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5774:1: ( ( 'else' ) )
            // InternalHale.g:5775:1: ( 'else' )
            {
            // InternalHale.g:5775:1: ( 'else' )
            // InternalHale.g:5776:2: 'else'
            {
             before(grammarAccess.getIfConditionsAccess().getElseKeyword_4_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getIfConditionsAccess().getElseKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfConditions__Group_4__0__Impl"


    // $ANTLR start "rule__IfConditions__Group_4__1"
    // InternalHale.g:5785:1: rule__IfConditions__Group_4__1 : rule__IfConditions__Group_4__1__Impl ;
    public final void rule__IfConditions__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5789:1: ( rule__IfConditions__Group_4__1__Impl )
            // InternalHale.g:5790:2: rule__IfConditions__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IfConditions__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfConditions__Group_4__1"


    // $ANTLR start "rule__IfConditions__Group_4__1__Impl"
    // InternalHale.g:5796:1: rule__IfConditions__Group_4__1__Impl : ( ( rule__IfConditions__ElseBlockAssignment_4_1 ) ) ;
    public final void rule__IfConditions__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5800:1: ( ( ( rule__IfConditions__ElseBlockAssignment_4_1 ) ) )
            // InternalHale.g:5801:1: ( ( rule__IfConditions__ElseBlockAssignment_4_1 ) )
            {
            // InternalHale.g:5801:1: ( ( rule__IfConditions__ElseBlockAssignment_4_1 ) )
            // InternalHale.g:5802:2: ( rule__IfConditions__ElseBlockAssignment_4_1 )
            {
             before(grammarAccess.getIfConditionsAccess().getElseBlockAssignment_4_1()); 
            // InternalHale.g:5803:2: ( rule__IfConditions__ElseBlockAssignment_4_1 )
            // InternalHale.g:5803:3: rule__IfConditions__ElseBlockAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__IfConditions__ElseBlockAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getIfConditionsAccess().getElseBlockAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfConditions__Group_4__1__Impl"


    // $ANTLR start "rule__While__Group__0"
    // InternalHale.g:5812:1: rule__While__Group__0 : rule__While__Group__0__Impl rule__While__Group__1 ;
    public final void rule__While__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5816:1: ( rule__While__Group__0__Impl rule__While__Group__1 )
            // InternalHale.g:5817:2: rule__While__Group__0__Impl rule__While__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalHale.g:5824:1: rule__While__Group__0__Impl : ( 'while' ) ;
    public final void rule__While__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5828:1: ( ( 'while' ) )
            // InternalHale.g:5829:1: ( 'while' )
            {
            // InternalHale.g:5829:1: ( 'while' )
            // InternalHale.g:5830:2: 'while'
            {
             before(grammarAccess.getWhileAccess().getWhileKeyword_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalHale.g:5839:1: rule__While__Group__1 : rule__While__Group__1__Impl rule__While__Group__2 ;
    public final void rule__While__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5843:1: ( rule__While__Group__1__Impl rule__While__Group__2 )
            // InternalHale.g:5844:2: rule__While__Group__1__Impl rule__While__Group__2
            {
            pushFollow(FOLLOW_54);
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
    // InternalHale.g:5851:1: rule__While__Group__1__Impl : ( ( rule__While__ConditionAssignment_1 ) ) ;
    public final void rule__While__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5855:1: ( ( ( rule__While__ConditionAssignment_1 ) ) )
            // InternalHale.g:5856:1: ( ( rule__While__ConditionAssignment_1 ) )
            {
            // InternalHale.g:5856:1: ( ( rule__While__ConditionAssignment_1 ) )
            // InternalHale.g:5857:2: ( rule__While__ConditionAssignment_1 )
            {
             before(grammarAccess.getWhileAccess().getConditionAssignment_1()); 
            // InternalHale.g:5858:2: ( rule__While__ConditionAssignment_1 )
            // InternalHale.g:5858:3: rule__While__ConditionAssignment_1
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
    // InternalHale.g:5866:1: rule__While__Group__2 : rule__While__Group__2__Impl ;
    public final void rule__While__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5870:1: ( rule__While__Group__2__Impl )
            // InternalHale.g:5871:2: rule__While__Group__2__Impl
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
    // InternalHale.g:5877:1: rule__While__Group__2__Impl : ( ( rule__While__BlockAssignment_2 ) ) ;
    public final void rule__While__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5881:1: ( ( ( rule__While__BlockAssignment_2 ) ) )
            // InternalHale.g:5882:1: ( ( rule__While__BlockAssignment_2 ) )
            {
            // InternalHale.g:5882:1: ( ( rule__While__BlockAssignment_2 ) )
            // InternalHale.g:5883:2: ( rule__While__BlockAssignment_2 )
            {
             before(grammarAccess.getWhileAccess().getBlockAssignment_2()); 
            // InternalHale.g:5884:2: ( rule__While__BlockAssignment_2 )
            // InternalHale.g:5884:3: rule__While__BlockAssignment_2
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


    // $ANTLR start "rule__Break__Group__0"
    // InternalHale.g:5893:1: rule__Break__Group__0 : rule__Break__Group__0__Impl rule__Break__Group__1 ;
    public final void rule__Break__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5897:1: ( rule__Break__Group__0__Impl rule__Break__Group__1 )
            // InternalHale.g:5898:2: rule__Break__Group__0__Impl rule__Break__Group__1
            {
            pushFollow(FOLLOW_59);
            rule__Break__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Break__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Break__Group__0"


    // $ANTLR start "rule__Break__Group__0__Impl"
    // InternalHale.g:5905:1: rule__Break__Group__0__Impl : ( () ) ;
    public final void rule__Break__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5909:1: ( ( () ) )
            // InternalHale.g:5910:1: ( () )
            {
            // InternalHale.g:5910:1: ( () )
            // InternalHale.g:5911:2: ()
            {
             before(grammarAccess.getBreakAccess().getBreakAction_0()); 
            // InternalHale.g:5912:2: ()
            // InternalHale.g:5912:3: 
            {
            }

             after(grammarAccess.getBreakAccess().getBreakAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Break__Group__0__Impl"


    // $ANTLR start "rule__Break__Group__1"
    // InternalHale.g:5920:1: rule__Break__Group__1 : rule__Break__Group__1__Impl ;
    public final void rule__Break__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5924:1: ( rule__Break__Group__1__Impl )
            // InternalHale.g:5925:2: rule__Break__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Break__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Break__Group__1"


    // $ANTLR start "rule__Break__Group__1__Impl"
    // InternalHale.g:5931:1: rule__Break__Group__1__Impl : ( 'break' ) ;
    public final void rule__Break__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5935:1: ( ( 'break' ) )
            // InternalHale.g:5936:1: ( 'break' )
            {
            // InternalHale.g:5936:1: ( 'break' )
            // InternalHale.g:5937:2: 'break'
            {
             before(grammarAccess.getBreakAccess().getBreakKeyword_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getBreakAccess().getBreakKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Break__Group__1__Impl"


    // $ANTLR start "rule__Function__Group__0"
    // InternalHale.g:5947:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5951:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // InternalHale.g:5952:2: rule__Function__Group__0__Impl rule__Function__Group__1
            {
            pushFollow(FOLLOW_60);
            rule__Function__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__0"


    // $ANTLR start "rule__Function__Group__0__Impl"
    // InternalHale.g:5959:1: rule__Function__Group__0__Impl : ( () ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5963:1: ( ( () ) )
            // InternalHale.g:5964:1: ( () )
            {
            // InternalHale.g:5964:1: ( () )
            // InternalHale.g:5965:2: ()
            {
             before(grammarAccess.getFunctionAccess().getFunctionAction_0()); 
            // InternalHale.g:5966:2: ()
            // InternalHale.g:5966:3: 
            {
            }

             after(grammarAccess.getFunctionAccess().getFunctionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__0__Impl"


    // $ANTLR start "rule__Function__Group__1"
    // InternalHale.g:5974:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5978:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // InternalHale.g:5979:2: rule__Function__Group__1__Impl rule__Function__Group__2
            {
            pushFollow(FOLLOW_53);
            rule__Function__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__1"


    // $ANTLR start "rule__Function__Group__1__Impl"
    // InternalHale.g:5986:1: rule__Function__Group__1__Impl : ( 'function' ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5990:1: ( ( 'function' ) )
            // InternalHale.g:5991:1: ( 'function' )
            {
            // InternalHale.g:5991:1: ( 'function' )
            // InternalHale.g:5992:2: 'function'
            {
             before(grammarAccess.getFunctionAccess().getFunctionKeyword_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getFunctionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__1__Impl"


    // $ANTLR start "rule__Function__Group__2"
    // InternalHale.g:6001:1: rule__Function__Group__2 : rule__Function__Group__2__Impl rule__Function__Group__3 ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6005:1: ( rule__Function__Group__2__Impl rule__Function__Group__3 )
            // InternalHale.g:6006:2: rule__Function__Group__2__Impl rule__Function__Group__3
            {
            pushFollow(FOLLOW_35);
            rule__Function__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__2"


    // $ANTLR start "rule__Function__Group__2__Impl"
    // InternalHale.g:6013:1: rule__Function__Group__2__Impl : ( ( rule__Function__NameAssignment_2 ) ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6017:1: ( ( ( rule__Function__NameAssignment_2 ) ) )
            // InternalHale.g:6018:1: ( ( rule__Function__NameAssignment_2 ) )
            {
            // InternalHale.g:6018:1: ( ( rule__Function__NameAssignment_2 ) )
            // InternalHale.g:6019:2: ( rule__Function__NameAssignment_2 )
            {
             before(grammarAccess.getFunctionAccess().getNameAssignment_2()); 
            // InternalHale.g:6020:2: ( rule__Function__NameAssignment_2 )
            // InternalHale.g:6020:3: rule__Function__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Function__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__2__Impl"


    // $ANTLR start "rule__Function__Group__3"
    // InternalHale.g:6028:1: rule__Function__Group__3 : rule__Function__Group__3__Impl rule__Function__Group__4 ;
    public final void rule__Function__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6032:1: ( rule__Function__Group__3__Impl rule__Function__Group__4 )
            // InternalHale.g:6033:2: rule__Function__Group__3__Impl rule__Function__Group__4
            {
            pushFollow(FOLLOW_61);
            rule__Function__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__3"


    // $ANTLR start "rule__Function__Group__3__Impl"
    // InternalHale.g:6040:1: rule__Function__Group__3__Impl : ( '(' ) ;
    public final void rule__Function__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6044:1: ( ( '(' ) )
            // InternalHale.g:6045:1: ( '(' )
            {
            // InternalHale.g:6045:1: ( '(' )
            // InternalHale.g:6046:2: '('
            {
             before(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__3__Impl"


    // $ANTLR start "rule__Function__Group__4"
    // InternalHale.g:6055:1: rule__Function__Group__4 : rule__Function__Group__4__Impl rule__Function__Group__5 ;
    public final void rule__Function__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6059:1: ( rule__Function__Group__4__Impl rule__Function__Group__5 )
            // InternalHale.g:6060:2: rule__Function__Group__4__Impl rule__Function__Group__5
            {
            pushFollow(FOLLOW_61);
            rule__Function__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__4"


    // $ANTLR start "rule__Function__Group__4__Impl"
    // InternalHale.g:6067:1: rule__Function__Group__4__Impl : ( ( rule__Function__Group_4__0 )? ) ;
    public final void rule__Function__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6071:1: ( ( ( rule__Function__Group_4__0 )? ) )
            // InternalHale.g:6072:1: ( ( rule__Function__Group_4__0 )? )
            {
            // InternalHale.g:6072:1: ( ( rule__Function__Group_4__0 )? )
            // InternalHale.g:6073:2: ( rule__Function__Group_4__0 )?
            {
             before(grammarAccess.getFunctionAccess().getGroup_4()); 
            // InternalHale.g:6074:2: ( rule__Function__Group_4__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_ID||LA41_0==51) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalHale.g:6074:3: rule__Function__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Function__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__4__Impl"


    // $ANTLR start "rule__Function__Group__5"
    // InternalHale.g:6082:1: rule__Function__Group__5 : rule__Function__Group__5__Impl rule__Function__Group__6 ;
    public final void rule__Function__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6086:1: ( rule__Function__Group__5__Impl rule__Function__Group__6 )
            // InternalHale.g:6087:2: rule__Function__Group__5__Impl rule__Function__Group__6
            {
            pushFollow(FOLLOW_62);
            rule__Function__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__5"


    // $ANTLR start "rule__Function__Group__5__Impl"
    // InternalHale.g:6094:1: rule__Function__Group__5__Impl : ( ')' ) ;
    public final void rule__Function__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6098:1: ( ( ')' ) )
            // InternalHale.g:6099:1: ( ')' )
            {
            // InternalHale.g:6099:1: ( ')' )
            // InternalHale.g:6100:2: ')'
            {
             before(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_5()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__5__Impl"


    // $ANTLR start "rule__Function__Group__6"
    // InternalHale.g:6109:1: rule__Function__Group__6 : rule__Function__Group__6__Impl rule__Function__Group__7 ;
    public final void rule__Function__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6113:1: ( rule__Function__Group__6__Impl rule__Function__Group__7 )
            // InternalHale.g:6114:2: rule__Function__Group__6__Impl rule__Function__Group__7
            {
            pushFollow(FOLLOW_62);
            rule__Function__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__6"


    // $ANTLR start "rule__Function__Group__6__Impl"
    // InternalHale.g:6121:1: rule__Function__Group__6__Impl : ( ( rule__Function__ReturnTypeAssignment_6 )? ) ;
    public final void rule__Function__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6125:1: ( ( ( rule__Function__ReturnTypeAssignment_6 )? ) )
            // InternalHale.g:6126:1: ( ( rule__Function__ReturnTypeAssignment_6 )? )
            {
            // InternalHale.g:6126:1: ( ( rule__Function__ReturnTypeAssignment_6 )? )
            // InternalHale.g:6127:2: ( rule__Function__ReturnTypeAssignment_6 )?
            {
             before(grammarAccess.getFunctionAccess().getReturnTypeAssignment_6()); 
            // InternalHale.g:6128:2: ( rule__Function__ReturnTypeAssignment_6 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==36) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalHale.g:6128:3: rule__Function__ReturnTypeAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Function__ReturnTypeAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionAccess().getReturnTypeAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__6__Impl"


    // $ANTLR start "rule__Function__Group__7"
    // InternalHale.g:6136:1: rule__Function__Group__7 : rule__Function__Group__7__Impl ;
    public final void rule__Function__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6140:1: ( rule__Function__Group__7__Impl )
            // InternalHale.g:6141:2: rule__Function__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__7"


    // $ANTLR start "rule__Function__Group__7__Impl"
    // InternalHale.g:6147:1: rule__Function__Group__7__Impl : ( ( rule__Function__BodyAssignment_7 ) ) ;
    public final void rule__Function__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6151:1: ( ( ( rule__Function__BodyAssignment_7 ) ) )
            // InternalHale.g:6152:1: ( ( rule__Function__BodyAssignment_7 ) )
            {
            // InternalHale.g:6152:1: ( ( rule__Function__BodyAssignment_7 ) )
            // InternalHale.g:6153:2: ( rule__Function__BodyAssignment_7 )
            {
             before(grammarAccess.getFunctionAccess().getBodyAssignment_7()); 
            // InternalHale.g:6154:2: ( rule__Function__BodyAssignment_7 )
            // InternalHale.g:6154:3: rule__Function__BodyAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Function__BodyAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getBodyAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__7__Impl"


    // $ANTLR start "rule__Function__Group_4__0"
    // InternalHale.g:6163:1: rule__Function__Group_4__0 : rule__Function__Group_4__0__Impl rule__Function__Group_4__1 ;
    public final void rule__Function__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6167:1: ( rule__Function__Group_4__0__Impl rule__Function__Group_4__1 )
            // InternalHale.g:6168:2: rule__Function__Group_4__0__Impl rule__Function__Group_4__1
            {
            pushFollow(FOLLOW_38);
            rule__Function__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_4__0"


    // $ANTLR start "rule__Function__Group_4__0__Impl"
    // InternalHale.g:6175:1: rule__Function__Group_4__0__Impl : ( ( rule__Function__ParametersAssignment_4_0 ) ) ;
    public final void rule__Function__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6179:1: ( ( ( rule__Function__ParametersAssignment_4_0 ) ) )
            // InternalHale.g:6180:1: ( ( rule__Function__ParametersAssignment_4_0 ) )
            {
            // InternalHale.g:6180:1: ( ( rule__Function__ParametersAssignment_4_0 ) )
            // InternalHale.g:6181:2: ( rule__Function__ParametersAssignment_4_0 )
            {
             before(grammarAccess.getFunctionAccess().getParametersAssignment_4_0()); 
            // InternalHale.g:6182:2: ( rule__Function__ParametersAssignment_4_0 )
            // InternalHale.g:6182:3: rule__Function__ParametersAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Function__ParametersAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getParametersAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_4__0__Impl"


    // $ANTLR start "rule__Function__Group_4__1"
    // InternalHale.g:6190:1: rule__Function__Group_4__1 : rule__Function__Group_4__1__Impl rule__Function__Group_4__2 ;
    public final void rule__Function__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6194:1: ( rule__Function__Group_4__1__Impl rule__Function__Group_4__2 )
            // InternalHale.g:6195:2: rule__Function__Group_4__1__Impl rule__Function__Group_4__2
            {
            pushFollow(FOLLOW_38);
            rule__Function__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_4__1"


    // $ANTLR start "rule__Function__Group_4__1__Impl"
    // InternalHale.g:6202:1: rule__Function__Group_4__1__Impl : ( ( rule__Function__Group_4_1__0 )* ) ;
    public final void rule__Function__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6206:1: ( ( ( rule__Function__Group_4_1__0 )* ) )
            // InternalHale.g:6207:1: ( ( rule__Function__Group_4_1__0 )* )
            {
            // InternalHale.g:6207:1: ( ( rule__Function__Group_4_1__0 )* )
            // InternalHale.g:6208:2: ( rule__Function__Group_4_1__0 )*
            {
             before(grammarAccess.getFunctionAccess().getGroup_4_1()); 
            // InternalHale.g:6209:2: ( rule__Function__Group_4_1__0 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==34) ) {
                    int LA43_1 = input.LA(2);

                    if ( (LA43_1==RULE_ID||LA43_1==51) ) {
                        alt43=1;
                    }


                }


                switch (alt43) {
            	case 1 :
            	    // InternalHale.g:6209:3: rule__Function__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__Function__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

             after(grammarAccess.getFunctionAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_4__1__Impl"


    // $ANTLR start "rule__Function__Group_4__2"
    // InternalHale.g:6217:1: rule__Function__Group_4__2 : rule__Function__Group_4__2__Impl ;
    public final void rule__Function__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6221:1: ( rule__Function__Group_4__2__Impl )
            // InternalHale.g:6222:2: rule__Function__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_4__2"


    // $ANTLR start "rule__Function__Group_4__2__Impl"
    // InternalHale.g:6228:1: rule__Function__Group_4__2__Impl : ( ( ',' )? ) ;
    public final void rule__Function__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6232:1: ( ( ( ',' )? ) )
            // InternalHale.g:6233:1: ( ( ',' )? )
            {
            // InternalHale.g:6233:1: ( ( ',' )? )
            // InternalHale.g:6234:2: ( ',' )?
            {
             before(grammarAccess.getFunctionAccess().getCommaKeyword_4_2()); 
            // InternalHale.g:6235:2: ( ',' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==34) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalHale.g:6235:3: ','
                    {
                    match(input,34,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getFunctionAccess().getCommaKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_4__2__Impl"


    // $ANTLR start "rule__Function__Group_4_1__0"
    // InternalHale.g:6244:1: rule__Function__Group_4_1__0 : rule__Function__Group_4_1__0__Impl rule__Function__Group_4_1__1 ;
    public final void rule__Function__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6248:1: ( rule__Function__Group_4_1__0__Impl rule__Function__Group_4_1__1 )
            // InternalHale.g:6249:2: rule__Function__Group_4_1__0__Impl rule__Function__Group_4_1__1
            {
            pushFollow(FOLLOW_49);
            rule__Function__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_4_1__0"


    // $ANTLR start "rule__Function__Group_4_1__0__Impl"
    // InternalHale.g:6256:1: rule__Function__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__Function__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6260:1: ( ( ',' ) )
            // InternalHale.g:6261:1: ( ',' )
            {
            // InternalHale.g:6261:1: ( ',' )
            // InternalHale.g:6262:2: ','
            {
             before(grammarAccess.getFunctionAccess().getCommaKeyword_4_1_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getCommaKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_4_1__0__Impl"


    // $ANTLR start "rule__Function__Group_4_1__1"
    // InternalHale.g:6271:1: rule__Function__Group_4_1__1 : rule__Function__Group_4_1__1__Impl ;
    public final void rule__Function__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6275:1: ( rule__Function__Group_4_1__1__Impl )
            // InternalHale.g:6276:2: rule__Function__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group_4_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_4_1__1"


    // $ANTLR start "rule__Function__Group_4_1__1__Impl"
    // InternalHale.g:6282:1: rule__Function__Group_4_1__1__Impl : ( ( rule__Function__ParametersAssignment_4_1_1 ) ) ;
    public final void rule__Function__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6286:1: ( ( ( rule__Function__ParametersAssignment_4_1_1 ) ) )
            // InternalHale.g:6287:1: ( ( rule__Function__ParametersAssignment_4_1_1 ) )
            {
            // InternalHale.g:6287:1: ( ( rule__Function__ParametersAssignment_4_1_1 ) )
            // InternalHale.g:6288:2: ( rule__Function__ParametersAssignment_4_1_1 )
            {
             before(grammarAccess.getFunctionAccess().getParametersAssignment_4_1_1()); 
            // InternalHale.g:6289:2: ( rule__Function__ParametersAssignment_4_1_1 )
            // InternalHale.g:6289:3: rule__Function__ParametersAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Function__ParametersAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getParametersAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_4_1__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalHale.g:6298:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6302:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalHale.g:6303:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_49);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // InternalHale.g:6310:1: rule__Parameter__Group__0__Impl : ( () ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6314:1: ( ( () ) )
            // InternalHale.g:6315:1: ( () )
            {
            // InternalHale.g:6315:1: ( () )
            // InternalHale.g:6316:2: ()
            {
             before(grammarAccess.getParameterAccess().getParameterAction_0()); 
            // InternalHale.g:6317:2: ()
            // InternalHale.g:6317:3: 
            {
            }

             after(grammarAccess.getParameterAccess().getParameterAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // InternalHale.g:6325:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6329:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalHale.g:6330:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_49);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // InternalHale.g:6337:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__MutableAssignment_1 )? ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6341:1: ( ( ( rule__Parameter__MutableAssignment_1 )? ) )
            // InternalHale.g:6342:1: ( ( rule__Parameter__MutableAssignment_1 )? )
            {
            // InternalHale.g:6342:1: ( ( rule__Parameter__MutableAssignment_1 )? )
            // InternalHale.g:6343:2: ( rule__Parameter__MutableAssignment_1 )?
            {
             before(grammarAccess.getParameterAccess().getMutableAssignment_1()); 
            // InternalHale.g:6344:2: ( rule__Parameter__MutableAssignment_1 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==51) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalHale.g:6344:3: rule__Parameter__MutableAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parameter__MutableAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterAccess().getMutableAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__2"
    // InternalHale.g:6352:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6356:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // InternalHale.g:6357:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
            {
            pushFollow(FOLLOW_44);
            rule__Parameter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2"


    // $ANTLR start "rule__Parameter__Group__2__Impl"
    // InternalHale.g:6364:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__NameAssignment_2 ) ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6368:1: ( ( ( rule__Parameter__NameAssignment_2 ) ) )
            // InternalHale.g:6369:1: ( ( rule__Parameter__NameAssignment_2 ) )
            {
            // InternalHale.g:6369:1: ( ( rule__Parameter__NameAssignment_2 ) )
            // InternalHale.g:6370:2: ( rule__Parameter__NameAssignment_2 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_2()); 
            // InternalHale.g:6371:2: ( rule__Parameter__NameAssignment_2 )
            // InternalHale.g:6371:3: rule__Parameter__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2__Impl"


    // $ANTLR start "rule__Parameter__Group__3"
    // InternalHale.g:6379:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6383:1: ( rule__Parameter__Group__3__Impl )
            // InternalHale.g:6384:2: rule__Parameter__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__3"


    // $ANTLR start "rule__Parameter__Group__3__Impl"
    // InternalHale.g:6390:1: rule__Parameter__Group__3__Impl : ( ( rule__Parameter__TypeAssignment_3 ) ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6394:1: ( ( ( rule__Parameter__TypeAssignment_3 ) ) )
            // InternalHale.g:6395:1: ( ( rule__Parameter__TypeAssignment_3 ) )
            {
            // InternalHale.g:6395:1: ( ( rule__Parameter__TypeAssignment_3 ) )
            // InternalHale.g:6396:2: ( rule__Parameter__TypeAssignment_3 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_3()); 
            // InternalHale.g:6397:2: ( rule__Parameter__TypeAssignment_3 )
            // InternalHale.g:6397:3: rule__Parameter__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__3__Impl"


    // $ANTLR start "rule__Return__Group__0"
    // InternalHale.g:6406:1: rule__Return__Group__0 : rule__Return__Group__0__Impl rule__Return__Group__1 ;
    public final void rule__Return__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6410:1: ( rule__Return__Group__0__Impl rule__Return__Group__1 )
            // InternalHale.g:6411:2: rule__Return__Group__0__Impl rule__Return__Group__1
            {
            pushFollow(FOLLOW_63);
            rule__Return__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Return__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Return__Group__0"


    // $ANTLR start "rule__Return__Group__0__Impl"
    // InternalHale.g:6418:1: rule__Return__Group__0__Impl : ( () ) ;
    public final void rule__Return__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6422:1: ( ( () ) )
            // InternalHale.g:6423:1: ( () )
            {
            // InternalHale.g:6423:1: ( () )
            // InternalHale.g:6424:2: ()
            {
             before(grammarAccess.getReturnAccess().getReturnAction_0()); 
            // InternalHale.g:6425:2: ()
            // InternalHale.g:6425:3: 
            {
            }

             after(grammarAccess.getReturnAccess().getReturnAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Return__Group__0__Impl"


    // $ANTLR start "rule__Return__Group__1"
    // InternalHale.g:6433:1: rule__Return__Group__1 : rule__Return__Group__1__Impl rule__Return__Group__2 ;
    public final void rule__Return__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6437:1: ( rule__Return__Group__1__Impl rule__Return__Group__2 )
            // InternalHale.g:6438:2: rule__Return__Group__1__Impl rule__Return__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Return__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Return__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Return__Group__1"


    // $ANTLR start "rule__Return__Group__1__Impl"
    // InternalHale.g:6445:1: rule__Return__Group__1__Impl : ( 'return' ) ;
    public final void rule__Return__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6449:1: ( ( 'return' ) )
            // InternalHale.g:6450:1: ( 'return' )
            {
            // InternalHale.g:6450:1: ( 'return' )
            // InternalHale.g:6451:2: 'return'
            {
             before(grammarAccess.getReturnAccess().getReturnKeyword_1()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getReturnAccess().getReturnKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Return__Group__1__Impl"


    // $ANTLR start "rule__Return__Group__2"
    // InternalHale.g:6460:1: rule__Return__Group__2 : rule__Return__Group__2__Impl ;
    public final void rule__Return__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6464:1: ( rule__Return__Group__2__Impl )
            // InternalHale.g:6465:2: rule__Return__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Return__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Return__Group__2"


    // $ANTLR start "rule__Return__Group__2__Impl"
    // InternalHale.g:6471:1: rule__Return__Group__2__Impl : ( ( rule__Return__ExpressionAssignment_2 )? ) ;
    public final void rule__Return__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6475:1: ( ( ( rule__Return__ExpressionAssignment_2 )? ) )
            // InternalHale.g:6476:1: ( ( rule__Return__ExpressionAssignment_2 )? )
            {
            // InternalHale.g:6476:1: ( ( rule__Return__ExpressionAssignment_2 )? )
            // InternalHale.g:6477:2: ( rule__Return__ExpressionAssignment_2 )?
            {
             before(grammarAccess.getReturnAccess().getExpressionAssignment_2()); 
            // InternalHale.g:6478:2: ( rule__Return__ExpressionAssignment_2 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=RULE_BOOLEAN && LA46_0<=RULE_STRING)||LA46_0==RULE_ID||LA46_0==25||(LA46_0>=31 && LA46_0<=32)||LA46_0==35||LA46_0==41) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalHale.g:6478:3: rule__Return__ExpressionAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Return__ExpressionAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReturnAccess().getExpressionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Return__Group__2__Impl"


    // $ANTLR start "rule__Throw__Group__0"
    // InternalHale.g:6487:1: rule__Throw__Group__0 : rule__Throw__Group__0__Impl rule__Throw__Group__1 ;
    public final void rule__Throw__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6491:1: ( rule__Throw__Group__0__Impl rule__Throw__Group__1 )
            // InternalHale.g:6492:2: rule__Throw__Group__0__Impl rule__Throw__Group__1
            {
            pushFollow(FOLLOW_64);
            rule__Throw__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Throw__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Throw__Group__0"


    // $ANTLR start "rule__Throw__Group__0__Impl"
    // InternalHale.g:6499:1: rule__Throw__Group__0__Impl : ( () ) ;
    public final void rule__Throw__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6503:1: ( ( () ) )
            // InternalHale.g:6504:1: ( () )
            {
            // InternalHale.g:6504:1: ( () )
            // InternalHale.g:6505:2: ()
            {
             before(grammarAccess.getThrowAccess().getThrowAction_0()); 
            // InternalHale.g:6506:2: ()
            // InternalHale.g:6506:3: 
            {
            }

             after(grammarAccess.getThrowAccess().getThrowAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Throw__Group__0__Impl"


    // $ANTLR start "rule__Throw__Group__1"
    // InternalHale.g:6514:1: rule__Throw__Group__1 : rule__Throw__Group__1__Impl rule__Throw__Group__2 ;
    public final void rule__Throw__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6518:1: ( rule__Throw__Group__1__Impl rule__Throw__Group__2 )
            // InternalHale.g:6519:2: rule__Throw__Group__1__Impl rule__Throw__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Throw__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Throw__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Throw__Group__1"


    // $ANTLR start "rule__Throw__Group__1__Impl"
    // InternalHale.g:6526:1: rule__Throw__Group__1__Impl : ( 'throw' ) ;
    public final void rule__Throw__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6530:1: ( ( 'throw' ) )
            // InternalHale.g:6531:1: ( 'throw' )
            {
            // InternalHale.g:6531:1: ( 'throw' )
            // InternalHale.g:6532:2: 'throw'
            {
             before(grammarAccess.getThrowAccess().getThrowKeyword_1()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getThrowAccess().getThrowKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Throw__Group__1__Impl"


    // $ANTLR start "rule__Throw__Group__2"
    // InternalHale.g:6541:1: rule__Throw__Group__2 : rule__Throw__Group__2__Impl ;
    public final void rule__Throw__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6545:1: ( rule__Throw__Group__2__Impl )
            // InternalHale.g:6546:2: rule__Throw__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Throw__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Throw__Group__2"


    // $ANTLR start "rule__Throw__Group__2__Impl"
    // InternalHale.g:6552:1: rule__Throw__Group__2__Impl : ( ( rule__Throw__ExpressionAssignment_2 )? ) ;
    public final void rule__Throw__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6556:1: ( ( ( rule__Throw__ExpressionAssignment_2 )? ) )
            // InternalHale.g:6557:1: ( ( rule__Throw__ExpressionAssignment_2 )? )
            {
            // InternalHale.g:6557:1: ( ( rule__Throw__ExpressionAssignment_2 )? )
            // InternalHale.g:6558:2: ( rule__Throw__ExpressionAssignment_2 )?
            {
             before(grammarAccess.getThrowAccess().getExpressionAssignment_2()); 
            // InternalHale.g:6559:2: ( rule__Throw__ExpressionAssignment_2 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=RULE_BOOLEAN && LA47_0<=RULE_STRING)||LA47_0==RULE_ID||LA47_0==25||(LA47_0>=31 && LA47_0<=32)||LA47_0==35||LA47_0==41) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalHale.g:6559:3: rule__Throw__ExpressionAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Throw__ExpressionAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getThrowAccess().getExpressionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Throw__Group__2__Impl"


    // $ANTLR start "rule__Hale__MainBlockAssignment_1"
    // InternalHale.g:6568:1: rule__Hale__MainBlockAssignment_1 : ( ruleBlock ) ;
    public final void rule__Hale__MainBlockAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6572:1: ( ( ruleBlock ) )
            // InternalHale.g:6573:2: ( ruleBlock )
            {
            // InternalHale.g:6573:2: ( ruleBlock )
            // InternalHale.g:6574:3: ruleBlock
            {
             before(grammarAccess.getHaleAccess().getMainBlockBlockParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getHaleAccess().getMainBlockBlockParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hale__MainBlockAssignment_1"


    // $ANTLR start "rule__Block__StatementsAssignment_1_0"
    // InternalHale.g:6583:1: rule__Block__StatementsAssignment_1_0 : ( ruleStatement ) ;
    public final void rule__Block__StatementsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6587:1: ( ( ruleStatement ) )
            // InternalHale.g:6588:2: ( ruleStatement )
            {
            // InternalHale.g:6588:2: ( ruleStatement )
            // InternalHale.g:6589:3: ruleStatement
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


    // $ANTLR start "rule__Expression10__RightAssignment_1_2"
    // InternalHale.g:6598:1: rule__Expression10__RightAssignment_1_2 : ( ruleExpression9 ) ;
    public final void rule__Expression10__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6602:1: ( ( ruleExpression9 ) )
            // InternalHale.g:6603:2: ( ruleExpression9 )
            {
            // InternalHale.g:6603:2: ( ruleExpression9 )
            // InternalHale.g:6604:3: ruleExpression9
            {
             before(grammarAccess.getExpression10Access().getRightExpression9ParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression9();

            state._fsp--;

             after(grammarAccess.getExpression10Access().getRightExpression9ParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression10__RightAssignment_1_2"


    // $ANTLR start "rule__Expression9__RightAssignment_1_0_2"
    // InternalHale.g:6613:1: rule__Expression9__RightAssignment_1_0_2 : ( ruleExpression8 ) ;
    public final void rule__Expression9__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6617:1: ( ( ruleExpression8 ) )
            // InternalHale.g:6618:2: ( ruleExpression8 )
            {
            // InternalHale.g:6618:2: ( ruleExpression8 )
            // InternalHale.g:6619:3: ruleExpression8
            {
             before(grammarAccess.getExpression9Access().getRightExpression8ParserRuleCall_1_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression8();

            state._fsp--;

             after(grammarAccess.getExpression9Access().getRightExpression8ParserRuleCall_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression9__RightAssignment_1_0_2"


    // $ANTLR start "rule__Expression9__RightAssignment_1_1_2"
    // InternalHale.g:6628:1: rule__Expression9__RightAssignment_1_1_2 : ( ruleExpression8 ) ;
    public final void rule__Expression9__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6632:1: ( ( ruleExpression8 ) )
            // InternalHale.g:6633:2: ( ruleExpression8 )
            {
            // InternalHale.g:6633:2: ( ruleExpression8 )
            // InternalHale.g:6634:3: ruleExpression8
            {
             before(grammarAccess.getExpression9Access().getRightExpression8ParserRuleCall_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression8();

            state._fsp--;

             after(grammarAccess.getExpression9Access().getRightExpression8ParserRuleCall_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression9__RightAssignment_1_1_2"


    // $ANTLR start "rule__Expression8__RightAssignment_1_0_2"
    // InternalHale.g:6643:1: rule__Expression8__RightAssignment_1_0_2 : ( ruleExpression7 ) ;
    public final void rule__Expression8__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6647:1: ( ( ruleExpression7 ) )
            // InternalHale.g:6648:2: ( ruleExpression7 )
            {
            // InternalHale.g:6648:2: ( ruleExpression7 )
            // InternalHale.g:6649:3: ruleExpression7
            {
             before(grammarAccess.getExpression8Access().getRightExpression7ParserRuleCall_1_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression7();

            state._fsp--;

             after(grammarAccess.getExpression8Access().getRightExpression7ParserRuleCall_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression8__RightAssignment_1_0_2"


    // $ANTLR start "rule__Expression8__RightAssignment_1_1_2"
    // InternalHale.g:6658:1: rule__Expression8__RightAssignment_1_1_2 : ( ruleExpression7 ) ;
    public final void rule__Expression8__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6662:1: ( ( ruleExpression7 ) )
            // InternalHale.g:6663:2: ( ruleExpression7 )
            {
            // InternalHale.g:6663:2: ( ruleExpression7 )
            // InternalHale.g:6664:3: ruleExpression7
            {
             before(grammarAccess.getExpression8Access().getRightExpression7ParserRuleCall_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression7();

            state._fsp--;

             after(grammarAccess.getExpression8Access().getRightExpression7ParserRuleCall_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression8__RightAssignment_1_1_2"


    // $ANTLR start "rule__Expression7__RightAssignment_1_0_2"
    // InternalHale.g:6673:1: rule__Expression7__RightAssignment_1_0_2 : ( ruleExpression6 ) ;
    public final void rule__Expression7__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6677:1: ( ( ruleExpression6 ) )
            // InternalHale.g:6678:2: ( ruleExpression6 )
            {
            // InternalHale.g:6678:2: ( ruleExpression6 )
            // InternalHale.g:6679:3: ruleExpression6
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
    // InternalHale.g:6688:1: rule__Expression7__RightAssignment_1_1_2 : ( ruleExpression6 ) ;
    public final void rule__Expression7__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6692:1: ( ( ruleExpression6 ) )
            // InternalHale.g:6693:2: ( ruleExpression6 )
            {
            // InternalHale.g:6693:2: ( ruleExpression6 )
            // InternalHale.g:6694:3: ruleExpression6
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


    // $ANTLR start "rule__Expression7__RightAssignment_1_2_2"
    // InternalHale.g:6703:1: rule__Expression7__RightAssignment_1_2_2 : ( ruleExpression6 ) ;
    public final void rule__Expression7__RightAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6707:1: ( ( ruleExpression6 ) )
            // InternalHale.g:6708:2: ( ruleExpression6 )
            {
            // InternalHale.g:6708:2: ( ruleExpression6 )
            // InternalHale.g:6709:3: ruleExpression6
            {
             before(grammarAccess.getExpression7Access().getRightExpression6ParserRuleCall_1_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression6();

            state._fsp--;

             after(grammarAccess.getExpression7Access().getRightExpression6ParserRuleCall_1_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression7__RightAssignment_1_2_2"


    // $ANTLR start "rule__Expression7__RightAssignment_1_3_2"
    // InternalHale.g:6718:1: rule__Expression7__RightAssignment_1_3_2 : ( ruleExpression6 ) ;
    public final void rule__Expression7__RightAssignment_1_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6722:1: ( ( ruleExpression6 ) )
            // InternalHale.g:6723:2: ( ruleExpression6 )
            {
            // InternalHale.g:6723:2: ( ruleExpression6 )
            // InternalHale.g:6724:3: ruleExpression6
            {
             before(grammarAccess.getExpression7Access().getRightExpression6ParserRuleCall_1_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression6();

            state._fsp--;

             after(grammarAccess.getExpression7Access().getRightExpression6ParserRuleCall_1_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression7__RightAssignment_1_3_2"


    // $ANTLR start "rule__Expression6__RightAssignment_1_0_2"
    // InternalHale.g:6733:1: rule__Expression6__RightAssignment_1_0_2 : ( ruleExpression5 ) ;
    public final void rule__Expression6__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6737:1: ( ( ruleExpression5 ) )
            // InternalHale.g:6738:2: ( ruleExpression5 )
            {
            // InternalHale.g:6738:2: ( ruleExpression5 )
            // InternalHale.g:6739:3: ruleExpression5
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
    // InternalHale.g:6748:1: rule__Expression6__RightAssignment_1_1_2 : ( ruleExpression5 ) ;
    public final void rule__Expression6__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6752:1: ( ( ruleExpression5 ) )
            // InternalHale.g:6753:2: ( ruleExpression5 )
            {
            // InternalHale.g:6753:2: ( ruleExpression5 )
            // InternalHale.g:6754:3: ruleExpression5
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
    // InternalHale.g:6763:1: rule__Expression5__RightAssignment_1_0_2 : ( ruleExpression4 ) ;
    public final void rule__Expression5__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6767:1: ( ( ruleExpression4 ) )
            // InternalHale.g:6768:2: ( ruleExpression4 )
            {
            // InternalHale.g:6768:2: ( ruleExpression4 )
            // InternalHale.g:6769:3: ruleExpression4
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
    // InternalHale.g:6778:1: rule__Expression5__RightAssignment_1_1_2 : ( ruleExpression4 ) ;
    public final void rule__Expression5__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6782:1: ( ( ruleExpression4 ) )
            // InternalHale.g:6783:2: ( ruleExpression4 )
            {
            // InternalHale.g:6783:2: ( ruleExpression4 )
            // InternalHale.g:6784:3: ruleExpression4
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
    // InternalHale.g:6793:1: rule__Expression5__RightAssignment_1_2_2 : ( ruleExpression4 ) ;
    public final void rule__Expression5__RightAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6797:1: ( ( ruleExpression4 ) )
            // InternalHale.g:6798:2: ( ruleExpression4 )
            {
            // InternalHale.g:6798:2: ( ruleExpression4 )
            // InternalHale.g:6799:3: ruleExpression4
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


    // $ANTLR start "rule__Expression4__RightAssignment_1_2"
    // InternalHale.g:6808:1: rule__Expression4__RightAssignment_1_2 : ( ruleExpression3 ) ;
    public final void rule__Expression4__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6812:1: ( ( ruleExpression3 ) )
            // InternalHale.g:6813:2: ( ruleExpression3 )
            {
            // InternalHale.g:6813:2: ( ruleExpression3 )
            // InternalHale.g:6814:3: ruleExpression3
            {
             before(grammarAccess.getExpression4Access().getRightExpression3ParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression3();

            state._fsp--;

             after(grammarAccess.getExpression4Access().getRightExpression3ParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression4__RightAssignment_1_2"


    // $ANTLR start "rule__Expression3__RightAssignment_1_2"
    // InternalHale.g:6823:1: rule__Expression3__RightAssignment_1_2 : ( ruleType ) ;
    public final void rule__Expression3__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6827:1: ( ( ruleType ) )
            // InternalHale.g:6828:2: ( ruleType )
            {
            // InternalHale.g:6828:2: ( ruleType )
            // InternalHale.g:6829:3: ruleType
            {
             before(grammarAccess.getExpression3Access().getRightTypeParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getExpression3Access().getRightTypeParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression3__RightAssignment_1_2"


    // $ANTLR start "rule__Expression2__InnerAssignment_0_2"
    // InternalHale.g:6838:1: rule__Expression2__InnerAssignment_0_2 : ( ruleExpression2 ) ;
    public final void rule__Expression2__InnerAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6842:1: ( ( ruleExpression2 ) )
            // InternalHale.g:6843:2: ( ruleExpression2 )
            {
            // InternalHale.g:6843:2: ( ruleExpression2 )
            // InternalHale.g:6844:3: ruleExpression2
            {
             before(grammarAccess.getExpression2Access().getInnerExpression2ParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression2();

            state._fsp--;

             after(grammarAccess.getExpression2Access().getInnerExpression2ParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression2__InnerAssignment_0_2"


    // $ANTLR start "rule__Expression2__InnerAssignment_1_2"
    // InternalHale.g:6853:1: rule__Expression2__InnerAssignment_1_2 : ( ruleExpression2 ) ;
    public final void rule__Expression2__InnerAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6857:1: ( ( ruleExpression2 ) )
            // InternalHale.g:6858:2: ( ruleExpression2 )
            {
            // InternalHale.g:6858:2: ( ruleExpression2 )
            // InternalHale.g:6859:3: ruleExpression2
            {
             before(grammarAccess.getExpression2Access().getInnerExpression2ParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression2();

            state._fsp--;

             after(grammarAccess.getExpression2Access().getInnerExpression2ParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression2__InnerAssignment_1_2"


    // $ANTLR start "rule__Expression1__ArgumentsAssignment_1_2_0"
    // InternalHale.g:6868:1: rule__Expression1__ArgumentsAssignment_1_2_0 : ( ruleExpression ) ;
    public final void rule__Expression1__ArgumentsAssignment_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6872:1: ( ( ruleExpression ) )
            // InternalHale.g:6873:2: ( ruleExpression )
            {
            // InternalHale.g:6873:2: ( ruleExpression )
            // InternalHale.g:6874:3: ruleExpression
            {
             before(grammarAccess.getExpression1Access().getArgumentsExpressionParserRuleCall_1_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpression1Access().getArgumentsExpressionParserRuleCall_1_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression1__ArgumentsAssignment_1_2_0"


    // $ANTLR start "rule__Expression1__ArgumentsAssignment_1_2_1_1"
    // InternalHale.g:6883:1: rule__Expression1__ArgumentsAssignment_1_2_1_1 : ( ruleExpression ) ;
    public final void rule__Expression1__ArgumentsAssignment_1_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6887:1: ( ( ruleExpression ) )
            // InternalHale.g:6888:2: ( ruleExpression )
            {
            // InternalHale.g:6888:2: ( ruleExpression )
            // InternalHale.g:6889:3: ruleExpression
            {
             before(grammarAccess.getExpression1Access().getArgumentsExpressionParserRuleCall_1_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpression1Access().getArgumentsExpressionParserRuleCall_1_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression1__ArgumentsAssignment_1_2_1_1"


    // $ANTLR start "rule__BooleanLiteral__ValueAssignment"
    // InternalHale.g:6898:1: rule__BooleanLiteral__ValueAssignment : ( RULE_BOOLEAN ) ;
    public final void rule__BooleanLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6902:1: ( ( RULE_BOOLEAN ) )
            // InternalHale.g:6903:2: ( RULE_BOOLEAN )
            {
            // InternalHale.g:6903:2: ( RULE_BOOLEAN )
            // InternalHale.g:6904:3: RULE_BOOLEAN
            {
             before(grammarAccess.getBooleanLiteralAccess().getValueBOOLEANTerminalRuleCall_0()); 
            match(input,RULE_BOOLEAN,FOLLOW_2); 
             after(grammarAccess.getBooleanLiteralAccess().getValueBOOLEANTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanLiteral__ValueAssignment"


    // $ANTLR start "rule__NumberLiteral__ValueAssignment"
    // InternalHale.g:6913:1: rule__NumberLiteral__ValueAssignment : ( RULE_DOUBLE ) ;
    public final void rule__NumberLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6917:1: ( ( RULE_DOUBLE ) )
            // InternalHale.g:6918:2: ( RULE_DOUBLE )
            {
            // InternalHale.g:6918:2: ( RULE_DOUBLE )
            // InternalHale.g:6919:3: RULE_DOUBLE
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
    // InternalHale.g:6928:1: rule__StringLiteral__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6932:1: ( ( RULE_STRING ) )
            // InternalHale.g:6933:2: ( RULE_STRING )
            {
            // InternalHale.g:6933:2: ( RULE_STRING )
            // InternalHale.g:6934:3: RULE_STRING
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


    // $ANTLR start "rule__FunctionType__ParamTypesAssignment_0_3_0"
    // InternalHale.g:6943:1: rule__FunctionType__ParamTypesAssignment_0_3_0 : ( ruleType ) ;
    public final void rule__FunctionType__ParamTypesAssignment_0_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6947:1: ( ( ruleType ) )
            // InternalHale.g:6948:2: ( ruleType )
            {
            // InternalHale.g:6948:2: ( ruleType )
            // InternalHale.g:6949:3: ruleType
            {
             before(grammarAccess.getFunctionTypeAccess().getParamTypesTypeParserRuleCall_0_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getFunctionTypeAccess().getParamTypesTypeParserRuleCall_0_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionType__ParamTypesAssignment_0_3_0"


    // $ANTLR start "rule__FunctionType__ParamTypesAssignment_0_3_1_1"
    // InternalHale.g:6958:1: rule__FunctionType__ParamTypesAssignment_0_3_1_1 : ( ruleType ) ;
    public final void rule__FunctionType__ParamTypesAssignment_0_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6962:1: ( ( ruleType ) )
            // InternalHale.g:6963:2: ( ruleType )
            {
            // InternalHale.g:6963:2: ( ruleType )
            // InternalHale.g:6964:3: ruleType
            {
             before(grammarAccess.getFunctionTypeAccess().getParamTypesTypeParserRuleCall_0_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getFunctionTypeAccess().getParamTypesTypeParserRuleCall_0_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionType__ParamTypesAssignment_0_3_1_1"


    // $ANTLR start "rule__FunctionType__ReturnTypeAssignment_0_5"
    // InternalHale.g:6973:1: rule__FunctionType__ReturnTypeAssignment_0_5 : ( ruleTypeAnnotation ) ;
    public final void rule__FunctionType__ReturnTypeAssignment_0_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6977:1: ( ( ruleTypeAnnotation ) )
            // InternalHale.g:6978:2: ( ruleTypeAnnotation )
            {
            // InternalHale.g:6978:2: ( ruleTypeAnnotation )
            // InternalHale.g:6979:3: ruleTypeAnnotation
            {
             before(grammarAccess.getFunctionTypeAccess().getReturnTypeTypeAnnotationParserRuleCall_0_5_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeAnnotation();

            state._fsp--;

             after(grammarAccess.getFunctionTypeAccess().getReturnTypeTypeAnnotationParserRuleCall_0_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionType__ReturnTypeAssignment_0_5"


    // $ANTLR start "rule__EitherType__RightAssignment_1_2"
    // InternalHale.g:6988:1: rule__EitherType__RightAssignment_1_2 : ( rulePrimaryType ) ;
    public final void rule__EitherType__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6992:1: ( ( rulePrimaryType ) )
            // InternalHale.g:6993:2: ( rulePrimaryType )
            {
            // InternalHale.g:6993:2: ( rulePrimaryType )
            // InternalHale.g:6994:3: rulePrimaryType
            {
             before(grammarAccess.getEitherTypeAccess().getRightPrimaryTypeParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryType();

            state._fsp--;

             after(grammarAccess.getEitherTypeAccess().getRightPrimaryTypeParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EitherType__RightAssignment_1_2"


    // $ANTLR start "rule__PrimitiveType__TypeAssignment_1"
    // InternalHale.g:7003:1: rule__PrimitiveType__TypeAssignment_1 : ( RULE_PRIMITIVE_TYPE ) ;
    public final void rule__PrimitiveType__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:7007:1: ( ( RULE_PRIMITIVE_TYPE ) )
            // InternalHale.g:7008:2: ( RULE_PRIMITIVE_TYPE )
            {
            // InternalHale.g:7008:2: ( RULE_PRIMITIVE_TYPE )
            // InternalHale.g:7009:3: RULE_PRIMITIVE_TYPE
            {
             before(grammarAccess.getPrimitiveTypeAccess().getTypePRIMITIVE_TYPETerminalRuleCall_1_0()); 
            match(input,RULE_PRIMITIVE_TYPE,FOLLOW_2); 
             after(grammarAccess.getPrimitiveTypeAccess().getTypePRIMITIVE_TYPETerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__TypeAssignment_1"


    // $ANTLR start "rule__LetBinding__MutableAssignment_2"
    // InternalHale.g:7018:1: rule__LetBinding__MutableAssignment_2 : ( ( 'mut' ) ) ;
    public final void rule__LetBinding__MutableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:7022:1: ( ( ( 'mut' ) ) )
            // InternalHale.g:7023:2: ( ( 'mut' ) )
            {
            // InternalHale.g:7023:2: ( ( 'mut' ) )
            // InternalHale.g:7024:3: ( 'mut' )
            {
             before(grammarAccess.getLetBindingAccess().getMutableMutKeyword_2_0()); 
            // InternalHale.g:7025:3: ( 'mut' )
            // InternalHale.g:7026:4: 'mut'
            {
             before(grammarAccess.getLetBindingAccess().getMutableMutKeyword_2_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getLetBindingAccess().getMutableMutKeyword_2_0()); 

            }

             after(grammarAccess.getLetBindingAccess().getMutableMutKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetBinding__MutableAssignment_2"


    // $ANTLR start "rule__LetBinding__NameAssignment_3"
    // InternalHale.g:7037:1: rule__LetBinding__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__LetBinding__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:7041:1: ( ( RULE_ID ) )
            // InternalHale.g:7042:2: ( RULE_ID )
            {
            // InternalHale.g:7042:2: ( RULE_ID )
            // InternalHale.g:7043:3: RULE_ID
            {
             before(grammarAccess.getLetBindingAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLetBindingAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetBinding__NameAssignment_3"


    // $ANTLR start "rule__LetBinding__TypeAssignment_4"
    // InternalHale.g:7052:1: rule__LetBinding__TypeAssignment_4 : ( ruleTypeAnnotation ) ;
    public final void rule__LetBinding__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:7056:1: ( ( ruleTypeAnnotation ) )
            // InternalHale.g:7057:2: ( ruleTypeAnnotation )
            {
            // InternalHale.g:7057:2: ( ruleTypeAnnotation )
            // InternalHale.g:7058:3: ruleTypeAnnotation
            {
             before(grammarAccess.getLetBindingAccess().getTypeTypeAnnotationParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeAnnotation();

            state._fsp--;

             after(grammarAccess.getLetBindingAccess().getTypeTypeAnnotationParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetBinding__TypeAssignment_4"


    // $ANTLR start "rule__LetBinding__ExpressionAssignment_6"
    // InternalHale.g:7067:1: rule__LetBinding__ExpressionAssignment_6 : ( ruleExpression ) ;
    public final void rule__LetBinding__ExpressionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:7071:1: ( ( ruleExpression ) )
            // InternalHale.g:7072:2: ( ruleExpression )
            {
            // InternalHale.g:7072:2: ( ruleExpression )
            // InternalHale.g:7073:3: ruleExpression
            {
             before(grammarAccess.getLetBindingAccess().getExpressionExpressionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getLetBindingAccess().getExpressionExpressionParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetBinding__ExpressionAssignment_6"


    // $ANTLR start "rule__BindingReference__BindingAssignment"
    // InternalHale.g:7082:1: rule__BindingReference__BindingAssignment : ( ( RULE_ID ) ) ;
    public final void rule__BindingReference__BindingAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:7086:1: ( ( ( RULE_ID ) ) )
            // InternalHale.g:7087:2: ( ( RULE_ID ) )
            {
            // InternalHale.g:7087:2: ( ( RULE_ID ) )
            // InternalHale.g:7088:3: ( RULE_ID )
            {
             before(grammarAccess.getBindingReferenceAccess().getBindingBindingCrossReference_0()); 
            // InternalHale.g:7089:3: ( RULE_ID )
            // InternalHale.g:7090:4: RULE_ID
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
    // InternalHale.g:7101:1: rule__Assignment__BindingAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Assignment__BindingAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:7105:1: ( ( ( RULE_ID ) ) )
            // InternalHale.g:7106:2: ( ( RULE_ID ) )
            {
            // InternalHale.g:7106:2: ( ( RULE_ID ) )
            // InternalHale.g:7107:3: ( RULE_ID )
            {
             before(grammarAccess.getAssignmentAccess().getBindingBindingCrossReference_0_0()); 
            // InternalHale.g:7108:3: ( RULE_ID )
            // InternalHale.g:7109:4: RULE_ID
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
    // InternalHale.g:7120:1: rule__Assignment__ExpressionAssignment_2 : ( ruleExpression ) ;
    public final void rule__Assignment__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:7124:1: ( ( ruleExpression ) )
            // InternalHale.g:7125:2: ( ruleExpression )
            {
            // InternalHale.g:7125:2: ( ruleExpression )
            // InternalHale.g:7126:3: ruleExpression
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
    // InternalHale.g:7135:1: rule__Print__ExpressionAssignment_1 : ( ruleExpression ) ;
    public final void rule__Print__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:7139:1: ( ( ruleExpression ) )
            // InternalHale.g:7140:2: ( ruleExpression )
            {
            // InternalHale.g:7140:2: ( ruleExpression )
            // InternalHale.g:7141:3: ruleExpression
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


    // $ANTLR start "rule__IfLet__NameAssignment_2"
    // InternalHale.g:7150:1: rule__IfLet__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__IfLet__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:7154:1: ( ( RULE_ID ) )
            // InternalHale.g:7155:2: ( RULE_ID )
            {
            // InternalHale.g:7155:2: ( RULE_ID )
            // InternalHale.g:7156:3: RULE_ID
            {
             before(grammarAccess.getIfLetAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIfLetAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfLet__NameAssignment_2"


    // $ANTLR start "rule__IfLet__TypeAssignment_3"
    // InternalHale.g:7165:1: rule__IfLet__TypeAssignment_3 : ( ruleTypeAnnotation ) ;
    public final void rule__IfLet__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:7169:1: ( ( ruleTypeAnnotation ) )
            // InternalHale.g:7170:2: ( ruleTypeAnnotation )
            {
            // InternalHale.g:7170:2: ( ruleTypeAnnotation )
            // InternalHale.g:7171:3: ruleTypeAnnotation
            {
             before(grammarAccess.getIfLetAccess().getTypeTypeAnnotationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeAnnotation();

            state._fsp--;

             after(grammarAccess.getIfLetAccess().getTypeTypeAnnotationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfLet__TypeAssignment_3"


    // $ANTLR start "rule__IfLet__ExpressionAssignment_5"
    // InternalHale.g:7180:1: rule__IfLet__ExpressionAssignment_5 : ( ruleExpression ) ;
    public final void rule__IfLet__ExpressionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:7184:1: ( ( ruleExpression ) )
            // InternalHale.g:7185:2: ( ruleExpression )
            {
            // InternalHale.g:7185:2: ( ruleExpression )
            // InternalHale.g:7186:3: ruleExpression
            {
             before(grammarAccess.getIfLetAccess().getExpressionExpressionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getIfLetAccess().getExpressionExpressionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfLet__ExpressionAssignment_5"


    // $ANTLR start "rule__IfLet__IfBlockAssignment_6"
    // InternalHale.g:7195:1: rule__IfLet__IfBlockAssignment_6 : ( ruleBracedBlock ) ;
    public final void rule__IfLet__IfBlockAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:7199:1: ( ( ruleBracedBlock ) )
            // InternalHale.g:7200:2: ( ruleBracedBlock )
            {
            // InternalHale.g:7200:2: ( ruleBracedBlock )
            // InternalHale.g:7201:3: ruleBracedBlock
            {
             before(grammarAccess.getIfLetAccess().getIfBlockBracedBlockParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleBracedBlock();

            state._fsp--;

             after(grammarAccess.getIfLetAccess().getIfBlockBracedBlockParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfLet__IfBlockAssignment_6"


    // $ANTLR start "rule__IfLet__ElseLetAssignment_7_1"
    // InternalHale.g:7210:1: rule__IfLet__ElseLetAssignment_7_1 : ( ruleElseLet ) ;
    public final void rule__IfLet__ElseLetAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:7214:1: ( ( ruleElseLet ) )
            // InternalHale.g:7215:2: ( ruleElseLet )
            {
            // InternalHale.g:7215:2: ( ruleElseLet )
            // InternalHale.g:7216:3: ruleElseLet
            {
             before(grammarAccess.getIfLetAccess().getElseLetElseLetParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleElseLet();

            state._fsp--;

             after(grammarAccess.getIfLetAccess().getElseLetElseLetParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfLet__ElseLetAssignment_7_1"


    // $ANTLR start "rule__ElseLet__NameAssignment_1_1"
    // InternalHale.g:7225:1: rule__ElseLet__NameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__ElseLet__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:7229:1: ( ( RULE_ID ) )
            // InternalHale.g:7230:2: ( RULE_ID )
            {
            // InternalHale.g:7230:2: ( RULE_ID )
            // InternalHale.g:7231:3: RULE_ID
            {
             before(grammarAccess.getElseLetAccess().getNameIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getElseLetAccess().getNameIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseLet__NameAssignment_1_1"


    // $ANTLR start "rule__ElseLet__TypeAssignment_1_2"
    // InternalHale.g:7240:1: rule__ElseLet__TypeAssignment_1_2 : ( ruleTypeAnnotation ) ;
    public final void rule__ElseLet__TypeAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:7244:1: ( ( ruleTypeAnnotation ) )
            // InternalHale.g:7245:2: ( ruleTypeAnnotation )
            {
            // InternalHale.g:7245:2: ( ruleTypeAnnotation )
            // InternalHale.g:7246:3: ruleTypeAnnotation
            {
             before(grammarAccess.getElseLetAccess().getTypeTypeAnnotationParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeAnnotation();

            state._fsp--;

             after(grammarAccess.getElseLetAccess().getTypeTypeAnnotationParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseLet__TypeAssignment_1_2"


    // $ANTLR start "rule__ElseLet__ElseBlockAssignment_2"
    // InternalHale.g:7255:1: rule__ElseLet__ElseBlockAssignment_2 : ( ruleBracedBlock ) ;
    public final void rule__ElseLet__ElseBlockAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:7259:1: ( ( ruleBracedBlock ) )
            // InternalHale.g:7260:2: ( ruleBracedBlock )
            {
            // InternalHale.g:7260:2: ( ruleBracedBlock )
            // InternalHale.g:7261:3: ruleBracedBlock
            {
             before(grammarAccess.getElseLetAccess().getElseBlockBracedBlockParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBracedBlock();

            state._fsp--;

             after(grammarAccess.getElseLetAccess().getElseBlockBracedBlockParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseLet__ElseBlockAssignment_2"


    // $ANTLR start "rule__IfConditions__ConditionsAssignment_1"
    // InternalHale.g:7270:1: rule__IfConditions__ConditionsAssignment_1 : ( ruleExpression ) ;
    public final void rule__IfConditions__ConditionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:7274:1: ( ( ruleExpression ) )
            // InternalHale.g:7275:2: ( ruleExpression )
            {
            // InternalHale.g:7275:2: ( ruleExpression )
            // InternalHale.g:7276:3: ruleExpression
            {
             before(grammarAccess.getIfConditionsAccess().getConditionsExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getIfConditionsAccess().getConditionsExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfConditions__ConditionsAssignment_1"


    // $ANTLR start "rule__IfConditions__IfBlocksAssignment_2"
    // InternalHale.g:7285:1: rule__IfConditions__IfBlocksAssignment_2 : ( ruleBracedBlock ) ;
    public final void rule__IfConditions__IfBlocksAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:7289:1: ( ( ruleBracedBlock ) )
            // InternalHale.g:7290:2: ( ruleBracedBlock )
            {
            // InternalHale.g:7290:2: ( ruleBracedBlock )
            // InternalHale.g:7291:3: ruleBracedBlock
            {
             before(grammarAccess.getIfConditionsAccess().getIfBlocksBracedBlockParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBracedBlock();

            state._fsp--;

             after(grammarAccess.getIfConditionsAccess().getIfBlocksBracedBlockParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfConditions__IfBlocksAssignment_2"


    // $ANTLR start "rule__IfConditions__ConditionsAssignment_3_1"
    // InternalHale.g:7300:1: rule__IfConditions__ConditionsAssignment_3_1 : ( ruleExpression ) ;
    public final void rule__IfConditions__ConditionsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:7304:1: ( ( ruleExpression ) )
            // InternalHale.g:7305:2: ( ruleExpression )
            {
            // InternalHale.g:7305:2: ( ruleExpression )
            // InternalHale.g:7306:3: ruleExpression
            {
             before(grammarAccess.getIfConditionsAccess().getConditionsExpressionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getIfConditionsAccess().getConditionsExpressionParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfConditions__ConditionsAssignment_3_1"


    // $ANTLR start "rule__IfConditions__IfBlocksAssignment_3_2"
    // InternalHale.g:7315:1: rule__IfConditions__IfBlocksAssignment_3_2 : ( ruleBracedBlock ) ;
    public final void rule__IfConditions__IfBlocksAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:7319:1: ( ( ruleBracedBlock ) )
            // InternalHale.g:7320:2: ( ruleBracedBlock )
            {
            // InternalHale.g:7320:2: ( ruleBracedBlock )
            // InternalHale.g:7321:3: ruleBracedBlock
            {
             before(grammarAccess.getIfConditionsAccess().getIfBlocksBracedBlockParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBracedBlock();

            state._fsp--;

             after(grammarAccess.getIfConditionsAccess().getIfBlocksBracedBlockParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfConditions__IfBlocksAssignment_3_2"


    // $ANTLR start "rule__IfConditions__ElseBlockAssignment_4_1"
    // InternalHale.g:7330:1: rule__IfConditions__ElseBlockAssignment_4_1 : ( ruleBracedBlock ) ;
    public final void rule__IfConditions__ElseBlockAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:7334:1: ( ( ruleBracedBlock ) )
            // InternalHale.g:7335:2: ( ruleBracedBlock )
            {
            // InternalHale.g:7335:2: ( ruleBracedBlock )
            // InternalHale.g:7336:3: ruleBracedBlock
            {
             before(grammarAccess.getIfConditionsAccess().getElseBlockBracedBlockParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBracedBlock();

            state._fsp--;

             after(grammarAccess.getIfConditionsAccess().getElseBlockBracedBlockParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfConditions__ElseBlockAssignment_4_1"


    // $ANTLR start "rule__While__ConditionAssignment_1"
    // InternalHale.g:7345:1: rule__While__ConditionAssignment_1 : ( ruleExpression ) ;
    public final void rule__While__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:7349:1: ( ( ruleExpression ) )
            // InternalHale.g:7350:2: ( ruleExpression )
            {
            // InternalHale.g:7350:2: ( ruleExpression )
            // InternalHale.g:7351:3: ruleExpression
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
    // InternalHale.g:7360:1: rule__While__BlockAssignment_2 : ( ruleBracedBlock ) ;
    public final void rule__While__BlockAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:7364:1: ( ( ruleBracedBlock ) )
            // InternalHale.g:7365:2: ( ruleBracedBlock )
            {
            // InternalHale.g:7365:2: ( ruleBracedBlock )
            // InternalHale.g:7366:3: ruleBracedBlock
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


    // $ANTLR start "rule__Function__NameAssignment_2"
    // InternalHale.g:7375:1: rule__Function__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Function__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:7379:1: ( ( RULE_ID ) )
            // InternalHale.g:7380:2: ( RULE_ID )
            {
            // InternalHale.g:7380:2: ( RULE_ID )
            // InternalHale.g:7381:3: RULE_ID
            {
             before(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__NameAssignment_2"


    // $ANTLR start "rule__Function__ParametersAssignment_4_0"
    // InternalHale.g:7390:1: rule__Function__ParametersAssignment_4_0 : ( ruleParameter ) ;
    public final void rule__Function__ParametersAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:7394:1: ( ( ruleParameter ) )
            // InternalHale.g:7395:2: ( ruleParameter )
            {
            // InternalHale.g:7395:2: ( ruleParameter )
            // InternalHale.g:7396:3: ruleParameter
            {
             before(grammarAccess.getFunctionAccess().getParametersParameterParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getParametersParameterParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__ParametersAssignment_4_0"


    // $ANTLR start "rule__Function__ParametersAssignment_4_1_1"
    // InternalHale.g:7405:1: rule__Function__ParametersAssignment_4_1_1 : ( ruleParameter ) ;
    public final void rule__Function__ParametersAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:7409:1: ( ( ruleParameter ) )
            // InternalHale.g:7410:2: ( ruleParameter )
            {
            // InternalHale.g:7410:2: ( ruleParameter )
            // InternalHale.g:7411:3: ruleParameter
            {
             before(grammarAccess.getFunctionAccess().getParametersParameterParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getParametersParameterParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__ParametersAssignment_4_1_1"


    // $ANTLR start "rule__Function__ReturnTypeAssignment_6"
    // InternalHale.g:7420:1: rule__Function__ReturnTypeAssignment_6 : ( ruleTypeAnnotation ) ;
    public final void rule__Function__ReturnTypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:7424:1: ( ( ruleTypeAnnotation ) )
            // InternalHale.g:7425:2: ( ruleTypeAnnotation )
            {
            // InternalHale.g:7425:2: ( ruleTypeAnnotation )
            // InternalHale.g:7426:3: ruleTypeAnnotation
            {
             before(grammarAccess.getFunctionAccess().getReturnTypeTypeAnnotationParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeAnnotation();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getReturnTypeTypeAnnotationParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__ReturnTypeAssignment_6"


    // $ANTLR start "rule__Function__BodyAssignment_7"
    // InternalHale.g:7435:1: rule__Function__BodyAssignment_7 : ( ruleBracedBlock ) ;
    public final void rule__Function__BodyAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:7439:1: ( ( ruleBracedBlock ) )
            // InternalHale.g:7440:2: ( ruleBracedBlock )
            {
            // InternalHale.g:7440:2: ( ruleBracedBlock )
            // InternalHale.g:7441:3: ruleBracedBlock
            {
             before(grammarAccess.getFunctionAccess().getBodyBracedBlockParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleBracedBlock();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getBodyBracedBlockParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__BodyAssignment_7"


    // $ANTLR start "rule__Parameter__MutableAssignment_1"
    // InternalHale.g:7450:1: rule__Parameter__MutableAssignment_1 : ( ( 'mut' ) ) ;
    public final void rule__Parameter__MutableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:7454:1: ( ( ( 'mut' ) ) )
            // InternalHale.g:7455:2: ( ( 'mut' ) )
            {
            // InternalHale.g:7455:2: ( ( 'mut' ) )
            // InternalHale.g:7456:3: ( 'mut' )
            {
             before(grammarAccess.getParameterAccess().getMutableMutKeyword_1_0()); 
            // InternalHale.g:7457:3: ( 'mut' )
            // InternalHale.g:7458:4: 'mut'
            {
             before(grammarAccess.getParameterAccess().getMutableMutKeyword_1_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getMutableMutKeyword_1_0()); 

            }

             after(grammarAccess.getParameterAccess().getMutableMutKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__MutableAssignment_1"


    // $ANTLR start "rule__Parameter__NameAssignment_2"
    // InternalHale.g:7469:1: rule__Parameter__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:7473:1: ( ( RULE_ID ) )
            // InternalHale.g:7474:2: ( RULE_ID )
            {
            // InternalHale.g:7474:2: ( RULE_ID )
            // InternalHale.g:7475:3: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__NameAssignment_2"


    // $ANTLR start "rule__Parameter__TypeAssignment_3"
    // InternalHale.g:7484:1: rule__Parameter__TypeAssignment_3 : ( ruleTypeAnnotation ) ;
    public final void rule__Parameter__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:7488:1: ( ( ruleTypeAnnotation ) )
            // InternalHale.g:7489:2: ( ruleTypeAnnotation )
            {
            // InternalHale.g:7489:2: ( ruleTypeAnnotation )
            // InternalHale.g:7490:3: ruleTypeAnnotation
            {
             before(grammarAccess.getParameterAccess().getTypeTypeAnnotationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeAnnotation();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getTypeTypeAnnotationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__TypeAssignment_3"


    // $ANTLR start "rule__Return__ExpressionAssignment_2"
    // InternalHale.g:7499:1: rule__Return__ExpressionAssignment_2 : ( ruleExpression ) ;
    public final void rule__Return__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:7503:1: ( ( ruleExpression ) )
            // InternalHale.g:7504:2: ( ruleExpression )
            {
            // InternalHale.g:7504:2: ( ruleExpression )
            // InternalHale.g:7505:3: ruleExpression
            {
             before(grammarAccess.getReturnAccess().getExpressionExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getReturnAccess().getExpressionExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Return__ExpressionAssignment_2"


    // $ANTLR start "rule__Throw__ExpressionAssignment_2"
    // InternalHale.g:7514:1: rule__Throw__ExpressionAssignment_2 : ( ruleExpression ) ;
    public final void rule__Throw__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:7518:1: ( ( ruleExpression ) )
            // InternalHale.g:7519:2: ( ruleExpression )
            {
            // InternalHale.g:7519:2: ( ruleExpression )
            // InternalHale.g:7520:3: ruleExpression
            {
             before(grammarAccess.getThrowAccess().getExpressionExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getThrowAccess().getExpressionExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Throw__ExpressionAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0007CE8982003170L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0007CE8982003172L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0007CE8982002170L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000F00000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000F00002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000000001C000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000000001C000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000002100000080L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0007CE8B82002170L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000002300000080L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0008000000000100L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000011000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000008000002000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0008000200000100L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000001000002000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0004000000000000L});

}