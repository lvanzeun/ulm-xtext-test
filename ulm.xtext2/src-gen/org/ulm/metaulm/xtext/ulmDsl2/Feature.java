/**
 * generated by Xtext 2.14.0
 */
package org.ulm.metaulm.xtext.ulmDsl2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ulm.metaulm.xtext.ulmDsl2.Feature#getType <em>Type</em>}</li>
 *   <li>{@link org.ulm.metaulm.xtext.ulmDsl2.Feature#isMandatory <em>Mandatory</em>}</li>
 *   <li>{@link org.ulm.metaulm.xtext.ulmDsl2.Feature#isIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.ulm.metaulm.xtext.ulmDsl2.Feature#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.ulm.metaulm.xtext.ulmDsl2.UlmDsl2Package#getFeature()
 * @model
 * @generated
 */
public interface Feature extends EObject
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
   * @see org.ulm.metaulm.xtext.ulmDsl2.UlmDsl2Package#getFeature_Type()
   * @model containment="true"
   * @generated
   */
  FeatureType getType();

  /**
   * Sets the value of the '{@link org.ulm.metaulm.xtext.ulmDsl2.Feature#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(FeatureType value);

  /**
   * Returns the value of the '<em><b>Mandatory</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mandatory</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mandatory</em>' attribute.
   * @see #setMandatory(boolean)
   * @see org.ulm.metaulm.xtext.ulmDsl2.UlmDsl2Package#getFeature_Mandatory()
   * @model
   * @generated
   */
  boolean isMandatory();

  /**
   * Sets the value of the '{@link org.ulm.metaulm.xtext.ulmDsl2.Feature#isMandatory <em>Mandatory</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mandatory</em>' attribute.
   * @see #isMandatory()
   * @generated
   */
  void setMandatory(boolean value);

  /**
   * Returns the value of the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Identifier</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Identifier</em>' attribute.
   * @see #setIdentifier(boolean)
   * @see org.ulm.metaulm.xtext.ulmDsl2.UlmDsl2Package#getFeature_Identifier()
   * @model
   * @generated
   */
  boolean isIdentifier();

  /**
   * Sets the value of the '{@link org.ulm.metaulm.xtext.ulmDsl2.Feature#isIdentifier <em>Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identifier</em>' attribute.
   * @see #isIdentifier()
   * @generated
   */
  void setIdentifier(boolean value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.ulm.metaulm.xtext.ulmDsl2.UlmDsl2Package#getFeature_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.ulm.metaulm.xtext.ulmDsl2.Feature#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Feature
