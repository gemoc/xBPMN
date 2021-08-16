/**
 */
package org.gemoc.bpsim2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.gemoc.bpsim2.Bpsim2Package;
import org.gemoc.bpsim2.Parameter;
import org.gemoc.bpsim2.PropertyParameters;
import org.gemoc.bpsim2.PropertyType1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Parameters</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.bpsim2.impl.PropertyParametersImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.impl.PropertyParametersImpl#getQueueLength <em>Queue Length</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyParametersImpl extends MinimalEObjectImpl.Container implements PropertyParameters {
	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyType1> property;

	/**
	 * The cached value of the '{@link #getQueueLength() <em>Queue Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueLength()
	 * @generated
	 * @ordered
	 */
	protected Parameter queueLength;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyParametersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpsim2Package.Literals.PROPERTY_PARAMETERS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyType1> getProperty() {
		if (property == null) {
			property = new EObjectContainmentEList<PropertyType1>(PropertyType1.class, this, Bpsim2Package.PROPERTY_PARAMETERS__PROPERTY);
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getQueueLength() {
		return queueLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQueueLength(Parameter newQueueLength, NotificationChain msgs) {
		Parameter oldQueueLength = queueLength;
		queueLength = newQueueLength;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Bpsim2Package.PROPERTY_PARAMETERS__QUEUE_LENGTH, oldQueueLength, newQueueLength);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueueLength(Parameter newQueueLength) {
		if (newQueueLength != queueLength) {
			NotificationChain msgs = null;
			if (queueLength != null)
				msgs = ((InternalEObject)queueLength).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Bpsim2Package.PROPERTY_PARAMETERS__QUEUE_LENGTH, null, msgs);
			if (newQueueLength != null)
				msgs = ((InternalEObject)newQueueLength).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Bpsim2Package.PROPERTY_PARAMETERS__QUEUE_LENGTH, null, msgs);
			msgs = basicSetQueueLength(newQueueLength, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bpsim2Package.PROPERTY_PARAMETERS__QUEUE_LENGTH, newQueueLength, newQueueLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Bpsim2Package.PROPERTY_PARAMETERS__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
			case Bpsim2Package.PROPERTY_PARAMETERS__QUEUE_LENGTH:
				return basicSetQueueLength(null, msgs);
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
			case Bpsim2Package.PROPERTY_PARAMETERS__PROPERTY:
				return getProperty();
			case Bpsim2Package.PROPERTY_PARAMETERS__QUEUE_LENGTH:
				return getQueueLength();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Bpsim2Package.PROPERTY_PARAMETERS__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends PropertyType1>)newValue);
				return;
			case Bpsim2Package.PROPERTY_PARAMETERS__QUEUE_LENGTH:
				setQueueLength((Parameter)newValue);
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
			case Bpsim2Package.PROPERTY_PARAMETERS__PROPERTY:
				getProperty().clear();
				return;
			case Bpsim2Package.PROPERTY_PARAMETERS__QUEUE_LENGTH:
				setQueueLength((Parameter)null);
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
			case Bpsim2Package.PROPERTY_PARAMETERS__PROPERTY:
				return property != null && !property.isEmpty();
			case Bpsim2Package.PROPERTY_PARAMETERS__QUEUE_LENGTH:
				return queueLength != null;
		}
		return super.eIsSet(featureID);
	}

} //PropertyParametersImpl
