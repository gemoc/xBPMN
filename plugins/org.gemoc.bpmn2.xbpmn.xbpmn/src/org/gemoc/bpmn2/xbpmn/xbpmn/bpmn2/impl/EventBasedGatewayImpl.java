/**
 */
package org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Bpmn2Package;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.EventBasedGateway;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.EventBasedGatewayType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Based Gateway</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.impl.EventBasedGatewayImpl#isInstantiate <em>Instantiate</em>}</li>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.impl.EventBasedGatewayImpl#getEventGatewayType <em>Event Gateway Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventBasedGatewayImpl extends GatewayImpl implements EventBasedGateway {
	/**
	 * The default value of the '{@link #isInstantiate() <em>Instantiate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInstantiate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INSTANTIATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInstantiate() <em>Instantiate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInstantiate()
	 * @generated
	 * @ordered
	 */
	protected boolean instantiate = INSTANTIATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEventGatewayType() <em>Event Gateway Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventGatewayType()
	 * @generated
	 * @ordered
	 */
	protected static final EventBasedGatewayType EVENT_GATEWAY_TYPE_EDEFAULT = EventBasedGatewayType.PARALLEL;

	/**
	 * The cached value of the '{@link #getEventGatewayType() <em>Event Gateway Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventGatewayType()
	 * @generated
	 * @ordered
	 */
	protected EventBasedGatewayType eventGatewayType = EVENT_GATEWAY_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventBasedGatewayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.eINSTANCE.getEventBasedGateway();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isInstantiate() {
		return instantiate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstantiate(boolean newInstantiate) {
		boolean oldInstantiate = instantiate;
		instantiate = newInstantiate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bpmn2Package.EVENT_BASED_GATEWAY__INSTANTIATE, oldInstantiate, instantiate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventBasedGatewayType getEventGatewayType() {
		return eventGatewayType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEventGatewayType(EventBasedGatewayType newEventGatewayType) {
		EventBasedGatewayType oldEventGatewayType = eventGatewayType;
		eventGatewayType = newEventGatewayType == null ? EVENT_GATEWAY_TYPE_EDEFAULT : newEventGatewayType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bpmn2Package.EVENT_BASED_GATEWAY__EVENT_GATEWAY_TYPE, oldEventGatewayType, eventGatewayType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Bpmn2Package.EVENT_BASED_GATEWAY__INSTANTIATE:
				return isInstantiate();
			case Bpmn2Package.EVENT_BASED_GATEWAY__EVENT_GATEWAY_TYPE:
				return getEventGatewayType();
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
			case Bpmn2Package.EVENT_BASED_GATEWAY__INSTANTIATE:
				setInstantiate((Boolean)newValue);
				return;
			case Bpmn2Package.EVENT_BASED_GATEWAY__EVENT_GATEWAY_TYPE:
				setEventGatewayType((EventBasedGatewayType)newValue);
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
			case Bpmn2Package.EVENT_BASED_GATEWAY__INSTANTIATE:
				setInstantiate(INSTANTIATE_EDEFAULT);
				return;
			case Bpmn2Package.EVENT_BASED_GATEWAY__EVENT_GATEWAY_TYPE:
				setEventGatewayType(EVENT_GATEWAY_TYPE_EDEFAULT);
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
			case Bpmn2Package.EVENT_BASED_GATEWAY__INSTANTIATE:
				return instantiate != INSTANTIATE_EDEFAULT;
			case Bpmn2Package.EVENT_BASED_GATEWAY__EVENT_GATEWAY_TYPE:
				return eventGatewayType != EVENT_GATEWAY_TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (instantiate: ");
		result.append(instantiate);
		result.append(", eventGatewayType: ");
		result.append(eventGatewayType);
		result.append(')');
		return result.toString();
	}

} //EventBasedGatewayImpl
