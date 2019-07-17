/**
 * generated by Xtext 2.18.0.M3
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delegation Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.DelegationConnector#getRole <em>Role</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.DelegationConnector#getInterface <em>Interface</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDelegationConnector()
 * @model
 * @generated
 */
public interface DelegationConnector extends EObject
{
  /**
   * Returns the value of the '<em><b>Role</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Role</em>' reference.
   * @see #setRole(Role)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDelegationConnector_Role()
   * @model
   * @generated
   */
  Role getRole();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.DelegationConnector#getRole <em>Role</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Role</em>' reference.
   * @see #getRole()
   * @generated
   */
  void setRole(Role value);

  /**
   * Returns the value of the '<em><b>Interface</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interface</em>' reference.
   * @see #setInterface(Interface)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDelegationConnector_Interface()
   * @model
   * @generated
   */
  Interface getInterface();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.DelegationConnector#getInterface <em>Interface</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interface</em>' reference.
   * @see #getInterface()
   * @generated
   */
  void setInterface(Interface value);

} // DelegationConnector