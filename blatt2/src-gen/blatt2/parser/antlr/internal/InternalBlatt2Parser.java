package blatt2.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import blatt2.services.Blatt2GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBlatt2Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'AllocationContext'", "'{'", "'allocatedAssemblyContext'", "'('", "','", "')'", "'targetContainer'", "'}'", "'Container'", "'links'", "'AssemblyContext'", "'requiredRole'", "'allocationContext'", "'providedRole'", "'component'", "'Role'", "'Component'", "'requiredInterface'", "'requiredService'", "'providedInterface'", "'providedService'", "'behaviourDescription'", "'Interface'", "'signature'", "'Service'", "'correspondingSignature'", "'BehaviorDescription'", "'calledServices'", "'internalActions'", "'loops'", "'branches'", "'CompositeComponent'", "'encapsulatedAssemblyContext'", "'Signature'", "'returnType'", "'parameterType'", "'Type'", "'List'", "'Map'", "'ComplexType'", "'Date'", "'Double'", "'String'", "'Int'", "'Char'", "'Long'", "'Float'", "'Boolean'", "'Void'", "'InternalAction'", "'Loop'", "'Branch'"
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

        public InternalBlatt2Parser(TokenStream input, Blatt2GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "AllocationContext";
       	}

       	@Override
       	protected Blatt2GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleAllocationContext"
    // InternalBlatt2.g:64:1: entryRuleAllocationContext returns [EObject current=null] : iv_ruleAllocationContext= ruleAllocationContext EOF ;
    public final EObject entryRuleAllocationContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllocationContext = null;


        try {
            // InternalBlatt2.g:64:58: (iv_ruleAllocationContext= ruleAllocationContext EOF )
            // InternalBlatt2.g:65:2: iv_ruleAllocationContext= ruleAllocationContext EOF
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
    // InternalBlatt2.g:71:1: ruleAllocationContext returns [EObject current=null] : (otherlv_0= 'AllocationContext' otherlv_1= '{' otherlv_2= 'allocatedAssemblyContext' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' (otherlv_8= 'targetContainer' otherlv_9= '{' ( (lv_targetContainer_10_0= ruleContainer ) ) (otherlv_11= ',' ( (lv_targetContainer_12_0= ruleContainer ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) ;
    public final EObject ruleAllocationContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        EObject lv_targetContainer_10_0 = null;

        EObject lv_targetContainer_12_0 = null;



        	enterRule();

        try {
            // InternalBlatt2.g:77:2: ( (otherlv_0= 'AllocationContext' otherlv_1= '{' otherlv_2= 'allocatedAssemblyContext' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' (otherlv_8= 'targetContainer' otherlv_9= '{' ( (lv_targetContainer_10_0= ruleContainer ) ) (otherlv_11= ',' ( (lv_targetContainer_12_0= ruleContainer ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) )
            // InternalBlatt2.g:78:2: (otherlv_0= 'AllocationContext' otherlv_1= '{' otherlv_2= 'allocatedAssemblyContext' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' (otherlv_8= 'targetContainer' otherlv_9= '{' ( (lv_targetContainer_10_0= ruleContainer ) ) (otherlv_11= ',' ( (lv_targetContainer_12_0= ruleContainer ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            {
            // InternalBlatt2.g:78:2: (otherlv_0= 'AllocationContext' otherlv_1= '{' otherlv_2= 'allocatedAssemblyContext' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' (otherlv_8= 'targetContainer' otherlv_9= '{' ( (lv_targetContainer_10_0= ruleContainer ) ) (otherlv_11= ',' ( (lv_targetContainer_12_0= ruleContainer ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            // InternalBlatt2.g:79:3: otherlv_0= 'AllocationContext' otherlv_1= '{' otherlv_2= 'allocatedAssemblyContext' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' (otherlv_8= 'targetContainer' otherlv_9= '{' ( (lv_targetContainer_10_0= ruleContainer ) ) (otherlv_11= ',' ( (lv_targetContainer_12_0= ruleContainer ) ) )* otherlv_13= '}' )? otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAllocationContextAccess().getAllocationContextKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAllocationContextAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getAllocationContextAccess().getAllocatedAssemblyContextKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getAllocationContextAccess().getLeftParenthesisKeyword_3());
            		
            // InternalBlatt2.g:95:3: ( ( ruleEString ) )
            // InternalBlatt2.g:96:4: ( ruleEString )
            {
            // InternalBlatt2.g:96:4: ( ruleEString )
            // InternalBlatt2.g:97:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAllocationContextRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAllocationContextAccess().getAllocatedAssemblyContextAssemblyContextCrossReference_4_0());
            				
            pushFollow(FOLLOW_7);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBlatt2.g:111:3: (otherlv_5= ',' ( ( ruleEString ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBlatt2.g:112:4: otherlv_5= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,15,FOLLOW_6); 

            	    				newLeafNode(otherlv_5, grammarAccess.getAllocationContextAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalBlatt2.g:116:4: ( ( ruleEString ) )
            	    // InternalBlatt2.g:117:5: ( ruleEString )
            	    {
            	    // InternalBlatt2.g:117:5: ( ruleEString )
            	    // InternalBlatt2.g:118:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getAllocationContextRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getAllocationContextAccess().getAllocatedAssemblyContextAssemblyContextCrossReference_5_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_7=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getAllocationContextAccess().getRightParenthesisKeyword_6());
            		
            // InternalBlatt2.g:137:3: (otherlv_8= 'targetContainer' otherlv_9= '{' ( (lv_targetContainer_10_0= ruleContainer ) ) (otherlv_11= ',' ( (lv_targetContainer_12_0= ruleContainer ) ) )* otherlv_13= '}' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalBlatt2.g:138:4: otherlv_8= 'targetContainer' otherlv_9= '{' ( (lv_targetContainer_10_0= ruleContainer ) ) (otherlv_11= ',' ( (lv_targetContainer_12_0= ruleContainer ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getAllocationContextAccess().getTargetContainerKeyword_7_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_9, grammarAccess.getAllocationContextAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalBlatt2.g:146:4: ( (lv_targetContainer_10_0= ruleContainer ) )
                    // InternalBlatt2.g:147:5: (lv_targetContainer_10_0= ruleContainer )
                    {
                    // InternalBlatt2.g:147:5: (lv_targetContainer_10_0= ruleContainer )
                    // InternalBlatt2.g:148:6: lv_targetContainer_10_0= ruleContainer
                    {

                    						newCompositeNode(grammarAccess.getAllocationContextAccess().getTargetContainerContainerParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_targetContainer_10_0=ruleContainer();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAllocationContextRule());
                    						}
                    						add(
                    							current,
                    							"targetContainer",
                    							lv_targetContainer_10_0,
                    							"blatt2.Blatt2.Container");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBlatt2.g:165:4: (otherlv_11= ',' ( (lv_targetContainer_12_0= ruleContainer ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==15) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalBlatt2.g:166:5: otherlv_11= ',' ( (lv_targetContainer_12_0= ruleContainer ) )
                    	    {
                    	    otherlv_11=(Token)match(input,15,FOLLOW_9); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getAllocationContextAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalBlatt2.g:170:5: ( (lv_targetContainer_12_0= ruleContainer ) )
                    	    // InternalBlatt2.g:171:6: (lv_targetContainer_12_0= ruleContainer )
                    	    {
                    	    // InternalBlatt2.g:171:6: (lv_targetContainer_12_0= ruleContainer )
                    	    // InternalBlatt2.g:172:7: lv_targetContainer_12_0= ruleContainer
                    	    {

                    	    							newCompositeNode(grammarAccess.getAllocationContextAccess().getTargetContainerContainerParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_targetContainer_12_0=ruleContainer();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAllocationContextRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"targetContainer",
                    	    								lv_targetContainer_12_0,
                    	    								"blatt2.Blatt2.Container");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_13, grammarAccess.getAllocationContextAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_14=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getAllocationContextAccess().getRightCurlyBracketKeyword_8());
            		

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


    // $ANTLR start "entryRuleComponent"
    // InternalBlatt2.g:203:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalBlatt2.g:203:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalBlatt2.g:204:2: iv_ruleComponent= ruleComponent EOF
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
    // InternalBlatt2.g:210:1: ruleComponent returns [EObject current=null] : (this_Component_Impl_0= ruleComponent_Impl | this_CompositeComponent_1= ruleCompositeComponent ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        EObject this_Component_Impl_0 = null;

        EObject this_CompositeComponent_1 = null;



        	enterRule();

        try {
            // InternalBlatt2.g:216:2: ( (this_Component_Impl_0= ruleComponent_Impl | this_CompositeComponent_1= ruleCompositeComponent ) )
            // InternalBlatt2.g:217:2: (this_Component_Impl_0= ruleComponent_Impl | this_CompositeComponent_1= ruleCompositeComponent )
            {
            // InternalBlatt2.g:217:2: (this_Component_Impl_0= ruleComponent_Impl | this_CompositeComponent_1= ruleCompositeComponent )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==27) ) {
                alt4=1;
            }
            else if ( (LA4_0==42) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalBlatt2.g:218:3: this_Component_Impl_0= ruleComponent_Impl
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
                    // InternalBlatt2.g:227:3: this_CompositeComponent_1= ruleCompositeComponent
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
    // InternalBlatt2.g:239:1: entryRuleContainer returns [EObject current=null] : iv_ruleContainer= ruleContainer EOF ;
    public final EObject entryRuleContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainer = null;


        try {
            // InternalBlatt2.g:239:50: (iv_ruleContainer= ruleContainer EOF )
            // InternalBlatt2.g:240:2: iv_ruleContainer= ruleContainer EOF
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
    // InternalBlatt2.g:246:1: ruleContainer returns [EObject current=null] : (otherlv_0= 'Container' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'links' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' ) ;
    public final EObject ruleContainer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalBlatt2.g:252:2: ( (otherlv_0= 'Container' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'links' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' ) )
            // InternalBlatt2.g:253:2: (otherlv_0= 'Container' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'links' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' )
            {
            // InternalBlatt2.g:253:2: (otherlv_0= 'Container' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'links' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' )
            // InternalBlatt2.g:254:3: otherlv_0= 'Container' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'links' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getContainerAccess().getContainerKeyword_0());
            		
            // InternalBlatt2.g:258:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBlatt2.g:259:4: (lv_name_1_0= ruleEString )
            {
            // InternalBlatt2.g:259:4: (lv_name_1_0= ruleEString )
            // InternalBlatt2.g:260:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getContainerAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContainerRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"blatt2.Blatt2.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getContainerAccess().getLinksKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getContainerAccess().getLeftParenthesisKeyword_4());
            		
            // InternalBlatt2.g:289:3: ( ( ruleEString ) )
            // InternalBlatt2.g:290:4: ( ruleEString )
            {
            // InternalBlatt2.g:290:4: ( ruleEString )
            // InternalBlatt2.g:291:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContainerRule());
            					}
            				

            					newCompositeNode(grammarAccess.getContainerAccess().getLinksLinkCrossReference_5_0());
            				
            pushFollow(FOLLOW_7);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBlatt2.g:305:3: (otherlv_6= ',' ( ( ruleEString ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalBlatt2.g:306:4: otherlv_6= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,15,FOLLOW_6); 

            	    				newLeafNode(otherlv_6, grammarAccess.getContainerAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalBlatt2.g:310:4: ( ( ruleEString ) )
            	    // InternalBlatt2.g:311:5: ( ruleEString )
            	    {
            	    // InternalBlatt2.g:311:5: ( ruleEString )
            	    // InternalBlatt2.g:312:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getContainerRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getContainerAccess().getLinksLinkCrossReference_6_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_8=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_8, grammarAccess.getContainerAccess().getRightParenthesisKeyword_7());
            		
            otherlv_9=(Token)match(input,18,FOLLOW_2); 

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


    // $ANTLR start "entryRuleAssemblyContext"
    // InternalBlatt2.g:339:1: entryRuleAssemblyContext returns [EObject current=null] : iv_ruleAssemblyContext= ruleAssemblyContext EOF ;
    public final EObject entryRuleAssemblyContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssemblyContext = null;


        try {
            // InternalBlatt2.g:339:56: (iv_ruleAssemblyContext= ruleAssemblyContext EOF )
            // InternalBlatt2.g:340:2: iv_ruleAssemblyContext= ruleAssemblyContext EOF
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
    // InternalBlatt2.g:346:1: ruleAssemblyContext returns [EObject current=null] : (otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'requiredRole' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= 'allocationContext' ( ( ruleEString ) ) (otherlv_11= 'providedRole' otherlv_12= '{' ( (lv_providedRole_13_0= ruleRole ) ) (otherlv_14= ',' ( (lv_providedRole_15_0= ruleRole ) ) )* otherlv_16= '}' )? (otherlv_17= 'component' otherlv_18= '{' ( (lv_component_19_0= ruleComponent ) ) (otherlv_20= ',' ( (lv_component_21_0= ruleComponent ) ) )* otherlv_22= '}' )? otherlv_23= '}' ) ;
    public final EObject ruleAssemblyContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
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
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_providedRole_13_0 = null;

        EObject lv_providedRole_15_0 = null;

        EObject lv_component_19_0 = null;

        EObject lv_component_21_0 = null;



        	enterRule();

        try {
            // InternalBlatt2.g:352:2: ( (otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'requiredRole' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= 'allocationContext' ( ( ruleEString ) ) (otherlv_11= 'providedRole' otherlv_12= '{' ( (lv_providedRole_13_0= ruleRole ) ) (otherlv_14= ',' ( (lv_providedRole_15_0= ruleRole ) ) )* otherlv_16= '}' )? (otherlv_17= 'component' otherlv_18= '{' ( (lv_component_19_0= ruleComponent ) ) (otherlv_20= ',' ( (lv_component_21_0= ruleComponent ) ) )* otherlv_22= '}' )? otherlv_23= '}' ) )
            // InternalBlatt2.g:353:2: (otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'requiredRole' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= 'allocationContext' ( ( ruleEString ) ) (otherlv_11= 'providedRole' otherlv_12= '{' ( (lv_providedRole_13_0= ruleRole ) ) (otherlv_14= ',' ( (lv_providedRole_15_0= ruleRole ) ) )* otherlv_16= '}' )? (otherlv_17= 'component' otherlv_18= '{' ( (lv_component_19_0= ruleComponent ) ) (otherlv_20= ',' ( (lv_component_21_0= ruleComponent ) ) )* otherlv_22= '}' )? otherlv_23= '}' )
            {
            // InternalBlatt2.g:353:2: (otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'requiredRole' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= 'allocationContext' ( ( ruleEString ) ) (otherlv_11= 'providedRole' otherlv_12= '{' ( (lv_providedRole_13_0= ruleRole ) ) (otherlv_14= ',' ( (lv_providedRole_15_0= ruleRole ) ) )* otherlv_16= '}' )? (otherlv_17= 'component' otherlv_18= '{' ( (lv_component_19_0= ruleComponent ) ) (otherlv_20= ',' ( (lv_component_21_0= ruleComponent ) ) )* otherlv_22= '}' )? otherlv_23= '}' )
            // InternalBlatt2.g:354:3: otherlv_0= 'AssemblyContext' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'requiredRole' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= 'allocationContext' ( ( ruleEString ) ) (otherlv_11= 'providedRole' otherlv_12= '{' ( (lv_providedRole_13_0= ruleRole ) ) (otherlv_14= ',' ( (lv_providedRole_15_0= ruleRole ) ) )* otherlv_16= '}' )? (otherlv_17= 'component' otherlv_18= '{' ( (lv_component_19_0= ruleComponent ) ) (otherlv_20= ',' ( (lv_component_21_0= ruleComponent ) ) )* otherlv_22= '}' )? otherlv_23= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getAssemblyContextAccess().getAssemblyContextKeyword_0());
            		
            // InternalBlatt2.g:358:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBlatt2.g:359:4: (lv_name_1_0= ruleEString )
            {
            // InternalBlatt2.g:359:4: (lv_name_1_0= ruleEString )
            // InternalBlatt2.g:360:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAssemblyContextAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssemblyContextRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"blatt2.Blatt2.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getAssemblyContextAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalBlatt2.g:381:3: (otherlv_3= 'requiredRole' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalBlatt2.g:382:4: otherlv_3= 'requiredRole' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')'
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getAssemblyContextAccess().getRequiredRoleKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getAssemblyContextAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalBlatt2.g:390:4: ( ( ruleEString ) )
                    // InternalBlatt2.g:391:5: ( ruleEString )
                    {
                    // InternalBlatt2.g:391:5: ( ruleEString )
                    // InternalBlatt2.g:392:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAssemblyContextRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAssemblyContextAccess().getRequiredRoleRoleCrossReference_3_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBlatt2.g:406:4: (otherlv_6= ',' ( ( ruleEString ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==15) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalBlatt2.g:407:5: otherlv_6= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getAssemblyContextAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalBlatt2.g:411:5: ( ( ruleEString ) )
                    	    // InternalBlatt2.g:412:6: ( ruleEString )
                    	    {
                    	    // InternalBlatt2.g:412:6: ( ruleEString )
                    	    // InternalBlatt2.g:413:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getAssemblyContextRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getAssemblyContextAccess().getRequiredRoleRoleCrossReference_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
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

                    otherlv_8=(Token)match(input,16,FOLLOW_14); 

                    				newLeafNode(otherlv_8, grammarAccess.getAssemblyContextAccess().getRightParenthesisKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_9, grammarAccess.getAssemblyContextAccess().getAllocationContextKeyword_4());
            		
            // InternalBlatt2.g:437:3: ( ( ruleEString ) )
            // InternalBlatt2.g:438:4: ( ruleEString )
            {
            // InternalBlatt2.g:438:4: ( ruleEString )
            // InternalBlatt2.g:439:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssemblyContextRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssemblyContextAccess().getAllocationContextAllocationContextCrossReference_5_0());
            				
            pushFollow(FOLLOW_15);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBlatt2.g:453:3: (otherlv_11= 'providedRole' otherlv_12= '{' ( (lv_providedRole_13_0= ruleRole ) ) (otherlv_14= ',' ( (lv_providedRole_15_0= ruleRole ) ) )* otherlv_16= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalBlatt2.g:454:4: otherlv_11= 'providedRole' otherlv_12= '{' ( (lv_providedRole_13_0= ruleRole ) ) (otherlv_14= ',' ( (lv_providedRole_15_0= ruleRole ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getAssemblyContextAccess().getProvidedRoleKeyword_6_0());
                    			
                    otherlv_12=(Token)match(input,12,FOLLOW_16); 

                    				newLeafNode(otherlv_12, grammarAccess.getAssemblyContextAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalBlatt2.g:462:4: ( (lv_providedRole_13_0= ruleRole ) )
                    // InternalBlatt2.g:463:5: (lv_providedRole_13_0= ruleRole )
                    {
                    // InternalBlatt2.g:463:5: (lv_providedRole_13_0= ruleRole )
                    // InternalBlatt2.g:464:6: lv_providedRole_13_0= ruleRole
                    {

                    						newCompositeNode(grammarAccess.getAssemblyContextAccess().getProvidedRoleRoleParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_providedRole_13_0=ruleRole();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAssemblyContextRule());
                    						}
                    						add(
                    							current,
                    							"providedRole",
                    							lv_providedRole_13_0,
                    							"blatt2.Blatt2.Role");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBlatt2.g:481:4: (otherlv_14= ',' ( (lv_providedRole_15_0= ruleRole ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==15) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalBlatt2.g:482:5: otherlv_14= ',' ( (lv_providedRole_15_0= ruleRole ) )
                    	    {
                    	    otherlv_14=(Token)match(input,15,FOLLOW_16); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getAssemblyContextAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalBlatt2.g:486:5: ( (lv_providedRole_15_0= ruleRole ) )
                    	    // InternalBlatt2.g:487:6: (lv_providedRole_15_0= ruleRole )
                    	    {
                    	    // InternalBlatt2.g:487:6: (lv_providedRole_15_0= ruleRole )
                    	    // InternalBlatt2.g:488:7: lv_providedRole_15_0= ruleRole
                    	    {

                    	    							newCompositeNode(grammarAccess.getAssemblyContextAccess().getProvidedRoleRoleParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_providedRole_15_0=ruleRole();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAssemblyContextRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"providedRole",
                    	    								lv_providedRole_15_0,
                    	    								"blatt2.Blatt2.Role");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,18,FOLLOW_17); 

                    				newLeafNode(otherlv_16, grammarAccess.getAssemblyContextAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalBlatt2.g:511:3: (otherlv_17= 'component' otherlv_18= '{' ( (lv_component_19_0= ruleComponent ) ) (otherlv_20= ',' ( (lv_component_21_0= ruleComponent ) ) )* otherlv_22= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalBlatt2.g:512:4: otherlv_17= 'component' otherlv_18= '{' ( (lv_component_19_0= ruleComponent ) ) (otherlv_20= ',' ( (lv_component_21_0= ruleComponent ) ) )* otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_17, grammarAccess.getAssemblyContextAccess().getComponentKeyword_7_0());
                    			
                    otherlv_18=(Token)match(input,12,FOLLOW_18); 

                    				newLeafNode(otherlv_18, grammarAccess.getAssemblyContextAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalBlatt2.g:520:4: ( (lv_component_19_0= ruleComponent ) )
                    // InternalBlatt2.g:521:5: (lv_component_19_0= ruleComponent )
                    {
                    // InternalBlatt2.g:521:5: (lv_component_19_0= ruleComponent )
                    // InternalBlatt2.g:522:6: lv_component_19_0= ruleComponent
                    {

                    						newCompositeNode(grammarAccess.getAssemblyContextAccess().getComponentComponentParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_component_19_0=ruleComponent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAssemblyContextRule());
                    						}
                    						add(
                    							current,
                    							"component",
                    							lv_component_19_0,
                    							"blatt2.Blatt2.Component");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBlatt2.g:539:4: (otherlv_20= ',' ( (lv_component_21_0= ruleComponent ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==15) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalBlatt2.g:540:5: otherlv_20= ',' ( (lv_component_21_0= ruleComponent ) )
                    	    {
                    	    otherlv_20=(Token)match(input,15,FOLLOW_18); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getAssemblyContextAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalBlatt2.g:544:5: ( (lv_component_21_0= ruleComponent ) )
                    	    // InternalBlatt2.g:545:6: (lv_component_21_0= ruleComponent )
                    	    {
                    	    // InternalBlatt2.g:545:6: (lv_component_21_0= ruleComponent )
                    	    // InternalBlatt2.g:546:7: lv_component_21_0= ruleComponent
                    	    {

                    	    							newCompositeNode(grammarAccess.getAssemblyContextAccess().getComponentComponentParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_component_21_0=ruleComponent();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAssemblyContextRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"component",
                    	    								lv_component_21_0,
                    	    								"blatt2.Blatt2.Component");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_22, grammarAccess.getAssemblyContextAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_23=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_23, grammarAccess.getAssemblyContextAccess().getRightCurlyBracketKeyword_8());
            		

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


    // $ANTLR start "entryRuleEString"
    // InternalBlatt2.g:577:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalBlatt2.g:577:47: (iv_ruleEString= ruleEString EOF )
            // InternalBlatt2.g:578:2: iv_ruleEString= ruleEString EOF
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
    // InternalBlatt2.g:584:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalBlatt2.g:590:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalBlatt2.g:591:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalBlatt2.g:591:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalBlatt2.g:592:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBlatt2.g:600:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleRole"
    // InternalBlatt2.g:611:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // InternalBlatt2.g:611:45: (iv_ruleRole= ruleRole EOF )
            // InternalBlatt2.g:612:2: iv_ruleRole= ruleRole EOF
            {
             newCompositeNode(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRole=ruleRole();

            state._fsp--;

             current =iv_ruleRole; 
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
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // InternalBlatt2.g:618:1: ruleRole returns [EObject current=null] : ( () otherlv_1= 'Role' ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalBlatt2.g:624:2: ( ( () otherlv_1= 'Role' ) )
            // InternalBlatt2.g:625:2: ( () otherlv_1= 'Role' )
            {
            // InternalBlatt2.g:625:2: ( () otherlv_1= 'Role' )
            // InternalBlatt2.g:626:3: () otherlv_1= 'Role'
            {
            // InternalBlatt2.g:626:3: ()
            // InternalBlatt2.g:627:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRoleAccess().getRoleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getRoleAccess().getRoleKeyword_1());
            		

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
    // $ANTLR end "ruleRole"


    // $ANTLR start "entryRuleComponent_Impl"
    // InternalBlatt2.g:641:1: entryRuleComponent_Impl returns [EObject current=null] : iv_ruleComponent_Impl= ruleComponent_Impl EOF ;
    public final EObject entryRuleComponent_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent_Impl = null;


        try {
            // InternalBlatt2.g:641:55: (iv_ruleComponent_Impl= ruleComponent_Impl EOF )
            // InternalBlatt2.g:642:2: iv_ruleComponent_Impl= ruleComponent_Impl EOF
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
    // InternalBlatt2.g:648:1: ruleComponent_Impl returns [EObject current=null] : (otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'requiredInterface' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= 'requiredService' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' (otherlv_15= 'providedInterface' otherlv_16= '{' ( (lv_providedInterface_17_0= ruleInterface ) ) (otherlv_18= ',' ( (lv_providedInterface_19_0= ruleInterface ) ) )* otherlv_20= '}' )? otherlv_21= 'providedService' otherlv_22= '{' ( (lv_providedService_23_0= ruleService ) ) (otherlv_24= ',' ( (lv_providedService_25_0= ruleService ) ) )* otherlv_26= '}' otherlv_27= 'behaviourDescription' ( (lv_behaviourDescription_28_0= ruleBehaviorDescription ) ) otherlv_29= '}' ) ;
    public final EObject ruleComponent_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
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
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_providedInterface_17_0 = null;

        EObject lv_providedInterface_19_0 = null;

        EObject lv_providedService_23_0 = null;

        EObject lv_providedService_25_0 = null;

        EObject lv_behaviourDescription_28_0 = null;



        	enterRule();

        try {
            // InternalBlatt2.g:654:2: ( (otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'requiredInterface' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= 'requiredService' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' (otherlv_15= 'providedInterface' otherlv_16= '{' ( (lv_providedInterface_17_0= ruleInterface ) ) (otherlv_18= ',' ( (lv_providedInterface_19_0= ruleInterface ) ) )* otherlv_20= '}' )? otherlv_21= 'providedService' otherlv_22= '{' ( (lv_providedService_23_0= ruleService ) ) (otherlv_24= ',' ( (lv_providedService_25_0= ruleService ) ) )* otherlv_26= '}' otherlv_27= 'behaviourDescription' ( (lv_behaviourDescription_28_0= ruleBehaviorDescription ) ) otherlv_29= '}' ) )
            // InternalBlatt2.g:655:2: (otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'requiredInterface' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= 'requiredService' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' (otherlv_15= 'providedInterface' otherlv_16= '{' ( (lv_providedInterface_17_0= ruleInterface ) ) (otherlv_18= ',' ( (lv_providedInterface_19_0= ruleInterface ) ) )* otherlv_20= '}' )? otherlv_21= 'providedService' otherlv_22= '{' ( (lv_providedService_23_0= ruleService ) ) (otherlv_24= ',' ( (lv_providedService_25_0= ruleService ) ) )* otherlv_26= '}' otherlv_27= 'behaviourDescription' ( (lv_behaviourDescription_28_0= ruleBehaviorDescription ) ) otherlv_29= '}' )
            {
            // InternalBlatt2.g:655:2: (otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'requiredInterface' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= 'requiredService' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' (otherlv_15= 'providedInterface' otherlv_16= '{' ( (lv_providedInterface_17_0= ruleInterface ) ) (otherlv_18= ',' ( (lv_providedInterface_19_0= ruleInterface ) ) )* otherlv_20= '}' )? otherlv_21= 'providedService' otherlv_22= '{' ( (lv_providedService_23_0= ruleService ) ) (otherlv_24= ',' ( (lv_providedService_25_0= ruleService ) ) )* otherlv_26= '}' otherlv_27= 'behaviourDescription' ( (lv_behaviourDescription_28_0= ruleBehaviorDescription ) ) otherlv_29= '}' )
            // InternalBlatt2.g:656:3: otherlv_0= 'Component' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'requiredInterface' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= 'requiredService' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' (otherlv_15= 'providedInterface' otherlv_16= '{' ( (lv_providedInterface_17_0= ruleInterface ) ) (otherlv_18= ',' ( (lv_providedInterface_19_0= ruleInterface ) ) )* otherlv_20= '}' )? otherlv_21= 'providedService' otherlv_22= '{' ( (lv_providedService_23_0= ruleService ) ) (otherlv_24= ',' ( (lv_providedService_25_0= ruleService ) ) )* otherlv_26= '}' otherlv_27= 'behaviourDescription' ( (lv_behaviourDescription_28_0= ruleBehaviorDescription ) ) otherlv_29= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getComponent_ImplAccess().getComponentKeyword_0());
            		
            // InternalBlatt2.g:660:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBlatt2.g:661:4: (lv_name_1_0= ruleEString )
            {
            // InternalBlatt2.g:661:4: (lv_name_1_0= ruleEString )
            // InternalBlatt2.g:662:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getComponent_ImplAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponent_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"blatt2.Blatt2.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getComponent_ImplAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalBlatt2.g:683:3: (otherlv_3= 'requiredInterface' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalBlatt2.g:684:4: otherlv_3= 'requiredInterface' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')'
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getComponent_ImplAccess().getRequiredInterfaceKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getComponent_ImplAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalBlatt2.g:692:4: ( ( ruleEString ) )
                    // InternalBlatt2.g:693:5: ( ruleEString )
                    {
                    // InternalBlatt2.g:693:5: ( ruleEString )
                    // InternalBlatt2.g:694:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getComponent_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getComponent_ImplAccess().getRequiredInterfaceInterfaceCrossReference_3_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBlatt2.g:708:4: (otherlv_6= ',' ( ( ruleEString ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==15) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalBlatt2.g:709:5: otherlv_6= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getComponent_ImplAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalBlatt2.g:713:5: ( ( ruleEString ) )
                    	    // InternalBlatt2.g:714:6: ( ruleEString )
                    	    {
                    	    // InternalBlatt2.g:714:6: ( ruleEString )
                    	    // InternalBlatt2.g:715:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getComponent_ImplRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getComponent_ImplAccess().getRequiredInterfaceInterfaceCrossReference_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
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

                    otherlv_8=(Token)match(input,16,FOLLOW_20); 

                    				newLeafNode(otherlv_8, grammarAccess.getComponent_ImplAccess().getRightParenthesisKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,29,FOLLOW_5); 

            			newLeafNode(otherlv_9, grammarAccess.getComponent_ImplAccess().getRequiredServiceKeyword_4());
            		
            otherlv_10=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_10, grammarAccess.getComponent_ImplAccess().getLeftParenthesisKeyword_5());
            		
            // InternalBlatt2.g:743:3: ( ( ruleEString ) )
            // InternalBlatt2.g:744:4: ( ruleEString )
            {
            // InternalBlatt2.g:744:4: ( ruleEString )
            // InternalBlatt2.g:745:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponent_ImplRule());
            					}
            				

            					newCompositeNode(grammarAccess.getComponent_ImplAccess().getRequiredServiceServiceCrossReference_6_0());
            				
            pushFollow(FOLLOW_7);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBlatt2.g:759:3: (otherlv_12= ',' ( ( ruleEString ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==15) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalBlatt2.g:760:4: otherlv_12= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_12=(Token)match(input,15,FOLLOW_6); 

            	    				newLeafNode(otherlv_12, grammarAccess.getComponent_ImplAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalBlatt2.g:764:4: ( ( ruleEString ) )
            	    // InternalBlatt2.g:765:5: ( ruleEString )
            	    {
            	    // InternalBlatt2.g:765:5: ( ruleEString )
            	    // InternalBlatt2.g:766:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getComponent_ImplRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getComponent_ImplAccess().getRequiredServiceServiceCrossReference_7_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
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

            otherlv_14=(Token)match(input,16,FOLLOW_21); 

            			newLeafNode(otherlv_14, grammarAccess.getComponent_ImplAccess().getRightParenthesisKeyword_8());
            		
            // InternalBlatt2.g:785:3: (otherlv_15= 'providedInterface' otherlv_16= '{' ( (lv_providedInterface_17_0= ruleInterface ) ) (otherlv_18= ',' ( (lv_providedInterface_19_0= ruleInterface ) ) )* otherlv_20= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==30) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalBlatt2.g:786:4: otherlv_15= 'providedInterface' otherlv_16= '{' ( (lv_providedInterface_17_0= ruleInterface ) ) (otherlv_18= ',' ( (lv_providedInterface_19_0= ruleInterface ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getComponent_ImplAccess().getProvidedInterfaceKeyword_9_0());
                    			
                    otherlv_16=(Token)match(input,12,FOLLOW_22); 

                    				newLeafNode(otherlv_16, grammarAccess.getComponent_ImplAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalBlatt2.g:794:4: ( (lv_providedInterface_17_0= ruleInterface ) )
                    // InternalBlatt2.g:795:5: (lv_providedInterface_17_0= ruleInterface )
                    {
                    // InternalBlatt2.g:795:5: (lv_providedInterface_17_0= ruleInterface )
                    // InternalBlatt2.g:796:6: lv_providedInterface_17_0= ruleInterface
                    {

                    						newCompositeNode(grammarAccess.getComponent_ImplAccess().getProvidedInterfaceInterfaceParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_providedInterface_17_0=ruleInterface();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponent_ImplRule());
                    						}
                    						add(
                    							current,
                    							"providedInterface",
                    							lv_providedInterface_17_0,
                    							"blatt2.Blatt2.Interface");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBlatt2.g:813:4: (otherlv_18= ',' ( (lv_providedInterface_19_0= ruleInterface ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==15) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalBlatt2.g:814:5: otherlv_18= ',' ( (lv_providedInterface_19_0= ruleInterface ) )
                    	    {
                    	    otherlv_18=(Token)match(input,15,FOLLOW_22); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getComponent_ImplAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalBlatt2.g:818:5: ( (lv_providedInterface_19_0= ruleInterface ) )
                    	    // InternalBlatt2.g:819:6: (lv_providedInterface_19_0= ruleInterface )
                    	    {
                    	    // InternalBlatt2.g:819:6: (lv_providedInterface_19_0= ruleInterface )
                    	    // InternalBlatt2.g:820:7: lv_providedInterface_19_0= ruleInterface
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponent_ImplAccess().getProvidedInterfaceInterfaceParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_providedInterface_19_0=ruleInterface();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponent_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"providedInterface",
                    	    								lv_providedInterface_19_0,
                    	    								"blatt2.Blatt2.Interface");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,18,FOLLOW_23); 

                    				newLeafNode(otherlv_20, grammarAccess.getComponent_ImplAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            otherlv_21=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_21, grammarAccess.getComponent_ImplAccess().getProvidedServiceKeyword_10());
            		
            otherlv_22=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_22, grammarAccess.getComponent_ImplAccess().getLeftCurlyBracketKeyword_11());
            		
            // InternalBlatt2.g:851:3: ( (lv_providedService_23_0= ruleService ) )
            // InternalBlatt2.g:852:4: (lv_providedService_23_0= ruleService )
            {
            // InternalBlatt2.g:852:4: (lv_providedService_23_0= ruleService )
            // InternalBlatt2.g:853:5: lv_providedService_23_0= ruleService
            {

            					newCompositeNode(grammarAccess.getComponent_ImplAccess().getProvidedServiceServiceParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_10);
            lv_providedService_23_0=ruleService();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponent_ImplRule());
            					}
            					add(
            						current,
            						"providedService",
            						lv_providedService_23_0,
            						"blatt2.Blatt2.Service");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBlatt2.g:870:3: (otherlv_24= ',' ( (lv_providedService_25_0= ruleService ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==15) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalBlatt2.g:871:4: otherlv_24= ',' ( (lv_providedService_25_0= ruleService ) )
            	    {
            	    otherlv_24=(Token)match(input,15,FOLLOW_24); 

            	    				newLeafNode(otherlv_24, grammarAccess.getComponent_ImplAccess().getCommaKeyword_13_0());
            	    			
            	    // InternalBlatt2.g:875:4: ( (lv_providedService_25_0= ruleService ) )
            	    // InternalBlatt2.g:876:5: (lv_providedService_25_0= ruleService )
            	    {
            	    // InternalBlatt2.g:876:5: (lv_providedService_25_0= ruleService )
            	    // InternalBlatt2.g:877:6: lv_providedService_25_0= ruleService
            	    {

            	    						newCompositeNode(grammarAccess.getComponent_ImplAccess().getProvidedServiceServiceParserRuleCall_13_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_providedService_25_0=ruleService();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComponent_ImplRule());
            	    						}
            	    						add(
            	    							current,
            	    							"providedService",
            	    							lv_providedService_25_0,
            	    							"blatt2.Blatt2.Service");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_26=(Token)match(input,18,FOLLOW_25); 

            			newLeafNode(otherlv_26, grammarAccess.getComponent_ImplAccess().getRightCurlyBracketKeyword_14());
            		
            otherlv_27=(Token)match(input,32,FOLLOW_26); 

            			newLeafNode(otherlv_27, grammarAccess.getComponent_ImplAccess().getBehaviourDescriptionKeyword_15());
            		
            // InternalBlatt2.g:903:3: ( (lv_behaviourDescription_28_0= ruleBehaviorDescription ) )
            // InternalBlatt2.g:904:4: (lv_behaviourDescription_28_0= ruleBehaviorDescription )
            {
            // InternalBlatt2.g:904:4: (lv_behaviourDescription_28_0= ruleBehaviorDescription )
            // InternalBlatt2.g:905:5: lv_behaviourDescription_28_0= ruleBehaviorDescription
            {

            					newCompositeNode(grammarAccess.getComponent_ImplAccess().getBehaviourDescriptionBehaviorDescriptionParserRuleCall_16_0());
            				
            pushFollow(FOLLOW_11);
            lv_behaviourDescription_28_0=ruleBehaviorDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponent_ImplRule());
            					}
            					set(
            						current,
            						"behaviourDescription",
            						lv_behaviourDescription_28_0,
            						"blatt2.Blatt2.BehaviorDescription");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_29=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_29, grammarAccess.getComponent_ImplAccess().getRightCurlyBracketKeyword_17());
            		

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


    // $ANTLR start "entryRuleInterface"
    // InternalBlatt2.g:930:1: entryRuleInterface returns [EObject current=null] : iv_ruleInterface= ruleInterface EOF ;
    public final EObject entryRuleInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface = null;


        try {
            // InternalBlatt2.g:930:50: (iv_ruleInterface= ruleInterface EOF )
            // InternalBlatt2.g:931:2: iv_ruleInterface= ruleInterface EOF
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
    // InternalBlatt2.g:937:1: ruleInterface returns [EObject current=null] : (otherlv_0= 'Interface' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'signature' otherlv_4= '{' ( (lv_signature_5_0= ruleSignature ) ) (otherlv_6= ',' ( (lv_signature_7_0= ruleSignature ) ) )* otherlv_8= '}' otherlv_9= '}' ) ;
    public final EObject ruleInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_signature_5_0 = null;

        EObject lv_signature_7_0 = null;



        	enterRule();

        try {
            // InternalBlatt2.g:943:2: ( (otherlv_0= 'Interface' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'signature' otherlv_4= '{' ( (lv_signature_5_0= ruleSignature ) ) (otherlv_6= ',' ( (lv_signature_7_0= ruleSignature ) ) )* otherlv_8= '}' otherlv_9= '}' ) )
            // InternalBlatt2.g:944:2: (otherlv_0= 'Interface' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'signature' otherlv_4= '{' ( (lv_signature_5_0= ruleSignature ) ) (otherlv_6= ',' ( (lv_signature_7_0= ruleSignature ) ) )* otherlv_8= '}' otherlv_9= '}' )
            {
            // InternalBlatt2.g:944:2: (otherlv_0= 'Interface' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'signature' otherlv_4= '{' ( (lv_signature_5_0= ruleSignature ) ) (otherlv_6= ',' ( (lv_signature_7_0= ruleSignature ) ) )* otherlv_8= '}' otherlv_9= '}' )
            // InternalBlatt2.g:945:3: otherlv_0= 'Interface' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'signature' otherlv_4= '{' ( (lv_signature_5_0= ruleSignature ) ) (otherlv_6= ',' ( (lv_signature_7_0= ruleSignature ) ) )* otherlv_8= '}' otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getInterfaceAccess().getInterfaceKeyword_0());
            		
            // InternalBlatt2.g:949:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBlatt2.g:950:4: (lv_name_1_0= ruleEString )
            {
            // InternalBlatt2.g:950:4: (lv_name_1_0= ruleEString )
            // InternalBlatt2.g:951:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInterfaceAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInterfaceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"blatt2.Blatt2.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getInterfaceAccess().getSignatureKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_28); 

            			newLeafNode(otherlv_4, grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalBlatt2.g:980:3: ( (lv_signature_5_0= ruleSignature ) )
            // InternalBlatt2.g:981:4: (lv_signature_5_0= ruleSignature )
            {
            // InternalBlatt2.g:981:4: (lv_signature_5_0= ruleSignature )
            // InternalBlatt2.g:982:5: lv_signature_5_0= ruleSignature
            {

            					newCompositeNode(grammarAccess.getInterfaceAccess().getSignatureSignatureParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_10);
            lv_signature_5_0=ruleSignature();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInterfaceRule());
            					}
            					add(
            						current,
            						"signature",
            						lv_signature_5_0,
            						"blatt2.Blatt2.Signature");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBlatt2.g:999:3: (otherlv_6= ',' ( (lv_signature_7_0= ruleSignature ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==15) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalBlatt2.g:1000:4: otherlv_6= ',' ( (lv_signature_7_0= ruleSignature ) )
            	    {
            	    otherlv_6=(Token)match(input,15,FOLLOW_28); 

            	    				newLeafNode(otherlv_6, grammarAccess.getInterfaceAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalBlatt2.g:1004:4: ( (lv_signature_7_0= ruleSignature ) )
            	    // InternalBlatt2.g:1005:5: (lv_signature_7_0= ruleSignature )
            	    {
            	    // InternalBlatt2.g:1005:5: (lv_signature_7_0= ruleSignature )
            	    // InternalBlatt2.g:1006:6: lv_signature_7_0= ruleSignature
            	    {

            	    						newCompositeNode(grammarAccess.getInterfaceAccess().getSignatureSignatureParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_signature_7_0=ruleSignature();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getInterfaceRule());
            	    						}
            	    						add(
            	    							current,
            	    							"signature",
            	    							lv_signature_7_0,
            	    							"blatt2.Blatt2.Signature");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_8=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_8, grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_7());
            		
            otherlv_9=(Token)match(input,18,FOLLOW_2); 

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


    // $ANTLR start "entryRuleService"
    // InternalBlatt2.g:1036:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // InternalBlatt2.g:1036:48: (iv_ruleService= ruleService EOF )
            // InternalBlatt2.g:1037:2: iv_ruleService= ruleService EOF
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
    // InternalBlatt2.g:1043:1: ruleService returns [EObject current=null] : (otherlv_0= 'Service' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'correspondingSignature' otherlv_4= '{' ( (lv_correspondingSignature_5_0= ruleSignature ) ) (otherlv_6= ',' ( (lv_correspondingSignature_7_0= ruleSignature ) ) )* otherlv_8= '}' otherlv_9= '}' ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_correspondingSignature_5_0 = null;

        EObject lv_correspondingSignature_7_0 = null;



        	enterRule();

        try {
            // InternalBlatt2.g:1049:2: ( (otherlv_0= 'Service' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'correspondingSignature' otherlv_4= '{' ( (lv_correspondingSignature_5_0= ruleSignature ) ) (otherlv_6= ',' ( (lv_correspondingSignature_7_0= ruleSignature ) ) )* otherlv_8= '}' otherlv_9= '}' ) )
            // InternalBlatt2.g:1050:2: (otherlv_0= 'Service' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'correspondingSignature' otherlv_4= '{' ( (lv_correspondingSignature_5_0= ruleSignature ) ) (otherlv_6= ',' ( (lv_correspondingSignature_7_0= ruleSignature ) ) )* otherlv_8= '}' otherlv_9= '}' )
            {
            // InternalBlatt2.g:1050:2: (otherlv_0= 'Service' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'correspondingSignature' otherlv_4= '{' ( (lv_correspondingSignature_5_0= ruleSignature ) ) (otherlv_6= ',' ( (lv_correspondingSignature_7_0= ruleSignature ) ) )* otherlv_8= '}' otherlv_9= '}' )
            // InternalBlatt2.g:1051:3: otherlv_0= 'Service' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'correspondingSignature' otherlv_4= '{' ( (lv_correspondingSignature_5_0= ruleSignature ) ) (otherlv_6= ',' ( (lv_correspondingSignature_7_0= ruleSignature ) ) )* otherlv_8= '}' otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceAccess().getServiceKeyword_0());
            		
            // InternalBlatt2.g:1055:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBlatt2.g:1056:4: (lv_name_1_0= ruleEString )
            {
            // InternalBlatt2.g:1056:4: (lv_name_1_0= ruleEString )
            // InternalBlatt2.g:1057:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getServiceAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServiceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"blatt2.Blatt2.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getServiceAccess().getCorrespondingSignatureKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_28); 

            			newLeafNode(otherlv_4, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalBlatt2.g:1086:3: ( (lv_correspondingSignature_5_0= ruleSignature ) )
            // InternalBlatt2.g:1087:4: (lv_correspondingSignature_5_0= ruleSignature )
            {
            // InternalBlatt2.g:1087:4: (lv_correspondingSignature_5_0= ruleSignature )
            // InternalBlatt2.g:1088:5: lv_correspondingSignature_5_0= ruleSignature
            {

            					newCompositeNode(grammarAccess.getServiceAccess().getCorrespondingSignatureSignatureParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_10);
            lv_correspondingSignature_5_0=ruleSignature();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServiceRule());
            					}
            					add(
            						current,
            						"correspondingSignature",
            						lv_correspondingSignature_5_0,
            						"blatt2.Blatt2.Signature");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBlatt2.g:1105:3: (otherlv_6= ',' ( (lv_correspondingSignature_7_0= ruleSignature ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==15) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalBlatt2.g:1106:4: otherlv_6= ',' ( (lv_correspondingSignature_7_0= ruleSignature ) )
            	    {
            	    otherlv_6=(Token)match(input,15,FOLLOW_28); 

            	    				newLeafNode(otherlv_6, grammarAccess.getServiceAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalBlatt2.g:1110:4: ( (lv_correspondingSignature_7_0= ruleSignature ) )
            	    // InternalBlatt2.g:1111:5: (lv_correspondingSignature_7_0= ruleSignature )
            	    {
            	    // InternalBlatt2.g:1111:5: (lv_correspondingSignature_7_0= ruleSignature )
            	    // InternalBlatt2.g:1112:6: lv_correspondingSignature_7_0= ruleSignature
            	    {

            	    						newCompositeNode(grammarAccess.getServiceAccess().getCorrespondingSignatureSignatureParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_correspondingSignature_7_0=ruleSignature();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getServiceRule());
            	    						}
            	    						add(
            	    							current,
            	    							"correspondingSignature",
            	    							lv_correspondingSignature_7_0,
            	    							"blatt2.Blatt2.Signature");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_8=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_8, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_7());
            		
            otherlv_9=(Token)match(input,18,FOLLOW_2); 

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


    // $ANTLR start "entryRuleBehaviorDescription"
    // InternalBlatt2.g:1142:1: entryRuleBehaviorDescription returns [EObject current=null] : iv_ruleBehaviorDescription= ruleBehaviorDescription EOF ;
    public final EObject entryRuleBehaviorDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviorDescription = null;


        try {
            // InternalBlatt2.g:1142:60: (iv_ruleBehaviorDescription= ruleBehaviorDescription EOF )
            // InternalBlatt2.g:1143:2: iv_ruleBehaviorDescription= ruleBehaviorDescription EOF
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
    // InternalBlatt2.g:1149:1: ruleBehaviorDescription returns [EObject current=null] : ( () otherlv_1= 'BehaviorDescription' otherlv_2= '{' (otherlv_3= 'calledServices' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'internalActions' ( (lv_internalActions_10_0= ruleInternalAction ) ) )? (otherlv_11= 'loops' ( (lv_loops_12_0= ruleLoop ) ) )? (otherlv_13= 'branches' ( (lv_branches_14_0= ruleBranch ) ) )? otherlv_15= '}' ) ;
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
            // InternalBlatt2.g:1155:2: ( ( () otherlv_1= 'BehaviorDescription' otherlv_2= '{' (otherlv_3= 'calledServices' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'internalActions' ( (lv_internalActions_10_0= ruleInternalAction ) ) )? (otherlv_11= 'loops' ( (lv_loops_12_0= ruleLoop ) ) )? (otherlv_13= 'branches' ( (lv_branches_14_0= ruleBranch ) ) )? otherlv_15= '}' ) )
            // InternalBlatt2.g:1156:2: ( () otherlv_1= 'BehaviorDescription' otherlv_2= '{' (otherlv_3= 'calledServices' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'internalActions' ( (lv_internalActions_10_0= ruleInternalAction ) ) )? (otherlv_11= 'loops' ( (lv_loops_12_0= ruleLoop ) ) )? (otherlv_13= 'branches' ( (lv_branches_14_0= ruleBranch ) ) )? otherlv_15= '}' )
            {
            // InternalBlatt2.g:1156:2: ( () otherlv_1= 'BehaviorDescription' otherlv_2= '{' (otherlv_3= 'calledServices' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'internalActions' ( (lv_internalActions_10_0= ruleInternalAction ) ) )? (otherlv_11= 'loops' ( (lv_loops_12_0= ruleLoop ) ) )? (otherlv_13= 'branches' ( (lv_branches_14_0= ruleBranch ) ) )? otherlv_15= '}' )
            // InternalBlatt2.g:1157:3: () otherlv_1= 'BehaviorDescription' otherlv_2= '{' (otherlv_3= 'calledServices' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'internalActions' ( (lv_internalActions_10_0= ruleInternalAction ) ) )? (otherlv_11= 'loops' ( (lv_loops_12_0= ruleLoop ) ) )? (otherlv_13= 'branches' ( (lv_branches_14_0= ruleBranch ) ) )? otherlv_15= '}'
            {
            // InternalBlatt2.g:1157:3: ()
            // InternalBlatt2.g:1158:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBehaviorDescriptionAccess().getBehaviorDescriptionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBehaviorDescriptionAccess().getBehaviorDescriptionKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getBehaviorDescriptionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalBlatt2.g:1172:3: (otherlv_3= 'calledServices' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==38) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalBlatt2.g:1173:4: otherlv_3= 'calledServices' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')'
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getBehaviorDescriptionAccess().getCalledServicesKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getBehaviorDescriptionAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalBlatt2.g:1181:4: ( ( ruleEString ) )
                    // InternalBlatt2.g:1182:5: ( ruleEString )
                    {
                    // InternalBlatt2.g:1182:5: ( ruleEString )
                    // InternalBlatt2.g:1183:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBehaviorDescriptionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getBehaviorDescriptionAccess().getCalledServicesServiceCrossReference_3_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBlatt2.g:1197:4: (otherlv_6= ',' ( ( ruleEString ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==15) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalBlatt2.g:1198:5: otherlv_6= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getBehaviorDescriptionAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalBlatt2.g:1202:5: ( ( ruleEString ) )
                    	    // InternalBlatt2.g:1203:6: ( ruleEString )
                    	    {
                    	    // InternalBlatt2.g:1203:6: ( ruleEString )
                    	    // InternalBlatt2.g:1204:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getBehaviorDescriptionRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getBehaviorDescriptionAccess().getCalledServicesServiceCrossReference_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,16,FOLLOW_31); 

                    				newLeafNode(otherlv_8, grammarAccess.getBehaviorDescriptionAccess().getRightParenthesisKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalBlatt2.g:1224:3: (otherlv_9= 'internalActions' ( (lv_internalActions_10_0= ruleInternalAction ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==39) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalBlatt2.g:1225:4: otherlv_9= 'internalActions' ( (lv_internalActions_10_0= ruleInternalAction ) )
                    {
                    otherlv_9=(Token)match(input,39,FOLLOW_32); 

                    				newLeafNode(otherlv_9, grammarAccess.getBehaviorDescriptionAccess().getInternalActionsKeyword_4_0());
                    			
                    // InternalBlatt2.g:1229:4: ( (lv_internalActions_10_0= ruleInternalAction ) )
                    // InternalBlatt2.g:1230:5: (lv_internalActions_10_0= ruleInternalAction )
                    {
                    // InternalBlatt2.g:1230:5: (lv_internalActions_10_0= ruleInternalAction )
                    // InternalBlatt2.g:1231:6: lv_internalActions_10_0= ruleInternalAction
                    {

                    						newCompositeNode(grammarAccess.getBehaviorDescriptionAccess().getInternalActionsInternalActionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_internalActions_10_0=ruleInternalAction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBehaviorDescriptionRule());
                    						}
                    						set(
                    							current,
                    							"internalActions",
                    							lv_internalActions_10_0,
                    							"blatt2.Blatt2.InternalAction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBlatt2.g:1249:3: (otherlv_11= 'loops' ( (lv_loops_12_0= ruleLoop ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==40) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalBlatt2.g:1250:4: otherlv_11= 'loops' ( (lv_loops_12_0= ruleLoop ) )
                    {
                    otherlv_11=(Token)match(input,40,FOLLOW_34); 

                    				newLeafNode(otherlv_11, grammarAccess.getBehaviorDescriptionAccess().getLoopsKeyword_5_0());
                    			
                    // InternalBlatt2.g:1254:4: ( (lv_loops_12_0= ruleLoop ) )
                    // InternalBlatt2.g:1255:5: (lv_loops_12_0= ruleLoop )
                    {
                    // InternalBlatt2.g:1255:5: (lv_loops_12_0= ruleLoop )
                    // InternalBlatt2.g:1256:6: lv_loops_12_0= ruleLoop
                    {

                    						newCompositeNode(grammarAccess.getBehaviorDescriptionAccess().getLoopsLoopParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_loops_12_0=ruleLoop();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBehaviorDescriptionRule());
                    						}
                    						set(
                    							current,
                    							"loops",
                    							lv_loops_12_0,
                    							"blatt2.Blatt2.Loop");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBlatt2.g:1274:3: (otherlv_13= 'branches' ( (lv_branches_14_0= ruleBranch ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==41) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalBlatt2.g:1275:4: otherlv_13= 'branches' ( (lv_branches_14_0= ruleBranch ) )
                    {
                    otherlv_13=(Token)match(input,41,FOLLOW_36); 

                    				newLeafNode(otherlv_13, grammarAccess.getBehaviorDescriptionAccess().getBranchesKeyword_6_0());
                    			
                    // InternalBlatt2.g:1279:4: ( (lv_branches_14_0= ruleBranch ) )
                    // InternalBlatt2.g:1280:5: (lv_branches_14_0= ruleBranch )
                    {
                    // InternalBlatt2.g:1280:5: (lv_branches_14_0= ruleBranch )
                    // InternalBlatt2.g:1281:6: lv_branches_14_0= ruleBranch
                    {

                    						newCompositeNode(grammarAccess.getBehaviorDescriptionAccess().getBranchesBranchParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_branches_14_0=ruleBranch();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBehaviorDescriptionRule());
                    						}
                    						set(
                    							current,
                    							"branches",
                    							lv_branches_14_0,
                    							"blatt2.Blatt2.Branch");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,18,FOLLOW_2); 

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
    // InternalBlatt2.g:1307:1: entryRuleCompositeComponent returns [EObject current=null] : iv_ruleCompositeComponent= ruleCompositeComponent EOF ;
    public final EObject entryRuleCompositeComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeComponent = null;


        try {
            // InternalBlatt2.g:1307:59: (iv_ruleCompositeComponent= ruleCompositeComponent EOF )
            // InternalBlatt2.g:1308:2: iv_ruleCompositeComponent= ruleCompositeComponent EOF
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
    // InternalBlatt2.g:1314:1: ruleCompositeComponent returns [EObject current=null] : (otherlv_0= 'CompositeComponent' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'requiredInterface' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= 'requiredService' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' (otherlv_15= 'providedInterface' otherlv_16= '{' ( (lv_providedInterface_17_0= ruleInterface ) ) (otherlv_18= ',' ( (lv_providedInterface_19_0= ruleInterface ) ) )* otherlv_20= '}' )? otherlv_21= 'providedService' otherlv_22= '{' ( (lv_providedService_23_0= ruleService ) ) (otherlv_24= ',' ( (lv_providedService_25_0= ruleService ) ) )* otherlv_26= '}' otherlv_27= 'behaviourDescription' ( (lv_behaviourDescription_28_0= ruleBehaviorDescription ) ) otherlv_29= 'encapsulatedAssemblyContext' ( (lv_encapsulatedAssemblyContext_30_0= ruleAssemblyContext ) ) otherlv_31= '}' ) ;
    public final EObject ruleCompositeComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
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
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_providedInterface_17_0 = null;

        EObject lv_providedInterface_19_0 = null;

        EObject lv_providedService_23_0 = null;

        EObject lv_providedService_25_0 = null;

        EObject lv_behaviourDescription_28_0 = null;

        EObject lv_encapsulatedAssemblyContext_30_0 = null;



        	enterRule();

        try {
            // InternalBlatt2.g:1320:2: ( (otherlv_0= 'CompositeComponent' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'requiredInterface' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= 'requiredService' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' (otherlv_15= 'providedInterface' otherlv_16= '{' ( (lv_providedInterface_17_0= ruleInterface ) ) (otherlv_18= ',' ( (lv_providedInterface_19_0= ruleInterface ) ) )* otherlv_20= '}' )? otherlv_21= 'providedService' otherlv_22= '{' ( (lv_providedService_23_0= ruleService ) ) (otherlv_24= ',' ( (lv_providedService_25_0= ruleService ) ) )* otherlv_26= '}' otherlv_27= 'behaviourDescription' ( (lv_behaviourDescription_28_0= ruleBehaviorDescription ) ) otherlv_29= 'encapsulatedAssemblyContext' ( (lv_encapsulatedAssemblyContext_30_0= ruleAssemblyContext ) ) otherlv_31= '}' ) )
            // InternalBlatt2.g:1321:2: (otherlv_0= 'CompositeComponent' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'requiredInterface' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= 'requiredService' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' (otherlv_15= 'providedInterface' otherlv_16= '{' ( (lv_providedInterface_17_0= ruleInterface ) ) (otherlv_18= ',' ( (lv_providedInterface_19_0= ruleInterface ) ) )* otherlv_20= '}' )? otherlv_21= 'providedService' otherlv_22= '{' ( (lv_providedService_23_0= ruleService ) ) (otherlv_24= ',' ( (lv_providedService_25_0= ruleService ) ) )* otherlv_26= '}' otherlv_27= 'behaviourDescription' ( (lv_behaviourDescription_28_0= ruleBehaviorDescription ) ) otherlv_29= 'encapsulatedAssemblyContext' ( (lv_encapsulatedAssemblyContext_30_0= ruleAssemblyContext ) ) otherlv_31= '}' )
            {
            // InternalBlatt2.g:1321:2: (otherlv_0= 'CompositeComponent' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'requiredInterface' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= 'requiredService' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' (otherlv_15= 'providedInterface' otherlv_16= '{' ( (lv_providedInterface_17_0= ruleInterface ) ) (otherlv_18= ',' ( (lv_providedInterface_19_0= ruleInterface ) ) )* otherlv_20= '}' )? otherlv_21= 'providedService' otherlv_22= '{' ( (lv_providedService_23_0= ruleService ) ) (otherlv_24= ',' ( (lv_providedService_25_0= ruleService ) ) )* otherlv_26= '}' otherlv_27= 'behaviourDescription' ( (lv_behaviourDescription_28_0= ruleBehaviorDescription ) ) otherlv_29= 'encapsulatedAssemblyContext' ( (lv_encapsulatedAssemblyContext_30_0= ruleAssemblyContext ) ) otherlv_31= '}' )
            // InternalBlatt2.g:1322:3: otherlv_0= 'CompositeComponent' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'requiredInterface' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= 'requiredService' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' (otherlv_15= 'providedInterface' otherlv_16= '{' ( (lv_providedInterface_17_0= ruleInterface ) ) (otherlv_18= ',' ( (lv_providedInterface_19_0= ruleInterface ) ) )* otherlv_20= '}' )? otherlv_21= 'providedService' otherlv_22= '{' ( (lv_providedService_23_0= ruleService ) ) (otherlv_24= ',' ( (lv_providedService_25_0= ruleService ) ) )* otherlv_26= '}' otherlv_27= 'behaviourDescription' ( (lv_behaviourDescription_28_0= ruleBehaviorDescription ) ) otherlv_29= 'encapsulatedAssemblyContext' ( (lv_encapsulatedAssemblyContext_30_0= ruleAssemblyContext ) ) otherlv_31= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getCompositeComponentAccess().getCompositeComponentKeyword_0());
            		
            // InternalBlatt2.g:1326:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBlatt2.g:1327:4: (lv_name_1_0= ruleEString )
            {
            // InternalBlatt2.g:1327:4: (lv_name_1_0= ruleEString )
            // InternalBlatt2.g:1328:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCompositeComponentAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"blatt2.Blatt2.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalBlatt2.g:1349:3: (otherlv_3= 'requiredInterface' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==28) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalBlatt2.g:1350:4: otherlv_3= 'requiredInterface' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')'
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getCompositeComponentAccess().getRequiredInterfaceKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getCompositeComponentAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalBlatt2.g:1358:4: ( ( ruleEString ) )
                    // InternalBlatt2.g:1359:5: ( ruleEString )
                    {
                    // InternalBlatt2.g:1359:5: ( ruleEString )
                    // InternalBlatt2.g:1360:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCompositeComponentRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getCompositeComponentAccess().getRequiredInterfaceInterfaceCrossReference_3_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBlatt2.g:1374:4: (otherlv_6= ',' ( ( ruleEString ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==15) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalBlatt2.g:1375:5: otherlv_6= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getCompositeComponentAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalBlatt2.g:1379:5: ( ( ruleEString ) )
                    	    // InternalBlatt2.g:1380:6: ( ruleEString )
                    	    {
                    	    // InternalBlatt2.g:1380:6: ( ruleEString )
                    	    // InternalBlatt2.g:1381:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getCompositeComponentRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getCompositeComponentAccess().getRequiredInterfaceInterfaceCrossReference_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
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

                    otherlv_8=(Token)match(input,16,FOLLOW_20); 

                    				newLeafNode(otherlv_8, grammarAccess.getCompositeComponentAccess().getRightParenthesisKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,29,FOLLOW_5); 

            			newLeafNode(otherlv_9, grammarAccess.getCompositeComponentAccess().getRequiredServiceKeyword_4());
            		
            otherlv_10=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_10, grammarAccess.getCompositeComponentAccess().getLeftParenthesisKeyword_5());
            		
            // InternalBlatt2.g:1409:3: ( ( ruleEString ) )
            // InternalBlatt2.g:1410:4: ( ruleEString )
            {
            // InternalBlatt2.g:1410:4: ( ruleEString )
            // InternalBlatt2.g:1411:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompositeComponentRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCompositeComponentAccess().getRequiredServiceServiceCrossReference_6_0());
            				
            pushFollow(FOLLOW_7);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBlatt2.g:1425:3: (otherlv_12= ',' ( ( ruleEString ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==15) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalBlatt2.g:1426:4: otherlv_12= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_12=(Token)match(input,15,FOLLOW_6); 

            	    				newLeafNode(otherlv_12, grammarAccess.getCompositeComponentAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalBlatt2.g:1430:4: ( ( ruleEString ) )
            	    // InternalBlatt2.g:1431:5: ( ruleEString )
            	    {
            	    // InternalBlatt2.g:1431:5: ( ruleEString )
            	    // InternalBlatt2.g:1432:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getCompositeComponentRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getCompositeComponentAccess().getRequiredServiceServiceCrossReference_7_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
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

            otherlv_14=(Token)match(input,16,FOLLOW_21); 

            			newLeafNode(otherlv_14, grammarAccess.getCompositeComponentAccess().getRightParenthesisKeyword_8());
            		
            // InternalBlatt2.g:1451:3: (otherlv_15= 'providedInterface' otherlv_16= '{' ( (lv_providedInterface_17_0= ruleInterface ) ) (otherlv_18= ',' ( (lv_providedInterface_19_0= ruleInterface ) ) )* otherlv_20= '}' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==30) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalBlatt2.g:1452:4: otherlv_15= 'providedInterface' otherlv_16= '{' ( (lv_providedInterface_17_0= ruleInterface ) ) (otherlv_18= ',' ( (lv_providedInterface_19_0= ruleInterface ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getCompositeComponentAccess().getProvidedInterfaceKeyword_9_0());
                    			
                    otherlv_16=(Token)match(input,12,FOLLOW_22); 

                    				newLeafNode(otherlv_16, grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalBlatt2.g:1460:4: ( (lv_providedInterface_17_0= ruleInterface ) )
                    // InternalBlatt2.g:1461:5: (lv_providedInterface_17_0= ruleInterface )
                    {
                    // InternalBlatt2.g:1461:5: (lv_providedInterface_17_0= ruleInterface )
                    // InternalBlatt2.g:1462:6: lv_providedInterface_17_0= ruleInterface
                    {

                    						newCompositeNode(grammarAccess.getCompositeComponentAccess().getProvidedInterfaceInterfaceParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_providedInterface_17_0=ruleInterface();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
                    						}
                    						add(
                    							current,
                    							"providedInterface",
                    							lv_providedInterface_17_0,
                    							"blatt2.Blatt2.Interface");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBlatt2.g:1479:4: (otherlv_18= ',' ( (lv_providedInterface_19_0= ruleInterface ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==15) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalBlatt2.g:1480:5: otherlv_18= ',' ( (lv_providedInterface_19_0= ruleInterface ) )
                    	    {
                    	    otherlv_18=(Token)match(input,15,FOLLOW_22); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getCompositeComponentAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalBlatt2.g:1484:5: ( (lv_providedInterface_19_0= ruleInterface ) )
                    	    // InternalBlatt2.g:1485:6: (lv_providedInterface_19_0= ruleInterface )
                    	    {
                    	    // InternalBlatt2.g:1485:6: (lv_providedInterface_19_0= ruleInterface )
                    	    // InternalBlatt2.g:1486:7: lv_providedInterface_19_0= ruleInterface
                    	    {

                    	    							newCompositeNode(grammarAccess.getCompositeComponentAccess().getProvidedInterfaceInterfaceParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_providedInterface_19_0=ruleInterface();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"providedInterface",
                    	    								lv_providedInterface_19_0,
                    	    								"blatt2.Blatt2.Interface");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,18,FOLLOW_23); 

                    				newLeafNode(otherlv_20, grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            otherlv_21=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_21, grammarAccess.getCompositeComponentAccess().getProvidedServiceKeyword_10());
            		
            otherlv_22=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_22, grammarAccess.getCompositeComponentAccess().getLeftCurlyBracketKeyword_11());
            		
            // InternalBlatt2.g:1517:3: ( (lv_providedService_23_0= ruleService ) )
            // InternalBlatt2.g:1518:4: (lv_providedService_23_0= ruleService )
            {
            // InternalBlatt2.g:1518:4: (lv_providedService_23_0= ruleService )
            // InternalBlatt2.g:1519:5: lv_providedService_23_0= ruleService
            {

            					newCompositeNode(grammarAccess.getCompositeComponentAccess().getProvidedServiceServiceParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_10);
            lv_providedService_23_0=ruleService();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
            					}
            					add(
            						current,
            						"providedService",
            						lv_providedService_23_0,
            						"blatt2.Blatt2.Service");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBlatt2.g:1536:3: (otherlv_24= ',' ( (lv_providedService_25_0= ruleService ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==15) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalBlatt2.g:1537:4: otherlv_24= ',' ( (lv_providedService_25_0= ruleService ) )
            	    {
            	    otherlv_24=(Token)match(input,15,FOLLOW_24); 

            	    				newLeafNode(otherlv_24, grammarAccess.getCompositeComponentAccess().getCommaKeyword_13_0());
            	    			
            	    // InternalBlatt2.g:1541:4: ( (lv_providedService_25_0= ruleService ) )
            	    // InternalBlatt2.g:1542:5: (lv_providedService_25_0= ruleService )
            	    {
            	    // InternalBlatt2.g:1542:5: (lv_providedService_25_0= ruleService )
            	    // InternalBlatt2.g:1543:6: lv_providedService_25_0= ruleService
            	    {

            	    						newCompositeNode(grammarAccess.getCompositeComponentAccess().getProvidedServiceServiceParserRuleCall_13_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_providedService_25_0=ruleService();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
            	    						}
            	    						add(
            	    							current,
            	    							"providedService",
            	    							lv_providedService_25_0,
            	    							"blatt2.Blatt2.Service");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            otherlv_26=(Token)match(input,18,FOLLOW_25); 

            			newLeafNode(otherlv_26, grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_14());
            		
            otherlv_27=(Token)match(input,32,FOLLOW_26); 

            			newLeafNode(otherlv_27, grammarAccess.getCompositeComponentAccess().getBehaviourDescriptionKeyword_15());
            		
            // InternalBlatt2.g:1569:3: ( (lv_behaviourDescription_28_0= ruleBehaviorDescription ) )
            // InternalBlatt2.g:1570:4: (lv_behaviourDescription_28_0= ruleBehaviorDescription )
            {
            // InternalBlatt2.g:1570:4: (lv_behaviourDescription_28_0= ruleBehaviorDescription )
            // InternalBlatt2.g:1571:5: lv_behaviourDescription_28_0= ruleBehaviorDescription
            {

            					newCompositeNode(grammarAccess.getCompositeComponentAccess().getBehaviourDescriptionBehaviorDescriptionParserRuleCall_16_0());
            				
            pushFollow(FOLLOW_37);
            lv_behaviourDescription_28_0=ruleBehaviorDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
            					}
            					set(
            						current,
            						"behaviourDescription",
            						lv_behaviourDescription_28_0,
            						"blatt2.Blatt2.BehaviorDescription");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_29=(Token)match(input,43,FOLLOW_38); 

            			newLeafNode(otherlv_29, grammarAccess.getCompositeComponentAccess().getEncapsulatedAssemblyContextKeyword_17());
            		
            // InternalBlatt2.g:1592:3: ( (lv_encapsulatedAssemblyContext_30_0= ruleAssemblyContext ) )
            // InternalBlatt2.g:1593:4: (lv_encapsulatedAssemblyContext_30_0= ruleAssemblyContext )
            {
            // InternalBlatt2.g:1593:4: (lv_encapsulatedAssemblyContext_30_0= ruleAssemblyContext )
            // InternalBlatt2.g:1594:5: lv_encapsulatedAssemblyContext_30_0= ruleAssemblyContext
            {

            					newCompositeNode(grammarAccess.getCompositeComponentAccess().getEncapsulatedAssemblyContextAssemblyContextParserRuleCall_18_0());
            				
            pushFollow(FOLLOW_11);
            lv_encapsulatedAssemblyContext_30_0=ruleAssemblyContext();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositeComponentRule());
            					}
            					set(
            						current,
            						"encapsulatedAssemblyContext",
            						lv_encapsulatedAssemblyContext_30_0,
            						"blatt2.Blatt2.AssemblyContext");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_31=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_31, grammarAccess.getCompositeComponentAccess().getRightCurlyBracketKeyword_19());
            		

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


    // $ANTLR start "entryRuleSignature"
    // InternalBlatt2.g:1619:1: entryRuleSignature returns [EObject current=null] : iv_ruleSignature= ruleSignature EOF ;
    public final EObject entryRuleSignature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignature = null;


        try {
            // InternalBlatt2.g:1619:50: (iv_ruleSignature= ruleSignature EOF )
            // InternalBlatt2.g:1620:2: iv_ruleSignature= ruleSignature EOF
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
    // InternalBlatt2.g:1626:1: ruleSignature returns [EObject current=null] : (otherlv_0= 'Signature' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'returnType' ( ( ruleEString ) ) (otherlv_5= 'parameterType' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= '}' ) ;
    public final EObject ruleSignature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalBlatt2.g:1632:2: ( (otherlv_0= 'Signature' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'returnType' ( ( ruleEString ) ) (otherlv_5= 'parameterType' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= '}' ) )
            // InternalBlatt2.g:1633:2: (otherlv_0= 'Signature' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'returnType' ( ( ruleEString ) ) (otherlv_5= 'parameterType' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= '}' )
            {
            // InternalBlatt2.g:1633:2: (otherlv_0= 'Signature' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'returnType' ( ( ruleEString ) ) (otherlv_5= 'parameterType' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= '}' )
            // InternalBlatt2.g:1634:3: otherlv_0= 'Signature' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'returnType' ( ( ruleEString ) ) (otherlv_5= 'parameterType' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getSignatureAccess().getSignatureKeyword_0());
            		
            // InternalBlatt2.g:1638:3: ( (lv_name_1_0= ruleEString ) )
            // InternalBlatt2.g:1639:4: (lv_name_1_0= ruleEString )
            {
            // InternalBlatt2.g:1639:4: (lv_name_1_0= ruleEString )
            // InternalBlatt2.g:1640:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSignatureAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSignatureRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"blatt2.Blatt2.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getSignatureAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,45,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getSignatureAccess().getReturnTypeKeyword_3());
            		
            // InternalBlatt2.g:1665:3: ( ( ruleEString ) )
            // InternalBlatt2.g:1666:4: ( ruleEString )
            {
            // InternalBlatt2.g:1666:4: ( ruleEString )
            // InternalBlatt2.g:1667:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSignatureRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSignatureAccess().getReturnTypeTypeCrossReference_4_0());
            				
            pushFollow(FOLLOW_40);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBlatt2.g:1681:3: (otherlv_5= 'parameterType' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==46) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalBlatt2.g:1682:4: otherlv_5= 'parameterType' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,46,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getSignatureAccess().getParameterTypeKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_6, grammarAccess.getSignatureAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalBlatt2.g:1690:4: ( ( ruleEString ) )
                    // InternalBlatt2.g:1691:5: ( ruleEString )
                    {
                    // InternalBlatt2.g:1691:5: ( ruleEString )
                    // InternalBlatt2.g:1692:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSignatureRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSignatureAccess().getParameterTypeTypeCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBlatt2.g:1706:4: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==15) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalBlatt2.g:1707:5: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FOLLOW_6); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getSignatureAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalBlatt2.g:1711:5: ( ( ruleEString ) )
                    	    // InternalBlatt2.g:1712:6: ( ruleEString )
                    	    {
                    	    // InternalBlatt2.g:1712:6: ( ruleEString )
                    	    // InternalBlatt2.g:1713:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getSignatureRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getSignatureAccess().getParameterTypeTypeCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,16,FOLLOW_11); 

                    				newLeafNode(otherlv_10, grammarAccess.getSignatureAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getSignatureAccess().getRightCurlyBracketKeyword_6());
            		

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


    // $ANTLR start "entryRuleType_Impl"
    // InternalBlatt2.g:1741:1: entryRuleType_Impl returns [EObject current=null] : iv_ruleType_Impl= ruleType_Impl EOF ;
    public final EObject entryRuleType_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType_Impl = null;


        try {
            // InternalBlatt2.g:1741:50: (iv_ruleType_Impl= ruleType_Impl EOF )
            // InternalBlatt2.g:1742:2: iv_ruleType_Impl= ruleType_Impl EOF
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
    // InternalBlatt2.g:1748:1: ruleType_Impl returns [EObject current=null] : ( () otherlv_1= 'Type' ) ;
    public final EObject ruleType_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalBlatt2.g:1754:2: ( ( () otherlv_1= 'Type' ) )
            // InternalBlatt2.g:1755:2: ( () otherlv_1= 'Type' )
            {
            // InternalBlatt2.g:1755:2: ( () otherlv_1= 'Type' )
            // InternalBlatt2.g:1756:3: () otherlv_1= 'Type'
            {
            // InternalBlatt2.g:1756:3: ()
            // InternalBlatt2.g:1757:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getType_ImplAccess().getTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,47,FOLLOW_2); 

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
    // InternalBlatt2.g:1771:1: entryRuleList returns [EObject current=null] : iv_ruleList= ruleList EOF ;
    public final EObject entryRuleList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleList = null;


        try {
            // InternalBlatt2.g:1771:45: (iv_ruleList= ruleList EOF )
            // InternalBlatt2.g:1772:2: iv_ruleList= ruleList EOF
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
    // InternalBlatt2.g:1778:1: ruleList returns [EObject current=null] : ( () otherlv_1= 'List' ) ;
    public final EObject ruleList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalBlatt2.g:1784:2: ( ( () otherlv_1= 'List' ) )
            // InternalBlatt2.g:1785:2: ( () otherlv_1= 'List' )
            {
            // InternalBlatt2.g:1785:2: ( () otherlv_1= 'List' )
            // InternalBlatt2.g:1786:3: () otherlv_1= 'List'
            {
            // InternalBlatt2.g:1786:3: ()
            // InternalBlatt2.g:1787:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getListAccess().getListAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,48,FOLLOW_2); 

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
    // InternalBlatt2.g:1801:1: entryRuleMap returns [EObject current=null] : iv_ruleMap= ruleMap EOF ;
    public final EObject entryRuleMap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMap = null;


        try {
            // InternalBlatt2.g:1801:44: (iv_ruleMap= ruleMap EOF )
            // InternalBlatt2.g:1802:2: iv_ruleMap= ruleMap EOF
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
    // InternalBlatt2.g:1808:1: ruleMap returns [EObject current=null] : ( () otherlv_1= 'Map' ) ;
    public final EObject ruleMap() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalBlatt2.g:1814:2: ( ( () otherlv_1= 'Map' ) )
            // InternalBlatt2.g:1815:2: ( () otherlv_1= 'Map' )
            {
            // InternalBlatt2.g:1815:2: ( () otherlv_1= 'Map' )
            // InternalBlatt2.g:1816:3: () otherlv_1= 'Map'
            {
            // InternalBlatt2.g:1816:3: ()
            // InternalBlatt2.g:1817:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMapAccess().getMapAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,49,FOLLOW_2); 

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
    // InternalBlatt2.g:1831:1: entryRuleComplexType returns [EObject current=null] : iv_ruleComplexType= ruleComplexType EOF ;
    public final EObject entryRuleComplexType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexType = null;


        try {
            // InternalBlatt2.g:1831:52: (iv_ruleComplexType= ruleComplexType EOF )
            // InternalBlatt2.g:1832:2: iv_ruleComplexType= ruleComplexType EOF
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
    // InternalBlatt2.g:1838:1: ruleComplexType returns [EObject current=null] : ( () otherlv_1= 'ComplexType' ) ;
    public final EObject ruleComplexType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalBlatt2.g:1844:2: ( ( () otherlv_1= 'ComplexType' ) )
            // InternalBlatt2.g:1845:2: ( () otherlv_1= 'ComplexType' )
            {
            // InternalBlatt2.g:1845:2: ( () otherlv_1= 'ComplexType' )
            // InternalBlatt2.g:1846:3: () otherlv_1= 'ComplexType'
            {
            // InternalBlatt2.g:1846:3: ()
            // InternalBlatt2.g:1847:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getComplexTypeAccess().getComplexTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,50,FOLLOW_2); 

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
    // InternalBlatt2.g:1861:1: entryRuleDate returns [EObject current=null] : iv_ruleDate= ruleDate EOF ;
    public final EObject entryRuleDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDate = null;


        try {
            // InternalBlatt2.g:1861:45: (iv_ruleDate= ruleDate EOF )
            // InternalBlatt2.g:1862:2: iv_ruleDate= ruleDate EOF
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
    // InternalBlatt2.g:1868:1: ruleDate returns [EObject current=null] : ( () otherlv_1= 'Date' ) ;
    public final EObject ruleDate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalBlatt2.g:1874:2: ( ( () otherlv_1= 'Date' ) )
            // InternalBlatt2.g:1875:2: ( () otherlv_1= 'Date' )
            {
            // InternalBlatt2.g:1875:2: ( () otherlv_1= 'Date' )
            // InternalBlatt2.g:1876:3: () otherlv_1= 'Date'
            {
            // InternalBlatt2.g:1876:3: ()
            // InternalBlatt2.g:1877:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDateAccess().getDateAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,51,FOLLOW_2); 

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
    // InternalBlatt2.g:1891:1: entryRuleDouble returns [EObject current=null] : iv_ruleDouble= ruleDouble EOF ;
    public final EObject entryRuleDouble() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDouble = null;


        try {
            // InternalBlatt2.g:1891:47: (iv_ruleDouble= ruleDouble EOF )
            // InternalBlatt2.g:1892:2: iv_ruleDouble= ruleDouble EOF
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
    // InternalBlatt2.g:1898:1: ruleDouble returns [EObject current=null] : ( () otherlv_1= 'Double' ) ;
    public final EObject ruleDouble() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalBlatt2.g:1904:2: ( ( () otherlv_1= 'Double' ) )
            // InternalBlatt2.g:1905:2: ( () otherlv_1= 'Double' )
            {
            // InternalBlatt2.g:1905:2: ( () otherlv_1= 'Double' )
            // InternalBlatt2.g:1906:3: () otherlv_1= 'Double'
            {
            // InternalBlatt2.g:1906:3: ()
            // InternalBlatt2.g:1907:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDoubleAccess().getDoubleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,52,FOLLOW_2); 

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
    // InternalBlatt2.g:1921:1: entryRuleString0 returns [EObject current=null] : iv_ruleString0= ruleString0 EOF ;
    public final EObject entryRuleString0() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleString0 = null;


        try {
            // InternalBlatt2.g:1921:48: (iv_ruleString0= ruleString0 EOF )
            // InternalBlatt2.g:1922:2: iv_ruleString0= ruleString0 EOF
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
    // InternalBlatt2.g:1928:1: ruleString0 returns [EObject current=null] : ( () otherlv_1= 'String' ) ;
    public final EObject ruleString0() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalBlatt2.g:1934:2: ( ( () otherlv_1= 'String' ) )
            // InternalBlatt2.g:1935:2: ( () otherlv_1= 'String' )
            {
            // InternalBlatt2.g:1935:2: ( () otherlv_1= 'String' )
            // InternalBlatt2.g:1936:3: () otherlv_1= 'String'
            {
            // InternalBlatt2.g:1936:3: ()
            // InternalBlatt2.g:1937:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getString0Access().getStringAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,53,FOLLOW_2); 

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
    // InternalBlatt2.g:1951:1: entryRuleInt0 returns [EObject current=null] : iv_ruleInt0= ruleInt0 EOF ;
    public final EObject entryRuleInt0() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInt0 = null;


        try {
            // InternalBlatt2.g:1951:45: (iv_ruleInt0= ruleInt0 EOF )
            // InternalBlatt2.g:1952:2: iv_ruleInt0= ruleInt0 EOF
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
    // InternalBlatt2.g:1958:1: ruleInt0 returns [EObject current=null] : ( () otherlv_1= 'Int' ) ;
    public final EObject ruleInt0() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalBlatt2.g:1964:2: ( ( () otherlv_1= 'Int' ) )
            // InternalBlatt2.g:1965:2: ( () otherlv_1= 'Int' )
            {
            // InternalBlatt2.g:1965:2: ( () otherlv_1= 'Int' )
            // InternalBlatt2.g:1966:3: () otherlv_1= 'Int'
            {
            // InternalBlatt2.g:1966:3: ()
            // InternalBlatt2.g:1967:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInt0Access().getIntAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,54,FOLLOW_2); 

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
    // InternalBlatt2.g:1981:1: entryRuleChar returns [EObject current=null] : iv_ruleChar= ruleChar EOF ;
    public final EObject entryRuleChar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChar = null;


        try {
            // InternalBlatt2.g:1981:45: (iv_ruleChar= ruleChar EOF )
            // InternalBlatt2.g:1982:2: iv_ruleChar= ruleChar EOF
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
    // InternalBlatt2.g:1988:1: ruleChar returns [EObject current=null] : ( () otherlv_1= 'Char' ) ;
    public final EObject ruleChar() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalBlatt2.g:1994:2: ( ( () otherlv_1= 'Char' ) )
            // InternalBlatt2.g:1995:2: ( () otherlv_1= 'Char' )
            {
            // InternalBlatt2.g:1995:2: ( () otherlv_1= 'Char' )
            // InternalBlatt2.g:1996:3: () otherlv_1= 'Char'
            {
            // InternalBlatt2.g:1996:3: ()
            // InternalBlatt2.g:1997:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCharAccess().getCharAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,55,FOLLOW_2); 

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
    // InternalBlatt2.g:2011:1: entryRuleLong returns [EObject current=null] : iv_ruleLong= ruleLong EOF ;
    public final EObject entryRuleLong() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLong = null;


        try {
            // InternalBlatt2.g:2011:45: (iv_ruleLong= ruleLong EOF )
            // InternalBlatt2.g:2012:2: iv_ruleLong= ruleLong EOF
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
    // InternalBlatt2.g:2018:1: ruleLong returns [EObject current=null] : ( () otherlv_1= 'Long' ) ;
    public final EObject ruleLong() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalBlatt2.g:2024:2: ( ( () otherlv_1= 'Long' ) )
            // InternalBlatt2.g:2025:2: ( () otherlv_1= 'Long' )
            {
            // InternalBlatt2.g:2025:2: ( () otherlv_1= 'Long' )
            // InternalBlatt2.g:2026:3: () otherlv_1= 'Long'
            {
            // InternalBlatt2.g:2026:3: ()
            // InternalBlatt2.g:2027:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLongAccess().getLongAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,56,FOLLOW_2); 

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
    // InternalBlatt2.g:2041:1: entryRuleFloat returns [EObject current=null] : iv_ruleFloat= ruleFloat EOF ;
    public final EObject entryRuleFloat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloat = null;


        try {
            // InternalBlatt2.g:2041:46: (iv_ruleFloat= ruleFloat EOF )
            // InternalBlatt2.g:2042:2: iv_ruleFloat= ruleFloat EOF
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
    // InternalBlatt2.g:2048:1: ruleFloat returns [EObject current=null] : ( () otherlv_1= 'Float' ) ;
    public final EObject ruleFloat() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalBlatt2.g:2054:2: ( ( () otherlv_1= 'Float' ) )
            // InternalBlatt2.g:2055:2: ( () otherlv_1= 'Float' )
            {
            // InternalBlatt2.g:2055:2: ( () otherlv_1= 'Float' )
            // InternalBlatt2.g:2056:3: () otherlv_1= 'Float'
            {
            // InternalBlatt2.g:2056:3: ()
            // InternalBlatt2.g:2057:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFloatAccess().getFloatAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,57,FOLLOW_2); 

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
    // InternalBlatt2.g:2071:1: entryRuleBoolean returns [EObject current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final EObject entryRuleBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolean = null;


        try {
            // InternalBlatt2.g:2071:48: (iv_ruleBoolean= ruleBoolean EOF )
            // InternalBlatt2.g:2072:2: iv_ruleBoolean= ruleBoolean EOF
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
    // InternalBlatt2.g:2078:1: ruleBoolean returns [EObject current=null] : ( () otherlv_1= 'Boolean' ) ;
    public final EObject ruleBoolean() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalBlatt2.g:2084:2: ( ( () otherlv_1= 'Boolean' ) )
            // InternalBlatt2.g:2085:2: ( () otherlv_1= 'Boolean' )
            {
            // InternalBlatt2.g:2085:2: ( () otherlv_1= 'Boolean' )
            // InternalBlatt2.g:2086:3: () otherlv_1= 'Boolean'
            {
            // InternalBlatt2.g:2086:3: ()
            // InternalBlatt2.g:2087:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBooleanAccess().getBooleanAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,58,FOLLOW_2); 

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
    // InternalBlatt2.g:2101:1: entryRuleVoid returns [EObject current=null] : iv_ruleVoid= ruleVoid EOF ;
    public final EObject entryRuleVoid() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVoid = null;


        try {
            // InternalBlatt2.g:2101:45: (iv_ruleVoid= ruleVoid EOF )
            // InternalBlatt2.g:2102:2: iv_ruleVoid= ruleVoid EOF
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
    // InternalBlatt2.g:2108:1: ruleVoid returns [EObject current=null] : ( () otherlv_1= 'Void' ) ;
    public final EObject ruleVoid() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalBlatt2.g:2114:2: ( ( () otherlv_1= 'Void' ) )
            // InternalBlatt2.g:2115:2: ( () otherlv_1= 'Void' )
            {
            // InternalBlatt2.g:2115:2: ( () otherlv_1= 'Void' )
            // InternalBlatt2.g:2116:3: () otherlv_1= 'Void'
            {
            // InternalBlatt2.g:2116:3: ()
            // InternalBlatt2.g:2117:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVoidAccess().getVoidAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,59,FOLLOW_2); 

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


    // $ANTLR start "entryRuleInternalAction"
    // InternalBlatt2.g:2131:1: entryRuleInternalAction returns [EObject current=null] : iv_ruleInternalAction= ruleInternalAction EOF ;
    public final EObject entryRuleInternalAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalAction = null;


        try {
            // InternalBlatt2.g:2131:55: (iv_ruleInternalAction= ruleInternalAction EOF )
            // InternalBlatt2.g:2132:2: iv_ruleInternalAction= ruleInternalAction EOF
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
    // InternalBlatt2.g:2138:1: ruleInternalAction returns [EObject current=null] : ( () otherlv_1= 'InternalAction' ) ;
    public final EObject ruleInternalAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalBlatt2.g:2144:2: ( ( () otherlv_1= 'InternalAction' ) )
            // InternalBlatt2.g:2145:2: ( () otherlv_1= 'InternalAction' )
            {
            // InternalBlatt2.g:2145:2: ( () otherlv_1= 'InternalAction' )
            // InternalBlatt2.g:2146:3: () otherlv_1= 'InternalAction'
            {
            // InternalBlatt2.g:2146:3: ()
            // InternalBlatt2.g:2147:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInternalActionAccess().getInternalActionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,60,FOLLOW_2); 

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
    // InternalBlatt2.g:2161:1: entryRuleLoop returns [EObject current=null] : iv_ruleLoop= ruleLoop EOF ;
    public final EObject entryRuleLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoop = null;


        try {
            // InternalBlatt2.g:2161:45: (iv_ruleLoop= ruleLoop EOF )
            // InternalBlatt2.g:2162:2: iv_ruleLoop= ruleLoop EOF
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
    // InternalBlatt2.g:2168:1: ruleLoop returns [EObject current=null] : ( () otherlv_1= 'Loop' ) ;
    public final EObject ruleLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalBlatt2.g:2174:2: ( ( () otherlv_1= 'Loop' ) )
            // InternalBlatt2.g:2175:2: ( () otherlv_1= 'Loop' )
            {
            // InternalBlatt2.g:2175:2: ( () otherlv_1= 'Loop' )
            // InternalBlatt2.g:2176:3: () otherlv_1= 'Loop'
            {
            // InternalBlatt2.g:2176:3: ()
            // InternalBlatt2.g:2177:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLoopAccess().getLoopAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,61,FOLLOW_2); 

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
    // InternalBlatt2.g:2191:1: entryRuleBranch returns [EObject current=null] : iv_ruleBranch= ruleBranch EOF ;
    public final EObject entryRuleBranch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBranch = null;


        try {
            // InternalBlatt2.g:2191:47: (iv_ruleBranch= ruleBranch EOF )
            // InternalBlatt2.g:2192:2: iv_ruleBranch= ruleBranch EOF
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
    // InternalBlatt2.g:2198:1: ruleBranch returns [EObject current=null] : ( () otherlv_1= 'Branch' ) ;
    public final EObject ruleBranch() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalBlatt2.g:2204:2: ( ( () otherlv_1= 'Branch' ) )
            // InternalBlatt2.g:2205:2: ( () otherlv_1= 'Branch' )
            {
            // InternalBlatt2.g:2205:2: ( () otherlv_1= 'Branch' )
            // InternalBlatt2.g:2206:3: () otherlv_1= 'Branch'
            {
            // InternalBlatt2.g:2206:3: ()
            // InternalBlatt2.g:2207:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBranchAccess().getBranchAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,62,FOLLOW_2); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000003040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002040000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000040008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000003C000040000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000038000040000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000030000040000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000020000040000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000400000040000L});

}