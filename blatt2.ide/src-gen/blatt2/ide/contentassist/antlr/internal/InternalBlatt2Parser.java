package blatt2.ide.contentassist.antlr.internal;

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
import blatt2.services.Blatt2GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBlatt2Parser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'AllocationContext'", "'{'", "'allocatedAssemblyContext'", "'('", "')'", "'}'", "','", "'targetContainer'", "'Container'", "'links'", "'AssemblyContext'", "'allocationContext'", "'requiredRole'", "'providedRole'", "'component'", "'Role'", "'Component'", "'requiredService'", "'providedService'", "'behaviourDescription'", "'requiredInterface'", "'providedInterface'", "'Interface'", "'signature'", "'Service'", "'correspondingSignature'", "'BehaviorDescription'", "'calledServices'", "'internalActions'", "'loops'", "'branches'", "'CompositeComponent'", "'encapsulatedAssemblyContext'", "'Signature'", "'returnType'", "'parameterType'", "'Type'", "'List'", "'Map'", "'ComplexType'", "'Date'", "'Double'", "'String'", "'Int'", "'Char'", "'Long'", "'Float'", "'Boolean'", "'Void'", "'InternalAction'", "'Loop'", "'Branch'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
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
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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


        public InternalBlatt2Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBlatt2Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBlatt2Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalBlatt2.g"; }


    	private Blatt2GrammarAccess grammarAccess;

    	public void setGrammarAccess(Blatt2GrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleAllocationContext"
    // InternalBlatt2.g:53:1: entryRuleAllocationContext : ruleAllocationContext EOF ;
    public final void entryRuleAllocationContext() throws RecognitionException {
        try {
            // InternalBlatt2.g:54:1: ( ruleAllocationContext EOF )
            // InternalBlatt2.g:55:1: ruleAllocationContext EOF
            {
             before(grammarAccess.getAllocationContextRule()); 
            pushFollow(FOLLOW_1);
            ruleAllocationContext();

            state._fsp--;

             after(grammarAccess.getAllocationContextRule()); 
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
    // $ANTLR end "entryRuleAllocationContext"


    // $ANTLR start "ruleAllocationContext"
    // InternalBlatt2.g:62:1: ruleAllocationContext : ( ( rule__AllocationContext__Group__0 ) ) ;
    public final void ruleAllocationContext() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:66:2: ( ( ( rule__AllocationContext__Group__0 ) ) )
            // InternalBlatt2.g:67:2: ( ( rule__AllocationContext__Group__0 ) )
            {
            // InternalBlatt2.g:67:2: ( ( rule__AllocationContext__Group__0 ) )
            // InternalBlatt2.g:68:3: ( rule__AllocationContext__Group__0 )
            {
             before(grammarAccess.getAllocationContextAccess().getGroup()); 
            // InternalBlatt2.g:69:3: ( rule__AllocationContext__Group__0 )
            // InternalBlatt2.g:69:4: rule__AllocationContext__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AllocationContext__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAllocationContextAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAllocationContext"


    // $ANTLR start "entryRuleComponent"
    // InternalBlatt2.g:78:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // InternalBlatt2.g:79:1: ( ruleComponent EOF )
            // InternalBlatt2.g:80:1: ruleComponent EOF
            {
             before(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getComponentRule()); 
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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalBlatt2.g:87:1: ruleComponent : ( ( rule__Component__Alternatives ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:91:2: ( ( ( rule__Component__Alternatives ) ) )
            // InternalBlatt2.g:92:2: ( ( rule__Component__Alternatives ) )
            {
            // InternalBlatt2.g:92:2: ( ( rule__Component__Alternatives ) )
            // InternalBlatt2.g:93:3: ( rule__Component__Alternatives )
            {
             before(grammarAccess.getComponentAccess().getAlternatives()); 
            // InternalBlatt2.g:94:3: ( rule__Component__Alternatives )
            // InternalBlatt2.g:94:4: rule__Component__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Component__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleContainer"
    // InternalBlatt2.g:103:1: entryRuleContainer : ruleContainer EOF ;
    public final void entryRuleContainer() throws RecognitionException {
        try {
            // InternalBlatt2.g:104:1: ( ruleContainer EOF )
            // InternalBlatt2.g:105:1: ruleContainer EOF
            {
             before(grammarAccess.getContainerRule()); 
            pushFollow(FOLLOW_1);
            ruleContainer();

            state._fsp--;

             after(grammarAccess.getContainerRule()); 
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
    // $ANTLR end "entryRuleContainer"


    // $ANTLR start "ruleContainer"
    // InternalBlatt2.g:112:1: ruleContainer : ( ( rule__Container__Group__0 ) ) ;
    public final void ruleContainer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:116:2: ( ( ( rule__Container__Group__0 ) ) )
            // InternalBlatt2.g:117:2: ( ( rule__Container__Group__0 ) )
            {
            // InternalBlatt2.g:117:2: ( ( rule__Container__Group__0 ) )
            // InternalBlatt2.g:118:3: ( rule__Container__Group__0 )
            {
             before(grammarAccess.getContainerAccess().getGroup()); 
            // InternalBlatt2.g:119:3: ( rule__Container__Group__0 )
            // InternalBlatt2.g:119:4: rule__Container__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Container__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContainer"


    // $ANTLR start "entryRuleAssemblyContext"
    // InternalBlatt2.g:128:1: entryRuleAssemblyContext : ruleAssemblyContext EOF ;
    public final void entryRuleAssemblyContext() throws RecognitionException {
        try {
            // InternalBlatt2.g:129:1: ( ruleAssemblyContext EOF )
            // InternalBlatt2.g:130:1: ruleAssemblyContext EOF
            {
             before(grammarAccess.getAssemblyContextRule()); 
            pushFollow(FOLLOW_1);
            ruleAssemblyContext();

            state._fsp--;

             after(grammarAccess.getAssemblyContextRule()); 
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
    // $ANTLR end "entryRuleAssemblyContext"


    // $ANTLR start "ruleAssemblyContext"
    // InternalBlatt2.g:137:1: ruleAssemblyContext : ( ( rule__AssemblyContext__Group__0 ) ) ;
    public final void ruleAssemblyContext() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:141:2: ( ( ( rule__AssemblyContext__Group__0 ) ) )
            // InternalBlatt2.g:142:2: ( ( rule__AssemblyContext__Group__0 ) )
            {
            // InternalBlatt2.g:142:2: ( ( rule__AssemblyContext__Group__0 ) )
            // InternalBlatt2.g:143:3: ( rule__AssemblyContext__Group__0 )
            {
             before(grammarAccess.getAssemblyContextAccess().getGroup()); 
            // InternalBlatt2.g:144:3: ( rule__AssemblyContext__Group__0 )
            // InternalBlatt2.g:144:4: rule__AssemblyContext__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssemblyContextAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssemblyContext"


    // $ANTLR start "entryRuleEString"
    // InternalBlatt2.g:153:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalBlatt2.g:154:1: ( ruleEString EOF )
            // InternalBlatt2.g:155:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalBlatt2.g:162:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:166:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalBlatt2.g:167:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalBlatt2.g:167:2: ( ( rule__EString__Alternatives ) )
            // InternalBlatt2.g:168:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalBlatt2.g:169:3: ( rule__EString__Alternatives )
            // InternalBlatt2.g:169:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleRole"
    // InternalBlatt2.g:178:1: entryRuleRole : ruleRole EOF ;
    public final void entryRuleRole() throws RecognitionException {
        try {
            // InternalBlatt2.g:179:1: ( ruleRole EOF )
            // InternalBlatt2.g:180:1: ruleRole EOF
            {
             before(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_1);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getRoleRule()); 
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
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // InternalBlatt2.g:187:1: ruleRole : ( ( rule__Role__Group__0 ) ) ;
    public final void ruleRole() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:191:2: ( ( ( rule__Role__Group__0 ) ) )
            // InternalBlatt2.g:192:2: ( ( rule__Role__Group__0 ) )
            {
            // InternalBlatt2.g:192:2: ( ( rule__Role__Group__0 ) )
            // InternalBlatt2.g:193:3: ( rule__Role__Group__0 )
            {
             before(grammarAccess.getRoleAccess().getGroup()); 
            // InternalBlatt2.g:194:3: ( rule__Role__Group__0 )
            // InternalBlatt2.g:194:4: rule__Role__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Role__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRole"


    // $ANTLR start "entryRuleComponent_Impl"
    // InternalBlatt2.g:203:1: entryRuleComponent_Impl : ruleComponent_Impl EOF ;
    public final void entryRuleComponent_Impl() throws RecognitionException {
        try {
            // InternalBlatt2.g:204:1: ( ruleComponent_Impl EOF )
            // InternalBlatt2.g:205:1: ruleComponent_Impl EOF
            {
             before(grammarAccess.getComponent_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleComponent_Impl();

            state._fsp--;

             after(grammarAccess.getComponent_ImplRule()); 
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
    // $ANTLR end "entryRuleComponent_Impl"


    // $ANTLR start "ruleComponent_Impl"
    // InternalBlatt2.g:212:1: ruleComponent_Impl : ( ( rule__Component_Impl__Group__0 ) ) ;
    public final void ruleComponent_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:216:2: ( ( ( rule__Component_Impl__Group__0 ) ) )
            // InternalBlatt2.g:217:2: ( ( rule__Component_Impl__Group__0 ) )
            {
            // InternalBlatt2.g:217:2: ( ( rule__Component_Impl__Group__0 ) )
            // InternalBlatt2.g:218:3: ( rule__Component_Impl__Group__0 )
            {
             before(grammarAccess.getComponent_ImplAccess().getGroup()); 
            // InternalBlatt2.g:219:3: ( rule__Component_Impl__Group__0 )
            // InternalBlatt2.g:219:4: rule__Component_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponent_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponent_Impl"


    // $ANTLR start "entryRuleInterface"
    // InternalBlatt2.g:228:1: entryRuleInterface : ruleInterface EOF ;
    public final void entryRuleInterface() throws RecognitionException {
        try {
            // InternalBlatt2.g:229:1: ( ruleInterface EOF )
            // InternalBlatt2.g:230:1: ruleInterface EOF
            {
             before(grammarAccess.getInterfaceRule()); 
            pushFollow(FOLLOW_1);
            ruleInterface();

            state._fsp--;

             after(grammarAccess.getInterfaceRule()); 
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
    // $ANTLR end "entryRuleInterface"


    // $ANTLR start "ruleInterface"
    // InternalBlatt2.g:237:1: ruleInterface : ( ( rule__Interface__Group__0 ) ) ;
    public final void ruleInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:241:2: ( ( ( rule__Interface__Group__0 ) ) )
            // InternalBlatt2.g:242:2: ( ( rule__Interface__Group__0 ) )
            {
            // InternalBlatt2.g:242:2: ( ( rule__Interface__Group__0 ) )
            // InternalBlatt2.g:243:3: ( rule__Interface__Group__0 )
            {
             before(grammarAccess.getInterfaceAccess().getGroup()); 
            // InternalBlatt2.g:244:3: ( rule__Interface__Group__0 )
            // InternalBlatt2.g:244:4: rule__Interface__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Interface__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInterface"


    // $ANTLR start "entryRuleService"
    // InternalBlatt2.g:253:1: entryRuleService : ruleService EOF ;
    public final void entryRuleService() throws RecognitionException {
        try {
            // InternalBlatt2.g:254:1: ( ruleService EOF )
            // InternalBlatt2.g:255:1: ruleService EOF
            {
             before(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_1);
            ruleService();

            state._fsp--;

             after(grammarAccess.getServiceRule()); 
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
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // InternalBlatt2.g:262:1: ruleService : ( ( rule__Service__Group__0 ) ) ;
    public final void ruleService() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:266:2: ( ( ( rule__Service__Group__0 ) ) )
            // InternalBlatt2.g:267:2: ( ( rule__Service__Group__0 ) )
            {
            // InternalBlatt2.g:267:2: ( ( rule__Service__Group__0 ) )
            // InternalBlatt2.g:268:3: ( rule__Service__Group__0 )
            {
             before(grammarAccess.getServiceAccess().getGroup()); 
            // InternalBlatt2.g:269:3: ( rule__Service__Group__0 )
            // InternalBlatt2.g:269:4: rule__Service__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Service__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleBehaviorDescription"
    // InternalBlatt2.g:278:1: entryRuleBehaviorDescription : ruleBehaviorDescription EOF ;
    public final void entryRuleBehaviorDescription() throws RecognitionException {
        try {
            // InternalBlatt2.g:279:1: ( ruleBehaviorDescription EOF )
            // InternalBlatt2.g:280:1: ruleBehaviorDescription EOF
            {
             before(grammarAccess.getBehaviorDescriptionRule()); 
            pushFollow(FOLLOW_1);
            ruleBehaviorDescription();

            state._fsp--;

             after(grammarAccess.getBehaviorDescriptionRule()); 
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
    // $ANTLR end "entryRuleBehaviorDescription"


    // $ANTLR start "ruleBehaviorDescription"
    // InternalBlatt2.g:287:1: ruleBehaviorDescription : ( ( rule__BehaviorDescription__Group__0 ) ) ;
    public final void ruleBehaviorDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:291:2: ( ( ( rule__BehaviorDescription__Group__0 ) ) )
            // InternalBlatt2.g:292:2: ( ( rule__BehaviorDescription__Group__0 ) )
            {
            // InternalBlatt2.g:292:2: ( ( rule__BehaviorDescription__Group__0 ) )
            // InternalBlatt2.g:293:3: ( rule__BehaviorDescription__Group__0 )
            {
             before(grammarAccess.getBehaviorDescriptionAccess().getGroup()); 
            // InternalBlatt2.g:294:3: ( rule__BehaviorDescription__Group__0 )
            // InternalBlatt2.g:294:4: rule__BehaviorDescription__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BehaviorDescription__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBehaviorDescriptionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBehaviorDescription"


    // $ANTLR start "entryRuleCompositeComponent"
    // InternalBlatt2.g:303:1: entryRuleCompositeComponent : ruleCompositeComponent EOF ;
    public final void entryRuleCompositeComponent() throws RecognitionException {
        try {
            // InternalBlatt2.g:304:1: ( ruleCompositeComponent EOF )
            // InternalBlatt2.g:305:1: ruleCompositeComponent EOF
            {
             before(grammarAccess.getCompositeComponentRule()); 
            pushFollow(FOLLOW_1);
            ruleCompositeComponent();

            state._fsp--;

             after(grammarAccess.getCompositeComponentRule()); 
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
    // $ANTLR end "entryRuleCompositeComponent"


    // $ANTLR start "ruleCompositeComponent"
    // InternalBlatt2.g:312:1: ruleCompositeComponent : ( ( rule__CompositeComponent__Group__0 ) ) ;
    public final void ruleCompositeComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:316:2: ( ( ( rule__CompositeComponent__Group__0 ) ) )
            // InternalBlatt2.g:317:2: ( ( rule__CompositeComponent__Group__0 ) )
            {
            // InternalBlatt2.g:317:2: ( ( rule__CompositeComponent__Group__0 ) )
            // InternalBlatt2.g:318:3: ( rule__CompositeComponent__Group__0 )
            {
             before(grammarAccess.getCompositeComponentAccess().getGroup()); 
            // InternalBlatt2.g:319:3: ( rule__CompositeComponent__Group__0 )
            // InternalBlatt2.g:319:4: rule__CompositeComponent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompositeComponentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompositeComponent"


    // $ANTLR start "entryRuleSignature"
    // InternalBlatt2.g:328:1: entryRuleSignature : ruleSignature EOF ;
    public final void entryRuleSignature() throws RecognitionException {
        try {
            // InternalBlatt2.g:329:1: ( ruleSignature EOF )
            // InternalBlatt2.g:330:1: ruleSignature EOF
            {
             before(grammarAccess.getSignatureRule()); 
            pushFollow(FOLLOW_1);
            ruleSignature();

            state._fsp--;

             after(grammarAccess.getSignatureRule()); 
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
    // $ANTLR end "entryRuleSignature"


    // $ANTLR start "ruleSignature"
    // InternalBlatt2.g:337:1: ruleSignature : ( ( rule__Signature__Group__0 ) ) ;
    public final void ruleSignature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:341:2: ( ( ( rule__Signature__Group__0 ) ) )
            // InternalBlatt2.g:342:2: ( ( rule__Signature__Group__0 ) )
            {
            // InternalBlatt2.g:342:2: ( ( rule__Signature__Group__0 ) )
            // InternalBlatt2.g:343:3: ( rule__Signature__Group__0 )
            {
             before(grammarAccess.getSignatureAccess().getGroup()); 
            // InternalBlatt2.g:344:3: ( rule__Signature__Group__0 )
            // InternalBlatt2.g:344:4: rule__Signature__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Signature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSignatureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSignature"


    // $ANTLR start "entryRuleType_Impl"
    // InternalBlatt2.g:353:1: entryRuleType_Impl : ruleType_Impl EOF ;
    public final void entryRuleType_Impl() throws RecognitionException {
        try {
            // InternalBlatt2.g:354:1: ( ruleType_Impl EOF )
            // InternalBlatt2.g:355:1: ruleType_Impl EOF
            {
             before(grammarAccess.getType_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleType_Impl();

            state._fsp--;

             after(grammarAccess.getType_ImplRule()); 
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
    // $ANTLR end "entryRuleType_Impl"


    // $ANTLR start "ruleType_Impl"
    // InternalBlatt2.g:362:1: ruleType_Impl : ( ( rule__Type_Impl__Group__0 ) ) ;
    public final void ruleType_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:366:2: ( ( ( rule__Type_Impl__Group__0 ) ) )
            // InternalBlatt2.g:367:2: ( ( rule__Type_Impl__Group__0 ) )
            {
            // InternalBlatt2.g:367:2: ( ( rule__Type_Impl__Group__0 ) )
            // InternalBlatt2.g:368:3: ( rule__Type_Impl__Group__0 )
            {
             before(grammarAccess.getType_ImplAccess().getGroup()); 
            // InternalBlatt2.g:369:3: ( rule__Type_Impl__Group__0 )
            // InternalBlatt2.g:369:4: rule__Type_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Type_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getType_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType_Impl"


    // $ANTLR start "entryRuleList"
    // InternalBlatt2.g:378:1: entryRuleList : ruleList EOF ;
    public final void entryRuleList() throws RecognitionException {
        try {
            // InternalBlatt2.g:379:1: ( ruleList EOF )
            // InternalBlatt2.g:380:1: ruleList EOF
            {
             before(grammarAccess.getListRule()); 
            pushFollow(FOLLOW_1);
            ruleList();

            state._fsp--;

             after(grammarAccess.getListRule()); 
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
    // $ANTLR end "entryRuleList"


    // $ANTLR start "ruleList"
    // InternalBlatt2.g:387:1: ruleList : ( ( rule__List__Group__0 ) ) ;
    public final void ruleList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:391:2: ( ( ( rule__List__Group__0 ) ) )
            // InternalBlatt2.g:392:2: ( ( rule__List__Group__0 ) )
            {
            // InternalBlatt2.g:392:2: ( ( rule__List__Group__0 ) )
            // InternalBlatt2.g:393:3: ( rule__List__Group__0 )
            {
             before(grammarAccess.getListAccess().getGroup()); 
            // InternalBlatt2.g:394:3: ( rule__List__Group__0 )
            // InternalBlatt2.g:394:4: rule__List__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__List__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleList"


    // $ANTLR start "entryRuleMap"
    // InternalBlatt2.g:403:1: entryRuleMap : ruleMap EOF ;
    public final void entryRuleMap() throws RecognitionException {
        try {
            // InternalBlatt2.g:404:1: ( ruleMap EOF )
            // InternalBlatt2.g:405:1: ruleMap EOF
            {
             before(grammarAccess.getMapRule()); 
            pushFollow(FOLLOW_1);
            ruleMap();

            state._fsp--;

             after(grammarAccess.getMapRule()); 
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
    // $ANTLR end "entryRuleMap"


    // $ANTLR start "ruleMap"
    // InternalBlatt2.g:412:1: ruleMap : ( ( rule__Map__Group__0 ) ) ;
    public final void ruleMap() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:416:2: ( ( ( rule__Map__Group__0 ) ) )
            // InternalBlatt2.g:417:2: ( ( rule__Map__Group__0 ) )
            {
            // InternalBlatt2.g:417:2: ( ( rule__Map__Group__0 ) )
            // InternalBlatt2.g:418:3: ( rule__Map__Group__0 )
            {
             before(grammarAccess.getMapAccess().getGroup()); 
            // InternalBlatt2.g:419:3: ( rule__Map__Group__0 )
            // InternalBlatt2.g:419:4: rule__Map__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Map__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMapAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMap"


    // $ANTLR start "entryRuleComplexType"
    // InternalBlatt2.g:428:1: entryRuleComplexType : ruleComplexType EOF ;
    public final void entryRuleComplexType() throws RecognitionException {
        try {
            // InternalBlatt2.g:429:1: ( ruleComplexType EOF )
            // InternalBlatt2.g:430:1: ruleComplexType EOF
            {
             before(grammarAccess.getComplexTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleComplexType();

            state._fsp--;

             after(grammarAccess.getComplexTypeRule()); 
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
    // $ANTLR end "entryRuleComplexType"


    // $ANTLR start "ruleComplexType"
    // InternalBlatt2.g:437:1: ruleComplexType : ( ( rule__ComplexType__Group__0 ) ) ;
    public final void ruleComplexType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:441:2: ( ( ( rule__ComplexType__Group__0 ) ) )
            // InternalBlatt2.g:442:2: ( ( rule__ComplexType__Group__0 ) )
            {
            // InternalBlatt2.g:442:2: ( ( rule__ComplexType__Group__0 ) )
            // InternalBlatt2.g:443:3: ( rule__ComplexType__Group__0 )
            {
             before(grammarAccess.getComplexTypeAccess().getGroup()); 
            // InternalBlatt2.g:444:3: ( rule__ComplexType__Group__0 )
            // InternalBlatt2.g:444:4: rule__ComplexType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComplexType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComplexTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComplexType"


    // $ANTLR start "entryRuleDate"
    // InternalBlatt2.g:453:1: entryRuleDate : ruleDate EOF ;
    public final void entryRuleDate() throws RecognitionException {
        try {
            // InternalBlatt2.g:454:1: ( ruleDate EOF )
            // InternalBlatt2.g:455:1: ruleDate EOF
            {
             before(grammarAccess.getDateRule()); 
            pushFollow(FOLLOW_1);
            ruleDate();

            state._fsp--;

             after(grammarAccess.getDateRule()); 
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
    // $ANTLR end "entryRuleDate"


    // $ANTLR start "ruleDate"
    // InternalBlatt2.g:462:1: ruleDate : ( ( rule__Date__Group__0 ) ) ;
    public final void ruleDate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:466:2: ( ( ( rule__Date__Group__0 ) ) )
            // InternalBlatt2.g:467:2: ( ( rule__Date__Group__0 ) )
            {
            // InternalBlatt2.g:467:2: ( ( rule__Date__Group__0 ) )
            // InternalBlatt2.g:468:3: ( rule__Date__Group__0 )
            {
             before(grammarAccess.getDateAccess().getGroup()); 
            // InternalBlatt2.g:469:3: ( rule__Date__Group__0 )
            // InternalBlatt2.g:469:4: rule__Date__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Date__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDate"


    // $ANTLR start "entryRuleDouble"
    // InternalBlatt2.g:478:1: entryRuleDouble : ruleDouble EOF ;
    public final void entryRuleDouble() throws RecognitionException {
        try {
            // InternalBlatt2.g:479:1: ( ruleDouble EOF )
            // InternalBlatt2.g:480:1: ruleDouble EOF
            {
             before(grammarAccess.getDoubleRule()); 
            pushFollow(FOLLOW_1);
            ruleDouble();

            state._fsp--;

             after(grammarAccess.getDoubleRule()); 
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
    // $ANTLR end "entryRuleDouble"


    // $ANTLR start "ruleDouble"
    // InternalBlatt2.g:487:1: ruleDouble : ( ( rule__Double__Group__0 ) ) ;
    public final void ruleDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:491:2: ( ( ( rule__Double__Group__0 ) ) )
            // InternalBlatt2.g:492:2: ( ( rule__Double__Group__0 ) )
            {
            // InternalBlatt2.g:492:2: ( ( rule__Double__Group__0 ) )
            // InternalBlatt2.g:493:3: ( rule__Double__Group__0 )
            {
             before(grammarAccess.getDoubleAccess().getGroup()); 
            // InternalBlatt2.g:494:3: ( rule__Double__Group__0 )
            // InternalBlatt2.g:494:4: rule__Double__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Double__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDoubleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDouble"


    // $ANTLR start "entryRuleString0"
    // InternalBlatt2.g:503:1: entryRuleString0 : ruleString0 EOF ;
    public final void entryRuleString0() throws RecognitionException {
        try {
            // InternalBlatt2.g:504:1: ( ruleString0 EOF )
            // InternalBlatt2.g:505:1: ruleString0 EOF
            {
             before(grammarAccess.getString0Rule()); 
            pushFollow(FOLLOW_1);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getString0Rule()); 
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
    // $ANTLR end "entryRuleString0"


    // $ANTLR start "ruleString0"
    // InternalBlatt2.g:512:1: ruleString0 : ( ( rule__String0__Group__0 ) ) ;
    public final void ruleString0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:516:2: ( ( ( rule__String0__Group__0 ) ) )
            // InternalBlatt2.g:517:2: ( ( rule__String0__Group__0 ) )
            {
            // InternalBlatt2.g:517:2: ( ( rule__String0__Group__0 ) )
            // InternalBlatt2.g:518:3: ( rule__String0__Group__0 )
            {
             before(grammarAccess.getString0Access().getGroup()); 
            // InternalBlatt2.g:519:3: ( rule__String0__Group__0 )
            // InternalBlatt2.g:519:4: rule__String0__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__String0__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getString0Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleString0"


    // $ANTLR start "entryRuleInt0"
    // InternalBlatt2.g:528:1: entryRuleInt0 : ruleInt0 EOF ;
    public final void entryRuleInt0() throws RecognitionException {
        try {
            // InternalBlatt2.g:529:1: ( ruleInt0 EOF )
            // InternalBlatt2.g:530:1: ruleInt0 EOF
            {
             before(grammarAccess.getInt0Rule()); 
            pushFollow(FOLLOW_1);
            ruleInt0();

            state._fsp--;

             after(grammarAccess.getInt0Rule()); 
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
    // $ANTLR end "entryRuleInt0"


    // $ANTLR start "ruleInt0"
    // InternalBlatt2.g:537:1: ruleInt0 : ( ( rule__Int0__Group__0 ) ) ;
    public final void ruleInt0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:541:2: ( ( ( rule__Int0__Group__0 ) ) )
            // InternalBlatt2.g:542:2: ( ( rule__Int0__Group__0 ) )
            {
            // InternalBlatt2.g:542:2: ( ( rule__Int0__Group__0 ) )
            // InternalBlatt2.g:543:3: ( rule__Int0__Group__0 )
            {
             before(grammarAccess.getInt0Access().getGroup()); 
            // InternalBlatt2.g:544:3: ( rule__Int0__Group__0 )
            // InternalBlatt2.g:544:4: rule__Int0__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Int0__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInt0Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInt0"


    // $ANTLR start "entryRuleChar"
    // InternalBlatt2.g:553:1: entryRuleChar : ruleChar EOF ;
    public final void entryRuleChar() throws RecognitionException {
        try {
            // InternalBlatt2.g:554:1: ( ruleChar EOF )
            // InternalBlatt2.g:555:1: ruleChar EOF
            {
             before(grammarAccess.getCharRule()); 
            pushFollow(FOLLOW_1);
            ruleChar();

            state._fsp--;

             after(grammarAccess.getCharRule()); 
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
    // $ANTLR end "entryRuleChar"


    // $ANTLR start "ruleChar"
    // InternalBlatt2.g:562:1: ruleChar : ( ( rule__Char__Group__0 ) ) ;
    public final void ruleChar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:566:2: ( ( ( rule__Char__Group__0 ) ) )
            // InternalBlatt2.g:567:2: ( ( rule__Char__Group__0 ) )
            {
            // InternalBlatt2.g:567:2: ( ( rule__Char__Group__0 ) )
            // InternalBlatt2.g:568:3: ( rule__Char__Group__0 )
            {
             before(grammarAccess.getCharAccess().getGroup()); 
            // InternalBlatt2.g:569:3: ( rule__Char__Group__0 )
            // InternalBlatt2.g:569:4: rule__Char__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Char__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCharAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChar"


    // $ANTLR start "entryRuleLong"
    // InternalBlatt2.g:578:1: entryRuleLong : ruleLong EOF ;
    public final void entryRuleLong() throws RecognitionException {
        try {
            // InternalBlatt2.g:579:1: ( ruleLong EOF )
            // InternalBlatt2.g:580:1: ruleLong EOF
            {
             before(grammarAccess.getLongRule()); 
            pushFollow(FOLLOW_1);
            ruleLong();

            state._fsp--;

             after(grammarAccess.getLongRule()); 
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
    // $ANTLR end "entryRuleLong"


    // $ANTLR start "ruleLong"
    // InternalBlatt2.g:587:1: ruleLong : ( ( rule__Long__Group__0 ) ) ;
    public final void ruleLong() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:591:2: ( ( ( rule__Long__Group__0 ) ) )
            // InternalBlatt2.g:592:2: ( ( rule__Long__Group__0 ) )
            {
            // InternalBlatt2.g:592:2: ( ( rule__Long__Group__0 ) )
            // InternalBlatt2.g:593:3: ( rule__Long__Group__0 )
            {
             before(grammarAccess.getLongAccess().getGroup()); 
            // InternalBlatt2.g:594:3: ( rule__Long__Group__0 )
            // InternalBlatt2.g:594:4: rule__Long__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Long__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLongAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLong"


    // $ANTLR start "entryRuleFloat"
    // InternalBlatt2.g:603:1: entryRuleFloat : ruleFloat EOF ;
    public final void entryRuleFloat() throws RecognitionException {
        try {
            // InternalBlatt2.g:604:1: ( ruleFloat EOF )
            // InternalBlatt2.g:605:1: ruleFloat EOF
            {
             before(grammarAccess.getFloatRule()); 
            pushFollow(FOLLOW_1);
            ruleFloat();

            state._fsp--;

             after(grammarAccess.getFloatRule()); 
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
    // $ANTLR end "entryRuleFloat"


    // $ANTLR start "ruleFloat"
    // InternalBlatt2.g:612:1: ruleFloat : ( ( rule__Float__Group__0 ) ) ;
    public final void ruleFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:616:2: ( ( ( rule__Float__Group__0 ) ) )
            // InternalBlatt2.g:617:2: ( ( rule__Float__Group__0 ) )
            {
            // InternalBlatt2.g:617:2: ( ( rule__Float__Group__0 ) )
            // InternalBlatt2.g:618:3: ( rule__Float__Group__0 )
            {
             before(grammarAccess.getFloatAccess().getGroup()); 
            // InternalBlatt2.g:619:3: ( rule__Float__Group__0 )
            // InternalBlatt2.g:619:4: rule__Float__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Float__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFloatAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFloat"


    // $ANTLR start "entryRuleBoolean"
    // InternalBlatt2.g:628:1: entryRuleBoolean : ruleBoolean EOF ;
    public final void entryRuleBoolean() throws RecognitionException {
        try {
            // InternalBlatt2.g:629:1: ( ruleBoolean EOF )
            // InternalBlatt2.g:630:1: ruleBoolean EOF
            {
             before(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleBoolean();

            state._fsp--;

             after(grammarAccess.getBooleanRule()); 
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
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // InternalBlatt2.g:637:1: ruleBoolean : ( ( rule__Boolean__Group__0 ) ) ;
    public final void ruleBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:641:2: ( ( ( rule__Boolean__Group__0 ) ) )
            // InternalBlatt2.g:642:2: ( ( rule__Boolean__Group__0 ) )
            {
            // InternalBlatt2.g:642:2: ( ( rule__Boolean__Group__0 ) )
            // InternalBlatt2.g:643:3: ( rule__Boolean__Group__0 )
            {
             before(grammarAccess.getBooleanAccess().getGroup()); 
            // InternalBlatt2.g:644:3: ( rule__Boolean__Group__0 )
            // InternalBlatt2.g:644:4: rule__Boolean__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Boolean__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRuleVoid"
    // InternalBlatt2.g:653:1: entryRuleVoid : ruleVoid EOF ;
    public final void entryRuleVoid() throws RecognitionException {
        try {
            // InternalBlatt2.g:654:1: ( ruleVoid EOF )
            // InternalBlatt2.g:655:1: ruleVoid EOF
            {
             before(grammarAccess.getVoidRule()); 
            pushFollow(FOLLOW_1);
            ruleVoid();

            state._fsp--;

             after(grammarAccess.getVoidRule()); 
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
    // $ANTLR end "entryRuleVoid"


    // $ANTLR start "ruleVoid"
    // InternalBlatt2.g:662:1: ruleVoid : ( ( rule__Void__Group__0 ) ) ;
    public final void ruleVoid() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:666:2: ( ( ( rule__Void__Group__0 ) ) )
            // InternalBlatt2.g:667:2: ( ( rule__Void__Group__0 ) )
            {
            // InternalBlatt2.g:667:2: ( ( rule__Void__Group__0 ) )
            // InternalBlatt2.g:668:3: ( rule__Void__Group__0 )
            {
             before(grammarAccess.getVoidAccess().getGroup()); 
            // InternalBlatt2.g:669:3: ( rule__Void__Group__0 )
            // InternalBlatt2.g:669:4: rule__Void__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Void__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVoidAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVoid"


    // $ANTLR start "entryRuleInternalAction"
    // InternalBlatt2.g:678:1: entryRuleInternalAction : ruleInternalAction EOF ;
    public final void entryRuleInternalAction() throws RecognitionException {
        try {
            // InternalBlatt2.g:679:1: ( ruleInternalAction EOF )
            // InternalBlatt2.g:680:1: ruleInternalAction EOF
            {
             before(grammarAccess.getInternalActionRule()); 
            pushFollow(FOLLOW_1);
            ruleInternalAction();

            state._fsp--;

             after(grammarAccess.getInternalActionRule()); 
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
    // $ANTLR end "entryRuleInternalAction"


    // $ANTLR start "ruleInternalAction"
    // InternalBlatt2.g:687:1: ruleInternalAction : ( ( rule__InternalAction__Group__0 ) ) ;
    public final void ruleInternalAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:691:2: ( ( ( rule__InternalAction__Group__0 ) ) )
            // InternalBlatt2.g:692:2: ( ( rule__InternalAction__Group__0 ) )
            {
            // InternalBlatt2.g:692:2: ( ( rule__InternalAction__Group__0 ) )
            // InternalBlatt2.g:693:3: ( rule__InternalAction__Group__0 )
            {
             before(grammarAccess.getInternalActionAccess().getGroup()); 
            // InternalBlatt2.g:694:3: ( rule__InternalAction__Group__0 )
            // InternalBlatt2.g:694:4: rule__InternalAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InternalAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInternalActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInternalAction"


    // $ANTLR start "entryRuleLoop"
    // InternalBlatt2.g:703:1: entryRuleLoop : ruleLoop EOF ;
    public final void entryRuleLoop() throws RecognitionException {
        try {
            // InternalBlatt2.g:704:1: ( ruleLoop EOF )
            // InternalBlatt2.g:705:1: ruleLoop EOF
            {
             before(grammarAccess.getLoopRule()); 
            pushFollow(FOLLOW_1);
            ruleLoop();

            state._fsp--;

             after(grammarAccess.getLoopRule()); 
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
    // $ANTLR end "entryRuleLoop"


    // $ANTLR start "ruleLoop"
    // InternalBlatt2.g:712:1: ruleLoop : ( ( rule__Loop__Group__0 ) ) ;
    public final void ruleLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:716:2: ( ( ( rule__Loop__Group__0 ) ) )
            // InternalBlatt2.g:717:2: ( ( rule__Loop__Group__0 ) )
            {
            // InternalBlatt2.g:717:2: ( ( rule__Loop__Group__0 ) )
            // InternalBlatt2.g:718:3: ( rule__Loop__Group__0 )
            {
             before(grammarAccess.getLoopAccess().getGroup()); 
            // InternalBlatt2.g:719:3: ( rule__Loop__Group__0 )
            // InternalBlatt2.g:719:4: rule__Loop__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Loop__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLoop"


    // $ANTLR start "entryRuleBranch"
    // InternalBlatt2.g:728:1: entryRuleBranch : ruleBranch EOF ;
    public final void entryRuleBranch() throws RecognitionException {
        try {
            // InternalBlatt2.g:729:1: ( ruleBranch EOF )
            // InternalBlatt2.g:730:1: ruleBranch EOF
            {
             before(grammarAccess.getBranchRule()); 
            pushFollow(FOLLOW_1);
            ruleBranch();

            state._fsp--;

             after(grammarAccess.getBranchRule()); 
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
    // $ANTLR end "entryRuleBranch"


    // $ANTLR start "ruleBranch"
    // InternalBlatt2.g:737:1: ruleBranch : ( ( rule__Branch__Group__0 ) ) ;
    public final void ruleBranch() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:741:2: ( ( ( rule__Branch__Group__0 ) ) )
            // InternalBlatt2.g:742:2: ( ( rule__Branch__Group__0 ) )
            {
            // InternalBlatt2.g:742:2: ( ( rule__Branch__Group__0 ) )
            // InternalBlatt2.g:743:3: ( rule__Branch__Group__0 )
            {
             before(grammarAccess.getBranchAccess().getGroup()); 
            // InternalBlatt2.g:744:3: ( rule__Branch__Group__0 )
            // InternalBlatt2.g:744:4: rule__Branch__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Branch__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBranchAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBranch"


    // $ANTLR start "rule__Component__Alternatives"
    // InternalBlatt2.g:752:1: rule__Component__Alternatives : ( ( ruleComponent_Impl ) | ( ruleCompositeComponent ) );
    public final void rule__Component__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:756:1: ( ( ruleComponent_Impl ) | ( ruleCompositeComponent ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==27) ) {
                alt1=1;
            }
            else if ( (LA1_0==42) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalBlatt2.g:757:2: ( ruleComponent_Impl )
                    {
                    // InternalBlatt2.g:757:2: ( ruleComponent_Impl )
                    // InternalBlatt2.g:758:3: ruleComponent_Impl
                    {
                     before(grammarAccess.getComponentAccess().getComponent_ImplParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleComponent_Impl();

                    state._fsp--;

                     after(grammarAccess.getComponentAccess().getComponent_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBlatt2.g:763:2: ( ruleCompositeComponent )
                    {
                    // InternalBlatt2.g:763:2: ( ruleCompositeComponent )
                    // InternalBlatt2.g:764:3: ruleCompositeComponent
                    {
                     before(grammarAccess.getComponentAccess().getCompositeComponentParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCompositeComponent();

                    state._fsp--;

                     after(grammarAccess.getComponentAccess().getCompositeComponentParserRuleCall_1()); 

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
    // $ANTLR end "rule__Component__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalBlatt2.g:773:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:777:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalBlatt2.g:778:2: ( RULE_STRING )
                    {
                    // InternalBlatt2.g:778:2: ( RULE_STRING )
                    // InternalBlatt2.g:779:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBlatt2.g:784:2: ( RULE_ID )
                    {
                    // InternalBlatt2.g:784:2: ( RULE_ID )
                    // InternalBlatt2.g:785:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__AllocationContext__Group__0"
    // InternalBlatt2.g:794:1: rule__AllocationContext__Group__0 : rule__AllocationContext__Group__0__Impl rule__AllocationContext__Group__1 ;
    public final void rule__AllocationContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:798:1: ( rule__AllocationContext__Group__0__Impl rule__AllocationContext__Group__1 )
            // InternalBlatt2.g:799:2: rule__AllocationContext__Group__0__Impl rule__AllocationContext__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__AllocationContext__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllocationContext__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group__0"


    // $ANTLR start "rule__AllocationContext__Group__0__Impl"
    // InternalBlatt2.g:806:1: rule__AllocationContext__Group__0__Impl : ( 'AllocationContext' ) ;
    public final void rule__AllocationContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:810:1: ( ( 'AllocationContext' ) )
            // InternalBlatt2.g:811:1: ( 'AllocationContext' )
            {
            // InternalBlatt2.g:811:1: ( 'AllocationContext' )
            // InternalBlatt2.g:812:2: 'AllocationContext'
            {
             before(grammarAccess.getAllocationContextAccess().getAllocationContextKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getAllocationContextAccess().getAllocationContextKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group__0__Impl"


    // $ANTLR start "rule__AllocationContext__Group__1"
    // InternalBlatt2.g:821:1: rule__AllocationContext__Group__1 : rule__AllocationContext__Group__1__Impl rule__AllocationContext__Group__2 ;
    public final void rule__AllocationContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:825:1: ( rule__AllocationContext__Group__1__Impl rule__AllocationContext__Group__2 )
            // InternalBlatt2.g:826:2: rule__AllocationContext__Group__1__Impl rule__AllocationContext__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__AllocationContext__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllocationContext__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group__1"


    // $ANTLR start "rule__AllocationContext__Group__1__Impl"
    // InternalBlatt2.g:833:1: rule__AllocationContext__Group__1__Impl : ( '{' ) ;
    public final void rule__AllocationContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:837:1: ( ( '{' ) )
            // InternalBlatt2.g:838:1: ( '{' )
            {
            // InternalBlatt2.g:838:1: ( '{' )
            // InternalBlatt2.g:839:2: '{'
            {
             before(grammarAccess.getAllocationContextAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getAllocationContextAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group__1__Impl"


    // $ANTLR start "rule__AllocationContext__Group__2"
    // InternalBlatt2.g:848:1: rule__AllocationContext__Group__2 : rule__AllocationContext__Group__2__Impl rule__AllocationContext__Group__3 ;
    public final void rule__AllocationContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:852:1: ( rule__AllocationContext__Group__2__Impl rule__AllocationContext__Group__3 )
            // InternalBlatt2.g:853:2: rule__AllocationContext__Group__2__Impl rule__AllocationContext__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__AllocationContext__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllocationContext__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group__2"


    // $ANTLR start "rule__AllocationContext__Group__2__Impl"
    // InternalBlatt2.g:860:1: rule__AllocationContext__Group__2__Impl : ( 'allocatedAssemblyContext' ) ;
    public final void rule__AllocationContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:864:1: ( ( 'allocatedAssemblyContext' ) )
            // InternalBlatt2.g:865:1: ( 'allocatedAssemblyContext' )
            {
            // InternalBlatt2.g:865:1: ( 'allocatedAssemblyContext' )
            // InternalBlatt2.g:866:2: 'allocatedAssemblyContext'
            {
             before(grammarAccess.getAllocationContextAccess().getAllocatedAssemblyContextKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getAllocationContextAccess().getAllocatedAssemblyContextKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group__2__Impl"


    // $ANTLR start "rule__AllocationContext__Group__3"
    // InternalBlatt2.g:875:1: rule__AllocationContext__Group__3 : rule__AllocationContext__Group__3__Impl rule__AllocationContext__Group__4 ;
    public final void rule__AllocationContext__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:879:1: ( rule__AllocationContext__Group__3__Impl rule__AllocationContext__Group__4 )
            // InternalBlatt2.g:880:2: rule__AllocationContext__Group__3__Impl rule__AllocationContext__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__AllocationContext__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllocationContext__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group__3"


    // $ANTLR start "rule__AllocationContext__Group__3__Impl"
    // InternalBlatt2.g:887:1: rule__AllocationContext__Group__3__Impl : ( '(' ) ;
    public final void rule__AllocationContext__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:891:1: ( ( '(' ) )
            // InternalBlatt2.g:892:1: ( '(' )
            {
            // InternalBlatt2.g:892:1: ( '(' )
            // InternalBlatt2.g:893:2: '('
            {
             before(grammarAccess.getAllocationContextAccess().getLeftParenthesisKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getAllocationContextAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group__3__Impl"


    // $ANTLR start "rule__AllocationContext__Group__4"
    // InternalBlatt2.g:902:1: rule__AllocationContext__Group__4 : rule__AllocationContext__Group__4__Impl rule__AllocationContext__Group__5 ;
    public final void rule__AllocationContext__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:906:1: ( rule__AllocationContext__Group__4__Impl rule__AllocationContext__Group__5 )
            // InternalBlatt2.g:907:2: rule__AllocationContext__Group__4__Impl rule__AllocationContext__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__AllocationContext__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllocationContext__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group__4"


    // $ANTLR start "rule__AllocationContext__Group__4__Impl"
    // InternalBlatt2.g:914:1: rule__AllocationContext__Group__4__Impl : ( ( rule__AllocationContext__AllocatedAssemblyContextAssignment_4 ) ) ;
    public final void rule__AllocationContext__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:918:1: ( ( ( rule__AllocationContext__AllocatedAssemblyContextAssignment_4 ) ) )
            // InternalBlatt2.g:919:1: ( ( rule__AllocationContext__AllocatedAssemblyContextAssignment_4 ) )
            {
            // InternalBlatt2.g:919:1: ( ( rule__AllocationContext__AllocatedAssemblyContextAssignment_4 ) )
            // InternalBlatt2.g:920:2: ( rule__AllocationContext__AllocatedAssemblyContextAssignment_4 )
            {
             before(grammarAccess.getAllocationContextAccess().getAllocatedAssemblyContextAssignment_4()); 
            // InternalBlatt2.g:921:2: ( rule__AllocationContext__AllocatedAssemblyContextAssignment_4 )
            // InternalBlatt2.g:921:3: rule__AllocationContext__AllocatedAssemblyContextAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__AllocationContext__AllocatedAssemblyContextAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAllocationContextAccess().getAllocatedAssemblyContextAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group__4__Impl"


    // $ANTLR start "rule__AllocationContext__Group__5"
    // InternalBlatt2.g:929:1: rule__AllocationContext__Group__5 : rule__AllocationContext__Group__5__Impl rule__AllocationContext__Group__6 ;
    public final void rule__AllocationContext__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:933:1: ( rule__AllocationContext__Group__5__Impl rule__AllocationContext__Group__6 )
            // InternalBlatt2.g:934:2: rule__AllocationContext__Group__5__Impl rule__AllocationContext__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__AllocationContext__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllocationContext__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group__5"


    // $ANTLR start "rule__AllocationContext__Group__5__Impl"
    // InternalBlatt2.g:941:1: rule__AllocationContext__Group__5__Impl : ( ( rule__AllocationContext__Group_5__0 )* ) ;
    public final void rule__AllocationContext__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:945:1: ( ( ( rule__AllocationContext__Group_5__0 )* ) )
            // InternalBlatt2.g:946:1: ( ( rule__AllocationContext__Group_5__0 )* )
            {
            // InternalBlatt2.g:946:1: ( ( rule__AllocationContext__Group_5__0 )* )
            // InternalBlatt2.g:947:2: ( rule__AllocationContext__Group_5__0 )*
            {
             before(grammarAccess.getAllocationContextAccess().getGroup_5()); 
            // InternalBlatt2.g:948:2: ( rule__AllocationContext__Group_5__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalBlatt2.g:948:3: rule__AllocationContext__Group_5__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__AllocationContext__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getAllocationContextAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group__5__Impl"


    // $ANTLR start "rule__AllocationContext__Group__6"
    // InternalBlatt2.g:956:1: rule__AllocationContext__Group__6 : rule__AllocationContext__Group__6__Impl rule__AllocationContext__Group__7 ;
    public final void rule__AllocationContext__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:960:1: ( rule__AllocationContext__Group__6__Impl rule__AllocationContext__Group__7 )
            // InternalBlatt2.g:961:2: rule__AllocationContext__Group__6__Impl rule__AllocationContext__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__AllocationContext__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllocationContext__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group__6"


    // $ANTLR start "rule__AllocationContext__Group__6__Impl"
    // InternalBlatt2.g:968:1: rule__AllocationContext__Group__6__Impl : ( ')' ) ;
    public final void rule__AllocationContext__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:972:1: ( ( ')' ) )
            // InternalBlatt2.g:973:1: ( ')' )
            {
            // InternalBlatt2.g:973:1: ( ')' )
            // InternalBlatt2.g:974:2: ')'
            {
             before(grammarAccess.getAllocationContextAccess().getRightParenthesisKeyword_6()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getAllocationContextAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group__6__Impl"


    // $ANTLR start "rule__AllocationContext__Group__7"
    // InternalBlatt2.g:983:1: rule__AllocationContext__Group__7 : rule__AllocationContext__Group__7__Impl rule__AllocationContext__Group__8 ;
    public final void rule__AllocationContext__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:987:1: ( rule__AllocationContext__Group__7__Impl rule__AllocationContext__Group__8 )
            // InternalBlatt2.g:988:2: rule__AllocationContext__Group__7__Impl rule__AllocationContext__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__AllocationContext__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllocationContext__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group__7"


    // $ANTLR start "rule__AllocationContext__Group__7__Impl"
    // InternalBlatt2.g:995:1: rule__AllocationContext__Group__7__Impl : ( ( rule__AllocationContext__Group_7__0 )? ) ;
    public final void rule__AllocationContext__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:999:1: ( ( ( rule__AllocationContext__Group_7__0 )? ) )
            // InternalBlatt2.g:1000:1: ( ( rule__AllocationContext__Group_7__0 )? )
            {
            // InternalBlatt2.g:1000:1: ( ( rule__AllocationContext__Group_7__0 )? )
            // InternalBlatt2.g:1001:2: ( rule__AllocationContext__Group_7__0 )?
            {
             before(grammarAccess.getAllocationContextAccess().getGroup_7()); 
            // InternalBlatt2.g:1002:2: ( rule__AllocationContext__Group_7__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalBlatt2.g:1002:3: rule__AllocationContext__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AllocationContext__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAllocationContextAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group__7__Impl"


    // $ANTLR start "rule__AllocationContext__Group__8"
    // InternalBlatt2.g:1010:1: rule__AllocationContext__Group__8 : rule__AllocationContext__Group__8__Impl ;
    public final void rule__AllocationContext__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:1014:1: ( rule__AllocationContext__Group__8__Impl )
            // InternalBlatt2.g:1015:2: rule__AllocationContext__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AllocationContext__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group__8"


    // $ANTLR start "rule__AllocationContext__Group__8__Impl"
    // InternalBlatt2.g:1021:1: rule__AllocationContext__Group__8__Impl : ( '}' ) ;
    public final void rule__AllocationContext__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:1025:1: ( ( '}' ) )
            // InternalBlatt2.g:1026:1: ( '}' )
            {
            // InternalBlatt2.g:1026:1: ( '}' )
            // InternalBlatt2.g:1027:2: '}'
            {
             before(grammarAccess.getAllocationContextAccess().getRightCurlyBracketKeyword_8()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getAllocationContextAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group__8__Impl"


    // $ANTLR start "rule__AllocationContext__Group_5__0"
    // InternalBlatt2.g:1037:1: rule__AllocationContext__Group_5__0 : rule__AllocationContext__Group_5__0__Impl rule__AllocationContext__Group_5__1 ;
    public final void rule__AllocationContext__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:1041:1: ( rule__AllocationContext__Group_5__0__Impl rule__AllocationContext__Group_5__1 )
            // InternalBlatt2.g:1042:2: rule__AllocationContext__Group_5__0__Impl rule__AllocationContext__Group_5__1
            {
            pushFollow(FOLLOW_6);
            rule__AllocationContext__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllocationContext__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group_5__0"


    // $ANTLR start "rule__AllocationContext__Group_5__0__Impl"
    // InternalBlatt2.g:1049:1: rule__AllocationContext__Group_5__0__Impl : ( ',' ) ;
    public final void rule__AllocationContext__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:1053:1: ( ( ',' ) )
            // InternalBlatt2.g:1054:1: ( ',' )
            {
            // InternalBlatt2.g:1054:1: ( ',' )
            // InternalBlatt2.g:1055:2: ','
            {
             before(grammarAccess.getAllocationContextAccess().getCommaKeyword_5_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAllocationContextAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group_5__0__Impl"


    // $ANTLR start "rule__AllocationContext__Group_5__1"
    // InternalBlatt2.g:1064:1: rule__AllocationContext__Group_5__1 : rule__AllocationContext__Group_5__1__Impl ;
    public final void rule__AllocationContext__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:1068:1: ( rule__AllocationContext__Group_5__1__Impl )
            // InternalBlatt2.g:1069:2: rule__AllocationContext__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AllocationContext__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group_5__1"


    // $ANTLR start "rule__AllocationContext__Group_5__1__Impl"
    // InternalBlatt2.g:1075:1: rule__AllocationContext__Group_5__1__Impl : ( ( rule__AllocationContext__AllocatedAssemblyContextAssignment_5_1 ) ) ;
    public final void rule__AllocationContext__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:1079:1: ( ( ( rule__AllocationContext__AllocatedAssemblyContextAssignment_5_1 ) ) )
            // InternalBlatt2.g:1080:1: ( ( rule__AllocationContext__AllocatedAssemblyContextAssignment_5_1 ) )
            {
            // InternalBlatt2.g:1080:1: ( ( rule__AllocationContext__AllocatedAssemblyContextAssignment_5_1 ) )
            // InternalBlatt2.g:1081:2: ( rule__AllocationContext__AllocatedAssemblyContextAssignment_5_1 )
            {
             before(grammarAccess.getAllocationContextAccess().getAllocatedAssemblyContextAssignment_5_1()); 
            // InternalBlatt2.g:1082:2: ( rule__AllocationContext__AllocatedAssemblyContextAssignment_5_1 )
            // InternalBlatt2.g:1082:3: rule__AllocationContext__AllocatedAssemblyContextAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__AllocationContext__AllocatedAssemblyContextAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getAllocationContextAccess().getAllocatedAssemblyContextAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group_5__1__Impl"


    // $ANTLR start "rule__AllocationContext__Group_7__0"
    // InternalBlatt2.g:1091:1: rule__AllocationContext__Group_7__0 : rule__AllocationContext__Group_7__0__Impl rule__AllocationContext__Group_7__1 ;
    public final void rule__AllocationContext__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:1095:1: ( rule__AllocationContext__Group_7__0__Impl rule__AllocationContext__Group_7__1 )
            // InternalBlatt2.g:1096:2: rule__AllocationContext__Group_7__0__Impl rule__AllocationContext__Group_7__1
            {
            pushFollow(FOLLOW_3);
            rule__AllocationContext__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllocationContext__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group_7__0"


    // $ANTLR start "rule__AllocationContext__Group_7__0__Impl"
    // InternalBlatt2.g:1103:1: rule__AllocationContext__Group_7__0__Impl : ( 'targetContainer' ) ;
    public final void rule__AllocationContext__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:1107:1: ( ( 'targetContainer' ) )
            // InternalBlatt2.g:1108:1: ( 'targetContainer' )
            {
            // InternalBlatt2.g:1108:1: ( 'targetContainer' )
            // InternalBlatt2.g:1109:2: 'targetContainer'
            {
             before(grammarAccess.getAllocationContextAccess().getTargetContainerKeyword_7_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getAllocationContextAccess().getTargetContainerKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group_7__0__Impl"


    // $ANTLR start "rule__AllocationContext__Group_7__1"
    // InternalBlatt2.g:1118:1: rule__AllocationContext__Group_7__1 : rule__AllocationContext__Group_7__1__Impl rule__AllocationContext__Group_7__2 ;
    public final void rule__AllocationContext__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:1122:1: ( rule__AllocationContext__Group_7__1__Impl rule__AllocationContext__Group_7__2 )
            // InternalBlatt2.g:1123:2: rule__AllocationContext__Group_7__1__Impl rule__AllocationContext__Group_7__2
            {
            pushFollow(FOLLOW_10);
            rule__AllocationContext__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllocationContext__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group_7__1"


    // $ANTLR start "rule__AllocationContext__Group_7__1__Impl"
    // InternalBlatt2.g:1130:1: rule__AllocationContext__Group_7__1__Impl : ( '{' ) ;
    public final void rule__AllocationContext__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:1134:1: ( ( '{' ) )
            // InternalBlatt2.g:1135:1: ( '{' )
            {
            // InternalBlatt2.g:1135:1: ( '{' )
            // InternalBlatt2.g:1136:2: '{'
            {
             before(grammarAccess.getAllocationContextAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getAllocationContextAccess().getLeftCurlyBracketKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group_7__1__Impl"


    // $ANTLR start "rule__AllocationContext__Group_7__2"
    // InternalBlatt2.g:1145:1: rule__AllocationContext__Group_7__2 : rule__AllocationContext__Group_7__2__Impl rule__AllocationContext__Group_7__3 ;
    public final void rule__AllocationContext__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:1149:1: ( rule__AllocationContext__Group_7__2__Impl rule__AllocationContext__Group_7__3 )
            // InternalBlatt2.g:1150:2: rule__AllocationContext__Group_7__2__Impl rule__AllocationContext__Group_7__3
            {
            pushFollow(FOLLOW_11);
            rule__AllocationContext__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllocationContext__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group_7__2"


    // $ANTLR start "rule__AllocationContext__Group_7__2__Impl"
    // InternalBlatt2.g:1157:1: rule__AllocationContext__Group_7__2__Impl : ( ( rule__AllocationContext__TargetContainerAssignment_7_2 ) ) ;
    public final void rule__AllocationContext__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:1161:1: ( ( ( rule__AllocationContext__TargetContainerAssignment_7_2 ) ) )
            // InternalBlatt2.g:1162:1: ( ( rule__AllocationContext__TargetContainerAssignment_7_2 ) )
            {
            // InternalBlatt2.g:1162:1: ( ( rule__AllocationContext__TargetContainerAssignment_7_2 ) )
            // InternalBlatt2.g:1163:2: ( rule__AllocationContext__TargetContainerAssignment_7_2 )
            {
             before(grammarAccess.getAllocationContextAccess().getTargetContainerAssignment_7_2()); 
            // InternalBlatt2.g:1164:2: ( rule__AllocationContext__TargetContainerAssignment_7_2 )
            // InternalBlatt2.g:1164:3: rule__AllocationContext__TargetContainerAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__AllocationContext__TargetContainerAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getAllocationContextAccess().getTargetContainerAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group_7__2__Impl"


    // $ANTLR start "rule__AllocationContext__Group_7__3"
    // InternalBlatt2.g:1172:1: rule__AllocationContext__Group_7__3 : rule__AllocationContext__Group_7__3__Impl rule__AllocationContext__Group_7__4 ;
    public final void rule__AllocationContext__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:1176:1: ( rule__AllocationContext__Group_7__3__Impl rule__AllocationContext__Group_7__4 )
            // InternalBlatt2.g:1177:2: rule__AllocationContext__Group_7__3__Impl rule__AllocationContext__Group_7__4
            {
            pushFollow(FOLLOW_11);
            rule__AllocationContext__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllocationContext__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group_7__3"


    // $ANTLR start "rule__AllocationContext__Group_7__3__Impl"
    // InternalBlatt2.g:1184:1: rule__AllocationContext__Group_7__3__Impl : ( ( rule__AllocationContext__Group_7_3__0 )* ) ;
    public final void rule__AllocationContext__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:1188:1: ( ( ( rule__AllocationContext__Group_7_3__0 )* ) )
            // InternalBlatt2.g:1189:1: ( ( rule__AllocationContext__Group_7_3__0 )* )
            {
            // InternalBlatt2.g:1189:1: ( ( rule__AllocationContext__Group_7_3__0 )* )
            // InternalBlatt2.g:1190:2: ( rule__AllocationContext__Group_7_3__0 )*
            {
             before(grammarAccess.getAllocationContextAccess().getGroup_7_3()); 
            // InternalBlatt2.g:1191:2: ( rule__AllocationContext__Group_7_3__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalBlatt2.g:1191:3: rule__AllocationContext__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__AllocationContext__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getAllocationContextAccess().getGroup_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group_7__3__Impl"


    // $ANTLR start "rule__AllocationContext__Group_7__4"
    // InternalBlatt2.g:1199:1: rule__AllocationContext__Group_7__4 : rule__AllocationContext__Group_7__4__Impl ;
    public final void rule__AllocationContext__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:1203:1: ( rule__AllocationContext__Group_7__4__Impl )
            // InternalBlatt2.g:1204:2: rule__AllocationContext__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AllocationContext__Group_7__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group_7__4"


    // $ANTLR start "rule__AllocationContext__Group_7__4__Impl"
    // InternalBlatt2.g:1210:1: rule__AllocationContext__Group_7__4__Impl : ( '}' ) ;
    public final void rule__AllocationContext__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:1214:1: ( ( '}' ) )
            // InternalBlatt2.g:1215:1: ( '}' )
            {
            // InternalBlatt2.g:1215:1: ( '}' )
            // InternalBlatt2.g:1216:2: '}'
            {
             before(grammarAccess.getAllocationContextAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getAllocationContextAccess().getRightCurlyBracketKeyword_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group_7__4__Impl"


    // $ANTLR start "rule__AllocationContext__Group_7_3__0"
    // InternalBlatt2.g:1226:1: rule__AllocationContext__Group_7_3__0 : rule__AllocationContext__Group_7_3__0__Impl rule__AllocationContext__Group_7_3__1 ;
    public final void rule__AllocationContext__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:1230:1: ( rule__AllocationContext__Group_7_3__0__Impl rule__AllocationContext__Group_7_3__1 )
            // InternalBlatt2.g:1231:2: rule__AllocationContext__Group_7_3__0__Impl rule__AllocationContext__Group_7_3__1
            {
            pushFollow(FOLLOW_10);
            rule__AllocationContext__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllocationContext__Group_7_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group_7_3__0"


    // $ANTLR start "rule__AllocationContext__Group_7_3__0__Impl"
    // InternalBlatt2.g:1238:1: rule__AllocationContext__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__AllocationContext__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:1242:1: ( ( ',' ) )
            // InternalBlatt2.g:1243:1: ( ',' )
            {
            // InternalBlatt2.g:1243:1: ( ',' )
            // InternalBlatt2.g:1244:2: ','
            {
             before(grammarAccess.getAllocationContextAccess().getCommaKeyword_7_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAllocationContextAccess().getCommaKeyword_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group_7_3__0__Impl"


    // $ANTLR start "rule__AllocationContext__Group_7_3__1"
    // InternalBlatt2.g:1253:1: rule__AllocationContext__Group_7_3__1 : rule__AllocationContext__Group_7_3__1__Impl ;
    public final void rule__AllocationContext__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:1257:1: ( rule__AllocationContext__Group_7_3__1__Impl )
            // InternalBlatt2.g:1258:2: rule__AllocationContext__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AllocationContext__Group_7_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group_7_3__1"


    // $ANTLR start "rule__AllocationContext__Group_7_3__1__Impl"
    // InternalBlatt2.g:1264:1: rule__AllocationContext__Group_7_3__1__Impl : ( ( rule__AllocationContext__TargetContainerAssignment_7_3_1 ) ) ;
    public final void rule__AllocationContext__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:1268:1: ( ( ( rule__AllocationContext__TargetContainerAssignment_7_3_1 ) ) )
            // InternalBlatt2.g:1269:1: ( ( rule__AllocationContext__TargetContainerAssignment_7_3_1 ) )
            {
            // InternalBlatt2.g:1269:1: ( ( rule__AllocationContext__TargetContainerAssignment_7_3_1 ) )
            // InternalBlatt2.g:1270:2: ( rule__AllocationContext__TargetContainerAssignment_7_3_1 )
            {
             before(grammarAccess.getAllocationContextAccess().getTargetContainerAssignment_7_3_1()); 
            // InternalBlatt2.g:1271:2: ( rule__AllocationContext__TargetContainerAssignment_7_3_1 )
            // InternalBlatt2.g:1271:3: rule__AllocationContext__TargetContainerAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__AllocationContext__TargetContainerAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAllocationContextAccess().getTargetContainerAssignment_7_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group_7_3__1__Impl"


    // $ANTLR start "rule__Container__Group__0"
    // InternalBlatt2.g:1280:1: rule__Container__Group__0 : rule__Container__Group__0__Impl rule__Container__Group__1 ;
    public final void rule__Container__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:1284:1: ( rule__Container__Group__0__Impl rule__Container__Group__1 )
            // InternalBlatt2.g:1285:2: rule__Container__Group__0__Impl rule__Container__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Container__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__0"


    // $ANTLR start "rule__Container__Group__0__Impl"
    // InternalBlatt2.g:1292:1: rule__Container__Group__0__Impl : ( 'Container' ) ;
    public final void rule__Container__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:1296:1: ( ( 'Container' ) )
            // InternalBlatt2.g:1297:1: ( 'Container' )
            {
            // InternalBlatt2.g:1297:1: ( 'Container' )
            // InternalBlatt2.g:1298:2: 'Container'
            {
             before(grammarAccess.getContainerAccess().getContainerKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getContainerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__0__Impl"


    // $ANTLR start "rule__Container__Group__1"
    // InternalBlatt2.g:1307:1: rule__Container__Group__1 : rule__Container__Group__1__Impl rule__Container__Group__2 ;
    public final void rule__Container__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:1311:1: ( rule__Container__Group__1__Impl rule__Container__Group__2 )
            // InternalBlatt2.g:1312:2: rule__Container__Group__1__Impl rule__Container__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Container__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__1"


    // $ANTLR start "rule__Container__Group__1__Impl"
    // InternalBlatt2.g:1319:1: rule__Container__Group__1__Impl : ( ( rule__Container__NameAssignment_1 ) ) ;
    public final void rule__Container__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:1323:1: ( ( ( rule__Container__NameAssignment_1 ) ) )
            // InternalBlatt2.g:1324:1: ( ( rule__Container__NameAssignment_1 ) )
            {
            // InternalBlatt2.g:1324:1: ( ( rule__Container__NameAssignment_1 ) )
            // InternalBlatt2.g:1325:2: ( rule__Container__NameAssignment_1 )
            {
             before(grammarAccess.getContainerAccess().getNameAssignment_1()); 
            // InternalBlatt2.g:1326:2: ( rule__Container__NameAssignment_1 )
            // InternalBlatt2.g:1326:3: rule__Container__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Container__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__1__Impl"


    // $ANTLR start "rule__Container__Group__2"
    // InternalBlatt2.g:1334:1: rule__Container__Group__2 : rule__Container__Group__2__Impl rule__Container__Group__3 ;
    public final void rule__Container__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:1338:1: ( rule__Container__Group__2__Impl rule__Container__Group__3 )
            // InternalBlatt2.g:1339:2: rule__Container__Group__2__Impl rule__Container__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Container__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__2"


    // $ANTLR start "rule__Container__Group__2__Impl"
    // InternalBlatt2.g:1346:1: rule__Container__Group__2__Impl : ( '{' ) ;
    public final void rule__Container__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:1350:1: ( ( '{' ) )
            // InternalBlatt2.g:1351:1: ( '{' )
            {
            // InternalBlatt2.g:1351:1: ( '{' )
            // InternalBlatt2.g:1352:2: '{'
            {
             before(grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__2__Impl"


    // $ANTLR start "rule__Container__Group__3"
    // InternalBlatt2.g:1361:1: rule__Container__Group__3 : rule__Container__Group__3__Impl rule__Container__Group__4 ;
    public final void rule__Container__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:1365:1: ( rule__Container__Group__3__Impl rule__Container__Group__4 )
            // InternalBlatt2.g:1366:2: rule__Container__Group__3__Impl rule__Container__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Container__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__3"


    // $ANTLR start "rule__Container__Group__3__Impl"
    // InternalBlatt2.g:1373:1: rule__Container__Group__3__Impl : ( 'links' ) ;
    public final void rule__Container__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:1377:1: ( ( 'links' ) )
            // InternalBlatt2.g:1378:1: ( 'links' )
            {
            // InternalBlatt2.g:1378:1: ( 'links' )
            // InternalBlatt2.g:1379:2: 'links'
            {
             before(grammarAccess.getContainerAccess().getLinksKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getLinksKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__3__Impl"


    // $ANTLR start "rule__Container__Group__4"
    // InternalBlatt2.g:1388:1: rule__Container__Group__4 : rule__Container__Group__4__Impl rule__Container__Group__5 ;
    public final void rule__Container__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:1392:1: ( rule__Container__Group__4__Impl rule__Container__Group__5 )
            // InternalBlatt2.g:1393:2: rule__Container__Group__4__Impl rule__Container__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Container__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__4"


    // $ANTLR start "rule__Container__Group__4__Impl"
    // InternalBlatt2.g:1400:1: rule__Container__Group__4__Impl : ( '(' ) ;
    public final void rule__Container__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:1404:1: ( ( '(' ) )
            // InternalBlatt2.g:1405:1: ( '(' )
            {
            // InternalBlatt2.g:1405:1: ( '(' )
            // InternalBlatt2.g:1406:2: '('
            {
             before(grammarAccess.getContainerAccess().getLeftParenthesisKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getLeftParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__4__Impl"


    // $ANTLR start "rule__Container__Group__5"
    // InternalBlatt2.g:1415:1: rule__Container__Group__5 : rule__Container__Group__5__Impl rule__Container__Group__6 ;
    public final void rule__Container__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:1419:1: ( rule__Container__Group__5__Impl rule__Container__Group__6 )
            // InternalBlatt2.g:1420:2: rule__Container__Group__5__Impl rule__Container__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Container__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__5"


    // $ANTLR start "rule__Container__Group__5__Impl"
    // InternalBlatt2.g:1427:1: rule__Container__Group__5__Impl : ( ( rule__Container__LinksAssignment_5 ) ) ;
    public final void rule__Container__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:1431:1: ( ( ( rule__Container__LinksAssignment_5 ) ) )
            // InternalBlatt2.g:1432:1: ( ( rule__Container__LinksAssignment_5 ) )
            {
            // InternalBlatt2.g:1432:1: ( ( rule__Container__LinksAssignment_5 ) )
            // InternalBlatt2.g:1433:2: ( rule__Container__LinksAssignment_5 )
            {
             before(grammarAccess.getContainerAccess().getLinksAssignment_5()); 
            // InternalBlatt2.g:1434:2: ( rule__Container__LinksAssignment_5 )
            // InternalBlatt2.g:1434:3: rule__Container__LinksAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Container__LinksAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getLinksAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__5__Impl"


    // $ANTLR start "rule__Container__Group__6"
    // InternalBlatt2.g:1442:1: rule__Container__Group__6 : rule__Container__Group__6__Impl rule__Container__Group__7 ;
    public final void rule__Container__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:1446:1: ( rule__Container__Group__6__Impl rule__Container__Group__7 )
            // InternalBlatt2.g:1447:2: rule__Container__Group__6__Impl rule__Container__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__Container__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__6"


    // $ANTLR start "rule__Container__Group__6__Impl"
    // InternalBlatt2.g:1454:1: rule__Container__Group__6__Impl : ( ( rule__Container__Group_6__0 )* ) ;
    public final void rule__Container__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:1458:1: ( ( ( rule__Container__Group_6__0 )* ) )
            // InternalBlatt2.g:1459:1: ( ( rule__Container__Group_6__0 )* )
            {
            // InternalBlatt2.g:1459:1: ( ( rule__Container__Group_6__0 )* )
            // InternalBlatt2.g:1460:2: ( rule__Container__Group_6__0 )*
            {
             before(grammarAccess.getContainerAccess().getGroup_6()); 
            // InternalBlatt2.g:1461:2: ( rule__Container__Group_6__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalBlatt2.g:1461:3: rule__Container__Group_6__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Container__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getContainerAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__6__Impl"


    // $ANTLR start "rule__Container__Group__7"
    // InternalBlatt2.g:1469:1: rule__Container__Group__7 : rule__Container__Group__7__Impl rule__Container__Group__8 ;
    public final void rule__Container__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:1473:1: ( rule__Container__Group__7__Impl rule__Container__Group__8 )
            // InternalBlatt2.g:1474:2: rule__Container__Group__7__Impl rule__Container__Group__8
            {
            pushFollow(FOLLOW_13);
            rule__Container__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__7"


    // $ANTLR start "rule__Container__Group__7__Impl"
    // InternalBlatt2.g:1481:1: rule__Container__Group__7__Impl : ( ')' ) ;
    public final void rule__Container__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:1485:1: ( ( ')' ) )
            // InternalBlatt2.g:1486:1: ( ')' )
            {
            // InternalBlatt2.g:1486:1: ( ')' )
            // InternalBlatt2.g:1487:2: ')'
            {
             before(grammarAccess.getContainerAccess().getRightParenthesisKeyword_7()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__7__Impl"


    // $ANTLR start "rule__Container__Group__8"
    // InternalBlatt2.g:1496:1: rule__Container__Group__8 : rule__Container__Group__8__Impl ;
    public final void rule__Container__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:1500:1: ( rule__Container__Group__8__Impl )
            // InternalBlatt2.g:1501:2: rule__Container__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Container__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__8"


    // $ANTLR start "rule__Container__Group__8__Impl"
    // InternalBlatt2.g:1507:1: rule__Container__Group__8__Impl : ( '}' ) ;
    public final void rule__Container__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:1511:1: ( ( '}' ) )
            // InternalBlatt2.g:1512:1: ( '}' )
            {
            // InternalBlatt2.g:1512:1: ( '}' )
            // InternalBlatt2.g:1513:2: '}'
            {
             before(grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_8()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__8__Impl"


    // $ANTLR start "rule__Container__Group_6__0"
    // InternalBlatt2.g:1523:1: rule__Container__Group_6__0 : rule__Container__Group_6__0__Impl rule__Container__Group_6__1 ;
    public final void rule__Container__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:1527:1: ( rule__Container__Group_6__0__Impl rule__Container__Group_6__1 )
            // InternalBlatt2.g:1528:2: rule__Container__Group_6__0__Impl rule__Container__Group_6__1
            {
            pushFollow(FOLLOW_6);
            rule__Container__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group_6__0"


    // $ANTLR start "rule__Container__Group_6__0__Impl"
    // InternalBlatt2.g:1535:1: rule__Container__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Container__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:1539:1: ( ( ',' ) )
            // InternalBlatt2.g:1540:1: ( ',' )
            {
            // InternalBlatt2.g:1540:1: ( ',' )
            // InternalBlatt2.g:1541:2: ','
            {
             before(grammarAccess.getContainerAccess().getCommaKeyword_6_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group_6__0__Impl"


    // $ANTLR start "rule__Container__Group_6__1"
    // InternalBlatt2.g:1550:1: rule__Container__Group_6__1 : rule__Container__Group_6__1__Impl ;
    public final void rule__Container__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:1554:1: ( rule__Container__Group_6__1__Impl )
            // InternalBlatt2.g:1555:2: rule__Container__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Container__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group_6__1"


    // $ANTLR start "rule__Container__Group_6__1__Impl"
    // InternalBlatt2.g:1561:1: rule__Container__Group_6__1__Impl : ( ( rule__Container__LinksAssignment_6_1 ) ) ;
    public final void rule__Container__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:1565:1: ( ( ( rule__Container__LinksAssignment_6_1 ) ) )
            // InternalBlatt2.g:1566:1: ( ( rule__Container__LinksAssignment_6_1 ) )
            {
            // InternalBlatt2.g:1566:1: ( ( rule__Container__LinksAssignment_6_1 ) )
            // InternalBlatt2.g:1567:2: ( rule__Container__LinksAssignment_6_1 )
            {
             before(grammarAccess.getContainerAccess().getLinksAssignment_6_1()); 
            // InternalBlatt2.g:1568:2: ( rule__Container__LinksAssignment_6_1 )
            // InternalBlatt2.g:1568:3: rule__Container__LinksAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Container__LinksAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getLinksAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group_6__1__Impl"


    // $ANTLR start "rule__AssemblyContext__Group__0"
    // InternalBlatt2.g:1577:1: rule__AssemblyContext__Group__0 : rule__AssemblyContext__Group__0__Impl rule__AssemblyContext__Group__1 ;
    public final void rule__AssemblyContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:1581:1: ( rule__AssemblyContext__Group__0__Impl rule__AssemblyContext__Group__1 )
            // InternalBlatt2.g:1582:2: rule__AssemblyContext__Group__0__Impl rule__AssemblyContext__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__AssemblyContext__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group__0"


    // $ANTLR start "rule__AssemblyContext__Group__0__Impl"
    // InternalBlatt2.g:1589:1: rule__AssemblyContext__Group__0__Impl : ( 'AssemblyContext' ) ;
    public final void rule__AssemblyContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:1593:1: ( ( 'AssemblyContext' ) )
            // InternalBlatt2.g:1594:1: ( 'AssemblyContext' )
            {
            // InternalBlatt2.g:1594:1: ( 'AssemblyContext' )
            // InternalBlatt2.g:1595:2: 'AssemblyContext'
            {
             before(grammarAccess.getAssemblyContextAccess().getAssemblyContextKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAssemblyContextAccess().getAssemblyContextKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group__0__Impl"


    // $ANTLR start "rule__AssemblyContext__Group__1"
    // InternalBlatt2.g:1604:1: rule__AssemblyContext__Group__1 : rule__AssemblyContext__Group__1__Impl rule__AssemblyContext__Group__2 ;
    public final void rule__AssemblyContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:1608:1: ( rule__AssemblyContext__Group__1__Impl rule__AssemblyContext__Group__2 )
            // InternalBlatt2.g:1609:2: rule__AssemblyContext__Group__1__Impl rule__AssemblyContext__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__AssemblyContext__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group__1"


    // $ANTLR start "rule__AssemblyContext__Group__1__Impl"
    // InternalBlatt2.g:1616:1: rule__AssemblyContext__Group__1__Impl : ( ( rule__AssemblyContext__NameAssignment_1 ) ) ;
    public final void rule__AssemblyContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:1620:1: ( ( ( rule__AssemblyContext__NameAssignment_1 ) ) )
            // InternalBlatt2.g:1621:1: ( ( rule__AssemblyContext__NameAssignment_1 ) )
            {
            // InternalBlatt2.g:1621:1: ( ( rule__AssemblyContext__NameAssignment_1 ) )
            // InternalBlatt2.g:1622:2: ( rule__AssemblyContext__NameAssignment_1 )
            {
             before(grammarAccess.getAssemblyContextAccess().getNameAssignment_1()); 
            // InternalBlatt2.g:1623:2: ( rule__AssemblyContext__NameAssignment_1 )
            // InternalBlatt2.g:1623:3: rule__AssemblyContext__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyContext__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAssemblyContextAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group__1__Impl"


    // $ANTLR start "rule__AssemblyContext__Group__2"
    // InternalBlatt2.g:1631:1: rule__AssemblyContext__Group__2 : rule__AssemblyContext__Group__2__Impl rule__AssemblyContext__Group__3 ;
    public final void rule__AssemblyContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:1635:1: ( rule__AssemblyContext__Group__2__Impl rule__AssemblyContext__Group__3 )
            // InternalBlatt2.g:1636:2: rule__AssemblyContext__Group__2__Impl rule__AssemblyContext__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__AssemblyContext__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group__2"


    // $ANTLR start "rule__AssemblyContext__Group__2__Impl"
    // InternalBlatt2.g:1643:1: rule__AssemblyContext__Group__2__Impl : ( '{' ) ;
    public final void rule__AssemblyContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:1647:1: ( ( '{' ) )
            // InternalBlatt2.g:1648:1: ( '{' )
            {
            // InternalBlatt2.g:1648:1: ( '{' )
            // InternalBlatt2.g:1649:2: '{'
            {
             before(grammarAccess.getAssemblyContextAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getAssemblyContextAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group__2__Impl"


    // $ANTLR start "rule__AssemblyContext__Group__3"
    // InternalBlatt2.g:1658:1: rule__AssemblyContext__Group__3 : rule__AssemblyContext__Group__3__Impl rule__AssemblyContext__Group__4 ;
    public final void rule__AssemblyContext__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:1662:1: ( rule__AssemblyContext__Group__3__Impl rule__AssemblyContext__Group__4 )
            // InternalBlatt2.g:1663:2: rule__AssemblyContext__Group__3__Impl rule__AssemblyContext__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__AssemblyContext__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group__3"


    // $ANTLR start "rule__AssemblyContext__Group__3__Impl"
    // InternalBlatt2.g:1670:1: rule__AssemblyContext__Group__3__Impl : ( ( rule__AssemblyContext__Group_3__0 )? ) ;
    public final void rule__AssemblyContext__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:1674:1: ( ( ( rule__AssemblyContext__Group_3__0 )? ) )
            // InternalBlatt2.g:1675:1: ( ( rule__AssemblyContext__Group_3__0 )? )
            {
            // InternalBlatt2.g:1675:1: ( ( rule__AssemblyContext__Group_3__0 )? )
            // InternalBlatt2.g:1676:2: ( rule__AssemblyContext__Group_3__0 )?
            {
             before(grammarAccess.getAssemblyContextAccess().getGroup_3()); 
            // InternalBlatt2.g:1677:2: ( rule__AssemblyContext__Group_3__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalBlatt2.g:1677:3: rule__AssemblyContext__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AssemblyContext__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssemblyContextAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group__3__Impl"


    // $ANTLR start "rule__AssemblyContext__Group__4"
    // InternalBlatt2.g:1685:1: rule__AssemblyContext__Group__4 : rule__AssemblyContext__Group__4__Impl rule__AssemblyContext__Group__5 ;
    public final void rule__AssemblyContext__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:1689:1: ( rule__AssemblyContext__Group__4__Impl rule__AssemblyContext__Group__5 )
            // InternalBlatt2.g:1690:2: rule__AssemblyContext__Group__4__Impl rule__AssemblyContext__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__AssemblyContext__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group__4"


    // $ANTLR start "rule__AssemblyContext__Group__4__Impl"
    // InternalBlatt2.g:1697:1: rule__AssemblyContext__Group__4__Impl : ( 'allocationContext' ) ;
    public final void rule__AssemblyContext__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:1701:1: ( ( 'allocationContext' ) )
            // InternalBlatt2.g:1702:1: ( 'allocationContext' )
            {
            // InternalBlatt2.g:1702:1: ( 'allocationContext' )
            // InternalBlatt2.g:1703:2: 'allocationContext'
            {
             before(grammarAccess.getAssemblyContextAccess().getAllocationContextKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAssemblyContextAccess().getAllocationContextKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group__4__Impl"


    // $ANTLR start "rule__AssemblyContext__Group__5"
    // InternalBlatt2.g:1712:1: rule__AssemblyContext__Group__5 : rule__AssemblyContext__Group__5__Impl rule__AssemblyContext__Group__6 ;
    public final void rule__AssemblyContext__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:1716:1: ( rule__AssemblyContext__Group__5__Impl rule__AssemblyContext__Group__6 )
            // InternalBlatt2.g:1717:2: rule__AssemblyContext__Group__5__Impl rule__AssemblyContext__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__AssemblyContext__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group__5"


    // $ANTLR start "rule__AssemblyContext__Group__5__Impl"
    // InternalBlatt2.g:1724:1: rule__AssemblyContext__Group__5__Impl : ( ( rule__AssemblyContext__AllocationContextAssignment_5 ) ) ;
    public final void rule__AssemblyContext__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:1728:1: ( ( ( rule__AssemblyContext__AllocationContextAssignment_5 ) ) )
            // InternalBlatt2.g:1729:1: ( ( rule__AssemblyContext__AllocationContextAssignment_5 ) )
            {
            // InternalBlatt2.g:1729:1: ( ( rule__AssemblyContext__AllocationContextAssignment_5 ) )
            // InternalBlatt2.g:1730:2: ( rule__AssemblyContext__AllocationContextAssignment_5 )
            {
             before(grammarAccess.getAssemblyContextAccess().getAllocationContextAssignment_5()); 
            // InternalBlatt2.g:1731:2: ( rule__AssemblyContext__AllocationContextAssignment_5 )
            // InternalBlatt2.g:1731:3: rule__AssemblyContext__AllocationContextAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyContext__AllocationContextAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getAssemblyContextAccess().getAllocationContextAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group__5__Impl"


    // $ANTLR start "rule__AssemblyContext__Group__6"
    // InternalBlatt2.g:1739:1: rule__AssemblyContext__Group__6 : rule__AssemblyContext__Group__6__Impl rule__AssemblyContext__Group__7 ;
    public final void rule__AssemblyContext__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:1743:1: ( rule__AssemblyContext__Group__6__Impl rule__AssemblyContext__Group__7 )
            // InternalBlatt2.g:1744:2: rule__AssemblyContext__Group__6__Impl rule__AssemblyContext__Group__7
            {
            pushFollow(FOLLOW_15);
            rule__AssemblyContext__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group__6"


    // $ANTLR start "rule__AssemblyContext__Group__6__Impl"
    // InternalBlatt2.g:1751:1: rule__AssemblyContext__Group__6__Impl : ( ( rule__AssemblyContext__Group_6__0 )? ) ;
    public final void rule__AssemblyContext__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:1755:1: ( ( ( rule__AssemblyContext__Group_6__0 )? ) )
            // InternalBlatt2.g:1756:1: ( ( rule__AssemblyContext__Group_6__0 )? )
            {
            // InternalBlatt2.g:1756:1: ( ( rule__AssemblyContext__Group_6__0 )? )
            // InternalBlatt2.g:1757:2: ( rule__AssemblyContext__Group_6__0 )?
            {
             before(grammarAccess.getAssemblyContextAccess().getGroup_6()); 
            // InternalBlatt2.g:1758:2: ( rule__AssemblyContext__Group_6__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalBlatt2.g:1758:3: rule__AssemblyContext__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AssemblyContext__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssemblyContextAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group__6__Impl"


    // $ANTLR start "rule__AssemblyContext__Group__7"
    // InternalBlatt2.g:1766:1: rule__AssemblyContext__Group__7 : rule__AssemblyContext__Group__7__Impl rule__AssemblyContext__Group__8 ;
    public final void rule__AssemblyContext__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:1770:1: ( rule__AssemblyContext__Group__7__Impl rule__AssemblyContext__Group__8 )
            // InternalBlatt2.g:1771:2: rule__AssemblyContext__Group__7__Impl rule__AssemblyContext__Group__8
            {
            pushFollow(FOLLOW_15);
            rule__AssemblyContext__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group__7"


    // $ANTLR start "rule__AssemblyContext__Group__7__Impl"
    // InternalBlatt2.g:1778:1: rule__AssemblyContext__Group__7__Impl : ( ( rule__AssemblyContext__Group_7__0 )? ) ;
    public final void rule__AssemblyContext__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:1782:1: ( ( ( rule__AssemblyContext__Group_7__0 )? ) )
            // InternalBlatt2.g:1783:1: ( ( rule__AssemblyContext__Group_7__0 )? )
            {
            // InternalBlatt2.g:1783:1: ( ( rule__AssemblyContext__Group_7__0 )? )
            // InternalBlatt2.g:1784:2: ( rule__AssemblyContext__Group_7__0 )?
            {
             before(grammarAccess.getAssemblyContextAccess().getGroup_7()); 
            // InternalBlatt2.g:1785:2: ( rule__AssemblyContext__Group_7__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalBlatt2.g:1785:3: rule__AssemblyContext__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AssemblyContext__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssemblyContextAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group__7__Impl"


    // $ANTLR start "rule__AssemblyContext__Group__8"
    // InternalBlatt2.g:1793:1: rule__AssemblyContext__Group__8 : rule__AssemblyContext__Group__8__Impl ;
    public final void rule__AssemblyContext__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:1797:1: ( rule__AssemblyContext__Group__8__Impl )
            // InternalBlatt2.g:1798:2: rule__AssemblyContext__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group__8"


    // $ANTLR start "rule__AssemblyContext__Group__8__Impl"
    // InternalBlatt2.g:1804:1: rule__AssemblyContext__Group__8__Impl : ( '}' ) ;
    public final void rule__AssemblyContext__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:1808:1: ( ( '}' ) )
            // InternalBlatt2.g:1809:1: ( '}' )
            {
            // InternalBlatt2.g:1809:1: ( '}' )
            // InternalBlatt2.g:1810:2: '}'
            {
             before(grammarAccess.getAssemblyContextAccess().getRightCurlyBracketKeyword_8()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getAssemblyContextAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group__8__Impl"


    // $ANTLR start "rule__AssemblyContext__Group_3__0"
    // InternalBlatt2.g:1820:1: rule__AssemblyContext__Group_3__0 : rule__AssemblyContext__Group_3__0__Impl rule__AssemblyContext__Group_3__1 ;
    public final void rule__AssemblyContext__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:1824:1: ( rule__AssemblyContext__Group_3__0__Impl rule__AssemblyContext__Group_3__1 )
            // InternalBlatt2.g:1825:2: rule__AssemblyContext__Group_3__0__Impl rule__AssemblyContext__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__AssemblyContext__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group_3__0"


    // $ANTLR start "rule__AssemblyContext__Group_3__0__Impl"
    // InternalBlatt2.g:1832:1: rule__AssemblyContext__Group_3__0__Impl : ( 'requiredRole' ) ;
    public final void rule__AssemblyContext__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:1836:1: ( ( 'requiredRole' ) )
            // InternalBlatt2.g:1837:1: ( 'requiredRole' )
            {
            // InternalBlatt2.g:1837:1: ( 'requiredRole' )
            // InternalBlatt2.g:1838:2: 'requiredRole'
            {
             before(grammarAccess.getAssemblyContextAccess().getRequiredRoleKeyword_3_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAssemblyContextAccess().getRequiredRoleKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group_3__0__Impl"


    // $ANTLR start "rule__AssemblyContext__Group_3__1"
    // InternalBlatt2.g:1847:1: rule__AssemblyContext__Group_3__1 : rule__AssemblyContext__Group_3__1__Impl rule__AssemblyContext__Group_3__2 ;
    public final void rule__AssemblyContext__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:1851:1: ( rule__AssemblyContext__Group_3__1__Impl rule__AssemblyContext__Group_3__2 )
            // InternalBlatt2.g:1852:2: rule__AssemblyContext__Group_3__1__Impl rule__AssemblyContext__Group_3__2
            {
            pushFollow(FOLLOW_6);
            rule__AssemblyContext__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group_3__1"


    // $ANTLR start "rule__AssemblyContext__Group_3__1__Impl"
    // InternalBlatt2.g:1859:1: rule__AssemblyContext__Group_3__1__Impl : ( '(' ) ;
    public final void rule__AssemblyContext__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:1863:1: ( ( '(' ) )
            // InternalBlatt2.g:1864:1: ( '(' )
            {
            // InternalBlatt2.g:1864:1: ( '(' )
            // InternalBlatt2.g:1865:2: '('
            {
             before(grammarAccess.getAssemblyContextAccess().getLeftParenthesisKeyword_3_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getAssemblyContextAccess().getLeftParenthesisKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group_3__1__Impl"


    // $ANTLR start "rule__AssemblyContext__Group_3__2"
    // InternalBlatt2.g:1874:1: rule__AssemblyContext__Group_3__2 : rule__AssemblyContext__Group_3__2__Impl rule__AssemblyContext__Group_3__3 ;
    public final void rule__AssemblyContext__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:1878:1: ( rule__AssemblyContext__Group_3__2__Impl rule__AssemblyContext__Group_3__3 )
            // InternalBlatt2.g:1879:2: rule__AssemblyContext__Group_3__2__Impl rule__AssemblyContext__Group_3__3
            {
            pushFollow(FOLLOW_7);
            rule__AssemblyContext__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group_3__2"


    // $ANTLR start "rule__AssemblyContext__Group_3__2__Impl"
    // InternalBlatt2.g:1886:1: rule__AssemblyContext__Group_3__2__Impl : ( ( rule__AssemblyContext__RequiredRoleAssignment_3_2 ) ) ;
    public final void rule__AssemblyContext__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:1890:1: ( ( ( rule__AssemblyContext__RequiredRoleAssignment_3_2 ) ) )
            // InternalBlatt2.g:1891:1: ( ( rule__AssemblyContext__RequiredRoleAssignment_3_2 ) )
            {
            // InternalBlatt2.g:1891:1: ( ( rule__AssemblyContext__RequiredRoleAssignment_3_2 ) )
            // InternalBlatt2.g:1892:2: ( rule__AssemblyContext__RequiredRoleAssignment_3_2 )
            {
             before(grammarAccess.getAssemblyContextAccess().getRequiredRoleAssignment_3_2()); 
            // InternalBlatt2.g:1893:2: ( rule__AssemblyContext__RequiredRoleAssignment_3_2 )
            // InternalBlatt2.g:1893:3: rule__AssemblyContext__RequiredRoleAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyContext__RequiredRoleAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getAssemblyContextAccess().getRequiredRoleAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group_3__2__Impl"


    // $ANTLR start "rule__AssemblyContext__Group_3__3"
    // InternalBlatt2.g:1901:1: rule__AssemblyContext__Group_3__3 : rule__AssemblyContext__Group_3__3__Impl rule__AssemblyContext__Group_3__4 ;
    public final void rule__AssemblyContext__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:1905:1: ( rule__AssemblyContext__Group_3__3__Impl rule__AssemblyContext__Group_3__4 )
            // InternalBlatt2.g:1906:2: rule__AssemblyContext__Group_3__3__Impl rule__AssemblyContext__Group_3__4
            {
            pushFollow(FOLLOW_7);
            rule__AssemblyContext__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group_3__3"


    // $ANTLR start "rule__AssemblyContext__Group_3__3__Impl"
    // InternalBlatt2.g:1913:1: rule__AssemblyContext__Group_3__3__Impl : ( ( rule__AssemblyContext__Group_3_3__0 )* ) ;
    public final void rule__AssemblyContext__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:1917:1: ( ( ( rule__AssemblyContext__Group_3_3__0 )* ) )
            // InternalBlatt2.g:1918:1: ( ( rule__AssemblyContext__Group_3_3__0 )* )
            {
            // InternalBlatt2.g:1918:1: ( ( rule__AssemblyContext__Group_3_3__0 )* )
            // InternalBlatt2.g:1919:2: ( rule__AssemblyContext__Group_3_3__0 )*
            {
             before(grammarAccess.getAssemblyContextAccess().getGroup_3_3()); 
            // InternalBlatt2.g:1920:2: ( rule__AssemblyContext__Group_3_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==17) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalBlatt2.g:1920:3: rule__AssemblyContext__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__AssemblyContext__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getAssemblyContextAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group_3__3__Impl"


    // $ANTLR start "rule__AssemblyContext__Group_3__4"
    // InternalBlatt2.g:1928:1: rule__AssemblyContext__Group_3__4 : rule__AssemblyContext__Group_3__4__Impl ;
    public final void rule__AssemblyContext__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:1932:1: ( rule__AssemblyContext__Group_3__4__Impl )
            // InternalBlatt2.g:1933:2: rule__AssemblyContext__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group_3__4"


    // $ANTLR start "rule__AssemblyContext__Group_3__4__Impl"
    // InternalBlatt2.g:1939:1: rule__AssemblyContext__Group_3__4__Impl : ( ')' ) ;
    public final void rule__AssemblyContext__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:1943:1: ( ( ')' ) )
            // InternalBlatt2.g:1944:1: ( ')' )
            {
            // InternalBlatt2.g:1944:1: ( ')' )
            // InternalBlatt2.g:1945:2: ')'
            {
             before(grammarAccess.getAssemblyContextAccess().getRightParenthesisKeyword_3_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getAssemblyContextAccess().getRightParenthesisKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group_3__4__Impl"


    // $ANTLR start "rule__AssemblyContext__Group_3_3__0"
    // InternalBlatt2.g:1955:1: rule__AssemblyContext__Group_3_3__0 : rule__AssemblyContext__Group_3_3__0__Impl rule__AssemblyContext__Group_3_3__1 ;
    public final void rule__AssemblyContext__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:1959:1: ( rule__AssemblyContext__Group_3_3__0__Impl rule__AssemblyContext__Group_3_3__1 )
            // InternalBlatt2.g:1960:2: rule__AssemblyContext__Group_3_3__0__Impl rule__AssemblyContext__Group_3_3__1
            {
            pushFollow(FOLLOW_6);
            rule__AssemblyContext__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group_3_3__0"


    // $ANTLR start "rule__AssemblyContext__Group_3_3__0__Impl"
    // InternalBlatt2.g:1967:1: rule__AssemblyContext__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__AssemblyContext__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:1971:1: ( ( ',' ) )
            // InternalBlatt2.g:1972:1: ( ',' )
            {
            // InternalBlatt2.g:1972:1: ( ',' )
            // InternalBlatt2.g:1973:2: ','
            {
             before(grammarAccess.getAssemblyContextAccess().getCommaKeyword_3_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAssemblyContextAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group_3_3__0__Impl"


    // $ANTLR start "rule__AssemblyContext__Group_3_3__1"
    // InternalBlatt2.g:1982:1: rule__AssemblyContext__Group_3_3__1 : rule__AssemblyContext__Group_3_3__1__Impl ;
    public final void rule__AssemblyContext__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:1986:1: ( rule__AssemblyContext__Group_3_3__1__Impl )
            // InternalBlatt2.g:1987:2: rule__AssemblyContext__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group_3_3__1"


    // $ANTLR start "rule__AssemblyContext__Group_3_3__1__Impl"
    // InternalBlatt2.g:1993:1: rule__AssemblyContext__Group_3_3__1__Impl : ( ( rule__AssemblyContext__RequiredRoleAssignment_3_3_1 ) ) ;
    public final void rule__AssemblyContext__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:1997:1: ( ( ( rule__AssemblyContext__RequiredRoleAssignment_3_3_1 ) ) )
            // InternalBlatt2.g:1998:1: ( ( rule__AssemblyContext__RequiredRoleAssignment_3_3_1 ) )
            {
            // InternalBlatt2.g:1998:1: ( ( rule__AssemblyContext__RequiredRoleAssignment_3_3_1 ) )
            // InternalBlatt2.g:1999:2: ( rule__AssemblyContext__RequiredRoleAssignment_3_3_1 )
            {
             before(grammarAccess.getAssemblyContextAccess().getRequiredRoleAssignment_3_3_1()); 
            // InternalBlatt2.g:2000:2: ( rule__AssemblyContext__RequiredRoleAssignment_3_3_1 )
            // InternalBlatt2.g:2000:3: rule__AssemblyContext__RequiredRoleAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyContext__RequiredRoleAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAssemblyContextAccess().getRequiredRoleAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group_3_3__1__Impl"


    // $ANTLR start "rule__AssemblyContext__Group_6__0"
    // InternalBlatt2.g:2009:1: rule__AssemblyContext__Group_6__0 : rule__AssemblyContext__Group_6__0__Impl rule__AssemblyContext__Group_6__1 ;
    public final void rule__AssemblyContext__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:2013:1: ( rule__AssemblyContext__Group_6__0__Impl rule__AssemblyContext__Group_6__1 )
            // InternalBlatt2.g:2014:2: rule__AssemblyContext__Group_6__0__Impl rule__AssemblyContext__Group_6__1
            {
            pushFollow(FOLLOW_3);
            rule__AssemblyContext__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group_6__0"


    // $ANTLR start "rule__AssemblyContext__Group_6__0__Impl"
    // InternalBlatt2.g:2021:1: rule__AssemblyContext__Group_6__0__Impl : ( 'providedRole' ) ;
    public final void rule__AssemblyContext__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:2025:1: ( ( 'providedRole' ) )
            // InternalBlatt2.g:2026:1: ( 'providedRole' )
            {
            // InternalBlatt2.g:2026:1: ( 'providedRole' )
            // InternalBlatt2.g:2027:2: 'providedRole'
            {
             before(grammarAccess.getAssemblyContextAccess().getProvidedRoleKeyword_6_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAssemblyContextAccess().getProvidedRoleKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group_6__0__Impl"


    // $ANTLR start "rule__AssemblyContext__Group_6__1"
    // InternalBlatt2.g:2036:1: rule__AssemblyContext__Group_6__1 : rule__AssemblyContext__Group_6__1__Impl rule__AssemblyContext__Group_6__2 ;
    public final void rule__AssemblyContext__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:2040:1: ( rule__AssemblyContext__Group_6__1__Impl rule__AssemblyContext__Group_6__2 )
            // InternalBlatt2.g:2041:2: rule__AssemblyContext__Group_6__1__Impl rule__AssemblyContext__Group_6__2
            {
            pushFollow(FOLLOW_16);
            rule__AssemblyContext__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group_6__1"


    // $ANTLR start "rule__AssemblyContext__Group_6__1__Impl"
    // InternalBlatt2.g:2048:1: rule__AssemblyContext__Group_6__1__Impl : ( '{' ) ;
    public final void rule__AssemblyContext__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:2052:1: ( ( '{' ) )
            // InternalBlatt2.g:2053:1: ( '{' )
            {
            // InternalBlatt2.g:2053:1: ( '{' )
            // InternalBlatt2.g:2054:2: '{'
            {
             before(grammarAccess.getAssemblyContextAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getAssemblyContextAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group_6__1__Impl"


    // $ANTLR start "rule__AssemblyContext__Group_6__2"
    // InternalBlatt2.g:2063:1: rule__AssemblyContext__Group_6__2 : rule__AssemblyContext__Group_6__2__Impl rule__AssemblyContext__Group_6__3 ;
    public final void rule__AssemblyContext__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:2067:1: ( rule__AssemblyContext__Group_6__2__Impl rule__AssemblyContext__Group_6__3 )
            // InternalBlatt2.g:2068:2: rule__AssemblyContext__Group_6__2__Impl rule__AssemblyContext__Group_6__3
            {
            pushFollow(FOLLOW_11);
            rule__AssemblyContext__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group_6__2"


    // $ANTLR start "rule__AssemblyContext__Group_6__2__Impl"
    // InternalBlatt2.g:2075:1: rule__AssemblyContext__Group_6__2__Impl : ( ( rule__AssemblyContext__ProvidedRoleAssignment_6_2 ) ) ;
    public final void rule__AssemblyContext__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:2079:1: ( ( ( rule__AssemblyContext__ProvidedRoleAssignment_6_2 ) ) )
            // InternalBlatt2.g:2080:1: ( ( rule__AssemblyContext__ProvidedRoleAssignment_6_2 ) )
            {
            // InternalBlatt2.g:2080:1: ( ( rule__AssemblyContext__ProvidedRoleAssignment_6_2 ) )
            // InternalBlatt2.g:2081:2: ( rule__AssemblyContext__ProvidedRoleAssignment_6_2 )
            {
             before(grammarAccess.getAssemblyContextAccess().getProvidedRoleAssignment_6_2()); 
            // InternalBlatt2.g:2082:2: ( rule__AssemblyContext__ProvidedRoleAssignment_6_2 )
            // InternalBlatt2.g:2082:3: rule__AssemblyContext__ProvidedRoleAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyContext__ProvidedRoleAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getAssemblyContextAccess().getProvidedRoleAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group_6__2__Impl"


    // $ANTLR start "rule__AssemblyContext__Group_6__3"
    // InternalBlatt2.g:2090:1: rule__AssemblyContext__Group_6__3 : rule__AssemblyContext__Group_6__3__Impl rule__AssemblyContext__Group_6__4 ;
    public final void rule__AssemblyContext__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:2094:1: ( rule__AssemblyContext__Group_6__3__Impl rule__AssemblyContext__Group_6__4 )
            // InternalBlatt2.g:2095:2: rule__AssemblyContext__Group_6__3__Impl rule__AssemblyContext__Group_6__4
            {
            pushFollow(FOLLOW_11);
            rule__AssemblyContext__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group_6__3"


    // $ANTLR start "rule__AssemblyContext__Group_6__3__Impl"
    // InternalBlatt2.g:2102:1: rule__AssemblyContext__Group_6__3__Impl : ( ( rule__AssemblyContext__Group_6_3__0 )* ) ;
    public final void rule__AssemblyContext__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:2106:1: ( ( ( rule__AssemblyContext__Group_6_3__0 )* ) )
            // InternalBlatt2.g:2107:1: ( ( rule__AssemblyContext__Group_6_3__0 )* )
            {
            // InternalBlatt2.g:2107:1: ( ( rule__AssemblyContext__Group_6_3__0 )* )
            // InternalBlatt2.g:2108:2: ( rule__AssemblyContext__Group_6_3__0 )*
            {
             before(grammarAccess.getAssemblyContextAccess().getGroup_6_3()); 
            // InternalBlatt2.g:2109:2: ( rule__AssemblyContext__Group_6_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==17) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalBlatt2.g:2109:3: rule__AssemblyContext__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__AssemblyContext__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getAssemblyContextAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group_6__3__Impl"


    // $ANTLR start "rule__AssemblyContext__Group_6__4"
    // InternalBlatt2.g:2117:1: rule__AssemblyContext__Group_6__4 : rule__AssemblyContext__Group_6__4__Impl ;
    public final void rule__AssemblyContext__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:2121:1: ( rule__AssemblyContext__Group_6__4__Impl )
            // InternalBlatt2.g:2122:2: rule__AssemblyContext__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group_6__4"


    // $ANTLR start "rule__AssemblyContext__Group_6__4__Impl"
    // InternalBlatt2.g:2128:1: rule__AssemblyContext__Group_6__4__Impl : ( '}' ) ;
    public final void rule__AssemblyContext__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:2132:1: ( ( '}' ) )
            // InternalBlatt2.g:2133:1: ( '}' )
            {
            // InternalBlatt2.g:2133:1: ( '}' )
            // InternalBlatt2.g:2134:2: '}'
            {
             before(grammarAccess.getAssemblyContextAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getAssemblyContextAccess().getRightCurlyBracketKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group_6__4__Impl"


    // $ANTLR start "rule__AssemblyContext__Group_6_3__0"
    // InternalBlatt2.g:2144:1: rule__AssemblyContext__Group_6_3__0 : rule__AssemblyContext__Group_6_3__0__Impl rule__AssemblyContext__Group_6_3__1 ;
    public final void rule__AssemblyContext__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:2148:1: ( rule__AssemblyContext__Group_6_3__0__Impl rule__AssemblyContext__Group_6_3__1 )
            // InternalBlatt2.g:2149:2: rule__AssemblyContext__Group_6_3__0__Impl rule__AssemblyContext__Group_6_3__1
            {
            pushFollow(FOLLOW_16);
            rule__AssemblyContext__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group_6_3__0"


    // $ANTLR start "rule__AssemblyContext__Group_6_3__0__Impl"
    // InternalBlatt2.g:2156:1: rule__AssemblyContext__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__AssemblyContext__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:2160:1: ( ( ',' ) )
            // InternalBlatt2.g:2161:1: ( ',' )
            {
            // InternalBlatt2.g:2161:1: ( ',' )
            // InternalBlatt2.g:2162:2: ','
            {
             before(grammarAccess.getAssemblyContextAccess().getCommaKeyword_6_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAssemblyContextAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group_6_3__0__Impl"


    // $ANTLR start "rule__AssemblyContext__Group_6_3__1"
    // InternalBlatt2.g:2171:1: rule__AssemblyContext__Group_6_3__1 : rule__AssemblyContext__Group_6_3__1__Impl ;
    public final void rule__AssemblyContext__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:2175:1: ( rule__AssemblyContext__Group_6_3__1__Impl )
            // InternalBlatt2.g:2176:2: rule__AssemblyContext__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group_6_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group_6_3__1"


    // $ANTLR start "rule__AssemblyContext__Group_6_3__1__Impl"
    // InternalBlatt2.g:2182:1: rule__AssemblyContext__Group_6_3__1__Impl : ( ( rule__AssemblyContext__ProvidedRoleAssignment_6_3_1 ) ) ;
    public final void rule__AssemblyContext__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:2186:1: ( ( ( rule__AssemblyContext__ProvidedRoleAssignment_6_3_1 ) ) )
            // InternalBlatt2.g:2187:1: ( ( rule__AssemblyContext__ProvidedRoleAssignment_6_3_1 ) )
            {
            // InternalBlatt2.g:2187:1: ( ( rule__AssemblyContext__ProvidedRoleAssignment_6_3_1 ) )
            // InternalBlatt2.g:2188:2: ( rule__AssemblyContext__ProvidedRoleAssignment_6_3_1 )
            {
             before(grammarAccess.getAssemblyContextAccess().getProvidedRoleAssignment_6_3_1()); 
            // InternalBlatt2.g:2189:2: ( rule__AssemblyContext__ProvidedRoleAssignment_6_3_1 )
            // InternalBlatt2.g:2189:3: rule__AssemblyContext__ProvidedRoleAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyContext__ProvidedRoleAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAssemblyContextAccess().getProvidedRoleAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group_6_3__1__Impl"


    // $ANTLR start "rule__AssemblyContext__Group_7__0"
    // InternalBlatt2.g:2198:1: rule__AssemblyContext__Group_7__0 : rule__AssemblyContext__Group_7__0__Impl rule__AssemblyContext__Group_7__1 ;
    public final void rule__AssemblyContext__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:2202:1: ( rule__AssemblyContext__Group_7__0__Impl rule__AssemblyContext__Group_7__1 )
            // InternalBlatt2.g:2203:2: rule__AssemblyContext__Group_7__0__Impl rule__AssemblyContext__Group_7__1
            {
            pushFollow(FOLLOW_3);
            rule__AssemblyContext__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group_7__0"


    // $ANTLR start "rule__AssemblyContext__Group_7__0__Impl"
    // InternalBlatt2.g:2210:1: rule__AssemblyContext__Group_7__0__Impl : ( 'component' ) ;
    public final void rule__AssemblyContext__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:2214:1: ( ( 'component' ) )
            // InternalBlatt2.g:2215:1: ( 'component' )
            {
            // InternalBlatt2.g:2215:1: ( 'component' )
            // InternalBlatt2.g:2216:2: 'component'
            {
             before(grammarAccess.getAssemblyContextAccess().getComponentKeyword_7_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAssemblyContextAccess().getComponentKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group_7__0__Impl"


    // $ANTLR start "rule__AssemblyContext__Group_7__1"
    // InternalBlatt2.g:2225:1: rule__AssemblyContext__Group_7__1 : rule__AssemblyContext__Group_7__1__Impl rule__AssemblyContext__Group_7__2 ;
    public final void rule__AssemblyContext__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:2229:1: ( rule__AssemblyContext__Group_7__1__Impl rule__AssemblyContext__Group_7__2 )
            // InternalBlatt2.g:2230:2: rule__AssemblyContext__Group_7__1__Impl rule__AssemblyContext__Group_7__2
            {
            pushFollow(FOLLOW_17);
            rule__AssemblyContext__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group_7__1"


    // $ANTLR start "rule__AssemblyContext__Group_7__1__Impl"
    // InternalBlatt2.g:2237:1: rule__AssemblyContext__Group_7__1__Impl : ( '{' ) ;
    public final void rule__AssemblyContext__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:2241:1: ( ( '{' ) )
            // InternalBlatt2.g:2242:1: ( '{' )
            {
            // InternalBlatt2.g:2242:1: ( '{' )
            // InternalBlatt2.g:2243:2: '{'
            {
             before(grammarAccess.getAssemblyContextAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getAssemblyContextAccess().getLeftCurlyBracketKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group_7__1__Impl"


    // $ANTLR start "rule__AssemblyContext__Group_7__2"
    // InternalBlatt2.g:2252:1: rule__AssemblyContext__Group_7__2 : rule__AssemblyContext__Group_7__2__Impl rule__AssemblyContext__Group_7__3 ;
    public final void rule__AssemblyContext__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:2256:1: ( rule__AssemblyContext__Group_7__2__Impl rule__AssemblyContext__Group_7__3 )
            // InternalBlatt2.g:2257:2: rule__AssemblyContext__Group_7__2__Impl rule__AssemblyContext__Group_7__3
            {
            pushFollow(FOLLOW_11);
            rule__AssemblyContext__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group_7__2"


    // $ANTLR start "rule__AssemblyContext__Group_7__2__Impl"
    // InternalBlatt2.g:2264:1: rule__AssemblyContext__Group_7__2__Impl : ( ( rule__AssemblyContext__ComponentAssignment_7_2 ) ) ;
    public final void rule__AssemblyContext__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:2268:1: ( ( ( rule__AssemblyContext__ComponentAssignment_7_2 ) ) )
            // InternalBlatt2.g:2269:1: ( ( rule__AssemblyContext__ComponentAssignment_7_2 ) )
            {
            // InternalBlatt2.g:2269:1: ( ( rule__AssemblyContext__ComponentAssignment_7_2 ) )
            // InternalBlatt2.g:2270:2: ( rule__AssemblyContext__ComponentAssignment_7_2 )
            {
             before(grammarAccess.getAssemblyContextAccess().getComponentAssignment_7_2()); 
            // InternalBlatt2.g:2271:2: ( rule__AssemblyContext__ComponentAssignment_7_2 )
            // InternalBlatt2.g:2271:3: rule__AssemblyContext__ComponentAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyContext__ComponentAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getAssemblyContextAccess().getComponentAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group_7__2__Impl"


    // $ANTLR start "rule__AssemblyContext__Group_7__3"
    // InternalBlatt2.g:2279:1: rule__AssemblyContext__Group_7__3 : rule__AssemblyContext__Group_7__3__Impl rule__AssemblyContext__Group_7__4 ;
    public final void rule__AssemblyContext__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:2283:1: ( rule__AssemblyContext__Group_7__3__Impl rule__AssemblyContext__Group_7__4 )
            // InternalBlatt2.g:2284:2: rule__AssemblyContext__Group_7__3__Impl rule__AssemblyContext__Group_7__4
            {
            pushFollow(FOLLOW_11);
            rule__AssemblyContext__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group_7__3"


    // $ANTLR start "rule__AssemblyContext__Group_7__3__Impl"
    // InternalBlatt2.g:2291:1: rule__AssemblyContext__Group_7__3__Impl : ( ( rule__AssemblyContext__Group_7_3__0 )* ) ;
    public final void rule__AssemblyContext__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:2295:1: ( ( ( rule__AssemblyContext__Group_7_3__0 )* ) )
            // InternalBlatt2.g:2296:1: ( ( rule__AssemblyContext__Group_7_3__0 )* )
            {
            // InternalBlatt2.g:2296:1: ( ( rule__AssemblyContext__Group_7_3__0 )* )
            // InternalBlatt2.g:2297:2: ( rule__AssemblyContext__Group_7_3__0 )*
            {
             before(grammarAccess.getAssemblyContextAccess().getGroup_7_3()); 
            // InternalBlatt2.g:2298:2: ( rule__AssemblyContext__Group_7_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==17) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalBlatt2.g:2298:3: rule__AssemblyContext__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__AssemblyContext__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getAssemblyContextAccess().getGroup_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group_7__3__Impl"


    // $ANTLR start "rule__AssemblyContext__Group_7__4"
    // InternalBlatt2.g:2306:1: rule__AssemblyContext__Group_7__4 : rule__AssemblyContext__Group_7__4__Impl ;
    public final void rule__AssemblyContext__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:2310:1: ( rule__AssemblyContext__Group_7__4__Impl )
            // InternalBlatt2.g:2311:2: rule__AssemblyContext__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group_7__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group_7__4"


    // $ANTLR start "rule__AssemblyContext__Group_7__4__Impl"
    // InternalBlatt2.g:2317:1: rule__AssemblyContext__Group_7__4__Impl : ( '}' ) ;
    public final void rule__AssemblyContext__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:2321:1: ( ( '}' ) )
            // InternalBlatt2.g:2322:1: ( '}' )
            {
            // InternalBlatt2.g:2322:1: ( '}' )
            // InternalBlatt2.g:2323:2: '}'
            {
             before(grammarAccess.getAssemblyContextAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getAssemblyContextAccess().getRightCurlyBracketKeyword_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group_7__4__Impl"


    // $ANTLR start "rule__AssemblyContext__Group_7_3__0"
    // InternalBlatt2.g:2333:1: rule__AssemblyContext__Group_7_3__0 : rule__AssemblyContext__Group_7_3__0__Impl rule__AssemblyContext__Group_7_3__1 ;
    public final void rule__AssemblyContext__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:2337:1: ( rule__AssemblyContext__Group_7_3__0__Impl rule__AssemblyContext__Group_7_3__1 )
            // InternalBlatt2.g:2338:2: rule__AssemblyContext__Group_7_3__0__Impl rule__AssemblyContext__Group_7_3__1
            {
            pushFollow(FOLLOW_17);
            rule__AssemblyContext__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group_7_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group_7_3__0"


    // $ANTLR start "rule__AssemblyContext__Group_7_3__0__Impl"
    // InternalBlatt2.g:2345:1: rule__AssemblyContext__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__AssemblyContext__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:2349:1: ( ( ',' ) )
            // InternalBlatt2.g:2350:1: ( ',' )
            {
            // InternalBlatt2.g:2350:1: ( ',' )
            // InternalBlatt2.g:2351:2: ','
            {
             before(grammarAccess.getAssemblyContextAccess().getCommaKeyword_7_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAssemblyContextAccess().getCommaKeyword_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group_7_3__0__Impl"


    // $ANTLR start "rule__AssemblyContext__Group_7_3__1"
    // InternalBlatt2.g:2360:1: rule__AssemblyContext__Group_7_3__1 : rule__AssemblyContext__Group_7_3__1__Impl ;
    public final void rule__AssemblyContext__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:2364:1: ( rule__AssemblyContext__Group_7_3__1__Impl )
            // InternalBlatt2.g:2365:2: rule__AssemblyContext__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group_7_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group_7_3__1"


    // $ANTLR start "rule__AssemblyContext__Group_7_3__1__Impl"
    // InternalBlatt2.g:2371:1: rule__AssemblyContext__Group_7_3__1__Impl : ( ( rule__AssemblyContext__ComponentAssignment_7_3_1 ) ) ;
    public final void rule__AssemblyContext__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:2375:1: ( ( ( rule__AssemblyContext__ComponentAssignment_7_3_1 ) ) )
            // InternalBlatt2.g:2376:1: ( ( rule__AssemblyContext__ComponentAssignment_7_3_1 ) )
            {
            // InternalBlatt2.g:2376:1: ( ( rule__AssemblyContext__ComponentAssignment_7_3_1 ) )
            // InternalBlatt2.g:2377:2: ( rule__AssemblyContext__ComponentAssignment_7_3_1 )
            {
             before(grammarAccess.getAssemblyContextAccess().getComponentAssignment_7_3_1()); 
            // InternalBlatt2.g:2378:2: ( rule__AssemblyContext__ComponentAssignment_7_3_1 )
            // InternalBlatt2.g:2378:3: rule__AssemblyContext__ComponentAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyContext__ComponentAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAssemblyContextAccess().getComponentAssignment_7_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group_7_3__1__Impl"


    // $ANTLR start "rule__Role__Group__0"
    // InternalBlatt2.g:2387:1: rule__Role__Group__0 : rule__Role__Group__0__Impl rule__Role__Group__1 ;
    public final void rule__Role__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:2391:1: ( rule__Role__Group__0__Impl rule__Role__Group__1 )
            // InternalBlatt2.g:2392:2: rule__Role__Group__0__Impl rule__Role__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Role__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__0"


    // $ANTLR start "rule__Role__Group__0__Impl"
    // InternalBlatt2.g:2399:1: rule__Role__Group__0__Impl : ( () ) ;
    public final void rule__Role__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:2403:1: ( ( () ) )
            // InternalBlatt2.g:2404:1: ( () )
            {
            // InternalBlatt2.g:2404:1: ( () )
            // InternalBlatt2.g:2405:2: ()
            {
             before(grammarAccess.getRoleAccess().getRoleAction_0()); 
            // InternalBlatt2.g:2406:2: ()
            // InternalBlatt2.g:2406:3: 
            {
            }

             after(grammarAccess.getRoleAccess().getRoleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__0__Impl"


    // $ANTLR start "rule__Role__Group__1"
    // InternalBlatt2.g:2414:1: rule__Role__Group__1 : rule__Role__Group__1__Impl ;
    public final void rule__Role__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:2418:1: ( rule__Role__Group__1__Impl )
            // InternalBlatt2.g:2419:2: rule__Role__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Role__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__1"


    // $ANTLR start "rule__Role__Group__1__Impl"
    // InternalBlatt2.g:2425:1: rule__Role__Group__1__Impl : ( 'Role' ) ;
    public final void rule__Role__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:2429:1: ( ( 'Role' ) )
            // InternalBlatt2.g:2430:1: ( 'Role' )
            {
            // InternalBlatt2.g:2430:1: ( 'Role' )
            // InternalBlatt2.g:2431:2: 'Role'
            {
             before(grammarAccess.getRoleAccess().getRoleKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getRoleKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__1__Impl"


    // $ANTLR start "rule__Component_Impl__Group__0"
    // InternalBlatt2.g:2441:1: rule__Component_Impl__Group__0 : rule__Component_Impl__Group__0__Impl rule__Component_Impl__Group__1 ;
    public final void rule__Component_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:2445:1: ( rule__Component_Impl__Group__0__Impl rule__Component_Impl__Group__1 )
            // InternalBlatt2.g:2446:2: rule__Component_Impl__Group__0__Impl rule__Component_Impl__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Component_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__0"


    // $ANTLR start "rule__Component_Impl__Group__0__Impl"
    // InternalBlatt2.g:2453:1: rule__Component_Impl__Group__0__Impl : ( 'Component' ) ;
    public final void rule__Component_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:2457:1: ( ( 'Component' ) )
            // InternalBlatt2.g:2458:1: ( 'Component' )
            {
            // InternalBlatt2.g:2458:1: ( 'Component' )
            // InternalBlatt2.g:2459:2: 'Component'
            {
             before(grammarAccess.getComponent_ImplAccess().getComponentKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getComponent_ImplAccess().getComponentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__0__Impl"


    // $ANTLR start "rule__Component_Impl__Group__1"
    // InternalBlatt2.g:2468:1: rule__Component_Impl__Group__1 : rule__Component_Impl__Group__1__Impl rule__Component_Impl__Group__2 ;
    public final void rule__Component_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:2472:1: ( rule__Component_Impl__Group__1__Impl rule__Component_Impl__Group__2 )
            // InternalBlatt2.g:2473:2: rule__Component_Impl__Group__1__Impl rule__Component_Impl__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Component_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__1"


    // $ANTLR start "rule__Component_Impl__Group__1__Impl"
    // InternalBlatt2.g:2480:1: rule__Component_Impl__Group__1__Impl : ( ( rule__Component_Impl__NameAssignment_1 ) ) ;
    public final void rule__Component_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:2484:1: ( ( ( rule__Component_Impl__NameAssignment_1 ) ) )
            // InternalBlatt2.g:2485:1: ( ( rule__Component_Impl__NameAssignment_1 ) )
            {
            // InternalBlatt2.g:2485:1: ( ( rule__Component_Impl__NameAssignment_1 ) )
            // InternalBlatt2.g:2486:2: ( rule__Component_Impl__NameAssignment_1 )
            {
             before(grammarAccess.getComponent_ImplAccess().getNameAssignment_1()); 
            // InternalBlatt2.g:2487:2: ( rule__Component_Impl__NameAssignment_1 )
            // InternalBlatt2.g:2487:3: rule__Component_Impl__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Component_Impl__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComponent_ImplAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__1__Impl"


    // $ANTLR start "rule__Component_Impl__Group__2"
    // InternalBlatt2.g:2495:1: rule__Component_Impl__Group__2 : rule__Component_Impl__Group__2__Impl rule__Component_Impl__Group__3 ;
    public final void rule__Component_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:2499:1: ( rule__Component_Impl__Group__2__Impl rule__Component_Impl__Group__3 )
            // InternalBlatt2.g:2500:2: rule__Component_Impl__Group__2__Impl rule__Component_Impl__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Component_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__2"


    // $ANTLR start "rule__Component_Impl__Group__2__Impl"
    // InternalBlatt2.g:2507:1: rule__Component_Impl__Group__2__Impl : ( '{' ) ;
    public final void rule__Component_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:2511:1: ( ( '{' ) )
            // InternalBlatt2.g:2512:1: ( '{' )
            {
            // InternalBlatt2.g:2512:1: ( '{' )
            // InternalBlatt2.g:2513:2: '{'
            {
             before(grammarAccess.getComponent_ImplAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getComponent_ImplAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__2__Impl"


    // $ANTLR start "rule__Component_Impl__Group__3"
    // InternalBlatt2.g:2522:1: rule__Component_Impl__Group__3 : rule__Component_Impl__Group__3__Impl rule__Component_Impl__Group__4 ;
    public final void rule__Component_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:2526:1: ( rule__Component_Impl__Group__3__Impl rule__Component_Impl__Group__4 )
            // InternalBlatt2.g:2527:2: rule__Component_Impl__Group__3__Impl rule__Component_Impl__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Component_Impl__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__3"


    // $ANTLR start "rule__Component_Impl__Group__3__Impl"
    // InternalBlatt2.g:2534:1: rule__Component_Impl__Group__3__Impl : ( ( rule__Component_Impl__Group_3__0 )? ) ;
    public final void rule__Component_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:2538:1: ( ( ( rule__Component_Impl__Group_3__0 )? ) )
            // InternalBlatt2.g:2539:1: ( ( rule__Component_Impl__Group_3__0 )? )
            {
            // InternalBlatt2.g:2539:1: ( ( rule__Component_Impl__Group_3__0 )? )
            // InternalBlatt2.g:2540:2: ( rule__Component_Impl__Group_3__0 )?
            {
             before(grammarAccess.getComponent_ImplAccess().getGroup_3()); 
            // InternalBlatt2.g:2541:2: ( rule__Component_Impl__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==31) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalBlatt2.g:2541:3: rule__Component_Impl__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component_Impl__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponent_ImplAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__3__Impl"


    // $ANTLR start "rule__Component_Impl__Group__4"
    // InternalBlatt2.g:2549:1: rule__Component_Impl__Group__4 : rule__Component_Impl__Group__4__Impl rule__Component_Impl__Group__5 ;
    public final void rule__Component_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:2553:1: ( rule__Component_Impl__Group__4__Impl rule__Component_Impl__Group__5 )
            // InternalBlatt2.g:2554:2: rule__Component_Impl__Group__4__Impl rule__Component_Impl__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Component_Impl__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__4"


    // $ANTLR start "rule__Component_Impl__Group__4__Impl"
    // InternalBlatt2.g:2561:1: rule__Component_Impl__Group__4__Impl : ( 'requiredService' ) ;
    public final void rule__Component_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:2565:1: ( ( 'requiredService' ) )
            // InternalBlatt2.g:2566:1: ( 'requiredService' )
            {
            // InternalBlatt2.g:2566:1: ( 'requiredService' )
            // InternalBlatt2.g:2567:2: 'requiredService'
            {
             before(grammarAccess.getComponent_ImplAccess().getRequiredServiceKeyword_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getComponent_ImplAccess().getRequiredServiceKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__4__Impl"


    // $ANTLR start "rule__Component_Impl__Group__5"
    // InternalBlatt2.g:2576:1: rule__Component_Impl__Group__5 : rule__Component_Impl__Group__5__Impl rule__Component_Impl__Group__6 ;
    public final void rule__Component_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:2580:1: ( rule__Component_Impl__Group__5__Impl rule__Component_Impl__Group__6 )
            // InternalBlatt2.g:2581:2: rule__Component_Impl__Group__5__Impl rule__Component_Impl__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Component_Impl__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__5"


    // $ANTLR start "rule__Component_Impl__Group__5__Impl"
    // InternalBlatt2.g:2588:1: rule__Component_Impl__Group__5__Impl : ( '(' ) ;
    public final void rule__Component_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:2592:1: ( ( '(' ) )
            // InternalBlatt2.g:2593:1: ( '(' )
            {
            // InternalBlatt2.g:2593:1: ( '(' )
            // InternalBlatt2.g:2594:2: '('
            {
             before(grammarAccess.getComponent_ImplAccess().getLeftParenthesisKeyword_5()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getComponent_ImplAccess().getLeftParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__5__Impl"


    // $ANTLR start "rule__Component_Impl__Group__6"
    // InternalBlatt2.g:2603:1: rule__Component_Impl__Group__6 : rule__Component_Impl__Group__6__Impl rule__Component_Impl__Group__7 ;
    public final void rule__Component_Impl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:2607:1: ( rule__Component_Impl__Group__6__Impl rule__Component_Impl__Group__7 )
            // InternalBlatt2.g:2608:2: rule__Component_Impl__Group__6__Impl rule__Component_Impl__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__Component_Impl__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__6"


    // $ANTLR start "rule__Component_Impl__Group__6__Impl"
    // InternalBlatt2.g:2615:1: rule__Component_Impl__Group__6__Impl : ( ( rule__Component_Impl__RequiredServiceAssignment_6 ) ) ;
    public final void rule__Component_Impl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:2619:1: ( ( ( rule__Component_Impl__RequiredServiceAssignment_6 ) ) )
            // InternalBlatt2.g:2620:1: ( ( rule__Component_Impl__RequiredServiceAssignment_6 ) )
            {
            // InternalBlatt2.g:2620:1: ( ( rule__Component_Impl__RequiredServiceAssignment_6 ) )
            // InternalBlatt2.g:2621:2: ( rule__Component_Impl__RequiredServiceAssignment_6 )
            {
             before(grammarAccess.getComponent_ImplAccess().getRequiredServiceAssignment_6()); 
            // InternalBlatt2.g:2622:2: ( rule__Component_Impl__RequiredServiceAssignment_6 )
            // InternalBlatt2.g:2622:3: rule__Component_Impl__RequiredServiceAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Component_Impl__RequiredServiceAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getComponent_ImplAccess().getRequiredServiceAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__6__Impl"


    // $ANTLR start "rule__Component_Impl__Group__7"
    // InternalBlatt2.g:2630:1: rule__Component_Impl__Group__7 : rule__Component_Impl__Group__7__Impl rule__Component_Impl__Group__8 ;
    public final void rule__Component_Impl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:2634:1: ( rule__Component_Impl__Group__7__Impl rule__Component_Impl__Group__8 )
            // InternalBlatt2.g:2635:2: rule__Component_Impl__Group__7__Impl rule__Component_Impl__Group__8
            {
            pushFollow(FOLLOW_7);
            rule__Component_Impl__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__7"


    // $ANTLR start "rule__Component_Impl__Group__7__Impl"
    // InternalBlatt2.g:2642:1: rule__Component_Impl__Group__7__Impl : ( ( rule__Component_Impl__Group_7__0 )* ) ;
    public final void rule__Component_Impl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:2646:1: ( ( ( rule__Component_Impl__Group_7__0 )* ) )
            // InternalBlatt2.g:2647:1: ( ( rule__Component_Impl__Group_7__0 )* )
            {
            // InternalBlatt2.g:2647:1: ( ( rule__Component_Impl__Group_7__0 )* )
            // InternalBlatt2.g:2648:2: ( rule__Component_Impl__Group_7__0 )*
            {
             before(grammarAccess.getComponent_ImplAccess().getGroup_7()); 
            // InternalBlatt2.g:2649:2: ( rule__Component_Impl__Group_7__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==17) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalBlatt2.g:2649:3: rule__Component_Impl__Group_7__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Component_Impl__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getComponent_ImplAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__7__Impl"


    // $ANTLR start "rule__Component_Impl__Group__8"
    // InternalBlatt2.g:2657:1: rule__Component_Impl__Group__8 : rule__Component_Impl__Group__8__Impl rule__Component_Impl__Group__9 ;
    public final void rule__Component_Impl__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:2661:1: ( rule__Component_Impl__Group__8__Impl rule__Component_Impl__Group__9 )
            // InternalBlatt2.g:2662:2: rule__Component_Impl__Group__8__Impl rule__Component_Impl__Group__9
            {
            pushFollow(FOLLOW_19);
            rule__Component_Impl__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__8"


    // $ANTLR start "rule__Component_Impl__Group__8__Impl"
    // InternalBlatt2.g:2669:1: rule__Component_Impl__Group__8__Impl : ( ')' ) ;
    public final void rule__Component_Impl__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:2673:1: ( ( ')' ) )
            // InternalBlatt2.g:2674:1: ( ')' )
            {
            // InternalBlatt2.g:2674:1: ( ')' )
            // InternalBlatt2.g:2675:2: ')'
            {
             before(grammarAccess.getComponent_ImplAccess().getRightParenthesisKeyword_8()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getComponent_ImplAccess().getRightParenthesisKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__8__Impl"


    // $ANTLR start "rule__Component_Impl__Group__9"
    // InternalBlatt2.g:2684:1: rule__Component_Impl__Group__9 : rule__Component_Impl__Group__9__Impl rule__Component_Impl__Group__10 ;
    public final void rule__Component_Impl__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:2688:1: ( rule__Component_Impl__Group__9__Impl rule__Component_Impl__Group__10 )
            // InternalBlatt2.g:2689:2: rule__Component_Impl__Group__9__Impl rule__Component_Impl__Group__10
            {
            pushFollow(FOLLOW_19);
            rule__Component_Impl__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__9"


    // $ANTLR start "rule__Component_Impl__Group__9__Impl"
    // InternalBlatt2.g:2696:1: rule__Component_Impl__Group__9__Impl : ( ( rule__Component_Impl__Group_9__0 )? ) ;
    public final void rule__Component_Impl__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:2700:1: ( ( ( rule__Component_Impl__Group_9__0 )? ) )
            // InternalBlatt2.g:2701:1: ( ( rule__Component_Impl__Group_9__0 )? )
            {
            // InternalBlatt2.g:2701:1: ( ( rule__Component_Impl__Group_9__0 )? )
            // InternalBlatt2.g:2702:2: ( rule__Component_Impl__Group_9__0 )?
            {
             before(grammarAccess.getComponent_ImplAccess().getGroup_9()); 
            // InternalBlatt2.g:2703:2: ( rule__Component_Impl__Group_9__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==32) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalBlatt2.g:2703:3: rule__Component_Impl__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component_Impl__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponent_ImplAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__9__Impl"


    // $ANTLR start "rule__Component_Impl__Group__10"
    // InternalBlatt2.g:2711:1: rule__Component_Impl__Group__10 : rule__Component_Impl__Group__10__Impl rule__Component_Impl__Group__11 ;
    public final void rule__Component_Impl__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:2715:1: ( rule__Component_Impl__Group__10__Impl rule__Component_Impl__Group__11 )
            // InternalBlatt2.g:2716:2: rule__Component_Impl__Group__10__Impl rule__Component_Impl__Group__11
            {
            pushFollow(FOLLOW_3);
            rule__Component_Impl__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__10"


    // $ANTLR start "rule__Component_Impl__Group__10__Impl"
    // InternalBlatt2.g:2723:1: rule__Component_Impl__Group__10__Impl : ( 'providedService' ) ;
    public final void rule__Component_Impl__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:2727:1: ( ( 'providedService' ) )
            // InternalBlatt2.g:2728:1: ( 'providedService' )
            {
            // InternalBlatt2.g:2728:1: ( 'providedService' )
            // InternalBlatt2.g:2729:2: 'providedService'
            {
             before(grammarAccess.getComponent_ImplAccess().getProvidedServiceKeyword_10()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getComponent_ImplAccess().getProvidedServiceKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__10__Impl"


    // $ANTLR start "rule__Component_Impl__Group__11"
    // InternalBlatt2.g:2738:1: rule__Component_Impl__Group__11 : rule__Component_Impl__Group__11__Impl rule__Component_Impl__Group__12 ;
    public final void rule__Component_Impl__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:2742:1: ( rule__Component_Impl__Group__11__Impl rule__Component_Impl__Group__12 )
            // InternalBlatt2.g:2743:2: rule__Component_Impl__Group__11__Impl rule__Component_Impl__Group__12
            {
            pushFollow(FOLLOW_20);
            rule__Component_Impl__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__11"


    // $ANTLR start "rule__Component_Impl__Group__11__Impl"
    // InternalBlatt2.g:2750:1: rule__Component_Impl__Group__11__Impl : ( '{' ) ;
    public final void rule__Component_Impl__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:2754:1: ( ( '{' ) )
            // InternalBlatt2.g:2755:1: ( '{' )
            {
            // InternalBlatt2.g:2755:1: ( '{' )
            // InternalBlatt2.g:2756:2: '{'
            {
             before(grammarAccess.getComponent_ImplAccess().getLeftCurlyBracketKeyword_11()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getComponent_ImplAccess().getLeftCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__11__Impl"


    // $ANTLR start "rule__Component_Impl__Group__12"
    // InternalBlatt2.g:2765:1: rule__Component_Impl__Group__12 : rule__Component_Impl__Group__12__Impl rule__Component_Impl__Group__13 ;
    public final void rule__Component_Impl__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:2769:1: ( rule__Component_Impl__Group__12__Impl rule__Component_Impl__Group__13 )
            // InternalBlatt2.g:2770:2: rule__Component_Impl__Group__12__Impl rule__Component_Impl__Group__13
            {
            pushFollow(FOLLOW_11);
            rule__Component_Impl__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__12"


    // $ANTLR start "rule__Component_Impl__Group__12__Impl"
    // InternalBlatt2.g:2777:1: rule__Component_Impl__Group__12__Impl : ( ( rule__Component_Impl__ProvidedServiceAssignment_12 ) ) ;
    public final void rule__Component_Impl__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:2781:1: ( ( ( rule__Component_Impl__ProvidedServiceAssignment_12 ) ) )
            // InternalBlatt2.g:2782:1: ( ( rule__Component_Impl__ProvidedServiceAssignment_12 ) )
            {
            // InternalBlatt2.g:2782:1: ( ( rule__Component_Impl__ProvidedServiceAssignment_12 ) )
            // InternalBlatt2.g:2783:2: ( rule__Component_Impl__ProvidedServiceAssignment_12 )
            {
             before(grammarAccess.getComponent_ImplAccess().getProvidedServiceAssignment_12()); 
            // InternalBlatt2.g:2784:2: ( rule__Component_Impl__ProvidedServiceAssignment_12 )
            // InternalBlatt2.g:2784:3: rule__Component_Impl__ProvidedServiceAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Component_Impl__ProvidedServiceAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getComponent_ImplAccess().getProvidedServiceAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__12__Impl"


    // $ANTLR start "rule__Component_Impl__Group__13"
    // InternalBlatt2.g:2792:1: rule__Component_Impl__Group__13 : rule__Component_Impl__Group__13__Impl rule__Component_Impl__Group__14 ;
    public final void rule__Component_Impl__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:2796:1: ( rule__Component_Impl__Group__13__Impl rule__Component_Impl__Group__14 )
            // InternalBlatt2.g:2797:2: rule__Component_Impl__Group__13__Impl rule__Component_Impl__Group__14
            {
            pushFollow(FOLLOW_11);
            rule__Component_Impl__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__13"


    // $ANTLR start "rule__Component_Impl__Group__13__Impl"
    // InternalBlatt2.g:2804:1: rule__Component_Impl__Group__13__Impl : ( ( rule__Component_Impl__Group_13__0 )* ) ;
    public final void rule__Component_Impl__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:2808:1: ( ( ( rule__Component_Impl__Group_13__0 )* ) )
            // InternalBlatt2.g:2809:1: ( ( rule__Component_Impl__Group_13__0 )* )
            {
            // InternalBlatt2.g:2809:1: ( ( rule__Component_Impl__Group_13__0 )* )
            // InternalBlatt2.g:2810:2: ( rule__Component_Impl__Group_13__0 )*
            {
             before(grammarAccess.getComponent_ImplAccess().getGroup_13()); 
            // InternalBlatt2.g:2811:2: ( rule__Component_Impl__Group_13__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==17) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalBlatt2.g:2811:3: rule__Component_Impl__Group_13__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Component_Impl__Group_13__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getComponent_ImplAccess().getGroup_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__13__Impl"


    // $ANTLR start "rule__Component_Impl__Group__14"
    // InternalBlatt2.g:2819:1: rule__Component_Impl__Group__14 : rule__Component_Impl__Group__14__Impl rule__Component_Impl__Group__15 ;
    public final void rule__Component_Impl__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:2823:1: ( rule__Component_Impl__Group__14__Impl rule__Component_Impl__Group__15 )
            // InternalBlatt2.g:2824:2: rule__Component_Impl__Group__14__Impl rule__Component_Impl__Group__15
            {
            pushFollow(FOLLOW_21);
            rule__Component_Impl__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__14"


    // $ANTLR start "rule__Component_Impl__Group__14__Impl"
    // InternalBlatt2.g:2831:1: rule__Component_Impl__Group__14__Impl : ( '}' ) ;
    public final void rule__Component_Impl__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:2835:1: ( ( '}' ) )
            // InternalBlatt2.g:2836:1: ( '}' )
            {
            // InternalBlatt2.g:2836:1: ( '}' )
            // InternalBlatt2.g:2837:2: '}'
            {
             before(grammarAccess.getComponent_ImplAccess().getRightCurlyBracketKeyword_14()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getComponent_ImplAccess().getRightCurlyBracketKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__14__Impl"


    // $ANTLR start "rule__Component_Impl__Group__15"
    // InternalBlatt2.g:2846:1: rule__Component_Impl__Group__15 : rule__Component_Impl__Group__15__Impl rule__Component_Impl__Group__16 ;
    public final void rule__Component_Impl__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:2850:1: ( rule__Component_Impl__Group__15__Impl rule__Component_Impl__Group__16 )
            // InternalBlatt2.g:2851:2: rule__Component_Impl__Group__15__Impl rule__Component_Impl__Group__16
            {
            pushFollow(FOLLOW_22);
            rule__Component_Impl__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__15"


    // $ANTLR start "rule__Component_Impl__Group__15__Impl"
    // InternalBlatt2.g:2858:1: rule__Component_Impl__Group__15__Impl : ( 'behaviourDescription' ) ;
    public final void rule__Component_Impl__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:2862:1: ( ( 'behaviourDescription' ) )
            // InternalBlatt2.g:2863:1: ( 'behaviourDescription' )
            {
            // InternalBlatt2.g:2863:1: ( 'behaviourDescription' )
            // InternalBlatt2.g:2864:2: 'behaviourDescription'
            {
             before(grammarAccess.getComponent_ImplAccess().getBehaviourDescriptionKeyword_15()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getComponent_ImplAccess().getBehaviourDescriptionKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__15__Impl"


    // $ANTLR start "rule__Component_Impl__Group__16"
    // InternalBlatt2.g:2873:1: rule__Component_Impl__Group__16 : rule__Component_Impl__Group__16__Impl rule__Component_Impl__Group__17 ;
    public final void rule__Component_Impl__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:2877:1: ( rule__Component_Impl__Group__16__Impl rule__Component_Impl__Group__17 )
            // InternalBlatt2.g:2878:2: rule__Component_Impl__Group__16__Impl rule__Component_Impl__Group__17
            {
            pushFollow(FOLLOW_13);
            rule__Component_Impl__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__16"


    // $ANTLR start "rule__Component_Impl__Group__16__Impl"
    // InternalBlatt2.g:2885:1: rule__Component_Impl__Group__16__Impl : ( ( rule__Component_Impl__BehaviourDescriptionAssignment_16 ) ) ;
    public final void rule__Component_Impl__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:2889:1: ( ( ( rule__Component_Impl__BehaviourDescriptionAssignment_16 ) ) )
            // InternalBlatt2.g:2890:1: ( ( rule__Component_Impl__BehaviourDescriptionAssignment_16 ) )
            {
            // InternalBlatt2.g:2890:1: ( ( rule__Component_Impl__BehaviourDescriptionAssignment_16 ) )
            // InternalBlatt2.g:2891:2: ( rule__Component_Impl__BehaviourDescriptionAssignment_16 )
            {
             before(grammarAccess.getComponent_ImplAccess().getBehaviourDescriptionAssignment_16()); 
            // InternalBlatt2.g:2892:2: ( rule__Component_Impl__BehaviourDescriptionAssignment_16 )
            // InternalBlatt2.g:2892:3: rule__Component_Impl__BehaviourDescriptionAssignment_16
            {
            pushFollow(FOLLOW_2);
            rule__Component_Impl__BehaviourDescriptionAssignment_16();

            state._fsp--;


            }

             after(grammarAccess.getComponent_ImplAccess().getBehaviourDescriptionAssignment_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__16__Impl"


    // $ANTLR start "rule__Component_Impl__Group__17"
    // InternalBlatt2.g:2900:1: rule__Component_Impl__Group__17 : rule__Component_Impl__Group__17__Impl ;
    public final void rule__Component_Impl__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:2904:1: ( rule__Component_Impl__Group__17__Impl )
            // InternalBlatt2.g:2905:2: rule__Component_Impl__Group__17__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group__17__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__17"


    // $ANTLR start "rule__Component_Impl__Group__17__Impl"
    // InternalBlatt2.g:2911:1: rule__Component_Impl__Group__17__Impl : ( '}' ) ;
    public final void rule__Component_Impl__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:2915:1: ( ( '}' ) )
            // InternalBlatt2.g:2916:1: ( '}' )
            {
            // InternalBlatt2.g:2916:1: ( '}' )
            // InternalBlatt2.g:2917:2: '}'
            {
             before(grammarAccess.getComponent_ImplAccess().getRightCurlyBracketKeyword_17()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getComponent_ImplAccess().getRightCurlyBracketKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group__17__Impl"


    // $ANTLR start "rule__Component_Impl__Group_3__0"
    // InternalBlatt2.g:2927:1: rule__Component_Impl__Group_3__0 : rule__Component_Impl__Group_3__0__Impl rule__Component_Impl__Group_3__1 ;
    public final void rule__Component_Impl__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:2931:1: ( rule__Component_Impl__Group_3__0__Impl rule__Component_Impl__Group_3__1 )
            // InternalBlatt2.g:2932:2: rule__Component_Impl__Group_3__0__Impl rule__Component_Impl__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__Component_Impl__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_3__0"


    // $ANTLR start "rule__Component_Impl__Group_3__0__Impl"
    // InternalBlatt2.g:2939:1: rule__Component_Impl__Group_3__0__Impl : ( 'requiredInterface' ) ;
    public final void rule__Component_Impl__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:2943:1: ( ( 'requiredInterface' ) )
            // InternalBlatt2.g:2944:1: ( 'requiredInterface' )
            {
            // InternalBlatt2.g:2944:1: ( 'requiredInterface' )
            // InternalBlatt2.g:2945:2: 'requiredInterface'
            {
             before(grammarAccess.getComponent_ImplAccess().getRequiredInterfaceKeyword_3_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getComponent_ImplAccess().getRequiredInterfaceKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_3__0__Impl"


    // $ANTLR start "rule__Component_Impl__Group_3__1"
    // InternalBlatt2.g:2954:1: rule__Component_Impl__Group_3__1 : rule__Component_Impl__Group_3__1__Impl rule__Component_Impl__Group_3__2 ;
    public final void rule__Component_Impl__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:2958:1: ( rule__Component_Impl__Group_3__1__Impl rule__Component_Impl__Group_3__2 )
            // InternalBlatt2.g:2959:2: rule__Component_Impl__Group_3__1__Impl rule__Component_Impl__Group_3__2
            {
            pushFollow(FOLLOW_6);
            rule__Component_Impl__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_3__1"


    // $ANTLR start "rule__Component_Impl__Group_3__1__Impl"
    // InternalBlatt2.g:2966:1: rule__Component_Impl__Group_3__1__Impl : ( '(' ) ;
    public final void rule__Component_Impl__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:2970:1: ( ( '(' ) )
            // InternalBlatt2.g:2971:1: ( '(' )
            {
            // InternalBlatt2.g:2971:1: ( '(' )
            // InternalBlatt2.g:2972:2: '('
            {
             before(grammarAccess.getComponent_ImplAccess().getLeftParenthesisKeyword_3_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getComponent_ImplAccess().getLeftParenthesisKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_3__1__Impl"


    // $ANTLR start "rule__Component_Impl__Group_3__2"
    // InternalBlatt2.g:2981:1: rule__Component_Impl__Group_3__2 : rule__Component_Impl__Group_3__2__Impl rule__Component_Impl__Group_3__3 ;
    public final void rule__Component_Impl__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:2985:1: ( rule__Component_Impl__Group_3__2__Impl rule__Component_Impl__Group_3__3 )
            // InternalBlatt2.g:2986:2: rule__Component_Impl__Group_3__2__Impl rule__Component_Impl__Group_3__3
            {
            pushFollow(FOLLOW_7);
            rule__Component_Impl__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_3__2"


    // $ANTLR start "rule__Component_Impl__Group_3__2__Impl"
    // InternalBlatt2.g:2993:1: rule__Component_Impl__Group_3__2__Impl : ( ( rule__Component_Impl__RequiredInterfaceAssignment_3_2 ) ) ;
    public final void rule__Component_Impl__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:2997:1: ( ( ( rule__Component_Impl__RequiredInterfaceAssignment_3_2 ) ) )
            // InternalBlatt2.g:2998:1: ( ( rule__Component_Impl__RequiredInterfaceAssignment_3_2 ) )
            {
            // InternalBlatt2.g:2998:1: ( ( rule__Component_Impl__RequiredInterfaceAssignment_3_2 ) )
            // InternalBlatt2.g:2999:2: ( rule__Component_Impl__RequiredInterfaceAssignment_3_2 )
            {
             before(grammarAccess.getComponent_ImplAccess().getRequiredInterfaceAssignment_3_2()); 
            // InternalBlatt2.g:3000:2: ( rule__Component_Impl__RequiredInterfaceAssignment_3_2 )
            // InternalBlatt2.g:3000:3: rule__Component_Impl__RequiredInterfaceAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Component_Impl__RequiredInterfaceAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getComponent_ImplAccess().getRequiredInterfaceAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_3__2__Impl"


    // $ANTLR start "rule__Component_Impl__Group_3__3"
    // InternalBlatt2.g:3008:1: rule__Component_Impl__Group_3__3 : rule__Component_Impl__Group_3__3__Impl rule__Component_Impl__Group_3__4 ;
    public final void rule__Component_Impl__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:3012:1: ( rule__Component_Impl__Group_3__3__Impl rule__Component_Impl__Group_3__4 )
            // InternalBlatt2.g:3013:2: rule__Component_Impl__Group_3__3__Impl rule__Component_Impl__Group_3__4
            {
            pushFollow(FOLLOW_7);
            rule__Component_Impl__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_3__3"


    // $ANTLR start "rule__Component_Impl__Group_3__3__Impl"
    // InternalBlatt2.g:3020:1: rule__Component_Impl__Group_3__3__Impl : ( ( rule__Component_Impl__Group_3_3__0 )* ) ;
    public final void rule__Component_Impl__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:3024:1: ( ( ( rule__Component_Impl__Group_3_3__0 )* ) )
            // InternalBlatt2.g:3025:1: ( ( rule__Component_Impl__Group_3_3__0 )* )
            {
            // InternalBlatt2.g:3025:1: ( ( rule__Component_Impl__Group_3_3__0 )* )
            // InternalBlatt2.g:3026:2: ( rule__Component_Impl__Group_3_3__0 )*
            {
             before(grammarAccess.getComponent_ImplAccess().getGroup_3_3()); 
            // InternalBlatt2.g:3027:2: ( rule__Component_Impl__Group_3_3__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==17) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalBlatt2.g:3027:3: rule__Component_Impl__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Component_Impl__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getComponent_ImplAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_3__3__Impl"


    // $ANTLR start "rule__Component_Impl__Group_3__4"
    // InternalBlatt2.g:3035:1: rule__Component_Impl__Group_3__4 : rule__Component_Impl__Group_3__4__Impl ;
    public final void rule__Component_Impl__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:3039:1: ( rule__Component_Impl__Group_3__4__Impl )
            // InternalBlatt2.g:3040:2: rule__Component_Impl__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_3__4"


    // $ANTLR start "rule__Component_Impl__Group_3__4__Impl"
    // InternalBlatt2.g:3046:1: rule__Component_Impl__Group_3__4__Impl : ( ')' ) ;
    public final void rule__Component_Impl__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:3050:1: ( ( ')' ) )
            // InternalBlatt2.g:3051:1: ( ')' )
            {
            // InternalBlatt2.g:3051:1: ( ')' )
            // InternalBlatt2.g:3052:2: ')'
            {
             before(grammarAccess.getComponent_ImplAccess().getRightParenthesisKeyword_3_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getComponent_ImplAccess().getRightParenthesisKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_3__4__Impl"


    // $ANTLR start "rule__Component_Impl__Group_3_3__0"
    // InternalBlatt2.g:3062:1: rule__Component_Impl__Group_3_3__0 : rule__Component_Impl__Group_3_3__0__Impl rule__Component_Impl__Group_3_3__1 ;
    public final void rule__Component_Impl__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:3066:1: ( rule__Component_Impl__Group_3_3__0__Impl rule__Component_Impl__Group_3_3__1 )
            // InternalBlatt2.g:3067:2: rule__Component_Impl__Group_3_3__0__Impl rule__Component_Impl__Group_3_3__1
            {
            pushFollow(FOLLOW_6);
            rule__Component_Impl__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_3_3__0"


    // $ANTLR start "rule__Component_Impl__Group_3_3__0__Impl"
    // InternalBlatt2.g:3074:1: rule__Component_Impl__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Component_Impl__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:3078:1: ( ( ',' ) )
            // InternalBlatt2.g:3079:1: ( ',' )
            {
            // InternalBlatt2.g:3079:1: ( ',' )
            // InternalBlatt2.g:3080:2: ','
            {
             before(grammarAccess.getComponent_ImplAccess().getCommaKeyword_3_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getComponent_ImplAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_3_3__0__Impl"


    // $ANTLR start "rule__Component_Impl__Group_3_3__1"
    // InternalBlatt2.g:3089:1: rule__Component_Impl__Group_3_3__1 : rule__Component_Impl__Group_3_3__1__Impl ;
    public final void rule__Component_Impl__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:3093:1: ( rule__Component_Impl__Group_3_3__1__Impl )
            // InternalBlatt2.g:3094:2: rule__Component_Impl__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_3_3__1"


    // $ANTLR start "rule__Component_Impl__Group_3_3__1__Impl"
    // InternalBlatt2.g:3100:1: rule__Component_Impl__Group_3_3__1__Impl : ( ( rule__Component_Impl__RequiredInterfaceAssignment_3_3_1 ) ) ;
    public final void rule__Component_Impl__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:3104:1: ( ( ( rule__Component_Impl__RequiredInterfaceAssignment_3_3_1 ) ) )
            // InternalBlatt2.g:3105:1: ( ( rule__Component_Impl__RequiredInterfaceAssignment_3_3_1 ) )
            {
            // InternalBlatt2.g:3105:1: ( ( rule__Component_Impl__RequiredInterfaceAssignment_3_3_1 ) )
            // InternalBlatt2.g:3106:2: ( rule__Component_Impl__RequiredInterfaceAssignment_3_3_1 )
            {
             before(grammarAccess.getComponent_ImplAccess().getRequiredInterfaceAssignment_3_3_1()); 
            // InternalBlatt2.g:3107:2: ( rule__Component_Impl__RequiredInterfaceAssignment_3_3_1 )
            // InternalBlatt2.g:3107:3: rule__Component_Impl__RequiredInterfaceAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Component_Impl__RequiredInterfaceAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getComponent_ImplAccess().getRequiredInterfaceAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_3_3__1__Impl"


    // $ANTLR start "rule__Component_Impl__Group_7__0"
    // InternalBlatt2.g:3116:1: rule__Component_Impl__Group_7__0 : rule__Component_Impl__Group_7__0__Impl rule__Component_Impl__Group_7__1 ;
    public final void rule__Component_Impl__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:3120:1: ( rule__Component_Impl__Group_7__0__Impl rule__Component_Impl__Group_7__1 )
            // InternalBlatt2.g:3121:2: rule__Component_Impl__Group_7__0__Impl rule__Component_Impl__Group_7__1
            {
            pushFollow(FOLLOW_6);
            rule__Component_Impl__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_7__0"


    // $ANTLR start "rule__Component_Impl__Group_7__0__Impl"
    // InternalBlatt2.g:3128:1: rule__Component_Impl__Group_7__0__Impl : ( ',' ) ;
    public final void rule__Component_Impl__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:3132:1: ( ( ',' ) )
            // InternalBlatt2.g:3133:1: ( ',' )
            {
            // InternalBlatt2.g:3133:1: ( ',' )
            // InternalBlatt2.g:3134:2: ','
            {
             before(grammarAccess.getComponent_ImplAccess().getCommaKeyword_7_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getComponent_ImplAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_7__0__Impl"


    // $ANTLR start "rule__Component_Impl__Group_7__1"
    // InternalBlatt2.g:3143:1: rule__Component_Impl__Group_7__1 : rule__Component_Impl__Group_7__1__Impl ;
    public final void rule__Component_Impl__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:3147:1: ( rule__Component_Impl__Group_7__1__Impl )
            // InternalBlatt2.g:3148:2: rule__Component_Impl__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_7__1"


    // $ANTLR start "rule__Component_Impl__Group_7__1__Impl"
    // InternalBlatt2.g:3154:1: rule__Component_Impl__Group_7__1__Impl : ( ( rule__Component_Impl__RequiredServiceAssignment_7_1 ) ) ;
    public final void rule__Component_Impl__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:3158:1: ( ( ( rule__Component_Impl__RequiredServiceAssignment_7_1 ) ) )
            // InternalBlatt2.g:3159:1: ( ( rule__Component_Impl__RequiredServiceAssignment_7_1 ) )
            {
            // InternalBlatt2.g:3159:1: ( ( rule__Component_Impl__RequiredServiceAssignment_7_1 ) )
            // InternalBlatt2.g:3160:2: ( rule__Component_Impl__RequiredServiceAssignment_7_1 )
            {
             before(grammarAccess.getComponent_ImplAccess().getRequiredServiceAssignment_7_1()); 
            // InternalBlatt2.g:3161:2: ( rule__Component_Impl__RequiredServiceAssignment_7_1 )
            // InternalBlatt2.g:3161:3: rule__Component_Impl__RequiredServiceAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Component_Impl__RequiredServiceAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getComponent_ImplAccess().getRequiredServiceAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_7__1__Impl"


    // $ANTLR start "rule__Component_Impl__Group_9__0"
    // InternalBlatt2.g:3170:1: rule__Component_Impl__Group_9__0 : rule__Component_Impl__Group_9__0__Impl rule__Component_Impl__Group_9__1 ;
    public final void rule__Component_Impl__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:3174:1: ( rule__Component_Impl__Group_9__0__Impl rule__Component_Impl__Group_9__1 )
            // InternalBlatt2.g:3175:2: rule__Component_Impl__Group_9__0__Impl rule__Component_Impl__Group_9__1
            {
            pushFollow(FOLLOW_3);
            rule__Component_Impl__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_9__0"


    // $ANTLR start "rule__Component_Impl__Group_9__0__Impl"
    // InternalBlatt2.g:3182:1: rule__Component_Impl__Group_9__0__Impl : ( 'providedInterface' ) ;
    public final void rule__Component_Impl__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:3186:1: ( ( 'providedInterface' ) )
            // InternalBlatt2.g:3187:1: ( 'providedInterface' )
            {
            // InternalBlatt2.g:3187:1: ( 'providedInterface' )
            // InternalBlatt2.g:3188:2: 'providedInterface'
            {
             before(grammarAccess.getComponent_ImplAccess().getProvidedInterfaceKeyword_9_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getComponent_ImplAccess().getProvidedInterfaceKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_9__0__Impl"


    // $ANTLR start "rule__Component_Impl__Group_9__1"
    // InternalBlatt2.g:3197:1: rule__Component_Impl__Group_9__1 : rule__Component_Impl__Group_9__1__Impl rule__Component_Impl__Group_9__2 ;
    public final void rule__Component_Impl__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:3201:1: ( rule__Component_Impl__Group_9__1__Impl rule__Component_Impl__Group_9__2 )
            // InternalBlatt2.g:3202:2: rule__Component_Impl__Group_9__1__Impl rule__Component_Impl__Group_9__2
            {
            pushFollow(FOLLOW_23);
            rule__Component_Impl__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_9__1"


    // $ANTLR start "rule__Component_Impl__Group_9__1__Impl"
    // InternalBlatt2.g:3209:1: rule__Component_Impl__Group_9__1__Impl : ( '{' ) ;
    public final void rule__Component_Impl__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:3213:1: ( ( '{' ) )
            // InternalBlatt2.g:3214:1: ( '{' )
            {
            // InternalBlatt2.g:3214:1: ( '{' )
            // InternalBlatt2.g:3215:2: '{'
            {
             before(grammarAccess.getComponent_ImplAccess().getLeftCurlyBracketKeyword_9_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getComponent_ImplAccess().getLeftCurlyBracketKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_9__1__Impl"


    // $ANTLR start "rule__Component_Impl__Group_9__2"
    // InternalBlatt2.g:3224:1: rule__Component_Impl__Group_9__2 : rule__Component_Impl__Group_9__2__Impl rule__Component_Impl__Group_9__3 ;
    public final void rule__Component_Impl__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:3228:1: ( rule__Component_Impl__Group_9__2__Impl rule__Component_Impl__Group_9__3 )
            // InternalBlatt2.g:3229:2: rule__Component_Impl__Group_9__2__Impl rule__Component_Impl__Group_9__3
            {
            pushFollow(FOLLOW_11);
            rule__Component_Impl__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group_9__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_9__2"


    // $ANTLR start "rule__Component_Impl__Group_9__2__Impl"
    // InternalBlatt2.g:3236:1: rule__Component_Impl__Group_9__2__Impl : ( ( rule__Component_Impl__ProvidedInterfaceAssignment_9_2 ) ) ;
    public final void rule__Component_Impl__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:3240:1: ( ( ( rule__Component_Impl__ProvidedInterfaceAssignment_9_2 ) ) )
            // InternalBlatt2.g:3241:1: ( ( rule__Component_Impl__ProvidedInterfaceAssignment_9_2 ) )
            {
            // InternalBlatt2.g:3241:1: ( ( rule__Component_Impl__ProvidedInterfaceAssignment_9_2 ) )
            // InternalBlatt2.g:3242:2: ( rule__Component_Impl__ProvidedInterfaceAssignment_9_2 )
            {
             before(grammarAccess.getComponent_ImplAccess().getProvidedInterfaceAssignment_9_2()); 
            // InternalBlatt2.g:3243:2: ( rule__Component_Impl__ProvidedInterfaceAssignment_9_2 )
            // InternalBlatt2.g:3243:3: rule__Component_Impl__ProvidedInterfaceAssignment_9_2
            {
            pushFollow(FOLLOW_2);
            rule__Component_Impl__ProvidedInterfaceAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getComponent_ImplAccess().getProvidedInterfaceAssignment_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_9__2__Impl"


    // $ANTLR start "rule__Component_Impl__Group_9__3"
    // InternalBlatt2.g:3251:1: rule__Component_Impl__Group_9__3 : rule__Component_Impl__Group_9__3__Impl rule__Component_Impl__Group_9__4 ;
    public final void rule__Component_Impl__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:3255:1: ( rule__Component_Impl__Group_9__3__Impl rule__Component_Impl__Group_9__4 )
            // InternalBlatt2.g:3256:2: rule__Component_Impl__Group_9__3__Impl rule__Component_Impl__Group_9__4
            {
            pushFollow(FOLLOW_11);
            rule__Component_Impl__Group_9__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group_9__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_9__3"


    // $ANTLR start "rule__Component_Impl__Group_9__3__Impl"
    // InternalBlatt2.g:3263:1: rule__Component_Impl__Group_9__3__Impl : ( ( rule__Component_Impl__Group_9_3__0 )* ) ;
    public final void rule__Component_Impl__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:3267:1: ( ( ( rule__Component_Impl__Group_9_3__0 )* ) )
            // InternalBlatt2.g:3268:1: ( ( rule__Component_Impl__Group_9_3__0 )* )
            {
            // InternalBlatt2.g:3268:1: ( ( rule__Component_Impl__Group_9_3__0 )* )
            // InternalBlatt2.g:3269:2: ( rule__Component_Impl__Group_9_3__0 )*
            {
             before(grammarAccess.getComponent_ImplAccess().getGroup_9_3()); 
            // InternalBlatt2.g:3270:2: ( rule__Component_Impl__Group_9_3__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==17) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalBlatt2.g:3270:3: rule__Component_Impl__Group_9_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Component_Impl__Group_9_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getComponent_ImplAccess().getGroup_9_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_9__3__Impl"


    // $ANTLR start "rule__Component_Impl__Group_9__4"
    // InternalBlatt2.g:3278:1: rule__Component_Impl__Group_9__4 : rule__Component_Impl__Group_9__4__Impl ;
    public final void rule__Component_Impl__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:3282:1: ( rule__Component_Impl__Group_9__4__Impl )
            // InternalBlatt2.g:3283:2: rule__Component_Impl__Group_9__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group_9__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_9__4"


    // $ANTLR start "rule__Component_Impl__Group_9__4__Impl"
    // InternalBlatt2.g:3289:1: rule__Component_Impl__Group_9__4__Impl : ( '}' ) ;
    public final void rule__Component_Impl__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:3293:1: ( ( '}' ) )
            // InternalBlatt2.g:3294:1: ( '}' )
            {
            // InternalBlatt2.g:3294:1: ( '}' )
            // InternalBlatt2.g:3295:2: '}'
            {
             before(grammarAccess.getComponent_ImplAccess().getRightCurlyBracketKeyword_9_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getComponent_ImplAccess().getRightCurlyBracketKeyword_9_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_9__4__Impl"


    // $ANTLR start "rule__Component_Impl__Group_9_3__0"
    // InternalBlatt2.g:3305:1: rule__Component_Impl__Group_9_3__0 : rule__Component_Impl__Group_9_3__0__Impl rule__Component_Impl__Group_9_3__1 ;
    public final void rule__Component_Impl__Group_9_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:3309:1: ( rule__Component_Impl__Group_9_3__0__Impl rule__Component_Impl__Group_9_3__1 )
            // InternalBlatt2.g:3310:2: rule__Component_Impl__Group_9_3__0__Impl rule__Component_Impl__Group_9_3__1
            {
            pushFollow(FOLLOW_23);
            rule__Component_Impl__Group_9_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group_9_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_9_3__0"


    // $ANTLR start "rule__Component_Impl__Group_9_3__0__Impl"
    // InternalBlatt2.g:3317:1: rule__Component_Impl__Group_9_3__0__Impl : ( ',' ) ;
    public final void rule__Component_Impl__Group_9_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:3321:1: ( ( ',' ) )
            // InternalBlatt2.g:3322:1: ( ',' )
            {
            // InternalBlatt2.g:3322:1: ( ',' )
            // InternalBlatt2.g:3323:2: ','
            {
             before(grammarAccess.getComponent_ImplAccess().getCommaKeyword_9_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getComponent_ImplAccess().getCommaKeyword_9_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_9_3__0__Impl"


    // $ANTLR start "rule__Component_Impl__Group_9_3__1"
    // InternalBlatt2.g:3332:1: rule__Component_Impl__Group_9_3__1 : rule__Component_Impl__Group_9_3__1__Impl ;
    public final void rule__Component_Impl__Group_9_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:3336:1: ( rule__Component_Impl__Group_9_3__1__Impl )
            // InternalBlatt2.g:3337:2: rule__Component_Impl__Group_9_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group_9_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_9_3__1"


    // $ANTLR start "rule__Component_Impl__Group_9_3__1__Impl"
    // InternalBlatt2.g:3343:1: rule__Component_Impl__Group_9_3__1__Impl : ( ( rule__Component_Impl__ProvidedInterfaceAssignment_9_3_1 ) ) ;
    public final void rule__Component_Impl__Group_9_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:3347:1: ( ( ( rule__Component_Impl__ProvidedInterfaceAssignment_9_3_1 ) ) )
            // InternalBlatt2.g:3348:1: ( ( rule__Component_Impl__ProvidedInterfaceAssignment_9_3_1 ) )
            {
            // InternalBlatt2.g:3348:1: ( ( rule__Component_Impl__ProvidedInterfaceAssignment_9_3_1 ) )
            // InternalBlatt2.g:3349:2: ( rule__Component_Impl__ProvidedInterfaceAssignment_9_3_1 )
            {
             before(grammarAccess.getComponent_ImplAccess().getProvidedInterfaceAssignment_9_3_1()); 
            // InternalBlatt2.g:3350:2: ( rule__Component_Impl__ProvidedInterfaceAssignment_9_3_1 )
            // InternalBlatt2.g:3350:3: rule__Component_Impl__ProvidedInterfaceAssignment_9_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Component_Impl__ProvidedInterfaceAssignment_9_3_1();

            state._fsp--;


            }

             after(grammarAccess.getComponent_ImplAccess().getProvidedInterfaceAssignment_9_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_9_3__1__Impl"


    // $ANTLR start "rule__Component_Impl__Group_13__0"
    // InternalBlatt2.g:3359:1: rule__Component_Impl__Group_13__0 : rule__Component_Impl__Group_13__0__Impl rule__Component_Impl__Group_13__1 ;
    public final void rule__Component_Impl__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:3363:1: ( rule__Component_Impl__Group_13__0__Impl rule__Component_Impl__Group_13__1 )
            // InternalBlatt2.g:3364:2: rule__Component_Impl__Group_13__0__Impl rule__Component_Impl__Group_13__1
            {
            pushFollow(FOLLOW_20);
            rule__Component_Impl__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group_13__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_13__0"


    // $ANTLR start "rule__Component_Impl__Group_13__0__Impl"
    // InternalBlatt2.g:3371:1: rule__Component_Impl__Group_13__0__Impl : ( ',' ) ;
    public final void rule__Component_Impl__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:3375:1: ( ( ',' ) )
            // InternalBlatt2.g:3376:1: ( ',' )
            {
            // InternalBlatt2.g:3376:1: ( ',' )
            // InternalBlatt2.g:3377:2: ','
            {
             before(grammarAccess.getComponent_ImplAccess().getCommaKeyword_13_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getComponent_ImplAccess().getCommaKeyword_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_13__0__Impl"


    // $ANTLR start "rule__Component_Impl__Group_13__1"
    // InternalBlatt2.g:3386:1: rule__Component_Impl__Group_13__1 : rule__Component_Impl__Group_13__1__Impl ;
    public final void rule__Component_Impl__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:3390:1: ( rule__Component_Impl__Group_13__1__Impl )
            // InternalBlatt2.g:3391:2: rule__Component_Impl__Group_13__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group_13__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_13__1"


    // $ANTLR start "rule__Component_Impl__Group_13__1__Impl"
    // InternalBlatt2.g:3397:1: rule__Component_Impl__Group_13__1__Impl : ( ( rule__Component_Impl__ProvidedServiceAssignment_13_1 ) ) ;
    public final void rule__Component_Impl__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:3401:1: ( ( ( rule__Component_Impl__ProvidedServiceAssignment_13_1 ) ) )
            // InternalBlatt2.g:3402:1: ( ( rule__Component_Impl__ProvidedServiceAssignment_13_1 ) )
            {
            // InternalBlatt2.g:3402:1: ( ( rule__Component_Impl__ProvidedServiceAssignment_13_1 ) )
            // InternalBlatt2.g:3403:2: ( rule__Component_Impl__ProvidedServiceAssignment_13_1 )
            {
             before(grammarAccess.getComponent_ImplAccess().getProvidedServiceAssignment_13_1()); 
            // InternalBlatt2.g:3404:2: ( rule__Component_Impl__ProvidedServiceAssignment_13_1 )
            // InternalBlatt2.g:3404:3: rule__Component_Impl__ProvidedServiceAssignment_13_1
            {
            pushFollow(FOLLOW_2);
            rule__Component_Impl__ProvidedServiceAssignment_13_1();

            state._fsp--;


            }

             after(grammarAccess.getComponent_ImplAccess().getProvidedServiceAssignment_13_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_13__1__Impl"


    // $ANTLR start "rule__Interface__Group__0"
    // InternalBlatt2.g:3413:1: rule__Interface__Group__0 : rule__Interface__Group__0__Impl rule__Interface__Group__1 ;
    public final void rule__Interface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:3417:1: ( rule__Interface__Group__0__Impl rule__Interface__Group__1 )
            // InternalBlatt2.g:3418:2: rule__Interface__Group__0__Impl rule__Interface__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Interface__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__0"


    // $ANTLR start "rule__Interface__Group__0__Impl"
    // InternalBlatt2.g:3425:1: rule__Interface__Group__0__Impl : ( 'Interface' ) ;
    public final void rule__Interface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:3429:1: ( ( 'Interface' ) )
            // InternalBlatt2.g:3430:1: ( 'Interface' )
            {
            // InternalBlatt2.g:3430:1: ( 'Interface' )
            // InternalBlatt2.g:3431:2: 'Interface'
            {
             before(grammarAccess.getInterfaceAccess().getInterfaceKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getInterfaceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__0__Impl"


    // $ANTLR start "rule__Interface__Group__1"
    // InternalBlatt2.g:3440:1: rule__Interface__Group__1 : rule__Interface__Group__1__Impl rule__Interface__Group__2 ;
    public final void rule__Interface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:3444:1: ( rule__Interface__Group__1__Impl rule__Interface__Group__2 )
            // InternalBlatt2.g:3445:2: rule__Interface__Group__1__Impl rule__Interface__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Interface__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__1"


    // $ANTLR start "rule__Interface__Group__1__Impl"
    // InternalBlatt2.g:3452:1: rule__Interface__Group__1__Impl : ( ( rule__Interface__NameAssignment_1 ) ) ;
    public final void rule__Interface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:3456:1: ( ( ( rule__Interface__NameAssignment_1 ) ) )
            // InternalBlatt2.g:3457:1: ( ( rule__Interface__NameAssignment_1 ) )
            {
            // InternalBlatt2.g:3457:1: ( ( rule__Interface__NameAssignment_1 ) )
            // InternalBlatt2.g:3458:2: ( rule__Interface__NameAssignment_1 )
            {
             before(grammarAccess.getInterfaceAccess().getNameAssignment_1()); 
            // InternalBlatt2.g:3459:2: ( rule__Interface__NameAssignment_1 )
            // InternalBlatt2.g:3459:3: rule__Interface__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Interface__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__1__Impl"


    // $ANTLR start "rule__Interface__Group__2"
    // InternalBlatt2.g:3467:1: rule__Interface__Group__2 : rule__Interface__Group__2__Impl rule__Interface__Group__3 ;
    public final void rule__Interface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:3471:1: ( rule__Interface__Group__2__Impl rule__Interface__Group__3 )
            // InternalBlatt2.g:3472:2: rule__Interface__Group__2__Impl rule__Interface__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__Interface__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__2"


    // $ANTLR start "rule__Interface__Group__2__Impl"
    // InternalBlatt2.g:3479:1: rule__Interface__Group__2__Impl : ( '{' ) ;
    public final void rule__Interface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:3483:1: ( ( '{' ) )
            // InternalBlatt2.g:3484:1: ( '{' )
            {
            // InternalBlatt2.g:3484:1: ( '{' )
            // InternalBlatt2.g:3485:2: '{'
            {
             before(grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__2__Impl"


    // $ANTLR start "rule__Interface__Group__3"
    // InternalBlatt2.g:3494:1: rule__Interface__Group__3 : rule__Interface__Group__3__Impl rule__Interface__Group__4 ;
    public final void rule__Interface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:3498:1: ( rule__Interface__Group__3__Impl rule__Interface__Group__4 )
            // InternalBlatt2.g:3499:2: rule__Interface__Group__3__Impl rule__Interface__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Interface__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__3"


    // $ANTLR start "rule__Interface__Group__3__Impl"
    // InternalBlatt2.g:3506:1: rule__Interface__Group__3__Impl : ( 'signature' ) ;
    public final void rule__Interface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:3510:1: ( ( 'signature' ) )
            // InternalBlatt2.g:3511:1: ( 'signature' )
            {
            // InternalBlatt2.g:3511:1: ( 'signature' )
            // InternalBlatt2.g:3512:2: 'signature'
            {
             before(grammarAccess.getInterfaceAccess().getSignatureKeyword_3()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getSignatureKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__3__Impl"


    // $ANTLR start "rule__Interface__Group__4"
    // InternalBlatt2.g:3521:1: rule__Interface__Group__4 : rule__Interface__Group__4__Impl rule__Interface__Group__5 ;
    public final void rule__Interface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:3525:1: ( rule__Interface__Group__4__Impl rule__Interface__Group__5 )
            // InternalBlatt2.g:3526:2: rule__Interface__Group__4__Impl rule__Interface__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__Interface__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__4"


    // $ANTLR start "rule__Interface__Group__4__Impl"
    // InternalBlatt2.g:3533:1: rule__Interface__Group__4__Impl : ( '{' ) ;
    public final void rule__Interface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:3537:1: ( ( '{' ) )
            // InternalBlatt2.g:3538:1: ( '{' )
            {
            // InternalBlatt2.g:3538:1: ( '{' )
            // InternalBlatt2.g:3539:2: '{'
            {
             before(grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__4__Impl"


    // $ANTLR start "rule__Interface__Group__5"
    // InternalBlatt2.g:3548:1: rule__Interface__Group__5 : rule__Interface__Group__5__Impl rule__Interface__Group__6 ;
    public final void rule__Interface__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:3552:1: ( rule__Interface__Group__5__Impl rule__Interface__Group__6 )
            // InternalBlatt2.g:3553:2: rule__Interface__Group__5__Impl rule__Interface__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__Interface__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__5"


    // $ANTLR start "rule__Interface__Group__5__Impl"
    // InternalBlatt2.g:3560:1: rule__Interface__Group__5__Impl : ( ( rule__Interface__SignatureAssignment_5 ) ) ;
    public final void rule__Interface__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:3564:1: ( ( ( rule__Interface__SignatureAssignment_5 ) ) )
            // InternalBlatt2.g:3565:1: ( ( rule__Interface__SignatureAssignment_5 ) )
            {
            // InternalBlatt2.g:3565:1: ( ( rule__Interface__SignatureAssignment_5 ) )
            // InternalBlatt2.g:3566:2: ( rule__Interface__SignatureAssignment_5 )
            {
             before(grammarAccess.getInterfaceAccess().getSignatureAssignment_5()); 
            // InternalBlatt2.g:3567:2: ( rule__Interface__SignatureAssignment_5 )
            // InternalBlatt2.g:3567:3: rule__Interface__SignatureAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Interface__SignatureAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getSignatureAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__5__Impl"


    // $ANTLR start "rule__Interface__Group__6"
    // InternalBlatt2.g:3575:1: rule__Interface__Group__6 : rule__Interface__Group__6__Impl rule__Interface__Group__7 ;
    public final void rule__Interface__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:3579:1: ( rule__Interface__Group__6__Impl rule__Interface__Group__7 )
            // InternalBlatt2.g:3580:2: rule__Interface__Group__6__Impl rule__Interface__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__Interface__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__6"


    // $ANTLR start "rule__Interface__Group__6__Impl"
    // InternalBlatt2.g:3587:1: rule__Interface__Group__6__Impl : ( ( rule__Interface__Group_6__0 )* ) ;
    public final void rule__Interface__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:3591:1: ( ( ( rule__Interface__Group_6__0 )* ) )
            // InternalBlatt2.g:3592:1: ( ( rule__Interface__Group_6__0 )* )
            {
            // InternalBlatt2.g:3592:1: ( ( rule__Interface__Group_6__0 )* )
            // InternalBlatt2.g:3593:2: ( rule__Interface__Group_6__0 )*
            {
             before(grammarAccess.getInterfaceAccess().getGroup_6()); 
            // InternalBlatt2.g:3594:2: ( rule__Interface__Group_6__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==17) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalBlatt2.g:3594:3: rule__Interface__Group_6__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Interface__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getInterfaceAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__6__Impl"


    // $ANTLR start "rule__Interface__Group__7"
    // InternalBlatt2.g:3602:1: rule__Interface__Group__7 : rule__Interface__Group__7__Impl rule__Interface__Group__8 ;
    public final void rule__Interface__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:3606:1: ( rule__Interface__Group__7__Impl rule__Interface__Group__8 )
            // InternalBlatt2.g:3607:2: rule__Interface__Group__7__Impl rule__Interface__Group__8
            {
            pushFollow(FOLLOW_13);
            rule__Interface__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__7"


    // $ANTLR start "rule__Interface__Group__7__Impl"
    // InternalBlatt2.g:3614:1: rule__Interface__Group__7__Impl : ( '}' ) ;
    public final void rule__Interface__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:3618:1: ( ( '}' ) )
            // InternalBlatt2.g:3619:1: ( '}' )
            {
            // InternalBlatt2.g:3619:1: ( '}' )
            // InternalBlatt2.g:3620:2: '}'
            {
             before(grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_7()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__7__Impl"


    // $ANTLR start "rule__Interface__Group__8"
    // InternalBlatt2.g:3629:1: rule__Interface__Group__8 : rule__Interface__Group__8__Impl ;
    public final void rule__Interface__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:3633:1: ( rule__Interface__Group__8__Impl )
            // InternalBlatt2.g:3634:2: rule__Interface__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Interface__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__8"


    // $ANTLR start "rule__Interface__Group__8__Impl"
    // InternalBlatt2.g:3640:1: rule__Interface__Group__8__Impl : ( '}' ) ;
    public final void rule__Interface__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:3644:1: ( ( '}' ) )
            // InternalBlatt2.g:3645:1: ( '}' )
            {
            // InternalBlatt2.g:3645:1: ( '}' )
            // InternalBlatt2.g:3646:2: '}'
            {
             before(grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_8()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__8__Impl"


    // $ANTLR start "rule__Interface__Group_6__0"
    // InternalBlatt2.g:3656:1: rule__Interface__Group_6__0 : rule__Interface__Group_6__0__Impl rule__Interface__Group_6__1 ;
    public final void rule__Interface__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:3660:1: ( rule__Interface__Group_6__0__Impl rule__Interface__Group_6__1 )
            // InternalBlatt2.g:3661:2: rule__Interface__Group_6__0__Impl rule__Interface__Group_6__1
            {
            pushFollow(FOLLOW_25);
            rule__Interface__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_6__0"


    // $ANTLR start "rule__Interface__Group_6__0__Impl"
    // InternalBlatt2.g:3668:1: rule__Interface__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Interface__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:3672:1: ( ( ',' ) )
            // InternalBlatt2.g:3673:1: ( ',' )
            {
            // InternalBlatt2.g:3673:1: ( ',' )
            // InternalBlatt2.g:3674:2: ','
            {
             before(grammarAccess.getInterfaceAccess().getCommaKeyword_6_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_6__0__Impl"


    // $ANTLR start "rule__Interface__Group_6__1"
    // InternalBlatt2.g:3683:1: rule__Interface__Group_6__1 : rule__Interface__Group_6__1__Impl ;
    public final void rule__Interface__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:3687:1: ( rule__Interface__Group_6__1__Impl )
            // InternalBlatt2.g:3688:2: rule__Interface__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Interface__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_6__1"


    // $ANTLR start "rule__Interface__Group_6__1__Impl"
    // InternalBlatt2.g:3694:1: rule__Interface__Group_6__1__Impl : ( ( rule__Interface__SignatureAssignment_6_1 ) ) ;
    public final void rule__Interface__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:3698:1: ( ( ( rule__Interface__SignatureAssignment_6_1 ) ) )
            // InternalBlatt2.g:3699:1: ( ( rule__Interface__SignatureAssignment_6_1 ) )
            {
            // InternalBlatt2.g:3699:1: ( ( rule__Interface__SignatureAssignment_6_1 ) )
            // InternalBlatt2.g:3700:2: ( rule__Interface__SignatureAssignment_6_1 )
            {
             before(grammarAccess.getInterfaceAccess().getSignatureAssignment_6_1()); 
            // InternalBlatt2.g:3701:2: ( rule__Interface__SignatureAssignment_6_1 )
            // InternalBlatt2.g:3701:3: rule__Interface__SignatureAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Interface__SignatureAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getSignatureAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_6__1__Impl"


    // $ANTLR start "rule__Service__Group__0"
    // InternalBlatt2.g:3710:1: rule__Service__Group__0 : rule__Service__Group__0__Impl rule__Service__Group__1 ;
    public final void rule__Service__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:3714:1: ( rule__Service__Group__0__Impl rule__Service__Group__1 )
            // InternalBlatt2.g:3715:2: rule__Service__Group__0__Impl rule__Service__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Service__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__0"


    // $ANTLR start "rule__Service__Group__0__Impl"
    // InternalBlatt2.g:3722:1: rule__Service__Group__0__Impl : ( 'Service' ) ;
    public final void rule__Service__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:3726:1: ( ( 'Service' ) )
            // InternalBlatt2.g:3727:1: ( 'Service' )
            {
            // InternalBlatt2.g:3727:1: ( 'Service' )
            // InternalBlatt2.g:3728:2: 'Service'
            {
             before(grammarAccess.getServiceAccess().getServiceKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getServiceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__0__Impl"


    // $ANTLR start "rule__Service__Group__1"
    // InternalBlatt2.g:3737:1: rule__Service__Group__1 : rule__Service__Group__1__Impl rule__Service__Group__2 ;
    public final void rule__Service__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:3741:1: ( rule__Service__Group__1__Impl rule__Service__Group__2 )
            // InternalBlatt2.g:3742:2: rule__Service__Group__1__Impl rule__Service__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Service__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__1"


    // $ANTLR start "rule__Service__Group__1__Impl"
    // InternalBlatt2.g:3749:1: rule__Service__Group__1__Impl : ( ( rule__Service__NameAssignment_1 ) ) ;
    public final void rule__Service__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:3753:1: ( ( ( rule__Service__NameAssignment_1 ) ) )
            // InternalBlatt2.g:3754:1: ( ( rule__Service__NameAssignment_1 ) )
            {
            // InternalBlatt2.g:3754:1: ( ( rule__Service__NameAssignment_1 ) )
            // InternalBlatt2.g:3755:2: ( rule__Service__NameAssignment_1 )
            {
             before(grammarAccess.getServiceAccess().getNameAssignment_1()); 
            // InternalBlatt2.g:3756:2: ( rule__Service__NameAssignment_1 )
            // InternalBlatt2.g:3756:3: rule__Service__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Service__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__1__Impl"


    // $ANTLR start "rule__Service__Group__2"
    // InternalBlatt2.g:3764:1: rule__Service__Group__2 : rule__Service__Group__2__Impl rule__Service__Group__3 ;
    public final void rule__Service__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:3768:1: ( rule__Service__Group__2__Impl rule__Service__Group__3 )
            // InternalBlatt2.g:3769:2: rule__Service__Group__2__Impl rule__Service__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__Service__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__2"


    // $ANTLR start "rule__Service__Group__2__Impl"
    // InternalBlatt2.g:3776:1: rule__Service__Group__2__Impl : ( '{' ) ;
    public final void rule__Service__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:3780:1: ( ( '{' ) )
            // InternalBlatt2.g:3781:1: ( '{' )
            {
            // InternalBlatt2.g:3781:1: ( '{' )
            // InternalBlatt2.g:3782:2: '{'
            {
             before(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__2__Impl"


    // $ANTLR start "rule__Service__Group__3"
    // InternalBlatt2.g:3791:1: rule__Service__Group__3 : rule__Service__Group__3__Impl rule__Service__Group__4 ;
    public final void rule__Service__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:3795:1: ( rule__Service__Group__3__Impl rule__Service__Group__4 )
            // InternalBlatt2.g:3796:2: rule__Service__Group__3__Impl rule__Service__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Service__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__3"


    // $ANTLR start "rule__Service__Group__3__Impl"
    // InternalBlatt2.g:3803:1: rule__Service__Group__3__Impl : ( 'correspondingSignature' ) ;
    public final void rule__Service__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:3807:1: ( ( 'correspondingSignature' ) )
            // InternalBlatt2.g:3808:1: ( 'correspondingSignature' )
            {
            // InternalBlatt2.g:3808:1: ( 'correspondingSignature' )
            // InternalBlatt2.g:3809:2: 'correspondingSignature'
            {
             before(grammarAccess.getServiceAccess().getCorrespondingSignatureKeyword_3()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getCorrespondingSignatureKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__3__Impl"


    // $ANTLR start "rule__Service__Group__4"
    // InternalBlatt2.g:3818:1: rule__Service__Group__4 : rule__Service__Group__4__Impl rule__Service__Group__5 ;
    public final void rule__Service__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:3822:1: ( rule__Service__Group__4__Impl rule__Service__Group__5 )
            // InternalBlatt2.g:3823:2: rule__Service__Group__4__Impl rule__Service__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__Service__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__4"


    // $ANTLR start "rule__Service__Group__4__Impl"
    // InternalBlatt2.g:3830:1: rule__Service__Group__4__Impl : ( '{' ) ;
    public final void rule__Service__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:3834:1: ( ( '{' ) )
            // InternalBlatt2.g:3835:1: ( '{' )
            {
            // InternalBlatt2.g:3835:1: ( '{' )
            // InternalBlatt2.g:3836:2: '{'
            {
             before(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__4__Impl"


    // $ANTLR start "rule__Service__Group__5"
    // InternalBlatt2.g:3845:1: rule__Service__Group__5 : rule__Service__Group__5__Impl rule__Service__Group__6 ;
    public final void rule__Service__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:3849:1: ( rule__Service__Group__5__Impl rule__Service__Group__6 )
            // InternalBlatt2.g:3850:2: rule__Service__Group__5__Impl rule__Service__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__Service__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__5"


    // $ANTLR start "rule__Service__Group__5__Impl"
    // InternalBlatt2.g:3857:1: rule__Service__Group__5__Impl : ( ( rule__Service__CorrespondingSignatureAssignment_5 ) ) ;
    public final void rule__Service__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:3861:1: ( ( ( rule__Service__CorrespondingSignatureAssignment_5 ) ) )
            // InternalBlatt2.g:3862:1: ( ( rule__Service__CorrespondingSignatureAssignment_5 ) )
            {
            // InternalBlatt2.g:3862:1: ( ( rule__Service__CorrespondingSignatureAssignment_5 ) )
            // InternalBlatt2.g:3863:2: ( rule__Service__CorrespondingSignatureAssignment_5 )
            {
             before(grammarAccess.getServiceAccess().getCorrespondingSignatureAssignment_5()); 
            // InternalBlatt2.g:3864:2: ( rule__Service__CorrespondingSignatureAssignment_5 )
            // InternalBlatt2.g:3864:3: rule__Service__CorrespondingSignatureAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Service__CorrespondingSignatureAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getCorrespondingSignatureAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__5__Impl"


    // $ANTLR start "rule__Service__Group__6"
    // InternalBlatt2.g:3872:1: rule__Service__Group__6 : rule__Service__Group__6__Impl rule__Service__Group__7 ;
    public final void rule__Service__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:3876:1: ( rule__Service__Group__6__Impl rule__Service__Group__7 )
            // InternalBlatt2.g:3877:2: rule__Service__Group__6__Impl rule__Service__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__Service__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__6"


    // $ANTLR start "rule__Service__Group__6__Impl"
    // InternalBlatt2.g:3884:1: rule__Service__Group__6__Impl : ( ( rule__Service__Group_6__0 )* ) ;
    public final void rule__Service__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:3888:1: ( ( ( rule__Service__Group_6__0 )* ) )
            // InternalBlatt2.g:3889:1: ( ( rule__Service__Group_6__0 )* )
            {
            // InternalBlatt2.g:3889:1: ( ( rule__Service__Group_6__0 )* )
            // InternalBlatt2.g:3890:2: ( rule__Service__Group_6__0 )*
            {
             before(grammarAccess.getServiceAccess().getGroup_6()); 
            // InternalBlatt2.g:3891:2: ( rule__Service__Group_6__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==17) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalBlatt2.g:3891:3: rule__Service__Group_6__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Service__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getServiceAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__6__Impl"


    // $ANTLR start "rule__Service__Group__7"
    // InternalBlatt2.g:3899:1: rule__Service__Group__7 : rule__Service__Group__7__Impl rule__Service__Group__8 ;
    public final void rule__Service__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:3903:1: ( rule__Service__Group__7__Impl rule__Service__Group__8 )
            // InternalBlatt2.g:3904:2: rule__Service__Group__7__Impl rule__Service__Group__8
            {
            pushFollow(FOLLOW_13);
            rule__Service__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__7"


    // $ANTLR start "rule__Service__Group__7__Impl"
    // InternalBlatt2.g:3911:1: rule__Service__Group__7__Impl : ( '}' ) ;
    public final void rule__Service__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:3915:1: ( ( '}' ) )
            // InternalBlatt2.g:3916:1: ( '}' )
            {
            // InternalBlatt2.g:3916:1: ( '}' )
            // InternalBlatt2.g:3917:2: '}'
            {
             before(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_7()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__7__Impl"


    // $ANTLR start "rule__Service__Group__8"
    // InternalBlatt2.g:3926:1: rule__Service__Group__8 : rule__Service__Group__8__Impl ;
    public final void rule__Service__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:3930:1: ( rule__Service__Group__8__Impl )
            // InternalBlatt2.g:3931:2: rule__Service__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Service__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__8"


    // $ANTLR start "rule__Service__Group__8__Impl"
    // InternalBlatt2.g:3937:1: rule__Service__Group__8__Impl : ( '}' ) ;
    public final void rule__Service__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:3941:1: ( ( '}' ) )
            // InternalBlatt2.g:3942:1: ( '}' )
            {
            // InternalBlatt2.g:3942:1: ( '}' )
            // InternalBlatt2.g:3943:2: '}'
            {
             before(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_8()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__8__Impl"


    // $ANTLR start "rule__Service__Group_6__0"
    // InternalBlatt2.g:3953:1: rule__Service__Group_6__0 : rule__Service__Group_6__0__Impl rule__Service__Group_6__1 ;
    public final void rule__Service__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:3957:1: ( rule__Service__Group_6__0__Impl rule__Service__Group_6__1 )
            // InternalBlatt2.g:3958:2: rule__Service__Group_6__0__Impl rule__Service__Group_6__1
            {
            pushFollow(FOLLOW_25);
            rule__Service__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_6__0"


    // $ANTLR start "rule__Service__Group_6__0__Impl"
    // InternalBlatt2.g:3965:1: rule__Service__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Service__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:3969:1: ( ( ',' ) )
            // InternalBlatt2.g:3970:1: ( ',' )
            {
            // InternalBlatt2.g:3970:1: ( ',' )
            // InternalBlatt2.g:3971:2: ','
            {
             before(grammarAccess.getServiceAccess().getCommaKeyword_6_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_6__0__Impl"


    // $ANTLR start "rule__Service__Group_6__1"
    // InternalBlatt2.g:3980:1: rule__Service__Group_6__1 : rule__Service__Group_6__1__Impl ;
    public final void rule__Service__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:3984:1: ( rule__Service__Group_6__1__Impl )
            // InternalBlatt2.g:3985:2: rule__Service__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Service__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_6__1"


    // $ANTLR start "rule__Service__Group_6__1__Impl"
    // InternalBlatt2.g:3991:1: rule__Service__Group_6__1__Impl : ( ( rule__Service__CorrespondingSignatureAssignment_6_1 ) ) ;
    public final void rule__Service__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:3995:1: ( ( ( rule__Service__CorrespondingSignatureAssignment_6_1 ) ) )
            // InternalBlatt2.g:3996:1: ( ( rule__Service__CorrespondingSignatureAssignment_6_1 ) )
            {
            // InternalBlatt2.g:3996:1: ( ( rule__Service__CorrespondingSignatureAssignment_6_1 ) )
            // InternalBlatt2.g:3997:2: ( rule__Service__CorrespondingSignatureAssignment_6_1 )
            {
             before(grammarAccess.getServiceAccess().getCorrespondingSignatureAssignment_6_1()); 
            // InternalBlatt2.g:3998:2: ( rule__Service__CorrespondingSignatureAssignment_6_1 )
            // InternalBlatt2.g:3998:3: rule__Service__CorrespondingSignatureAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Service__CorrespondingSignatureAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getCorrespondingSignatureAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group_6__1__Impl"


    // $ANTLR start "rule__BehaviorDescription__Group__0"
    // InternalBlatt2.g:4007:1: rule__BehaviorDescription__Group__0 : rule__BehaviorDescription__Group__0__Impl rule__BehaviorDescription__Group__1 ;
    public final void rule__BehaviorDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:4011:1: ( rule__BehaviorDescription__Group__0__Impl rule__BehaviorDescription__Group__1 )
            // InternalBlatt2.g:4012:2: rule__BehaviorDescription__Group__0__Impl rule__BehaviorDescription__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__BehaviorDescription__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BehaviorDescription__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviorDescription__Group__0"


    // $ANTLR start "rule__BehaviorDescription__Group__0__Impl"
    // InternalBlatt2.g:4019:1: rule__BehaviorDescription__Group__0__Impl : ( () ) ;
    public final void rule__BehaviorDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:4023:1: ( ( () ) )
            // InternalBlatt2.g:4024:1: ( () )
            {
            // InternalBlatt2.g:4024:1: ( () )
            // InternalBlatt2.g:4025:2: ()
            {
             before(grammarAccess.getBehaviorDescriptionAccess().getBehaviorDescriptionAction_0()); 
            // InternalBlatt2.g:4026:2: ()
            // InternalBlatt2.g:4026:3: 
            {
            }

             after(grammarAccess.getBehaviorDescriptionAccess().getBehaviorDescriptionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviorDescription__Group__0__Impl"


    // $ANTLR start "rule__BehaviorDescription__Group__1"
    // InternalBlatt2.g:4034:1: rule__BehaviorDescription__Group__1 : rule__BehaviorDescription__Group__1__Impl rule__BehaviorDescription__Group__2 ;
    public final void rule__BehaviorDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:4038:1: ( rule__BehaviorDescription__Group__1__Impl rule__BehaviorDescription__Group__2 )
            // InternalBlatt2.g:4039:2: rule__BehaviorDescription__Group__1__Impl rule__BehaviorDescription__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__BehaviorDescription__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BehaviorDescription__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviorDescription__Group__1"


    // $ANTLR start "rule__BehaviorDescription__Group__1__Impl"
    // InternalBlatt2.g:4046:1: rule__BehaviorDescription__Group__1__Impl : ( 'BehaviorDescription' ) ;
    public final void rule__BehaviorDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:4050:1: ( ( 'BehaviorDescription' ) )
            // InternalBlatt2.g:4051:1: ( 'BehaviorDescription' )
            {
            // InternalBlatt2.g:4051:1: ( 'BehaviorDescription' )
            // InternalBlatt2.g:4052:2: 'BehaviorDescription'
            {
             before(grammarAccess.getBehaviorDescriptionAccess().getBehaviorDescriptionKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getBehaviorDescriptionAccess().getBehaviorDescriptionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviorDescription__Group__1__Impl"


    // $ANTLR start "rule__BehaviorDescription__Group__2"
    // InternalBlatt2.g:4061:1: rule__BehaviorDescription__Group__2 : rule__BehaviorDescription__Group__2__Impl rule__BehaviorDescription__Group__3 ;
    public final void rule__BehaviorDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:4065:1: ( rule__BehaviorDescription__Group__2__Impl rule__BehaviorDescription__Group__3 )
            // InternalBlatt2.g:4066:2: rule__BehaviorDescription__Group__2__Impl rule__BehaviorDescription__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__BehaviorDescription__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BehaviorDescription__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviorDescription__Group__2"


    // $ANTLR start "rule__BehaviorDescription__Group__2__Impl"
    // InternalBlatt2.g:4073:1: rule__BehaviorDescription__Group__2__Impl : ( '{' ) ;
    public final void rule__BehaviorDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:4077:1: ( ( '{' ) )
            // InternalBlatt2.g:4078:1: ( '{' )
            {
            // InternalBlatt2.g:4078:1: ( '{' )
            // InternalBlatt2.g:4079:2: '{'
            {
             before(grammarAccess.getBehaviorDescriptionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getBehaviorDescriptionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviorDescription__Group__2__Impl"


    // $ANTLR start "rule__BehaviorDescription__Group__3"
    // InternalBlatt2.g:4088:1: rule__BehaviorDescription__Group__3 : rule__BehaviorDescription__Group__3__Impl rule__BehaviorDescription__Group__4 ;
    public final void rule__BehaviorDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:4092:1: ( rule__BehaviorDescription__Group__3__Impl rule__BehaviorDescription__Group__4 )
            // InternalBlatt2.g:4093:2: rule__BehaviorDescription__Group__3__Impl rule__BehaviorDescription__Group__4
            {
            pushFollow(FOLLOW_27);
            rule__BehaviorDescription__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BehaviorDescription__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviorDescription__Group__3"


    // $ANTLR start "rule__BehaviorDescription__Group__3__Impl"
    // InternalBlatt2.g:4100:1: rule__BehaviorDescription__Group__3__Impl : ( ( rule__BehaviorDescription__Group_3__0 )? ) ;
    public final void rule__BehaviorDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:4104:1: ( ( ( rule__BehaviorDescription__Group_3__0 )? ) )
            // InternalBlatt2.g:4105:1: ( ( rule__BehaviorDescription__Group_3__0 )? )
            {
            // InternalBlatt2.g:4105:1: ( ( rule__BehaviorDescription__Group_3__0 )? )
            // InternalBlatt2.g:4106:2: ( rule__BehaviorDescription__Group_3__0 )?
            {
             before(grammarAccess.getBehaviorDescriptionAccess().getGroup_3()); 
            // InternalBlatt2.g:4107:2: ( rule__BehaviorDescription__Group_3__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==38) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalBlatt2.g:4107:3: rule__BehaviorDescription__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BehaviorDescription__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBehaviorDescriptionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviorDescription__Group__3__Impl"


    // $ANTLR start "rule__BehaviorDescription__Group__4"
    // InternalBlatt2.g:4115:1: rule__BehaviorDescription__Group__4 : rule__BehaviorDescription__Group__4__Impl rule__BehaviorDescription__Group__5 ;
    public final void rule__BehaviorDescription__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:4119:1: ( rule__BehaviorDescription__Group__4__Impl rule__BehaviorDescription__Group__5 )
            // InternalBlatt2.g:4120:2: rule__BehaviorDescription__Group__4__Impl rule__BehaviorDescription__Group__5
            {
            pushFollow(FOLLOW_27);
            rule__BehaviorDescription__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BehaviorDescription__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviorDescription__Group__4"


    // $ANTLR start "rule__BehaviorDescription__Group__4__Impl"
    // InternalBlatt2.g:4127:1: rule__BehaviorDescription__Group__4__Impl : ( ( rule__BehaviorDescription__Group_4__0 )? ) ;
    public final void rule__BehaviorDescription__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:4131:1: ( ( ( rule__BehaviorDescription__Group_4__0 )? ) )
            // InternalBlatt2.g:4132:1: ( ( rule__BehaviorDescription__Group_4__0 )? )
            {
            // InternalBlatt2.g:4132:1: ( ( rule__BehaviorDescription__Group_4__0 )? )
            // InternalBlatt2.g:4133:2: ( rule__BehaviorDescription__Group_4__0 )?
            {
             before(grammarAccess.getBehaviorDescriptionAccess().getGroup_4()); 
            // InternalBlatt2.g:4134:2: ( rule__BehaviorDescription__Group_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==39) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalBlatt2.g:4134:3: rule__BehaviorDescription__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BehaviorDescription__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBehaviorDescriptionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviorDescription__Group__4__Impl"


    // $ANTLR start "rule__BehaviorDescription__Group__5"
    // InternalBlatt2.g:4142:1: rule__BehaviorDescription__Group__5 : rule__BehaviorDescription__Group__5__Impl rule__BehaviorDescription__Group__6 ;
    public final void rule__BehaviorDescription__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:4146:1: ( rule__BehaviorDescription__Group__5__Impl rule__BehaviorDescription__Group__6 )
            // InternalBlatt2.g:4147:2: rule__BehaviorDescription__Group__5__Impl rule__BehaviorDescription__Group__6
            {
            pushFollow(FOLLOW_27);
            rule__BehaviorDescription__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BehaviorDescription__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviorDescription__Group__5"


    // $ANTLR start "rule__BehaviorDescription__Group__5__Impl"
    // InternalBlatt2.g:4154:1: rule__BehaviorDescription__Group__5__Impl : ( ( rule__BehaviorDescription__Group_5__0 )? ) ;
    public final void rule__BehaviorDescription__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:4158:1: ( ( ( rule__BehaviorDescription__Group_5__0 )? ) )
            // InternalBlatt2.g:4159:1: ( ( rule__BehaviorDescription__Group_5__0 )? )
            {
            // InternalBlatt2.g:4159:1: ( ( rule__BehaviorDescription__Group_5__0 )? )
            // InternalBlatt2.g:4160:2: ( rule__BehaviorDescription__Group_5__0 )?
            {
             before(grammarAccess.getBehaviorDescriptionAccess().getGroup_5()); 
            // InternalBlatt2.g:4161:2: ( rule__BehaviorDescription__Group_5__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==40) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalBlatt2.g:4161:3: rule__BehaviorDescription__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BehaviorDescription__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBehaviorDescriptionAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviorDescription__Group__5__Impl"


    // $ANTLR start "rule__BehaviorDescription__Group__6"
    // InternalBlatt2.g:4169:1: rule__BehaviorDescription__Group__6 : rule__BehaviorDescription__Group__6__Impl rule__BehaviorDescription__Group__7 ;
    public final void rule__BehaviorDescription__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:4173:1: ( rule__BehaviorDescription__Group__6__Impl rule__BehaviorDescription__Group__7 )
            // InternalBlatt2.g:4174:2: rule__BehaviorDescription__Group__6__Impl rule__BehaviorDescription__Group__7
            {
            pushFollow(FOLLOW_27);
            rule__BehaviorDescription__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BehaviorDescription__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviorDescription__Group__6"


    // $ANTLR start "rule__BehaviorDescription__Group__6__Impl"
    // InternalBlatt2.g:4181:1: rule__BehaviorDescription__Group__6__Impl : ( ( rule__BehaviorDescription__Group_6__0 )? ) ;
    public final void rule__BehaviorDescription__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:4185:1: ( ( ( rule__BehaviorDescription__Group_6__0 )? ) )
            // InternalBlatt2.g:4186:1: ( ( rule__BehaviorDescription__Group_6__0 )? )
            {
            // InternalBlatt2.g:4186:1: ( ( rule__BehaviorDescription__Group_6__0 )? )
            // InternalBlatt2.g:4187:2: ( rule__BehaviorDescription__Group_6__0 )?
            {
             before(grammarAccess.getBehaviorDescriptionAccess().getGroup_6()); 
            // InternalBlatt2.g:4188:2: ( rule__BehaviorDescription__Group_6__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==41) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalBlatt2.g:4188:3: rule__BehaviorDescription__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BehaviorDescription__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBehaviorDescriptionAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviorDescription__Group__6__Impl"


    // $ANTLR start "rule__BehaviorDescription__Group__7"
    // InternalBlatt2.g:4196:1: rule__BehaviorDescription__Group__7 : rule__BehaviorDescription__Group__7__Impl ;
    public final void rule__BehaviorDescription__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:4200:1: ( rule__BehaviorDescription__Group__7__Impl )
            // InternalBlatt2.g:4201:2: rule__BehaviorDescription__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BehaviorDescription__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviorDescription__Group__7"


    // $ANTLR start "rule__BehaviorDescription__Group__7__Impl"
    // InternalBlatt2.g:4207:1: rule__BehaviorDescription__Group__7__Impl : ( '}' ) ;
    public final void rule__BehaviorDescription__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:4211:1: ( ( '}' ) )
            // InternalBlatt2.g:4212:1: ( '}' )
            {
            // InternalBlatt2.g:4212:1: ( '}' )
            // InternalBlatt2.g:4213:2: '}'
            {
             before(grammarAccess.getBehaviorDescriptionAccess().getRightCurlyBracketKeyword_7()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getBehaviorDescriptionAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviorDescription__Group__7__Impl"


    // $ANTLR start "rule__BehaviorDescription__Group_3__0"
    // InternalBlatt2.g:4223:1: rule__BehaviorDescription__Group_3__0 : rule__BehaviorDescription__Group_3__0__Impl rule__BehaviorDescription__Group_3__1 ;
    public final void rule__BehaviorDescription__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:4227:1: ( rule__BehaviorDescription__Group_3__0__Impl rule__BehaviorDescription__Group_3__1 )
            // InternalBlatt2.g:4228:2: rule__BehaviorDescription__Group_3__0__Impl rule__BehaviorDescription__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__BehaviorDescription__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BehaviorDescription__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviorDescription__Group_3__0"


    // $ANTLR start "rule__BehaviorDescription__Group_3__0__Impl"
    // InternalBlatt2.g:4235:1: rule__BehaviorDescription__Group_3__0__Impl : ( 'calledServices' ) ;
    public final void rule__BehaviorDescription__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:4239:1: ( ( 'calledServices' ) )
            // InternalBlatt2.g:4240:1: ( 'calledServices' )
            {
            // InternalBlatt2.g:4240:1: ( 'calledServices' )
            // InternalBlatt2.g:4241:2: 'calledServices'
            {
             before(grammarAccess.getBehaviorDescriptionAccess().getCalledServicesKeyword_3_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getBehaviorDescriptionAccess().getCalledServicesKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviorDescription__Group_3__0__Impl"


    // $ANTLR start "rule__BehaviorDescription__Group_3__1"
    // InternalBlatt2.g:4250:1: rule__BehaviorDescription__Group_3__1 : rule__BehaviorDescription__Group_3__1__Impl rule__BehaviorDescription__Group_3__2 ;
    public final void rule__BehaviorDescription__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:4254:1: ( rule__BehaviorDescription__Group_3__1__Impl rule__BehaviorDescription__Group_3__2 )
            // InternalBlatt2.g:4255:2: rule__BehaviorDescription__Group_3__1__Impl rule__BehaviorDescription__Group_3__2
            {
            pushFollow(FOLLOW_6);
            rule__BehaviorDescription__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BehaviorDescription__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviorDescription__Group_3__1"


    // $ANTLR start "rule__BehaviorDescription__Group_3__1__Impl"
    // InternalBlatt2.g:4262:1: rule__BehaviorDescription__Group_3__1__Impl : ( '(' ) ;
    public final void rule__BehaviorDescription__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:4266:1: ( ( '(' ) )
            // InternalBlatt2.g:4267:1: ( '(' )
            {
            // InternalBlatt2.g:4267:1: ( '(' )
            // InternalBlatt2.g:4268:2: '('
            {
             before(grammarAccess.getBehaviorDescriptionAccess().getLeftParenthesisKeyword_3_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getBehaviorDescriptionAccess().getLeftParenthesisKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviorDescription__Group_3__1__Impl"


    // $ANTLR start "rule__BehaviorDescription__Group_3__2"
    // InternalBlatt2.g:4277:1: rule__BehaviorDescription__Group_3__2 : rule__BehaviorDescription__Group_3__2__Impl rule__BehaviorDescription__Group_3__3 ;
    public final void rule__BehaviorDescription__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:4281:1: ( rule__BehaviorDescription__Group_3__2__Impl rule__BehaviorDescription__Group_3__3 )
            // InternalBlatt2.g:4282:2: rule__BehaviorDescription__Group_3__2__Impl rule__BehaviorDescription__Group_3__3
            {
            pushFollow(FOLLOW_7);
            rule__BehaviorDescription__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BehaviorDescription__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviorDescription__Group_3__2"


    // $ANTLR start "rule__BehaviorDescription__Group_3__2__Impl"
    // InternalBlatt2.g:4289:1: rule__BehaviorDescription__Group_3__2__Impl : ( ( rule__BehaviorDescription__CalledServicesAssignment_3_2 ) ) ;
    public final void rule__BehaviorDescription__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:4293:1: ( ( ( rule__BehaviorDescription__CalledServicesAssignment_3_2 ) ) )
            // InternalBlatt2.g:4294:1: ( ( rule__BehaviorDescription__CalledServicesAssignment_3_2 ) )
            {
            // InternalBlatt2.g:4294:1: ( ( rule__BehaviorDescription__CalledServicesAssignment_3_2 ) )
            // InternalBlatt2.g:4295:2: ( rule__BehaviorDescription__CalledServicesAssignment_3_2 )
            {
             before(grammarAccess.getBehaviorDescriptionAccess().getCalledServicesAssignment_3_2()); 
            // InternalBlatt2.g:4296:2: ( rule__BehaviorDescription__CalledServicesAssignment_3_2 )
            // InternalBlatt2.g:4296:3: rule__BehaviorDescription__CalledServicesAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__BehaviorDescription__CalledServicesAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getBehaviorDescriptionAccess().getCalledServicesAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviorDescription__Group_3__2__Impl"


    // $ANTLR start "rule__BehaviorDescription__Group_3__3"
    // InternalBlatt2.g:4304:1: rule__BehaviorDescription__Group_3__3 : rule__BehaviorDescription__Group_3__3__Impl rule__BehaviorDescription__Group_3__4 ;
    public final void rule__BehaviorDescription__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:4308:1: ( rule__BehaviorDescription__Group_3__3__Impl rule__BehaviorDescription__Group_3__4 )
            // InternalBlatt2.g:4309:2: rule__BehaviorDescription__Group_3__3__Impl rule__BehaviorDescription__Group_3__4
            {
            pushFollow(FOLLOW_7);
            rule__BehaviorDescription__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BehaviorDescription__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviorDescription__Group_3__3"


    // $ANTLR start "rule__BehaviorDescription__Group_3__3__Impl"
    // InternalBlatt2.g:4316:1: rule__BehaviorDescription__Group_3__3__Impl : ( ( rule__BehaviorDescription__Group_3_3__0 )* ) ;
    public final void rule__BehaviorDescription__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:4320:1: ( ( ( rule__BehaviorDescription__Group_3_3__0 )* ) )
            // InternalBlatt2.g:4321:1: ( ( rule__BehaviorDescription__Group_3_3__0 )* )
            {
            // InternalBlatt2.g:4321:1: ( ( rule__BehaviorDescription__Group_3_3__0 )* )
            // InternalBlatt2.g:4322:2: ( rule__BehaviorDescription__Group_3_3__0 )*
            {
             before(grammarAccess.getBehaviorDescriptionAccess().getGroup_3_3()); 
            // InternalBlatt2.g:4323:2: ( rule__BehaviorDescription__Group_3_3__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==17) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalBlatt2.g:4323:3: rule__BehaviorDescription__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__BehaviorDescription__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getBehaviorDescriptionAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviorDescription__Group_3__3__Impl"


    // $ANTLR start "rule__BehaviorDescription__Group_3__4"
    // InternalBlatt2.g:4331:1: rule__BehaviorDescription__Group_3__4 : rule__BehaviorDescription__Group_3__4__Impl ;
    public final void rule__BehaviorDescription__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:4335:1: ( rule__BehaviorDescription__Group_3__4__Impl )
            // InternalBlatt2.g:4336:2: rule__BehaviorDescription__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BehaviorDescription__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviorDescription__Group_3__4"


    // $ANTLR start "rule__BehaviorDescription__Group_3__4__Impl"
    // InternalBlatt2.g:4342:1: rule__BehaviorDescription__Group_3__4__Impl : ( ')' ) ;
    public final void rule__BehaviorDescription__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:4346:1: ( ( ')' ) )
            // InternalBlatt2.g:4347:1: ( ')' )
            {
            // InternalBlatt2.g:4347:1: ( ')' )
            // InternalBlatt2.g:4348:2: ')'
            {
             before(grammarAccess.getBehaviorDescriptionAccess().getRightParenthesisKeyword_3_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getBehaviorDescriptionAccess().getRightParenthesisKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviorDescription__Group_3__4__Impl"


    // $ANTLR start "rule__BehaviorDescription__Group_3_3__0"
    // InternalBlatt2.g:4358:1: rule__BehaviorDescription__Group_3_3__0 : rule__BehaviorDescription__Group_3_3__0__Impl rule__BehaviorDescription__Group_3_3__1 ;
    public final void rule__BehaviorDescription__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:4362:1: ( rule__BehaviorDescription__Group_3_3__0__Impl rule__BehaviorDescription__Group_3_3__1 )
            // InternalBlatt2.g:4363:2: rule__BehaviorDescription__Group_3_3__0__Impl rule__BehaviorDescription__Group_3_3__1
            {
            pushFollow(FOLLOW_6);
            rule__BehaviorDescription__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BehaviorDescription__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviorDescription__Group_3_3__0"


    // $ANTLR start "rule__BehaviorDescription__Group_3_3__0__Impl"
    // InternalBlatt2.g:4370:1: rule__BehaviorDescription__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__BehaviorDescription__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:4374:1: ( ( ',' ) )
            // InternalBlatt2.g:4375:1: ( ',' )
            {
            // InternalBlatt2.g:4375:1: ( ',' )
            // InternalBlatt2.g:4376:2: ','
            {
             before(grammarAccess.getBehaviorDescriptionAccess().getCommaKeyword_3_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getBehaviorDescriptionAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviorDescription__Group_3_3__0__Impl"


    // $ANTLR start "rule__BehaviorDescription__Group_3_3__1"
    // InternalBlatt2.g:4385:1: rule__BehaviorDescription__Group_3_3__1 : rule__BehaviorDescription__Group_3_3__1__Impl ;
    public final void rule__BehaviorDescription__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:4389:1: ( rule__BehaviorDescription__Group_3_3__1__Impl )
            // InternalBlatt2.g:4390:2: rule__BehaviorDescription__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BehaviorDescription__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviorDescription__Group_3_3__1"


    // $ANTLR start "rule__BehaviorDescription__Group_3_3__1__Impl"
    // InternalBlatt2.g:4396:1: rule__BehaviorDescription__Group_3_3__1__Impl : ( ( rule__BehaviorDescription__CalledServicesAssignment_3_3_1 ) ) ;
    public final void rule__BehaviorDescription__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:4400:1: ( ( ( rule__BehaviorDescription__CalledServicesAssignment_3_3_1 ) ) )
            // InternalBlatt2.g:4401:1: ( ( rule__BehaviorDescription__CalledServicesAssignment_3_3_1 ) )
            {
            // InternalBlatt2.g:4401:1: ( ( rule__BehaviorDescription__CalledServicesAssignment_3_3_1 ) )
            // InternalBlatt2.g:4402:2: ( rule__BehaviorDescription__CalledServicesAssignment_3_3_1 )
            {
             before(grammarAccess.getBehaviorDescriptionAccess().getCalledServicesAssignment_3_3_1()); 
            // InternalBlatt2.g:4403:2: ( rule__BehaviorDescription__CalledServicesAssignment_3_3_1 )
            // InternalBlatt2.g:4403:3: rule__BehaviorDescription__CalledServicesAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__BehaviorDescription__CalledServicesAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBehaviorDescriptionAccess().getCalledServicesAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviorDescription__Group_3_3__1__Impl"


    // $ANTLR start "rule__BehaviorDescription__Group_4__0"
    // InternalBlatt2.g:4412:1: rule__BehaviorDescription__Group_4__0 : rule__BehaviorDescription__Group_4__0__Impl rule__BehaviorDescription__Group_4__1 ;
    public final void rule__BehaviorDescription__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:4416:1: ( rule__BehaviorDescription__Group_4__0__Impl rule__BehaviorDescription__Group_4__1 )
            // InternalBlatt2.g:4417:2: rule__BehaviorDescription__Group_4__0__Impl rule__BehaviorDescription__Group_4__1
            {
            pushFollow(FOLLOW_28);
            rule__BehaviorDescription__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BehaviorDescription__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviorDescription__Group_4__0"


    // $ANTLR start "rule__BehaviorDescription__Group_4__0__Impl"
    // InternalBlatt2.g:4424:1: rule__BehaviorDescription__Group_4__0__Impl : ( 'internalActions' ) ;
    public final void rule__BehaviorDescription__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:4428:1: ( ( 'internalActions' ) )
            // InternalBlatt2.g:4429:1: ( 'internalActions' )
            {
            // InternalBlatt2.g:4429:1: ( 'internalActions' )
            // InternalBlatt2.g:4430:2: 'internalActions'
            {
             before(grammarAccess.getBehaviorDescriptionAccess().getInternalActionsKeyword_4_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getBehaviorDescriptionAccess().getInternalActionsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviorDescription__Group_4__0__Impl"


    // $ANTLR start "rule__BehaviorDescription__Group_4__1"
    // InternalBlatt2.g:4439:1: rule__BehaviorDescription__Group_4__1 : rule__BehaviorDescription__Group_4__1__Impl ;
    public final void rule__BehaviorDescription__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:4443:1: ( rule__BehaviorDescription__Group_4__1__Impl )
            // InternalBlatt2.g:4444:2: rule__BehaviorDescription__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BehaviorDescription__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviorDescription__Group_4__1"


    // $ANTLR start "rule__BehaviorDescription__Group_4__1__Impl"
    // InternalBlatt2.g:4450:1: rule__BehaviorDescription__Group_4__1__Impl : ( ( rule__BehaviorDescription__InternalActionsAssignment_4_1 ) ) ;
    public final void rule__BehaviorDescription__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:4454:1: ( ( ( rule__BehaviorDescription__InternalActionsAssignment_4_1 ) ) )
            // InternalBlatt2.g:4455:1: ( ( rule__BehaviorDescription__InternalActionsAssignment_4_1 ) )
            {
            // InternalBlatt2.g:4455:1: ( ( rule__BehaviorDescription__InternalActionsAssignment_4_1 ) )
            // InternalBlatt2.g:4456:2: ( rule__BehaviorDescription__InternalActionsAssignment_4_1 )
            {
             before(grammarAccess.getBehaviorDescriptionAccess().getInternalActionsAssignment_4_1()); 
            // InternalBlatt2.g:4457:2: ( rule__BehaviorDescription__InternalActionsAssignment_4_1 )
            // InternalBlatt2.g:4457:3: rule__BehaviorDescription__InternalActionsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__BehaviorDescription__InternalActionsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getBehaviorDescriptionAccess().getInternalActionsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviorDescription__Group_4__1__Impl"


    // $ANTLR start "rule__BehaviorDescription__Group_5__0"
    // InternalBlatt2.g:4466:1: rule__BehaviorDescription__Group_5__0 : rule__BehaviorDescription__Group_5__0__Impl rule__BehaviorDescription__Group_5__1 ;
    public final void rule__BehaviorDescription__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:4470:1: ( rule__BehaviorDescription__Group_5__0__Impl rule__BehaviorDescription__Group_5__1 )
            // InternalBlatt2.g:4471:2: rule__BehaviorDescription__Group_5__0__Impl rule__BehaviorDescription__Group_5__1
            {
            pushFollow(FOLLOW_29);
            rule__BehaviorDescription__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BehaviorDescription__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviorDescription__Group_5__0"


    // $ANTLR start "rule__BehaviorDescription__Group_5__0__Impl"
    // InternalBlatt2.g:4478:1: rule__BehaviorDescription__Group_5__0__Impl : ( 'loops' ) ;
    public final void rule__BehaviorDescription__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:4482:1: ( ( 'loops' ) )
            // InternalBlatt2.g:4483:1: ( 'loops' )
            {
            // InternalBlatt2.g:4483:1: ( 'loops' )
            // InternalBlatt2.g:4484:2: 'loops'
            {
             before(grammarAccess.getBehaviorDescriptionAccess().getLoopsKeyword_5_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getBehaviorDescriptionAccess().getLoopsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviorDescription__Group_5__0__Impl"


    // $ANTLR start "rule__BehaviorDescription__Group_5__1"
    // InternalBlatt2.g:4493:1: rule__BehaviorDescription__Group_5__1 : rule__BehaviorDescription__Group_5__1__Impl ;
    public final void rule__BehaviorDescription__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:4497:1: ( rule__BehaviorDescription__Group_5__1__Impl )
            // InternalBlatt2.g:4498:2: rule__BehaviorDescription__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BehaviorDescription__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviorDescription__Group_5__1"


    // $ANTLR start "rule__BehaviorDescription__Group_5__1__Impl"
    // InternalBlatt2.g:4504:1: rule__BehaviorDescription__Group_5__1__Impl : ( ( rule__BehaviorDescription__LoopsAssignment_5_1 ) ) ;
    public final void rule__BehaviorDescription__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:4508:1: ( ( ( rule__BehaviorDescription__LoopsAssignment_5_1 ) ) )
            // InternalBlatt2.g:4509:1: ( ( rule__BehaviorDescription__LoopsAssignment_5_1 ) )
            {
            // InternalBlatt2.g:4509:1: ( ( rule__BehaviorDescription__LoopsAssignment_5_1 ) )
            // InternalBlatt2.g:4510:2: ( rule__BehaviorDescription__LoopsAssignment_5_1 )
            {
             before(grammarAccess.getBehaviorDescriptionAccess().getLoopsAssignment_5_1()); 
            // InternalBlatt2.g:4511:2: ( rule__BehaviorDescription__LoopsAssignment_5_1 )
            // InternalBlatt2.g:4511:3: rule__BehaviorDescription__LoopsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__BehaviorDescription__LoopsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getBehaviorDescriptionAccess().getLoopsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviorDescription__Group_5__1__Impl"


    // $ANTLR start "rule__BehaviorDescription__Group_6__0"
    // InternalBlatt2.g:4520:1: rule__BehaviorDescription__Group_6__0 : rule__BehaviorDescription__Group_6__0__Impl rule__BehaviorDescription__Group_6__1 ;
    public final void rule__BehaviorDescription__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:4524:1: ( rule__BehaviorDescription__Group_6__0__Impl rule__BehaviorDescription__Group_6__1 )
            // InternalBlatt2.g:4525:2: rule__BehaviorDescription__Group_6__0__Impl rule__BehaviorDescription__Group_6__1
            {
            pushFollow(FOLLOW_30);
            rule__BehaviorDescription__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BehaviorDescription__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviorDescription__Group_6__0"


    // $ANTLR start "rule__BehaviorDescription__Group_6__0__Impl"
    // InternalBlatt2.g:4532:1: rule__BehaviorDescription__Group_6__0__Impl : ( 'branches' ) ;
    public final void rule__BehaviorDescription__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:4536:1: ( ( 'branches' ) )
            // InternalBlatt2.g:4537:1: ( 'branches' )
            {
            // InternalBlatt2.g:4537:1: ( 'branches' )
            // InternalBlatt2.g:4538:2: 'branches'
            {
             before(grammarAccess.getBehaviorDescriptionAccess().getBranchesKeyword_6_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getBehaviorDescriptionAccess().getBranchesKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviorDescription__Group_6__0__Impl"


    // $ANTLR start "rule__BehaviorDescription__Group_6__1"
    // InternalBlatt2.g:4547:1: rule__BehaviorDescription__Group_6__1 : rule__BehaviorDescription__Group_6__1__Impl ;
    public final void rule__BehaviorDescription__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:4551:1: ( rule__BehaviorDescription__Group_6__1__Impl )
            // InternalBlatt2.g:4552:2: rule__BehaviorDescription__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BehaviorDescription__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviorDescription__Group_6__1"


    // $ANTLR start "rule__BehaviorDescription__Group_6__1__Impl"
    // InternalBlatt2.g:4558:1: rule__BehaviorDescription__Group_6__1__Impl : ( ( rule__BehaviorDescription__BranchesAssignment_6_1 ) ) ;
    public final void rule__BehaviorDescription__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:4562:1: ( ( ( rule__BehaviorDescription__BranchesAssignment_6_1 ) ) )
            // InternalBlatt2.g:4563:1: ( ( rule__BehaviorDescription__BranchesAssignment_6_1 ) )
            {
            // InternalBlatt2.g:4563:1: ( ( rule__BehaviorDescription__BranchesAssignment_6_1 ) )
            // InternalBlatt2.g:4564:2: ( rule__BehaviorDescription__BranchesAssignment_6_1 )
            {
             before(grammarAccess.getBehaviorDescriptionAccess().getBranchesAssignment_6_1()); 
            // InternalBlatt2.g:4565:2: ( rule__BehaviorDescription__BranchesAssignment_6_1 )
            // InternalBlatt2.g:4565:3: rule__BehaviorDescription__BranchesAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__BehaviorDescription__BranchesAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getBehaviorDescriptionAccess().getBranchesAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviorDescription__Group_6__1__Impl"


    // $ANTLR start "rule__CompositeComponent__Group__0"
    // InternalBlatt2.g:4574:1: rule__CompositeComponent__Group__0 : rule__CompositeComponent__Group__0__Impl rule__CompositeComponent__Group__1 ;
    public final void rule__CompositeComponent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:4578:1: ( rule__CompositeComponent__Group__0__Impl rule__CompositeComponent__Group__1 )
            // InternalBlatt2.g:4579:2: rule__CompositeComponent__Group__0__Impl rule__CompositeComponent__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__CompositeComponent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__0"


    // $ANTLR start "rule__CompositeComponent__Group__0__Impl"
    // InternalBlatt2.g:4586:1: rule__CompositeComponent__Group__0__Impl : ( 'CompositeComponent' ) ;
    public final void rule__CompositeComponent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:4590:1: ( ( 'CompositeComponent' ) )
            // InternalBlatt2.g:4591:1: ( 'CompositeComponent' )
            {
            // InternalBlatt2.g:4591:1: ( 'CompositeComponent' )
            // InternalBlatt2.g:4592:2: 'CompositeComponent'
            {
             before(grammarAccess.getCompositeComponentAccess().getCompositeComponentKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getCompositeComponentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__0__Impl"


    // $ANTLR start "rule__CompositeComponent__Group__1"
    // InternalBlatt2.g:4601:1: rule__CompositeComponent__Group__1 : rule__CompositeComponent__Group__1__Impl rule__CompositeComponent__Group__2 ;
    public final void rule__CompositeComponent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:4605:1: ( rule__CompositeComponent__Group__1__Impl rule__CompositeComponent__Group__2 )
            // InternalBlatt2.g:4606:2: rule__CompositeComponent__Group__1__Impl rule__CompositeComponent__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__CompositeComponent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__1"


    // $ANTLR start "rule__CompositeComponent__Group__1__Impl"
    // InternalBlatt2.g:4613:1: rule__CompositeComponent__Group__1__Impl : ( ( rule__CompositeComponent__NameAssignment_1 ) ) ;
    public final void rule__CompositeComponent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:4617:1: ( ( ( rule__CompositeComponent__NameAssignment_1 ) ) )
            // InternalBlatt2.g:4618:1: ( ( rule__CompositeComponent__NameAssignment_1 ) )
            {
            // InternalBlatt2.g:4618:1: ( ( rule__CompositeComponent__NameAssignment_1 ) )
            // InternalBlatt2.g:4619:2: ( rule__CompositeComponent__NameAssignment_1 )
            {
             before(grammarAccess.getCompositeComponentAccess().getNameAssignment_1()); 
            // InternalBlatt2.g:4620:2: ( rule__CompositeComponent__NameAssignment_1 )
            // InternalBlatt2.g:4620:3: rule__CompositeComponent__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeComponentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__1__Impl"


    // $ANTLR start "rule__CompositeComponent__Group__2"
    // InternalBlatt2.g:4628:1: rule__CompositeComponent__Group__2 : rule__CompositeComponent__Group__2__Impl rule__CompositeComponent__Group__3 ;
    public final void rule__CompositeComponent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:4632:1: ( rule__CompositeComponent__Group__2__Impl rule__CompositeComponent__Group__3 )
            // InternalBlatt2.g:4633:2: rule__CompositeComponent__Group__2__Impl rule__CompositeComponent__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__CompositeComponent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__2"


    // $ANTLR start "rule__CompositeComponent__Group__2__Impl"
    // InternalBlatt2.g:4640:1: rule__CompositeComponent__Group__2__Impl : ( '{' ) ;
    public final void rule__CompositeComponent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:4644:1: ( ( '{' ) )
            // InternalBlatt2.g:4645:1: ( '{' )
            {
            // InternalBlatt2.g:4645:1: ( '{' )
            // InternalBlatt2.g:4646:2: '{'
            {
             before(grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__2__Impl"


    // $ANTLR start "rule__CompositeComponent__Group__3"
    // InternalBlatt2.g:4655:1: rule__CompositeComponent__Group__3 : rule__CompositeComponent__Group__3__Impl rule__CompositeComponent__Group__4 ;
    public final void rule__CompositeComponent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:4659:1: ( rule__CompositeComponent__Group__3__Impl rule__CompositeComponent__Group__4 )
            // InternalBlatt2.g:4660:2: rule__CompositeComponent__Group__3__Impl rule__CompositeComponent__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__CompositeComponent__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__3"


    // $ANTLR start "rule__CompositeComponent__Group__3__Impl"
    // InternalBlatt2.g:4667:1: rule__CompositeComponent__Group__3__Impl : ( ( rule__CompositeComponent__Group_3__0 )? ) ;
    public final void rule__CompositeComponent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:4671:1: ( ( ( rule__CompositeComponent__Group_3__0 )? ) )
            // InternalBlatt2.g:4672:1: ( ( rule__CompositeComponent__Group_3__0 )? )
            {
            // InternalBlatt2.g:4672:1: ( ( rule__CompositeComponent__Group_3__0 )? )
            // InternalBlatt2.g:4673:2: ( rule__CompositeComponent__Group_3__0 )?
            {
             before(grammarAccess.getCompositeComponentAccess().getGroup_3()); 
            // InternalBlatt2.g:4674:2: ( rule__CompositeComponent__Group_3__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==31) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalBlatt2.g:4674:3: rule__CompositeComponent__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompositeComponent__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompositeComponentAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__3__Impl"


    // $ANTLR start "rule__CompositeComponent__Group__4"
    // InternalBlatt2.g:4682:1: rule__CompositeComponent__Group__4 : rule__CompositeComponent__Group__4__Impl rule__CompositeComponent__Group__5 ;
    public final void rule__CompositeComponent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:4686:1: ( rule__CompositeComponent__Group__4__Impl rule__CompositeComponent__Group__5 )
            // InternalBlatt2.g:4687:2: rule__CompositeComponent__Group__4__Impl rule__CompositeComponent__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__CompositeComponent__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__4"


    // $ANTLR start "rule__CompositeComponent__Group__4__Impl"
    // InternalBlatt2.g:4694:1: rule__CompositeComponent__Group__4__Impl : ( 'requiredService' ) ;
    public final void rule__CompositeComponent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:4698:1: ( ( 'requiredService' ) )
            // InternalBlatt2.g:4699:1: ( 'requiredService' )
            {
            // InternalBlatt2.g:4699:1: ( 'requiredService' )
            // InternalBlatt2.g:4700:2: 'requiredService'
            {
             before(grammarAccess.getCompositeComponentAccess().getRequiredServiceKeyword_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getRequiredServiceKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__4__Impl"


    // $ANTLR start "rule__CompositeComponent__Group__5"
    // InternalBlatt2.g:4709:1: rule__CompositeComponent__Group__5 : rule__CompositeComponent__Group__5__Impl rule__CompositeComponent__Group__6 ;
    public final void rule__CompositeComponent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:4713:1: ( rule__CompositeComponent__Group__5__Impl rule__CompositeComponent__Group__6 )
            // InternalBlatt2.g:4714:2: rule__CompositeComponent__Group__5__Impl rule__CompositeComponent__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__CompositeComponent__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__5"


    // $ANTLR start "rule__CompositeComponent__Group__5__Impl"
    // InternalBlatt2.g:4721:1: rule__CompositeComponent__Group__5__Impl : ( '(' ) ;
    public final void rule__CompositeComponent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:4725:1: ( ( '(' ) )
            // InternalBlatt2.g:4726:1: ( '(' )
            {
            // InternalBlatt2.g:4726:1: ( '(' )
            // InternalBlatt2.g:4727:2: '('
            {
             before(grammarAccess.getCompositeComponentAccess().getLeftParenthesisKeyword_5()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getLeftParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__5__Impl"


    // $ANTLR start "rule__CompositeComponent__Group__6"
    // InternalBlatt2.g:4736:1: rule__CompositeComponent__Group__6 : rule__CompositeComponent__Group__6__Impl rule__CompositeComponent__Group__7 ;
    public final void rule__CompositeComponent__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:4740:1: ( rule__CompositeComponent__Group__6__Impl rule__CompositeComponent__Group__7 )
            // InternalBlatt2.g:4741:2: rule__CompositeComponent__Group__6__Impl rule__CompositeComponent__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__CompositeComponent__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__6"


    // $ANTLR start "rule__CompositeComponent__Group__6__Impl"
    // InternalBlatt2.g:4748:1: rule__CompositeComponent__Group__6__Impl : ( ( rule__CompositeComponent__RequiredServiceAssignment_6 ) ) ;
    public final void rule__CompositeComponent__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:4752:1: ( ( ( rule__CompositeComponent__RequiredServiceAssignment_6 ) ) )
            // InternalBlatt2.g:4753:1: ( ( rule__CompositeComponent__RequiredServiceAssignment_6 ) )
            {
            // InternalBlatt2.g:4753:1: ( ( rule__CompositeComponent__RequiredServiceAssignment_6 ) )
            // InternalBlatt2.g:4754:2: ( rule__CompositeComponent__RequiredServiceAssignment_6 )
            {
             before(grammarAccess.getCompositeComponentAccess().getRequiredServiceAssignment_6()); 
            // InternalBlatt2.g:4755:2: ( rule__CompositeComponent__RequiredServiceAssignment_6 )
            // InternalBlatt2.g:4755:3: rule__CompositeComponent__RequiredServiceAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__RequiredServiceAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getCompositeComponentAccess().getRequiredServiceAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__6__Impl"


    // $ANTLR start "rule__CompositeComponent__Group__7"
    // InternalBlatt2.g:4763:1: rule__CompositeComponent__Group__7 : rule__CompositeComponent__Group__7__Impl rule__CompositeComponent__Group__8 ;
    public final void rule__CompositeComponent__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:4767:1: ( rule__CompositeComponent__Group__7__Impl rule__CompositeComponent__Group__8 )
            // InternalBlatt2.g:4768:2: rule__CompositeComponent__Group__7__Impl rule__CompositeComponent__Group__8
            {
            pushFollow(FOLLOW_7);
            rule__CompositeComponent__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__7"


    // $ANTLR start "rule__CompositeComponent__Group__7__Impl"
    // InternalBlatt2.g:4775:1: rule__CompositeComponent__Group__7__Impl : ( ( rule__CompositeComponent__Group_7__0 )* ) ;
    public final void rule__CompositeComponent__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:4779:1: ( ( ( rule__CompositeComponent__Group_7__0 )* ) )
            // InternalBlatt2.g:4780:1: ( ( rule__CompositeComponent__Group_7__0 )* )
            {
            // InternalBlatt2.g:4780:1: ( ( rule__CompositeComponent__Group_7__0 )* )
            // InternalBlatt2.g:4781:2: ( rule__CompositeComponent__Group_7__0 )*
            {
             before(grammarAccess.getCompositeComponentAccess().getGroup_7()); 
            // InternalBlatt2.g:4782:2: ( rule__CompositeComponent__Group_7__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==17) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalBlatt2.g:4782:3: rule__CompositeComponent__Group_7__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__CompositeComponent__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getCompositeComponentAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__7__Impl"


    // $ANTLR start "rule__CompositeComponent__Group__8"
    // InternalBlatt2.g:4790:1: rule__CompositeComponent__Group__8 : rule__CompositeComponent__Group__8__Impl rule__CompositeComponent__Group__9 ;
    public final void rule__CompositeComponent__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:4794:1: ( rule__CompositeComponent__Group__8__Impl rule__CompositeComponent__Group__9 )
            // InternalBlatt2.g:4795:2: rule__CompositeComponent__Group__8__Impl rule__CompositeComponent__Group__9
            {
            pushFollow(FOLLOW_19);
            rule__CompositeComponent__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__8"


    // $ANTLR start "rule__CompositeComponent__Group__8__Impl"
    // InternalBlatt2.g:4802:1: rule__CompositeComponent__Group__8__Impl : ( ')' ) ;
    public final void rule__CompositeComponent__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:4806:1: ( ( ')' ) )
            // InternalBlatt2.g:4807:1: ( ')' )
            {
            // InternalBlatt2.g:4807:1: ( ')' )
            // InternalBlatt2.g:4808:2: ')'
            {
             before(grammarAccess.getCompositeComponentAccess().getRightParenthesisKeyword_8()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getRightParenthesisKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__8__Impl"


    // $ANTLR start "rule__CompositeComponent__Group__9"
    // InternalBlatt2.g:4817:1: rule__CompositeComponent__Group__9 : rule__CompositeComponent__Group__9__Impl rule__CompositeComponent__Group__10 ;
    public final void rule__CompositeComponent__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:4821:1: ( rule__CompositeComponent__Group__9__Impl rule__CompositeComponent__Group__10 )
            // InternalBlatt2.g:4822:2: rule__CompositeComponent__Group__9__Impl rule__CompositeComponent__Group__10
            {
            pushFollow(FOLLOW_19);
            rule__CompositeComponent__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__9"


    // $ANTLR start "rule__CompositeComponent__Group__9__Impl"
    // InternalBlatt2.g:4829:1: rule__CompositeComponent__Group__9__Impl : ( ( rule__CompositeComponent__Group_9__0 )? ) ;
    public final void rule__CompositeComponent__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:4833:1: ( ( ( rule__CompositeComponent__Group_9__0 )? ) )
            // InternalBlatt2.g:4834:1: ( ( rule__CompositeComponent__Group_9__0 )? )
            {
            // InternalBlatt2.g:4834:1: ( ( rule__CompositeComponent__Group_9__0 )? )
            // InternalBlatt2.g:4835:2: ( rule__CompositeComponent__Group_9__0 )?
            {
             before(grammarAccess.getCompositeComponentAccess().getGroup_9()); 
            // InternalBlatt2.g:4836:2: ( rule__CompositeComponent__Group_9__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==32) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalBlatt2.g:4836:3: rule__CompositeComponent__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompositeComponent__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompositeComponentAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__9__Impl"


    // $ANTLR start "rule__CompositeComponent__Group__10"
    // InternalBlatt2.g:4844:1: rule__CompositeComponent__Group__10 : rule__CompositeComponent__Group__10__Impl rule__CompositeComponent__Group__11 ;
    public final void rule__CompositeComponent__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:4848:1: ( rule__CompositeComponent__Group__10__Impl rule__CompositeComponent__Group__11 )
            // InternalBlatt2.g:4849:2: rule__CompositeComponent__Group__10__Impl rule__CompositeComponent__Group__11
            {
            pushFollow(FOLLOW_3);
            rule__CompositeComponent__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__10"


    // $ANTLR start "rule__CompositeComponent__Group__10__Impl"
    // InternalBlatt2.g:4856:1: rule__CompositeComponent__Group__10__Impl : ( 'providedService' ) ;
    public final void rule__CompositeComponent__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:4860:1: ( ( 'providedService' ) )
            // InternalBlatt2.g:4861:1: ( 'providedService' )
            {
            // InternalBlatt2.g:4861:1: ( 'providedService' )
            // InternalBlatt2.g:4862:2: 'providedService'
            {
             before(grammarAccess.getCompositeComponentAccess().getProvidedServiceKeyword_10()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getProvidedServiceKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__10__Impl"


    // $ANTLR start "rule__CompositeComponent__Group__11"
    // InternalBlatt2.g:4871:1: rule__CompositeComponent__Group__11 : rule__CompositeComponent__Group__11__Impl rule__CompositeComponent__Group__12 ;
    public final void rule__CompositeComponent__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:4875:1: ( rule__CompositeComponent__Group__11__Impl rule__CompositeComponent__Group__12 )
            // InternalBlatt2.g:4876:2: rule__CompositeComponent__Group__11__Impl rule__CompositeComponent__Group__12
            {
            pushFollow(FOLLOW_20);
            rule__CompositeComponent__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__11"


    // $ANTLR start "rule__CompositeComponent__Group__11__Impl"
    // InternalBlatt2.g:4883:1: rule__CompositeComponent__Group__11__Impl : ( '{' ) ;
    public final void rule__CompositeComponent__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:4887:1: ( ( '{' ) )
            // InternalBlatt2.g:4888:1: ( '{' )
            {
            // InternalBlatt2.g:4888:1: ( '{' )
            // InternalBlatt2.g:4889:2: '{'
            {
             before(grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_11()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__11__Impl"


    // $ANTLR start "rule__CompositeComponent__Group__12"
    // InternalBlatt2.g:4898:1: rule__CompositeComponent__Group__12 : rule__CompositeComponent__Group__12__Impl rule__CompositeComponent__Group__13 ;
    public final void rule__CompositeComponent__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:4902:1: ( rule__CompositeComponent__Group__12__Impl rule__CompositeComponent__Group__13 )
            // InternalBlatt2.g:4903:2: rule__CompositeComponent__Group__12__Impl rule__CompositeComponent__Group__13
            {
            pushFollow(FOLLOW_11);
            rule__CompositeComponent__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__12"


    // $ANTLR start "rule__CompositeComponent__Group__12__Impl"
    // InternalBlatt2.g:4910:1: rule__CompositeComponent__Group__12__Impl : ( ( rule__CompositeComponent__ProvidedServiceAssignment_12 ) ) ;
    public final void rule__CompositeComponent__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:4914:1: ( ( ( rule__CompositeComponent__ProvidedServiceAssignment_12 ) ) )
            // InternalBlatt2.g:4915:1: ( ( rule__CompositeComponent__ProvidedServiceAssignment_12 ) )
            {
            // InternalBlatt2.g:4915:1: ( ( rule__CompositeComponent__ProvidedServiceAssignment_12 ) )
            // InternalBlatt2.g:4916:2: ( rule__CompositeComponent__ProvidedServiceAssignment_12 )
            {
             before(grammarAccess.getCompositeComponentAccess().getProvidedServiceAssignment_12()); 
            // InternalBlatt2.g:4917:2: ( rule__CompositeComponent__ProvidedServiceAssignment_12 )
            // InternalBlatt2.g:4917:3: rule__CompositeComponent__ProvidedServiceAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__ProvidedServiceAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getCompositeComponentAccess().getProvidedServiceAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__12__Impl"


    // $ANTLR start "rule__CompositeComponent__Group__13"
    // InternalBlatt2.g:4925:1: rule__CompositeComponent__Group__13 : rule__CompositeComponent__Group__13__Impl rule__CompositeComponent__Group__14 ;
    public final void rule__CompositeComponent__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:4929:1: ( rule__CompositeComponent__Group__13__Impl rule__CompositeComponent__Group__14 )
            // InternalBlatt2.g:4930:2: rule__CompositeComponent__Group__13__Impl rule__CompositeComponent__Group__14
            {
            pushFollow(FOLLOW_11);
            rule__CompositeComponent__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__13"


    // $ANTLR start "rule__CompositeComponent__Group__13__Impl"
    // InternalBlatt2.g:4937:1: rule__CompositeComponent__Group__13__Impl : ( ( rule__CompositeComponent__Group_13__0 )* ) ;
    public final void rule__CompositeComponent__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:4941:1: ( ( ( rule__CompositeComponent__Group_13__0 )* ) )
            // InternalBlatt2.g:4942:1: ( ( rule__CompositeComponent__Group_13__0 )* )
            {
            // InternalBlatt2.g:4942:1: ( ( rule__CompositeComponent__Group_13__0 )* )
            // InternalBlatt2.g:4943:2: ( rule__CompositeComponent__Group_13__0 )*
            {
             before(grammarAccess.getCompositeComponentAccess().getGroup_13()); 
            // InternalBlatt2.g:4944:2: ( rule__CompositeComponent__Group_13__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==17) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalBlatt2.g:4944:3: rule__CompositeComponent__Group_13__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__CompositeComponent__Group_13__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getCompositeComponentAccess().getGroup_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__13__Impl"


    // $ANTLR start "rule__CompositeComponent__Group__14"
    // InternalBlatt2.g:4952:1: rule__CompositeComponent__Group__14 : rule__CompositeComponent__Group__14__Impl rule__CompositeComponent__Group__15 ;
    public final void rule__CompositeComponent__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:4956:1: ( rule__CompositeComponent__Group__14__Impl rule__CompositeComponent__Group__15 )
            // InternalBlatt2.g:4957:2: rule__CompositeComponent__Group__14__Impl rule__CompositeComponent__Group__15
            {
            pushFollow(FOLLOW_21);
            rule__CompositeComponent__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__14"


    // $ANTLR start "rule__CompositeComponent__Group__14__Impl"
    // InternalBlatt2.g:4964:1: rule__CompositeComponent__Group__14__Impl : ( '}' ) ;
    public final void rule__CompositeComponent__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:4968:1: ( ( '}' ) )
            // InternalBlatt2.g:4969:1: ( '}' )
            {
            // InternalBlatt2.g:4969:1: ( '}' )
            // InternalBlatt2.g:4970:2: '}'
            {
             before(grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_14()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__14__Impl"


    // $ANTLR start "rule__CompositeComponent__Group__15"
    // InternalBlatt2.g:4979:1: rule__CompositeComponent__Group__15 : rule__CompositeComponent__Group__15__Impl rule__CompositeComponent__Group__16 ;
    public final void rule__CompositeComponent__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:4983:1: ( rule__CompositeComponent__Group__15__Impl rule__CompositeComponent__Group__16 )
            // InternalBlatt2.g:4984:2: rule__CompositeComponent__Group__15__Impl rule__CompositeComponent__Group__16
            {
            pushFollow(FOLLOW_22);
            rule__CompositeComponent__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__15"


    // $ANTLR start "rule__CompositeComponent__Group__15__Impl"
    // InternalBlatt2.g:4991:1: rule__CompositeComponent__Group__15__Impl : ( 'behaviourDescription' ) ;
    public final void rule__CompositeComponent__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:4995:1: ( ( 'behaviourDescription' ) )
            // InternalBlatt2.g:4996:1: ( 'behaviourDescription' )
            {
            // InternalBlatt2.g:4996:1: ( 'behaviourDescription' )
            // InternalBlatt2.g:4997:2: 'behaviourDescription'
            {
             before(grammarAccess.getCompositeComponentAccess().getBehaviourDescriptionKeyword_15()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getBehaviourDescriptionKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__15__Impl"


    // $ANTLR start "rule__CompositeComponent__Group__16"
    // InternalBlatt2.g:5006:1: rule__CompositeComponent__Group__16 : rule__CompositeComponent__Group__16__Impl rule__CompositeComponent__Group__17 ;
    public final void rule__CompositeComponent__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:5010:1: ( rule__CompositeComponent__Group__16__Impl rule__CompositeComponent__Group__17 )
            // InternalBlatt2.g:5011:2: rule__CompositeComponent__Group__16__Impl rule__CompositeComponent__Group__17
            {
            pushFollow(FOLLOW_31);
            rule__CompositeComponent__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__16"


    // $ANTLR start "rule__CompositeComponent__Group__16__Impl"
    // InternalBlatt2.g:5018:1: rule__CompositeComponent__Group__16__Impl : ( ( rule__CompositeComponent__BehaviourDescriptionAssignment_16 ) ) ;
    public final void rule__CompositeComponent__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:5022:1: ( ( ( rule__CompositeComponent__BehaviourDescriptionAssignment_16 ) ) )
            // InternalBlatt2.g:5023:1: ( ( rule__CompositeComponent__BehaviourDescriptionAssignment_16 ) )
            {
            // InternalBlatt2.g:5023:1: ( ( rule__CompositeComponent__BehaviourDescriptionAssignment_16 ) )
            // InternalBlatt2.g:5024:2: ( rule__CompositeComponent__BehaviourDescriptionAssignment_16 )
            {
             before(grammarAccess.getCompositeComponentAccess().getBehaviourDescriptionAssignment_16()); 
            // InternalBlatt2.g:5025:2: ( rule__CompositeComponent__BehaviourDescriptionAssignment_16 )
            // InternalBlatt2.g:5025:3: rule__CompositeComponent__BehaviourDescriptionAssignment_16
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__BehaviourDescriptionAssignment_16();

            state._fsp--;


            }

             after(grammarAccess.getCompositeComponentAccess().getBehaviourDescriptionAssignment_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__16__Impl"


    // $ANTLR start "rule__CompositeComponent__Group__17"
    // InternalBlatt2.g:5033:1: rule__CompositeComponent__Group__17 : rule__CompositeComponent__Group__17__Impl rule__CompositeComponent__Group__18 ;
    public final void rule__CompositeComponent__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:5037:1: ( rule__CompositeComponent__Group__17__Impl rule__CompositeComponent__Group__18 )
            // InternalBlatt2.g:5038:2: rule__CompositeComponent__Group__17__Impl rule__CompositeComponent__Group__18
            {
            pushFollow(FOLLOW_32);
            rule__CompositeComponent__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__17"


    // $ANTLR start "rule__CompositeComponent__Group__17__Impl"
    // InternalBlatt2.g:5045:1: rule__CompositeComponent__Group__17__Impl : ( 'encapsulatedAssemblyContext' ) ;
    public final void rule__CompositeComponent__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:5049:1: ( ( 'encapsulatedAssemblyContext' ) )
            // InternalBlatt2.g:5050:1: ( 'encapsulatedAssemblyContext' )
            {
            // InternalBlatt2.g:5050:1: ( 'encapsulatedAssemblyContext' )
            // InternalBlatt2.g:5051:2: 'encapsulatedAssemblyContext'
            {
             before(grammarAccess.getCompositeComponentAccess().getEncapsulatedAssemblyContextKeyword_17()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getEncapsulatedAssemblyContextKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__17__Impl"


    // $ANTLR start "rule__CompositeComponent__Group__18"
    // InternalBlatt2.g:5060:1: rule__CompositeComponent__Group__18 : rule__CompositeComponent__Group__18__Impl rule__CompositeComponent__Group__19 ;
    public final void rule__CompositeComponent__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:5064:1: ( rule__CompositeComponent__Group__18__Impl rule__CompositeComponent__Group__19 )
            // InternalBlatt2.g:5065:2: rule__CompositeComponent__Group__18__Impl rule__CompositeComponent__Group__19
            {
            pushFollow(FOLLOW_13);
            rule__CompositeComponent__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__18"


    // $ANTLR start "rule__CompositeComponent__Group__18__Impl"
    // InternalBlatt2.g:5072:1: rule__CompositeComponent__Group__18__Impl : ( ( rule__CompositeComponent__EncapsulatedAssemblyContextAssignment_18 ) ) ;
    public final void rule__CompositeComponent__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:5076:1: ( ( ( rule__CompositeComponent__EncapsulatedAssemblyContextAssignment_18 ) ) )
            // InternalBlatt2.g:5077:1: ( ( rule__CompositeComponent__EncapsulatedAssemblyContextAssignment_18 ) )
            {
            // InternalBlatt2.g:5077:1: ( ( rule__CompositeComponent__EncapsulatedAssemblyContextAssignment_18 ) )
            // InternalBlatt2.g:5078:2: ( rule__CompositeComponent__EncapsulatedAssemblyContextAssignment_18 )
            {
             before(grammarAccess.getCompositeComponentAccess().getEncapsulatedAssemblyContextAssignment_18()); 
            // InternalBlatt2.g:5079:2: ( rule__CompositeComponent__EncapsulatedAssemblyContextAssignment_18 )
            // InternalBlatt2.g:5079:3: rule__CompositeComponent__EncapsulatedAssemblyContextAssignment_18
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__EncapsulatedAssemblyContextAssignment_18();

            state._fsp--;


            }

             after(grammarAccess.getCompositeComponentAccess().getEncapsulatedAssemblyContextAssignment_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__18__Impl"


    // $ANTLR start "rule__CompositeComponent__Group__19"
    // InternalBlatt2.g:5087:1: rule__CompositeComponent__Group__19 : rule__CompositeComponent__Group__19__Impl ;
    public final void rule__CompositeComponent__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:5091:1: ( rule__CompositeComponent__Group__19__Impl )
            // InternalBlatt2.g:5092:2: rule__CompositeComponent__Group__19__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__19__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__19"


    // $ANTLR start "rule__CompositeComponent__Group__19__Impl"
    // InternalBlatt2.g:5098:1: rule__CompositeComponent__Group__19__Impl : ( '}' ) ;
    public final void rule__CompositeComponent__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:5102:1: ( ( '}' ) )
            // InternalBlatt2.g:5103:1: ( '}' )
            {
            // InternalBlatt2.g:5103:1: ( '}' )
            // InternalBlatt2.g:5104:2: '}'
            {
             before(grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_19()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group__19__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_3__0"
    // InternalBlatt2.g:5114:1: rule__CompositeComponent__Group_3__0 : rule__CompositeComponent__Group_3__0__Impl rule__CompositeComponent__Group_3__1 ;
    public final void rule__CompositeComponent__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:5118:1: ( rule__CompositeComponent__Group_3__0__Impl rule__CompositeComponent__Group_3__1 )
            // InternalBlatt2.g:5119:2: rule__CompositeComponent__Group_3__0__Impl rule__CompositeComponent__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__CompositeComponent__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_3__0"


    // $ANTLR start "rule__CompositeComponent__Group_3__0__Impl"
    // InternalBlatt2.g:5126:1: rule__CompositeComponent__Group_3__0__Impl : ( 'requiredInterface' ) ;
    public final void rule__CompositeComponent__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:5130:1: ( ( 'requiredInterface' ) )
            // InternalBlatt2.g:5131:1: ( 'requiredInterface' )
            {
            // InternalBlatt2.g:5131:1: ( 'requiredInterface' )
            // InternalBlatt2.g:5132:2: 'requiredInterface'
            {
             before(grammarAccess.getCompositeComponentAccess().getRequiredInterfaceKeyword_3_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getRequiredInterfaceKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_3__0__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_3__1"
    // InternalBlatt2.g:5141:1: rule__CompositeComponent__Group_3__1 : rule__CompositeComponent__Group_3__1__Impl rule__CompositeComponent__Group_3__2 ;
    public final void rule__CompositeComponent__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:5145:1: ( rule__CompositeComponent__Group_3__1__Impl rule__CompositeComponent__Group_3__2 )
            // InternalBlatt2.g:5146:2: rule__CompositeComponent__Group_3__1__Impl rule__CompositeComponent__Group_3__2
            {
            pushFollow(FOLLOW_6);
            rule__CompositeComponent__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_3__1"


    // $ANTLR start "rule__CompositeComponent__Group_3__1__Impl"
    // InternalBlatt2.g:5153:1: rule__CompositeComponent__Group_3__1__Impl : ( '(' ) ;
    public final void rule__CompositeComponent__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:5157:1: ( ( '(' ) )
            // InternalBlatt2.g:5158:1: ( '(' )
            {
            // InternalBlatt2.g:5158:1: ( '(' )
            // InternalBlatt2.g:5159:2: '('
            {
             before(grammarAccess.getCompositeComponentAccess().getLeftParenthesisKeyword_3_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getLeftParenthesisKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_3__1__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_3__2"
    // InternalBlatt2.g:5168:1: rule__CompositeComponent__Group_3__2 : rule__CompositeComponent__Group_3__2__Impl rule__CompositeComponent__Group_3__3 ;
    public final void rule__CompositeComponent__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:5172:1: ( rule__CompositeComponent__Group_3__2__Impl rule__CompositeComponent__Group_3__3 )
            // InternalBlatt2.g:5173:2: rule__CompositeComponent__Group_3__2__Impl rule__CompositeComponent__Group_3__3
            {
            pushFollow(FOLLOW_7);
            rule__CompositeComponent__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_3__2"


    // $ANTLR start "rule__CompositeComponent__Group_3__2__Impl"
    // InternalBlatt2.g:5180:1: rule__CompositeComponent__Group_3__2__Impl : ( ( rule__CompositeComponent__RequiredInterfaceAssignment_3_2 ) ) ;
    public final void rule__CompositeComponent__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:5184:1: ( ( ( rule__CompositeComponent__RequiredInterfaceAssignment_3_2 ) ) )
            // InternalBlatt2.g:5185:1: ( ( rule__CompositeComponent__RequiredInterfaceAssignment_3_2 ) )
            {
            // InternalBlatt2.g:5185:1: ( ( rule__CompositeComponent__RequiredInterfaceAssignment_3_2 ) )
            // InternalBlatt2.g:5186:2: ( rule__CompositeComponent__RequiredInterfaceAssignment_3_2 )
            {
             before(grammarAccess.getCompositeComponentAccess().getRequiredInterfaceAssignment_3_2()); 
            // InternalBlatt2.g:5187:2: ( rule__CompositeComponent__RequiredInterfaceAssignment_3_2 )
            // InternalBlatt2.g:5187:3: rule__CompositeComponent__RequiredInterfaceAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__RequiredInterfaceAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getCompositeComponentAccess().getRequiredInterfaceAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_3__2__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_3__3"
    // InternalBlatt2.g:5195:1: rule__CompositeComponent__Group_3__3 : rule__CompositeComponent__Group_3__3__Impl rule__CompositeComponent__Group_3__4 ;
    public final void rule__CompositeComponent__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:5199:1: ( rule__CompositeComponent__Group_3__3__Impl rule__CompositeComponent__Group_3__4 )
            // InternalBlatt2.g:5200:2: rule__CompositeComponent__Group_3__3__Impl rule__CompositeComponent__Group_3__4
            {
            pushFollow(FOLLOW_7);
            rule__CompositeComponent__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_3__3"


    // $ANTLR start "rule__CompositeComponent__Group_3__3__Impl"
    // InternalBlatt2.g:5207:1: rule__CompositeComponent__Group_3__3__Impl : ( ( rule__CompositeComponent__Group_3_3__0 )* ) ;
    public final void rule__CompositeComponent__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:5211:1: ( ( ( rule__CompositeComponent__Group_3_3__0 )* ) )
            // InternalBlatt2.g:5212:1: ( ( rule__CompositeComponent__Group_3_3__0 )* )
            {
            // InternalBlatt2.g:5212:1: ( ( rule__CompositeComponent__Group_3_3__0 )* )
            // InternalBlatt2.g:5213:2: ( rule__CompositeComponent__Group_3_3__0 )*
            {
             before(grammarAccess.getCompositeComponentAccess().getGroup_3_3()); 
            // InternalBlatt2.g:5214:2: ( rule__CompositeComponent__Group_3_3__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==17) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalBlatt2.g:5214:3: rule__CompositeComponent__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__CompositeComponent__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getCompositeComponentAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_3__3__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_3__4"
    // InternalBlatt2.g:5222:1: rule__CompositeComponent__Group_3__4 : rule__CompositeComponent__Group_3__4__Impl ;
    public final void rule__CompositeComponent__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:5226:1: ( rule__CompositeComponent__Group_3__4__Impl )
            // InternalBlatt2.g:5227:2: rule__CompositeComponent__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_3__4"


    // $ANTLR start "rule__CompositeComponent__Group_3__4__Impl"
    // InternalBlatt2.g:5233:1: rule__CompositeComponent__Group_3__4__Impl : ( ')' ) ;
    public final void rule__CompositeComponent__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:5237:1: ( ( ')' ) )
            // InternalBlatt2.g:5238:1: ( ')' )
            {
            // InternalBlatt2.g:5238:1: ( ')' )
            // InternalBlatt2.g:5239:2: ')'
            {
             before(grammarAccess.getCompositeComponentAccess().getRightParenthesisKeyword_3_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getRightParenthesisKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_3__4__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_3_3__0"
    // InternalBlatt2.g:5249:1: rule__CompositeComponent__Group_3_3__0 : rule__CompositeComponent__Group_3_3__0__Impl rule__CompositeComponent__Group_3_3__1 ;
    public final void rule__CompositeComponent__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:5253:1: ( rule__CompositeComponent__Group_3_3__0__Impl rule__CompositeComponent__Group_3_3__1 )
            // InternalBlatt2.g:5254:2: rule__CompositeComponent__Group_3_3__0__Impl rule__CompositeComponent__Group_3_3__1
            {
            pushFollow(FOLLOW_6);
            rule__CompositeComponent__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_3_3__0"


    // $ANTLR start "rule__CompositeComponent__Group_3_3__0__Impl"
    // InternalBlatt2.g:5261:1: rule__CompositeComponent__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__CompositeComponent__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:5265:1: ( ( ',' ) )
            // InternalBlatt2.g:5266:1: ( ',' )
            {
            // InternalBlatt2.g:5266:1: ( ',' )
            // InternalBlatt2.g:5267:2: ','
            {
             before(grammarAccess.getCompositeComponentAccess().getCommaKeyword_3_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_3_3__0__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_3_3__1"
    // InternalBlatt2.g:5276:1: rule__CompositeComponent__Group_3_3__1 : rule__CompositeComponent__Group_3_3__1__Impl ;
    public final void rule__CompositeComponent__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:5280:1: ( rule__CompositeComponent__Group_3_3__1__Impl )
            // InternalBlatt2.g:5281:2: rule__CompositeComponent__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_3_3__1"


    // $ANTLR start "rule__CompositeComponent__Group_3_3__1__Impl"
    // InternalBlatt2.g:5287:1: rule__CompositeComponent__Group_3_3__1__Impl : ( ( rule__CompositeComponent__RequiredInterfaceAssignment_3_3_1 ) ) ;
    public final void rule__CompositeComponent__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:5291:1: ( ( ( rule__CompositeComponent__RequiredInterfaceAssignment_3_3_1 ) ) )
            // InternalBlatt2.g:5292:1: ( ( rule__CompositeComponent__RequiredInterfaceAssignment_3_3_1 ) )
            {
            // InternalBlatt2.g:5292:1: ( ( rule__CompositeComponent__RequiredInterfaceAssignment_3_3_1 ) )
            // InternalBlatt2.g:5293:2: ( rule__CompositeComponent__RequiredInterfaceAssignment_3_3_1 )
            {
             before(grammarAccess.getCompositeComponentAccess().getRequiredInterfaceAssignment_3_3_1()); 
            // InternalBlatt2.g:5294:2: ( rule__CompositeComponent__RequiredInterfaceAssignment_3_3_1 )
            // InternalBlatt2.g:5294:3: rule__CompositeComponent__RequiredInterfaceAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__RequiredInterfaceAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeComponentAccess().getRequiredInterfaceAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_3_3__1__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_7__0"
    // InternalBlatt2.g:5303:1: rule__CompositeComponent__Group_7__0 : rule__CompositeComponent__Group_7__0__Impl rule__CompositeComponent__Group_7__1 ;
    public final void rule__CompositeComponent__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:5307:1: ( rule__CompositeComponent__Group_7__0__Impl rule__CompositeComponent__Group_7__1 )
            // InternalBlatt2.g:5308:2: rule__CompositeComponent__Group_7__0__Impl rule__CompositeComponent__Group_7__1
            {
            pushFollow(FOLLOW_6);
            rule__CompositeComponent__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_7__0"


    // $ANTLR start "rule__CompositeComponent__Group_7__0__Impl"
    // InternalBlatt2.g:5315:1: rule__CompositeComponent__Group_7__0__Impl : ( ',' ) ;
    public final void rule__CompositeComponent__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:5319:1: ( ( ',' ) )
            // InternalBlatt2.g:5320:1: ( ',' )
            {
            // InternalBlatt2.g:5320:1: ( ',' )
            // InternalBlatt2.g:5321:2: ','
            {
             before(grammarAccess.getCompositeComponentAccess().getCommaKeyword_7_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_7__0__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_7__1"
    // InternalBlatt2.g:5330:1: rule__CompositeComponent__Group_7__1 : rule__CompositeComponent__Group_7__1__Impl ;
    public final void rule__CompositeComponent__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:5334:1: ( rule__CompositeComponent__Group_7__1__Impl )
            // InternalBlatt2.g:5335:2: rule__CompositeComponent__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_7__1"


    // $ANTLR start "rule__CompositeComponent__Group_7__1__Impl"
    // InternalBlatt2.g:5341:1: rule__CompositeComponent__Group_7__1__Impl : ( ( rule__CompositeComponent__RequiredServiceAssignment_7_1 ) ) ;
    public final void rule__CompositeComponent__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:5345:1: ( ( ( rule__CompositeComponent__RequiredServiceAssignment_7_1 ) ) )
            // InternalBlatt2.g:5346:1: ( ( rule__CompositeComponent__RequiredServiceAssignment_7_1 ) )
            {
            // InternalBlatt2.g:5346:1: ( ( rule__CompositeComponent__RequiredServiceAssignment_7_1 ) )
            // InternalBlatt2.g:5347:2: ( rule__CompositeComponent__RequiredServiceAssignment_7_1 )
            {
             before(grammarAccess.getCompositeComponentAccess().getRequiredServiceAssignment_7_1()); 
            // InternalBlatt2.g:5348:2: ( rule__CompositeComponent__RequiredServiceAssignment_7_1 )
            // InternalBlatt2.g:5348:3: rule__CompositeComponent__RequiredServiceAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__RequiredServiceAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeComponentAccess().getRequiredServiceAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_7__1__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_9__0"
    // InternalBlatt2.g:5357:1: rule__CompositeComponent__Group_9__0 : rule__CompositeComponent__Group_9__0__Impl rule__CompositeComponent__Group_9__1 ;
    public final void rule__CompositeComponent__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:5361:1: ( rule__CompositeComponent__Group_9__0__Impl rule__CompositeComponent__Group_9__1 )
            // InternalBlatt2.g:5362:2: rule__CompositeComponent__Group_9__0__Impl rule__CompositeComponent__Group_9__1
            {
            pushFollow(FOLLOW_3);
            rule__CompositeComponent__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_9__0"


    // $ANTLR start "rule__CompositeComponent__Group_9__0__Impl"
    // InternalBlatt2.g:5369:1: rule__CompositeComponent__Group_9__0__Impl : ( 'providedInterface' ) ;
    public final void rule__CompositeComponent__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:5373:1: ( ( 'providedInterface' ) )
            // InternalBlatt2.g:5374:1: ( 'providedInterface' )
            {
            // InternalBlatt2.g:5374:1: ( 'providedInterface' )
            // InternalBlatt2.g:5375:2: 'providedInterface'
            {
             before(grammarAccess.getCompositeComponentAccess().getProvidedInterfaceKeyword_9_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getProvidedInterfaceKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_9__0__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_9__1"
    // InternalBlatt2.g:5384:1: rule__CompositeComponent__Group_9__1 : rule__CompositeComponent__Group_9__1__Impl rule__CompositeComponent__Group_9__2 ;
    public final void rule__CompositeComponent__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:5388:1: ( rule__CompositeComponent__Group_9__1__Impl rule__CompositeComponent__Group_9__2 )
            // InternalBlatt2.g:5389:2: rule__CompositeComponent__Group_9__1__Impl rule__CompositeComponent__Group_9__2
            {
            pushFollow(FOLLOW_23);
            rule__CompositeComponent__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_9__1"


    // $ANTLR start "rule__CompositeComponent__Group_9__1__Impl"
    // InternalBlatt2.g:5396:1: rule__CompositeComponent__Group_9__1__Impl : ( '{' ) ;
    public final void rule__CompositeComponent__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:5400:1: ( ( '{' ) )
            // InternalBlatt2.g:5401:1: ( '{' )
            {
            // InternalBlatt2.g:5401:1: ( '{' )
            // InternalBlatt2.g:5402:2: '{'
            {
             before(grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_9_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_9__1__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_9__2"
    // InternalBlatt2.g:5411:1: rule__CompositeComponent__Group_9__2 : rule__CompositeComponent__Group_9__2__Impl rule__CompositeComponent__Group_9__3 ;
    public final void rule__CompositeComponent__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:5415:1: ( rule__CompositeComponent__Group_9__2__Impl rule__CompositeComponent__Group_9__3 )
            // InternalBlatt2.g:5416:2: rule__CompositeComponent__Group_9__2__Impl rule__CompositeComponent__Group_9__3
            {
            pushFollow(FOLLOW_11);
            rule__CompositeComponent__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_9__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_9__2"


    // $ANTLR start "rule__CompositeComponent__Group_9__2__Impl"
    // InternalBlatt2.g:5423:1: rule__CompositeComponent__Group_9__2__Impl : ( ( rule__CompositeComponent__ProvidedInterfaceAssignment_9_2 ) ) ;
    public final void rule__CompositeComponent__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:5427:1: ( ( ( rule__CompositeComponent__ProvidedInterfaceAssignment_9_2 ) ) )
            // InternalBlatt2.g:5428:1: ( ( rule__CompositeComponent__ProvidedInterfaceAssignment_9_2 ) )
            {
            // InternalBlatt2.g:5428:1: ( ( rule__CompositeComponent__ProvidedInterfaceAssignment_9_2 ) )
            // InternalBlatt2.g:5429:2: ( rule__CompositeComponent__ProvidedInterfaceAssignment_9_2 )
            {
             before(grammarAccess.getCompositeComponentAccess().getProvidedInterfaceAssignment_9_2()); 
            // InternalBlatt2.g:5430:2: ( rule__CompositeComponent__ProvidedInterfaceAssignment_9_2 )
            // InternalBlatt2.g:5430:3: rule__CompositeComponent__ProvidedInterfaceAssignment_9_2
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__ProvidedInterfaceAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getCompositeComponentAccess().getProvidedInterfaceAssignment_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_9__2__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_9__3"
    // InternalBlatt2.g:5438:1: rule__CompositeComponent__Group_9__3 : rule__CompositeComponent__Group_9__3__Impl rule__CompositeComponent__Group_9__4 ;
    public final void rule__CompositeComponent__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:5442:1: ( rule__CompositeComponent__Group_9__3__Impl rule__CompositeComponent__Group_9__4 )
            // InternalBlatt2.g:5443:2: rule__CompositeComponent__Group_9__3__Impl rule__CompositeComponent__Group_9__4
            {
            pushFollow(FOLLOW_11);
            rule__CompositeComponent__Group_9__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_9__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_9__3"


    // $ANTLR start "rule__CompositeComponent__Group_9__3__Impl"
    // InternalBlatt2.g:5450:1: rule__CompositeComponent__Group_9__3__Impl : ( ( rule__CompositeComponent__Group_9_3__0 )* ) ;
    public final void rule__CompositeComponent__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:5454:1: ( ( ( rule__CompositeComponent__Group_9_3__0 )* ) )
            // InternalBlatt2.g:5455:1: ( ( rule__CompositeComponent__Group_9_3__0 )* )
            {
            // InternalBlatt2.g:5455:1: ( ( rule__CompositeComponent__Group_9_3__0 )* )
            // InternalBlatt2.g:5456:2: ( rule__CompositeComponent__Group_9_3__0 )*
            {
             before(grammarAccess.getCompositeComponentAccess().getGroup_9_3()); 
            // InternalBlatt2.g:5457:2: ( rule__CompositeComponent__Group_9_3__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==17) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalBlatt2.g:5457:3: rule__CompositeComponent__Group_9_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__CompositeComponent__Group_9_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getCompositeComponentAccess().getGroup_9_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_9__3__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_9__4"
    // InternalBlatt2.g:5465:1: rule__CompositeComponent__Group_9__4 : rule__CompositeComponent__Group_9__4__Impl ;
    public final void rule__CompositeComponent__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:5469:1: ( rule__CompositeComponent__Group_9__4__Impl )
            // InternalBlatt2.g:5470:2: rule__CompositeComponent__Group_9__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_9__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_9__4"


    // $ANTLR start "rule__CompositeComponent__Group_9__4__Impl"
    // InternalBlatt2.g:5476:1: rule__CompositeComponent__Group_9__4__Impl : ( '}' ) ;
    public final void rule__CompositeComponent__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:5480:1: ( ( '}' ) )
            // InternalBlatt2.g:5481:1: ( '}' )
            {
            // InternalBlatt2.g:5481:1: ( '}' )
            // InternalBlatt2.g:5482:2: '}'
            {
             before(grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_9_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_9_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_9__4__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_9_3__0"
    // InternalBlatt2.g:5492:1: rule__CompositeComponent__Group_9_3__0 : rule__CompositeComponent__Group_9_3__0__Impl rule__CompositeComponent__Group_9_3__1 ;
    public final void rule__CompositeComponent__Group_9_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:5496:1: ( rule__CompositeComponent__Group_9_3__0__Impl rule__CompositeComponent__Group_9_3__1 )
            // InternalBlatt2.g:5497:2: rule__CompositeComponent__Group_9_3__0__Impl rule__CompositeComponent__Group_9_3__1
            {
            pushFollow(FOLLOW_23);
            rule__CompositeComponent__Group_9_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_9_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_9_3__0"


    // $ANTLR start "rule__CompositeComponent__Group_9_3__0__Impl"
    // InternalBlatt2.g:5504:1: rule__CompositeComponent__Group_9_3__0__Impl : ( ',' ) ;
    public final void rule__CompositeComponent__Group_9_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:5508:1: ( ( ',' ) )
            // InternalBlatt2.g:5509:1: ( ',' )
            {
            // InternalBlatt2.g:5509:1: ( ',' )
            // InternalBlatt2.g:5510:2: ','
            {
             before(grammarAccess.getCompositeComponentAccess().getCommaKeyword_9_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getCommaKeyword_9_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_9_3__0__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_9_3__1"
    // InternalBlatt2.g:5519:1: rule__CompositeComponent__Group_9_3__1 : rule__CompositeComponent__Group_9_3__1__Impl ;
    public final void rule__CompositeComponent__Group_9_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:5523:1: ( rule__CompositeComponent__Group_9_3__1__Impl )
            // InternalBlatt2.g:5524:2: rule__CompositeComponent__Group_9_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_9_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_9_3__1"


    // $ANTLR start "rule__CompositeComponent__Group_9_3__1__Impl"
    // InternalBlatt2.g:5530:1: rule__CompositeComponent__Group_9_3__1__Impl : ( ( rule__CompositeComponent__ProvidedInterfaceAssignment_9_3_1 ) ) ;
    public final void rule__CompositeComponent__Group_9_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:5534:1: ( ( ( rule__CompositeComponent__ProvidedInterfaceAssignment_9_3_1 ) ) )
            // InternalBlatt2.g:5535:1: ( ( rule__CompositeComponent__ProvidedInterfaceAssignment_9_3_1 ) )
            {
            // InternalBlatt2.g:5535:1: ( ( rule__CompositeComponent__ProvidedInterfaceAssignment_9_3_1 ) )
            // InternalBlatt2.g:5536:2: ( rule__CompositeComponent__ProvidedInterfaceAssignment_9_3_1 )
            {
             before(grammarAccess.getCompositeComponentAccess().getProvidedInterfaceAssignment_9_3_1()); 
            // InternalBlatt2.g:5537:2: ( rule__CompositeComponent__ProvidedInterfaceAssignment_9_3_1 )
            // InternalBlatt2.g:5537:3: rule__CompositeComponent__ProvidedInterfaceAssignment_9_3_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__ProvidedInterfaceAssignment_9_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeComponentAccess().getProvidedInterfaceAssignment_9_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_9_3__1__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_13__0"
    // InternalBlatt2.g:5546:1: rule__CompositeComponent__Group_13__0 : rule__CompositeComponent__Group_13__0__Impl rule__CompositeComponent__Group_13__1 ;
    public final void rule__CompositeComponent__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:5550:1: ( rule__CompositeComponent__Group_13__0__Impl rule__CompositeComponent__Group_13__1 )
            // InternalBlatt2.g:5551:2: rule__CompositeComponent__Group_13__0__Impl rule__CompositeComponent__Group_13__1
            {
            pushFollow(FOLLOW_20);
            rule__CompositeComponent__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_13__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_13__0"


    // $ANTLR start "rule__CompositeComponent__Group_13__0__Impl"
    // InternalBlatt2.g:5558:1: rule__CompositeComponent__Group_13__0__Impl : ( ',' ) ;
    public final void rule__CompositeComponent__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:5562:1: ( ( ',' ) )
            // InternalBlatt2.g:5563:1: ( ',' )
            {
            // InternalBlatt2.g:5563:1: ( ',' )
            // InternalBlatt2.g:5564:2: ','
            {
             before(grammarAccess.getCompositeComponentAccess().getCommaKeyword_13_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getCommaKeyword_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_13__0__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_13__1"
    // InternalBlatt2.g:5573:1: rule__CompositeComponent__Group_13__1 : rule__CompositeComponent__Group_13__1__Impl ;
    public final void rule__CompositeComponent__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:5577:1: ( rule__CompositeComponent__Group_13__1__Impl )
            // InternalBlatt2.g:5578:2: rule__CompositeComponent__Group_13__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_13__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_13__1"


    // $ANTLR start "rule__CompositeComponent__Group_13__1__Impl"
    // InternalBlatt2.g:5584:1: rule__CompositeComponent__Group_13__1__Impl : ( ( rule__CompositeComponent__ProvidedServiceAssignment_13_1 ) ) ;
    public final void rule__CompositeComponent__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:5588:1: ( ( ( rule__CompositeComponent__ProvidedServiceAssignment_13_1 ) ) )
            // InternalBlatt2.g:5589:1: ( ( rule__CompositeComponent__ProvidedServiceAssignment_13_1 ) )
            {
            // InternalBlatt2.g:5589:1: ( ( rule__CompositeComponent__ProvidedServiceAssignment_13_1 ) )
            // InternalBlatt2.g:5590:2: ( rule__CompositeComponent__ProvidedServiceAssignment_13_1 )
            {
             before(grammarAccess.getCompositeComponentAccess().getProvidedServiceAssignment_13_1()); 
            // InternalBlatt2.g:5591:2: ( rule__CompositeComponent__ProvidedServiceAssignment_13_1 )
            // InternalBlatt2.g:5591:3: rule__CompositeComponent__ProvidedServiceAssignment_13_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__ProvidedServiceAssignment_13_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeComponentAccess().getProvidedServiceAssignment_13_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_13__1__Impl"


    // $ANTLR start "rule__Signature__Group__0"
    // InternalBlatt2.g:5600:1: rule__Signature__Group__0 : rule__Signature__Group__0__Impl rule__Signature__Group__1 ;
    public final void rule__Signature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:5604:1: ( rule__Signature__Group__0__Impl rule__Signature__Group__1 )
            // InternalBlatt2.g:5605:2: rule__Signature__Group__0__Impl rule__Signature__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Signature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signature__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__0"


    // $ANTLR start "rule__Signature__Group__0__Impl"
    // InternalBlatt2.g:5612:1: rule__Signature__Group__0__Impl : ( 'Signature' ) ;
    public final void rule__Signature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:5616:1: ( ( 'Signature' ) )
            // InternalBlatt2.g:5617:1: ( 'Signature' )
            {
            // InternalBlatt2.g:5617:1: ( 'Signature' )
            // InternalBlatt2.g:5618:2: 'Signature'
            {
             before(grammarAccess.getSignatureAccess().getSignatureKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getSignatureAccess().getSignatureKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__0__Impl"


    // $ANTLR start "rule__Signature__Group__1"
    // InternalBlatt2.g:5627:1: rule__Signature__Group__1 : rule__Signature__Group__1__Impl rule__Signature__Group__2 ;
    public final void rule__Signature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:5631:1: ( rule__Signature__Group__1__Impl rule__Signature__Group__2 )
            // InternalBlatt2.g:5632:2: rule__Signature__Group__1__Impl rule__Signature__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Signature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signature__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__1"


    // $ANTLR start "rule__Signature__Group__1__Impl"
    // InternalBlatt2.g:5639:1: rule__Signature__Group__1__Impl : ( ( rule__Signature__NameAssignment_1 ) ) ;
    public final void rule__Signature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:5643:1: ( ( ( rule__Signature__NameAssignment_1 ) ) )
            // InternalBlatt2.g:5644:1: ( ( rule__Signature__NameAssignment_1 ) )
            {
            // InternalBlatt2.g:5644:1: ( ( rule__Signature__NameAssignment_1 ) )
            // InternalBlatt2.g:5645:2: ( rule__Signature__NameAssignment_1 )
            {
             before(grammarAccess.getSignatureAccess().getNameAssignment_1()); 
            // InternalBlatt2.g:5646:2: ( rule__Signature__NameAssignment_1 )
            // InternalBlatt2.g:5646:3: rule__Signature__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Signature__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSignatureAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__1__Impl"


    // $ANTLR start "rule__Signature__Group__2"
    // InternalBlatt2.g:5654:1: rule__Signature__Group__2 : rule__Signature__Group__2__Impl rule__Signature__Group__3 ;
    public final void rule__Signature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:5658:1: ( rule__Signature__Group__2__Impl rule__Signature__Group__3 )
            // InternalBlatt2.g:5659:2: rule__Signature__Group__2__Impl rule__Signature__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__Signature__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signature__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__2"


    // $ANTLR start "rule__Signature__Group__2__Impl"
    // InternalBlatt2.g:5666:1: rule__Signature__Group__2__Impl : ( '{' ) ;
    public final void rule__Signature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:5670:1: ( ( '{' ) )
            // InternalBlatt2.g:5671:1: ( '{' )
            {
            // InternalBlatt2.g:5671:1: ( '{' )
            // InternalBlatt2.g:5672:2: '{'
            {
             before(grammarAccess.getSignatureAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getSignatureAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__2__Impl"


    // $ANTLR start "rule__Signature__Group__3"
    // InternalBlatt2.g:5681:1: rule__Signature__Group__3 : rule__Signature__Group__3__Impl rule__Signature__Group__4 ;
    public final void rule__Signature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:5685:1: ( rule__Signature__Group__3__Impl rule__Signature__Group__4 )
            // InternalBlatt2.g:5686:2: rule__Signature__Group__3__Impl rule__Signature__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Signature__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signature__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__3"


    // $ANTLR start "rule__Signature__Group__3__Impl"
    // InternalBlatt2.g:5693:1: rule__Signature__Group__3__Impl : ( 'returnType' ) ;
    public final void rule__Signature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:5697:1: ( ( 'returnType' ) )
            // InternalBlatt2.g:5698:1: ( 'returnType' )
            {
            // InternalBlatt2.g:5698:1: ( 'returnType' )
            // InternalBlatt2.g:5699:2: 'returnType'
            {
             before(grammarAccess.getSignatureAccess().getReturnTypeKeyword_3()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getSignatureAccess().getReturnTypeKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__3__Impl"


    // $ANTLR start "rule__Signature__Group__4"
    // InternalBlatt2.g:5708:1: rule__Signature__Group__4 : rule__Signature__Group__4__Impl rule__Signature__Group__5 ;
    public final void rule__Signature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:5712:1: ( rule__Signature__Group__4__Impl rule__Signature__Group__5 )
            // InternalBlatt2.g:5713:2: rule__Signature__Group__4__Impl rule__Signature__Group__5
            {
            pushFollow(FOLLOW_34);
            rule__Signature__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signature__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__4"


    // $ANTLR start "rule__Signature__Group__4__Impl"
    // InternalBlatt2.g:5720:1: rule__Signature__Group__4__Impl : ( ( rule__Signature__ReturnTypeAssignment_4 ) ) ;
    public final void rule__Signature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:5724:1: ( ( ( rule__Signature__ReturnTypeAssignment_4 ) ) )
            // InternalBlatt2.g:5725:1: ( ( rule__Signature__ReturnTypeAssignment_4 ) )
            {
            // InternalBlatt2.g:5725:1: ( ( rule__Signature__ReturnTypeAssignment_4 ) )
            // InternalBlatt2.g:5726:2: ( rule__Signature__ReturnTypeAssignment_4 )
            {
             before(grammarAccess.getSignatureAccess().getReturnTypeAssignment_4()); 
            // InternalBlatt2.g:5727:2: ( rule__Signature__ReturnTypeAssignment_4 )
            // InternalBlatt2.g:5727:3: rule__Signature__ReturnTypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Signature__ReturnTypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSignatureAccess().getReturnTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__4__Impl"


    // $ANTLR start "rule__Signature__Group__5"
    // InternalBlatt2.g:5735:1: rule__Signature__Group__5 : rule__Signature__Group__5__Impl rule__Signature__Group__6 ;
    public final void rule__Signature__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:5739:1: ( rule__Signature__Group__5__Impl rule__Signature__Group__6 )
            // InternalBlatt2.g:5740:2: rule__Signature__Group__5__Impl rule__Signature__Group__6
            {
            pushFollow(FOLLOW_34);
            rule__Signature__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signature__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__5"


    // $ANTLR start "rule__Signature__Group__5__Impl"
    // InternalBlatt2.g:5747:1: rule__Signature__Group__5__Impl : ( ( rule__Signature__Group_5__0 )? ) ;
    public final void rule__Signature__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:5751:1: ( ( ( rule__Signature__Group_5__0 )? ) )
            // InternalBlatt2.g:5752:1: ( ( rule__Signature__Group_5__0 )? )
            {
            // InternalBlatt2.g:5752:1: ( ( rule__Signature__Group_5__0 )? )
            // InternalBlatt2.g:5753:2: ( rule__Signature__Group_5__0 )?
            {
             before(grammarAccess.getSignatureAccess().getGroup_5()); 
            // InternalBlatt2.g:5754:2: ( rule__Signature__Group_5__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==46) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalBlatt2.g:5754:3: rule__Signature__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Signature__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSignatureAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__5__Impl"


    // $ANTLR start "rule__Signature__Group__6"
    // InternalBlatt2.g:5762:1: rule__Signature__Group__6 : rule__Signature__Group__6__Impl ;
    public final void rule__Signature__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:5766:1: ( rule__Signature__Group__6__Impl )
            // InternalBlatt2.g:5767:2: rule__Signature__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Signature__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__6"


    // $ANTLR start "rule__Signature__Group__6__Impl"
    // InternalBlatt2.g:5773:1: rule__Signature__Group__6__Impl : ( '}' ) ;
    public final void rule__Signature__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:5777:1: ( ( '}' ) )
            // InternalBlatt2.g:5778:1: ( '}' )
            {
            // InternalBlatt2.g:5778:1: ( '}' )
            // InternalBlatt2.g:5779:2: '}'
            {
             before(grammarAccess.getSignatureAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSignatureAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__6__Impl"


    // $ANTLR start "rule__Signature__Group_5__0"
    // InternalBlatt2.g:5789:1: rule__Signature__Group_5__0 : rule__Signature__Group_5__0__Impl rule__Signature__Group_5__1 ;
    public final void rule__Signature__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:5793:1: ( rule__Signature__Group_5__0__Impl rule__Signature__Group_5__1 )
            // InternalBlatt2.g:5794:2: rule__Signature__Group_5__0__Impl rule__Signature__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__Signature__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signature__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_5__0"


    // $ANTLR start "rule__Signature__Group_5__0__Impl"
    // InternalBlatt2.g:5801:1: rule__Signature__Group_5__0__Impl : ( 'parameterType' ) ;
    public final void rule__Signature__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:5805:1: ( ( 'parameterType' ) )
            // InternalBlatt2.g:5806:1: ( 'parameterType' )
            {
            // InternalBlatt2.g:5806:1: ( 'parameterType' )
            // InternalBlatt2.g:5807:2: 'parameterType'
            {
             before(grammarAccess.getSignatureAccess().getParameterTypeKeyword_5_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getSignatureAccess().getParameterTypeKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_5__0__Impl"


    // $ANTLR start "rule__Signature__Group_5__1"
    // InternalBlatt2.g:5816:1: rule__Signature__Group_5__1 : rule__Signature__Group_5__1__Impl rule__Signature__Group_5__2 ;
    public final void rule__Signature__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:5820:1: ( rule__Signature__Group_5__1__Impl rule__Signature__Group_5__2 )
            // InternalBlatt2.g:5821:2: rule__Signature__Group_5__1__Impl rule__Signature__Group_5__2
            {
            pushFollow(FOLLOW_6);
            rule__Signature__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signature__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_5__1"


    // $ANTLR start "rule__Signature__Group_5__1__Impl"
    // InternalBlatt2.g:5828:1: rule__Signature__Group_5__1__Impl : ( '(' ) ;
    public final void rule__Signature__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:5832:1: ( ( '(' ) )
            // InternalBlatt2.g:5833:1: ( '(' )
            {
            // InternalBlatt2.g:5833:1: ( '(' )
            // InternalBlatt2.g:5834:2: '('
            {
             before(grammarAccess.getSignatureAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSignatureAccess().getLeftParenthesisKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_5__1__Impl"


    // $ANTLR start "rule__Signature__Group_5__2"
    // InternalBlatt2.g:5843:1: rule__Signature__Group_5__2 : rule__Signature__Group_5__2__Impl rule__Signature__Group_5__3 ;
    public final void rule__Signature__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:5847:1: ( rule__Signature__Group_5__2__Impl rule__Signature__Group_5__3 )
            // InternalBlatt2.g:5848:2: rule__Signature__Group_5__2__Impl rule__Signature__Group_5__3
            {
            pushFollow(FOLLOW_7);
            rule__Signature__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signature__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_5__2"


    // $ANTLR start "rule__Signature__Group_5__2__Impl"
    // InternalBlatt2.g:5855:1: rule__Signature__Group_5__2__Impl : ( ( rule__Signature__ParameterTypeAssignment_5_2 ) ) ;
    public final void rule__Signature__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:5859:1: ( ( ( rule__Signature__ParameterTypeAssignment_5_2 ) ) )
            // InternalBlatt2.g:5860:1: ( ( rule__Signature__ParameterTypeAssignment_5_2 ) )
            {
            // InternalBlatt2.g:5860:1: ( ( rule__Signature__ParameterTypeAssignment_5_2 ) )
            // InternalBlatt2.g:5861:2: ( rule__Signature__ParameterTypeAssignment_5_2 )
            {
             before(grammarAccess.getSignatureAccess().getParameterTypeAssignment_5_2()); 
            // InternalBlatt2.g:5862:2: ( rule__Signature__ParameterTypeAssignment_5_2 )
            // InternalBlatt2.g:5862:3: rule__Signature__ParameterTypeAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Signature__ParameterTypeAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getSignatureAccess().getParameterTypeAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_5__2__Impl"


    // $ANTLR start "rule__Signature__Group_5__3"
    // InternalBlatt2.g:5870:1: rule__Signature__Group_5__3 : rule__Signature__Group_5__3__Impl rule__Signature__Group_5__4 ;
    public final void rule__Signature__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:5874:1: ( rule__Signature__Group_5__3__Impl rule__Signature__Group_5__4 )
            // InternalBlatt2.g:5875:2: rule__Signature__Group_5__3__Impl rule__Signature__Group_5__4
            {
            pushFollow(FOLLOW_7);
            rule__Signature__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signature__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_5__3"


    // $ANTLR start "rule__Signature__Group_5__3__Impl"
    // InternalBlatt2.g:5882:1: rule__Signature__Group_5__3__Impl : ( ( rule__Signature__Group_5_3__0 )* ) ;
    public final void rule__Signature__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:5886:1: ( ( ( rule__Signature__Group_5_3__0 )* ) )
            // InternalBlatt2.g:5887:1: ( ( rule__Signature__Group_5_3__0 )* )
            {
            // InternalBlatt2.g:5887:1: ( ( rule__Signature__Group_5_3__0 )* )
            // InternalBlatt2.g:5888:2: ( rule__Signature__Group_5_3__0 )*
            {
             before(grammarAccess.getSignatureAccess().getGroup_5_3()); 
            // InternalBlatt2.g:5889:2: ( rule__Signature__Group_5_3__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==17) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalBlatt2.g:5889:3: rule__Signature__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Signature__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getSignatureAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_5__3__Impl"


    // $ANTLR start "rule__Signature__Group_5__4"
    // InternalBlatt2.g:5897:1: rule__Signature__Group_5__4 : rule__Signature__Group_5__4__Impl ;
    public final void rule__Signature__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:5901:1: ( rule__Signature__Group_5__4__Impl )
            // InternalBlatt2.g:5902:2: rule__Signature__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Signature__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_5__4"


    // $ANTLR start "rule__Signature__Group_5__4__Impl"
    // InternalBlatt2.g:5908:1: rule__Signature__Group_5__4__Impl : ( ')' ) ;
    public final void rule__Signature__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:5912:1: ( ( ')' ) )
            // InternalBlatt2.g:5913:1: ( ')' )
            {
            // InternalBlatt2.g:5913:1: ( ')' )
            // InternalBlatt2.g:5914:2: ')'
            {
             before(grammarAccess.getSignatureAccess().getRightParenthesisKeyword_5_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSignatureAccess().getRightParenthesisKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_5__4__Impl"


    // $ANTLR start "rule__Signature__Group_5_3__0"
    // InternalBlatt2.g:5924:1: rule__Signature__Group_5_3__0 : rule__Signature__Group_5_3__0__Impl rule__Signature__Group_5_3__1 ;
    public final void rule__Signature__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:5928:1: ( rule__Signature__Group_5_3__0__Impl rule__Signature__Group_5_3__1 )
            // InternalBlatt2.g:5929:2: rule__Signature__Group_5_3__0__Impl rule__Signature__Group_5_3__1
            {
            pushFollow(FOLLOW_6);
            rule__Signature__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signature__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_5_3__0"


    // $ANTLR start "rule__Signature__Group_5_3__0__Impl"
    // InternalBlatt2.g:5936:1: rule__Signature__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Signature__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:5940:1: ( ( ',' ) )
            // InternalBlatt2.g:5941:1: ( ',' )
            {
            // InternalBlatt2.g:5941:1: ( ',' )
            // InternalBlatt2.g:5942:2: ','
            {
             before(grammarAccess.getSignatureAccess().getCommaKeyword_5_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSignatureAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_5_3__0__Impl"


    // $ANTLR start "rule__Signature__Group_5_3__1"
    // InternalBlatt2.g:5951:1: rule__Signature__Group_5_3__1 : rule__Signature__Group_5_3__1__Impl ;
    public final void rule__Signature__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:5955:1: ( rule__Signature__Group_5_3__1__Impl )
            // InternalBlatt2.g:5956:2: rule__Signature__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Signature__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_5_3__1"


    // $ANTLR start "rule__Signature__Group_5_3__1__Impl"
    // InternalBlatt2.g:5962:1: rule__Signature__Group_5_3__1__Impl : ( ( rule__Signature__ParameterTypeAssignment_5_3_1 ) ) ;
    public final void rule__Signature__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:5966:1: ( ( ( rule__Signature__ParameterTypeAssignment_5_3_1 ) ) )
            // InternalBlatt2.g:5967:1: ( ( rule__Signature__ParameterTypeAssignment_5_3_1 ) )
            {
            // InternalBlatt2.g:5967:1: ( ( rule__Signature__ParameterTypeAssignment_5_3_1 ) )
            // InternalBlatt2.g:5968:2: ( rule__Signature__ParameterTypeAssignment_5_3_1 )
            {
             before(grammarAccess.getSignatureAccess().getParameterTypeAssignment_5_3_1()); 
            // InternalBlatt2.g:5969:2: ( rule__Signature__ParameterTypeAssignment_5_3_1 )
            // InternalBlatt2.g:5969:3: rule__Signature__ParameterTypeAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Signature__ParameterTypeAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSignatureAccess().getParameterTypeAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_5_3__1__Impl"


    // $ANTLR start "rule__Type_Impl__Group__0"
    // InternalBlatt2.g:5978:1: rule__Type_Impl__Group__0 : rule__Type_Impl__Group__0__Impl rule__Type_Impl__Group__1 ;
    public final void rule__Type_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:5982:1: ( rule__Type_Impl__Group__0__Impl rule__Type_Impl__Group__1 )
            // InternalBlatt2.g:5983:2: rule__Type_Impl__Group__0__Impl rule__Type_Impl__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__Type_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_Impl__Group__0"


    // $ANTLR start "rule__Type_Impl__Group__0__Impl"
    // InternalBlatt2.g:5990:1: rule__Type_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Type_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:5994:1: ( ( () ) )
            // InternalBlatt2.g:5995:1: ( () )
            {
            // InternalBlatt2.g:5995:1: ( () )
            // InternalBlatt2.g:5996:2: ()
            {
             before(grammarAccess.getType_ImplAccess().getTypeAction_0()); 
            // InternalBlatt2.g:5997:2: ()
            // InternalBlatt2.g:5997:3: 
            {
            }

             after(grammarAccess.getType_ImplAccess().getTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_Impl__Group__0__Impl"


    // $ANTLR start "rule__Type_Impl__Group__1"
    // InternalBlatt2.g:6005:1: rule__Type_Impl__Group__1 : rule__Type_Impl__Group__1__Impl ;
    public final void rule__Type_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:6009:1: ( rule__Type_Impl__Group__1__Impl )
            // InternalBlatt2.g:6010:2: rule__Type_Impl__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type_Impl__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_Impl__Group__1"


    // $ANTLR start "rule__Type_Impl__Group__1__Impl"
    // InternalBlatt2.g:6016:1: rule__Type_Impl__Group__1__Impl : ( 'Type' ) ;
    public final void rule__Type_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:6020:1: ( ( 'Type' ) )
            // InternalBlatt2.g:6021:1: ( 'Type' )
            {
            // InternalBlatt2.g:6021:1: ( 'Type' )
            // InternalBlatt2.g:6022:2: 'Type'
            {
             before(grammarAccess.getType_ImplAccess().getTypeKeyword_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getType_ImplAccess().getTypeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_Impl__Group__1__Impl"


    // $ANTLR start "rule__List__Group__0"
    // InternalBlatt2.g:6032:1: rule__List__Group__0 : rule__List__Group__0__Impl rule__List__Group__1 ;
    public final void rule__List__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:6036:1: ( rule__List__Group__0__Impl rule__List__Group__1 )
            // InternalBlatt2.g:6037:2: rule__List__Group__0__Impl rule__List__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__List__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__List__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__0"


    // $ANTLR start "rule__List__Group__0__Impl"
    // InternalBlatt2.g:6044:1: rule__List__Group__0__Impl : ( () ) ;
    public final void rule__List__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:6048:1: ( ( () ) )
            // InternalBlatt2.g:6049:1: ( () )
            {
            // InternalBlatt2.g:6049:1: ( () )
            // InternalBlatt2.g:6050:2: ()
            {
             before(grammarAccess.getListAccess().getListAction_0()); 
            // InternalBlatt2.g:6051:2: ()
            // InternalBlatt2.g:6051:3: 
            {
            }

             after(grammarAccess.getListAccess().getListAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__0__Impl"


    // $ANTLR start "rule__List__Group__1"
    // InternalBlatt2.g:6059:1: rule__List__Group__1 : rule__List__Group__1__Impl ;
    public final void rule__List__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:6063:1: ( rule__List__Group__1__Impl )
            // InternalBlatt2.g:6064:2: rule__List__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__List__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__1"


    // $ANTLR start "rule__List__Group__1__Impl"
    // InternalBlatt2.g:6070:1: rule__List__Group__1__Impl : ( 'List' ) ;
    public final void rule__List__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:6074:1: ( ( 'List' ) )
            // InternalBlatt2.g:6075:1: ( 'List' )
            {
            // InternalBlatt2.g:6075:1: ( 'List' )
            // InternalBlatt2.g:6076:2: 'List'
            {
             before(grammarAccess.getListAccess().getListKeyword_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getListAccess().getListKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__1__Impl"


    // $ANTLR start "rule__Map__Group__0"
    // InternalBlatt2.g:6086:1: rule__Map__Group__0 : rule__Map__Group__0__Impl rule__Map__Group__1 ;
    public final void rule__Map__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:6090:1: ( rule__Map__Group__0__Impl rule__Map__Group__1 )
            // InternalBlatt2.g:6091:2: rule__Map__Group__0__Impl rule__Map__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__Map__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Map__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Map__Group__0"


    // $ANTLR start "rule__Map__Group__0__Impl"
    // InternalBlatt2.g:6098:1: rule__Map__Group__0__Impl : ( () ) ;
    public final void rule__Map__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:6102:1: ( ( () ) )
            // InternalBlatt2.g:6103:1: ( () )
            {
            // InternalBlatt2.g:6103:1: ( () )
            // InternalBlatt2.g:6104:2: ()
            {
             before(grammarAccess.getMapAccess().getMapAction_0()); 
            // InternalBlatt2.g:6105:2: ()
            // InternalBlatt2.g:6105:3: 
            {
            }

             after(grammarAccess.getMapAccess().getMapAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Map__Group__0__Impl"


    // $ANTLR start "rule__Map__Group__1"
    // InternalBlatt2.g:6113:1: rule__Map__Group__1 : rule__Map__Group__1__Impl ;
    public final void rule__Map__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:6117:1: ( rule__Map__Group__1__Impl )
            // InternalBlatt2.g:6118:2: rule__Map__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Map__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Map__Group__1"


    // $ANTLR start "rule__Map__Group__1__Impl"
    // InternalBlatt2.g:6124:1: rule__Map__Group__1__Impl : ( 'Map' ) ;
    public final void rule__Map__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:6128:1: ( ( 'Map' ) )
            // InternalBlatt2.g:6129:1: ( 'Map' )
            {
            // InternalBlatt2.g:6129:1: ( 'Map' )
            // InternalBlatt2.g:6130:2: 'Map'
            {
             before(grammarAccess.getMapAccess().getMapKeyword_1()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getMapAccess().getMapKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Map__Group__1__Impl"


    // $ANTLR start "rule__ComplexType__Group__0"
    // InternalBlatt2.g:6140:1: rule__ComplexType__Group__0 : rule__ComplexType__Group__0__Impl rule__ComplexType__Group__1 ;
    public final void rule__ComplexType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:6144:1: ( rule__ComplexType__Group__0__Impl rule__ComplexType__Group__1 )
            // InternalBlatt2.g:6145:2: rule__ComplexType__Group__0__Impl rule__ComplexType__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__ComplexType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexType__Group__0"


    // $ANTLR start "rule__ComplexType__Group__0__Impl"
    // InternalBlatt2.g:6152:1: rule__ComplexType__Group__0__Impl : ( () ) ;
    public final void rule__ComplexType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:6156:1: ( ( () ) )
            // InternalBlatt2.g:6157:1: ( () )
            {
            // InternalBlatt2.g:6157:1: ( () )
            // InternalBlatt2.g:6158:2: ()
            {
             before(grammarAccess.getComplexTypeAccess().getComplexTypeAction_0()); 
            // InternalBlatt2.g:6159:2: ()
            // InternalBlatt2.g:6159:3: 
            {
            }

             after(grammarAccess.getComplexTypeAccess().getComplexTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexType__Group__0__Impl"


    // $ANTLR start "rule__ComplexType__Group__1"
    // InternalBlatt2.g:6167:1: rule__ComplexType__Group__1 : rule__ComplexType__Group__1__Impl ;
    public final void rule__ComplexType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:6171:1: ( rule__ComplexType__Group__1__Impl )
            // InternalBlatt2.g:6172:2: rule__ComplexType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComplexType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexType__Group__1"


    // $ANTLR start "rule__ComplexType__Group__1__Impl"
    // InternalBlatt2.g:6178:1: rule__ComplexType__Group__1__Impl : ( 'ComplexType' ) ;
    public final void rule__ComplexType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:6182:1: ( ( 'ComplexType' ) )
            // InternalBlatt2.g:6183:1: ( 'ComplexType' )
            {
            // InternalBlatt2.g:6183:1: ( 'ComplexType' )
            // InternalBlatt2.g:6184:2: 'ComplexType'
            {
             before(grammarAccess.getComplexTypeAccess().getComplexTypeKeyword_1()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getComplexTypeAccess().getComplexTypeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexType__Group__1__Impl"


    // $ANTLR start "rule__Date__Group__0"
    // InternalBlatt2.g:6194:1: rule__Date__Group__0 : rule__Date__Group__0__Impl rule__Date__Group__1 ;
    public final void rule__Date__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:6198:1: ( rule__Date__Group__0__Impl rule__Date__Group__1 )
            // InternalBlatt2.g:6199:2: rule__Date__Group__0__Impl rule__Date__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__Date__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Date__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__0"


    // $ANTLR start "rule__Date__Group__0__Impl"
    // InternalBlatt2.g:6206:1: rule__Date__Group__0__Impl : ( () ) ;
    public final void rule__Date__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:6210:1: ( ( () ) )
            // InternalBlatt2.g:6211:1: ( () )
            {
            // InternalBlatt2.g:6211:1: ( () )
            // InternalBlatt2.g:6212:2: ()
            {
             before(grammarAccess.getDateAccess().getDateAction_0()); 
            // InternalBlatt2.g:6213:2: ()
            // InternalBlatt2.g:6213:3: 
            {
            }

             after(grammarAccess.getDateAccess().getDateAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__0__Impl"


    // $ANTLR start "rule__Date__Group__1"
    // InternalBlatt2.g:6221:1: rule__Date__Group__1 : rule__Date__Group__1__Impl ;
    public final void rule__Date__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:6225:1: ( rule__Date__Group__1__Impl )
            // InternalBlatt2.g:6226:2: rule__Date__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Date__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__1"


    // $ANTLR start "rule__Date__Group__1__Impl"
    // InternalBlatt2.g:6232:1: rule__Date__Group__1__Impl : ( 'Date' ) ;
    public final void rule__Date__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:6236:1: ( ( 'Date' ) )
            // InternalBlatt2.g:6237:1: ( 'Date' )
            {
            // InternalBlatt2.g:6237:1: ( 'Date' )
            // InternalBlatt2.g:6238:2: 'Date'
            {
             before(grammarAccess.getDateAccess().getDateKeyword_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getDateAccess().getDateKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__1__Impl"


    // $ANTLR start "rule__Double__Group__0"
    // InternalBlatt2.g:6248:1: rule__Double__Group__0 : rule__Double__Group__0__Impl rule__Double__Group__1 ;
    public final void rule__Double__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:6252:1: ( rule__Double__Group__0__Impl rule__Double__Group__1 )
            // InternalBlatt2.g:6253:2: rule__Double__Group__0__Impl rule__Double__Group__1
            {
            pushFollow(FOLLOW_40);
            rule__Double__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Double__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Double__Group__0"


    // $ANTLR start "rule__Double__Group__0__Impl"
    // InternalBlatt2.g:6260:1: rule__Double__Group__0__Impl : ( () ) ;
    public final void rule__Double__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:6264:1: ( ( () ) )
            // InternalBlatt2.g:6265:1: ( () )
            {
            // InternalBlatt2.g:6265:1: ( () )
            // InternalBlatt2.g:6266:2: ()
            {
             before(grammarAccess.getDoubleAccess().getDoubleAction_0()); 
            // InternalBlatt2.g:6267:2: ()
            // InternalBlatt2.g:6267:3: 
            {
            }

             after(grammarAccess.getDoubleAccess().getDoubleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Double__Group__0__Impl"


    // $ANTLR start "rule__Double__Group__1"
    // InternalBlatt2.g:6275:1: rule__Double__Group__1 : rule__Double__Group__1__Impl ;
    public final void rule__Double__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:6279:1: ( rule__Double__Group__1__Impl )
            // InternalBlatt2.g:6280:2: rule__Double__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Double__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Double__Group__1"


    // $ANTLR start "rule__Double__Group__1__Impl"
    // InternalBlatt2.g:6286:1: rule__Double__Group__1__Impl : ( 'Double' ) ;
    public final void rule__Double__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:6290:1: ( ( 'Double' ) )
            // InternalBlatt2.g:6291:1: ( 'Double' )
            {
            // InternalBlatt2.g:6291:1: ( 'Double' )
            // InternalBlatt2.g:6292:2: 'Double'
            {
             before(grammarAccess.getDoubleAccess().getDoubleKeyword_1()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getDoubleAccess().getDoubleKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Double__Group__1__Impl"


    // $ANTLR start "rule__String0__Group__0"
    // InternalBlatt2.g:6302:1: rule__String0__Group__0 : rule__String0__Group__0__Impl rule__String0__Group__1 ;
    public final void rule__String0__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:6306:1: ( rule__String0__Group__0__Impl rule__String0__Group__1 )
            // InternalBlatt2.g:6307:2: rule__String0__Group__0__Impl rule__String0__Group__1
            {
            pushFollow(FOLLOW_41);
            rule__String0__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__String0__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__String0__Group__0"


    // $ANTLR start "rule__String0__Group__0__Impl"
    // InternalBlatt2.g:6314:1: rule__String0__Group__0__Impl : ( () ) ;
    public final void rule__String0__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:6318:1: ( ( () ) )
            // InternalBlatt2.g:6319:1: ( () )
            {
            // InternalBlatt2.g:6319:1: ( () )
            // InternalBlatt2.g:6320:2: ()
            {
             before(grammarAccess.getString0Access().getStringAction_0()); 
            // InternalBlatt2.g:6321:2: ()
            // InternalBlatt2.g:6321:3: 
            {
            }

             after(grammarAccess.getString0Access().getStringAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__String0__Group__0__Impl"


    // $ANTLR start "rule__String0__Group__1"
    // InternalBlatt2.g:6329:1: rule__String0__Group__1 : rule__String0__Group__1__Impl ;
    public final void rule__String0__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:6333:1: ( rule__String0__Group__1__Impl )
            // InternalBlatt2.g:6334:2: rule__String0__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__String0__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__String0__Group__1"


    // $ANTLR start "rule__String0__Group__1__Impl"
    // InternalBlatt2.g:6340:1: rule__String0__Group__1__Impl : ( 'String' ) ;
    public final void rule__String0__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:6344:1: ( ( 'String' ) )
            // InternalBlatt2.g:6345:1: ( 'String' )
            {
            // InternalBlatt2.g:6345:1: ( 'String' )
            // InternalBlatt2.g:6346:2: 'String'
            {
             before(grammarAccess.getString0Access().getStringKeyword_1()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getString0Access().getStringKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__String0__Group__1__Impl"


    // $ANTLR start "rule__Int0__Group__0"
    // InternalBlatt2.g:6356:1: rule__Int0__Group__0 : rule__Int0__Group__0__Impl rule__Int0__Group__1 ;
    public final void rule__Int0__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:6360:1: ( rule__Int0__Group__0__Impl rule__Int0__Group__1 )
            // InternalBlatt2.g:6361:2: rule__Int0__Group__0__Impl rule__Int0__Group__1
            {
            pushFollow(FOLLOW_42);
            rule__Int0__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Int0__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int0__Group__0"


    // $ANTLR start "rule__Int0__Group__0__Impl"
    // InternalBlatt2.g:6368:1: rule__Int0__Group__0__Impl : ( () ) ;
    public final void rule__Int0__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:6372:1: ( ( () ) )
            // InternalBlatt2.g:6373:1: ( () )
            {
            // InternalBlatt2.g:6373:1: ( () )
            // InternalBlatt2.g:6374:2: ()
            {
             before(grammarAccess.getInt0Access().getIntAction_0()); 
            // InternalBlatt2.g:6375:2: ()
            // InternalBlatt2.g:6375:3: 
            {
            }

             after(grammarAccess.getInt0Access().getIntAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int0__Group__0__Impl"


    // $ANTLR start "rule__Int0__Group__1"
    // InternalBlatt2.g:6383:1: rule__Int0__Group__1 : rule__Int0__Group__1__Impl ;
    public final void rule__Int0__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:6387:1: ( rule__Int0__Group__1__Impl )
            // InternalBlatt2.g:6388:2: rule__Int0__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Int0__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int0__Group__1"


    // $ANTLR start "rule__Int0__Group__1__Impl"
    // InternalBlatt2.g:6394:1: rule__Int0__Group__1__Impl : ( 'Int' ) ;
    public final void rule__Int0__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:6398:1: ( ( 'Int' ) )
            // InternalBlatt2.g:6399:1: ( 'Int' )
            {
            // InternalBlatt2.g:6399:1: ( 'Int' )
            // InternalBlatt2.g:6400:2: 'Int'
            {
             before(grammarAccess.getInt0Access().getIntKeyword_1()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getInt0Access().getIntKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int0__Group__1__Impl"


    // $ANTLR start "rule__Char__Group__0"
    // InternalBlatt2.g:6410:1: rule__Char__Group__0 : rule__Char__Group__0__Impl rule__Char__Group__1 ;
    public final void rule__Char__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:6414:1: ( rule__Char__Group__0__Impl rule__Char__Group__1 )
            // InternalBlatt2.g:6415:2: rule__Char__Group__0__Impl rule__Char__Group__1
            {
            pushFollow(FOLLOW_43);
            rule__Char__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Char__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Char__Group__0"


    // $ANTLR start "rule__Char__Group__0__Impl"
    // InternalBlatt2.g:6422:1: rule__Char__Group__0__Impl : ( () ) ;
    public final void rule__Char__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:6426:1: ( ( () ) )
            // InternalBlatt2.g:6427:1: ( () )
            {
            // InternalBlatt2.g:6427:1: ( () )
            // InternalBlatt2.g:6428:2: ()
            {
             before(grammarAccess.getCharAccess().getCharAction_0()); 
            // InternalBlatt2.g:6429:2: ()
            // InternalBlatt2.g:6429:3: 
            {
            }

             after(grammarAccess.getCharAccess().getCharAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Char__Group__0__Impl"


    // $ANTLR start "rule__Char__Group__1"
    // InternalBlatt2.g:6437:1: rule__Char__Group__1 : rule__Char__Group__1__Impl ;
    public final void rule__Char__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:6441:1: ( rule__Char__Group__1__Impl )
            // InternalBlatt2.g:6442:2: rule__Char__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Char__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Char__Group__1"


    // $ANTLR start "rule__Char__Group__1__Impl"
    // InternalBlatt2.g:6448:1: rule__Char__Group__1__Impl : ( 'Char' ) ;
    public final void rule__Char__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:6452:1: ( ( 'Char' ) )
            // InternalBlatt2.g:6453:1: ( 'Char' )
            {
            // InternalBlatt2.g:6453:1: ( 'Char' )
            // InternalBlatt2.g:6454:2: 'Char'
            {
             before(grammarAccess.getCharAccess().getCharKeyword_1()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getCharAccess().getCharKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Char__Group__1__Impl"


    // $ANTLR start "rule__Long__Group__0"
    // InternalBlatt2.g:6464:1: rule__Long__Group__0 : rule__Long__Group__0__Impl rule__Long__Group__1 ;
    public final void rule__Long__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:6468:1: ( rule__Long__Group__0__Impl rule__Long__Group__1 )
            // InternalBlatt2.g:6469:2: rule__Long__Group__0__Impl rule__Long__Group__1
            {
            pushFollow(FOLLOW_44);
            rule__Long__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Long__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Long__Group__0"


    // $ANTLR start "rule__Long__Group__0__Impl"
    // InternalBlatt2.g:6476:1: rule__Long__Group__0__Impl : ( () ) ;
    public final void rule__Long__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:6480:1: ( ( () ) )
            // InternalBlatt2.g:6481:1: ( () )
            {
            // InternalBlatt2.g:6481:1: ( () )
            // InternalBlatt2.g:6482:2: ()
            {
             before(grammarAccess.getLongAccess().getLongAction_0()); 
            // InternalBlatt2.g:6483:2: ()
            // InternalBlatt2.g:6483:3: 
            {
            }

             after(grammarAccess.getLongAccess().getLongAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Long__Group__0__Impl"


    // $ANTLR start "rule__Long__Group__1"
    // InternalBlatt2.g:6491:1: rule__Long__Group__1 : rule__Long__Group__1__Impl ;
    public final void rule__Long__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:6495:1: ( rule__Long__Group__1__Impl )
            // InternalBlatt2.g:6496:2: rule__Long__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Long__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Long__Group__1"


    // $ANTLR start "rule__Long__Group__1__Impl"
    // InternalBlatt2.g:6502:1: rule__Long__Group__1__Impl : ( 'Long' ) ;
    public final void rule__Long__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:6506:1: ( ( 'Long' ) )
            // InternalBlatt2.g:6507:1: ( 'Long' )
            {
            // InternalBlatt2.g:6507:1: ( 'Long' )
            // InternalBlatt2.g:6508:2: 'Long'
            {
             before(grammarAccess.getLongAccess().getLongKeyword_1()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getLongAccess().getLongKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Long__Group__1__Impl"


    // $ANTLR start "rule__Float__Group__0"
    // InternalBlatt2.g:6518:1: rule__Float__Group__0 : rule__Float__Group__0__Impl rule__Float__Group__1 ;
    public final void rule__Float__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:6522:1: ( rule__Float__Group__0__Impl rule__Float__Group__1 )
            // InternalBlatt2.g:6523:2: rule__Float__Group__0__Impl rule__Float__Group__1
            {
            pushFollow(FOLLOW_45);
            rule__Float__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Float__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float__Group__0"


    // $ANTLR start "rule__Float__Group__0__Impl"
    // InternalBlatt2.g:6530:1: rule__Float__Group__0__Impl : ( () ) ;
    public final void rule__Float__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:6534:1: ( ( () ) )
            // InternalBlatt2.g:6535:1: ( () )
            {
            // InternalBlatt2.g:6535:1: ( () )
            // InternalBlatt2.g:6536:2: ()
            {
             before(grammarAccess.getFloatAccess().getFloatAction_0()); 
            // InternalBlatt2.g:6537:2: ()
            // InternalBlatt2.g:6537:3: 
            {
            }

             after(grammarAccess.getFloatAccess().getFloatAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float__Group__0__Impl"


    // $ANTLR start "rule__Float__Group__1"
    // InternalBlatt2.g:6545:1: rule__Float__Group__1 : rule__Float__Group__1__Impl ;
    public final void rule__Float__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:6549:1: ( rule__Float__Group__1__Impl )
            // InternalBlatt2.g:6550:2: rule__Float__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Float__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float__Group__1"


    // $ANTLR start "rule__Float__Group__1__Impl"
    // InternalBlatt2.g:6556:1: rule__Float__Group__1__Impl : ( 'Float' ) ;
    public final void rule__Float__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:6560:1: ( ( 'Float' ) )
            // InternalBlatt2.g:6561:1: ( 'Float' )
            {
            // InternalBlatt2.g:6561:1: ( 'Float' )
            // InternalBlatt2.g:6562:2: 'Float'
            {
             before(grammarAccess.getFloatAccess().getFloatKeyword_1()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getFloatAccess().getFloatKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float__Group__1__Impl"


    // $ANTLR start "rule__Boolean__Group__0"
    // InternalBlatt2.g:6572:1: rule__Boolean__Group__0 : rule__Boolean__Group__0__Impl rule__Boolean__Group__1 ;
    public final void rule__Boolean__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:6576:1: ( rule__Boolean__Group__0__Impl rule__Boolean__Group__1 )
            // InternalBlatt2.g:6577:2: rule__Boolean__Group__0__Impl rule__Boolean__Group__1
            {
            pushFollow(FOLLOW_46);
            rule__Boolean__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Boolean__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boolean__Group__0"


    // $ANTLR start "rule__Boolean__Group__0__Impl"
    // InternalBlatt2.g:6584:1: rule__Boolean__Group__0__Impl : ( () ) ;
    public final void rule__Boolean__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:6588:1: ( ( () ) )
            // InternalBlatt2.g:6589:1: ( () )
            {
            // InternalBlatt2.g:6589:1: ( () )
            // InternalBlatt2.g:6590:2: ()
            {
             before(grammarAccess.getBooleanAccess().getBooleanAction_0()); 
            // InternalBlatt2.g:6591:2: ()
            // InternalBlatt2.g:6591:3: 
            {
            }

             after(grammarAccess.getBooleanAccess().getBooleanAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boolean__Group__0__Impl"


    // $ANTLR start "rule__Boolean__Group__1"
    // InternalBlatt2.g:6599:1: rule__Boolean__Group__1 : rule__Boolean__Group__1__Impl ;
    public final void rule__Boolean__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:6603:1: ( rule__Boolean__Group__1__Impl )
            // InternalBlatt2.g:6604:2: rule__Boolean__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Boolean__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boolean__Group__1"


    // $ANTLR start "rule__Boolean__Group__1__Impl"
    // InternalBlatt2.g:6610:1: rule__Boolean__Group__1__Impl : ( 'Boolean' ) ;
    public final void rule__Boolean__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:6614:1: ( ( 'Boolean' ) )
            // InternalBlatt2.g:6615:1: ( 'Boolean' )
            {
            // InternalBlatt2.g:6615:1: ( 'Boolean' )
            // InternalBlatt2.g:6616:2: 'Boolean'
            {
             before(grammarAccess.getBooleanAccess().getBooleanKeyword_1()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getBooleanAccess().getBooleanKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boolean__Group__1__Impl"


    // $ANTLR start "rule__Void__Group__0"
    // InternalBlatt2.g:6626:1: rule__Void__Group__0 : rule__Void__Group__0__Impl rule__Void__Group__1 ;
    public final void rule__Void__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:6630:1: ( rule__Void__Group__0__Impl rule__Void__Group__1 )
            // InternalBlatt2.g:6631:2: rule__Void__Group__0__Impl rule__Void__Group__1
            {
            pushFollow(FOLLOW_47);
            rule__Void__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Void__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Void__Group__0"


    // $ANTLR start "rule__Void__Group__0__Impl"
    // InternalBlatt2.g:6638:1: rule__Void__Group__0__Impl : ( () ) ;
    public final void rule__Void__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:6642:1: ( ( () ) )
            // InternalBlatt2.g:6643:1: ( () )
            {
            // InternalBlatt2.g:6643:1: ( () )
            // InternalBlatt2.g:6644:2: ()
            {
             before(grammarAccess.getVoidAccess().getVoidAction_0()); 
            // InternalBlatt2.g:6645:2: ()
            // InternalBlatt2.g:6645:3: 
            {
            }

             after(grammarAccess.getVoidAccess().getVoidAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Void__Group__0__Impl"


    // $ANTLR start "rule__Void__Group__1"
    // InternalBlatt2.g:6653:1: rule__Void__Group__1 : rule__Void__Group__1__Impl ;
    public final void rule__Void__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:6657:1: ( rule__Void__Group__1__Impl )
            // InternalBlatt2.g:6658:2: rule__Void__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Void__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Void__Group__1"


    // $ANTLR start "rule__Void__Group__1__Impl"
    // InternalBlatt2.g:6664:1: rule__Void__Group__1__Impl : ( 'Void' ) ;
    public final void rule__Void__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:6668:1: ( ( 'Void' ) )
            // InternalBlatt2.g:6669:1: ( 'Void' )
            {
            // InternalBlatt2.g:6669:1: ( 'Void' )
            // InternalBlatt2.g:6670:2: 'Void'
            {
             before(grammarAccess.getVoidAccess().getVoidKeyword_1()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getVoidAccess().getVoidKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Void__Group__1__Impl"


    // $ANTLR start "rule__InternalAction__Group__0"
    // InternalBlatt2.g:6680:1: rule__InternalAction__Group__0 : rule__InternalAction__Group__0__Impl rule__InternalAction__Group__1 ;
    public final void rule__InternalAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:6684:1: ( rule__InternalAction__Group__0__Impl rule__InternalAction__Group__1 )
            // InternalBlatt2.g:6685:2: rule__InternalAction__Group__0__Impl rule__InternalAction__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__InternalAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InternalAction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalAction__Group__0"


    // $ANTLR start "rule__InternalAction__Group__0__Impl"
    // InternalBlatt2.g:6692:1: rule__InternalAction__Group__0__Impl : ( () ) ;
    public final void rule__InternalAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:6696:1: ( ( () ) )
            // InternalBlatt2.g:6697:1: ( () )
            {
            // InternalBlatt2.g:6697:1: ( () )
            // InternalBlatt2.g:6698:2: ()
            {
             before(grammarAccess.getInternalActionAccess().getInternalActionAction_0()); 
            // InternalBlatt2.g:6699:2: ()
            // InternalBlatt2.g:6699:3: 
            {
            }

             after(grammarAccess.getInternalActionAccess().getInternalActionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalAction__Group__0__Impl"


    // $ANTLR start "rule__InternalAction__Group__1"
    // InternalBlatt2.g:6707:1: rule__InternalAction__Group__1 : rule__InternalAction__Group__1__Impl ;
    public final void rule__InternalAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:6711:1: ( rule__InternalAction__Group__1__Impl )
            // InternalBlatt2.g:6712:2: rule__InternalAction__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InternalAction__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalAction__Group__1"


    // $ANTLR start "rule__InternalAction__Group__1__Impl"
    // InternalBlatt2.g:6718:1: rule__InternalAction__Group__1__Impl : ( 'InternalAction' ) ;
    public final void rule__InternalAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:6722:1: ( ( 'InternalAction' ) )
            // InternalBlatt2.g:6723:1: ( 'InternalAction' )
            {
            // InternalBlatt2.g:6723:1: ( 'InternalAction' )
            // InternalBlatt2.g:6724:2: 'InternalAction'
            {
             before(grammarAccess.getInternalActionAccess().getInternalActionKeyword_1()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getInternalActionAccess().getInternalActionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalAction__Group__1__Impl"


    // $ANTLR start "rule__Loop__Group__0"
    // InternalBlatt2.g:6734:1: rule__Loop__Group__0 : rule__Loop__Group__0__Impl rule__Loop__Group__1 ;
    public final void rule__Loop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:6738:1: ( rule__Loop__Group__0__Impl rule__Loop__Group__1 )
            // InternalBlatt2.g:6739:2: rule__Loop__Group__0__Impl rule__Loop__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__Loop__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__0"


    // $ANTLR start "rule__Loop__Group__0__Impl"
    // InternalBlatt2.g:6746:1: rule__Loop__Group__0__Impl : ( () ) ;
    public final void rule__Loop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:6750:1: ( ( () ) )
            // InternalBlatt2.g:6751:1: ( () )
            {
            // InternalBlatt2.g:6751:1: ( () )
            // InternalBlatt2.g:6752:2: ()
            {
             before(grammarAccess.getLoopAccess().getLoopAction_0()); 
            // InternalBlatt2.g:6753:2: ()
            // InternalBlatt2.g:6753:3: 
            {
            }

             after(grammarAccess.getLoopAccess().getLoopAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__0__Impl"


    // $ANTLR start "rule__Loop__Group__1"
    // InternalBlatt2.g:6761:1: rule__Loop__Group__1 : rule__Loop__Group__1__Impl ;
    public final void rule__Loop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:6765:1: ( rule__Loop__Group__1__Impl )
            // InternalBlatt2.g:6766:2: rule__Loop__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Loop__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__1"


    // $ANTLR start "rule__Loop__Group__1__Impl"
    // InternalBlatt2.g:6772:1: rule__Loop__Group__1__Impl : ( 'Loop' ) ;
    public final void rule__Loop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:6776:1: ( ( 'Loop' ) )
            // InternalBlatt2.g:6777:1: ( 'Loop' )
            {
            // InternalBlatt2.g:6777:1: ( 'Loop' )
            // InternalBlatt2.g:6778:2: 'Loop'
            {
             before(grammarAccess.getLoopAccess().getLoopKeyword_1()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getLoopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__1__Impl"


    // $ANTLR start "rule__Branch__Group__0"
    // InternalBlatt2.g:6788:1: rule__Branch__Group__0 : rule__Branch__Group__0__Impl rule__Branch__Group__1 ;
    public final void rule__Branch__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:6792:1: ( rule__Branch__Group__0__Impl rule__Branch__Group__1 )
            // InternalBlatt2.g:6793:2: rule__Branch__Group__0__Impl rule__Branch__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__Branch__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Branch__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__Group__0"


    // $ANTLR start "rule__Branch__Group__0__Impl"
    // InternalBlatt2.g:6800:1: rule__Branch__Group__0__Impl : ( () ) ;
    public final void rule__Branch__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:6804:1: ( ( () ) )
            // InternalBlatt2.g:6805:1: ( () )
            {
            // InternalBlatt2.g:6805:1: ( () )
            // InternalBlatt2.g:6806:2: ()
            {
             before(grammarAccess.getBranchAccess().getBranchAction_0()); 
            // InternalBlatt2.g:6807:2: ()
            // InternalBlatt2.g:6807:3: 
            {
            }

             after(grammarAccess.getBranchAccess().getBranchAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__Group__0__Impl"


    // $ANTLR start "rule__Branch__Group__1"
    // InternalBlatt2.g:6815:1: rule__Branch__Group__1 : rule__Branch__Group__1__Impl ;
    public final void rule__Branch__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:6819:1: ( rule__Branch__Group__1__Impl )
            // InternalBlatt2.g:6820:2: rule__Branch__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Branch__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__Group__1"


    // $ANTLR start "rule__Branch__Group__1__Impl"
    // InternalBlatt2.g:6826:1: rule__Branch__Group__1__Impl : ( 'Branch' ) ;
    public final void rule__Branch__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:6830:1: ( ( 'Branch' ) )
            // InternalBlatt2.g:6831:1: ( 'Branch' )
            {
            // InternalBlatt2.g:6831:1: ( 'Branch' )
            // InternalBlatt2.g:6832:2: 'Branch'
            {
             before(grammarAccess.getBranchAccess().getBranchKeyword_1()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getBranchAccess().getBranchKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__Group__1__Impl"


    // $ANTLR start "rule__AllocationContext__AllocatedAssemblyContextAssignment_4"
    // InternalBlatt2.g:6842:1: rule__AllocationContext__AllocatedAssemblyContextAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__AllocationContext__AllocatedAssemblyContextAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:6846:1: ( ( ( ruleEString ) ) )
            // InternalBlatt2.g:6847:2: ( ( ruleEString ) )
            {
            // InternalBlatt2.g:6847:2: ( ( ruleEString ) )
            // InternalBlatt2.g:6848:3: ( ruleEString )
            {
             before(grammarAccess.getAllocationContextAccess().getAllocatedAssemblyContextAssemblyContextCrossReference_4_0()); 
            // InternalBlatt2.g:6849:3: ( ruleEString )
            // InternalBlatt2.g:6850:4: ruleEString
            {
             before(grammarAccess.getAllocationContextAccess().getAllocatedAssemblyContextAssemblyContextEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAllocationContextAccess().getAllocatedAssemblyContextAssemblyContextEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getAllocationContextAccess().getAllocatedAssemblyContextAssemblyContextCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__AllocatedAssemblyContextAssignment_4"


    // $ANTLR start "rule__AllocationContext__AllocatedAssemblyContextAssignment_5_1"
    // InternalBlatt2.g:6861:1: rule__AllocationContext__AllocatedAssemblyContextAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__AllocationContext__AllocatedAssemblyContextAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:6865:1: ( ( ( ruleEString ) ) )
            // InternalBlatt2.g:6866:2: ( ( ruleEString ) )
            {
            // InternalBlatt2.g:6866:2: ( ( ruleEString ) )
            // InternalBlatt2.g:6867:3: ( ruleEString )
            {
             before(grammarAccess.getAllocationContextAccess().getAllocatedAssemblyContextAssemblyContextCrossReference_5_1_0()); 
            // InternalBlatt2.g:6868:3: ( ruleEString )
            // InternalBlatt2.g:6869:4: ruleEString
            {
             before(grammarAccess.getAllocationContextAccess().getAllocatedAssemblyContextAssemblyContextEStringParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAllocationContextAccess().getAllocatedAssemblyContextAssemblyContextEStringParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getAllocationContextAccess().getAllocatedAssemblyContextAssemblyContextCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__AllocatedAssemblyContextAssignment_5_1"


    // $ANTLR start "rule__AllocationContext__TargetContainerAssignment_7_2"
    // InternalBlatt2.g:6880:1: rule__AllocationContext__TargetContainerAssignment_7_2 : ( ruleContainer ) ;
    public final void rule__AllocationContext__TargetContainerAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:6884:1: ( ( ruleContainer ) )
            // InternalBlatt2.g:6885:2: ( ruleContainer )
            {
            // InternalBlatt2.g:6885:2: ( ruleContainer )
            // InternalBlatt2.g:6886:3: ruleContainer
            {
             before(grammarAccess.getAllocationContextAccess().getTargetContainerContainerParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleContainer();

            state._fsp--;

             after(grammarAccess.getAllocationContextAccess().getTargetContainerContainerParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__TargetContainerAssignment_7_2"


    // $ANTLR start "rule__AllocationContext__TargetContainerAssignment_7_3_1"
    // InternalBlatt2.g:6895:1: rule__AllocationContext__TargetContainerAssignment_7_3_1 : ( ruleContainer ) ;
    public final void rule__AllocationContext__TargetContainerAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:6899:1: ( ( ruleContainer ) )
            // InternalBlatt2.g:6900:2: ( ruleContainer )
            {
            // InternalBlatt2.g:6900:2: ( ruleContainer )
            // InternalBlatt2.g:6901:3: ruleContainer
            {
             before(grammarAccess.getAllocationContextAccess().getTargetContainerContainerParserRuleCall_7_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleContainer();

            state._fsp--;

             after(grammarAccess.getAllocationContextAccess().getTargetContainerContainerParserRuleCall_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__TargetContainerAssignment_7_3_1"


    // $ANTLR start "rule__Container__NameAssignment_1"
    // InternalBlatt2.g:6910:1: rule__Container__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Container__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:6914:1: ( ( ruleEString ) )
            // InternalBlatt2.g:6915:2: ( ruleEString )
            {
            // InternalBlatt2.g:6915:2: ( ruleEString )
            // InternalBlatt2.g:6916:3: ruleEString
            {
             before(grammarAccess.getContainerAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getContainerAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__NameAssignment_1"


    // $ANTLR start "rule__Container__LinksAssignment_5"
    // InternalBlatt2.g:6925:1: rule__Container__LinksAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__Container__LinksAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:6929:1: ( ( ( ruleEString ) ) )
            // InternalBlatt2.g:6930:2: ( ( ruleEString ) )
            {
            // InternalBlatt2.g:6930:2: ( ( ruleEString ) )
            // InternalBlatt2.g:6931:3: ( ruleEString )
            {
             before(grammarAccess.getContainerAccess().getLinksLinkCrossReference_5_0()); 
            // InternalBlatt2.g:6932:3: ( ruleEString )
            // InternalBlatt2.g:6933:4: ruleEString
            {
             before(grammarAccess.getContainerAccess().getLinksLinkEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getContainerAccess().getLinksLinkEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getContainerAccess().getLinksLinkCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__LinksAssignment_5"


    // $ANTLR start "rule__Container__LinksAssignment_6_1"
    // InternalBlatt2.g:6944:1: rule__Container__LinksAssignment_6_1 : ( ( ruleEString ) ) ;
    public final void rule__Container__LinksAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:6948:1: ( ( ( ruleEString ) ) )
            // InternalBlatt2.g:6949:2: ( ( ruleEString ) )
            {
            // InternalBlatt2.g:6949:2: ( ( ruleEString ) )
            // InternalBlatt2.g:6950:3: ( ruleEString )
            {
             before(grammarAccess.getContainerAccess().getLinksLinkCrossReference_6_1_0()); 
            // InternalBlatt2.g:6951:3: ( ruleEString )
            // InternalBlatt2.g:6952:4: ruleEString
            {
             before(grammarAccess.getContainerAccess().getLinksLinkEStringParserRuleCall_6_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getContainerAccess().getLinksLinkEStringParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getContainerAccess().getLinksLinkCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__LinksAssignment_6_1"


    // $ANTLR start "rule__AssemblyContext__NameAssignment_1"
    // InternalBlatt2.g:6963:1: rule__AssemblyContext__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__AssemblyContext__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:6967:1: ( ( ruleEString ) )
            // InternalBlatt2.g:6968:2: ( ruleEString )
            {
            // InternalBlatt2.g:6968:2: ( ruleEString )
            // InternalBlatt2.g:6969:3: ruleEString
            {
             before(grammarAccess.getAssemblyContextAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAssemblyContextAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__NameAssignment_1"


    // $ANTLR start "rule__AssemblyContext__RequiredRoleAssignment_3_2"
    // InternalBlatt2.g:6978:1: rule__AssemblyContext__RequiredRoleAssignment_3_2 : ( ( ruleEString ) ) ;
    public final void rule__AssemblyContext__RequiredRoleAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:6982:1: ( ( ( ruleEString ) ) )
            // InternalBlatt2.g:6983:2: ( ( ruleEString ) )
            {
            // InternalBlatt2.g:6983:2: ( ( ruleEString ) )
            // InternalBlatt2.g:6984:3: ( ruleEString )
            {
             before(grammarAccess.getAssemblyContextAccess().getRequiredRoleRoleCrossReference_3_2_0()); 
            // InternalBlatt2.g:6985:3: ( ruleEString )
            // InternalBlatt2.g:6986:4: ruleEString
            {
             before(grammarAccess.getAssemblyContextAccess().getRequiredRoleRoleEStringParserRuleCall_3_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAssemblyContextAccess().getRequiredRoleRoleEStringParserRuleCall_3_2_0_1()); 

            }

             after(grammarAccess.getAssemblyContextAccess().getRequiredRoleRoleCrossReference_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__RequiredRoleAssignment_3_2"


    // $ANTLR start "rule__AssemblyContext__RequiredRoleAssignment_3_3_1"
    // InternalBlatt2.g:6997:1: rule__AssemblyContext__RequiredRoleAssignment_3_3_1 : ( ( ruleEString ) ) ;
    public final void rule__AssemblyContext__RequiredRoleAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:7001:1: ( ( ( ruleEString ) ) )
            // InternalBlatt2.g:7002:2: ( ( ruleEString ) )
            {
            // InternalBlatt2.g:7002:2: ( ( ruleEString ) )
            // InternalBlatt2.g:7003:3: ( ruleEString )
            {
             before(grammarAccess.getAssemblyContextAccess().getRequiredRoleRoleCrossReference_3_3_1_0()); 
            // InternalBlatt2.g:7004:3: ( ruleEString )
            // InternalBlatt2.g:7005:4: ruleEString
            {
             before(grammarAccess.getAssemblyContextAccess().getRequiredRoleRoleEStringParserRuleCall_3_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAssemblyContextAccess().getRequiredRoleRoleEStringParserRuleCall_3_3_1_0_1()); 

            }

             after(grammarAccess.getAssemblyContextAccess().getRequiredRoleRoleCrossReference_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__RequiredRoleAssignment_3_3_1"


    // $ANTLR start "rule__AssemblyContext__AllocationContextAssignment_5"
    // InternalBlatt2.g:7016:1: rule__AssemblyContext__AllocationContextAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__AssemblyContext__AllocationContextAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:7020:1: ( ( ( ruleEString ) ) )
            // InternalBlatt2.g:7021:2: ( ( ruleEString ) )
            {
            // InternalBlatt2.g:7021:2: ( ( ruleEString ) )
            // InternalBlatt2.g:7022:3: ( ruleEString )
            {
             before(grammarAccess.getAssemblyContextAccess().getAllocationContextAllocationContextCrossReference_5_0()); 
            // InternalBlatt2.g:7023:3: ( ruleEString )
            // InternalBlatt2.g:7024:4: ruleEString
            {
             before(grammarAccess.getAssemblyContextAccess().getAllocationContextAllocationContextEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAssemblyContextAccess().getAllocationContextAllocationContextEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getAssemblyContextAccess().getAllocationContextAllocationContextCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__AllocationContextAssignment_5"


    // $ANTLR start "rule__AssemblyContext__ProvidedRoleAssignment_6_2"
    // InternalBlatt2.g:7035:1: rule__AssemblyContext__ProvidedRoleAssignment_6_2 : ( ruleRole ) ;
    public final void rule__AssemblyContext__ProvidedRoleAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:7039:1: ( ( ruleRole ) )
            // InternalBlatt2.g:7040:2: ( ruleRole )
            {
            // InternalBlatt2.g:7040:2: ( ruleRole )
            // InternalBlatt2.g:7041:3: ruleRole
            {
             before(grammarAccess.getAssemblyContextAccess().getProvidedRoleRoleParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getAssemblyContextAccess().getProvidedRoleRoleParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__ProvidedRoleAssignment_6_2"


    // $ANTLR start "rule__AssemblyContext__ProvidedRoleAssignment_6_3_1"
    // InternalBlatt2.g:7050:1: rule__AssemblyContext__ProvidedRoleAssignment_6_3_1 : ( ruleRole ) ;
    public final void rule__AssemblyContext__ProvidedRoleAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:7054:1: ( ( ruleRole ) )
            // InternalBlatt2.g:7055:2: ( ruleRole )
            {
            // InternalBlatt2.g:7055:2: ( ruleRole )
            // InternalBlatt2.g:7056:3: ruleRole
            {
             before(grammarAccess.getAssemblyContextAccess().getProvidedRoleRoleParserRuleCall_6_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getAssemblyContextAccess().getProvidedRoleRoleParserRuleCall_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__ProvidedRoleAssignment_6_3_1"


    // $ANTLR start "rule__AssemblyContext__ComponentAssignment_7_2"
    // InternalBlatt2.g:7065:1: rule__AssemblyContext__ComponentAssignment_7_2 : ( ruleComponent ) ;
    public final void rule__AssemblyContext__ComponentAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:7069:1: ( ( ruleComponent ) )
            // InternalBlatt2.g:7070:2: ( ruleComponent )
            {
            // InternalBlatt2.g:7070:2: ( ruleComponent )
            // InternalBlatt2.g:7071:3: ruleComponent
            {
             before(grammarAccess.getAssemblyContextAccess().getComponentComponentParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getAssemblyContextAccess().getComponentComponentParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__ComponentAssignment_7_2"


    // $ANTLR start "rule__AssemblyContext__ComponentAssignment_7_3_1"
    // InternalBlatt2.g:7080:1: rule__AssemblyContext__ComponentAssignment_7_3_1 : ( ruleComponent ) ;
    public final void rule__AssemblyContext__ComponentAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:7084:1: ( ( ruleComponent ) )
            // InternalBlatt2.g:7085:2: ( ruleComponent )
            {
            // InternalBlatt2.g:7085:2: ( ruleComponent )
            // InternalBlatt2.g:7086:3: ruleComponent
            {
             before(grammarAccess.getAssemblyContextAccess().getComponentComponentParserRuleCall_7_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getAssemblyContextAccess().getComponentComponentParserRuleCall_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__ComponentAssignment_7_3_1"


    // $ANTLR start "rule__Component_Impl__NameAssignment_1"
    // InternalBlatt2.g:7095:1: rule__Component_Impl__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Component_Impl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:7099:1: ( ( ruleEString ) )
            // InternalBlatt2.g:7100:2: ( ruleEString )
            {
            // InternalBlatt2.g:7100:2: ( ruleEString )
            // InternalBlatt2.g:7101:3: ruleEString
            {
             before(grammarAccess.getComponent_ImplAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComponent_ImplAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__NameAssignment_1"


    // $ANTLR start "rule__Component_Impl__RequiredInterfaceAssignment_3_2"
    // InternalBlatt2.g:7110:1: rule__Component_Impl__RequiredInterfaceAssignment_3_2 : ( ( ruleEString ) ) ;
    public final void rule__Component_Impl__RequiredInterfaceAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:7114:1: ( ( ( ruleEString ) ) )
            // InternalBlatt2.g:7115:2: ( ( ruleEString ) )
            {
            // InternalBlatt2.g:7115:2: ( ( ruleEString ) )
            // InternalBlatt2.g:7116:3: ( ruleEString )
            {
             before(grammarAccess.getComponent_ImplAccess().getRequiredInterfaceInterfaceCrossReference_3_2_0()); 
            // InternalBlatt2.g:7117:3: ( ruleEString )
            // InternalBlatt2.g:7118:4: ruleEString
            {
             before(grammarAccess.getComponent_ImplAccess().getRequiredInterfaceInterfaceEStringParserRuleCall_3_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComponent_ImplAccess().getRequiredInterfaceInterfaceEStringParserRuleCall_3_2_0_1()); 

            }

             after(grammarAccess.getComponent_ImplAccess().getRequiredInterfaceInterfaceCrossReference_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__RequiredInterfaceAssignment_3_2"


    // $ANTLR start "rule__Component_Impl__RequiredInterfaceAssignment_3_3_1"
    // InternalBlatt2.g:7129:1: rule__Component_Impl__RequiredInterfaceAssignment_3_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Component_Impl__RequiredInterfaceAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:7133:1: ( ( ( ruleEString ) ) )
            // InternalBlatt2.g:7134:2: ( ( ruleEString ) )
            {
            // InternalBlatt2.g:7134:2: ( ( ruleEString ) )
            // InternalBlatt2.g:7135:3: ( ruleEString )
            {
             before(grammarAccess.getComponent_ImplAccess().getRequiredInterfaceInterfaceCrossReference_3_3_1_0()); 
            // InternalBlatt2.g:7136:3: ( ruleEString )
            // InternalBlatt2.g:7137:4: ruleEString
            {
             before(grammarAccess.getComponent_ImplAccess().getRequiredInterfaceInterfaceEStringParserRuleCall_3_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComponent_ImplAccess().getRequiredInterfaceInterfaceEStringParserRuleCall_3_3_1_0_1()); 

            }

             after(grammarAccess.getComponent_ImplAccess().getRequiredInterfaceInterfaceCrossReference_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__RequiredInterfaceAssignment_3_3_1"


    // $ANTLR start "rule__Component_Impl__RequiredServiceAssignment_6"
    // InternalBlatt2.g:7148:1: rule__Component_Impl__RequiredServiceAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__Component_Impl__RequiredServiceAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:7152:1: ( ( ( ruleEString ) ) )
            // InternalBlatt2.g:7153:2: ( ( ruleEString ) )
            {
            // InternalBlatt2.g:7153:2: ( ( ruleEString ) )
            // InternalBlatt2.g:7154:3: ( ruleEString )
            {
             before(grammarAccess.getComponent_ImplAccess().getRequiredServiceServiceCrossReference_6_0()); 
            // InternalBlatt2.g:7155:3: ( ruleEString )
            // InternalBlatt2.g:7156:4: ruleEString
            {
             before(grammarAccess.getComponent_ImplAccess().getRequiredServiceServiceEStringParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComponent_ImplAccess().getRequiredServiceServiceEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getComponent_ImplAccess().getRequiredServiceServiceCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__RequiredServiceAssignment_6"


    // $ANTLR start "rule__Component_Impl__RequiredServiceAssignment_7_1"
    // InternalBlatt2.g:7167:1: rule__Component_Impl__RequiredServiceAssignment_7_1 : ( ( ruleEString ) ) ;
    public final void rule__Component_Impl__RequiredServiceAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:7171:1: ( ( ( ruleEString ) ) )
            // InternalBlatt2.g:7172:2: ( ( ruleEString ) )
            {
            // InternalBlatt2.g:7172:2: ( ( ruleEString ) )
            // InternalBlatt2.g:7173:3: ( ruleEString )
            {
             before(grammarAccess.getComponent_ImplAccess().getRequiredServiceServiceCrossReference_7_1_0()); 
            // InternalBlatt2.g:7174:3: ( ruleEString )
            // InternalBlatt2.g:7175:4: ruleEString
            {
             before(grammarAccess.getComponent_ImplAccess().getRequiredServiceServiceEStringParserRuleCall_7_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComponent_ImplAccess().getRequiredServiceServiceEStringParserRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getComponent_ImplAccess().getRequiredServiceServiceCrossReference_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__RequiredServiceAssignment_7_1"


    // $ANTLR start "rule__Component_Impl__ProvidedInterfaceAssignment_9_2"
    // InternalBlatt2.g:7186:1: rule__Component_Impl__ProvidedInterfaceAssignment_9_2 : ( ruleInterface ) ;
    public final void rule__Component_Impl__ProvidedInterfaceAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:7190:1: ( ( ruleInterface ) )
            // InternalBlatt2.g:7191:2: ( ruleInterface )
            {
            // InternalBlatt2.g:7191:2: ( ruleInterface )
            // InternalBlatt2.g:7192:3: ruleInterface
            {
             before(grammarAccess.getComponent_ImplAccess().getProvidedInterfaceInterfaceParserRuleCall_9_2_0()); 
            pushFollow(FOLLOW_2);
            ruleInterface();

            state._fsp--;

             after(grammarAccess.getComponent_ImplAccess().getProvidedInterfaceInterfaceParserRuleCall_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__ProvidedInterfaceAssignment_9_2"


    // $ANTLR start "rule__Component_Impl__ProvidedInterfaceAssignment_9_3_1"
    // InternalBlatt2.g:7201:1: rule__Component_Impl__ProvidedInterfaceAssignment_9_3_1 : ( ruleInterface ) ;
    public final void rule__Component_Impl__ProvidedInterfaceAssignment_9_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:7205:1: ( ( ruleInterface ) )
            // InternalBlatt2.g:7206:2: ( ruleInterface )
            {
            // InternalBlatt2.g:7206:2: ( ruleInterface )
            // InternalBlatt2.g:7207:3: ruleInterface
            {
             before(grammarAccess.getComponent_ImplAccess().getProvidedInterfaceInterfaceParserRuleCall_9_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInterface();

            state._fsp--;

             after(grammarAccess.getComponent_ImplAccess().getProvidedInterfaceInterfaceParserRuleCall_9_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__ProvidedInterfaceAssignment_9_3_1"


    // $ANTLR start "rule__Component_Impl__ProvidedServiceAssignment_12"
    // InternalBlatt2.g:7216:1: rule__Component_Impl__ProvidedServiceAssignment_12 : ( ruleService ) ;
    public final void rule__Component_Impl__ProvidedServiceAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:7220:1: ( ( ruleService ) )
            // InternalBlatt2.g:7221:2: ( ruleService )
            {
            // InternalBlatt2.g:7221:2: ( ruleService )
            // InternalBlatt2.g:7222:3: ruleService
            {
             before(grammarAccess.getComponent_ImplAccess().getProvidedServiceServiceParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleService();

            state._fsp--;

             after(grammarAccess.getComponent_ImplAccess().getProvidedServiceServiceParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__ProvidedServiceAssignment_12"


    // $ANTLR start "rule__Component_Impl__ProvidedServiceAssignment_13_1"
    // InternalBlatt2.g:7231:1: rule__Component_Impl__ProvidedServiceAssignment_13_1 : ( ruleService ) ;
    public final void rule__Component_Impl__ProvidedServiceAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:7235:1: ( ( ruleService ) )
            // InternalBlatt2.g:7236:2: ( ruleService )
            {
            // InternalBlatt2.g:7236:2: ( ruleService )
            // InternalBlatt2.g:7237:3: ruleService
            {
             before(grammarAccess.getComponent_ImplAccess().getProvidedServiceServiceParserRuleCall_13_1_0()); 
            pushFollow(FOLLOW_2);
            ruleService();

            state._fsp--;

             after(grammarAccess.getComponent_ImplAccess().getProvidedServiceServiceParserRuleCall_13_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__ProvidedServiceAssignment_13_1"


    // $ANTLR start "rule__Component_Impl__BehaviourDescriptionAssignment_16"
    // InternalBlatt2.g:7246:1: rule__Component_Impl__BehaviourDescriptionAssignment_16 : ( ruleBehaviorDescription ) ;
    public final void rule__Component_Impl__BehaviourDescriptionAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:7250:1: ( ( ruleBehaviorDescription ) )
            // InternalBlatt2.g:7251:2: ( ruleBehaviorDescription )
            {
            // InternalBlatt2.g:7251:2: ( ruleBehaviorDescription )
            // InternalBlatt2.g:7252:3: ruleBehaviorDescription
            {
             before(grammarAccess.getComponent_ImplAccess().getBehaviourDescriptionBehaviorDescriptionParserRuleCall_16_0()); 
            pushFollow(FOLLOW_2);
            ruleBehaviorDescription();

            state._fsp--;

             after(grammarAccess.getComponent_ImplAccess().getBehaviourDescriptionBehaviorDescriptionParserRuleCall_16_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__BehaviourDescriptionAssignment_16"


    // $ANTLR start "rule__Interface__NameAssignment_1"
    // InternalBlatt2.g:7261:1: rule__Interface__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Interface__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:7265:1: ( ( ruleEString ) )
            // InternalBlatt2.g:7266:2: ( ruleEString )
            {
            // InternalBlatt2.g:7266:2: ( ruleEString )
            // InternalBlatt2.g:7267:3: ruleEString
            {
             before(grammarAccess.getInterfaceAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInterfaceAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__NameAssignment_1"


    // $ANTLR start "rule__Interface__SignatureAssignment_5"
    // InternalBlatt2.g:7276:1: rule__Interface__SignatureAssignment_5 : ( ruleSignature ) ;
    public final void rule__Interface__SignatureAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:7280:1: ( ( ruleSignature ) )
            // InternalBlatt2.g:7281:2: ( ruleSignature )
            {
            // InternalBlatt2.g:7281:2: ( ruleSignature )
            // InternalBlatt2.g:7282:3: ruleSignature
            {
             before(grammarAccess.getInterfaceAccess().getSignatureSignatureParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleSignature();

            state._fsp--;

             after(grammarAccess.getInterfaceAccess().getSignatureSignatureParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__SignatureAssignment_5"


    // $ANTLR start "rule__Interface__SignatureAssignment_6_1"
    // InternalBlatt2.g:7291:1: rule__Interface__SignatureAssignment_6_1 : ( ruleSignature ) ;
    public final void rule__Interface__SignatureAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:7295:1: ( ( ruleSignature ) )
            // InternalBlatt2.g:7296:2: ( ruleSignature )
            {
            // InternalBlatt2.g:7296:2: ( ruleSignature )
            // InternalBlatt2.g:7297:3: ruleSignature
            {
             before(grammarAccess.getInterfaceAccess().getSignatureSignatureParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSignature();

            state._fsp--;

             after(grammarAccess.getInterfaceAccess().getSignatureSignatureParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__SignatureAssignment_6_1"


    // $ANTLR start "rule__Service__NameAssignment_1"
    // InternalBlatt2.g:7306:1: rule__Service__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Service__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:7310:1: ( ( ruleEString ) )
            // InternalBlatt2.g:7311:2: ( ruleEString )
            {
            // InternalBlatt2.g:7311:2: ( ruleEString )
            // InternalBlatt2.g:7312:3: ruleEString
            {
             before(grammarAccess.getServiceAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__NameAssignment_1"


    // $ANTLR start "rule__Service__CorrespondingSignatureAssignment_5"
    // InternalBlatt2.g:7321:1: rule__Service__CorrespondingSignatureAssignment_5 : ( ruleSignature ) ;
    public final void rule__Service__CorrespondingSignatureAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:7325:1: ( ( ruleSignature ) )
            // InternalBlatt2.g:7326:2: ( ruleSignature )
            {
            // InternalBlatt2.g:7326:2: ( ruleSignature )
            // InternalBlatt2.g:7327:3: ruleSignature
            {
             before(grammarAccess.getServiceAccess().getCorrespondingSignatureSignatureParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleSignature();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getCorrespondingSignatureSignatureParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__CorrespondingSignatureAssignment_5"


    // $ANTLR start "rule__Service__CorrespondingSignatureAssignment_6_1"
    // InternalBlatt2.g:7336:1: rule__Service__CorrespondingSignatureAssignment_6_1 : ( ruleSignature ) ;
    public final void rule__Service__CorrespondingSignatureAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:7340:1: ( ( ruleSignature ) )
            // InternalBlatt2.g:7341:2: ( ruleSignature )
            {
            // InternalBlatt2.g:7341:2: ( ruleSignature )
            // InternalBlatt2.g:7342:3: ruleSignature
            {
             before(grammarAccess.getServiceAccess().getCorrespondingSignatureSignatureParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSignature();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getCorrespondingSignatureSignatureParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__CorrespondingSignatureAssignment_6_1"


    // $ANTLR start "rule__BehaviorDescription__CalledServicesAssignment_3_2"
    // InternalBlatt2.g:7351:1: rule__BehaviorDescription__CalledServicesAssignment_3_2 : ( ( ruleEString ) ) ;
    public final void rule__BehaviorDescription__CalledServicesAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:7355:1: ( ( ( ruleEString ) ) )
            // InternalBlatt2.g:7356:2: ( ( ruleEString ) )
            {
            // InternalBlatt2.g:7356:2: ( ( ruleEString ) )
            // InternalBlatt2.g:7357:3: ( ruleEString )
            {
             before(grammarAccess.getBehaviorDescriptionAccess().getCalledServicesServiceCrossReference_3_2_0()); 
            // InternalBlatt2.g:7358:3: ( ruleEString )
            // InternalBlatt2.g:7359:4: ruleEString
            {
             before(grammarAccess.getBehaviorDescriptionAccess().getCalledServicesServiceEStringParserRuleCall_3_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBehaviorDescriptionAccess().getCalledServicesServiceEStringParserRuleCall_3_2_0_1()); 

            }

             after(grammarAccess.getBehaviorDescriptionAccess().getCalledServicesServiceCrossReference_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviorDescription__CalledServicesAssignment_3_2"


    // $ANTLR start "rule__BehaviorDescription__CalledServicesAssignment_3_3_1"
    // InternalBlatt2.g:7370:1: rule__BehaviorDescription__CalledServicesAssignment_3_3_1 : ( ( ruleEString ) ) ;
    public final void rule__BehaviorDescription__CalledServicesAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:7374:1: ( ( ( ruleEString ) ) )
            // InternalBlatt2.g:7375:2: ( ( ruleEString ) )
            {
            // InternalBlatt2.g:7375:2: ( ( ruleEString ) )
            // InternalBlatt2.g:7376:3: ( ruleEString )
            {
             before(grammarAccess.getBehaviorDescriptionAccess().getCalledServicesServiceCrossReference_3_3_1_0()); 
            // InternalBlatt2.g:7377:3: ( ruleEString )
            // InternalBlatt2.g:7378:4: ruleEString
            {
             before(grammarAccess.getBehaviorDescriptionAccess().getCalledServicesServiceEStringParserRuleCall_3_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBehaviorDescriptionAccess().getCalledServicesServiceEStringParserRuleCall_3_3_1_0_1()); 

            }

             after(grammarAccess.getBehaviorDescriptionAccess().getCalledServicesServiceCrossReference_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviorDescription__CalledServicesAssignment_3_3_1"


    // $ANTLR start "rule__BehaviorDescription__InternalActionsAssignment_4_1"
    // InternalBlatt2.g:7389:1: rule__BehaviorDescription__InternalActionsAssignment_4_1 : ( ruleInternalAction ) ;
    public final void rule__BehaviorDescription__InternalActionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:7393:1: ( ( ruleInternalAction ) )
            // InternalBlatt2.g:7394:2: ( ruleInternalAction )
            {
            // InternalBlatt2.g:7394:2: ( ruleInternalAction )
            // InternalBlatt2.g:7395:3: ruleInternalAction
            {
             before(grammarAccess.getBehaviorDescriptionAccess().getInternalActionsInternalActionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInternalAction();

            state._fsp--;

             after(grammarAccess.getBehaviorDescriptionAccess().getInternalActionsInternalActionParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviorDescription__InternalActionsAssignment_4_1"


    // $ANTLR start "rule__BehaviorDescription__LoopsAssignment_5_1"
    // InternalBlatt2.g:7404:1: rule__BehaviorDescription__LoopsAssignment_5_1 : ( ruleLoop ) ;
    public final void rule__BehaviorDescription__LoopsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:7408:1: ( ( ruleLoop ) )
            // InternalBlatt2.g:7409:2: ( ruleLoop )
            {
            // InternalBlatt2.g:7409:2: ( ruleLoop )
            // InternalBlatt2.g:7410:3: ruleLoop
            {
             before(grammarAccess.getBehaviorDescriptionAccess().getLoopsLoopParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLoop();

            state._fsp--;

             after(grammarAccess.getBehaviorDescriptionAccess().getLoopsLoopParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviorDescription__LoopsAssignment_5_1"


    // $ANTLR start "rule__BehaviorDescription__BranchesAssignment_6_1"
    // InternalBlatt2.g:7419:1: rule__BehaviorDescription__BranchesAssignment_6_1 : ( ruleBranch ) ;
    public final void rule__BehaviorDescription__BranchesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:7423:1: ( ( ruleBranch ) )
            // InternalBlatt2.g:7424:2: ( ruleBranch )
            {
            // InternalBlatt2.g:7424:2: ( ruleBranch )
            // InternalBlatt2.g:7425:3: ruleBranch
            {
             before(grammarAccess.getBehaviorDescriptionAccess().getBranchesBranchParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBranch();

            state._fsp--;

             after(grammarAccess.getBehaviorDescriptionAccess().getBranchesBranchParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviorDescription__BranchesAssignment_6_1"


    // $ANTLR start "rule__CompositeComponent__NameAssignment_1"
    // InternalBlatt2.g:7434:1: rule__CompositeComponent__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__CompositeComponent__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:7438:1: ( ( ruleEString ) )
            // InternalBlatt2.g:7439:2: ( ruleEString )
            {
            // InternalBlatt2.g:7439:2: ( ruleEString )
            // InternalBlatt2.g:7440:3: ruleEString
            {
             before(grammarAccess.getCompositeComponentAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCompositeComponentAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__NameAssignment_1"


    // $ANTLR start "rule__CompositeComponent__RequiredInterfaceAssignment_3_2"
    // InternalBlatt2.g:7449:1: rule__CompositeComponent__RequiredInterfaceAssignment_3_2 : ( ( ruleEString ) ) ;
    public final void rule__CompositeComponent__RequiredInterfaceAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:7453:1: ( ( ( ruleEString ) ) )
            // InternalBlatt2.g:7454:2: ( ( ruleEString ) )
            {
            // InternalBlatt2.g:7454:2: ( ( ruleEString ) )
            // InternalBlatt2.g:7455:3: ( ruleEString )
            {
             before(grammarAccess.getCompositeComponentAccess().getRequiredInterfaceInterfaceCrossReference_3_2_0()); 
            // InternalBlatt2.g:7456:3: ( ruleEString )
            // InternalBlatt2.g:7457:4: ruleEString
            {
             before(grammarAccess.getCompositeComponentAccess().getRequiredInterfaceInterfaceEStringParserRuleCall_3_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCompositeComponentAccess().getRequiredInterfaceInterfaceEStringParserRuleCall_3_2_0_1()); 

            }

             after(grammarAccess.getCompositeComponentAccess().getRequiredInterfaceInterfaceCrossReference_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__RequiredInterfaceAssignment_3_2"


    // $ANTLR start "rule__CompositeComponent__RequiredInterfaceAssignment_3_3_1"
    // InternalBlatt2.g:7468:1: rule__CompositeComponent__RequiredInterfaceAssignment_3_3_1 : ( ( ruleEString ) ) ;
    public final void rule__CompositeComponent__RequiredInterfaceAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:7472:1: ( ( ( ruleEString ) ) )
            // InternalBlatt2.g:7473:2: ( ( ruleEString ) )
            {
            // InternalBlatt2.g:7473:2: ( ( ruleEString ) )
            // InternalBlatt2.g:7474:3: ( ruleEString )
            {
             before(grammarAccess.getCompositeComponentAccess().getRequiredInterfaceInterfaceCrossReference_3_3_1_0()); 
            // InternalBlatt2.g:7475:3: ( ruleEString )
            // InternalBlatt2.g:7476:4: ruleEString
            {
             before(grammarAccess.getCompositeComponentAccess().getRequiredInterfaceInterfaceEStringParserRuleCall_3_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCompositeComponentAccess().getRequiredInterfaceInterfaceEStringParserRuleCall_3_3_1_0_1()); 

            }

             after(grammarAccess.getCompositeComponentAccess().getRequiredInterfaceInterfaceCrossReference_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__RequiredInterfaceAssignment_3_3_1"


    // $ANTLR start "rule__CompositeComponent__RequiredServiceAssignment_6"
    // InternalBlatt2.g:7487:1: rule__CompositeComponent__RequiredServiceAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__CompositeComponent__RequiredServiceAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:7491:1: ( ( ( ruleEString ) ) )
            // InternalBlatt2.g:7492:2: ( ( ruleEString ) )
            {
            // InternalBlatt2.g:7492:2: ( ( ruleEString ) )
            // InternalBlatt2.g:7493:3: ( ruleEString )
            {
             before(grammarAccess.getCompositeComponentAccess().getRequiredServiceServiceCrossReference_6_0()); 
            // InternalBlatt2.g:7494:3: ( ruleEString )
            // InternalBlatt2.g:7495:4: ruleEString
            {
             before(grammarAccess.getCompositeComponentAccess().getRequiredServiceServiceEStringParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCompositeComponentAccess().getRequiredServiceServiceEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getCompositeComponentAccess().getRequiredServiceServiceCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__RequiredServiceAssignment_6"


    // $ANTLR start "rule__CompositeComponent__RequiredServiceAssignment_7_1"
    // InternalBlatt2.g:7506:1: rule__CompositeComponent__RequiredServiceAssignment_7_1 : ( ( ruleEString ) ) ;
    public final void rule__CompositeComponent__RequiredServiceAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:7510:1: ( ( ( ruleEString ) ) )
            // InternalBlatt2.g:7511:2: ( ( ruleEString ) )
            {
            // InternalBlatt2.g:7511:2: ( ( ruleEString ) )
            // InternalBlatt2.g:7512:3: ( ruleEString )
            {
             before(grammarAccess.getCompositeComponentAccess().getRequiredServiceServiceCrossReference_7_1_0()); 
            // InternalBlatt2.g:7513:3: ( ruleEString )
            // InternalBlatt2.g:7514:4: ruleEString
            {
             before(grammarAccess.getCompositeComponentAccess().getRequiredServiceServiceEStringParserRuleCall_7_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCompositeComponentAccess().getRequiredServiceServiceEStringParserRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getCompositeComponentAccess().getRequiredServiceServiceCrossReference_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__RequiredServiceAssignment_7_1"


    // $ANTLR start "rule__CompositeComponent__ProvidedInterfaceAssignment_9_2"
    // InternalBlatt2.g:7525:1: rule__CompositeComponent__ProvidedInterfaceAssignment_9_2 : ( ruleInterface ) ;
    public final void rule__CompositeComponent__ProvidedInterfaceAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:7529:1: ( ( ruleInterface ) )
            // InternalBlatt2.g:7530:2: ( ruleInterface )
            {
            // InternalBlatt2.g:7530:2: ( ruleInterface )
            // InternalBlatt2.g:7531:3: ruleInterface
            {
             before(grammarAccess.getCompositeComponentAccess().getProvidedInterfaceInterfaceParserRuleCall_9_2_0()); 
            pushFollow(FOLLOW_2);
            ruleInterface();

            state._fsp--;

             after(grammarAccess.getCompositeComponentAccess().getProvidedInterfaceInterfaceParserRuleCall_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__ProvidedInterfaceAssignment_9_2"


    // $ANTLR start "rule__CompositeComponent__ProvidedInterfaceAssignment_9_3_1"
    // InternalBlatt2.g:7540:1: rule__CompositeComponent__ProvidedInterfaceAssignment_9_3_1 : ( ruleInterface ) ;
    public final void rule__CompositeComponent__ProvidedInterfaceAssignment_9_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:7544:1: ( ( ruleInterface ) )
            // InternalBlatt2.g:7545:2: ( ruleInterface )
            {
            // InternalBlatt2.g:7545:2: ( ruleInterface )
            // InternalBlatt2.g:7546:3: ruleInterface
            {
             before(grammarAccess.getCompositeComponentAccess().getProvidedInterfaceInterfaceParserRuleCall_9_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInterface();

            state._fsp--;

             after(grammarAccess.getCompositeComponentAccess().getProvidedInterfaceInterfaceParserRuleCall_9_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__ProvidedInterfaceAssignment_9_3_1"


    // $ANTLR start "rule__CompositeComponent__ProvidedServiceAssignment_12"
    // InternalBlatt2.g:7555:1: rule__CompositeComponent__ProvidedServiceAssignment_12 : ( ruleService ) ;
    public final void rule__CompositeComponent__ProvidedServiceAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:7559:1: ( ( ruleService ) )
            // InternalBlatt2.g:7560:2: ( ruleService )
            {
            // InternalBlatt2.g:7560:2: ( ruleService )
            // InternalBlatt2.g:7561:3: ruleService
            {
             before(grammarAccess.getCompositeComponentAccess().getProvidedServiceServiceParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleService();

            state._fsp--;

             after(grammarAccess.getCompositeComponentAccess().getProvidedServiceServiceParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__ProvidedServiceAssignment_12"


    // $ANTLR start "rule__CompositeComponent__ProvidedServiceAssignment_13_1"
    // InternalBlatt2.g:7570:1: rule__CompositeComponent__ProvidedServiceAssignment_13_1 : ( ruleService ) ;
    public final void rule__CompositeComponent__ProvidedServiceAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:7574:1: ( ( ruleService ) )
            // InternalBlatt2.g:7575:2: ( ruleService )
            {
            // InternalBlatt2.g:7575:2: ( ruleService )
            // InternalBlatt2.g:7576:3: ruleService
            {
             before(grammarAccess.getCompositeComponentAccess().getProvidedServiceServiceParserRuleCall_13_1_0()); 
            pushFollow(FOLLOW_2);
            ruleService();

            state._fsp--;

             after(grammarAccess.getCompositeComponentAccess().getProvidedServiceServiceParserRuleCall_13_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__ProvidedServiceAssignment_13_1"


    // $ANTLR start "rule__CompositeComponent__BehaviourDescriptionAssignment_16"
    // InternalBlatt2.g:7585:1: rule__CompositeComponent__BehaviourDescriptionAssignment_16 : ( ruleBehaviorDescription ) ;
    public final void rule__CompositeComponent__BehaviourDescriptionAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:7589:1: ( ( ruleBehaviorDescription ) )
            // InternalBlatt2.g:7590:2: ( ruleBehaviorDescription )
            {
            // InternalBlatt2.g:7590:2: ( ruleBehaviorDescription )
            // InternalBlatt2.g:7591:3: ruleBehaviorDescription
            {
             before(grammarAccess.getCompositeComponentAccess().getBehaviourDescriptionBehaviorDescriptionParserRuleCall_16_0()); 
            pushFollow(FOLLOW_2);
            ruleBehaviorDescription();

            state._fsp--;

             after(grammarAccess.getCompositeComponentAccess().getBehaviourDescriptionBehaviorDescriptionParserRuleCall_16_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__BehaviourDescriptionAssignment_16"


    // $ANTLR start "rule__CompositeComponent__EncapsulatedAssemblyContextAssignment_18"
    // InternalBlatt2.g:7600:1: rule__CompositeComponent__EncapsulatedAssemblyContextAssignment_18 : ( ruleAssemblyContext ) ;
    public final void rule__CompositeComponent__EncapsulatedAssemblyContextAssignment_18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:7604:1: ( ( ruleAssemblyContext ) )
            // InternalBlatt2.g:7605:2: ( ruleAssemblyContext )
            {
            // InternalBlatt2.g:7605:2: ( ruleAssemblyContext )
            // InternalBlatt2.g:7606:3: ruleAssemblyContext
            {
             before(grammarAccess.getCompositeComponentAccess().getEncapsulatedAssemblyContextAssemblyContextParserRuleCall_18_0()); 
            pushFollow(FOLLOW_2);
            ruleAssemblyContext();

            state._fsp--;

             after(grammarAccess.getCompositeComponentAccess().getEncapsulatedAssemblyContextAssemblyContextParserRuleCall_18_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__EncapsulatedAssemblyContextAssignment_18"


    // $ANTLR start "rule__Signature__NameAssignment_1"
    // InternalBlatt2.g:7615:1: rule__Signature__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Signature__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:7619:1: ( ( ruleEString ) )
            // InternalBlatt2.g:7620:2: ( ruleEString )
            {
            // InternalBlatt2.g:7620:2: ( ruleEString )
            // InternalBlatt2.g:7621:3: ruleEString
            {
             before(grammarAccess.getSignatureAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSignatureAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__NameAssignment_1"


    // $ANTLR start "rule__Signature__ReturnTypeAssignment_4"
    // InternalBlatt2.g:7630:1: rule__Signature__ReturnTypeAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Signature__ReturnTypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:7634:1: ( ( ( ruleEString ) ) )
            // InternalBlatt2.g:7635:2: ( ( ruleEString ) )
            {
            // InternalBlatt2.g:7635:2: ( ( ruleEString ) )
            // InternalBlatt2.g:7636:3: ( ruleEString )
            {
             before(grammarAccess.getSignatureAccess().getReturnTypeTypeCrossReference_4_0()); 
            // InternalBlatt2.g:7637:3: ( ruleEString )
            // InternalBlatt2.g:7638:4: ruleEString
            {
             before(grammarAccess.getSignatureAccess().getReturnTypeTypeEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSignatureAccess().getReturnTypeTypeEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getSignatureAccess().getReturnTypeTypeCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__ReturnTypeAssignment_4"


    // $ANTLR start "rule__Signature__ParameterTypeAssignment_5_2"
    // InternalBlatt2.g:7649:1: rule__Signature__ParameterTypeAssignment_5_2 : ( ( ruleEString ) ) ;
    public final void rule__Signature__ParameterTypeAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:7653:1: ( ( ( ruleEString ) ) )
            // InternalBlatt2.g:7654:2: ( ( ruleEString ) )
            {
            // InternalBlatt2.g:7654:2: ( ( ruleEString ) )
            // InternalBlatt2.g:7655:3: ( ruleEString )
            {
             before(grammarAccess.getSignatureAccess().getParameterTypeTypeCrossReference_5_2_0()); 
            // InternalBlatt2.g:7656:3: ( ruleEString )
            // InternalBlatt2.g:7657:4: ruleEString
            {
             before(grammarAccess.getSignatureAccess().getParameterTypeTypeEStringParserRuleCall_5_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSignatureAccess().getParameterTypeTypeEStringParserRuleCall_5_2_0_1()); 

            }

             after(grammarAccess.getSignatureAccess().getParameterTypeTypeCrossReference_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__ParameterTypeAssignment_5_2"


    // $ANTLR start "rule__Signature__ParameterTypeAssignment_5_3_1"
    // InternalBlatt2.g:7668:1: rule__Signature__ParameterTypeAssignment_5_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Signature__ParameterTypeAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBlatt2.g:7672:1: ( ( ( ruleEString ) ) )
            // InternalBlatt2.g:7673:2: ( ( ruleEString ) )
            {
            // InternalBlatt2.g:7673:2: ( ( ruleEString ) )
            // InternalBlatt2.g:7674:3: ( ruleEString )
            {
             before(grammarAccess.getSignatureAccess().getParameterTypeTypeCrossReference_5_3_1_0()); 
            // InternalBlatt2.g:7675:3: ( ruleEString )
            // InternalBlatt2.g:7676:4: ruleEString
            {
             before(grammarAccess.getSignatureAccess().getParameterTypeTypeEStringParserRuleCall_5_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSignatureAccess().getParameterTypeTypeEStringParserRuleCall_5_3_1_0_1()); 

            }

             after(grammarAccess.getSignatureAccess().getParameterTypeTypeCrossReference_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__ParameterTypeAssignment_5_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000003010000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000040008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000090000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000120000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000003C000010000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000400000010000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0800000000000000L});

}