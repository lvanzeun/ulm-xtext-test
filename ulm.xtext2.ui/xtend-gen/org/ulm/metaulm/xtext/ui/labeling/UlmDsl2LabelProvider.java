/**
 * generated by Xtext 2.12.0
 */
package org.ulm.metaulm.xtext.ui.labeling;

import com.google.inject.Inject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;
import org.ulm.metaulm.xtext.ulmDsl2.AttributeFeatureType;
import org.ulm.metaulm.xtext.ulmDsl2.EntityFeatureType;
import org.ulm.metaulm.xtext.ulmDsl2.Feature;
import org.ulm.metaulm.xtext.ulmDsl2.FeatureType;

/**
 * Provides labels for EObjects.
 * 
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#label-provider
 */
@SuppressWarnings("all")
public class UlmDsl2LabelProvider extends DefaultEObjectLabelProvider {
  @Inject
  public UlmDsl2LabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
  
  public String _text(final Feature f) {
    String _xifexpression = null;
    String _alias = f.getAlias();
    boolean _tripleEquals = (_alias == null);
    if (_tripleEquals) {
      String _xblockexpression = null;
      {
        final FeatureType ft = f.getFeatureType().getType();
        String _xifexpression_1 = null;
        if ((ft instanceof AttributeFeatureType)) {
          String _xblockexpression_1 = null;
          {
            final AttributeFeatureType fta = ((AttributeFeatureType) ft);
            _xblockexpression_1 = fta.getAttributeType().getName();
          }
          _xifexpression_1 = _xblockexpression_1;
        } else {
          String _xblockexpression_2 = null;
          {
            final EntityFeatureType fte = ((EntityFeatureType) ft);
            _xblockexpression_2 = fte.getEntityType().getName();
          }
          _xifexpression_1 = _xblockexpression_2;
        }
        _xblockexpression = _xifexpression_1;
      }
      _xifexpression = _xblockexpression;
    } else {
      _xifexpression = f.getAlias();
    }
    return _xifexpression;
  }
}