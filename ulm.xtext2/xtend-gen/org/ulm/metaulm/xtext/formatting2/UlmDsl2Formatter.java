/**
 * generated by Xtext 2.12.0
 */
package org.ulm.metaulm.xtext.formatting2;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.IHiddenRegionFormatter;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.ulm.metaulm.xtext.services.UlmDsl2GrammarAccess;
import org.ulm.metaulm.xtext.ulmDsl2.Attribute;
import org.ulm.metaulm.xtext.ulmDsl2.Context;
import org.ulm.metaulm.xtext.ulmDsl2.Entity;
import org.ulm.metaulm.xtext.ulmDsl2.Feature;
import org.ulm.metaulm.xtext.ulmDsl2.Lookup;
import org.ulm.metaulm.xtext.ulmDsl2.Model;

@SuppressWarnings("all")
public class UlmDsl2Formatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private UlmDsl2GrammarAccess _ulmDsl2GrammarAccess;
  
  protected void _format(final Model model, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
      it.indent();
    };
    document.<ISemanticRegion, ISemanticRegion>interior(
      document.append(document.prepend(this.textRegionExtensions.regionFor(model).keyword(this._ulmDsl2GrammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2()), _function), _function_1), 
      document.prepend(this.textRegionExtensions.regionFor(model).keyword(this._ulmDsl2GrammarAccess.getModelAccess().getRightCurlyBracketKeyword_4()), _function_2), _function_3);
    EList<Context> _contexts = model.getContexts();
    for (final Context context : _contexts) {
      document.<Context>format(context);
    }
  }
  
  protected void _format(final Context context, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
      it.indent();
    };
    document.<ISemanticRegion, ISemanticRegion>interior(
      document.append(document.prepend(this.textRegionExtensions.regionFor(context).keyword(this._ulmDsl2GrammarAccess.getContextAccess().getLeftCurlyBracketKeyword_3()), _function), _function_1), 
      document.prepend(this.textRegionExtensions.regionFor(context).keyword(this._ulmDsl2GrammarAccess.getContextAccess().getRightCurlyBracketKeyword_7()), _function_2), _function_3);
    final Procedure1<IHiddenRegionFormatter> _function_4 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    final Procedure1<IHiddenRegionFormatter> _function_5 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    final Procedure1<IHiddenRegionFormatter> _function_6 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    final Procedure1<IHiddenRegionFormatter> _function_7 = (IHiddenRegionFormatter it) -> {
      it.indent();
    };
    document.<ISemanticRegion, ISemanticRegion>interior(
      document.append(document.prepend(this.textRegionExtensions.regionFor(context).keyword(this._ulmDsl2GrammarAccess.getContextAccess().getLeftCurlyBracketKeyword_4_1()), _function_4), _function_5), 
      document.prepend(this.textRegionExtensions.regionFor(context).keyword(this._ulmDsl2GrammarAccess.getContextAccess().getRightCurlyBracketKeyword_4_3()), _function_6), _function_7);
    this.textRegionExtensions.regionFor(context).keyword("attributes");
    EList<Attribute> _attributes = context.getAttributes();
    for (final Attribute attribute : _attributes) {
      document.<Attribute>format(attribute);
    }
    final Procedure1<IHiddenRegionFormatter> _function_8 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    final Procedure1<IHiddenRegionFormatter> _function_9 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    final Procedure1<IHiddenRegionFormatter> _function_10 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    final Procedure1<IHiddenRegionFormatter> _function_11 = (IHiddenRegionFormatter it) -> {
      it.indent();
    };
    document.<ISemanticRegion, ISemanticRegion>interior(
      document.append(document.prepend(this.textRegionExtensions.regionFor(context).keyword(this._ulmDsl2GrammarAccess.getContextAccess().getLeftCurlyBracketKeyword_5_1()), _function_8), _function_9), 
      document.prepend(this.textRegionExtensions.regionFor(context).keyword(this._ulmDsl2GrammarAccess.getContextAccess().getRightCurlyBracketKeyword_5_3()), _function_10), _function_11);
    this.textRegionExtensions.regionFor(context).keyword("lookups");
    EList<Lookup> _lookups = context.getLookups();
    for (final Lookup lookup : _lookups) {
      document.<Lookup>format(lookup);
    }
    final Procedure1<IHiddenRegionFormatter> _function_12 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    final Procedure1<IHiddenRegionFormatter> _function_13 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    final Procedure1<IHiddenRegionFormatter> _function_14 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    final Procedure1<IHiddenRegionFormatter> _function_15 = (IHiddenRegionFormatter it) -> {
      it.indent();
    };
    document.<ISemanticRegion, ISemanticRegion>interior(
      document.append(document.prepend(this.textRegionExtensions.regionFor(context).keyword(this._ulmDsl2GrammarAccess.getContextAccess().getLeftCurlyBracketKeyword_6_1()), _function_12), _function_13), 
      document.prepend(this.textRegionExtensions.regionFor(context).keyword(this._ulmDsl2GrammarAccess.getContextAccess().getRightCurlyBracketKeyword_6_3()), _function_14), _function_15);
    this.textRegionExtensions.regionFor(context).keyword("entities");
    EList<Entity> _entities = context.getEntities();
    for (final Entity entity : _entities) {
      document.<Entity>format(entity);
    }
  }
  
  protected void _format(final Lookup lookup, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.append(document.prepend(this.textRegionExtensions.regionFor(lookup).keyword(","), _function), _function_1);
  }
  
  protected void _format(final Entity entity, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    final Procedure1<IHiddenRegionFormatter> _function_4 = (IHiddenRegionFormatter it) -> {
      it.indent();
    };
    document.<ISemanticRegion, ISemanticRegion>interior(
      document.append(document.prepend(this.textRegionExtensions.regionFor(entity).keyword(this._ulmDsl2GrammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4()), _function), _function_1), 
      document.append(document.prepend(this.textRegionExtensions.regionFor(entity).keyword(this._ulmDsl2GrammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6()), _function_2), _function_3), _function_4);
    final Procedure1<IHiddenRegionFormatter> _function_5 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(this.textRegionExtensions.regionFor(entity).keyword("data"), _function_5);
    EList<Feature> _features = entity.getFeatures();
    for (final Feature feature : _features) {
      document.<Feature>format(feature);
    }
  }
  
  protected void _format(final Attribute attribute, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(this.textRegionExtensions.regionFor(attribute).keyword("attribute"), _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.append(this.textRegionExtensions.regionFor(attribute).keyword(";"), _function_1);
  }
  
  protected void _format(final Feature feature, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(this.textRegionExtensions.regionFor(feature).keyword("feature"), _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.append(document.prepend(this.textRegionExtensions.regionFor(feature).keyword(";"), _function_1), _function_2);
  }
  
  public void format(final Object attribute, final IFormattableDocument document) {
    if (attribute instanceof XtextResource) {
      _format((XtextResource)attribute, document);
      return;
    } else if (attribute instanceof Attribute) {
      _format((Attribute)attribute, document);
      return;
    } else if (attribute instanceof Context) {
      _format((Context)attribute, document);
      return;
    } else if (attribute instanceof Entity) {
      _format((Entity)attribute, document);
      return;
    } else if (attribute instanceof Feature) {
      _format((Feature)attribute, document);
      return;
    } else if (attribute instanceof Lookup) {
      _format((Lookup)attribute, document);
      return;
    } else if (attribute instanceof Model) {
      _format((Model)attribute, document);
      return;
    } else if (attribute instanceof EObject) {
      _format((EObject)attribute, document);
      return;
    } else if (attribute == null) {
      _format((Void)null, document);
      return;
    } else if (attribute != null) {
      _format(attribute, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(attribute, document).toString());
    }
  }
}
