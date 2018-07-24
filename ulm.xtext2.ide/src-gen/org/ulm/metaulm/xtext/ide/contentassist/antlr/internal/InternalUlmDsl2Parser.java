package org.ulm.metaulm.xtext.ide.contentassist.antlr.internal;

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
import org.ulm.metaulm.xtext.services.UlmDsl2GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUlmDsl2Parser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'string'", "'int'", "'decimal'", "'boolean'", "'date'", "'datetime'", "'timestamp'", "'data'", "'static'", "'lookup'", "'model'", "'{'", "'}'", "'context'", "'attributes'", "'lookups'", "'entities'", "'.'", "'attribute'", "';'", "']'", "'entity'", "'extends'", "'features'", "'as'", "'feature'", "'integer'", "'values'", "','", "'('", "')'", "'['", "'mandatory'", "'identifier'"
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
    public static final int RULE_ID=5;
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

    	public void setGrammarAccess(UlmDsl2GrammarAccess grammarAccess) {
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
    // InternalUlmDsl2.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalUlmDsl2.g:54:1: ( ruleModel EOF )
            // InternalUlmDsl2.g:55:1: ruleModel EOF
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
    // InternalUlmDsl2.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalUlmDsl2.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalUlmDsl2.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalUlmDsl2.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalUlmDsl2.g:69:3: ( rule__Model__Group__0 )
            // InternalUlmDsl2.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleContext"
    // InternalUlmDsl2.g:78:1: entryRuleContext : ruleContext EOF ;
    public final void entryRuleContext() throws RecognitionException {
        try {
            // InternalUlmDsl2.g:79:1: ( ruleContext EOF )
            // InternalUlmDsl2.g:80:1: ruleContext EOF
            {
             before(grammarAccess.getContextRule()); 
            pushFollow(FOLLOW_1);
            ruleContext();

            state._fsp--;

             after(grammarAccess.getContextRule()); 
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
    // $ANTLR end "entryRuleContext"


    // $ANTLR start "ruleContext"
    // InternalUlmDsl2.g:87:1: ruleContext : ( ( rule__Context__Group__0 ) ) ;
    public final void ruleContext() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:91:2: ( ( ( rule__Context__Group__0 ) ) )
            // InternalUlmDsl2.g:92:2: ( ( rule__Context__Group__0 ) )
            {
            // InternalUlmDsl2.g:92:2: ( ( rule__Context__Group__0 ) )
            // InternalUlmDsl2.g:93:3: ( rule__Context__Group__0 )
            {
             before(grammarAccess.getContextAccess().getGroup()); 
            // InternalUlmDsl2.g:94:3: ( rule__Context__Group__0 )
            // InternalUlmDsl2.g:94:4: rule__Context__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Context__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContextAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContext"


    // $ANTLR start "entryRuleVersion"
    // InternalUlmDsl2.g:103:1: entryRuleVersion : ruleVersion EOF ;
    public final void entryRuleVersion() throws RecognitionException {
        try {
            // InternalUlmDsl2.g:104:1: ( ruleVersion EOF )
            // InternalUlmDsl2.g:105:1: ruleVersion EOF
            {
             before(grammarAccess.getVersionRule()); 
            pushFollow(FOLLOW_1);
            ruleVersion();

            state._fsp--;

             after(grammarAccess.getVersionRule()); 
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
    // $ANTLR end "entryRuleVersion"


    // $ANTLR start "ruleVersion"
    // InternalUlmDsl2.g:112:1: ruleVersion : ( ( rule__Version__Group__0 ) ) ;
    public final void ruleVersion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:116:2: ( ( ( rule__Version__Group__0 ) ) )
            // InternalUlmDsl2.g:117:2: ( ( rule__Version__Group__0 ) )
            {
            // InternalUlmDsl2.g:117:2: ( ( rule__Version__Group__0 ) )
            // InternalUlmDsl2.g:118:3: ( rule__Version__Group__0 )
            {
             before(grammarAccess.getVersionAccess().getGroup()); 
            // InternalUlmDsl2.g:119:3: ( rule__Version__Group__0 )
            // InternalUlmDsl2.g:119:4: rule__Version__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Version__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVersionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVersion"


    // $ANTLR start "entryRuleAttribute"
    // InternalUlmDsl2.g:128:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalUlmDsl2.g:129:1: ( ruleAttribute EOF )
            // InternalUlmDsl2.g:130:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalUlmDsl2.g:137:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:141:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalUlmDsl2.g:142:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalUlmDsl2.g:142:2: ( ( rule__Attribute__Group__0 ) )
            // InternalUlmDsl2.g:143:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalUlmDsl2.g:144:3: ( rule__Attribute__Group__0 )
            // InternalUlmDsl2.g:144:4: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleAttributeType"
    // InternalUlmDsl2.g:153:1: entryRuleAttributeType : ruleAttributeType EOF ;
    public final void entryRuleAttributeType() throws RecognitionException {
        try {
            // InternalUlmDsl2.g:154:1: ( ruleAttributeType EOF )
            // InternalUlmDsl2.g:155:1: ruleAttributeType EOF
            {
             before(grammarAccess.getAttributeTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttributeType();

            state._fsp--;

             after(grammarAccess.getAttributeTypeRule()); 
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
    // $ANTLR end "entryRuleAttributeType"


    // $ANTLR start "ruleAttributeType"
    // InternalUlmDsl2.g:162:1: ruleAttributeType : ( ( rule__AttributeType__Group__0 ) ) ;
    public final void ruleAttributeType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:166:2: ( ( ( rule__AttributeType__Group__0 ) ) )
            // InternalUlmDsl2.g:167:2: ( ( rule__AttributeType__Group__0 ) )
            {
            // InternalUlmDsl2.g:167:2: ( ( rule__AttributeType__Group__0 ) )
            // InternalUlmDsl2.g:168:3: ( rule__AttributeType__Group__0 )
            {
             before(grammarAccess.getAttributeTypeAccess().getGroup()); 
            // InternalUlmDsl2.g:169:3: ( rule__AttributeType__Group__0 )
            // InternalUlmDsl2.g:169:4: rule__AttributeType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeType"


    // $ANTLR start "entryRuleBasicType"
    // InternalUlmDsl2.g:178:1: entryRuleBasicType : ruleBasicType EOF ;
    public final void entryRuleBasicType() throws RecognitionException {
        try {
            // InternalUlmDsl2.g:179:1: ( ruleBasicType EOF )
            // InternalUlmDsl2.g:180:1: ruleBasicType EOF
            {
             before(grammarAccess.getBasicTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleBasicType();

            state._fsp--;

             after(grammarAccess.getBasicTypeRule()); 
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
    // $ANTLR end "entryRuleBasicType"


    // $ANTLR start "ruleBasicType"
    // InternalUlmDsl2.g:187:1: ruleBasicType : ( ( rule__BasicType__TypeNameAssignment ) ) ;
    public final void ruleBasicType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:191:2: ( ( ( rule__BasicType__TypeNameAssignment ) ) )
            // InternalUlmDsl2.g:192:2: ( ( rule__BasicType__TypeNameAssignment ) )
            {
            // InternalUlmDsl2.g:192:2: ( ( rule__BasicType__TypeNameAssignment ) )
            // InternalUlmDsl2.g:193:3: ( rule__BasicType__TypeNameAssignment )
            {
             before(grammarAccess.getBasicTypeAccess().getTypeNameAssignment()); 
            // InternalUlmDsl2.g:194:3: ( rule__BasicType__TypeNameAssignment )
            // InternalUlmDsl2.g:194:4: rule__BasicType__TypeNameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__BasicType__TypeNameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBasicTypeAccess().getTypeNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBasicType"


    // $ANTLR start "entryRuleEntity"
    // InternalUlmDsl2.g:203:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalUlmDsl2.g:204:1: ( ruleEntity EOF )
            // InternalUlmDsl2.g:205:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalUlmDsl2.g:212:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:216:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalUlmDsl2.g:217:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalUlmDsl2.g:217:2: ( ( rule__Entity__Group__0 ) )
            // InternalUlmDsl2.g:218:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalUlmDsl2.g:219:3: ( rule__Entity__Group__0 )
            // InternalUlmDsl2.g:219:4: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleFeature"
    // InternalUlmDsl2.g:228:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // InternalUlmDsl2.g:229:1: ( ruleFeature EOF )
            // InternalUlmDsl2.g:230:1: ruleFeature EOF
            {
             before(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_1);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getFeatureRule()); 
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
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalUlmDsl2.g:237:1: ruleFeature : ( ( rule__Feature__Group__0 ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:241:2: ( ( ( rule__Feature__Group__0 ) ) )
            // InternalUlmDsl2.g:242:2: ( ( rule__Feature__Group__0 ) )
            {
            // InternalUlmDsl2.g:242:2: ( ( rule__Feature__Group__0 ) )
            // InternalUlmDsl2.g:243:3: ( rule__Feature__Group__0 )
            {
             before(grammarAccess.getFeatureAccess().getGroup()); 
            // InternalUlmDsl2.g:244:3: ( rule__Feature__Group__0 )
            // InternalUlmDsl2.g:244:4: rule__Feature__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleFeatureTypeType"
    // InternalUlmDsl2.g:253:1: entryRuleFeatureTypeType : ruleFeatureTypeType EOF ;
    public final void entryRuleFeatureTypeType() throws RecognitionException {
        try {
            // InternalUlmDsl2.g:254:1: ( ruleFeatureTypeType EOF )
            // InternalUlmDsl2.g:255:1: ruleFeatureTypeType EOF
            {
             before(grammarAccess.getFeatureTypeTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleFeatureTypeType();

            state._fsp--;

             after(grammarAccess.getFeatureTypeTypeRule()); 
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
    // $ANTLR end "entryRuleFeatureTypeType"


    // $ANTLR start "ruleFeatureTypeType"
    // InternalUlmDsl2.g:262:1: ruleFeatureTypeType : ( ( rule__FeatureTypeType__Group__0 ) ) ;
    public final void ruleFeatureTypeType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:266:2: ( ( ( rule__FeatureTypeType__Group__0 ) ) )
            // InternalUlmDsl2.g:267:2: ( ( rule__FeatureTypeType__Group__0 ) )
            {
            // InternalUlmDsl2.g:267:2: ( ( rule__FeatureTypeType__Group__0 ) )
            // InternalUlmDsl2.g:268:3: ( rule__FeatureTypeType__Group__0 )
            {
             before(grammarAccess.getFeatureTypeTypeAccess().getGroup()); 
            // InternalUlmDsl2.g:269:3: ( rule__FeatureTypeType__Group__0 )
            // InternalUlmDsl2.g:269:4: rule__FeatureTypeType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FeatureTypeType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureTypeTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeatureTypeType"


    // $ANTLR start "entryRuleFeatureType"
    // InternalUlmDsl2.g:278:1: entryRuleFeatureType : ruleFeatureType EOF ;
    public final void entryRuleFeatureType() throws RecognitionException {
        try {
            // InternalUlmDsl2.g:279:1: ( ruleFeatureType EOF )
            // InternalUlmDsl2.g:280:1: ruleFeatureType EOF
            {
             before(grammarAccess.getFeatureTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleFeatureType();

            state._fsp--;

             after(grammarAccess.getFeatureTypeRule()); 
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
    // $ANTLR end "entryRuleFeatureType"


    // $ANTLR start "ruleFeatureType"
    // InternalUlmDsl2.g:287:1: ruleFeatureType : ( ( rule__FeatureType__Group__0 ) ) ;
    public final void ruleFeatureType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:291:2: ( ( ( rule__FeatureType__Group__0 ) ) )
            // InternalUlmDsl2.g:292:2: ( ( rule__FeatureType__Group__0 ) )
            {
            // InternalUlmDsl2.g:292:2: ( ( rule__FeatureType__Group__0 ) )
            // InternalUlmDsl2.g:293:3: ( rule__FeatureType__Group__0 )
            {
             before(grammarAccess.getFeatureTypeAccess().getGroup()); 
            // InternalUlmDsl2.g:294:3: ( rule__FeatureType__Group__0 )
            // InternalUlmDsl2.g:294:4: rule__FeatureType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FeatureType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeatureType"


    // $ANTLR start "entryRuleAttributeFeatureType"
    // InternalUlmDsl2.g:303:1: entryRuleAttributeFeatureType : ruleAttributeFeatureType EOF ;
    public final void entryRuleAttributeFeatureType() throws RecognitionException {
        try {
            // InternalUlmDsl2.g:304:1: ( ruleAttributeFeatureType EOF )
            // InternalUlmDsl2.g:305:1: ruleAttributeFeatureType EOF
            {
             before(grammarAccess.getAttributeFeatureTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttributeFeatureType();

            state._fsp--;

             after(grammarAccess.getAttributeFeatureTypeRule()); 
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
    // $ANTLR end "entryRuleAttributeFeatureType"


    // $ANTLR start "ruleAttributeFeatureType"
    // InternalUlmDsl2.g:312:1: ruleAttributeFeatureType : ( ( rule__AttributeFeatureType__Group__0 ) ) ;
    public final void ruleAttributeFeatureType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:316:2: ( ( ( rule__AttributeFeatureType__Group__0 ) ) )
            // InternalUlmDsl2.g:317:2: ( ( rule__AttributeFeatureType__Group__0 ) )
            {
            // InternalUlmDsl2.g:317:2: ( ( rule__AttributeFeatureType__Group__0 ) )
            // InternalUlmDsl2.g:318:3: ( rule__AttributeFeatureType__Group__0 )
            {
             before(grammarAccess.getAttributeFeatureTypeAccess().getGroup()); 
            // InternalUlmDsl2.g:319:3: ( rule__AttributeFeatureType__Group__0 )
            // InternalUlmDsl2.g:319:4: rule__AttributeFeatureType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeFeatureType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeFeatureTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeFeatureType"


    // $ANTLR start "entryRuleEntityFeatureType"
    // InternalUlmDsl2.g:328:1: entryRuleEntityFeatureType : ruleEntityFeatureType EOF ;
    public final void entryRuleEntityFeatureType() throws RecognitionException {
        try {
            // InternalUlmDsl2.g:329:1: ( ruleEntityFeatureType EOF )
            // InternalUlmDsl2.g:330:1: ruleEntityFeatureType EOF
            {
             before(grammarAccess.getEntityFeatureTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleEntityFeatureType();

            state._fsp--;

             after(grammarAccess.getEntityFeatureTypeRule()); 
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
    // $ANTLR end "entryRuleEntityFeatureType"


    // $ANTLR start "ruleEntityFeatureType"
    // InternalUlmDsl2.g:337:1: ruleEntityFeatureType : ( ( rule__EntityFeatureType__Group__0 ) ) ;
    public final void ruleEntityFeatureType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:341:2: ( ( ( rule__EntityFeatureType__Group__0 ) ) )
            // InternalUlmDsl2.g:342:2: ( ( rule__EntityFeatureType__Group__0 ) )
            {
            // InternalUlmDsl2.g:342:2: ( ( rule__EntityFeatureType__Group__0 ) )
            // InternalUlmDsl2.g:343:3: ( rule__EntityFeatureType__Group__0 )
            {
             before(grammarAccess.getEntityFeatureTypeAccess().getGroup()); 
            // InternalUlmDsl2.g:344:3: ( rule__EntityFeatureType__Group__0 )
            // InternalUlmDsl2.g:344:4: rule__EntityFeatureType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EntityFeatureType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityFeatureTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntityFeatureType"


    // $ANTLR start "entryRuleLookup"
    // InternalUlmDsl2.g:353:1: entryRuleLookup : ruleLookup EOF ;
    public final void entryRuleLookup() throws RecognitionException {
        try {
            // InternalUlmDsl2.g:354:1: ( ruleLookup EOF )
            // InternalUlmDsl2.g:355:1: ruleLookup EOF
            {
             before(grammarAccess.getLookupRule()); 
            pushFollow(FOLLOW_1);
            ruleLookup();

            state._fsp--;

             after(grammarAccess.getLookupRule()); 
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
    // $ANTLR end "entryRuleLookup"


    // $ANTLR start "ruleLookup"
    // InternalUlmDsl2.g:362:1: ruleLookup : ( ( rule__Lookup__Group__0 ) ) ;
    public final void ruleLookup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:366:2: ( ( ( rule__Lookup__Group__0 ) ) )
            // InternalUlmDsl2.g:367:2: ( ( rule__Lookup__Group__0 ) )
            {
            // InternalUlmDsl2.g:367:2: ( ( rule__Lookup__Group__0 ) )
            // InternalUlmDsl2.g:368:3: ( rule__Lookup__Group__0 )
            {
             before(grammarAccess.getLookupAccess().getGroup()); 
            // InternalUlmDsl2.g:369:3: ( rule__Lookup__Group__0 )
            // InternalUlmDsl2.g:369:4: rule__Lookup__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Lookup__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLookupAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLookup"


    // $ANTLR start "entryRuleLookupInt"
    // InternalUlmDsl2.g:378:1: entryRuleLookupInt : ruleLookupInt EOF ;
    public final void entryRuleLookupInt() throws RecognitionException {
        try {
            // InternalUlmDsl2.g:379:1: ( ruleLookupInt EOF )
            // InternalUlmDsl2.g:380:1: ruleLookupInt EOF
            {
             before(grammarAccess.getLookupIntRule()); 
            pushFollow(FOLLOW_1);
            ruleLookupInt();

            state._fsp--;

             after(grammarAccess.getLookupIntRule()); 
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
    // $ANTLR end "entryRuleLookupInt"


    // $ANTLR start "ruleLookupInt"
    // InternalUlmDsl2.g:387:1: ruleLookupInt : ( ( rule__LookupInt__Group__0 ) ) ;
    public final void ruleLookupInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:391:2: ( ( ( rule__LookupInt__Group__0 ) ) )
            // InternalUlmDsl2.g:392:2: ( ( rule__LookupInt__Group__0 ) )
            {
            // InternalUlmDsl2.g:392:2: ( ( rule__LookupInt__Group__0 ) )
            // InternalUlmDsl2.g:393:3: ( rule__LookupInt__Group__0 )
            {
             before(grammarAccess.getLookupIntAccess().getGroup()); 
            // InternalUlmDsl2.g:394:3: ( rule__LookupInt__Group__0 )
            // InternalUlmDsl2.g:394:4: rule__LookupInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LookupInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLookupIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLookupInt"


    // $ANTLR start "entryRuleLookupString"
    // InternalUlmDsl2.g:403:1: entryRuleLookupString : ruleLookupString EOF ;
    public final void entryRuleLookupString() throws RecognitionException {
        try {
            // InternalUlmDsl2.g:404:1: ( ruleLookupString EOF )
            // InternalUlmDsl2.g:405:1: ruleLookupString EOF
            {
             before(grammarAccess.getLookupStringRule()); 
            pushFollow(FOLLOW_1);
            ruleLookupString();

            state._fsp--;

             after(grammarAccess.getLookupStringRule()); 
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
    // $ANTLR end "entryRuleLookupString"


    // $ANTLR start "ruleLookupString"
    // InternalUlmDsl2.g:412:1: ruleLookupString : ( ( rule__LookupString__Group__0 ) ) ;
    public final void ruleLookupString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:416:2: ( ( ( rule__LookupString__Group__0 ) ) )
            // InternalUlmDsl2.g:417:2: ( ( rule__LookupString__Group__0 ) )
            {
            // InternalUlmDsl2.g:417:2: ( ( rule__LookupString__Group__0 ) )
            // InternalUlmDsl2.g:418:3: ( rule__LookupString__Group__0 )
            {
             before(grammarAccess.getLookupStringAccess().getGroup()); 
            // InternalUlmDsl2.g:419:3: ( rule__LookupString__Group__0 )
            // InternalUlmDsl2.g:419:4: rule__LookupString__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LookupString__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLookupStringAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLookupString"


    // $ANTLR start "entryRuleLookupIntValue"
    // InternalUlmDsl2.g:428:1: entryRuleLookupIntValue : ruleLookupIntValue EOF ;
    public final void entryRuleLookupIntValue() throws RecognitionException {
        try {
            // InternalUlmDsl2.g:429:1: ( ruleLookupIntValue EOF )
            // InternalUlmDsl2.g:430:1: ruleLookupIntValue EOF
            {
             before(grammarAccess.getLookupIntValueRule()); 
            pushFollow(FOLLOW_1);
            ruleLookupIntValue();

            state._fsp--;

             after(grammarAccess.getLookupIntValueRule()); 
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
    // $ANTLR end "entryRuleLookupIntValue"


    // $ANTLR start "ruleLookupIntValue"
    // InternalUlmDsl2.g:437:1: ruleLookupIntValue : ( ( rule__LookupIntValue__Group__0 ) ) ;
    public final void ruleLookupIntValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:441:2: ( ( ( rule__LookupIntValue__Group__0 ) ) )
            // InternalUlmDsl2.g:442:2: ( ( rule__LookupIntValue__Group__0 ) )
            {
            // InternalUlmDsl2.g:442:2: ( ( rule__LookupIntValue__Group__0 ) )
            // InternalUlmDsl2.g:443:3: ( rule__LookupIntValue__Group__0 )
            {
             before(grammarAccess.getLookupIntValueAccess().getGroup()); 
            // InternalUlmDsl2.g:444:3: ( rule__LookupIntValue__Group__0 )
            // InternalUlmDsl2.g:444:4: rule__LookupIntValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LookupIntValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLookupIntValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLookupIntValue"


    // $ANTLR start "entryRuleLookupStringValue"
    // InternalUlmDsl2.g:453:1: entryRuleLookupStringValue : ruleLookupStringValue EOF ;
    public final void entryRuleLookupStringValue() throws RecognitionException {
        try {
            // InternalUlmDsl2.g:454:1: ( ruleLookupStringValue EOF )
            // InternalUlmDsl2.g:455:1: ruleLookupStringValue EOF
            {
             before(grammarAccess.getLookupStringValueRule()); 
            pushFollow(FOLLOW_1);
            ruleLookupStringValue();

            state._fsp--;

             after(grammarAccess.getLookupStringValueRule()); 
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
    // $ANTLR end "entryRuleLookupStringValue"


    // $ANTLR start "ruleLookupStringValue"
    // InternalUlmDsl2.g:462:1: ruleLookupStringValue : ( ( rule__LookupStringValue__Group__0 ) ) ;
    public final void ruleLookupStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:466:2: ( ( ( rule__LookupStringValue__Group__0 ) ) )
            // InternalUlmDsl2.g:467:2: ( ( rule__LookupStringValue__Group__0 ) )
            {
            // InternalUlmDsl2.g:467:2: ( ( rule__LookupStringValue__Group__0 ) )
            // InternalUlmDsl2.g:468:3: ( rule__LookupStringValue__Group__0 )
            {
             before(grammarAccess.getLookupStringValueAccess().getGroup()); 
            // InternalUlmDsl2.g:469:3: ( rule__LookupStringValue__Group__0 )
            // InternalUlmDsl2.g:469:4: rule__LookupStringValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LookupStringValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLookupStringValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLookupStringValue"


    // $ANTLR start "rule__BasicType__TypeNameAlternatives_0"
    // InternalUlmDsl2.g:477:1: rule__BasicType__TypeNameAlternatives_0 : ( ( 'string' ) | ( 'int' ) | ( 'decimal' ) | ( 'boolean' ) | ( 'date' ) | ( 'datetime' ) | ( 'timestamp' ) );
    public final void rule__BasicType__TypeNameAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:481:1: ( ( 'string' ) | ( 'int' ) | ( 'decimal' ) | ( 'boolean' ) | ( 'date' ) | ( 'datetime' ) | ( 'timestamp' ) )
            int alt1=7;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
                {
                alt1=3;
                }
                break;
            case 14:
                {
                alt1=4;
                }
                break;
            case 15:
                {
                alt1=5;
                }
                break;
            case 16:
                {
                alt1=6;
                }
                break;
            case 17:
                {
                alt1=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalUlmDsl2.g:482:2: ( 'string' )
                    {
                    // InternalUlmDsl2.g:482:2: ( 'string' )
                    // InternalUlmDsl2.g:483:3: 'string'
                    {
                     before(grammarAccess.getBasicTypeAccess().getTypeNameStringKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getTypeNameStringKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUlmDsl2.g:488:2: ( 'int' )
                    {
                    // InternalUlmDsl2.g:488:2: ( 'int' )
                    // InternalUlmDsl2.g:489:3: 'int'
                    {
                     before(grammarAccess.getBasicTypeAccess().getTypeNameIntKeyword_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getTypeNameIntKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUlmDsl2.g:494:2: ( 'decimal' )
                    {
                    // InternalUlmDsl2.g:494:2: ( 'decimal' )
                    // InternalUlmDsl2.g:495:3: 'decimal'
                    {
                     before(grammarAccess.getBasicTypeAccess().getTypeNameDecimalKeyword_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getTypeNameDecimalKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalUlmDsl2.g:500:2: ( 'boolean' )
                    {
                    // InternalUlmDsl2.g:500:2: ( 'boolean' )
                    // InternalUlmDsl2.g:501:3: 'boolean'
                    {
                     before(grammarAccess.getBasicTypeAccess().getTypeNameBooleanKeyword_0_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getTypeNameBooleanKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalUlmDsl2.g:506:2: ( 'date' )
                    {
                    // InternalUlmDsl2.g:506:2: ( 'date' )
                    // InternalUlmDsl2.g:507:3: 'date'
                    {
                     before(grammarAccess.getBasicTypeAccess().getTypeNameDateKeyword_0_4()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getTypeNameDateKeyword_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalUlmDsl2.g:512:2: ( 'datetime' )
                    {
                    // InternalUlmDsl2.g:512:2: ( 'datetime' )
                    // InternalUlmDsl2.g:513:3: 'datetime'
                    {
                     before(grammarAccess.getBasicTypeAccess().getTypeNameDatetimeKeyword_0_5()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getTypeNameDatetimeKeyword_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalUlmDsl2.g:518:2: ( 'timestamp' )
                    {
                    // InternalUlmDsl2.g:518:2: ( 'timestamp' )
                    // InternalUlmDsl2.g:519:3: 'timestamp'
                    {
                     before(grammarAccess.getBasicTypeAccess().getTypeNameTimestampKeyword_0_6()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getTypeNameTimestampKeyword_0_6()); 

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
    // $ANTLR end "rule__BasicType__TypeNameAlternatives_0"


    // $ANTLR start "rule__Entity__TypeAlternatives_0_0"
    // InternalUlmDsl2.g:528:1: rule__Entity__TypeAlternatives_0_0 : ( ( 'data' ) | ( 'static' ) | ( 'lookup' ) );
    public final void rule__Entity__TypeAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:532:1: ( ( 'data' ) | ( 'static' ) | ( 'lookup' ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt2=1;
                }
                break;
            case 19:
                {
                alt2=2;
                }
                break;
            case 20:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalUlmDsl2.g:533:2: ( 'data' )
                    {
                    // InternalUlmDsl2.g:533:2: ( 'data' )
                    // InternalUlmDsl2.g:534:3: 'data'
                    {
                     before(grammarAccess.getEntityAccess().getTypeDataKeyword_0_0_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getEntityAccess().getTypeDataKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUlmDsl2.g:539:2: ( 'static' )
                    {
                    // InternalUlmDsl2.g:539:2: ( 'static' )
                    // InternalUlmDsl2.g:540:3: 'static'
                    {
                     before(grammarAccess.getEntityAccess().getTypeStaticKeyword_0_0_1()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getEntityAccess().getTypeStaticKeyword_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUlmDsl2.g:545:2: ( 'lookup' )
                    {
                    // InternalUlmDsl2.g:545:2: ( 'lookup' )
                    // InternalUlmDsl2.g:546:3: 'lookup'
                    {
                     before(grammarAccess.getEntityAccess().getTypeLookupKeyword_0_0_2()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getEntityAccess().getTypeLookupKeyword_0_0_2()); 

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
    // $ANTLR end "rule__Entity__TypeAlternatives_0_0"


    // $ANTLR start "rule__FeatureType__TAlternatives_1_0"
    // InternalUlmDsl2.g:555:1: rule__FeatureType__TAlternatives_1_0 : ( ( ruleAttributeFeatureType ) | ( ruleEntityFeatureType ) );
    public final void rule__FeatureType__TAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:559:1: ( ( ruleAttributeFeatureType ) | ( ruleEntityFeatureType ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==29) ) {
                alt3=1;
            }
            else if ( (LA3_0==32) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalUlmDsl2.g:560:2: ( ruleAttributeFeatureType )
                    {
                    // InternalUlmDsl2.g:560:2: ( ruleAttributeFeatureType )
                    // InternalUlmDsl2.g:561:3: ruleAttributeFeatureType
                    {
                     before(grammarAccess.getFeatureTypeAccess().getTAttributeFeatureTypeParserRuleCall_1_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAttributeFeatureType();

                    state._fsp--;

                     after(grammarAccess.getFeatureTypeAccess().getTAttributeFeatureTypeParserRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUlmDsl2.g:566:2: ( ruleEntityFeatureType )
                    {
                    // InternalUlmDsl2.g:566:2: ( ruleEntityFeatureType )
                    // InternalUlmDsl2.g:567:3: ruleEntityFeatureType
                    {
                     before(grammarAccess.getFeatureTypeAccess().getTEntityFeatureTypeParserRuleCall_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEntityFeatureType();

                    state._fsp--;

                     after(grammarAccess.getFeatureTypeAccess().getTEntityFeatureTypeParserRuleCall_1_0_1()); 

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
    // $ANTLR end "rule__FeatureType__TAlternatives_1_0"


    // $ANTLR start "rule__Lookup__Alternatives_1"
    // InternalUlmDsl2.g:576:1: rule__Lookup__Alternatives_1 : ( ( ruleLookupInt ) | ( ruleLookupString ) );
    public final void rule__Lookup__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:580:1: ( ( ruleLookupInt ) | ( ruleLookupString ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==37) ) {
                alt4=1;
            }
            else if ( (LA4_0==11) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalUlmDsl2.g:581:2: ( ruleLookupInt )
                    {
                    // InternalUlmDsl2.g:581:2: ( ruleLookupInt )
                    // InternalUlmDsl2.g:582:3: ruleLookupInt
                    {
                     before(grammarAccess.getLookupAccess().getLookupIntParserRuleCall_1_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLookupInt();

                    state._fsp--;

                     after(grammarAccess.getLookupAccess().getLookupIntParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUlmDsl2.g:587:2: ( ruleLookupString )
                    {
                    // InternalUlmDsl2.g:587:2: ( ruleLookupString )
                    // InternalUlmDsl2.g:588:3: ruleLookupString
                    {
                     before(grammarAccess.getLookupAccess().getLookupStringParserRuleCall_1_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLookupString();

                    state._fsp--;

                     after(grammarAccess.getLookupAccess().getLookupStringParserRuleCall_1_1()); 

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
    // $ANTLR end "rule__Lookup__Alternatives_1"


    // $ANTLR start "rule__Model__Group__0"
    // InternalUlmDsl2.g:597:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:601:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalUlmDsl2.g:602:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalUlmDsl2.g:609:1: rule__Model__Group__0__Impl : ( 'model' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:613:1: ( ( 'model' ) )
            // InternalUlmDsl2.g:614:1: ( 'model' )
            {
            // InternalUlmDsl2.g:614:1: ( 'model' )
            // InternalUlmDsl2.g:615:2: 'model'
            {
             before(grammarAccess.getModelAccess().getModelKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getModelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalUlmDsl2.g:624:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:628:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalUlmDsl2.g:629:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalUlmDsl2.g:636:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:640:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // InternalUlmDsl2.g:641:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // InternalUlmDsl2.g:641:1: ( ( rule__Model__NameAssignment_1 ) )
            // InternalUlmDsl2.g:642:2: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // InternalUlmDsl2.g:643:2: ( rule__Model__NameAssignment_1 )
            // InternalUlmDsl2.g:643:3: rule__Model__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalUlmDsl2.g:651:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:655:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalUlmDsl2.g:656:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalUlmDsl2.g:663:1: rule__Model__Group__2__Impl : ( '{' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:667:1: ( ( '{' ) )
            // InternalUlmDsl2.g:668:1: ( '{' )
            {
            // InternalUlmDsl2.g:668:1: ( '{' )
            // InternalUlmDsl2.g:669:2: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // InternalUlmDsl2.g:678:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:682:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalUlmDsl2.g:683:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // InternalUlmDsl2.g:690:1: rule__Model__Group__3__Impl : ( ( rule__Model__ContextsAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:694:1: ( ( ( rule__Model__ContextsAssignment_3 )* ) )
            // InternalUlmDsl2.g:695:1: ( ( rule__Model__ContextsAssignment_3 )* )
            {
            // InternalUlmDsl2.g:695:1: ( ( rule__Model__ContextsAssignment_3 )* )
            // InternalUlmDsl2.g:696:2: ( rule__Model__ContextsAssignment_3 )*
            {
             before(grammarAccess.getModelAccess().getContextsAssignment_3()); 
            // InternalUlmDsl2.g:697:2: ( rule__Model__ContextsAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==24) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalUlmDsl2.g:697:3: rule__Model__ContextsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Model__ContextsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getContextsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // InternalUlmDsl2.g:705:1: rule__Model__Group__4 : rule__Model__Group__4__Impl ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:709:1: ( rule__Model__Group__4__Impl )
            // InternalUlmDsl2.g:710:2: rule__Model__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // InternalUlmDsl2.g:716:1: rule__Model__Group__4__Impl : ( '}' ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:720:1: ( ( '}' ) )
            // InternalUlmDsl2.g:721:1: ( '}' )
            {
            // InternalUlmDsl2.g:721:1: ( '}' )
            // InternalUlmDsl2.g:722:2: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Context__Group__0"
    // InternalUlmDsl2.g:732:1: rule__Context__Group__0 : rule__Context__Group__0__Impl rule__Context__Group__1 ;
    public final void rule__Context__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:736:1: ( rule__Context__Group__0__Impl rule__Context__Group__1 )
            // InternalUlmDsl2.g:737:2: rule__Context__Group__0__Impl rule__Context__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Context__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Context__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__0"


    // $ANTLR start "rule__Context__Group__0__Impl"
    // InternalUlmDsl2.g:744:1: rule__Context__Group__0__Impl : ( 'context' ) ;
    public final void rule__Context__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:748:1: ( ( 'context' ) )
            // InternalUlmDsl2.g:749:1: ( 'context' )
            {
            // InternalUlmDsl2.g:749:1: ( 'context' )
            // InternalUlmDsl2.g:750:2: 'context'
            {
             before(grammarAccess.getContextAccess().getContextKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getContextAccess().getContextKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__0__Impl"


    // $ANTLR start "rule__Context__Group__1"
    // InternalUlmDsl2.g:759:1: rule__Context__Group__1 : rule__Context__Group__1__Impl rule__Context__Group__2 ;
    public final void rule__Context__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:763:1: ( rule__Context__Group__1__Impl rule__Context__Group__2 )
            // InternalUlmDsl2.g:764:2: rule__Context__Group__1__Impl rule__Context__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Context__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Context__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__1"


    // $ANTLR start "rule__Context__Group__1__Impl"
    // InternalUlmDsl2.g:771:1: rule__Context__Group__1__Impl : ( ( rule__Context__NameAssignment_1 ) ) ;
    public final void rule__Context__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:775:1: ( ( ( rule__Context__NameAssignment_1 ) ) )
            // InternalUlmDsl2.g:776:1: ( ( rule__Context__NameAssignment_1 ) )
            {
            // InternalUlmDsl2.g:776:1: ( ( rule__Context__NameAssignment_1 ) )
            // InternalUlmDsl2.g:777:2: ( rule__Context__NameAssignment_1 )
            {
             before(grammarAccess.getContextAccess().getNameAssignment_1()); 
            // InternalUlmDsl2.g:778:2: ( rule__Context__NameAssignment_1 )
            // InternalUlmDsl2.g:778:3: rule__Context__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Context__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getContextAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__1__Impl"


    // $ANTLR start "rule__Context__Group__2"
    // InternalUlmDsl2.g:786:1: rule__Context__Group__2 : rule__Context__Group__2__Impl rule__Context__Group__3 ;
    public final void rule__Context__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:790:1: ( rule__Context__Group__2__Impl rule__Context__Group__3 )
            // InternalUlmDsl2.g:791:2: rule__Context__Group__2__Impl rule__Context__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Context__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Context__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__2"


    // $ANTLR start "rule__Context__Group__2__Impl"
    // InternalUlmDsl2.g:798:1: rule__Context__Group__2__Impl : ( ( rule__Context__VersionAssignment_2 ) ) ;
    public final void rule__Context__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:802:1: ( ( ( rule__Context__VersionAssignment_2 ) ) )
            // InternalUlmDsl2.g:803:1: ( ( rule__Context__VersionAssignment_2 ) )
            {
            // InternalUlmDsl2.g:803:1: ( ( rule__Context__VersionAssignment_2 ) )
            // InternalUlmDsl2.g:804:2: ( rule__Context__VersionAssignment_2 )
            {
             before(grammarAccess.getContextAccess().getVersionAssignment_2()); 
            // InternalUlmDsl2.g:805:2: ( rule__Context__VersionAssignment_2 )
            // InternalUlmDsl2.g:805:3: rule__Context__VersionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Context__VersionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getContextAccess().getVersionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__2__Impl"


    // $ANTLR start "rule__Context__Group__3"
    // InternalUlmDsl2.g:813:1: rule__Context__Group__3 : rule__Context__Group__3__Impl rule__Context__Group__4 ;
    public final void rule__Context__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:817:1: ( rule__Context__Group__3__Impl rule__Context__Group__4 )
            // InternalUlmDsl2.g:818:2: rule__Context__Group__3__Impl rule__Context__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Context__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Context__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__3"


    // $ANTLR start "rule__Context__Group__3__Impl"
    // InternalUlmDsl2.g:825:1: rule__Context__Group__3__Impl : ( '{' ) ;
    public final void rule__Context__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:829:1: ( ( '{' ) )
            // InternalUlmDsl2.g:830:1: ( '{' )
            {
            // InternalUlmDsl2.g:830:1: ( '{' )
            // InternalUlmDsl2.g:831:2: '{'
            {
             before(grammarAccess.getContextAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getContextAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__3__Impl"


    // $ANTLR start "rule__Context__Group__4"
    // InternalUlmDsl2.g:840:1: rule__Context__Group__4 : rule__Context__Group__4__Impl rule__Context__Group__5 ;
    public final void rule__Context__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:844:1: ( rule__Context__Group__4__Impl rule__Context__Group__5 )
            // InternalUlmDsl2.g:845:2: rule__Context__Group__4__Impl rule__Context__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Context__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Context__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__4"


    // $ANTLR start "rule__Context__Group__4__Impl"
    // InternalUlmDsl2.g:852:1: rule__Context__Group__4__Impl : ( ( rule__Context__Group_4__0 )? ) ;
    public final void rule__Context__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:856:1: ( ( ( rule__Context__Group_4__0 )? ) )
            // InternalUlmDsl2.g:857:1: ( ( rule__Context__Group_4__0 )? )
            {
            // InternalUlmDsl2.g:857:1: ( ( rule__Context__Group_4__0 )? )
            // InternalUlmDsl2.g:858:2: ( rule__Context__Group_4__0 )?
            {
             before(grammarAccess.getContextAccess().getGroup_4()); 
            // InternalUlmDsl2.g:859:2: ( rule__Context__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==25) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalUlmDsl2.g:859:3: rule__Context__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Context__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContextAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__4__Impl"


    // $ANTLR start "rule__Context__Group__5"
    // InternalUlmDsl2.g:867:1: rule__Context__Group__5 : rule__Context__Group__5__Impl rule__Context__Group__6 ;
    public final void rule__Context__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:871:1: ( rule__Context__Group__5__Impl rule__Context__Group__6 )
            // InternalUlmDsl2.g:872:2: rule__Context__Group__5__Impl rule__Context__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Context__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Context__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__5"


    // $ANTLR start "rule__Context__Group__5__Impl"
    // InternalUlmDsl2.g:879:1: rule__Context__Group__5__Impl : ( ( rule__Context__Group_5__0 )? ) ;
    public final void rule__Context__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:883:1: ( ( ( rule__Context__Group_5__0 )? ) )
            // InternalUlmDsl2.g:884:1: ( ( rule__Context__Group_5__0 )? )
            {
            // InternalUlmDsl2.g:884:1: ( ( rule__Context__Group_5__0 )? )
            // InternalUlmDsl2.g:885:2: ( rule__Context__Group_5__0 )?
            {
             before(grammarAccess.getContextAccess().getGroup_5()); 
            // InternalUlmDsl2.g:886:2: ( rule__Context__Group_5__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalUlmDsl2.g:886:3: rule__Context__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Context__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContextAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__5__Impl"


    // $ANTLR start "rule__Context__Group__6"
    // InternalUlmDsl2.g:894:1: rule__Context__Group__6 : rule__Context__Group__6__Impl rule__Context__Group__7 ;
    public final void rule__Context__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:898:1: ( rule__Context__Group__6__Impl rule__Context__Group__7 )
            // InternalUlmDsl2.g:899:2: rule__Context__Group__6__Impl rule__Context__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Context__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Context__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__6"


    // $ANTLR start "rule__Context__Group__6__Impl"
    // InternalUlmDsl2.g:906:1: rule__Context__Group__6__Impl : ( ( rule__Context__Group_6__0 )? ) ;
    public final void rule__Context__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:910:1: ( ( ( rule__Context__Group_6__0 )? ) )
            // InternalUlmDsl2.g:911:1: ( ( rule__Context__Group_6__0 )? )
            {
            // InternalUlmDsl2.g:911:1: ( ( rule__Context__Group_6__0 )? )
            // InternalUlmDsl2.g:912:2: ( rule__Context__Group_6__0 )?
            {
             before(grammarAccess.getContextAccess().getGroup_6()); 
            // InternalUlmDsl2.g:913:2: ( rule__Context__Group_6__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalUlmDsl2.g:913:3: rule__Context__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Context__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContextAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__6__Impl"


    // $ANTLR start "rule__Context__Group__7"
    // InternalUlmDsl2.g:921:1: rule__Context__Group__7 : rule__Context__Group__7__Impl ;
    public final void rule__Context__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:925:1: ( rule__Context__Group__7__Impl )
            // InternalUlmDsl2.g:926:2: rule__Context__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Context__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__7"


    // $ANTLR start "rule__Context__Group__7__Impl"
    // InternalUlmDsl2.g:932:1: rule__Context__Group__7__Impl : ( '}' ) ;
    public final void rule__Context__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:936:1: ( ( '}' ) )
            // InternalUlmDsl2.g:937:1: ( '}' )
            {
            // InternalUlmDsl2.g:937:1: ( '}' )
            // InternalUlmDsl2.g:938:2: '}'
            {
             before(grammarAccess.getContextAccess().getRightCurlyBracketKeyword_7()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getContextAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__7__Impl"


    // $ANTLR start "rule__Context__Group_4__0"
    // InternalUlmDsl2.g:948:1: rule__Context__Group_4__0 : rule__Context__Group_4__0__Impl rule__Context__Group_4__1 ;
    public final void rule__Context__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:952:1: ( rule__Context__Group_4__0__Impl rule__Context__Group_4__1 )
            // InternalUlmDsl2.g:953:2: rule__Context__Group_4__0__Impl rule__Context__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Context__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Context__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group_4__0"


    // $ANTLR start "rule__Context__Group_4__0__Impl"
    // InternalUlmDsl2.g:960:1: rule__Context__Group_4__0__Impl : ( 'attributes' ) ;
    public final void rule__Context__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:964:1: ( ( 'attributes' ) )
            // InternalUlmDsl2.g:965:1: ( 'attributes' )
            {
            // InternalUlmDsl2.g:965:1: ( 'attributes' )
            // InternalUlmDsl2.g:966:2: 'attributes'
            {
             before(grammarAccess.getContextAccess().getAttributesKeyword_4_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getContextAccess().getAttributesKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group_4__0__Impl"


    // $ANTLR start "rule__Context__Group_4__1"
    // InternalUlmDsl2.g:975:1: rule__Context__Group_4__1 : rule__Context__Group_4__1__Impl rule__Context__Group_4__2 ;
    public final void rule__Context__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:979:1: ( rule__Context__Group_4__1__Impl rule__Context__Group_4__2 )
            // InternalUlmDsl2.g:980:2: rule__Context__Group_4__1__Impl rule__Context__Group_4__2
            {
            pushFollow(FOLLOW_9);
            rule__Context__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Context__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group_4__1"


    // $ANTLR start "rule__Context__Group_4__1__Impl"
    // InternalUlmDsl2.g:987:1: rule__Context__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Context__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:991:1: ( ( '{' ) )
            // InternalUlmDsl2.g:992:1: ( '{' )
            {
            // InternalUlmDsl2.g:992:1: ( '{' )
            // InternalUlmDsl2.g:993:2: '{'
            {
             before(grammarAccess.getContextAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getContextAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group_4__1__Impl"


    // $ANTLR start "rule__Context__Group_4__2"
    // InternalUlmDsl2.g:1002:1: rule__Context__Group_4__2 : rule__Context__Group_4__2__Impl rule__Context__Group_4__3 ;
    public final void rule__Context__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1006:1: ( rule__Context__Group_4__2__Impl rule__Context__Group_4__3 )
            // InternalUlmDsl2.g:1007:2: rule__Context__Group_4__2__Impl rule__Context__Group_4__3
            {
            pushFollow(FOLLOW_9);
            rule__Context__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Context__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group_4__2"


    // $ANTLR start "rule__Context__Group_4__2__Impl"
    // InternalUlmDsl2.g:1014:1: rule__Context__Group_4__2__Impl : ( ( rule__Context__AttributesAssignment_4_2 )* ) ;
    public final void rule__Context__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1018:1: ( ( ( rule__Context__AttributesAssignment_4_2 )* ) )
            // InternalUlmDsl2.g:1019:1: ( ( rule__Context__AttributesAssignment_4_2 )* )
            {
            // InternalUlmDsl2.g:1019:1: ( ( rule__Context__AttributesAssignment_4_2 )* )
            // InternalUlmDsl2.g:1020:2: ( rule__Context__AttributesAssignment_4_2 )*
            {
             before(grammarAccess.getContextAccess().getAttributesAssignment_4_2()); 
            // InternalUlmDsl2.g:1021:2: ( rule__Context__AttributesAssignment_4_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==29) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalUlmDsl2.g:1021:3: rule__Context__AttributesAssignment_4_2
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Context__AttributesAssignment_4_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getContextAccess().getAttributesAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group_4__2__Impl"


    // $ANTLR start "rule__Context__Group_4__3"
    // InternalUlmDsl2.g:1029:1: rule__Context__Group_4__3 : rule__Context__Group_4__3__Impl ;
    public final void rule__Context__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1033:1: ( rule__Context__Group_4__3__Impl )
            // InternalUlmDsl2.g:1034:2: rule__Context__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Context__Group_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group_4__3"


    // $ANTLR start "rule__Context__Group_4__3__Impl"
    // InternalUlmDsl2.g:1040:1: rule__Context__Group_4__3__Impl : ( '}' ) ;
    public final void rule__Context__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1044:1: ( ( '}' ) )
            // InternalUlmDsl2.g:1045:1: ( '}' )
            {
            // InternalUlmDsl2.g:1045:1: ( '}' )
            // InternalUlmDsl2.g:1046:2: '}'
            {
             before(grammarAccess.getContextAccess().getRightCurlyBracketKeyword_4_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getContextAccess().getRightCurlyBracketKeyword_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group_4__3__Impl"


    // $ANTLR start "rule__Context__Group_5__0"
    // InternalUlmDsl2.g:1056:1: rule__Context__Group_5__0 : rule__Context__Group_5__0__Impl rule__Context__Group_5__1 ;
    public final void rule__Context__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1060:1: ( rule__Context__Group_5__0__Impl rule__Context__Group_5__1 )
            // InternalUlmDsl2.g:1061:2: rule__Context__Group_5__0__Impl rule__Context__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__Context__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Context__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group_5__0"


    // $ANTLR start "rule__Context__Group_5__0__Impl"
    // InternalUlmDsl2.g:1068:1: rule__Context__Group_5__0__Impl : ( 'lookups' ) ;
    public final void rule__Context__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1072:1: ( ( 'lookups' ) )
            // InternalUlmDsl2.g:1073:1: ( 'lookups' )
            {
            // InternalUlmDsl2.g:1073:1: ( 'lookups' )
            // InternalUlmDsl2.g:1074:2: 'lookups'
            {
             before(grammarAccess.getContextAccess().getLookupsKeyword_5_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getContextAccess().getLookupsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group_5__0__Impl"


    // $ANTLR start "rule__Context__Group_5__1"
    // InternalUlmDsl2.g:1083:1: rule__Context__Group_5__1 : rule__Context__Group_5__1__Impl rule__Context__Group_5__2 ;
    public final void rule__Context__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1087:1: ( rule__Context__Group_5__1__Impl rule__Context__Group_5__2 )
            // InternalUlmDsl2.g:1088:2: rule__Context__Group_5__1__Impl rule__Context__Group_5__2
            {
            pushFollow(FOLLOW_11);
            rule__Context__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Context__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group_5__1"


    // $ANTLR start "rule__Context__Group_5__1__Impl"
    // InternalUlmDsl2.g:1095:1: rule__Context__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Context__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1099:1: ( ( '{' ) )
            // InternalUlmDsl2.g:1100:1: ( '{' )
            {
            // InternalUlmDsl2.g:1100:1: ( '{' )
            // InternalUlmDsl2.g:1101:2: '{'
            {
             before(grammarAccess.getContextAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getContextAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group_5__1__Impl"


    // $ANTLR start "rule__Context__Group_5__2"
    // InternalUlmDsl2.g:1110:1: rule__Context__Group_5__2 : rule__Context__Group_5__2__Impl rule__Context__Group_5__3 ;
    public final void rule__Context__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1114:1: ( rule__Context__Group_5__2__Impl rule__Context__Group_5__3 )
            // InternalUlmDsl2.g:1115:2: rule__Context__Group_5__2__Impl rule__Context__Group_5__3
            {
            pushFollow(FOLLOW_11);
            rule__Context__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Context__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group_5__2"


    // $ANTLR start "rule__Context__Group_5__2__Impl"
    // InternalUlmDsl2.g:1122:1: rule__Context__Group_5__2__Impl : ( ( rule__Context__LookupsAssignment_5_2 )* ) ;
    public final void rule__Context__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1126:1: ( ( ( rule__Context__LookupsAssignment_5_2 )* ) )
            // InternalUlmDsl2.g:1127:1: ( ( rule__Context__LookupsAssignment_5_2 )* )
            {
            // InternalUlmDsl2.g:1127:1: ( ( rule__Context__LookupsAssignment_5_2 )* )
            // InternalUlmDsl2.g:1128:2: ( rule__Context__LookupsAssignment_5_2 )*
            {
             before(grammarAccess.getContextAccess().getLookupsAssignment_5_2()); 
            // InternalUlmDsl2.g:1129:2: ( rule__Context__LookupsAssignment_5_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==20) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalUlmDsl2.g:1129:3: rule__Context__LookupsAssignment_5_2
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Context__LookupsAssignment_5_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getContextAccess().getLookupsAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group_5__2__Impl"


    // $ANTLR start "rule__Context__Group_5__3"
    // InternalUlmDsl2.g:1137:1: rule__Context__Group_5__3 : rule__Context__Group_5__3__Impl ;
    public final void rule__Context__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1141:1: ( rule__Context__Group_5__3__Impl )
            // InternalUlmDsl2.g:1142:2: rule__Context__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Context__Group_5__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group_5__3"


    // $ANTLR start "rule__Context__Group_5__3__Impl"
    // InternalUlmDsl2.g:1148:1: rule__Context__Group_5__3__Impl : ( '}' ) ;
    public final void rule__Context__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1152:1: ( ( '}' ) )
            // InternalUlmDsl2.g:1153:1: ( '}' )
            {
            // InternalUlmDsl2.g:1153:1: ( '}' )
            // InternalUlmDsl2.g:1154:2: '}'
            {
             before(grammarAccess.getContextAccess().getRightCurlyBracketKeyword_5_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getContextAccess().getRightCurlyBracketKeyword_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group_5__3__Impl"


    // $ANTLR start "rule__Context__Group_6__0"
    // InternalUlmDsl2.g:1164:1: rule__Context__Group_6__0 : rule__Context__Group_6__0__Impl rule__Context__Group_6__1 ;
    public final void rule__Context__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1168:1: ( rule__Context__Group_6__0__Impl rule__Context__Group_6__1 )
            // InternalUlmDsl2.g:1169:2: rule__Context__Group_6__0__Impl rule__Context__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__Context__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Context__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group_6__0"


    // $ANTLR start "rule__Context__Group_6__0__Impl"
    // InternalUlmDsl2.g:1176:1: rule__Context__Group_6__0__Impl : ( 'entities' ) ;
    public final void rule__Context__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1180:1: ( ( 'entities' ) )
            // InternalUlmDsl2.g:1181:1: ( 'entities' )
            {
            // InternalUlmDsl2.g:1181:1: ( 'entities' )
            // InternalUlmDsl2.g:1182:2: 'entities'
            {
             before(grammarAccess.getContextAccess().getEntitiesKeyword_6_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getContextAccess().getEntitiesKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group_6__0__Impl"


    // $ANTLR start "rule__Context__Group_6__1"
    // InternalUlmDsl2.g:1191:1: rule__Context__Group_6__1 : rule__Context__Group_6__1__Impl rule__Context__Group_6__2 ;
    public final void rule__Context__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1195:1: ( rule__Context__Group_6__1__Impl rule__Context__Group_6__2 )
            // InternalUlmDsl2.g:1196:2: rule__Context__Group_6__1__Impl rule__Context__Group_6__2
            {
            pushFollow(FOLLOW_13);
            rule__Context__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Context__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group_6__1"


    // $ANTLR start "rule__Context__Group_6__1__Impl"
    // InternalUlmDsl2.g:1203:1: rule__Context__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Context__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1207:1: ( ( '{' ) )
            // InternalUlmDsl2.g:1208:1: ( '{' )
            {
            // InternalUlmDsl2.g:1208:1: ( '{' )
            // InternalUlmDsl2.g:1209:2: '{'
            {
             before(grammarAccess.getContextAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getContextAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group_6__1__Impl"


    // $ANTLR start "rule__Context__Group_6__2"
    // InternalUlmDsl2.g:1218:1: rule__Context__Group_6__2 : rule__Context__Group_6__2__Impl rule__Context__Group_6__3 ;
    public final void rule__Context__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1222:1: ( rule__Context__Group_6__2__Impl rule__Context__Group_6__3 )
            // InternalUlmDsl2.g:1223:2: rule__Context__Group_6__2__Impl rule__Context__Group_6__3
            {
            pushFollow(FOLLOW_13);
            rule__Context__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Context__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group_6__2"


    // $ANTLR start "rule__Context__Group_6__2__Impl"
    // InternalUlmDsl2.g:1230:1: rule__Context__Group_6__2__Impl : ( ( rule__Context__EntitiesAssignment_6_2 )* ) ;
    public final void rule__Context__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1234:1: ( ( ( rule__Context__EntitiesAssignment_6_2 )* ) )
            // InternalUlmDsl2.g:1235:1: ( ( rule__Context__EntitiesAssignment_6_2 )* )
            {
            // InternalUlmDsl2.g:1235:1: ( ( rule__Context__EntitiesAssignment_6_2 )* )
            // InternalUlmDsl2.g:1236:2: ( rule__Context__EntitiesAssignment_6_2 )*
            {
             before(grammarAccess.getContextAccess().getEntitiesAssignment_6_2()); 
            // InternalUlmDsl2.g:1237:2: ( rule__Context__EntitiesAssignment_6_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=18 && LA11_0<=20)||LA11_0==32) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalUlmDsl2.g:1237:3: rule__Context__EntitiesAssignment_6_2
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Context__EntitiesAssignment_6_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getContextAccess().getEntitiesAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group_6__2__Impl"


    // $ANTLR start "rule__Context__Group_6__3"
    // InternalUlmDsl2.g:1245:1: rule__Context__Group_6__3 : rule__Context__Group_6__3__Impl ;
    public final void rule__Context__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1249:1: ( rule__Context__Group_6__3__Impl )
            // InternalUlmDsl2.g:1250:2: rule__Context__Group_6__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Context__Group_6__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group_6__3"


    // $ANTLR start "rule__Context__Group_6__3__Impl"
    // InternalUlmDsl2.g:1256:1: rule__Context__Group_6__3__Impl : ( '}' ) ;
    public final void rule__Context__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1260:1: ( ( '}' ) )
            // InternalUlmDsl2.g:1261:1: ( '}' )
            {
            // InternalUlmDsl2.g:1261:1: ( '}' )
            // InternalUlmDsl2.g:1262:2: '}'
            {
             before(grammarAccess.getContextAccess().getRightCurlyBracketKeyword_6_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getContextAccess().getRightCurlyBracketKeyword_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group_6__3__Impl"


    // $ANTLR start "rule__Version__Group__0"
    // InternalUlmDsl2.g:1272:1: rule__Version__Group__0 : rule__Version__Group__0__Impl rule__Version__Group__1 ;
    public final void rule__Version__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1276:1: ( rule__Version__Group__0__Impl rule__Version__Group__1 )
            // InternalUlmDsl2.g:1277:2: rule__Version__Group__0__Impl rule__Version__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Version__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Version__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group__0"


    // $ANTLR start "rule__Version__Group__0__Impl"
    // InternalUlmDsl2.g:1284:1: rule__Version__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Version__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1288:1: ( ( RULE_INT ) )
            // InternalUlmDsl2.g:1289:1: ( RULE_INT )
            {
            // InternalUlmDsl2.g:1289:1: ( RULE_INT )
            // InternalUlmDsl2.g:1290:2: RULE_INT
            {
             before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getVersionAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group__0__Impl"


    // $ANTLR start "rule__Version__Group__1"
    // InternalUlmDsl2.g:1299:1: rule__Version__Group__1 : rule__Version__Group__1__Impl rule__Version__Group__2 ;
    public final void rule__Version__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1303:1: ( rule__Version__Group__1__Impl rule__Version__Group__2 )
            // InternalUlmDsl2.g:1304:2: rule__Version__Group__1__Impl rule__Version__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Version__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Version__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group__1"


    // $ANTLR start "rule__Version__Group__1__Impl"
    // InternalUlmDsl2.g:1311:1: rule__Version__Group__1__Impl : ( '.' ) ;
    public final void rule__Version__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1315:1: ( ( '.' ) )
            // InternalUlmDsl2.g:1316:1: ( '.' )
            {
            // InternalUlmDsl2.g:1316:1: ( '.' )
            // InternalUlmDsl2.g:1317:2: '.'
            {
             before(grammarAccess.getVersionAccess().getFullStopKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getVersionAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group__1__Impl"


    // $ANTLR start "rule__Version__Group__2"
    // InternalUlmDsl2.g:1326:1: rule__Version__Group__2 : rule__Version__Group__2__Impl rule__Version__Group__3 ;
    public final void rule__Version__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1330:1: ( rule__Version__Group__2__Impl rule__Version__Group__3 )
            // InternalUlmDsl2.g:1331:2: rule__Version__Group__2__Impl rule__Version__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Version__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Version__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group__2"


    // $ANTLR start "rule__Version__Group__2__Impl"
    // InternalUlmDsl2.g:1338:1: rule__Version__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__Version__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1342:1: ( ( RULE_INT ) )
            // InternalUlmDsl2.g:1343:1: ( RULE_INT )
            {
            // InternalUlmDsl2.g:1343:1: ( RULE_INT )
            // InternalUlmDsl2.g:1344:2: RULE_INT
            {
             before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getVersionAccess().getINTTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group__2__Impl"


    // $ANTLR start "rule__Version__Group__3"
    // InternalUlmDsl2.g:1353:1: rule__Version__Group__3 : rule__Version__Group__3__Impl rule__Version__Group__4 ;
    public final void rule__Version__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1357:1: ( rule__Version__Group__3__Impl rule__Version__Group__4 )
            // InternalUlmDsl2.g:1358:2: rule__Version__Group__3__Impl rule__Version__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Version__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Version__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group__3"


    // $ANTLR start "rule__Version__Group__3__Impl"
    // InternalUlmDsl2.g:1365:1: rule__Version__Group__3__Impl : ( '.' ) ;
    public final void rule__Version__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1369:1: ( ( '.' ) )
            // InternalUlmDsl2.g:1370:1: ( '.' )
            {
            // InternalUlmDsl2.g:1370:1: ( '.' )
            // InternalUlmDsl2.g:1371:2: '.'
            {
             before(grammarAccess.getVersionAccess().getFullStopKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getVersionAccess().getFullStopKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group__3__Impl"


    // $ANTLR start "rule__Version__Group__4"
    // InternalUlmDsl2.g:1380:1: rule__Version__Group__4 : rule__Version__Group__4__Impl ;
    public final void rule__Version__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1384:1: ( rule__Version__Group__4__Impl )
            // InternalUlmDsl2.g:1385:2: rule__Version__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Version__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group__4"


    // $ANTLR start "rule__Version__Group__4__Impl"
    // InternalUlmDsl2.g:1391:1: rule__Version__Group__4__Impl : ( RULE_INT ) ;
    public final void rule__Version__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1395:1: ( ( RULE_INT ) )
            // InternalUlmDsl2.g:1396:1: ( RULE_INT )
            {
            // InternalUlmDsl2.g:1396:1: ( RULE_INT )
            // InternalUlmDsl2.g:1397:2: RULE_INT
            {
             before(grammarAccess.getVersionAccess().getINTTerminalRuleCall_4()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getVersionAccess().getINTTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group__4__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalUlmDsl2.g:1407:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1411:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalUlmDsl2.g:1412:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalUlmDsl2.g:1419:1: rule__Attribute__Group__0__Impl : ( 'attribute' ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1423:1: ( ( 'attribute' ) )
            // InternalUlmDsl2.g:1424:1: ( 'attribute' )
            {
            // InternalUlmDsl2.g:1424:1: ( 'attribute' )
            // InternalUlmDsl2.g:1425:2: 'attribute'
            {
             before(grammarAccess.getAttributeAccess().getAttributeKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getAttributeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalUlmDsl2.g:1434:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1438:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalUlmDsl2.g:1439:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalUlmDsl2.g:1446:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__TypeAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1450:1: ( ( ( rule__Attribute__TypeAssignment_1 ) ) )
            // InternalUlmDsl2.g:1451:1: ( ( rule__Attribute__TypeAssignment_1 ) )
            {
            // InternalUlmDsl2.g:1451:1: ( ( rule__Attribute__TypeAssignment_1 ) )
            // InternalUlmDsl2.g:1452:2: ( rule__Attribute__TypeAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_1()); 
            // InternalUlmDsl2.g:1453:2: ( rule__Attribute__TypeAssignment_1 )
            // InternalUlmDsl2.g:1453:3: rule__Attribute__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalUlmDsl2.g:1461:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1465:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalUlmDsl2.g:1466:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Attribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalUlmDsl2.g:1473:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__NameAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1477:1: ( ( ( rule__Attribute__NameAssignment_2 ) ) )
            // InternalUlmDsl2.g:1478:1: ( ( rule__Attribute__NameAssignment_2 ) )
            {
            // InternalUlmDsl2.g:1478:1: ( ( rule__Attribute__NameAssignment_2 ) )
            // InternalUlmDsl2.g:1479:2: ( rule__Attribute__NameAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_2()); 
            // InternalUlmDsl2.g:1480:2: ( rule__Attribute__NameAssignment_2 )
            // InternalUlmDsl2.g:1480:3: rule__Attribute__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group__3"
    // InternalUlmDsl2.g:1488:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1492:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // InternalUlmDsl2.g:1493:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Attribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3"


    // $ANTLR start "rule__Attribute__Group__3__Impl"
    // InternalUlmDsl2.g:1500:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__DescAssignment_3 )? ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1504:1: ( ( ( rule__Attribute__DescAssignment_3 )? ) )
            // InternalUlmDsl2.g:1505:1: ( ( rule__Attribute__DescAssignment_3 )? )
            {
            // InternalUlmDsl2.g:1505:1: ( ( rule__Attribute__DescAssignment_3 )? )
            // InternalUlmDsl2.g:1506:2: ( rule__Attribute__DescAssignment_3 )?
            {
             before(grammarAccess.getAttributeAccess().getDescAssignment_3()); 
            // InternalUlmDsl2.g:1507:2: ( rule__Attribute__DescAssignment_3 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalUlmDsl2.g:1507:3: rule__Attribute__DescAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__DescAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getDescAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3__Impl"


    // $ANTLR start "rule__Attribute__Group__4"
    // InternalUlmDsl2.g:1515:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1519:1: ( rule__Attribute__Group__4__Impl )
            // InternalUlmDsl2.g:1520:2: rule__Attribute__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__4"


    // $ANTLR start "rule__Attribute__Group__4__Impl"
    // InternalUlmDsl2.g:1526:1: rule__Attribute__Group__4__Impl : ( ';' ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1530:1: ( ( ';' ) )
            // InternalUlmDsl2.g:1531:1: ( ';' )
            {
            // InternalUlmDsl2.g:1531:1: ( ';' )
            // InternalUlmDsl2.g:1532:2: ';'
            {
             before(grammarAccess.getAttributeAccess().getSemicolonKeyword_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__4__Impl"


    // $ANTLR start "rule__AttributeType__Group__0"
    // InternalUlmDsl2.g:1542:1: rule__AttributeType__Group__0 : rule__AttributeType__Group__0__Impl rule__AttributeType__Group__1 ;
    public final void rule__AttributeType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1546:1: ( rule__AttributeType__Group__0__Impl rule__AttributeType__Group__1 )
            // InternalUlmDsl2.g:1547:2: rule__AttributeType__Group__0__Impl rule__AttributeType__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__AttributeType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Group__0"


    // $ANTLR start "rule__AttributeType__Group__0__Impl"
    // InternalUlmDsl2.g:1554:1: rule__AttributeType__Group__0__Impl : ( ( rule__AttributeType__TypeAssignment_0 ) ) ;
    public final void rule__AttributeType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1558:1: ( ( ( rule__AttributeType__TypeAssignment_0 ) ) )
            // InternalUlmDsl2.g:1559:1: ( ( rule__AttributeType__TypeAssignment_0 ) )
            {
            // InternalUlmDsl2.g:1559:1: ( ( rule__AttributeType__TypeAssignment_0 ) )
            // InternalUlmDsl2.g:1560:2: ( rule__AttributeType__TypeAssignment_0 )
            {
             before(grammarAccess.getAttributeTypeAccess().getTypeAssignment_0()); 
            // InternalUlmDsl2.g:1561:2: ( rule__AttributeType__TypeAssignment_0 )
            // InternalUlmDsl2.g:1561:3: rule__AttributeType__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeType__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeTypeAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Group__0__Impl"


    // $ANTLR start "rule__AttributeType__Group__1"
    // InternalUlmDsl2.g:1569:1: rule__AttributeType__Group__1 : rule__AttributeType__Group__1__Impl ;
    public final void rule__AttributeType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1573:1: ( rule__AttributeType__Group__1__Impl )
            // InternalUlmDsl2.g:1574:2: rule__AttributeType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Group__1"


    // $ANTLR start "rule__AttributeType__Group__1__Impl"
    // InternalUlmDsl2.g:1580:1: rule__AttributeType__Group__1__Impl : ( ( rule__AttributeType__Group_1__0 )? ) ;
    public final void rule__AttributeType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1584:1: ( ( ( rule__AttributeType__Group_1__0 )? ) )
            // InternalUlmDsl2.g:1585:1: ( ( rule__AttributeType__Group_1__0 )? )
            {
            // InternalUlmDsl2.g:1585:1: ( ( rule__AttributeType__Group_1__0 )? )
            // InternalUlmDsl2.g:1586:2: ( rule__AttributeType__Group_1__0 )?
            {
             before(grammarAccess.getAttributeTypeAccess().getGroup_1()); 
            // InternalUlmDsl2.g:1587:2: ( rule__AttributeType__Group_1__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==42) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalUlmDsl2.g:1587:3: rule__AttributeType__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributeType__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeTypeAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Group__1__Impl"


    // $ANTLR start "rule__AttributeType__Group_1__0"
    // InternalUlmDsl2.g:1596:1: rule__AttributeType__Group_1__0 : rule__AttributeType__Group_1__0__Impl rule__AttributeType__Group_1__1 ;
    public final void rule__AttributeType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1600:1: ( rule__AttributeType__Group_1__0__Impl rule__AttributeType__Group_1__1 )
            // InternalUlmDsl2.g:1601:2: rule__AttributeType__Group_1__0__Impl rule__AttributeType__Group_1__1
            {
            pushFollow(FOLLOW_19);
            rule__AttributeType__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeType__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Group_1__0"


    // $ANTLR start "rule__AttributeType__Group_1__0__Impl"
    // InternalUlmDsl2.g:1608:1: rule__AttributeType__Group_1__0__Impl : ( ( rule__AttributeType__ArrayAssignment_1_0 ) ) ;
    public final void rule__AttributeType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1612:1: ( ( ( rule__AttributeType__ArrayAssignment_1_0 ) ) )
            // InternalUlmDsl2.g:1613:1: ( ( rule__AttributeType__ArrayAssignment_1_0 ) )
            {
            // InternalUlmDsl2.g:1613:1: ( ( rule__AttributeType__ArrayAssignment_1_0 ) )
            // InternalUlmDsl2.g:1614:2: ( rule__AttributeType__ArrayAssignment_1_0 )
            {
             before(grammarAccess.getAttributeTypeAccess().getArrayAssignment_1_0()); 
            // InternalUlmDsl2.g:1615:2: ( rule__AttributeType__ArrayAssignment_1_0 )
            // InternalUlmDsl2.g:1615:3: rule__AttributeType__ArrayAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeType__ArrayAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeTypeAccess().getArrayAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Group_1__0__Impl"


    // $ANTLR start "rule__AttributeType__Group_1__1"
    // InternalUlmDsl2.g:1623:1: rule__AttributeType__Group_1__1 : rule__AttributeType__Group_1__1__Impl rule__AttributeType__Group_1__2 ;
    public final void rule__AttributeType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1627:1: ( rule__AttributeType__Group_1__1__Impl rule__AttributeType__Group_1__2 )
            // InternalUlmDsl2.g:1628:2: rule__AttributeType__Group_1__1__Impl rule__AttributeType__Group_1__2
            {
            pushFollow(FOLLOW_19);
            rule__AttributeType__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeType__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Group_1__1"


    // $ANTLR start "rule__AttributeType__Group_1__1__Impl"
    // InternalUlmDsl2.g:1635:1: rule__AttributeType__Group_1__1__Impl : ( ( rule__AttributeType__LengthAssignment_1_1 )? ) ;
    public final void rule__AttributeType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1639:1: ( ( ( rule__AttributeType__LengthAssignment_1_1 )? ) )
            // InternalUlmDsl2.g:1640:1: ( ( rule__AttributeType__LengthAssignment_1_1 )? )
            {
            // InternalUlmDsl2.g:1640:1: ( ( rule__AttributeType__LengthAssignment_1_1 )? )
            // InternalUlmDsl2.g:1641:2: ( rule__AttributeType__LengthAssignment_1_1 )?
            {
             before(grammarAccess.getAttributeTypeAccess().getLengthAssignment_1_1()); 
            // InternalUlmDsl2.g:1642:2: ( rule__AttributeType__LengthAssignment_1_1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INT) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalUlmDsl2.g:1642:3: rule__AttributeType__LengthAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributeType__LengthAssignment_1_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeTypeAccess().getLengthAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Group_1__1__Impl"


    // $ANTLR start "rule__AttributeType__Group_1__2"
    // InternalUlmDsl2.g:1650:1: rule__AttributeType__Group_1__2 : rule__AttributeType__Group_1__2__Impl ;
    public final void rule__AttributeType__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1654:1: ( rule__AttributeType__Group_1__2__Impl )
            // InternalUlmDsl2.g:1655:2: rule__AttributeType__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeType__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Group_1__2"


    // $ANTLR start "rule__AttributeType__Group_1__2__Impl"
    // InternalUlmDsl2.g:1661:1: rule__AttributeType__Group_1__2__Impl : ( ']' ) ;
    public final void rule__AttributeType__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1665:1: ( ( ']' ) )
            // InternalUlmDsl2.g:1666:1: ( ']' )
            {
            // InternalUlmDsl2.g:1666:1: ( ']' )
            // InternalUlmDsl2.g:1667:2: ']'
            {
             before(grammarAccess.getAttributeTypeAccess().getRightSquareBracketKeyword_1_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getAttributeTypeAccess().getRightSquareBracketKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Group_1__2__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalUlmDsl2.g:1677:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1681:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalUlmDsl2.g:1682:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // InternalUlmDsl2.g:1689:1: rule__Entity__Group__0__Impl : ( ( rule__Entity__TypeAssignment_0 )? ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1693:1: ( ( ( rule__Entity__TypeAssignment_0 )? ) )
            // InternalUlmDsl2.g:1694:1: ( ( rule__Entity__TypeAssignment_0 )? )
            {
            // InternalUlmDsl2.g:1694:1: ( ( rule__Entity__TypeAssignment_0 )? )
            // InternalUlmDsl2.g:1695:2: ( rule__Entity__TypeAssignment_0 )?
            {
             before(grammarAccess.getEntityAccess().getTypeAssignment_0()); 
            // InternalUlmDsl2.g:1696:2: ( rule__Entity__TypeAssignment_0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=18 && LA15_0<=20)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalUlmDsl2.g:1696:3: rule__Entity__TypeAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__TypeAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // InternalUlmDsl2.g:1704:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1708:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalUlmDsl2.g:1709:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // InternalUlmDsl2.g:1716:1: rule__Entity__Group__1__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1720:1: ( ( 'entity' ) )
            // InternalUlmDsl2.g:1721:1: ( 'entity' )
            {
            // InternalUlmDsl2.g:1721:1: ( 'entity' )
            // InternalUlmDsl2.g:1722:2: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // InternalUlmDsl2.g:1731:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1735:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalUlmDsl2.g:1736:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // InternalUlmDsl2.g:1743:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__NameAssignment_2 ) ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1747:1: ( ( ( rule__Entity__NameAssignment_2 ) ) )
            // InternalUlmDsl2.g:1748:1: ( ( rule__Entity__NameAssignment_2 ) )
            {
            // InternalUlmDsl2.g:1748:1: ( ( rule__Entity__NameAssignment_2 ) )
            // InternalUlmDsl2.g:1749:2: ( rule__Entity__NameAssignment_2 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_2()); 
            // InternalUlmDsl2.g:1750:2: ( rule__Entity__NameAssignment_2 )
            // InternalUlmDsl2.g:1750:3: rule__Entity__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Entity__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // InternalUlmDsl2.g:1758:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1762:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalUlmDsl2.g:1763:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // InternalUlmDsl2.g:1770:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__DescAssignment_3 )? ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1774:1: ( ( ( rule__Entity__DescAssignment_3 )? ) )
            // InternalUlmDsl2.g:1775:1: ( ( rule__Entity__DescAssignment_3 )? )
            {
            // InternalUlmDsl2.g:1775:1: ( ( rule__Entity__DescAssignment_3 )? )
            // InternalUlmDsl2.g:1776:2: ( rule__Entity__DescAssignment_3 )?
            {
             before(grammarAccess.getEntityAccess().getDescAssignment_3()); 
            // InternalUlmDsl2.g:1777:2: ( rule__Entity__DescAssignment_3 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalUlmDsl2.g:1777:3: rule__Entity__DescAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__DescAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getDescAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // InternalUlmDsl2.g:1785:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1789:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // InternalUlmDsl2.g:1790:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__Entity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // InternalUlmDsl2.g:1797:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__Group_4__0 )? ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1801:1: ( ( ( rule__Entity__Group_4__0 )? ) )
            // InternalUlmDsl2.g:1802:1: ( ( rule__Entity__Group_4__0 )? )
            {
            // InternalUlmDsl2.g:1802:1: ( ( rule__Entity__Group_4__0 )? )
            // InternalUlmDsl2.g:1803:2: ( rule__Entity__Group_4__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_4()); 
            // InternalUlmDsl2.g:1804:2: ( rule__Entity__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==33) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalUlmDsl2.g:1804:3: rule__Entity__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Entity__Group__5"
    // InternalUlmDsl2.g:1812:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl rule__Entity__Group__6 ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1816:1: ( rule__Entity__Group__5__Impl rule__Entity__Group__6 )
            // InternalUlmDsl2.g:1817:2: rule__Entity__Group__5__Impl rule__Entity__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__Entity__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__5"


    // $ANTLR start "rule__Entity__Group__5__Impl"
    // InternalUlmDsl2.g:1824:1: rule__Entity__Group__5__Impl : ( '{' ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1828:1: ( ( '{' ) )
            // InternalUlmDsl2.g:1829:1: ( '{' )
            {
            // InternalUlmDsl2.g:1829:1: ( '{' )
            // InternalUlmDsl2.g:1830:2: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__5__Impl"


    // $ANTLR start "rule__Entity__Group__6"
    // InternalUlmDsl2.g:1839:1: rule__Entity__Group__6 : rule__Entity__Group__6__Impl rule__Entity__Group__7 ;
    public final void rule__Entity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1843:1: ( rule__Entity__Group__6__Impl rule__Entity__Group__7 )
            // InternalUlmDsl2.g:1844:2: rule__Entity__Group__6__Impl rule__Entity__Group__7
            {
            pushFollow(FOLLOW_22);
            rule__Entity__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__6"


    // $ANTLR start "rule__Entity__Group__6__Impl"
    // InternalUlmDsl2.g:1851:1: rule__Entity__Group__6__Impl : ( ( rule__Entity__Group_6__0 )? ) ;
    public final void rule__Entity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1855:1: ( ( ( rule__Entity__Group_6__0 )? ) )
            // InternalUlmDsl2.g:1856:1: ( ( rule__Entity__Group_6__0 )? )
            {
            // InternalUlmDsl2.g:1856:1: ( ( rule__Entity__Group_6__0 )? )
            // InternalUlmDsl2.g:1857:2: ( rule__Entity__Group_6__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_6()); 
            // InternalUlmDsl2.g:1858:2: ( rule__Entity__Group_6__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==34) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalUlmDsl2.g:1858:3: rule__Entity__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__6__Impl"


    // $ANTLR start "rule__Entity__Group__7"
    // InternalUlmDsl2.g:1866:1: rule__Entity__Group__7 : rule__Entity__Group__7__Impl ;
    public final void rule__Entity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1870:1: ( rule__Entity__Group__7__Impl )
            // InternalUlmDsl2.g:1871:2: rule__Entity__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__7"


    // $ANTLR start "rule__Entity__Group__7__Impl"
    // InternalUlmDsl2.g:1877:1: rule__Entity__Group__7__Impl : ( '}' ) ;
    public final void rule__Entity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1881:1: ( ( '}' ) )
            // InternalUlmDsl2.g:1882:1: ( '}' )
            {
            // InternalUlmDsl2.g:1882:1: ( '}' )
            // InternalUlmDsl2.g:1883:2: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_7()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__7__Impl"


    // $ANTLR start "rule__Entity__Group_4__0"
    // InternalUlmDsl2.g:1893:1: rule__Entity__Group_4__0 : rule__Entity__Group_4__0__Impl rule__Entity__Group_4__1 ;
    public final void rule__Entity__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1897:1: ( rule__Entity__Group_4__0__Impl rule__Entity__Group_4__1 )
            // InternalUlmDsl2.g:1898:2: rule__Entity__Group_4__0__Impl rule__Entity__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__Entity__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_4__0"


    // $ANTLR start "rule__Entity__Group_4__0__Impl"
    // InternalUlmDsl2.g:1905:1: rule__Entity__Group_4__0__Impl : ( 'extends' ) ;
    public final void rule__Entity__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1909:1: ( ( 'extends' ) )
            // InternalUlmDsl2.g:1910:1: ( 'extends' )
            {
            // InternalUlmDsl2.g:1910:1: ( 'extends' )
            // InternalUlmDsl2.g:1911:2: 'extends'
            {
             before(grammarAccess.getEntityAccess().getExtendsKeyword_4_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getExtendsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_4__0__Impl"


    // $ANTLR start "rule__Entity__Group_4__1"
    // InternalUlmDsl2.g:1920:1: rule__Entity__Group_4__1 : rule__Entity__Group_4__1__Impl ;
    public final void rule__Entity__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1924:1: ( rule__Entity__Group_4__1__Impl )
            // InternalUlmDsl2.g:1925:2: rule__Entity__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_4__1"


    // $ANTLR start "rule__Entity__Group_4__1__Impl"
    // InternalUlmDsl2.g:1931:1: rule__Entity__Group_4__1__Impl : ( ( rule__Entity__SuperTypeAssignment_4_1 ) ) ;
    public final void rule__Entity__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1935:1: ( ( ( rule__Entity__SuperTypeAssignment_4_1 ) ) )
            // InternalUlmDsl2.g:1936:1: ( ( rule__Entity__SuperTypeAssignment_4_1 ) )
            {
            // InternalUlmDsl2.g:1936:1: ( ( rule__Entity__SuperTypeAssignment_4_1 ) )
            // InternalUlmDsl2.g:1937:2: ( rule__Entity__SuperTypeAssignment_4_1 )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeAssignment_4_1()); 
            // InternalUlmDsl2.g:1938:2: ( rule__Entity__SuperTypeAssignment_4_1 )
            // InternalUlmDsl2.g:1938:3: rule__Entity__SuperTypeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__SuperTypeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getSuperTypeAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_4__1__Impl"


    // $ANTLR start "rule__Entity__Group_6__0"
    // InternalUlmDsl2.g:1947:1: rule__Entity__Group_6__0 : rule__Entity__Group_6__0__Impl rule__Entity__Group_6__1 ;
    public final void rule__Entity__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1951:1: ( rule__Entity__Group_6__0__Impl rule__Entity__Group_6__1 )
            // InternalUlmDsl2.g:1952:2: rule__Entity__Group_6__0__Impl rule__Entity__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__Entity__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_6__0"


    // $ANTLR start "rule__Entity__Group_6__0__Impl"
    // InternalUlmDsl2.g:1959:1: rule__Entity__Group_6__0__Impl : ( 'features' ) ;
    public final void rule__Entity__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1963:1: ( ( 'features' ) )
            // InternalUlmDsl2.g:1964:1: ( 'features' )
            {
            // InternalUlmDsl2.g:1964:1: ( 'features' )
            // InternalUlmDsl2.g:1965:2: 'features'
            {
             before(grammarAccess.getEntityAccess().getFeaturesKeyword_6_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getFeaturesKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_6__0__Impl"


    // $ANTLR start "rule__Entity__Group_6__1"
    // InternalUlmDsl2.g:1974:1: rule__Entity__Group_6__1 : rule__Entity__Group_6__1__Impl rule__Entity__Group_6__2 ;
    public final void rule__Entity__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1978:1: ( rule__Entity__Group_6__1__Impl rule__Entity__Group_6__2 )
            // InternalUlmDsl2.g:1979:2: rule__Entity__Group_6__1__Impl rule__Entity__Group_6__2
            {
            pushFollow(FOLLOW_23);
            rule__Entity__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_6__1"


    // $ANTLR start "rule__Entity__Group_6__1__Impl"
    // InternalUlmDsl2.g:1986:1: rule__Entity__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Entity__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1990:1: ( ( '{' ) )
            // InternalUlmDsl2.g:1991:1: ( '{' )
            {
            // InternalUlmDsl2.g:1991:1: ( '{' )
            // InternalUlmDsl2.g:1992:2: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_6__1__Impl"


    // $ANTLR start "rule__Entity__Group_6__2"
    // InternalUlmDsl2.g:2001:1: rule__Entity__Group_6__2 : rule__Entity__Group_6__2__Impl rule__Entity__Group_6__3 ;
    public final void rule__Entity__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2005:1: ( rule__Entity__Group_6__2__Impl rule__Entity__Group_6__3 )
            // InternalUlmDsl2.g:2006:2: rule__Entity__Group_6__2__Impl rule__Entity__Group_6__3
            {
            pushFollow(FOLLOW_23);
            rule__Entity__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_6__2"


    // $ANTLR start "rule__Entity__Group_6__2__Impl"
    // InternalUlmDsl2.g:2013:1: rule__Entity__Group_6__2__Impl : ( ( rule__Entity__FeaturesAssignment_6_2 )* ) ;
    public final void rule__Entity__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2017:1: ( ( ( rule__Entity__FeaturesAssignment_6_2 )* ) )
            // InternalUlmDsl2.g:2018:1: ( ( rule__Entity__FeaturesAssignment_6_2 )* )
            {
            // InternalUlmDsl2.g:2018:1: ( ( rule__Entity__FeaturesAssignment_6_2 )* )
            // InternalUlmDsl2.g:2019:2: ( rule__Entity__FeaturesAssignment_6_2 )*
            {
             before(grammarAccess.getEntityAccess().getFeaturesAssignment_6_2()); 
            // InternalUlmDsl2.g:2020:2: ( rule__Entity__FeaturesAssignment_6_2 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==36) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalUlmDsl2.g:2020:3: rule__Entity__FeaturesAssignment_6_2
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Entity__FeaturesAssignment_6_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getFeaturesAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_6__2__Impl"


    // $ANTLR start "rule__Entity__Group_6__3"
    // InternalUlmDsl2.g:2028:1: rule__Entity__Group_6__3 : rule__Entity__Group_6__3__Impl ;
    public final void rule__Entity__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2032:1: ( rule__Entity__Group_6__3__Impl )
            // InternalUlmDsl2.g:2033:2: rule__Entity__Group_6__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_6__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_6__3"


    // $ANTLR start "rule__Entity__Group_6__3__Impl"
    // InternalUlmDsl2.g:2039:1: rule__Entity__Group_6__3__Impl : ( '}' ) ;
    public final void rule__Entity__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2043:1: ( ( '}' ) )
            // InternalUlmDsl2.g:2044:1: ( '}' )
            {
            // InternalUlmDsl2.g:2044:1: ( '}' )
            // InternalUlmDsl2.g:2045:2: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_6__3__Impl"


    // $ANTLR start "rule__Feature__Group__0"
    // InternalUlmDsl2.g:2055:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2059:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // InternalUlmDsl2.g:2060:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Feature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__0"


    // $ANTLR start "rule__Feature__Group__0__Impl"
    // InternalUlmDsl2.g:2067:1: rule__Feature__Group__0__Impl : ( ( rule__Feature__FeatureTypeAssignment_0 ) ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2071:1: ( ( ( rule__Feature__FeatureTypeAssignment_0 ) ) )
            // InternalUlmDsl2.g:2072:1: ( ( rule__Feature__FeatureTypeAssignment_0 ) )
            {
            // InternalUlmDsl2.g:2072:1: ( ( rule__Feature__FeatureTypeAssignment_0 ) )
            // InternalUlmDsl2.g:2073:2: ( rule__Feature__FeatureTypeAssignment_0 )
            {
             before(grammarAccess.getFeatureAccess().getFeatureTypeAssignment_0()); 
            // InternalUlmDsl2.g:2074:2: ( rule__Feature__FeatureTypeAssignment_0 )
            // InternalUlmDsl2.g:2074:3: rule__Feature__FeatureTypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Feature__FeatureTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getFeatureTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__0__Impl"


    // $ANTLR start "rule__Feature__Group__1"
    // InternalUlmDsl2.g:2082:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2086:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // InternalUlmDsl2.g:2087:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__Feature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__1"


    // $ANTLR start "rule__Feature__Group__1__Impl"
    // InternalUlmDsl2.g:2094:1: rule__Feature__Group__1__Impl : ( ( rule__Feature__MandatoryAssignment_1 )? ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2098:1: ( ( ( rule__Feature__MandatoryAssignment_1 )? ) )
            // InternalUlmDsl2.g:2099:1: ( ( rule__Feature__MandatoryAssignment_1 )? )
            {
            // InternalUlmDsl2.g:2099:1: ( ( rule__Feature__MandatoryAssignment_1 )? )
            // InternalUlmDsl2.g:2100:2: ( rule__Feature__MandatoryAssignment_1 )?
            {
             before(grammarAccess.getFeatureAccess().getMandatoryAssignment_1()); 
            // InternalUlmDsl2.g:2101:2: ( rule__Feature__MandatoryAssignment_1 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==43) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalUlmDsl2.g:2101:3: rule__Feature__MandatoryAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Feature__MandatoryAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getMandatoryAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__1__Impl"


    // $ANTLR start "rule__Feature__Group__2"
    // InternalUlmDsl2.g:2109:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl rule__Feature__Group__3 ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2113:1: ( rule__Feature__Group__2__Impl rule__Feature__Group__3 )
            // InternalUlmDsl2.g:2114:2: rule__Feature__Group__2__Impl rule__Feature__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__Feature__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__2"


    // $ANTLR start "rule__Feature__Group__2__Impl"
    // InternalUlmDsl2.g:2121:1: rule__Feature__Group__2__Impl : ( ( rule__Feature__IdentifierAssignment_2 )? ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2125:1: ( ( ( rule__Feature__IdentifierAssignment_2 )? ) )
            // InternalUlmDsl2.g:2126:1: ( ( rule__Feature__IdentifierAssignment_2 )? )
            {
            // InternalUlmDsl2.g:2126:1: ( ( rule__Feature__IdentifierAssignment_2 )? )
            // InternalUlmDsl2.g:2127:2: ( rule__Feature__IdentifierAssignment_2 )?
            {
             before(grammarAccess.getFeatureAccess().getIdentifierAssignment_2()); 
            // InternalUlmDsl2.g:2128:2: ( rule__Feature__IdentifierAssignment_2 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==44) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalUlmDsl2.g:2128:3: rule__Feature__IdentifierAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Feature__IdentifierAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getIdentifierAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__2__Impl"


    // $ANTLR start "rule__Feature__Group__3"
    // InternalUlmDsl2.g:2136:1: rule__Feature__Group__3 : rule__Feature__Group__3__Impl rule__Feature__Group__4 ;
    public final void rule__Feature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2140:1: ( rule__Feature__Group__3__Impl rule__Feature__Group__4 )
            // InternalUlmDsl2.g:2141:2: rule__Feature__Group__3__Impl rule__Feature__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__Feature__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__3"


    // $ANTLR start "rule__Feature__Group__3__Impl"
    // InternalUlmDsl2.g:2148:1: rule__Feature__Group__3__Impl : ( ( rule__Feature__Group_3__0 )? ) ;
    public final void rule__Feature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2152:1: ( ( ( rule__Feature__Group_3__0 )? ) )
            // InternalUlmDsl2.g:2153:1: ( ( rule__Feature__Group_3__0 )? )
            {
            // InternalUlmDsl2.g:2153:1: ( ( rule__Feature__Group_3__0 )? )
            // InternalUlmDsl2.g:2154:2: ( rule__Feature__Group_3__0 )?
            {
             before(grammarAccess.getFeatureAccess().getGroup_3()); 
            // InternalUlmDsl2.g:2155:2: ( rule__Feature__Group_3__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==35) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalUlmDsl2.g:2155:3: rule__Feature__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Feature__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__3__Impl"


    // $ANTLR start "rule__Feature__Group__4"
    // InternalUlmDsl2.g:2163:1: rule__Feature__Group__4 : rule__Feature__Group__4__Impl ;
    public final void rule__Feature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2167:1: ( rule__Feature__Group__4__Impl )
            // InternalUlmDsl2.g:2168:2: rule__Feature__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__4"


    // $ANTLR start "rule__Feature__Group__4__Impl"
    // InternalUlmDsl2.g:2174:1: rule__Feature__Group__4__Impl : ( ';' ) ;
    public final void rule__Feature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2178:1: ( ( ';' ) )
            // InternalUlmDsl2.g:2179:1: ( ';' )
            {
            // InternalUlmDsl2.g:2179:1: ( ';' )
            // InternalUlmDsl2.g:2180:2: ';'
            {
             before(grammarAccess.getFeatureAccess().getSemicolonKeyword_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__4__Impl"


    // $ANTLR start "rule__Feature__Group_3__0"
    // InternalUlmDsl2.g:2190:1: rule__Feature__Group_3__0 : rule__Feature__Group_3__0__Impl rule__Feature__Group_3__1 ;
    public final void rule__Feature__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2194:1: ( rule__Feature__Group_3__0__Impl rule__Feature__Group_3__1 )
            // InternalUlmDsl2.g:2195:2: rule__Feature__Group_3__0__Impl rule__Feature__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Feature__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_3__0"


    // $ANTLR start "rule__Feature__Group_3__0__Impl"
    // InternalUlmDsl2.g:2202:1: rule__Feature__Group_3__0__Impl : ( 'as' ) ;
    public final void rule__Feature__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2206:1: ( ( 'as' ) )
            // InternalUlmDsl2.g:2207:1: ( 'as' )
            {
            // InternalUlmDsl2.g:2207:1: ( 'as' )
            // InternalUlmDsl2.g:2208:2: 'as'
            {
             before(grammarAccess.getFeatureAccess().getAsKeyword_3_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getAsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_3__0__Impl"


    // $ANTLR start "rule__Feature__Group_3__1"
    // InternalUlmDsl2.g:2217:1: rule__Feature__Group_3__1 : rule__Feature__Group_3__1__Impl ;
    public final void rule__Feature__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2221:1: ( rule__Feature__Group_3__1__Impl )
            // InternalUlmDsl2.g:2222:2: rule__Feature__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_3__1"


    // $ANTLR start "rule__Feature__Group_3__1__Impl"
    // InternalUlmDsl2.g:2228:1: rule__Feature__Group_3__1__Impl : ( ( rule__Feature__AliasAssignment_3_1 ) ) ;
    public final void rule__Feature__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2232:1: ( ( ( rule__Feature__AliasAssignment_3_1 ) ) )
            // InternalUlmDsl2.g:2233:1: ( ( rule__Feature__AliasAssignment_3_1 ) )
            {
            // InternalUlmDsl2.g:2233:1: ( ( rule__Feature__AliasAssignment_3_1 ) )
            // InternalUlmDsl2.g:2234:2: ( rule__Feature__AliasAssignment_3_1 )
            {
             before(grammarAccess.getFeatureAccess().getAliasAssignment_3_1()); 
            // InternalUlmDsl2.g:2235:2: ( rule__Feature__AliasAssignment_3_1 )
            // InternalUlmDsl2.g:2235:3: rule__Feature__AliasAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Feature__AliasAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getAliasAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_3__1__Impl"


    // $ANTLR start "rule__FeatureTypeType__Group__0"
    // InternalUlmDsl2.g:2244:1: rule__FeatureTypeType__Group__0 : rule__FeatureTypeType__Group__0__Impl rule__FeatureTypeType__Group__1 ;
    public final void rule__FeatureTypeType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2248:1: ( rule__FeatureTypeType__Group__0__Impl rule__FeatureTypeType__Group__1 )
            // InternalUlmDsl2.g:2249:2: rule__FeatureTypeType__Group__0__Impl rule__FeatureTypeType__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__FeatureTypeType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureTypeType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureTypeType__Group__0"


    // $ANTLR start "rule__FeatureTypeType__Group__0__Impl"
    // InternalUlmDsl2.g:2256:1: rule__FeatureTypeType__Group__0__Impl : ( ( rule__FeatureTypeType__TypeAssignment_0 ) ) ;
    public final void rule__FeatureTypeType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2260:1: ( ( ( rule__FeatureTypeType__TypeAssignment_0 ) ) )
            // InternalUlmDsl2.g:2261:1: ( ( rule__FeatureTypeType__TypeAssignment_0 ) )
            {
            // InternalUlmDsl2.g:2261:1: ( ( rule__FeatureTypeType__TypeAssignment_0 ) )
            // InternalUlmDsl2.g:2262:2: ( rule__FeatureTypeType__TypeAssignment_0 )
            {
             before(grammarAccess.getFeatureTypeTypeAccess().getTypeAssignment_0()); 
            // InternalUlmDsl2.g:2263:2: ( rule__FeatureTypeType__TypeAssignment_0 )
            // InternalUlmDsl2.g:2263:3: rule__FeatureTypeType__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__FeatureTypeType__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureTypeTypeAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureTypeType__Group__0__Impl"


    // $ANTLR start "rule__FeatureTypeType__Group__1"
    // InternalUlmDsl2.g:2271:1: rule__FeatureTypeType__Group__1 : rule__FeatureTypeType__Group__1__Impl ;
    public final void rule__FeatureTypeType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2275:1: ( rule__FeatureTypeType__Group__1__Impl )
            // InternalUlmDsl2.g:2276:2: rule__FeatureTypeType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureTypeType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureTypeType__Group__1"


    // $ANTLR start "rule__FeatureTypeType__Group__1__Impl"
    // InternalUlmDsl2.g:2282:1: rule__FeatureTypeType__Group__1__Impl : ( ( rule__FeatureTypeType__Group_1__0 )? ) ;
    public final void rule__FeatureTypeType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2286:1: ( ( ( rule__FeatureTypeType__Group_1__0 )? ) )
            // InternalUlmDsl2.g:2287:1: ( ( rule__FeatureTypeType__Group_1__0 )? )
            {
            // InternalUlmDsl2.g:2287:1: ( ( rule__FeatureTypeType__Group_1__0 )? )
            // InternalUlmDsl2.g:2288:2: ( rule__FeatureTypeType__Group_1__0 )?
            {
             before(grammarAccess.getFeatureTypeTypeAccess().getGroup_1()); 
            // InternalUlmDsl2.g:2289:2: ( rule__FeatureTypeType__Group_1__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==42) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalUlmDsl2.g:2289:3: rule__FeatureTypeType__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FeatureTypeType__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureTypeTypeAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureTypeType__Group__1__Impl"


    // $ANTLR start "rule__FeatureTypeType__Group_1__0"
    // InternalUlmDsl2.g:2298:1: rule__FeatureTypeType__Group_1__0 : rule__FeatureTypeType__Group_1__0__Impl rule__FeatureTypeType__Group_1__1 ;
    public final void rule__FeatureTypeType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2302:1: ( rule__FeatureTypeType__Group_1__0__Impl rule__FeatureTypeType__Group_1__1 )
            // InternalUlmDsl2.g:2303:2: rule__FeatureTypeType__Group_1__0__Impl rule__FeatureTypeType__Group_1__1
            {
            pushFollow(FOLLOW_19);
            rule__FeatureTypeType__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureTypeType__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureTypeType__Group_1__0"


    // $ANTLR start "rule__FeatureTypeType__Group_1__0__Impl"
    // InternalUlmDsl2.g:2310:1: rule__FeatureTypeType__Group_1__0__Impl : ( ( rule__FeatureTypeType__ArrayAssignment_1_0 ) ) ;
    public final void rule__FeatureTypeType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2314:1: ( ( ( rule__FeatureTypeType__ArrayAssignment_1_0 ) ) )
            // InternalUlmDsl2.g:2315:1: ( ( rule__FeatureTypeType__ArrayAssignment_1_0 ) )
            {
            // InternalUlmDsl2.g:2315:1: ( ( rule__FeatureTypeType__ArrayAssignment_1_0 ) )
            // InternalUlmDsl2.g:2316:2: ( rule__FeatureTypeType__ArrayAssignment_1_0 )
            {
             before(grammarAccess.getFeatureTypeTypeAccess().getArrayAssignment_1_0()); 
            // InternalUlmDsl2.g:2317:2: ( rule__FeatureTypeType__ArrayAssignment_1_0 )
            // InternalUlmDsl2.g:2317:3: rule__FeatureTypeType__ArrayAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__FeatureTypeType__ArrayAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureTypeTypeAccess().getArrayAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureTypeType__Group_1__0__Impl"


    // $ANTLR start "rule__FeatureTypeType__Group_1__1"
    // InternalUlmDsl2.g:2325:1: rule__FeatureTypeType__Group_1__1 : rule__FeatureTypeType__Group_1__1__Impl rule__FeatureTypeType__Group_1__2 ;
    public final void rule__FeatureTypeType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2329:1: ( rule__FeatureTypeType__Group_1__1__Impl rule__FeatureTypeType__Group_1__2 )
            // InternalUlmDsl2.g:2330:2: rule__FeatureTypeType__Group_1__1__Impl rule__FeatureTypeType__Group_1__2
            {
            pushFollow(FOLLOW_19);
            rule__FeatureTypeType__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureTypeType__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureTypeType__Group_1__1"


    // $ANTLR start "rule__FeatureTypeType__Group_1__1__Impl"
    // InternalUlmDsl2.g:2337:1: rule__FeatureTypeType__Group_1__1__Impl : ( ( rule__FeatureTypeType__LengthAssignment_1_1 )? ) ;
    public final void rule__FeatureTypeType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2341:1: ( ( ( rule__FeatureTypeType__LengthAssignment_1_1 )? ) )
            // InternalUlmDsl2.g:2342:1: ( ( rule__FeatureTypeType__LengthAssignment_1_1 )? )
            {
            // InternalUlmDsl2.g:2342:1: ( ( rule__FeatureTypeType__LengthAssignment_1_1 )? )
            // InternalUlmDsl2.g:2343:2: ( rule__FeatureTypeType__LengthAssignment_1_1 )?
            {
             before(grammarAccess.getFeatureTypeTypeAccess().getLengthAssignment_1_1()); 
            // InternalUlmDsl2.g:2344:2: ( rule__FeatureTypeType__LengthAssignment_1_1 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_INT) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalUlmDsl2.g:2344:3: rule__FeatureTypeType__LengthAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__FeatureTypeType__LengthAssignment_1_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureTypeTypeAccess().getLengthAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureTypeType__Group_1__1__Impl"


    // $ANTLR start "rule__FeatureTypeType__Group_1__2"
    // InternalUlmDsl2.g:2352:1: rule__FeatureTypeType__Group_1__2 : rule__FeatureTypeType__Group_1__2__Impl ;
    public final void rule__FeatureTypeType__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2356:1: ( rule__FeatureTypeType__Group_1__2__Impl )
            // InternalUlmDsl2.g:2357:2: rule__FeatureTypeType__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureTypeType__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureTypeType__Group_1__2"


    // $ANTLR start "rule__FeatureTypeType__Group_1__2__Impl"
    // InternalUlmDsl2.g:2363:1: rule__FeatureTypeType__Group_1__2__Impl : ( ']' ) ;
    public final void rule__FeatureTypeType__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2367:1: ( ( ']' ) )
            // InternalUlmDsl2.g:2368:1: ( ']' )
            {
            // InternalUlmDsl2.g:2368:1: ( ']' )
            // InternalUlmDsl2.g:2369:2: ']'
            {
             before(grammarAccess.getFeatureTypeTypeAccess().getRightSquareBracketKeyword_1_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getFeatureTypeTypeAccess().getRightSquareBracketKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureTypeType__Group_1__2__Impl"


    // $ANTLR start "rule__FeatureType__Group__0"
    // InternalUlmDsl2.g:2379:1: rule__FeatureType__Group__0 : rule__FeatureType__Group__0__Impl rule__FeatureType__Group__1 ;
    public final void rule__FeatureType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2383:1: ( rule__FeatureType__Group__0__Impl rule__FeatureType__Group__1 )
            // InternalUlmDsl2.g:2384:2: rule__FeatureType__Group__0__Impl rule__FeatureType__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__FeatureType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureType__Group__0"


    // $ANTLR start "rule__FeatureType__Group__0__Impl"
    // InternalUlmDsl2.g:2391:1: rule__FeatureType__Group__0__Impl : ( 'feature' ) ;
    public final void rule__FeatureType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2395:1: ( ( 'feature' ) )
            // InternalUlmDsl2.g:2396:1: ( 'feature' )
            {
            // InternalUlmDsl2.g:2396:1: ( 'feature' )
            // InternalUlmDsl2.g:2397:2: 'feature'
            {
             before(grammarAccess.getFeatureTypeAccess().getFeatureKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getFeatureTypeAccess().getFeatureKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureType__Group__0__Impl"


    // $ANTLR start "rule__FeatureType__Group__1"
    // InternalUlmDsl2.g:2406:1: rule__FeatureType__Group__1 : rule__FeatureType__Group__1__Impl ;
    public final void rule__FeatureType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2410:1: ( rule__FeatureType__Group__1__Impl )
            // InternalUlmDsl2.g:2411:2: rule__FeatureType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureType__Group__1"


    // $ANTLR start "rule__FeatureType__Group__1__Impl"
    // InternalUlmDsl2.g:2417:1: rule__FeatureType__Group__1__Impl : ( ( rule__FeatureType__TAssignment_1 ) ) ;
    public final void rule__FeatureType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2421:1: ( ( ( rule__FeatureType__TAssignment_1 ) ) )
            // InternalUlmDsl2.g:2422:1: ( ( rule__FeatureType__TAssignment_1 ) )
            {
            // InternalUlmDsl2.g:2422:1: ( ( rule__FeatureType__TAssignment_1 ) )
            // InternalUlmDsl2.g:2423:2: ( rule__FeatureType__TAssignment_1 )
            {
             before(grammarAccess.getFeatureTypeAccess().getTAssignment_1()); 
            // InternalUlmDsl2.g:2424:2: ( rule__FeatureType__TAssignment_1 )
            // InternalUlmDsl2.g:2424:3: rule__FeatureType__TAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FeatureType__TAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureTypeAccess().getTAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureType__Group__1__Impl"


    // $ANTLR start "rule__AttributeFeatureType__Group__0"
    // InternalUlmDsl2.g:2433:1: rule__AttributeFeatureType__Group__0 : rule__AttributeFeatureType__Group__0__Impl rule__AttributeFeatureType__Group__1 ;
    public final void rule__AttributeFeatureType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2437:1: ( rule__AttributeFeatureType__Group__0__Impl rule__AttributeFeatureType__Group__1 )
            // InternalUlmDsl2.g:2438:2: rule__AttributeFeatureType__Group__0__Impl rule__AttributeFeatureType__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__AttributeFeatureType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeFeatureType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeFeatureType__Group__0"


    // $ANTLR start "rule__AttributeFeatureType__Group__0__Impl"
    // InternalUlmDsl2.g:2445:1: rule__AttributeFeatureType__Group__0__Impl : ( 'attribute' ) ;
    public final void rule__AttributeFeatureType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2449:1: ( ( 'attribute' ) )
            // InternalUlmDsl2.g:2450:1: ( 'attribute' )
            {
            // InternalUlmDsl2.g:2450:1: ( 'attribute' )
            // InternalUlmDsl2.g:2451:2: 'attribute'
            {
             before(grammarAccess.getAttributeFeatureTypeAccess().getAttributeKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getAttributeFeatureTypeAccess().getAttributeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeFeatureType__Group__0__Impl"


    // $ANTLR start "rule__AttributeFeatureType__Group__1"
    // InternalUlmDsl2.g:2460:1: rule__AttributeFeatureType__Group__1 : rule__AttributeFeatureType__Group__1__Impl ;
    public final void rule__AttributeFeatureType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2464:1: ( rule__AttributeFeatureType__Group__1__Impl )
            // InternalUlmDsl2.g:2465:2: rule__AttributeFeatureType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeFeatureType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeFeatureType__Group__1"


    // $ANTLR start "rule__AttributeFeatureType__Group__1__Impl"
    // InternalUlmDsl2.g:2471:1: rule__AttributeFeatureType__Group__1__Impl : ( ( rule__AttributeFeatureType__AttributeTypeAssignment_1 ) ) ;
    public final void rule__AttributeFeatureType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2475:1: ( ( ( rule__AttributeFeatureType__AttributeTypeAssignment_1 ) ) )
            // InternalUlmDsl2.g:2476:1: ( ( rule__AttributeFeatureType__AttributeTypeAssignment_1 ) )
            {
            // InternalUlmDsl2.g:2476:1: ( ( rule__AttributeFeatureType__AttributeTypeAssignment_1 ) )
            // InternalUlmDsl2.g:2477:2: ( rule__AttributeFeatureType__AttributeTypeAssignment_1 )
            {
             before(grammarAccess.getAttributeFeatureTypeAccess().getAttributeTypeAssignment_1()); 
            // InternalUlmDsl2.g:2478:2: ( rule__AttributeFeatureType__AttributeTypeAssignment_1 )
            // InternalUlmDsl2.g:2478:3: rule__AttributeFeatureType__AttributeTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AttributeFeatureType__AttributeTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeFeatureTypeAccess().getAttributeTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeFeatureType__Group__1__Impl"


    // $ANTLR start "rule__EntityFeatureType__Group__0"
    // InternalUlmDsl2.g:2487:1: rule__EntityFeatureType__Group__0 : rule__EntityFeatureType__Group__0__Impl rule__EntityFeatureType__Group__1 ;
    public final void rule__EntityFeatureType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2491:1: ( rule__EntityFeatureType__Group__0__Impl rule__EntityFeatureType__Group__1 )
            // InternalUlmDsl2.g:2492:2: rule__EntityFeatureType__Group__0__Impl rule__EntityFeatureType__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__EntityFeatureType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntityFeatureType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityFeatureType__Group__0"


    // $ANTLR start "rule__EntityFeatureType__Group__0__Impl"
    // InternalUlmDsl2.g:2499:1: rule__EntityFeatureType__Group__0__Impl : ( 'entity' ) ;
    public final void rule__EntityFeatureType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2503:1: ( ( 'entity' ) )
            // InternalUlmDsl2.g:2504:1: ( 'entity' )
            {
            // InternalUlmDsl2.g:2504:1: ( 'entity' )
            // InternalUlmDsl2.g:2505:2: 'entity'
            {
             before(grammarAccess.getEntityFeatureTypeAccess().getEntityKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getEntityFeatureTypeAccess().getEntityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityFeatureType__Group__0__Impl"


    // $ANTLR start "rule__EntityFeatureType__Group__1"
    // InternalUlmDsl2.g:2514:1: rule__EntityFeatureType__Group__1 : rule__EntityFeatureType__Group__1__Impl ;
    public final void rule__EntityFeatureType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2518:1: ( rule__EntityFeatureType__Group__1__Impl )
            // InternalUlmDsl2.g:2519:2: rule__EntityFeatureType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EntityFeatureType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityFeatureType__Group__1"


    // $ANTLR start "rule__EntityFeatureType__Group__1__Impl"
    // InternalUlmDsl2.g:2525:1: rule__EntityFeatureType__Group__1__Impl : ( ( rule__EntityFeatureType__EntityTypeAssignment_1 ) ) ;
    public final void rule__EntityFeatureType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2529:1: ( ( ( rule__EntityFeatureType__EntityTypeAssignment_1 ) ) )
            // InternalUlmDsl2.g:2530:1: ( ( rule__EntityFeatureType__EntityTypeAssignment_1 ) )
            {
            // InternalUlmDsl2.g:2530:1: ( ( rule__EntityFeatureType__EntityTypeAssignment_1 ) )
            // InternalUlmDsl2.g:2531:2: ( rule__EntityFeatureType__EntityTypeAssignment_1 )
            {
             before(grammarAccess.getEntityFeatureTypeAccess().getEntityTypeAssignment_1()); 
            // InternalUlmDsl2.g:2532:2: ( rule__EntityFeatureType__EntityTypeAssignment_1 )
            // InternalUlmDsl2.g:2532:3: rule__EntityFeatureType__EntityTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EntityFeatureType__EntityTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityFeatureTypeAccess().getEntityTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityFeatureType__Group__1__Impl"


    // $ANTLR start "rule__Lookup__Group__0"
    // InternalUlmDsl2.g:2541:1: rule__Lookup__Group__0 : rule__Lookup__Group__0__Impl rule__Lookup__Group__1 ;
    public final void rule__Lookup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2545:1: ( rule__Lookup__Group__0__Impl rule__Lookup__Group__1 )
            // InternalUlmDsl2.g:2546:2: rule__Lookup__Group__0__Impl rule__Lookup__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__Lookup__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lookup__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lookup__Group__0"


    // $ANTLR start "rule__Lookup__Group__0__Impl"
    // InternalUlmDsl2.g:2553:1: rule__Lookup__Group__0__Impl : ( 'lookup' ) ;
    public final void rule__Lookup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2557:1: ( ( 'lookup' ) )
            // InternalUlmDsl2.g:2558:1: ( 'lookup' )
            {
            // InternalUlmDsl2.g:2558:1: ( 'lookup' )
            // InternalUlmDsl2.g:2559:2: 'lookup'
            {
             before(grammarAccess.getLookupAccess().getLookupKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getLookupAccess().getLookupKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lookup__Group__0__Impl"


    // $ANTLR start "rule__Lookup__Group__1"
    // InternalUlmDsl2.g:2568:1: rule__Lookup__Group__1 : rule__Lookup__Group__1__Impl ;
    public final void rule__Lookup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2572:1: ( rule__Lookup__Group__1__Impl )
            // InternalUlmDsl2.g:2573:2: rule__Lookup__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Lookup__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lookup__Group__1"


    // $ANTLR start "rule__Lookup__Group__1__Impl"
    // InternalUlmDsl2.g:2579:1: rule__Lookup__Group__1__Impl : ( ( rule__Lookup__Alternatives_1 ) ) ;
    public final void rule__Lookup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2583:1: ( ( ( rule__Lookup__Alternatives_1 ) ) )
            // InternalUlmDsl2.g:2584:1: ( ( rule__Lookup__Alternatives_1 ) )
            {
            // InternalUlmDsl2.g:2584:1: ( ( rule__Lookup__Alternatives_1 ) )
            // InternalUlmDsl2.g:2585:2: ( rule__Lookup__Alternatives_1 )
            {
             before(grammarAccess.getLookupAccess().getAlternatives_1()); 
            // InternalUlmDsl2.g:2586:2: ( rule__Lookup__Alternatives_1 )
            // InternalUlmDsl2.g:2586:3: rule__Lookup__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Lookup__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getLookupAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lookup__Group__1__Impl"


    // $ANTLR start "rule__LookupInt__Group__0"
    // InternalUlmDsl2.g:2595:1: rule__LookupInt__Group__0 : rule__LookupInt__Group__0__Impl rule__LookupInt__Group__1 ;
    public final void rule__LookupInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2599:1: ( rule__LookupInt__Group__0__Impl rule__LookupInt__Group__1 )
            // InternalUlmDsl2.g:2600:2: rule__LookupInt__Group__0__Impl rule__LookupInt__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__LookupInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LookupInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupInt__Group__0"


    // $ANTLR start "rule__LookupInt__Group__0__Impl"
    // InternalUlmDsl2.g:2607:1: rule__LookupInt__Group__0__Impl : ( 'integer' ) ;
    public final void rule__LookupInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2611:1: ( ( 'integer' ) )
            // InternalUlmDsl2.g:2612:1: ( 'integer' )
            {
            // InternalUlmDsl2.g:2612:1: ( 'integer' )
            // InternalUlmDsl2.g:2613:2: 'integer'
            {
             before(grammarAccess.getLookupIntAccess().getIntegerKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getLookupIntAccess().getIntegerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupInt__Group__0__Impl"


    // $ANTLR start "rule__LookupInt__Group__1"
    // InternalUlmDsl2.g:2622:1: rule__LookupInt__Group__1 : rule__LookupInt__Group__1__Impl rule__LookupInt__Group__2 ;
    public final void rule__LookupInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2626:1: ( rule__LookupInt__Group__1__Impl rule__LookupInt__Group__2 )
            // InternalUlmDsl2.g:2627:2: rule__LookupInt__Group__1__Impl rule__LookupInt__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__LookupInt__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LookupInt__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupInt__Group__1"


    // $ANTLR start "rule__LookupInt__Group__1__Impl"
    // InternalUlmDsl2.g:2634:1: rule__LookupInt__Group__1__Impl : ( ( rule__LookupInt__NameAssignment_1 ) ) ;
    public final void rule__LookupInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2638:1: ( ( ( rule__LookupInt__NameAssignment_1 ) ) )
            // InternalUlmDsl2.g:2639:1: ( ( rule__LookupInt__NameAssignment_1 ) )
            {
            // InternalUlmDsl2.g:2639:1: ( ( rule__LookupInt__NameAssignment_1 ) )
            // InternalUlmDsl2.g:2640:2: ( rule__LookupInt__NameAssignment_1 )
            {
             before(grammarAccess.getLookupIntAccess().getNameAssignment_1()); 
            // InternalUlmDsl2.g:2641:2: ( rule__LookupInt__NameAssignment_1 )
            // InternalUlmDsl2.g:2641:3: rule__LookupInt__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LookupInt__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLookupIntAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupInt__Group__1__Impl"


    // $ANTLR start "rule__LookupInt__Group__2"
    // InternalUlmDsl2.g:2649:1: rule__LookupInt__Group__2 : rule__LookupInt__Group__2__Impl rule__LookupInt__Group__3 ;
    public final void rule__LookupInt__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2653:1: ( rule__LookupInt__Group__2__Impl rule__LookupInt__Group__3 )
            // InternalUlmDsl2.g:2654:2: rule__LookupInt__Group__2__Impl rule__LookupInt__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__LookupInt__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LookupInt__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupInt__Group__2"


    // $ANTLR start "rule__LookupInt__Group__2__Impl"
    // InternalUlmDsl2.g:2661:1: rule__LookupInt__Group__2__Impl : ( ( rule__LookupInt__DescriptionAssignment_2 )? ) ;
    public final void rule__LookupInt__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2665:1: ( ( ( rule__LookupInt__DescriptionAssignment_2 )? ) )
            // InternalUlmDsl2.g:2666:1: ( ( rule__LookupInt__DescriptionAssignment_2 )? )
            {
            // InternalUlmDsl2.g:2666:1: ( ( rule__LookupInt__DescriptionAssignment_2 )? )
            // InternalUlmDsl2.g:2667:2: ( rule__LookupInt__DescriptionAssignment_2 )?
            {
             before(grammarAccess.getLookupIntAccess().getDescriptionAssignment_2()); 
            // InternalUlmDsl2.g:2668:2: ( rule__LookupInt__DescriptionAssignment_2 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_STRING) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalUlmDsl2.g:2668:3: rule__LookupInt__DescriptionAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__LookupInt__DescriptionAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLookupIntAccess().getDescriptionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupInt__Group__2__Impl"


    // $ANTLR start "rule__LookupInt__Group__3"
    // InternalUlmDsl2.g:2676:1: rule__LookupInt__Group__3 : rule__LookupInt__Group__3__Impl rule__LookupInt__Group__4 ;
    public final void rule__LookupInt__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2680:1: ( rule__LookupInt__Group__3__Impl rule__LookupInt__Group__4 )
            // InternalUlmDsl2.g:2681:2: rule__LookupInt__Group__3__Impl rule__LookupInt__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__LookupInt__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LookupInt__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupInt__Group__3"


    // $ANTLR start "rule__LookupInt__Group__3__Impl"
    // InternalUlmDsl2.g:2688:1: rule__LookupInt__Group__3__Impl : ( 'values' ) ;
    public final void rule__LookupInt__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2692:1: ( ( 'values' ) )
            // InternalUlmDsl2.g:2693:1: ( 'values' )
            {
            // InternalUlmDsl2.g:2693:1: ( 'values' )
            // InternalUlmDsl2.g:2694:2: 'values'
            {
             before(grammarAccess.getLookupIntAccess().getValuesKeyword_3()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getLookupIntAccess().getValuesKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupInt__Group__3__Impl"


    // $ANTLR start "rule__LookupInt__Group__4"
    // InternalUlmDsl2.g:2703:1: rule__LookupInt__Group__4 : rule__LookupInt__Group__4__Impl rule__LookupInt__Group__5 ;
    public final void rule__LookupInt__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2707:1: ( rule__LookupInt__Group__4__Impl rule__LookupInt__Group__5 )
            // InternalUlmDsl2.g:2708:2: rule__LookupInt__Group__4__Impl rule__LookupInt__Group__5
            {
            pushFollow(FOLLOW_29);
            rule__LookupInt__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LookupInt__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupInt__Group__4"


    // $ANTLR start "rule__LookupInt__Group__4__Impl"
    // InternalUlmDsl2.g:2715:1: rule__LookupInt__Group__4__Impl : ( '{' ) ;
    public final void rule__LookupInt__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2719:1: ( ( '{' ) )
            // InternalUlmDsl2.g:2720:1: ( '{' )
            {
            // InternalUlmDsl2.g:2720:1: ( '{' )
            // InternalUlmDsl2.g:2721:2: '{'
            {
             before(grammarAccess.getLookupIntAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getLookupIntAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupInt__Group__4__Impl"


    // $ANTLR start "rule__LookupInt__Group__5"
    // InternalUlmDsl2.g:2730:1: rule__LookupInt__Group__5 : rule__LookupInt__Group__5__Impl rule__LookupInt__Group__6 ;
    public final void rule__LookupInt__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2734:1: ( rule__LookupInt__Group__5__Impl rule__LookupInt__Group__6 )
            // InternalUlmDsl2.g:2735:2: rule__LookupInt__Group__5__Impl rule__LookupInt__Group__6
            {
            pushFollow(FOLLOW_30);
            rule__LookupInt__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LookupInt__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupInt__Group__5"


    // $ANTLR start "rule__LookupInt__Group__5__Impl"
    // InternalUlmDsl2.g:2742:1: rule__LookupInt__Group__5__Impl : ( ( rule__LookupInt__ValuesAssignment_5 ) ) ;
    public final void rule__LookupInt__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2746:1: ( ( ( rule__LookupInt__ValuesAssignment_5 ) ) )
            // InternalUlmDsl2.g:2747:1: ( ( rule__LookupInt__ValuesAssignment_5 ) )
            {
            // InternalUlmDsl2.g:2747:1: ( ( rule__LookupInt__ValuesAssignment_5 ) )
            // InternalUlmDsl2.g:2748:2: ( rule__LookupInt__ValuesAssignment_5 )
            {
             before(grammarAccess.getLookupIntAccess().getValuesAssignment_5()); 
            // InternalUlmDsl2.g:2749:2: ( rule__LookupInt__ValuesAssignment_5 )
            // InternalUlmDsl2.g:2749:3: rule__LookupInt__ValuesAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__LookupInt__ValuesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getLookupIntAccess().getValuesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupInt__Group__5__Impl"


    // $ANTLR start "rule__LookupInt__Group__6"
    // InternalUlmDsl2.g:2757:1: rule__LookupInt__Group__6 : rule__LookupInt__Group__6__Impl rule__LookupInt__Group__7 ;
    public final void rule__LookupInt__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2761:1: ( rule__LookupInt__Group__6__Impl rule__LookupInt__Group__7 )
            // InternalUlmDsl2.g:2762:2: rule__LookupInt__Group__6__Impl rule__LookupInt__Group__7
            {
            pushFollow(FOLLOW_30);
            rule__LookupInt__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LookupInt__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupInt__Group__6"


    // $ANTLR start "rule__LookupInt__Group__6__Impl"
    // InternalUlmDsl2.g:2769:1: rule__LookupInt__Group__6__Impl : ( ( rule__LookupInt__Group_6__0 )* ) ;
    public final void rule__LookupInt__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2773:1: ( ( ( rule__LookupInt__Group_6__0 )* ) )
            // InternalUlmDsl2.g:2774:1: ( ( rule__LookupInt__Group_6__0 )* )
            {
            // InternalUlmDsl2.g:2774:1: ( ( rule__LookupInt__Group_6__0 )* )
            // InternalUlmDsl2.g:2775:2: ( rule__LookupInt__Group_6__0 )*
            {
             before(grammarAccess.getLookupIntAccess().getGroup_6()); 
            // InternalUlmDsl2.g:2776:2: ( rule__LookupInt__Group_6__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==39) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalUlmDsl2.g:2776:3: rule__LookupInt__Group_6__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__LookupInt__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getLookupIntAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupInt__Group__6__Impl"


    // $ANTLR start "rule__LookupInt__Group__7"
    // InternalUlmDsl2.g:2784:1: rule__LookupInt__Group__7 : rule__LookupInt__Group__7__Impl rule__LookupInt__Group__8 ;
    public final void rule__LookupInt__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2788:1: ( rule__LookupInt__Group__7__Impl rule__LookupInt__Group__8 )
            // InternalUlmDsl2.g:2789:2: rule__LookupInt__Group__7__Impl rule__LookupInt__Group__8
            {
            pushFollow(FOLLOW_32);
            rule__LookupInt__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LookupInt__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupInt__Group__7"


    // $ANTLR start "rule__LookupInt__Group__7__Impl"
    // InternalUlmDsl2.g:2796:1: rule__LookupInt__Group__7__Impl : ( '}' ) ;
    public final void rule__LookupInt__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2800:1: ( ( '}' ) )
            // InternalUlmDsl2.g:2801:1: ( '}' )
            {
            // InternalUlmDsl2.g:2801:1: ( '}' )
            // InternalUlmDsl2.g:2802:2: '}'
            {
             before(grammarAccess.getLookupIntAccess().getRightCurlyBracketKeyword_7()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getLookupIntAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupInt__Group__7__Impl"


    // $ANTLR start "rule__LookupInt__Group__8"
    // InternalUlmDsl2.g:2811:1: rule__LookupInt__Group__8 : rule__LookupInt__Group__8__Impl ;
    public final void rule__LookupInt__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2815:1: ( rule__LookupInt__Group__8__Impl )
            // InternalUlmDsl2.g:2816:2: rule__LookupInt__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LookupInt__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupInt__Group__8"


    // $ANTLR start "rule__LookupInt__Group__8__Impl"
    // InternalUlmDsl2.g:2822:1: rule__LookupInt__Group__8__Impl : ( ';' ) ;
    public final void rule__LookupInt__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2826:1: ( ( ';' ) )
            // InternalUlmDsl2.g:2827:1: ( ';' )
            {
            // InternalUlmDsl2.g:2827:1: ( ';' )
            // InternalUlmDsl2.g:2828:2: ';'
            {
             before(grammarAccess.getLookupIntAccess().getSemicolonKeyword_8()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getLookupIntAccess().getSemicolonKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupInt__Group__8__Impl"


    // $ANTLR start "rule__LookupInt__Group_6__0"
    // InternalUlmDsl2.g:2838:1: rule__LookupInt__Group_6__0 : rule__LookupInt__Group_6__0__Impl rule__LookupInt__Group_6__1 ;
    public final void rule__LookupInt__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2842:1: ( rule__LookupInt__Group_6__0__Impl rule__LookupInt__Group_6__1 )
            // InternalUlmDsl2.g:2843:2: rule__LookupInt__Group_6__0__Impl rule__LookupInt__Group_6__1
            {
            pushFollow(FOLLOW_29);
            rule__LookupInt__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LookupInt__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupInt__Group_6__0"


    // $ANTLR start "rule__LookupInt__Group_6__0__Impl"
    // InternalUlmDsl2.g:2850:1: rule__LookupInt__Group_6__0__Impl : ( ',' ) ;
    public final void rule__LookupInt__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2854:1: ( ( ',' ) )
            // InternalUlmDsl2.g:2855:1: ( ',' )
            {
            // InternalUlmDsl2.g:2855:1: ( ',' )
            // InternalUlmDsl2.g:2856:2: ','
            {
             before(grammarAccess.getLookupIntAccess().getCommaKeyword_6_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getLookupIntAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupInt__Group_6__0__Impl"


    // $ANTLR start "rule__LookupInt__Group_6__1"
    // InternalUlmDsl2.g:2865:1: rule__LookupInt__Group_6__1 : rule__LookupInt__Group_6__1__Impl ;
    public final void rule__LookupInt__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2869:1: ( rule__LookupInt__Group_6__1__Impl )
            // InternalUlmDsl2.g:2870:2: rule__LookupInt__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LookupInt__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupInt__Group_6__1"


    // $ANTLR start "rule__LookupInt__Group_6__1__Impl"
    // InternalUlmDsl2.g:2876:1: rule__LookupInt__Group_6__1__Impl : ( ( rule__LookupInt__ValuesAssignment_6_1 ) ) ;
    public final void rule__LookupInt__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2880:1: ( ( ( rule__LookupInt__ValuesAssignment_6_1 ) ) )
            // InternalUlmDsl2.g:2881:1: ( ( rule__LookupInt__ValuesAssignment_6_1 ) )
            {
            // InternalUlmDsl2.g:2881:1: ( ( rule__LookupInt__ValuesAssignment_6_1 ) )
            // InternalUlmDsl2.g:2882:2: ( rule__LookupInt__ValuesAssignment_6_1 )
            {
             before(grammarAccess.getLookupIntAccess().getValuesAssignment_6_1()); 
            // InternalUlmDsl2.g:2883:2: ( rule__LookupInt__ValuesAssignment_6_1 )
            // InternalUlmDsl2.g:2883:3: rule__LookupInt__ValuesAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__LookupInt__ValuesAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getLookupIntAccess().getValuesAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupInt__Group_6__1__Impl"


    // $ANTLR start "rule__LookupString__Group__0"
    // InternalUlmDsl2.g:2892:1: rule__LookupString__Group__0 : rule__LookupString__Group__0__Impl rule__LookupString__Group__1 ;
    public final void rule__LookupString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2896:1: ( rule__LookupString__Group__0__Impl rule__LookupString__Group__1 )
            // InternalUlmDsl2.g:2897:2: rule__LookupString__Group__0__Impl rule__LookupString__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__LookupString__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LookupString__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupString__Group__0"


    // $ANTLR start "rule__LookupString__Group__0__Impl"
    // InternalUlmDsl2.g:2904:1: rule__LookupString__Group__0__Impl : ( 'string' ) ;
    public final void rule__LookupString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2908:1: ( ( 'string' ) )
            // InternalUlmDsl2.g:2909:1: ( 'string' )
            {
            // InternalUlmDsl2.g:2909:1: ( 'string' )
            // InternalUlmDsl2.g:2910:2: 'string'
            {
             before(grammarAccess.getLookupStringAccess().getStringKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getLookupStringAccess().getStringKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupString__Group__0__Impl"


    // $ANTLR start "rule__LookupString__Group__1"
    // InternalUlmDsl2.g:2919:1: rule__LookupString__Group__1 : rule__LookupString__Group__1__Impl rule__LookupString__Group__2 ;
    public final void rule__LookupString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2923:1: ( rule__LookupString__Group__1__Impl rule__LookupString__Group__2 )
            // InternalUlmDsl2.g:2924:2: rule__LookupString__Group__1__Impl rule__LookupString__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__LookupString__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LookupString__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupString__Group__1"


    // $ANTLR start "rule__LookupString__Group__1__Impl"
    // InternalUlmDsl2.g:2931:1: rule__LookupString__Group__1__Impl : ( ( rule__LookupString__NameAssignment_1 ) ) ;
    public final void rule__LookupString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2935:1: ( ( ( rule__LookupString__NameAssignment_1 ) ) )
            // InternalUlmDsl2.g:2936:1: ( ( rule__LookupString__NameAssignment_1 ) )
            {
            // InternalUlmDsl2.g:2936:1: ( ( rule__LookupString__NameAssignment_1 ) )
            // InternalUlmDsl2.g:2937:2: ( rule__LookupString__NameAssignment_1 )
            {
             before(grammarAccess.getLookupStringAccess().getNameAssignment_1()); 
            // InternalUlmDsl2.g:2938:2: ( rule__LookupString__NameAssignment_1 )
            // InternalUlmDsl2.g:2938:3: rule__LookupString__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LookupString__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLookupStringAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupString__Group__1__Impl"


    // $ANTLR start "rule__LookupString__Group__2"
    // InternalUlmDsl2.g:2946:1: rule__LookupString__Group__2 : rule__LookupString__Group__2__Impl rule__LookupString__Group__3 ;
    public final void rule__LookupString__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2950:1: ( rule__LookupString__Group__2__Impl rule__LookupString__Group__3 )
            // InternalUlmDsl2.g:2951:2: rule__LookupString__Group__2__Impl rule__LookupString__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__LookupString__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LookupString__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupString__Group__2"


    // $ANTLR start "rule__LookupString__Group__2__Impl"
    // InternalUlmDsl2.g:2958:1: rule__LookupString__Group__2__Impl : ( ( rule__LookupString__DescriptionAssignment_2 )? ) ;
    public final void rule__LookupString__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2962:1: ( ( ( rule__LookupString__DescriptionAssignment_2 )? ) )
            // InternalUlmDsl2.g:2963:1: ( ( rule__LookupString__DescriptionAssignment_2 )? )
            {
            // InternalUlmDsl2.g:2963:1: ( ( rule__LookupString__DescriptionAssignment_2 )? )
            // InternalUlmDsl2.g:2964:2: ( rule__LookupString__DescriptionAssignment_2 )?
            {
             before(grammarAccess.getLookupStringAccess().getDescriptionAssignment_2()); 
            // InternalUlmDsl2.g:2965:2: ( rule__LookupString__DescriptionAssignment_2 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_STRING) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalUlmDsl2.g:2965:3: rule__LookupString__DescriptionAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__LookupString__DescriptionAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLookupStringAccess().getDescriptionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupString__Group__2__Impl"


    // $ANTLR start "rule__LookupString__Group__3"
    // InternalUlmDsl2.g:2973:1: rule__LookupString__Group__3 : rule__LookupString__Group__3__Impl rule__LookupString__Group__4 ;
    public final void rule__LookupString__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2977:1: ( rule__LookupString__Group__3__Impl rule__LookupString__Group__4 )
            // InternalUlmDsl2.g:2978:2: rule__LookupString__Group__3__Impl rule__LookupString__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__LookupString__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LookupString__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupString__Group__3"


    // $ANTLR start "rule__LookupString__Group__3__Impl"
    // InternalUlmDsl2.g:2985:1: rule__LookupString__Group__3__Impl : ( 'values' ) ;
    public final void rule__LookupString__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2989:1: ( ( 'values' ) )
            // InternalUlmDsl2.g:2990:1: ( 'values' )
            {
            // InternalUlmDsl2.g:2990:1: ( 'values' )
            // InternalUlmDsl2.g:2991:2: 'values'
            {
             before(grammarAccess.getLookupStringAccess().getValuesKeyword_3()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getLookupStringAccess().getValuesKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupString__Group__3__Impl"


    // $ANTLR start "rule__LookupString__Group__4"
    // InternalUlmDsl2.g:3000:1: rule__LookupString__Group__4 : rule__LookupString__Group__4__Impl rule__LookupString__Group__5 ;
    public final void rule__LookupString__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3004:1: ( rule__LookupString__Group__4__Impl rule__LookupString__Group__5 )
            // InternalUlmDsl2.g:3005:2: rule__LookupString__Group__4__Impl rule__LookupString__Group__5
            {
            pushFollow(FOLLOW_29);
            rule__LookupString__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LookupString__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupString__Group__4"


    // $ANTLR start "rule__LookupString__Group__4__Impl"
    // InternalUlmDsl2.g:3012:1: rule__LookupString__Group__4__Impl : ( '{' ) ;
    public final void rule__LookupString__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3016:1: ( ( '{' ) )
            // InternalUlmDsl2.g:3017:1: ( '{' )
            {
            // InternalUlmDsl2.g:3017:1: ( '{' )
            // InternalUlmDsl2.g:3018:2: '{'
            {
             before(grammarAccess.getLookupStringAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getLookupStringAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupString__Group__4__Impl"


    // $ANTLR start "rule__LookupString__Group__5"
    // InternalUlmDsl2.g:3027:1: rule__LookupString__Group__5 : rule__LookupString__Group__5__Impl rule__LookupString__Group__6 ;
    public final void rule__LookupString__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3031:1: ( rule__LookupString__Group__5__Impl rule__LookupString__Group__6 )
            // InternalUlmDsl2.g:3032:2: rule__LookupString__Group__5__Impl rule__LookupString__Group__6
            {
            pushFollow(FOLLOW_30);
            rule__LookupString__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LookupString__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupString__Group__5"


    // $ANTLR start "rule__LookupString__Group__5__Impl"
    // InternalUlmDsl2.g:3039:1: rule__LookupString__Group__5__Impl : ( ( rule__LookupString__ValuesAssignment_5 ) ) ;
    public final void rule__LookupString__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3043:1: ( ( ( rule__LookupString__ValuesAssignment_5 ) ) )
            // InternalUlmDsl2.g:3044:1: ( ( rule__LookupString__ValuesAssignment_5 ) )
            {
            // InternalUlmDsl2.g:3044:1: ( ( rule__LookupString__ValuesAssignment_5 ) )
            // InternalUlmDsl2.g:3045:2: ( rule__LookupString__ValuesAssignment_5 )
            {
             before(grammarAccess.getLookupStringAccess().getValuesAssignment_5()); 
            // InternalUlmDsl2.g:3046:2: ( rule__LookupString__ValuesAssignment_5 )
            // InternalUlmDsl2.g:3046:3: rule__LookupString__ValuesAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__LookupString__ValuesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getLookupStringAccess().getValuesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupString__Group__5__Impl"


    // $ANTLR start "rule__LookupString__Group__6"
    // InternalUlmDsl2.g:3054:1: rule__LookupString__Group__6 : rule__LookupString__Group__6__Impl rule__LookupString__Group__7 ;
    public final void rule__LookupString__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3058:1: ( rule__LookupString__Group__6__Impl rule__LookupString__Group__7 )
            // InternalUlmDsl2.g:3059:2: rule__LookupString__Group__6__Impl rule__LookupString__Group__7
            {
            pushFollow(FOLLOW_30);
            rule__LookupString__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LookupString__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupString__Group__6"


    // $ANTLR start "rule__LookupString__Group__6__Impl"
    // InternalUlmDsl2.g:3066:1: rule__LookupString__Group__6__Impl : ( ( rule__LookupString__Group_6__0 )* ) ;
    public final void rule__LookupString__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3070:1: ( ( ( rule__LookupString__Group_6__0 )* ) )
            // InternalUlmDsl2.g:3071:1: ( ( rule__LookupString__Group_6__0 )* )
            {
            // InternalUlmDsl2.g:3071:1: ( ( rule__LookupString__Group_6__0 )* )
            // InternalUlmDsl2.g:3072:2: ( rule__LookupString__Group_6__0 )*
            {
             before(grammarAccess.getLookupStringAccess().getGroup_6()); 
            // InternalUlmDsl2.g:3073:2: ( rule__LookupString__Group_6__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==39) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalUlmDsl2.g:3073:3: rule__LookupString__Group_6__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__LookupString__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getLookupStringAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupString__Group__6__Impl"


    // $ANTLR start "rule__LookupString__Group__7"
    // InternalUlmDsl2.g:3081:1: rule__LookupString__Group__7 : rule__LookupString__Group__7__Impl rule__LookupString__Group__8 ;
    public final void rule__LookupString__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3085:1: ( rule__LookupString__Group__7__Impl rule__LookupString__Group__8 )
            // InternalUlmDsl2.g:3086:2: rule__LookupString__Group__7__Impl rule__LookupString__Group__8
            {
            pushFollow(FOLLOW_32);
            rule__LookupString__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LookupString__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupString__Group__7"


    // $ANTLR start "rule__LookupString__Group__7__Impl"
    // InternalUlmDsl2.g:3093:1: rule__LookupString__Group__7__Impl : ( '}' ) ;
    public final void rule__LookupString__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3097:1: ( ( '}' ) )
            // InternalUlmDsl2.g:3098:1: ( '}' )
            {
            // InternalUlmDsl2.g:3098:1: ( '}' )
            // InternalUlmDsl2.g:3099:2: '}'
            {
             before(grammarAccess.getLookupStringAccess().getRightCurlyBracketKeyword_7()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getLookupStringAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupString__Group__7__Impl"


    // $ANTLR start "rule__LookupString__Group__8"
    // InternalUlmDsl2.g:3108:1: rule__LookupString__Group__8 : rule__LookupString__Group__8__Impl ;
    public final void rule__LookupString__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3112:1: ( rule__LookupString__Group__8__Impl )
            // InternalUlmDsl2.g:3113:2: rule__LookupString__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LookupString__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupString__Group__8"


    // $ANTLR start "rule__LookupString__Group__8__Impl"
    // InternalUlmDsl2.g:3119:1: rule__LookupString__Group__8__Impl : ( ';' ) ;
    public final void rule__LookupString__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3123:1: ( ( ';' ) )
            // InternalUlmDsl2.g:3124:1: ( ';' )
            {
            // InternalUlmDsl2.g:3124:1: ( ';' )
            // InternalUlmDsl2.g:3125:2: ';'
            {
             before(grammarAccess.getLookupStringAccess().getSemicolonKeyword_8()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getLookupStringAccess().getSemicolonKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupString__Group__8__Impl"


    // $ANTLR start "rule__LookupString__Group_6__0"
    // InternalUlmDsl2.g:3135:1: rule__LookupString__Group_6__0 : rule__LookupString__Group_6__0__Impl rule__LookupString__Group_6__1 ;
    public final void rule__LookupString__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3139:1: ( rule__LookupString__Group_6__0__Impl rule__LookupString__Group_6__1 )
            // InternalUlmDsl2.g:3140:2: rule__LookupString__Group_6__0__Impl rule__LookupString__Group_6__1
            {
            pushFollow(FOLLOW_29);
            rule__LookupString__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LookupString__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupString__Group_6__0"


    // $ANTLR start "rule__LookupString__Group_6__0__Impl"
    // InternalUlmDsl2.g:3147:1: rule__LookupString__Group_6__0__Impl : ( ',' ) ;
    public final void rule__LookupString__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3151:1: ( ( ',' ) )
            // InternalUlmDsl2.g:3152:1: ( ',' )
            {
            // InternalUlmDsl2.g:3152:1: ( ',' )
            // InternalUlmDsl2.g:3153:2: ','
            {
             before(grammarAccess.getLookupStringAccess().getCommaKeyword_6_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getLookupStringAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupString__Group_6__0__Impl"


    // $ANTLR start "rule__LookupString__Group_6__1"
    // InternalUlmDsl2.g:3162:1: rule__LookupString__Group_6__1 : rule__LookupString__Group_6__1__Impl ;
    public final void rule__LookupString__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3166:1: ( rule__LookupString__Group_6__1__Impl )
            // InternalUlmDsl2.g:3167:2: rule__LookupString__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LookupString__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupString__Group_6__1"


    // $ANTLR start "rule__LookupString__Group_6__1__Impl"
    // InternalUlmDsl2.g:3173:1: rule__LookupString__Group_6__1__Impl : ( ( rule__LookupString__ValuesAssignment_6_1 ) ) ;
    public final void rule__LookupString__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3177:1: ( ( ( rule__LookupString__ValuesAssignment_6_1 ) ) )
            // InternalUlmDsl2.g:3178:1: ( ( rule__LookupString__ValuesAssignment_6_1 ) )
            {
            // InternalUlmDsl2.g:3178:1: ( ( rule__LookupString__ValuesAssignment_6_1 ) )
            // InternalUlmDsl2.g:3179:2: ( rule__LookupString__ValuesAssignment_6_1 )
            {
             before(grammarAccess.getLookupStringAccess().getValuesAssignment_6_1()); 
            // InternalUlmDsl2.g:3180:2: ( rule__LookupString__ValuesAssignment_6_1 )
            // InternalUlmDsl2.g:3180:3: rule__LookupString__ValuesAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__LookupString__ValuesAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getLookupStringAccess().getValuesAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupString__Group_6__1__Impl"


    // $ANTLR start "rule__LookupIntValue__Group__0"
    // InternalUlmDsl2.g:3189:1: rule__LookupIntValue__Group__0 : rule__LookupIntValue__Group__0__Impl rule__LookupIntValue__Group__1 ;
    public final void rule__LookupIntValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3193:1: ( rule__LookupIntValue__Group__0__Impl rule__LookupIntValue__Group__1 )
            // InternalUlmDsl2.g:3194:2: rule__LookupIntValue__Group__0__Impl rule__LookupIntValue__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__LookupIntValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LookupIntValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupIntValue__Group__0"


    // $ANTLR start "rule__LookupIntValue__Group__0__Impl"
    // InternalUlmDsl2.g:3201:1: rule__LookupIntValue__Group__0__Impl : ( () ) ;
    public final void rule__LookupIntValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3205:1: ( ( () ) )
            // InternalUlmDsl2.g:3206:1: ( () )
            {
            // InternalUlmDsl2.g:3206:1: ( () )
            // InternalUlmDsl2.g:3207:2: ()
            {
             before(grammarAccess.getLookupIntValueAccess().getLookupIntValueAction_0()); 
            // InternalUlmDsl2.g:3208:2: ()
            // InternalUlmDsl2.g:3208:3: 
            {
            }

             after(grammarAccess.getLookupIntValueAccess().getLookupIntValueAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupIntValue__Group__0__Impl"


    // $ANTLR start "rule__LookupIntValue__Group__1"
    // InternalUlmDsl2.g:3216:1: rule__LookupIntValue__Group__1 : rule__LookupIntValue__Group__1__Impl rule__LookupIntValue__Group__2 ;
    public final void rule__LookupIntValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3220:1: ( rule__LookupIntValue__Group__1__Impl rule__LookupIntValue__Group__2 )
            // InternalUlmDsl2.g:3221:2: rule__LookupIntValue__Group__1__Impl rule__LookupIntValue__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__LookupIntValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LookupIntValue__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupIntValue__Group__1"


    // $ANTLR start "rule__LookupIntValue__Group__1__Impl"
    // InternalUlmDsl2.g:3228:1: rule__LookupIntValue__Group__1__Impl : ( '(' ) ;
    public final void rule__LookupIntValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3232:1: ( ( '(' ) )
            // InternalUlmDsl2.g:3233:1: ( '(' )
            {
            // InternalUlmDsl2.g:3233:1: ( '(' )
            // InternalUlmDsl2.g:3234:2: '('
            {
             before(grammarAccess.getLookupIntValueAccess().getLeftParenthesisKeyword_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getLookupIntValueAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupIntValue__Group__1__Impl"


    // $ANTLR start "rule__LookupIntValue__Group__2"
    // InternalUlmDsl2.g:3243:1: rule__LookupIntValue__Group__2 : rule__LookupIntValue__Group__2__Impl rule__LookupIntValue__Group__3 ;
    public final void rule__LookupIntValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3247:1: ( rule__LookupIntValue__Group__2__Impl rule__LookupIntValue__Group__3 )
            // InternalUlmDsl2.g:3248:2: rule__LookupIntValue__Group__2__Impl rule__LookupIntValue__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__LookupIntValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LookupIntValue__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupIntValue__Group__2"


    // $ANTLR start "rule__LookupIntValue__Group__2__Impl"
    // InternalUlmDsl2.g:3255:1: rule__LookupIntValue__Group__2__Impl : ( ( rule__LookupIntValue__ValueAssignment_2 ) ) ;
    public final void rule__LookupIntValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3259:1: ( ( ( rule__LookupIntValue__ValueAssignment_2 ) ) )
            // InternalUlmDsl2.g:3260:1: ( ( rule__LookupIntValue__ValueAssignment_2 ) )
            {
            // InternalUlmDsl2.g:3260:1: ( ( rule__LookupIntValue__ValueAssignment_2 ) )
            // InternalUlmDsl2.g:3261:2: ( rule__LookupIntValue__ValueAssignment_2 )
            {
             before(grammarAccess.getLookupIntValueAccess().getValueAssignment_2()); 
            // InternalUlmDsl2.g:3262:2: ( rule__LookupIntValue__ValueAssignment_2 )
            // InternalUlmDsl2.g:3262:3: rule__LookupIntValue__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LookupIntValue__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLookupIntValueAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupIntValue__Group__2__Impl"


    // $ANTLR start "rule__LookupIntValue__Group__3"
    // InternalUlmDsl2.g:3270:1: rule__LookupIntValue__Group__3 : rule__LookupIntValue__Group__3__Impl rule__LookupIntValue__Group__4 ;
    public final void rule__LookupIntValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3274:1: ( rule__LookupIntValue__Group__3__Impl rule__LookupIntValue__Group__4 )
            // InternalUlmDsl2.g:3275:2: rule__LookupIntValue__Group__3__Impl rule__LookupIntValue__Group__4
            {
            pushFollow(FOLLOW_34);
            rule__LookupIntValue__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LookupIntValue__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupIntValue__Group__3"


    // $ANTLR start "rule__LookupIntValue__Group__3__Impl"
    // InternalUlmDsl2.g:3282:1: rule__LookupIntValue__Group__3__Impl : ( ( rule__LookupIntValue__DescriptionAssignment_3 ) ) ;
    public final void rule__LookupIntValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3286:1: ( ( ( rule__LookupIntValue__DescriptionAssignment_3 ) ) )
            // InternalUlmDsl2.g:3287:1: ( ( rule__LookupIntValue__DescriptionAssignment_3 ) )
            {
            // InternalUlmDsl2.g:3287:1: ( ( rule__LookupIntValue__DescriptionAssignment_3 ) )
            // InternalUlmDsl2.g:3288:2: ( rule__LookupIntValue__DescriptionAssignment_3 )
            {
             before(grammarAccess.getLookupIntValueAccess().getDescriptionAssignment_3()); 
            // InternalUlmDsl2.g:3289:2: ( rule__LookupIntValue__DescriptionAssignment_3 )
            // InternalUlmDsl2.g:3289:3: rule__LookupIntValue__DescriptionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__LookupIntValue__DescriptionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLookupIntValueAccess().getDescriptionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupIntValue__Group__3__Impl"


    // $ANTLR start "rule__LookupIntValue__Group__4"
    // InternalUlmDsl2.g:3297:1: rule__LookupIntValue__Group__4 : rule__LookupIntValue__Group__4__Impl ;
    public final void rule__LookupIntValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3301:1: ( rule__LookupIntValue__Group__4__Impl )
            // InternalUlmDsl2.g:3302:2: rule__LookupIntValue__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LookupIntValue__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupIntValue__Group__4"


    // $ANTLR start "rule__LookupIntValue__Group__4__Impl"
    // InternalUlmDsl2.g:3308:1: rule__LookupIntValue__Group__4__Impl : ( ')' ) ;
    public final void rule__LookupIntValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3312:1: ( ( ')' ) )
            // InternalUlmDsl2.g:3313:1: ( ')' )
            {
            // InternalUlmDsl2.g:3313:1: ( ')' )
            // InternalUlmDsl2.g:3314:2: ')'
            {
             before(grammarAccess.getLookupIntValueAccess().getRightParenthesisKeyword_4()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getLookupIntValueAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupIntValue__Group__4__Impl"


    // $ANTLR start "rule__LookupStringValue__Group__0"
    // InternalUlmDsl2.g:3324:1: rule__LookupStringValue__Group__0 : rule__LookupStringValue__Group__0__Impl rule__LookupStringValue__Group__1 ;
    public final void rule__LookupStringValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3328:1: ( rule__LookupStringValue__Group__0__Impl rule__LookupStringValue__Group__1 )
            // InternalUlmDsl2.g:3329:2: rule__LookupStringValue__Group__0__Impl rule__LookupStringValue__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__LookupStringValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LookupStringValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupStringValue__Group__0"


    // $ANTLR start "rule__LookupStringValue__Group__0__Impl"
    // InternalUlmDsl2.g:3336:1: rule__LookupStringValue__Group__0__Impl : ( () ) ;
    public final void rule__LookupStringValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3340:1: ( ( () ) )
            // InternalUlmDsl2.g:3341:1: ( () )
            {
            // InternalUlmDsl2.g:3341:1: ( () )
            // InternalUlmDsl2.g:3342:2: ()
            {
             before(grammarAccess.getLookupStringValueAccess().getLookupStringValueAction_0()); 
            // InternalUlmDsl2.g:3343:2: ()
            // InternalUlmDsl2.g:3343:3: 
            {
            }

             after(grammarAccess.getLookupStringValueAccess().getLookupStringValueAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupStringValue__Group__0__Impl"


    // $ANTLR start "rule__LookupStringValue__Group__1"
    // InternalUlmDsl2.g:3351:1: rule__LookupStringValue__Group__1 : rule__LookupStringValue__Group__1__Impl rule__LookupStringValue__Group__2 ;
    public final void rule__LookupStringValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3355:1: ( rule__LookupStringValue__Group__1__Impl rule__LookupStringValue__Group__2 )
            // InternalUlmDsl2.g:3356:2: rule__LookupStringValue__Group__1__Impl rule__LookupStringValue__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__LookupStringValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LookupStringValue__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupStringValue__Group__1"


    // $ANTLR start "rule__LookupStringValue__Group__1__Impl"
    // InternalUlmDsl2.g:3363:1: rule__LookupStringValue__Group__1__Impl : ( '(' ) ;
    public final void rule__LookupStringValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3367:1: ( ( '(' ) )
            // InternalUlmDsl2.g:3368:1: ( '(' )
            {
            // InternalUlmDsl2.g:3368:1: ( '(' )
            // InternalUlmDsl2.g:3369:2: '('
            {
             before(grammarAccess.getLookupStringValueAccess().getLeftParenthesisKeyword_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getLookupStringValueAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupStringValue__Group__1__Impl"


    // $ANTLR start "rule__LookupStringValue__Group__2"
    // InternalUlmDsl2.g:3378:1: rule__LookupStringValue__Group__2 : rule__LookupStringValue__Group__2__Impl rule__LookupStringValue__Group__3 ;
    public final void rule__LookupStringValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3382:1: ( rule__LookupStringValue__Group__2__Impl rule__LookupStringValue__Group__3 )
            // InternalUlmDsl2.g:3383:2: rule__LookupStringValue__Group__2__Impl rule__LookupStringValue__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__LookupStringValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LookupStringValue__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupStringValue__Group__2"


    // $ANTLR start "rule__LookupStringValue__Group__2__Impl"
    // InternalUlmDsl2.g:3390:1: rule__LookupStringValue__Group__2__Impl : ( ( rule__LookupStringValue__ValueAssignment_2 ) ) ;
    public final void rule__LookupStringValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3394:1: ( ( ( rule__LookupStringValue__ValueAssignment_2 ) ) )
            // InternalUlmDsl2.g:3395:1: ( ( rule__LookupStringValue__ValueAssignment_2 ) )
            {
            // InternalUlmDsl2.g:3395:1: ( ( rule__LookupStringValue__ValueAssignment_2 ) )
            // InternalUlmDsl2.g:3396:2: ( rule__LookupStringValue__ValueAssignment_2 )
            {
             before(grammarAccess.getLookupStringValueAccess().getValueAssignment_2()); 
            // InternalUlmDsl2.g:3397:2: ( rule__LookupStringValue__ValueAssignment_2 )
            // InternalUlmDsl2.g:3397:3: rule__LookupStringValue__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LookupStringValue__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLookupStringValueAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupStringValue__Group__2__Impl"


    // $ANTLR start "rule__LookupStringValue__Group__3"
    // InternalUlmDsl2.g:3405:1: rule__LookupStringValue__Group__3 : rule__LookupStringValue__Group__3__Impl rule__LookupStringValue__Group__4 ;
    public final void rule__LookupStringValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3409:1: ( rule__LookupStringValue__Group__3__Impl rule__LookupStringValue__Group__4 )
            // InternalUlmDsl2.g:3410:2: rule__LookupStringValue__Group__3__Impl rule__LookupStringValue__Group__4
            {
            pushFollow(FOLLOW_34);
            rule__LookupStringValue__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LookupStringValue__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupStringValue__Group__3"


    // $ANTLR start "rule__LookupStringValue__Group__3__Impl"
    // InternalUlmDsl2.g:3417:1: rule__LookupStringValue__Group__3__Impl : ( ( rule__LookupStringValue__DescriptionAssignment_3 ) ) ;
    public final void rule__LookupStringValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3421:1: ( ( ( rule__LookupStringValue__DescriptionAssignment_3 ) ) )
            // InternalUlmDsl2.g:3422:1: ( ( rule__LookupStringValue__DescriptionAssignment_3 ) )
            {
            // InternalUlmDsl2.g:3422:1: ( ( rule__LookupStringValue__DescriptionAssignment_3 ) )
            // InternalUlmDsl2.g:3423:2: ( rule__LookupStringValue__DescriptionAssignment_3 )
            {
             before(grammarAccess.getLookupStringValueAccess().getDescriptionAssignment_3()); 
            // InternalUlmDsl2.g:3424:2: ( rule__LookupStringValue__DescriptionAssignment_3 )
            // InternalUlmDsl2.g:3424:3: rule__LookupStringValue__DescriptionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__LookupStringValue__DescriptionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLookupStringValueAccess().getDescriptionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupStringValue__Group__3__Impl"


    // $ANTLR start "rule__LookupStringValue__Group__4"
    // InternalUlmDsl2.g:3432:1: rule__LookupStringValue__Group__4 : rule__LookupStringValue__Group__4__Impl ;
    public final void rule__LookupStringValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3436:1: ( rule__LookupStringValue__Group__4__Impl )
            // InternalUlmDsl2.g:3437:2: rule__LookupStringValue__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LookupStringValue__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupStringValue__Group__4"


    // $ANTLR start "rule__LookupStringValue__Group__4__Impl"
    // InternalUlmDsl2.g:3443:1: rule__LookupStringValue__Group__4__Impl : ( ')' ) ;
    public final void rule__LookupStringValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3447:1: ( ( ')' ) )
            // InternalUlmDsl2.g:3448:1: ( ')' )
            {
            // InternalUlmDsl2.g:3448:1: ( ')' )
            // InternalUlmDsl2.g:3449:2: ')'
            {
             before(grammarAccess.getLookupStringValueAccess().getRightParenthesisKeyword_4()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getLookupStringValueAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupStringValue__Group__4__Impl"


    // $ANTLR start "rule__Model__NameAssignment_1"
    // InternalUlmDsl2.g:3459:1: rule__Model__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3463:1: ( ( RULE_ID ) )
            // InternalUlmDsl2.g:3464:2: ( RULE_ID )
            {
            // InternalUlmDsl2.g:3464:2: ( RULE_ID )
            // InternalUlmDsl2.g:3465:3: RULE_ID
            {
             before(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__NameAssignment_1"


    // $ANTLR start "rule__Model__ContextsAssignment_3"
    // InternalUlmDsl2.g:3474:1: rule__Model__ContextsAssignment_3 : ( ruleContext ) ;
    public final void rule__Model__ContextsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3478:1: ( ( ruleContext ) )
            // InternalUlmDsl2.g:3479:2: ( ruleContext )
            {
            // InternalUlmDsl2.g:3479:2: ( ruleContext )
            // InternalUlmDsl2.g:3480:3: ruleContext
            {
             before(grammarAccess.getModelAccess().getContextsContextParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleContext();

            state._fsp--;

             after(grammarAccess.getModelAccess().getContextsContextParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ContextsAssignment_3"


    // $ANTLR start "rule__Context__NameAssignment_1"
    // InternalUlmDsl2.g:3489:1: rule__Context__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Context__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3493:1: ( ( RULE_ID ) )
            // InternalUlmDsl2.g:3494:2: ( RULE_ID )
            {
            // InternalUlmDsl2.g:3494:2: ( RULE_ID )
            // InternalUlmDsl2.g:3495:3: RULE_ID
            {
             before(grammarAccess.getContextAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getContextAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__NameAssignment_1"


    // $ANTLR start "rule__Context__VersionAssignment_2"
    // InternalUlmDsl2.g:3504:1: rule__Context__VersionAssignment_2 : ( ruleVersion ) ;
    public final void rule__Context__VersionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3508:1: ( ( ruleVersion ) )
            // InternalUlmDsl2.g:3509:2: ( ruleVersion )
            {
            // InternalUlmDsl2.g:3509:2: ( ruleVersion )
            // InternalUlmDsl2.g:3510:3: ruleVersion
            {
             before(grammarAccess.getContextAccess().getVersionVersionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleVersion();

            state._fsp--;

             after(grammarAccess.getContextAccess().getVersionVersionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__VersionAssignment_2"


    // $ANTLR start "rule__Context__AttributesAssignment_4_2"
    // InternalUlmDsl2.g:3519:1: rule__Context__AttributesAssignment_4_2 : ( ruleAttribute ) ;
    public final void rule__Context__AttributesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3523:1: ( ( ruleAttribute ) )
            // InternalUlmDsl2.g:3524:2: ( ruleAttribute )
            {
            // InternalUlmDsl2.g:3524:2: ( ruleAttribute )
            // InternalUlmDsl2.g:3525:3: ruleAttribute
            {
             before(grammarAccess.getContextAccess().getAttributesAttributeParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getContextAccess().getAttributesAttributeParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__AttributesAssignment_4_2"


    // $ANTLR start "rule__Context__LookupsAssignment_5_2"
    // InternalUlmDsl2.g:3534:1: rule__Context__LookupsAssignment_5_2 : ( ruleLookup ) ;
    public final void rule__Context__LookupsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3538:1: ( ( ruleLookup ) )
            // InternalUlmDsl2.g:3539:2: ( ruleLookup )
            {
            // InternalUlmDsl2.g:3539:2: ( ruleLookup )
            // InternalUlmDsl2.g:3540:3: ruleLookup
            {
             before(grammarAccess.getContextAccess().getLookupsLookupParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLookup();

            state._fsp--;

             after(grammarAccess.getContextAccess().getLookupsLookupParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__LookupsAssignment_5_2"


    // $ANTLR start "rule__Context__EntitiesAssignment_6_2"
    // InternalUlmDsl2.g:3549:1: rule__Context__EntitiesAssignment_6_2 : ( ruleEntity ) ;
    public final void rule__Context__EntitiesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3553:1: ( ( ruleEntity ) )
            // InternalUlmDsl2.g:3554:2: ( ruleEntity )
            {
            // InternalUlmDsl2.g:3554:2: ( ruleEntity )
            // InternalUlmDsl2.g:3555:3: ruleEntity
            {
             before(grammarAccess.getContextAccess().getEntitiesEntityParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getContextAccess().getEntitiesEntityParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__EntitiesAssignment_6_2"


    // $ANTLR start "rule__Attribute__TypeAssignment_1"
    // InternalUlmDsl2.g:3564:1: rule__Attribute__TypeAssignment_1 : ( ruleAttributeType ) ;
    public final void rule__Attribute__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3568:1: ( ( ruleAttributeType ) )
            // InternalUlmDsl2.g:3569:2: ( ruleAttributeType )
            {
            // InternalUlmDsl2.g:3569:2: ( ruleAttributeType )
            // InternalUlmDsl2.g:3570:3: ruleAttributeType
            {
             before(grammarAccess.getAttributeAccess().getTypeAttributeTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeType();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getTypeAttributeTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__TypeAssignment_1"


    // $ANTLR start "rule__Attribute__NameAssignment_2"
    // InternalUlmDsl2.g:3579:1: rule__Attribute__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3583:1: ( ( RULE_ID ) )
            // InternalUlmDsl2.g:3584:2: ( RULE_ID )
            {
            // InternalUlmDsl2.g:3584:2: ( RULE_ID )
            // InternalUlmDsl2.g:3585:3: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_2"


    // $ANTLR start "rule__Attribute__DescAssignment_3"
    // InternalUlmDsl2.g:3594:1: rule__Attribute__DescAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Attribute__DescAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3598:1: ( ( RULE_STRING ) )
            // InternalUlmDsl2.g:3599:2: ( RULE_STRING )
            {
            // InternalUlmDsl2.g:3599:2: ( RULE_STRING )
            // InternalUlmDsl2.g:3600:3: RULE_STRING
            {
             before(grammarAccess.getAttributeAccess().getDescSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getDescSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__DescAssignment_3"


    // $ANTLR start "rule__AttributeType__TypeAssignment_0"
    // InternalUlmDsl2.g:3609:1: rule__AttributeType__TypeAssignment_0 : ( ruleBasicType ) ;
    public final void rule__AttributeType__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3613:1: ( ( ruleBasicType ) )
            // InternalUlmDsl2.g:3614:2: ( ruleBasicType )
            {
            // InternalUlmDsl2.g:3614:2: ( ruleBasicType )
            // InternalUlmDsl2.g:3615:3: ruleBasicType
            {
             before(grammarAccess.getAttributeTypeAccess().getTypeBasicTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBasicType();

            state._fsp--;

             after(grammarAccess.getAttributeTypeAccess().getTypeBasicTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__TypeAssignment_0"


    // $ANTLR start "rule__AttributeType__ArrayAssignment_1_0"
    // InternalUlmDsl2.g:3624:1: rule__AttributeType__ArrayAssignment_1_0 : ( ( '[' ) ) ;
    public final void rule__AttributeType__ArrayAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3628:1: ( ( ( '[' ) ) )
            // InternalUlmDsl2.g:3629:2: ( ( '[' ) )
            {
            // InternalUlmDsl2.g:3629:2: ( ( '[' ) )
            // InternalUlmDsl2.g:3630:3: ( '[' )
            {
             before(grammarAccess.getAttributeTypeAccess().getArrayLeftSquareBracketKeyword_1_0_0()); 
            // InternalUlmDsl2.g:3631:3: ( '[' )
            // InternalUlmDsl2.g:3632:4: '['
            {
             before(grammarAccess.getAttributeTypeAccess().getArrayLeftSquareBracketKeyword_1_0_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getAttributeTypeAccess().getArrayLeftSquareBracketKeyword_1_0_0()); 

            }

             after(grammarAccess.getAttributeTypeAccess().getArrayLeftSquareBracketKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__ArrayAssignment_1_0"


    // $ANTLR start "rule__AttributeType__LengthAssignment_1_1"
    // InternalUlmDsl2.g:3643:1: rule__AttributeType__LengthAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__AttributeType__LengthAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3647:1: ( ( RULE_INT ) )
            // InternalUlmDsl2.g:3648:2: ( RULE_INT )
            {
            // InternalUlmDsl2.g:3648:2: ( RULE_INT )
            // InternalUlmDsl2.g:3649:3: RULE_INT
            {
             before(grammarAccess.getAttributeTypeAccess().getLengthINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAttributeTypeAccess().getLengthINTTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__LengthAssignment_1_1"


    // $ANTLR start "rule__BasicType__TypeNameAssignment"
    // InternalUlmDsl2.g:3658:1: rule__BasicType__TypeNameAssignment : ( ( rule__BasicType__TypeNameAlternatives_0 ) ) ;
    public final void rule__BasicType__TypeNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3662:1: ( ( ( rule__BasicType__TypeNameAlternatives_0 ) ) )
            // InternalUlmDsl2.g:3663:2: ( ( rule__BasicType__TypeNameAlternatives_0 ) )
            {
            // InternalUlmDsl2.g:3663:2: ( ( rule__BasicType__TypeNameAlternatives_0 ) )
            // InternalUlmDsl2.g:3664:3: ( rule__BasicType__TypeNameAlternatives_0 )
            {
             before(grammarAccess.getBasicTypeAccess().getTypeNameAlternatives_0()); 
            // InternalUlmDsl2.g:3665:3: ( rule__BasicType__TypeNameAlternatives_0 )
            // InternalUlmDsl2.g:3665:4: rule__BasicType__TypeNameAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__BasicType__TypeNameAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getBasicTypeAccess().getTypeNameAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicType__TypeNameAssignment"


    // $ANTLR start "rule__Entity__TypeAssignment_0"
    // InternalUlmDsl2.g:3673:1: rule__Entity__TypeAssignment_0 : ( ( rule__Entity__TypeAlternatives_0_0 ) ) ;
    public final void rule__Entity__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3677:1: ( ( ( rule__Entity__TypeAlternatives_0_0 ) ) )
            // InternalUlmDsl2.g:3678:2: ( ( rule__Entity__TypeAlternatives_0_0 ) )
            {
            // InternalUlmDsl2.g:3678:2: ( ( rule__Entity__TypeAlternatives_0_0 ) )
            // InternalUlmDsl2.g:3679:3: ( rule__Entity__TypeAlternatives_0_0 )
            {
             before(grammarAccess.getEntityAccess().getTypeAlternatives_0_0()); 
            // InternalUlmDsl2.g:3680:3: ( rule__Entity__TypeAlternatives_0_0 )
            // InternalUlmDsl2.g:3680:4: rule__Entity__TypeAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__TypeAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getTypeAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__TypeAssignment_0"


    // $ANTLR start "rule__Entity__NameAssignment_2"
    // InternalUlmDsl2.g:3688:1: rule__Entity__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3692:1: ( ( RULE_ID ) )
            // InternalUlmDsl2.g:3693:2: ( RULE_ID )
            {
            // InternalUlmDsl2.g:3693:2: ( RULE_ID )
            // InternalUlmDsl2.g:3694:3: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__NameAssignment_2"


    // $ANTLR start "rule__Entity__DescAssignment_3"
    // InternalUlmDsl2.g:3703:1: rule__Entity__DescAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Entity__DescAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3707:1: ( ( RULE_STRING ) )
            // InternalUlmDsl2.g:3708:2: ( RULE_STRING )
            {
            // InternalUlmDsl2.g:3708:2: ( RULE_STRING )
            // InternalUlmDsl2.g:3709:3: RULE_STRING
            {
             before(grammarAccess.getEntityAccess().getDescSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getDescSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__DescAssignment_3"


    // $ANTLR start "rule__Entity__SuperTypeAssignment_4_1"
    // InternalUlmDsl2.g:3718:1: rule__Entity__SuperTypeAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__SuperTypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3722:1: ( ( ( RULE_ID ) ) )
            // InternalUlmDsl2.g:3723:2: ( ( RULE_ID ) )
            {
            // InternalUlmDsl2.g:3723:2: ( ( RULE_ID ) )
            // InternalUlmDsl2.g:3724:3: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_4_1_0()); 
            // InternalUlmDsl2.g:3725:3: ( RULE_ID )
            // InternalUlmDsl2.g:3726:4: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getSuperTypeEntityIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__SuperTypeAssignment_4_1"


    // $ANTLR start "rule__Entity__FeaturesAssignment_6_2"
    // InternalUlmDsl2.g:3737:1: rule__Entity__FeaturesAssignment_6_2 : ( ruleFeature ) ;
    public final void rule__Entity__FeaturesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3741:1: ( ( ruleFeature ) )
            // InternalUlmDsl2.g:3742:2: ( ruleFeature )
            {
            // InternalUlmDsl2.g:3742:2: ( ruleFeature )
            // InternalUlmDsl2.g:3743:3: ruleFeature
            {
             before(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__FeaturesAssignment_6_2"


    // $ANTLR start "rule__Feature__FeatureTypeAssignment_0"
    // InternalUlmDsl2.g:3752:1: rule__Feature__FeatureTypeAssignment_0 : ( ruleFeatureTypeType ) ;
    public final void rule__Feature__FeatureTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3756:1: ( ( ruleFeatureTypeType ) )
            // InternalUlmDsl2.g:3757:2: ( ruleFeatureTypeType )
            {
            // InternalUlmDsl2.g:3757:2: ( ruleFeatureTypeType )
            // InternalUlmDsl2.g:3758:3: ruleFeatureTypeType
            {
             before(grammarAccess.getFeatureAccess().getFeatureTypeFeatureTypeTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFeatureTypeType();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getFeatureTypeFeatureTypeTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__FeatureTypeAssignment_0"


    // $ANTLR start "rule__Feature__MandatoryAssignment_1"
    // InternalUlmDsl2.g:3767:1: rule__Feature__MandatoryAssignment_1 : ( ( 'mandatory' ) ) ;
    public final void rule__Feature__MandatoryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3771:1: ( ( ( 'mandatory' ) ) )
            // InternalUlmDsl2.g:3772:2: ( ( 'mandatory' ) )
            {
            // InternalUlmDsl2.g:3772:2: ( ( 'mandatory' ) )
            // InternalUlmDsl2.g:3773:3: ( 'mandatory' )
            {
             before(grammarAccess.getFeatureAccess().getMandatoryMandatoryKeyword_1_0()); 
            // InternalUlmDsl2.g:3774:3: ( 'mandatory' )
            // InternalUlmDsl2.g:3775:4: 'mandatory'
            {
             before(grammarAccess.getFeatureAccess().getMandatoryMandatoryKeyword_1_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getMandatoryMandatoryKeyword_1_0()); 

            }

             after(grammarAccess.getFeatureAccess().getMandatoryMandatoryKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__MandatoryAssignment_1"


    // $ANTLR start "rule__Feature__IdentifierAssignment_2"
    // InternalUlmDsl2.g:3786:1: rule__Feature__IdentifierAssignment_2 : ( ( 'identifier' ) ) ;
    public final void rule__Feature__IdentifierAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3790:1: ( ( ( 'identifier' ) ) )
            // InternalUlmDsl2.g:3791:2: ( ( 'identifier' ) )
            {
            // InternalUlmDsl2.g:3791:2: ( ( 'identifier' ) )
            // InternalUlmDsl2.g:3792:3: ( 'identifier' )
            {
             before(grammarAccess.getFeatureAccess().getIdentifierIdentifierKeyword_2_0()); 
            // InternalUlmDsl2.g:3793:3: ( 'identifier' )
            // InternalUlmDsl2.g:3794:4: 'identifier'
            {
             before(grammarAccess.getFeatureAccess().getIdentifierIdentifierKeyword_2_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getIdentifierIdentifierKeyword_2_0()); 

            }

             after(grammarAccess.getFeatureAccess().getIdentifierIdentifierKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__IdentifierAssignment_2"


    // $ANTLR start "rule__Feature__AliasAssignment_3_1"
    // InternalUlmDsl2.g:3805:1: rule__Feature__AliasAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__Feature__AliasAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3809:1: ( ( RULE_ID ) )
            // InternalUlmDsl2.g:3810:2: ( RULE_ID )
            {
            // InternalUlmDsl2.g:3810:2: ( RULE_ID )
            // InternalUlmDsl2.g:3811:3: RULE_ID
            {
             before(grammarAccess.getFeatureAccess().getAliasIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getAliasIDTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__AliasAssignment_3_1"


    // $ANTLR start "rule__FeatureTypeType__TypeAssignment_0"
    // InternalUlmDsl2.g:3820:1: rule__FeatureTypeType__TypeAssignment_0 : ( ruleFeatureType ) ;
    public final void rule__FeatureTypeType__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3824:1: ( ( ruleFeatureType ) )
            // InternalUlmDsl2.g:3825:2: ( ruleFeatureType )
            {
            // InternalUlmDsl2.g:3825:2: ( ruleFeatureType )
            // InternalUlmDsl2.g:3826:3: ruleFeatureType
            {
             before(grammarAccess.getFeatureTypeTypeAccess().getTypeFeatureTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFeatureType();

            state._fsp--;

             after(grammarAccess.getFeatureTypeTypeAccess().getTypeFeatureTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureTypeType__TypeAssignment_0"


    // $ANTLR start "rule__FeatureTypeType__ArrayAssignment_1_0"
    // InternalUlmDsl2.g:3835:1: rule__FeatureTypeType__ArrayAssignment_1_0 : ( ( '[' ) ) ;
    public final void rule__FeatureTypeType__ArrayAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3839:1: ( ( ( '[' ) ) )
            // InternalUlmDsl2.g:3840:2: ( ( '[' ) )
            {
            // InternalUlmDsl2.g:3840:2: ( ( '[' ) )
            // InternalUlmDsl2.g:3841:3: ( '[' )
            {
             before(grammarAccess.getFeatureTypeTypeAccess().getArrayLeftSquareBracketKeyword_1_0_0()); 
            // InternalUlmDsl2.g:3842:3: ( '[' )
            // InternalUlmDsl2.g:3843:4: '['
            {
             before(grammarAccess.getFeatureTypeTypeAccess().getArrayLeftSquareBracketKeyword_1_0_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getFeatureTypeTypeAccess().getArrayLeftSquareBracketKeyword_1_0_0()); 

            }

             after(grammarAccess.getFeatureTypeTypeAccess().getArrayLeftSquareBracketKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureTypeType__ArrayAssignment_1_0"


    // $ANTLR start "rule__FeatureTypeType__LengthAssignment_1_1"
    // InternalUlmDsl2.g:3854:1: rule__FeatureTypeType__LengthAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__FeatureTypeType__LengthAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3858:1: ( ( RULE_INT ) )
            // InternalUlmDsl2.g:3859:2: ( RULE_INT )
            {
            // InternalUlmDsl2.g:3859:2: ( RULE_INT )
            // InternalUlmDsl2.g:3860:3: RULE_INT
            {
             before(grammarAccess.getFeatureTypeTypeAccess().getLengthINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFeatureTypeTypeAccess().getLengthINTTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureTypeType__LengthAssignment_1_1"


    // $ANTLR start "rule__FeatureType__TAssignment_1"
    // InternalUlmDsl2.g:3869:1: rule__FeatureType__TAssignment_1 : ( ( rule__FeatureType__TAlternatives_1_0 ) ) ;
    public final void rule__FeatureType__TAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3873:1: ( ( ( rule__FeatureType__TAlternatives_1_0 ) ) )
            // InternalUlmDsl2.g:3874:2: ( ( rule__FeatureType__TAlternatives_1_0 ) )
            {
            // InternalUlmDsl2.g:3874:2: ( ( rule__FeatureType__TAlternatives_1_0 ) )
            // InternalUlmDsl2.g:3875:3: ( rule__FeatureType__TAlternatives_1_0 )
            {
             before(grammarAccess.getFeatureTypeAccess().getTAlternatives_1_0()); 
            // InternalUlmDsl2.g:3876:3: ( rule__FeatureType__TAlternatives_1_0 )
            // InternalUlmDsl2.g:3876:4: rule__FeatureType__TAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__FeatureType__TAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureTypeAccess().getTAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureType__TAssignment_1"


    // $ANTLR start "rule__AttributeFeatureType__AttributeTypeAssignment_1"
    // InternalUlmDsl2.g:3884:1: rule__AttributeFeatureType__AttributeTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__AttributeFeatureType__AttributeTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3888:1: ( ( ( RULE_ID ) ) )
            // InternalUlmDsl2.g:3889:2: ( ( RULE_ID ) )
            {
            // InternalUlmDsl2.g:3889:2: ( ( RULE_ID ) )
            // InternalUlmDsl2.g:3890:3: ( RULE_ID )
            {
             before(grammarAccess.getAttributeFeatureTypeAccess().getAttributeTypeAttributeCrossReference_1_0()); 
            // InternalUlmDsl2.g:3891:3: ( RULE_ID )
            // InternalUlmDsl2.g:3892:4: RULE_ID
            {
             before(grammarAccess.getAttributeFeatureTypeAccess().getAttributeTypeAttributeIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeFeatureTypeAccess().getAttributeTypeAttributeIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getAttributeFeatureTypeAccess().getAttributeTypeAttributeCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeFeatureType__AttributeTypeAssignment_1"


    // $ANTLR start "rule__EntityFeatureType__EntityTypeAssignment_1"
    // InternalUlmDsl2.g:3903:1: rule__EntityFeatureType__EntityTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__EntityFeatureType__EntityTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3907:1: ( ( ( RULE_ID ) ) )
            // InternalUlmDsl2.g:3908:2: ( ( RULE_ID ) )
            {
            // InternalUlmDsl2.g:3908:2: ( ( RULE_ID ) )
            // InternalUlmDsl2.g:3909:3: ( RULE_ID )
            {
             before(grammarAccess.getEntityFeatureTypeAccess().getEntityTypeEntityCrossReference_1_0()); 
            // InternalUlmDsl2.g:3910:3: ( RULE_ID )
            // InternalUlmDsl2.g:3911:4: RULE_ID
            {
             before(grammarAccess.getEntityFeatureTypeAccess().getEntityTypeEntityIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityFeatureTypeAccess().getEntityTypeEntityIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getEntityFeatureTypeAccess().getEntityTypeEntityCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityFeatureType__EntityTypeAssignment_1"


    // $ANTLR start "rule__LookupInt__NameAssignment_1"
    // InternalUlmDsl2.g:3922:1: rule__LookupInt__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__LookupInt__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3926:1: ( ( RULE_ID ) )
            // InternalUlmDsl2.g:3927:2: ( RULE_ID )
            {
            // InternalUlmDsl2.g:3927:2: ( RULE_ID )
            // InternalUlmDsl2.g:3928:3: RULE_ID
            {
             before(grammarAccess.getLookupIntAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLookupIntAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupInt__NameAssignment_1"


    // $ANTLR start "rule__LookupInt__DescriptionAssignment_2"
    // InternalUlmDsl2.g:3937:1: rule__LookupInt__DescriptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__LookupInt__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3941:1: ( ( RULE_STRING ) )
            // InternalUlmDsl2.g:3942:2: ( RULE_STRING )
            {
            // InternalUlmDsl2.g:3942:2: ( RULE_STRING )
            // InternalUlmDsl2.g:3943:3: RULE_STRING
            {
             before(grammarAccess.getLookupIntAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLookupIntAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupInt__DescriptionAssignment_2"


    // $ANTLR start "rule__LookupInt__ValuesAssignment_5"
    // InternalUlmDsl2.g:3952:1: rule__LookupInt__ValuesAssignment_5 : ( ruleLookupIntValue ) ;
    public final void rule__LookupInt__ValuesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3956:1: ( ( ruleLookupIntValue ) )
            // InternalUlmDsl2.g:3957:2: ( ruleLookupIntValue )
            {
            // InternalUlmDsl2.g:3957:2: ( ruleLookupIntValue )
            // InternalUlmDsl2.g:3958:3: ruleLookupIntValue
            {
             before(grammarAccess.getLookupIntAccess().getValuesLookupIntValueParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleLookupIntValue();

            state._fsp--;

             after(grammarAccess.getLookupIntAccess().getValuesLookupIntValueParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupInt__ValuesAssignment_5"


    // $ANTLR start "rule__LookupInt__ValuesAssignment_6_1"
    // InternalUlmDsl2.g:3967:1: rule__LookupInt__ValuesAssignment_6_1 : ( ruleLookupIntValue ) ;
    public final void rule__LookupInt__ValuesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3971:1: ( ( ruleLookupIntValue ) )
            // InternalUlmDsl2.g:3972:2: ( ruleLookupIntValue )
            {
            // InternalUlmDsl2.g:3972:2: ( ruleLookupIntValue )
            // InternalUlmDsl2.g:3973:3: ruleLookupIntValue
            {
             before(grammarAccess.getLookupIntAccess().getValuesLookupIntValueParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLookupIntValue();

            state._fsp--;

             after(grammarAccess.getLookupIntAccess().getValuesLookupIntValueParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupInt__ValuesAssignment_6_1"


    // $ANTLR start "rule__LookupString__NameAssignment_1"
    // InternalUlmDsl2.g:3982:1: rule__LookupString__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__LookupString__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3986:1: ( ( RULE_ID ) )
            // InternalUlmDsl2.g:3987:2: ( RULE_ID )
            {
            // InternalUlmDsl2.g:3987:2: ( RULE_ID )
            // InternalUlmDsl2.g:3988:3: RULE_ID
            {
             before(grammarAccess.getLookupStringAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLookupStringAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupString__NameAssignment_1"


    // $ANTLR start "rule__LookupString__DescriptionAssignment_2"
    // InternalUlmDsl2.g:3997:1: rule__LookupString__DescriptionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__LookupString__DescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:4001:1: ( ( RULE_STRING ) )
            // InternalUlmDsl2.g:4002:2: ( RULE_STRING )
            {
            // InternalUlmDsl2.g:4002:2: ( RULE_STRING )
            // InternalUlmDsl2.g:4003:3: RULE_STRING
            {
             before(grammarAccess.getLookupStringAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLookupStringAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupString__DescriptionAssignment_2"


    // $ANTLR start "rule__LookupString__ValuesAssignment_5"
    // InternalUlmDsl2.g:4012:1: rule__LookupString__ValuesAssignment_5 : ( ruleLookupStringValue ) ;
    public final void rule__LookupString__ValuesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:4016:1: ( ( ruleLookupStringValue ) )
            // InternalUlmDsl2.g:4017:2: ( ruleLookupStringValue )
            {
            // InternalUlmDsl2.g:4017:2: ( ruleLookupStringValue )
            // InternalUlmDsl2.g:4018:3: ruleLookupStringValue
            {
             before(grammarAccess.getLookupStringAccess().getValuesLookupStringValueParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleLookupStringValue();

            state._fsp--;

             after(grammarAccess.getLookupStringAccess().getValuesLookupStringValueParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupString__ValuesAssignment_5"


    // $ANTLR start "rule__LookupString__ValuesAssignment_6_1"
    // InternalUlmDsl2.g:4027:1: rule__LookupString__ValuesAssignment_6_1 : ( ruleLookupStringValue ) ;
    public final void rule__LookupString__ValuesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:4031:1: ( ( ruleLookupStringValue ) )
            // InternalUlmDsl2.g:4032:2: ( ruleLookupStringValue )
            {
            // InternalUlmDsl2.g:4032:2: ( ruleLookupStringValue )
            // InternalUlmDsl2.g:4033:3: ruleLookupStringValue
            {
             before(grammarAccess.getLookupStringAccess().getValuesLookupStringValueParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLookupStringValue();

            state._fsp--;

             after(grammarAccess.getLookupStringAccess().getValuesLookupStringValueParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupString__ValuesAssignment_6_1"


    // $ANTLR start "rule__LookupIntValue__ValueAssignment_2"
    // InternalUlmDsl2.g:4042:1: rule__LookupIntValue__ValueAssignment_2 : ( RULE_INT ) ;
    public final void rule__LookupIntValue__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:4046:1: ( ( RULE_INT ) )
            // InternalUlmDsl2.g:4047:2: ( RULE_INT )
            {
            // InternalUlmDsl2.g:4047:2: ( RULE_INT )
            // InternalUlmDsl2.g:4048:3: RULE_INT
            {
             before(grammarAccess.getLookupIntValueAccess().getValueINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLookupIntValueAccess().getValueINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupIntValue__ValueAssignment_2"


    // $ANTLR start "rule__LookupIntValue__DescriptionAssignment_3"
    // InternalUlmDsl2.g:4057:1: rule__LookupIntValue__DescriptionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__LookupIntValue__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:4061:1: ( ( RULE_STRING ) )
            // InternalUlmDsl2.g:4062:2: ( RULE_STRING )
            {
            // InternalUlmDsl2.g:4062:2: ( RULE_STRING )
            // InternalUlmDsl2.g:4063:3: RULE_STRING
            {
             before(grammarAccess.getLookupIntValueAccess().getDescriptionSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLookupIntValueAccess().getDescriptionSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupIntValue__DescriptionAssignment_3"


    // $ANTLR start "rule__LookupStringValue__ValueAssignment_2"
    // InternalUlmDsl2.g:4072:1: rule__LookupStringValue__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__LookupStringValue__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:4076:1: ( ( RULE_STRING ) )
            // InternalUlmDsl2.g:4077:2: ( RULE_STRING )
            {
            // InternalUlmDsl2.g:4077:2: ( RULE_STRING )
            // InternalUlmDsl2.g:4078:3: RULE_STRING
            {
             before(grammarAccess.getLookupStringValueAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLookupStringValueAccess().getValueSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupStringValue__ValueAssignment_2"


    // $ANTLR start "rule__LookupStringValue__DescriptionAssignment_3"
    // InternalUlmDsl2.g:4087:1: rule__LookupStringValue__DescriptionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__LookupStringValue__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:4091:1: ( ( RULE_STRING ) )
            // InternalUlmDsl2.g:4092:2: ( RULE_STRING )
            {
            // InternalUlmDsl2.g:4092:2: ( RULE_STRING )
            // InternalUlmDsl2.g:4093:3: RULE_STRING
            {
             before(grammarAccess.getLookupStringValueAccess().getDescriptionSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLookupStringValueAccess().getDescriptionSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupStringValue__DescriptionAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000E800000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000020800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000001009C0000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000001001C0002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000000003F800L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000040000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000001001C0000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000200400040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000400800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001000800000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000180840000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000120000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000002000000800L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000004000000040L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000008000800000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000020000000000L});

}