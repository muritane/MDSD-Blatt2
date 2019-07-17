/**
 * generated by Xtext 2.18.0.M3
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Component#getRequiredInterface <em>Required Interface</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Component#getRequiredService <em>Required Service</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Component#getProvidedInterface <em>Provided Interface</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Component#getProvidedService <em>Provided Service</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Component#getBehaviourDescription <em>Behaviour Description</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Component#getEncapsulatedAssemblyContext <em>Encapsulated Assembly Context</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends AbstractElement
{
  /**
   * Returns the value of the '<em><b>Required Interface</b></em>' reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Interface}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Required Interface</em>' reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getComponent_RequiredInterface()
   * @model
   * @generated
   */
  EList<Interface> getRequiredInterface();

  /**
   * Returns the value of the '<em><b>Required Service</b></em>' reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Service}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Required Service</em>' reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getComponent_RequiredService()
   * @model
   * @generated
   */
  EList<Service> getRequiredService();

  /**
   * Returns the value of the '<em><b>Provided Interface</b></em>' reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Interface}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Provided Interface</em>' reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getComponent_ProvidedInterface()
   * @model
   * @generated
   */
  EList<Interface> getProvidedInterface();

  /**
   * Returns the value of the '<em><b>Provided Service</b></em>' reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Service}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Provided Service</em>' reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getComponent_ProvidedService()
   * @model
   * @generated
   */
  EList<Service> getProvidedService();

  /**
   * Returns the value of the '<em><b>Behaviour Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Behaviour Description</em>' containment reference.
   * @see #setBehaviourDescription(BehaviorDescription)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getComponent_BehaviourDescription()
   * @model containment="true"
   * @generated
   */
  BehaviorDescription getBehaviourDescription();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Component#getBehaviourDescription <em>Behaviour Description</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Behaviour Description</em>' containment reference.
   * @see #getBehaviourDescription()
   * @generated
   */
  void setBehaviourDescription(BehaviorDescription value);

  /**
   * Returns the value of the '<em><b>Encapsulated Assembly Context</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Encapsulated Assembly Context</em>' containment reference.
   * @see #setEncapsulatedAssemblyContext(AssemblyContext)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getComponent_EncapsulatedAssemblyContext()
   * @model containment="true"
   * @generated
   */
  AssemblyContext getEncapsulatedAssemblyContext();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Component#getEncapsulatedAssemblyContext <em>Encapsulated Assembly Context</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Encapsulated Assembly Context</em>' containment reference.
   * @see #getEncapsulatedAssemblyContext()
   * @generated
   */
  void setEncapsulatedAssemblyContext(AssemblyContext value);

} // Component
