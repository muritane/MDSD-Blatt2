/**
 * generated by Xtext 2.18.0.M3
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Environment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.SystemEnvironment#getContainer <em>Container</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.SystemEnvironment#getLink <em>Link</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSystemEnvironment()
 * @model
 * @generated
 */
public interface SystemEnvironment extends AbstractElement
{
  /**
   * Returns the value of the '<em><b>Container</b></em>' reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Container}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Container</em>' reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSystemEnvironment_Container()
   * @model
   * @generated
   */
  EList<Container> getContainer();

  /**
   * Returns the value of the '<em><b>Link</b></em>' reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Link}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Link</em>' reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSystemEnvironment_Link()
   * @model
   * @generated
   */
  EList<Link> getLink();

} // SystemEnvironment
