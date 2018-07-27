package org.ulm.xtext2.design;

import org.ulm.metaulm.xtext.ulmDsl2.Attribute;
import org.ulm.metaulm.xtext.ulmDsl2.AttributeDecimalType;
import org.ulm.metaulm.xtext.ulmDsl2.AttributeStringType;
import org.ulm.metaulm.xtext.ulmDsl2.AttributeType;
import org.ulm.metaulm.xtext.ulmDsl2.AttributeFeatureType;
import org.ulm.metaulm.xtext.ulmDsl2.Feature;

/**
 * The services class used by VSM.
 */
public class Services {

	public String getNameOrAlias(AttributeFeatureType attribute) {

		Feature feature = (Feature) attribute.eContainer().eContainer().eContainer();
		return feature.getName() != null ? feature.getName() : attribute.getAttribute().getName();
	}

	public String getAttributeTypeAsString(Attribute attribute) {

		if (attribute.getType() instanceof AttributeStringType) {
			return ((AttributeStringType) attribute.getType()).getName();
		} else if (attribute.getType() instanceof AttributeDecimalType) {
			return ((AttributeDecimalType) attribute.getType()).getName();
		} else {
			return ((AttributeType) attribute.getType()).getName();
		}
	}
}
