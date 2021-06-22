/**
 */
package org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Bpmn2Package;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.CallActivity;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.CallableElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.impl.CallActivityImpl#getCalledElementRef <em>Called Element Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CallActivityImpl extends ActivityImpl implements CallActivity {
	/**
	 * The cached value of the '{@link #getCalledElementRef() <em>Called Element Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalledElementRef()
	 * @generated
	 * @ordered
	 */
	protected CallableElement calledElementRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.eINSTANCE.getCallActivity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CallableElement getCalledElementRef() {
		if (calledElementRef != null && calledElementRef.eIsProxy()) {
			InternalEObject oldCalledElementRef = (InternalEObject)calledElementRef;
			calledElementRef = (CallableElement)eResolveProxy(oldCalledElementRef);
			if (calledElementRef != oldCalledElementRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Bpmn2Package.CALL_ACTIVITY__CALLED_ELEMENT_REF, oldCalledElementRef, calledElementRef));
			}
		}
		return calledElementRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallableElement basicGetCalledElementRef() {
		return calledElementRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCalledElementRef(CallableElement newCalledElementRef) {
		CallableElement oldCalledElementRef = calledElementRef;
		calledElementRef = newCalledElementRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bpmn2Package.CALL_ACTIVITY__CALLED_ELEMENT_REF, oldCalledElementRef, calledElementRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Bpmn2Package.CALL_ACTIVITY__CALLED_ELEMENT_REF:
				if (resolve) return getCalledElementRef();
				return basicGetCalledElementRef();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Bpmn2Package.CALL_ACTIVITY__CALLED_ELEMENT_REF:
				setCalledElementRef((CallableElement)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case Bpmn2Package.CALL_ACTIVITY__CALLED_ELEMENT_REF:
				setCalledElementRef((CallableElement)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Bpmn2Package.CALL_ACTIVITY__CALLED_ELEMENT_REF:
				return calledElementRef != null;
		}
		return super.eIsSet(featureID);
	}

} //CallActivityImpl
