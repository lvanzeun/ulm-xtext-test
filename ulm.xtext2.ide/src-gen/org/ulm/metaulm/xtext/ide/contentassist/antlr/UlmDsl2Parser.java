/*
 * generated by Xtext 2.12.0
 */
package org.ulm.metaulm.xtext.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.ulm.metaulm.xtext.ide.contentassist.antlr.internal.InternalUlmDsl2Parser;
import org.ulm.metaulm.xtext.services.UlmDsl2GrammarAccess;

public class UlmDsl2Parser extends AbstractContentAssistParser {

	@Inject
	private UlmDsl2GrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalUlmDsl2Parser createParser() {
		InternalUlmDsl2Parser result = new InternalUlmDsl2Parser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getBasicTypeAccess().getTypeNameAlternatives_0(), "rule__BasicType__TypeNameAlternatives_0");
					put(grammarAccess.getEntityAccess().getTypeAlternatives_0_0(), "rule__Entity__TypeAlternatives_0_0");
					put(grammarAccess.getFeatureTypeAccess().getTAlternatives_1_0(), "rule__FeatureType__TAlternatives_1_0");
					put(grammarAccess.getLookupAccess().getAlternatives_1(), "rule__Lookup__Alternatives_1");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getContextAccess().getGroup(), "rule__Context__Group__0");
					put(grammarAccess.getContextAccess().getGroup_4(), "rule__Context__Group_4__0");
					put(grammarAccess.getContextAccess().getGroup_5(), "rule__Context__Group_5__0");
					put(grammarAccess.getContextAccess().getGroup_6(), "rule__Context__Group_6__0");
					put(grammarAccess.getVersionAccess().getGroup(), "rule__Version__Group__0");
					put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
					put(grammarAccess.getAttributeTypeAccess().getGroup(), "rule__AttributeType__Group__0");
					put(grammarAccess.getAttributeTypeAccess().getGroup_1(), "rule__AttributeType__Group_1__0");
					put(grammarAccess.getEntityAccess().getGroup(), "rule__Entity__Group__0");
					put(grammarAccess.getEntityAccess().getGroup_4(), "rule__Entity__Group_4__0");
					put(grammarAccess.getEntityAccess().getGroup_6(), "rule__Entity__Group_6__0");
					put(grammarAccess.getFeatureAccess().getGroup(), "rule__Feature__Group__0");
					put(grammarAccess.getFeatureAccess().getGroup_3(), "rule__Feature__Group_3__0");
					put(grammarAccess.getFeatureTypeTypeAccess().getGroup(), "rule__FeatureTypeType__Group__0");
					put(grammarAccess.getFeatureTypeTypeAccess().getGroup_1(), "rule__FeatureTypeType__Group_1__0");
					put(grammarAccess.getFeatureTypeAccess().getGroup(), "rule__FeatureType__Group__0");
					put(grammarAccess.getAttributeFeatureTypeAccess().getGroup(), "rule__AttributeFeatureType__Group__0");
					put(grammarAccess.getEntityFeatureTypeAccess().getGroup(), "rule__EntityFeatureType__Group__0");
					put(grammarAccess.getLookupAccess().getGroup(), "rule__Lookup__Group__0");
					put(grammarAccess.getLookupIntAccess().getGroup(), "rule__LookupInt__Group__0");
					put(grammarAccess.getLookupIntAccess().getGroup_6(), "rule__LookupInt__Group_6__0");
					put(grammarAccess.getLookupStringAccess().getGroup(), "rule__LookupString__Group__0");
					put(grammarAccess.getLookupStringAccess().getGroup_6(), "rule__LookupString__Group_6__0");
					put(grammarAccess.getLookupIntValueAccess().getGroup(), "rule__LookupIntValue__Group__0");
					put(grammarAccess.getLookupStringValueAccess().getGroup(), "rule__LookupStringValue__Group__0");
					put(grammarAccess.getModelAccess().getNameAssignment_1(), "rule__Model__NameAssignment_1");
					put(grammarAccess.getModelAccess().getContextsAssignment_3(), "rule__Model__ContextsAssignment_3");
					put(grammarAccess.getContextAccess().getNameAssignment_1(), "rule__Context__NameAssignment_1");
					put(grammarAccess.getContextAccess().getVersionAssignment_2(), "rule__Context__VersionAssignment_2");
					put(grammarAccess.getContextAccess().getAttributesAssignment_4_2(), "rule__Context__AttributesAssignment_4_2");
					put(grammarAccess.getContextAccess().getLookupsAssignment_5_2(), "rule__Context__LookupsAssignment_5_2");
					put(grammarAccess.getContextAccess().getEntitiesAssignment_6_2(), "rule__Context__EntitiesAssignment_6_2");
					put(grammarAccess.getAttributeAccess().getTypeAssignment_1(), "rule__Attribute__TypeAssignment_1");
					put(grammarAccess.getAttributeAccess().getNameAssignment_2(), "rule__Attribute__NameAssignment_2");
					put(grammarAccess.getAttributeAccess().getDescAssignment_3(), "rule__Attribute__DescAssignment_3");
					put(grammarAccess.getAttributeTypeAccess().getTypeAssignment_0(), "rule__AttributeType__TypeAssignment_0");
					put(grammarAccess.getAttributeTypeAccess().getArrayAssignment_1_0(), "rule__AttributeType__ArrayAssignment_1_0");
					put(grammarAccess.getAttributeTypeAccess().getLengthAssignment_1_1(), "rule__AttributeType__LengthAssignment_1_1");
					put(grammarAccess.getBasicTypeAccess().getTypeNameAssignment(), "rule__BasicType__TypeNameAssignment");
					put(grammarAccess.getEntityAccess().getTypeAssignment_0(), "rule__Entity__TypeAssignment_0");
					put(grammarAccess.getEntityAccess().getNameAssignment_2(), "rule__Entity__NameAssignment_2");
					put(grammarAccess.getEntityAccess().getDescAssignment_3(), "rule__Entity__DescAssignment_3");
					put(grammarAccess.getEntityAccess().getSuperTypeAssignment_4_1(), "rule__Entity__SuperTypeAssignment_4_1");
					put(grammarAccess.getEntityAccess().getFeaturesAssignment_6_2(), "rule__Entity__FeaturesAssignment_6_2");
					put(grammarAccess.getFeatureAccess().getFeatureTypeAssignment_0(), "rule__Feature__FeatureTypeAssignment_0");
					put(grammarAccess.getFeatureAccess().getMandatoryAssignment_1(), "rule__Feature__MandatoryAssignment_1");
					put(grammarAccess.getFeatureAccess().getIdentifierAssignment_2(), "rule__Feature__IdentifierAssignment_2");
					put(grammarAccess.getFeatureAccess().getAliasAssignment_3_1(), "rule__Feature__AliasAssignment_3_1");
					put(grammarAccess.getFeatureTypeTypeAccess().getTypeAssignment_0(), "rule__FeatureTypeType__TypeAssignment_0");
					put(grammarAccess.getFeatureTypeTypeAccess().getArrayAssignment_1_0(), "rule__FeatureTypeType__ArrayAssignment_1_0");
					put(grammarAccess.getFeatureTypeTypeAccess().getLengthAssignment_1_1(), "rule__FeatureTypeType__LengthAssignment_1_1");
					put(grammarAccess.getFeatureTypeAccess().getTAssignment_1(), "rule__FeatureType__TAssignment_1");
					put(grammarAccess.getAttributeFeatureTypeAccess().getAttributeTypeAssignment_1(), "rule__AttributeFeatureType__AttributeTypeAssignment_1");
					put(grammarAccess.getEntityFeatureTypeAccess().getEntityTypeAssignment_1(), "rule__EntityFeatureType__EntityTypeAssignment_1");
					put(grammarAccess.getLookupIntAccess().getNameAssignment_1(), "rule__LookupInt__NameAssignment_1");
					put(grammarAccess.getLookupIntAccess().getDescriptionAssignment_2(), "rule__LookupInt__DescriptionAssignment_2");
					put(grammarAccess.getLookupIntAccess().getValuesAssignment_5(), "rule__LookupInt__ValuesAssignment_5");
					put(grammarAccess.getLookupIntAccess().getValuesAssignment_6_1(), "rule__LookupInt__ValuesAssignment_6_1");
					put(grammarAccess.getLookupStringAccess().getNameAssignment_1(), "rule__LookupString__NameAssignment_1");
					put(grammarAccess.getLookupStringAccess().getDescriptionAssignment_2(), "rule__LookupString__DescriptionAssignment_2");
					put(grammarAccess.getLookupStringAccess().getValuesAssignment_5(), "rule__LookupString__ValuesAssignment_5");
					put(grammarAccess.getLookupStringAccess().getValuesAssignment_6_1(), "rule__LookupString__ValuesAssignment_6_1");
					put(grammarAccess.getLookupIntValueAccess().getValueAssignment_2(), "rule__LookupIntValue__ValueAssignment_2");
					put(grammarAccess.getLookupIntValueAccess().getDescriptionAssignment_3(), "rule__LookupIntValue__DescriptionAssignment_3");
					put(grammarAccess.getLookupStringValueAccess().getValueAssignment_2(), "rule__LookupStringValue__ValueAssignment_2");
					put(grammarAccess.getLookupStringValueAccess().getDescriptionAssignment_3(), "rule__LookupStringValue__DescriptionAssignment_3");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public UlmDsl2GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(UlmDsl2GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
