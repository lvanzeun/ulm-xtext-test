package org.ulm.xtext2.design;

import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;

import org.ulm.metaulm.xtext.ulmDsl2.Entity;
import org.ulm.metaulm.xtext.ulmDsl2.EntityFeatureType;
import org.ulm.metaulm.xtext.ulmDsl2.Feature;

/**
 * The services class used by VSM.
 */
public class Services {
    
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
    public EObject myService(EObject self, String arg) {
       // TODO Auto-generated code
      return self;
    }
    
    public Set<Feature> allEntityFeatureType(Entity entity) {
    	
    	return entity.getFeatures().stream().filter(e -> e.getFeatureType().getType().getT() instanceof EntityFeatureType).collect(Collectors.toSet());
    }
}
