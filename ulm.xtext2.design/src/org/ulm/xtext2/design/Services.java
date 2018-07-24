package org.ulm.xtext2.design;

import org.ulm.metaulm.xtext.ulmDsl2.AttributeFeatureType;
import org.ulm.metaulm.xtext.ulmDsl2.Feature;

/**
 * The services class used by VSM.
 */
public class Services {

	public String getNameOrAlias(AttributeFeatureType attribute) {

		Feature feature = (Feature) attribute.eContainer().eContainer().eContainer();
		return feature.getAlias() != null ? feature.getAlias() : attribute.getAttributeType().getName();
	}

}
