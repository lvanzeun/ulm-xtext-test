/*
 * generated by Xtext 2.12.0
 */
package org.ulm.metaulm.xtext.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.ulm.metaulm.xtext.services.UlmDsl2GrammarAccess;
import org.ulm.metaulm.xtext.ulmDsl2.Attribute;
import org.ulm.metaulm.xtext.ulmDsl2.AttributeFeatureType;
import org.ulm.metaulm.xtext.ulmDsl2.AttributeType;
import org.ulm.metaulm.xtext.ulmDsl2.BasicType;
import org.ulm.metaulm.xtext.ulmDsl2.Context;
import org.ulm.metaulm.xtext.ulmDsl2.Entity;
import org.ulm.metaulm.xtext.ulmDsl2.EntityFeatureType;
import org.ulm.metaulm.xtext.ulmDsl2.Feature;
import org.ulm.metaulm.xtext.ulmDsl2.FeatureType;
import org.ulm.metaulm.xtext.ulmDsl2.FeatureTypeType;
import org.ulm.metaulm.xtext.ulmDsl2.LookupInt;
import org.ulm.metaulm.xtext.ulmDsl2.LookupIntValue;
import org.ulm.metaulm.xtext.ulmDsl2.LookupString;
import org.ulm.metaulm.xtext.ulmDsl2.LookupStringValue;
import org.ulm.metaulm.xtext.ulmDsl2.Model;
import org.ulm.metaulm.xtext.ulmDsl2.UlmDsl2Package;

@SuppressWarnings("all")
public class UlmDsl2SemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private UlmDsl2GrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == UlmDsl2Package.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case UlmDsl2Package.ATTRIBUTE:
				sequence_Attribute(context, (Attribute) semanticObject); 
				return; 
			case UlmDsl2Package.ATTRIBUTE_FEATURE_TYPE:
				sequence_AttributeFeatureType(context, (AttributeFeatureType) semanticObject); 
				return; 
			case UlmDsl2Package.ATTRIBUTE_TYPE:
				sequence_AttributeType(context, (AttributeType) semanticObject); 
				return; 
			case UlmDsl2Package.BASIC_TYPE:
				sequence_BasicType(context, (BasicType) semanticObject); 
				return; 
			case UlmDsl2Package.CONTEXT:
				sequence_Context(context, (Context) semanticObject); 
				return; 
			case UlmDsl2Package.ENTITY:
				sequence_Entity(context, (Entity) semanticObject); 
				return; 
			case UlmDsl2Package.ENTITY_FEATURE_TYPE:
				sequence_EntityFeatureType(context, (EntityFeatureType) semanticObject); 
				return; 
			case UlmDsl2Package.FEATURE:
				sequence_Feature(context, (Feature) semanticObject); 
				return; 
			case UlmDsl2Package.FEATURE_TYPE:
				sequence_FeatureType(context, (FeatureType) semanticObject); 
				return; 
			case UlmDsl2Package.FEATURE_TYPE_TYPE:
				sequence_FeatureTypeType(context, (FeatureTypeType) semanticObject); 
				return; 
			case UlmDsl2Package.LOOKUP_INT:
				sequence_LookupInt(context, (LookupInt) semanticObject); 
				return; 
			case UlmDsl2Package.LOOKUP_INT_VALUE:
				sequence_LookupIntValue(context, (LookupIntValue) semanticObject); 
				return; 
			case UlmDsl2Package.LOOKUP_STRING:
				sequence_LookupString(context, (LookupString) semanticObject); 
				return; 
			case UlmDsl2Package.LOOKUP_STRING_VALUE:
				sequence_LookupStringValue(context, (LookupStringValue) semanticObject); 
				return; 
			case UlmDsl2Package.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     AttributeFeatureType returns AttributeFeatureType
	 *
	 * Constraint:
	 *     attributeType=[Attribute|ID]
	 */
	protected void sequence_AttributeFeatureType(ISerializationContext context, AttributeFeatureType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UlmDsl2Package.Literals.ATTRIBUTE_FEATURE_TYPE__ATTRIBUTE_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UlmDsl2Package.Literals.ATTRIBUTE_FEATURE_TYPE__ATTRIBUTE_TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAttributeFeatureTypeAccess().getAttributeTypeAttributeIDTerminalRuleCall_1_0_1(), semanticObject.eGet(UlmDsl2Package.Literals.ATTRIBUTE_FEATURE_TYPE__ATTRIBUTE_TYPE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AttributeType returns AttributeType
	 *
	 * Constraint:
	 *     (type=BasicType (array?='[' length=INT?)?)
	 */
	protected void sequence_AttributeType(ISerializationContext context, AttributeType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Attribute returns Attribute
	 *
	 * Constraint:
	 *     (type=AttributeType name=ID desc=STRING?)
	 */
	protected void sequence_Attribute(ISerializationContext context, Attribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     BasicType returns BasicType
	 *
	 * Constraint:
	 *     (
	 *         typeName='string' | 
	 *         typeName='int' | 
	 *         typeName='decimal' | 
	 *         typeName='boolean' | 
	 *         typeName='date' | 
	 *         typeName='datetime' | 
	 *         typeName='timestamp'
	 *     )
	 */
	protected void sequence_BasicType(ISerializationContext context, BasicType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Context returns Context
	 *
	 * Constraint:
	 *     (name=ID version=Version attributes+=Attribute* lookups+=Lookup* entities+=Entity*)
	 */
	protected void sequence_Context(ISerializationContext context, Context semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EntityFeatureType returns EntityFeatureType
	 *
	 * Constraint:
	 *     entityType=[Entity|ID]
	 */
	protected void sequence_EntityFeatureType(ISerializationContext context, EntityFeatureType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UlmDsl2Package.Literals.ENTITY_FEATURE_TYPE__ENTITY_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UlmDsl2Package.Literals.ENTITY_FEATURE_TYPE__ENTITY_TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEntityFeatureTypeAccess().getEntityTypeEntityIDTerminalRuleCall_1_0_1(), semanticObject.eGet(UlmDsl2Package.Literals.ENTITY_FEATURE_TYPE__ENTITY_TYPE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Entity returns Entity
	 *
	 * Constraint:
	 *     ((type='data' | type='static' | type='lookup')? name=ID desc=STRING? superType=[Entity|ID]? features+=Feature*)
	 */
	protected void sequence_Entity(ISerializationContext context, Entity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FeatureTypeType returns FeatureTypeType
	 *
	 * Constraint:
	 *     (type=FeatureType (array?='[' length=INT?)?)
	 */
	protected void sequence_FeatureTypeType(ISerializationContext context, FeatureTypeType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FeatureType returns FeatureType
	 *
	 * Constraint:
	 *     (t=AttributeFeatureType | t=EntityFeatureType)
	 */
	protected void sequence_FeatureType(ISerializationContext context, FeatureType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Feature returns Feature
	 *
	 * Constraint:
	 *     (featureType=FeatureTypeType mandatory?='mandatory'? identifier?='identifier'? alias=ID?)
	 */
	protected void sequence_Feature(ISerializationContext context, Feature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     LookupIntValue returns LookupIntValue
	 *
	 * Constraint:
	 *     (value=INT description=STRING)
	 */
	protected void sequence_LookupIntValue(ISerializationContext context, LookupIntValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UlmDsl2Package.Literals.LOOKUP_INT_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UlmDsl2Package.Literals.LOOKUP_INT_VALUE__VALUE));
			if (transientValues.isValueTransient(semanticObject, UlmDsl2Package.Literals.LOOKUP_INT_VALUE__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UlmDsl2Package.Literals.LOOKUP_INT_VALUE__DESCRIPTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLookupIntValueAccess().getValueINTTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getLookupIntValueAccess().getDescriptionSTRINGTerminalRuleCall_3_0(), semanticObject.getDescription());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Lookup returns LookupInt
	 *     LookupInt returns LookupInt
	 *
	 * Constraint:
	 *     (name=ID description=STRING? values+=LookupIntValue values+=LookupIntValue*)
	 */
	protected void sequence_LookupInt(ISerializationContext context, LookupInt semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     LookupStringValue returns LookupStringValue
	 *
	 * Constraint:
	 *     (value=STRING description=STRING)
	 */
	protected void sequence_LookupStringValue(ISerializationContext context, LookupStringValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UlmDsl2Package.Literals.LOOKUP_STRING_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UlmDsl2Package.Literals.LOOKUP_STRING_VALUE__VALUE));
			if (transientValues.isValueTransient(semanticObject, UlmDsl2Package.Literals.LOOKUP_STRING_VALUE__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UlmDsl2Package.Literals.LOOKUP_STRING_VALUE__DESCRIPTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLookupStringValueAccess().getValueSTRINGTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getLookupStringValueAccess().getDescriptionSTRINGTerminalRuleCall_3_0(), semanticObject.getDescription());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Lookup returns LookupString
	 *     LookupString returns LookupString
	 *
	 * Constraint:
	 *     (name=ID description=STRING? values+=LookupStringValue values+=LookupStringValue*)
	 */
	protected void sequence_LookupString(ISerializationContext context, LookupString semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (name=ID contexts+=Context*)
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}