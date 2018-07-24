/**
 * generated by Xtext 2.14.0
 */
package org.ulm.metaulm.xtext.ulmDsl2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lookup Int</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ulm.metaulm.xtext.ulmDsl2.LookupInt#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see org.ulm.metaulm.xtext.ulmDsl2.UlmDsl2Package#getLookupInt()
 * @model
 * @generated
 */
public interface LookupInt extends Lookup
{
  /**
   * Returns the value of the '<em><b>Values</b></em>' containment reference list.
   * The list contents are of type {@link org.ulm.metaulm.xtext.ulmDsl2.LookupIntValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' containment reference list.
   * @see org.ulm.metaulm.xtext.ulmDsl2.UlmDsl2Package#getLookupInt_Values()
   * @model containment="true"
   * @generated
   */
  EList<LookupIntValue> getValues();

} // LookupInt
