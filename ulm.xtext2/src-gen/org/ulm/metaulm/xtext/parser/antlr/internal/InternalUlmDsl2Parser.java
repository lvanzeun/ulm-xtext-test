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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'{'", "'}'", "'context'", "'attributes'", "'lookups'", "'entities'", "'.'", "';'", "'int'", "'boolean'", "'date'", "'datetime'", "'timestamp'", "'string'", "'['", "']'", "'decimal'", "','", "'data'", "'static'", "'lookup'", "'extends'", "'mandatory'", "'identifier'", "'as'", "'bounded'", "'references'", "'integer'", "'values'", "'('", "':'", "')'"
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

                        if ( (LA2_0==RULE_ID) ) {
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
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getContextAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalUlmDsl2.g:234:4: ( (lv_lookups_10_0= ruleLookup ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_ID) ) {
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
                    	    					
                    	    pushFollow(FOLLOW_8);
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

                    otherlv_11=(Token)match(input,13,FOLLOW_10); 

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
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_11); 

                    				newLeafNode(otherlv_13, grammarAccess.getContextAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalUlmDsl2.g:267:4: ( (lv_entities_14_0= ruleEntity ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_ID||(LA6_0>=30 && LA6_0<=32)) ) {
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
                    	    					
                    	    pushFollow(FOLLOW_11);
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

                    otherlv_15=(Token)match(input,13,FOLLOW_12); 

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
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_13); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getVersionAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,18,FOLLOW_6); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getVersionAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_13); 

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
    // InternalUlmDsl2.g:356:1: ruleAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_type_1_1= ruleAttributeType | lv_type_1_2= ruleAttributeStringType | lv_type_1_3= ruleAttributeDecimalType ) ) ) ( (lv_desc_2_0= RULE_STRING ) )? otherlv_3= ';' ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_desc_2_0=null;
        Token otherlv_3=null;
        EObject lv_type_1_1 = null;

        EObject lv_type_1_2 = null;

        EObject lv_type_1_3 = null;



        	enterRule();

        try {
            // InternalUlmDsl2.g:362:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_type_1_1= ruleAttributeType | lv_type_1_2= ruleAttributeStringType | lv_type_1_3= ruleAttributeDecimalType ) ) ) ( (lv_desc_2_0= RULE_STRING ) )? otherlv_3= ';' ) )
            // InternalUlmDsl2.g:363:2: ( ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_type_1_1= ruleAttributeType | lv_type_1_2= ruleAttributeStringType | lv_type_1_3= ruleAttributeDecimalType ) ) ) ( (lv_desc_2_0= RULE_STRING ) )? otherlv_3= ';' )
            {
            // InternalUlmDsl2.g:363:2: ( ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_type_1_1= ruleAttributeType | lv_type_1_2= ruleAttributeStringType | lv_type_1_3= ruleAttributeDecimalType ) ) ) ( (lv_desc_2_0= RULE_STRING ) )? otherlv_3= ';' )
            // InternalUlmDsl2.g:364:3: ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_type_1_1= ruleAttributeType | lv_type_1_2= ruleAttributeStringType | lv_type_1_3= ruleAttributeDecimalType ) ) ) ( (lv_desc_2_0= RULE_STRING ) )? otherlv_3= ';'
            {
            // InternalUlmDsl2.g:364:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalUlmDsl2.g:365:4: (lv_name_0_0= RULE_ID )
            {
            // InternalUlmDsl2.g:365:4: (lv_name_0_0= RULE_ID )
            // InternalUlmDsl2.g:366:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_0_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUlmDsl2.g:382:3: ( ( (lv_type_1_1= ruleAttributeType | lv_type_1_2= ruleAttributeStringType | lv_type_1_3= ruleAttributeDecimalType ) ) )
            // InternalUlmDsl2.g:383:4: ( (lv_type_1_1= ruleAttributeType | lv_type_1_2= ruleAttributeStringType | lv_type_1_3= ruleAttributeDecimalType ) )
            {
            // InternalUlmDsl2.g:383:4: ( (lv_type_1_1= ruleAttributeType | lv_type_1_2= ruleAttributeStringType | lv_type_1_3= ruleAttributeDecimalType ) )
            // InternalUlmDsl2.g:384:5: (lv_type_1_1= ruleAttributeType | lv_type_1_2= ruleAttributeStringType | lv_type_1_3= ruleAttributeDecimalType )
            {
            // InternalUlmDsl2.g:384:5: (lv_type_1_1= ruleAttributeType | lv_type_1_2= ruleAttributeStringType | lv_type_1_3= ruleAttributeDecimalType )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
                {
                alt8=1;
                }
                break;
            case 25:
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
                    // InternalUlmDsl2.g:385:6: lv_type_1_1= ruleAttributeType
                    {

                    						newCompositeNode(grammarAccess.getAttributeAccess().getTypeAttributeTypeParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_type_1_1=ruleAttributeType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_1_1,
                    							"org.ulm.metaulm.xtext.UlmDsl2.AttributeType");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalUlmDsl2.g:401:6: lv_type_1_2= ruleAttributeStringType
                    {

                    						newCompositeNode(grammarAccess.getAttributeAccess().getTypeAttributeStringTypeParserRuleCall_1_0_1());
                    					
                    pushFollow(FOLLOW_15);
                    lv_type_1_2=ruleAttributeStringType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_1_2,
                    							"org.ulm.metaulm.xtext.UlmDsl2.AttributeStringType");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 3 :
                    // InternalUlmDsl2.g:417:6: lv_type_1_3= ruleAttributeDecimalType
                    {

                    						newCompositeNode(grammarAccess.getAttributeAccess().getTypeAttributeDecimalTypeParserRuleCall_1_0_2());
                    					
                    pushFollow(FOLLOW_15);
                    lv_type_1_3=ruleAttributeDecimalType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_1_3,
                    							"org.ulm.metaulm.xtext.UlmDsl2.AttributeDecimalType");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            // InternalUlmDsl2.g:435:3: ( (lv_desc_2_0= RULE_STRING ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalUlmDsl2.g:436:4: (lv_desc_2_0= RULE_STRING )
                    {
                    // InternalUlmDsl2.g:436:4: (lv_desc_2_0= RULE_STRING )
                    // InternalUlmDsl2.g:437:5: lv_desc_2_0= RULE_STRING
                    {
                    lv_desc_2_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

                    					newLeafNode(lv_desc_2_0, grammarAccess.getAttributeAccess().getDescSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"desc",
                    						lv_desc_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getSemicolonKeyword_3());
            		

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
    // InternalUlmDsl2.g:461:1: entryRuleAttributeType returns [EObject current=null] : iv_ruleAttributeType= ruleAttributeType EOF ;
    public final EObject entryRuleAttributeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeType = null;


        try {
            // InternalUlmDsl2.g:461:54: (iv_ruleAttributeType= ruleAttributeType EOF )
            // InternalUlmDsl2.g:462:2: iv_ruleAttributeType= ruleAttributeType EOF
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
    // InternalUlmDsl2.g:468:1: ruleAttributeType returns [EObject current=null] : ( ( (lv_name_0_1= 'int' | lv_name_0_2= 'boolean' | lv_name_0_3= 'date' | lv_name_0_4= 'datetime' | lv_name_0_5= 'timestamp' ) ) ) ;
    public final EObject ruleAttributeType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token lv_name_0_3=null;
        Token lv_name_0_4=null;
        Token lv_name_0_5=null;


        	enterRule();

        try {
            // InternalUlmDsl2.g:474:2: ( ( ( (lv_name_0_1= 'int' | lv_name_0_2= 'boolean' | lv_name_0_3= 'date' | lv_name_0_4= 'datetime' | lv_name_0_5= 'timestamp' ) ) ) )
            // InternalUlmDsl2.g:475:2: ( ( (lv_name_0_1= 'int' | lv_name_0_2= 'boolean' | lv_name_0_3= 'date' | lv_name_0_4= 'datetime' | lv_name_0_5= 'timestamp' ) ) )
            {
            // InternalUlmDsl2.g:475:2: ( ( (lv_name_0_1= 'int' | lv_name_0_2= 'boolean' | lv_name_0_3= 'date' | lv_name_0_4= 'datetime' | lv_name_0_5= 'timestamp' ) ) )
            // InternalUlmDsl2.g:476:3: ( (lv_name_0_1= 'int' | lv_name_0_2= 'boolean' | lv_name_0_3= 'date' | lv_name_0_4= 'datetime' | lv_name_0_5= 'timestamp' ) )
            {
            // InternalUlmDsl2.g:476:3: ( (lv_name_0_1= 'int' | lv_name_0_2= 'boolean' | lv_name_0_3= 'date' | lv_name_0_4= 'datetime' | lv_name_0_5= 'timestamp' ) )
            // InternalUlmDsl2.g:477:4: (lv_name_0_1= 'int' | lv_name_0_2= 'boolean' | lv_name_0_3= 'date' | lv_name_0_4= 'datetime' | lv_name_0_5= 'timestamp' )
            {
            // InternalUlmDsl2.g:477:4: (lv_name_0_1= 'int' | lv_name_0_2= 'boolean' | lv_name_0_3= 'date' | lv_name_0_4= 'datetime' | lv_name_0_5= 'timestamp' )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt10=1;
                }
                break;
            case 21:
                {
                alt10=2;
                }
                break;
            case 22:
                {
                alt10=3;
                }
                break;
            case 23:
                {
                alt10=4;
                }
                break;
            case 24:
                {
                alt10=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalUlmDsl2.g:478:5: lv_name_0_1= 'int'
                    {
                    lv_name_0_1=(Token)match(input,20,FOLLOW_2); 

                    					newLeafNode(lv_name_0_1, grammarAccess.getAttributeTypeAccess().getNameIntKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeTypeRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalUlmDsl2.g:489:5: lv_name_0_2= 'boolean'
                    {
                    lv_name_0_2=(Token)match(input,21,FOLLOW_2); 

                    					newLeafNode(lv_name_0_2, grammarAccess.getAttributeTypeAccess().getNameBooleanKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeTypeRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalUlmDsl2.g:500:5: lv_name_0_3= 'date'
                    {
                    lv_name_0_3=(Token)match(input,22,FOLLOW_2); 

                    					newLeafNode(lv_name_0_3, grammarAccess.getAttributeTypeAccess().getNameDateKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeTypeRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalUlmDsl2.g:511:5: lv_name_0_4= 'datetime'
                    {
                    lv_name_0_4=(Token)match(input,23,FOLLOW_2); 

                    					newLeafNode(lv_name_0_4, grammarAccess.getAttributeTypeAccess().getNameDatetimeKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeTypeRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_4, null);
                    				

                    }
                    break;
                case 5 :
                    // InternalUlmDsl2.g:522:5: lv_name_0_5= 'timestamp'
                    {
                    lv_name_0_5=(Token)match(input,24,FOLLOW_2); 

                    					newLeafNode(lv_name_0_5, grammarAccess.getAttributeTypeAccess().getNameTimestampKeyword_0_4());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeTypeRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_5, null);
                    				

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
    // $ANTLR end "ruleAttributeType"


    // $ANTLR start "entryRuleAttributeStringType"
    // InternalUlmDsl2.g:538:1: entryRuleAttributeStringType returns [EObject current=null] : iv_ruleAttributeStringType= ruleAttributeStringType EOF ;
    public final EObject entryRuleAttributeStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeStringType = null;


        try {
            // InternalUlmDsl2.g:538:60: (iv_ruleAttributeStringType= ruleAttributeStringType EOF )
            // InternalUlmDsl2.g:539:2: iv_ruleAttributeStringType= ruleAttributeStringType EOF
            {
             newCompositeNode(grammarAccess.getAttributeStringTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeStringType=ruleAttributeStringType();

            state._fsp--;

             current =iv_ruleAttributeStringType; 
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
    // $ANTLR end "entryRuleAttributeStringType"


    // $ANTLR start "ruleAttributeStringType"
    // InternalUlmDsl2.g:545:1: ruleAttributeStringType returns [EObject current=null] : ( ( (lv_name_0_0= 'string' ) ) ( ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) ) otherlv_3= ']' )? ) ;
    public final EObject ruleAttributeStringType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_array_1_0=null;
        Token lv_length_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalUlmDsl2.g:551:2: ( ( ( (lv_name_0_0= 'string' ) ) ( ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) ) otherlv_3= ']' )? ) )
            // InternalUlmDsl2.g:552:2: ( ( (lv_name_0_0= 'string' ) ) ( ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) ) otherlv_3= ']' )? )
            {
            // InternalUlmDsl2.g:552:2: ( ( (lv_name_0_0= 'string' ) ) ( ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) ) otherlv_3= ']' )? )
            // InternalUlmDsl2.g:553:3: ( (lv_name_0_0= 'string' ) ) ( ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) ) otherlv_3= ']' )?
            {
            // InternalUlmDsl2.g:553:3: ( (lv_name_0_0= 'string' ) )
            // InternalUlmDsl2.g:554:4: (lv_name_0_0= 'string' )
            {
            // InternalUlmDsl2.g:554:4: (lv_name_0_0= 'string' )
            // InternalUlmDsl2.g:555:5: lv_name_0_0= 'string'
            {
            lv_name_0_0=(Token)match(input,25,FOLLOW_17); 

            					newLeafNode(lv_name_0_0, grammarAccess.getAttributeStringTypeAccess().getNameStringKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeStringTypeRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "string");
            				

            }


            }

            // InternalUlmDsl2.g:567:3: ( ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) ) otherlv_3= ']' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalUlmDsl2.g:568:4: ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) ) otherlv_3= ']'
                    {
                    // InternalUlmDsl2.g:568:4: ( (lv_array_1_0= '[' ) )
                    // InternalUlmDsl2.g:569:5: (lv_array_1_0= '[' )
                    {
                    // InternalUlmDsl2.g:569:5: (lv_array_1_0= '[' )
                    // InternalUlmDsl2.g:570:6: lv_array_1_0= '['
                    {
                    lv_array_1_0=(Token)match(input,26,FOLLOW_6); 

                    						newLeafNode(lv_array_1_0, grammarAccess.getAttributeStringTypeAccess().getArrayLeftSquareBracketKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAttributeStringTypeRule());
                    						}
                    						setWithLastConsumed(current, "array", true, "[");
                    					

                    }


                    }

                    // InternalUlmDsl2.g:582:4: ( (lv_length_2_0= RULE_INT ) )
                    // InternalUlmDsl2.g:583:5: (lv_length_2_0= RULE_INT )
                    {
                    // InternalUlmDsl2.g:583:5: (lv_length_2_0= RULE_INT )
                    // InternalUlmDsl2.g:584:6: lv_length_2_0= RULE_INT
                    {
                    lv_length_2_0=(Token)match(input,RULE_INT,FOLLOW_18); 

                    						newLeafNode(lv_length_2_0, grammarAccess.getAttributeStringTypeAccess().getLengthINTTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAttributeStringTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"length",
                    							lv_length_2_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getAttributeStringTypeAccess().getRightSquareBracketKeyword_1_2());
                    			

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
    // $ANTLR end "ruleAttributeStringType"


    // $ANTLR start "entryRuleAttributeDecimalType"
    // InternalUlmDsl2.g:609:1: entryRuleAttributeDecimalType returns [EObject current=null] : iv_ruleAttributeDecimalType= ruleAttributeDecimalType EOF ;
    public final EObject entryRuleAttributeDecimalType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeDecimalType = null;


        try {
            // InternalUlmDsl2.g:609:61: (iv_ruleAttributeDecimalType= ruleAttributeDecimalType EOF )
            // InternalUlmDsl2.g:610:2: iv_ruleAttributeDecimalType= ruleAttributeDecimalType EOF
            {
             newCompositeNode(grammarAccess.getAttributeDecimalTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeDecimalType=ruleAttributeDecimalType();

            state._fsp--;

             current =iv_ruleAttributeDecimalType; 
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
    // $ANTLR end "entryRuleAttributeDecimalType"


    // $ANTLR start "ruleAttributeDecimalType"
    // InternalUlmDsl2.g:616:1: ruleAttributeDecimalType returns [EObject current=null] : ( ( (lv_name_0_0= 'decimal' ) ) ( ( (lv_array_1_0= '[' ) ) ( (lv_scale_2_0= RULE_INT ) ) (otherlv_3= ',' ( (lv_precision_4_0= RULE_INT ) ) )? otherlv_5= ']' )? ) ;
    public final EObject ruleAttributeDecimalType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_array_1_0=null;
        Token lv_scale_2_0=null;
        Token otherlv_3=null;
        Token lv_precision_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalUlmDsl2.g:622:2: ( ( ( (lv_name_0_0= 'decimal' ) ) ( ( (lv_array_1_0= '[' ) ) ( (lv_scale_2_0= RULE_INT ) ) (otherlv_3= ',' ( (lv_precision_4_0= RULE_INT ) ) )? otherlv_5= ']' )? ) )
            // InternalUlmDsl2.g:623:2: ( ( (lv_name_0_0= 'decimal' ) ) ( ( (lv_array_1_0= '[' ) ) ( (lv_scale_2_0= RULE_INT ) ) (otherlv_3= ',' ( (lv_precision_4_0= RULE_INT ) ) )? otherlv_5= ']' )? )
            {
            // InternalUlmDsl2.g:623:2: ( ( (lv_name_0_0= 'decimal' ) ) ( ( (lv_array_1_0= '[' ) ) ( (lv_scale_2_0= RULE_INT ) ) (otherlv_3= ',' ( (lv_precision_4_0= RULE_INT ) ) )? otherlv_5= ']' )? )
            // InternalUlmDsl2.g:624:3: ( (lv_name_0_0= 'decimal' ) ) ( ( (lv_array_1_0= '[' ) ) ( (lv_scale_2_0= RULE_INT ) ) (otherlv_3= ',' ( (lv_precision_4_0= RULE_INT ) ) )? otherlv_5= ']' )?
            {
            // InternalUlmDsl2.g:624:3: ( (lv_name_0_0= 'decimal' ) )
            // InternalUlmDsl2.g:625:4: (lv_name_0_0= 'decimal' )
            {
            // InternalUlmDsl2.g:625:4: (lv_name_0_0= 'decimal' )
            // InternalUlmDsl2.g:626:5: lv_name_0_0= 'decimal'
            {
            lv_name_0_0=(Token)match(input,28,FOLLOW_17); 

            					newLeafNode(lv_name_0_0, grammarAccess.getAttributeDecimalTypeAccess().getNameDecimalKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeDecimalTypeRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "decimal");
            				

            }


            }

            // InternalUlmDsl2.g:638:3: ( ( (lv_array_1_0= '[' ) ) ( (lv_scale_2_0= RULE_INT ) ) (otherlv_3= ',' ( (lv_precision_4_0= RULE_INT ) ) )? otherlv_5= ']' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalUlmDsl2.g:639:4: ( (lv_array_1_0= '[' ) ) ( (lv_scale_2_0= RULE_INT ) ) (otherlv_3= ',' ( (lv_precision_4_0= RULE_INT ) ) )? otherlv_5= ']'
                    {
                    // InternalUlmDsl2.g:639:4: ( (lv_array_1_0= '[' ) )
                    // InternalUlmDsl2.g:640:5: (lv_array_1_0= '[' )
                    {
                    // InternalUlmDsl2.g:640:5: (lv_array_1_0= '[' )
                    // InternalUlmDsl2.g:641:6: lv_array_1_0= '['
                    {
                    lv_array_1_0=(Token)match(input,26,FOLLOW_6); 

                    						newLeafNode(lv_array_1_0, grammarAccess.getAttributeDecimalTypeAccess().getArrayLeftSquareBracketKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAttributeDecimalTypeRule());
                    						}
                    						setWithLastConsumed(current, "array", true, "[");
                    					

                    }


                    }

                    // InternalUlmDsl2.g:653:4: ( (lv_scale_2_0= RULE_INT ) )
                    // InternalUlmDsl2.g:654:5: (lv_scale_2_0= RULE_INT )
                    {
                    // InternalUlmDsl2.g:654:5: (lv_scale_2_0= RULE_INT )
                    // InternalUlmDsl2.g:655:6: lv_scale_2_0= RULE_INT
                    {
                    lv_scale_2_0=(Token)match(input,RULE_INT,FOLLOW_19); 

                    						newLeafNode(lv_scale_2_0, grammarAccess.getAttributeDecimalTypeAccess().getScaleINTTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAttributeDecimalTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"scale",
                    							lv_scale_2_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalUlmDsl2.g:671:4: (otherlv_3= ',' ( (lv_precision_4_0= RULE_INT ) ) )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==29) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalUlmDsl2.g:672:5: otherlv_3= ',' ( (lv_precision_4_0= RULE_INT ) )
                            {
                            otherlv_3=(Token)match(input,29,FOLLOW_6); 

                            					newLeafNode(otherlv_3, grammarAccess.getAttributeDecimalTypeAccess().getCommaKeyword_1_2_0());
                            				
                            // InternalUlmDsl2.g:676:5: ( (lv_precision_4_0= RULE_INT ) )
                            // InternalUlmDsl2.g:677:6: (lv_precision_4_0= RULE_INT )
                            {
                            // InternalUlmDsl2.g:677:6: (lv_precision_4_0= RULE_INT )
                            // InternalUlmDsl2.g:678:7: lv_precision_4_0= RULE_INT
                            {
                            lv_precision_4_0=(Token)match(input,RULE_INT,FOLLOW_18); 

                            							newLeafNode(lv_precision_4_0, grammarAccess.getAttributeDecimalTypeAccess().getPrecisionINTTerminalRuleCall_1_2_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getAttributeDecimalTypeRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"precision",
                            								lv_precision_4_0,
                            								"org.eclipse.xtext.common.Terminals.INT");
                            						

                            }


                            }


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getAttributeDecimalTypeAccess().getRightSquareBracketKeyword_1_3());
                    			

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
    // $ANTLR end "ruleAttributeDecimalType"


    // $ANTLR start "entryRuleEntity"
    // InternalUlmDsl2.g:704:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalUlmDsl2.g:704:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalUlmDsl2.g:705:2: iv_ruleEntity= ruleEntity EOF
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
    // InternalUlmDsl2.g:711:1: ruleEntity returns [EObject current=null] : ( ( ( (lv_type_0_1= 'data' | lv_type_0_2= 'static' | lv_type_0_3= 'lookup' ) ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_desc_2_0= RULE_STRING ) )? (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_features_6_0= ruleFeature ) )* otherlv_7= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_1=null;
        Token lv_type_0_2=null;
        Token lv_type_0_3=null;
        Token lv_name_1_0=null;
        Token lv_desc_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_features_6_0 = null;



        	enterRule();

        try {
            // InternalUlmDsl2.g:717:2: ( ( ( ( (lv_type_0_1= 'data' | lv_type_0_2= 'static' | lv_type_0_3= 'lookup' ) ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_desc_2_0= RULE_STRING ) )? (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_features_6_0= ruleFeature ) )* otherlv_7= '}' ) )
            // InternalUlmDsl2.g:718:2: ( ( ( (lv_type_0_1= 'data' | lv_type_0_2= 'static' | lv_type_0_3= 'lookup' ) ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_desc_2_0= RULE_STRING ) )? (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_features_6_0= ruleFeature ) )* otherlv_7= '}' )
            {
            // InternalUlmDsl2.g:718:2: ( ( ( (lv_type_0_1= 'data' | lv_type_0_2= 'static' | lv_type_0_3= 'lookup' ) ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_desc_2_0= RULE_STRING ) )? (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_features_6_0= ruleFeature ) )* otherlv_7= '}' )
            // InternalUlmDsl2.g:719:3: ( ( (lv_type_0_1= 'data' | lv_type_0_2= 'static' | lv_type_0_3= 'lookup' ) ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_desc_2_0= RULE_STRING ) )? (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( (lv_features_6_0= ruleFeature ) )* otherlv_7= '}'
            {
            // InternalUlmDsl2.g:719:3: ( ( (lv_type_0_1= 'data' | lv_type_0_2= 'static' | lv_type_0_3= 'lookup' ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=30 && LA15_0<=32)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalUlmDsl2.g:720:4: ( (lv_type_0_1= 'data' | lv_type_0_2= 'static' | lv_type_0_3= 'lookup' ) )
                    {
                    // InternalUlmDsl2.g:720:4: ( (lv_type_0_1= 'data' | lv_type_0_2= 'static' | lv_type_0_3= 'lookup' ) )
                    // InternalUlmDsl2.g:721:5: (lv_type_0_1= 'data' | lv_type_0_2= 'static' | lv_type_0_3= 'lookup' )
                    {
                    // InternalUlmDsl2.g:721:5: (lv_type_0_1= 'data' | lv_type_0_2= 'static' | lv_type_0_3= 'lookup' )
                    int alt14=3;
                    switch ( input.LA(1) ) {
                    case 30:
                        {
                        alt14=1;
                        }
                        break;
                    case 31:
                        {
                        alt14=2;
                        }
                        break;
                    case 32:
                        {
                        alt14=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;
                    }

                    switch (alt14) {
                        case 1 :
                            // InternalUlmDsl2.g:722:6: lv_type_0_1= 'data'
                            {
                            lv_type_0_1=(Token)match(input,30,FOLLOW_3); 

                            						newLeafNode(lv_type_0_1, grammarAccess.getEntityAccess().getTypeDataKeyword_0_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getEntityRule());
                            						}
                            						setWithLastConsumed(current, "type", lv_type_0_1, null);
                            					

                            }
                            break;
                        case 2 :
                            // InternalUlmDsl2.g:733:6: lv_type_0_2= 'static'
                            {
                            lv_type_0_2=(Token)match(input,31,FOLLOW_3); 

                            						newLeafNode(lv_type_0_2, grammarAccess.getEntityAccess().getTypeStaticKeyword_0_0_1());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getEntityRule());
                            						}
                            						setWithLastConsumed(current, "type", lv_type_0_2, null);
                            					

                            }
                            break;
                        case 3 :
                            // InternalUlmDsl2.g:744:6: lv_type_0_3= 'lookup'
                            {
                            lv_type_0_3=(Token)match(input,32,FOLLOW_3); 

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

            // InternalUlmDsl2.g:757:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUlmDsl2.g:758:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUlmDsl2.g:758:4: (lv_name_1_0= RULE_ID )
            // InternalUlmDsl2.g:759:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUlmDsl2.g:775:3: ( (lv_desc_2_0= RULE_STRING ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalUlmDsl2.g:776:4: (lv_desc_2_0= RULE_STRING )
                    {
                    // InternalUlmDsl2.g:776:4: (lv_desc_2_0= RULE_STRING )
                    // InternalUlmDsl2.g:777:5: lv_desc_2_0= RULE_STRING
                    {
                    lv_desc_2_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

                    					newLeafNode(lv_desc_2_0, grammarAccess.getEntityAccess().getDescSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEntityRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"desc",
                    						lv_desc_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalUlmDsl2.g:793:3: (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==33) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalUlmDsl2.g:794:4: otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,33,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getExtendsKeyword_3_0());
                    			
                    // InternalUlmDsl2.g:798:4: ( (otherlv_4= RULE_ID ) )
                    // InternalUlmDsl2.g:799:5: (otherlv_4= RULE_ID )
                    {
                    // InternalUlmDsl2.g:799:5: (otherlv_4= RULE_ID )
                    // InternalUlmDsl2.g:800:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEntityRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_4); 

                    						newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_3_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalUlmDsl2.g:816:3: ( (lv_features_6_0= ruleFeature ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID||LA18_0==38) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalUlmDsl2.g:817:4: (lv_features_6_0= ruleFeature )
            	    {
            	    // InternalUlmDsl2.g:817:4: (lv_features_6_0= ruleFeature )
            	    // InternalUlmDsl2.g:818:5: lv_features_6_0= ruleFeature
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_22);
            	    lv_features_6_0=ruleFeature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"features",
            	    						lv_features_6_0,
            	    						"org.ulm.metaulm.xtext.UlmDsl2.Feature");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalUlmDsl2.g:843:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalUlmDsl2.g:843:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalUlmDsl2.g:844:2: iv_ruleFeature= ruleFeature EOF
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
    // InternalUlmDsl2.g:850:1: ruleFeature returns [EObject current=null] : ( ( (lv_type_0_0= ruleFeatureType ) ) ( (lv_mandatory_1_0= 'mandatory' ) )? ( (lv_identifier_2_0= 'identifier' ) )? (otherlv_3= 'as' ( (lv_name_4_0= RULE_ID ) ) )? otherlv_5= ';' ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token lv_mandatory_1_0=null;
        Token lv_identifier_2_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalUlmDsl2.g:856:2: ( ( ( (lv_type_0_0= ruleFeatureType ) ) ( (lv_mandatory_1_0= 'mandatory' ) )? ( (lv_identifier_2_0= 'identifier' ) )? (otherlv_3= 'as' ( (lv_name_4_0= RULE_ID ) ) )? otherlv_5= ';' ) )
            // InternalUlmDsl2.g:857:2: ( ( (lv_type_0_0= ruleFeatureType ) ) ( (lv_mandatory_1_0= 'mandatory' ) )? ( (lv_identifier_2_0= 'identifier' ) )? (otherlv_3= 'as' ( (lv_name_4_0= RULE_ID ) ) )? otherlv_5= ';' )
            {
            // InternalUlmDsl2.g:857:2: ( ( (lv_type_0_0= ruleFeatureType ) ) ( (lv_mandatory_1_0= 'mandatory' ) )? ( (lv_identifier_2_0= 'identifier' ) )? (otherlv_3= 'as' ( (lv_name_4_0= RULE_ID ) ) )? otherlv_5= ';' )
            // InternalUlmDsl2.g:858:3: ( (lv_type_0_0= ruleFeatureType ) ) ( (lv_mandatory_1_0= 'mandatory' ) )? ( (lv_identifier_2_0= 'identifier' ) )? (otherlv_3= 'as' ( (lv_name_4_0= RULE_ID ) ) )? otherlv_5= ';'
            {
            // InternalUlmDsl2.g:858:3: ( (lv_type_0_0= ruleFeatureType ) )
            // InternalUlmDsl2.g:859:4: (lv_type_0_0= ruleFeatureType )
            {
            // InternalUlmDsl2.g:859:4: (lv_type_0_0= ruleFeatureType )
            // InternalUlmDsl2.g:860:5: lv_type_0_0= ruleFeatureType
            {

            					newCompositeNode(grammarAccess.getFeatureAccess().getTypeFeatureTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_23);
            lv_type_0_0=ruleFeatureType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFeatureRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"org.ulm.metaulm.xtext.UlmDsl2.FeatureType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUlmDsl2.g:877:3: ( (lv_mandatory_1_0= 'mandatory' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==34) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalUlmDsl2.g:878:4: (lv_mandatory_1_0= 'mandatory' )
                    {
                    // InternalUlmDsl2.g:878:4: (lv_mandatory_1_0= 'mandatory' )
                    // InternalUlmDsl2.g:879:5: lv_mandatory_1_0= 'mandatory'
                    {
                    lv_mandatory_1_0=(Token)match(input,34,FOLLOW_24); 

                    					newLeafNode(lv_mandatory_1_0, grammarAccess.getFeatureAccess().getMandatoryMandatoryKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFeatureRule());
                    					}
                    					setWithLastConsumed(current, "mandatory", true, "mandatory");
                    				

                    }


                    }
                    break;

            }

            // InternalUlmDsl2.g:891:3: ( (lv_identifier_2_0= 'identifier' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==35) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalUlmDsl2.g:892:4: (lv_identifier_2_0= 'identifier' )
                    {
                    // InternalUlmDsl2.g:892:4: (lv_identifier_2_0= 'identifier' )
                    // InternalUlmDsl2.g:893:5: lv_identifier_2_0= 'identifier'
                    {
                    lv_identifier_2_0=(Token)match(input,35,FOLLOW_25); 

                    					newLeafNode(lv_identifier_2_0, grammarAccess.getFeatureAccess().getIdentifierIdentifierKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFeatureRule());
                    					}
                    					setWithLastConsumed(current, "identifier", true, "identifier");
                    				

                    }


                    }
                    break;

            }

            // InternalUlmDsl2.g:905:3: (otherlv_3= 'as' ( (lv_name_4_0= RULE_ID ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==36) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalUlmDsl2.g:906:4: otherlv_3= 'as' ( (lv_name_4_0= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,36,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getFeatureAccess().getAsKeyword_3_0());
                    			
                    // InternalUlmDsl2.g:910:4: ( (lv_name_4_0= RULE_ID ) )
                    // InternalUlmDsl2.g:911:5: (lv_name_4_0= RULE_ID )
                    {
                    // InternalUlmDsl2.g:911:5: (lv_name_4_0= RULE_ID )
                    // InternalUlmDsl2.g:912:6: lv_name_4_0= RULE_ID
                    {
                    lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_16); 

                    						newLeafNode(lv_name_4_0, grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFeatureRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_4_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,19,FOLLOW_2); 

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


    // $ANTLR start "entryRuleFeatureType"
    // InternalUlmDsl2.g:937:1: entryRuleFeatureType returns [EObject current=null] : iv_ruleFeatureType= ruleFeatureType EOF ;
    public final EObject entryRuleFeatureType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureType = null;


        try {
            // InternalUlmDsl2.g:937:52: (iv_ruleFeatureType= ruleFeatureType EOF )
            // InternalUlmDsl2.g:938:2: iv_ruleFeatureType= ruleFeatureType EOF
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
    // InternalUlmDsl2.g:944:1: ruleFeatureType returns [EObject current=null] : ( ( (lv_type_0_1= ruleAttributeFeatureType | lv_type_0_2= ruleEntityFeatureType ) ) ) ;
    public final EObject ruleFeatureType() throws RecognitionException {
        EObject current = null;

        EObject lv_type_0_1 = null;

        EObject lv_type_0_2 = null;



        	enterRule();

        try {
            // InternalUlmDsl2.g:950:2: ( ( ( (lv_type_0_1= ruleAttributeFeatureType | lv_type_0_2= ruleEntityFeatureType ) ) ) )
            // InternalUlmDsl2.g:951:2: ( ( (lv_type_0_1= ruleAttributeFeatureType | lv_type_0_2= ruleEntityFeatureType ) ) )
            {
            // InternalUlmDsl2.g:951:2: ( ( (lv_type_0_1= ruleAttributeFeatureType | lv_type_0_2= ruleEntityFeatureType ) ) )
            // InternalUlmDsl2.g:952:3: ( (lv_type_0_1= ruleAttributeFeatureType | lv_type_0_2= ruleEntityFeatureType ) )
            {
            // InternalUlmDsl2.g:952:3: ( (lv_type_0_1= ruleAttributeFeatureType | lv_type_0_2= ruleEntityFeatureType ) )
            // InternalUlmDsl2.g:953:4: (lv_type_0_1= ruleAttributeFeatureType | lv_type_0_2= ruleEntityFeatureType )
            {
            // InternalUlmDsl2.g:953:4: (lv_type_0_1= ruleAttributeFeatureType | lv_type_0_2= ruleEntityFeatureType )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                alt22=1;
            }
            else if ( (LA22_0==38) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalUlmDsl2.g:954:5: lv_type_0_1= ruleAttributeFeatureType
                    {

                    					newCompositeNode(grammarAccess.getFeatureTypeAccess().getTypeAttributeFeatureTypeParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_type_0_1=ruleAttributeFeatureType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFeatureTypeRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_0_1,
                    						"org.ulm.metaulm.xtext.UlmDsl2.AttributeFeatureType");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 2 :
                    // InternalUlmDsl2.g:970:5: lv_type_0_2= ruleEntityFeatureType
                    {

                    					newCompositeNode(grammarAccess.getFeatureTypeAccess().getTypeEntityFeatureTypeParserRuleCall_0_1());
                    				
                    pushFollow(FOLLOW_2);
                    lv_type_0_2=ruleEntityFeatureType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFeatureTypeRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_0_2,
                    						"org.ulm.metaulm.xtext.UlmDsl2.EntityFeatureType");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleFeatureType"


    // $ANTLR start "entryRuleAttributeFeatureType"
    // InternalUlmDsl2.g:991:1: entryRuleAttributeFeatureType returns [EObject current=null] : iv_ruleAttributeFeatureType= ruleAttributeFeatureType EOF ;
    public final EObject entryRuleAttributeFeatureType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeFeatureType = null;


        try {
            // InternalUlmDsl2.g:991:61: (iv_ruleAttributeFeatureType= ruleAttributeFeatureType EOF )
            // InternalUlmDsl2.g:992:2: iv_ruleAttributeFeatureType= ruleAttributeFeatureType EOF
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
    // InternalUlmDsl2.g:998:1: ruleAttributeFeatureType returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'bounded' ( (otherlv_2= RULE_ID ) ) )? ) ;
    public final EObject ruleAttributeFeatureType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalUlmDsl2.g:1004:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'bounded' ( (otherlv_2= RULE_ID ) ) )? ) )
            // InternalUlmDsl2.g:1005:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'bounded' ( (otherlv_2= RULE_ID ) ) )? )
            {
            // InternalUlmDsl2.g:1005:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'bounded' ( (otherlv_2= RULE_ID ) ) )? )
            // InternalUlmDsl2.g:1006:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'bounded' ( (otherlv_2= RULE_ID ) ) )?
            {
            // InternalUlmDsl2.g:1006:3: ( (otherlv_0= RULE_ID ) )
            // InternalUlmDsl2.g:1007:4: (otherlv_0= RULE_ID )
            {
            // InternalUlmDsl2.g:1007:4: (otherlv_0= RULE_ID )
            // InternalUlmDsl2.g:1008:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeFeatureTypeRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(otherlv_0, grammarAccess.getAttributeFeatureTypeAccess().getAttributeAttributeCrossReference_0_0());
            				

            }


            }

            // InternalUlmDsl2.g:1019:3: (otherlv_1= 'bounded' ( (otherlv_2= RULE_ID ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==37) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalUlmDsl2.g:1020:4: otherlv_1= 'bounded' ( (otherlv_2= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,37,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getAttributeFeatureTypeAccess().getBoundedKeyword_1_0());
                    			
                    // InternalUlmDsl2.g:1024:4: ( (otherlv_2= RULE_ID ) )
                    // InternalUlmDsl2.g:1025:5: (otherlv_2= RULE_ID )
                    {
                    // InternalUlmDsl2.g:1025:5: (otherlv_2= RULE_ID )
                    // InternalUlmDsl2.g:1026:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAttributeFeatureTypeRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_2, grammarAccess.getAttributeFeatureTypeAccess().getLookupLookupCrossReference_1_1_0());
                    					

                    }


                    }


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
    // $ANTLR end "ruleAttributeFeatureType"


    // $ANTLR start "entryRuleEntityFeatureType"
    // InternalUlmDsl2.g:1042:1: entryRuleEntityFeatureType returns [EObject current=null] : iv_ruleEntityFeatureType= ruleEntityFeatureType EOF ;
    public final EObject entryRuleEntityFeatureType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityFeatureType = null;


        try {
            // InternalUlmDsl2.g:1042:58: (iv_ruleEntityFeatureType= ruleEntityFeatureType EOF )
            // InternalUlmDsl2.g:1043:2: iv_ruleEntityFeatureType= ruleEntityFeatureType EOF
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
    // InternalUlmDsl2.g:1049:1: ruleEntityFeatureType returns [EObject current=null] : (otherlv_0= 'references' ( (otherlv_1= RULE_ID ) ) ( ( (lv_array_2_0= '[' ) ) ( (lv_length_3_0= RULE_INT ) )? otherlv_4= ']' )? ) ;
    public final EObject ruleEntityFeatureType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_array_2_0=null;
        Token lv_length_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalUlmDsl2.g:1055:2: ( (otherlv_0= 'references' ( (otherlv_1= RULE_ID ) ) ( ( (lv_array_2_0= '[' ) ) ( (lv_length_3_0= RULE_INT ) )? otherlv_4= ']' )? ) )
            // InternalUlmDsl2.g:1056:2: (otherlv_0= 'references' ( (otherlv_1= RULE_ID ) ) ( ( (lv_array_2_0= '[' ) ) ( (lv_length_3_0= RULE_INT ) )? otherlv_4= ']' )? )
            {
            // InternalUlmDsl2.g:1056:2: (otherlv_0= 'references' ( (otherlv_1= RULE_ID ) ) ( ( (lv_array_2_0= '[' ) ) ( (lv_length_3_0= RULE_INT ) )? otherlv_4= ']' )? )
            // InternalUlmDsl2.g:1057:3: otherlv_0= 'references' ( (otherlv_1= RULE_ID ) ) ( ( (lv_array_2_0= '[' ) ) ( (lv_length_3_0= RULE_INT ) )? otherlv_4= ']' )?
            {
            otherlv_0=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityFeatureTypeAccess().getReferencesKeyword_0());
            		
            // InternalUlmDsl2.g:1061:3: ( (otherlv_1= RULE_ID ) )
            // InternalUlmDsl2.g:1062:4: (otherlv_1= RULE_ID )
            {
            // InternalUlmDsl2.g:1062:4: (otherlv_1= RULE_ID )
            // InternalUlmDsl2.g:1063:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityFeatureTypeRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(otherlv_1, grammarAccess.getEntityFeatureTypeAccess().getEntityEntityCrossReference_1_0());
            				

            }


            }

            // InternalUlmDsl2.g:1074:3: ( ( (lv_array_2_0= '[' ) ) ( (lv_length_3_0= RULE_INT ) )? otherlv_4= ']' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==26) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalUlmDsl2.g:1075:4: ( (lv_array_2_0= '[' ) ) ( (lv_length_3_0= RULE_INT ) )? otherlv_4= ']'
                    {
                    // InternalUlmDsl2.g:1075:4: ( (lv_array_2_0= '[' ) )
                    // InternalUlmDsl2.g:1076:5: (lv_array_2_0= '[' )
                    {
                    // InternalUlmDsl2.g:1076:5: (lv_array_2_0= '[' )
                    // InternalUlmDsl2.g:1077:6: lv_array_2_0= '['
                    {
                    lv_array_2_0=(Token)match(input,26,FOLLOW_27); 

                    						newLeafNode(lv_array_2_0, grammarAccess.getEntityFeatureTypeAccess().getArrayLeftSquareBracketKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEntityFeatureTypeRule());
                    						}
                    						setWithLastConsumed(current, "array", true, "[");
                    					

                    }


                    }

                    // InternalUlmDsl2.g:1089:4: ( (lv_length_3_0= RULE_INT ) )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==RULE_INT) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalUlmDsl2.g:1090:5: (lv_length_3_0= RULE_INT )
                            {
                            // InternalUlmDsl2.g:1090:5: (lv_length_3_0= RULE_INT )
                            // InternalUlmDsl2.g:1091:6: lv_length_3_0= RULE_INT
                            {
                            lv_length_3_0=(Token)match(input,RULE_INT,FOLLOW_18); 

                            						newLeafNode(lv_length_3_0, grammarAccess.getEntityFeatureTypeAccess().getLengthINTTerminalRuleCall_2_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getEntityFeatureTypeRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"length",
                            							lv_length_3_0,
                            							"org.eclipse.xtext.common.Terminals.INT");
                            					

                            }


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getEntityFeatureTypeAccess().getRightSquareBracketKeyword_2_2());
                    			

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
    // $ANTLR end "ruleEntityFeatureType"


    // $ANTLR start "entryRuleLookup"
    // InternalUlmDsl2.g:1116:1: entryRuleLookup returns [EObject current=null] : iv_ruleLookup= ruleLookup EOF ;
    public final EObject entryRuleLookup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLookup = null;


        try {
            // InternalUlmDsl2.g:1116:47: (iv_ruleLookup= ruleLookup EOF )
            // InternalUlmDsl2.g:1117:2: iv_ruleLookup= ruleLookup EOF
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
    // InternalUlmDsl2.g:1123:1: ruleLookup returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_type_1_1= ruleLookupInt | lv_type_1_2= ruleLookupString ) ) ) ) ;
    public final EObject ruleLookup() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_type_1_1 = null;

        EObject lv_type_1_2 = null;



        	enterRule();

        try {
            // InternalUlmDsl2.g:1129:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_type_1_1= ruleLookupInt | lv_type_1_2= ruleLookupString ) ) ) ) )
            // InternalUlmDsl2.g:1130:2: ( ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_type_1_1= ruleLookupInt | lv_type_1_2= ruleLookupString ) ) ) )
            {
            // InternalUlmDsl2.g:1130:2: ( ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_type_1_1= ruleLookupInt | lv_type_1_2= ruleLookupString ) ) ) )
            // InternalUlmDsl2.g:1131:3: ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_type_1_1= ruleLookupInt | lv_type_1_2= ruleLookupString ) ) )
            {
            // InternalUlmDsl2.g:1131:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalUlmDsl2.g:1132:4: (lv_name_0_0= RULE_ID )
            {
            // InternalUlmDsl2.g:1132:4: (lv_name_0_0= RULE_ID )
            // InternalUlmDsl2.g:1133:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(lv_name_0_0, grammarAccess.getLookupAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLookupRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUlmDsl2.g:1149:3: ( ( (lv_type_1_1= ruleLookupInt | lv_type_1_2= ruleLookupString ) ) )
            // InternalUlmDsl2.g:1150:4: ( (lv_type_1_1= ruleLookupInt | lv_type_1_2= ruleLookupString ) )
            {
            // InternalUlmDsl2.g:1150:4: ( (lv_type_1_1= ruleLookupInt | lv_type_1_2= ruleLookupString ) )
            // InternalUlmDsl2.g:1151:5: (lv_type_1_1= ruleLookupInt | lv_type_1_2= ruleLookupString )
            {
            // InternalUlmDsl2.g:1151:5: (lv_type_1_1= ruleLookupInt | lv_type_1_2= ruleLookupString )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==39) ) {
                alt26=1;
            }
            else if ( (LA26_0==25) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalUlmDsl2.g:1152:6: lv_type_1_1= ruleLookupInt
                    {

                    						newCompositeNode(grammarAccess.getLookupAccess().getTypeLookupIntParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_type_1_1=ruleLookupInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLookupRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_1_1,
                    							"org.ulm.metaulm.xtext.UlmDsl2.LookupInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalUlmDsl2.g:1168:6: lv_type_1_2= ruleLookupString
                    {

                    						newCompositeNode(grammarAccess.getLookupAccess().getTypeLookupStringParserRuleCall_1_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_type_1_2=ruleLookupString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLookupRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_1_2,
                    							"org.ulm.metaulm.xtext.UlmDsl2.LookupString");
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
    // $ANTLR end "ruleLookup"


    // $ANTLR start "entryRuleLookupInt"
    // InternalUlmDsl2.g:1190:1: entryRuleLookupInt returns [EObject current=null] : iv_ruleLookupInt= ruleLookupInt EOF ;
    public final EObject entryRuleLookupInt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLookupInt = null;


        try {
            // InternalUlmDsl2.g:1190:50: (iv_ruleLookupInt= ruleLookupInt EOF )
            // InternalUlmDsl2.g:1191:2: iv_ruleLookupInt= ruleLookupInt EOF
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
    // InternalUlmDsl2.g:1197:1: ruleLookupInt returns [EObject current=null] : (otherlv_0= 'integer' ( (lv_description_1_0= RULE_STRING ) )? otherlv_2= 'values' otherlv_3= '{' ( (lv_values_4_0= ruleLookupIntValue ) ) (otherlv_5= ',' ( (lv_values_6_0= ruleLookupIntValue ) ) )* otherlv_7= '}' otherlv_8= ';' ) ;
    public final EObject ruleLookupInt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_description_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_values_4_0 = null;

        EObject lv_values_6_0 = null;



        	enterRule();

        try {
            // InternalUlmDsl2.g:1203:2: ( (otherlv_0= 'integer' ( (lv_description_1_0= RULE_STRING ) )? otherlv_2= 'values' otherlv_3= '{' ( (lv_values_4_0= ruleLookupIntValue ) ) (otherlv_5= ',' ( (lv_values_6_0= ruleLookupIntValue ) ) )* otherlv_7= '}' otherlv_8= ';' ) )
            // InternalUlmDsl2.g:1204:2: (otherlv_0= 'integer' ( (lv_description_1_0= RULE_STRING ) )? otherlv_2= 'values' otherlv_3= '{' ( (lv_values_4_0= ruleLookupIntValue ) ) (otherlv_5= ',' ( (lv_values_6_0= ruleLookupIntValue ) ) )* otherlv_7= '}' otherlv_8= ';' )
            {
            // InternalUlmDsl2.g:1204:2: (otherlv_0= 'integer' ( (lv_description_1_0= RULE_STRING ) )? otherlv_2= 'values' otherlv_3= '{' ( (lv_values_4_0= ruleLookupIntValue ) ) (otherlv_5= ',' ( (lv_values_6_0= ruleLookupIntValue ) ) )* otherlv_7= '}' otherlv_8= ';' )
            // InternalUlmDsl2.g:1205:3: otherlv_0= 'integer' ( (lv_description_1_0= RULE_STRING ) )? otherlv_2= 'values' otherlv_3= '{' ( (lv_values_4_0= ruleLookupIntValue ) ) (otherlv_5= ',' ( (lv_values_6_0= ruleLookupIntValue ) ) )* otherlv_7= '}' otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getLookupIntAccess().getIntegerKeyword_0());
            		
            // InternalUlmDsl2.g:1209:3: ( (lv_description_1_0= RULE_STRING ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_STRING) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalUlmDsl2.g:1210:4: (lv_description_1_0= RULE_STRING )
                    {
                    // InternalUlmDsl2.g:1210:4: (lv_description_1_0= RULE_STRING )
                    // InternalUlmDsl2.g:1211:5: lv_description_1_0= RULE_STRING
                    {
                    lv_description_1_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

                    					newLeafNode(lv_description_1_0, grammarAccess.getLookupIntAccess().getDescriptionSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLookupIntRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_1_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,40,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getLookupIntAccess().getValuesKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_31); 

            			newLeafNode(otherlv_3, grammarAccess.getLookupIntAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalUlmDsl2.g:1235:3: ( (lv_values_4_0= ruleLookupIntValue ) )
            // InternalUlmDsl2.g:1236:4: (lv_values_4_0= ruleLookupIntValue )
            {
            // InternalUlmDsl2.g:1236:4: (lv_values_4_0= ruleLookupIntValue )
            // InternalUlmDsl2.g:1237:5: lv_values_4_0= ruleLookupIntValue
            {

            					newCompositeNode(grammarAccess.getLookupIntAccess().getValuesLookupIntValueParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_32);
            lv_values_4_0=ruleLookupIntValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLookupIntRule());
            					}
            					add(
            						current,
            						"values",
            						lv_values_4_0,
            						"org.ulm.metaulm.xtext.UlmDsl2.LookupIntValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUlmDsl2.g:1254:3: (otherlv_5= ',' ( (lv_values_6_0= ruleLookupIntValue ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==29) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalUlmDsl2.g:1255:4: otherlv_5= ',' ( (lv_values_6_0= ruleLookupIntValue ) )
            	    {
            	    otherlv_5=(Token)match(input,29,FOLLOW_31); 

            	    				newLeafNode(otherlv_5, grammarAccess.getLookupIntAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalUlmDsl2.g:1259:4: ( (lv_values_6_0= ruleLookupIntValue ) )
            	    // InternalUlmDsl2.g:1260:5: (lv_values_6_0= ruleLookupIntValue )
            	    {
            	    // InternalUlmDsl2.g:1260:5: (lv_values_6_0= ruleLookupIntValue )
            	    // InternalUlmDsl2.g:1261:6: lv_values_6_0= ruleLookupIntValue
            	    {

            	    						newCompositeNode(grammarAccess.getLookupIntAccess().getValuesLookupIntValueParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_32);
            	    lv_values_6_0=ruleLookupIntValue();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLookupIntRule());
            	    						}
            	    						add(
            	    							current,
            	    							"values",
            	    							lv_values_6_0,
            	    							"org.ulm.metaulm.xtext.UlmDsl2.LookupIntValue");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_16); 

            			newLeafNode(otherlv_7, grammarAccess.getLookupIntAccess().getRightCurlyBracketKeyword_6());
            		
            otherlv_8=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getLookupIntAccess().getSemicolonKeyword_7());
            		

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
    // InternalUlmDsl2.g:1291:1: entryRuleLookupString returns [EObject current=null] : iv_ruleLookupString= ruleLookupString EOF ;
    public final EObject entryRuleLookupString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLookupString = null;


        try {
            // InternalUlmDsl2.g:1291:53: (iv_ruleLookupString= ruleLookupString EOF )
            // InternalUlmDsl2.g:1292:2: iv_ruleLookupString= ruleLookupString EOF
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
    // InternalUlmDsl2.g:1298:1: ruleLookupString returns [EObject current=null] : (otherlv_0= 'string' ( (lv_description_1_0= RULE_STRING ) )? otherlv_2= 'values' otherlv_3= '{' ( (lv_values_4_0= ruleLookupStringValue ) ) (otherlv_5= ',' ( (lv_values_6_0= ruleLookupStringValue ) ) )* otherlv_7= '}' otherlv_8= ';' ) ;
    public final EObject ruleLookupString() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_description_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_values_4_0 = null;

        EObject lv_values_6_0 = null;



        	enterRule();

        try {
            // InternalUlmDsl2.g:1304:2: ( (otherlv_0= 'string' ( (lv_description_1_0= RULE_STRING ) )? otherlv_2= 'values' otherlv_3= '{' ( (lv_values_4_0= ruleLookupStringValue ) ) (otherlv_5= ',' ( (lv_values_6_0= ruleLookupStringValue ) ) )* otherlv_7= '}' otherlv_8= ';' ) )
            // InternalUlmDsl2.g:1305:2: (otherlv_0= 'string' ( (lv_description_1_0= RULE_STRING ) )? otherlv_2= 'values' otherlv_3= '{' ( (lv_values_4_0= ruleLookupStringValue ) ) (otherlv_5= ',' ( (lv_values_6_0= ruleLookupStringValue ) ) )* otherlv_7= '}' otherlv_8= ';' )
            {
            // InternalUlmDsl2.g:1305:2: (otherlv_0= 'string' ( (lv_description_1_0= RULE_STRING ) )? otherlv_2= 'values' otherlv_3= '{' ( (lv_values_4_0= ruleLookupStringValue ) ) (otherlv_5= ',' ( (lv_values_6_0= ruleLookupStringValue ) ) )* otherlv_7= '}' otherlv_8= ';' )
            // InternalUlmDsl2.g:1306:3: otherlv_0= 'string' ( (lv_description_1_0= RULE_STRING ) )? otherlv_2= 'values' otherlv_3= '{' ( (lv_values_4_0= ruleLookupStringValue ) ) (otherlv_5= ',' ( (lv_values_6_0= ruleLookupStringValue ) ) )* otherlv_7= '}' otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getLookupStringAccess().getStringKeyword_0());
            		
            // InternalUlmDsl2.g:1310:3: ( (lv_description_1_0= RULE_STRING ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_STRING) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalUlmDsl2.g:1311:4: (lv_description_1_0= RULE_STRING )
                    {
                    // InternalUlmDsl2.g:1311:4: (lv_description_1_0= RULE_STRING )
                    // InternalUlmDsl2.g:1312:5: lv_description_1_0= RULE_STRING
                    {
                    lv_description_1_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

                    					newLeafNode(lv_description_1_0, grammarAccess.getLookupStringAccess().getDescriptionSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLookupStringRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"description",
                    						lv_description_1_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,40,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getLookupStringAccess().getValuesKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_31); 

            			newLeafNode(otherlv_3, grammarAccess.getLookupStringAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalUlmDsl2.g:1336:3: ( (lv_values_4_0= ruleLookupStringValue ) )
            // InternalUlmDsl2.g:1337:4: (lv_values_4_0= ruleLookupStringValue )
            {
            // InternalUlmDsl2.g:1337:4: (lv_values_4_0= ruleLookupStringValue )
            // InternalUlmDsl2.g:1338:5: lv_values_4_0= ruleLookupStringValue
            {

            					newCompositeNode(grammarAccess.getLookupStringAccess().getValuesLookupStringValueParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_32);
            lv_values_4_0=ruleLookupStringValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLookupStringRule());
            					}
            					add(
            						current,
            						"values",
            						lv_values_4_0,
            						"org.ulm.metaulm.xtext.UlmDsl2.LookupStringValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUlmDsl2.g:1355:3: (otherlv_5= ',' ( (lv_values_6_0= ruleLookupStringValue ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==29) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalUlmDsl2.g:1356:4: otherlv_5= ',' ( (lv_values_6_0= ruleLookupStringValue ) )
            	    {
            	    otherlv_5=(Token)match(input,29,FOLLOW_31); 

            	    				newLeafNode(otherlv_5, grammarAccess.getLookupStringAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalUlmDsl2.g:1360:4: ( (lv_values_6_0= ruleLookupStringValue ) )
            	    // InternalUlmDsl2.g:1361:5: (lv_values_6_0= ruleLookupStringValue )
            	    {
            	    // InternalUlmDsl2.g:1361:5: (lv_values_6_0= ruleLookupStringValue )
            	    // InternalUlmDsl2.g:1362:6: lv_values_6_0= ruleLookupStringValue
            	    {

            	    						newCompositeNode(grammarAccess.getLookupStringAccess().getValuesLookupStringValueParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_32);
            	    lv_values_6_0=ruleLookupStringValue();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLookupStringRule());
            	    						}
            	    						add(
            	    							current,
            	    							"values",
            	    							lv_values_6_0,
            	    							"org.ulm.metaulm.xtext.UlmDsl2.LookupStringValue");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_16); 

            			newLeafNode(otherlv_7, grammarAccess.getLookupStringAccess().getRightCurlyBracketKeyword_6());
            		
            otherlv_8=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getLookupStringAccess().getSemicolonKeyword_7());
            		

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
    // InternalUlmDsl2.g:1392:1: entryRuleLookupIntValue returns [EObject current=null] : iv_ruleLookupIntValue= ruleLookupIntValue EOF ;
    public final EObject entryRuleLookupIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLookupIntValue = null;


        try {
            // InternalUlmDsl2.g:1392:55: (iv_ruleLookupIntValue= ruleLookupIntValue EOF )
            // InternalUlmDsl2.g:1393:2: iv_ruleLookupIntValue= ruleLookupIntValue EOF
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
    // InternalUlmDsl2.g:1399:1: ruleLookupIntValue returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ':' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ')' ) ;
    public final EObject ruleLookupIntValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalUlmDsl2.g:1405:2: ( ( () otherlv_1= '(' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ':' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ')' ) )
            // InternalUlmDsl2.g:1406:2: ( () otherlv_1= '(' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ':' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ')' )
            {
            // InternalUlmDsl2.g:1406:2: ( () otherlv_1= '(' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ':' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ')' )
            // InternalUlmDsl2.g:1407:3: () otherlv_1= '(' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= ':' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ')'
            {
            // InternalUlmDsl2.g:1407:3: ()
            // InternalUlmDsl2.g:1408:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLookupIntValueAccess().getLookupIntValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getLookupIntValueAccess().getLeftParenthesisKeyword_1());
            		
            // InternalUlmDsl2.g:1418:3: ( (lv_value_2_0= RULE_INT ) )
            // InternalUlmDsl2.g:1419:4: (lv_value_2_0= RULE_INT )
            {
            // InternalUlmDsl2.g:1419:4: (lv_value_2_0= RULE_INT )
            // InternalUlmDsl2.g:1420:5: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_33); 

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

            otherlv_3=(Token)match(input,42,FOLLOW_34); 

            			newLeafNode(otherlv_3, grammarAccess.getLookupIntValueAccess().getColonKeyword_3());
            		
            // InternalUlmDsl2.g:1440:3: ( (lv_description_4_0= RULE_STRING ) )
            // InternalUlmDsl2.g:1441:4: (lv_description_4_0= RULE_STRING )
            {
            // InternalUlmDsl2.g:1441:4: (lv_description_4_0= RULE_STRING )
            // InternalUlmDsl2.g:1442:5: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_35); 

            					newLeafNode(lv_description_4_0, grammarAccess.getLookupIntValueAccess().getDescriptionSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLookupIntValueRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,43,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getLookupIntValueAccess().getRightParenthesisKeyword_5());
            		

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
    // InternalUlmDsl2.g:1466:1: entryRuleLookupStringValue returns [EObject current=null] : iv_ruleLookupStringValue= ruleLookupStringValue EOF ;
    public final EObject entryRuleLookupStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLookupStringValue = null;


        try {
            // InternalUlmDsl2.g:1466:58: (iv_ruleLookupStringValue= ruleLookupStringValue EOF )
            // InternalUlmDsl2.g:1467:2: iv_ruleLookupStringValue= ruleLookupStringValue EOF
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
    // InternalUlmDsl2.g:1473:1: ruleLookupStringValue returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= ':' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ')' ) ;
    public final EObject ruleLookupStringValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalUlmDsl2.g:1479:2: ( ( () otherlv_1= '(' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= ':' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ')' ) )
            // InternalUlmDsl2.g:1480:2: ( () otherlv_1= '(' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= ':' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ')' )
            {
            // InternalUlmDsl2.g:1480:2: ( () otherlv_1= '(' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= ':' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ')' )
            // InternalUlmDsl2.g:1481:3: () otherlv_1= '(' ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= ':' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= ')'
            {
            // InternalUlmDsl2.g:1481:3: ()
            // InternalUlmDsl2.g:1482:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLookupStringValueAccess().getLookupStringValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getLookupStringValueAccess().getLeftParenthesisKeyword_1());
            		
            // InternalUlmDsl2.g:1492:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalUlmDsl2.g:1493:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalUlmDsl2.g:1493:4: (lv_value_2_0= RULE_STRING )
            // InternalUlmDsl2.g:1494:5: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_33); 

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

            otherlv_3=(Token)match(input,42,FOLLOW_34); 

            			newLeafNode(otherlv_3, grammarAccess.getLookupStringValueAccess().getColonKeyword_3());
            		
            // InternalUlmDsl2.g:1514:3: ( (lv_description_4_0= RULE_STRING ) )
            // InternalUlmDsl2.g:1515:4: (lv_description_4_0= RULE_STRING )
            {
            // InternalUlmDsl2.g:1515:4: (lv_description_4_0= RULE_STRING )
            // InternalUlmDsl2.g:1516:5: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_35); 

            					newLeafNode(lv_description_4_0, grammarAccess.getLookupStringValueAccess().getDescriptionSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLookupStringValueRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,43,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getLookupStringValueAccess().getRightParenthesisKeyword_5());
            		

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
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000032000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000001C0002010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000013F00000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000200001040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000200001000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000004000002010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001C00080000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001800080000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001000080000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000008002000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000010000000040L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000020002000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000080000000000L});

}