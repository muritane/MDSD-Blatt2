package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

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
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Hello'", "'!'", "'AllocationContext'", "'{'", "'allocatedAssemblyContext'", "'('", "')'", "'}'", "','", "'targetContainer'", "'SystemEnvironment'", "'container'", "'link'", "'Container'", "'links'", "'System'", "'encapsulatedAssemblyContext'", "'environment'", "'allocationContext'", "'providedInterfaces'", "'AssemblyContext'", "'requiredRole'", "'providedRole'", "'component'", "'Link'", "'linkedContainers'", "'Component'", "'requiredInterface'", "'requiredService'", "'providedInterface'", "'providedService'", "'behaviourDescription'", "'BehaviorDescription'", "'calledServices'", "'internalActions'", "'loops'", "'branches'", "'CompositeComponent'", "'Service'", "'correspondingSignature'", "'Interface'", "'signature'", "'Signature'", "'returnType'", "'parameterType'", "'InternalAction'", "'Loop'", "'Branch'", "'Type'", "'List'", "'Map'", "'ComplexType'", "'Date'", "'Double'", "'String'", "'Int'", "'Char'", "'Long'", "'Float'", "'Boolean'", "'Void'"
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
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
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


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


    	private MyDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleModel EOF )
            // InternalMyDsl.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:62:1: ruleModel : ( ( rule__Model__GreetingsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Model__GreetingsAssignment )* ) )
            // InternalMyDsl.g:67:2: ( ( rule__Model__GreetingsAssignment )* )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Model__GreetingsAssignment )* )
            // InternalMyDsl.g:68:3: ( rule__Model__GreetingsAssignment )*
            {
             before(grammarAccess.getModelAccess().getGreetingsAssignment()); 
            // InternalMyDsl.g:69:3: ( rule__Model__GreetingsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==13||LA1_0==21||LA1_0==24||LA1_0==26||LA1_0==31||LA1_0==35||LA1_0==37||(LA1_0>=48 && LA1_0<=49)||LA1_0==51||LA1_0==53) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:69:4: rule__Model__GreetingsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__GreetingsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGreetingsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleAbstractElement"
    // InternalMyDsl.g:78:1: entryRuleAbstractElement : ruleAbstractElement EOF ;
    public final void entryRuleAbstractElement() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleAbstractElement EOF )
            // InternalMyDsl.g:80:1: ruleAbstractElement EOF
            {
             before(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getAbstractElementRule()); 
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
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // InternalMyDsl.g:87:1: ruleAbstractElement : ( ( rule__AbstractElement__Alternatives ) ) ;
    public final void ruleAbstractElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__AbstractElement__Alternatives ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__AbstractElement__Alternatives ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__AbstractElement__Alternatives ) )
            // InternalMyDsl.g:93:3: ( rule__AbstractElement__Alternatives )
            {
             before(grammarAccess.getAbstractElementAccess().getAlternatives()); 
            // InternalMyDsl.g:94:3: ( rule__AbstractElement__Alternatives )
            // InternalMyDsl.g:94:4: rule__AbstractElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleAllocationContext"
    // InternalMyDsl.g:103:1: entryRuleAllocationContext : ruleAllocationContext EOF ;
    public final void entryRuleAllocationContext() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleAllocationContext EOF )
            // InternalMyDsl.g:105:1: ruleAllocationContext EOF
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
    // InternalMyDsl.g:112:1: ruleAllocationContext : ( ( rule__AllocationContext__Group__0 ) ) ;
    public final void ruleAllocationContext() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__AllocationContext__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__AllocationContext__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__AllocationContext__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__AllocationContext__Group__0 )
            {
             before(grammarAccess.getAllocationContextAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__AllocationContext__Group__0 )
            // InternalMyDsl.g:119:4: rule__AllocationContext__Group__0
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


    // $ANTLR start "entryRuleSystemEnvironment"
    // InternalMyDsl.g:128:1: entryRuleSystemEnvironment : ruleSystemEnvironment EOF ;
    public final void entryRuleSystemEnvironment() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleSystemEnvironment EOF )
            // InternalMyDsl.g:130:1: ruleSystemEnvironment EOF
            {
             before(grammarAccess.getSystemEnvironmentRule()); 
            pushFollow(FOLLOW_1);
            ruleSystemEnvironment();

            state._fsp--;

             after(grammarAccess.getSystemEnvironmentRule()); 
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
    // $ANTLR end "entryRuleSystemEnvironment"


    // $ANTLR start "ruleSystemEnvironment"
    // InternalMyDsl.g:137:1: ruleSystemEnvironment : ( ( rule__SystemEnvironment__Group__0 ) ) ;
    public final void ruleSystemEnvironment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__SystemEnvironment__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__SystemEnvironment__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__SystemEnvironment__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__SystemEnvironment__Group__0 )
            {
             before(grammarAccess.getSystemEnvironmentAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__SystemEnvironment__Group__0 )
            // InternalMyDsl.g:144:4: rule__SystemEnvironment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SystemEnvironment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSystemEnvironmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSystemEnvironment"


    // $ANTLR start "entryRuleComponent"
    // InternalMyDsl.g:153:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleComponent EOF )
            // InternalMyDsl.g:155:1: ruleComponent EOF
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
    // InternalMyDsl.g:162:1: ruleComponent : ( ( rule__Component__Alternatives ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Component__Alternatives ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Component__Alternatives ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Component__Alternatives ) )
            // InternalMyDsl.g:168:3: ( rule__Component__Alternatives )
            {
             before(grammarAccess.getComponentAccess().getAlternatives()); 
            // InternalMyDsl.g:169:3: ( rule__Component__Alternatives )
            // InternalMyDsl.g:169:4: rule__Component__Alternatives
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
    // InternalMyDsl.g:178:1: entryRuleContainer : ruleContainer EOF ;
    public final void entryRuleContainer() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleContainer EOF )
            // InternalMyDsl.g:180:1: ruleContainer EOF
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
    // InternalMyDsl.g:187:1: ruleContainer : ( ( rule__Container__Group__0 ) ) ;
    public final void ruleContainer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__Container__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__Container__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__Container__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__Container__Group__0 )
            {
             before(grammarAccess.getContainerAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__Container__Group__0 )
            // InternalMyDsl.g:194:4: rule__Container__Group__0
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


    // $ANTLR start "entryRuleSystem"
    // InternalMyDsl.g:203:1: entryRuleSystem : ruleSystem EOF ;
    public final void entryRuleSystem() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleSystem EOF )
            // InternalMyDsl.g:205:1: ruleSystem EOF
            {
             before(grammarAccess.getSystemRule()); 
            pushFollow(FOLLOW_1);
            ruleSystem();

            state._fsp--;

             after(grammarAccess.getSystemRule()); 
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
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // InternalMyDsl.g:212:1: ruleSystem : ( ( rule__System__Group__0 ) ) ;
    public final void ruleSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__System__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__System__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__System__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__System__Group__0 )
            {
             before(grammarAccess.getSystemAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__System__Group__0 )
            // InternalMyDsl.g:219:4: rule__System__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__System__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSystem"


    // $ANTLR start "entryRuleAssemblyContext"
    // InternalMyDsl.g:228:1: entryRuleAssemblyContext : ruleAssemblyContext EOF ;
    public final void entryRuleAssemblyContext() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleAssemblyContext EOF )
            // InternalMyDsl.g:230:1: ruleAssemblyContext EOF
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
    // InternalMyDsl.g:237:1: ruleAssemblyContext : ( ( rule__AssemblyContext__Group__0 ) ) ;
    public final void ruleAssemblyContext() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__AssemblyContext__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__AssemblyContext__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__AssemblyContext__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__AssemblyContext__Group__0 )
            {
             before(grammarAccess.getAssemblyContextAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__AssemblyContext__Group__0 )
            // InternalMyDsl.g:244:4: rule__AssemblyContext__Group__0
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


    // $ANTLR start "entryRuleLink"
    // InternalMyDsl.g:253:1: entryRuleLink : ruleLink EOF ;
    public final void entryRuleLink() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleLink EOF )
            // InternalMyDsl.g:255:1: ruleLink EOF
            {
             before(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_1);
            ruleLink();

            state._fsp--;

             after(grammarAccess.getLinkRule()); 
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
    // $ANTLR end "entryRuleLink"


    // $ANTLR start "ruleLink"
    // InternalMyDsl.g:262:1: ruleLink : ( ( rule__Link__Group__0 ) ) ;
    public final void ruleLink() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__Link__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__Link__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__Link__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__Link__Group__0 )
            {
             before(grammarAccess.getLinkAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__Link__Group__0 )
            // InternalMyDsl.g:269:4: rule__Link__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLink"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:278:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleEString EOF )
            // InternalMyDsl.g:280:1: ruleEString EOF
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
    // InternalMyDsl.g:287:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__EString__Alternatives ) )
            // InternalMyDsl.g:293:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalMyDsl.g:294:3: ( rule__EString__Alternatives )
            // InternalMyDsl.g:294:4: rule__EString__Alternatives
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


    // $ANTLR start "entryRuleComponent_Impl"
    // InternalMyDsl.g:303:1: entryRuleComponent_Impl : ruleComponent_Impl EOF ;
    public final void entryRuleComponent_Impl() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleComponent_Impl EOF )
            // InternalMyDsl.g:305:1: ruleComponent_Impl EOF
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
    // InternalMyDsl.g:312:1: ruleComponent_Impl : ( ( rule__Component_Impl__Group__0 ) ) ;
    public final void ruleComponent_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__Component_Impl__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__Component_Impl__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__Component_Impl__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__Component_Impl__Group__0 )
            {
             before(grammarAccess.getComponent_ImplAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__Component_Impl__Group__0 )
            // InternalMyDsl.g:319:4: rule__Component_Impl__Group__0
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


    // $ANTLR start "entryRuleBehaviorDescription"
    // InternalMyDsl.g:328:1: entryRuleBehaviorDescription : ruleBehaviorDescription EOF ;
    public final void entryRuleBehaviorDescription() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleBehaviorDescription EOF )
            // InternalMyDsl.g:330:1: ruleBehaviorDescription EOF
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
    // InternalMyDsl.g:337:1: ruleBehaviorDescription : ( ( rule__BehaviorDescription__Group__0 ) ) ;
    public final void ruleBehaviorDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__BehaviorDescription__Group__0 ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__BehaviorDescription__Group__0 ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__BehaviorDescription__Group__0 ) )
            // InternalMyDsl.g:343:3: ( rule__BehaviorDescription__Group__0 )
            {
             before(grammarAccess.getBehaviorDescriptionAccess().getGroup()); 
            // InternalMyDsl.g:344:3: ( rule__BehaviorDescription__Group__0 )
            // InternalMyDsl.g:344:4: rule__BehaviorDescription__Group__0
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
    // InternalMyDsl.g:353:1: entryRuleCompositeComponent : ruleCompositeComponent EOF ;
    public final void entryRuleCompositeComponent() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( ruleCompositeComponent EOF )
            // InternalMyDsl.g:355:1: ruleCompositeComponent EOF
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
    // InternalMyDsl.g:362:1: ruleCompositeComponent : ( ( rule__CompositeComponent__Group__0 ) ) ;
    public final void ruleCompositeComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__CompositeComponent__Group__0 ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__CompositeComponent__Group__0 ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__CompositeComponent__Group__0 ) )
            // InternalMyDsl.g:368:3: ( rule__CompositeComponent__Group__0 )
            {
             before(grammarAccess.getCompositeComponentAccess().getGroup()); 
            // InternalMyDsl.g:369:3: ( rule__CompositeComponent__Group__0 )
            // InternalMyDsl.g:369:4: rule__CompositeComponent__Group__0
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


    // $ANTLR start "entryRuleService"
    // InternalMyDsl.g:378:1: entryRuleService : ruleService EOF ;
    public final void entryRuleService() throws RecognitionException {
        try {
            // InternalMyDsl.g:379:1: ( ruleService EOF )
            // InternalMyDsl.g:380:1: ruleService EOF
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
    // InternalMyDsl.g:387:1: ruleService : ( ( rule__Service__Group__0 ) ) ;
    public final void ruleService() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__Service__Group__0 ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__Service__Group__0 ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__Service__Group__0 ) )
            // InternalMyDsl.g:393:3: ( rule__Service__Group__0 )
            {
             before(grammarAccess.getServiceAccess().getGroup()); 
            // InternalMyDsl.g:394:3: ( rule__Service__Group__0 )
            // InternalMyDsl.g:394:4: rule__Service__Group__0
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


    // $ANTLR start "entryRuleInterface"
    // InternalMyDsl.g:403:1: entryRuleInterface : ruleInterface EOF ;
    public final void entryRuleInterface() throws RecognitionException {
        try {
            // InternalMyDsl.g:404:1: ( ruleInterface EOF )
            // InternalMyDsl.g:405:1: ruleInterface EOF
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
    // InternalMyDsl.g:412:1: ruleInterface : ( ( rule__Interface__Group__0 ) ) ;
    public final void ruleInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:2: ( ( ( rule__Interface__Group__0 ) ) )
            // InternalMyDsl.g:417:2: ( ( rule__Interface__Group__0 ) )
            {
            // InternalMyDsl.g:417:2: ( ( rule__Interface__Group__0 ) )
            // InternalMyDsl.g:418:3: ( rule__Interface__Group__0 )
            {
             before(grammarAccess.getInterfaceAccess().getGroup()); 
            // InternalMyDsl.g:419:3: ( rule__Interface__Group__0 )
            // InternalMyDsl.g:419:4: rule__Interface__Group__0
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


    // $ANTLR start "entryRuleSignature"
    // InternalMyDsl.g:428:1: entryRuleSignature : ruleSignature EOF ;
    public final void entryRuleSignature() throws RecognitionException {
        try {
            // InternalMyDsl.g:429:1: ( ruleSignature EOF )
            // InternalMyDsl.g:430:1: ruleSignature EOF
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
    // InternalMyDsl.g:437:1: ruleSignature : ( ( rule__Signature__Group__0 ) ) ;
    public final void ruleSignature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:441:2: ( ( ( rule__Signature__Group__0 ) ) )
            // InternalMyDsl.g:442:2: ( ( rule__Signature__Group__0 ) )
            {
            // InternalMyDsl.g:442:2: ( ( rule__Signature__Group__0 ) )
            // InternalMyDsl.g:443:3: ( rule__Signature__Group__0 )
            {
             before(grammarAccess.getSignatureAccess().getGroup()); 
            // InternalMyDsl.g:444:3: ( rule__Signature__Group__0 )
            // InternalMyDsl.g:444:4: rule__Signature__Group__0
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


    // $ANTLR start "entryRuleInternalAction"
    // InternalMyDsl.g:453:1: entryRuleInternalAction : ruleInternalAction EOF ;
    public final void entryRuleInternalAction() throws RecognitionException {
        try {
            // InternalMyDsl.g:454:1: ( ruleInternalAction EOF )
            // InternalMyDsl.g:455:1: ruleInternalAction EOF
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
    // InternalMyDsl.g:462:1: ruleInternalAction : ( ( rule__InternalAction__Group__0 ) ) ;
    public final void ruleInternalAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:466:2: ( ( ( rule__InternalAction__Group__0 ) ) )
            // InternalMyDsl.g:467:2: ( ( rule__InternalAction__Group__0 ) )
            {
            // InternalMyDsl.g:467:2: ( ( rule__InternalAction__Group__0 ) )
            // InternalMyDsl.g:468:3: ( rule__InternalAction__Group__0 )
            {
             before(grammarAccess.getInternalActionAccess().getGroup()); 
            // InternalMyDsl.g:469:3: ( rule__InternalAction__Group__0 )
            // InternalMyDsl.g:469:4: rule__InternalAction__Group__0
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
    // InternalMyDsl.g:478:1: entryRuleLoop : ruleLoop EOF ;
    public final void entryRuleLoop() throws RecognitionException {
        try {
            // InternalMyDsl.g:479:1: ( ruleLoop EOF )
            // InternalMyDsl.g:480:1: ruleLoop EOF
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
    // InternalMyDsl.g:487:1: ruleLoop : ( ( rule__Loop__Group__0 ) ) ;
    public final void ruleLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:491:2: ( ( ( rule__Loop__Group__0 ) ) )
            // InternalMyDsl.g:492:2: ( ( rule__Loop__Group__0 ) )
            {
            // InternalMyDsl.g:492:2: ( ( rule__Loop__Group__0 ) )
            // InternalMyDsl.g:493:3: ( rule__Loop__Group__0 )
            {
             before(grammarAccess.getLoopAccess().getGroup()); 
            // InternalMyDsl.g:494:3: ( rule__Loop__Group__0 )
            // InternalMyDsl.g:494:4: rule__Loop__Group__0
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
    // InternalMyDsl.g:503:1: entryRuleBranch : ruleBranch EOF ;
    public final void entryRuleBranch() throws RecognitionException {
        try {
            // InternalMyDsl.g:504:1: ( ruleBranch EOF )
            // InternalMyDsl.g:505:1: ruleBranch EOF
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
    // InternalMyDsl.g:512:1: ruleBranch : ( ( rule__Branch__Group__0 ) ) ;
    public final void ruleBranch() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:516:2: ( ( ( rule__Branch__Group__0 ) ) )
            // InternalMyDsl.g:517:2: ( ( rule__Branch__Group__0 ) )
            {
            // InternalMyDsl.g:517:2: ( ( rule__Branch__Group__0 ) )
            // InternalMyDsl.g:518:3: ( rule__Branch__Group__0 )
            {
             before(grammarAccess.getBranchAccess().getGroup()); 
            // InternalMyDsl.g:519:3: ( rule__Branch__Group__0 )
            // InternalMyDsl.g:519:4: rule__Branch__Group__0
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


    // $ANTLR start "entryRuleType"
    // InternalMyDsl.g:528:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalMyDsl.g:529:1: ( ruleType EOF )
            // InternalMyDsl.g:530:1: ruleType EOF
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
    // InternalMyDsl.g:537:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:541:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalMyDsl.g:542:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalMyDsl.g:542:2: ( ( rule__Type__Alternatives ) )
            // InternalMyDsl.g:543:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:544:3: ( rule__Type__Alternatives )
            // InternalMyDsl.g:544:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleType_Impl"
    // InternalMyDsl.g:553:1: entryRuleType_Impl : ruleType_Impl EOF ;
    public final void entryRuleType_Impl() throws RecognitionException {
        try {
            // InternalMyDsl.g:554:1: ( ruleType_Impl EOF )
            // InternalMyDsl.g:555:1: ruleType_Impl EOF
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
    // InternalMyDsl.g:562:1: ruleType_Impl : ( ( rule__Type_Impl__Group__0 ) ) ;
    public final void ruleType_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:566:2: ( ( ( rule__Type_Impl__Group__0 ) ) )
            // InternalMyDsl.g:567:2: ( ( rule__Type_Impl__Group__0 ) )
            {
            // InternalMyDsl.g:567:2: ( ( rule__Type_Impl__Group__0 ) )
            // InternalMyDsl.g:568:3: ( rule__Type_Impl__Group__0 )
            {
             before(grammarAccess.getType_ImplAccess().getGroup()); 
            // InternalMyDsl.g:569:3: ( rule__Type_Impl__Group__0 )
            // InternalMyDsl.g:569:4: rule__Type_Impl__Group__0
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
    // InternalMyDsl.g:578:1: entryRuleList : ruleList EOF ;
    public final void entryRuleList() throws RecognitionException {
        try {
            // InternalMyDsl.g:579:1: ( ruleList EOF )
            // InternalMyDsl.g:580:1: ruleList EOF
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
    // InternalMyDsl.g:587:1: ruleList : ( ( rule__List__Group__0 ) ) ;
    public final void ruleList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:591:2: ( ( ( rule__List__Group__0 ) ) )
            // InternalMyDsl.g:592:2: ( ( rule__List__Group__0 ) )
            {
            // InternalMyDsl.g:592:2: ( ( rule__List__Group__0 ) )
            // InternalMyDsl.g:593:3: ( rule__List__Group__0 )
            {
             before(grammarAccess.getListAccess().getGroup()); 
            // InternalMyDsl.g:594:3: ( rule__List__Group__0 )
            // InternalMyDsl.g:594:4: rule__List__Group__0
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
    // InternalMyDsl.g:603:1: entryRuleMap : ruleMap EOF ;
    public final void entryRuleMap() throws RecognitionException {
        try {
            // InternalMyDsl.g:604:1: ( ruleMap EOF )
            // InternalMyDsl.g:605:1: ruleMap EOF
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
    // InternalMyDsl.g:612:1: ruleMap : ( ( rule__Map__Group__0 ) ) ;
    public final void ruleMap() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:616:2: ( ( ( rule__Map__Group__0 ) ) )
            // InternalMyDsl.g:617:2: ( ( rule__Map__Group__0 ) )
            {
            // InternalMyDsl.g:617:2: ( ( rule__Map__Group__0 ) )
            // InternalMyDsl.g:618:3: ( rule__Map__Group__0 )
            {
             before(grammarAccess.getMapAccess().getGroup()); 
            // InternalMyDsl.g:619:3: ( rule__Map__Group__0 )
            // InternalMyDsl.g:619:4: rule__Map__Group__0
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
    // InternalMyDsl.g:628:1: entryRuleComplexType : ruleComplexType EOF ;
    public final void entryRuleComplexType() throws RecognitionException {
        try {
            // InternalMyDsl.g:629:1: ( ruleComplexType EOF )
            // InternalMyDsl.g:630:1: ruleComplexType EOF
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
    // InternalMyDsl.g:637:1: ruleComplexType : ( ( rule__ComplexType__Group__0 ) ) ;
    public final void ruleComplexType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:641:2: ( ( ( rule__ComplexType__Group__0 ) ) )
            // InternalMyDsl.g:642:2: ( ( rule__ComplexType__Group__0 ) )
            {
            // InternalMyDsl.g:642:2: ( ( rule__ComplexType__Group__0 ) )
            // InternalMyDsl.g:643:3: ( rule__ComplexType__Group__0 )
            {
             before(grammarAccess.getComplexTypeAccess().getGroup()); 
            // InternalMyDsl.g:644:3: ( rule__ComplexType__Group__0 )
            // InternalMyDsl.g:644:4: rule__ComplexType__Group__0
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
    // InternalMyDsl.g:653:1: entryRuleDate : ruleDate EOF ;
    public final void entryRuleDate() throws RecognitionException {
        try {
            // InternalMyDsl.g:654:1: ( ruleDate EOF )
            // InternalMyDsl.g:655:1: ruleDate EOF
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
    // InternalMyDsl.g:662:1: ruleDate : ( ( rule__Date__Group__0 ) ) ;
    public final void ruleDate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:666:2: ( ( ( rule__Date__Group__0 ) ) )
            // InternalMyDsl.g:667:2: ( ( rule__Date__Group__0 ) )
            {
            // InternalMyDsl.g:667:2: ( ( rule__Date__Group__0 ) )
            // InternalMyDsl.g:668:3: ( rule__Date__Group__0 )
            {
             before(grammarAccess.getDateAccess().getGroup()); 
            // InternalMyDsl.g:669:3: ( rule__Date__Group__0 )
            // InternalMyDsl.g:669:4: rule__Date__Group__0
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
    // InternalMyDsl.g:678:1: entryRuleDouble : ruleDouble EOF ;
    public final void entryRuleDouble() throws RecognitionException {
        try {
            // InternalMyDsl.g:679:1: ( ruleDouble EOF )
            // InternalMyDsl.g:680:1: ruleDouble EOF
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
    // InternalMyDsl.g:687:1: ruleDouble : ( ( rule__Double__Group__0 ) ) ;
    public final void ruleDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:691:2: ( ( ( rule__Double__Group__0 ) ) )
            // InternalMyDsl.g:692:2: ( ( rule__Double__Group__0 ) )
            {
            // InternalMyDsl.g:692:2: ( ( rule__Double__Group__0 ) )
            // InternalMyDsl.g:693:3: ( rule__Double__Group__0 )
            {
             before(grammarAccess.getDoubleAccess().getGroup()); 
            // InternalMyDsl.g:694:3: ( rule__Double__Group__0 )
            // InternalMyDsl.g:694:4: rule__Double__Group__0
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
    // InternalMyDsl.g:703:1: entryRuleString0 : ruleString0 EOF ;
    public final void entryRuleString0() throws RecognitionException {
        try {
            // InternalMyDsl.g:704:1: ( ruleString0 EOF )
            // InternalMyDsl.g:705:1: ruleString0 EOF
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
    // InternalMyDsl.g:712:1: ruleString0 : ( ( rule__String0__Group__0 ) ) ;
    public final void ruleString0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:716:2: ( ( ( rule__String0__Group__0 ) ) )
            // InternalMyDsl.g:717:2: ( ( rule__String0__Group__0 ) )
            {
            // InternalMyDsl.g:717:2: ( ( rule__String0__Group__0 ) )
            // InternalMyDsl.g:718:3: ( rule__String0__Group__0 )
            {
             before(grammarAccess.getString0Access().getGroup()); 
            // InternalMyDsl.g:719:3: ( rule__String0__Group__0 )
            // InternalMyDsl.g:719:4: rule__String0__Group__0
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
    // InternalMyDsl.g:728:1: entryRuleInt0 : ruleInt0 EOF ;
    public final void entryRuleInt0() throws RecognitionException {
        try {
            // InternalMyDsl.g:729:1: ( ruleInt0 EOF )
            // InternalMyDsl.g:730:1: ruleInt0 EOF
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
    // InternalMyDsl.g:737:1: ruleInt0 : ( ( rule__Int0__Group__0 ) ) ;
    public final void ruleInt0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:741:2: ( ( ( rule__Int0__Group__0 ) ) )
            // InternalMyDsl.g:742:2: ( ( rule__Int0__Group__0 ) )
            {
            // InternalMyDsl.g:742:2: ( ( rule__Int0__Group__0 ) )
            // InternalMyDsl.g:743:3: ( rule__Int0__Group__0 )
            {
             before(grammarAccess.getInt0Access().getGroup()); 
            // InternalMyDsl.g:744:3: ( rule__Int0__Group__0 )
            // InternalMyDsl.g:744:4: rule__Int0__Group__0
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
    // InternalMyDsl.g:753:1: entryRuleChar : ruleChar EOF ;
    public final void entryRuleChar() throws RecognitionException {
        try {
            // InternalMyDsl.g:754:1: ( ruleChar EOF )
            // InternalMyDsl.g:755:1: ruleChar EOF
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
    // InternalMyDsl.g:762:1: ruleChar : ( ( rule__Char__Group__0 ) ) ;
    public final void ruleChar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:766:2: ( ( ( rule__Char__Group__0 ) ) )
            // InternalMyDsl.g:767:2: ( ( rule__Char__Group__0 ) )
            {
            // InternalMyDsl.g:767:2: ( ( rule__Char__Group__0 ) )
            // InternalMyDsl.g:768:3: ( rule__Char__Group__0 )
            {
             before(grammarAccess.getCharAccess().getGroup()); 
            // InternalMyDsl.g:769:3: ( rule__Char__Group__0 )
            // InternalMyDsl.g:769:4: rule__Char__Group__0
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
    // InternalMyDsl.g:778:1: entryRuleLong : ruleLong EOF ;
    public final void entryRuleLong() throws RecognitionException {
        try {
            // InternalMyDsl.g:779:1: ( ruleLong EOF )
            // InternalMyDsl.g:780:1: ruleLong EOF
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
    // InternalMyDsl.g:787:1: ruleLong : ( ( rule__Long__Group__0 ) ) ;
    public final void ruleLong() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:791:2: ( ( ( rule__Long__Group__0 ) ) )
            // InternalMyDsl.g:792:2: ( ( rule__Long__Group__0 ) )
            {
            // InternalMyDsl.g:792:2: ( ( rule__Long__Group__0 ) )
            // InternalMyDsl.g:793:3: ( rule__Long__Group__0 )
            {
             before(grammarAccess.getLongAccess().getGroup()); 
            // InternalMyDsl.g:794:3: ( rule__Long__Group__0 )
            // InternalMyDsl.g:794:4: rule__Long__Group__0
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
    // InternalMyDsl.g:803:1: entryRuleFloat : ruleFloat EOF ;
    public final void entryRuleFloat() throws RecognitionException {
        try {
            // InternalMyDsl.g:804:1: ( ruleFloat EOF )
            // InternalMyDsl.g:805:1: ruleFloat EOF
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
    // InternalMyDsl.g:812:1: ruleFloat : ( ( rule__Float__Group__0 ) ) ;
    public final void ruleFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:816:2: ( ( ( rule__Float__Group__0 ) ) )
            // InternalMyDsl.g:817:2: ( ( rule__Float__Group__0 ) )
            {
            // InternalMyDsl.g:817:2: ( ( rule__Float__Group__0 ) )
            // InternalMyDsl.g:818:3: ( rule__Float__Group__0 )
            {
             before(grammarAccess.getFloatAccess().getGroup()); 
            // InternalMyDsl.g:819:3: ( rule__Float__Group__0 )
            // InternalMyDsl.g:819:4: rule__Float__Group__0
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
    // InternalMyDsl.g:828:1: entryRuleBoolean : ruleBoolean EOF ;
    public final void entryRuleBoolean() throws RecognitionException {
        try {
            // InternalMyDsl.g:829:1: ( ruleBoolean EOF )
            // InternalMyDsl.g:830:1: ruleBoolean EOF
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
    // InternalMyDsl.g:837:1: ruleBoolean : ( ( rule__Boolean__Group__0 ) ) ;
    public final void ruleBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:841:2: ( ( ( rule__Boolean__Group__0 ) ) )
            // InternalMyDsl.g:842:2: ( ( rule__Boolean__Group__0 ) )
            {
            // InternalMyDsl.g:842:2: ( ( rule__Boolean__Group__0 ) )
            // InternalMyDsl.g:843:3: ( rule__Boolean__Group__0 )
            {
             before(grammarAccess.getBooleanAccess().getGroup()); 
            // InternalMyDsl.g:844:3: ( rule__Boolean__Group__0 )
            // InternalMyDsl.g:844:4: rule__Boolean__Group__0
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
    // InternalMyDsl.g:853:1: entryRuleVoid : ruleVoid EOF ;
    public final void entryRuleVoid() throws RecognitionException {
        try {
            // InternalMyDsl.g:854:1: ( ruleVoid EOF )
            // InternalMyDsl.g:855:1: ruleVoid EOF
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
    // InternalMyDsl.g:862:1: ruleVoid : ( ( rule__Void__Group__0 ) ) ;
    public final void ruleVoid() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:866:2: ( ( ( rule__Void__Group__0 ) ) )
            // InternalMyDsl.g:867:2: ( ( rule__Void__Group__0 ) )
            {
            // InternalMyDsl.g:867:2: ( ( rule__Void__Group__0 ) )
            // InternalMyDsl.g:868:3: ( rule__Void__Group__0 )
            {
             before(grammarAccess.getVoidAccess().getGroup()); 
            // InternalMyDsl.g:869:3: ( rule__Void__Group__0 )
            // InternalMyDsl.g:869:4: rule__Void__Group__0
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


    // $ANTLR start "rule__AbstractElement__Alternatives"
    // InternalMyDsl.g:877:1: rule__AbstractElement__Alternatives : ( ( ( rule__AbstractElement__Group_0__0 ) ) | ( ruleComponent ) | ( ruleService ) | ( ruleSignature ) | ( ruleAssemblyContext ) | ( ruleSystemEnvironment ) | ( ruleInterface ) | ( ruleAllocationContext ) | ( ruleLink ) | ( ruleContainer ) | ( ruleSystem ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:881:1: ( ( ( rule__AbstractElement__Group_0__0 ) ) | ( ruleComponent ) | ( ruleService ) | ( ruleSignature ) | ( ruleAssemblyContext ) | ( ruleSystemEnvironment ) | ( ruleInterface ) | ( ruleAllocationContext ) | ( ruleLink ) | ( ruleContainer ) | ( ruleSystem ) )
            int alt2=11;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 37:
            case 48:
                {
                alt2=2;
                }
                break;
            case 49:
                {
                alt2=3;
                }
                break;
            case 53:
                {
                alt2=4;
                }
                break;
            case 31:
                {
                alt2=5;
                }
                break;
            case 21:
                {
                alt2=6;
                }
                break;
            case 51:
                {
                alt2=7;
                }
                break;
            case 13:
                {
                alt2=8;
                }
                break;
            case 35:
                {
                alt2=9;
                }
                break;
            case 24:
                {
                alt2=10;
                }
                break;
            case 26:
                {
                alt2=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:882:2: ( ( rule__AbstractElement__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:882:2: ( ( rule__AbstractElement__Group_0__0 ) )
                    // InternalMyDsl.g:883:3: ( rule__AbstractElement__Group_0__0 )
                    {
                     before(grammarAccess.getAbstractElementAccess().getGroup_0()); 
                    // InternalMyDsl.g:884:3: ( rule__AbstractElement__Group_0__0 )
                    // InternalMyDsl.g:884:4: rule__AbstractElement__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AbstractElement__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAbstractElementAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:888:2: ( ruleComponent )
                    {
                    // InternalMyDsl.g:888:2: ( ruleComponent )
                    // InternalMyDsl.g:889:3: ruleComponent
                    {
                     before(grammarAccess.getAbstractElementAccess().getComponentParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleComponent();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getComponentParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:894:2: ( ruleService )
                    {
                    // InternalMyDsl.g:894:2: ( ruleService )
                    // InternalMyDsl.g:895:3: ruleService
                    {
                     before(grammarAccess.getAbstractElementAccess().getServiceParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleService();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getServiceParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:900:2: ( ruleSignature )
                    {
                    // InternalMyDsl.g:900:2: ( ruleSignature )
                    // InternalMyDsl.g:901:3: ruleSignature
                    {
                     before(grammarAccess.getAbstractElementAccess().getSignatureParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleSignature();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getSignatureParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:906:2: ( ruleAssemblyContext )
                    {
                    // InternalMyDsl.g:906:2: ( ruleAssemblyContext )
                    // InternalMyDsl.g:907:3: ruleAssemblyContext
                    {
                     before(grammarAccess.getAbstractElementAccess().getAssemblyContextParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleAssemblyContext();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getAssemblyContextParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:912:2: ( ruleSystemEnvironment )
                    {
                    // InternalMyDsl.g:912:2: ( ruleSystemEnvironment )
                    // InternalMyDsl.g:913:3: ruleSystemEnvironment
                    {
                     before(grammarAccess.getAbstractElementAccess().getSystemEnvironmentParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleSystemEnvironment();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getSystemEnvironmentParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:918:2: ( ruleInterface )
                    {
                    // InternalMyDsl.g:918:2: ( ruleInterface )
                    // InternalMyDsl.g:919:3: ruleInterface
                    {
                     before(grammarAccess.getAbstractElementAccess().getInterfaceParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleInterface();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getInterfaceParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:924:2: ( ruleAllocationContext )
                    {
                    // InternalMyDsl.g:924:2: ( ruleAllocationContext )
                    // InternalMyDsl.g:925:3: ruleAllocationContext
                    {
                     before(grammarAccess.getAbstractElementAccess().getAllocationContextParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleAllocationContext();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getAllocationContextParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:930:2: ( ruleLink )
                    {
                    // InternalMyDsl.g:930:2: ( ruleLink )
                    // InternalMyDsl.g:931:3: ruleLink
                    {
                     before(grammarAccess.getAbstractElementAccess().getLinkParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleLink();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getLinkParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:936:2: ( ruleContainer )
                    {
                    // InternalMyDsl.g:936:2: ( ruleContainer )
                    // InternalMyDsl.g:937:3: ruleContainer
                    {
                     before(grammarAccess.getAbstractElementAccess().getContainerParserRuleCall_9()); 
                    pushFollow(FOLLOW_2);
                    ruleContainer();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getContainerParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalMyDsl.g:942:2: ( ruleSystem )
                    {
                    // InternalMyDsl.g:942:2: ( ruleSystem )
                    // InternalMyDsl.g:943:3: ruleSystem
                    {
                     before(grammarAccess.getAbstractElementAccess().getSystemParserRuleCall_10()); 
                    pushFollow(FOLLOW_2);
                    ruleSystem();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getSystemParserRuleCall_10()); 

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
    // $ANTLR end "rule__AbstractElement__Alternatives"


    // $ANTLR start "rule__Component__Alternatives"
    // InternalMyDsl.g:952:1: rule__Component__Alternatives : ( ( ruleComponent_Impl ) | ( ruleCompositeComponent ) );
    public final void rule__Component__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:956:1: ( ( ruleComponent_Impl ) | ( ruleCompositeComponent ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==37) ) {
                alt3=1;
            }
            else if ( (LA3_0==48) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:957:2: ( ruleComponent_Impl )
                    {
                    // InternalMyDsl.g:957:2: ( ruleComponent_Impl )
                    // InternalMyDsl.g:958:3: ruleComponent_Impl
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
                    // InternalMyDsl.g:963:2: ( ruleCompositeComponent )
                    {
                    // InternalMyDsl.g:963:2: ( ruleCompositeComponent )
                    // InternalMyDsl.g:964:3: ruleCompositeComponent
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
    // InternalMyDsl.g:973:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:977:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:978:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:978:2: ( RULE_STRING )
                    // InternalMyDsl.g:979:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:984:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:984:2: ( RULE_ID )
                    // InternalMyDsl.g:985:3: RULE_ID
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


    // $ANTLR start "rule__Type__Alternatives"
    // InternalMyDsl.g:994:1: rule__Type__Alternatives : ( ( ruleType_Impl ) | ( ruleList ) | ( ruleMap ) | ( ruleComplexType ) | ( ruleDate ) | ( ruleDouble ) | ( ruleString0 ) | ( ruleInt0 ) | ( ruleChar ) | ( ruleLong ) | ( ruleFloat ) | ( ruleBoolean ) | ( ruleVoid ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:998:1: ( ( ruleType_Impl ) | ( ruleList ) | ( ruleMap ) | ( ruleComplexType ) | ( ruleDate ) | ( ruleDouble ) | ( ruleString0 ) | ( ruleInt0 ) | ( ruleChar ) | ( ruleLong ) | ( ruleFloat ) | ( ruleBoolean ) | ( ruleVoid ) )
            int alt5=13;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt5=1;
                }
                break;
            case 60:
                {
                alt5=2;
                }
                break;
            case 61:
                {
                alt5=3;
                }
                break;
            case 62:
                {
                alt5=4;
                }
                break;
            case 63:
                {
                alt5=5;
                }
                break;
            case 64:
                {
                alt5=6;
                }
                break;
            case 65:
                {
                alt5=7;
                }
                break;
            case 66:
                {
                alt5=8;
                }
                break;
            case 67:
                {
                alt5=9;
                }
                break;
            case 68:
                {
                alt5=10;
                }
                break;
            case 69:
                {
                alt5=11;
                }
                break;
            case 70:
                {
                alt5=12;
                }
                break;
            case 71:
                {
                alt5=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:999:2: ( ruleType_Impl )
                    {
                    // InternalMyDsl.g:999:2: ( ruleType_Impl )
                    // InternalMyDsl.g:1000:3: ruleType_Impl
                    {
                     before(grammarAccess.getTypeAccess().getType_ImplParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleType_Impl();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getType_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1005:2: ( ruleList )
                    {
                    // InternalMyDsl.g:1005:2: ( ruleList )
                    // InternalMyDsl.g:1006:3: ruleList
                    {
                     before(grammarAccess.getTypeAccess().getListParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleList();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getListParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1011:2: ( ruleMap )
                    {
                    // InternalMyDsl.g:1011:2: ( ruleMap )
                    // InternalMyDsl.g:1012:3: ruleMap
                    {
                     before(grammarAccess.getTypeAccess().getMapParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleMap();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getMapParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1017:2: ( ruleComplexType )
                    {
                    // InternalMyDsl.g:1017:2: ( ruleComplexType )
                    // InternalMyDsl.g:1018:3: ruleComplexType
                    {
                     before(grammarAccess.getTypeAccess().getComplexTypeParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleComplexType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getComplexTypeParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1023:2: ( ruleDate )
                    {
                    // InternalMyDsl.g:1023:2: ( ruleDate )
                    // InternalMyDsl.g:1024:3: ruleDate
                    {
                     before(grammarAccess.getTypeAccess().getDateParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleDate();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getDateParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:1029:2: ( ruleDouble )
                    {
                    // InternalMyDsl.g:1029:2: ( ruleDouble )
                    // InternalMyDsl.g:1030:3: ruleDouble
                    {
                     before(grammarAccess.getTypeAccess().getDoubleParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleDouble();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getDoubleParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:1035:2: ( ruleString0 )
                    {
                    // InternalMyDsl.g:1035:2: ( ruleString0 )
                    // InternalMyDsl.g:1036:3: ruleString0
                    {
                     before(grammarAccess.getTypeAccess().getString0ParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleString0();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getString0ParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:1041:2: ( ruleInt0 )
                    {
                    // InternalMyDsl.g:1041:2: ( ruleInt0 )
                    // InternalMyDsl.g:1042:3: ruleInt0
                    {
                     before(grammarAccess.getTypeAccess().getInt0ParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleInt0();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getInt0ParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:1047:2: ( ruleChar )
                    {
                    // InternalMyDsl.g:1047:2: ( ruleChar )
                    // InternalMyDsl.g:1048:3: ruleChar
                    {
                     before(grammarAccess.getTypeAccess().getCharParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleChar();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getCharParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:1053:2: ( ruleLong )
                    {
                    // InternalMyDsl.g:1053:2: ( ruleLong )
                    // InternalMyDsl.g:1054:3: ruleLong
                    {
                     before(grammarAccess.getTypeAccess().getLongParserRuleCall_9()); 
                    pushFollow(FOLLOW_2);
                    ruleLong();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getLongParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalMyDsl.g:1059:2: ( ruleFloat )
                    {
                    // InternalMyDsl.g:1059:2: ( ruleFloat )
                    // InternalMyDsl.g:1060:3: ruleFloat
                    {
                     before(grammarAccess.getTypeAccess().getFloatParserRuleCall_10()); 
                    pushFollow(FOLLOW_2);
                    ruleFloat();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getFloatParserRuleCall_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalMyDsl.g:1065:2: ( ruleBoolean )
                    {
                    // InternalMyDsl.g:1065:2: ( ruleBoolean )
                    // InternalMyDsl.g:1066:3: ruleBoolean
                    {
                     before(grammarAccess.getTypeAccess().getBooleanParserRuleCall_11()); 
                    pushFollow(FOLLOW_2);
                    ruleBoolean();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getBooleanParserRuleCall_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalMyDsl.g:1071:2: ( ruleVoid )
                    {
                    // InternalMyDsl.g:1071:2: ( ruleVoid )
                    // InternalMyDsl.g:1072:3: ruleVoid
                    {
                     before(grammarAccess.getTypeAccess().getVoidParserRuleCall_12()); 
                    pushFollow(FOLLOW_2);
                    ruleVoid();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getVoidParserRuleCall_12()); 

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
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__AbstractElement__Group_0__0"
    // InternalMyDsl.g:1081:1: rule__AbstractElement__Group_0__0 : rule__AbstractElement__Group_0__0__Impl rule__AbstractElement__Group_0__1 ;
    public final void rule__AbstractElement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1085:1: ( rule__AbstractElement__Group_0__0__Impl rule__AbstractElement__Group_0__1 )
            // InternalMyDsl.g:1086:2: rule__AbstractElement__Group_0__0__Impl rule__AbstractElement__Group_0__1
            {
            pushFollow(FOLLOW_4);
            rule__AbstractElement__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractElement__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractElement__Group_0__0"


    // $ANTLR start "rule__AbstractElement__Group_0__0__Impl"
    // InternalMyDsl.g:1093:1: rule__AbstractElement__Group_0__0__Impl : ( 'Hello' ) ;
    public final void rule__AbstractElement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1097:1: ( ( 'Hello' ) )
            // InternalMyDsl.g:1098:1: ( 'Hello' )
            {
            // InternalMyDsl.g:1098:1: ( 'Hello' )
            // InternalMyDsl.g:1099:2: 'Hello'
            {
             before(grammarAccess.getAbstractElementAccess().getHelloKeyword_0_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getAbstractElementAccess().getHelloKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractElement__Group_0__0__Impl"


    // $ANTLR start "rule__AbstractElement__Group_0__1"
    // InternalMyDsl.g:1108:1: rule__AbstractElement__Group_0__1 : rule__AbstractElement__Group_0__1__Impl rule__AbstractElement__Group_0__2 ;
    public final void rule__AbstractElement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1112:1: ( rule__AbstractElement__Group_0__1__Impl rule__AbstractElement__Group_0__2 )
            // InternalMyDsl.g:1113:2: rule__AbstractElement__Group_0__1__Impl rule__AbstractElement__Group_0__2
            {
            pushFollow(FOLLOW_5);
            rule__AbstractElement__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractElement__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractElement__Group_0__1"


    // $ANTLR start "rule__AbstractElement__Group_0__1__Impl"
    // InternalMyDsl.g:1120:1: rule__AbstractElement__Group_0__1__Impl : ( ( rule__AbstractElement__NameAssignment_0_1 ) ) ;
    public final void rule__AbstractElement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1124:1: ( ( ( rule__AbstractElement__NameAssignment_0_1 ) ) )
            // InternalMyDsl.g:1125:1: ( ( rule__AbstractElement__NameAssignment_0_1 ) )
            {
            // InternalMyDsl.g:1125:1: ( ( rule__AbstractElement__NameAssignment_0_1 ) )
            // InternalMyDsl.g:1126:2: ( rule__AbstractElement__NameAssignment_0_1 )
            {
             before(grammarAccess.getAbstractElementAccess().getNameAssignment_0_1()); 
            // InternalMyDsl.g:1127:2: ( rule__AbstractElement__NameAssignment_0_1 )
            // InternalMyDsl.g:1127:3: rule__AbstractElement__NameAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__AbstractElement__NameAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getAbstractElementAccess().getNameAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractElement__Group_0__1__Impl"


    // $ANTLR start "rule__AbstractElement__Group_0__2"
    // InternalMyDsl.g:1135:1: rule__AbstractElement__Group_0__2 : rule__AbstractElement__Group_0__2__Impl ;
    public final void rule__AbstractElement__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1139:1: ( rule__AbstractElement__Group_0__2__Impl )
            // InternalMyDsl.g:1140:2: rule__AbstractElement__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AbstractElement__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractElement__Group_0__2"


    // $ANTLR start "rule__AbstractElement__Group_0__2__Impl"
    // InternalMyDsl.g:1146:1: rule__AbstractElement__Group_0__2__Impl : ( '!' ) ;
    public final void rule__AbstractElement__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1150:1: ( ( '!' ) )
            // InternalMyDsl.g:1151:1: ( '!' )
            {
            // InternalMyDsl.g:1151:1: ( '!' )
            // InternalMyDsl.g:1152:2: '!'
            {
             before(grammarAccess.getAbstractElementAccess().getExclamationMarkKeyword_0_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getAbstractElementAccess().getExclamationMarkKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractElement__Group_0__2__Impl"


    // $ANTLR start "rule__AllocationContext__Group__0"
    // InternalMyDsl.g:1162:1: rule__AllocationContext__Group__0 : rule__AllocationContext__Group__0__Impl rule__AllocationContext__Group__1 ;
    public final void rule__AllocationContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1166:1: ( rule__AllocationContext__Group__0__Impl rule__AllocationContext__Group__1 )
            // InternalMyDsl.g:1167:2: rule__AllocationContext__Group__0__Impl rule__AllocationContext__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:1174:1: rule__AllocationContext__Group__0__Impl : ( 'AllocationContext' ) ;
    public final void rule__AllocationContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1178:1: ( ( 'AllocationContext' ) )
            // InternalMyDsl.g:1179:1: ( 'AllocationContext' )
            {
            // InternalMyDsl.g:1179:1: ( 'AllocationContext' )
            // InternalMyDsl.g:1180:2: 'AllocationContext'
            {
             before(grammarAccess.getAllocationContextAccess().getAllocationContextKeyword_0()); 
            match(input,13,FOLLOW_2); 
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
    // InternalMyDsl.g:1189:1: rule__AllocationContext__Group__1 : rule__AllocationContext__Group__1__Impl rule__AllocationContext__Group__2 ;
    public final void rule__AllocationContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1193:1: ( rule__AllocationContext__Group__1__Impl rule__AllocationContext__Group__2 )
            // InternalMyDsl.g:1194:2: rule__AllocationContext__Group__1__Impl rule__AllocationContext__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:1201:1: rule__AllocationContext__Group__1__Impl : ( ( rule__AllocationContext__NameAssignment_1 ) ) ;
    public final void rule__AllocationContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1205:1: ( ( ( rule__AllocationContext__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1206:1: ( ( rule__AllocationContext__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1206:1: ( ( rule__AllocationContext__NameAssignment_1 ) )
            // InternalMyDsl.g:1207:2: ( rule__AllocationContext__NameAssignment_1 )
            {
             before(grammarAccess.getAllocationContextAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1208:2: ( rule__AllocationContext__NameAssignment_1 )
            // InternalMyDsl.g:1208:3: rule__AllocationContext__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AllocationContext__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAllocationContextAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalMyDsl.g:1216:1: rule__AllocationContext__Group__2 : rule__AllocationContext__Group__2__Impl rule__AllocationContext__Group__3 ;
    public final void rule__AllocationContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1220:1: ( rule__AllocationContext__Group__2__Impl rule__AllocationContext__Group__3 )
            // InternalMyDsl.g:1221:2: rule__AllocationContext__Group__2__Impl rule__AllocationContext__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyDsl.g:1228:1: rule__AllocationContext__Group__2__Impl : ( '{' ) ;
    public final void rule__AllocationContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1232:1: ( ( '{' ) )
            // InternalMyDsl.g:1233:1: ( '{' )
            {
            // InternalMyDsl.g:1233:1: ( '{' )
            // InternalMyDsl.g:1234:2: '{'
            {
             before(grammarAccess.getAllocationContextAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getAllocationContextAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // InternalMyDsl.g:1243:1: rule__AllocationContext__Group__3 : rule__AllocationContext__Group__3__Impl rule__AllocationContext__Group__4 ;
    public final void rule__AllocationContext__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1247:1: ( rule__AllocationContext__Group__3__Impl rule__AllocationContext__Group__4 )
            // InternalMyDsl.g:1248:2: rule__AllocationContext__Group__3__Impl rule__AllocationContext__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:1255:1: rule__AllocationContext__Group__3__Impl : ( 'allocatedAssemblyContext' ) ;
    public final void rule__AllocationContext__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1259:1: ( ( 'allocatedAssemblyContext' ) )
            // InternalMyDsl.g:1260:1: ( 'allocatedAssemblyContext' )
            {
            // InternalMyDsl.g:1260:1: ( 'allocatedAssemblyContext' )
            // InternalMyDsl.g:1261:2: 'allocatedAssemblyContext'
            {
             before(grammarAccess.getAllocationContextAccess().getAllocatedAssemblyContextKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getAllocationContextAccess().getAllocatedAssemblyContextKeyword_3()); 

            }


            }

        }
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
    // InternalMyDsl.g:1270:1: rule__AllocationContext__Group__4 : rule__AllocationContext__Group__4__Impl rule__AllocationContext__Group__5 ;
    public final void rule__AllocationContext__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1274:1: ( rule__AllocationContext__Group__4__Impl rule__AllocationContext__Group__5 )
            // InternalMyDsl.g:1275:2: rule__AllocationContext__Group__4__Impl rule__AllocationContext__Group__5
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:1282:1: rule__AllocationContext__Group__4__Impl : ( '(' ) ;
    public final void rule__AllocationContext__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1286:1: ( ( '(' ) )
            // InternalMyDsl.g:1287:1: ( '(' )
            {
            // InternalMyDsl.g:1287:1: ( '(' )
            // InternalMyDsl.g:1288:2: '('
            {
             before(grammarAccess.getAllocationContextAccess().getLeftParenthesisKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getAllocationContextAccess().getLeftParenthesisKeyword_4()); 

            }


            }

        }
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
    // InternalMyDsl.g:1297:1: rule__AllocationContext__Group__5 : rule__AllocationContext__Group__5__Impl rule__AllocationContext__Group__6 ;
    public final void rule__AllocationContext__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1301:1: ( rule__AllocationContext__Group__5__Impl rule__AllocationContext__Group__6 )
            // InternalMyDsl.g:1302:2: rule__AllocationContext__Group__5__Impl rule__AllocationContext__Group__6
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:1309:1: rule__AllocationContext__Group__5__Impl : ( ( rule__AllocationContext__AllocatedAssemblyContextAssignment_5 ) ) ;
    public final void rule__AllocationContext__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1313:1: ( ( ( rule__AllocationContext__AllocatedAssemblyContextAssignment_5 ) ) )
            // InternalMyDsl.g:1314:1: ( ( rule__AllocationContext__AllocatedAssemblyContextAssignment_5 ) )
            {
            // InternalMyDsl.g:1314:1: ( ( rule__AllocationContext__AllocatedAssemblyContextAssignment_5 ) )
            // InternalMyDsl.g:1315:2: ( rule__AllocationContext__AllocatedAssemblyContextAssignment_5 )
            {
             before(grammarAccess.getAllocationContextAccess().getAllocatedAssemblyContextAssignment_5()); 
            // InternalMyDsl.g:1316:2: ( rule__AllocationContext__AllocatedAssemblyContextAssignment_5 )
            // InternalMyDsl.g:1316:3: rule__AllocationContext__AllocatedAssemblyContextAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__AllocationContext__AllocatedAssemblyContextAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getAllocationContextAccess().getAllocatedAssemblyContextAssignment_5()); 

            }


            }

        }
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
    // InternalMyDsl.g:1324:1: rule__AllocationContext__Group__6 : rule__AllocationContext__Group__6__Impl rule__AllocationContext__Group__7 ;
    public final void rule__AllocationContext__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1328:1: ( rule__AllocationContext__Group__6__Impl rule__AllocationContext__Group__7 )
            // InternalMyDsl.g:1329:2: rule__AllocationContext__Group__6__Impl rule__AllocationContext__Group__7
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:1336:1: rule__AllocationContext__Group__6__Impl : ( ( rule__AllocationContext__Group_6__0 )* ) ;
    public final void rule__AllocationContext__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1340:1: ( ( ( rule__AllocationContext__Group_6__0 )* ) )
            // InternalMyDsl.g:1341:1: ( ( rule__AllocationContext__Group_6__0 )* )
            {
            // InternalMyDsl.g:1341:1: ( ( rule__AllocationContext__Group_6__0 )* )
            // InternalMyDsl.g:1342:2: ( rule__AllocationContext__Group_6__0 )*
            {
             before(grammarAccess.getAllocationContextAccess().getGroup_6()); 
            // InternalMyDsl.g:1343:2: ( rule__AllocationContext__Group_6__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:1343:3: rule__AllocationContext__Group_6__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__AllocationContext__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getAllocationContextAccess().getGroup_6()); 

            }


            }

        }
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
    // InternalMyDsl.g:1351:1: rule__AllocationContext__Group__7 : rule__AllocationContext__Group__7__Impl rule__AllocationContext__Group__8 ;
    public final void rule__AllocationContext__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1355:1: ( rule__AllocationContext__Group__7__Impl rule__AllocationContext__Group__8 )
            // InternalMyDsl.g:1356:2: rule__AllocationContext__Group__7__Impl rule__AllocationContext__Group__8
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:1363:1: rule__AllocationContext__Group__7__Impl : ( ')' ) ;
    public final void rule__AllocationContext__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1367:1: ( ( ')' ) )
            // InternalMyDsl.g:1368:1: ( ')' )
            {
            // InternalMyDsl.g:1368:1: ( ')' )
            // InternalMyDsl.g:1369:2: ')'
            {
             before(grammarAccess.getAllocationContextAccess().getRightParenthesisKeyword_7()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAllocationContextAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
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
    // InternalMyDsl.g:1378:1: rule__AllocationContext__Group__8 : rule__AllocationContext__Group__8__Impl rule__AllocationContext__Group__9 ;
    public final void rule__AllocationContext__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1382:1: ( rule__AllocationContext__Group__8__Impl rule__AllocationContext__Group__9 )
            // InternalMyDsl.g:1383:2: rule__AllocationContext__Group__8__Impl rule__AllocationContext__Group__9
            {
            pushFollow(FOLLOW_12);
            rule__AllocationContext__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllocationContext__Group__9();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:1390:1: rule__AllocationContext__Group__8__Impl : ( ( rule__AllocationContext__Group_8__0 )? ) ;
    public final void rule__AllocationContext__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1394:1: ( ( ( rule__AllocationContext__Group_8__0 )? ) )
            // InternalMyDsl.g:1395:1: ( ( rule__AllocationContext__Group_8__0 )? )
            {
            // InternalMyDsl.g:1395:1: ( ( rule__AllocationContext__Group_8__0 )? )
            // InternalMyDsl.g:1396:2: ( rule__AllocationContext__Group_8__0 )?
            {
             before(grammarAccess.getAllocationContextAccess().getGroup_8()); 
            // InternalMyDsl.g:1397:2: ( rule__AllocationContext__Group_8__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:1397:3: rule__AllocationContext__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AllocationContext__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAllocationContextAccess().getGroup_8()); 

            }


            }

        }
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


    // $ANTLR start "rule__AllocationContext__Group__9"
    // InternalMyDsl.g:1405:1: rule__AllocationContext__Group__9 : rule__AllocationContext__Group__9__Impl ;
    public final void rule__AllocationContext__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1409:1: ( rule__AllocationContext__Group__9__Impl )
            // InternalMyDsl.g:1410:2: rule__AllocationContext__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AllocationContext__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group__9"


    // $ANTLR start "rule__AllocationContext__Group__9__Impl"
    // InternalMyDsl.g:1416:1: rule__AllocationContext__Group__9__Impl : ( '}' ) ;
    public final void rule__AllocationContext__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1420:1: ( ( '}' ) )
            // InternalMyDsl.g:1421:1: ( '}' )
            {
            // InternalMyDsl.g:1421:1: ( '}' )
            // InternalMyDsl.g:1422:2: '}'
            {
             before(grammarAccess.getAllocationContextAccess().getRightCurlyBracketKeyword_9()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getAllocationContextAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group__9__Impl"


    // $ANTLR start "rule__AllocationContext__Group_6__0"
    // InternalMyDsl.g:1432:1: rule__AllocationContext__Group_6__0 : rule__AllocationContext__Group_6__0__Impl rule__AllocationContext__Group_6__1 ;
    public final void rule__AllocationContext__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1436:1: ( rule__AllocationContext__Group_6__0__Impl rule__AllocationContext__Group_6__1 )
            // InternalMyDsl.g:1437:2: rule__AllocationContext__Group_6__0__Impl rule__AllocationContext__Group_6__1
            {
            pushFollow(FOLLOW_9);
            rule__AllocationContext__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllocationContext__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group_6__0"


    // $ANTLR start "rule__AllocationContext__Group_6__0__Impl"
    // InternalMyDsl.g:1444:1: rule__AllocationContext__Group_6__0__Impl : ( ',' ) ;
    public final void rule__AllocationContext__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1448:1: ( ( ',' ) )
            // InternalMyDsl.g:1449:1: ( ',' )
            {
            // InternalMyDsl.g:1449:1: ( ',' )
            // InternalMyDsl.g:1450:2: ','
            {
             before(grammarAccess.getAllocationContextAccess().getCommaKeyword_6_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getAllocationContextAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group_6__0__Impl"


    // $ANTLR start "rule__AllocationContext__Group_6__1"
    // InternalMyDsl.g:1459:1: rule__AllocationContext__Group_6__1 : rule__AllocationContext__Group_6__1__Impl ;
    public final void rule__AllocationContext__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1463:1: ( rule__AllocationContext__Group_6__1__Impl )
            // InternalMyDsl.g:1464:2: rule__AllocationContext__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AllocationContext__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group_6__1"


    // $ANTLR start "rule__AllocationContext__Group_6__1__Impl"
    // InternalMyDsl.g:1470:1: rule__AllocationContext__Group_6__1__Impl : ( ( rule__AllocationContext__AllocatedAssemblyContextAssignment_6_1 ) ) ;
    public final void rule__AllocationContext__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1474:1: ( ( ( rule__AllocationContext__AllocatedAssemblyContextAssignment_6_1 ) ) )
            // InternalMyDsl.g:1475:1: ( ( rule__AllocationContext__AllocatedAssemblyContextAssignment_6_1 ) )
            {
            // InternalMyDsl.g:1475:1: ( ( rule__AllocationContext__AllocatedAssemblyContextAssignment_6_1 ) )
            // InternalMyDsl.g:1476:2: ( rule__AllocationContext__AllocatedAssemblyContextAssignment_6_1 )
            {
             before(grammarAccess.getAllocationContextAccess().getAllocatedAssemblyContextAssignment_6_1()); 
            // InternalMyDsl.g:1477:2: ( rule__AllocationContext__AllocatedAssemblyContextAssignment_6_1 )
            // InternalMyDsl.g:1477:3: rule__AllocationContext__AllocatedAssemblyContextAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__AllocationContext__AllocatedAssemblyContextAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getAllocationContextAccess().getAllocatedAssemblyContextAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group_6__1__Impl"


    // $ANTLR start "rule__AllocationContext__Group_8__0"
    // InternalMyDsl.g:1486:1: rule__AllocationContext__Group_8__0 : rule__AllocationContext__Group_8__0__Impl rule__AllocationContext__Group_8__1 ;
    public final void rule__AllocationContext__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1490:1: ( rule__AllocationContext__Group_8__0__Impl rule__AllocationContext__Group_8__1 )
            // InternalMyDsl.g:1491:2: rule__AllocationContext__Group_8__0__Impl rule__AllocationContext__Group_8__1
            {
            pushFollow(FOLLOW_8);
            rule__AllocationContext__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllocationContext__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group_8__0"


    // $ANTLR start "rule__AllocationContext__Group_8__0__Impl"
    // InternalMyDsl.g:1498:1: rule__AllocationContext__Group_8__0__Impl : ( 'targetContainer' ) ;
    public final void rule__AllocationContext__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1502:1: ( ( 'targetContainer' ) )
            // InternalMyDsl.g:1503:1: ( 'targetContainer' )
            {
            // InternalMyDsl.g:1503:1: ( 'targetContainer' )
            // InternalMyDsl.g:1504:2: 'targetContainer'
            {
             before(grammarAccess.getAllocationContextAccess().getTargetContainerKeyword_8_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAllocationContextAccess().getTargetContainerKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group_8__0__Impl"


    // $ANTLR start "rule__AllocationContext__Group_8__1"
    // InternalMyDsl.g:1513:1: rule__AllocationContext__Group_8__1 : rule__AllocationContext__Group_8__1__Impl rule__AllocationContext__Group_8__2 ;
    public final void rule__AllocationContext__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1517:1: ( rule__AllocationContext__Group_8__1__Impl rule__AllocationContext__Group_8__2 )
            // InternalMyDsl.g:1518:2: rule__AllocationContext__Group_8__1__Impl rule__AllocationContext__Group_8__2
            {
            pushFollow(FOLLOW_9);
            rule__AllocationContext__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllocationContext__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group_8__1"


    // $ANTLR start "rule__AllocationContext__Group_8__1__Impl"
    // InternalMyDsl.g:1525:1: rule__AllocationContext__Group_8__1__Impl : ( '(' ) ;
    public final void rule__AllocationContext__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1529:1: ( ( '(' ) )
            // InternalMyDsl.g:1530:1: ( '(' )
            {
            // InternalMyDsl.g:1530:1: ( '(' )
            // InternalMyDsl.g:1531:2: '('
            {
             before(grammarAccess.getAllocationContextAccess().getLeftParenthesisKeyword_8_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getAllocationContextAccess().getLeftParenthesisKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group_8__1__Impl"


    // $ANTLR start "rule__AllocationContext__Group_8__2"
    // InternalMyDsl.g:1540:1: rule__AllocationContext__Group_8__2 : rule__AllocationContext__Group_8__2__Impl rule__AllocationContext__Group_8__3 ;
    public final void rule__AllocationContext__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1544:1: ( rule__AllocationContext__Group_8__2__Impl rule__AllocationContext__Group_8__3 )
            // InternalMyDsl.g:1545:2: rule__AllocationContext__Group_8__2__Impl rule__AllocationContext__Group_8__3
            {
            pushFollow(FOLLOW_10);
            rule__AllocationContext__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllocationContext__Group_8__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group_8__2"


    // $ANTLR start "rule__AllocationContext__Group_8__2__Impl"
    // InternalMyDsl.g:1552:1: rule__AllocationContext__Group_8__2__Impl : ( ( rule__AllocationContext__TargetContainerAssignment_8_2 ) ) ;
    public final void rule__AllocationContext__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1556:1: ( ( ( rule__AllocationContext__TargetContainerAssignment_8_2 ) ) )
            // InternalMyDsl.g:1557:1: ( ( rule__AllocationContext__TargetContainerAssignment_8_2 ) )
            {
            // InternalMyDsl.g:1557:1: ( ( rule__AllocationContext__TargetContainerAssignment_8_2 ) )
            // InternalMyDsl.g:1558:2: ( rule__AllocationContext__TargetContainerAssignment_8_2 )
            {
             before(grammarAccess.getAllocationContextAccess().getTargetContainerAssignment_8_2()); 
            // InternalMyDsl.g:1559:2: ( rule__AllocationContext__TargetContainerAssignment_8_2 )
            // InternalMyDsl.g:1559:3: rule__AllocationContext__TargetContainerAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__AllocationContext__TargetContainerAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getAllocationContextAccess().getTargetContainerAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group_8__2__Impl"


    // $ANTLR start "rule__AllocationContext__Group_8__3"
    // InternalMyDsl.g:1567:1: rule__AllocationContext__Group_8__3 : rule__AllocationContext__Group_8__3__Impl rule__AllocationContext__Group_8__4 ;
    public final void rule__AllocationContext__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1571:1: ( rule__AllocationContext__Group_8__3__Impl rule__AllocationContext__Group_8__4 )
            // InternalMyDsl.g:1572:2: rule__AllocationContext__Group_8__3__Impl rule__AllocationContext__Group_8__4
            {
            pushFollow(FOLLOW_10);
            rule__AllocationContext__Group_8__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllocationContext__Group_8__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group_8__3"


    // $ANTLR start "rule__AllocationContext__Group_8__3__Impl"
    // InternalMyDsl.g:1579:1: rule__AllocationContext__Group_8__3__Impl : ( ( rule__AllocationContext__Group_8_3__0 )* ) ;
    public final void rule__AllocationContext__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1583:1: ( ( ( rule__AllocationContext__Group_8_3__0 )* ) )
            // InternalMyDsl.g:1584:1: ( ( rule__AllocationContext__Group_8_3__0 )* )
            {
            // InternalMyDsl.g:1584:1: ( ( rule__AllocationContext__Group_8_3__0 )* )
            // InternalMyDsl.g:1585:2: ( rule__AllocationContext__Group_8_3__0 )*
            {
             before(grammarAccess.getAllocationContextAccess().getGroup_8_3()); 
            // InternalMyDsl.g:1586:2: ( rule__AllocationContext__Group_8_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:1586:3: rule__AllocationContext__Group_8_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__AllocationContext__Group_8_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getAllocationContextAccess().getGroup_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group_8__3__Impl"


    // $ANTLR start "rule__AllocationContext__Group_8__4"
    // InternalMyDsl.g:1594:1: rule__AllocationContext__Group_8__4 : rule__AllocationContext__Group_8__4__Impl ;
    public final void rule__AllocationContext__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1598:1: ( rule__AllocationContext__Group_8__4__Impl )
            // InternalMyDsl.g:1599:2: rule__AllocationContext__Group_8__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AllocationContext__Group_8__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group_8__4"


    // $ANTLR start "rule__AllocationContext__Group_8__4__Impl"
    // InternalMyDsl.g:1605:1: rule__AllocationContext__Group_8__4__Impl : ( ')' ) ;
    public final void rule__AllocationContext__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1609:1: ( ( ')' ) )
            // InternalMyDsl.g:1610:1: ( ')' )
            {
            // InternalMyDsl.g:1610:1: ( ')' )
            // InternalMyDsl.g:1611:2: ')'
            {
             before(grammarAccess.getAllocationContextAccess().getRightParenthesisKeyword_8_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAllocationContextAccess().getRightParenthesisKeyword_8_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group_8__4__Impl"


    // $ANTLR start "rule__AllocationContext__Group_8_3__0"
    // InternalMyDsl.g:1621:1: rule__AllocationContext__Group_8_3__0 : rule__AllocationContext__Group_8_3__0__Impl rule__AllocationContext__Group_8_3__1 ;
    public final void rule__AllocationContext__Group_8_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1625:1: ( rule__AllocationContext__Group_8_3__0__Impl rule__AllocationContext__Group_8_3__1 )
            // InternalMyDsl.g:1626:2: rule__AllocationContext__Group_8_3__0__Impl rule__AllocationContext__Group_8_3__1
            {
            pushFollow(FOLLOW_9);
            rule__AllocationContext__Group_8_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllocationContext__Group_8_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group_8_3__0"


    // $ANTLR start "rule__AllocationContext__Group_8_3__0__Impl"
    // InternalMyDsl.g:1633:1: rule__AllocationContext__Group_8_3__0__Impl : ( ',' ) ;
    public final void rule__AllocationContext__Group_8_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1637:1: ( ( ',' ) )
            // InternalMyDsl.g:1638:1: ( ',' )
            {
            // InternalMyDsl.g:1638:1: ( ',' )
            // InternalMyDsl.g:1639:2: ','
            {
             before(grammarAccess.getAllocationContextAccess().getCommaKeyword_8_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getAllocationContextAccess().getCommaKeyword_8_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group_8_3__0__Impl"


    // $ANTLR start "rule__AllocationContext__Group_8_3__1"
    // InternalMyDsl.g:1648:1: rule__AllocationContext__Group_8_3__1 : rule__AllocationContext__Group_8_3__1__Impl ;
    public final void rule__AllocationContext__Group_8_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1652:1: ( rule__AllocationContext__Group_8_3__1__Impl )
            // InternalMyDsl.g:1653:2: rule__AllocationContext__Group_8_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AllocationContext__Group_8_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group_8_3__1"


    // $ANTLR start "rule__AllocationContext__Group_8_3__1__Impl"
    // InternalMyDsl.g:1659:1: rule__AllocationContext__Group_8_3__1__Impl : ( ( rule__AllocationContext__TargetContainerAssignment_8_3_1 ) ) ;
    public final void rule__AllocationContext__Group_8_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1663:1: ( ( ( rule__AllocationContext__TargetContainerAssignment_8_3_1 ) ) )
            // InternalMyDsl.g:1664:1: ( ( rule__AllocationContext__TargetContainerAssignment_8_3_1 ) )
            {
            // InternalMyDsl.g:1664:1: ( ( rule__AllocationContext__TargetContainerAssignment_8_3_1 ) )
            // InternalMyDsl.g:1665:2: ( rule__AllocationContext__TargetContainerAssignment_8_3_1 )
            {
             before(grammarAccess.getAllocationContextAccess().getTargetContainerAssignment_8_3_1()); 
            // InternalMyDsl.g:1666:2: ( rule__AllocationContext__TargetContainerAssignment_8_3_1 )
            // InternalMyDsl.g:1666:3: rule__AllocationContext__TargetContainerAssignment_8_3_1
            {
            pushFollow(FOLLOW_2);
            rule__AllocationContext__TargetContainerAssignment_8_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAllocationContextAccess().getTargetContainerAssignment_8_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__Group_8_3__1__Impl"


    // $ANTLR start "rule__SystemEnvironment__Group__0"
    // InternalMyDsl.g:1675:1: rule__SystemEnvironment__Group__0 : rule__SystemEnvironment__Group__0__Impl rule__SystemEnvironment__Group__1 ;
    public final void rule__SystemEnvironment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1679:1: ( rule__SystemEnvironment__Group__0__Impl rule__SystemEnvironment__Group__1 )
            // InternalMyDsl.g:1680:2: rule__SystemEnvironment__Group__0__Impl rule__SystemEnvironment__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__SystemEnvironment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemEnvironment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEnvironment__Group__0"


    // $ANTLR start "rule__SystemEnvironment__Group__0__Impl"
    // InternalMyDsl.g:1687:1: rule__SystemEnvironment__Group__0__Impl : ( 'SystemEnvironment' ) ;
    public final void rule__SystemEnvironment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1691:1: ( ( 'SystemEnvironment' ) )
            // InternalMyDsl.g:1692:1: ( 'SystemEnvironment' )
            {
            // InternalMyDsl.g:1692:1: ( 'SystemEnvironment' )
            // InternalMyDsl.g:1693:2: 'SystemEnvironment'
            {
             before(grammarAccess.getSystemEnvironmentAccess().getSystemEnvironmentKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSystemEnvironmentAccess().getSystemEnvironmentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEnvironment__Group__0__Impl"


    // $ANTLR start "rule__SystemEnvironment__Group__1"
    // InternalMyDsl.g:1702:1: rule__SystemEnvironment__Group__1 : rule__SystemEnvironment__Group__1__Impl rule__SystemEnvironment__Group__2 ;
    public final void rule__SystemEnvironment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1706:1: ( rule__SystemEnvironment__Group__1__Impl rule__SystemEnvironment__Group__2 )
            // InternalMyDsl.g:1707:2: rule__SystemEnvironment__Group__1__Impl rule__SystemEnvironment__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__SystemEnvironment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemEnvironment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEnvironment__Group__1"


    // $ANTLR start "rule__SystemEnvironment__Group__1__Impl"
    // InternalMyDsl.g:1714:1: rule__SystemEnvironment__Group__1__Impl : ( ( rule__SystemEnvironment__NameAssignment_1 ) ) ;
    public final void rule__SystemEnvironment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1718:1: ( ( ( rule__SystemEnvironment__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1719:1: ( ( rule__SystemEnvironment__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1719:1: ( ( rule__SystemEnvironment__NameAssignment_1 ) )
            // InternalMyDsl.g:1720:2: ( rule__SystemEnvironment__NameAssignment_1 )
            {
             before(grammarAccess.getSystemEnvironmentAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1721:2: ( rule__SystemEnvironment__NameAssignment_1 )
            // InternalMyDsl.g:1721:3: rule__SystemEnvironment__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SystemEnvironment__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSystemEnvironmentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEnvironment__Group__1__Impl"


    // $ANTLR start "rule__SystemEnvironment__Group__2"
    // InternalMyDsl.g:1729:1: rule__SystemEnvironment__Group__2 : rule__SystemEnvironment__Group__2__Impl rule__SystemEnvironment__Group__3 ;
    public final void rule__SystemEnvironment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1733:1: ( rule__SystemEnvironment__Group__2__Impl rule__SystemEnvironment__Group__3 )
            // InternalMyDsl.g:1734:2: rule__SystemEnvironment__Group__2__Impl rule__SystemEnvironment__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__SystemEnvironment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemEnvironment__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEnvironment__Group__2"


    // $ANTLR start "rule__SystemEnvironment__Group__2__Impl"
    // InternalMyDsl.g:1741:1: rule__SystemEnvironment__Group__2__Impl : ( '{' ) ;
    public final void rule__SystemEnvironment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1745:1: ( ( '{' ) )
            // InternalMyDsl.g:1746:1: ( '{' )
            {
            // InternalMyDsl.g:1746:1: ( '{' )
            // InternalMyDsl.g:1747:2: '{'
            {
             before(grammarAccess.getSystemEnvironmentAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSystemEnvironmentAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEnvironment__Group__2__Impl"


    // $ANTLR start "rule__SystemEnvironment__Group__3"
    // InternalMyDsl.g:1756:1: rule__SystemEnvironment__Group__3 : rule__SystemEnvironment__Group__3__Impl rule__SystemEnvironment__Group__4 ;
    public final void rule__SystemEnvironment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1760:1: ( rule__SystemEnvironment__Group__3__Impl rule__SystemEnvironment__Group__4 )
            // InternalMyDsl.g:1761:2: rule__SystemEnvironment__Group__3__Impl rule__SystemEnvironment__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__SystemEnvironment__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemEnvironment__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEnvironment__Group__3"


    // $ANTLR start "rule__SystemEnvironment__Group__3__Impl"
    // InternalMyDsl.g:1768:1: rule__SystemEnvironment__Group__3__Impl : ( 'container' ) ;
    public final void rule__SystemEnvironment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1772:1: ( ( 'container' ) )
            // InternalMyDsl.g:1773:1: ( 'container' )
            {
            // InternalMyDsl.g:1773:1: ( 'container' )
            // InternalMyDsl.g:1774:2: 'container'
            {
             before(grammarAccess.getSystemEnvironmentAccess().getContainerKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSystemEnvironmentAccess().getContainerKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEnvironment__Group__3__Impl"


    // $ANTLR start "rule__SystemEnvironment__Group__4"
    // InternalMyDsl.g:1783:1: rule__SystemEnvironment__Group__4 : rule__SystemEnvironment__Group__4__Impl rule__SystemEnvironment__Group__5 ;
    public final void rule__SystemEnvironment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1787:1: ( rule__SystemEnvironment__Group__4__Impl rule__SystemEnvironment__Group__5 )
            // InternalMyDsl.g:1788:2: rule__SystemEnvironment__Group__4__Impl rule__SystemEnvironment__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__SystemEnvironment__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemEnvironment__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEnvironment__Group__4"


    // $ANTLR start "rule__SystemEnvironment__Group__4__Impl"
    // InternalMyDsl.g:1795:1: rule__SystemEnvironment__Group__4__Impl : ( '(' ) ;
    public final void rule__SystemEnvironment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1799:1: ( ( '(' ) )
            // InternalMyDsl.g:1800:1: ( '(' )
            {
            // InternalMyDsl.g:1800:1: ( '(' )
            // InternalMyDsl.g:1801:2: '('
            {
             before(grammarAccess.getSystemEnvironmentAccess().getLeftParenthesisKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSystemEnvironmentAccess().getLeftParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEnvironment__Group__4__Impl"


    // $ANTLR start "rule__SystemEnvironment__Group__5"
    // InternalMyDsl.g:1810:1: rule__SystemEnvironment__Group__5 : rule__SystemEnvironment__Group__5__Impl rule__SystemEnvironment__Group__6 ;
    public final void rule__SystemEnvironment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1814:1: ( rule__SystemEnvironment__Group__5__Impl rule__SystemEnvironment__Group__6 )
            // InternalMyDsl.g:1815:2: rule__SystemEnvironment__Group__5__Impl rule__SystemEnvironment__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__SystemEnvironment__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemEnvironment__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEnvironment__Group__5"


    // $ANTLR start "rule__SystemEnvironment__Group__5__Impl"
    // InternalMyDsl.g:1822:1: rule__SystemEnvironment__Group__5__Impl : ( ( rule__SystemEnvironment__ContainerAssignment_5 ) ) ;
    public final void rule__SystemEnvironment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1826:1: ( ( ( rule__SystemEnvironment__ContainerAssignment_5 ) ) )
            // InternalMyDsl.g:1827:1: ( ( rule__SystemEnvironment__ContainerAssignment_5 ) )
            {
            // InternalMyDsl.g:1827:1: ( ( rule__SystemEnvironment__ContainerAssignment_5 ) )
            // InternalMyDsl.g:1828:2: ( rule__SystemEnvironment__ContainerAssignment_5 )
            {
             before(grammarAccess.getSystemEnvironmentAccess().getContainerAssignment_5()); 
            // InternalMyDsl.g:1829:2: ( rule__SystemEnvironment__ContainerAssignment_5 )
            // InternalMyDsl.g:1829:3: rule__SystemEnvironment__ContainerAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__SystemEnvironment__ContainerAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSystemEnvironmentAccess().getContainerAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEnvironment__Group__5__Impl"


    // $ANTLR start "rule__SystemEnvironment__Group__6"
    // InternalMyDsl.g:1837:1: rule__SystemEnvironment__Group__6 : rule__SystemEnvironment__Group__6__Impl rule__SystemEnvironment__Group__7 ;
    public final void rule__SystemEnvironment__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1841:1: ( rule__SystemEnvironment__Group__6__Impl rule__SystemEnvironment__Group__7 )
            // InternalMyDsl.g:1842:2: rule__SystemEnvironment__Group__6__Impl rule__SystemEnvironment__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__SystemEnvironment__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemEnvironment__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEnvironment__Group__6"


    // $ANTLR start "rule__SystemEnvironment__Group__6__Impl"
    // InternalMyDsl.g:1849:1: rule__SystemEnvironment__Group__6__Impl : ( ( rule__SystemEnvironment__Group_6__0 )* ) ;
    public final void rule__SystemEnvironment__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1853:1: ( ( ( rule__SystemEnvironment__Group_6__0 )* ) )
            // InternalMyDsl.g:1854:1: ( ( rule__SystemEnvironment__Group_6__0 )* )
            {
            // InternalMyDsl.g:1854:1: ( ( rule__SystemEnvironment__Group_6__0 )* )
            // InternalMyDsl.g:1855:2: ( rule__SystemEnvironment__Group_6__0 )*
            {
             before(grammarAccess.getSystemEnvironmentAccess().getGroup_6()); 
            // InternalMyDsl.g:1856:2: ( rule__SystemEnvironment__Group_6__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==19) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:1856:3: rule__SystemEnvironment__Group_6__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__SystemEnvironment__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getSystemEnvironmentAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEnvironment__Group__6__Impl"


    // $ANTLR start "rule__SystemEnvironment__Group__7"
    // InternalMyDsl.g:1864:1: rule__SystemEnvironment__Group__7 : rule__SystemEnvironment__Group__7__Impl rule__SystemEnvironment__Group__8 ;
    public final void rule__SystemEnvironment__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1868:1: ( rule__SystemEnvironment__Group__7__Impl rule__SystemEnvironment__Group__8 )
            // InternalMyDsl.g:1869:2: rule__SystemEnvironment__Group__7__Impl rule__SystemEnvironment__Group__8
            {
            pushFollow(FOLLOW_14);
            rule__SystemEnvironment__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemEnvironment__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEnvironment__Group__7"


    // $ANTLR start "rule__SystemEnvironment__Group__7__Impl"
    // InternalMyDsl.g:1876:1: rule__SystemEnvironment__Group__7__Impl : ( ')' ) ;
    public final void rule__SystemEnvironment__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1880:1: ( ( ')' ) )
            // InternalMyDsl.g:1881:1: ( ')' )
            {
            // InternalMyDsl.g:1881:1: ( ')' )
            // InternalMyDsl.g:1882:2: ')'
            {
             before(grammarAccess.getSystemEnvironmentAccess().getRightParenthesisKeyword_7()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSystemEnvironmentAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEnvironment__Group__7__Impl"


    // $ANTLR start "rule__SystemEnvironment__Group__8"
    // InternalMyDsl.g:1891:1: rule__SystemEnvironment__Group__8 : rule__SystemEnvironment__Group__8__Impl rule__SystemEnvironment__Group__9 ;
    public final void rule__SystemEnvironment__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1895:1: ( rule__SystemEnvironment__Group__8__Impl rule__SystemEnvironment__Group__9 )
            // InternalMyDsl.g:1896:2: rule__SystemEnvironment__Group__8__Impl rule__SystemEnvironment__Group__9
            {
            pushFollow(FOLLOW_14);
            rule__SystemEnvironment__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemEnvironment__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEnvironment__Group__8"


    // $ANTLR start "rule__SystemEnvironment__Group__8__Impl"
    // InternalMyDsl.g:1903:1: rule__SystemEnvironment__Group__8__Impl : ( ( rule__SystemEnvironment__Group_8__0 )? ) ;
    public final void rule__SystemEnvironment__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1907:1: ( ( ( rule__SystemEnvironment__Group_8__0 )? ) )
            // InternalMyDsl.g:1908:1: ( ( rule__SystemEnvironment__Group_8__0 )? )
            {
            // InternalMyDsl.g:1908:1: ( ( rule__SystemEnvironment__Group_8__0 )? )
            // InternalMyDsl.g:1909:2: ( rule__SystemEnvironment__Group_8__0 )?
            {
             before(grammarAccess.getSystemEnvironmentAccess().getGroup_8()); 
            // InternalMyDsl.g:1910:2: ( rule__SystemEnvironment__Group_8__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:1910:3: rule__SystemEnvironment__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SystemEnvironment__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSystemEnvironmentAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEnvironment__Group__8__Impl"


    // $ANTLR start "rule__SystemEnvironment__Group__9"
    // InternalMyDsl.g:1918:1: rule__SystemEnvironment__Group__9 : rule__SystemEnvironment__Group__9__Impl ;
    public final void rule__SystemEnvironment__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1922:1: ( rule__SystemEnvironment__Group__9__Impl )
            // InternalMyDsl.g:1923:2: rule__SystemEnvironment__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SystemEnvironment__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEnvironment__Group__9"


    // $ANTLR start "rule__SystemEnvironment__Group__9__Impl"
    // InternalMyDsl.g:1929:1: rule__SystemEnvironment__Group__9__Impl : ( '}' ) ;
    public final void rule__SystemEnvironment__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1933:1: ( ( '}' ) )
            // InternalMyDsl.g:1934:1: ( '}' )
            {
            // InternalMyDsl.g:1934:1: ( '}' )
            // InternalMyDsl.g:1935:2: '}'
            {
             before(grammarAccess.getSystemEnvironmentAccess().getRightCurlyBracketKeyword_9()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSystemEnvironmentAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEnvironment__Group__9__Impl"


    // $ANTLR start "rule__SystemEnvironment__Group_6__0"
    // InternalMyDsl.g:1945:1: rule__SystemEnvironment__Group_6__0 : rule__SystemEnvironment__Group_6__0__Impl rule__SystemEnvironment__Group_6__1 ;
    public final void rule__SystemEnvironment__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1949:1: ( rule__SystemEnvironment__Group_6__0__Impl rule__SystemEnvironment__Group_6__1 )
            // InternalMyDsl.g:1950:2: rule__SystemEnvironment__Group_6__0__Impl rule__SystemEnvironment__Group_6__1
            {
            pushFollow(FOLLOW_9);
            rule__SystemEnvironment__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemEnvironment__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEnvironment__Group_6__0"


    // $ANTLR start "rule__SystemEnvironment__Group_6__0__Impl"
    // InternalMyDsl.g:1957:1: rule__SystemEnvironment__Group_6__0__Impl : ( ',' ) ;
    public final void rule__SystemEnvironment__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1961:1: ( ( ',' ) )
            // InternalMyDsl.g:1962:1: ( ',' )
            {
            // InternalMyDsl.g:1962:1: ( ',' )
            // InternalMyDsl.g:1963:2: ','
            {
             before(grammarAccess.getSystemEnvironmentAccess().getCommaKeyword_6_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSystemEnvironmentAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEnvironment__Group_6__0__Impl"


    // $ANTLR start "rule__SystemEnvironment__Group_6__1"
    // InternalMyDsl.g:1972:1: rule__SystemEnvironment__Group_6__1 : rule__SystemEnvironment__Group_6__1__Impl ;
    public final void rule__SystemEnvironment__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1976:1: ( rule__SystemEnvironment__Group_6__1__Impl )
            // InternalMyDsl.g:1977:2: rule__SystemEnvironment__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SystemEnvironment__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEnvironment__Group_6__1"


    // $ANTLR start "rule__SystemEnvironment__Group_6__1__Impl"
    // InternalMyDsl.g:1983:1: rule__SystemEnvironment__Group_6__1__Impl : ( ( rule__SystemEnvironment__ContainerAssignment_6_1 ) ) ;
    public final void rule__SystemEnvironment__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1987:1: ( ( ( rule__SystemEnvironment__ContainerAssignment_6_1 ) ) )
            // InternalMyDsl.g:1988:1: ( ( rule__SystemEnvironment__ContainerAssignment_6_1 ) )
            {
            // InternalMyDsl.g:1988:1: ( ( rule__SystemEnvironment__ContainerAssignment_6_1 ) )
            // InternalMyDsl.g:1989:2: ( rule__SystemEnvironment__ContainerAssignment_6_1 )
            {
             before(grammarAccess.getSystemEnvironmentAccess().getContainerAssignment_6_1()); 
            // InternalMyDsl.g:1990:2: ( rule__SystemEnvironment__ContainerAssignment_6_1 )
            // InternalMyDsl.g:1990:3: rule__SystemEnvironment__ContainerAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__SystemEnvironment__ContainerAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getSystemEnvironmentAccess().getContainerAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEnvironment__Group_6__1__Impl"


    // $ANTLR start "rule__SystemEnvironment__Group_8__0"
    // InternalMyDsl.g:1999:1: rule__SystemEnvironment__Group_8__0 : rule__SystemEnvironment__Group_8__0__Impl rule__SystemEnvironment__Group_8__1 ;
    public final void rule__SystemEnvironment__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2003:1: ( rule__SystemEnvironment__Group_8__0__Impl rule__SystemEnvironment__Group_8__1 )
            // InternalMyDsl.g:2004:2: rule__SystemEnvironment__Group_8__0__Impl rule__SystemEnvironment__Group_8__1
            {
            pushFollow(FOLLOW_8);
            rule__SystemEnvironment__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemEnvironment__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEnvironment__Group_8__0"


    // $ANTLR start "rule__SystemEnvironment__Group_8__0__Impl"
    // InternalMyDsl.g:2011:1: rule__SystemEnvironment__Group_8__0__Impl : ( 'link' ) ;
    public final void rule__SystemEnvironment__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2015:1: ( ( 'link' ) )
            // InternalMyDsl.g:2016:1: ( 'link' )
            {
            // InternalMyDsl.g:2016:1: ( 'link' )
            // InternalMyDsl.g:2017:2: 'link'
            {
             before(grammarAccess.getSystemEnvironmentAccess().getLinkKeyword_8_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSystemEnvironmentAccess().getLinkKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEnvironment__Group_8__0__Impl"


    // $ANTLR start "rule__SystemEnvironment__Group_8__1"
    // InternalMyDsl.g:2026:1: rule__SystemEnvironment__Group_8__1 : rule__SystemEnvironment__Group_8__1__Impl rule__SystemEnvironment__Group_8__2 ;
    public final void rule__SystemEnvironment__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2030:1: ( rule__SystemEnvironment__Group_8__1__Impl rule__SystemEnvironment__Group_8__2 )
            // InternalMyDsl.g:2031:2: rule__SystemEnvironment__Group_8__1__Impl rule__SystemEnvironment__Group_8__2
            {
            pushFollow(FOLLOW_9);
            rule__SystemEnvironment__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemEnvironment__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEnvironment__Group_8__1"


    // $ANTLR start "rule__SystemEnvironment__Group_8__1__Impl"
    // InternalMyDsl.g:2038:1: rule__SystemEnvironment__Group_8__1__Impl : ( '(' ) ;
    public final void rule__SystemEnvironment__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2042:1: ( ( '(' ) )
            // InternalMyDsl.g:2043:1: ( '(' )
            {
            // InternalMyDsl.g:2043:1: ( '(' )
            // InternalMyDsl.g:2044:2: '('
            {
             before(grammarAccess.getSystemEnvironmentAccess().getLeftParenthesisKeyword_8_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSystemEnvironmentAccess().getLeftParenthesisKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEnvironment__Group_8__1__Impl"


    // $ANTLR start "rule__SystemEnvironment__Group_8__2"
    // InternalMyDsl.g:2053:1: rule__SystemEnvironment__Group_8__2 : rule__SystemEnvironment__Group_8__2__Impl rule__SystemEnvironment__Group_8__3 ;
    public final void rule__SystemEnvironment__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2057:1: ( rule__SystemEnvironment__Group_8__2__Impl rule__SystemEnvironment__Group_8__3 )
            // InternalMyDsl.g:2058:2: rule__SystemEnvironment__Group_8__2__Impl rule__SystemEnvironment__Group_8__3
            {
            pushFollow(FOLLOW_10);
            rule__SystemEnvironment__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemEnvironment__Group_8__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEnvironment__Group_8__2"


    // $ANTLR start "rule__SystemEnvironment__Group_8__2__Impl"
    // InternalMyDsl.g:2065:1: rule__SystemEnvironment__Group_8__2__Impl : ( ( rule__SystemEnvironment__LinkAssignment_8_2 ) ) ;
    public final void rule__SystemEnvironment__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2069:1: ( ( ( rule__SystemEnvironment__LinkAssignment_8_2 ) ) )
            // InternalMyDsl.g:2070:1: ( ( rule__SystemEnvironment__LinkAssignment_8_2 ) )
            {
            // InternalMyDsl.g:2070:1: ( ( rule__SystemEnvironment__LinkAssignment_8_2 ) )
            // InternalMyDsl.g:2071:2: ( rule__SystemEnvironment__LinkAssignment_8_2 )
            {
             before(grammarAccess.getSystemEnvironmentAccess().getLinkAssignment_8_2()); 
            // InternalMyDsl.g:2072:2: ( rule__SystemEnvironment__LinkAssignment_8_2 )
            // InternalMyDsl.g:2072:3: rule__SystemEnvironment__LinkAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__SystemEnvironment__LinkAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getSystemEnvironmentAccess().getLinkAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEnvironment__Group_8__2__Impl"


    // $ANTLR start "rule__SystemEnvironment__Group_8__3"
    // InternalMyDsl.g:2080:1: rule__SystemEnvironment__Group_8__3 : rule__SystemEnvironment__Group_8__3__Impl rule__SystemEnvironment__Group_8__4 ;
    public final void rule__SystemEnvironment__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2084:1: ( rule__SystemEnvironment__Group_8__3__Impl rule__SystemEnvironment__Group_8__4 )
            // InternalMyDsl.g:2085:2: rule__SystemEnvironment__Group_8__3__Impl rule__SystemEnvironment__Group_8__4
            {
            pushFollow(FOLLOW_10);
            rule__SystemEnvironment__Group_8__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemEnvironment__Group_8__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEnvironment__Group_8__3"


    // $ANTLR start "rule__SystemEnvironment__Group_8__3__Impl"
    // InternalMyDsl.g:2092:1: rule__SystemEnvironment__Group_8__3__Impl : ( ( rule__SystemEnvironment__Group_8_3__0 )* ) ;
    public final void rule__SystemEnvironment__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2096:1: ( ( ( rule__SystemEnvironment__Group_8_3__0 )* ) )
            // InternalMyDsl.g:2097:1: ( ( rule__SystemEnvironment__Group_8_3__0 )* )
            {
            // InternalMyDsl.g:2097:1: ( ( rule__SystemEnvironment__Group_8_3__0 )* )
            // InternalMyDsl.g:2098:2: ( rule__SystemEnvironment__Group_8_3__0 )*
            {
             before(grammarAccess.getSystemEnvironmentAccess().getGroup_8_3()); 
            // InternalMyDsl.g:2099:2: ( rule__SystemEnvironment__Group_8_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==19) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:2099:3: rule__SystemEnvironment__Group_8_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__SystemEnvironment__Group_8_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getSystemEnvironmentAccess().getGroup_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEnvironment__Group_8__3__Impl"


    // $ANTLR start "rule__SystemEnvironment__Group_8__4"
    // InternalMyDsl.g:2107:1: rule__SystemEnvironment__Group_8__4 : rule__SystemEnvironment__Group_8__4__Impl ;
    public final void rule__SystemEnvironment__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2111:1: ( rule__SystemEnvironment__Group_8__4__Impl )
            // InternalMyDsl.g:2112:2: rule__SystemEnvironment__Group_8__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SystemEnvironment__Group_8__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEnvironment__Group_8__4"


    // $ANTLR start "rule__SystemEnvironment__Group_8__4__Impl"
    // InternalMyDsl.g:2118:1: rule__SystemEnvironment__Group_8__4__Impl : ( ')' ) ;
    public final void rule__SystemEnvironment__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2122:1: ( ( ')' ) )
            // InternalMyDsl.g:2123:1: ( ')' )
            {
            // InternalMyDsl.g:2123:1: ( ')' )
            // InternalMyDsl.g:2124:2: ')'
            {
             before(grammarAccess.getSystemEnvironmentAccess().getRightParenthesisKeyword_8_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSystemEnvironmentAccess().getRightParenthesisKeyword_8_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEnvironment__Group_8__4__Impl"


    // $ANTLR start "rule__SystemEnvironment__Group_8_3__0"
    // InternalMyDsl.g:2134:1: rule__SystemEnvironment__Group_8_3__0 : rule__SystemEnvironment__Group_8_3__0__Impl rule__SystemEnvironment__Group_8_3__1 ;
    public final void rule__SystemEnvironment__Group_8_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2138:1: ( rule__SystemEnvironment__Group_8_3__0__Impl rule__SystemEnvironment__Group_8_3__1 )
            // InternalMyDsl.g:2139:2: rule__SystemEnvironment__Group_8_3__0__Impl rule__SystemEnvironment__Group_8_3__1
            {
            pushFollow(FOLLOW_9);
            rule__SystemEnvironment__Group_8_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemEnvironment__Group_8_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEnvironment__Group_8_3__0"


    // $ANTLR start "rule__SystemEnvironment__Group_8_3__0__Impl"
    // InternalMyDsl.g:2146:1: rule__SystemEnvironment__Group_8_3__0__Impl : ( ',' ) ;
    public final void rule__SystemEnvironment__Group_8_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2150:1: ( ( ',' ) )
            // InternalMyDsl.g:2151:1: ( ',' )
            {
            // InternalMyDsl.g:2151:1: ( ',' )
            // InternalMyDsl.g:2152:2: ','
            {
             before(grammarAccess.getSystemEnvironmentAccess().getCommaKeyword_8_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSystemEnvironmentAccess().getCommaKeyword_8_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEnvironment__Group_8_3__0__Impl"


    // $ANTLR start "rule__SystemEnvironment__Group_8_3__1"
    // InternalMyDsl.g:2161:1: rule__SystemEnvironment__Group_8_3__1 : rule__SystemEnvironment__Group_8_3__1__Impl ;
    public final void rule__SystemEnvironment__Group_8_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2165:1: ( rule__SystemEnvironment__Group_8_3__1__Impl )
            // InternalMyDsl.g:2166:2: rule__SystemEnvironment__Group_8_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SystemEnvironment__Group_8_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEnvironment__Group_8_3__1"


    // $ANTLR start "rule__SystemEnvironment__Group_8_3__1__Impl"
    // InternalMyDsl.g:2172:1: rule__SystemEnvironment__Group_8_3__1__Impl : ( ( rule__SystemEnvironment__LinkAssignment_8_3_1 ) ) ;
    public final void rule__SystemEnvironment__Group_8_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2176:1: ( ( ( rule__SystemEnvironment__LinkAssignment_8_3_1 ) ) )
            // InternalMyDsl.g:2177:1: ( ( rule__SystemEnvironment__LinkAssignment_8_3_1 ) )
            {
            // InternalMyDsl.g:2177:1: ( ( rule__SystemEnvironment__LinkAssignment_8_3_1 ) )
            // InternalMyDsl.g:2178:2: ( rule__SystemEnvironment__LinkAssignment_8_3_1 )
            {
             before(grammarAccess.getSystemEnvironmentAccess().getLinkAssignment_8_3_1()); 
            // InternalMyDsl.g:2179:2: ( rule__SystemEnvironment__LinkAssignment_8_3_1 )
            // InternalMyDsl.g:2179:3: rule__SystemEnvironment__LinkAssignment_8_3_1
            {
            pushFollow(FOLLOW_2);
            rule__SystemEnvironment__LinkAssignment_8_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSystemEnvironmentAccess().getLinkAssignment_8_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEnvironment__Group_8_3__1__Impl"


    // $ANTLR start "rule__Container__Group__0"
    // InternalMyDsl.g:2188:1: rule__Container__Group__0 : rule__Container__Group__0__Impl rule__Container__Group__1 ;
    public final void rule__Container__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2192:1: ( rule__Container__Group__0__Impl rule__Container__Group__1 )
            // InternalMyDsl.g:2193:2: rule__Container__Group__0__Impl rule__Container__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:2200:1: rule__Container__Group__0__Impl : ( 'Container' ) ;
    public final void rule__Container__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2204:1: ( ( 'Container' ) )
            // InternalMyDsl.g:2205:1: ( 'Container' )
            {
            // InternalMyDsl.g:2205:1: ( 'Container' )
            // InternalMyDsl.g:2206:2: 'Container'
            {
             before(grammarAccess.getContainerAccess().getContainerKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalMyDsl.g:2215:1: rule__Container__Group__1 : rule__Container__Group__1__Impl rule__Container__Group__2 ;
    public final void rule__Container__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2219:1: ( rule__Container__Group__1__Impl rule__Container__Group__2 )
            // InternalMyDsl.g:2220:2: rule__Container__Group__1__Impl rule__Container__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:2227:1: rule__Container__Group__1__Impl : ( ( rule__Container__NameAssignment_1 ) ) ;
    public final void rule__Container__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2231:1: ( ( ( rule__Container__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2232:1: ( ( rule__Container__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2232:1: ( ( rule__Container__NameAssignment_1 ) )
            // InternalMyDsl.g:2233:2: ( rule__Container__NameAssignment_1 )
            {
             before(grammarAccess.getContainerAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2234:2: ( rule__Container__NameAssignment_1 )
            // InternalMyDsl.g:2234:3: rule__Container__NameAssignment_1
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
    // InternalMyDsl.g:2242:1: rule__Container__Group__2 : rule__Container__Group__2__Impl rule__Container__Group__3 ;
    public final void rule__Container__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2246:1: ( rule__Container__Group__2__Impl rule__Container__Group__3 )
            // InternalMyDsl.g:2247:2: rule__Container__Group__2__Impl rule__Container__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:2254:1: rule__Container__Group__2__Impl : ( '{' ) ;
    public final void rule__Container__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2258:1: ( ( '{' ) )
            // InternalMyDsl.g:2259:1: ( '{' )
            {
            // InternalMyDsl.g:2259:1: ( '{' )
            // InternalMyDsl.g:2260:2: '{'
            {
             before(grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
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
    // InternalMyDsl.g:2269:1: rule__Container__Group__3 : rule__Container__Group__3__Impl rule__Container__Group__4 ;
    public final void rule__Container__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2273:1: ( rule__Container__Group__3__Impl rule__Container__Group__4 )
            // InternalMyDsl.g:2274:2: rule__Container__Group__3__Impl rule__Container__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:2281:1: rule__Container__Group__3__Impl : ( 'links' ) ;
    public final void rule__Container__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2285:1: ( ( 'links' ) )
            // InternalMyDsl.g:2286:1: ( 'links' )
            {
            // InternalMyDsl.g:2286:1: ( 'links' )
            // InternalMyDsl.g:2287:2: 'links'
            {
             before(grammarAccess.getContainerAccess().getLinksKeyword_3()); 
            match(input,25,FOLLOW_2); 
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
    // InternalMyDsl.g:2296:1: rule__Container__Group__4 : rule__Container__Group__4__Impl rule__Container__Group__5 ;
    public final void rule__Container__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2300:1: ( rule__Container__Group__4__Impl rule__Container__Group__5 )
            // InternalMyDsl.g:2301:2: rule__Container__Group__4__Impl rule__Container__Group__5
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:2308:1: rule__Container__Group__4__Impl : ( '(' ) ;
    public final void rule__Container__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2312:1: ( ( '(' ) )
            // InternalMyDsl.g:2313:1: ( '(' )
            {
            // InternalMyDsl.g:2313:1: ( '(' )
            // InternalMyDsl.g:2314:2: '('
            {
             before(grammarAccess.getContainerAccess().getLeftParenthesisKeyword_4()); 
            match(input,16,FOLLOW_2); 
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
    // InternalMyDsl.g:2323:1: rule__Container__Group__5 : rule__Container__Group__5__Impl rule__Container__Group__6 ;
    public final void rule__Container__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2327:1: ( rule__Container__Group__5__Impl rule__Container__Group__6 )
            // InternalMyDsl.g:2328:2: rule__Container__Group__5__Impl rule__Container__Group__6
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:2335:1: rule__Container__Group__5__Impl : ( ( rule__Container__LinksAssignment_5 ) ) ;
    public final void rule__Container__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2339:1: ( ( ( rule__Container__LinksAssignment_5 ) ) )
            // InternalMyDsl.g:2340:1: ( ( rule__Container__LinksAssignment_5 ) )
            {
            // InternalMyDsl.g:2340:1: ( ( rule__Container__LinksAssignment_5 ) )
            // InternalMyDsl.g:2341:2: ( rule__Container__LinksAssignment_5 )
            {
             before(grammarAccess.getContainerAccess().getLinksAssignment_5()); 
            // InternalMyDsl.g:2342:2: ( rule__Container__LinksAssignment_5 )
            // InternalMyDsl.g:2342:3: rule__Container__LinksAssignment_5
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
    // InternalMyDsl.g:2350:1: rule__Container__Group__6 : rule__Container__Group__6__Impl rule__Container__Group__7 ;
    public final void rule__Container__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2354:1: ( rule__Container__Group__6__Impl rule__Container__Group__7 )
            // InternalMyDsl.g:2355:2: rule__Container__Group__6__Impl rule__Container__Group__7
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:2362:1: rule__Container__Group__6__Impl : ( ( rule__Container__Group_6__0 )* ) ;
    public final void rule__Container__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2366:1: ( ( ( rule__Container__Group_6__0 )* ) )
            // InternalMyDsl.g:2367:1: ( ( rule__Container__Group_6__0 )* )
            {
            // InternalMyDsl.g:2367:1: ( ( rule__Container__Group_6__0 )* )
            // InternalMyDsl.g:2368:2: ( rule__Container__Group_6__0 )*
            {
             before(grammarAccess.getContainerAccess().getGroup_6()); 
            // InternalMyDsl.g:2369:2: ( rule__Container__Group_6__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==19) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:2369:3: rule__Container__Group_6__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Container__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalMyDsl.g:2377:1: rule__Container__Group__7 : rule__Container__Group__7__Impl rule__Container__Group__8 ;
    public final void rule__Container__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2381:1: ( rule__Container__Group__7__Impl rule__Container__Group__8 )
            // InternalMyDsl.g:2382:2: rule__Container__Group__7__Impl rule__Container__Group__8
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:2389:1: rule__Container__Group__7__Impl : ( ')' ) ;
    public final void rule__Container__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2393:1: ( ( ')' ) )
            // InternalMyDsl.g:2394:1: ( ')' )
            {
            // InternalMyDsl.g:2394:1: ( ')' )
            // InternalMyDsl.g:2395:2: ')'
            {
             before(grammarAccess.getContainerAccess().getRightParenthesisKeyword_7()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyDsl.g:2404:1: rule__Container__Group__8 : rule__Container__Group__8__Impl ;
    public final void rule__Container__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2408:1: ( rule__Container__Group__8__Impl )
            // InternalMyDsl.g:2409:2: rule__Container__Group__8__Impl
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
    // InternalMyDsl.g:2415:1: rule__Container__Group__8__Impl : ( '}' ) ;
    public final void rule__Container__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2419:1: ( ( '}' ) )
            // InternalMyDsl.g:2420:1: ( '}' )
            {
            // InternalMyDsl.g:2420:1: ( '}' )
            // InternalMyDsl.g:2421:2: '}'
            {
             before(grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_8()); 
            match(input,18,FOLLOW_2); 
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
    // InternalMyDsl.g:2431:1: rule__Container__Group_6__0 : rule__Container__Group_6__0__Impl rule__Container__Group_6__1 ;
    public final void rule__Container__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2435:1: ( rule__Container__Group_6__0__Impl rule__Container__Group_6__1 )
            // InternalMyDsl.g:2436:2: rule__Container__Group_6__0__Impl rule__Container__Group_6__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:2443:1: rule__Container__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Container__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2447:1: ( ( ',' ) )
            // InternalMyDsl.g:2448:1: ( ',' )
            {
            // InternalMyDsl.g:2448:1: ( ',' )
            // InternalMyDsl.g:2449:2: ','
            {
             before(grammarAccess.getContainerAccess().getCommaKeyword_6_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalMyDsl.g:2458:1: rule__Container__Group_6__1 : rule__Container__Group_6__1__Impl ;
    public final void rule__Container__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2462:1: ( rule__Container__Group_6__1__Impl )
            // InternalMyDsl.g:2463:2: rule__Container__Group_6__1__Impl
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
    // InternalMyDsl.g:2469:1: rule__Container__Group_6__1__Impl : ( ( rule__Container__LinksAssignment_6_1 ) ) ;
    public final void rule__Container__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2473:1: ( ( ( rule__Container__LinksAssignment_6_1 ) ) )
            // InternalMyDsl.g:2474:1: ( ( rule__Container__LinksAssignment_6_1 ) )
            {
            // InternalMyDsl.g:2474:1: ( ( rule__Container__LinksAssignment_6_1 ) )
            // InternalMyDsl.g:2475:2: ( rule__Container__LinksAssignment_6_1 )
            {
             before(grammarAccess.getContainerAccess().getLinksAssignment_6_1()); 
            // InternalMyDsl.g:2476:2: ( rule__Container__LinksAssignment_6_1 )
            // InternalMyDsl.g:2476:3: rule__Container__LinksAssignment_6_1
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


    // $ANTLR start "rule__System__Group__0"
    // InternalMyDsl.g:2485:1: rule__System__Group__0 : rule__System__Group__0__Impl rule__System__Group__1 ;
    public final void rule__System__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2489:1: ( rule__System__Group__0__Impl rule__System__Group__1 )
            // InternalMyDsl.g:2490:2: rule__System__Group__0__Impl rule__System__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__System__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__0"


    // $ANTLR start "rule__System__Group__0__Impl"
    // InternalMyDsl.g:2497:1: rule__System__Group__0__Impl : ( 'System' ) ;
    public final void rule__System__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2501:1: ( ( 'System' ) )
            // InternalMyDsl.g:2502:1: ( 'System' )
            {
            // InternalMyDsl.g:2502:1: ( 'System' )
            // InternalMyDsl.g:2503:2: 'System'
            {
             before(grammarAccess.getSystemAccess().getSystemKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getSystemKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__0__Impl"


    // $ANTLR start "rule__System__Group__1"
    // InternalMyDsl.g:2512:1: rule__System__Group__1 : rule__System__Group__1__Impl rule__System__Group__2 ;
    public final void rule__System__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2516:1: ( rule__System__Group__1__Impl rule__System__Group__2 )
            // InternalMyDsl.g:2517:2: rule__System__Group__1__Impl rule__System__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__System__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__1"


    // $ANTLR start "rule__System__Group__1__Impl"
    // InternalMyDsl.g:2524:1: rule__System__Group__1__Impl : ( ( rule__System__NameAssignment_1 ) ) ;
    public final void rule__System__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2528:1: ( ( ( rule__System__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2529:1: ( ( rule__System__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2529:1: ( ( rule__System__NameAssignment_1 ) )
            // InternalMyDsl.g:2530:2: ( rule__System__NameAssignment_1 )
            {
             before(grammarAccess.getSystemAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2531:2: ( rule__System__NameAssignment_1 )
            // InternalMyDsl.g:2531:3: rule__System__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__System__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__1__Impl"


    // $ANTLR start "rule__System__Group__2"
    // InternalMyDsl.g:2539:1: rule__System__Group__2 : rule__System__Group__2__Impl rule__System__Group__3 ;
    public final void rule__System__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2543:1: ( rule__System__Group__2__Impl rule__System__Group__3 )
            // InternalMyDsl.g:2544:2: rule__System__Group__2__Impl rule__System__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__System__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__2"


    // $ANTLR start "rule__System__Group__2__Impl"
    // InternalMyDsl.g:2551:1: rule__System__Group__2__Impl : ( '{' ) ;
    public final void rule__System__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2555:1: ( ( '{' ) )
            // InternalMyDsl.g:2556:1: ( '{' )
            {
            // InternalMyDsl.g:2556:1: ( '{' )
            // InternalMyDsl.g:2557:2: '{'
            {
             before(grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__2__Impl"


    // $ANTLR start "rule__System__Group__3"
    // InternalMyDsl.g:2566:1: rule__System__Group__3 : rule__System__Group__3__Impl rule__System__Group__4 ;
    public final void rule__System__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2570:1: ( rule__System__Group__3__Impl rule__System__Group__4 )
            // InternalMyDsl.g:2571:2: rule__System__Group__3__Impl rule__System__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__System__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__3"


    // $ANTLR start "rule__System__Group__3__Impl"
    // InternalMyDsl.g:2578:1: rule__System__Group__3__Impl : ( 'encapsulatedAssemblyContext' ) ;
    public final void rule__System__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2582:1: ( ( 'encapsulatedAssemblyContext' ) )
            // InternalMyDsl.g:2583:1: ( 'encapsulatedAssemblyContext' )
            {
            // InternalMyDsl.g:2583:1: ( 'encapsulatedAssemblyContext' )
            // InternalMyDsl.g:2584:2: 'encapsulatedAssemblyContext'
            {
             before(grammarAccess.getSystemAccess().getEncapsulatedAssemblyContextKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getEncapsulatedAssemblyContextKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__3__Impl"


    // $ANTLR start "rule__System__Group__4"
    // InternalMyDsl.g:2593:1: rule__System__Group__4 : rule__System__Group__4__Impl rule__System__Group__5 ;
    public final void rule__System__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2597:1: ( rule__System__Group__4__Impl rule__System__Group__5 )
            // InternalMyDsl.g:2598:2: rule__System__Group__4__Impl rule__System__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__System__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__4"


    // $ANTLR start "rule__System__Group__4__Impl"
    // InternalMyDsl.g:2605:1: rule__System__Group__4__Impl : ( '(' ) ;
    public final void rule__System__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2609:1: ( ( '(' ) )
            // InternalMyDsl.g:2610:1: ( '(' )
            {
            // InternalMyDsl.g:2610:1: ( '(' )
            // InternalMyDsl.g:2611:2: '('
            {
             before(grammarAccess.getSystemAccess().getLeftParenthesisKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getLeftParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__4__Impl"


    // $ANTLR start "rule__System__Group__5"
    // InternalMyDsl.g:2620:1: rule__System__Group__5 : rule__System__Group__5__Impl rule__System__Group__6 ;
    public final void rule__System__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2624:1: ( rule__System__Group__5__Impl rule__System__Group__6 )
            // InternalMyDsl.g:2625:2: rule__System__Group__5__Impl rule__System__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__System__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__5"


    // $ANTLR start "rule__System__Group__5__Impl"
    // InternalMyDsl.g:2632:1: rule__System__Group__5__Impl : ( ( rule__System__EncapsulatedAssemblyContextAssignment_5 ) ) ;
    public final void rule__System__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2636:1: ( ( ( rule__System__EncapsulatedAssemblyContextAssignment_5 ) ) )
            // InternalMyDsl.g:2637:1: ( ( rule__System__EncapsulatedAssemblyContextAssignment_5 ) )
            {
            // InternalMyDsl.g:2637:1: ( ( rule__System__EncapsulatedAssemblyContextAssignment_5 ) )
            // InternalMyDsl.g:2638:2: ( rule__System__EncapsulatedAssemblyContextAssignment_5 )
            {
             before(grammarAccess.getSystemAccess().getEncapsulatedAssemblyContextAssignment_5()); 
            // InternalMyDsl.g:2639:2: ( rule__System__EncapsulatedAssemblyContextAssignment_5 )
            // InternalMyDsl.g:2639:3: rule__System__EncapsulatedAssemblyContextAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__System__EncapsulatedAssemblyContextAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getEncapsulatedAssemblyContextAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__5__Impl"


    // $ANTLR start "rule__System__Group__6"
    // InternalMyDsl.g:2647:1: rule__System__Group__6 : rule__System__Group__6__Impl rule__System__Group__7 ;
    public final void rule__System__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2651:1: ( rule__System__Group__6__Impl rule__System__Group__7 )
            // InternalMyDsl.g:2652:2: rule__System__Group__6__Impl rule__System__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__System__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__6"


    // $ANTLR start "rule__System__Group__6__Impl"
    // InternalMyDsl.g:2659:1: rule__System__Group__6__Impl : ( ( rule__System__Group_6__0 )* ) ;
    public final void rule__System__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2663:1: ( ( ( rule__System__Group_6__0 )* ) )
            // InternalMyDsl.g:2664:1: ( ( rule__System__Group_6__0 )* )
            {
            // InternalMyDsl.g:2664:1: ( ( rule__System__Group_6__0 )* )
            // InternalMyDsl.g:2665:2: ( rule__System__Group_6__0 )*
            {
             before(grammarAccess.getSystemAccess().getGroup_6()); 
            // InternalMyDsl.g:2666:2: ( rule__System__Group_6__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==19) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:2666:3: rule__System__Group_6__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__System__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getSystemAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__6__Impl"


    // $ANTLR start "rule__System__Group__7"
    // InternalMyDsl.g:2674:1: rule__System__Group__7 : rule__System__Group__7__Impl rule__System__Group__8 ;
    public final void rule__System__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2678:1: ( rule__System__Group__7__Impl rule__System__Group__8 )
            // InternalMyDsl.g:2679:2: rule__System__Group__7__Impl rule__System__Group__8
            {
            pushFollow(FOLLOW_18);
            rule__System__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__7"


    // $ANTLR start "rule__System__Group__7__Impl"
    // InternalMyDsl.g:2686:1: rule__System__Group__7__Impl : ( ')' ) ;
    public final void rule__System__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2690:1: ( ( ')' ) )
            // InternalMyDsl.g:2691:1: ( ')' )
            {
            // InternalMyDsl.g:2691:1: ( ')' )
            // InternalMyDsl.g:2692:2: ')'
            {
             before(grammarAccess.getSystemAccess().getRightParenthesisKeyword_7()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__7__Impl"


    // $ANTLR start "rule__System__Group__8"
    // InternalMyDsl.g:2701:1: rule__System__Group__8 : rule__System__Group__8__Impl rule__System__Group__9 ;
    public final void rule__System__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2705:1: ( rule__System__Group__8__Impl rule__System__Group__9 )
            // InternalMyDsl.g:2706:2: rule__System__Group__8__Impl rule__System__Group__9
            {
            pushFollow(FOLLOW_18);
            rule__System__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__8"


    // $ANTLR start "rule__System__Group__8__Impl"
    // InternalMyDsl.g:2713:1: rule__System__Group__8__Impl : ( ( rule__System__Group_8__0 )? ) ;
    public final void rule__System__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2717:1: ( ( ( rule__System__Group_8__0 )? ) )
            // InternalMyDsl.g:2718:1: ( ( rule__System__Group_8__0 )? )
            {
            // InternalMyDsl.g:2718:1: ( ( rule__System__Group_8__0 )? )
            // InternalMyDsl.g:2719:2: ( rule__System__Group_8__0 )?
            {
             before(grammarAccess.getSystemAccess().getGroup_8()); 
            // InternalMyDsl.g:2720:2: ( rule__System__Group_8__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==29) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:2720:3: rule__System__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__System__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSystemAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__8__Impl"


    // $ANTLR start "rule__System__Group__9"
    // InternalMyDsl.g:2728:1: rule__System__Group__9 : rule__System__Group__9__Impl rule__System__Group__10 ;
    public final void rule__System__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2732:1: ( rule__System__Group__9__Impl rule__System__Group__10 )
            // InternalMyDsl.g:2733:2: rule__System__Group__9__Impl rule__System__Group__10
            {
            pushFollow(FOLLOW_18);
            rule__System__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__9"


    // $ANTLR start "rule__System__Group__9__Impl"
    // InternalMyDsl.g:2740:1: rule__System__Group__9__Impl : ( ( rule__System__Group_9__0 )? ) ;
    public final void rule__System__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2744:1: ( ( ( rule__System__Group_9__0 )? ) )
            // InternalMyDsl.g:2745:1: ( ( rule__System__Group_9__0 )? )
            {
            // InternalMyDsl.g:2745:1: ( ( rule__System__Group_9__0 )? )
            // InternalMyDsl.g:2746:2: ( rule__System__Group_9__0 )?
            {
             before(grammarAccess.getSystemAccess().getGroup_9()); 
            // InternalMyDsl.g:2747:2: ( rule__System__Group_9__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:2747:3: rule__System__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__System__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSystemAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__9__Impl"


    // $ANTLR start "rule__System__Group__10"
    // InternalMyDsl.g:2755:1: rule__System__Group__10 : rule__System__Group__10__Impl rule__System__Group__11 ;
    public final void rule__System__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2759:1: ( rule__System__Group__10__Impl rule__System__Group__11 )
            // InternalMyDsl.g:2760:2: rule__System__Group__10__Impl rule__System__Group__11
            {
            pushFollow(FOLLOW_9);
            rule__System__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__10"


    // $ANTLR start "rule__System__Group__10__Impl"
    // InternalMyDsl.g:2767:1: rule__System__Group__10__Impl : ( 'environment' ) ;
    public final void rule__System__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2771:1: ( ( 'environment' ) )
            // InternalMyDsl.g:2772:1: ( 'environment' )
            {
            // InternalMyDsl.g:2772:1: ( 'environment' )
            // InternalMyDsl.g:2773:2: 'environment'
            {
             before(grammarAccess.getSystemAccess().getEnvironmentKeyword_10()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getEnvironmentKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__10__Impl"


    // $ANTLR start "rule__System__Group__11"
    // InternalMyDsl.g:2782:1: rule__System__Group__11 : rule__System__Group__11__Impl rule__System__Group__12 ;
    public final void rule__System__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2786:1: ( rule__System__Group__11__Impl rule__System__Group__12 )
            // InternalMyDsl.g:2787:2: rule__System__Group__11__Impl rule__System__Group__12
            {
            pushFollow(FOLLOW_16);
            rule__System__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__11"


    // $ANTLR start "rule__System__Group__11__Impl"
    // InternalMyDsl.g:2794:1: rule__System__Group__11__Impl : ( ( rule__System__EnvironmentAssignment_11 ) ) ;
    public final void rule__System__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2798:1: ( ( ( rule__System__EnvironmentAssignment_11 ) ) )
            // InternalMyDsl.g:2799:1: ( ( rule__System__EnvironmentAssignment_11 ) )
            {
            // InternalMyDsl.g:2799:1: ( ( rule__System__EnvironmentAssignment_11 ) )
            // InternalMyDsl.g:2800:2: ( rule__System__EnvironmentAssignment_11 )
            {
             before(grammarAccess.getSystemAccess().getEnvironmentAssignment_11()); 
            // InternalMyDsl.g:2801:2: ( rule__System__EnvironmentAssignment_11 )
            // InternalMyDsl.g:2801:3: rule__System__EnvironmentAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__System__EnvironmentAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getEnvironmentAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__11__Impl"


    // $ANTLR start "rule__System__Group__12"
    // InternalMyDsl.g:2809:1: rule__System__Group__12 : rule__System__Group__12__Impl ;
    public final void rule__System__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2813:1: ( rule__System__Group__12__Impl )
            // InternalMyDsl.g:2814:2: rule__System__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__System__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__12"


    // $ANTLR start "rule__System__Group__12__Impl"
    // InternalMyDsl.g:2820:1: rule__System__Group__12__Impl : ( '}' ) ;
    public final void rule__System__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2824:1: ( ( '}' ) )
            // InternalMyDsl.g:2825:1: ( '}' )
            {
            // InternalMyDsl.g:2825:1: ( '}' )
            // InternalMyDsl.g:2826:2: '}'
            {
             before(grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_12()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__12__Impl"


    // $ANTLR start "rule__System__Group_6__0"
    // InternalMyDsl.g:2836:1: rule__System__Group_6__0 : rule__System__Group_6__0__Impl rule__System__Group_6__1 ;
    public final void rule__System__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2840:1: ( rule__System__Group_6__0__Impl rule__System__Group_6__1 )
            // InternalMyDsl.g:2841:2: rule__System__Group_6__0__Impl rule__System__Group_6__1
            {
            pushFollow(FOLLOW_9);
            rule__System__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_6__0"


    // $ANTLR start "rule__System__Group_6__0__Impl"
    // InternalMyDsl.g:2848:1: rule__System__Group_6__0__Impl : ( ',' ) ;
    public final void rule__System__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2852:1: ( ( ',' ) )
            // InternalMyDsl.g:2853:1: ( ',' )
            {
            // InternalMyDsl.g:2853:1: ( ',' )
            // InternalMyDsl.g:2854:2: ','
            {
             before(grammarAccess.getSystemAccess().getCommaKeyword_6_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_6__0__Impl"


    // $ANTLR start "rule__System__Group_6__1"
    // InternalMyDsl.g:2863:1: rule__System__Group_6__1 : rule__System__Group_6__1__Impl ;
    public final void rule__System__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2867:1: ( rule__System__Group_6__1__Impl )
            // InternalMyDsl.g:2868:2: rule__System__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__System__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_6__1"


    // $ANTLR start "rule__System__Group_6__1__Impl"
    // InternalMyDsl.g:2874:1: rule__System__Group_6__1__Impl : ( ( rule__System__EncapsulatedAssemblyContextAssignment_6_1 ) ) ;
    public final void rule__System__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2878:1: ( ( ( rule__System__EncapsulatedAssemblyContextAssignment_6_1 ) ) )
            // InternalMyDsl.g:2879:1: ( ( rule__System__EncapsulatedAssemblyContextAssignment_6_1 ) )
            {
            // InternalMyDsl.g:2879:1: ( ( rule__System__EncapsulatedAssemblyContextAssignment_6_1 ) )
            // InternalMyDsl.g:2880:2: ( rule__System__EncapsulatedAssemblyContextAssignment_6_1 )
            {
             before(grammarAccess.getSystemAccess().getEncapsulatedAssemblyContextAssignment_6_1()); 
            // InternalMyDsl.g:2881:2: ( rule__System__EncapsulatedAssemblyContextAssignment_6_1 )
            // InternalMyDsl.g:2881:3: rule__System__EncapsulatedAssemblyContextAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__System__EncapsulatedAssemblyContextAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getEncapsulatedAssemblyContextAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_6__1__Impl"


    // $ANTLR start "rule__System__Group_8__0"
    // InternalMyDsl.g:2890:1: rule__System__Group_8__0 : rule__System__Group_8__0__Impl rule__System__Group_8__1 ;
    public final void rule__System__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2894:1: ( rule__System__Group_8__0__Impl rule__System__Group_8__1 )
            // InternalMyDsl.g:2895:2: rule__System__Group_8__0__Impl rule__System__Group_8__1
            {
            pushFollow(FOLLOW_9);
            rule__System__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_8__0"


    // $ANTLR start "rule__System__Group_8__0__Impl"
    // InternalMyDsl.g:2902:1: rule__System__Group_8__0__Impl : ( 'allocationContext' ) ;
    public final void rule__System__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2906:1: ( ( 'allocationContext' ) )
            // InternalMyDsl.g:2907:1: ( 'allocationContext' )
            {
            // InternalMyDsl.g:2907:1: ( 'allocationContext' )
            // InternalMyDsl.g:2908:2: 'allocationContext'
            {
             before(grammarAccess.getSystemAccess().getAllocationContextKeyword_8_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getAllocationContextKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_8__0__Impl"


    // $ANTLR start "rule__System__Group_8__1"
    // InternalMyDsl.g:2917:1: rule__System__Group_8__1 : rule__System__Group_8__1__Impl ;
    public final void rule__System__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2921:1: ( rule__System__Group_8__1__Impl )
            // InternalMyDsl.g:2922:2: rule__System__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__System__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_8__1"


    // $ANTLR start "rule__System__Group_8__1__Impl"
    // InternalMyDsl.g:2928:1: rule__System__Group_8__1__Impl : ( ( rule__System__AllocationContextAssignment_8_1 ) ) ;
    public final void rule__System__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2932:1: ( ( ( rule__System__AllocationContextAssignment_8_1 ) ) )
            // InternalMyDsl.g:2933:1: ( ( rule__System__AllocationContextAssignment_8_1 ) )
            {
            // InternalMyDsl.g:2933:1: ( ( rule__System__AllocationContextAssignment_8_1 ) )
            // InternalMyDsl.g:2934:2: ( rule__System__AllocationContextAssignment_8_1 )
            {
             before(grammarAccess.getSystemAccess().getAllocationContextAssignment_8_1()); 
            // InternalMyDsl.g:2935:2: ( rule__System__AllocationContextAssignment_8_1 )
            // InternalMyDsl.g:2935:3: rule__System__AllocationContextAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__System__AllocationContextAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getAllocationContextAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_8__1__Impl"


    // $ANTLR start "rule__System__Group_9__0"
    // InternalMyDsl.g:2944:1: rule__System__Group_9__0 : rule__System__Group_9__0__Impl rule__System__Group_9__1 ;
    public final void rule__System__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2948:1: ( rule__System__Group_9__0__Impl rule__System__Group_9__1 )
            // InternalMyDsl.g:2949:2: rule__System__Group_9__0__Impl rule__System__Group_9__1
            {
            pushFollow(FOLLOW_8);
            rule__System__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_9__0"


    // $ANTLR start "rule__System__Group_9__0__Impl"
    // InternalMyDsl.g:2956:1: rule__System__Group_9__0__Impl : ( 'providedInterfaces' ) ;
    public final void rule__System__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2960:1: ( ( 'providedInterfaces' ) )
            // InternalMyDsl.g:2961:1: ( 'providedInterfaces' )
            {
            // InternalMyDsl.g:2961:1: ( 'providedInterfaces' )
            // InternalMyDsl.g:2962:2: 'providedInterfaces'
            {
             before(grammarAccess.getSystemAccess().getProvidedInterfacesKeyword_9_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getProvidedInterfacesKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_9__0__Impl"


    // $ANTLR start "rule__System__Group_9__1"
    // InternalMyDsl.g:2971:1: rule__System__Group_9__1 : rule__System__Group_9__1__Impl rule__System__Group_9__2 ;
    public final void rule__System__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2975:1: ( rule__System__Group_9__1__Impl rule__System__Group_9__2 )
            // InternalMyDsl.g:2976:2: rule__System__Group_9__1__Impl rule__System__Group_9__2
            {
            pushFollow(FOLLOW_9);
            rule__System__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_9__1"


    // $ANTLR start "rule__System__Group_9__1__Impl"
    // InternalMyDsl.g:2983:1: rule__System__Group_9__1__Impl : ( '(' ) ;
    public final void rule__System__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2987:1: ( ( '(' ) )
            // InternalMyDsl.g:2988:1: ( '(' )
            {
            // InternalMyDsl.g:2988:1: ( '(' )
            // InternalMyDsl.g:2989:2: '('
            {
             before(grammarAccess.getSystemAccess().getLeftParenthesisKeyword_9_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getLeftParenthesisKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_9__1__Impl"


    // $ANTLR start "rule__System__Group_9__2"
    // InternalMyDsl.g:2998:1: rule__System__Group_9__2 : rule__System__Group_9__2__Impl rule__System__Group_9__3 ;
    public final void rule__System__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3002:1: ( rule__System__Group_9__2__Impl rule__System__Group_9__3 )
            // InternalMyDsl.g:3003:2: rule__System__Group_9__2__Impl rule__System__Group_9__3
            {
            pushFollow(FOLLOW_10);
            rule__System__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group_9__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_9__2"


    // $ANTLR start "rule__System__Group_9__2__Impl"
    // InternalMyDsl.g:3010:1: rule__System__Group_9__2__Impl : ( ( rule__System__ProvidedInterfacesAssignment_9_2 ) ) ;
    public final void rule__System__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3014:1: ( ( ( rule__System__ProvidedInterfacesAssignment_9_2 ) ) )
            // InternalMyDsl.g:3015:1: ( ( rule__System__ProvidedInterfacesAssignment_9_2 ) )
            {
            // InternalMyDsl.g:3015:1: ( ( rule__System__ProvidedInterfacesAssignment_9_2 ) )
            // InternalMyDsl.g:3016:2: ( rule__System__ProvidedInterfacesAssignment_9_2 )
            {
             before(grammarAccess.getSystemAccess().getProvidedInterfacesAssignment_9_2()); 
            // InternalMyDsl.g:3017:2: ( rule__System__ProvidedInterfacesAssignment_9_2 )
            // InternalMyDsl.g:3017:3: rule__System__ProvidedInterfacesAssignment_9_2
            {
            pushFollow(FOLLOW_2);
            rule__System__ProvidedInterfacesAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getProvidedInterfacesAssignment_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_9__2__Impl"


    // $ANTLR start "rule__System__Group_9__3"
    // InternalMyDsl.g:3025:1: rule__System__Group_9__3 : rule__System__Group_9__3__Impl rule__System__Group_9__4 ;
    public final void rule__System__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3029:1: ( rule__System__Group_9__3__Impl rule__System__Group_9__4 )
            // InternalMyDsl.g:3030:2: rule__System__Group_9__3__Impl rule__System__Group_9__4
            {
            pushFollow(FOLLOW_10);
            rule__System__Group_9__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group_9__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_9__3"


    // $ANTLR start "rule__System__Group_9__3__Impl"
    // InternalMyDsl.g:3037:1: rule__System__Group_9__3__Impl : ( ( rule__System__Group_9_3__0 )* ) ;
    public final void rule__System__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3041:1: ( ( ( rule__System__Group_9_3__0 )* ) )
            // InternalMyDsl.g:3042:1: ( ( rule__System__Group_9_3__0 )* )
            {
            // InternalMyDsl.g:3042:1: ( ( rule__System__Group_9_3__0 )* )
            // InternalMyDsl.g:3043:2: ( rule__System__Group_9_3__0 )*
            {
             before(grammarAccess.getSystemAccess().getGroup_9_3()); 
            // InternalMyDsl.g:3044:2: ( rule__System__Group_9_3__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==19) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMyDsl.g:3044:3: rule__System__Group_9_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__System__Group_9_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getSystemAccess().getGroup_9_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_9__3__Impl"


    // $ANTLR start "rule__System__Group_9__4"
    // InternalMyDsl.g:3052:1: rule__System__Group_9__4 : rule__System__Group_9__4__Impl ;
    public final void rule__System__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3056:1: ( rule__System__Group_9__4__Impl )
            // InternalMyDsl.g:3057:2: rule__System__Group_9__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__System__Group_9__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_9__4"


    // $ANTLR start "rule__System__Group_9__4__Impl"
    // InternalMyDsl.g:3063:1: rule__System__Group_9__4__Impl : ( ')' ) ;
    public final void rule__System__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3067:1: ( ( ')' ) )
            // InternalMyDsl.g:3068:1: ( ')' )
            {
            // InternalMyDsl.g:3068:1: ( ')' )
            // InternalMyDsl.g:3069:2: ')'
            {
             before(grammarAccess.getSystemAccess().getRightParenthesisKeyword_9_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getRightParenthesisKeyword_9_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_9__4__Impl"


    // $ANTLR start "rule__System__Group_9_3__0"
    // InternalMyDsl.g:3079:1: rule__System__Group_9_3__0 : rule__System__Group_9_3__0__Impl rule__System__Group_9_3__1 ;
    public final void rule__System__Group_9_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3083:1: ( rule__System__Group_9_3__0__Impl rule__System__Group_9_3__1 )
            // InternalMyDsl.g:3084:2: rule__System__Group_9_3__0__Impl rule__System__Group_9_3__1
            {
            pushFollow(FOLLOW_9);
            rule__System__Group_9_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group_9_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_9_3__0"


    // $ANTLR start "rule__System__Group_9_3__0__Impl"
    // InternalMyDsl.g:3091:1: rule__System__Group_9_3__0__Impl : ( ',' ) ;
    public final void rule__System__Group_9_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3095:1: ( ( ',' ) )
            // InternalMyDsl.g:3096:1: ( ',' )
            {
            // InternalMyDsl.g:3096:1: ( ',' )
            // InternalMyDsl.g:3097:2: ','
            {
             before(grammarAccess.getSystemAccess().getCommaKeyword_9_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getCommaKeyword_9_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_9_3__0__Impl"


    // $ANTLR start "rule__System__Group_9_3__1"
    // InternalMyDsl.g:3106:1: rule__System__Group_9_3__1 : rule__System__Group_9_3__1__Impl ;
    public final void rule__System__Group_9_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3110:1: ( rule__System__Group_9_3__1__Impl )
            // InternalMyDsl.g:3111:2: rule__System__Group_9_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__System__Group_9_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_9_3__1"


    // $ANTLR start "rule__System__Group_9_3__1__Impl"
    // InternalMyDsl.g:3117:1: rule__System__Group_9_3__1__Impl : ( ( rule__System__ProvidedInterfacesAssignment_9_3_1 ) ) ;
    public final void rule__System__Group_9_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3121:1: ( ( ( rule__System__ProvidedInterfacesAssignment_9_3_1 ) ) )
            // InternalMyDsl.g:3122:1: ( ( rule__System__ProvidedInterfacesAssignment_9_3_1 ) )
            {
            // InternalMyDsl.g:3122:1: ( ( rule__System__ProvidedInterfacesAssignment_9_3_1 ) )
            // InternalMyDsl.g:3123:2: ( rule__System__ProvidedInterfacesAssignment_9_3_1 )
            {
             before(grammarAccess.getSystemAccess().getProvidedInterfacesAssignment_9_3_1()); 
            // InternalMyDsl.g:3124:2: ( rule__System__ProvidedInterfacesAssignment_9_3_1 )
            // InternalMyDsl.g:3124:3: rule__System__ProvidedInterfacesAssignment_9_3_1
            {
            pushFollow(FOLLOW_2);
            rule__System__ProvidedInterfacesAssignment_9_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getProvidedInterfacesAssignment_9_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group_9_3__1__Impl"


    // $ANTLR start "rule__AssemblyContext__Group__0"
    // InternalMyDsl.g:3133:1: rule__AssemblyContext__Group__0 : rule__AssemblyContext__Group__0__Impl rule__AssemblyContext__Group__1 ;
    public final void rule__AssemblyContext__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3137:1: ( rule__AssemblyContext__Group__0__Impl rule__AssemblyContext__Group__1 )
            // InternalMyDsl.g:3138:2: rule__AssemblyContext__Group__0__Impl rule__AssemblyContext__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:3145:1: rule__AssemblyContext__Group__0__Impl : ( 'AssemblyContext' ) ;
    public final void rule__AssemblyContext__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3149:1: ( ( 'AssemblyContext' ) )
            // InternalMyDsl.g:3150:1: ( 'AssemblyContext' )
            {
            // InternalMyDsl.g:3150:1: ( 'AssemblyContext' )
            // InternalMyDsl.g:3151:2: 'AssemblyContext'
            {
             before(grammarAccess.getAssemblyContextAccess().getAssemblyContextKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalMyDsl.g:3160:1: rule__AssemblyContext__Group__1 : rule__AssemblyContext__Group__1__Impl rule__AssemblyContext__Group__2 ;
    public final void rule__AssemblyContext__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3164:1: ( rule__AssemblyContext__Group__1__Impl rule__AssemblyContext__Group__2 )
            // InternalMyDsl.g:3165:2: rule__AssemblyContext__Group__1__Impl rule__AssemblyContext__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:3172:1: rule__AssemblyContext__Group__1__Impl : ( ( rule__AssemblyContext__NameAssignment_1 ) ) ;
    public final void rule__AssemblyContext__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3176:1: ( ( ( rule__AssemblyContext__NameAssignment_1 ) ) )
            // InternalMyDsl.g:3177:1: ( ( rule__AssemblyContext__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:3177:1: ( ( rule__AssemblyContext__NameAssignment_1 ) )
            // InternalMyDsl.g:3178:2: ( rule__AssemblyContext__NameAssignment_1 )
            {
             before(grammarAccess.getAssemblyContextAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:3179:2: ( rule__AssemblyContext__NameAssignment_1 )
            // InternalMyDsl.g:3179:3: rule__AssemblyContext__NameAssignment_1
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
    // InternalMyDsl.g:3187:1: rule__AssemblyContext__Group__2 : rule__AssemblyContext__Group__2__Impl rule__AssemblyContext__Group__3 ;
    public final void rule__AssemblyContext__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3191:1: ( rule__AssemblyContext__Group__2__Impl rule__AssemblyContext__Group__3 )
            // InternalMyDsl.g:3192:2: rule__AssemblyContext__Group__2__Impl rule__AssemblyContext__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:3199:1: rule__AssemblyContext__Group__2__Impl : ( '{' ) ;
    public final void rule__AssemblyContext__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3203:1: ( ( '{' ) )
            // InternalMyDsl.g:3204:1: ( '{' )
            {
            // InternalMyDsl.g:3204:1: ( '{' )
            // InternalMyDsl.g:3205:2: '{'
            {
             before(grammarAccess.getAssemblyContextAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
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
    // InternalMyDsl.g:3214:1: rule__AssemblyContext__Group__3 : rule__AssemblyContext__Group__3__Impl rule__AssemblyContext__Group__4 ;
    public final void rule__AssemblyContext__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3218:1: ( rule__AssemblyContext__Group__3__Impl rule__AssemblyContext__Group__4 )
            // InternalMyDsl.g:3219:2: rule__AssemblyContext__Group__3__Impl rule__AssemblyContext__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:3226:1: rule__AssemblyContext__Group__3__Impl : ( ( rule__AssemblyContext__Group_3__0 )? ) ;
    public final void rule__AssemblyContext__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3230:1: ( ( ( rule__AssemblyContext__Group_3__0 )? ) )
            // InternalMyDsl.g:3231:1: ( ( rule__AssemblyContext__Group_3__0 )? )
            {
            // InternalMyDsl.g:3231:1: ( ( rule__AssemblyContext__Group_3__0 )? )
            // InternalMyDsl.g:3232:2: ( rule__AssemblyContext__Group_3__0 )?
            {
             before(grammarAccess.getAssemblyContextAccess().getGroup_3()); 
            // InternalMyDsl.g:3233:2: ( rule__AssemblyContext__Group_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==32) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:3233:3: rule__AssemblyContext__Group_3__0
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
    // InternalMyDsl.g:3241:1: rule__AssemblyContext__Group__4 : rule__AssemblyContext__Group__4__Impl rule__AssemblyContext__Group__5 ;
    public final void rule__AssemblyContext__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3245:1: ( rule__AssemblyContext__Group__4__Impl rule__AssemblyContext__Group__5 )
            // InternalMyDsl.g:3246:2: rule__AssemblyContext__Group__4__Impl rule__AssemblyContext__Group__5
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:3253:1: rule__AssemblyContext__Group__4__Impl : ( ( rule__AssemblyContext__Group_4__0 )? ) ;
    public final void rule__AssemblyContext__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3257:1: ( ( ( rule__AssemblyContext__Group_4__0 )? ) )
            // InternalMyDsl.g:3258:1: ( ( rule__AssemblyContext__Group_4__0 )? )
            {
            // InternalMyDsl.g:3258:1: ( ( rule__AssemblyContext__Group_4__0 )? )
            // InternalMyDsl.g:3259:2: ( rule__AssemblyContext__Group_4__0 )?
            {
             before(grammarAccess.getAssemblyContextAccess().getGroup_4()); 
            // InternalMyDsl.g:3260:2: ( rule__AssemblyContext__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:3260:3: rule__AssemblyContext__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AssemblyContext__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssemblyContextAccess().getGroup_4()); 

            }


            }

        }
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
    // InternalMyDsl.g:3268:1: rule__AssemblyContext__Group__5 : rule__AssemblyContext__Group__5__Impl rule__AssemblyContext__Group__6 ;
    public final void rule__AssemblyContext__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3272:1: ( rule__AssemblyContext__Group__5__Impl rule__AssemblyContext__Group__6 )
            // InternalMyDsl.g:3273:2: rule__AssemblyContext__Group__5__Impl rule__AssemblyContext__Group__6
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:3280:1: rule__AssemblyContext__Group__5__Impl : ( ( rule__AssemblyContext__Group_5__0 )? ) ;
    public final void rule__AssemblyContext__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3284:1: ( ( ( rule__AssemblyContext__Group_5__0 )? ) )
            // InternalMyDsl.g:3285:1: ( ( rule__AssemblyContext__Group_5__0 )? )
            {
            // InternalMyDsl.g:3285:1: ( ( rule__AssemblyContext__Group_5__0 )? )
            // InternalMyDsl.g:3286:2: ( rule__AssemblyContext__Group_5__0 )?
            {
             before(grammarAccess.getAssemblyContextAccess().getGroup_5()); 
            // InternalMyDsl.g:3287:2: ( rule__AssemblyContext__Group_5__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==33) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:3287:3: rule__AssemblyContext__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AssemblyContext__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssemblyContextAccess().getGroup_5()); 

            }


            }

        }
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
    // InternalMyDsl.g:3295:1: rule__AssemblyContext__Group__6 : rule__AssemblyContext__Group__6__Impl rule__AssemblyContext__Group__7 ;
    public final void rule__AssemblyContext__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3299:1: ( rule__AssemblyContext__Group__6__Impl rule__AssemblyContext__Group__7 )
            // InternalMyDsl.g:3300:2: rule__AssemblyContext__Group__6__Impl rule__AssemblyContext__Group__7
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:3307:1: rule__AssemblyContext__Group__6__Impl : ( ( rule__AssemblyContext__Group_6__0 )? ) ;
    public final void rule__AssemblyContext__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3311:1: ( ( ( rule__AssemblyContext__Group_6__0 )? ) )
            // InternalMyDsl.g:3312:1: ( ( rule__AssemblyContext__Group_6__0 )? )
            {
            // InternalMyDsl.g:3312:1: ( ( rule__AssemblyContext__Group_6__0 )? )
            // InternalMyDsl.g:3313:2: ( rule__AssemblyContext__Group_6__0 )?
            {
             before(grammarAccess.getAssemblyContextAccess().getGroup_6()); 
            // InternalMyDsl.g:3314:2: ( rule__AssemblyContext__Group_6__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==34) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:3314:3: rule__AssemblyContext__Group_6__0
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
    // InternalMyDsl.g:3322:1: rule__AssemblyContext__Group__7 : rule__AssemblyContext__Group__7__Impl ;
    public final void rule__AssemblyContext__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3326:1: ( rule__AssemblyContext__Group__7__Impl )
            // InternalMyDsl.g:3327:2: rule__AssemblyContext__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group__7__Impl();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:3333:1: rule__AssemblyContext__Group__7__Impl : ( '}' ) ;
    public final void rule__AssemblyContext__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3337:1: ( ( '}' ) )
            // InternalMyDsl.g:3338:1: ( '}' )
            {
            // InternalMyDsl.g:3338:1: ( '}' )
            // InternalMyDsl.g:3339:2: '}'
            {
             before(grammarAccess.getAssemblyContextAccess().getRightCurlyBracketKeyword_7()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getAssemblyContextAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
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


    // $ANTLR start "rule__AssemblyContext__Group_3__0"
    // InternalMyDsl.g:3349:1: rule__AssemblyContext__Group_3__0 : rule__AssemblyContext__Group_3__0__Impl rule__AssemblyContext__Group_3__1 ;
    public final void rule__AssemblyContext__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3353:1: ( rule__AssemblyContext__Group_3__0__Impl rule__AssemblyContext__Group_3__1 )
            // InternalMyDsl.g:3354:2: rule__AssemblyContext__Group_3__0__Impl rule__AssemblyContext__Group_3__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:3361:1: rule__AssemblyContext__Group_3__0__Impl : ( 'requiredRole' ) ;
    public final void rule__AssemblyContext__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3365:1: ( ( 'requiredRole' ) )
            // InternalMyDsl.g:3366:1: ( 'requiredRole' )
            {
            // InternalMyDsl.g:3366:1: ( 'requiredRole' )
            // InternalMyDsl.g:3367:2: 'requiredRole'
            {
             before(grammarAccess.getAssemblyContextAccess().getRequiredRoleKeyword_3_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalMyDsl.g:3376:1: rule__AssemblyContext__Group_3__1 : rule__AssemblyContext__Group_3__1__Impl rule__AssemblyContext__Group_3__2 ;
    public final void rule__AssemblyContext__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3380:1: ( rule__AssemblyContext__Group_3__1__Impl rule__AssemblyContext__Group_3__2 )
            // InternalMyDsl.g:3381:2: rule__AssemblyContext__Group_3__1__Impl rule__AssemblyContext__Group_3__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:3388:1: rule__AssemblyContext__Group_3__1__Impl : ( '(' ) ;
    public final void rule__AssemblyContext__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3392:1: ( ( '(' ) )
            // InternalMyDsl.g:3393:1: ( '(' )
            {
            // InternalMyDsl.g:3393:1: ( '(' )
            // InternalMyDsl.g:3394:2: '('
            {
             before(grammarAccess.getAssemblyContextAccess().getLeftParenthesisKeyword_3_1()); 
            match(input,16,FOLLOW_2); 
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
    // InternalMyDsl.g:3403:1: rule__AssemblyContext__Group_3__2 : rule__AssemblyContext__Group_3__2__Impl rule__AssemblyContext__Group_3__3 ;
    public final void rule__AssemblyContext__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3407:1: ( rule__AssemblyContext__Group_3__2__Impl rule__AssemblyContext__Group_3__3 )
            // InternalMyDsl.g:3408:2: rule__AssemblyContext__Group_3__2__Impl rule__AssemblyContext__Group_3__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:3415:1: rule__AssemblyContext__Group_3__2__Impl : ( ( rule__AssemblyContext__RequiredRoleAssignment_3_2 ) ) ;
    public final void rule__AssemblyContext__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3419:1: ( ( ( rule__AssemblyContext__RequiredRoleAssignment_3_2 ) ) )
            // InternalMyDsl.g:3420:1: ( ( rule__AssemblyContext__RequiredRoleAssignment_3_2 ) )
            {
            // InternalMyDsl.g:3420:1: ( ( rule__AssemblyContext__RequiredRoleAssignment_3_2 ) )
            // InternalMyDsl.g:3421:2: ( rule__AssemblyContext__RequiredRoleAssignment_3_2 )
            {
             before(grammarAccess.getAssemblyContextAccess().getRequiredRoleAssignment_3_2()); 
            // InternalMyDsl.g:3422:2: ( rule__AssemblyContext__RequiredRoleAssignment_3_2 )
            // InternalMyDsl.g:3422:3: rule__AssemblyContext__RequiredRoleAssignment_3_2
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
    // InternalMyDsl.g:3430:1: rule__AssemblyContext__Group_3__3 : rule__AssemblyContext__Group_3__3__Impl rule__AssemblyContext__Group_3__4 ;
    public final void rule__AssemblyContext__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3434:1: ( rule__AssemblyContext__Group_3__3__Impl rule__AssemblyContext__Group_3__4 )
            // InternalMyDsl.g:3435:2: rule__AssemblyContext__Group_3__3__Impl rule__AssemblyContext__Group_3__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:3442:1: rule__AssemblyContext__Group_3__3__Impl : ( ( rule__AssemblyContext__Group_3_3__0 )* ) ;
    public final void rule__AssemblyContext__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3446:1: ( ( ( rule__AssemblyContext__Group_3_3__0 )* ) )
            // InternalMyDsl.g:3447:1: ( ( rule__AssemblyContext__Group_3_3__0 )* )
            {
            // InternalMyDsl.g:3447:1: ( ( rule__AssemblyContext__Group_3_3__0 )* )
            // InternalMyDsl.g:3448:2: ( rule__AssemblyContext__Group_3_3__0 )*
            {
             before(grammarAccess.getAssemblyContextAccess().getGroup_3_3()); 
            // InternalMyDsl.g:3449:2: ( rule__AssemblyContext__Group_3_3__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==19) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMyDsl.g:3449:3: rule__AssemblyContext__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__AssemblyContext__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalMyDsl.g:3457:1: rule__AssemblyContext__Group_3__4 : rule__AssemblyContext__Group_3__4__Impl ;
    public final void rule__AssemblyContext__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3461:1: ( rule__AssemblyContext__Group_3__4__Impl )
            // InternalMyDsl.g:3462:2: rule__AssemblyContext__Group_3__4__Impl
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
    // InternalMyDsl.g:3468:1: rule__AssemblyContext__Group_3__4__Impl : ( ')' ) ;
    public final void rule__AssemblyContext__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3472:1: ( ( ')' ) )
            // InternalMyDsl.g:3473:1: ( ')' )
            {
            // InternalMyDsl.g:3473:1: ( ')' )
            // InternalMyDsl.g:3474:2: ')'
            {
             before(grammarAccess.getAssemblyContextAccess().getRightParenthesisKeyword_3_4()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyDsl.g:3484:1: rule__AssemblyContext__Group_3_3__0 : rule__AssemblyContext__Group_3_3__0__Impl rule__AssemblyContext__Group_3_3__1 ;
    public final void rule__AssemblyContext__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3488:1: ( rule__AssemblyContext__Group_3_3__0__Impl rule__AssemblyContext__Group_3_3__1 )
            // InternalMyDsl.g:3489:2: rule__AssemblyContext__Group_3_3__0__Impl rule__AssemblyContext__Group_3_3__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:3496:1: rule__AssemblyContext__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__AssemblyContext__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3500:1: ( ( ',' ) )
            // InternalMyDsl.g:3501:1: ( ',' )
            {
            // InternalMyDsl.g:3501:1: ( ',' )
            // InternalMyDsl.g:3502:2: ','
            {
             before(grammarAccess.getAssemblyContextAccess().getCommaKeyword_3_3_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalMyDsl.g:3511:1: rule__AssemblyContext__Group_3_3__1 : rule__AssemblyContext__Group_3_3__1__Impl ;
    public final void rule__AssemblyContext__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3515:1: ( rule__AssemblyContext__Group_3_3__1__Impl )
            // InternalMyDsl.g:3516:2: rule__AssemblyContext__Group_3_3__1__Impl
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
    // InternalMyDsl.g:3522:1: rule__AssemblyContext__Group_3_3__1__Impl : ( ( rule__AssemblyContext__RequiredRoleAssignment_3_3_1 ) ) ;
    public final void rule__AssemblyContext__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3526:1: ( ( ( rule__AssemblyContext__RequiredRoleAssignment_3_3_1 ) ) )
            // InternalMyDsl.g:3527:1: ( ( rule__AssemblyContext__RequiredRoleAssignment_3_3_1 ) )
            {
            // InternalMyDsl.g:3527:1: ( ( rule__AssemblyContext__RequiredRoleAssignment_3_3_1 ) )
            // InternalMyDsl.g:3528:2: ( rule__AssemblyContext__RequiredRoleAssignment_3_3_1 )
            {
             before(grammarAccess.getAssemblyContextAccess().getRequiredRoleAssignment_3_3_1()); 
            // InternalMyDsl.g:3529:2: ( rule__AssemblyContext__RequiredRoleAssignment_3_3_1 )
            // InternalMyDsl.g:3529:3: rule__AssemblyContext__RequiredRoleAssignment_3_3_1
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


    // $ANTLR start "rule__AssemblyContext__Group_4__0"
    // InternalMyDsl.g:3538:1: rule__AssemblyContext__Group_4__0 : rule__AssemblyContext__Group_4__0__Impl rule__AssemblyContext__Group_4__1 ;
    public final void rule__AssemblyContext__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3542:1: ( rule__AssemblyContext__Group_4__0__Impl rule__AssemblyContext__Group_4__1 )
            // InternalMyDsl.g:3543:2: rule__AssemblyContext__Group_4__0__Impl rule__AssemblyContext__Group_4__1
            {
            pushFollow(FOLLOW_9);
            rule__AssemblyContext__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group_4__0"


    // $ANTLR start "rule__AssemblyContext__Group_4__0__Impl"
    // InternalMyDsl.g:3550:1: rule__AssemblyContext__Group_4__0__Impl : ( 'allocationContext' ) ;
    public final void rule__AssemblyContext__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3554:1: ( ( 'allocationContext' ) )
            // InternalMyDsl.g:3555:1: ( 'allocationContext' )
            {
            // InternalMyDsl.g:3555:1: ( 'allocationContext' )
            // InternalMyDsl.g:3556:2: 'allocationContext'
            {
             before(grammarAccess.getAssemblyContextAccess().getAllocationContextKeyword_4_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getAssemblyContextAccess().getAllocationContextKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group_4__0__Impl"


    // $ANTLR start "rule__AssemblyContext__Group_4__1"
    // InternalMyDsl.g:3565:1: rule__AssemblyContext__Group_4__1 : rule__AssemblyContext__Group_4__1__Impl ;
    public final void rule__AssemblyContext__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3569:1: ( rule__AssemblyContext__Group_4__1__Impl )
            // InternalMyDsl.g:3570:2: rule__AssemblyContext__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group_4__1"


    // $ANTLR start "rule__AssemblyContext__Group_4__1__Impl"
    // InternalMyDsl.g:3576:1: rule__AssemblyContext__Group_4__1__Impl : ( ( rule__AssemblyContext__AllocationContextAssignment_4_1 ) ) ;
    public final void rule__AssemblyContext__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3580:1: ( ( ( rule__AssemblyContext__AllocationContextAssignment_4_1 ) ) )
            // InternalMyDsl.g:3581:1: ( ( rule__AssemblyContext__AllocationContextAssignment_4_1 ) )
            {
            // InternalMyDsl.g:3581:1: ( ( rule__AssemblyContext__AllocationContextAssignment_4_1 ) )
            // InternalMyDsl.g:3582:2: ( rule__AssemblyContext__AllocationContextAssignment_4_1 )
            {
             before(grammarAccess.getAssemblyContextAccess().getAllocationContextAssignment_4_1()); 
            // InternalMyDsl.g:3583:2: ( rule__AssemblyContext__AllocationContextAssignment_4_1 )
            // InternalMyDsl.g:3583:3: rule__AssemblyContext__AllocationContextAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyContext__AllocationContextAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getAssemblyContextAccess().getAllocationContextAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group_4__1__Impl"


    // $ANTLR start "rule__AssemblyContext__Group_5__0"
    // InternalMyDsl.g:3592:1: rule__AssemblyContext__Group_5__0 : rule__AssemblyContext__Group_5__0__Impl rule__AssemblyContext__Group_5__1 ;
    public final void rule__AssemblyContext__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3596:1: ( rule__AssemblyContext__Group_5__0__Impl rule__AssemblyContext__Group_5__1 )
            // InternalMyDsl.g:3597:2: rule__AssemblyContext__Group_5__0__Impl rule__AssemblyContext__Group_5__1
            {
            pushFollow(FOLLOW_8);
            rule__AssemblyContext__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group_5__0"


    // $ANTLR start "rule__AssemblyContext__Group_5__0__Impl"
    // InternalMyDsl.g:3604:1: rule__AssemblyContext__Group_5__0__Impl : ( 'providedRole' ) ;
    public final void rule__AssemblyContext__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3608:1: ( ( 'providedRole' ) )
            // InternalMyDsl.g:3609:1: ( 'providedRole' )
            {
            // InternalMyDsl.g:3609:1: ( 'providedRole' )
            // InternalMyDsl.g:3610:2: 'providedRole'
            {
             before(grammarAccess.getAssemblyContextAccess().getProvidedRoleKeyword_5_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAssemblyContextAccess().getProvidedRoleKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group_5__0__Impl"


    // $ANTLR start "rule__AssemblyContext__Group_5__1"
    // InternalMyDsl.g:3619:1: rule__AssemblyContext__Group_5__1 : rule__AssemblyContext__Group_5__1__Impl rule__AssemblyContext__Group_5__2 ;
    public final void rule__AssemblyContext__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3623:1: ( rule__AssemblyContext__Group_5__1__Impl rule__AssemblyContext__Group_5__2 )
            // InternalMyDsl.g:3624:2: rule__AssemblyContext__Group_5__1__Impl rule__AssemblyContext__Group_5__2
            {
            pushFollow(FOLLOW_9);
            rule__AssemblyContext__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group_5__1"


    // $ANTLR start "rule__AssemblyContext__Group_5__1__Impl"
    // InternalMyDsl.g:3631:1: rule__AssemblyContext__Group_5__1__Impl : ( '(' ) ;
    public final void rule__AssemblyContext__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3635:1: ( ( '(' ) )
            // InternalMyDsl.g:3636:1: ( '(' )
            {
            // InternalMyDsl.g:3636:1: ( '(' )
            // InternalMyDsl.g:3637:2: '('
            {
             before(grammarAccess.getAssemblyContextAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getAssemblyContextAccess().getLeftParenthesisKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group_5__1__Impl"


    // $ANTLR start "rule__AssemblyContext__Group_5__2"
    // InternalMyDsl.g:3646:1: rule__AssemblyContext__Group_5__2 : rule__AssemblyContext__Group_5__2__Impl rule__AssemblyContext__Group_5__3 ;
    public final void rule__AssemblyContext__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3650:1: ( rule__AssemblyContext__Group_5__2__Impl rule__AssemblyContext__Group_5__3 )
            // InternalMyDsl.g:3651:2: rule__AssemblyContext__Group_5__2__Impl rule__AssemblyContext__Group_5__3
            {
            pushFollow(FOLLOW_10);
            rule__AssemblyContext__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group_5__2"


    // $ANTLR start "rule__AssemblyContext__Group_5__2__Impl"
    // InternalMyDsl.g:3658:1: rule__AssemblyContext__Group_5__2__Impl : ( ( rule__AssemblyContext__ProvidedRoleAssignment_5_2 ) ) ;
    public final void rule__AssemblyContext__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3662:1: ( ( ( rule__AssemblyContext__ProvidedRoleAssignment_5_2 ) ) )
            // InternalMyDsl.g:3663:1: ( ( rule__AssemblyContext__ProvidedRoleAssignment_5_2 ) )
            {
            // InternalMyDsl.g:3663:1: ( ( rule__AssemblyContext__ProvidedRoleAssignment_5_2 ) )
            // InternalMyDsl.g:3664:2: ( rule__AssemblyContext__ProvidedRoleAssignment_5_2 )
            {
             before(grammarAccess.getAssemblyContextAccess().getProvidedRoleAssignment_5_2()); 
            // InternalMyDsl.g:3665:2: ( rule__AssemblyContext__ProvidedRoleAssignment_5_2 )
            // InternalMyDsl.g:3665:3: rule__AssemblyContext__ProvidedRoleAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyContext__ProvidedRoleAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getAssemblyContextAccess().getProvidedRoleAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group_5__2__Impl"


    // $ANTLR start "rule__AssemblyContext__Group_5__3"
    // InternalMyDsl.g:3673:1: rule__AssemblyContext__Group_5__3 : rule__AssemblyContext__Group_5__3__Impl rule__AssemblyContext__Group_5__4 ;
    public final void rule__AssemblyContext__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3677:1: ( rule__AssemblyContext__Group_5__3__Impl rule__AssemblyContext__Group_5__4 )
            // InternalMyDsl.g:3678:2: rule__AssemblyContext__Group_5__3__Impl rule__AssemblyContext__Group_5__4
            {
            pushFollow(FOLLOW_10);
            rule__AssemblyContext__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group_5__3"


    // $ANTLR start "rule__AssemblyContext__Group_5__3__Impl"
    // InternalMyDsl.g:3685:1: rule__AssemblyContext__Group_5__3__Impl : ( ( rule__AssemblyContext__Group_5_3__0 )* ) ;
    public final void rule__AssemblyContext__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3689:1: ( ( ( rule__AssemblyContext__Group_5_3__0 )* ) )
            // InternalMyDsl.g:3690:1: ( ( rule__AssemblyContext__Group_5_3__0 )* )
            {
            // InternalMyDsl.g:3690:1: ( ( rule__AssemblyContext__Group_5_3__0 )* )
            // InternalMyDsl.g:3691:2: ( rule__AssemblyContext__Group_5_3__0 )*
            {
             before(grammarAccess.getAssemblyContextAccess().getGroup_5_3()); 
            // InternalMyDsl.g:3692:2: ( rule__AssemblyContext__Group_5_3__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==19) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMyDsl.g:3692:3: rule__AssemblyContext__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__AssemblyContext__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getAssemblyContextAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group_5__3__Impl"


    // $ANTLR start "rule__AssemblyContext__Group_5__4"
    // InternalMyDsl.g:3700:1: rule__AssemblyContext__Group_5__4 : rule__AssemblyContext__Group_5__4__Impl ;
    public final void rule__AssemblyContext__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3704:1: ( rule__AssemblyContext__Group_5__4__Impl )
            // InternalMyDsl.g:3705:2: rule__AssemblyContext__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group_5__4"


    // $ANTLR start "rule__AssemblyContext__Group_5__4__Impl"
    // InternalMyDsl.g:3711:1: rule__AssemblyContext__Group_5__4__Impl : ( ')' ) ;
    public final void rule__AssemblyContext__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3715:1: ( ( ')' ) )
            // InternalMyDsl.g:3716:1: ( ')' )
            {
            // InternalMyDsl.g:3716:1: ( ')' )
            // InternalMyDsl.g:3717:2: ')'
            {
             before(grammarAccess.getAssemblyContextAccess().getRightParenthesisKeyword_5_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAssemblyContextAccess().getRightParenthesisKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group_5__4__Impl"


    // $ANTLR start "rule__AssemblyContext__Group_5_3__0"
    // InternalMyDsl.g:3727:1: rule__AssemblyContext__Group_5_3__0 : rule__AssemblyContext__Group_5_3__0__Impl rule__AssemblyContext__Group_5_3__1 ;
    public final void rule__AssemblyContext__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3731:1: ( rule__AssemblyContext__Group_5_3__0__Impl rule__AssemblyContext__Group_5_3__1 )
            // InternalMyDsl.g:3732:2: rule__AssemblyContext__Group_5_3__0__Impl rule__AssemblyContext__Group_5_3__1
            {
            pushFollow(FOLLOW_9);
            rule__AssemblyContext__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group_5_3__0"


    // $ANTLR start "rule__AssemblyContext__Group_5_3__0__Impl"
    // InternalMyDsl.g:3739:1: rule__AssemblyContext__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__AssemblyContext__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3743:1: ( ( ',' ) )
            // InternalMyDsl.g:3744:1: ( ',' )
            {
            // InternalMyDsl.g:3744:1: ( ',' )
            // InternalMyDsl.g:3745:2: ','
            {
             before(grammarAccess.getAssemblyContextAccess().getCommaKeyword_5_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getAssemblyContextAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group_5_3__0__Impl"


    // $ANTLR start "rule__AssemblyContext__Group_5_3__1"
    // InternalMyDsl.g:3754:1: rule__AssemblyContext__Group_5_3__1 : rule__AssemblyContext__Group_5_3__1__Impl ;
    public final void rule__AssemblyContext__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3758:1: ( rule__AssemblyContext__Group_5_3__1__Impl )
            // InternalMyDsl.g:3759:2: rule__AssemblyContext__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyContext__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group_5_3__1"


    // $ANTLR start "rule__AssemblyContext__Group_5_3__1__Impl"
    // InternalMyDsl.g:3765:1: rule__AssemblyContext__Group_5_3__1__Impl : ( ( rule__AssemblyContext__ProvidedRoleAssignment_5_3_1 ) ) ;
    public final void rule__AssemblyContext__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3769:1: ( ( ( rule__AssemblyContext__ProvidedRoleAssignment_5_3_1 ) ) )
            // InternalMyDsl.g:3770:1: ( ( rule__AssemblyContext__ProvidedRoleAssignment_5_3_1 ) )
            {
            // InternalMyDsl.g:3770:1: ( ( rule__AssemblyContext__ProvidedRoleAssignment_5_3_1 ) )
            // InternalMyDsl.g:3771:2: ( rule__AssemblyContext__ProvidedRoleAssignment_5_3_1 )
            {
             before(grammarAccess.getAssemblyContextAccess().getProvidedRoleAssignment_5_3_1()); 
            // InternalMyDsl.g:3772:2: ( rule__AssemblyContext__ProvidedRoleAssignment_5_3_1 )
            // InternalMyDsl.g:3772:3: rule__AssemblyContext__ProvidedRoleAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyContext__ProvidedRoleAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAssemblyContextAccess().getProvidedRoleAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__Group_5_3__1__Impl"


    // $ANTLR start "rule__AssemblyContext__Group_6__0"
    // InternalMyDsl.g:3781:1: rule__AssemblyContext__Group_6__0 : rule__AssemblyContext__Group_6__0__Impl rule__AssemblyContext__Group_6__1 ;
    public final void rule__AssemblyContext__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3785:1: ( rule__AssemblyContext__Group_6__0__Impl rule__AssemblyContext__Group_6__1 )
            // InternalMyDsl.g:3786:2: rule__AssemblyContext__Group_6__0__Impl rule__AssemblyContext__Group_6__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:3793:1: rule__AssemblyContext__Group_6__0__Impl : ( 'component' ) ;
    public final void rule__AssemblyContext__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3797:1: ( ( 'component' ) )
            // InternalMyDsl.g:3798:1: ( 'component' )
            {
            // InternalMyDsl.g:3798:1: ( 'component' )
            // InternalMyDsl.g:3799:2: 'component'
            {
             before(grammarAccess.getAssemblyContextAccess().getComponentKeyword_6_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getAssemblyContextAccess().getComponentKeyword_6_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:3808:1: rule__AssemblyContext__Group_6__1 : rule__AssemblyContext__Group_6__1__Impl rule__AssemblyContext__Group_6__2 ;
    public final void rule__AssemblyContext__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3812:1: ( rule__AssemblyContext__Group_6__1__Impl rule__AssemblyContext__Group_6__2 )
            // InternalMyDsl.g:3813:2: rule__AssemblyContext__Group_6__1__Impl rule__AssemblyContext__Group_6__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:3820:1: rule__AssemblyContext__Group_6__1__Impl : ( '(' ) ;
    public final void rule__AssemblyContext__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3824:1: ( ( '(' ) )
            // InternalMyDsl.g:3825:1: ( '(' )
            {
            // InternalMyDsl.g:3825:1: ( '(' )
            // InternalMyDsl.g:3826:2: '('
            {
             before(grammarAccess.getAssemblyContextAccess().getLeftParenthesisKeyword_6_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getAssemblyContextAccess().getLeftParenthesisKeyword_6_1()); 

            }


            }

        }
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
    // InternalMyDsl.g:3835:1: rule__AssemblyContext__Group_6__2 : rule__AssemblyContext__Group_6__2__Impl rule__AssemblyContext__Group_6__3 ;
    public final void rule__AssemblyContext__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3839:1: ( rule__AssemblyContext__Group_6__2__Impl rule__AssemblyContext__Group_6__3 )
            // InternalMyDsl.g:3840:2: rule__AssemblyContext__Group_6__2__Impl rule__AssemblyContext__Group_6__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:3847:1: rule__AssemblyContext__Group_6__2__Impl : ( ( rule__AssemblyContext__ComponentAssignment_6_2 ) ) ;
    public final void rule__AssemblyContext__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3851:1: ( ( ( rule__AssemblyContext__ComponentAssignment_6_2 ) ) )
            // InternalMyDsl.g:3852:1: ( ( rule__AssemblyContext__ComponentAssignment_6_2 ) )
            {
            // InternalMyDsl.g:3852:1: ( ( rule__AssemblyContext__ComponentAssignment_6_2 ) )
            // InternalMyDsl.g:3853:2: ( rule__AssemblyContext__ComponentAssignment_6_2 )
            {
             before(grammarAccess.getAssemblyContextAccess().getComponentAssignment_6_2()); 
            // InternalMyDsl.g:3854:2: ( rule__AssemblyContext__ComponentAssignment_6_2 )
            // InternalMyDsl.g:3854:3: rule__AssemblyContext__ComponentAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyContext__ComponentAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getAssemblyContextAccess().getComponentAssignment_6_2()); 

            }


            }

        }
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
    // InternalMyDsl.g:3862:1: rule__AssemblyContext__Group_6__3 : rule__AssemblyContext__Group_6__3__Impl rule__AssemblyContext__Group_6__4 ;
    public final void rule__AssemblyContext__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3866:1: ( rule__AssemblyContext__Group_6__3__Impl rule__AssemblyContext__Group_6__4 )
            // InternalMyDsl.g:3867:2: rule__AssemblyContext__Group_6__3__Impl rule__AssemblyContext__Group_6__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:3874:1: rule__AssemblyContext__Group_6__3__Impl : ( ( rule__AssemblyContext__Group_6_3__0 )* ) ;
    public final void rule__AssemblyContext__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3878:1: ( ( ( rule__AssemblyContext__Group_6_3__0 )* ) )
            // InternalMyDsl.g:3879:1: ( ( rule__AssemblyContext__Group_6_3__0 )* )
            {
            // InternalMyDsl.g:3879:1: ( ( rule__AssemblyContext__Group_6_3__0 )* )
            // InternalMyDsl.g:3880:2: ( rule__AssemblyContext__Group_6_3__0 )*
            {
             before(grammarAccess.getAssemblyContextAccess().getGroup_6_3()); 
            // InternalMyDsl.g:3881:2: ( rule__AssemblyContext__Group_6_3__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==19) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalMyDsl.g:3881:3: rule__AssemblyContext__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__AssemblyContext__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalMyDsl.g:3889:1: rule__AssemblyContext__Group_6__4 : rule__AssemblyContext__Group_6__4__Impl ;
    public final void rule__AssemblyContext__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3893:1: ( rule__AssemblyContext__Group_6__4__Impl )
            // InternalMyDsl.g:3894:2: rule__AssemblyContext__Group_6__4__Impl
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
    // InternalMyDsl.g:3900:1: rule__AssemblyContext__Group_6__4__Impl : ( ')' ) ;
    public final void rule__AssemblyContext__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3904:1: ( ( ')' ) )
            // InternalMyDsl.g:3905:1: ( ')' )
            {
            // InternalMyDsl.g:3905:1: ( ')' )
            // InternalMyDsl.g:3906:2: ')'
            {
             before(grammarAccess.getAssemblyContextAccess().getRightParenthesisKeyword_6_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAssemblyContextAccess().getRightParenthesisKeyword_6_4()); 

            }


            }

        }
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
    // InternalMyDsl.g:3916:1: rule__AssemblyContext__Group_6_3__0 : rule__AssemblyContext__Group_6_3__0__Impl rule__AssemblyContext__Group_6_3__1 ;
    public final void rule__AssemblyContext__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3920:1: ( rule__AssemblyContext__Group_6_3__0__Impl rule__AssemblyContext__Group_6_3__1 )
            // InternalMyDsl.g:3921:2: rule__AssemblyContext__Group_6_3__0__Impl rule__AssemblyContext__Group_6_3__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:3928:1: rule__AssemblyContext__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__AssemblyContext__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3932:1: ( ( ',' ) )
            // InternalMyDsl.g:3933:1: ( ',' )
            {
            // InternalMyDsl.g:3933:1: ( ',' )
            // InternalMyDsl.g:3934:2: ','
            {
             before(grammarAccess.getAssemblyContextAccess().getCommaKeyword_6_3_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalMyDsl.g:3943:1: rule__AssemblyContext__Group_6_3__1 : rule__AssemblyContext__Group_6_3__1__Impl ;
    public final void rule__AssemblyContext__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3947:1: ( rule__AssemblyContext__Group_6_3__1__Impl )
            // InternalMyDsl.g:3948:2: rule__AssemblyContext__Group_6_3__1__Impl
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
    // InternalMyDsl.g:3954:1: rule__AssemblyContext__Group_6_3__1__Impl : ( ( rule__AssemblyContext__ComponentAssignment_6_3_1 ) ) ;
    public final void rule__AssemblyContext__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3958:1: ( ( ( rule__AssemblyContext__ComponentAssignment_6_3_1 ) ) )
            // InternalMyDsl.g:3959:1: ( ( rule__AssemblyContext__ComponentAssignment_6_3_1 ) )
            {
            // InternalMyDsl.g:3959:1: ( ( rule__AssemblyContext__ComponentAssignment_6_3_1 ) )
            // InternalMyDsl.g:3960:2: ( rule__AssemblyContext__ComponentAssignment_6_3_1 )
            {
             before(grammarAccess.getAssemblyContextAccess().getComponentAssignment_6_3_1()); 
            // InternalMyDsl.g:3961:2: ( rule__AssemblyContext__ComponentAssignment_6_3_1 )
            // InternalMyDsl.g:3961:3: rule__AssemblyContext__ComponentAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__AssemblyContext__ComponentAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAssemblyContextAccess().getComponentAssignment_6_3_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Link__Group__0"
    // InternalMyDsl.g:3970:1: rule__Link__Group__0 : rule__Link__Group__0__Impl rule__Link__Group__1 ;
    public final void rule__Link__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3974:1: ( rule__Link__Group__0__Impl rule__Link__Group__1 )
            // InternalMyDsl.g:3975:2: rule__Link__Group__0__Impl rule__Link__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Link__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__0"


    // $ANTLR start "rule__Link__Group__0__Impl"
    // InternalMyDsl.g:3982:1: rule__Link__Group__0__Impl : ( 'Link' ) ;
    public final void rule__Link__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3986:1: ( ( 'Link' ) )
            // InternalMyDsl.g:3987:1: ( 'Link' )
            {
            // InternalMyDsl.g:3987:1: ( 'Link' )
            // InternalMyDsl.g:3988:2: 'Link'
            {
             before(grammarAccess.getLinkAccess().getLinkKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getLinkKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__0__Impl"


    // $ANTLR start "rule__Link__Group__1"
    // InternalMyDsl.g:3997:1: rule__Link__Group__1 : rule__Link__Group__1__Impl rule__Link__Group__2 ;
    public final void rule__Link__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4001:1: ( rule__Link__Group__1__Impl rule__Link__Group__2 )
            // InternalMyDsl.g:4002:2: rule__Link__Group__1__Impl rule__Link__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Link__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__1"


    // $ANTLR start "rule__Link__Group__1__Impl"
    // InternalMyDsl.g:4009:1: rule__Link__Group__1__Impl : ( ( rule__Link__NameAssignment_1 ) ) ;
    public final void rule__Link__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4013:1: ( ( ( rule__Link__NameAssignment_1 ) ) )
            // InternalMyDsl.g:4014:1: ( ( rule__Link__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:4014:1: ( ( rule__Link__NameAssignment_1 ) )
            // InternalMyDsl.g:4015:2: ( rule__Link__NameAssignment_1 )
            {
             before(grammarAccess.getLinkAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:4016:2: ( rule__Link__NameAssignment_1 )
            // InternalMyDsl.g:4016:3: rule__Link__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Link__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__1__Impl"


    // $ANTLR start "rule__Link__Group__2"
    // InternalMyDsl.g:4024:1: rule__Link__Group__2 : rule__Link__Group__2__Impl rule__Link__Group__3 ;
    public final void rule__Link__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4028:1: ( rule__Link__Group__2__Impl rule__Link__Group__3 )
            // InternalMyDsl.g:4029:2: rule__Link__Group__2__Impl rule__Link__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__Link__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__2"


    // $ANTLR start "rule__Link__Group__2__Impl"
    // InternalMyDsl.g:4036:1: rule__Link__Group__2__Impl : ( '{' ) ;
    public final void rule__Link__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4040:1: ( ( '{' ) )
            // InternalMyDsl.g:4041:1: ( '{' )
            {
            // InternalMyDsl.g:4041:1: ( '{' )
            // InternalMyDsl.g:4042:2: '{'
            {
             before(grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__2__Impl"


    // $ANTLR start "rule__Link__Group__3"
    // InternalMyDsl.g:4051:1: rule__Link__Group__3 : rule__Link__Group__3__Impl rule__Link__Group__4 ;
    public final void rule__Link__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4055:1: ( rule__Link__Group__3__Impl rule__Link__Group__4 )
            // InternalMyDsl.g:4056:2: rule__Link__Group__3__Impl rule__Link__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Link__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__3"


    // $ANTLR start "rule__Link__Group__3__Impl"
    // InternalMyDsl.g:4063:1: rule__Link__Group__3__Impl : ( 'linkedContainers' ) ;
    public final void rule__Link__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4067:1: ( ( 'linkedContainers' ) )
            // InternalMyDsl.g:4068:1: ( 'linkedContainers' )
            {
            // InternalMyDsl.g:4068:1: ( 'linkedContainers' )
            // InternalMyDsl.g:4069:2: 'linkedContainers'
            {
             before(grammarAccess.getLinkAccess().getLinkedContainersKeyword_3()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getLinkedContainersKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__3__Impl"


    // $ANTLR start "rule__Link__Group__4"
    // InternalMyDsl.g:4078:1: rule__Link__Group__4 : rule__Link__Group__4__Impl rule__Link__Group__5 ;
    public final void rule__Link__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4082:1: ( rule__Link__Group__4__Impl rule__Link__Group__5 )
            // InternalMyDsl.g:4083:2: rule__Link__Group__4__Impl rule__Link__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__Link__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__4"


    // $ANTLR start "rule__Link__Group__4__Impl"
    // InternalMyDsl.g:4090:1: rule__Link__Group__4__Impl : ( '(' ) ;
    public final void rule__Link__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4094:1: ( ( '(' ) )
            // InternalMyDsl.g:4095:1: ( '(' )
            {
            // InternalMyDsl.g:4095:1: ( '(' )
            // InternalMyDsl.g:4096:2: '('
            {
             before(grammarAccess.getLinkAccess().getLeftParenthesisKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getLeftParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__4__Impl"


    // $ANTLR start "rule__Link__Group__5"
    // InternalMyDsl.g:4105:1: rule__Link__Group__5 : rule__Link__Group__5__Impl rule__Link__Group__6 ;
    public final void rule__Link__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4109:1: ( rule__Link__Group__5__Impl rule__Link__Group__6 )
            // InternalMyDsl.g:4110:2: rule__Link__Group__5__Impl rule__Link__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__Link__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__5"


    // $ANTLR start "rule__Link__Group__5__Impl"
    // InternalMyDsl.g:4117:1: rule__Link__Group__5__Impl : ( ( rule__Link__LinkedContainersAssignment_5 ) ) ;
    public final void rule__Link__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4121:1: ( ( ( rule__Link__LinkedContainersAssignment_5 ) ) )
            // InternalMyDsl.g:4122:1: ( ( rule__Link__LinkedContainersAssignment_5 ) )
            {
            // InternalMyDsl.g:4122:1: ( ( rule__Link__LinkedContainersAssignment_5 ) )
            // InternalMyDsl.g:4123:2: ( rule__Link__LinkedContainersAssignment_5 )
            {
             before(grammarAccess.getLinkAccess().getLinkedContainersAssignment_5()); 
            // InternalMyDsl.g:4124:2: ( rule__Link__LinkedContainersAssignment_5 )
            // InternalMyDsl.g:4124:3: rule__Link__LinkedContainersAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Link__LinkedContainersAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getLinkedContainersAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__5__Impl"


    // $ANTLR start "rule__Link__Group__6"
    // InternalMyDsl.g:4132:1: rule__Link__Group__6 : rule__Link__Group__6__Impl rule__Link__Group__7 ;
    public final void rule__Link__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4136:1: ( rule__Link__Group__6__Impl rule__Link__Group__7 )
            // InternalMyDsl.g:4137:2: rule__Link__Group__6__Impl rule__Link__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__Link__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__6"


    // $ANTLR start "rule__Link__Group__6__Impl"
    // InternalMyDsl.g:4144:1: rule__Link__Group__6__Impl : ( ( rule__Link__Group_6__0 )* ) ;
    public final void rule__Link__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4148:1: ( ( ( rule__Link__Group_6__0 )* ) )
            // InternalMyDsl.g:4149:1: ( ( rule__Link__Group_6__0 )* )
            {
            // InternalMyDsl.g:4149:1: ( ( rule__Link__Group_6__0 )* )
            // InternalMyDsl.g:4150:2: ( rule__Link__Group_6__0 )*
            {
             before(grammarAccess.getLinkAccess().getGroup_6()); 
            // InternalMyDsl.g:4151:2: ( rule__Link__Group_6__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==19) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalMyDsl.g:4151:3: rule__Link__Group_6__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Link__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getLinkAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__6__Impl"


    // $ANTLR start "rule__Link__Group__7"
    // InternalMyDsl.g:4159:1: rule__Link__Group__7 : rule__Link__Group__7__Impl rule__Link__Group__8 ;
    public final void rule__Link__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4163:1: ( rule__Link__Group__7__Impl rule__Link__Group__8 )
            // InternalMyDsl.g:4164:2: rule__Link__Group__7__Impl rule__Link__Group__8
            {
            pushFollow(FOLLOW_16);
            rule__Link__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__7"


    // $ANTLR start "rule__Link__Group__7__Impl"
    // InternalMyDsl.g:4171:1: rule__Link__Group__7__Impl : ( ')' ) ;
    public final void rule__Link__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4175:1: ( ( ')' ) )
            // InternalMyDsl.g:4176:1: ( ')' )
            {
            // InternalMyDsl.g:4176:1: ( ')' )
            // InternalMyDsl.g:4177:2: ')'
            {
             before(grammarAccess.getLinkAccess().getRightParenthesisKeyword_7()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__7__Impl"


    // $ANTLR start "rule__Link__Group__8"
    // InternalMyDsl.g:4186:1: rule__Link__Group__8 : rule__Link__Group__8__Impl ;
    public final void rule__Link__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4190:1: ( rule__Link__Group__8__Impl )
            // InternalMyDsl.g:4191:2: rule__Link__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__8"


    // $ANTLR start "rule__Link__Group__8__Impl"
    // InternalMyDsl.g:4197:1: rule__Link__Group__8__Impl : ( '}' ) ;
    public final void rule__Link__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4201:1: ( ( '}' ) )
            // InternalMyDsl.g:4202:1: ( '}' )
            {
            // InternalMyDsl.g:4202:1: ( '}' )
            // InternalMyDsl.g:4203:2: '}'
            {
             before(grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_8()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__8__Impl"


    // $ANTLR start "rule__Link__Group_6__0"
    // InternalMyDsl.g:4213:1: rule__Link__Group_6__0 : rule__Link__Group_6__0__Impl rule__Link__Group_6__1 ;
    public final void rule__Link__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4217:1: ( rule__Link__Group_6__0__Impl rule__Link__Group_6__1 )
            // InternalMyDsl.g:4218:2: rule__Link__Group_6__0__Impl rule__Link__Group_6__1
            {
            pushFollow(FOLLOW_9);
            rule__Link__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_6__0"


    // $ANTLR start "rule__Link__Group_6__0__Impl"
    // InternalMyDsl.g:4225:1: rule__Link__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Link__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4229:1: ( ( ',' ) )
            // InternalMyDsl.g:4230:1: ( ',' )
            {
            // InternalMyDsl.g:4230:1: ( ',' )
            // InternalMyDsl.g:4231:2: ','
            {
             before(grammarAccess.getLinkAccess().getCommaKeyword_6_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_6__0__Impl"


    // $ANTLR start "rule__Link__Group_6__1"
    // InternalMyDsl.g:4240:1: rule__Link__Group_6__1 : rule__Link__Group_6__1__Impl ;
    public final void rule__Link__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4244:1: ( rule__Link__Group_6__1__Impl )
            // InternalMyDsl.g:4245:2: rule__Link__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_6__1"


    // $ANTLR start "rule__Link__Group_6__1__Impl"
    // InternalMyDsl.g:4251:1: rule__Link__Group_6__1__Impl : ( ( rule__Link__LinkedContainersAssignment_6_1 ) ) ;
    public final void rule__Link__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4255:1: ( ( ( rule__Link__LinkedContainersAssignment_6_1 ) ) )
            // InternalMyDsl.g:4256:1: ( ( rule__Link__LinkedContainersAssignment_6_1 ) )
            {
            // InternalMyDsl.g:4256:1: ( ( rule__Link__LinkedContainersAssignment_6_1 ) )
            // InternalMyDsl.g:4257:2: ( rule__Link__LinkedContainersAssignment_6_1 )
            {
             before(grammarAccess.getLinkAccess().getLinkedContainersAssignment_6_1()); 
            // InternalMyDsl.g:4258:2: ( rule__Link__LinkedContainersAssignment_6_1 )
            // InternalMyDsl.g:4258:3: rule__Link__LinkedContainersAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Link__LinkedContainersAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getLinkedContainersAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group_6__1__Impl"


    // $ANTLR start "rule__Component_Impl__Group__0"
    // InternalMyDsl.g:4267:1: rule__Component_Impl__Group__0 : rule__Component_Impl__Group__0__Impl rule__Component_Impl__Group__1 ;
    public final void rule__Component_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4271:1: ( rule__Component_Impl__Group__0__Impl rule__Component_Impl__Group__1 )
            // InternalMyDsl.g:4272:2: rule__Component_Impl__Group__0__Impl rule__Component_Impl__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:4279:1: rule__Component_Impl__Group__0__Impl : ( 'Component' ) ;
    public final void rule__Component_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4283:1: ( ( 'Component' ) )
            // InternalMyDsl.g:4284:1: ( 'Component' )
            {
            // InternalMyDsl.g:4284:1: ( 'Component' )
            // InternalMyDsl.g:4285:2: 'Component'
            {
             before(grammarAccess.getComponent_ImplAccess().getComponentKeyword_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalMyDsl.g:4294:1: rule__Component_Impl__Group__1 : rule__Component_Impl__Group__1__Impl rule__Component_Impl__Group__2 ;
    public final void rule__Component_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4298:1: ( rule__Component_Impl__Group__1__Impl rule__Component_Impl__Group__2 )
            // InternalMyDsl.g:4299:2: rule__Component_Impl__Group__1__Impl rule__Component_Impl__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:4306:1: rule__Component_Impl__Group__1__Impl : ( ( rule__Component_Impl__NameAssignment_1 ) ) ;
    public final void rule__Component_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4310:1: ( ( ( rule__Component_Impl__NameAssignment_1 ) ) )
            // InternalMyDsl.g:4311:1: ( ( rule__Component_Impl__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:4311:1: ( ( rule__Component_Impl__NameAssignment_1 ) )
            // InternalMyDsl.g:4312:2: ( rule__Component_Impl__NameAssignment_1 )
            {
             before(grammarAccess.getComponent_ImplAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:4313:2: ( rule__Component_Impl__NameAssignment_1 )
            // InternalMyDsl.g:4313:3: rule__Component_Impl__NameAssignment_1
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
    // InternalMyDsl.g:4321:1: rule__Component_Impl__Group__2 : rule__Component_Impl__Group__2__Impl rule__Component_Impl__Group__3 ;
    public final void rule__Component_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4325:1: ( rule__Component_Impl__Group__2__Impl rule__Component_Impl__Group__3 )
            // InternalMyDsl.g:4326:2: rule__Component_Impl__Group__2__Impl rule__Component_Impl__Group__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyDsl.g:4333:1: rule__Component_Impl__Group__2__Impl : ( '{' ) ;
    public final void rule__Component_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4337:1: ( ( '{' ) )
            // InternalMyDsl.g:4338:1: ( '{' )
            {
            // InternalMyDsl.g:4338:1: ( '{' )
            // InternalMyDsl.g:4339:2: '{'
            {
             before(grammarAccess.getComponent_ImplAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
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
    // InternalMyDsl.g:4348:1: rule__Component_Impl__Group__3 : rule__Component_Impl__Group__3__Impl rule__Component_Impl__Group__4 ;
    public final void rule__Component_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4352:1: ( rule__Component_Impl__Group__3__Impl rule__Component_Impl__Group__4 )
            // InternalMyDsl.g:4353:2: rule__Component_Impl__Group__3__Impl rule__Component_Impl__Group__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyDsl.g:4360:1: rule__Component_Impl__Group__3__Impl : ( ( rule__Component_Impl__Group_3__0 )? ) ;
    public final void rule__Component_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4364:1: ( ( ( rule__Component_Impl__Group_3__0 )? ) )
            // InternalMyDsl.g:4365:1: ( ( rule__Component_Impl__Group_3__0 )? )
            {
            // InternalMyDsl.g:4365:1: ( ( rule__Component_Impl__Group_3__0 )? )
            // InternalMyDsl.g:4366:2: ( rule__Component_Impl__Group_3__0 )?
            {
             before(grammarAccess.getComponent_ImplAccess().getGroup_3()); 
            // InternalMyDsl.g:4367:2: ( rule__Component_Impl__Group_3__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==38) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyDsl.g:4367:3: rule__Component_Impl__Group_3__0
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
    // InternalMyDsl.g:4375:1: rule__Component_Impl__Group__4 : rule__Component_Impl__Group__4__Impl rule__Component_Impl__Group__5 ;
    public final void rule__Component_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4379:1: ( rule__Component_Impl__Group__4__Impl rule__Component_Impl__Group__5 )
            // InternalMyDsl.g:4380:2: rule__Component_Impl__Group__4__Impl rule__Component_Impl__Group__5
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyDsl.g:4387:1: rule__Component_Impl__Group__4__Impl : ( ( rule__Component_Impl__Group_4__0 )? ) ;
    public final void rule__Component_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4391:1: ( ( ( rule__Component_Impl__Group_4__0 )? ) )
            // InternalMyDsl.g:4392:1: ( ( rule__Component_Impl__Group_4__0 )? )
            {
            // InternalMyDsl.g:4392:1: ( ( rule__Component_Impl__Group_4__0 )? )
            // InternalMyDsl.g:4393:2: ( rule__Component_Impl__Group_4__0 )?
            {
             before(grammarAccess.getComponent_ImplAccess().getGroup_4()); 
            // InternalMyDsl.g:4394:2: ( rule__Component_Impl__Group_4__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==39) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:4394:3: rule__Component_Impl__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component_Impl__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponent_ImplAccess().getGroup_4()); 

            }


            }

        }
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
    // InternalMyDsl.g:4402:1: rule__Component_Impl__Group__5 : rule__Component_Impl__Group__5__Impl rule__Component_Impl__Group__6 ;
    public final void rule__Component_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4406:1: ( rule__Component_Impl__Group__5__Impl rule__Component_Impl__Group__6 )
            // InternalMyDsl.g:4407:2: rule__Component_Impl__Group__5__Impl rule__Component_Impl__Group__6
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyDsl.g:4414:1: rule__Component_Impl__Group__5__Impl : ( ( rule__Component_Impl__Group_5__0 )? ) ;
    public final void rule__Component_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4418:1: ( ( ( rule__Component_Impl__Group_5__0 )? ) )
            // InternalMyDsl.g:4419:1: ( ( rule__Component_Impl__Group_5__0 )? )
            {
            // InternalMyDsl.g:4419:1: ( ( rule__Component_Impl__Group_5__0 )? )
            // InternalMyDsl.g:4420:2: ( rule__Component_Impl__Group_5__0 )?
            {
             before(grammarAccess.getComponent_ImplAccess().getGroup_5()); 
            // InternalMyDsl.g:4421:2: ( rule__Component_Impl__Group_5__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==40) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyDsl.g:4421:3: rule__Component_Impl__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component_Impl__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponent_ImplAccess().getGroup_5()); 

            }


            }

        }
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
    // InternalMyDsl.g:4429:1: rule__Component_Impl__Group__6 : rule__Component_Impl__Group__6__Impl rule__Component_Impl__Group__7 ;
    public final void rule__Component_Impl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4433:1: ( rule__Component_Impl__Group__6__Impl rule__Component_Impl__Group__7 )
            // InternalMyDsl.g:4434:2: rule__Component_Impl__Group__6__Impl rule__Component_Impl__Group__7
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyDsl.g:4441:1: rule__Component_Impl__Group__6__Impl : ( ( rule__Component_Impl__Group_6__0 )? ) ;
    public final void rule__Component_Impl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4445:1: ( ( ( rule__Component_Impl__Group_6__0 )? ) )
            // InternalMyDsl.g:4446:1: ( ( rule__Component_Impl__Group_6__0 )? )
            {
            // InternalMyDsl.g:4446:1: ( ( rule__Component_Impl__Group_6__0 )? )
            // InternalMyDsl.g:4447:2: ( rule__Component_Impl__Group_6__0 )?
            {
             before(grammarAccess.getComponent_ImplAccess().getGroup_6()); 
            // InternalMyDsl.g:4448:2: ( rule__Component_Impl__Group_6__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==41) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMyDsl.g:4448:3: rule__Component_Impl__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component_Impl__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponent_ImplAccess().getGroup_6()); 

            }


            }

        }
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
    // InternalMyDsl.g:4456:1: rule__Component_Impl__Group__7 : rule__Component_Impl__Group__7__Impl rule__Component_Impl__Group__8 ;
    public final void rule__Component_Impl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4460:1: ( rule__Component_Impl__Group__7__Impl rule__Component_Impl__Group__8 )
            // InternalMyDsl.g:4461:2: rule__Component_Impl__Group__7__Impl rule__Component_Impl__Group__8
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyDsl.g:4468:1: rule__Component_Impl__Group__7__Impl : ( ( rule__Component_Impl__Group_7__0 )? ) ;
    public final void rule__Component_Impl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4472:1: ( ( ( rule__Component_Impl__Group_7__0 )? ) )
            // InternalMyDsl.g:4473:1: ( ( rule__Component_Impl__Group_7__0 )? )
            {
            // InternalMyDsl.g:4473:1: ( ( rule__Component_Impl__Group_7__0 )? )
            // InternalMyDsl.g:4474:2: ( rule__Component_Impl__Group_7__0 )?
            {
             before(grammarAccess.getComponent_ImplAccess().getGroup_7()); 
            // InternalMyDsl.g:4475:2: ( rule__Component_Impl__Group_7__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==42) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMyDsl.g:4475:3: rule__Component_Impl__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component_Impl__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

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
    // InternalMyDsl.g:4483:1: rule__Component_Impl__Group__8 : rule__Component_Impl__Group__8__Impl ;
    public final void rule__Component_Impl__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4487:1: ( rule__Component_Impl__Group__8__Impl )
            // InternalMyDsl.g:4488:2: rule__Component_Impl__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group__8__Impl();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:4494:1: rule__Component_Impl__Group__8__Impl : ( '}' ) ;
    public final void rule__Component_Impl__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4498:1: ( ( '}' ) )
            // InternalMyDsl.g:4499:1: ( '}' )
            {
            // InternalMyDsl.g:4499:1: ( '}' )
            // InternalMyDsl.g:4500:2: '}'
            {
             before(grammarAccess.getComponent_ImplAccess().getRightCurlyBracketKeyword_8()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getComponent_ImplAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
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


    // $ANTLR start "rule__Component_Impl__Group_3__0"
    // InternalMyDsl.g:4510:1: rule__Component_Impl__Group_3__0 : rule__Component_Impl__Group_3__0__Impl rule__Component_Impl__Group_3__1 ;
    public final void rule__Component_Impl__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4514:1: ( rule__Component_Impl__Group_3__0__Impl rule__Component_Impl__Group_3__1 )
            // InternalMyDsl.g:4515:2: rule__Component_Impl__Group_3__0__Impl rule__Component_Impl__Group_3__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:4522:1: rule__Component_Impl__Group_3__0__Impl : ( 'requiredInterface' ) ;
    public final void rule__Component_Impl__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4526:1: ( ( 'requiredInterface' ) )
            // InternalMyDsl.g:4527:1: ( 'requiredInterface' )
            {
            // InternalMyDsl.g:4527:1: ( 'requiredInterface' )
            // InternalMyDsl.g:4528:2: 'requiredInterface'
            {
             before(grammarAccess.getComponent_ImplAccess().getRequiredInterfaceKeyword_3_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalMyDsl.g:4537:1: rule__Component_Impl__Group_3__1 : rule__Component_Impl__Group_3__1__Impl rule__Component_Impl__Group_3__2 ;
    public final void rule__Component_Impl__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4541:1: ( rule__Component_Impl__Group_3__1__Impl rule__Component_Impl__Group_3__2 )
            // InternalMyDsl.g:4542:2: rule__Component_Impl__Group_3__1__Impl rule__Component_Impl__Group_3__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:4549:1: rule__Component_Impl__Group_3__1__Impl : ( '(' ) ;
    public final void rule__Component_Impl__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4553:1: ( ( '(' ) )
            // InternalMyDsl.g:4554:1: ( '(' )
            {
            // InternalMyDsl.g:4554:1: ( '(' )
            // InternalMyDsl.g:4555:2: '('
            {
             before(grammarAccess.getComponent_ImplAccess().getLeftParenthesisKeyword_3_1()); 
            match(input,16,FOLLOW_2); 
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
    // InternalMyDsl.g:4564:1: rule__Component_Impl__Group_3__2 : rule__Component_Impl__Group_3__2__Impl rule__Component_Impl__Group_3__3 ;
    public final void rule__Component_Impl__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4568:1: ( rule__Component_Impl__Group_3__2__Impl rule__Component_Impl__Group_3__3 )
            // InternalMyDsl.g:4569:2: rule__Component_Impl__Group_3__2__Impl rule__Component_Impl__Group_3__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:4576:1: rule__Component_Impl__Group_3__2__Impl : ( ( rule__Component_Impl__RequiredInterfaceAssignment_3_2 ) ) ;
    public final void rule__Component_Impl__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4580:1: ( ( ( rule__Component_Impl__RequiredInterfaceAssignment_3_2 ) ) )
            // InternalMyDsl.g:4581:1: ( ( rule__Component_Impl__RequiredInterfaceAssignment_3_2 ) )
            {
            // InternalMyDsl.g:4581:1: ( ( rule__Component_Impl__RequiredInterfaceAssignment_3_2 ) )
            // InternalMyDsl.g:4582:2: ( rule__Component_Impl__RequiredInterfaceAssignment_3_2 )
            {
             before(grammarAccess.getComponent_ImplAccess().getRequiredInterfaceAssignment_3_2()); 
            // InternalMyDsl.g:4583:2: ( rule__Component_Impl__RequiredInterfaceAssignment_3_2 )
            // InternalMyDsl.g:4583:3: rule__Component_Impl__RequiredInterfaceAssignment_3_2
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
    // InternalMyDsl.g:4591:1: rule__Component_Impl__Group_3__3 : rule__Component_Impl__Group_3__3__Impl rule__Component_Impl__Group_3__4 ;
    public final void rule__Component_Impl__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4595:1: ( rule__Component_Impl__Group_3__3__Impl rule__Component_Impl__Group_3__4 )
            // InternalMyDsl.g:4596:2: rule__Component_Impl__Group_3__3__Impl rule__Component_Impl__Group_3__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:4603:1: rule__Component_Impl__Group_3__3__Impl : ( ( rule__Component_Impl__Group_3_3__0 )* ) ;
    public final void rule__Component_Impl__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4607:1: ( ( ( rule__Component_Impl__Group_3_3__0 )* ) )
            // InternalMyDsl.g:4608:1: ( ( rule__Component_Impl__Group_3_3__0 )* )
            {
            // InternalMyDsl.g:4608:1: ( ( rule__Component_Impl__Group_3_3__0 )* )
            // InternalMyDsl.g:4609:2: ( rule__Component_Impl__Group_3_3__0 )*
            {
             before(grammarAccess.getComponent_ImplAccess().getGroup_3_3()); 
            // InternalMyDsl.g:4610:2: ( rule__Component_Impl__Group_3_3__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==19) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalMyDsl.g:4610:3: rule__Component_Impl__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Component_Impl__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalMyDsl.g:4618:1: rule__Component_Impl__Group_3__4 : rule__Component_Impl__Group_3__4__Impl ;
    public final void rule__Component_Impl__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4622:1: ( rule__Component_Impl__Group_3__4__Impl )
            // InternalMyDsl.g:4623:2: rule__Component_Impl__Group_3__4__Impl
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
    // InternalMyDsl.g:4629:1: rule__Component_Impl__Group_3__4__Impl : ( ')' ) ;
    public final void rule__Component_Impl__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4633:1: ( ( ')' ) )
            // InternalMyDsl.g:4634:1: ( ')' )
            {
            // InternalMyDsl.g:4634:1: ( ')' )
            // InternalMyDsl.g:4635:2: ')'
            {
             before(grammarAccess.getComponent_ImplAccess().getRightParenthesisKeyword_3_4()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyDsl.g:4645:1: rule__Component_Impl__Group_3_3__0 : rule__Component_Impl__Group_3_3__0__Impl rule__Component_Impl__Group_3_3__1 ;
    public final void rule__Component_Impl__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4649:1: ( rule__Component_Impl__Group_3_3__0__Impl rule__Component_Impl__Group_3_3__1 )
            // InternalMyDsl.g:4650:2: rule__Component_Impl__Group_3_3__0__Impl rule__Component_Impl__Group_3_3__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:4657:1: rule__Component_Impl__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Component_Impl__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4661:1: ( ( ',' ) )
            // InternalMyDsl.g:4662:1: ( ',' )
            {
            // InternalMyDsl.g:4662:1: ( ',' )
            // InternalMyDsl.g:4663:2: ','
            {
             before(grammarAccess.getComponent_ImplAccess().getCommaKeyword_3_3_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalMyDsl.g:4672:1: rule__Component_Impl__Group_3_3__1 : rule__Component_Impl__Group_3_3__1__Impl ;
    public final void rule__Component_Impl__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4676:1: ( rule__Component_Impl__Group_3_3__1__Impl )
            // InternalMyDsl.g:4677:2: rule__Component_Impl__Group_3_3__1__Impl
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
    // InternalMyDsl.g:4683:1: rule__Component_Impl__Group_3_3__1__Impl : ( ( rule__Component_Impl__RequiredInterfaceAssignment_3_3_1 ) ) ;
    public final void rule__Component_Impl__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4687:1: ( ( ( rule__Component_Impl__RequiredInterfaceAssignment_3_3_1 ) ) )
            // InternalMyDsl.g:4688:1: ( ( rule__Component_Impl__RequiredInterfaceAssignment_3_3_1 ) )
            {
            // InternalMyDsl.g:4688:1: ( ( rule__Component_Impl__RequiredInterfaceAssignment_3_3_1 ) )
            // InternalMyDsl.g:4689:2: ( rule__Component_Impl__RequiredInterfaceAssignment_3_3_1 )
            {
             before(grammarAccess.getComponent_ImplAccess().getRequiredInterfaceAssignment_3_3_1()); 
            // InternalMyDsl.g:4690:2: ( rule__Component_Impl__RequiredInterfaceAssignment_3_3_1 )
            // InternalMyDsl.g:4690:3: rule__Component_Impl__RequiredInterfaceAssignment_3_3_1
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


    // $ANTLR start "rule__Component_Impl__Group_4__0"
    // InternalMyDsl.g:4699:1: rule__Component_Impl__Group_4__0 : rule__Component_Impl__Group_4__0__Impl rule__Component_Impl__Group_4__1 ;
    public final void rule__Component_Impl__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4703:1: ( rule__Component_Impl__Group_4__0__Impl rule__Component_Impl__Group_4__1 )
            // InternalMyDsl.g:4704:2: rule__Component_Impl__Group_4__0__Impl rule__Component_Impl__Group_4__1
            {
            pushFollow(FOLLOW_8);
            rule__Component_Impl__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_4__0"


    // $ANTLR start "rule__Component_Impl__Group_4__0__Impl"
    // InternalMyDsl.g:4711:1: rule__Component_Impl__Group_4__0__Impl : ( 'requiredService' ) ;
    public final void rule__Component_Impl__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4715:1: ( ( 'requiredService' ) )
            // InternalMyDsl.g:4716:1: ( 'requiredService' )
            {
            // InternalMyDsl.g:4716:1: ( 'requiredService' )
            // InternalMyDsl.g:4717:2: 'requiredService'
            {
             before(grammarAccess.getComponent_ImplAccess().getRequiredServiceKeyword_4_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getComponent_ImplAccess().getRequiredServiceKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_4__0__Impl"


    // $ANTLR start "rule__Component_Impl__Group_4__1"
    // InternalMyDsl.g:4726:1: rule__Component_Impl__Group_4__1 : rule__Component_Impl__Group_4__1__Impl rule__Component_Impl__Group_4__2 ;
    public final void rule__Component_Impl__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4730:1: ( rule__Component_Impl__Group_4__1__Impl rule__Component_Impl__Group_4__2 )
            // InternalMyDsl.g:4731:2: rule__Component_Impl__Group_4__1__Impl rule__Component_Impl__Group_4__2
            {
            pushFollow(FOLLOW_9);
            rule__Component_Impl__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_4__1"


    // $ANTLR start "rule__Component_Impl__Group_4__1__Impl"
    // InternalMyDsl.g:4738:1: rule__Component_Impl__Group_4__1__Impl : ( '(' ) ;
    public final void rule__Component_Impl__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4742:1: ( ( '(' ) )
            // InternalMyDsl.g:4743:1: ( '(' )
            {
            // InternalMyDsl.g:4743:1: ( '(' )
            // InternalMyDsl.g:4744:2: '('
            {
             before(grammarAccess.getComponent_ImplAccess().getLeftParenthesisKeyword_4_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getComponent_ImplAccess().getLeftParenthesisKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_4__1__Impl"


    // $ANTLR start "rule__Component_Impl__Group_4__2"
    // InternalMyDsl.g:4753:1: rule__Component_Impl__Group_4__2 : rule__Component_Impl__Group_4__2__Impl rule__Component_Impl__Group_4__3 ;
    public final void rule__Component_Impl__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4757:1: ( rule__Component_Impl__Group_4__2__Impl rule__Component_Impl__Group_4__3 )
            // InternalMyDsl.g:4758:2: rule__Component_Impl__Group_4__2__Impl rule__Component_Impl__Group_4__3
            {
            pushFollow(FOLLOW_10);
            rule__Component_Impl__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_4__2"


    // $ANTLR start "rule__Component_Impl__Group_4__2__Impl"
    // InternalMyDsl.g:4765:1: rule__Component_Impl__Group_4__2__Impl : ( ( rule__Component_Impl__RequiredServiceAssignment_4_2 ) ) ;
    public final void rule__Component_Impl__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4769:1: ( ( ( rule__Component_Impl__RequiredServiceAssignment_4_2 ) ) )
            // InternalMyDsl.g:4770:1: ( ( rule__Component_Impl__RequiredServiceAssignment_4_2 ) )
            {
            // InternalMyDsl.g:4770:1: ( ( rule__Component_Impl__RequiredServiceAssignment_4_2 ) )
            // InternalMyDsl.g:4771:2: ( rule__Component_Impl__RequiredServiceAssignment_4_2 )
            {
             before(grammarAccess.getComponent_ImplAccess().getRequiredServiceAssignment_4_2()); 
            // InternalMyDsl.g:4772:2: ( rule__Component_Impl__RequiredServiceAssignment_4_2 )
            // InternalMyDsl.g:4772:3: rule__Component_Impl__RequiredServiceAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Component_Impl__RequiredServiceAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getComponent_ImplAccess().getRequiredServiceAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_4__2__Impl"


    // $ANTLR start "rule__Component_Impl__Group_4__3"
    // InternalMyDsl.g:4780:1: rule__Component_Impl__Group_4__3 : rule__Component_Impl__Group_4__3__Impl rule__Component_Impl__Group_4__4 ;
    public final void rule__Component_Impl__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4784:1: ( rule__Component_Impl__Group_4__3__Impl rule__Component_Impl__Group_4__4 )
            // InternalMyDsl.g:4785:2: rule__Component_Impl__Group_4__3__Impl rule__Component_Impl__Group_4__4
            {
            pushFollow(FOLLOW_10);
            rule__Component_Impl__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_4__3"


    // $ANTLR start "rule__Component_Impl__Group_4__3__Impl"
    // InternalMyDsl.g:4792:1: rule__Component_Impl__Group_4__3__Impl : ( ( rule__Component_Impl__Group_4_3__0 )* ) ;
    public final void rule__Component_Impl__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4796:1: ( ( ( rule__Component_Impl__Group_4_3__0 )* ) )
            // InternalMyDsl.g:4797:1: ( ( rule__Component_Impl__Group_4_3__0 )* )
            {
            // InternalMyDsl.g:4797:1: ( ( rule__Component_Impl__Group_4_3__0 )* )
            // InternalMyDsl.g:4798:2: ( rule__Component_Impl__Group_4_3__0 )*
            {
             before(grammarAccess.getComponent_ImplAccess().getGroup_4_3()); 
            // InternalMyDsl.g:4799:2: ( rule__Component_Impl__Group_4_3__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==19) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalMyDsl.g:4799:3: rule__Component_Impl__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Component_Impl__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getComponent_ImplAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_4__3__Impl"


    // $ANTLR start "rule__Component_Impl__Group_4__4"
    // InternalMyDsl.g:4807:1: rule__Component_Impl__Group_4__4 : rule__Component_Impl__Group_4__4__Impl ;
    public final void rule__Component_Impl__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4811:1: ( rule__Component_Impl__Group_4__4__Impl )
            // InternalMyDsl.g:4812:2: rule__Component_Impl__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_4__4"


    // $ANTLR start "rule__Component_Impl__Group_4__4__Impl"
    // InternalMyDsl.g:4818:1: rule__Component_Impl__Group_4__4__Impl : ( ')' ) ;
    public final void rule__Component_Impl__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4822:1: ( ( ')' ) )
            // InternalMyDsl.g:4823:1: ( ')' )
            {
            // InternalMyDsl.g:4823:1: ( ')' )
            // InternalMyDsl.g:4824:2: ')'
            {
             before(grammarAccess.getComponent_ImplAccess().getRightParenthesisKeyword_4_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getComponent_ImplAccess().getRightParenthesisKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_4__4__Impl"


    // $ANTLR start "rule__Component_Impl__Group_4_3__0"
    // InternalMyDsl.g:4834:1: rule__Component_Impl__Group_4_3__0 : rule__Component_Impl__Group_4_3__0__Impl rule__Component_Impl__Group_4_3__1 ;
    public final void rule__Component_Impl__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4838:1: ( rule__Component_Impl__Group_4_3__0__Impl rule__Component_Impl__Group_4_3__1 )
            // InternalMyDsl.g:4839:2: rule__Component_Impl__Group_4_3__0__Impl rule__Component_Impl__Group_4_3__1
            {
            pushFollow(FOLLOW_9);
            rule__Component_Impl__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_4_3__0"


    // $ANTLR start "rule__Component_Impl__Group_4_3__0__Impl"
    // InternalMyDsl.g:4846:1: rule__Component_Impl__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Component_Impl__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4850:1: ( ( ',' ) )
            // InternalMyDsl.g:4851:1: ( ',' )
            {
            // InternalMyDsl.g:4851:1: ( ',' )
            // InternalMyDsl.g:4852:2: ','
            {
             before(grammarAccess.getComponent_ImplAccess().getCommaKeyword_4_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getComponent_ImplAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_4_3__0__Impl"


    // $ANTLR start "rule__Component_Impl__Group_4_3__1"
    // InternalMyDsl.g:4861:1: rule__Component_Impl__Group_4_3__1 : rule__Component_Impl__Group_4_3__1__Impl ;
    public final void rule__Component_Impl__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4865:1: ( rule__Component_Impl__Group_4_3__1__Impl )
            // InternalMyDsl.g:4866:2: rule__Component_Impl__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_4_3__1"


    // $ANTLR start "rule__Component_Impl__Group_4_3__1__Impl"
    // InternalMyDsl.g:4872:1: rule__Component_Impl__Group_4_3__1__Impl : ( ( rule__Component_Impl__RequiredServiceAssignment_4_3_1 ) ) ;
    public final void rule__Component_Impl__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4876:1: ( ( ( rule__Component_Impl__RequiredServiceAssignment_4_3_1 ) ) )
            // InternalMyDsl.g:4877:1: ( ( rule__Component_Impl__RequiredServiceAssignment_4_3_1 ) )
            {
            // InternalMyDsl.g:4877:1: ( ( rule__Component_Impl__RequiredServiceAssignment_4_3_1 ) )
            // InternalMyDsl.g:4878:2: ( rule__Component_Impl__RequiredServiceAssignment_4_3_1 )
            {
             before(grammarAccess.getComponent_ImplAccess().getRequiredServiceAssignment_4_3_1()); 
            // InternalMyDsl.g:4879:2: ( rule__Component_Impl__RequiredServiceAssignment_4_3_1 )
            // InternalMyDsl.g:4879:3: rule__Component_Impl__RequiredServiceAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Component_Impl__RequiredServiceAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getComponent_ImplAccess().getRequiredServiceAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_4_3__1__Impl"


    // $ANTLR start "rule__Component_Impl__Group_5__0"
    // InternalMyDsl.g:4888:1: rule__Component_Impl__Group_5__0 : rule__Component_Impl__Group_5__0__Impl rule__Component_Impl__Group_5__1 ;
    public final void rule__Component_Impl__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4892:1: ( rule__Component_Impl__Group_5__0__Impl rule__Component_Impl__Group_5__1 )
            // InternalMyDsl.g:4893:2: rule__Component_Impl__Group_5__0__Impl rule__Component_Impl__Group_5__1
            {
            pushFollow(FOLLOW_8);
            rule__Component_Impl__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_5__0"


    // $ANTLR start "rule__Component_Impl__Group_5__0__Impl"
    // InternalMyDsl.g:4900:1: rule__Component_Impl__Group_5__0__Impl : ( 'providedInterface' ) ;
    public final void rule__Component_Impl__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4904:1: ( ( 'providedInterface' ) )
            // InternalMyDsl.g:4905:1: ( 'providedInterface' )
            {
            // InternalMyDsl.g:4905:1: ( 'providedInterface' )
            // InternalMyDsl.g:4906:2: 'providedInterface'
            {
             before(grammarAccess.getComponent_ImplAccess().getProvidedInterfaceKeyword_5_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getComponent_ImplAccess().getProvidedInterfaceKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_5__0__Impl"


    // $ANTLR start "rule__Component_Impl__Group_5__1"
    // InternalMyDsl.g:4915:1: rule__Component_Impl__Group_5__1 : rule__Component_Impl__Group_5__1__Impl rule__Component_Impl__Group_5__2 ;
    public final void rule__Component_Impl__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4919:1: ( rule__Component_Impl__Group_5__1__Impl rule__Component_Impl__Group_5__2 )
            // InternalMyDsl.g:4920:2: rule__Component_Impl__Group_5__1__Impl rule__Component_Impl__Group_5__2
            {
            pushFollow(FOLLOW_9);
            rule__Component_Impl__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_5__1"


    // $ANTLR start "rule__Component_Impl__Group_5__1__Impl"
    // InternalMyDsl.g:4927:1: rule__Component_Impl__Group_5__1__Impl : ( '(' ) ;
    public final void rule__Component_Impl__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4931:1: ( ( '(' ) )
            // InternalMyDsl.g:4932:1: ( '(' )
            {
            // InternalMyDsl.g:4932:1: ( '(' )
            // InternalMyDsl.g:4933:2: '('
            {
             before(grammarAccess.getComponent_ImplAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getComponent_ImplAccess().getLeftParenthesisKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_5__1__Impl"


    // $ANTLR start "rule__Component_Impl__Group_5__2"
    // InternalMyDsl.g:4942:1: rule__Component_Impl__Group_5__2 : rule__Component_Impl__Group_5__2__Impl rule__Component_Impl__Group_5__3 ;
    public final void rule__Component_Impl__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4946:1: ( rule__Component_Impl__Group_5__2__Impl rule__Component_Impl__Group_5__3 )
            // InternalMyDsl.g:4947:2: rule__Component_Impl__Group_5__2__Impl rule__Component_Impl__Group_5__3
            {
            pushFollow(FOLLOW_10);
            rule__Component_Impl__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_5__2"


    // $ANTLR start "rule__Component_Impl__Group_5__2__Impl"
    // InternalMyDsl.g:4954:1: rule__Component_Impl__Group_5__2__Impl : ( ( rule__Component_Impl__ProvidedInterfaceAssignment_5_2 ) ) ;
    public final void rule__Component_Impl__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4958:1: ( ( ( rule__Component_Impl__ProvidedInterfaceAssignment_5_2 ) ) )
            // InternalMyDsl.g:4959:1: ( ( rule__Component_Impl__ProvidedInterfaceAssignment_5_2 ) )
            {
            // InternalMyDsl.g:4959:1: ( ( rule__Component_Impl__ProvidedInterfaceAssignment_5_2 ) )
            // InternalMyDsl.g:4960:2: ( rule__Component_Impl__ProvidedInterfaceAssignment_5_2 )
            {
             before(grammarAccess.getComponent_ImplAccess().getProvidedInterfaceAssignment_5_2()); 
            // InternalMyDsl.g:4961:2: ( rule__Component_Impl__ProvidedInterfaceAssignment_5_2 )
            // InternalMyDsl.g:4961:3: rule__Component_Impl__ProvidedInterfaceAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Component_Impl__ProvidedInterfaceAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getComponent_ImplAccess().getProvidedInterfaceAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_5__2__Impl"


    // $ANTLR start "rule__Component_Impl__Group_5__3"
    // InternalMyDsl.g:4969:1: rule__Component_Impl__Group_5__3 : rule__Component_Impl__Group_5__3__Impl rule__Component_Impl__Group_5__4 ;
    public final void rule__Component_Impl__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4973:1: ( rule__Component_Impl__Group_5__3__Impl rule__Component_Impl__Group_5__4 )
            // InternalMyDsl.g:4974:2: rule__Component_Impl__Group_5__3__Impl rule__Component_Impl__Group_5__4
            {
            pushFollow(FOLLOW_10);
            rule__Component_Impl__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_5__3"


    // $ANTLR start "rule__Component_Impl__Group_5__3__Impl"
    // InternalMyDsl.g:4981:1: rule__Component_Impl__Group_5__3__Impl : ( ( rule__Component_Impl__Group_5_3__0 )* ) ;
    public final void rule__Component_Impl__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4985:1: ( ( ( rule__Component_Impl__Group_5_3__0 )* ) )
            // InternalMyDsl.g:4986:1: ( ( rule__Component_Impl__Group_5_3__0 )* )
            {
            // InternalMyDsl.g:4986:1: ( ( rule__Component_Impl__Group_5_3__0 )* )
            // InternalMyDsl.g:4987:2: ( rule__Component_Impl__Group_5_3__0 )*
            {
             before(grammarAccess.getComponent_ImplAccess().getGroup_5_3()); 
            // InternalMyDsl.g:4988:2: ( rule__Component_Impl__Group_5_3__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==19) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalMyDsl.g:4988:3: rule__Component_Impl__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Component_Impl__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getComponent_ImplAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_5__3__Impl"


    // $ANTLR start "rule__Component_Impl__Group_5__4"
    // InternalMyDsl.g:4996:1: rule__Component_Impl__Group_5__4 : rule__Component_Impl__Group_5__4__Impl ;
    public final void rule__Component_Impl__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5000:1: ( rule__Component_Impl__Group_5__4__Impl )
            // InternalMyDsl.g:5001:2: rule__Component_Impl__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_5__4"


    // $ANTLR start "rule__Component_Impl__Group_5__4__Impl"
    // InternalMyDsl.g:5007:1: rule__Component_Impl__Group_5__4__Impl : ( ')' ) ;
    public final void rule__Component_Impl__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5011:1: ( ( ')' ) )
            // InternalMyDsl.g:5012:1: ( ')' )
            {
            // InternalMyDsl.g:5012:1: ( ')' )
            // InternalMyDsl.g:5013:2: ')'
            {
             before(grammarAccess.getComponent_ImplAccess().getRightParenthesisKeyword_5_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getComponent_ImplAccess().getRightParenthesisKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_5__4__Impl"


    // $ANTLR start "rule__Component_Impl__Group_5_3__0"
    // InternalMyDsl.g:5023:1: rule__Component_Impl__Group_5_3__0 : rule__Component_Impl__Group_5_3__0__Impl rule__Component_Impl__Group_5_3__1 ;
    public final void rule__Component_Impl__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5027:1: ( rule__Component_Impl__Group_5_3__0__Impl rule__Component_Impl__Group_5_3__1 )
            // InternalMyDsl.g:5028:2: rule__Component_Impl__Group_5_3__0__Impl rule__Component_Impl__Group_5_3__1
            {
            pushFollow(FOLLOW_9);
            rule__Component_Impl__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_5_3__0"


    // $ANTLR start "rule__Component_Impl__Group_5_3__0__Impl"
    // InternalMyDsl.g:5035:1: rule__Component_Impl__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Component_Impl__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5039:1: ( ( ',' ) )
            // InternalMyDsl.g:5040:1: ( ',' )
            {
            // InternalMyDsl.g:5040:1: ( ',' )
            // InternalMyDsl.g:5041:2: ','
            {
             before(grammarAccess.getComponent_ImplAccess().getCommaKeyword_5_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getComponent_ImplAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_5_3__0__Impl"


    // $ANTLR start "rule__Component_Impl__Group_5_3__1"
    // InternalMyDsl.g:5050:1: rule__Component_Impl__Group_5_3__1 : rule__Component_Impl__Group_5_3__1__Impl ;
    public final void rule__Component_Impl__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5054:1: ( rule__Component_Impl__Group_5_3__1__Impl )
            // InternalMyDsl.g:5055:2: rule__Component_Impl__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_5_3__1"


    // $ANTLR start "rule__Component_Impl__Group_5_3__1__Impl"
    // InternalMyDsl.g:5061:1: rule__Component_Impl__Group_5_3__1__Impl : ( ( rule__Component_Impl__ProvidedInterfaceAssignment_5_3_1 ) ) ;
    public final void rule__Component_Impl__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5065:1: ( ( ( rule__Component_Impl__ProvidedInterfaceAssignment_5_3_1 ) ) )
            // InternalMyDsl.g:5066:1: ( ( rule__Component_Impl__ProvidedInterfaceAssignment_5_3_1 ) )
            {
            // InternalMyDsl.g:5066:1: ( ( rule__Component_Impl__ProvidedInterfaceAssignment_5_3_1 ) )
            // InternalMyDsl.g:5067:2: ( rule__Component_Impl__ProvidedInterfaceAssignment_5_3_1 )
            {
             before(grammarAccess.getComponent_ImplAccess().getProvidedInterfaceAssignment_5_3_1()); 
            // InternalMyDsl.g:5068:2: ( rule__Component_Impl__ProvidedInterfaceAssignment_5_3_1 )
            // InternalMyDsl.g:5068:3: rule__Component_Impl__ProvidedInterfaceAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Component_Impl__ProvidedInterfaceAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getComponent_ImplAccess().getProvidedInterfaceAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_5_3__1__Impl"


    // $ANTLR start "rule__Component_Impl__Group_6__0"
    // InternalMyDsl.g:5077:1: rule__Component_Impl__Group_6__0 : rule__Component_Impl__Group_6__0__Impl rule__Component_Impl__Group_6__1 ;
    public final void rule__Component_Impl__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5081:1: ( rule__Component_Impl__Group_6__0__Impl rule__Component_Impl__Group_6__1 )
            // InternalMyDsl.g:5082:2: rule__Component_Impl__Group_6__0__Impl rule__Component_Impl__Group_6__1
            {
            pushFollow(FOLLOW_8);
            rule__Component_Impl__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_6__0"


    // $ANTLR start "rule__Component_Impl__Group_6__0__Impl"
    // InternalMyDsl.g:5089:1: rule__Component_Impl__Group_6__0__Impl : ( 'providedService' ) ;
    public final void rule__Component_Impl__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5093:1: ( ( 'providedService' ) )
            // InternalMyDsl.g:5094:1: ( 'providedService' )
            {
            // InternalMyDsl.g:5094:1: ( 'providedService' )
            // InternalMyDsl.g:5095:2: 'providedService'
            {
             before(grammarAccess.getComponent_ImplAccess().getProvidedServiceKeyword_6_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getComponent_ImplAccess().getProvidedServiceKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_6__0__Impl"


    // $ANTLR start "rule__Component_Impl__Group_6__1"
    // InternalMyDsl.g:5104:1: rule__Component_Impl__Group_6__1 : rule__Component_Impl__Group_6__1__Impl rule__Component_Impl__Group_6__2 ;
    public final void rule__Component_Impl__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5108:1: ( rule__Component_Impl__Group_6__1__Impl rule__Component_Impl__Group_6__2 )
            // InternalMyDsl.g:5109:2: rule__Component_Impl__Group_6__1__Impl rule__Component_Impl__Group_6__2
            {
            pushFollow(FOLLOW_9);
            rule__Component_Impl__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_6__1"


    // $ANTLR start "rule__Component_Impl__Group_6__1__Impl"
    // InternalMyDsl.g:5116:1: rule__Component_Impl__Group_6__1__Impl : ( '(' ) ;
    public final void rule__Component_Impl__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5120:1: ( ( '(' ) )
            // InternalMyDsl.g:5121:1: ( '(' )
            {
            // InternalMyDsl.g:5121:1: ( '(' )
            // InternalMyDsl.g:5122:2: '('
            {
             before(grammarAccess.getComponent_ImplAccess().getLeftParenthesisKeyword_6_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getComponent_ImplAccess().getLeftParenthesisKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_6__1__Impl"


    // $ANTLR start "rule__Component_Impl__Group_6__2"
    // InternalMyDsl.g:5131:1: rule__Component_Impl__Group_6__2 : rule__Component_Impl__Group_6__2__Impl rule__Component_Impl__Group_6__3 ;
    public final void rule__Component_Impl__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5135:1: ( rule__Component_Impl__Group_6__2__Impl rule__Component_Impl__Group_6__3 )
            // InternalMyDsl.g:5136:2: rule__Component_Impl__Group_6__2__Impl rule__Component_Impl__Group_6__3
            {
            pushFollow(FOLLOW_10);
            rule__Component_Impl__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_6__2"


    // $ANTLR start "rule__Component_Impl__Group_6__2__Impl"
    // InternalMyDsl.g:5143:1: rule__Component_Impl__Group_6__2__Impl : ( ( rule__Component_Impl__ProvidedServiceAssignment_6_2 ) ) ;
    public final void rule__Component_Impl__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5147:1: ( ( ( rule__Component_Impl__ProvidedServiceAssignment_6_2 ) ) )
            // InternalMyDsl.g:5148:1: ( ( rule__Component_Impl__ProvidedServiceAssignment_6_2 ) )
            {
            // InternalMyDsl.g:5148:1: ( ( rule__Component_Impl__ProvidedServiceAssignment_6_2 ) )
            // InternalMyDsl.g:5149:2: ( rule__Component_Impl__ProvidedServiceAssignment_6_2 )
            {
             before(grammarAccess.getComponent_ImplAccess().getProvidedServiceAssignment_6_2()); 
            // InternalMyDsl.g:5150:2: ( rule__Component_Impl__ProvidedServiceAssignment_6_2 )
            // InternalMyDsl.g:5150:3: rule__Component_Impl__ProvidedServiceAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__Component_Impl__ProvidedServiceAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getComponent_ImplAccess().getProvidedServiceAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_6__2__Impl"


    // $ANTLR start "rule__Component_Impl__Group_6__3"
    // InternalMyDsl.g:5158:1: rule__Component_Impl__Group_6__3 : rule__Component_Impl__Group_6__3__Impl rule__Component_Impl__Group_6__4 ;
    public final void rule__Component_Impl__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5162:1: ( rule__Component_Impl__Group_6__3__Impl rule__Component_Impl__Group_6__4 )
            // InternalMyDsl.g:5163:2: rule__Component_Impl__Group_6__3__Impl rule__Component_Impl__Group_6__4
            {
            pushFollow(FOLLOW_10);
            rule__Component_Impl__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_6__3"


    // $ANTLR start "rule__Component_Impl__Group_6__3__Impl"
    // InternalMyDsl.g:5170:1: rule__Component_Impl__Group_6__3__Impl : ( ( rule__Component_Impl__Group_6_3__0 )* ) ;
    public final void rule__Component_Impl__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5174:1: ( ( ( rule__Component_Impl__Group_6_3__0 )* ) )
            // InternalMyDsl.g:5175:1: ( ( rule__Component_Impl__Group_6_3__0 )* )
            {
            // InternalMyDsl.g:5175:1: ( ( rule__Component_Impl__Group_6_3__0 )* )
            // InternalMyDsl.g:5176:2: ( rule__Component_Impl__Group_6_3__0 )*
            {
             before(grammarAccess.getComponent_ImplAccess().getGroup_6_3()); 
            // InternalMyDsl.g:5177:2: ( rule__Component_Impl__Group_6_3__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==19) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalMyDsl.g:5177:3: rule__Component_Impl__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Component_Impl__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getComponent_ImplAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_6__3__Impl"


    // $ANTLR start "rule__Component_Impl__Group_6__4"
    // InternalMyDsl.g:5185:1: rule__Component_Impl__Group_6__4 : rule__Component_Impl__Group_6__4__Impl ;
    public final void rule__Component_Impl__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5189:1: ( rule__Component_Impl__Group_6__4__Impl )
            // InternalMyDsl.g:5190:2: rule__Component_Impl__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_6__4"


    // $ANTLR start "rule__Component_Impl__Group_6__4__Impl"
    // InternalMyDsl.g:5196:1: rule__Component_Impl__Group_6__4__Impl : ( ')' ) ;
    public final void rule__Component_Impl__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5200:1: ( ( ')' ) )
            // InternalMyDsl.g:5201:1: ( ')' )
            {
            // InternalMyDsl.g:5201:1: ( ')' )
            // InternalMyDsl.g:5202:2: ')'
            {
             before(grammarAccess.getComponent_ImplAccess().getRightParenthesisKeyword_6_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getComponent_ImplAccess().getRightParenthesisKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_6__4__Impl"


    // $ANTLR start "rule__Component_Impl__Group_6_3__0"
    // InternalMyDsl.g:5212:1: rule__Component_Impl__Group_6_3__0 : rule__Component_Impl__Group_6_3__0__Impl rule__Component_Impl__Group_6_3__1 ;
    public final void rule__Component_Impl__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5216:1: ( rule__Component_Impl__Group_6_3__0__Impl rule__Component_Impl__Group_6_3__1 )
            // InternalMyDsl.g:5217:2: rule__Component_Impl__Group_6_3__0__Impl rule__Component_Impl__Group_6_3__1
            {
            pushFollow(FOLLOW_9);
            rule__Component_Impl__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_6_3__0"


    // $ANTLR start "rule__Component_Impl__Group_6_3__0__Impl"
    // InternalMyDsl.g:5224:1: rule__Component_Impl__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__Component_Impl__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5228:1: ( ( ',' ) )
            // InternalMyDsl.g:5229:1: ( ',' )
            {
            // InternalMyDsl.g:5229:1: ( ',' )
            // InternalMyDsl.g:5230:2: ','
            {
             before(grammarAccess.getComponent_ImplAccess().getCommaKeyword_6_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getComponent_ImplAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_6_3__0__Impl"


    // $ANTLR start "rule__Component_Impl__Group_6_3__1"
    // InternalMyDsl.g:5239:1: rule__Component_Impl__Group_6_3__1 : rule__Component_Impl__Group_6_3__1__Impl ;
    public final void rule__Component_Impl__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5243:1: ( rule__Component_Impl__Group_6_3__1__Impl )
            // InternalMyDsl.g:5244:2: rule__Component_Impl__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component_Impl__Group_6_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_6_3__1"


    // $ANTLR start "rule__Component_Impl__Group_6_3__1__Impl"
    // InternalMyDsl.g:5250:1: rule__Component_Impl__Group_6_3__1__Impl : ( ( rule__Component_Impl__ProvidedServiceAssignment_6_3_1 ) ) ;
    public final void rule__Component_Impl__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5254:1: ( ( ( rule__Component_Impl__ProvidedServiceAssignment_6_3_1 ) ) )
            // InternalMyDsl.g:5255:1: ( ( rule__Component_Impl__ProvidedServiceAssignment_6_3_1 ) )
            {
            // InternalMyDsl.g:5255:1: ( ( rule__Component_Impl__ProvidedServiceAssignment_6_3_1 ) )
            // InternalMyDsl.g:5256:2: ( rule__Component_Impl__ProvidedServiceAssignment_6_3_1 )
            {
             before(grammarAccess.getComponent_ImplAccess().getProvidedServiceAssignment_6_3_1()); 
            // InternalMyDsl.g:5257:2: ( rule__Component_Impl__ProvidedServiceAssignment_6_3_1 )
            // InternalMyDsl.g:5257:3: rule__Component_Impl__ProvidedServiceAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Component_Impl__ProvidedServiceAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getComponent_ImplAccess().getProvidedServiceAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__Group_6_3__1__Impl"


    // $ANTLR start "rule__Component_Impl__Group_7__0"
    // InternalMyDsl.g:5266:1: rule__Component_Impl__Group_7__0 : rule__Component_Impl__Group_7__0__Impl rule__Component_Impl__Group_7__1 ;
    public final void rule__Component_Impl__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5270:1: ( rule__Component_Impl__Group_7__0__Impl rule__Component_Impl__Group_7__1 )
            // InternalMyDsl.g:5271:2: rule__Component_Impl__Group_7__0__Impl rule__Component_Impl__Group_7__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalMyDsl.g:5278:1: rule__Component_Impl__Group_7__0__Impl : ( 'behaviourDescription' ) ;
    public final void rule__Component_Impl__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5282:1: ( ( 'behaviourDescription' ) )
            // InternalMyDsl.g:5283:1: ( 'behaviourDescription' )
            {
            // InternalMyDsl.g:5283:1: ( 'behaviourDescription' )
            // InternalMyDsl.g:5284:2: 'behaviourDescription'
            {
             before(grammarAccess.getComponent_ImplAccess().getBehaviourDescriptionKeyword_7_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getComponent_ImplAccess().getBehaviourDescriptionKeyword_7_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:5293:1: rule__Component_Impl__Group_7__1 : rule__Component_Impl__Group_7__1__Impl ;
    public final void rule__Component_Impl__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5297:1: ( rule__Component_Impl__Group_7__1__Impl )
            // InternalMyDsl.g:5298:2: rule__Component_Impl__Group_7__1__Impl
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
    // InternalMyDsl.g:5304:1: rule__Component_Impl__Group_7__1__Impl : ( ( rule__Component_Impl__BehaviourDescriptionAssignment_7_1 ) ) ;
    public final void rule__Component_Impl__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5308:1: ( ( ( rule__Component_Impl__BehaviourDescriptionAssignment_7_1 ) ) )
            // InternalMyDsl.g:5309:1: ( ( rule__Component_Impl__BehaviourDescriptionAssignment_7_1 ) )
            {
            // InternalMyDsl.g:5309:1: ( ( rule__Component_Impl__BehaviourDescriptionAssignment_7_1 ) )
            // InternalMyDsl.g:5310:2: ( rule__Component_Impl__BehaviourDescriptionAssignment_7_1 )
            {
             before(grammarAccess.getComponent_ImplAccess().getBehaviourDescriptionAssignment_7_1()); 
            // InternalMyDsl.g:5311:2: ( rule__Component_Impl__BehaviourDescriptionAssignment_7_1 )
            // InternalMyDsl.g:5311:3: rule__Component_Impl__BehaviourDescriptionAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Component_Impl__BehaviourDescriptionAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getComponent_ImplAccess().getBehaviourDescriptionAssignment_7_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__BehaviorDescription__Group__0"
    // InternalMyDsl.g:5320:1: rule__BehaviorDescription__Group__0 : rule__BehaviorDescription__Group__0__Impl rule__BehaviorDescription__Group__1 ;
    public final void rule__BehaviorDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5324:1: ( rule__BehaviorDescription__Group__0__Impl rule__BehaviorDescription__Group__1 )
            // InternalMyDsl.g:5325:2: rule__BehaviorDescription__Group__0__Impl rule__BehaviorDescription__Group__1
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
    // InternalMyDsl.g:5332:1: rule__BehaviorDescription__Group__0__Impl : ( () ) ;
    public final void rule__BehaviorDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5336:1: ( ( () ) )
            // InternalMyDsl.g:5337:1: ( () )
            {
            // InternalMyDsl.g:5337:1: ( () )
            // InternalMyDsl.g:5338:2: ()
            {
             before(grammarAccess.getBehaviorDescriptionAccess().getBehaviorDescriptionAction_0()); 
            // InternalMyDsl.g:5339:2: ()
            // InternalMyDsl.g:5339:3: 
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
    // InternalMyDsl.g:5347:1: rule__BehaviorDescription__Group__1 : rule__BehaviorDescription__Group__1__Impl rule__BehaviorDescription__Group__2 ;
    public final void rule__BehaviorDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5351:1: ( rule__BehaviorDescription__Group__1__Impl rule__BehaviorDescription__Group__2 )
            // InternalMyDsl.g:5352:2: rule__BehaviorDescription__Group__1__Impl rule__BehaviorDescription__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:5359:1: rule__BehaviorDescription__Group__1__Impl : ( 'BehaviorDescription' ) ;
    public final void rule__BehaviorDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5363:1: ( ( 'BehaviorDescription' ) )
            // InternalMyDsl.g:5364:1: ( 'BehaviorDescription' )
            {
            // InternalMyDsl.g:5364:1: ( 'BehaviorDescription' )
            // InternalMyDsl.g:5365:2: 'BehaviorDescription'
            {
             before(grammarAccess.getBehaviorDescriptionAccess().getBehaviorDescriptionKeyword_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyDsl.g:5374:1: rule__BehaviorDescription__Group__2 : rule__BehaviorDescription__Group__2__Impl rule__BehaviorDescription__Group__3 ;
    public final void rule__BehaviorDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5378:1: ( rule__BehaviorDescription__Group__2__Impl rule__BehaviorDescription__Group__3 )
            // InternalMyDsl.g:5379:2: rule__BehaviorDescription__Group__2__Impl rule__BehaviorDescription__Group__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:5386:1: rule__BehaviorDescription__Group__2__Impl : ( '{' ) ;
    public final void rule__BehaviorDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5390:1: ( ( '{' ) )
            // InternalMyDsl.g:5391:1: ( '{' )
            {
            // InternalMyDsl.g:5391:1: ( '{' )
            // InternalMyDsl.g:5392:2: '{'
            {
             before(grammarAccess.getBehaviorDescriptionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
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
    // InternalMyDsl.g:5401:1: rule__BehaviorDescription__Group__3 : rule__BehaviorDescription__Group__3__Impl rule__BehaviorDescription__Group__4 ;
    public final void rule__BehaviorDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5405:1: ( rule__BehaviorDescription__Group__3__Impl rule__BehaviorDescription__Group__4 )
            // InternalMyDsl.g:5406:2: rule__BehaviorDescription__Group__3__Impl rule__BehaviorDescription__Group__4
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:5413:1: rule__BehaviorDescription__Group__3__Impl : ( ( rule__BehaviorDescription__Group_3__0 )? ) ;
    public final void rule__BehaviorDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5417:1: ( ( ( rule__BehaviorDescription__Group_3__0 )? ) )
            // InternalMyDsl.g:5418:1: ( ( rule__BehaviorDescription__Group_3__0 )? )
            {
            // InternalMyDsl.g:5418:1: ( ( rule__BehaviorDescription__Group_3__0 )? )
            // InternalMyDsl.g:5419:2: ( rule__BehaviorDescription__Group_3__0 )?
            {
             before(grammarAccess.getBehaviorDescriptionAccess().getGroup_3()); 
            // InternalMyDsl.g:5420:2: ( rule__BehaviorDescription__Group_3__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==44) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalMyDsl.g:5420:3: rule__BehaviorDescription__Group_3__0
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
    // InternalMyDsl.g:5428:1: rule__BehaviorDescription__Group__4 : rule__BehaviorDescription__Group__4__Impl rule__BehaviorDescription__Group__5 ;
    public final void rule__BehaviorDescription__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5432:1: ( rule__BehaviorDescription__Group__4__Impl rule__BehaviorDescription__Group__5 )
            // InternalMyDsl.g:5433:2: rule__BehaviorDescription__Group__4__Impl rule__BehaviorDescription__Group__5
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:5440:1: rule__BehaviorDescription__Group__4__Impl : ( ( rule__BehaviorDescription__Group_4__0 )? ) ;
    public final void rule__BehaviorDescription__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5444:1: ( ( ( rule__BehaviorDescription__Group_4__0 )? ) )
            // InternalMyDsl.g:5445:1: ( ( rule__BehaviorDescription__Group_4__0 )? )
            {
            // InternalMyDsl.g:5445:1: ( ( rule__BehaviorDescription__Group_4__0 )? )
            // InternalMyDsl.g:5446:2: ( rule__BehaviorDescription__Group_4__0 )?
            {
             before(grammarAccess.getBehaviorDescriptionAccess().getGroup_4()); 
            // InternalMyDsl.g:5447:2: ( rule__BehaviorDescription__Group_4__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==45) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMyDsl.g:5447:3: rule__BehaviorDescription__Group_4__0
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
    // InternalMyDsl.g:5455:1: rule__BehaviorDescription__Group__5 : rule__BehaviorDescription__Group__5__Impl rule__BehaviorDescription__Group__6 ;
    public final void rule__BehaviorDescription__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5459:1: ( rule__BehaviorDescription__Group__5__Impl rule__BehaviorDescription__Group__6 )
            // InternalMyDsl.g:5460:2: rule__BehaviorDescription__Group__5__Impl rule__BehaviorDescription__Group__6
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:5467:1: rule__BehaviorDescription__Group__5__Impl : ( ( rule__BehaviorDescription__Group_5__0 )? ) ;
    public final void rule__BehaviorDescription__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5471:1: ( ( ( rule__BehaviorDescription__Group_5__0 )? ) )
            // InternalMyDsl.g:5472:1: ( ( rule__BehaviorDescription__Group_5__0 )? )
            {
            // InternalMyDsl.g:5472:1: ( ( rule__BehaviorDescription__Group_5__0 )? )
            // InternalMyDsl.g:5473:2: ( rule__BehaviorDescription__Group_5__0 )?
            {
             before(grammarAccess.getBehaviorDescriptionAccess().getGroup_5()); 
            // InternalMyDsl.g:5474:2: ( rule__BehaviorDescription__Group_5__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==46) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalMyDsl.g:5474:3: rule__BehaviorDescription__Group_5__0
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
    // InternalMyDsl.g:5482:1: rule__BehaviorDescription__Group__6 : rule__BehaviorDescription__Group__6__Impl rule__BehaviorDescription__Group__7 ;
    public final void rule__BehaviorDescription__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5486:1: ( rule__BehaviorDescription__Group__6__Impl rule__BehaviorDescription__Group__7 )
            // InternalMyDsl.g:5487:2: rule__BehaviorDescription__Group__6__Impl rule__BehaviorDescription__Group__7
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:5494:1: rule__BehaviorDescription__Group__6__Impl : ( ( rule__BehaviorDescription__Group_6__0 )? ) ;
    public final void rule__BehaviorDescription__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5498:1: ( ( ( rule__BehaviorDescription__Group_6__0 )? ) )
            // InternalMyDsl.g:5499:1: ( ( rule__BehaviorDescription__Group_6__0 )? )
            {
            // InternalMyDsl.g:5499:1: ( ( rule__BehaviorDescription__Group_6__0 )? )
            // InternalMyDsl.g:5500:2: ( rule__BehaviorDescription__Group_6__0 )?
            {
             before(grammarAccess.getBehaviorDescriptionAccess().getGroup_6()); 
            // InternalMyDsl.g:5501:2: ( rule__BehaviorDescription__Group_6__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==47) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalMyDsl.g:5501:3: rule__BehaviorDescription__Group_6__0
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
    // InternalMyDsl.g:5509:1: rule__BehaviorDescription__Group__7 : rule__BehaviorDescription__Group__7__Impl ;
    public final void rule__BehaviorDescription__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5513:1: ( rule__BehaviorDescription__Group__7__Impl )
            // InternalMyDsl.g:5514:2: rule__BehaviorDescription__Group__7__Impl
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
    // InternalMyDsl.g:5520:1: rule__BehaviorDescription__Group__7__Impl : ( '}' ) ;
    public final void rule__BehaviorDescription__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5524:1: ( ( '}' ) )
            // InternalMyDsl.g:5525:1: ( '}' )
            {
            // InternalMyDsl.g:5525:1: ( '}' )
            // InternalMyDsl.g:5526:2: '}'
            {
             before(grammarAccess.getBehaviorDescriptionAccess().getRightCurlyBracketKeyword_7()); 
            match(input,18,FOLLOW_2); 
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
    // InternalMyDsl.g:5536:1: rule__BehaviorDescription__Group_3__0 : rule__BehaviorDescription__Group_3__0__Impl rule__BehaviorDescription__Group_3__1 ;
    public final void rule__BehaviorDescription__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5540:1: ( rule__BehaviorDescription__Group_3__0__Impl rule__BehaviorDescription__Group_3__1 )
            // InternalMyDsl.g:5541:2: rule__BehaviorDescription__Group_3__0__Impl rule__BehaviorDescription__Group_3__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:5548:1: rule__BehaviorDescription__Group_3__0__Impl : ( 'calledServices' ) ;
    public final void rule__BehaviorDescription__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5552:1: ( ( 'calledServices' ) )
            // InternalMyDsl.g:5553:1: ( 'calledServices' )
            {
            // InternalMyDsl.g:5553:1: ( 'calledServices' )
            // InternalMyDsl.g:5554:2: 'calledServices'
            {
             before(grammarAccess.getBehaviorDescriptionAccess().getCalledServicesKeyword_3_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalMyDsl.g:5563:1: rule__BehaviorDescription__Group_3__1 : rule__BehaviorDescription__Group_3__1__Impl rule__BehaviorDescription__Group_3__2 ;
    public final void rule__BehaviorDescription__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5567:1: ( rule__BehaviorDescription__Group_3__1__Impl rule__BehaviorDescription__Group_3__2 )
            // InternalMyDsl.g:5568:2: rule__BehaviorDescription__Group_3__1__Impl rule__BehaviorDescription__Group_3__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:5575:1: rule__BehaviorDescription__Group_3__1__Impl : ( '(' ) ;
    public final void rule__BehaviorDescription__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5579:1: ( ( '(' ) )
            // InternalMyDsl.g:5580:1: ( '(' )
            {
            // InternalMyDsl.g:5580:1: ( '(' )
            // InternalMyDsl.g:5581:2: '('
            {
             before(grammarAccess.getBehaviorDescriptionAccess().getLeftParenthesisKeyword_3_1()); 
            match(input,16,FOLLOW_2); 
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
    // InternalMyDsl.g:5590:1: rule__BehaviorDescription__Group_3__2 : rule__BehaviorDescription__Group_3__2__Impl rule__BehaviorDescription__Group_3__3 ;
    public final void rule__BehaviorDescription__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5594:1: ( rule__BehaviorDescription__Group_3__2__Impl rule__BehaviorDescription__Group_3__3 )
            // InternalMyDsl.g:5595:2: rule__BehaviorDescription__Group_3__2__Impl rule__BehaviorDescription__Group_3__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:5602:1: rule__BehaviorDescription__Group_3__2__Impl : ( ( rule__BehaviorDescription__CalledServicesAssignment_3_2 ) ) ;
    public final void rule__BehaviorDescription__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5606:1: ( ( ( rule__BehaviorDescription__CalledServicesAssignment_3_2 ) ) )
            // InternalMyDsl.g:5607:1: ( ( rule__BehaviorDescription__CalledServicesAssignment_3_2 ) )
            {
            // InternalMyDsl.g:5607:1: ( ( rule__BehaviorDescription__CalledServicesAssignment_3_2 ) )
            // InternalMyDsl.g:5608:2: ( rule__BehaviorDescription__CalledServicesAssignment_3_2 )
            {
             before(grammarAccess.getBehaviorDescriptionAccess().getCalledServicesAssignment_3_2()); 
            // InternalMyDsl.g:5609:2: ( rule__BehaviorDescription__CalledServicesAssignment_3_2 )
            // InternalMyDsl.g:5609:3: rule__BehaviorDescription__CalledServicesAssignment_3_2
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
    // InternalMyDsl.g:5617:1: rule__BehaviorDescription__Group_3__3 : rule__BehaviorDescription__Group_3__3__Impl rule__BehaviorDescription__Group_3__4 ;
    public final void rule__BehaviorDescription__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5621:1: ( rule__BehaviorDescription__Group_3__3__Impl rule__BehaviorDescription__Group_3__4 )
            // InternalMyDsl.g:5622:2: rule__BehaviorDescription__Group_3__3__Impl rule__BehaviorDescription__Group_3__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:5629:1: rule__BehaviorDescription__Group_3__3__Impl : ( ( rule__BehaviorDescription__Group_3_3__0 )* ) ;
    public final void rule__BehaviorDescription__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5633:1: ( ( ( rule__BehaviorDescription__Group_3_3__0 )* ) )
            // InternalMyDsl.g:5634:1: ( ( rule__BehaviorDescription__Group_3_3__0 )* )
            {
            // InternalMyDsl.g:5634:1: ( ( rule__BehaviorDescription__Group_3_3__0 )* )
            // InternalMyDsl.g:5635:2: ( rule__BehaviorDescription__Group_3_3__0 )*
            {
             before(grammarAccess.getBehaviorDescriptionAccess().getGroup_3_3()); 
            // InternalMyDsl.g:5636:2: ( rule__BehaviorDescription__Group_3_3__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==19) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalMyDsl.g:5636:3: rule__BehaviorDescription__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__BehaviorDescription__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
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
    // InternalMyDsl.g:5644:1: rule__BehaviorDescription__Group_3__4 : rule__BehaviorDescription__Group_3__4__Impl ;
    public final void rule__BehaviorDescription__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5648:1: ( rule__BehaviorDescription__Group_3__4__Impl )
            // InternalMyDsl.g:5649:2: rule__BehaviorDescription__Group_3__4__Impl
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
    // InternalMyDsl.g:5655:1: rule__BehaviorDescription__Group_3__4__Impl : ( ')' ) ;
    public final void rule__BehaviorDescription__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5659:1: ( ( ')' ) )
            // InternalMyDsl.g:5660:1: ( ')' )
            {
            // InternalMyDsl.g:5660:1: ( ')' )
            // InternalMyDsl.g:5661:2: ')'
            {
             before(grammarAccess.getBehaviorDescriptionAccess().getRightParenthesisKeyword_3_4()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyDsl.g:5671:1: rule__BehaviorDescription__Group_3_3__0 : rule__BehaviorDescription__Group_3_3__0__Impl rule__BehaviorDescription__Group_3_3__1 ;
    public final void rule__BehaviorDescription__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5675:1: ( rule__BehaviorDescription__Group_3_3__0__Impl rule__BehaviorDescription__Group_3_3__1 )
            // InternalMyDsl.g:5676:2: rule__BehaviorDescription__Group_3_3__0__Impl rule__BehaviorDescription__Group_3_3__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:5683:1: rule__BehaviorDescription__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__BehaviorDescription__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5687:1: ( ( ',' ) )
            // InternalMyDsl.g:5688:1: ( ',' )
            {
            // InternalMyDsl.g:5688:1: ( ',' )
            // InternalMyDsl.g:5689:2: ','
            {
             before(grammarAccess.getBehaviorDescriptionAccess().getCommaKeyword_3_3_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalMyDsl.g:5698:1: rule__BehaviorDescription__Group_3_3__1 : rule__BehaviorDescription__Group_3_3__1__Impl ;
    public final void rule__BehaviorDescription__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5702:1: ( rule__BehaviorDescription__Group_3_3__1__Impl )
            // InternalMyDsl.g:5703:2: rule__BehaviorDescription__Group_3_3__1__Impl
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
    // InternalMyDsl.g:5709:1: rule__BehaviorDescription__Group_3_3__1__Impl : ( ( rule__BehaviorDescription__CalledServicesAssignment_3_3_1 ) ) ;
    public final void rule__BehaviorDescription__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5713:1: ( ( ( rule__BehaviorDescription__CalledServicesAssignment_3_3_1 ) ) )
            // InternalMyDsl.g:5714:1: ( ( rule__BehaviorDescription__CalledServicesAssignment_3_3_1 ) )
            {
            // InternalMyDsl.g:5714:1: ( ( rule__BehaviorDescription__CalledServicesAssignment_3_3_1 ) )
            // InternalMyDsl.g:5715:2: ( rule__BehaviorDescription__CalledServicesAssignment_3_3_1 )
            {
             before(grammarAccess.getBehaviorDescriptionAccess().getCalledServicesAssignment_3_3_1()); 
            // InternalMyDsl.g:5716:2: ( rule__BehaviorDescription__CalledServicesAssignment_3_3_1 )
            // InternalMyDsl.g:5716:3: rule__BehaviorDescription__CalledServicesAssignment_3_3_1
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
    // InternalMyDsl.g:5725:1: rule__BehaviorDescription__Group_4__0 : rule__BehaviorDescription__Group_4__0__Impl rule__BehaviorDescription__Group_4__1 ;
    public final void rule__BehaviorDescription__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5729:1: ( rule__BehaviorDescription__Group_4__0__Impl rule__BehaviorDescription__Group_4__1 )
            // InternalMyDsl.g:5730:2: rule__BehaviorDescription__Group_4__0__Impl rule__BehaviorDescription__Group_4__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalMyDsl.g:5737:1: rule__BehaviorDescription__Group_4__0__Impl : ( 'internalActions' ) ;
    public final void rule__BehaviorDescription__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5741:1: ( ( 'internalActions' ) )
            // InternalMyDsl.g:5742:1: ( 'internalActions' )
            {
            // InternalMyDsl.g:5742:1: ( 'internalActions' )
            // InternalMyDsl.g:5743:2: 'internalActions'
            {
             before(grammarAccess.getBehaviorDescriptionAccess().getInternalActionsKeyword_4_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalMyDsl.g:5752:1: rule__BehaviorDescription__Group_4__1 : rule__BehaviorDescription__Group_4__1__Impl ;
    public final void rule__BehaviorDescription__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5756:1: ( rule__BehaviorDescription__Group_4__1__Impl )
            // InternalMyDsl.g:5757:2: rule__BehaviorDescription__Group_4__1__Impl
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
    // InternalMyDsl.g:5763:1: rule__BehaviorDescription__Group_4__1__Impl : ( ( rule__BehaviorDescription__InternalActionsAssignment_4_1 ) ) ;
    public final void rule__BehaviorDescription__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5767:1: ( ( ( rule__BehaviorDescription__InternalActionsAssignment_4_1 ) ) )
            // InternalMyDsl.g:5768:1: ( ( rule__BehaviorDescription__InternalActionsAssignment_4_1 ) )
            {
            // InternalMyDsl.g:5768:1: ( ( rule__BehaviorDescription__InternalActionsAssignment_4_1 ) )
            // InternalMyDsl.g:5769:2: ( rule__BehaviorDescription__InternalActionsAssignment_4_1 )
            {
             before(grammarAccess.getBehaviorDescriptionAccess().getInternalActionsAssignment_4_1()); 
            // InternalMyDsl.g:5770:2: ( rule__BehaviorDescription__InternalActionsAssignment_4_1 )
            // InternalMyDsl.g:5770:3: rule__BehaviorDescription__InternalActionsAssignment_4_1
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
    // InternalMyDsl.g:5779:1: rule__BehaviorDescription__Group_5__0 : rule__BehaviorDescription__Group_5__0__Impl rule__BehaviorDescription__Group_5__1 ;
    public final void rule__BehaviorDescription__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5783:1: ( rule__BehaviorDescription__Group_5__0__Impl rule__BehaviorDescription__Group_5__1 )
            // InternalMyDsl.g:5784:2: rule__BehaviorDescription__Group_5__0__Impl rule__BehaviorDescription__Group_5__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalMyDsl.g:5791:1: rule__BehaviorDescription__Group_5__0__Impl : ( 'loops' ) ;
    public final void rule__BehaviorDescription__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5795:1: ( ( 'loops' ) )
            // InternalMyDsl.g:5796:1: ( 'loops' )
            {
            // InternalMyDsl.g:5796:1: ( 'loops' )
            // InternalMyDsl.g:5797:2: 'loops'
            {
             before(grammarAccess.getBehaviorDescriptionAccess().getLoopsKeyword_5_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalMyDsl.g:5806:1: rule__BehaviorDescription__Group_5__1 : rule__BehaviorDescription__Group_5__1__Impl ;
    public final void rule__BehaviorDescription__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5810:1: ( rule__BehaviorDescription__Group_5__1__Impl )
            // InternalMyDsl.g:5811:2: rule__BehaviorDescription__Group_5__1__Impl
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
    // InternalMyDsl.g:5817:1: rule__BehaviorDescription__Group_5__1__Impl : ( ( rule__BehaviorDescription__LoopsAssignment_5_1 ) ) ;
    public final void rule__BehaviorDescription__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5821:1: ( ( ( rule__BehaviorDescription__LoopsAssignment_5_1 ) ) )
            // InternalMyDsl.g:5822:1: ( ( rule__BehaviorDescription__LoopsAssignment_5_1 ) )
            {
            // InternalMyDsl.g:5822:1: ( ( rule__BehaviorDescription__LoopsAssignment_5_1 ) )
            // InternalMyDsl.g:5823:2: ( rule__BehaviorDescription__LoopsAssignment_5_1 )
            {
             before(grammarAccess.getBehaviorDescriptionAccess().getLoopsAssignment_5_1()); 
            // InternalMyDsl.g:5824:2: ( rule__BehaviorDescription__LoopsAssignment_5_1 )
            // InternalMyDsl.g:5824:3: rule__BehaviorDescription__LoopsAssignment_5_1
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
    // InternalMyDsl.g:5833:1: rule__BehaviorDescription__Group_6__0 : rule__BehaviorDescription__Group_6__0__Impl rule__BehaviorDescription__Group_6__1 ;
    public final void rule__BehaviorDescription__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5837:1: ( rule__BehaviorDescription__Group_6__0__Impl rule__BehaviorDescription__Group_6__1 )
            // InternalMyDsl.g:5838:2: rule__BehaviorDescription__Group_6__0__Impl rule__BehaviorDescription__Group_6__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalMyDsl.g:5845:1: rule__BehaviorDescription__Group_6__0__Impl : ( 'branches' ) ;
    public final void rule__BehaviorDescription__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5849:1: ( ( 'branches' ) )
            // InternalMyDsl.g:5850:1: ( 'branches' )
            {
            // InternalMyDsl.g:5850:1: ( 'branches' )
            // InternalMyDsl.g:5851:2: 'branches'
            {
             before(grammarAccess.getBehaviorDescriptionAccess().getBranchesKeyword_6_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalMyDsl.g:5860:1: rule__BehaviorDescription__Group_6__1 : rule__BehaviorDescription__Group_6__1__Impl ;
    public final void rule__BehaviorDescription__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5864:1: ( rule__BehaviorDescription__Group_6__1__Impl )
            // InternalMyDsl.g:5865:2: rule__BehaviorDescription__Group_6__1__Impl
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
    // InternalMyDsl.g:5871:1: rule__BehaviorDescription__Group_6__1__Impl : ( ( rule__BehaviorDescription__BranchesAssignment_6_1 ) ) ;
    public final void rule__BehaviorDescription__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5875:1: ( ( ( rule__BehaviorDescription__BranchesAssignment_6_1 ) ) )
            // InternalMyDsl.g:5876:1: ( ( rule__BehaviorDescription__BranchesAssignment_6_1 ) )
            {
            // InternalMyDsl.g:5876:1: ( ( rule__BehaviorDescription__BranchesAssignment_6_1 ) )
            // InternalMyDsl.g:5877:2: ( rule__BehaviorDescription__BranchesAssignment_6_1 )
            {
             before(grammarAccess.getBehaviorDescriptionAccess().getBranchesAssignment_6_1()); 
            // InternalMyDsl.g:5878:2: ( rule__BehaviorDescription__BranchesAssignment_6_1 )
            // InternalMyDsl.g:5878:3: rule__BehaviorDescription__BranchesAssignment_6_1
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
    // InternalMyDsl.g:5887:1: rule__CompositeComponent__Group__0 : rule__CompositeComponent__Group__0__Impl rule__CompositeComponent__Group__1 ;
    public final void rule__CompositeComponent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5891:1: ( rule__CompositeComponent__Group__0__Impl rule__CompositeComponent__Group__1 )
            // InternalMyDsl.g:5892:2: rule__CompositeComponent__Group__0__Impl rule__CompositeComponent__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:5899:1: rule__CompositeComponent__Group__0__Impl : ( 'CompositeComponent' ) ;
    public final void rule__CompositeComponent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5903:1: ( ( 'CompositeComponent' ) )
            // InternalMyDsl.g:5904:1: ( 'CompositeComponent' )
            {
            // InternalMyDsl.g:5904:1: ( 'CompositeComponent' )
            // InternalMyDsl.g:5905:2: 'CompositeComponent'
            {
             before(grammarAccess.getCompositeComponentAccess().getCompositeComponentKeyword_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalMyDsl.g:5914:1: rule__CompositeComponent__Group__1 : rule__CompositeComponent__Group__1__Impl rule__CompositeComponent__Group__2 ;
    public final void rule__CompositeComponent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5918:1: ( rule__CompositeComponent__Group__1__Impl rule__CompositeComponent__Group__2 )
            // InternalMyDsl.g:5919:2: rule__CompositeComponent__Group__1__Impl rule__CompositeComponent__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:5926:1: rule__CompositeComponent__Group__1__Impl : ( ( rule__CompositeComponent__NameAssignment_1 ) ) ;
    public final void rule__CompositeComponent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5930:1: ( ( ( rule__CompositeComponent__NameAssignment_1 ) ) )
            // InternalMyDsl.g:5931:1: ( ( rule__CompositeComponent__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:5931:1: ( ( rule__CompositeComponent__NameAssignment_1 ) )
            // InternalMyDsl.g:5932:2: ( rule__CompositeComponent__NameAssignment_1 )
            {
             before(grammarAccess.getCompositeComponentAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:5933:2: ( rule__CompositeComponent__NameAssignment_1 )
            // InternalMyDsl.g:5933:3: rule__CompositeComponent__NameAssignment_1
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
    // InternalMyDsl.g:5941:1: rule__CompositeComponent__Group__2 : rule__CompositeComponent__Group__2__Impl rule__CompositeComponent__Group__3 ;
    public final void rule__CompositeComponent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5945:1: ( rule__CompositeComponent__Group__2__Impl rule__CompositeComponent__Group__3 )
            // InternalMyDsl.g:5946:2: rule__CompositeComponent__Group__2__Impl rule__CompositeComponent__Group__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalMyDsl.g:5953:1: rule__CompositeComponent__Group__2__Impl : ( '{' ) ;
    public final void rule__CompositeComponent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5957:1: ( ( '{' ) )
            // InternalMyDsl.g:5958:1: ( '{' )
            {
            // InternalMyDsl.g:5958:1: ( '{' )
            // InternalMyDsl.g:5959:2: '{'
            {
             before(grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
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
    // InternalMyDsl.g:5968:1: rule__CompositeComponent__Group__3 : rule__CompositeComponent__Group__3__Impl rule__CompositeComponent__Group__4 ;
    public final void rule__CompositeComponent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5972:1: ( rule__CompositeComponent__Group__3__Impl rule__CompositeComponent__Group__4 )
            // InternalMyDsl.g:5973:2: rule__CompositeComponent__Group__3__Impl rule__CompositeComponent__Group__4
            {
            pushFollow(FOLLOW_27);
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
    // InternalMyDsl.g:5980:1: rule__CompositeComponent__Group__3__Impl : ( ( rule__CompositeComponent__Group_3__0 )? ) ;
    public final void rule__CompositeComponent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5984:1: ( ( ( rule__CompositeComponent__Group_3__0 )? ) )
            // InternalMyDsl.g:5985:1: ( ( rule__CompositeComponent__Group_3__0 )? )
            {
            // InternalMyDsl.g:5985:1: ( ( rule__CompositeComponent__Group_3__0 )? )
            // InternalMyDsl.g:5986:2: ( rule__CompositeComponent__Group_3__0 )?
            {
             before(grammarAccess.getCompositeComponentAccess().getGroup_3()); 
            // InternalMyDsl.g:5987:2: ( rule__CompositeComponent__Group_3__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==38) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMyDsl.g:5987:3: rule__CompositeComponent__Group_3__0
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
    // InternalMyDsl.g:5995:1: rule__CompositeComponent__Group__4 : rule__CompositeComponent__Group__4__Impl rule__CompositeComponent__Group__5 ;
    public final void rule__CompositeComponent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5999:1: ( rule__CompositeComponent__Group__4__Impl rule__CompositeComponent__Group__5 )
            // InternalMyDsl.g:6000:2: rule__CompositeComponent__Group__4__Impl rule__CompositeComponent__Group__5
            {
            pushFollow(FOLLOW_27);
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
    // InternalMyDsl.g:6007:1: rule__CompositeComponent__Group__4__Impl : ( ( rule__CompositeComponent__Group_4__0 )? ) ;
    public final void rule__CompositeComponent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6011:1: ( ( ( rule__CompositeComponent__Group_4__0 )? ) )
            // InternalMyDsl.g:6012:1: ( ( rule__CompositeComponent__Group_4__0 )? )
            {
            // InternalMyDsl.g:6012:1: ( ( rule__CompositeComponent__Group_4__0 )? )
            // InternalMyDsl.g:6013:2: ( rule__CompositeComponent__Group_4__0 )?
            {
             before(grammarAccess.getCompositeComponentAccess().getGroup_4()); 
            // InternalMyDsl.g:6014:2: ( rule__CompositeComponent__Group_4__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==39) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalMyDsl.g:6014:3: rule__CompositeComponent__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompositeComponent__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompositeComponentAccess().getGroup_4()); 

            }


            }

        }
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
    // InternalMyDsl.g:6022:1: rule__CompositeComponent__Group__5 : rule__CompositeComponent__Group__5__Impl rule__CompositeComponent__Group__6 ;
    public final void rule__CompositeComponent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6026:1: ( rule__CompositeComponent__Group__5__Impl rule__CompositeComponent__Group__6 )
            // InternalMyDsl.g:6027:2: rule__CompositeComponent__Group__5__Impl rule__CompositeComponent__Group__6
            {
            pushFollow(FOLLOW_27);
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
    // InternalMyDsl.g:6034:1: rule__CompositeComponent__Group__5__Impl : ( ( rule__CompositeComponent__Group_5__0 )? ) ;
    public final void rule__CompositeComponent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6038:1: ( ( ( rule__CompositeComponent__Group_5__0 )? ) )
            // InternalMyDsl.g:6039:1: ( ( rule__CompositeComponent__Group_5__0 )? )
            {
            // InternalMyDsl.g:6039:1: ( ( rule__CompositeComponent__Group_5__0 )? )
            // InternalMyDsl.g:6040:2: ( rule__CompositeComponent__Group_5__0 )?
            {
             before(grammarAccess.getCompositeComponentAccess().getGroup_5()); 
            // InternalMyDsl.g:6041:2: ( rule__CompositeComponent__Group_5__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==40) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalMyDsl.g:6041:3: rule__CompositeComponent__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompositeComponent__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompositeComponentAccess().getGroup_5()); 

            }


            }

        }
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
    // InternalMyDsl.g:6049:1: rule__CompositeComponent__Group__6 : rule__CompositeComponent__Group__6__Impl rule__CompositeComponent__Group__7 ;
    public final void rule__CompositeComponent__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6053:1: ( rule__CompositeComponent__Group__6__Impl rule__CompositeComponent__Group__7 )
            // InternalMyDsl.g:6054:2: rule__CompositeComponent__Group__6__Impl rule__CompositeComponent__Group__7
            {
            pushFollow(FOLLOW_27);
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
    // InternalMyDsl.g:6061:1: rule__CompositeComponent__Group__6__Impl : ( ( rule__CompositeComponent__Group_6__0 )? ) ;
    public final void rule__CompositeComponent__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6065:1: ( ( ( rule__CompositeComponent__Group_6__0 )? ) )
            // InternalMyDsl.g:6066:1: ( ( rule__CompositeComponent__Group_6__0 )? )
            {
            // InternalMyDsl.g:6066:1: ( ( rule__CompositeComponent__Group_6__0 )? )
            // InternalMyDsl.g:6067:2: ( rule__CompositeComponent__Group_6__0 )?
            {
             before(grammarAccess.getCompositeComponentAccess().getGroup_6()); 
            // InternalMyDsl.g:6068:2: ( rule__CompositeComponent__Group_6__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==41) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalMyDsl.g:6068:3: rule__CompositeComponent__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompositeComponent__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompositeComponentAccess().getGroup_6()); 

            }


            }

        }
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
    // InternalMyDsl.g:6076:1: rule__CompositeComponent__Group__7 : rule__CompositeComponent__Group__7__Impl rule__CompositeComponent__Group__8 ;
    public final void rule__CompositeComponent__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6080:1: ( rule__CompositeComponent__Group__7__Impl rule__CompositeComponent__Group__8 )
            // InternalMyDsl.g:6081:2: rule__CompositeComponent__Group__7__Impl rule__CompositeComponent__Group__8
            {
            pushFollow(FOLLOW_27);
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
    // InternalMyDsl.g:6088:1: rule__CompositeComponent__Group__7__Impl : ( ( rule__CompositeComponent__Group_7__0 )? ) ;
    public final void rule__CompositeComponent__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6092:1: ( ( ( rule__CompositeComponent__Group_7__0 )? ) )
            // InternalMyDsl.g:6093:1: ( ( rule__CompositeComponent__Group_7__0 )? )
            {
            // InternalMyDsl.g:6093:1: ( ( rule__CompositeComponent__Group_7__0 )? )
            // InternalMyDsl.g:6094:2: ( rule__CompositeComponent__Group_7__0 )?
            {
             before(grammarAccess.getCompositeComponentAccess().getGroup_7()); 
            // InternalMyDsl.g:6095:2: ( rule__CompositeComponent__Group_7__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==42) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalMyDsl.g:6095:3: rule__CompositeComponent__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompositeComponent__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

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
    // InternalMyDsl.g:6103:1: rule__CompositeComponent__Group__8 : rule__CompositeComponent__Group__8__Impl rule__CompositeComponent__Group__9 ;
    public final void rule__CompositeComponent__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6107:1: ( rule__CompositeComponent__Group__8__Impl rule__CompositeComponent__Group__9 )
            // InternalMyDsl.g:6108:2: rule__CompositeComponent__Group__8__Impl rule__CompositeComponent__Group__9
            {
            pushFollow(FOLLOW_27);
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
    // InternalMyDsl.g:6115:1: rule__CompositeComponent__Group__8__Impl : ( ( rule__CompositeComponent__Group_8__0 )? ) ;
    public final void rule__CompositeComponent__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6119:1: ( ( ( rule__CompositeComponent__Group_8__0 )? ) )
            // InternalMyDsl.g:6120:1: ( ( rule__CompositeComponent__Group_8__0 )? )
            {
            // InternalMyDsl.g:6120:1: ( ( rule__CompositeComponent__Group_8__0 )? )
            // InternalMyDsl.g:6121:2: ( rule__CompositeComponent__Group_8__0 )?
            {
             before(grammarAccess.getCompositeComponentAccess().getGroup_8()); 
            // InternalMyDsl.g:6122:2: ( rule__CompositeComponent__Group_8__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==27) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalMyDsl.g:6122:3: rule__CompositeComponent__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompositeComponent__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompositeComponentAccess().getGroup_8()); 

            }


            }

        }
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
    // InternalMyDsl.g:6130:1: rule__CompositeComponent__Group__9 : rule__CompositeComponent__Group__9__Impl ;
    public final void rule__CompositeComponent__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6134:1: ( rule__CompositeComponent__Group__9__Impl )
            // InternalMyDsl.g:6135:2: rule__CompositeComponent__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group__9__Impl();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:6141:1: rule__CompositeComponent__Group__9__Impl : ( '}' ) ;
    public final void rule__CompositeComponent__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6145:1: ( ( '}' ) )
            // InternalMyDsl.g:6146:1: ( '}' )
            {
            // InternalMyDsl.g:6146:1: ( '}' )
            // InternalMyDsl.g:6147:2: '}'
            {
             before(grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_9()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
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


    // $ANTLR start "rule__CompositeComponent__Group_3__0"
    // InternalMyDsl.g:6157:1: rule__CompositeComponent__Group_3__0 : rule__CompositeComponent__Group_3__0__Impl rule__CompositeComponent__Group_3__1 ;
    public final void rule__CompositeComponent__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6161:1: ( rule__CompositeComponent__Group_3__0__Impl rule__CompositeComponent__Group_3__1 )
            // InternalMyDsl.g:6162:2: rule__CompositeComponent__Group_3__0__Impl rule__CompositeComponent__Group_3__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:6169:1: rule__CompositeComponent__Group_3__0__Impl : ( 'requiredInterface' ) ;
    public final void rule__CompositeComponent__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6173:1: ( ( 'requiredInterface' ) )
            // InternalMyDsl.g:6174:1: ( 'requiredInterface' )
            {
            // InternalMyDsl.g:6174:1: ( 'requiredInterface' )
            // InternalMyDsl.g:6175:2: 'requiredInterface'
            {
             before(grammarAccess.getCompositeComponentAccess().getRequiredInterfaceKeyword_3_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalMyDsl.g:6184:1: rule__CompositeComponent__Group_3__1 : rule__CompositeComponent__Group_3__1__Impl rule__CompositeComponent__Group_3__2 ;
    public final void rule__CompositeComponent__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6188:1: ( rule__CompositeComponent__Group_3__1__Impl rule__CompositeComponent__Group_3__2 )
            // InternalMyDsl.g:6189:2: rule__CompositeComponent__Group_3__1__Impl rule__CompositeComponent__Group_3__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:6196:1: rule__CompositeComponent__Group_3__1__Impl : ( '(' ) ;
    public final void rule__CompositeComponent__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6200:1: ( ( '(' ) )
            // InternalMyDsl.g:6201:1: ( '(' )
            {
            // InternalMyDsl.g:6201:1: ( '(' )
            // InternalMyDsl.g:6202:2: '('
            {
             before(grammarAccess.getCompositeComponentAccess().getLeftParenthesisKeyword_3_1()); 
            match(input,16,FOLLOW_2); 
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
    // InternalMyDsl.g:6211:1: rule__CompositeComponent__Group_3__2 : rule__CompositeComponent__Group_3__2__Impl rule__CompositeComponent__Group_3__3 ;
    public final void rule__CompositeComponent__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6215:1: ( rule__CompositeComponent__Group_3__2__Impl rule__CompositeComponent__Group_3__3 )
            // InternalMyDsl.g:6216:2: rule__CompositeComponent__Group_3__2__Impl rule__CompositeComponent__Group_3__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:6223:1: rule__CompositeComponent__Group_3__2__Impl : ( ( rule__CompositeComponent__RequiredInterfaceAssignment_3_2 ) ) ;
    public final void rule__CompositeComponent__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6227:1: ( ( ( rule__CompositeComponent__RequiredInterfaceAssignment_3_2 ) ) )
            // InternalMyDsl.g:6228:1: ( ( rule__CompositeComponent__RequiredInterfaceAssignment_3_2 ) )
            {
            // InternalMyDsl.g:6228:1: ( ( rule__CompositeComponent__RequiredInterfaceAssignment_3_2 ) )
            // InternalMyDsl.g:6229:2: ( rule__CompositeComponent__RequiredInterfaceAssignment_3_2 )
            {
             before(grammarAccess.getCompositeComponentAccess().getRequiredInterfaceAssignment_3_2()); 
            // InternalMyDsl.g:6230:2: ( rule__CompositeComponent__RequiredInterfaceAssignment_3_2 )
            // InternalMyDsl.g:6230:3: rule__CompositeComponent__RequiredInterfaceAssignment_3_2
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
    // InternalMyDsl.g:6238:1: rule__CompositeComponent__Group_3__3 : rule__CompositeComponent__Group_3__3__Impl rule__CompositeComponent__Group_3__4 ;
    public final void rule__CompositeComponent__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6242:1: ( rule__CompositeComponent__Group_3__3__Impl rule__CompositeComponent__Group_3__4 )
            // InternalMyDsl.g:6243:2: rule__CompositeComponent__Group_3__3__Impl rule__CompositeComponent__Group_3__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:6250:1: rule__CompositeComponent__Group_3__3__Impl : ( ( rule__CompositeComponent__Group_3_3__0 )* ) ;
    public final void rule__CompositeComponent__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6254:1: ( ( ( rule__CompositeComponent__Group_3_3__0 )* ) )
            // InternalMyDsl.g:6255:1: ( ( rule__CompositeComponent__Group_3_3__0 )* )
            {
            // InternalMyDsl.g:6255:1: ( ( rule__CompositeComponent__Group_3_3__0 )* )
            // InternalMyDsl.g:6256:2: ( rule__CompositeComponent__Group_3_3__0 )*
            {
             before(grammarAccess.getCompositeComponentAccess().getGroup_3_3()); 
            // InternalMyDsl.g:6257:2: ( rule__CompositeComponent__Group_3_3__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==19) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalMyDsl.g:6257:3: rule__CompositeComponent__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__CompositeComponent__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
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
    // InternalMyDsl.g:6265:1: rule__CompositeComponent__Group_3__4 : rule__CompositeComponent__Group_3__4__Impl ;
    public final void rule__CompositeComponent__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6269:1: ( rule__CompositeComponent__Group_3__4__Impl )
            // InternalMyDsl.g:6270:2: rule__CompositeComponent__Group_3__4__Impl
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
    // InternalMyDsl.g:6276:1: rule__CompositeComponent__Group_3__4__Impl : ( ')' ) ;
    public final void rule__CompositeComponent__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6280:1: ( ( ')' ) )
            // InternalMyDsl.g:6281:1: ( ')' )
            {
            // InternalMyDsl.g:6281:1: ( ')' )
            // InternalMyDsl.g:6282:2: ')'
            {
             before(grammarAccess.getCompositeComponentAccess().getRightParenthesisKeyword_3_4()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyDsl.g:6292:1: rule__CompositeComponent__Group_3_3__0 : rule__CompositeComponent__Group_3_3__0__Impl rule__CompositeComponent__Group_3_3__1 ;
    public final void rule__CompositeComponent__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6296:1: ( rule__CompositeComponent__Group_3_3__0__Impl rule__CompositeComponent__Group_3_3__1 )
            // InternalMyDsl.g:6297:2: rule__CompositeComponent__Group_3_3__0__Impl rule__CompositeComponent__Group_3_3__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:6304:1: rule__CompositeComponent__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__CompositeComponent__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6308:1: ( ( ',' ) )
            // InternalMyDsl.g:6309:1: ( ',' )
            {
            // InternalMyDsl.g:6309:1: ( ',' )
            // InternalMyDsl.g:6310:2: ','
            {
             before(grammarAccess.getCompositeComponentAccess().getCommaKeyword_3_3_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalMyDsl.g:6319:1: rule__CompositeComponent__Group_3_3__1 : rule__CompositeComponent__Group_3_3__1__Impl ;
    public final void rule__CompositeComponent__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6323:1: ( rule__CompositeComponent__Group_3_3__1__Impl )
            // InternalMyDsl.g:6324:2: rule__CompositeComponent__Group_3_3__1__Impl
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
    // InternalMyDsl.g:6330:1: rule__CompositeComponent__Group_3_3__1__Impl : ( ( rule__CompositeComponent__RequiredInterfaceAssignment_3_3_1 ) ) ;
    public final void rule__CompositeComponent__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6334:1: ( ( ( rule__CompositeComponent__RequiredInterfaceAssignment_3_3_1 ) ) )
            // InternalMyDsl.g:6335:1: ( ( rule__CompositeComponent__RequiredInterfaceAssignment_3_3_1 ) )
            {
            // InternalMyDsl.g:6335:1: ( ( rule__CompositeComponent__RequiredInterfaceAssignment_3_3_1 ) )
            // InternalMyDsl.g:6336:2: ( rule__CompositeComponent__RequiredInterfaceAssignment_3_3_1 )
            {
             before(grammarAccess.getCompositeComponentAccess().getRequiredInterfaceAssignment_3_3_1()); 
            // InternalMyDsl.g:6337:2: ( rule__CompositeComponent__RequiredInterfaceAssignment_3_3_1 )
            // InternalMyDsl.g:6337:3: rule__CompositeComponent__RequiredInterfaceAssignment_3_3_1
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


    // $ANTLR start "rule__CompositeComponent__Group_4__0"
    // InternalMyDsl.g:6346:1: rule__CompositeComponent__Group_4__0 : rule__CompositeComponent__Group_4__0__Impl rule__CompositeComponent__Group_4__1 ;
    public final void rule__CompositeComponent__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6350:1: ( rule__CompositeComponent__Group_4__0__Impl rule__CompositeComponent__Group_4__1 )
            // InternalMyDsl.g:6351:2: rule__CompositeComponent__Group_4__0__Impl rule__CompositeComponent__Group_4__1
            {
            pushFollow(FOLLOW_8);
            rule__CompositeComponent__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_4__0"


    // $ANTLR start "rule__CompositeComponent__Group_4__0__Impl"
    // InternalMyDsl.g:6358:1: rule__CompositeComponent__Group_4__0__Impl : ( 'requiredService' ) ;
    public final void rule__CompositeComponent__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6362:1: ( ( 'requiredService' ) )
            // InternalMyDsl.g:6363:1: ( 'requiredService' )
            {
            // InternalMyDsl.g:6363:1: ( 'requiredService' )
            // InternalMyDsl.g:6364:2: 'requiredService'
            {
             before(grammarAccess.getCompositeComponentAccess().getRequiredServiceKeyword_4_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getRequiredServiceKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_4__0__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_4__1"
    // InternalMyDsl.g:6373:1: rule__CompositeComponent__Group_4__1 : rule__CompositeComponent__Group_4__1__Impl rule__CompositeComponent__Group_4__2 ;
    public final void rule__CompositeComponent__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6377:1: ( rule__CompositeComponent__Group_4__1__Impl rule__CompositeComponent__Group_4__2 )
            // InternalMyDsl.g:6378:2: rule__CompositeComponent__Group_4__1__Impl rule__CompositeComponent__Group_4__2
            {
            pushFollow(FOLLOW_9);
            rule__CompositeComponent__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_4__1"


    // $ANTLR start "rule__CompositeComponent__Group_4__1__Impl"
    // InternalMyDsl.g:6385:1: rule__CompositeComponent__Group_4__1__Impl : ( '(' ) ;
    public final void rule__CompositeComponent__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6389:1: ( ( '(' ) )
            // InternalMyDsl.g:6390:1: ( '(' )
            {
            // InternalMyDsl.g:6390:1: ( '(' )
            // InternalMyDsl.g:6391:2: '('
            {
             before(grammarAccess.getCompositeComponentAccess().getLeftParenthesisKeyword_4_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getLeftParenthesisKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_4__1__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_4__2"
    // InternalMyDsl.g:6400:1: rule__CompositeComponent__Group_4__2 : rule__CompositeComponent__Group_4__2__Impl rule__CompositeComponent__Group_4__3 ;
    public final void rule__CompositeComponent__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6404:1: ( rule__CompositeComponent__Group_4__2__Impl rule__CompositeComponent__Group_4__3 )
            // InternalMyDsl.g:6405:2: rule__CompositeComponent__Group_4__2__Impl rule__CompositeComponent__Group_4__3
            {
            pushFollow(FOLLOW_10);
            rule__CompositeComponent__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_4__2"


    // $ANTLR start "rule__CompositeComponent__Group_4__2__Impl"
    // InternalMyDsl.g:6412:1: rule__CompositeComponent__Group_4__2__Impl : ( ( rule__CompositeComponent__RequiredServiceAssignment_4_2 ) ) ;
    public final void rule__CompositeComponent__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6416:1: ( ( ( rule__CompositeComponent__RequiredServiceAssignment_4_2 ) ) )
            // InternalMyDsl.g:6417:1: ( ( rule__CompositeComponent__RequiredServiceAssignment_4_2 ) )
            {
            // InternalMyDsl.g:6417:1: ( ( rule__CompositeComponent__RequiredServiceAssignment_4_2 ) )
            // InternalMyDsl.g:6418:2: ( rule__CompositeComponent__RequiredServiceAssignment_4_2 )
            {
             before(grammarAccess.getCompositeComponentAccess().getRequiredServiceAssignment_4_2()); 
            // InternalMyDsl.g:6419:2: ( rule__CompositeComponent__RequiredServiceAssignment_4_2 )
            // InternalMyDsl.g:6419:3: rule__CompositeComponent__RequiredServiceAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__RequiredServiceAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getCompositeComponentAccess().getRequiredServiceAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_4__2__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_4__3"
    // InternalMyDsl.g:6427:1: rule__CompositeComponent__Group_4__3 : rule__CompositeComponent__Group_4__3__Impl rule__CompositeComponent__Group_4__4 ;
    public final void rule__CompositeComponent__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6431:1: ( rule__CompositeComponent__Group_4__3__Impl rule__CompositeComponent__Group_4__4 )
            // InternalMyDsl.g:6432:2: rule__CompositeComponent__Group_4__3__Impl rule__CompositeComponent__Group_4__4
            {
            pushFollow(FOLLOW_10);
            rule__CompositeComponent__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_4__3"


    // $ANTLR start "rule__CompositeComponent__Group_4__3__Impl"
    // InternalMyDsl.g:6439:1: rule__CompositeComponent__Group_4__3__Impl : ( ( rule__CompositeComponent__Group_4_3__0 )* ) ;
    public final void rule__CompositeComponent__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6443:1: ( ( ( rule__CompositeComponent__Group_4_3__0 )* ) )
            // InternalMyDsl.g:6444:1: ( ( rule__CompositeComponent__Group_4_3__0 )* )
            {
            // InternalMyDsl.g:6444:1: ( ( rule__CompositeComponent__Group_4_3__0 )* )
            // InternalMyDsl.g:6445:2: ( rule__CompositeComponent__Group_4_3__0 )*
            {
             before(grammarAccess.getCompositeComponentAccess().getGroup_4_3()); 
            // InternalMyDsl.g:6446:2: ( rule__CompositeComponent__Group_4_3__0 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==19) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalMyDsl.g:6446:3: rule__CompositeComponent__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__CompositeComponent__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

             after(grammarAccess.getCompositeComponentAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_4__3__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_4__4"
    // InternalMyDsl.g:6454:1: rule__CompositeComponent__Group_4__4 : rule__CompositeComponent__Group_4__4__Impl ;
    public final void rule__CompositeComponent__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6458:1: ( rule__CompositeComponent__Group_4__4__Impl )
            // InternalMyDsl.g:6459:2: rule__CompositeComponent__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_4__4"


    // $ANTLR start "rule__CompositeComponent__Group_4__4__Impl"
    // InternalMyDsl.g:6465:1: rule__CompositeComponent__Group_4__4__Impl : ( ')' ) ;
    public final void rule__CompositeComponent__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6469:1: ( ( ')' ) )
            // InternalMyDsl.g:6470:1: ( ')' )
            {
            // InternalMyDsl.g:6470:1: ( ')' )
            // InternalMyDsl.g:6471:2: ')'
            {
             before(grammarAccess.getCompositeComponentAccess().getRightParenthesisKeyword_4_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getRightParenthesisKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_4__4__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_4_3__0"
    // InternalMyDsl.g:6481:1: rule__CompositeComponent__Group_4_3__0 : rule__CompositeComponent__Group_4_3__0__Impl rule__CompositeComponent__Group_4_3__1 ;
    public final void rule__CompositeComponent__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6485:1: ( rule__CompositeComponent__Group_4_3__0__Impl rule__CompositeComponent__Group_4_3__1 )
            // InternalMyDsl.g:6486:2: rule__CompositeComponent__Group_4_3__0__Impl rule__CompositeComponent__Group_4_3__1
            {
            pushFollow(FOLLOW_9);
            rule__CompositeComponent__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_4_3__0"


    // $ANTLR start "rule__CompositeComponent__Group_4_3__0__Impl"
    // InternalMyDsl.g:6493:1: rule__CompositeComponent__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__CompositeComponent__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6497:1: ( ( ',' ) )
            // InternalMyDsl.g:6498:1: ( ',' )
            {
            // InternalMyDsl.g:6498:1: ( ',' )
            // InternalMyDsl.g:6499:2: ','
            {
             before(grammarAccess.getCompositeComponentAccess().getCommaKeyword_4_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_4_3__0__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_4_3__1"
    // InternalMyDsl.g:6508:1: rule__CompositeComponent__Group_4_3__1 : rule__CompositeComponent__Group_4_3__1__Impl ;
    public final void rule__CompositeComponent__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6512:1: ( rule__CompositeComponent__Group_4_3__1__Impl )
            // InternalMyDsl.g:6513:2: rule__CompositeComponent__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_4_3__1"


    // $ANTLR start "rule__CompositeComponent__Group_4_3__1__Impl"
    // InternalMyDsl.g:6519:1: rule__CompositeComponent__Group_4_3__1__Impl : ( ( rule__CompositeComponent__RequiredServiceAssignment_4_3_1 ) ) ;
    public final void rule__CompositeComponent__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6523:1: ( ( ( rule__CompositeComponent__RequiredServiceAssignment_4_3_1 ) ) )
            // InternalMyDsl.g:6524:1: ( ( rule__CompositeComponent__RequiredServiceAssignment_4_3_1 ) )
            {
            // InternalMyDsl.g:6524:1: ( ( rule__CompositeComponent__RequiredServiceAssignment_4_3_1 ) )
            // InternalMyDsl.g:6525:2: ( rule__CompositeComponent__RequiredServiceAssignment_4_3_1 )
            {
             before(grammarAccess.getCompositeComponentAccess().getRequiredServiceAssignment_4_3_1()); 
            // InternalMyDsl.g:6526:2: ( rule__CompositeComponent__RequiredServiceAssignment_4_3_1 )
            // InternalMyDsl.g:6526:3: rule__CompositeComponent__RequiredServiceAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__RequiredServiceAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeComponentAccess().getRequiredServiceAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_4_3__1__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_5__0"
    // InternalMyDsl.g:6535:1: rule__CompositeComponent__Group_5__0 : rule__CompositeComponent__Group_5__0__Impl rule__CompositeComponent__Group_5__1 ;
    public final void rule__CompositeComponent__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6539:1: ( rule__CompositeComponent__Group_5__0__Impl rule__CompositeComponent__Group_5__1 )
            // InternalMyDsl.g:6540:2: rule__CompositeComponent__Group_5__0__Impl rule__CompositeComponent__Group_5__1
            {
            pushFollow(FOLLOW_8);
            rule__CompositeComponent__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_5__0"


    // $ANTLR start "rule__CompositeComponent__Group_5__0__Impl"
    // InternalMyDsl.g:6547:1: rule__CompositeComponent__Group_5__0__Impl : ( 'providedInterface' ) ;
    public final void rule__CompositeComponent__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6551:1: ( ( 'providedInterface' ) )
            // InternalMyDsl.g:6552:1: ( 'providedInterface' )
            {
            // InternalMyDsl.g:6552:1: ( 'providedInterface' )
            // InternalMyDsl.g:6553:2: 'providedInterface'
            {
             before(grammarAccess.getCompositeComponentAccess().getProvidedInterfaceKeyword_5_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getProvidedInterfaceKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_5__0__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_5__1"
    // InternalMyDsl.g:6562:1: rule__CompositeComponent__Group_5__1 : rule__CompositeComponent__Group_5__1__Impl rule__CompositeComponent__Group_5__2 ;
    public final void rule__CompositeComponent__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6566:1: ( rule__CompositeComponent__Group_5__1__Impl rule__CompositeComponent__Group_5__2 )
            // InternalMyDsl.g:6567:2: rule__CompositeComponent__Group_5__1__Impl rule__CompositeComponent__Group_5__2
            {
            pushFollow(FOLLOW_9);
            rule__CompositeComponent__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_5__1"


    // $ANTLR start "rule__CompositeComponent__Group_5__1__Impl"
    // InternalMyDsl.g:6574:1: rule__CompositeComponent__Group_5__1__Impl : ( '(' ) ;
    public final void rule__CompositeComponent__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6578:1: ( ( '(' ) )
            // InternalMyDsl.g:6579:1: ( '(' )
            {
            // InternalMyDsl.g:6579:1: ( '(' )
            // InternalMyDsl.g:6580:2: '('
            {
             before(grammarAccess.getCompositeComponentAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getLeftParenthesisKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_5__1__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_5__2"
    // InternalMyDsl.g:6589:1: rule__CompositeComponent__Group_5__2 : rule__CompositeComponent__Group_5__2__Impl rule__CompositeComponent__Group_5__3 ;
    public final void rule__CompositeComponent__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6593:1: ( rule__CompositeComponent__Group_5__2__Impl rule__CompositeComponent__Group_5__3 )
            // InternalMyDsl.g:6594:2: rule__CompositeComponent__Group_5__2__Impl rule__CompositeComponent__Group_5__3
            {
            pushFollow(FOLLOW_10);
            rule__CompositeComponent__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_5__2"


    // $ANTLR start "rule__CompositeComponent__Group_5__2__Impl"
    // InternalMyDsl.g:6601:1: rule__CompositeComponent__Group_5__2__Impl : ( ( rule__CompositeComponent__ProvidedInterfaceAssignment_5_2 ) ) ;
    public final void rule__CompositeComponent__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6605:1: ( ( ( rule__CompositeComponent__ProvidedInterfaceAssignment_5_2 ) ) )
            // InternalMyDsl.g:6606:1: ( ( rule__CompositeComponent__ProvidedInterfaceAssignment_5_2 ) )
            {
            // InternalMyDsl.g:6606:1: ( ( rule__CompositeComponent__ProvidedInterfaceAssignment_5_2 ) )
            // InternalMyDsl.g:6607:2: ( rule__CompositeComponent__ProvidedInterfaceAssignment_5_2 )
            {
             before(grammarAccess.getCompositeComponentAccess().getProvidedInterfaceAssignment_5_2()); 
            // InternalMyDsl.g:6608:2: ( rule__CompositeComponent__ProvidedInterfaceAssignment_5_2 )
            // InternalMyDsl.g:6608:3: rule__CompositeComponent__ProvidedInterfaceAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__ProvidedInterfaceAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getCompositeComponentAccess().getProvidedInterfaceAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_5__2__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_5__3"
    // InternalMyDsl.g:6616:1: rule__CompositeComponent__Group_5__3 : rule__CompositeComponent__Group_5__3__Impl rule__CompositeComponent__Group_5__4 ;
    public final void rule__CompositeComponent__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6620:1: ( rule__CompositeComponent__Group_5__3__Impl rule__CompositeComponent__Group_5__4 )
            // InternalMyDsl.g:6621:2: rule__CompositeComponent__Group_5__3__Impl rule__CompositeComponent__Group_5__4
            {
            pushFollow(FOLLOW_10);
            rule__CompositeComponent__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_5__3"


    // $ANTLR start "rule__CompositeComponent__Group_5__3__Impl"
    // InternalMyDsl.g:6628:1: rule__CompositeComponent__Group_5__3__Impl : ( ( rule__CompositeComponent__Group_5_3__0 )* ) ;
    public final void rule__CompositeComponent__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6632:1: ( ( ( rule__CompositeComponent__Group_5_3__0 )* ) )
            // InternalMyDsl.g:6633:1: ( ( rule__CompositeComponent__Group_5_3__0 )* )
            {
            // InternalMyDsl.g:6633:1: ( ( rule__CompositeComponent__Group_5_3__0 )* )
            // InternalMyDsl.g:6634:2: ( rule__CompositeComponent__Group_5_3__0 )*
            {
             before(grammarAccess.getCompositeComponentAccess().getGroup_5_3()); 
            // InternalMyDsl.g:6635:2: ( rule__CompositeComponent__Group_5_3__0 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==19) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalMyDsl.g:6635:3: rule__CompositeComponent__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__CompositeComponent__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

             after(grammarAccess.getCompositeComponentAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_5__3__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_5__4"
    // InternalMyDsl.g:6643:1: rule__CompositeComponent__Group_5__4 : rule__CompositeComponent__Group_5__4__Impl ;
    public final void rule__CompositeComponent__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6647:1: ( rule__CompositeComponent__Group_5__4__Impl )
            // InternalMyDsl.g:6648:2: rule__CompositeComponent__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_5__4"


    // $ANTLR start "rule__CompositeComponent__Group_5__4__Impl"
    // InternalMyDsl.g:6654:1: rule__CompositeComponent__Group_5__4__Impl : ( ')' ) ;
    public final void rule__CompositeComponent__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6658:1: ( ( ')' ) )
            // InternalMyDsl.g:6659:1: ( ')' )
            {
            // InternalMyDsl.g:6659:1: ( ')' )
            // InternalMyDsl.g:6660:2: ')'
            {
             before(grammarAccess.getCompositeComponentAccess().getRightParenthesisKeyword_5_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getRightParenthesisKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_5__4__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_5_3__0"
    // InternalMyDsl.g:6670:1: rule__CompositeComponent__Group_5_3__0 : rule__CompositeComponent__Group_5_3__0__Impl rule__CompositeComponent__Group_5_3__1 ;
    public final void rule__CompositeComponent__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6674:1: ( rule__CompositeComponent__Group_5_3__0__Impl rule__CompositeComponent__Group_5_3__1 )
            // InternalMyDsl.g:6675:2: rule__CompositeComponent__Group_5_3__0__Impl rule__CompositeComponent__Group_5_3__1
            {
            pushFollow(FOLLOW_9);
            rule__CompositeComponent__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_5_3__0"


    // $ANTLR start "rule__CompositeComponent__Group_5_3__0__Impl"
    // InternalMyDsl.g:6682:1: rule__CompositeComponent__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__CompositeComponent__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6686:1: ( ( ',' ) )
            // InternalMyDsl.g:6687:1: ( ',' )
            {
            // InternalMyDsl.g:6687:1: ( ',' )
            // InternalMyDsl.g:6688:2: ','
            {
             before(grammarAccess.getCompositeComponentAccess().getCommaKeyword_5_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_5_3__0__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_5_3__1"
    // InternalMyDsl.g:6697:1: rule__CompositeComponent__Group_5_3__1 : rule__CompositeComponent__Group_5_3__1__Impl ;
    public final void rule__CompositeComponent__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6701:1: ( rule__CompositeComponent__Group_5_3__1__Impl )
            // InternalMyDsl.g:6702:2: rule__CompositeComponent__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_5_3__1"


    // $ANTLR start "rule__CompositeComponent__Group_5_3__1__Impl"
    // InternalMyDsl.g:6708:1: rule__CompositeComponent__Group_5_3__1__Impl : ( ( rule__CompositeComponent__ProvidedInterfaceAssignment_5_3_1 ) ) ;
    public final void rule__CompositeComponent__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6712:1: ( ( ( rule__CompositeComponent__ProvidedInterfaceAssignment_5_3_1 ) ) )
            // InternalMyDsl.g:6713:1: ( ( rule__CompositeComponent__ProvidedInterfaceAssignment_5_3_1 ) )
            {
            // InternalMyDsl.g:6713:1: ( ( rule__CompositeComponent__ProvidedInterfaceAssignment_5_3_1 ) )
            // InternalMyDsl.g:6714:2: ( rule__CompositeComponent__ProvidedInterfaceAssignment_5_3_1 )
            {
             before(grammarAccess.getCompositeComponentAccess().getProvidedInterfaceAssignment_5_3_1()); 
            // InternalMyDsl.g:6715:2: ( rule__CompositeComponent__ProvidedInterfaceAssignment_5_3_1 )
            // InternalMyDsl.g:6715:3: rule__CompositeComponent__ProvidedInterfaceAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__ProvidedInterfaceAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeComponentAccess().getProvidedInterfaceAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_5_3__1__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_6__0"
    // InternalMyDsl.g:6724:1: rule__CompositeComponent__Group_6__0 : rule__CompositeComponent__Group_6__0__Impl rule__CompositeComponent__Group_6__1 ;
    public final void rule__CompositeComponent__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6728:1: ( rule__CompositeComponent__Group_6__0__Impl rule__CompositeComponent__Group_6__1 )
            // InternalMyDsl.g:6729:2: rule__CompositeComponent__Group_6__0__Impl rule__CompositeComponent__Group_6__1
            {
            pushFollow(FOLLOW_8);
            rule__CompositeComponent__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_6__0"


    // $ANTLR start "rule__CompositeComponent__Group_6__0__Impl"
    // InternalMyDsl.g:6736:1: rule__CompositeComponent__Group_6__0__Impl : ( 'providedService' ) ;
    public final void rule__CompositeComponent__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6740:1: ( ( 'providedService' ) )
            // InternalMyDsl.g:6741:1: ( 'providedService' )
            {
            // InternalMyDsl.g:6741:1: ( 'providedService' )
            // InternalMyDsl.g:6742:2: 'providedService'
            {
             before(grammarAccess.getCompositeComponentAccess().getProvidedServiceKeyword_6_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getProvidedServiceKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_6__0__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_6__1"
    // InternalMyDsl.g:6751:1: rule__CompositeComponent__Group_6__1 : rule__CompositeComponent__Group_6__1__Impl rule__CompositeComponent__Group_6__2 ;
    public final void rule__CompositeComponent__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6755:1: ( rule__CompositeComponent__Group_6__1__Impl rule__CompositeComponent__Group_6__2 )
            // InternalMyDsl.g:6756:2: rule__CompositeComponent__Group_6__1__Impl rule__CompositeComponent__Group_6__2
            {
            pushFollow(FOLLOW_9);
            rule__CompositeComponent__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_6__1"


    // $ANTLR start "rule__CompositeComponent__Group_6__1__Impl"
    // InternalMyDsl.g:6763:1: rule__CompositeComponent__Group_6__1__Impl : ( '(' ) ;
    public final void rule__CompositeComponent__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6767:1: ( ( '(' ) )
            // InternalMyDsl.g:6768:1: ( '(' )
            {
            // InternalMyDsl.g:6768:1: ( '(' )
            // InternalMyDsl.g:6769:2: '('
            {
             before(grammarAccess.getCompositeComponentAccess().getLeftParenthesisKeyword_6_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getLeftParenthesisKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_6__1__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_6__2"
    // InternalMyDsl.g:6778:1: rule__CompositeComponent__Group_6__2 : rule__CompositeComponent__Group_6__2__Impl rule__CompositeComponent__Group_6__3 ;
    public final void rule__CompositeComponent__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6782:1: ( rule__CompositeComponent__Group_6__2__Impl rule__CompositeComponent__Group_6__3 )
            // InternalMyDsl.g:6783:2: rule__CompositeComponent__Group_6__2__Impl rule__CompositeComponent__Group_6__3
            {
            pushFollow(FOLLOW_10);
            rule__CompositeComponent__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_6__2"


    // $ANTLR start "rule__CompositeComponent__Group_6__2__Impl"
    // InternalMyDsl.g:6790:1: rule__CompositeComponent__Group_6__2__Impl : ( ( rule__CompositeComponent__ProvidedServiceAssignment_6_2 ) ) ;
    public final void rule__CompositeComponent__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6794:1: ( ( ( rule__CompositeComponent__ProvidedServiceAssignment_6_2 ) ) )
            // InternalMyDsl.g:6795:1: ( ( rule__CompositeComponent__ProvidedServiceAssignment_6_2 ) )
            {
            // InternalMyDsl.g:6795:1: ( ( rule__CompositeComponent__ProvidedServiceAssignment_6_2 ) )
            // InternalMyDsl.g:6796:2: ( rule__CompositeComponent__ProvidedServiceAssignment_6_2 )
            {
             before(grammarAccess.getCompositeComponentAccess().getProvidedServiceAssignment_6_2()); 
            // InternalMyDsl.g:6797:2: ( rule__CompositeComponent__ProvidedServiceAssignment_6_2 )
            // InternalMyDsl.g:6797:3: rule__CompositeComponent__ProvidedServiceAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__ProvidedServiceAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getCompositeComponentAccess().getProvidedServiceAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_6__2__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_6__3"
    // InternalMyDsl.g:6805:1: rule__CompositeComponent__Group_6__3 : rule__CompositeComponent__Group_6__3__Impl rule__CompositeComponent__Group_6__4 ;
    public final void rule__CompositeComponent__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6809:1: ( rule__CompositeComponent__Group_6__3__Impl rule__CompositeComponent__Group_6__4 )
            // InternalMyDsl.g:6810:2: rule__CompositeComponent__Group_6__3__Impl rule__CompositeComponent__Group_6__4
            {
            pushFollow(FOLLOW_10);
            rule__CompositeComponent__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_6__3"


    // $ANTLR start "rule__CompositeComponent__Group_6__3__Impl"
    // InternalMyDsl.g:6817:1: rule__CompositeComponent__Group_6__3__Impl : ( ( rule__CompositeComponent__Group_6_3__0 )* ) ;
    public final void rule__CompositeComponent__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6821:1: ( ( ( rule__CompositeComponent__Group_6_3__0 )* ) )
            // InternalMyDsl.g:6822:1: ( ( rule__CompositeComponent__Group_6_3__0 )* )
            {
            // InternalMyDsl.g:6822:1: ( ( rule__CompositeComponent__Group_6_3__0 )* )
            // InternalMyDsl.g:6823:2: ( rule__CompositeComponent__Group_6_3__0 )*
            {
             before(grammarAccess.getCompositeComponentAccess().getGroup_6_3()); 
            // InternalMyDsl.g:6824:2: ( rule__CompositeComponent__Group_6_3__0 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==19) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalMyDsl.g:6824:3: rule__CompositeComponent__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__CompositeComponent__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

             after(grammarAccess.getCompositeComponentAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_6__3__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_6__4"
    // InternalMyDsl.g:6832:1: rule__CompositeComponent__Group_6__4 : rule__CompositeComponent__Group_6__4__Impl ;
    public final void rule__CompositeComponent__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6836:1: ( rule__CompositeComponent__Group_6__4__Impl )
            // InternalMyDsl.g:6837:2: rule__CompositeComponent__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_6__4"


    // $ANTLR start "rule__CompositeComponent__Group_6__4__Impl"
    // InternalMyDsl.g:6843:1: rule__CompositeComponent__Group_6__4__Impl : ( ')' ) ;
    public final void rule__CompositeComponent__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6847:1: ( ( ')' ) )
            // InternalMyDsl.g:6848:1: ( ')' )
            {
            // InternalMyDsl.g:6848:1: ( ')' )
            // InternalMyDsl.g:6849:2: ')'
            {
             before(grammarAccess.getCompositeComponentAccess().getRightParenthesisKeyword_6_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getRightParenthesisKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_6__4__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_6_3__0"
    // InternalMyDsl.g:6859:1: rule__CompositeComponent__Group_6_3__0 : rule__CompositeComponent__Group_6_3__0__Impl rule__CompositeComponent__Group_6_3__1 ;
    public final void rule__CompositeComponent__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6863:1: ( rule__CompositeComponent__Group_6_3__0__Impl rule__CompositeComponent__Group_6_3__1 )
            // InternalMyDsl.g:6864:2: rule__CompositeComponent__Group_6_3__0__Impl rule__CompositeComponent__Group_6_3__1
            {
            pushFollow(FOLLOW_9);
            rule__CompositeComponent__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_6_3__0"


    // $ANTLR start "rule__CompositeComponent__Group_6_3__0__Impl"
    // InternalMyDsl.g:6871:1: rule__CompositeComponent__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__CompositeComponent__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6875:1: ( ( ',' ) )
            // InternalMyDsl.g:6876:1: ( ',' )
            {
            // InternalMyDsl.g:6876:1: ( ',' )
            // InternalMyDsl.g:6877:2: ','
            {
             before(grammarAccess.getCompositeComponentAccess().getCommaKeyword_6_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_6_3__0__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_6_3__1"
    // InternalMyDsl.g:6886:1: rule__CompositeComponent__Group_6_3__1 : rule__CompositeComponent__Group_6_3__1__Impl ;
    public final void rule__CompositeComponent__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6890:1: ( rule__CompositeComponent__Group_6_3__1__Impl )
            // InternalMyDsl.g:6891:2: rule__CompositeComponent__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_6_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_6_3__1"


    // $ANTLR start "rule__CompositeComponent__Group_6_3__1__Impl"
    // InternalMyDsl.g:6897:1: rule__CompositeComponent__Group_6_3__1__Impl : ( ( rule__CompositeComponent__ProvidedServiceAssignment_6_3_1 ) ) ;
    public final void rule__CompositeComponent__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6901:1: ( ( ( rule__CompositeComponent__ProvidedServiceAssignment_6_3_1 ) ) )
            // InternalMyDsl.g:6902:1: ( ( rule__CompositeComponent__ProvidedServiceAssignment_6_3_1 ) )
            {
            // InternalMyDsl.g:6902:1: ( ( rule__CompositeComponent__ProvidedServiceAssignment_6_3_1 ) )
            // InternalMyDsl.g:6903:2: ( rule__CompositeComponent__ProvidedServiceAssignment_6_3_1 )
            {
             before(grammarAccess.getCompositeComponentAccess().getProvidedServiceAssignment_6_3_1()); 
            // InternalMyDsl.g:6904:2: ( rule__CompositeComponent__ProvidedServiceAssignment_6_3_1 )
            // InternalMyDsl.g:6904:3: rule__CompositeComponent__ProvidedServiceAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__ProvidedServiceAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeComponentAccess().getProvidedServiceAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_6_3__1__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_7__0"
    // InternalMyDsl.g:6913:1: rule__CompositeComponent__Group_7__0 : rule__CompositeComponent__Group_7__0__Impl rule__CompositeComponent__Group_7__1 ;
    public final void rule__CompositeComponent__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6917:1: ( rule__CompositeComponent__Group_7__0__Impl rule__CompositeComponent__Group_7__1 )
            // InternalMyDsl.g:6918:2: rule__CompositeComponent__Group_7__0__Impl rule__CompositeComponent__Group_7__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalMyDsl.g:6925:1: rule__CompositeComponent__Group_7__0__Impl : ( 'behaviourDescription' ) ;
    public final void rule__CompositeComponent__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6929:1: ( ( 'behaviourDescription' ) )
            // InternalMyDsl.g:6930:1: ( 'behaviourDescription' )
            {
            // InternalMyDsl.g:6930:1: ( 'behaviourDescription' )
            // InternalMyDsl.g:6931:2: 'behaviourDescription'
            {
             before(grammarAccess.getCompositeComponentAccess().getBehaviourDescriptionKeyword_7_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getBehaviourDescriptionKeyword_7_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:6940:1: rule__CompositeComponent__Group_7__1 : rule__CompositeComponent__Group_7__1__Impl ;
    public final void rule__CompositeComponent__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6944:1: ( rule__CompositeComponent__Group_7__1__Impl )
            // InternalMyDsl.g:6945:2: rule__CompositeComponent__Group_7__1__Impl
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
    // InternalMyDsl.g:6951:1: rule__CompositeComponent__Group_7__1__Impl : ( ( rule__CompositeComponent__BehaviourDescriptionAssignment_7_1 ) ) ;
    public final void rule__CompositeComponent__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6955:1: ( ( ( rule__CompositeComponent__BehaviourDescriptionAssignment_7_1 ) ) )
            // InternalMyDsl.g:6956:1: ( ( rule__CompositeComponent__BehaviourDescriptionAssignment_7_1 ) )
            {
            // InternalMyDsl.g:6956:1: ( ( rule__CompositeComponent__BehaviourDescriptionAssignment_7_1 ) )
            // InternalMyDsl.g:6957:2: ( rule__CompositeComponent__BehaviourDescriptionAssignment_7_1 )
            {
             before(grammarAccess.getCompositeComponentAccess().getBehaviourDescriptionAssignment_7_1()); 
            // InternalMyDsl.g:6958:2: ( rule__CompositeComponent__BehaviourDescriptionAssignment_7_1 )
            // InternalMyDsl.g:6958:3: rule__CompositeComponent__BehaviourDescriptionAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__BehaviourDescriptionAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeComponentAccess().getBehaviourDescriptionAssignment_7_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__CompositeComponent__Group_8__0"
    // InternalMyDsl.g:6967:1: rule__CompositeComponent__Group_8__0 : rule__CompositeComponent__Group_8__0__Impl rule__CompositeComponent__Group_8__1 ;
    public final void rule__CompositeComponent__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6971:1: ( rule__CompositeComponent__Group_8__0__Impl rule__CompositeComponent__Group_8__1 )
            // InternalMyDsl.g:6972:2: rule__CompositeComponent__Group_8__0__Impl rule__CompositeComponent__Group_8__1
            {
            pushFollow(FOLLOW_28);
            rule__CompositeComponent__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_8__0"


    // $ANTLR start "rule__CompositeComponent__Group_8__0__Impl"
    // InternalMyDsl.g:6979:1: rule__CompositeComponent__Group_8__0__Impl : ( 'encapsulatedAssemblyContext' ) ;
    public final void rule__CompositeComponent__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6983:1: ( ( 'encapsulatedAssemblyContext' ) )
            // InternalMyDsl.g:6984:1: ( 'encapsulatedAssemblyContext' )
            {
            // InternalMyDsl.g:6984:1: ( 'encapsulatedAssemblyContext' )
            // InternalMyDsl.g:6985:2: 'encapsulatedAssemblyContext'
            {
             before(grammarAccess.getCompositeComponentAccess().getEncapsulatedAssemblyContextKeyword_8_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getEncapsulatedAssemblyContextKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_8__0__Impl"


    // $ANTLR start "rule__CompositeComponent__Group_8__1"
    // InternalMyDsl.g:6994:1: rule__CompositeComponent__Group_8__1 : rule__CompositeComponent__Group_8__1__Impl ;
    public final void rule__CompositeComponent__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6998:1: ( rule__CompositeComponent__Group_8__1__Impl )
            // InternalMyDsl.g:6999:2: rule__CompositeComponent__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_8__1"


    // $ANTLR start "rule__CompositeComponent__Group_8__1__Impl"
    // InternalMyDsl.g:7005:1: rule__CompositeComponent__Group_8__1__Impl : ( ( rule__CompositeComponent__EncapsulatedAssemblyContextAssignment_8_1 ) ) ;
    public final void rule__CompositeComponent__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7009:1: ( ( ( rule__CompositeComponent__EncapsulatedAssemblyContextAssignment_8_1 ) ) )
            // InternalMyDsl.g:7010:1: ( ( rule__CompositeComponent__EncapsulatedAssemblyContextAssignment_8_1 ) )
            {
            // InternalMyDsl.g:7010:1: ( ( rule__CompositeComponent__EncapsulatedAssemblyContextAssignment_8_1 ) )
            // InternalMyDsl.g:7011:2: ( rule__CompositeComponent__EncapsulatedAssemblyContextAssignment_8_1 )
            {
             before(grammarAccess.getCompositeComponentAccess().getEncapsulatedAssemblyContextAssignment_8_1()); 
            // InternalMyDsl.g:7012:2: ( rule__CompositeComponent__EncapsulatedAssemblyContextAssignment_8_1 )
            // InternalMyDsl.g:7012:3: rule__CompositeComponent__EncapsulatedAssemblyContextAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeComponent__EncapsulatedAssemblyContextAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeComponentAccess().getEncapsulatedAssemblyContextAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__Group_8__1__Impl"


    // $ANTLR start "rule__Service__Group__0"
    // InternalMyDsl.g:7021:1: rule__Service__Group__0 : rule__Service__Group__0__Impl rule__Service__Group__1 ;
    public final void rule__Service__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7025:1: ( rule__Service__Group__0__Impl rule__Service__Group__1 )
            // InternalMyDsl.g:7026:2: rule__Service__Group__0__Impl rule__Service__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:7033:1: rule__Service__Group__0__Impl : ( 'Service' ) ;
    public final void rule__Service__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7037:1: ( ( 'Service' ) )
            // InternalMyDsl.g:7038:1: ( 'Service' )
            {
            // InternalMyDsl.g:7038:1: ( 'Service' )
            // InternalMyDsl.g:7039:2: 'Service'
            {
             before(grammarAccess.getServiceAccess().getServiceKeyword_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalMyDsl.g:7048:1: rule__Service__Group__1 : rule__Service__Group__1__Impl rule__Service__Group__2 ;
    public final void rule__Service__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7052:1: ( rule__Service__Group__1__Impl rule__Service__Group__2 )
            // InternalMyDsl.g:7053:2: rule__Service__Group__1__Impl rule__Service__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:7060:1: rule__Service__Group__1__Impl : ( ( rule__Service__NameAssignment_1 ) ) ;
    public final void rule__Service__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7064:1: ( ( ( rule__Service__NameAssignment_1 ) ) )
            // InternalMyDsl.g:7065:1: ( ( rule__Service__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:7065:1: ( ( rule__Service__NameAssignment_1 ) )
            // InternalMyDsl.g:7066:2: ( rule__Service__NameAssignment_1 )
            {
             before(grammarAccess.getServiceAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:7067:2: ( rule__Service__NameAssignment_1 )
            // InternalMyDsl.g:7067:3: rule__Service__NameAssignment_1
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
    // InternalMyDsl.g:7075:1: rule__Service__Group__2 : rule__Service__Group__2__Impl rule__Service__Group__3 ;
    public final void rule__Service__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7079:1: ( rule__Service__Group__2__Impl rule__Service__Group__3 )
            // InternalMyDsl.g:7080:2: rule__Service__Group__2__Impl rule__Service__Group__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalMyDsl.g:7087:1: rule__Service__Group__2__Impl : ( '{' ) ;
    public final void rule__Service__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7091:1: ( ( '{' ) )
            // InternalMyDsl.g:7092:1: ( '{' )
            {
            // InternalMyDsl.g:7092:1: ( '{' )
            // InternalMyDsl.g:7093:2: '{'
            {
             before(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
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
    // InternalMyDsl.g:7102:1: rule__Service__Group__3 : rule__Service__Group__3__Impl rule__Service__Group__4 ;
    public final void rule__Service__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7106:1: ( rule__Service__Group__3__Impl rule__Service__Group__4 )
            // InternalMyDsl.g:7107:2: rule__Service__Group__3__Impl rule__Service__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:7114:1: rule__Service__Group__3__Impl : ( 'correspondingSignature' ) ;
    public final void rule__Service__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7118:1: ( ( 'correspondingSignature' ) )
            // InternalMyDsl.g:7119:1: ( 'correspondingSignature' )
            {
            // InternalMyDsl.g:7119:1: ( 'correspondingSignature' )
            // InternalMyDsl.g:7120:2: 'correspondingSignature'
            {
             before(grammarAccess.getServiceAccess().getCorrespondingSignatureKeyword_3()); 
            match(input,50,FOLLOW_2); 
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
    // InternalMyDsl.g:7129:1: rule__Service__Group__4 : rule__Service__Group__4__Impl rule__Service__Group__5 ;
    public final void rule__Service__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7133:1: ( rule__Service__Group__4__Impl rule__Service__Group__5 )
            // InternalMyDsl.g:7134:2: rule__Service__Group__4__Impl rule__Service__Group__5
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:7141:1: rule__Service__Group__4__Impl : ( '(' ) ;
    public final void rule__Service__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7145:1: ( ( '(' ) )
            // InternalMyDsl.g:7146:1: ( '(' )
            {
            // InternalMyDsl.g:7146:1: ( '(' )
            // InternalMyDsl.g:7147:2: '('
            {
             before(grammarAccess.getServiceAccess().getLeftParenthesisKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getLeftParenthesisKeyword_4()); 

            }


            }

        }
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
    // InternalMyDsl.g:7156:1: rule__Service__Group__5 : rule__Service__Group__5__Impl rule__Service__Group__6 ;
    public final void rule__Service__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7160:1: ( rule__Service__Group__5__Impl rule__Service__Group__6 )
            // InternalMyDsl.g:7161:2: rule__Service__Group__5__Impl rule__Service__Group__6
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:7168:1: rule__Service__Group__5__Impl : ( ( rule__Service__CorrespondingSignatureAssignment_5 ) ) ;
    public final void rule__Service__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7172:1: ( ( ( rule__Service__CorrespondingSignatureAssignment_5 ) ) )
            // InternalMyDsl.g:7173:1: ( ( rule__Service__CorrespondingSignatureAssignment_5 ) )
            {
            // InternalMyDsl.g:7173:1: ( ( rule__Service__CorrespondingSignatureAssignment_5 ) )
            // InternalMyDsl.g:7174:2: ( rule__Service__CorrespondingSignatureAssignment_5 )
            {
             before(grammarAccess.getServiceAccess().getCorrespondingSignatureAssignment_5()); 
            // InternalMyDsl.g:7175:2: ( rule__Service__CorrespondingSignatureAssignment_5 )
            // InternalMyDsl.g:7175:3: rule__Service__CorrespondingSignatureAssignment_5
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
    // InternalMyDsl.g:7183:1: rule__Service__Group__6 : rule__Service__Group__6__Impl rule__Service__Group__7 ;
    public final void rule__Service__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7187:1: ( rule__Service__Group__6__Impl rule__Service__Group__7 )
            // InternalMyDsl.g:7188:2: rule__Service__Group__6__Impl rule__Service__Group__7
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:7195:1: rule__Service__Group__6__Impl : ( ( rule__Service__Group_6__0 )* ) ;
    public final void rule__Service__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7199:1: ( ( ( rule__Service__Group_6__0 )* ) )
            // InternalMyDsl.g:7200:1: ( ( rule__Service__Group_6__0 )* )
            {
            // InternalMyDsl.g:7200:1: ( ( rule__Service__Group_6__0 )* )
            // InternalMyDsl.g:7201:2: ( rule__Service__Group_6__0 )*
            {
             before(grammarAccess.getServiceAccess().getGroup_6()); 
            // InternalMyDsl.g:7202:2: ( rule__Service__Group_6__0 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==19) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalMyDsl.g:7202:3: rule__Service__Group_6__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Service__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
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
    // InternalMyDsl.g:7210:1: rule__Service__Group__7 : rule__Service__Group__7__Impl rule__Service__Group__8 ;
    public final void rule__Service__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7214:1: ( rule__Service__Group__7__Impl rule__Service__Group__8 )
            // InternalMyDsl.g:7215:2: rule__Service__Group__7__Impl rule__Service__Group__8
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:7222:1: rule__Service__Group__7__Impl : ( ')' ) ;
    public final void rule__Service__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7226:1: ( ( ')' ) )
            // InternalMyDsl.g:7227:1: ( ')' )
            {
            // InternalMyDsl.g:7227:1: ( ')' )
            // InternalMyDsl.g:7228:2: ')'
            {
             before(grammarAccess.getServiceAccess().getRightParenthesisKeyword_7()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
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
    // InternalMyDsl.g:7237:1: rule__Service__Group__8 : rule__Service__Group__8__Impl ;
    public final void rule__Service__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7241:1: ( rule__Service__Group__8__Impl )
            // InternalMyDsl.g:7242:2: rule__Service__Group__8__Impl
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
    // InternalMyDsl.g:7248:1: rule__Service__Group__8__Impl : ( '}' ) ;
    public final void rule__Service__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7252:1: ( ( '}' ) )
            // InternalMyDsl.g:7253:1: ( '}' )
            {
            // InternalMyDsl.g:7253:1: ( '}' )
            // InternalMyDsl.g:7254:2: '}'
            {
             before(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_8()); 
            match(input,18,FOLLOW_2); 
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
    // InternalMyDsl.g:7264:1: rule__Service__Group_6__0 : rule__Service__Group_6__0__Impl rule__Service__Group_6__1 ;
    public final void rule__Service__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7268:1: ( rule__Service__Group_6__0__Impl rule__Service__Group_6__1 )
            // InternalMyDsl.g:7269:2: rule__Service__Group_6__0__Impl rule__Service__Group_6__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:7276:1: rule__Service__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Service__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7280:1: ( ( ',' ) )
            // InternalMyDsl.g:7281:1: ( ',' )
            {
            // InternalMyDsl.g:7281:1: ( ',' )
            // InternalMyDsl.g:7282:2: ','
            {
             before(grammarAccess.getServiceAccess().getCommaKeyword_6_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalMyDsl.g:7291:1: rule__Service__Group_6__1 : rule__Service__Group_6__1__Impl ;
    public final void rule__Service__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7295:1: ( rule__Service__Group_6__1__Impl )
            // InternalMyDsl.g:7296:2: rule__Service__Group_6__1__Impl
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
    // InternalMyDsl.g:7302:1: rule__Service__Group_6__1__Impl : ( ( rule__Service__CorrespondingSignatureAssignment_6_1 ) ) ;
    public final void rule__Service__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7306:1: ( ( ( rule__Service__CorrespondingSignatureAssignment_6_1 ) ) )
            // InternalMyDsl.g:7307:1: ( ( rule__Service__CorrespondingSignatureAssignment_6_1 ) )
            {
            // InternalMyDsl.g:7307:1: ( ( rule__Service__CorrespondingSignatureAssignment_6_1 ) )
            // InternalMyDsl.g:7308:2: ( rule__Service__CorrespondingSignatureAssignment_6_1 )
            {
             before(grammarAccess.getServiceAccess().getCorrespondingSignatureAssignment_6_1()); 
            // InternalMyDsl.g:7309:2: ( rule__Service__CorrespondingSignatureAssignment_6_1 )
            // InternalMyDsl.g:7309:3: rule__Service__CorrespondingSignatureAssignment_6_1
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


    // $ANTLR start "rule__Interface__Group__0"
    // InternalMyDsl.g:7318:1: rule__Interface__Group__0 : rule__Interface__Group__0__Impl rule__Interface__Group__1 ;
    public final void rule__Interface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7322:1: ( rule__Interface__Group__0__Impl rule__Interface__Group__1 )
            // InternalMyDsl.g:7323:2: rule__Interface__Group__0__Impl rule__Interface__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:7330:1: rule__Interface__Group__0__Impl : ( 'Interface' ) ;
    public final void rule__Interface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7334:1: ( ( 'Interface' ) )
            // InternalMyDsl.g:7335:1: ( 'Interface' )
            {
            // InternalMyDsl.g:7335:1: ( 'Interface' )
            // InternalMyDsl.g:7336:2: 'Interface'
            {
             before(grammarAccess.getInterfaceAccess().getInterfaceKeyword_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalMyDsl.g:7345:1: rule__Interface__Group__1 : rule__Interface__Group__1__Impl rule__Interface__Group__2 ;
    public final void rule__Interface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7349:1: ( rule__Interface__Group__1__Impl rule__Interface__Group__2 )
            // InternalMyDsl.g:7350:2: rule__Interface__Group__1__Impl rule__Interface__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:7357:1: rule__Interface__Group__1__Impl : ( ( rule__Interface__NameAssignment_1 ) ) ;
    public final void rule__Interface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7361:1: ( ( ( rule__Interface__NameAssignment_1 ) ) )
            // InternalMyDsl.g:7362:1: ( ( rule__Interface__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:7362:1: ( ( rule__Interface__NameAssignment_1 ) )
            // InternalMyDsl.g:7363:2: ( rule__Interface__NameAssignment_1 )
            {
             before(grammarAccess.getInterfaceAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:7364:2: ( rule__Interface__NameAssignment_1 )
            // InternalMyDsl.g:7364:3: rule__Interface__NameAssignment_1
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
    // InternalMyDsl.g:7372:1: rule__Interface__Group__2 : rule__Interface__Group__2__Impl rule__Interface__Group__3 ;
    public final void rule__Interface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7376:1: ( rule__Interface__Group__2__Impl rule__Interface__Group__3 )
            // InternalMyDsl.g:7377:2: rule__Interface__Group__2__Impl rule__Interface__Group__3
            {
            pushFollow(FOLLOW_30);
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
    // InternalMyDsl.g:7384:1: rule__Interface__Group__2__Impl : ( '{' ) ;
    public final void rule__Interface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7388:1: ( ( '{' ) )
            // InternalMyDsl.g:7389:1: ( '{' )
            {
            // InternalMyDsl.g:7389:1: ( '{' )
            // InternalMyDsl.g:7390:2: '{'
            {
             before(grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
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
    // InternalMyDsl.g:7399:1: rule__Interface__Group__3 : rule__Interface__Group__3__Impl rule__Interface__Group__4 ;
    public final void rule__Interface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7403:1: ( rule__Interface__Group__3__Impl rule__Interface__Group__4 )
            // InternalMyDsl.g:7404:2: rule__Interface__Group__3__Impl rule__Interface__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalMyDsl.g:7411:1: rule__Interface__Group__3__Impl : ( 'signature' ) ;
    public final void rule__Interface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7415:1: ( ( 'signature' ) )
            // InternalMyDsl.g:7416:1: ( 'signature' )
            {
            // InternalMyDsl.g:7416:1: ( 'signature' )
            // InternalMyDsl.g:7417:2: 'signature'
            {
             before(grammarAccess.getInterfaceAccess().getSignatureKeyword_3()); 
            match(input,52,FOLLOW_2); 
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
    // InternalMyDsl.g:7426:1: rule__Interface__Group__4 : rule__Interface__Group__4__Impl rule__Interface__Group__5 ;
    public final void rule__Interface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7430:1: ( rule__Interface__Group__4__Impl rule__Interface__Group__5 )
            // InternalMyDsl.g:7431:2: rule__Interface__Group__4__Impl rule__Interface__Group__5
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:7438:1: rule__Interface__Group__4__Impl : ( '(' ) ;
    public final void rule__Interface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7442:1: ( ( '(' ) )
            // InternalMyDsl.g:7443:1: ( '(' )
            {
            // InternalMyDsl.g:7443:1: ( '(' )
            // InternalMyDsl.g:7444:2: '('
            {
             before(grammarAccess.getInterfaceAccess().getLeftParenthesisKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getLeftParenthesisKeyword_4()); 

            }


            }

        }
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
    // InternalMyDsl.g:7453:1: rule__Interface__Group__5 : rule__Interface__Group__5__Impl rule__Interface__Group__6 ;
    public final void rule__Interface__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7457:1: ( rule__Interface__Group__5__Impl rule__Interface__Group__6 )
            // InternalMyDsl.g:7458:2: rule__Interface__Group__5__Impl rule__Interface__Group__6
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:7465:1: rule__Interface__Group__5__Impl : ( ( rule__Interface__SignatureAssignment_5 ) ) ;
    public final void rule__Interface__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7469:1: ( ( ( rule__Interface__SignatureAssignment_5 ) ) )
            // InternalMyDsl.g:7470:1: ( ( rule__Interface__SignatureAssignment_5 ) )
            {
            // InternalMyDsl.g:7470:1: ( ( rule__Interface__SignatureAssignment_5 ) )
            // InternalMyDsl.g:7471:2: ( rule__Interface__SignatureAssignment_5 )
            {
             before(grammarAccess.getInterfaceAccess().getSignatureAssignment_5()); 
            // InternalMyDsl.g:7472:2: ( rule__Interface__SignatureAssignment_5 )
            // InternalMyDsl.g:7472:3: rule__Interface__SignatureAssignment_5
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
    // InternalMyDsl.g:7480:1: rule__Interface__Group__6 : rule__Interface__Group__6__Impl rule__Interface__Group__7 ;
    public final void rule__Interface__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7484:1: ( rule__Interface__Group__6__Impl rule__Interface__Group__7 )
            // InternalMyDsl.g:7485:2: rule__Interface__Group__6__Impl rule__Interface__Group__7
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:7492:1: rule__Interface__Group__6__Impl : ( ( rule__Interface__Group_6__0 )* ) ;
    public final void rule__Interface__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7496:1: ( ( ( rule__Interface__Group_6__0 )* ) )
            // InternalMyDsl.g:7497:1: ( ( rule__Interface__Group_6__0 )* )
            {
            // InternalMyDsl.g:7497:1: ( ( rule__Interface__Group_6__0 )* )
            // InternalMyDsl.g:7498:2: ( rule__Interface__Group_6__0 )*
            {
             before(grammarAccess.getInterfaceAccess().getGroup_6()); 
            // InternalMyDsl.g:7499:2: ( rule__Interface__Group_6__0 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==19) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalMyDsl.g:7499:3: rule__Interface__Group_6__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Interface__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
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
    // InternalMyDsl.g:7507:1: rule__Interface__Group__7 : rule__Interface__Group__7__Impl rule__Interface__Group__8 ;
    public final void rule__Interface__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7511:1: ( rule__Interface__Group__7__Impl rule__Interface__Group__8 )
            // InternalMyDsl.g:7512:2: rule__Interface__Group__7__Impl rule__Interface__Group__8
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:7519:1: rule__Interface__Group__7__Impl : ( ')' ) ;
    public final void rule__Interface__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7523:1: ( ( ')' ) )
            // InternalMyDsl.g:7524:1: ( ')' )
            {
            // InternalMyDsl.g:7524:1: ( ')' )
            // InternalMyDsl.g:7525:2: ')'
            {
             before(grammarAccess.getInterfaceAccess().getRightParenthesisKeyword_7()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
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
    // InternalMyDsl.g:7534:1: rule__Interface__Group__8 : rule__Interface__Group__8__Impl ;
    public final void rule__Interface__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7538:1: ( rule__Interface__Group__8__Impl )
            // InternalMyDsl.g:7539:2: rule__Interface__Group__8__Impl
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
    // InternalMyDsl.g:7545:1: rule__Interface__Group__8__Impl : ( '}' ) ;
    public final void rule__Interface__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7549:1: ( ( '}' ) )
            // InternalMyDsl.g:7550:1: ( '}' )
            {
            // InternalMyDsl.g:7550:1: ( '}' )
            // InternalMyDsl.g:7551:2: '}'
            {
             before(grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_8()); 
            match(input,18,FOLLOW_2); 
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
    // InternalMyDsl.g:7561:1: rule__Interface__Group_6__0 : rule__Interface__Group_6__0__Impl rule__Interface__Group_6__1 ;
    public final void rule__Interface__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7565:1: ( rule__Interface__Group_6__0__Impl rule__Interface__Group_6__1 )
            // InternalMyDsl.g:7566:2: rule__Interface__Group_6__0__Impl rule__Interface__Group_6__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:7573:1: rule__Interface__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Interface__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7577:1: ( ( ',' ) )
            // InternalMyDsl.g:7578:1: ( ',' )
            {
            // InternalMyDsl.g:7578:1: ( ',' )
            // InternalMyDsl.g:7579:2: ','
            {
             before(grammarAccess.getInterfaceAccess().getCommaKeyword_6_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalMyDsl.g:7588:1: rule__Interface__Group_6__1 : rule__Interface__Group_6__1__Impl ;
    public final void rule__Interface__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7592:1: ( rule__Interface__Group_6__1__Impl )
            // InternalMyDsl.g:7593:2: rule__Interface__Group_6__1__Impl
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
    // InternalMyDsl.g:7599:1: rule__Interface__Group_6__1__Impl : ( ( rule__Interface__SignatureAssignment_6_1 ) ) ;
    public final void rule__Interface__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7603:1: ( ( ( rule__Interface__SignatureAssignment_6_1 ) ) )
            // InternalMyDsl.g:7604:1: ( ( rule__Interface__SignatureAssignment_6_1 ) )
            {
            // InternalMyDsl.g:7604:1: ( ( rule__Interface__SignatureAssignment_6_1 ) )
            // InternalMyDsl.g:7605:2: ( rule__Interface__SignatureAssignment_6_1 )
            {
             before(grammarAccess.getInterfaceAccess().getSignatureAssignment_6_1()); 
            // InternalMyDsl.g:7606:2: ( rule__Interface__SignatureAssignment_6_1 )
            // InternalMyDsl.g:7606:3: rule__Interface__SignatureAssignment_6_1
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


    // $ANTLR start "rule__Signature__Group__0"
    // InternalMyDsl.g:7615:1: rule__Signature__Group__0 : rule__Signature__Group__0__Impl rule__Signature__Group__1 ;
    public final void rule__Signature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7619:1: ( rule__Signature__Group__0__Impl rule__Signature__Group__1 )
            // InternalMyDsl.g:7620:2: rule__Signature__Group__0__Impl rule__Signature__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:7627:1: rule__Signature__Group__0__Impl : ( 'Signature' ) ;
    public final void rule__Signature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7631:1: ( ( 'Signature' ) )
            // InternalMyDsl.g:7632:1: ( 'Signature' )
            {
            // InternalMyDsl.g:7632:1: ( 'Signature' )
            // InternalMyDsl.g:7633:2: 'Signature'
            {
             before(grammarAccess.getSignatureAccess().getSignatureKeyword_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalMyDsl.g:7642:1: rule__Signature__Group__1 : rule__Signature__Group__1__Impl rule__Signature__Group__2 ;
    public final void rule__Signature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7646:1: ( rule__Signature__Group__1__Impl rule__Signature__Group__2 )
            // InternalMyDsl.g:7647:2: rule__Signature__Group__1__Impl rule__Signature__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:7654:1: rule__Signature__Group__1__Impl : ( ( rule__Signature__NameAssignment_1 ) ) ;
    public final void rule__Signature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7658:1: ( ( ( rule__Signature__NameAssignment_1 ) ) )
            // InternalMyDsl.g:7659:1: ( ( rule__Signature__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:7659:1: ( ( rule__Signature__NameAssignment_1 ) )
            // InternalMyDsl.g:7660:2: ( rule__Signature__NameAssignment_1 )
            {
             before(grammarAccess.getSignatureAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:7661:2: ( rule__Signature__NameAssignment_1 )
            // InternalMyDsl.g:7661:3: rule__Signature__NameAssignment_1
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
    // InternalMyDsl.g:7669:1: rule__Signature__Group__2 : rule__Signature__Group__2__Impl rule__Signature__Group__3 ;
    public final void rule__Signature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7673:1: ( rule__Signature__Group__2__Impl rule__Signature__Group__3 )
            // InternalMyDsl.g:7674:2: rule__Signature__Group__2__Impl rule__Signature__Group__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalMyDsl.g:7681:1: rule__Signature__Group__2__Impl : ( '{' ) ;
    public final void rule__Signature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7685:1: ( ( '{' ) )
            // InternalMyDsl.g:7686:1: ( '{' )
            {
            // InternalMyDsl.g:7686:1: ( '{' )
            // InternalMyDsl.g:7687:2: '{'
            {
             before(grammarAccess.getSignatureAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
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
    // InternalMyDsl.g:7696:1: rule__Signature__Group__3 : rule__Signature__Group__3__Impl rule__Signature__Group__4 ;
    public final void rule__Signature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7700:1: ( rule__Signature__Group__3__Impl rule__Signature__Group__4 )
            // InternalMyDsl.g:7701:2: rule__Signature__Group__3__Impl rule__Signature__Group__4
            {
            pushFollow(FOLLOW_31);
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
    // InternalMyDsl.g:7708:1: rule__Signature__Group__3__Impl : ( ( rule__Signature__Group_3__0 )? ) ;
    public final void rule__Signature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7712:1: ( ( ( rule__Signature__Group_3__0 )? ) )
            // InternalMyDsl.g:7713:1: ( ( rule__Signature__Group_3__0 )? )
            {
            // InternalMyDsl.g:7713:1: ( ( rule__Signature__Group_3__0 )? )
            // InternalMyDsl.g:7714:2: ( rule__Signature__Group_3__0 )?
            {
             before(grammarAccess.getSignatureAccess().getGroup_3()); 
            // InternalMyDsl.g:7715:2: ( rule__Signature__Group_3__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==54) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalMyDsl.g:7715:3: rule__Signature__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Signature__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSignatureAccess().getGroup_3()); 

            }


            }

        }
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
    // InternalMyDsl.g:7723:1: rule__Signature__Group__4 : rule__Signature__Group__4__Impl rule__Signature__Group__5 ;
    public final void rule__Signature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7727:1: ( rule__Signature__Group__4__Impl rule__Signature__Group__5 )
            // InternalMyDsl.g:7728:2: rule__Signature__Group__4__Impl rule__Signature__Group__5
            {
            pushFollow(FOLLOW_31);
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
    // InternalMyDsl.g:7735:1: rule__Signature__Group__4__Impl : ( ( rule__Signature__Group_4__0 )? ) ;
    public final void rule__Signature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7739:1: ( ( ( rule__Signature__Group_4__0 )? ) )
            // InternalMyDsl.g:7740:1: ( ( rule__Signature__Group_4__0 )? )
            {
            // InternalMyDsl.g:7740:1: ( ( rule__Signature__Group_4__0 )? )
            // InternalMyDsl.g:7741:2: ( rule__Signature__Group_4__0 )?
            {
             before(grammarAccess.getSignatureAccess().getGroup_4()); 
            // InternalMyDsl.g:7742:2: ( rule__Signature__Group_4__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==55) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalMyDsl.g:7742:3: rule__Signature__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Signature__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSignatureAccess().getGroup_4()); 

            }


            }

        }
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
    // InternalMyDsl.g:7750:1: rule__Signature__Group__5 : rule__Signature__Group__5__Impl ;
    public final void rule__Signature__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7754:1: ( rule__Signature__Group__5__Impl )
            // InternalMyDsl.g:7755:2: rule__Signature__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Signature__Group__5__Impl();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:7761:1: rule__Signature__Group__5__Impl : ( '}' ) ;
    public final void rule__Signature__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7765:1: ( ( '}' ) )
            // InternalMyDsl.g:7766:1: ( '}' )
            {
            // InternalMyDsl.g:7766:1: ( '}' )
            // InternalMyDsl.g:7767:2: '}'
            {
             before(grammarAccess.getSignatureAccess().getRightCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSignatureAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__Signature__Group_3__0"
    // InternalMyDsl.g:7777:1: rule__Signature__Group_3__0 : rule__Signature__Group_3__0__Impl rule__Signature__Group_3__1 ;
    public final void rule__Signature__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7781:1: ( rule__Signature__Group_3__0__Impl rule__Signature__Group_3__1 )
            // InternalMyDsl.g:7782:2: rule__Signature__Group_3__0__Impl rule__Signature__Group_3__1
            {
            pushFollow(FOLLOW_32);
            rule__Signature__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signature__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_3__0"


    // $ANTLR start "rule__Signature__Group_3__0__Impl"
    // InternalMyDsl.g:7789:1: rule__Signature__Group_3__0__Impl : ( 'returnType' ) ;
    public final void rule__Signature__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7793:1: ( ( 'returnType' ) )
            // InternalMyDsl.g:7794:1: ( 'returnType' )
            {
            // InternalMyDsl.g:7794:1: ( 'returnType' )
            // InternalMyDsl.g:7795:2: 'returnType'
            {
             before(grammarAccess.getSignatureAccess().getReturnTypeKeyword_3_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getSignatureAccess().getReturnTypeKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_3__0__Impl"


    // $ANTLR start "rule__Signature__Group_3__1"
    // InternalMyDsl.g:7804:1: rule__Signature__Group_3__1 : rule__Signature__Group_3__1__Impl ;
    public final void rule__Signature__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7808:1: ( rule__Signature__Group_3__1__Impl )
            // InternalMyDsl.g:7809:2: rule__Signature__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Signature__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_3__1"


    // $ANTLR start "rule__Signature__Group_3__1__Impl"
    // InternalMyDsl.g:7815:1: rule__Signature__Group_3__1__Impl : ( ( rule__Signature__ReturnTypeAssignment_3_1 ) ) ;
    public final void rule__Signature__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7819:1: ( ( ( rule__Signature__ReturnTypeAssignment_3_1 ) ) )
            // InternalMyDsl.g:7820:1: ( ( rule__Signature__ReturnTypeAssignment_3_1 ) )
            {
            // InternalMyDsl.g:7820:1: ( ( rule__Signature__ReturnTypeAssignment_3_1 ) )
            // InternalMyDsl.g:7821:2: ( rule__Signature__ReturnTypeAssignment_3_1 )
            {
             before(grammarAccess.getSignatureAccess().getReturnTypeAssignment_3_1()); 
            // InternalMyDsl.g:7822:2: ( rule__Signature__ReturnTypeAssignment_3_1 )
            // InternalMyDsl.g:7822:3: rule__Signature__ReturnTypeAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Signature__ReturnTypeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSignatureAccess().getReturnTypeAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_3__1__Impl"


    // $ANTLR start "rule__Signature__Group_4__0"
    // InternalMyDsl.g:7831:1: rule__Signature__Group_4__0 : rule__Signature__Group_4__0__Impl rule__Signature__Group_4__1 ;
    public final void rule__Signature__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7835:1: ( rule__Signature__Group_4__0__Impl rule__Signature__Group_4__1 )
            // InternalMyDsl.g:7836:2: rule__Signature__Group_4__0__Impl rule__Signature__Group_4__1
            {
            pushFollow(FOLLOW_8);
            rule__Signature__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signature__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_4__0"


    // $ANTLR start "rule__Signature__Group_4__0__Impl"
    // InternalMyDsl.g:7843:1: rule__Signature__Group_4__0__Impl : ( 'parameterType' ) ;
    public final void rule__Signature__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7847:1: ( ( 'parameterType' ) )
            // InternalMyDsl.g:7848:1: ( 'parameterType' )
            {
            // InternalMyDsl.g:7848:1: ( 'parameterType' )
            // InternalMyDsl.g:7849:2: 'parameterType'
            {
             before(grammarAccess.getSignatureAccess().getParameterTypeKeyword_4_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getSignatureAccess().getParameterTypeKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_4__0__Impl"


    // $ANTLR start "rule__Signature__Group_4__1"
    // InternalMyDsl.g:7858:1: rule__Signature__Group_4__1 : rule__Signature__Group_4__1__Impl rule__Signature__Group_4__2 ;
    public final void rule__Signature__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7862:1: ( rule__Signature__Group_4__1__Impl rule__Signature__Group_4__2 )
            // InternalMyDsl.g:7863:2: rule__Signature__Group_4__1__Impl rule__Signature__Group_4__2
            {
            pushFollow(FOLLOW_9);
            rule__Signature__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signature__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_4__1"


    // $ANTLR start "rule__Signature__Group_4__1__Impl"
    // InternalMyDsl.g:7870:1: rule__Signature__Group_4__1__Impl : ( '(' ) ;
    public final void rule__Signature__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7874:1: ( ( '(' ) )
            // InternalMyDsl.g:7875:1: ( '(' )
            {
            // InternalMyDsl.g:7875:1: ( '(' )
            // InternalMyDsl.g:7876:2: '('
            {
             before(grammarAccess.getSignatureAccess().getLeftParenthesisKeyword_4_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSignatureAccess().getLeftParenthesisKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_4__1__Impl"


    // $ANTLR start "rule__Signature__Group_4__2"
    // InternalMyDsl.g:7885:1: rule__Signature__Group_4__2 : rule__Signature__Group_4__2__Impl rule__Signature__Group_4__3 ;
    public final void rule__Signature__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7889:1: ( rule__Signature__Group_4__2__Impl rule__Signature__Group_4__3 )
            // InternalMyDsl.g:7890:2: rule__Signature__Group_4__2__Impl rule__Signature__Group_4__3
            {
            pushFollow(FOLLOW_10);
            rule__Signature__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signature__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_4__2"


    // $ANTLR start "rule__Signature__Group_4__2__Impl"
    // InternalMyDsl.g:7897:1: rule__Signature__Group_4__2__Impl : ( ( rule__Signature__ParameterTypeAssignment_4_2 ) ) ;
    public final void rule__Signature__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7901:1: ( ( ( rule__Signature__ParameterTypeAssignment_4_2 ) ) )
            // InternalMyDsl.g:7902:1: ( ( rule__Signature__ParameterTypeAssignment_4_2 ) )
            {
            // InternalMyDsl.g:7902:1: ( ( rule__Signature__ParameterTypeAssignment_4_2 ) )
            // InternalMyDsl.g:7903:2: ( rule__Signature__ParameterTypeAssignment_4_2 )
            {
             before(grammarAccess.getSignatureAccess().getParameterTypeAssignment_4_2()); 
            // InternalMyDsl.g:7904:2: ( rule__Signature__ParameterTypeAssignment_4_2 )
            // InternalMyDsl.g:7904:3: rule__Signature__ParameterTypeAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Signature__ParameterTypeAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getSignatureAccess().getParameterTypeAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_4__2__Impl"


    // $ANTLR start "rule__Signature__Group_4__3"
    // InternalMyDsl.g:7912:1: rule__Signature__Group_4__3 : rule__Signature__Group_4__3__Impl rule__Signature__Group_4__4 ;
    public final void rule__Signature__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7916:1: ( rule__Signature__Group_4__3__Impl rule__Signature__Group_4__4 )
            // InternalMyDsl.g:7917:2: rule__Signature__Group_4__3__Impl rule__Signature__Group_4__4
            {
            pushFollow(FOLLOW_10);
            rule__Signature__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signature__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_4__3"


    // $ANTLR start "rule__Signature__Group_4__3__Impl"
    // InternalMyDsl.g:7924:1: rule__Signature__Group_4__3__Impl : ( ( rule__Signature__Group_4_3__0 )* ) ;
    public final void rule__Signature__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7928:1: ( ( ( rule__Signature__Group_4_3__0 )* ) )
            // InternalMyDsl.g:7929:1: ( ( rule__Signature__Group_4_3__0 )* )
            {
            // InternalMyDsl.g:7929:1: ( ( rule__Signature__Group_4_3__0 )* )
            // InternalMyDsl.g:7930:2: ( rule__Signature__Group_4_3__0 )*
            {
             before(grammarAccess.getSignatureAccess().getGroup_4_3()); 
            // InternalMyDsl.g:7931:2: ( rule__Signature__Group_4_3__0 )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==19) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalMyDsl.g:7931:3: rule__Signature__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Signature__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

             after(grammarAccess.getSignatureAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_4__3__Impl"


    // $ANTLR start "rule__Signature__Group_4__4"
    // InternalMyDsl.g:7939:1: rule__Signature__Group_4__4 : rule__Signature__Group_4__4__Impl ;
    public final void rule__Signature__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7943:1: ( rule__Signature__Group_4__4__Impl )
            // InternalMyDsl.g:7944:2: rule__Signature__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Signature__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_4__4"


    // $ANTLR start "rule__Signature__Group_4__4__Impl"
    // InternalMyDsl.g:7950:1: rule__Signature__Group_4__4__Impl : ( ')' ) ;
    public final void rule__Signature__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7954:1: ( ( ')' ) )
            // InternalMyDsl.g:7955:1: ( ')' )
            {
            // InternalMyDsl.g:7955:1: ( ')' )
            // InternalMyDsl.g:7956:2: ')'
            {
             before(grammarAccess.getSignatureAccess().getRightParenthesisKeyword_4_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSignatureAccess().getRightParenthesisKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_4__4__Impl"


    // $ANTLR start "rule__Signature__Group_4_3__0"
    // InternalMyDsl.g:7966:1: rule__Signature__Group_4_3__0 : rule__Signature__Group_4_3__0__Impl rule__Signature__Group_4_3__1 ;
    public final void rule__Signature__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7970:1: ( rule__Signature__Group_4_3__0__Impl rule__Signature__Group_4_3__1 )
            // InternalMyDsl.g:7971:2: rule__Signature__Group_4_3__0__Impl rule__Signature__Group_4_3__1
            {
            pushFollow(FOLLOW_9);
            rule__Signature__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signature__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_4_3__0"


    // $ANTLR start "rule__Signature__Group_4_3__0__Impl"
    // InternalMyDsl.g:7978:1: rule__Signature__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Signature__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7982:1: ( ( ',' ) )
            // InternalMyDsl.g:7983:1: ( ',' )
            {
            // InternalMyDsl.g:7983:1: ( ',' )
            // InternalMyDsl.g:7984:2: ','
            {
             before(grammarAccess.getSignatureAccess().getCommaKeyword_4_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSignatureAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_4_3__0__Impl"


    // $ANTLR start "rule__Signature__Group_4_3__1"
    // InternalMyDsl.g:7993:1: rule__Signature__Group_4_3__1 : rule__Signature__Group_4_3__1__Impl ;
    public final void rule__Signature__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7997:1: ( rule__Signature__Group_4_3__1__Impl )
            // InternalMyDsl.g:7998:2: rule__Signature__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Signature__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_4_3__1"


    // $ANTLR start "rule__Signature__Group_4_3__1__Impl"
    // InternalMyDsl.g:8004:1: rule__Signature__Group_4_3__1__Impl : ( ( rule__Signature__ParameterTypeAssignment_4_3_1 ) ) ;
    public final void rule__Signature__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8008:1: ( ( ( rule__Signature__ParameterTypeAssignment_4_3_1 ) ) )
            // InternalMyDsl.g:8009:1: ( ( rule__Signature__ParameterTypeAssignment_4_3_1 ) )
            {
            // InternalMyDsl.g:8009:1: ( ( rule__Signature__ParameterTypeAssignment_4_3_1 ) )
            // InternalMyDsl.g:8010:2: ( rule__Signature__ParameterTypeAssignment_4_3_1 )
            {
             before(grammarAccess.getSignatureAccess().getParameterTypeAssignment_4_3_1()); 
            // InternalMyDsl.g:8011:2: ( rule__Signature__ParameterTypeAssignment_4_3_1 )
            // InternalMyDsl.g:8011:3: rule__Signature__ParameterTypeAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Signature__ParameterTypeAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSignatureAccess().getParameterTypeAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_4_3__1__Impl"


    // $ANTLR start "rule__InternalAction__Group__0"
    // InternalMyDsl.g:8020:1: rule__InternalAction__Group__0 : rule__InternalAction__Group__0__Impl rule__InternalAction__Group__1 ;
    public final void rule__InternalAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8024:1: ( rule__InternalAction__Group__0__Impl rule__InternalAction__Group__1 )
            // InternalMyDsl.g:8025:2: rule__InternalAction__Group__0__Impl rule__InternalAction__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalMyDsl.g:8032:1: rule__InternalAction__Group__0__Impl : ( () ) ;
    public final void rule__InternalAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8036:1: ( ( () ) )
            // InternalMyDsl.g:8037:1: ( () )
            {
            // InternalMyDsl.g:8037:1: ( () )
            // InternalMyDsl.g:8038:2: ()
            {
             before(grammarAccess.getInternalActionAccess().getInternalActionAction_0()); 
            // InternalMyDsl.g:8039:2: ()
            // InternalMyDsl.g:8039:3: 
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
    // InternalMyDsl.g:8047:1: rule__InternalAction__Group__1 : rule__InternalAction__Group__1__Impl ;
    public final void rule__InternalAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8051:1: ( rule__InternalAction__Group__1__Impl )
            // InternalMyDsl.g:8052:2: rule__InternalAction__Group__1__Impl
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
    // InternalMyDsl.g:8058:1: rule__InternalAction__Group__1__Impl : ( 'InternalAction' ) ;
    public final void rule__InternalAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8062:1: ( ( 'InternalAction' ) )
            // InternalMyDsl.g:8063:1: ( 'InternalAction' )
            {
            // InternalMyDsl.g:8063:1: ( 'InternalAction' )
            // InternalMyDsl.g:8064:2: 'InternalAction'
            {
             before(grammarAccess.getInternalActionAccess().getInternalActionKeyword_1()); 
            match(input,56,FOLLOW_2); 
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
    // InternalMyDsl.g:8074:1: rule__Loop__Group__0 : rule__Loop__Group__0__Impl rule__Loop__Group__1 ;
    public final void rule__Loop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8078:1: ( rule__Loop__Group__0__Impl rule__Loop__Group__1 )
            // InternalMyDsl.g:8079:2: rule__Loop__Group__0__Impl rule__Loop__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalMyDsl.g:8086:1: rule__Loop__Group__0__Impl : ( () ) ;
    public final void rule__Loop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8090:1: ( ( () ) )
            // InternalMyDsl.g:8091:1: ( () )
            {
            // InternalMyDsl.g:8091:1: ( () )
            // InternalMyDsl.g:8092:2: ()
            {
             before(grammarAccess.getLoopAccess().getLoopAction_0()); 
            // InternalMyDsl.g:8093:2: ()
            // InternalMyDsl.g:8093:3: 
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
    // InternalMyDsl.g:8101:1: rule__Loop__Group__1 : rule__Loop__Group__1__Impl ;
    public final void rule__Loop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8105:1: ( rule__Loop__Group__1__Impl )
            // InternalMyDsl.g:8106:2: rule__Loop__Group__1__Impl
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
    // InternalMyDsl.g:8112:1: rule__Loop__Group__1__Impl : ( 'Loop' ) ;
    public final void rule__Loop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8116:1: ( ( 'Loop' ) )
            // InternalMyDsl.g:8117:1: ( 'Loop' )
            {
            // InternalMyDsl.g:8117:1: ( 'Loop' )
            // InternalMyDsl.g:8118:2: 'Loop'
            {
             before(grammarAccess.getLoopAccess().getLoopKeyword_1()); 
            match(input,57,FOLLOW_2); 
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
    // InternalMyDsl.g:8128:1: rule__Branch__Group__0 : rule__Branch__Group__0__Impl rule__Branch__Group__1 ;
    public final void rule__Branch__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8132:1: ( rule__Branch__Group__0__Impl rule__Branch__Group__1 )
            // InternalMyDsl.g:8133:2: rule__Branch__Group__0__Impl rule__Branch__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalMyDsl.g:8140:1: rule__Branch__Group__0__Impl : ( () ) ;
    public final void rule__Branch__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8144:1: ( ( () ) )
            // InternalMyDsl.g:8145:1: ( () )
            {
            // InternalMyDsl.g:8145:1: ( () )
            // InternalMyDsl.g:8146:2: ()
            {
             before(grammarAccess.getBranchAccess().getBranchAction_0()); 
            // InternalMyDsl.g:8147:2: ()
            // InternalMyDsl.g:8147:3: 
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
    // InternalMyDsl.g:8155:1: rule__Branch__Group__1 : rule__Branch__Group__1__Impl ;
    public final void rule__Branch__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8159:1: ( rule__Branch__Group__1__Impl )
            // InternalMyDsl.g:8160:2: rule__Branch__Group__1__Impl
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
    // InternalMyDsl.g:8166:1: rule__Branch__Group__1__Impl : ( 'Branch' ) ;
    public final void rule__Branch__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8170:1: ( ( 'Branch' ) )
            // InternalMyDsl.g:8171:1: ( 'Branch' )
            {
            // InternalMyDsl.g:8171:1: ( 'Branch' )
            // InternalMyDsl.g:8172:2: 'Branch'
            {
             before(grammarAccess.getBranchAccess().getBranchKeyword_1()); 
            match(input,58,FOLLOW_2); 
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


    // $ANTLR start "rule__Type_Impl__Group__0"
    // InternalMyDsl.g:8182:1: rule__Type_Impl__Group__0 : rule__Type_Impl__Group__0__Impl rule__Type_Impl__Group__1 ;
    public final void rule__Type_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8186:1: ( rule__Type_Impl__Group__0__Impl rule__Type_Impl__Group__1 )
            // InternalMyDsl.g:8187:2: rule__Type_Impl__Group__0__Impl rule__Type_Impl__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalMyDsl.g:8194:1: rule__Type_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Type_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8198:1: ( ( () ) )
            // InternalMyDsl.g:8199:1: ( () )
            {
            // InternalMyDsl.g:8199:1: ( () )
            // InternalMyDsl.g:8200:2: ()
            {
             before(grammarAccess.getType_ImplAccess().getTypeAction_0()); 
            // InternalMyDsl.g:8201:2: ()
            // InternalMyDsl.g:8201:3: 
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
    // InternalMyDsl.g:8209:1: rule__Type_Impl__Group__1 : rule__Type_Impl__Group__1__Impl ;
    public final void rule__Type_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8213:1: ( rule__Type_Impl__Group__1__Impl )
            // InternalMyDsl.g:8214:2: rule__Type_Impl__Group__1__Impl
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
    // InternalMyDsl.g:8220:1: rule__Type_Impl__Group__1__Impl : ( 'Type' ) ;
    public final void rule__Type_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8224:1: ( ( 'Type' ) )
            // InternalMyDsl.g:8225:1: ( 'Type' )
            {
            // InternalMyDsl.g:8225:1: ( 'Type' )
            // InternalMyDsl.g:8226:2: 'Type'
            {
             before(grammarAccess.getType_ImplAccess().getTypeKeyword_1()); 
            match(input,59,FOLLOW_2); 
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
    // InternalMyDsl.g:8236:1: rule__List__Group__0 : rule__List__Group__0__Impl rule__List__Group__1 ;
    public final void rule__List__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8240:1: ( rule__List__Group__0__Impl rule__List__Group__1 )
            // InternalMyDsl.g:8241:2: rule__List__Group__0__Impl rule__List__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyDsl.g:8248:1: rule__List__Group__0__Impl : ( () ) ;
    public final void rule__List__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8252:1: ( ( () ) )
            // InternalMyDsl.g:8253:1: ( () )
            {
            // InternalMyDsl.g:8253:1: ( () )
            // InternalMyDsl.g:8254:2: ()
            {
             before(grammarAccess.getListAccess().getListAction_0()); 
            // InternalMyDsl.g:8255:2: ()
            // InternalMyDsl.g:8255:3: 
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
    // InternalMyDsl.g:8263:1: rule__List__Group__1 : rule__List__Group__1__Impl ;
    public final void rule__List__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8267:1: ( rule__List__Group__1__Impl )
            // InternalMyDsl.g:8268:2: rule__List__Group__1__Impl
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
    // InternalMyDsl.g:8274:1: rule__List__Group__1__Impl : ( 'List' ) ;
    public final void rule__List__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8278:1: ( ( 'List' ) )
            // InternalMyDsl.g:8279:1: ( 'List' )
            {
            // InternalMyDsl.g:8279:1: ( 'List' )
            // InternalMyDsl.g:8280:2: 'List'
            {
             before(grammarAccess.getListAccess().getListKeyword_1()); 
            match(input,60,FOLLOW_2); 
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
    // InternalMyDsl.g:8290:1: rule__Map__Group__0 : rule__Map__Group__0__Impl rule__Map__Group__1 ;
    public final void rule__Map__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8294:1: ( rule__Map__Group__0__Impl rule__Map__Group__1 )
            // InternalMyDsl.g:8295:2: rule__Map__Group__0__Impl rule__Map__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalMyDsl.g:8302:1: rule__Map__Group__0__Impl : ( () ) ;
    public final void rule__Map__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8306:1: ( ( () ) )
            // InternalMyDsl.g:8307:1: ( () )
            {
            // InternalMyDsl.g:8307:1: ( () )
            // InternalMyDsl.g:8308:2: ()
            {
             before(grammarAccess.getMapAccess().getMapAction_0()); 
            // InternalMyDsl.g:8309:2: ()
            // InternalMyDsl.g:8309:3: 
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
    // InternalMyDsl.g:8317:1: rule__Map__Group__1 : rule__Map__Group__1__Impl ;
    public final void rule__Map__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8321:1: ( rule__Map__Group__1__Impl )
            // InternalMyDsl.g:8322:2: rule__Map__Group__1__Impl
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
    // InternalMyDsl.g:8328:1: rule__Map__Group__1__Impl : ( 'Map' ) ;
    public final void rule__Map__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8332:1: ( ( 'Map' ) )
            // InternalMyDsl.g:8333:1: ( 'Map' )
            {
            // InternalMyDsl.g:8333:1: ( 'Map' )
            // InternalMyDsl.g:8334:2: 'Map'
            {
             before(grammarAccess.getMapAccess().getMapKeyword_1()); 
            match(input,61,FOLLOW_2); 
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
    // InternalMyDsl.g:8344:1: rule__ComplexType__Group__0 : rule__ComplexType__Group__0__Impl rule__ComplexType__Group__1 ;
    public final void rule__ComplexType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8348:1: ( rule__ComplexType__Group__0__Impl rule__ComplexType__Group__1 )
            // InternalMyDsl.g:8349:2: rule__ComplexType__Group__0__Impl rule__ComplexType__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalMyDsl.g:8356:1: rule__ComplexType__Group__0__Impl : ( () ) ;
    public final void rule__ComplexType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8360:1: ( ( () ) )
            // InternalMyDsl.g:8361:1: ( () )
            {
            // InternalMyDsl.g:8361:1: ( () )
            // InternalMyDsl.g:8362:2: ()
            {
             before(grammarAccess.getComplexTypeAccess().getComplexTypeAction_0()); 
            // InternalMyDsl.g:8363:2: ()
            // InternalMyDsl.g:8363:3: 
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
    // InternalMyDsl.g:8371:1: rule__ComplexType__Group__1 : rule__ComplexType__Group__1__Impl ;
    public final void rule__ComplexType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8375:1: ( rule__ComplexType__Group__1__Impl )
            // InternalMyDsl.g:8376:2: rule__ComplexType__Group__1__Impl
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
    // InternalMyDsl.g:8382:1: rule__ComplexType__Group__1__Impl : ( 'ComplexType' ) ;
    public final void rule__ComplexType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8386:1: ( ( 'ComplexType' ) )
            // InternalMyDsl.g:8387:1: ( 'ComplexType' )
            {
            // InternalMyDsl.g:8387:1: ( 'ComplexType' )
            // InternalMyDsl.g:8388:2: 'ComplexType'
            {
             before(grammarAccess.getComplexTypeAccess().getComplexTypeKeyword_1()); 
            match(input,62,FOLLOW_2); 
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
    // InternalMyDsl.g:8398:1: rule__Date__Group__0 : rule__Date__Group__0__Impl rule__Date__Group__1 ;
    public final void rule__Date__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8402:1: ( rule__Date__Group__0__Impl rule__Date__Group__1 )
            // InternalMyDsl.g:8403:2: rule__Date__Group__0__Impl rule__Date__Group__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalMyDsl.g:8410:1: rule__Date__Group__0__Impl : ( () ) ;
    public final void rule__Date__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8414:1: ( ( () ) )
            // InternalMyDsl.g:8415:1: ( () )
            {
            // InternalMyDsl.g:8415:1: ( () )
            // InternalMyDsl.g:8416:2: ()
            {
             before(grammarAccess.getDateAccess().getDateAction_0()); 
            // InternalMyDsl.g:8417:2: ()
            // InternalMyDsl.g:8417:3: 
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
    // InternalMyDsl.g:8425:1: rule__Date__Group__1 : rule__Date__Group__1__Impl ;
    public final void rule__Date__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8429:1: ( rule__Date__Group__1__Impl )
            // InternalMyDsl.g:8430:2: rule__Date__Group__1__Impl
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
    // InternalMyDsl.g:8436:1: rule__Date__Group__1__Impl : ( 'Date' ) ;
    public final void rule__Date__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8440:1: ( ( 'Date' ) )
            // InternalMyDsl.g:8441:1: ( 'Date' )
            {
            // InternalMyDsl.g:8441:1: ( 'Date' )
            // InternalMyDsl.g:8442:2: 'Date'
            {
             before(grammarAccess.getDateAccess().getDateKeyword_1()); 
            match(input,63,FOLLOW_2); 
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
    // InternalMyDsl.g:8452:1: rule__Double__Group__0 : rule__Double__Group__0__Impl rule__Double__Group__1 ;
    public final void rule__Double__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8456:1: ( rule__Double__Group__0__Impl rule__Double__Group__1 )
            // InternalMyDsl.g:8457:2: rule__Double__Group__0__Impl rule__Double__Group__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalMyDsl.g:8464:1: rule__Double__Group__0__Impl : ( () ) ;
    public final void rule__Double__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8468:1: ( ( () ) )
            // InternalMyDsl.g:8469:1: ( () )
            {
            // InternalMyDsl.g:8469:1: ( () )
            // InternalMyDsl.g:8470:2: ()
            {
             before(grammarAccess.getDoubleAccess().getDoubleAction_0()); 
            // InternalMyDsl.g:8471:2: ()
            // InternalMyDsl.g:8471:3: 
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
    // InternalMyDsl.g:8479:1: rule__Double__Group__1 : rule__Double__Group__1__Impl ;
    public final void rule__Double__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8483:1: ( rule__Double__Group__1__Impl )
            // InternalMyDsl.g:8484:2: rule__Double__Group__1__Impl
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
    // InternalMyDsl.g:8490:1: rule__Double__Group__1__Impl : ( 'Double' ) ;
    public final void rule__Double__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8494:1: ( ( 'Double' ) )
            // InternalMyDsl.g:8495:1: ( 'Double' )
            {
            // InternalMyDsl.g:8495:1: ( 'Double' )
            // InternalMyDsl.g:8496:2: 'Double'
            {
             before(grammarAccess.getDoubleAccess().getDoubleKeyword_1()); 
            match(input,64,FOLLOW_2); 
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
    // InternalMyDsl.g:8506:1: rule__String0__Group__0 : rule__String0__Group__0__Impl rule__String0__Group__1 ;
    public final void rule__String0__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8510:1: ( rule__String0__Group__0__Impl rule__String0__Group__1 )
            // InternalMyDsl.g:8511:2: rule__String0__Group__0__Impl rule__String0__Group__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalMyDsl.g:8518:1: rule__String0__Group__0__Impl : ( () ) ;
    public final void rule__String0__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8522:1: ( ( () ) )
            // InternalMyDsl.g:8523:1: ( () )
            {
            // InternalMyDsl.g:8523:1: ( () )
            // InternalMyDsl.g:8524:2: ()
            {
             before(grammarAccess.getString0Access().getStringAction_0()); 
            // InternalMyDsl.g:8525:2: ()
            // InternalMyDsl.g:8525:3: 
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
    // InternalMyDsl.g:8533:1: rule__String0__Group__1 : rule__String0__Group__1__Impl ;
    public final void rule__String0__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8537:1: ( rule__String0__Group__1__Impl )
            // InternalMyDsl.g:8538:2: rule__String0__Group__1__Impl
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
    // InternalMyDsl.g:8544:1: rule__String0__Group__1__Impl : ( 'String' ) ;
    public final void rule__String0__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8548:1: ( ( 'String' ) )
            // InternalMyDsl.g:8549:1: ( 'String' )
            {
            // InternalMyDsl.g:8549:1: ( 'String' )
            // InternalMyDsl.g:8550:2: 'String'
            {
             before(grammarAccess.getString0Access().getStringKeyword_1()); 
            match(input,65,FOLLOW_2); 
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
    // InternalMyDsl.g:8560:1: rule__Int0__Group__0 : rule__Int0__Group__0__Impl rule__Int0__Group__1 ;
    public final void rule__Int0__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8564:1: ( rule__Int0__Group__0__Impl rule__Int0__Group__1 )
            // InternalMyDsl.g:8565:2: rule__Int0__Group__0__Impl rule__Int0__Group__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalMyDsl.g:8572:1: rule__Int0__Group__0__Impl : ( () ) ;
    public final void rule__Int0__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8576:1: ( ( () ) )
            // InternalMyDsl.g:8577:1: ( () )
            {
            // InternalMyDsl.g:8577:1: ( () )
            // InternalMyDsl.g:8578:2: ()
            {
             before(grammarAccess.getInt0Access().getIntAction_0()); 
            // InternalMyDsl.g:8579:2: ()
            // InternalMyDsl.g:8579:3: 
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
    // InternalMyDsl.g:8587:1: rule__Int0__Group__1 : rule__Int0__Group__1__Impl ;
    public final void rule__Int0__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8591:1: ( rule__Int0__Group__1__Impl )
            // InternalMyDsl.g:8592:2: rule__Int0__Group__1__Impl
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
    // InternalMyDsl.g:8598:1: rule__Int0__Group__1__Impl : ( 'Int' ) ;
    public final void rule__Int0__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8602:1: ( ( 'Int' ) )
            // InternalMyDsl.g:8603:1: ( 'Int' )
            {
            // InternalMyDsl.g:8603:1: ( 'Int' )
            // InternalMyDsl.g:8604:2: 'Int'
            {
             before(grammarAccess.getInt0Access().getIntKeyword_1()); 
            match(input,66,FOLLOW_2); 
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
    // InternalMyDsl.g:8614:1: rule__Char__Group__0 : rule__Char__Group__0__Impl rule__Char__Group__1 ;
    public final void rule__Char__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8618:1: ( rule__Char__Group__0__Impl rule__Char__Group__1 )
            // InternalMyDsl.g:8619:2: rule__Char__Group__0__Impl rule__Char__Group__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalMyDsl.g:8626:1: rule__Char__Group__0__Impl : ( () ) ;
    public final void rule__Char__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8630:1: ( ( () ) )
            // InternalMyDsl.g:8631:1: ( () )
            {
            // InternalMyDsl.g:8631:1: ( () )
            // InternalMyDsl.g:8632:2: ()
            {
             before(grammarAccess.getCharAccess().getCharAction_0()); 
            // InternalMyDsl.g:8633:2: ()
            // InternalMyDsl.g:8633:3: 
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
    // InternalMyDsl.g:8641:1: rule__Char__Group__1 : rule__Char__Group__1__Impl ;
    public final void rule__Char__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8645:1: ( rule__Char__Group__1__Impl )
            // InternalMyDsl.g:8646:2: rule__Char__Group__1__Impl
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
    // InternalMyDsl.g:8652:1: rule__Char__Group__1__Impl : ( 'Char' ) ;
    public final void rule__Char__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8656:1: ( ( 'Char' ) )
            // InternalMyDsl.g:8657:1: ( 'Char' )
            {
            // InternalMyDsl.g:8657:1: ( 'Char' )
            // InternalMyDsl.g:8658:2: 'Char'
            {
             before(grammarAccess.getCharAccess().getCharKeyword_1()); 
            match(input,67,FOLLOW_2); 
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
    // InternalMyDsl.g:8668:1: rule__Long__Group__0 : rule__Long__Group__0__Impl rule__Long__Group__1 ;
    public final void rule__Long__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8672:1: ( rule__Long__Group__0__Impl rule__Long__Group__1 )
            // InternalMyDsl.g:8673:2: rule__Long__Group__0__Impl rule__Long__Group__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalMyDsl.g:8680:1: rule__Long__Group__0__Impl : ( () ) ;
    public final void rule__Long__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8684:1: ( ( () ) )
            // InternalMyDsl.g:8685:1: ( () )
            {
            // InternalMyDsl.g:8685:1: ( () )
            // InternalMyDsl.g:8686:2: ()
            {
             before(grammarAccess.getLongAccess().getLongAction_0()); 
            // InternalMyDsl.g:8687:2: ()
            // InternalMyDsl.g:8687:3: 
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
    // InternalMyDsl.g:8695:1: rule__Long__Group__1 : rule__Long__Group__1__Impl ;
    public final void rule__Long__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8699:1: ( rule__Long__Group__1__Impl )
            // InternalMyDsl.g:8700:2: rule__Long__Group__1__Impl
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
    // InternalMyDsl.g:8706:1: rule__Long__Group__1__Impl : ( 'Long' ) ;
    public final void rule__Long__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8710:1: ( ( 'Long' ) )
            // InternalMyDsl.g:8711:1: ( 'Long' )
            {
            // InternalMyDsl.g:8711:1: ( 'Long' )
            // InternalMyDsl.g:8712:2: 'Long'
            {
             before(grammarAccess.getLongAccess().getLongKeyword_1()); 
            match(input,68,FOLLOW_2); 
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
    // InternalMyDsl.g:8722:1: rule__Float__Group__0 : rule__Float__Group__0__Impl rule__Float__Group__1 ;
    public final void rule__Float__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8726:1: ( rule__Float__Group__0__Impl rule__Float__Group__1 )
            // InternalMyDsl.g:8727:2: rule__Float__Group__0__Impl rule__Float__Group__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalMyDsl.g:8734:1: rule__Float__Group__0__Impl : ( () ) ;
    public final void rule__Float__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8738:1: ( ( () ) )
            // InternalMyDsl.g:8739:1: ( () )
            {
            // InternalMyDsl.g:8739:1: ( () )
            // InternalMyDsl.g:8740:2: ()
            {
             before(grammarAccess.getFloatAccess().getFloatAction_0()); 
            // InternalMyDsl.g:8741:2: ()
            // InternalMyDsl.g:8741:3: 
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
    // InternalMyDsl.g:8749:1: rule__Float__Group__1 : rule__Float__Group__1__Impl ;
    public final void rule__Float__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8753:1: ( rule__Float__Group__1__Impl )
            // InternalMyDsl.g:8754:2: rule__Float__Group__1__Impl
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
    // InternalMyDsl.g:8760:1: rule__Float__Group__1__Impl : ( 'Float' ) ;
    public final void rule__Float__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8764:1: ( ( 'Float' ) )
            // InternalMyDsl.g:8765:1: ( 'Float' )
            {
            // InternalMyDsl.g:8765:1: ( 'Float' )
            // InternalMyDsl.g:8766:2: 'Float'
            {
             before(grammarAccess.getFloatAccess().getFloatKeyword_1()); 
            match(input,69,FOLLOW_2); 
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
    // InternalMyDsl.g:8776:1: rule__Boolean__Group__0 : rule__Boolean__Group__0__Impl rule__Boolean__Group__1 ;
    public final void rule__Boolean__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8780:1: ( rule__Boolean__Group__0__Impl rule__Boolean__Group__1 )
            // InternalMyDsl.g:8781:2: rule__Boolean__Group__0__Impl rule__Boolean__Group__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalMyDsl.g:8788:1: rule__Boolean__Group__0__Impl : ( () ) ;
    public final void rule__Boolean__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8792:1: ( ( () ) )
            // InternalMyDsl.g:8793:1: ( () )
            {
            // InternalMyDsl.g:8793:1: ( () )
            // InternalMyDsl.g:8794:2: ()
            {
             before(grammarAccess.getBooleanAccess().getBooleanAction_0()); 
            // InternalMyDsl.g:8795:2: ()
            // InternalMyDsl.g:8795:3: 
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
    // InternalMyDsl.g:8803:1: rule__Boolean__Group__1 : rule__Boolean__Group__1__Impl ;
    public final void rule__Boolean__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8807:1: ( rule__Boolean__Group__1__Impl )
            // InternalMyDsl.g:8808:2: rule__Boolean__Group__1__Impl
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
    // InternalMyDsl.g:8814:1: rule__Boolean__Group__1__Impl : ( 'Boolean' ) ;
    public final void rule__Boolean__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8818:1: ( ( 'Boolean' ) )
            // InternalMyDsl.g:8819:1: ( 'Boolean' )
            {
            // InternalMyDsl.g:8819:1: ( 'Boolean' )
            // InternalMyDsl.g:8820:2: 'Boolean'
            {
             before(grammarAccess.getBooleanAccess().getBooleanKeyword_1()); 
            match(input,70,FOLLOW_2); 
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
    // InternalMyDsl.g:8830:1: rule__Void__Group__0 : rule__Void__Group__0__Impl rule__Void__Group__1 ;
    public final void rule__Void__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8834:1: ( rule__Void__Group__0__Impl rule__Void__Group__1 )
            // InternalMyDsl.g:8835:2: rule__Void__Group__0__Impl rule__Void__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalMyDsl.g:8842:1: rule__Void__Group__0__Impl : ( () ) ;
    public final void rule__Void__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8846:1: ( ( () ) )
            // InternalMyDsl.g:8847:1: ( () )
            {
            // InternalMyDsl.g:8847:1: ( () )
            // InternalMyDsl.g:8848:2: ()
            {
             before(grammarAccess.getVoidAccess().getVoidAction_0()); 
            // InternalMyDsl.g:8849:2: ()
            // InternalMyDsl.g:8849:3: 
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
    // InternalMyDsl.g:8857:1: rule__Void__Group__1 : rule__Void__Group__1__Impl ;
    public final void rule__Void__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8861:1: ( rule__Void__Group__1__Impl )
            // InternalMyDsl.g:8862:2: rule__Void__Group__1__Impl
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
    // InternalMyDsl.g:8868:1: rule__Void__Group__1__Impl : ( 'Void' ) ;
    public final void rule__Void__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8872:1: ( ( 'Void' ) )
            // InternalMyDsl.g:8873:1: ( 'Void' )
            {
            // InternalMyDsl.g:8873:1: ( 'Void' )
            // InternalMyDsl.g:8874:2: 'Void'
            {
             before(grammarAccess.getVoidAccess().getVoidKeyword_1()); 
            match(input,71,FOLLOW_2); 
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


    // $ANTLR start "rule__Model__GreetingsAssignment"
    // InternalMyDsl.g:8884:1: rule__Model__GreetingsAssignment : ( ruleAbstractElement ) ;
    public final void rule__Model__GreetingsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8888:1: ( ( ruleAbstractElement ) )
            // InternalMyDsl.g:8889:2: ( ruleAbstractElement )
            {
            // InternalMyDsl.g:8889:2: ( ruleAbstractElement )
            // InternalMyDsl.g:8890:3: ruleAbstractElement
            {
             before(grammarAccess.getModelAccess().getGreetingsAbstractElementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getModelAccess().getGreetingsAbstractElementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__GreetingsAssignment"


    // $ANTLR start "rule__AbstractElement__NameAssignment_0_1"
    // InternalMyDsl.g:8899:1: rule__AbstractElement__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__AbstractElement__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8903:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:8904:2: ( RULE_ID )
            {
            // InternalMyDsl.g:8904:2: ( RULE_ID )
            // InternalMyDsl.g:8905:3: RULE_ID
            {
             before(grammarAccess.getAbstractElementAccess().getNameIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAbstractElementAccess().getNameIDTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractElement__NameAssignment_0_1"


    // $ANTLR start "rule__AllocationContext__NameAssignment_1"
    // InternalMyDsl.g:8914:1: rule__AllocationContext__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AllocationContext__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8918:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:8919:2: ( RULE_ID )
            {
            // InternalMyDsl.g:8919:2: ( RULE_ID )
            // InternalMyDsl.g:8920:3: RULE_ID
            {
             before(grammarAccess.getAllocationContextAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAllocationContextAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__NameAssignment_1"


    // $ANTLR start "rule__AllocationContext__AllocatedAssemblyContextAssignment_5"
    // InternalMyDsl.g:8929:1: rule__AllocationContext__AllocatedAssemblyContextAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__AllocationContext__AllocatedAssemblyContextAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8933:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8934:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8934:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8935:3: ( ruleEString )
            {
             before(grammarAccess.getAllocationContextAccess().getAllocatedAssemblyContextAssemblyContextCrossReference_5_0()); 
            // InternalMyDsl.g:8936:3: ( ruleEString )
            // InternalMyDsl.g:8937:4: ruleEString
            {
             before(grammarAccess.getAllocationContextAccess().getAllocatedAssemblyContextAssemblyContextEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAllocationContextAccess().getAllocatedAssemblyContextAssemblyContextEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getAllocationContextAccess().getAllocatedAssemblyContextAssemblyContextCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__AllocatedAssemblyContextAssignment_5"


    // $ANTLR start "rule__AllocationContext__AllocatedAssemblyContextAssignment_6_1"
    // InternalMyDsl.g:8948:1: rule__AllocationContext__AllocatedAssemblyContextAssignment_6_1 : ( ( ruleEString ) ) ;
    public final void rule__AllocationContext__AllocatedAssemblyContextAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8952:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8953:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8953:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8954:3: ( ruleEString )
            {
             before(grammarAccess.getAllocationContextAccess().getAllocatedAssemblyContextAssemblyContextCrossReference_6_1_0()); 
            // InternalMyDsl.g:8955:3: ( ruleEString )
            // InternalMyDsl.g:8956:4: ruleEString
            {
             before(grammarAccess.getAllocationContextAccess().getAllocatedAssemblyContextAssemblyContextEStringParserRuleCall_6_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAllocationContextAccess().getAllocatedAssemblyContextAssemblyContextEStringParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getAllocationContextAccess().getAllocatedAssemblyContextAssemblyContextCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__AllocatedAssemblyContextAssignment_6_1"


    // $ANTLR start "rule__AllocationContext__TargetContainerAssignment_8_2"
    // InternalMyDsl.g:8967:1: rule__AllocationContext__TargetContainerAssignment_8_2 : ( ( ruleEString ) ) ;
    public final void rule__AllocationContext__TargetContainerAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8971:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8972:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8972:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8973:3: ( ruleEString )
            {
             before(grammarAccess.getAllocationContextAccess().getTargetContainerContainerCrossReference_8_2_0()); 
            // InternalMyDsl.g:8974:3: ( ruleEString )
            // InternalMyDsl.g:8975:4: ruleEString
            {
             before(grammarAccess.getAllocationContextAccess().getTargetContainerContainerEStringParserRuleCall_8_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAllocationContextAccess().getTargetContainerContainerEStringParserRuleCall_8_2_0_1()); 

            }

             after(grammarAccess.getAllocationContextAccess().getTargetContainerContainerCrossReference_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__TargetContainerAssignment_8_2"


    // $ANTLR start "rule__AllocationContext__TargetContainerAssignment_8_3_1"
    // InternalMyDsl.g:8986:1: rule__AllocationContext__TargetContainerAssignment_8_3_1 : ( ( ruleEString ) ) ;
    public final void rule__AllocationContext__TargetContainerAssignment_8_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8990:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8991:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8991:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8992:3: ( ruleEString )
            {
             before(grammarAccess.getAllocationContextAccess().getTargetContainerContainerCrossReference_8_3_1_0()); 
            // InternalMyDsl.g:8993:3: ( ruleEString )
            // InternalMyDsl.g:8994:4: ruleEString
            {
             before(grammarAccess.getAllocationContextAccess().getTargetContainerContainerEStringParserRuleCall_8_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAllocationContextAccess().getTargetContainerContainerEStringParserRuleCall_8_3_1_0_1()); 

            }

             after(grammarAccess.getAllocationContextAccess().getTargetContainerContainerCrossReference_8_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocationContext__TargetContainerAssignment_8_3_1"


    // $ANTLR start "rule__SystemEnvironment__NameAssignment_1"
    // InternalMyDsl.g:9005:1: rule__SystemEnvironment__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SystemEnvironment__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9009:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:9010:2: ( RULE_ID )
            {
            // InternalMyDsl.g:9010:2: ( RULE_ID )
            // InternalMyDsl.g:9011:3: RULE_ID
            {
             before(grammarAccess.getSystemEnvironmentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSystemEnvironmentAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEnvironment__NameAssignment_1"


    // $ANTLR start "rule__SystemEnvironment__ContainerAssignment_5"
    // InternalMyDsl.g:9020:1: rule__SystemEnvironment__ContainerAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__SystemEnvironment__ContainerAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9024:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:9025:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:9025:2: ( ( ruleEString ) )
            // InternalMyDsl.g:9026:3: ( ruleEString )
            {
             before(grammarAccess.getSystemEnvironmentAccess().getContainerContainerCrossReference_5_0()); 
            // InternalMyDsl.g:9027:3: ( ruleEString )
            // InternalMyDsl.g:9028:4: ruleEString
            {
             before(grammarAccess.getSystemEnvironmentAccess().getContainerContainerEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSystemEnvironmentAccess().getContainerContainerEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getSystemEnvironmentAccess().getContainerContainerCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEnvironment__ContainerAssignment_5"


    // $ANTLR start "rule__SystemEnvironment__ContainerAssignment_6_1"
    // InternalMyDsl.g:9039:1: rule__SystemEnvironment__ContainerAssignment_6_1 : ( ( ruleEString ) ) ;
    public final void rule__SystemEnvironment__ContainerAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9043:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:9044:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:9044:2: ( ( ruleEString ) )
            // InternalMyDsl.g:9045:3: ( ruleEString )
            {
             before(grammarAccess.getSystemEnvironmentAccess().getContainerContainerCrossReference_6_1_0()); 
            // InternalMyDsl.g:9046:3: ( ruleEString )
            // InternalMyDsl.g:9047:4: ruleEString
            {
             before(grammarAccess.getSystemEnvironmentAccess().getContainerContainerEStringParserRuleCall_6_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSystemEnvironmentAccess().getContainerContainerEStringParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getSystemEnvironmentAccess().getContainerContainerCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEnvironment__ContainerAssignment_6_1"


    // $ANTLR start "rule__SystemEnvironment__LinkAssignment_8_2"
    // InternalMyDsl.g:9058:1: rule__SystemEnvironment__LinkAssignment_8_2 : ( ( ruleEString ) ) ;
    public final void rule__SystemEnvironment__LinkAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9062:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:9063:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:9063:2: ( ( ruleEString ) )
            // InternalMyDsl.g:9064:3: ( ruleEString )
            {
             before(grammarAccess.getSystemEnvironmentAccess().getLinkLinkCrossReference_8_2_0()); 
            // InternalMyDsl.g:9065:3: ( ruleEString )
            // InternalMyDsl.g:9066:4: ruleEString
            {
             before(grammarAccess.getSystemEnvironmentAccess().getLinkLinkEStringParserRuleCall_8_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSystemEnvironmentAccess().getLinkLinkEStringParserRuleCall_8_2_0_1()); 

            }

             after(grammarAccess.getSystemEnvironmentAccess().getLinkLinkCrossReference_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEnvironment__LinkAssignment_8_2"


    // $ANTLR start "rule__SystemEnvironment__LinkAssignment_8_3_1"
    // InternalMyDsl.g:9077:1: rule__SystemEnvironment__LinkAssignment_8_3_1 : ( ( ruleEString ) ) ;
    public final void rule__SystemEnvironment__LinkAssignment_8_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9081:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:9082:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:9082:2: ( ( ruleEString ) )
            // InternalMyDsl.g:9083:3: ( ruleEString )
            {
             before(grammarAccess.getSystemEnvironmentAccess().getLinkLinkCrossReference_8_3_1_0()); 
            // InternalMyDsl.g:9084:3: ( ruleEString )
            // InternalMyDsl.g:9085:4: ruleEString
            {
             before(grammarAccess.getSystemEnvironmentAccess().getLinkLinkEStringParserRuleCall_8_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSystemEnvironmentAccess().getLinkLinkEStringParserRuleCall_8_3_1_0_1()); 

            }

             after(grammarAccess.getSystemEnvironmentAccess().getLinkLinkCrossReference_8_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEnvironment__LinkAssignment_8_3_1"


    // $ANTLR start "rule__Container__NameAssignment_1"
    // InternalMyDsl.g:9096:1: rule__Container__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Container__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9100:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:9101:2: ( RULE_ID )
            {
            // InternalMyDsl.g:9101:2: ( RULE_ID )
            // InternalMyDsl.g:9102:3: RULE_ID
            {
             before(grammarAccess.getContainerAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:9111:1: rule__Container__LinksAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__Container__LinksAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9115:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:9116:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:9116:2: ( ( ruleEString ) )
            // InternalMyDsl.g:9117:3: ( ruleEString )
            {
             before(grammarAccess.getContainerAccess().getLinksLinkCrossReference_5_0()); 
            // InternalMyDsl.g:9118:3: ( ruleEString )
            // InternalMyDsl.g:9119:4: ruleEString
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
    // InternalMyDsl.g:9130:1: rule__Container__LinksAssignment_6_1 : ( ( ruleEString ) ) ;
    public final void rule__Container__LinksAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9134:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:9135:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:9135:2: ( ( ruleEString ) )
            // InternalMyDsl.g:9136:3: ( ruleEString )
            {
             before(grammarAccess.getContainerAccess().getLinksLinkCrossReference_6_1_0()); 
            // InternalMyDsl.g:9137:3: ( ruleEString )
            // InternalMyDsl.g:9138:4: ruleEString
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


    // $ANTLR start "rule__System__NameAssignment_1"
    // InternalMyDsl.g:9149:1: rule__System__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__System__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9153:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:9154:2: ( RULE_ID )
            {
            // InternalMyDsl.g:9154:2: ( RULE_ID )
            // InternalMyDsl.g:9155:3: RULE_ID
            {
             before(grammarAccess.getSystemAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__NameAssignment_1"


    // $ANTLR start "rule__System__EncapsulatedAssemblyContextAssignment_5"
    // InternalMyDsl.g:9164:1: rule__System__EncapsulatedAssemblyContextAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__System__EncapsulatedAssemblyContextAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9168:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:9169:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:9169:2: ( ( ruleEString ) )
            // InternalMyDsl.g:9170:3: ( ruleEString )
            {
             before(grammarAccess.getSystemAccess().getEncapsulatedAssemblyContextAssemblyContextCrossReference_5_0()); 
            // InternalMyDsl.g:9171:3: ( ruleEString )
            // InternalMyDsl.g:9172:4: ruleEString
            {
             before(grammarAccess.getSystemAccess().getEncapsulatedAssemblyContextAssemblyContextEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getEncapsulatedAssemblyContextAssemblyContextEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getSystemAccess().getEncapsulatedAssemblyContextAssemblyContextCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__EncapsulatedAssemblyContextAssignment_5"


    // $ANTLR start "rule__System__EncapsulatedAssemblyContextAssignment_6_1"
    // InternalMyDsl.g:9183:1: rule__System__EncapsulatedAssemblyContextAssignment_6_1 : ( ( ruleEString ) ) ;
    public final void rule__System__EncapsulatedAssemblyContextAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9187:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:9188:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:9188:2: ( ( ruleEString ) )
            // InternalMyDsl.g:9189:3: ( ruleEString )
            {
             before(grammarAccess.getSystemAccess().getEncapsulatedAssemblyContextAssemblyContextCrossReference_6_1_0()); 
            // InternalMyDsl.g:9190:3: ( ruleEString )
            // InternalMyDsl.g:9191:4: ruleEString
            {
             before(grammarAccess.getSystemAccess().getEncapsulatedAssemblyContextAssemblyContextEStringParserRuleCall_6_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getEncapsulatedAssemblyContextAssemblyContextEStringParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getSystemAccess().getEncapsulatedAssemblyContextAssemblyContextCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__EncapsulatedAssemblyContextAssignment_6_1"


    // $ANTLR start "rule__System__AllocationContextAssignment_8_1"
    // InternalMyDsl.g:9202:1: rule__System__AllocationContextAssignment_8_1 : ( ( ruleEString ) ) ;
    public final void rule__System__AllocationContextAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9206:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:9207:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:9207:2: ( ( ruleEString ) )
            // InternalMyDsl.g:9208:3: ( ruleEString )
            {
             before(grammarAccess.getSystemAccess().getAllocationContextAllocationContextCrossReference_8_1_0()); 
            // InternalMyDsl.g:9209:3: ( ruleEString )
            // InternalMyDsl.g:9210:4: ruleEString
            {
             before(grammarAccess.getSystemAccess().getAllocationContextAllocationContextEStringParserRuleCall_8_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getAllocationContextAllocationContextEStringParserRuleCall_8_1_0_1()); 

            }

             after(grammarAccess.getSystemAccess().getAllocationContextAllocationContextCrossReference_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__AllocationContextAssignment_8_1"


    // $ANTLR start "rule__System__ProvidedInterfacesAssignment_9_2"
    // InternalMyDsl.g:9221:1: rule__System__ProvidedInterfacesAssignment_9_2 : ( ( ruleEString ) ) ;
    public final void rule__System__ProvidedInterfacesAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9225:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:9226:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:9226:2: ( ( ruleEString ) )
            // InternalMyDsl.g:9227:3: ( ruleEString )
            {
             before(grammarAccess.getSystemAccess().getProvidedInterfacesInterfaceCrossReference_9_2_0()); 
            // InternalMyDsl.g:9228:3: ( ruleEString )
            // InternalMyDsl.g:9229:4: ruleEString
            {
             before(grammarAccess.getSystemAccess().getProvidedInterfacesInterfaceEStringParserRuleCall_9_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getProvidedInterfacesInterfaceEStringParserRuleCall_9_2_0_1()); 

            }

             after(grammarAccess.getSystemAccess().getProvidedInterfacesInterfaceCrossReference_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__ProvidedInterfacesAssignment_9_2"


    // $ANTLR start "rule__System__ProvidedInterfacesAssignment_9_3_1"
    // InternalMyDsl.g:9240:1: rule__System__ProvidedInterfacesAssignment_9_3_1 : ( ( ruleEString ) ) ;
    public final void rule__System__ProvidedInterfacesAssignment_9_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9244:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:9245:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:9245:2: ( ( ruleEString ) )
            // InternalMyDsl.g:9246:3: ( ruleEString )
            {
             before(grammarAccess.getSystemAccess().getProvidedInterfacesInterfaceCrossReference_9_3_1_0()); 
            // InternalMyDsl.g:9247:3: ( ruleEString )
            // InternalMyDsl.g:9248:4: ruleEString
            {
             before(grammarAccess.getSystemAccess().getProvidedInterfacesInterfaceEStringParserRuleCall_9_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getProvidedInterfacesInterfaceEStringParserRuleCall_9_3_1_0_1()); 

            }

             after(grammarAccess.getSystemAccess().getProvidedInterfacesInterfaceCrossReference_9_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__ProvidedInterfacesAssignment_9_3_1"


    // $ANTLR start "rule__System__EnvironmentAssignment_11"
    // InternalMyDsl.g:9259:1: rule__System__EnvironmentAssignment_11 : ( ( ruleEString ) ) ;
    public final void rule__System__EnvironmentAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9263:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:9264:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:9264:2: ( ( ruleEString ) )
            // InternalMyDsl.g:9265:3: ( ruleEString )
            {
             before(grammarAccess.getSystemAccess().getEnvironmentSystemEnvironmentCrossReference_11_0()); 
            // InternalMyDsl.g:9266:3: ( ruleEString )
            // InternalMyDsl.g:9267:4: ruleEString
            {
             before(grammarAccess.getSystemAccess().getEnvironmentSystemEnvironmentEStringParserRuleCall_11_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getEnvironmentSystemEnvironmentEStringParserRuleCall_11_0_1()); 

            }

             after(grammarAccess.getSystemAccess().getEnvironmentSystemEnvironmentCrossReference_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__EnvironmentAssignment_11"


    // $ANTLR start "rule__AssemblyContext__NameAssignment_1"
    // InternalMyDsl.g:9278:1: rule__AssemblyContext__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AssemblyContext__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9282:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:9283:2: ( RULE_ID )
            {
            // InternalMyDsl.g:9283:2: ( RULE_ID )
            // InternalMyDsl.g:9284:3: RULE_ID
            {
             before(grammarAccess.getAssemblyContextAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAssemblyContextAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:9293:1: rule__AssemblyContext__RequiredRoleAssignment_3_2 : ( ( ruleEString ) ) ;
    public final void rule__AssemblyContext__RequiredRoleAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9297:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:9298:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:9298:2: ( ( ruleEString ) )
            // InternalMyDsl.g:9299:3: ( ruleEString )
            {
             before(grammarAccess.getAssemblyContextAccess().getRequiredRoleRoleCrossReference_3_2_0()); 
            // InternalMyDsl.g:9300:3: ( ruleEString )
            // InternalMyDsl.g:9301:4: ruleEString
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
    // InternalMyDsl.g:9312:1: rule__AssemblyContext__RequiredRoleAssignment_3_3_1 : ( ( ruleEString ) ) ;
    public final void rule__AssemblyContext__RequiredRoleAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9316:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:9317:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:9317:2: ( ( ruleEString ) )
            // InternalMyDsl.g:9318:3: ( ruleEString )
            {
             before(grammarAccess.getAssemblyContextAccess().getRequiredRoleRoleCrossReference_3_3_1_0()); 
            // InternalMyDsl.g:9319:3: ( ruleEString )
            // InternalMyDsl.g:9320:4: ruleEString
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


    // $ANTLR start "rule__AssemblyContext__AllocationContextAssignment_4_1"
    // InternalMyDsl.g:9331:1: rule__AssemblyContext__AllocationContextAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__AssemblyContext__AllocationContextAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9335:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:9336:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:9336:2: ( ( ruleEString ) )
            // InternalMyDsl.g:9337:3: ( ruleEString )
            {
             before(grammarAccess.getAssemblyContextAccess().getAllocationContextAllocationContextCrossReference_4_1_0()); 
            // InternalMyDsl.g:9338:3: ( ruleEString )
            // InternalMyDsl.g:9339:4: ruleEString
            {
             before(grammarAccess.getAssemblyContextAccess().getAllocationContextAllocationContextEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAssemblyContextAccess().getAllocationContextAllocationContextEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getAssemblyContextAccess().getAllocationContextAllocationContextCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__AllocationContextAssignment_4_1"


    // $ANTLR start "rule__AssemblyContext__ProvidedRoleAssignment_5_2"
    // InternalMyDsl.g:9350:1: rule__AssemblyContext__ProvidedRoleAssignment_5_2 : ( ( ruleEString ) ) ;
    public final void rule__AssemblyContext__ProvidedRoleAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9354:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:9355:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:9355:2: ( ( ruleEString ) )
            // InternalMyDsl.g:9356:3: ( ruleEString )
            {
             before(grammarAccess.getAssemblyContextAccess().getProvidedRoleRoleCrossReference_5_2_0()); 
            // InternalMyDsl.g:9357:3: ( ruleEString )
            // InternalMyDsl.g:9358:4: ruleEString
            {
             before(grammarAccess.getAssemblyContextAccess().getProvidedRoleRoleEStringParserRuleCall_5_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAssemblyContextAccess().getProvidedRoleRoleEStringParserRuleCall_5_2_0_1()); 

            }

             after(grammarAccess.getAssemblyContextAccess().getProvidedRoleRoleCrossReference_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__ProvidedRoleAssignment_5_2"


    // $ANTLR start "rule__AssemblyContext__ProvidedRoleAssignment_5_3_1"
    // InternalMyDsl.g:9369:1: rule__AssemblyContext__ProvidedRoleAssignment_5_3_1 : ( ( ruleEString ) ) ;
    public final void rule__AssemblyContext__ProvidedRoleAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9373:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:9374:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:9374:2: ( ( ruleEString ) )
            // InternalMyDsl.g:9375:3: ( ruleEString )
            {
             before(grammarAccess.getAssemblyContextAccess().getProvidedRoleRoleCrossReference_5_3_1_0()); 
            // InternalMyDsl.g:9376:3: ( ruleEString )
            // InternalMyDsl.g:9377:4: ruleEString
            {
             before(grammarAccess.getAssemblyContextAccess().getProvidedRoleRoleEStringParserRuleCall_5_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAssemblyContextAccess().getProvidedRoleRoleEStringParserRuleCall_5_3_1_0_1()); 

            }

             after(grammarAccess.getAssemblyContextAccess().getProvidedRoleRoleCrossReference_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__ProvidedRoleAssignment_5_3_1"


    // $ANTLR start "rule__AssemblyContext__ComponentAssignment_6_2"
    // InternalMyDsl.g:9388:1: rule__AssemblyContext__ComponentAssignment_6_2 : ( ( ruleEString ) ) ;
    public final void rule__AssemblyContext__ComponentAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9392:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:9393:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:9393:2: ( ( ruleEString ) )
            // InternalMyDsl.g:9394:3: ( ruleEString )
            {
             before(grammarAccess.getAssemblyContextAccess().getComponentComponentCrossReference_6_2_0()); 
            // InternalMyDsl.g:9395:3: ( ruleEString )
            // InternalMyDsl.g:9396:4: ruleEString
            {
             before(grammarAccess.getAssemblyContextAccess().getComponentComponentEStringParserRuleCall_6_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAssemblyContextAccess().getComponentComponentEStringParserRuleCall_6_2_0_1()); 

            }

             after(grammarAccess.getAssemblyContextAccess().getComponentComponentCrossReference_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__ComponentAssignment_6_2"


    // $ANTLR start "rule__AssemblyContext__ComponentAssignment_6_3_1"
    // InternalMyDsl.g:9407:1: rule__AssemblyContext__ComponentAssignment_6_3_1 : ( ( ruleEString ) ) ;
    public final void rule__AssemblyContext__ComponentAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9411:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:9412:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:9412:2: ( ( ruleEString ) )
            // InternalMyDsl.g:9413:3: ( ruleEString )
            {
             before(grammarAccess.getAssemblyContextAccess().getComponentComponentCrossReference_6_3_1_0()); 
            // InternalMyDsl.g:9414:3: ( ruleEString )
            // InternalMyDsl.g:9415:4: ruleEString
            {
             before(grammarAccess.getAssemblyContextAccess().getComponentComponentEStringParserRuleCall_6_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAssemblyContextAccess().getComponentComponentEStringParserRuleCall_6_3_1_0_1()); 

            }

             after(grammarAccess.getAssemblyContextAccess().getComponentComponentCrossReference_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssemblyContext__ComponentAssignment_6_3_1"


    // $ANTLR start "rule__Link__NameAssignment_1"
    // InternalMyDsl.g:9426:1: rule__Link__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Link__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9430:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:9431:2: ( RULE_ID )
            {
            // InternalMyDsl.g:9431:2: ( RULE_ID )
            // InternalMyDsl.g:9432:3: RULE_ID
            {
             before(grammarAccess.getLinkAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__NameAssignment_1"


    // $ANTLR start "rule__Link__LinkedContainersAssignment_5"
    // InternalMyDsl.g:9441:1: rule__Link__LinkedContainersAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__Link__LinkedContainersAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9445:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:9446:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:9446:2: ( ( ruleEString ) )
            // InternalMyDsl.g:9447:3: ( ruleEString )
            {
             before(grammarAccess.getLinkAccess().getLinkedContainersContainerCrossReference_5_0()); 
            // InternalMyDsl.g:9448:3: ( ruleEString )
            // InternalMyDsl.g:9449:4: ruleEString
            {
             before(grammarAccess.getLinkAccess().getLinkedContainersContainerEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLinkAccess().getLinkedContainersContainerEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getLinkAccess().getLinkedContainersContainerCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__LinkedContainersAssignment_5"


    // $ANTLR start "rule__Link__LinkedContainersAssignment_6_1"
    // InternalMyDsl.g:9460:1: rule__Link__LinkedContainersAssignment_6_1 : ( ( ruleEString ) ) ;
    public final void rule__Link__LinkedContainersAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9464:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:9465:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:9465:2: ( ( ruleEString ) )
            // InternalMyDsl.g:9466:3: ( ruleEString )
            {
             before(grammarAccess.getLinkAccess().getLinkedContainersContainerCrossReference_6_1_0()); 
            // InternalMyDsl.g:9467:3: ( ruleEString )
            // InternalMyDsl.g:9468:4: ruleEString
            {
             before(grammarAccess.getLinkAccess().getLinkedContainersContainerEStringParserRuleCall_6_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLinkAccess().getLinkedContainersContainerEStringParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getLinkAccess().getLinkedContainersContainerCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__LinkedContainersAssignment_6_1"


    // $ANTLR start "rule__Component_Impl__NameAssignment_1"
    // InternalMyDsl.g:9479:1: rule__Component_Impl__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Component_Impl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9483:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:9484:2: ( RULE_ID )
            {
            // InternalMyDsl.g:9484:2: ( RULE_ID )
            // InternalMyDsl.g:9485:3: RULE_ID
            {
             before(grammarAccess.getComponent_ImplAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComponent_ImplAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:9494:1: rule__Component_Impl__RequiredInterfaceAssignment_3_2 : ( ( ruleEString ) ) ;
    public final void rule__Component_Impl__RequiredInterfaceAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9498:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:9499:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:9499:2: ( ( ruleEString ) )
            // InternalMyDsl.g:9500:3: ( ruleEString )
            {
             before(grammarAccess.getComponent_ImplAccess().getRequiredInterfaceInterfaceCrossReference_3_2_0()); 
            // InternalMyDsl.g:9501:3: ( ruleEString )
            // InternalMyDsl.g:9502:4: ruleEString
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
    // InternalMyDsl.g:9513:1: rule__Component_Impl__RequiredInterfaceAssignment_3_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Component_Impl__RequiredInterfaceAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9517:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:9518:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:9518:2: ( ( ruleEString ) )
            // InternalMyDsl.g:9519:3: ( ruleEString )
            {
             before(grammarAccess.getComponent_ImplAccess().getRequiredInterfaceInterfaceCrossReference_3_3_1_0()); 
            // InternalMyDsl.g:9520:3: ( ruleEString )
            // InternalMyDsl.g:9521:4: ruleEString
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


    // $ANTLR start "rule__Component_Impl__RequiredServiceAssignment_4_2"
    // InternalMyDsl.g:9532:1: rule__Component_Impl__RequiredServiceAssignment_4_2 : ( ( ruleEString ) ) ;
    public final void rule__Component_Impl__RequiredServiceAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9536:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:9537:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:9537:2: ( ( ruleEString ) )
            // InternalMyDsl.g:9538:3: ( ruleEString )
            {
             before(grammarAccess.getComponent_ImplAccess().getRequiredServiceServiceCrossReference_4_2_0()); 
            // InternalMyDsl.g:9539:3: ( ruleEString )
            // InternalMyDsl.g:9540:4: ruleEString
            {
             before(grammarAccess.getComponent_ImplAccess().getRequiredServiceServiceEStringParserRuleCall_4_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComponent_ImplAccess().getRequiredServiceServiceEStringParserRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getComponent_ImplAccess().getRequiredServiceServiceCrossReference_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__RequiredServiceAssignment_4_2"


    // $ANTLR start "rule__Component_Impl__RequiredServiceAssignment_4_3_1"
    // InternalMyDsl.g:9551:1: rule__Component_Impl__RequiredServiceAssignment_4_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Component_Impl__RequiredServiceAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9555:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:9556:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:9556:2: ( ( ruleEString ) )
            // InternalMyDsl.g:9557:3: ( ruleEString )
            {
             before(grammarAccess.getComponent_ImplAccess().getRequiredServiceServiceCrossReference_4_3_1_0()); 
            // InternalMyDsl.g:9558:3: ( ruleEString )
            // InternalMyDsl.g:9559:4: ruleEString
            {
             before(grammarAccess.getComponent_ImplAccess().getRequiredServiceServiceEStringParserRuleCall_4_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComponent_ImplAccess().getRequiredServiceServiceEStringParserRuleCall_4_3_1_0_1()); 

            }

             after(grammarAccess.getComponent_ImplAccess().getRequiredServiceServiceCrossReference_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__RequiredServiceAssignment_4_3_1"


    // $ANTLR start "rule__Component_Impl__ProvidedInterfaceAssignment_5_2"
    // InternalMyDsl.g:9570:1: rule__Component_Impl__ProvidedInterfaceAssignment_5_2 : ( ( ruleEString ) ) ;
    public final void rule__Component_Impl__ProvidedInterfaceAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9574:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:9575:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:9575:2: ( ( ruleEString ) )
            // InternalMyDsl.g:9576:3: ( ruleEString )
            {
             before(grammarAccess.getComponent_ImplAccess().getProvidedInterfaceInterfaceCrossReference_5_2_0()); 
            // InternalMyDsl.g:9577:3: ( ruleEString )
            // InternalMyDsl.g:9578:4: ruleEString
            {
             before(grammarAccess.getComponent_ImplAccess().getProvidedInterfaceInterfaceEStringParserRuleCall_5_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComponent_ImplAccess().getProvidedInterfaceInterfaceEStringParserRuleCall_5_2_0_1()); 

            }

             after(grammarAccess.getComponent_ImplAccess().getProvidedInterfaceInterfaceCrossReference_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__ProvidedInterfaceAssignment_5_2"


    // $ANTLR start "rule__Component_Impl__ProvidedInterfaceAssignment_5_3_1"
    // InternalMyDsl.g:9589:1: rule__Component_Impl__ProvidedInterfaceAssignment_5_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Component_Impl__ProvidedInterfaceAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9593:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:9594:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:9594:2: ( ( ruleEString ) )
            // InternalMyDsl.g:9595:3: ( ruleEString )
            {
             before(grammarAccess.getComponent_ImplAccess().getProvidedInterfaceInterfaceCrossReference_5_3_1_0()); 
            // InternalMyDsl.g:9596:3: ( ruleEString )
            // InternalMyDsl.g:9597:4: ruleEString
            {
             before(grammarAccess.getComponent_ImplAccess().getProvidedInterfaceInterfaceEStringParserRuleCall_5_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComponent_ImplAccess().getProvidedInterfaceInterfaceEStringParserRuleCall_5_3_1_0_1()); 

            }

             after(grammarAccess.getComponent_ImplAccess().getProvidedInterfaceInterfaceCrossReference_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__ProvidedInterfaceAssignment_5_3_1"


    // $ANTLR start "rule__Component_Impl__ProvidedServiceAssignment_6_2"
    // InternalMyDsl.g:9608:1: rule__Component_Impl__ProvidedServiceAssignment_6_2 : ( ( ruleEString ) ) ;
    public final void rule__Component_Impl__ProvidedServiceAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9612:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:9613:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:9613:2: ( ( ruleEString ) )
            // InternalMyDsl.g:9614:3: ( ruleEString )
            {
             before(grammarAccess.getComponent_ImplAccess().getProvidedServiceServiceCrossReference_6_2_0()); 
            // InternalMyDsl.g:9615:3: ( ruleEString )
            // InternalMyDsl.g:9616:4: ruleEString
            {
             before(grammarAccess.getComponent_ImplAccess().getProvidedServiceServiceEStringParserRuleCall_6_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComponent_ImplAccess().getProvidedServiceServiceEStringParserRuleCall_6_2_0_1()); 

            }

             after(grammarAccess.getComponent_ImplAccess().getProvidedServiceServiceCrossReference_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__ProvidedServiceAssignment_6_2"


    // $ANTLR start "rule__Component_Impl__ProvidedServiceAssignment_6_3_1"
    // InternalMyDsl.g:9627:1: rule__Component_Impl__ProvidedServiceAssignment_6_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Component_Impl__ProvidedServiceAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9631:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:9632:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:9632:2: ( ( ruleEString ) )
            // InternalMyDsl.g:9633:3: ( ruleEString )
            {
             before(grammarAccess.getComponent_ImplAccess().getProvidedServiceServiceCrossReference_6_3_1_0()); 
            // InternalMyDsl.g:9634:3: ( ruleEString )
            // InternalMyDsl.g:9635:4: ruleEString
            {
             before(grammarAccess.getComponent_ImplAccess().getProvidedServiceServiceEStringParserRuleCall_6_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComponent_ImplAccess().getProvidedServiceServiceEStringParserRuleCall_6_3_1_0_1()); 

            }

             after(grammarAccess.getComponent_ImplAccess().getProvidedServiceServiceCrossReference_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__ProvidedServiceAssignment_6_3_1"


    // $ANTLR start "rule__Component_Impl__BehaviourDescriptionAssignment_7_1"
    // InternalMyDsl.g:9646:1: rule__Component_Impl__BehaviourDescriptionAssignment_7_1 : ( ruleBehaviorDescription ) ;
    public final void rule__Component_Impl__BehaviourDescriptionAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9650:1: ( ( ruleBehaviorDescription ) )
            // InternalMyDsl.g:9651:2: ( ruleBehaviorDescription )
            {
            // InternalMyDsl.g:9651:2: ( ruleBehaviorDescription )
            // InternalMyDsl.g:9652:3: ruleBehaviorDescription
            {
             before(grammarAccess.getComponent_ImplAccess().getBehaviourDescriptionBehaviorDescriptionParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBehaviorDescription();

            state._fsp--;

             after(grammarAccess.getComponent_ImplAccess().getBehaviourDescriptionBehaviorDescriptionParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component_Impl__BehaviourDescriptionAssignment_7_1"


    // $ANTLR start "rule__BehaviorDescription__CalledServicesAssignment_3_2"
    // InternalMyDsl.g:9661:1: rule__BehaviorDescription__CalledServicesAssignment_3_2 : ( ( ruleEString ) ) ;
    public final void rule__BehaviorDescription__CalledServicesAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9665:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:9666:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:9666:2: ( ( ruleEString ) )
            // InternalMyDsl.g:9667:3: ( ruleEString )
            {
             before(grammarAccess.getBehaviorDescriptionAccess().getCalledServicesServiceCrossReference_3_2_0()); 
            // InternalMyDsl.g:9668:3: ( ruleEString )
            // InternalMyDsl.g:9669:4: ruleEString
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
    // InternalMyDsl.g:9680:1: rule__BehaviorDescription__CalledServicesAssignment_3_3_1 : ( ( ruleEString ) ) ;
    public final void rule__BehaviorDescription__CalledServicesAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9684:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:9685:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:9685:2: ( ( ruleEString ) )
            // InternalMyDsl.g:9686:3: ( ruleEString )
            {
             before(grammarAccess.getBehaviorDescriptionAccess().getCalledServicesServiceCrossReference_3_3_1_0()); 
            // InternalMyDsl.g:9687:3: ( ruleEString )
            // InternalMyDsl.g:9688:4: ruleEString
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
    // InternalMyDsl.g:9699:1: rule__BehaviorDescription__InternalActionsAssignment_4_1 : ( ruleInternalAction ) ;
    public final void rule__BehaviorDescription__InternalActionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9703:1: ( ( ruleInternalAction ) )
            // InternalMyDsl.g:9704:2: ( ruleInternalAction )
            {
            // InternalMyDsl.g:9704:2: ( ruleInternalAction )
            // InternalMyDsl.g:9705:3: ruleInternalAction
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
    // InternalMyDsl.g:9714:1: rule__BehaviorDescription__LoopsAssignment_5_1 : ( ruleLoop ) ;
    public final void rule__BehaviorDescription__LoopsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9718:1: ( ( ruleLoop ) )
            // InternalMyDsl.g:9719:2: ( ruleLoop )
            {
            // InternalMyDsl.g:9719:2: ( ruleLoop )
            // InternalMyDsl.g:9720:3: ruleLoop
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
    // InternalMyDsl.g:9729:1: rule__BehaviorDescription__BranchesAssignment_6_1 : ( ruleBranch ) ;
    public final void rule__BehaviorDescription__BranchesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9733:1: ( ( ruleBranch ) )
            // InternalMyDsl.g:9734:2: ( ruleBranch )
            {
            // InternalMyDsl.g:9734:2: ( ruleBranch )
            // InternalMyDsl.g:9735:3: ruleBranch
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
    // InternalMyDsl.g:9744:1: rule__CompositeComponent__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CompositeComponent__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9748:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:9749:2: ( RULE_ID )
            {
            // InternalMyDsl.g:9749:2: ( RULE_ID )
            // InternalMyDsl.g:9750:3: RULE_ID
            {
             before(grammarAccess.getCompositeComponentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCompositeComponentAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:9759:1: rule__CompositeComponent__RequiredInterfaceAssignment_3_2 : ( ( ruleEString ) ) ;
    public final void rule__CompositeComponent__RequiredInterfaceAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9763:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:9764:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:9764:2: ( ( ruleEString ) )
            // InternalMyDsl.g:9765:3: ( ruleEString )
            {
             before(grammarAccess.getCompositeComponentAccess().getRequiredInterfaceInterfaceCrossReference_3_2_0()); 
            // InternalMyDsl.g:9766:3: ( ruleEString )
            // InternalMyDsl.g:9767:4: ruleEString
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
    // InternalMyDsl.g:9778:1: rule__CompositeComponent__RequiredInterfaceAssignment_3_3_1 : ( ( ruleEString ) ) ;
    public final void rule__CompositeComponent__RequiredInterfaceAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9782:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:9783:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:9783:2: ( ( ruleEString ) )
            // InternalMyDsl.g:9784:3: ( ruleEString )
            {
             before(grammarAccess.getCompositeComponentAccess().getRequiredInterfaceInterfaceCrossReference_3_3_1_0()); 
            // InternalMyDsl.g:9785:3: ( ruleEString )
            // InternalMyDsl.g:9786:4: ruleEString
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


    // $ANTLR start "rule__CompositeComponent__RequiredServiceAssignment_4_2"
    // InternalMyDsl.g:9797:1: rule__CompositeComponent__RequiredServiceAssignment_4_2 : ( ( ruleEString ) ) ;
    public final void rule__CompositeComponent__RequiredServiceAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9801:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:9802:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:9802:2: ( ( ruleEString ) )
            // InternalMyDsl.g:9803:3: ( ruleEString )
            {
             before(grammarAccess.getCompositeComponentAccess().getRequiredServiceServiceCrossReference_4_2_0()); 
            // InternalMyDsl.g:9804:3: ( ruleEString )
            // InternalMyDsl.g:9805:4: ruleEString
            {
             before(grammarAccess.getCompositeComponentAccess().getRequiredServiceServiceEStringParserRuleCall_4_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCompositeComponentAccess().getRequiredServiceServiceEStringParserRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getCompositeComponentAccess().getRequiredServiceServiceCrossReference_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__RequiredServiceAssignment_4_2"


    // $ANTLR start "rule__CompositeComponent__RequiredServiceAssignment_4_3_1"
    // InternalMyDsl.g:9816:1: rule__CompositeComponent__RequiredServiceAssignment_4_3_1 : ( ( ruleEString ) ) ;
    public final void rule__CompositeComponent__RequiredServiceAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9820:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:9821:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:9821:2: ( ( ruleEString ) )
            // InternalMyDsl.g:9822:3: ( ruleEString )
            {
             before(grammarAccess.getCompositeComponentAccess().getRequiredServiceServiceCrossReference_4_3_1_0()); 
            // InternalMyDsl.g:9823:3: ( ruleEString )
            // InternalMyDsl.g:9824:4: ruleEString
            {
             before(grammarAccess.getCompositeComponentAccess().getRequiredServiceServiceEStringParserRuleCall_4_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCompositeComponentAccess().getRequiredServiceServiceEStringParserRuleCall_4_3_1_0_1()); 

            }

             after(grammarAccess.getCompositeComponentAccess().getRequiredServiceServiceCrossReference_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__RequiredServiceAssignment_4_3_1"


    // $ANTLR start "rule__CompositeComponent__ProvidedInterfaceAssignment_5_2"
    // InternalMyDsl.g:9835:1: rule__CompositeComponent__ProvidedInterfaceAssignment_5_2 : ( ( ruleEString ) ) ;
    public final void rule__CompositeComponent__ProvidedInterfaceAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9839:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:9840:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:9840:2: ( ( ruleEString ) )
            // InternalMyDsl.g:9841:3: ( ruleEString )
            {
             before(grammarAccess.getCompositeComponentAccess().getProvidedInterfaceInterfaceCrossReference_5_2_0()); 
            // InternalMyDsl.g:9842:3: ( ruleEString )
            // InternalMyDsl.g:9843:4: ruleEString
            {
             before(grammarAccess.getCompositeComponentAccess().getProvidedInterfaceInterfaceEStringParserRuleCall_5_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCompositeComponentAccess().getProvidedInterfaceInterfaceEStringParserRuleCall_5_2_0_1()); 

            }

             after(grammarAccess.getCompositeComponentAccess().getProvidedInterfaceInterfaceCrossReference_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__ProvidedInterfaceAssignment_5_2"


    // $ANTLR start "rule__CompositeComponent__ProvidedInterfaceAssignment_5_3_1"
    // InternalMyDsl.g:9854:1: rule__CompositeComponent__ProvidedInterfaceAssignment_5_3_1 : ( ( ruleEString ) ) ;
    public final void rule__CompositeComponent__ProvidedInterfaceAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9858:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:9859:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:9859:2: ( ( ruleEString ) )
            // InternalMyDsl.g:9860:3: ( ruleEString )
            {
             before(grammarAccess.getCompositeComponentAccess().getProvidedInterfaceInterfaceCrossReference_5_3_1_0()); 
            // InternalMyDsl.g:9861:3: ( ruleEString )
            // InternalMyDsl.g:9862:4: ruleEString
            {
             before(grammarAccess.getCompositeComponentAccess().getProvidedInterfaceInterfaceEStringParserRuleCall_5_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCompositeComponentAccess().getProvidedInterfaceInterfaceEStringParserRuleCall_5_3_1_0_1()); 

            }

             after(grammarAccess.getCompositeComponentAccess().getProvidedInterfaceInterfaceCrossReference_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__ProvidedInterfaceAssignment_5_3_1"


    // $ANTLR start "rule__CompositeComponent__ProvidedServiceAssignment_6_2"
    // InternalMyDsl.g:9873:1: rule__CompositeComponent__ProvidedServiceAssignment_6_2 : ( ( ruleEString ) ) ;
    public final void rule__CompositeComponent__ProvidedServiceAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9877:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:9878:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:9878:2: ( ( ruleEString ) )
            // InternalMyDsl.g:9879:3: ( ruleEString )
            {
             before(grammarAccess.getCompositeComponentAccess().getProvidedServiceServiceCrossReference_6_2_0()); 
            // InternalMyDsl.g:9880:3: ( ruleEString )
            // InternalMyDsl.g:9881:4: ruleEString
            {
             before(grammarAccess.getCompositeComponentAccess().getProvidedServiceServiceEStringParserRuleCall_6_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCompositeComponentAccess().getProvidedServiceServiceEStringParserRuleCall_6_2_0_1()); 

            }

             after(grammarAccess.getCompositeComponentAccess().getProvidedServiceServiceCrossReference_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__ProvidedServiceAssignment_6_2"


    // $ANTLR start "rule__CompositeComponent__ProvidedServiceAssignment_6_3_1"
    // InternalMyDsl.g:9892:1: rule__CompositeComponent__ProvidedServiceAssignment_6_3_1 : ( ( ruleEString ) ) ;
    public final void rule__CompositeComponent__ProvidedServiceAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9896:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:9897:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:9897:2: ( ( ruleEString ) )
            // InternalMyDsl.g:9898:3: ( ruleEString )
            {
             before(grammarAccess.getCompositeComponentAccess().getProvidedServiceServiceCrossReference_6_3_1_0()); 
            // InternalMyDsl.g:9899:3: ( ruleEString )
            // InternalMyDsl.g:9900:4: ruleEString
            {
             before(grammarAccess.getCompositeComponentAccess().getProvidedServiceServiceEStringParserRuleCall_6_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCompositeComponentAccess().getProvidedServiceServiceEStringParserRuleCall_6_3_1_0_1()); 

            }

             after(grammarAccess.getCompositeComponentAccess().getProvidedServiceServiceCrossReference_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__ProvidedServiceAssignment_6_3_1"


    // $ANTLR start "rule__CompositeComponent__BehaviourDescriptionAssignment_7_1"
    // InternalMyDsl.g:9911:1: rule__CompositeComponent__BehaviourDescriptionAssignment_7_1 : ( ruleBehaviorDescription ) ;
    public final void rule__CompositeComponent__BehaviourDescriptionAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9915:1: ( ( ruleBehaviorDescription ) )
            // InternalMyDsl.g:9916:2: ( ruleBehaviorDescription )
            {
            // InternalMyDsl.g:9916:2: ( ruleBehaviorDescription )
            // InternalMyDsl.g:9917:3: ruleBehaviorDescription
            {
             before(grammarAccess.getCompositeComponentAccess().getBehaviourDescriptionBehaviorDescriptionParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBehaviorDescription();

            state._fsp--;

             after(grammarAccess.getCompositeComponentAccess().getBehaviourDescriptionBehaviorDescriptionParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__BehaviourDescriptionAssignment_7_1"


    // $ANTLR start "rule__CompositeComponent__EncapsulatedAssemblyContextAssignment_8_1"
    // InternalMyDsl.g:9926:1: rule__CompositeComponent__EncapsulatedAssemblyContextAssignment_8_1 : ( ruleAssemblyContext ) ;
    public final void rule__CompositeComponent__EncapsulatedAssemblyContextAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9930:1: ( ( ruleAssemblyContext ) )
            // InternalMyDsl.g:9931:2: ( ruleAssemblyContext )
            {
            // InternalMyDsl.g:9931:2: ( ruleAssemblyContext )
            // InternalMyDsl.g:9932:3: ruleAssemblyContext
            {
             before(grammarAccess.getCompositeComponentAccess().getEncapsulatedAssemblyContextAssemblyContextParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAssemblyContext();

            state._fsp--;

             after(grammarAccess.getCompositeComponentAccess().getEncapsulatedAssemblyContextAssemblyContextParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeComponent__EncapsulatedAssemblyContextAssignment_8_1"


    // $ANTLR start "rule__Service__NameAssignment_1"
    // InternalMyDsl.g:9941:1: rule__Service__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Service__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9945:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:9946:2: ( RULE_ID )
            {
            // InternalMyDsl.g:9946:2: ( RULE_ID )
            // InternalMyDsl.g:9947:3: RULE_ID
            {
             before(grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:9956:1: rule__Service__CorrespondingSignatureAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__Service__CorrespondingSignatureAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9960:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:9961:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:9961:2: ( ( ruleEString ) )
            // InternalMyDsl.g:9962:3: ( ruleEString )
            {
             before(grammarAccess.getServiceAccess().getCorrespondingSignatureSignatureCrossReference_5_0()); 
            // InternalMyDsl.g:9963:3: ( ruleEString )
            // InternalMyDsl.g:9964:4: ruleEString
            {
             before(grammarAccess.getServiceAccess().getCorrespondingSignatureSignatureEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getCorrespondingSignatureSignatureEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getServiceAccess().getCorrespondingSignatureSignatureCrossReference_5_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:9975:1: rule__Service__CorrespondingSignatureAssignment_6_1 : ( ( ruleEString ) ) ;
    public final void rule__Service__CorrespondingSignatureAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9979:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:9980:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:9980:2: ( ( ruleEString ) )
            // InternalMyDsl.g:9981:3: ( ruleEString )
            {
             before(grammarAccess.getServiceAccess().getCorrespondingSignatureSignatureCrossReference_6_1_0()); 
            // InternalMyDsl.g:9982:3: ( ruleEString )
            // InternalMyDsl.g:9983:4: ruleEString
            {
             before(grammarAccess.getServiceAccess().getCorrespondingSignatureSignatureEStringParserRuleCall_6_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getCorrespondingSignatureSignatureEStringParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getServiceAccess().getCorrespondingSignatureSignatureCrossReference_6_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Interface__NameAssignment_1"
    // InternalMyDsl.g:9994:1: rule__Interface__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Interface__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:9998:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:9999:2: ( RULE_ID )
            {
            // InternalMyDsl.g:9999:2: ( RULE_ID )
            // InternalMyDsl.g:10000:3: RULE_ID
            {
             before(grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:10009:1: rule__Interface__SignatureAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__Interface__SignatureAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10013:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:10014:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:10014:2: ( ( ruleEString ) )
            // InternalMyDsl.g:10015:3: ( ruleEString )
            {
             before(grammarAccess.getInterfaceAccess().getSignatureSignatureCrossReference_5_0()); 
            // InternalMyDsl.g:10016:3: ( ruleEString )
            // InternalMyDsl.g:10017:4: ruleEString
            {
             before(grammarAccess.getInterfaceAccess().getSignatureSignatureEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInterfaceAccess().getSignatureSignatureEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getInterfaceAccess().getSignatureSignatureCrossReference_5_0()); 

            }


            }

        }
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
    // InternalMyDsl.g:10028:1: rule__Interface__SignatureAssignment_6_1 : ( ( ruleEString ) ) ;
    public final void rule__Interface__SignatureAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10032:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:10033:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:10033:2: ( ( ruleEString ) )
            // InternalMyDsl.g:10034:3: ( ruleEString )
            {
             before(grammarAccess.getInterfaceAccess().getSignatureSignatureCrossReference_6_1_0()); 
            // InternalMyDsl.g:10035:3: ( ruleEString )
            // InternalMyDsl.g:10036:4: ruleEString
            {
             before(grammarAccess.getInterfaceAccess().getSignatureSignatureEStringParserRuleCall_6_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInterfaceAccess().getSignatureSignatureEStringParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getInterfaceAccess().getSignatureSignatureCrossReference_6_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Signature__NameAssignment_1"
    // InternalMyDsl.g:10047:1: rule__Signature__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Signature__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10051:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:10052:2: ( RULE_ID )
            {
            // InternalMyDsl.g:10052:2: ( RULE_ID )
            // InternalMyDsl.g:10053:3: RULE_ID
            {
             before(grammarAccess.getSignatureAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSignatureAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Signature__ReturnTypeAssignment_3_1"
    // InternalMyDsl.g:10062:1: rule__Signature__ReturnTypeAssignment_3_1 : ( ruleType ) ;
    public final void rule__Signature__ReturnTypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10066:1: ( ( ruleType ) )
            // InternalMyDsl.g:10067:2: ( ruleType )
            {
            // InternalMyDsl.g:10067:2: ( ruleType )
            // InternalMyDsl.g:10068:3: ruleType
            {
             before(grammarAccess.getSignatureAccess().getReturnTypeTypeParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getSignatureAccess().getReturnTypeTypeParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__ReturnTypeAssignment_3_1"


    // $ANTLR start "rule__Signature__ParameterTypeAssignment_4_2"
    // InternalMyDsl.g:10077:1: rule__Signature__ParameterTypeAssignment_4_2 : ( ( ruleEString ) ) ;
    public final void rule__Signature__ParameterTypeAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10081:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:10082:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:10082:2: ( ( ruleEString ) )
            // InternalMyDsl.g:10083:3: ( ruleEString )
            {
             before(grammarAccess.getSignatureAccess().getParameterTypeTypeCrossReference_4_2_0()); 
            // InternalMyDsl.g:10084:3: ( ruleEString )
            // InternalMyDsl.g:10085:4: ruleEString
            {
             before(grammarAccess.getSignatureAccess().getParameterTypeTypeEStringParserRuleCall_4_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSignatureAccess().getParameterTypeTypeEStringParserRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getSignatureAccess().getParameterTypeTypeCrossReference_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__ParameterTypeAssignment_4_2"


    // $ANTLR start "rule__Signature__ParameterTypeAssignment_4_3_1"
    // InternalMyDsl.g:10096:1: rule__Signature__ParameterTypeAssignment_4_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Signature__ParameterTypeAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:10100:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:10101:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:10101:2: ( ( ruleEString ) )
            // InternalMyDsl.g:10102:3: ( ruleEString )
            {
             before(grammarAccess.getSignatureAccess().getParameterTypeTypeCrossReference_4_3_1_0()); 
            // InternalMyDsl.g:10103:3: ( ruleEString )
            // InternalMyDsl.g:10104:4: ruleEString
            {
             before(grammarAccess.getSignatureAccess().getParameterTypeTypeEStringParserRuleCall_4_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSignatureAccess().getParameterTypeTypeEStringParserRuleCall_4_3_1_0_1()); 

            }

             after(grammarAccess.getSignatureAccess().getParameterTypeTypeCrossReference_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__ParameterTypeAssignment_4_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x002B002885202802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000840000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000070000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000720040000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000007C000040000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000F00000040000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000007C008040000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00C0000000040000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0xF800000000000000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});

}