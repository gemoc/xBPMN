/**
 */
package org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Bpmn2Package;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ComplexGateway;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Expression;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.SequenceFlow;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complex Gateway</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.impl.ComplexGatewayImpl#getActivationCondition <em>Activation Condition</em>}</li>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.impl.ComplexGatewayImpl#getDefault <em>Default</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComplexGatewayImpl extends GatewayImpl implements ComplexGateway {
	/**
	 * The cached value of the '{@link #getActivationCondition() <em>Activation Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivationCondition()
	 * @generated
	 * @ordered
	 */
	protected Expression activationCondition;

	/**
	 * The cached value of the '{@link #getDefault() <em>Default</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected SequenceFlow default_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplexGatewayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.eINSTANCE.getComplexGateway();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getActivationCondition() {
		return activationCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivationCondition(Expression newActivationCondition, NotificationChain msgs) {
		Expression oldActivationCondition = activationCondition;
		activationCondition = newActivationCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Bpmn2Package.COMPLEX_GATEWAY__ACTIVATION_CONDITION, oldActivationCondition, newActivationCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActivationCondition(Expression newActivationCondition) {
		if (newActivationCondition != activationCondition) {
			NotificationChain msgs = null;
			if (activationCondition != null)
				msgs = ((InternalEObject)activationCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Bpmn2Package.COMPLEX_GATEWAY__ACTIVATION_CONDITION, null, msgs);
			if (newActivationCondition != null)
				msgs = ((InternalEObject)newActivationCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Bpmn2Package.COMPLEX_GATEWAY__ACTIVATION_CONDITION, null, msgs);
			msgs = basicSetActivationCondition(newActivationCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bpmn2Package.COMPLEX_GATEWAY__ACTIVATION_CONDITION, newActivationCondition, newActivationCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SequenceFlow getDefault() {
		if (default_ != null && default_.eIsProxy()) {
			InternalEObject oldDefault = (InternalEObject)default_;
			default_ = (SequenceFlow)eResolveProxy(oldDefault);
			if (default_ != oldDefault) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Bpmn2Package.COMPLEX_GATEWAY__DEFAULT, oldDefault, default_));
			}
		}
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceFlow basicGetDefault() {
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefault(SequenceFlow newDefault) {
		SequenceFlow oldDefault = default_;
		default_ = newDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bpmn2Package.COMPLEX_GATEWAY__DEFAULT, oldDefault, default_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Bpmn2Package.COMPLEX_GATEWAY__ACTIVATION_CONDITION:
				return basicSetActivationCondition(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Bpmn2Package.COMPLEX_GATEWAY__ACTIVATION_CONDITION:
				return getActivationCondition();
			case Bpmn2Package.COMPLEX_GATEWAY__DEFAULT:
				if (resolve) return getDefault();
				return basicGetDefault();
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
			case Bpmn2Package.COMPLEX_GATEWAY__ACTIVATION_CONDITION:
				setActivationCondition((Expression)newValue);
				return;
			case Bpmn2Package.COMPLEX_GATEWAY__DEFAULT:
				setDefault((SequenceFlow)newValue);
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
			case Bpmn2Package.COMPLEX_GATEWAY__ACTIVATION_CONDITION:
				setActivationCondition((Expression)null);
				return;
			case Bpmn2Package.COMPLEX_GATEWAY__DEFAULT:
				setDefault((SequenceFlow)null);
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
			case Bpmn2Package.COMPLEX_GATEWAY__ACTIVATION_CONDITION:
				return activationCondition != null;
			case Bpmn2Package.COMPLEX_GATEWAY__DEFAULT:
				return default_ != null;
		}
		return super.eIsSet(featureID);
	}

} //ComplexGatewayImpl
