/**
 * generated by Xtext 2.18.0.M3
 */
package org.xtext.example.mydsl.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.xtext.example.mydsl.myDsl.AllocationContext;
import org.xtext.example.mydsl.myDsl.AssemblyContext;
import org.xtext.example.mydsl.myDsl.Component;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Role;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assembly Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.AssemblyContextImpl#getRequiredRole <em>Required Role</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.AssemblyContextImpl#getAllocationContext <em>Allocation Context</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.AssemblyContextImpl#getProvidedRole <em>Provided Role</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.AssemblyContextImpl#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssemblyContextImpl extends AbstractElementImpl implements AssemblyContext
{
  /**
   * The cached value of the '{@link #getRequiredRole() <em>Required Role</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequiredRole()
   * @generated
   * @ordered
   */
  protected EList<Role> requiredRole;

  /**
   * The cached value of the '{@link #getAllocationContext() <em>Allocation Context</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAllocationContext()
   * @generated
   * @ordered
   */
  protected AllocationContext allocationContext;

  /**
   * The cached value of the '{@link #getProvidedRole() <em>Provided Role</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProvidedRole()
   * @generated
   * @ordered
   */
  protected EList<Role> providedRole;

  /**
   * The cached value of the '{@link #getComponent() <em>Component</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponent()
   * @generated
   * @ordered
   */
  protected EList<Component> component;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AssemblyContextImpl()
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
    return MyDslPackage.Literals.ASSEMBLY_CONTEXT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Role> getRequiredRole()
  {
    if (requiredRole == null)
    {
      requiredRole = new EObjectResolvingEList<Role>(Role.class, this, MyDslPackage.ASSEMBLY_CONTEXT__REQUIRED_ROLE);
    }
    return requiredRole;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AllocationContext getAllocationContext()
  {
    if (allocationContext != null && allocationContext.eIsProxy())
    {
      InternalEObject oldAllocationContext = (InternalEObject)allocationContext;
      allocationContext = (AllocationContext)eResolveProxy(oldAllocationContext);
      if (allocationContext != oldAllocationContext)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.ASSEMBLY_CONTEXT__ALLOCATION_CONTEXT, oldAllocationContext, allocationContext));
      }
    }
    return allocationContext;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AllocationContext basicGetAllocationContext()
  {
    return allocationContext;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAllocationContext(AllocationContext newAllocationContext)
  {
    AllocationContext oldAllocationContext = allocationContext;
    allocationContext = newAllocationContext;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ASSEMBLY_CONTEXT__ALLOCATION_CONTEXT, oldAllocationContext, allocationContext));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Role> getProvidedRole()
  {
    if (providedRole == null)
    {
      providedRole = new EObjectResolvingEList<Role>(Role.class, this, MyDslPackage.ASSEMBLY_CONTEXT__PROVIDED_ROLE);
    }
    return providedRole;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Component> getComponent()
  {
    if (component == null)
    {
      component = new EObjectResolvingEList<Component>(Component.class, this, MyDslPackage.ASSEMBLY_CONTEXT__COMPONENT);
    }
    return component;
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
      case MyDslPackage.ASSEMBLY_CONTEXT__REQUIRED_ROLE:
        return getRequiredRole();
      case MyDslPackage.ASSEMBLY_CONTEXT__ALLOCATION_CONTEXT:
        if (resolve) return getAllocationContext();
        return basicGetAllocationContext();
      case MyDslPackage.ASSEMBLY_CONTEXT__PROVIDED_ROLE:
        return getProvidedRole();
      case MyDslPackage.ASSEMBLY_CONTEXT__COMPONENT:
        return getComponent();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.ASSEMBLY_CONTEXT__REQUIRED_ROLE:
        getRequiredRole().clear();
        getRequiredRole().addAll((Collection<? extends Role>)newValue);
        return;
      case MyDslPackage.ASSEMBLY_CONTEXT__ALLOCATION_CONTEXT:
        setAllocationContext((AllocationContext)newValue);
        return;
      case MyDslPackage.ASSEMBLY_CONTEXT__PROVIDED_ROLE:
        getProvidedRole().clear();
        getProvidedRole().addAll((Collection<? extends Role>)newValue);
        return;
      case MyDslPackage.ASSEMBLY_CONTEXT__COMPONENT:
        getComponent().clear();
        getComponent().addAll((Collection<? extends Component>)newValue);
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
      case MyDslPackage.ASSEMBLY_CONTEXT__REQUIRED_ROLE:
        getRequiredRole().clear();
        return;
      case MyDslPackage.ASSEMBLY_CONTEXT__ALLOCATION_CONTEXT:
        setAllocationContext((AllocationContext)null);
        return;
      case MyDslPackage.ASSEMBLY_CONTEXT__PROVIDED_ROLE:
        getProvidedRole().clear();
        return;
      case MyDslPackage.ASSEMBLY_CONTEXT__COMPONENT:
        getComponent().clear();
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
      case MyDslPackage.ASSEMBLY_CONTEXT__REQUIRED_ROLE:
        return requiredRole != null && !requiredRole.isEmpty();
      case MyDslPackage.ASSEMBLY_CONTEXT__ALLOCATION_CONTEXT:
        return allocationContext != null;
      case MyDslPackage.ASSEMBLY_CONTEXT__PROVIDED_ROLE:
        return providedRole != null && !providedRole.isEmpty();
      case MyDslPackage.ASSEMBLY_CONTEXT__COMPONENT:
        return component != null && !component.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //AssemblyContextImpl
