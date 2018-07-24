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
 *   <li>{@link org.ulm.metaulm.xtext.ulmDsl2.Feature#getFeatureType <em>Feature Type</em>}</li>
 *   <li>{@link org.ulm.metaulm.xtext.ulmDsl2.Feature#isMandatory <em>Mandatory</em>}</li>
 *   <li>{@link org.ulm.metaulm.xtext.ulmDsl2.Feature#isIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.ulm.metaulm.xtext.ulmDsl2.Feature#getAlias <em>Alias</em>}</li>
 * </ul>
 *
 * @see org.ulm.metaulm.xtext.ulmDsl2.UlmDsl2Package#getFeature()
 * @model
 * @generated
 */
public interface Feature extends EObject
{
  /**
   * Returns the value of the '<em><b>Feature Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature Type</em>' containment reference.
   * @see #setFeatureType(FeatureTypeType)
   * @see org.ulm.metaulm.xtext.ulmDsl2.UlmDsl2Package#getFeature_FeatureType()
   * @model containment="true"
   * @generated
   */
  FeatureTypeType getFeatureType();

  /**
   * Sets the value of the '{@link org.ulm.metaulm.xtext.ulmDsl2.Feature#getFeatureType <em>Feature Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Feature Type</em>' containment reference.
   * @see #getFeatureType()
   * @generated
   */
  void setFeatureType(FeatureTypeType value);

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
   * Returns the value of the '<em><b>Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Alias</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Alias</em>' attribute.
   * @see #setAlias(String)
   * @see org.ulm.metaulm.xtext.ulmDsl2.UlmDsl2Package#getFeature_Alias()
   * @model
   * @generated
   */
  String getAlias();

  /**
   * Sets the value of the '{@link org.ulm.metaulm.xtext.ulmDsl2.Feature#getAlias <em>Alias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Alias</em>' attribute.
   * @see #getAlias()
   * @generated
   */
  void setAlias(String value);

} // Feature
