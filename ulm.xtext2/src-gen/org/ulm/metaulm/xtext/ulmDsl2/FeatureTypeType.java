/**
 * generated by Xtext 2.12.0
 */
package org.ulm.metaulm.xtext.ulmDsl2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Type Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ulm.metaulm.xtext.ulmDsl2.FeatureTypeType#getType <em>Type</em>}</li>
 *   <li>{@link org.ulm.metaulm.xtext.ulmDsl2.FeatureTypeType#isArray <em>Array</em>}</li>
 *   <li>{@link org.ulm.metaulm.xtext.ulmDsl2.FeatureTypeType#getLength <em>Length</em>}</li>
 * </ul>
 *
 * @see org.ulm.metaulm.xtext.ulmDsl2.UlmDsl2Package#getFeatureTypeType()
 * @model
 * @generated
 */
public interface FeatureTypeType extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(FeatureType)
   * @see org.ulm.metaulm.xtext.ulmDsl2.UlmDsl2Package#getFeatureTypeType_Type()
   * @model containment="true"
   * @generated
   */
  FeatureType getType();

  /**
   * Sets the value of the '{@link org.ulm.metaulm.xtext.ulmDsl2.FeatureTypeType#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(FeatureType value);

  /**
   * Returns the value of the '<em><b>Array</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Array</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Array</em>' attribute.
   * @see #setArray(boolean)
   * @see org.ulm.metaulm.xtext.ulmDsl2.UlmDsl2Package#getFeatureTypeType_Array()
   * @model
   * @generated
   */
  boolean isArray();

  /**
   * Sets the value of the '{@link org.ulm.metaulm.xtext.ulmDsl2.FeatureTypeType#isArray <em>Array</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Array</em>' attribute.
   * @see #isArray()
   * @generated
   */
  void setArray(boolean value);

  /**
   * Returns the value of the '<em><b>Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Length</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Length</em>' attribute.
   * @see #setLength(int)
   * @see org.ulm.metaulm.xtext.ulmDsl2.UlmDsl2Package#getFeatureTypeType_Length()
   * @model
   * @generated
   */
  int getLength();

  /**
   * Sets the value of the '{@link org.ulm.metaulm.xtext.ulmDsl2.FeatureTypeType#getLength <em>Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Length</em>' attribute.
   * @see #getLength()
   * @generated
   */
  void setLength(int value);

} // FeatureTypeType