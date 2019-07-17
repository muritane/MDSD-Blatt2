package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Hello'", "'!'", "'AllocationContext'", "'{'", "'allocatedAssemblyContext'", "'('", "','", "')'", "'targetContainer'", "'}'", "'SystemEnvironment'", "'container'", "'link'", "'Container'", "'links'", "'System'", "'encapsulatedAssemblyContext'", "'allocationContext'", "'providedInterfaces'", "'environment'", "'AssemblyContext'", "'requiredRole'", "'providedRole'", "'component'", "'Link'", "'linkedContainers'", "'Component'", "'requiredInterface'", "'requiredService'", "'providedInterface'", "'providedService'", "'behaviourDescription'", "'BehaviorDescription'", "'calledServices'", "'internalActions'", "'loops'", "'branches'", "'CompositeComponent'", "'Service'", "'correspondingSignature'", "'Interface'", "'signature'", "'Signature'", "'returnType'", "'parameterType'", "'InternalAction'", "'Loop'", "'Branch'", "'Type'", "'List'", "'Map'", "'ComplexType'", "'Date'", "'Double'", "'String'", "'Int'", "'Char'", "'Long'", "'Float'", "'Boolean'", "'Void'"
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
    public static final int RULE_ID=4;
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
    public static final int RULE_STRING=5;
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

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMyDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMyDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:71:1: ruleModel returns [EObject current=null] : ( (lv_greetings_0_0= ruleAbstractElement ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_greetings_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( (lv_greetings_0_0= ruleAbstractElement ) )* )
            // InternalMyDsl.g:78:2: ( (lv_greetings_0_0= ruleAbstractElement ) )*
            {
            // InternalMyDsl.g:78:2: ( (lv_greetings_0_0= ruleAbstractElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==13||LA1_0==21||LA1_0==24||LA1_0==26||LA1_0==31||LA1_0==35||LA1_0==37||(LA1_0>=48 && LA1_0<=49)||LA1_0==51||LA1_0==53) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:79:3: (lv_greetings_0_0= ruleAbstractElement )
            	    {
            	    // InternalMyDsl.g:79:3: (lv_greetings_0_0= ruleAbstractElement )
            	    // InternalMyDsl.g:80:4: lv_greetings_0_0= ruleAbstractElement
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getGreetingsAbstractElementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_greetings_0_0=ruleAbstractElement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"greetings",
            	    					lv_greetings_0_0,
            	    					"org.xtext.example.mydsl.MyDsl.AbstractElement");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleAbstractElement"
    // InternalMyDsl.g:100:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // InternalMyDsl.g:100:56: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // InternalMyDsl.g:101:2: iv_ruleAbstractElement= ruleAbstractElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractElement=ruleAbstractElement();

            state._fsp--;

             current =iv_ruleAbstractElement; 
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
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // InternalMyDsl.g:107:1: ruleAbstractElement returns [EObject current=null] : ( (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' ) | this_Component_3= ruleComponent | this_Service_4= ruleService | this_Signature_5= ruleSignature | this_AssemblyContext_6= ruleAssemblyContext | this_SystemEnvironment_7= ruleSystemEnvironment | this_Interface_8= ruleInterface | this_AllocationContext_9= ruleAllocationContext | this_Link_10= ruleLink | this_Container_11= ruleContainer | this_System_12= ruleSystem ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject this_Component_3 = null;

        EObject this_Service_4 = null;

        EObject this_Signature_5 = null;

        EObject this_AssemblyContext_6 = null;

        EObject this_SystemEnvironment_7 = null;

        EObject this_Interface_8 = null;

        EObject this_AllocationContext_9 = null;

        EObject this_Link_10 = null;

        EObject this_Container_11 = null;

        EObject this_System_12 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:113:2: ( ( (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' ) | this_Component_3= ruleComponent | this_Service_4= ruleService | this_Signature_5= ruleSignature | this_AssemblyContext_6= ruleAssemblyContext | this_SystemEnvironment_7= ruleSystemEnvironment | this_Interface_8= ruleInterface | this_AllocationContext_9= ruleAllocationContext | this_Link_10= ruleLink | this_Container_11= ruleContainer | this_System_12= ruleSystem ) )
            // InternalMyDsl.g:114:2: ( (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' ) | this_Component_3= ruleComponent | this_Service_4= ruleService | this_Signature_5= ruleSignature | this_AssemblyContext_6= ruleAssemblyContext | this_SystemEnvironment_7= ruleSystemEnvironment | this_Interface_8= ruleInterface | this_AllocationContext_9= ruleAllocationContext | this_Link_10= ruleLink | this_Container_11= ruleContainer | this_System_12= ruleSystem )
            {
            // InternalMyDsl.g:114:2: ( (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' ) | this_Component_3= ruleComponent | this_Service_4= ruleService | this_Signature_5= ruleSignature | this_AssemblyContext_6= ruleAssemblyContext | this_SystemEnvironment_7= ruleSystemEnvironment | this_Interface_8= ruleInterface | this_AllocationContext_9= ruleAllocationContext | this_Link_10= ruleLink | this_Container_11= ruleContainer | this_System_12= ruleSystem )
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
                    // InternalMyDsl.g:115:3: (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' )
                    {
                    // InternalMyDsl.g:115:3: (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' )
                    // InternalMyDsl.g:116:4: otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!'
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getAbstractElementAccess().getHelloKeyword_0_0());
                    			
                    // InternalMyDsl.g:120:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalMyDsl.g:121:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalMyDsl.g:121:5: (lv_name_1_0= RULE_ID )
                    // InternalMyDsl.g:122:6: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    						newLeafNode(lv_name_1_0, grammarAccess.getAbstractElementAccess().getNameIDTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAbstractElementRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,12,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getAbstractElementAccess().getExclamationMarkKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:144:3: this_Component_3= ruleComponent
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getComponentParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Component_3=ruleComponent();

                    state._fsp--;


                    			current = this_Component_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:153:3: this_Service_4= ruleService
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getServiceParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Service_4=ruleService();

                    state._fsp--;


                    			current = this_Service_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:162:3: this_Signature_5= ruleSignature
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getSignatureParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Signature_5=ruleSignature();

                    state._fsp--;


                    			current = this_Signature_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:171:3: this_AssemblyContext_6= ruleAssemblyContext
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getAssemblyContextParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_AssemblyContext_6=ruleAssemblyContext();

                    state._fsp--;


                    			current = this_AssemblyContext_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:180:3: this_SystemEnvironment_7= ruleSystemEnvironment
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getSystemEnvironmentParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_SystemEnvironment_7=ruleSystemEnvironment();

                    state._fsp--;


                    			current = this_SystemEnvironment_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:189:3: this_Interface_8= ruleInterface
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getInterfaceParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Interface_8=ruleInterface();

                    state._fsp--;


                    			current = this_Interface_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:198:3: this_AllocationContext_9= ruleAllocationContext
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getAllocationContextParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_AllocationContext_9=ruleAllocationContext();

                    state._fsp--;


                    			current = this_AllocationContext_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:207:3: this_Link_10= ruleLink
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getLinkParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_Link_10=ruleLink();

                    state._fsp--;


                    			current = this_Link_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:216:3: this_Container_11= ruleContainer
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getContainerParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_Container_11=ruleContainer();

                    state._fsp--;


                    			current = this_Container_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalMyDsl.g:225:3: this_System_12= ruleSystem
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getSystemParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_System_12=ruleSystem();

                    state._fsp--;


                    			current = this_System_12;
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
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleAllocationContext"
    // InternalMyDsl.g:237:1: entryRuleAllocationContext returns [EObject current=null] : iv_ruleAllocationContext= ruleAllocationContext EOF ;
    public final EObject entryRuleAllocationContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllocationContext = null;


        try {
            // InternalMyDsl.g:237:58: (iv_ruleAllocationContext= ruleAllocationContext EOF )
            // InternalMyDsl.g:238:2: iv_ruleAllocationContext= ruleAllocationContext EOF
            {
             newCompositeNode(grammarAccess.getAllocationContextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAllocationContext=ruleAllocationContext();

            state._fsp--;

             current =iv_ruleAllocationContext; 
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
    // $ANTLR end "entryRuleAllocationContext"


    // $ANTLR start "ruleAllocationContext"
    // InternalMyDsl.g:244:1: ruleAllocationContext returns [EObject current=null] : (otherlv_0= 'AllocationContext' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'allocatedAssemblyContext' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' (otherlv_9= 'targetContainer' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? otherlv_15= '}' ) ;
    public final EObject ruleAllocationContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;


        	enterRule();

        try {
            // InternalMyDsl.g:250:2: ( (otherlv_0= 'AllocationContext' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'allocatedAssemblyContext' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' (otherlv_9= 'targetContainer' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? otherlv_15= '}' ) )
            // InternalMyDsl.g:251:2: (otherlv_0= 'AllocationContext' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'allocatedAssemblyContext' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' (otherlv_9= 'targetContainer' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? otherlv_15= '}' )
            {
            // InternalMyDsl.g:251:2: (otherlv_0= 'AllocationContext' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'allocatedAssemblyContext' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' (otherlv_9= 'targetContainer' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? otherlv_15= '}' )
            // InternalMyDsl.g:252:3: otherlv_0= 'AllocationContext' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'allocatedAssemblyContext' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' (otherlv_9= 'targetContainer' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAllocationContextAccess().getAllocationContextKeyword_0());
            		
            // InternalMyDsl.g:256:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:257:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:257:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:258:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAllocationContextAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAllocationContextRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getAllocationContextAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getAllocationContextAccess().getAllocatedAssemblyContextKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getAllocationContextAccess().getLeftParenthesisKeyword_4());
            		
            // InternalMyDsl.g:286:3: ( ( ruleEString ) )
            // InternalMyDsl.g:287:4: ( ruleEString )
            {
            // InternalMyDsl.g:287:4: ( ruleEString )
            // InternalMyDsl.g:288:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAllocationContextRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAllocationContextAccess().getAllocatedAssemblyContextAssemblyContextCrossReference_5_0());
            				
            pushFollow(FOLLOW_10);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:302:3: (otherlv_6= ',' ( ( ruleEString ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:303:4: otherlv_6= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,17,FOLLOW_9); 

            	    				newLeafNode(otherlv_6, grammarAccess.getAllocationContextAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalMyDsl.g:307:4: ( ( ruleEString ) )
            	    // InternalMyDsl.g:308:5: ( ruleEString )
            	    {
            	    // InternalMyDsl.g:308:5: ( ruleEString )
            	    // InternalMyDsl.g:309:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getAllocationContextRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getAllocationContextAccess().getAllocatedAssemblyContextAssemblyContextCrossReference_6_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_8=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_8, grammarAccess.getAllocationContextAccess().getRightParenthesisKeyword_7());
            		
            // InternalMyDsl.g:328:3: (otherlv_9= 'targetContainer' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:329:4: otherlv_9= 'targetContainer' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')'
                    {
                    otherlv_9=(Token)match(input,19,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getAllocationContextAccess().getTargetContainerKeyword_8_0());
                    			
                    otherlv_10=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getAllocationContextAccess().getLeftParenthesisKeyword_8_1());
                    			
                    // InternalMyDsl.g:337:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:338:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:338:5: ( ruleEString )
                    // InternalMyDsl.g:339:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAllocationContextRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAllocationContextAccess().getTargetContainerContainerCrossReference_8_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:353:4: (otherlv_12= ',' ( ( ruleEString ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==17) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalMyDsl.g:354:5: otherlv_12= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,17,FOLLOW_9); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getAllocationContextAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalMyDsl.g:358:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:359:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:359:6: ( ruleEString )
                    	    // InternalMyDsl.g:360:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getAllocationContextRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getAllocationContextAccess().getTargetContainerContainerCrossReference_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,18,FOLLOW_12); 

                    				newLeafNode(otherlv_14, grammarAccess.getAllocationContextAccess().getRightParenthesisKeyword_8_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getAllocationContextAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleAllocationContext"


    // $ANTLR start "entryRuleSystemEnvironment"
    // InternalMyDsl.g:388:1: entryRuleSystemEnvironment returns [EObject current=null] : iv_ruleSystemEnvironment= ruleSystemEnvironment EOF ;
    public final EObject entryRuleSystemEnvironment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemEnvironment = null;


        try {
            // InternalMyDsl.g:388:58: (iv_ruleSystemEnvironment= ruleSystemEnvironment EOF )
            // InternalMyDsl.g:389:2: iv_ruleSystemEnvironment= ruleSystemEnvironment EOF
            {
             newCompositeNode(grammarAccess.getSystemEnvironmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSystemEnvironment=ruleSystemEnvironment();

            state._fsp--;

             current =iv_ruleSystemEnvironment; 
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
    // $ANTLR end "entryRuleSystemEnvironment"


    // $ANTLR start "ruleSystemEnvironment"
    // InternalMyDsl.g:395:1: ruleSystemEnvironment returns [EObject current=null] : (otherlv_0= 'SystemEnvironment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'container' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' (otherlv_9= 'link' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? otherlv_15= '}' ) ;
    public final EObject ruleSystemEnvironment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;


        	enterRule();

        try {
            // InternalMyDsl.g:401:2: ( (otherlv_0= 'SystemEnvironment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'container' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' (otherlv_9= 'link' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? otherlv_15= '}' ) )
            // InternalMyDsl.g:402:2: (otherlv_0= 'SystemEnvironment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'container' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' (otherlv_9= 'link' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? otherlv_15= '}' )
            {
            // InternalMyDsl.g:402:2: (otherlv_0= 'SystemEnvironment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'container' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' (otherlv_9= 'link' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? otherlv_15= '}' )
            // InternalMyDsl.g:403:3: otherlv_0= 'SystemEnvironment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'container' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' (otherlv_9= 'link' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSystemEnvironmentAccess().getSystemEnvironmentKeyword_0());
            		
            // InternalMyDsl.g:407:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:408:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:408:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:409:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSystemEnvironmentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemEnvironmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getSystemEnvironmentAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getSystemEnvironmentAccess().getContainerKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getSystemEnvironmentAccess().getLeftParenthesisKeyword_4());
            		
            // InternalMyDsl.g:437:3: ( ( ruleEString ) )
            // InternalMyDsl.g:438:4: ( ruleEString )
            {
            // InternalMyDsl.g:438:4: ( ruleEString )
            // InternalMyDsl.g:439:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemEnvironmentRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSystemEnvironmentAccess().getContainerContainerCrossReference_5_0());
            				
            pushFollow(FOLLOW_10);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:453:3: (otherlv_6= ',' ( ( ruleEString ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:454:4: otherlv_6= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,17,FOLLOW_9); 

            	    				newLeafNode(otherlv_6, grammarAccess.getSystemEnvironmentAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalMyDsl.g:458:4: ( ( ruleEString ) )
            	    // InternalMyDsl.g:459:5: ( ruleEString )
            	    {
            	    // InternalMyDsl.g:459:5: ( ruleEString )
            	    // InternalMyDsl.g:460:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getSystemEnvironmentRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getSystemEnvironmentAccess().getContainerContainerCrossReference_6_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_8=(Token)match(input,18,FOLLOW_14); 

            			newLeafNode(otherlv_8, grammarAccess.getSystemEnvironmentAccess().getRightParenthesisKeyword_7());
            		
            // InternalMyDsl.g:479:3: (otherlv_9= 'link' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:480:4: otherlv_9= 'link' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')'
                    {
                    otherlv_9=(Token)match(input,23,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getSystemEnvironmentAccess().getLinkKeyword_8_0());
                    			
                    otherlv_10=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getSystemEnvironmentAccess().getLeftParenthesisKeyword_8_1());
                    			
                    // InternalMyDsl.g:488:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:489:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:489:5: ( ruleEString )
                    // InternalMyDsl.g:490:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSystemEnvironmentRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSystemEnvironmentAccess().getLinkLinkCrossReference_8_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:504:4: (otherlv_12= ',' ( ( ruleEString ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==17) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalMyDsl.g:505:5: otherlv_12= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,17,FOLLOW_9); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getSystemEnvironmentAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalMyDsl.g:509:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:510:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:510:6: ( ruleEString )
                    	    // InternalMyDsl.g:511:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getSystemEnvironmentRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getSystemEnvironmentAccess().getLinkLinkCrossReference_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,18,FOLLOW_12); 

                    				newLeafNode(otherlv_14, grammarAccess.getSystemEnvironmentAccess().getRightParenthesisKeyword_8_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getSystemEnvironmentAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleSystemEnvironment"


    // $ANTLR start "entryRuleComponent"
    // InternalMyDsl.g:539:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalMyDsl.g:539:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalMyDsl.g:540:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalMyDsl.g:546:1: ruleComponent returns [EObject current=null] : (this_Component_Impl_0= ruleComponent_Impl | this_CompositeComponent_1= ruleCompositeComponent ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        EObject this_Component_Impl_0 = null;

        EObject this_CompositeComponent_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:552:2: ( (this_Component_Impl_0= ruleComponent_Impl | this_CompositeComponent_1= ruleCompositeComponent ) )
            // InternalMyDsl.g:553:2: (this_Component_Impl_0= ruleComponent_Impl | this_CompositeComponent_1= ruleCompositeComponent )
            {
            // InternalMyDsl.g:553:2: (this_Component_Impl_0= ruleComponent_Impl | this_CompositeComponent_1= ruleCompositeComponent )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==37) ) {
                alt9=1;
            }
            else if ( (LA9_0==48) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:554:3: this_Component_Impl_0= ruleComponent_Impl
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getComponent_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Component_Impl_0=ruleComponent_Impl();

                    state._fsp--;


                    			current = this_Component_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:563:3: this_CompositeComponent_1= ruleCompositeComponent
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getCompositeComponentParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CompositeComponent_1=ruleCompositeComponent();

                    state._fsp--;


                    			current = this_CompositeComponent_1;
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
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleContainer"
    // InternalMyDsl.g:575:1: entryRuleContainer returns [EObject current=null] : iv_ruleContainer= ruleContainer EOF ;
    public final EObject entryRuleContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainer = null;


        try {
            // InternalMyDsl.g:575:50: (iv_ruleContainer= ruleContainer EOF )
            // InternalMyDsl.g:576:2: iv_ruleContainer= ruleContainer EOF
            {
             newCompositeNode(grammarAccess.getContainerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContainer=ruleContainer();

            state._fsp--;

             current =iv_ruleContainer; 
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
    // $ANTLR end "entryRuleContainer"


    // $ANTLR start "ruleContainer"
    // InternalMyDsl.g:582:1: ruleContainer returns [EObject current=null] : (otherlv_0= 'Container' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'links' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' ) ;
    public final EObject ruleContainer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalMyDsl.g:588:2: ( (otherlv_0= 'Container' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'links' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' ) )
            // InternalMyDsl.g:589:2: (otherlv_0= 'Container' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'links' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' )
            {
            // InternalMyDsl.g:589:2: (otherlv_0= 'Container' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'links' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' )
            // InternalMyDsl.g:590:3: otherlv_0= 'Container' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'links' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getContainerAccess().getContainerKeyword_0());
            		
            // InternalMyDsl.g:594:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:595:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:595:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:596:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getContainerAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContainerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,25,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getContainerAccess().getLinksKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getContainerAccess().getLeftParenthesisKeyword_4());
            		
            // InternalMyDsl.g:624:3: ( ( ruleEString ) )
            // InternalMyDsl.g:625:4: ( ruleEString )
            {
            // InternalMyDsl.g:625:4: ( ruleEString )
            // InternalMyDsl.g:626:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContainerRule());
            					}
            				

            					newCompositeNode(grammarAccess.getContainerAccess().getLinksLinkCrossReference_5_0());
            				
            pushFollow(FOLLOW_10);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:640:3: (otherlv_6= ',' ( ( ruleEString ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==17) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:641:4: otherlv_6= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,17,FOLLOW_9); 

            	    				newLeafNode(otherlv_6, grammarAccess.getContainerAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalMyDsl.g:645:4: ( ( ruleEString ) )
            	    // InternalMyDsl.g:646:5: ( ruleEString )
            	    {
            	    // InternalMyDsl.g:646:5: ( ruleEString )
            	    // InternalMyDsl.g:647:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getContainerRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getContainerAccess().getLinksLinkCrossReference_6_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_8=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_8, grammarAccess.getContainerAccess().getRightParenthesisKeyword_7());
            		
            otherlv_9=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleContainer"


    // $ANTLR start "entryRuleSystem"
    // InternalMyDsl.g:674:1: entryRuleSystem returns [EObject current=null] : iv_ruleSystem= ruleSystem EOF ;
    public final EObject entryRuleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystem = null;


        try {
            // InternalMyDsl.g:674:47: (iv_ruleSystem= ruleSystem EOF )
            // InternalMyDsl.g:675:2: iv_ruleSystem= ruleSystem EOF
            {
             newCompositeNode(grammarAccess.getSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSystem=ruleSystem();

            state._fsp--;

             current =iv_ruleSystem; 
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
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // InternalMyDsl.g:681:1: ruleSystem returns [EObject current=null] : (otherlv_0= 'System' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'encapsulatedAssemblyContext' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' (otherlv_9= 'allocationContext' ( ( ruleEString ) ) )? (otherlv_11= 'providedInterfaces' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? otherlv_17= 'environment' ( ( ruleEString ) ) otherlv_19= '}' ) ;
    public final EObject ruleSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;


        	enterRule();

        try {
            // InternalMyDsl.g:687:2: ( (otherlv_0= 'System' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'encapsulatedAssemblyContext' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' (otherlv_9= 'allocationContext' ( ( ruleEString ) ) )? (otherlv_11= 'providedInterfaces' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? otherlv_17= 'environment' ( ( ruleEString ) ) otherlv_19= '}' ) )
            // InternalMyDsl.g:688:2: (otherlv_0= 'System' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'encapsulatedAssemblyContext' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' (otherlv_9= 'allocationContext' ( ( ruleEString ) ) )? (otherlv_11= 'providedInterfaces' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? otherlv_17= 'environment' ( ( ruleEString ) ) otherlv_19= '}' )
            {
            // InternalMyDsl.g:688:2: (otherlv_0= 'System' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'encapsulatedAssemblyContext' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' (otherlv_9= 'allocationContext' ( ( ruleEString ) ) )? (otherlv_11= 'providedInterfaces' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? otherlv_17= 'environment' ( ( ruleEString ) ) otherlv_19= '}' )
            // InternalMyDsl.g:689:3: otherlv_0= 'System' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'encapsulatedAssemblyContext' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' (otherlv_9= 'allocationContext' ( ( ruleEString ) ) )? (otherlv_11= 'providedInterfaces' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? otherlv_17= 'environment' ( ( ruleEString ) ) otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSystemAccess().getSystemKeyword_0());
            		
            // InternalMyDsl.g:693:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:694:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:694:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:695:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSystemAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,27,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getSystemAccess().getEncapsulatedAssemblyContextKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getSystemAccess().getLeftParenthesisKeyword_4());
            		
            // InternalMyDsl.g:723:3: ( ( ruleEString ) )
            // InternalMyDsl.g:724:4: ( ruleEString )
            {
            // InternalMyDsl.g:724:4: ( ruleEString )
            // InternalMyDsl.g:725:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSystemAccess().getEncapsulatedAssemblyContextAssemblyContextCrossReference_5_0());
            				
            pushFollow(FOLLOW_10);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:739:3: (otherlv_6= ',' ( ( ruleEString ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==17) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:740:4: otherlv_6= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,17,FOLLOW_9); 

            	    				newLeafNode(otherlv_6, grammarAccess.getSystemAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalMyDsl.g:744:4: ( ( ruleEString ) )
            	    // InternalMyDsl.g:745:5: ( ruleEString )
            	    {
            	    // InternalMyDsl.g:745:5: ( ruleEString )
            	    // InternalMyDsl.g:746:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getSystemRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getSystemAccess().getEncapsulatedAssemblyContextAssemblyContextCrossReference_6_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_8=(Token)match(input,18,FOLLOW_17); 

            			newLeafNode(otherlv_8, grammarAccess.getSystemAccess().getRightParenthesisKeyword_7());
            		
            // InternalMyDsl.g:765:3: (otherlv_9= 'allocationContext' ( ( ruleEString ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==28) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:766:4: otherlv_9= 'allocationContext' ( ( ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,28,FOLLOW_9); 

                    				newLeafNode(otherlv_9, grammarAccess.getSystemAccess().getAllocationContextKeyword_8_0());
                    			
                    // InternalMyDsl.g:770:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:771:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:771:5: ( ruleEString )
                    // InternalMyDsl.g:772:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSystemRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSystemAccess().getAllocationContextAllocationContextCrossReference_8_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:787:3: (otherlv_11= 'providedInterfaces' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==29) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:788:4: otherlv_11= 'providedInterfaces' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')'
                    {
                    otherlv_11=(Token)match(input,29,FOLLOW_8); 

                    				newLeafNode(otherlv_11, grammarAccess.getSystemAccess().getProvidedInterfacesKeyword_9_0());
                    			
                    otherlv_12=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_12, grammarAccess.getSystemAccess().getLeftParenthesisKeyword_9_1());
                    			
                    // InternalMyDsl.g:796:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:797:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:797:5: ( ruleEString )
                    // InternalMyDsl.g:798:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSystemRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSystemAccess().getProvidedInterfacesInterfaceCrossReference_9_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:812:4: (otherlv_14= ',' ( ( ruleEString ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==17) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalMyDsl.g:813:5: otherlv_14= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_14=(Token)match(input,17,FOLLOW_9); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getSystemAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalMyDsl.g:817:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:818:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:818:6: ( ruleEString )
                    	    // InternalMyDsl.g:819:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getSystemRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getSystemAccess().getProvidedInterfacesInterfaceCrossReference_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,18,FOLLOW_19); 

                    				newLeafNode(otherlv_16, grammarAccess.getSystemAccess().getRightParenthesisKeyword_9_4());
                    			

                    }
                    break;

            }

            otherlv_17=(Token)match(input,30,FOLLOW_9); 

            			newLeafNode(otherlv_17, grammarAccess.getSystemAccess().getEnvironmentKeyword_10());
            		
            // InternalMyDsl.g:843:3: ( ( ruleEString ) )
            // InternalMyDsl.g:844:4: ( ruleEString )
            {
            // InternalMyDsl.g:844:4: ( ruleEString )
            // InternalMyDsl.g:845:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSystemAccess().getEnvironmentSystemEnvironmentCrossReference_11_0());
            				
            pushFollow(FOLLOW_12);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_19=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_12());
            		

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
    // $ANTLR end "ruleSystem"


    // $ANTLR start "entryRuleAssemblyContext"
    // InternalMyDsl.g:867:1: entryRuleAssemblyContext returns [EObject current=null] : iv_ruleAssemblyContext= ruleAssemblyContext EOF ;
    public final EObject entryRuleAssemblyContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssemblyContext = null;


        try {
            // InternalMyDsl.g:867:56: (iv_ruleAssemblyContext= ruleAssemblyContext EOF )
            // InternalMyDsl.g:868:2: iv_ruleAssemblyContext= ruleAssemblyContext EOF
            {
             newCompositeNode(grammarAccess.getAssemblyContextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssemblyContext=ruleAssemblyContext();

            state._fsp--;

             current =iv_ruleAssemblyContext; 
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
    // $ANTLR end "entryRuleAssemblyContext"


    // $ANTLR start "ruleAssemblyContext"
    // InternalMyDsl.g:874:1: ruleAssemblyContext returns [EObject current=null] : (otherlv_0= 'AssemblyContext' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'requiredRole' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'allocationContext' ( ( ruleEString ) ) )? (otherlv_11= 'providedRole' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'component' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' )? otherlv_23= '}' ) ;
    public final EObject ruleAssemblyContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;


        	enterRule();

        try {
            // InternalMyDsl.g:880:2: ( (otherlv_0= 'AssemblyContext' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'requiredRole' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'allocationContext' ( ( ruleEString ) ) )? (otherlv_11= 'providedRole' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'component' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' )? otherlv_23= '}' ) )
            // InternalMyDsl.g:881:2: (otherlv_0= 'AssemblyContext' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'requiredRole' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'allocationContext' ( ( ruleEString ) ) )? (otherlv_11= 'providedRole' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'component' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' )? otherlv_23= '}' )
            {
            // InternalMyDsl.g:881:2: (otherlv_0= 'AssemblyContext' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'requiredRole' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'allocationContext' ( ( ruleEString ) ) )? (otherlv_11= 'providedRole' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'component' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' )? otherlv_23= '}' )
            // InternalMyDsl.g:882:3: otherlv_0= 'AssemblyContext' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'requiredRole' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'allocationContext' ( ( ruleEString ) ) )? (otherlv_11= 'providedRole' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'component' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' )? otherlv_23= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAssemblyContextAccess().getAssemblyContextKeyword_0());
            		
            // InternalMyDsl.g:886:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:887:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:887:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:888:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAssemblyContextAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssemblyContextRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getAssemblyContextAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:908:3: (otherlv_3= 'requiredRole' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==32) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:909:4: otherlv_3= 'requiredRole' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')'
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getAssemblyContextAccess().getRequiredRoleKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getAssemblyContextAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalMyDsl.g:917:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:918:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:918:5: ( ruleEString )
                    // InternalMyDsl.g:919:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAssemblyContextRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAssemblyContextAccess().getRequiredRoleRoleCrossReference_3_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:933:4: (otherlv_6= ',' ( ( ruleEString ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==17) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalMyDsl.g:934:5: otherlv_6= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,17,FOLLOW_9); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getAssemblyContextAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalMyDsl.g:938:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:939:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:939:6: ( ruleEString )
                    	    // InternalMyDsl.g:940:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getAssemblyContextRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getAssemblyContextAccess().getRequiredRoleRoleCrossReference_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,18,FOLLOW_21); 

                    				newLeafNode(otherlv_8, grammarAccess.getAssemblyContextAccess().getRightParenthesisKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:960:3: (otherlv_9= 'allocationContext' ( ( ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==28) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:961:4: otherlv_9= 'allocationContext' ( ( ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,28,FOLLOW_9); 

                    				newLeafNode(otherlv_9, grammarAccess.getAssemblyContextAccess().getAllocationContextKeyword_4_0());
                    			
                    // InternalMyDsl.g:965:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:966:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:966:5: ( ruleEString )
                    // InternalMyDsl.g:967:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAssemblyContextRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAssemblyContextAccess().getAllocationContextAllocationContextCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:982:3: (otherlv_11= 'providedRole' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==33) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:983:4: otherlv_11= 'providedRole' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')'
                    {
                    otherlv_11=(Token)match(input,33,FOLLOW_8); 

                    				newLeafNode(otherlv_11, grammarAccess.getAssemblyContextAccess().getProvidedRoleKeyword_5_0());
                    			
                    otherlv_12=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_12, grammarAccess.getAssemblyContextAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalMyDsl.g:991:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:992:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:992:5: ( ruleEString )
                    // InternalMyDsl.g:993:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAssemblyContextRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAssemblyContextAccess().getProvidedRoleRoleCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1007:4: (otherlv_14= ',' ( ( ruleEString ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==17) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalMyDsl.g:1008:5: otherlv_14= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_14=(Token)match(input,17,FOLLOW_9); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getAssemblyContextAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalMyDsl.g:1012:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:1013:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:1013:6: ( ruleEString )
                    	    // InternalMyDsl.g:1014:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getAssemblyContextRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getAssemblyContextAccess().getProvidedRoleRoleCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,18,FOLLOW_23); 

                    				newLeafNode(otherlv_16, grammarAccess.getAssemblyContextAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1034:3: (otherlv_17= 'component' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==34) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:1035:4: otherlv_17= 'component' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')'
                    {
                    otherlv_17=(Token)match(input,34,FOLLOW_8); 

                    				newLeafNode(otherlv_17, grammarAccess.getAssemblyContextAccess().getComponentKeyword_6_0());
                    			
                    otherlv_18=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_18, grammarAccess.getAssemblyContextAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalMyDsl.g:1043:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:1044:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:1044:5: ( ruleEString )
                    // InternalMyDsl.g:1045:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAssemblyContextRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAssemblyContextAccess().getComponentComponentCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1059:4: (otherlv_20= ',' ( ( ruleEString ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==17) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalMyDsl.g:1060:5: otherlv_20= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_20=(Token)match(input,17,FOLLOW_9); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getAssemblyContextAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalMyDsl.g:1064:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:1065:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:1065:6: ( ruleEString )
                    	    // InternalMyDsl.g:1066:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getAssemblyContextRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getAssemblyContextAccess().getComponentComponentCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,18,FOLLOW_12); 

                    				newLeafNode(otherlv_22, grammarAccess.getAssemblyContextAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_23=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_23, grammarAccess.getAssemblyContextAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleAssemblyContext"


    // $ANTLR start "entryRuleLink"
    // InternalMyDsl.g:1094:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // InternalMyDsl.g:1094:45: (iv_ruleLink= ruleLink EOF )
            // InternalMyDsl.g:1095:2: iv_ruleLink= ruleLink EOF
            {
             newCompositeNode(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLink=ruleLink();

            state._fsp--;

             current =iv_ruleLink; 
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
    // $ANTLR end "entryRuleLink"


    // $ANTLR start "ruleLink"
    // InternalMyDsl.g:1101:1: ruleLink returns [EObject current=null] : (otherlv_0= 'Link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'linkedContainers' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1107:2: ( (otherlv_0= 'Link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'linkedContainers' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' ) )
            // InternalMyDsl.g:1108:2: (otherlv_0= 'Link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'linkedContainers' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' )
            {
            // InternalMyDsl.g:1108:2: (otherlv_0= 'Link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'linkedContainers' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' )
            // InternalMyDsl.g:1109:3: otherlv_0= 'Link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'linkedContainers' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLinkAccess().getLinkKeyword_0());
            		
            // InternalMyDsl.g:1113:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1114:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1114:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1115:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLinkAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLinkRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getLinkAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,36,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getLinkAccess().getLinkedContainersKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getLinkAccess().getLeftParenthesisKeyword_4());
            		
            // InternalMyDsl.g:1143:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1144:4: ( ruleEString )
            {
            // InternalMyDsl.g:1144:4: ( ruleEString )
            // InternalMyDsl.g:1145:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLinkRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLinkAccess().getLinkedContainersContainerCrossReference_5_0());
            				
            pushFollow(FOLLOW_10);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1159:3: (otherlv_6= ',' ( ( ruleEString ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==17) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMyDsl.g:1160:4: otherlv_6= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,17,FOLLOW_9); 

            	    				newLeafNode(otherlv_6, grammarAccess.getLinkAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalMyDsl.g:1164:4: ( ( ruleEString ) )
            	    // InternalMyDsl.g:1165:5: ( ruleEString )
            	    {
            	    // InternalMyDsl.g:1165:5: ( ruleEString )
            	    // InternalMyDsl.g:1166:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getLinkRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getLinkAccess().getLinkedContainersContainerCrossReference_6_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_8=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_8, grammarAccess.getLinkAccess().getRightParenthesisKeyword_7());
            		
            otherlv_9=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getLinkAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleLink"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:1193:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:1193:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:1194:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:1200:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1206:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:1207:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:1207:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_STRING) ) {
                alt23=1;
            }
            else if ( (LA23_0==RULE_ID) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:1208:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1216:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleComponent_Impl"
    // InternalMyDsl.g:1227:1: entryRuleComponent_Impl returns [EObject current=null] : iv_ruleComponent_Impl= ruleComponent_Impl EOF ;
    public final EObject entryRuleComponent_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent_Impl = null;


        try {
            // InternalMyDsl.g:1227:55: (iv_ruleComponent_Impl= ruleComponent_Impl EOF )
            // InternalMyDsl.g:1228:2: iv_ruleComponent_Impl= ruleComponent_Impl EOF
            {
             newCompositeNode(grammarAccess.getComponent_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponent_Impl=ruleComponent_Impl();

            state._fsp--;

             current =iv_ruleComponent_Impl; 
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
    // $ANTLR end "entryRuleComponent_Impl"


    // $ANTLR start "ruleComponent_Impl"
    // InternalMyDsl.g:1234:1: ruleComponent_Impl returns [EObject current=null] : (otherlv_0= 'Component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'requiredInterface' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'requiredService' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'providedInterface' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'providedService' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')' )? (otherlv_27= 'behaviourDescription' ( (lv_behaviourDescription_28_0= ruleBehaviorDescription ) ) )? otherlv_29= '}' ) ;
    public final EObject ruleComponent_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        EObject lv_behaviourDescription_28_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1240:2: ( (otherlv_0= 'Component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'requiredInterface' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'requiredService' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'providedInterface' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'providedService' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')' )? (otherlv_27= 'behaviourDescription' ( (lv_behaviourDescription_28_0= ruleBehaviorDescription ) ) )? otherlv_29= '}' ) )
            // InternalMyDsl.g:1241:2: (otherlv_0= 'Component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'requiredInterface' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'requiredService' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'providedInterface' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'providedService' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')' )? (otherlv_27= 'behaviourDescription' ( (lv_behaviourDescription_28_0= ruleBehaviorDescription ) ) )? otherlv_29= '}' )
            {
            // InternalMyDsl.g:1241:2: (otherlv_0= 'Component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'requiredInterface' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'requiredService' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'providedInterface' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'providedService' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')' )? (otherlv_27= 'behaviourDescription' ( (lv_behaviourDescription_28_0= ruleBehaviorDescription ) ) )? otherlv_29= '}' )
            // InternalMyDsl.g:1242:3: otherlv_0= 'Component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'requiredInterface' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'requiredService' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'providedInterface' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'providedService' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')' )? (otherlv_27= 'behaviourDescription' ( (lv_behaviourDescription_28_0= ruleBehaviorDescription ) ) )? otherlv_29= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getComponent_ImplAccess().getComponentKeyword_0());
            		
            // InternalMyDsl.g:1246:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1247:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1247:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1248:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getComponent_ImplAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponent_ImplRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getComponent_ImplAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:1268:3: (otherlv_3= 'requiredInterface' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==38) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyDsl.g:1269:4: otherlv_3= 'requiredInterface' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')'
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getComponent_ImplAccess().getRequiredInterfaceKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getComponent_ImplAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalMyDsl.g:1277:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:1278:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:1278:5: ( ruleEString )
                    // InternalMyDsl.g:1279:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getComponent_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getComponent_ImplAccess().getRequiredInterfaceInterfaceCrossReference_3_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1293:4: (otherlv_6= ',' ( ( ruleEString ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==17) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalMyDsl.g:1294:5: otherlv_6= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,17,FOLLOW_9); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getComponent_ImplAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalMyDsl.g:1298:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:1299:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:1299:6: ( ruleEString )
                    	    // InternalMyDsl.g:1300:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getComponent_ImplRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getComponent_ImplAccess().getRequiredInterfaceInterfaceCrossReference_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,18,FOLLOW_26); 

                    				newLeafNode(otherlv_8, grammarAccess.getComponent_ImplAccess().getRightParenthesisKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1320:3: (otherlv_9= 'requiredService' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==39) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyDsl.g:1321:4: otherlv_9= 'requiredService' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')'
                    {
                    otherlv_9=(Token)match(input,39,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getComponent_ImplAccess().getRequiredServiceKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getComponent_ImplAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalMyDsl.g:1329:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:1330:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:1330:5: ( ruleEString )
                    // InternalMyDsl.g:1331:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getComponent_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getComponent_ImplAccess().getRequiredServiceServiceCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1345:4: (otherlv_12= ',' ( ( ruleEString ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==17) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalMyDsl.g:1346:5: otherlv_12= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,17,FOLLOW_9); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getComponent_ImplAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalMyDsl.g:1350:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:1351:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:1351:6: ( ruleEString )
                    	    // InternalMyDsl.g:1352:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getComponent_ImplRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getComponent_ImplAccess().getRequiredServiceServiceCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,18,FOLLOW_27); 

                    				newLeafNode(otherlv_14, grammarAccess.getComponent_ImplAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1372:3: (otherlv_15= 'providedInterface' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==40) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMyDsl.g:1373:4: otherlv_15= 'providedInterface' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')'
                    {
                    otherlv_15=(Token)match(input,40,FOLLOW_8); 

                    				newLeafNode(otherlv_15, grammarAccess.getComponent_ImplAccess().getProvidedInterfaceKeyword_5_0());
                    			
                    otherlv_16=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_16, grammarAccess.getComponent_ImplAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalMyDsl.g:1381:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:1382:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:1382:5: ( ruleEString )
                    // InternalMyDsl.g:1383:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getComponent_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getComponent_ImplAccess().getProvidedInterfaceInterfaceCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1397:4: (otherlv_18= ',' ( ( ruleEString ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==17) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalMyDsl.g:1398:5: otherlv_18= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_18=(Token)match(input,17,FOLLOW_9); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getComponent_ImplAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalMyDsl.g:1402:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:1403:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:1403:6: ( ruleEString )
                    	    // InternalMyDsl.g:1404:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getComponent_ImplRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getComponent_ImplAccess().getProvidedInterfaceInterfaceCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,18,FOLLOW_28); 

                    				newLeafNode(otherlv_20, grammarAccess.getComponent_ImplAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1424:3: (otherlv_21= 'providedService' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==41) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMyDsl.g:1425:4: otherlv_21= 'providedService' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')'
                    {
                    otherlv_21=(Token)match(input,41,FOLLOW_8); 

                    				newLeafNode(otherlv_21, grammarAccess.getComponent_ImplAccess().getProvidedServiceKeyword_6_0());
                    			
                    otherlv_22=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_22, grammarAccess.getComponent_ImplAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalMyDsl.g:1433:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:1434:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:1434:5: ( ruleEString )
                    // InternalMyDsl.g:1435:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getComponent_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getComponent_ImplAccess().getProvidedServiceServiceCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1449:4: (otherlv_24= ',' ( ( ruleEString ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==17) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalMyDsl.g:1450:5: otherlv_24= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_24=(Token)match(input,17,FOLLOW_9); 

                    	    					newLeafNode(otherlv_24, grammarAccess.getComponent_ImplAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalMyDsl.g:1454:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:1455:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:1455:6: ( ruleEString )
                    	    // InternalMyDsl.g:1456:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getComponent_ImplRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getComponent_ImplAccess().getProvidedServiceServiceCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,18,FOLLOW_29); 

                    				newLeafNode(otherlv_26, grammarAccess.getComponent_ImplAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1476:3: (otherlv_27= 'behaviourDescription' ( (lv_behaviourDescription_28_0= ruleBehaviorDescription ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==42) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMyDsl.g:1477:4: otherlv_27= 'behaviourDescription' ( (lv_behaviourDescription_28_0= ruleBehaviorDescription ) )
                    {
                    otherlv_27=(Token)match(input,42,FOLLOW_30); 

                    				newLeafNode(otherlv_27, grammarAccess.getComponent_ImplAccess().getBehaviourDescriptionKeyword_7_0());
                    			
                    // InternalMyDsl.g:1481:4: ( (lv_behaviourDescription_28_0= ruleBehaviorDescription ) )
                    // InternalMyDsl.g:1482:5: (lv_behaviourDescription_28_0= ruleBehaviorDescription )
                    {
                    // InternalMyDsl.g:1482:5: (lv_behaviourDescription_28_0= ruleBehaviorDescription )
                    // InternalMyDsl.g:1483:6: lv_behaviourDescription_28_0= ruleBehaviorDescription
                    {

                    						newCompositeNode(grammarAccess.getComponent_ImplAccess().getBehaviourDescriptionBehaviorDescriptionParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_behaviourDescription_28_0=ruleBehaviorDescription();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponent_ImplRule());
                    						}
                    						set(
                    							current,
                    							"behaviourDescription",
                    							lv_behaviourDescription_28_0,
                    							"org.xtext.example.mydsl.MyDsl.BehaviorDescription");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_29=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_29, grammarAccess.getComponent_ImplAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleComponent_Impl"


    // $ANTLR start "entryRuleBehaviorDescription"
    // InternalMyDsl.g:1509:1: entryRuleBehaviorDescription returns [EObject current=null] : iv_ruleBehaviorDescription= ruleBehaviorDescription EOF ;
    public final EObject entryRuleBehaviorDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviorDescription = null;


        try {
            // InternalMyDsl.g:1509:60: (iv_ruleBehaviorDescription= ruleBehaviorDescription EOF )
            // InternalMyDsl.g:1510:2: iv_ruleBehaviorDescription= ruleBehaviorDescription EOF
            {
             newCompositeNode(grammarAccess.getBehaviorDescriptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBehaviorDescription=ruleBehaviorDescription();

            state._fsp--;

             current =iv_ruleBehaviorDescription; 
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
    // $ANTLR end "entryRuleBehaviorDescription"


    // $ANTLR start "ruleBehaviorDescription"
    // InternalMyDsl.g:1516:1: ruleBehaviorDescription returns [EObject current=null] : ( () otherlv_1= 'BehaviorDescription' otherlv_2= '{' (otherlv_3= 'calledServices' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'internalActions' ( (lv_internalActions_10_0= ruleInternalAction ) ) )? (otherlv_11= 'loops' ( (lv_loops_12_0= ruleLoop ) ) )? (otherlv_13= 'branches' ( (lv_branches_14_0= ruleBranch ) ) )? otherlv_15= '}' ) ;
    public final EObject ruleBehaviorDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject lv_internalActions_10_0 = null;

        EObject lv_loops_12_0 = null;

        EObject lv_branches_14_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1522:2: ( ( () otherlv_1= 'BehaviorDescription' otherlv_2= '{' (otherlv_3= 'calledServices' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'internalActions' ( (lv_internalActions_10_0= ruleInternalAction ) ) )? (otherlv_11= 'loops' ( (lv_loops_12_0= ruleLoop ) ) )? (otherlv_13= 'branches' ( (lv_branches_14_0= ruleBranch ) ) )? otherlv_15= '}' ) )
            // InternalMyDsl.g:1523:2: ( () otherlv_1= 'BehaviorDescription' otherlv_2= '{' (otherlv_3= 'calledServices' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'internalActions' ( (lv_internalActions_10_0= ruleInternalAction ) ) )? (otherlv_11= 'loops' ( (lv_loops_12_0= ruleLoop ) ) )? (otherlv_13= 'branches' ( (lv_branches_14_0= ruleBranch ) ) )? otherlv_15= '}' )
            {
            // InternalMyDsl.g:1523:2: ( () otherlv_1= 'BehaviorDescription' otherlv_2= '{' (otherlv_3= 'calledServices' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'internalActions' ( (lv_internalActions_10_0= ruleInternalAction ) ) )? (otherlv_11= 'loops' ( (lv_loops_12_0= ruleLoop ) ) )? (otherlv_13= 'branches' ( (lv_branches_14_0= ruleBranch ) ) )? otherlv_15= '}' )
            // InternalMyDsl.g:1524:3: () otherlv_1= 'BehaviorDescription' otherlv_2= '{' (otherlv_3= 'calledServices' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'internalActions' ( (lv_internalActions_10_0= ruleInternalAction ) ) )? (otherlv_11= 'loops' ( (lv_loops_12_0= ruleLoop ) ) )? (otherlv_13= 'branches' ( (lv_branches_14_0= ruleBranch ) ) )? otherlv_15= '}'
            {
            // InternalMyDsl.g:1524:3: ()
            // InternalMyDsl.g:1525:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBehaviorDescriptionAccess().getBehaviorDescriptionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,43,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getBehaviorDescriptionAccess().getBehaviorDescriptionKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_31); 

            			newLeafNode(otherlv_2, grammarAccess.getBehaviorDescriptionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:1539:3: (otherlv_3= 'calledServices' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==44) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalMyDsl.g:1540:4: otherlv_3= 'calledServices' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')'
                    {
                    otherlv_3=(Token)match(input,44,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getBehaviorDescriptionAccess().getCalledServicesKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getBehaviorDescriptionAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalMyDsl.g:1548:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:1549:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:1549:5: ( ruleEString )
                    // InternalMyDsl.g:1550:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBehaviorDescriptionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getBehaviorDescriptionAccess().getCalledServicesServiceCrossReference_3_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1564:4: (otherlv_6= ',' ( ( ruleEString ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==17) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalMyDsl.g:1565:5: otherlv_6= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,17,FOLLOW_9); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getBehaviorDescriptionAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalMyDsl.g:1569:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:1570:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:1570:6: ( ruleEString )
                    	    // InternalMyDsl.g:1571:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getBehaviorDescriptionRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getBehaviorDescriptionAccess().getCalledServicesServiceCrossReference_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,18,FOLLOW_32); 

                    				newLeafNode(otherlv_8, grammarAccess.getBehaviorDescriptionAccess().getRightParenthesisKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1591:3: (otherlv_9= 'internalActions' ( (lv_internalActions_10_0= ruleInternalAction ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==45) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMyDsl.g:1592:4: otherlv_9= 'internalActions' ( (lv_internalActions_10_0= ruleInternalAction ) )
                    {
                    otherlv_9=(Token)match(input,45,FOLLOW_33); 

                    				newLeafNode(otherlv_9, grammarAccess.getBehaviorDescriptionAccess().getInternalActionsKeyword_4_0());
                    			
                    // InternalMyDsl.g:1596:4: ( (lv_internalActions_10_0= ruleInternalAction ) )
                    // InternalMyDsl.g:1597:5: (lv_internalActions_10_0= ruleInternalAction )
                    {
                    // InternalMyDsl.g:1597:5: (lv_internalActions_10_0= ruleInternalAction )
                    // InternalMyDsl.g:1598:6: lv_internalActions_10_0= ruleInternalAction
                    {

                    						newCompositeNode(grammarAccess.getBehaviorDescriptionAccess().getInternalActionsInternalActionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_internalActions_10_0=ruleInternalAction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBehaviorDescriptionRule());
                    						}
                    						set(
                    							current,
                    							"internalActions",
                    							lv_internalActions_10_0,
                    							"org.xtext.example.mydsl.MyDsl.InternalAction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1616:3: (otherlv_11= 'loops' ( (lv_loops_12_0= ruleLoop ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==46) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalMyDsl.g:1617:4: otherlv_11= 'loops' ( (lv_loops_12_0= ruleLoop ) )
                    {
                    otherlv_11=(Token)match(input,46,FOLLOW_35); 

                    				newLeafNode(otherlv_11, grammarAccess.getBehaviorDescriptionAccess().getLoopsKeyword_5_0());
                    			
                    // InternalMyDsl.g:1621:4: ( (lv_loops_12_0= ruleLoop ) )
                    // InternalMyDsl.g:1622:5: (lv_loops_12_0= ruleLoop )
                    {
                    // InternalMyDsl.g:1622:5: (lv_loops_12_0= ruleLoop )
                    // InternalMyDsl.g:1623:6: lv_loops_12_0= ruleLoop
                    {

                    						newCompositeNode(grammarAccess.getBehaviorDescriptionAccess().getLoopsLoopParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_loops_12_0=ruleLoop();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBehaviorDescriptionRule());
                    						}
                    						set(
                    							current,
                    							"loops",
                    							lv_loops_12_0,
                    							"org.xtext.example.mydsl.MyDsl.Loop");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1641:3: (otherlv_13= 'branches' ( (lv_branches_14_0= ruleBranch ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==47) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalMyDsl.g:1642:4: otherlv_13= 'branches' ( (lv_branches_14_0= ruleBranch ) )
                    {
                    otherlv_13=(Token)match(input,47,FOLLOW_37); 

                    				newLeafNode(otherlv_13, grammarAccess.getBehaviorDescriptionAccess().getBranchesKeyword_6_0());
                    			
                    // InternalMyDsl.g:1646:4: ( (lv_branches_14_0= ruleBranch ) )
                    // InternalMyDsl.g:1647:5: (lv_branches_14_0= ruleBranch )
                    {
                    // InternalMyDsl.g:1647:5: (lv_branches_14_0= ruleBranch )
                    // InternalMyDsl.g:1648:6: lv_branches_14_0= ruleBranch
                    {

                    						newCompositeNode(grammarAccess.getBehaviorDescriptionAccess().getBranchesBranchParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_branches_14_0=ruleBranch();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBehaviorDescriptionRule());
                    						}
                    						set(
                    							current,
                    							"branches",
                    							lv_branches_14_0,
                    							"org.xtext.example.mydsl.MyDsl.Branch");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getBehaviorDescriptionAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleBehaviorDescription"


    // $ANTLR start "entryRuleCompositeComponent"
    // InternalMyDsl.g:1674:1: entryRuleCompositeComponent returns [EObject current=null] : iv_ruleCompositeComponent= ruleCompositeComponent EOF ;
    public final EObject entryRuleCompositeComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeComponent = null;


        try {
            // InternalMyDsl.g:1674:59: (iv_ruleCompositeComponent= ruleCompositeComponent EOF )
            // InternalMyDsl.g:1675:2: iv_ruleCompositeComponent= ruleCompositeComponent EOF
            {
             newCompositeNode(grammarAccess.getCompositeComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompositeComponent=ruleCompositeComponent();

            state._fsp--;

             current =iv_ruleCompositeComponent; 
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
    // $ANTLR end "entryRuleCompositeComponent"


    // $ANTLR start "ruleCompositeComponent"
    // InternalMyDsl.g:1681:1: ruleCompositeComponent returns [EObject current=null] : (otherlv_0= 'CompositeComponent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'requiredInterface' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'requiredService' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'providedInterface' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'providedService' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')' )? (otherlv_27= 'behaviourDescription' ( (lv_behaviourDescription_28_0= ruleBehaviorDescription ) ) )? (otherlv_29= 'encapsulatedAssemblyContext' ( (lv_encapsulatedAssemblyContext_30_0= ruleAssemblyContext ) ) )? otherlv_31= '}' ) ;
    public final EObject ruleCompositeComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        EObject lv_behaviourDescription_28_0 = null;

        EObject lv_encapsulatedAssemblyContext_30_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1687:2: ( (otherlv_0= 'CompositeComponent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'requiredInterface' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'requiredService' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'providedInterface' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'providedService' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')' )? (otherlv_27= 'behaviourDescription' ( (lv_behaviourDescription_28_0= ruleBehaviorDescription ) ) )? (otherlv_29= 'encapsulatedAssemblyContext' ( (lv_encapsulatedAssemblyContext_30_0= ruleAssemblyContext ) ) )? otherlv_31= '}' ) )
            // InternalMyDsl.g:1688:2: (otherlv_0= 'CompositeComponent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'requiredInterface' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'requiredService' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'providedInterface' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'providedService' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')' )? (otherlv_27= 'behaviourDescription' ( (lv_behaviourDescription_28_0= ruleBehaviorDescription ) ) )? (otherlv_29= 'encapsulatedAssemblyContext' ( (lv_encapsulatedAssemblyContext_30_0= ruleAssemblyContext ) ) )? otherlv_31= '}' )
            {
            // InternalMyDsl.g:1688:2: (otherlv_0= 'CompositeComponent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'requiredInterface' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'requiredService' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'providedInterface' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'providedService' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')' )? (otherlv_27= 'behaviourDescription' ( (lv_behaviourDescription_28_0= ruleBehaviorDescription ) ) )? (otherlv_29= 'encapsulatedAssemblyContext' ( (lv_encapsulatedAssemblyContext_30_0= ruleAssemblyContext ) ) )? otherlv_31= '}' )
            // InternalMyDsl.g:1689:3: otherlv_0= 'CompositeComponent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'requiredInterface' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'requiredService' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )? (otherlv_15= 'providedInterface' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'providedService' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')' )? (otherlv_27= 'behaviourDescription' ( (lv_behaviourDescription_28_0= ruleBehaviorDescription ) ) )? (otherlv_29= 'encapsulatedAssemblyContext' ( (lv_encapsulatedAssemblyContext_30_0= ruleAssemblyContext ) ) )? otherlv_31= '}'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCompositeComponentAccess().getCompositeComponentKeyword_0());
            		
            // InternalMyDsl.g:1693:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1694:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1694:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1695:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCompositeComponentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompositeComponentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_38); 

            			newLeafNode(otherlv_2, grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:1715:3: (otherlv_3= 'requiredInterface' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==38) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMyDsl.g:1716:4: otherlv_3= 'requiredInterface' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')'
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getCompositeComponentAccess().getRequiredInterfaceKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getCompositeComponentAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalMyDsl.g:1724:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:1725:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:1725:5: ( ruleEString )
                    // InternalMyDsl.g:1726:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCompositeComponentRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getCompositeComponentAccess().getRequiredInterfaceInterfaceCrossReference_3_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1740:4: (otherlv_6= ',' ( ( ruleEString ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==17) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalMyDsl.g:1741:5: otherlv_6= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,17,FOLLOW_9); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getCompositeComponentAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalMyDsl.g:1745:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:1746:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:1746:6: ( ruleEString )
                    	    // InternalMyDsl.g:1747:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getCompositeComponentRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getCompositeComponentAccess().getRequiredInterfaceInterfaceCrossReference_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,18,FOLLOW_39); 

                    				newLeafNode(otherlv_8, grammarAccess.getCompositeComponentAccess().getRightParenthesisKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1767:3: (otherlv_9= 'requiredService' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==39) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalMyDsl.g:1768:4: otherlv_9= 'requiredService' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')'
                    {
                    otherlv_9=(Token)match(input,39,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getCompositeComponentAccess().getRequiredServiceKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getCompositeComponentAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalMyDsl.g:1776:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:1777:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:1777:5: ( ruleEString )
                    // InternalMyDsl.g:1778:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCompositeComponentRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getCompositeComponentAccess().getRequiredServiceServiceCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1792:4: (otherlv_12= ',' ( ( ruleEString ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==17) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // InternalMyDsl.g:1793:5: otherlv_12= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,17,FOLLOW_9); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getCompositeComponentAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalMyDsl.g:1797:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:1798:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:1798:6: ( ruleEString )
                    	    // InternalMyDsl.g:1799:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getCompositeComponentRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getCompositeComponentAccess().getRequiredServiceServiceCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,18,FOLLOW_40); 

                    				newLeafNode(otherlv_14, grammarAccess.getCompositeComponentAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1819:3: (otherlv_15= 'providedInterface' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==40) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalMyDsl.g:1820:4: otherlv_15= 'providedInterface' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')'
                    {
                    otherlv_15=(Token)match(input,40,FOLLOW_8); 

                    				newLeafNode(otherlv_15, grammarAccess.getCompositeComponentAccess().getProvidedInterfaceKeyword_5_0());
                    			
                    otherlv_16=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_16, grammarAccess.getCompositeComponentAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalMyDsl.g:1828:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:1829:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:1829:5: ( ruleEString )
                    // InternalMyDsl.g:1830:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCompositeComponentRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getCompositeComponentAccess().getProvidedInterfaceInterfaceCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1844:4: (otherlv_18= ',' ( ( ruleEString ) ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==17) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // InternalMyDsl.g:1845:5: otherlv_18= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_18=(Token)match(input,17,FOLLOW_9); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getCompositeComponentAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalMyDsl.g:1849:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:1850:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:1850:6: ( ruleEString )
                    	    // InternalMyDsl.g:1851:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getCompositeComponentRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getCompositeComponentAccess().getProvidedInterfaceInterfaceCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,18,FOLLOW_41); 

                    				newLeafNode(otherlv_20, grammarAccess.getCompositeComponentAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1871:3: (otherlv_21= 'providedService' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==41) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalMyDsl.g:1872:4: otherlv_21= 'providedService' otherlv_22= '(' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ')'
                    {
                    otherlv_21=(Token)match(input,41,FOLLOW_8); 

                    				newLeafNode(otherlv_21, grammarAccess.getCompositeComponentAccess().getProvidedServiceKeyword_6_0());
                    			
                    otherlv_22=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_22, grammarAccess.getCompositeComponentAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalMyDsl.g:1880:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:1881:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:1881:5: ( ruleEString )
                    // InternalMyDsl.g:1882:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCompositeComponentRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getCompositeComponentAccess().getProvidedServiceServiceCrossReference_6_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1896:4: (otherlv_24= ',' ( ( ruleEString ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==17) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // InternalMyDsl.g:1897:5: otherlv_24= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_24=(Token)match(input,17,FOLLOW_9); 

                    	    					newLeafNode(otherlv_24, grammarAccess.getCompositeComponentAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalMyDsl.g:1901:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:1902:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:1902:6: ( ruleEString )
                    	    // InternalMyDsl.g:1903:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getCompositeComponentRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getCompositeComponentAccess().getProvidedServiceServiceCrossReference_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,18,FOLLOW_42); 

                    				newLeafNode(otherlv_26, grammarAccess.getCompositeComponentAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1923:3: (otherlv_27= 'behaviourDescription' ( (lv_behaviourDescription_28_0= ruleBehaviorDescription ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==42) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalMyDsl.g:1924:4: otherlv_27= 'behaviourDescription' ( (lv_behaviourDescription_28_0= ruleBehaviorDescription ) )
                    {
                    otherlv_27=(Token)match(input,42,FOLLOW_30); 

                    				newLeafNode(otherlv_27, grammarAccess.getCompositeComponentAccess().getBehaviourDescriptionKeyword_7_0());
                    			
                    // InternalMyDsl.g:1928:4: ( (lv_behaviourDescription_28_0= ruleBehaviorDescription ) )
                    // InternalMyDsl.g:1929:5: (lv_behaviourDescription_28_0= ruleBehaviorDescription )
                    {
                    // InternalMyDsl.g:1929:5: (lv_behaviourDescription_28_0= ruleBehaviorDescription )
                    // InternalMyDsl.g:1930:6: lv_behaviourDescription_28_0= ruleBehaviorDescription
                    {

                    						newCompositeNode(grammarAccess.getCompositeComponentAccess().getBehaviourDescriptionBehaviorDescriptionParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_43);
                    lv_behaviourDescription_28_0=ruleBehaviorDescription();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
                    						}
                    						set(
                    							current,
                    							"behaviourDescription",
                    							lv_behaviourDescription_28_0,
                    							"org.xtext.example.mydsl.MyDsl.BehaviorDescription");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1948:3: (otherlv_29= 'encapsulatedAssemblyContext' ( (lv_encapsulatedAssemblyContext_30_0= ruleAssemblyContext ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==27) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalMyDsl.g:1949:4: otherlv_29= 'encapsulatedAssemblyContext' ( (lv_encapsulatedAssemblyContext_30_0= ruleAssemblyContext ) )
                    {
                    otherlv_29=(Token)match(input,27,FOLLOW_44); 

                    				newLeafNode(otherlv_29, grammarAccess.getCompositeComponentAccess().getEncapsulatedAssemblyContextKeyword_8_0());
                    			
                    // InternalMyDsl.g:1953:4: ( (lv_encapsulatedAssemblyContext_30_0= ruleAssemblyContext ) )
                    // InternalMyDsl.g:1954:5: (lv_encapsulatedAssemblyContext_30_0= ruleAssemblyContext )
                    {
                    // InternalMyDsl.g:1954:5: (lv_encapsulatedAssemblyContext_30_0= ruleAssemblyContext )
                    // InternalMyDsl.g:1955:6: lv_encapsulatedAssemblyContext_30_0= ruleAssemblyContext
                    {

                    						newCompositeNode(grammarAccess.getCompositeComponentAccess().getEncapsulatedAssemblyContextAssemblyContextParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_encapsulatedAssemblyContext_30_0=ruleAssemblyContext();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
                    						}
                    						set(
                    							current,
                    							"encapsulatedAssemblyContext",
                    							lv_encapsulatedAssemblyContext_30_0,
                    							"org.xtext.example.mydsl.MyDsl.AssemblyContext");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_31=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_31, grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleCompositeComponent"


    // $ANTLR start "entryRuleService"
    // InternalMyDsl.g:1981:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // InternalMyDsl.g:1981:48: (iv_ruleService= ruleService EOF )
            // InternalMyDsl.g:1982:2: iv_ruleService= ruleService EOF
            {
             newCompositeNode(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleService=ruleService();

            state._fsp--;

             current =iv_ruleService; 
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
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // InternalMyDsl.g:1988:1: ruleService returns [EObject current=null] : (otherlv_0= 'Service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'correspondingSignature' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1994:2: ( (otherlv_0= 'Service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'correspondingSignature' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' ) )
            // InternalMyDsl.g:1995:2: (otherlv_0= 'Service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'correspondingSignature' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' )
            {
            // InternalMyDsl.g:1995:2: (otherlv_0= 'Service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'correspondingSignature' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' )
            // InternalMyDsl.g:1996:3: otherlv_0= 'Service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'correspondingSignature' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceAccess().getServiceKeyword_0());
            		
            // InternalMyDsl.g:2000:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:2001:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:2001:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:2002:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_45); 

            			newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,50,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getServiceAccess().getCorrespondingSignatureKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getServiceAccess().getLeftParenthesisKeyword_4());
            		
            // InternalMyDsl.g:2030:3: ( ( ruleEString ) )
            // InternalMyDsl.g:2031:4: ( ruleEString )
            {
            // InternalMyDsl.g:2031:4: ( ruleEString )
            // InternalMyDsl.g:2032:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getServiceAccess().getCorrespondingSignatureSignatureCrossReference_5_0());
            				
            pushFollow(FOLLOW_10);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:2046:3: (otherlv_6= ',' ( ( ruleEString ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==17) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalMyDsl.g:2047:4: otherlv_6= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,17,FOLLOW_9); 

            	    				newLeafNode(otherlv_6, grammarAccess.getServiceAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalMyDsl.g:2051:4: ( ( ruleEString ) )
            	    // InternalMyDsl.g:2052:5: ( ruleEString )
            	    {
            	    // InternalMyDsl.g:2052:5: ( ruleEString )
            	    // InternalMyDsl.g:2053:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getServiceRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getServiceAccess().getCorrespondingSignatureSignatureCrossReference_6_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            otherlv_8=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_8, grammarAccess.getServiceAccess().getRightParenthesisKeyword_7());
            		
            otherlv_9=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleInterface"
    // InternalMyDsl.g:2080:1: entryRuleInterface returns [EObject current=null] : iv_ruleInterface= ruleInterface EOF ;
    public final EObject entryRuleInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface = null;


        try {
            // InternalMyDsl.g:2080:50: (iv_ruleInterface= ruleInterface EOF )
            // InternalMyDsl.g:2081:2: iv_ruleInterface= ruleInterface EOF
            {
             newCompositeNode(grammarAccess.getInterfaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInterface=ruleInterface();

            state._fsp--;

             current =iv_ruleInterface; 
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
    // $ANTLR end "entryRuleInterface"


    // $ANTLR start "ruleInterface"
    // InternalMyDsl.g:2087:1: ruleInterface returns [EObject current=null] : (otherlv_0= 'Interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'signature' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' ) ;
    public final EObject ruleInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2093:2: ( (otherlv_0= 'Interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'signature' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' ) )
            // InternalMyDsl.g:2094:2: (otherlv_0= 'Interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'signature' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' )
            {
            // InternalMyDsl.g:2094:2: (otherlv_0= 'Interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'signature' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' )
            // InternalMyDsl.g:2095:3: otherlv_0= 'Interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'signature' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getInterfaceAccess().getInterfaceKeyword_0());
            		
            // InternalMyDsl.g:2099:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:2100:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:2100:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:2101:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInterfaceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_46); 

            			newLeafNode(otherlv_2, grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,52,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getInterfaceAccess().getSignatureKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getInterfaceAccess().getLeftParenthesisKeyword_4());
            		
            // InternalMyDsl.g:2129:3: ( ( ruleEString ) )
            // InternalMyDsl.g:2130:4: ( ruleEString )
            {
            // InternalMyDsl.g:2130:4: ( ruleEString )
            // InternalMyDsl.g:2131:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInterfaceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getInterfaceAccess().getSignatureSignatureCrossReference_5_0());
            				
            pushFollow(FOLLOW_10);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:2145:3: (otherlv_6= ',' ( ( ruleEString ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==17) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalMyDsl.g:2146:4: otherlv_6= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,17,FOLLOW_9); 

            	    				newLeafNode(otherlv_6, grammarAccess.getInterfaceAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalMyDsl.g:2150:4: ( ( ruleEString ) )
            	    // InternalMyDsl.g:2151:5: ( ruleEString )
            	    {
            	    // InternalMyDsl.g:2151:5: ( ruleEString )
            	    // InternalMyDsl.g:2152:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getInterfaceRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getInterfaceAccess().getSignatureSignatureCrossReference_6_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            otherlv_8=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_8, grammarAccess.getInterfaceAccess().getRightParenthesisKeyword_7());
            		
            otherlv_9=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleInterface"


    // $ANTLR start "entryRuleSignature"
    // InternalMyDsl.g:2179:1: entryRuleSignature returns [EObject current=null] : iv_ruleSignature= ruleSignature EOF ;
    public final EObject entryRuleSignature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignature = null;


        try {
            // InternalMyDsl.g:2179:50: (iv_ruleSignature= ruleSignature EOF )
            // InternalMyDsl.g:2180:2: iv_ruleSignature= ruleSignature EOF
            {
             newCompositeNode(grammarAccess.getSignatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSignature=ruleSignature();

            state._fsp--;

             current =iv_ruleSignature; 
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
    // $ANTLR end "entryRuleSignature"


    // $ANTLR start "ruleSignature"
    // InternalMyDsl.g:2186:1: ruleSignature returns [EObject current=null] : (otherlv_0= 'Signature' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'returnType' ( (lv_returnType_4_0= ruleType ) ) )? (otherlv_5= 'parameterType' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= '}' ) ;
    public final EObject ruleSignature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_returnType_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2192:2: ( (otherlv_0= 'Signature' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'returnType' ( (lv_returnType_4_0= ruleType ) ) )? (otherlv_5= 'parameterType' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= '}' ) )
            // InternalMyDsl.g:2193:2: (otherlv_0= 'Signature' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'returnType' ( (lv_returnType_4_0= ruleType ) ) )? (otherlv_5= 'parameterType' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= '}' )
            {
            // InternalMyDsl.g:2193:2: (otherlv_0= 'Signature' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'returnType' ( (lv_returnType_4_0= ruleType ) ) )? (otherlv_5= 'parameterType' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= '}' )
            // InternalMyDsl.g:2194:3: otherlv_0= 'Signature' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'returnType' ( (lv_returnType_4_0= ruleType ) ) )? (otherlv_5= 'parameterType' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSignatureAccess().getSignatureKeyword_0());
            		
            // InternalMyDsl.g:2198:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:2199:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:2199:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:2200:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSignatureAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSignatureRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_47); 

            			newLeafNode(otherlv_2, grammarAccess.getSignatureAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:2220:3: (otherlv_3= 'returnType' ( (lv_returnType_4_0= ruleType ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==54) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalMyDsl.g:2221:4: otherlv_3= 'returnType' ( (lv_returnType_4_0= ruleType ) )
                    {
                    otherlv_3=(Token)match(input,54,FOLLOW_48); 

                    				newLeafNode(otherlv_3, grammarAccess.getSignatureAccess().getReturnTypeKeyword_3_0());
                    			
                    // InternalMyDsl.g:2225:4: ( (lv_returnType_4_0= ruleType ) )
                    // InternalMyDsl.g:2226:5: (lv_returnType_4_0= ruleType )
                    {
                    // InternalMyDsl.g:2226:5: (lv_returnType_4_0= ruleType )
                    // InternalMyDsl.g:2227:6: lv_returnType_4_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getSignatureAccess().getReturnTypeTypeParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_49);
                    lv_returnType_4_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSignatureRule());
                    						}
                    						set(
                    							current,
                    							"returnType",
                    							lv_returnType_4_0,
                    							"org.xtext.example.mydsl.MyDsl.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:2245:3: (otherlv_5= 'parameterType' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==55) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalMyDsl.g:2246:4: otherlv_5= 'parameterType' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,55,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getSignatureAccess().getParameterTypeKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getSignatureAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalMyDsl.g:2254:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:2255:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:2255:5: ( ruleEString )
                    // InternalMyDsl.g:2256:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSignatureRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSignatureAccess().getParameterTypeTypeCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:2270:4: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==17) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // InternalMyDsl.g:2271:5: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,17,FOLLOW_9); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getSignatureAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalMyDsl.g:2275:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:2276:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:2276:6: ( ruleEString )
                    	    // InternalMyDsl.g:2277:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getSignatureRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getSignatureAccess().getParameterTypeTypeCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,18,FOLLOW_12); 

                    				newLeafNode(otherlv_10, grammarAccess.getSignatureAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getSignatureAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleSignature"


    // $ANTLR start "entryRuleInternalAction"
    // InternalMyDsl.g:2305:1: entryRuleInternalAction returns [EObject current=null] : iv_ruleInternalAction= ruleInternalAction EOF ;
    public final EObject entryRuleInternalAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalAction = null;


        try {
            // InternalMyDsl.g:2305:55: (iv_ruleInternalAction= ruleInternalAction EOF )
            // InternalMyDsl.g:2306:2: iv_ruleInternalAction= ruleInternalAction EOF
            {
             newCompositeNode(grammarAccess.getInternalActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInternalAction=ruleInternalAction();

            state._fsp--;

             current =iv_ruleInternalAction; 
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
    // $ANTLR end "entryRuleInternalAction"


    // $ANTLR start "ruleInternalAction"
    // InternalMyDsl.g:2312:1: ruleInternalAction returns [EObject current=null] : ( () otherlv_1= 'InternalAction' ) ;
    public final EObject ruleInternalAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2318:2: ( ( () otherlv_1= 'InternalAction' ) )
            // InternalMyDsl.g:2319:2: ( () otherlv_1= 'InternalAction' )
            {
            // InternalMyDsl.g:2319:2: ( () otherlv_1= 'InternalAction' )
            // InternalMyDsl.g:2320:3: () otherlv_1= 'InternalAction'
            {
            // InternalMyDsl.g:2320:3: ()
            // InternalMyDsl.g:2321:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInternalActionAccess().getInternalActionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,56,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getInternalActionAccess().getInternalActionKeyword_1());
            		

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
    // $ANTLR end "ruleInternalAction"


    // $ANTLR start "entryRuleLoop"
    // InternalMyDsl.g:2335:1: entryRuleLoop returns [EObject current=null] : iv_ruleLoop= ruleLoop EOF ;
    public final EObject entryRuleLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoop = null;


        try {
            // InternalMyDsl.g:2335:45: (iv_ruleLoop= ruleLoop EOF )
            // InternalMyDsl.g:2336:2: iv_ruleLoop= ruleLoop EOF
            {
             newCompositeNode(grammarAccess.getLoopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoop=ruleLoop();

            state._fsp--;

             current =iv_ruleLoop; 
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
    // $ANTLR end "entryRuleLoop"


    // $ANTLR start "ruleLoop"
    // InternalMyDsl.g:2342:1: ruleLoop returns [EObject current=null] : ( () otherlv_1= 'Loop' ) ;
    public final EObject ruleLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2348:2: ( ( () otherlv_1= 'Loop' ) )
            // InternalMyDsl.g:2349:2: ( () otherlv_1= 'Loop' )
            {
            // InternalMyDsl.g:2349:2: ( () otherlv_1= 'Loop' )
            // InternalMyDsl.g:2350:3: () otherlv_1= 'Loop'
            {
            // InternalMyDsl.g:2350:3: ()
            // InternalMyDsl.g:2351:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLoopAccess().getLoopAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,57,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getLoopAccess().getLoopKeyword_1());
            		

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
    // $ANTLR end "ruleLoop"


    // $ANTLR start "entryRuleBranch"
    // InternalMyDsl.g:2365:1: entryRuleBranch returns [EObject current=null] : iv_ruleBranch= ruleBranch EOF ;
    public final EObject entryRuleBranch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBranch = null;


        try {
            // InternalMyDsl.g:2365:47: (iv_ruleBranch= ruleBranch EOF )
            // InternalMyDsl.g:2366:2: iv_ruleBranch= ruleBranch EOF
            {
             newCompositeNode(grammarAccess.getBranchRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBranch=ruleBranch();

            state._fsp--;

             current =iv_ruleBranch; 
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
    // $ANTLR end "entryRuleBranch"


    // $ANTLR start "ruleBranch"
    // InternalMyDsl.g:2372:1: ruleBranch returns [EObject current=null] : ( () otherlv_1= 'Branch' ) ;
    public final EObject ruleBranch() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2378:2: ( ( () otherlv_1= 'Branch' ) )
            // InternalMyDsl.g:2379:2: ( () otherlv_1= 'Branch' )
            {
            // InternalMyDsl.g:2379:2: ( () otherlv_1= 'Branch' )
            // InternalMyDsl.g:2380:3: () otherlv_1= 'Branch'
            {
            // InternalMyDsl.g:2380:3: ()
            // InternalMyDsl.g:2381:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBranchAccess().getBranchAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,58,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getBranchAccess().getBranchKeyword_1());
            		

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
    // $ANTLR end "ruleBranch"


    // $ANTLR start "entryRuleType"
    // InternalMyDsl.g:2395:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalMyDsl.g:2395:45: (iv_ruleType= ruleType EOF )
            // InternalMyDsl.g:2396:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalMyDsl.g:2402:1: ruleType returns [EObject current=null] : (this_Type_Impl_0= ruleType_Impl | this_List_1= ruleList | this_Map_2= ruleMap | this_ComplexType_3= ruleComplexType | this_Date_4= ruleDate | this_Double_5= ruleDouble | this_String0_6= ruleString0 | this_Int0_7= ruleInt0 | this_Char_8= ruleChar | this_Long_9= ruleLong | this_Float_10= ruleFloat | this_Boolean_11= ruleBoolean | this_Void_12= ruleVoid ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_Type_Impl_0 = null;

        EObject this_List_1 = null;

        EObject this_Map_2 = null;

        EObject this_ComplexType_3 = null;

        EObject this_Date_4 = null;

        EObject this_Double_5 = null;

        EObject this_String0_6 = null;

        EObject this_Int0_7 = null;

        EObject this_Char_8 = null;

        EObject this_Long_9 = null;

        EObject this_Float_10 = null;

        EObject this_Boolean_11 = null;

        EObject this_Void_12 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2408:2: ( (this_Type_Impl_0= ruleType_Impl | this_List_1= ruleList | this_Map_2= ruleMap | this_ComplexType_3= ruleComplexType | this_Date_4= ruleDate | this_Double_5= ruleDouble | this_String0_6= ruleString0 | this_Int0_7= ruleInt0 | this_Char_8= ruleChar | this_Long_9= ruleLong | this_Float_10= ruleFloat | this_Boolean_11= ruleBoolean | this_Void_12= ruleVoid ) )
            // InternalMyDsl.g:2409:2: (this_Type_Impl_0= ruleType_Impl | this_List_1= ruleList | this_Map_2= ruleMap | this_ComplexType_3= ruleComplexType | this_Date_4= ruleDate | this_Double_5= ruleDouble | this_String0_6= ruleString0 | this_Int0_7= ruleInt0 | this_Char_8= ruleChar | this_Long_9= ruleLong | this_Float_10= ruleFloat | this_Boolean_11= ruleBoolean | this_Void_12= ruleVoid )
            {
            // InternalMyDsl.g:2409:2: (this_Type_Impl_0= ruleType_Impl | this_List_1= ruleList | this_Map_2= ruleMap | this_ComplexType_3= ruleComplexType | this_Date_4= ruleDate | this_Double_5= ruleDouble | this_String0_6= ruleString0 | this_Int0_7= ruleInt0 | this_Char_8= ruleChar | this_Long_9= ruleLong | this_Float_10= ruleFloat | this_Boolean_11= ruleBoolean | this_Void_12= ruleVoid )
            int alt53=13;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt53=1;
                }
                break;
            case 60:
                {
                alt53=2;
                }
                break;
            case 61:
                {
                alt53=3;
                }
                break;
            case 62:
                {
                alt53=4;
                }
                break;
            case 63:
                {
                alt53=5;
                }
                break;
            case 64:
                {
                alt53=6;
                }
                break;
            case 65:
                {
                alt53=7;
                }
                break;
            case 66:
                {
                alt53=8;
                }
                break;
            case 67:
                {
                alt53=9;
                }
                break;
            case 68:
                {
                alt53=10;
                }
                break;
            case 69:
                {
                alt53=11;
                }
                break;
            case 70:
                {
                alt53=12;
                }
                break;
            case 71:
                {
                alt53=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // InternalMyDsl.g:2410:3: this_Type_Impl_0= ruleType_Impl
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getType_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Type_Impl_0=ruleType_Impl();

                    state._fsp--;


                    			current = this_Type_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2419:3: this_List_1= ruleList
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getListParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_List_1=ruleList();

                    state._fsp--;


                    			current = this_List_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:2428:3: this_Map_2= ruleMap
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getMapParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Map_2=ruleMap();

                    state._fsp--;


                    			current = this_Map_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:2437:3: this_ComplexType_3= ruleComplexType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getComplexTypeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComplexType_3=ruleComplexType();

                    state._fsp--;


                    			current = this_ComplexType_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:2446:3: this_Date_4= ruleDate
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getDateParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Date_4=ruleDate();

                    state._fsp--;


                    			current = this_Date_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:2455:3: this_Double_5= ruleDouble
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getDoubleParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Double_5=ruleDouble();

                    state._fsp--;


                    			current = this_Double_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:2464:3: this_String0_6= ruleString0
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getString0ParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_String0_6=ruleString0();

                    state._fsp--;


                    			current = this_String0_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:2473:3: this_Int0_7= ruleInt0
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getInt0ParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Int0_7=ruleInt0();

                    state._fsp--;


                    			current = this_Int0_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:2482:3: this_Char_8= ruleChar
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getCharParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_Char_8=ruleChar();

                    state._fsp--;


                    			current = this_Char_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:2491:3: this_Long_9= ruleLong
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getLongParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_Long_9=ruleLong();

                    state._fsp--;


                    			current = this_Long_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalMyDsl.g:2500:3: this_Float_10= ruleFloat
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getFloatParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_Float_10=ruleFloat();

                    state._fsp--;


                    			current = this_Float_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalMyDsl.g:2509:3: this_Boolean_11= ruleBoolean
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getBooleanParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_Boolean_11=ruleBoolean();

                    state._fsp--;


                    			current = this_Boolean_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalMyDsl.g:2518:3: this_Void_12= ruleVoid
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getVoidParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_Void_12=ruleVoid();

                    state._fsp--;


                    			current = this_Void_12;
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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleType_Impl"
    // InternalMyDsl.g:2530:1: entryRuleType_Impl returns [EObject current=null] : iv_ruleType_Impl= ruleType_Impl EOF ;
    public final EObject entryRuleType_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType_Impl = null;


        try {
            // InternalMyDsl.g:2530:50: (iv_ruleType_Impl= ruleType_Impl EOF )
            // InternalMyDsl.g:2531:2: iv_ruleType_Impl= ruleType_Impl EOF
            {
             newCompositeNode(grammarAccess.getType_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType_Impl=ruleType_Impl();

            state._fsp--;

             current =iv_ruleType_Impl; 
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
    // $ANTLR end "entryRuleType_Impl"


    // $ANTLR start "ruleType_Impl"
    // InternalMyDsl.g:2537:1: ruleType_Impl returns [EObject current=null] : ( () otherlv_1= 'Type' ) ;
    public final EObject ruleType_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2543:2: ( ( () otherlv_1= 'Type' ) )
            // InternalMyDsl.g:2544:2: ( () otherlv_1= 'Type' )
            {
            // InternalMyDsl.g:2544:2: ( () otherlv_1= 'Type' )
            // InternalMyDsl.g:2545:3: () otherlv_1= 'Type'
            {
            // InternalMyDsl.g:2545:3: ()
            // InternalMyDsl.g:2546:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getType_ImplAccess().getTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,59,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getType_ImplAccess().getTypeKeyword_1());
            		

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
    // $ANTLR end "ruleType_Impl"


    // $ANTLR start "entryRuleList"
    // InternalMyDsl.g:2560:1: entryRuleList returns [EObject current=null] : iv_ruleList= ruleList EOF ;
    public final EObject entryRuleList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleList = null;


        try {
            // InternalMyDsl.g:2560:45: (iv_ruleList= ruleList EOF )
            // InternalMyDsl.g:2561:2: iv_ruleList= ruleList EOF
            {
             newCompositeNode(grammarAccess.getListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleList=ruleList();

            state._fsp--;

             current =iv_ruleList; 
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
    // $ANTLR end "entryRuleList"


    // $ANTLR start "ruleList"
    // InternalMyDsl.g:2567:1: ruleList returns [EObject current=null] : ( () otherlv_1= 'List' ) ;
    public final EObject ruleList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2573:2: ( ( () otherlv_1= 'List' ) )
            // InternalMyDsl.g:2574:2: ( () otherlv_1= 'List' )
            {
            // InternalMyDsl.g:2574:2: ( () otherlv_1= 'List' )
            // InternalMyDsl.g:2575:3: () otherlv_1= 'List'
            {
            // InternalMyDsl.g:2575:3: ()
            // InternalMyDsl.g:2576:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getListAccess().getListAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,60,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getListAccess().getListKeyword_1());
            		

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
    // $ANTLR end "ruleList"


    // $ANTLR start "entryRuleMap"
    // InternalMyDsl.g:2590:1: entryRuleMap returns [EObject current=null] : iv_ruleMap= ruleMap EOF ;
    public final EObject entryRuleMap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMap = null;


        try {
            // InternalMyDsl.g:2590:44: (iv_ruleMap= ruleMap EOF )
            // InternalMyDsl.g:2591:2: iv_ruleMap= ruleMap EOF
            {
             newCompositeNode(grammarAccess.getMapRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMap=ruleMap();

            state._fsp--;

             current =iv_ruleMap; 
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
    // $ANTLR end "entryRuleMap"


    // $ANTLR start "ruleMap"
    // InternalMyDsl.g:2597:1: ruleMap returns [EObject current=null] : ( () otherlv_1= 'Map' ) ;
    public final EObject ruleMap() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2603:2: ( ( () otherlv_1= 'Map' ) )
            // InternalMyDsl.g:2604:2: ( () otherlv_1= 'Map' )
            {
            // InternalMyDsl.g:2604:2: ( () otherlv_1= 'Map' )
            // InternalMyDsl.g:2605:3: () otherlv_1= 'Map'
            {
            // InternalMyDsl.g:2605:3: ()
            // InternalMyDsl.g:2606:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMapAccess().getMapAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,61,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getMapAccess().getMapKeyword_1());
            		

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
    // $ANTLR end "ruleMap"


    // $ANTLR start "entryRuleComplexType"
    // InternalMyDsl.g:2620:1: entryRuleComplexType returns [EObject current=null] : iv_ruleComplexType= ruleComplexType EOF ;
    public final EObject entryRuleComplexType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexType = null;


        try {
            // InternalMyDsl.g:2620:52: (iv_ruleComplexType= ruleComplexType EOF )
            // InternalMyDsl.g:2621:2: iv_ruleComplexType= ruleComplexType EOF
            {
             newCompositeNode(grammarAccess.getComplexTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComplexType=ruleComplexType();

            state._fsp--;

             current =iv_ruleComplexType; 
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
    // $ANTLR end "entryRuleComplexType"


    // $ANTLR start "ruleComplexType"
    // InternalMyDsl.g:2627:1: ruleComplexType returns [EObject current=null] : ( () otherlv_1= 'ComplexType' ) ;
    public final EObject ruleComplexType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2633:2: ( ( () otherlv_1= 'ComplexType' ) )
            // InternalMyDsl.g:2634:2: ( () otherlv_1= 'ComplexType' )
            {
            // InternalMyDsl.g:2634:2: ( () otherlv_1= 'ComplexType' )
            // InternalMyDsl.g:2635:3: () otherlv_1= 'ComplexType'
            {
            // InternalMyDsl.g:2635:3: ()
            // InternalMyDsl.g:2636:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getComplexTypeAccess().getComplexTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,62,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getComplexTypeAccess().getComplexTypeKeyword_1());
            		

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
    // $ANTLR end "ruleComplexType"


    // $ANTLR start "entryRuleDate"
    // InternalMyDsl.g:2650:1: entryRuleDate returns [EObject current=null] : iv_ruleDate= ruleDate EOF ;
    public final EObject entryRuleDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDate = null;


        try {
            // InternalMyDsl.g:2650:45: (iv_ruleDate= ruleDate EOF )
            // InternalMyDsl.g:2651:2: iv_ruleDate= ruleDate EOF
            {
             newCompositeNode(grammarAccess.getDateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDate=ruleDate();

            state._fsp--;

             current =iv_ruleDate; 
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
    // $ANTLR end "entryRuleDate"


    // $ANTLR start "ruleDate"
    // InternalMyDsl.g:2657:1: ruleDate returns [EObject current=null] : ( () otherlv_1= 'Date' ) ;
    public final EObject ruleDate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2663:2: ( ( () otherlv_1= 'Date' ) )
            // InternalMyDsl.g:2664:2: ( () otherlv_1= 'Date' )
            {
            // InternalMyDsl.g:2664:2: ( () otherlv_1= 'Date' )
            // InternalMyDsl.g:2665:3: () otherlv_1= 'Date'
            {
            // InternalMyDsl.g:2665:3: ()
            // InternalMyDsl.g:2666:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDateAccess().getDateAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,63,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getDateAccess().getDateKeyword_1());
            		

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
    // $ANTLR end "ruleDate"


    // $ANTLR start "entryRuleDouble"
    // InternalMyDsl.g:2680:1: entryRuleDouble returns [EObject current=null] : iv_ruleDouble= ruleDouble EOF ;
    public final EObject entryRuleDouble() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDouble = null;


        try {
            // InternalMyDsl.g:2680:47: (iv_ruleDouble= ruleDouble EOF )
            // InternalMyDsl.g:2681:2: iv_ruleDouble= ruleDouble EOF
            {
             newCompositeNode(grammarAccess.getDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDouble=ruleDouble();

            state._fsp--;

             current =iv_ruleDouble; 
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
    // $ANTLR end "entryRuleDouble"


    // $ANTLR start "ruleDouble"
    // InternalMyDsl.g:2687:1: ruleDouble returns [EObject current=null] : ( () otherlv_1= 'Double' ) ;
    public final EObject ruleDouble() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2693:2: ( ( () otherlv_1= 'Double' ) )
            // InternalMyDsl.g:2694:2: ( () otherlv_1= 'Double' )
            {
            // InternalMyDsl.g:2694:2: ( () otherlv_1= 'Double' )
            // InternalMyDsl.g:2695:3: () otherlv_1= 'Double'
            {
            // InternalMyDsl.g:2695:3: ()
            // InternalMyDsl.g:2696:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDoubleAccess().getDoubleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,64,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getDoubleAccess().getDoubleKeyword_1());
            		

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
    // $ANTLR end "ruleDouble"


    // $ANTLR start "entryRuleString0"
    // InternalMyDsl.g:2710:1: entryRuleString0 returns [EObject current=null] : iv_ruleString0= ruleString0 EOF ;
    public final EObject entryRuleString0() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleString0 = null;


        try {
            // InternalMyDsl.g:2710:48: (iv_ruleString0= ruleString0 EOF )
            // InternalMyDsl.g:2711:2: iv_ruleString0= ruleString0 EOF
            {
             newCompositeNode(grammarAccess.getString0Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleString0=ruleString0();

            state._fsp--;

             current =iv_ruleString0; 
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
    // $ANTLR end "entryRuleString0"


    // $ANTLR start "ruleString0"
    // InternalMyDsl.g:2717:1: ruleString0 returns [EObject current=null] : ( () otherlv_1= 'String' ) ;
    public final EObject ruleString0() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2723:2: ( ( () otherlv_1= 'String' ) )
            // InternalMyDsl.g:2724:2: ( () otherlv_1= 'String' )
            {
            // InternalMyDsl.g:2724:2: ( () otherlv_1= 'String' )
            // InternalMyDsl.g:2725:3: () otherlv_1= 'String'
            {
            // InternalMyDsl.g:2725:3: ()
            // InternalMyDsl.g:2726:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getString0Access().getStringAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,65,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getString0Access().getStringKeyword_1());
            		

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
    // $ANTLR end "ruleString0"


    // $ANTLR start "entryRuleInt0"
    // InternalMyDsl.g:2740:1: entryRuleInt0 returns [EObject current=null] : iv_ruleInt0= ruleInt0 EOF ;
    public final EObject entryRuleInt0() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInt0 = null;


        try {
            // InternalMyDsl.g:2740:45: (iv_ruleInt0= ruleInt0 EOF )
            // InternalMyDsl.g:2741:2: iv_ruleInt0= ruleInt0 EOF
            {
             newCompositeNode(grammarAccess.getInt0Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInt0=ruleInt0();

            state._fsp--;

             current =iv_ruleInt0; 
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
    // $ANTLR end "entryRuleInt0"


    // $ANTLR start "ruleInt0"
    // InternalMyDsl.g:2747:1: ruleInt0 returns [EObject current=null] : ( () otherlv_1= 'Int' ) ;
    public final EObject ruleInt0() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2753:2: ( ( () otherlv_1= 'Int' ) )
            // InternalMyDsl.g:2754:2: ( () otherlv_1= 'Int' )
            {
            // InternalMyDsl.g:2754:2: ( () otherlv_1= 'Int' )
            // InternalMyDsl.g:2755:3: () otherlv_1= 'Int'
            {
            // InternalMyDsl.g:2755:3: ()
            // InternalMyDsl.g:2756:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInt0Access().getIntAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,66,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getInt0Access().getIntKeyword_1());
            		

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
    // $ANTLR end "ruleInt0"


    // $ANTLR start "entryRuleChar"
    // InternalMyDsl.g:2770:1: entryRuleChar returns [EObject current=null] : iv_ruleChar= ruleChar EOF ;
    public final EObject entryRuleChar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChar = null;


        try {
            // InternalMyDsl.g:2770:45: (iv_ruleChar= ruleChar EOF )
            // InternalMyDsl.g:2771:2: iv_ruleChar= ruleChar EOF
            {
             newCompositeNode(grammarAccess.getCharRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChar=ruleChar();

            state._fsp--;

             current =iv_ruleChar; 
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
    // $ANTLR end "entryRuleChar"


    // $ANTLR start "ruleChar"
    // InternalMyDsl.g:2777:1: ruleChar returns [EObject current=null] : ( () otherlv_1= 'Char' ) ;
    public final EObject ruleChar() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2783:2: ( ( () otherlv_1= 'Char' ) )
            // InternalMyDsl.g:2784:2: ( () otherlv_1= 'Char' )
            {
            // InternalMyDsl.g:2784:2: ( () otherlv_1= 'Char' )
            // InternalMyDsl.g:2785:3: () otherlv_1= 'Char'
            {
            // InternalMyDsl.g:2785:3: ()
            // InternalMyDsl.g:2786:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCharAccess().getCharAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,67,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getCharAccess().getCharKeyword_1());
            		

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
    // $ANTLR end "ruleChar"


    // $ANTLR start "entryRuleLong"
    // InternalMyDsl.g:2800:1: entryRuleLong returns [EObject current=null] : iv_ruleLong= ruleLong EOF ;
    public final EObject entryRuleLong() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLong = null;


        try {
            // InternalMyDsl.g:2800:45: (iv_ruleLong= ruleLong EOF )
            // InternalMyDsl.g:2801:2: iv_ruleLong= ruleLong EOF
            {
             newCompositeNode(grammarAccess.getLongRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLong=ruleLong();

            state._fsp--;

             current =iv_ruleLong; 
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
    // $ANTLR end "entryRuleLong"


    // $ANTLR start "ruleLong"
    // InternalMyDsl.g:2807:1: ruleLong returns [EObject current=null] : ( () otherlv_1= 'Long' ) ;
    public final EObject ruleLong() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2813:2: ( ( () otherlv_1= 'Long' ) )
            // InternalMyDsl.g:2814:2: ( () otherlv_1= 'Long' )
            {
            // InternalMyDsl.g:2814:2: ( () otherlv_1= 'Long' )
            // InternalMyDsl.g:2815:3: () otherlv_1= 'Long'
            {
            // InternalMyDsl.g:2815:3: ()
            // InternalMyDsl.g:2816:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLongAccess().getLongAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,68,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getLongAccess().getLongKeyword_1());
            		

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
    // $ANTLR end "ruleLong"


    // $ANTLR start "entryRuleFloat"
    // InternalMyDsl.g:2830:1: entryRuleFloat returns [EObject current=null] : iv_ruleFloat= ruleFloat EOF ;
    public final EObject entryRuleFloat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloat = null;


        try {
            // InternalMyDsl.g:2830:46: (iv_ruleFloat= ruleFloat EOF )
            // InternalMyDsl.g:2831:2: iv_ruleFloat= ruleFloat EOF
            {
             newCompositeNode(grammarAccess.getFloatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFloat=ruleFloat();

            state._fsp--;

             current =iv_ruleFloat; 
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
    // $ANTLR end "entryRuleFloat"


    // $ANTLR start "ruleFloat"
    // InternalMyDsl.g:2837:1: ruleFloat returns [EObject current=null] : ( () otherlv_1= 'Float' ) ;
    public final EObject ruleFloat() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2843:2: ( ( () otherlv_1= 'Float' ) )
            // InternalMyDsl.g:2844:2: ( () otherlv_1= 'Float' )
            {
            // InternalMyDsl.g:2844:2: ( () otherlv_1= 'Float' )
            // InternalMyDsl.g:2845:3: () otherlv_1= 'Float'
            {
            // InternalMyDsl.g:2845:3: ()
            // InternalMyDsl.g:2846:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFloatAccess().getFloatAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,69,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getFloatAccess().getFloatKeyword_1());
            		

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
    // $ANTLR end "ruleFloat"


    // $ANTLR start "entryRuleBoolean"
    // InternalMyDsl.g:2860:1: entryRuleBoolean returns [EObject current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final EObject entryRuleBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolean = null;


        try {
            // InternalMyDsl.g:2860:48: (iv_ruleBoolean= ruleBoolean EOF )
            // InternalMyDsl.g:2861:2: iv_ruleBoolean= ruleBoolean EOF
            {
             newCompositeNode(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoolean=ruleBoolean();

            state._fsp--;

             current =iv_ruleBoolean; 
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
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // InternalMyDsl.g:2867:1: ruleBoolean returns [EObject current=null] : ( () otherlv_1= 'Boolean' ) ;
    public final EObject ruleBoolean() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2873:2: ( ( () otherlv_1= 'Boolean' ) )
            // InternalMyDsl.g:2874:2: ( () otherlv_1= 'Boolean' )
            {
            // InternalMyDsl.g:2874:2: ( () otherlv_1= 'Boolean' )
            // InternalMyDsl.g:2875:3: () otherlv_1= 'Boolean'
            {
            // InternalMyDsl.g:2875:3: ()
            // InternalMyDsl.g:2876:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBooleanAccess().getBooleanAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,70,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getBooleanAccess().getBooleanKeyword_1());
            		

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
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRuleVoid"
    // InternalMyDsl.g:2890:1: entryRuleVoid returns [EObject current=null] : iv_ruleVoid= ruleVoid EOF ;
    public final EObject entryRuleVoid() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVoid = null;


        try {
            // InternalMyDsl.g:2890:45: (iv_ruleVoid= ruleVoid EOF )
            // InternalMyDsl.g:2891:2: iv_ruleVoid= ruleVoid EOF
            {
             newCompositeNode(grammarAccess.getVoidRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVoid=ruleVoid();

            state._fsp--;

             current =iv_ruleVoid; 
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
    // $ANTLR end "entryRuleVoid"


    // $ANTLR start "ruleVoid"
    // InternalMyDsl.g:2897:1: ruleVoid returns [EObject current=null] : ( () otherlv_1= 'Void' ) ;
    public final EObject ruleVoid() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2903:2: ( ( () otherlv_1= 'Void' ) )
            // InternalMyDsl.g:2904:2: ( () otherlv_1= 'Void' )
            {
            // InternalMyDsl.g:2904:2: ( () otherlv_1= 'Void' )
            // InternalMyDsl.g:2905:3: () otherlv_1= 'Void'
            {
            // InternalMyDsl.g:2905:3: ()
            // InternalMyDsl.g:2906:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVoidAccess().getVoidAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,71,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getVoidAccess().getVoidKeyword_1());
            		

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
    // $ANTLR end "ruleVoid"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x002B002885202802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000070000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000710100000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000610100000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000600100000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000400100000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000007C000100000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000078000100000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000070000100000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000060000100000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000040000100000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000F00000100000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000E00000100000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000C00000100000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000800000100000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x000007C008100000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000078008100000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000070008100000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000060008100000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000040008100000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000008100000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x00C0000000100000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0xF800000000000000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0080000000100000L});

}