package org.ulm.xtext2.design;

import org.ulm.metaulm.xtext.ulmDsl2.Attribute;
import org.ulm.metaulm.xtext.ulmDsl2.AttributeFeatureType;
import org.ulm.metaulm.xtext.ulmDsl2.EntityFeatureType;
import org.ulm.metaulm.xtext.ulmDsl2.Feature;

/**
 * The services class used by VSM.
 */
public class Services {

	public String getNameOrAlias(AttributeFeatureType attributefeatureType) {
		Feature feature = (Feature) attributefeatureType.eContainer().eContainer();

		if (feature.getName() != null) {
			return feature.getName();
		} else {
			return  attributefeatureType.getAttribute().getName();
		}
	}
	
	public String getNameOrAlias(EntityFeatureType entityfeatureType) {
		Feature feature = (Feature) entityfeatureType.eContainer().eContainer();

		if (feature.getName() != null) {
			return feature.getName();
		} else {
			return  entityfeatureType.getEntity().getName();
		}
	}

	public String getAttributeTypeAsString(Attribute attribute) {
		return "tutu";
//		if (attribute.getType() instanceof AttributeStringType) {
//			return ((AttributeStringType) attribute.getType()).getName();
//		} else if (attribute.getType() instanceof AttributeDecimalType) {
//			return ((AttributeDecimalType) attribute.getType()).getName();
//		} else {
//			return ((AttributeType) attribute.getType()).getName();
//		}
	}
}
