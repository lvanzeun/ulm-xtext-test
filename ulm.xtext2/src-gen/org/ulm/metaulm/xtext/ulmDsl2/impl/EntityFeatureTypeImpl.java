/**
 * generated by Xtext 2.14.0
 */
package org.ulm.metaulm.xtext.ulmDsl2.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.ulm.metaulm.xtext.ulmDsl2.Entity;
import org.ulm.metaulm.xtext.ulmDsl2.EntityFeatureType;
import org.ulm.metaulm.xtext.ulmDsl2.UlmDsl2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Feature Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ulm.metaulm.xtext.ulmDsl2.impl.EntityFeatureTypeImpl#getEntityType <em>Entity Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityFeatureTypeImpl extends MinimalEObjectImpl.Container implements EntityFeatureType
{
  /**
   * The cached value of the '{@link #getEntityType() <em>Entity Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntityType()
   * @generated
   * @ordered
   */
  protected Entity entityType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EntityFeatureTypeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return UlmDsl2Package.Literals.ENTITY_FEATURE_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity getEntityType()
  {
    if (entityType != null && entityType.eIsProxy())
    {
      InternalEObject oldEntityType = (InternalEObject)entityType;
      entityType = (Entity)eResolveProxy(oldEntityType);
      if (entityType != oldEntityType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, UlmDsl2Package.ENTITY_FEATURE_TYPE__ENTITY_TYPE, oldEntityType, entityType));
      }
    }
    return entityType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity basicGetEntityType()
  {
    return entityType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEntityType(Entity newEntityType)
  {
    Entity oldEntityType = entityType;
    entityType = newEntityType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UlmDsl2Package.ENTITY_FEATURE_TYPE__ENTITY_TYPE, oldEntityType, entityType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case UlmDsl2Package.ENTITY_FEATURE_TYPE__ENTITY_TYPE:
        if (resolve) return getEntityType();
        return basicGetEntityType();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case UlmDsl2Package.ENTITY_FEATURE_TYPE__ENTITY_TYPE:
        setEntityType((Entity)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case UlmDsl2Package.ENTITY_FEATURE_TYPE__ENTITY_TYPE:
        setEntityType((Entity)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case UlmDsl2Package.ENTITY_FEATURE_TYPE__ENTITY_TYPE:
        return entityType != null;
    }
    return super.eIsSet(featureID);
  }

} //EntityFeatureTypeImpl
