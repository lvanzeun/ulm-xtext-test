/**
 * generated by Xtext 2.14.0
 */
package org.ulm.metaulm.xtext.ulmDsl2.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.ulm.metaulm.xtext.ulmDsl2.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.ulm.metaulm.xtext.ulmDsl2.UlmDsl2Package
 * @generated
 */
public class UlmDsl2AdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static UlmDsl2Package modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UlmDsl2AdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = UlmDsl2Package.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UlmDsl2Switch<Adapter> modelSwitch =
    new UlmDsl2Switch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseContext(Context object)
      {
        return createContextAdapter();
      }
      @Override
      public Adapter caseAttribute(Attribute object)
      {
        return createAttributeAdapter();
      }
      @Override
      public Adapter caseAttributeType(AttributeType object)
      {
        return createAttributeTypeAdapter();
      }
      @Override
      public Adapter caseBasicType(BasicType object)
      {
        return createBasicTypeAdapter();
      }
      @Override
      public Adapter caseEntity(Entity object)
      {
        return createEntityAdapter();
      }
      @Override
      public Adapter caseFeature(Feature object)
      {
        return createFeatureAdapter();
      }
      @Override
      public Adapter caseFeatureTypeType(FeatureTypeType object)
      {
        return createFeatureTypeTypeAdapter();
      }
      @Override
      public Adapter caseFeatureType(FeatureType object)
      {
        return createFeatureTypeAdapter();
      }
      @Override
      public Adapter caseAttributeFeatureType(AttributeFeatureType object)
      {
        return createAttributeFeatureTypeAdapter();
      }
      @Override
      public Adapter caseEntityFeatureType(EntityFeatureType object)
      {
        return createEntityFeatureTypeAdapter();
      }
      @Override
      public Adapter caseLookup(Lookup object)
      {
        return createLookupAdapter();
      }
      @Override
      public Adapter caseLookupInt(LookupInt object)
      {
        return createLookupIntAdapter();
      }
      @Override
      public Adapter caseLookupString(LookupString object)
      {
        return createLookupStringAdapter();
      }
      @Override
      public Adapter caseLookupIntValue(LookupIntValue object)
      {
        return createLookupIntValueAdapter();
      }
      @Override
      public Adapter caseLookupStringValue(LookupStringValue object)
      {
        return createLookupStringValueAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.ulm.metaulm.xtext.ulmDsl2.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ulm.metaulm.xtext.ulmDsl2.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ulm.metaulm.xtext.ulmDsl2.Context <em>Context</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ulm.metaulm.xtext.ulmDsl2.Context
   * @generated
   */
  public Adapter createContextAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ulm.metaulm.xtext.ulmDsl2.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ulm.metaulm.xtext.ulmDsl2.Attribute
   * @generated
   */
  public Adapter createAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ulm.metaulm.xtext.ulmDsl2.AttributeType <em>Attribute Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ulm.metaulm.xtext.ulmDsl2.AttributeType
   * @generated
   */
  public Adapter createAttributeTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ulm.metaulm.xtext.ulmDsl2.BasicType <em>Basic Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ulm.metaulm.xtext.ulmDsl2.BasicType
   * @generated
   */
  public Adapter createBasicTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ulm.metaulm.xtext.ulmDsl2.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ulm.metaulm.xtext.ulmDsl2.Entity
   * @generated
   */
  public Adapter createEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ulm.metaulm.xtext.ulmDsl2.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ulm.metaulm.xtext.ulmDsl2.Feature
   * @generated
   */
  public Adapter createFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ulm.metaulm.xtext.ulmDsl2.FeatureTypeType <em>Feature Type Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ulm.metaulm.xtext.ulmDsl2.FeatureTypeType
   * @generated
   */
  public Adapter createFeatureTypeTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ulm.metaulm.xtext.ulmDsl2.FeatureType <em>Feature Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ulm.metaulm.xtext.ulmDsl2.FeatureType
   * @generated
   */
  public Adapter createFeatureTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ulm.metaulm.xtext.ulmDsl2.AttributeFeatureType <em>Attribute Feature Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ulm.metaulm.xtext.ulmDsl2.AttributeFeatureType
   * @generated
   */
  public Adapter createAttributeFeatureTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ulm.metaulm.xtext.ulmDsl2.EntityFeatureType <em>Entity Feature Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ulm.metaulm.xtext.ulmDsl2.EntityFeatureType
   * @generated
   */
  public Adapter createEntityFeatureTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ulm.metaulm.xtext.ulmDsl2.Lookup <em>Lookup</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ulm.metaulm.xtext.ulmDsl2.Lookup
   * @generated
   */
  public Adapter createLookupAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ulm.metaulm.xtext.ulmDsl2.LookupInt <em>Lookup Int</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ulm.metaulm.xtext.ulmDsl2.LookupInt
   * @generated
   */
  public Adapter createLookupIntAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ulm.metaulm.xtext.ulmDsl2.LookupString <em>Lookup String</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ulm.metaulm.xtext.ulmDsl2.LookupString
   * @generated
   */
  public Adapter createLookupStringAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ulm.metaulm.xtext.ulmDsl2.LookupIntValue <em>Lookup Int Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ulm.metaulm.xtext.ulmDsl2.LookupIntValue
   * @generated
   */
  public Adapter createLookupIntValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ulm.metaulm.xtext.ulmDsl2.LookupStringValue <em>Lookup String Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ulm.metaulm.xtext.ulmDsl2.LookupStringValue
   * @generated
   */
  public Adapter createLookupStringValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //UlmDsl2AdapterFactory
