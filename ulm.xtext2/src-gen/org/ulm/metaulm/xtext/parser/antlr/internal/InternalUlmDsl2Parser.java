package org.ulm.metaulm.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.ulm.metaulm.xtext.services.UlmDsl2GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUlmDsl2Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'{'", "'}'", "'context'", "'attributes'", "'lookups'", "'entities'", "'.'", "'attribute'", "';'", "'['", "']'", "'string'", "'int'", "'decimal'", "'boolean'", "'date'", "'datetime'", "'timestamp'", "'data'", "'static'", "'lookup'", "'entity'", "'extends'", "'features'", "'mandatory'", "'identifier'", "'as'", "'feature'", "'integer'", "'values'", "','", "'('", "')'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
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
    public static final int RULE_STRING=6;
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
    public static final int T__44=44;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalUlmDsl2Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalUlmDsl2Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalUlmDsl2Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalUlmDsl2.g"; }



     	private UlmDsl2GrammarAccess grammarAccess;

        public InternalUlmDsl2Parser(TokenStream input, UlmDsl2GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected UlmDsl2GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalUlmDsl2.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalUlmDsl2.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalUlmDsl2.g:65:2: iv_ruleModel= ruleModel EOF
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
    // InternalUlmDsl2.g:71:1: ruleModel returns [EObject current=null] : (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_contexts_3_0= ruleContext ) )* otherlv_4= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_contexts_3_0 = null;



        	enterRule();

        try {
            // InternalUlmDsl2.g:77:2: ( (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_contexts_3_0= ruleContext ) )* otherlv_4= '}' ) )
            // InternalUlmDsl2.g:78:2: (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_contexts_3_0= ruleContext ) )* otherlv_4= '}' )
            {
            // InternalUlmDsl2.g:78:2: (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_contexts_3_0= ruleContext ) )* otherlv_4= '}' )
            // InternalUlmDsl2.g:79:3: otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_contexts_3_0= ruleContext ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getModelKeyword_0());
            		
            // InternalUlmDsl2.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUlmDsl2.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUlmDsl2.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalUlmDsl2.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalUlmDsl2.g:105:3: ( (lv_contexts_3_0= ruleContext ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalUlmDsl2.g:106:4: (lv_contexts_3_0= ruleContext )
            	    {
            	    // InternalUlmDsl2.g:106:4: (lv_contexts_3_0= ruleContext )
            	    // InternalUlmDsl2.g:107:5: lv_contexts_3_0= ruleContext
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getContextsContextParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_contexts_3_0=ruleContext();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"contexts",
            	    						lv_contexts_3_0,
            	    						"org.ulm.metaulm.xtext.UlmDsl2.Context");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleContext"
    // InternalUlmDsl2.g:132:1: entryRuleContext returns [EObject current=null] : iv_ruleContext= ruleContext EOF ;
    public final EObject entryRuleContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContext = null;


        try {
            // InternalUlmDsl2.g:132:48: (iv_ruleContext= ruleContext EOF )
            // InternalUlmDsl2.g:133:2: iv_ruleContext= ruleContext EOF
            {
             newCompositeNode(grammarAccess.getContextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContext=ruleContext();

            state._fsp--;

             current =iv_ruleContext; 
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
    // $ANTLR end "entryRuleContext"


    // $ANTLR start "ruleContext"
    // InternalUlmDsl2.g:139:1: ruleContext returns [EObject current=null] : (otherlv_0= 'context' ( (lv_name_1_0= RULE_ID ) ) ( (lv_version_2_0= ruleVersion ) ) otherlv_3= '{' (otherlv_4= 'attributes' otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) )* otherlv_7= '}' )? (otherlv_8= 'lookups' otherlv_9= '{' ( (lv_lookups_10_0= ruleLookup ) )* otherlv_11= '}' )? (otherlv_12= 'entities' otherlv_13= '{' ( (lv_entities_14_0= ruleEntity ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_version_2_0 = null;

        EObject lv_attributes_6_0 = null;

        EObject lv_lookups_10_0 = null;

        EObject lv_entities_14_0 = null;



        	enterRule();

        try {
            // InternalUlmDsl2.g:145:2: ( (otherlv_0= 'context' ( (lv_name_1_0= RULE_ID ) ) ( (lv_version_2_0= ruleVersion ) ) otherlv_3= '{' (otherlv_4= 'attributes' otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) )* otherlv_7= '}' )? (otherlv_8= 'lookups' otherlv_9= '{' ( (lv_lookups_10_0= ruleLookup ) )* otherlv_11= '}' )? (otherlv_12= 'entities' otherlv_13= '{' ( (lv_entities_14_0= ruleEntity ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalUlmDsl2.g:146:2: (otherlv_0= 'context' ( (lv_name_1_0= RULE_ID ) ) ( (lv_version_2_0= ruleVersion ) ) otherlv_3= '{' (otherlv_4= 'attributes' otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) )* otherlv_7= '}' )? (otherlv_8= 'lookups' otherlv_9= '{' ( (lv_lookups_10_0= ruleLookup ) )* otherlv_11= '}' )? (otherlv_12= 'entities' otherlv_13= '{' ( (lv_entities_14_0= ruleEntity ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalUlmDsl2.g:146:2: (otherlv_0= 'context' ( (lv_name_1_0= RULE_ID ) ) ( (lv_version_2_0= ruleVersion ) ) otherlv_3= '{' (otherlv_4= 'attributes' otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) )* otherlv_7= '}' )? (otherlv_8= 'lookups' otherlv_9= '{' ( (lv_lookups_10_0= ruleLookup ) )* otherlv_11= '}' )? (otherlv_12= 'entities' otherlv_13= '{' ( (lv_entities_14_0= ruleEntity ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalUlmDsl2.g:147:3: otherlv_0= 'context' ( (lv_name_1_0= RULE_ID ) ) ( (lv_version_2_0= ruleVersion ) ) otherlv_3= '{' (otherlv_4= 'attributes' otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) )* otherlv_7= '}' )? (otherlv_8= 'lookups' otherlv_9= '{' ( (lv_lookups_10_0= ruleLookup ) )* otherlv_11= '}' )? (otherlv_12= 'entities' otherlv_13= '{' ( (lv_entities_14_0= ruleEntity ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getContextAccess().getContextKeyword_0());
            		
            // InternalUlmDsl2.g:151:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUlmDsl2.g:152:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUlmDsl2.g:152:4: (lv_name_1_0= RULE_ID )
            // InternalUlmDsl2.g:153:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getContextAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContextRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUlmDsl2.g:169:3: ( (lv_version_2_0= ruleVersion ) )
            // InternalUlmDsl2.g:170:4: (lv_version_2_0= ruleVersion )
            {
            // InternalUlmDsl2.g:170:4: (lv_version_2_0= ruleVersion )
            // InternalUlmDsl2.g:171:5: lv_version_2_0= ruleVersion
            {

            					newCompositeNode(grammarAccess.getContextAccess().getVersionVersionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_version_2_0=ruleVersion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContextRule());
            					}
            					set(
            						current,
            						"version",
            						lv_version_2_0,
            						"org.ulm.metaulm.xtext.UlmDsl2.Version");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getContextAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalUlmDsl2.g:192:3: (otherlv_4= 'attributes' otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) )* otherlv_7= '}' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalUlmDsl2.g:193:4: otherlv_4= 'attributes' otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) )* otherlv_7= '}'
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getContextAccess().getAttributesKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getContextAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalUlmDsl2.g:201:4: ( (lv_attributes_6_0= ruleAttribute ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==19) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalUlmDsl2.g:202:5: (lv_attributes_6_0= ruleAttribute )
                    	    {
                    	    // InternalUlmDsl2.g:202:5: (lv_attributes_6_0= ruleAttribute )
                    	    // InternalUlmDsl2.g:203:6: lv_attributes_6_0= ruleAttribute
                    	    {

                    	    						newCompositeNode(grammarAccess.getContextAccess().getAttributesAttributeParserRuleCall_4_2_0());
                    	    					
                    	    pushFollow(FOLLOW_8);
                    	    lv_attributes_6_0=ruleAttribute();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getContextRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"attributes",
                    	    							lv_attributes_6_0,
                    	    							"org.ulm.metaulm.xtext.UlmDsl2.Attribute");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,13,FOLLOW_9); 

                    				newLeafNode(otherlv_7, grammarAccess.getContextAccess().getRightCurlyBracketKeyword_4_3());
                    			

                    }
                    break;

            }

            // InternalUlmDsl2.g:225:3: (otherlv_8= 'lookups' otherlv_9= '{' ( (lv_lookups_10_0= ruleLookup ) )* otherlv_11= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalUlmDsl2.g:226:4: otherlv_8= 'lookups' otherlv_9= '{' ( (lv_lookups_10_0= ruleLookup ) )* otherlv_11= '}'
                    {
                    otherlv_8=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getContextAccess().getLookupsKeyword_5_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_10); 

                    				newLeafNode(otherlv_9, grammarAccess.getContextAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalUlmDsl2.g:234:4: ( (lv_lookups_10_0= ruleLookup ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==32) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalUlmDsl2.g:235:5: (lv_lookups_10_0= ruleLookup )
                    	    {
                    	    // InternalUlmDsl2.g:235:5: (lv_lookups_10_0= ruleLookup )
                    	    // InternalUlmDsl2.g:236:6: lv_lookups_10_0= ruleLookup
                    	    {

                    	    						newCompositeNode(grammarAccess.getContextAccess().getLookupsLookupParserRuleCall_5_2_0());
                    	    					
                    	    pushFollow(FOLLOW_10);
                    	    lv_lookups_10_0=ruleLookup();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getContextRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"lookups",
                    	    							lv_lookups_10_0,
                    	    							"org.ulm.metaulm.xtext.UlmDsl2.Lookup");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,13,FOLLOW_11); 

                    				newLeafNode(otherlv_11, grammarAccess.getContextAccess().getRightCurlyBracketKeyword_5_3());
                    			

                    }
                    break;

            }

            // InternalUlmDsl2.g:258:3: (otherlv_12= 'entities' otherlv_13= '{' ( (lv_entities_14_0= ruleEntity ) )* otherlv_15= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalUlmDsl2.g:259:4: otherlv_12= 'entities' otherlv_13= '{' ( (lv_entities_14_0= ruleEntity ) )* otherlv_15= '}'
                    {
                    otherlv_12=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_12, grammarAccess.getContextAccess().getEntitiesKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_12); 

                    				newLeafNode(otherlv_13, grammarAccess.getContextAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalUlmDsl2.g:267:4: ( (lv_entities_14_0= ruleEntity ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>=30 && LA6_0<=33)) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalUlmDsl2.g:268:5: (lv_entities_14_0= ruleEntity )
                    	    {
                    	    // InternalUlmDsl2.g:268:5: (lv_entities_14_0= ruleEntity )
                    	    // InternalUlmDsl2.g:269:6: lv_entities_14_0= ruleEntity
                    	    {

                    	    						newCompositeNode(grammarAccess.getContextAccess().getEntitiesEntityParserRuleCall_6_2_0());
                    	    					
                    	    pushFollow(FOLLOW_12);
                    	    lv_entities_14_0=ruleEntity();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getContextRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"entities",
                    	    							lv_entities_14_0,
                    	    							"org.ulm.metaulm.xtext.UlmDsl2.Entity");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,13,FOLLOW_13); 

                    				newLeafNode(otherlv_15, grammarAccess.getContextAccess().getRightCurlyBracketKeyword_6_3());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getContextAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleContext"


    // $ANTLR start "entryRuleVersion"
    // InternalUlmDsl2.g:299:1: entryRuleVersion returns [String current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final String entryRuleVersion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersion = null;


        try {
            // InternalUlmDsl2.g:299:47: (iv_ruleVersion= ruleVersion EOF )
            // InternalUlmDsl2.g:300:2: iv_ruleVersion= ruleVersion EOF
            {
             newCompositeNode(grammarAccess.getVersionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVersion=ruleVersion();

            state._fsp--;

             current =iv_ruleVersion.getText(); 
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
    // $ANTLR end "entryRuleVersion"


    // $ANTLR start "ruleVersion"
    // InternalUlmDsl2.g:306:1: ruleVersion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleVersion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_4=null;


        	enterRule();

        try {
            // InternalUlmDsl2.g:312:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT ) )
            // InternalUlmDsl2.g:313:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT )
            {
            // InternalUlmDsl2.g:313:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT )
            // InternalUlmDsl2.g:314:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_14); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getVersionAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,18,FOLLOW_6); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getVersionAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_14); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getVersionAccess().getINTTerminalRuleCall_2());
            		
            kw=(Token)match(input,18,FOLLOW_6); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getVersionAccess().getFullStopKeyword_3());
            		
            this_INT_4=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_4);
            		

            			newLeafNode(this_INT_4, grammarAccess.getVersionAccess().getINTTerminalRuleCall_4());
            		

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
    // $ANTLR end "ruleVersion"


    // $ANTLR start "entryRuleAttribute"
    // InternalUlmDsl2.g:349:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalUlmDsl2.g:349:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalUlmDsl2.g:350:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalUlmDsl2.g:356:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'attribute' ( (lv_type_1_0= ruleAttributeType ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_desc_3_0= RULE_STRING ) )? otherlv_4= ';' ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token lv_desc_3_0=null;
        Token otherlv_4=null;
        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalUlmDsl2.g:362:2: ( (otherlv_0= 'attribute' ( (lv_type_1_0= ruleAttributeType ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_desc_3_0= RULE_STRING ) )? otherlv_4= ';' ) )
            // InternalUlmDsl2.g:363:2: (otherlv_0= 'attribute' ( (lv_type_1_0= ruleAttributeType ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_desc_3_0= RULE_STRING ) )? otherlv_4= ';' )
            {
            // InternalUlmDsl2.g:363:2: (otherlv_0= 'attribute' ( (lv_type_1_0= ruleAttributeType ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_desc_3_0= RULE_STRING ) )? otherlv_4= ';' )
            // InternalUlmDsl2.g:364:3: otherlv_0= 'attribute' ( (lv_type_1_0= ruleAttributeType ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_desc_3_0= RULE_STRING ) )? otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
            		
            // InternalUlmDsl2.g:368:3: ( (lv_type_1_0= ruleAttributeType ) )
            // InternalUlmDsl2.g:369:4: (lv_type_1_0= ruleAttributeType )
            {
            // InternalUlmDsl2.g:369:4: (lv_type_1_0= ruleAttributeType )
            // InternalUlmDsl2.g:370:5: lv_type_1_0= ruleAttributeType
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypeAttributeTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_type_1_0=ruleAttributeType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"org.ulm.metaulm.xtext.UlmDsl2.AttributeType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUlmDsl2.g:387:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUlmDsl2.g:388:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUlmDsl2.g:388:4: (lv_name_2_0= RULE_ID )
            // InternalUlmDsl2.g:389:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_name_2_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUlmDsl2.g:405:3: ( (lv_desc_3_0= RULE_STRING ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalUlmDsl2.g:406:4: (lv_desc_3_0= RULE_STRING )
                    {
                    // InternalUlmDsl2.g:406:4: (lv_desc_3_0= RULE_STRING )
                    // InternalUlmDsl2.g:407:5: lv_desc_3_0= RULE_STRING
                    {
                    lv_desc_3_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

                    					newLeafNode(lv_desc_3_0, grammarAccess.getAttributeAccess().getDescSTRINGTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"desc",
                    						lv_desc_3_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleAttributeType"
    // InternalUlmDsl2.g:431:1: entryRuleAttributeType returns [EObject current=null] : iv_ruleAttributeType= ruleAttributeType EOF ;
    public final EObject entryRuleAttributeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeType = null;


        try {
            // InternalUlmDsl2.g:431:54: (iv_ruleAttributeType= ruleAttributeType EOF )
            // InternalUlmDsl2.g:432:2: iv_ruleAttributeType= ruleAttributeType EOF
            {
             newCompositeNode(grammarAccess.getAttributeTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeType=ruleAttributeType();

            state._fsp--;

             current =iv_ruleAttributeType; 
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
    // $ANTLR end "entryRuleAttributeType"


    // $ANTLR start "ruleAttributeType"
    // InternalUlmDsl2.g:438:1: ruleAttributeType returns [EObject current=null] : ( ( (lv_type_0_0= ruleBasicType ) ) ( ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) )? otherlv_3= ']' )? ) ;
    public final EObject ruleAttributeType() throws RecognitionException {
        EObject current = null;

        Token lv_array_1_0=null;
        Token lv_length_2_0=null;
        Token otherlv_3=null;
        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalUlmDsl2.g:444:2: ( ( ( (lv_type_0_0= ruleBasicType ) ) ( ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) )? otherlv_3= ']' )? ) )
            // InternalUlmDsl2.g:445:2: ( ( (lv_type_0_0= ruleBasicType ) ) ( ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) )? otherlv_3= ']' )? )
            {
            // InternalUlmDsl2.g:445:2: ( ( (lv_type_0_0= ruleBasicType ) ) ( ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) )? otherlv_3= ']' )? )
            // InternalUlmDsl2.g:446:3: ( (lv_type_0_0= ruleBasicType ) ) ( ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) )? otherlv_3= ']' )?
            {
            // InternalUlmDsl2.g:446:3: ( (lv_type_0_0= ruleBasicType ) )
            // InternalUlmDsl2.g:447:4: (lv_type_0_0= ruleBasicType )
            {
            // InternalUlmDsl2.g:447:4: (lv_type_0_0= ruleBasicType )
            // InternalUlmDsl2.g:448:5: lv_type_0_0= ruleBasicType
            {

            					newCompositeNode(grammarAccess.getAttributeTypeAccess().getTypeBasicTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_18);
            lv_type_0_0=ruleBasicType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeTypeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"org.ulm.metaulm.xtext.UlmDsl2.BasicType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUlmDsl2.g:465:3: ( ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) )? otherlv_3= ']' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalUlmDsl2.g:466:4: ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) )? otherlv_3= ']'
                    {
                    // InternalUlmDsl2.g:466:4: ( (lv_array_1_0= '[' ) )
                    // InternalUlmDsl2.g:467:5: (lv_array_1_0= '[' )
                    {
                    // InternalUlmDsl2.g:467:5: (lv_array_1_0= '[' )
                    // InternalUlmDsl2.g:468:6: lv_array_1_0= '['
                    {
                    lv_array_1_0=(Token)match(input,21,FOLLOW_19); 

                    						newLeafNode(lv_array_1_0, grammarAccess.getAttributeTypeAccess().getArrayLeftSquareBracketKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAttributeTypeRule());
                    						}
                    						setWithLastConsumed(current, "array", true, "[");
                    					

                    }


                    }

                    // InternalUlmDsl2.g:480:4: ( (lv_length_2_0= RULE_INT ) )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==RULE_INT) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalUlmDsl2.g:481:5: (lv_length_2_0= RULE_INT )
                            {
                            // InternalUlmDsl2.g:481:5: (lv_length_2_0= RULE_INT )
                            // InternalUlmDsl2.g:482:6: lv_length_2_0= RULE_INT
                            {
                            lv_length_2_0=(Token)match(input,RULE_INT,FOLLOW_20); 

                            						newLeafNode(lv_length_2_0, grammarAccess.getAttributeTypeAccess().getLengthINTTerminalRuleCall_1_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getAttributeTypeRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"length",
                            							lv_length_2_0,
                            							"org.eclipse.xtext.common.Terminals.INT");
                            					

                            }


                            }
                            break;

                    }

                    otherlv_3=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getAttributeTypeAccess().getRightSquareBracketKeyword_1_2());
                    			

                    }
                    break;

            }


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
    // $ANTLR end "ruleAttributeType"


    // $ANTLR start "entryRuleBasicType"
    // InternalUlmDsl2.g:507:1: entryRuleBasicType returns [EObject current=null] : iv_ruleBasicType= ruleBasicType EOF ;
    public final EObject entryRuleBasicType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicType = null;


        try {
            // InternalUlmDsl2.g:507:50: (iv_ruleBasicType= ruleBasicType EOF )
            // InternalUlmDsl2.g:508:2: iv_ruleBasicType= ruleBasicType EOF
            {
             newCompositeNode(grammarAccess.getBasicTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBasicType=ruleBasicType();

            state._fsp--;

             current =iv_ruleBasicType; 
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
    // $ANTLR end "entryRuleBasicType"


    // $ANTLR start "ruleBasicType"
    // InternalUlmDsl2.g:514:1: ruleBasicType returns [EObject current=null] : ( ( (lv_typeName_0_1= 'string' | lv_typeName_0_2= 'int' | lv_typeName_0_3= 'decimal' | lv_typeName_0_4= 'boolean' | lv_typeName_0_5= 'date' | lv_typeName_0_6= 'datetime' | lv_typeName_0_7= 'timestamp' ) ) ) ;
    public final EObject ruleBasicType() throws RecognitionException {
        EObject current = null;

        Token lv_typeName_0_1=null;
        Token lv_typeName_0_2=null;
        Token lv_typeName_0_3=null;
        Token lv_typeName_0_4=null;
        Token lv_typeName_0_5=null;
        Token lv_typeName_0_6=null;
        Token lv_typeName_0_7=null;


        	enterRule();

        try {
            // InternalUlmDsl2.g:520:2: ( ( ( (lv_typeName_0_1= 'string' | lv_typeName_0_2= 'int' | lv_typeName_0_3= 'decimal' | lv_typeName_0_4= 'boolean' | lv_typeName_0_5= 'date' | lv_typeName_0_6= 'datetime' | lv_typeName_0_7= 'timestamp' ) ) ) )
            // InternalUlmDsl2.g:521:2: ( ( (lv_typeName_0_1= 'string' | lv_typeName_0_2= 'int' | lv_typeName_0_3= 'decimal' | lv_typeName_0_4= 'boolean' | lv_typeName_0_5= 'date' | lv_typeName_0_6= 'datetime' | lv_typeName_0_7= 'timestamp' ) ) )
            {
            // InternalUlmDsl2.g:521:2: ( ( (lv_typeName_0_1= 'string' | lv_typeName_0_2= 'int' | lv_typeName_0_3= 'decimal' | lv_typeName_0_4= 'boolean' | lv_typeName_0_5= 'date' | lv_typeName_0_6= 'datetime' | lv_typeName_0_7= 'timestamp' ) ) )
            // InternalUlmDsl2.g:522:3: ( (lv_typeName_0_1= 'string' | lv_typeName_0_2= 'int' | lv_typeName_0_3= 'decimal' | lv_typeName_0_4= 'boolean' | lv_typeName_0_5= 'date' | lv_typeName_0_6= 'datetime' | lv_typeName_0_7= 'timestamp' ) )
            {
            // InternalUlmDsl2.g:522:3: ( (lv_typeName_0_1= 'string' | lv_typeName_0_2= 'int' | lv_typeName_0_3= 'decimal' | lv_typeName_0_4= 'boolean' | lv_typeName_0_5= 'date' | lv_typeName_0_6= 'datetime' | lv_typeName_0_7= 'timestamp' ) )
            // InternalUlmDsl2.g:523:4: (lv_typeName_0_1= 'string' | lv_typeName_0_2= 'int' | lv_typeName_0_3= 'decimal' | lv_typeName_0_4= 'boolean' | lv_typeName_0_5= 'date' | lv_typeName_0_6= 'datetime' | lv_typeName_0_7= 'timestamp' )
            {
            // InternalUlmDsl2.g:523:4: (lv_typeName_0_1= 'string' | lv_typeName_0_2= 'int' | lv_typeName_0_3= 'decimal' | lv_typeName_0_4= 'boolean' | lv_typeName_0_5= 'date' | lv_typeName_0_6= 'datetime' | lv_typeName_0_7= 'timestamp' )
            int alt11=7;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt11=1;
                }
                break;
            case 24:
                {
                alt11=2;
                }
                break;
            case 25:
                {
                alt11=3;
                }
                break;
            case 26:
                {
                alt11=4;
                }
                break;
            case 27:
                {
                alt11=5;
                }
                break;
            case 28:
                {
                alt11=6;
                }
                break;
            case 29:
                {
                alt11=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalUlmDsl2.g:524:5: lv_typeName_0_1= 'string'
                    {
                    lv_typeName_0_1=(Token)match(input,23,FOLLOW_2); 

                    					newLeafNode(lv_typeName_0_1, grammarAccess.getBasicTypeAccess().getTypeNameStringKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBasicTypeRule());
                    					}
                    					setWithLastConsumed(current, "typeName", lv_typeName_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalUlmDsl2.g:535:5: lv_typeName_0_2= 'int'
                    {
                    lv_typeName_0_2=(Token)match(input,24,FOLLOW_2); 

                    					newLeafNode(lv_typeName_0_2, grammarAccess.getBasicTypeAccess().getTypeNameIntKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBasicTypeRule());
                    					}
                    					setWithLastConsumed(current, "typeName", lv_typeName_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalUlmDsl2.g:546:5: lv_typeName_0_3= 'decimal'
                    {
                    lv_typeName_0_3=(Token)match(input,25,FOLLOW_2); 

                    					newLeafNode(lv_typeName_0_3, grammarAccess.getBasicTypeAccess().getTypeNameDecimalKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBasicTypeRule());
                    					}
                    					setWithLastConsumed(current, "typeName", lv_typeName_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalUlmDsl2.g:557:5: lv_typeName_0_4= 'boolean'
                    {
                    lv_typeName_0_4=(Token)match(input,26,FOLLOW_2); 

                    					newLeafNode(lv_typeName_0_4, grammarAccess.getBasicTypeAccess().getTypeNameBooleanKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBasicTypeRule());
                    					}
                    					setWithLastConsumed(current, "typeName", lv_typeName_0_4, null);
                    				

                    }
                    break;
                case 5 :
                    // InternalUlmDsl2.g:568:5: lv_typeName_0_5= 'date'
                    {
                    lv_typeName_0_5=(Token)match(input,27,FOLLOW_2); 

                    					newLeafNode(lv_typeName_0_5, grammarAccess.getBasicTypeAccess().getTypeNameDateKeyword_0_4());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBasicTypeRule());
                    					}
                    					setWithLastConsumed(current, "typeName", lv_typeName_0_5, null);
                    				

                    }
                    break;
                case 6 :
                    // InternalUlmDsl2.g:579:5: lv_typeName_0_6= 'datetime'
                    {
                    lv_typeName_0_6=(Token)match(input,28,FOLLOW_2); 

                    					newLeafNode(lv_typeName_0_6, grammarAccess.getBasicTypeAccess().getTypeNameDatetimeKeyword_0_5());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBasicTypeRule());
                    					}
                    					setWithLastConsumed(current, "typeName", lv_typeName_0_6, null);
                    				

                    }
                    break;
                case 7 :
                    // InternalUlmDsl2.g:590:5: lv_typeName_0_7= 'timestamp'
                    {
                    lv_typeName_0_7=(Token)match(input,29,FOLLOW_2); 

                    					newLeafNode(lv_typeName_0_7, grammarAccess.getBasicTypeAccess().getTypeNameTimestampKeyword_0_6());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBasicTypeRule());
                    					}
                    					setWithLastConsumed(current, "typeName", lv_typeName_0_7, null);
                    				

                    }
                    break;

            }


            }


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
    // $ANTLR end "ruleBasicType"


    // $ANTLR start "entryRuleEntity"
    // InternalUlmDsl2.g:606:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalUlmDsl2.g:606:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalUlmDsl2.g:607:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalUlmDsl2.g:613:1: ruleEntity returns [EObject current=null] : ( ( ( (lv_type_0_1= 'data' | lv_type_0_2= 'static' | lv_type_0_3= 'lookup' ) ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) ( (lv_desc_3_0= RULE_STRING ) )? (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= '{' (otherlv_7= 'features' otherlv_8= '{' ( (lv_features_9_0= ruleFeature ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_1=null;
        Token lv_type_0_2=null;
        Token lv_type_0_3=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token lv_desc_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_features_9_0 = null;



        	enterRule();

        try {
            // InternalUlmDsl2.g:619:2: ( ( ( ( (lv_type_0_1= 'data' | lv_type_0_2= 'static' | lv_type_0_3= 'lookup' ) ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) ( (lv_desc_3_0= RULE_STRING ) )? (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= '{' (otherlv_7= 'features' otherlv_8= '{' ( (lv_features_9_0= ruleFeature ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalUlmDsl2.g:620:2: ( ( ( (lv_type_0_1= 'data' | lv_type_0_2= 'static' | lv_type_0_3= 'lookup' ) ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) ( (lv_desc_3_0= RULE_STRING ) )? (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= '{' (otherlv_7= 'features' otherlv_8= '{' ( (lv_features_9_0= ruleFeature ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalUlmDsl2.g:620:2: ( ( ( (lv_type_0_1= 'data' | lv_type_0_2= 'static' | lv_type_0_3= 'lookup' ) ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) ( (lv_desc_3_0= RULE_STRING ) )? (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= '{' (otherlv_7= 'features' otherlv_8= '{' ( (lv_features_9_0= ruleFeature ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalUlmDsl2.g:621:3: ( ( (lv_type_0_1= 'data' | lv_type_0_2= 'static' | lv_type_0_3= 'lookup' ) ) )? otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) ( (lv_desc_3_0= RULE_STRING ) )? (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= '{' (otherlv_7= 'features' otherlv_8= '{' ( (lv_features_9_0= ruleFeature ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            // InternalUlmDsl2.g:621:3: ( ( (lv_type_0_1= 'data' | lv_type_0_2= 'static' | lv_type_0_3= 'lookup' ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=30 && LA13_0<=32)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalUlmDsl2.g:622:4: ( (lv_type_0_1= 'data' | lv_type_0_2= 'static' | lv_type_0_3= 'lookup' ) )
                    {
                    // InternalUlmDsl2.g:622:4: ( (lv_type_0_1= 'data' | lv_type_0_2= 'static' | lv_type_0_3= 'lookup' ) )
                    // InternalUlmDsl2.g:623:5: (lv_type_0_1= 'data' | lv_type_0_2= 'static' | lv_type_0_3= 'lookup' )
                    {
                    // InternalUlmDsl2.g:623:5: (lv_type_0_1= 'data' | lv_type_0_2= 'static' | lv_type_0_3= 'lookup' )
                    int alt12=3;
                    switch ( input.LA(1) ) {
                    case 30:
                        {
                        alt12=1;
                        }
                        break;
                    case 31:
                        {
                        alt12=2;
                        }
                        break;
                    case 32:
                        {
                        alt12=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 0, input);

                        throw nvae;
                    }

                    switch (alt12) {
                        case 1 :
                            // InternalUlmDsl2.g:624:6: lv_type_0_1= 'data'
                            {
                            lv_type_0_1=(Token)match(input,30,FOLLOW_21); 

                            						newLeafNode(lv_type_0_1, grammarAccess.getEntityAccess().getTypeDataKeyword_0_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getEntityRule());
                            						}
                            						setWithLastConsumed(current, "type", lv_type_0_1, null);
                            					

                            }
                            break;
                        case 2 :
                            // InternalUlmDsl2.g:635:6: lv_type_0_2= 'static'
                            {
                            lv_type_0_2=(Token)match(input,31,FOLLOW_21); 

                            						newLeafNode(lv_type_0_2, grammarAccess.getEntityAccess().getTypeStaticKeyword_0_0_1());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getEntityRule());
                            						}
                            						setWithLastConsumed(current, "type", lv_type_0_2, null);
                            					

                            }
                            break;
                        case 3 :
                            // InternalUlmDsl2.g:646:6: lv_type_0_3= 'lookup'
                            {
                            lv_type_0_3=(Token)match(input,32,FOLLOW_21); 

                            						newLeafNode(lv_type_0_3, grammarAccess.getEntityAccess().getTypeLookupKeyword_0_0_2());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getEntityRule());
                            						}
                            						setWithLastConsumed(current, "type", lv_type_0_3, null);
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getEntityKeyword_1());
            		
            // InternalUlmDsl2.g:663:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUlmDsl2.g:664:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUlmDsl2.g:664:4: (lv_name_2_0= RULE_ID )
            // InternalUlmDsl2.g:665:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_name_2_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUlmDsl2.g:681:3: ( (lv_desc_3_0= RULE_STRING ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalUlmDsl2.g:682:4: (lv_desc_3_0= RULE_STRING )
                    {
                    // InternalUlmDsl2.g:682:4: (lv_desc_3_0= RULE_STRING )
                    // InternalUlmDsl2.g:683:5: lv_desc_3_0= RULE_STRING
                    {
                    lv_desc_3_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

                    					newLeafNode(lv_desc_3_0, grammarAccess.getEntityAccess().getDescSTRINGTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEntityRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"desc",
                    						lv_desc_3_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalUlmDsl2.g:699:3: (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==34) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalUlmDsl2.g:700:4: otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,34,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getExtendsKeyword_4_0());
                    			
                    // InternalUlmDsl2.g:704:4: ( (otherlv_5= RULE_ID ) )
                    // InternalUlmDsl2.g:705:5: (otherlv_5= RULE_ID )
                    {
                    // InternalUlmDsl2.g:705:5: (otherlv_5= RULE_ID )
                    // InternalUlmDsl2.g:706:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEntityRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_4); 

                    						newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_6, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalUlmDsl2.g:722:3: (otherlv_7= 'features' otherlv_8= '{' ( (lv_features_9_0= ruleFeature ) )* otherlv_10= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==35) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalUlmDsl2.g:723:4: otherlv_7= 'features' otherlv_8= '{' ( (lv_features_9_0= ruleFeature ) )* otherlv_10= '}'
                    {
                    otherlv_7=(Token)match(input,35,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getEntityAccess().getFeaturesKeyword_6_0());
                    			
                    otherlv_8=(Token)match(input,12,FOLLOW_25); 

                    				newLeafNode(otherlv_8, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalUlmDsl2.g:731:4: ( (lv_features_9_0= ruleFeature ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==39) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalUlmDsl2.g:732:5: (lv_features_9_0= ruleFeature )
                    	    {
                    	    // InternalUlmDsl2.g:732:5: (lv_features_9_0= ruleFeature )
                    	    // InternalUlmDsl2.g:733:6: lv_features_9_0= ruleFeature
                    	    {

                    	    						newCompositeNode(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_6_2_0());
                    	    					
                    	    pushFollow(FOLLOW_25);
                    	    lv_features_9_0=ruleFeature();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getEntityRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"features",
                    	    							lv_features_9_0,
                    	    							"org.ulm.metaulm.xtext.UlmDsl2.Feature");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,13,FOLLOW_13); 

                    				newLeafNode(otherlv_10, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6_3());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleFeature"
    // InternalUlmDsl2.g:763:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalUlmDsl2.g:763:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalUlmDsl2.g:764:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
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
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalUlmDsl2.g:770:1: ruleFeature returns [EObject current=null] : ( ( (lv_featureType_0_0= ruleFeatureTypeType ) ) ( (lv_mandatory_1_0= 'mandatory' ) )? ( (lv_identifier_2_0= 'identifier' ) )? (otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )? otherlv_5= ';' ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token lv_mandatory_1_0=null;
        Token lv_identifier_2_0=null;
        Token otherlv_3=null;
        Token lv_alias_4_0=null;
        Token otherlv_5=null;
        EObject lv_featureType_0_0 = null;



        	enterRule();

        try {
            // InternalUlmDsl2.g:776:2: ( ( ( (lv_featureType_0_0= ruleFeatureTypeType ) ) ( (lv_mandatory_1_0= 'mandatory' ) )? ( (lv_identifier_2_0= 'identifier' ) )? (otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )? otherlv_5= ';' ) )
            // InternalUlmDsl2.g:777:2: ( ( (lv_featureType_0_0= ruleFeatureTypeType ) ) ( (lv_mandatory_1_0= 'mandatory' ) )? ( (lv_identifier_2_0= 'identifier' ) )? (otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )? otherlv_5= ';' )
            {
            // InternalUlmDsl2.g:777:2: ( ( (lv_featureType_0_0= ruleFeatureTypeType ) ) ( (lv_mandatory_1_0= 'mandatory' ) )? ( (lv_identifier_2_0= 'identifier' ) )? (otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )? otherlv_5= ';' )
            // InternalUlmDsl2.g:778:3: ( (lv_featureType_0_0= ruleFeatureTypeType ) ) ( (lv_mandatory_1_0= 'mandatory' ) )? ( (lv_identifier_2_0= 'identifier' ) )? (otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )? otherlv_5= ';'
            {
            // InternalUlmDsl2.g:778:3: ( (lv_featureType_0_0= ruleFeatureTypeType ) )
            // InternalUlmDsl2.g:779:4: (lv_featureType_0_0= ruleFeatureTypeType )
            {
            // InternalUlmDsl2.g:779:4: (lv_featureType_0_0= ruleFeatureTypeType )
            // InternalUlmDsl2.g:780:5: lv_featureType_0_0= ruleFeatureTypeType
            {

            					newCompositeNode(grammarAccess.getFeatureAccess().getFeatureTypeFeatureTypeTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_26);
            lv_featureType_0_0=ruleFeatureTypeType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFeatureRule());
            					}
            					set(
            						current,
            						"featureType",
            						lv_featureType_0_0,
            						"org.ulm.metaulm.xtext.UlmDsl2.FeatureTypeType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUlmDsl2.g:797:3: ( (lv_mandatory_1_0= 'mandatory' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==36) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalUlmDsl2.g:798:4: (lv_mandatory_1_0= 'mandatory' )
                    {
                    // InternalUlmDsl2.g:798:4: (lv_mandatory_1_0= 'mandatory' )
                    // InternalUlmDsl2.g:799:5: lv_mandatory_1_0= 'mandatory'
                    {
                    lv_mandatory_1_0=(Token)match(input,36,FOLLOW_27); 

                    					newLeafNode(lv_mandatory_1_0, grammarAccess.getFeatureAccess().getMandatoryMandatoryKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFeatureRule());
                    					}
                    					setWithLastConsumed(current, "mandatory", true, "mandatory");
                    				

                    }


                    }
                    break;

            }

            // InternalUlmDsl2.g:811:3: ( (lv_identifier_2_0= 'identifier' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==37) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalUlmDsl2.g:812:4: (lv_identifier_2_0= 'identifier' )
                    {
                    // InternalUlmDsl2.g:812:4: (lv_identifier_2_0= 'identifier' )
                    // InternalUlmDsl2.g:813:5: lv_identifier_2_0= 'identifier'
                    {
                    lv_identifier_2_0=(Token)match(input,37,FOLLOW_28); 

                    					newLeafNode(lv_identifier_2_0, grammarAccess.getFeatureAccess().getIdentifierIdentifierKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFeatureRule());
                    					}
                    					setWithLastConsumed(current, "identifier", true, "identifier");
                    				

                    }


                    }
                    break;

            }

            // InternalUlmDsl2.g:825:3: (otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==38) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalUlmDsl2.g:826:4: otherlv_3= 'as' ( (lv_alias_4_0= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getFeatureAccess().getAsKeyword_3_0());
                    			
                    // InternalUlmDsl2.g:830:4: ( (lv_alias_4_0= RULE_ID ) )
                    // InternalUlmDsl2.g:831:5: (lv_alias_4_0= RULE_ID )
                    {
                    // InternalUlmDsl2.g:831:5: (lv_alias_4_0= RULE_ID )
                    // InternalUlmDsl2.g:832:6: lv_alias_4_0= RULE_ID
                    {
                    lv_alias_4_0=(Token)match(input,RULE_ID,FOLLOW_17); 

                    						newLeafNode(lv_alias_4_0, grammarAccess.getFeatureAccess().getAliasIDTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFeatureRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"alias",
                    							lv_alias_4_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getFeatureAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleFeatureTypeType"
    // InternalUlmDsl2.g:857:1: entryRuleFeatureTypeType returns [EObject current=null] : iv_ruleFeatureTypeType= ruleFeatureTypeType EOF ;
    public final EObject entryRuleFeatureTypeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureTypeType = null;


        try {
            // InternalUlmDsl2.g:857:56: (iv_ruleFeatureTypeType= ruleFeatureTypeType EOF )
            // InternalUlmDsl2.g:858:2: iv_ruleFeatureTypeType= ruleFeatureTypeType EOF
            {
             newCompositeNode(grammarAccess.getFeatureTypeTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeatureTypeType=ruleFeatureTypeType();

            state._fsp--;

             current =iv_ruleFeatureTypeType; 
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
    // $ANTLR end "entryRuleFeatureTypeType"


    // $ANTLR start "ruleFeatureTypeType"
    // InternalUlmDsl2.g:864:1: ruleFeatureTypeType returns [EObject current=null] : ( ( (lv_type_0_0= ruleFeatureType ) ) ( ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) )? otherlv_3= ']' )? ) ;
    public final EObject ruleFeatureTypeType() throws RecognitionException {
        EObject current = null;

        Token lv_array_1_0=null;
        Token lv_length_2_0=null;
        Token otherlv_3=null;
        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalUlmDsl2.g:870:2: ( ( ( (lv_type_0_0= ruleFeatureType ) ) ( ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) )? otherlv_3= ']' )? ) )
            // InternalUlmDsl2.g:871:2: ( ( (lv_type_0_0= ruleFeatureType ) ) ( ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) )? otherlv_3= ']' )? )
            {
            // InternalUlmDsl2.g:871:2: ( ( (lv_type_0_0= ruleFeatureType ) ) ( ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) )? otherlv_3= ']' )? )
            // InternalUlmDsl2.g:872:3: ( (lv_type_0_0= ruleFeatureType ) ) ( ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) )? otherlv_3= ']' )?
            {
            // InternalUlmDsl2.g:872:3: ( (lv_type_0_0= ruleFeatureType ) )
            // InternalUlmDsl2.g:873:4: (lv_type_0_0= ruleFeatureType )
            {
            // InternalUlmDsl2.g:873:4: (lv_type_0_0= ruleFeatureType )
            // InternalUlmDsl2.g:874:5: lv_type_0_0= ruleFeatureType
            {

            					newCompositeNode(grammarAccess.getFeatureTypeTypeAccess().getTypeFeatureTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_18);
            lv_type_0_0=ruleFeatureType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFeatureTypeTypeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"org.ulm.metaulm.xtext.UlmDsl2.FeatureType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUlmDsl2.g:891:3: ( ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) )? otherlv_3= ']' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==21) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalUlmDsl2.g:892:4: ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) )? otherlv_3= ']'
                    {
                    // InternalUlmDsl2.g:892:4: ( (lv_array_1_0= '[' ) )
                    // InternalUlmDsl2.g:893:5: (lv_array_1_0= '[' )
                    {
                    // InternalUlmDsl2.g:893:5: (lv_array_1_0= '[' )
                    // InternalUlmDsl2.g:894:6: lv_array_1_0= '['
                    {
                    lv_array_1_0=(Token)match(input,21,FOLLOW_19); 

                    						newLeafNode(lv_array_1_0, grammarAccess.getFeatureTypeTypeAccess().getArrayLeftSquareBracketKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFeatureTypeTypeRule());
                    						}
                    						setWithLastConsumed(current, "array", true, "[");
                    					

                    }


                    }

                    // InternalUlmDsl2.g:906:4: ( (lv_length_2_0= RULE_INT ) )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==RULE_INT) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalUlmDsl2.g:907:5: (lv_length_2_0= RULE_INT )
                            {
                            // InternalUlmDsl2.g:907:5: (lv_length_2_0= RULE_INT )
                            // InternalUlmDsl2.g:908:6: lv_length_2_0= RULE_INT
                            {
                            lv_length_2_0=(Token)match(input,RULE_INT,FOLLOW_20); 

                            						newLeafNode(lv_length_2_0, grammarAccess.getFeatureTypeTypeAccess().getLengthINTTerminalRuleCall_1_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getFeatureTypeTypeRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"length",
                            							lv_length_2_0,
                            							"org.eclipse.xtext.common.Terminals.INT");
                            					

                            }


                            }
                            break;

                    }

                    otherlv_3=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getFeatureTypeTypeAccess().getRightSquareBracketKeyword_1_2());
                    			

                    }
                    break;

            }


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
    // $ANTLR end "ruleFeatureTypeType"


    // $ANTLR start "entryRuleFeatureType"
    // InternalUlmDsl2.g:933:1: entryRuleFeatureType returns [EObject current=null] : iv_ruleFeatureType= ruleFeatureType EOF ;
    public final EObject entryRuleFeatureType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureType = null;


        try {
            // InternalUlmDsl2.g:933:52: (iv_ruleFeatureType= ruleFeatureType EOF )
            // InternalUlmDsl2.g:934:2: iv_ruleFeatureType= ruleFeatureType EOF
            {
             newCompositeNode(grammarAccess.getFeatureTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeatureType=ruleFeatureType();

            state._fsp--;

             current =iv_ruleFeatureType; 
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
    // $ANTLR end "entryRuleFeatureType"


    // $ANTLR start "ruleFeatureType"
    // InternalUlmDsl2.g:940:1: ruleFeatureType returns [EObject current=null] : (otherlv_0= 'feature' ( ( (lv_t_1_1= ruleAttributeFeatureType | lv_t_1_2= ruleEntityFeatureType ) ) ) ) ;
    public final EObject ruleFeatureType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_t_1_1 = null;

        EObject lv_t_1_2 = null;



        	enterRule();

        try {
            // InternalUlmDsl2.g:946:2: ( (otherlv_0= 'feature' ( ( (lv_t_1_1= ruleAttributeFeatureType | lv_t_1_2= ruleEntityFeatureType ) ) ) ) )
            // InternalUlmDsl2.g:947:2: (otherlv_0= 'feature' ( ( (lv_t_1_1= ruleAttributeFeatureType | lv_t_1_2= ruleEntityFeatureType ) ) ) )
            {
            // InternalUlmDsl2.g:947:2: (otherlv_0= 'feature' ( ( (lv_t_1_1= ruleAttributeFeatureType | lv_t_1_2= ruleEntityFeatureType ) ) ) )
            // InternalUlmDsl2.g:948:3: otherlv_0= 'feature' ( ( (lv_t_1_1= ruleAttributeFeatureType | lv_t_1_2= ruleEntityFeatureType ) ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getFeatureTypeAccess().getFeatureKeyword_0());
            		
            // InternalUlmDsl2.g:952:3: ( ( (lv_t_1_1= ruleAttributeFeatureType | lv_t_1_2= ruleEntityFeatureType ) ) )
            // InternalUlmDsl2.g:953:4: ( (lv_t_1_1= ruleAttributeFeatureType | lv_t_1_2= ruleEntityFeatureType ) )
            {
            // InternalUlmDsl2.g:953:4: ( (lv_t_1_1= ruleAttributeFeatureType | lv_t_1_2= ruleEntityFeatureType ) )
            // InternalUlmDsl2.g:954:5: (lv_t_1_1= ruleAttributeFeatureType | lv_t_1_2= ruleEntityFeatureType )
            {
            // InternalUlmDsl2.g:954:5: (lv_t_1_1= ruleAttributeFeatureType | lv_t_1_2= ruleEntityFeatureType )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==19) ) {
                alt23=1;
            }
            else if ( (LA23_0==33) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalUlmDsl2.g:955:6: lv_t_1_1= ruleAttributeFeatureType
                    {

                    						newCompositeNode(grammarAccess.getFeatureTypeAccess().getTAttributeFeatureTypeParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_t_1_1=ruleAttributeFeatureType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFeatureTypeRule());
                    						}
                    						set(
                    							current,
                    							"t",
                    							lv_t_1_1,
                    							"org.ulm.metaulm.xtext.UlmDsl2.AttributeFeatureType");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalUlmDsl2.g:971:6: lv_t_1_2= ruleEntityFeatureType
                    {

                    						newCompositeNode(grammarAccess.getFeatureTypeAccess().getTEntityFeatureTypeParserRuleCall_1_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_t_1_2=ruleEntityFeatureType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFeatureTypeRule());
                    						}
                    						set(
                    							current,
                    							"t",
                    							lv_t_1_2,
                    							"org.ulm.metaulm.xtext.UlmDsl2.EntityFeatureType");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }


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
    // $ANTLR end "ruleFeatureType"


    // $ANTLR start "entryRuleAttributeFeatureType"
    // InternalUlmDsl2.g:993:1: entryRuleAttributeFeatureType returns [EObject current=null] : iv_ruleAttributeFeatureType= ruleAttributeFeatureType EOF ;
    public final EObject entryRuleAttributeFeatureType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeFeatureType = null;


        try {
            // InternalUlmDsl2.g:993:61: (iv_ruleAttributeFeatureType= ruleAttributeFeatureType EOF )
            // InternalUlmDsl2.g:994:2: iv_ruleAttributeFeatureType= ruleAttributeFeatureType EOF
            {
             newCompositeNode(grammarAccess.getAttributeFeatureTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeFeatureType=ruleAttributeFeatureType();

            state._fsp--;

             current =iv_ruleAttributeFeatureType; 
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
    // $ANTLR end "entryRuleAttributeFeatureType"


    // $ANTLR start "ruleAttributeFeatureType"
    // InternalUlmDsl2.g:1000:1: ruleAttributeFeatureType returns [EObject current=null] : (otherlv_0= 'attribute' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleAttributeFeatureType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalUlmDsl2.g:1006:2: ( (otherlv_0= 'attribute' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalUlmDsl2.g:1007:2: (otherlv_0= 'attribute' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalUlmDsl2.g:1007:2: (otherlv_0= 'attribute' ( (otherlv_1= RULE_ID ) ) )
            // InternalUlmDsl2.g:1008:3: otherlv_0= 'attribute' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeFeatureTypeAccess().getAttributeKeyword_0());
            		
            // InternalUlmDsl2.g:1012:3: ( (otherlv_1= RULE_ID ) )
            // InternalUlmDsl2.g:1013:4: (otherlv_1= RULE_ID )
            {
            // InternalUlmDsl2.g:1013:4: (otherlv_1= RULE_ID )
            // InternalUlmDsl2.g:1014:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeFeatureTypeRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getAttributeFeatureTypeAccess().getAttributeTypeAttributeCrossReference_1_0());
            				

            }


            }


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
    // $ANTLR end "ruleAttributeFeatureType"


    // $ANTLR start "entryRuleEntityFeatureType"
    // InternalUlmDsl2.g:1029:1: entryRuleEntityFeatureType returns [EObject current=null] : iv_ruleEntityFeatureType= ruleEntityFeatureType EOF ;
    public final EObject entryRuleEntityFeatureType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityFeatureType = null;


        try {
            // InternalUlmDsl2.g:1029:58: (iv_ruleEntityFeatureType= ruleEntityFeatureType EOF )
            // InternalUlmDsl2.g:1030:2: iv_ruleEntityFeatureType= ruleEntityFeatureType EOF
            {
             newCompositeNode(grammarAccess.getEntityFeatureTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityFeatureType=ruleEntityFeatureType();

            state._fsp--;

             current =iv_ruleEntityFeatureType; 
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
    // $ANTLR end "entryRuleEntityFeatureType"


    // $ANTLR start "ruleEntityFeatureType"
    // InternalUlmDsl2.g:1036:1: ruleEntityFeatureType returns [EObject current=null] : (otherlv_0= 'entity' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleEntityFeatureType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalUlmDsl2.g:1042:2: ( (otherlv_0= 'entity' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalUlmDsl2.g:1043:2: (otherlv_0= 'entity' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalUlmDsl2.g:1043:2: (otherlv_0= 'entity' ( (otherlv_1= RULE_ID ) ) )
            // InternalUlmDsl2.g:1044:3: otherlv_0= 'entity' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityFeatureTypeAccess().getEntityKeyword_0());
            		
            // InternalUlmDsl2.g:1048:3: ( (otherlv_1= RULE_ID ) )
            // InternalUlmDsl2.g:1049:4: (otherlv_1= RULE_ID )
            {
            // InternalUlmDsl2.g:1049:4: (otherlv_1= RULE_ID )
            // InternalUlmDsl2.g:1050:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityFeatureTypeRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getEntityFeatureTypeAccess().getEntityTypeEntityCrossReference_1_0());
            				

            }


            }


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
    // $ANTLR end "ruleEntityFeatureType"


    // $ANTLR start "entryRuleLookup"
    // InternalUlmDsl2.g:1065:1: entryRuleLookup returns [EObject current=null] : iv_ruleLookup= ruleLookup EOF ;
    public final EObject entryRuleLookup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLookup = null;


        try {
            // InternalUlmDsl2.g:1065:47: (iv_ruleLookup= ruleLookup EOF )
            // InternalUlmDsl2.g:1066:2: iv_ruleLookup= ruleLookup EOF
            {
             newCompositeNode(grammarAccess.getLookupRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLookup=ruleLookup();

            state._fsp--;

             current =iv_ruleLookup; 
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
    // $ANTLR end "entryRuleLookup"


    // $ANTLR start "ruleLookup"
    // InternalUlmDsl2.g:1072:1: ruleLookup returns [EObject current=null] : (otherlv_0= 'lookup' (this_LookupInt_1= ruleLookupInt | this_LookupString_2= ruleLookupString ) ) ;
    public final EObject ruleLookup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_LookupInt_1 = null;

        EObject this_LookupString_2 = null;



        	enterRule();

        try {
            // InternalUlmDsl2.g:1078:2: ( (otherlv_0= 'lookup' (this_LookupInt_1= ruleLookupInt | this_LookupString_2= ruleLookupString ) ) )
            // InternalUlmDsl2.g:1079:2: (otherlv_0= 'lookup' (this_LookupInt_1= ruleLookupInt | this_LookupString_2= ruleLookupString ) )
            {
            // InternalUlmDsl2.g:1079:2: (otherlv_0= 'lookup' (this_LookupInt_1= ruleLookupInt | this_LookupString_2= ruleLookupString ) )
            // InternalUlmDsl2.g:1080:3: otherlv_0= 'lookup' (this_LookupInt_1= ruleLookupInt | this_LookupString_2= ruleLookupString )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getLookupAccess().getLookupKeyword_0());
            		
            // InternalUlmDsl2.g:1084:3: (this_LookupInt_1= ruleLookupInt | this_LookupString_2= ruleLookupString )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==40) ) {
                alt24=1;
            }
            else if ( (LA24_0==23) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalUlmDsl2.g:1085:4: this_LookupInt_1= ruleLookupInt
                    {

                    				newCompositeNode(grammarAccess.getLookupAccess().getLookupIntParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_2);
                    this_LookupInt_1=ruleLookupInt();

                    state._fsp--;


                    				current = this_LookupInt_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalUlmDsl2.g:1094:4: this_LookupString_2= ruleLookupString
                    {

                    				newCompositeNode(grammarAccess.getLookupAccess().getLookupStringParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_LookupString_2=ruleLookupString();

                    state._fsp--;


                    				current = this_LookupString_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


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
    // $ANTLR end "ruleLookup"


    // $ANTLR start "entryRuleLookupInt"
    // InternalUlmDsl2.g:1107:1: entryRuleLookupInt returns [EObject current=null] : iv_ruleLookupInt= ruleLookupInt EOF ;
    public final EObject entryRuleLookupInt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLookupInt = null;


        try {
            // InternalUlmDsl2.g:1107:50: (iv_ruleLookupInt= ruleLookupInt EOF )
            // InternalUlmDsl2.g:1108:2: iv_ruleLookupInt= ruleLookupInt EOF
            {
             newCompositeNode(grammarAccess.getLookupIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLookupInt=ruleLookupInt();

            state._fsp--;

             current =iv_ruleLookupInt; 
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
    // $ANTLR end "entryRuleLookupInt"


    // $ANTLR start "ruleLookupInt"
    // InternalUlmDsl2.g:1114:1: ruleLookupInt returns [EObject current=null] : (otherlv_0= 'integer' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= 'values' otherlv_4= '{' ( (lv_values_5_0= ruleLookupIntValue ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleLookupIntValue ) ) )* otherlv_8= '}' otherlv_9= ';' ) ;
    public final EObject ruleLookupInt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_values_5_0 = null;

        EObject lv_values_7_0 = null;



        	enterRule();

        try {
            // InternalUlmDsl2.g:1120:2: ( (otherlv_0= 'integer' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= 'values' otherlv_4= '{' ( (lv_values_5_0= ruleLookupIntValue ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleLookupIntValue ) ) )* otherlv_8= '}' otherlv_9= ';' ) )
            // InternalUlmDsl2.g:1121:2: (otherlv_0= 'integer' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= 'values' otherlv_4= '{' ( (lv_values_5_0= ruleLookupIntValue ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleLookupIntValue ) ) )* otherlv_8= '}' otherlv_9= ';' )
            {
            // InternalUlmDsl2.g:1121:2: (otherlv_0= 'integer' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= 'values' otherlv_4= '{' ( (lv_values_5_0= ruleLookupIntValue ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleLookupIntValue ) ) )* otherlv_8= '}' otherlv_9= ';' )
            // InternalUlmDsl2.g:1122:3: otherlv_0= 'integer' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= 'values' otherlv_4= '{' ( (lv_values_5_0= ruleLookupIntValue ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleLookupIntValue ) ) )* otherlv_8= '}' otherlv_9= ';'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLookupIntAccess().getIntegerKeyword_0());
            		
            // InternalUlmDsl2.g:1126:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUlmDsl2.g:1127:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUlmDsl2.g:1127:4: (lv_name_1_0= RULE_ID )
            // InternalUlmDsl2.g:1128:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_31); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLookupIntAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLookupIntRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUlmDsl2.g:1144:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_STRING) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalUlmDsl2.g:1145:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUlmDsl2.g:1145:4: (lv_description_2_0= RULE_STRING )
                    // InternalUlmDsl2.g:1146:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getLookupIntAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLookupIntRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,41,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getLookupIntAccess().getValuesKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_33); 

            			newLeafNode(otherlv_4, grammarAccess.getLookupIntAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalUlmDsl2.g:1170:3: ( (lv_values_5_0= ruleLookupIntValue ) )
            // InternalUlmDsl2.g:1171:4: (lv_values_5_0= ruleLookupIntValue )
            {
            // InternalUlmDsl2.g:1171:4: (lv_values_5_0= ruleLookupIntValue )
            // InternalUlmDsl2.g:1172:5: lv_values_5_0= ruleLookupIntValue
            {

            					newCompositeNode(grammarAccess.getLookupIntAccess().getValuesLookupIntValueParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_34);
            lv_values_5_0=ruleLookupIntValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLookupIntRule());
            					}
            					add(
            						current,
            						"values",
            						lv_values_5_0,
            						"org.ulm.metaulm.xtext.UlmDsl2.LookupIntValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUlmDsl2.g:1189:3: (otherlv_6= ',' ( (lv_values_7_0= ruleLookupIntValue ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==42) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalUlmDsl2.g:1190:4: otherlv_6= ',' ( (lv_values_7_0= ruleLookupIntValue ) )
            	    {
            	    otherlv_6=(Token)match(input,42,FOLLOW_33); 

            	    				newLeafNode(otherlv_6, grammarAccess.getLookupIntAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalUlmDsl2.g:1194:4: ( (lv_values_7_0= ruleLookupIntValue ) )
            	    // InternalUlmDsl2.g:1195:5: (lv_values_7_0= ruleLookupIntValue )
            	    {
            	    // InternalUlmDsl2.g:1195:5: (lv_values_7_0= ruleLookupIntValue )
            	    // InternalUlmDsl2.g:1196:6: lv_values_7_0= ruleLookupIntValue
            	    {

            	    						newCompositeNode(grammarAccess.getLookupIntAccess().getValuesLookupIntValueParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_34);
            	    lv_values_7_0=ruleLookupIntValue();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLookupIntRule());
            	    						}
            	    						add(
            	    							current,
            	    							"values",
            	    							lv_values_7_0,
            	    							"org.ulm.metaulm.xtext.UlmDsl2.LookupIntValue");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            otherlv_8=(Token)match(input,13,FOLLOW_17); 

            			newLeafNode(otherlv_8, grammarAccess.getLookupIntAccess().getRightCurlyBracketKeyword_7());
            		
            otherlv_9=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getLookupIntAccess().getSemicolonKeyword_8());
            		

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
    // $ANTLR end "ruleLookupInt"


    // $ANTLR start "entryRuleLookupString"
    // InternalUlmDsl2.g:1226:1: entryRuleLookupString returns [EObject current=null] : iv_ruleLookupString= ruleLookupString EOF ;
    public final EObject entryRuleLookupString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLookupString = null;


        try {
            // InternalUlmDsl2.g:1226:53: (iv_ruleLookupString= ruleLookupString EOF )
            // InternalUlmDsl2.g:1227:2: iv_ruleLookupString= ruleLookupString EOF
            {
             newCompositeNode(grammarAccess.getLookupStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLookupString=ruleLookupString();

            state._fsp--;

             current =iv_ruleLookupString; 
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
    // $ANTLR end "entryRuleLookupString"


    // $ANTLR start "ruleLookupString"
    // InternalUlmDsl2.g:1233:1: ruleLookupString returns [EObject current=null] : (otherlv_0= 'string' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= 'values' otherlv_4= '{' ( (lv_values_5_0= ruleLookupStringValue ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleLookupStringValue ) ) )* otherlv_8= '}' otherlv_9= ';' ) ;
    public final EObject ruleLookupString() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_values_5_0 = null;

        EObject lv_values_7_0 = null;



        	enterRule();

        try {
            // InternalUlmDsl2.g:1239:2: ( (otherlv_0= 'string' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= 'values' otherlv_4= '{' ( (lv_values_5_0= ruleLookupStringValue ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleLookupStringValue ) ) )* otherlv_8= '}' otherlv_9= ';' ) )
            // InternalUlmDsl2.g:1240:2: (otherlv_0= 'string' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= 'values' otherlv_4= '{' ( (lv_values_5_0= ruleLookupStringValue ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleLookupStringValue ) ) )* otherlv_8= '}' otherlv_9= ';' )
            {
            // InternalUlmDsl2.g:1240:2: (otherlv_0= 'string' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= 'values' otherlv_4= '{' ( (lv_values_5_0= ruleLookupStringValue ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleLookupStringValue ) ) )* otherlv_8= '}' otherlv_9= ';' )
            // InternalUlmDsl2.g:1241:3: otherlv_0= 'string' ( (lv_name_1_0= RULE_ID ) ) ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= 'values' otherlv_4= '{' ( (lv_values_5_0= ruleLookupStringValue ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleLookupStringValue ) ) )* otherlv_8= '}' otherlv_9= ';'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLookupStringAccess().getStringKeyword_0());
            		
            // InternalUlmDsl2.g:1245:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUlmDsl2.g:1246:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUlmDsl2.g:1246:4: (lv_name_1_0= RULE_ID )
            // InternalUlmDsl2.g:1247:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_31); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLookupStringAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLookupStringRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUlmDsl2.g:1263:3: ( (lv_description_2_0= RULE_STRING ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_STRING) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalUlmDsl2.g:1264:4: (lv_description_2_0= RULE_STRING )
                    {
                    // InternalUlmDsl2.g:1264:4: (lv_description_2_0= RULE_STRING )
                    // InternalUlmDsl2.g:1265:5: lv_description_2_0= RULE_STRING
                    {
                    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

                    					newLeafNode(lv_description_2_0, grammarAccess.getLookupStringAccess().getDescriptionSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLookupStringRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,41,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getLookupStringAccess().getValuesKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_33); 

            			newLeafNode(otherlv_4, grammarAccess.getLookupStringAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalUlmDsl2.g:1289:3: ( (lv_values_5_0= ruleLookupStringValue ) )
            // InternalUlmDsl2.g:1290:4: (lv_values_5_0= ruleLookupStringValue )
            {
            // InternalUlmDsl2.g:1290:4: (lv_values_5_0= ruleLookupStringValue )
            // InternalUlmDsl2.g:1291:5: lv_values_5_0= ruleLookupStringValue
            {

            					newCompositeNode(grammarAccess.getLookupStringAccess().getValuesLookupStringValueParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_34);
            lv_values_5_0=ruleLookupStringValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLookupStringRule());
            					}
            					add(
            						current,
            						"values",
            						lv_values_5_0,
            						"org.ulm.metaulm.xtext.UlmDsl2.LookupStringValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUlmDsl2.g:1308:3: (otherlv_6= ',' ( (lv_values_7_0= ruleLookupStringValue ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==42) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalUlmDsl2.g:1309:4: otherlv_6= ',' ( (lv_values_7_0= ruleLookupStringValue ) )
            	    {
            	    otherlv_6=(Token)match(input,42,FOLLOW_33); 

            	    				newLeafNode(otherlv_6, grammarAccess.getLookupStringAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalUlmDsl2.g:1313:4: ( (lv_values_7_0= ruleLookupStringValue ) )
            	    // InternalUlmDsl2.g:1314:5: (lv_values_7_0= ruleLookupStringValue )
            	    {
            	    // InternalUlmDsl2.g:1314:5: (lv_values_7_0= ruleLookupStringValue )
            	    // InternalUlmDsl2.g:1315:6: lv_values_7_0= ruleLookupStringValue
            	    {

            	    						newCompositeNode(grammarAccess.getLookupStringAccess().getValuesLookupStringValueParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_34);
            	    lv_values_7_0=ruleLookupStringValue();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLookupStringRule());
            	    						}
            	    						add(
            	    							current,
            	    							"values",
            	    							lv_values_7_0,
            	    							"org.ulm.metaulm.xtext.UlmDsl2.LookupStringValue");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            otherlv_8=(Token)match(input,13,FOLLOW_17); 

            			newLeafNode(otherlv_8, grammarAccess.getLookupStringAccess().getRightCurlyBracketKeyword_7());
            		
            otherlv_9=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getLookupStringAccess().getSemicolonKeyword_8());
            		

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
    // $ANTLR end "ruleLookupString"


    // $ANTLR start "entryRuleLookupIntValue"
    // InternalUlmDsl2.g:1345:1: entryRuleLookupIntValue returns [EObject current=null] : iv_ruleLookupIntValue= ruleLookupIntValue EOF ;
    public final EObject entryRuleLookupIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLookupIntValue = null;


        try {
            // InternalUlmDsl2.g:1345:55: (iv_ruleLookupIntValue= ruleLookupIntValue EOF )
            // InternalUlmDsl2.g:1346:2: iv_ruleLookupIntValue= ruleLookupIntValue EOF
            {
             newCompositeNode(grammarAccess.getLookupIntValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLookupIntValue=ruleLookupIntValue();

            state._fsp--;

             current =iv_ruleLookupIntValue; 
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
    // $ANTLR end "entryRuleLookupIntValue"


    // $ANTLR start "ruleLookupIntValue"
    // InternalUlmDsl2.g:1352:1: ruleLookupIntValue returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_value_2_0= RULE_INT ) ) ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' ) ;
    public final EObject ruleLookupIntValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token lv_description_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalUlmDsl2.g:1358:2: ( ( () otherlv_1= '(' ( (lv_value_2_0= RULE_INT ) ) ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' ) )
            // InternalUlmDsl2.g:1359:2: ( () otherlv_1= '(' ( (lv_value_2_0= RULE_INT ) ) ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' )
            {
            // InternalUlmDsl2.g:1359:2: ( () otherlv_1= '(' ( (lv_value_2_0= RULE_INT ) ) ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' )
            // InternalUlmDsl2.g:1360:3: () otherlv_1= '(' ( (lv_value_2_0= RULE_INT ) ) ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')'
            {
            // InternalUlmDsl2.g:1360:3: ()
            // InternalUlmDsl2.g:1361:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLookupIntValueAccess().getLookupIntValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,43,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getLookupIntValueAccess().getLeftParenthesisKeyword_1());
            		
            // InternalUlmDsl2.g:1371:3: ( (lv_value_2_0= RULE_INT ) )
            // InternalUlmDsl2.g:1372:4: (lv_value_2_0= RULE_INT )
            {
            // InternalUlmDsl2.g:1372:4: (lv_value_2_0= RULE_INT )
            // InternalUlmDsl2.g:1373:5: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_35); 

            					newLeafNode(lv_value_2_0, grammarAccess.getLookupIntValueAccess().getValueINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLookupIntValueRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalUlmDsl2.g:1389:3: ( (lv_description_3_0= RULE_STRING ) )
            // InternalUlmDsl2.g:1390:4: (lv_description_3_0= RULE_STRING )
            {
            // InternalUlmDsl2.g:1390:4: (lv_description_3_0= RULE_STRING )
            // InternalUlmDsl2.g:1391:5: lv_description_3_0= RULE_STRING
            {
            lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_36); 

            					newLeafNode(lv_description_3_0, grammarAccess.getLookupIntValueAccess().getDescriptionSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLookupIntValueRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,44,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getLookupIntValueAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleLookupIntValue"


    // $ANTLR start "entryRuleLookupStringValue"
    // InternalUlmDsl2.g:1415:1: entryRuleLookupStringValue returns [EObject current=null] : iv_ruleLookupStringValue= ruleLookupStringValue EOF ;
    public final EObject entryRuleLookupStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLookupStringValue = null;


        try {
            // InternalUlmDsl2.g:1415:58: (iv_ruleLookupStringValue= ruleLookupStringValue EOF )
            // InternalUlmDsl2.g:1416:2: iv_ruleLookupStringValue= ruleLookupStringValue EOF
            {
             newCompositeNode(grammarAccess.getLookupStringValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLookupStringValue=ruleLookupStringValue();

            state._fsp--;

             current =iv_ruleLookupStringValue; 
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
    // $ANTLR end "entryRuleLookupStringValue"


    // $ANTLR start "ruleLookupStringValue"
    // InternalUlmDsl2.g:1422:1: ruleLookupStringValue returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_value_2_0= RULE_STRING ) ) ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' ) ;
    public final EObject ruleLookupStringValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token lv_description_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalUlmDsl2.g:1428:2: ( ( () otherlv_1= '(' ( (lv_value_2_0= RULE_STRING ) ) ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' ) )
            // InternalUlmDsl2.g:1429:2: ( () otherlv_1= '(' ( (lv_value_2_0= RULE_STRING ) ) ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' )
            {
            // InternalUlmDsl2.g:1429:2: ( () otherlv_1= '(' ( (lv_value_2_0= RULE_STRING ) ) ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' )
            // InternalUlmDsl2.g:1430:3: () otherlv_1= '(' ( (lv_value_2_0= RULE_STRING ) ) ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')'
            {
            // InternalUlmDsl2.g:1430:3: ()
            // InternalUlmDsl2.g:1431:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLookupStringValueAccess().getLookupStringValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,43,FOLLOW_35); 

            			newLeafNode(otherlv_1, grammarAccess.getLookupStringValueAccess().getLeftParenthesisKeyword_1());
            		
            // InternalUlmDsl2.g:1441:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalUlmDsl2.g:1442:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalUlmDsl2.g:1442:4: (lv_value_2_0= RULE_STRING )
            // InternalUlmDsl2.g:1443:5: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_35); 

            					newLeafNode(lv_value_2_0, grammarAccess.getLookupStringValueAccess().getValueSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLookupStringValueRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalUlmDsl2.g:1459:3: ( (lv_description_3_0= RULE_STRING ) )
            // InternalUlmDsl2.g:1460:4: (lv_description_3_0= RULE_STRING )
            {
            // InternalUlmDsl2.g:1460:4: (lv_description_3_0= RULE_STRING )
            // InternalUlmDsl2.g:1461:5: lv_description_3_0= RULE_STRING
            {
            lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_36); 

            					newLeafNode(lv_description_3_0, grammarAccess.getLookupStringValueAccess().getDescriptionSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLookupStringValueRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,44,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getLookupStringValueAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleLookupStringValue"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000003A000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000032000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000100002000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000003C0002000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000003F800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000400001040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000400001000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800002000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000008000002000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000007000100000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000006000100000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000004000100000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200080000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000010000800000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000020000000040L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000040000002000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000100000000000L});

}