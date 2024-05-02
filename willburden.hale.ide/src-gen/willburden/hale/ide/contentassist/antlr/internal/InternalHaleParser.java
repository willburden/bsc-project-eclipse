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


    // $ANTLR start "entryRuleBinding"
    // InternalHale.g:728:1: entryRuleBinding : ruleBinding EOF ;
    public final void entryRuleBinding() throws RecognitionException {
        try {
            // InternalHale.g:729:1: ( ruleBinding EOF )
            // InternalHale.g:730:1: ruleBinding EOF
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
    // InternalHale.g:737:1: ruleBinding : ( ( rule__Binding__NameAssignment ) ) ;
    public final void ruleBinding() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:741:2: ( ( ( rule__Binding__NameAssignment ) ) )
            // InternalHale.g:742:2: ( ( rule__Binding__NameAssignment ) )
            {
            // InternalHale.g:742:2: ( ( rule__Binding__NameAssignment ) )
            // InternalHale.g:743:3: ( rule__Binding__NameAssignment )
            {
             before(grammarAccess.getBindingAccess().getNameAssignment()); 
            // InternalHale.g:744:3: ( rule__Binding__NameAssignment )
            // InternalHale.g:744:4: rule__Binding__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Binding__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBindingAccess().getNameAssignment()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleLetBinding"
    // InternalHale.g:753:1: entryRuleLetBinding : ruleLetBinding EOF ;
    public final void entryRuleLetBinding() throws RecognitionException {
        try {
            // InternalHale.g:754:1: ( ruleLetBinding EOF )
            // InternalHale.g:755:1: ruleLetBinding EOF
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
    // InternalHale.g:762:1: ruleLetBinding : ( ( rule__LetBinding__Group__0 ) ) ;
    public final void ruleLetBinding() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:766:2: ( ( ( rule__LetBinding__Group__0 ) ) )
            // InternalHale.g:767:2: ( ( rule__LetBinding__Group__0 ) )
            {
            // InternalHale.g:767:2: ( ( rule__LetBinding__Group__0 ) )
            // InternalHale.g:768:3: ( rule__LetBinding__Group__0 )
            {
             before(grammarAccess.getLetBindingAccess().getGroup()); 
            // InternalHale.g:769:3: ( rule__LetBinding__Group__0 )
            // InternalHale.g:769:4: rule__LetBinding__Group__0
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
    // InternalHale.g:778:1: entryRuleBindingReference : ruleBindingReference EOF ;
    public final void entryRuleBindingReference() throws RecognitionException {
        try {
            // InternalHale.g:779:1: ( ruleBindingReference EOF )
            // InternalHale.g:780:1: ruleBindingReference EOF
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
    // InternalHale.g:787:1: ruleBindingReference : ( ( rule__BindingReference__BindingAssignment ) ) ;
    public final void ruleBindingReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:791:2: ( ( ( rule__BindingReference__BindingAssignment ) ) )
            // InternalHale.g:792:2: ( ( rule__BindingReference__BindingAssignment ) )
            {
            // InternalHale.g:792:2: ( ( rule__BindingReference__BindingAssignment ) )
            // InternalHale.g:793:3: ( rule__BindingReference__BindingAssignment )
            {
             before(grammarAccess.getBindingReferenceAccess().getBindingAssignment()); 
            // InternalHale.g:794:3: ( rule__BindingReference__BindingAssignment )
            // InternalHale.g:794:4: rule__BindingReference__BindingAssignment
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
    // InternalHale.g:803:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // InternalHale.g:804:1: ( ruleAssignment EOF )
            // InternalHale.g:805:1: ruleAssignment EOF
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
    // InternalHale.g:812:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:816:2: ( ( ( rule__Assignment__Group__0 ) ) )
            // InternalHale.g:817:2: ( ( rule__Assignment__Group__0 ) )
            {
            // InternalHale.g:817:2: ( ( rule__Assignment__Group__0 ) )
            // InternalHale.g:818:3: ( rule__Assignment__Group__0 )
            {
             before(grammarAccess.getAssignmentAccess().getGroup()); 
            // InternalHale.g:819:3: ( rule__Assignment__Group__0 )
            // InternalHale.g:819:4: rule__Assignment__Group__0
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
    // InternalHale.g:828:1: entryRuleInput : ruleInput EOF ;
    public final void entryRuleInput() throws RecognitionException {
        try {
            // InternalHale.g:829:1: ( ruleInput EOF )
            // InternalHale.g:830:1: ruleInput EOF
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
    // InternalHale.g:837:1: ruleInput : ( ( rule__Input__Group__0 ) ) ;
    public final void ruleInput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:841:2: ( ( ( rule__Input__Group__0 ) ) )
            // InternalHale.g:842:2: ( ( rule__Input__Group__0 ) )
            {
            // InternalHale.g:842:2: ( ( rule__Input__Group__0 ) )
            // InternalHale.g:843:3: ( rule__Input__Group__0 )
            {
             before(grammarAccess.getInputAccess().getGroup()); 
            // InternalHale.g:844:3: ( rule__Input__Group__0 )
            // InternalHale.g:844:4: rule__Input__Group__0
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
    // InternalHale.g:853:1: entryRulePrint : rulePrint EOF ;
    public final void entryRulePrint() throws RecognitionException {
        try {
            // InternalHale.g:854:1: ( rulePrint EOF )
            // InternalHale.g:855:1: rulePrint EOF
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
    // InternalHale.g:862:1: rulePrint : ( ( rule__Print__Group__0 ) ) ;
    public final void rulePrint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:866:2: ( ( ( rule__Print__Group__0 ) ) )
            // InternalHale.g:867:2: ( ( rule__Print__Group__0 ) )
            {
            // InternalHale.g:867:2: ( ( rule__Print__Group__0 ) )
            // InternalHale.g:868:3: ( rule__Print__Group__0 )
            {
             before(grammarAccess.getPrintAccess().getGroup()); 
            // InternalHale.g:869:3: ( rule__Print__Group__0 )
            // InternalHale.g:869:4: rule__Print__Group__0
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
    // InternalHale.g:878:1: entryRuleIf : ruleIf EOF ;
    public final void entryRuleIf() throws RecognitionException {
        try {
            // InternalHale.g:879:1: ( ruleIf EOF )
            // InternalHale.g:880:1: ruleIf EOF
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
    // InternalHale.g:887:1: ruleIf : ( ( rule__If__Group__0 ) ) ;
    public final void ruleIf() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:891:2: ( ( ( rule__If__Group__0 ) ) )
            // InternalHale.g:892:2: ( ( rule__If__Group__0 ) )
            {
            // InternalHale.g:892:2: ( ( rule__If__Group__0 ) )
            // InternalHale.g:893:3: ( rule__If__Group__0 )
            {
             before(grammarAccess.getIfAccess().getGroup()); 
            // InternalHale.g:894:3: ( rule__If__Group__0 )
            // InternalHale.g:894:4: rule__If__Group__0
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
    // InternalHale.g:903:1: entryRuleIfLet : ruleIfLet EOF ;
    public final void entryRuleIfLet() throws RecognitionException {
        try {
            // InternalHale.g:904:1: ( ruleIfLet EOF )
            // InternalHale.g:905:1: ruleIfLet EOF
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
    // InternalHale.g:912:1: ruleIfLet : ( ( rule__IfLet__Group__0 ) ) ;
    public final void ruleIfLet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:916:2: ( ( ( rule__IfLet__Group__0 ) ) )
            // InternalHale.g:917:2: ( ( rule__IfLet__Group__0 ) )
            {
            // InternalHale.g:917:2: ( ( rule__IfLet__Group__0 ) )
            // InternalHale.g:918:3: ( rule__IfLet__Group__0 )
            {
             before(grammarAccess.getIfLetAccess().getGroup()); 
            // InternalHale.g:919:3: ( rule__IfLet__Group__0 )
            // InternalHale.g:919:4: rule__IfLet__Group__0
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
    // InternalHale.g:928:1: entryRuleElseLet : ruleElseLet EOF ;
    public final void entryRuleElseLet() throws RecognitionException {
        try {
            // InternalHale.g:929:1: ( ruleElseLet EOF )
            // InternalHale.g:930:1: ruleElseLet EOF
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
    // InternalHale.g:937:1: ruleElseLet : ( ( rule__ElseLet__Group__0 ) ) ;
    public final void ruleElseLet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:941:2: ( ( ( rule__ElseLet__Group__0 ) ) )
            // InternalHale.g:942:2: ( ( rule__ElseLet__Group__0 ) )
            {
            // InternalHale.g:942:2: ( ( rule__ElseLet__Group__0 ) )
            // InternalHale.g:943:3: ( rule__ElseLet__Group__0 )
            {
             before(grammarAccess.getElseLetAccess().getGroup()); 
            // InternalHale.g:944:3: ( rule__ElseLet__Group__0 )
            // InternalHale.g:944:4: rule__ElseLet__Group__0
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
    // InternalHale.g:953:1: entryRuleIfConditions : ruleIfConditions EOF ;
    public final void entryRuleIfConditions() throws RecognitionException {
        try {
            // InternalHale.g:954:1: ( ruleIfConditions EOF )
            // InternalHale.g:955:1: ruleIfConditions EOF
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
    // InternalHale.g:962:1: ruleIfConditions : ( ( rule__IfConditions__Group__0 ) ) ;
    public final void ruleIfConditions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:966:2: ( ( ( rule__IfConditions__Group__0 ) ) )
            // InternalHale.g:967:2: ( ( rule__IfConditions__Group__0 ) )
            {
            // InternalHale.g:967:2: ( ( rule__IfConditions__Group__0 ) )
            // InternalHale.g:968:3: ( rule__IfConditions__Group__0 )
            {
             before(grammarAccess.getIfConditionsAccess().getGroup()); 
            // InternalHale.g:969:3: ( rule__IfConditions__Group__0 )
            // InternalHale.g:969:4: rule__IfConditions__Group__0
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
    // InternalHale.g:978:1: entryRuleWhile : ruleWhile EOF ;
    public final void entryRuleWhile() throws RecognitionException {
        try {
            // InternalHale.g:979:1: ( ruleWhile EOF )
            // InternalHale.g:980:1: ruleWhile EOF
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
    // InternalHale.g:987:1: ruleWhile : ( ( rule__While__Group__0 ) ) ;
    public final void ruleWhile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:991:2: ( ( ( rule__While__Group__0 ) ) )
            // InternalHale.g:992:2: ( ( rule__While__Group__0 ) )
            {
            // InternalHale.g:992:2: ( ( rule__While__Group__0 ) )
            // InternalHale.g:993:3: ( rule__While__Group__0 )
            {
             before(grammarAccess.getWhileAccess().getGroup()); 
            // InternalHale.g:994:3: ( rule__While__Group__0 )
            // InternalHale.g:994:4: rule__While__Group__0
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
    // InternalHale.g:1003:1: entryRuleBreak : ruleBreak EOF ;
    public final void entryRuleBreak() throws RecognitionException {
        try {
            // InternalHale.g:1004:1: ( ruleBreak EOF )
            // InternalHale.g:1005:1: ruleBreak EOF
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
    // InternalHale.g:1012:1: ruleBreak : ( ( rule__Break__Group__0 ) ) ;
    public final void ruleBreak() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1016:2: ( ( ( rule__Break__Group__0 ) ) )
            // InternalHale.g:1017:2: ( ( rule__Break__Group__0 ) )
            {
            // InternalHale.g:1017:2: ( ( rule__Break__Group__0 ) )
            // InternalHale.g:1018:3: ( rule__Break__Group__0 )
            {
             before(grammarAccess.getBreakAccess().getGroup()); 
            // InternalHale.g:1019:3: ( rule__Break__Group__0 )
            // InternalHale.g:1019:4: rule__Break__Group__0
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
    // InternalHale.g:1028:1: entryRuleFunction : ruleFunction EOF ;
    public final void entryRuleFunction() throws RecognitionException {
        try {
            // InternalHale.g:1029:1: ( ruleFunction EOF )
            // InternalHale.g:1030:1: ruleFunction EOF
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
    // InternalHale.g:1037:1: ruleFunction : ( ( rule__Function__Group__0 ) ) ;
    public final void ruleFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1041:2: ( ( ( rule__Function__Group__0 ) ) )
            // InternalHale.g:1042:2: ( ( rule__Function__Group__0 ) )
            {
            // InternalHale.g:1042:2: ( ( rule__Function__Group__0 ) )
            // InternalHale.g:1043:3: ( rule__Function__Group__0 )
            {
             before(grammarAccess.getFunctionAccess().getGroup()); 
            // InternalHale.g:1044:3: ( rule__Function__Group__0 )
            // InternalHale.g:1044:4: rule__Function__Group__0
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
    // InternalHale.g:1053:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalHale.g:1054:1: ( ruleParameter EOF )
            // InternalHale.g:1055:1: ruleParameter EOF
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
    // InternalHale.g:1062:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1066:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalHale.g:1067:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalHale.g:1067:2: ( ( rule__Parameter__Group__0 ) )
            // InternalHale.g:1068:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalHale.g:1069:3: ( rule__Parameter__Group__0 )
            // InternalHale.g:1069:4: rule__Parameter__Group__0
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
    // InternalHale.g:1078:1: entryRuleReturn : ruleReturn EOF ;
    public final void entryRuleReturn() throws RecognitionException {
        try {
            // InternalHale.g:1079:1: ( ruleReturn EOF )
            // InternalHale.g:1080:1: ruleReturn EOF
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
    // InternalHale.g:1087:1: ruleReturn : ( ( rule__Return__Group__0 ) ) ;
    public final void ruleReturn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1091:2: ( ( ( rule__Return__Group__0 ) ) )
            // InternalHale.g:1092:2: ( ( rule__Return__Group__0 ) )
            {
            // InternalHale.g:1092:2: ( ( rule__Return__Group__0 ) )
            // InternalHale.g:1093:3: ( rule__Return__Group__0 )
            {
             before(grammarAccess.getReturnAccess().getGroup()); 
            // InternalHale.g:1094:3: ( rule__Return__Group__0 )
            // InternalHale.g:1094:4: rule__Return__Group__0
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
    // InternalHale.g:1103:1: entryRuleThrow : ruleThrow EOF ;
    public final void entryRuleThrow() throws RecognitionException {
        try {
            // InternalHale.g:1104:1: ( ruleThrow EOF )
            // InternalHale.g:1105:1: ruleThrow EOF
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
    // InternalHale.g:1112:1: ruleThrow : ( ( rule__Throw__Group__0 ) ) ;
    public final void ruleThrow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1116:2: ( ( ( rule__Throw__Group__0 ) ) )
            // InternalHale.g:1117:2: ( ( rule__Throw__Group__0 ) )
            {
            // InternalHale.g:1117:2: ( ( rule__Throw__Group__0 ) )
            // InternalHale.g:1118:3: ( rule__Throw__Group__0 )
            {
             before(grammarAccess.getThrowAccess().getGroup()); 
            // InternalHale.g:1119:3: ( rule__Throw__Group__0 )
            // InternalHale.g:1119:4: rule__Throw__Group__0
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
    // InternalHale.g:1127:1: rule__Block__Alternatives_1 : ( ( ( rule__Block__StatementsAssignment_1_0 ) ) | ( ';' ) );
    public final void rule__Block__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1131:1: ( ( ( rule__Block__StatementsAssignment_1_0 ) ) | ( ';' ) )
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
                    // InternalHale.g:1132:2: ( ( rule__Block__StatementsAssignment_1_0 ) )
                    {
                    // InternalHale.g:1132:2: ( ( rule__Block__StatementsAssignment_1_0 ) )
                    // InternalHale.g:1133:3: ( rule__Block__StatementsAssignment_1_0 )
                    {
                     before(grammarAccess.getBlockAccess().getStatementsAssignment_1_0()); 
                    // InternalHale.g:1134:3: ( rule__Block__StatementsAssignment_1_0 )
                    // InternalHale.g:1134:4: rule__Block__StatementsAssignment_1_0
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
                    // InternalHale.g:1138:2: ( ';' )
                    {
                    // InternalHale.g:1138:2: ( ';' )
                    // InternalHale.g:1139:3: ';'
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
    // InternalHale.g:1148:1: rule__Statement__Alternatives : ( ( ruleBracedBlock ) | ( ruleFunction ) | ( ruleIf ) | ( ruleWhile ) | ( ( rule__Statement__Group_4__0 ) ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1152:1: ( ( ruleBracedBlock ) | ( ruleFunction ) | ( ruleIf ) | ( ruleWhile ) | ( ( rule__Statement__Group_4__0 ) ) )
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
                    // InternalHale.g:1153:2: ( ruleBracedBlock )
                    {
                    // InternalHale.g:1153:2: ( ruleBracedBlock )
                    // InternalHale.g:1154:3: ruleBracedBlock
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
                    // InternalHale.g:1159:2: ( ruleFunction )
                    {
                    // InternalHale.g:1159:2: ( ruleFunction )
                    // InternalHale.g:1160:3: ruleFunction
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
                    // InternalHale.g:1165:2: ( ruleIf )
                    {
                    // InternalHale.g:1165:2: ( ruleIf )
                    // InternalHale.g:1166:3: ruleIf
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
                    // InternalHale.g:1171:2: ( ruleWhile )
                    {
                    // InternalHale.g:1171:2: ( ruleWhile )
                    // InternalHale.g:1172:3: ruleWhile
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
                    // InternalHale.g:1177:2: ( ( rule__Statement__Group_4__0 ) )
                    {
                    // InternalHale.g:1177:2: ( ( rule__Statement__Group_4__0 ) )
                    // InternalHale.g:1178:3: ( rule__Statement__Group_4__0 )
                    {
                     before(grammarAccess.getStatementAccess().getGroup_4()); 
                    // InternalHale.g:1179:3: ( rule__Statement__Group_4__0 )
                    // InternalHale.g:1179:4: rule__Statement__Group_4__0
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
    // InternalHale.g:1187:1: rule__Statement__Alternatives_4_0 : ( ( rulePrint ) | ( ruleLetBinding ) | ( ruleAssignment ) | ( ruleBreak ) | ( ruleReturn ) | ( ruleThrow ) | ( ruleExpression ) );
    public final void rule__Statement__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1191:1: ( ( rulePrint ) | ( ruleLetBinding ) | ( ruleAssignment ) | ( ruleBreak ) | ( ruleReturn ) | ( ruleThrow ) | ( ruleExpression ) )
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
                    // InternalHale.g:1192:2: ( rulePrint )
                    {
                    // InternalHale.g:1192:2: ( rulePrint )
                    // InternalHale.g:1193:3: rulePrint
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
                    // InternalHale.g:1198:2: ( ruleLetBinding )
                    {
                    // InternalHale.g:1198:2: ( ruleLetBinding )
                    // InternalHale.g:1199:3: ruleLetBinding
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
                    // InternalHale.g:1204:2: ( ruleAssignment )
                    {
                    // InternalHale.g:1204:2: ( ruleAssignment )
                    // InternalHale.g:1205:3: ruleAssignment
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
                    // InternalHale.g:1210:2: ( ruleBreak )
                    {
                    // InternalHale.g:1210:2: ( ruleBreak )
                    // InternalHale.g:1211:3: ruleBreak
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
                    // InternalHale.g:1216:2: ( ruleReturn )
                    {
                    // InternalHale.g:1216:2: ( ruleReturn )
                    // InternalHale.g:1217:3: ruleReturn
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
                    // InternalHale.g:1222:2: ( ruleThrow )
                    {
                    // InternalHale.g:1222:2: ( ruleThrow )
                    // InternalHale.g:1223:3: ruleThrow
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
                    // InternalHale.g:1228:2: ( ruleExpression )
                    {
                    // InternalHale.g:1228:2: ( ruleExpression )
                    // InternalHale.g:1229:3: ruleExpression
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
    // InternalHale.g:1238:1: rule__Expression9__Alternatives_1 : ( ( ( rule__Expression9__Group_1_0__0 ) ) | ( ( rule__Expression9__Group_1_1__0 ) ) );
    public final void rule__Expression9__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1242:1: ( ( ( rule__Expression9__Group_1_0__0 ) ) | ( ( rule__Expression9__Group_1_1__0 ) ) )
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
                    // InternalHale.g:1243:2: ( ( rule__Expression9__Group_1_0__0 ) )
                    {
                    // InternalHale.g:1243:2: ( ( rule__Expression9__Group_1_0__0 ) )
                    // InternalHale.g:1244:3: ( rule__Expression9__Group_1_0__0 )
                    {
                     before(grammarAccess.getExpression9Access().getGroup_1_0()); 
                    // InternalHale.g:1245:3: ( rule__Expression9__Group_1_0__0 )
                    // InternalHale.g:1245:4: rule__Expression9__Group_1_0__0
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
                    // InternalHale.g:1249:2: ( ( rule__Expression9__Group_1_1__0 ) )
                    {
                    // InternalHale.g:1249:2: ( ( rule__Expression9__Group_1_1__0 ) )
                    // InternalHale.g:1250:3: ( rule__Expression9__Group_1_1__0 )
                    {
                     before(grammarAccess.getExpression9Access().getGroup_1_1()); 
                    // InternalHale.g:1251:3: ( rule__Expression9__Group_1_1__0 )
                    // InternalHale.g:1251:4: rule__Expression9__Group_1_1__0
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
    // InternalHale.g:1259:1: rule__Expression8__Alternatives_1 : ( ( ( rule__Expression8__Group_1_0__0 ) ) | ( ( rule__Expression8__Group_1_1__0 ) ) );
    public final void rule__Expression8__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1263:1: ( ( ( rule__Expression8__Group_1_0__0 ) ) | ( ( rule__Expression8__Group_1_1__0 ) ) )
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
                    // InternalHale.g:1264:2: ( ( rule__Expression8__Group_1_0__0 ) )
                    {
                    // InternalHale.g:1264:2: ( ( rule__Expression8__Group_1_0__0 ) )
                    // InternalHale.g:1265:3: ( rule__Expression8__Group_1_0__0 )
                    {
                     before(grammarAccess.getExpression8Access().getGroup_1_0()); 
                    // InternalHale.g:1266:3: ( rule__Expression8__Group_1_0__0 )
                    // InternalHale.g:1266:4: rule__Expression8__Group_1_0__0
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
                    // InternalHale.g:1270:2: ( ( rule__Expression8__Group_1_1__0 ) )
                    {
                    // InternalHale.g:1270:2: ( ( rule__Expression8__Group_1_1__0 ) )
                    // InternalHale.g:1271:3: ( rule__Expression8__Group_1_1__0 )
                    {
                     before(grammarAccess.getExpression8Access().getGroup_1_1()); 
                    // InternalHale.g:1272:3: ( rule__Expression8__Group_1_1__0 )
                    // InternalHale.g:1272:4: rule__Expression8__Group_1_1__0
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
    // InternalHale.g:1280:1: rule__Expression7__Alternatives_1 : ( ( ( rule__Expression7__Group_1_0__0 ) ) | ( ( rule__Expression7__Group_1_1__0 ) ) | ( ( rule__Expression7__Group_1_2__0 ) ) | ( ( rule__Expression7__Group_1_3__0 ) ) );
    public final void rule__Expression7__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1284:1: ( ( ( rule__Expression7__Group_1_0__0 ) ) | ( ( rule__Expression7__Group_1_1__0 ) ) | ( ( rule__Expression7__Group_1_2__0 ) ) | ( ( rule__Expression7__Group_1_3__0 ) ) )
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
                    // InternalHale.g:1285:2: ( ( rule__Expression7__Group_1_0__0 ) )
                    {
                    // InternalHale.g:1285:2: ( ( rule__Expression7__Group_1_0__0 ) )
                    // InternalHale.g:1286:3: ( rule__Expression7__Group_1_0__0 )
                    {
                     before(grammarAccess.getExpression7Access().getGroup_1_0()); 
                    // InternalHale.g:1287:3: ( rule__Expression7__Group_1_0__0 )
                    // InternalHale.g:1287:4: rule__Expression7__Group_1_0__0
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
                    // InternalHale.g:1291:2: ( ( rule__Expression7__Group_1_1__0 ) )
                    {
                    // InternalHale.g:1291:2: ( ( rule__Expression7__Group_1_1__0 ) )
                    // InternalHale.g:1292:3: ( rule__Expression7__Group_1_1__0 )
                    {
                     before(grammarAccess.getExpression7Access().getGroup_1_1()); 
                    // InternalHale.g:1293:3: ( rule__Expression7__Group_1_1__0 )
                    // InternalHale.g:1293:4: rule__Expression7__Group_1_1__0
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
                    // InternalHale.g:1297:2: ( ( rule__Expression7__Group_1_2__0 ) )
                    {
                    // InternalHale.g:1297:2: ( ( rule__Expression7__Group_1_2__0 ) )
                    // InternalHale.g:1298:3: ( rule__Expression7__Group_1_2__0 )
                    {
                     before(grammarAccess.getExpression7Access().getGroup_1_2()); 
                    // InternalHale.g:1299:3: ( rule__Expression7__Group_1_2__0 )
                    // InternalHale.g:1299:4: rule__Expression7__Group_1_2__0
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
                    // InternalHale.g:1303:2: ( ( rule__Expression7__Group_1_3__0 ) )
                    {
                    // InternalHale.g:1303:2: ( ( rule__Expression7__Group_1_3__0 ) )
                    // InternalHale.g:1304:3: ( rule__Expression7__Group_1_3__0 )
                    {
                     before(grammarAccess.getExpression7Access().getGroup_1_3()); 
                    // InternalHale.g:1305:3: ( rule__Expression7__Group_1_3__0 )
                    // InternalHale.g:1305:4: rule__Expression7__Group_1_3__0
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
    // InternalHale.g:1313:1: rule__Expression6__Alternatives_1 : ( ( ( rule__Expression6__Group_1_0__0 ) ) | ( ( rule__Expression6__Group_1_1__0 ) ) );
    public final void rule__Expression6__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1317:1: ( ( ( rule__Expression6__Group_1_0__0 ) ) | ( ( rule__Expression6__Group_1_1__0 ) ) )
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
                    // InternalHale.g:1318:2: ( ( rule__Expression6__Group_1_0__0 ) )
                    {
                    // InternalHale.g:1318:2: ( ( rule__Expression6__Group_1_0__0 ) )
                    // InternalHale.g:1319:3: ( rule__Expression6__Group_1_0__0 )
                    {
                     before(grammarAccess.getExpression6Access().getGroup_1_0()); 
                    // InternalHale.g:1320:3: ( rule__Expression6__Group_1_0__0 )
                    // InternalHale.g:1320:4: rule__Expression6__Group_1_0__0
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
                    // InternalHale.g:1324:2: ( ( rule__Expression6__Group_1_1__0 ) )
                    {
                    // InternalHale.g:1324:2: ( ( rule__Expression6__Group_1_1__0 ) )
                    // InternalHale.g:1325:3: ( rule__Expression6__Group_1_1__0 )
                    {
                     before(grammarAccess.getExpression6Access().getGroup_1_1()); 
                    // InternalHale.g:1326:3: ( rule__Expression6__Group_1_1__0 )
                    // InternalHale.g:1326:4: rule__Expression6__Group_1_1__0
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
    // InternalHale.g:1334:1: rule__Expression5__Alternatives_1 : ( ( ( rule__Expression5__Group_1_0__0 ) ) | ( ( rule__Expression5__Group_1_1__0 ) ) | ( ( rule__Expression5__Group_1_2__0 ) ) );
    public final void rule__Expression5__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1338:1: ( ( ( rule__Expression5__Group_1_0__0 ) ) | ( ( rule__Expression5__Group_1_1__0 ) ) | ( ( rule__Expression5__Group_1_2__0 ) ) )
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
                    // InternalHale.g:1339:2: ( ( rule__Expression5__Group_1_0__0 ) )
                    {
                    // InternalHale.g:1339:2: ( ( rule__Expression5__Group_1_0__0 ) )
                    // InternalHale.g:1340:3: ( rule__Expression5__Group_1_0__0 )
                    {
                     before(grammarAccess.getExpression5Access().getGroup_1_0()); 
                    // InternalHale.g:1341:3: ( rule__Expression5__Group_1_0__0 )
                    // InternalHale.g:1341:4: rule__Expression5__Group_1_0__0
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
                    // InternalHale.g:1345:2: ( ( rule__Expression5__Group_1_1__0 ) )
                    {
                    // InternalHale.g:1345:2: ( ( rule__Expression5__Group_1_1__0 ) )
                    // InternalHale.g:1346:3: ( rule__Expression5__Group_1_1__0 )
                    {
                     before(grammarAccess.getExpression5Access().getGroup_1_1()); 
                    // InternalHale.g:1347:3: ( rule__Expression5__Group_1_1__0 )
                    // InternalHale.g:1347:4: rule__Expression5__Group_1_1__0
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
                    // InternalHale.g:1351:2: ( ( rule__Expression5__Group_1_2__0 ) )
                    {
                    // InternalHale.g:1351:2: ( ( rule__Expression5__Group_1_2__0 ) )
                    // InternalHale.g:1352:3: ( rule__Expression5__Group_1_2__0 )
                    {
                     before(grammarAccess.getExpression5Access().getGroup_1_2()); 
                    // InternalHale.g:1353:3: ( rule__Expression5__Group_1_2__0 )
                    // InternalHale.g:1353:4: rule__Expression5__Group_1_2__0
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
    // InternalHale.g:1361:1: rule__Expression2__Alternatives : ( ( ( rule__Expression2__Group_0__0 ) ) | ( ( rule__Expression2__Group_1__0 ) ) | ( ruleExpression1 ) );
    public final void rule__Expression2__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1365:1: ( ( ( rule__Expression2__Group_0__0 ) ) | ( ( rule__Expression2__Group_1__0 ) ) | ( ruleExpression1 ) )
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
                    // InternalHale.g:1366:2: ( ( rule__Expression2__Group_0__0 ) )
                    {
                    // InternalHale.g:1366:2: ( ( rule__Expression2__Group_0__0 ) )
                    // InternalHale.g:1367:3: ( rule__Expression2__Group_0__0 )
                    {
                     before(grammarAccess.getExpression2Access().getGroup_0()); 
                    // InternalHale.g:1368:3: ( rule__Expression2__Group_0__0 )
                    // InternalHale.g:1368:4: rule__Expression2__Group_0__0
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
                    // InternalHale.g:1372:2: ( ( rule__Expression2__Group_1__0 ) )
                    {
                    // InternalHale.g:1372:2: ( ( rule__Expression2__Group_1__0 ) )
                    // InternalHale.g:1373:3: ( rule__Expression2__Group_1__0 )
                    {
                     before(grammarAccess.getExpression2Access().getGroup_1()); 
                    // InternalHale.g:1374:3: ( rule__Expression2__Group_1__0 )
                    // InternalHale.g:1374:4: rule__Expression2__Group_1__0
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
                    // InternalHale.g:1378:2: ( ruleExpression1 )
                    {
                    // InternalHale.g:1378:2: ( ruleExpression1 )
                    // InternalHale.g:1379:3: ruleExpression1
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
    // InternalHale.g:1388:1: rule__Expression0__Alternatives : ( ( ruleLiteral ) | ( ruleInput ) | ( ruleBindingReference ) | ( ( rule__Expression0__Group_3__0 ) ) );
    public final void rule__Expression0__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1392:1: ( ( ruleLiteral ) | ( ruleInput ) | ( ruleBindingReference ) | ( ( rule__Expression0__Group_3__0 ) ) )
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
                    // InternalHale.g:1393:2: ( ruleLiteral )
                    {
                    // InternalHale.g:1393:2: ( ruleLiteral )
                    // InternalHale.g:1394:3: ruleLiteral
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
                    // InternalHale.g:1399:2: ( ruleInput )
                    {
                    // InternalHale.g:1399:2: ( ruleInput )
                    // InternalHale.g:1400:3: ruleInput
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
                    // InternalHale.g:1405:2: ( ruleBindingReference )
                    {
                    // InternalHale.g:1405:2: ( ruleBindingReference )
                    // InternalHale.g:1406:3: ruleBindingReference
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
                    // InternalHale.g:1411:2: ( ( rule__Expression0__Group_3__0 ) )
                    {
                    // InternalHale.g:1411:2: ( ( rule__Expression0__Group_3__0 ) )
                    // InternalHale.g:1412:3: ( rule__Expression0__Group_3__0 )
                    {
                     before(grammarAccess.getExpression0Access().getGroup_3()); 
                    // InternalHale.g:1413:3: ( rule__Expression0__Group_3__0 )
                    // InternalHale.g:1413:4: rule__Expression0__Group_3__0
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
    // InternalHale.g:1421:1: rule__Literal__Alternatives : ( ( ruleVoidLiteral ) | ( ruleBooleanLiteral ) | ( ruleNumberLiteral ) | ( ruleStringLiteral ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1425:1: ( ( ruleVoidLiteral ) | ( ruleBooleanLiteral ) | ( ruleNumberLiteral ) | ( ruleStringLiteral ) )
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
                    // InternalHale.g:1426:2: ( ruleVoidLiteral )
                    {
                    // InternalHale.g:1426:2: ( ruleVoidLiteral )
                    // InternalHale.g:1427:3: ruleVoidLiteral
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
                    // InternalHale.g:1432:2: ( ruleBooleanLiteral )
                    {
                    // InternalHale.g:1432:2: ( ruleBooleanLiteral )
                    // InternalHale.g:1433:3: ruleBooleanLiteral
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
                    // InternalHale.g:1438:2: ( ruleNumberLiteral )
                    {
                    // InternalHale.g:1438:2: ( ruleNumberLiteral )
                    // InternalHale.g:1439:3: ruleNumberLiteral
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
                    // InternalHale.g:1444:2: ( ruleStringLiteral )
                    {
                    // InternalHale.g:1444:2: ( ruleStringLiteral )
                    // InternalHale.g:1445:3: ruleStringLiteral
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
    // InternalHale.g:1454:1: rule__FunctionType__Alternatives : ( ( ( rule__FunctionType__Group_0__0 ) ) | ( ruleEitherType ) );
    public final void rule__FunctionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1458:1: ( ( ( rule__FunctionType__Group_0__0 ) ) | ( ruleEitherType ) )
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
                    // InternalHale.g:1459:2: ( ( rule__FunctionType__Group_0__0 ) )
                    {
                    // InternalHale.g:1459:2: ( ( rule__FunctionType__Group_0__0 ) )
                    // InternalHale.g:1460:3: ( rule__FunctionType__Group_0__0 )
                    {
                     before(grammarAccess.getFunctionTypeAccess().getGroup_0()); 
                    // InternalHale.g:1461:3: ( rule__FunctionType__Group_0__0 )
                    // InternalHale.g:1461:4: rule__FunctionType__Group_0__0
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
                    // InternalHale.g:1465:2: ( ruleEitherType )
                    {
                    // InternalHale.g:1465:2: ( ruleEitherType )
                    // InternalHale.g:1466:3: ruleEitherType
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
    // InternalHale.g:1475:1: rule__PrimaryType__Alternatives : ( ( rulePrimitiveType ) | ( ( rule__PrimaryType__Group_1__0 ) ) );
    public final void rule__PrimaryType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1479:1: ( ( rulePrimitiveType ) | ( ( rule__PrimaryType__Group_1__0 ) ) )
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
                    // InternalHale.g:1480:2: ( rulePrimitiveType )
                    {
                    // InternalHale.g:1480:2: ( rulePrimitiveType )
                    // InternalHale.g:1481:3: rulePrimitiveType
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
                    // InternalHale.g:1486:2: ( ( rule__PrimaryType__Group_1__0 ) )
                    {
                    // InternalHale.g:1486:2: ( ( rule__PrimaryType__Group_1__0 ) )
                    // InternalHale.g:1487:3: ( rule__PrimaryType__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryTypeAccess().getGroup_1()); 
                    // InternalHale.g:1488:3: ( rule__PrimaryType__Group_1__0 )
                    // InternalHale.g:1488:4: rule__PrimaryType__Group_1__0
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
    // InternalHale.g:1496:1: rule__If__Alternatives_1 : ( ( ruleIfLet ) | ( ruleIfConditions ) );
    public final void rule__If__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1500:1: ( ( ruleIfLet ) | ( ruleIfConditions ) )
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
                    // InternalHale.g:1501:2: ( ruleIfLet )
                    {
                    // InternalHale.g:1501:2: ( ruleIfLet )
                    // InternalHale.g:1502:3: ruleIfLet
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
                    // InternalHale.g:1507:2: ( ruleIfConditions )
                    {
                    // InternalHale.g:1507:2: ( ruleIfConditions )
                    // InternalHale.g:1508:3: ruleIfConditions
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
    // InternalHale.g:1517:1: rule__Hale__Group__0 : rule__Hale__Group__0__Impl rule__Hale__Group__1 ;
    public final void rule__Hale__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1521:1: ( rule__Hale__Group__0__Impl rule__Hale__Group__1 )
            // InternalHale.g:1522:2: rule__Hale__Group__0__Impl rule__Hale__Group__1
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
    // InternalHale.g:1529:1: rule__Hale__Group__0__Impl : ( () ) ;
    public final void rule__Hale__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1533:1: ( ( () ) )
            // InternalHale.g:1534:1: ( () )
            {
            // InternalHale.g:1534:1: ( () )
            // InternalHale.g:1535:2: ()
            {
             before(grammarAccess.getHaleAccess().getHaleAction_0()); 
            // InternalHale.g:1536:2: ()
            // InternalHale.g:1536:3: 
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
    // InternalHale.g:1544:1: rule__Hale__Group__1 : rule__Hale__Group__1__Impl ;
    public final void rule__Hale__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1548:1: ( rule__Hale__Group__1__Impl )
            // InternalHale.g:1549:2: rule__Hale__Group__1__Impl
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
    // InternalHale.g:1555:1: rule__Hale__Group__1__Impl : ( ( rule__Hale__MainBlockAssignment_1 ) ) ;
    public final void rule__Hale__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1559:1: ( ( ( rule__Hale__MainBlockAssignment_1 ) ) )
            // InternalHale.g:1560:1: ( ( rule__Hale__MainBlockAssignment_1 ) )
            {
            // InternalHale.g:1560:1: ( ( rule__Hale__MainBlockAssignment_1 ) )
            // InternalHale.g:1561:2: ( rule__Hale__MainBlockAssignment_1 )
            {
             before(grammarAccess.getHaleAccess().getMainBlockAssignment_1()); 
            // InternalHale.g:1562:2: ( rule__Hale__MainBlockAssignment_1 )
            // InternalHale.g:1562:3: rule__Hale__MainBlockAssignment_1
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
    // InternalHale.g:1571:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1575:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // InternalHale.g:1576:2: rule__Block__Group__0__Impl rule__Block__Group__1
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
    // InternalHale.g:1583:1: rule__Block__Group__0__Impl : ( () ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1587:1: ( ( () ) )
            // InternalHale.g:1588:1: ( () )
            {
            // InternalHale.g:1588:1: ( () )
            // InternalHale.g:1589:2: ()
            {
             before(grammarAccess.getBlockAccess().getBlockAction_0()); 
            // InternalHale.g:1590:2: ()
            // InternalHale.g:1590:3: 
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
    // InternalHale.g:1598:1: rule__Block__Group__1 : rule__Block__Group__1__Impl ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1602:1: ( rule__Block__Group__1__Impl )
            // InternalHale.g:1603:2: rule__Block__Group__1__Impl
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
    // InternalHale.g:1609:1: rule__Block__Group__1__Impl : ( ( rule__Block__Alternatives_1 )* ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1613:1: ( ( ( rule__Block__Alternatives_1 )* ) )
            // InternalHale.g:1614:1: ( ( rule__Block__Alternatives_1 )* )
            {
            // InternalHale.g:1614:1: ( ( rule__Block__Alternatives_1 )* )
            // InternalHale.g:1615:2: ( rule__Block__Alternatives_1 )*
            {
             before(grammarAccess.getBlockAccess().getAlternatives_1()); 
            // InternalHale.g:1616:2: ( rule__Block__Alternatives_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=RULE_BOOLEAN && LA15_0<=RULE_STRING)||LA15_0==RULE_ID||(LA15_0>=12 && LA15_0<=13)||LA15_0==25||(LA15_0>=31 && LA15_0<=32)||LA15_0==35||LA15_0==39||(LA15_0>=41 && LA15_0<=43)||(LA15_0>=46 && LA15_0<=50)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalHale.g:1616:3: rule__Block__Alternatives_1
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
    // InternalHale.g:1625:1: rule__Statement__Group_4__0 : rule__Statement__Group_4__0__Impl rule__Statement__Group_4__1 ;
    public final void rule__Statement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1629:1: ( rule__Statement__Group_4__0__Impl rule__Statement__Group_4__1 )
            // InternalHale.g:1630:2: rule__Statement__Group_4__0__Impl rule__Statement__Group_4__1
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
    // InternalHale.g:1637:1: rule__Statement__Group_4__0__Impl : ( ( rule__Statement__Alternatives_4_0 ) ) ;
    public final void rule__Statement__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1641:1: ( ( ( rule__Statement__Alternatives_4_0 ) ) )
            // InternalHale.g:1642:1: ( ( rule__Statement__Alternatives_4_0 ) )
            {
            // InternalHale.g:1642:1: ( ( rule__Statement__Alternatives_4_0 ) )
            // InternalHale.g:1643:2: ( rule__Statement__Alternatives_4_0 )
            {
             before(grammarAccess.getStatementAccess().getAlternatives_4_0()); 
            // InternalHale.g:1644:2: ( rule__Statement__Alternatives_4_0 )
            // InternalHale.g:1644:3: rule__Statement__Alternatives_4_0
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
    // InternalHale.g:1652:1: rule__Statement__Group_4__1 : rule__Statement__Group_4__1__Impl ;
    public final void rule__Statement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1656:1: ( rule__Statement__Group_4__1__Impl )
            // InternalHale.g:1657:2: rule__Statement__Group_4__1__Impl
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
    // InternalHale.g:1663:1: rule__Statement__Group_4__1__Impl : ( ';' ) ;
    public final void rule__Statement__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1667:1: ( ( ';' ) )
            // InternalHale.g:1668:1: ( ';' )
            {
            // InternalHale.g:1668:1: ( ';' )
            // InternalHale.g:1669:2: ';'
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
    // InternalHale.g:1679:1: rule__BracedBlock__Group__0 : rule__BracedBlock__Group__0__Impl rule__BracedBlock__Group__1 ;
    public final void rule__BracedBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1683:1: ( rule__BracedBlock__Group__0__Impl rule__BracedBlock__Group__1 )
            // InternalHale.g:1684:2: rule__BracedBlock__Group__0__Impl rule__BracedBlock__Group__1
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
    // InternalHale.g:1691:1: rule__BracedBlock__Group__0__Impl : ( '{' ) ;
    public final void rule__BracedBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1695:1: ( ( '{' ) )
            // InternalHale.g:1696:1: ( '{' )
            {
            // InternalHale.g:1696:1: ( '{' )
            // InternalHale.g:1697:2: '{'
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
    // InternalHale.g:1706:1: rule__BracedBlock__Group__1 : rule__BracedBlock__Group__1__Impl rule__BracedBlock__Group__2 ;
    public final void rule__BracedBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1710:1: ( rule__BracedBlock__Group__1__Impl rule__BracedBlock__Group__2 )
            // InternalHale.g:1711:2: rule__BracedBlock__Group__1__Impl rule__BracedBlock__Group__2
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
    // InternalHale.g:1718:1: rule__BracedBlock__Group__1__Impl : ( ruleBlock ) ;
    public final void rule__BracedBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1722:1: ( ( ruleBlock ) )
            // InternalHale.g:1723:1: ( ruleBlock )
            {
            // InternalHale.g:1723:1: ( ruleBlock )
            // InternalHale.g:1724:2: ruleBlock
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
    // InternalHale.g:1733:1: rule__BracedBlock__Group__2 : rule__BracedBlock__Group__2__Impl ;
    public final void rule__BracedBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1737:1: ( rule__BracedBlock__Group__2__Impl )
            // InternalHale.g:1738:2: rule__BracedBlock__Group__2__Impl
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
    // InternalHale.g:1744:1: rule__BracedBlock__Group__2__Impl : ( '}' ) ;
    public final void rule__BracedBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1748:1: ( ( '}' ) )
            // InternalHale.g:1749:1: ( '}' )
            {
            // InternalHale.g:1749:1: ( '}' )
            // InternalHale.g:1750:2: '}'
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
    // InternalHale.g:1760:1: rule__Expression10__Group__0 : rule__Expression10__Group__0__Impl rule__Expression10__Group__1 ;
    public final void rule__Expression10__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1764:1: ( rule__Expression10__Group__0__Impl rule__Expression10__Group__1 )
            // InternalHale.g:1765:2: rule__Expression10__Group__0__Impl rule__Expression10__Group__1
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
    // InternalHale.g:1772:1: rule__Expression10__Group__0__Impl : ( ruleExpression9 ) ;
    public final void rule__Expression10__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1776:1: ( ( ruleExpression9 ) )
            // InternalHale.g:1777:1: ( ruleExpression9 )
            {
            // InternalHale.g:1777:1: ( ruleExpression9 )
            // InternalHale.g:1778:2: ruleExpression9
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
    // InternalHale.g:1787:1: rule__Expression10__Group__1 : rule__Expression10__Group__1__Impl ;
    public final void rule__Expression10__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1791:1: ( rule__Expression10__Group__1__Impl )
            // InternalHale.g:1792:2: rule__Expression10__Group__1__Impl
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
    // InternalHale.g:1798:1: rule__Expression10__Group__1__Impl : ( ( rule__Expression10__Group_1__0 )* ) ;
    public final void rule__Expression10__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1802:1: ( ( ( rule__Expression10__Group_1__0 )* ) )
            // InternalHale.g:1803:1: ( ( rule__Expression10__Group_1__0 )* )
            {
            // InternalHale.g:1803:1: ( ( rule__Expression10__Group_1__0 )* )
            // InternalHale.g:1804:2: ( rule__Expression10__Group_1__0 )*
            {
             before(grammarAccess.getExpression10Access().getGroup_1()); 
            // InternalHale.g:1805:2: ( rule__Expression10__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==15) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalHale.g:1805:3: rule__Expression10__Group_1__0
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
    // InternalHale.g:1814:1: rule__Expression10__Group_1__0 : rule__Expression10__Group_1__0__Impl rule__Expression10__Group_1__1 ;
    public final void rule__Expression10__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1818:1: ( rule__Expression10__Group_1__0__Impl rule__Expression10__Group_1__1 )
            // InternalHale.g:1819:2: rule__Expression10__Group_1__0__Impl rule__Expression10__Group_1__1
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
    // InternalHale.g:1826:1: rule__Expression10__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression10__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1830:1: ( ( () ) )
            // InternalHale.g:1831:1: ( () )
            {
            // InternalHale.g:1831:1: ( () )
            // InternalHale.g:1832:2: ()
            {
             before(grammarAccess.getExpression10Access().getConcatenationLeftAction_1_0()); 
            // InternalHale.g:1833:2: ()
            // InternalHale.g:1833:3: 
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
    // InternalHale.g:1841:1: rule__Expression10__Group_1__1 : rule__Expression10__Group_1__1__Impl rule__Expression10__Group_1__2 ;
    public final void rule__Expression10__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1845:1: ( rule__Expression10__Group_1__1__Impl rule__Expression10__Group_1__2 )
            // InternalHale.g:1846:2: rule__Expression10__Group_1__1__Impl rule__Expression10__Group_1__2
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
    // InternalHale.g:1853:1: rule__Expression10__Group_1__1__Impl : ( '.' ) ;
    public final void rule__Expression10__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1857:1: ( ( '.' ) )
            // InternalHale.g:1858:1: ( '.' )
            {
            // InternalHale.g:1858:1: ( '.' )
            // InternalHale.g:1859:2: '.'
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
    // InternalHale.g:1868:1: rule__Expression10__Group_1__2 : rule__Expression10__Group_1__2__Impl ;
    public final void rule__Expression10__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1872:1: ( rule__Expression10__Group_1__2__Impl )
            // InternalHale.g:1873:2: rule__Expression10__Group_1__2__Impl
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
    // InternalHale.g:1879:1: rule__Expression10__Group_1__2__Impl : ( ( rule__Expression10__RightAssignment_1_2 ) ) ;
    public final void rule__Expression10__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1883:1: ( ( ( rule__Expression10__RightAssignment_1_2 ) ) )
            // InternalHale.g:1884:1: ( ( rule__Expression10__RightAssignment_1_2 ) )
            {
            // InternalHale.g:1884:1: ( ( rule__Expression10__RightAssignment_1_2 ) )
            // InternalHale.g:1885:2: ( rule__Expression10__RightAssignment_1_2 )
            {
             before(grammarAccess.getExpression10Access().getRightAssignment_1_2()); 
            // InternalHale.g:1886:2: ( rule__Expression10__RightAssignment_1_2 )
            // InternalHale.g:1886:3: rule__Expression10__RightAssignment_1_2
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
    // InternalHale.g:1895:1: rule__Expression9__Group__0 : rule__Expression9__Group__0__Impl rule__Expression9__Group__1 ;
    public final void rule__Expression9__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1899:1: ( rule__Expression9__Group__0__Impl rule__Expression9__Group__1 )
            // InternalHale.g:1900:2: rule__Expression9__Group__0__Impl rule__Expression9__Group__1
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
    // InternalHale.g:1907:1: rule__Expression9__Group__0__Impl : ( ruleExpression8 ) ;
    public final void rule__Expression9__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1911:1: ( ( ruleExpression8 ) )
            // InternalHale.g:1912:1: ( ruleExpression8 )
            {
            // InternalHale.g:1912:1: ( ruleExpression8 )
            // InternalHale.g:1913:2: ruleExpression8
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
    // InternalHale.g:1922:1: rule__Expression9__Group__1 : rule__Expression9__Group__1__Impl ;
    public final void rule__Expression9__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1926:1: ( rule__Expression9__Group__1__Impl )
            // InternalHale.g:1927:2: rule__Expression9__Group__1__Impl
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
    // InternalHale.g:1933:1: rule__Expression9__Group__1__Impl : ( ( rule__Expression9__Alternatives_1 )* ) ;
    public final void rule__Expression9__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1937:1: ( ( ( rule__Expression9__Alternatives_1 )* ) )
            // InternalHale.g:1938:1: ( ( rule__Expression9__Alternatives_1 )* )
            {
            // InternalHale.g:1938:1: ( ( rule__Expression9__Alternatives_1 )* )
            // InternalHale.g:1939:2: ( rule__Expression9__Alternatives_1 )*
            {
             before(grammarAccess.getExpression9Access().getAlternatives_1()); 
            // InternalHale.g:1940:2: ( rule__Expression9__Alternatives_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=16 && LA17_0<=17)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalHale.g:1940:3: rule__Expression9__Alternatives_1
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
    // InternalHale.g:1949:1: rule__Expression9__Group_1_0__0 : rule__Expression9__Group_1_0__0__Impl rule__Expression9__Group_1_0__1 ;
    public final void rule__Expression9__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1953:1: ( rule__Expression9__Group_1_0__0__Impl rule__Expression9__Group_1_0__1 )
            // InternalHale.g:1954:2: rule__Expression9__Group_1_0__0__Impl rule__Expression9__Group_1_0__1
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
    // InternalHale.g:1961:1: rule__Expression9__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Expression9__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1965:1: ( ( () ) )
            // InternalHale.g:1966:1: ( () )
            {
            // InternalHale.g:1966:1: ( () )
            // InternalHale.g:1967:2: ()
            {
             before(grammarAccess.getExpression9Access().getLogicalAndLeftAction_1_0_0()); 
            // InternalHale.g:1968:2: ()
            // InternalHale.g:1968:3: 
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
    // InternalHale.g:1976:1: rule__Expression9__Group_1_0__1 : rule__Expression9__Group_1_0__1__Impl rule__Expression9__Group_1_0__2 ;
    public final void rule__Expression9__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1980:1: ( rule__Expression9__Group_1_0__1__Impl rule__Expression9__Group_1_0__2 )
            // InternalHale.g:1981:2: rule__Expression9__Group_1_0__1__Impl rule__Expression9__Group_1_0__2
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
    // InternalHale.g:1988:1: rule__Expression9__Group_1_0__1__Impl : ( 'and' ) ;
    public final void rule__Expression9__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:1992:1: ( ( 'and' ) )
            // InternalHale.g:1993:1: ( 'and' )
            {
            // InternalHale.g:1993:1: ( 'and' )
            // InternalHale.g:1994:2: 'and'
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
    // InternalHale.g:2003:1: rule__Expression9__Group_1_0__2 : rule__Expression9__Group_1_0__2__Impl ;
    public final void rule__Expression9__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2007:1: ( rule__Expression9__Group_1_0__2__Impl )
            // InternalHale.g:2008:2: rule__Expression9__Group_1_0__2__Impl
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
    // InternalHale.g:2014:1: rule__Expression9__Group_1_0__2__Impl : ( ( rule__Expression9__RightAssignment_1_0_2 ) ) ;
    public final void rule__Expression9__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2018:1: ( ( ( rule__Expression9__RightAssignment_1_0_2 ) ) )
            // InternalHale.g:2019:1: ( ( rule__Expression9__RightAssignment_1_0_2 ) )
            {
            // InternalHale.g:2019:1: ( ( rule__Expression9__RightAssignment_1_0_2 ) )
            // InternalHale.g:2020:2: ( rule__Expression9__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getExpression9Access().getRightAssignment_1_0_2()); 
            // InternalHale.g:2021:2: ( rule__Expression9__RightAssignment_1_0_2 )
            // InternalHale.g:2021:3: rule__Expression9__RightAssignment_1_0_2
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
    // InternalHale.g:2030:1: rule__Expression9__Group_1_1__0 : rule__Expression9__Group_1_1__0__Impl rule__Expression9__Group_1_1__1 ;
    public final void rule__Expression9__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2034:1: ( rule__Expression9__Group_1_1__0__Impl rule__Expression9__Group_1_1__1 )
            // InternalHale.g:2035:2: rule__Expression9__Group_1_1__0__Impl rule__Expression9__Group_1_1__1
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
    // InternalHale.g:2042:1: rule__Expression9__Group_1_1__0__Impl : ( () ) ;
    public final void rule__Expression9__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2046:1: ( ( () ) )
            // InternalHale.g:2047:1: ( () )
            {
            // InternalHale.g:2047:1: ( () )
            // InternalHale.g:2048:2: ()
            {
             before(grammarAccess.getExpression9Access().getLogicalOrLeftAction_1_1_0()); 
            // InternalHale.g:2049:2: ()
            // InternalHale.g:2049:3: 
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
    // InternalHale.g:2057:1: rule__Expression9__Group_1_1__1 : rule__Expression9__Group_1_1__1__Impl rule__Expression9__Group_1_1__2 ;
    public final void rule__Expression9__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2061:1: ( rule__Expression9__Group_1_1__1__Impl rule__Expression9__Group_1_1__2 )
            // InternalHale.g:2062:2: rule__Expression9__Group_1_1__1__Impl rule__Expression9__Group_1_1__2
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
    // InternalHale.g:2069:1: rule__Expression9__Group_1_1__1__Impl : ( 'or' ) ;
    public final void rule__Expression9__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2073:1: ( ( 'or' ) )
            // InternalHale.g:2074:1: ( 'or' )
            {
            // InternalHale.g:2074:1: ( 'or' )
            // InternalHale.g:2075:2: 'or'
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
    // InternalHale.g:2084:1: rule__Expression9__Group_1_1__2 : rule__Expression9__Group_1_1__2__Impl ;
    public final void rule__Expression9__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2088:1: ( rule__Expression9__Group_1_1__2__Impl )
            // InternalHale.g:2089:2: rule__Expression9__Group_1_1__2__Impl
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
    // InternalHale.g:2095:1: rule__Expression9__Group_1_1__2__Impl : ( ( rule__Expression9__RightAssignment_1_1_2 ) ) ;
    public final void rule__Expression9__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2099:1: ( ( ( rule__Expression9__RightAssignment_1_1_2 ) ) )
            // InternalHale.g:2100:1: ( ( rule__Expression9__RightAssignment_1_1_2 ) )
            {
            // InternalHale.g:2100:1: ( ( rule__Expression9__RightAssignment_1_1_2 ) )
            // InternalHale.g:2101:2: ( rule__Expression9__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getExpression9Access().getRightAssignment_1_1_2()); 
            // InternalHale.g:2102:2: ( rule__Expression9__RightAssignment_1_1_2 )
            // InternalHale.g:2102:3: rule__Expression9__RightAssignment_1_1_2
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
    // InternalHale.g:2111:1: rule__Expression8__Group__0 : rule__Expression8__Group__0__Impl rule__Expression8__Group__1 ;
    public final void rule__Expression8__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2115:1: ( rule__Expression8__Group__0__Impl rule__Expression8__Group__1 )
            // InternalHale.g:2116:2: rule__Expression8__Group__0__Impl rule__Expression8__Group__1
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
    // InternalHale.g:2123:1: rule__Expression8__Group__0__Impl : ( ruleExpression7 ) ;
    public final void rule__Expression8__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2127:1: ( ( ruleExpression7 ) )
            // InternalHale.g:2128:1: ( ruleExpression7 )
            {
            // InternalHale.g:2128:1: ( ruleExpression7 )
            // InternalHale.g:2129:2: ruleExpression7
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
    // InternalHale.g:2138:1: rule__Expression8__Group__1 : rule__Expression8__Group__1__Impl ;
    public final void rule__Expression8__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2142:1: ( rule__Expression8__Group__1__Impl )
            // InternalHale.g:2143:2: rule__Expression8__Group__1__Impl
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
    // InternalHale.g:2149:1: rule__Expression8__Group__1__Impl : ( ( rule__Expression8__Alternatives_1 )* ) ;
    public final void rule__Expression8__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2153:1: ( ( ( rule__Expression8__Alternatives_1 )* ) )
            // InternalHale.g:2154:1: ( ( rule__Expression8__Alternatives_1 )* )
            {
            // InternalHale.g:2154:1: ( ( rule__Expression8__Alternatives_1 )* )
            // InternalHale.g:2155:2: ( rule__Expression8__Alternatives_1 )*
            {
             before(grammarAccess.getExpression8Access().getAlternatives_1()); 
            // InternalHale.g:2156:2: ( rule__Expression8__Alternatives_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=18 && LA18_0<=19)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalHale.g:2156:3: rule__Expression8__Alternatives_1
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
    // InternalHale.g:2165:1: rule__Expression8__Group_1_0__0 : rule__Expression8__Group_1_0__0__Impl rule__Expression8__Group_1_0__1 ;
    public final void rule__Expression8__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2169:1: ( rule__Expression8__Group_1_0__0__Impl rule__Expression8__Group_1_0__1 )
            // InternalHale.g:2170:2: rule__Expression8__Group_1_0__0__Impl rule__Expression8__Group_1_0__1
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
    // InternalHale.g:2177:1: rule__Expression8__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Expression8__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2181:1: ( ( () ) )
            // InternalHale.g:2182:1: ( () )
            {
            // InternalHale.g:2182:1: ( () )
            // InternalHale.g:2183:2: ()
            {
             before(grammarAccess.getExpression8Access().getEqualityLeftAction_1_0_0()); 
            // InternalHale.g:2184:2: ()
            // InternalHale.g:2184:3: 
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
    // InternalHale.g:2192:1: rule__Expression8__Group_1_0__1 : rule__Expression8__Group_1_0__1__Impl rule__Expression8__Group_1_0__2 ;
    public final void rule__Expression8__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2196:1: ( rule__Expression8__Group_1_0__1__Impl rule__Expression8__Group_1_0__2 )
            // InternalHale.g:2197:2: rule__Expression8__Group_1_0__1__Impl rule__Expression8__Group_1_0__2
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
    // InternalHale.g:2204:1: rule__Expression8__Group_1_0__1__Impl : ( '==' ) ;
    public final void rule__Expression8__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2208:1: ( ( '==' ) )
            // InternalHale.g:2209:1: ( '==' )
            {
            // InternalHale.g:2209:1: ( '==' )
            // InternalHale.g:2210:2: '=='
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
    // InternalHale.g:2219:1: rule__Expression8__Group_1_0__2 : rule__Expression8__Group_1_0__2__Impl ;
    public final void rule__Expression8__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2223:1: ( rule__Expression8__Group_1_0__2__Impl )
            // InternalHale.g:2224:2: rule__Expression8__Group_1_0__2__Impl
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
    // InternalHale.g:2230:1: rule__Expression8__Group_1_0__2__Impl : ( ( rule__Expression8__RightAssignment_1_0_2 ) ) ;
    public final void rule__Expression8__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2234:1: ( ( ( rule__Expression8__RightAssignment_1_0_2 ) ) )
            // InternalHale.g:2235:1: ( ( rule__Expression8__RightAssignment_1_0_2 ) )
            {
            // InternalHale.g:2235:1: ( ( rule__Expression8__RightAssignment_1_0_2 ) )
            // InternalHale.g:2236:2: ( rule__Expression8__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getExpression8Access().getRightAssignment_1_0_2()); 
            // InternalHale.g:2237:2: ( rule__Expression8__RightAssignment_1_0_2 )
            // InternalHale.g:2237:3: rule__Expression8__RightAssignment_1_0_2
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
    // InternalHale.g:2246:1: rule__Expression8__Group_1_1__0 : rule__Expression8__Group_1_1__0__Impl rule__Expression8__Group_1_1__1 ;
    public final void rule__Expression8__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2250:1: ( rule__Expression8__Group_1_1__0__Impl rule__Expression8__Group_1_1__1 )
            // InternalHale.g:2251:2: rule__Expression8__Group_1_1__0__Impl rule__Expression8__Group_1_1__1
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
    // InternalHale.g:2258:1: rule__Expression8__Group_1_1__0__Impl : ( () ) ;
    public final void rule__Expression8__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2262:1: ( ( () ) )
            // InternalHale.g:2263:1: ( () )
            {
            // InternalHale.g:2263:1: ( () )
            // InternalHale.g:2264:2: ()
            {
             before(grammarAccess.getExpression8Access().getInequalityLeftAction_1_1_0()); 
            // InternalHale.g:2265:2: ()
            // InternalHale.g:2265:3: 
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
    // InternalHale.g:2273:1: rule__Expression8__Group_1_1__1 : rule__Expression8__Group_1_1__1__Impl rule__Expression8__Group_1_1__2 ;
    public final void rule__Expression8__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2277:1: ( rule__Expression8__Group_1_1__1__Impl rule__Expression8__Group_1_1__2 )
            // InternalHale.g:2278:2: rule__Expression8__Group_1_1__1__Impl rule__Expression8__Group_1_1__2
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
    // InternalHale.g:2285:1: rule__Expression8__Group_1_1__1__Impl : ( '!=' ) ;
    public final void rule__Expression8__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2289:1: ( ( '!=' ) )
            // InternalHale.g:2290:1: ( '!=' )
            {
            // InternalHale.g:2290:1: ( '!=' )
            // InternalHale.g:2291:2: '!='
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
    // InternalHale.g:2300:1: rule__Expression8__Group_1_1__2 : rule__Expression8__Group_1_1__2__Impl ;
    public final void rule__Expression8__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2304:1: ( rule__Expression8__Group_1_1__2__Impl )
            // InternalHale.g:2305:2: rule__Expression8__Group_1_1__2__Impl
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
    // InternalHale.g:2311:1: rule__Expression8__Group_1_1__2__Impl : ( ( rule__Expression8__RightAssignment_1_1_2 ) ) ;
    public final void rule__Expression8__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2315:1: ( ( ( rule__Expression8__RightAssignment_1_1_2 ) ) )
            // InternalHale.g:2316:1: ( ( rule__Expression8__RightAssignment_1_1_2 ) )
            {
            // InternalHale.g:2316:1: ( ( rule__Expression8__RightAssignment_1_1_2 ) )
            // InternalHale.g:2317:2: ( rule__Expression8__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getExpression8Access().getRightAssignment_1_1_2()); 
            // InternalHale.g:2318:2: ( rule__Expression8__RightAssignment_1_1_2 )
            // InternalHale.g:2318:3: rule__Expression8__RightAssignment_1_1_2
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
    // InternalHale.g:2327:1: rule__Expression7__Group__0 : rule__Expression7__Group__0__Impl rule__Expression7__Group__1 ;
    public final void rule__Expression7__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2331:1: ( rule__Expression7__Group__0__Impl rule__Expression7__Group__1 )
            // InternalHale.g:2332:2: rule__Expression7__Group__0__Impl rule__Expression7__Group__1
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
    // InternalHale.g:2339:1: rule__Expression7__Group__0__Impl : ( ruleExpression6 ) ;
    public final void rule__Expression7__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2343:1: ( ( ruleExpression6 ) )
            // InternalHale.g:2344:1: ( ruleExpression6 )
            {
            // InternalHale.g:2344:1: ( ruleExpression6 )
            // InternalHale.g:2345:2: ruleExpression6
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
    // InternalHale.g:2354:1: rule__Expression7__Group__1 : rule__Expression7__Group__1__Impl ;
    public final void rule__Expression7__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2358:1: ( rule__Expression7__Group__1__Impl )
            // InternalHale.g:2359:2: rule__Expression7__Group__1__Impl
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
    // InternalHale.g:2365:1: rule__Expression7__Group__1__Impl : ( ( rule__Expression7__Alternatives_1 )* ) ;
    public final void rule__Expression7__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2369:1: ( ( ( rule__Expression7__Alternatives_1 )* ) )
            // InternalHale.g:2370:1: ( ( rule__Expression7__Alternatives_1 )* )
            {
            // InternalHale.g:2370:1: ( ( rule__Expression7__Alternatives_1 )* )
            // InternalHale.g:2371:2: ( rule__Expression7__Alternatives_1 )*
            {
             before(grammarAccess.getExpression7Access().getAlternatives_1()); 
            // InternalHale.g:2372:2: ( rule__Expression7__Alternatives_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=20 && LA19_0<=23)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalHale.g:2372:3: rule__Expression7__Alternatives_1
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
    // InternalHale.g:2381:1: rule__Expression7__Group_1_0__0 : rule__Expression7__Group_1_0__0__Impl rule__Expression7__Group_1_0__1 ;
    public final void rule__Expression7__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2385:1: ( rule__Expression7__Group_1_0__0__Impl rule__Expression7__Group_1_0__1 )
            // InternalHale.g:2386:2: rule__Expression7__Group_1_0__0__Impl rule__Expression7__Group_1_0__1
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
    // InternalHale.g:2393:1: rule__Expression7__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Expression7__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2397:1: ( ( () ) )
            // InternalHale.g:2398:1: ( () )
            {
            // InternalHale.g:2398:1: ( () )
            // InternalHale.g:2399:2: ()
            {
             before(grammarAccess.getExpression7Access().getLessThanOrEqualLeftAction_1_0_0()); 
            // InternalHale.g:2400:2: ()
            // InternalHale.g:2400:3: 
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
    // InternalHale.g:2408:1: rule__Expression7__Group_1_0__1 : rule__Expression7__Group_1_0__1__Impl rule__Expression7__Group_1_0__2 ;
    public final void rule__Expression7__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2412:1: ( rule__Expression7__Group_1_0__1__Impl rule__Expression7__Group_1_0__2 )
            // InternalHale.g:2413:2: rule__Expression7__Group_1_0__1__Impl rule__Expression7__Group_1_0__2
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
    // InternalHale.g:2420:1: rule__Expression7__Group_1_0__1__Impl : ( '<=' ) ;
    public final void rule__Expression7__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2424:1: ( ( '<=' ) )
            // InternalHale.g:2425:1: ( '<=' )
            {
            // InternalHale.g:2425:1: ( '<=' )
            // InternalHale.g:2426:2: '<='
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
    // InternalHale.g:2435:1: rule__Expression7__Group_1_0__2 : rule__Expression7__Group_1_0__2__Impl ;
    public final void rule__Expression7__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2439:1: ( rule__Expression7__Group_1_0__2__Impl )
            // InternalHale.g:2440:2: rule__Expression7__Group_1_0__2__Impl
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
    // InternalHale.g:2446:1: rule__Expression7__Group_1_0__2__Impl : ( ( rule__Expression7__RightAssignment_1_0_2 ) ) ;
    public final void rule__Expression7__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2450:1: ( ( ( rule__Expression7__RightAssignment_1_0_2 ) ) )
            // InternalHale.g:2451:1: ( ( rule__Expression7__RightAssignment_1_0_2 ) )
            {
            // InternalHale.g:2451:1: ( ( rule__Expression7__RightAssignment_1_0_2 ) )
            // InternalHale.g:2452:2: ( rule__Expression7__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getExpression7Access().getRightAssignment_1_0_2()); 
            // InternalHale.g:2453:2: ( rule__Expression7__RightAssignment_1_0_2 )
            // InternalHale.g:2453:3: rule__Expression7__RightAssignment_1_0_2
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
    // InternalHale.g:2462:1: rule__Expression7__Group_1_1__0 : rule__Expression7__Group_1_1__0__Impl rule__Expression7__Group_1_1__1 ;
    public final void rule__Expression7__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2466:1: ( rule__Expression7__Group_1_1__0__Impl rule__Expression7__Group_1_1__1 )
            // InternalHale.g:2467:2: rule__Expression7__Group_1_1__0__Impl rule__Expression7__Group_1_1__1
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
    // InternalHale.g:2474:1: rule__Expression7__Group_1_1__0__Impl : ( () ) ;
    public final void rule__Expression7__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2478:1: ( ( () ) )
            // InternalHale.g:2479:1: ( () )
            {
            // InternalHale.g:2479:1: ( () )
            // InternalHale.g:2480:2: ()
            {
             before(grammarAccess.getExpression7Access().getLessThanLeftAction_1_1_0()); 
            // InternalHale.g:2481:2: ()
            // InternalHale.g:2481:3: 
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
    // InternalHale.g:2489:1: rule__Expression7__Group_1_1__1 : rule__Expression7__Group_1_1__1__Impl rule__Expression7__Group_1_1__2 ;
    public final void rule__Expression7__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2493:1: ( rule__Expression7__Group_1_1__1__Impl rule__Expression7__Group_1_1__2 )
            // InternalHale.g:2494:2: rule__Expression7__Group_1_1__1__Impl rule__Expression7__Group_1_1__2
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
    // InternalHale.g:2501:1: rule__Expression7__Group_1_1__1__Impl : ( '<' ) ;
    public final void rule__Expression7__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2505:1: ( ( '<' ) )
            // InternalHale.g:2506:1: ( '<' )
            {
            // InternalHale.g:2506:1: ( '<' )
            // InternalHale.g:2507:2: '<'
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
    // InternalHale.g:2516:1: rule__Expression7__Group_1_1__2 : rule__Expression7__Group_1_1__2__Impl ;
    public final void rule__Expression7__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2520:1: ( rule__Expression7__Group_1_1__2__Impl )
            // InternalHale.g:2521:2: rule__Expression7__Group_1_1__2__Impl
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
    // InternalHale.g:2527:1: rule__Expression7__Group_1_1__2__Impl : ( ( rule__Expression7__RightAssignment_1_1_2 ) ) ;
    public final void rule__Expression7__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2531:1: ( ( ( rule__Expression7__RightAssignment_1_1_2 ) ) )
            // InternalHale.g:2532:1: ( ( rule__Expression7__RightAssignment_1_1_2 ) )
            {
            // InternalHale.g:2532:1: ( ( rule__Expression7__RightAssignment_1_1_2 ) )
            // InternalHale.g:2533:2: ( rule__Expression7__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getExpression7Access().getRightAssignment_1_1_2()); 
            // InternalHale.g:2534:2: ( rule__Expression7__RightAssignment_1_1_2 )
            // InternalHale.g:2534:3: rule__Expression7__RightAssignment_1_1_2
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
    // InternalHale.g:2543:1: rule__Expression7__Group_1_2__0 : rule__Expression7__Group_1_2__0__Impl rule__Expression7__Group_1_2__1 ;
    public final void rule__Expression7__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2547:1: ( rule__Expression7__Group_1_2__0__Impl rule__Expression7__Group_1_2__1 )
            // InternalHale.g:2548:2: rule__Expression7__Group_1_2__0__Impl rule__Expression7__Group_1_2__1
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
    // InternalHale.g:2555:1: rule__Expression7__Group_1_2__0__Impl : ( () ) ;
    public final void rule__Expression7__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2559:1: ( ( () ) )
            // InternalHale.g:2560:1: ( () )
            {
            // InternalHale.g:2560:1: ( () )
            // InternalHale.g:2561:2: ()
            {
             before(grammarAccess.getExpression7Access().getGreaterThanOrEqualLeftAction_1_2_0()); 
            // InternalHale.g:2562:2: ()
            // InternalHale.g:2562:3: 
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
    // InternalHale.g:2570:1: rule__Expression7__Group_1_2__1 : rule__Expression7__Group_1_2__1__Impl rule__Expression7__Group_1_2__2 ;
    public final void rule__Expression7__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2574:1: ( rule__Expression7__Group_1_2__1__Impl rule__Expression7__Group_1_2__2 )
            // InternalHale.g:2575:2: rule__Expression7__Group_1_2__1__Impl rule__Expression7__Group_1_2__2
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
    // InternalHale.g:2582:1: rule__Expression7__Group_1_2__1__Impl : ( '>=' ) ;
    public final void rule__Expression7__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2586:1: ( ( '>=' ) )
            // InternalHale.g:2587:1: ( '>=' )
            {
            // InternalHale.g:2587:1: ( '>=' )
            // InternalHale.g:2588:2: '>='
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
    // InternalHale.g:2597:1: rule__Expression7__Group_1_2__2 : rule__Expression7__Group_1_2__2__Impl ;
    public final void rule__Expression7__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2601:1: ( rule__Expression7__Group_1_2__2__Impl )
            // InternalHale.g:2602:2: rule__Expression7__Group_1_2__2__Impl
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
    // InternalHale.g:2608:1: rule__Expression7__Group_1_2__2__Impl : ( ( rule__Expression7__RightAssignment_1_2_2 ) ) ;
    public final void rule__Expression7__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2612:1: ( ( ( rule__Expression7__RightAssignment_1_2_2 ) ) )
            // InternalHale.g:2613:1: ( ( rule__Expression7__RightAssignment_1_2_2 ) )
            {
            // InternalHale.g:2613:1: ( ( rule__Expression7__RightAssignment_1_2_2 ) )
            // InternalHale.g:2614:2: ( rule__Expression7__RightAssignment_1_2_2 )
            {
             before(grammarAccess.getExpression7Access().getRightAssignment_1_2_2()); 
            // InternalHale.g:2615:2: ( rule__Expression7__RightAssignment_1_2_2 )
            // InternalHale.g:2615:3: rule__Expression7__RightAssignment_1_2_2
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
    // InternalHale.g:2624:1: rule__Expression7__Group_1_3__0 : rule__Expression7__Group_1_3__0__Impl rule__Expression7__Group_1_3__1 ;
    public final void rule__Expression7__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2628:1: ( rule__Expression7__Group_1_3__0__Impl rule__Expression7__Group_1_3__1 )
            // InternalHale.g:2629:2: rule__Expression7__Group_1_3__0__Impl rule__Expression7__Group_1_3__1
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
    // InternalHale.g:2636:1: rule__Expression7__Group_1_3__0__Impl : ( () ) ;
    public final void rule__Expression7__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2640:1: ( ( () ) )
            // InternalHale.g:2641:1: ( () )
            {
            // InternalHale.g:2641:1: ( () )
            // InternalHale.g:2642:2: ()
            {
             before(grammarAccess.getExpression7Access().getGreaterThanLeftAction_1_3_0()); 
            // InternalHale.g:2643:2: ()
            // InternalHale.g:2643:3: 
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
    // InternalHale.g:2651:1: rule__Expression7__Group_1_3__1 : rule__Expression7__Group_1_3__1__Impl rule__Expression7__Group_1_3__2 ;
    public final void rule__Expression7__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2655:1: ( rule__Expression7__Group_1_3__1__Impl rule__Expression7__Group_1_3__2 )
            // InternalHale.g:2656:2: rule__Expression7__Group_1_3__1__Impl rule__Expression7__Group_1_3__2
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
    // InternalHale.g:2663:1: rule__Expression7__Group_1_3__1__Impl : ( '>' ) ;
    public final void rule__Expression7__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2667:1: ( ( '>' ) )
            // InternalHale.g:2668:1: ( '>' )
            {
            // InternalHale.g:2668:1: ( '>' )
            // InternalHale.g:2669:2: '>'
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
    // InternalHale.g:2678:1: rule__Expression7__Group_1_3__2 : rule__Expression7__Group_1_3__2__Impl ;
    public final void rule__Expression7__Group_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2682:1: ( rule__Expression7__Group_1_3__2__Impl )
            // InternalHale.g:2683:2: rule__Expression7__Group_1_3__2__Impl
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
    // InternalHale.g:2689:1: rule__Expression7__Group_1_3__2__Impl : ( ( rule__Expression7__RightAssignment_1_3_2 ) ) ;
    public final void rule__Expression7__Group_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2693:1: ( ( ( rule__Expression7__RightAssignment_1_3_2 ) ) )
            // InternalHale.g:2694:1: ( ( rule__Expression7__RightAssignment_1_3_2 ) )
            {
            // InternalHale.g:2694:1: ( ( rule__Expression7__RightAssignment_1_3_2 ) )
            // InternalHale.g:2695:2: ( rule__Expression7__RightAssignment_1_3_2 )
            {
             before(grammarAccess.getExpression7Access().getRightAssignment_1_3_2()); 
            // InternalHale.g:2696:2: ( rule__Expression7__RightAssignment_1_3_2 )
            // InternalHale.g:2696:3: rule__Expression7__RightAssignment_1_3_2
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
    // InternalHale.g:2705:1: rule__Expression6__Group__0 : rule__Expression6__Group__0__Impl rule__Expression6__Group__1 ;
    public final void rule__Expression6__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2709:1: ( rule__Expression6__Group__0__Impl rule__Expression6__Group__1 )
            // InternalHale.g:2710:2: rule__Expression6__Group__0__Impl rule__Expression6__Group__1
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
    // InternalHale.g:2717:1: rule__Expression6__Group__0__Impl : ( ruleExpression5 ) ;
    public final void rule__Expression6__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2721:1: ( ( ruleExpression5 ) )
            // InternalHale.g:2722:1: ( ruleExpression5 )
            {
            // InternalHale.g:2722:1: ( ruleExpression5 )
            // InternalHale.g:2723:2: ruleExpression5
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
    // InternalHale.g:2732:1: rule__Expression6__Group__1 : rule__Expression6__Group__1__Impl ;
    public final void rule__Expression6__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2736:1: ( rule__Expression6__Group__1__Impl )
            // InternalHale.g:2737:2: rule__Expression6__Group__1__Impl
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
    // InternalHale.g:2743:1: rule__Expression6__Group__1__Impl : ( ( rule__Expression6__Alternatives_1 )* ) ;
    public final void rule__Expression6__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2747:1: ( ( ( rule__Expression6__Alternatives_1 )* ) )
            // InternalHale.g:2748:1: ( ( rule__Expression6__Alternatives_1 )* )
            {
            // InternalHale.g:2748:1: ( ( rule__Expression6__Alternatives_1 )* )
            // InternalHale.g:2749:2: ( rule__Expression6__Alternatives_1 )*
            {
             before(grammarAccess.getExpression6Access().getAlternatives_1()); 
            // InternalHale.g:2750:2: ( rule__Expression6__Alternatives_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=24 && LA20_0<=25)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalHale.g:2750:3: rule__Expression6__Alternatives_1
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
    // InternalHale.g:2759:1: rule__Expression6__Group_1_0__0 : rule__Expression6__Group_1_0__0__Impl rule__Expression6__Group_1_0__1 ;
    public final void rule__Expression6__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2763:1: ( rule__Expression6__Group_1_0__0__Impl rule__Expression6__Group_1_0__1 )
            // InternalHale.g:2764:2: rule__Expression6__Group_1_0__0__Impl rule__Expression6__Group_1_0__1
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
    // InternalHale.g:2771:1: rule__Expression6__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Expression6__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2775:1: ( ( () ) )
            // InternalHale.g:2776:1: ( () )
            {
            // InternalHale.g:2776:1: ( () )
            // InternalHale.g:2777:2: ()
            {
             before(grammarAccess.getExpression6Access().getAdditionLeftAction_1_0_0()); 
            // InternalHale.g:2778:2: ()
            // InternalHale.g:2778:3: 
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
    // InternalHale.g:2786:1: rule__Expression6__Group_1_0__1 : rule__Expression6__Group_1_0__1__Impl rule__Expression6__Group_1_0__2 ;
    public final void rule__Expression6__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2790:1: ( rule__Expression6__Group_1_0__1__Impl rule__Expression6__Group_1_0__2 )
            // InternalHale.g:2791:2: rule__Expression6__Group_1_0__1__Impl rule__Expression6__Group_1_0__2
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
    // InternalHale.g:2798:1: rule__Expression6__Group_1_0__1__Impl : ( '+' ) ;
    public final void rule__Expression6__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2802:1: ( ( '+' ) )
            // InternalHale.g:2803:1: ( '+' )
            {
            // InternalHale.g:2803:1: ( '+' )
            // InternalHale.g:2804:2: '+'
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
    // InternalHale.g:2813:1: rule__Expression6__Group_1_0__2 : rule__Expression6__Group_1_0__2__Impl ;
    public final void rule__Expression6__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2817:1: ( rule__Expression6__Group_1_0__2__Impl )
            // InternalHale.g:2818:2: rule__Expression6__Group_1_0__2__Impl
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
    // InternalHale.g:2824:1: rule__Expression6__Group_1_0__2__Impl : ( ( rule__Expression6__RightAssignment_1_0_2 ) ) ;
    public final void rule__Expression6__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2828:1: ( ( ( rule__Expression6__RightAssignment_1_0_2 ) ) )
            // InternalHale.g:2829:1: ( ( rule__Expression6__RightAssignment_1_0_2 ) )
            {
            // InternalHale.g:2829:1: ( ( rule__Expression6__RightAssignment_1_0_2 ) )
            // InternalHale.g:2830:2: ( rule__Expression6__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getExpression6Access().getRightAssignment_1_0_2()); 
            // InternalHale.g:2831:2: ( rule__Expression6__RightAssignment_1_0_2 )
            // InternalHale.g:2831:3: rule__Expression6__RightAssignment_1_0_2
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
    // InternalHale.g:2840:1: rule__Expression6__Group_1_1__0 : rule__Expression6__Group_1_1__0__Impl rule__Expression6__Group_1_1__1 ;
    public final void rule__Expression6__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2844:1: ( rule__Expression6__Group_1_1__0__Impl rule__Expression6__Group_1_1__1 )
            // InternalHale.g:2845:2: rule__Expression6__Group_1_1__0__Impl rule__Expression6__Group_1_1__1
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
    // InternalHale.g:2852:1: rule__Expression6__Group_1_1__0__Impl : ( () ) ;
    public final void rule__Expression6__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2856:1: ( ( () ) )
            // InternalHale.g:2857:1: ( () )
            {
            // InternalHale.g:2857:1: ( () )
            // InternalHale.g:2858:2: ()
            {
             before(grammarAccess.getExpression6Access().getSubtractionLeftAction_1_1_0()); 
            // InternalHale.g:2859:2: ()
            // InternalHale.g:2859:3: 
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
    // InternalHale.g:2867:1: rule__Expression6__Group_1_1__1 : rule__Expression6__Group_1_1__1__Impl rule__Expression6__Group_1_1__2 ;
    public final void rule__Expression6__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2871:1: ( rule__Expression6__Group_1_1__1__Impl rule__Expression6__Group_1_1__2 )
            // InternalHale.g:2872:2: rule__Expression6__Group_1_1__1__Impl rule__Expression6__Group_1_1__2
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
    // InternalHale.g:2879:1: rule__Expression6__Group_1_1__1__Impl : ( '-' ) ;
    public final void rule__Expression6__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2883:1: ( ( '-' ) )
            // InternalHale.g:2884:1: ( '-' )
            {
            // InternalHale.g:2884:1: ( '-' )
            // InternalHale.g:2885:2: '-'
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
    // InternalHale.g:2894:1: rule__Expression6__Group_1_1__2 : rule__Expression6__Group_1_1__2__Impl ;
    public final void rule__Expression6__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2898:1: ( rule__Expression6__Group_1_1__2__Impl )
            // InternalHale.g:2899:2: rule__Expression6__Group_1_1__2__Impl
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
    // InternalHale.g:2905:1: rule__Expression6__Group_1_1__2__Impl : ( ( rule__Expression6__RightAssignment_1_1_2 ) ) ;
    public final void rule__Expression6__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2909:1: ( ( ( rule__Expression6__RightAssignment_1_1_2 ) ) )
            // InternalHale.g:2910:1: ( ( rule__Expression6__RightAssignment_1_1_2 ) )
            {
            // InternalHale.g:2910:1: ( ( rule__Expression6__RightAssignment_1_1_2 ) )
            // InternalHale.g:2911:2: ( rule__Expression6__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getExpression6Access().getRightAssignment_1_1_2()); 
            // InternalHale.g:2912:2: ( rule__Expression6__RightAssignment_1_1_2 )
            // InternalHale.g:2912:3: rule__Expression6__RightAssignment_1_1_2
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
    // InternalHale.g:2921:1: rule__Expression5__Group__0 : rule__Expression5__Group__0__Impl rule__Expression5__Group__1 ;
    public final void rule__Expression5__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2925:1: ( rule__Expression5__Group__0__Impl rule__Expression5__Group__1 )
            // InternalHale.g:2926:2: rule__Expression5__Group__0__Impl rule__Expression5__Group__1
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
    // InternalHale.g:2933:1: rule__Expression5__Group__0__Impl : ( ruleExpression4 ) ;
    public final void rule__Expression5__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2937:1: ( ( ruleExpression4 ) )
            // InternalHale.g:2938:1: ( ruleExpression4 )
            {
            // InternalHale.g:2938:1: ( ruleExpression4 )
            // InternalHale.g:2939:2: ruleExpression4
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
    // InternalHale.g:2948:1: rule__Expression5__Group__1 : rule__Expression5__Group__1__Impl ;
    public final void rule__Expression5__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2952:1: ( rule__Expression5__Group__1__Impl )
            // InternalHale.g:2953:2: rule__Expression5__Group__1__Impl
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
    // InternalHale.g:2959:1: rule__Expression5__Group__1__Impl : ( ( rule__Expression5__Alternatives_1 )* ) ;
    public final void rule__Expression5__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2963:1: ( ( ( rule__Expression5__Alternatives_1 )* ) )
            // InternalHale.g:2964:1: ( ( rule__Expression5__Alternatives_1 )* )
            {
            // InternalHale.g:2964:1: ( ( rule__Expression5__Alternatives_1 )* )
            // InternalHale.g:2965:2: ( rule__Expression5__Alternatives_1 )*
            {
             before(grammarAccess.getExpression5Access().getAlternatives_1()); 
            // InternalHale.g:2966:2: ( rule__Expression5__Alternatives_1 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=26 && LA21_0<=28)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalHale.g:2966:3: rule__Expression5__Alternatives_1
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
    // InternalHale.g:2975:1: rule__Expression5__Group_1_0__0 : rule__Expression5__Group_1_0__0__Impl rule__Expression5__Group_1_0__1 ;
    public final void rule__Expression5__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2979:1: ( rule__Expression5__Group_1_0__0__Impl rule__Expression5__Group_1_0__1 )
            // InternalHale.g:2980:2: rule__Expression5__Group_1_0__0__Impl rule__Expression5__Group_1_0__1
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
    // InternalHale.g:2987:1: rule__Expression5__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Expression5__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:2991:1: ( ( () ) )
            // InternalHale.g:2992:1: ( () )
            {
            // InternalHale.g:2992:1: ( () )
            // InternalHale.g:2993:2: ()
            {
             before(grammarAccess.getExpression5Access().getMultiplicationLeftAction_1_0_0()); 
            // InternalHale.g:2994:2: ()
            // InternalHale.g:2994:3: 
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
    // InternalHale.g:3002:1: rule__Expression5__Group_1_0__1 : rule__Expression5__Group_1_0__1__Impl rule__Expression5__Group_1_0__2 ;
    public final void rule__Expression5__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3006:1: ( rule__Expression5__Group_1_0__1__Impl rule__Expression5__Group_1_0__2 )
            // InternalHale.g:3007:2: rule__Expression5__Group_1_0__1__Impl rule__Expression5__Group_1_0__2
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
    // InternalHale.g:3014:1: rule__Expression5__Group_1_0__1__Impl : ( '*' ) ;
    public final void rule__Expression5__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3018:1: ( ( '*' ) )
            // InternalHale.g:3019:1: ( '*' )
            {
            // InternalHale.g:3019:1: ( '*' )
            // InternalHale.g:3020:2: '*'
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
    // InternalHale.g:3029:1: rule__Expression5__Group_1_0__2 : rule__Expression5__Group_1_0__2__Impl ;
    public final void rule__Expression5__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3033:1: ( rule__Expression5__Group_1_0__2__Impl )
            // InternalHale.g:3034:2: rule__Expression5__Group_1_0__2__Impl
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
    // InternalHale.g:3040:1: rule__Expression5__Group_1_0__2__Impl : ( ( rule__Expression5__RightAssignment_1_0_2 ) ) ;
    public final void rule__Expression5__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3044:1: ( ( ( rule__Expression5__RightAssignment_1_0_2 ) ) )
            // InternalHale.g:3045:1: ( ( rule__Expression5__RightAssignment_1_0_2 ) )
            {
            // InternalHale.g:3045:1: ( ( rule__Expression5__RightAssignment_1_0_2 ) )
            // InternalHale.g:3046:2: ( rule__Expression5__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getExpression5Access().getRightAssignment_1_0_2()); 
            // InternalHale.g:3047:2: ( rule__Expression5__RightAssignment_1_0_2 )
            // InternalHale.g:3047:3: rule__Expression5__RightAssignment_1_0_2
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
    // InternalHale.g:3056:1: rule__Expression5__Group_1_1__0 : rule__Expression5__Group_1_1__0__Impl rule__Expression5__Group_1_1__1 ;
    public final void rule__Expression5__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3060:1: ( rule__Expression5__Group_1_1__0__Impl rule__Expression5__Group_1_1__1 )
            // InternalHale.g:3061:2: rule__Expression5__Group_1_1__0__Impl rule__Expression5__Group_1_1__1
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
    // InternalHale.g:3068:1: rule__Expression5__Group_1_1__0__Impl : ( () ) ;
    public final void rule__Expression5__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3072:1: ( ( () ) )
            // InternalHale.g:3073:1: ( () )
            {
            // InternalHale.g:3073:1: ( () )
            // InternalHale.g:3074:2: ()
            {
             before(grammarAccess.getExpression5Access().getDivisionLeftAction_1_1_0()); 
            // InternalHale.g:3075:2: ()
            // InternalHale.g:3075:3: 
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
    // InternalHale.g:3083:1: rule__Expression5__Group_1_1__1 : rule__Expression5__Group_1_1__1__Impl rule__Expression5__Group_1_1__2 ;
    public final void rule__Expression5__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3087:1: ( rule__Expression5__Group_1_1__1__Impl rule__Expression5__Group_1_1__2 )
            // InternalHale.g:3088:2: rule__Expression5__Group_1_1__1__Impl rule__Expression5__Group_1_1__2
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
    // InternalHale.g:3095:1: rule__Expression5__Group_1_1__1__Impl : ( '/' ) ;
    public final void rule__Expression5__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3099:1: ( ( '/' ) )
            // InternalHale.g:3100:1: ( '/' )
            {
            // InternalHale.g:3100:1: ( '/' )
            // InternalHale.g:3101:2: '/'
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
    // InternalHale.g:3110:1: rule__Expression5__Group_1_1__2 : rule__Expression5__Group_1_1__2__Impl ;
    public final void rule__Expression5__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3114:1: ( rule__Expression5__Group_1_1__2__Impl )
            // InternalHale.g:3115:2: rule__Expression5__Group_1_1__2__Impl
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
    // InternalHale.g:3121:1: rule__Expression5__Group_1_1__2__Impl : ( ( rule__Expression5__RightAssignment_1_1_2 ) ) ;
    public final void rule__Expression5__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3125:1: ( ( ( rule__Expression5__RightAssignment_1_1_2 ) ) )
            // InternalHale.g:3126:1: ( ( rule__Expression5__RightAssignment_1_1_2 ) )
            {
            // InternalHale.g:3126:1: ( ( rule__Expression5__RightAssignment_1_1_2 ) )
            // InternalHale.g:3127:2: ( rule__Expression5__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getExpression5Access().getRightAssignment_1_1_2()); 
            // InternalHale.g:3128:2: ( rule__Expression5__RightAssignment_1_1_2 )
            // InternalHale.g:3128:3: rule__Expression5__RightAssignment_1_1_2
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
    // InternalHale.g:3137:1: rule__Expression5__Group_1_2__0 : rule__Expression5__Group_1_2__0__Impl rule__Expression5__Group_1_2__1 ;
    public final void rule__Expression5__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3141:1: ( rule__Expression5__Group_1_2__0__Impl rule__Expression5__Group_1_2__1 )
            // InternalHale.g:3142:2: rule__Expression5__Group_1_2__0__Impl rule__Expression5__Group_1_2__1
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
    // InternalHale.g:3149:1: rule__Expression5__Group_1_2__0__Impl : ( () ) ;
    public final void rule__Expression5__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3153:1: ( ( () ) )
            // InternalHale.g:3154:1: ( () )
            {
            // InternalHale.g:3154:1: ( () )
            // InternalHale.g:3155:2: ()
            {
             before(grammarAccess.getExpression5Access().getRemainderLeftAction_1_2_0()); 
            // InternalHale.g:3156:2: ()
            // InternalHale.g:3156:3: 
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
    // InternalHale.g:3164:1: rule__Expression5__Group_1_2__1 : rule__Expression5__Group_1_2__1__Impl rule__Expression5__Group_1_2__2 ;
    public final void rule__Expression5__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3168:1: ( rule__Expression5__Group_1_2__1__Impl rule__Expression5__Group_1_2__2 )
            // InternalHale.g:3169:2: rule__Expression5__Group_1_2__1__Impl rule__Expression5__Group_1_2__2
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
    // InternalHale.g:3176:1: rule__Expression5__Group_1_2__1__Impl : ( '%' ) ;
    public final void rule__Expression5__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3180:1: ( ( '%' ) )
            // InternalHale.g:3181:1: ( '%' )
            {
            // InternalHale.g:3181:1: ( '%' )
            // InternalHale.g:3182:2: '%'
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
    // InternalHale.g:3191:1: rule__Expression5__Group_1_2__2 : rule__Expression5__Group_1_2__2__Impl ;
    public final void rule__Expression5__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3195:1: ( rule__Expression5__Group_1_2__2__Impl )
            // InternalHale.g:3196:2: rule__Expression5__Group_1_2__2__Impl
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
    // InternalHale.g:3202:1: rule__Expression5__Group_1_2__2__Impl : ( ( rule__Expression5__RightAssignment_1_2_2 ) ) ;
    public final void rule__Expression5__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3206:1: ( ( ( rule__Expression5__RightAssignment_1_2_2 ) ) )
            // InternalHale.g:3207:1: ( ( rule__Expression5__RightAssignment_1_2_2 ) )
            {
            // InternalHale.g:3207:1: ( ( rule__Expression5__RightAssignment_1_2_2 ) )
            // InternalHale.g:3208:2: ( rule__Expression5__RightAssignment_1_2_2 )
            {
             before(grammarAccess.getExpression5Access().getRightAssignment_1_2_2()); 
            // InternalHale.g:3209:2: ( rule__Expression5__RightAssignment_1_2_2 )
            // InternalHale.g:3209:3: rule__Expression5__RightAssignment_1_2_2
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
    // InternalHale.g:3218:1: rule__Expression4__Group__0 : rule__Expression4__Group__0__Impl rule__Expression4__Group__1 ;
    public final void rule__Expression4__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3222:1: ( rule__Expression4__Group__0__Impl rule__Expression4__Group__1 )
            // InternalHale.g:3223:2: rule__Expression4__Group__0__Impl rule__Expression4__Group__1
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
    // InternalHale.g:3230:1: rule__Expression4__Group__0__Impl : ( ruleExpression3 ) ;
    public final void rule__Expression4__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3234:1: ( ( ruleExpression3 ) )
            // InternalHale.g:3235:1: ( ruleExpression3 )
            {
            // InternalHale.g:3235:1: ( ruleExpression3 )
            // InternalHale.g:3236:2: ruleExpression3
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
    // InternalHale.g:3245:1: rule__Expression4__Group__1 : rule__Expression4__Group__1__Impl ;
    public final void rule__Expression4__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3249:1: ( rule__Expression4__Group__1__Impl )
            // InternalHale.g:3250:2: rule__Expression4__Group__1__Impl
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
    // InternalHale.g:3256:1: rule__Expression4__Group__1__Impl : ( ( rule__Expression4__Group_1__0 )* ) ;
    public final void rule__Expression4__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3260:1: ( ( ( rule__Expression4__Group_1__0 )* ) )
            // InternalHale.g:3261:1: ( ( rule__Expression4__Group_1__0 )* )
            {
            // InternalHale.g:3261:1: ( ( rule__Expression4__Group_1__0 )* )
            // InternalHale.g:3262:2: ( rule__Expression4__Group_1__0 )*
            {
             before(grammarAccess.getExpression4Access().getGroup_1()); 
            // InternalHale.g:3263:2: ( rule__Expression4__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==29) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalHale.g:3263:3: rule__Expression4__Group_1__0
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
    // InternalHale.g:3272:1: rule__Expression4__Group_1__0 : rule__Expression4__Group_1__0__Impl rule__Expression4__Group_1__1 ;
    public final void rule__Expression4__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3276:1: ( rule__Expression4__Group_1__0__Impl rule__Expression4__Group_1__1 )
            // InternalHale.g:3277:2: rule__Expression4__Group_1__0__Impl rule__Expression4__Group_1__1
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
    // InternalHale.g:3284:1: rule__Expression4__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression4__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3288:1: ( ( () ) )
            // InternalHale.g:3289:1: ( () )
            {
            // InternalHale.g:3289:1: ( () )
            // InternalHale.g:3290:2: ()
            {
             before(grammarAccess.getExpression4Access().getExponentiationLeftAction_1_0()); 
            // InternalHale.g:3291:2: ()
            // InternalHale.g:3291:3: 
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
    // InternalHale.g:3299:1: rule__Expression4__Group_1__1 : rule__Expression4__Group_1__1__Impl rule__Expression4__Group_1__2 ;
    public final void rule__Expression4__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3303:1: ( rule__Expression4__Group_1__1__Impl rule__Expression4__Group_1__2 )
            // InternalHale.g:3304:2: rule__Expression4__Group_1__1__Impl rule__Expression4__Group_1__2
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
    // InternalHale.g:3311:1: rule__Expression4__Group_1__1__Impl : ( '**' ) ;
    public final void rule__Expression4__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3315:1: ( ( '**' ) )
            // InternalHale.g:3316:1: ( '**' )
            {
            // InternalHale.g:3316:1: ( '**' )
            // InternalHale.g:3317:2: '**'
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
    // InternalHale.g:3326:1: rule__Expression4__Group_1__2 : rule__Expression4__Group_1__2__Impl ;
    public final void rule__Expression4__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3330:1: ( rule__Expression4__Group_1__2__Impl )
            // InternalHale.g:3331:2: rule__Expression4__Group_1__2__Impl
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
    // InternalHale.g:3337:1: rule__Expression4__Group_1__2__Impl : ( ( rule__Expression4__RightAssignment_1_2 ) ) ;
    public final void rule__Expression4__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3341:1: ( ( ( rule__Expression4__RightAssignment_1_2 ) ) )
            // InternalHale.g:3342:1: ( ( rule__Expression4__RightAssignment_1_2 ) )
            {
            // InternalHale.g:3342:1: ( ( rule__Expression4__RightAssignment_1_2 ) )
            // InternalHale.g:3343:2: ( rule__Expression4__RightAssignment_1_2 )
            {
             before(grammarAccess.getExpression4Access().getRightAssignment_1_2()); 
            // InternalHale.g:3344:2: ( rule__Expression4__RightAssignment_1_2 )
            // InternalHale.g:3344:3: rule__Expression4__RightAssignment_1_2
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
    // InternalHale.g:3353:1: rule__Expression3__Group__0 : rule__Expression3__Group__0__Impl rule__Expression3__Group__1 ;
    public final void rule__Expression3__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3357:1: ( rule__Expression3__Group__0__Impl rule__Expression3__Group__1 )
            // InternalHale.g:3358:2: rule__Expression3__Group__0__Impl rule__Expression3__Group__1
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
    // InternalHale.g:3365:1: rule__Expression3__Group__0__Impl : ( ruleExpression2 ) ;
    public final void rule__Expression3__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3369:1: ( ( ruleExpression2 ) )
            // InternalHale.g:3370:1: ( ruleExpression2 )
            {
            // InternalHale.g:3370:1: ( ruleExpression2 )
            // InternalHale.g:3371:2: ruleExpression2
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
    // InternalHale.g:3380:1: rule__Expression3__Group__1 : rule__Expression3__Group__1__Impl ;
    public final void rule__Expression3__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3384:1: ( rule__Expression3__Group__1__Impl )
            // InternalHale.g:3385:2: rule__Expression3__Group__1__Impl
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
    // InternalHale.g:3391:1: rule__Expression3__Group__1__Impl : ( ( rule__Expression3__Group_1__0 )* ) ;
    public final void rule__Expression3__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3395:1: ( ( ( rule__Expression3__Group_1__0 )* ) )
            // InternalHale.g:3396:1: ( ( rule__Expression3__Group_1__0 )* )
            {
            // InternalHale.g:3396:1: ( ( rule__Expression3__Group_1__0 )* )
            // InternalHale.g:3397:2: ( rule__Expression3__Group_1__0 )*
            {
             before(grammarAccess.getExpression3Access().getGroup_1()); 
            // InternalHale.g:3398:2: ( rule__Expression3__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==30) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalHale.g:3398:3: rule__Expression3__Group_1__0
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
    // InternalHale.g:3407:1: rule__Expression3__Group_1__0 : rule__Expression3__Group_1__0__Impl rule__Expression3__Group_1__1 ;
    public final void rule__Expression3__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3411:1: ( rule__Expression3__Group_1__0__Impl rule__Expression3__Group_1__1 )
            // InternalHale.g:3412:2: rule__Expression3__Group_1__0__Impl rule__Expression3__Group_1__1
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
    // InternalHale.g:3419:1: rule__Expression3__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression3__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3423:1: ( ( () ) )
            // InternalHale.g:3424:1: ( () )
            {
            // InternalHale.g:3424:1: ( () )
            // InternalHale.g:3425:2: ()
            {
             before(grammarAccess.getExpression3Access().getConversionLeftAction_1_0()); 
            // InternalHale.g:3426:2: ()
            // InternalHale.g:3426:3: 
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
    // InternalHale.g:3434:1: rule__Expression3__Group_1__1 : rule__Expression3__Group_1__1__Impl rule__Expression3__Group_1__2 ;
    public final void rule__Expression3__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3438:1: ( rule__Expression3__Group_1__1__Impl rule__Expression3__Group_1__2 )
            // InternalHale.g:3439:2: rule__Expression3__Group_1__1__Impl rule__Expression3__Group_1__2
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
    // InternalHale.g:3446:1: rule__Expression3__Group_1__1__Impl : ( 'as' ) ;
    public final void rule__Expression3__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3450:1: ( ( 'as' ) )
            // InternalHale.g:3451:1: ( 'as' )
            {
            // InternalHale.g:3451:1: ( 'as' )
            // InternalHale.g:3452:2: 'as'
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
    // InternalHale.g:3461:1: rule__Expression3__Group_1__2 : rule__Expression3__Group_1__2__Impl ;
    public final void rule__Expression3__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3465:1: ( rule__Expression3__Group_1__2__Impl )
            // InternalHale.g:3466:2: rule__Expression3__Group_1__2__Impl
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
    // InternalHale.g:3472:1: rule__Expression3__Group_1__2__Impl : ( ( rule__Expression3__RightAssignment_1_2 ) ) ;
    public final void rule__Expression3__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3476:1: ( ( ( rule__Expression3__RightAssignment_1_2 ) ) )
            // InternalHale.g:3477:1: ( ( rule__Expression3__RightAssignment_1_2 ) )
            {
            // InternalHale.g:3477:1: ( ( rule__Expression3__RightAssignment_1_2 ) )
            // InternalHale.g:3478:2: ( rule__Expression3__RightAssignment_1_2 )
            {
             before(grammarAccess.getExpression3Access().getRightAssignment_1_2()); 
            // InternalHale.g:3479:2: ( rule__Expression3__RightAssignment_1_2 )
            // InternalHale.g:3479:3: rule__Expression3__RightAssignment_1_2
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
    // InternalHale.g:3488:1: rule__Expression2__Group_0__0 : rule__Expression2__Group_0__0__Impl rule__Expression2__Group_0__1 ;
    public final void rule__Expression2__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3492:1: ( rule__Expression2__Group_0__0__Impl rule__Expression2__Group_0__1 )
            // InternalHale.g:3493:2: rule__Expression2__Group_0__0__Impl rule__Expression2__Group_0__1
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
    // InternalHale.g:3500:1: rule__Expression2__Group_0__0__Impl : ( () ) ;
    public final void rule__Expression2__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3504:1: ( ( () ) )
            // InternalHale.g:3505:1: ( () )
            {
            // InternalHale.g:3505:1: ( () )
            // InternalHale.g:3506:2: ()
            {
             before(grammarAccess.getExpression2Access().getUnaryNegationAction_0_0()); 
            // InternalHale.g:3507:2: ()
            // InternalHale.g:3507:3: 
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
    // InternalHale.g:3515:1: rule__Expression2__Group_0__1 : rule__Expression2__Group_0__1__Impl rule__Expression2__Group_0__2 ;
    public final void rule__Expression2__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3519:1: ( rule__Expression2__Group_0__1__Impl rule__Expression2__Group_0__2 )
            // InternalHale.g:3520:2: rule__Expression2__Group_0__1__Impl rule__Expression2__Group_0__2
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
    // InternalHale.g:3527:1: rule__Expression2__Group_0__1__Impl : ( '-' ) ;
    public final void rule__Expression2__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3531:1: ( ( '-' ) )
            // InternalHale.g:3532:1: ( '-' )
            {
            // InternalHale.g:3532:1: ( '-' )
            // InternalHale.g:3533:2: '-'
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
    // InternalHale.g:3542:1: rule__Expression2__Group_0__2 : rule__Expression2__Group_0__2__Impl ;
    public final void rule__Expression2__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3546:1: ( rule__Expression2__Group_0__2__Impl )
            // InternalHale.g:3547:2: rule__Expression2__Group_0__2__Impl
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
    // InternalHale.g:3553:1: rule__Expression2__Group_0__2__Impl : ( ( rule__Expression2__InnerAssignment_0_2 ) ) ;
    public final void rule__Expression2__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3557:1: ( ( ( rule__Expression2__InnerAssignment_0_2 ) ) )
            // InternalHale.g:3558:1: ( ( rule__Expression2__InnerAssignment_0_2 ) )
            {
            // InternalHale.g:3558:1: ( ( rule__Expression2__InnerAssignment_0_2 ) )
            // InternalHale.g:3559:2: ( rule__Expression2__InnerAssignment_0_2 )
            {
             before(grammarAccess.getExpression2Access().getInnerAssignment_0_2()); 
            // InternalHale.g:3560:2: ( rule__Expression2__InnerAssignment_0_2 )
            // InternalHale.g:3560:3: rule__Expression2__InnerAssignment_0_2
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
    // InternalHale.g:3569:1: rule__Expression2__Group_1__0 : rule__Expression2__Group_1__0__Impl rule__Expression2__Group_1__1 ;
    public final void rule__Expression2__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3573:1: ( rule__Expression2__Group_1__0__Impl rule__Expression2__Group_1__1 )
            // InternalHale.g:3574:2: rule__Expression2__Group_1__0__Impl rule__Expression2__Group_1__1
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
    // InternalHale.g:3581:1: rule__Expression2__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression2__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3585:1: ( ( () ) )
            // InternalHale.g:3586:1: ( () )
            {
            // InternalHale.g:3586:1: ( () )
            // InternalHale.g:3587:2: ()
            {
             before(grammarAccess.getExpression2Access().getLogicalNotAction_1_0()); 
            // InternalHale.g:3588:2: ()
            // InternalHale.g:3588:3: 
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
    // InternalHale.g:3596:1: rule__Expression2__Group_1__1 : rule__Expression2__Group_1__1__Impl rule__Expression2__Group_1__2 ;
    public final void rule__Expression2__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3600:1: ( rule__Expression2__Group_1__1__Impl rule__Expression2__Group_1__2 )
            // InternalHale.g:3601:2: rule__Expression2__Group_1__1__Impl rule__Expression2__Group_1__2
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
    // InternalHale.g:3608:1: rule__Expression2__Group_1__1__Impl : ( 'not' ) ;
    public final void rule__Expression2__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3612:1: ( ( 'not' ) )
            // InternalHale.g:3613:1: ( 'not' )
            {
            // InternalHale.g:3613:1: ( 'not' )
            // InternalHale.g:3614:2: 'not'
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
    // InternalHale.g:3623:1: rule__Expression2__Group_1__2 : rule__Expression2__Group_1__2__Impl ;
    public final void rule__Expression2__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3627:1: ( rule__Expression2__Group_1__2__Impl )
            // InternalHale.g:3628:2: rule__Expression2__Group_1__2__Impl
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
    // InternalHale.g:3634:1: rule__Expression2__Group_1__2__Impl : ( ( rule__Expression2__InnerAssignment_1_2 ) ) ;
    public final void rule__Expression2__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3638:1: ( ( ( rule__Expression2__InnerAssignment_1_2 ) ) )
            // InternalHale.g:3639:1: ( ( rule__Expression2__InnerAssignment_1_2 ) )
            {
            // InternalHale.g:3639:1: ( ( rule__Expression2__InnerAssignment_1_2 ) )
            // InternalHale.g:3640:2: ( rule__Expression2__InnerAssignment_1_2 )
            {
             before(grammarAccess.getExpression2Access().getInnerAssignment_1_2()); 
            // InternalHale.g:3641:2: ( rule__Expression2__InnerAssignment_1_2 )
            // InternalHale.g:3641:3: rule__Expression2__InnerAssignment_1_2
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
    // InternalHale.g:3650:1: rule__Expression1__Group__0 : rule__Expression1__Group__0__Impl rule__Expression1__Group__1 ;
    public final void rule__Expression1__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3654:1: ( rule__Expression1__Group__0__Impl rule__Expression1__Group__1 )
            // InternalHale.g:3655:2: rule__Expression1__Group__0__Impl rule__Expression1__Group__1
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
    // InternalHale.g:3662:1: rule__Expression1__Group__0__Impl : ( ruleExpression0 ) ;
    public final void rule__Expression1__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3666:1: ( ( ruleExpression0 ) )
            // InternalHale.g:3667:1: ( ruleExpression0 )
            {
            // InternalHale.g:3667:1: ( ruleExpression0 )
            // InternalHale.g:3668:2: ruleExpression0
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
    // InternalHale.g:3677:1: rule__Expression1__Group__1 : rule__Expression1__Group__1__Impl ;
    public final void rule__Expression1__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3681:1: ( rule__Expression1__Group__1__Impl )
            // InternalHale.g:3682:2: rule__Expression1__Group__1__Impl
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
    // InternalHale.g:3688:1: rule__Expression1__Group__1__Impl : ( ( rule__Expression1__Group_1__0 )* ) ;
    public final void rule__Expression1__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3692:1: ( ( ( rule__Expression1__Group_1__0 )* ) )
            // InternalHale.g:3693:1: ( ( rule__Expression1__Group_1__0 )* )
            {
            // InternalHale.g:3693:1: ( ( rule__Expression1__Group_1__0 )* )
            // InternalHale.g:3694:2: ( rule__Expression1__Group_1__0 )*
            {
             before(grammarAccess.getExpression1Access().getGroup_1()); 
            // InternalHale.g:3695:2: ( rule__Expression1__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==32) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalHale.g:3695:3: rule__Expression1__Group_1__0
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
    // InternalHale.g:3704:1: rule__Expression1__Group_1__0 : rule__Expression1__Group_1__0__Impl rule__Expression1__Group_1__1 ;
    public final void rule__Expression1__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3708:1: ( rule__Expression1__Group_1__0__Impl rule__Expression1__Group_1__1 )
            // InternalHale.g:3709:2: rule__Expression1__Group_1__0__Impl rule__Expression1__Group_1__1
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
    // InternalHale.g:3716:1: rule__Expression1__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression1__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3720:1: ( ( () ) )
            // InternalHale.g:3721:1: ( () )
            {
            // InternalHale.g:3721:1: ( () )
            // InternalHale.g:3722:2: ()
            {
             before(grammarAccess.getExpression1Access().getApplicationExpressionAction_1_0()); 
            // InternalHale.g:3723:2: ()
            // InternalHale.g:3723:3: 
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
    // InternalHale.g:3731:1: rule__Expression1__Group_1__1 : rule__Expression1__Group_1__1__Impl rule__Expression1__Group_1__2 ;
    public final void rule__Expression1__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3735:1: ( rule__Expression1__Group_1__1__Impl rule__Expression1__Group_1__2 )
            // InternalHale.g:3736:2: rule__Expression1__Group_1__1__Impl rule__Expression1__Group_1__2
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
    // InternalHale.g:3743:1: rule__Expression1__Group_1__1__Impl : ( '(' ) ;
    public final void rule__Expression1__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3747:1: ( ( '(' ) )
            // InternalHale.g:3748:1: ( '(' )
            {
            // InternalHale.g:3748:1: ( '(' )
            // InternalHale.g:3749:2: '('
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
    // InternalHale.g:3758:1: rule__Expression1__Group_1__2 : rule__Expression1__Group_1__2__Impl rule__Expression1__Group_1__3 ;
    public final void rule__Expression1__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3762:1: ( rule__Expression1__Group_1__2__Impl rule__Expression1__Group_1__3 )
            // InternalHale.g:3763:2: rule__Expression1__Group_1__2__Impl rule__Expression1__Group_1__3
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
    // InternalHale.g:3770:1: rule__Expression1__Group_1__2__Impl : ( ( rule__Expression1__Group_1_2__0 )? ) ;
    public final void rule__Expression1__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3774:1: ( ( ( rule__Expression1__Group_1_2__0 )? ) )
            // InternalHale.g:3775:1: ( ( rule__Expression1__Group_1_2__0 )? )
            {
            // InternalHale.g:3775:1: ( ( rule__Expression1__Group_1_2__0 )? )
            // InternalHale.g:3776:2: ( rule__Expression1__Group_1_2__0 )?
            {
             before(grammarAccess.getExpression1Access().getGroup_1_2()); 
            // InternalHale.g:3777:2: ( rule__Expression1__Group_1_2__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=RULE_BOOLEAN && LA25_0<=RULE_STRING)||LA25_0==RULE_ID||LA25_0==25||(LA25_0>=31 && LA25_0<=32)||LA25_0==35||LA25_0==41) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalHale.g:3777:3: rule__Expression1__Group_1_2__0
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
    // InternalHale.g:3785:1: rule__Expression1__Group_1__3 : rule__Expression1__Group_1__3__Impl ;
    public final void rule__Expression1__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3789:1: ( rule__Expression1__Group_1__3__Impl )
            // InternalHale.g:3790:2: rule__Expression1__Group_1__3__Impl
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
    // InternalHale.g:3796:1: rule__Expression1__Group_1__3__Impl : ( ')' ) ;
    public final void rule__Expression1__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3800:1: ( ( ')' ) )
            // InternalHale.g:3801:1: ( ')' )
            {
            // InternalHale.g:3801:1: ( ')' )
            // InternalHale.g:3802:2: ')'
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
    // InternalHale.g:3812:1: rule__Expression1__Group_1_2__0 : rule__Expression1__Group_1_2__0__Impl rule__Expression1__Group_1_2__1 ;
    public final void rule__Expression1__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3816:1: ( rule__Expression1__Group_1_2__0__Impl rule__Expression1__Group_1_2__1 )
            // InternalHale.g:3817:2: rule__Expression1__Group_1_2__0__Impl rule__Expression1__Group_1_2__1
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
    // InternalHale.g:3824:1: rule__Expression1__Group_1_2__0__Impl : ( ( rule__Expression1__ArgumentsAssignment_1_2_0 ) ) ;
    public final void rule__Expression1__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3828:1: ( ( ( rule__Expression1__ArgumentsAssignment_1_2_0 ) ) )
            // InternalHale.g:3829:1: ( ( rule__Expression1__ArgumentsAssignment_1_2_0 ) )
            {
            // InternalHale.g:3829:1: ( ( rule__Expression1__ArgumentsAssignment_1_2_0 ) )
            // InternalHale.g:3830:2: ( rule__Expression1__ArgumentsAssignment_1_2_0 )
            {
             before(grammarAccess.getExpression1Access().getArgumentsAssignment_1_2_0()); 
            // InternalHale.g:3831:2: ( rule__Expression1__ArgumentsAssignment_1_2_0 )
            // InternalHale.g:3831:3: rule__Expression1__ArgumentsAssignment_1_2_0
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
    // InternalHale.g:3839:1: rule__Expression1__Group_1_2__1 : rule__Expression1__Group_1_2__1__Impl rule__Expression1__Group_1_2__2 ;
    public final void rule__Expression1__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3843:1: ( rule__Expression1__Group_1_2__1__Impl rule__Expression1__Group_1_2__2 )
            // InternalHale.g:3844:2: rule__Expression1__Group_1_2__1__Impl rule__Expression1__Group_1_2__2
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
    // InternalHale.g:3851:1: rule__Expression1__Group_1_2__1__Impl : ( ( rule__Expression1__Group_1_2_1__0 )* ) ;
    public final void rule__Expression1__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3855:1: ( ( ( rule__Expression1__Group_1_2_1__0 )* ) )
            // InternalHale.g:3856:1: ( ( rule__Expression1__Group_1_2_1__0 )* )
            {
            // InternalHale.g:3856:1: ( ( rule__Expression1__Group_1_2_1__0 )* )
            // InternalHale.g:3857:2: ( rule__Expression1__Group_1_2_1__0 )*
            {
             before(grammarAccess.getExpression1Access().getGroup_1_2_1()); 
            // InternalHale.g:3858:2: ( rule__Expression1__Group_1_2_1__0 )*
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
            	    // InternalHale.g:3858:3: rule__Expression1__Group_1_2_1__0
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
    // InternalHale.g:3866:1: rule__Expression1__Group_1_2__2 : rule__Expression1__Group_1_2__2__Impl ;
    public final void rule__Expression1__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3870:1: ( rule__Expression1__Group_1_2__2__Impl )
            // InternalHale.g:3871:2: rule__Expression1__Group_1_2__2__Impl
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
    // InternalHale.g:3877:1: rule__Expression1__Group_1_2__2__Impl : ( ( ',' )? ) ;
    public final void rule__Expression1__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3881:1: ( ( ( ',' )? ) )
            // InternalHale.g:3882:1: ( ( ',' )? )
            {
            // InternalHale.g:3882:1: ( ( ',' )? )
            // InternalHale.g:3883:2: ( ',' )?
            {
             before(grammarAccess.getExpression1Access().getCommaKeyword_1_2_2()); 
            // InternalHale.g:3884:2: ( ',' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==34) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalHale.g:3884:3: ','
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
    // InternalHale.g:3893:1: rule__Expression1__Group_1_2_1__0 : rule__Expression1__Group_1_2_1__0__Impl rule__Expression1__Group_1_2_1__1 ;
    public final void rule__Expression1__Group_1_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3897:1: ( rule__Expression1__Group_1_2_1__0__Impl rule__Expression1__Group_1_2_1__1 )
            // InternalHale.g:3898:2: rule__Expression1__Group_1_2_1__0__Impl rule__Expression1__Group_1_2_1__1
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
    // InternalHale.g:3905:1: rule__Expression1__Group_1_2_1__0__Impl : ( ',' ) ;
    public final void rule__Expression1__Group_1_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3909:1: ( ( ',' ) )
            // InternalHale.g:3910:1: ( ',' )
            {
            // InternalHale.g:3910:1: ( ',' )
            // InternalHale.g:3911:2: ','
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
    // InternalHale.g:3920:1: rule__Expression1__Group_1_2_1__1 : rule__Expression1__Group_1_2_1__1__Impl ;
    public final void rule__Expression1__Group_1_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3924:1: ( rule__Expression1__Group_1_2_1__1__Impl )
            // InternalHale.g:3925:2: rule__Expression1__Group_1_2_1__1__Impl
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
    // InternalHale.g:3931:1: rule__Expression1__Group_1_2_1__1__Impl : ( ( rule__Expression1__ArgumentsAssignment_1_2_1_1 ) ) ;
    public final void rule__Expression1__Group_1_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3935:1: ( ( ( rule__Expression1__ArgumentsAssignment_1_2_1_1 ) ) )
            // InternalHale.g:3936:1: ( ( rule__Expression1__ArgumentsAssignment_1_2_1_1 ) )
            {
            // InternalHale.g:3936:1: ( ( rule__Expression1__ArgumentsAssignment_1_2_1_1 ) )
            // InternalHale.g:3937:2: ( rule__Expression1__ArgumentsAssignment_1_2_1_1 )
            {
             before(grammarAccess.getExpression1Access().getArgumentsAssignment_1_2_1_1()); 
            // InternalHale.g:3938:2: ( rule__Expression1__ArgumentsAssignment_1_2_1_1 )
            // InternalHale.g:3938:3: rule__Expression1__ArgumentsAssignment_1_2_1_1
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
    // InternalHale.g:3947:1: rule__Expression0__Group_3__0 : rule__Expression0__Group_3__0__Impl rule__Expression0__Group_3__1 ;
    public final void rule__Expression0__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3951:1: ( rule__Expression0__Group_3__0__Impl rule__Expression0__Group_3__1 )
            // InternalHale.g:3952:2: rule__Expression0__Group_3__0__Impl rule__Expression0__Group_3__1
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
    // InternalHale.g:3959:1: rule__Expression0__Group_3__0__Impl : ( '(' ) ;
    public final void rule__Expression0__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3963:1: ( ( '(' ) )
            // InternalHale.g:3964:1: ( '(' )
            {
            // InternalHale.g:3964:1: ( '(' )
            // InternalHale.g:3965:2: '('
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
    // InternalHale.g:3974:1: rule__Expression0__Group_3__1 : rule__Expression0__Group_3__1__Impl rule__Expression0__Group_3__2 ;
    public final void rule__Expression0__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3978:1: ( rule__Expression0__Group_3__1__Impl rule__Expression0__Group_3__2 )
            // InternalHale.g:3979:2: rule__Expression0__Group_3__1__Impl rule__Expression0__Group_3__2
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
    // InternalHale.g:3986:1: rule__Expression0__Group_3__1__Impl : ( ruleExpression ) ;
    public final void rule__Expression0__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:3990:1: ( ( ruleExpression ) )
            // InternalHale.g:3991:1: ( ruleExpression )
            {
            // InternalHale.g:3991:1: ( ruleExpression )
            // InternalHale.g:3992:2: ruleExpression
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
    // InternalHale.g:4001:1: rule__Expression0__Group_3__2 : rule__Expression0__Group_3__2__Impl ;
    public final void rule__Expression0__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4005:1: ( rule__Expression0__Group_3__2__Impl )
            // InternalHale.g:4006:2: rule__Expression0__Group_3__2__Impl
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
    // InternalHale.g:4012:1: rule__Expression0__Group_3__2__Impl : ( ')' ) ;
    public final void rule__Expression0__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4016:1: ( ( ')' ) )
            // InternalHale.g:4017:1: ( ')' )
            {
            // InternalHale.g:4017:1: ( ')' )
            // InternalHale.g:4018:2: ')'
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
    // InternalHale.g:4028:1: rule__VoidLiteral__Group__0 : rule__VoidLiteral__Group__0__Impl rule__VoidLiteral__Group__1 ;
    public final void rule__VoidLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4032:1: ( rule__VoidLiteral__Group__0__Impl rule__VoidLiteral__Group__1 )
            // InternalHale.g:4033:2: rule__VoidLiteral__Group__0__Impl rule__VoidLiteral__Group__1
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
    // InternalHale.g:4040:1: rule__VoidLiteral__Group__0__Impl : ( () ) ;
    public final void rule__VoidLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4044:1: ( ( () ) )
            // InternalHale.g:4045:1: ( () )
            {
            // InternalHale.g:4045:1: ( () )
            // InternalHale.g:4046:2: ()
            {
             before(grammarAccess.getVoidLiteralAccess().getVoidLiteralAction_0()); 
            // InternalHale.g:4047:2: ()
            // InternalHale.g:4047:3: 
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
    // InternalHale.g:4055:1: rule__VoidLiteral__Group__1 : rule__VoidLiteral__Group__1__Impl ;
    public final void rule__VoidLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4059:1: ( rule__VoidLiteral__Group__1__Impl )
            // InternalHale.g:4060:2: rule__VoidLiteral__Group__1__Impl
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
    // InternalHale.g:4066:1: rule__VoidLiteral__Group__1__Impl : ( 'void' ) ;
    public final void rule__VoidLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4070:1: ( ( 'void' ) )
            // InternalHale.g:4071:1: ( 'void' )
            {
            // InternalHale.g:4071:1: ( 'void' )
            // InternalHale.g:4072:2: 'void'
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
    // InternalHale.g:4082:1: rule__TypeAnnotation__Group__0 : rule__TypeAnnotation__Group__0__Impl rule__TypeAnnotation__Group__1 ;
    public final void rule__TypeAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4086:1: ( rule__TypeAnnotation__Group__0__Impl rule__TypeAnnotation__Group__1 )
            // InternalHale.g:4087:2: rule__TypeAnnotation__Group__0__Impl rule__TypeAnnotation__Group__1
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
    // InternalHale.g:4094:1: rule__TypeAnnotation__Group__0__Impl : ( ':' ) ;
    public final void rule__TypeAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4098:1: ( ( ':' ) )
            // InternalHale.g:4099:1: ( ':' )
            {
            // InternalHale.g:4099:1: ( ':' )
            // InternalHale.g:4100:2: ':'
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
    // InternalHale.g:4109:1: rule__TypeAnnotation__Group__1 : rule__TypeAnnotation__Group__1__Impl ;
    public final void rule__TypeAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4113:1: ( rule__TypeAnnotation__Group__1__Impl )
            // InternalHale.g:4114:2: rule__TypeAnnotation__Group__1__Impl
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
    // InternalHale.g:4120:1: rule__TypeAnnotation__Group__1__Impl : ( ruleType ) ;
    public final void rule__TypeAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4124:1: ( ( ruleType ) )
            // InternalHale.g:4125:1: ( ruleType )
            {
            // InternalHale.g:4125:1: ( ruleType )
            // InternalHale.g:4126:2: ruleType
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
    // InternalHale.g:4136:1: rule__FunctionType__Group_0__0 : rule__FunctionType__Group_0__0__Impl rule__FunctionType__Group_0__1 ;
    public final void rule__FunctionType__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4140:1: ( rule__FunctionType__Group_0__0__Impl rule__FunctionType__Group_0__1 )
            // InternalHale.g:4141:2: rule__FunctionType__Group_0__0__Impl rule__FunctionType__Group_0__1
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
    // InternalHale.g:4148:1: rule__FunctionType__Group_0__0__Impl : ( () ) ;
    public final void rule__FunctionType__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4152:1: ( ( () ) )
            // InternalHale.g:4153:1: ( () )
            {
            // InternalHale.g:4153:1: ( () )
            // InternalHale.g:4154:2: ()
            {
             before(grammarAccess.getFunctionTypeAccess().getFunctionTypeAction_0_0()); 
            // InternalHale.g:4155:2: ()
            // InternalHale.g:4155:3: 
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
    // InternalHale.g:4163:1: rule__FunctionType__Group_0__1 : rule__FunctionType__Group_0__1__Impl rule__FunctionType__Group_0__2 ;
    public final void rule__FunctionType__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4167:1: ( rule__FunctionType__Group_0__1__Impl rule__FunctionType__Group_0__2 )
            // InternalHale.g:4168:2: rule__FunctionType__Group_0__1__Impl rule__FunctionType__Group_0__2
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
    // InternalHale.g:4175:1: rule__FunctionType__Group_0__1__Impl : ( 'Function' ) ;
    public final void rule__FunctionType__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4179:1: ( ( 'Function' ) )
            // InternalHale.g:4180:1: ( 'Function' )
            {
            // InternalHale.g:4180:1: ( 'Function' )
            // InternalHale.g:4181:2: 'Function'
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
    // InternalHale.g:4190:1: rule__FunctionType__Group_0__2 : rule__FunctionType__Group_0__2__Impl rule__FunctionType__Group_0__3 ;
    public final void rule__FunctionType__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4194:1: ( rule__FunctionType__Group_0__2__Impl rule__FunctionType__Group_0__3 )
            // InternalHale.g:4195:2: rule__FunctionType__Group_0__2__Impl rule__FunctionType__Group_0__3
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
    // InternalHale.g:4202:1: rule__FunctionType__Group_0__2__Impl : ( '(' ) ;
    public final void rule__FunctionType__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4206:1: ( ( '(' ) )
            // InternalHale.g:4207:1: ( '(' )
            {
            // InternalHale.g:4207:1: ( '(' )
            // InternalHale.g:4208:2: '('
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
    // InternalHale.g:4217:1: rule__FunctionType__Group_0__3 : rule__FunctionType__Group_0__3__Impl rule__FunctionType__Group_0__4 ;
    public final void rule__FunctionType__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4221:1: ( rule__FunctionType__Group_0__3__Impl rule__FunctionType__Group_0__4 )
            // InternalHale.g:4222:2: rule__FunctionType__Group_0__3__Impl rule__FunctionType__Group_0__4
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
    // InternalHale.g:4229:1: rule__FunctionType__Group_0__3__Impl : ( ( rule__FunctionType__Group_0_3__0 )? ) ;
    public final void rule__FunctionType__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4233:1: ( ( ( rule__FunctionType__Group_0_3__0 )? ) )
            // InternalHale.g:4234:1: ( ( rule__FunctionType__Group_0_3__0 )? )
            {
            // InternalHale.g:4234:1: ( ( rule__FunctionType__Group_0_3__0 )? )
            // InternalHale.g:4235:2: ( rule__FunctionType__Group_0_3__0 )?
            {
             before(grammarAccess.getFunctionTypeAccess().getGroup_0_3()); 
            // InternalHale.g:4236:2: ( rule__FunctionType__Group_0_3__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_PRIMITIVE_TYPE||LA28_0==32||LA28_0==37) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalHale.g:4236:3: rule__FunctionType__Group_0_3__0
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
    // InternalHale.g:4244:1: rule__FunctionType__Group_0__4 : rule__FunctionType__Group_0__4__Impl rule__FunctionType__Group_0__5 ;
    public final void rule__FunctionType__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4248:1: ( rule__FunctionType__Group_0__4__Impl rule__FunctionType__Group_0__5 )
            // InternalHale.g:4249:2: rule__FunctionType__Group_0__4__Impl rule__FunctionType__Group_0__5
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
    // InternalHale.g:4256:1: rule__FunctionType__Group_0__4__Impl : ( ')' ) ;
    public final void rule__FunctionType__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4260:1: ( ( ')' ) )
            // InternalHale.g:4261:1: ( ')' )
            {
            // InternalHale.g:4261:1: ( ')' )
            // InternalHale.g:4262:2: ')'
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
    // InternalHale.g:4271:1: rule__FunctionType__Group_0__5 : rule__FunctionType__Group_0__5__Impl ;
    public final void rule__FunctionType__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4275:1: ( rule__FunctionType__Group_0__5__Impl )
            // InternalHale.g:4276:2: rule__FunctionType__Group_0__5__Impl
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
    // InternalHale.g:4282:1: rule__FunctionType__Group_0__5__Impl : ( ( rule__FunctionType__ReturnTypeAssignment_0_5 )? ) ;
    public final void rule__FunctionType__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4286:1: ( ( ( rule__FunctionType__ReturnTypeAssignment_0_5 )? ) )
            // InternalHale.g:4287:1: ( ( rule__FunctionType__ReturnTypeAssignment_0_5 )? )
            {
            // InternalHale.g:4287:1: ( ( rule__FunctionType__ReturnTypeAssignment_0_5 )? )
            // InternalHale.g:4288:2: ( rule__FunctionType__ReturnTypeAssignment_0_5 )?
            {
             before(grammarAccess.getFunctionTypeAccess().getReturnTypeAssignment_0_5()); 
            // InternalHale.g:4289:2: ( rule__FunctionType__ReturnTypeAssignment_0_5 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==36) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalHale.g:4289:3: rule__FunctionType__ReturnTypeAssignment_0_5
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
    // InternalHale.g:4298:1: rule__FunctionType__Group_0_3__0 : rule__FunctionType__Group_0_3__0__Impl rule__FunctionType__Group_0_3__1 ;
    public final void rule__FunctionType__Group_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4302:1: ( rule__FunctionType__Group_0_3__0__Impl rule__FunctionType__Group_0_3__1 )
            // InternalHale.g:4303:2: rule__FunctionType__Group_0_3__0__Impl rule__FunctionType__Group_0_3__1
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
    // InternalHale.g:4310:1: rule__FunctionType__Group_0_3__0__Impl : ( ( rule__FunctionType__ParamTypesAssignment_0_3_0 ) ) ;
    public final void rule__FunctionType__Group_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4314:1: ( ( ( rule__FunctionType__ParamTypesAssignment_0_3_0 ) ) )
            // InternalHale.g:4315:1: ( ( rule__FunctionType__ParamTypesAssignment_0_3_0 ) )
            {
            // InternalHale.g:4315:1: ( ( rule__FunctionType__ParamTypesAssignment_0_3_0 ) )
            // InternalHale.g:4316:2: ( rule__FunctionType__ParamTypesAssignment_0_3_0 )
            {
             before(grammarAccess.getFunctionTypeAccess().getParamTypesAssignment_0_3_0()); 
            // InternalHale.g:4317:2: ( rule__FunctionType__ParamTypesAssignment_0_3_0 )
            // InternalHale.g:4317:3: rule__FunctionType__ParamTypesAssignment_0_3_0
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
    // InternalHale.g:4325:1: rule__FunctionType__Group_0_3__1 : rule__FunctionType__Group_0_3__1__Impl rule__FunctionType__Group_0_3__2 ;
    public final void rule__FunctionType__Group_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4329:1: ( rule__FunctionType__Group_0_3__1__Impl rule__FunctionType__Group_0_3__2 )
            // InternalHale.g:4330:2: rule__FunctionType__Group_0_3__1__Impl rule__FunctionType__Group_0_3__2
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
    // InternalHale.g:4337:1: rule__FunctionType__Group_0_3__1__Impl : ( ( rule__FunctionType__Group_0_3_1__0 )* ) ;
    public final void rule__FunctionType__Group_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4341:1: ( ( ( rule__FunctionType__Group_0_3_1__0 )* ) )
            // InternalHale.g:4342:1: ( ( rule__FunctionType__Group_0_3_1__0 )* )
            {
            // InternalHale.g:4342:1: ( ( rule__FunctionType__Group_0_3_1__0 )* )
            // InternalHale.g:4343:2: ( rule__FunctionType__Group_0_3_1__0 )*
            {
             before(grammarAccess.getFunctionTypeAccess().getGroup_0_3_1()); 
            // InternalHale.g:4344:2: ( rule__FunctionType__Group_0_3_1__0 )*
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
            	    // InternalHale.g:4344:3: rule__FunctionType__Group_0_3_1__0
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
    // InternalHale.g:4352:1: rule__FunctionType__Group_0_3__2 : rule__FunctionType__Group_0_3__2__Impl ;
    public final void rule__FunctionType__Group_0_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4356:1: ( rule__FunctionType__Group_0_3__2__Impl )
            // InternalHale.g:4357:2: rule__FunctionType__Group_0_3__2__Impl
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
    // InternalHale.g:4363:1: rule__FunctionType__Group_0_3__2__Impl : ( ( ',' )? ) ;
    public final void rule__FunctionType__Group_0_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4367:1: ( ( ( ',' )? ) )
            // InternalHale.g:4368:1: ( ( ',' )? )
            {
            // InternalHale.g:4368:1: ( ( ',' )? )
            // InternalHale.g:4369:2: ( ',' )?
            {
             before(grammarAccess.getFunctionTypeAccess().getCommaKeyword_0_3_2()); 
            // InternalHale.g:4370:2: ( ',' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==34) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalHale.g:4370:3: ','
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
    // InternalHale.g:4379:1: rule__FunctionType__Group_0_3_1__0 : rule__FunctionType__Group_0_3_1__0__Impl rule__FunctionType__Group_0_3_1__1 ;
    public final void rule__FunctionType__Group_0_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4383:1: ( rule__FunctionType__Group_0_3_1__0__Impl rule__FunctionType__Group_0_3_1__1 )
            // InternalHale.g:4384:2: rule__FunctionType__Group_0_3_1__0__Impl rule__FunctionType__Group_0_3_1__1
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
    // InternalHale.g:4391:1: rule__FunctionType__Group_0_3_1__0__Impl : ( ',' ) ;
    public final void rule__FunctionType__Group_0_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4395:1: ( ( ',' ) )
            // InternalHale.g:4396:1: ( ',' )
            {
            // InternalHale.g:4396:1: ( ',' )
            // InternalHale.g:4397:2: ','
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
    // InternalHale.g:4406:1: rule__FunctionType__Group_0_3_1__1 : rule__FunctionType__Group_0_3_1__1__Impl ;
    public final void rule__FunctionType__Group_0_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4410:1: ( rule__FunctionType__Group_0_3_1__1__Impl )
            // InternalHale.g:4411:2: rule__FunctionType__Group_0_3_1__1__Impl
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
    // InternalHale.g:4417:1: rule__FunctionType__Group_0_3_1__1__Impl : ( ( rule__FunctionType__ParamTypesAssignment_0_3_1_1 ) ) ;
    public final void rule__FunctionType__Group_0_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4421:1: ( ( ( rule__FunctionType__ParamTypesAssignment_0_3_1_1 ) ) )
            // InternalHale.g:4422:1: ( ( rule__FunctionType__ParamTypesAssignment_0_3_1_1 ) )
            {
            // InternalHale.g:4422:1: ( ( rule__FunctionType__ParamTypesAssignment_0_3_1_1 ) )
            // InternalHale.g:4423:2: ( rule__FunctionType__ParamTypesAssignment_0_3_1_1 )
            {
             before(grammarAccess.getFunctionTypeAccess().getParamTypesAssignment_0_3_1_1()); 
            // InternalHale.g:4424:2: ( rule__FunctionType__ParamTypesAssignment_0_3_1_1 )
            // InternalHale.g:4424:3: rule__FunctionType__ParamTypesAssignment_0_3_1_1
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
    // InternalHale.g:4433:1: rule__EitherType__Group__0 : rule__EitherType__Group__0__Impl rule__EitherType__Group__1 ;
    public final void rule__EitherType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4437:1: ( rule__EitherType__Group__0__Impl rule__EitherType__Group__1 )
            // InternalHale.g:4438:2: rule__EitherType__Group__0__Impl rule__EitherType__Group__1
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
    // InternalHale.g:4445:1: rule__EitherType__Group__0__Impl : ( rulePrimaryType ) ;
    public final void rule__EitherType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4449:1: ( ( rulePrimaryType ) )
            // InternalHale.g:4450:1: ( rulePrimaryType )
            {
            // InternalHale.g:4450:1: ( rulePrimaryType )
            // InternalHale.g:4451:2: rulePrimaryType
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
    // InternalHale.g:4460:1: rule__EitherType__Group__1 : rule__EitherType__Group__1__Impl ;
    public final void rule__EitherType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4464:1: ( rule__EitherType__Group__1__Impl )
            // InternalHale.g:4465:2: rule__EitherType__Group__1__Impl
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
    // InternalHale.g:4471:1: rule__EitherType__Group__1__Impl : ( ( rule__EitherType__Group_1__0 )* ) ;
    public final void rule__EitherType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4475:1: ( ( ( rule__EitherType__Group_1__0 )* ) )
            // InternalHale.g:4476:1: ( ( rule__EitherType__Group_1__0 )* )
            {
            // InternalHale.g:4476:1: ( ( rule__EitherType__Group_1__0 )* )
            // InternalHale.g:4477:2: ( rule__EitherType__Group_1__0 )*
            {
             before(grammarAccess.getEitherTypeAccess().getGroup_1()); 
            // InternalHale.g:4478:2: ( rule__EitherType__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==38) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalHale.g:4478:3: rule__EitherType__Group_1__0
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
    // InternalHale.g:4487:1: rule__EitherType__Group_1__0 : rule__EitherType__Group_1__0__Impl rule__EitherType__Group_1__1 ;
    public final void rule__EitherType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4491:1: ( rule__EitherType__Group_1__0__Impl rule__EitherType__Group_1__1 )
            // InternalHale.g:4492:2: rule__EitherType__Group_1__0__Impl rule__EitherType__Group_1__1
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
    // InternalHale.g:4499:1: rule__EitherType__Group_1__0__Impl : ( () ) ;
    public final void rule__EitherType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4503:1: ( ( () ) )
            // InternalHale.g:4504:1: ( () )
            {
            // InternalHale.g:4504:1: ( () )
            // InternalHale.g:4505:2: ()
            {
             before(grammarAccess.getEitherTypeAccess().getEitherTypeLeftAction_1_0()); 
            // InternalHale.g:4506:2: ()
            // InternalHale.g:4506:3: 
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
    // InternalHale.g:4514:1: rule__EitherType__Group_1__1 : rule__EitherType__Group_1__1__Impl rule__EitherType__Group_1__2 ;
    public final void rule__EitherType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4518:1: ( rule__EitherType__Group_1__1__Impl rule__EitherType__Group_1__2 )
            // InternalHale.g:4519:2: rule__EitherType__Group_1__1__Impl rule__EitherType__Group_1__2
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
    // InternalHale.g:4526:1: rule__EitherType__Group_1__1__Impl : ( '?' ) ;
    public final void rule__EitherType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4530:1: ( ( '?' ) )
            // InternalHale.g:4531:1: ( '?' )
            {
            // InternalHale.g:4531:1: ( '?' )
            // InternalHale.g:4532:2: '?'
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
    // InternalHale.g:4541:1: rule__EitherType__Group_1__2 : rule__EitherType__Group_1__2__Impl ;
    public final void rule__EitherType__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4545:1: ( rule__EitherType__Group_1__2__Impl )
            // InternalHale.g:4546:2: rule__EitherType__Group_1__2__Impl
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
    // InternalHale.g:4552:1: rule__EitherType__Group_1__2__Impl : ( ( rule__EitherType__RightAssignment_1_2 ) ) ;
    public final void rule__EitherType__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4556:1: ( ( ( rule__EitherType__RightAssignment_1_2 ) ) )
            // InternalHale.g:4557:1: ( ( rule__EitherType__RightAssignment_1_2 ) )
            {
            // InternalHale.g:4557:1: ( ( rule__EitherType__RightAssignment_1_2 ) )
            // InternalHale.g:4558:2: ( rule__EitherType__RightAssignment_1_2 )
            {
             before(grammarAccess.getEitherTypeAccess().getRightAssignment_1_2()); 
            // InternalHale.g:4559:2: ( rule__EitherType__RightAssignment_1_2 )
            // InternalHale.g:4559:3: rule__EitherType__RightAssignment_1_2
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
    // InternalHale.g:4568:1: rule__PrimaryType__Group_1__0 : rule__PrimaryType__Group_1__0__Impl rule__PrimaryType__Group_1__1 ;
    public final void rule__PrimaryType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4572:1: ( rule__PrimaryType__Group_1__0__Impl rule__PrimaryType__Group_1__1 )
            // InternalHale.g:4573:2: rule__PrimaryType__Group_1__0__Impl rule__PrimaryType__Group_1__1
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
    // InternalHale.g:4580:1: rule__PrimaryType__Group_1__0__Impl : ( '(' ) ;
    public final void rule__PrimaryType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4584:1: ( ( '(' ) )
            // InternalHale.g:4585:1: ( '(' )
            {
            // InternalHale.g:4585:1: ( '(' )
            // InternalHale.g:4586:2: '('
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
    // InternalHale.g:4595:1: rule__PrimaryType__Group_1__1 : rule__PrimaryType__Group_1__1__Impl rule__PrimaryType__Group_1__2 ;
    public final void rule__PrimaryType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4599:1: ( rule__PrimaryType__Group_1__1__Impl rule__PrimaryType__Group_1__2 )
            // InternalHale.g:4600:2: rule__PrimaryType__Group_1__1__Impl rule__PrimaryType__Group_1__2
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
    // InternalHale.g:4607:1: rule__PrimaryType__Group_1__1__Impl : ( ruleType ) ;
    public final void rule__PrimaryType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4611:1: ( ( ruleType ) )
            // InternalHale.g:4612:1: ( ruleType )
            {
            // InternalHale.g:4612:1: ( ruleType )
            // InternalHale.g:4613:2: ruleType
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
    // InternalHale.g:4622:1: rule__PrimaryType__Group_1__2 : rule__PrimaryType__Group_1__2__Impl ;
    public final void rule__PrimaryType__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4626:1: ( rule__PrimaryType__Group_1__2__Impl )
            // InternalHale.g:4627:2: rule__PrimaryType__Group_1__2__Impl
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
    // InternalHale.g:4633:1: rule__PrimaryType__Group_1__2__Impl : ( ')' ) ;
    public final void rule__PrimaryType__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4637:1: ( ( ')' ) )
            // InternalHale.g:4638:1: ( ')' )
            {
            // InternalHale.g:4638:1: ( ')' )
            // InternalHale.g:4639:2: ')'
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
    // InternalHale.g:4649:1: rule__PrimitiveType__Group__0 : rule__PrimitiveType__Group__0__Impl rule__PrimitiveType__Group__1 ;
    public final void rule__PrimitiveType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4653:1: ( rule__PrimitiveType__Group__0__Impl rule__PrimitiveType__Group__1 )
            // InternalHale.g:4654:2: rule__PrimitiveType__Group__0__Impl rule__PrimitiveType__Group__1
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
    // InternalHale.g:4661:1: rule__PrimitiveType__Group__0__Impl : ( () ) ;
    public final void rule__PrimitiveType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4665:1: ( ( () ) )
            // InternalHale.g:4666:1: ( () )
            {
            // InternalHale.g:4666:1: ( () )
            // InternalHale.g:4667:2: ()
            {
             before(grammarAccess.getPrimitiveTypeAccess().getPrimitiveTypeAction_0()); 
            // InternalHale.g:4668:2: ()
            // InternalHale.g:4668:3: 
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
    // InternalHale.g:4676:1: rule__PrimitiveType__Group__1 : rule__PrimitiveType__Group__1__Impl ;
    public final void rule__PrimitiveType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4680:1: ( rule__PrimitiveType__Group__1__Impl )
            // InternalHale.g:4681:2: rule__PrimitiveType__Group__1__Impl
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
    // InternalHale.g:4687:1: rule__PrimitiveType__Group__1__Impl : ( ( rule__PrimitiveType__TypeAssignment_1 ) ) ;
    public final void rule__PrimitiveType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4691:1: ( ( ( rule__PrimitiveType__TypeAssignment_1 ) ) )
            // InternalHale.g:4692:1: ( ( rule__PrimitiveType__TypeAssignment_1 ) )
            {
            // InternalHale.g:4692:1: ( ( rule__PrimitiveType__TypeAssignment_1 ) )
            // InternalHale.g:4693:2: ( rule__PrimitiveType__TypeAssignment_1 )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getTypeAssignment_1()); 
            // InternalHale.g:4694:2: ( rule__PrimitiveType__TypeAssignment_1 )
            // InternalHale.g:4694:3: rule__PrimitiveType__TypeAssignment_1
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
    // InternalHale.g:4703:1: rule__LetBinding__Group__0 : rule__LetBinding__Group__0__Impl rule__LetBinding__Group__1 ;
    public final void rule__LetBinding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4707:1: ( rule__LetBinding__Group__0__Impl rule__LetBinding__Group__1 )
            // InternalHale.g:4708:2: rule__LetBinding__Group__0__Impl rule__LetBinding__Group__1
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
    // InternalHale.g:4715:1: rule__LetBinding__Group__0__Impl : ( 'let' ) ;
    public final void rule__LetBinding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4719:1: ( ( 'let' ) )
            // InternalHale.g:4720:1: ( 'let' )
            {
            // InternalHale.g:4720:1: ( 'let' )
            // InternalHale.g:4721:2: 'let'
            {
             before(grammarAccess.getLetBindingAccess().getLetKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getLetBindingAccess().getLetKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetBinding__Group__0__Impl"


    // $ANTLR start "rule__LetBinding__Group__1"
    // InternalHale.g:4730:1: rule__LetBinding__Group__1 : rule__LetBinding__Group__1__Impl rule__LetBinding__Group__2 ;
    public final void rule__LetBinding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4734:1: ( rule__LetBinding__Group__1__Impl rule__LetBinding__Group__2 )
            // InternalHale.g:4735:2: rule__LetBinding__Group__1__Impl rule__LetBinding__Group__2
            {
            pushFollow(FOLLOW_48);
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
    // InternalHale.g:4742:1: rule__LetBinding__Group__1__Impl : ( ( rule__LetBinding__MutableAssignment_1 )? ) ;
    public final void rule__LetBinding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4746:1: ( ( ( rule__LetBinding__MutableAssignment_1 )? ) )
            // InternalHale.g:4747:1: ( ( rule__LetBinding__MutableAssignment_1 )? )
            {
            // InternalHale.g:4747:1: ( ( rule__LetBinding__MutableAssignment_1 )? )
            // InternalHale.g:4748:2: ( rule__LetBinding__MutableAssignment_1 )?
            {
             before(grammarAccess.getLetBindingAccess().getMutableAssignment_1()); 
            // InternalHale.g:4749:2: ( rule__LetBinding__MutableAssignment_1 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==51) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalHale.g:4749:3: rule__LetBinding__MutableAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__LetBinding__MutableAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLetBindingAccess().getMutableAssignment_1()); 

            }


            }

        }
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
    // InternalHale.g:4757:1: rule__LetBinding__Group__2 : rule__LetBinding__Group__2__Impl rule__LetBinding__Group__3 ;
    public final void rule__LetBinding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4761:1: ( rule__LetBinding__Group__2__Impl rule__LetBinding__Group__3 )
            // InternalHale.g:4762:2: rule__LetBinding__Group__2__Impl rule__LetBinding__Group__3
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
    // InternalHale.g:4769:1: rule__LetBinding__Group__2__Impl : ( ( rule__LetBinding__BindingAssignment_2 ) ) ;
    public final void rule__LetBinding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4773:1: ( ( ( rule__LetBinding__BindingAssignment_2 ) ) )
            // InternalHale.g:4774:1: ( ( rule__LetBinding__BindingAssignment_2 ) )
            {
            // InternalHale.g:4774:1: ( ( rule__LetBinding__BindingAssignment_2 ) )
            // InternalHale.g:4775:2: ( rule__LetBinding__BindingAssignment_2 )
            {
             before(grammarAccess.getLetBindingAccess().getBindingAssignment_2()); 
            // InternalHale.g:4776:2: ( rule__LetBinding__BindingAssignment_2 )
            // InternalHale.g:4776:3: rule__LetBinding__BindingAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LetBinding__BindingAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLetBindingAccess().getBindingAssignment_2()); 

            }


            }

        }
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
    // InternalHale.g:4784:1: rule__LetBinding__Group__3 : rule__LetBinding__Group__3__Impl rule__LetBinding__Group__4 ;
    public final void rule__LetBinding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4788:1: ( rule__LetBinding__Group__3__Impl rule__LetBinding__Group__4 )
            // InternalHale.g:4789:2: rule__LetBinding__Group__3__Impl rule__LetBinding__Group__4
            {
            pushFollow(FOLLOW_49);
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
    // InternalHale.g:4796:1: rule__LetBinding__Group__3__Impl : ( ( rule__LetBinding__TypeAssignment_3 )? ) ;
    public final void rule__LetBinding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4800:1: ( ( ( rule__LetBinding__TypeAssignment_3 )? ) )
            // InternalHale.g:4801:1: ( ( rule__LetBinding__TypeAssignment_3 )? )
            {
            // InternalHale.g:4801:1: ( ( rule__LetBinding__TypeAssignment_3 )? )
            // InternalHale.g:4802:2: ( rule__LetBinding__TypeAssignment_3 )?
            {
             before(grammarAccess.getLetBindingAccess().getTypeAssignment_3()); 
            // InternalHale.g:4803:2: ( rule__LetBinding__TypeAssignment_3 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==36) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalHale.g:4803:3: rule__LetBinding__TypeAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__LetBinding__TypeAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLetBindingAccess().getTypeAssignment_3()); 

            }


            }

        }
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
    // InternalHale.g:4811:1: rule__LetBinding__Group__4 : rule__LetBinding__Group__4__Impl rule__LetBinding__Group__5 ;
    public final void rule__LetBinding__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4815:1: ( rule__LetBinding__Group__4__Impl rule__LetBinding__Group__5 )
            // InternalHale.g:4816:2: rule__LetBinding__Group__4__Impl rule__LetBinding__Group__5
            {
            pushFollow(FOLLOW_9);
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
    // InternalHale.g:4823:1: rule__LetBinding__Group__4__Impl : ( '=' ) ;
    public final void rule__LetBinding__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4827:1: ( ( '=' ) )
            // InternalHale.g:4828:1: ( '=' )
            {
            // InternalHale.g:4828:1: ( '=' )
            // InternalHale.g:4829:2: '='
            {
             before(grammarAccess.getLetBindingAccess().getEqualsSignKeyword_4()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getLetBindingAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
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
    // InternalHale.g:4838:1: rule__LetBinding__Group__5 : rule__LetBinding__Group__5__Impl ;
    public final void rule__LetBinding__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4842:1: ( rule__LetBinding__Group__5__Impl )
            // InternalHale.g:4843:2: rule__LetBinding__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LetBinding__Group__5__Impl();

            state._fsp--;


            }

        }
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
    // InternalHale.g:4849:1: rule__LetBinding__Group__5__Impl : ( ( rule__LetBinding__ExpressionAssignment_5 ) ) ;
    public final void rule__LetBinding__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4853:1: ( ( ( rule__LetBinding__ExpressionAssignment_5 ) ) )
            // InternalHale.g:4854:1: ( ( rule__LetBinding__ExpressionAssignment_5 ) )
            {
            // InternalHale.g:4854:1: ( ( rule__LetBinding__ExpressionAssignment_5 ) )
            // InternalHale.g:4855:2: ( rule__LetBinding__ExpressionAssignment_5 )
            {
             before(grammarAccess.getLetBindingAccess().getExpressionAssignment_5()); 
            // InternalHale.g:4856:2: ( rule__LetBinding__ExpressionAssignment_5 )
            // InternalHale.g:4856:3: rule__LetBinding__ExpressionAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__LetBinding__ExpressionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getLetBindingAccess().getExpressionAssignment_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__Assignment__Group__0"
    // InternalHale.g:4865:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4869:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // InternalHale.g:4870:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_50);
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
    // InternalHale.g:4877:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__BindingAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4881:1: ( ( ( rule__Assignment__BindingAssignment_0 ) ) )
            // InternalHale.g:4882:1: ( ( rule__Assignment__BindingAssignment_0 ) )
            {
            // InternalHale.g:4882:1: ( ( rule__Assignment__BindingAssignment_0 ) )
            // InternalHale.g:4883:2: ( rule__Assignment__BindingAssignment_0 )
            {
             before(grammarAccess.getAssignmentAccess().getBindingAssignment_0()); 
            // InternalHale.g:4884:2: ( rule__Assignment__BindingAssignment_0 )
            // InternalHale.g:4884:3: rule__Assignment__BindingAssignment_0
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
    // InternalHale.g:4892:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4896:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // InternalHale.g:4897:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
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
    // InternalHale.g:4904:1: rule__Assignment__Group__1__Impl : ( '=' ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4908:1: ( ( '=' ) )
            // InternalHale.g:4909:1: ( '=' )
            {
            // InternalHale.g:4909:1: ( '=' )
            // InternalHale.g:4910:2: '='
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
    // InternalHale.g:4919:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4923:1: ( rule__Assignment__Group__2__Impl )
            // InternalHale.g:4924:2: rule__Assignment__Group__2__Impl
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
    // InternalHale.g:4930:1: rule__Assignment__Group__2__Impl : ( ( rule__Assignment__ExpressionAssignment_2 ) ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4934:1: ( ( ( rule__Assignment__ExpressionAssignment_2 ) ) )
            // InternalHale.g:4935:1: ( ( rule__Assignment__ExpressionAssignment_2 ) )
            {
            // InternalHale.g:4935:1: ( ( rule__Assignment__ExpressionAssignment_2 ) )
            // InternalHale.g:4936:2: ( rule__Assignment__ExpressionAssignment_2 )
            {
             before(grammarAccess.getAssignmentAccess().getExpressionAssignment_2()); 
            // InternalHale.g:4937:2: ( rule__Assignment__ExpressionAssignment_2 )
            // InternalHale.g:4937:3: rule__Assignment__ExpressionAssignment_2
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
    // InternalHale.g:4946:1: rule__Input__Group__0 : rule__Input__Group__0__Impl rule__Input__Group__1 ;
    public final void rule__Input__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4950:1: ( rule__Input__Group__0__Impl rule__Input__Group__1 )
            // InternalHale.g:4951:2: rule__Input__Group__0__Impl rule__Input__Group__1
            {
            pushFollow(FOLLOW_51);
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
    // InternalHale.g:4958:1: rule__Input__Group__0__Impl : ( () ) ;
    public final void rule__Input__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4962:1: ( ( () ) )
            // InternalHale.g:4963:1: ( () )
            {
            // InternalHale.g:4963:1: ( () )
            // InternalHale.g:4964:2: ()
            {
             before(grammarAccess.getInputAccess().getInputAction_0()); 
            // InternalHale.g:4965:2: ()
            // InternalHale.g:4965:3: 
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
    // InternalHale.g:4973:1: rule__Input__Group__1 : rule__Input__Group__1__Impl ;
    public final void rule__Input__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4977:1: ( rule__Input__Group__1__Impl )
            // InternalHale.g:4978:2: rule__Input__Group__1__Impl
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
    // InternalHale.g:4984:1: rule__Input__Group__1__Impl : ( 'input' ) ;
    public final void rule__Input__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:4988:1: ( ( 'input' ) )
            // InternalHale.g:4989:1: ( 'input' )
            {
            // InternalHale.g:4989:1: ( 'input' )
            // InternalHale.g:4990:2: 'input'
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
    // InternalHale.g:5000:1: rule__Print__Group__0 : rule__Print__Group__0__Impl rule__Print__Group__1 ;
    public final void rule__Print__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5004:1: ( rule__Print__Group__0__Impl rule__Print__Group__1 )
            // InternalHale.g:5005:2: rule__Print__Group__0__Impl rule__Print__Group__1
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
    // InternalHale.g:5012:1: rule__Print__Group__0__Impl : ( 'print' ) ;
    public final void rule__Print__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5016:1: ( ( 'print' ) )
            // InternalHale.g:5017:1: ( 'print' )
            {
            // InternalHale.g:5017:1: ( 'print' )
            // InternalHale.g:5018:2: 'print'
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
    // InternalHale.g:5027:1: rule__Print__Group__1 : rule__Print__Group__1__Impl ;
    public final void rule__Print__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5031:1: ( rule__Print__Group__1__Impl )
            // InternalHale.g:5032:2: rule__Print__Group__1__Impl
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
    // InternalHale.g:5038:1: rule__Print__Group__1__Impl : ( ( rule__Print__ExpressionAssignment_1 ) ) ;
    public final void rule__Print__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5042:1: ( ( ( rule__Print__ExpressionAssignment_1 ) ) )
            // InternalHale.g:5043:1: ( ( rule__Print__ExpressionAssignment_1 ) )
            {
            // InternalHale.g:5043:1: ( ( rule__Print__ExpressionAssignment_1 ) )
            // InternalHale.g:5044:2: ( rule__Print__ExpressionAssignment_1 )
            {
             before(grammarAccess.getPrintAccess().getExpressionAssignment_1()); 
            // InternalHale.g:5045:2: ( rule__Print__ExpressionAssignment_1 )
            // InternalHale.g:5045:3: rule__Print__ExpressionAssignment_1
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
    // InternalHale.g:5054:1: rule__If__Group__0 : rule__If__Group__0__Impl rule__If__Group__1 ;
    public final void rule__If__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5058:1: ( rule__If__Group__0__Impl rule__If__Group__1 )
            // InternalHale.g:5059:2: rule__If__Group__0__Impl rule__If__Group__1
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
    // InternalHale.g:5066:1: rule__If__Group__0__Impl : ( 'if' ) ;
    public final void rule__If__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5070:1: ( ( 'if' ) )
            // InternalHale.g:5071:1: ( 'if' )
            {
            // InternalHale.g:5071:1: ( 'if' )
            // InternalHale.g:5072:2: 'if'
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
    // InternalHale.g:5081:1: rule__If__Group__1 : rule__If__Group__1__Impl ;
    public final void rule__If__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5085:1: ( rule__If__Group__1__Impl )
            // InternalHale.g:5086:2: rule__If__Group__1__Impl
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
    // InternalHale.g:5092:1: rule__If__Group__1__Impl : ( ( rule__If__Alternatives_1 ) ) ;
    public final void rule__If__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5096:1: ( ( ( rule__If__Alternatives_1 ) ) )
            // InternalHale.g:5097:1: ( ( rule__If__Alternatives_1 ) )
            {
            // InternalHale.g:5097:1: ( ( rule__If__Alternatives_1 ) )
            // InternalHale.g:5098:2: ( rule__If__Alternatives_1 )
            {
             before(grammarAccess.getIfAccess().getAlternatives_1()); 
            // InternalHale.g:5099:2: ( rule__If__Alternatives_1 )
            // InternalHale.g:5099:3: rule__If__Alternatives_1
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
    // InternalHale.g:5108:1: rule__IfLet__Group__0 : rule__IfLet__Group__0__Impl rule__IfLet__Group__1 ;
    public final void rule__IfLet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5112:1: ( rule__IfLet__Group__0__Impl rule__IfLet__Group__1 )
            // InternalHale.g:5113:2: rule__IfLet__Group__0__Impl rule__IfLet__Group__1
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
    // InternalHale.g:5120:1: rule__IfLet__Group__0__Impl : ( 'let' ) ;
    public final void rule__IfLet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5124:1: ( ( 'let' ) )
            // InternalHale.g:5125:1: ( 'let' )
            {
            // InternalHale.g:5125:1: ( 'let' )
            // InternalHale.g:5126:2: 'let'
            {
             before(grammarAccess.getIfLetAccess().getLetKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getIfLetAccess().getLetKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfLet__Group__0__Impl"


    // $ANTLR start "rule__IfLet__Group__1"
    // InternalHale.g:5135:1: rule__IfLet__Group__1 : rule__IfLet__Group__1__Impl rule__IfLet__Group__2 ;
    public final void rule__IfLet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5139:1: ( rule__IfLet__Group__1__Impl rule__IfLet__Group__2 )
            // InternalHale.g:5140:2: rule__IfLet__Group__1__Impl rule__IfLet__Group__2
            {
            pushFollow(FOLLOW_48);
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
    // InternalHale.g:5147:1: rule__IfLet__Group__1__Impl : ( ( rule__IfLet__MutableAssignment_1 )? ) ;
    public final void rule__IfLet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5151:1: ( ( ( rule__IfLet__MutableAssignment_1 )? ) )
            // InternalHale.g:5152:1: ( ( rule__IfLet__MutableAssignment_1 )? )
            {
            // InternalHale.g:5152:1: ( ( rule__IfLet__MutableAssignment_1 )? )
            // InternalHale.g:5153:2: ( rule__IfLet__MutableAssignment_1 )?
            {
             before(grammarAccess.getIfLetAccess().getMutableAssignment_1()); 
            // InternalHale.g:5154:2: ( rule__IfLet__MutableAssignment_1 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==51) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalHale.g:5154:3: rule__IfLet__MutableAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__IfLet__MutableAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIfLetAccess().getMutableAssignment_1()); 

            }


            }

        }
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
    // InternalHale.g:5162:1: rule__IfLet__Group__2 : rule__IfLet__Group__2__Impl rule__IfLet__Group__3 ;
    public final void rule__IfLet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5166:1: ( rule__IfLet__Group__2__Impl rule__IfLet__Group__3 )
            // InternalHale.g:5167:2: rule__IfLet__Group__2__Impl rule__IfLet__Group__3
            {
            pushFollow(FOLLOW_49);
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
    // InternalHale.g:5174:1: rule__IfLet__Group__2__Impl : ( ( rule__IfLet__BindingAssignment_2 ) ) ;
    public final void rule__IfLet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5178:1: ( ( ( rule__IfLet__BindingAssignment_2 ) ) )
            // InternalHale.g:5179:1: ( ( rule__IfLet__BindingAssignment_2 ) )
            {
            // InternalHale.g:5179:1: ( ( rule__IfLet__BindingAssignment_2 ) )
            // InternalHale.g:5180:2: ( rule__IfLet__BindingAssignment_2 )
            {
             before(grammarAccess.getIfLetAccess().getBindingAssignment_2()); 
            // InternalHale.g:5181:2: ( rule__IfLet__BindingAssignment_2 )
            // InternalHale.g:5181:3: rule__IfLet__BindingAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__IfLet__BindingAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIfLetAccess().getBindingAssignment_2()); 

            }


            }

        }
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
    // InternalHale.g:5189:1: rule__IfLet__Group__3 : rule__IfLet__Group__3__Impl rule__IfLet__Group__4 ;
    public final void rule__IfLet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5193:1: ( rule__IfLet__Group__3__Impl rule__IfLet__Group__4 )
            // InternalHale.g:5194:2: rule__IfLet__Group__3__Impl rule__IfLet__Group__4
            {
            pushFollow(FOLLOW_49);
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
    // InternalHale.g:5201:1: rule__IfLet__Group__3__Impl : ( ( rule__IfLet__TypeAssignment_3 )? ) ;
    public final void rule__IfLet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5205:1: ( ( ( rule__IfLet__TypeAssignment_3 )? ) )
            // InternalHale.g:5206:1: ( ( rule__IfLet__TypeAssignment_3 )? )
            {
            // InternalHale.g:5206:1: ( ( rule__IfLet__TypeAssignment_3 )? )
            // InternalHale.g:5207:2: ( rule__IfLet__TypeAssignment_3 )?
            {
             before(grammarAccess.getIfLetAccess().getTypeAssignment_3()); 
            // InternalHale.g:5208:2: ( rule__IfLet__TypeAssignment_3 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==36) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalHale.g:5208:3: rule__IfLet__TypeAssignment_3
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
    // InternalHale.g:5216:1: rule__IfLet__Group__4 : rule__IfLet__Group__4__Impl rule__IfLet__Group__5 ;
    public final void rule__IfLet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5220:1: ( rule__IfLet__Group__4__Impl rule__IfLet__Group__5 )
            // InternalHale.g:5221:2: rule__IfLet__Group__4__Impl rule__IfLet__Group__5
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
    // InternalHale.g:5228:1: rule__IfLet__Group__4__Impl : ( '=' ) ;
    public final void rule__IfLet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5232:1: ( ( '=' ) )
            // InternalHale.g:5233:1: ( '=' )
            {
            // InternalHale.g:5233:1: ( '=' )
            // InternalHale.g:5234:2: '='
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
    // InternalHale.g:5243:1: rule__IfLet__Group__5 : rule__IfLet__Group__5__Impl rule__IfLet__Group__6 ;
    public final void rule__IfLet__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5247:1: ( rule__IfLet__Group__5__Impl rule__IfLet__Group__6 )
            // InternalHale.g:5248:2: rule__IfLet__Group__5__Impl rule__IfLet__Group__6
            {
            pushFollow(FOLLOW_52);
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
    // InternalHale.g:5255:1: rule__IfLet__Group__5__Impl : ( ( rule__IfLet__ExpressionAssignment_5 ) ) ;
    public final void rule__IfLet__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5259:1: ( ( ( rule__IfLet__ExpressionAssignment_5 ) ) )
            // InternalHale.g:5260:1: ( ( rule__IfLet__ExpressionAssignment_5 ) )
            {
            // InternalHale.g:5260:1: ( ( rule__IfLet__ExpressionAssignment_5 ) )
            // InternalHale.g:5261:2: ( rule__IfLet__ExpressionAssignment_5 )
            {
             before(grammarAccess.getIfLetAccess().getExpressionAssignment_5()); 
            // InternalHale.g:5262:2: ( rule__IfLet__ExpressionAssignment_5 )
            // InternalHale.g:5262:3: rule__IfLet__ExpressionAssignment_5
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
    // InternalHale.g:5270:1: rule__IfLet__Group__6 : rule__IfLet__Group__6__Impl rule__IfLet__Group__7 ;
    public final void rule__IfLet__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5274:1: ( rule__IfLet__Group__6__Impl rule__IfLet__Group__7 )
            // InternalHale.g:5275:2: rule__IfLet__Group__6__Impl rule__IfLet__Group__7
            {
            pushFollow(FOLLOW_53);
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
    // InternalHale.g:5282:1: rule__IfLet__Group__6__Impl : ( ( rule__IfLet__IfBlockAssignment_6 ) ) ;
    public final void rule__IfLet__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5286:1: ( ( ( rule__IfLet__IfBlockAssignment_6 ) ) )
            // InternalHale.g:5287:1: ( ( rule__IfLet__IfBlockAssignment_6 ) )
            {
            // InternalHale.g:5287:1: ( ( rule__IfLet__IfBlockAssignment_6 ) )
            // InternalHale.g:5288:2: ( rule__IfLet__IfBlockAssignment_6 )
            {
             before(grammarAccess.getIfLetAccess().getIfBlockAssignment_6()); 
            // InternalHale.g:5289:2: ( rule__IfLet__IfBlockAssignment_6 )
            // InternalHale.g:5289:3: rule__IfLet__IfBlockAssignment_6
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
    // InternalHale.g:5297:1: rule__IfLet__Group__7 : rule__IfLet__Group__7__Impl ;
    public final void rule__IfLet__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5301:1: ( rule__IfLet__Group__7__Impl )
            // InternalHale.g:5302:2: rule__IfLet__Group__7__Impl
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
    // InternalHale.g:5308:1: rule__IfLet__Group__7__Impl : ( ( rule__IfLet__Group_7__0 )? ) ;
    public final void rule__IfLet__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5312:1: ( ( ( rule__IfLet__Group_7__0 )? ) )
            // InternalHale.g:5313:1: ( ( rule__IfLet__Group_7__0 )? )
            {
            // InternalHale.g:5313:1: ( ( rule__IfLet__Group_7__0 )? )
            // InternalHale.g:5314:2: ( rule__IfLet__Group_7__0 )?
            {
             before(grammarAccess.getIfLetAccess().getGroup_7()); 
            // InternalHale.g:5315:2: ( rule__IfLet__Group_7__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==44) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalHale.g:5315:3: rule__IfLet__Group_7__0
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
    // InternalHale.g:5324:1: rule__IfLet__Group_7__0 : rule__IfLet__Group_7__0__Impl rule__IfLet__Group_7__1 ;
    public final void rule__IfLet__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5328:1: ( rule__IfLet__Group_7__0__Impl rule__IfLet__Group_7__1 )
            // InternalHale.g:5329:2: rule__IfLet__Group_7__0__Impl rule__IfLet__Group_7__1
            {
            pushFollow(FOLLOW_54);
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
    // InternalHale.g:5336:1: rule__IfLet__Group_7__0__Impl : ( 'else' ) ;
    public final void rule__IfLet__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5340:1: ( ( 'else' ) )
            // InternalHale.g:5341:1: ( 'else' )
            {
            // InternalHale.g:5341:1: ( 'else' )
            // InternalHale.g:5342:2: 'else'
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
    // InternalHale.g:5351:1: rule__IfLet__Group_7__1 : rule__IfLet__Group_7__1__Impl ;
    public final void rule__IfLet__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5355:1: ( rule__IfLet__Group_7__1__Impl )
            // InternalHale.g:5356:2: rule__IfLet__Group_7__1__Impl
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
    // InternalHale.g:5362:1: rule__IfLet__Group_7__1__Impl : ( ( rule__IfLet__ElseLetAssignment_7_1 ) ) ;
    public final void rule__IfLet__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5366:1: ( ( ( rule__IfLet__ElseLetAssignment_7_1 ) ) )
            // InternalHale.g:5367:1: ( ( rule__IfLet__ElseLetAssignment_7_1 ) )
            {
            // InternalHale.g:5367:1: ( ( rule__IfLet__ElseLetAssignment_7_1 ) )
            // InternalHale.g:5368:2: ( rule__IfLet__ElseLetAssignment_7_1 )
            {
             before(grammarAccess.getIfLetAccess().getElseLetAssignment_7_1()); 
            // InternalHale.g:5369:2: ( rule__IfLet__ElseLetAssignment_7_1 )
            // InternalHale.g:5369:3: rule__IfLet__ElseLetAssignment_7_1
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
    // InternalHale.g:5378:1: rule__ElseLet__Group__0 : rule__ElseLet__Group__0__Impl rule__ElseLet__Group__1 ;
    public final void rule__ElseLet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5382:1: ( rule__ElseLet__Group__0__Impl rule__ElseLet__Group__1 )
            // InternalHale.g:5383:2: rule__ElseLet__Group__0__Impl rule__ElseLet__Group__1
            {
            pushFollow(FOLLOW_54);
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
    // InternalHale.g:5390:1: rule__ElseLet__Group__0__Impl : ( ( rule__ElseLet__Group_0__0 )? ) ;
    public final void rule__ElseLet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5394:1: ( ( ( rule__ElseLet__Group_0__0 )? ) )
            // InternalHale.g:5395:1: ( ( rule__ElseLet__Group_0__0 )? )
            {
            // InternalHale.g:5395:1: ( ( rule__ElseLet__Group_0__0 )? )
            // InternalHale.g:5396:2: ( rule__ElseLet__Group_0__0 )?
            {
             before(grammarAccess.getElseLetAccess().getGroup_0()); 
            // InternalHale.g:5397:2: ( rule__ElseLet__Group_0__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==39) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalHale.g:5397:3: rule__ElseLet__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ElseLet__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getElseLetAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseLet__Group__0__Impl"


    // $ANTLR start "rule__ElseLet__Group__1"
    // InternalHale.g:5405:1: rule__ElseLet__Group__1 : rule__ElseLet__Group__1__Impl ;
    public final void rule__ElseLet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5409:1: ( rule__ElseLet__Group__1__Impl )
            // InternalHale.g:5410:2: rule__ElseLet__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ElseLet__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalHale.g:5416:1: rule__ElseLet__Group__1__Impl : ( ( rule__ElseLet__ElseBlockAssignment_1 ) ) ;
    public final void rule__ElseLet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5420:1: ( ( ( rule__ElseLet__ElseBlockAssignment_1 ) ) )
            // InternalHale.g:5421:1: ( ( rule__ElseLet__ElseBlockAssignment_1 ) )
            {
            // InternalHale.g:5421:1: ( ( rule__ElseLet__ElseBlockAssignment_1 ) )
            // InternalHale.g:5422:2: ( rule__ElseLet__ElseBlockAssignment_1 )
            {
             before(grammarAccess.getElseLetAccess().getElseBlockAssignment_1()); 
            // InternalHale.g:5423:2: ( rule__ElseLet__ElseBlockAssignment_1 )
            // InternalHale.g:5423:3: rule__ElseLet__ElseBlockAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ElseLet__ElseBlockAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getElseLetAccess().getElseBlockAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__ElseLet__Group_0__0"
    // InternalHale.g:5432:1: rule__ElseLet__Group_0__0 : rule__ElseLet__Group_0__0__Impl rule__ElseLet__Group_0__1 ;
    public final void rule__ElseLet__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5436:1: ( rule__ElseLet__Group_0__0__Impl rule__ElseLet__Group_0__1 )
            // InternalHale.g:5437:2: rule__ElseLet__Group_0__0__Impl rule__ElseLet__Group_0__1
            {
            pushFollow(FOLLOW_48);
            rule__ElseLet__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElseLet__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseLet__Group_0__0"


    // $ANTLR start "rule__ElseLet__Group_0__0__Impl"
    // InternalHale.g:5444:1: rule__ElseLet__Group_0__0__Impl : ( 'let' ) ;
    public final void rule__ElseLet__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5448:1: ( ( 'let' ) )
            // InternalHale.g:5449:1: ( 'let' )
            {
            // InternalHale.g:5449:1: ( 'let' )
            // InternalHale.g:5450:2: 'let'
            {
             before(grammarAccess.getElseLetAccess().getLetKeyword_0_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getElseLetAccess().getLetKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseLet__Group_0__0__Impl"


    // $ANTLR start "rule__ElseLet__Group_0__1"
    // InternalHale.g:5459:1: rule__ElseLet__Group_0__1 : rule__ElseLet__Group_0__1__Impl rule__ElseLet__Group_0__2 ;
    public final void rule__ElseLet__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5463:1: ( rule__ElseLet__Group_0__1__Impl rule__ElseLet__Group_0__2 )
            // InternalHale.g:5464:2: rule__ElseLet__Group_0__1__Impl rule__ElseLet__Group_0__2
            {
            pushFollow(FOLLOW_48);
            rule__ElseLet__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElseLet__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseLet__Group_0__1"


    // $ANTLR start "rule__ElseLet__Group_0__1__Impl"
    // InternalHale.g:5471:1: rule__ElseLet__Group_0__1__Impl : ( ( rule__ElseLet__MutableAssignment_0_1 )? ) ;
    public final void rule__ElseLet__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5475:1: ( ( ( rule__ElseLet__MutableAssignment_0_1 )? ) )
            // InternalHale.g:5476:1: ( ( rule__ElseLet__MutableAssignment_0_1 )? )
            {
            // InternalHale.g:5476:1: ( ( rule__ElseLet__MutableAssignment_0_1 )? )
            // InternalHale.g:5477:2: ( rule__ElseLet__MutableAssignment_0_1 )?
            {
             before(grammarAccess.getElseLetAccess().getMutableAssignment_0_1()); 
            // InternalHale.g:5478:2: ( rule__ElseLet__MutableAssignment_0_1 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==51) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalHale.g:5478:3: rule__ElseLet__MutableAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ElseLet__MutableAssignment_0_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getElseLetAccess().getMutableAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseLet__Group_0__1__Impl"


    // $ANTLR start "rule__ElseLet__Group_0__2"
    // InternalHale.g:5486:1: rule__ElseLet__Group_0__2 : rule__ElseLet__Group_0__2__Impl rule__ElseLet__Group_0__3 ;
    public final void rule__ElseLet__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5490:1: ( rule__ElseLet__Group_0__2__Impl rule__ElseLet__Group_0__3 )
            // InternalHale.g:5491:2: rule__ElseLet__Group_0__2__Impl rule__ElseLet__Group_0__3
            {
            pushFollow(FOLLOW_44);
            rule__ElseLet__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElseLet__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseLet__Group_0__2"


    // $ANTLR start "rule__ElseLet__Group_0__2__Impl"
    // InternalHale.g:5498:1: rule__ElseLet__Group_0__2__Impl : ( ( rule__ElseLet__BindingAssignment_0_2 ) ) ;
    public final void rule__ElseLet__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5502:1: ( ( ( rule__ElseLet__BindingAssignment_0_2 ) ) )
            // InternalHale.g:5503:1: ( ( rule__ElseLet__BindingAssignment_0_2 ) )
            {
            // InternalHale.g:5503:1: ( ( rule__ElseLet__BindingAssignment_0_2 ) )
            // InternalHale.g:5504:2: ( rule__ElseLet__BindingAssignment_0_2 )
            {
             before(grammarAccess.getElseLetAccess().getBindingAssignment_0_2()); 
            // InternalHale.g:5505:2: ( rule__ElseLet__BindingAssignment_0_2 )
            // InternalHale.g:5505:3: rule__ElseLet__BindingAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__ElseLet__BindingAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getElseLetAccess().getBindingAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseLet__Group_0__2__Impl"


    // $ANTLR start "rule__ElseLet__Group_0__3"
    // InternalHale.g:5513:1: rule__ElseLet__Group_0__3 : rule__ElseLet__Group_0__3__Impl ;
    public final void rule__ElseLet__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5517:1: ( rule__ElseLet__Group_0__3__Impl )
            // InternalHale.g:5518:2: rule__ElseLet__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ElseLet__Group_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseLet__Group_0__3"


    // $ANTLR start "rule__ElseLet__Group_0__3__Impl"
    // InternalHale.g:5524:1: rule__ElseLet__Group_0__3__Impl : ( ( rule__ElseLet__TypeAssignment_0_3 )? ) ;
    public final void rule__ElseLet__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5528:1: ( ( ( rule__ElseLet__TypeAssignment_0_3 )? ) )
            // InternalHale.g:5529:1: ( ( rule__ElseLet__TypeAssignment_0_3 )? )
            {
            // InternalHale.g:5529:1: ( ( rule__ElseLet__TypeAssignment_0_3 )? )
            // InternalHale.g:5530:2: ( rule__ElseLet__TypeAssignment_0_3 )?
            {
             before(grammarAccess.getElseLetAccess().getTypeAssignment_0_3()); 
            // InternalHale.g:5531:2: ( rule__ElseLet__TypeAssignment_0_3 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==36) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalHale.g:5531:3: rule__ElseLet__TypeAssignment_0_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__ElseLet__TypeAssignment_0_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getElseLetAccess().getTypeAssignment_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseLet__Group_0__3__Impl"


    // $ANTLR start "rule__IfConditions__Group__0"
    // InternalHale.g:5540:1: rule__IfConditions__Group__0 : rule__IfConditions__Group__0__Impl rule__IfConditions__Group__1 ;
    public final void rule__IfConditions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5544:1: ( rule__IfConditions__Group__0__Impl rule__IfConditions__Group__1 )
            // InternalHale.g:5545:2: rule__IfConditions__Group__0__Impl rule__IfConditions__Group__1
            {
            pushFollow(FOLLOW_52);
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
    // InternalHale.g:5552:1: rule__IfConditions__Group__0__Impl : ( ( rule__IfConditions__ConditionsAssignment_0 ) ) ;
    public final void rule__IfConditions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5556:1: ( ( ( rule__IfConditions__ConditionsAssignment_0 ) ) )
            // InternalHale.g:5557:1: ( ( rule__IfConditions__ConditionsAssignment_0 ) )
            {
            // InternalHale.g:5557:1: ( ( rule__IfConditions__ConditionsAssignment_0 ) )
            // InternalHale.g:5558:2: ( rule__IfConditions__ConditionsAssignment_0 )
            {
             before(grammarAccess.getIfConditionsAccess().getConditionsAssignment_0()); 
            // InternalHale.g:5559:2: ( rule__IfConditions__ConditionsAssignment_0 )
            // InternalHale.g:5559:3: rule__IfConditions__ConditionsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__IfConditions__ConditionsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getIfConditionsAccess().getConditionsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfConditions__Group__0__Impl"


    // $ANTLR start "rule__IfConditions__Group__1"
    // InternalHale.g:5567:1: rule__IfConditions__Group__1 : rule__IfConditions__Group__1__Impl rule__IfConditions__Group__2 ;
    public final void rule__IfConditions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5571:1: ( rule__IfConditions__Group__1__Impl rule__IfConditions__Group__2 )
            // InternalHale.g:5572:2: rule__IfConditions__Group__1__Impl rule__IfConditions__Group__2
            {
            pushFollow(FOLLOW_55);
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
    // InternalHale.g:5579:1: rule__IfConditions__Group__1__Impl : ( ( rule__IfConditions__IfBlocksAssignment_1 ) ) ;
    public final void rule__IfConditions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5583:1: ( ( ( rule__IfConditions__IfBlocksAssignment_1 ) ) )
            // InternalHale.g:5584:1: ( ( rule__IfConditions__IfBlocksAssignment_1 ) )
            {
            // InternalHale.g:5584:1: ( ( rule__IfConditions__IfBlocksAssignment_1 ) )
            // InternalHale.g:5585:2: ( rule__IfConditions__IfBlocksAssignment_1 )
            {
             before(grammarAccess.getIfConditionsAccess().getIfBlocksAssignment_1()); 
            // InternalHale.g:5586:2: ( rule__IfConditions__IfBlocksAssignment_1 )
            // InternalHale.g:5586:3: rule__IfConditions__IfBlocksAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__IfConditions__IfBlocksAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIfConditionsAccess().getIfBlocksAssignment_1()); 

            }


            }

        }
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
    // InternalHale.g:5594:1: rule__IfConditions__Group__2 : rule__IfConditions__Group__2__Impl rule__IfConditions__Group__3 ;
    public final void rule__IfConditions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5598:1: ( rule__IfConditions__Group__2__Impl rule__IfConditions__Group__3 )
            // InternalHale.g:5599:2: rule__IfConditions__Group__2__Impl rule__IfConditions__Group__3
            {
            pushFollow(FOLLOW_55);
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
    // InternalHale.g:5606:1: rule__IfConditions__Group__2__Impl : ( ( rule__IfConditions__Group_2__0 )* ) ;
    public final void rule__IfConditions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5610:1: ( ( ( rule__IfConditions__Group_2__0 )* ) )
            // InternalHale.g:5611:1: ( ( rule__IfConditions__Group_2__0 )* )
            {
            // InternalHale.g:5611:1: ( ( rule__IfConditions__Group_2__0 )* )
            // InternalHale.g:5612:2: ( rule__IfConditions__Group_2__0 )*
            {
             before(grammarAccess.getIfConditionsAccess().getGroup_2()); 
            // InternalHale.g:5613:2: ( rule__IfConditions__Group_2__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==45) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalHale.g:5613:3: rule__IfConditions__Group_2__0
            	    {
            	    pushFollow(FOLLOW_56);
            	    rule__IfConditions__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             after(grammarAccess.getIfConditionsAccess().getGroup_2()); 

            }


            }

        }
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
    // InternalHale.g:5621:1: rule__IfConditions__Group__3 : rule__IfConditions__Group__3__Impl ;
    public final void rule__IfConditions__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5625:1: ( rule__IfConditions__Group__3__Impl )
            // InternalHale.g:5626:2: rule__IfConditions__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IfConditions__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalHale.g:5632:1: rule__IfConditions__Group__3__Impl : ( ( rule__IfConditions__Group_3__0 )? ) ;
    public final void rule__IfConditions__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5636:1: ( ( ( rule__IfConditions__Group_3__0 )? ) )
            // InternalHale.g:5637:1: ( ( rule__IfConditions__Group_3__0 )? )
            {
            // InternalHale.g:5637:1: ( ( rule__IfConditions__Group_3__0 )? )
            // InternalHale.g:5638:2: ( rule__IfConditions__Group_3__0 )?
            {
             before(grammarAccess.getIfConditionsAccess().getGroup_3()); 
            // InternalHale.g:5639:2: ( rule__IfConditions__Group_3__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==44) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalHale.g:5639:3: rule__IfConditions__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IfConditions__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

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


    // $ANTLR start "rule__IfConditions__Group_2__0"
    // InternalHale.g:5648:1: rule__IfConditions__Group_2__0 : rule__IfConditions__Group_2__0__Impl rule__IfConditions__Group_2__1 ;
    public final void rule__IfConditions__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5652:1: ( rule__IfConditions__Group_2__0__Impl rule__IfConditions__Group_2__1 )
            // InternalHale.g:5653:2: rule__IfConditions__Group_2__0__Impl rule__IfConditions__Group_2__1
            {
            pushFollow(FOLLOW_9);
            rule__IfConditions__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfConditions__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfConditions__Group_2__0"


    // $ANTLR start "rule__IfConditions__Group_2__0__Impl"
    // InternalHale.g:5660:1: rule__IfConditions__Group_2__0__Impl : ( 'elseif' ) ;
    public final void rule__IfConditions__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5664:1: ( ( 'elseif' ) )
            // InternalHale.g:5665:1: ( 'elseif' )
            {
            // InternalHale.g:5665:1: ( 'elseif' )
            // InternalHale.g:5666:2: 'elseif'
            {
             before(grammarAccess.getIfConditionsAccess().getElseifKeyword_2_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getIfConditionsAccess().getElseifKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfConditions__Group_2__0__Impl"


    // $ANTLR start "rule__IfConditions__Group_2__1"
    // InternalHale.g:5675:1: rule__IfConditions__Group_2__1 : rule__IfConditions__Group_2__1__Impl rule__IfConditions__Group_2__2 ;
    public final void rule__IfConditions__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5679:1: ( rule__IfConditions__Group_2__1__Impl rule__IfConditions__Group_2__2 )
            // InternalHale.g:5680:2: rule__IfConditions__Group_2__1__Impl rule__IfConditions__Group_2__2
            {
            pushFollow(FOLLOW_52);
            rule__IfConditions__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfConditions__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfConditions__Group_2__1"


    // $ANTLR start "rule__IfConditions__Group_2__1__Impl"
    // InternalHale.g:5687:1: rule__IfConditions__Group_2__1__Impl : ( ( rule__IfConditions__ConditionsAssignment_2_1 ) ) ;
    public final void rule__IfConditions__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5691:1: ( ( ( rule__IfConditions__ConditionsAssignment_2_1 ) ) )
            // InternalHale.g:5692:1: ( ( rule__IfConditions__ConditionsAssignment_2_1 ) )
            {
            // InternalHale.g:5692:1: ( ( rule__IfConditions__ConditionsAssignment_2_1 ) )
            // InternalHale.g:5693:2: ( rule__IfConditions__ConditionsAssignment_2_1 )
            {
             before(grammarAccess.getIfConditionsAccess().getConditionsAssignment_2_1()); 
            // InternalHale.g:5694:2: ( rule__IfConditions__ConditionsAssignment_2_1 )
            // InternalHale.g:5694:3: rule__IfConditions__ConditionsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__IfConditions__ConditionsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getIfConditionsAccess().getConditionsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfConditions__Group_2__1__Impl"


    // $ANTLR start "rule__IfConditions__Group_2__2"
    // InternalHale.g:5702:1: rule__IfConditions__Group_2__2 : rule__IfConditions__Group_2__2__Impl ;
    public final void rule__IfConditions__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5706:1: ( rule__IfConditions__Group_2__2__Impl )
            // InternalHale.g:5707:2: rule__IfConditions__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IfConditions__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfConditions__Group_2__2"


    // $ANTLR start "rule__IfConditions__Group_2__2__Impl"
    // InternalHale.g:5713:1: rule__IfConditions__Group_2__2__Impl : ( ( rule__IfConditions__IfBlocksAssignment_2_2 ) ) ;
    public final void rule__IfConditions__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5717:1: ( ( ( rule__IfConditions__IfBlocksAssignment_2_2 ) ) )
            // InternalHale.g:5718:1: ( ( rule__IfConditions__IfBlocksAssignment_2_2 ) )
            {
            // InternalHale.g:5718:1: ( ( rule__IfConditions__IfBlocksAssignment_2_2 ) )
            // InternalHale.g:5719:2: ( rule__IfConditions__IfBlocksAssignment_2_2 )
            {
             before(grammarAccess.getIfConditionsAccess().getIfBlocksAssignment_2_2()); 
            // InternalHale.g:5720:2: ( rule__IfConditions__IfBlocksAssignment_2_2 )
            // InternalHale.g:5720:3: rule__IfConditions__IfBlocksAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__IfConditions__IfBlocksAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getIfConditionsAccess().getIfBlocksAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfConditions__Group_2__2__Impl"


    // $ANTLR start "rule__IfConditions__Group_3__0"
    // InternalHale.g:5729:1: rule__IfConditions__Group_3__0 : rule__IfConditions__Group_3__0__Impl rule__IfConditions__Group_3__1 ;
    public final void rule__IfConditions__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5733:1: ( rule__IfConditions__Group_3__0__Impl rule__IfConditions__Group_3__1 )
            // InternalHale.g:5734:2: rule__IfConditions__Group_3__0__Impl rule__IfConditions__Group_3__1
            {
            pushFollow(FOLLOW_52);
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
    // InternalHale.g:5741:1: rule__IfConditions__Group_3__0__Impl : ( 'else' ) ;
    public final void rule__IfConditions__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5745:1: ( ( 'else' ) )
            // InternalHale.g:5746:1: ( 'else' )
            {
            // InternalHale.g:5746:1: ( 'else' )
            // InternalHale.g:5747:2: 'else'
            {
             before(grammarAccess.getIfConditionsAccess().getElseKeyword_3_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getIfConditionsAccess().getElseKeyword_3_0()); 

            }


            }

        }
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
    // InternalHale.g:5756:1: rule__IfConditions__Group_3__1 : rule__IfConditions__Group_3__1__Impl ;
    public final void rule__IfConditions__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5760:1: ( rule__IfConditions__Group_3__1__Impl )
            // InternalHale.g:5761:2: rule__IfConditions__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IfConditions__Group_3__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalHale.g:5767:1: rule__IfConditions__Group_3__1__Impl : ( ( rule__IfConditions__ElseBlockAssignment_3_1 ) ) ;
    public final void rule__IfConditions__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5771:1: ( ( ( rule__IfConditions__ElseBlockAssignment_3_1 ) ) )
            // InternalHale.g:5772:1: ( ( rule__IfConditions__ElseBlockAssignment_3_1 ) )
            {
            // InternalHale.g:5772:1: ( ( rule__IfConditions__ElseBlockAssignment_3_1 ) )
            // InternalHale.g:5773:2: ( rule__IfConditions__ElseBlockAssignment_3_1 )
            {
             before(grammarAccess.getIfConditionsAccess().getElseBlockAssignment_3_1()); 
            // InternalHale.g:5774:2: ( rule__IfConditions__ElseBlockAssignment_3_1 )
            // InternalHale.g:5774:3: rule__IfConditions__ElseBlockAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__IfConditions__ElseBlockAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getIfConditionsAccess().getElseBlockAssignment_3_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__While__Group__0"
    // InternalHale.g:5783:1: rule__While__Group__0 : rule__While__Group__0__Impl rule__While__Group__1 ;
    public final void rule__While__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5787:1: ( rule__While__Group__0__Impl rule__While__Group__1 )
            // InternalHale.g:5788:2: rule__While__Group__0__Impl rule__While__Group__1
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
    // InternalHale.g:5795:1: rule__While__Group__0__Impl : ( 'while' ) ;
    public final void rule__While__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5799:1: ( ( 'while' ) )
            // InternalHale.g:5800:1: ( 'while' )
            {
            // InternalHale.g:5800:1: ( 'while' )
            // InternalHale.g:5801:2: 'while'
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
    // InternalHale.g:5810:1: rule__While__Group__1 : rule__While__Group__1__Impl rule__While__Group__2 ;
    public final void rule__While__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5814:1: ( rule__While__Group__1__Impl rule__While__Group__2 )
            // InternalHale.g:5815:2: rule__While__Group__1__Impl rule__While__Group__2
            {
            pushFollow(FOLLOW_52);
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
    // InternalHale.g:5822:1: rule__While__Group__1__Impl : ( ( rule__While__ConditionAssignment_1 ) ) ;
    public final void rule__While__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5826:1: ( ( ( rule__While__ConditionAssignment_1 ) ) )
            // InternalHale.g:5827:1: ( ( rule__While__ConditionAssignment_1 ) )
            {
            // InternalHale.g:5827:1: ( ( rule__While__ConditionAssignment_1 ) )
            // InternalHale.g:5828:2: ( rule__While__ConditionAssignment_1 )
            {
             before(grammarAccess.getWhileAccess().getConditionAssignment_1()); 
            // InternalHale.g:5829:2: ( rule__While__ConditionAssignment_1 )
            // InternalHale.g:5829:3: rule__While__ConditionAssignment_1
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
    // InternalHale.g:5837:1: rule__While__Group__2 : rule__While__Group__2__Impl ;
    public final void rule__While__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5841:1: ( rule__While__Group__2__Impl )
            // InternalHale.g:5842:2: rule__While__Group__2__Impl
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
    // InternalHale.g:5848:1: rule__While__Group__2__Impl : ( ( rule__While__BlockAssignment_2 ) ) ;
    public final void rule__While__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5852:1: ( ( ( rule__While__BlockAssignment_2 ) ) )
            // InternalHale.g:5853:1: ( ( rule__While__BlockAssignment_2 ) )
            {
            // InternalHale.g:5853:1: ( ( rule__While__BlockAssignment_2 ) )
            // InternalHale.g:5854:2: ( rule__While__BlockAssignment_2 )
            {
             before(grammarAccess.getWhileAccess().getBlockAssignment_2()); 
            // InternalHale.g:5855:2: ( rule__While__BlockAssignment_2 )
            // InternalHale.g:5855:3: rule__While__BlockAssignment_2
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
    // InternalHale.g:5864:1: rule__Break__Group__0 : rule__Break__Group__0__Impl rule__Break__Group__1 ;
    public final void rule__Break__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5868:1: ( rule__Break__Group__0__Impl rule__Break__Group__1 )
            // InternalHale.g:5869:2: rule__Break__Group__0__Impl rule__Break__Group__1
            {
            pushFollow(FOLLOW_57);
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
    // InternalHale.g:5876:1: rule__Break__Group__0__Impl : ( () ) ;
    public final void rule__Break__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5880:1: ( ( () ) )
            // InternalHale.g:5881:1: ( () )
            {
            // InternalHale.g:5881:1: ( () )
            // InternalHale.g:5882:2: ()
            {
             before(grammarAccess.getBreakAccess().getBreakAction_0()); 
            // InternalHale.g:5883:2: ()
            // InternalHale.g:5883:3: 
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
    // InternalHale.g:5891:1: rule__Break__Group__1 : rule__Break__Group__1__Impl ;
    public final void rule__Break__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5895:1: ( rule__Break__Group__1__Impl )
            // InternalHale.g:5896:2: rule__Break__Group__1__Impl
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
    // InternalHale.g:5902:1: rule__Break__Group__1__Impl : ( 'break' ) ;
    public final void rule__Break__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5906:1: ( ( 'break' ) )
            // InternalHale.g:5907:1: ( 'break' )
            {
            // InternalHale.g:5907:1: ( 'break' )
            // InternalHale.g:5908:2: 'break'
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
    // InternalHale.g:5918:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5922:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // InternalHale.g:5923:2: rule__Function__Group__0__Impl rule__Function__Group__1
            {
            pushFollow(FOLLOW_48);
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
    // InternalHale.g:5930:1: rule__Function__Group__0__Impl : ( 'function' ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5934:1: ( ( 'function' ) )
            // InternalHale.g:5935:1: ( 'function' )
            {
            // InternalHale.g:5935:1: ( 'function' )
            // InternalHale.g:5936:2: 'function'
            {
             before(grammarAccess.getFunctionAccess().getFunctionKeyword_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getFunctionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__0__Impl"


    // $ANTLR start "rule__Function__Group__1"
    // InternalHale.g:5945:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5949:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // InternalHale.g:5950:2: rule__Function__Group__1__Impl rule__Function__Group__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalHale.g:5957:1: rule__Function__Group__1__Impl : ( ( rule__Function__BindingAssignment_1 ) ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5961:1: ( ( ( rule__Function__BindingAssignment_1 ) ) )
            // InternalHale.g:5962:1: ( ( rule__Function__BindingAssignment_1 ) )
            {
            // InternalHale.g:5962:1: ( ( rule__Function__BindingAssignment_1 ) )
            // InternalHale.g:5963:2: ( rule__Function__BindingAssignment_1 )
            {
             before(grammarAccess.getFunctionAccess().getBindingAssignment_1()); 
            // InternalHale.g:5964:2: ( rule__Function__BindingAssignment_1 )
            // InternalHale.g:5964:3: rule__Function__BindingAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Function__BindingAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getBindingAssignment_1()); 

            }


            }

        }
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
    // InternalHale.g:5972:1: rule__Function__Group__2 : rule__Function__Group__2__Impl rule__Function__Group__3 ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5976:1: ( rule__Function__Group__2__Impl rule__Function__Group__3 )
            // InternalHale.g:5977:2: rule__Function__Group__2__Impl rule__Function__Group__3
            {
            pushFollow(FOLLOW_58);
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
    // InternalHale.g:5984:1: rule__Function__Group__2__Impl : ( '(' ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:5988:1: ( ( '(' ) )
            // InternalHale.g:5989:1: ( '(' )
            {
            // InternalHale.g:5989:1: ( '(' )
            // InternalHale.g:5990:2: '('
            {
             before(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
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
    // InternalHale.g:5999:1: rule__Function__Group__3 : rule__Function__Group__3__Impl rule__Function__Group__4 ;
    public final void rule__Function__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6003:1: ( rule__Function__Group__3__Impl rule__Function__Group__4 )
            // InternalHale.g:6004:2: rule__Function__Group__3__Impl rule__Function__Group__4
            {
            pushFollow(FOLLOW_58);
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
    // InternalHale.g:6011:1: rule__Function__Group__3__Impl : ( ( rule__Function__Group_3__0 )? ) ;
    public final void rule__Function__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6015:1: ( ( ( rule__Function__Group_3__0 )? ) )
            // InternalHale.g:6016:1: ( ( rule__Function__Group_3__0 )? )
            {
            // InternalHale.g:6016:1: ( ( rule__Function__Group_3__0 )? )
            // InternalHale.g:6017:2: ( rule__Function__Group_3__0 )?
            {
             before(grammarAccess.getFunctionAccess().getGroup_3()); 
            // InternalHale.g:6018:2: ( rule__Function__Group_3__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_ID||LA43_0==51) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalHale.g:6018:3: rule__Function__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Function__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionAccess().getGroup_3()); 

            }


            }

        }
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
    // InternalHale.g:6026:1: rule__Function__Group__4 : rule__Function__Group__4__Impl rule__Function__Group__5 ;
    public final void rule__Function__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6030:1: ( rule__Function__Group__4__Impl rule__Function__Group__5 )
            // InternalHale.g:6031:2: rule__Function__Group__4__Impl rule__Function__Group__5
            {
            pushFollow(FOLLOW_59);
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
    // InternalHale.g:6038:1: rule__Function__Group__4__Impl : ( ')' ) ;
    public final void rule__Function__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6042:1: ( ( ')' ) )
            // InternalHale.g:6043:1: ( ')' )
            {
            // InternalHale.g:6043:1: ( ')' )
            // InternalHale.g:6044:2: ')'
            {
             before(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
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
    // InternalHale.g:6053:1: rule__Function__Group__5 : rule__Function__Group__5__Impl rule__Function__Group__6 ;
    public final void rule__Function__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6057:1: ( rule__Function__Group__5__Impl rule__Function__Group__6 )
            // InternalHale.g:6058:2: rule__Function__Group__5__Impl rule__Function__Group__6
            {
            pushFollow(FOLLOW_59);
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
    // InternalHale.g:6065:1: rule__Function__Group__5__Impl : ( ( rule__Function__ReturnTypeAssignment_5 )? ) ;
    public final void rule__Function__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6069:1: ( ( ( rule__Function__ReturnTypeAssignment_5 )? ) )
            // InternalHale.g:6070:1: ( ( rule__Function__ReturnTypeAssignment_5 )? )
            {
            // InternalHale.g:6070:1: ( ( rule__Function__ReturnTypeAssignment_5 )? )
            // InternalHale.g:6071:2: ( rule__Function__ReturnTypeAssignment_5 )?
            {
             before(grammarAccess.getFunctionAccess().getReturnTypeAssignment_5()); 
            // InternalHale.g:6072:2: ( rule__Function__ReturnTypeAssignment_5 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==36) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalHale.g:6072:3: rule__Function__ReturnTypeAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Function__ReturnTypeAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionAccess().getReturnTypeAssignment_5()); 

            }


            }

        }
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
    // InternalHale.g:6080:1: rule__Function__Group__6 : rule__Function__Group__6__Impl ;
    public final void rule__Function__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6084:1: ( rule__Function__Group__6__Impl )
            // InternalHale.g:6085:2: rule__Function__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group__6__Impl();

            state._fsp--;


            }

        }
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
    // InternalHale.g:6091:1: rule__Function__Group__6__Impl : ( ( rule__Function__BodyAssignment_6 ) ) ;
    public final void rule__Function__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6095:1: ( ( ( rule__Function__BodyAssignment_6 ) ) )
            // InternalHale.g:6096:1: ( ( rule__Function__BodyAssignment_6 ) )
            {
            // InternalHale.g:6096:1: ( ( rule__Function__BodyAssignment_6 ) )
            // InternalHale.g:6097:2: ( rule__Function__BodyAssignment_6 )
            {
             before(grammarAccess.getFunctionAccess().getBodyAssignment_6()); 
            // InternalHale.g:6098:2: ( rule__Function__BodyAssignment_6 )
            // InternalHale.g:6098:3: rule__Function__BodyAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Function__BodyAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getBodyAssignment_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__Function__Group_3__0"
    // InternalHale.g:6107:1: rule__Function__Group_3__0 : rule__Function__Group_3__0__Impl rule__Function__Group_3__1 ;
    public final void rule__Function__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6111:1: ( rule__Function__Group_3__0__Impl rule__Function__Group_3__1 )
            // InternalHale.g:6112:2: rule__Function__Group_3__0__Impl rule__Function__Group_3__1
            {
            pushFollow(FOLLOW_38);
            rule__Function__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_3__0"


    // $ANTLR start "rule__Function__Group_3__0__Impl"
    // InternalHale.g:6119:1: rule__Function__Group_3__0__Impl : ( ( rule__Function__ParametersAssignment_3_0 ) ) ;
    public final void rule__Function__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6123:1: ( ( ( rule__Function__ParametersAssignment_3_0 ) ) )
            // InternalHale.g:6124:1: ( ( rule__Function__ParametersAssignment_3_0 ) )
            {
            // InternalHale.g:6124:1: ( ( rule__Function__ParametersAssignment_3_0 ) )
            // InternalHale.g:6125:2: ( rule__Function__ParametersAssignment_3_0 )
            {
             before(grammarAccess.getFunctionAccess().getParametersAssignment_3_0()); 
            // InternalHale.g:6126:2: ( rule__Function__ParametersAssignment_3_0 )
            // InternalHale.g:6126:3: rule__Function__ParametersAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Function__ParametersAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getParametersAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_3__0__Impl"


    // $ANTLR start "rule__Function__Group_3__1"
    // InternalHale.g:6134:1: rule__Function__Group_3__1 : rule__Function__Group_3__1__Impl rule__Function__Group_3__2 ;
    public final void rule__Function__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6138:1: ( rule__Function__Group_3__1__Impl rule__Function__Group_3__2 )
            // InternalHale.g:6139:2: rule__Function__Group_3__1__Impl rule__Function__Group_3__2
            {
            pushFollow(FOLLOW_38);
            rule__Function__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_3__1"


    // $ANTLR start "rule__Function__Group_3__1__Impl"
    // InternalHale.g:6146:1: rule__Function__Group_3__1__Impl : ( ( rule__Function__Group_3_1__0 )* ) ;
    public final void rule__Function__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6150:1: ( ( ( rule__Function__Group_3_1__0 )* ) )
            // InternalHale.g:6151:1: ( ( rule__Function__Group_3_1__0 )* )
            {
            // InternalHale.g:6151:1: ( ( rule__Function__Group_3_1__0 )* )
            // InternalHale.g:6152:2: ( rule__Function__Group_3_1__0 )*
            {
             before(grammarAccess.getFunctionAccess().getGroup_3_1()); 
            // InternalHale.g:6153:2: ( rule__Function__Group_3_1__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==34) ) {
                    int LA45_1 = input.LA(2);

                    if ( (LA45_1==RULE_ID||LA45_1==51) ) {
                        alt45=1;
                    }


                }


                switch (alt45) {
            	case 1 :
            	    // InternalHale.g:6153:3: rule__Function__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__Function__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

             after(grammarAccess.getFunctionAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_3__1__Impl"


    // $ANTLR start "rule__Function__Group_3__2"
    // InternalHale.g:6161:1: rule__Function__Group_3__2 : rule__Function__Group_3__2__Impl ;
    public final void rule__Function__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6165:1: ( rule__Function__Group_3__2__Impl )
            // InternalHale.g:6166:2: rule__Function__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_3__2"


    // $ANTLR start "rule__Function__Group_3__2__Impl"
    // InternalHale.g:6172:1: rule__Function__Group_3__2__Impl : ( ( ',' )? ) ;
    public final void rule__Function__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6176:1: ( ( ( ',' )? ) )
            // InternalHale.g:6177:1: ( ( ',' )? )
            {
            // InternalHale.g:6177:1: ( ( ',' )? )
            // InternalHale.g:6178:2: ( ',' )?
            {
             before(grammarAccess.getFunctionAccess().getCommaKeyword_3_2()); 
            // InternalHale.g:6179:2: ( ',' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==34) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalHale.g:6179:3: ','
                    {
                    match(input,34,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getFunctionAccess().getCommaKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_3__2__Impl"


    // $ANTLR start "rule__Function__Group_3_1__0"
    // InternalHale.g:6188:1: rule__Function__Group_3_1__0 : rule__Function__Group_3_1__0__Impl rule__Function__Group_3_1__1 ;
    public final void rule__Function__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6192:1: ( rule__Function__Group_3_1__0__Impl rule__Function__Group_3_1__1 )
            // InternalHale.g:6193:2: rule__Function__Group_3_1__0__Impl rule__Function__Group_3_1__1
            {
            pushFollow(FOLLOW_48);
            rule__Function__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_3_1__0"


    // $ANTLR start "rule__Function__Group_3_1__0__Impl"
    // InternalHale.g:6200:1: rule__Function__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Function__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6204:1: ( ( ',' ) )
            // InternalHale.g:6205:1: ( ',' )
            {
            // InternalHale.g:6205:1: ( ',' )
            // InternalHale.g:6206:2: ','
            {
             before(grammarAccess.getFunctionAccess().getCommaKeyword_3_1_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getCommaKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_3_1__0__Impl"


    // $ANTLR start "rule__Function__Group_3_1__1"
    // InternalHale.g:6215:1: rule__Function__Group_3_1__1 : rule__Function__Group_3_1__1__Impl ;
    public final void rule__Function__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6219:1: ( rule__Function__Group_3_1__1__Impl )
            // InternalHale.g:6220:2: rule__Function__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_3_1__1"


    // $ANTLR start "rule__Function__Group_3_1__1__Impl"
    // InternalHale.g:6226:1: rule__Function__Group_3_1__1__Impl : ( ( rule__Function__ParametersAssignment_3_1_1 ) ) ;
    public final void rule__Function__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6230:1: ( ( ( rule__Function__ParametersAssignment_3_1_1 ) ) )
            // InternalHale.g:6231:1: ( ( rule__Function__ParametersAssignment_3_1_1 ) )
            {
            // InternalHale.g:6231:1: ( ( rule__Function__ParametersAssignment_3_1_1 ) )
            // InternalHale.g:6232:2: ( rule__Function__ParametersAssignment_3_1_1 )
            {
             before(grammarAccess.getFunctionAccess().getParametersAssignment_3_1_1()); 
            // InternalHale.g:6233:2: ( rule__Function__ParametersAssignment_3_1_1 )
            // InternalHale.g:6233:3: rule__Function__ParametersAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Function__ParametersAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getParametersAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_3_1__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalHale.g:6242:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6246:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalHale.g:6247:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_48);
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
    // InternalHale.g:6254:1: rule__Parameter__Group__0__Impl : ( () ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6258:1: ( ( () ) )
            // InternalHale.g:6259:1: ( () )
            {
            // InternalHale.g:6259:1: ( () )
            // InternalHale.g:6260:2: ()
            {
             before(grammarAccess.getParameterAccess().getParameterAction_0()); 
            // InternalHale.g:6261:2: ()
            // InternalHale.g:6261:3: 
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
    // InternalHale.g:6269:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6273:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalHale.g:6274:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_48);
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
    // InternalHale.g:6281:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__MutableAssignment_1 )? ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6285:1: ( ( ( rule__Parameter__MutableAssignment_1 )? ) )
            // InternalHale.g:6286:1: ( ( rule__Parameter__MutableAssignment_1 )? )
            {
            // InternalHale.g:6286:1: ( ( rule__Parameter__MutableAssignment_1 )? )
            // InternalHale.g:6287:2: ( rule__Parameter__MutableAssignment_1 )?
            {
             before(grammarAccess.getParameterAccess().getMutableAssignment_1()); 
            // InternalHale.g:6288:2: ( rule__Parameter__MutableAssignment_1 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==51) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalHale.g:6288:3: rule__Parameter__MutableAssignment_1
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
    // InternalHale.g:6296:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6300:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // InternalHale.g:6301:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
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
    // InternalHale.g:6308:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__BindingAssignment_2 ) ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6312:1: ( ( ( rule__Parameter__BindingAssignment_2 ) ) )
            // InternalHale.g:6313:1: ( ( rule__Parameter__BindingAssignment_2 ) )
            {
            // InternalHale.g:6313:1: ( ( rule__Parameter__BindingAssignment_2 ) )
            // InternalHale.g:6314:2: ( rule__Parameter__BindingAssignment_2 )
            {
             before(grammarAccess.getParameterAccess().getBindingAssignment_2()); 
            // InternalHale.g:6315:2: ( rule__Parameter__BindingAssignment_2 )
            // InternalHale.g:6315:3: rule__Parameter__BindingAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__BindingAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getBindingAssignment_2()); 

            }


            }

        }
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
    // InternalHale.g:6323:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6327:1: ( rule__Parameter__Group__3__Impl )
            // InternalHale.g:6328:2: rule__Parameter__Group__3__Impl
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
    // InternalHale.g:6334:1: rule__Parameter__Group__3__Impl : ( ( rule__Parameter__TypeAssignment_3 ) ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6338:1: ( ( ( rule__Parameter__TypeAssignment_3 ) ) )
            // InternalHale.g:6339:1: ( ( rule__Parameter__TypeAssignment_3 ) )
            {
            // InternalHale.g:6339:1: ( ( rule__Parameter__TypeAssignment_3 ) )
            // InternalHale.g:6340:2: ( rule__Parameter__TypeAssignment_3 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_3()); 
            // InternalHale.g:6341:2: ( rule__Parameter__TypeAssignment_3 )
            // InternalHale.g:6341:3: rule__Parameter__TypeAssignment_3
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
    // InternalHale.g:6350:1: rule__Return__Group__0 : rule__Return__Group__0__Impl rule__Return__Group__1 ;
    public final void rule__Return__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6354:1: ( rule__Return__Group__0__Impl rule__Return__Group__1 )
            // InternalHale.g:6355:2: rule__Return__Group__0__Impl rule__Return__Group__1
            {
            pushFollow(FOLLOW_60);
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
    // InternalHale.g:6362:1: rule__Return__Group__0__Impl : ( () ) ;
    public final void rule__Return__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6366:1: ( ( () ) )
            // InternalHale.g:6367:1: ( () )
            {
            // InternalHale.g:6367:1: ( () )
            // InternalHale.g:6368:2: ()
            {
             before(grammarAccess.getReturnAccess().getReturnAction_0()); 
            // InternalHale.g:6369:2: ()
            // InternalHale.g:6369:3: 
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
    // InternalHale.g:6377:1: rule__Return__Group__1 : rule__Return__Group__1__Impl rule__Return__Group__2 ;
    public final void rule__Return__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6381:1: ( rule__Return__Group__1__Impl rule__Return__Group__2 )
            // InternalHale.g:6382:2: rule__Return__Group__1__Impl rule__Return__Group__2
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
    // InternalHale.g:6389:1: rule__Return__Group__1__Impl : ( 'return' ) ;
    public final void rule__Return__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6393:1: ( ( 'return' ) )
            // InternalHale.g:6394:1: ( 'return' )
            {
            // InternalHale.g:6394:1: ( 'return' )
            // InternalHale.g:6395:2: 'return'
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
    // InternalHale.g:6404:1: rule__Return__Group__2 : rule__Return__Group__2__Impl ;
    public final void rule__Return__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6408:1: ( rule__Return__Group__2__Impl )
            // InternalHale.g:6409:2: rule__Return__Group__2__Impl
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
    // InternalHale.g:6415:1: rule__Return__Group__2__Impl : ( ( rule__Return__ExpressionAssignment_2 )? ) ;
    public final void rule__Return__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6419:1: ( ( ( rule__Return__ExpressionAssignment_2 )? ) )
            // InternalHale.g:6420:1: ( ( rule__Return__ExpressionAssignment_2 )? )
            {
            // InternalHale.g:6420:1: ( ( rule__Return__ExpressionAssignment_2 )? )
            // InternalHale.g:6421:2: ( rule__Return__ExpressionAssignment_2 )?
            {
             before(grammarAccess.getReturnAccess().getExpressionAssignment_2()); 
            // InternalHale.g:6422:2: ( rule__Return__ExpressionAssignment_2 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=RULE_BOOLEAN && LA48_0<=RULE_STRING)||LA48_0==RULE_ID||LA48_0==25||(LA48_0>=31 && LA48_0<=32)||LA48_0==35||LA48_0==41) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalHale.g:6422:3: rule__Return__ExpressionAssignment_2
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
    // InternalHale.g:6431:1: rule__Throw__Group__0 : rule__Throw__Group__0__Impl rule__Throw__Group__1 ;
    public final void rule__Throw__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6435:1: ( rule__Throw__Group__0__Impl rule__Throw__Group__1 )
            // InternalHale.g:6436:2: rule__Throw__Group__0__Impl rule__Throw__Group__1
            {
            pushFollow(FOLLOW_61);
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
    // InternalHale.g:6443:1: rule__Throw__Group__0__Impl : ( () ) ;
    public final void rule__Throw__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6447:1: ( ( () ) )
            // InternalHale.g:6448:1: ( () )
            {
            // InternalHale.g:6448:1: ( () )
            // InternalHale.g:6449:2: ()
            {
             before(grammarAccess.getThrowAccess().getThrowAction_0()); 
            // InternalHale.g:6450:2: ()
            // InternalHale.g:6450:3: 
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
    // InternalHale.g:6458:1: rule__Throw__Group__1 : rule__Throw__Group__1__Impl rule__Throw__Group__2 ;
    public final void rule__Throw__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6462:1: ( rule__Throw__Group__1__Impl rule__Throw__Group__2 )
            // InternalHale.g:6463:2: rule__Throw__Group__1__Impl rule__Throw__Group__2
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
    // InternalHale.g:6470:1: rule__Throw__Group__1__Impl : ( 'throw' ) ;
    public final void rule__Throw__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6474:1: ( ( 'throw' ) )
            // InternalHale.g:6475:1: ( 'throw' )
            {
            // InternalHale.g:6475:1: ( 'throw' )
            // InternalHale.g:6476:2: 'throw'
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
    // InternalHale.g:6485:1: rule__Throw__Group__2 : rule__Throw__Group__2__Impl ;
    public final void rule__Throw__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6489:1: ( rule__Throw__Group__2__Impl )
            // InternalHale.g:6490:2: rule__Throw__Group__2__Impl
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
    // InternalHale.g:6496:1: rule__Throw__Group__2__Impl : ( ( rule__Throw__ExpressionAssignment_2 )? ) ;
    public final void rule__Throw__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6500:1: ( ( ( rule__Throw__ExpressionAssignment_2 )? ) )
            // InternalHale.g:6501:1: ( ( rule__Throw__ExpressionAssignment_2 )? )
            {
            // InternalHale.g:6501:1: ( ( rule__Throw__ExpressionAssignment_2 )? )
            // InternalHale.g:6502:2: ( rule__Throw__ExpressionAssignment_2 )?
            {
             before(grammarAccess.getThrowAccess().getExpressionAssignment_2()); 
            // InternalHale.g:6503:2: ( rule__Throw__ExpressionAssignment_2 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=RULE_BOOLEAN && LA49_0<=RULE_STRING)||LA49_0==RULE_ID||LA49_0==25||(LA49_0>=31 && LA49_0<=32)||LA49_0==35||LA49_0==41) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalHale.g:6503:3: rule__Throw__ExpressionAssignment_2
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
    // InternalHale.g:6512:1: rule__Hale__MainBlockAssignment_1 : ( ruleBlock ) ;
    public final void rule__Hale__MainBlockAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6516:1: ( ( ruleBlock ) )
            // InternalHale.g:6517:2: ( ruleBlock )
            {
            // InternalHale.g:6517:2: ( ruleBlock )
            // InternalHale.g:6518:3: ruleBlock
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
    // InternalHale.g:6527:1: rule__Block__StatementsAssignment_1_0 : ( ruleStatement ) ;
    public final void rule__Block__StatementsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6531:1: ( ( ruleStatement ) )
            // InternalHale.g:6532:2: ( ruleStatement )
            {
            // InternalHale.g:6532:2: ( ruleStatement )
            // InternalHale.g:6533:3: ruleStatement
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
    // InternalHale.g:6542:1: rule__Expression10__RightAssignment_1_2 : ( ruleExpression9 ) ;
    public final void rule__Expression10__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6546:1: ( ( ruleExpression9 ) )
            // InternalHale.g:6547:2: ( ruleExpression9 )
            {
            // InternalHale.g:6547:2: ( ruleExpression9 )
            // InternalHale.g:6548:3: ruleExpression9
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
    // InternalHale.g:6557:1: rule__Expression9__RightAssignment_1_0_2 : ( ruleExpression8 ) ;
    public final void rule__Expression9__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6561:1: ( ( ruleExpression8 ) )
            // InternalHale.g:6562:2: ( ruleExpression8 )
            {
            // InternalHale.g:6562:2: ( ruleExpression8 )
            // InternalHale.g:6563:3: ruleExpression8
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
    // InternalHale.g:6572:1: rule__Expression9__RightAssignment_1_1_2 : ( ruleExpression8 ) ;
    public final void rule__Expression9__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6576:1: ( ( ruleExpression8 ) )
            // InternalHale.g:6577:2: ( ruleExpression8 )
            {
            // InternalHale.g:6577:2: ( ruleExpression8 )
            // InternalHale.g:6578:3: ruleExpression8
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
    // InternalHale.g:6587:1: rule__Expression8__RightAssignment_1_0_2 : ( ruleExpression7 ) ;
    public final void rule__Expression8__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6591:1: ( ( ruleExpression7 ) )
            // InternalHale.g:6592:2: ( ruleExpression7 )
            {
            // InternalHale.g:6592:2: ( ruleExpression7 )
            // InternalHale.g:6593:3: ruleExpression7
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
    // InternalHale.g:6602:1: rule__Expression8__RightAssignment_1_1_2 : ( ruleExpression7 ) ;
    public final void rule__Expression8__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6606:1: ( ( ruleExpression7 ) )
            // InternalHale.g:6607:2: ( ruleExpression7 )
            {
            // InternalHale.g:6607:2: ( ruleExpression7 )
            // InternalHale.g:6608:3: ruleExpression7
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
    // InternalHale.g:6617:1: rule__Expression7__RightAssignment_1_0_2 : ( ruleExpression6 ) ;
    public final void rule__Expression7__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6621:1: ( ( ruleExpression6 ) )
            // InternalHale.g:6622:2: ( ruleExpression6 )
            {
            // InternalHale.g:6622:2: ( ruleExpression6 )
            // InternalHale.g:6623:3: ruleExpression6
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
    // InternalHale.g:6632:1: rule__Expression7__RightAssignment_1_1_2 : ( ruleExpression6 ) ;
    public final void rule__Expression7__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6636:1: ( ( ruleExpression6 ) )
            // InternalHale.g:6637:2: ( ruleExpression6 )
            {
            // InternalHale.g:6637:2: ( ruleExpression6 )
            // InternalHale.g:6638:3: ruleExpression6
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
    // InternalHale.g:6647:1: rule__Expression7__RightAssignment_1_2_2 : ( ruleExpression6 ) ;
    public final void rule__Expression7__RightAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6651:1: ( ( ruleExpression6 ) )
            // InternalHale.g:6652:2: ( ruleExpression6 )
            {
            // InternalHale.g:6652:2: ( ruleExpression6 )
            // InternalHale.g:6653:3: ruleExpression6
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
    // InternalHale.g:6662:1: rule__Expression7__RightAssignment_1_3_2 : ( ruleExpression6 ) ;
    public final void rule__Expression7__RightAssignment_1_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6666:1: ( ( ruleExpression6 ) )
            // InternalHale.g:6667:2: ( ruleExpression6 )
            {
            // InternalHale.g:6667:2: ( ruleExpression6 )
            // InternalHale.g:6668:3: ruleExpression6
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
    // InternalHale.g:6677:1: rule__Expression6__RightAssignment_1_0_2 : ( ruleExpression5 ) ;
    public final void rule__Expression6__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6681:1: ( ( ruleExpression5 ) )
            // InternalHale.g:6682:2: ( ruleExpression5 )
            {
            // InternalHale.g:6682:2: ( ruleExpression5 )
            // InternalHale.g:6683:3: ruleExpression5
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
    // InternalHale.g:6692:1: rule__Expression6__RightAssignment_1_1_2 : ( ruleExpression5 ) ;
    public final void rule__Expression6__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6696:1: ( ( ruleExpression5 ) )
            // InternalHale.g:6697:2: ( ruleExpression5 )
            {
            // InternalHale.g:6697:2: ( ruleExpression5 )
            // InternalHale.g:6698:3: ruleExpression5
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
    // InternalHale.g:6707:1: rule__Expression5__RightAssignment_1_0_2 : ( ruleExpression4 ) ;
    public final void rule__Expression5__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6711:1: ( ( ruleExpression4 ) )
            // InternalHale.g:6712:2: ( ruleExpression4 )
            {
            // InternalHale.g:6712:2: ( ruleExpression4 )
            // InternalHale.g:6713:3: ruleExpression4
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
    // InternalHale.g:6722:1: rule__Expression5__RightAssignment_1_1_2 : ( ruleExpression4 ) ;
    public final void rule__Expression5__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6726:1: ( ( ruleExpression4 ) )
            // InternalHale.g:6727:2: ( ruleExpression4 )
            {
            // InternalHale.g:6727:2: ( ruleExpression4 )
            // InternalHale.g:6728:3: ruleExpression4
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
    // InternalHale.g:6737:1: rule__Expression5__RightAssignment_1_2_2 : ( ruleExpression4 ) ;
    public final void rule__Expression5__RightAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6741:1: ( ( ruleExpression4 ) )
            // InternalHale.g:6742:2: ( ruleExpression4 )
            {
            // InternalHale.g:6742:2: ( ruleExpression4 )
            // InternalHale.g:6743:3: ruleExpression4
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
    // InternalHale.g:6752:1: rule__Expression4__RightAssignment_1_2 : ( ruleExpression3 ) ;
    public final void rule__Expression4__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6756:1: ( ( ruleExpression3 ) )
            // InternalHale.g:6757:2: ( ruleExpression3 )
            {
            // InternalHale.g:6757:2: ( ruleExpression3 )
            // InternalHale.g:6758:3: ruleExpression3
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
    // InternalHale.g:6767:1: rule__Expression3__RightAssignment_1_2 : ( ruleType ) ;
    public final void rule__Expression3__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6771:1: ( ( ruleType ) )
            // InternalHale.g:6772:2: ( ruleType )
            {
            // InternalHale.g:6772:2: ( ruleType )
            // InternalHale.g:6773:3: ruleType
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
    // InternalHale.g:6782:1: rule__Expression2__InnerAssignment_0_2 : ( ruleExpression2 ) ;
    public final void rule__Expression2__InnerAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6786:1: ( ( ruleExpression2 ) )
            // InternalHale.g:6787:2: ( ruleExpression2 )
            {
            // InternalHale.g:6787:2: ( ruleExpression2 )
            // InternalHale.g:6788:3: ruleExpression2
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
    // InternalHale.g:6797:1: rule__Expression2__InnerAssignment_1_2 : ( ruleExpression2 ) ;
    public final void rule__Expression2__InnerAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6801:1: ( ( ruleExpression2 ) )
            // InternalHale.g:6802:2: ( ruleExpression2 )
            {
            // InternalHale.g:6802:2: ( ruleExpression2 )
            // InternalHale.g:6803:3: ruleExpression2
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
    // InternalHale.g:6812:1: rule__Expression1__ArgumentsAssignment_1_2_0 : ( ruleExpression ) ;
    public final void rule__Expression1__ArgumentsAssignment_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6816:1: ( ( ruleExpression ) )
            // InternalHale.g:6817:2: ( ruleExpression )
            {
            // InternalHale.g:6817:2: ( ruleExpression )
            // InternalHale.g:6818:3: ruleExpression
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
    // InternalHale.g:6827:1: rule__Expression1__ArgumentsAssignment_1_2_1_1 : ( ruleExpression ) ;
    public final void rule__Expression1__ArgumentsAssignment_1_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6831:1: ( ( ruleExpression ) )
            // InternalHale.g:6832:2: ( ruleExpression )
            {
            // InternalHale.g:6832:2: ( ruleExpression )
            // InternalHale.g:6833:3: ruleExpression
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
    // InternalHale.g:6842:1: rule__BooleanLiteral__ValueAssignment : ( RULE_BOOLEAN ) ;
    public final void rule__BooleanLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6846:1: ( ( RULE_BOOLEAN ) )
            // InternalHale.g:6847:2: ( RULE_BOOLEAN )
            {
            // InternalHale.g:6847:2: ( RULE_BOOLEAN )
            // InternalHale.g:6848:3: RULE_BOOLEAN
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
    // InternalHale.g:6857:1: rule__NumberLiteral__ValueAssignment : ( RULE_DOUBLE ) ;
    public final void rule__NumberLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6861:1: ( ( RULE_DOUBLE ) )
            // InternalHale.g:6862:2: ( RULE_DOUBLE )
            {
            // InternalHale.g:6862:2: ( RULE_DOUBLE )
            // InternalHale.g:6863:3: RULE_DOUBLE
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
    // InternalHale.g:6872:1: rule__StringLiteral__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6876:1: ( ( RULE_STRING ) )
            // InternalHale.g:6877:2: ( RULE_STRING )
            {
            // InternalHale.g:6877:2: ( RULE_STRING )
            // InternalHale.g:6878:3: RULE_STRING
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
    // InternalHale.g:6887:1: rule__FunctionType__ParamTypesAssignment_0_3_0 : ( ruleType ) ;
    public final void rule__FunctionType__ParamTypesAssignment_0_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6891:1: ( ( ruleType ) )
            // InternalHale.g:6892:2: ( ruleType )
            {
            // InternalHale.g:6892:2: ( ruleType )
            // InternalHale.g:6893:3: ruleType
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
    // InternalHale.g:6902:1: rule__FunctionType__ParamTypesAssignment_0_3_1_1 : ( ruleType ) ;
    public final void rule__FunctionType__ParamTypesAssignment_0_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6906:1: ( ( ruleType ) )
            // InternalHale.g:6907:2: ( ruleType )
            {
            // InternalHale.g:6907:2: ( ruleType )
            // InternalHale.g:6908:3: ruleType
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
    // InternalHale.g:6917:1: rule__FunctionType__ReturnTypeAssignment_0_5 : ( ruleTypeAnnotation ) ;
    public final void rule__FunctionType__ReturnTypeAssignment_0_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6921:1: ( ( ruleTypeAnnotation ) )
            // InternalHale.g:6922:2: ( ruleTypeAnnotation )
            {
            // InternalHale.g:6922:2: ( ruleTypeAnnotation )
            // InternalHale.g:6923:3: ruleTypeAnnotation
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
    // InternalHale.g:6932:1: rule__EitherType__RightAssignment_1_2 : ( rulePrimaryType ) ;
    public final void rule__EitherType__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6936:1: ( ( rulePrimaryType ) )
            // InternalHale.g:6937:2: ( rulePrimaryType )
            {
            // InternalHale.g:6937:2: ( rulePrimaryType )
            // InternalHale.g:6938:3: rulePrimaryType
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
    // InternalHale.g:6947:1: rule__PrimitiveType__TypeAssignment_1 : ( RULE_PRIMITIVE_TYPE ) ;
    public final void rule__PrimitiveType__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6951:1: ( ( RULE_PRIMITIVE_TYPE ) )
            // InternalHale.g:6952:2: ( RULE_PRIMITIVE_TYPE )
            {
            // InternalHale.g:6952:2: ( RULE_PRIMITIVE_TYPE )
            // InternalHale.g:6953:3: RULE_PRIMITIVE_TYPE
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


    // $ANTLR start "rule__Binding__NameAssignment"
    // InternalHale.g:6962:1: rule__Binding__NameAssignment : ( RULE_ID ) ;
    public final void rule__Binding__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6966:1: ( ( RULE_ID ) )
            // InternalHale.g:6967:2: ( RULE_ID )
            {
            // InternalHale.g:6967:2: ( RULE_ID )
            // InternalHale.g:6968:3: RULE_ID
            {
             before(grammarAccess.getBindingAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBindingAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__NameAssignment"


    // $ANTLR start "rule__LetBinding__MutableAssignment_1"
    // InternalHale.g:6977:1: rule__LetBinding__MutableAssignment_1 : ( ( 'mut' ) ) ;
    public final void rule__LetBinding__MutableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:6981:1: ( ( ( 'mut' ) ) )
            // InternalHale.g:6982:2: ( ( 'mut' ) )
            {
            // InternalHale.g:6982:2: ( ( 'mut' ) )
            // InternalHale.g:6983:3: ( 'mut' )
            {
             before(grammarAccess.getLetBindingAccess().getMutableMutKeyword_1_0()); 
            // InternalHale.g:6984:3: ( 'mut' )
            // InternalHale.g:6985:4: 'mut'
            {
             before(grammarAccess.getLetBindingAccess().getMutableMutKeyword_1_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getLetBindingAccess().getMutableMutKeyword_1_0()); 

            }

             after(grammarAccess.getLetBindingAccess().getMutableMutKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetBinding__MutableAssignment_1"


    // $ANTLR start "rule__LetBinding__BindingAssignment_2"
    // InternalHale.g:6996:1: rule__LetBinding__BindingAssignment_2 : ( ruleBinding ) ;
    public final void rule__LetBinding__BindingAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:7000:1: ( ( ruleBinding ) )
            // InternalHale.g:7001:2: ( ruleBinding )
            {
            // InternalHale.g:7001:2: ( ruleBinding )
            // InternalHale.g:7002:3: ruleBinding
            {
             before(grammarAccess.getLetBindingAccess().getBindingBindingParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBinding();

            state._fsp--;

             after(grammarAccess.getLetBindingAccess().getBindingBindingParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetBinding__BindingAssignment_2"


    // $ANTLR start "rule__LetBinding__TypeAssignment_3"
    // InternalHale.g:7011:1: rule__LetBinding__TypeAssignment_3 : ( ruleTypeAnnotation ) ;
    public final void rule__LetBinding__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:7015:1: ( ( ruleTypeAnnotation ) )
            // InternalHale.g:7016:2: ( ruleTypeAnnotation )
            {
            // InternalHale.g:7016:2: ( ruleTypeAnnotation )
            // InternalHale.g:7017:3: ruleTypeAnnotation
            {
             before(grammarAccess.getLetBindingAccess().getTypeTypeAnnotationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeAnnotation();

            state._fsp--;

             after(grammarAccess.getLetBindingAccess().getTypeTypeAnnotationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetBinding__TypeAssignment_3"


    // $ANTLR start "rule__LetBinding__ExpressionAssignment_5"
    // InternalHale.g:7026:1: rule__LetBinding__ExpressionAssignment_5 : ( ruleExpression ) ;
    public final void rule__LetBinding__ExpressionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:7030:1: ( ( ruleExpression ) )
            // InternalHale.g:7031:2: ( ruleExpression )
            {
            // InternalHale.g:7031:2: ( ruleExpression )
            // InternalHale.g:7032:3: ruleExpression
            {
             before(grammarAccess.getLetBindingAccess().getExpressionExpressionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getLetBindingAccess().getExpressionExpressionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetBinding__ExpressionAssignment_5"


    // $ANTLR start "rule__BindingReference__BindingAssignment"
    // InternalHale.g:7041:1: rule__BindingReference__BindingAssignment : ( ( RULE_ID ) ) ;
    public final void rule__BindingReference__BindingAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:7045:1: ( ( ( RULE_ID ) ) )
            // InternalHale.g:7046:2: ( ( RULE_ID ) )
            {
            // InternalHale.g:7046:2: ( ( RULE_ID ) )
            // InternalHale.g:7047:3: ( RULE_ID )
            {
             before(grammarAccess.getBindingReferenceAccess().getBindingBindingCrossReference_0()); 
            // InternalHale.g:7048:3: ( RULE_ID )
            // InternalHale.g:7049:4: RULE_ID
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
    // InternalHale.g:7060:1: rule__Assignment__BindingAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Assignment__BindingAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:7064:1: ( ( ( RULE_ID ) ) )
            // InternalHale.g:7065:2: ( ( RULE_ID ) )
            {
            // InternalHale.g:7065:2: ( ( RULE_ID ) )
            // InternalHale.g:7066:3: ( RULE_ID )
            {
             before(grammarAccess.getAssignmentAccess().getBindingBindingCrossReference_0_0()); 
            // InternalHale.g:7067:3: ( RULE_ID )
            // InternalHale.g:7068:4: RULE_ID
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
    // InternalHale.g:7079:1: rule__Assignment__ExpressionAssignment_2 : ( ruleExpression ) ;
    public final void rule__Assignment__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:7083:1: ( ( ruleExpression ) )
            // InternalHale.g:7084:2: ( ruleExpression )
            {
            // InternalHale.g:7084:2: ( ruleExpression )
            // InternalHale.g:7085:3: ruleExpression
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
    // InternalHale.g:7094:1: rule__Print__ExpressionAssignment_1 : ( ruleExpression ) ;
    public final void rule__Print__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:7098:1: ( ( ruleExpression ) )
            // InternalHale.g:7099:2: ( ruleExpression )
            {
            // InternalHale.g:7099:2: ( ruleExpression )
            // InternalHale.g:7100:3: ruleExpression
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


    // $ANTLR start "rule__IfLet__MutableAssignment_1"
    // InternalHale.g:7109:1: rule__IfLet__MutableAssignment_1 : ( ( 'mut' ) ) ;
    public final void rule__IfLet__MutableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:7113:1: ( ( ( 'mut' ) ) )
            // InternalHale.g:7114:2: ( ( 'mut' ) )
            {
            // InternalHale.g:7114:2: ( ( 'mut' ) )
            // InternalHale.g:7115:3: ( 'mut' )
            {
             before(grammarAccess.getIfLetAccess().getMutableMutKeyword_1_0()); 
            // InternalHale.g:7116:3: ( 'mut' )
            // InternalHale.g:7117:4: 'mut'
            {
             before(grammarAccess.getIfLetAccess().getMutableMutKeyword_1_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getIfLetAccess().getMutableMutKeyword_1_0()); 

            }

             after(grammarAccess.getIfLetAccess().getMutableMutKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfLet__MutableAssignment_1"


    // $ANTLR start "rule__IfLet__BindingAssignment_2"
    // InternalHale.g:7128:1: rule__IfLet__BindingAssignment_2 : ( ruleBinding ) ;
    public final void rule__IfLet__BindingAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:7132:1: ( ( ruleBinding ) )
            // InternalHale.g:7133:2: ( ruleBinding )
            {
            // InternalHale.g:7133:2: ( ruleBinding )
            // InternalHale.g:7134:3: ruleBinding
            {
             before(grammarAccess.getIfLetAccess().getBindingBindingParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBinding();

            state._fsp--;

             after(grammarAccess.getIfLetAccess().getBindingBindingParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfLet__BindingAssignment_2"


    // $ANTLR start "rule__IfLet__TypeAssignment_3"
    // InternalHale.g:7143:1: rule__IfLet__TypeAssignment_3 : ( ruleTypeAnnotation ) ;
    public final void rule__IfLet__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:7147:1: ( ( ruleTypeAnnotation ) )
            // InternalHale.g:7148:2: ( ruleTypeAnnotation )
            {
            // InternalHale.g:7148:2: ( ruleTypeAnnotation )
            // InternalHale.g:7149:3: ruleTypeAnnotation
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
    // InternalHale.g:7158:1: rule__IfLet__ExpressionAssignment_5 : ( ruleExpression ) ;
    public final void rule__IfLet__ExpressionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:7162:1: ( ( ruleExpression ) )
            // InternalHale.g:7163:2: ( ruleExpression )
            {
            // InternalHale.g:7163:2: ( ruleExpression )
            // InternalHale.g:7164:3: ruleExpression
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
    // InternalHale.g:7173:1: rule__IfLet__IfBlockAssignment_6 : ( ruleBracedBlock ) ;
    public final void rule__IfLet__IfBlockAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:7177:1: ( ( ruleBracedBlock ) )
            // InternalHale.g:7178:2: ( ruleBracedBlock )
            {
            // InternalHale.g:7178:2: ( ruleBracedBlock )
            // InternalHale.g:7179:3: ruleBracedBlock
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
    // InternalHale.g:7188:1: rule__IfLet__ElseLetAssignment_7_1 : ( ruleElseLet ) ;
    public final void rule__IfLet__ElseLetAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:7192:1: ( ( ruleElseLet ) )
            // InternalHale.g:7193:2: ( ruleElseLet )
            {
            // InternalHale.g:7193:2: ( ruleElseLet )
            // InternalHale.g:7194:3: ruleElseLet
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


    // $ANTLR start "rule__ElseLet__MutableAssignment_0_1"
    // InternalHale.g:7203:1: rule__ElseLet__MutableAssignment_0_1 : ( ( 'mut' ) ) ;
    public final void rule__ElseLet__MutableAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:7207:1: ( ( ( 'mut' ) ) )
            // InternalHale.g:7208:2: ( ( 'mut' ) )
            {
            // InternalHale.g:7208:2: ( ( 'mut' ) )
            // InternalHale.g:7209:3: ( 'mut' )
            {
             before(grammarAccess.getElseLetAccess().getMutableMutKeyword_0_1_0()); 
            // InternalHale.g:7210:3: ( 'mut' )
            // InternalHale.g:7211:4: 'mut'
            {
             before(grammarAccess.getElseLetAccess().getMutableMutKeyword_0_1_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getElseLetAccess().getMutableMutKeyword_0_1_0()); 

            }

             after(grammarAccess.getElseLetAccess().getMutableMutKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseLet__MutableAssignment_0_1"


    // $ANTLR start "rule__ElseLet__BindingAssignment_0_2"
    // InternalHale.g:7222:1: rule__ElseLet__BindingAssignment_0_2 : ( ruleBinding ) ;
    public final void rule__ElseLet__BindingAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:7226:1: ( ( ruleBinding ) )
            // InternalHale.g:7227:2: ( ruleBinding )
            {
            // InternalHale.g:7227:2: ( ruleBinding )
            // InternalHale.g:7228:3: ruleBinding
            {
             before(grammarAccess.getElseLetAccess().getBindingBindingParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBinding();

            state._fsp--;

             after(grammarAccess.getElseLetAccess().getBindingBindingParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseLet__BindingAssignment_0_2"


    // $ANTLR start "rule__ElseLet__TypeAssignment_0_3"
    // InternalHale.g:7237:1: rule__ElseLet__TypeAssignment_0_3 : ( ruleTypeAnnotation ) ;
    public final void rule__ElseLet__TypeAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:7241:1: ( ( ruleTypeAnnotation ) )
            // InternalHale.g:7242:2: ( ruleTypeAnnotation )
            {
            // InternalHale.g:7242:2: ( ruleTypeAnnotation )
            // InternalHale.g:7243:3: ruleTypeAnnotation
            {
             before(grammarAccess.getElseLetAccess().getTypeTypeAnnotationParserRuleCall_0_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeAnnotation();

            state._fsp--;

             after(grammarAccess.getElseLetAccess().getTypeTypeAnnotationParserRuleCall_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseLet__TypeAssignment_0_3"


    // $ANTLR start "rule__ElseLet__ElseBlockAssignment_1"
    // InternalHale.g:7252:1: rule__ElseLet__ElseBlockAssignment_1 : ( ruleBracedBlock ) ;
    public final void rule__ElseLet__ElseBlockAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:7256:1: ( ( ruleBracedBlock ) )
            // InternalHale.g:7257:2: ( ruleBracedBlock )
            {
            // InternalHale.g:7257:2: ( ruleBracedBlock )
            // InternalHale.g:7258:3: ruleBracedBlock
            {
             before(grammarAccess.getElseLetAccess().getElseBlockBracedBlockParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBracedBlock();

            state._fsp--;

             after(grammarAccess.getElseLetAccess().getElseBlockBracedBlockParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseLet__ElseBlockAssignment_1"


    // $ANTLR start "rule__IfConditions__ConditionsAssignment_0"
    // InternalHale.g:7267:1: rule__IfConditions__ConditionsAssignment_0 : ( ruleExpression ) ;
    public final void rule__IfConditions__ConditionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:7271:1: ( ( ruleExpression ) )
            // InternalHale.g:7272:2: ( ruleExpression )
            {
            // InternalHale.g:7272:2: ( ruleExpression )
            // InternalHale.g:7273:3: ruleExpression
            {
             before(grammarAccess.getIfConditionsAccess().getConditionsExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getIfConditionsAccess().getConditionsExpressionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfConditions__ConditionsAssignment_0"


    // $ANTLR start "rule__IfConditions__IfBlocksAssignment_1"
    // InternalHale.g:7282:1: rule__IfConditions__IfBlocksAssignment_1 : ( ruleBracedBlock ) ;
    public final void rule__IfConditions__IfBlocksAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:7286:1: ( ( ruleBracedBlock ) )
            // InternalHale.g:7287:2: ( ruleBracedBlock )
            {
            // InternalHale.g:7287:2: ( ruleBracedBlock )
            // InternalHale.g:7288:3: ruleBracedBlock
            {
             before(grammarAccess.getIfConditionsAccess().getIfBlocksBracedBlockParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBracedBlock();

            state._fsp--;

             after(grammarAccess.getIfConditionsAccess().getIfBlocksBracedBlockParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfConditions__IfBlocksAssignment_1"


    // $ANTLR start "rule__IfConditions__ConditionsAssignment_2_1"
    // InternalHale.g:7297:1: rule__IfConditions__ConditionsAssignment_2_1 : ( ruleExpression ) ;
    public final void rule__IfConditions__ConditionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:7301:1: ( ( ruleExpression ) )
            // InternalHale.g:7302:2: ( ruleExpression )
            {
            // InternalHale.g:7302:2: ( ruleExpression )
            // InternalHale.g:7303:3: ruleExpression
            {
             before(grammarAccess.getIfConditionsAccess().getConditionsExpressionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getIfConditionsAccess().getConditionsExpressionParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfConditions__ConditionsAssignment_2_1"


    // $ANTLR start "rule__IfConditions__IfBlocksAssignment_2_2"
    // InternalHale.g:7312:1: rule__IfConditions__IfBlocksAssignment_2_2 : ( ruleBracedBlock ) ;
    public final void rule__IfConditions__IfBlocksAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:7316:1: ( ( ruleBracedBlock ) )
            // InternalHale.g:7317:2: ( ruleBracedBlock )
            {
            // InternalHale.g:7317:2: ( ruleBracedBlock )
            // InternalHale.g:7318:3: ruleBracedBlock
            {
             before(grammarAccess.getIfConditionsAccess().getIfBlocksBracedBlockParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBracedBlock();

            state._fsp--;

             after(grammarAccess.getIfConditionsAccess().getIfBlocksBracedBlockParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfConditions__IfBlocksAssignment_2_2"


    // $ANTLR start "rule__IfConditions__ElseBlockAssignment_3_1"
    // InternalHale.g:7327:1: rule__IfConditions__ElseBlockAssignment_3_1 : ( ruleBracedBlock ) ;
    public final void rule__IfConditions__ElseBlockAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:7331:1: ( ( ruleBracedBlock ) )
            // InternalHale.g:7332:2: ( ruleBracedBlock )
            {
            // InternalHale.g:7332:2: ( ruleBracedBlock )
            // InternalHale.g:7333:3: ruleBracedBlock
            {
             before(grammarAccess.getIfConditionsAccess().getElseBlockBracedBlockParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBracedBlock();

            state._fsp--;

             after(grammarAccess.getIfConditionsAccess().getElseBlockBracedBlockParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfConditions__ElseBlockAssignment_3_1"


    // $ANTLR start "rule__While__ConditionAssignment_1"
    // InternalHale.g:7342:1: rule__While__ConditionAssignment_1 : ( ruleExpression ) ;
    public final void rule__While__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:7346:1: ( ( ruleExpression ) )
            // InternalHale.g:7347:2: ( ruleExpression )
            {
            // InternalHale.g:7347:2: ( ruleExpression )
            // InternalHale.g:7348:3: ruleExpression
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
    // InternalHale.g:7357:1: rule__While__BlockAssignment_2 : ( ruleBracedBlock ) ;
    public final void rule__While__BlockAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:7361:1: ( ( ruleBracedBlock ) )
            // InternalHale.g:7362:2: ( ruleBracedBlock )
            {
            // InternalHale.g:7362:2: ( ruleBracedBlock )
            // InternalHale.g:7363:3: ruleBracedBlock
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


    // $ANTLR start "rule__Function__BindingAssignment_1"
    // InternalHale.g:7372:1: rule__Function__BindingAssignment_1 : ( ruleBinding ) ;
    public final void rule__Function__BindingAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:7376:1: ( ( ruleBinding ) )
            // InternalHale.g:7377:2: ( ruleBinding )
            {
            // InternalHale.g:7377:2: ( ruleBinding )
            // InternalHale.g:7378:3: ruleBinding
            {
             before(grammarAccess.getFunctionAccess().getBindingBindingParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBinding();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getBindingBindingParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__BindingAssignment_1"


    // $ANTLR start "rule__Function__ParametersAssignment_3_0"
    // InternalHale.g:7387:1: rule__Function__ParametersAssignment_3_0 : ( ruleParameter ) ;
    public final void rule__Function__ParametersAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:7391:1: ( ( ruleParameter ) )
            // InternalHale.g:7392:2: ( ruleParameter )
            {
            // InternalHale.g:7392:2: ( ruleParameter )
            // InternalHale.g:7393:3: ruleParameter
            {
             before(grammarAccess.getFunctionAccess().getParametersParameterParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getParametersParameterParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__ParametersAssignment_3_0"


    // $ANTLR start "rule__Function__ParametersAssignment_3_1_1"
    // InternalHale.g:7402:1: rule__Function__ParametersAssignment_3_1_1 : ( ruleParameter ) ;
    public final void rule__Function__ParametersAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:7406:1: ( ( ruleParameter ) )
            // InternalHale.g:7407:2: ( ruleParameter )
            {
            // InternalHale.g:7407:2: ( ruleParameter )
            // InternalHale.g:7408:3: ruleParameter
            {
             before(grammarAccess.getFunctionAccess().getParametersParameterParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getParametersParameterParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__ParametersAssignment_3_1_1"


    // $ANTLR start "rule__Function__ReturnTypeAssignment_5"
    // InternalHale.g:7417:1: rule__Function__ReturnTypeAssignment_5 : ( ruleTypeAnnotation ) ;
    public final void rule__Function__ReturnTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:7421:1: ( ( ruleTypeAnnotation ) )
            // InternalHale.g:7422:2: ( ruleTypeAnnotation )
            {
            // InternalHale.g:7422:2: ( ruleTypeAnnotation )
            // InternalHale.g:7423:3: ruleTypeAnnotation
            {
             before(grammarAccess.getFunctionAccess().getReturnTypeTypeAnnotationParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeAnnotation();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getReturnTypeTypeAnnotationParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__ReturnTypeAssignment_5"


    // $ANTLR start "rule__Function__BodyAssignment_6"
    // InternalHale.g:7432:1: rule__Function__BodyAssignment_6 : ( ruleBracedBlock ) ;
    public final void rule__Function__BodyAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:7436:1: ( ( ruleBracedBlock ) )
            // InternalHale.g:7437:2: ( ruleBracedBlock )
            {
            // InternalHale.g:7437:2: ( ruleBracedBlock )
            // InternalHale.g:7438:3: ruleBracedBlock
            {
             before(grammarAccess.getFunctionAccess().getBodyBracedBlockParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleBracedBlock();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getBodyBracedBlockParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__BodyAssignment_6"


    // $ANTLR start "rule__Parameter__MutableAssignment_1"
    // InternalHale.g:7447:1: rule__Parameter__MutableAssignment_1 : ( ( 'mut' ) ) ;
    public final void rule__Parameter__MutableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:7451:1: ( ( ( 'mut' ) ) )
            // InternalHale.g:7452:2: ( ( 'mut' ) )
            {
            // InternalHale.g:7452:2: ( ( 'mut' ) )
            // InternalHale.g:7453:3: ( 'mut' )
            {
             before(grammarAccess.getParameterAccess().getMutableMutKeyword_1_0()); 
            // InternalHale.g:7454:3: ( 'mut' )
            // InternalHale.g:7455:4: 'mut'
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


    // $ANTLR start "rule__Parameter__BindingAssignment_2"
    // InternalHale.g:7466:1: rule__Parameter__BindingAssignment_2 : ( ruleBinding ) ;
    public final void rule__Parameter__BindingAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:7470:1: ( ( ruleBinding ) )
            // InternalHale.g:7471:2: ( ruleBinding )
            {
            // InternalHale.g:7471:2: ( ruleBinding )
            // InternalHale.g:7472:3: ruleBinding
            {
             before(grammarAccess.getParameterAccess().getBindingBindingParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBinding();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getBindingBindingParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__BindingAssignment_2"


    // $ANTLR start "rule__Parameter__TypeAssignment_3"
    // InternalHale.g:7481:1: rule__Parameter__TypeAssignment_3 : ( ruleTypeAnnotation ) ;
    public final void rule__Parameter__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:7485:1: ( ( ruleTypeAnnotation ) )
            // InternalHale.g:7486:2: ( ruleTypeAnnotation )
            {
            // InternalHale.g:7486:2: ( ruleTypeAnnotation )
            // InternalHale.g:7487:3: ruleTypeAnnotation
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
    // InternalHale.g:7496:1: rule__Return__ExpressionAssignment_2 : ( ruleExpression ) ;
    public final void rule__Return__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:7500:1: ( ( ruleExpression ) )
            // InternalHale.g:7501:2: ( ruleExpression )
            {
            // InternalHale.g:7501:2: ( ruleExpression )
            // InternalHale.g:7502:3: ruleExpression
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
    // InternalHale.g:7511:1: rule__Throw__ExpressionAssignment_2 : ( ruleExpression ) ;
    public final void rule__Throw__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHale.g:7515:1: ( ( ruleExpression ) )
            // InternalHale.g:7516:2: ( ruleExpression )
            {
            // InternalHale.g:7516:2: ( ruleExpression )
            // InternalHale.g:7517:3: ruleExpression
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
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0008000000000100L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000011000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000008000002000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0008000200000100L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000001000002000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0004000000000000L});

}