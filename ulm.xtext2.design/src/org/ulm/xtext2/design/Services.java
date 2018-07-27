package org.ulm.xtext2.design;

import java.util.List;
import java.util.stream.Collectors;

import org.ulm.metaulm.xtext.ulmDsl2.Attribute;
import org.ulm.metaulm.xtext.ulmDsl2.AttributeDecimalType;
import org.ulm.metaulm.xtext.ulmDsl2.AttributeFeatureType;
import org.ulm.metaulm.xtext.ulmDsl2.AttributeStringType;
import org.ulm.metaulm.xtext.ulmDsl2.AttributeType;
import org.ulm.metaulm.xtext.ulmDsl2.Entity;
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
			return attributefeatureType.getAttribute().getName();
		}
	}

	public String getNameOrAlias(EntityFeatureType entityfeatureType) {

		return "tutu";
//		Feature feature = (Feature) entityfeatureType.eContainer().eContainer();
//
//		if (feature.getName() != null) {
//			return feature.getName(); 
//		} else {
//			return  entityfeatureType.getEntity().getName();
//		}
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

	public String getNameOrAlias(Entity fromEntity, Entity toEntity) { 

		List<Feature> features = fromEntity.getFeatures().stream()
				.filter(f -> ((f.getType().getType() instanceof EntityFeatureType)
						&& ((EntityFeatureType) f.getType().getType()).getEntity().getName().equals(toEntity.getName())))
				.collect(Collectors.toList()); 

		return features.stream().map(f -> ( f.getName() != null ) ? f.getName() : toEntity.getName() ).collect(Collectors.toList()).toString();
	}
}
