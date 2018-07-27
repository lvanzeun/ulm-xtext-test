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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'int'", "'boolean'", "'date'", "'datetime'", "'timestamp'", "'data'", "'static'", "'lookup'", "'model'", "'{'", "'}'", "'context'", "'attributes'", "'lookups'", "'entities'", "'.'", "';'", "']'", "','", "'extends'", "'as'", "'bounded'", "'references'", "'integer'", "'values'", "'string'", "'('", "':'", "')'", "'['", "'decimal'", "'mandatory'", "'identifier'"
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
    // InternalUlmDsl2.g:162:1: ruleAttributeType : ( ( rule__AttributeType__NameAssignment ) ) ;
    public final void ruleAttributeType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:166:2: ( ( ( rule__AttributeType__NameAssignment ) ) )
            // InternalUlmDsl2.g:167:2: ( ( rule__AttributeType__NameAssignment ) )
            {
            // InternalUlmDsl2.g:167:2: ( ( rule__AttributeType__NameAssignment ) )
            // InternalUlmDsl2.g:168:3: ( rule__AttributeType__NameAssignment )
            {
             before(grammarAccess.getAttributeTypeAccess().getNameAssignment()); 
            // InternalUlmDsl2.g:169:3: ( rule__AttributeType__NameAssignment )
            // InternalUlmDsl2.g:169:4: rule__AttributeType__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__AttributeType__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getAttributeTypeAccess().getNameAssignment()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleAttributeStringType"
    // InternalUlmDsl2.g:178:1: entryRuleAttributeStringType : ruleAttributeStringType EOF ;
    public final void entryRuleAttributeStringType() throws RecognitionException {
        try {
            // InternalUlmDsl2.g:179:1: ( ruleAttributeStringType EOF )
            // InternalUlmDsl2.g:180:1: ruleAttributeStringType EOF
            {
             before(grammarAccess.getAttributeStringTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttributeStringType();

            state._fsp--;

             after(grammarAccess.getAttributeStringTypeRule()); 
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
    // $ANTLR end "entryRuleAttributeStringType"


    // $ANTLR start "ruleAttributeStringType"
    // InternalUlmDsl2.g:187:1: ruleAttributeStringType : ( ( rule__AttributeStringType__Group__0 ) ) ;
    public final void ruleAttributeStringType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:191:2: ( ( ( rule__AttributeStringType__Group__0 ) ) )
            // InternalUlmDsl2.g:192:2: ( ( rule__AttributeStringType__Group__0 ) )
            {
            // InternalUlmDsl2.g:192:2: ( ( rule__AttributeStringType__Group__0 ) )
            // InternalUlmDsl2.g:193:3: ( rule__AttributeStringType__Group__0 )
            {
             before(grammarAccess.getAttributeStringTypeAccess().getGroup()); 
            // InternalUlmDsl2.g:194:3: ( rule__AttributeStringType__Group__0 )
            // InternalUlmDsl2.g:194:4: rule__AttributeStringType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeStringType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeStringTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeStringType"


    // $ANTLR start "entryRuleAttributeDecimalType"
    // InternalUlmDsl2.g:203:1: entryRuleAttributeDecimalType : ruleAttributeDecimalType EOF ;
    public final void entryRuleAttributeDecimalType() throws RecognitionException {
        try {
            // InternalUlmDsl2.g:204:1: ( ruleAttributeDecimalType EOF )
            // InternalUlmDsl2.g:205:1: ruleAttributeDecimalType EOF
            {
             before(grammarAccess.getAttributeDecimalTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttributeDecimalType();

            state._fsp--;

             after(grammarAccess.getAttributeDecimalTypeRule()); 
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
    // $ANTLR end "entryRuleAttributeDecimalType"


    // $ANTLR start "ruleAttributeDecimalType"
    // InternalUlmDsl2.g:212:1: ruleAttributeDecimalType : ( ( rule__AttributeDecimalType__Group__0 ) ) ;
    public final void ruleAttributeDecimalType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:216:2: ( ( ( rule__AttributeDecimalType__Group__0 ) ) )
            // InternalUlmDsl2.g:217:2: ( ( rule__AttributeDecimalType__Group__0 ) )
            {
            // InternalUlmDsl2.g:217:2: ( ( rule__AttributeDecimalType__Group__0 ) )
            // InternalUlmDsl2.g:218:3: ( rule__AttributeDecimalType__Group__0 )
            {
             before(grammarAccess.getAttributeDecimalTypeAccess().getGroup()); 
            // InternalUlmDsl2.g:219:3: ( rule__AttributeDecimalType__Group__0 )
            // InternalUlmDsl2.g:219:4: rule__AttributeDecimalType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeDecimalType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeDecimalTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeDecimalType"


    // $ANTLR start "entryRuleEntity"
    // InternalUlmDsl2.g:228:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalUlmDsl2.g:229:1: ( ruleEntity EOF )
            // InternalUlmDsl2.g:230:1: ruleEntity EOF
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
    // InternalUlmDsl2.g:237:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:241:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalUlmDsl2.g:242:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalUlmDsl2.g:242:2: ( ( rule__Entity__Group__0 ) )
            // InternalUlmDsl2.g:243:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalUlmDsl2.g:244:3: ( rule__Entity__Group__0 )
            // InternalUlmDsl2.g:244:4: rule__Entity__Group__0
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
    // InternalUlmDsl2.g:253:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // InternalUlmDsl2.g:254:1: ( ruleFeature EOF )
            // InternalUlmDsl2.g:255:1: ruleFeature EOF
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
    // InternalUlmDsl2.g:262:1: ruleFeature : ( ( rule__Feature__Group__0 ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:266:2: ( ( ( rule__Feature__Group__0 ) ) )
            // InternalUlmDsl2.g:267:2: ( ( rule__Feature__Group__0 ) )
            {
            // InternalUlmDsl2.g:267:2: ( ( rule__Feature__Group__0 ) )
            // InternalUlmDsl2.g:268:3: ( rule__Feature__Group__0 )
            {
             before(grammarAccess.getFeatureAccess().getGroup()); 
            // InternalUlmDsl2.g:269:3: ( rule__Feature__Group__0 )
            // InternalUlmDsl2.g:269:4: rule__Feature__Group__0
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
    // InternalUlmDsl2.g:287:1: ruleFeatureType : ( ( rule__FeatureType__TypeAssignment ) ) ;
    public final void ruleFeatureType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:291:2: ( ( ( rule__FeatureType__TypeAssignment ) ) )
            // InternalUlmDsl2.g:292:2: ( ( rule__FeatureType__TypeAssignment ) )
            {
            // InternalUlmDsl2.g:292:2: ( ( rule__FeatureType__TypeAssignment ) )
            // InternalUlmDsl2.g:293:3: ( rule__FeatureType__TypeAssignment )
            {
             before(grammarAccess.getFeatureTypeAccess().getTypeAssignment()); 
            // InternalUlmDsl2.g:294:3: ( rule__FeatureType__TypeAssignment )
            // InternalUlmDsl2.g:294:4: rule__FeatureType__TypeAssignment
            {
            pushFollow(FOLLOW_2);
            rule__FeatureType__TypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getFeatureTypeAccess().getTypeAssignment()); 

            }


            }

        }
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


    // $ANTLR start "rule__Attribute__TypeAlternatives_1_0"
    // InternalUlmDsl2.g:477:1: rule__Attribute__TypeAlternatives_1_0 : ( ( ruleAttributeType ) | ( ruleAttributeStringType ) | ( ruleAttributeDecimalType ) );
    public final void rule__Attribute__TypeAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:481:1: ( ( ruleAttributeType ) | ( ruleAttributeStringType ) | ( ruleAttributeDecimalType ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                {
                alt1=1;
                }
                break;
            case 36:
                {
                alt1=2;
                }
                break;
            case 41:
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
                    // InternalUlmDsl2.g:482:2: ( ruleAttributeType )
                    {
                    // InternalUlmDsl2.g:482:2: ( ruleAttributeType )
                    // InternalUlmDsl2.g:483:3: ruleAttributeType
                    {
                     before(grammarAccess.getAttributeAccess().getTypeAttributeTypeParserRuleCall_1_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAttributeType();

                    state._fsp--;

                     after(grammarAccess.getAttributeAccess().getTypeAttributeTypeParserRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUlmDsl2.g:488:2: ( ruleAttributeStringType )
                    {
                    // InternalUlmDsl2.g:488:2: ( ruleAttributeStringType )
                    // InternalUlmDsl2.g:489:3: ruleAttributeStringType
                    {
                     before(grammarAccess.getAttributeAccess().getTypeAttributeStringTypeParserRuleCall_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAttributeStringType();

                    state._fsp--;

                     after(grammarAccess.getAttributeAccess().getTypeAttributeStringTypeParserRuleCall_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUlmDsl2.g:494:2: ( ruleAttributeDecimalType )
                    {
                    // InternalUlmDsl2.g:494:2: ( ruleAttributeDecimalType )
                    // InternalUlmDsl2.g:495:3: ruleAttributeDecimalType
                    {
                     before(grammarAccess.getAttributeAccess().getTypeAttributeDecimalTypeParserRuleCall_1_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleAttributeDecimalType();

                    state._fsp--;

                     after(grammarAccess.getAttributeAccess().getTypeAttributeDecimalTypeParserRuleCall_1_0_2()); 

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
    // $ANTLR end "rule__Attribute__TypeAlternatives_1_0"


    // $ANTLR start "rule__AttributeType__NameAlternatives_0"
    // InternalUlmDsl2.g:504:1: rule__AttributeType__NameAlternatives_0 : ( ( 'int' ) | ( 'boolean' ) | ( 'date' ) | ( 'datetime' ) | ( 'timestamp' ) );
    public final void rule__AttributeType__NameAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:508:1: ( ( 'int' ) | ( 'boolean' ) | ( 'date' ) | ( 'datetime' ) | ( 'timestamp' ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            case 15:
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
                    // InternalUlmDsl2.g:509:2: ( 'int' )
                    {
                    // InternalUlmDsl2.g:509:2: ( 'int' )
                    // InternalUlmDsl2.g:510:3: 'int'
                    {
                     before(grammarAccess.getAttributeTypeAccess().getNameIntKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getAttributeTypeAccess().getNameIntKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUlmDsl2.g:515:2: ( 'boolean' )
                    {
                    // InternalUlmDsl2.g:515:2: ( 'boolean' )
                    // InternalUlmDsl2.g:516:3: 'boolean'
                    {
                     before(grammarAccess.getAttributeTypeAccess().getNameBooleanKeyword_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getAttributeTypeAccess().getNameBooleanKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUlmDsl2.g:521:2: ( 'date' )
                    {
                    // InternalUlmDsl2.g:521:2: ( 'date' )
                    // InternalUlmDsl2.g:522:3: 'date'
                    {
                     before(grammarAccess.getAttributeTypeAccess().getNameDateKeyword_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getAttributeTypeAccess().getNameDateKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalUlmDsl2.g:527:2: ( 'datetime' )
                    {
                    // InternalUlmDsl2.g:527:2: ( 'datetime' )
                    // InternalUlmDsl2.g:528:3: 'datetime'
                    {
                     before(grammarAccess.getAttributeTypeAccess().getNameDatetimeKeyword_0_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getAttributeTypeAccess().getNameDatetimeKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalUlmDsl2.g:533:2: ( 'timestamp' )
                    {
                    // InternalUlmDsl2.g:533:2: ( 'timestamp' )
                    // InternalUlmDsl2.g:534:3: 'timestamp'
                    {
                     before(grammarAccess.getAttributeTypeAccess().getNameTimestampKeyword_0_4()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getAttributeTypeAccess().getNameTimestampKeyword_0_4()); 

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
    // $ANTLR end "rule__AttributeType__NameAlternatives_0"


    // $ANTLR start "rule__Entity__TypeAlternatives_0_0"
    // InternalUlmDsl2.g:543:1: rule__Entity__TypeAlternatives_0_0 : ( ( 'data' ) | ( 'static' ) | ( 'lookup' ) );
    public final void rule__Entity__TypeAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:547:1: ( ( 'data' ) | ( 'static' ) | ( 'lookup' ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt3=1;
                }
                break;
            case 17:
                {
                alt3=2;
                }
                break;
            case 18:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalUlmDsl2.g:548:2: ( 'data' )
                    {
                    // InternalUlmDsl2.g:548:2: ( 'data' )
                    // InternalUlmDsl2.g:549:3: 'data'
                    {
                     before(grammarAccess.getEntityAccess().getTypeDataKeyword_0_0_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getEntityAccess().getTypeDataKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUlmDsl2.g:554:2: ( 'static' )
                    {
                    // InternalUlmDsl2.g:554:2: ( 'static' )
                    // InternalUlmDsl2.g:555:3: 'static'
                    {
                     before(grammarAccess.getEntityAccess().getTypeStaticKeyword_0_0_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getEntityAccess().getTypeStaticKeyword_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUlmDsl2.g:560:2: ( 'lookup' )
                    {
                    // InternalUlmDsl2.g:560:2: ( 'lookup' )
                    // InternalUlmDsl2.g:561:3: 'lookup'
                    {
                     before(grammarAccess.getEntityAccess().getTypeLookupKeyword_0_0_2()); 
                    match(input,18,FOLLOW_2); 
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


    // $ANTLR start "rule__FeatureType__TypeAlternatives_0"
    // InternalUlmDsl2.g:570:1: rule__FeatureType__TypeAlternatives_0 : ( ( ruleAttributeFeatureType ) | ( ruleEntityFeatureType ) );
    public final void rule__FeatureType__TypeAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:574:1: ( ( ruleAttributeFeatureType ) | ( ruleEntityFeatureType ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==33) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalUlmDsl2.g:575:2: ( ruleAttributeFeatureType )
                    {
                    // InternalUlmDsl2.g:575:2: ( ruleAttributeFeatureType )
                    // InternalUlmDsl2.g:576:3: ruleAttributeFeatureType
                    {
                     before(grammarAccess.getFeatureTypeAccess().getTypeAttributeFeatureTypeParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAttributeFeatureType();

                    state._fsp--;

                     after(grammarAccess.getFeatureTypeAccess().getTypeAttributeFeatureTypeParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUlmDsl2.g:581:2: ( ruleEntityFeatureType )
                    {
                    // InternalUlmDsl2.g:581:2: ( ruleEntityFeatureType )
                    // InternalUlmDsl2.g:582:3: ruleEntityFeatureType
                    {
                     before(grammarAccess.getFeatureTypeAccess().getTypeEntityFeatureTypeParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEntityFeatureType();

                    state._fsp--;

                     after(grammarAccess.getFeatureTypeAccess().getTypeEntityFeatureTypeParserRuleCall_0_1()); 

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
    // $ANTLR end "rule__FeatureType__TypeAlternatives_0"


    // $ANTLR start "rule__Lookup__TypeAlternatives_1_0"
    // InternalUlmDsl2.g:591:1: rule__Lookup__TypeAlternatives_1_0 : ( ( ruleLookupInt ) | ( ruleLookupString ) );
    public final void rule__Lookup__TypeAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:595:1: ( ( ruleLookupInt ) | ( ruleLookupString ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==34) ) {
                alt5=1;
            }
            else if ( (LA5_0==36) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalUlmDsl2.g:596:2: ( ruleLookupInt )
                    {
                    // InternalUlmDsl2.g:596:2: ( ruleLookupInt )
                    // InternalUlmDsl2.g:597:3: ruleLookupInt
                    {
                     before(grammarAccess.getLookupAccess().getTypeLookupIntParserRuleCall_1_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLookupInt();

                    state._fsp--;

                     after(grammarAccess.getLookupAccess().getTypeLookupIntParserRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUlmDsl2.g:602:2: ( ruleLookupString )
                    {
                    // InternalUlmDsl2.g:602:2: ( ruleLookupString )
                    // InternalUlmDsl2.g:603:3: ruleLookupString
                    {
                     before(grammarAccess.getLookupAccess().getTypeLookupStringParserRuleCall_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLookupString();

                    state._fsp--;

                     after(grammarAccess.getLookupAccess().getTypeLookupStringParserRuleCall_1_0_1()); 

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
    // $ANTLR end "rule__Lookup__TypeAlternatives_1_0"


    // $ANTLR start "rule__Model__Group__0"
    // InternalUlmDsl2.g:612:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:616:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalUlmDsl2.g:617:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalUlmDsl2.g:624:1: rule__Model__Group__0__Impl : ( 'model' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:628:1: ( ( 'model' ) )
            // InternalUlmDsl2.g:629:1: ( 'model' )
            {
            // InternalUlmDsl2.g:629:1: ( 'model' )
            // InternalUlmDsl2.g:630:2: 'model'
            {
             before(grammarAccess.getModelAccess().getModelKeyword_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalUlmDsl2.g:639:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:643:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalUlmDsl2.g:644:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalUlmDsl2.g:651:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:655:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // InternalUlmDsl2.g:656:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // InternalUlmDsl2.g:656:1: ( ( rule__Model__NameAssignment_1 ) )
            // InternalUlmDsl2.g:657:2: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // InternalUlmDsl2.g:658:2: ( rule__Model__NameAssignment_1 )
            // InternalUlmDsl2.g:658:3: rule__Model__NameAssignment_1
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
    // InternalUlmDsl2.g:666:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:670:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalUlmDsl2.g:671:2: rule__Model__Group__2__Impl rule__Model__Group__3
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
    // InternalUlmDsl2.g:678:1: rule__Model__Group__2__Impl : ( '{' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:682:1: ( ( '{' ) )
            // InternalUlmDsl2.g:683:1: ( '{' )
            {
            // InternalUlmDsl2.g:683:1: ( '{' )
            // InternalUlmDsl2.g:684:2: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
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
    // InternalUlmDsl2.g:693:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:697:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalUlmDsl2.g:698:2: rule__Model__Group__3__Impl rule__Model__Group__4
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
    // InternalUlmDsl2.g:705:1: rule__Model__Group__3__Impl : ( ( rule__Model__ContextsAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:709:1: ( ( ( rule__Model__ContextsAssignment_3 )* ) )
            // InternalUlmDsl2.g:710:1: ( ( rule__Model__ContextsAssignment_3 )* )
            {
            // InternalUlmDsl2.g:710:1: ( ( rule__Model__ContextsAssignment_3 )* )
            // InternalUlmDsl2.g:711:2: ( rule__Model__ContextsAssignment_3 )*
            {
             before(grammarAccess.getModelAccess().getContextsAssignment_3()); 
            // InternalUlmDsl2.g:712:2: ( rule__Model__ContextsAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==22) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalUlmDsl2.g:712:3: rule__Model__ContextsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Model__ContextsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalUlmDsl2.g:720:1: rule__Model__Group__4 : rule__Model__Group__4__Impl ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:724:1: ( rule__Model__Group__4__Impl )
            // InternalUlmDsl2.g:725:2: rule__Model__Group__4__Impl
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
    // InternalUlmDsl2.g:731:1: rule__Model__Group__4__Impl : ( '}' ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:735:1: ( ( '}' ) )
            // InternalUlmDsl2.g:736:1: ( '}' )
            {
            // InternalUlmDsl2.g:736:1: ( '}' )
            // InternalUlmDsl2.g:737:2: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4()); 
            match(input,21,FOLLOW_2); 
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
    // InternalUlmDsl2.g:747:1: rule__Context__Group__0 : rule__Context__Group__0__Impl rule__Context__Group__1 ;
    public final void rule__Context__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:751:1: ( rule__Context__Group__0__Impl rule__Context__Group__1 )
            // InternalUlmDsl2.g:752:2: rule__Context__Group__0__Impl rule__Context__Group__1
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
    // InternalUlmDsl2.g:759:1: rule__Context__Group__0__Impl : ( 'context' ) ;
    public final void rule__Context__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:763:1: ( ( 'context' ) )
            // InternalUlmDsl2.g:764:1: ( 'context' )
            {
            // InternalUlmDsl2.g:764:1: ( 'context' )
            // InternalUlmDsl2.g:765:2: 'context'
            {
             before(grammarAccess.getContextAccess().getContextKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalUlmDsl2.g:774:1: rule__Context__Group__1 : rule__Context__Group__1__Impl rule__Context__Group__2 ;
    public final void rule__Context__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:778:1: ( rule__Context__Group__1__Impl rule__Context__Group__2 )
            // InternalUlmDsl2.g:779:2: rule__Context__Group__1__Impl rule__Context__Group__2
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
    // InternalUlmDsl2.g:786:1: rule__Context__Group__1__Impl : ( ( rule__Context__NameAssignment_1 ) ) ;
    public final void rule__Context__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:790:1: ( ( ( rule__Context__NameAssignment_1 ) ) )
            // InternalUlmDsl2.g:791:1: ( ( rule__Context__NameAssignment_1 ) )
            {
            // InternalUlmDsl2.g:791:1: ( ( rule__Context__NameAssignment_1 ) )
            // InternalUlmDsl2.g:792:2: ( rule__Context__NameAssignment_1 )
            {
             before(grammarAccess.getContextAccess().getNameAssignment_1()); 
            // InternalUlmDsl2.g:793:2: ( rule__Context__NameAssignment_1 )
            // InternalUlmDsl2.g:793:3: rule__Context__NameAssignment_1
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
    // InternalUlmDsl2.g:801:1: rule__Context__Group__2 : rule__Context__Group__2__Impl rule__Context__Group__3 ;
    public final void rule__Context__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:805:1: ( rule__Context__Group__2__Impl rule__Context__Group__3 )
            // InternalUlmDsl2.g:806:2: rule__Context__Group__2__Impl rule__Context__Group__3
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
    // InternalUlmDsl2.g:813:1: rule__Context__Group__2__Impl : ( ( rule__Context__VersionAssignment_2 ) ) ;
    public final void rule__Context__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:817:1: ( ( ( rule__Context__VersionAssignment_2 ) ) )
            // InternalUlmDsl2.g:818:1: ( ( rule__Context__VersionAssignment_2 ) )
            {
            // InternalUlmDsl2.g:818:1: ( ( rule__Context__VersionAssignment_2 ) )
            // InternalUlmDsl2.g:819:2: ( rule__Context__VersionAssignment_2 )
            {
             before(grammarAccess.getContextAccess().getVersionAssignment_2()); 
            // InternalUlmDsl2.g:820:2: ( rule__Context__VersionAssignment_2 )
            // InternalUlmDsl2.g:820:3: rule__Context__VersionAssignment_2
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
    // InternalUlmDsl2.g:828:1: rule__Context__Group__3 : rule__Context__Group__3__Impl rule__Context__Group__4 ;
    public final void rule__Context__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:832:1: ( rule__Context__Group__3__Impl rule__Context__Group__4 )
            // InternalUlmDsl2.g:833:2: rule__Context__Group__3__Impl rule__Context__Group__4
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
    // InternalUlmDsl2.g:840:1: rule__Context__Group__3__Impl : ( '{' ) ;
    public final void rule__Context__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:844:1: ( ( '{' ) )
            // InternalUlmDsl2.g:845:1: ( '{' )
            {
            // InternalUlmDsl2.g:845:1: ( '{' )
            // InternalUlmDsl2.g:846:2: '{'
            {
             before(grammarAccess.getContextAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,20,FOLLOW_2); 
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
    // InternalUlmDsl2.g:855:1: rule__Context__Group__4 : rule__Context__Group__4__Impl rule__Context__Group__5 ;
    public final void rule__Context__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:859:1: ( rule__Context__Group__4__Impl rule__Context__Group__5 )
            // InternalUlmDsl2.g:860:2: rule__Context__Group__4__Impl rule__Context__Group__5
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
    // InternalUlmDsl2.g:867:1: rule__Context__Group__4__Impl : ( ( rule__Context__Group_4__0 )? ) ;
    public final void rule__Context__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:871:1: ( ( ( rule__Context__Group_4__0 )? ) )
            // InternalUlmDsl2.g:872:1: ( ( rule__Context__Group_4__0 )? )
            {
            // InternalUlmDsl2.g:872:1: ( ( rule__Context__Group_4__0 )? )
            // InternalUlmDsl2.g:873:2: ( rule__Context__Group_4__0 )?
            {
             before(grammarAccess.getContextAccess().getGroup_4()); 
            // InternalUlmDsl2.g:874:2: ( rule__Context__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalUlmDsl2.g:874:3: rule__Context__Group_4__0
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
    // InternalUlmDsl2.g:882:1: rule__Context__Group__5 : rule__Context__Group__5__Impl rule__Context__Group__6 ;
    public final void rule__Context__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:886:1: ( rule__Context__Group__5__Impl rule__Context__Group__6 )
            // InternalUlmDsl2.g:887:2: rule__Context__Group__5__Impl rule__Context__Group__6
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
    // InternalUlmDsl2.g:894:1: rule__Context__Group__5__Impl : ( ( rule__Context__Group_5__0 )? ) ;
    public final void rule__Context__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:898:1: ( ( ( rule__Context__Group_5__0 )? ) )
            // InternalUlmDsl2.g:899:1: ( ( rule__Context__Group_5__0 )? )
            {
            // InternalUlmDsl2.g:899:1: ( ( rule__Context__Group_5__0 )? )
            // InternalUlmDsl2.g:900:2: ( rule__Context__Group_5__0 )?
            {
             before(grammarAccess.getContextAccess().getGroup_5()); 
            // InternalUlmDsl2.g:901:2: ( rule__Context__Group_5__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalUlmDsl2.g:901:3: rule__Context__Group_5__0
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
    // InternalUlmDsl2.g:909:1: rule__Context__Group__6 : rule__Context__Group__6__Impl rule__Context__Group__7 ;
    public final void rule__Context__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:913:1: ( rule__Context__Group__6__Impl rule__Context__Group__7 )
            // InternalUlmDsl2.g:914:2: rule__Context__Group__6__Impl rule__Context__Group__7
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
    // InternalUlmDsl2.g:921:1: rule__Context__Group__6__Impl : ( ( rule__Context__Group_6__0 )? ) ;
    public final void rule__Context__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:925:1: ( ( ( rule__Context__Group_6__0 )? ) )
            // InternalUlmDsl2.g:926:1: ( ( rule__Context__Group_6__0 )? )
            {
            // InternalUlmDsl2.g:926:1: ( ( rule__Context__Group_6__0 )? )
            // InternalUlmDsl2.g:927:2: ( rule__Context__Group_6__0 )?
            {
             before(grammarAccess.getContextAccess().getGroup_6()); 
            // InternalUlmDsl2.g:928:2: ( rule__Context__Group_6__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalUlmDsl2.g:928:3: rule__Context__Group_6__0
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
    // InternalUlmDsl2.g:936:1: rule__Context__Group__7 : rule__Context__Group__7__Impl ;
    public final void rule__Context__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:940:1: ( rule__Context__Group__7__Impl )
            // InternalUlmDsl2.g:941:2: rule__Context__Group__7__Impl
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
    // InternalUlmDsl2.g:947:1: rule__Context__Group__7__Impl : ( '}' ) ;
    public final void rule__Context__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:951:1: ( ( '}' ) )
            // InternalUlmDsl2.g:952:1: ( '}' )
            {
            // InternalUlmDsl2.g:952:1: ( '}' )
            // InternalUlmDsl2.g:953:2: '}'
            {
             before(grammarAccess.getContextAccess().getRightCurlyBracketKeyword_7()); 
            match(input,21,FOLLOW_2); 
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
    // InternalUlmDsl2.g:963:1: rule__Context__Group_4__0 : rule__Context__Group_4__0__Impl rule__Context__Group_4__1 ;
    public final void rule__Context__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:967:1: ( rule__Context__Group_4__0__Impl rule__Context__Group_4__1 )
            // InternalUlmDsl2.g:968:2: rule__Context__Group_4__0__Impl rule__Context__Group_4__1
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
    // InternalUlmDsl2.g:975:1: rule__Context__Group_4__0__Impl : ( 'attributes' ) ;
    public final void rule__Context__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:979:1: ( ( 'attributes' ) )
            // InternalUlmDsl2.g:980:1: ( 'attributes' )
            {
            // InternalUlmDsl2.g:980:1: ( 'attributes' )
            // InternalUlmDsl2.g:981:2: 'attributes'
            {
             before(grammarAccess.getContextAccess().getAttributesKeyword_4_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalUlmDsl2.g:990:1: rule__Context__Group_4__1 : rule__Context__Group_4__1__Impl rule__Context__Group_4__2 ;
    public final void rule__Context__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:994:1: ( rule__Context__Group_4__1__Impl rule__Context__Group_4__2 )
            // InternalUlmDsl2.g:995:2: rule__Context__Group_4__1__Impl rule__Context__Group_4__2
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
    // InternalUlmDsl2.g:1002:1: rule__Context__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Context__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1006:1: ( ( '{' ) )
            // InternalUlmDsl2.g:1007:1: ( '{' )
            {
            // InternalUlmDsl2.g:1007:1: ( '{' )
            // InternalUlmDsl2.g:1008:2: '{'
            {
             before(grammarAccess.getContextAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalUlmDsl2.g:1017:1: rule__Context__Group_4__2 : rule__Context__Group_4__2__Impl rule__Context__Group_4__3 ;
    public final void rule__Context__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1021:1: ( rule__Context__Group_4__2__Impl rule__Context__Group_4__3 )
            // InternalUlmDsl2.g:1022:2: rule__Context__Group_4__2__Impl rule__Context__Group_4__3
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
    // InternalUlmDsl2.g:1029:1: rule__Context__Group_4__2__Impl : ( ( rule__Context__AttributesAssignment_4_2 )* ) ;
    public final void rule__Context__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1033:1: ( ( ( rule__Context__AttributesAssignment_4_2 )* ) )
            // InternalUlmDsl2.g:1034:1: ( ( rule__Context__AttributesAssignment_4_2 )* )
            {
            // InternalUlmDsl2.g:1034:1: ( ( rule__Context__AttributesAssignment_4_2 )* )
            // InternalUlmDsl2.g:1035:2: ( rule__Context__AttributesAssignment_4_2 )*
            {
             before(grammarAccess.getContextAccess().getAttributesAssignment_4_2()); 
            // InternalUlmDsl2.g:1036:2: ( rule__Context__AttributesAssignment_4_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalUlmDsl2.g:1036:3: rule__Context__AttributesAssignment_4_2
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Context__AttributesAssignment_4_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalUlmDsl2.g:1044:1: rule__Context__Group_4__3 : rule__Context__Group_4__3__Impl ;
    public final void rule__Context__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1048:1: ( rule__Context__Group_4__3__Impl )
            // InternalUlmDsl2.g:1049:2: rule__Context__Group_4__3__Impl
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
    // InternalUlmDsl2.g:1055:1: rule__Context__Group_4__3__Impl : ( '}' ) ;
    public final void rule__Context__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1059:1: ( ( '}' ) )
            // InternalUlmDsl2.g:1060:1: ( '}' )
            {
            // InternalUlmDsl2.g:1060:1: ( '}' )
            // InternalUlmDsl2.g:1061:2: '}'
            {
             before(grammarAccess.getContextAccess().getRightCurlyBracketKeyword_4_3()); 
            match(input,21,FOLLOW_2); 
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
    // InternalUlmDsl2.g:1071:1: rule__Context__Group_5__0 : rule__Context__Group_5__0__Impl rule__Context__Group_5__1 ;
    public final void rule__Context__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1075:1: ( rule__Context__Group_5__0__Impl rule__Context__Group_5__1 )
            // InternalUlmDsl2.g:1076:2: rule__Context__Group_5__0__Impl rule__Context__Group_5__1
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
    // InternalUlmDsl2.g:1083:1: rule__Context__Group_5__0__Impl : ( 'lookups' ) ;
    public final void rule__Context__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1087:1: ( ( 'lookups' ) )
            // InternalUlmDsl2.g:1088:1: ( 'lookups' )
            {
            // InternalUlmDsl2.g:1088:1: ( 'lookups' )
            // InternalUlmDsl2.g:1089:2: 'lookups'
            {
             before(grammarAccess.getContextAccess().getLookupsKeyword_5_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalUlmDsl2.g:1098:1: rule__Context__Group_5__1 : rule__Context__Group_5__1__Impl rule__Context__Group_5__2 ;
    public final void rule__Context__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1102:1: ( rule__Context__Group_5__1__Impl rule__Context__Group_5__2 )
            // InternalUlmDsl2.g:1103:2: rule__Context__Group_5__1__Impl rule__Context__Group_5__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalUlmDsl2.g:1110:1: rule__Context__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Context__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1114:1: ( ( '{' ) )
            // InternalUlmDsl2.g:1115:1: ( '{' )
            {
            // InternalUlmDsl2.g:1115:1: ( '{' )
            // InternalUlmDsl2.g:1116:2: '{'
            {
             before(grammarAccess.getContextAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalUlmDsl2.g:1125:1: rule__Context__Group_5__2 : rule__Context__Group_5__2__Impl rule__Context__Group_5__3 ;
    public final void rule__Context__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1129:1: ( rule__Context__Group_5__2__Impl rule__Context__Group_5__3 )
            // InternalUlmDsl2.g:1130:2: rule__Context__Group_5__2__Impl rule__Context__Group_5__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalUlmDsl2.g:1137:1: rule__Context__Group_5__2__Impl : ( ( rule__Context__LookupsAssignment_5_2 )* ) ;
    public final void rule__Context__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1141:1: ( ( ( rule__Context__LookupsAssignment_5_2 )* ) )
            // InternalUlmDsl2.g:1142:1: ( ( rule__Context__LookupsAssignment_5_2 )* )
            {
            // InternalUlmDsl2.g:1142:1: ( ( rule__Context__LookupsAssignment_5_2 )* )
            // InternalUlmDsl2.g:1143:2: ( rule__Context__LookupsAssignment_5_2 )*
            {
             before(grammarAccess.getContextAccess().getLookupsAssignment_5_2()); 
            // InternalUlmDsl2.g:1144:2: ( rule__Context__LookupsAssignment_5_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalUlmDsl2.g:1144:3: rule__Context__LookupsAssignment_5_2
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Context__LookupsAssignment_5_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalUlmDsl2.g:1152:1: rule__Context__Group_5__3 : rule__Context__Group_5__3__Impl ;
    public final void rule__Context__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1156:1: ( rule__Context__Group_5__3__Impl )
            // InternalUlmDsl2.g:1157:2: rule__Context__Group_5__3__Impl
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
    // InternalUlmDsl2.g:1163:1: rule__Context__Group_5__3__Impl : ( '}' ) ;
    public final void rule__Context__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1167:1: ( ( '}' ) )
            // InternalUlmDsl2.g:1168:1: ( '}' )
            {
            // InternalUlmDsl2.g:1168:1: ( '}' )
            // InternalUlmDsl2.g:1169:2: '}'
            {
             before(grammarAccess.getContextAccess().getRightCurlyBracketKeyword_5_3()); 
            match(input,21,FOLLOW_2); 
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
    // InternalUlmDsl2.g:1179:1: rule__Context__Group_6__0 : rule__Context__Group_6__0__Impl rule__Context__Group_6__1 ;
    public final void rule__Context__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1183:1: ( rule__Context__Group_6__0__Impl rule__Context__Group_6__1 )
            // InternalUlmDsl2.g:1184:2: rule__Context__Group_6__0__Impl rule__Context__Group_6__1
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
    // InternalUlmDsl2.g:1191:1: rule__Context__Group_6__0__Impl : ( 'entities' ) ;
    public final void rule__Context__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1195:1: ( ( 'entities' ) )
            // InternalUlmDsl2.g:1196:1: ( 'entities' )
            {
            // InternalUlmDsl2.g:1196:1: ( 'entities' )
            // InternalUlmDsl2.g:1197:2: 'entities'
            {
             before(grammarAccess.getContextAccess().getEntitiesKeyword_6_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalUlmDsl2.g:1206:1: rule__Context__Group_6__1 : rule__Context__Group_6__1__Impl rule__Context__Group_6__2 ;
    public final void rule__Context__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1210:1: ( rule__Context__Group_6__1__Impl rule__Context__Group_6__2 )
            // InternalUlmDsl2.g:1211:2: rule__Context__Group_6__1__Impl rule__Context__Group_6__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalUlmDsl2.g:1218:1: rule__Context__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Context__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1222:1: ( ( '{' ) )
            // InternalUlmDsl2.g:1223:1: ( '{' )
            {
            // InternalUlmDsl2.g:1223:1: ( '{' )
            // InternalUlmDsl2.g:1224:2: '{'
            {
             before(grammarAccess.getContextAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalUlmDsl2.g:1233:1: rule__Context__Group_6__2 : rule__Context__Group_6__2__Impl rule__Context__Group_6__3 ;
    public final void rule__Context__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1237:1: ( rule__Context__Group_6__2__Impl rule__Context__Group_6__3 )
            // InternalUlmDsl2.g:1238:2: rule__Context__Group_6__2__Impl rule__Context__Group_6__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalUlmDsl2.g:1245:1: rule__Context__Group_6__2__Impl : ( ( rule__Context__EntitiesAssignment_6_2 )* ) ;
    public final void rule__Context__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1249:1: ( ( ( rule__Context__EntitiesAssignment_6_2 )* ) )
            // InternalUlmDsl2.g:1250:1: ( ( rule__Context__EntitiesAssignment_6_2 )* )
            {
            // InternalUlmDsl2.g:1250:1: ( ( rule__Context__EntitiesAssignment_6_2 )* )
            // InternalUlmDsl2.g:1251:2: ( rule__Context__EntitiesAssignment_6_2 )*
            {
             before(grammarAccess.getContextAccess().getEntitiesAssignment_6_2()); 
            // InternalUlmDsl2.g:1252:2: ( rule__Context__EntitiesAssignment_6_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||(LA12_0>=16 && LA12_0<=18)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalUlmDsl2.g:1252:3: rule__Context__EntitiesAssignment_6_2
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Context__EntitiesAssignment_6_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalUlmDsl2.g:1260:1: rule__Context__Group_6__3 : rule__Context__Group_6__3__Impl ;
    public final void rule__Context__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1264:1: ( rule__Context__Group_6__3__Impl )
            // InternalUlmDsl2.g:1265:2: rule__Context__Group_6__3__Impl
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
    // InternalUlmDsl2.g:1271:1: rule__Context__Group_6__3__Impl : ( '}' ) ;
    public final void rule__Context__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1275:1: ( ( '}' ) )
            // InternalUlmDsl2.g:1276:1: ( '}' )
            {
            // InternalUlmDsl2.g:1276:1: ( '}' )
            // InternalUlmDsl2.g:1277:2: '}'
            {
             before(grammarAccess.getContextAccess().getRightCurlyBracketKeyword_6_3()); 
            match(input,21,FOLLOW_2); 
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
    // InternalUlmDsl2.g:1287:1: rule__Version__Group__0 : rule__Version__Group__0__Impl rule__Version__Group__1 ;
    public final void rule__Version__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1291:1: ( rule__Version__Group__0__Impl rule__Version__Group__1 )
            // InternalUlmDsl2.g:1292:2: rule__Version__Group__0__Impl rule__Version__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalUlmDsl2.g:1299:1: rule__Version__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Version__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1303:1: ( ( RULE_INT ) )
            // InternalUlmDsl2.g:1304:1: ( RULE_INT )
            {
            // InternalUlmDsl2.g:1304:1: ( RULE_INT )
            // InternalUlmDsl2.g:1305:2: RULE_INT
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
    // InternalUlmDsl2.g:1314:1: rule__Version__Group__1 : rule__Version__Group__1__Impl rule__Version__Group__2 ;
    public final void rule__Version__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1318:1: ( rule__Version__Group__1__Impl rule__Version__Group__2 )
            // InternalUlmDsl2.g:1319:2: rule__Version__Group__1__Impl rule__Version__Group__2
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
    // InternalUlmDsl2.g:1326:1: rule__Version__Group__1__Impl : ( '.' ) ;
    public final void rule__Version__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1330:1: ( ( '.' ) )
            // InternalUlmDsl2.g:1331:1: ( '.' )
            {
            // InternalUlmDsl2.g:1331:1: ( '.' )
            // InternalUlmDsl2.g:1332:2: '.'
            {
             before(grammarAccess.getVersionAccess().getFullStopKeyword_1()); 
            match(input,26,FOLLOW_2); 
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
    // InternalUlmDsl2.g:1341:1: rule__Version__Group__2 : rule__Version__Group__2__Impl rule__Version__Group__3 ;
    public final void rule__Version__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1345:1: ( rule__Version__Group__2__Impl rule__Version__Group__3 )
            // InternalUlmDsl2.g:1346:2: rule__Version__Group__2__Impl rule__Version__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalUlmDsl2.g:1353:1: rule__Version__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__Version__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1357:1: ( ( RULE_INT ) )
            // InternalUlmDsl2.g:1358:1: ( RULE_INT )
            {
            // InternalUlmDsl2.g:1358:1: ( RULE_INT )
            // InternalUlmDsl2.g:1359:2: RULE_INT
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
    // InternalUlmDsl2.g:1368:1: rule__Version__Group__3 : rule__Version__Group__3__Impl rule__Version__Group__4 ;
    public final void rule__Version__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1372:1: ( rule__Version__Group__3__Impl rule__Version__Group__4 )
            // InternalUlmDsl2.g:1373:2: rule__Version__Group__3__Impl rule__Version__Group__4
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
    // InternalUlmDsl2.g:1380:1: rule__Version__Group__3__Impl : ( '.' ) ;
    public final void rule__Version__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1384:1: ( ( '.' ) )
            // InternalUlmDsl2.g:1385:1: ( '.' )
            {
            // InternalUlmDsl2.g:1385:1: ( '.' )
            // InternalUlmDsl2.g:1386:2: '.'
            {
             before(grammarAccess.getVersionAccess().getFullStopKeyword_3()); 
            match(input,26,FOLLOW_2); 
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
    // InternalUlmDsl2.g:1395:1: rule__Version__Group__4 : rule__Version__Group__4__Impl ;
    public final void rule__Version__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1399:1: ( rule__Version__Group__4__Impl )
            // InternalUlmDsl2.g:1400:2: rule__Version__Group__4__Impl
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
    // InternalUlmDsl2.g:1406:1: rule__Version__Group__4__Impl : ( RULE_INT ) ;
    public final void rule__Version__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1410:1: ( ( RULE_INT ) )
            // InternalUlmDsl2.g:1411:1: ( RULE_INT )
            {
            // InternalUlmDsl2.g:1411:1: ( RULE_INT )
            // InternalUlmDsl2.g:1412:2: RULE_INT
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
    // InternalUlmDsl2.g:1422:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1426:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalUlmDsl2.g:1427:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalUlmDsl2.g:1434:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__NameAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1438:1: ( ( ( rule__Attribute__NameAssignment_0 ) ) )
            // InternalUlmDsl2.g:1439:1: ( ( rule__Attribute__NameAssignment_0 ) )
            {
            // InternalUlmDsl2.g:1439:1: ( ( rule__Attribute__NameAssignment_0 ) )
            // InternalUlmDsl2.g:1440:2: ( rule__Attribute__NameAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_0()); 
            // InternalUlmDsl2.g:1441:2: ( rule__Attribute__NameAssignment_0 )
            // InternalUlmDsl2.g:1441:3: rule__Attribute__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_0()); 

            }


            }

        }
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
    // InternalUlmDsl2.g:1449:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1453:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalUlmDsl2.g:1454:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalUlmDsl2.g:1461:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__TypeAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1465:1: ( ( ( rule__Attribute__TypeAssignment_1 ) ) )
            // InternalUlmDsl2.g:1466:1: ( ( rule__Attribute__TypeAssignment_1 ) )
            {
            // InternalUlmDsl2.g:1466:1: ( ( rule__Attribute__TypeAssignment_1 ) )
            // InternalUlmDsl2.g:1467:2: ( rule__Attribute__TypeAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_1()); 
            // InternalUlmDsl2.g:1468:2: ( rule__Attribute__TypeAssignment_1 )
            // InternalUlmDsl2.g:1468:3: rule__Attribute__TypeAssignment_1
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
    // InternalUlmDsl2.g:1476:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1480:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalUlmDsl2.g:1481:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalUlmDsl2.g:1488:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__DescAssignment_2 )? ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1492:1: ( ( ( rule__Attribute__DescAssignment_2 )? ) )
            // InternalUlmDsl2.g:1493:1: ( ( rule__Attribute__DescAssignment_2 )? )
            {
            // InternalUlmDsl2.g:1493:1: ( ( rule__Attribute__DescAssignment_2 )? )
            // InternalUlmDsl2.g:1494:2: ( rule__Attribute__DescAssignment_2 )?
            {
             before(grammarAccess.getAttributeAccess().getDescAssignment_2()); 
            // InternalUlmDsl2.g:1495:2: ( rule__Attribute__DescAssignment_2 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalUlmDsl2.g:1495:3: rule__Attribute__DescAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__DescAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getDescAssignment_2()); 

            }


            }

        }
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
    // InternalUlmDsl2.g:1503:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1507:1: ( rule__Attribute__Group__3__Impl )
            // InternalUlmDsl2.g:1508:2: rule__Attribute__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalUlmDsl2.g:1514:1: rule__Attribute__Group__3__Impl : ( ';' ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1518:1: ( ( ';' ) )
            // InternalUlmDsl2.g:1519:1: ( ';' )
            {
            // InternalUlmDsl2.g:1519:1: ( ';' )
            // InternalUlmDsl2.g:1520:2: ';'
            {
             before(grammarAccess.getAttributeAccess().getSemicolonKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getSemicolonKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__AttributeStringType__Group__0"
    // InternalUlmDsl2.g:1530:1: rule__AttributeStringType__Group__0 : rule__AttributeStringType__Group__0__Impl rule__AttributeStringType__Group__1 ;
    public final void rule__AttributeStringType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1534:1: ( rule__AttributeStringType__Group__0__Impl rule__AttributeStringType__Group__1 )
            // InternalUlmDsl2.g:1535:2: rule__AttributeStringType__Group__0__Impl rule__AttributeStringType__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__AttributeStringType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeStringType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeStringType__Group__0"


    // $ANTLR start "rule__AttributeStringType__Group__0__Impl"
    // InternalUlmDsl2.g:1542:1: rule__AttributeStringType__Group__0__Impl : ( ( rule__AttributeStringType__NameAssignment_0 ) ) ;
    public final void rule__AttributeStringType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1546:1: ( ( ( rule__AttributeStringType__NameAssignment_0 ) ) )
            // InternalUlmDsl2.g:1547:1: ( ( rule__AttributeStringType__NameAssignment_0 ) )
            {
            // InternalUlmDsl2.g:1547:1: ( ( rule__AttributeStringType__NameAssignment_0 ) )
            // InternalUlmDsl2.g:1548:2: ( rule__AttributeStringType__NameAssignment_0 )
            {
             before(grammarAccess.getAttributeStringTypeAccess().getNameAssignment_0()); 
            // InternalUlmDsl2.g:1549:2: ( rule__AttributeStringType__NameAssignment_0 )
            // InternalUlmDsl2.g:1549:3: rule__AttributeStringType__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeStringType__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeStringTypeAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeStringType__Group__0__Impl"


    // $ANTLR start "rule__AttributeStringType__Group__1"
    // InternalUlmDsl2.g:1557:1: rule__AttributeStringType__Group__1 : rule__AttributeStringType__Group__1__Impl ;
    public final void rule__AttributeStringType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1561:1: ( rule__AttributeStringType__Group__1__Impl )
            // InternalUlmDsl2.g:1562:2: rule__AttributeStringType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeStringType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeStringType__Group__1"


    // $ANTLR start "rule__AttributeStringType__Group__1__Impl"
    // InternalUlmDsl2.g:1568:1: rule__AttributeStringType__Group__1__Impl : ( ( rule__AttributeStringType__Group_1__0 )? ) ;
    public final void rule__AttributeStringType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1572:1: ( ( ( rule__AttributeStringType__Group_1__0 )? ) )
            // InternalUlmDsl2.g:1573:1: ( ( rule__AttributeStringType__Group_1__0 )? )
            {
            // InternalUlmDsl2.g:1573:1: ( ( rule__AttributeStringType__Group_1__0 )? )
            // InternalUlmDsl2.g:1574:2: ( rule__AttributeStringType__Group_1__0 )?
            {
             before(grammarAccess.getAttributeStringTypeAccess().getGroup_1()); 
            // InternalUlmDsl2.g:1575:2: ( rule__AttributeStringType__Group_1__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==40) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalUlmDsl2.g:1575:3: rule__AttributeStringType__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributeStringType__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeStringTypeAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeStringType__Group__1__Impl"


    // $ANTLR start "rule__AttributeStringType__Group_1__0"
    // InternalUlmDsl2.g:1584:1: rule__AttributeStringType__Group_1__0 : rule__AttributeStringType__Group_1__0__Impl rule__AttributeStringType__Group_1__1 ;
    public final void rule__AttributeStringType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1588:1: ( rule__AttributeStringType__Group_1__0__Impl rule__AttributeStringType__Group_1__1 )
            // InternalUlmDsl2.g:1589:2: rule__AttributeStringType__Group_1__0__Impl rule__AttributeStringType__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__AttributeStringType__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeStringType__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeStringType__Group_1__0"


    // $ANTLR start "rule__AttributeStringType__Group_1__0__Impl"
    // InternalUlmDsl2.g:1596:1: rule__AttributeStringType__Group_1__0__Impl : ( ( rule__AttributeStringType__ArrayAssignment_1_0 ) ) ;
    public final void rule__AttributeStringType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1600:1: ( ( ( rule__AttributeStringType__ArrayAssignment_1_0 ) ) )
            // InternalUlmDsl2.g:1601:1: ( ( rule__AttributeStringType__ArrayAssignment_1_0 ) )
            {
            // InternalUlmDsl2.g:1601:1: ( ( rule__AttributeStringType__ArrayAssignment_1_0 ) )
            // InternalUlmDsl2.g:1602:2: ( rule__AttributeStringType__ArrayAssignment_1_0 )
            {
             before(grammarAccess.getAttributeStringTypeAccess().getArrayAssignment_1_0()); 
            // InternalUlmDsl2.g:1603:2: ( rule__AttributeStringType__ArrayAssignment_1_0 )
            // InternalUlmDsl2.g:1603:3: rule__AttributeStringType__ArrayAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeStringType__ArrayAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeStringTypeAccess().getArrayAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeStringType__Group_1__0__Impl"


    // $ANTLR start "rule__AttributeStringType__Group_1__1"
    // InternalUlmDsl2.g:1611:1: rule__AttributeStringType__Group_1__1 : rule__AttributeStringType__Group_1__1__Impl rule__AttributeStringType__Group_1__2 ;
    public final void rule__AttributeStringType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1615:1: ( rule__AttributeStringType__Group_1__1__Impl rule__AttributeStringType__Group_1__2 )
            // InternalUlmDsl2.g:1616:2: rule__AttributeStringType__Group_1__1__Impl rule__AttributeStringType__Group_1__2
            {
            pushFollow(FOLLOW_17);
            rule__AttributeStringType__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeStringType__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeStringType__Group_1__1"


    // $ANTLR start "rule__AttributeStringType__Group_1__1__Impl"
    // InternalUlmDsl2.g:1623:1: rule__AttributeStringType__Group_1__1__Impl : ( ( rule__AttributeStringType__LengthAssignment_1_1 ) ) ;
    public final void rule__AttributeStringType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1627:1: ( ( ( rule__AttributeStringType__LengthAssignment_1_1 ) ) )
            // InternalUlmDsl2.g:1628:1: ( ( rule__AttributeStringType__LengthAssignment_1_1 ) )
            {
            // InternalUlmDsl2.g:1628:1: ( ( rule__AttributeStringType__LengthAssignment_1_1 ) )
            // InternalUlmDsl2.g:1629:2: ( rule__AttributeStringType__LengthAssignment_1_1 )
            {
             before(grammarAccess.getAttributeStringTypeAccess().getLengthAssignment_1_1()); 
            // InternalUlmDsl2.g:1630:2: ( rule__AttributeStringType__LengthAssignment_1_1 )
            // InternalUlmDsl2.g:1630:3: rule__AttributeStringType__LengthAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AttributeStringType__LengthAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeStringTypeAccess().getLengthAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeStringType__Group_1__1__Impl"


    // $ANTLR start "rule__AttributeStringType__Group_1__2"
    // InternalUlmDsl2.g:1638:1: rule__AttributeStringType__Group_1__2 : rule__AttributeStringType__Group_1__2__Impl ;
    public final void rule__AttributeStringType__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1642:1: ( rule__AttributeStringType__Group_1__2__Impl )
            // InternalUlmDsl2.g:1643:2: rule__AttributeStringType__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeStringType__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeStringType__Group_1__2"


    // $ANTLR start "rule__AttributeStringType__Group_1__2__Impl"
    // InternalUlmDsl2.g:1649:1: rule__AttributeStringType__Group_1__2__Impl : ( ']' ) ;
    public final void rule__AttributeStringType__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1653:1: ( ( ']' ) )
            // InternalUlmDsl2.g:1654:1: ( ']' )
            {
            // InternalUlmDsl2.g:1654:1: ( ']' )
            // InternalUlmDsl2.g:1655:2: ']'
            {
             before(grammarAccess.getAttributeStringTypeAccess().getRightSquareBracketKeyword_1_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getAttributeStringTypeAccess().getRightSquareBracketKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeStringType__Group_1__2__Impl"


    // $ANTLR start "rule__AttributeDecimalType__Group__0"
    // InternalUlmDsl2.g:1665:1: rule__AttributeDecimalType__Group__0 : rule__AttributeDecimalType__Group__0__Impl rule__AttributeDecimalType__Group__1 ;
    public final void rule__AttributeDecimalType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1669:1: ( rule__AttributeDecimalType__Group__0__Impl rule__AttributeDecimalType__Group__1 )
            // InternalUlmDsl2.g:1670:2: rule__AttributeDecimalType__Group__0__Impl rule__AttributeDecimalType__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__AttributeDecimalType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeDecimalType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDecimalType__Group__0"


    // $ANTLR start "rule__AttributeDecimalType__Group__0__Impl"
    // InternalUlmDsl2.g:1677:1: rule__AttributeDecimalType__Group__0__Impl : ( ( rule__AttributeDecimalType__NameAssignment_0 ) ) ;
    public final void rule__AttributeDecimalType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1681:1: ( ( ( rule__AttributeDecimalType__NameAssignment_0 ) ) )
            // InternalUlmDsl2.g:1682:1: ( ( rule__AttributeDecimalType__NameAssignment_0 ) )
            {
            // InternalUlmDsl2.g:1682:1: ( ( rule__AttributeDecimalType__NameAssignment_0 ) )
            // InternalUlmDsl2.g:1683:2: ( rule__AttributeDecimalType__NameAssignment_0 )
            {
             before(grammarAccess.getAttributeDecimalTypeAccess().getNameAssignment_0()); 
            // InternalUlmDsl2.g:1684:2: ( rule__AttributeDecimalType__NameAssignment_0 )
            // InternalUlmDsl2.g:1684:3: rule__AttributeDecimalType__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeDecimalType__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeDecimalTypeAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDecimalType__Group__0__Impl"


    // $ANTLR start "rule__AttributeDecimalType__Group__1"
    // InternalUlmDsl2.g:1692:1: rule__AttributeDecimalType__Group__1 : rule__AttributeDecimalType__Group__1__Impl ;
    public final void rule__AttributeDecimalType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1696:1: ( rule__AttributeDecimalType__Group__1__Impl )
            // InternalUlmDsl2.g:1697:2: rule__AttributeDecimalType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeDecimalType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDecimalType__Group__1"


    // $ANTLR start "rule__AttributeDecimalType__Group__1__Impl"
    // InternalUlmDsl2.g:1703:1: rule__AttributeDecimalType__Group__1__Impl : ( ( rule__AttributeDecimalType__Group_1__0 )? ) ;
    public final void rule__AttributeDecimalType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1707:1: ( ( ( rule__AttributeDecimalType__Group_1__0 )? ) )
            // InternalUlmDsl2.g:1708:1: ( ( rule__AttributeDecimalType__Group_1__0 )? )
            {
            // InternalUlmDsl2.g:1708:1: ( ( rule__AttributeDecimalType__Group_1__0 )? )
            // InternalUlmDsl2.g:1709:2: ( rule__AttributeDecimalType__Group_1__0 )?
            {
             before(grammarAccess.getAttributeDecimalTypeAccess().getGroup_1()); 
            // InternalUlmDsl2.g:1710:2: ( rule__AttributeDecimalType__Group_1__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==40) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalUlmDsl2.g:1710:3: rule__AttributeDecimalType__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributeDecimalType__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeDecimalTypeAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDecimalType__Group__1__Impl"


    // $ANTLR start "rule__AttributeDecimalType__Group_1__0"
    // InternalUlmDsl2.g:1719:1: rule__AttributeDecimalType__Group_1__0 : rule__AttributeDecimalType__Group_1__0__Impl rule__AttributeDecimalType__Group_1__1 ;
    public final void rule__AttributeDecimalType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1723:1: ( rule__AttributeDecimalType__Group_1__0__Impl rule__AttributeDecimalType__Group_1__1 )
            // InternalUlmDsl2.g:1724:2: rule__AttributeDecimalType__Group_1__0__Impl rule__AttributeDecimalType__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__AttributeDecimalType__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeDecimalType__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDecimalType__Group_1__0"


    // $ANTLR start "rule__AttributeDecimalType__Group_1__0__Impl"
    // InternalUlmDsl2.g:1731:1: rule__AttributeDecimalType__Group_1__0__Impl : ( ( rule__AttributeDecimalType__ArrayAssignment_1_0 ) ) ;
    public final void rule__AttributeDecimalType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1735:1: ( ( ( rule__AttributeDecimalType__ArrayAssignment_1_0 ) ) )
            // InternalUlmDsl2.g:1736:1: ( ( rule__AttributeDecimalType__ArrayAssignment_1_0 ) )
            {
            // InternalUlmDsl2.g:1736:1: ( ( rule__AttributeDecimalType__ArrayAssignment_1_0 ) )
            // InternalUlmDsl2.g:1737:2: ( rule__AttributeDecimalType__ArrayAssignment_1_0 )
            {
             before(grammarAccess.getAttributeDecimalTypeAccess().getArrayAssignment_1_0()); 
            // InternalUlmDsl2.g:1738:2: ( rule__AttributeDecimalType__ArrayAssignment_1_0 )
            // InternalUlmDsl2.g:1738:3: rule__AttributeDecimalType__ArrayAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeDecimalType__ArrayAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeDecimalTypeAccess().getArrayAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDecimalType__Group_1__0__Impl"


    // $ANTLR start "rule__AttributeDecimalType__Group_1__1"
    // InternalUlmDsl2.g:1746:1: rule__AttributeDecimalType__Group_1__1 : rule__AttributeDecimalType__Group_1__1__Impl rule__AttributeDecimalType__Group_1__2 ;
    public final void rule__AttributeDecimalType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1750:1: ( rule__AttributeDecimalType__Group_1__1__Impl rule__AttributeDecimalType__Group_1__2 )
            // InternalUlmDsl2.g:1751:2: rule__AttributeDecimalType__Group_1__1__Impl rule__AttributeDecimalType__Group_1__2
            {
            pushFollow(FOLLOW_18);
            rule__AttributeDecimalType__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeDecimalType__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDecimalType__Group_1__1"


    // $ANTLR start "rule__AttributeDecimalType__Group_1__1__Impl"
    // InternalUlmDsl2.g:1758:1: rule__AttributeDecimalType__Group_1__1__Impl : ( ( rule__AttributeDecimalType__ScaleAssignment_1_1 ) ) ;
    public final void rule__AttributeDecimalType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1762:1: ( ( ( rule__AttributeDecimalType__ScaleAssignment_1_1 ) ) )
            // InternalUlmDsl2.g:1763:1: ( ( rule__AttributeDecimalType__ScaleAssignment_1_1 ) )
            {
            // InternalUlmDsl2.g:1763:1: ( ( rule__AttributeDecimalType__ScaleAssignment_1_1 ) )
            // InternalUlmDsl2.g:1764:2: ( rule__AttributeDecimalType__ScaleAssignment_1_1 )
            {
             before(grammarAccess.getAttributeDecimalTypeAccess().getScaleAssignment_1_1()); 
            // InternalUlmDsl2.g:1765:2: ( rule__AttributeDecimalType__ScaleAssignment_1_1 )
            // InternalUlmDsl2.g:1765:3: rule__AttributeDecimalType__ScaleAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AttributeDecimalType__ScaleAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeDecimalTypeAccess().getScaleAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDecimalType__Group_1__1__Impl"


    // $ANTLR start "rule__AttributeDecimalType__Group_1__2"
    // InternalUlmDsl2.g:1773:1: rule__AttributeDecimalType__Group_1__2 : rule__AttributeDecimalType__Group_1__2__Impl rule__AttributeDecimalType__Group_1__3 ;
    public final void rule__AttributeDecimalType__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1777:1: ( rule__AttributeDecimalType__Group_1__2__Impl rule__AttributeDecimalType__Group_1__3 )
            // InternalUlmDsl2.g:1778:2: rule__AttributeDecimalType__Group_1__2__Impl rule__AttributeDecimalType__Group_1__3
            {
            pushFollow(FOLLOW_18);
            rule__AttributeDecimalType__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeDecimalType__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDecimalType__Group_1__2"


    // $ANTLR start "rule__AttributeDecimalType__Group_1__2__Impl"
    // InternalUlmDsl2.g:1785:1: rule__AttributeDecimalType__Group_1__2__Impl : ( ( rule__AttributeDecimalType__Group_1_2__0 )? ) ;
    public final void rule__AttributeDecimalType__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1789:1: ( ( ( rule__AttributeDecimalType__Group_1_2__0 )? ) )
            // InternalUlmDsl2.g:1790:1: ( ( rule__AttributeDecimalType__Group_1_2__0 )? )
            {
            // InternalUlmDsl2.g:1790:1: ( ( rule__AttributeDecimalType__Group_1_2__0 )? )
            // InternalUlmDsl2.g:1791:2: ( rule__AttributeDecimalType__Group_1_2__0 )?
            {
             before(grammarAccess.getAttributeDecimalTypeAccess().getGroup_1_2()); 
            // InternalUlmDsl2.g:1792:2: ( rule__AttributeDecimalType__Group_1_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalUlmDsl2.g:1792:3: rule__AttributeDecimalType__Group_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributeDecimalType__Group_1_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeDecimalTypeAccess().getGroup_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDecimalType__Group_1__2__Impl"


    // $ANTLR start "rule__AttributeDecimalType__Group_1__3"
    // InternalUlmDsl2.g:1800:1: rule__AttributeDecimalType__Group_1__3 : rule__AttributeDecimalType__Group_1__3__Impl ;
    public final void rule__AttributeDecimalType__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1804:1: ( rule__AttributeDecimalType__Group_1__3__Impl )
            // InternalUlmDsl2.g:1805:2: rule__AttributeDecimalType__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeDecimalType__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDecimalType__Group_1__3"


    // $ANTLR start "rule__AttributeDecimalType__Group_1__3__Impl"
    // InternalUlmDsl2.g:1811:1: rule__AttributeDecimalType__Group_1__3__Impl : ( ']' ) ;
    public final void rule__AttributeDecimalType__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1815:1: ( ( ']' ) )
            // InternalUlmDsl2.g:1816:1: ( ']' )
            {
            // InternalUlmDsl2.g:1816:1: ( ']' )
            // InternalUlmDsl2.g:1817:2: ']'
            {
             before(grammarAccess.getAttributeDecimalTypeAccess().getRightSquareBracketKeyword_1_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getAttributeDecimalTypeAccess().getRightSquareBracketKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDecimalType__Group_1__3__Impl"


    // $ANTLR start "rule__AttributeDecimalType__Group_1_2__0"
    // InternalUlmDsl2.g:1827:1: rule__AttributeDecimalType__Group_1_2__0 : rule__AttributeDecimalType__Group_1_2__0__Impl rule__AttributeDecimalType__Group_1_2__1 ;
    public final void rule__AttributeDecimalType__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1831:1: ( rule__AttributeDecimalType__Group_1_2__0__Impl rule__AttributeDecimalType__Group_1_2__1 )
            // InternalUlmDsl2.g:1832:2: rule__AttributeDecimalType__Group_1_2__0__Impl rule__AttributeDecimalType__Group_1_2__1
            {
            pushFollow(FOLLOW_7);
            rule__AttributeDecimalType__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeDecimalType__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDecimalType__Group_1_2__0"


    // $ANTLR start "rule__AttributeDecimalType__Group_1_2__0__Impl"
    // InternalUlmDsl2.g:1839:1: rule__AttributeDecimalType__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__AttributeDecimalType__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1843:1: ( ( ',' ) )
            // InternalUlmDsl2.g:1844:1: ( ',' )
            {
            // InternalUlmDsl2.g:1844:1: ( ',' )
            // InternalUlmDsl2.g:1845:2: ','
            {
             before(grammarAccess.getAttributeDecimalTypeAccess().getCommaKeyword_1_2_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getAttributeDecimalTypeAccess().getCommaKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDecimalType__Group_1_2__0__Impl"


    // $ANTLR start "rule__AttributeDecimalType__Group_1_2__1"
    // InternalUlmDsl2.g:1854:1: rule__AttributeDecimalType__Group_1_2__1 : rule__AttributeDecimalType__Group_1_2__1__Impl ;
    public final void rule__AttributeDecimalType__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1858:1: ( rule__AttributeDecimalType__Group_1_2__1__Impl )
            // InternalUlmDsl2.g:1859:2: rule__AttributeDecimalType__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeDecimalType__Group_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDecimalType__Group_1_2__1"


    // $ANTLR start "rule__AttributeDecimalType__Group_1_2__1__Impl"
    // InternalUlmDsl2.g:1865:1: rule__AttributeDecimalType__Group_1_2__1__Impl : ( ( rule__AttributeDecimalType__PrecisionAssignment_1_2_1 ) ) ;
    public final void rule__AttributeDecimalType__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1869:1: ( ( ( rule__AttributeDecimalType__PrecisionAssignment_1_2_1 ) ) )
            // InternalUlmDsl2.g:1870:1: ( ( rule__AttributeDecimalType__PrecisionAssignment_1_2_1 ) )
            {
            // InternalUlmDsl2.g:1870:1: ( ( rule__AttributeDecimalType__PrecisionAssignment_1_2_1 ) )
            // InternalUlmDsl2.g:1871:2: ( rule__AttributeDecimalType__PrecisionAssignment_1_2_1 )
            {
             before(grammarAccess.getAttributeDecimalTypeAccess().getPrecisionAssignment_1_2_1()); 
            // InternalUlmDsl2.g:1872:2: ( rule__AttributeDecimalType__PrecisionAssignment_1_2_1 )
            // InternalUlmDsl2.g:1872:3: rule__AttributeDecimalType__PrecisionAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__AttributeDecimalType__PrecisionAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeDecimalTypeAccess().getPrecisionAssignment_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDecimalType__Group_1_2__1__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalUlmDsl2.g:1881:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1885:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalUlmDsl2.g:1886:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalUlmDsl2.g:1893:1: rule__Entity__Group__0__Impl : ( ( rule__Entity__TypeAssignment_0 )? ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1897:1: ( ( ( rule__Entity__TypeAssignment_0 )? ) )
            // InternalUlmDsl2.g:1898:1: ( ( rule__Entity__TypeAssignment_0 )? )
            {
            // InternalUlmDsl2.g:1898:1: ( ( rule__Entity__TypeAssignment_0 )? )
            // InternalUlmDsl2.g:1899:2: ( rule__Entity__TypeAssignment_0 )?
            {
             before(grammarAccess.getEntityAccess().getTypeAssignment_0()); 
            // InternalUlmDsl2.g:1900:2: ( rule__Entity__TypeAssignment_0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=16 && LA17_0<=18)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalUlmDsl2.g:1900:3: rule__Entity__TypeAssignment_0
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
    // InternalUlmDsl2.g:1908:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1912:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalUlmDsl2.g:1913:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalUlmDsl2.g:1920:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1924:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalUlmDsl2.g:1925:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalUlmDsl2.g:1925:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalUlmDsl2.g:1926:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalUlmDsl2.g:1927:2: ( rule__Entity__NameAssignment_1 )
            // InternalUlmDsl2.g:1927:3: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalUlmDsl2.g:1935:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1939:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalUlmDsl2.g:1940:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalUlmDsl2.g:1947:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__DescAssignment_2 )? ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1951:1: ( ( ( rule__Entity__DescAssignment_2 )? ) )
            // InternalUlmDsl2.g:1952:1: ( ( rule__Entity__DescAssignment_2 )? )
            {
            // InternalUlmDsl2.g:1952:1: ( ( rule__Entity__DescAssignment_2 )? )
            // InternalUlmDsl2.g:1953:2: ( rule__Entity__DescAssignment_2 )?
            {
             before(grammarAccess.getEntityAccess().getDescAssignment_2()); 
            // InternalUlmDsl2.g:1954:2: ( rule__Entity__DescAssignment_2 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_STRING) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalUlmDsl2.g:1954:3: rule__Entity__DescAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__DescAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getDescAssignment_2()); 

            }


            }

        }
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
    // InternalUlmDsl2.g:1962:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1966:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalUlmDsl2.g:1967:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalUlmDsl2.g:1974:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__Group_3__0 )? ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1978:1: ( ( ( rule__Entity__Group_3__0 )? ) )
            // InternalUlmDsl2.g:1979:1: ( ( rule__Entity__Group_3__0 )? )
            {
            // InternalUlmDsl2.g:1979:1: ( ( rule__Entity__Group_3__0 )? )
            // InternalUlmDsl2.g:1980:2: ( rule__Entity__Group_3__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_3()); 
            // InternalUlmDsl2.g:1981:2: ( rule__Entity__Group_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==30) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalUlmDsl2.g:1981:3: rule__Entity__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_3()); 

            }


            }

        }
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
    // InternalUlmDsl2.g:1989:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:1993:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // InternalUlmDsl2.g:1994:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
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
    // InternalUlmDsl2.g:2001:1: rule__Entity__Group__4__Impl : ( '{' ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2005:1: ( ( '{' ) )
            // InternalUlmDsl2.g:2006:1: ( '{' )
            {
            // InternalUlmDsl2.g:2006:1: ( '{' )
            // InternalUlmDsl2.g:2007:2: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
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
    // InternalUlmDsl2.g:2016:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl rule__Entity__Group__6 ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2020:1: ( rule__Entity__Group__5__Impl rule__Entity__Group__6 )
            // InternalUlmDsl2.g:2021:2: rule__Entity__Group__5__Impl rule__Entity__Group__6
            {
            pushFollow(FOLLOW_21);
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
    // InternalUlmDsl2.g:2028:1: rule__Entity__Group__5__Impl : ( ( rule__Entity__FeaturesAssignment_5 )* ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2032:1: ( ( ( rule__Entity__FeaturesAssignment_5 )* ) )
            // InternalUlmDsl2.g:2033:1: ( ( rule__Entity__FeaturesAssignment_5 )* )
            {
            // InternalUlmDsl2.g:2033:1: ( ( rule__Entity__FeaturesAssignment_5 )* )
            // InternalUlmDsl2.g:2034:2: ( rule__Entity__FeaturesAssignment_5 )*
            {
             before(grammarAccess.getEntityAccess().getFeaturesAssignment_5()); 
            // InternalUlmDsl2.g:2035:2: ( rule__Entity__FeaturesAssignment_5 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID||LA20_0==33) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalUlmDsl2.g:2035:3: rule__Entity__FeaturesAssignment_5
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Entity__FeaturesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getFeaturesAssignment_5()); 

            }


            }

        }
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
    // InternalUlmDsl2.g:2043:1: rule__Entity__Group__6 : rule__Entity__Group__6__Impl ;
    public final void rule__Entity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2047:1: ( rule__Entity__Group__6__Impl )
            // InternalUlmDsl2.g:2048:2: rule__Entity__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__6__Impl();

            state._fsp--;


            }

        }
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
    // InternalUlmDsl2.g:2054:1: rule__Entity__Group__6__Impl : ( '}' ) ;
    public final void rule__Entity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2058:1: ( ( '}' ) )
            // InternalUlmDsl2.g:2059:1: ( '}' )
            {
            // InternalUlmDsl2.g:2059:1: ( '}' )
            // InternalUlmDsl2.g:2060:2: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__Entity__Group_3__0"
    // InternalUlmDsl2.g:2070:1: rule__Entity__Group_3__0 : rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1 ;
    public final void rule__Entity__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2074:1: ( rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1 )
            // InternalUlmDsl2.g:2075:2: rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Entity__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_3__0"


    // $ANTLR start "rule__Entity__Group_3__0__Impl"
    // InternalUlmDsl2.g:2082:1: rule__Entity__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__Entity__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2086:1: ( ( 'extends' ) )
            // InternalUlmDsl2.g:2087:1: ( 'extends' )
            {
            // InternalUlmDsl2.g:2087:1: ( 'extends' )
            // InternalUlmDsl2.g:2088:2: 'extends'
            {
             before(grammarAccess.getEntityAccess().getExtendsKeyword_3_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getExtendsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_3__0__Impl"


    // $ANTLR start "rule__Entity__Group_3__1"
    // InternalUlmDsl2.g:2097:1: rule__Entity__Group_3__1 : rule__Entity__Group_3__1__Impl ;
    public final void rule__Entity__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2101:1: ( rule__Entity__Group_3__1__Impl )
            // InternalUlmDsl2.g:2102:2: rule__Entity__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_3__1"


    // $ANTLR start "rule__Entity__Group_3__1__Impl"
    // InternalUlmDsl2.g:2108:1: rule__Entity__Group_3__1__Impl : ( ( rule__Entity__SuperTypeAssignment_3_1 ) ) ;
    public final void rule__Entity__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2112:1: ( ( ( rule__Entity__SuperTypeAssignment_3_1 ) ) )
            // InternalUlmDsl2.g:2113:1: ( ( rule__Entity__SuperTypeAssignment_3_1 ) )
            {
            // InternalUlmDsl2.g:2113:1: ( ( rule__Entity__SuperTypeAssignment_3_1 ) )
            // InternalUlmDsl2.g:2114:2: ( rule__Entity__SuperTypeAssignment_3_1 )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeAssignment_3_1()); 
            // InternalUlmDsl2.g:2115:2: ( rule__Entity__SuperTypeAssignment_3_1 )
            // InternalUlmDsl2.g:2115:3: rule__Entity__SuperTypeAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__SuperTypeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getSuperTypeAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_3__1__Impl"


    // $ANTLR start "rule__Feature__Group__0"
    // InternalUlmDsl2.g:2124:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2128:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // InternalUlmDsl2.g:2129:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalUlmDsl2.g:2136:1: rule__Feature__Group__0__Impl : ( ( rule__Feature__TypeAssignment_0 ) ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2140:1: ( ( ( rule__Feature__TypeAssignment_0 ) ) )
            // InternalUlmDsl2.g:2141:1: ( ( rule__Feature__TypeAssignment_0 ) )
            {
            // InternalUlmDsl2.g:2141:1: ( ( rule__Feature__TypeAssignment_0 ) )
            // InternalUlmDsl2.g:2142:2: ( rule__Feature__TypeAssignment_0 )
            {
             before(grammarAccess.getFeatureAccess().getTypeAssignment_0()); 
            // InternalUlmDsl2.g:2143:2: ( rule__Feature__TypeAssignment_0 )
            // InternalUlmDsl2.g:2143:3: rule__Feature__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Feature__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getTypeAssignment_0()); 

            }


            }

        }
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
    // InternalUlmDsl2.g:2151:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2155:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // InternalUlmDsl2.g:2156:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalUlmDsl2.g:2163:1: rule__Feature__Group__1__Impl : ( ( rule__Feature__MandatoryAssignment_1 )? ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2167:1: ( ( ( rule__Feature__MandatoryAssignment_1 )? ) )
            // InternalUlmDsl2.g:2168:1: ( ( rule__Feature__MandatoryAssignment_1 )? )
            {
            // InternalUlmDsl2.g:2168:1: ( ( rule__Feature__MandatoryAssignment_1 )? )
            // InternalUlmDsl2.g:2169:2: ( rule__Feature__MandatoryAssignment_1 )?
            {
             before(grammarAccess.getFeatureAccess().getMandatoryAssignment_1()); 
            // InternalUlmDsl2.g:2170:2: ( rule__Feature__MandatoryAssignment_1 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==42) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalUlmDsl2.g:2170:3: rule__Feature__MandatoryAssignment_1
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
    // InternalUlmDsl2.g:2178:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl rule__Feature__Group__3 ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2182:1: ( rule__Feature__Group__2__Impl rule__Feature__Group__3 )
            // InternalUlmDsl2.g:2183:2: rule__Feature__Group__2__Impl rule__Feature__Group__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalUlmDsl2.g:2190:1: rule__Feature__Group__2__Impl : ( ( rule__Feature__IdentifierAssignment_2 )? ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2194:1: ( ( ( rule__Feature__IdentifierAssignment_2 )? ) )
            // InternalUlmDsl2.g:2195:1: ( ( rule__Feature__IdentifierAssignment_2 )? )
            {
            // InternalUlmDsl2.g:2195:1: ( ( rule__Feature__IdentifierAssignment_2 )? )
            // InternalUlmDsl2.g:2196:2: ( rule__Feature__IdentifierAssignment_2 )?
            {
             before(grammarAccess.getFeatureAccess().getIdentifierAssignment_2()); 
            // InternalUlmDsl2.g:2197:2: ( rule__Feature__IdentifierAssignment_2 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==43) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalUlmDsl2.g:2197:3: rule__Feature__IdentifierAssignment_2
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
    // InternalUlmDsl2.g:2205:1: rule__Feature__Group__3 : rule__Feature__Group__3__Impl rule__Feature__Group__4 ;
    public final void rule__Feature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2209:1: ( rule__Feature__Group__3__Impl rule__Feature__Group__4 )
            // InternalUlmDsl2.g:2210:2: rule__Feature__Group__3__Impl rule__Feature__Group__4
            {
            pushFollow(FOLLOW_23);
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
    // InternalUlmDsl2.g:2217:1: rule__Feature__Group__3__Impl : ( ( rule__Feature__Group_3__0 )? ) ;
    public final void rule__Feature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2221:1: ( ( ( rule__Feature__Group_3__0 )? ) )
            // InternalUlmDsl2.g:2222:1: ( ( rule__Feature__Group_3__0 )? )
            {
            // InternalUlmDsl2.g:2222:1: ( ( rule__Feature__Group_3__0 )? )
            // InternalUlmDsl2.g:2223:2: ( rule__Feature__Group_3__0 )?
            {
             before(grammarAccess.getFeatureAccess().getGroup_3()); 
            // InternalUlmDsl2.g:2224:2: ( rule__Feature__Group_3__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==31) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalUlmDsl2.g:2224:3: rule__Feature__Group_3__0
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
    // InternalUlmDsl2.g:2232:1: rule__Feature__Group__4 : rule__Feature__Group__4__Impl ;
    public final void rule__Feature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2236:1: ( rule__Feature__Group__4__Impl )
            // InternalUlmDsl2.g:2237:2: rule__Feature__Group__4__Impl
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
    // InternalUlmDsl2.g:2243:1: rule__Feature__Group__4__Impl : ( ';' ) ;
    public final void rule__Feature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2247:1: ( ( ';' ) )
            // InternalUlmDsl2.g:2248:1: ( ';' )
            {
            // InternalUlmDsl2.g:2248:1: ( ';' )
            // InternalUlmDsl2.g:2249:2: ';'
            {
             before(grammarAccess.getFeatureAccess().getSemicolonKeyword_4()); 
            match(input,27,FOLLOW_2); 
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
    // InternalUlmDsl2.g:2259:1: rule__Feature__Group_3__0 : rule__Feature__Group_3__0__Impl rule__Feature__Group_3__1 ;
    public final void rule__Feature__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2263:1: ( rule__Feature__Group_3__0__Impl rule__Feature__Group_3__1 )
            // InternalUlmDsl2.g:2264:2: rule__Feature__Group_3__0__Impl rule__Feature__Group_3__1
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
    // InternalUlmDsl2.g:2271:1: rule__Feature__Group_3__0__Impl : ( 'as' ) ;
    public final void rule__Feature__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2275:1: ( ( 'as' ) )
            // InternalUlmDsl2.g:2276:1: ( 'as' )
            {
            // InternalUlmDsl2.g:2276:1: ( 'as' )
            // InternalUlmDsl2.g:2277:2: 'as'
            {
             before(grammarAccess.getFeatureAccess().getAsKeyword_3_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalUlmDsl2.g:2286:1: rule__Feature__Group_3__1 : rule__Feature__Group_3__1__Impl ;
    public final void rule__Feature__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2290:1: ( rule__Feature__Group_3__1__Impl )
            // InternalUlmDsl2.g:2291:2: rule__Feature__Group_3__1__Impl
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
    // InternalUlmDsl2.g:2297:1: rule__Feature__Group_3__1__Impl : ( ( rule__Feature__NameAssignment_3_1 ) ) ;
    public final void rule__Feature__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2301:1: ( ( ( rule__Feature__NameAssignment_3_1 ) ) )
            // InternalUlmDsl2.g:2302:1: ( ( rule__Feature__NameAssignment_3_1 ) )
            {
            // InternalUlmDsl2.g:2302:1: ( ( rule__Feature__NameAssignment_3_1 ) )
            // InternalUlmDsl2.g:2303:2: ( rule__Feature__NameAssignment_3_1 )
            {
             before(grammarAccess.getFeatureAccess().getNameAssignment_3_1()); 
            // InternalUlmDsl2.g:2304:2: ( rule__Feature__NameAssignment_3_1 )
            // InternalUlmDsl2.g:2304:3: rule__Feature__NameAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Feature__NameAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getNameAssignment_3_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__AttributeFeatureType__Group__0"
    // InternalUlmDsl2.g:2313:1: rule__AttributeFeatureType__Group__0 : rule__AttributeFeatureType__Group__0__Impl rule__AttributeFeatureType__Group__1 ;
    public final void rule__AttributeFeatureType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2317:1: ( rule__AttributeFeatureType__Group__0__Impl rule__AttributeFeatureType__Group__1 )
            // InternalUlmDsl2.g:2318:2: rule__AttributeFeatureType__Group__0__Impl rule__AttributeFeatureType__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalUlmDsl2.g:2325:1: rule__AttributeFeatureType__Group__0__Impl : ( ( rule__AttributeFeatureType__AttributeAssignment_0 ) ) ;
    public final void rule__AttributeFeatureType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2329:1: ( ( ( rule__AttributeFeatureType__AttributeAssignment_0 ) ) )
            // InternalUlmDsl2.g:2330:1: ( ( rule__AttributeFeatureType__AttributeAssignment_0 ) )
            {
            // InternalUlmDsl2.g:2330:1: ( ( rule__AttributeFeatureType__AttributeAssignment_0 ) )
            // InternalUlmDsl2.g:2331:2: ( rule__AttributeFeatureType__AttributeAssignment_0 )
            {
             before(grammarAccess.getAttributeFeatureTypeAccess().getAttributeAssignment_0()); 
            // InternalUlmDsl2.g:2332:2: ( rule__AttributeFeatureType__AttributeAssignment_0 )
            // InternalUlmDsl2.g:2332:3: rule__AttributeFeatureType__AttributeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeFeatureType__AttributeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeFeatureTypeAccess().getAttributeAssignment_0()); 

            }


            }

        }
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
    // InternalUlmDsl2.g:2340:1: rule__AttributeFeatureType__Group__1 : rule__AttributeFeatureType__Group__1__Impl ;
    public final void rule__AttributeFeatureType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2344:1: ( rule__AttributeFeatureType__Group__1__Impl )
            // InternalUlmDsl2.g:2345:2: rule__AttributeFeatureType__Group__1__Impl
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
    // InternalUlmDsl2.g:2351:1: rule__AttributeFeatureType__Group__1__Impl : ( ( rule__AttributeFeatureType__Group_1__0 )? ) ;
    public final void rule__AttributeFeatureType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2355:1: ( ( ( rule__AttributeFeatureType__Group_1__0 )? ) )
            // InternalUlmDsl2.g:2356:1: ( ( rule__AttributeFeatureType__Group_1__0 )? )
            {
            // InternalUlmDsl2.g:2356:1: ( ( rule__AttributeFeatureType__Group_1__0 )? )
            // InternalUlmDsl2.g:2357:2: ( rule__AttributeFeatureType__Group_1__0 )?
            {
             before(grammarAccess.getAttributeFeatureTypeAccess().getGroup_1()); 
            // InternalUlmDsl2.g:2358:2: ( rule__AttributeFeatureType__Group_1__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==32) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalUlmDsl2.g:2358:3: rule__AttributeFeatureType__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributeFeatureType__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeFeatureTypeAccess().getGroup_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__AttributeFeatureType__Group_1__0"
    // InternalUlmDsl2.g:2367:1: rule__AttributeFeatureType__Group_1__0 : rule__AttributeFeatureType__Group_1__0__Impl rule__AttributeFeatureType__Group_1__1 ;
    public final void rule__AttributeFeatureType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2371:1: ( rule__AttributeFeatureType__Group_1__0__Impl rule__AttributeFeatureType__Group_1__1 )
            // InternalUlmDsl2.g:2372:2: rule__AttributeFeatureType__Group_1__0__Impl rule__AttributeFeatureType__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__AttributeFeatureType__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeFeatureType__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeFeatureType__Group_1__0"


    // $ANTLR start "rule__AttributeFeatureType__Group_1__0__Impl"
    // InternalUlmDsl2.g:2379:1: rule__AttributeFeatureType__Group_1__0__Impl : ( 'bounded' ) ;
    public final void rule__AttributeFeatureType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2383:1: ( ( 'bounded' ) )
            // InternalUlmDsl2.g:2384:1: ( 'bounded' )
            {
            // InternalUlmDsl2.g:2384:1: ( 'bounded' )
            // InternalUlmDsl2.g:2385:2: 'bounded'
            {
             before(grammarAccess.getAttributeFeatureTypeAccess().getBoundedKeyword_1_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getAttributeFeatureTypeAccess().getBoundedKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeFeatureType__Group_1__0__Impl"


    // $ANTLR start "rule__AttributeFeatureType__Group_1__1"
    // InternalUlmDsl2.g:2394:1: rule__AttributeFeatureType__Group_1__1 : rule__AttributeFeatureType__Group_1__1__Impl ;
    public final void rule__AttributeFeatureType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2398:1: ( rule__AttributeFeatureType__Group_1__1__Impl )
            // InternalUlmDsl2.g:2399:2: rule__AttributeFeatureType__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeFeatureType__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeFeatureType__Group_1__1"


    // $ANTLR start "rule__AttributeFeatureType__Group_1__1__Impl"
    // InternalUlmDsl2.g:2405:1: rule__AttributeFeatureType__Group_1__1__Impl : ( ( rule__AttributeFeatureType__LookupAssignment_1_1 ) ) ;
    public final void rule__AttributeFeatureType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2409:1: ( ( ( rule__AttributeFeatureType__LookupAssignment_1_1 ) ) )
            // InternalUlmDsl2.g:2410:1: ( ( rule__AttributeFeatureType__LookupAssignment_1_1 ) )
            {
            // InternalUlmDsl2.g:2410:1: ( ( rule__AttributeFeatureType__LookupAssignment_1_1 ) )
            // InternalUlmDsl2.g:2411:2: ( rule__AttributeFeatureType__LookupAssignment_1_1 )
            {
             before(grammarAccess.getAttributeFeatureTypeAccess().getLookupAssignment_1_1()); 
            // InternalUlmDsl2.g:2412:2: ( rule__AttributeFeatureType__LookupAssignment_1_1 )
            // InternalUlmDsl2.g:2412:3: rule__AttributeFeatureType__LookupAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AttributeFeatureType__LookupAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeFeatureTypeAccess().getLookupAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeFeatureType__Group_1__1__Impl"


    // $ANTLR start "rule__EntityFeatureType__Group__0"
    // InternalUlmDsl2.g:2421:1: rule__EntityFeatureType__Group__0 : rule__EntityFeatureType__Group__0__Impl rule__EntityFeatureType__Group__1 ;
    public final void rule__EntityFeatureType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2425:1: ( rule__EntityFeatureType__Group__0__Impl rule__EntityFeatureType__Group__1 )
            // InternalUlmDsl2.g:2426:2: rule__EntityFeatureType__Group__0__Impl rule__EntityFeatureType__Group__1
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
    // InternalUlmDsl2.g:2433:1: rule__EntityFeatureType__Group__0__Impl : ( 'references' ) ;
    public final void rule__EntityFeatureType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2437:1: ( ( 'references' ) )
            // InternalUlmDsl2.g:2438:1: ( 'references' )
            {
            // InternalUlmDsl2.g:2438:1: ( 'references' )
            // InternalUlmDsl2.g:2439:2: 'references'
            {
             before(grammarAccess.getEntityFeatureTypeAccess().getReferencesKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getEntityFeatureTypeAccess().getReferencesKeyword_0()); 

            }


            }

        }
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
    // InternalUlmDsl2.g:2448:1: rule__EntityFeatureType__Group__1 : rule__EntityFeatureType__Group__1__Impl rule__EntityFeatureType__Group__2 ;
    public final void rule__EntityFeatureType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2452:1: ( rule__EntityFeatureType__Group__1__Impl rule__EntityFeatureType__Group__2 )
            // InternalUlmDsl2.g:2453:2: rule__EntityFeatureType__Group__1__Impl rule__EntityFeatureType__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__EntityFeatureType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntityFeatureType__Group__2();

            state._fsp--;


            }

        }
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
    // InternalUlmDsl2.g:2460:1: rule__EntityFeatureType__Group__1__Impl : ( ( rule__EntityFeatureType__EntityAssignment_1 ) ) ;
    public final void rule__EntityFeatureType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2464:1: ( ( ( rule__EntityFeatureType__EntityAssignment_1 ) ) )
            // InternalUlmDsl2.g:2465:1: ( ( rule__EntityFeatureType__EntityAssignment_1 ) )
            {
            // InternalUlmDsl2.g:2465:1: ( ( rule__EntityFeatureType__EntityAssignment_1 ) )
            // InternalUlmDsl2.g:2466:2: ( rule__EntityFeatureType__EntityAssignment_1 )
            {
             before(grammarAccess.getEntityFeatureTypeAccess().getEntityAssignment_1()); 
            // InternalUlmDsl2.g:2467:2: ( rule__EntityFeatureType__EntityAssignment_1 )
            // InternalUlmDsl2.g:2467:3: rule__EntityFeatureType__EntityAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EntityFeatureType__EntityAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityFeatureTypeAccess().getEntityAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__EntityFeatureType__Group__2"
    // InternalUlmDsl2.g:2475:1: rule__EntityFeatureType__Group__2 : rule__EntityFeatureType__Group__2__Impl ;
    public final void rule__EntityFeatureType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2479:1: ( rule__EntityFeatureType__Group__2__Impl )
            // InternalUlmDsl2.g:2480:2: rule__EntityFeatureType__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EntityFeatureType__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityFeatureType__Group__2"


    // $ANTLR start "rule__EntityFeatureType__Group__2__Impl"
    // InternalUlmDsl2.g:2486:1: rule__EntityFeatureType__Group__2__Impl : ( ( rule__EntityFeatureType__Group_2__0 )? ) ;
    public final void rule__EntityFeatureType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2490:1: ( ( ( rule__EntityFeatureType__Group_2__0 )? ) )
            // InternalUlmDsl2.g:2491:1: ( ( rule__EntityFeatureType__Group_2__0 )? )
            {
            // InternalUlmDsl2.g:2491:1: ( ( rule__EntityFeatureType__Group_2__0 )? )
            // InternalUlmDsl2.g:2492:2: ( rule__EntityFeatureType__Group_2__0 )?
            {
             before(grammarAccess.getEntityFeatureTypeAccess().getGroup_2()); 
            // InternalUlmDsl2.g:2493:2: ( rule__EntityFeatureType__Group_2__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==40) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalUlmDsl2.g:2493:3: rule__EntityFeatureType__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EntityFeatureType__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityFeatureTypeAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityFeatureType__Group__2__Impl"


    // $ANTLR start "rule__EntityFeatureType__Group_2__0"
    // InternalUlmDsl2.g:2502:1: rule__EntityFeatureType__Group_2__0 : rule__EntityFeatureType__Group_2__0__Impl rule__EntityFeatureType__Group_2__1 ;
    public final void rule__EntityFeatureType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2506:1: ( rule__EntityFeatureType__Group_2__0__Impl rule__EntityFeatureType__Group_2__1 )
            // InternalUlmDsl2.g:2507:2: rule__EntityFeatureType__Group_2__0__Impl rule__EntityFeatureType__Group_2__1
            {
            pushFollow(FOLLOW_25);
            rule__EntityFeatureType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntityFeatureType__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityFeatureType__Group_2__0"


    // $ANTLR start "rule__EntityFeatureType__Group_2__0__Impl"
    // InternalUlmDsl2.g:2514:1: rule__EntityFeatureType__Group_2__0__Impl : ( ( rule__EntityFeatureType__ArrayAssignment_2_0 ) ) ;
    public final void rule__EntityFeatureType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2518:1: ( ( ( rule__EntityFeatureType__ArrayAssignment_2_0 ) ) )
            // InternalUlmDsl2.g:2519:1: ( ( rule__EntityFeatureType__ArrayAssignment_2_0 ) )
            {
            // InternalUlmDsl2.g:2519:1: ( ( rule__EntityFeatureType__ArrayAssignment_2_0 ) )
            // InternalUlmDsl2.g:2520:2: ( rule__EntityFeatureType__ArrayAssignment_2_0 )
            {
             before(grammarAccess.getEntityFeatureTypeAccess().getArrayAssignment_2_0()); 
            // InternalUlmDsl2.g:2521:2: ( rule__EntityFeatureType__ArrayAssignment_2_0 )
            // InternalUlmDsl2.g:2521:3: rule__EntityFeatureType__ArrayAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__EntityFeatureType__ArrayAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getEntityFeatureTypeAccess().getArrayAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityFeatureType__Group_2__0__Impl"


    // $ANTLR start "rule__EntityFeatureType__Group_2__1"
    // InternalUlmDsl2.g:2529:1: rule__EntityFeatureType__Group_2__1 : rule__EntityFeatureType__Group_2__1__Impl rule__EntityFeatureType__Group_2__2 ;
    public final void rule__EntityFeatureType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2533:1: ( rule__EntityFeatureType__Group_2__1__Impl rule__EntityFeatureType__Group_2__2 )
            // InternalUlmDsl2.g:2534:2: rule__EntityFeatureType__Group_2__1__Impl rule__EntityFeatureType__Group_2__2
            {
            pushFollow(FOLLOW_25);
            rule__EntityFeatureType__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntityFeatureType__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityFeatureType__Group_2__1"


    // $ANTLR start "rule__EntityFeatureType__Group_2__1__Impl"
    // InternalUlmDsl2.g:2541:1: rule__EntityFeatureType__Group_2__1__Impl : ( ( rule__EntityFeatureType__LengthAssignment_2_1 )? ) ;
    public final void rule__EntityFeatureType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2545:1: ( ( ( rule__EntityFeatureType__LengthAssignment_2_1 )? ) )
            // InternalUlmDsl2.g:2546:1: ( ( rule__EntityFeatureType__LengthAssignment_2_1 )? )
            {
            // InternalUlmDsl2.g:2546:1: ( ( rule__EntityFeatureType__LengthAssignment_2_1 )? )
            // InternalUlmDsl2.g:2547:2: ( rule__EntityFeatureType__LengthAssignment_2_1 )?
            {
             before(grammarAccess.getEntityFeatureTypeAccess().getLengthAssignment_2_1()); 
            // InternalUlmDsl2.g:2548:2: ( rule__EntityFeatureType__LengthAssignment_2_1 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_INT) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalUlmDsl2.g:2548:3: rule__EntityFeatureType__LengthAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__EntityFeatureType__LengthAssignment_2_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityFeatureTypeAccess().getLengthAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityFeatureType__Group_2__1__Impl"


    // $ANTLR start "rule__EntityFeatureType__Group_2__2"
    // InternalUlmDsl2.g:2556:1: rule__EntityFeatureType__Group_2__2 : rule__EntityFeatureType__Group_2__2__Impl ;
    public final void rule__EntityFeatureType__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2560:1: ( rule__EntityFeatureType__Group_2__2__Impl )
            // InternalUlmDsl2.g:2561:2: rule__EntityFeatureType__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EntityFeatureType__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityFeatureType__Group_2__2"


    // $ANTLR start "rule__EntityFeatureType__Group_2__2__Impl"
    // InternalUlmDsl2.g:2567:1: rule__EntityFeatureType__Group_2__2__Impl : ( ']' ) ;
    public final void rule__EntityFeatureType__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2571:1: ( ( ']' ) )
            // InternalUlmDsl2.g:2572:1: ( ']' )
            {
            // InternalUlmDsl2.g:2572:1: ( ']' )
            // InternalUlmDsl2.g:2573:2: ']'
            {
             before(grammarAccess.getEntityFeatureTypeAccess().getRightSquareBracketKeyword_2_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getEntityFeatureTypeAccess().getRightSquareBracketKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityFeatureType__Group_2__2__Impl"


    // $ANTLR start "rule__Lookup__Group__0"
    // InternalUlmDsl2.g:2583:1: rule__Lookup__Group__0 : rule__Lookup__Group__0__Impl rule__Lookup__Group__1 ;
    public final void rule__Lookup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2587:1: ( rule__Lookup__Group__0__Impl rule__Lookup__Group__1 )
            // InternalUlmDsl2.g:2588:2: rule__Lookup__Group__0__Impl rule__Lookup__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalUlmDsl2.g:2595:1: rule__Lookup__Group__0__Impl : ( ( rule__Lookup__NameAssignment_0 ) ) ;
    public final void rule__Lookup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2599:1: ( ( ( rule__Lookup__NameAssignment_0 ) ) )
            // InternalUlmDsl2.g:2600:1: ( ( rule__Lookup__NameAssignment_0 ) )
            {
            // InternalUlmDsl2.g:2600:1: ( ( rule__Lookup__NameAssignment_0 ) )
            // InternalUlmDsl2.g:2601:2: ( rule__Lookup__NameAssignment_0 )
            {
             before(grammarAccess.getLookupAccess().getNameAssignment_0()); 
            // InternalUlmDsl2.g:2602:2: ( rule__Lookup__NameAssignment_0 )
            // InternalUlmDsl2.g:2602:3: rule__Lookup__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Lookup__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLookupAccess().getNameAssignment_0()); 

            }


            }

        }
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
    // InternalUlmDsl2.g:2610:1: rule__Lookup__Group__1 : rule__Lookup__Group__1__Impl ;
    public final void rule__Lookup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2614:1: ( rule__Lookup__Group__1__Impl )
            // InternalUlmDsl2.g:2615:2: rule__Lookup__Group__1__Impl
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
    // InternalUlmDsl2.g:2621:1: rule__Lookup__Group__1__Impl : ( ( rule__Lookup__TypeAssignment_1 ) ) ;
    public final void rule__Lookup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2625:1: ( ( ( rule__Lookup__TypeAssignment_1 ) ) )
            // InternalUlmDsl2.g:2626:1: ( ( rule__Lookup__TypeAssignment_1 ) )
            {
            // InternalUlmDsl2.g:2626:1: ( ( rule__Lookup__TypeAssignment_1 ) )
            // InternalUlmDsl2.g:2627:2: ( rule__Lookup__TypeAssignment_1 )
            {
             before(grammarAccess.getLookupAccess().getTypeAssignment_1()); 
            // InternalUlmDsl2.g:2628:2: ( rule__Lookup__TypeAssignment_1 )
            // InternalUlmDsl2.g:2628:3: rule__Lookup__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Lookup__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLookupAccess().getTypeAssignment_1()); 

            }


            }

        }
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
    // InternalUlmDsl2.g:2637:1: rule__LookupInt__Group__0 : rule__LookupInt__Group__0__Impl rule__LookupInt__Group__1 ;
    public final void rule__LookupInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2641:1: ( rule__LookupInt__Group__0__Impl rule__LookupInt__Group__1 )
            // InternalUlmDsl2.g:2642:2: rule__LookupInt__Group__0__Impl rule__LookupInt__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalUlmDsl2.g:2649:1: rule__LookupInt__Group__0__Impl : ( 'integer' ) ;
    public final void rule__LookupInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2653:1: ( ( 'integer' ) )
            // InternalUlmDsl2.g:2654:1: ( 'integer' )
            {
            // InternalUlmDsl2.g:2654:1: ( 'integer' )
            // InternalUlmDsl2.g:2655:2: 'integer'
            {
             before(grammarAccess.getLookupIntAccess().getIntegerKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalUlmDsl2.g:2664:1: rule__LookupInt__Group__1 : rule__LookupInt__Group__1__Impl rule__LookupInt__Group__2 ;
    public final void rule__LookupInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2668:1: ( rule__LookupInt__Group__1__Impl rule__LookupInt__Group__2 )
            // InternalUlmDsl2.g:2669:2: rule__LookupInt__Group__1__Impl rule__LookupInt__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalUlmDsl2.g:2676:1: rule__LookupInt__Group__1__Impl : ( ( rule__LookupInt__DescriptionAssignment_1 )? ) ;
    public final void rule__LookupInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2680:1: ( ( ( rule__LookupInt__DescriptionAssignment_1 )? ) )
            // InternalUlmDsl2.g:2681:1: ( ( rule__LookupInt__DescriptionAssignment_1 )? )
            {
            // InternalUlmDsl2.g:2681:1: ( ( rule__LookupInt__DescriptionAssignment_1 )? )
            // InternalUlmDsl2.g:2682:2: ( rule__LookupInt__DescriptionAssignment_1 )?
            {
             before(grammarAccess.getLookupIntAccess().getDescriptionAssignment_1()); 
            // InternalUlmDsl2.g:2683:2: ( rule__LookupInt__DescriptionAssignment_1 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_STRING) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalUlmDsl2.g:2683:3: rule__LookupInt__DescriptionAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__LookupInt__DescriptionAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLookupIntAccess().getDescriptionAssignment_1()); 

            }


            }

        }
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
    // InternalUlmDsl2.g:2691:1: rule__LookupInt__Group__2 : rule__LookupInt__Group__2__Impl rule__LookupInt__Group__3 ;
    public final void rule__LookupInt__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2695:1: ( rule__LookupInt__Group__2__Impl rule__LookupInt__Group__3 )
            // InternalUlmDsl2.g:2696:2: rule__LookupInt__Group__2__Impl rule__LookupInt__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalUlmDsl2.g:2703:1: rule__LookupInt__Group__2__Impl : ( 'values' ) ;
    public final void rule__LookupInt__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2707:1: ( ( 'values' ) )
            // InternalUlmDsl2.g:2708:1: ( 'values' )
            {
            // InternalUlmDsl2.g:2708:1: ( 'values' )
            // InternalUlmDsl2.g:2709:2: 'values'
            {
             before(grammarAccess.getLookupIntAccess().getValuesKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getLookupIntAccess().getValuesKeyword_2()); 

            }


            }

        }
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
    // InternalUlmDsl2.g:2718:1: rule__LookupInt__Group__3 : rule__LookupInt__Group__3__Impl rule__LookupInt__Group__4 ;
    public final void rule__LookupInt__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2722:1: ( rule__LookupInt__Group__3__Impl rule__LookupInt__Group__4 )
            // InternalUlmDsl2.g:2723:2: rule__LookupInt__Group__3__Impl rule__LookupInt__Group__4
            {
            pushFollow(FOLLOW_28);
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
    // InternalUlmDsl2.g:2730:1: rule__LookupInt__Group__3__Impl : ( '{' ) ;
    public final void rule__LookupInt__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2734:1: ( ( '{' ) )
            // InternalUlmDsl2.g:2735:1: ( '{' )
            {
            // InternalUlmDsl2.g:2735:1: ( '{' )
            // InternalUlmDsl2.g:2736:2: '{'
            {
             before(grammarAccess.getLookupIntAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getLookupIntAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
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
    // InternalUlmDsl2.g:2745:1: rule__LookupInt__Group__4 : rule__LookupInt__Group__4__Impl rule__LookupInt__Group__5 ;
    public final void rule__LookupInt__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2749:1: ( rule__LookupInt__Group__4__Impl rule__LookupInt__Group__5 )
            // InternalUlmDsl2.g:2750:2: rule__LookupInt__Group__4__Impl rule__LookupInt__Group__5
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
    // InternalUlmDsl2.g:2757:1: rule__LookupInt__Group__4__Impl : ( ( rule__LookupInt__ValuesAssignment_4 ) ) ;
    public final void rule__LookupInt__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2761:1: ( ( ( rule__LookupInt__ValuesAssignment_4 ) ) )
            // InternalUlmDsl2.g:2762:1: ( ( rule__LookupInt__ValuesAssignment_4 ) )
            {
            // InternalUlmDsl2.g:2762:1: ( ( rule__LookupInt__ValuesAssignment_4 ) )
            // InternalUlmDsl2.g:2763:2: ( rule__LookupInt__ValuesAssignment_4 )
            {
             before(grammarAccess.getLookupIntAccess().getValuesAssignment_4()); 
            // InternalUlmDsl2.g:2764:2: ( rule__LookupInt__ValuesAssignment_4 )
            // InternalUlmDsl2.g:2764:3: rule__LookupInt__ValuesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__LookupInt__ValuesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLookupIntAccess().getValuesAssignment_4()); 

            }


            }

        }
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
    // InternalUlmDsl2.g:2772:1: rule__LookupInt__Group__5 : rule__LookupInt__Group__5__Impl rule__LookupInt__Group__6 ;
    public final void rule__LookupInt__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2776:1: ( rule__LookupInt__Group__5__Impl rule__LookupInt__Group__6 )
            // InternalUlmDsl2.g:2777:2: rule__LookupInt__Group__5__Impl rule__LookupInt__Group__6
            {
            pushFollow(FOLLOW_29);
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
    // InternalUlmDsl2.g:2784:1: rule__LookupInt__Group__5__Impl : ( ( rule__LookupInt__Group_5__0 )* ) ;
    public final void rule__LookupInt__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2788:1: ( ( ( rule__LookupInt__Group_5__0 )* ) )
            // InternalUlmDsl2.g:2789:1: ( ( rule__LookupInt__Group_5__0 )* )
            {
            // InternalUlmDsl2.g:2789:1: ( ( rule__LookupInt__Group_5__0 )* )
            // InternalUlmDsl2.g:2790:2: ( rule__LookupInt__Group_5__0 )*
            {
             before(grammarAccess.getLookupIntAccess().getGroup_5()); 
            // InternalUlmDsl2.g:2791:2: ( rule__LookupInt__Group_5__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==29) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalUlmDsl2.g:2791:3: rule__LookupInt__Group_5__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__LookupInt__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getLookupIntAccess().getGroup_5()); 

            }


            }

        }
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
    // InternalUlmDsl2.g:2799:1: rule__LookupInt__Group__6 : rule__LookupInt__Group__6__Impl rule__LookupInt__Group__7 ;
    public final void rule__LookupInt__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2803:1: ( rule__LookupInt__Group__6__Impl rule__LookupInt__Group__7 )
            // InternalUlmDsl2.g:2804:2: rule__LookupInt__Group__6__Impl rule__LookupInt__Group__7
            {
            pushFollow(FOLLOW_31);
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
    // InternalUlmDsl2.g:2811:1: rule__LookupInt__Group__6__Impl : ( '}' ) ;
    public final void rule__LookupInt__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2815:1: ( ( '}' ) )
            // InternalUlmDsl2.g:2816:1: ( '}' )
            {
            // InternalUlmDsl2.g:2816:1: ( '}' )
            // InternalUlmDsl2.g:2817:2: '}'
            {
             before(grammarAccess.getLookupIntAccess().getRightCurlyBracketKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getLookupIntAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
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
    // InternalUlmDsl2.g:2826:1: rule__LookupInt__Group__7 : rule__LookupInt__Group__7__Impl ;
    public final void rule__LookupInt__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2830:1: ( rule__LookupInt__Group__7__Impl )
            // InternalUlmDsl2.g:2831:2: rule__LookupInt__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LookupInt__Group__7__Impl();

            state._fsp--;


            }

        }
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
    // InternalUlmDsl2.g:2837:1: rule__LookupInt__Group__7__Impl : ( ';' ) ;
    public final void rule__LookupInt__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2841:1: ( ( ';' ) )
            // InternalUlmDsl2.g:2842:1: ( ';' )
            {
            // InternalUlmDsl2.g:2842:1: ( ';' )
            // InternalUlmDsl2.g:2843:2: ';'
            {
             before(grammarAccess.getLookupIntAccess().getSemicolonKeyword_7()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getLookupIntAccess().getSemicolonKeyword_7()); 

            }


            }

        }
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


    // $ANTLR start "rule__LookupInt__Group_5__0"
    // InternalUlmDsl2.g:2853:1: rule__LookupInt__Group_5__0 : rule__LookupInt__Group_5__0__Impl rule__LookupInt__Group_5__1 ;
    public final void rule__LookupInt__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2857:1: ( rule__LookupInt__Group_5__0__Impl rule__LookupInt__Group_5__1 )
            // InternalUlmDsl2.g:2858:2: rule__LookupInt__Group_5__0__Impl rule__LookupInt__Group_5__1
            {
            pushFollow(FOLLOW_28);
            rule__LookupInt__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LookupInt__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupInt__Group_5__0"


    // $ANTLR start "rule__LookupInt__Group_5__0__Impl"
    // InternalUlmDsl2.g:2865:1: rule__LookupInt__Group_5__0__Impl : ( ',' ) ;
    public final void rule__LookupInt__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2869:1: ( ( ',' ) )
            // InternalUlmDsl2.g:2870:1: ( ',' )
            {
            // InternalUlmDsl2.g:2870:1: ( ',' )
            // InternalUlmDsl2.g:2871:2: ','
            {
             before(grammarAccess.getLookupIntAccess().getCommaKeyword_5_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getLookupIntAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupInt__Group_5__0__Impl"


    // $ANTLR start "rule__LookupInt__Group_5__1"
    // InternalUlmDsl2.g:2880:1: rule__LookupInt__Group_5__1 : rule__LookupInt__Group_5__1__Impl ;
    public final void rule__LookupInt__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2884:1: ( rule__LookupInt__Group_5__1__Impl )
            // InternalUlmDsl2.g:2885:2: rule__LookupInt__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LookupInt__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupInt__Group_5__1"


    // $ANTLR start "rule__LookupInt__Group_5__1__Impl"
    // InternalUlmDsl2.g:2891:1: rule__LookupInt__Group_5__1__Impl : ( ( rule__LookupInt__ValuesAssignment_5_1 ) ) ;
    public final void rule__LookupInt__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2895:1: ( ( ( rule__LookupInt__ValuesAssignment_5_1 ) ) )
            // InternalUlmDsl2.g:2896:1: ( ( rule__LookupInt__ValuesAssignment_5_1 ) )
            {
            // InternalUlmDsl2.g:2896:1: ( ( rule__LookupInt__ValuesAssignment_5_1 ) )
            // InternalUlmDsl2.g:2897:2: ( rule__LookupInt__ValuesAssignment_5_1 )
            {
             before(grammarAccess.getLookupIntAccess().getValuesAssignment_5_1()); 
            // InternalUlmDsl2.g:2898:2: ( rule__LookupInt__ValuesAssignment_5_1 )
            // InternalUlmDsl2.g:2898:3: rule__LookupInt__ValuesAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__LookupInt__ValuesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getLookupIntAccess().getValuesAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupInt__Group_5__1__Impl"


    // $ANTLR start "rule__LookupString__Group__0"
    // InternalUlmDsl2.g:2907:1: rule__LookupString__Group__0 : rule__LookupString__Group__0__Impl rule__LookupString__Group__1 ;
    public final void rule__LookupString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2911:1: ( rule__LookupString__Group__0__Impl rule__LookupString__Group__1 )
            // InternalUlmDsl2.g:2912:2: rule__LookupString__Group__0__Impl rule__LookupString__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalUlmDsl2.g:2919:1: rule__LookupString__Group__0__Impl : ( 'string' ) ;
    public final void rule__LookupString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2923:1: ( ( 'string' ) )
            // InternalUlmDsl2.g:2924:1: ( 'string' )
            {
            // InternalUlmDsl2.g:2924:1: ( 'string' )
            // InternalUlmDsl2.g:2925:2: 'string'
            {
             before(grammarAccess.getLookupStringAccess().getStringKeyword_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalUlmDsl2.g:2934:1: rule__LookupString__Group__1 : rule__LookupString__Group__1__Impl rule__LookupString__Group__2 ;
    public final void rule__LookupString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2938:1: ( rule__LookupString__Group__1__Impl rule__LookupString__Group__2 )
            // InternalUlmDsl2.g:2939:2: rule__LookupString__Group__1__Impl rule__LookupString__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalUlmDsl2.g:2946:1: rule__LookupString__Group__1__Impl : ( ( rule__LookupString__DescriptionAssignment_1 )? ) ;
    public final void rule__LookupString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2950:1: ( ( ( rule__LookupString__DescriptionAssignment_1 )? ) )
            // InternalUlmDsl2.g:2951:1: ( ( rule__LookupString__DescriptionAssignment_1 )? )
            {
            // InternalUlmDsl2.g:2951:1: ( ( rule__LookupString__DescriptionAssignment_1 )? )
            // InternalUlmDsl2.g:2952:2: ( rule__LookupString__DescriptionAssignment_1 )?
            {
             before(grammarAccess.getLookupStringAccess().getDescriptionAssignment_1()); 
            // InternalUlmDsl2.g:2953:2: ( rule__LookupString__DescriptionAssignment_1 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_STRING) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalUlmDsl2.g:2953:3: rule__LookupString__DescriptionAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__LookupString__DescriptionAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLookupStringAccess().getDescriptionAssignment_1()); 

            }


            }

        }
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
    // InternalUlmDsl2.g:2961:1: rule__LookupString__Group__2 : rule__LookupString__Group__2__Impl rule__LookupString__Group__3 ;
    public final void rule__LookupString__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2965:1: ( rule__LookupString__Group__2__Impl rule__LookupString__Group__3 )
            // InternalUlmDsl2.g:2966:2: rule__LookupString__Group__2__Impl rule__LookupString__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalUlmDsl2.g:2973:1: rule__LookupString__Group__2__Impl : ( 'values' ) ;
    public final void rule__LookupString__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2977:1: ( ( 'values' ) )
            // InternalUlmDsl2.g:2978:1: ( 'values' )
            {
            // InternalUlmDsl2.g:2978:1: ( 'values' )
            // InternalUlmDsl2.g:2979:2: 'values'
            {
             before(grammarAccess.getLookupStringAccess().getValuesKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getLookupStringAccess().getValuesKeyword_2()); 

            }


            }

        }
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
    // InternalUlmDsl2.g:2988:1: rule__LookupString__Group__3 : rule__LookupString__Group__3__Impl rule__LookupString__Group__4 ;
    public final void rule__LookupString__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:2992:1: ( rule__LookupString__Group__3__Impl rule__LookupString__Group__4 )
            // InternalUlmDsl2.g:2993:2: rule__LookupString__Group__3__Impl rule__LookupString__Group__4
            {
            pushFollow(FOLLOW_28);
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
    // InternalUlmDsl2.g:3000:1: rule__LookupString__Group__3__Impl : ( '{' ) ;
    public final void rule__LookupString__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3004:1: ( ( '{' ) )
            // InternalUlmDsl2.g:3005:1: ( '{' )
            {
            // InternalUlmDsl2.g:3005:1: ( '{' )
            // InternalUlmDsl2.g:3006:2: '{'
            {
             before(grammarAccess.getLookupStringAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getLookupStringAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
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
    // InternalUlmDsl2.g:3015:1: rule__LookupString__Group__4 : rule__LookupString__Group__4__Impl rule__LookupString__Group__5 ;
    public final void rule__LookupString__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3019:1: ( rule__LookupString__Group__4__Impl rule__LookupString__Group__5 )
            // InternalUlmDsl2.g:3020:2: rule__LookupString__Group__4__Impl rule__LookupString__Group__5
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
    // InternalUlmDsl2.g:3027:1: rule__LookupString__Group__4__Impl : ( ( rule__LookupString__ValuesAssignment_4 ) ) ;
    public final void rule__LookupString__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3031:1: ( ( ( rule__LookupString__ValuesAssignment_4 ) ) )
            // InternalUlmDsl2.g:3032:1: ( ( rule__LookupString__ValuesAssignment_4 ) )
            {
            // InternalUlmDsl2.g:3032:1: ( ( rule__LookupString__ValuesAssignment_4 ) )
            // InternalUlmDsl2.g:3033:2: ( rule__LookupString__ValuesAssignment_4 )
            {
             before(grammarAccess.getLookupStringAccess().getValuesAssignment_4()); 
            // InternalUlmDsl2.g:3034:2: ( rule__LookupString__ValuesAssignment_4 )
            // InternalUlmDsl2.g:3034:3: rule__LookupString__ValuesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__LookupString__ValuesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLookupStringAccess().getValuesAssignment_4()); 

            }


            }

        }
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
    // InternalUlmDsl2.g:3042:1: rule__LookupString__Group__5 : rule__LookupString__Group__5__Impl rule__LookupString__Group__6 ;
    public final void rule__LookupString__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3046:1: ( rule__LookupString__Group__5__Impl rule__LookupString__Group__6 )
            // InternalUlmDsl2.g:3047:2: rule__LookupString__Group__5__Impl rule__LookupString__Group__6
            {
            pushFollow(FOLLOW_29);
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
    // InternalUlmDsl2.g:3054:1: rule__LookupString__Group__5__Impl : ( ( rule__LookupString__Group_5__0 )* ) ;
    public final void rule__LookupString__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3058:1: ( ( ( rule__LookupString__Group_5__0 )* ) )
            // InternalUlmDsl2.g:3059:1: ( ( rule__LookupString__Group_5__0 )* )
            {
            // InternalUlmDsl2.g:3059:1: ( ( rule__LookupString__Group_5__0 )* )
            // InternalUlmDsl2.g:3060:2: ( rule__LookupString__Group_5__0 )*
            {
             before(grammarAccess.getLookupStringAccess().getGroup_5()); 
            // InternalUlmDsl2.g:3061:2: ( rule__LookupString__Group_5__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==29) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalUlmDsl2.g:3061:3: rule__LookupString__Group_5__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__LookupString__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getLookupStringAccess().getGroup_5()); 

            }


            }

        }
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
    // InternalUlmDsl2.g:3069:1: rule__LookupString__Group__6 : rule__LookupString__Group__6__Impl rule__LookupString__Group__7 ;
    public final void rule__LookupString__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3073:1: ( rule__LookupString__Group__6__Impl rule__LookupString__Group__7 )
            // InternalUlmDsl2.g:3074:2: rule__LookupString__Group__6__Impl rule__LookupString__Group__7
            {
            pushFollow(FOLLOW_31);
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
    // InternalUlmDsl2.g:3081:1: rule__LookupString__Group__6__Impl : ( '}' ) ;
    public final void rule__LookupString__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3085:1: ( ( '}' ) )
            // InternalUlmDsl2.g:3086:1: ( '}' )
            {
            // InternalUlmDsl2.g:3086:1: ( '}' )
            // InternalUlmDsl2.g:3087:2: '}'
            {
             before(grammarAccess.getLookupStringAccess().getRightCurlyBracketKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getLookupStringAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
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
    // InternalUlmDsl2.g:3096:1: rule__LookupString__Group__7 : rule__LookupString__Group__7__Impl ;
    public final void rule__LookupString__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3100:1: ( rule__LookupString__Group__7__Impl )
            // InternalUlmDsl2.g:3101:2: rule__LookupString__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LookupString__Group__7__Impl();

            state._fsp--;


            }

        }
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
    // InternalUlmDsl2.g:3107:1: rule__LookupString__Group__7__Impl : ( ';' ) ;
    public final void rule__LookupString__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3111:1: ( ( ';' ) )
            // InternalUlmDsl2.g:3112:1: ( ';' )
            {
            // InternalUlmDsl2.g:3112:1: ( ';' )
            // InternalUlmDsl2.g:3113:2: ';'
            {
             before(grammarAccess.getLookupStringAccess().getSemicolonKeyword_7()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getLookupStringAccess().getSemicolonKeyword_7()); 

            }


            }

        }
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


    // $ANTLR start "rule__LookupString__Group_5__0"
    // InternalUlmDsl2.g:3123:1: rule__LookupString__Group_5__0 : rule__LookupString__Group_5__0__Impl rule__LookupString__Group_5__1 ;
    public final void rule__LookupString__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3127:1: ( rule__LookupString__Group_5__0__Impl rule__LookupString__Group_5__1 )
            // InternalUlmDsl2.g:3128:2: rule__LookupString__Group_5__0__Impl rule__LookupString__Group_5__1
            {
            pushFollow(FOLLOW_28);
            rule__LookupString__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LookupString__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupString__Group_5__0"


    // $ANTLR start "rule__LookupString__Group_5__0__Impl"
    // InternalUlmDsl2.g:3135:1: rule__LookupString__Group_5__0__Impl : ( ',' ) ;
    public final void rule__LookupString__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3139:1: ( ( ',' ) )
            // InternalUlmDsl2.g:3140:1: ( ',' )
            {
            // InternalUlmDsl2.g:3140:1: ( ',' )
            // InternalUlmDsl2.g:3141:2: ','
            {
             before(grammarAccess.getLookupStringAccess().getCommaKeyword_5_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getLookupStringAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupString__Group_5__0__Impl"


    // $ANTLR start "rule__LookupString__Group_5__1"
    // InternalUlmDsl2.g:3150:1: rule__LookupString__Group_5__1 : rule__LookupString__Group_5__1__Impl ;
    public final void rule__LookupString__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3154:1: ( rule__LookupString__Group_5__1__Impl )
            // InternalUlmDsl2.g:3155:2: rule__LookupString__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LookupString__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupString__Group_5__1"


    // $ANTLR start "rule__LookupString__Group_5__1__Impl"
    // InternalUlmDsl2.g:3161:1: rule__LookupString__Group_5__1__Impl : ( ( rule__LookupString__ValuesAssignment_5_1 ) ) ;
    public final void rule__LookupString__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3165:1: ( ( ( rule__LookupString__ValuesAssignment_5_1 ) ) )
            // InternalUlmDsl2.g:3166:1: ( ( rule__LookupString__ValuesAssignment_5_1 ) )
            {
            // InternalUlmDsl2.g:3166:1: ( ( rule__LookupString__ValuesAssignment_5_1 ) )
            // InternalUlmDsl2.g:3167:2: ( rule__LookupString__ValuesAssignment_5_1 )
            {
             before(grammarAccess.getLookupStringAccess().getValuesAssignment_5_1()); 
            // InternalUlmDsl2.g:3168:2: ( rule__LookupString__ValuesAssignment_5_1 )
            // InternalUlmDsl2.g:3168:3: rule__LookupString__ValuesAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__LookupString__ValuesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getLookupStringAccess().getValuesAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupString__Group_5__1__Impl"


    // $ANTLR start "rule__LookupIntValue__Group__0"
    // InternalUlmDsl2.g:3177:1: rule__LookupIntValue__Group__0 : rule__LookupIntValue__Group__0__Impl rule__LookupIntValue__Group__1 ;
    public final void rule__LookupIntValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3181:1: ( rule__LookupIntValue__Group__0__Impl rule__LookupIntValue__Group__1 )
            // InternalUlmDsl2.g:3182:2: rule__LookupIntValue__Group__0__Impl rule__LookupIntValue__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalUlmDsl2.g:3189:1: rule__LookupIntValue__Group__0__Impl : ( () ) ;
    public final void rule__LookupIntValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3193:1: ( ( () ) )
            // InternalUlmDsl2.g:3194:1: ( () )
            {
            // InternalUlmDsl2.g:3194:1: ( () )
            // InternalUlmDsl2.g:3195:2: ()
            {
             before(grammarAccess.getLookupIntValueAccess().getLookupIntValueAction_0()); 
            // InternalUlmDsl2.g:3196:2: ()
            // InternalUlmDsl2.g:3196:3: 
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
    // InternalUlmDsl2.g:3204:1: rule__LookupIntValue__Group__1 : rule__LookupIntValue__Group__1__Impl rule__LookupIntValue__Group__2 ;
    public final void rule__LookupIntValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3208:1: ( rule__LookupIntValue__Group__1__Impl rule__LookupIntValue__Group__2 )
            // InternalUlmDsl2.g:3209:2: rule__LookupIntValue__Group__1__Impl rule__LookupIntValue__Group__2
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
    // InternalUlmDsl2.g:3216:1: rule__LookupIntValue__Group__1__Impl : ( '(' ) ;
    public final void rule__LookupIntValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3220:1: ( ( '(' ) )
            // InternalUlmDsl2.g:3221:1: ( '(' )
            {
            // InternalUlmDsl2.g:3221:1: ( '(' )
            // InternalUlmDsl2.g:3222:2: '('
            {
             before(grammarAccess.getLookupIntValueAccess().getLeftParenthesisKeyword_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalUlmDsl2.g:3231:1: rule__LookupIntValue__Group__2 : rule__LookupIntValue__Group__2__Impl rule__LookupIntValue__Group__3 ;
    public final void rule__LookupIntValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3235:1: ( rule__LookupIntValue__Group__2__Impl rule__LookupIntValue__Group__3 )
            // InternalUlmDsl2.g:3236:2: rule__LookupIntValue__Group__2__Impl rule__LookupIntValue__Group__3
            {
            pushFollow(FOLLOW_32);
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
    // InternalUlmDsl2.g:3243:1: rule__LookupIntValue__Group__2__Impl : ( ( rule__LookupIntValue__ValueAssignment_2 ) ) ;
    public final void rule__LookupIntValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3247:1: ( ( ( rule__LookupIntValue__ValueAssignment_2 ) ) )
            // InternalUlmDsl2.g:3248:1: ( ( rule__LookupIntValue__ValueAssignment_2 ) )
            {
            // InternalUlmDsl2.g:3248:1: ( ( rule__LookupIntValue__ValueAssignment_2 ) )
            // InternalUlmDsl2.g:3249:2: ( rule__LookupIntValue__ValueAssignment_2 )
            {
             before(grammarAccess.getLookupIntValueAccess().getValueAssignment_2()); 
            // InternalUlmDsl2.g:3250:2: ( rule__LookupIntValue__ValueAssignment_2 )
            // InternalUlmDsl2.g:3250:3: rule__LookupIntValue__ValueAssignment_2
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
    // InternalUlmDsl2.g:3258:1: rule__LookupIntValue__Group__3 : rule__LookupIntValue__Group__3__Impl rule__LookupIntValue__Group__4 ;
    public final void rule__LookupIntValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3262:1: ( rule__LookupIntValue__Group__3__Impl rule__LookupIntValue__Group__4 )
            // InternalUlmDsl2.g:3263:2: rule__LookupIntValue__Group__3__Impl rule__LookupIntValue__Group__4
            {
            pushFollow(FOLLOW_33);
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
    // InternalUlmDsl2.g:3270:1: rule__LookupIntValue__Group__3__Impl : ( ':' ) ;
    public final void rule__LookupIntValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3274:1: ( ( ':' ) )
            // InternalUlmDsl2.g:3275:1: ( ':' )
            {
            // InternalUlmDsl2.g:3275:1: ( ':' )
            // InternalUlmDsl2.g:3276:2: ':'
            {
             before(grammarAccess.getLookupIntValueAccess().getColonKeyword_3()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getLookupIntValueAccess().getColonKeyword_3()); 

            }


            }

        }
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
    // InternalUlmDsl2.g:3285:1: rule__LookupIntValue__Group__4 : rule__LookupIntValue__Group__4__Impl rule__LookupIntValue__Group__5 ;
    public final void rule__LookupIntValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3289:1: ( rule__LookupIntValue__Group__4__Impl rule__LookupIntValue__Group__5 )
            // InternalUlmDsl2.g:3290:2: rule__LookupIntValue__Group__4__Impl rule__LookupIntValue__Group__5
            {
            pushFollow(FOLLOW_34);
            rule__LookupIntValue__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LookupIntValue__Group__5();

            state._fsp--;


            }

        }
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
    // InternalUlmDsl2.g:3297:1: rule__LookupIntValue__Group__4__Impl : ( ( rule__LookupIntValue__DescriptionAssignment_4 ) ) ;
    public final void rule__LookupIntValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3301:1: ( ( ( rule__LookupIntValue__DescriptionAssignment_4 ) ) )
            // InternalUlmDsl2.g:3302:1: ( ( rule__LookupIntValue__DescriptionAssignment_4 ) )
            {
            // InternalUlmDsl2.g:3302:1: ( ( rule__LookupIntValue__DescriptionAssignment_4 ) )
            // InternalUlmDsl2.g:3303:2: ( rule__LookupIntValue__DescriptionAssignment_4 )
            {
             before(grammarAccess.getLookupIntValueAccess().getDescriptionAssignment_4()); 
            // InternalUlmDsl2.g:3304:2: ( rule__LookupIntValue__DescriptionAssignment_4 )
            // InternalUlmDsl2.g:3304:3: rule__LookupIntValue__DescriptionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__LookupIntValue__DescriptionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLookupIntValueAccess().getDescriptionAssignment_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__LookupIntValue__Group__5"
    // InternalUlmDsl2.g:3312:1: rule__LookupIntValue__Group__5 : rule__LookupIntValue__Group__5__Impl ;
    public final void rule__LookupIntValue__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3316:1: ( rule__LookupIntValue__Group__5__Impl )
            // InternalUlmDsl2.g:3317:2: rule__LookupIntValue__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LookupIntValue__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupIntValue__Group__5"


    // $ANTLR start "rule__LookupIntValue__Group__5__Impl"
    // InternalUlmDsl2.g:3323:1: rule__LookupIntValue__Group__5__Impl : ( ')' ) ;
    public final void rule__LookupIntValue__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3327:1: ( ( ')' ) )
            // InternalUlmDsl2.g:3328:1: ( ')' )
            {
            // InternalUlmDsl2.g:3328:1: ( ')' )
            // InternalUlmDsl2.g:3329:2: ')'
            {
             before(grammarAccess.getLookupIntValueAccess().getRightParenthesisKeyword_5()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getLookupIntValueAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupIntValue__Group__5__Impl"


    // $ANTLR start "rule__LookupStringValue__Group__0"
    // InternalUlmDsl2.g:3339:1: rule__LookupStringValue__Group__0 : rule__LookupStringValue__Group__0__Impl rule__LookupStringValue__Group__1 ;
    public final void rule__LookupStringValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3343:1: ( rule__LookupStringValue__Group__0__Impl rule__LookupStringValue__Group__1 )
            // InternalUlmDsl2.g:3344:2: rule__LookupStringValue__Group__0__Impl rule__LookupStringValue__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalUlmDsl2.g:3351:1: rule__LookupStringValue__Group__0__Impl : ( () ) ;
    public final void rule__LookupStringValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3355:1: ( ( () ) )
            // InternalUlmDsl2.g:3356:1: ( () )
            {
            // InternalUlmDsl2.g:3356:1: ( () )
            // InternalUlmDsl2.g:3357:2: ()
            {
             before(grammarAccess.getLookupStringValueAccess().getLookupStringValueAction_0()); 
            // InternalUlmDsl2.g:3358:2: ()
            // InternalUlmDsl2.g:3358:3: 
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
    // InternalUlmDsl2.g:3366:1: rule__LookupStringValue__Group__1 : rule__LookupStringValue__Group__1__Impl rule__LookupStringValue__Group__2 ;
    public final void rule__LookupStringValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3370:1: ( rule__LookupStringValue__Group__1__Impl rule__LookupStringValue__Group__2 )
            // InternalUlmDsl2.g:3371:2: rule__LookupStringValue__Group__1__Impl rule__LookupStringValue__Group__2
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
    // InternalUlmDsl2.g:3378:1: rule__LookupStringValue__Group__1__Impl : ( '(' ) ;
    public final void rule__LookupStringValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3382:1: ( ( '(' ) )
            // InternalUlmDsl2.g:3383:1: ( '(' )
            {
            // InternalUlmDsl2.g:3383:1: ( '(' )
            // InternalUlmDsl2.g:3384:2: '('
            {
             before(grammarAccess.getLookupStringValueAccess().getLeftParenthesisKeyword_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalUlmDsl2.g:3393:1: rule__LookupStringValue__Group__2 : rule__LookupStringValue__Group__2__Impl rule__LookupStringValue__Group__3 ;
    public final void rule__LookupStringValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3397:1: ( rule__LookupStringValue__Group__2__Impl rule__LookupStringValue__Group__3 )
            // InternalUlmDsl2.g:3398:2: rule__LookupStringValue__Group__2__Impl rule__LookupStringValue__Group__3
            {
            pushFollow(FOLLOW_32);
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
    // InternalUlmDsl2.g:3405:1: rule__LookupStringValue__Group__2__Impl : ( ( rule__LookupStringValue__ValueAssignment_2 ) ) ;
    public final void rule__LookupStringValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3409:1: ( ( ( rule__LookupStringValue__ValueAssignment_2 ) ) )
            // InternalUlmDsl2.g:3410:1: ( ( rule__LookupStringValue__ValueAssignment_2 ) )
            {
            // InternalUlmDsl2.g:3410:1: ( ( rule__LookupStringValue__ValueAssignment_2 ) )
            // InternalUlmDsl2.g:3411:2: ( rule__LookupStringValue__ValueAssignment_2 )
            {
             before(grammarAccess.getLookupStringValueAccess().getValueAssignment_2()); 
            // InternalUlmDsl2.g:3412:2: ( rule__LookupStringValue__ValueAssignment_2 )
            // InternalUlmDsl2.g:3412:3: rule__LookupStringValue__ValueAssignment_2
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
    // InternalUlmDsl2.g:3420:1: rule__LookupStringValue__Group__3 : rule__LookupStringValue__Group__3__Impl rule__LookupStringValue__Group__4 ;
    public final void rule__LookupStringValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3424:1: ( rule__LookupStringValue__Group__3__Impl rule__LookupStringValue__Group__4 )
            // InternalUlmDsl2.g:3425:2: rule__LookupStringValue__Group__3__Impl rule__LookupStringValue__Group__4
            {
            pushFollow(FOLLOW_33);
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
    // InternalUlmDsl2.g:3432:1: rule__LookupStringValue__Group__3__Impl : ( ':' ) ;
    public final void rule__LookupStringValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3436:1: ( ( ':' ) )
            // InternalUlmDsl2.g:3437:1: ( ':' )
            {
            // InternalUlmDsl2.g:3437:1: ( ':' )
            // InternalUlmDsl2.g:3438:2: ':'
            {
             before(grammarAccess.getLookupStringValueAccess().getColonKeyword_3()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getLookupStringValueAccess().getColonKeyword_3()); 

            }


            }

        }
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
    // InternalUlmDsl2.g:3447:1: rule__LookupStringValue__Group__4 : rule__LookupStringValue__Group__4__Impl rule__LookupStringValue__Group__5 ;
    public final void rule__LookupStringValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3451:1: ( rule__LookupStringValue__Group__4__Impl rule__LookupStringValue__Group__5 )
            // InternalUlmDsl2.g:3452:2: rule__LookupStringValue__Group__4__Impl rule__LookupStringValue__Group__5
            {
            pushFollow(FOLLOW_34);
            rule__LookupStringValue__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LookupStringValue__Group__5();

            state._fsp--;


            }

        }
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
    // InternalUlmDsl2.g:3459:1: rule__LookupStringValue__Group__4__Impl : ( ( rule__LookupStringValue__DescriptionAssignment_4 ) ) ;
    public final void rule__LookupStringValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3463:1: ( ( ( rule__LookupStringValue__DescriptionAssignment_4 ) ) )
            // InternalUlmDsl2.g:3464:1: ( ( rule__LookupStringValue__DescriptionAssignment_4 ) )
            {
            // InternalUlmDsl2.g:3464:1: ( ( rule__LookupStringValue__DescriptionAssignment_4 ) )
            // InternalUlmDsl2.g:3465:2: ( rule__LookupStringValue__DescriptionAssignment_4 )
            {
             before(grammarAccess.getLookupStringValueAccess().getDescriptionAssignment_4()); 
            // InternalUlmDsl2.g:3466:2: ( rule__LookupStringValue__DescriptionAssignment_4 )
            // InternalUlmDsl2.g:3466:3: rule__LookupStringValue__DescriptionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__LookupStringValue__DescriptionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLookupStringValueAccess().getDescriptionAssignment_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__LookupStringValue__Group__5"
    // InternalUlmDsl2.g:3474:1: rule__LookupStringValue__Group__5 : rule__LookupStringValue__Group__5__Impl ;
    public final void rule__LookupStringValue__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3478:1: ( rule__LookupStringValue__Group__5__Impl )
            // InternalUlmDsl2.g:3479:2: rule__LookupStringValue__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LookupStringValue__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupStringValue__Group__5"


    // $ANTLR start "rule__LookupStringValue__Group__5__Impl"
    // InternalUlmDsl2.g:3485:1: rule__LookupStringValue__Group__5__Impl : ( ')' ) ;
    public final void rule__LookupStringValue__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3489:1: ( ( ')' ) )
            // InternalUlmDsl2.g:3490:1: ( ')' )
            {
            // InternalUlmDsl2.g:3490:1: ( ')' )
            // InternalUlmDsl2.g:3491:2: ')'
            {
             before(grammarAccess.getLookupStringValueAccess().getRightParenthesisKeyword_5()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getLookupStringValueAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupStringValue__Group__5__Impl"


    // $ANTLR start "rule__Model__NameAssignment_1"
    // InternalUlmDsl2.g:3501:1: rule__Model__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3505:1: ( ( RULE_ID ) )
            // InternalUlmDsl2.g:3506:2: ( RULE_ID )
            {
            // InternalUlmDsl2.g:3506:2: ( RULE_ID )
            // InternalUlmDsl2.g:3507:3: RULE_ID
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
    // InternalUlmDsl2.g:3516:1: rule__Model__ContextsAssignment_3 : ( ruleContext ) ;
    public final void rule__Model__ContextsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3520:1: ( ( ruleContext ) )
            // InternalUlmDsl2.g:3521:2: ( ruleContext )
            {
            // InternalUlmDsl2.g:3521:2: ( ruleContext )
            // InternalUlmDsl2.g:3522:3: ruleContext
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
    // InternalUlmDsl2.g:3531:1: rule__Context__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Context__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3535:1: ( ( RULE_ID ) )
            // InternalUlmDsl2.g:3536:2: ( RULE_ID )
            {
            // InternalUlmDsl2.g:3536:2: ( RULE_ID )
            // InternalUlmDsl2.g:3537:3: RULE_ID
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
    // InternalUlmDsl2.g:3546:1: rule__Context__VersionAssignment_2 : ( ruleVersion ) ;
    public final void rule__Context__VersionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3550:1: ( ( ruleVersion ) )
            // InternalUlmDsl2.g:3551:2: ( ruleVersion )
            {
            // InternalUlmDsl2.g:3551:2: ( ruleVersion )
            // InternalUlmDsl2.g:3552:3: ruleVersion
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
    // InternalUlmDsl2.g:3561:1: rule__Context__AttributesAssignment_4_2 : ( ruleAttribute ) ;
    public final void rule__Context__AttributesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3565:1: ( ( ruleAttribute ) )
            // InternalUlmDsl2.g:3566:2: ( ruleAttribute )
            {
            // InternalUlmDsl2.g:3566:2: ( ruleAttribute )
            // InternalUlmDsl2.g:3567:3: ruleAttribute
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
    // InternalUlmDsl2.g:3576:1: rule__Context__LookupsAssignment_5_2 : ( ruleLookup ) ;
    public final void rule__Context__LookupsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3580:1: ( ( ruleLookup ) )
            // InternalUlmDsl2.g:3581:2: ( ruleLookup )
            {
            // InternalUlmDsl2.g:3581:2: ( ruleLookup )
            // InternalUlmDsl2.g:3582:3: ruleLookup
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
    // InternalUlmDsl2.g:3591:1: rule__Context__EntitiesAssignment_6_2 : ( ruleEntity ) ;
    public final void rule__Context__EntitiesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3595:1: ( ( ruleEntity ) )
            // InternalUlmDsl2.g:3596:2: ( ruleEntity )
            {
            // InternalUlmDsl2.g:3596:2: ( ruleEntity )
            // InternalUlmDsl2.g:3597:3: ruleEntity
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


    // $ANTLR start "rule__Attribute__NameAssignment_0"
    // InternalUlmDsl2.g:3606:1: rule__Attribute__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3610:1: ( ( RULE_ID ) )
            // InternalUlmDsl2.g:3611:2: ( RULE_ID )
            {
            // InternalUlmDsl2.g:3611:2: ( RULE_ID )
            // InternalUlmDsl2.g:3612:3: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_0"


    // $ANTLR start "rule__Attribute__TypeAssignment_1"
    // InternalUlmDsl2.g:3621:1: rule__Attribute__TypeAssignment_1 : ( ( rule__Attribute__TypeAlternatives_1_0 ) ) ;
    public final void rule__Attribute__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3625:1: ( ( ( rule__Attribute__TypeAlternatives_1_0 ) ) )
            // InternalUlmDsl2.g:3626:2: ( ( rule__Attribute__TypeAlternatives_1_0 ) )
            {
            // InternalUlmDsl2.g:3626:2: ( ( rule__Attribute__TypeAlternatives_1_0 ) )
            // InternalUlmDsl2.g:3627:3: ( rule__Attribute__TypeAlternatives_1_0 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAlternatives_1_0()); 
            // InternalUlmDsl2.g:3628:3: ( rule__Attribute__TypeAlternatives_1_0 )
            // InternalUlmDsl2.g:3628:4: rule__Attribute__TypeAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__TypeAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeAlternatives_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Attribute__DescAssignment_2"
    // InternalUlmDsl2.g:3636:1: rule__Attribute__DescAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Attribute__DescAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3640:1: ( ( RULE_STRING ) )
            // InternalUlmDsl2.g:3641:2: ( RULE_STRING )
            {
            // InternalUlmDsl2.g:3641:2: ( RULE_STRING )
            // InternalUlmDsl2.g:3642:3: RULE_STRING
            {
             before(grammarAccess.getAttributeAccess().getDescSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getDescSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__DescAssignment_2"


    // $ANTLR start "rule__AttributeType__NameAssignment"
    // InternalUlmDsl2.g:3651:1: rule__AttributeType__NameAssignment : ( ( rule__AttributeType__NameAlternatives_0 ) ) ;
    public final void rule__AttributeType__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3655:1: ( ( ( rule__AttributeType__NameAlternatives_0 ) ) )
            // InternalUlmDsl2.g:3656:2: ( ( rule__AttributeType__NameAlternatives_0 ) )
            {
            // InternalUlmDsl2.g:3656:2: ( ( rule__AttributeType__NameAlternatives_0 ) )
            // InternalUlmDsl2.g:3657:3: ( rule__AttributeType__NameAlternatives_0 )
            {
             before(grammarAccess.getAttributeTypeAccess().getNameAlternatives_0()); 
            // InternalUlmDsl2.g:3658:3: ( rule__AttributeType__NameAlternatives_0 )
            // InternalUlmDsl2.g:3658:4: rule__AttributeType__NameAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeType__NameAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeTypeAccess().getNameAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__NameAssignment"


    // $ANTLR start "rule__AttributeStringType__NameAssignment_0"
    // InternalUlmDsl2.g:3666:1: rule__AttributeStringType__NameAssignment_0 : ( ( 'string' ) ) ;
    public final void rule__AttributeStringType__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3670:1: ( ( ( 'string' ) ) )
            // InternalUlmDsl2.g:3671:2: ( ( 'string' ) )
            {
            // InternalUlmDsl2.g:3671:2: ( ( 'string' ) )
            // InternalUlmDsl2.g:3672:3: ( 'string' )
            {
             before(grammarAccess.getAttributeStringTypeAccess().getNameStringKeyword_0_0()); 
            // InternalUlmDsl2.g:3673:3: ( 'string' )
            // InternalUlmDsl2.g:3674:4: 'string'
            {
             before(grammarAccess.getAttributeStringTypeAccess().getNameStringKeyword_0_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getAttributeStringTypeAccess().getNameStringKeyword_0_0()); 

            }

             after(grammarAccess.getAttributeStringTypeAccess().getNameStringKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeStringType__NameAssignment_0"


    // $ANTLR start "rule__AttributeStringType__ArrayAssignment_1_0"
    // InternalUlmDsl2.g:3685:1: rule__AttributeStringType__ArrayAssignment_1_0 : ( ( '[' ) ) ;
    public final void rule__AttributeStringType__ArrayAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3689:1: ( ( ( '[' ) ) )
            // InternalUlmDsl2.g:3690:2: ( ( '[' ) )
            {
            // InternalUlmDsl2.g:3690:2: ( ( '[' ) )
            // InternalUlmDsl2.g:3691:3: ( '[' )
            {
             before(grammarAccess.getAttributeStringTypeAccess().getArrayLeftSquareBracketKeyword_1_0_0()); 
            // InternalUlmDsl2.g:3692:3: ( '[' )
            // InternalUlmDsl2.g:3693:4: '['
            {
             before(grammarAccess.getAttributeStringTypeAccess().getArrayLeftSquareBracketKeyword_1_0_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getAttributeStringTypeAccess().getArrayLeftSquareBracketKeyword_1_0_0()); 

            }

             after(grammarAccess.getAttributeStringTypeAccess().getArrayLeftSquareBracketKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeStringType__ArrayAssignment_1_0"


    // $ANTLR start "rule__AttributeStringType__LengthAssignment_1_1"
    // InternalUlmDsl2.g:3704:1: rule__AttributeStringType__LengthAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__AttributeStringType__LengthAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3708:1: ( ( RULE_INT ) )
            // InternalUlmDsl2.g:3709:2: ( RULE_INT )
            {
            // InternalUlmDsl2.g:3709:2: ( RULE_INT )
            // InternalUlmDsl2.g:3710:3: RULE_INT
            {
             before(grammarAccess.getAttributeStringTypeAccess().getLengthINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAttributeStringTypeAccess().getLengthINTTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeStringType__LengthAssignment_1_1"


    // $ANTLR start "rule__AttributeDecimalType__NameAssignment_0"
    // InternalUlmDsl2.g:3719:1: rule__AttributeDecimalType__NameAssignment_0 : ( ( 'decimal' ) ) ;
    public final void rule__AttributeDecimalType__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3723:1: ( ( ( 'decimal' ) ) )
            // InternalUlmDsl2.g:3724:2: ( ( 'decimal' ) )
            {
            // InternalUlmDsl2.g:3724:2: ( ( 'decimal' ) )
            // InternalUlmDsl2.g:3725:3: ( 'decimal' )
            {
             before(grammarAccess.getAttributeDecimalTypeAccess().getNameDecimalKeyword_0_0()); 
            // InternalUlmDsl2.g:3726:3: ( 'decimal' )
            // InternalUlmDsl2.g:3727:4: 'decimal'
            {
             before(grammarAccess.getAttributeDecimalTypeAccess().getNameDecimalKeyword_0_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getAttributeDecimalTypeAccess().getNameDecimalKeyword_0_0()); 

            }

             after(grammarAccess.getAttributeDecimalTypeAccess().getNameDecimalKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDecimalType__NameAssignment_0"


    // $ANTLR start "rule__AttributeDecimalType__ArrayAssignment_1_0"
    // InternalUlmDsl2.g:3738:1: rule__AttributeDecimalType__ArrayAssignment_1_0 : ( ( '[' ) ) ;
    public final void rule__AttributeDecimalType__ArrayAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3742:1: ( ( ( '[' ) ) )
            // InternalUlmDsl2.g:3743:2: ( ( '[' ) )
            {
            // InternalUlmDsl2.g:3743:2: ( ( '[' ) )
            // InternalUlmDsl2.g:3744:3: ( '[' )
            {
             before(grammarAccess.getAttributeDecimalTypeAccess().getArrayLeftSquareBracketKeyword_1_0_0()); 
            // InternalUlmDsl2.g:3745:3: ( '[' )
            // InternalUlmDsl2.g:3746:4: '['
            {
             before(grammarAccess.getAttributeDecimalTypeAccess().getArrayLeftSquareBracketKeyword_1_0_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getAttributeDecimalTypeAccess().getArrayLeftSquareBracketKeyword_1_0_0()); 

            }

             after(grammarAccess.getAttributeDecimalTypeAccess().getArrayLeftSquareBracketKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDecimalType__ArrayAssignment_1_0"


    // $ANTLR start "rule__AttributeDecimalType__ScaleAssignment_1_1"
    // InternalUlmDsl2.g:3757:1: rule__AttributeDecimalType__ScaleAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__AttributeDecimalType__ScaleAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3761:1: ( ( RULE_INT ) )
            // InternalUlmDsl2.g:3762:2: ( RULE_INT )
            {
            // InternalUlmDsl2.g:3762:2: ( RULE_INT )
            // InternalUlmDsl2.g:3763:3: RULE_INT
            {
             before(grammarAccess.getAttributeDecimalTypeAccess().getScaleINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAttributeDecimalTypeAccess().getScaleINTTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDecimalType__ScaleAssignment_1_1"


    // $ANTLR start "rule__AttributeDecimalType__PrecisionAssignment_1_2_1"
    // InternalUlmDsl2.g:3772:1: rule__AttributeDecimalType__PrecisionAssignment_1_2_1 : ( RULE_INT ) ;
    public final void rule__AttributeDecimalType__PrecisionAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3776:1: ( ( RULE_INT ) )
            // InternalUlmDsl2.g:3777:2: ( RULE_INT )
            {
            // InternalUlmDsl2.g:3777:2: ( RULE_INT )
            // InternalUlmDsl2.g:3778:3: RULE_INT
            {
             before(grammarAccess.getAttributeDecimalTypeAccess().getPrecisionINTTerminalRuleCall_1_2_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAttributeDecimalTypeAccess().getPrecisionINTTerminalRuleCall_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDecimalType__PrecisionAssignment_1_2_1"


    // $ANTLR start "rule__Entity__TypeAssignment_0"
    // InternalUlmDsl2.g:3787:1: rule__Entity__TypeAssignment_0 : ( ( rule__Entity__TypeAlternatives_0_0 ) ) ;
    public final void rule__Entity__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3791:1: ( ( ( rule__Entity__TypeAlternatives_0_0 ) ) )
            // InternalUlmDsl2.g:3792:2: ( ( rule__Entity__TypeAlternatives_0_0 ) )
            {
            // InternalUlmDsl2.g:3792:2: ( ( rule__Entity__TypeAlternatives_0_0 ) )
            // InternalUlmDsl2.g:3793:3: ( rule__Entity__TypeAlternatives_0_0 )
            {
             before(grammarAccess.getEntityAccess().getTypeAlternatives_0_0()); 
            // InternalUlmDsl2.g:3794:3: ( rule__Entity__TypeAlternatives_0_0 )
            // InternalUlmDsl2.g:3794:4: rule__Entity__TypeAlternatives_0_0
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


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // InternalUlmDsl2.g:3802:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3806:1: ( ( RULE_ID ) )
            // InternalUlmDsl2.g:3807:2: ( RULE_ID )
            {
            // InternalUlmDsl2.g:3807:2: ( RULE_ID )
            // InternalUlmDsl2.g:3808:3: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__NameAssignment_1"


    // $ANTLR start "rule__Entity__DescAssignment_2"
    // InternalUlmDsl2.g:3817:1: rule__Entity__DescAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Entity__DescAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3821:1: ( ( RULE_STRING ) )
            // InternalUlmDsl2.g:3822:2: ( RULE_STRING )
            {
            // InternalUlmDsl2.g:3822:2: ( RULE_STRING )
            // InternalUlmDsl2.g:3823:3: RULE_STRING
            {
             before(grammarAccess.getEntityAccess().getDescSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getDescSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__DescAssignment_2"


    // $ANTLR start "rule__Entity__SuperTypeAssignment_3_1"
    // InternalUlmDsl2.g:3832:1: rule__Entity__SuperTypeAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__SuperTypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3836:1: ( ( ( RULE_ID ) ) )
            // InternalUlmDsl2.g:3837:2: ( ( RULE_ID ) )
            {
            // InternalUlmDsl2.g:3837:2: ( ( RULE_ID ) )
            // InternalUlmDsl2.g:3838:3: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_3_1_0()); 
            // InternalUlmDsl2.g:3839:3: ( RULE_ID )
            // InternalUlmDsl2.g:3840:4: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getSuperTypeEntityIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__SuperTypeAssignment_3_1"


    // $ANTLR start "rule__Entity__FeaturesAssignment_5"
    // InternalUlmDsl2.g:3851:1: rule__Entity__FeaturesAssignment_5 : ( ruleFeature ) ;
    public final void rule__Entity__FeaturesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3855:1: ( ( ruleFeature ) )
            // InternalUlmDsl2.g:3856:2: ( ruleFeature )
            {
            // InternalUlmDsl2.g:3856:2: ( ruleFeature )
            // InternalUlmDsl2.g:3857:3: ruleFeature
            {
             before(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__FeaturesAssignment_5"


    // $ANTLR start "rule__Feature__TypeAssignment_0"
    // InternalUlmDsl2.g:3866:1: rule__Feature__TypeAssignment_0 : ( ruleFeatureType ) ;
    public final void rule__Feature__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3870:1: ( ( ruleFeatureType ) )
            // InternalUlmDsl2.g:3871:2: ( ruleFeatureType )
            {
            // InternalUlmDsl2.g:3871:2: ( ruleFeatureType )
            // InternalUlmDsl2.g:3872:3: ruleFeatureType
            {
             before(grammarAccess.getFeatureAccess().getTypeFeatureTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFeatureType();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getTypeFeatureTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__TypeAssignment_0"


    // $ANTLR start "rule__Feature__MandatoryAssignment_1"
    // InternalUlmDsl2.g:3881:1: rule__Feature__MandatoryAssignment_1 : ( ( 'mandatory' ) ) ;
    public final void rule__Feature__MandatoryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3885:1: ( ( ( 'mandatory' ) ) )
            // InternalUlmDsl2.g:3886:2: ( ( 'mandatory' ) )
            {
            // InternalUlmDsl2.g:3886:2: ( ( 'mandatory' ) )
            // InternalUlmDsl2.g:3887:3: ( 'mandatory' )
            {
             before(grammarAccess.getFeatureAccess().getMandatoryMandatoryKeyword_1_0()); 
            // InternalUlmDsl2.g:3888:3: ( 'mandatory' )
            // InternalUlmDsl2.g:3889:4: 'mandatory'
            {
             before(grammarAccess.getFeatureAccess().getMandatoryMandatoryKeyword_1_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalUlmDsl2.g:3900:1: rule__Feature__IdentifierAssignment_2 : ( ( 'identifier' ) ) ;
    public final void rule__Feature__IdentifierAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3904:1: ( ( ( 'identifier' ) ) )
            // InternalUlmDsl2.g:3905:2: ( ( 'identifier' ) )
            {
            // InternalUlmDsl2.g:3905:2: ( ( 'identifier' ) )
            // InternalUlmDsl2.g:3906:3: ( 'identifier' )
            {
             before(grammarAccess.getFeatureAccess().getIdentifierIdentifierKeyword_2_0()); 
            // InternalUlmDsl2.g:3907:3: ( 'identifier' )
            // InternalUlmDsl2.g:3908:4: 'identifier'
            {
             before(grammarAccess.getFeatureAccess().getIdentifierIdentifierKeyword_2_0()); 
            match(input,43,FOLLOW_2); 
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


    // $ANTLR start "rule__Feature__NameAssignment_3_1"
    // InternalUlmDsl2.g:3919:1: rule__Feature__NameAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__Feature__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3923:1: ( ( RULE_ID ) )
            // InternalUlmDsl2.g:3924:2: ( RULE_ID )
            {
            // InternalUlmDsl2.g:3924:2: ( RULE_ID )
            // InternalUlmDsl2.g:3925:3: RULE_ID
            {
             before(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__NameAssignment_3_1"


    // $ANTLR start "rule__FeatureType__TypeAssignment"
    // InternalUlmDsl2.g:3934:1: rule__FeatureType__TypeAssignment : ( ( rule__FeatureType__TypeAlternatives_0 ) ) ;
    public final void rule__FeatureType__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3938:1: ( ( ( rule__FeatureType__TypeAlternatives_0 ) ) )
            // InternalUlmDsl2.g:3939:2: ( ( rule__FeatureType__TypeAlternatives_0 ) )
            {
            // InternalUlmDsl2.g:3939:2: ( ( rule__FeatureType__TypeAlternatives_0 ) )
            // InternalUlmDsl2.g:3940:3: ( rule__FeatureType__TypeAlternatives_0 )
            {
             before(grammarAccess.getFeatureTypeAccess().getTypeAlternatives_0()); 
            // InternalUlmDsl2.g:3941:3: ( rule__FeatureType__TypeAlternatives_0 )
            // InternalUlmDsl2.g:3941:4: rule__FeatureType__TypeAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__FeatureType__TypeAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureTypeAccess().getTypeAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureType__TypeAssignment"


    // $ANTLR start "rule__AttributeFeatureType__AttributeAssignment_0"
    // InternalUlmDsl2.g:3949:1: rule__AttributeFeatureType__AttributeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__AttributeFeatureType__AttributeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3953:1: ( ( ( RULE_ID ) ) )
            // InternalUlmDsl2.g:3954:2: ( ( RULE_ID ) )
            {
            // InternalUlmDsl2.g:3954:2: ( ( RULE_ID ) )
            // InternalUlmDsl2.g:3955:3: ( RULE_ID )
            {
             before(grammarAccess.getAttributeFeatureTypeAccess().getAttributeAttributeCrossReference_0_0()); 
            // InternalUlmDsl2.g:3956:3: ( RULE_ID )
            // InternalUlmDsl2.g:3957:4: RULE_ID
            {
             before(grammarAccess.getAttributeFeatureTypeAccess().getAttributeAttributeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeFeatureTypeAccess().getAttributeAttributeIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getAttributeFeatureTypeAccess().getAttributeAttributeCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeFeatureType__AttributeAssignment_0"


    // $ANTLR start "rule__AttributeFeatureType__LookupAssignment_1_1"
    // InternalUlmDsl2.g:3968:1: rule__AttributeFeatureType__LookupAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__AttributeFeatureType__LookupAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3972:1: ( ( ( RULE_ID ) ) )
            // InternalUlmDsl2.g:3973:2: ( ( RULE_ID ) )
            {
            // InternalUlmDsl2.g:3973:2: ( ( RULE_ID ) )
            // InternalUlmDsl2.g:3974:3: ( RULE_ID )
            {
             before(grammarAccess.getAttributeFeatureTypeAccess().getLookupLookupCrossReference_1_1_0()); 
            // InternalUlmDsl2.g:3975:3: ( RULE_ID )
            // InternalUlmDsl2.g:3976:4: RULE_ID
            {
             before(grammarAccess.getAttributeFeatureTypeAccess().getLookupLookupIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeFeatureTypeAccess().getLookupLookupIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getAttributeFeatureTypeAccess().getLookupLookupCrossReference_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeFeatureType__LookupAssignment_1_1"


    // $ANTLR start "rule__EntityFeatureType__EntityAssignment_1"
    // InternalUlmDsl2.g:3987:1: rule__EntityFeatureType__EntityAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__EntityFeatureType__EntityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:3991:1: ( ( ( RULE_ID ) ) )
            // InternalUlmDsl2.g:3992:2: ( ( RULE_ID ) )
            {
            // InternalUlmDsl2.g:3992:2: ( ( RULE_ID ) )
            // InternalUlmDsl2.g:3993:3: ( RULE_ID )
            {
             before(grammarAccess.getEntityFeatureTypeAccess().getEntityEntityCrossReference_1_0()); 
            // InternalUlmDsl2.g:3994:3: ( RULE_ID )
            // InternalUlmDsl2.g:3995:4: RULE_ID
            {
             before(grammarAccess.getEntityFeatureTypeAccess().getEntityEntityIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityFeatureTypeAccess().getEntityEntityIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getEntityFeatureTypeAccess().getEntityEntityCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityFeatureType__EntityAssignment_1"


    // $ANTLR start "rule__EntityFeatureType__ArrayAssignment_2_0"
    // InternalUlmDsl2.g:4006:1: rule__EntityFeatureType__ArrayAssignment_2_0 : ( ( '[' ) ) ;
    public final void rule__EntityFeatureType__ArrayAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:4010:1: ( ( ( '[' ) ) )
            // InternalUlmDsl2.g:4011:2: ( ( '[' ) )
            {
            // InternalUlmDsl2.g:4011:2: ( ( '[' ) )
            // InternalUlmDsl2.g:4012:3: ( '[' )
            {
             before(grammarAccess.getEntityFeatureTypeAccess().getArrayLeftSquareBracketKeyword_2_0_0()); 
            // InternalUlmDsl2.g:4013:3: ( '[' )
            // InternalUlmDsl2.g:4014:4: '['
            {
             before(grammarAccess.getEntityFeatureTypeAccess().getArrayLeftSquareBracketKeyword_2_0_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getEntityFeatureTypeAccess().getArrayLeftSquareBracketKeyword_2_0_0()); 

            }

             after(grammarAccess.getEntityFeatureTypeAccess().getArrayLeftSquareBracketKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityFeatureType__ArrayAssignment_2_0"


    // $ANTLR start "rule__EntityFeatureType__LengthAssignment_2_1"
    // InternalUlmDsl2.g:4025:1: rule__EntityFeatureType__LengthAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__EntityFeatureType__LengthAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:4029:1: ( ( RULE_INT ) )
            // InternalUlmDsl2.g:4030:2: ( RULE_INT )
            {
            // InternalUlmDsl2.g:4030:2: ( RULE_INT )
            // InternalUlmDsl2.g:4031:3: RULE_INT
            {
             before(grammarAccess.getEntityFeatureTypeAccess().getLengthINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEntityFeatureTypeAccess().getLengthINTTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityFeatureType__LengthAssignment_2_1"


    // $ANTLR start "rule__Lookup__NameAssignment_0"
    // InternalUlmDsl2.g:4040:1: rule__Lookup__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Lookup__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:4044:1: ( ( RULE_ID ) )
            // InternalUlmDsl2.g:4045:2: ( RULE_ID )
            {
            // InternalUlmDsl2.g:4045:2: ( RULE_ID )
            // InternalUlmDsl2.g:4046:3: RULE_ID
            {
             before(grammarAccess.getLookupAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLookupAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lookup__NameAssignment_0"


    // $ANTLR start "rule__Lookup__TypeAssignment_1"
    // InternalUlmDsl2.g:4055:1: rule__Lookup__TypeAssignment_1 : ( ( rule__Lookup__TypeAlternatives_1_0 ) ) ;
    public final void rule__Lookup__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:4059:1: ( ( ( rule__Lookup__TypeAlternatives_1_0 ) ) )
            // InternalUlmDsl2.g:4060:2: ( ( rule__Lookup__TypeAlternatives_1_0 ) )
            {
            // InternalUlmDsl2.g:4060:2: ( ( rule__Lookup__TypeAlternatives_1_0 ) )
            // InternalUlmDsl2.g:4061:3: ( rule__Lookup__TypeAlternatives_1_0 )
            {
             before(grammarAccess.getLookupAccess().getTypeAlternatives_1_0()); 
            // InternalUlmDsl2.g:4062:3: ( rule__Lookup__TypeAlternatives_1_0 )
            // InternalUlmDsl2.g:4062:4: rule__Lookup__TypeAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Lookup__TypeAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getLookupAccess().getTypeAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lookup__TypeAssignment_1"


    // $ANTLR start "rule__LookupInt__DescriptionAssignment_1"
    // InternalUlmDsl2.g:4070:1: rule__LookupInt__DescriptionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__LookupInt__DescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:4074:1: ( ( RULE_STRING ) )
            // InternalUlmDsl2.g:4075:2: ( RULE_STRING )
            {
            // InternalUlmDsl2.g:4075:2: ( RULE_STRING )
            // InternalUlmDsl2.g:4076:3: RULE_STRING
            {
             before(grammarAccess.getLookupIntAccess().getDescriptionSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLookupIntAccess().getDescriptionSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupInt__DescriptionAssignment_1"


    // $ANTLR start "rule__LookupInt__ValuesAssignment_4"
    // InternalUlmDsl2.g:4085:1: rule__LookupInt__ValuesAssignment_4 : ( ruleLookupIntValue ) ;
    public final void rule__LookupInt__ValuesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:4089:1: ( ( ruleLookupIntValue ) )
            // InternalUlmDsl2.g:4090:2: ( ruleLookupIntValue )
            {
            // InternalUlmDsl2.g:4090:2: ( ruleLookupIntValue )
            // InternalUlmDsl2.g:4091:3: ruleLookupIntValue
            {
             before(grammarAccess.getLookupIntAccess().getValuesLookupIntValueParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleLookupIntValue();

            state._fsp--;

             after(grammarAccess.getLookupIntAccess().getValuesLookupIntValueParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupInt__ValuesAssignment_4"


    // $ANTLR start "rule__LookupInt__ValuesAssignment_5_1"
    // InternalUlmDsl2.g:4100:1: rule__LookupInt__ValuesAssignment_5_1 : ( ruleLookupIntValue ) ;
    public final void rule__LookupInt__ValuesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:4104:1: ( ( ruleLookupIntValue ) )
            // InternalUlmDsl2.g:4105:2: ( ruleLookupIntValue )
            {
            // InternalUlmDsl2.g:4105:2: ( ruleLookupIntValue )
            // InternalUlmDsl2.g:4106:3: ruleLookupIntValue
            {
             before(grammarAccess.getLookupIntAccess().getValuesLookupIntValueParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLookupIntValue();

            state._fsp--;

             after(grammarAccess.getLookupIntAccess().getValuesLookupIntValueParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupInt__ValuesAssignment_5_1"


    // $ANTLR start "rule__LookupString__DescriptionAssignment_1"
    // InternalUlmDsl2.g:4115:1: rule__LookupString__DescriptionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__LookupString__DescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:4119:1: ( ( RULE_STRING ) )
            // InternalUlmDsl2.g:4120:2: ( RULE_STRING )
            {
            // InternalUlmDsl2.g:4120:2: ( RULE_STRING )
            // InternalUlmDsl2.g:4121:3: RULE_STRING
            {
             before(grammarAccess.getLookupStringAccess().getDescriptionSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLookupStringAccess().getDescriptionSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupString__DescriptionAssignment_1"


    // $ANTLR start "rule__LookupString__ValuesAssignment_4"
    // InternalUlmDsl2.g:4130:1: rule__LookupString__ValuesAssignment_4 : ( ruleLookupStringValue ) ;
    public final void rule__LookupString__ValuesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:4134:1: ( ( ruleLookupStringValue ) )
            // InternalUlmDsl2.g:4135:2: ( ruleLookupStringValue )
            {
            // InternalUlmDsl2.g:4135:2: ( ruleLookupStringValue )
            // InternalUlmDsl2.g:4136:3: ruleLookupStringValue
            {
             before(grammarAccess.getLookupStringAccess().getValuesLookupStringValueParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleLookupStringValue();

            state._fsp--;

             after(grammarAccess.getLookupStringAccess().getValuesLookupStringValueParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupString__ValuesAssignment_4"


    // $ANTLR start "rule__LookupString__ValuesAssignment_5_1"
    // InternalUlmDsl2.g:4145:1: rule__LookupString__ValuesAssignment_5_1 : ( ruleLookupStringValue ) ;
    public final void rule__LookupString__ValuesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:4149:1: ( ( ruleLookupStringValue ) )
            // InternalUlmDsl2.g:4150:2: ( ruleLookupStringValue )
            {
            // InternalUlmDsl2.g:4150:2: ( ruleLookupStringValue )
            // InternalUlmDsl2.g:4151:3: ruleLookupStringValue
            {
             before(grammarAccess.getLookupStringAccess().getValuesLookupStringValueParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLookupStringValue();

            state._fsp--;

             after(grammarAccess.getLookupStringAccess().getValuesLookupStringValueParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupString__ValuesAssignment_5_1"


    // $ANTLR start "rule__LookupIntValue__ValueAssignment_2"
    // InternalUlmDsl2.g:4160:1: rule__LookupIntValue__ValueAssignment_2 : ( RULE_INT ) ;
    public final void rule__LookupIntValue__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:4164:1: ( ( RULE_INT ) )
            // InternalUlmDsl2.g:4165:2: ( RULE_INT )
            {
            // InternalUlmDsl2.g:4165:2: ( RULE_INT )
            // InternalUlmDsl2.g:4166:3: RULE_INT
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


    // $ANTLR start "rule__LookupIntValue__DescriptionAssignment_4"
    // InternalUlmDsl2.g:4175:1: rule__LookupIntValue__DescriptionAssignment_4 : ( RULE_STRING ) ;
    public final void rule__LookupIntValue__DescriptionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:4179:1: ( ( RULE_STRING ) )
            // InternalUlmDsl2.g:4180:2: ( RULE_STRING )
            {
            // InternalUlmDsl2.g:4180:2: ( RULE_STRING )
            // InternalUlmDsl2.g:4181:3: RULE_STRING
            {
             before(grammarAccess.getLookupIntValueAccess().getDescriptionSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLookupIntValueAccess().getDescriptionSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupIntValue__DescriptionAssignment_4"


    // $ANTLR start "rule__LookupStringValue__ValueAssignment_2"
    // InternalUlmDsl2.g:4190:1: rule__LookupStringValue__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__LookupStringValue__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:4194:1: ( ( RULE_STRING ) )
            // InternalUlmDsl2.g:4195:2: ( RULE_STRING )
            {
            // InternalUlmDsl2.g:4195:2: ( RULE_STRING )
            // InternalUlmDsl2.g:4196:3: RULE_STRING
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


    // $ANTLR start "rule__LookupStringValue__DescriptionAssignment_4"
    // InternalUlmDsl2.g:4205:1: rule__LookupStringValue__DescriptionAssignment_4 : ( RULE_STRING ) ;
    public final void rule__LookupStringValue__DescriptionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUlmDsl2.g:4209:1: ( ( RULE_STRING ) )
            // InternalUlmDsl2.g:4210:2: ( RULE_STRING )
            {
            // InternalUlmDsl2.g:4210:2: ( RULE_STRING )
            // InternalUlmDsl2.g:4211:3: RULE_STRING
            {
             before(grammarAccess.getLookupStringValueAccess().getDescriptionSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLookupStringValueAccess().getDescriptionSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupStringValue__DescriptionAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000003A00000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000270020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000070022L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000002100000F800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000070020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040100040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000200200020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000200000022L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000C0088000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001400000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000040L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000020200000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000008000000000L});

}